package org.jon.lv.utils;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @Package org.jon.lv.utils.ServiceBean
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/6/15 9:51
 * version V1.0.0
 */
public class ServiceBean extends com.alibaba.dubbo.config.spring.ServiceBean {

    @PostConstruct
    public void init(){

        if(this.getRef() == null) {

            Class interfaceClass = getInterfaceClass();
            if( null == interfaceClass ){

                if( logger.isDebugEnabled() ){
                    logger.debug(" 没有注入服务接口或注入接口名称不是接口类名");
                    return;
                }
            }

            Map<String,Object> objectMap = getSpringContext().getBeansOfType(interfaceClass);
            if( objectMap == null || objectMap.isEmpty() ){
                if( logger.isDebugEnabled() ){
                    logger.debug(interfaceClass+" 没有找到实例,不能自动指定实例");
                }
            }
            else if( objectMap.size() > 1 ){

                if( logger.isDebugEnabled() ){
                    logger.debug(interfaceClass+" 实例个数多余1个 ,需要手动指定具体实例");
                }
            }
            else {

                for(Object object :  objectMap.values() ){

                    if(true){
                        setRef( object );
                        if( logger.isDebugEnabled() ){
                            logger.debug(" 自动为 "+interfaceClass+" 指定实例 "+ object );
                        }
                        break;
                    }
                }
            }
        }
    }
}


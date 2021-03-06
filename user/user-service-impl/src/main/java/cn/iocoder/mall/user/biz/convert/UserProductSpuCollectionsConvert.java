package cn.iocoder.mall.user.biz.convert;

import cn.iocoder.mall.product.api.message.ProductSpuCollectionMessage;
import cn.iocoder.mall.user.api.bo.UserProductSpuCollectionsBO;
import cn.iocoder.mall.user.api.dto.UserProductSpuCollectionsAddDTO;
import cn.iocoder.mall.user.api.dto.UserProductSpuCollectionsUpdateDTO;
import cn.iocoder.mall.user.biz.dataobject.UserProductSpuCollectionsDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 用户_商品_收藏记录表
 *
 * @author xiaofeng
 * @date 2019-07-01 20:23:30
 */
@Mapper
public interface UserProductSpuCollectionsConvert {

    UserProductSpuCollectionsConvert INSTANCE = Mappers.getMapper(UserProductSpuCollectionsConvert.class);

    /**
     * DTO convert DO
     * @param userSkuCollectionsAddDTO
     * @return
     */
    @Mappings({})
    UserProductSpuCollectionsDO convert(UserProductSpuCollectionsAddDTO userSkuCollectionsAddDTO);

    /**
     * update DTO convert DO
     * @param userProductSpuCollectionsUpdateDTO
     * @return
     */
    @Mappings({})
    UserProductSpuCollectionsDO convert(UserProductSpuCollectionsUpdateDTO userProductSpuCollectionsUpdateDTO);

    /**
     * DO Convert BO
     * @param userSkuCollectionsDO
     * @return
     */
    @Mappings({})
    UserProductSpuCollectionsBO convert(UserProductSpuCollectionsDO userSkuCollectionsDO);

    /**
     * DO List convert BO LIST
     * @param userSkuCollectionsDOS
     * @return
     */
    @Mappings({})
    List<UserProductSpuCollectionsBO> convert(List<UserProductSpuCollectionsDO> userSkuCollectionsDOS);

    /**
     *  消处数据转换
     * @param productSpuCollectionMessage
     * @return
     */
    @Mappings({})
    UserProductSpuCollectionsAddDTO convert(ProductSpuCollectionMessage productSpuCollectionMessage);


}

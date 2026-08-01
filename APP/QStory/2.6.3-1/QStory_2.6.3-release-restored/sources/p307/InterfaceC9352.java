package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9352 {
    default long getFeatures() {
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    default void mo14578(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (abstractC3730.f9516) {
            mo14577(abstractC3730, obj, type, j);
            return;
        }
        List listMo14657 = mo14657();
        abstractC3730.mo6559();
        int i = 0;
        if (mo14656(abstractC3730)) {
            int size = listMo14657.size();
            while (i < size) {
                if (i != 0) {
                    abstractC3730.mo6542();
                }
                AbstractC9323 abstractC9323 = (AbstractC9323) listMo14657.get(i);
                Object objMo14554 = abstractC9323.mo14554(obj);
                if (objMo14554 == null) {
                    abstractC3730.mo6527();
                } else {
                    abstractC9323.mo14553(abstractC3730, objMo14554.getClass()).m14655(abstractC3730, objMo14554);
                }
                i++;
            }
        } else {
            int size2 = listMo14657.size();
            while (i < size2) {
                if (i != 0) {
                    abstractC3730.mo6542();
                }
                ((AbstractC9323) listMo14657.get(i)).mo14557(abstractC3730, obj);
                i++;
            }
        }
        abstractC3730.mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    default AbstractC9323 mo14650(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    default void m14655(AbstractC3730 abstractC3730, Object obj) {
        mo6239(abstractC3730, obj, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    default boolean mo14656(AbstractC3730 abstractC3730) {
        return (abstractC3730.f9523.f9498 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    default void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        mo6239(abstractC3730, obj, obj2, type, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    default void mo14577(AbstractC3730 abstractC3730, Object obj, Type type, long j) {
        List listMo14657 = mo14657();
        int size = listMo14657.size();
        abstractC3730.mo6600(size);
        for (int i = 0; i < size; i++) {
            ((AbstractC9323) listMo14657.get(i)).mo14557(abstractC3730, obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    default List mo14657() {
        return Collections.EMPTY_LIST;
    }
}

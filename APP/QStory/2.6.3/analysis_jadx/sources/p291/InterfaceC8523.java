package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8523 {
    default long getFeatures() {
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    default void mo14019(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.f9171) {
            mo14018(abstractC2897, obj, type, j);
            return;
        }
        List listMo14098 = mo14098();
        abstractC2897.mo5999();
        int i = 0;
        if (mo14097(abstractC2897)) {
            int size = listMo14098.size();
            while (i < size) {
                if (i != 0) {
                    abstractC2897.mo5982();
                }
                AbstractC8494 abstractC8494 = (AbstractC8494) listMo14098.get(i);
                Object objMo13995 = abstractC8494.mo13995(obj);
                if (objMo13995 == null) {
                    abstractC2897.mo5967();
                } else {
                    abstractC8494.mo13994(abstractC2897, objMo13995.getClass()).m14096(abstractC2897, objMo13995);
                }
                i++;
            }
        } else {
            int size2 = listMo14098.size();
            while (i < size2) {
                if (i != 0) {
                    abstractC2897.mo5982();
                }
                ((AbstractC8494) listMo14098.get(i)).mo13998(abstractC2897, obj);
                i++;
            }
        }
        abstractC2897.mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    default AbstractC8494 mo14091(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    default void m14096(AbstractC2897 abstractC2897, Object obj) {
        mo5679(abstractC2897, obj, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    default boolean mo14097(AbstractC2897 abstractC2897) {
        return (abstractC2897.f9178.f9153 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    default void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        mo5679(abstractC2897, obj, obj2, type, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    default void mo14018(AbstractC2897 abstractC2897, Object obj, Type type, long j) {
        List listMo14098 = mo14098();
        int size = listMo14098.size();
        abstractC2897.mo6040(size);
        for (int i = 0; i < size; i++) {
            ((AbstractC8494) listMo14098.get(i)).mo13998(abstractC2897, obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    default List mo14098() {
        return Collections.EMPTY_LIST;
    }
}

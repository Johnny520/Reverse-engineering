package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8531 {
    default long getFeatures() {
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    default void mo14000(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.f9169) {
            mo13999(abstractC2896, obj, type, j);
            return;
        }
        List listMo14079 = mo14079();
        abstractC2896.mo5954();
        int i = 0;
        if (mo14078(abstractC2896)) {
            int size = listMo14079.size();
            while (i < size) {
                if (i != 0) {
                    abstractC2896.mo5937();
                }
                AbstractC8502 abstractC8502 = (AbstractC8502) listMo14079.get(i);
                Object objMo13976 = abstractC8502.mo13976(obj);
                if (objMo13976 == null) {
                    abstractC2896.mo5922();
                } else {
                    abstractC8502.mo13975(abstractC2896, objMo13976.getClass()).m14077(abstractC2896, objMo13976);
                }
                i++;
            }
        } else {
            int size2 = listMo14079.size();
            while (i < size2) {
                if (i != 0) {
                    abstractC2896.mo5937();
                }
                ((AbstractC8502) listMo14079.get(i)).mo13979(abstractC2896, obj);
                i++;
            }
        }
        abstractC2896.mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    default AbstractC8502 mo14072(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    default void m14077(AbstractC2896 abstractC2896, Object obj) {
        mo5634(abstractC2896, obj, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    default boolean mo14078(AbstractC2896 abstractC2896) {
        return (abstractC2896.f9176.f9151 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    default void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        mo5634(abstractC2896, obj, obj2, type, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    default void mo13999(AbstractC2896 abstractC2896, Object obj, Type type, long j) {
        List listMo14079 = mo14079();
        int size = listMo14079.size();
        abstractC2896.mo5995(size);
        for (int i = 0; i < size; i++) {
            ((AbstractC8502) listMo14079.get(i)).mo13979(abstractC2896, obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    default List mo14079() {
        return Collections.EMPTY_LIST;
    }
}

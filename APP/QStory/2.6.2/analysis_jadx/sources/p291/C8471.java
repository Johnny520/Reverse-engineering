package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8471 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f23453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f23455;

    public C8471(Class cls, Class cls2, long j) {
        this.f23455 = cls;
        this.f23454 = cls2;
        this.f23453 = j;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        AbstractC2896 abstractC28962;
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Class<?> cls = obj.getClass();
        if (abstractC2896.m6015(obj) && this.f23455 != cls) {
            abstractC2896.mo5997(AbstractC2866.m5898(cls));
        }
        List list = (List) obj;
        int size = list.size();
        abstractC2896.mo5995(size);
        boolean zM6030 = abstractC2896.m6030(JSONWriter$Feature.WriteEnumUsingToString);
        int i = 0;
        while (i < size) {
            Enum r4 = (Enum) list.get(i);
            if (r4 == null) {
                abstractC2896.mo5922();
                abstractC28962 = abstractC2896;
            } else {
                Class<?> cls2 = r4.getClass();
                if (cls2 != this.f23454) {
                    abstractC28962 = abstractC2896;
                    abstractC2896.m6031(cls2).mo5633(abstractC28962, r4, null, this.f23454, this.f23453 | j);
                } else {
                    abstractC28962 = abstractC2896;
                    abstractC28962.mo5972(zM6030 ? r4.toString() : r4.name());
                }
            }
            i++;
            abstractC2896 = abstractC28962;
        }
        abstractC2896.mo5950();
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        List list = (List) obj;
        abstractC2896.mo5954();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            String str = (String) list.get(i);
            if (str == null) {
                abstractC2896.mo5922();
            } else {
                abstractC2896.mo5972(str);
            }
        }
        abstractC2896.mo5950();
    }
}

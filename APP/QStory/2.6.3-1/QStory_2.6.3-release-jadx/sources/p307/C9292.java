package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9292 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f23789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f23791;

    public C9292(Class cls, Class cls2, long j) {
        this.f23791 = cls;
        this.f23790 = cls2;
        this.f23789 = j;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        AbstractC3730 abstractC37302;
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        Class<?> cls = obj.getClass();
        if (abstractC3730.m6621(obj) && this.f23791 != cls) {
            abstractC3730.mo6602(AbstractC3700.m6503(cls));
        }
        List list = (List) obj;
        int size = list.size();
        abstractC3730.mo6600(size);
        boolean zM6636 = abstractC3730.m6636(JSONWriter$Feature.WriteEnumUsingToString);
        int i = 0;
        while (i < size) {
            Enum r4 = (Enum) list.get(i);
            if (r4 == null) {
                abstractC3730.mo6527();
                abstractC37302 = abstractC3730;
            } else {
                Class<?> cls2 = r4.getClass();
                if (cls2 != this.f23790) {
                    abstractC37302 = abstractC3730;
                    abstractC3730.m6637(cls2).mo6238(abstractC37302, r4, null, this.f23790, this.f23789 | j);
                } else {
                    abstractC37302 = abstractC3730;
                    abstractC37302.mo6577(zM6636 ? r4.toString() : r4.name());
                }
            }
            i++;
            abstractC3730 = abstractC37302;
        }
        abstractC3730.mo6555();
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        List list = (List) obj;
        abstractC3730.mo6559();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                abstractC3730.mo6542();
            }
            String str = (String) list.get(i);
            if (str == null) {
                abstractC3730.mo6527();
            } else {
                abstractC3730.mo6577(str);
            }
        }
        abstractC3730.mo6555();
    }
}

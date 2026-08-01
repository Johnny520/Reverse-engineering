package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8463 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f23444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f23446;

    public C8463(Class cls, Class cls2, long j) {
        this.f23446 = cls;
        this.f23445 = cls2;
        this.f23444 = j;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        AbstractC2897 abstractC28972;
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        Class<?> cls = obj.getClass();
        if (abstractC2897.m6061(obj) && this.f23446 != cls) {
            abstractC2897.mo6042(AbstractC2867.m5943(cls));
        }
        List list = (List) obj;
        int size = list.size();
        abstractC2897.mo6040(size);
        boolean zM6076 = abstractC2897.m6076(JSONWriter$Feature.WriteEnumUsingToString);
        int i = 0;
        while (i < size) {
            Enum r4 = (Enum) list.get(i);
            if (r4 == null) {
                abstractC2897.mo5967();
                abstractC28972 = abstractC2897;
            } else {
                Class<?> cls2 = r4.getClass();
                if (cls2 != this.f23445) {
                    abstractC28972 = abstractC2897;
                    abstractC2897.m6077(cls2).mo5678(abstractC28972, r4, null, this.f23445, this.f23444 | j);
                } else {
                    abstractC28972 = abstractC2897;
                    abstractC28972.mo6017(zM6076 ? r4.toString() : r4.name());
                }
            }
            i++;
            abstractC2897 = abstractC28972;
        }
        abstractC2897.mo5995();
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        List list = (List) obj;
        abstractC2897.mo5999();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            String str = (String) list.get(i);
            if (str == null) {
                abstractC2897.mo5967();
            } else {
                abstractC2897.mo6017(str);
            }
        }
        abstractC2897.mo5995();
    }
}

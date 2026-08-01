package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8515 extends C8524 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f23655 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Comparable f23656;

    public C8515(Class cls, String str, String str2, String str3, long j, ArrayList arrayList) {
        super(cls, str, str2, j, arrayList);
        this.f23656 = str3;
    }

    @Override // p291.C8524
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject mo14092(Object obj, long j) {
        switch (this.f23655) {
            case 1:
                return JSONObject.of((String) this.f23656, (Object) super.mo14092(obj, j));
            default:
                return super.mo14092(obj, j);
        }
    }

    @Override // p291.C8524, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public AbstractC8494 mo14091(long j) {
        switch (this.f23655) {
            case 0:
                AbstractC8494 abstractC8494 = (AbstractC8494) this.f23656;
                if (j == abstractC8494.f23600) {
                    return abstractC8494;
                }
                return null;
            default:
                return super.mo14091(j);
        }
    }

    @Override // p291.C8524, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        switch (this.f23655) {
            case 1:
                abstractC2897.mo5997();
                abstractC2897.mo6031((String) this.f23656);
                super.mo5678(abstractC2897, obj, obj2, type, j);
                abstractC2897.mo5994();
                break;
            default:
                super.mo5678(abstractC2897, obj, obj2, type, j);
                break;
        }
    }

    @Override // p291.C8524, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        int i = this.f23655;
        Comparable comparable = this.f23656;
        switch (i) {
            case 0:
                long j2 = j | this.f23718;
                long j3 = abstractC2897.f9178.f9153 | j2;
                if (abstractC2897.f9171) {
                    if ((JSONWriter$Feature.BeanToArray.mask & j3) != 0) {
                        mo14018(abstractC2897, obj, type, j);
                        return;
                    } else {
                        mo5678(abstractC2897, obj, obj2, type, j);
                        return;
                    }
                }
                if ((JSONWriter$Feature.BeanToArray.mask & j3) != 0) {
                    mo14019(abstractC2897, obj, obj2, type, j);
                    return;
                }
                if (!this.f23719) {
                    if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                        m14101();
                        throw null;
                    }
                    if ((j3 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
                        abstractC2897.mo5967();
                        return;
                    }
                }
                if (mo14097(abstractC2897)) {
                    m14099(abstractC2897, obj, obj2, type, 0L);
                    return;
                }
                abstractC2897.mo5997();
                if ((j2 & JSONWriter$Feature.WriteClassName.mask) != 0 || abstractC2897.m6060(obj, j)) {
                    m14100(abstractC2897);
                }
                ((AbstractC8494) comparable).mo13999(abstractC2897, obj);
                abstractC2897.mo5994();
                return;
            default:
                abstractC2897.mo5997();
                abstractC2897.mo6031((String) comparable);
                abstractC2897.mo5979();
                super.mo5679(abstractC2897, obj, obj2, type, j);
                abstractC2897.mo5994();
                return;
        }
    }

    public C8515(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f23656 = (AbstractC8494) list.get(0);
    }
}

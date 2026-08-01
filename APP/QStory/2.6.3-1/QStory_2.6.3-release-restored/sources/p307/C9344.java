package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9344 extends C9353 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f24000 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Comparable f24001;

    public C9344(Class cls, String str, String str2, String str3, long j, ArrayList arrayList) {
        super(cls, str, str2, j, arrayList);
        this.f24001 = str3;
    }

    @Override // p307.C9353
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject mo14651(Object obj, long j) {
        switch (this.f24000) {
            case 1:
                return JSONObject.m9of((String) this.f24001, (Object) super.mo14651(obj, j));
            default:
                return super.mo14651(obj, j);
        }
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public AbstractC9323 mo14650(long j) {
        switch (this.f24000) {
            case 0:
                AbstractC9323 abstractC9323 = (AbstractC9323) this.f24001;
                if (j == abstractC9323.f23945) {
                    return abstractC9323;
                }
                return null;
            default:
                return super.mo14650(j);
        }
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        switch (this.f24000) {
            case 1:
                abstractC3730.mo6557();
                abstractC3730.mo6591((String) this.f24001);
                super.mo6238(abstractC3730, obj, obj2, type, j);
                abstractC3730.mo6554();
                break;
            default:
                super.mo6238(abstractC3730, obj, obj2, type, j);
                break;
        }
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        int i = this.f24000;
        Comparable comparable = this.f24001;
        switch (i) {
            case 0:
                long j2 = j | this.f24063;
                long j3 = abstractC3730.f9523.f9498 | j2;
                if (abstractC3730.f9516) {
                    if ((JSONWriter$Feature.BeanToArray.mask & j3) != 0) {
                        mo14577(abstractC3730, obj, type, j);
                        return;
                    } else {
                        mo6238(abstractC3730, obj, obj2, type, j);
                        return;
                    }
                }
                if ((JSONWriter$Feature.BeanToArray.mask & j3) != 0) {
                    mo14578(abstractC3730, obj, obj2, type, j);
                    return;
                }
                if (!this.f24064) {
                    if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                        m14660();
                        throw null;
                    }
                    if ((j3 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
                        abstractC3730.mo6527();
                        return;
                    }
                }
                if (mo14656(abstractC3730)) {
                    m14658(abstractC3730, obj, obj2, type, 0L);
                    return;
                }
                abstractC3730.mo6557();
                if ((j2 & JSONWriter$Feature.WriteClassName.mask) != 0 || abstractC3730.m6620(obj, j)) {
                    m14659(abstractC3730);
                }
                ((AbstractC9323) comparable).mo14558(abstractC3730, obj);
                abstractC3730.mo6554();
                return;
            default:
                abstractC3730.mo6557();
                abstractC3730.mo6591((String) comparable);
                abstractC3730.mo6539();
                super.mo6239(abstractC3730, obj, obj2, type, j);
                abstractC3730.mo6554();
                return;
        }
    }

    public C9344(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f24001 = (AbstractC9323) list.get(0);
    }
}

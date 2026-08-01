package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9343 extends C9353 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC9323 f23998;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC9323 f23999;

    public C9343(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f23998 = (AbstractC9323) list.get(0);
        this.f23999 = (AbstractC9323) list.get(1);
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final AbstractC9323 mo14650(long j) {
        AbstractC9323 abstractC9323 = this.f23998;
        if (j == abstractC9323.f23945) {
            return abstractC9323;
        }
        AbstractC9323 abstractC93232 = this.f23999;
        if (j == abstractC93232.f23945) {
            return abstractC93232;
        }
        return null;
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        long j2 = this.f24063 | j;
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
        if ((JSONWriter$Feature.WriteClassName.mask & j2) != 0 || abstractC3730.m6620(obj, j)) {
            m14659(abstractC3730);
        }
        this.f23998.mo14558(abstractC3730, obj);
        this.f23999.mo14558(abstractC3730, obj);
        abstractC3730.mo6554();
    }
}

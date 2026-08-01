package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9347 extends C9353 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC9323 f24025;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC9323 f24026;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC9323 f24027;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC9323 f24028;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC9323 f24029;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC9323 f24030;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC9323 f24031;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC9323 f24032;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC9323 f24033;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC9323 f24034;

    public C9347(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f24030 = (AbstractC9323) list.get(0);
        this.f24033 = (AbstractC9323) list.get(1);
        this.f24034 = (AbstractC9323) list.get(2);
        this.f24031 = (AbstractC9323) list.get(3);
        this.f24032 = (AbstractC9323) list.get(4);
        this.f24029 = (AbstractC9323) list.get(5);
        this.f24028 = (AbstractC9323) list.get(6);
        this.f24027 = (AbstractC9323) list.get(7);
        this.f24026 = (AbstractC9323) list.get(8);
        this.f24025 = (AbstractC9323) list.get(9);
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final AbstractC9323 mo14650(long j) {
        AbstractC9323 abstractC9323 = this.f24030;
        if (j == abstractC9323.f23945) {
            return abstractC9323;
        }
        AbstractC9323 abstractC93232 = this.f24033;
        if (j == abstractC93232.f23945) {
            return abstractC93232;
        }
        AbstractC9323 abstractC93233 = this.f24034;
        if (j == abstractC93233.f23945) {
            return abstractC93233;
        }
        AbstractC9323 abstractC93234 = this.f24031;
        if (j == abstractC93234.f23945) {
            return abstractC93234;
        }
        AbstractC9323 abstractC93235 = this.f24032;
        if (j == abstractC93235.f23945) {
            return abstractC93235;
        }
        AbstractC9323 abstractC93236 = this.f24029;
        if (j == abstractC93236.f23945) {
            return abstractC93236;
        }
        AbstractC9323 abstractC93237 = this.f24028;
        if (j == abstractC93237.f23945) {
            return abstractC93237;
        }
        AbstractC9323 abstractC93238 = this.f24027;
        if (j == abstractC93238.f23945) {
            return abstractC93238;
        }
        AbstractC9323 abstractC93239 = this.f24026;
        if (j == abstractC93239.f23945) {
            return abstractC93239;
        }
        AbstractC9323 abstractC932310 = this.f24025;
        if (j == abstractC932310.f23945) {
            return abstractC932310;
        }
        return null;
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        long j2 = j | this.f24063;
        long j3 = j2 | abstractC3730.f9523.f9498;
        boolean z = (JSONWriter$Feature.BeanToArray.mask & j3) != 0;
        if (abstractC3730.f9516) {
            if (z) {
                mo14577(abstractC3730, obj, type, j);
                return;
            } else {
                mo6238(abstractC3730, obj, obj2, type, j);
                return;
            }
        }
        if (z) {
            mo14578(abstractC3730, obj, obj2, type, j2);
            return;
        }
        if (!this.f24064) {
            if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                m14660();
                throw null;
            }
            if ((JSONWriter$Feature.IgnoreNoneSerializable.mask & j3) != 0) {
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
        this.f24030.mo14558(abstractC3730, obj);
        this.f24033.mo14558(abstractC3730, obj);
        this.f24034.mo14558(abstractC3730, obj);
        this.f24031.mo14558(abstractC3730, obj);
        this.f24032.mo14558(abstractC3730, obj);
        this.f24029.mo14558(abstractC3730, obj);
        this.f24028.mo14558(abstractC3730, obj);
        this.f24027.mo14558(abstractC3730, obj);
        this.f24026.mo14558(abstractC3730, obj);
        this.f24025.mo14558(abstractC3730, obj);
        abstractC3730.mo6554();
    }
}

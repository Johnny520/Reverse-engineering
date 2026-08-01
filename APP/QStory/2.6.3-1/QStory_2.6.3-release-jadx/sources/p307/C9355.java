package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9355 extends C9353 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC9323 f24081;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC9323 f24082;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC9323 f24083;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC9323 f24084;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC9323 f24085;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC9323 f24086;

    public C9355(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f24082 = (AbstractC9323) list.get(0);
        this.f24085 = (AbstractC9323) list.get(1);
        this.f24086 = (AbstractC9323) list.get(2);
        this.f24083 = (AbstractC9323) list.get(3);
        this.f24084 = (AbstractC9323) list.get(4);
        this.f24081 = (AbstractC9323) list.get(5);
    }

    @Override // p307.C9353, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final AbstractC9323 mo14650(long j) {
        AbstractC9323 abstractC9323 = this.f24082;
        if (j == abstractC9323.f23945) {
            return abstractC9323;
        }
        AbstractC9323 abstractC93232 = this.f24085;
        if (j == abstractC93232.f23945) {
            return abstractC93232;
        }
        AbstractC9323 abstractC93233 = this.f24086;
        if (j == abstractC93233.f23945) {
            return abstractC93233;
        }
        AbstractC9323 abstractC93234 = this.f24083;
        if (j == abstractC93234.f23945) {
            return abstractC93234;
        }
        AbstractC9323 abstractC93235 = this.f24084;
        if (j == abstractC93235.f23945) {
            return abstractC93235;
        }
        AbstractC9323 abstractC93236 = this.f24081;
        if (j == abstractC93236.f23945) {
            return abstractC93236;
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
        this.f24082.mo14558(abstractC3730, obj);
        this.f24085.mo14558(abstractC3730, obj);
        this.f24086.mo14558(abstractC3730, obj);
        this.f24083.mo14558(abstractC3730, obj);
        this.f24084.mo14558(abstractC3730, obj);
        this.f24081.mo14558(abstractC3730, obj);
        abstractC3730.mo6554();
    }
}

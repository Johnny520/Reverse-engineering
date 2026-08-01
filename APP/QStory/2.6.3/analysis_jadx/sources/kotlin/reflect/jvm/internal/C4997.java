package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.InterfaceC5113;
import kotlin.reflect.InterfaceC5114;
import kotlin.reflect.jvm.internal.impl.km.C4536;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4997 extends C4965 implements InterfaceC5114 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f14415;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4997(AbstractC5003 abstractC5003, String str, Object obj, C4536 c4536) {
        super(abstractC5003, str, obj, c4536);
        abstractC5003.getClass();
        str.getClass();
        c4536.getClass();
        this.f14415 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 9));
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final InterfaceC5109 getSetter() {
        return (C4996) this.f14415.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5114, kotlin.reflect.InterfaceC5107
    public final InterfaceC5113 getSetter() {
        return (C4996) this.f14415.getValue();
    }
}

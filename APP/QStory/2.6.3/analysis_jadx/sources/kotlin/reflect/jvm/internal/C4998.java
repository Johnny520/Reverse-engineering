package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.jvm.internal.impl.km.C4536;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4998 extends C4984 implements InterfaceC5107 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f14416;

    public C4998(AbstractC5003 abstractC5003, String str, Object obj, C4536 c4536) {
        super(abstractC5003, str, obj, c4536);
        this.f14416 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 11));
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final InterfaceC5109 getSetter() {
        return (C4999) this.f14416.getValue();
    }
}

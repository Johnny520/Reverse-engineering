package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.InterfaceC5113;
import kotlin.reflect.jvm.internal.impl.km.C4535;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4996 extends C4964 implements InterfaceC5113 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f14413;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4996(AbstractC5002 abstractC5002, String str, Object obj, C4535 c4535) {
        super(abstractC5002, str, obj, c4535);
        abstractC5002.getClass();
        str.getClass();
        c4535.getClass();
        this.f14413 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 9));
    }

    @Override // kotlin.reflect.InterfaceC5106
    public final InterfaceC5108 getSetter() {
        return (C4995) this.f14413.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5113, kotlin.reflect.InterfaceC5106
    public final InterfaceC5112 getSetter() {
        return (C4995) this.f14413.getValue();
    }
}

package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.jvm.internal.impl.km.C4536;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4995 extends C4983 implements InterfaceC5112 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f14413;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4995(AbstractC5003 abstractC5003, String str, Object obj, C4536 c4536) {
        super(abstractC5003, str, obj, c4536);
        str.getClass();
        c4536.getClass();
        this.f14413 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 10));
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final InterfaceC5109 getSetter() {
        return (C4994) this.f14413.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5112
    public final void set(Object obj, Object obj2) {
        ((C4994) this.f14413.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.InterfaceC5112, kotlin.reflect.InterfaceC5107
    public final InterfaceC5111 getSetter() {
        return (C4994) this.f14413.getValue();
    }
}

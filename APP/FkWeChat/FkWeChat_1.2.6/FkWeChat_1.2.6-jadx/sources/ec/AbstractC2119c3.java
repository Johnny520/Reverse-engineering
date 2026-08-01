package ec;

import p145jc.AbstractC3810i;
import p145jc.C3808h;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: ec.c3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2119c3 {
    /* JADX INFO: renamed from: a */
    public static final Object m7722a(InterfaceC5976f interfaceC5976f) {
        Object objM24992g;
        InterfaceC5980j context = interfaceC5976f.getContext();
        AbstractC2210z1.m7959l(context);
        InterfaceC5976f interfaceC5976fM24989d = AbstractC6324b.m24989d(interfaceC5976f);
        C3808h c3808h = interfaceC5976fM24989d instanceof C3808h ? (C3808h) interfaceC5976fM24989d : null;
        if (c3808h == null) {
            objM24992g = C4700i0.f13910a;
        } else {
            if (AbstractC3810i.m15181d(c3808h.f10981t, context)) {
                c3808h.m15172k(context, C4700i0.f13910a);
            } else {
                C2114b3 c2114b3 = new C2114b3();
                InterfaceC5980j interfaceC5980jMo1651c0 = context.mo1651c0(c2114b3);
                C4700i0 c4700i0 = C4700i0.f13910a;
                c3808h.m15172k(interfaceC5980jMo1651c0, c4700i0);
                objM24992g = (!c2114b3.f5917r || AbstractC3810i.m15182e(c3808h)) ? AbstractC6325c.m24992g() : c4700i0;
            }
            objM24992g = AbstractC6325c.m24992g();
        }
        if (objM24992g == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM24992g == AbstractC6325c.m24992g() ? objM24992g : C4700i0.f13910a;
    }
}

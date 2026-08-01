package p130ic;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1064u0;
import p113hc.InterfaceC2974d;
import p145jc.AbstractC3815k0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6532a;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: ic.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3388f {
    /* JADX INFO: renamed from: b */
    public static final Object m12734b(InterfaceC5980j interfaceC5980j, Object obj, Object obj2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        Object objM15198f = AbstractC3815k0.m15198f(interfaceC5980j, obj2);
        try {
            C3405w c3405w = new C3405w(interfaceC5976f, interfaceC5980j);
            Object objM24990e = !(interfaceC0188p instanceof AbstractC6532a) ? AbstractC6324b.m24990e(interfaceC0188p, obj, c3405w) : ((InterfaceC0188p) AbstractC1064u0.m3858f(interfaceC0188p, 2)).invoke(obj, c3405w);
            AbstractC3815k0.m15196d(interfaceC5980j, objM15198f);
            if (objM24990e == AbstractC6325c.m24992g()) {
                AbstractC6539h.m25860c(interfaceC5976f);
            }
            return objM24990e;
        } catch (Throwable th) {
            AbstractC3815k0.m15196d(interfaceC5980j, objM15198f);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m12735c(InterfaceC5980j interfaceC5980j, Object obj, Object obj2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = AbstractC3815k0.m15197e(interfaceC5980j);
        }
        return m12734b(interfaceC5980j, obj, obj2, interfaceC0188p, interfaceC5976f);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2974d m12736d(InterfaceC2974d interfaceC2974d, InterfaceC5980j interfaceC5980j) {
        return ((interfaceC2974d instanceof C3404v) || (interfaceC2974d instanceof C3397o)) ? interfaceC2974d : new C3407y(interfaceC2974d, interfaceC5980j);
    }
}

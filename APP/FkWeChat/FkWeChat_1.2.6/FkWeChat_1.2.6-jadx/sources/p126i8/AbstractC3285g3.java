package p126i8;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p034c7.InterfaceC1355b;
import p035c8.C1399a;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p157k8.C4100l1;
import p157k8.C4137q3;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p281t6.C8173z;
import p375zc.AbstractC9957l;

/* JADX INFO: renamed from: i8.g3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3285g3 {
    /* JADX INFO: renamed from: a */
    public static final Object m12410a(InterfaceC1355b interfaceC1355b, C8173z c8173z, int i10, String str, InterfaceC5976f interfaceC5976f) {
        interfaceC1355b.mo5371k().mo12260b(c8173z);
        C4137q3 c4137q3 = new C4137q3(i10, str, (AbstractC9957l) null, 4, (AbstractC1043k) null);
        InterfaceC2560n interfaceC2560nM3817l = null;
        C4100l1 c4100l1 = new C4100l1(null, c4137q3);
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(C4100l1.class);
        try {
            interfaceC2560nM3817l = AbstractC1052o0.m3817l(C4100l1.class);
        } catch (Throwable unused) {
        }
        Object objMo5368V = interfaceC1355b.mo5368V(c4100l1, new C1399a(interfaceC2549cM3807b, interfaceC2560nM3817l), interfaceC5976f);
        return objMo5368V == AbstractC6325c.m24992g() ? objMo5368V : C4700i0.f13910a;
    }
}

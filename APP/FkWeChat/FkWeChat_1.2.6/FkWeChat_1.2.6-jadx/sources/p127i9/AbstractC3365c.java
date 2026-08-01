package p127i9;

import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1052o0;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2550d;
import p098g9.InterfaceC2560n;
import p098g9.InterfaceC2561o;
import p142j9.C3751v2;
import p185m8.AbstractC5081g0;
import p229p9.EnumC5998f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;

/* JADX INFO: renamed from: i9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3365c {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2549c m12577a(InterfaceC2550d interfaceC2550d) {
        Object obj;
        InterfaceC2549c interfaceC2549cM12578b;
        interfaceC2550d.getClass();
        if (interfaceC2550d instanceof InterfaceC2549c) {
            return (InterfaceC2549c) interfaceC2550d;
        }
        if (!(interfaceC2550d instanceof InterfaceC2561o)) {
            C3364b.m12576a("Cannot calculate JVM erasure for type: ", interfaceC2550d);
            return null;
        }
        List upperBounds = ((InterfaceC2561o) interfaceC2550d).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC2560n interfaceC2560n = (InterfaceC2560n) next;
            interfaceC2560n.getClass();
            InterfaceC6004h interfaceC6004hMo5602u = ((C3751v2) interfaceC2560n).m13878o().mo9332T0().mo5602u();
            InterfaceC5995e interfaceC5995e = interfaceC6004hMo5602u instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo5602u : null;
            if (interfaceC5995e != null && interfaceC5995e.mo5588j() != EnumC5998f.f18949s && interfaceC5995e.mo5588j() != EnumC5998f.f18952v) {
                obj = next;
                break;
            }
        }
        InterfaceC2560n interfaceC2560n2 = (InterfaceC2560n) obj;
        if (interfaceC2560n2 == null) {
            interfaceC2560n2 = (InterfaceC2560n) AbstractC5081g0.m20578l0(upperBounds);
        }
        return (interfaceC2560n2 == null || (interfaceC2549cM12578b = m12578b(interfaceC2560n2)) == null) ? AbstractC1052o0.m3807b(Object.class) : interfaceC2549cM12578b;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2549c m12578b(InterfaceC2560n interfaceC2560n) {
        InterfaceC2549c interfaceC2549cM12577a;
        interfaceC2560n.getClass();
        InterfaceC2550d interfaceC2550dMo3877e = interfaceC2560n.mo3877e();
        if (interfaceC2550dMo3877e != null && (interfaceC2549cM12577a = m12577a(interfaceC2550dMo3877e)) != null) {
            return interfaceC2549cM12577a;
        }
        C3364b.m12576a("Cannot calculate JVM erasure for type: ", interfaceC2560n);
        return null;
    }
}

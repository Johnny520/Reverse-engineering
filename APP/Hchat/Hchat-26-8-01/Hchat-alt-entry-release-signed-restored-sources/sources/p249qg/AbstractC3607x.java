package p249qg;

import p263rg.C3808e;
import p353xg.C5808e;
import vg.AbstractC4564m;
import vg.AbstractC4570s;

/* JADX INFO: renamed from: qg.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3607x {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3609y f11636a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        InterfaceC3609y interfaceC3609y;
        int i9 = AbstractC4570s.f15055a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C5808e c5808e = AbstractC3553c0.f11555a;
            C3808e c3808e = AbstractC4564m.f15049a;
            C3808e c3808e2 = c3808e.f12497l;
            interfaceC3609y = c3808e;
            if (c3808e == null) {
                interfaceC3609y = RunnableC3605w.f11630p;
            }
        } else {
            interfaceC3609y = RunnableC3605w.f11630p;
        }
        f11636a = interfaceC3609y;
    }
}

package p151k6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p194n6.C2901a;

/* JADX INFO: renamed from: k6.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2305n implements InterfaceC1623o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7626g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC1622n f7627h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2305n(AbstractC1622n abstractC1622n, int i9) {
        this.f7626g = i9;
        this.f7627h = abstractC1622n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        switch (this.f7626g) {
            case 0:
                if (c2901a.f9368a == Number.class) {
                    return (C2307o) this.f7627h;
                }
                return null;
            default:
                Class cls = c2901a.f9368a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C2312q0) this.f7627h;
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f7626g) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C2312q0) this.f7627h) + "]";
            default:
                return super.toString();
        }
    }
}

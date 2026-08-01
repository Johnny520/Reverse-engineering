package p235q1;

import p017b2.C0931a;
import p017b2.InterfaceC0932b;
import p024b9.AbstractC1043k;
import p166l2.AbstractC4549i;
import p166l2.InterfaceC4545h;
import p179m2.AbstractC4870l1;
import p376zd.C10010p0;

/* JADX INFO: renamed from: q1.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6214l0 {

    /* JADX INFO: renamed from: a */
    public static final a f19289a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final int f19290b = m24446e(1);

    /* JADX INFO: renamed from: c */
    public static final int f19291c = m24446e(0);

    /* JADX INFO: renamed from: d */
    public static final int f19292d = m24446e(2);

    /* JADX INFO: renamed from: d */
    public static final boolean m24445d(int i10, InterfaceC4545h interfaceC4545h) {
        if (m24447f(i10, f19290b)) {
            return true;
        }
        if (m24447f(i10, f19291c)) {
            return !C0931a.m3436f(((InterfaceC0932b) AbstractC4549i.m17816a(interfaceC4545h, AbstractC4870l1.m19446k())).mo3442a(), C0931a.f2894b.m3441b());
        }
        if (m24447f(i10, f19292d)) {
            return false;
        }
        C10010p0.m38820a("Unknown Focusability");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m24447f(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: q1.l0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m24448a() {
            return AbstractC6214l0.f19290b;
        }

        /* JADX INFO: renamed from: b */
        public final int m24449b() {
            return AbstractC6214l0.f19292d;
        }

        /* JADX INFO: renamed from: c */
        public final int m24450c() {
            return AbstractC6214l0.f19291c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m24446e(int i10) {
        return i10;
    }
}

package p241q7;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p281t6.C8173z;
import p281t6.InterfaceC8141d0;

/* JADX INFO: renamed from: q7.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6301m {

    /* JADX INFO: renamed from: b */
    public static final a f19755b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final b f19756c;

    /* JADX INFO: renamed from: d */
    public static final b f19757d;

    /* JADX INFO: renamed from: e */
    public static final b f19758e;

    /* JADX INFO: renamed from: f */
    public static final b f19759f;

    /* JADX INFO: renamed from: g */
    public static final b f19760g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC6301m f19761h;

    /* JADX INFO: renamed from: i */
    public static final AbstractC6301m f19762i;

    /* JADX INFO: renamed from: j */
    public static final AbstractC6301m f19763j;

    /* JADX INFO: renamed from: k */
    public static final AbstractC6301m f19764k;

    /* JADX INFO: renamed from: l */
    public static final AbstractC6301m f19765l;

    /* JADX INFO: renamed from: a */
    public final boolean f19766a;

    /* JADX INFO: renamed from: q7.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6301m {

        /* JADX INFO: renamed from: m */
        public final double f19767m;

        /* JADX INFO: renamed from: n */
        public final C8173z f19768n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(double d10, C8173z c8173z) {
            super(false, null);
            c8173z.getClass();
            this.f19767m = d10;
            this.f19768n = c8173z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f19767m, bVar.f19767m) == 0 && AbstractC1061t.m3842c(this.f19768n, bVar.f19768n);
        }

        /* JADX INFO: renamed from: h */
        public final C8173z m24924h() {
            return this.f19768n;
        }

        public int hashCode() {
            return (Double.hashCode(this.f19767m) * 31) + this.f19768n.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final double m24925i() {
            return this.f19767m;
        }

        public String toString() {
            return "Failure(quality=" + this.f19767m + ", failureStatusCode=" + this.f19768n + ')';
        }
    }

    static {
        C8173z.a aVar = C8173z.f27462s;
        f19756c = new b(0.0d, aVar.m31822x());
        f19757d = new b(0.0d, aVar.m31822x());
        f19758e = new b(0.02d, aVar.m31815q());
        f19759f = new b(0.01d, aVar.m31801c());
        f19760g = new b(0.01d, aVar.m31821w());
        f19761h = new c(0.2d, null, 0, 6, null);
        f19762i = new c(1.0d, null, 0, 6, null);
        f19763j = new c(-1.0d, null, 0, 6, null);
        f19764k = new c(1.0d, null, 1, 2, null);
        f19765l = new c(0.5d, null, 1, 2, null);
    }

    public AbstractC6301m(boolean z10) {
        this.f19766a = z10;
    }

    /* JADX INFO: renamed from: q7.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC6301m m24917a() {
            return AbstractC6301m.f19762i;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC6301m m24918b() {
            return AbstractC6301m.f19764k;
        }

        /* JADX INFO: renamed from: c */
        public final b m24919c() {
            return AbstractC6301m.f19758e;
        }

        /* JADX INFO: renamed from: d */
        public final b m24920d() {
            return AbstractC6301m.f19757d;
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC6301m m24921e() {
            return AbstractC6301m.f19761h;
        }

        /* JADX INFO: renamed from: f */
        public final AbstractC6301m m24922f() {
            return AbstractC6301m.f19763j;
        }

        /* JADX INFO: renamed from: g */
        public final AbstractC6301m m24923g() {
            return AbstractC6301m.f19765l;
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC6301m(boolean z10, AbstractC1043k abstractC1043k) {
        this(z10);
    }

    /* JADX INFO: renamed from: q7.m$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6301m {

        /* JADX INFO: renamed from: m */
        public final double f19769m;

        /* JADX INFO: renamed from: n */
        public final InterfaceC8141d0 f19770n;

        /* JADX INFO: renamed from: o */
        public final int f19771o;

        public /* synthetic */ c(double d10, InterfaceC8141d0 interfaceC8141d0, int i10, int i11, AbstractC1043k abstractC1043k) {
            this(d10, (i11 & 2) != 0 ? InterfaceC8141d0.f27267b.m31612a() : interfaceC8141d0, (i11 & 4) != 0 ? 0 : i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.f19769m, cVar.f19769m) == 0 && AbstractC1061t.m3842c(this.f19770n, cVar.f19770n) && this.f19771o == cVar.f19771o;
        }

        /* JADX INFO: renamed from: h */
        public final InterfaceC8141d0 m24926h() {
            return this.f19770n;
        }

        public int hashCode() {
            return (((Double.hashCode(this.f19769m) * 31) + this.f19770n.hashCode()) * 31) + Integer.hashCode(this.f19771o);
        }

        /* JADX INFO: renamed from: i */
        public final double m24927i() {
            return this.f19769m;
        }

        /* JADX INFO: renamed from: j */
        public final int m24928j() {
            return this.f19771o;
        }

        public String toString() {
            return "Success(quality=" + this.f19769m + ", parameters=" + this.f19770n + ", segmentIncrement=" + this.f19771o + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(double d10, InterfaceC8141d0 interfaceC8141d0, int i10) {
            super(true, null);
            interfaceC8141d0.getClass();
            this.f19769m = d10;
            this.f19770n = interfaceC8141d0;
            this.f19771o = i10;
        }
    }
}

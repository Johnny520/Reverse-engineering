package p098g9;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p215oc.C5729x;

/* JADX INFO: renamed from: g9.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2562p {

    /* JADX INFO: renamed from: c */
    public static final a f6818c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final C2562p f6819d = new C2562p(null, null);

    /* JADX INFO: renamed from: a */
    public final EnumC2563q f6820a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2560n f6821b;

    /* JADX INFO: renamed from: g9.p$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6822a;

        static {
            int[] iArr = new int[EnumC2563q.values().length];
            try {
                iArr[EnumC2563q.f6823q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2563q.f6824r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2563q.f6825s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6822a = iArr;
        }
    }

    public C2562p(EnumC2563q enumC2563q, InterfaceC2560n interfaceC2560n) {
        String str;
        this.f6820a = enumC2563q;
        this.f6821b = interfaceC2560n;
        if ((enumC2563q == null) == (interfaceC2560n == null)) {
            return;
        }
        if (enumC2563q == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC2563q + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* JADX INFO: renamed from: a */
    public final EnumC2563q m9082a() {
        return this.f6820a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2560n m9083b() {
        return this.f6821b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2560n m9084c() {
        return this.f6821b;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC2563q m9085d() {
        return this.f6820a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2562p)) {
            return false;
        }
        C2562p c2562p = (C2562p) obj;
        return this.f6820a == c2562p.f6820a && AbstractC1061t.m3842c(this.f6821b, c2562p.f6821b);
    }

    public int hashCode() {
        EnumC2563q enumC2563q = this.f6820a;
        int iHashCode = (enumC2563q == null ? 0 : enumC2563q.hashCode()) * 31;
        InterfaceC2560n interfaceC2560n = this.f6821b;
        return iHashCode + (interfaceC2560n != null ? interfaceC2560n.hashCode() : 0);
    }

    public String toString() {
        EnumC2563q enumC2563q = this.f6820a;
        int i10 = enumC2563q == null ? -1 : b.f6822a[enumC2563q.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f6821b);
        }
        if (i10 == 2) {
            return "in " + this.f6821b;
        }
        if (i10 != 3) {
            C5729x.m23182a();
            return null;
        }
        return "out " + this.f6821b;
    }

    /* JADX INFO: renamed from: g9.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2562p m9086a(InterfaceC2560n interfaceC2560n) {
            interfaceC2560n.getClass();
            return new C2562p(EnumC2563q.f6824r, interfaceC2560n);
        }

        /* JADX INFO: renamed from: b */
        public final C2562p m9087b(InterfaceC2560n interfaceC2560n) {
            interfaceC2560n.getClass();
            return new C2562p(EnumC2563q.f6825s, interfaceC2560n);
        }

        /* JADX INFO: renamed from: c */
        public final C2562p m9088c() {
            return C2562p.f6819d;
        }

        /* JADX INFO: renamed from: d */
        public final C2562p m9089d(InterfaceC2560n interfaceC2560n) {
            interfaceC2560n.getClass();
            return new C2562p(EnumC2563q.f6823q, interfaceC2560n);
        }

        public a() {
        }
    }
}

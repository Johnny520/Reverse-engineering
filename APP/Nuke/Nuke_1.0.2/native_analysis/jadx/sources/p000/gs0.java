package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 {

    /* JADX INFO: renamed from: d */
    public static final C0505no f3686d;

    /* JADX INFO: renamed from: e */
    public static final C0505no f3687e;

    /* JADX INFO: renamed from: f */
    public static final C0505no f3688f;

    /* JADX INFO: renamed from: g */
    public static final C0505no f3689g;

    /* JADX INFO: renamed from: h */
    public static final C0505no f3690h;

    /* JADX INFO: renamed from: i */
    public static final C0505no f3691i;

    /* JADX INFO: renamed from: a */
    public final C0505no f3692a;

    /* JADX INFO: renamed from: b */
    public final C0505no f3693b;

    /* JADX INFO: renamed from: c */
    public final int f3694c;

    static {
        C0505no c0505no = C0505no.f7266k;
        f3686d = C0160eb.m1321z(":");
        f3687e = C0160eb.m1321z(":status");
        f3688f = C0160eb.m1321z(":method");
        f3689g = C0160eb.m1321z(":path");
        f3690h = C0160eb.m1321z(":scheme");
        f3691i = C0160eb.m1321z(":authority");
    }

    public gs0(C0505no c0505no, C0505no c0505no2) {
        c0505no.getClass();
        c0505no2.getClass();
        this.f3692a = c0505no;
        this.f3693b = c0505no2;
        this.f3694c = c0505no2.mo3322a() + c0505no.mo3322a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs0)) {
            return false;
        }
        gs0 gs0Var = (gs0) obj;
        return t11.m5086l(this.f3692a, gs0Var.f3692a) && t11.m5086l(this.f3693b, gs0Var.f3693b);
    }

    public final int hashCode() {
        return this.f3693b.hashCode() + (this.f3692a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3692a.m3331j() + ": " + this.f3693b.m3331j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gs0(String str, String str2) {
        this(C0160eb.m1321z(str), C0160eb.m1321z(str2));
        C0505no c0505no = C0505no.f7266k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gs0(C0505no c0505no, String str) {
        this(c0505no, C0160eb.m1321z(str));
        c0505no.getClass();
        str.getClass();
        C0505no c0505no2 = C0505no.f7266k;
    }
}

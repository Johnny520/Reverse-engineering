package p046d6;

import java.util.Objects;
import p136j8.C2104o;

/* JADX INFO: renamed from: d6.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0712i {

    /* JADX INFO: renamed from: e */
    public static final C0708e f2142e = new C0708e(1);

    /* JADX INFO: renamed from: a */
    public Comparable f2143a;

    /* JADX INFO: renamed from: b */
    public Comparable f2144b;

    /* JADX INFO: renamed from: c */
    public boolean f2145c;

    /* JADX INFO: renamed from: d */
    public boolean f2146d = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0712i(Comparable comparable, Comparable comparable2, boolean z9) {
        this.f2143a = comparable;
        this.f2144b = comparable2;
        this.f2145c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0712i m1883a() {
        C0712i c0712i = new C0712i();
        c0712i.f2146d = true;
        c0712i.f2143a = null;
        c0712i.f2144b = null;
        c0712i.f2145c = false;
        return c0712i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C0712i m1884g() {
        Integer num = 0;
        if (num.compareTo(num) <= 0) {
            return new C0712i(num, num, true);
        }
        C2104o.m5294t("lowerBound must be <= upperBound");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1885b(Integer num) {
        Comparable comparable = this.f2144b;
        Comparable comparable2 = this.f2143a;
        if (this.f2146d) {
            return true;
        }
        if (comparable2 == null || (!(this.f2145c && num.compareTo(comparable2) == 0) && num.compareTo(comparable2) >= 0)) {
            return comparable == null || num.compareTo(comparable) <= 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m1886c() {
        return this.f2143a != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1887d() {
        return this.f2144b != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m1888e(C0712i c0712i) {
        if (m1886c() && c0712i.m1887d() && this.f2143a.compareTo(c0712i.f2144b) > 0) {
            return false;
        }
        return (m1887d() && c0712i.m1886c() && c0712i.f2143a.compareTo(this.f2144b) > 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0712i)) {
            return false;
        }
        C0712i c0712i = (C0712i) obj;
        return this.f2146d == c0712i.f2146d && Objects.equals(this.f2143a, c0712i.f2143a) && Objects.equals(this.f2144b, c0712i.f2144b) && this.f2145c == c0712i.f2145c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m1889f() {
        return !this.f2146d && Objects.equals(this.f2143a, this.f2144b) && this.f2145c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (this.f2146d) {
            return "[*]";
        }
        return (((this.f2145c ? "(" : "[") + this.f2143a).concat(", ") + this.f2144b).concat("]");
    }
}

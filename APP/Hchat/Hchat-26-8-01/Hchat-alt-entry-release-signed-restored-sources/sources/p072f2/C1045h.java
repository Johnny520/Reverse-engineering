package p072f2;

import p136j8.C2104o;
import p172lg.C2561a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: f2.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1045h {

    /* JADX INFO: renamed from: d */
    public static final C1045h f3283d = new C1045h(0.0f, new C2561a(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a */
    public final float f3284a;

    /* JADX INFO: renamed from: b */
    public final C2561a f3285b;

    /* JADX INFO: renamed from: c */
    public final int f3286c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1045h(float f3, C2561a c2561a, int i9) {
        this.f3284a = f3;
        this.f3285b = c2561a;
        this.f3286c = i9;
        if (Float.isNaN(f3)) {
            C2104o.m5294t("current must not be NaN");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1045h)) {
            return false;
        }
        C1045h c1045h = (C1045h) obj;
        return this.f3284a == c1045h.f3284a && this.f3285b.equals(c1045h.f3285b) && this.f3286c == c1045h.f3286c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((this.f3285b.hashCode() + (Float.hashCode(this.f3284a) * 31)) * 31) + this.f3286c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f3284a);
        sb2.append(", range=");
        sb2.append(this.f3285b);
        sb2.append(", steps=");
        return AbstractC3199a.m6841n(sb2, this.f3286c, ')');
    }
}

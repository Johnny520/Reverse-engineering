package p050c0;

/* JADX INFO: renamed from: c0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0707x {

    /* JADX INFO: renamed from: a */
    public final boolean f2222a;

    /* JADX INFO: renamed from: b */
    public final boolean f2223b;

    /* JADX INFO: renamed from: c */
    public final boolean f2224c;

    /* JADX INFO: renamed from: d */
    public final boolean f2225d;

    /* JADX INFO: renamed from: e */
    public final boolean f2226e;

    public C0707x(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f2222a = z2;
        this.f2223b = z3;
        this.f2224c = z4;
        this.f2225d = z5;
        this.f2226e = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0707x)) {
            return false;
        }
        C0707x c0707x = (C0707x) obj;
        return this.f2222a == c0707x.f2222a && this.f2223b == c0707x.f2223b && this.f2224c == c0707x.f2224c && this.f2225d == c0707x.f2225d && this.f2226e == c0707x.f2226e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2226e) + ((Boolean.hashCode(this.f2225d) + ((Boolean.hashCode(this.f2224c) + ((Boolean.hashCode(this.f2223b) + (Boolean.hashCode(this.f2222a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoLoginWinOptions(enabled=" + this.f2222a + ", syncMsg=" + this.f2223b + ", showDevice=" + this.f2224c + ", autoLoginDevice=" + this.f2225d + ", autoClick=" + this.f2226e + ")";
    }
}

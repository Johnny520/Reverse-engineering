package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 {

    /* JADX INFO: renamed from: a */
    public final C0859wt f13390a;

    /* JADX INFO: renamed from: b */
    public final a63 f13391b;

    /* JADX INFO: renamed from: c */
    public int f13392c = -1;

    /* JADX INFO: renamed from: d */
    public r72 f13393d;

    public yb1(C0859wt c0859wt, a63 a63Var) {
        this.f13390a = c0859wt;
        this.f13391b = a63Var;
    }

    /* JADX INFO: renamed from: a */
    public final r72 m6248a() {
        if (this.f13393d == null) {
            this.f13390a.m5990f();
            if (this.f13393d == null) {
                throw new AssertionError();
            }
        }
        return this.f13393d;
    }

    public final String toString() {
        return "v" + this.f13392c + "(" + this.f13391b + ")";
    }
}

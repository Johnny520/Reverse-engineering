package p037U;

/* JADX INFO: renamed from: U.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0381q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f849a;

    /* JADX INFO: renamed from: b */
    public int f850b;

    /* JADX INFO: renamed from: c */
    public int f851c;

    /* JADX INFO: renamed from: d */
    public boolean f852d;

    /* JADX INFO: renamed from: e */
    public boolean f853e;

    public C0381q(int r1) {
        this.f849a = r1;
        switch(r1) {
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        m960a();
        return;
    }

    /* JADX INFO: renamed from: a */
    public void m960a() {
        this.f850b = -1;
        this.f851c = Integer.MIN_VALUE;
        this.f852d = false;
        this.f853e = false;
    }

    public String toString() {
        switch(this.f849a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "AnchorInfo{mPosition=" + this.f850b + ", mCoordinate=" + this.f851c + ", mLayoutFromEnd=" + this.f852d + ", mValid=" + this.f853e + '}';
    }
}

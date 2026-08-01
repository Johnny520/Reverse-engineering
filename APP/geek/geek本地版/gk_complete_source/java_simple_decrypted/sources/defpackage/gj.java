package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gj extends hj {
    public final i8 c;
    public final /* synthetic */ jj d;

    public gj(jj r1, long r2, i8 r4) {
        this.d = r1;
        this.a = r2;
        this.b = -1;
        this.c = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.s(this.d);
    }

    @Override // defpackage.hj
    public final String toString() {
        return super.toString() + this.c;
    }
}

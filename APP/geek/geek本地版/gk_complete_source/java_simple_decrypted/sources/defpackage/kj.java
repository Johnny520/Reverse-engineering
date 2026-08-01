package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj extends ke {
    public long c;
    public boolean d;
    public k6 e;

    public final void f() {
        long r0 = this.c - 4294967296L;
        this.c = r0;
        if (r0 <= 0) goto L6;
        return;
    L6:
        if (this.d == false) goto L9;
        shutdown();
        return;
    }

    public abstract Thread j();

    public final void k(boolean r5) {
        long r0 = this.c;
        if (r5 == false) goto L5;
        long r2 = 4294967296L;
    L6:
        this.c = r2 + r0;
        if (r5 == true) goto L10;
        this.d = true;
        return;
    L10:
        return;
    L5:
        r2 = 1;
        goto L6
    }

    public final boolean l() {
        k6 r0 = this.e;
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.isEmpty() == false) goto L8;
        Object r02 = null;
    L9:
        vg r03 = (vg) r02;
        if (r03 != null) goto L12;
        return false;
    L12:
        r03.run();
        return true;
    L8:
        r02 = r0.removeFirst();
        goto L9
    }

    public void m(long r2, hj r4) {
        kf.i.r(r2, r4);
    }

    public abstract void shutdown();
}

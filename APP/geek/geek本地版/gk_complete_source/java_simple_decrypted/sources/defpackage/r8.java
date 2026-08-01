package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r8 implements Runnable {
    public final /* synthetic */ s8 a;
    public final /* synthetic */ ou b;
    public final /* synthetic */ ku c;
    public final /* synthetic */ l0 d;

    public r8(l0 r1, s8 r2, ou r3, ku r4) {
        this.d = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t8 r0 = (t8) this.d.b;
        s8 r1 = this.a;
        if (r1 == null) goto L5;
        r0.z = true;
        r1.b.c(false);
        r0.z = false;
    L5:
        ou r02 = this.b;
        if (r02.isEnabled() == true) goto L8;
        return;
    L8:
        if (r02.hasSubMenu() == false) goto L12;
        this.c.q(r02, null, 4);
        return;
    }
}

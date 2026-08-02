package p000;

/* JADX INFO: renamed from: ux */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0789ux extends C0559ox {

    /* JADX INFO: renamed from: j */
    public final u21 f11540j;

    /* JADX INFO: renamed from: k */
    public int f11541k;

    public C0789ux(C0133dk c0133dk, u21 u21Var) {
        super(c0133dk);
        this.f11540j = u21Var;
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: a */
    public final void mo3647a() {
        this.f7865h = true;
        this.f11541k++;
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: b */
    public final void mo3648b() {
        this.f7865h = false;
        C0133dk c0133dk = (C0133dk) this.f7866i;
        c0133dk.m1045w("\n");
        int i = this.f11541k;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f11540j.f11072a.f2757d;
            str.getClass();
            c0133dk.m1045w(str);
        }
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: c */
    public final void mo3649c() {
        if (this.f7865h) {
            this.f7865h = false;
        } else {
            mo3648b();
        }
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: k */
    public final void mo3657k() {
        m3651e(' ');
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: m */
    public final void mo3659m() {
        this.f11541k--;
    }
}

package p000;

/* JADX INFO: renamed from: wi */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0848wi implements InterfaceC0321ip {

    /* JADX INFO: renamed from: a */
    public final C0811vi[] f12516a;

    public C0848wi(C0811vi[] c0811viArr) {
        this.f12516a = c0811viArr;
    }

    @Override // p000.InterfaceC0321ip
    /* JADX INFO: renamed from: a */
    public final void mo2226a(Throwable th) {
        m5898b();
    }

    /* JADX INFO: renamed from: b */
    public final void m5898b() {
        for (C0811vi c0811vi : this.f12516a) {
            ca0 ca0Var = c0811vi.f11973m;
            if (ca0Var == null) {
                t11.m5067S("handle");
                throw null;
            }
            ca0Var.mo717a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f12516a + ']';
    }
}

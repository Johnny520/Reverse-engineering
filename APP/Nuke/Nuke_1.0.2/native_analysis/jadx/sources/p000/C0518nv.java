package p000;

/* JADX INFO: renamed from: nv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0518nv implements t00 {

    /* JADX INFO: renamed from: i */
    public static final C0518nv f7341i = new C0518nv(0);

    /* JADX INFO: renamed from: j */
    public static final C0518nv f7342j = new C0518nv(1);

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7343h;

    public /* synthetic */ C0518nv(int i) {
        this.f7343h = i;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        switch (this.f7343h) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return zd0.f13837h;
        }
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) {
        switch (this.f7343h) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f7343h) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3450a(Object obj) {
    }
}

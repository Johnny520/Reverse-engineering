package p000;

/* JADX INFO: renamed from: qg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0651qg implements InterfaceC0322ik {

    /* JADX INFO: renamed from: e */
    public static final C0651qg f5141e = new C0651qg(0);

    /* JADX INFO: renamed from: f */
    public static final C0651qg f5142f = new C0651qg(1);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5143d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [qg.<clinit>():void] */
    public /* synthetic */ C0651qg(int i) {
        this.f5143d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        switch (this.f5143d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return C0220fs.f1799d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        switch (this.f5143d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f5143d) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3249a(Object obj) {
    }
}

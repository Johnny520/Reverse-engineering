package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class e01 {

    /* JADX INFO: renamed from: a */
    public final String f1253a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0904ww f1254b;

    /* JADX INFO: renamed from: c */
    public final boolean f1255c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e01(String str, InterfaceC0904ww interfaceC0904ww) {
        this.f1253a = str;
        this.f1254b = interfaceC0904ww;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityKey: " + this.f1253a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:m7:0x0000: SGET  A[WRAPPED] (LINE:9) m7.F m7) A[MD:(java.lang.String, ww):void (m)] (LINE:10) call: e01.<init>(java.lang.String, ww):void type: THIS */
    public /* synthetic */ e01(String str) {
        this(str, C0462m7.f3827F);
    }

    public e01(String str, int i) {
        this(str);
        this.f1255c = true;
    }

    public e01(String str, boolean z, InterfaceC0904ww interfaceC0904ww) {
        this(str, interfaceC0904ww);
        this.f1255c = z;
    }
}

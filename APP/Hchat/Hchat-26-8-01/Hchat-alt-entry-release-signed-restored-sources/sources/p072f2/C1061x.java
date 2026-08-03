package p072f2;

import p085fg.InterfaceC1235p;

/* JADX INFO: renamed from: f2.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1061x {

    /* JADX INFO: renamed from: a */
    public final String f3405a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1235p f3406b;

    /* JADX INFO: renamed from: c */
    public final boolean f3407c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1061x(String str, InterfaceC1235p interfaceC1235p) {
        this.f3405a = str;
        this.f3406b = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityKey: " + this.f3405a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:f2.k:0x0000: SGET  A[WRAPPED] (LINE:9) f2.k.A f2.k) A[MD:(java.lang.String, fg.p):void (m)] (LINE:10) call: f2.x.<init>(java.lang.String, fg.p):void type: THIS */
    public /* synthetic */ C1061x(String str) {
        this(str, C1048k.f3290A);
    }

    public C1061x(String str, int i9) {
        this(str);
        this.f3407c = true;
    }

    public C1061x(String str, boolean z9, InterfaceC1235p interfaceC1235p) {
        this(str, interfaceC1235p);
        this.f3407c = z9;
    }
}

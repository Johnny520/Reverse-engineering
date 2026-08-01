package p077P0;

import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: P0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1135v {

    /* JADX INFO: renamed from: a */
    public final String f3767a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1603e f3768b;

    /* JADX INFO: renamed from: c */
    public final boolean f3769c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1135v(String str, InterfaceC1603e interfaceC1603e) {
        this.f3767a = str;
        this.f3768b = interfaceC1603e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityKey: " + this.f3767a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:P0.j:0x0000: SGET  A[WRAPPED] (LINE:4) P0.j.y P0.j) A[MD:(java.lang.String, W2.e):void (m)] (LINE:5) call: P0.v.<init>(java.lang.String, W2.e):void type: THIS */
    public /* synthetic */ C1135v(String str) {
        this(str, C1123j.f3670y);
    }

    public C1135v(String str, int i5) {
        this(str);
        this.f3769c = true;
    }

    public C1135v(String str, boolean z5, InterfaceC1603e interfaceC1603e) {
        this(str, interfaceC1603e);
        this.f3769c = z5;
    }
}

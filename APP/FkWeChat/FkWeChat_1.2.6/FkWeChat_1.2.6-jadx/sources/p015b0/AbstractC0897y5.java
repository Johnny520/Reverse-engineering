package p015b0;

import p018b3.C0942c1;
import p018b3.InterfaceC0948e1;
import p018b3.InterfaceC0956i0;
import p263s.AbstractC6635e;
import p319w2.C9058e;

/* JADX INFO: renamed from: b0.y5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0897y5 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0956i0 f2834a = new C0890x5(InterfaceC0956i0.f2937a.m3483a(), 0, 0);

    /* JADX INFO: renamed from: c */
    public static final C0942c1 m3297c(InterfaceC0948e1 interfaceC0948e1, C9058e c9058e) {
        C0942c1 c0942c1Mo3471a = interfaceC0948e1.mo3471a(c9058e);
        m3300f(c0942c1Mo3471a, c9058e.length(), 0, 2, null);
        return new C0942c1(c0942c1Mo3471a.m3466b(), new C0890x5(c0942c1Mo3471a.m3465a(), c9058e.length(), c0942c1Mo3471a.m3466b().length()));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0956i0 m3298d() {
        return f2834a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m3299e(C0942c1 c0942c1, int i10, int i11) {
        int length = c0942c1.m3466b().length();
        int iMin = Math.min(i10, i11);
        for (int i12 = 0; i12 < iMin; i12++) {
            m3301g(c0942c1.m3465a().mo3268b(i12), length, i12);
        }
        m3301g(c0942c1.m3465a().mo3268b(i10), length, i10);
        int iMin2 = Math.min(length, i11);
        for (int i13 = 0; i13 < iMin2; i13++) {
            m3302h(c0942c1.m3465a().mo3267a(i13), i10, i13);
        }
        m3302h(c0942c1.m3465a().mo3267a(length), i10, length);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3300f(C0942c1 c0942c1, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        m3299e(c0942c1, i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public static final void m3301g(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC6635e.m26320c("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + ']');
    }

    /* JADX INFO: renamed from: h */
    public static final void m3302h(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC6635e.m26320c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + ']');
    }
}

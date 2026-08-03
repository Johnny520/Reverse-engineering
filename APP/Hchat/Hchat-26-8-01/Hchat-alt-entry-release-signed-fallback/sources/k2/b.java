package k2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f7137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.text.TextPaint f7138h;

    public b(java.lang.CharSequence r1, android.text.TextPaint r2) {
            r0 = this;
            r0.<init>()
            r0.f7137g = r1
            r0.f7138h = r2
            return
    }

    @Override // x6.d
    public final int P(int r4) {
            r3 = this;
            java.lang.CharSequence r0 = r3.f7137g
            int r1 = r0.length()
            android.text.TextPaint r2 = r3.f7138h
            int r4 = j2.b.w(r2, r0, r1, r4)
            return r4
    }

    @Override // x6.d
    public final int V(int r4) {
            r3 = this;
            java.lang.CharSequence r0 = r3.f7137g
            int r1 = r0.length()
            android.text.TextPaint r2 = r3.f7138h
            int r4 = j2.b.c(r2, r0, r1, r4)
            return r4
    }
}

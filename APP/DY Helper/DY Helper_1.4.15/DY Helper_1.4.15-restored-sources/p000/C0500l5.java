package p000;

/* JADX INFO: renamed from: l5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0500l5 {

    /* JADX INFO: renamed from: α */
    public final android.widget.TextView f6422;

    /* JADX INFO: renamed from: β */
    public final p000.C0568n f6423;

    public C0500l5(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.f6422 = r2
            n r0 = new n
            r0.<init>(r2)
            r1.f6423 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final android.text.InputFilter[] m3496(android.text.InputFilter[] r1) {
            r0 = this;
            n r0 = r0.f6423
            java.lang.Object r0 = r0.f7336
            bd r0 = (p000.AbstractC0073bd) r0
            android.text.InputFilter[] r0 = r0.mo905(r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m3497(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.TextView r0 = r3.f6422
            android.content.Context r0 = r0.getContext()
            int[] r1 = p000.kk1.f5976
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            r5 = 14
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r0 == 0) goto L1d
            boolean r1 = r4.getBoolean(r5, r1)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L24
        L1d:
            r4.recycle()
            r3.m3499(r1)
            return
        L24:
            r4.recycle()
            throw r3
    }

    /* JADX INFO: renamed from: γ */
    public final void m3498(boolean r1) {
            r0 = this;
            n r0 = r0.f6423
            java.lang.Object r0 = r0.f7336
            bd r0 = (p000.AbstractC0073bd) r0
            r0.mo903(r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3499(boolean r1) {
            r0 = this;
            n r0 = r0.f6423
            java.lang.Object r0 = r0.f7336
            bd r0 = (p000.AbstractC0073bd) r0
            r0.mo906(r1)
            return
    }
}

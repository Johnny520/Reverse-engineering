package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements m.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m.r f8332a;

    public q(m.r r1) {
            r0 = this;
            r0.<init>()
            r0.f8332a = r1
            return
    }

    @Override // m.u1
    public final float a(float r7) {
            r6 = this;
            boolean r0 = java.lang.Float.isNaN(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            m.r r0 = r6.f8332a
            fg.l r2 = r0.f8340a
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r7 = r2.invoke(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            i0.j1 r2 = r0.f8344e
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L24
            r3 = r5
            goto L25
        L24:
            r3 = r4
        L25:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.setValue(r3)
            i0.j1 r0 = r0.f8345f
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L33
            r4 = r5
        L33:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.setValue(r1)
            return r7
    }
}

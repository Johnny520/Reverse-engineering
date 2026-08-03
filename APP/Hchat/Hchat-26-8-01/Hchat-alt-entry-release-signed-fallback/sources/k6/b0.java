package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends h6.n {
    public b0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 != 0) goto L8
            r2.l()
            return
        L8:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            float r3 = r3.floatValue()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L15:
            r2.w(r3)
            return
    }
}

package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class v0 extends h6.n {
    public v0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L8
            r1.l()
            goto L1e
        L8:
            r1.y()
            r1.a()
            java.io.Writer r1 = r1.f9552g
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L19
            java.lang.String r2 = "true"
            goto L1b
        L19:
            java.lang.String r2 = "false"
        L1b:
            r1.write(r2)
        L1e:
            return
    }
}

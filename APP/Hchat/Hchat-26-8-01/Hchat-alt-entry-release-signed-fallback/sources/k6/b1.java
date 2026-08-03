package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b1 extends h6.n {
    public b1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r1, java.lang.Object r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            boolean r2 = r2.get()
            r1.y()
            r1.a()
            java.io.Writer r1 = r1.f9552g
            if (r2 == 0) goto L13
            java.lang.String r2 = "true"
            goto L15
        L13:
            java.lang.String r2 = "false"
        L15:
            r1.write(r2)
            return
    }
}

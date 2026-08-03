package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends h6.n {
    public j0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempted to serialize java.lang.Class: "
            r0.<init>(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = ". Forgot to register a type adapter?\nSee "
            r0.append(r4)
            java.lang.String r4 = "java-lang-class-unsupported"
            java.lang.String r1 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r4 = r1.concat(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }
}

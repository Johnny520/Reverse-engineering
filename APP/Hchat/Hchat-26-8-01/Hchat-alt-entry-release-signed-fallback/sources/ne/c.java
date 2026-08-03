package ne;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.e f9410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9412c;

    public c(ud.e r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f9410a = r1
            r0.f9411b = r2
            r0.f9412c = r3
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            ud.e r0 = r3.f9410a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ClsRename{"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " -> '"
            r1.append(r0)
            java.lang.String r0 = r3.f9411b
            r1.append(r0)
            int r0 = r3.f9412c
            r1.append(r0)
            java.lang.String r0 = "'}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}

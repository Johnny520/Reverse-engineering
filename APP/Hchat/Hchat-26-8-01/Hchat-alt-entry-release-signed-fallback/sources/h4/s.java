package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f5093a;

    public s(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.f5093a = r1
            return
        L8:
            java.lang.String r1 = "name == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    public abstract int a();
}

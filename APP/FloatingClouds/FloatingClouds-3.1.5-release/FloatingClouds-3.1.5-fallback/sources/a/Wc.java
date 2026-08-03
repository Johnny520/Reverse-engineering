package a;

/* JADX INFO: loaded from: classes.dex */
public final class Wc implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f326a;

    public Wc(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "pattern"
            a.C0193i9.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            a.C0193i9.d(r2, r0)
            r1.<init>()
            r1.f326a = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.f326a
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            a.C0193i9.d(r0, r1)
            return r0
    }
}

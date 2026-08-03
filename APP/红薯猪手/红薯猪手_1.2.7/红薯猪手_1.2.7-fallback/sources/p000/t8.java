package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t8 implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.regex.Pattern f1050;

    public t8(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "pattern"
            p000.h4.m189(r0, r2)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            p000.h4.m188(r0, r2)
            r1.<init>(r2)
            return
    }

    public t8(java.util.regex.Pattern r1) {
            r0 = this;
            r0.<init>()
            r0.f1050 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.f1050
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            p000.h4.m188(r1, r0)
            return r0
    }
}

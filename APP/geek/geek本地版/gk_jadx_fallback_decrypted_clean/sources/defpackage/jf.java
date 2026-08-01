package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jf extends defpackage.vh {
    @Override // defpackage.vh
    public final android.content.pm.Signature[] g(android.content.pm.PackageManager r2, java.lang.String r3) {
            r1 = this;
            r0 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            android.content.pm.Signature[] r2 = r2.signatures
            return r2
    }
}

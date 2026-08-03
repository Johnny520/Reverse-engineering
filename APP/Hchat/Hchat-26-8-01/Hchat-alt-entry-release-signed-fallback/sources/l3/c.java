package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a2.a {
    @Override // a2.a
    public final android.content.pm.Signature[] i(android.content.pm.PackageManager r2, java.lang.String r3) {
            r1 = this;
            r0 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            android.content.pm.Signature[] r2 = r2.signatures
            return r2
    }
}

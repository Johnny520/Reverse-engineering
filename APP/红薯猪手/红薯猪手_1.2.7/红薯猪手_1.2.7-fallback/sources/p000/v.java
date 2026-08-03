package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p000.y8 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.res.AssetManager f1085;

    public v(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.res.AssetManager r1 = r1.getAssets()
            r0.f1085 = r1
            return
    }

    @Override // p000.y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo94(p000.w8 r3) {
            r2 = this;
            android.net.Uri r3 = r3.f1130
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L2a
            java.util.List r0 = r3.getPathSegments()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.List r3 = r3.getPathSegments()
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r0 = "android_asset"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2a
            r1 = 1
        L2a:
            return r1
    }

    @Override // p000.y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final ۟.y8.a mo95(p000.w8 r3) {
            r2 = this;
            android.content.res.AssetManager r0 = r2.f1085
            android.net.Uri r3 = r3.f1130
            java.lang.String r3 = r3.toString()
            r1 = 22
            java.lang.String r3 = r3.substring(r1)
            java.io.InputStream r3 = r0.open(r3)
            ۟.y8$a r0 = new ۟.y8$a
            ۟.z7$e r1 = ۟.z7.e.f1271
            r0.<init>(r3, r1)
            return r0
    }
}

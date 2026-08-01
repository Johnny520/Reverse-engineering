package defpackage;

/* JADX INFO: renamed from: ᲀᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1750 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0980 f7734 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f7735;

    static {
            ᛵᲇᛳᲇ r0 = new ᛵᲇᛳᲇ
            r1 = 0
            ᲈᛴᛵᲈ r2 = defpackage.C0980.f4390
            java.lang.String r3 = "com.bumptech.glide.load.resource.bitmap.Downsampler.Theme"
            r0.<init>(r3, r1, r2)
            defpackage.C1750.f7734 = r0
            return
    }

    public C1750(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f7735 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1901 m3134(android.net.Uri r9, defpackage.C0533 r10) {
            r8 = this;
            java.lang.String r0 = r9.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Ld0
            android.content.Context r8 = r8.f7735
            java.lang.String r1 = r8.getPackageName()
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L19
        L17:
            r1 = r8
            goto L2a
        L19:
            android.content.Context r1 = r8.createPackageContext(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            goto L2a
        L1e:
            r1 = move-exception
            java.lang.String r3 = r8.getPackageName()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto Lbc
            goto L17
        L2a:
            java.util.List r3 = r9.getPathSegments()
            int r4 = r3.size()
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L68
            java.util.List r3 = r9.getPathSegments()
            java.lang.String r4 = r9.getAuthority()
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            android.content.res.Resources r5 = r1.getResources()
            int r4 = r5.getIdentifier(r3, r2, r4)
            if (r4 != 0) goto L5f
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            java.lang.String r5 = "android"
            int r4 = r4.getIdentifier(r3, r2, r5)
        L5f:
            if (r4 == 0) goto L62
            goto L7e
        L62:
            java.lang.String r8 = "Failed to find resource id for: "
            defpackage.C2264.m3685(r9, r8)
            return r7
        L68:
            int r3 = r3.size()
            java.lang.String r4 = "Unrecognized Uri format: "
            if (r3 != r6) goto Lb8
            java.util.List r3 = r9.getPathSegments()
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.NumberFormatException -> La5
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> La5
            int r4 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> La5
        L7e:
            java.lang.String r9 = r8.getPackageName()
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L91
            ᛵᲇᛳᲇ r9 = defpackage.C1750.f7734
            java.lang.Object r9 = r10.m1326(r9)
            android.content.res.Resources$Theme r9 = (android.content.res.Resources.Theme) r9
            goto L92
        L91:
            r9 = r7
        L92:
            if (r9 != 0) goto L99
            android.graphics.drawable.Drawable r8 = defpackage.AbstractC1754.m3145(r8, r1, r4, r7)
            goto L9d
        L99:
            android.graphics.drawable.Drawable r8 = defpackage.AbstractC1754.m3145(r8, r8, r4, r9)
        L9d:
            if (r8 == 0) goto La4
            ᛳᲇᛲᛷ r7 = new ᛳᲇᛲᛷ
            r7.<init>(r8, r6)
        La4:
            return r7
        La5:
            r8 = move-exception
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9, r8)
            throw r10
        Lb8:
            defpackage.C2264.m3685(r9, r4)
            return r7
        Lbc:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to obtain context or unrecognized Uri format for: "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9, r1)
            throw r8
        Ld0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Package name for "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r9 = " is null or empty"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final /* bridge */ /* synthetic */ defpackage.InterfaceC1901 mo382(java.lang.Object r1, int r2, int r3, defpackage.C0533 r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            ᲁᛸᛸ r0 = r0.m3134(r1, r4)
            return r0
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r1, defpackage.C0533 r2) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r0 = r1.getScheme()
            if (r0 == 0) goto L12
            java.lang.String r1 = "android.resource"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}

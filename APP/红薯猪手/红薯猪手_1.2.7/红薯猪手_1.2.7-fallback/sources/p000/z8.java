package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z8 extends p000.y8 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f1276;

    public z8(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f1276 = r1
            return
    }

    @Override // p000.y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo94(p000.w8 r2) {
            r1 = this;
            int r0 = r2.f1131
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L6:
            android.net.Uri r2 = r2.f1130
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "android.resource"
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p000.y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final ۟.y8.a mo95(p000.w8 r13) {
            r12 = this;
            android.content.Context r0 = r12.f1276
            java.lang.StringBuilder r1 = p000.ic.f502
            int r1 = r13.f1131
            java.lang.String r2 = "No package provided: "
            if (r1 != 0) goto L46
            android.net.Uri r1 = r13.f1130
            if (r1 != 0) goto Lf
            goto L46
        Lf:
            java.lang.String r1 = r1.getAuthority()
            if (r1 == 0) goto L33
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            android.content.res.Resources r0 = r0.getResourcesForApplication(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            goto L4a
        L1e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "Unable to obtain resources for package: "
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            android.net.Uri r13 = r13.f1130
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L33:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = p000.c4.m108(r2)
            android.net.Uri r13 = r13.f1130
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L46:
            android.content.res.Resources r0 = r0.getResources()
        L4a:
            int r1 = r13.f1131
            r3 = 1
            r4 = 0
            if (r1 != 0) goto Le5
            android.net.Uri r5 = r13.f1130
            if (r5 != 0) goto L56
            goto Le5
        L56:
            java.lang.String r1 = r5.getAuthority()
            if (r1 == 0) goto Ld2
            android.net.Uri r2 = r13.f1130
            java.util.List r2 = r2.getPathSegments()
            if (r2 == 0) goto Lbd
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto Lbd
            int r5 = r2.size()
            if (r5 != r3) goto L90
            java.lang.Object r1 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L7b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L7b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7b
            goto Le5
        L7b:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "Last path segment is not a resource ID: "
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            android.net.Uri r13 = r13.f1130
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L90:
            int r5 = r2.size()
            r6 = 2
            if (r5 != r6) goto La8
            java.lang.Object r5 = r2.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r0.getIdentifier(r2, r5, r1)
            goto Le5
        La8:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "More than two path segments: "
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            android.net.Uri r13 = r13.f1130
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        Lbd:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "No path segments: "
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            android.net.Uri r13 = r13.f1130
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        Ld2:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = p000.c4.m108(r2)
            android.net.Uri r13 = r13.f1130
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        Le5:
            ۟.y8$a r2 = new ۟.y8$a
            android.graphics.BitmapFactory$Options r11 = p000.y8.m478(r13)
            if (r11 == 0) goto Lf2
            boolean r5 = r11.inJustDecodeBounds
            if (r5 == 0) goto Lf2
            goto Lf3
        Lf2:
            r3 = r4
        Lf3:
            if (r3 == 0) goto L105
            android.graphics.BitmapFactory.decodeResource(r0, r1, r11)
            int r5 = r13.f1133
            int r6 = r13.f1134
            int r7 = r11.outWidth
            int r8 = r11.outHeight
            r9 = r11
            r10 = r13
            p000.y8.m477(r5, r6, r7, r8, r9, r10)
        L105:
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeResource(r0, r1, r11)
            r2.<init>(r13)
            return r2
    }
}

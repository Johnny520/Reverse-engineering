package defpackage;

/* JADX INFO: renamed from: ᛶᛷᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1113 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f4982;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f4983;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f4984;

    public C1113(android.content.Context r2, defpackage.C1372 r3) {
            r1 = this;
            r0 = 1
            r1.f4983 = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.f4984 = r2
            r1.f4982 = r3
            return
    }

    public C1113(android.content.Context r2, defpackage.InterfaceC2267 r3) {
            r1 = this;
            r0 = 4
            r1.f4983 = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.f4984 = r2
            r1.f4982 = r3
            return
    }

    public C1113(android.content.res.Resources r2, defpackage.InterfaceC2267 r3) {
            r1 = this;
            r0 = 3
            r1.f4983 = r0
            r1.<init>()
            r1.f4982 = r2
            r1.f4984 = r3
            return
    }

    public /* synthetic */ C1113(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f4983 = r2
            r0.f4984 = r1
            r0.f4982 = r3
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f4983
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiModelLoader{modelLoaders="
            r0.<init>(r1)
            java.lang.Object r2 = r2.f4984
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object[] r2 = r2.toArray()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1265(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f4983
            java.lang.Object r4 = r4.f4984
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L49;
                case 1: goto L46;
                case 2: goto L2c;
                case 3: goto L29;
                default: goto L9;
            }
        L9:
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.String r0 = "android.resource"
            java.lang.String r3 = r5.getScheme()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L28
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = r5.getAuthority()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L28
            r1 = r2
        L28:
            return r1
        L29:
            java.lang.Integer r5 = (java.lang.Integer) r5
            return r2
        L2c:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r4.next()
            ᲈᛶᲀᛳ r0 = (defpackage.InterfaceC2267) r0
            boolean r0 = r0.mo1265(r5)
            if (r0 == 0) goto L32
            r1 = r2
        L45:
            return r1
        L46:
            java.lang.Integer r5 = (java.lang.Integer) r5
            return r2
        L49:
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.String r4 = "file"
            java.lang.String r0 = r5.getScheme()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L72
            java.util.List r4 = r5.getPathSegments()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L72
            java.util.List r4 = r5.getPathSegments()
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r5 = "android_asset"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L72
            r1 = r2
        L72:
            return r1
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0402 mo1266(java.lang.Object r9, int r10, int r11, defpackage.C0533 r12) {
            r8 = this;
            int r0 = r8.f4983
            r1 = 5
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Object r5 = r8.f4984
            java.lang.Object r8 = r8.f4982
            switch(r0) {
                case 0: goto L182;
                case 1: goto L155;
                case 2: goto L116;
                case 3: goto Lca;
                default: goto Ld;
            }
        Ld:
            android.net.Uri r9 = (android.net.Uri) r9
            ᲈᛶᲀᛳ r8 = (defpackage.InterfaceC2267) r8
            java.util.List r0 = r9.getPathSegments()
            int r6 = r0.size()
            java.lang.String r7 = "ResourceUriLoader"
            if (r6 != r2) goto L6a
            java.lang.String r0 = "Failed to parse a valid non-0 resource id from: "
            java.util.List r2 = r9.getPathSegments()     // Catch: java.lang.NumberFormatException -> L46
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L46
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L46
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L46
            if (r2 != 0) goto L48
            boolean r8 = android.util.Log.isLoggable(r7, r1)     // Catch: java.lang.NumberFormatException -> L46
            if (r8 == 0) goto Lc9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L46
            r8.<init>(r0)     // Catch: java.lang.NumberFormatException -> L46
            r8.append(r9)     // Catch: java.lang.NumberFormatException -> L46
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> L46
            android.util.Log.w(r7, r8)     // Catch: java.lang.NumberFormatException -> L46
            goto Lc9
        L46:
            r8 = move-exception
            goto L52
        L48:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L46
            ᛳᛱᛱᛲ r3 = r8.mo1266(r0, r10, r11, r12)     // Catch: java.lang.NumberFormatException -> L46
            goto Lc9
        L52:
            boolean r10 = android.util.Log.isLoggable(r7, r1)
            if (r10 == 0) goto Lc9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to parse resource id from: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.w(r7, r9, r8)
            goto Lc9
        L6a:
            int r0 = r0.size()
            r6 = 2
            if (r0 != r6) goto Lb2
            java.util.List r0 = r9.getPathSegments()
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r5 = (android.content.Context) r5
            android.content.res.Resources r2 = r5.getResources()
            java.lang.String r5 = r5.getPackageName()
            int r0 = r2.getIdentifier(r0, r4, r5)
            if (r0 != 0) goto La9
            boolean r8 = android.util.Log.isLoggable(r7, r1)
            if (r8 == 0) goto Lc9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to find resource id for: "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r7, r8)
            goto Lc9
        La9:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            ᛳᛱᛱᛲ r3 = r8.mo1266(r9, r10, r11, r12)
            goto Lc9
        Lb2:
            boolean r8 = android.util.Log.isLoggable(r7, r1)
            if (r8 == 0) goto Lc9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to parse resource uri: "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r7, r8)
        Lc9:
            return r3
        Lca:
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r0 = "android.resource://"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            r2.<init>(r0)     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            android.content.res.Resources r8 = (android.content.res.Resources) r8     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            int r0 = r9.intValue()     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            java.lang.String r8 = r8.getResourcePackageName(r0)     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            r2.append(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            r8 = 47
            r2.append(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            r2.append(r9)     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            java.lang.String r8 = r2.toString()     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lf1
            goto L10c
        Lf1:
            r8 = move-exception
            java.lang.String r0 = "ResourceLoader"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L10b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Received invalid resource id: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.w(r0, r9, r8)
        L10b:
            r8 = r3
        L10c:
            if (r8 != 0) goto L10f
            goto L115
        L10f:
            ᲈᛶᲀᛳ r5 = (defpackage.InterfaceC2267) r5
            ᛳᛱᛱᛲ r3 = r5.mo1266(r8, r10, r11, r12)
        L115:
            return r3
        L116:
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r0 = r5.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = r3
        L122:
            if (r4 >= r0) goto L140
            java.lang.Object r6 = r5.get(r4)
            ᲈᛶᲀᛳ r6 = (defpackage.InterfaceC2267) r6
            boolean r7 = r6.mo1265(r9)
            if (r7 == 0) goto L13d
            ᛳᛱᛱᛲ r6 = r6.mo1266(r9, r10, r11, r12)
            if (r6 == 0) goto L13d
            ᲀᛷᛶᲈ r2 = r6.f2057
            ᛱᲇᲀᛴ r6 = r6.f2058
            r1.add(r6)
        L13d:
            int r4 = r4 + 1
            goto L122
        L140:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L154
            if (r2 == 0) goto L154
            ᛳᛱᛱᛲ r3 = new ᛳᛱᛱᛲ
            ᛳᲁᲈᛵ r9 = new ᛳᲁᲈᛵ
            ᛷᛸᛱᛸ r8 = (defpackage.C1326) r8
            r9.<init>(r1, r8)
            r3.<init>(r2, r9)
        L154:
            return r3
        L155:
            java.lang.Integer r9 = (java.lang.Integer) r9
            ᛵᲇᛳᲇ r10 = defpackage.C1750.f7734
            java.lang.Object r10 = r12.m1326(r10)
            android.content.res.Resources$Theme r10 = (android.content.res.Resources.Theme) r10
            if (r10 == 0) goto L166
            android.content.res.Resources r11 = r10.getResources()
            goto L16c
        L166:
            android.content.Context r5 = (android.content.Context) r5
            android.content.res.Resources r11 = r5.getResources()
        L16c:
            ᛳᛱᛱᛲ r12 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r0 = new ᛵᛶᲈᛵ
            r0.<init>(r9)
            ᛳᲈᛸᛲ r1 = new ᛳᲈᛸᛲ
            ᛷᲁᛷᛶ r8 = (defpackage.C1372) r8
            int r9 = r9.intValue()
            r1.<init>(r10, r11, r8, r9)
            r12.<init>(r0, r1)
            return r12
        L182:
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r10 = r9.toString()
            r11 = 22
            java.lang.String r10 = r10.substring(r11)
            ᛳᛱᛱᛲ r11 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r12 = new ᛵᛶᲈᛵ
            r12.<init>(r9)
            ᛱᛲᛶᛳ r8 = (defpackage.C0037) r8
            android.content.res.AssetManager r5 = (android.content.res.AssetManager) r5
            int r8 = r8.f537
            switch(r8) {
                case 0: goto L1a4;
                default: goto L19e;
            }
        L19e:
            ᲈᛳᲀᛷ r8 = new ᲈᛳᲀᛷ
            r8.<init>(r5, r10, r2)
            goto L1a9
        L1a4:
            ᲈᛳᲀᛷ r8 = new ᲈᛳᲀᛷ
            r8.<init>(r5, r10, r4)
        L1a9:
            r11.<init>(r12, r8)
            return r11
    }
}

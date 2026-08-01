package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cw1 implements p000.v41 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2788;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f2789;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f2790;

    public cw1(int r3) {
            r2 = this;
            r2.f2788 = r3
            switch(r3) {
                case 5: goto L1b;
                default: goto L5;
            }
        L5:
            r2.<init>()
            zz1 r3 = new zz1
            r0 = 4
            r1 = 0
            r3.<init>(r0, r1)
            r2.f2789 = r3
            kw0 r3 = new kw0
            r0 = 16
            r3.<init>(r0)
            r2.f2790 = r3
            return
        L1b:
            r2.<init>()
            k21 r3 = new k21
            r0 = 16
            java.lang.ref.Reference[] r0 = new java.lang.ref.Reference[r0]
            r3.<init>(r0)
            r2.f2789 = r3
            java.lang.ref.ReferenceQueue r3 = new java.lang.ref.ReferenceQueue
            r3.<init>()
            r2.f2790 = r3
            return
    }

    public cw1(android.view.WindowInsetsAnimation.Bounds r2) {
            r1 = this;
            r0 = 6
            r1.f2788 = r0
            r1.<init>()
            android.graphics.Insets r0 = r2.getLowerBound()
            nm0 r0 = p000.nm0.m4081(r0)
            r1.f2789 = r0
            android.graphics.Insets r2 = r2.getUpperBound()
            nm0 r2 = p000.nm0.m4081(r2)
            r1.f2790 = r2
            return
    }

    public cw1(androidx.viewpager.widget.ViewPager r2) {
            r1 = this;
            r0 = 4
            r1.f2788 = r0
            r1.<init>()
            r1.f2790 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f2789 = r2
            return
    }

    public /* synthetic */ cw1(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f2788 = r2
            r0.f2789 = r1
            r0.f2790 = r3
            r0.<init>()
            return
    }

    public cw1(p000.yl1 r2) {
            r1 = this;
            r0 = 3
            r1.f2788 = r0
            r1.<init>()
            r1.f2789 = r2
            o82 r2 = new o82
            r2.<init>()
            r0 = 0
            r2.f7985 = r0
            r1.f2790 = r2
            return
    }

    /* JADX INFO: renamed from: δ */
    public static p000.cw1 m1627(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r3)
            boolean r1 = android.provider.DocumentsContract.isDocumentUri(r2, r3)
            if (r1 == 0) goto Le
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r3)
        Le:
            if (r0 == 0) goto L31
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r3, r0)
            if (r0 == 0) goto L1d
            cw1 r3 = new cw1
            r1 = 1
            r3.<init>(r2, r1, r0)
            return r3
        L1d:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to build documentUri from a tree: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L31:
            java.lang.String r2 = "Could not get document ID from Uri: "
            p000.C1080.m7274(r3, r2)
            r2 = 0
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2788
            switch(r0) {
                case 6: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bounds{lower="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f2789
            nm0 r1 = (p000.nm0) r1
            r0.append(r1)
            java.lang.String r1 = " upper="
            r0.append(r1)
            java.lang.Object r2 = r2.f2790
            nm0 r2 = (p000.nm0) r2
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public boolean m1628() {
            r7 = this;
            java.lang.Object r0 = r7.f2789
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r7 = r7.f2790
            android.net.Uri r7 = (android.net.Uri) r7
            r1 = 2
            int r2 = r0.checkCallingOrSelfUriPermission(r7, r1)
            r3 = 0
            if (r2 == 0) goto L11
            goto L43
        L11:
            java.lang.String r2 = "mime_type"
            java.lang.String r2 = p000.AbstractC0073bd.m858(r0, r7, r2)
            java.lang.String r4 = "flags"
            long r5 = (long) r3
            long r4 = p000.AbstractC0073bd.m857(r0, r7, r4, r5)
            int r7 = (int) r4
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L26
            goto L43
        L26:
            r0 = r7 & 4
            if (r0 == 0) goto L2b
            goto L41
        L2b:
            java.lang.String r0 = "vnd.android.document/directory"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L38
            r0 = r7 & 8
            if (r0 == 0) goto L38
            goto L41
        L38:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L43
            r7 = r7 & r1
            if (r7 == 0) goto L43
        L41:
            r7 = 1
            return r7
        L43:
            return r3
    }

    /* JADX INFO: renamed from: β */
    public p000.cw1 m1629(java.lang.String r12) {
            r11 = this;
            java.lang.Object r0 = r11.f2789
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            android.content.ContentResolver r2 = r1.getContentResolver()
            java.lang.Object r11 = r11.f2790
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r11)
            android.net.Uri r3 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r11, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            java.lang.String r0 = "document_id"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
        L29:
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            if (r0 == 0) goto L43
            java.lang.String r0 = r2.getString(r9)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r11, r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            r8.add(r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            goto L29
        L3b:
            r0 = move-exception
            r11 = r0
            r10 = r2
            goto La8
        L40:
            r0 = move-exception
            r11 = r0
            goto L50
        L43:
            p000.lz1.m3697(r2)     // Catch: java.lang.RuntimeException -> L47 java.lang.Exception -> L6f
            goto L6f
        L47:
            r0 = move-exception
            r11 = r0
            throw r11
        L4a:
            r0 = move-exception
            r11 = r0
            goto La8
        L4d:
            r0 = move-exception
            r11 = r0
            r2 = r10
        L50:
            java.lang.String r0 = "DocumentFile"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "Failed query: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3b
            r3.append(r11)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            android.util.Log.w(r0, r11)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L6f
            p000.lz1.m3697(r2)     // Catch: java.lang.RuntimeException -> L6c java.lang.Exception -> L6f
            goto L6f
        L6c:
            r0 = move-exception
            r11 = r0
            throw r11
        L6f:
            android.net.Uri[] r11 = new android.net.Uri[r9]
            java.lang.Object[] r11 = r8.toArray(r11)
            android.net.Uri[] r11 = (android.net.Uri[]) r11
            int r0 = r11.length
            cw1[] r2 = new p000.cw1[r0]
            r3 = r9
        L7b:
            int r4 = r11.length
            if (r3 >= r4) goto L8b
            cw1 r4 = new cw1
            r5 = r11[r3]
            r6 = 1
            r4.<init>(r1, r6, r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L7b
        L8b:
            if (r9 >= r0) goto La7
            r11 = r2[r9]
            java.lang.Object r1 = r11.f2789
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r3 = r11.f2790
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.String r4 = "_display_name"
            java.lang.String r1 = p000.AbstractC0073bd.m858(r1, r3, r4)
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto La4
            return r11
        La4:
            int r9 = r9 + 1
            goto L8b
        La7:
            return r10
        La8:
            if (r10 == 0) goto Lb1
            p000.lz1.m3697(r10)     // Catch: java.lang.RuntimeException -> Lae java.lang.Exception -> Lb1
            goto Lb1
        Lae:
            r0 = move-exception
            r11 = r0
            throw r11
        Lb1:
            throw r11
    }

    /* JADX INFO: renamed from: γ */
    public android.view.View m1630(int r11, int r12, int r13, int r14) {
            r10 = this;
            java.lang.Object r0 = r10.f2790
            o82 r0 = (p000.o82) r0
            java.lang.Object r10 = r10.f2789
            yl1 r10 = (p000.yl1) r10
            int r1 = r10.f12678
            switch(r1) {
                case 0: goto L14;
                default: goto Ld;
            }
        Ld:
            zl1 r1 = r10.f12679
            int r1 = r1.m7179()
            goto L1a
        L14:
            zl1 r1 = r10.f12679
            int r1 = r1.m7177()
        L1a:
            int r2 = r10.f12678
            switch(r2) {
                case 0: goto L29;
                default: goto L1f;
            }
        L1f:
            zl1 r2 = r10.f12679
            int r3 = r2.f13161
            int r2 = r2.m7176()
        L27:
            int r3 = r3 - r2
            goto L32
        L29:
            zl1 r2 = r10.f12679
            int r3 = r2.f13160
            int r2 = r2.m7178()
            goto L27
        L32:
            if (r12 <= r11) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = -1
        L37:
            r4 = 0
        L38:
            if (r11 == r12) goto Ld9
            int r5 = r10.f12678
            switch(r5) {
                case 0: goto L46;
                default: goto L3f;
            }
        L3f:
            zl1 r5 = r10.f12679
            android.view.View r5 = r5.m7174(r11)
            goto L4c
        L46:
            zl1 r5 = r10.f12679
            android.view.View r5 = r5.m7174(r11)
        L4c:
            int r6 = r10.f12678
            switch(r6) {
                case 0: goto L6a;
                default: goto L51;
            }
        L51:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            am1 r6 = (p000.am1) r6
            int r7 = r5.getTop()
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            am1 r8 = (p000.am1) r8
            android.graphics.Rect r8 = r8.f326
            int r8 = r8.top
            int r7 = r7 - r8
            int r6 = r6.topMargin
        L68:
            int r7 = r7 - r6
            goto L82
        L6a:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            am1 r6 = (p000.am1) r6
            int r7 = r5.getLeft()
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            am1 r8 = (p000.am1) r8
            android.graphics.Rect r8 = r8.f326
            int r8 = r8.left
            int r7 = r7 - r8
            int r6 = r6.leftMargin
            goto L68
        L82:
            int r6 = r10.f12678
            switch(r6) {
                case 0: goto La0;
                default: goto L87;
            }
        L87:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            am1 r6 = (p000.am1) r6
            int r8 = r5.getBottom()
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            am1 r9 = (p000.am1) r9
            android.graphics.Rect r9 = r9.f326
            int r9 = r9.bottom
            int r8 = r8 + r9
            int r6 = r6.bottomMargin
        L9e:
            int r8 = r8 + r6
            goto Lb8
        La0:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            am1 r6 = (p000.am1) r6
            int r8 = r5.getRight()
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            am1 r9 = (p000.am1) r9
            android.graphics.Rect r9 = r9.f326
            int r9 = r9.right
            int r8 = r8 + r9
            int r6 = r6.rightMargin
            goto L9e
        Lb8:
            r0.f7986 = r1
            r0.f7987 = r3
            r0.f7988 = r7
            r0.f7989 = r8
            if (r13 == 0) goto Lcb
            r0.f7985 = r13
            boolean r6 = r0.m4214()
            if (r6 == 0) goto Lcb
            return r5
        Lcb:
            if (r14 == 0) goto Ld6
            r0.f7985 = r14
            boolean r6 = r0.m4214()
            if (r6 == 0) goto Ld6
            r4 = r5
        Ld6:
            int r11 = r11 + r2
            goto L38
        Ld9:
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public boolean m1631() {
            r2 = this;
            java.lang.Object r0 = r2.f2789
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r2.f2790
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r1 = "mime_type"
            java.lang.String r2 = p000.AbstractC0073bd.m858(r0, r2, r1)
            java.lang.String r0 = "vnd.android.document/directory"
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p000.v41
    /* JADX INFO: renamed from: η */
    public p000.oc2 mo408(android.view.View r6, p000.oc2 r7) {
            r5 = this;
            java.lang.Object r0 = r5.f2790
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            oc2 r6 = p000.b92.m826(r6, r7)
            lc2 r7 = r6.f8033
            boolean r7 = r7.mo2098()
            if (r7 == 0) goto L11
            return r6
        L11:
            java.lang.Object r5 = r5.f2789
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r7 = r6.m4222()
            r5.left = r7
            int r7 = r6.m4224()
            r5.top = r7
            int r7 = r6.m4223()
            r5.right = r7
            int r7 = r6.m4221()
            r5.bottom = r7
            int r7 = r0.getChildCount()
            r1 = 0
        L32:
            if (r1 >= r7) goto L6f
            android.view.View r2 = r0.getChildAt(r1)
            oc2 r2 = p000.b92.m824(r2, r6)
            int r3 = r2.m4222()
            int r4 = r5.left
            int r3 = java.lang.Math.min(r3, r4)
            r5.left = r3
            int r3 = r2.m4224()
            int r4 = r5.top
            int r3 = java.lang.Math.min(r3, r4)
            r5.top = r3
            int r3 = r2.m4223()
            int r4 = r5.right
            int r3 = java.lang.Math.min(r3, r4)
            r5.right = r3
            int r2 = r2.m4221()
            int r3 = r5.bottom
            int r2 = java.lang.Math.min(r2, r3)
            r5.bottom = r2
            int r1 = r1 + 1
            goto L32
        L6f:
            int r7 = r5.left
            int r0 = r5.top
            int r1 = r5.right
            int r5 = r5.bottom
            oc2 r5 = r6.m4225(r7, r0, r1, r5)
            return r5
    }
}

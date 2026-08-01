package defpackage;

/* JADX INFO: renamed from: ᲇᛶᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2073 implements defpackage.InterfaceC1398 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f8900;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f8901;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8902;

    public /* synthetic */ C2073(char r1, int r2) {
            r0 = this;
            r0.f8902 = r2
            r0.<init>()
            return
    }

    public C2073(int r1, byte r2) {
            r0 = this;
            r0.f8902 = r1
            switch(r1) {
                case 5: goto L13;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r1 = 1
            r0.f8901 = r1
            r1 = 0
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.f8900 = r1
            return
        L13:
            r0.<init>()
            r1 = 1
            r0.f8901 = r1
            r1 = 0
            r0.f8900 = r1
            return
    }

    public C2073(int r1, int r2) {
            r0 = this;
            r0.f8902 = r2
            switch(r2) {
                case 8: goto L16;
                default: goto L5;
            }
        L5:
            r0.<init>()
            if (r1 <= 0) goto Lf
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f8900 = r1
            return
        Lf:
            java.lang.String r0 = "The max pool size must be > 0"
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
        L16:
            r0.<init>()
            r0.f8901 = r1
            return
    }

    public C2073(int r1, java.util.ArrayList r2) {
            r0 = this;
            r0.f8902 = r1
            switch(r1) {
                case 9: goto Le;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r1 = 0
            r0.f8901 = r1
            r0.f8900 = r2
            return
        Le:
            r0.<init>()
            r0.f8900 = r2
            return
    }

    public C2073(android.content.Context r5) {
            r4 = this;
            r0 = 0
            r4.f8902 = r0
            int r0 = defpackage.DialogC1507.m2736(r5, r0)
            r4.<init>()
            ᛱᛲᛴᲇ r1 = new ᛱᛲᛴᲇ
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r3 = defpackage.DialogC1507.m2736(r5, r0)
            r2.<init>(r5, r3)
            r1.<init>(r2)
            r4.f8900 = r1
            r4.f8901 = r0
            return
    }

    public C2073(defpackage.RunnableC1425 r2, int r3) {
            r1 = this;
            r0 = 2
            r1.f8902 = r0
            r1.<init>()
            r1.f8900 = r2
            r1.f8901 = r3
            return
    }

    public C2073(defpackage.C1902 r2, int r3) {
            r1 = this;
            r0 = 8
            r1.f8902 = r0
            r1.f8900 = r2
            r1.<init>(r3, r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m3497(java.lang.String r7) {
            java.lang.String r0 = ":memory:"
            boolean r0 = r7.equalsIgnoreCase(r0)
            if (r0 != 0) goto L60
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L11:
            if (r3 > r0) goto L36
            if (r4 != 0) goto L17
            r5 = r3
            goto L18
        L17:
            r5 = r0
        L18:
            char r5 = r7.charAt(r5)
            r6 = 32
            int r5 = defpackage.AbstractC0498.m1275(r5, r6)
            if (r5 > 0) goto L26
            r5 = r1
            goto L27
        L26:
            r5 = r2
        L27:
            if (r4 != 0) goto L30
            if (r5 != 0) goto L2d
            r4 = r1
            goto L11
        L2d:
            int r3 = r3 + 1
            goto L11
        L30:
            if (r5 != 0) goto L33
            goto L36
        L33:
            int r0 = r0 + (-1)
            goto L11
        L36:
            int r0 = r0 + r1
            java.lang.CharSequence r0 = r7.subSequence(r3, r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 != 0) goto L46
            goto L60
        L46:
            java.lang.String r0 = "deleting the database file: "
            java.lang.String r0 = r0.concat(r7)
            java.lang.String r1 = "SupportSQLite"
            android.util.Log.w(r1, r0)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L5a
            r0.<init>(r7)     // Catch: java.lang.Exception -> L5a
            android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch: java.lang.Exception -> L5a
            return
        L5a:
            r7 = move-exception
            java.lang.String r0 = "delete failed: "
            android.util.Log.w(r1, r0, r7)
        L60:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f8902
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.String r0 = new java.lang.String
            java.lang.Object r1 = r3.f8900
            char[] r1 = (char[]) r1
            int r3 = r3.f8901
            int r3 = r3 + 1
            r2 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public void m3498(defpackage.C0633 r2, int r3, int r4) {
            r1 = this;
            java.lang.Object r1 = r1.f8900
            ᲁᛸᲀᛸ r1 = (defpackage.C1902) r1
            ᛲᛳᛲᛸ r0 = new ᛲᛳᛲᛸ
            r0.<init>(r2)
            r1.m3333(r0, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void m3499(defpackage.C2027 r13) {
            r12 = this;
            int r0 = r13.f8740
            r1 = -1
            if (r0 == r1) goto L7a
            int r2 = r12.f8901
            java.lang.Object r3 = r12.f8900
            ᲇᛳᲇ[] r3 = (defpackage.C2027[]) r3
            r4 = r3[r2]
            r13.f8740 = r1
            r5 = 0
            r3[r2] = r5
            r5 = 1
            int r2 = r2 - r5
            r12.f8901 = r2
            if (r13 != r4) goto L19
            return
        L19:
            long r6 = r13.f8741
            long r8 = r4.f8741
            long r8 = r8 - r6
            r6 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 >= 0) goto L25
            goto L2a
        L25:
            if (r13 != 0) goto L29
            r1 = 0
            goto L2a
        L29:
            r1 = r5
        L2a:
            if (r1 != 0) goto L31
            r3[r0] = r4
            r4.f8740 = r0
            return
        L31:
            if (r1 >= 0) goto L76
        L33:
            int r13 = r0 << 1
            int r1 = r13 + 1
            int r2 = r12.f8901
            if (r1 > r2) goto L4f
            java.lang.Object r2 = r12.f8900
            ᲇᛳᲇ[] r2 = (defpackage.C2027[]) r2
            r13 = r2[r13]
            r1 = r2[r1]
            long r8 = r13.f8741
            long r10 = r1.f8741
            long r10 = r10 - r8
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 >= 0) goto L4d
            goto L58
        L4d:
            r13 = r1
            goto L58
        L4f:
            if (r13 > r2) goto L6d
            java.lang.Object r1 = r12.f8900
            r2 = r1
            ᲇᛳᲇ[] r2 = (defpackage.C2027[]) r2
            r13 = r2[r13]
        L58:
            long r8 = r4.f8741
            long r10 = r13.f8741
            long r10 = r10 - r8
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 >= 0) goto L62
            goto L6d
        L62:
            if (r1 != 0) goto L65
            goto L6d
        L65:
            int r1 = r13.f8740
            r13.f8740 = r0
            r2[r0] = r13
            r0 = r1
            goto L33
        L6d:
            java.lang.Object r12 = r12.f8900
            ᲇᛳᲇ[] r12 = (defpackage.C2027[]) r12
            r12[r0] = r4
            r4.f8740 = r0
            return
        L76:
            r12.m3503(r0, r4)
            return
        L7a:
            java.lang.String r12 = "Failed requirement."
            defpackage.C2264.m3684(r12)
            return
    }

    @Override // defpackage.InterfaceC1398
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public java.lang.Object mo913() {
            r5 = this;
            int r0 = r5.f8901
            r1 = 0
            if (r0 <= 0) goto L14
            int r2 = r0 + (-1)
            java.lang.Object r3 = r5.f8900
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = r3[r2]
            r3[r2] = r1
            int r0 = r0 + (-1)
            r5.f8901 = r0
            return r4
        L14:
            return r1
    }

    @Override // defpackage.InterfaceC1398
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public boolean mo914(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = r5.f8900
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r5.f8901
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == r6) goto L11
            int r3 = r3 + 1
            goto L8
        L11:
            java.lang.String r5 = "Already in the pool!"
            defpackage.C2264.m3676(r5)
            return r2
        L17:
            int r1 = r5.f8901
            int r3 = r0.length
            if (r1 >= r3) goto L23
            r0[r1] = r6
            r6 = 1
            int r1 = r1 + r6
            r5.f8901 = r1
            return r6
        L23:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.DialogC1507 m3500() {
            r9 = this;
            ᛸᛶᛵᲀ r0 = new ᛸᛶᛵᲀ
            java.lang.Object r1 = r9.f8900
            ᛱᛲᛴᲇ r1 = (defpackage.C0033) r1
            android.view.ContextThemeWrapper r2 = r1.f526
            int r9 = r9.f8901
            r0.<init>(r2, r9)
            android.view.View r9 = r1.f523
            ᛷᛷᛳᛶ r3 = r0.f6660
            if (r9 == 0) goto L16
            r3.f5797 = r9
            goto L36
        L16:
            java.lang.CharSequence r9 = r1.f524
            if (r9 == 0) goto L23
            r3.f5792 = r9
            android.widget.TextView r4 = r3.f5784
            if (r4 == 0) goto L23
            r4.setText(r9)
        L23:
            android.graphics.drawable.Drawable r9 = r1.f525
            if (r9 == 0) goto L36
            r3.f5796 = r9
            android.widget.ImageView r4 = r3.f5783
            if (r4 == 0) goto L36
            r5 = 0
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r3.f5783
            r4.setImageDrawable(r9)
        L36:
            android.widget.ListAdapter r9 = r1.f530
            r4 = 1
            r5 = 0
            if (r9 == 0) goto L77
            android.view.LayoutInflater r9 = r1.f528
            int r6 = r3.f5800
            android.view.View r9 = r9.inflate(r6, r5)
            androidx.appcompat.app.AlertController$RecycleListView r9 = (androidx.appcompat.app.AlertController$RecycleListView) r9
            boolean r6 = r1.f522
            if (r6 == 0) goto L4d
            int r6 = r3.f5789
            goto L4f
        L4d:
            int r6 = r3.f5787
        L4f:
            android.widget.ListAdapter r7 = r1.f530
            if (r7 == 0) goto L54
            goto L5c
        L54:
            ᲀᛲᲈᛵ r7 = new ᲀᛲᲈᛵ
            r8 = 16908308(0x1020014, float:2.3877285E-38)
            r7.<init>(r2, r6, r8, r5)
        L5c:
            r3.f5788 = r7
            int r2 = r1.f527
            r3.f5803 = r2
            android.content.DialogInterface$OnClickListener r2 = r1.f521
            if (r2 == 0) goto L6e
            ᛳᲈᲇᛷ r2 = new ᛳᲈᲇᛷ
            r2.<init>(r1, r3)
            r9.setOnItemClickListener(r2)
        L6e:
            boolean r2 = r1.f522
            if (r2 == 0) goto L75
            r9.setChoiceMode(r4)
        L75:
            r3.f5790 = r9
        L77:
            r0.setCancelable(r4)
            r0.setCanceledOnTouchOutside(r4)
            r0.setOnCancelListener(r5)
            r0.setOnDismissListener(r5)
            ᛸᛳᛱᲁ r9 = r1.f529
            if (r9 == 0) goto L8a
            r0.setOnKeyListener(r9)
        L8a:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m3501(defpackage.C1326 r5) {
            r4 = this;
        L0:
            if (r5 == 0) goto L3b
            r0 = 0
            r1 = r0
        L4:
            int r2 = r4.f8901
            java.lang.Object r3 = r4.f8900
            ᛷᛸᛱᛸ[] r3 = (defpackage.C1326[]) r3
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            java.lang.Object r2 = r2.f5856
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.f5856
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            goto L36
        L1d:
            int r1 = r1 + 1
            goto L4
        L20:
            int r1 = r3.length
            if (r2 < r1) goto L2e
            int r1 = r3.length
            int r1 = r1 + 6
            ᛷᛸᛱᛸ[] r1 = new defpackage.C1326[r1]
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)
            r4.f8900 = r1
            r3 = r1
        L2e:
            int r0 = r4.f8901
            int r1 = r0 + 1
            r4.f8901 = r1
            r3[r0] = r5
        L36:
            java.lang.Object r5 = r5.f5859
            ᛷᛸᛱᛸ r5 = (defpackage.C1326) r5
            goto L0
        L3b:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m3502(char r5) {
            r4 = this;
            int r0 = r4.f8901
            int r0 = r0 + 1
            r4.f8901 = r0
            java.lang.Object r1 = r4.f8900
            char[] r1 = (char[]) r1
            int r2 = r1.length
            if (r2 > r0) goto L1c
            int r0 = r1.length
            int r0 = r0 * 2
            int r0 = r0 + 1
            char[] r0 = new char[r0]
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.f8900 = r0
            r1 = r0
        L1c:
            int r4 = r4.f8901
            r1[r4] = r5
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public void m3503(int r8, defpackage.C2027 r9) {
            r7 = this;
        L0:
            int r0 = r8 >> 1
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r7.f8900
            ᲇᛳᲇ[] r1 = (defpackage.C2027[]) r1
            r2 = r1[r0]
            long r3 = r2.f8741
            long r5 = r9.f8741
            long r5 = r5 - r3
            r3 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L16
            goto L1f
        L16:
            if (r3 != 0) goto L19
            goto L1f
        L19:
            r2.f8740 = r8
            r1[r8] = r2
            r8 = r0
            goto L0
        L1f:
            java.lang.Object r7 = r7.f8900
            ᲇᛳᲇ[] r7 = (defpackage.C2027[]) r7
            r7[r8] = r9
            r9.f8740 = r8
            return
    }
}

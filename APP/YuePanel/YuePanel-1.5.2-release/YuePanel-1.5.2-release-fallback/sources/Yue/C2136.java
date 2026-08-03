package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(19)
public final class C2136 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.widget.EditText f6718;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f6719;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.emoji2.text.C7527.AbstractC7535 f6720;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f6721;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f6722;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f6723;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۧۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C2137 extends androidx.emoji2.text.C7527.AbstractC7535 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.ref.Reference<android.widget.EditText> f6724;

        public C2137(android.widget.EditText r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f6724 = r0
                return
        }

        @Override // androidx.emoji2.text.C7527.AbstractC7535
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo10010() {
                r2 = this;
                super.mo10010()
                java.lang.ref.Reference<android.widget.EditText> r0 = r2.f6724
                java.lang.Object r0 = r0.get()
                android.widget.EditText r0 = (android.widget.EditText) r0
                r1 = 1
                Yue.C2136.m10044(r0, r1)
                return
        }
    }

    public C2136(android.widget.EditText r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f6721 = r0
            r0 = 0
            r1.f6722 = r0
            r1.f6718 = r2
            r1.f6719 = r3
            r2 = 1
            r1.f6723 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m10044(@Yue.InterfaceC4544 android.widget.EditText r2, int r3) {
            r0 = 1
            if (r3 != r0) goto L21
            if (r2 == 0) goto L21
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L21
            android.text.Editable r2 = r2.getEditableText()
            int r3 = android.text.Selection.getSelectionStart(r2)
            int r0 = android.text.Selection.getSelectionEnd(r2)
            androidx.emoji2.text.ۥ۟۟ r1 = androidx.emoji2.text.C7527.m28937()
            r1.m28961(r2)
            Yue.C2123.m10008(r2, r3, r0)
        L21:
            return
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            r6 = this;
            android.widget.EditText r0 = r6.f6718
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L43
            boolean r0 = r6.m10052()
            if (r0 == 0) goto Lf
            goto L43
        Lf:
            if (r9 > r10) goto L43
            boolean r9 = r7 instanceof android.text.Spannable
            if (r9 == 0) goto L43
            androidx.emoji2.text.ۥ۟۟ r9 = androidx.emoji2.text.C7527.m28937()
            int r9 = r9.m28952()
            if (r9 == 0) goto L38
            r0 = 1
            if (r9 == r0) goto L26
            r7 = 3
            if (r9 == r7) goto L38
            goto L43
        L26:
            r1 = r7
            android.text.Spannable r1 = (android.text.Spannable) r1
            androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.m28937()
            int r3 = r8 + r10
            int r4 = r6.f6721
            int r5 = r6.f6722
            r2 = r8
            r0.m28964(r1, r2, r3, r4, r5)
            goto L43
        L38:
            androidx.emoji2.text.ۥ۟۟ r7 = androidx.emoji2.text.C7527.m28937()
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r8 = r6.m10046()
            r7.m28965(r8)
        L43:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m10045() {
            r1 = this;
            int r0 = r1.f6722
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.emoji2.text.C7527.AbstractC7535 m10046() {
            r2 = this;
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r0 = r2.f6720
            if (r0 != 0) goto Ld
            Yue.ۥ۠۠ۧۢ$ۥ r0 = new Yue.ۥ۠۠ۧۢ$ۥ
            android.widget.EditText r1 = r2.f6718
            r0.<init>(r1)
            r2.f6720 = r0
        Ld:
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r0 = r2.f6720
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m10047() {
            r1 = this;
            int r0 = r1.f6721
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m10048() {
            r1 = this;
            boolean r0 = r1.f6723
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m10049(int r1) {
            r0 = this;
            r0.f6722 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m10050(boolean r3) {
            r2 = this;
            boolean r0 = r2.f6723
            if (r0 == r3) goto L22
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r0 = r2.f6720
            if (r0 == 0) goto L11
            androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.m28937()
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r1 = r2.f6720
            r0.m28966(r1)
        L11:
            r2.f6723 = r3
            if (r3 == 0) goto L22
            android.widget.EditText r3 = r2.f6718
            androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.m28937()
            int r0 = r0.m28952()
            m10044(r3, r0)
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m10051(int r1) {
            r0 = this;
            r0.f6721 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m10052() {
            r1 = this;
            boolean r0 = r1.f6723
            if (r0 == 0) goto L11
            boolean r0 = r1.f6719
            if (r0 != 0) goto Lf
            boolean r0 = androidx.emoji2.text.C7527.m28943()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }
}

package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(19)
public final class C2123 implements android.text.InputFilter {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.widget.TextView f6673;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.emoji2.text.C7527.AbstractC7535 f6674;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C2124 extends androidx.emoji2.text.C7527.AbstractC7535 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.ref.Reference<android.widget.TextView> f6675;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.ref.Reference<Yue.C2123> f6676;

        public C2124(android.widget.TextView r2, Yue.C2123 r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f6675 = r0
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.f6676 = r2
                return
        }

        @Override // androidx.emoji2.text.C7527.AbstractC7535
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo10010() {
                r4 = this;
                super.mo10010()
                java.lang.ref.Reference<android.widget.TextView> r0 = r4.f6675
                java.lang.Object r0 = r0.get()
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.ref.Reference<Yue.ۥ۠۠ۦۥ> r1 = r4.f6676
                java.lang.Object r1 = r1.get()
                android.text.InputFilter r1 = (android.text.InputFilter) r1
                boolean r1 = r4.m10011(r0, r1)
                if (r1 != 0) goto L1a
                return
            L1a:
                boolean r1 = r0.isAttachedToWindow()
                if (r1 == 0) goto L43
                java.lang.CharSequence r1 = r0.getText()
                androidx.emoji2.text.ۥ۟۟ r2 = androidx.emoji2.text.C7527.m28937()
                java.lang.CharSequence r2 = r2.m28961(r1)
                if (r1 != r2) goto L2f
                return
            L2f:
                int r1 = android.text.Selection.getSelectionStart(r2)
                int r3 = android.text.Selection.getSelectionEnd(r2)
                r0.setText(r2)
                boolean r0 = r2 instanceof android.text.Spannable
                if (r0 == 0) goto L43
                android.text.Spannable r2 = (android.text.Spannable) r2
                Yue.C2123.m10008(r2, r1, r3)
            L43:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m10011(@Yue.InterfaceC4544 android.widget.TextView r4, @Yue.InterfaceC4544 android.text.InputFilter r5) {
                r3 = this;
                r0 = 0
                if (r5 == 0) goto L1a
                if (r4 != 0) goto L6
                goto L1a
            L6:
                android.text.InputFilter[] r4 = r4.getFilters()
                if (r4 != 0) goto Ld
                return r0
            Ld:
                r1 = r0
            Le:
                int r2 = r4.length
                if (r1 >= r2) goto L1a
                r2 = r4[r1]
                if (r2 != r5) goto L17
                r4 = 1
                return r4
            L17:
                int r1 = r1 + 1
                goto Le
            L1a:
                return r0
        }
    }

    public C2123(@Yue.InterfaceC4410 android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            r0.f6673 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m10008(android.text.Spannable r0, int r1, int r2) {
            if (r1 < 0) goto L8
            if (r2 < 0) goto L8
            android.text.Selection.setSelection(r0, r1, r2)
            goto L13
        L8:
            if (r1 < 0) goto Le
            android.text.Selection.setSelection(r0, r1)
            goto L13
        Le:
            if (r2 < 0) goto L13
            android.text.Selection.setSelection(r0, r2)
        L13:
            return
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence r3, int r4, int r5, android.text.Spanned r6, int r7, int r8) {
            r2 = this;
            android.widget.TextView r0 = r2.f6673
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L9
            return r3
        L9:
            androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.m28937()
            int r0 = r0.m28952()
            if (r0 == 0) goto L4a
            r1 = 1
            if (r0 == r1) goto L1a
            r4 = 3
            if (r0 == r4) goto L4a
            return r3
        L1a:
            if (r8 != 0) goto L2d
            if (r7 != 0) goto L2d
            int r6 = r6.length()
            if (r6 != 0) goto L2d
            android.widget.TextView r6 = r2.f6673
            java.lang.CharSequence r6 = r6.getText()
            if (r3 != r6) goto L2d
            goto L49
        L2d:
            if (r3 == 0) goto L49
            if (r4 != 0) goto L38
            int r6 = r3.length()
            if (r5 != r6) goto L38
            goto L3c
        L38:
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
        L3c:
            androidx.emoji2.text.ۥ۟۟ r4 = androidx.emoji2.text.C7527.m28937()
            int r5 = r3.length()
            r6 = 0
            java.lang.CharSequence r3 = r4.m28962(r3, r6, r5)
        L49:
            return r3
        L4a:
            androidx.emoji2.text.ۥ۟۟ r4 = androidx.emoji2.text.C7527.m28937()
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r5 = r2.m10009()
            r4.m28965(r5)
            return r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.emoji2.text.C7527.AbstractC7535 m10009() {
            r2 = this;
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r0 = r2.f6674
            if (r0 != 0) goto Ld
            Yue.ۥ۠۠ۦۥ$ۥ r0 = new Yue.ۥ۠۠ۦۥ$ۥ
            android.widget.TextView r1 = r2.f6673
            r0.<init>(r1, r2)
            r2.f6674 = r0
        Ld:
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r0 = r2.f6674
            return r0
    }
}

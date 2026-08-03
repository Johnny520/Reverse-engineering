package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6595 implements android.text.Spannable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f23018;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public android.text.Spannable f23019;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C6596 {
        public C6596() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.util.stream.IntStream m25388(java.lang.CharSequence r0) {
                java.util.stream.IntStream r0 = r0.chars()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.util.stream.IntStream m25389(java.lang.CharSequence r0) {
                java.util.stream.IntStream r0 = r0.codePoints()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ$ۥ۟, reason: contains not printable characters */
    public static class C6597 {
        public C6597() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean mo25390(java.lang.CharSequence r1) {
                r0 = this;
                boolean r1 = r1 instanceof Yue.C4853
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C6598 extends Yue.C6595.C6597 {
        public C6598() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C6595.C6597
        /* JADX INFO: renamed from: ۥ */
        public boolean mo25390(java.lang.CharSequence r2) {
                r1 = this;
                boolean r0 = Yue.C4845.m19135(r2)
                if (r0 != 0) goto Ld
                boolean r2 = r2 instanceof Yue.C4853
                if (r2 == 0) goto Lb
                goto Ld
            Lb:
                r2 = 0
                goto Le
            Ld:
                r2 = 1
            Le:
                return r2
        }
    }

    public C6595(@Yue.InterfaceC4410 android.text.Spannable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f23018 = r0
            r1.f23019 = r2
            return
    }

    public C6595(@Yue.InterfaceC4410 android.text.Spanned r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f23018 = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.f23019 = r0
            return
    }

    public C6595(@Yue.InterfaceC4410 java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f23018 = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.f23019 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C6595.C6597 m25385() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Lc
            Yue.ۥۣۢ۠ۦ$ۥ۟ r0 = new Yue.ۥۣۢ۠ۦ$ۥ۟
            r0.<init>()
            goto L11
        Lc:
            Yue.ۥۣۢ۠ۦ$ۥ۟۟ r0 = new Yue.ۥۣۢ۠ۦ$ۥ۟۟
            r0.<init>()
        L11:
            return r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // java.lang.CharSequence
    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(api = 24)
    public java.util.stream.IntStream chars() {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            java.util.stream.IntStream r0 = Yue.C6595.C6596.m25388(r0)
            return r0
    }

    @Override // java.lang.CharSequence
    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(api = 24)
    public java.util.stream.IntStream codePoints() {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            java.util.stream.IntStream r0 = Yue.C6595.C6596.m25389(r0)
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r2, int r3, java.lang.Class<T> r4) {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            java.lang.Object[] r2 = r0.getSpans(r2, r3, r4)
            return r2
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r2) {
            r1 = this;
            r1.m25386()
            android.text.Spannable r0 = r1.f23019
            r0.removeSpan(r2)
            return
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            r1.m25386()
            android.text.Spannable r0 = r1.f23019
            r0.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // java.lang.CharSequence
    @Yue.InterfaceC4410
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m25386() {
            r2 = this;
            android.text.Spannable r0 = r2.f23019
            boolean r1 = r2.f23018
            if (r1 != 0) goto L17
            Yue.ۥۣۢ۠ۦ$ۥ۟ r1 = m25385()
            boolean r1 = r1.mo25390(r0)
            if (r1 == 0) goto L17
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r2.f23019 = r1
        L17:
            r0 = 1
            r2.f23018 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.text.Spannable m25387() {
            r1 = this;
            android.text.Spannable r0 = r1.f23019
            return r0
    }
}

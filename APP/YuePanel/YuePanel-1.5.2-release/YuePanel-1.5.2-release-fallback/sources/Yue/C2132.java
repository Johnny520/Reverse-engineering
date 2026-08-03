package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2132 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C2132.C2134 f6713;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۧۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C2133 extends Yue.C2132.C2134 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.widget.TextView f6714;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C2123 f6715;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f6716;

        public C2133(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                r1.f6714 = r2
                r0 = 1
                r1.f6716 = r0
                Yue.ۥ۠۠ۦۥ r0 = new Yue.ۥ۠۠ۦۥ
                r0.<init>(r2)
                r1.f6715 = r0
                return
        }

        @Override // Yue.C2132.C2134
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.text.InputFilter[] mo10030(@Yue.InterfaceC4410 android.text.InputFilter[] r2) {
                r1 = this;
                boolean r0 = r1.f6716
                if (r0 != 0) goto L9
                android.text.InputFilter[] r2 = r1.m10038(r2)
                return r2
            L9:
                android.text.InputFilter[] r2 = r1.m10036(r2)
                return r2
        }

        @Override // Yue.C2132.C2134
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean mo10031() {
                r1 = this;
                boolean r0 = r1.f6716
                return r0
        }

        @Override // Yue.C2132.C2134
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo10032(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                r0.mo10034()
            L5:
                return
        }

        @Override // Yue.C2132.C2134
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo10033(boolean r1) {
                r0 = this;
                r0.f6716 = r1
                r0.mo10034()
                r0.m10041()
                return
        }

        @Override // Yue.C2132.C2134
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo10034() {
                r2 = this;
                android.widget.TextView r0 = r2.f6714
                android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
                android.text.method.TransformationMethod r0 = r2.mo10035(r0)
                android.widget.TextView r1 = r2.f6714
                r1.setTransformationMethod(r0)
                return
        }

        @Override // Yue.C2132.C2134
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public android.text.method.TransformationMethod mo10035(@Yue.InterfaceC4544 android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.f6716
                if (r0 == 0) goto L9
                android.text.method.TransformationMethod r2 = r1.m10042(r2)
                return r2
            L9:
                android.text.method.TransformationMethod r2 = r1.m10040(r2)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final android.text.InputFilter[] m10036(@Yue.InterfaceC4410 android.text.InputFilter[] r6) {
                r5 = this;
                int r0 = r6.length
                r1 = 0
                r2 = r1
            L3:
                if (r2 >= r0) goto Lf
                r3 = r6[r2]
                Yue.ۥ۠۠ۦۥ r4 = r5.f6715
                if (r3 != r4) goto Lc
                return r6
            Lc:
                int r2 = r2 + 1
                goto L3
            Lf:
                int r2 = r6.length
                int r2 = r2 + 1
                android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
                java.lang.System.arraycopy(r6, r1, r2, r1, r0)
                Yue.ۥ۠۠ۦۥ r6 = r5.f6715
                r2[r0] = r6
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final android.util.SparseArray<android.text.InputFilter> m10037(@Yue.InterfaceC4410 android.text.InputFilter[] r5) {
                r4 = this;
                android.util.SparseArray r0 = new android.util.SparseArray
                r1 = 1
                r0.<init>(r1)
                r1 = 0
            L7:
                int r2 = r5.length
                if (r1 >= r2) goto L16
                r2 = r5[r1]
                boolean r3 = r2 instanceof Yue.C2123
                if (r3 == 0) goto L13
                r0.put(r1, r2)
            L13:
                int r1 = r1 + 1
                goto L7
            L16:
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final android.text.InputFilter[] m10038(@Yue.InterfaceC4410 android.text.InputFilter[] r7) {
                r6 = this;
                android.util.SparseArray r0 = r6.m10037(r7)
                int r1 = r0.size()
                if (r1 != 0) goto Lb
                return r7
            Lb:
                int r1 = r7.length
                int r2 = r7.length
                int r3 = r0.size()
                int r2 = r2 - r3
                android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
                r3 = 0
                r4 = r3
            L16:
                if (r3 >= r1) goto L27
                int r5 = r0.indexOfKey(r3)
                if (r5 >= 0) goto L24
                r5 = r7[r3]
                r2[r4] = r5
                int r4 = r4 + 1
            L24:
                int r3 = r3 + 1
                goto L16
            L27:
                return r2
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m10039(boolean r1) {
                r0 = this;
                r0.f6716 = r1
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final android.text.method.TransformationMethod m10040(@Yue.InterfaceC4544 android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C2138
                if (r0 == 0) goto La
                Yue.ۥۣ۠۠ۧ r2 = (Yue.C2138) r2
                android.text.method.TransformationMethod r2 = r2.m10053()
            La:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m10041() {
                r2 = this;
                android.widget.TextView r0 = r2.f6714
                android.text.InputFilter[] r0 = r0.getFilters()
                android.widget.TextView r1 = r2.f6714
                android.text.InputFilter[] r0 = r2.mo10030(r0)
                r1.setFilters(r0)
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final android.text.method.TransformationMethod m10042(@Yue.InterfaceC4544 android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C2138
                if (r0 == 0) goto L5
                return r2
            L5:
                boolean r0 = r2 instanceof android.text.method.PasswordTransformationMethod
                if (r0 == 0) goto La
                return r2
            La:
                Yue.ۥۣ۠۠ۧ r0 = new Yue.ۥۣ۠۠ۧ
                r0.<init>(r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۧۡ$ۥ۟, reason: contains not printable characters */
    public static class C2134 {
        public C2134() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ */
        public android.text.InputFilter[] mo10030(@Yue.InterfaceC4410 android.text.InputFilter[] r1) {
                r0 = this;
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo10031() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo10032(boolean r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo10033(boolean r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo10034() {
                r0 = this;
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public android.text.method.TransformationMethod mo10035(@Yue.InterfaceC4544 android.text.method.TransformationMethod r1) {
                r0 = this;
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۧۡ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C2135 extends Yue.C2132.C2134 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C2132.C2133 f6717;

        public C2135(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                Yue.ۥ۠۠ۧۡ$ۥ r0 = new Yue.ۥ۠۠ۧۡ$ۥ
                r0.<init>(r2)
                r1.f6717 = r0
                return
        }

        @Override // Yue.C2132.C2134
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ */
        public android.text.InputFilter[] mo10030(@Yue.InterfaceC4410 android.text.InputFilter[] r2) {
                r1 = this;
                boolean r0 = r1.m10043()
                if (r0 == 0) goto L7
                return r2
            L7:
                Yue.ۥ۠۠ۧۡ$ۥ r0 = r1.f6717
                android.text.InputFilter[] r2 = r0.mo10030(r2)
                return r2
        }

        @Override // Yue.C2132.C2134
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo10031() {
                r1 = this;
                Yue.ۥ۠۠ۧۡ$ۥ r0 = r1.f6717
                boolean r0 = r0.mo10031()
                return r0
        }

        @Override // Yue.C2132.C2134
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo10032(boolean r2) {
                r1 = this;
                boolean r0 = r1.m10043()
                if (r0 == 0) goto L7
                return
            L7:
                Yue.ۥ۠۠ۧۡ$ۥ r0 = r1.f6717
                r0.mo10032(r2)
                return
        }

        @Override // Yue.C2132.C2134
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo10033(boolean r2) {
                r1 = this;
                boolean r0 = r1.m10043()
                if (r0 == 0) goto Lc
                Yue.ۥ۠۠ۧۡ$ۥ r0 = r1.f6717
                r0.m10039(r2)
                goto L11
            Lc:
                Yue.ۥ۠۠ۧۡ$ۥ r0 = r1.f6717
                r0.mo10033(r2)
            L11:
                return
        }

        @Override // Yue.C2132.C2134
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo10034() {
                r1 = this;
                boolean r0 = r1.m10043()
                if (r0 == 0) goto L7
                return
            L7:
                Yue.ۥ۠۠ۧۡ$ۥ r0 = r1.f6717
                r0.mo10034()
                return
        }

        @Override // Yue.C2132.C2134
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public android.text.method.TransformationMethod mo10035(@Yue.InterfaceC4544 android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.m10043()
                if (r0 == 0) goto L7
                return r2
            L7:
                Yue.ۥ۠۠ۧۡ$ۥ r0 = r1.f6717
                android.text.method.TransformationMethod r2 = r0.mo10035(r2)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m10043() {
                r1 = this;
                boolean r0 = androidx.emoji2.text.C7527.m28943()
                r0 = r0 ^ 1
                return r0
        }
    }

    public C2132(@Yue.InterfaceC4410 android.widget.TextView r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public C2132(@Yue.InterfaceC4410 android.widget.TextView r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "textView cannot be null"
            Yue.C4868.m19182(r2, r0)
            if (r3 != 0) goto L12
            Yue.ۥ۠۠ۧۡ$ۥ۟۟ r3 = new Yue.ۥ۠۠ۧۡ$ۥ۟۟
            r3.<init>(r2)
            r1.f6713 = r3
            goto L19
        L12:
            Yue.ۥ۠۠ۧۡ$ۥ r3 = new Yue.ۥ۠۠ۧۡ$ۥ
            r3.<init>(r2)
            r1.f6713 = r3
        L19:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.text.InputFilter[] m10024(@Yue.InterfaceC4410 android.text.InputFilter[] r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۡ$ۥ۟ r0 = r1.f6713
            android.text.InputFilter[] r2 = r0.mo10030(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m10025() {
            r1 = this;
            Yue.ۥ۠۠ۧۡ$ۥ۟ r0 = r1.f6713
            boolean r0 = r0.mo10031()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m10026(boolean r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۡ$ۥ۟ r0 = r1.f6713
            r0.mo10032(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m10027(boolean r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۡ$ۥ۟ r0 = r1.f6713
            r0.mo10033(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m10028() {
            r1 = this;
            Yue.ۥ۠۠ۧۡ$ۥ۟ r0 = r1.f6713
            r0.mo10034()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.text.method.TransformationMethod m10029(@Yue.InterfaceC4544 android.text.method.TransformationMethod r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۡ$ۥ۟ r0 = r1.f6713
            android.text.method.TransformationMethod r2 = r0.mo10035(r2)
            return r2
    }
}

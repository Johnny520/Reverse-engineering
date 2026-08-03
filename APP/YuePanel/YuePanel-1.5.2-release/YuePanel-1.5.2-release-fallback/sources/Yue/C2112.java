package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2112 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C2112.C2114 f6650;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f6651;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f6652;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C2113 extends Yue.C2112.C2114 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.widget.EditText f6653;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C2136 f6654;

        public C2113(@Yue.InterfaceC4410 android.widget.EditText r2, boolean r3) {
                r1 = this;
                r1.<init>()
                r1.f6653 = r2
                Yue.ۥ۠۠ۧۢ r0 = new Yue.ۥ۠۠ۧۢ
                r0.<init>(r2, r3)
                r1.f6654 = r0
                r2.addTextChangedListener(r0)
                android.text.Editable$Factory r3 = Yue.C2115.getInstance()
                r2.setEditableFactory(r3)
                return
        }

        @Override // Yue.C2112.C2114
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.text.method.KeyListener mo9996(@Yue.InterfaceC4544 android.text.method.KeyListener r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C2125
                if (r0 == 0) goto L5
                return r2
            L5:
                if (r2 != 0) goto L9
                r2 = 0
                return r2
            L9:
                boolean r0 = r2 instanceof android.text.method.NumberKeyListener
                if (r0 == 0) goto Le
                return r2
            Le:
                Yue.ۥ۠۠ۦۦ r0 = new Yue.ۥ۠۠ۦۦ
                r0.<init>(r2)
                return r0
        }

        @Override // Yue.C2112.C2114
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean mo9997() {
                r1 = this;
                Yue.ۥ۠۠ۧۢ r0 = r1.f6654
                boolean r0 = r0.m10048()
                return r0
        }

        @Override // Yue.C2112.C2114
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.view.inputmethod.InputConnection mo9998(@Yue.InterfaceC4410 android.view.inputmethod.InputConnection r3, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r4) {
                r2 = this;
                boolean r0 = r3 instanceof Yue.C2121
                if (r0 == 0) goto L5
                return r3
            L5:
                Yue.ۥ۠۠ۦۤ r0 = new Yue.ۥ۠۠ۦۤ
                android.widget.EditText r1 = r2.f6653
                r0.<init>(r1, r3, r4)
                return r0
        }

        @Override // Yue.C2112.C2114
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo9999(int r2) {
                r1 = this;
                Yue.ۥ۠۠ۧۢ r0 = r1.f6654
                r0.m10049(r2)
                return
        }

        @Override // Yue.C2112.C2114
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo10000(boolean r2) {
                r1 = this;
                Yue.ۥ۠۠ۧۢ r0 = r1.f6654
                r0.m10050(r2)
                return
        }

        @Override // Yue.C2112.C2114
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo10001(int r2) {
                r1 = this;
                Yue.ۥ۠۠ۧۢ r0 = r1.f6654
                r0.m10051(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦ۠$ۥ۟, reason: contains not printable characters */
    public static class C2114 {
        public C2114() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ */
        public android.text.method.KeyListener mo9996(@Yue.InterfaceC4544 android.text.method.KeyListener r1) {
                r0 = this;
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo9997() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public android.view.inputmethod.InputConnection mo9998(@Yue.InterfaceC4410 android.view.inputmethod.InputConnection r1, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r2) {
                r0 = this;
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo9999(int r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo10000(boolean r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo10001(int r1) {
                r0 = this;
                return
        }
    }

    public C2112(@Yue.InterfaceC4410 android.widget.EditText r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public C2112(@Yue.InterfaceC4410 android.widget.EditText r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f6651 = r0
            r0 = 0
            r1.f6652 = r0
            java.lang.String r0 = "editText cannot be null"
            Yue.C4868.m19182(r2, r0)
            Yue.ۥ۠۠ۦ۠$ۥ r0 = new Yue.ۥ۠۠ۦ۠$ۥ
            r0.<init>(r2, r3)
            r1.f6650 = r0
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m9988() {
            r1 = this;
            int r0 = r1.f6652
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.text.method.KeyListener m9989(@Yue.InterfaceC4544 android.text.method.KeyListener r2) {
            r1 = this;
            Yue.ۥ۠۠ۦ۠$ۥ۟ r0 = r1.f6650
            android.text.method.KeyListener r2 = r0.mo9996(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m9990() {
            r1 = this;
            int r0 = r1.f6651
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m9991() {
            r1 = this;
            Yue.ۥ۠۠ۦ۠$ۥ۟ r0 = r1.f6650
            boolean r0 = r0.mo9997()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.view.inputmethod.InputConnection m9992(@Yue.InterfaceC4544 android.view.inputmethod.InputConnection r2, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r3) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            Yue.ۥ۠۠ۦ۠$ۥ۟ r0 = r1.f6650
            android.view.inputmethod.InputConnection r2 = r0.mo9998(r2, r3)
            return r2
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m9993(int r2) {
            r1 = this;
            r1.f6652 = r2
            Yue.ۥ۠۠ۦ۠$ۥ۟ r0 = r1.f6650
            r0.mo9999(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m9994(boolean r2) {
            r1 = this;
            Yue.ۥ۠۠ۦ۠$ۥ۟ r0 = r1.f6650
            r0.mo10000(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m9995(@Yue.InterfaceC3281(from = 0) int r2) {
            r1 = this;
            java.lang.String r0 = "maxEmojiCount should be greater than 0"
            Yue.C4868.m19179(r2, r0)
            r1.f6651 = r2
            Yue.ۥ۠۠ۦ۠$ۥ۟ r0 = r1.f6650
            r0.mo10001(r2)
            return
    }
}

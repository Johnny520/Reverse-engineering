package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public final class C5841 extends android.text.SpannableStringBuilder {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.lang.Class<?> f21417;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.util.List<Yue.C5841.C5842> f21418;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۟ۨ$ۥ, reason: contains not printable characters */
    public static class C5842 implements android.text.TextWatcher, android.text.SpanWatcher {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final java.lang.Object f21419;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final java.util.concurrent.atomic.AtomicInteger f21420;

        public C5842(java.lang.Object r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.f21420 = r0
                r2.f21419 = r3
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r2) {
                r1 = this;
                java.lang.Object r0 = r1.f21419
                android.text.TextWatcher r0 = (android.text.TextWatcher) r0
                r0.afterTextChanged(r2)
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
                r1 = this;
                java.lang.Object r0 = r1.f21419
                android.text.TextWatcher r0 = (android.text.TextWatcher) r0
                r0.beforeTextChanged(r2, r3, r4, r5)
                return
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(android.text.Spannable r2, java.lang.Object r3, int r4, int r5) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f21420
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r1.m21714(r3)
                if (r0 == 0) goto Lf
                return
            Lf:
                java.lang.Object r0 = r1.f21419
                android.text.SpanWatcher r0 = (android.text.SpanWatcher) r0
                r0.onSpanAdded(r2, r3, r4, r5)
                return
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
                r8 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r8.f21420
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r8.m21714(r10)
                if (r0 == 0) goto Lf
                return
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L1e
                r0 = 0
                if (r11 <= r12) goto L19
                r11 = r0
            L19:
                if (r13 <= r14) goto L1e
                r4 = r11
                r6 = r0
                goto L20
            L1e:
                r4 = r11
                r6 = r13
            L20:
                java.lang.Object r11 = r8.f21419
                r1 = r11
                android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
                r2 = r9
                r3 = r10
                r5 = r12
                r7 = r14
                r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(android.text.Spannable r2, java.lang.Object r3, int r4, int r5) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f21420
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r1.m21714(r3)
                if (r0 == 0) goto Lf
                return
            Lf:
                java.lang.Object r0 = r1.f21419
                android.text.SpanWatcher r0 = (android.text.SpanWatcher) r0
                r0.onSpanRemoved(r2, r3, r4, r5)
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
                r1 = this;
                java.lang.Object r0 = r1.f21419
                android.text.TextWatcher r0 = (android.text.TextWatcher) r0
                r0.onTextChanged(r2, r3, r4, r5)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m21713() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f21420
                r0.incrementAndGet()
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m21714(java.lang.Object r1) {
                r0 = this;
                boolean r1 = r1 instanceof Yue.AbstractC2131
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m21715() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f21420
                r0.decrementAndGet()
                return
        }
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public C5841(@Yue.InterfaceC4410 java.lang.Class<?> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f21418 = r0
            java.lang.String r0 = "watcherClass cannot be null"
            Yue.C4868.m19182(r2, r0)
            r1.f21417 = r2
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public C5841(@Yue.InterfaceC4410 java.lang.Class<?> r1, @Yue.InterfaceC4410 java.lang.CharSequence r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f21418 = r2
            java.lang.String r2 = "watcherClass cannot be null"
            Yue.C4868.m19182(r1, r2)
            r0.f21417 = r1
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public C5841(@Yue.InterfaceC4410 java.lang.Class<?> r1, @Yue.InterfaceC4410 java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f21418 = r2
            java.lang.String r2 = "watcherClass cannot be null"
            Yue.C4868.m19182(r1, r2)
            r0.f21417 = r1
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C5841 m21704(@Yue.InterfaceC4410 java.lang.Class<?> r1, @Yue.InterfaceC4410 java.lang.CharSequence r2) {
            Yue.ۥۣۢ۟ۨ r0 = new Yue.ۥۣۢ۟ۨ
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.text.Editable append(char r1) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.text.Editable append(@android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r1) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.text.Editable append(@android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public android.text.SpannableStringBuilder append(char r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public android.text.SpannableStringBuilder append(@android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public android.text.SpannableStringBuilder append(@android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.text.SpannableStringBuilder append(java.lang.CharSequence r1, java.lang.Object r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ java.lang.Appendable append(@android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ java.lang.Appendable append(@android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public /* bridge */ /* synthetic */ android.text.Editable delete(int r1, int r2) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.delete(r1, r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.text.SpannableStringBuilder delete(int r1, int r2) {
            r0 = this;
            super.delete(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.m21711(r2)
            if (r0 == 0) goto Ld
            Yue.ۥۣۢ۟ۨ$ۥ r0 = r1.m21709(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.m21711(r2)
            if (r0 == 0) goto Ld
            Yue.ۥۣۢ۟ۨ$ۥ r0 = r1.m21709(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.m21711(r2)
            if (r0 == 0) goto Ld
            Yue.ۥۣۢ۟ۨ$ۥ r0 = r1.m21709(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanStart(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @android.annotation.SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int r2, int r3, @Yue.InterfaceC4410 java.lang.Class<T> r4) {
            r1 = this;
            boolean r0 = r1.m21710(r4)
            if (r0 == 0) goto L23
            java.lang.Class<Yue.ۥۣۢ۟ۨ$ۥ> r0 = Yue.C5841.C5842.class
            java.lang.Object[] r2 = super.getSpans(r2, r3, r0)
            Yue.ۥۣۢ۟ۨ$ۥ[] r2 = (Yue.C5841.C5842[]) r2
            int r3 = r2.length
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r4, r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L16:
            int r0 = r2.length
            if (r4 >= r0) goto L22
            r0 = r2[r4]
            java.lang.Object r0 = r0.f21419
            r3[r4] = r0
            int r4 = r4 + 1
            goto L16
        L22:
            return r3
        L23:
            java.lang.Object[] r2 = super.getSpans(r2, r3, r4)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public /* bridge */ /* synthetic */ android.text.Editable insert(int r1, java.lang.CharSequence r2) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.insert(r1, r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public /* bridge */ /* synthetic */ android.text.Editable insert(int r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.insert(r1, r2, r3, r4)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.text.SpannableStringBuilder insert(int r1, java.lang.CharSequence r2) {
            r0 = this;
            super.insert(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.text.SpannableStringBuilder insert(int r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            super.insert(r1, r2, r3, r4)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int r2, int r3, @Yue.InterfaceC4544 java.lang.Class r4) {
            r1 = this;
            if (r4 == 0) goto L8
            boolean r0 = r1.m21710(r4)
            if (r0 == 0) goto La
        L8:
            java.lang.Class<Yue.ۥۣۢ۟ۨ$ۥ> r4 = Yue.C5841.C5842.class
        La:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.m21711(r2)
            if (r0 == 0) goto Le
            Yue.ۥۣۢ۟ۨ$ۥ r0 = r1.m21709(r2)
            if (r0 == 0) goto Lf
            r2 = r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            super.removeSpan(r2)
            if (r0 == 0) goto L19
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r2 = r1.f21418
            r2.remove(r0)
        L19:
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public /* bridge */ /* synthetic */ android.text.Editable replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.replace(r1, r2, r3)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public /* bridge */ /* synthetic */ android.text.Editable replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.replace(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.m21706()
            super.replace(r1, r2, r3)
            r0.m21712()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            r0.m21706()
            super.replace(r1, r2, r3, r4, r5)
            r0.m21712()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@Yue.InterfaceC4544 java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.m21711(r2)
            if (r0 == 0) goto L11
            Yue.ۥۣۢ۟ۨ$ۥ r0 = new Yue.ۥۣۢ۟ۨ$ۥ
            r0.<init>(r2)
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r2 = r1.f21418
            r2.add(r0)
            r2 = r0
        L11:
            super.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @android.annotation.SuppressLint({"UnknownNullness"})
    public java.lang.CharSequence subSequence(int r3, int r4) {
            r2 = this;
            Yue.ۥۣۢ۟ۨ r0 = new Yue.ۥۣۢ۟ۨ
            java.lang.Class<?> r1 = r2.f21417
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m21705() {
            r0 = this;
            r0.m21706()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m21706() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r1 = r2.f21418
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r1 = r2.f21418
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۣۢ۟ۨ$ۥ r1 = (Yue.C5841.C5842) r1
            r1.m21713()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m21707() {
            r0 = this;
            r0.m21712()
            r0.m21708()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m21708() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r2 = r5.f21418
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r2 = r5.f21418
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۣۢ۟ۨ$ۥ r2 = (Yue.C5841.C5842) r2
            int r3 = r5.length()
            int r4 = r5.length()
            r2.onTextChanged(r5, r0, r3, r4)
            int r1 = r1 + 1
            goto L2
        L20:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C5841.C5842 m21709(java.lang.Object r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r1 = r3.f21418
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r1 = r3.f21418
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۣۢ۟ۨ$ۥ r1 = (Yue.C5841.C5842) r1
            java.lang.Object r2 = r1.f21419
            if (r2 != r4) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m21710(@Yue.InterfaceC4410 java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<?> r0 = r1.f21417
            if (r0 != r2) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m21711(@Yue.InterfaceC4544 java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto Le
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r0.m21710(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m21712() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r1 = r2.f21418
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<Yue.ۥۣۢ۟ۨ$ۥ> r1 = r2.f21418
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۣۢ۟ۨ$ۥ r1 = (Yue.C5841.C5842) r1
            r1.m21715()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }
}

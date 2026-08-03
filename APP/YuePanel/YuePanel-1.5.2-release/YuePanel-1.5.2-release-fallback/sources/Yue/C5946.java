package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5946 extends Yue.C1998 {

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f21677 = "StateListDrawableCompat";

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final boolean f21678 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public Yue.C5946.C5947 f21679;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f21680;

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟ۥ$ۥ, reason: contains not printable characters */
    public static class C5947 extends Yue.C1998.AbstractC2002 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public int[][] f21681;

        public C5947(Yue.C5946.C5947 r1, Yue.C5946 r2, android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto La
                int[][] r1 = r1.f21681
                r0.f21681 = r1
                goto L12
            La:
                int r1 = r0.m9268()
                int[][] r1 = new int[r1][]
                r0.f21681 = r1
            L12:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC4410
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                Yue.ۥۢ۠۟ۥ r0 = new Yue.ۥۢ۠۟ۥ
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC4410
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                Yue.ۥۢ۠۟ۥ r0 = new Yue.ۥۢ۠۟ۥ
                r0.<init>(r1, r2)
                return r0
        }

        @Override // Yue.C1998.AbstractC2002
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public void mo9279(int r3, int r4) {
                r2 = this;
                super.mo9279(r3, r4)
                int[][] r4 = new int[r4][]
                int[][] r0 = r2.f21681
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r3)
                r2.f21681 = r4
                return
        }

        @Override // Yue.C1998.AbstractC2002
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public void mo1470() {
                r3 = this;
                int[][] r0 = r3.f21681
                int r1 = r0.length
                int[][] r1 = new int[r1][]
                int r0 = r0.length
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L1d
                int[][] r2 = r3.f21681
                r2 = r2[r0]
                if (r2 == 0) goto L17
                java.lang.Object r2 = r2.clone()
                int[] r2 = (int[]) r2
                goto L18
            L17:
                r2 = 0
            L18:
                r1[r0] = r2
                int r0 = r0 + (-1)
                goto L8
            L1d:
                r3.f21681 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public int m22062(int[] r2, android.graphics.drawable.Drawable r3) {
                r1 = this;
                int r3 = r1.m9262(r3)
                int[][] r0 = r1.f21681
                r0[r3] = r2
                return r3
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public int m22063(int[] r5) {
                r4 = this;
                int[][] r0 = r4.f21681
                int r1 = r4.m9270()
                r2 = 0
            L7:
                if (r2 >= r1) goto L15
                r3 = r0[r2]
                boolean r3 = android.util.StateSet.stateSetMatches(r3, r5)
                if (r3 == 0) goto L12
                return r2
            L12:
                int r2 = r2 + 1
                goto L7
            L15:
                r5 = -1
                return r5
        }
    }

    public C5946() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    public C5946(@Yue.InterfaceC4544 Yue.C5946.C5947 r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.mo1456(r1)
        L8:
            return
    }

    public C5946(Yue.C5946.C5947 r2, android.content.res.Resources r3) {
            r1 = this;
            r1.<init>()
            Yue.ۥۢ۠۟ۥ$ۥ r0 = new Yue.ۥۢ۠۟ۥ$ۥ
            r0.<init>(r2, r1, r3)
            r1.mo1456(r0)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    private void m22053(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r7 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r7.f21679
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L8:
            int r3 = r10.next()
            if (r3 == r2) goto L7a
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L17
            r5 = 3
            if (r3 == r5) goto L7a
        L17:
            r5 = 2
            if (r3 == r5) goto L1b
            goto L8
        L1b:
            if (r4 > r1) goto L8
            java.lang.String r3 = r10.getName()
            java.lang.String r4 = "item"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2a
            goto L8
        L2a:
            int[] r3 = Yue.C5115.C5117.f18565
            android.content.res.TypedArray r3 = Yue.C6478.m23906(r9, r12, r11, r3)
            int r4 = Yue.C5115.C5117.f18566
            r6 = -1
            int r4 = r3.getResourceId(r4, r6)
            if (r4 <= 0) goto L42
            Yue.ۥۡۦۦۢ r6 = Yue.C5354.m20196()
            android.graphics.drawable.Drawable r4 = r6.m20207(r8, r4)
            goto L43
        L42:
            r4 = 0
        L43:
            r3.recycle()
            int[] r3 = r7.m22056(r11)
            if (r4 != 0) goto L76
        L4c:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L54
            goto L4c
        L54:
            if (r4 != r5) goto L5b
            android.graphics.drawable.Drawable r4 = Yue.C1407.C1408.m7006(r9, r10, r11, r12)
            goto L76
        L5b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L76:
            r0.m22062(r3, r4)
            goto L8
        L7a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    private void m22054(android.content.res.TypedArray r4) {
            r3 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r3.f21679
            int r1 = r0.f6362
            int r2 = Yue.C1407.C1408.m7007(r4)
            r1 = r1 | r2
            r0.f6362 = r1
            int r1 = Yue.C5115.C5117.f18561
            boolean r2 = r0.f6367
            boolean r1 = r4.getBoolean(r1, r2)
            r0.f6367 = r1
            int r1 = Yue.C5115.C5117.f18562
            boolean r2 = r0.f6370
            boolean r1 = r4.getBoolean(r1, r2)
            r0.f6370 = r1
            int r1 = Yue.C5115.C5117.f18563
            int r2 = r0.f6385
            int r1 = r4.getInt(r1, r2)
            r0.f6385 = r1
            int r1 = Yue.C5115.C5117.f18564
            int r2 = r0.f6386
            int r1 = r4.getInt(r1, r2)
            r0.f6386 = r1
            int r1 = Yue.C5115.C5117.f18559
            boolean r2 = r0.f6382
            boolean r4 = r4.getBoolean(r1, r2)
            r0.f6382 = r4
            return
    }

    @Override // Yue.C1998, android.graphics.drawable.Drawable
    @Yue.InterfaceC5336(21)
    public void applyTheme(@Yue.InterfaceC4410 android.content.res.Resources.Theme r1) {
            r0 = this;
            super.applyTheme(r1)
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
            return
    }

    @Override // Yue.C1998, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.C1998, android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f21680
            if (r0 != 0) goto L12
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L12
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r1.f21679
            r0.mo1470()
            r0 = 1
            r1.f21680 = r0
        L12:
            return r1
    }

    @Override // Yue.C1998, android.graphics.drawable.Drawable
    public boolean onStateChange(@Yue.InterfaceC4410 int[] r3) {
            r2 = this;
            boolean r0 = super.onStateChange(r3)
            Yue.ۥۢ۠۟ۥ$ۥ r1 = r2.f21679
            int r3 = r1.m22063(r3)
            if (r3 >= 0) goto L14
            Yue.ۥۢ۠۟ۥ$ۥ r3 = r2.f21679
            int[] r1 = android.util.StateSet.WILD_CARD
            int r3 = r3.m22063(r1)
        L14:
            boolean r3 = r2.m9252(r3)
            if (r3 != 0) goto L1f
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            return r3
    }

    @Override // Yue.C1998
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1454() {
            r1 = this;
            super.mo1454()
            r0 = 0
            r1.f21680 = r0
            return
    }

    @Override // Yue.C1998
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* bridge */ /* synthetic */ Yue.C1998.AbstractC2002 mo1455() {
            r1 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r1.mo1457()
            return r0
    }

    @Override // Yue.C1998
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo1456(@Yue.InterfaceC4410 Yue.C1998.AbstractC2002 r2) {
            r1 = this;
            super.mo1456(r2)
            boolean r0 = r2 instanceof Yue.C5946.C5947
            if (r0 == 0) goto Lb
            Yue.ۥۢ۠۟ۥ$ۥ r2 = (Yue.C5946.C5947) r2
            r1.f21679 = r2
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m22055(int[] r2, android.graphics.drawable.Drawable r3) {
            r1 = this;
            if (r3 == 0) goto Le
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r1.f21679
            r0.m22062(r2, r3)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Yue.C5946.C5947 mo1457() {
            r3 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = new Yue.ۥۢ۠۟ۥ$ۥ
            Yue.ۥۢ۠۟ۥ$ۥ r1 = r3.f21679
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int[] m22056(android.util.AttributeSet r9) {
            r8 = this;
            int r0 = r9.getAttributeCount()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            if (r3 >= r0) goto L2b
            int r5 = r9.getAttributeNameResource(r3)
            if (r5 == 0) goto L28
            r6 = 16842960(0x10100d0, float:2.369414E-38)
            if (r5 == r6) goto L28
            r6 = 16843161(0x1010199, float:2.3694704E-38)
            if (r5 == r6) goto L28
            int r6 = r4 + 1
            boolean r7 = r9.getAttributeBooleanValue(r3, r2)
            if (r7 == 0) goto L24
            goto L25
        L24:
            int r5 = -r5
        L25:
            r1[r4] = r5
            r4 = r6
        L28:
            int r3 = r3 + 1
            goto L9
        L2b:
            int[] r9 = android.util.StateSet.trimStateSet(r1, r4)
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m22057() {
            r1 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r1.f21679
            int r0 = r0.m9270()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m22058(int r2) {
            r1 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r1.f21679
            android.graphics.drawable.Drawable r2 = r0.m9269(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m22059(int[] r2) {
            r1 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r1.f21679
            int r2 = r0.m22063(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C5946.C5947 m22060() {
            r1 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r1.f21679
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int[] m22061(int r2) {
            r1 = this;
            Yue.ۥۢ۠۟ۥ$ۥ r0 = r1.f21679
            int[][] r0 = r0.f21681
            r2 = r0[r2]
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo1458(@Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4410 android.content.res.Resources r5, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r6, @Yue.InterfaceC4410 android.util.AttributeSet r7, @Yue.InterfaceC4544 android.content.res.Resources.Theme r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r3 = this;
            int[] r0 = Yue.C5115.C5117.f18558
            android.content.res.TypedArray r0 = Yue.C6478.m23906(r5, r8, r7, r0)
            int r1 = Yue.C5115.C5117.f18560
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r3.setVisible(r1, r2)
            r3.m22054(r0)
            r3.m9256(r5)
            r0.recycle()
            r3.m22053(r4, r5, r6, r7, r8)
            int[] r4 = r3.getState()
            r3.onStateChange(r4)
            return
    }
}

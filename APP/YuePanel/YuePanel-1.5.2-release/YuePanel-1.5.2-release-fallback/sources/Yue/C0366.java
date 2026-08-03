package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0366 extends Yue.C5946 implements Yue.InterfaceC6260 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final java.lang.String f857 = "ۥ۟۠ۦۥ";

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final java.lang.String f858 = "transition";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final java.lang.String f859 = "item";

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final java.lang.String f860 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final java.lang.String f861 = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f862 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public Yue.C0366.C0369 f863;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public Yue.C0366.AbstractC0373 f864;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int f865;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f866;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public boolean f867;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C0367 {
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟, reason: contains not printable characters */
    public static class C0368 extends Yue.C0366.AbstractC0373 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.graphics.drawable.Animatable f868;

        public C0368(android.graphics.drawable.Animatable r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f868 = r2
                return
        }

        @Override // Yue.C0366.AbstractC0373
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo1467() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.f868
                r0.start()
                return
        }

        @Override // Yue.C0366.AbstractC0373
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo1468() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.f868
                r0.stop()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C0369 extends Yue.C5946.C5947 {

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public static final long f869 = 4294967296L;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public static final long f870 = 8589934592L;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public Yue.C3827<java.lang.Long> f871;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public Yue.C5868<java.lang.Integer> f872;

        public C0369(@Yue.InterfaceC4544 Yue.C0366.C0369 r1, @Yue.InterfaceC4410 Yue.C0366 r2, @Yue.InterfaceC4544 android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto Le
                Yue.ۥۣ۠ۨۢ<java.lang.Long> r2 = r1.f871
                r0.f871 = r2
                Yue.ۥۢ۟ۦ۠<java.lang.Integer> r1 = r1.f872
                r0.f872 = r1
                goto L1c
            Le:
                Yue.ۥۣ۠ۨۢ r1 = new Yue.ۥۣ۠ۨۢ
                r1.<init>()
                r0.f871 = r1
                Yue.ۥۢ۟ۦ۠ r1 = new Yue.ۥۢ۟ۦ۠
                r1.<init>()
                r0.f872 = r1
            L1c:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public static long m1469(int r2, int r3) {
                long r0 = (long) r2
                r2 = 32
                long r0 = r0 << r2
                long r2 = (long) r3
                long r2 = r2 | r0
                return r2
        }

        @Override // Yue.C5946.C5947, android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC4410
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                Yue.ۥ۟۠ۦۥ r0 = new Yue.ۥ۟۠ۦۥ
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // Yue.C5946.C5947, android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC4410
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                Yue.ۥ۟۠ۦۥ r0 = new Yue.ۥ۟۠ۦۥ
                r0.<init>(r1, r2)
                return r0
        }

        @Override // Yue.C5946.C5947, Yue.C1998.AbstractC2002
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void mo1470() {
                r1 = this;
                Yue.ۥۣ۠ۨۢ<java.lang.Long> r0 = r1.f871
                Yue.ۥۣ۠ۨۢ r0 = r0.m15311()
                r1.f871 = r0
                Yue.ۥۢ۟ۦ۠<java.lang.Integer> r0 = r1.f872
                Yue.ۥۢ۟ۦ۠ r0 = r0.m21809()
                r1.f872 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public int m1471(@Yue.InterfaceC4410 int[] r1, @Yue.InterfaceC4410 android.graphics.drawable.Drawable r2, int r3) {
                r0 = this;
                int r1 = super.m22062(r1, r2)
                Yue.ۥۢ۟ۦ۠<java.lang.Integer> r2 = r0.f872
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.m21820(r1, r3)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public int m1472(int r10, int r11, @Yue.InterfaceC4410 android.graphics.drawable.Drawable r12, boolean r13) {
                r9 = this;
                int r12 = super.m9262(r12)
                long r0 = m1469(r10, r11)
                if (r13 == 0) goto L10
                r2 = 8589934592(0x200000000, double:4.243991582E-314)
                goto L12
            L10:
                r2 = 0
            L12:
                Yue.ۥۣ۠ۨۢ<java.lang.Long> r4 = r9.f871
                long r5 = (long) r12
                long r7 = r5 | r2
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r4.m15309(r0, r7)
                if (r13 == 0) goto L34
                long r10 = m1469(r11, r10)
                Yue.ۥۣ۠ۨۢ<java.lang.Long> r13 = r9.f871
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r0 = r0 | r5
                long r0 = r0 | r2
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r13.m15309(r10, r0)
            L34:
                return r12
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public int m1473(int r3) {
                r2 = this;
                r0 = 0
                if (r3 >= 0) goto L4
                goto L14
            L4:
                Yue.ۥۢ۟ۦ۠<java.lang.Integer> r1 = r2.f872
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r3 = r1.m21815(r3, r0)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r0 = r3.intValue()
            L14:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public int m1474(@Yue.InterfaceC4410 int[] r1) {
                r0 = this;
                int r1 = super.m22063(r1)
                if (r1 < 0) goto L7
                return r1
            L7:
                int[] r1 = android.util.StateSet.WILD_CARD
                int r1 = super.m22063(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public int m1475(int r4, int r5) {
                r3 = this;
                long r4 = m1469(r4, r5)
                Yue.ۥۣ۠ۨۢ<java.lang.Long> r0 = r3.f871
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.m15317(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                int r4 = (int) r4
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public boolean m1476(int r4, int r5) {
                r3 = this;
                long r4 = m1469(r4, r5)
                Yue.ۥۣ۠ۨۢ<java.lang.Long> r0 = r3.f871
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.m15317(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r4 = r4 & r0
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 == 0) goto L24
                r4 = 1
                goto L25
            L24:
                r4 = 0
            L25:
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public boolean m1477(int r4, int r5) {
                r3 = this;
                long r4 = m1469(r4, r5)
                Yue.ۥۣ۠ۨۢ<java.lang.Long> r0 = r3.f871
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.m15317(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r0 = 8589934592(0x200000000, double:4.243991582E-314)
                long r4 = r4 & r0
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 == 0) goto L24
                r4 = 1
                goto L25
            L24:
                r4 = 0
            L25:
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C0370 extends Yue.C0366.AbstractC0373 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0374 f873;

        public C0370(Yue.C0374 r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f873 = r2
                return
        }

        @Override // Yue.C0366.AbstractC0373
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo1467() {
                r1 = this;
                Yue.ۥ۟۠ۦۦ r0 = r1.f873
                r0.start()
                return
        }

        @Override // Yue.C0366.AbstractC0373
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo1468() {
                r1 = this;
                Yue.ۥ۟۠ۦۦ r0 = r1.f873
                r0.stop()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C0371 extends Yue.C0366.AbstractC0373 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.animation.ObjectAnimator f874;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean f875;

        public C0371(android.graphics.drawable.AnimationDrawable r5, boolean r6, boolean r7) {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                int r0 = r5.getNumberOfFrames()
                r1 = 0
                if (r6 == 0) goto Le
                int r2 = r0 + (-1)
                goto Lf
            Le:
                r2 = r1
            Lf:
                r3 = 1
                if (r6 == 0) goto L13
                goto L15
            L13:
                int r1 = r0 + (-1)
            L15:
                Yue.ۥ۟۠ۦۥ$ۥ۟۟۟۠ r0 = new Yue.ۥ۟۠ۦۥ$ۥ۟۟۟۠
                r0.<init>(r5, r6)
                java.lang.String r6 = "currentIndex"
                int[] r1 = new int[]{r2, r1}
                android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofInt(r5, r6, r1)
                r5.setAutoCancel(r3)
                int r6 = r0.m1480()
                long r1 = (long) r6
                r5.setDuration(r1)
                r5.setInterpolator(r0)
                r4.f875 = r7
                r4.f874 = r5
                return
        }

        @Override // Yue.C0366.AbstractC0373
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean mo1478() {
                r1 = this;
                boolean r0 = r1.f875
                return r0
        }

        @Override // Yue.C0366.AbstractC0373
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo1479() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f874
                r0.reverse()
                return
        }

        @Override // Yue.C0366.AbstractC0373
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo1467() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f874
                r0.start()
                return
        }

        @Override // Yue.C0366.AbstractC0373
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo1468() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f874
                r0.cancel()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C0372 implements android.animation.TimeInterpolator {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int[] f876;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f877;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f878;

        public C0372(android.graphics.drawable.AnimationDrawable r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.m1481(r1, r2)
                return
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r5) {
                r4 = this;
                int r0 = r4.f878
                float r0 = (float) r0
                float r5 = r5 * r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 + r0
                int r5 = (int) r5
                int r0 = r4.f877
                int[] r1 = r4.f876
                r2 = 0
            Ld:
                if (r2 >= r0) goto L17
                r3 = r1[r2]
                if (r5 < r3) goto L17
                int r5 = r5 - r3
                int r2 = r2 + 1
                goto Ld
            L17:
                if (r2 >= r0) goto L1f
                float r5 = (float) r5
                int r1 = r4.f878
                float r1 = (float) r1
                float r5 = r5 / r1
                goto L20
            L1f:
                r5 = 0
            L20:
                float r1 = (float) r2
                float r0 = (float) r0
                float r1 = r1 / r0
                float r1 = r1 + r5
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m1480() {
                r1 = this;
                int r0 = r1.f878
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m1481(android.graphics.drawable.AnimationDrawable r6, boolean r7) {
                r5 = this;
                int r0 = r6.getNumberOfFrames()
                r5.f877 = r0
                int[] r1 = r5.f876
                if (r1 == 0) goto Ld
                int r1 = r1.length
                if (r1 >= r0) goto L11
            Ld:
                int[] r1 = new int[r0]
                r5.f876 = r1
            L11:
                int[] r1 = r5.f876
                r2 = 0
                r3 = r2
            L15:
                if (r2 >= r0) goto L29
                if (r7 == 0) goto L1e
                int r4 = r0 - r2
                int r4 = r4 + (-1)
                goto L1f
            L1e:
                r4 = r2
            L1f:
                int r4 = r6.getDuration(r4)
                r1[r2] = r4
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L15
            L29:
                r5.f878 = r3
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static abstract class AbstractC0373 {
        public AbstractC0373() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AbstractC0373(Yue.C0366.C0367 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean mo1478() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1479() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public abstract void mo1467();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public abstract void mo1468();
    }

    static {
            return
    }

    public C0366() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    public C0366(@Yue.InterfaceC4544 Yue.C0366.C0369 r2, @Yue.InterfaceC4544 android.content.res.Resources r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = -1
            r1.f865 = r0
            r1.f866 = r0
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = new Yue.ۥ۟۠ۦۥ$ۥ۟۟
            r0.<init>(r2, r1, r3)
            r1.mo1456(r0)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            r1.jumpToCurrentState()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static Yue.C0366 m1451(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC2004 int r7, @Yue.InterfaceC4544 android.content.res.Resources.Theme r8) {
            java.lang.String r0 = "parser error"
            android.content.res.Resources r1 = r6.getResources()     // Catch: java.io.IOException -> L20 org.xmlpull.v1.XmlPullParserException -> L22
            android.content.res.XmlResourceParser r7 = r1.getXml(r7)     // Catch: java.io.IOException -> L20 org.xmlpull.v1.XmlPullParserException -> L22
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch: java.io.IOException -> L20 org.xmlpull.v1.XmlPullParserException -> L22
        Le:
            int r3 = r7.next()     // Catch: java.io.IOException -> L20 org.xmlpull.v1.XmlPullParserException -> L22
            r4 = 2
            if (r3 == r4) goto L19
            r5 = 1
            if (r3 == r5) goto L19
            goto Le
        L19:
            if (r3 != r4) goto L24
            Yue.ۥ۟۠ۦۥ r6 = m1452(r6, r1, r7, r2, r8)     // Catch: java.io.IOException -> L20 org.xmlpull.v1.XmlPullParserException -> L22
            return r6
        L20:
            r6 = move-exception
            goto L2c
        L22:
            r6 = move-exception
            goto L32
        L24:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L20 org.xmlpull.v1.XmlPullParserException -> L22
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch: java.io.IOException -> L20 org.xmlpull.v1.XmlPullParserException -> L22
            throw r6     // Catch: java.io.IOException -> L20 org.xmlpull.v1.XmlPullParserException -> L22
        L2c:
            java.lang.String r7 = Yue.C0366.f857
            android.util.Log.e(r7, r0, r6)
            goto L37
        L32:
            java.lang.String r7 = Yue.C0366.f857
            android.util.Log.e(r7, r0, r6)
        L37:
            r6 = 0
            return r6
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static Yue.C0366 m1452(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC4410 android.content.res.Resources r9, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r10, @Yue.InterfaceC4410 android.util.AttributeSet r11, @Yue.InterfaceC4544 android.content.res.Resources.Theme r12) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "animated-selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1b
            Yue.ۥ۟۠ۦۥ r0 = new Yue.ۥ۟۠ۦۥ
            r0.<init>()
            r2 = r0
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.mo1458(r3, r4, r5, r6, r7)
            return r0
        L1b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": invalid animated-selector tag "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    private void m1453() {
            r1 = this;
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
            return
    }

    @Override // Yue.C5946, Yue.C1998, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.C1998, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            super.jumpToCurrentState()
            Yue.ۥ۟۠ۦۥ$ۥ۟۟۟ۡ r0 = r1.f864
            if (r0 == 0) goto L17
            r0.mo1468()
            r0 = 0
            r1.f864 = r0
            int r0 = r1.f865
            r1.m9252(r0)
            r0 = -1
            r1.f865 = r0
            r1.f866 = r0
        L17:
            return
    }

    @Override // Yue.C5946, Yue.C1998, android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f867
            if (r0 != 0) goto L12
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L12
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = r1.f863
            r0.mo1470()
            r0 = 1
            r1.f867 = r0
        L12:
            return r1
    }

    @Override // Yue.C5946, Yue.C1998, android.graphics.drawable.Drawable
    public boolean onStateChange(@Yue.InterfaceC4410 int[] r3) {
            r2 = this;
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = r2.f863
            int r0 = r0.m1474(r3)
            int r1 = r2.m9249()
            if (r0 == r1) goto L1a
            boolean r1 = r2.m1466(r0)
            if (r1 != 0) goto L18
            boolean r0 = r2.m9252(r0)
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            android.graphics.drawable.Drawable r1 = r2.getCurrent()
            if (r1 == 0) goto L26
            boolean r3 = r1.setState(r3)
            r0 = r0 | r3
        L26:
            return r0
    }

    @Override // Yue.C1998, android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            Yue.ۥ۟۠ۦۥ$ۥ۟۟۟ۡ r1 = r2.f864
            if (r1 == 0) goto L15
            if (r0 != 0) goto Lc
            if (r4 == 0) goto L15
        Lc:
            if (r3 == 0) goto L12
            r1.mo1467()
            goto L15
        L12:
            r2.jumpToCurrentState()
        L15:
            return r0
    }

    @Override // Yue.C5946, Yue.C1998
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo1454() {
            r1 = this;
            super.mo1454()
            r0 = 0
            r1.f867 = r0
            return
    }

    @Override // Yue.C5946, Yue.C1998
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.C1998.AbstractC2002 mo1455() {
            r1 = this;
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = r1.m1463()
            return r0
    }

    @Override // Yue.C5946, Yue.C1998
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo1456(@Yue.InterfaceC4410 Yue.C1998.AbstractC2002 r2) {
            r1 = this;
            super.mo1456(r2)
            boolean r0 = r2 instanceof Yue.C0366.C0369
            if (r0 == 0) goto Lb
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r2 = (Yue.C0366.C0369) r2
            r1.f863 = r2
        Lb:
            return
    }

    @Override // Yue.C5946
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.C5946.C5947 mo1457() {
            r1 = this;
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = r1.m1463()
            return r0
    }

    @Override // Yue.C5946
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void mo1458(@Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4410 android.content.res.Resources r5, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r6, @Yue.InterfaceC4410 android.util.AttributeSet r7, @Yue.InterfaceC4544 android.content.res.Resources.Theme r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r3 = this;
            int[] r0 = Yue.C5115.C5117.f18543
            android.content.res.TypedArray r0 = Yue.C6478.m23906(r5, r8, r7, r0)
            int r1 = Yue.C5115.C5117.f18545
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r3.setVisible(r1, r2)
            r3.m1460(r0)
            r3.m9256(r5)
            r0.recycle()
            r3.m1459(r4, r5, r6, r7, r8)
            r3.m1453()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m1459(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4410 android.content.res.Resources r7, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r8, @Yue.InterfaceC4410 android.util.AttributeSet r9, @Yue.InterfaceC4544 android.content.res.Resources.Theme r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r5 = this;
            int r0 = r8.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r8.next()
            if (r2 == r1) goto L3c
            int r3 = r8.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto L3c
        L15:
            r4 = 2
            if (r2 == r4) goto L19
            goto L6
        L19:
            if (r3 <= r0) goto L1c
            goto L6
        L1c:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2c
            r5.m1464(r6, r7, r8, r9, r10)
            goto L6
        L2c:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6
            r5.m1465(r6, r7, r8, r9, r10)
            goto L6
        L3c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m1460(android.content.res.TypedArray r4) {
            r3 = this;
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = r3.f863
            int r1 = r0.f6362
            int r2 = Yue.C1407.C1408.m7007(r4)
            r1 = r1 | r2
            r0.f6362 = r1
            int r1 = Yue.C5115.C5117.f18546
            boolean r2 = r0.f6367
            boolean r1 = r4.getBoolean(r1, r2)
            r0.m9288(r1)
            int r1 = Yue.C5115.C5117.f18547
            boolean r2 = r0.f6370
            boolean r1 = r4.getBoolean(r1, r2)
            r0.m9284(r1)
            int r1 = Yue.C5115.C5117.f18548
            int r2 = r0.f6385
            int r1 = r4.getInt(r1, r2)
            r0.m9285(r1)
            int r1 = Yue.C5115.C5117.f18549
            int r2 = r0.f6386
            int r1 = r4.getInt(r1, r2)
            r0.m9286(r1)
            int r1 = Yue.C5115.C5117.f18544
            boolean r0 = r0.f6382
            boolean r4 = r4.getBoolean(r1, r0)
            r3.setDither(r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m1461(@Yue.InterfaceC4410 int[] r2, @Yue.InterfaceC4410 android.graphics.drawable.Drawable r3, int r4) {
            r1 = this;
            Yue.C4554.m18127(r3)
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = r1.f863
            r0.m1471(r2, r3, r4)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public <T extends android.graphics.drawable.Drawable & android.graphics.drawable.Animatable> void m1462(int r2, int r3, @Yue.InterfaceC4410 T r4, boolean r5) {
            r1 = this;
            Yue.C4554.m18127(r4)
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = r1.f863
            r0.m1472(r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Yue.C0366.C0369 m1463() {
            r3 = this;
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = new Yue.ۥ۟۠ۦۥ$ۥ۟۟
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r1 = r3.f863
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final int m1464(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4410 android.content.res.Resources r6, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r7, @Yue.InterfaceC4410 android.util.AttributeSet r8, @Yue.InterfaceC4544 android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r4 = this;
            int[] r0 = Yue.C5115.C5117.f18550
            android.content.res.TypedArray r0 = Yue.C6478.m23906(r6, r9, r8, r0)
            int r1 = Yue.C5115.C5117.f18551
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = Yue.C5115.C5117.f18552
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            Yue.ۥۡۦۦۢ r3 = Yue.C5354.m20196()
            android.graphics.drawable.Drawable r5 = r3.m20207(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.m22056(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L65
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L4c
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            Yue.ۥۣۢۥۣ r5 = Yue.C6660.m25641(r6, r7, r8, r9)
            goto L65
        L47:
            android.graphics.drawable.Drawable r5 = Yue.C1407.C1408.m7006(r6, r7, r8, r9)
            goto L65
        L4c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            if (r5 == 0) goto L6e
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r6 = r4.f863
            int r5 = r6.m1471(r0, r5, r1)
            return r5
        L6e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int m1465(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC4410 android.content.res.Resources r9, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r10, @Yue.InterfaceC4410 android.util.AttributeSet r11, @Yue.InterfaceC4544 android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r7 = this;
            int[] r0 = Yue.C5115.C5117.f18553
            android.content.res.TypedArray r0 = Yue.C6478.m23906(r9, r12, r11, r0)
            int r1 = Yue.C5115.C5117.f18556
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = Yue.C5115.C5117.f18555
            int r3 = r0.getResourceId(r3, r2)
            int r4 = Yue.C5115.C5117.f18554
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            Yue.ۥۡۦۦۢ r5 = Yue.C5354.m20196()
            android.graphics.drawable.Drawable r4 = r5.m20207(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = Yue.C5115.C5117.f18557
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L6d
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L54
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            Yue.ۥ۟۠ۦۦ r4 = Yue.C0374.m1484(r8, r9, r10, r11, r12)
            goto L6d
        L4f:
            android.graphics.drawable.Drawable r4 = Yue.C1407.C1408.m7006(r9, r10, r11, r12)
            goto L6d
        L54:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6d:
            if (r4 == 0) goto L95
            if (r1 == r2) goto L7a
            if (r3 == r2) goto L7a
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r8 = r7.f863
            int r8 = r8.m1472(r1, r3, r4, r5)
            return r8
        L7a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L95:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean m1466(int r10) {
            r9 = this;
            Yue.ۥ۟۠ۦۥ$ۥ۟۟۟ۡ r0 = r9.f864
            r1 = 1
            if (r0 == 0) goto L24
            int r2 = r9.f865
            if (r10 != r2) goto La
            return r1
        La:
            int r2 = r9.f866
            if (r10 != r2) goto L1e
            boolean r2 = r0.mo1478()
            if (r2 == 0) goto L1e
            r0.mo1479()
            int r0 = r9.f866
            r9.f865 = r0
            r9.f866 = r10
            return r1
        L1e:
            int r2 = r9.f865
            r0.mo1468()
            goto L28
        L24:
            int r2 = r9.m9249()
        L28:
            r0 = 0
            r9.f864 = r0
            r0 = -1
            r9.f866 = r0
            r9.f865 = r0
            Yue.ۥ۟۠ۦۥ$ۥ۟۟ r0 = r9.f863
            int r3 = r0.m1473(r2)
            int r4 = r0.m1473(r10)
            r5 = 0
            if (r4 == 0) goto L83
            if (r3 != 0) goto L40
            goto L83
        L40:
            int r6 = r0.m1475(r3, r4)
            if (r6 >= 0) goto L47
            return r5
        L47:
            boolean r7 = r0.m1477(r3, r4)
            r9.m9252(r6)
            android.graphics.drawable.Drawable r6 = r9.getCurrent()
            boolean r8 = r6 instanceof android.graphics.drawable.AnimationDrawable
            if (r8 == 0) goto L62
            boolean r0 = r0.m1476(r3, r4)
            Yue.ۥ۟۠ۦۥ$ۥ۟۟۟۟ r3 = new Yue.ۥ۟۠ۦۥ$ۥ۟۟۟۟
            android.graphics.drawable.AnimationDrawable r6 = (android.graphics.drawable.AnimationDrawable) r6
            r3.<init>(r6, r0, r7)
            goto L79
        L62:
            boolean r0 = r6 instanceof Yue.C0374
            if (r0 == 0) goto L6e
            Yue.ۥ۟۠ۦۥ$ۥ۟۟۟ r3 = new Yue.ۥ۟۠ۦۥ$ۥ۟۟۟
            Yue.ۥ۟۠ۦۦ r6 = (Yue.C0374) r6
            r3.<init>(r6)
            goto L79
        L6e:
            boolean r0 = r6 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L83
            Yue.ۥ۟۠ۦۥ$ۥ۟ r3 = new Yue.ۥ۟۠ۦۥ$ۥ۟
            android.graphics.drawable.Animatable r6 = (android.graphics.drawable.Animatable) r6
            r3.<init>(r6)
        L79:
            r3.mo1467()
            r9.f864 = r3
            r9.f866 = r2
            r9.f865 = r10
            return r1
        L83:
            return r5
    }
}

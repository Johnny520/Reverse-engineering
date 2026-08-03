package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@android.annotation.SuppressLint({"UnknownNullness"})
public abstract class AbstractC2798 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ$ۥ, reason: contains not printable characters */
    public class RunnableC2799 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f9132;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9133;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9134;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9135;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9136;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC2798 f9137;

        public RunnableC2799(Yue.AbstractC2798 r1, int r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.ArrayList r5, java.util.ArrayList r6) {
                r0 = this;
                r0.f9137 = r1
                r0.f9132 = r2
                r0.f9133 = r3
                r0.f9134 = r4
                r0.f9135 = r5
                r0.f9136 = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 0
            L1:
                int r1 = r3.f9132
                if (r0 >= r1) goto L2e
                java.util.ArrayList r1 = r3.f9133
                java.lang.Object r1 = r1.get(r0)
                android.view.View r1 = (android.view.View) r1
                java.util.ArrayList r2 = r3.f9134
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                Yue.C6794.m26271(r1, r2)
                java.util.ArrayList r1 = r3.f9135
                java.lang.Object r1 = r1.get(r0)
                android.view.View r1 = (android.view.View) r1
                java.util.ArrayList r2 = r3.f9136
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                Yue.C6794.m26271(r1, r2)
                int r0 = r0 + 1
                goto L1
            L2e:
                return
        }
    }

    public AbstractC2798() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m12225(java.util.List<android.view.View> r6, android.view.View r7) {
            int r0 = r6.size()
            boolean r1 = m12226(r6, r7, r0)
            if (r1 == 0) goto Lb
            return
        Lb:
            java.lang.String r1 = Yue.C6794.m26164(r7)
            if (r1 == 0) goto L14
            r6.add(r7)
        L14:
            r7 = r0
        L15:
            int r1 = r6.size()
            if (r7 >= r1) goto L47
            java.lang.Object r1 = r6.get(r7)
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L44
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            r3 = 0
        L2c:
            if (r3 >= r2) goto L44
            android.view.View r4 = r1.getChildAt(r3)
            boolean r5 = m12226(r6, r4, r0)
            if (r5 != 0) goto L41
            java.lang.String r5 = Yue.C6794.m26164(r4)
            if (r5 == 0) goto L41
            r6.add(r4)
        L41:
            int r3 = r3 + 1
            goto L2c
        L44:
            int r7 = r7 + 1
            goto L15
        L47:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m12226(java.util.List<android.view.View> r3, android.view.View r4, int r5) {
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r5) goto Lf
            java.lang.Object r2 = r3.get(r1)
            if (r2 != r4) goto Lc
            r3 = 1
            return r3
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m12227(java.util.List r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void mo12208(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void mo12209(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r2);

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract void mo12210(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4544 java.lang.Object r2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract boolean mo12211(@Yue.InterfaceC4410 java.lang.Object r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract java.lang.Object mo12212(@Yue.InterfaceC4544 java.lang.Object r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m12228(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            boolean r0 = Yue.C6794.m26181(r5)
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            int r1 = r5.getWidth()
            float r1 = (float) r1
            int r2 = r5.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.Matrix r1 = r5.getMatrix()
            r1.mapRect(r0)
            int r1 = r5.getLeft()
            float r1 = (float) r1
            int r2 = r5.getTop()
            float r2 = (float) r2
            r0.offset(r1, r2)
            android.view.ViewParent r1 = r5.getParent()
        L32:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L60
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r3 = r1.getScrollY()
            int r3 = -r3
            float r3 = (float) r3
            r0.offset(r2, r3)
            android.graphics.Matrix r2 = r1.getMatrix()
            r2.mapRect(r0)
            int r2 = r1.getLeft()
            float r2 = (float) r2
            int r3 = r1.getTop()
            float r3 = (float) r3
            r0.offset(r2, r3)
            android.view.ViewParent r1 = r1.getParent()
            goto L32
        L60:
            r1 = 2
            int[] r1 = new int[r1]
            android.view.View r5 = r5.getRootView()
            r5.getLocationOnScreen(r1)
            r5 = 0
            r5 = r1[r5]
            float r5 = (float) r5
            r2 = 1
            r1 = r1[r2]
            float r1 = (float) r1
            r0.offset(r5, r1)
            float r5 = r0.left
            int r5 = java.lang.Math.round(r5)
            float r1 = r0.top
            int r1 = java.lang.Math.round(r1)
            float r2 = r0.right
            int r2 = java.lang.Math.round(r2)
            float r0 = r0.bottom
            int r0 = java.lang.Math.round(r0)
            r6.set(r5, r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public abstract java.lang.Object mo12213(@Yue.InterfaceC4544 java.lang.Object r1, @Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.lang.Object r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public abstract java.lang.Object mo12214(@Yue.InterfaceC4544 java.lang.Object r1, @Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.lang.Object r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.String> m12229(java.util.ArrayList<android.view.View> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L20
            java.lang.Object r3 = r6.get(r2)
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = Yue.C6794.m26164(r3)
            r0.add(r4)
            r4 = 0
            Yue.C6794.m26271(r3, r4)
            int r2 = r2 + 1
            goto La
        L20:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public abstract void mo12215(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public abstract void mo12216(@Yue.InterfaceC4410 java.lang.Object r1, @android.annotation.SuppressLint({"UnknownNullness"}) java.util.ArrayList<android.view.View> r2, @android.annotation.SuppressLint({"UnknownNullness"}) java.util.ArrayList<android.view.View> r3);

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public abstract void mo12217(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r3);

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public abstract void mo12218(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r3, @Yue.InterfaceC4544 java.lang.Object r4, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r5, @Yue.InterfaceC4544 java.lang.Object r6, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r7);

    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public abstract void mo12219(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.graphics.Rect r2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public abstract void mo12220(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4544 android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo12221(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1, @Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4410 Yue.C0943 r3, @Yue.InterfaceC4410 java.lang.Runnable r4) {
            r0 = this;
            r4.run()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m12230(android.view.View r9, java.util.ArrayList<android.view.View> r10, java.util.ArrayList<android.view.View> r11, java.util.ArrayList<java.lang.String> r12, java.util.Map<java.lang.String, java.lang.String> r13) {
            r8 = this;
            int r2 = r11.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            r1 = r0
        Lb:
            if (r1 >= r2) goto L44
            java.lang.Object r3 = r10.get(r1)
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = Yue.C6794.m26164(r3)
            r6.add(r4)
            if (r4 != 0) goto L1d
            goto L41
        L1d:
            r5 = 0
            Yue.C6794.m26271(r3, r5)
            java.lang.Object r3 = r13.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r5 = r0
        L28:
            if (r5 >= r2) goto L41
            java.lang.Object r7 = r12.get(r5)
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L3e
            java.lang.Object r3 = r11.get(r5)
            android.view.View r3 = (android.view.View) r3
            Yue.C6794.m26271(r3, r4)
            goto L41
        L3e:
            int r5 = r5 + 1
            goto L28
        L41:
            int r1 = r1 + 1
            goto Lb
        L44:
            Yue.ۥۣ۠۟ۦ$ۥ r13 = new Yue.ۥۣ۠۟ۦ$ۥ
            r0 = r13
            r1 = r8
            r3 = r11
            r4 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            Yue.ViewTreeObserverOnPreDrawListenerC4630.m18451(r9, r13)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public abstract void mo12222(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r3);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public abstract void mo12223(@Yue.InterfaceC4544 java.lang.Object r1, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r2, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r3);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public abstract java.lang.Object mo12224(@Yue.InterfaceC4544 java.lang.Object r1);
}

package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ViewConstructor"})
public class C2880 extends android.view.ViewGroup implements Yue.InterfaceC2876 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public android.view.ViewGroup f9308;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.view.View f9309;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final android.view.View f9310;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f9311;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public android.graphics.Matrix f9312;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final android.view.ViewTreeObserver.OnPreDrawListener f9313;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۥۥ$ۥ, reason: contains not printable characters */
    public class ViewTreeObserverOnPreDrawListenerC2881 implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2880 f9314;

        public ViewTreeObserverOnPreDrawListenerC2881(Yue.C2880 r1) {
                r0 = this;
                r0.f9314 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r2 = this;
                Yue.ۥۣ۠ۥۥ r0 = r2.f9314
                r0.postInvalidateOnAnimation()
                Yue.ۥۣ۠ۥۥ r0 = r2.f9314
                android.view.ViewGroup r1 = r0.f9308
                if (r1 == 0) goto L20
                android.view.View r0 = r0.f9309
                if (r0 == 0) goto L20
                r1.endViewTransition(r0)
                Yue.ۥۣ۠ۥۥ r0 = r2.f9314
                android.view.ViewGroup r0 = r0.f9308
                r0.postInvalidateOnAnimation()
                Yue.ۥۣ۠ۥۥ r0 = r2.f9314
                r1 = 0
                r0.f9308 = r1
                r0.f9309 = r1
            L20:
                r0 = 1
                return r0
        }
    }

    public C2880(android.view.View r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            Yue.ۥۣ۠ۥۥ$ۥ r0 = new Yue.ۥۣ۠ۥۥ$ۥ
            r0.<init>(r1)
            r1.f9313 = r0
            r1.f9310 = r2
            r2 = 0
            r1.setWillNotDraw(r2)
            r1.setClipChildren(r2)
            r2 = 2
            r0 = 0
            r1.setLayerType(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C2880 m12351(android.view.View r4, android.view.ViewGroup r5, android.graphics.Matrix r6) {
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L59
            Yue.ۥۣ۠ۥۣ r0 = Yue.C2877.m12338(r5)
            Yue.ۥۣ۠ۥۥ r1 = m12354(r4)
            if (r1 == 0) goto L21
            android.view.ViewParent r2 = r1.getParent()
            Yue.ۥۣ۠ۥۣ r2 = (Yue.C2877) r2
            if (r2 == r0) goto L21
            int r3 = r1.f9311
            r2.removeView(r1)
            r1 = 0
            goto L22
        L21:
            r3 = 0
        L22:
            if (r1 != 0) goto L4d
            if (r6 != 0) goto L2e
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            m12352(r4, r5, r6)
        L2e:
            Yue.ۥۣ۠ۥۥ r1 = new Yue.ۥۣ۠ۥۥ
            r1.<init>(r4)
            r1.m12357(r6)
            if (r0 != 0) goto L3e
            Yue.ۥۣ۠ۥۣ r0 = new Yue.ۥۣ۠ۥۣ
            r0.<init>(r5)
            goto L41
        L3e:
            r0.m12344()
        L41:
            m12353(r5, r0)
            m12353(r5, r1)
            r0.m12342(r1)
            r1.f9311 = r3
            goto L52
        L4d:
            if (r6 == 0) goto L52
            r1.m12357(r6)
        L52:
            int r4 = r1.f9311
            int r4 = r4 + 1
            r1.f9311 = r4
            return r1
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Ghosted views must be parented by a ViewGroup"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m12352(android.view.View r1, android.view.ViewGroup r2, android.graphics.Matrix r3) {
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.reset()
            Yue.C6930.m26821(r1, r3)
            int r0 = r1.getScrollX()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r1.getScrollY()
            int r1 = -r1
            float r1 = (float) r1
            r3.preTranslate(r0, r1)
            Yue.C6930.m26822(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m12353(android.view.View r4, android.view.View r5) {
            int r0 = r5.getLeft()
            int r1 = r5.getTop()
            int r2 = r5.getLeft()
            int r3 = r4.getWidth()
            int r2 = r2 + r3
            int r3 = r5.getTop()
            int r4 = r4.getHeight()
            int r3 = r3 + r4
            Yue.C6930.m26818(r5, r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C2880 m12354(android.view.View r1) {
            int r0 = Yue.C5102.C5103.f18355
            java.lang.Object r1 = r1.getTag(r0)
            Yue.ۥۣ۠ۥۥ r1 = (Yue.C2880) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m12355(android.view.View r1) {
            Yue.ۥۣ۠ۥۥ r1 = m12354(r1)
            if (r1 == 0) goto L17
            int r0 = r1.f9311
            int r0 = r0 + (-1)
            r1.f9311 = r0
            if (r0 > 0) goto L17
            android.view.ViewParent r0 = r1.getParent()
            Yue.ۥۣ۠ۥۣ r0 = (Yue.C2877) r0
            r0.removeView(r1)
        L17:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m12356(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4544 Yue.C2880 r2) {
            int r0 = Yue.C5102.C5103.f18355
            r1.setTag(r0, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.view.View r0 = r2.f9310
            m12356(r0, r2)
            android.view.View r0 = r2.f9310
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.f9313
            r0.addOnPreDrawListener(r1)
            android.view.View r0 = r2.f9310
            r1 = 4
            Yue.C6930.m26820(r0, r1)
            android.view.View r0 = r2.f9310
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L2c
            android.view.View r0 = r2.f9310
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
        L2c:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            android.view.View r0 = r2.f9310
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.f9313
            r0.removeOnPreDrawListener(r1)
            android.view.View r0 = r2.f9310
            r1 = 0
            Yue.C6930.m26820(r0, r1)
            android.view.View r0 = r2.f9310
            r1 = 0
            m12356(r0, r1)
            android.view.View r0 = r2.f9310
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L2a
            android.view.View r0 = r2.f9310
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
        L2a:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public void onDraw(@Yue.InterfaceC4410 android.graphics.Canvas r5) {
            r4 = this;
            r0 = 1
            Yue.C0947.m5385(r5, r0)
            android.graphics.Matrix r0 = r4.f9312
            r5.setMatrix(r0)
            android.view.View r0 = r4.f9310
            r1 = 0
            Yue.C6930.m26820(r0, r1)
            android.view.View r0 = r4.f9310
            r0.invalidate()
            android.view.View r0 = r4.f9310
            r2 = 4
            Yue.C6930.m26820(r0, r2)
            android.view.View r0 = r4.f9310
            long r2 = r4.getDrawingTime()
            r4.drawChild(r5, r0, r2)
            Yue.C0947.m5385(r5, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    @Override // android.view.View, Yue.InterfaceC2876
    public void setVisibility(int r2) {
            r1 = this;
            super.setVisibility(r2)
            android.view.View r0 = r1.f9310
            Yue.ۥۣ۠ۥۥ r0 = m12354(r0)
            if (r0 != r1) goto L15
            if (r2 != 0) goto Lf
            r2 = 4
            goto L10
        Lf:
            r2 = 0
        L10:
            android.view.View r0 = r1.f9310
            Yue.C6930.m26820(r0, r2)
        L15:
            return
    }

    @Override // Yue.InterfaceC2876
    /* JADX INFO: renamed from: ۥ */
    public void mo12337(android.view.ViewGroup r1, android.view.View r2) {
            r0 = this;
            r0.f9308 = r1
            r0.f9309 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m12357(@Yue.InterfaceC4410 android.graphics.Matrix r1) {
            r0 = this;
            r0.f9312 = r1
            return
    }
}

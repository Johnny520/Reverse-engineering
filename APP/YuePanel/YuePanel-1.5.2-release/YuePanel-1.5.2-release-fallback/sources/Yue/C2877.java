package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ViewConstructor"})
public class C2877 extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public android.view.ViewGroup f9298;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f9299;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۥۣ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C2878 {
        public C2878() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m12345(android.view.View r0) {
                float r0 = r0.getZ()
                return r0
        }
    }

    public C2877(android.view.ViewGroup r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            r0 = 0
            r1.setClipChildren(r0)
            r1.f9298 = r2
            int r0 = Yue.C5102.C5103.f18356
            r2.setTag(r0, r1)
            android.view.ViewGroup r2 = r1.f9298
            android.view.ViewGroupOverlay r2 = r2.getOverlay()
            r2.add(r1)
            r2 = 1
            r1.f9299 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C2877 m12338(@Yue.InterfaceC4410 android.view.ViewGroup r1) {
            int r0 = Yue.C5102.C5103.f18356
            java.lang.Object r1 = r1.getTag(r0)
            Yue.ۥۣ۠ۥۣ r1 = (Yue.C2877) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m12339(android.view.View r2, java.util.ArrayList<android.view.View> r3) {
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Ld
            android.view.View r0 = (android.view.View) r0
            m12339(r0, r3)
        Ld:
            r3.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m12340(android.view.View r6, android.view.View r7) {
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            float r2 = Yue.C2877.C2878.m12345(r6)
            float r3 = Yue.C2877.C2878.m12345(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L26
            float r6 = Yue.C2877.C2878.m12345(r6)
            float r7 = Yue.C2877.C2878.m12345(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L25
            r3 = r4
        L25:
            return r3
        L26:
            r2 = r3
        L27:
            if (r2 >= r1) goto L36
            int r5 = Yue.C6844.m26530(r0, r2)
            android.view.View r5 = r0.getChildAt(r5)
            if (r5 != r6) goto L34
            goto L3b
        L34:
            if (r5 != r7) goto L38
        L36:
            r3 = r4
            goto L3b
        L38:
            int r2 = r2 + 1
            goto L27
        L3b:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m12341(java.util.ArrayList<android.view.View> r6, java.util.ArrayList<android.view.View> r7) {
            boolean r0 = r6.isEmpty()
            r1 = 1
            if (r0 != 0) goto L46
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L46
            r0 = 0
            java.lang.Object r2 = r6.get(r0)
            java.lang.Object r3 = r7.get(r0)
            if (r2 == r3) goto L19
            goto L46
        L19:
            int r2 = r6.size()
            int r3 = r7.size()
            int r2 = java.lang.Math.min(r2, r3)
            r3 = r1
        L26:
            if (r3 >= r2) goto L3e
            java.lang.Object r4 = r6.get(r3)
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r5 = r7.get(r3)
            android.view.View r5 = (android.view.View) r5
            if (r4 == r5) goto L3b
            boolean r6 = m12340(r4, r5)
            return r6
        L3b:
            int r3 = r3 + 1
            goto L26
        L3e:
            int r6 = r7.size()
            if (r6 != r2) goto L45
            goto L46
        L45:
            r1 = r0
        L46:
            return r1
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.f9299
            if (r0 == 0) goto L8
            super.onViewAdded(r2)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This GhostViewHolder is detached!"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r4) {
            r3 = this;
            super.onViewRemoved(r4)
            int r0 = r3.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L11
            android.view.View r0 = r3.getChildAt(r2)
            if (r0 == r4) goto L17
        L11:
            int r4 = r3.getChildCount()
            if (r4 != 0) goto L2a
        L17:
            android.view.ViewGroup r4 = r3.f9298
            int r0 = Yue.C5102.C5103.f18356
            r1 = 0
            r4.setTag(r0, r1)
            android.view.ViewGroup r4 = r3.f9298
            android.view.ViewGroupOverlay r4 = r4.getOverlay()
            r4.remove(r3)
            r3.f9299 = r2
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m12342(Yue.C2880 r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r1 = r3.f9310
            m12339(r1, r0)
            int r0 = r2.m12343(r0)
            if (r0 < 0) goto L1b
            int r1 = r2.getChildCount()
            if (r0 < r1) goto L17
            goto L1b
        L17:
            r2.addView(r3, r0)
            goto L1e
        L1b:
            r2.addView(r3)
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m12343(java.util.ArrayList<android.view.View> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.getChildCount()
            int r1 = r1 + (-1)
            r2 = 0
        Lc:
            if (r2 > r1) goto L2e
            int r3 = r2 + r1
            int r3 = r3 / 2
            android.view.View r4 = r5.getChildAt(r3)
            Yue.ۥۣ۠ۥۥ r4 = (Yue.C2880) r4
            android.view.View r4 = r4.f9310
            m12339(r4, r0)
            boolean r4 = m12341(r6, r0)
            if (r4 == 0) goto L27
            int r3 = r3 + 1
            r2 = r3
            goto L2a
        L27:
            int r3 = r3 + (-1)
            r1 = r3
        L2a:
            r0.clear()
            goto Lc
        L2e:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12344() {
            r2 = this;
            boolean r0 = r2.f9299
            if (r0 == 0) goto L17
            android.view.ViewGroup r0 = r2.f9298
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            r0.remove(r2)
            android.view.ViewGroup r0 = r2.f9298
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            r0.add(r2)
            return
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This GhostViewHolder is detached!"
            r0.<init>(r1)
            throw r0
    }
}

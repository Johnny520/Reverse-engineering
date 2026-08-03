package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes.dex */
class InsetsAnimationCallback extends Yue.C7026.AbstractC7028 {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;
    private final android.view.View view;

    public InsetsAnimationCallback(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 2
            int[] r0 = new int[r0]
            r1.tmpLocation = r0
            r1.view = r2
            return
    }

    @Override // Yue.C7026.AbstractC7028
    public void onEnd(@Yue.InterfaceC4410 Yue.C7026 r2) {
            r1 = this;
            android.view.View r2 = r1.view
            r0 = 0
            r2.setTranslationY(r0)
            return
    }

    @Override // Yue.C7026.AbstractC7028
    public void onPrepare(@Yue.InterfaceC4410 Yue.C7026 r2) {
            r1 = this;
            android.view.View r2 = r1.view
            int[] r0 = r1.tmpLocation
            r2.getLocationOnScreen(r0)
            int[] r2 = r1.tmpLocation
            r0 = 1
            r2 = r2[r0]
            r1.startY = r2
            return
    }

    @Override // Yue.C7026.AbstractC7028
    @Yue.InterfaceC4410
    public Yue.C7065 onProgress(@Yue.InterfaceC4410 Yue.C7065 r4, @Yue.InterfaceC4410 java.util.List<Yue.C7026> r5) {
            r3 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r5.next()
            Yue.ۥۢۥۣۥ r0 = (Yue.C7026) r0
            int r1 = r0.m27195()
            int r2 = Yue.C7065.C7078.m27366()
            r1 = r1 & r2
            if (r1 == 0) goto L4
            int r5 = r3.startTranslationY
            r1 = 0
            float r0 = r0.m27193()
            int r5 = com.google.android.material.animation.AnimationUtils.lerp(r5, r1, r0)
            float r5 = (float) r5
            android.view.View r0 = r3.view
            r0.setTranslationY(r5)
        L2c:
            return r4
    }

    @Override // Yue.C7026.AbstractC7028
    @Yue.InterfaceC4410
    public Yue.C7026.C7027 onStart(@Yue.InterfaceC4410 Yue.C7026 r2, @Yue.InterfaceC4410 Yue.C7026.C7027 r3) {
            r1 = this;
            android.view.View r2 = r1.view
            int[] r0 = r1.tmpLocation
            r2.getLocationOnScreen(r0)
            int[] r2 = r1.tmpLocation
            r0 = 1
            r2 = r2[r0]
            int r0 = r1.startY
            int r0 = r0 - r2
            r1.startTranslationY = r0
            android.view.View r2 = r1.view
            float r0 = (float) r0
            r2.setTranslationY(r0)
            return r3
    }
}

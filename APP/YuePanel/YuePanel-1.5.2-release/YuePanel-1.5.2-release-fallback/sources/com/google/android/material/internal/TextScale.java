package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class TextScale extends Yue.AbstractC6398 {
    private static final java.lang.String PROPNAME_SCALE = "android:textscale:scale";


    public TextScale() {
            r0 = this;
            r0.<init>()
            return
    }

    private void captureValues(@Yue.InterfaceC4410 Yue.C6447 r3) {
            r2 = this;
            android.view.View r0 = r3.f22709
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 == 0) goto L17
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f22708
            float r0 = r0.getScaleX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r1 = "android:textscale:scale"
            r3.put(r1, r0)
        L17:
            return
    }

    @Override // Yue.AbstractC6398
    public void captureEndValues(@Yue.InterfaceC4410 Yue.C6447 r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // Yue.AbstractC6398
    public void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // Yue.AbstractC6398
    public android.animation.Animator createAnimator(@Yue.InterfaceC4410 android.view.ViewGroup r5, @Yue.InterfaceC4544 Yue.C6447 r6, @Yue.InterfaceC4544 Yue.C6447 r7) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L58
            if (r7 == 0) goto L58
            android.view.View r0 = r6.f22709
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 == 0) goto L58
            android.view.View r0 = r7.f22709
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 != 0) goto L12
            goto L58
        L12:
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f22708
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f22708
            java.lang.String r1 = "android:textscale:scale"
            java.lang.Object r2 = r6.get(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L2d
            java.lang.Object r6 = r6.get(r1)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            goto L2e
        L2d:
            r6 = r3
        L2e:
            java.lang.Object r2 = r7.get(r1)
            if (r2 == 0) goto L3e
            java.lang.Object r7 = r7.get(r1)
            java.lang.Float r7 = (java.lang.Float) r7
            float r3 = r7.floatValue()
        L3e:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 != 0) goto L43
            return r5
        L43:
            r5 = 2
            float[] r5 = new float[r5]
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r3
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            com.google.android.material.internal.TextScale$1 r6 = new com.google.android.material.internal.TextScale$1
            r6.<init>(r4, r0)
            r5.addUpdateListener(r6)
        L58:
            return r5
    }
}

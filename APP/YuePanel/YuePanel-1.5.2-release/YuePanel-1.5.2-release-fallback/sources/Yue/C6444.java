package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6444 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f22703 = 1048576;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean f22704 = false;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C6445 {
        public C6445() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.Bitmap m23744(android.graphics.Picture r0) {
                android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۡ$ۥ۟, reason: contains not printable characters */
    public static class C6446 implements android.animation.TypeEvaluator<android.graphics.Matrix> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final float[] f22705;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final float[] f22706;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.graphics.Matrix f22707;

        public C6446() {
                r2 = this;
                r2.<init>()
                r0 = 9
                float[] r1 = new float[r0]
                r2.f22705 = r1
                float[] r0 = new float[r0]
                r2.f22706 = r0
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r2.f22707 = r0
                return
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float r1, android.graphics.Matrix r2, android.graphics.Matrix r3) {
                r0 = this;
                android.graphics.Matrix r2 = (android.graphics.Matrix) r2
                android.graphics.Matrix r3 = (android.graphics.Matrix) r3
                android.graphics.Matrix r1 = r0.m23745(r1, r2, r3)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.Matrix m23745(float r3, android.graphics.Matrix r4, android.graphics.Matrix r5) {
                r2 = this;
                float[] r0 = r2.f22705
                r4.getValues(r0)
                float[] r4 = r2.f22706
                r5.getValues(r4)
                r4 = 0
            Lb:
                r5 = 9
                if (r4 >= r5) goto L1f
                float[] r5 = r2.f22706
                r0 = r5[r4]
                float[] r1 = r2.f22705
                r1 = r1[r4]
                float r0 = r0 - r1
                float r0 = r0 * r3
                float r1 = r1 + r0
                r5[r4] = r1
                int r4 = r4 + 1
                goto Lb
            L1f:
                android.graphics.Matrix r3 = r2.f22707
                float[] r4 = r2.f22706
                r3.setValues(r4)
                android.graphics.Matrix r3 = r2.f22707
                return r3
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            Yue.C6444.f22704 = r0
            return
    }

    public C6444() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.view.View m23741(android.view.ViewGroup r7, android.view.View r8, android.view.View r9) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r9.getScrollX()
            int r1 = -r1
            float r1 = (float) r1
            int r9 = r9.getScrollY()
            int r9 = -r9
            float r9 = (float) r9
            r0.setTranslate(r1, r9)
            Yue.C6930.m26821(r8, r0)
            Yue.C6930.m26822(r7, r0)
            android.graphics.RectF r9 = new android.graphics.RectF
            int r1 = r8.getWidth()
            float r1 = (float) r1
            int r2 = r8.getHeight()
            float r2 = (float) r2
            r3 = 0
            r9.<init>(r3, r3, r1, r2)
            r0.mapRect(r9)
            float r1 = r9.left
            int r1 = java.lang.Math.round(r1)
            float r2 = r9.top
            int r2 = java.lang.Math.round(r2)
            float r3 = r9.right
            int r3 = java.lang.Math.round(r3)
            float r4 = r9.bottom
            int r4 = java.lang.Math.round(r4)
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r6 = r8.getContext()
            r5.<init>(r6)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r6)
            android.graphics.Bitmap r7 = m23742(r8, r0, r9, r7)
            if (r7 == 0) goto L5c
            r5.setImageBitmap(r7)
        L5c:
            int r7 = r3 - r1
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r9 = r4 - r2
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
            r5.measure(r7, r8)
            r5.layout(r1, r2, r3, r4)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.graphics.Bitmap m23742(android.view.View r7, android.graphics.Matrix r8, android.graphics.RectF r9, android.view.ViewGroup r10) {
            boolean r0 = r7.isAttachedToWindow()
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r10 == 0) goto L10
            boolean r3 = r10.isAttachedToWindow()
            if (r3 == 0) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r3 = 0
            if (r0 == 0) goto L29
            if (r1 != 0) goto L17
            return r3
        L17:
            android.view.ViewParent r1 = r7.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r7)
            android.view.ViewGroupOverlay r4 = r10.getOverlay()
            r4.add(r7)
            goto L2a
        L29:
            r1 = r3
        L2a:
            float r4 = r9.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r9.height()
            int r5 = java.lang.Math.round(r5)
            if (r4 <= 0) goto L8e
            if (r5 <= 0) goto L8e
            int r3 = r4 * r5
            float r3 = (float) r3
            r6 = 1233125376(0x49800000, float:1048576.0)
            float r6 = r6 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r3, r6)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = java.lang.Math.round(r4)
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r6 = r9.left
            float r6 = -r6
            float r9 = r9.top
            float r9 = -r9
            r8.postTranslate(r6, r9)
            r8.postScale(r3, r3)
            boolean r9 = Yue.C6444.f22704
            if (r9 == 0) goto L7d
            android.graphics.Picture r9 = new android.graphics.Picture
            r9.<init>()
            android.graphics.Canvas r3 = r9.beginRecording(r4, r5)
            r3.concat(r8)
            r7.draw(r3)
            r9.endRecording()
            android.graphics.Bitmap r3 = Yue.C6444.C6445.m23744(r9)
            goto L8e
        L7d:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r4, r5, r9)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r3)
            r9.concat(r8)
            r7.draw(r9)
        L8e:
            if (r0 == 0) goto L9a
            android.view.ViewGroupOverlay r8 = r10.getOverlay()
            r8.remove(r7)
            r1.addView(r7, r2)
        L9a:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.animation.Animator m23743(android.animation.Animator r1, android.animation.Animator r2) {
            if (r1 != 0) goto L3
            return r2
        L3:
            if (r2 != 0) goto L6
            return r1
        L6:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[]{r1, r2}
            r0.playTogether(r1)
            return r0
    }
}

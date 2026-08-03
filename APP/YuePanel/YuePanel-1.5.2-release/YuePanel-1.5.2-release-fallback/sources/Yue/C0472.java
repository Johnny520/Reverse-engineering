package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0472 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int[] f1199 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.widget.ProgressBar f1200;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.graphics.Bitmap f1201;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۢۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C0473 {
        public C0473() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m1729(android.graphics.drawable.LayerDrawable r1, android.graphics.drawable.LayerDrawable r2, int r3) {
                int r0 = r1.getLayerGravity(r3)
                r2.setLayerGravity(r3, r0)
                int r0 = r1.getLayerWidth(r3)
                r2.setLayerWidth(r3, r0)
                int r0 = r1.getLayerHeight(r3)
                r2.setLayerHeight(r3, r0)
                int r0 = r1.getLayerInsetLeft(r3)
                r2.setLayerInsetLeft(r3, r0)
                int r0 = r1.getLayerInsetRight(r3)
                r2.setLayerInsetRight(r3, r0)
                int r0 = r1.getLayerInsetTop(r3)
                r2.setLayerInsetTop(r3, r0)
                int r0 = r1.getLayerInsetBottom(r3)
                r2.setLayerInsetBottom(r3, r0)
                int r0 = r1.getLayerInsetStart(r3)
                r2.setLayerInsetStart(r3, r0)
                int r1 = r1.getLayerInsetEnd(r3)
                r2.setLayerInsetEnd(r3, r1)
                return
        }
    }

    static {
            r0 = 16843067(0x101013b, float:2.369444E-38)
            r1 = 16843068(0x101013c, float:2.3694444E-38)
            int[] r0 = new int[]{r0, r1}
            Yue.C0472.f1199 = r0
            return
    }

    public C0472(android.widget.ProgressBar r1) {
            r0 = this;
            r0.<init>()
            r0.f1200 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.drawable.shapes.Shape m1724() {
            r3 = this;
            r0 = 8
            float[] r0 = new float[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r1 = new android.graphics.drawable.shapes.RoundRectShape
            r2 = 0
            r1.<init>(r0, r2, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.graphics.Bitmap m1725() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.f1201
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo1726(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.ProgressBar r0 = r3.f1200
            android.content.Context r0 = r0.getContext()
            int[] r1 = Yue.C0472.f1199
            r2 = 0
            Yue.ۥۢۡۥۦ r4 = Yue.C6264.m23339(r0, r4, r1, r5, r2)
            android.graphics.drawable.Drawable r5 = r4.m23348(r2)
            if (r5 == 0) goto L1c
            android.widget.ProgressBar r0 = r3.f1200
            android.graphics.drawable.Drawable r5 = r3.m1728(r5)
            r0.setIndeterminateDrawable(r5)
        L1c:
            r5 = 1
            android.graphics.drawable.Drawable r5 = r4.m23348(r5)
            if (r5 == 0) goto L2c
            android.widget.ProgressBar r0 = r3.f1200
            android.graphics.drawable.Drawable r5 = r3.m1727(r5, r2)
            r0.setProgressDrawable(r5)
        L2c:
            r4.m23371()
            return
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m1727(android.graphics.drawable.Drawable r8, boolean r9) {
            r7 = this;
            boolean r0 = r8 instanceof Yue.InterfaceC7133
            if (r0 == 0) goto L16
            r0 = r8
            Yue.ۥۢۦ۠۟ r0 = (Yue.InterfaceC7133) r0
            android.graphics.drawable.Drawable r1 = r0.mo27462()
            if (r1 == 0) goto L9d
            android.graphics.drawable.Drawable r9 = r7.m1727(r1, r9)
            r0.mo27461(r9)
            goto L9d
        L16:
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L5b
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r9) goto L46
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L3c
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L3a
            goto L3c
        L3a:
            r4 = r2
            goto L3d
        L3c:
            r4 = r1
        L3d:
            android.graphics.drawable.Drawable r4 = r7.m1727(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L25
        L46:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
        L4b:
            if (r2 >= r9) goto L5a
            int r0 = r8.getId(r2)
            r1.setId(r2, r0)
            Yue.C0472.C0473.m1729(r8, r1, r2)
            int r2 = r2 + 1
            goto L4b
        L5a:
            return r1
        L5b:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L9d
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            android.graphics.Bitmap r2 = r7.f1201
            if (r2 != 0) goto L6b
            r7.f1201 = r0
        L6b:
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.Shape r3 = r7.m1724()
            r2.<init>(r3)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r0, r4, r5)
            android.graphics.Paint r0 = r2.getPaint()
            r0.setShader(r3)
            android.graphics.Paint r0 = r2.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto L9c
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r2, r9, r1)
            r2 = r8
        L9c:
            return r2
        L9d:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m1728(android.graphics.drawable.Drawable r7) {
            r6 = this;
            boolean r0 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L35
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            int r0 = r7.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r1 = new android.graphics.drawable.AnimationDrawable
            r1.<init>()
            boolean r2 = r7.isOneShot()
            r1.setOneShot(r2)
            r2 = 0
        L17:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 >= r0) goto L31
            android.graphics.drawable.Drawable r4 = r7.getFrame(r2)
            r5 = 1
            android.graphics.drawable.Drawable r4 = r6.m1727(r4, r5)
            r4.setLevel(r3)
            int r3 = r7.getDuration(r2)
            r1.addFrame(r4, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            r1.setLevel(r3)
            r7 = r1
        L35:
            return r7
    }
}

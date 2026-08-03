package a;

/* JADX INFO: renamed from: a.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0167h1 {
    public static final int[] c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.AbsSeekBar f490a;
    public android.graphics.Bitmap b;

    static {
            r0 = 16843067(0x101013b, float:2.369444E-38)
            r1 = 16843068(0x101013c, float:2.3694444E-38)
            int[] r0 = new int[]{r0, r1}
            a.C0167h1.c = r0
            return
    }

    public C0167h1(android.widget.AbsSeekBar r1) {
            r0 = this;
            r0.<init>()
            r0.f490a = r1
            return
    }

    public void a(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.widget.AbsSeekBar r0 = r8.f490a
            android.content.Context r1 = r0.getContext()
            int[] r2 = a.C0167h1.c
            a.of r9 = a.C0306of.e(r1, r9, r2, r10)
            r10 = 0
            android.graphics.drawable.Drawable r1 = r9.c(r10)
            r2 = 1
            if (r1 == 0) goto L4b
            boolean r3 = r1 instanceof android.graphics.drawable.AnimationDrawable
            if (r3 == 0) goto L48
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            int r3 = r1.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r4 = new android.graphics.drawable.AnimationDrawable
            r4.<init>()
            boolean r5 = r1.isOneShot()
            r4.setOneShot(r5)
            r5 = r10
        L2b:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 >= r3) goto L44
            android.graphics.drawable.Drawable r7 = r1.getFrame(r5)
            android.graphics.drawable.Drawable r7 = r8.b(r7, r2)
            r7.setLevel(r6)
            int r6 = r1.getDuration(r5)
            r4.addFrame(r7, r6)
            int r5 = r5 + 1
            goto L2b
        L44:
            r4.setLevel(r6)
            r1 = r4
        L48:
            r0.setIndeterminateDrawable(r1)
        L4b:
            android.graphics.drawable.Drawable r1 = r9.c(r2)
            if (r1 == 0) goto L58
            android.graphics.drawable.Drawable r10 = r8.b(r1, r10)
            r0.setProgressDrawable(r10)
        L58:
            r9.f()
            return
    }

    public final android.graphics.drawable.Drawable b(android.graphics.drawable.Drawable r8, boolean r9) {
            r7 = this;
            r0 = 1
            boolean r1 = r8 instanceof a.vh
            if (r1 == 0) goto L16
            r0 = r8
            a.vh r0 = (a.vh) r0
            android.graphics.drawable.Drawable r1 = r0.a()
            if (r1 == 0) goto Ldf
            android.graphics.drawable.Drawable r9 = r7.b(r1, r9)
            r0.b(r9)
            return r8
        L16:
            boolean r1 = r8 instanceof android.graphics.drawable.LayerDrawable
            if (r1 == 0) goto L94
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = r2
        L24:
            if (r3 >= r9) goto L44
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L3b
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L39
            goto L3b
        L39:
            r4 = r2
            goto L3c
        L3b:
            r4 = r0
        L3c:
            android.graphics.drawable.Drawable r4 = r7.b(r5, r4)
            r1[r3] = r4
            int r3 = r3 + r0
            goto L24
        L44:
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            r3.<init>(r1)
        L49:
            if (r2 >= r9) goto L93
            int r1 = r8.getId(r2)
            r3.setId(r2, r1)
            int r1 = r8.getLayerGravity(r2)
            r3.setLayerGravity(r2, r1)
            int r1 = r8.getLayerWidth(r2)
            r3.setLayerWidth(r2, r1)
            int r1 = r8.getLayerHeight(r2)
            r3.setLayerHeight(r2, r1)
            int r1 = r8.getLayerInsetLeft(r2)
            r3.setLayerInsetLeft(r2, r1)
            int r1 = r8.getLayerInsetRight(r2)
            r3.setLayerInsetRight(r2, r1)
            int r1 = r8.getLayerInsetTop(r2)
            r3.setLayerInsetTop(r2, r1)
            int r1 = r8.getLayerInsetBottom(r2)
            r3.setLayerInsetBottom(r2, r1)
            int r1 = r8.getLayerInsetStart(r2)
            r3.setLayerInsetStart(r2, r1)
            int r1 = r8.getLayerInsetEnd(r2)
            r3.setLayerInsetEnd(r2, r1)
            int r2 = r2 + r0
            goto L49
        L93:
            return r3
        L94:
            boolean r1 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto Ldf
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r1 = r8.getBitmap()
            android.graphics.Bitmap r2 = r7.b
            if (r2 != 0) goto La4
            r7.b = r1
        La4:
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            r3 = 8
            float[] r3 = new float[r3]
            r3 = {x00e0: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r4 = new android.graphics.drawable.shapes.RoundRectShape
            r5 = 0
            r4.<init>(r3, r5, r5)
            r2.<init>(r4)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r1, r4, r5)
            android.graphics.Paint r1 = r2.getPaint()
            r1.setShader(r3)
            android.graphics.Paint r1 = r2.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r1.setColorFilter(r8)
            if (r9 == 0) goto Lde
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r2, r9, r0)
            return r8
        Lde:
            return r2
        Ldf:
            return r8
    }
}

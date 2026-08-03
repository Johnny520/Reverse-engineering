package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a8 extends android.graphics.drawable.BitmapDrawable {

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final android.graphics.Paint f92 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean f93;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final float f94;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ۟.z7.e f95;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f96;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public long f97;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public boolean f98;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public int f99;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            p000.a8.f92 = r0
            return
    }

    public a8(android.content.Context r2, android.graphics.Bitmap r3, android.graphics.drawable.Drawable r4, ۟.z7.e r5, boolean r6, boolean r7) {
            r1 = this;
            android.content.res.Resources r0 = r2.getResources()
            r1.<init>(r0, r3)
            r3 = 255(0xff, float:3.57E-43)
            r1.f99 = r3
            r1.f93 = r7
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r1.f94 = r2
            r1.f95 = r5
            ۟.z7$e r2 = ۟.z7.e.f1270
            r3 = 1
            if (r5 == r2) goto L24
            if (r6 != 0) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L31
            r1.f96 = r4
            r1.f98 = r3
            long r2 = android.os.SystemClock.uptimeMillis()
            r1.f97 = r2
        L31:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Path m32(android.graphics.Point r4, int r5) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r4.x
            int r1 = r1 + r5
            int r2 = r4.y
            r0.<init>(r1, r2)
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.x
            int r3 = r4.y
            int r3 = r3 + r5
            r1.<init>(r2, r3)
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            int r2 = r4.x
            float r2 = (float) r2
            int r4 = r4.y
            float r4 = (float) r4
            r5.moveTo(r2, r4)
            int r4 = r0.x
            float r4 = (float) r4
            int r0 = r0.y
            float r0 = (float) r0
            r5.lineTo(r4, r0)
            int r4 = r1.x
            float r4 = (float) r4
            int r0 = r1.y
            float r0 = (float) r0
            r5.lineTo(r4, r0)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m33(android.widget.ImageView r8, android.content.Context r9, android.graphics.Bitmap r10, ۟.z7.e r11, boolean r12, boolean r13) {
            android.graphics.drawable.Drawable r3 = r8.getDrawable()
            boolean r0 = r3 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto Le
            r0 = r3
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r0.stop()
        Le:
            ۟.a8 r7 = new ۟.a8
            r0 = r7
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.setImageDrawable(r7)
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r7) {
            r6 = this;
            boolean r0 = r6.f98
            r1 = 0
            if (r0 != 0) goto L9
        L5:
            super.draw(r7)
            goto L37
        L9:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.f97
            long r2 = r2 - r4
            float r0 = (float) r2
            r2 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L20
            r6.f98 = r1
            r0 = 0
            r6.f96 = r0
            goto L5
        L20:
            android.graphics.drawable.Drawable r2 = r6.f96
            if (r2 == 0) goto L27
            r2.draw(r7)
        L27:
            int r2 = r6.f99
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (int) r2
            super.setAlpha(r0)
            super.draw(r7)
            int r0 = r6.f99
            super.setAlpha(r0)
        L37:
            boolean r0 = r6.f93
            if (r0 == 0) goto L6c
            android.graphics.Paint r0 = p000.a8.f92
            r2 = -1
            r0.setColor(r2)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r1)
            float r3 = r6.f94
            r4 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            android.graphics.Path r2 = m32(r2, r3)
            r7.drawPath(r2, r0)
            ۟.z7$e r2 = r6.f95
            int r2 = r2.f1274
            r0.setColor(r2)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r1)
            float r1 = r6.f94
            r3 = 1097859072(0x41700000, float:15.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            android.graphics.Path r1 = m32(r2, r1)
            r7.drawPath(r1, r0)
        L6c:
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f96
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            super.onBoundsChange(r2)
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            r1.f99 = r2
            android.graphics.drawable.Drawable r0 = r1.f96
            if (r0 == 0) goto L9
            r0.setAlpha(r2)
        L9:
            super.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f96
            if (r0 == 0) goto L7
            r0.setColorFilter(r2)
        L7:
            super.setColorFilter(r2)
            return
    }
}

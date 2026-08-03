package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.graphics.NinePatch f627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f631f;

    public q(android.graphics.Bitmap r4, byte[] r5, android.graphics.Rect r6) {
            r3 = this;
            r3.<init>()
            r3.f626a = r4
            r0 = 0
            if (r5 == 0) goto L27
            boolean r1 = android.graphics.NinePatch.isNinePatchChunk(r5)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            android.graphics.NinePatch r1 = new android.graphics.NinePatch     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "HchatMessageBubble"
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r4 = move-exception
            goto L1a
        L18:
            r1 = r0
            goto L1f
        L1a:
            sf.f r1 = new sf.f
            r1.<init>(r4)
        L1f:
            boolean r4 = r1 instanceof sf.f
            if (r4 == 0) goto L24
            r1 = r0
        L24:
            android.graphics.NinePatch r1 = (android.graphics.NinePatch) r1
            goto L28
        L27:
            r1 = r0
        L28:
            r3.f627b = r1
            android.graphics.Paint r4 = new android.graphics.Paint
            r5 = 3
            r4.<init>(r5)
            r3.f628c = r4
            if (r6 == 0) goto L39
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6)
        L39:
            r3.f629d = r0
            r4 = 255(0xff, float:3.57E-43)
            r3.f630e = r4
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r4.f631f
            int r1 = r4.f630e
            if (r0 == 0) goto Lf
            float r0 = (float) r1
            r1 = 1062333317(0x3f51eb85, float:0.82)
            float r0 = r0 * r1
            int r1 = (int) r0
        Lf:
            android.graphics.Paint r0 = r4.f628c
            r0.setAlpha(r1)
            android.graphics.NinePatch r1 = r4.f627b
            if (r1 == 0) goto L20
            android.graphics.Rect r2 = r4.getBounds()
            r1.draw(r5, r2, r0)
            return
        L20:
            r1 = 0
            android.graphics.Rect r2 = r4.getBounds()
            android.graphics.Bitmap r3 = r4.f626a
            r5.drawBitmap(r3, r1, r2, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            int r0 = r1.f630e
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            r2.getClass()
            android.graphics.Rect r0 = r1.f629d
            if (r0 == 0) goto Lc
            r2.set(r0)
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
            r5 = this;
            r6.getClass()
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L13
            r3 = r6[r2]
            r4 = 16842919(0x10100a7, float:2.3694026E-38)
            if (r4 != r3) goto L10
            goto L14
        L10:
            int r2 = r2 + 1
            goto L6
        L13:
            r2 = -1
        L14:
            r6 = 1
            if (r2 < 0) goto L19
            r0 = r6
            goto L1a
        L19:
            r0 = r1
        L1a:
            boolean r2 = r5.f631f
            if (r0 != r2) goto L1f
            return r1
        L1f:
            r5.f631f = r0
            r5.invalidateSelf()
            return r6
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
            r2 = this;
            r0 = 0
            r1 = 255(0xff, float:3.57E-43)
            int r3 = r9.e0.r(r3, r0, r1)
            r2.f630e = r3
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f628c
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }
}

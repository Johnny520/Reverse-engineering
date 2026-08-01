package p000;

/* JADX INFO: renamed from: jj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0433jj extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: α */
    public final android.graphics.drawable.BitmapDrawable f5480;

    /* JADX INFO: renamed from: β */
    public final android.graphics.Rect f5481;

    public C0433jj(android.graphics.drawable.BitmapDrawable r1, android.graphics.Rect r2) {
            r0 = this;
            r0.<init>()
            r0.f5480 = r1
            r0.f5481 = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.BitmapDrawable r0 = r2.f5480
            r3.getClass()
            android.graphics.Rect r2 = r2.f5481
            int r1 = r2.width()
            if (r1 <= 0) goto L2a
            int r1 = r2.height()
            if (r1 > 0) goto L14
            goto L2a
        L14:
            int r1 = r3.save()
            r3.clipRect(r2)     // Catch: java.lang.Throwable -> L25
            r0.setBounds(r2)     // Catch: java.lang.Throwable -> L25
            r0.draw(r3)     // Catch: java.lang.Throwable -> L25
            r3.restoreToCount(r1)
            return
        L25:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
        L2a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.BitmapDrawable r0 = r1.f5480
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.BitmapDrawable r0 = r1.f5480
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }
}

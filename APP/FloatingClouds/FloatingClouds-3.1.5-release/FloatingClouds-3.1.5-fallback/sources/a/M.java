package a;

/* JADX INFO: loaded from: classes.dex */
public final class M extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.ActionBarContainer f167a;

    public M(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.f167a = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f167a
            boolean r1 = r0.h
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r0.g
            if (r0 == 0) goto L20
            r0.draw(r3)
            return
        Le:
            android.graphics.drawable.Drawable r1 = r0.e
            if (r1 == 0) goto L15
            r1.draw(r3)
        L15:
            android.graphics.drawable.Drawable r1 = r0.f
            if (r1 == 0) goto L20
            boolean r0 = r0.i
            if (r0 == 0) goto L20
            r1.draw(r3)
        L20:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f167a
            boolean r1 = r0.h
            if (r1 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r0.g
            if (r1 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r0.e
            r0.getOutline(r3)
            return
        L10:
            android.graphics.drawable.Drawable r0 = r0.e
            if (r0 == 0) goto L17
            r0.getOutline(r3)
        L17:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }
}

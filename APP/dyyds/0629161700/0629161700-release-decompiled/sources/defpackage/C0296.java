package defpackage;

/* JADX INFO: renamed from: ᛲᛵᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0296 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final androidx.appcompat.widget.ActionBarContainer f1612;

    public C0296(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.f1612 = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r1 = r1.f1612
            boolean r0 = r1.f48
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r1 = r1.f46
            if (r1 == 0) goto L20
            r1.draw(r2)
            return
        Le:
            android.graphics.drawable.Drawable r0 = r1.f53
            if (r0 == 0) goto L15
            r0.draw(r2)
        L15:
            android.graphics.drawable.Drawable r0 = r1.f54
            if (r0 == 0) goto L20
            boolean r1 = r1.f52
            if (r1 == 0) goto L20
            r0.draw(r2)
        L20:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r1 = r1.f1612
            boolean r0 = r1.f48
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r1.f46
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r1 = r1.f53
            r1.getOutline(r2)
            return
        L10:
            android.graphics.drawable.Drawable r1 = r1.f53
            if (r1 == 0) goto L17
            r1.getOutline(r2)
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

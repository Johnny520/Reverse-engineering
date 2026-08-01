package p000;

/* JADX INFO: renamed from: ｇ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1137 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: α */
    public final androidx.appcompat.widget.ActionBarContainer f13482;

    public C1137(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.f13482 = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r1 = r1.f13482
            boolean r0 = r1.f471
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r1 = r1.f470
            if (r1 == 0) goto L20
            r1.draw(r2)
            return
        Le:
            android.graphics.drawable.Drawable r0 = r1.f468
            if (r0 == 0) goto L15
            r0.draw(r2)
        L15:
            android.graphics.drawable.Drawable r0 = r1.f469
            if (r0 == 0) goto L20
            boolean r1 = r1.f472
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
            androidx.appcompat.widget.ActionBarContainer r1 = r1.f13482
            boolean r0 = r1.f471
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r1.f470
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r1 = r1.f468
            r1.getOutline(r2)
            return
        L10:
            android.graphics.drawable.Drawable r1 = r1.f468
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

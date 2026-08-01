package defpackage;

/* JADX INFO: renamed from: ᛱᛵᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0101 extends defpackage.AbstractC0263 {
    @Override // defpackage.AbstractC0263, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r5) {
            r4 = this;
            int r0 = r4.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L1e
            android.graphics.Rect r0 = r4.getBounds()
            float r0 = r0.exactCenterX()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r5.scale(r1, r2, r0, r3)
            super.draw(r5)
            r5.scale(r1, r2, r0, r3)
            return
        L1e:
            super.draw(r5)
            return
    }

    @Override // defpackage.AbstractC0263, android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1521
            boolean r0 = r0.getPadding(r3)
            int r2 = r2.getLayoutDirection()
            r1 = 1
            if (r2 != r1) goto L15
            int r2 = r3.left
            int r1 = r3.right
            r3.left = r1
            r3.right = r2
        L15:
            return r0
    }

    @Override // defpackage.AbstractC0263, android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r1) {
            r0 = this;
            super.onLayoutDirectionChanged(r1)
            r0 = 1
            return r0
    }
}

package yyds;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: renamed from: yyds.ᛳᛸᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0662 extends AbstractC2719 {
    @Override // yyds.AbstractC2719, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getLayoutDirection() != 1) {
            super.draw(canvas);
            return;
        }
        float fExactCenterX = getBounds().exactCenterX();
        canvas.scale(-1.0f, 1.0f, fExactCenterX, 0.0f);
        super.draw(canvas);
        canvas.scale(-1.0f, 1.0f, fExactCenterX, 0.0f);
    }

    @Override // yyds.AbstractC2719, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding = this.f13355.getPadding(rect);
        if (getLayoutDirection() == 1) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // yyds.AbstractC2719, android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        super.onLayoutDirectionChanged(i);
        return true;
    }
}

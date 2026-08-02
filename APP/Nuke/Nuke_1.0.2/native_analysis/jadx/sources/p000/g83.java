package p000;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g83 extends RippleDrawable {

    /* JADX INFO: renamed from: h */
    public final boolean f3354h;

    /* JADX INFO: renamed from: i */
    public C0363ju f3355i;

    /* JADX INFO: renamed from: j */
    public boolean f3356j;

    public g83(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f3354h = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f3354h) {
            this.f3356j = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f3356j = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f3356j;
    }
}

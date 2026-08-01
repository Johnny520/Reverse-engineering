package p071O;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import p211o0.C2762u;

/* JADX INFO: renamed from: O.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1029h extends RippleDrawable {

    /* JADX INFO: renamed from: d */
    public final boolean f3200d;

    /* JADX INFO: renamed from: e */
    public C2762u f3201e;

    /* JADX INFO: renamed from: f */
    public Integer f3202f;

    /* JADX INFO: renamed from: g */
    public boolean f3203g;

    public C1029h(boolean z5) {
        super(ColorStateList.valueOf(-16777216), null, z5 ? new ColorDrawable(-1) : null);
        this.f3200d = z5;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f3200d) {
            this.f3203g = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f3203g = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f3203g;
    }
}

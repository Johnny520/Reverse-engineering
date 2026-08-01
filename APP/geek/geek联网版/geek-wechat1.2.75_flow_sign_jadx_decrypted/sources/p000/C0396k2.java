package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0396k2 implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0507n2 f2763a;

    public C0396k2(C0507n2 c0507n2) {
        this.f2763a = c0507n2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f2763a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f2763a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f2763a.unscheduleSelf(runnable);
    }
}

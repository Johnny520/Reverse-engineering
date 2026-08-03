package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: J2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0390J2 implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0519M2 f1325a;

    public C0390J2(C0519M2 c0519m2) {
        this.f1325a = c0519m2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f1325a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f1325a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f1325a.unscheduleSelf(runnable);
    }
}

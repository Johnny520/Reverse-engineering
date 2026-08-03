package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: J2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0390J2 implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0519M2 f1325a;

    public C0390J2(C0519M2 r1) {
        this.f1325a = r1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        this.f1325a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        this.f1325a.scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        this.f1325a.unscheduleSelf(r2);
    }
}

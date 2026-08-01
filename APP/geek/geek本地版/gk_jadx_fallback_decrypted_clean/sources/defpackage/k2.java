package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements android.graphics.drawable.Drawable.Callback {
    public final /* synthetic */ defpackage.n2 a;

    public k2(defpackage.n2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            n2 r1 = r0.a
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            n2 r1 = r0.a
            r1.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            n2 r1 = r0.a
            r1.unscheduleSelf(r2)
            return
    }
}

package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: G3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0262G3 {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f842b = null;

    /* JADX INFO: renamed from: c */
    public static C0262G3 f843c;

    /* JADX INFO: renamed from: a */
    public C2776yw f844a;

    static {
        f842b = PorterDuff.Mode.SRC_IN;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0262G3 m539a() {
        monitor-enter(C0262G3.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f843c != null) goto L9;
        m541d();     // Catch: Throwable -> L7
    L9:
        C0262G3 r1 = f843c;     // Catch: Throwable -> L7
        monitor-exit(C0262G3.class);
        return r1;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m540c(int r1, PorterDuff.Mode r2) {
        monitor-enter(C0262G3.class);
        PorterDuffColorFilter r12 = C2776yw.m5348e(r1, r2);     // Catch: Throwable -> L7
        monitor-exit(C0262G3.class);
        return r12;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m541d() {
        monitor-enter(C0262G3.class);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (f843c != null) goto L16;
        C0262G3 r1 = new C0262G3();     // Catch: Throwable -> L14
        f843c = r1;     // Catch: Throwable -> L14
        r1.f844a = C2776yw.m5347b();     // Catch: Throwable -> L14
        C2776yw r12 = f843c.f844a;     // Catch: Throwable -> L14
        C0252Fu r2 = new C0252Fu();     // Catch: Throwable -> L14
        monitor-enter(r12);     // Catch: Throwable -> L14
        r12.f9433e = r2;     // Catch: Throwable -> L11
        monitor-exit(r12);     // Catch: Throwable -> L14
        goto L16
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L16:
        monitor-exit(C0262G3.class);
    }

    /* JADX INFO: renamed from: e */
    public static void m542e(Drawable r4, C2090jB r5, int[] r6) {
        PorterDuff.Mode r0 = C2776yw.f9426f;
        int[] r02 = r4.getState();
        if (r4.mutate() == r4) goto L5;
        return;
    L5:
        if ((r4 instanceof LayerDrawable) == true) goto L7;
    L9:
        boolean r03 = r5.f7361d;
        if (r03 == false) goto L12;
    L16:
        PorterDuffColorFilter r1 = null;
        if (r03 == false) goto L19;
        ColorStateList r04 = r5.f7358a;
    L21:
        if (r5.f7360c == false) goto L23;
        PorterDuff.Mode r52 = r5.f7359b;
    L24:
        if (r04 == null) goto L28;
        if (r52 == null) goto L28;
        r1 = C2776yw.m5348e(r04.getColorForState(r6, 0), r52);
    L28:
        r4.setColorFilter(r1);
        return;
    L23:
        r52 = C2776yw.f9426f;
        goto L24
    L19:
        r04 = null;
        goto L21
    L12:
        if (r5.f7360c == true) goto L16;
        r4.clearColorFilter();
        return;
    L7:
        if (r4.isStateful() == false) goto L9;
        r4.setState(new int[0]);
        r4.setState(r02);
        goto L9
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m543b(Context r2, int r3) {
        monitor-enter(this);
        Drawable r22 = this.f844a.m5350c(r2, r3);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }
}

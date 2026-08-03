package p057g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: g.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0926s {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f3289b = null;

    /* JADX INFO: renamed from: c */
    public static C0926s f3290c;

    /* JADX INFO: renamed from: a */
    public C0933v0 f3291a;

    static {
        f3289b = PorterDuff.Mode.SRC_IN;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m2259b() {
        monitor-enter(C0926s.class);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (f3290c != null) goto L16;
        C0926s r1 = new C0926s();     // Catch: Throwable -> L14
        f3290c = r1;     // Catch: Throwable -> L14
        r1.f3291a = C0933v0.m2263c();     // Catch: Throwable -> L14
        C0933v0 r12 = f3290c.f3291a;     // Catch: Throwable -> L14
        C0924r r2 = new C0924r();     // Catch: Throwable -> L14
        monitor-enter(r12);     // Catch: Throwable -> L14
        r12.f3314e = r2;     // Catch: Throwable -> L11
        monitor-exit(r12);     // Catch: Throwable -> L14
        goto L16
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L16:
        monitor-exit(C0926s.class);
    }

    /* JADX INFO: renamed from: c */
    public static void m2260c(Drawable r4, C0853C0 r5, int[] r6) {
        PorterDuff.Mode r02 = C0933v0.f3307f;
        int[] r03 = r4.getState();
        if (r4.mutate() == r4) goto L5;
        return;
    L5:
        if ((r4 instanceof LayerDrawable) == true) goto L7;
    L9:
        boolean r04 = r5.f3087d;
        if (r04 == false) goto L12;
    L15:
        PorterDuffColorFilter r1 = null;
        if (r04 == false) goto L18;
        ColorStateList r05 = r5.f3084a;
    L20:
        if (r5.f3086c == false) goto L22;
        PorterDuff.Mode r52 = r5.f3085b;
    L23:
        if (r05 == null) goto L27;
        if (r52 == null) goto L27;
        r1 = C0933v0.m2264g(r05.getColorForState(r6, 0), r52);
    L27:
        r4.setColorFilter(r1);
        return;
    L22:
        r52 = C0933v0.f3307f;
        goto L23
    L18:
        r05 = null;
        goto L20
    L12:
        if (r5.f3086c == true) goto L15;
        r4.clearColorFilter();
        return;
    L7:
        if (r4.isStateful() == false) goto L9;
        r4.setState(new int[0]);
        r4.setState(r03);
        goto L9
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Drawable m2261a(Context r2, int r3) {
        monitor-enter(this);
        Drawable r22 = this.f3291a.m2268e(r2, r3);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }
}

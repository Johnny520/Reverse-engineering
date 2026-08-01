package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class u3 {
    public static final PorterDuff.Mode b = null;
    public static u3 c;
    public w00 a;

    static {
        b = PorterDuff.Mode.SRC_IN;
    }

    public static synchronized u3 a() {
        monitor-enter(u3.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (c != null) goto L9;
        d();     // Catch: Throwable -> L7
    L9:
        u3 r1 = c;     // Catch: Throwable -> L7
        monitor-exit(u3.class);
        return r1;
    }

    public static synchronized PorterDuffColorFilter c(int r1, PorterDuff.Mode r2) {
        monitor-enter(u3.class);
        PorterDuffColorFilter r12 = w00.e(r1, r2);     // Catch: Throwable -> L7
        monitor-exit(u3.class);
        return r12;
    L7:
        th = move-exception;
        throw th;
    }

    public static synchronized void d() {
        monitor-enter(u3.class);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (c != null) goto L16;
        u3 r1 = new u3();     // Catch: Throwable -> L14
        c = r1;     // Catch: Throwable -> L14
        r1.a = w00.b();     // Catch: Throwable -> L14
        w00 r12 = c.a;     // Catch: Throwable -> L14
        t3 r2 = new t3();     // Catch: Throwable -> L14
        monitor-enter(r12);     // Catch: Throwable -> L14
        r12.e = r2;     // Catch: Throwable -> L11
        monitor-exit(r12);     // Catch: Throwable -> L14
        goto L16
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L16:
        monitor-exit(u3.class);
    }

    public static void e(Drawable r4, y60 r5, int[] r6) {
        PorterDuff.Mode r0 = w00.f;
        int[] r02 = r4.getState();
        int[] r1 = eh.a;
        if (r4.mutate() == r4) goto L5;
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        return;
    L5:
        if ((r4 instanceof LayerDrawable) == true) goto L7;
    L9:
        boolean r03 = r5.d;
        if (r03 == false) goto L12;
    L16:
        PorterDuffColorFilter r12 = null;
        if (r03 == false) goto L19;
        ColorStateList r04 = r5.a;
    L21:
        if (r5.c == false) goto L23;
        PorterDuff.Mode r52 = r5.b;
    L24:
        if (r04 == null) goto L28;
        if (r52 == null) goto L28;
        r12 = w00.e(r04.getColorForState(r6, 0), r52);
    L28:
        r4.setColorFilter(r12);
        return;
    L23:
        r52 = w00.f;
        goto L24
    L19:
        r04 = null;
        goto L21
    L12:
        if (r5.c == true) goto L16;
        r4.clearColorFilter();
        return;
    L7:
        if (r4.isStateful() == false) goto L9;
        r4.setState(new int[0]);
        r4.setState(r02);
        goto L9
    }

    public final synchronized Drawable b(Context r2, int r3) {
        monitor-enter(this);
        Drawable r22 = this.a.c(r2, r3);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }
}

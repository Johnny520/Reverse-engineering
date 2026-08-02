package defpackage;

import android.content.Context;
import android.os.Build;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c9 implements nq0 {
    public static boolean f = true;
    public final b7 a;
    public final Object b = new Object();
    public eb3 c;
    public boolean d;
    public final a9 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c9(b7 b7Var) {
        this.a = b7Var;
        a9 a9Var = new a9();
        this.e = a9Var;
        if (b7Var.isAttachedToWindow()) {
            Context context = b7Var.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(a9Var);
                this.d = true;
            }
        }
        b7Var.addOnAttachStateChangeListener(new b9(0, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nq0
    public final void a(pq0 pq0Var) {
        synchronized (this.b) {
            if (!pq0Var.s) {
                pq0Var.s = true;
                pq0Var.b();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nq0
    public final pq0 b() {
        rq0 zq0Var;
        rq0 xq0Var;
        pq0 pq0Var;
        synchronized (this.b) {
            try {
                b7 b7Var = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    b7Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    xq0Var = new xq0();
                } else {
                    if (f) {
                        try {
                            zq0Var = new uq0(this.a, new tp(), new sp());
                        } catch (Throwable unused) {
                            f = false;
                            zq0Var = new zq0(c(this.a));
                        }
                    } else {
                        zq0Var = new zq0(c(this.a));
                    }
                    xq0Var = zq0Var;
                }
                pq0Var = new pq0(xq0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kc0 c(b7 b7Var) {
        eb3 eb3Var = this.c;
        if (eb3Var != null) {
            return eb3Var;
        }
        eb3 eb3Var2 = new eb3(b7Var.getContext());
        eb3Var2.setClipChildren(false);
        eb3Var2.setClipToPadding(false);
        eb3Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        b7Var.addView(eb3Var2, -1);
        this.c = eb3Var2;
        return eb3Var2;
    }
}

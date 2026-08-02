package p000;

import android.content.Context;
import android.os.Build;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: c9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0083c9 implements nq0 {

    /* JADX INFO: renamed from: f */
    public static boolean f1238f = true;

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f1239a;

    /* JADX INFO: renamed from: b */
    public final Object f1240b = new Object();

    /* JADX INFO: renamed from: c */
    public eb3 f1241c;

    /* JADX INFO: renamed from: d */
    public boolean f1242d;

    /* JADX INFO: renamed from: e */
    public final ComponentCallbacks2C0010a9 f1243e;

    public C0083c9(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        this.f1239a = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        ComponentCallbacks2C0010a9 componentCallbacks2C0010a9 = new ComponentCallbacks2C0010a9();
        this.f1243e = componentCallbacks2C0010a9;
        if (viewTreeObserverOnGlobalLayoutListenerC0045b7.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext();
            if (!this.f1242d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C0010a9);
                this.f1242d = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC0045b7.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0047b9(0, this));
    }

    @Override // p000.nq0
    /* JADX INFO: renamed from: a */
    public final void mo706a(pq0 pq0Var) {
        synchronized (this.f1240b) {
            if (!pq0Var.f8472s) {
                pq0Var.f8472s = true;
                pq0Var.m3944b();
            }
        }
    }

    @Override // p000.nq0
    /* JADX INFO: renamed from: b */
    public final pq0 mo707b() {
        rq0 zq0Var;
        rq0 xq0Var;
        pq0 pq0Var;
        synchronized (this.f1240b) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f1239a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.getUniqueDrawingId();
                }
                if (i >= 29) {
                    xq0Var = new xq0();
                } else {
                    if (f1238f) {
                        try {
                            zq0Var = new uq0(this.f1239a, new C0742tp(), new C0702sp());
                        } catch (Throwable unused) {
                            f1238f = false;
                            zq0Var = new zq0(m708c(this.f1239a));
                        }
                    } else {
                        zq0Var = new zq0(m708c(this.f1239a));
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

    /* JADX INFO: renamed from: c */
    public final kc0 m708c(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        eb3 eb3Var = this.f1241c;
        if (eb3Var != null) {
            return eb3Var;
        }
        eb3 eb3Var2 = new eb3(viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext());
        eb3Var2.setClipChildren(false);
        eb3Var2.setClipToPadding(false);
        eb3Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC0045b7.addView(eb3Var2, -1);
        this.f1241c = eb3Var2;
        return eb3Var2;
    }
}

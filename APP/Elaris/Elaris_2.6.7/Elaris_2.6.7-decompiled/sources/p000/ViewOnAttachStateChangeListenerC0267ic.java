package p000;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ic */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0267ic implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f420a;

    /* JADX INFO: renamed from: b */
    public final String f421b;

    /* JADX INFO: renamed from: c */
    public final C0338n0 f422c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0286jc f423d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0251hc f424e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f425f;

    /* JADX INFO: renamed from: g */
    public RunnableC0412q f426g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC0267ic(View view, String str, C0338n0 c0338n0, InterfaceC0286jc interfaceC0286jc, InterfaceC0251hc interfaceC0251hc) {
        this.f420a = new WeakReference(view);
        this.f421b = str;
        this.f422c = c0338n0;
        this.f423d = interfaceC0286jc;
        this.f424e = interfaceC0251hc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m680a(boolean z) {
        if (this.f425f) {
            return;
        }
        this.f425f = true;
        C0338n0 c0338n0 = this.f422c;
        synchronized (c0338n0) {
            c0338n0.f584b = true;
        }
        RunnableC0412q runnableC0412q = this.f426g;
        this.f426g = null;
        if (runnableC0412q != null) {
            AbstractC0302kc.m743a().removeCallbacks(runnableC0412q);
        }
        m681b(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m681b(boolean z) {
        View view = (View) this.f420a.get();
        if (view != null) {
            try {
                view.removeOnAttachStateChangeListener(this);
            } catch (Throwable th) {
                AbstractC0198e7.m343a("repeater", "token-detach-listener", th);
            }
            if (z) {
                WeakHashMap weakHashMap = AbstractC0302kc.f504a;
                synchronized (weakHashMap) {
                    try {
                        Map map = (Map) weakHashMap.get(view);
                        if (map != null && map.get(this.f421b) == this) {
                            map.remove(this.f421b);
                            if (map.isEmpty()) {
                                weakHashMap.remove(view);
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m682c() {
        C0017b0 c0017b0;
        C0338n0 c0338n0 = this.f422c;
        synchronized (c0338n0) {
            if (c0338n0.f584b) {
                c0017b0 = null;
            } else {
                int i = c0338n0.f583a;
                long[] jArr = (long[]) c0338n0.f585c;
                if (i >= jArr.length) {
                    c0017b0 = null;
                } else {
                    c0338n0.f583a = i + 1;
                    c0017b0 = new C0017b0(i, jArr[i] - (i == 0 ? 0L : jArr[i - 1]));
                }
            }
        }
        if (c0017b0 == null) {
            m681b(true);
            return;
        }
        this.f426g = new RunnableC0412q(this, c0017b0, 8, false);
        try {
            AbstractC0302kc.m743a().postDelayed(this.f426g, c0017b0.f52b);
        } catch (Throwable th) {
            AbstractC0198e7.m343a("repeater", this.f421b + "-schedule", th);
            m680a(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m680a(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

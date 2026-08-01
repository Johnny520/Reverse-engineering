package p265s1;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import p024b9.AbstractC1043k;
import p172l8.C4700i0;
import p305v1.C8761c;
import p305v1.C8764d0;
import p305v1.C8766e0;
import p305v1.C8767f;
import p305v1.InterfaceC8763d;
import p318w1.AbstractC9036a;
import p318w1.C9037b;

/* JADX INFO: renamed from: s1.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7092j0 implements InterfaceC7064d2 {

    /* JADX INFO: renamed from: f */
    public static final c f23560f = new c(null);

    /* JADX INFO: renamed from: g */
    public static boolean f23561g = true;

    /* JADX INFO: renamed from: a */
    public final ViewGroup f23562a;

    /* JADX INFO: renamed from: c */
    public AbstractC9036a f23564c;

    /* JADX INFO: renamed from: d */
    public boolean f23565d;

    /* JADX INFO: renamed from: b */
    public final Object f23563b = new Object();

    /* JADX INFO: renamed from: e */
    public final ComponentCallbacks2 f23566e = new a();

    /* JADX INFO: renamed from: s1.j0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C7092j0.this.m27916i(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C7092j0.this.m27917j(view.getContext());
            C7092j0.this.m27913f();
        }
    }

    /* JADX INFO: renamed from: s1.j0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final d f23569a = new d();

        /* JADX INFO: renamed from: a */
        public static final long m27918a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public C7092j0(ViewGroup viewGroup) {
        this.f23562a = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            m27916i(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new b());
    }

    @Override // p265s1.InterfaceC7064d2
    /* JADX INFO: renamed from: a */
    public C8761c mo23872a() {
        InterfaceC8763d c8766e0;
        C8761c c8761c;
        synchronized (this.f23563b) {
            try {
                long jM27914g = m27914g(this.f23562a);
                if (Build.VERSION.SDK_INT >= 29) {
                    c8766e0 = new C8764d0(jM27914g, null, null, 6, null);
                } else if (f23561g) {
                    try {
                        c8766e0 = new C8767f(this.f23562a, jM27914g, null, null, 12, null);
                    } catch (Throwable unused) {
                        f23561g = false;
                        c8766e0 = new C8766e0(m27915h(this.f23562a), jM27914g, null, null, 12, null);
                    }
                } else {
                    c8766e0 = new C8766e0(m27915h(this.f23562a), jM27914g, null, null, 12, null);
                }
                c8761c = new C8761c(c8766e0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8761c;
    }

    @Override // p265s1.InterfaceC7064d2
    /* JADX INFO: renamed from: b */
    public void mo23873b(C8761c c8761c) {
        synchronized (this.f23563b) {
            c8761c.m33621I();
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m27914g(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.m27918a(view);
        }
        return -1L;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC9036a m27915h(ViewGroup viewGroup) {
        AbstractC9036a abstractC9036a = this.f23564c;
        if (abstractC9036a != null) {
            return abstractC9036a;
        }
        C9037b c9037b = new C9037b(viewGroup.getContext());
        viewGroup.addView(c9037b);
        this.f23564c = c9037b;
        return c9037b;
    }

    /* JADX INFO: renamed from: i */
    public final void m27916i(Context context) {
        if (this.f23565d) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.f23566e);
        this.f23565d = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m27917j(Context context) {
        if (this.f23565d) {
            context.getApplicationContext().unregisterComponentCallbacks(this.f23566e);
            this.f23565d = false;
        }
    }

    /* JADX INFO: renamed from: s1.j0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {
        public /* synthetic */ c(AbstractC1043k abstractC1043k) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: s1.j0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements ComponentCallbacks2 {
        public a() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 >= 40) {
                C7092j0.this.m27913f();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m27913f() {
    }
}

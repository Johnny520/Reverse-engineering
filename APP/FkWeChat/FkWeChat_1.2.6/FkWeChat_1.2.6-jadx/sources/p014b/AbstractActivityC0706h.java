package p014b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0657e0;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.AbstractC0679p0;
import androidx.lifecycle.AbstractC0681q0;
import androidx.lifecycle.C0665i0;
import androidx.lifecycle.C0673m0;
import androidx.lifecycle.C0675n0;
import androidx.lifecycle.C0680q;
import androidx.lifecycle.FragmentC0690z;
import androidx.lifecycle.InterfaceC0664i;
import androidx.lifecycle.InterfaceC0672m;
import androidx.lifecycle.InterfaceC0676o;
import androidx.lifecycle.InterfaceC0677o0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p010a9.InterfaceC0173a;
import p014b.AbstractActivityC0706h;
import p039d.C1846a;
import p039d.InterfaceC1847b;
import p055e.AbstractC1961b;
import p137j4.AbstractC3594a;
import p137j4.C3595b;
import p172l8.C4700i0;
import p181m4.AbstractC4977n;
import p181m4.C4970g;
import p181m4.C4972i;
import p181m4.InterfaceC4973j;
import p223p3.AbstractActivityC5946a;
import p223p3.C5947b;
import p223p3.C5948c;
import p238q4.AbstractC6244a;
import p320w3.InterfaceC9168a;
import p336x3.C9386f;
import p376zd.C10010p0;

/* JADX INFO: renamed from: b.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0706h extends AbstractActivityC5946a implements InterfaceC0676o, InterfaceC0677o0, InterfaceC0664i, InterfaceC4973j, InterfaceC0718t, InterfaceC0713o {

    /* JADX INFO: renamed from: A */
    public final C0712n f2060A;

    /* JADX INFO: renamed from: B */
    public int f2061B;

    /* JADX INFO: renamed from: C */
    public final AtomicInteger f2062C;

    /* JADX INFO: renamed from: D */
    public final AbstractC1961b f2063D;

    /* JADX INFO: renamed from: E */
    public final CopyOnWriteArrayList f2064E;

    /* JADX INFO: renamed from: F */
    public final CopyOnWriteArrayList f2065F;

    /* JADX INFO: renamed from: G */
    public final CopyOnWriteArrayList f2066G;

    /* JADX INFO: renamed from: H */
    public final CopyOnWriteArrayList f2067H;

    /* JADX INFO: renamed from: I */
    public final CopyOnWriteArrayList f2068I;

    /* JADX INFO: renamed from: J */
    public boolean f2069J;

    /* JADX INFO: renamed from: K */
    public boolean f2070K;

    /* JADX INFO: renamed from: s */
    public final C1846a f2071s = new C1846a();

    /* JADX INFO: renamed from: t */
    public final C9386f f2072t = new C9386f(new Runnable() { // from class: b.d
        @Override // java.lang.Runnable
        public final void run() {
            this.f2056q.m2778o();
        }
    });

    /* JADX INFO: renamed from: u */
    public final C0680q f2073u = new C0680q(this);

    /* JADX INFO: renamed from: v */
    public final C4972i f2074v;

    /* JADX INFO: renamed from: w */
    public C0675n0 f2075w;

    /* JADX INFO: renamed from: x */
    public C0673m0.c f2076x;

    /* JADX INFO: renamed from: y */
    public C0715q f2077y;

    /* JADX INFO: renamed from: z */
    public final j f2078z;

    /* JADX INFO: renamed from: b.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a extends AbstractC1961b {
        public a() {
        }
    }

    /* JADX INFO: renamed from: b.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements InterfaceC0672m {
        public b() {
        }

        @Override // androidx.lifecycle.InterfaceC0672m
        /* JADX INFO: renamed from: j */
        public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
            if (aVar == AbstractC0668k.a.ON_STOP) {
                Window window = AbstractActivityC0706h.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    g.m2780a(viewPeekDecorView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.h$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c implements InterfaceC0672m {
        public c() {
        }

        @Override // androidx.lifecycle.InterfaceC0672m
        /* JADX INFO: renamed from: j */
        public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
            if (aVar == AbstractC0668k.a.ON_DESTROY) {
                AbstractActivityC0706h.this.f2071s.m6538b();
                if (!AbstractActivityC0706h.this.isChangingConfigurations()) {
                    AbstractActivityC0706h.this.mo2659c().m2655a();
                }
                AbstractActivityC0706h.this.f2078z.mo2782d();
            }
        }
    }

    /* JADX INFO: renamed from: b.h$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class d implements InterfaceC0672m {
        public d() {
        }

        @Override // androidx.lifecycle.InterfaceC0672m
        /* JADX INFO: renamed from: j */
        public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
            AbstractActivityC0706h.this.m2775l();
            AbstractActivityC0706h.this.getLifecycle().mo2630c(this);
        }
    }

    /* JADX INFO: renamed from: b.h$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractActivityC0706h.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.h$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class f implements InterfaceC0672m {
        public f() {
        }

        @Override // androidx.lifecycle.InterfaceC0672m
        /* JADX INFO: renamed from: j */
        public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
            if (aVar != AbstractC0668k.a.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            AbstractActivityC0706h.this.f2077y.m2816o(h.m2781a((AbstractActivityC0706h) interfaceC0676o));
        }
    }

    /* JADX INFO: renamed from: b.h$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g {
        /* JADX INFO: renamed from: a */
        public static void m2780a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: b.h$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class h {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m2781a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* JADX INFO: renamed from: b.h$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class i {

        /* JADX INFO: renamed from: a */
        public Object f2085a;

        /* JADX INFO: renamed from: b */
        public C0675n0 f2086b;
    }

    /* JADX INFO: renamed from: b.h$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface j extends Executor {
        /* JADX INFO: renamed from: d */
        void mo2782d();

        /* JADX INFO: renamed from: e */
        void mo2783e(View view);
    }

    /* JADX INFO: renamed from: b.h$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: r */
        public Runnable f2088r;

        /* JADX INFO: renamed from: q */
        public final long f2087q = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: s */
        public boolean f2089s = false;

        public k() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2784a(k kVar) {
            Runnable runnable = kVar.f2088r;
            if (runnable != null) {
                runnable.run();
                kVar.f2088r = null;
            }
        }

        @Override // p014b.AbstractActivityC0706h.j
        /* JADX INFO: renamed from: d */
        public void mo2782d() {
            AbstractActivityC0706h.this.getWindow().getDecorView().removeCallbacks(this);
            AbstractActivityC0706h.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // p014b.AbstractActivityC0706h.j
        /* JADX INFO: renamed from: e */
        public void mo2783e(View view) {
            if (this.f2089s) {
                return;
            }
            this.f2089s = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f2088r = runnable;
            View decorView = AbstractActivityC0706h.this.getWindow().getDecorView();
            if (!this.f2089s) {
                decorView.postOnAnimation(new Runnable() { // from class: b.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC0706h.k.m2784a(this.f2091q);
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f2088r;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f2087q) {
                    this.f2089s = false;
                    AbstractActivityC0706h.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f2088r = null;
            if (AbstractActivityC0706h.this.f2060A.m2792c()) {
                this.f2089s = false;
                AbstractActivityC0706h.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC0706h.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public AbstractActivityC0706h() {
        C4972i c4972iM20072a = C4972i.m20072a(this);
        this.f2074v = c4972iM20072a;
        this.f2077y = null;
        j jVarM2774k = m2774k();
        this.f2078z = jVarM2774k;
        this.f2060A = new C0712n(jVarM2774k, new InterfaceC0173a() { // from class: b.e
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractActivityC0706h.m2770g(this.f2057q);
            }
        });
        this.f2062C = new AtomicInteger();
        this.f2063D = new a();
        this.f2064E = new CopyOnWriteArrayList();
        this.f2065F = new CopyOnWriteArrayList();
        this.f2066G = new CopyOnWriteArrayList();
        this.f2067H = new CopyOnWriteArrayList();
        this.f2068I = new CopyOnWriteArrayList();
        this.f2069J = false;
        this.f2070K = false;
        if (getLifecycle() == null) {
            C10010p0.m38820a("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().mo2628a(new b());
        getLifecycle().mo2628a(new c());
        getLifecycle().mo2628a(new d());
        c4972iM20072a.m20074c();
        AbstractC0657e0.m2604c(this);
        getSavedStateRegistry().m20069c("android:support:activity-result", new C4970g.b() { // from class: b.f
            @Override // p181m4.C4970g.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo2609a() {
                return AbstractActivityC0706h.m2769f(this.f2058a);
            }
        });
        m2773j(new InterfaceC1847b() { // from class: b.g
            @Override // p039d.InterfaceC1847b
            /* JADX INFO: renamed from: a */
            public final void mo2767a(Context context) {
                AbstractActivityC0706h.m2768e(this.f2059a, context);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2768e(AbstractActivityC0706h abstractActivityC0706h, Context context) {
        Bundle bundleM20067a = abstractActivityC0706h.getSavedStateRegistry().m20067a("android:support:activity-result");
        if (bundleM20067a != null) {
            abstractActivityC0706h.f2063D.m7108d(bundleM20067a);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Bundle m2769f(AbstractActivityC0706h abstractActivityC0706h) {
        abstractActivityC0706h.getClass();
        Bundle bundle = new Bundle();
        abstractActivityC0706h.f2063D.m7109e(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C4700i0 m2770g(AbstractActivityC0706h abstractActivityC0706h) {
        abstractActivityC0706h.reportFullyDrawn();
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0664i
    /* JADX INFO: renamed from: a */
    public C0673m0.c mo2614a() {
        if (this.f2076x == null) {
            this.f2076x = new C0665i0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f2076x;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2777n();
        this.f2078z.mo2783e(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC0664i
    /* JADX INFO: renamed from: b */
    public AbstractC3594a mo2615b() {
        C3595b c3595b = new C3595b();
        if (getApplication() != null) {
            c3595b.m13450c(C0673m0.a.f1983h, getApplication());
        }
        c3595b.m13450c(AbstractC0657e0.f1943a, this);
        c3595b.m13450c(AbstractC0657e0.f1944b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c3595b.m13450c(AbstractC0657e0.f1945c, getIntent().getExtras());
        }
        return c3595b;
    }

    @Override // androidx.lifecycle.InterfaceC0677o0
    /* JADX INFO: renamed from: c */
    public C0675n0 mo2659c() {
        if (getApplication() != null) {
            m2775l();
            return this.f2075w;
        }
        C10010p0.m38820a("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0676o
    public AbstractC0668k getLifecycle() {
        return this.f2073u;
    }

    @Override // p181m4.InterfaceC4973j
    public final C4970g getSavedStateRegistry() {
        return this.f2074v.m20073b();
    }

    /* JADX INFO: renamed from: j */
    public final void m2773j(InterfaceC1847b interfaceC1847b) {
        this.f2071s.m6537a(interfaceC1847b);
    }

    /* JADX INFO: renamed from: k */
    public final j m2774k() {
        return new k();
    }

    /* JADX INFO: renamed from: l */
    public void m2775l() {
        if (this.f2075w == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f2075w = iVar.f2086b;
            }
            if (this.f2075w == null) {
                this.f2075w = new C0675n0();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final C0715q m2776m() {
        if (this.f2077y == null) {
            this.f2077y = new C0715q(new e());
            getLifecycle().mo2628a(new f());
        }
        return this.f2077y;
    }

    /* JADX INFO: renamed from: n */
    public void m2777n() {
        AbstractC0679p0.m2662b(getWindow().getDecorView(), this);
        AbstractC0681q0.m2679b(getWindow().getDecorView(), this);
        AbstractC4977n.m20087b(getWindow().getDecorView(), this);
        AbstractC0721w.m2834a(getWindow().getDecorView(), this);
        AbstractC0720v.m2833a(getWindow().getDecorView(), this);
    }

    /* JADX INFO: renamed from: o */
    public void m2778o() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f2063D.m7106b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m2776m().m2813l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2064E.iterator();
        while (it.hasNext()) {
            ((InterfaceC9168a) it.next()).accept(configuration);
        }
    }

    @Override // p223p3.AbstractActivityC5946a, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2074v.m20075d(bundle);
        this.f2071s.m6539c(this);
        super.onCreate(bundle);
        FragmentC0690z.m2705e(this);
        int i10 = this.f2061B;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.f2072t.m36522a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f2072t.m36524c(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.f2069J = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f2069J = false;
            Iterator it = this.f2067H.iterator();
            while (it.hasNext()) {
                ((InterfaceC9168a) it.next()).accept(new C5947b(z10, configuration));
            }
        } catch (Throwable th) {
            this.f2069J = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f2066G.iterator();
        while (it.hasNext()) {
            ((InterfaceC9168a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f2072t.m36523b(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.f2070K = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f2070K = false;
            Iterator it = this.f2068I.iterator();
            while (it.hasNext()) {
                ((InterfaceC9168a) it.next()).accept(new C5948c(z10, configuration));
            }
        } catch (Throwable th) {
            this.f2070K = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.f2072t.m36525d(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f2063D.m7106b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object objM2779p = m2779p();
        C0675n0 c0675n0 = this.f2075w;
        if (c0675n0 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            c0675n0 = iVar.f2086b;
        }
        if (c0675n0 == null && objM2779p == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f2085a = objM2779p;
        iVar2.f2086b = c0675n0;
        return iVar2;
    }

    @Override // p223p3.AbstractActivityC5946a, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0668k lifecycle = getLifecycle();
        if (lifecycle instanceof C0680q) {
            ((C0680q) lifecycle).m2672m(AbstractC0668k.b.f1970s);
        }
        super.onSaveInstanceState(bundle);
        this.f2074v.m20076e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f2065F.iterator();
        while (it.hasNext()) {
            ((InterfaceC9168a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    /* JADX INFO: renamed from: p */
    public Object m2779p() {
        return null;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC6244a.m24641d()) {
                AbstractC6244a.m24638a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f2060A.m2791b();
            AbstractC6244a.m24639b();
        } catch (Throwable th) {
            AbstractC6244a.m24639b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        m2777n();
        this.f2078z.mo2783e(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m2777n();
        this.f2078z.mo2783e(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2777n();
        this.f2078z.mo2783e(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.f2069J) {
            return;
        }
        Iterator it = this.f2067H.iterator();
        while (it.hasNext()) {
            ((InterfaceC9168a) it.next()).accept(new C5947b(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.f2070K) {
            return;
        }
        Iterator it = this.f2068I.iterator();
        while (it.hasNext()) {
            ((InterfaceC9168a) it.next()).accept(new C5948c(z10));
        }
    }
}

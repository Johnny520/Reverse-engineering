package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C0036a;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC0099cc;
import p000.AbstractC0387ju;
import p000.AbstractC0493mp;
import p000.AbstractC0778ue;
import p000.C0004a3;
import p000.C0022al;
import p000.C0063bc;
import p000.C0138d4;
import p000.C0146dc;
import p000.C0339im;
import p000.C0426kw;
import p000.C0463lw;
import p000.C0518nd;
import p000.C0741te;
import p000.C0773u9;
import p000.C0893xh;
import p000.EnumC0494mq;
import p000.EnumC0531nq;
import p000.ExecutorC0182ec;
import p000.InterfaceC0277gx;
import p000.InterfaceC0379jm;
import p000.InterfaceC0603po;
import p000.InterfaceC0642qq;
import p000.InterfaceC0716sq;
import p000.RunnableC0325i7;
import p000.RunnableC0884x8;
import p000.a20;
import p000.b20;
import p000.g40;
import p000.r10;
import p000.u00;
import p000.v10;
import p000.w00;
import p000.w10;
import p000.wa0;
import p000.xa0;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements xa0, InterfaceC0603po, b20 {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f120r = 0;

    /* JADX INFO: renamed from: b */
    public final C0518nd f121b = new C0518nd();

    /* JADX INFO: renamed from: c */
    public final C0138d4 f122c = new C0138d4(new RunnableC0884x8(2, this));

    /* JADX INFO: renamed from: d */
    public final C0036a f123d;

    /* JADX INFO: renamed from: e */
    public final C0339im f124e;

    /* JADX INFO: renamed from: f */
    public wa0 f125f;

    /* JADX INFO: renamed from: g */
    public C0029a f126g;

    /* JADX INFO: renamed from: h */
    public final ExecutorC0182ec f127h;

    /* JADX INFO: renamed from: i */
    public final C0339im f128i;

    /* JADX INFO: renamed from: j */
    public final C0063bc f129j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f130k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f131l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f132m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f133n;

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList f134o;

    /* JADX INFO: renamed from: p */
    public boolean f135p;

    /* JADX INFO: renamed from: q */
    public boolean f136q;

    public ComponentActivity() {
        C0036a c0036a = new C0036a(this);
        this.f123d = c0036a;
        C0339im c0339im = new C0339im(this);
        this.f124e = c0339im;
        a20 a20Var = null;
        this.f126g = null;
        ExecutorC0182ec executorC0182ec = new ExecutorC0182ec(this);
        this.f127h = executorC0182ec;
        this.f128i = new C0339im(executorC0182ec, new C0773u9(2, this));
        new AtomicInteger();
        this.f129j = new C0063bc();
        this.f130k = new CopyOnWriteArrayList();
        this.f131l = new CopyOnWriteArrayList();
        this.f132m = new CopyOnWriteArrayList();
        this.f133n = new CopyOnWriteArrayList();
        this.f134o = new CopyOnWriteArrayList();
        this.f135p = false;
        this.f136q = false;
        c0036a.m259a(new InterfaceC0642qq() { // from class: androidx.activity.ComponentActivity.2
            @Override // p000.InterfaceC0642qq
            /* JADX INFO: renamed from: b */
            public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
                if (enumC0494mq == EnumC0494mq.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0036a.m259a(new InterfaceC0642qq() { // from class: androidx.activity.ComponentActivity.3
            @Override // p000.InterfaceC0642qq
            /* JADX INFO: renamed from: b */
            public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
                if (enumC0494mq == EnumC0494mq.ON_DESTROY) {
                    ComponentActivity.this.f121b.f3276b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo104d().m2603a();
                    }
                    ExecutorC0182ec executorC0182ec2 = ComponentActivity.this.f127h;
                    ComponentActivity componentActivity = executorC0182ec2.f1572d;
                    componentActivity.getWindow().getDecorView().removeCallbacks(executorC0182ec2);
                    componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0182ec2);
                }
            }
        });
        c0036a.m259a(new InterfaceC0642qq() { // from class: androidx.activity.ComponentActivity.4
            @Override // p000.InterfaceC0642qq
            /* JADX INFO: renamed from: b */
            public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f125f == null) {
                    C0146dc c0146dc = (C0146dc) componentActivity.getLastNonConfigurationInstance();
                    if (c0146dc != null) {
                        componentActivity.f125f = c0146dc.f1358a;
                    }
                    if (componentActivity.f125f == null) {
                        componentActivity.f125f = new wa0();
                    }
                }
                componentActivity.f123d.m264f(this);
            }
        });
        c0339im.m1503a();
        EnumC0531nq enumC0531nq = c0036a.f481c;
        if (enumC0531nq != EnumC0531nq.f3330b && enumC0531nq != EnumC0531nq.f3331c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0004a3 c0004a3 = (C0004a3) c0339im.f2555c;
        c0004a3.getClass();
        Iterator it = ((v10) c0004a3.f18f).iterator();
        while (true) {
            r10 r10Var = (r10) it;
            if (!r10Var.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) r10Var.next();
            AbstractC0493mp.m1856f("components", entry);
            String str = (String) entry.getKey();
            a20 a20Var2 = (a20) entry.getValue();
            if (AbstractC0493mp.m1853c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                a20Var = a20Var2;
                break;
            }
        }
        if (a20Var == null) {
            w10 w10Var = new w10((C0004a3) this.f124e.f2555c, this);
            ((C0004a3) this.f124e.f2555c).m22e("androidx.lifecycle.internal.SavedStateHandlesProvider", w10Var);
            this.f123d.m259a(new SavedStateHandleAttacher(w10Var));
        }
        ((C0004a3) this.f124e.f2555c).m22e("android:support:activity-result", new a20() { // from class: zb
            @Override // p000.a20
            /* JADX INFO: renamed from: a */
            public final Bundle mo17a() {
                int i = ComponentActivity.f120r;
                Bundle bundle = new Bundle();
                C0063bc c0063bc = this.f5564a.f129j;
                c0063bc.getClass();
                HashMap map = c0063bc.f710b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0063bc.f712d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0063bc.f715g.clone());
                return bundle;
            }
        });
        m106h(new InterfaceC0277gx() { // from class: ac
            @Override // p000.InterfaceC0277gx
            /* JADX INFO: renamed from: a */
            public final void mo46a() {
                ComponentActivity componentActivity = this.f63a;
                Bundle bundleM20c = ((C0004a3) componentActivity.f124e.f2555c).m20c("android:support:activity-result");
                if (bundleM20c != null) {
                    C0063bc c0063bc = componentActivity.f129j;
                    HashMap map = c0063bc.f710b;
                    HashMap map2 = c0063bc.f709a;
                    Bundle bundle = c0063bc.f715g;
                    ArrayList<Integer> integerArrayList = bundleM20c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM20c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c0063bc.f712d = bundleM20c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    bundle.putAll(bundleM20c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                    for (int i = 0; i < stringArrayList.size(); i++) {
                        String str2 = stringArrayList.get(i);
                        if (map.containsKey(str2)) {
                            Integer num = (Integer) map.remove(str2);
                            if (!bundle.containsKey(str2)) {
                                map2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        num2.intValue();
                        String str3 = stringArrayList.get(i);
                        map2.put(num2, str3);
                        c0063bc.f710b.put(str3, num2);
                    }
                }
            }
        });
    }

    @Override // p000.InterfaceC0603po
    /* JADX INFO: renamed from: a */
    public final AbstractC0778ue mo102a() {
        C0741te c0741te = C0741te.f4503b;
        AbstractC0493mp.m1857g("initialExtras", c0741te);
        C0463lw c0463lw = new C0463lw();
        c0463lw.f4820a.putAll(c0741te.f4820a);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0463lw.f4820a;
        if (application != null) {
            linkedHashMap.put(C0893xh.f5259o, getApplication());
        }
        linkedHashMap.put(AbstractC0493mp.f3179q, this);
        linkedHashMap.put(AbstractC0493mp.f3180r, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0493mp.f3181s, getIntent().getExtras());
        }
        return c0463lw;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m108j();
        this.f127h.m985a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p000.b20
    /* JADX INFO: renamed from: b */
    public final C0004a3 mo103b() {
        return (C0004a3) this.f124e.f2555c;
    }

    @Override // p000.xa0
    /* JADX INFO: renamed from: d */
    public final wa0 mo104d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f125f == null) {
            C0146dc c0146dc = (C0146dc) getLastNonConfigurationInstance();
            if (c0146dc != null) {
                this.f125f = c0146dc.f1358a;
            }
            if (this.f125f == null) {
                this.f125f = new wa0();
            }
        }
        return this.f125f;
    }

    @Override // androidx.core.app.ComponentActivity, p000.InterfaceC0716sq
    /* JADX INFO: renamed from: e */
    public final C0036a mo105e() {
        return this.f123d;
    }

    /* JADX INFO: renamed from: h */
    public final void m106h(InterfaceC0277gx interfaceC0277gx) {
        C0518nd c0518nd = this.f121b;
        c0518nd.getClass();
        if (c0518nd.f3276b != null) {
            interfaceC0277gx.mo46a();
        }
        c0518nd.f3275a.add(interfaceC0277gx);
    }

    /* JADX INFO: renamed from: i */
    public final C0029a m107i() {
        if (this.f126g == null) {
            this.f126g = new C0029a(new RunnableC0325i7(2, this));
            this.f123d.m259a(new InterfaceC0642qq() { // from class: androidx.activity.ComponentActivity.6
                @Override // p000.InterfaceC0642qq
                /* JADX INFO: renamed from: b */
                public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
                    if (enumC0494mq != EnumC0494mq.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    C0029a c0029a = ComponentActivity.this.f126g;
                    OnBackInvokedDispatcher onBackInvokedDispatcherM612a = AbstractC0099cc.m612a((ComponentActivity) interfaceC0716sq);
                    c0029a.getClass();
                    AbstractC0493mp.m1857g("invoker", onBackInvokedDispatcherM612a);
                    c0029a.f150e = onBackInvokedDispatcherM612a;
                    c0029a.m112c(c0029a.f152g);
                }
            });
        }
        return this.f126g;
    }

    /* JADX INFO: renamed from: j */
    public final void m108j() {
        View decorView = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f129j.m512a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        m107i().m111b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f130k.iterator();
        while (it.hasNext()) {
            ((C0022al) it.next()).m54a(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f124e.m1504b(bundle);
        C0518nd c0518nd = this.f121b;
        c0518nd.getClass();
        c0518nd.f3276b = this;
        Iterator it = c0518nd.f3275a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0277gx) it.next()).mo46a();
        }
        super.onCreate(bundle);
        int i = w00.f5023b;
        u00.m2424b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f122c.f1298c).iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f122c.f1298c).iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.f135p) {
            return;
        }
        Iterator it = this.f133n.iterator();
        while (it.hasNext()) {
            ((C0022al) it.next()).m54a(new C0426kw(0));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f132m.iterator();
        while (it.hasNext()) {
            ((C0022al) it.next()).m54a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f122c.f1298c).iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.f136q) {
            return;
        }
        Iterator it = this.f134o.iterator();
        while (it.hasNext()) {
            ((C0022al) it.next()).m54a(new C0426kw(1));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f122c.f1298c).iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f129j.m512a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0146dc c0146dc;
        wa0 wa0Var = this.f125f;
        if (wa0Var == null && (c0146dc = (C0146dc) getLastNonConfigurationInstance()) != null) {
            wa0Var = c0146dc.f1358a;
        }
        if (wa0Var == null) {
            return null;
        }
        C0146dc c0146dc2 = new C0146dc();
        c0146dc2.f1358a = wa0Var;
        return c0146dc2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0036a c0036a = this.f123d;
        if (c0036a != null) {
            c0036a.m265g();
        }
        super.onSaveInstanceState(bundle);
        this.f124e.m1505c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f131l.iterator();
        while (it.hasNext()) {
            ((C0022al) it.next()).m54a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0387ju.m1628q()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0339im c0339im = this.f128i;
            synchronized (c0339im.f2554b) {
                try {
                    c0339im.f2553a = true;
                    ArrayList arrayList = (ArrayList) c0339im.f2555c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((InterfaceC0379jm) obj).mo474a();
                    }
                    ((ArrayList) c0339im.f2555c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m108j();
        this.f127h.m985a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m108j();
        this.f127h.m985a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f135p = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f135p = false;
            Iterator it = this.f133n.iterator();
            while (it.hasNext()) {
                ((C0022al) it.next()).m54a(new C0426kw(0));
            }
        } catch (Throwable th) {
            this.f135p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f136q = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f136q = false;
            Iterator it = this.f134o.iterator();
            while (it.hasNext()) {
                ((C0022al) it.next()).m54a(new C0426kw(1));
            }
        } catch (Throwable th) {
            this.f136q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m108j();
        this.f127h.m985a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}

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
import p000.AbstractC0126ct;
import p000.AbstractC0346ip;
import p000.AbstractC0739tb;
import p000.AbstractC0742te;
import p000.C0004a3;
import p000.C0138d4;
import p000.C0147dd;
import p000.C0165dw;
import p000.C0266gm;
import p000.C0702sb;
import p000.C0705se;
import p000.C0776ub;
import p000.C0819vh;
import p000.C0933yk;
import p000.EnumC0347iq;
import p000.EnumC0383jq;
import p000.ExecutorC0813vb;
import p000.InterfaceC0303hm;
import p000.InterfaceC0455lo;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;
import p000.InterfaceC0945yw;
import p000.RunnableC0581p1;
import p000.RunnableC0919y6;
import p000.k10;
import p000.k80;
import p000.n00;
import p000.o10;
import p000.p00;
import p000.p10;
import p000.ra0;
import p000.sa0;
import p000.t10;
import p000.u10;
import p000.z30;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements sa0, InterfaceC0455lo, u10 {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f157r = 0;

    /* JADX INFO: renamed from: b */
    public final C0147dd f158b = new C0147dd();

    /* JADX INFO: renamed from: c */
    public final C0138d4 f159c = new C0138d4(new RunnableC0581p1(3, this));

    /* JADX INFO: renamed from: d */
    public final C0036a f160d;

    /* JADX INFO: renamed from: e */
    public final C0266gm f161e;

    /* JADX INFO: renamed from: f */
    public ra0 f162f;

    /* JADX INFO: renamed from: g */
    public C0029a f163g;

    /* JADX INFO: renamed from: h */
    public final ExecutorC0813vb f164h;

    /* JADX INFO: renamed from: i */
    public final C0266gm f165i;

    /* JADX INFO: renamed from: j */
    public final C0702sb f166j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f167k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f168l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f169m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f170n;

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList f171o;

    /* JADX INFO: renamed from: p */
    public boolean f172p;

    /* JADX INFO: renamed from: q */
    public boolean f173q;

    public ComponentActivity() {
        C0036a c0036a = new C0036a(this);
        this.f160d = c0036a;
        C0266gm c0266gm = new C0266gm(this);
        this.f161e = c0266gm;
        t10 t10Var = null;
        this.f163g = null;
        ExecutorC0813vb executorC0813vb = new ExecutorC0813vb(this);
        this.f164h = executorC0813vb;
        this.f165i = new C0266gm(executorC0813vb, new k80(this, 2));
        new AtomicInteger();
        this.f166j = new C0702sb();
        this.f167k = new CopyOnWriteArrayList();
        this.f168l = new CopyOnWriteArrayList();
        this.f169m = new CopyOnWriteArrayList();
        this.f170n = new CopyOnWriteArrayList();
        this.f171o = new CopyOnWriteArrayList();
        this.f172p = false;
        this.f173q = false;
        c0036a.m274a(new InterfaceC0494mq() { // from class: androidx.activity.ComponentActivity.2
            @Override // p000.InterfaceC0494mq
            /* JADX INFO: renamed from: b */
            public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
                if (enumC0347iq == EnumC0347iq.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0036a.m274a(new InterfaceC0494mq() { // from class: androidx.activity.ComponentActivity.3
            @Override // p000.InterfaceC0494mq
            /* JADX INFO: renamed from: b */
            public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
                if (enumC0347iq == EnumC0347iq.ON_DESTROY) {
                    ComponentActivity.this.f158b.f1423b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo119d().m2285a();
                    }
                    ExecutorC0813vb executorC0813vb2 = ComponentActivity.this.f164h;
                    ComponentActivity componentActivity = executorC0813vb2.f4827d;
                    componentActivity.getWindow().getDecorView().removeCallbacks(executorC0813vb2);
                    componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0813vb2);
                }
            }
        });
        c0036a.m274a(new InterfaceC0494mq() { // from class: androidx.activity.ComponentActivity.4
            @Override // p000.InterfaceC0494mq
            /* JADX INFO: renamed from: b */
            public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f162f == null) {
                    C0776ub c0776ub = (C0776ub) componentActivity.getLastNonConfigurationInstance();
                    if (c0776ub != null) {
                        componentActivity.f162f = c0776ub.f4708a;
                    }
                    if (componentActivity.f162f == null) {
                        componentActivity.f162f = new ra0();
                    }
                }
                componentActivity.f160d.m279f(this);
            }
        });
        c0266gm.m1278a();
        EnumC0383jq enumC0383jq = c0036a.f518c;
        if (enumC0383jq != EnumC0383jq.f2657b && enumC0383jq != EnumC0383jq.f2658c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0004a3 c0004a3 = (C0004a3) c0266gm.f2143c;
        c0004a3.getClass();
        Iterator it = ((o10) c0004a3.f21f).iterator();
        while (true) {
            k10 k10Var = (k10) it;
            if (!k10Var.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) k10Var.next();
            AbstractC0346ip.m1502n("components", entry);
            String str = (String) entry.getKey();
            t10 t10Var2 = (t10) entry.getValue();
            if (AbstractC0346ip.m1497i(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                t10Var = t10Var2;
                break;
            }
        }
        if (t10Var == null) {
            p10 p10Var = new p10((C0004a3) this.f161e.f2143c, this);
            ((C0004a3) this.f161e.f2143c).m9e("androidx.lifecycle.internal.SavedStateHandlesProvider", p10Var);
            this.f160d.m274a(new SavedStateHandleAttacher(p10Var));
        }
        ((C0004a3) this.f161e.f2143c).m9e("android:support:activity-result", new t10() { // from class: qb
            @Override // p000.t10
            /* JADX INFO: renamed from: a */
            public final Bundle mo2031a() {
                int i = ComponentActivity.f157r;
                Bundle bundle = new Bundle();
                C0702sb c0702sb = this.f4051a.f166j;
                c0702sb.getClass();
                HashMap map = c0702sb.f4409b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0702sb.f4411d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0702sb.f4414g.clone());
                return bundle;
            }
        });
        m121h(new InterfaceC0945yw() { // from class: rb
            @Override // p000.InterfaceC0945yw
            /* JADX INFO: renamed from: a */
            public final void mo2286a() {
                ComponentActivity componentActivity = this.f4258a;
                Bundle bundleM7c = ((C0004a3) componentActivity.f161e.f2143c).m7c("android:support:activity-result");
                if (bundleM7c != null) {
                    C0702sb c0702sb = componentActivity.f166j;
                    HashMap map = c0702sb.f4409b;
                    HashMap map2 = c0702sb.f4408a;
                    Bundle bundle = c0702sb.f4414g;
                    ArrayList<Integer> integerArrayList = bundleM7c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM7c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c0702sb.f4411d = bundleM7c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    bundle.putAll(bundleM7c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
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
                        c0702sb.f4409b.put(str3, num2);
                    }
                }
            }
        });
    }

    @Override // p000.InterfaceC0455lo
    /* JADX INFO: renamed from: a */
    public final AbstractC0742te mo117a() {
        C0705se c0705se = C0705se.f4429b;
        AbstractC0346ip.m1503o("initialExtras", c0705se);
        C0165dw c0165dw = new C0165dw();
        c0165dw.f4565a.putAll(c0705se.f4565a);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0165dw.f4565a;
        if (application != null) {
            linkedHashMap.put(C0819vh.f4856o, getApplication());
        }
        linkedHashMap.put(AbstractC0346ip.f2488q, this);
        linkedHashMap.put(AbstractC0346ip.f2489r, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0346ip.f2490s, getIntent().getExtras());
        }
        return c0165dw;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m123j();
        this.f164h.m2502a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p000.u10
    /* JADX INFO: renamed from: b */
    public final C0004a3 mo118b() {
        return (C0004a3) this.f161e.f2143c;
    }

    @Override // p000.sa0
    /* JADX INFO: renamed from: d */
    public final ra0 mo119d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f162f == null) {
            C0776ub c0776ub = (C0776ub) getLastNonConfigurationInstance();
            if (c0776ub != null) {
                this.f162f = c0776ub.f4708a;
            }
            if (this.f162f == null) {
                this.f162f = new ra0();
            }
        }
        return this.f162f;
    }

    @Override // androidx.core.app.ComponentActivity, p000.InterfaceC0568oq
    /* JADX INFO: renamed from: e */
    public final C0036a mo120e() {
        return this.f160d;
    }

    /* JADX INFO: renamed from: h */
    public final void m121h(InterfaceC0945yw interfaceC0945yw) {
        C0147dd c0147dd = this.f158b;
        c0147dd.getClass();
        if (c0147dd.f1423b != null) {
            interfaceC0945yw.mo2286a();
        }
        c0147dd.f1422a.add(interfaceC0945yw);
    }

    /* JADX INFO: renamed from: i */
    public final C0029a m122i() {
        if (this.f163g == null) {
            this.f163g = new C0029a(new RunnableC0919y6(2, this));
            this.f160d.m274a(new InterfaceC0494mq() { // from class: androidx.activity.ComponentActivity.6
                @Override // p000.InterfaceC0494mq
                /* JADX INFO: renamed from: b */
                public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
                    if (enumC0347iq != EnumC0347iq.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    C0029a c0029a = ComponentActivity.this.f163g;
                    OnBackInvokedDispatcher onBackInvokedDispatcherM2375a = AbstractC0739tb.m2375a((ComponentActivity) interfaceC0568oq);
                    c0029a.getClass();
                    AbstractC0346ip.m1503o("invoker", onBackInvokedDispatcherM2375a);
                    c0029a.f187e = onBackInvokedDispatcherM2375a;
                    c0029a.m127c(c0029a.f189g);
                }
            });
        }
        return this.f163g;
    }

    /* JADX INFO: renamed from: j */
    public final void m123j() {
        View decorView = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f166j.m2328a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        m122i().m126b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f167k.iterator();
        while (it.hasNext()) {
            ((C0933yk) it.next()).m2688a(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f161e.m1279b(bundle);
        C0147dd c0147dd = this.f158b;
        c0147dd.getClass();
        c0147dd.f1423b = this;
        Iterator it = c0147dd.f1422a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0945yw) it.next()).mo2286a();
        }
        super.onCreate(bundle);
        int i = p00.f3627b;
        n00.m1881b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f159c.f1364c).iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
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
        Iterator it = ((CopyOnWriteArrayList) this.f159c.f1364c).iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.f172p) {
            return;
        }
        Iterator it = this.f170n.iterator();
        while (it.hasNext()) {
            ((C0933yk) it.next()).m2688a(new C0819vh(28));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f169m.iterator();
        while (it.hasNext()) {
            ((C0933yk) it.next()).m2688a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f159c.f1364c).iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.f173q) {
            return;
        }
        Iterator it = this.f171o.iterator();
        while (it.hasNext()) {
            ((C0933yk) it.next()).m2688a(new C0819vh(29));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f159c.f1364c).iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f166j.m2328a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0776ub c0776ub;
        ra0 ra0Var = this.f162f;
        if (ra0Var == null && (c0776ub = (C0776ub) getLastNonConfigurationInstance()) != null) {
            ra0Var = c0776ub.f4708a;
        }
        if (ra0Var == null) {
            return null;
        }
        C0776ub c0776ub2 = new C0776ub();
        c0776ub2.f4708a = ra0Var;
        return c0776ub2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0036a c0036a = this.f160d;
        if (c0036a != null) {
            c0036a.m280g();
        }
        super.onSaveInstanceState(bundle);
        this.f161e.m1280c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f168l.iterator();
        while (it.hasNext()) {
            ((C0933yk) it.next()).m2688a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0126ct.m820r()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0266gm c0266gm = this.f165i;
            synchronized (c0266gm.f2142b) {
                try {
                    c0266gm.f2141a = true;
                    ArrayList arrayList = (ArrayList) c0266gm.f2143c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((InterfaceC0303hm) obj).mo10a();
                    }
                    ((ArrayList) c0266gm.f2143c).clear();
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
        m123j();
        this.f164h.m2502a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m123j();
        this.f164h.m2502a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f172p = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f172p = false;
            Iterator it = this.f170n.iterator();
            while (it.hasNext()) {
                ((C0933yk) it.next()).m2688a(new C0819vh(28));
            }
        } catch (Throwable th) {
            this.f172p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f173q = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f173q = false;
            Iterator it = this.f171o.iterator();
            while (it.hasNext()) {
                ((C0933yk) it.next()).m2688a(new C0819vh(29));
            }
        } catch (Throwable th) {
            this.f173q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m123j();
        this.f164h.m2502a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}

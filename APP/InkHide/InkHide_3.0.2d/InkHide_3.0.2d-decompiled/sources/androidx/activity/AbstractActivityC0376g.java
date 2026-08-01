package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0451C;
import androidx.lifecycle.AbstractC0455G;
import androidx.lifecycle.C0456H;
import androidx.lifecycle.C0458J;
import androidx.lifecycle.C0461M;
import androidx.lifecycle.C0464P;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.EnumC0479n;
import androidx.lifecycle.FragmentC0453E;
import androidx.lifecycle.InterfaceC0465Q;
import androidx.lifecycle.InterfaceC0474i;
import androidx.lifecycle.InterfaceC0482q;
import androidx.lifecycle.InterfaceC0484s;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p006D.AbstractC0079h;
import p006D.RunnableC0073b;
import p012G.C0140d;
import p014H.C0142a;
import p018J.AbstractC0157b;
import p018J.C0156a;
import p018J.C0158c;
import p024M.C0190d;
import p024M.C0191e;
import p024M.InterfaceC0192f;
import p027N0.AbstractC0223g;
import p048a.C0365a;
import p048a.InterfaceC0366b;
import p052b1.AbstractC0503h;
import p061e.AbstractActivityC0533i;
import p097x.InterfaceC1033a;
import p099y.InterfaceC1078j;

/* JADX INFO: renamed from: androidx.activity.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0376g extends Activity implements InterfaceC0465Q, InterfaceC0474i, InterfaceC0192f, InterfaceC0484s, InterfaceC1078j {

    /* JADX INFO: renamed from: b */
    public final C0486u f891b = new C0486u(this);

    /* JADX INFO: renamed from: c */
    public final C0365a f892c = new C0365a();

    /* JADX INFO: renamed from: d */
    public final C0142a f893d;

    /* JADX INFO: renamed from: e */
    public final C0486u f894e;

    /* JADX INFO: renamed from: f */
    public final C0191e f895f;

    /* JADX INFO: renamed from: g */
    public C0464P f896g;

    /* JADX INFO: renamed from: h */
    public C0458J f897h;

    /* JADX INFO: renamed from: i */
    public final C0378i f898i;

    /* JADX INFO: renamed from: j */
    public final C0374e f899j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f900k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f901l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f902m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f903n;

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList f904o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractActivityC0376g() {
        final AbstractActivityC0533i abstractActivityC0533i = (AbstractActivityC0533i) this;
        this.f893d = new C0142a(new RunnableC0371b(0, abstractActivityC0533i));
        C0486u c0486u = new C0486u(this);
        this.f894e = c0486u;
        C0191e c0191e = new C0191e(this);
        this.f895f = c0191e;
        this.f898i = new C0378i(new RunnableC0073b(1, abstractActivityC0533i));
        new AtomicInteger();
        this.f899j = new C0374e();
        this.f900k = new CopyOnWriteArrayList();
        this.f901l = new CopyOnWriteArrayList();
        this.f902m = new CopyOnWriteArrayList();
        this.f903n = new CopyOnWriteArrayList();
        this.f904o = new CopyOnWriteArrayList();
        c0486u.m927a(new InterfaceC0482q() { // from class: androidx.activity.ComponentActivity$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0482q
            /* JADX INFO: renamed from: c */
            public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
                if (enumC0478m == EnumC0478m.ON_STOP) {
                    Window window = abstractActivityC0533i.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0486u.m927a(new InterfaceC0482q() { // from class: androidx.activity.ComponentActivity$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0482q
            /* JADX INFO: renamed from: c */
            public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
                if (enumC0478m == EnumC0478m.ON_DESTROY) {
                    abstractActivityC0533i.f892c.f859b = null;
                    if (abstractActivityC0533i.isChangingConfigurations()) {
                        return;
                    }
                    abstractActivityC0533i.getViewModelStore().m919a();
                }
            }
        });
        c0486u.m927a(new InterfaceC0482q() { // from class: androidx.activity.ComponentActivity$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0482q
            /* JADX INFO: renamed from: c */
            public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
                AbstractActivityC0533i abstractActivityC0533i2 = abstractActivityC0533i;
                if (abstractActivityC0533i2.f896g == null) {
                    C0375f c0375f = (C0375f) abstractActivityC0533i2.getLastNonConfigurationInstance();
                    if (c0375f != null) {
                        abstractActivityC0533i2.f896g = c0375f.f890a;
                    }
                    if (abstractActivityC0533i2.f896g == null) {
                        abstractActivityC0533i2.f896g = new C0464P();
                    }
                }
                abstractActivityC0533i2.f894e.m932f(this);
            }
        });
        c0191e.m402c();
        EnumC0479n enumC0479n = c0486u.f1528c;
        if (enumC0479n != EnumC0479n.f1518b && enumC0479n != EnumC0479n.f1519c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0190d c0190d = (C0190d) c0191e.f547d;
        if (c0190d.m396d() == null) {
            C0456H c0456h = new C0456H(c0190d, this);
            c0190d.m398f("androidx.lifecycle.internal.SavedStateHandlesProvider", c0456h);
            c0486u.m927a(new SavedStateHandleAttacher(c0456h));
        }
        c0190d.m398f("android:support:activity-result", new C0372c(0, abstractActivityC0533i));
        m638f(new InterfaceC0366b() { // from class: androidx.activity.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p048a.InterfaceC0366b
            /* JADX INFO: renamed from: a */
            public final void mo629a() {
                AbstractActivityC0533i abstractActivityC0533i2 = abstractActivityC0533i;
                Bundle bundleM395c = ((C0190d) abstractActivityC0533i2.f895f.f547d).m395c("android:support:activity-result");
                if (bundleM395c != null) {
                    C0374e c0374e = abstractActivityC0533i2.f899j;
                    c0374e.getClass();
                    ArrayList<Integer> integerArrayList = bundleM395c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM395c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c0374e.f886e = bundleM395c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    c0374e.f882a = (Random) bundleM395c.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    Bundle bundle = bundleM395c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0374e.f889h;
                    bundle2.putAll(bundle);
                    for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                        String str = stringArrayList.get(i2);
                        HashMap map = c0374e.f884c;
                        boolean zContainsKey = map.containsKey(str);
                        HashMap map2 = c0374e.f883b;
                        if (zContainsKey) {
                            Integer num = (Integer) map.remove(str);
                            if (!bundle2.containsKey(str)) {
                                map2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i2);
                        num2.intValue();
                        String str2 = stringArrayList.get(i2);
                        map2.put(num2, str2);
                        map.put(str2, num2);
                    }
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0474i
    /* JADX INFO: renamed from: a */
    public final AbstractC0157b mo635a() {
        C0158c c0158c = new C0158c(C0156a.f469b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0158c.f470a;
        if (application != null) {
            linkedHashMap.put(C0461M.f1496b, getApplication());
        }
        linkedHashMap.put(AbstractC0455G.f1476a, this);
        linkedHashMap.put(AbstractC0455G.f1477b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0455G.f1478c, getIntent().getExtras());
        }
        return c0158c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p024M.InterfaceC0192f
    /* JADX INFO: renamed from: b */
    public final C0190d mo405b() {
        return (C0190d) this.f895f.f547d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0484s
    /* JADX INFO: renamed from: c */
    public final C0486u mo636c() {
        return this.f894e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1078j
    /* JADX INFO: renamed from: d */
    public final boolean mo637d(KeyEvent keyEvent) {
        AbstractC0223g.m418e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0223g.m418e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0223g.m417d(decorView, "window.decorView");
        if (AbstractC0503h.m985q(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0503h.m986r(this, decorView, this, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC0223g.m418e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0223g.m417d(decorView, "window.decorView");
        if (AbstractC0503h.m985q(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m638f(InterfaceC0366b interfaceC0366b) {
        C0365a c0365a = this.f892c;
        if (c0365a.f859b != null) {
            interfaceC0366b.mo629a();
        }
        c0365a.f858a.add(interfaceC0366b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m639g(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = FragmentC0453E.f1468c;
        AbstractC0451C.m906b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0465Q
    public final C0464P getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f896g == null) {
            C0375f c0375f = (C0375f) getLastNonConfigurationInstance();
            if (c0375f != null) {
                this.f896g = c0375f.f890a;
            }
            if (this.f896g == null) {
                this.f896g = new C0464P();
            }
        }
        return this.f896g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m640h(Bundle bundle) {
        AbstractC0223g.m418e(bundle, "outState");
        this.f891b.m933g();
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f899j.m632a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onBackPressed() {
        this.f898i.m642b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f900k.iterator();
        while (it.hasNext()) {
            ((InterfaceC1033a) it.next()).mo1575a(configuration);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f895f.m403d(bundle);
        C0365a c0365a = this.f892c;
        c0365a.f859b = this;
        Iterator it = c0365a.f858a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0366b) it.next()).mo629a();
        }
        m639g(bundle);
        int i2 = FragmentC0453E.f1468c;
        AbstractC0451C.m906b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f893d.f444c).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f893d.f444c).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        for (InterfaceC1033a interfaceC1033a : this.f903n) {
            AbstractC0223g.m418e(configuration, "newConfig");
            interfaceC1033a.mo1575a(new C0140d(26));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f902m.iterator();
        while (it.hasNext()) {
            ((InterfaceC1033a) it.next()).mo1575a(intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f893d.f444c).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i2, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        for (InterfaceC1033a interfaceC1033a : this.f904o) {
            AbstractC0223g.m418e(configuration, "newConfig");
            interfaceC1033a.mo1575a(new C0140d(27));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f893d.f444c).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.f899j.m632a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0375f c0375f;
        C0464P c0464p = this.f896g;
        if (c0464p == null && (c0375f = (C0375f) getLastNonConfigurationInstance()) != null) {
            c0464p = c0375f.f890a;
        }
        if (c0464p == null) {
            return null;
        }
        C0375f c0375f2 = new C0375f();
        c0375f2.f890a = c0464p;
        return c0375f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0486u c0486u = this.f894e;
        if (c0486u != null) {
            c0486u.m933g();
        }
        m640h(bundle);
        this.f895f.m404e(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.f901l.iterator();
        while (it.hasNext()) {
            ((InterfaceC1033a) it.next()).mo1575a(Integer.valueOf(i2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0079h.m164A()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        View decorView = getWindow().getDecorView();
        AbstractC0223g.m418e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0223g.m418e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0223g.m418e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0223g.m418e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        super.setContentView(view);
    }
}

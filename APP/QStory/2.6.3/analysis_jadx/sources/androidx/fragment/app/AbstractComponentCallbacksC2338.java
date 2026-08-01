package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.lifecycle.AbstractC2375;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.C2374;
import androidx.lifecycle.C2386;
import androidx.lifecycle.C2423;
import androidx.lifecycle.C2424;
import androidx.lifecycle.C2428;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2405;
import androidx.lifecycle.InterfaceC2421;
import androidx.lifecycle.InterfaceC2427;
import androidx.lifecycle.Lifecycle$State;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import lin.xposed.hook.javaplugin.C5554;
import p116.C7342;
import p130.C7502;
import p142.C7538;
import p142.C7539;
import p142.InterfaceC7537;
import p160.AbstractC7636;
import p160.C7635;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2338 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC2388, InterfaceC2421, InterfaceC2405, InterfaceC7537 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final Object f6876 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f6877;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f6879;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public View f6881;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public ViewGroup f6882;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public boolean f6883;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f6884;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f6885;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f6886;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f6887;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public String f6888;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f6889;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f6890;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f6891;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f6892;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f6893;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 f6895;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C2319 f6897;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC2313 f6898;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f6899;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f6900;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Bundle f6902;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f6904;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Bundle f6905;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 f6906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Bundle f6907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public SparseArray f6908;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final C2344 f6910;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final ArrayList f6911;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C7538 f6912;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public C2428 f6913;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C2374 f6914;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C2355 f6915;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f6916;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C2334 f6917;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public Lifecycle$State f6918;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C2386 f6919;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f6920;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public String f6921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f6909 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f6901 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public String f6903 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Boolean f6894 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C2309 f6896 = new C2309();

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean f6880 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f6878 = true;

    public AbstractComponentCallbacksC2338() {
        new RunnableC2350(this, 1);
        this.f6918 = Lifecycle$State.RESUMED;
        this.f6914 = new C2374();
        new AtomicInteger();
        this.f6911 = new ArrayList();
        this.f6910 = new C2344(this);
        m4462();
    }

    private void registerOnPreAttachListener(AbstractC2333 abstractC2333) {
        if (this.f6909 < 0) {
            this.f6911.add(abstractC2333);
            return;
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = ((C2344) abstractC2333).f6942;
        abstractComponentCallbacksC2338.f6912.m12759();
        AbstractC2435.m4530(abstractComponentCallbacksC2338);
        Bundle bundle = abstractComponentCallbacksC2338.f6907;
        abstractComponentCallbacksC2338.f6912.m12758(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public final AbstractC7636 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = m4435().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m4435().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C7635 c7635 = new C7635(0);
        LinkedHashMap linkedHashMap = c7635.f20724;
        if (application != null) {
            linkedHashMap.put(C2424.f7068, application);
        }
        linkedHashMap.put(AbstractC2435.f7100, this);
        linkedHashMap.put(AbstractC2435.f7099, this);
        Bundle bundle = this.f6905;
        if (bundle != null) {
            linkedHashMap.put(AbstractC2435.f7098, bundle);
        }
        return c7635;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public final InterfaceC2427 getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.f6898 == null) {
            C5925.m11311("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.f6913 == null) {
            Context applicationContext = m4435().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && AbstractC2313.m4362(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + m4435().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f6913 = new C2428(application, this, this.f6905);
        }
        return this.f6913;
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f6919;
    }

    @Override // p142.InterfaceC7537
    public final C7539 getSavedStateRegistry() {
        return this.f6912.f20418;
    }

    @Override // androidx.lifecycle.InterfaceC2421
    public final C2423 getViewModelStore() {
        if (this.f6898 == null) {
            C5925.m11311("Can't access ViewModels from detached fragment");
            return null;
        }
        if (m4440() == Lifecycle$State.INITIALIZED.ordinal()) {
            C5925.m11311("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.f6898.f6768.f6760;
        C2423 c2423 = (C2423) map.get(this.f6901);
        if (c2423 != null) {
            return c2423;
        }
        C2423 c24232 = new C2423();
        map.put(this.f6901, c24232);
        return c24232;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6879 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m4436().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f6879 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f6901);
        if (this.f6886 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f6886));
        }
        if (this.f6888 != null) {
            sb.append(" tag=");
            sb.append(this.f6888);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m4433(int i, int i2, int i3, int i4) {
        if (this.f6917 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m4444().f6865 = i;
        m4444().f6864 = i2;
        m4444().f6863 = i3;
        m4444().f6862 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final View m4434() {
        View view = this.f6881;
        if (view != null) {
            return view;
        }
        C5554.m10883(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView().");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Context m4435() {
        Context contextM4441 = m4441();
        if (contextM4441 != null) {
            return contextM4441;
        }
        C5554.m10883(this, "Fragment ", " not attached to a context.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final FragmentActivity m4436() {
        FragmentActivity fragmentActivityM4443 = m4443();
        if (fragmentActivityM4443 != null) {
            return fragmentActivityM4443;
        }
        C5554.m10883(this, "Fragment ", " not attached to an activity.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo4437(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f6896.m4372();
        this.f6900 = true;
        this.f6915 = new C2355(this, getViewModelStore(), new RunnableC1107(this, 1));
        View viewMo4455 = mo4455(layoutInflater, viewGroup, bundle);
        this.f6881 = viewMo4455;
        C2355 c2355 = this.f6915;
        if (viewMo4455 == null) {
            if (c2355.f6963 == null) {
                this.f6915 = null;
                return;
            } else {
                C5925.m11311("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        c2355.m4476();
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f6881 + " for Fragment " + this);
        }
        View view = this.f6881;
        C2355 c23552 = this.f6915;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, c23552);
        View view2 = this.f6881;
        C2355 c23553 = this.f6915;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, c23553);
        View view3 = this.f6881;
        C2355 c23554 = this.f6915;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c23554);
        C2374 c2374 = this.f6914;
        C2355 c23555 = this.f6915;
        c2374.getClass();
        AbstractC2375.m4492("setValue");
        c2374.f7006++;
        c2374.f7000 = c23555;
        c2374.m4494(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void mo4438(Bundle bundle) {
        this.f6879 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m4439(Bundle bundle) {
        AbstractC2313 abstractC2313 = this.f6898;
        if (abstractC2313 == null || !(abstractC2313.f6779 || abstractC2313.f6778)) {
            this.f6905 = bundle;
        } else {
            C5925.m11311("Fragment already added and state has been saved");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m4440() {
        Lifecycle$State lifecycle$State = this.f6918;
        return (lifecycle$State == Lifecycle$State.INITIALIZED || this.f6895 == null) ? lifecycle$State.ordinal() : Math.min(lifecycle$State.ordinal(), this.f6895.m4440());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Context m4441() {
        C2319 c2319 = this.f6897;
        if (c2319 == null) {
            return null;
        }
        return c2319.f6816;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2313 m4442() {
        if (this.f6897 != null) {
            return this.f6896;
        }
        C5554.m10883(this, "Fragment ", " has not been attached yet.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final FragmentActivity m4443() {
        C2319 c2319 = this.f6897;
        if (c2319 == null) {
            return null;
        }
        return c2319.f6817;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2334 m4444() {
        if (this.f6917 == null) {
            C2334 c2334 = new C2334();
            Object obj = f6876;
            c2334.f6868 = obj;
            c2334.f6867 = obj;
            c2334.f6870 = obj;
            c2334.f6871 = 1.0f;
            c2334.f6869 = null;
            this.f6917 = c2334;
        }
        return this.f6917;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC8175 mo4445() {
        return new C2341(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void mo4446() {
        this.f6879 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void mo4447() {
        this.f6879 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void mo4448() {
        this.f6879 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo4449() {
        this.f6879 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public LayoutInflater mo4450(Bundle bundle) {
        C2319 c2319 = this.f6897;
        if (c2319 == null) {
            C5925.m11311("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        FragmentActivity fragmentActivity = c2319.f6818;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        layoutInflaterCloneInContext.setFactory2(this.f6896.f6781);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo4452() {
        this.f6879 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m4453() {
        return this.f6899 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo4454(Bundle bundle) {
        Bundle bundle2;
        this.f6879 = true;
        Bundle bundle3 = this.f6907;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f6896.m4368(bundle2);
            C2309 c2309 = this.f6896;
            c2309.f6779 = false;
            c2309.f6778 = false;
            c2309.f6768.f6763 = false;
            c2309.m4390(1);
        }
        C2309 c23092 = this.f6896;
        if (c23092.f6787 >= 1) {
            return;
        }
        c23092.f6779 = false;
        c23092.f6778 = false;
        c23092.f6768.f6763 = false;
        c23092.m4390(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View mo4455(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m4456(int i, int i2, Intent intent) {
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo4457(Context context) {
        this.f6879 = true;
        C2319 c2319 = this.f6897;
        if ((c2319 == null ? null : c2319.f6817) != null) {
            this.f6879 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String m4458(int i) {
        return m4435().getResources().getString(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC2313 m4459() {
        AbstractC2313 abstractC2313 = this.f6898;
        if (abstractC2313 != null) {
            return abstractC2313;
        }
        C5554.m10883(this, "Fragment ", " not associated with a fragment manager.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m4460() {
        return this.f6897 != null && this.f6893;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m4461() {
        if (this.f6887) {
            return true;
        }
        AbstractC2313 abstractC2313 = this.f6898;
        if (abstractC2313 != null) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6895;
            abstractC2313.getClass();
            if (abstractComponentCallbacksC2338 == null ? false : abstractComponentCallbacksC2338.m4461()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4462() {
        this.f6919 = new C2386(this, true);
        this.f6912 = new C7538(new C7502(this, new C7342(this, 4)));
        this.f6913 = null;
        ArrayList arrayList = this.f6911;
        C2344 c2344 = this.f6910;
        if (arrayList.contains(c2344)) {
            return;
        }
        registerOnPreAttachListener(c2344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4463() {
        m4462();
        this.f6921 = this.f6901;
        this.f6901 = UUID.randomUUID().toString();
        this.f6893 = false;
        this.f6892 = false;
        this.f6891 = false;
        this.f6890 = false;
        this.f6889 = false;
        this.f6899 = 0;
        this.f6898 = null;
        this.f6896 = new C2309();
        this.f6897 = null;
        this.f6886 = 0;
        this.f6885 = 0;
        this.f6888 = null;
        this.f6887 = false;
        this.f6883 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void mo4451(Bundle bundle) {
    }
}

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
import lin.xposed.hook.javaplugin.C5553;
import p116.C7341;
import p130.C7501;
import p142.C7537;
import p142.C7538;
import p142.InterfaceC7536;
import p160.AbstractC7635;
import p160.C7634;
import p392.AbstractC9124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2338 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC2388, InterfaceC2421, InterfaceC2405, InterfaceC7536 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final Object f6875 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f6876;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f6878;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public View f6880;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public ViewGroup f6881;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public boolean f6882;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f6883;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f6884;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f6885;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f6886;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public String f6887;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f6888;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f6889;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f6890;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f6891;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f6892;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 f6894;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C2319 f6896;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC2313 f6897;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f6898;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f6899;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Bundle f6901;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f6903;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Bundle f6904;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 f6905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Bundle f6906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public SparseArray f6907;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final C2344 f6909;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final ArrayList f6910;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C7537 f6911;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public C2428 f6912;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C2374 f6913;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C2355 f6914;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f6915;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C2334 f6916;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public Lifecycle$State f6917;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C2386 f6918;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f6919;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public String f6920;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f6908 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f6900 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public String f6902 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Boolean f6893 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C2309 f6895 = new C2309();

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean f6879 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f6877 = true;

    public AbstractComponentCallbacksC2338() {
        new RunnableC2350(this, 1);
        this.f6917 = Lifecycle$State.RESUMED;
        this.f6913 = new C2374();
        new AtomicInteger();
        this.f6910 = new ArrayList();
        this.f6909 = new C2344(this);
        m4452();
    }

    private void registerOnPreAttachListener(AbstractC2333 abstractC2333) {
        if (this.f6908 < 0) {
            this.f6910.add(abstractC2333);
            return;
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = ((C2344) abstractC2333).f6941;
        abstractComponentCallbacksC2338.f6911.m12730();
        AbstractC2435.m4520(abstractComponentCallbacksC2338);
        Bundle bundle = abstractComponentCallbacksC2338.f6906;
        abstractComponentCallbacksC2338.f6911.m12729(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public final AbstractC7635 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = m4425().getApplicationContext();
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
        if (application == null && AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m4425().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C7634 c7634 = new C7634(0);
        LinkedHashMap linkedHashMap = c7634.f20729;
        if (application != null) {
            linkedHashMap.put(C2424.f7067, application);
        }
        linkedHashMap.put(AbstractC2435.f7099, this);
        linkedHashMap.put(AbstractC2435.f7098, this);
        Bundle bundle = this.f6904;
        if (bundle != null) {
            linkedHashMap.put(AbstractC2435.f7097, bundle);
        }
        return c7634;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public final InterfaceC2427 getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.f6897 == null) {
            C5919.m11250("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.f6912 == null) {
            Context applicationContext = m4425().getApplicationContext();
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
            if (application == null && AbstractC2313.m4352(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + m4425().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f6912 = new C2428(application, this, this.f6904);
        }
        return this.f6912;
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f6918;
    }

    @Override // p142.InterfaceC7536
    public final C7538 getSavedStateRegistry() {
        return this.f6911.f20423;
    }

    @Override // androidx.lifecycle.InterfaceC2421
    public final C2423 getViewModelStore() {
        if (this.f6897 == null) {
            C5919.m11250("Can't access ViewModels from detached fragment");
            return null;
        }
        if (m4430() == Lifecycle$State.INITIALIZED.ordinal()) {
            C5919.m11250("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.f6897.f6767.f6759;
        C2423 c2423 = (C2423) map.get(this.f6900);
        if (c2423 != null) {
            return c2423;
        }
        C2423 c24232 = new C2423();
        map.put(this.f6900, c24232);
        return c24232;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6878 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m4426().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f6878 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f6900);
        if (this.f6885 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f6885));
        }
        if (this.f6887 != null) {
            sb.append(" tag=");
            sb.append(this.f6887);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m4423(int i, int i2, int i3, int i4) {
        if (this.f6916 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m4434().f6864 = i;
        m4434().f6863 = i2;
        m4434().f6862 = i3;
        m4434().f6861 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final View m4424() {
        View view = this.f6880;
        if (view != null) {
            return view;
        }
        C5553.m10826(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView().");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Context m4425() {
        Context contextM4431 = m4431();
        if (contextM4431 != null) {
            return contextM4431;
        }
        C5553.m10826(this, "Fragment ", " not attached to a context.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final FragmentActivity m4426() {
        FragmentActivity fragmentActivityM4433 = m4433();
        if (fragmentActivityM4433 != null) {
            return fragmentActivityM4433;
        }
        C5553.m10826(this, "Fragment ", " not attached to an activity.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo4427(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f6895.m4362();
        this.f6899 = true;
        this.f6914 = new C2355(this, getViewModelStore(), new RunnableC1107(this, 1));
        View viewMo4445 = mo4445(layoutInflater, viewGroup, bundle);
        this.f6880 = viewMo4445;
        C2355 c2355 = this.f6914;
        if (viewMo4445 == null) {
            if (c2355.f6962 == null) {
                this.f6914 = null;
                return;
            } else {
                C5919.m11250("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        c2355.m4466();
        if (AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f6880 + " for Fragment " + this);
        }
        View view = this.f6880;
        C2355 c23552 = this.f6914;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, c23552);
        View view2 = this.f6880;
        C2355 c23553 = this.f6914;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, c23553);
        View view3 = this.f6880;
        C2355 c23554 = this.f6914;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c23554);
        C2374 c2374 = this.f6913;
        C2355 c23555 = this.f6914;
        c2374.getClass();
        AbstractC2375.m4482("setValue");
        c2374.f7005++;
        c2374.f6999 = c23555;
        c2374.m4484(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void mo4428(Bundle bundle) {
        this.f6878 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m4429(Bundle bundle) {
        AbstractC2313 abstractC2313 = this.f6897;
        if (abstractC2313 == null || !(abstractC2313.f6778 || abstractC2313.f6777)) {
            this.f6904 = bundle;
        } else {
            C5919.m11250("Fragment already added and state has been saved");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m4430() {
        Lifecycle$State lifecycle$State = this.f6917;
        return (lifecycle$State == Lifecycle$State.INITIALIZED || this.f6894 == null) ? lifecycle$State.ordinal() : Math.min(lifecycle$State.ordinal(), this.f6894.m4430());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Context m4431() {
        C2319 c2319 = this.f6896;
        if (c2319 == null) {
            return null;
        }
        return c2319.f6819;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2313 m4432() {
        if (this.f6896 != null) {
            return this.f6895;
        }
        C5553.m10826(this, "Fragment ", " has not been attached yet.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final FragmentActivity m4433() {
        C2319 c2319 = this.f6896;
        if (c2319 == null) {
            return null;
        }
        return c2319.f6818;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2334 m4434() {
        if (this.f6916 == null) {
            C2334 c2334 = new C2334();
            Object obj = f6875;
            c2334.f6867 = obj;
            c2334.f6866 = obj;
            c2334.f6869 = obj;
            c2334.f6870 = 1.0f;
            c2334.f6868 = null;
            this.f6916 = c2334;
        }
        return this.f6916;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC9124 mo4435() {
        return new C2341(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void mo4436() {
        this.f6878 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void mo4437() {
        this.f6878 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void mo4438() {
        this.f6878 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo4439() {
        this.f6878 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public LayoutInflater mo4440(Bundle bundle) {
        C2319 c2319 = this.f6896;
        if (c2319 == null) {
            C5919.m11250("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        FragmentActivity fragmentActivity = c2319.f6817;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        layoutInflaterCloneInContext.setFactory2(this.f6895.f6780);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo4442() {
        this.f6878 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m4443() {
        return this.f6898 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo4444(Bundle bundle) {
        Bundle bundle2;
        this.f6878 = true;
        Bundle bundle3 = this.f6906;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f6895.m4358(bundle2);
            C2309 c2309 = this.f6895;
            c2309.f6778 = false;
            c2309.f6777 = false;
            c2309.f6767.f6762 = false;
            c2309.m4380(1);
        }
        C2309 c23092 = this.f6895;
        if (c23092.f6786 >= 1) {
            return;
        }
        c23092.f6778 = false;
        c23092.f6777 = false;
        c23092.f6767.f6762 = false;
        c23092.m4380(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View mo4445(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m4446(int i, int i2, Intent intent) {
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo4447(Context context) {
        this.f6878 = true;
        C2319 c2319 = this.f6896;
        if ((c2319 == null ? null : c2319.f6818) != null) {
            this.f6878 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String m4448(int i) {
        return m4425().getResources().getString(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC2313 m4449() {
        AbstractC2313 abstractC2313 = this.f6897;
        if (abstractC2313 != null) {
            return abstractC2313;
        }
        C5553.m10826(this, "Fragment ", " not associated with a fragment manager.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m4450() {
        return this.f6896 != null && this.f6892;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m4451() {
        if (this.f6886) {
            return true;
        }
        AbstractC2313 abstractC2313 = this.f6897;
        if (abstractC2313 != null) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6894;
            abstractC2313.getClass();
            if (abstractComponentCallbacksC2338 == null ? false : abstractComponentCallbacksC2338.m4451()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4452() {
        this.f6918 = new C2386(this, true);
        this.f6911 = new C7537(new C7501(this, new C7341(this, 4)));
        this.f6912 = null;
        ArrayList arrayList = this.f6910;
        C2344 c2344 = this.f6909;
        if (arrayList.contains(c2344)) {
            return;
        }
        registerOnPreAttachListener(c2344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4453() {
        m4452();
        this.f6920 = this.f6900;
        this.f6900 = UUID.randomUUID().toString();
        this.f6892 = false;
        this.f6891 = false;
        this.f6890 = false;
        this.f6889 = false;
        this.f6888 = false;
        this.f6898 = 0;
        this.f6897 = null;
        this.f6895 = new C2309();
        this.f6896 = null;
        this.f6885 = 0;
        this.f6884 = 0;
        this.f6887 = null;
        this.f6886 = false;
        this.f6882 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void mo4441(Bundle bundle) {
    }
}

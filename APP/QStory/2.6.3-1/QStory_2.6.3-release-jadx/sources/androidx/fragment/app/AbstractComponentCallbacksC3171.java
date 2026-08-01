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
import androidx.compose.material.ripple.RunnableC1945;
import androidx.lifecycle.AbstractC3208;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.C3207;
import androidx.lifecycle.C3219;
import androidx.lifecycle.C3256;
import androidx.lifecycle.C3257;
import androidx.lifecycle.C3261;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3238;
import androidx.lifecycle.InterfaceC3254;
import androidx.lifecycle.InterfaceC3260;
import androidx.lifecycle.Lifecycle$State;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import lin.xposed.hook.javaplugin.C6385;
import p132.C8171;
import p146.C8331;
import p158.C8367;
import p158.C8368;
import p158.InterfaceC8366;
import p176.AbstractC8465;
import p176.C8464;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC3171 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC3221, InterfaceC3254, InterfaceC3238, InterfaceC8366 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final Object f7221 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f7222;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f7224;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public View f7226;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public ViewGroup f7227;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public boolean f7228;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f7229;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f7230;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f7231;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f7232;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public String f7233;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f7234;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f7235;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f7236;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f7237;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f7238;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractComponentCallbacksC3171 f7240;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C3152 f7242;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC3146 f7243;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f7244;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f7245;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Bundle f7247;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f7249;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Bundle f7250;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractComponentCallbacksC3171 f7251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Bundle f7252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public SparseArray f7253;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final C3177 f7255;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final ArrayList f7256;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C8367 f7257;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public C3261 f7258;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C3207 f7259;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C3188 f7260;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f7261;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C3167 f7262;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public Lifecycle$State f7263;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C3219 f7264;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f7265;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public String f7266;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7254 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f7246 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public String f7248 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Boolean f7239 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C3142 f7241 = new C3142();

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean f7225 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f7223 = true;

    public AbstractComponentCallbacksC3171() {
        new RunnableC3183(this, 1);
        this.f7263 = Lifecycle$State.RESUMED;
        this.f7259 = new C3207();
        new AtomicInteger();
        this.f7256 = new ArrayList();
        this.f7255 = new C3177(this);
        m5022();
    }

    private void registerOnPreAttachListener(AbstractC3166 abstractC3166) {
        if (this.f7254 < 0) {
            this.f7256.add(abstractC3166);
            return;
        }
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((C3177) abstractC3166).f7287;
        abstractComponentCallbacksC3171.f7257.m13318();
        AbstractC3268.m5090(abstractComponentCallbacksC3171);
        Bundle bundle = abstractComponentCallbacksC3171.f7252;
        abstractComponentCallbacksC3171.f7257.m13317(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // androidx.lifecycle.InterfaceC3238
    public final AbstractC8465 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = m4995().getApplicationContext();
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
        if (application == null && AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m4995().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C8464 c8464 = new C8464(0);
        LinkedHashMap linkedHashMap = c8464.f21069;
        if (application != null) {
            linkedHashMap.put(C3257.f7413, application);
        }
        linkedHashMap.put(AbstractC3268.f7445, this);
        linkedHashMap.put(AbstractC3268.f7444, this);
        Bundle bundle = this.f7250;
        if (bundle != null) {
            linkedHashMap.put(AbstractC3268.f7443, bundle);
        }
        return c8464;
    }

    @Override // androidx.lifecycle.InterfaceC3238
    public final InterfaceC3260 getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.f7243 == null) {
            C6755.m11870("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.f7258 == null) {
            Context applicationContext = m4995().getApplicationContext();
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
            if (application == null && AbstractC3146.m4922(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + m4995().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f7258 = new C3261(application, this, this.f7250);
        }
        return this.f7258;
    }

    @Override // androidx.lifecycle.InterfaceC3221
    public final AbstractC3235 getLifecycle() {
        return this.f7264;
    }

    @Override // p158.InterfaceC8366
    public final C8368 getSavedStateRegistry() {
        return this.f7257.f20763;
    }

    @Override // androidx.lifecycle.InterfaceC3254
    public final C3256 getViewModelStore() {
        if (this.f7243 == null) {
            C6755.m11870("Can't access ViewModels from detached fragment");
            return null;
        }
        if (m5000() == Lifecycle$State.INITIALIZED.ordinal()) {
            C6755.m11870("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.f7243.f7113.f7105;
        C3256 c3256 = (C3256) map.get(this.f7246);
        if (c3256 != null) {
            return c3256;
        }
        C3256 c32562 = new C3256();
        map.put(this.f7246, c32562);
        return c32562;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f7224 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m4996().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f7224 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f7246);
        if (this.f7231 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f7231));
        }
        if (this.f7233 != null) {
            sb.append(" tag=");
            sb.append(this.f7233);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m4993(int i, int i2, int i3, int i4) {
        if (this.f7262 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m5004().f7210 = i;
        m5004().f7209 = i2;
        m5004().f7208 = i3;
        m5004().f7207 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final View m4994() {
        View view = this.f7226;
        if (view != null) {
            return view;
        }
        C6385.m11442(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView().");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Context m4995() {
        Context contextM5001 = m5001();
        if (contextM5001 != null) {
            return contextM5001;
        }
        C6385.m11442(this, "Fragment ", " not attached to a context.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final FragmentActivity m4996() {
        FragmentActivity fragmentActivityM5003 = m5003();
        if (fragmentActivityM5003 != null) {
            return fragmentActivityM5003;
        }
        C6385.m11442(this, "Fragment ", " not attached to an activity.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo4997(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7241.m4932();
        this.f7245 = true;
        this.f7260 = new C3188(this, getViewModelStore(), new RunnableC1945(this, 1));
        View viewMo5015 = mo5015(layoutInflater, viewGroup, bundle);
        this.f7226 = viewMo5015;
        C3188 c3188 = this.f7260;
        if (viewMo5015 == null) {
            if (c3188.f7308 == null) {
                this.f7260 = null;
                return;
            } else {
                C6755.m11870("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        c3188.m5036();
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f7226 + " for Fragment " + this);
        }
        View view = this.f7226;
        C3188 c31882 = this.f7260;
        view.getClass();
        view.setTag(C0328R.id.view_tree_lifecycle_owner, c31882);
        View view2 = this.f7226;
        C3188 c31883 = this.f7260;
        view2.getClass();
        view2.setTag(C0328R.id.view_tree_view_model_store_owner, c31883);
        View view3 = this.f7226;
        C3188 c31884 = this.f7260;
        view3.getClass();
        view3.setTag(C0328R.id.view_tree_saved_state_registry_owner, c31884);
        C3207 c3207 = this.f7259;
        C3188 c31885 = this.f7260;
        c3207.getClass();
        AbstractC3208.m5052("setValue");
        c3207.f7351++;
        c3207.f7345 = c31885;
        c3207.m5054(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void mo4998(Bundle bundle) {
        this.f7224 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m4999(Bundle bundle) {
        AbstractC3146 abstractC3146 = this.f7243;
        if (abstractC3146 == null || !(abstractC3146.f7124 || abstractC3146.f7123)) {
            this.f7250 = bundle;
        } else {
            C6755.m11870("Fragment already added and state has been saved");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m5000() {
        Lifecycle$State lifecycle$State = this.f7263;
        return (lifecycle$State == Lifecycle$State.INITIALIZED || this.f7240 == null) ? lifecycle$State.ordinal() : Math.min(lifecycle$State.ordinal(), this.f7240.m5000());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Context m5001() {
        C3152 c3152 = this.f7242;
        if (c3152 == null) {
            return null;
        }
        return c3152.f7161;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3146 m5002() {
        if (this.f7242 != null) {
            return this.f7241;
        }
        C6385.m11442(this, "Fragment ", " has not been attached yet.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final FragmentActivity m5003() {
        C3152 c3152 = this.f7242;
        if (c3152 == null) {
            return null;
        }
        return c3152.f7162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3167 m5004() {
        if (this.f7262 == null) {
            C3167 c3167 = new C3167();
            Object obj = f7221;
            c3167.f7213 = obj;
            c3167.f7212 = obj;
            c3167.f7215 = obj;
            c3167.f7216 = 1.0f;
            c3167.f7214 = null;
            this.f7262 = c3167;
        }
        return this.f7262;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC9004 mo5005() {
        return new C3174(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void mo5006() {
        this.f7224 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void mo5007() {
        this.f7224 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void mo5008() {
        this.f7224 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo5009() {
        this.f7224 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public LayoutInflater mo5010(Bundle bundle) {
        C3152 c3152 = this.f7242;
        if (c3152 == null) {
            C6755.m11870("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        FragmentActivity fragmentActivity = c3152.f7163;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        layoutInflaterCloneInContext.setFactory2(this.f7241.f7126);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo5012() {
        this.f7224 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m5013() {
        return this.f7244 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo5014(Bundle bundle) {
        Bundle bundle2;
        this.f7224 = true;
        Bundle bundle3 = this.f7252;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f7241.m4928(bundle2);
            C3142 c3142 = this.f7241;
            c3142.f7124 = false;
            c3142.f7123 = false;
            c3142.f7113.f7108 = false;
            c3142.m4950(1);
        }
        C3142 c31422 = this.f7241;
        if (c31422.f7132 >= 1) {
            return;
        }
        c31422.f7124 = false;
        c31422.f7123 = false;
        c31422.f7113.f7108 = false;
        c31422.m4950(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View mo5015(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m5016(int i, int i2, Intent intent) {
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo5017(Context context) {
        this.f7224 = true;
        C3152 c3152 = this.f7242;
        if ((c3152 == null ? null : c3152.f7162) != null) {
            this.f7224 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String m5018(int i) {
        return m4995().getResources().getString(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC3146 m5019() {
        AbstractC3146 abstractC3146 = this.f7243;
        if (abstractC3146 != null) {
            return abstractC3146;
        }
        C6385.m11442(this, "Fragment ", " not associated with a fragment manager.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m5020() {
        return this.f7242 != null && this.f7238;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m5021() {
        if (this.f7232) {
            return true;
        }
        AbstractC3146 abstractC3146 = this.f7243;
        if (abstractC3146 != null) {
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7240;
            abstractC3146.getClass();
            if (abstractComponentCallbacksC3171 == null ? false : abstractComponentCallbacksC3171.m5021()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5022() {
        this.f7264 = new C3219(this, true);
        this.f7257 = new C8367(new C8331(this, new C8171(this, 4)));
        this.f7258 = null;
        ArrayList arrayList = this.f7256;
        C3177 c3177 = this.f7255;
        if (arrayList.contains(c3177)) {
            return;
        }
        registerOnPreAttachListener(c3177);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m5023() {
        m5022();
        this.f7266 = this.f7246;
        this.f7246 = UUID.randomUUID().toString();
        this.f7238 = false;
        this.f7237 = false;
        this.f7236 = false;
        this.f7235 = false;
        this.f7234 = false;
        this.f7244 = 0;
        this.f7243 = null;
        this.f7241 = new C3142();
        this.f7242 = null;
        this.f7231 = 0;
        this.f7230 = 0;
        this.f7233 = null;
        this.f7232 = false;
        this.f7228 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void mo5011(Bundle bundle) {
    }
}

package androidx.fragment.app;

import Yue.C5085;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.util.Log;
import android.view.ViewModel;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8880 extends ViewModel {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f29724 = "FragmentManager";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final ViewModelProvider.Factory f29725 = new C1700();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean f29727;

    /* JADX INFO: renamed from: ۥ */
    public final HashMap<String, Fragment> f3834 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public final HashMap<String, C8880> f3835 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final HashMap<String, ViewModelStore> f29726 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f29728 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f29729 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f29730 = false;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۥ$ۥ */
    public class C1700 implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @InterfaceC6391
        public <T extends ViewModel> T create(@InterfaceC6391 Class<T> cls) {
            return new C8880(true);
        }
    }

    public C8880(boolean z) {
        this.f29727 = z;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C8880 m29979(ViewModelStore viewModelStore) {
        return (C8880) new ViewModelProvider(viewModelStore, f29725).get(C8880.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8880.class != obj.getClass()) {
            return false;
        }
        C8880 c8880 = (C8880) obj;
        return this.f3834.equals(c8880.f3834) && this.f3835.equals(c8880.f3835) && this.f29726.equals(c8880.f29726);
    }

    public int hashCode() {
        return (((this.f3834.hashCode() * 31) + this.f3835.hashCode()) * 31) + this.f29726.hashCode();
    }

    @Override // android.view.ViewModel
    public void onCleared() {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f29728 = true;
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3834.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3835.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f29726.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4846(@InterfaceC6391 Fragment fragment) {
        if (this.f29730) {
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3834.containsKey(fragment.mWho)) {
                return;
            }
            this.f3834.put(fragment.mWho, fragment);
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4847(@InterfaceC6391 Fragment fragment) {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m29981(fragment.mWho);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29980(@InterfaceC6391 String str) {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m29981(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m29981(@InterfaceC6391 String str) {
        C8880 c8880 = this.f3835.get(str);
        if (c8880 != null) {
            c8880.onCleared();
            this.f3835.remove(str);
        }
        ViewModelStore viewModelStore = this.f29726.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.f29726.remove(str);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Fragment m29982(String str) {
        return this.f3834.get(str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C8880 m29983(@InterfaceC6391 Fragment fragment) {
        C8880 c8880 = this.f3835.get(fragment.mWho);
        if (c8880 != null) {
            return c8880;
        }
        C8880 c88802 = new C8880(this.f29727);
        this.f3835.put(fragment.mWho, c88802);
        return c88802;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Collection<Fragment> m29984() {
        return new ArrayList(this.f3834.values());
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C5085 m29985() {
        if (this.f3834.isEmpty() && this.f3835.isEmpty() && this.f29726.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, C8880> entry : this.f3835.entrySet()) {
            C5085 c5085M29985 = entry.getValue().m29985();
            if (c5085M29985 != null) {
                map.put(entry.getKey(), c5085M29985);
            }
        }
        this.f29729 = true;
        if (this.f3834.isEmpty() && map.isEmpty() && this.f29726.isEmpty()) {
            return null;
        }
        return new C5085(new ArrayList(this.f3834.values()), map, new HashMap(this.f29726));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public ViewModelStore m29986(@InterfaceC6391 Fragment fragment) {
        ViewModelStore viewModelStore = this.f29726.get(fragment.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.f29726.put(fragment.mWho, viewModelStore2);
        return viewModelStore2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m29987() {
        return this.f29728;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m29988(@InterfaceC6391 Fragment fragment) {
        if (this.f29730) {
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3834.remove(fragment.mWho) == null || !FragmentManager.m29739(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29989(@InterfaceC6490 C5085 c5085) {
        this.f3834.clear();
        this.f3835.clear();
        this.f29726.clear();
        if (c5085 != null) {
            Collection<Fragment> collectionM1898 = c5085.m1898();
            if (collectionM1898 != null) {
                for (Fragment fragment : collectionM1898) {
                    if (fragment != null) {
                        this.f3834.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, C5085> mapM1897 = c5085.m1897();
            if (mapM1897 != null) {
                for (Map.Entry<String, C5085> entry : mapM1897.entrySet()) {
                    C8880 c8880 = new C8880(this.f29727);
                    c8880.m29989(entry.getValue());
                    this.f3835.put(entry.getKey(), c8880);
                }
            }
            Map<String, ViewModelStore> mapM15684 = c5085.m15684();
            if (mapM15684 != null) {
                this.f29726.putAll(mapM15684);
            }
        }
        this.f29729 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m29990(boolean z) {
        this.f29730 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m29991(@InterfaceC6391 Fragment fragment) {
        if (this.f3834.containsKey(fragment.mWho)) {
            return this.f29727 ? this.f29728 : !this.f29729;
        }
        return true;
    }
}

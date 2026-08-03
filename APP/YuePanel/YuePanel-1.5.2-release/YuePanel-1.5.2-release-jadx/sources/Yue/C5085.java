package Yue;

import android.view.ViewModelStore;
import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C5085 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public final Collection<Fragment> f1260;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6490
    public final Map<String, C5085> f1261;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public final Map<String, ViewModelStore> f12038;

    public C5085(@InterfaceC6490 Collection<Fragment> collection, @InterfaceC6490 Map<String, C5085> map, @InterfaceC6490 Map<String, ViewModelStore> map2) {
        this.f1260 = collection;
        this.f1261 = map;
        this.f12038 = map2;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public Map<String, C5085> m1897() {
        return this.f1261;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public Collection<Fragment> m1898() {
        return this.f1260;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Map<String, ViewModelStore> m15684() {
        return this.f12038;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m15685(Fragment fragment) {
        Collection<Fragment> collection = this.f1260;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}

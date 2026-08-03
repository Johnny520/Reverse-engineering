package androidx.fragment.app;

import Yue.AbstractC6594;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Lifecycle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC8883 extends AbstractC6594 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f29758 = "FragmentStatePagerAdapt";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean f29759 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @Deprecated
    public static final int f29760 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f29761 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final FragmentManager f29762;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f29763;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC8885 f29764;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public ArrayList<Fragment.C8845> f29765;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public ArrayList<Fragment> f29766;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Fragment f29767;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f29768;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public AbstractC8883(@InterfaceC6391 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1900(@InterfaceC6391 ViewGroup viewGroup, int i, @InterfaceC6391 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f29764 == null) {
            this.f29764 = this.f29762.m29749();
        }
        while (this.f29765.size() <= i) {
            this.f29765.add(null);
        }
        this.f29765.set(i, fragment.isAdded() ? this.f29762.m29871(fragment) : null);
        this.f29766.set(i, null);
        this.f29764.mo29912(fragment);
        if (fragment.equals(this.f29767)) {
            this.f29767 = null;
        }
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo15687(@InterfaceC6391 ViewGroup viewGroup) {
        AbstractC8885 abstractC8885 = this.f29764;
        if (abstractC8885 != null) {
            if (!this.f29768) {
                try {
                    this.f29768 = true;
                    abstractC8885.mo29907();
                } finally {
                    this.f29768 = false;
                }
            }
            this.f29764 = null;
        }
    }

    @Override // Yue.AbstractC6594
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public Object mo15688(@InterfaceC6391 ViewGroup viewGroup, int i) {
        Fragment.C8845 c8845;
        Fragment fragment;
        if (this.f29766.size() > i && (fragment = this.f29766.get(i)) != null) {
            return fragment;
        }
        if (this.f29764 == null) {
            this.f29764 = this.f29762.m29749();
        }
        Fragment fragmentM30012 = m30012(i);
        if (this.f29765.size() > i && (c8845 = this.f29765.get(i)) != null) {
            fragmentM30012.setInitialSavedState(c8845);
        }
        while (this.f29766.size() <= i) {
            this.f29766.add(null);
        }
        fragmentM30012.setMenuVisibility(false);
        if (this.f29763 == 0) {
            fragmentM30012.setUserVisibleHint(false);
        }
        this.f29766.set(i, fragmentM30012);
        this.f29764.m30040(viewGroup.getId(), fragmentM30012);
        if (this.f29763 == 1) {
            this.f29764.mo29913(fragmentM30012, Lifecycle.State.STARTED);
        }
        return fragmentM30012;
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public boolean mo15689(@InterfaceC6391 View view, @InterfaceC6391 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo15690(@InterfaceC6490 Parcelable parcelable, @InterfaceC6490 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f29765.clear();
            this.f29766.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f29765.add((Fragment.C8845) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = Integer.parseInt(str.substring(1));
                    Fragment fragmentM29807 = this.f29762.m29807(bundle, str);
                    if (fragmentM29807 != null) {
                        while (this.f29766.size() <= i) {
                            this.f29766.add(null);
                        }
                        fragmentM29807.setMenuVisibility(false);
                        this.f29766.set(i, fragmentM29807);
                    } else {
                        Log.w(f29758, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // Yue.AbstractC6594
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Parcelable mo15691() {
        Bundle bundle;
        if (this.f29765.size() > 0) {
            bundle = new Bundle();
            Fragment.C8845[] c8845Arr = new Fragment.C8845[this.f29765.size()];
            this.f29765.toArray(c8845Arr);
            bundle.putParcelableArray("states", c8845Arr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f29766.size(); i++) {
            Fragment fragment = this.f29766.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f29762.m29853(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo15692(@InterfaceC6391 ViewGroup viewGroup, int i, @InterfaceC6391 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f29767;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f29763 == 1) {
                    if (this.f29764 == null) {
                        this.f29764 = this.f29762.m29749();
                    }
                    this.f29764.mo29913(this.f29767, Lifecycle.State.STARTED);
                } else {
                    this.f29767.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f29763 == 1) {
                if (this.f29764 == null) {
                    this.f29764 = this.f29762.m29749();
                }
                this.f29764.mo29913(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f29767 = fragment;
        }
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo15693(@InterfaceC6391 ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract Fragment m30012(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC8883(@InterfaceC6391 FragmentManager fragmentManager, int i) {
        this.f29764 = null;
        this.f29765 = new ArrayList<>();
        this.f29766 = new ArrayList<>();
        this.f29767 = null;
        this.f29762 = fragmentManager;
        this.f29763 = i;
    }
}

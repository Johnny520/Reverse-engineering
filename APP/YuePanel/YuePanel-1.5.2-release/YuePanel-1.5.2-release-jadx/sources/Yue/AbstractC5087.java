package Yue;

import android.os.Parcelable;
import android.view.Lifecycle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC8885;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC5087 extends AbstractC6594 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f12039 = "FragmentPagerAdapter";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean f12040 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @Deprecated
    public static final int f12041 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f12042 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final FragmentManager f12043;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f12044;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC8885 f12045;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Fragment f12046;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f12047;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public AbstractC5087(@InterfaceC6391 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static String m15686(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1900(@InterfaceC6391 ViewGroup viewGroup, int i, @InterfaceC6391 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f12045 == null) {
            this.f12045 = this.f12043.m29749();
        }
        this.f12045.mo29908(fragment);
        if (fragment.equals(this.f12046)) {
            this.f12046 = null;
        }
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo15687(@InterfaceC6391 ViewGroup viewGroup) {
        AbstractC8885 abstractC8885 = this.f12045;
        if (abstractC8885 != null) {
            if (!this.f12047) {
                try {
                    this.f12047 = true;
                    abstractC8885.mo29907();
                } finally {
                    this.f12047 = false;
                }
            }
            this.f12045 = null;
        }
    }

    @Override // Yue.AbstractC6594
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Object mo15688(@InterfaceC6391 ViewGroup viewGroup, int i) {
        if (this.f12045 == null) {
            this.f12045 = this.f12043.m29749();
        }
        long jM15695 = m15695(i);
        Fragment fragmentM29796 = this.f12043.m29796(m15686(viewGroup.getId(), jM15695));
        if (fragmentM29796 != null) {
            this.f12045.m30050(fragmentM29796);
        } else {
            fragmentM29796 = m15694(i);
            this.f12045.m30041(viewGroup.getId(), fragmentM29796, m15686(viewGroup.getId(), jM15695));
        }
        if (fragmentM29796 != this.f12046) {
            fragmentM29796.setMenuVisibility(false);
            if (this.f12044 == 1) {
                this.f12045.mo29913(fragmentM29796, Lifecycle.State.STARTED);
            } else {
                fragmentM29796.setUserVisibleHint(false);
            }
        }
        return fragmentM29796;
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean mo15689(@InterfaceC6391 View view, @InterfaceC6391 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo15690(@InterfaceC6490 Parcelable parcelable, @InterfaceC6490 ClassLoader classLoader) {
    }

    @Override // Yue.AbstractC6594
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Parcelable mo15691() {
        return null;
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo15692(@InterfaceC6391 ViewGroup viewGroup, int i, @InterfaceC6391 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f12046;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f12044 == 1) {
                    if (this.f12045 == null) {
                        this.f12045 = this.f12043.m29749();
                    }
                    this.f12045.mo29913(this.f12046, Lifecycle.State.STARTED);
                } else {
                    this.f12046.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f12044 == 1) {
                if (this.f12045 == null) {
                    this.f12045 = this.f12043.m29749();
                }
                this.f12045.mo29913(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f12046 = fragment;
        }
    }

    @Override // Yue.AbstractC6594
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo15693(@InterfaceC6391 ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract Fragment m15694(int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long m15695(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC5087(@InterfaceC6391 FragmentManager fragmentManager, int i) {
        this.f12045 = null;
        this.f12046 = null;
        this.f12043 = fragmentManager;
        this.f12044 = i;
    }
}

package androidx.fragment.app;

import Yue.C5864;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.util.Log;
import android.view.Lifecycle;
import androidx.fragment.app.AbstractC8885;
import androidx.fragment.app.FragmentManager;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ */
/* JADX INFO: loaded from: classes.dex */
public final class C1688 extends AbstractC8885 implements FragmentManager.InterfaceC8853, FragmentManager.InterfaceC8860 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final String f29668 = "FragmentManager";

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final FragmentManager f29669;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f29670;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f29671;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public boolean f29672;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1688(@InterfaceC6391 FragmentManager fragmentManager) {
        super(fragmentManager.m29809(), fragmentManager.m29812() != null ? fragmentManager.m29812().m15670().getClassLoader() : null);
        this.f29671 = -1;
        this.f29672 = false;
        this.f29669 = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC8853
    public int getId() {
        return this.f29671;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC8853
    @InterfaceC6490
    public String getName() {
        return this.f29800;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f29671 >= 0) {
            sb.append(" #");
            sb.append(this.f29671);
        }
        if (this.f29800 != null) {
            sb.append(" ");
            sb.append(this.f29800);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC8853
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public CharSequence mo4818() {
        return this.f29801 != 0 ? this.f29669.m29812().m15670().getText(this.f29801) : this.f29802;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC8860
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo4819(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f29798) {
            return true;
        }
        this.f29669.m29741(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC8853
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo29885() {
        return this.f29803;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC8853
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public int mo29886() {
        return this.f29801;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC8853
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public CharSequence mo29887() {
        return this.f29803 != 0 ? this.f29669.m29812().m15670().getText(this.f29803) : this.f29804;
    }

    @Override // androidx.fragment.app.AbstractC8885
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int mo29904() {
        return m29918(false);
    }

    @Override // androidx.fragment.app.AbstractC8885
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int mo29905() {
        return m29918(true);
    }

    @Override // androidx.fragment.app.AbstractC8885
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo29906() {
        m30052();
        this.f29669.m29790(this, false);
    }

    @Override // androidx.fragment.app.AbstractC8885
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo29907() {
        m30052();
        this.f29669.m29790(this, true);
    }

    @Override // androidx.fragment.app.AbstractC8885
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public AbstractC8885 mo29908(@InterfaceC6391 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f29669) {
            return super.mo29908(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC8885
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void mo29909(int i, Fragment fragment, @InterfaceC6490 String str, int i2) {
        super.mo29909(i, fragment, str, i2);
        fragment.mFragmentManager = this.f29669;
    }

    @Override // androidx.fragment.app.AbstractC8885
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public AbstractC8885 mo29910(@InterfaceC6391 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f29669) {
            return super.mo29910(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC8885
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean mo29911() {
        return this.f29792.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC8885
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public AbstractC8885 mo29912(@InterfaceC6391 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f29669) {
            return super.mo29912(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC8885
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public AbstractC8885 mo29913(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f29669) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f29669);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            return super.mo29913(fragment, state);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.AbstractC8885
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public AbstractC8885 mo29914(@InterfaceC6490 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f29669) {
            return super.mo29914(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC8885
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public AbstractC8885 mo29915(@InterfaceC6391 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f29669) {
            return super.mo29915(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m29916(int i) {
        if (this.f29798) {
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f29792.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC8885.C1704 c1704 = this.f29792.get(i2);
                Fragment fragment = c1704.f3844;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1704.f3844 + " to " + c1704.f3844.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m29917() {
        int size = this.f29792.size() - 1;
        while (size >= 0) {
            AbstractC8885.C1704 c1704 = this.f29792.get(size);
            if (c1704.f29809) {
                if (c1704.f3843 == 8) {
                    c1704.f29809 = false;
                    this.f29792.remove(size - 1);
                    size--;
                } else {
                    int i = c1704.f3844.mContainerId;
                    c1704.f3843 = 2;
                    c1704.f29809 = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        AbstractC8885.C1704 c17042 = this.f29792.get(i2);
                        if (c17042.f29809 && c17042.f3844.mContainerId == i) {
                            this.f29792.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m29918(boolean z) {
        if (this.f29670) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C5864("FragmentManager"));
            m29919("  ", printWriter);
            printWriter.close();
        }
        this.f29670 = true;
        if (this.f29798) {
            this.f29671 = this.f29669.m29746();
        } else {
            this.f29671 = -1;
        }
        this.f29669.m29787(this, z);
        return this.f29671;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29919(String str, PrintWriter printWriter) {
        m29920(str, printWriter, true);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29920(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f29800);
            printWriter.print(" mIndex=");
            printWriter.print(this.f29671);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f29670);
            if (this.f29797 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f29797));
            }
            if (this.f29793 != 0 || this.f29794 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f29793));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f29794));
            }
            if (this.f29795 != 0 || this.f29796 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f29795));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f29796));
            }
            if (this.f29801 != 0 || this.f29802 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f29801));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f29802);
            }
            if (this.f29803 != 0 || this.f29804 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f29803));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f29804);
            }
        }
        if (this.f29792.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f29792.size();
        for (int i = 0; i < size; i++) {
            AbstractC8885.C1704 c1704 = this.f29792.get(i);
            switch (c1704.f3843) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c1704.f3843;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1704.f3844);
            if (z) {
                if (c1704.f29810 != 0 || c1704.f29811 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1704.f29810));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1704.f29811));
                }
                if (c1704.f29812 != 0 || c1704.f29813 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1704.f29812));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1704.f29813));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m29921() {
        int size = this.f29792.size();
        for (int i = 0; i < size; i++) {
            AbstractC8885.C1704 c1704 = this.f29792.get(i);
            Fragment fragment = c1704.f3844;
            if (fragment != null) {
                fragment.mBeingSaved = this.f29672;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f29797);
                fragment.setSharedElementNames(this.f29805, this.f29806);
            }
            switch (c1704.f3843) {
                case 1:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29873(fragment, false);
                    this.f29669.m29742(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1704.f3843);
                case 3:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29855(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29821(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29873(fragment, false);
                    this.f29669.m29880(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29759(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29873(fragment, false);
                    this.f29669.m29748(fragment);
                    break;
                case 8:
                    this.f29669.m29876(fragment);
                    break;
                case 9:
                    this.f29669.m29876(null);
                    break;
                case 10:
                    this.f29669.m29875(fragment, c1704.f29815);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m29922() {
        for (int size = this.f29792.size() - 1; size >= 0; size--) {
            AbstractC8885.C1704 c1704 = this.f29792.get(size);
            Fragment fragment = c1704.f3844;
            if (fragment != null) {
                fragment.mBeingSaved = this.f29672;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m29740(this.f29797));
                fragment.setSharedElementNames(this.f29806, this.f29805);
            }
            switch (c1704.f3843) {
                case 1:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29873(fragment, true);
                    this.f29669.m29855(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1704.f3843);
                case 3:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29742(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29880(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29873(fragment, true);
                    this.f29669.m29821(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29748(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c1704.f29810, c1704.f29811, c1704.f29812, c1704.f29813);
                    this.f29669.m29873(fragment, true);
                    this.f29669.m29759(fragment);
                    break;
                case 8:
                    this.f29669.m29876(null);
                    break;
                case 9:
                    this.f29669.m29876(fragment);
                    break;
                case 10:
                    this.f29669.m29875(fragment, c1704.f29814);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fragment m29923(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f29792.size()) {
            AbstractC8885.C1704 c1704 = this.f29792.get(i);
            int i2 = c1704.f3843;
            if (i2 == 1) {
                arrayList.add(c1704.f3844);
            } else if (i2 == 2) {
                Fragment fragment3 = c1704.f3844;
                int i3 = fragment3.mContainerId;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i3) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f29792.add(i, new AbstractC8885.C1704(9, fragment4, true));
                                i++;
                                fragment2 = null;
                            }
                            AbstractC8885.C1704 c17042 = new AbstractC8885.C1704(3, fragment4, true);
                            c17042.f29810 = c1704.f29810;
                            c17042.f29812 = c1704.f29812;
                            c17042.f29811 = c1704.f29811;
                            c17042.f29813 = c1704.f29813;
                            this.f29792.add(i, c17042);
                            arrayList.remove(fragment4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.f29792.remove(i);
                    i--;
                } else {
                    c1704.f3843 = 1;
                    c1704.f29809 = true;
                    arrayList.add(fragment3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(c1704.f3844);
                Fragment fragment5 = c1704.f3844;
                if (fragment5 == fragment2) {
                    this.f29792.add(i, new AbstractC8885.C1704(9, fragment5));
                    i++;
                    fragment2 = null;
                }
            } else if (i2 != 7) {
                if (i2 == 8) {
                    this.f29792.add(i, new AbstractC8885.C1704(9, fragment2, true));
                    c1704.f29809 = true;
                    i++;
                    fragment2 = c1704.f3844;
                }
            }
            i++;
        }
        return fragment2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m29924() {
        if (this.f29808 != null) {
            for (int i = 0; i < this.f29808.size(); i++) {
                this.f29808.get(i).run();
            }
            this.f29808 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fragment m29925(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f29792.size() - 1; size >= 0; size--) {
            AbstractC8885.C1704 c1704 = this.f29792.get(size);
            int i = c1704.f3843;
            if (i == 1) {
                arrayList.remove(c1704.f3844);
            } else if (i != 3) {
                switch (i) {
                    case 6:
                        arrayList.add(c1704.f3844);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = c1704.f3844;
                        break;
                    case 10:
                        c1704.f29815 = c1704.f29814;
                        break;
                }
            }
        }
        return fragment;
    }

    public C1688(@InterfaceC6391 C1688 c1688) {
        super(c1688.f29669.m29809(), c1688.f29669.m29812() != null ? c1688.f29669.m29812().m15670().getClassLoader() : null, c1688);
        this.f29671 = -1;
        this.f29672 = false;
        this.f29669 = c1688.f29669;
        this.f29670 = c1688.f29670;
        this.f29671 = c1688.f29671;
        this.f29672 = c1688.f29672;
    }
}

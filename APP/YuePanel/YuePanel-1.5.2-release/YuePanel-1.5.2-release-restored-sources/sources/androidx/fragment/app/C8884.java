package androidx.fragment.app;

import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8884 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f29769 = "FragmentManager";

    /* JADX INFO: renamed from: ۥ */
    public final ArrayList<Fragment> f3839 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public final HashMap<String, C8882> f3840 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final HashMap<String, Bundle> f29770 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C8880 f29771;

    /* JADX INFO: renamed from: ۥ */
    public void m4853(@InterfaceC6391 Fragment fragment) {
        if (this.f3839.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3839) {
            this.f3839.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4854() {
        this.f3840.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m30013(@InterfaceC6391 String str) {
        return this.f3840.get(str) != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m30014(int i) {
        for (C8882 c8882 : this.f3840.values()) {
            if (c8882 != null) {
                c8882.m30009(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30015(@InterfaceC6391 String str, @InterfaceC6490 FileDescriptor fileDescriptor, @InterfaceC6391 PrintWriter printWriter, @InterfaceC6490 String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3840.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C8882 c8882 : this.f3840.values()) {
                printWriter.print(str);
                if (c8882 != null) {
                    Fragment fragmentM30000 = c8882.m30000();
                    printWriter.println(fragmentM30000);
                    fragmentM30000.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3839.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.f3839.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Fragment m30016(@InterfaceC6391 String str) {
        C8882 c8882 = this.f3840.get(str);
        if (c8882 != null) {
            return c8882.m30000();
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Fragment m30017(@InterfaceC5411 int i) {
        for (int size = this.f3839.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3839.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C8882 c8882 : this.f3840.values()) {
            if (c8882 != null) {
                Fragment fragmentM30000 = c8882.m30000();
                if (fragmentM30000.mFragmentId == i) {
                    return fragmentM30000;
                }
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Fragment m30018(@InterfaceC6490 String str) {
        if (str != null) {
            for (int size = this.f3839.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3839.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C8882 c8882 : this.f3840.values()) {
            if (c8882 != null) {
                Fragment fragmentM30000 = c8882.m30000();
                if (str.equals(fragmentM30000.mTag)) {
                    return fragmentM30000;
                }
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Fragment m30019(@InterfaceC6391 String str) {
        Fragment fragmentFindFragmentByWho;
        for (C8882 c8882 : this.f3840.values()) {
            if (c8882 != null && (fragmentFindFragmentByWho = c8882.m30000().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m30020(@InterfaceC6391 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f3839.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f3839.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f3839.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3839.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m30021() {
        return this.f3840.size();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public List<C8882> m30022() {
        ArrayList arrayList = new ArrayList();
        for (C8882 c8882 : this.f3840.values()) {
            if (c8882 != null) {
                arrayList.add(c8882);
            }
        }
        return arrayList;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public List<Fragment> m30023() {
        ArrayList arrayList = new ArrayList();
        for (C8882 c8882 : this.f3840.values()) {
            if (c8882 != null) {
                arrayList.add(c8882.m30000());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public HashMap<String, Bundle> m30024() {
        return this.f29770;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C8882 m30025(@InterfaceC6391 String str) {
        return this.f3840.get(str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public List<Fragment> m30026() {
        ArrayList arrayList;
        if (this.f3839.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3839) {
            arrayList = new ArrayList(this.f3839);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C8880 m30027() {
        return this.f29771;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Bundle m30028(@InterfaceC6391 String str) {
        return this.f29770.get(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m30029(@InterfaceC6391 C8882 c8882) {
        Fragment fragmentM30000 = c8882.m30000();
        if (m30013(fragmentM30000.mWho)) {
            return;
        }
        this.f3840.put(fragmentM30000.mWho, c8882);
        if (fragmentM30000.mRetainInstanceChangedWhileDetached) {
            if (fragmentM30000.mRetainInstance) {
                this.f29771.m4846(fragmentM30000);
            } else {
                this.f29771.m29988(fragmentM30000);
            }
            fragmentM30000.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentM30000);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m30030(@InterfaceC6391 C8882 c8882) {
        Fragment fragmentM30000 = c8882.m30000();
        if (fragmentM30000.mRetainInstance) {
            this.f29771.m29988(fragmentM30000);
        }
        if (this.f3840.get(fragmentM30000.mWho) == c8882 && this.f3840.put(fragmentM30000.mWho, null) != null && FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentM30000);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m30031() {
        Iterator<Fragment> it = this.f3839.iterator();
        while (it.hasNext()) {
            C8882 c8882 = this.f3840.get(it.next().mWho);
            if (c8882 != null) {
                c8882.m30002();
            }
        }
        for (C8882 c88822 : this.f3840.values()) {
            if (c88822 != null) {
                c88822.m30002();
                Fragment fragmentM30000 = c88822.m30000();
                if (fragmentM30000.mRemoving && !fragmentM30000.isInBackStack()) {
                    if (fragmentM30000.mBeingSaved && !this.f29770.containsKey(fragmentM30000.mWho)) {
                        m30039(fragmentM30000.mWho, c88822.m30007());
                    }
                    m30030(c88822);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m30032(@InterfaceC6391 Fragment fragment) {
        synchronized (this.f3839) {
            this.f3839.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m30033() {
        this.f3840.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m30034(@InterfaceC6490 List<String> list) {
        this.f3839.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentM30016 = m30016(str);
                if (fragmentM30016 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentM30016);
                }
                m4853(fragmentM30016);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m30035(@InterfaceC6391 HashMap<String, Bundle> map) {
        this.f29770.clear();
        this.f29770.putAll(map);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public ArrayList<String> m30036() {
        ArrayList<String> arrayList = new ArrayList<>(this.f3840.size());
        for (C8882 c8882 : this.f3840.values()) {
            if (c8882 != null) {
                Fragment fragmentM30000 = c8882.m30000();
                m30039(fragmentM30000.mWho, c8882.m30007());
                arrayList.add(fragmentM30000.mWho);
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentM30000 + ": " + fragmentM30000.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public ArrayList<String> m30037() {
        synchronized (this.f3839) {
            try {
                if (this.f3839.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f3839.size());
                for (Fragment fragment : this.f3839) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m30038(@InterfaceC6391 C8880 c8880) {
        this.f29771 = c8880;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Bundle m30039(@InterfaceC6391 String str, @InterfaceC6490 Bundle bundle) {
        return bundle != null ? this.f29770.put(str, bundle) : this.f29770.remove(str);
    }
}

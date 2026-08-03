package androidx.fragment.app;

import Yue.C5093;
import Yue.C5099;
import Yue.C8273;
import Yue.InterfaceC3218;
import Yue.InterfaceC3258;
import Yue.InterfaceC5411;
import Yue.InterfaceC5922;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import android.os.Bundle;
import android.view.Lifecycle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8885 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f29772 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f29773 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f29774 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f29775 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f29776 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f29777 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f29778 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f29779 = 7;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f29780 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f29781 = 9;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f29782 = 10;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f29783 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f29784 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f29785 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f29786 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f29787 = 4097;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f29788 = 8194;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f29789 = 4099;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f29790 = 4100;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f29791 = 8197;

    /* JADX INFO: renamed from: ۥ */
    public final C8876 f3841;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ClassLoader f3842;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ArrayList<C1704> f29792;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f29793;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f29794;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f29795;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f29796;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f29797;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f29798;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f29799;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6490
    public String f29800;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f29801;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public CharSequence f29802;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f29803;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public CharSequence f29804;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public ArrayList<String> f29805;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public ArrayList<String> f29806;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f29807;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public ArrayList<Runnable> f29808;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠۟$ۥ */
    public static final class C1704 {

        /* JADX INFO: renamed from: ۥ */
        public int f3843;

        /* JADX INFO: renamed from: ۥ۟ */
        public Fragment f3844;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29809;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29810;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29811;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29812;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f29813;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Lifecycle.State f29814;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Lifecycle.State f29815;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1704() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1704(int i, Fragment fragment) {
            this.f3843 = i;
            this.f3844 = fragment;
            this.f29809 = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f29814 = state;
            this.f29815 = state;
        }

        public C1704(int i, Fragment fragment, boolean z) {
            this.f3843 = i;
            this.f3844 = fragment;
            this.f29809 = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f29814 = state;
            this.f29815 = state;
        }

        public C1704(int i, @InterfaceC6391 Fragment fragment, Lifecycle.State state) {
            this.f3843 = i;
            this.f3844 = fragment;
            this.f29809 = false;
            this.f29814 = fragment.mMaxState;
            this.f29815 = state;
        }

        public C1704(C1704 c1704) {
            this.f3843 = c1704.f3843;
            this.f3844 = c1704.f3844;
            this.f29809 = c1704.f29809;
            this.f29810 = c1704.f29810;
            this.f29811 = c1704.f29811;
            this.f29812 = c1704.f29812;
            this.f29813 = c1704.f29813;
            this.f29814 = c1704.f29814;
            this.f29815 = c1704.f29815;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public AbstractC8885() {
        this.f29792 = new ArrayList<>();
        this.f29799 = true;
        this.f29807 = false;
        this.f3841 = null;
        this.f3842 = null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public AbstractC8885 m30040(@InterfaceC5411 int i, @InterfaceC6391 Fragment fragment) {
        mo29909(i, fragment, null, 1);
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC8885 m30041(@InterfaceC5411 int i, @InterfaceC6391 Fragment fragment, @InterfaceC6490 String str) {
        mo29909(i, fragment, str, 1);
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final AbstractC8885 m30042(@InterfaceC5411 int i, @InterfaceC6391 Class<? extends Fragment> cls, @InterfaceC6490 Bundle bundle) {
        return m30040(i, m30051(cls, bundle));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final AbstractC8885 m30043(@InterfaceC5411 int i, @InterfaceC6391 Class<? extends Fragment> cls, @InterfaceC6490 Bundle bundle, @InterfaceC6490 String str) {
        return m30041(i, m30051(cls, bundle), str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public AbstractC8885 m30044(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 Fragment fragment, @InterfaceC6490 String str) {
        fragment.mContainer = viewGroup;
        return m30041(viewGroup.getId(), fragment, str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public AbstractC8885 m30045(@InterfaceC6391 Fragment fragment, @InterfaceC6490 String str) {
        mo29909(0, fragment, str, 1);
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final AbstractC8885 m30046(@InterfaceC6391 Class<? extends Fragment> cls, @InterfaceC6490 Bundle bundle, @InterfaceC6490 String str) {
        return m30045(m30051(cls, bundle), str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m30047(C1704 c1704) {
        this.f29792.add(c1704);
        c1704.f29810 = this.f29793;
        c1704.f29811 = this.f29794;
        c1704.f29812 = this.f29795;
        c1704.f29813 = this.f29796;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public AbstractC8885 m30048(@InterfaceC6391 View view, @InterfaceC6391 String str) {
        if (C5099.m15738()) {
            String strM27380 = C8273.m27380(view);
            if (strM27380 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f29805 == null) {
                this.f29805 = new ArrayList<>();
                this.f29806 = new ArrayList<>();
            } else {
                if (this.f29806.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.f29805.contains(strM27380)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strM27380 + "' has already been added to the transaction.");
                }
            }
            this.f29805.add(strM27380);
            this.f29806.add(str);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public AbstractC8885 m30049(@InterfaceC6490 String str) {
        if (!this.f29799) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f29798 = true;
        this.f29800 = str;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public AbstractC8885 m30050(@InterfaceC6391 Fragment fragment) {
        m30047(new C1704(7, fragment));
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public abstract int mo29904();

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public abstract int mo29905();

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public abstract void mo29906();

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public abstract void mo29907();

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Fragment m30051(@InterfaceC6391 Class<? extends Fragment> cls, @InterfaceC6490 Bundle bundle) {
        C8876 c8876 = this.f3841;
        if (c8876 == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f3842;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentMo4815 = c8876.mo4815(classLoader, cls.getName());
        if (bundle != null) {
            fragmentMo4815.setArguments(bundle);
        }
        return fragmentMo4815;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public AbstractC8885 mo29908(@InterfaceC6391 Fragment fragment) {
        m30047(new C1704(6, fragment));
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public AbstractC8885 m30052() {
        if (this.f29798) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f29799 = false;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo29909(int i, Fragment fragment, @InterfaceC6490 String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C5093.m15700(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        m30047(new C1704(i2, fragment));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public AbstractC8885 mo29910(@InterfaceC6391 Fragment fragment) {
        m30047(new C1704(4, fragment));
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m30053() {
        return this.f29799;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public boolean mo29911() {
        return this.f29792.isEmpty();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public AbstractC8885 mo29912(@InterfaceC6391 Fragment fragment) {
        m30047(new C1704(3, fragment));
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public AbstractC8885 m30054(@InterfaceC5411 int i, @InterfaceC6391 Fragment fragment) {
        return m30055(i, fragment, null);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public AbstractC8885 m30055(@InterfaceC5411 int i, @InterfaceC6391 Fragment fragment, @InterfaceC6490 String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo29909(i, fragment, str, 2);
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final AbstractC8885 m30056(@InterfaceC5411 int i, @InterfaceC6391 Class<? extends Fragment> cls, @InterfaceC6490 Bundle bundle) {
        return m30057(i, cls, bundle, null);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final AbstractC8885 m30057(@InterfaceC5411 int i, @InterfaceC6391 Class<? extends Fragment> cls, @InterfaceC6490 Bundle bundle, @InterfaceC6490 String str) {
        return m30055(i, m30051(cls, bundle), str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public AbstractC8885 m30058(@InterfaceC6391 Runnable runnable) {
        m30052();
        if (this.f29808 == null) {
            this.f29808 = new ArrayList<>();
        }
        this.f29808.add(runnable);
        return this;
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public AbstractC8885 m30059(boolean z) {
        return m30066(z);
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public AbstractC8885 m30060(@InterfaceC7613 int i) {
        this.f29803 = i;
        this.f29804 = null;
        return this;
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public AbstractC8885 m30061(@InterfaceC6490 CharSequence charSequence) {
        this.f29803 = 0;
        this.f29804 = charSequence;
        return this;
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public AbstractC8885 m30062(@InterfaceC7613 int i) {
        this.f29801 = i;
        this.f29802 = null;
        return this;
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public AbstractC8885 m30063(@InterfaceC6490 CharSequence charSequence) {
        this.f29801 = 0;
        this.f29802 = charSequence;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public AbstractC8885 m30064(@InterfaceC3218 @InterfaceC3258 int i, @InterfaceC3218 @InterfaceC3258 int i2) {
        return m30065(i, i2, 0, 0);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public AbstractC8885 m30065(@InterfaceC3218 @InterfaceC3258 int i, @InterfaceC3218 @InterfaceC3258 int i2, @InterfaceC3218 @InterfaceC3258 int i3, @InterfaceC3218 @InterfaceC3258 int i4) {
        this.f29793 = i;
        this.f29794 = i2;
        this.f29795 = i3;
        this.f29796 = i4;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public AbstractC8885 mo29913(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Lifecycle.State state) {
        m30047(new C1704(10, fragment, state));
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public AbstractC8885 mo29914(@InterfaceC6490 Fragment fragment) {
        m30047(new C1704(8, fragment));
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public AbstractC8885 m30066(boolean z) {
        this.f29807 = z;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public AbstractC8885 m30067(int i) {
        this.f29797 = i;
        return this;
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public AbstractC8885 m30068(@InterfaceC7651 int i) {
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public AbstractC8885 mo29915(@InterfaceC6391 Fragment fragment) {
        m30047(new C1704(5, fragment));
        return this;
    }

    public AbstractC8885(@InterfaceC6391 C8876 c8876, @InterfaceC6490 ClassLoader classLoader) {
        this.f29792 = new ArrayList<>();
        this.f29799 = true;
        this.f29807 = false;
        this.f3841 = c8876;
        this.f3842 = classLoader;
    }

    public AbstractC8885(@InterfaceC6391 C8876 c8876, @InterfaceC6490 ClassLoader classLoader, @InterfaceC6391 AbstractC8885 abstractC8885) {
        this(c8876, classLoader);
        Iterator<C1704> it = abstractC8885.f29792.iterator();
        while (it.hasNext()) {
            this.f29792.add(new C1704(it.next()));
        }
        this.f29793 = abstractC8885.f29793;
        this.f29794 = abstractC8885.f29794;
        this.f29795 = abstractC8885.f29795;
        this.f29796 = abstractC8885.f29796;
        this.f29797 = abstractC8885.f29797;
        this.f29798 = abstractC8885.f29798;
        this.f29799 = abstractC8885.f29799;
        this.f29800 = abstractC8885.f29800;
        this.f29803 = abstractC8885.f29803;
        this.f29804 = abstractC8885.f29804;
        this.f29801 = abstractC8885.f29801;
        this.f29802 = abstractC8885.f29802;
        if (abstractC8885.f29805 != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f29805 = arrayList;
            arrayList.addAll(abstractC8885.f29805);
        }
        if (abstractC8885.f29806 != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f29806 = arrayList2;
            arrayList2.addAll(abstractC8885.f29806);
        }
        this.f29807 = abstractC8885.f29807;
    }
}

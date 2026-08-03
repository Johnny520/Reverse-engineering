package androidx.fragment.app;

import Yue.AbstractC3115;
import Yue.AbstractC3138;
import Yue.AbstractC5076;
import Yue.AbstractC5078;
import Yue.AbstractC6546;
import Yue.C3112;
import Yue.C3116;
import Yue.C5085;
import Yue.C5093;
import Yue.C5488;
import Yue.C5864;
import Yue.C6292;
import Yue.C6664;
import Yue.C6884;
import Yue.InterfaceC3113;
import Yue.InterfaceC3139;
import Yue.InterfaceC4144;
import Yue.InterfaceC5086;
import Yue.InterfaceC5088;
import Yue.InterfaceC5089;
import Yue.InterfaceC5411;
import Yue.InterfaceC5922;
import Yue.InterfaceC6151;
import Yue.InterfaceC6165;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6549;
import Yue.InterfaceC6550;
import Yue.InterfaceC6554;
import Yue.InterfaceC6556;
import Yue.InterfaceC6559;
import Yue.InterfaceC7144;
import Yue.InterfaceC7235;
import Yue.InterfaceC7541;
import Yue.InterfaceC7613;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.AbstractC8885;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C1794;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements InterfaceC5089 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final String f29606 = "android:support:fragments";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final String f29607 = "state";

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final String f29608 = "result_";

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final String f29609 = "fragment_";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean f29610 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static final String f29611 = "FragmentManager";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f29612 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f29613 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f3802;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public ArrayList<C1688> f29615;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ArrayList<Fragment> f29616;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public OnBackPressedDispatcher f29618;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public ArrayList<InterfaceC8859> f29624;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public AbstractC5078<?> f29633;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public AbstractC5076 f29634;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Fragment f29635;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6490
    public Fragment f29636;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public AbstractC3138<Intent> f29641;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public AbstractC3138<C5488> f29642;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public AbstractC3138<String[]> f29643;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f29645;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f29646;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f29647;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f29648;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean f29649;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public ArrayList<C1688> f29650;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public ArrayList<Boolean> f29651;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public ArrayList<Fragment> f29652;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public C8880 f29653;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public C5093.C5094 f29654;

    /* JADX INFO: renamed from: ۥ */
    public final ArrayList<InterfaceC8860> f3801 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C8884 f29614 = new C8884();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final LayoutInflaterFactory2C8877 f29617 = new LayoutInflaterFactory2C8877(this);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final AbstractC6546 f29619 = new C1686(false);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final AtomicInteger f29620 = new AtomicInteger();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Map<String, C8865> f29621 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Map<String, Bundle> f29622 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Map<String, C8858> f29623 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C8878 f29625 = new C8878(this);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final CopyOnWriteArrayList<InterfaceC5086> f29626 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final InterfaceC4144<Configuration> f29627 = new InterfaceC4144() { // from class: Yue.ۥ۠ۢۨ۟
        @Override // Yue.InterfaceC4144
        public final void accept(Object obj) {
            this.f12034.m29832((Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final InterfaceC4144<Integer> f29628 = new InterfaceC4144() { // from class: Yue.ۥ۠ۢۨ۠
        @Override // Yue.InterfaceC4144
        public final void accept(Object obj) {
            this.f12035.m29833((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final InterfaceC4144<C6292> f29629 = new InterfaceC4144() { // from class: Yue.ۥ۠ۢۨۡ
        @Override // Yue.InterfaceC4144
        public final void accept(Object obj) {
            this.f12036.m29834((C6292) obj);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final InterfaceC4144<C6664> f29630 = new InterfaceC4144() { // from class: Yue.ۥ۠ۢۨۢ
        @Override // Yue.InterfaceC4144
        public final void accept(Object obj) {
            this.f12037.m29835((C6664) obj);
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final InterfaceC6165 f29631 = new C8846();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f29632 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C8876 f29637 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C8876 f29638 = new C8847();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public InterfaceC7541 f29639 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public InterfaceC7541 f29640 = new C8848();

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public ArrayDeque<C8857> f29644 = new ArrayDeque<>();

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public Runnable f29655 = new RunnableC8849();

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ */
    public class C1685 implements InterfaceC3113<Map<String, Boolean>> {
        public C1685() {
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;)V */
        @Override // Yue.InterfaceC3113
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void mo215(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C8857 c8857PollFirst = FragmentManager.this.f29644.pollFirst();
            if (c8857PollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = c8857PollFirst.f29663;
            int i2 = c8857PollFirst.f29664;
            Fragment fragmentM30019 = FragmentManager.this.f29614.m30019(str);
            if (fragmentM30019 != null) {
                fragmentM30019.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟ */
    public class C1686 extends AbstractC6546 {
        public C1686(boolean z) {
            super(z);
        }

        @Override // Yue.AbstractC6546
        public void handleOnBackPressed() {
            FragmentManager.this.m29820();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟, reason: contains not printable characters */
    public class C8846 implements InterfaceC6165 {
        public C8846() {
        }

        @Override // Yue.InterfaceC6165
        /* JADX INFO: renamed from: ۥ */
        public boolean mo2669(@InterfaceC6391 MenuItem menuItem) {
            return FragmentManager.this.m29772(menuItem);
        }

        @Override // Yue.InterfaceC6165
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2670(@InterfaceC6391 Menu menu) {
            FragmentManager.this.m29773(menu);
        }

        @Override // Yue.InterfaceC6165
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo19030(@InterfaceC6391 Menu menu, @InterfaceC6391 MenuInflater menuInflater) {
            FragmentManager.this.m29765(menu, menuInflater);
        }

        @Override // Yue.InterfaceC6165
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo19031(@InterfaceC6391 Menu menu) {
            FragmentManager.this.m29777(menu);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟, reason: contains not printable characters */
    public class C8847 extends C8876 {
        public C8847() {
        }

        @Override // androidx.fragment.app.C8876
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public Fragment mo4815(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) {
            return FragmentManager.this.m29812().m1894(FragmentManager.this.m29812().m15670(), str, null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8848 implements InterfaceC7541 {
        public C8848() {
        }

        @Override // Yue.InterfaceC7541
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public AbstractC8887 mo3724(@InterfaceC6391 ViewGroup viewGroup) {
            return new C8866(viewGroup);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟۠, reason: contains not printable characters */
    public class RunnableC8849 implements Runnable {
        public RunnableC8849() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m29789(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C8850 implements InterfaceC5086 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Fragment f29661;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C8850(Fragment fragment) {
            this.f29661 = fragment;
        }

        @Override // Yue.InterfaceC5086
        /* JADX INFO: renamed from: ۥ */
        public void mo1899(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
            this.f29661.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C8851 implements InterfaceC3113<C3112> {
        public C8851() {
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;)V */
        @Override // Yue.InterfaceC3113
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void mo215(C3112 c3112) {
            C8857 c8857PollLast = FragmentManager.this.f29644.pollLast();
            if (c8857PollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = c8857PollLast.f29663;
            int i = c8857PollLast.f29664;
            Fragment fragmentM30019 = FragmentManager.this.f29614.m30019(str);
            if (fragmentM30019 != null) {
                fragmentM30019.onActivityResult(i, c3112.m212(), c3112.m211());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥۣ۟۟۟, reason: contains not printable characters */
    public class C8852 implements InterfaceC3113<C3112> {
        public C8852() {
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;)V */
        @Override // Yue.InterfaceC3113
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void mo215(C3112 c3112) {
            C8857 c8857PollFirst = FragmentManager.this.f29644.pollFirst();
            if (c8857PollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = c8857PollFirst.f29663;
            int i = c8857PollFirst.f29664;
            Fragment fragmentM30019 = FragmentManager.this.f29614.m30019(str);
            if (fragmentM30019 != null) {
                fragmentM30019.onActivityResult(i, c3112.m212(), c3112.m211());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC8853 {
        int getId();

        @InterfaceC6490
        String getName();

        @InterfaceC6490
        @Deprecated
        /* JADX INFO: renamed from: ۥ */
        CharSequence mo4818();

        @InterfaceC7613
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        int mo29885();

        @InterfaceC7613
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        int mo29886();

        @InterfaceC6490
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        CharSequence mo29887();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public class C8854 implements InterfaceC8860 {

        /* JADX INFO: renamed from: ۥ */
        public final String f3810;

        public C8854(@InterfaceC6391 String str) {
            this.f3810 = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC8860
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4819(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.m29754(arrayList, arrayList2, this.f3810);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C8855 extends AbstractC3115<C5488, C3112> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6391 Context context, C5488 c5488) {
            Bundle bundleExtra;
            Intent intent = new Intent(C3116.C3132.f96);
            Intent intentM2240 = c5488.m2240();
            if (intentM2240 != null && (bundleExtra = intentM2240.getBundleExtra(C3116.C3131.f94)) != null) {
                intent.putExtra(C3116.C3131.f94, bundleExtra);
                intentM2240.removeExtra(C3116.C3131.f94);
                if (intentM2240.getBooleanExtra(FragmentManager.f29613, false)) {
                    c5488 = new C5488.C0774(c5488.m17075()).m2243(null).m17076(c5488.m17074(), c5488.m2241()).m2242();
                }
            }
            intent.putExtra(C3116.C3132.f4644, c5488);
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C3112 mo6351(int i, @InterfaceC6490 Intent intent) {
            return new C3112(i, intent);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static abstract class AbstractC8856 {
        @Deprecated
        /* JADX INFO: renamed from: ۥ */
        public void m4820(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment, @InterfaceC6490 Bundle bundle) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4821(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment, @InterfaceC6391 Context context) {
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29890(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment, @InterfaceC6490 Bundle bundle) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29891(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m29892(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m29893(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m29894(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment, @InterfaceC6391 Context context) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m29895(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment, @InterfaceC6490 Bundle bundle) {
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m29896(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m29897(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment, @InterfaceC6391 Bundle bundle) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m29898(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m29899(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void mo29900(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment, @InterfaceC6391 View view, @InterfaceC6490 Bundle bundle) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m29901(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠, reason: contains not printable characters */
    public static class C8858 implements InterfaceC5088 {

        /* JADX INFO: renamed from: ۥ */
        public final Lifecycle f3812;

        /* JADX INFO: renamed from: ۥ۟ */
        public final InterfaceC5088 f3813;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final LifecycleEventObserver f29665;

        public C8858(@InterfaceC6391 Lifecycle lifecycle, @InterfaceC6391 InterfaceC5088 interfaceC5088, @InterfaceC6391 LifecycleEventObserver lifecycleEventObserver) {
            this.f3812 = lifecycle;
            this.f3813 = interfaceC5088;
            this.f29665 = lifecycleEventObserver;
        }

        @Override // Yue.InterfaceC5088
        /* JADX INFO: renamed from: ۥ */
        public void mo1901(@InterfaceC6391 String str, @InterfaceC6391 Bundle bundle) {
            this.f3813.mo1901(str, bundle);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4824(Lifecycle.State state) {
            return this.f3812.getState().isAtLeast(state);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29902() {
            this.f3812.removeObserver(this.f29665);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠۟, reason: contains not printable characters */
    public interface InterfaceC8859 {
        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ */
        default void m4825(@InterfaceC6391 Fragment fragment, boolean z) {
        }

        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ۟ */
        default void m4826(@InterfaceC6391 Fragment fragment, boolean z) {
        }

        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void m29903();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠۠, reason: contains not printable characters */
    public interface InterfaceC8860 {
        /* JADX INFO: renamed from: ۥ۟ */
        boolean mo4819(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public class C8861 implements InterfaceC8860 {

        /* JADX INFO: renamed from: ۥ */
        public final String f3814;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f3815;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f29666;

        public C8861(@InterfaceC6490 String str, int i, int i2) {
            this.f3814 = str;
            this.f3815 = i;
            this.f29666 = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC8860
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4819(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f29636;
            if (fragment == null || this.f3815 >= 0 || this.f3814 != null || !fragment.getChildFragmentManager().m29848()) {
                return FragmentManager.this.m29852(arrayList, arrayList2, this.f3814, this.f3815, this.f29666);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public class C8862 implements InterfaceC8860 {

        /* JADX INFO: renamed from: ۥ */
        public final String f3816;

        public C8862(@InterfaceC6391 String str) {
            this.f3816 = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC8860
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4819(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.m29863(arrayList, arrayList2, this.f3816);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥۣ۟۟۠, reason: contains not printable characters */
    public class C8863 implements InterfaceC8860 {

        /* JADX INFO: renamed from: ۥ */
        public final String f3818;

        public C8863(@InterfaceC6391 String str) {
            this.f3818 = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC8860
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4819(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.m29870(arrayList, arrayList2, this.f3818);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static void m29733(boolean z) {
        f29610 = z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static void m29734(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1688 c1688 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c1688.m29916(-1);
                c1688.m29922();
            } else {
                c1688.m29916(1);
                c1688.m29921();
            }
            i++;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static <F extends Fragment> F m29735(@InterfaceC6391 View view) {
        F f = (F) m29737(view);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static FragmentManager m29736(@InterfaceC6391 View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentM29737 = m29737(view);
        if (fragmentM29737 != null) {
            if (fragmentM29737.isAdded()) {
                return fragmentM29737.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentM29737 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fragmentActivity = null;
                break;
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static Fragment m29737(@InterfaceC6391 View view) {
        while (view != null) {
            Fragment fragmentM29738 = m29738(view);
            if (fragmentM29738 != null) {
                return fragmentM29738;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static Fragment m29738(@InterfaceC6391 View view) {
        Object tag = view.getTag(C6884.C6885.f2414);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static boolean m29739(int i) {
        return f29610 || Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static int m29740(int i) {
        int i2 = AbstractC8885.f29787;
        if (i == 4097) {
            return 8194;
        }
        if (i != 8194) {
            i2 = AbstractC8885.f29791;
            if (i == 8197) {
                return AbstractC8885.f29790;
            }
            if (i == 4099) {
                return AbstractC8885.f29789;
            }
            if (i != 4100) {
                return 0;
            }
        }
        return i2;
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f29635;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f29635)));
            sb.append("}");
        } else {
            AbstractC5078<?> abstractC5078 = this.f29633;
            if (abstractC5078 != null) {
                sb.append(abstractC5078.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f29633)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // Yue.InterfaceC5089
    /* JADX INFO: renamed from: ۥ */
    public final void mo1902(@InterfaceC6391 String str, @InterfaceC6391 Bundle bundle) {
        C8858 c8858 = this.f29623.get(str);
        if (c8858 == null || !c8858.m4824(Lifecycle.State.STARTED)) {
            this.f29622.put(str, bundle);
        } else {
            c8858.mo1901(str, bundle);
        }
        if (m29739(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    @Override // Yue.InterfaceC5089
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo1903(@InterfaceC6391 final String str, @InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 final InterfaceC5088 interfaceC5088) {
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner2, @InterfaceC6391 Lifecycle.Event event) {
                Bundle bundle;
                if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.f29622.get(str)) != null) {
                    interfaceC5088.mo1901(str, bundle);
                    FragmentManager.this.mo15697(str);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    FragmentManager.this.f29623.remove(str);
                }
            }
        };
        C8858 c8858Put = this.f29623.put(str, new C8858(lifecycle, interfaceC5088, lifecycleEventObserver));
        if (c8858Put != null) {
            c8858Put.m29902();
        }
        if (m29739(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + interfaceC5088);
        }
        lifecycle.addObserver(lifecycleEventObserver);
    }

    @Override // Yue.InterfaceC5089
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final void mo15696(@InterfaceC6391 String str) {
        C8858 c8858Remove = this.f29623.remove(str);
        if (c8858Remove != null) {
            c8858Remove.m29902();
        }
        if (m29739(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    @Override // Yue.InterfaceC5089
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public final void mo15697(@InterfaceC6391 String str) {
        this.f29622.remove(str);
        if (m29739(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29741(C1688 c1688) {
        if (this.f29615 == null) {
            this.f29615 = new ArrayList<>();
        }
        this.f29615.add(c1688);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C8882 m29742(@InterfaceC6391 Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C5093.m15700(fragment, str);
        }
        if (m29739(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C8882 c8882M29758 = m29758(fragment);
        fragment.mFragmentManager = this;
        this.f29614.m30029(c8882M29758);
        if (!fragment.mDetached) {
            this.f29614.m4853(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m29824(fragment)) {
                this.f29645 = true;
            }
        }
        return c8882M29758;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m29743(@InterfaceC6391 InterfaceC5086 interfaceC5086) {
        this.f29626.add(interfaceC5086);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29744(@InterfaceC6391 InterfaceC8859 interfaceC8859) {
        if (this.f29624 == null) {
            this.f29624 = new ArrayList<>();
        }
        this.f29624.add(interfaceC8859);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m29745(@InterfaceC6391 Fragment fragment) {
        this.f29653.m4846(fragment);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m29746() {
        return this.f29620.getAndIncrement();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥ۠ۢۨ<?> */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m29747(@InterfaceC6391 AbstractC5078<?> abstractC5078, @InterfaceC6391 AbstractC5076 abstractC5076, @InterfaceC6490 Fragment fragment) {
        String str;
        if (this.f29633 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f29633 = abstractC5078;
        this.f29634 = abstractC5076;
        this.f29635 = fragment;
        if (fragment != null) {
            m29743(new C8850(fragment));
        } else if (abstractC5078 instanceof InterfaceC5086) {
            m29743((InterfaceC5086) abstractC5078);
        }
        if (this.f29635 != null) {
            m29884();
        }
        if (abstractC5078 instanceof InterfaceC6549) {
            InterfaceC6549 interfaceC6549 = (InterfaceC6549) abstractC5078;
            OnBackPressedDispatcher onBackPressedDispatcher = interfaceC6549.getOnBackPressedDispatcher();
            this.f29618 = onBackPressedDispatcher;
            LifecycleOwner lifecycleOwner = interfaceC6549;
            if (fragment != null) {
                lifecycleOwner = fragment;
            }
            onBackPressedDispatcher.m28633(lifecycleOwner, this.f29619);
        }
        if (fragment != null) {
            this.f29653 = fragment.mFragmentManager.m29805(fragment);
        } else if (abstractC5078 instanceof ViewModelStoreOwner) {
            this.f29653 = C8880.m29979(((ViewModelStoreOwner) abstractC5078).getViewModelStore());
        } else {
            this.f29653 = new C8880(false);
        }
        this.f29653.m29990(m29830());
        this.f29614.m30038(this.f29653);
        Object obj = this.f29633;
        if ((obj instanceof InterfaceC7235) && fragment == null) {
            C1794 savedStateRegistry = ((InterfaceC7235) obj).getSavedStateRegistry();
            savedStateRegistry.m30806(f29606, new C1794.InterfaceC9000() { // from class: Yue.ۥۣ۠ۢۨ
                @Override // androidx.savedstate.C1794.InterfaceC9000
                public final Bundle saveState() {
                    return this.f1259.m29831();
                }
            });
            Bundle bundleM5022 = savedStateRegistry.m5022(f29606);
            if (bundleM5022 != null) {
                m29865(bundleM5022);
            }
        }
        Object obj2 = this.f29633;
        if (obj2 instanceof InterfaceC3139) {
            ActivityResultRegistry activityResultRegistry = ((InterfaceC3139) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f29641 = activityResultRegistry.m28656(str2 + "StartActivityForResult", new C3116.C3131(), new C8851());
            this.f29642 = activityResultRegistry.m28656(str2 + "StartIntentSenderForResult", new C8855(), new C8852());
            this.f29643 = activityResultRegistry.m28656(str2 + "RequestPermissions", new C3116.C3129(), new C1685());
        }
        Object obj3 = this.f29633;
        if (obj3 instanceof InterfaceC6550) {
            ((InterfaceC6550) obj3).addOnConfigurationChangedListener(this.f29627);
        }
        Object obj4 = this.f29633;
        if (obj4 instanceof InterfaceC6559) {
            ((InterfaceC6559) obj4).addOnTrimMemoryListener(this.f29628);
        }
        Object obj5 = this.f29633;
        if (obj5 instanceof InterfaceC6554) {
            ((InterfaceC6554) obj5).addOnMultiWindowModeChangedListener(this.f29629);
        }
        Object obj6 = this.f29633;
        if (obj6 instanceof InterfaceC6556) {
            ((InterfaceC6556) obj6).addOnPictureInPictureModeChangedListener(this.f29630);
        }
        Object obj7 = this.f29633;
        if ((obj7 instanceof InterfaceC6151) && fragment == null) {
            ((InterfaceC6151) obj7).addMenuProvider(this.f29631);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29748(@InterfaceC6391 Fragment fragment) {
        if (m29739(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f29614.m4853(fragment);
            if (m29739(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m29824(fragment)) {
                this.f29645 = true;
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public AbstractC8885 m29749() {
        return new C1688(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m29750() {
        boolean zM29824 = false;
        for (Fragment fragment : this.f29614.m30023()) {
            if (fragment != null) {
                zM29824 = m29824(fragment);
            }
            if (zM29824) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m29751() {
        if (m29830()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m29752() {
        this.f3802 = false;
        this.f29651.clear();
        this.f29650.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m29753(@InterfaceC6391 String str) {
        m29787(new C8854(str), false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m29754(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2, @InterfaceC6391 String str) {
        if (m29863(arrayList, arrayList2, str)) {
            return m29852(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m29755() {
        AbstractC5078<?> abstractC5078 = this.f29633;
        if (abstractC5078 instanceof ViewModelStoreOwner ? this.f29614.m30027().m29987() : abstractC5078.m15670() instanceof Activity ? !((Activity) this.f29633.m15670()).isChangingConfigurations() : true) {
            Iterator<C8865> it = this.f29621.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f29688.iterator();
                while (it2.hasNext()) {
                    this.f29614.m30027().m29980(it2.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Set<AbstractC8887> m29756() {
        HashSet hashSet = new HashSet();
        Iterator<C8882> it = this.f29614.m30022().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m30000().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC8887.m30075(viewGroup, m29817()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final Set<AbstractC8887> m29757(@InterfaceC6391 ArrayList<C1688> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<AbstractC8885.C1704> it = arrayList.get(i).f29792.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3844;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC8887.m30076(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C8882 m29758(@InterfaceC6391 Fragment fragment) {
        C8882 c8882M30025 = this.f29614.m30025(fragment.mWho);
        if (c8882M30025 != null) {
            return c8882M30025;
        }
        C8882 c8882 = new C8882(this.f29625, this.f29614, fragment);
        c8882.m30004(this.f29633.m15670().getClassLoader());
        c8882.m30009(this.f29632);
        return c8882;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29759(@InterfaceC6391 Fragment fragment) {
        if (m29739(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m29739(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f29614.m30032(fragment);
            if (m29824(fragment)) {
                this.f29645 = true;
            }
            m29879(fragment);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m29760() {
        this.f29646 = false;
        this.f29647 = false;
        this.f29653.m29990(false);
        m29781(4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m29761() {
        this.f29646 = false;
        this.f29647 = false;
        this.f29653.m29990(false);
        m29781(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m29762(@InterfaceC6391 Configuration configuration, boolean z) {
        if (z && (this.f29633 instanceof InterfaceC6550)) {
            m29882(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.m29762(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean m29763(@InterfaceC6391 MenuItem menuItem) {
        if (this.f29632 < 1) {
            return false;
        }
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m29764() {
        this.f29646 = false;
        this.f29647 = false;
        this.f29653.m29990(false);
        m29781(1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean m29765(@InterfaceC6391 Menu menu, @InterfaceC6391 MenuInflater menuInflater) {
        if (this.f29632 < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null && m29827(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f29616 != null) {
            for (int i = 0; i < this.f29616.size(); i++) {
                Fragment fragment2 = this.f29616.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f29616 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m29766() {
        this.f29648 = true;
        m29789(true);
        m29786();
        m29755();
        m29781(-1);
        Object obj = this.f29633;
        if (obj instanceof InterfaceC6559) {
            ((InterfaceC6559) obj).removeOnTrimMemoryListener(this.f29628);
        }
        Object obj2 = this.f29633;
        if (obj2 instanceof InterfaceC6550) {
            ((InterfaceC6550) obj2).removeOnConfigurationChangedListener(this.f29627);
        }
        Object obj3 = this.f29633;
        if (obj3 instanceof InterfaceC6554) {
            ((InterfaceC6554) obj3).removeOnMultiWindowModeChangedListener(this.f29629);
        }
        Object obj4 = this.f29633;
        if (obj4 instanceof InterfaceC6556) {
            ((InterfaceC6556) obj4).removeOnPictureInPictureModeChangedListener(this.f29630);
        }
        Object obj5 = this.f29633;
        if ((obj5 instanceof InterfaceC6151) && this.f29635 == null) {
            ((InterfaceC6151) obj5).removeMenuProvider(this.f29631);
        }
        this.f29633 = null;
        this.f29634 = null;
        this.f29635 = null;
        if (this.f29618 != null) {
            this.f29619.remove();
            this.f29618 = null;
        }
        AbstractC3138<Intent> abstractC3138 = this.f29641;
        if (abstractC3138 != null) {
            abstractC3138.mo6416();
            this.f29642.mo6416();
            this.f29643.mo6416();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m29767() {
        m29781(1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m29768(boolean z) {
        if (z && (this.f29633 instanceof InterfaceC6559)) {
            m29882(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.m29768(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m29769(boolean z, boolean z2) {
        if (z2 && (this.f29633 instanceof InterfaceC6554)) {
            m29882(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m29769(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m29770(@InterfaceC6391 Fragment fragment) {
        Iterator<InterfaceC5086> it = this.f29626.iterator();
        while (it.hasNext()) {
            it.next().mo1899(this, fragment);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m29771() {
        for (Fragment fragment : this.f29614.m30023()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m29771();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean m29772(@InterfaceC6391 MenuItem menuItem) {
        if (this.f29632 < 1) {
            return false;
        }
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m29773(@InterfaceC6391 Menu menu) {
        if (this.f29632 < 1) {
            return;
        }
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m29774(@InterfaceC6490 Fragment fragment) {
        if (fragment == null || !fragment.equals(m29793(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m29775() {
        m29781(5);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m29776(boolean z, boolean z2) {
        if (z2 && (this.f29633 instanceof InterfaceC6556)) {
            m29882(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m29776(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m29777(@InterfaceC6391 Menu menu) {
        boolean z = false;
        if (this.f29632 < 1) {
            return false;
        }
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null && m29827(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29778() {
        m29884();
        m29774(this.f29636);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29779() {
        this.f29646 = false;
        this.f29647 = false;
        this.f29653.m29990(false);
        m29781(7);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m29780() {
        this.f29646 = false;
        this.f29647 = false;
        this.f29653.m29990(false);
        m29781(5);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m29781(int i) {
        try {
            this.f3802 = true;
            this.f29614.m30014(i);
            m29839(i, false);
            Iterator<AbstractC8887> it = m29756().iterator();
            while (it.hasNext()) {
                it.next().m30085();
            }
            this.f3802 = false;
            m29789(true);
        } catch (Throwable th) {
            this.f3802 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m29782() {
        this.f29647 = true;
        this.f29653.m29990(true);
        m29781(4);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m29783() {
        m29781(2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final void m29784() {
        if (this.f29649) {
            this.f29649 = false;
            m29881();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m29785(@InterfaceC6391 String str, @InterfaceC6490 FileDescriptor fileDescriptor, @InterfaceC6391 PrintWriter printWriter, @InterfaceC6490 String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f29614.m30015(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f29616;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment = this.f29616.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C1688> arrayList2 = this.f29615;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1688 c1688 = this.f29615.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c1688.toString());
                c1688.m29919(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f29620.get());
        synchronized (this.f3801) {
            try {
                int size3 = this.f3801.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i3 = 0; i3 < size3; i3++) {
                        InterfaceC8860 interfaceC8860 = this.f3801.get(i3);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i3);
                        printWriter.print(": ");
                        printWriter.println(interfaceC8860);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f29633);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f29634);
        if (this.f29635 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f29635);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f29632);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f29646);
        printWriter.print(" mStopped=");
        printWriter.print(this.f29647);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f29648);
        if (this.f29645) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f29645);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m29786() {
        Iterator<AbstractC8887> it = m29756().iterator();
        while (it.hasNext()) {
            it.next().m30085();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void m29787(@InterfaceC6391 InterfaceC8860 interfaceC8860, boolean z) {
        if (!z) {
            if (this.f29633 == null) {
                if (!this.f29648) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m29751();
        }
        synchronized (this.f3801) {
            try {
                if (this.f29633 == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f3801.add(interfaceC8860);
                    m29872();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m29788(boolean z) {
        if (this.f3802) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f29633 == null) {
            if (!this.f29648) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f29633.m15671().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m29751();
        }
        if (this.f29650 == null) {
            this.f29650 = new ArrayList<>();
            this.f29651 = new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public boolean m29789(boolean z) {
        m29788(z);
        boolean z2 = false;
        while (m29800(this.f29650, this.f29651)) {
            z2 = true;
            this.f3802 = true;
            try {
                m29858(this.f29650, this.f29651);
            } finally {
                m29752();
            }
        }
        m29884();
        m29784();
        this.f29614.m4854();
        return z2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m29790(@InterfaceC6391 InterfaceC8860 interfaceC8860, boolean z) {
        if (z && (this.f29633 == null || this.f29648)) {
            return;
        }
        m29788(z);
        if (interfaceC8860.mo4819(this.f29650, this.f29651)) {
            this.f3802 = true;
            try {
                m29858(this.f29650, this.f29651);
            } finally {
                m29752();
            }
        }
        m29884();
        m29784();
        this.f29614.m4854();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final void m29791(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2, int i, int i2) {
        ArrayList<InterfaceC8859> arrayList3;
        boolean z = arrayList.get(i).f29807;
        ArrayList<Fragment> arrayList4 = this.f29652;
        if (arrayList4 == null) {
            this.f29652 = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.f29652.addAll(this.f29614.m30026());
        Fragment fragmentM29816 = m29816();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C1688 c1688 = arrayList.get(i3);
            fragmentM29816 = !arrayList2.get(i3).booleanValue() ? c1688.m29923(this.f29652, fragmentM29816) : c1688.m29925(this.f29652, fragmentM29816);
            z2 = z2 || c1688.f29798;
        }
        this.f29652.clear();
        if (!z && this.f29632 >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<AbstractC8885.C1704> it = arrayList.get(i4).f29792.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f3844;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f29614.m30029(m29758(fragment));
                    }
                }
            }
        }
        m29734(arrayList, arrayList2, i, i2);
        boolean zBooleanValue = arrayList2.get(i2 - 1).booleanValue();
        if (z2 && (arrayList3 = this.f29624) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<C1688> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m29799(it2.next()));
            }
            for (InterfaceC8859 interfaceC8859 : this.f29624) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    interfaceC8859.m4826((Fragment) it3.next(), zBooleanValue);
                }
            }
            for (InterfaceC8859 interfaceC88592 : this.f29624) {
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    interfaceC88592.m4825((Fragment) it4.next(), zBooleanValue);
                }
            }
        }
        for (int i5 = i; i5 < i2; i5++) {
            C1688 c16882 = arrayList.get(i5);
            if (zBooleanValue) {
                for (int size = c16882.f29792.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = c16882.f29792.get(size).f3844;
                    if (fragment2 != null) {
                        m29758(fragment2).m30002();
                    }
                }
            } else {
                Iterator<AbstractC8885.C1704> it5 = c16882.f29792.iterator();
                while (it5.hasNext()) {
                    Fragment fragment3 = it5.next().f3844;
                    if (fragment3 != null) {
                        m29758(fragment3).m30002();
                    }
                }
            }
        }
        m29839(this.f29632, true);
        for (AbstractC8887 abstractC8887 : m29757(arrayList, i, i2)) {
            abstractC8887.m30091(zBooleanValue);
            abstractC8887.m30089();
            abstractC8887.m30082();
        }
        while (i < i2) {
            C1688 c16883 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && c16883.f29671 >= 0) {
                c16883.f29671 = -1;
            }
            c16883.m29924();
            i++;
        }
        if (z2) {
            m29860();
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public boolean m29792() {
        boolean zM29789 = m29789(true);
        m29798();
        return zM29789;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public Fragment m29793(@InterfaceC6391 String str) {
        return this.f29614.m30016(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final int m29794(@InterfaceC6490 String str, int i, boolean z) {
        ArrayList<C1688> arrayList = this.f29615;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f29615.size() - 1;
        }
        int size = this.f29615.size() - 1;
        while (size >= 0) {
            C1688 c1688 = this.f29615.get(size);
            if ((str != null && str.equals(c1688.getName())) || (i >= 0 && i == c1688.f29671)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f29615.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1688 c16882 = this.f29615.get(size - 1);
            if ((str == null || !str.equals(c16882.getName())) && (i < 0 || i != c16882.f29671)) {
                return size;
            }
            size--;
        }
        return size;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public Fragment m29795(@InterfaceC5411 int i) {
        return this.f29614.m30017(i);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public Fragment m29796(@InterfaceC6490 String str) {
        return this.f29614.m30018(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public Fragment m29797(@InterfaceC6391 String str) {
        return this.f29614.m30019(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final void m29798() {
        Iterator<AbstractC8887> it = m29756().iterator();
        while (it.hasNext()) {
            it.next().m30086();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final Set<Fragment> m29799(@InterfaceC6391 C1688 c1688) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c1688.f29792.size(); i++) {
            Fragment fragment = c1688.f29792.get(i).f3844;
            if (fragment != null && c1688.f29798) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public final boolean m29800(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2) {
        synchronized (this.f3801) {
            if (this.f3801.isEmpty()) {
                return false;
            }
            try {
                int size = this.f3801.size();
                boolean zMo4819 = false;
                for (int i = 0; i < size; i++) {
                    zMo4819 |= this.f3801.get(i).mo4819(arrayList, arrayList2);
                }
                return zMo4819;
            } finally {
                this.f3801.clear();
                this.f29633.m15671().removeCallbacks(this.f29655);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public int m29801() {
        return this.f29614.m30021();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public List<Fragment> m29802() {
        return this.f29614.m30023();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public InterfaceC8853 m29803(int i) {
        return this.f29615.get(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public int m29804() {
        ArrayList<C1688> arrayList = this.f29615;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final C8880 m29805(@InterfaceC6391 Fragment fragment) {
        return this.f29653.m29983(fragment);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public AbstractC5076 m29806() {
        return this.f29634;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public Fragment m29807(@InterfaceC6391 Bundle bundle, @InterfaceC6391 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentM29793 = m29793(string);
        if (fragmentM29793 == null) {
            m29882(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentM29793;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final ViewGroup m29808(@InterfaceC6391 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f29634.mo15628()) {
            View viewMo15627 = this.f29634.mo15627(fragment.mContainerId);
            if (viewMo15627 instanceof ViewGroup) {
                return (ViewGroup) viewMo15627;
            }
        }
        return null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public C8876 m29809() {
        C8876 c8876 = this.f29637;
        if (c8876 != null) {
            return c8876;
        }
        Fragment fragment = this.f29635;
        return fragment != null ? fragment.mFragmentManager.m29809() : this.f29638;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public C8884 m29810() {
        return this.f29614;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public List<Fragment> m29811() {
        return this.f29614.m30026();
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public AbstractC5078<?> m29812() {
        return this.f29633;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public LayoutInflater.Factory2 m29813() {
        return this.f29617;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public C8878 m29814() {
        return this.f29625;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public Fragment m29815() {
        return this.f29635;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public Fragment m29816() {
        return this.f29636;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public InterfaceC7541 m29817() {
        InterfaceC7541 interfaceC7541 = this.f29639;
        if (interfaceC7541 != null) {
            return interfaceC7541;
        }
        Fragment fragment = this.f29635;
        return fragment != null ? fragment.mFragmentManager.m29817() : this.f29640;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public C5093.C5094 m29818() {
        return this.f29654;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public ViewModelStore m29819(@InterfaceC6391 Fragment fragment) {
        return this.f29653.m29986(fragment);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public void m29820() {
        m29789(true);
        if (this.f29619.isEnabled()) {
            m29848();
        } else {
            this.f29618.m28640();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public void m29821(@InterfaceC6391 Fragment fragment) {
        if (m29739(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m29879(fragment);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public void m29822(@InterfaceC6391 Fragment fragment) {
        if (fragment.mAdded && m29824(fragment)) {
            this.f29645 = true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public boolean m29823() {
        return this.f29648;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final boolean m29824(@InterfaceC6391 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m29750();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final boolean m29825() {
        Fragment fragment = this.f29635;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f29635.getParentFragmentManager().m29825();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public boolean m29826(@InterfaceC6490 Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public boolean m29827(@InterfaceC6490 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public boolean m29828(@InterfaceC6490 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.m29816()) && m29828(fragmentManager.f29635);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public boolean m29829(int i) {
        return this.f29632 >= i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public boolean m29830() {
        return this.f29646 || this.f29647;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public final /* synthetic */ void m29832(Configuration configuration) {
        if (m29825()) {
            m29762(configuration, false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public final /* synthetic */ void m29833(Integer num) {
        if (m29825() && num.intValue() == 80) {
            m29768(false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final /* synthetic */ void m29834(C6292 c6292) {
        if (m29825()) {
            m29769(c6292.m2764(), false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ void m29835(C6664 c6664) {
        if (m29825()) {
            m29776(c6664.m3154(), false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public void m29836(@InterfaceC6391 Fragment fragment, @InterfaceC6391 String[] strArr, int i) {
        if (this.f29643 == null) {
            this.f29633.m15677(fragment, strArr, i);
            return;
        }
        this.f29644.addLast(new C8857(fragment.mWho, i));
        this.f29643.m228(strArr);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public void m29837(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Intent intent, int i, @InterfaceC6490 Bundle bundle) {
        if (this.f29641 == null) {
            this.f29633.m15681(fragment, intent, i, bundle);
            return;
        }
        this.f29644.addLast(new C8857(fragment.mWho, i));
        if (bundle != null) {
            intent.putExtra(C3116.C3131.f94, bundle);
        }
        this.f29641.m228(intent);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public void m29838(@InterfaceC6391 Fragment fragment, @InterfaceC6391 IntentSender intentSender, int i, @InterfaceC6490 Intent intent, int i2, int i3, int i4, @InterfaceC6490 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f29642 == null) {
            this.f29633.m15682(fragment, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra(f29613, true);
            } else {
                intent2 = intent;
            }
            if (m29739(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra(C3116.C3131.f94, bundle);
        } else {
            intent2 = intent;
        }
        C5488 c5488M2242 = new C5488.C0774(intentSender).m2243(intent2).m17076(i3, i2).m2242();
        this.f29644.addLast(new C8857(fragment.mWho, i));
        if (m29739(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f29642.m228(c5488M2242);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public void m29839(int i, boolean z) {
        AbstractC5078<?> abstractC5078;
        if (this.f29633 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f29632) {
            this.f29632 = i;
            this.f29614.m30031();
            m29881();
            if (this.f29645 && (abstractC5078 = this.f29633) != null && this.f29632 == 7) {
                abstractC5078.mo15683();
                this.f29645 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public void m29840() {
        if (this.f29633 == null) {
            return;
        }
        this.f29646 = false;
        this.f29647 = false;
        this.f29653.m29990(false);
        for (Fragment fragment : this.f29614.m30026()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public void m29841(@InterfaceC6391 FragmentContainerView fragmentContainerView) {
        View view;
        for (C8882 c8882 : this.f29614.m30022()) {
            Fragment fragmentM30000 = c8882.m30000();
            if (fragmentM30000.mContainerId == fragmentContainerView.getId() && (view = fragmentM30000.mView) != null && view.getParent() == null) {
                fragmentM30000.mContainer = fragmentContainerView;
                c8882.m4852();
            }
        }
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public AbstractC8885 m29842() {
        return m29749();
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public void m29843(@InterfaceC6391 C8882 c8882) {
        Fragment fragmentM30000 = c8882.m30000();
        if (fragmentM30000.mDeferStart) {
            if (this.f3802) {
                this.f29649 = true;
            } else {
                fragmentM30000.mDeferStart = false;
                c8882.m30002();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public void m29844() {
        m29787(new C8861(null, -1, 0), false);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public void m29845(int i, int i2) {
        m29846(i, i2, false);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public void m29846(int i, int i2, boolean z) {
        if (i >= 0) {
            m29787(new C8861(null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public void m29847(@InterfaceC6490 String str, int i) {
        m29787(new C8861(str, -1, i), false);
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public boolean m29848() {
        return m29851(null, -1, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public boolean m29849(int i, int i2) {
        if (i >= 0) {
            return m29851(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public boolean m29850(@InterfaceC6490 String str, int i) {
        return m29851(str, -1, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public final boolean m29851(@InterfaceC6490 String str, int i, int i2) {
        m29789(false);
        m29788(true);
        Fragment fragment = this.f29636;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().m29848()) {
            return true;
        }
        boolean zM29852 = m29852(this.f29650, this.f29651, str, i, i2);
        if (zM29852) {
            this.f3802 = true;
            try {
                m29858(this.f29650, this.f29651);
            } finally {
                m29752();
            }
        }
        m29884();
        m29784();
        this.f29614.m4854();
        return zM29852;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public boolean m29852(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2, @InterfaceC6490 String str, int i, int i2) {
        int iM29794 = m29794(str, i, (i2 & 1) != 0);
        if (iM29794 < 0) {
            return false;
        }
        for (int size = this.f29615.size() - 1; size >= iM29794; size--) {
            arrayList.add(this.f29615.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public void m29853(@InterfaceC6391 Bundle bundle, @InterfaceC6391 String str, @InterfaceC6391 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m29882(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public void m29854(@InterfaceC6391 AbstractC8856 abstractC8856, boolean z) {
        this.f29625.m29977(abstractC8856, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public void m29855(@InterfaceC6391 Fragment fragment) {
        if (m29739(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f29614.m30032(fragment);
            if (m29824(fragment)) {
                this.f29645 = true;
            }
            fragment.mRemoving = true;
            m29879(fragment);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public void m29856(@InterfaceC6391 InterfaceC5086 interfaceC5086) {
        this.f29626.remove(interfaceC5086);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public void m29857(@InterfaceC6391 InterfaceC8859 interfaceC8859) {
        ArrayList<InterfaceC8859> arrayList = this.f29624;
        if (arrayList != null) {
            arrayList.remove(interfaceC8859);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public final void m29858(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f29807) {
                if (i2 != i) {
                    m29791(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f29807) {
                        i2++;
                    }
                }
                m29791(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m29791(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public void m29859(@InterfaceC6391 Fragment fragment) {
        this.f29653.m29988(fragment);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public final void m29860() {
        if (this.f29624 != null) {
            for (int i = 0; i < this.f29624.size(); i++) {
                this.f29624.get(i).m29903();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public void m29861(@InterfaceC6490 Parcelable parcelable, @InterfaceC6490 C5085 c5085) {
        if (this.f29633 instanceof ViewModelStoreOwner) {
            m29882(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f29653.m29989(c5085);
        m29865(parcelable);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public void m29862(@InterfaceC6391 String str) {
        m29787(new C8862(str), false);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public boolean m29863(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2, @InterfaceC6391 String str) {
        boolean z;
        C8865 c8865Remove = this.f29621.remove(str);
        if (c8865Remove == null) {
            return false;
        }
        HashMap map = new HashMap();
        for (C1688 c1688 : arrayList) {
            if (c1688.f29672) {
                Iterator<AbstractC8885.C1704> it = c1688.f29792.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f3844;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<C1688> it2 = c8865Remove.m4831(this, map).iterator();
        while (true) {
            while (it2.hasNext()) {
                z = it2.next().mo4819(arrayList, arrayList2) || z;
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public void m29864(@InterfaceC6490 Parcelable parcelable) {
        if (this.f29633 instanceof InterfaceC7235) {
            m29882(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        m29865(parcelable);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public void m29865(@InterfaceC6490 Parcelable parcelable) {
        C8882 c8882;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(f29608) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f29633.m15670().getClassLoader());
                this.f29622.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(f29609) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f29633.m15670().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f29614.m30035(map);
        C8879 c8879 = (C8879) bundle3.getParcelable("state");
        if (c8879 == null) {
            return;
        }
        this.f29614.m30033();
        Iterator<String> it = c8879.f29716.iterator();
        while (it.hasNext()) {
            Bundle bundleM30039 = this.f29614.m30039(it.next(), null);
            if (bundleM30039 != null) {
                Fragment fragmentM29982 = this.f29653.m29982(((C8881) bundleM30039.getParcelable("state")).f29732);
                if (fragmentM29982 != null) {
                    if (m29739(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentM29982);
                    }
                    c8882 = new C8882(this.f29625, this.f29614, fragmentM29982, bundleM30039);
                } else {
                    c8882 = new C8882(this.f29625, this.f29614, this.f29633.m15670().getClassLoader(), m29809(), bundleM30039);
                }
                Fragment fragmentM30000 = c8882.m30000();
                fragmentM30000.mSavedFragmentState = bundleM30039;
                fragmentM30000.mFragmentManager = this;
                if (m29739(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentM30000.mWho + "): " + fragmentM30000);
                }
                c8882.m30004(this.f29633.m15670().getClassLoader());
                this.f29614.m30029(c8882);
                c8882.m30009(this.f29632);
            }
        }
        for (Fragment fragment : this.f29653.m29984()) {
            if (!this.f29614.m30013(fragment.mWho)) {
                if (m29739(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + c8879.f29716);
                }
                this.f29653.m29988(fragment);
                fragment.mFragmentManager = this;
                C8882 c88822 = new C8882(this.f29625, this.f29614, fragment);
                c88822.m30009(1);
                c88822.m30002();
                fragment.mRemoving = true;
                c88822.m30002();
            }
        }
        this.f29614.m30034(c8879.f29717);
        if (c8879.f29718 != null) {
            this.f29615 = new ArrayList<>(c8879.f29718.length);
            int i = 0;
            while (true) {
                C1689[] c1689Arr = c8879.f29718;
                if (i >= c1689Arr.length) {
                    break;
                }
                C1688 c1688M4828 = c1689Arr[i].m4828(this);
                if (m29739(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + c1688M4828.f29671 + "): " + c1688M4828);
                    PrintWriter printWriter = new PrintWriter(new C5864("FragmentManager"));
                    c1688M4828.m29920("  ", printWriter, false);
                    printWriter.close();
                }
                this.f29615.add(c1688M4828);
                i++;
            }
        } else {
            this.f29615 = null;
        }
        this.f29620.set(c8879.f29719);
        String str3 = c8879.f29720;
        if (str3 != null) {
            Fragment fragmentM29793 = m29793(str3);
            this.f29636 = fragmentM29793;
            m29774(fragmentM29793);
        }
        ArrayList<String> arrayList = c8879.f29721;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.f29621.put(arrayList.get(i2), c8879.f29722.get(i2));
            }
        }
        this.f29644 = new ArrayDeque<>(c8879.f29723);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public C5085 m29866() {
        if (this.f29633 instanceof ViewModelStoreOwner) {
            m29882(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f29653.m29985();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public Parcelable m29867() {
        if (this.f29633 instanceof InterfaceC7235) {
            m29882(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle bundleM29831 = m29831();
        if (bundleM29831.isEmpty()) {
            return null;
        }
        return bundleM29831;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۨۥ()Landroid/os/Bundle; */
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Bundle m29831() {
        C1689[] c1689Arr;
        int size;
        Bundle bundle = new Bundle();
        m29798();
        m29786();
        m29789(true);
        this.f29646 = true;
        this.f29653.m29990(true);
        ArrayList<String> arrayListM30036 = this.f29614.m30036();
        HashMap<String, Bundle> mapM30024 = this.f29614.m30024();
        if (!mapM30024.isEmpty()) {
            ArrayList<String> arrayListM30037 = this.f29614.m30037();
            ArrayList<C1688> arrayList = this.f29615;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c1689Arr = null;
            } else {
                c1689Arr = new C1689[size];
                for (int i = 0; i < size; i++) {
                    c1689Arr[i] = new C1689(this.f29615.get(i));
                    if (m29739(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f29615.get(i));
                    }
                }
            }
            C8879 c8879 = new C8879();
            c8879.f29716 = arrayListM30036;
            c8879.f29717 = arrayListM30037;
            c8879.f29718 = c1689Arr;
            c8879.f29719 = this.f29620.get();
            Fragment fragment = this.f29636;
            if (fragment != null) {
                c8879.f29720 = fragment.mWho;
            }
            c8879.f29721.addAll(this.f29621.keySet());
            c8879.f29722.addAll(this.f29621.values());
            c8879.f29723 = new ArrayList<>(this.f29644);
            bundle.putParcelable("state", c8879);
            for (String str : this.f29622.keySet()) {
                bundle.putBundle(f29608 + str, this.f29622.get(str));
            }
            for (String str2 : mapM30024.keySet()) {
                bundle.putBundle(f29609 + str2, mapM30024.get(str2));
            }
        } else if (m29739(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public void m29869(@InterfaceC6391 String str) {
        m29787(new C8863(str), false);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public boolean m29870(@InterfaceC6391 ArrayList<C1688> arrayList, @InterfaceC6391 ArrayList<Boolean> arrayList2, @InterfaceC6391 String str) {
        int i;
        int iM29794 = m29794(str, -1, true);
        if (iM29794 < 0) {
            return false;
        }
        for (int i2 = iM29794; i2 < this.f29615.size(); i2++) {
            C1688 c1688 = this.f29615.get(i2);
            if (!c1688.f29807) {
                m29882(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c1688 + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = iM29794; i3 < this.f29615.size(); i3++) {
            C1688 c16882 = this.f29615.get(i3);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (AbstractC8885.C1704 c1704 : c16882.f29792) {
                Fragment fragment = c1704.f3844;
                if (fragment != null) {
                    if (!c1704.f29809 || (i = c1704.f3843) == 1 || i == 2 || i == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i4 = c1704.f3843;
                    if (i4 == 1 || i4 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb.append(" in ");
                sb.append(c16882);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                m29882(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                sb2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb2.append("fragment ");
                sb2.append(fragment2);
                m29882(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.m29802()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Fragment) it.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f29615.size() - iM29794);
        for (int i5 = iM29794; i5 < this.f29615.size(); i5++) {
            arrayList4.add(null);
        }
        C8865 c8865 = new C8865(arrayList3, arrayList4);
        for (int size = this.f29615.size() - 1; size >= iM29794; size--) {
            C1688 c1688Remove = this.f29615.remove(size);
            C1688 c16883 = new C1688(c1688Remove);
            c16883.m29917();
            arrayList4.set(size - iM29794, new C1689(c16883));
            c1688Remove.f29672 = true;
            arrayList.add(c1688Remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f29621.put(str, c8865);
        return true;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public Fragment.C8845 m29871(@InterfaceC6391 Fragment fragment) {
        C8882 c8882M30025 = this.f29614.m30025(fragment.mWho);
        if (c8882M30025 == null || !c8882M30025.m30000().equals(fragment)) {
            m29882(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return c8882M30025.m30006();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public void m29872() {
        synchronized (this.f3801) {
            try {
                if (this.f3801.size() == 1) {
                    this.f29633.m15671().removeCallbacks(this.f29655);
                    this.f29633.m15671().post(this.f29655);
                    m29884();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m29873(@InterfaceC6391 Fragment fragment, boolean z) {
        ViewGroup viewGroupM29808 = m29808(fragment);
        if (viewGroupM29808 == null || !(viewGroupM29808 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM29808).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public void m29874(@InterfaceC6391 C8876 c8876) {
        this.f29637 = c8876;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public void m29875(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Lifecycle.State state) {
        if (fragment.equals(m29793(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public void m29876(@InterfaceC6490 Fragment fragment) {
        if (fragment == null || (fragment.equals(m29793(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f29636;
            this.f29636 = fragment;
            m29774(fragment2);
            m29774(this.f29636);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public void m29877(@InterfaceC6391 InterfaceC7541 interfaceC7541) {
        this.f29639 = interfaceC7541;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public void m29878(@InterfaceC6490 C5093.C5094 c5094) {
        this.f29654 = c5094;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public final void m29879(@InterfaceC6391 Fragment fragment) {
        ViewGroup viewGroupM29808 = m29808(fragment);
        if (viewGroupM29808 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupM29808.getTag(C6884.C6885.f18208) == null) {
            viewGroupM29808.setTag(C6884.C6885.f18208, fragment);
        }
        ((Fragment) viewGroupM29808.getTag(C6884.C6885.f18208)).setPopDirection(fragment.getPopDirection());
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public void m29880(@InterfaceC6391 Fragment fragment) {
        if (m29739(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public final void m29881() {
        Iterator<C8882> it = this.f29614.m30022().iterator();
        while (it.hasNext()) {
            m29843(it.next());
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public final void m29882(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C5864("FragmentManager"));
        AbstractC5078<?> abstractC5078 = this.f29633;
        if (abstractC5078 != null) {
            try {
                abstractC5078.mo15672("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            m29785("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m29883(@InterfaceC6391 AbstractC8856 abstractC8856) {
        this.f29625.m29978(abstractC8856);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public final void m29884() {
        synchronized (this.f3801) {
            try {
                if (this.f3801.isEmpty()) {
                    this.f29619.setEnabled(m29804() > 0 && m29828(this.f29635));
                } else {
                    this.f29619.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @SuppressLint({"BanParcelableUsage"})
    public static class C8857 implements Parcelable {
        public static final Parcelable.Creator<C8857> CREATOR = new C1687();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public String f29663;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f29664;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ$ۥ */
        public class C1687 implements Parcelable.Creator<C8857> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8857 createFromParcel(Parcel parcel) {
                return new C8857(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8857[] newArray(int i) {
                return new C8857[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8857(@InterfaceC6391 String str, int i) {
            this.f29663 = str;
            this.f29664 = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f29663);
            parcel.writeInt(this.f29664);
        }

        public C8857(@InterfaceC6391 Parcel parcel) {
            this.f29663 = parcel.readString();
            this.f29664 = parcel.readInt();
        }
    }
}

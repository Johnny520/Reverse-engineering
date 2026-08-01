package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.activity.C0022;
import androidx.activity.C0023;
import androidx.appcompat.app.C0076;
import androidx.collection.C0282;
import androidx.compose.animation.core.C0325;
import androidx.core.util.InterfaceC2188;
import androidx.lifecycle.C2423;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import lin.xposed.hook.javaplugin.C5554;
import p142.C7539;
import p143.C7544;
import p143.C7545;
import p156.AbstractC7622;
import p160.C7637;
import p162.C7650;
import p162.C7656;
import p171.AbstractC7729;
import p171.C7730;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2313 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ArrayList f6765;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ArrayList f6766;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final RunnableC2350 f6767;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C2306 f6768;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ArrayDeque f6769;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C7730 f6770;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C7730 f6771;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C7730 f6772;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C2323 f6773;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C2324 f6774;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public ArrayList f6775;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f6776;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f6777;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f6778;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f6779;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f6780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ArrayList f6782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f6783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f6785;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f6787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2325 f6788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 f6789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 f6790;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2319 f6791;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC8175 f6792;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final CopyOnWriteArrayList f6793;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0076 f6794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2315 f6795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2315 f6796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C2315 f6797;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2315 f6798;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0023 f6800;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ArrayList f6802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f6786 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0325 f6784 = new C0325(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LayoutInflaterFactory2C2316 f6781 = new LayoutInflaterFactory2C2316(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0022 f6799 = new C0022(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AtomicInteger f6803 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f6804 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Map f6801 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    public AbstractC2313() {
        Collections.synchronizedMap(new HashMap());
        this.f6794 = new C0076(this);
        this.f6793 = new CopyOnWriteArrayList();
        final int i = 0;
        this.f6797 = new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2313 f6807;

            {
                this.f6807 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i2 = i;
                AbstractC2313 abstractC2313 = this.f6807;
                switch (i2) {
                    case 0:
                        if (abstractC2313.m4380()) {
                            abstractC2313.m4402(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC2313.m4380() && num.intValue() == 80) {
                            abstractC2313.m4405(false);
                            break;
                        }
                        break;
                    case 2:
                        C7650 c7650 = (C7650) obj;
                        if (abstractC2313.m4380()) {
                            boolean z = c7650.f20770;
                            abstractC2313.m4397(false);
                        }
                        break;
                    default:
                        C7656 c7656 = (C7656) obj;
                        if (abstractC2313.m4380()) {
                            boolean z2 = c7656.f20785;
                            abstractC2313.m4399(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f6798 = new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2313 f6807;

            {
                this.f6807 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i22 = i2;
                AbstractC2313 abstractC2313 = this.f6807;
                switch (i22) {
                    case 0:
                        if (abstractC2313.m4380()) {
                            abstractC2313.m4402(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC2313.m4380() && num.intValue() == 80) {
                            abstractC2313.m4405(false);
                            break;
                        }
                        break;
                    case 2:
                        C7650 c7650 = (C7650) obj;
                        if (abstractC2313.m4380()) {
                            boolean z = c7650.f20770;
                            abstractC2313.m4397(false);
                        }
                        break;
                    default:
                        C7656 c7656 = (C7656) obj;
                        if (abstractC2313.m4380()) {
                            boolean z2 = c7656.f20785;
                            abstractC2313.m4399(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f6795 = new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2313 f6807;

            {
                this.f6807 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i22 = i3;
                AbstractC2313 abstractC2313 = this.f6807;
                switch (i22) {
                    case 0:
                        if (abstractC2313.m4380()) {
                            abstractC2313.m4402(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC2313.m4380() && num.intValue() == 80) {
                            abstractC2313.m4405(false);
                            break;
                        }
                        break;
                    case 2:
                        C7650 c7650 = (C7650) obj;
                        if (abstractC2313.m4380()) {
                            boolean z = c7650.f20770;
                            abstractC2313.m4397(false);
                        }
                        break;
                    default:
                        C7656 c7656 = (C7656) obj;
                        if (abstractC2313.m4380()) {
                            boolean z2 = c7656.f20785;
                            abstractC2313.m4399(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f6796 = new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2313 f6807;

            {
                this.f6807 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i22 = i4;
                AbstractC2313 abstractC2313 = this.f6807;
                switch (i22) {
                    case 0:
                        if (abstractC2313.m4380()) {
                            abstractC2313.m4402(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC2313.m4380() && num.intValue() == 80) {
                            abstractC2313.m4405(false);
                            break;
                        }
                        break;
                    case 2:
                        C7650 c7650 = (C7650) obj;
                        if (abstractC2313.m4380()) {
                            boolean z = c7650.f20770;
                            abstractC2313.m4397(false);
                        }
                        break;
                    default:
                        C7656 c7656 = (C7656) obj;
                        if (abstractC2313.m4380()) {
                            boolean z2 = c7656.f20785;
                            abstractC2313.m4399(false);
                        }
                        break;
                }
            }
        };
        this.f6788 = new C2325(this);
        this.f6787 = -1;
        this.f6774 = new C2324(this);
        this.f6773 = new C2323();
        this.f6769 = new ArrayDeque();
        this.f6767 = new RunnableC2350(this, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m4359(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (abstractComponentCallbacksC2338 == null) {
            return true;
        }
        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6898;
        return abstractComponentCallbacksC2338 == abstractC2313.f6790 && m4359(abstractC2313.f6789);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m4360(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (abstractComponentCallbacksC2338 == null) {
            return true;
        }
        if (abstractComponentCallbacksC2338.f6880) {
            return abstractComponentCallbacksC2338.f6898 == null || m4360(abstractComponentCallbacksC2338.f6895);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m4361(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        abstractComponentCallbacksC2338.getClass();
        boolean zM4361 = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 : abstractComponentCallbacksC2338.f6896.f6784.m968()) {
            if (abstractComponentCallbacksC23382 != null) {
                zM4361 = m4361(abstractComponentCallbacksC23382);
            }
            if (zM4361) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m4362(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m4363(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4362(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6887) {
            abstractComponentCallbacksC2338.f6887 = false;
            abstractComponentCallbacksC2338.f6916 = !abstractComponentCallbacksC2338.f6916;
        }
    }

    public void addFragmentOnAttachListener(InterfaceC2305 interfaceC2305) {
        this.f6793.add(interfaceC2305);
    }

    public void addOnBackStackChangedListener(InterfaceC2312 interfaceC2312) {
        if (this.f6802 == null) {
            this.f6802 = new ArrayList();
        }
        this.f6802.add(interfaceC2312);
    }

    public void removeFragmentOnAttachListener(InterfaceC2305 interfaceC2305) {
        this.f6793.remove(interfaceC2305);
    }

    public void removeOnBackStackChangedListener(InterfaceC2312 interfaceC2312) {
        ArrayList arrayList = this.f6802;
        if (arrayList != null) {
            arrayList.remove(interfaceC2312);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6789;
        if (abstractComponentCallbacksC2338 != null) {
            sb.append(abstractComponentCallbacksC2338.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f6789)));
            sb.append("}");
        } else {
            C2319 c2319 = this.f6791;
            if (c2319 != null) {
                sb.append(c2319.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f6791)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Bundle m4364() {
        int i;
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = m4385().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2349 c2349 = (C2349) it.next();
            if (c2349.f6953) {
                if (m4362(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c2349.f6953 = false;
                c2349.m4470();
            }
        }
        Iterator it2 = m4385().iterator();
        while (it2.hasNext()) {
            ((C2349) it2.next()).m4468();
        }
        m4379(true);
        this.f6779 = true;
        this.f6768.f6763 = true;
        C0325 c0325 = this.f6784;
        c0325.getClass();
        HashMap map = (HashMap) c0325.f1096;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C2304 c2304 : map.values()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6754;
                String str = abstractComponentCallbacksC2338.f6901;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6754;
                if (abstractComponentCallbacksC23382.f6909 == -1 && (bundle = abstractComponentCallbacksC23382.f6907) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new FragmentState(abstractComponentCallbacksC23382));
                if (abstractComponentCallbacksC23382.f6909 > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC23382.mo4451(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c2304.f6756.m267(false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC23382.f6912.m12757(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM4364 = abstractComponentCallbacksC23382.f6896.m4364();
                    if (!bundleM4364.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM4364);
                    }
                    if (abstractComponentCallbacksC23382.f6881 != null) {
                        c2304.m4340();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC23382.f6908;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC23382.f6902;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC23382.f6905;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c0325.m996(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC2338.f6901);
                if (m4362(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC2338 + ": " + abstractComponentCallbacksC2338.f6907);
                }
            }
        }
        HashMap map2 = (HashMap) this.f6784.f1094;
        if (!map2.isEmpty()) {
            C0325 c03252 = this.f6784;
            synchronized (((ArrayList) c03252.f1095)) {
                try {
                    if (((ArrayList) c03252.f1095).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c03252.f1095).size());
                        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 : (ArrayList) c03252.f1095) {
                            arrayList.add(abstractComponentCallbacksC23383.f6901);
                            if (m4362(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC23383.f6901 + "): " + abstractComponentCallbacksC23383);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f6783;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((C2332) this.f6783.get(i));
                    if (m4362(2)) {
                        StringBuilder sbM150 = AbstractC0053.m150(i, "saveAllState: adding back stack #", ": ");
                        sbM150.append(this.f6783.get(i));
                        Log.v("FragmentManager", sbM150.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f6728 = null;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.f6731 = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            fragmentManagerState.f6732 = arrayList5;
            fragmentManagerState.f6735 = arrayList2;
            fragmentManagerState.f6733 = arrayList;
            fragmentManagerState.f6734 = backStackRecordStateArr;
            fragmentManagerState.f6729 = this.f6803.get();
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23384 = this.f6790;
            if (abstractComponentCallbacksC23384 != null) {
                fragmentManagerState.f6728 = abstractComponentCallbacksC23384.f6901;
            }
            arrayList4.addAll(this.f6804.keySet());
            arrayList5.addAll(this.f6804.values());
            fragmentManagerState.f6730 = new ArrayList(this.f6769);
            bundle2.putParcelable("state", fragmentManagerState);
            for (String str2 : this.f6801.keySet()) {
                bundle2.putBundle(AbstractC0053.m157("result_", str2), (Bundle) this.f6801.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(AbstractC0053.m157("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (m4362(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m4365() {
        synchronized (this.f6786) {
            try {
                if (this.f6786.size() == 1) {
                    this.f6791.f6819.removeCallbacks(this.f6767);
                    this.f6791.f6819.post(this.f6767);
                    m4408();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m4366(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4362(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC2338 + " nesting=" + abstractComponentCallbacksC2338.f6899);
        }
        boolean zM4453 = abstractComponentCallbacksC2338.m4453();
        if (abstractComponentCallbacksC2338.f6883 && zM4453) {
            return;
        }
        C0325 c0325 = this.f6784;
        synchronized (((ArrayList) c0325.f1095)) {
            ((ArrayList) c0325.f1095).remove(abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6893 = false;
        if (m4361(abstractComponentCallbacksC2338)) {
            this.f6780 = true;
        }
        abstractComponentCallbacksC2338.f6892 = true;
        m4414(abstractComponentCallbacksC2338);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean m4367(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f6783;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f6783.size() - 1;
            } else {
                int size2 = this.f6783.size() - 1;
                while (size2 >= 0) {
                    C2332 c2332 = (C2332) this.f6783.get(size2);
                    if (i >= 0 && i == c2332.f6848) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C2332 c23322 = (C2332) this.f6783.get(size - 1);
                        if (i < 0 || i != c23322.f6848) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f6783.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f6783.size() - 1; size3 >= size; size3--) {
            arrayList.add((C2332) this.f6783.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m4368(Bundle bundle) {
        C0076 c0076;
        int i;
        boolean z;
        int i2;
        C2304 c2304;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f6791.f6816.getClassLoader());
                this.f6801.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f6791.f6816.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C0325 c0325 = this.f6784;
        HashMap map2 = (HashMap) c0325.f1094;
        HashMap map3 = (HashMap) c0325.f1096;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.f6735.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0076 = this.f6794;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM996 = c0325.m996((String) it.next(), null);
            if (bundleM996 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) this.f6768.f6762.get(((FragmentState) bundleM996.getParcelable("state")).f6747);
                if (abstractComponentCallbacksC2338 != null) {
                    if (m4362(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC2338);
                    }
                    c2304 = new C2304(c0076, c0325, abstractComponentCallbacksC2338, bundleM996);
                } else {
                    c2304 = new C2304(this.f6794, this.f6784, this.f6791.f6816.getClassLoader(), m4383(), bundleM996);
                }
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6754;
                abstractComponentCallbacksC23382.f6907 = bundleM996;
                abstractComponentCallbacksC23382.f6898 = this;
                if (m4362(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC23382.f6901 + "): " + abstractComponentCallbacksC23382);
                }
                c2304.m4338(this.f6791.f6816.getClassLoader());
                c0325.m957(c2304);
                c2304.f6752 = this.f6787;
            }
        }
        C2306 c2306 = this.f6768;
        c2306.getClass();
        Iterator it2 = new ArrayList(c2306.f6762.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 = (AbstractComponentCallbacksC2338) it2.next();
            if (map3.get(abstractComponentCallbacksC23383.f6901) == null) {
                if (m4362(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC23383 + " that was not found in the set of active Fragments " + fragmentManagerState.f6735);
                }
                this.f6768.m4349(abstractComponentCallbacksC23383);
                abstractComponentCallbacksC23383.f6898 = this;
                C2304 c23042 = new C2304(c0076, c0325, abstractComponentCallbacksC23383);
                c23042.f6752 = 1;
                c23042.m4344();
                abstractComponentCallbacksC23383.f6892 = true;
                c23042.m4344();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f6733;
        ((ArrayList) c0325.f1095).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M976 = c0325.m976(str3);
                if (abstractComponentCallbacksC2338M976 == null) {
                    C5925.m11311(AbstractC0053.m158("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (m4362(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC2338M976);
                }
                c0325.m972(abstractComponentCallbacksC2338M976);
            }
        }
        if (fragmentManagerState.f6734 != null) {
            this.f6783 = new ArrayList(fragmentManagerState.f6734.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f6734;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                ArrayList arrayList2 = backStackRecordState.f6716;
                C2332 c2332 = new C2332(this);
                int[] iArr = backStackRecordState.f6718;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    C2356 c2356 = new C2356();
                    int i6 = i4 + 1;
                    int i7 = i;
                    c2356.f6974 = iArr[i4];
                    if (m4362(i7)) {
                        Log.v("FragmentManager", "Instantiate " + c2332 + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    c2356.f6975 = Lifecycle$State.values()[backStackRecordState.f6717[i5]];
                    c2356.f6977 = Lifecycle$State.values()[backStackRecordState.f6711[i5]];
                    int i8 = i4 + 2;
                    c2356.f6972 = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    c2356.f6971 = i9;
                    int i10 = iArr[i4 + 3];
                    c2356.f6970 = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    c2356.f6969 = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    c2356.f6976 = i13;
                    c2332.f6846 = i9;
                    c2332.f6845 = i10;
                    c2332.f6844 = i12;
                    c2332.f6843 = i13;
                    c2332.m4430(c2356);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                c2332.f6842 = backStackRecordState.f6710;
                c2332.f6859 = backStackRecordState.f6714;
                c2332.f6856 = true;
                c2332.f6860 = backStackRecordState.f6712;
                c2332.f6857 = backStackRecordState.f6713;
                c2332.f6858 = backStackRecordState.f6709;
                c2332.f6850 = backStackRecordState.f6708;
                c2332.f6849 = backStackRecordState.f6707;
                c2332.f6853 = backStackRecordState.f6706;
                c2332.f6854 = backStackRecordState.f6705;
                c2332.f6848 = backStackRecordState.f6715;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((C2356) c2332.f6847.get(i15)).f6973 = c0325.m976(str4);
                    }
                }
                c2332.m4429(1);
                if (m4362(i14)) {
                    StringBuilder sbM150 = AbstractC0053.m150(i3, "restoreAllState: back stack #", " (index ");
                    sbM150.append(c2332.f6848);
                    sbM150.append("): ");
                    sbM150.append(c2332);
                    Log.v("FragmentManager", sbM150.toString());
                    PrintWriter printWriter = new PrintWriter(new C2359());
                    c2332.m4426(printWriter, "  ", false);
                    printWriter.close();
                }
                this.f6783.add(c2332);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f6783 = null;
        }
        this.f6803.set(fragmentManagerState.f6729);
        String str5 = fragmentManagerState.f6728;
        if (str5 != null) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M9762 = c0325.m976(str5);
            this.f6790 = abstractComponentCallbacksC2338M9762;
            m4398(abstractComponentCallbacksC2338M9762);
        }
        ArrayList arrayList3 = fragmentManagerState.f6731;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.f6804.put((String) arrayList3.get(i16), (BackStackState) fragmentManagerState.f6732.get(i16));
            }
        }
        this.f6769 = new ArrayDeque(fragmentManagerState.f6730);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m4369(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            C5925.m11311("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C2332) arrayList.get(i)).f6854) {
                if (i2 != i) {
                    m4377(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C2332) arrayList.get(i2)).f6854) {
                        i2++;
                    }
                }
                m4377(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m4377(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m4370() {
        return m4371(-1, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean m4371(int i, int i2) {
        m4379(false);
        m4393(true);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6790;
        if (abstractComponentCallbacksC2338 != null && i < 0 && abstractComponentCallbacksC2338.m4442().m4370()) {
            return true;
        }
        boolean zM4367 = m4367(this.f6775, this.f6766, i, i2);
        if (zM4367) {
            this.f6785 = true;
            try {
                m4369(this.f6775, this.f6766);
            } finally {
                m4386();
            }
        }
        m4408();
        m4394();
        ((HashMap) this.f6784.f1096).values().removeAll(Collections.singleton(null));
        return zM4367;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m4372() {
        if (this.f6791 == null) {
            return;
        }
        this.f6779 = false;
        this.f6778 = false;
        this.f6768.f6763 = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
            if (abstractComponentCallbacksC2338 != null) {
                abstractComponentCallbacksC2338.f6896.m4372();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m4373(int i, boolean z) {
        C2319 c2319;
        if (this.f6791 == null && i != -1) {
            C5925.m11311("No activity");
            return;
        }
        if (z || i != this.f6787) {
            this.f6787 = i;
            C0325 c0325 = this.f6784;
            HashMap map = (HashMap) c0325.f1096;
            Iterator it = ((ArrayList) c0325.f1095).iterator();
            while (it.hasNext()) {
                C2304 c2304 = (C2304) map.get(((AbstractComponentCallbacksC2338) it.next()).f6901);
                if (c2304 != null) {
                    c2304.m4344();
                }
            }
            for (C2304 c23042 : map.values()) {
                if (c23042 != null) {
                    c23042.m4344();
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c23042.f6754;
                    if (abstractComponentCallbacksC2338.f6892 && !abstractComponentCallbacksC2338.m4453()) {
                        c0325.m958(c23042);
                    }
                }
            }
            m4412();
            if (this.f6780 && (c2319 = this.f6791) != null && this.f6787 == 7) {
                c2319.f6818.invalidateMenu();
                this.f6780 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ViewGroup m4374(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        ViewGroup viewGroup = abstractComponentCallbacksC2338.f6882;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC2338.f6885 <= 0 || !this.f6792.mo4416()) {
            return null;
        }
        View viewMo4417 = this.f6792.mo4417(abstractComponentCallbacksC2338.f6885);
        if (viewMo4417 instanceof ViewGroup) {
            return (ViewGroup) viewMo4417;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 m4375(String str) {
        C0325 c0325 = this.f6784;
        ArrayList arrayList = (ArrayList) c0325.f1095;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) arrayList.get(size);
                if (abstractComponentCallbacksC2338 != null && str.equals(abstractComponentCallbacksC2338.f6888)) {
                    return abstractComponentCallbacksC2338;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C2304 c2304 : ((HashMap) c0325.f1096).values()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6754;
                if (str.equals(abstractComponentCallbacksC23382.f6888)) {
                    return abstractComponentCallbacksC23382;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 m4376(int i) {
        C0325 c0325 = this.f6784;
        ArrayList arrayList = (ArrayList) c0325.f1095;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) arrayList.get(size);
            if (abstractComponentCallbacksC2338 != null && abstractComponentCallbacksC2338.f6886 == i) {
                return abstractComponentCallbacksC2338;
            }
        }
        for (C2304 c2304 : ((HashMap) c0325.f1096).values()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6754;
                if (abstractComponentCallbacksC23382.f6886 == i) {
                    return abstractComponentCallbacksC23382;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x022c A[PHI: r14
  0x022c: PHI (r14v21 int) = (r14v20 int), (r14v22 int) binds: [B:104:0x021c, B:109:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4377(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC2313.m4377(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m4378(C2332 c2332, boolean z) {
        if (z && (this.f6791 == null || this.f6777)) {
            return;
        }
        m4393(z);
        c2332.mo4358(this.f6775, this.f6766);
        this.f6785 = true;
        try {
            m4369(this.f6775, this.f6766);
            m4386();
            m4408();
            m4394();
            ((HashMap) this.f6784.f1096).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m4386();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m4379(boolean z) {
        boolean zMo4358;
        ArrayList arrayList;
        m4393(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.f6775;
            ArrayList arrayList3 = this.f6766;
            synchronized (this.f6786) {
                if (this.f6786.isEmpty()) {
                    zMo4358 = false;
                } else {
                    try {
                        int size = this.f6786.size();
                        int i = 0;
                        zMo4358 = false;
                        while (true) {
                            arrayList = this.f6786;
                            if (i >= size) {
                                break;
                            }
                            zMo4358 |= ((InterfaceC2311) arrayList.get(i)).mo4358(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.f6791.f6819.removeCallbacks(this.f6767);
                    } finally {
                    }
                }
            }
            if (!zMo4358) {
                m4408();
                m4394();
                ((HashMap) this.f6784.f1096).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.f6785 = true;
            try {
                m4369(this.f6775, this.f6766);
            } finally {
                m4386();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final boolean m4380() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6789;
        if (abstractComponentCallbacksC2338 == null) {
            return true;
        }
        return abstractComponentCallbacksC2338.m4460() && this.f6789.m4459().m4380();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m4381(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4362(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6887) {
            return;
        }
        abstractComponentCallbacksC2338.f6887 = true;
        abstractComponentCallbacksC2338.f6916 = true ^ abstractComponentCallbacksC2338.f6916;
        m4414(abstractComponentCallbacksC2338);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C2323 m4382() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6789;
        return abstractComponentCallbacksC2338 != null ? abstractComponentCallbacksC2338.f6898.m4382() : this.f6773;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C2324 m4383() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6789;
        return abstractComponentCallbacksC2338 != null ? abstractComponentCallbacksC2338.f6898.m4383() : this.f6774;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2304 m4384(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        String str = abstractComponentCallbacksC2338.f6901;
        C0325 c0325 = this.f6784;
        C2304 c2304 = (C2304) ((HashMap) c0325.f1096).get(str);
        if (c2304 != null) {
            return c2304;
        }
        C2304 c23042 = new C2304(this.f6794, c0325, abstractComponentCallbacksC2338);
        c23042.m4338(this.f6791.f6816.getClassLoader());
        c23042.f6752 = this.f6787;
        return c23042;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashSet m4385() {
        C2349 c2349;
        HashSet hashSet = new HashSet();
        Iterator it = this.f6784.m965().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C2304) it.next()).f6754.f6882;
            if (viewGroup != null) {
                m4382().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C2349) {
                    c2349 = (C2349) tag;
                } else {
                    c2349 = new C2349(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c2349);
                }
                hashSet.add(c2349);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4386() {
        this.f6785 = false;
        this.f6766.clear();
        this.f6775.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4387(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4362(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6883) {
            abstractComponentCallbacksC2338.f6883 = false;
            if (abstractComponentCallbacksC2338.f6893) {
                return;
            }
            this.f6784.m972(abstractComponentCallbacksC2338);
            if (m4362(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC2338);
            }
            if (m4361(abstractComponentCallbacksC2338)) {
                this.f6780 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4388(C2319 c2319, AbstractC8175 abstractC8175, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (this.f6791 != null) {
            C5925.m11311("Already attached");
            return;
        }
        this.f6791 = c2319;
        this.f6792 = abstractC8175;
        this.f6789 = abstractComponentCallbacksC2338;
        if (abstractComponentCallbacksC2338 != null) {
            addFragmentOnAttachListener(new C2322(abstractComponentCallbacksC2338));
        } else if (c2319 != null) {
            addFragmentOnAttachListener(c2319);
        }
        if (this.f6789 != null) {
            m4408();
        }
        if (c2319 != null) {
            C0023 onBackPressedDispatcher = c2319.f6818.getOnBackPressedDispatcher();
            this.f6800 = onBackPressedDispatcher;
            onBackPressedDispatcher.m28(this.f6799, abstractComponentCallbacksC2338 != null ? abstractComponentCallbacksC2338 : c2319);
        }
        int i = 0;
        if (abstractComponentCallbacksC2338 != null) {
            C2306 c2306 = abstractComponentCallbacksC2338.f6898.f6768;
            HashMap map = c2306.f6761;
            C2306 c23062 = (C2306) map.get(abstractComponentCallbacksC2338.f6901);
            if (c23062 == null) {
                c23062 = new C2306(c2306.f6759);
                map.put(abstractComponentCallbacksC2338.f6901, c23062);
            }
            this.f6768 = c23062;
        } else if (c2319 != null) {
            C2423 viewModelStore = c2319.f6818.getViewModelStore();
            viewModelStore.getClass();
            C7637 c7637 = C7637.f20725;
            c7637.getClass();
            C0325 c0325 = new C0325(viewModelStore, C2306.f6757, c7637);
            InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C2306.class);
            String strMo8885 = interfaceC5093Mo8917.mo8885();
            if (strMo8885 == null) {
                C5925.m11310("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.f6768 = (C2306) c0325.m959("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8885), interfaceC5093Mo8917);
        } else {
            this.f6768 = new C2306(false);
        }
        C2306 c23063 = this.f6768;
        int i2 = 1;
        c23063.f6763 = this.f6779 || this.f6778;
        this.f6784.f1093 = c23063;
        C2319 c23192 = this.f6791;
        if (c23192 != null && abstractComponentCallbacksC2338 == null) {
            C7539 savedStateRegistry = c23192.f6818.getSavedStateRegistry();
            savedStateRegistry.m12761("android:support:fragments", new C2335((C2309) this, i2));
            Bundle bundleM12763 = savedStateRegistry.m12763("android:support:fragments");
            if (bundleM12763 != null) {
                m4368(bundleM12763);
            }
        }
        C2319 c23193 = this.f6791;
        if (c23193 != null) {
            AbstractC7729 activityResultRegistry = c23193.f6818.getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(abstractComponentCallbacksC2338 != null ? AbstractC0053.m151(new StringBuilder(), abstractComponentCallbacksC2338.f6901, ":") : "");
            int i3 = 2;
            C2309 c2309 = (C2309) this;
            this.f6772 = activityResultRegistry.m13046(strConcat.concat("StartActivityForResult"), new C2321(i3), new C2326(c2309, i2));
            this.f6771 = activityResultRegistry.m13046(strConcat.concat("StartIntentSenderForResult"), new C2321(i), new C2326(c2309, i3));
            this.f6770 = activityResultRegistry.m13046(strConcat.concat("RequestPermissions"), new C2321(i2), new C2326(c2309, i));
        }
        C2319 c23194 = this.f6791;
        if (c23194 != null) {
            c23194.addOnConfigurationChangedListener(this.f6797);
        }
        C2319 c23195 = this.f6791;
        if (c23195 != null) {
            c23195.f6818.addOnTrimMemoryListener(this.f6798);
        }
        C2319 c23196 = this.f6791;
        if (c23196 != null) {
            c23196.f6818.addOnMultiWindowModeChangedListener(this.f6795);
        }
        C2319 c23197 = this.f6791;
        if (c23197 != null) {
            c23197.f6818.addOnPictureInPictureModeChangedListener(this.f6796);
        }
        C2319 c23198 = this.f6791;
        if (c23198 == null || abstractComponentCallbacksC2338 != null) {
            return;
        }
        c23198.f6818.addMenuProvider(this.f6788);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2304 m4389(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        String str = abstractComponentCallbacksC2338.f6921;
        if (str != null) {
            AbstractC7622.m12854(abstractComponentCallbacksC2338, str);
        }
        if (m4362(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC2338);
        }
        C2304 c2304M4384 = m4384(abstractComponentCallbacksC2338);
        abstractComponentCallbacksC2338.f6898 = this;
        C0325 c0325 = this.f6784;
        c0325.m957(c2304M4384);
        if (!abstractComponentCallbacksC2338.f6883) {
            c0325.m972(abstractComponentCallbacksC2338);
            abstractComponentCallbacksC2338.f6892 = false;
            if (abstractComponentCallbacksC2338.f6881 == null) {
                abstractComponentCallbacksC2338.f6916 = false;
            }
            if (m4361(abstractComponentCallbacksC2338)) {
                this.f6780 = true;
            }
        }
        return c2304M4384;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m4390(int i) {
        try {
            this.f6785 = true;
            for (C2304 c2304 : ((HashMap) this.f6784.f1096).values()) {
                if (c2304 != null) {
                    c2304.f6752 = i;
                }
            }
            m4373(i, false);
            Iterator it = m4385().iterator();
            while (it.hasNext()) {
                ((C2349) it.next()).m4468();
            }
            this.f6785 = false;
            m4379(true);
        } catch (Throwable th) {
            this.f6785 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m4391() {
        if (this.f6787 < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
            if (abstractComponentCallbacksC2338 != null && m4360(abstractComponentCallbacksC2338)) {
                if (!abstractComponentCallbacksC2338.f6887 ? abstractComponentCallbacksC2338.f6896.m4391() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m4392(InterfaceC2311 interfaceC2311, boolean z) {
        if (!z) {
            if (this.f6791 == null) {
                if (this.f6777) {
                    C5925.m11311("FragmentManager has been destroyed");
                    return;
                } else {
                    C5925.m11311("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.f6779 || this.f6778) {
                C5925.m11311("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f6786) {
            try {
                if (this.f6791 == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f6786.add(interfaceC2311);
                    m4365();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m4393(boolean z) {
        if (this.f6785) {
            C5925.m11311("FragmentManager is already executing transactions");
            return;
        }
        if (this.f6791 == null) {
            if (this.f6777) {
                C5925.m11311("FragmentManager has been destroyed");
                return;
            } else {
                C5925.m11311("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f6791.f6819.getLooper()) {
            C5925.m11311("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.f6779 || this.f6778)) {
            C5925.m11311("Can not perform this action after onSaveInstanceState");
        } else if (this.f6775 == null) {
            this.f6775 = new ArrayList();
            this.f6766 = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m4394() {
        if (this.f6776) {
            this.f6776 = false;
            m4412();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m4395(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strM136 = AbstractC0053.m136(str, "    ");
        C0325 c0325 = this.f6784;
        ArrayList arrayList = (ArrayList) c0325.f1095;
        String strM1362 = AbstractC0053.m136(str, "    ");
        HashMap map = (HashMap) c0325.f1096;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2304 c2304 : map.values()) {
                printWriter.print(str);
                if (c2304 != null) {
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6754;
                    printWriter.println(abstractComponentCallbacksC2338);
                    abstractComponentCallbacksC2338.getClass();
                    printWriter.print(strM1362);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC2338.f6886));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC2338.f6885));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC2338.f6888);
                    printWriter.print(strM1362);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC2338.f6909);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC2338.f6901);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC2338.f6899);
                    printWriter.print(strM1362);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC2338.f6893);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC2338.f6892);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC2338.f6891);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC2338.f6890);
                    printWriter.print(strM1362);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC2338.f6887);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC2338.f6883);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC2338.f6880);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strM1362);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC2338.f6884);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC2338.f6878);
                    if (abstractComponentCallbacksC2338.f6898 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC2338.f6898);
                    }
                    if (abstractComponentCallbacksC2338.f6897 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC2338.f6897);
                    }
                    if (abstractComponentCallbacksC2338.f6895 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC2338.f6895);
                    }
                    if (abstractComponentCallbacksC2338.f6905 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC2338.f6905);
                    }
                    if (abstractComponentCallbacksC2338.f6907 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC2338.f6907);
                    }
                    if (abstractComponentCallbacksC2338.f6908 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC2338.f6908);
                    }
                    if (abstractComponentCallbacksC2338.f6902 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC2338.f6902);
                    }
                    Object objM976 = abstractComponentCallbacksC2338.f6906;
                    if (objM976 == null) {
                        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6898;
                        objM976 = (abstractC2313 == null || (str2 = abstractComponentCallbacksC2338.f6903) == null) ? null : abstractC2313.f6784.m976(str2);
                    }
                    if (objM976 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mTarget=");
                        printWriter.print(objM976);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC2338.f6904);
                    }
                    printWriter.print(strM1362);
                    printWriter.print("mPopDirection=");
                    C2334 c2334 = abstractComponentCallbacksC2338.f6917;
                    printWriter.println(c2334 == null ? false : c2334.f6866);
                    C2334 c23342 = abstractComponentCallbacksC2338.f6917;
                    if ((c23342 == null ? 0 : c23342.f6865) != 0) {
                        printWriter.print(strM1362);
                        printWriter.print("getEnterAnim=");
                        C2334 c23343 = abstractComponentCallbacksC2338.f6917;
                        printWriter.println(c23343 == null ? 0 : c23343.f6865);
                    }
                    C2334 c23344 = abstractComponentCallbacksC2338.f6917;
                    if ((c23344 == null ? 0 : c23344.f6864) != 0) {
                        printWriter.print(strM1362);
                        printWriter.print("getExitAnim=");
                        C2334 c23345 = abstractComponentCallbacksC2338.f6917;
                        printWriter.println(c23345 == null ? 0 : c23345.f6864);
                    }
                    C2334 c23346 = abstractComponentCallbacksC2338.f6917;
                    if ((c23346 == null ? 0 : c23346.f6863) != 0) {
                        printWriter.print(strM1362);
                        printWriter.print("getPopEnterAnim=");
                        C2334 c23347 = abstractComponentCallbacksC2338.f6917;
                        printWriter.println(c23347 == null ? 0 : c23347.f6863);
                    }
                    C2334 c23348 = abstractComponentCallbacksC2338.f6917;
                    if ((c23348 == null ? 0 : c23348.f6862) != 0) {
                        printWriter.print(strM1362);
                        printWriter.print("getPopExitAnim=");
                        C2334 c23349 = abstractComponentCallbacksC2338.f6917;
                        printWriter.println(c23349 == null ? 0 : c23349.f6862);
                    }
                    if (abstractComponentCallbacksC2338.f6882 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC2338.f6882);
                    }
                    if (abstractComponentCallbacksC2338.f6881 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC2338.f6881);
                    }
                    if (abstractComponentCallbacksC2338.m4441() != null) {
                        C2423 viewModelStore = abstractComponentCallbacksC2338.getViewModelStore();
                        C7545 c7545 = C7544.f20425;
                        viewModelStore.getClass();
                        C7637 c7637 = C7637.f20725;
                        c7637.getClass();
                        C0325 c03252 = new C0325(viewModelStore, c7545, c7637);
                        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C7544.class);
                        String strMo8885 = interfaceC5093Mo8917.mo8885();
                        if (strMo8885 == null) {
                            C5925.m11310("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                        C0282 c0282 = ((C7544) c03252.m959("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8885), interfaceC5093Mo8917)).f20426;
                        if (c0282.f991 > 0) {
                            printWriter.print(strM1362);
                            printWriter.println("Loaders:");
                            if (c0282.f991 > 0) {
                                if (c0282.m857(0) != null) {
                                    C2942.m6394();
                                    return;
                                }
                                printWriter.print(strM1362);
                                printWriter.print("  #");
                                printWriter.print(c0282.f992[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strM1362);
                    printWriter.println("Child " + abstractComponentCallbacksC2338.f6896 + ":");
                    abstractComponentCallbacksC2338.f6896.m4395(strM1362.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = (AbstractComponentCallbacksC2338) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC23382.toString());
            }
        }
        ArrayList arrayList2 = this.f6782;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 = (AbstractComponentCallbacksC2338) this.f6782.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC23383.toString());
            }
        }
        ArrayList arrayList3 = this.f6783;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C2332 c2332 = (C2332) this.f6783.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c2332.toString());
                c2332.m4426(printWriter, strM136, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f6803.get());
        synchronized (this.f6786) {
            try {
                int size4 = this.f6786.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC2311) this.f6786.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
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
        printWriter.println(this.f6791);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f6792);
        if (this.f6789 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f6789);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f6787);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f6779);
        printWriter.print(" mStopped=");
        printWriter.print(this.f6778);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f6777);
        if (this.f6780) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f6780);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4396() {
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m968()) {
            if (abstractComponentCallbacksC2338 != null) {
                abstractComponentCallbacksC2338.m4461();
                abstractComponentCallbacksC2338.f6896.m4396();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4397(boolean z) {
        if (z && this.f6791 != null) {
            m4409(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
            if (abstractComponentCallbacksC2338 != null && z) {
                abstractComponentCallbacksC2338.f6896.m4397(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4398(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (abstractComponentCallbacksC2338 != null) {
            if (abstractComponentCallbacksC2338 != this.f6784.m976(abstractComponentCallbacksC2338.f6901)) {
                return;
            }
            abstractComponentCallbacksC2338.f6898.getClass();
            boolean zM4359 = m4359(abstractComponentCallbacksC2338);
            Boolean bool = abstractComponentCallbacksC2338.f6894;
            if (bool == null || bool.booleanValue() != zM4359) {
                abstractComponentCallbacksC2338.f6894 = Boolean.valueOf(zM4359);
                C2309 c2309 = abstractComponentCallbacksC2338.f6896;
                c2309.m4408();
                c2309.m4398(c2309.f6790);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m4399(boolean z) {
        if (z && this.f6791 != null) {
            m4409(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
            if (abstractComponentCallbacksC2338 != null && z) {
                abstractComponentCallbacksC2338.f6896.m4399(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m4400() {
        if (this.f6787 >= 1) {
            for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
                if (abstractComponentCallbacksC2338 != null) {
                    if (!abstractComponentCallbacksC2338.f6887 ? abstractComponentCallbacksC2338.f6896.m4400() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4401() {
        if (this.f6787 < 1) {
            return;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
            if (abstractComponentCallbacksC2338 != null && !abstractComponentCallbacksC2338.f6887) {
                abstractComponentCallbacksC2338.f6896.m4401();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4402(boolean z) {
        if (z && this.f6791 != null) {
            m4409(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
            if (abstractComponentCallbacksC2338 != null) {
                abstractComponentCallbacksC2338.f6879 = true;
                if (z) {
                    abstractComponentCallbacksC2338.f6896.m4402(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4403(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4362(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6883) {
            return;
        }
        abstractComponentCallbacksC2338.f6883 = true;
        if (abstractComponentCallbacksC2338.f6893) {
            if (m4362(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC2338);
            }
            C0325 c0325 = this.f6784;
            synchronized (((ArrayList) c0325.f1095)) {
                ((ArrayList) c0325.f1095).remove(abstractComponentCallbacksC2338);
            }
            abstractComponentCallbacksC2338.f6893 = false;
            if (m4361(abstractComponentCallbacksC2338)) {
                this.f6780 = true;
            }
            m4414(abstractComponentCallbacksC2338);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4404() {
        boolean zIsChangingConfigurations = true;
        this.f6777 = true;
        m4379(true);
        Iterator it = m4385().iterator();
        while (it.hasNext()) {
            ((C2349) it.next()).m4468();
        }
        C2319 c2319 = this.f6791;
        C0325 c0325 = this.f6784;
        if (c2319 != null) {
            zIsChangingConfigurations = ((C2306) c0325.f1093).f6758;
        } else {
            FragmentActivity fragmentActivity = c2319.f6816;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f6804.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((BackStackState) it2.next()).f6720) {
                    C2306 c2306 = (C2306) c0325.f1093;
                    c2306.getClass();
                    if (m4362(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c2306.m4350(str);
                }
            }
        }
        m4390(-1);
        C2319 c23192 = this.f6791;
        if (c23192 != null) {
            c23192.f6818.removeOnTrimMemoryListener(this.f6798);
        }
        C2319 c23193 = this.f6791;
        if (c23193 != null) {
            c23193.removeOnConfigurationChangedListener(this.f6797);
        }
        C2319 c23194 = this.f6791;
        if (c23194 != null) {
            c23194.f6818.removeOnMultiWindowModeChangedListener(this.f6795);
        }
        C2319 c23195 = this.f6791;
        if (c23195 != null) {
            c23195.f6818.removeOnPictureInPictureModeChangedListener(this.f6796);
        }
        C2319 c23196 = this.f6791;
        if (c23196 != null && this.f6789 == null) {
            c23196.f6818.removeMenuProvider(this.f6788);
        }
        this.f6791 = null;
        this.f6792 = null;
        this.f6789 = null;
        if (this.f6800 != null) {
            this.f6799.m65();
            this.f6800 = null;
        }
        C7730 c7730 = this.f6772;
        if (c7730 != null) {
            c7730.f20989.m13044(c7730.f20988);
            C7730 c77302 = this.f6771;
            c77302.f20989.m13044(c77302.f20988);
            C7730 c77303 = this.f6770;
            c77303.f20989.m13044(c77303.f20988);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4405(boolean z) {
        if (z && this.f6791 != null) {
            m4409(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
            if (abstractComponentCallbacksC2338 != null) {
                abstractComponentCallbacksC2338.f6879 = true;
                if (z) {
                    abstractComponentCallbacksC2338.f6896.m4405(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m4406() {
        if (this.f6787 >= 1) {
            for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
                if (abstractComponentCallbacksC2338 != null) {
                    if (!abstractComponentCallbacksC2338.f6887 ? abstractComponentCallbacksC2338.f6896.m4406() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m4407() {
        if (this.f6787 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6784.m964()) {
            if (abstractComponentCallbacksC2338 != null && m4360(abstractComponentCallbacksC2338)) {
                if (!abstractComponentCallbacksC2338.f6887 ? abstractComponentCallbacksC2338.f6896.m4407() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC2338);
                    z = true;
                }
            }
        }
        if (this.f6782 != null) {
            for (int i = 0; i < this.f6782.size(); i++) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = (AbstractComponentCallbacksC2338) this.f6782.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC23382)) {
                    abstractComponentCallbacksC23382.getClass();
                }
            }
        }
        this.f6782 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m4408() {
        synchronized (this.f6786) {
            try {
                if (!this.f6786.isEmpty()) {
                    this.f6799.m64(true);
                    return;
                }
                C0022 c0022 = this.f6799;
                ArrayList arrayList = this.f6783;
                c0022.m64((arrayList != null ? arrayList.size() : 0) > 0 && m4359(this.f6789));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m4409(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C2359());
        C2319 c2319 = this.f6791;
        if (c2319 == null) {
            try {
                m4395("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c2319.f6818.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m4410(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, Lifecycle$State lifecycle$State) {
        if (abstractComponentCallbacksC2338 == this.f6784.m976(abstractComponentCallbacksC2338.f6901) && (abstractComponentCallbacksC2338.f6897 == null || abstractComponentCallbacksC2338.f6898 == this)) {
            abstractComponentCallbacksC2338.f6918 = lifecycle$State;
        } else {
            C5554.m10874("Fragment ", abstractComponentCallbacksC2338, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m4411(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, boolean z) {
        ViewGroup viewGroupM4374 = m4374(abstractComponentCallbacksC2338);
        if (viewGroupM4374 == null || !(viewGroupM4374 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM4374).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m4412() {
        for (C2304 c2304 : this.f6784.m965()) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6754;
            if (abstractComponentCallbacksC2338.f6877) {
                if (this.f6785) {
                    this.f6776 = true;
                } else {
                    abstractComponentCallbacksC2338.f6877 = false;
                    c2304.m4344();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m4413(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (abstractComponentCallbacksC2338 != null) {
            if (abstractComponentCallbacksC2338 != this.f6784.m976(abstractComponentCallbacksC2338.f6901) || (abstractComponentCallbacksC2338.f6897 != null && abstractComponentCallbacksC2338.f6898 != this)) {
                C5554.m10874("Fragment ", abstractComponentCallbacksC2338, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = this.f6790;
        this.f6790 = abstractComponentCallbacksC2338;
        m4398(abstractComponentCallbacksC23382);
        m4398(this.f6790);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m4414(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        ViewGroup viewGroupM4374 = m4374(abstractComponentCallbacksC2338);
        if (viewGroupM4374 != null) {
            C2334 c2334 = abstractComponentCallbacksC2338.f6917;
            if ((c2334 == null ? 0 : c2334.f6862) + (c2334 == null ? 0 : c2334.f6863) + (c2334 == null ? 0 : c2334.f6864) + (c2334 == null ? 0 : c2334.f6865) > 0) {
                if (viewGroupM4374.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM4374.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC2338);
                }
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = (AbstractComponentCallbacksC2338) viewGroupM4374.getTag(R.id.visible_removing_fragment_view_tag);
                C2334 c23342 = abstractComponentCallbacksC2338.f6917;
                boolean z = c23342 != null ? c23342.f6866 : false;
                if (abstractComponentCallbacksC23382.f6917 == null) {
                    return;
                }
                abstractComponentCallbacksC23382.m4444().f6866 = z;
            }
        }
    }
}

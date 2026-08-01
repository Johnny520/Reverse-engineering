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
import com.alibaba.fastjson2.C2941;
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
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5092;
import lin.xposed.hook.javaplugin.C5553;
import p142.C7538;
import p143.C7543;
import p143.C7544;
import p156.AbstractC7621;
import p160.C7636;
import p162.C7649;
import p162.C7655;
import p171.AbstractC7728;
import p171.C7729;
import p392.AbstractC9124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2313 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ArrayList f6764;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ArrayList f6765;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final RunnableC2350 f6766;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C2306 f6767;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ArrayDeque f6768;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C7729 f6769;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C7729 f6770;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C7729 f6771;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C2323 f6772;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C2324 f6773;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public ArrayList f6774;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f6775;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f6776;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f6777;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f6778;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f6779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ArrayList f6781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f6782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f6784;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f6786;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2325 f6787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 f6788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 f6789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2319 f6790;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC9124 f6791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final CopyOnWriteArrayList f6792;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0076 f6793;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2315 f6794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2315 f6795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C2315 f6796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2315 f6797;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0023 f6799;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ArrayList f6801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f6785 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0325 f6783 = new C0325(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LayoutInflaterFactory2C2316 f6780 = new LayoutInflaterFactory2C2316(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0022 f6798 = new C0022(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AtomicInteger f6802 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f6803 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Map f6800 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    public AbstractC2313() {
        Collections.synchronizedMap(new HashMap());
        this.f6793 = new C0076(this);
        this.f6792 = new CopyOnWriteArrayList();
        final int i = 0;
        this.f6796 = new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2313 f6806;

            {
                this.f6806 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i2 = i;
                AbstractC2313 abstractC2313 = this.f6806;
                switch (i2) {
                    case 0:
                        if (abstractC2313.m4370()) {
                            abstractC2313.m4392(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC2313.m4370() && num.intValue() == 80) {
                            abstractC2313.m4395(false);
                            break;
                        }
                        break;
                    case 2:
                        C7649 c7649 = (C7649) obj;
                        if (abstractC2313.m4370()) {
                            boolean z = c7649.f20775;
                            abstractC2313.m4387(false);
                        }
                        break;
                    default:
                        C7655 c7655 = (C7655) obj;
                        if (abstractC2313.m4370()) {
                            boolean z2 = c7655.f20790;
                            abstractC2313.m4389(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f6797 = new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2313 f6806;

            {
                this.f6806 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i22 = i2;
                AbstractC2313 abstractC2313 = this.f6806;
                switch (i22) {
                    case 0:
                        if (abstractC2313.m4370()) {
                            abstractC2313.m4392(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC2313.m4370() && num.intValue() == 80) {
                            abstractC2313.m4395(false);
                            break;
                        }
                        break;
                    case 2:
                        C7649 c7649 = (C7649) obj;
                        if (abstractC2313.m4370()) {
                            boolean z = c7649.f20775;
                            abstractC2313.m4387(false);
                        }
                        break;
                    default:
                        C7655 c7655 = (C7655) obj;
                        if (abstractC2313.m4370()) {
                            boolean z2 = c7655.f20790;
                            abstractC2313.m4389(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f6794 = new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2313 f6806;

            {
                this.f6806 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i22 = i3;
                AbstractC2313 abstractC2313 = this.f6806;
                switch (i22) {
                    case 0:
                        if (abstractC2313.m4370()) {
                            abstractC2313.m4392(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC2313.m4370() && num.intValue() == 80) {
                            abstractC2313.m4395(false);
                            break;
                        }
                        break;
                    case 2:
                        C7649 c7649 = (C7649) obj;
                        if (abstractC2313.m4370()) {
                            boolean z = c7649.f20775;
                            abstractC2313.m4387(false);
                        }
                        break;
                    default:
                        C7655 c7655 = (C7655) obj;
                        if (abstractC2313.m4370()) {
                            boolean z2 = c7655.f20790;
                            abstractC2313.m4389(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f6795 = new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2313 f6806;

            {
                this.f6806 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i22 = i4;
                AbstractC2313 abstractC2313 = this.f6806;
                switch (i22) {
                    case 0:
                        if (abstractC2313.m4370()) {
                            abstractC2313.m4392(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC2313.m4370() && num.intValue() == 80) {
                            abstractC2313.m4395(false);
                            break;
                        }
                        break;
                    case 2:
                        C7649 c7649 = (C7649) obj;
                        if (abstractC2313.m4370()) {
                            boolean z = c7649.f20775;
                            abstractC2313.m4387(false);
                        }
                        break;
                    default:
                        C7655 c7655 = (C7655) obj;
                        if (abstractC2313.m4370()) {
                            boolean z2 = c7655.f20790;
                            abstractC2313.m4389(false);
                        }
                        break;
                }
            }
        };
        this.f6787 = new C2325(this);
        this.f6786 = -1;
        this.f6773 = new C2324(this);
        this.f6772 = new C2323();
        this.f6768 = new ArrayDeque();
        this.f6766 = new RunnableC2350(this, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m4349(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (abstractComponentCallbacksC2338 == null) {
            return true;
        }
        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6897;
        return abstractComponentCallbacksC2338 == abstractC2313.f6789 && m4349(abstractC2313.f6788);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m4350(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (abstractComponentCallbacksC2338 == null) {
            return true;
        }
        if (abstractComponentCallbacksC2338.f6879) {
            return abstractComponentCallbacksC2338.f6897 == null || m4350(abstractComponentCallbacksC2338.f6894);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m4351(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        abstractComponentCallbacksC2338.getClass();
        boolean zM4351 = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 : abstractComponentCallbacksC2338.f6895.f6783.m967()) {
            if (abstractComponentCallbacksC23382 != null) {
                zM4351 = m4351(abstractComponentCallbacksC23382);
            }
            if (zM4351) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m4352(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m4353(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4352(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6886) {
            abstractComponentCallbacksC2338.f6886 = false;
            abstractComponentCallbacksC2338.f6915 = !abstractComponentCallbacksC2338.f6915;
        }
    }

    public void addFragmentOnAttachListener(InterfaceC2305 interfaceC2305) {
        this.f6792.add(interfaceC2305);
    }

    public void addOnBackStackChangedListener(InterfaceC2312 interfaceC2312) {
        if (this.f6801 == null) {
            this.f6801 = new ArrayList();
        }
        this.f6801.add(interfaceC2312);
    }

    public void removeFragmentOnAttachListener(InterfaceC2305 interfaceC2305) {
        this.f6792.remove(interfaceC2305);
    }

    public void removeOnBackStackChangedListener(InterfaceC2312 interfaceC2312) {
        ArrayList arrayList = this.f6801;
        if (arrayList != null) {
            arrayList.remove(interfaceC2312);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6788;
        if (abstractComponentCallbacksC2338 != null) {
            sb.append(abstractComponentCallbacksC2338.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f6788)));
            sb.append("}");
        } else {
            C2319 c2319 = this.f6790;
            if (c2319 != null) {
                sb.append(c2319.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f6790)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Bundle m4354() {
        int i;
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = m4375().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2349 c2349 = (C2349) it.next();
            if (c2349.f6952) {
                if (m4352(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c2349.f6952 = false;
                c2349.m4460();
            }
        }
        Iterator it2 = m4375().iterator();
        while (it2.hasNext()) {
            ((C2349) it2.next()).m4458();
        }
        m4369(true);
        this.f6778 = true;
        this.f6767.f6762 = true;
        C0325 c0325 = this.f6783;
        c0325.getClass();
        HashMap map = (HashMap) c0325.f1096;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C2304 c2304 : map.values()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6753;
                String str = abstractComponentCallbacksC2338.f6900;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6753;
                if (abstractComponentCallbacksC23382.f6908 == -1 && (bundle = abstractComponentCallbacksC23382.f6906) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new FragmentState(abstractComponentCallbacksC23382));
                if (abstractComponentCallbacksC23382.f6908 > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC23382.mo4441(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c2304.f6755.m266(false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC23382.f6911.m12728(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM4354 = abstractComponentCallbacksC23382.f6895.m4354();
                    if (!bundleM4354.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM4354);
                    }
                    if (abstractComponentCallbacksC23382.f6880 != null) {
                        c2304.m4330();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC23382.f6907;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC23382.f6901;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC23382.f6904;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c0325.m995(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC2338.f6900);
                if (m4352(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC2338 + ": " + abstractComponentCallbacksC2338.f6906);
                }
            }
        }
        HashMap map2 = (HashMap) this.f6783.f1094;
        if (!map2.isEmpty()) {
            C0325 c03252 = this.f6783;
            synchronized (((ArrayList) c03252.f1095)) {
                try {
                    if (((ArrayList) c03252.f1095).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c03252.f1095).size());
                        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 : (ArrayList) c03252.f1095) {
                            arrayList.add(abstractComponentCallbacksC23383.f6900);
                            if (m4352(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC23383.f6900 + "): " + abstractComponentCallbacksC23383);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f6782;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((C2332) this.f6782.get(i));
                    if (m4352(2)) {
                        StringBuilder sbM148 = AbstractC0053.m148(i, "saveAllState: adding back stack #", ": ");
                        sbM148.append(this.f6782.get(i));
                        Log.v("FragmentManager", sbM148.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f6727 = null;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.f6730 = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            fragmentManagerState.f6731 = arrayList5;
            fragmentManagerState.f6734 = arrayList2;
            fragmentManagerState.f6732 = arrayList;
            fragmentManagerState.f6733 = backStackRecordStateArr;
            fragmentManagerState.f6728 = this.f6802.get();
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23384 = this.f6789;
            if (abstractComponentCallbacksC23384 != null) {
                fragmentManagerState.f6727 = abstractComponentCallbacksC23384.f6900;
            }
            arrayList4.addAll(this.f6803.keySet());
            arrayList5.addAll(this.f6803.values());
            fragmentManagerState.f6729 = new ArrayList(this.f6768);
            bundle2.putParcelable("state", fragmentManagerState);
            for (String str2 : this.f6800.keySet()) {
                bundle2.putBundle(AbstractC0053.m152("result_", str2), (Bundle) this.f6800.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(AbstractC0053.m152("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (m4352(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m4355() {
        synchronized (this.f6785) {
            try {
                if (this.f6785.size() == 1) {
                    this.f6790.f6816.removeCallbacks(this.f6766);
                    this.f6790.f6816.post(this.f6766);
                    m4398();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m4356(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4352(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC2338 + " nesting=" + abstractComponentCallbacksC2338.f6898);
        }
        boolean zM4443 = abstractComponentCallbacksC2338.m4443();
        if (abstractComponentCallbacksC2338.f6882 && zM4443) {
            return;
        }
        C0325 c0325 = this.f6783;
        synchronized (((ArrayList) c0325.f1095)) {
            ((ArrayList) c0325.f1095).remove(abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6892 = false;
        if (m4351(abstractComponentCallbacksC2338)) {
            this.f6779 = true;
        }
        abstractComponentCallbacksC2338.f6891 = true;
        m4404(abstractComponentCallbacksC2338);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean m4357(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f6782;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f6782.size() - 1;
            } else {
                int size2 = this.f6782.size() - 1;
                while (size2 >= 0) {
                    C2332 c2332 = (C2332) this.f6782.get(size2);
                    if (i >= 0 && i == c2332.f6847) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C2332 c23322 = (C2332) this.f6782.get(size - 1);
                        if (i < 0 || i != c23322.f6847) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f6782.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f6782.size() - 1; size3 >= size; size3--) {
            arrayList.add((C2332) this.f6782.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m4358(Bundle bundle) {
        C0076 c0076;
        int i;
        boolean z;
        int i2;
        C2304 c2304;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f6790.f6819.getClassLoader());
                this.f6800.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f6790.f6819.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C0325 c0325 = this.f6783;
        HashMap map2 = (HashMap) c0325.f1094;
        HashMap map3 = (HashMap) c0325.f1096;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.f6734.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0076 = this.f6793;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM995 = c0325.m995((String) it.next(), null);
            if (bundleM995 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) this.f6767.f6761.get(((FragmentState) bundleM995.getParcelable("state")).f6746);
                if (abstractComponentCallbacksC2338 != null) {
                    if (m4352(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC2338);
                    }
                    c2304 = new C2304(c0076, c0325, abstractComponentCallbacksC2338, bundleM995);
                } else {
                    c2304 = new C2304(this.f6793, this.f6783, this.f6790.f6819.getClassLoader(), m4373(), bundleM995);
                }
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6753;
                abstractComponentCallbacksC23382.f6906 = bundleM995;
                abstractComponentCallbacksC23382.f6897 = this;
                if (m4352(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC23382.f6900 + "): " + abstractComponentCallbacksC23382);
                }
                c2304.m4328(this.f6790.f6819.getClassLoader());
                c0325.m956(c2304);
                c2304.f6751 = this.f6786;
            }
        }
        C2306 c2306 = this.f6767;
        c2306.getClass();
        Iterator it2 = new ArrayList(c2306.f6761.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 = (AbstractComponentCallbacksC2338) it2.next();
            if (map3.get(abstractComponentCallbacksC23383.f6900) == null) {
                if (m4352(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC23383 + " that was not found in the set of active Fragments " + fragmentManagerState.f6734);
                }
                this.f6767.m4339(abstractComponentCallbacksC23383);
                abstractComponentCallbacksC23383.f6897 = this;
                C2304 c23042 = new C2304(c0076, c0325, abstractComponentCallbacksC23383);
                c23042.f6751 = 1;
                c23042.m4334();
                abstractComponentCallbacksC23383.f6891 = true;
                c23042.m4334();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f6732;
        ((ArrayList) c0325.f1095).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M976 = c0325.m976(str3);
                if (abstractComponentCallbacksC2338M976 == null) {
                    C5919.m11250(AbstractC0053.m156("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (m4352(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC2338M976);
                }
                c0325.m972(abstractComponentCallbacksC2338M976);
            }
        }
        if (fragmentManagerState.f6733 != null) {
            this.f6782 = new ArrayList(fragmentManagerState.f6733.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f6733;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                ArrayList arrayList2 = backStackRecordState.f6715;
                C2332 c2332 = new C2332(this);
                int[] iArr = backStackRecordState.f6717;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    C2356 c2356 = new C2356();
                    int i6 = i4 + 1;
                    int i7 = i;
                    c2356.f6973 = iArr[i4];
                    if (m4352(i7)) {
                        Log.v("FragmentManager", "Instantiate " + c2332 + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    c2356.f6974 = Lifecycle$State.values()[backStackRecordState.f6716[i5]];
                    c2356.f6976 = Lifecycle$State.values()[backStackRecordState.f6710[i5]];
                    int i8 = i4 + 2;
                    c2356.f6971 = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    c2356.f6970 = i9;
                    int i10 = iArr[i4 + 3];
                    c2356.f6969 = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    c2356.f6968 = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    c2356.f6975 = i13;
                    c2332.f6845 = i9;
                    c2332.f6844 = i10;
                    c2332.f6843 = i12;
                    c2332.f6842 = i13;
                    c2332.m4420(c2356);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                c2332.f6841 = backStackRecordState.f6709;
                c2332.f6858 = backStackRecordState.f6713;
                c2332.f6855 = true;
                c2332.f6859 = backStackRecordState.f6711;
                c2332.f6856 = backStackRecordState.f6712;
                c2332.f6857 = backStackRecordState.f6708;
                c2332.f6849 = backStackRecordState.f6707;
                c2332.f6848 = backStackRecordState.f6706;
                c2332.f6852 = backStackRecordState.f6705;
                c2332.f6853 = backStackRecordState.f6704;
                c2332.f6847 = backStackRecordState.f6714;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((C2356) c2332.f6846.get(i15)).f6972 = c0325.m976(str4);
                    }
                }
                c2332.m4419(1);
                if (m4352(i14)) {
                    StringBuilder sbM148 = AbstractC0053.m148(i3, "restoreAllState: back stack #", " (index ");
                    sbM148.append(c2332.f6847);
                    sbM148.append("): ");
                    sbM148.append(c2332);
                    Log.v("FragmentManager", sbM148.toString());
                    PrintWriter printWriter = new PrintWriter(new C2359());
                    c2332.m4416(printWriter, "  ", false);
                    printWriter.close();
                }
                this.f6782.add(c2332);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f6782 = null;
        }
        this.f6802.set(fragmentManagerState.f6728);
        String str5 = fragmentManagerState.f6727;
        if (str5 != null) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M9762 = c0325.m976(str5);
            this.f6789 = abstractComponentCallbacksC2338M9762;
            m4388(abstractComponentCallbacksC2338M9762);
        }
        ArrayList arrayList3 = fragmentManagerState.f6730;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.f6803.put((String) arrayList3.get(i16), (BackStackState) fragmentManagerState.f6731.get(i16));
            }
        }
        this.f6768 = new ArrayDeque(fragmentManagerState.f6729);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m4359(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            C5919.m11250("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C2332) arrayList.get(i)).f6853) {
                if (i2 != i) {
                    m4367(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C2332) arrayList.get(i2)).f6853) {
                        i2++;
                    }
                }
                m4367(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m4367(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m4360() {
        return m4361(-1, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean m4361(int i, int i2) {
        m4369(false);
        m4383(true);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6789;
        if (abstractComponentCallbacksC2338 != null && i < 0 && abstractComponentCallbacksC2338.m4432().m4360()) {
            return true;
        }
        boolean zM4357 = m4357(this.f6774, this.f6765, i, i2);
        if (zM4357) {
            this.f6784 = true;
            try {
                m4359(this.f6774, this.f6765);
            } finally {
                m4376();
            }
        }
        m4398();
        m4384();
        ((HashMap) this.f6783.f1096).values().removeAll(Collections.singleton(null));
        return zM4357;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m4362() {
        if (this.f6790 == null) {
            return;
        }
        this.f6778 = false;
        this.f6777 = false;
        this.f6767.f6762 = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null) {
                abstractComponentCallbacksC2338.f6895.m4362();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m4363(int i, boolean z) {
        C2319 c2319;
        if (this.f6790 == null && i != -1) {
            C5919.m11250("No activity");
            return;
        }
        if (z || i != this.f6786) {
            this.f6786 = i;
            C0325 c0325 = this.f6783;
            HashMap map = (HashMap) c0325.f1096;
            Iterator it = ((ArrayList) c0325.f1095).iterator();
            while (it.hasNext()) {
                C2304 c2304 = (C2304) map.get(((AbstractComponentCallbacksC2338) it.next()).f6900);
                if (c2304 != null) {
                    c2304.m4334();
                }
            }
            for (C2304 c23042 : map.values()) {
                if (c23042 != null) {
                    c23042.m4334();
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c23042.f6753;
                    if (abstractComponentCallbacksC2338.f6891 && !abstractComponentCallbacksC2338.m4443()) {
                        c0325.m957(c23042);
                    }
                }
            }
            m4402();
            if (this.f6779 && (c2319 = this.f6790) != null && this.f6786 == 7) {
                c2319.f6817.invalidateMenu();
                this.f6779 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ViewGroup m4364(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        ViewGroup viewGroup = abstractComponentCallbacksC2338.f6881;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC2338.f6884 <= 0 || !this.f6791.mo4406()) {
            return null;
        }
        View viewMo4407 = this.f6791.mo4407(abstractComponentCallbacksC2338.f6884);
        if (viewMo4407 instanceof ViewGroup) {
            return (ViewGroup) viewMo4407;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 m4365(String str) {
        C0325 c0325 = this.f6783;
        ArrayList arrayList = (ArrayList) c0325.f1095;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) arrayList.get(size);
                if (abstractComponentCallbacksC2338 != null && str.equals(abstractComponentCallbacksC2338.f6887)) {
                    return abstractComponentCallbacksC2338;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C2304 c2304 : ((HashMap) c0325.f1096).values()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6753;
                if (str.equals(abstractComponentCallbacksC23382.f6887)) {
                    return abstractComponentCallbacksC23382;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 m4366(int i) {
        C0325 c0325 = this.f6783;
        ArrayList arrayList = (ArrayList) c0325.f1095;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) arrayList.get(size);
            if (abstractComponentCallbacksC2338 != null && abstractComponentCallbacksC2338.f6885 == i) {
                return abstractComponentCallbacksC2338;
            }
        }
        for (C2304 c2304 : ((HashMap) c0325.f1096).values()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6753;
                if (abstractComponentCallbacksC23382.f6885 == i) {
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
    public final void m4367(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC2313.m4367(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m4368(C2332 c2332, boolean z) {
        if (z && (this.f6790 == null || this.f6776)) {
            return;
        }
        m4383(z);
        c2332.mo4348(this.f6774, this.f6765);
        this.f6784 = true;
        try {
            m4359(this.f6774, this.f6765);
            m4376();
            m4398();
            m4384();
            ((HashMap) this.f6783.f1096).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m4376();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m4369(boolean z) {
        boolean zMo4348;
        ArrayList arrayList;
        m4383(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.f6774;
            ArrayList arrayList3 = this.f6765;
            synchronized (this.f6785) {
                if (this.f6785.isEmpty()) {
                    zMo4348 = false;
                } else {
                    try {
                        int size = this.f6785.size();
                        int i = 0;
                        zMo4348 = false;
                        while (true) {
                            arrayList = this.f6785;
                            if (i >= size) {
                                break;
                            }
                            zMo4348 |= ((InterfaceC2311) arrayList.get(i)).mo4348(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.f6790.f6816.removeCallbacks(this.f6766);
                    } finally {
                    }
                }
            }
            if (!zMo4348) {
                m4398();
                m4384();
                ((HashMap) this.f6783.f1096).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.f6784 = true;
            try {
                m4359(this.f6774, this.f6765);
            } finally {
                m4376();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final boolean m4370() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6788;
        if (abstractComponentCallbacksC2338 == null) {
            return true;
        }
        return abstractComponentCallbacksC2338.m4450() && this.f6788.m4449().m4370();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m4371(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4352(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6886) {
            return;
        }
        abstractComponentCallbacksC2338.f6886 = true;
        abstractComponentCallbacksC2338.f6915 = true ^ abstractComponentCallbacksC2338.f6915;
        m4404(abstractComponentCallbacksC2338);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C2323 m4372() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6788;
        return abstractComponentCallbacksC2338 != null ? abstractComponentCallbacksC2338.f6897.m4372() : this.f6772;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C2324 m4373() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6788;
        return abstractComponentCallbacksC2338 != null ? abstractComponentCallbacksC2338.f6897.m4373() : this.f6773;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2304 m4374(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        String str = abstractComponentCallbacksC2338.f6900;
        C0325 c0325 = this.f6783;
        C2304 c2304 = (C2304) ((HashMap) c0325.f1096).get(str);
        if (c2304 != null) {
            return c2304;
        }
        C2304 c23042 = new C2304(this.f6793, c0325, abstractComponentCallbacksC2338);
        c23042.m4328(this.f6790.f6819.getClassLoader());
        c23042.f6751 = this.f6786;
        return c23042;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashSet m4375() {
        C2349 c2349;
        HashSet hashSet = new HashSet();
        Iterator it = this.f6783.m964().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C2304) it.next()).f6753.f6881;
            if (viewGroup != null) {
                m4372().getClass();
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
    public final void m4376() {
        this.f6784 = false;
        this.f6765.clear();
        this.f6774.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4377(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4352(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6882) {
            abstractComponentCallbacksC2338.f6882 = false;
            if (abstractComponentCallbacksC2338.f6892) {
                return;
            }
            this.f6783.m972(abstractComponentCallbacksC2338);
            if (m4352(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC2338);
            }
            if (m4351(abstractComponentCallbacksC2338)) {
                this.f6779 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4378(C2319 c2319, AbstractC9124 abstractC9124, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (this.f6790 != null) {
            C5919.m11250("Already attached");
            return;
        }
        this.f6790 = c2319;
        this.f6791 = abstractC9124;
        this.f6788 = abstractComponentCallbacksC2338;
        if (abstractComponentCallbacksC2338 != null) {
            addFragmentOnAttachListener(new C2322(abstractComponentCallbacksC2338));
        } else if (c2319 != null) {
            addFragmentOnAttachListener(c2319);
        }
        if (this.f6788 != null) {
            m4398();
        }
        if (c2319 != null) {
            C0023 onBackPressedDispatcher = c2319.f6817.getOnBackPressedDispatcher();
            this.f6799 = onBackPressedDispatcher;
            onBackPressedDispatcher.m28(this.f6798, abstractComponentCallbacksC2338 != null ? abstractComponentCallbacksC2338 : c2319);
        }
        int i = 0;
        if (abstractComponentCallbacksC2338 != null) {
            C2306 c2306 = abstractComponentCallbacksC2338.f6897.f6767;
            HashMap map = c2306.f6760;
            C2306 c23062 = (C2306) map.get(abstractComponentCallbacksC2338.f6900);
            if (c23062 == null) {
                c23062 = new C2306(c2306.f6758);
                map.put(abstractComponentCallbacksC2338.f6900, c23062);
            }
            this.f6767 = c23062;
        } else if (c2319 != null) {
            C2423 viewModelStore = c2319.f6817.getViewModelStore();
            viewModelStore.getClass();
            C7636 c7636 = C7636.f20730;
            c7636.getClass();
            C0325 c0325 = new C0325(viewModelStore, C2306.f6756, c7636);
            InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C2306.class);
            String strMo8895 = interfaceC5092Mo8927.mo8895();
            if (strMo8895 == null) {
                C5919.m11249("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.f6767 = (C2306) c0325.m958("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8895), interfaceC5092Mo8927);
        } else {
            this.f6767 = new C2306(false);
        }
        C2306 c23063 = this.f6767;
        int i2 = 1;
        c23063.f6762 = this.f6778 || this.f6777;
        this.f6783.f1093 = c23063;
        C2319 c23192 = this.f6790;
        if (c23192 != null && abstractComponentCallbacksC2338 == null) {
            C7538 savedStateRegistry = c23192.f6817.getSavedStateRegistry();
            savedStateRegistry.m12732("android:support:fragments", new C2335((C2309) this, i2));
            Bundle bundleM12734 = savedStateRegistry.m12734("android:support:fragments");
            if (bundleM12734 != null) {
                m4358(bundleM12734);
            }
        }
        C2319 c23193 = this.f6790;
        if (c23193 != null) {
            AbstractC7728 activityResultRegistry = c23193.f6817.getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(abstractComponentCallbacksC2338 != null ? AbstractC0053.m146(new StringBuilder(), abstractComponentCallbacksC2338.f6900, ":") : "");
            int i3 = 2;
            C2309 c2309 = (C2309) this;
            this.f6771 = activityResultRegistry.m13016(strConcat.concat("StartActivityForResult"), new C2321(i3), new C2326(c2309, i2));
            this.f6770 = activityResultRegistry.m13016(strConcat.concat("StartIntentSenderForResult"), new C2321(i), new C2326(c2309, i3));
            this.f6769 = activityResultRegistry.m13016(strConcat.concat("RequestPermissions"), new C2321(i2), new C2326(c2309, i));
        }
        C2319 c23194 = this.f6790;
        if (c23194 != null) {
            c23194.addOnConfigurationChangedListener(this.f6796);
        }
        C2319 c23195 = this.f6790;
        if (c23195 != null) {
            c23195.f6817.addOnTrimMemoryListener(this.f6797);
        }
        C2319 c23196 = this.f6790;
        if (c23196 != null) {
            c23196.f6817.addOnMultiWindowModeChangedListener(this.f6794);
        }
        C2319 c23197 = this.f6790;
        if (c23197 != null) {
            c23197.f6817.addOnPictureInPictureModeChangedListener(this.f6795);
        }
        C2319 c23198 = this.f6790;
        if (c23198 == null || abstractComponentCallbacksC2338 != null) {
            return;
        }
        c23198.f6817.addMenuProvider(this.f6787);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2304 m4379(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        String str = abstractComponentCallbacksC2338.f6920;
        if (str != null) {
            AbstractC7621.m12825(abstractComponentCallbacksC2338, str);
        }
        if (m4352(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC2338);
        }
        C2304 c2304M4374 = m4374(abstractComponentCallbacksC2338);
        abstractComponentCallbacksC2338.f6897 = this;
        C0325 c0325 = this.f6783;
        c0325.m956(c2304M4374);
        if (!abstractComponentCallbacksC2338.f6882) {
            c0325.m972(abstractComponentCallbacksC2338);
            abstractComponentCallbacksC2338.f6891 = false;
            if (abstractComponentCallbacksC2338.f6880 == null) {
                abstractComponentCallbacksC2338.f6915 = false;
            }
            if (m4351(abstractComponentCallbacksC2338)) {
                this.f6779 = true;
            }
        }
        return c2304M4374;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m4380(int i) {
        try {
            this.f6784 = true;
            for (C2304 c2304 : ((HashMap) this.f6783.f1096).values()) {
                if (c2304 != null) {
                    c2304.f6751 = i;
                }
            }
            m4363(i, false);
            Iterator it = m4375().iterator();
            while (it.hasNext()) {
                ((C2349) it.next()).m4458();
            }
            this.f6784 = false;
            m4369(true);
        } catch (Throwable th) {
            this.f6784 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m4381() {
        if (this.f6786 < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null && m4350(abstractComponentCallbacksC2338)) {
                if (!abstractComponentCallbacksC2338.f6886 ? abstractComponentCallbacksC2338.f6895.m4381() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m4382(InterfaceC2311 interfaceC2311, boolean z) {
        if (!z) {
            if (this.f6790 == null) {
                if (this.f6776) {
                    C5919.m11250("FragmentManager has been destroyed");
                    return;
                } else {
                    C5919.m11250("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.f6778 || this.f6777) {
                C5919.m11250("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f6785) {
            try {
                if (this.f6790 == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f6785.add(interfaceC2311);
                    m4355();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m4383(boolean z) {
        if (this.f6784) {
            C5919.m11250("FragmentManager is already executing transactions");
            return;
        }
        if (this.f6790 == null) {
            if (this.f6776) {
                C5919.m11250("FragmentManager has been destroyed");
                return;
            } else {
                C5919.m11250("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f6790.f6816.getLooper()) {
            C5919.m11250("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.f6778 || this.f6777)) {
            C5919.m11250("Can not perform this action after onSaveInstanceState");
        } else if (this.f6774 == null) {
            this.f6774 = new ArrayList();
            this.f6765 = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m4384() {
        if (this.f6775) {
            this.f6775 = false;
            m4402();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m4385(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strM136 = AbstractC0053.m136(str, "    ");
        C0325 c0325 = this.f6783;
        ArrayList arrayList = (ArrayList) c0325.f1095;
        String strM1362 = AbstractC0053.m136(str, "    ");
        HashMap map = (HashMap) c0325.f1096;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2304 c2304 : map.values()) {
                printWriter.print(str);
                if (c2304 != null) {
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6753;
                    printWriter.println(abstractComponentCallbacksC2338);
                    abstractComponentCallbacksC2338.getClass();
                    printWriter.print(strM1362);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC2338.f6885));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC2338.f6884));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC2338.f6887);
                    printWriter.print(strM1362);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC2338.f6908);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC2338.f6900);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC2338.f6898);
                    printWriter.print(strM1362);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC2338.f6892);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC2338.f6891);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC2338.f6890);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC2338.f6889);
                    printWriter.print(strM1362);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC2338.f6886);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC2338.f6882);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC2338.f6879);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strM1362);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC2338.f6883);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC2338.f6877);
                    if (abstractComponentCallbacksC2338.f6897 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC2338.f6897);
                    }
                    if (abstractComponentCallbacksC2338.f6896 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC2338.f6896);
                    }
                    if (abstractComponentCallbacksC2338.f6894 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC2338.f6894);
                    }
                    if (abstractComponentCallbacksC2338.f6904 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC2338.f6904);
                    }
                    if (abstractComponentCallbacksC2338.f6906 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC2338.f6906);
                    }
                    if (abstractComponentCallbacksC2338.f6907 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC2338.f6907);
                    }
                    if (abstractComponentCallbacksC2338.f6901 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC2338.f6901);
                    }
                    Object objM976 = abstractComponentCallbacksC2338.f6905;
                    if (objM976 == null) {
                        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6897;
                        objM976 = (abstractC2313 == null || (str2 = abstractComponentCallbacksC2338.f6902) == null) ? null : abstractC2313.f6783.m976(str2);
                    }
                    if (objM976 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mTarget=");
                        printWriter.print(objM976);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC2338.f6903);
                    }
                    printWriter.print(strM1362);
                    printWriter.print("mPopDirection=");
                    C2334 c2334 = abstractComponentCallbacksC2338.f6916;
                    printWriter.println(c2334 == null ? false : c2334.f6865);
                    C2334 c23342 = abstractComponentCallbacksC2338.f6916;
                    if ((c23342 == null ? 0 : c23342.f6864) != 0) {
                        printWriter.print(strM1362);
                        printWriter.print("getEnterAnim=");
                        C2334 c23343 = abstractComponentCallbacksC2338.f6916;
                        printWriter.println(c23343 == null ? 0 : c23343.f6864);
                    }
                    C2334 c23344 = abstractComponentCallbacksC2338.f6916;
                    if ((c23344 == null ? 0 : c23344.f6863) != 0) {
                        printWriter.print(strM1362);
                        printWriter.print("getExitAnim=");
                        C2334 c23345 = abstractComponentCallbacksC2338.f6916;
                        printWriter.println(c23345 == null ? 0 : c23345.f6863);
                    }
                    C2334 c23346 = abstractComponentCallbacksC2338.f6916;
                    if ((c23346 == null ? 0 : c23346.f6862) != 0) {
                        printWriter.print(strM1362);
                        printWriter.print("getPopEnterAnim=");
                        C2334 c23347 = abstractComponentCallbacksC2338.f6916;
                        printWriter.println(c23347 == null ? 0 : c23347.f6862);
                    }
                    C2334 c23348 = abstractComponentCallbacksC2338.f6916;
                    if ((c23348 == null ? 0 : c23348.f6861) != 0) {
                        printWriter.print(strM1362);
                        printWriter.print("getPopExitAnim=");
                        C2334 c23349 = abstractComponentCallbacksC2338.f6916;
                        printWriter.println(c23349 == null ? 0 : c23349.f6861);
                    }
                    if (abstractComponentCallbacksC2338.f6881 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC2338.f6881);
                    }
                    if (abstractComponentCallbacksC2338.f6880 != null) {
                        printWriter.print(strM1362);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC2338.f6880);
                    }
                    if (abstractComponentCallbacksC2338.m4431() != null) {
                        C2423 viewModelStore = abstractComponentCallbacksC2338.getViewModelStore();
                        C7544 c7544 = C7543.f20430;
                        viewModelStore.getClass();
                        C7636 c7636 = C7636.f20730;
                        c7636.getClass();
                        C0325 c03252 = new C0325(viewModelStore, c7544, c7636);
                        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C7543.class);
                        String strMo8895 = interfaceC5092Mo8927.mo8895();
                        if (strMo8895 == null) {
                            C5919.m11249("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                        C0282 c0282 = ((C7543) c03252.m958("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8895), interfaceC5092Mo8927)).f20431;
                        if (c0282.f991 > 0) {
                            printWriter.print(strM1362);
                            printWriter.println("Loaders:");
                            if (c0282.f991 > 0) {
                                if (c0282.m856(0) != null) {
                                    C2941.m6336();
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
                    printWriter.println("Child " + abstractComponentCallbacksC2338.f6895 + ":");
                    abstractComponentCallbacksC2338.f6895.m4385(strM1362.concat("  "), fileDescriptor, printWriter, strArr);
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
        ArrayList arrayList2 = this.f6781;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 = (AbstractComponentCallbacksC2338) this.f6781.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC23383.toString());
            }
        }
        ArrayList arrayList3 = this.f6782;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C2332 c2332 = (C2332) this.f6782.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c2332.toString());
                c2332.m4416(printWriter, strM136, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f6802.get());
        synchronized (this.f6785) {
            try {
                int size4 = this.f6785.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC2311) this.f6785.get(i4);
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
        printWriter.println(this.f6790);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f6791);
        if (this.f6788 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f6788);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f6786);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f6778);
        printWriter.print(" mStopped=");
        printWriter.print(this.f6777);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f6776);
        if (this.f6779) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f6779);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4386() {
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m967()) {
            if (abstractComponentCallbacksC2338 != null) {
                abstractComponentCallbacksC2338.m4451();
                abstractComponentCallbacksC2338.f6895.m4386();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4387(boolean z) {
        if (z && this.f6790 != null) {
            m4399(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null && z) {
                abstractComponentCallbacksC2338.f6895.m4387(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4388(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (abstractComponentCallbacksC2338 != null) {
            if (abstractComponentCallbacksC2338 != this.f6783.m976(abstractComponentCallbacksC2338.f6900)) {
                return;
            }
            abstractComponentCallbacksC2338.f6897.getClass();
            boolean zM4349 = m4349(abstractComponentCallbacksC2338);
            Boolean bool = abstractComponentCallbacksC2338.f6893;
            if (bool == null || bool.booleanValue() != zM4349) {
                abstractComponentCallbacksC2338.f6893 = Boolean.valueOf(zM4349);
                C2309 c2309 = abstractComponentCallbacksC2338.f6895;
                c2309.m4398();
                c2309.m4388(c2309.f6789);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m4389(boolean z) {
        if (z && this.f6790 != null) {
            m4399(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null && z) {
                abstractComponentCallbacksC2338.f6895.m4389(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m4390() {
        if (this.f6786 >= 1) {
            for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
                if (abstractComponentCallbacksC2338 != null) {
                    if (!abstractComponentCallbacksC2338.f6886 ? abstractComponentCallbacksC2338.f6895.m4390() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4391() {
        if (this.f6786 < 1) {
            return;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null && !abstractComponentCallbacksC2338.f6886) {
                abstractComponentCallbacksC2338.f6895.m4391();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4392(boolean z) {
        if (z && this.f6790 != null) {
            m4399(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null) {
                abstractComponentCallbacksC2338.f6878 = true;
                if (z) {
                    abstractComponentCallbacksC2338.f6895.m4392(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4393(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (m4352(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6882) {
            return;
        }
        abstractComponentCallbacksC2338.f6882 = true;
        if (abstractComponentCallbacksC2338.f6892) {
            if (m4352(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC2338);
            }
            C0325 c0325 = this.f6783;
            synchronized (((ArrayList) c0325.f1095)) {
                ((ArrayList) c0325.f1095).remove(abstractComponentCallbacksC2338);
            }
            abstractComponentCallbacksC2338.f6892 = false;
            if (m4351(abstractComponentCallbacksC2338)) {
                this.f6779 = true;
            }
            m4404(abstractComponentCallbacksC2338);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4394() {
        boolean zIsChangingConfigurations = true;
        this.f6776 = true;
        m4369(true);
        Iterator it = m4375().iterator();
        while (it.hasNext()) {
            ((C2349) it.next()).m4458();
        }
        C2319 c2319 = this.f6790;
        C0325 c0325 = this.f6783;
        if (c2319 != null) {
            zIsChangingConfigurations = ((C2306) c0325.f1093).f6757;
        } else {
            FragmentActivity fragmentActivity = c2319.f6819;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f6803.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((BackStackState) it2.next()).f6719) {
                    C2306 c2306 = (C2306) c0325.f1093;
                    c2306.getClass();
                    if (m4352(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c2306.m4340(str);
                }
            }
        }
        m4380(-1);
        C2319 c23192 = this.f6790;
        if (c23192 != null) {
            c23192.f6817.removeOnTrimMemoryListener(this.f6797);
        }
        C2319 c23193 = this.f6790;
        if (c23193 != null) {
            c23193.removeOnConfigurationChangedListener(this.f6796);
        }
        C2319 c23194 = this.f6790;
        if (c23194 != null) {
            c23194.f6817.removeOnMultiWindowModeChangedListener(this.f6794);
        }
        C2319 c23195 = this.f6790;
        if (c23195 != null) {
            c23195.f6817.removeOnPictureInPictureModeChangedListener(this.f6795);
        }
        C2319 c23196 = this.f6790;
        if (c23196 != null && this.f6788 == null) {
            c23196.f6817.removeMenuProvider(this.f6787);
        }
        this.f6790 = null;
        this.f6791 = null;
        this.f6788 = null;
        if (this.f6799 != null) {
            this.f6798.m65();
            this.f6799 = null;
        }
        C7729 c7729 = this.f6771;
        if (c7729 != null) {
            c7729.f20994.m13014(c7729.f20993);
            C7729 c77292 = this.f6770;
            c77292.f20994.m13014(c77292.f20993);
            C7729 c77293 = this.f6769;
            c77293.f20994.m13014(c77293.f20993);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4395(boolean z) {
        if (z && this.f6790 != null) {
            m4399(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null) {
                abstractComponentCallbacksC2338.f6878 = true;
                if (z) {
                    abstractComponentCallbacksC2338.f6895.m4395(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m4396() {
        if (this.f6786 >= 1) {
            for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
                if (abstractComponentCallbacksC2338 != null) {
                    if (!abstractComponentCallbacksC2338.f6886 ? abstractComponentCallbacksC2338.f6895.m4396() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m4397() {
        if (this.f6786 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : this.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null && m4350(abstractComponentCallbacksC2338)) {
                if (!abstractComponentCallbacksC2338.f6886 ? abstractComponentCallbacksC2338.f6895.m4397() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC2338);
                    z = true;
                }
            }
        }
        if (this.f6781 != null) {
            for (int i = 0; i < this.f6781.size(); i++) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = (AbstractComponentCallbacksC2338) this.f6781.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC23382)) {
                    abstractComponentCallbacksC23382.getClass();
                }
            }
        }
        this.f6781 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m4398() {
        synchronized (this.f6785) {
            try {
                if (!this.f6785.isEmpty()) {
                    this.f6798.m64(true);
                    return;
                }
                C0022 c0022 = this.f6798;
                ArrayList arrayList = this.f6782;
                c0022.m64((arrayList != null ? arrayList.size() : 0) > 0 && m4349(this.f6788));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m4399(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C2359());
        C2319 c2319 = this.f6790;
        if (c2319 == null) {
            try {
                m4385("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c2319.f6817.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m4400(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, Lifecycle$State lifecycle$State) {
        if (abstractComponentCallbacksC2338 == this.f6783.m976(abstractComponentCallbacksC2338.f6900) && (abstractComponentCallbacksC2338.f6896 == null || abstractComponentCallbacksC2338.f6897 == this)) {
            abstractComponentCallbacksC2338.f6917 = lifecycle$State;
        } else {
            C5553.m10817("Fragment ", abstractComponentCallbacksC2338, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m4401(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, boolean z) {
        ViewGroup viewGroupM4364 = m4364(abstractComponentCallbacksC2338);
        if (viewGroupM4364 == null || !(viewGroupM4364 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM4364).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m4402() {
        for (C2304 c2304 : this.f6783.m964()) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6753;
            if (abstractComponentCallbacksC2338.f6876) {
                if (this.f6784) {
                    this.f6775 = true;
                } else {
                    abstractComponentCallbacksC2338.f6876 = false;
                    c2304.m4334();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m4403(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (abstractComponentCallbacksC2338 != null) {
            if (abstractComponentCallbacksC2338 != this.f6783.m976(abstractComponentCallbacksC2338.f6900) || (abstractComponentCallbacksC2338.f6896 != null && abstractComponentCallbacksC2338.f6897 != this)) {
                C5553.m10817("Fragment ", abstractComponentCallbacksC2338, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = this.f6789;
        this.f6789 = abstractComponentCallbacksC2338;
        m4388(abstractComponentCallbacksC23382);
        m4388(this.f6789);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m4404(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        ViewGroup viewGroupM4364 = m4364(abstractComponentCallbacksC2338);
        if (viewGroupM4364 != null) {
            C2334 c2334 = abstractComponentCallbacksC2338.f6916;
            if ((c2334 == null ? 0 : c2334.f6861) + (c2334 == null ? 0 : c2334.f6862) + (c2334 == null ? 0 : c2334.f6863) + (c2334 == null ? 0 : c2334.f6864) > 0) {
                if (viewGroupM4364.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM4364.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC2338);
                }
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = (AbstractComponentCallbacksC2338) viewGroupM4364.getTag(R.id.visible_removing_fragment_view_tag);
                C2334 c23342 = abstractComponentCallbacksC2338.f6916;
                boolean z = c23342 != null ? c23342.f6865 : false;
                if (abstractComponentCallbacksC23382.f6916 == null) {
                    return;
                }
                abstractComponentCallbacksC23382.m4434().f6865 = z;
            }
        }
    }
}

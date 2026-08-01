package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0900;
import androidx.activity.C0869;
import androidx.activity.C0870;
import androidx.appcompat.app.C0923;
import androidx.collection.C1129;
import androidx.compose.animation.core.C1171;
import androidx.core.util.InterfaceC3021;
import androidx.lifecycle.C3256;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import lin.xposed.hook.javaplugin.C6385;
import p158.C8368;
import p159.C8373;
import p159.C8374;
import p172.AbstractC8451;
import p176.C8466;
import p178.C8479;
import p178.C8485;
import p187.AbstractC8558;
import p187.C8559;
import p267.AbstractC9004;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3146 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ArrayList f7110;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ArrayList f7111;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final RunnableC3183 f7112;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C3139 f7113;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ArrayDeque f7114;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C8559 f7115;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C8559 f7116;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C8559 f7117;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3156 f7118;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3157 f7119;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public ArrayList f7120;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f7121;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f7122;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f7123;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f7124;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f7125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ArrayList f7127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f7128;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7130;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f7132;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3158 f7133;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractComponentCallbacksC3171 f7134;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public AbstractComponentCallbacksC3171 f7135;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C3152 f7136;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC9004 f7137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final CopyOnWriteArrayList f7138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0923 f7139;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3148 f7140;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3148 f7141;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3148 f7142;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3148 f7143;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0870 f7145;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ArrayList f7147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7131 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1171 f7129 = new C1171(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LayoutInflaterFactory2C3149 f7126 = new LayoutInflaterFactory2C3149(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0869 f7144 = new C0869(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AtomicInteger f7148 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f7149 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Map f7146 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.飘花落叶言子世楪兰哲苏] */
    public AbstractC3146() {
        Collections.synchronizedMap(new HashMap());
        this.f7139 = new C0923(this);
        this.f7138 = new CopyOnWriteArrayList();
        final int i = 0;
        this.f7142 = new InterfaceC3021(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3146 f7152;

            {
                this.f7152 = this;
            }

            @Override // androidx.core.util.InterfaceC3021
            public final void accept(Object obj) {
                int i2 = i;
                AbstractC3146 abstractC3146 = this.f7152;
                switch (i2) {
                    case 0:
                        if (abstractC3146.m4940()) {
                            abstractC3146.m4962(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC3146.m4940() && num.intValue() == 80) {
                            abstractC3146.m4965(false);
                            break;
                        }
                        break;
                    case 2:
                        C8479 c8479 = (C8479) obj;
                        if (abstractC3146.m4940()) {
                            boolean z = c8479.f21115;
                            abstractC3146.m4957(false);
                        }
                        break;
                    default:
                        C8485 c8485 = (C8485) obj;
                        if (abstractC3146.m4940()) {
                            boolean z2 = c8485.f21130;
                            abstractC3146.m4959(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f7143 = new InterfaceC3021(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3146 f7152;

            {
                this.f7152 = this;
            }

            @Override // androidx.core.util.InterfaceC3021
            public final void accept(Object obj) {
                int i22 = i2;
                AbstractC3146 abstractC3146 = this.f7152;
                switch (i22) {
                    case 0:
                        if (abstractC3146.m4940()) {
                            abstractC3146.m4962(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC3146.m4940() && num.intValue() == 80) {
                            abstractC3146.m4965(false);
                            break;
                        }
                        break;
                    case 2:
                        C8479 c8479 = (C8479) obj;
                        if (abstractC3146.m4940()) {
                            boolean z = c8479.f21115;
                            abstractC3146.m4957(false);
                        }
                        break;
                    default:
                        C8485 c8485 = (C8485) obj;
                        if (abstractC3146.m4940()) {
                            boolean z2 = c8485.f21130;
                            abstractC3146.m4959(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f7140 = new InterfaceC3021(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3146 f7152;

            {
                this.f7152 = this;
            }

            @Override // androidx.core.util.InterfaceC3021
            public final void accept(Object obj) {
                int i22 = i3;
                AbstractC3146 abstractC3146 = this.f7152;
                switch (i22) {
                    case 0:
                        if (abstractC3146.m4940()) {
                            abstractC3146.m4962(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC3146.m4940() && num.intValue() == 80) {
                            abstractC3146.m4965(false);
                            break;
                        }
                        break;
                    case 2:
                        C8479 c8479 = (C8479) obj;
                        if (abstractC3146.m4940()) {
                            boolean z = c8479.f21115;
                            abstractC3146.m4957(false);
                        }
                        break;
                    default:
                        C8485 c8485 = (C8485) obj;
                        if (abstractC3146.m4940()) {
                            boolean z2 = c8485.f21130;
                            abstractC3146.m4959(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f7141 = new InterfaceC3021(this) { // from class: androidx.fragment.app.飘花落叶言子世楪兰哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3146 f7152;

            {
                this.f7152 = this;
            }

            @Override // androidx.core.util.InterfaceC3021
            public final void accept(Object obj) {
                int i22 = i4;
                AbstractC3146 abstractC3146 = this.f7152;
                switch (i22) {
                    case 0:
                        if (abstractC3146.m4940()) {
                            abstractC3146.m4962(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC3146.m4940() && num.intValue() == 80) {
                            abstractC3146.m4965(false);
                            break;
                        }
                        break;
                    case 2:
                        C8479 c8479 = (C8479) obj;
                        if (abstractC3146.m4940()) {
                            boolean z = c8479.f21115;
                            abstractC3146.m4957(false);
                        }
                        break;
                    default:
                        C8485 c8485 = (C8485) obj;
                        if (abstractC3146.m4940()) {
                            boolean z2 = c8485.f21130;
                            abstractC3146.m4959(false);
                        }
                        break;
                }
            }
        };
        this.f7133 = new C3158(this);
        this.f7132 = -1;
        this.f7119 = new C3157(this);
        this.f7118 = new C3156();
        this.f7114 = new ArrayDeque();
        this.f7112 = new RunnableC3183(this, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m4919(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (abstractComponentCallbacksC3171 == null) {
            return true;
        }
        AbstractC3146 abstractC3146 = abstractComponentCallbacksC3171.f7243;
        return abstractComponentCallbacksC3171 == abstractC3146.f7135 && m4919(abstractC3146.f7134);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m4920(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (abstractComponentCallbacksC3171 == null) {
            return true;
        }
        if (abstractComponentCallbacksC3171.f7225) {
            return abstractComponentCallbacksC3171.f7243 == null || m4920(abstractComponentCallbacksC3171.f7240);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m4921(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        abstractComponentCallbacksC3171.getClass();
        boolean zM4921 = false;
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 : abstractComponentCallbacksC3171.f7241.f7129.m1528()) {
            if (abstractComponentCallbacksC31712 != null) {
                zM4921 = m4921(abstractComponentCallbacksC31712);
            }
            if (zM4921) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m4922(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m4923(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (m4922(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC3171);
        }
        if (abstractComponentCallbacksC3171.f7232) {
            abstractComponentCallbacksC3171.f7232 = false;
            abstractComponentCallbacksC3171.f7261 = !abstractComponentCallbacksC3171.f7261;
        }
    }

    public void addFragmentOnAttachListener(InterfaceC3138 interfaceC3138) {
        this.f7138.add(interfaceC3138);
    }

    public void addOnBackStackChangedListener(InterfaceC3145 interfaceC3145) {
        if (this.f7147 == null) {
            this.f7147 = new ArrayList();
        }
        this.f7147.add(interfaceC3145);
    }

    public void removeFragmentOnAttachListener(InterfaceC3138 interfaceC3138) {
        this.f7138.remove(interfaceC3138);
    }

    public void removeOnBackStackChangedListener(InterfaceC3145 interfaceC3145) {
        ArrayList arrayList = this.f7147;
        if (arrayList != null) {
            arrayList.remove(interfaceC3145);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7134;
        if (abstractComponentCallbacksC3171 != null) {
            sb.append(abstractComponentCallbacksC3171.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f7134)));
            sb.append("}");
        } else {
            C3152 c3152 = this.f7136;
            if (c3152 != null) {
                sb.append(c3152.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f7136)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final Bundle m4924() {
        int i;
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = m4945().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3182 c3182 = (C3182) it.next();
            if (c3182.f7298) {
                if (m4922(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c3182.f7298 = false;
                c3182.m5030();
            }
        }
        Iterator it2 = m4945().iterator();
        while (it2.hasNext()) {
            ((C3182) it2.next()).m5028();
        }
        m4939(true);
        this.f7124 = true;
        this.f7113.f7108 = true;
        C1171 c1171 = this.f7129;
        c1171.getClass();
        HashMap map = (HashMap) c1171.f1441;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C3137 c3137 : map.values()) {
            if (c3137 != null) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
                String str = abstractComponentCallbacksC3171.f7246;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = c3137.f7099;
                if (abstractComponentCallbacksC31712.f7254 == -1 && (bundle = abstractComponentCallbacksC31712.f7252) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new FragmentState(abstractComponentCallbacksC31712));
                if (abstractComponentCallbacksC31712.f7254 > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC31712.mo5011(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c3137.f7101.m827(false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC31712.f7257.m13316(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM4924 = abstractComponentCallbacksC31712.f7241.m4924();
                    if (!bundleM4924.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM4924);
                    }
                    if (abstractComponentCallbacksC31712.f7226 != null) {
                        c3137.m4900();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC31712.f7253;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC31712.f7247;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC31712.f7250;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c1171.m1556(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC3171.f7246);
                if (m4922(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC3171 + ": " + abstractComponentCallbacksC3171.f7252);
                }
            }
        }
        HashMap map2 = (HashMap) this.f7129.f1439;
        if (!map2.isEmpty()) {
            C1171 c11712 = this.f7129;
            synchronized (((ArrayList) c11712.f1440)) {
                try {
                    if (((ArrayList) c11712.f1440).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c11712.f1440).size());
                        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC31713 : (ArrayList) c11712.f1440) {
                            arrayList.add(abstractComponentCallbacksC31713.f7246);
                            if (m4922(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC31713.f7246 + "): " + abstractComponentCallbacksC31713);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f7128;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((C3165) this.f7128.get(i));
                    if (m4922(2)) {
                        StringBuilder sbM710 = AbstractC0900.m710(i, "saveAllState: adding back stack #", ": ");
                        sbM710.append(this.f7128.get(i));
                        Log.v("FragmentManager", sbM710.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f7073 = null;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.f7076 = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            fragmentManagerState.f7077 = arrayList5;
            fragmentManagerState.f7080 = arrayList2;
            fragmentManagerState.f7078 = arrayList;
            fragmentManagerState.f7079 = backStackRecordStateArr;
            fragmentManagerState.f7074 = this.f7148.get();
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31714 = this.f7135;
            if (abstractComponentCallbacksC31714 != null) {
                fragmentManagerState.f7073 = abstractComponentCallbacksC31714.f7246;
            }
            arrayList4.addAll(this.f7149.keySet());
            arrayList5.addAll(this.f7149.values());
            fragmentManagerState.f7075 = new ArrayList(this.f7114);
            bundle2.putParcelable("state", fragmentManagerState);
            for (String str2 : this.f7146.keySet()) {
                bundle2.putBundle(AbstractC0900.m717("result_", str2), (Bundle) this.f7146.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(AbstractC0900.m717("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (m4922(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m4925() {
        synchronized (this.f7131) {
            try {
                if (this.f7131.size() == 1) {
                    this.f7136.f7164.removeCallbacks(this.f7112);
                    this.f7136.f7164.post(this.f7112);
                    m4968();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m4926(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (m4922(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC3171 + " nesting=" + abstractComponentCallbacksC3171.f7244);
        }
        boolean zM5013 = abstractComponentCallbacksC3171.m5013();
        if (abstractComponentCallbacksC3171.f7228 && zM5013) {
            return;
        }
        C1171 c1171 = this.f7129;
        synchronized (((ArrayList) c1171.f1440)) {
            ((ArrayList) c1171.f1440).remove(abstractComponentCallbacksC3171);
        }
        abstractComponentCallbacksC3171.f7238 = false;
        if (m4921(abstractComponentCallbacksC3171)) {
            this.f7125 = true;
        }
        abstractComponentCallbacksC3171.f7237 = true;
        m4974(abstractComponentCallbacksC3171);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean m4927(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f7128;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f7128.size() - 1;
            } else {
                int size2 = this.f7128.size() - 1;
                while (size2 >= 0) {
                    C3165 c3165 = (C3165) this.f7128.get(size2);
                    if (i >= 0 && i == c3165.f7193) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C3165 c31652 = (C3165) this.f7128.get(size - 1);
                        if (i < 0 || i != c31652.f7193) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f7128.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f7128.size() - 1; size3 >= size; size3--) {
            arrayList.add((C3165) this.f7128.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m4928(Bundle bundle) {
        C0923 c0923;
        int i;
        boolean z;
        int i2;
        C3137 c3137;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f7136.f7161.getClassLoader());
                this.f7146.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f7136.f7161.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C1171 c1171 = this.f7129;
        HashMap map2 = (HashMap) c1171.f1439;
        HashMap map3 = (HashMap) c1171.f1441;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.f7080.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0923 = this.f7139;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM1556 = c1171.m1556((String) it.next(), null);
            if (bundleM1556 != null) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = (AbstractComponentCallbacksC3171) this.f7113.f7107.get(((FragmentState) bundleM1556.getParcelable("state")).f7092);
                if (abstractComponentCallbacksC3171 != null) {
                    if (m4922(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC3171);
                    }
                    c3137 = new C3137(c0923, c1171, abstractComponentCallbacksC3171, bundleM1556);
                } else {
                    c3137 = new C3137(this.f7139, this.f7129, this.f7136.f7161.getClassLoader(), m4943(), bundleM1556);
                }
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = c3137.f7099;
                abstractComponentCallbacksC31712.f7252 = bundleM1556;
                abstractComponentCallbacksC31712.f7243 = this;
                if (m4922(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC31712.f7246 + "): " + abstractComponentCallbacksC31712);
                }
                c3137.m4898(this.f7136.f7161.getClassLoader());
                c1171.m1517(c3137);
                c3137.f7097 = this.f7132;
            }
        }
        C3139 c3139 = this.f7113;
        c3139.getClass();
        Iterator it2 = new ArrayList(c3139.f7107.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31713 = (AbstractComponentCallbacksC3171) it2.next();
            if (map3.get(abstractComponentCallbacksC31713.f7246) == null) {
                if (m4922(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC31713 + " that was not found in the set of active Fragments " + fragmentManagerState.f7080);
                }
                this.f7113.m4909(abstractComponentCallbacksC31713);
                abstractComponentCallbacksC31713.f7243 = this;
                C3137 c31372 = new C3137(c0923, c1171, abstractComponentCallbacksC31713);
                c31372.f7097 = 1;
                c31372.m4904();
                abstractComponentCallbacksC31713.f7237 = true;
                c31372.m4904();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f7078;
        ((ArrayList) c1171.f1440).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M1536 = c1171.m1536(str3);
                if (abstractComponentCallbacksC3171M1536 == null) {
                    C6755.m11870(AbstractC0900.m718("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (m4922(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC3171M1536);
                }
                c1171.m1532(abstractComponentCallbacksC3171M1536);
            }
        }
        if (fragmentManagerState.f7079 != null) {
            this.f7128 = new ArrayList(fragmentManagerState.f7079.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f7079;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                ArrayList arrayList2 = backStackRecordState.f7061;
                C3165 c3165 = new C3165(this);
                int[] iArr = backStackRecordState.f7063;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    C3189 c3189 = new C3189();
                    int i6 = i4 + 1;
                    int i7 = i;
                    c3189.f7319 = iArr[i4];
                    if (m4922(i7)) {
                        Log.v("FragmentManager", "Instantiate " + c3165 + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    c3189.f7320 = Lifecycle$State.values()[backStackRecordState.f7062[i5]];
                    c3189.f7322 = Lifecycle$State.values()[backStackRecordState.f7056[i5]];
                    int i8 = i4 + 2;
                    c3189.f7317 = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    c3189.f7316 = i9;
                    int i10 = iArr[i4 + 3];
                    c3189.f7315 = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    c3189.f7314 = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    c3189.f7321 = i13;
                    c3165.f7191 = i9;
                    c3165.f7190 = i10;
                    c3165.f7189 = i12;
                    c3165.f7188 = i13;
                    c3165.m4990(c3189);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                c3165.f7187 = backStackRecordState.f7055;
                c3165.f7204 = backStackRecordState.f7059;
                c3165.f7201 = true;
                c3165.f7205 = backStackRecordState.f7057;
                c3165.f7202 = backStackRecordState.f7058;
                c3165.f7203 = backStackRecordState.f7054;
                c3165.f7195 = backStackRecordState.f7053;
                c3165.f7194 = backStackRecordState.f7052;
                c3165.f7198 = backStackRecordState.f7051;
                c3165.f7199 = backStackRecordState.f7050;
                c3165.f7193 = backStackRecordState.f7060;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((C3189) c3165.f7192.get(i15)).f7318 = c1171.m1536(str4);
                    }
                }
                c3165.m4989(1);
                if (m4922(i14)) {
                    StringBuilder sbM710 = AbstractC0900.m710(i3, "restoreAllState: back stack #", " (index ");
                    sbM710.append(c3165.f7193);
                    sbM710.append("): ");
                    sbM710.append(c3165);
                    Log.v("FragmentManager", sbM710.toString());
                    PrintWriter printWriter = new PrintWriter(new C3192());
                    c3165.m4986(printWriter, "  ", false);
                    printWriter.close();
                }
                this.f7128.add(c3165);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f7128 = null;
        }
        this.f7148.set(fragmentManagerState.f7074);
        String str5 = fragmentManagerState.f7073;
        if (str5 != null) {
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M15362 = c1171.m1536(str5);
            this.f7135 = abstractComponentCallbacksC3171M15362;
            m4958(abstractComponentCallbacksC3171M15362);
        }
        ArrayList arrayList3 = fragmentManagerState.f7076;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.f7149.put((String) arrayList3.get(i16), (BackStackState) fragmentManagerState.f7077.get(i16));
            }
        }
        this.f7114 = new ArrayDeque(fragmentManagerState.f7075);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m4929(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            C6755.m11870("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C3165) arrayList.get(i)).f7199) {
                if (i2 != i) {
                    m4937(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C3165) arrayList.get(i2)).f7199) {
                        i2++;
                    }
                }
                m4937(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m4937(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m4930() {
        return m4931(-1, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean m4931(int i, int i2) {
        m4939(false);
        m4953(true);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7135;
        if (abstractComponentCallbacksC3171 != null && i < 0 && abstractComponentCallbacksC3171.m5002().m4930()) {
            return true;
        }
        boolean zM4927 = m4927(this.f7120, this.f7111, i, i2);
        if (zM4927) {
            this.f7130 = true;
            try {
                m4929(this.f7120, this.f7111);
            } finally {
                m4946();
            }
        }
        m4968();
        m4954();
        ((HashMap) this.f7129.f1441).values().removeAll(Collections.singleton(null));
        return zM4927;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m4932() {
        if (this.f7136 == null) {
            return;
        }
        this.f7124 = false;
        this.f7123 = false;
        this.f7113.f7108 = false;
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null) {
                abstractComponentCallbacksC3171.f7241.m4932();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m4933(int i, boolean z) {
        C3152 c3152;
        if (this.f7136 == null && i != -1) {
            C6755.m11870("No activity");
            return;
        }
        if (z || i != this.f7132) {
            this.f7132 = i;
            C1171 c1171 = this.f7129;
            HashMap map = (HashMap) c1171.f1441;
            Iterator it = ((ArrayList) c1171.f1440).iterator();
            while (it.hasNext()) {
                C3137 c3137 = (C3137) map.get(((AbstractComponentCallbacksC3171) it.next()).f7246);
                if (c3137 != null) {
                    c3137.m4904();
                }
            }
            for (C3137 c31372 : map.values()) {
                if (c31372 != null) {
                    c31372.m4904();
                    AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c31372.f7099;
                    if (abstractComponentCallbacksC3171.f7237 && !abstractComponentCallbacksC3171.m5013()) {
                        c1171.m1518(c31372);
                    }
                }
            }
            m4972();
            if (this.f7125 && (c3152 = this.f7136) != null && this.f7132 == 7) {
                c3152.f7163.invalidateMenu();
                this.f7125 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ViewGroup m4934(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        ViewGroup viewGroup = abstractComponentCallbacksC3171.f7227;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC3171.f7230 <= 0 || !this.f7137.mo4976()) {
            return null;
        }
        View viewMo4977 = this.f7137.mo4977(abstractComponentCallbacksC3171.f7230);
        if (viewMo4977 instanceof ViewGroup) {
            return (ViewGroup) viewMo4977;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractComponentCallbacksC3171 m4935(String str) {
        C1171 c1171 = this.f7129;
        ArrayList arrayList = (ArrayList) c1171.f1440;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = (AbstractComponentCallbacksC3171) arrayList.get(size);
                if (abstractComponentCallbacksC3171 != null && str.equals(abstractComponentCallbacksC3171.f7233)) {
                    return abstractComponentCallbacksC3171;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C3137 c3137 : ((HashMap) c1171.f1441).values()) {
            if (c3137 != null) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = c3137.f7099;
                if (str.equals(abstractComponentCallbacksC31712.f7233)) {
                    return abstractComponentCallbacksC31712;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractComponentCallbacksC3171 m4936(int i) {
        C1171 c1171 = this.f7129;
        ArrayList arrayList = (ArrayList) c1171.f1440;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = (AbstractComponentCallbacksC3171) arrayList.get(size);
            if (abstractComponentCallbacksC3171 != null && abstractComponentCallbacksC3171.f7231 == i) {
                return abstractComponentCallbacksC3171;
            }
        }
        for (C3137 c3137 : ((HashMap) c1171.f1441).values()) {
            if (c3137 != null) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = c3137.f7099;
                if (abstractComponentCallbacksC31712.f7231 == i) {
                    return abstractComponentCallbacksC31712;
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
    */
    public final void m4937(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3;
        Object objPrevious;
        ViewGroup viewGroup;
        ArrayList arrayList4;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        C1171 c1171 = this.f7129;
        boolean z6 = ((C3165) arrayList.get(i)).f7199;
        ArrayList arrayList5 = this.f7110;
        if (arrayList5 == null) {
            this.f7110 = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.f7110.addAll(c1171.m1524());
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7135;
        int i7 = i;
        boolean z7 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z8 = z6;
                boolean z9 = z7;
                this.f7110.clear();
                if (!z8 && this.f7132 >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        Iterator it = ((C3165) arrayList.get(i9)).f7192.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = ((C3189) it.next()).f7318;
                            if (abstractComponentCallbacksC31712 != null && abstractComponentCallbacksC31712.f7243 != null) {
                                c1171.m1517(m4944(abstractComponentCallbacksC31712));
                            }
                        }
                    }
                }
                for (int i10 = i; i10 < i2; i10++) {
                    C3165 c3165 = (C3165) arrayList.get(i10);
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        c3165.m4989(-1);
                        AbstractC3146 abstractC3146 = c3165.f7196;
                        ArrayList arrayList6 = c3165.f7192;
                        boolean z10 = true;
                        for (int size = arrayList6.size() - 1; size >= 0; size--) {
                            C3189 c3189 = (C3189) arrayList6.get(size);
                            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31713 = c3189.f7318;
                            if (abstractComponentCallbacksC31713 != null) {
                                if (abstractComponentCallbacksC31713.f7262 != null) {
                                    abstractComponentCallbacksC31713.m5004().f7211 = z10;
                                }
                                int i11 = c3165.f7187;
                                int i12 = DexMap.TYPE_STRING_DATA_ITEM;
                                int i13 = DexMap.TYPE_TYPE_LIST;
                                if (i11 != 4097) {
                                    if (i11 != 8194) {
                                        i12 = 4100;
                                        i13 = DexMap.TYPE_ENCODED_ARRAY_ITEM;
                                        if (i11 != 8197) {
                                            i12 = i11 != 4099 ? i11 != 4100 ? 0 : i13 : 4099;
                                        }
                                    }
                                }
                                if (abstractComponentCallbacksC31713.f7262 != null || i12 != 0) {
                                    abstractComponentCallbacksC31713.m5004();
                                    abstractComponentCallbacksC31713.f7262.f7206 = i12;
                                }
                                abstractComponentCallbacksC31713.m5004();
                                abstractComponentCallbacksC31713.f7262.getClass();
                            }
                            switch (c3189.f7319) {
                                case 1:
                                    abstractComponentCallbacksC31713.m4993(c3189.f7316, c3189.f7315, c3189.f7314, c3189.f7321);
                                    z10 = true;
                                    abstractC3146.m4971(abstractComponentCallbacksC31713, true);
                                    abstractC3146.m4926(abstractComponentCallbacksC31713);
                                    break;
                                case 2:
                                default:
                                    C3775.m6952(c3189.f7319, "Unknown cmd: ");
                                    return;
                                case 3:
                                    abstractComponentCallbacksC31713.m4993(c3189.f7316, c3189.f7315, c3189.f7314, c3189.f7321);
                                    abstractC3146.m4949(abstractComponentCallbacksC31713);
                                    z10 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC31713.m4993(c3189.f7316, c3189.f7315, c3189.f7314, c3189.f7321);
                                    abstractC3146.getClass();
                                    m4923(abstractComponentCallbacksC31713);
                                    z10 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC31713.m4993(c3189.f7316, c3189.f7315, c3189.f7314, c3189.f7321);
                                    abstractC3146.m4971(abstractComponentCallbacksC31713, true);
                                    abstractC3146.m4941(abstractComponentCallbacksC31713);
                                    z10 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC31713.m4993(c3189.f7316, c3189.f7315, c3189.f7314, c3189.f7321);
                                    abstractC3146.m4947(abstractComponentCallbacksC31713);
                                    z10 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC31713.m4993(c3189.f7316, c3189.f7315, c3189.f7314, c3189.f7321);
                                    abstractC3146.m4971(abstractComponentCallbacksC31713, true);
                                    abstractC3146.m4963(abstractComponentCallbacksC31713);
                                    z10 = true;
                                    break;
                                case 8:
                                    abstractC3146.m4973(null);
                                    z10 = true;
                                    break;
                                case 9:
                                    abstractC3146.m4973(abstractComponentCallbacksC31713);
                                    z10 = true;
                                    break;
                                case 10:
                                    abstractC3146.m4970(abstractComponentCallbacksC31713, c3189.f7320);
                                    z10 = true;
                                    break;
                            }
                        }
                    } else {
                        c3165.m4989(1);
                        AbstractC3146 abstractC31462 = c3165.f7196;
                        ArrayList arrayList7 = c3165.f7192;
                        int size2 = arrayList7.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            C3189 c31892 = (C3189) arrayList7.get(i14);
                            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31714 = c31892.f7318;
                            if (abstractComponentCallbacksC31714 != null) {
                                if (abstractComponentCallbacksC31714.f7262 != null) {
                                    abstractComponentCallbacksC31714.m5004().f7211 = false;
                                }
                                int i15 = c3165.f7187;
                                if (abstractComponentCallbacksC31714.f7262 != null || i15 != 0) {
                                    abstractComponentCallbacksC31714.m5004();
                                    abstractComponentCallbacksC31714.f7262.f7206 = i15;
                                }
                                abstractComponentCallbacksC31714.m5004();
                                abstractComponentCallbacksC31714.f7262.getClass();
                            }
                            switch (c31892.f7319) {
                                case 1:
                                    abstractComponentCallbacksC31714.m4993(c31892.f7316, c31892.f7315, c31892.f7314, c31892.f7321);
                                    abstractC31462.m4971(abstractComponentCallbacksC31714, false);
                                    abstractC31462.m4949(abstractComponentCallbacksC31714);
                                    break;
                                case 2:
                                default:
                                    C3775.m6952(c31892.f7319, "Unknown cmd: ");
                                    return;
                                case 3:
                                    abstractComponentCallbacksC31714.m4993(c31892.f7316, c31892.f7315, c31892.f7314, c31892.f7321);
                                    abstractC31462.m4926(abstractComponentCallbacksC31714);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC31714.m4993(c31892.f7316, c31892.f7315, c31892.f7314, c31892.f7321);
                                    abstractC31462.m4941(abstractComponentCallbacksC31714);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC31714.m4993(c31892.f7316, c31892.f7315, c31892.f7314, c31892.f7321);
                                    abstractC31462.m4971(abstractComponentCallbacksC31714, false);
                                    m4923(abstractComponentCallbacksC31714);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC31714.m4993(c31892.f7316, c31892.f7315, c31892.f7314, c31892.f7321);
                                    abstractC31462.m4963(abstractComponentCallbacksC31714);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC31714.m4993(c31892.f7316, c31892.f7315, c31892.f7314, c31892.f7321);
                                    abstractC31462.m4971(abstractComponentCallbacksC31714, false);
                                    abstractC31462.m4947(abstractComponentCallbacksC31714);
                                    break;
                                case 8:
                                    abstractC31462.m4973(abstractComponentCallbacksC31714);
                                    break;
                                case 9:
                                    abstractC31462.m4973(null);
                                    break;
                                case 10:
                                    abstractC31462.m4970(abstractComponentCallbacksC31714, c31892.f7322);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                if (z9 && (arrayList4 = this.f7147) != null && !arrayList4.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C3165 c31652 = (C3165) it2.next();
                        HashSet hashSet = new HashSet();
                        for (int i16 = 0; i16 < c31652.f7192.size(); i16++) {
                            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31715 = ((C3189) c31652.f7192.get(i16)).f7318;
                            if (abstractComponentCallbacksC31715 != null && c31652.f7201) {
                                hashSet.add(abstractComponentCallbacksC31715);
                            }
                        }
                        linkedHashSet.addAll(hashSet);
                    }
                    Iterator it3 = this.f7147.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() != null) {
                            C3775.m6954();
                            return;
                        }
                        Iterator it4 = linkedHashSet.iterator();
                        if (it4.hasNext()) {
                            throw null;
                        }
                    }
                    Iterator it5 = this.f7147.iterator();
                    while (it5.hasNext()) {
                        if (it5.next() != null) {
                            C3775.m6954();
                            return;
                        }
                        Iterator it6 = linkedHashSet.iterator();
                        if (it6.hasNext()) {
                            throw null;
                        }
                    }
                }
                for (int i17 = i; i17 < i2; i17++) {
                    C3165 c31653 = (C3165) arrayList.get(i17);
                    if (zBooleanValue) {
                        for (int size3 = c31653.f7192.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31716 = ((C3189) c31653.f7192.get(size3)).f7318;
                            if (abstractComponentCallbacksC31716 != null) {
                                m4944(abstractComponentCallbacksC31716).m4904();
                            }
                        }
                    } else {
                        Iterator it7 = c31653.f7192.iterator();
                        while (it7.hasNext()) {
                            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31717 = ((C3189) it7.next()).f7318;
                            if (abstractComponentCallbacksC31717 != null) {
                                m4944(abstractComponentCallbacksC31717).m4904();
                            }
                        }
                    }
                }
                m4933(this.f7132, true);
                HashSet<C3182> hashSet2 = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it8 = ((C3165) arrayList.get(i18)).f7192.iterator();
                    while (it8.hasNext()) {
                        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31718 = ((C3189) it8.next()).f7318;
                        if (abstractComponentCallbacksC31718 != null && (viewGroup = abstractComponentCallbacksC31718.f7227) != null) {
                            hashSet2.add(C3182.m5027(viewGroup, this));
                        }
                    }
                }
                for (C3182 c3182 : hashSet2) {
                    c3182.f7299 = zBooleanValue;
                    synchronized (c3182.f7301) {
                        try {
                            c3182.m5033();
                            ArrayList arrayList8 = c3182.f7301;
                            ListIterator listIterator = arrayList8.listIterator(arrayList8.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    objPrevious = listIterator.previous();
                                    C3190 c3190 = (C3190) objPrevious;
                                    C3187 c3187 = SpecialEffectsController$Operation$State.Companion;
                                    View view = c3190.f7326.f7226;
                                    view.getClass();
                                    c3187.getClass();
                                    SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM5035 = C3187.m5035(view);
                                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c3190.f7328;
                                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
                                    if (specialEffectsController$Operation$State != specialEffectsController$Operation$State2 || specialEffectsController$Operation$StateM5035 == specialEffectsController$Operation$State2) {
                                    }
                                } else {
                                    objPrevious = null;
                                }
                            }
                            c3182.f7298 = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c3182.m5030();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C3165 c31654 = (C3165) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c31654.f7193 >= 0) {
                        c31654.f7193 = -1;
                    }
                    c31654.getClass();
                }
                if (!z9 || (arrayList3 = this.f7147) == null || arrayList3.size() <= 0) {
                    return;
                }
                this.f7147.get(0).getClass();
                C3775.m6954();
                return;
            }
            C3165 c31655 = (C3165) arrayList.get(i7);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i7)).booleanValue();
            ArrayList arrayList9 = this.f7110;
            if (zBooleanValue2) {
                z = z6;
                i3 = i7;
                z2 = z7;
                int i20 = 1;
                ArrayList arrayList10 = c31655.f7192;
                int size4 = arrayList10.size() - 1;
                while (size4 >= 0) {
                    C3189 c31893 = (C3189) arrayList10.get(size4);
                    int i21 = c31893.f7319;
                    if (i21 == i20) {
                        arrayList9.remove(c31893.f7318);
                    } else if (i21 != 3) {
                        switch (i21) {
                            case 6:
                                arrayList9.add(c31893.f7318);
                                break;
                            case 8:
                                abstractComponentCallbacksC3171 = null;
                                break;
                            case 9:
                                abstractComponentCallbacksC3171 = c31893.f7318;
                                break;
                            case 10:
                                c31893.f7322 = c31893.f7320;
                                break;
                        }
                    }
                    size4--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList11 = c31655.f7192;
                int i22 = 0;
                while (i22 < arrayList11.size()) {
                    C3189 c31894 = (C3189) arrayList11.get(i22);
                    int i23 = c31894.f7319;
                    if (i23 != i8) {
                        z3 = z6;
                        if (i23 != 2) {
                            if (i23 == 3 || i23 == 6) {
                                arrayList9.remove(c31894.f7318);
                                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31719 = c31894.f7318;
                                if (abstractComponentCallbacksC31719 == abstractComponentCallbacksC3171) {
                                    arrayList11.add(i22, new C3189(9, abstractComponentCallbacksC31719));
                                    i22++;
                                    i5 = i7;
                                    z4 = z7;
                                    i4 = 1;
                                    abstractComponentCallbacksC3171 = null;
                                }
                            } else if (i23 == 7) {
                                i4 = 1;
                            } else if (i23 == 8) {
                                arrayList11.add(i22, new C3189(9, abstractComponentCallbacksC3171, 0));
                                c31894.f7317 = true;
                                i22++;
                                abstractComponentCallbacksC3171 = c31894.f7318;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                        } else {
                            AbstractComponentCallbacksC3171 abstractComponentCallbacksC317110 = c31894.f7318;
                            int i24 = abstractComponentCallbacksC317110.f7230;
                            int size5 = arrayList9.size() - 1;
                            boolean z11 = false;
                            while (size5 >= 0) {
                                int i25 = size5;
                                AbstractComponentCallbacksC3171 abstractComponentCallbacksC317111 = (AbstractComponentCallbacksC3171) arrayList9.get(size5);
                                int i26 = i7;
                                if (abstractComponentCallbacksC317111.f7230 != i24) {
                                    z5 = z7;
                                } else if (abstractComponentCallbacksC317111 == abstractComponentCallbacksC317110) {
                                    z5 = z7;
                                    z11 = true;
                                } else {
                                    if (abstractComponentCallbacksC317111 == abstractComponentCallbacksC3171) {
                                        z5 = z7;
                                        i6 = 0;
                                        arrayList11.add(i22, new C3189(9, abstractComponentCallbacksC317111, 0));
                                        i22++;
                                        abstractComponentCallbacksC3171 = null;
                                    } else {
                                        z5 = z7;
                                        i6 = 0;
                                    }
                                    C3189 c31895 = new C3189(3, abstractComponentCallbacksC317111, i6);
                                    c31895.f7316 = c31894.f7316;
                                    c31895.f7314 = c31894.f7314;
                                    c31895.f7315 = c31894.f7315;
                                    c31895.f7321 = c31894.f7321;
                                    arrayList11.add(i22, c31895);
                                    arrayList9.remove(abstractComponentCallbacksC317111);
                                    i22++;
                                    abstractComponentCallbacksC3171 = abstractComponentCallbacksC3171;
                                }
                                size5 = i25 - 1;
                                z7 = z5;
                                i7 = i26;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                            if (z11) {
                                arrayList11.remove(i22);
                                i22--;
                            } else {
                                c31894.f7319 = 1;
                                c31894.f7317 = true;
                                arrayList9.add(abstractComponentCallbacksC317110);
                            }
                        }
                        i22 += i4;
                        i8 = i4;
                        z6 = z3;
                        z7 = z4;
                        i7 = i5;
                    } else {
                        z3 = z6;
                        i4 = i8;
                    }
                    i5 = i7;
                    z4 = z7;
                    arrayList9.add(c31894.f7318);
                    i22 += i4;
                    i8 = i4;
                    z6 = z3;
                    z7 = z4;
                    i7 = i5;
                }
                z = z6;
                i3 = i7;
                z2 = z7;
            }
            z7 = z2 || c31655.f7201;
            i7 = i3 + 1;
            z6 = z;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m4938(C3165 c3165, boolean z) {
        if (z && (this.f7136 == null || this.f7122)) {
            return;
        }
        m4953(z);
        c3165.mo4918(this.f7120, this.f7111);
        this.f7130 = true;
        try {
            m4929(this.f7120, this.f7111);
            m4946();
            m4968();
            m4954();
            ((HashMap) this.f7129.f1441).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m4946();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m4939(boolean z) {
        boolean zMo4918;
        ArrayList arrayList;
        m4953(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.f7120;
            ArrayList arrayList3 = this.f7111;
            synchronized (this.f7131) {
                if (this.f7131.isEmpty()) {
                    zMo4918 = false;
                } else {
                    try {
                        int size = this.f7131.size();
                        int i = 0;
                        zMo4918 = false;
                        while (true) {
                            arrayList = this.f7131;
                            if (i >= size) {
                                break;
                            }
                            zMo4918 |= ((InterfaceC3144) arrayList.get(i)).mo4918(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.f7136.f7164.removeCallbacks(this.f7112);
                    } finally {
                    }
                }
            }
            if (!zMo4918) {
                m4968();
                m4954();
                ((HashMap) this.f7129.f1441).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.f7130 = true;
            try {
                m4929(this.f7120, this.f7111);
            } finally {
                m4946();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final boolean m4940() {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7134;
        if (abstractComponentCallbacksC3171 == null) {
            return true;
        }
        return abstractComponentCallbacksC3171.m5020() && this.f7134.m5019().m4940();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m4941(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (m4922(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC3171);
        }
        if (abstractComponentCallbacksC3171.f7232) {
            return;
        }
        abstractComponentCallbacksC3171.f7232 = true;
        abstractComponentCallbacksC3171.f7261 = true ^ abstractComponentCallbacksC3171.f7261;
        m4974(abstractComponentCallbacksC3171);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C3156 m4942() {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7134;
        return abstractComponentCallbacksC3171 != null ? abstractComponentCallbacksC3171.f7243.m4942() : this.f7118;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C3157 m4943() {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7134;
        return abstractComponentCallbacksC3171 != null ? abstractComponentCallbacksC3171.f7243.m4943() : this.f7119;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3137 m4944(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        String str = abstractComponentCallbacksC3171.f7246;
        C1171 c1171 = this.f7129;
        C3137 c3137 = (C3137) ((HashMap) c1171.f1441).get(str);
        if (c3137 != null) {
            return c3137;
        }
        C3137 c31372 = new C3137(this.f7139, c1171, abstractComponentCallbacksC3171);
        c31372.m4898(this.f7136.f7161.getClassLoader());
        c31372.f7097 = this.f7132;
        return c31372;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashSet m4945() {
        C3182 c3182;
        HashSet hashSet = new HashSet();
        Iterator it = this.f7129.m1525().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C3137) it.next()).f7099.f7227;
            if (viewGroup != null) {
                m4942().getClass();
                Object tag = viewGroup.getTag(C0328R.id.special_effects_controller_view_tag);
                if (tag instanceof C3182) {
                    c3182 = (C3182) tag;
                } else {
                    c3182 = new C3182(viewGroup);
                    viewGroup.setTag(C0328R.id.special_effects_controller_view_tag, c3182);
                }
                hashSet.add(c3182);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4946() {
        this.f7130 = false;
        this.f7111.clear();
        this.f7120.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4947(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (m4922(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC3171);
        }
        if (abstractComponentCallbacksC3171.f7228) {
            abstractComponentCallbacksC3171.f7228 = false;
            if (abstractComponentCallbacksC3171.f7238) {
                return;
            }
            this.f7129.m1532(abstractComponentCallbacksC3171);
            if (m4922(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC3171);
            }
            if (m4921(abstractComponentCallbacksC3171)) {
                this.f7125 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4948(C3152 c3152, AbstractC9004 abstractC9004, AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (this.f7136 != null) {
            C6755.m11870("Already attached");
            return;
        }
        this.f7136 = c3152;
        this.f7137 = abstractC9004;
        this.f7134 = abstractComponentCallbacksC3171;
        if (abstractComponentCallbacksC3171 != null) {
            addFragmentOnAttachListener(new C3155(abstractComponentCallbacksC3171));
        } else if (c3152 != null) {
            addFragmentOnAttachListener(c3152);
        }
        if (this.f7134 != null) {
            m4968();
        }
        if (c3152 != null) {
            C0870 onBackPressedDispatcher = c3152.f7163.getOnBackPressedDispatcher();
            this.f7145 = onBackPressedDispatcher;
            onBackPressedDispatcher.m588(this.f7144, abstractComponentCallbacksC3171 != null ? abstractComponentCallbacksC3171 : c3152);
        }
        int i = 0;
        if (abstractComponentCallbacksC3171 != null) {
            C3139 c3139 = abstractComponentCallbacksC3171.f7243.f7113;
            HashMap map = c3139.f7106;
            C3139 c31392 = (C3139) map.get(abstractComponentCallbacksC3171.f7246);
            if (c31392 == null) {
                c31392 = new C3139(c3139.f7104);
                map.put(abstractComponentCallbacksC3171.f7246, c31392);
            }
            this.f7113 = c31392;
        } else if (c3152 != null) {
            C3256 viewModelStore = c3152.f7163.getViewModelStore();
            viewModelStore.getClass();
            C8466 c8466 = C8466.f21070;
            c8466.getClass();
            C1171 c1171 = new C1171(viewModelStore, C3139.f7102, c8466);
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C3139.class);
            String strMo9444 = interfaceC5925Mo9476.mo9444();
            if (strMo9444 == null) {
                C6755.m11869("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.f7113 = (C3139) c1171.m1519("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo9444), interfaceC5925Mo9476);
        } else {
            this.f7113 = new C3139(false);
        }
        C3139 c31393 = this.f7113;
        int i2 = 1;
        c31393.f7108 = this.f7124 || this.f7123;
        this.f7129.f1438 = c31393;
        C3152 c31522 = this.f7136;
        if (c31522 != null && abstractComponentCallbacksC3171 == null) {
            C8368 savedStateRegistry = c31522.f7163.getSavedStateRegistry();
            savedStateRegistry.m13320("android:support:fragments", new C3168((C3142) this, i2));
            Bundle bundleM13322 = savedStateRegistry.m13322("android:support:fragments");
            if (bundleM13322 != null) {
                m4928(bundleM13322);
            }
        }
        C3152 c31523 = this.f7136;
        if (c31523 != null) {
            AbstractC8558 activityResultRegistry = c31523.f7163.getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(abstractComponentCallbacksC3171 != null ? AbstractC0900.m711(new StringBuilder(), abstractComponentCallbacksC3171.f7246, ":") : "");
            int i3 = 2;
            C3142 c3142 = (C3142) this;
            this.f7117 = activityResultRegistry.m13605(strConcat.concat("StartActivityForResult"), new C3154(i3), new C3159(c3142, i2));
            this.f7116 = activityResultRegistry.m13605(strConcat.concat("StartIntentSenderForResult"), new C3154(i), new C3159(c3142, i3));
            this.f7115 = activityResultRegistry.m13605(strConcat.concat("RequestPermissions"), new C3154(i2), new C3159(c3142, i));
        }
        C3152 c31524 = this.f7136;
        if (c31524 != null) {
            c31524.addOnConfigurationChangedListener(this.f7142);
        }
        C3152 c31525 = this.f7136;
        if (c31525 != null) {
            c31525.f7163.addOnTrimMemoryListener(this.f7143);
        }
        C3152 c31526 = this.f7136;
        if (c31526 != null) {
            c31526.f7163.addOnMultiWindowModeChangedListener(this.f7140);
        }
        C3152 c31527 = this.f7136;
        if (c31527 != null) {
            c31527.f7163.addOnPictureInPictureModeChangedListener(this.f7141);
        }
        C3152 c31528 = this.f7136;
        if (c31528 == null || abstractComponentCallbacksC3171 != null) {
            return;
        }
        c31528.f7163.addMenuProvider(this.f7133);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3137 m4949(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        String str = abstractComponentCallbacksC3171.f7266;
        if (str != null) {
            AbstractC8451.m13413(abstractComponentCallbacksC3171, str);
        }
        if (m4922(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC3171);
        }
        C3137 c3137M4944 = m4944(abstractComponentCallbacksC3171);
        abstractComponentCallbacksC3171.f7243 = this;
        C1171 c1171 = this.f7129;
        c1171.m1517(c3137M4944);
        if (!abstractComponentCallbacksC3171.f7228) {
            c1171.m1532(abstractComponentCallbacksC3171);
            abstractComponentCallbacksC3171.f7237 = false;
            if (abstractComponentCallbacksC3171.f7226 == null) {
                abstractComponentCallbacksC3171.f7261 = false;
            }
            if (m4921(abstractComponentCallbacksC3171)) {
                this.f7125 = true;
            }
        }
        return c3137M4944;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m4950(int i) {
        try {
            this.f7130 = true;
            for (C3137 c3137 : ((HashMap) this.f7129.f1441).values()) {
                if (c3137 != null) {
                    c3137.f7097 = i;
                }
            }
            m4933(i, false);
            Iterator it = m4945().iterator();
            while (it.hasNext()) {
                ((C3182) it.next()).m5028();
            }
            this.f7130 = false;
            m4939(true);
        } catch (Throwable th) {
            this.f7130 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m4951() {
        if (this.f7132 < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null && m4920(abstractComponentCallbacksC3171)) {
                if (!abstractComponentCallbacksC3171.f7232 ? abstractComponentCallbacksC3171.f7241.m4951() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m4952(InterfaceC3144 interfaceC3144, boolean z) {
        if (!z) {
            if (this.f7136 == null) {
                if (this.f7122) {
                    C6755.m11870("FragmentManager has been destroyed");
                    return;
                } else {
                    C6755.m11870("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.f7124 || this.f7123) {
                C6755.m11870("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f7131) {
            try {
                if (this.f7136 == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f7131.add(interfaceC3144);
                    m4925();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m4953(boolean z) {
        if (this.f7130) {
            C6755.m11870("FragmentManager is already executing transactions");
            return;
        }
        if (this.f7136 == null) {
            if (this.f7122) {
                C6755.m11870("FragmentManager has been destroyed");
                return;
            } else {
                C6755.m11870("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f7136.f7164.getLooper()) {
            C6755.m11870("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.f7124 || this.f7123)) {
            C6755.m11870("Can not perform this action after onSaveInstanceState");
        } else if (this.f7120 == null) {
            this.f7120 = new ArrayList();
            this.f7111 = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m4954() {
        if (this.f7121) {
            this.f7121 = false;
            m4972();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m4955(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strM696 = AbstractC0900.m696(str, "    ");
        C1171 c1171 = this.f7129;
        ArrayList arrayList = (ArrayList) c1171.f1440;
        String strM6962 = AbstractC0900.m696(str, "    ");
        HashMap map = (HashMap) c1171.f1441;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C3137 c3137 : map.values()) {
                printWriter.print(str);
                if (c3137 != null) {
                    AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
                    printWriter.println(abstractComponentCallbacksC3171);
                    abstractComponentCallbacksC3171.getClass();
                    printWriter.print(strM6962);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC3171.f7231));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC3171.f7230));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC3171.f7233);
                    printWriter.print(strM6962);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC3171.f7254);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC3171.f7246);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC3171.f7244);
                    printWriter.print(strM6962);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC3171.f7238);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC3171.f7237);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC3171.f7236);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC3171.f7235);
                    printWriter.print(strM6962);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC3171.f7232);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC3171.f7228);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC3171.f7225);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strM6962);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC3171.f7229);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC3171.f7223);
                    if (abstractComponentCallbacksC3171.f7243 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC3171.f7243);
                    }
                    if (abstractComponentCallbacksC3171.f7242 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC3171.f7242);
                    }
                    if (abstractComponentCallbacksC3171.f7240 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC3171.f7240);
                    }
                    if (abstractComponentCallbacksC3171.f7250 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC3171.f7250);
                    }
                    if (abstractComponentCallbacksC3171.f7252 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC3171.f7252);
                    }
                    if (abstractComponentCallbacksC3171.f7253 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC3171.f7253);
                    }
                    if (abstractComponentCallbacksC3171.f7247 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC3171.f7247);
                    }
                    Object objM1536 = abstractComponentCallbacksC3171.f7251;
                    if (objM1536 == null) {
                        AbstractC3146 abstractC3146 = abstractComponentCallbacksC3171.f7243;
                        objM1536 = (abstractC3146 == null || (str2 = abstractComponentCallbacksC3171.f7248) == null) ? null : abstractC3146.f7129.m1536(str2);
                    }
                    if (objM1536 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mTarget=");
                        printWriter.print(objM1536);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC3171.f7249);
                    }
                    printWriter.print(strM6962);
                    printWriter.print("mPopDirection=");
                    C3167 c3167 = abstractComponentCallbacksC3171.f7262;
                    printWriter.println(c3167 == null ? false : c3167.f7211);
                    C3167 c31672 = abstractComponentCallbacksC3171.f7262;
                    if ((c31672 == null ? 0 : c31672.f7210) != 0) {
                        printWriter.print(strM6962);
                        printWriter.print("getEnterAnim=");
                        C3167 c31673 = abstractComponentCallbacksC3171.f7262;
                        printWriter.println(c31673 == null ? 0 : c31673.f7210);
                    }
                    C3167 c31674 = abstractComponentCallbacksC3171.f7262;
                    if ((c31674 == null ? 0 : c31674.f7209) != 0) {
                        printWriter.print(strM6962);
                        printWriter.print("getExitAnim=");
                        C3167 c31675 = abstractComponentCallbacksC3171.f7262;
                        printWriter.println(c31675 == null ? 0 : c31675.f7209);
                    }
                    C3167 c31676 = abstractComponentCallbacksC3171.f7262;
                    if ((c31676 == null ? 0 : c31676.f7208) != 0) {
                        printWriter.print(strM6962);
                        printWriter.print("getPopEnterAnim=");
                        C3167 c31677 = abstractComponentCallbacksC3171.f7262;
                        printWriter.println(c31677 == null ? 0 : c31677.f7208);
                    }
                    C3167 c31678 = abstractComponentCallbacksC3171.f7262;
                    if ((c31678 == null ? 0 : c31678.f7207) != 0) {
                        printWriter.print(strM6962);
                        printWriter.print("getPopExitAnim=");
                        C3167 c31679 = abstractComponentCallbacksC3171.f7262;
                        printWriter.println(c31679 == null ? 0 : c31679.f7207);
                    }
                    if (abstractComponentCallbacksC3171.f7227 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC3171.f7227);
                    }
                    if (abstractComponentCallbacksC3171.f7226 != null) {
                        printWriter.print(strM6962);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC3171.f7226);
                    }
                    if (abstractComponentCallbacksC3171.m5001() != null) {
                        C3256 viewModelStore = abstractComponentCallbacksC3171.getViewModelStore();
                        C8374 c8374 = C8373.f20770;
                        viewModelStore.getClass();
                        C8466 c8466 = C8466.f21070;
                        c8466.getClass();
                        C1171 c11712 = new C1171(viewModelStore, c8374, c8466);
                        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8373.class);
                        String strMo9444 = interfaceC5925Mo9476.mo9444();
                        if (strMo9444 == null) {
                            C6755.m11869("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                        C1129 c1129 = ((C8373) c11712.m1519("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo9444), interfaceC5925Mo9476)).f20771;
                        if (c1129.f1336 > 0) {
                            printWriter.print(strM6962);
                            printWriter.println("Loaders:");
                            if (c1129.f1336 > 0) {
                                if (c1129.m1417(0) != null) {
                                    C3775.m6954();
                                    return;
                                }
                                printWriter.print(strM6962);
                                printWriter.print("  #");
                                printWriter.print(c1129.f1337[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strM6962);
                    printWriter.println("Child " + abstractComponentCallbacksC3171.f7241 + ":");
                    abstractComponentCallbacksC3171.f7241.m4955(strM6962.concat("  "), fileDescriptor, printWriter, strArr);
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
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = (AbstractComponentCallbacksC3171) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC31712.toString());
            }
        }
        ArrayList arrayList2 = this.f7127;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31713 = (AbstractComponentCallbacksC3171) this.f7127.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC31713.toString());
            }
        }
        ArrayList arrayList3 = this.f7128;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C3165 c3165 = (C3165) this.f7128.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c3165.toString());
                c3165.m4986(printWriter, strM696, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f7148.get());
        synchronized (this.f7131) {
            try {
                int size4 = this.f7131.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC3144) this.f7131.get(i4);
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
        printWriter.println(this.f7136);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f7137);
        if (this.f7134 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f7134);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f7132);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f7124);
        printWriter.print(" mStopped=");
        printWriter.print(this.f7123);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f7122);
        if (this.f7125) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f7125);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4956() {
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1528()) {
            if (abstractComponentCallbacksC3171 != null) {
                abstractComponentCallbacksC3171.m5021();
                abstractComponentCallbacksC3171.f7241.m4956();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4957(boolean z) {
        if (z && this.f7136 != null) {
            m4969(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null && z) {
                abstractComponentCallbacksC3171.f7241.m4957(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4958(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (abstractComponentCallbacksC3171 != null) {
            if (abstractComponentCallbacksC3171 != this.f7129.m1536(abstractComponentCallbacksC3171.f7246)) {
                return;
            }
            abstractComponentCallbacksC3171.f7243.getClass();
            boolean zM4919 = m4919(abstractComponentCallbacksC3171);
            Boolean bool = abstractComponentCallbacksC3171.f7239;
            if (bool == null || bool.booleanValue() != zM4919) {
                abstractComponentCallbacksC3171.f7239 = Boolean.valueOf(zM4919);
                C3142 c3142 = abstractComponentCallbacksC3171.f7241;
                c3142.m4968();
                c3142.m4958(c3142.f7135);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m4959(boolean z) {
        if (z && this.f7136 != null) {
            m4969(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null && z) {
                abstractComponentCallbacksC3171.f7241.m4959(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m4960() {
        if (this.f7132 >= 1) {
            for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
                if (abstractComponentCallbacksC3171 != null) {
                    if (!abstractComponentCallbacksC3171.f7232 ? abstractComponentCallbacksC3171.f7241.m4960() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4961() {
        if (this.f7132 < 1) {
            return;
        }
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null && !abstractComponentCallbacksC3171.f7232) {
                abstractComponentCallbacksC3171.f7241.m4961();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4962(boolean z) {
        if (z && this.f7136 != null) {
            m4969(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null) {
                abstractComponentCallbacksC3171.f7224 = true;
                if (z) {
                    abstractComponentCallbacksC3171.f7241.m4962(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4963(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (m4922(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC3171);
        }
        if (abstractComponentCallbacksC3171.f7228) {
            return;
        }
        abstractComponentCallbacksC3171.f7228 = true;
        if (abstractComponentCallbacksC3171.f7238) {
            if (m4922(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC3171);
            }
            C1171 c1171 = this.f7129;
            synchronized (((ArrayList) c1171.f1440)) {
                ((ArrayList) c1171.f1440).remove(abstractComponentCallbacksC3171);
            }
            abstractComponentCallbacksC3171.f7238 = false;
            if (m4921(abstractComponentCallbacksC3171)) {
                this.f7125 = true;
            }
            m4974(abstractComponentCallbacksC3171);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4964() {
        boolean zIsChangingConfigurations = true;
        this.f7122 = true;
        m4939(true);
        Iterator it = m4945().iterator();
        while (it.hasNext()) {
            ((C3182) it.next()).m5028();
        }
        C3152 c3152 = this.f7136;
        C1171 c1171 = this.f7129;
        if (c3152 != null) {
            zIsChangingConfigurations = ((C3139) c1171.f1438).f7103;
        } else {
            FragmentActivity fragmentActivity = c3152.f7161;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f7149.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((BackStackState) it2.next()).f7065) {
                    C3139 c3139 = (C3139) c1171.f1438;
                    c3139.getClass();
                    if (m4922(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c3139.m4910(str);
                }
            }
        }
        m4950(-1);
        C3152 c31522 = this.f7136;
        if (c31522 != null) {
            c31522.f7163.removeOnTrimMemoryListener(this.f7143);
        }
        C3152 c31523 = this.f7136;
        if (c31523 != null) {
            c31523.removeOnConfigurationChangedListener(this.f7142);
        }
        C3152 c31524 = this.f7136;
        if (c31524 != null) {
            c31524.f7163.removeOnMultiWindowModeChangedListener(this.f7140);
        }
        C3152 c31525 = this.f7136;
        if (c31525 != null) {
            c31525.f7163.removeOnPictureInPictureModeChangedListener(this.f7141);
        }
        C3152 c31526 = this.f7136;
        if (c31526 != null && this.f7134 == null) {
            c31526.f7163.removeMenuProvider(this.f7133);
        }
        this.f7136 = null;
        this.f7137 = null;
        this.f7134 = null;
        if (this.f7145 != null) {
            this.f7144.m625();
            this.f7145 = null;
        }
        C8559 c8559 = this.f7117;
        if (c8559 != null) {
            c8559.f21334.m13603(c8559.f21333);
            C8559 c85592 = this.f7116;
            c85592.f21334.m13603(c85592.f21333);
            C8559 c85593 = this.f7115;
            c85593.f21334.m13603(c85593.f21333);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4965(boolean z) {
        if (z && this.f7136 != null) {
            m4969(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null) {
                abstractComponentCallbacksC3171.f7224 = true;
                if (z) {
                    abstractComponentCallbacksC3171.f7241.m4965(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m4966() {
        if (this.f7132 >= 1) {
            for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
                if (abstractComponentCallbacksC3171 != null) {
                    if (!abstractComponentCallbacksC3171.f7232 ? abstractComponentCallbacksC3171.f7241.m4966() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m4967() {
        if (this.f7132 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : this.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null && m4920(abstractComponentCallbacksC3171)) {
                if (!abstractComponentCallbacksC3171.f7232 ? abstractComponentCallbacksC3171.f7241.m4967() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC3171);
                    z = true;
                }
            }
        }
        if (this.f7127 != null) {
            for (int i = 0; i < this.f7127.size(); i++) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = (AbstractComponentCallbacksC3171) this.f7127.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC31712)) {
                    abstractComponentCallbacksC31712.getClass();
                }
            }
        }
        this.f7127 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m4968() {
        synchronized (this.f7131) {
            try {
                if (!this.f7131.isEmpty()) {
                    this.f7144.m624(true);
                    return;
                }
                C0869 c0869 = this.f7144;
                ArrayList arrayList = this.f7128;
                c0869.m624((arrayList != null ? arrayList.size() : 0) > 0 && m4919(this.f7134));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m4969(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C3192());
        C3152 c3152 = this.f7136;
        if (c3152 == null) {
            try {
                m4955("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c3152.f7163.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m4970(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, Lifecycle$State lifecycle$State) {
        if (abstractComponentCallbacksC3171 == this.f7129.m1536(abstractComponentCallbacksC3171.f7246) && (abstractComponentCallbacksC3171.f7242 == null || abstractComponentCallbacksC3171.f7243 == this)) {
            abstractComponentCallbacksC3171.f7263 = lifecycle$State;
        } else {
            C6385.m11433("Fragment ", abstractComponentCallbacksC3171, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m4971(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, boolean z) {
        ViewGroup viewGroupM4934 = m4934(abstractComponentCallbacksC3171);
        if (viewGroupM4934 == null || !(viewGroupM4934 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM4934).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m4972() {
        for (C3137 c3137 : this.f7129.m1525()) {
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
            if (abstractComponentCallbacksC3171.f7222) {
                if (this.f7130) {
                    this.f7121 = true;
                } else {
                    abstractComponentCallbacksC3171.f7222 = false;
                    c3137.m4904();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m4973(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (abstractComponentCallbacksC3171 != null) {
            if (abstractComponentCallbacksC3171 != this.f7129.m1536(abstractComponentCallbacksC3171.f7246) || (abstractComponentCallbacksC3171.f7242 != null && abstractComponentCallbacksC3171.f7243 != this)) {
                C6385.m11433("Fragment ", abstractComponentCallbacksC3171, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = this.f7135;
        this.f7135 = abstractComponentCallbacksC3171;
        m4958(abstractComponentCallbacksC31712);
        m4958(this.f7135);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m4974(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        ViewGroup viewGroupM4934 = m4934(abstractComponentCallbacksC3171);
        if (viewGroupM4934 != null) {
            C3167 c3167 = abstractComponentCallbacksC3171.f7262;
            if ((c3167 == null ? 0 : c3167.f7207) + (c3167 == null ? 0 : c3167.f7208) + (c3167 == null ? 0 : c3167.f7209) + (c3167 == null ? 0 : c3167.f7210) > 0) {
                if (viewGroupM4934.getTag(C0328R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM4934.setTag(C0328R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC3171);
                }
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = (AbstractComponentCallbacksC3171) viewGroupM4934.getTag(C0328R.id.visible_removing_fragment_view_tag);
                C3167 c31672 = abstractComponentCallbacksC3171.f7262;
                boolean z = c31672 != null ? c31672.f7211 : false;
                if (abstractComponentCallbacksC31712.f7262 == null) {
                    return;
                }
                abstractComponentCallbacksC31712.m5004().f7211 = z;
            }
        }
    }
}

package p000;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0029a;
import androidx.fragment.app.C0035a;
import androidx.fragment.app.FragmentContainerView;
import com.ljx.wechatmod.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: am */
/* JADX INFO: loaded from: classes.dex */
public final class C0023am {

    /* JADX INFO: renamed from: A */
    public boolean f87A;

    /* JADX INFO: renamed from: B */
    public boolean f88B;

    /* JADX INFO: renamed from: C */
    public ArrayList f89C;

    /* JADX INFO: renamed from: D */
    public ArrayList f90D;

    /* JADX INFO: renamed from: E */
    public ArrayList f91E;

    /* JADX INFO: renamed from: F */
    public C0109cm f92F;

    /* JADX INFO: renamed from: G */
    public final RunnableC0325i7 f93G;

    /* JADX INFO: renamed from: b */
    public boolean f95b;

    /* JADX INFO: renamed from: d */
    public ArrayList f97d;

    /* JADX INFO: renamed from: e */
    public ArrayList f98e;

    /* JADX INFO: renamed from: g */
    public C0029a f100g;

    /* JADX INFO: renamed from: k */
    public final C0138d4 f104k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f105l;

    /* JADX INFO: renamed from: m */
    public int f106m;

    /* JADX INFO: renamed from: n */
    public C0600pl f107n;

    /* JADX INFO: renamed from: o */
    public AbstractC0259gf f108o;

    /* JADX INFO: renamed from: p */
    public AbstractComponentCallbacksC0563ol f109p;

    /* JADX INFO: renamed from: q */
    public AbstractComponentCallbacksC0563ol f110q;

    /* JADX INFO: renamed from: r */
    public final C0822vl f111r;

    /* JADX INFO: renamed from: s */
    public final C0893xh f112s;

    /* JADX INFO: renamed from: t */
    public C0138d4 f113t;

    /* JADX INFO: renamed from: u */
    public C0138d4 f114u;

    /* JADX INFO: renamed from: v */
    public C0138d4 f115v;

    /* JADX INFO: renamed from: w */
    public ArrayDeque f116w;

    /* JADX INFO: renamed from: x */
    public boolean f117x;

    /* JADX INFO: renamed from: y */
    public boolean f118y;

    /* JADX INFO: renamed from: z */
    public boolean f119z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f94a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C0658r5 f96c = new C0658r5();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0711sl f99f = new LayoutInflaterFactory2C0711sl(this);

    /* JADX INFO: renamed from: h */
    public final C0785ul f101h = new C0785ul(this);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f102i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map f103j = Collections.synchronizedMap(new HashMap());

    public C0023am() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new C0893xh(this);
        this.f104k = new C0138d4(this);
        this.f105l = new CopyOnWriteArrayList();
        this.f106m = -1;
        this.f111r = new C0822vl(this);
        this.f112s = new C0893xh(26);
        this.f116w = new ArrayDeque();
        this.f93G = new RunnableC0325i7(7, this);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m55A(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m56B(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        abstractComponentCallbacksC0563ol.getClass();
        C0658r5 c0658r5 = abstractComponentCallbacksC0563ol.f3505t.f96c;
        c0658r5.getClass();
        ArrayList arrayList = new ArrayList();
        for (C0035a c0035a : ((HashMap) c0658r5.f4064b).values()) {
            if (c0035a != null) {
                arrayList.add(c0035a.f469c);
            } else {
                arrayList.add(null);
            }
        }
        int size = arrayList.size();
        boolean zM56B = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = (AbstractComponentCallbacksC0563ol) obj;
            if (abstractComponentCallbacksC0563ol2 != null) {
                zM56B = m56B(abstractComponentCallbacksC0563ol2);
            }
            if (zM56B) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m57C(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (abstractComponentCallbacksC0563ol == null) {
            return true;
        }
        if (abstractComponentCallbacksC0563ol.f3471B) {
            return abstractComponentCallbacksC0563ol.f3503r == null || m57C(abstractComponentCallbacksC0563ol.f3506u);
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m58D(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (abstractComponentCallbacksC0563ol == null) {
            return true;
        }
        C0023am c0023am = abstractComponentCallbacksC0563ol.f3503r;
        return abstractComponentCallbacksC0563ol.equals(c0023am.f110q) && m58D(c0023am.f109p);
    }

    /* JADX INFO: renamed from: R */
    public static void m59R(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (m55A(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0563ol);
        }
        if (abstractComponentCallbacksC0563ol.f3510y) {
            abstractComponentCallbacksC0563ol.f3510y = false;
            abstractComponentCallbacksC0563ol.f3478I = !abstractComponentCallbacksC0563ol.f3478I;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m60E(int i, boolean z) {
        C0600pl c0600pl;
        if (this.f107n == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f106m) {
            this.f106m = i;
            C0658r5 c0658r5 = this.f96c;
            HashMap map = (HashMap) c0658r5.f4064b;
            ArrayList arrayList = (ArrayList) c0658r5.f4065c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C0035a c0035a = (C0035a) map.get(((AbstractComponentCallbacksC0563ol) obj).f3490e);
                if (c0035a != null) {
                    c0035a.m249k();
                }
            }
            for (C0035a c0035a2 : map.values()) {
                if (c0035a2 != null) {
                    c0035a2.m249k();
                    AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a2.f469c;
                    if (abstractComponentCallbacksC0563ol.f3497l && abstractComponentCallbacksC0563ol.f3502q <= 0) {
                        c0658r5.m2250w(c0035a2);
                    }
                }
            }
            m73S();
            if (this.f117x && (c0600pl = this.f107n) != null && this.f106m == 7) {
                c0600pl.f3726C.mo114f();
                this.f117x = false;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m61F() {
        if (this.f107n == null) {
            return;
        }
        this.f118y = false;
        this.f119z = false;
        this.f92F.f909h = false;
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                abstractComponentCallbacksC0563ol.f3505t.m61F();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m62G() {
        m94t(false);
        m93s(true);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f110q;
        if (abstractComponentCallbacksC0563ol != null && abstractComponentCallbacksC0563ol.m2036g().m62G()) {
            return true;
        }
        boolean zM63H = m63H(this.f89C, this.f90D, -1, 0);
        if (zM63H) {
            this.f95b = true;
            try {
                m65J(this.f89C, this.f90D);
            } finally {
                m78d();
            }
        }
        m74T();
        if (this.f88B) {
            this.f88B = false;
            m73S();
        }
        ((HashMap) this.f96c.f4064b).values().removeAll(Collections.singleton(null));
        return zM63H;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m63H(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int size;
        C0438l7 c0438l7;
        ArrayList arrayList3 = this.f97d;
        if (arrayList3 == null) {
            return false;
        }
        if (i < 0 && (i2 & 1) == 0) {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f97d.remove(size2));
            arrayList2.add(Boolean.TRUE);
            return true;
        }
        if (i >= 0) {
            size = arrayList3.size() - 1;
            while (size >= 0) {
                C0438l7 c0438l72 = (C0438l7) this.f97d.get(size);
                if (i >= 0 && i == c0438l72.f2964r) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return false;
            }
            if ((i2 & 1) != 0) {
                do {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    c0438l7 = (C0438l7) this.f97d.get(size);
                    if (i < 0) {
                        break;
                    }
                } while (i == c0438l7.f2964r);
            }
        } else {
            size = -1;
        }
        if (size == this.f97d.size() - 1) {
            return false;
        }
        for (int size3 = this.f97d.size() - 1; size3 > size; size3--) {
            arrayList.add(this.f97d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final void m64I(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (m55A(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0563ol + " nesting=" + abstractComponentCallbacksC0563ol.f3502q);
        }
        boolean z = abstractComponentCallbacksC0563ol.f3502q > 0;
        if (abstractComponentCallbacksC0563ol.f3511z && z) {
            return;
        }
        C0658r5 c0658r5 = this.f96c;
        synchronized (((ArrayList) c0658r5.f4065c)) {
            ((ArrayList) c0658r5.f4065c).remove(abstractComponentCallbacksC0563ol);
        }
        abstractComponentCallbacksC0563ol.f3496k = false;
        if (m56B(abstractComponentCallbacksC0563ol)) {
            this.f117x = true;
        }
        abstractComponentCallbacksC0563ol.f3497l = true;
        m72Q(abstractComponentCallbacksC0563ol);
    }

    /* JADX INFO: renamed from: J */
    public final void m65J(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((C0438l7) arrayList.get(i)).f2961o) {
                if (i2 != i) {
                    m95u(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0438l7) arrayList.get(i2)).f2961o) {
                        i2++;
                    }
                }
                m95u(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m95u(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m66K(Parcelable parcelable) {
        C0138d4 c0138d4;
        int i;
        int i2;
        C0035a c0035a;
        if (parcelable == null) {
            return;
        }
        C0073bm c0073bm = (C0073bm) parcelable;
        if (c0073bm.f737a == null) {
            return;
        }
        C0658r5 c0658r5 = this.f96c;
        ((HashMap) c0658r5.f4064b).clear();
        ArrayList arrayList = c0073bm.f737a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            c0138d4 = this.f104k;
            i = 2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            C0192em c0192em = (C0192em) obj;
            if (c0192em != null) {
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = (AbstractComponentCallbacksC0563ol) this.f92F.f904c.get(c0192em.f1593b);
                if (abstractComponentCallbacksC0563ol != null) {
                    if (m55A(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0563ol);
                    }
                    c0035a = new C0035a(c0138d4, c0658r5, abstractComponentCallbacksC0563ol, c0192em);
                } else {
                    c0035a = new C0035a(this.f104k, this.f96c, this.f107n.f3728z.getClassLoader(), m98x(), c0192em);
                }
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = c0035a.f469c;
                abstractComponentCallbacksC0563ol2.f3503r = this;
                if (m55A(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0563ol2.f3490e + "): " + abstractComponentCallbacksC0563ol2);
                }
                c0035a.m251m(this.f107n.f3728z.getClassLoader());
                c0658r5.m2249v(c0035a);
                c0035a.f471e = this.f106m;
            }
        }
        C0109cm c0109cm = this.f92F;
        c0109cm.getClass();
        ArrayList arrayList2 = new ArrayList(c0109cm.f904c.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol3 = (AbstractComponentCallbacksC0563ol) obj2;
            if (((HashMap) c0658r5.f4064b).get(abstractComponentCallbacksC0563ol3.f3490e) == null) {
                if (m55A(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0563ol3 + " that was not found in the set of active Fragments " + c0073bm.f737a);
                }
                this.f92F.m652b(abstractComponentCallbacksC0563ol3);
                abstractComponentCallbacksC0563ol3.f3503r = this;
                C0035a c0035a2 = new C0035a(c0138d4, c0658r5, abstractComponentCallbacksC0563ol3);
                c0035a2.f471e = 1;
                c0035a2.m249k();
                abstractComponentCallbacksC0563ol3.f3497l = true;
                c0035a2.m249k();
            }
        }
        ArrayList arrayList3 = c0073bm.f738b;
        ((ArrayList) c0658r5.f4065c).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str = (String) obj3;
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM2235g = c0658r5.m2235g(str);
                if (abstractComponentCallbacksC0563olM2235g == null) {
                    throw new IllegalStateException(g40.m1147j("No instantiated fragment for (", str, ")"));
                }
                if (m55A(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + abstractComponentCallbacksC0563olM2235g);
                }
                c0658r5.m2229a(abstractComponentCallbacksC0563olM2235g);
            }
        }
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol4 = null;
        if (c0073bm.f739c != null) {
            this.f97d = new ArrayList(c0073bm.f739c.length);
            int i6 = 0;
            while (true) {
                C0475m7[] c0475m7Arr = c0073bm.f739c;
                if (i6 >= c0475m7Arr.length) {
                    break;
                }
                C0475m7 c0475m7 = c0475m7Arr[i6];
                int[] iArr = c0475m7.f3083a;
                C0438l7 c0438l7 = new C0438l7(this);
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    C0266gm c0266gm = new C0266gm();
                    int i9 = i7 + 1;
                    int i10 = i;
                    c0266gm.f2028a = iArr[i7];
                    if (m55A(i10)) {
                        Log.v("FragmentManager", "Instantiate " + c0438l7 + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    String str2 = (String) c0475m7.f3084b.get(i8);
                    if (str2 != null) {
                        c0266gm.f2029b = c0658r5.m2235g(str2);
                    } else {
                        c0266gm.f2029b = abstractComponentCallbacksC0563ol4;
                    }
                    c0266gm.f2034g = EnumC0531nq.values()[c0475m7.f3085c[i8]];
                    c0266gm.f2035h = EnumC0531nq.values()[c0475m7.f3086d[i8]];
                    int i11 = iArr[i9];
                    c0266gm.f2030c = i11;
                    int i12 = iArr[i7 + 2];
                    c0266gm.f2031d = i12;
                    int i13 = i7 + 4;
                    int i14 = iArr[i7 + 3];
                    c0266gm.f2032e = i14;
                    i7 += 5;
                    int i15 = iArr[i13];
                    c0266gm.f2033f = i15;
                    c0438l7.f2948b = i11;
                    c0438l7.f2949c = i12;
                    c0438l7.f2950d = i14;
                    c0438l7.f2951e = i15;
                    c0438l7.m1746b(c0266gm);
                    i8++;
                    i = i10;
                    abstractComponentCallbacksC0563ol4 = null;
                }
                int i16 = i;
                c0438l7.f2952f = c0475m7.f3087e;
                c0438l7.f2954h = c0475m7.f3088f;
                c0438l7.f2964r = c0475m7.f3089g;
                c0438l7.f2953g = true;
                c0438l7.f2955i = c0475m7.f3090h;
                c0438l7.f2956j = c0475m7.f3091i;
                c0438l7.f2957k = c0475m7.f3092j;
                c0438l7.f2958l = c0475m7.f3093k;
                c0438l7.f2959m = c0475m7.f3094l;
                c0438l7.f2960n = c0475m7.f3095m;
                c0438l7.f2961o = c0475m7.f3096n;
                c0438l7.m1747c(1);
                if (m55A(i16)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + c0438l7.f2964r + "): " + c0438l7);
                    PrintWriter printWriter = new PrintWriter(new C0198es());
                    c0438l7.m1748d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f97d.add(c0438l7);
                i6++;
                i = i16;
                abstractComponentCallbacksC0563ol4 = null;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f97d = null;
        }
        this.f102i.set(c0073bm.f740d);
        String str3 = c0073bm.f741e;
        if (str3 != null) {
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM2235g2 = c0658r5.m2235g(str3);
            this.f110q = abstractComponentCallbacksC0563olM2235g2;
            m88n(abstractComponentCallbacksC0563olM2235g2);
        }
        ArrayList arrayList4 = c0073bm.f742f;
        if (arrayList4 != null) {
            for (int i17 = i2; i17 < arrayList4.size(); i17++) {
                Bundle bundle = (Bundle) c0073bm.f743g.get(i17);
                bundle.setClassLoader(this.f107n.f3728z.getClassLoader());
                this.f103j.put(arrayList4.get(i17), bundle);
            }
        }
        this.f116w = new ArrayDeque(c0073bm.f744h);
    }

    /* JADX INFO: renamed from: L */
    public final C0073bm m67L() {
        int i;
        ArrayList arrayList;
        C0475m7[] c0475m7Arr;
        int size;
        Iterator it = m79e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0150dg c0150dg = (C0150dg) it.next();
            if (c0150dg.f1394e) {
                c0150dg.f1394e = false;
                c0150dg.m918c();
            }
        }
        Iterator it2 = m79e().iterator();
        while (it2.hasNext()) {
            ((C0150dg) it2.next()).m920e();
        }
        m94t(true);
        this.f118y = true;
        this.f92F.f909h = true;
        C0658r5 c0658r5 = this.f96c;
        c0658r5.getClass();
        HashMap map = (HashMap) c0658r5.f4064b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0035a c0035a = (C0035a) it3.next();
            if (c0035a != null) {
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a.f469c;
                C0192em c0192em = new C0192em(abstractComponentCallbacksC0563ol);
                if (abstractComponentCallbacksC0563ol.f3486a <= -1 || c0192em.f1604m != null) {
                    c0192em.f1604m = abstractComponentCallbacksC0563ol.f3487b;
                } else {
                    Bundle bundle = new Bundle();
                    abstractComponentCallbacksC0563ol.mo1025r(bundle);
                    abstractComponentCallbacksC0563ol.f3484O.m1505c(bundle);
                    C0073bm c0073bmM67L = abstractComponentCallbacksC0563ol.f3505t.m67L();
                    if (c0073bmM67L != null) {
                        bundle.putParcelable("android:support:fragments", c0073bmM67L);
                    }
                    c0035a.f467a.m852m(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (abstractComponentCallbacksC0563ol.f3474E != null) {
                        c0035a.m253o();
                    }
                    if (abstractComponentCallbacksC0563ol.f3488c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0563ol.f3488c);
                    }
                    if (abstractComponentCallbacksC0563ol.f3489d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0563ol.f3489d);
                    }
                    if (!abstractComponentCallbacksC0563ol.f3476G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0563ol.f3476G);
                    }
                    c0192em.f1604m = bundle2;
                    if (abstractComponentCallbacksC0563ol.f3493h != null) {
                        if (bundle2 == null) {
                            c0192em.f1604m = new Bundle();
                        }
                        c0192em.f1604m.putString("android:target_state", abstractComponentCallbacksC0563ol.f3493h);
                        int i2 = abstractComponentCallbacksC0563ol.f3494i;
                        if (i2 != 0) {
                            c0192em.f1604m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(c0192em);
                if (m55A(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0563ol + ": " + c0192em.f1604m);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (m55A(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0658r5 c0658r52 = this.f96c;
        synchronized (((ArrayList) c0658r52.f4065c)) {
            try {
                if (((ArrayList) c0658r52.f4065c).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) c0658r52.f4065c).size());
                    ArrayList arrayList3 = (ArrayList) c0658r52.f4065c;
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList3.get(i3);
                        i3++;
                        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = (AbstractComponentCallbacksC0563ol) obj;
                        arrayList.add(abstractComponentCallbacksC0563ol2.f3490e);
                        if (m55A(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0563ol2.f3490e + "): " + abstractComponentCallbacksC0563ol2);
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList4 = this.f97d;
        if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
            c0475m7Arr = null;
        } else {
            c0475m7Arr = new C0475m7[size];
            for (i = 0; i < size; i++) {
                c0475m7Arr[i] = new C0475m7((C0438l7) this.f97d.get(i));
                if (m55A(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f97d.get(i));
                }
            }
        }
        C0073bm c0073bm = new C0073bm();
        c0073bm.f741e = null;
        ArrayList arrayList5 = new ArrayList();
        c0073bm.f742f = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        c0073bm.f743g = arrayList6;
        c0073bm.f737a = arrayList2;
        c0073bm.f738b = arrayList;
        c0073bm.f739c = c0475m7Arr;
        c0073bm.f740d = this.f102i.get();
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol3 = this.f110q;
        if (abstractComponentCallbacksC0563ol3 != null) {
            c0073bm.f741e = abstractComponentCallbacksC0563ol3.f3490e;
        }
        arrayList5.addAll(this.f103j.keySet());
        arrayList6.addAll(this.f103j.values());
        c0073bm.f744h = new ArrayList(this.f116w);
        return c0073bm;
    }

    /* JADX INFO: renamed from: M */
    public final void m68M() {
        synchronized (this.f94a) {
            try {
                if (this.f94a.size() == 1) {
                    this.f107n.f3724A.removeCallbacks(this.f93G);
                    this.f107n.f3724A.post(this.f93G);
                    m74T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m69N(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol, boolean z) {
        ViewGroup viewGroupM97w = m97w(abstractComponentCallbacksC0563ol);
        if (viewGroupM97w == null || !(viewGroupM97w instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM97w).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: O */
    public final void m70O(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol, EnumC0531nq enumC0531nq) {
        if (abstractComponentCallbacksC0563ol.equals(this.f96c.m2235g(abstractComponentCallbacksC0563ol.f3490e)) && (abstractComponentCallbacksC0563ol.f3504s == null || abstractComponentCallbacksC0563ol.f3503r == this)) {
            abstractComponentCallbacksC0563ol.f3480K = enumC0531nq;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0563ol + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: P */
    public final void m71P(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (abstractComponentCallbacksC0563ol != null) {
            if (!abstractComponentCallbacksC0563ol.equals(this.f96c.m2235g(abstractComponentCallbacksC0563ol.f3490e)) || (abstractComponentCallbacksC0563ol.f3504s != null && abstractComponentCallbacksC0563ol.f3503r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0563ol + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = this.f110q;
        this.f110q = abstractComponentCallbacksC0563ol;
        m88n(abstractComponentCallbacksC0563ol2);
        m88n(this.f110q);
    }

    /* JADX INFO: renamed from: Q */
    public final void m72Q(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        ViewGroup viewGroupM97w = m97w(abstractComponentCallbacksC0563ol);
        if (viewGroupM97w != null) {
            C0526nl c0526nl = abstractComponentCallbacksC0563ol.f3477H;
            if ((c0526nl == null ? 0 : c0526nl.f3313e) + (c0526nl == null ? 0 : c0526nl.f3312d) + (c0526nl == null ? 0 : c0526nl.f3311c) + (c0526nl == null ? 0 : c0526nl.f3310b) > 0) {
                if (viewGroupM97w.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM97w.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0563ol);
                }
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = (AbstractComponentCallbacksC0563ol) viewGroupM97w.getTag(R.id.visible_removing_fragment_view_tag);
                C0526nl c0526nl2 = abstractComponentCallbacksC0563ol.f3477H;
                boolean z = c0526nl2 != null ? c0526nl2.f3309a : false;
                if (abstractComponentCallbacksC0563ol2.f3477H == null) {
                    return;
                }
                abstractComponentCallbacksC0563ol2.m2035f().f3309a = z;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m73S() {
        ArrayList arrayListM2237i = this.f96c.m2237i();
        int size = arrayListM2237i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM2237i.get(i);
            i++;
            C0035a c0035a = (C0035a) obj;
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a.f469c;
            if (abstractComponentCallbacksC0563ol.f3475F) {
                if (this.f95b) {
                    this.f88B = true;
                } else {
                    abstractComponentCallbacksC0563ol.f3475F = false;
                    c0035a.m249k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m74T() {
        synchronized (this.f94a) {
            try {
                if (!this.f94a.isEmpty()) {
                    C0785ul c0785ul = this.f101h;
                    c0785ul.f4836a = true;
                    C0240fx c0240fx = c0785ul.f4838c;
                    if (c0240fx != null) {
                        c0240fx.mo474a();
                    }
                    return;
                }
                C0785ul c0785ul2 = this.f101h;
                ArrayList arrayList = this.f97d;
                c0785ul2.f4836a = (arrayList != null ? arrayList.size() : 0) > 0 && m58D(this.f109p);
                C0240fx c0240fx2 = c0785ul2.f4838c;
                if (c0240fx2 != null) {
                    c0240fx2.mo474a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0035a m75a(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (m55A(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0563ol);
        }
        C0035a c0035aM80f = m80f(abstractComponentCallbacksC0563ol);
        abstractComponentCallbacksC0563ol.f3503r = this;
        C0658r5 c0658r5 = this.f96c;
        c0658r5.m2249v(c0035aM80f);
        if (!abstractComponentCallbacksC0563ol.f3511z) {
            c0658r5.m2229a(abstractComponentCallbacksC0563ol);
            abstractComponentCallbacksC0563ol.f3497l = false;
            if (abstractComponentCallbacksC0563ol.f3474E == null) {
                abstractComponentCallbacksC0563ol.f3478I = false;
            }
            if (m56B(abstractComponentCallbacksC0563ol)) {
                this.f117x = true;
            }
        }
        return c0035aM80f;
    }

    /* JADX INFO: renamed from: b */
    public final void m76b(C0600pl c0600pl, AbstractC0259gf abstractC0259gf, AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        C0109cm c0109cm;
        if (this.f107n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f107n = c0600pl;
        this.f108o = abstractC0259gf;
        this.f109p = abstractComponentCallbacksC0563ol;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f105l;
        if (abstractComponentCallbacksC0563ol != null) {
            copyOnWriteArrayList.add(new C0860wl(abstractComponentCallbacksC0563ol));
        } else if (c0600pl != null) {
            copyOnWriteArrayList.add(c0600pl);
        }
        if (this.f109p != null) {
            m74T();
        }
        if (c0600pl != null) {
            C0029a c0029aM107i = c0600pl.f3726C.m107i();
            this.f100g = c0029aM107i;
            c0029aM107i.m110a(abstractComponentCallbacksC0563ol != null ? abstractComponentCallbacksC0563ol : c0600pl, this.f101h);
        }
        if (abstractComponentCallbacksC0563ol != null) {
            C0109cm c0109cm2 = abstractComponentCallbacksC0563ol.f3503r.f92F;
            HashMap map = c0109cm2.f905d;
            C0109cm c0109cm3 = (C0109cm) map.get(abstractComponentCallbacksC0563ol.f3490e);
            if (c0109cm3 == null) {
                c0109cm3 = new C0109cm(c0109cm2.f907f);
                map.put(abstractComponentCallbacksC0563ol.f3490e, c0109cm3);
            }
            this.f92F = c0109cm3;
        } else if (c0600pl != null) {
            wa0 wa0VarMo104d = c0600pl.f3726C.mo104d();
            AbstractC0493mp.m1857g("store", wa0VarMo104d);
            C0741te c0741te = C0741te.f4503b;
            AbstractC0493mp.m1857g("defaultCreationExtras", c0741te);
            String canonicalName = C0109cm.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC0493mp.m1857g("key", strConcat);
            LinkedHashMap linkedHashMap = wa0VarMo104d.f5077a;
            ua0 ua0Var = (ua0) linkedHashMap.get(strConcat);
            if (C0109cm.class.isInstance(ua0Var)) {
                AbstractC0493mp.m1855e("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", ua0Var);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0741te.f4820a);
                linkedHashMap2.put(C0893xh.f5260p, strConcat);
                try {
                    c0109cm = new C0109cm(true);
                } catch (AbstractMethodError unused) {
                    c0109cm = new C0109cm(true);
                }
                ua0Var = c0109cm;
                ua0 ua0Var2 = (ua0) linkedHashMap.put(strConcat, ua0Var);
                if (ua0Var2 != null) {
                    ua0Var2.mo651a();
                }
            }
            this.f92F = (C0109cm) ua0Var;
        } else {
            this.f92F = new C0109cm(false);
        }
        C0109cm c0109cm4 = this.f92F;
        c0109cm4.f909h = this.f118y || this.f119z;
        this.f96c.f4066d = c0109cm4;
        C0600pl c0600pl2 = this.f107n;
        if (c0600pl2 != null) {
            C0063bc c0063bc = c0600pl2.f3726C.f129j;
            String strM1155r = g40.m1155r("FragmentManager:", abstractComponentCallbacksC0563ol != null ? g40.m1149l(new StringBuilder(), abstractComponentCallbacksC0563ol.f3490e, ":") : "");
            this.f113t = c0063bc.m513b(g40.m1146i(strM1155r, "StartActivityForResult"), new C0802v1(1), new C0748tl(this, 2));
            this.f114u = c0063bc.m513b(g40.m1146i(strM1155r, "StartIntentSenderForResult"), new C0802v1(2), new C0748tl(this, 0));
            this.f115v = c0063bc.m513b(g40.m1146i(strM1155r, "RequestPermissions"), new C0802v1(0), new C0748tl(this, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77c(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (m55A(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0563ol);
        }
        if (abstractComponentCallbacksC0563ol.f3511z) {
            abstractComponentCallbacksC0563ol.f3511z = false;
            if (abstractComponentCallbacksC0563ol.f3496k) {
                return;
            }
            this.f96c.m2229a(abstractComponentCallbacksC0563ol);
            if (m55A(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0563ol);
            }
            if (m56B(abstractComponentCallbacksC0563ol)) {
                this.f117x = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m78d() {
        this.f95b = false;
        this.f90D.clear();
        this.f89C.clear();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m79e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListM2237i = this.f96c.m2237i();
        int size = arrayListM2237i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM2237i.get(i);
            i++;
            ViewGroup viewGroup = ((C0035a) obj).f469c.f3473D;
            if (viewGroup != null) {
                hashSet.add(C0150dg.m915f(viewGroup, m99y()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public final C0035a m80f(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        String str = abstractComponentCallbacksC0563ol.f3490e;
        C0658r5 c0658r5 = this.f96c;
        C0035a c0035a = (C0035a) ((HashMap) c0658r5.f4064b).get(str);
        if (c0035a != null) {
            return c0035a;
        }
        C0035a c0035a2 = new C0035a(this.f104k, c0658r5, abstractComponentCallbacksC0563ol);
        c0035a2.m251m(this.f107n.f3728z.getClassLoader());
        c0035a2.f471e = this.f106m;
        return c0035a2;
    }

    /* JADX INFO: renamed from: g */
    public final void m81g(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (m55A(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0563ol);
        }
        if (abstractComponentCallbacksC0563ol.f3511z) {
            return;
        }
        abstractComponentCallbacksC0563ol.f3511z = true;
        if (abstractComponentCallbacksC0563ol.f3496k) {
            if (m55A(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0563ol);
            }
            C0658r5 c0658r5 = this.f96c;
            synchronized (((ArrayList) c0658r5.f4065c)) {
                ((ArrayList) c0658r5.f4065c).remove(abstractComponentCallbacksC0563ol);
            }
            abstractComponentCallbacksC0563ol.f3496k = false;
            if (m56B(abstractComponentCallbacksC0563ol)) {
                this.f117x = true;
            }
            m72Q(abstractComponentCallbacksC0563ol);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m82h() {
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                abstractComponentCallbacksC0563ol.f3472C = true;
                abstractComponentCallbacksC0563ol.f3505t.m82h();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m83i() {
        if (this.f106m >= 1) {
            for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f96c.m2244p()) {
                if (abstractComponentCallbacksC0563ol != null) {
                    if (!abstractComponentCallbacksC0563ol.f3510y ? abstractComponentCallbacksC0563ol.f3505t.m83i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m84j() {
        if (this.f106m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null && m57C(abstractComponentCallbacksC0563ol)) {
                if (!abstractComponentCallbacksC0563ol.f3510y ? abstractComponentCallbacksC0563ol.f3505t.m84j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0563ol);
                    z = true;
                }
            }
        }
        if (this.f98e != null) {
            for (int i = 0; i < this.f98e.size(); i++) {
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = (AbstractComponentCallbacksC0563ol) this.f98e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0563ol2)) {
                    abstractComponentCallbacksC0563ol2.getClass();
                }
            }
        }
        this.f98e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final void m85k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f87A = true;
        m94t(true);
        Iterator it = m79e().iterator();
        while (it.hasNext()) {
            ((C0150dg) it.next()).m920e();
        }
        m90p(-1);
        this.f107n = null;
        this.f108o = null;
        this.f109p = null;
        if (this.f100g != null) {
            Iterator it2 = this.f101h.f4837b.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0661r8) it2.next()).cancel();
            }
            this.f100g = null;
        }
        C0138d4 c0138d4 = this.f113t;
        if (c0138d4 != null) {
            C0063bc c0063bc = (C0063bc) c0138d4.f1298c;
            String str = (String) c0138d4.f1297b;
            Bundle bundle = c0063bc.f715g;
            HashMap map = c0063bc.f714f;
            if (!c0063bc.f712d.contains(str) && (num3 = (Integer) c0063bc.f710b.remove(str)) != null) {
                c0063bc.f709a.remove(num3);
            }
            c0063bc.f713e.remove(str);
            if (map.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
                map.remove(str);
            }
            if (bundle.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
                bundle.remove(str);
            }
            if (c0063bc.f711c.get(str) != null) {
                throw new ClassCastException();
            }
            C0138d4 c0138d42 = this.f114u;
            C0063bc c0063bc2 = (C0063bc) c0138d42.f1298c;
            String str2 = (String) c0138d42.f1297b;
            Bundle bundle2 = c0063bc2.f715g;
            HashMap map2 = c0063bc2.f714f;
            if (!c0063bc2.f712d.contains(str2) && (num2 = (Integer) c0063bc2.f710b.remove(str2)) != null) {
                c0063bc2.f709a.remove(num2);
            }
            c0063bc2.f713e.remove(str2);
            if (map2.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + map2.get(str2));
                map2.remove(str2);
            }
            if (bundle2.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + bundle2.getParcelable(str2));
                bundle2.remove(str2);
            }
            if (c0063bc2.f711c.get(str2) != null) {
                throw new ClassCastException();
            }
            C0138d4 c0138d43 = this.f115v;
            C0063bc c0063bc3 = (C0063bc) c0138d43.f1298c;
            String str3 = (String) c0138d43.f1297b;
            Bundle bundle3 = c0063bc3.f715g;
            HashMap map3 = c0063bc3.f714f;
            if (!c0063bc3.f712d.contains(str3) && (num = (Integer) c0063bc3.f710b.remove(str3)) != null) {
                c0063bc3.f709a.remove(num);
            }
            c0063bc3.f713e.remove(str3);
            if (map3.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + map3.get(str3));
                map3.remove(str3);
            }
            if (bundle3.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + bundle3.getParcelable(str3));
                bundle3.remove(str3);
            }
            if (c0063bc3.f711c.get(str3) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m86l() {
        if (this.f106m >= 1) {
            for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f96c.m2244p()) {
                if (abstractComponentCallbacksC0563ol != null) {
                    if (!abstractComponentCallbacksC0563ol.f3510y ? abstractComponentCallbacksC0563ol.f3505t.m86l() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m87m() {
        if (this.f106m < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null && !abstractComponentCallbacksC0563ol.f3510y) {
                abstractComponentCallbacksC0563ol.f3505t.m87m();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m88n(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (abstractComponentCallbacksC0563ol != null) {
            if (abstractComponentCallbacksC0563ol.equals(this.f96c.m2235g(abstractComponentCallbacksC0563ol.f3490e))) {
                abstractComponentCallbacksC0563ol.f3503r.getClass();
                boolean zM58D = m58D(abstractComponentCallbacksC0563ol);
                Boolean bool = abstractComponentCallbacksC0563ol.f3495j;
                if (bool == null || bool.booleanValue() != zM58D) {
                    abstractComponentCallbacksC0563ol.f3495j = Boolean.valueOf(zM58D);
                    C0023am c0023am = abstractComponentCallbacksC0563ol.f3505t;
                    c0023am.m74T();
                    c0023am.m88n(c0023am.f110q);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m89o() {
        boolean z = false;
        if (this.f106m < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : this.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null && m57C(abstractComponentCallbacksC0563ol)) {
                if (!abstractComponentCallbacksC0563ol.f3510y ? abstractComponentCallbacksC0563ol.f3505t.m89o() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final void m90p(int i) {
        try {
            this.f95b = true;
            for (C0035a c0035a : ((HashMap) this.f96c.f4064b).values()) {
                if (c0035a != null) {
                    c0035a.f471e = i;
                }
            }
            m60E(i, false);
            Iterator it = m79e().iterator();
            while (it.hasNext()) {
                ((C0150dg) it.next()).m920e();
            }
            this.f95b = false;
            m94t(true);
        } catch (Throwable th) {
            this.f95b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m91q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        C0754tr c0754tr;
        String str2;
        String strM1146i = g40.m1146i(str, "    ");
        C0658r5 c0658r5 = this.f96c;
        ArrayList arrayList = (ArrayList) c0658r5.f4065c;
        String strM1146i2 = g40.m1146i(str, "    ");
        HashMap map = (HashMap) c0658r5.f4064b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0035a c0035a : map.values()) {
                printWriter.print(str);
                if (c0035a != null) {
                    AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a.f469c;
                    printWriter.println(abstractComponentCallbacksC0563ol);
                    abstractComponentCallbacksC0563ol.getClass();
                    printWriter.print(strM1146i2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0563ol.f3507v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0563ol.f3508w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0563ol.f3509x);
                    printWriter.print(strM1146i2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3486a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3490e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0563ol.f3502q);
                    printWriter.print(strM1146i2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3496k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3497l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3498m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0563ol.f3499n);
                    printWriter.print(strM1146i2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3510y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3511z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3471B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strM1146i2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0563ol.f3470A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0563ol.f3476G);
                    if (abstractComponentCallbacksC0563ol.f3503r != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3503r);
                    }
                    if (abstractComponentCallbacksC0563ol.f3504s != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3504s);
                    }
                    if (abstractComponentCallbacksC0563ol.f3506u != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3506u);
                    }
                    if (abstractComponentCallbacksC0563ol.f3491f != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3491f);
                    }
                    if (abstractComponentCallbacksC0563ol.f3487b != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3487b);
                    }
                    if (abstractComponentCallbacksC0563ol.f3488c != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3488c);
                    }
                    if (abstractComponentCallbacksC0563ol.f3489d != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3489d);
                    }
                    Object objM2235g = abstractComponentCallbacksC0563ol.f3492g;
                    if (objM2235g == null) {
                        C0023am c0023am = abstractComponentCallbacksC0563ol.f3503r;
                        objM2235g = (c0023am == null || (str2 = abstractComponentCallbacksC0563ol.f3493h) == null) ? null : c0023am.f96c.m2235g(str2);
                    }
                    if (objM2235g != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM2235g);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3494i);
                    }
                    printWriter.print(strM1146i2);
                    printWriter.print("mPopDirection=");
                    C0526nl c0526nl = abstractComponentCallbacksC0563ol.f3477H;
                    printWriter.println(c0526nl == null ? false : c0526nl.f3309a);
                    C0526nl c0526nl2 = abstractComponentCallbacksC0563ol.f3477H;
                    if ((c0526nl2 == null ? 0 : c0526nl2.f3310b) != 0) {
                        printWriter.print(strM1146i2);
                        printWriter.print("getEnterAnim=");
                        C0526nl c0526nl3 = abstractComponentCallbacksC0563ol.f3477H;
                        printWriter.println(c0526nl3 == null ? 0 : c0526nl3.f3310b);
                    }
                    C0526nl c0526nl4 = abstractComponentCallbacksC0563ol.f3477H;
                    if ((c0526nl4 == null ? 0 : c0526nl4.f3311c) != 0) {
                        printWriter.print(strM1146i2);
                        printWriter.print("getExitAnim=");
                        C0526nl c0526nl5 = abstractComponentCallbacksC0563ol.f3477H;
                        printWriter.println(c0526nl5 == null ? 0 : c0526nl5.f3311c);
                    }
                    C0526nl c0526nl6 = abstractComponentCallbacksC0563ol.f3477H;
                    if ((c0526nl6 == null ? 0 : c0526nl6.f3312d) != 0) {
                        printWriter.print(strM1146i2);
                        printWriter.print("getPopEnterAnim=");
                        C0526nl c0526nl7 = abstractComponentCallbacksC0563ol.f3477H;
                        printWriter.println(c0526nl7 == null ? 0 : c0526nl7.f3312d);
                    }
                    C0526nl c0526nl8 = abstractComponentCallbacksC0563ol.f3477H;
                    if ((c0526nl8 == null ? 0 : c0526nl8.f3313e) != 0) {
                        printWriter.print(strM1146i2);
                        printWriter.print("getPopExitAnim=");
                        C0526nl c0526nl9 = abstractComponentCallbacksC0563ol.f3477H;
                        printWriter.println(c0526nl9 == null ? 0 : c0526nl9.f3313e);
                    }
                    if (abstractComponentCallbacksC0563ol.f3473D != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3473D);
                    }
                    if (abstractComponentCallbacksC0563ol.f3474E != null) {
                        printWriter.print(strM1146i2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0563ol.f3474E);
                    }
                    if (abstractComponentCallbacksC0563ol.m2037h() != null) {
                        wa0 wa0VarMo104d = abstractComponentCallbacksC0563ol.mo104d();
                        AbstractC0493mp.m1857g("store", wa0VarMo104d);
                        C0741te c0741te = C0741te.f4503b;
                        AbstractC0493mp.m1857g("defaultCreationExtras", c0741te);
                        String canonicalName = C0754tr.class.getCanonicalName();
                        if (canonicalName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
                        AbstractC0493mp.m1857g("key", strConcat);
                        LinkedHashMap linkedHashMap = wa0VarMo104d.f5077a;
                        ua0 ua0Var = (ua0) linkedHashMap.get(strConcat);
                        if (C0754tr.class.isInstance(ua0Var)) {
                            AbstractC0493mp.m1855e("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", ua0Var);
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.putAll(c0741te.f4820a);
                            linkedHashMap2.put(C0893xh.f5260p, strConcat);
                            try {
                                c0754tr = new C0754tr();
                            } catch (AbstractMethodError unused) {
                                c0754tr = new C0754tr();
                            }
                            ua0Var = c0754tr;
                            ua0 ua0Var2 = (ua0) linkedHashMap.put(strConcat, ua0Var);
                            if (ua0Var2 != null) {
                                ua0Var2.mo651a();
                            }
                        }
                        l40 l40Var = ((C0754tr) ua0Var).f4573c;
                        if (l40Var.f2919c > 0) {
                            printWriter.print(strM1146i2);
                            printWriter.println("Loaders:");
                            if (l40Var.f2919c > 0) {
                                if (l40Var.f2918b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strM1146i2);
                                printWriter.print("  #");
                                printWriter.print(l40Var.f2917a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strM1146i2);
                    printWriter.println("Child " + abstractComponentCallbacksC0563ol.f3505t + ":");
                    abstractComponentCallbacksC0563ol.f3505t.m91q(g40.m1146i(strM1146i2, "  "), fileDescriptor, printWriter, strArr);
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
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = (AbstractComponentCallbacksC0563ol) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0563ol2.toString());
            }
        }
        ArrayList arrayList2 = this.f98e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol3 = (AbstractComponentCallbacksC0563ol) this.f98e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0563ol3.toString());
            }
        }
        ArrayList arrayList3 = this.f97d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0438l7 c0438l7 = (C0438l7) this.f97d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0438l7.toString());
                c0438l7.m1748d(strM1146i, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f102i.get());
        synchronized (this.f94a) {
            try {
                int size4 = this.f94a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC0934yl) this.f94a.get(i4);
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
        printWriter.println(this.f107n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f108o);
        if (this.f109p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f109p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f106m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f118y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f119z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f87A);
        if (this.f117x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f117x);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m92r(InterfaceC0934yl interfaceC0934yl, boolean z) {
        if (!z) {
            if (this.f107n == null) {
                if (!this.f87A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f118y || this.f119z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f94a) {
            try {
                if (this.f107n == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f94a.add(interfaceC0934yl);
                    m68M();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m93s(boolean z) {
        if (this.f95b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f107n == null) {
            if (!this.f87A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f107n.f3724A.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.f118y || this.f119z)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f89C == null) {
            this.f89C = new ArrayList();
            this.f90D = new ArrayList();
        }
        this.f95b = false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m94t(boolean z) {
        boolean zMo1745a;
        m93s(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f89C;
            ArrayList arrayList2 = this.f90D;
            synchronized (this.f94a) {
                try {
                    if (this.f94a.isEmpty()) {
                        zMo1745a = false;
                    } else {
                        int size = this.f94a.size();
                        zMo1745a = false;
                        for (int i = 0; i < size; i++) {
                            zMo1745a |= ((InterfaceC0934yl) this.f94a.get(i)).mo1745a(arrayList, arrayList2);
                        }
                        this.f94a.clear();
                        this.f107n.f3724A.removeCallbacks(this.f93G);
                    }
                } finally {
                }
            }
            if (!zMo1745a) {
                break;
            }
            z2 = true;
            this.f95b = true;
            try {
                m65J(this.f89C, this.f90D);
            } finally {
                m78d();
            }
        }
        m74T();
        if (this.f88B) {
            this.f88B = false;
            m73S();
        }
        ((HashMap) this.f96c.f4064b).values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            sb.append(abstractComponentCallbacksC0563ol.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f109p)));
            sb.append("}");
        } else {
            C0600pl c0600pl = this.f107n;
            if (c0600pl != null) {
                sb.append(c0600pl.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f107n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m95u(java.util.ArrayList r23, java.util.ArrayList r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023am.m95u(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* JADX INFO: renamed from: v */
    public final AbstractComponentCallbacksC0563ol m96v(int i) {
        C0658r5 c0658r5 = this.f96c;
        ArrayList arrayList = (ArrayList) c0658r5.f4065c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = (AbstractComponentCallbacksC0563ol) arrayList.get(size);
            if (abstractComponentCallbacksC0563ol != null && abstractComponentCallbacksC0563ol.f3507v == i) {
                return abstractComponentCallbacksC0563ol;
            }
        }
        for (C0035a c0035a : ((HashMap) c0658r5.f4064b).values()) {
            if (c0035a != null) {
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = c0035a.f469c;
                if (abstractComponentCallbacksC0563ol2.f3507v == i) {
                    return abstractComponentCallbacksC0563ol2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final ViewGroup m97w(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        ViewGroup viewGroup = abstractComponentCallbacksC0563ol.f3473D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0563ol.f3508w <= 0 || !this.f108o.mo1265L()) {
            return null;
        }
        View viewMo1264K = this.f108o.mo1264K(abstractComponentCallbacksC0563ol.f3508w);
        if (viewMo1264K instanceof ViewGroup) {
            return (ViewGroup) viewMo1264K;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final C0822vl m98x() {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f109p;
        return abstractComponentCallbacksC0563ol != null ? abstractComponentCallbacksC0563ol.f3503r.m98x() : this.f111r;
    }

    /* JADX INFO: renamed from: y */
    public final C0893xh m99y() {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f109p;
        return abstractComponentCallbacksC0563ol != null ? abstractComponentCallbacksC0563ol.f3503r.m99y() : this.f112s;
    }

    /* JADX INFO: renamed from: z */
    public final void m100z(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (m55A(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0563ol);
        }
        if (abstractComponentCallbacksC0563ol.f3510y) {
            return;
        }
        abstractComponentCallbacksC0563ol.f3510y = true;
        abstractComponentCallbacksC0563ol.f3478I = true ^ abstractComponentCallbacksC0563ol.f3478I;
        m72Q(abstractComponentCallbacksC0563ol);
    }
}

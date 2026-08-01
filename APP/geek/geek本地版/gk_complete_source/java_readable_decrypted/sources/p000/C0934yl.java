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

/* JADX INFO: renamed from: yl */
/* JADX INFO: loaded from: classes.dex */
public final class C0934yl {

    /* JADX INFO: renamed from: A */
    public boolean f5345A;

    /* JADX INFO: renamed from: B */
    public boolean f5346B;

    /* JADX INFO: renamed from: C */
    public ArrayList f5347C;

    /* JADX INFO: renamed from: D */
    public ArrayList f5348D;

    /* JADX INFO: renamed from: E */
    public ArrayList f5349E;

    /* JADX INFO: renamed from: F */
    public C0023am f5350F;

    /* JADX INFO: renamed from: G */
    public final RunnableC0919y6 f5351G;

    /* JADX INFO: renamed from: b */
    public boolean f5353b;

    /* JADX INFO: renamed from: d */
    public ArrayList f5355d;

    /* JADX INFO: renamed from: e */
    public ArrayList f5356e;

    /* JADX INFO: renamed from: g */
    public C0029a f5358g;

    /* JADX INFO: renamed from: k */
    public final C0138d4 f5362k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f5363l;

    /* JADX INFO: renamed from: m */
    public int f5364m;

    /* JADX INFO: renamed from: n */
    public C0526nl f5365n;

    /* JADX INFO: renamed from: o */
    public AbstractC0346ip f5366o;

    /* JADX INFO: renamed from: p */
    public AbstractComponentCallbacksC0489ml f5367p;

    /* JADX INFO: renamed from: q */
    public AbstractComponentCallbacksC0489ml f5368q;

    /* JADX INFO: renamed from: r */
    public final C0749tl f5369r;

    /* JADX INFO: renamed from: s */
    public final C0819vh f5370s;

    /* JADX INFO: renamed from: t */
    public C0138d4 f5371t;

    /* JADX INFO: renamed from: u */
    public C0138d4 f5372u;

    /* JADX INFO: renamed from: v */
    public C0138d4 f5373v;

    /* JADX INFO: renamed from: w */
    public ArrayDeque f5374w;

    /* JADX INFO: renamed from: x */
    public boolean f5375x;

    /* JADX INFO: renamed from: y */
    public boolean f5376y;

    /* JADX INFO: renamed from: z */
    public boolean f5377z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f5352a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C0659r5 f5354c = new C0659r5();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0638ql f5357f = new LayoutInflaterFactory2C0638ql(this);

    /* JADX INFO: renamed from: h */
    public final C0712sl f5359h = new C0712sl(this);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f5360i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map f5361j = Collections.synchronizedMap(new HashMap());

    public C0934yl() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new C0819vh(this);
        this.f5362k = new C0138d4(this);
        this.f5363l = new CopyOnWriteArrayList();
        this.f5364m = -1;
        this.f5369r = new C0749tl(this);
        this.f5370s = new C0819vh(24);
        this.f5374w = new ArrayDeque();
        this.f5351G = new RunnableC0919y6(7, this);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m2689A(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m2690B(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        abstractComponentCallbacksC0489ml.getClass();
        C0659r5 c0659r5 = abstractComponentCallbacksC0489ml.f3260t.f5354c;
        c0659r5.getClass();
        ArrayList arrayList = new ArrayList();
        for (C0035a c0035a : ((HashMap) c0659r5.f4209b).values()) {
            if (c0035a != null) {
                arrayList.add(c0035a.f506c);
            } else {
                arrayList.add(null);
            }
        }
        int size = arrayList.size();
        boolean zM2690B = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = (AbstractComponentCallbacksC0489ml) obj;
            if (abstractComponentCallbacksC0489ml2 != null) {
                zM2690B = m2690B(abstractComponentCallbacksC0489ml2);
            }
            if (zM2690B) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m2691C(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (abstractComponentCallbacksC0489ml == null) {
            return true;
        }
        if (abstractComponentCallbacksC0489ml.f3226B) {
            return abstractComponentCallbacksC0489ml.f3258r == null || m2691C(abstractComponentCallbacksC0489ml.f3261u);
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m2692D(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (abstractComponentCallbacksC0489ml == null) {
            return true;
        }
        C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3258r;
        return abstractComponentCallbacksC0489ml.equals(c0934yl.f5368q) && m2692D(c0934yl.f5367p);
    }

    /* JADX INFO: renamed from: R */
    public static void m2693R(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (m2689A(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0489ml);
        }
        if (abstractComponentCallbacksC0489ml.f3265y) {
            abstractComponentCallbacksC0489ml.f3265y = false;
            abstractComponentCallbacksC0489ml.f3233I = !abstractComponentCallbacksC0489ml.f3233I;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2694E(int i, boolean z) {
        C0526nl c0526nl;
        if (this.f5365n == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f5364m) {
            this.f5364m = i;
            C0659r5 c0659r5 = this.f5354c;
            HashMap map = (HashMap) c0659r5.f4209b;
            ArrayList arrayList = (ArrayList) c0659r5.f4210c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C0035a c0035a = (C0035a) map.get(((AbstractComponentCallbacksC0489ml) obj).f3245e);
                if (c0035a != null) {
                    c0035a.m264k();
                }
            }
            for (C0035a c0035a2 : map.values()) {
                if (c0035a2 != null) {
                    c0035a2.m264k();
                    AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a2.f506c;
                    if (abstractComponentCallbacksC0489ml.f3252l && abstractComponentCallbacksC0489ml.f3257q <= 0) {
                        c0659r5.m2243w(c0035a2);
                    }
                }
            }
            m2707S();
            if (this.f5375x && (c0526nl = this.f5365n) != null && this.f5364m == 7) {
                c0526nl.f3431G.mo129f();
                this.f5375x = false;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m2695F() {
        if (this.f5365n == null) {
            return;
        }
        this.f5376y = false;
        this.f5377z = false;
        this.f5350F.f156h = false;
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                abstractComponentCallbacksC0489ml.f3260t.m2695F();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m2696G() {
        m2728t(false);
        m2727s(true);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f5368q;
        if (abstractComponentCallbacksC0489ml != null && abstractComponentCallbacksC0489ml.m1834g().m2696G()) {
            return true;
        }
        boolean zM2697H = m2697H(this.f5347C, this.f5348D, -1, 0);
        if (zM2697H) {
            this.f5353b = true;
            try {
                m2699J(this.f5347C, this.f5348D);
            } finally {
                m2712d();
            }
        }
        m2708T();
        if (this.f5346B) {
            this.f5346B = false;
            m2707S();
        }
        ((HashMap) this.f5354c.f4209b).values().removeAll(Collections.singleton(null));
        return zM2697H;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m2697H(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int size;
        C0058b7 c0058b7;
        ArrayList arrayList3 = this.f5355d;
        if (arrayList3 == null) {
            return false;
        }
        if (i < 0 && (i2 & 1) == 0) {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f5355d.remove(size2));
            arrayList2.add(Boolean.TRUE);
            return true;
        }
        if (i >= 0) {
            size = arrayList3.size() - 1;
            while (size >= 0) {
                C0058b7 c0058b72 = (C0058b7) this.f5355d.get(size);
                if (i >= 0 && i == c0058b72.f773r) {
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
                    c0058b7 = (C0058b7) this.f5355d.get(size);
                    if (i < 0) {
                        break;
                    }
                } while (i == c0058b7.f773r);
            }
        } else {
            size = -1;
        }
        if (size == this.f5355d.size() - 1) {
            return false;
        }
        for (int size3 = this.f5355d.size() - 1; size3 > size; size3--) {
            arrayList.add(this.f5355d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final void m2698I(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (m2689A(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0489ml + " nesting=" + abstractComponentCallbacksC0489ml.f3257q);
        }
        boolean z = abstractComponentCallbacksC0489ml.f3257q > 0;
        if (abstractComponentCallbacksC0489ml.f3266z && z) {
            return;
        }
        C0659r5 c0659r5 = this.f5354c;
        synchronized (((ArrayList) c0659r5.f4210c)) {
            ((ArrayList) c0659r5.f4210c).remove(abstractComponentCallbacksC0489ml);
        }
        abstractComponentCallbacksC0489ml.f3251k = false;
        if (m2690B(abstractComponentCallbacksC0489ml)) {
            this.f5375x = true;
        }
        abstractComponentCallbacksC0489ml.f3252l = true;
        m2706Q(abstractComponentCallbacksC0489ml);
    }

    /* JADX INFO: renamed from: J */
    public final void m2699J(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((C0058b7) arrayList.get(i)).f770o) {
                if (i2 != i) {
                    m2729u(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0058b7) arrayList.get(i2)).f770o) {
                        i2++;
                    }
                }
                m2729u(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m2729u(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m2700K(Parcelable parcelable) {
        C0138d4 c0138d4;
        int i;
        int i2;
        C0035a c0035a;
        if (parcelable == null) {
            return;
        }
        C0971zl c0971zl = (C0971zl) parcelable;
        if (c0971zl.f5564a == null) {
            return;
        }
        C0659r5 c0659r5 = this.f5354c;
        ((HashMap) c0659r5.f4209b).clear();
        ArrayList arrayList = c0971zl.f5564a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            c0138d4 = this.f5362k;
            i = 2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            C0109cm c0109cm = (C0109cm) obj;
            if (c0109cm != null) {
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = (AbstractComponentCallbacksC0489ml) this.f5350F.f151c.get(c0109cm.f968b);
                if (abstractComponentCallbacksC0489ml != null) {
                    if (m2689A(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0489ml);
                    }
                    c0035a = new C0035a(c0138d4, c0659r5, abstractComponentCallbacksC0489ml, c0109cm);
                } else {
                    c0035a = new C0035a(this.f5362k, this.f5354c, this.f5365n.f3428D.getClassLoader(), m2732x(), c0109cm);
                }
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = c0035a.f506c;
                abstractComponentCallbacksC0489ml2.f3258r = this;
                if (m2689A(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0489ml2.f3245e + "): " + abstractComponentCallbacksC0489ml2);
                }
                c0035a.m266m(this.f5365n.f3428D.getClassLoader());
                c0659r5.m2242v(c0035a);
                c0035a.f508e = this.f5364m;
            }
        }
        C0023am c0023am = this.f5350F;
        c0023am.getClass();
        ArrayList arrayList2 = new ArrayList(c0023am.f151c.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml3 = (AbstractComponentCallbacksC0489ml) obj2;
            if (((HashMap) c0659r5.f4209b).get(abstractComponentCallbacksC0489ml3.f3245e) == null) {
                if (m2689A(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0489ml3 + " that was not found in the set of active Fragments " + c0971zl.f5564a);
                }
                this.f5350F.m114b(abstractComponentCallbacksC0489ml3);
                abstractComponentCallbacksC0489ml3.f3258r = this;
                C0035a c0035a2 = new C0035a(c0138d4, c0659r5, abstractComponentCallbacksC0489ml3);
                c0035a2.f508e = 1;
                c0035a2.m264k();
                abstractComponentCallbacksC0489ml3.f3252l = true;
                c0035a2.m264k();
            }
        }
        ArrayList arrayList3 = c0971zl.f5565b;
        ((ArrayList) c0659r5.f4210c).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str = (String) obj3;
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2228g = c0659r5.m2228g(str);
                if (abstractComponentCallbacksC0489mlM2228g == null) {
                    throw new IllegalStateException(z30.m2765j("No instantiated fragment for (", str, ")"));
                }
                if (m2689A(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + abstractComponentCallbacksC0489mlM2228g);
                }
                c0659r5.m2222a(abstractComponentCallbacksC0489mlM2228g);
            }
        }
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml4 = null;
        if (c0971zl.f5566c != null) {
            this.f5355d = new ArrayList(c0971zl.f5566c.length);
            int i6 = 0;
            while (true) {
                C0094c7[] c0094c7Arr = c0971zl.f5566c;
                if (i6 >= c0094c7Arr.length) {
                    break;
                }
                C0094c7 c0094c7 = c0094c7Arr[i6];
                int[] iArr = c0094c7.f893a;
                C0058b7 c0058b7 = new C0058b7(this);
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    C0192em c0192em = new C0192em();
                    int i9 = i7 + 1;
                    int i10 = i;
                    c0192em.f1817a = iArr[i7];
                    if (m2689A(i10)) {
                        Log.v("FragmentManager", "Instantiate " + c0058b7 + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    String str2 = (String) c0094c7.f894b.get(i8);
                    if (str2 != null) {
                        c0192em.f1818b = c0659r5.m2228g(str2);
                    } else {
                        c0192em.f1818b = abstractComponentCallbacksC0489ml4;
                    }
                    c0192em.f1823g = EnumC0383jq.values()[c0094c7.f895c[i8]];
                    c0192em.f1824h = EnumC0383jq.values()[c0094c7.f896d[i8]];
                    int i11 = iArr[i9];
                    c0192em.f1819c = i11;
                    int i12 = iArr[i7 + 2];
                    c0192em.f1820d = i12;
                    int i13 = i7 + 4;
                    int i14 = iArr[i7 + 3];
                    c0192em.f1821e = i14;
                    i7 += 5;
                    int i15 = iArr[i13];
                    c0192em.f1822f = i15;
                    c0058b7.f757b = i11;
                    c0058b7.f758c = i12;
                    c0058b7.f759d = i14;
                    c0058b7.f760e = i15;
                    c0058b7.m536b(c0192em);
                    i8++;
                    i = i10;
                    abstractComponentCallbacksC0489ml4 = null;
                }
                int i16 = i;
                c0058b7.f761f = c0094c7.f897e;
                c0058b7.f763h = c0094c7.f898f;
                c0058b7.f773r = c0094c7.f899g;
                c0058b7.f762g = true;
                c0058b7.f764i = c0094c7.f900h;
                c0058b7.f765j = c0094c7.f901i;
                c0058b7.f766k = c0094c7.f902j;
                c0058b7.f767l = c0094c7.f903k;
                c0058b7.f768m = c0094c7.f904l;
                c0058b7.f769n = c0094c7.f905m;
                c0058b7.f770o = c0094c7.f906n;
                c0058b7.m537c(1);
                if (m2689A(i16)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + c0058b7.f773r + "): " + c0058b7);
                    PrintWriter printWriter = new PrintWriter(new C0042as());
                    c0058b7.m538d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f5355d.add(c0058b7);
                i6++;
                i = i16;
                abstractComponentCallbacksC0489ml4 = null;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f5355d = null;
        }
        this.f5360i.set(c0971zl.f5567d);
        String str3 = c0971zl.f5568e;
        if (str3 != null) {
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2228g2 = c0659r5.m2228g(str3);
            this.f5368q = abstractComponentCallbacksC0489mlM2228g2;
            m2722n(abstractComponentCallbacksC0489mlM2228g2);
        }
        ArrayList arrayList4 = c0971zl.f5569f;
        if (arrayList4 != null) {
            for (int i17 = i2; i17 < arrayList4.size(); i17++) {
                Bundle bundle = (Bundle) c0971zl.f5570g.get(i17);
                bundle.setClassLoader(this.f5365n.f3428D.getClassLoader());
                this.f5361j.put(arrayList4.get(i17), bundle);
            }
        }
        this.f5374w = new ArrayDeque(c0971zl.f5571h);
    }

    /* JADX INFO: renamed from: L */
    public final C0971zl m2701L() {
        int i;
        ArrayList arrayList;
        C0094c7[] c0094c7Arr;
        int size;
        Iterator it = m2713e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0103cg c0103cg = (C0103cg) it.next();
            if (c0103cg.f961e) {
                c0103cg.f961e = false;
                c0103cg.m677c();
            }
        }
        Iterator it2 = m2713e().iterator();
        while (it2.hasNext()) {
            ((C0103cg) it2.next()).m679e();
        }
        m2728t(true);
        this.f5376y = true;
        this.f5350F.f156h = true;
        C0659r5 c0659r5 = this.f5354c;
        c0659r5.getClass();
        HashMap map = (HashMap) c0659r5.f4209b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0035a c0035a = (C0035a) it3.next();
            if (c0035a != null) {
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a.f506c;
                C0109cm c0109cm = new C0109cm(abstractComponentCallbacksC0489ml);
                if (abstractComponentCallbacksC0489ml.f3241a <= -1 || c0109cm.f979m != null) {
                    c0109cm.f979m = abstractComponentCallbacksC0489ml.f3242b;
                } else {
                    Bundle bundle = new Bundle();
                    abstractComponentCallbacksC0489ml.mo576r(bundle);
                    abstractComponentCallbacksC0489ml.f3239O.m1280c(bundle);
                    C0971zl c0971zlM2701L = abstractComponentCallbacksC0489ml.f3260t.m2701L();
                    if (c0971zlM2701L != null) {
                        bundle.putParcelable("android:support:fragments", c0971zlM2701L);
                    }
                    c0035a.f504a.m892m(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (abstractComponentCallbacksC0489ml.f3229E != null) {
                        c0035a.m268o();
                    }
                    if (abstractComponentCallbacksC0489ml.f3243c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0489ml.f3243c);
                    }
                    if (abstractComponentCallbacksC0489ml.f3244d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0489ml.f3244d);
                    }
                    if (!abstractComponentCallbacksC0489ml.f3231G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0489ml.f3231G);
                    }
                    c0109cm.f979m = bundle2;
                    if (abstractComponentCallbacksC0489ml.f3248h != null) {
                        if (bundle2 == null) {
                            c0109cm.f979m = new Bundle();
                        }
                        c0109cm.f979m.putString("android:target_state", abstractComponentCallbacksC0489ml.f3248h);
                        int i2 = abstractComponentCallbacksC0489ml.f3249i;
                        if (i2 != 0) {
                            c0109cm.f979m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(c0109cm);
                if (m2689A(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0489ml + ": " + c0109cm.f979m);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (m2689A(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0659r5 c0659r52 = this.f5354c;
        synchronized (((ArrayList) c0659r52.f4210c)) {
            try {
                if (((ArrayList) c0659r52.f4210c).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) c0659r52.f4210c).size());
                    ArrayList arrayList3 = (ArrayList) c0659r52.f4210c;
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList3.get(i3);
                        i3++;
                        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = (AbstractComponentCallbacksC0489ml) obj;
                        arrayList.add(abstractComponentCallbacksC0489ml2.f3245e);
                        if (m2689A(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0489ml2.f3245e + "): " + abstractComponentCallbacksC0489ml2);
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList4 = this.f5355d;
        if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
            c0094c7Arr = null;
        } else {
            c0094c7Arr = new C0094c7[size];
            for (i = 0; i < size; i++) {
                c0094c7Arr[i] = new C0094c7((C0058b7) this.f5355d.get(i));
                if (m2689A(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f5355d.get(i));
                }
            }
        }
        C0971zl c0971zl = new C0971zl();
        c0971zl.f5568e = null;
        ArrayList arrayList5 = new ArrayList();
        c0971zl.f5569f = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        c0971zl.f5570g = arrayList6;
        c0971zl.f5564a = arrayList2;
        c0971zl.f5565b = arrayList;
        c0971zl.f5566c = c0094c7Arr;
        c0971zl.f5567d = this.f5360i.get();
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml3 = this.f5368q;
        if (abstractComponentCallbacksC0489ml3 != null) {
            c0971zl.f5568e = abstractComponentCallbacksC0489ml3.f3245e;
        }
        arrayList5.addAll(this.f5361j.keySet());
        arrayList6.addAll(this.f5361j.values());
        c0971zl.f5571h = new ArrayList(this.f5374w);
        return c0971zl;
    }

    /* JADX INFO: renamed from: M */
    public final void m2702M() {
        synchronized (this.f5352a) {
            try {
                if (this.f5352a.size() == 1) {
                    this.f5365n.f3429E.removeCallbacks(this.f5351G);
                    this.f5365n.f3429E.post(this.f5351G);
                    m2708T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m2703N(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml, boolean z) {
        ViewGroup viewGroupM2731w = m2731w(abstractComponentCallbacksC0489ml);
        if (viewGroupM2731w == null || !(viewGroupM2731w instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM2731w).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: O */
    public final void m2704O(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml, EnumC0383jq enumC0383jq) {
        if (abstractComponentCallbacksC0489ml.equals(this.f5354c.m2228g(abstractComponentCallbacksC0489ml.f3245e)) && (abstractComponentCallbacksC0489ml.f3259s == null || abstractComponentCallbacksC0489ml.f3258r == this)) {
            abstractComponentCallbacksC0489ml.f3235K = enumC0383jq;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0489ml + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: P */
    public final void m2705P(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (abstractComponentCallbacksC0489ml != null) {
            if (!abstractComponentCallbacksC0489ml.equals(this.f5354c.m2228g(abstractComponentCallbacksC0489ml.f3245e)) || (abstractComponentCallbacksC0489ml.f3259s != null && abstractComponentCallbacksC0489ml.f3258r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0489ml + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = this.f5368q;
        this.f5368q = abstractComponentCallbacksC0489ml;
        m2722n(abstractComponentCallbacksC0489ml2);
        m2722n(this.f5368q);
    }

    /* JADX INFO: renamed from: Q */
    public final void m2706Q(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        ViewGroup viewGroupM2731w = m2731w(abstractComponentCallbacksC0489ml);
        if (viewGroupM2731w != null) {
            C0452ll c0452ll = abstractComponentCallbacksC0489ml.f3232H;
            if ((c0452ll == null ? 0 : c0452ll.f3073e) + (c0452ll == null ? 0 : c0452ll.f3072d) + (c0452ll == null ? 0 : c0452ll.f3071c) + (c0452ll == null ? 0 : c0452ll.f3070b) > 0) {
                if (viewGroupM2731w.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM2731w.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0489ml);
                }
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = (AbstractComponentCallbacksC0489ml) viewGroupM2731w.getTag(R.id.visible_removing_fragment_view_tag);
                C0452ll c0452ll2 = abstractComponentCallbacksC0489ml.f3232H;
                boolean z = c0452ll2 != null ? c0452ll2.f3069a : false;
                if (abstractComponentCallbacksC0489ml2.f3232H == null) {
                    return;
                }
                abstractComponentCallbacksC0489ml2.m1833f().f3069a = z;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m2707S() {
        ArrayList arrayListM2230i = this.f5354c.m2230i();
        int size = arrayListM2230i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM2230i.get(i);
            i++;
            C0035a c0035a = (C0035a) obj;
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a.f506c;
            if (abstractComponentCallbacksC0489ml.f3230F) {
                if (this.f5353b) {
                    this.f5346B = true;
                } else {
                    abstractComponentCallbacksC0489ml.f3230F = false;
                    c0035a.m264k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m2708T() {
        synchronized (this.f5352a) {
            try {
                if (!this.f5352a.isEmpty()) {
                    C0712sl c0712sl = this.f5359h;
                    c0712sl.f4446a = true;
                    C0908xw c0908xw = c0712sl.f4448c;
                    if (c0908xw != null) {
                        c0908xw.mo10a();
                    }
                    return;
                }
                C0712sl c0712sl2 = this.f5359h;
                ArrayList arrayList = this.f5355d;
                c0712sl2.f4446a = (arrayList != null ? arrayList.size() : 0) > 0 && m2692D(this.f5367p);
                C0908xw c0908xw2 = c0712sl2.f4448c;
                if (c0908xw2 != null) {
                    c0908xw2.mo10a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0035a m2709a(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (m2689A(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0489ml);
        }
        C0035a c0035aM2714f = m2714f(abstractComponentCallbacksC0489ml);
        abstractComponentCallbacksC0489ml.f3258r = this;
        C0659r5 c0659r5 = this.f5354c;
        c0659r5.m2242v(c0035aM2714f);
        if (!abstractComponentCallbacksC0489ml.f3266z) {
            c0659r5.m2222a(abstractComponentCallbacksC0489ml);
            abstractComponentCallbacksC0489ml.f3252l = false;
            if (abstractComponentCallbacksC0489ml.f3229E == null) {
                abstractComponentCallbacksC0489ml.f3233I = false;
            }
            if (m2690B(abstractComponentCallbacksC0489ml)) {
                this.f5375x = true;
            }
        }
        return c0035aM2714f;
    }

    /* JADX INFO: renamed from: b */
    public final void m2710b(C0526nl c0526nl, AbstractC0346ip abstractC0346ip, AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        C0023am c0023am;
        if (this.f5365n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f5365n = c0526nl;
        this.f5366o = abstractC0346ip;
        this.f5367p = abstractComponentCallbacksC0489ml;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5363l;
        if (abstractComponentCallbacksC0489ml != null) {
            copyOnWriteArrayList.add(new C0786ul(abstractComponentCallbacksC0489ml));
        } else if (c0526nl != null) {
            copyOnWriteArrayList.add(c0526nl);
        }
        if (this.f5367p != null) {
            m2708T();
        }
        if (c0526nl != null) {
            C0029a c0029aM122i = c0526nl.f3431G.m122i();
            this.f5358g = c0029aM122i;
            c0029aM122i.m125a(abstractComponentCallbacksC0489ml != null ? abstractComponentCallbacksC0489ml : c0526nl, this.f5359h);
        }
        if (abstractComponentCallbacksC0489ml != null) {
            C0023am c0023am2 = abstractComponentCallbacksC0489ml.f3258r.f5350F;
            HashMap map = c0023am2.f152d;
            C0023am c0023am3 = (C0023am) map.get(abstractComponentCallbacksC0489ml.f3245e);
            if (c0023am3 == null) {
                c0023am3 = new C0023am(c0023am2.f154f);
                map.put(abstractComponentCallbacksC0489ml.f3245e, c0023am3);
            }
            this.f5350F = c0023am3;
        } else if (c0526nl != null) {
            ra0 ra0VarMo119d = c0526nl.f3431G.mo119d();
            AbstractC0346ip.m1503o("store", ra0VarMo119d);
            C0705se c0705se = C0705se.f4429b;
            AbstractC0346ip.m1503o("defaultCreationExtras", c0705se);
            String canonicalName = C0023am.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC0346ip.m1503o("key", strConcat);
            LinkedHashMap linkedHashMap = ra0VarMo119d.f4257a;
            pa0 pa0Var = (pa0) linkedHashMap.get(strConcat);
            if (C0023am.class.isInstance(pa0Var)) {
                AbstractC0346ip.m1501m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", pa0Var);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0705se.f4565a);
                linkedHashMap2.put(C0819vh.f4857p, strConcat);
                try {
                    c0023am = new C0023am(true);
                } catch (AbstractMethodError unused) {
                    c0023am = new C0023am(true);
                }
                pa0Var = c0023am;
                pa0 pa0Var2 = (pa0) linkedHashMap.put(strConcat, pa0Var);
                if (pa0Var2 != null) {
                    pa0Var2.mo113a();
                }
            }
            this.f5350F = (C0023am) pa0Var;
        } else {
            this.f5350F = new C0023am(false);
        }
        C0023am c0023am4 = this.f5350F;
        c0023am4.f156h = this.f5376y || this.f5377z;
        this.f5354c.f4211d = c0023am4;
        C0526nl c0526nl2 = this.f5365n;
        if (c0526nl2 != null) {
            C0702sb c0702sb = c0526nl2.f3431G.f166j;
            String str = "FragmentManager:" + (abstractComponentCallbacksC0489ml != null ? z30.m2767l(new StringBuilder(), abstractComponentCallbacksC0489ml.f3245e, ":") : "");
            this.f5371t = c0702sb.m2329b(z30.m2764i(str, "StartActivityForResult"), new C0803v1(1), new C0675rl(this, 2));
            this.f5372u = c0702sb.m2329b(z30.m2764i(str, "StartIntentSenderForResult"), new C0803v1(2), new C0675rl(this, 0));
            this.f5373v = c0702sb.m2329b(z30.m2764i(str, "RequestPermissions"), new C0803v1(0), new C0675rl(this, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2711c(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (m2689A(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0489ml);
        }
        if (abstractComponentCallbacksC0489ml.f3266z) {
            abstractComponentCallbacksC0489ml.f3266z = false;
            if (abstractComponentCallbacksC0489ml.f3251k) {
                return;
            }
            this.f5354c.m2222a(abstractComponentCallbacksC0489ml);
            if (m2689A(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0489ml);
            }
            if (m2690B(abstractComponentCallbacksC0489ml)) {
                this.f5375x = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2712d() {
        this.f5353b = false;
        this.f5348D.clear();
        this.f5347C.clear();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m2713e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListM2230i = this.f5354c.m2230i();
        int size = arrayListM2230i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM2230i.get(i);
            i++;
            ViewGroup viewGroup = ((C0035a) obj).f506c.f3228D;
            if (viewGroup != null) {
                hashSet.add(C0103cg.m674f(viewGroup, m2733y()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public final C0035a m2714f(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        String str = abstractComponentCallbacksC0489ml.f3245e;
        C0659r5 c0659r5 = this.f5354c;
        C0035a c0035a = (C0035a) ((HashMap) c0659r5.f4209b).get(str);
        if (c0035a != null) {
            return c0035a;
        }
        C0035a c0035a2 = new C0035a(this.f5362k, c0659r5, abstractComponentCallbacksC0489ml);
        c0035a2.m266m(this.f5365n.f3428D.getClassLoader());
        c0035a2.f508e = this.f5364m;
        return c0035a2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2715g(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (m2689A(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0489ml);
        }
        if (abstractComponentCallbacksC0489ml.f3266z) {
            return;
        }
        abstractComponentCallbacksC0489ml.f3266z = true;
        if (abstractComponentCallbacksC0489ml.f3251k) {
            if (m2689A(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0489ml);
            }
            C0659r5 c0659r5 = this.f5354c;
            synchronized (((ArrayList) c0659r5.f4210c)) {
                ((ArrayList) c0659r5.f4210c).remove(abstractComponentCallbacksC0489ml);
            }
            abstractComponentCallbacksC0489ml.f3251k = false;
            if (m2690B(abstractComponentCallbacksC0489ml)) {
                this.f5375x = true;
            }
            m2706Q(abstractComponentCallbacksC0489ml);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2716h() {
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                abstractComponentCallbacksC0489ml.f3227C = true;
                abstractComponentCallbacksC0489ml.f3260t.m2716h();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2717i() {
        if (this.f5364m >= 1) {
            for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f5354c.m2237p()) {
                if (abstractComponentCallbacksC0489ml != null) {
                    if (!abstractComponentCallbacksC0489ml.f3265y ? abstractComponentCallbacksC0489ml.f3260t.m2717i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2718j() {
        if (this.f5364m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null && m2691C(abstractComponentCallbacksC0489ml)) {
                if (!abstractComponentCallbacksC0489ml.f3265y ? abstractComponentCallbacksC0489ml.f3260t.m2718j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0489ml);
                    z = true;
                }
            }
        }
        if (this.f5356e != null) {
            for (int i = 0; i < this.f5356e.size(); i++) {
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = (AbstractComponentCallbacksC0489ml) this.f5356e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0489ml2)) {
                    abstractComponentCallbacksC0489ml2.getClass();
                }
            }
        }
        this.f5356e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final void m2719k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f5345A = true;
        m2728t(true);
        Iterator it = m2713e().iterator();
        while (it.hasNext()) {
            ((C0103cg) it.next()).m679e();
        }
        m2724p(-1);
        this.f5365n = null;
        this.f5366o = null;
        this.f5367p = null;
        if (this.f5358g != null) {
            Iterator it2 = this.f5359h.f4447b.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0289h8) it2.next()).cancel();
            }
            this.f5358g = null;
        }
        C0138d4 c0138d4 = this.f5371t;
        if (c0138d4 != null) {
            C0702sb c0702sb = (C0702sb) c0138d4.f1364c;
            String str = (String) c0138d4.f1363b;
            Bundle bundle = c0702sb.f4414g;
            HashMap map = c0702sb.f4413f;
            if (!c0702sb.f4411d.contains(str) && (num3 = (Integer) c0702sb.f4409b.remove(str)) != null) {
                c0702sb.f4408a.remove(num3);
            }
            c0702sb.f4412e.remove(str);
            if (map.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
                map.remove(str);
            }
            if (bundle.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
                bundle.remove(str);
            }
            if (c0702sb.f4410c.get(str) != null) {
                throw new ClassCastException();
            }
            C0138d4 c0138d42 = this.f5372u;
            C0702sb c0702sb2 = (C0702sb) c0138d42.f1364c;
            String str2 = (String) c0138d42.f1363b;
            Bundle bundle2 = c0702sb2.f4414g;
            HashMap map2 = c0702sb2.f4413f;
            if (!c0702sb2.f4411d.contains(str2) && (num2 = (Integer) c0702sb2.f4409b.remove(str2)) != null) {
                c0702sb2.f4408a.remove(num2);
            }
            c0702sb2.f4412e.remove(str2);
            if (map2.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + map2.get(str2));
                map2.remove(str2);
            }
            if (bundle2.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + bundle2.getParcelable(str2));
                bundle2.remove(str2);
            }
            if (c0702sb2.f4410c.get(str2) != null) {
                throw new ClassCastException();
            }
            C0138d4 c0138d43 = this.f5373v;
            C0702sb c0702sb3 = (C0702sb) c0138d43.f1364c;
            String str3 = (String) c0138d43.f1363b;
            Bundle bundle3 = c0702sb3.f4414g;
            HashMap map3 = c0702sb3.f4413f;
            if (!c0702sb3.f4411d.contains(str3) && (num = (Integer) c0702sb3.f4409b.remove(str3)) != null) {
                c0702sb3.f4408a.remove(num);
            }
            c0702sb3.f4412e.remove(str3);
            if (map3.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + map3.get(str3));
                map3.remove(str3);
            }
            if (bundle3.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + bundle3.getParcelable(str3));
                bundle3.remove(str3);
            }
            if (c0702sb3.f4410c.get(str3) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2720l() {
        if (this.f5364m >= 1) {
            for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f5354c.m2237p()) {
                if (abstractComponentCallbacksC0489ml != null) {
                    if (!abstractComponentCallbacksC0489ml.f3265y ? abstractComponentCallbacksC0489ml.f3260t.m2720l() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2721m() {
        if (this.f5364m < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null && !abstractComponentCallbacksC0489ml.f3265y) {
                abstractComponentCallbacksC0489ml.f3260t.m2721m();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2722n(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (abstractComponentCallbacksC0489ml != null) {
            if (abstractComponentCallbacksC0489ml.equals(this.f5354c.m2228g(abstractComponentCallbacksC0489ml.f3245e))) {
                abstractComponentCallbacksC0489ml.f3258r.getClass();
                boolean zM2692D = m2692D(abstractComponentCallbacksC0489ml);
                Boolean bool = abstractComponentCallbacksC0489ml.f3250j;
                if (bool == null || bool.booleanValue() != zM2692D) {
                    abstractComponentCallbacksC0489ml.f3250j = Boolean.valueOf(zM2692D);
                    C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3260t;
                    c0934yl.m2708T();
                    c0934yl.m2722n(c0934yl.f5368q);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2723o() {
        boolean z = false;
        if (this.f5364m < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : this.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null && m2691C(abstractComponentCallbacksC0489ml)) {
                if (!abstractComponentCallbacksC0489ml.f3265y ? abstractComponentCallbacksC0489ml.f3260t.m2723o() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final void m2724p(int i) {
        try {
            this.f5353b = true;
            for (C0035a c0035a : ((HashMap) this.f5354c.f4209b).values()) {
                if (c0035a != null) {
                    c0035a.f508e = i;
                }
            }
            m2694E(i, false);
            Iterator it = m2713e().iterator();
            while (it.hasNext()) {
                ((C0103cg) it.next()).m679e();
            }
            this.f5353b = false;
            m2728t(true);
        } catch (Throwable th) {
            this.f5353b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2725q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        C0607pr c0607pr;
        String str2;
        String strM2764i = z30.m2764i(str, "    ");
        C0659r5 c0659r5 = this.f5354c;
        ArrayList arrayList = (ArrayList) c0659r5.f4210c;
        String strM2764i2 = z30.m2764i(str, "    ");
        HashMap map = (HashMap) c0659r5.f4209b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0035a c0035a : map.values()) {
                printWriter.print(str);
                if (c0035a != null) {
                    AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a.f506c;
                    printWriter.println(abstractComponentCallbacksC0489ml);
                    abstractComponentCallbacksC0489ml.getClass();
                    printWriter.print(strM2764i2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0489ml.f3262v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0489ml.f3263w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0489ml.f3264x);
                    printWriter.print(strM2764i2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3241a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3245e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0489ml.f3257q);
                    printWriter.print(strM2764i2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3251k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3252l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3253m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0489ml.f3254n);
                    printWriter.print(strM2764i2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3265y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3266z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3226B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strM2764i2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0489ml.f3225A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0489ml.f3231G);
                    if (abstractComponentCallbacksC0489ml.f3258r != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3258r);
                    }
                    if (abstractComponentCallbacksC0489ml.f3259s != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3259s);
                    }
                    if (abstractComponentCallbacksC0489ml.f3261u != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3261u);
                    }
                    if (abstractComponentCallbacksC0489ml.f3246f != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3246f);
                    }
                    if (abstractComponentCallbacksC0489ml.f3242b != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3242b);
                    }
                    if (abstractComponentCallbacksC0489ml.f3243c != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3243c);
                    }
                    if (abstractComponentCallbacksC0489ml.f3244d != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3244d);
                    }
                    Object objM2228g = abstractComponentCallbacksC0489ml.f3247g;
                    if (objM2228g == null) {
                        C0934yl c0934yl = abstractComponentCallbacksC0489ml.f3258r;
                        objM2228g = (c0934yl == null || (str2 = abstractComponentCallbacksC0489ml.f3248h) == null) ? null : c0934yl.f5354c.m2228g(str2);
                    }
                    if (objM2228g != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM2228g);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3249i);
                    }
                    printWriter.print(strM2764i2);
                    printWriter.print("mPopDirection=");
                    C0452ll c0452ll = abstractComponentCallbacksC0489ml.f3232H;
                    printWriter.println(c0452ll == null ? false : c0452ll.f3069a);
                    C0452ll c0452ll2 = abstractComponentCallbacksC0489ml.f3232H;
                    if ((c0452ll2 == null ? 0 : c0452ll2.f3070b) != 0) {
                        printWriter.print(strM2764i2);
                        printWriter.print("getEnterAnim=");
                        C0452ll c0452ll3 = abstractComponentCallbacksC0489ml.f3232H;
                        printWriter.println(c0452ll3 == null ? 0 : c0452ll3.f3070b);
                    }
                    C0452ll c0452ll4 = abstractComponentCallbacksC0489ml.f3232H;
                    if ((c0452ll4 == null ? 0 : c0452ll4.f3071c) != 0) {
                        printWriter.print(strM2764i2);
                        printWriter.print("getExitAnim=");
                        C0452ll c0452ll5 = abstractComponentCallbacksC0489ml.f3232H;
                        printWriter.println(c0452ll5 == null ? 0 : c0452ll5.f3071c);
                    }
                    C0452ll c0452ll6 = abstractComponentCallbacksC0489ml.f3232H;
                    if ((c0452ll6 == null ? 0 : c0452ll6.f3072d) != 0) {
                        printWriter.print(strM2764i2);
                        printWriter.print("getPopEnterAnim=");
                        C0452ll c0452ll7 = abstractComponentCallbacksC0489ml.f3232H;
                        printWriter.println(c0452ll7 == null ? 0 : c0452ll7.f3072d);
                    }
                    C0452ll c0452ll8 = abstractComponentCallbacksC0489ml.f3232H;
                    if ((c0452ll8 == null ? 0 : c0452ll8.f3073e) != 0) {
                        printWriter.print(strM2764i2);
                        printWriter.print("getPopExitAnim=");
                        C0452ll c0452ll9 = abstractComponentCallbacksC0489ml.f3232H;
                        printWriter.println(c0452ll9 == null ? 0 : c0452ll9.f3073e);
                    }
                    if (abstractComponentCallbacksC0489ml.f3228D != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3228D);
                    }
                    if (abstractComponentCallbacksC0489ml.f3229E != null) {
                        printWriter.print(strM2764i2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0489ml.f3229E);
                    }
                    if (abstractComponentCallbacksC0489ml.m1835h() != null) {
                        ra0 ra0VarMo119d = abstractComponentCallbacksC0489ml.mo119d();
                        AbstractC0346ip.m1503o("store", ra0VarMo119d);
                        C0705se c0705se = C0705se.f4429b;
                        AbstractC0346ip.m1503o("defaultCreationExtras", c0705se);
                        String canonicalName = C0607pr.class.getCanonicalName();
                        if (canonicalName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
                        AbstractC0346ip.m1503o("key", strConcat);
                        LinkedHashMap linkedHashMap = ra0VarMo119d.f4257a;
                        pa0 pa0Var = (pa0) linkedHashMap.get(strConcat);
                        if (C0607pr.class.isInstance(pa0Var)) {
                            AbstractC0346ip.m1501m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", pa0Var);
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.putAll(c0705se.f4565a);
                            linkedHashMap2.put(C0819vh.f4857p, strConcat);
                            try {
                                c0607pr = new C0607pr();
                            } catch (AbstractMethodError unused) {
                                c0607pr = new C0607pr();
                            }
                            pa0Var = c0607pr;
                            pa0 pa0Var2 = (pa0) linkedHashMap.put(strConcat, pa0Var);
                            if (pa0Var2 != null) {
                                pa0Var2.mo113a();
                            }
                        }
                        e40 e40Var = ((C0607pr) pa0Var).f3923c;
                        if (e40Var.f1712c > 0) {
                            printWriter.print(strM2764i2);
                            printWriter.println("Loaders:");
                            if (e40Var.f1712c > 0) {
                                if (e40Var.f1711b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strM2764i2);
                                printWriter.print("  #");
                                printWriter.print(e40Var.f1710a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strM2764i2);
                    printWriter.println("Child " + abstractComponentCallbacksC0489ml.f3260t + ":");
                    abstractComponentCallbacksC0489ml.f3260t.m2725q(z30.m2764i(strM2764i2, "  "), fileDescriptor, printWriter, strArr);
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
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = (AbstractComponentCallbacksC0489ml) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0489ml2.toString());
            }
        }
        ArrayList arrayList2 = this.f5356e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml3 = (AbstractComponentCallbacksC0489ml) this.f5356e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0489ml3.toString());
            }
        }
        ArrayList arrayList3 = this.f5355d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0058b7 c0058b7 = (C0058b7) this.f5355d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0058b7.toString());
                c0058b7.m538d(strM2764i, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5360i.get());
        synchronized (this.f5352a) {
            try {
                int size4 = this.f5352a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC0860wl) this.f5352a.get(i4);
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
        printWriter.println(this.f5365n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5366o);
        if (this.f5367p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5367p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5364m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5376y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5377z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5345A);
        if (this.f5375x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5375x);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2726r(InterfaceC0860wl interfaceC0860wl, boolean z) {
        if (!z) {
            if (this.f5365n == null) {
                if (!this.f5345A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f5376y || this.f5377z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f5352a) {
            try {
                if (this.f5365n == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f5352a.add(interfaceC0860wl);
                    m2702M();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2727s(boolean z) {
        if (this.f5353b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f5365n == null) {
            if (!this.f5345A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f5365n.f3429E.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.f5376y || this.f5377z)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f5347C == null) {
            this.f5347C = new ArrayList();
            this.f5348D = new ArrayList();
        }
        this.f5353b = false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2728t(boolean z) {
        boolean zMo535a;
        m2727s(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f5347C;
            ArrayList arrayList2 = this.f5348D;
            synchronized (this.f5352a) {
                try {
                    if (this.f5352a.isEmpty()) {
                        zMo535a = false;
                    } else {
                        int size = this.f5352a.size();
                        zMo535a = false;
                        for (int i = 0; i < size; i++) {
                            zMo535a |= ((InterfaceC0860wl) this.f5352a.get(i)).mo535a(arrayList, arrayList2);
                        }
                        this.f5352a.clear();
                        this.f5365n.f3429E.removeCallbacks(this.f5351G);
                    }
                } finally {
                }
            }
            if (!zMo535a) {
                break;
            }
            z2 = true;
            this.f5353b = true;
            try {
                m2699J(this.f5347C, this.f5348D);
            } finally {
                m2712d();
            }
        }
        m2708T();
        if (this.f5346B) {
            this.f5346B = false;
            m2707S();
        }
        ((HashMap) this.f5354c.f4209b).values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            sb.append(abstractComponentCallbacksC0489ml.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f5367p)));
            sb.append("}");
        } else {
            C0526nl c0526nl = this.f5365n;
            if (c0526nl != null) {
                sb.append(c0526nl.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f5365n)));
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
    public final void m2729u(java.util.ArrayList r23, java.util.ArrayList r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0934yl.m2729u(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* JADX INFO: renamed from: v */
    public final AbstractComponentCallbacksC0489ml m2730v(int i) {
        C0659r5 c0659r5 = this.f5354c;
        ArrayList arrayList = (ArrayList) c0659r5.f4210c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = (AbstractComponentCallbacksC0489ml) arrayList.get(size);
            if (abstractComponentCallbacksC0489ml != null && abstractComponentCallbacksC0489ml.f3262v == i) {
                return abstractComponentCallbacksC0489ml;
            }
        }
        for (C0035a c0035a : ((HashMap) c0659r5.f4209b).values()) {
            if (c0035a != null) {
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = c0035a.f506c;
                if (abstractComponentCallbacksC0489ml2.f3262v == i) {
                    return abstractComponentCallbacksC0489ml2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final ViewGroup m2731w(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        ViewGroup viewGroup = abstractComponentCallbacksC0489ml.f3228D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0489ml.f3263w <= 0 || !this.f5366o.mo1514H()) {
            return null;
        }
        View viewMo1513G = this.f5366o.mo1513G(abstractComponentCallbacksC0489ml.f3263w);
        if (viewMo1513G instanceof ViewGroup) {
            return (ViewGroup) viewMo1513G;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final C0749tl m2732x() {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f5367p;
        return abstractComponentCallbacksC0489ml != null ? abstractComponentCallbacksC0489ml.f3258r.m2732x() : this.f5369r;
    }

    /* JADX INFO: renamed from: y */
    public final C0819vh m2733y() {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f5367p;
        return abstractComponentCallbacksC0489ml != null ? abstractComponentCallbacksC0489ml.f3258r.m2733y() : this.f5370s;
    }

    /* JADX INFO: renamed from: z */
    public final void m2734z(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (m2689A(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0489ml);
        }
        if (abstractComponentCallbacksC0489ml.f3265y) {
            return;
        }
        abstractComponentCallbacksC0489ml.f3265y = true;
        abstractComponentCallbacksC0489ml.f3233I = true ^ abstractComponentCallbacksC0489ml.f3233I;
        m2706Q(abstractComponentCallbacksC0489ml);
    }
}

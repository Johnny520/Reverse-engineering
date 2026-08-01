package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0374e;
import androidx.activity.C0378i;
import androidx.activity.InterfaceC0370a;
import androidx.lifecycle.EnumC0479n;
import com.p055lu.wxmask272.R;
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
import p004C.C0064h;
import p006D.AbstractC0079h;
import p006D.RunnableC0073b;
import p012G.C0140d;
import p014H.C0142a;
import p020K.C0161a;
import p022L.AbstractC0174d;
import p061e.AbstractActivityC0533i;
import p075l.C0754l;

/* JADX INFO: renamed from: androidx.fragment.app.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0448z {

    /* JADX INFO: renamed from: A */
    public boolean f1423A;

    /* JADX INFO: renamed from: B */
    public boolean f1424B;

    /* JADX INFO: renamed from: C */
    public ArrayList f1425C;

    /* JADX INFO: renamed from: D */
    public ArrayList f1426D;

    /* JADX INFO: renamed from: E */
    public ArrayList f1427E;

    /* JADX INFO: renamed from: F */
    public C0411B f1428F;

    /* JADX INFO: renamed from: G */
    public final RunnableC0073b f1429G;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1430a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f1431b;

    /* JADX INFO: renamed from: c */
    public final C0064h f1432c;

    /* JADX INFO: renamed from: d */
    public ArrayList f1433d;

    /* JADX INFO: renamed from: e */
    public ArrayList f1434e;

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0441s f1435f;

    /* JADX INFO: renamed from: g */
    public C0378i f1436g;

    /* JADX INFO: renamed from: h */
    public final C0443u f1437h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f1438i;

    /* JADX INFO: renamed from: j */
    public final Map f1439j;

    /* JADX INFO: renamed from: k */
    public final C0142a f1440k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f1441l;

    /* JADX INFO: renamed from: m */
    public int f1442m;

    /* JADX INFO: renamed from: n */
    public C0437o f1443n;

    /* JADX INFO: renamed from: o */
    public AbstractC0079h f1444o;

    /* JADX INFO: renamed from: p */
    public AbstractComponentCallbacksC0434l f1445p;

    /* JADX INFO: renamed from: q */
    public AbstractComponentCallbacksC0434l f1446q;

    /* JADX INFO: renamed from: r */
    public final C0444v f1447r;

    /* JADX INFO: renamed from: s */
    public final C0140d f1448s;

    /* JADX INFO: renamed from: t */
    public C0142a f1449t;

    /* JADX INFO: renamed from: u */
    public C0142a f1450u;

    /* JADX INFO: renamed from: v */
    public C0142a f1451v;

    /* JADX INFO: renamed from: w */
    public ArrayDeque f1452w;

    /* JADX INFO: renamed from: x */
    public boolean f1453x;

    /* JADX INFO: renamed from: y */
    public boolean f1454y;

    /* JADX INFO: renamed from: z */
    public boolean f1455z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0448z() {
        C0064h c0064h = new C0064h();
        c0064h.f308b = new ArrayList();
        c0064h.f309c = new HashMap();
        this.f1432c = c0064h;
        this.f1435f = new LayoutInflaterFactory2C0441s(this);
        this.f1437h = new C0443u(this);
        this.f1438i = new AtomicInteger();
        this.f1439j = Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new C0140d(this);
        C0142a c0142a = new C0142a();
        c0142a.f443b = new CopyOnWriteArrayList();
        c0142a.f444c = this;
        this.f1440k = c0142a;
        this.f1441l = new CopyOnWriteArrayList();
        this.f1442m = -1;
        this.f1447r = new C0444v(this);
        this.f1448s = new C0140d(22);
        this.f1452w = new ArrayDeque();
        this.f1429G = new RunnableC0073b(3, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m856E(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m857F(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        abstractComponentCallbacksC0434l.getClass();
        C0064h c0064h = abstractComponentCallbacksC0434l.f1384u.f1432c;
        c0064h.getClass();
        ArrayList<AbstractComponentCallbacksC0434l> arrayList = new ArrayList();
        for (C0415F c0415f : ((HashMap) c0064h.f309c).values()) {
            if (c0415f != null) {
                arrayList.add(c0415f.f1254c);
            } else {
                arrayList.add(null);
            }
        }
        boolean zM857F = false;
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 : arrayList) {
            if (abstractComponentCallbacksC0434l2 != null) {
                zM857F = m857F(abstractComponentCallbacksC0434l2);
            }
            if (zM857F) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static boolean m858G(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (abstractComponentCallbacksC0434l == null) {
            return true;
        }
        if (abstractComponentCallbacksC0434l.f1350C) {
            return abstractComponentCallbacksC0434l.f1382s == null || m858G(abstractComponentCallbacksC0434l.f1385v);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m859H(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (abstractComponentCallbacksC0434l == null) {
            return true;
        }
        C0448z c0448z = abstractComponentCallbacksC0434l.f1382s;
        return abstractComponentCallbacksC0434l.equals(c0448z.f1446q) && m859H(c0448z.f1445p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static void m860T(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (m856E(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0434l);
        }
        if (abstractComponentCallbacksC0434l.f1389z) {
            abstractComponentCallbacksC0434l.f1389z = false;
            abstractComponentCallbacksC0434l.f1357J = !abstractComponentCallbacksC0434l.f1357J;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final ViewGroup m861A(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        ViewGroup viewGroup = abstractComponentCallbacksC0434l.f1352E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0434l.f1387x <= 0 || !this.f1444o.mo202H()) {
            return null;
        }
        View viewMo201G = this.f1444o.mo201G(abstractComponentCallbacksC0434l.f1387x);
        if (viewMo201G instanceof ViewGroup) {
            return (ViewGroup) viewMo201G;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final C0444v m862B() {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1445p;
        return abstractComponentCallbacksC0434l != null ? abstractComponentCallbacksC0434l.f1382s.m862B() : this.f1447r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final C0140d m863C() {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1445p;
        return abstractComponentCallbacksC0434l != null ? abstractComponentCallbacksC0434l.f1382s.m863C() : this.f1448s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m864D(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (m856E(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0434l);
        }
        if (abstractComponentCallbacksC0434l.f1389z) {
            return;
        }
        abstractComponentCallbacksC0434l.f1389z = true;
        abstractComponentCallbacksC0434l.f1357J = true ^ abstractComponentCallbacksC0434l.f1357J;
        m875S(abstractComponentCallbacksC0434l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m865I(int i2, boolean z2) {
        HashMap map;
        C0437o c0437o;
        if (this.f1443n == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f1442m) {
            this.f1442m = i2;
            C0064h c0064h = this.f1432c;
            Iterator it = ((ArrayList) c0064h.f308b).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) c0064h.f309c;
                if (!zHasNext) {
                    break;
                }
                C0415F c0415f = (C0415F) map.get(((AbstractComponentCallbacksC0434l) it.next()).f1369f);
                if (c0415f != null) {
                    c0415f.m799k();
                }
            }
            for (C0415F c0415f2 : map.values()) {
                if (c0415f2 != null) {
                    c0415f2.m799k();
                    AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0415f2.f1254c;
                    if (abstractComponentCallbacksC0434l.f1376m && abstractComponentCallbacksC0434l.f1381r <= 0) {
                        c0064h.m129s(c0415f2);
                    }
                }
            }
            m876U();
            if (this.f1453x && (c0437o = this.f1443n) != null && this.f1442m == 7) {
                c0437o.f1398h.m1072i().mo1084b();
                this.f1453x = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m866J() {
        if (this.f1443n == null) {
            return;
        }
        this.f1454y = false;
        this.f1455z = false;
        this.f1428F.f1236i = false;
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null) {
                abstractComponentCallbacksC0434l.f1384u.m866J();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final boolean m867K() {
        int size;
        boolean z2;
        m899v(false);
        m898u(true);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1446q;
        if (abstractComponentCallbacksC0434l != null && abstractComponentCallbacksC0434l.m840e().m867K()) {
            return true;
        }
        ArrayList arrayList = this.f1425C;
        ArrayList arrayList2 = this.f1426D;
        ArrayList arrayList3 = this.f1433d;
        if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
            arrayList.add(this.f1433d.remove(size));
            arrayList2.add(Boolean.TRUE);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f1431b = true;
            try {
                m869M(this.f1425C, this.f1426D);
            } finally {
                m881d();
            }
        }
        m877V();
        if (this.f1424B) {
            this.f1424B = false;
            m876U();
        }
        ((HashMap) this.f1432c.f309c).values().removeAll(Collections.singleton(null));
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m868L(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (m856E(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0434l + " nesting=" + abstractComponentCallbacksC0434l.f1381r);
        }
        boolean z2 = abstractComponentCallbacksC0434l.f1381r > 0;
        if (abstractComponentCallbacksC0434l.f1348A && z2) {
            return;
        }
        C0064h c0064h = this.f1432c;
        synchronized (((ArrayList) c0064h.f308b)) {
            ((ArrayList) c0064h.f308b).remove(abstractComponentCallbacksC0434l);
        }
        abstractComponentCallbacksC0434l.f1375l = false;
        if (m857F(abstractComponentCallbacksC0434l)) {
            this.f1453x = true;
        }
        abstractComponentCallbacksC0434l.f1376m = true;
        m875S(abstractComponentCallbacksC0434l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m869M(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((C0423a) arrayList.get(i2)).f1296o) {
                if (i3 != i2) {
                    m901x(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C0423a) arrayList.get(i3)).f1296o) {
                        i3++;
                    }
                }
                m901x(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m901x(arrayList, arrayList2, i3, size);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m870N(Parcelable parcelable) {
        int i2;
        C0142a c0142a;
        int i3;
        C0415F c0415f;
        if (parcelable == null) {
            return;
        }
        C0410A c0410a = (C0410A) parcelable;
        if (c0410a.f1222a == null) {
            return;
        }
        C0064h c0064h = this.f1432c;
        ((HashMap) c0064h.f309c).clear();
        Iterator it = c0410a.f1222a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i2 = 2;
            c0142a = this.f1440k;
            if (!zHasNext) {
                break;
            }
            C0413D c0413d = (C0413D) it.next();
            if (c0413d != null) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = (AbstractComponentCallbacksC0434l) this.f1428F.f1231d.get(c0413d.f1238b);
                if (abstractComponentCallbacksC0434l != null) {
                    if (m856E(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0434l);
                    }
                    c0415f = new C0415F(c0142a, c0064h, abstractComponentCallbacksC0434l, c0413d);
                } else {
                    c0415f = new C0415F(this.f1440k, this.f1432c, this.f1443n.f1395e.getClassLoader(), m862B(), c0413d);
                }
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = c0415f.f1254c;
                abstractComponentCallbacksC0434l2.f1382s = this;
                if (m856E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0434l2.f1369f + "): " + abstractComponentCallbacksC0434l2);
                }
                c0415f.m801m(this.f1443n.f1395e.getClassLoader());
                c0064h.m128r(c0415f);
                c0415f.f1256e = this.f1442m;
            }
        }
        C0411B c0411b = this.f1428F;
        c0411b.getClass();
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l3 : new ArrayList(c0411b.f1231d.values())) {
            if (!(((HashMap) c0064h.f309c).get(abstractComponentCallbacksC0434l3.f1369f) != null)) {
                if (m856E(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0434l3 + " that was not found in the set of active Fragments " + c0410a.f1222a);
                }
                this.f1428F.m784c(abstractComponentCallbacksC0434l3);
                abstractComponentCallbacksC0434l3.f1382s = this;
                C0415F c0415f2 = new C0415F(c0142a, c0064h, abstractComponentCallbacksC0434l3);
                c0415f2.f1256e = 1;
                c0415f2.m799k();
                abstractComponentCallbacksC0434l3.f1376m = true;
                c0415f2.m799k();
            }
        }
        ArrayList<String> arrayList = c0410a.f1223b;
        ((ArrayList) c0064h.f308b).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM117g = c0064h.m117g(str);
                if (abstractComponentCallbacksC0434lM117g == null) {
                    throw new IllegalStateException(AbstractC0174d.m353i("No instantiated fragment for (", str, ")"));
                }
                if (m856E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + abstractComponentCallbacksC0434lM117g);
                }
                c0064h.m116f(abstractComponentCallbacksC0434lM117g);
            }
        }
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l4 = null;
        if (c0410a.f1224c != null) {
            this.f1433d = new ArrayList(c0410a.f1224c.length);
            int i4 = 0;
            while (true) {
                C0424b[] c0424bArr = c0410a.f1224c;
                if (i4 >= c0424bArr.length) {
                    break;
                }
                C0424b c0424b = c0424bArr[i4];
                c0424b.getClass();
                C0423a c0423a = new C0423a(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = c0424b.f1299a;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    C0416G c0416g = new C0416G();
                    int i7 = i5 + 1;
                    int i8 = i2;
                    c0416g.f1258a = iArr[i5];
                    if (m856E(i8)) {
                        Log.v("FragmentManager", "Instantiate " + c0423a + " op #" + i6 + " base fragment #" + iArr[i7]);
                    }
                    String str2 = (String) c0424b.f1300b.get(i6);
                    if (str2 != null) {
                        c0416g.f1259b = c0064h.m117g(str2);
                    } else {
                        c0416g.f1259b = abstractComponentCallbacksC0434l4;
                    }
                    c0416g.f1264g = EnumC0479n.values()[c0424b.f1301c[i6]];
                    c0416g.f1265h = EnumC0479n.values()[c0424b.f1302d[i6]];
                    int i9 = iArr[i7];
                    c0416g.f1260c = i9;
                    int i10 = iArr[i5 + 2];
                    c0416g.f1261d = i10;
                    int i11 = i5 + 4;
                    int i12 = iArr[i5 + 3];
                    c0416g.f1262e = i12;
                    i5 += 5;
                    int i13 = iArr[i11];
                    c0416g.f1263f = i13;
                    c0423a.f1283b = i9;
                    c0423a.f1284c = i10;
                    c0423a.f1285d = i12;
                    c0423a.f1286e = i13;
                    c0423a.m820b(c0416g);
                    i6++;
                    i2 = i8;
                    abstractComponentCallbacksC0434l4 = null;
                }
                int i14 = i2;
                c0423a.f1287f = c0424b.f1303e;
                c0423a.f1289h = c0424b.f1304f;
                c0423a.f1298q = c0424b.f1305g;
                c0423a.f1288g = true;
                c0423a.f1290i = c0424b.f1306h;
                c0423a.f1291j = c0424b.f1307i;
                c0423a.f1292k = c0424b.f1308j;
                c0423a.f1293l = c0424b.f1309k;
                c0423a.f1294m = c0424b.f1310l;
                c0423a.f1295n = c0424b.f1311m;
                c0423a.f1296o = c0424b.f1312n;
                c0423a.m821c(1);
                if (m856E(i14)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + c0423a.f1298q + "): " + c0423a);
                    PrintWriter printWriter = new PrintWriter(new C0418I());
                    c0423a.m822d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1433d.add(c0423a);
                i4++;
                i2 = i14;
                abstractComponentCallbacksC0434l4 = null;
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.f1433d = null;
        }
        this.f1438i.set(c0410a.f1225d);
        String str3 = c0410a.f1226e;
        if (str3 != null) {
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM117g2 = c0064h.m117g(str3);
            this.f1446q = abstractComponentCallbacksC0434lM117g2;
            m893p(abstractComponentCallbacksC0434lM117g2);
        }
        ArrayList arrayList2 = c0410a.f1227f;
        if (arrayList2 != null) {
            for (int i15 = i3; i15 < arrayList2.size(); i15++) {
                Bundle bundle = (Bundle) c0410a.f1228g.get(i15);
                bundle.setClassLoader(this.f1443n.f1395e.getClassLoader());
                this.f1439j.put(arrayList2.get(i15), bundle);
            }
        }
        this.f1452w = new ArrayDeque(c0410a.f1229h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final C0410A m871O() {
        int i2;
        ArrayList arrayList;
        C0424b[] c0424bArr;
        int size;
        Iterator it = m882e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0431i c0431i = (C0431i) it.next();
            if (c0431i.f1334e) {
                c0431i.f1334e = false;
                c0431i.m835c();
            }
        }
        Iterator it2 = m882e().iterator();
        while (it2.hasNext()) {
            ((C0431i) it2.next()).m837e();
        }
        m899v(true);
        this.f1454y = true;
        this.f1428F.f1236i = true;
        C0064h c0064h = this.f1432c;
        c0064h.getClass();
        HashMap map = (HashMap) c0064h.f309c;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0415F c0415f = (C0415F) it3.next();
            if (c0415f != null) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0415f.f1254c;
                C0413D c0413d = new C0413D(abstractComponentCallbacksC0434l);
                if (abstractComponentCallbacksC0434l.f1365b <= -1 || c0413d.f1249m != null) {
                    c0413d.f1249m = abstractComponentCallbacksC0434l.f1366c;
                } else {
                    Bundle bundle = new Bundle();
                    abstractComponentCallbacksC0434l.f1363P.m404e(bundle);
                    C0410A c0410aM871O = abstractComponentCallbacksC0434l.f1384u.m871O();
                    if (c0410aM871O != null) {
                        bundle.putParcelable("android:support:fragments", c0410aM871O);
                    }
                    c0415f.f1252a.m326l(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (abstractComponentCallbacksC0434l.f1353F != null) {
                        c0415f.m803o();
                    }
                    if (abstractComponentCallbacksC0434l.f1367d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0434l.f1367d);
                    }
                    if (abstractComponentCallbacksC0434l.f1368e != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0434l.f1368e);
                    }
                    if (!abstractComponentCallbacksC0434l.f1355H) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0434l.f1355H);
                    }
                    c0413d.f1249m = bundle2;
                    if (abstractComponentCallbacksC0434l.f1372i != null) {
                        if (bundle2 == null) {
                            c0413d.f1249m = new Bundle();
                        }
                        c0413d.f1249m.putString("android:target_state", abstractComponentCallbacksC0434l.f1372i);
                        int i3 = abstractComponentCallbacksC0434l.f1373j;
                        if (i3 != 0) {
                            c0413d.f1249m.putInt("android:target_req_state", i3);
                        }
                    }
                }
                arrayList2.add(c0413d);
                if (m856E(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0434l + ": " + c0413d.f1249m);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (m856E(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0064h c0064h2 = this.f1432c;
        synchronized (((ArrayList) c0064h2.f308b)) {
            try {
                if (((ArrayList) c0064h2.f308b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) c0064h2.f308b).size());
                    for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 : (ArrayList) c0064h2.f308b) {
                        arrayList.add(abstractComponentCallbacksC0434l2.f1369f);
                        if (m856E(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0434l2.f1369f + "): " + abstractComponentCallbacksC0434l2);
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList3 = this.f1433d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            c0424bArr = null;
        } else {
            c0424bArr = new C0424b[size];
            for (i2 = 0; i2 < size; i2++) {
                c0424bArr[i2] = new C0424b((C0423a) this.f1433d.get(i2));
                if (m856E(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1433d.get(i2));
                }
            }
        }
        C0410A c0410a = new C0410A();
        c0410a.f1226e = null;
        ArrayList arrayList4 = new ArrayList();
        c0410a.f1227f = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        c0410a.f1228g = arrayList5;
        c0410a.f1222a = arrayList2;
        c0410a.f1223b = arrayList;
        c0410a.f1224c = c0424bArr;
        c0410a.f1225d = this.f1438i.get();
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l3 = this.f1446q;
        if (abstractComponentCallbacksC0434l3 != null) {
            c0410a.f1226e = abstractComponentCallbacksC0434l3.f1369f;
        }
        arrayList4.addAll(this.f1439j.keySet());
        arrayList5.addAll(this.f1439j.values());
        c0410a.f1229h = new ArrayList(this.f1452w);
        return c0410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m872P(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l, boolean z2) {
        ViewGroup viewGroupM861A = m861A(abstractComponentCallbacksC0434l);
        if (viewGroupM861A == null || !(viewGroupM861A instanceof C0439q)) {
            return;
        }
        ((C0439q) viewGroupM861A).setDrawDisappearingViewsLast(!z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m873Q(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l, EnumC0479n enumC0479n) {
        if (abstractComponentCallbacksC0434l.equals(this.f1432c.m117g(abstractComponentCallbacksC0434l.f1369f)) && (abstractComponentCallbacksC0434l.f1383t == null || abstractComponentCallbacksC0434l.f1382s == this)) {
            abstractComponentCallbacksC0434l.f1359L = enumC0479n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0434l + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m874R(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (abstractComponentCallbacksC0434l != null) {
            if (!abstractComponentCallbacksC0434l.equals(this.f1432c.m117g(abstractComponentCallbacksC0434l.f1369f)) || (abstractComponentCallbacksC0434l.f1383t != null && abstractComponentCallbacksC0434l.f1382s != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0434l + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = this.f1446q;
        this.f1446q = abstractComponentCallbacksC0434l;
        m893p(abstractComponentCallbacksC0434l2);
        m893p(this.f1446q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m875S(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        ViewGroup viewGroupM861A = m861A(abstractComponentCallbacksC0434l);
        if (viewGroupM861A != null) {
            C0433k c0433k = abstractComponentCallbacksC0434l.f1356I;
            if ((c0433k == null ? 0 : c0433k.f1340e) + (c0433k == null ? 0 : c0433k.f1339d) + (c0433k == null ? 0 : c0433k.f1338c) + (c0433k == null ? 0 : c0433k.f1337b) > 0) {
                if (viewGroupM861A.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM861A.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0434l);
                }
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = (AbstractComponentCallbacksC0434l) viewGroupM861A.getTag(R.id.visible_removing_fragment_view_tag);
                C0433k c0433k2 = abstractComponentCallbacksC0434l.f1356I;
                boolean z2 = c0433k2 != null ? c0433k2.f1336a : false;
                if (abstractComponentCallbacksC0434l2.f1356I == null) {
                    return;
                }
                abstractComponentCallbacksC0434l2.m839d().f1336a = z2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m876U() {
        for (C0415F c0415f : this.f1432c.m121k()) {
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0415f.f1254c;
            if (abstractComponentCallbacksC0434l.f1354G) {
                if (this.f1431b) {
                    this.f1424B = true;
                } else {
                    abstractComponentCallbacksC0434l.f1354G = false;
                    c0415f.m799k();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m877V() {
        synchronized (this.f1430a) {
            try {
                if (!this.f1430a.isEmpty()) {
                    this.f1437h.f1413a = true;
                    return;
                }
                C0443u c0443u = this.f1437h;
                ArrayList arrayList = this.f1433d;
                c0443u.f1413a = (arrayList != null ? arrayList.size() : 0) > 0 && m859H(this.f1445p);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0415F m878a(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (m856E(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0434l);
        }
        C0415F c0415fM883f = m883f(abstractComponentCallbacksC0434l);
        abstractComponentCallbacksC0434l.f1382s = this;
        C0064h c0064h = this.f1432c;
        c0064h.m128r(c0415fM883f);
        if (!abstractComponentCallbacksC0434l.f1348A) {
            c0064h.m116f(abstractComponentCallbacksC0434l);
            abstractComponentCallbacksC0434l.f1376m = false;
            if (abstractComponentCallbacksC0434l.f1353F == null) {
                abstractComponentCallbacksC0434l.f1357J = false;
            }
            if (m857F(abstractComponentCallbacksC0434l)) {
                this.f1453x = true;
            }
        }
        return c0415fM883f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m879b(C0437o c0437o, AbstractC0079h abstractC0079h, AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (this.f1443n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1443n = c0437o;
        this.f1444o = abstractC0079h;
        this.f1445p = abstractComponentCallbacksC0434l;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1441l;
        if (abstractComponentCallbacksC0434l != null) {
            copyOnWriteArrayList.add(new C0445w(abstractComponentCallbacksC0434l));
        } else if (c0437o != null) {
            copyOnWriteArrayList.add(c0437o);
        }
        if (this.f1445p != null) {
            m877V();
        }
        if (c0437o != null) {
            C0378i c0378i = c0437o.f1398h.f898i;
            this.f1436g = c0378i;
            c0378i.m641a(abstractComponentCallbacksC0434l != null ? abstractComponentCallbacksC0434l : c0437o, this.f1437h);
        }
        if (abstractComponentCallbacksC0434l != null) {
            C0411B c0411b = abstractComponentCallbacksC0434l.f1382s.f1428F;
            HashMap map = c0411b.f1232e;
            C0411B c0411b2 = (C0411B) map.get(abstractComponentCallbacksC0434l.f1369f);
            if (c0411b2 == null) {
                c0411b2 = new C0411B(c0411b.f1234g);
                map.put(abstractComponentCallbacksC0434l.f1369f, c0411b2);
            }
            this.f1428F = c0411b2;
        } else if (c0437o != null) {
            this.f1428F = (C0411B) new C0064h(c0437o.f1398h.getViewModelStore(), C0411B.f1230j).m119i(C0411B.class);
        } else {
            this.f1428F = new C0411B(false);
        }
        C0411B c0411b3 = this.f1428F;
        c0411b3.f1236i = this.f1454y || this.f1455z;
        this.f1432c.f310d = c0411b3;
        C0437o c0437o2 = this.f1443n;
        if (c0437o2 != null) {
            AbstractActivityC0533i abstractActivityC0533i = c0437o2.f1398h;
            String strM352h = AbstractC0174d.m352h("FragmentManager:", abstractComponentCallbacksC0434l != null ? AbstractC0174d.m356l(new StringBuilder(), abstractComponentCallbacksC0434l.f1369f, ":") : "");
            C0446x c0446x = new C0446x(2);
            C0442t c0442t = new C0442t(this, 2);
            C0374e c0374e = abstractActivityC0533i.f899j;
            this.f1449t = c0374e.m633b(strM352h + "StartActivityForResult", c0446x, c0442t);
            this.f1450u = c0374e.m633b(strM352h + "StartIntentSenderForResult", new C0446x(0), new C0442t(this, 0));
            this.f1451v = c0374e.m633b(strM352h + "RequestPermissions", new C0446x(1), new C0442t(this, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m880c(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (m856E(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0434l);
        }
        if (abstractComponentCallbacksC0434l.f1348A) {
            abstractComponentCallbacksC0434l.f1348A = false;
            if (abstractComponentCallbacksC0434l.f1375l) {
                return;
            }
            this.f1432c.m116f(abstractComponentCallbacksC0434l);
            if (m856E(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0434l);
            }
            if (m857F(abstractComponentCallbacksC0434l)) {
                this.f1453x = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m881d() {
        this.f1431b = false;
        this.f1426D.clear();
        this.f1425C.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final HashSet m882e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1432c.m121k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0415F) it.next()).f1254c.f1352E;
            if (viewGroup != null) {
                hashSet.add(C0431i.m832f(viewGroup, m863C()));
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C0415F m883f(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        String str = abstractComponentCallbacksC0434l.f1369f;
        C0064h c0064h = this.f1432c;
        C0415F c0415f = (C0415F) ((HashMap) c0064h.f309c).get(str);
        if (c0415f != null) {
            return c0415f;
        }
        C0415F c0415f2 = new C0415F(this.f1440k, c0064h, abstractComponentCallbacksC0434l);
        c0415f2.m801m(this.f1443n.f1395e.getClassLoader());
        c0415f2.f1256e = this.f1442m;
        return c0415f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m884g(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (m856E(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0434l);
        }
        if (abstractComponentCallbacksC0434l.f1348A) {
            return;
        }
        abstractComponentCallbacksC0434l.f1348A = true;
        if (abstractComponentCallbacksC0434l.f1375l) {
            if (m856E(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0434l);
            }
            C0064h c0064h = this.f1432c;
            synchronized (((ArrayList) c0064h.f308b)) {
                ((ArrayList) c0064h.f308b).remove(abstractComponentCallbacksC0434l);
            }
            abstractComponentCallbacksC0434l.f1375l = false;
            if (m857F(abstractComponentCallbacksC0434l)) {
                this.f1453x = true;
            }
            m875S(abstractComponentCallbacksC0434l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m885h() {
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null) {
                abstractComponentCallbacksC0434l.f1351D = true;
                abstractComponentCallbacksC0434l.f1384u.m885h();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m886i() {
        if (this.f1442m >= 1) {
            for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
                if (abstractComponentCallbacksC0434l != null) {
                    if (!abstractComponentCallbacksC0434l.f1389z ? abstractComponentCallbacksC0434l.f1384u.m886i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m887j() {
        if (this.f1442m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null && m858G(abstractComponentCallbacksC0434l)) {
                if (!abstractComponentCallbacksC0434l.f1389z ? abstractComponentCallbacksC0434l.f1384u.m887j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0434l);
                    z2 = true;
                }
            }
        }
        if (this.f1434e != null) {
            for (int i2 = 0; i2 < this.f1434e.size(); i2++) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = (AbstractComponentCallbacksC0434l) this.f1434e.get(i2);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0434l2)) {
                    abstractComponentCallbacksC0434l2.getClass();
                }
            }
        }
        this.f1434e = arrayList;
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m888k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f1423A = true;
        m899v(true);
        Iterator it = m882e().iterator();
        while (it.hasNext()) {
            ((C0431i) it.next()).m837e();
        }
        m896s(-1);
        this.f1443n = null;
        this.f1444o = null;
        this.f1445p = null;
        if (this.f1436g != null) {
            Iterator it2 = this.f1437h.f1414b.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0370a) it2.next()).cancel();
            }
            this.f1436g = null;
        }
        C0142a c0142a = this.f1449t;
        if (c0142a != null) {
            C0374e c0374e = (C0374e) c0142a.f444c;
            ArrayList arrayList = c0374e.f886e;
            String str = (String) c0142a.f443b;
            if (!arrayList.contains(str) && (num3 = (Integer) c0374e.f884c.remove(str)) != null) {
                c0374e.f883b.remove(num3);
            }
            c0374e.f887f.remove(str);
            HashMap map = c0374e.f888g;
            if (map.containsKey(str)) {
                StringBuilder sbM357m = AbstractC0174d.m357m("Dropping pending result for request ", str, ": ");
                sbM357m.append(map.get(str));
                Log.w("ActivityResultRegistry", sbM357m.toString());
                map.remove(str);
            }
            Bundle bundle = c0374e.f889h;
            if (bundle.containsKey(str)) {
                StringBuilder sbM357m2 = AbstractC0174d.m357m("Dropping pending result for request ", str, ": ");
                sbM357m2.append(bundle.getParcelable(str));
                Log.w("ActivityResultRegistry", sbM357m2.toString());
                bundle.remove(str);
            }
            if (c0374e.f885d.get(str) != null) {
                throw new ClassCastException();
            }
            C0142a c0142a2 = this.f1450u;
            C0374e c0374e2 = (C0374e) c0142a2.f444c;
            ArrayList arrayList2 = c0374e2.f886e;
            String str2 = (String) c0142a2.f443b;
            if (!arrayList2.contains(str2) && (num2 = (Integer) c0374e2.f884c.remove(str2)) != null) {
                c0374e2.f883b.remove(num2);
            }
            c0374e2.f887f.remove(str2);
            HashMap map2 = c0374e2.f888g;
            if (map2.containsKey(str2)) {
                StringBuilder sbM357m3 = AbstractC0174d.m357m("Dropping pending result for request ", str2, ": ");
                sbM357m3.append(map2.get(str2));
                Log.w("ActivityResultRegistry", sbM357m3.toString());
                map2.remove(str2);
            }
            Bundle bundle2 = c0374e2.f889h;
            if (bundle2.containsKey(str2)) {
                StringBuilder sbM357m4 = AbstractC0174d.m357m("Dropping pending result for request ", str2, ": ");
                sbM357m4.append(bundle2.getParcelable(str2));
                Log.w("ActivityResultRegistry", sbM357m4.toString());
                bundle2.remove(str2);
            }
            if (c0374e2.f885d.get(str2) != null) {
                throw new ClassCastException();
            }
            C0142a c0142a3 = this.f1451v;
            C0374e c0374e3 = (C0374e) c0142a3.f444c;
            ArrayList arrayList3 = c0374e3.f886e;
            String str3 = (String) c0142a3.f443b;
            if (!arrayList3.contains(str3) && (num = (Integer) c0374e3.f884c.remove(str3)) != null) {
                c0374e3.f883b.remove(num);
            }
            c0374e3.f887f.remove(str3);
            HashMap map3 = c0374e3.f888g;
            if (map3.containsKey(str3)) {
                StringBuilder sbM357m5 = AbstractC0174d.m357m("Dropping pending result for request ", str3, ": ");
                sbM357m5.append(map3.get(str3));
                Log.w("ActivityResultRegistry", sbM357m5.toString());
                map3.remove(str3);
            }
            Bundle bundle3 = c0374e3.f889h;
            if (bundle3.containsKey(str3)) {
                StringBuilder sbM357m6 = AbstractC0174d.m357m("Dropping pending result for request ", str3, ": ");
                sbM357m6.append(bundle3.getParcelable(str3));
                Log.w("ActivityResultRegistry", sbM357m6.toString());
                bundle3.remove(str3);
            }
            if (c0374e3.f885d.get(str3) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m889l() {
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null) {
                abstractComponentCallbacksC0434l.f1351D = true;
                abstractComponentCallbacksC0434l.f1384u.m889l();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m890m() {
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null) {
                abstractComponentCallbacksC0434l.f1384u.m890m();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m891n() {
        if (this.f1442m >= 1) {
            for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
                if (abstractComponentCallbacksC0434l != null) {
                    if (!abstractComponentCallbacksC0434l.f1389z ? abstractComponentCallbacksC0434l.f1384u.m891n() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m892o() {
        if (this.f1442m < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null && !abstractComponentCallbacksC0434l.f1389z) {
                abstractComponentCallbacksC0434l.f1384u.m892o();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m893p(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (abstractComponentCallbacksC0434l != null) {
            if (abstractComponentCallbacksC0434l.equals(this.f1432c.m117g(abstractComponentCallbacksC0434l.f1369f))) {
                abstractComponentCallbacksC0434l.f1382s.getClass();
                boolean zM859H = m859H(abstractComponentCallbacksC0434l);
                Boolean bool = abstractComponentCallbacksC0434l.f1374k;
                if (bool == null || bool.booleanValue() != zM859H) {
                    abstractComponentCallbacksC0434l.f1374k = Boolean.valueOf(zM859H);
                    C0448z c0448z = abstractComponentCallbacksC0434l.f1384u;
                    c0448z.m877V();
                    c0448z.m893p(c0448z.f1446q);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m894q() {
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null) {
                abstractComponentCallbacksC0434l.f1384u.m894q();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m895r() {
        if (this.f1442m < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : this.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null && m858G(abstractComponentCallbacksC0434l)) {
                if (!abstractComponentCallbacksC0434l.f1389z ? abstractComponentCallbacksC0434l.f1384u.m895r() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m896s(int i2) {
        try {
            this.f1431b = true;
            for (C0415F c0415f : ((HashMap) this.f1432c.f309c).values()) {
                if (c0415f != null) {
                    c0415f.f1256e = i2;
                }
            }
            m865I(i2, false);
            Iterator it = m882e().iterator();
            while (it.hasNext()) {
                ((C0431i) it.next()).m837e();
            }
            this.f1431b = false;
            m899v(true);
        } catch (Throwable th) {
            this.f1431b = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m897t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String str3 = str + "    ";
        C0064h c0064h = this.f1432c;
        c0064h.getClass();
        String str4 = str + "    ";
        HashMap map = (HashMap) c0064h.f309c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0415F c0415f : map.values()) {
                printWriter.print(str);
                if (c0415f != null) {
                    AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0415f.f1254c;
                    printWriter.println(abstractComponentCallbacksC0434l);
                    abstractComponentCallbacksC0434l.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0434l.f1386w));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0434l.f1387x));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0434l.f1388y);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1365b);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1369f);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0434l.f1381r);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1375l);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1376m);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1377n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0434l.f1378o);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1389z);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1348A);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1350C);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0434l.f1349B);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0434l.f1355H);
                    if (abstractComponentCallbacksC0434l.f1382s != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1382s);
                    }
                    if (abstractComponentCallbacksC0434l.f1383t != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1383t);
                    }
                    if (abstractComponentCallbacksC0434l.f1385v != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1385v);
                    }
                    if (abstractComponentCallbacksC0434l.f1370g != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1370g);
                    }
                    if (abstractComponentCallbacksC0434l.f1366c != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1366c);
                    }
                    if (abstractComponentCallbacksC0434l.f1367d != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1367d);
                    }
                    if (abstractComponentCallbacksC0434l.f1368e != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1368e);
                    }
                    Object objM117g = abstractComponentCallbacksC0434l.f1371h;
                    if (objM117g == null) {
                        C0448z c0448z = abstractComponentCallbacksC0434l.f1382s;
                        objM117g = (c0448z == null || (str2 = abstractComponentCallbacksC0434l.f1372i) == null) ? null : c0448z.f1432c.m117g(str2);
                    }
                    if (objM117g != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objM117g);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1373j);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    C0433k c0433k = abstractComponentCallbacksC0434l.f1356I;
                    printWriter.println(c0433k == null ? false : c0433k.f1336a);
                    C0433k c0433k2 = abstractComponentCallbacksC0434l.f1356I;
                    if ((c0433k2 == null ? 0 : c0433k2.f1337b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        C0433k c0433k3 = abstractComponentCallbacksC0434l.f1356I;
                        printWriter.println(c0433k3 == null ? 0 : c0433k3.f1337b);
                    }
                    C0433k c0433k4 = abstractComponentCallbacksC0434l.f1356I;
                    if ((c0433k4 == null ? 0 : c0433k4.f1338c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        C0433k c0433k5 = abstractComponentCallbacksC0434l.f1356I;
                        printWriter.println(c0433k5 == null ? 0 : c0433k5.f1338c);
                    }
                    C0433k c0433k6 = abstractComponentCallbacksC0434l.f1356I;
                    if ((c0433k6 == null ? 0 : c0433k6.f1339d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        C0433k c0433k7 = abstractComponentCallbacksC0434l.f1356I;
                        printWriter.println(c0433k7 == null ? 0 : c0433k7.f1339d);
                    }
                    C0433k c0433k8 = abstractComponentCallbacksC0434l.f1356I;
                    if ((c0433k8 == null ? 0 : c0433k8.f1340e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        C0433k c0433k9 = abstractComponentCallbacksC0434l.f1356I;
                        printWriter.println(c0433k9 == null ? 0 : c0433k9.f1340e);
                    }
                    if (abstractComponentCallbacksC0434l.f1352E != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1352E);
                    }
                    if (abstractComponentCallbacksC0434l.f1353F != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0434l.f1353F);
                    }
                    C0437o c0437o = abstractComponentCallbacksC0434l.f1383t;
                    if ((c0437o == null ? null : c0437o.f1395e) != null) {
                        C0754l c0754l = ((C0161a) new C0064h(abstractComponentCallbacksC0434l.getViewModelStore(), C0161a.f473e).m119i(C0161a.class)).f474d;
                        if (c0754l.f2560c > 0) {
                            printWriter.print(str4);
                            printWriter.println("Loaders:");
                            if (c0754l.f2560c > 0) {
                                if (c0754l.f2559b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str4);
                                printWriter.print("  #");
                                printWriter.print(c0754l.f2558a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + abstractComponentCallbacksC0434l.f1384u + ":");
                    abstractComponentCallbacksC0434l.f1384u.m897t(str4 + "  ", fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0064h.f308b;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = (AbstractComponentCallbacksC0434l) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0434l2.toString());
            }
        }
        ArrayList arrayList2 = this.f1434e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l3 = (AbstractComponentCallbacksC0434l) this.f1434e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0434l3.toString());
            }
        }
        ArrayList arrayList3 = this.f1433d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0423a c0423a = (C0423a) this.f1433d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0423a.toString());
                c0423a.m822d(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1438i.get());
        synchronized (this.f1430a) {
            try {
                int size4 = this.f1430a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (C0423a) this.f1430a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
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
        printWriter.println(this.f1443n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1444o);
        if (this.f1445p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1445p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1442m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1454y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1455z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1423A);
        if (this.f1453x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1453x);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            sb.append(abstractComponentCallbacksC0434l.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1445p)));
            sb.append("}");
        } else {
            C0437o c0437o = this.f1443n;
            if (c0437o != null) {
                sb.append(c0437o.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1443n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m898u(boolean z2) {
        if (this.f1431b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1443n == null) {
            if (!this.f1423A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1443n.f1396f.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1454y || this.f1455z)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1425C == null) {
            this.f1425C = new ArrayList();
            this.f1426D = new ArrayList();
        }
        this.f1431b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m899v(boolean z2) {
        boolean z3;
        m898u(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1425C;
            ArrayList arrayList2 = this.f1426D;
            synchronized (this.f1430a) {
                try {
                    if (this.f1430a.isEmpty()) {
                        z3 = false;
                    } else {
                        int size = this.f1430a.size();
                        int i2 = 0;
                        z3 = false;
                        while (i2 < size) {
                            ((C0423a) this.f1430a.get(i2)).m823e(arrayList, arrayList2);
                            i2++;
                            z3 = true;
                        }
                        this.f1430a.clear();
                        this.f1443n.f1396f.removeCallbacks(this.f1429G);
                    }
                } finally {
                }
            }
            if (!z3) {
                break;
            }
            this.f1431b = true;
            try {
                m869M(this.f1425C, this.f1426D);
                m881d();
                z4 = true;
            } catch (Throwable th) {
                m881d();
                throw th;
            }
        }
        m877V();
        if (this.f1424B) {
            this.f1424B = false;
            m876U();
        }
        ((HashMap) this.f1432c.f309c).values().removeAll(Collections.singleton(null));
        return z4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m900w(C0423a c0423a, boolean z2) {
        if (z2 && (this.f1443n == null || this.f1423A)) {
            return;
        }
        m898u(z2);
        c0423a.m823e(this.f1425C, this.f1426D);
        this.f1431b = true;
        try {
            m869M(this.f1425C, this.f1426D);
            m881d();
            m877V();
            if (this.f1424B) {
                this.f1424B = false;
                m876U();
            }
            ((HashMap) this.f1432c.f309c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m881d();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m901x(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4 = ((C0423a) arrayList.get(i2)).f1296o;
        ArrayList arrayList3 = this.f1427E;
        if (arrayList3 == null) {
            this.f1427E = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f1427E;
        C0064h c0064h = this.f1432c;
        arrayList4.addAll(c0064h.m127q());
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1446q;
        int i7 = i2;
        boolean z5 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i3) {
                boolean z6 = z4;
                this.f1427E.clear();
                if (!z6 && this.f1442m >= 1) {
                    for (int i9 = i2; i9 < i3; i9++) {
                        Iterator it = ((C0423a) arrayList.get(i9)).f1282a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = ((C0416G) it.next()).f1259b;
                            if (abstractComponentCallbacksC0434l2 != null && abstractComponentCallbacksC0434l2.f1382s != null) {
                                c0064h.m128r(m883f(abstractComponentCallbacksC0434l2));
                            }
                        }
                    }
                }
                for (int i10 = i2; i10 < i3; i10++) {
                    C0423a c0423a = (C0423a) arrayList.get(i10);
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        c0423a.m821c(-1);
                        ArrayList arrayList5 = c0423a.f1282a;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            C0416G c0416g = (C0416G) arrayList5.get(size);
                            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l3 = c0416g.f1259b;
                            if (abstractComponentCallbacksC0434l3 != null) {
                                if (abstractComponentCallbacksC0434l3.f1356I != null) {
                                    abstractComponentCallbacksC0434l3.m839d().f1336a = true;
                                }
                                int i11 = c0423a.f1287f;
                                int i12 = i11 != 4097 ? i11 != 4099 ? i11 != 8194 ? 0 : 4097 : 4099 : 8194;
                                if (abstractComponentCallbacksC0434l3.f1356I != null || i12 != 0) {
                                    abstractComponentCallbacksC0434l3.m839d();
                                    abstractComponentCallbacksC0434l3.f1356I.f1341f = i12;
                                }
                                abstractComponentCallbacksC0434l3.m839d();
                                abstractComponentCallbacksC0434l3.f1356I.getClass();
                            }
                            int i13 = c0416g.f1258a;
                            C0448z c0448z = c0423a.f1297p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0434l3.m850o(c0416g.f1260c, c0416g.f1261d, c0416g.f1262e, c0416g.f1263f);
                                    c0448z.m872P(abstractComponentCallbacksC0434l3, true);
                                    c0448z.m868L(abstractComponentCallbacksC0434l3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0416g.f1258a);
                                case 3:
                                    abstractComponentCallbacksC0434l3.m850o(c0416g.f1260c, c0416g.f1261d, c0416g.f1262e, c0416g.f1263f);
                                    c0448z.m878a(abstractComponentCallbacksC0434l3);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0434l3.m850o(c0416g.f1260c, c0416g.f1261d, c0416g.f1262e, c0416g.f1263f);
                                    c0448z.getClass();
                                    m860T(abstractComponentCallbacksC0434l3);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0434l3.m850o(c0416g.f1260c, c0416g.f1261d, c0416g.f1262e, c0416g.f1263f);
                                    c0448z.m872P(abstractComponentCallbacksC0434l3, true);
                                    c0448z.m864D(abstractComponentCallbacksC0434l3);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0434l3.m850o(c0416g.f1260c, c0416g.f1261d, c0416g.f1262e, c0416g.f1263f);
                                    c0448z.m880c(abstractComponentCallbacksC0434l3);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0434l3.m850o(c0416g.f1260c, c0416g.f1261d, c0416g.f1262e, c0416g.f1263f);
                                    c0448z.m872P(abstractComponentCallbacksC0434l3, true);
                                    c0448z.m884g(abstractComponentCallbacksC0434l3);
                                    break;
                                case 8:
                                    c0448z.m874R(null);
                                    break;
                                case 9:
                                    c0448z.m874R(abstractComponentCallbacksC0434l3);
                                    break;
                                case 10:
                                    c0448z.m873Q(abstractComponentCallbacksC0434l3, c0416g.f1264g);
                                    break;
                            }
                        }
                    } else {
                        c0423a.m821c(1);
                        ArrayList arrayList6 = c0423a.f1282a;
                        int size2 = arrayList6.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            C0416G c0416g2 = (C0416G) arrayList6.get(i14);
                            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l4 = c0416g2.f1259b;
                            if (abstractComponentCallbacksC0434l4 != null) {
                                if (abstractComponentCallbacksC0434l4.f1356I != null) {
                                    abstractComponentCallbacksC0434l4.m839d().f1336a = false;
                                }
                                int i15 = c0423a.f1287f;
                                if (abstractComponentCallbacksC0434l4.f1356I != null || i15 != 0) {
                                    abstractComponentCallbacksC0434l4.m839d();
                                    abstractComponentCallbacksC0434l4.f1356I.f1341f = i15;
                                }
                                abstractComponentCallbacksC0434l4.m839d();
                                abstractComponentCallbacksC0434l4.f1356I.getClass();
                            }
                            int i16 = c0416g2.f1258a;
                            C0448z c0448z2 = c0423a.f1297p;
                            switch (i16) {
                                case 1:
                                    abstractComponentCallbacksC0434l4.m850o(c0416g2.f1260c, c0416g2.f1261d, c0416g2.f1262e, c0416g2.f1263f);
                                    c0448z2.m872P(abstractComponentCallbacksC0434l4, false);
                                    c0448z2.m878a(abstractComponentCallbacksC0434l4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0416g2.f1258a);
                                case 3:
                                    abstractComponentCallbacksC0434l4.m850o(c0416g2.f1260c, c0416g2.f1261d, c0416g2.f1262e, c0416g2.f1263f);
                                    c0448z2.m868L(abstractComponentCallbacksC0434l4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0434l4.m850o(c0416g2.f1260c, c0416g2.f1261d, c0416g2.f1262e, c0416g2.f1263f);
                                    c0448z2.m864D(abstractComponentCallbacksC0434l4);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0434l4.m850o(c0416g2.f1260c, c0416g2.f1261d, c0416g2.f1262e, c0416g2.f1263f);
                                    c0448z2.m872P(abstractComponentCallbacksC0434l4, false);
                                    m860T(abstractComponentCallbacksC0434l4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0434l4.m850o(c0416g2.f1260c, c0416g2.f1261d, c0416g2.f1262e, c0416g2.f1263f);
                                    c0448z2.m884g(abstractComponentCallbacksC0434l4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0434l4.m850o(c0416g2.f1260c, c0416g2.f1261d, c0416g2.f1262e, c0416g2.f1263f);
                                    c0448z2.m872P(abstractComponentCallbacksC0434l4, false);
                                    c0448z2.m880c(abstractComponentCallbacksC0434l4);
                                    break;
                                case 8:
                                    c0448z2.m874R(abstractComponentCallbacksC0434l4);
                                    break;
                                case 9:
                                    c0448z2.m874R(null);
                                    break;
                                case 10:
                                    c0448z2.m873Q(abstractComponentCallbacksC0434l4, c0416g2.f1265h);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
                for (int i17 = i2; i17 < i3; i17++) {
                    C0423a c0423a2 = (C0423a) arrayList.get(i17);
                    if (zBooleanValue) {
                        for (int size3 = c0423a2.f1282a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l5 = ((C0416G) c0423a2.f1282a.get(size3)).f1259b;
                            if (abstractComponentCallbacksC0434l5 != null) {
                                m883f(abstractComponentCallbacksC0434l5).m799k();
                            }
                        }
                    } else {
                        Iterator it2 = c0423a2.f1282a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l6 = ((C0416G) it2.next()).f1259b;
                            if (abstractComponentCallbacksC0434l6 != null) {
                                m883f(abstractComponentCallbacksC0434l6).m799k();
                            }
                        }
                    }
                }
                m865I(this.f1442m, true);
                HashSet<C0431i> hashSet = new HashSet();
                for (int i18 = i2; i18 < i3; i18++) {
                    Iterator it3 = ((C0423a) arrayList.get(i18)).f1282a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l7 = ((C0416G) it3.next()).f1259b;
                        if (abstractComponentCallbacksC0434l7 != null && (viewGroup = abstractComponentCallbacksC0434l7.f1352E) != null) {
                            hashSet.add(C0431i.m832f(viewGroup, m863C()));
                        }
                    }
                }
                for (C0431i c0431i : hashSet) {
                    c0431i.f1333d = zBooleanValue;
                    synchronized (c0431i.f1331b) {
                        try {
                            c0431i.m838g();
                            c0431i.f1334e = false;
                            int size4 = c0431i.f1331b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    C0420K c0420k = (C0420K) c0431i.f1331b.get(size4);
                                    int iM815c = AbstractC0421L.m815c(c0420k.f1276c.f1353F);
                                    if (c0420k.f1274a != 2 || iM815c == 2) {
                                        size4--;
                                    } else {
                                        c0420k.f1276c.getClass();
                                        c0431i.f1334e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0431i.m835c();
                }
                for (int i19 = i2; i19 < i3; i19++) {
                    C0423a c0423a3 = (C0423a) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c0423a3.f1298q >= 0) {
                        c0423a3.f1298q = -1;
                    }
                    c0423a3.getClass();
                }
                return;
            }
            C0423a c0423a4 = (C0423a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                z2 = z4;
                i4 = i7;
                int i20 = 1;
                ArrayList arrayList7 = this.f1427E;
                ArrayList arrayList8 = c0423a4.f1282a;
                int size5 = arrayList8.size() - 1;
                while (size5 >= 0) {
                    C0416G c0416g3 = (C0416G) arrayList8.get(size5);
                    int i21 = c0416g3.f1258a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 6:
                                    arrayList7.add(c0416g3.f1259b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0434l = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0434l = c0416g3.f1259b;
                                    break;
                                case 10:
                                    c0416g3.f1265h = c0416g3.f1264g;
                                    break;
                            }
                        }
                        size5--;
                        i20 = 1;
                    }
                    arrayList7.remove(c0416g3.f1259b);
                    size5--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList9 = this.f1427E;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList10 = c0423a4.f1282a;
                    if (i22 < arrayList10.size()) {
                        C0416G c0416g4 = (C0416G) arrayList10.get(i22);
                        int i23 = c0416g4.f1258a;
                        if (i23 != i8) {
                            int i24 = i8;
                            z3 = z4;
                            if (i23 != 2) {
                                if (i23 == 3 || i23 == 6) {
                                    arrayList9.remove(c0416g4.f1259b);
                                    AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l8 = c0416g4.f1259b;
                                    if (abstractComponentCallbacksC0434l8 == abstractComponentCallbacksC0434l) {
                                        arrayList10.add(i22, new C0416G(9, abstractComponentCallbacksC0434l8));
                                        i22++;
                                        i6 = i7;
                                        i5 = i24;
                                        abstractComponentCallbacksC0434l = null;
                                    }
                                } else if (i23 == 7) {
                                    i5 = i24;
                                } else if (i23 == 8) {
                                    arrayList10.add(i22, new C0416G(9, abstractComponentCallbacksC0434l));
                                    i22++;
                                    abstractComponentCallbacksC0434l = c0416g4.f1259b;
                                }
                                i6 = i7;
                                i5 = i24;
                            } else {
                                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l9 = c0416g4.f1259b;
                                int i25 = abstractComponentCallbacksC0434l9.f1387x;
                                int size6 = arrayList9.size() - 1;
                                int i26 = 0;
                                while (size6 >= 0) {
                                    int i27 = size6;
                                    AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l10 = (AbstractComponentCallbacksC0434l) arrayList9.get(size6);
                                    int i28 = i7;
                                    if (abstractComponentCallbacksC0434l10.f1387x == i25) {
                                        if (abstractComponentCallbacksC0434l10 == abstractComponentCallbacksC0434l9) {
                                            i26 = i24;
                                        } else {
                                            if (abstractComponentCallbacksC0434l10 == abstractComponentCallbacksC0434l) {
                                                arrayList10.add(i22, new C0416G(9, abstractComponentCallbacksC0434l10));
                                                i22++;
                                                abstractComponentCallbacksC0434l = null;
                                            }
                                            C0416G c0416g5 = new C0416G(3, abstractComponentCallbacksC0434l10);
                                            c0416g5.f1260c = c0416g4.f1260c;
                                            c0416g5.f1262e = c0416g4.f1262e;
                                            c0416g5.f1261d = c0416g4.f1261d;
                                            c0416g5.f1263f = c0416g4.f1263f;
                                            arrayList10.add(i22, c0416g5);
                                            arrayList9.remove(abstractComponentCallbacksC0434l10);
                                            i22++;
                                            abstractComponentCallbacksC0434l = abstractComponentCallbacksC0434l;
                                        }
                                    }
                                    size6 = i27 - 1;
                                    i7 = i28;
                                }
                                i6 = i7;
                                if (i26 != 0) {
                                    arrayList10.remove(i22);
                                    i22--;
                                    i5 = i24;
                                } else {
                                    i5 = i24;
                                    c0416g4.f1258a = i5;
                                    arrayList9.add(abstractComponentCallbacksC0434l9);
                                }
                            }
                            i22 += i5;
                            i8 = i5;
                            z4 = z3;
                            i7 = i6;
                        } else {
                            z3 = z4;
                            i5 = i8;
                        }
                        i6 = i7;
                        arrayList9.add(c0416g4.f1259b);
                        i22 += i5;
                        i8 = i5;
                        z4 = z3;
                        i7 = i6;
                    } else {
                        z2 = z4;
                        i4 = i7;
                    }
                }
            }
            z5 = z5 || c0423a4.f1288g;
            i7 = i4 + 1;
            z4 = z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final AbstractComponentCallbacksC0434l m902y(int i2) {
        C0064h c0064h = this.f1432c;
        ArrayList arrayList = (ArrayList) c0064h.f308b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = (AbstractComponentCallbacksC0434l) arrayList.get(size);
            if (abstractComponentCallbacksC0434l != null && abstractComponentCallbacksC0434l.f1386w == i2) {
                return abstractComponentCallbacksC0434l;
            }
        }
        for (C0415F c0415f : ((HashMap) c0064h.f309c).values()) {
            if (c0415f != null) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = c0415f.f1254c;
                if (abstractComponentCallbacksC0434l2.f1386w == i2) {
                    return abstractComponentCallbacksC0434l2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final AbstractComponentCallbacksC0434l m903z(String str) {
        C0064h c0064h = this.f1432c;
        ArrayList arrayList = (ArrayList) c0064h.f308b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = (AbstractComponentCallbacksC0434l) arrayList.get(size);
            if (abstractComponentCallbacksC0434l != null && str.equals(abstractComponentCallbacksC0434l.f1388y)) {
                return abstractComponentCallbacksC0434l;
            }
        }
        for (C0415F c0415f : ((HashMap) c0064h.f309c).values()) {
            if (c0415f != null) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = c0415f.f1254c;
                if (str.equals(abstractComponentCallbacksC0434l2.f1388y)) {
                    return abstractComponentCallbacksC0434l2;
                }
            }
        }
        return null;
    }
}

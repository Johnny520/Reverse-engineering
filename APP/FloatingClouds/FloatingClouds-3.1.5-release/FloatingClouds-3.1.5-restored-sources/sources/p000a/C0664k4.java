package p000a;

import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0186K3;
import p000a.C0518ca;
import p000a.C0816s4;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.k4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0664k4 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0816s4 f2478b;

    public /* synthetic */ C0664k4(C0816s4 c0816s4, int i) {
        this.f2477a = i;
        this.f2478b = c0816s4;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        ListView listView;
        ListView listView2;
        switch (this.f2477a) {
            case 0:
                ClassLoader classLoader = this.f2478b.f3244k;
                if (classLoader != null) {
                    C0186K3.f638a.getClass();
                    ArrayList arrayListM505f = C0186K3.a.m505f();
                    ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                    Iterator it = arrayListM505f.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MaskItemBean) it.next()).getMaskId());
                    }
                    C0889w1.m2135V(classLoader, arrayList);
                }
                break;
            case 1:
                ClassLoader classLoader2 = this.f2478b.f3244k;
                if (classLoader2 != null) {
                    C0186K3.f638a.getClass();
                    ArrayList arrayListM505f2 = C0186K3.a.m505f();
                    ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(arrayListM505f2, 10));
                    Iterator it2 = arrayListM505f2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((MaskItemBean) it2.next()).getMaskId());
                    }
                    C0889w1.m2135V(classLoader2, arrayList2);
                }
                break;
            case 2:
                ClassLoader classLoader3 = this.f2478b.f3244k;
                if (classLoader3 != null) {
                    C0186K3.f638a.getClass();
                    ArrayList arrayListM505f3 = C0186K3.a.m505f();
                    ArrayList arrayList3 = new ArrayList(C0758p3.m1800g0(arrayListM505f3, 10));
                    Iterator it3 = arrayListM505f3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((MaskItemBean) it3.next()).getMaskId());
                    }
                    C0889w1.m2135V(classLoader3, arrayList3);
                }
                break;
            case 3:
                C0816s4 c0816s4 = this.f2478b;
                c0816s4.f3247n.clear();
                c0816s4.f3248o.clear();
                c0816s4.f3249p.clear();
                c0816s4.f3251r.clear();
                c0816s4.f3252s.clear();
                c0816s4.f3253t.set(0);
                c0816s4.f3256w.clear();
                C0915x8 c0915x8 = C0915x8.f3530a;
                if (C0915x8.f3531b == C0518ca.b.f1897a) {
                    C0816s4.a.C1338a.EnumC1339a enumC1339a = C0816s4.a.C1338a.EnumC1339a.f3261a;
                    c0816s4.m1915z(true, enumC1339a);
                    c0816s4.m1914y(true, enumC1339a, null);
                    WeakReference<ListView> weakReference = c0816s4.f3243j;
                    if (weakReference != null && (listView2 = weakReference.get()) != null && listView2.getWindowToken() != null) {
                        c0816s4.m1912t(listView2.getAdapter());
                    }
                } else {
                    C0726n9.m1677t("[HideMainUI] onMaskListChanged: skip re-hide (state=" + C0816s4.a.C1338a.f3260a + ")");
                    WeakReference<ListView> weakReference2 = c0816s4.f3243j;
                    if (weakReference2 != null && (listView = weakReference2.get()) != null && listView.getWindowToken() != null) {
                        c0816s4.m1912t(listView.getAdapter());
                    }
                }
                break;
            case 4:
                ClassLoader classLoader4 = this.f2478b.f3244k;
                if (classLoader4 != null) {
                    C0186K3.f638a.getClass();
                    ArrayList arrayListM505f4 = C0186K3.a.m505f();
                    ArrayList arrayList4 = new ArrayList(C0758p3.m1800g0(arrayListM505f4, 10));
                    Iterator it4 = arrayListM505f4.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((MaskItemBean) it4.next()).getMaskId());
                    }
                    C0889w1.m2135V(classLoader4, arrayList4);
                }
                break;
            case 5:
                C0816s4.a.C1338a.EnumC1339a enumC1339a2 = C0816s4.a.C1338a.EnumC1339a.f3262b;
                C0816s4 c0816s42 = this.f2478b;
                c0816s42.m1915z(false, enumC1339a2);
                ClassLoader classLoader5 = c0816s42.f3244k;
                if (classLoader5 != null) {
                    C0186K3.f638a.getClass();
                    ArrayList arrayListM505f5 = C0186K3.a.m505f();
                    ArrayList arrayList5 = new ArrayList(C0758p3.m1800g0(arrayListM505f5, 10));
                    Iterator it5 = arrayListM505f5.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(((MaskItemBean) it5.next()).getMaskId());
                    }
                    C0889w1.m2135V(classLoader5, arrayList5);
                }
                break;
            default:
                C0816s4.a.C1338a.EnumC1339a enumC1339a3 = C0816s4.a.C1338a.EnumC1339a.f3263c;
                C0816s4 c0816s43 = this.f2478b;
                c0816s43.m1915z(false, enumC1339a3);
                ClassLoader classLoader6 = c0816s43.f3244k;
                if (classLoader6 != null) {
                    C0186K3.f638a.getClass();
                    ArrayList arrayListM505f6 = C0186K3.a.m505f();
                    ArrayList arrayList6 = new ArrayList(C0758p3.m1800g0(arrayListM505f6, 10));
                    Iterator it6 = arrayListM505f6.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(((MaskItemBean) it6.next()).getMaskId());
                    }
                    C0889w1.m2135V(classLoader6, arrayList6);
                }
                break;
        }
        return C0413Wf.f1577a;
    }
}

package p000;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: nd */
/* JADX INFO: loaded from: classes.dex */
public final class C2276nd {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f8009a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8010b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f8011c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f8012d;

    /* JADX INFO: renamed from: e */
    public boolean f8013e;

    public C2276nd(ViewGroup viewGroup) {
        this.f8009a = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final void m4604a(int i, int i2, C0326Hi c0326Hi) {
        synchronized (this.f8010b) {
            C0609O6 c0609o6 = new C0609O6();
            C0557My c0557MyM4607d = m4607d(c0326Hi.f1110c);
            if (c0557MyM4607d != null) {
                c0557MyM4607d.m1099c(i, i2);
                return;
            }
            final C0557My c0557My = new C0557My(i, i2, c0326Hi, c0609o6);
            this.f8010b.add(c0557My);
            final int i3 = 0;
            c0557My.f1828d.add(new Runnable(this) { // from class: Ly

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2276nd f1675b;

                {
                    this.f1675b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            ArrayList arrayList = this.f1675b.f8010b;
                            C0557My c0557My2 = c0557My;
                            if (arrayList.contains(c0557My2)) {
                                AbstractC2374ph.m4804a(c0557My2.f1827c.f5296E, c0557My2.f1825a);
                            }
                            break;
                        default:
                            C2276nd c2276nd = this.f1675b;
                            ArrayList arrayList2 = c2276nd.f8010b;
                            C0557My c0557My3 = c0557My;
                            arrayList2.remove(c0557My3);
                            c2276nd.f8011c.remove(c0557My3);
                            break;
                    }
                }
            });
            final int i4 = 1;
            c0557My.f1828d.add(new Runnable(this) { // from class: Ly

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2276nd f1675b;

                {
                    this.f1675b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            ArrayList arrayList = this.f1675b.f8010b;
                            C0557My c0557My2 = c0557My;
                            if (arrayList.contains(c0557My2)) {
                                AbstractC2374ph.m4804a(c0557My2.f1827c.f5296E, c0557My2.f1825a);
                            }
                            break;
                        default:
                            C2276nd c2276nd = this.f1675b;
                            ArrayList arrayList2 = c2276nd.f8010b;
                            C0557My c0557My3 = c0557My;
                            arrayList2.remove(c0557My3);
                            c2276nd.f8011c.remove(c0557My3);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4605b(ArrayList arrayList, boolean z) {
        Object obj;
        int i;
        Object next;
        int i2;
        Animator animator;
        boolean z2;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            i = 2;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0557My c0557My = (C0557My) next;
            View view = c0557My.f1827c.f5296E;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    if (c0557My.f1825a != 2) {
                        break;
                    }
                } else {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(AbstractC2374ph.m4812i(visibility, "Unknown visibility "));
                    }
                }
            }
        }
        C0557My c0557My2 = (C0557My) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            C0557My c0557My3 = (C0557My) objPrevious;
            View view2 = c0557My3.f1827c.f5296E;
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(AbstractC2374ph.m4812i(visibility2, "Unknown visibility "));
                }
            }
            if (c0557My3.f1825a == 2) {
                obj = objPrevious;
                break;
            }
        }
        C0557My c0557My4 = (C0557My) obj;
        if (AbstractC2805zi.m5374G(2)) {
            Objects.toString(c0557My2);
            Objects.toString(c0557My4);
        }
        ArrayList<C2099jd> arrayList2 = new ArrayList();
        ArrayList<C2143kd> arrayList3 = new ArrayList();
        ArrayList<C0557My> arrayList4 = new ArrayList(arrayList);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = ((C0557My) AbstractC2453ra.m4902l0(arrayList)).f1827c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1415fi c1415fi = ((C0557My) it2.next()).f1827c.f5299H;
            C1415fi c1415fi2 = abstractComponentCallbacksC1503hi.f5299H;
            c1415fi.f4998b = c1415fi2.f4998b;
            c1415fi.f4999c = c1415fi2.f4999c;
            c1415fi.f5000d = c1415fi2.f5000d;
            c1415fi.f5001e = c1415fi2.f5001e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0557My c0557My5 = (C0557My) it3.next();
            C0609O6 c0609o6 = new C0609O6();
            c0557My5.m1100d();
            LinkedHashSet linkedHashSet = c0557My5.f1829e;
            linkedHashSet.add(c0609o6);
            arrayList2.add(new C2099jd(c0557My5, c0609o6, z));
            C0609O6 c0609o62 = new C0609O6();
            c0557My5.m1100d();
            linkedHashSet.add(c0609o62);
            boolean z3 = !z ? c0557My5 != c0557My4 : c0557My5 != c0557My2;
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = c0557My5.f1827c;
            C2143kd c2143kd = new C2143kd(c0557My5, c0609o62);
            if (c0557My5.f1825a == 2) {
                if (z) {
                    C1415fi c1415fi3 = abstractComponentCallbacksC1503hi2.f5299H;
                } else {
                    abstractComponentCallbacksC1503hi2.getClass();
                }
            } else if (z) {
                C1415fi c1415fi4 = abstractComponentCallbacksC1503hi2.f5299H;
            } else {
                abstractComponentCallbacksC1503hi2.getClass();
            }
            if (c0557My5.f1825a == 2) {
                if (z) {
                    C1415fi c1415fi5 = abstractComponentCallbacksC1503hi2.f5299H;
                } else {
                    C1415fi c1415fi6 = abstractComponentCallbacksC1503hi2.f5299H;
                }
            }
            if (z3) {
                if (z) {
                    C1415fi c1415fi7 = abstractComponentCallbacksC1503hi2.f5299H;
                } else {
                    abstractComponentCallbacksC1503hi2.getClass();
                }
            }
            arrayList3.add(c2143kd);
            c0557My5.f1828d.add(new RunnableC2260n3(arrayList4, c0557My5, this, 7));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((C2143kd) obj2).m84j()) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ((C2143kd) it4.next()).getClass();
        }
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            ((C2143kd) it5.next()).getClass();
        }
        for (C2143kd c2143kd2 : arrayList3) {
            linkedHashMap.put((C0557My) c2143kd2.f96a, Boolean.FALSE);
            c2143kd2.m78d();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f8009a;
        Context context = viewGroup.getContext();
        ArrayList<C2099jd> arrayList7 = new ArrayList();
        boolean z4 = false;
        for (C2099jd c2099jd : arrayList2) {
            if (c2099jd.m84j()) {
                c2099jd.m78d();
            } else {
                C0649P3 c0649p3M4293o = c2099jd.m4293o(context);
                if (c0649p3M4293o == null) {
                    c2099jd.m78d();
                } else {
                    Animator animator2 = (Animator) c0649p3M4293o.f2090c;
                    if (animator2 == null) {
                        arrayList7.add(c2099jd);
                    } else {
                        C0557My c0557My6 = (C0557My) c2099jd.f96a;
                        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi3 = c0557My6.f1827c;
                        i2 = i;
                        if (AbstractC0585Nj.m1134a(linkedHashMap.get(c0557My6), Boolean.TRUE)) {
                            if (AbstractC2805zi.m5374G(i2)) {
                                Objects.toString(abstractComponentCallbacksC1503hi3);
                            }
                            c2099jd.m78d();
                            i = i2;
                        } else {
                            if (c0557My6.f1825a == 3) {
                                animator = animator2;
                                z2 = true;
                            } else {
                                animator = animator2;
                                z2 = false;
                            }
                            if (z2) {
                                arrayList4.remove(c0557My6);
                            }
                            View view3 = abstractComponentCallbacksC1503hi3.f5296E;
                            viewGroup.startViewTransition(view3);
                            ArrayList arrayList8 = arrayList7;
                            Animator animator3 = animator;
                            animator3.addListener(new C2190ld(this, view3, z2, c0557My6, c2099jd));
                            animator3.setTarget(view3);
                            animator3.start();
                            if (AbstractC2805zi.m5374G(i2)) {
                                c0557My6.toString();
                            }
                            ((C0609O6) c2099jd.f97b).m1188a(new C0698Q9(1, animator3, c0557My6));
                            arrayList7 = arrayList8;
                            i = i2;
                            z4 = true;
                        }
                    }
                }
            }
            i2 = i;
            i = i2;
        }
        int i3 = i;
        for (C2099jd c2099jd2 : arrayList7) {
            C0557My c0557My7 = (C0557My) c2099jd2.f96a;
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi4 = c0557My7.f1827c;
            if (zContainsValue) {
                if (AbstractC2805zi.m5374G(i3)) {
                    Objects.toString(abstractComponentCallbacksC1503hi4);
                }
                c2099jd2.m78d();
            } else if (z4) {
                if (AbstractC2805zi.m5374G(i3)) {
                    Objects.toString(abstractComponentCallbacksC1503hi4);
                }
                c2099jd2.m78d();
            } else {
                View view4 = abstractComponentCallbacksC1503hi4.f5296E;
                C0649P3 c0649p3M4293o2 = c2099jd2.m4293o(context);
                if (c0649p3M4293o2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = (Animation) c0649p3M4293o2.f2089b;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (c0557My7.f1825a != 1) {
                    view4.startAnimation(animation);
                    c2099jd2.m78d();
                } else {
                    viewGroup.startViewTransition(view4);
                    RunnableC2195li runnableC2195li = new RunnableC2195li(animation, viewGroup, view4);
                    runnableC2195li.setAnimationListener(new AnimationAnimationListenerC2233md(c0557My7, this, view4, c2099jd2));
                    view4.startAnimation(runnableC2195li);
                    if (AbstractC2805zi.m5374G(i3)) {
                        c0557My7.toString();
                    }
                }
                ((C0609O6) c2099jd2.f97b).m1188a(new C1542id(view4, this, c2099jd2, c0557My7));
            }
        }
        for (C0557My c0557My8 : arrayList4) {
            AbstractC2374ph.m4804a(c0557My8.f1827c.f5296E, c0557My8.f1825a);
        }
        arrayList4.clear();
        if (AbstractC2805zi.m5374G(i3)) {
            Objects.toString(c0557My2);
            Objects.toString(c0557My4);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4606c() {
        if (this.f8013e) {
            return;
        }
        ViewGroup viewGroup = this.f8009a;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        if (!viewGroup.isAttachedToWindow()) {
            m4608e();
            this.f8012d = false;
            return;
        }
        synchronized (this.f8010b) {
            try {
                if (!this.f8010b.isEmpty()) {
                    ArrayList<C0557My> arrayList = new ArrayList(this.f8011c);
                    this.f8011c.clear();
                    for (C0557My c0557My : arrayList) {
                        if (AbstractC2805zi.m5374G(2)) {
                            Objects.toString(c0557My);
                        }
                        c0557My.m1097a();
                        if (!c0557My.f1831g) {
                            this.f8011c.add(c0557My);
                        }
                    }
                    m4609f();
                    ArrayList arrayList2 = new ArrayList(this.f8010b);
                    this.f8010b.clear();
                    this.f8011c.addAll(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((C0557My) it.next()).m1100d();
                    }
                    m4605b(arrayList2, this.f8012d);
                    this.f8012d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C0557My m4607d(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        Object next;
        Iterator it = this.f8010b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0557My c0557My = (C0557My) next;
            if (AbstractC0585Nj.m1134a(c0557My.f1827c, abstractComponentCallbacksC1503hi) && !c0557My.f1830f) {
                break;
            }
        }
        return (C0557My) next;
    }

    /* JADX INFO: renamed from: e */
    public final void m4608e() {
        ViewGroup viewGroup = this.f8009a;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f8010b) {
            try {
                m4609f();
                Iterator it = this.f8010b.iterator();
                while (it.hasNext()) {
                    ((C0557My) it.next()).m1100d();
                }
                for (C0557My c0557My : new ArrayList(this.f8011c)) {
                    if (AbstractC2805zi.m5374G(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f8009a);
                        }
                        Objects.toString(c0557My);
                    }
                    c0557My.m1097a();
                }
                for (C0557My c0557My2 : new ArrayList(this.f8010b)) {
                    if (AbstractC2805zi.m5374G(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f8009a);
                        }
                        Objects.toString(c0557My2);
                    }
                    c0557My2.m1097a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4609f() {
        for (C0557My c0557My : this.f8010b) {
            int i = 2;
            if (c0557My.f1826b == 2) {
                int visibility = c0557My.f1827c.m2879z().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC2374ph.m4812i(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                c0557My.m1099c(i, 1);
            }
        }
    }
}

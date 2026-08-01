package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p004C.C0064h;
import p004C.C0066j;
import p012G.C0140d;
import p014H.C0142a;
import p091u.C1013c;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0431i {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f1330a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1331b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f1332c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f1333d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1334e = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0431i(ViewGroup viewGroup) {
        this.f1330a = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C0431i m832f(ViewGroup viewGroup, C0140d c0140d) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0431i) {
            return (C0431i) tag;
        }
        c0140d.getClass();
        C0431i c0431i = new C0431i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0431i);
        return c0431i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m833a(int i2, int i3, C0415F c0415f) {
        synchronized (this.f1331b) {
            try {
                C1013c c1013c = new C1013c();
                C0420K c0420kM836d = m836d(c0415f.f1254c);
                if (c0420kM836d != null) {
                    c0420kM836d.m811c(i2, i3);
                    return;
                }
                C0420K c0420k = new C0420K(i2, i3, c0415f, c1013c);
                this.f1331b.add(c0420k);
                c0420k.f1277d.add(new RunnableC0419J(this, c0420k, 0));
                c0420k.f1277d.add(new RunnableC0419J(this, c0420k, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m834b(ArrayList arrayList, boolean z2) {
        int i2;
        int i3;
        Iterator it = arrayList.iterator();
        C0420K c0420k = null;
        C0420K c0420k2 = null;
        while (true) {
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            C0420K c0420k3 = (C0420K) it.next();
            int iM815c = AbstractC0421L.m815c(c0420k3.f1276c.f1353F);
            int iM816d = AbstractC0421L.m816d(c0420k3.f1274a);
            if (iM816d != 0) {
                if (iM816d != 1) {
                    if (iM816d == 2 || iM816d == 3) {
                    }
                } else if (iM815c != 2) {
                    c0420k2 = c0420k3;
                }
            }
            if (iM815c == 2 && c0420k == null) {
                c0420k = c0420k3;
            }
        }
        ArrayList<C0428f> arrayList2 = new ArrayList();
        ArrayList<C0430h> arrayList3 = new ArrayList();
        ArrayList<C0420K> arrayList4 = new ArrayList(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it2.hasNext()) {
                break;
            }
            C0420K c0420k4 = (C0420K) it2.next();
            C1013c c1013c = new C1013c();
            c0420k4.m812d();
            HashSet hashSet = c0420k4.f1278e;
            hashSet.add(c1013c);
            C0428f c0428f = new C0428f(c0420k4, c1013c);
            c0428f.f1326d = false;
            c0428f.f1325c = z2;
            arrayList2.add(c0428f);
            C1013c c1013c2 = new C1013c();
            c0420k4.m812d();
            hashSet.add(c1013c2);
            if (!z2 ? c0420k4 == c0420k2 : c0420k4 == c0420k) {
                z3 = true;
            }
            C0430h c0430h = new C0430h(c0420k4, c1013c2);
            int i4 = c0420k4.f1274a;
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0420k4.f1276c;
            if (i4 == 2) {
                if (z2) {
                    abstractComponentCallbacksC0434l.getClass();
                } else {
                    abstractComponentCallbacksC0434l.getClass();
                }
                if (z2) {
                    abstractComponentCallbacksC0434l.getClass();
                } else {
                    abstractComponentCallbacksC0434l.getClass();
                }
            } else if (z2) {
                abstractComponentCallbacksC0434l.getClass();
            } else {
                abstractComponentCallbacksC0434l.getClass();
            }
            if (z3) {
                if (z2) {
                    abstractComponentCallbacksC0434l.getClass();
                } else {
                    abstractComponentCallbacksC0434l.getClass();
                }
            }
            arrayList3.add(c0430h);
            c0420k4.f1277d.add(new RunnableC0425c(this, arrayList4, c0420k4));
        }
        HashMap map = new HashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C0420K c0420k5 = (C0420K) ((C0430h) it3.next()).f1328a;
            AbstractC0421L.m815c(c0420k5.f1276c.f1353F);
            int i5 = c0420k5.f1274a;
        }
        for (C0430h c0430h2 : arrayList3) {
            map.put((C0420K) c0430h2.f1328a, Boolean.FALSE);
            c0430h2.m826d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1330a;
        Context context = viewGroup.getContext();
        ArrayList<C0428f> arrayList5 = new ArrayList();
        boolean z4 = false;
        for (C0428f c0428f2 : arrayList2) {
            C0420K c0420k6 = (C0420K) c0428f2.f1328a;
            int iM815c2 = AbstractC0421L.m815c(c0420k6.f1276c.f1353F);
            int i6 = c0420k6.f1274a;
            if (iM815c2 == i6 || !(iM815c2 == i2 || i6 == i2)) {
                i3 = i2;
                c0428f2.m826d();
            } else {
                C0142a c0142aM824j = c0428f2.m824j(context);
                if (c0142aM824j == null) {
                    c0428f2.m826d();
                } else {
                    Animator animator = (Animator) c0142aM824j.f444c;
                    if (animator == null) {
                        arrayList5.add(c0428f2);
                    } else {
                        C0420K c0420k7 = (C0420K) c0428f2.f1328a;
                        i3 = i2;
                        boolean zEquals = Boolean.TRUE.equals(map.get(c0420k7));
                        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = c0420k7.f1276c;
                        if (zEquals) {
                            if (C0448z.m856E(i3)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0434l2 + " as this Fragment was involved in a Transition.");
                            }
                            c0428f2.m826d();
                        } else {
                            boolean z5 = c0420k7.f1274a == 3;
                            if (z5) {
                                arrayList4.remove(c0420k7);
                            }
                            View view = abstractComponentCallbacksC0434l2.f1353F;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0426d(viewGroup, view, z5, c0420k7, c0428f2));
                            animator.setTarget(view);
                            animator.start();
                            ((C1013c) c0428f2.f1329b).m2214a(new C0066j(10, animator));
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
                i3 = i2;
            }
            i2 = i3;
        }
        int i7 = i2;
        for (C0428f c0428f3 : arrayList5) {
            C0420K c0420k8 = (C0420K) c0428f3.f1328a;
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l3 = c0420k8.f1276c;
            if (zContainsValue) {
                if (C0448z.m856E(i7)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0434l3 + " as Animations cannot run alongside Transitions.");
                }
                c0428f3.m826d();
            } else if (z4) {
                if (C0448z.m856E(i7)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0434l3 + " as Animations cannot run alongside Animators.");
                }
                c0428f3.m826d();
            } else {
                View view2 = abstractComponentCallbacksC0434l3.f1353F;
                C0142a c0142aM824j2 = c0428f3.m824j(context);
                c0142aM824j2.getClass();
                Animation animation = (Animation) c0142aM824j2.f443b;
                animation.getClass();
                if (c0420k8.f1274a != 1) {
                    view2.startAnimation(animation);
                    c0428f3.m826d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0438p runnableC0438p = new RunnableC0438p(animation, viewGroup, view2);
                    runnableC0438p.setAnimationListener(new AnimationAnimationListenerC0427e(viewGroup, view2, c0428f3));
                    view2.startAnimation(runnableC0438p);
                }
                ((C1013c) c0428f3.f1329b).m2214a(new C0064h(view2, viewGroup, c0428f3));
            }
        }
        for (C0420K c0420k9 : arrayList4) {
            AbstractC0421L.m813a(c0420k9.f1276c.f1353F, c0420k9.f1274a);
        }
        arrayList4.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m835c() {
        if (this.f1334e) {
            return;
        }
        ViewGroup viewGroup = this.f1330a;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        if (!viewGroup.isAttachedToWindow()) {
            m837e();
            this.f1333d = false;
            return;
        }
        synchronized (this.f1331b) {
            try {
                if (!this.f1331b.isEmpty()) {
                    ArrayList<C0420K> arrayList = new ArrayList(this.f1332c);
                    this.f1332c.clear();
                    for (C0420K c0420k : arrayList) {
                        if (C0448z.m856E(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0420k);
                        }
                        c0420k.m809a();
                        if (!c0420k.f1280g) {
                            this.f1332c.add(c0420k);
                        }
                    }
                    m838g();
                    ArrayList arrayList2 = new ArrayList(this.f1331b);
                    this.f1331b.clear();
                    this.f1332c.addAll(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((C0420K) it.next()).m812d();
                    }
                    m834b(arrayList2, this.f1333d);
                    this.f1333d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0420K m836d(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        for (C0420K c0420k : this.f1331b) {
            if (c0420k.f1276c.equals(abstractComponentCallbacksC0434l) && !c0420k.f1279f) {
                return c0420k;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m837e() {
        ViewGroup viewGroup = this.f1330a;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1331b) {
            try {
                m838g();
                Iterator it = this.f1331b.iterator();
                while (it.hasNext()) {
                    ((C0420K) it.next()).m812d();
                }
                for (C0420K c0420k : new ArrayList(this.f1332c)) {
                    if (C0448z.m856E(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zIsAttachedToWindow ? "" : "Container " + this.f1330a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(c0420k);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c0420k.m809a();
                }
                for (C0420K c0420k2 : new ArrayList(this.f1331b)) {
                    if (C0448z.m856E(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zIsAttachedToWindow ? "" : "Container " + this.f1330a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(c0420k2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    c0420k2.m809a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m838g() {
        for (C0420K c0420k : this.f1331b) {
            if (c0420k.f1275b == 2) {
                c0420k.m811c(AbstractC0421L.m814b(c0420k.f1276c.m849n().getVisibility()), 1);
            }
        }
    }
}

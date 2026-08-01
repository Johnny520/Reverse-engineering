package p000;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0035a;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: dg */
/* JADX INFO: loaded from: classes.dex */
public final class C0150dg {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f1390a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1391b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f1392c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f1393d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1394e = false;

    public C0150dg(ViewGroup viewGroup) {
        this.f1390a = viewGroup;
    }

    /* JADX INFO: renamed from: f */
    public static C0150dg m915f(ViewGroup viewGroup, C0893xh c0893xh) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0150dg) {
            return (C0150dg) tag;
        }
        c0893xh.getClass();
        C0150dg c0150dg = new C0150dg(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0150dg);
        return c0150dg;
    }

    /* JADX INFO: renamed from: a */
    public final void m916a(int i, int i2, C0035a c0035a) {
        synchronized (this.f1391b) {
            try {
                C0772u8 c0772u8 = new C0772u8();
                n40 n40VarM919d = m919d(c0035a.f469c);
                if (n40VarM919d != null) {
                    n40VarM919d.m1914c(i, i2);
                    return;
                }
                n40 n40Var = new n40(i, i2, c0035a, c0772u8);
                this.f1391b.add(n40Var);
                n40Var.f3217d.add(new m40(this, n40Var, 0));
                n40Var.f3217d.add(new m40(this, n40Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m917b(ArrayList arrayList, boolean z) {
        int i;
        boolean z2;
        int i2;
        ViewGroup viewGroup;
        int size = arrayList.size();
        boolean z3 = false;
        n40 n40Var = null;
        int i3 = 0;
        n40 n40Var2 = null;
        while (true) {
            i = 2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            n40 n40Var3 = (n40) obj;
            int iM1140c = g40.m1140c(n40Var3.f3216c.f3474E);
            int iM1158u = g40.m1158u(n40Var3.f3214a);
            if (iM1158u != 0) {
                if (iM1158u != 1) {
                    if (iM1158u == 2 || iM1158u == 3) {
                    }
                } else if (iM1140c != 2) {
                    n40Var2 = n40Var3;
                }
            }
            if (iM1140c == 2 && n40Var == null) {
                n40Var = n40Var3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            n40 n40Var4 = (n40) obj2;
            C0772u8 c0772u8 = new C0772u8();
            n40Var4.m1915d();
            HashSet hashSet = n40Var4.f3218e;
            hashSet.add(c0772u8);
            C0067bg c0067bg = new C0067bg(n40Var4, c0772u8);
            c0067bg.f728d = z3;
            c0067bg.f727c = z;
            arrayList2.add(c0067bg);
            C0772u8 c0772u82 = new C0772u8();
            n40Var4.m1915d();
            hashSet.add(c0772u82);
            boolean z4 = (!z ? n40Var4 == n40Var2 : n40Var4 == n40Var) ? z3 : true;
            C0103cg c0103cg = new C0103cg(n40Var4, c0772u82);
            int i5 = n40Var4.f3214a;
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = n40Var4.f3216c;
            if (i5 == 2) {
                if (z) {
                    abstractComponentCallbacksC0563ol.getClass();
                } else {
                    abstractComponentCallbacksC0563ol.getClass();
                }
                if (z) {
                    abstractComponentCallbacksC0563ol.getClass();
                } else {
                    abstractComponentCallbacksC0563ol.getClass();
                }
            } else if (z) {
                abstractComponentCallbacksC0563ol.getClass();
            } else {
                abstractComponentCallbacksC0563ol.getClass();
            }
            if (z4) {
                if (z) {
                    abstractComponentCallbacksC0563ol.getClass();
                } else {
                    abstractComponentCallbacksC0563ol.getClass();
                }
            }
            arrayList3.add(c0103cg);
            n40Var4.f3217d.add(new RunnableC0282h1(this, arrayList4, n40Var4));
            z3 = false;
        }
        HashMap map = new HashMap();
        int size3 = arrayList3.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList3.get(i6);
            i6++;
            n40 n40Var5 = (n40) ((C0103cg) obj3).f3364a;
            g40.m1140c(n40Var5.f3216c.f3474E);
            int i7 = n40Var5.f3214a;
        }
        int size4 = arrayList3.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj4 = arrayList3.get(i8);
            i8++;
            C0103cg c0103cg2 = (C0103cg) obj4;
            map.put((n40) c0103cg2.f3364a, Boolean.FALSE);
            c0103cg2.m1967d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f1390a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList2.size();
        boolean z5 = false;
        int i9 = 0;
        while (i9 < size5) {
            Object obj5 = arrayList2.get(i9);
            i9++;
            C0067bg c0067bg2 = (C0067bg) obj5;
            n40 n40Var6 = (n40) c0067bg2.f3364a;
            int iM1140c2 = g40.m1140c(n40Var6.f3216c.f3474E);
            int i10 = n40Var6.f3214a;
            if (iM1140c2 == i10 || !(iM1140c2 == i || i10 == i)) {
                z2 = zContainsValue;
                i2 = i;
                viewGroup = viewGroup2;
                c0067bg2.m1967d();
                zContainsValue = z2;
                viewGroup2 = viewGroup;
                i = i2;
            } else {
                C0138d4 c0138d4M521j = c0067bg2.m521j(context);
                if (c0138d4M521j == null) {
                    c0067bg2.m1967d();
                } else {
                    Animator animator = (Animator) c0138d4M521j.f1298c;
                    if (animator == null) {
                        arrayList5.add(c0067bg2);
                    } else {
                        n40 n40Var7 = (n40) c0067bg2.f3364a;
                        i2 = i;
                        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = n40Var7.f3216c;
                        z2 = zContainsValue;
                        if (Boolean.TRUE.equals(map.get(n40Var7))) {
                            if (C0023am.m55A(i2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0563ol2 + " as this Fragment was involved in a Transition.");
                            }
                            c0067bg2.m1967d();
                            viewGroup = viewGroup2;
                            zContainsValue = z2;
                            viewGroup2 = viewGroup;
                            i = i2;
                        } else {
                            boolean z6 = n40Var7.f3214a == 3;
                            if (z6) {
                                arrayList4.remove(n40Var7);
                            }
                            View view = abstractComponentCallbacksC0563ol2.f3474E;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new C0965zf(viewGroup3, view, z6, n40Var7, c0067bg2));
                            animator.setTarget(view);
                            animator.start();
                            ((C0772u8) c0067bg2.f3365b).m2445a(new C0431l0(10, animator));
                            zContainsValue = z2;
                            viewGroup2 = viewGroup3;
                            i = i2;
                            z5 = true;
                        }
                    }
                }
                z2 = zContainsValue;
                i2 = i;
                viewGroup = viewGroup2;
                zContainsValue = z2;
                viewGroup2 = viewGroup;
                i = i2;
            }
        }
        boolean z7 = zContainsValue;
        int i11 = i;
        ViewGroup viewGroup4 = viewGroup2;
        int size6 = arrayList5.size();
        int i12 = 0;
        while (i12 < size6) {
            Object obj6 = arrayList5.get(i12);
            i12++;
            C0067bg c0067bg3 = (C0067bg) obj6;
            n40 n40Var8 = (n40) c0067bg3.f3364a;
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol3 = n40Var8.f3216c;
            if (z7) {
                if (C0023am.m55A(i11)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0563ol3 + " as Animations cannot run alongside Transitions.");
                }
                c0067bg3.m1967d();
            } else if (z5) {
                if (C0023am.m55A(i11)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0563ol3 + " as Animations cannot run alongside Animators.");
                }
                c0067bg3.m1967d();
            } else {
                View view2 = abstractComponentCallbacksC0563ol3.f3474E;
                C0138d4 c0138d4M521j2 = c0067bg3.m521j(context);
                c0138d4M521j2.getClass();
                Animation animation = (Animation) c0138d4M521j2.f1297b;
                animation.getClass();
                if (n40Var8.f3214a != 1) {
                    view2.startAnimation(animation);
                    c0067bg3.m1967d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    RunnableC0637ql runnableC0637ql = new RunnableC0637ql(animation, viewGroup4, view2);
                    runnableC0637ql.setAnimationListener(new AnimationAnimationListenerC0017ag(c0067bg3, view2, viewGroup4));
                    view2.startAnimation(runnableC0637ql);
                }
                ((C0772u8) c0067bg3.f3365b).m2445a(new C0658r5(c0067bg3, view2, viewGroup4));
            }
        }
        int size7 = arrayList4.size();
        int i13 = 0;
        while (i13 < size7) {
            Object obj7 = arrayList4.get(i13);
            i13++;
            n40 n40Var9 = (n40) obj7;
            g40.m1138a(n40Var9.f3216c.f3474E, n40Var9.f3214a);
        }
        arrayList4.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m918c() {
        if (this.f1394e) {
            return;
        }
        ViewGroup viewGroup = this.f1390a;
        WeakHashMap weakHashMap = oa0.f3426a;
        if (!aa0.m39b(viewGroup)) {
            m920e();
            this.f1393d = false;
            return;
        }
        synchronized (this.f1391b) {
            try {
                if (!this.f1391b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1392c);
                    this.f1392c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        n40 n40Var = (n40) obj;
                        if (C0023am.m55A(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + n40Var);
                        }
                        n40Var.m1912a();
                        if (!n40Var.f3220g) {
                            this.f1392c.add(n40Var);
                        }
                    }
                    m921g();
                    ArrayList arrayList2 = new ArrayList(this.f1391b);
                    this.f1391b.clear();
                    this.f1392c.addAll(arrayList2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((n40) obj2).m1915d();
                    }
                    m917b(arrayList2, this.f1393d);
                    this.f1393d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final n40 m919d(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        ArrayList arrayList = this.f1391b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n40 n40Var = (n40) obj;
            if (n40Var.f3216c.equals(abstractComponentCallbacksC0563ol) && !n40Var.f3219f) {
                return n40Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m920e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1390a;
        WeakHashMap weakHashMap = oa0.f3426a;
        boolean zM39b = aa0.m39b(viewGroup);
        synchronized (this.f1391b) {
            try {
                m921g();
                ArrayList arrayList = this.f1391b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((n40) obj).m1915d();
                }
                ArrayList arrayList2 = new ArrayList(this.f1392c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    n40 n40Var = (n40) obj2;
                    if (C0023am.m55A(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zM39b) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1390a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(n40Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    n40Var.m1912a();
                }
                ArrayList arrayList3 = new ArrayList(this.f1391b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    n40 n40Var2 = (n40) obj3;
                    if (C0023am.m55A(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zM39b) {
                            str = "";
                        } else {
                            str = "Container " + this.f1390a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(n40Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    n40Var2.m1912a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m921g() {
        ArrayList arrayList = this.f1391b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n40 n40Var = (n40) obj;
            if (n40Var.f3215b == 2) {
                n40Var.m1914c(g40.m1139b(n40Var.f3216c.m2031A().getVisibility()), 1);
            }
        }
    }
}

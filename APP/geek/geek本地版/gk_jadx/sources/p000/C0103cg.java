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

/* JADX INFO: renamed from: cg */
/* JADX INFO: loaded from: classes.dex */
public final class C0103cg {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f957a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f958b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f959c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f960d = false;

    /* JADX INFO: renamed from: e */
    public boolean f961e = false;

    public C0103cg(ViewGroup viewGroup) {
        this.f957a = viewGroup;
    }

    /* JADX INFO: renamed from: f */
    public static C0103cg m674f(ViewGroup viewGroup, C0819vh c0819vh) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0103cg) {
            return (C0103cg) tag;
        }
        c0819vh.getClass();
        C0103cg c0103cg = new C0103cg(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0103cg);
        return c0103cg;
    }

    /* JADX INFO: renamed from: a */
    public final void m675a(int i, int i2, C0035a c0035a) {
        synchronized (this.f958b) {
            try {
                C0402k8 c0402k8 = new C0402k8();
                g40 g40VarM678d = m678d(c0035a.f506c);
                if (g40VarM678d != null) {
                    g40VarM678d.m1261c(i, i2);
                    return;
                }
                g40 g40Var = new g40(i, i2, c0035a, c0402k8);
                this.f958b.add(g40Var);
                g40Var.f2017d.add(new f40(this, g40Var, 0));
                g40Var.f2017d.add(new f40(this, g40Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m676b(ArrayList arrayList, boolean z) {
        int i;
        boolean z2;
        int i2;
        ViewGroup viewGroup;
        int size = arrayList.size();
        boolean z3 = false;
        g40 g40Var = null;
        int i3 = 0;
        g40 g40Var2 = null;
        while (true) {
            i = 2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            g40 g40Var3 = (g40) obj;
            int iM2758c = z30.m2758c(g40Var3.f2016c.f3229E);
            int iM2775t = z30.m2775t(g40Var3.f2014a);
            if (iM2775t != 0) {
                if (iM2775t != 1) {
                    if (iM2775t == 2 || iM2775t == 3) {
                    }
                } else if (iM2758c != 2) {
                    g40Var2 = g40Var3;
                }
            }
            if (iM2758c == 2 && g40Var == null) {
                g40Var = g40Var3;
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
            g40 g40Var4 = (g40) obj2;
            C0402k8 c0402k8 = new C0402k8();
            g40Var4.m1262d();
            HashSet hashSet = g40Var4.f2018e;
            hashSet.add(c0402k8);
            C0017ag c0017ag = new C0017ag(g40Var4, c0402k8);
            c0017ag.f139d = z3;
            c0017ag.f138c = z;
            arrayList2.add(c0017ag);
            C0402k8 c0402k82 = new C0402k8();
            g40Var4.m1262d();
            hashSet.add(c0402k82);
            boolean z4 = (!z ? g40Var4 == g40Var2 : g40Var4 == g40Var) ? z3 : true;
            C0067bg c0067bg = new C0067bg(g40Var4, c0402k82);
            int i5 = g40Var4.f2014a;
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = g40Var4.f2016c;
            if (i5 == 2) {
                if (z) {
                    abstractComponentCallbacksC0489ml.getClass();
                } else {
                    abstractComponentCallbacksC0489ml.getClass();
                }
                if (z) {
                    abstractComponentCallbacksC0489ml.getClass();
                } else {
                    abstractComponentCallbacksC0489ml.getClass();
                }
            } else if (z) {
                abstractComponentCallbacksC0489ml.getClass();
            } else {
                abstractComponentCallbacksC0489ml.getClass();
            }
            if (z4) {
                if (z) {
                    abstractComponentCallbacksC0489ml.getClass();
                } else {
                    abstractComponentCallbacksC0489ml.getClass();
                }
            }
            arrayList3.add(c0067bg);
            g40Var4.f2017d.add(new RunnableC0282h1(this, arrayList4, g40Var4));
            z3 = false;
        }
        HashMap map = new HashMap();
        int size3 = arrayList3.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList3.get(i6);
            i6++;
            g40 g40Var5 = (g40) ((C0067bg) obj3).f3479a;
            z30.m2758c(g40Var5.f2016c.f3229E);
            int i7 = g40Var5.f2014a;
        }
        int size4 = arrayList3.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj4 = arrayList3.get(i8);
            i8++;
            C0067bg c0067bg2 = (C0067bg) obj4;
            map.put((g40) c0067bg2.f3479a, Boolean.FALSE);
            c0067bg2.m1986d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f957a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList2.size();
        boolean z5 = false;
        int i9 = 0;
        while (i9 < size5) {
            Object obj5 = arrayList2.get(i9);
            i9++;
            C0017ag c0017ag2 = (C0017ag) obj5;
            g40 g40Var6 = (g40) c0017ag2.f3479a;
            int iM2758c2 = z30.m2758c(g40Var6.f2016c.f3229E);
            int i10 = g40Var6.f2014a;
            if (iM2758c2 == i10 || !(iM2758c2 == i || i10 == i)) {
                z2 = zContainsValue;
                i2 = i;
                viewGroup = viewGroup2;
                c0017ag2.m1986d();
                zContainsValue = z2;
                viewGroup2 = viewGroup;
                i = i2;
            } else {
                C0138d4 c0138d4M94j = c0017ag2.m94j(context);
                if (c0138d4M94j == null) {
                    c0017ag2.m1986d();
                } else {
                    Animator animator = (Animator) c0138d4M94j.f1364c;
                    if (animator == null) {
                        arrayList5.add(c0017ag2);
                    } else {
                        g40 g40Var7 = (g40) c0017ag2.f3479a;
                        i2 = i;
                        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = g40Var7.f2016c;
                        z2 = zContainsValue;
                        if (Boolean.TRUE.equals(map.get(g40Var7))) {
                            if (C0934yl.m2689A(i2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0489ml2 + " as this Fragment was involved in a Transition.");
                            }
                            c0017ag2.m1986d();
                            viewGroup = viewGroup2;
                            zContainsValue = z2;
                            viewGroup2 = viewGroup;
                            i = i2;
                        } else {
                            boolean z6 = g40Var7.f2014a == 3;
                            if (z6) {
                                arrayList4.remove(g40Var7);
                            }
                            View view = abstractComponentCallbacksC0489ml2.f3229E;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new C0928yf(viewGroup3, view, z6, g40Var7, c0017ag2));
                            animator.setTarget(view);
                            animator.start();
                            ((C0402k8) c0017ag2.f3480b).m1643a(new C0431l0(10, animator));
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
            C0017ag c0017ag3 = (C0017ag) obj6;
            g40 g40Var8 = (g40) c0017ag3.f3479a;
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml3 = g40Var8.f2016c;
            if (z7) {
                if (C0934yl.m2689A(i11)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0489ml3 + " as Animations cannot run alongside Transitions.");
                }
                c0017ag3.m1986d();
            } else if (z5) {
                if (C0934yl.m2689A(i11)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0489ml3 + " as Animations cannot run alongside Animators.");
                }
                c0017ag3.m1986d();
            } else {
                View view2 = abstractComponentCallbacksC0489ml3.f3229E;
                C0138d4 c0138d4M94j2 = c0017ag3.m94j(context);
                c0138d4M94j2.getClass();
                Animation animation = (Animation) c0138d4M94j2.f1363b;
                animation.getClass();
                if (g40Var8.f2014a != 1) {
                    view2.startAnimation(animation);
                    c0017ag3.m1986d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    RunnableC0563ol runnableC0563ol = new RunnableC0563ol(animation, viewGroup4, view2);
                    runnableC0563ol.setAnimationListener(new AnimationAnimationListenerC0965zf(c0017ag3, view2, viewGroup4));
                    view2.startAnimation(runnableC0563ol);
                }
                ((C0402k8) c0017ag3.f3480b).m1643a(new C0659r5(c0017ag3, view2, viewGroup4));
            }
        }
        int size7 = arrayList4.size();
        int i13 = 0;
        while (i13 < size7) {
            Object obj7 = arrayList4.get(i13);
            i13++;
            g40 g40Var9 = (g40) obj7;
            z30.m2756a(g40Var9.f2016c.f3229E, g40Var9.f2014a);
        }
        arrayList4.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m677c() {
        if (this.f961e) {
            return;
        }
        ViewGroup viewGroup = this.f957a;
        WeakHashMap weakHashMap = ja0.f2600a;
        if (!v90.m2495b(viewGroup)) {
            m679e();
            this.f960d = false;
            return;
        }
        synchronized (this.f958b) {
            try {
                if (!this.f958b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f959c);
                    this.f959c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        g40 g40Var = (g40) obj;
                        if (C0934yl.m2689A(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + g40Var);
                        }
                        g40Var.m1259a();
                        if (!g40Var.f2020g) {
                            this.f959c.add(g40Var);
                        }
                    }
                    m680g();
                    ArrayList arrayList2 = new ArrayList(this.f958b);
                    this.f958b.clear();
                    this.f959c.addAll(arrayList2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((g40) obj2).m1262d();
                    }
                    m676b(arrayList2, this.f960d);
                    this.f960d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final g40 m678d(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        ArrayList arrayList = this.f958b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g40 g40Var = (g40) obj;
            if (g40Var.f2016c.equals(abstractComponentCallbacksC0489ml) && !g40Var.f2019f) {
                return g40Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m679e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f957a;
        WeakHashMap weakHashMap = ja0.f2600a;
        boolean zM2495b = v90.m2495b(viewGroup);
        synchronized (this.f958b) {
            try {
                m680g();
                ArrayList arrayList = this.f958b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((g40) obj).m1262d();
                }
                ArrayList arrayList2 = new ArrayList(this.f959c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    g40 g40Var = (g40) obj2;
                    if (C0934yl.m2689A(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zM2495b) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f957a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(g40Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    g40Var.m1259a();
                }
                ArrayList arrayList3 = new ArrayList(this.f958b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    g40 g40Var2 = (g40) obj3;
                    if (C0934yl.m2689A(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zM2495b) {
                            str = "";
                        } else {
                            str = "Container " + this.f957a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(g40Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    g40Var2.m1259a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m680g() {
        ArrayList arrayList = this.f958b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g40 g40Var = (g40) obj;
            if (g40Var.f2015b == 2) {
                g40Var.m1261c(z30.m2757b(g40Var.f2016c.m1829A().getVisibility()), 1);
            }
        }
    }
}

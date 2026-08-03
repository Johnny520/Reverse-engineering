package androidx.transition;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import androidx.transition.AbstractC1235e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0003A2;
import p000a.C0108Ff;
import p000a.C0166J1;
import p000a.C0274P1;
import p000a.C0371U9;

/* JADX INFO: renamed from: androidx.transition.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1237g {

    /* JADX INFO: renamed from: a */
    public static final C0274P1 f5274a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<WeakReference<C0166J1<ViewGroup, ArrayList<AbstractC1235e>>>> f5275b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList<ViewGroup> f5276c;

    /* JADX INFO: renamed from: androidx.transition.g$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public AbstractC1235e f5277a;

        /* JADX INFO: renamed from: b */
        public FrameLayout f5278b;

        /* JADX INFO: renamed from: androidx.transition.g$a$a, reason: collision with other inner class name */
        public class C1344a extends C1236f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0166J1 f5279a;

            public C1344a(C0166J1 c0166j1) {
                this.f5279a = c0166j1;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
            /* JADX INFO: renamed from: f */
            public final void mo3022f(AbstractC1235e abstractC1235e) {
                ((ArrayList) this.f5279a.getOrDefault(a.this.f5278b, null)).remove(abstractC1235e);
                abstractC1235e.mo3058y(this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r17v1, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: K */
        /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r8v10, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r9v16, resolved type: V */
        /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: V */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01ff A[EDGE_INSN: B:138:0x01ff->B:93:0x01ff BREAK  A[LOOP:1: B:19:0x0088->B:92:0x01f4], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0207  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPreDraw() {
            ArrayList arrayList;
            AbstractC1235e abstractC1235e;
            int i;
            C0166J1 c0166j1;
            C0166J1 c0166j12;
            int i2;
            int[] iArr;
            C0166J1 c0166j13;
            int i3;
            int i4;
            int i5;
            AbstractC1235e.b orDefault;
            View view;
            boolean z;
            C0166J1 c0166j14;
            C0108Ff c0108Ff;
            View view2;
            boolean z2;
            C0166J1 c0166j15;
            FrameLayout frameLayout = this.f5278b;
            frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
            frameLayout.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList2 = C1237g.f5276c;
            FrameLayout frameLayout2 = this.f5278b;
            boolean z3 = true;
            if (!arrayList2.remove(frameLayout2)) {
                return true;
            }
            C0166J1<ViewGroup, ArrayList<AbstractC1235e>> c0166j1M3065b = C1237g.m3065b();
            Long l = null;
            ArrayList<AbstractC1235e> orDefault2 = c0166j1M3065b.getOrDefault(frameLayout2, null);
            if (orDefault2 != null) {
                arrayList = orDefault2.size() > 0 ? new ArrayList(orDefault2) : null;
                abstractC1235e = this.f5277a;
                orDefault2.add(abstractC1235e);
                abstractC1235e.m3040a(new C1344a(c0166j1M3065b));
                i = 0;
                abstractC1235e.m3044h(frameLayout2, false);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1235e) it.next()).mo3059z(frameLayout2);
                    }
                }
                abstractC1235e.f5248k = new ArrayList<>();
                abstractC1235e.f5249l = new ArrayList<>();
                C0003A2 c0003a2 = abstractC1235e.f5244g;
                C0003A2 c0003a22 = abstractC1235e.f5245h;
                c0166j1 = new C0166J1((C0166J1) c0003a2.f23a);
                c0166j12 = new C0166J1((C0166J1) c0003a22.f23a);
                i2 = 0;
                while (true) {
                    iArr = abstractC1235e.f5247j;
                    if (i2 < iArr.length) {
                        break;
                    }
                    int i6 = iArr[i2];
                    if (i6 == z3) {
                        z = z3;
                        c0166j14 = c0166j12;
                        for (int i7 = c0166j1.f2221c - 1; i7 >= 0; i7--) {
                            View view3 = (View) c0166j1.m1436h(i7);
                            if (view3 != null && abstractC1235e.m3054u(view3) && (c0108Ff = (C0108Ff) c0166j14.remove(view3)) != null && abstractC1235e.m3054u(c0108Ff.f367b)) {
                                abstractC1235e.f5248k.add((C0108Ff) c0166j1.m1437i(i7));
                                abstractC1235e.f5249l.add(c0108Ff);
                            }
                        }
                    } else if (i6 == 2) {
                        z = z3;
                        c0166j14 = c0166j12;
                        C0166J1 c0166j16 = (C0166J1) c0003a2.f26d;
                        int i8 = c0166j16.f2221c;
                        for (int i9 = 0; i9 < i8; i9++) {
                            View view4 = (View) c0166j16.m1438j(i9);
                            if (view4 != null && abstractC1235e.m3054u(view4)) {
                                View view5 = (View) ((C0166J1) c0003a22.f26d).getOrDefault(c0166j16.m1436h(i9), null);
                                if (view5 != null && abstractC1235e.m3054u(view5)) {
                                    C0108Ff c0108Ff2 = (C0108Ff) c0166j1.getOrDefault(view4, null);
                                    C0108Ff c0108Ff3 = (C0108Ff) c0166j14.getOrDefault(view5, null);
                                    if (c0108Ff2 != null && c0108Ff3 != null) {
                                        abstractC1235e.f5248k.add(c0108Ff2);
                                        abstractC1235e.f5249l.add(c0108Ff3);
                                        c0166j1.remove(view4);
                                        c0166j14.remove(view5);
                                    }
                                }
                            }
                        }
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            C0371U9 c0371u9 = (C0371U9) c0003a2.f25c;
                            int iM992e = c0371u9.m992e();
                            int i10 = i;
                            while (i10 < iM992e) {
                                View view6 = (View) c0371u9.m993f(i10);
                                if (view6 == null || !abstractC1235e.m3054u(view6)) {
                                    z2 = z3;
                                    c0166j15 = c0166j12;
                                } else {
                                    if (c0371u9.f1387a) {
                                        c0371u9.m989b();
                                    }
                                    z2 = z3;
                                    C0166J1 c0166j17 = c0166j12;
                                    View view7 = (View) ((C0371U9) c0003a22.f25c).m990c(c0371u9.f1388b[i10], l);
                                    if (view7 == null || !abstractC1235e.m3054u(view7)) {
                                        c0166j15 = c0166j17;
                                    } else {
                                        C0108Ff c0108Ff4 = (C0108Ff) c0166j1.getOrDefault(view6, l);
                                        c0166j15 = c0166j17;
                                        C0108Ff c0108Ff5 = (C0108Ff) c0166j15.getOrDefault(view7, l);
                                        if (c0108Ff4 != null && c0108Ff5 != null) {
                                            abstractC1235e.f5248k.add(c0108Ff4);
                                            abstractC1235e.f5249l.add(c0108Ff5);
                                            c0166j1.remove(view6);
                                            c0166j15.remove(view7);
                                        }
                                    }
                                }
                                i10++;
                                c0166j12 = c0166j15;
                                z3 = z2;
                                l = null;
                            }
                        }
                        z = z3;
                        c0166j14 = c0166j12;
                    } else {
                        z = z3;
                        c0166j14 = c0166j12;
                        SparseArray sparseArray = (SparseArray) c0003a2.f24b;
                        SparseArray sparseArray2 = (SparseArray) c0003a22.f24b;
                        int size = sparseArray.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            View view8 = (View) sparseArray.valueAt(i11);
                            if (view8 != null && abstractC1235e.m3054u(view8) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && abstractC1235e.m3054u(view2)) {
                                C0108Ff c0108Ff6 = (C0108Ff) c0166j1.getOrDefault(view8, null);
                                C0108Ff c0108Ff7 = (C0108Ff) c0166j14.getOrDefault(view2, null);
                                if (c0108Ff6 != null && c0108Ff7 != null) {
                                    abstractC1235e.f5248k.add(c0108Ff6);
                                    abstractC1235e.f5249l.add(c0108Ff7);
                                    c0166j1.remove(view8);
                                    c0166j14.remove(view2);
                                }
                            }
                        }
                    }
                    i2++;
                    c0166j12 = c0166j14;
                    z3 = z;
                    i = 0;
                    l = null;
                }
                boolean z4 = z3;
                c0166j13 = c0166j12;
                for (i3 = 0; i3 < c0166j1.f2221c; i3++) {
                    C0108Ff c0108Ff8 = (C0108Ff) c0166j1.m1438j(i3);
                    if (abstractC1235e.m3054u(c0108Ff8.f367b)) {
                        abstractC1235e.f5248k.add(c0108Ff8);
                        abstractC1235e.f5249l.add(null);
                    }
                }
                for (i4 = 0; i4 < c0166j13.f2221c; i4++) {
                    C0108Ff c0108Ff9 = (C0108Ff) c0166j13.m1438j(i4);
                    if (abstractC1235e.m3054u(c0108Ff9.f367b)) {
                        abstractC1235e.f5249l.add(c0108Ff9);
                        abstractC1235e.f5248k.add(null);
                    }
                }
                C0166J1<Animator, AbstractC1235e.b> c0166j1M3029p = AbstractC1235e.m3029p();
                int i12 = c0166j1M3029p.f2221c;
                WindowId windowId = frameLayout2.getWindowId();
                i5 = i12 - 1;
                while (i5 >= 0) {
                    Animator animatorM1436h = c0166j1M3029p.m1436h(i5);
                    if (animatorM1436h != null && (orDefault = c0166j1M3029p.getOrDefault(animatorM1436h, null)) != null && (view = orDefault.f5262a) != null && windowId.equals(orDefault.f5265d)) {
                        boolean z5 = z4;
                        C0108Ff c0108FfM3051r = abstractC1235e.m3051r(view, z5);
                        C0108Ff c0108FfM3049n = abstractC1235e.m3049n(view, z5);
                        if (c0108FfM3051r == null && c0108FfM3049n == null) {
                            c0108FfM3049n = (C0108Ff) ((C0166J1) abstractC1235e.f5245h.f23a).getOrDefault(view, null);
                        }
                        if (c0108FfM3051r != null || c0108FfM3049n != null) {
                            C0108Ff c0108Ff10 = orDefault.f5264c;
                            AbstractC1235e abstractC1235e2 = orDefault.f5266e;
                            if (abstractC1235e2.mo3053t(c0108Ff10, c0108FfM3049n)) {
                                abstractC1235e2.m3050o().getClass();
                                if (animatorM1436h.isRunning() || animatorM1436h.isStarted()) {
                                    animatorM1436h.cancel();
                                } else {
                                    c0166j1M3029p.remove(animatorM1436h);
                                }
                            }
                        }
                    }
                    i5--;
                    z4 = true;
                }
                abstractC1235e.mo3047l(frameLayout2, abstractC1235e.f5244g, abstractC1235e.f5245h, abstractC1235e.f5248k, abstractC1235e.f5249l);
                abstractC1235e.mo3030A();
                return true;
            }
            orDefault2 = new ArrayList<>();
            c0166j1M3065b.put(frameLayout2, orDefault2);
            abstractC1235e = this.f5277a;
            orDefault2.add(abstractC1235e);
            abstractC1235e.m3040a(new C1344a(c0166j1M3065b));
            i = 0;
            abstractC1235e.m3044h(frameLayout2, false);
            if (arrayList != null) {
            }
            abstractC1235e.f5248k = new ArrayList<>();
            abstractC1235e.f5249l = new ArrayList<>();
            C0003A2 c0003a23 = abstractC1235e.f5244g;
            C0003A2 c0003a222 = abstractC1235e.f5245h;
            c0166j1 = new C0166J1((C0166J1) c0003a23.f23a);
            c0166j12 = new C0166J1((C0166J1) c0003a222.f23a);
            i2 = 0;
            while (true) {
                iArr = abstractC1235e.f5247j;
                if (i2 < iArr.length) {
                }
                i2++;
                c0166j12 = c0166j14;
                z3 = z;
                i = 0;
                l = null;
            }
            boolean z42 = z3;
            c0166j13 = c0166j12;
            while (i3 < c0166j1.f2221c) {
            }
            while (i4 < c0166j13.f2221c) {
            }
            C0166J1<Animator, AbstractC1235e.b> c0166j1M3029p2 = AbstractC1235e.m3029p();
            int i122 = c0166j1M3029p2.f2221c;
            WindowId windowId2 = frameLayout2.getWindowId();
            i5 = i122 - 1;
            while (i5 >= 0) {
            }
            abstractC1235e.mo3047l(frameLayout2, abstractC1235e.f5244g, abstractC1235e.f5245h, abstractC1235e.f5248k, abstractC1235e.f5249l);
            abstractC1235e.mo3030A();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            FrameLayout frameLayout = this.f5278b;
            frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
            frameLayout.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = C1237g.f5276c;
            FrameLayout frameLayout2 = this.f5278b;
            arrayList.remove(frameLayout2);
            ArrayList<AbstractC1235e> orDefault = C1237g.m3065b().getOrDefault(frameLayout2, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<AbstractC1235e> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().mo3059z(frameLayout2);
                }
            }
            this.f5277a.m3045i(true);
        }
    }

    static {
        C0274P1 c0274p1 = new C0274P1();
        c0274p1.f5282D = false;
        c0274p1.m3066K(new C1233c(2));
        c0274p1.m3066K(new C1231a());
        c0274p1.m3066K(new C1233c(1));
        f5274a = c0274p1;
        f5275b = new ThreadLocal<>();
        f5276c = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public static void m3064a(FrameLayout frameLayout, AbstractC1235e abstractC1235e) {
        ArrayList<ViewGroup> arrayList = f5276c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC1235e == null) {
            abstractC1235e = f5274a;
        }
        AbstractC1235e abstractC1235eClone = abstractC1235e.clone();
        ArrayList<AbstractC1235e> orDefault = m3065b().getOrDefault(frameLayout, null);
        if (orDefault != null && orDefault.size() > 0) {
            Iterator<AbstractC1235e> it = orDefault.iterator();
            while (it.hasNext()) {
                it.next().mo3056w(frameLayout);
            }
        }
        abstractC1235eClone.m3044h(frameLayout, true);
        if (((C1234d) frameLayout.getTag(C1230R.id.transition_current_scene)) != null) {
            throw null;
        }
        frameLayout.setTag(C1230R.id.transition_current_scene, null);
        a aVar = new a();
        aVar.f5277a = abstractC1235eClone;
        aVar.f5278b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(aVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* JADX INFO: renamed from: b */
    public static C0166J1<ViewGroup, ArrayList<AbstractC1235e>> m3065b() {
        C0166J1<ViewGroup, ArrayList<AbstractC1235e>> c0166j1;
        ThreadLocal<WeakReference<C0166J1<ViewGroup, ArrayList<AbstractC1235e>>>> threadLocal = f5275b;
        WeakReference<C0166J1<ViewGroup, ArrayList<AbstractC1235e>>> weakReference = threadLocal.get();
        if (weakReference != null && (c0166j1 = weakReference.get()) != null) {
            return c0166j1;
        }
        C0166J1<ViewGroup, ArrayList<AbstractC1235e>> c0166j12 = new C0166J1<>();
        threadLocal.set(new WeakReference<>(c0166j12));
        return c0166j12;
    }
}

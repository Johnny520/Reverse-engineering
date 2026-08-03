package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.C1098R;
import androidx.fragment.app.AbstractC1104f;
import androidx.fragment.app.C1099a;
import androidx.fragment.app.ComponentCallbacksC1100b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0553e7;
import p000a.C0309R1;
import p000a.C0413Wf;
import p000a.C0631i9;
import p000a.C0815s3;
import p000a.C0834t3;
import p000a.C0944z;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1104f {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f4611a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4612b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4613c;

    /* JADX INFO: renamed from: d */
    public boolean f4614d;

    /* JADX INFO: renamed from: e */
    public boolean f4615e;

    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f4616a;

        /* JADX INFO: renamed from: b */
        public boolean f4617b;

        /* JADX INFO: renamed from: a */
        public void mo2515a(ViewGroup viewGroup) {
            C0631i9.m1482e(viewGroup, "container");
        }

        /* JADX INFO: renamed from: b */
        public void mo2516b(ViewGroup viewGroup) {
            C0631i9.m1482e(viewGroup, "container");
        }

        /* JADX INFO: renamed from: c */
        public void mo2518c(C0309R1 c0309r1, ViewGroup viewGroup) {
            C0631i9.m1482e(c0309r1, "backEvent");
            C0631i9.m1482e(viewGroup, "container");
        }

        /* JADX INFO: renamed from: d */
        public void mo2519d(ViewGroup viewGroup) {
            C0631i9.m1482e(viewGroup, "container");
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$b */
    public static final class b extends c {

        /* JADX INFO: renamed from: l */
        public final C1103e f4618l;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(c.b bVar, c.a aVar, C1103e c1103e) {
            ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
            C0631i9.m1481d(componentCallbacksC1100b, "fragmentStateManager.fragment");
            super(bVar, aVar, componentCallbacksC1100b);
            this.f4618l = c1103e;
        }

        @Override // androidx.fragment.app.AbstractC1104f.c
        /* JADX INFO: renamed from: b */
        public final void mo2572b() {
            super.mo2572b();
            this.f4621c.f4569m = false;
            this.f4618l.m2555k();
        }

        @Override // androidx.fragment.app.AbstractC1104f.c
        /* JADX INFO: renamed from: e */
        public final void mo2573e() {
            if (this.f4626h) {
                return;
            }
            this.f4626h = true;
            c.a aVar = this.f4620b;
            c.a aVar2 = c.a.f4631b;
            C1103e c1103e = this.f4618l;
            if (aVar != aVar2) {
                if (aVar == c.a.f4632c) {
                    ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
                    C0631i9.m1481d(componentCallbacksC1100b, "fragmentStateManager.fragment");
                    View viewM2525B = componentCallbacksC1100b.m2525B();
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewM2525B.findFocus() + " on view " + viewM2525B + " for Fragment " + componentCallbacksC1100b);
                    }
                    viewM2525B.clearFocus();
                    return;
                }
                return;
            }
            ComponentCallbacksC1100b componentCallbacksC1100b2 = c1103e.f4607c;
            C0631i9.m1481d(componentCallbacksC1100b2, "fragmentStateManager.fragment");
            View viewFindFocus = componentCallbacksC1100b2.f4543G.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC1100b2.m2529b().f4596k = viewFindFocus;
                if (AbstractC0553e7.m1330J(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC1100b2);
                }
            }
            View viewM2525B2 = this.f4621c.m2525B();
            if (viewM2525B2.getParent() == null) {
                c1103e.m2546b();
                viewM2525B2.setAlpha(0.0f);
            }
            if (viewM2525B2.getAlpha() == 0.0f && viewM2525B2.getVisibility() == 0) {
                viewM2525B2.setVisibility(4);
            }
            ComponentCallbacksC1100b.d dVar = componentCallbacksC1100b2.f4546J;
            viewM2525B2.setAlpha(dVar == null ? 1.0f : dVar.f4595j);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public b f4619a;

        /* JADX INFO: renamed from: b */
        public a f4620b;

        /* JADX INFO: renamed from: c */
        public final ComponentCallbacksC1100b f4621c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f4622d;

        /* JADX INFO: renamed from: e */
        public boolean f4623e;

        /* JADX INFO: renamed from: f */
        public boolean f4624f;

        /* JADX INFO: renamed from: g */
        public boolean f4625g;

        /* JADX INFO: renamed from: h */
        public boolean f4626h;

        /* JADX INFO: renamed from: i */
        public boolean f4627i;

        /* JADX INFO: renamed from: j */
        public final ArrayList f4628j;

        /* JADX INFO: renamed from: k */
        public final ArrayList f4629k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: androidx.fragment.app.f$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public static final a f4630a;

            /* JADX INFO: renamed from: b */
            public static final a f4631b;

            /* JADX INFO: renamed from: c */
            public static final a f4632c;

            /* JADX INFO: renamed from: d */
            public static final /* synthetic */ a[] f4633d;

            static {
                a aVar = new a("NONE", 0);
                f4630a = aVar;
                a aVar2 = new a("ADDING", 1);
                f4631b = aVar2;
                a aVar3 = new a("REMOVING", 2);
                f4632c = aVar3;
                f4633d = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f4633d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: androidx.fragment.app.f$c$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final b f4634a;

            /* JADX INFO: renamed from: b */
            public static final b f4635b;

            /* JADX INFO: renamed from: c */
            public static final b f4636c;

            /* JADX INFO: renamed from: d */
            public static final b f4637d;

            /* JADX INFO: renamed from: e */
            public static final /* synthetic */ b[] f4638e;

            static {
                b bVar = new b("REMOVED", 0);
                f4634a = bVar;
                b bVar2 = new b("VISIBLE", 1);
                f4635b = bVar2;
                b bVar3 = new b("GONE", 2);
                f4636c = bVar3;
                b bVar4 = new b("INVISIBLE", 3);
                f4637d = bVar4;
                f4638e = new b[]{bVar, bVar2, bVar3, bVar4};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f4638e.clone();
            }

            /* JADX INFO: renamed from: a */
            public final void m2577a(View view, ViewGroup viewGroup) {
                C0631i9.m1482e(view, "view");
                C0631i9.m1482e(viewGroup, "container");
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (AbstractC0553e7.m1330J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (AbstractC0553e7.m1330J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (AbstractC0553e7.m1330J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public c(b bVar, a aVar, ComponentCallbacksC1100b componentCallbacksC1100b) {
            C0631i9.m1482e(componentCallbacksC1100b, "fragment");
            this.f4619a = bVar;
            this.f4620b = aVar;
            this.f4621c = componentCallbacksC1100b;
            this.f4622d = new ArrayList();
            this.f4627i = true;
            ArrayList arrayList = new ArrayList();
            this.f4628j = arrayList;
            this.f4629k = arrayList;
        }

        /* JADX INFO: renamed from: a */
        public final void m2574a(ViewGroup viewGroup) {
            C0631i9.m1482e(viewGroup, "container");
            this.f4626h = false;
            if (this.f4623e) {
                return;
            }
            this.f4623e = true;
            if (this.f4628j.isEmpty()) {
                mo2572b();
                return;
            }
            for (a aVar : C0834t3.m1959w0(this.f4629k)) {
                aVar.getClass();
                if (!aVar.f4617b) {
                    aVar.mo2515a(viewGroup);
                }
                aVar.f4617b = true;
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo2572b() {
            this.f4626h = false;
            if (this.f4624f) {
                return;
            }
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4624f = true;
            Iterator it = this.f4622d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m2575c(a aVar) {
            C0631i9.m1482e(aVar, "effect");
            ArrayList arrayList = this.f4628j;
            if (arrayList.remove(aVar) && arrayList.isEmpty()) {
                mo2572b();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m2576d(b bVar, a aVar) {
            int iOrdinal = aVar.ordinal();
            b bVar2 = b.f4634a;
            ComponentCallbacksC1100b componentCallbacksC1100b = this.f4621c;
            if (iOrdinal == 0) {
                if (this.f4619a != bVar2) {
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC1100b + " mFinalState = " + this.f4619a + " -> " + bVar + '.');
                    }
                    this.f4619a = bVar;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.f4619a == bVar2) {
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC1100b + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4620b + " to ADDING.");
                    }
                    this.f4619a = b.f4635b;
                    this.f4620b = a.f4631b;
                    this.f4627i = true;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC1100b + " mFinalState = " + this.f4619a + " -> REMOVED. mLifecycleImpact  = " + this.f4620b + " to REMOVING.");
            }
            this.f4619a = bVar2;
            this.f4620b = a.f4632c;
            this.f4627i = true;
        }

        /* JADX INFO: renamed from: e */
        public void mo2573e() {
            this.f4626h = true;
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f4619a + " lifecycleImpact = " + this.f4620b + " fragment = " + this.f4621c + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$d */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractC1104f(ViewGroup viewGroup) {
        C0631i9.m1482e(viewGroup, "container");
        this.f4611a = viewGroup;
        this.f4612b = new ArrayList();
        this.f4613c = new ArrayList();
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC1104f m2562i(ViewGroup viewGroup, AbstractC0553e7 abstractC0553e7) {
        C0631i9.m1482e(viewGroup, "container");
        C0631i9.m1482e(abstractC0553e7, "fragmentManager");
        C0631i9.m1481d(abstractC0553e7.m1341H(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(C1098R.id.special_effects_controller_view_tag);
        if (tag instanceof AbstractC1104f) {
            return (AbstractC1104f) tag;
        }
        C1099a c1099a = new C1099a(viewGroup);
        viewGroup.setTag(C1098R.id.special_effects_controller_view_tag, c1099a);
        return c1099a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2563a(c cVar) {
        C0631i9.m1482e(cVar, "operation");
        if (cVar.f4627i) {
            cVar.f4619a.m2577a(cVar.f4621c.m2525B(), this.f4611a);
            cVar.f4627i = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2514b(ArrayList arrayList, boolean z);

    /* JADX INFO: renamed from: c */
    public final void m2564c(ArrayList arrayList) {
        C0631i9.m1482e(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0815s3.m1886h0(arrayList2, ((c) it.next()).f4629k);
        }
        List listM1959w0 = C0834t3.m1959w0(C0834t3.m1946A0(arrayList2));
        int size = listM1959w0.size();
        for (int i = 0; i < size; i++) {
            ((a) listM1959w0.get(i)).mo2516b(this.f4611a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m2563a((c) arrayList.get(i2));
        }
        List listM1959w02 = C0834t3.m1959w0(arrayList);
        int size3 = listM1959w02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c cVar = (c) listM1959w02.get(i3);
            if (cVar.f4629k.isEmpty()) {
                cVar.mo2572b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2565d(c.b bVar, c.a aVar, C1103e c1103e) {
        synchronized (this.f4612b) {
            try {
                ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
                C0631i9.m1481d(componentCallbacksC1100b, "fragmentStateManager.fragment");
                c cVarM2567f = m2567f(componentCallbacksC1100b);
                if (cVarM2567f == null) {
                    ComponentCallbacksC1100b componentCallbacksC1100b2 = c1103e.f4607c;
                    cVarM2567f = componentCallbacksC1100b2.f4569m ? m2568g(componentCallbacksC1100b2) : null;
                }
                if (cVarM2567f != null) {
                    cVarM2567f.m2576d(bVar, aVar);
                    return;
                }
                final b bVar2 = new b(bVar, aVar, c1103e);
                this.f4612b.add(bVar2);
                final int i = 0;
                bVar2.f4622d.add(new Runnable(this) { // from class: a.pe

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ AbstractC1104f f3043b;

                    {
                        this.f3043b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                AbstractC1104f abstractC1104f = this.f3043b;
                                C0631i9.m1482e(abstractC1104f, "this$0");
                                AbstractC1104f.b bVar3 = bVar2;
                                if (abstractC1104f.f4612b.contains(bVar3)) {
                                    AbstractC1104f.c.b bVar4 = bVar3.f4619a;
                                    View view = bVar3.f4621c.f4543G;
                                    C0631i9.m1481d(view, "operation.fragment.mView");
                                    bVar4.m2577a(view, abstractC1104f.f4611a);
                                }
                                break;
                            default:
                                AbstractC1104f abstractC1104f2 = this.f3043b;
                                C0631i9.m1482e(abstractC1104f2, "this$0");
                                AbstractC1104f.b bVar5 = bVar2;
                                abstractC1104f2.f4612b.remove(bVar5);
                                abstractC1104f2.f4613c.remove(bVar5);
                                break;
                        }
                    }
                });
                final int i2 = 1;
                bVar2.f4622d.add(new Runnable(this) { // from class: a.pe

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ AbstractC1104f f3043b;

                    {
                        this.f3043b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                AbstractC1104f abstractC1104f = this.f3043b;
                                C0631i9.m1482e(abstractC1104f, "this$0");
                                AbstractC1104f.b bVar3 = bVar2;
                                if (abstractC1104f.f4612b.contains(bVar3)) {
                                    AbstractC1104f.c.b bVar4 = bVar3.f4619a;
                                    View view = bVar3.f4621c.f4543G;
                                    C0631i9.m1481d(view, "operation.fragment.mView");
                                    bVar4.m2577a(view, abstractC1104f.f4611a);
                                }
                                break;
                            default:
                                AbstractC1104f abstractC1104f2 = this.f3043b;
                                C0631i9.m1482e(abstractC1104f2, "this$0");
                                AbstractC1104f.b bVar5 = bVar2;
                                abstractC1104f2.f4612b.remove(bVar5);
                                abstractC1104f2.f4613c.remove(bVar5);
                                break;
                        }
                    }
                });
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2566e() {
        boolean z;
        if (this.f4615e) {
            return;
        }
        if (!this.f4611a.isAttachedToWindow()) {
            m2569h();
            this.f4614d = false;
            return;
        }
        synchronized (this.f4612b) {
            try {
                if (this.f4612b.isEmpty()) {
                    ArrayList<c> arrayListM1961y0 = C0834t3.m1961y0(this.f4613c);
                    this.f4613c.clear();
                    for (c cVar : arrayListM1961y0) {
                        if (AbstractC0553e7.m1330J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar + " with no incoming pendingOperations");
                        }
                        ViewGroup viewGroup = this.f4611a;
                        cVar.getClass();
                        C0631i9.m1482e(viewGroup, "container");
                        if (!cVar.f4623e) {
                            cVar.m2574a(viewGroup);
                        }
                        if (!cVar.f4624f) {
                            this.f4613c.add(cVar);
                        }
                    }
                } else {
                    ArrayList<c> arrayListM1961y02 = C0834t3.m1961y0(this.f4613c);
                    this.f4613c.clear();
                    for (c cVar2 : arrayListM1961y02) {
                        if (AbstractC0553e7.m1330J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar2);
                        }
                        ViewGroup viewGroup2 = this.f4611a;
                        boolean z2 = cVar2.f4621c.f4569m;
                        C0631i9.m1482e(viewGroup2, "container");
                        if (!cVar2.f4623e) {
                            if (z2) {
                                cVar2.f4625g = true;
                            }
                            cVar2.m2574a(viewGroup2);
                        }
                        if (!cVar2.f4624f) {
                            this.f4613c.add(cVar2);
                        }
                    }
                    m2571k();
                    ArrayList<c> arrayListM1961y03 = C0834t3.m1961y0(this.f4612b);
                    if (arrayListM1961y03.isEmpty()) {
                        return;
                    }
                    this.f4612b.clear();
                    this.f4613c.addAll(arrayListM1961y03);
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    mo2514b(arrayListM1961y03, this.f4614d);
                    boolean z3 = true;
                    boolean z4 = true;
                    for (c cVar3 : arrayListM1961y03) {
                        if (cVar3.f4629k.isEmpty()) {
                            z = false;
                            break;
                        }
                        ArrayList<a> arrayList = cVar3.f4629k;
                        if (arrayList == null || !arrayList.isEmpty()) {
                            for (a aVar : arrayList) {
                                aVar.getClass();
                                if (!(aVar instanceof C1099a.c)) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (!cVar3.f4621c.f4569m) {
                            z3 = false;
                        }
                        z4 = z;
                    }
                    if (z4) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayListM1961y03.iterator();
                        while (it.hasNext()) {
                            C0815s3.m1886h0(arrayList2, ((c) it.next()).f4629k);
                        }
                        boolean z5 = !arrayList2.isEmpty();
                        if (!z3) {
                            m2570j(arrayListM1961y03);
                            m2564c(arrayListM1961y03);
                        } else if (z5) {
                            m2570j(arrayListM1961y03);
                            int size = arrayListM1961y03.size();
                            for (int i = 0; i < size; i++) {
                                m2563a((c) arrayListM1961y03.get(i));
                            }
                        }
                        this.f4614d = false;
                        if (AbstractC0553e7.m1330J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                        }
                    }
                }
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final c m2567f(ComponentCallbacksC1100b componentCallbacksC1100b) {
        Object next;
        Iterator it = this.f4612b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c cVar = (c) next;
            if (C0631i9.m1478a(cVar.f4621c, componentCallbacksC1100b) && !cVar.f4623e) {
                break;
            }
        }
        return (c) next;
    }

    /* JADX INFO: renamed from: g */
    public final c m2568g(ComponentCallbacksC1100b componentCallbacksC1100b) {
        Object next;
        Iterator it = this.f4613c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c cVar = (c) next;
            if (C0631i9.m1478a(cVar.f4621c, componentCallbacksC1100b) && !cVar.f4623e) {
                break;
            }
        }
        return (c) next;
    }

    /* JADX INFO: renamed from: h */
    public final void m2569h() {
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f4611a.isAttachedToWindow();
        synchronized (this.f4612b) {
            try {
                m2571k();
                m2570j(this.f4612b);
                for (c cVar : C0834t3.m1961y0(this.f4613c)) {
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f4611a + " is not attached to window. ") + "Cancelling running operation " + cVar);
                    }
                    cVar.m2574a(this.f4611a);
                }
                for (c cVar2 : C0834t3.m1961y0(this.f4612b)) {
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f4611a + " is not attached to window. ") + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.m2574a(this.f4611a);
                }
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2570j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).mo2573e();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0815s3.m1886h0(arrayList2, ((c) it.next()).f4629k);
        }
        List listM1959w0 = C0834t3.m1959w0(C0834t3.m1946A0(arrayList2));
        int size2 = listM1959w0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a aVar = (a) listM1959w0.get(i2);
            aVar.getClass();
            ViewGroup viewGroup = this.f4611a;
            C0631i9.m1482e(viewGroup, "container");
            if (!aVar.f4616a) {
                aVar.mo2519d(viewGroup);
            }
            aVar.f4616a = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2571k() {
        c.b bVar;
        for (c cVar : this.f4612b) {
            if (cVar.f4620b == c.a.f4631b) {
                int visibility = cVar.f4621c.m2525B().getVisibility();
                if (visibility == 0) {
                    bVar = c.b.f4635b;
                } else if (visibility == 4) {
                    bVar = c.b.f4637d;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(C0944z.m2225e("Unknown visibility ", visibility));
                    }
                    bVar = c.b.f4636c;
                }
                cVar.m2576d(bVar, c.a.f4630a);
            }
        }
    }
}

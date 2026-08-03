package p000a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0981a;
import androidx.fragment.C1098R;
import androidx.fragment.app.AbstractC1104f;
import androidx.fragment.app.C1099a;
import androidx.fragment.app.C1102d;
import androidx.fragment.app.C1103e;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1133q;
import androidx.savedstate.C1224a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.AbstractC0762p7;
import p000a.ActivityC0422X6;

/* JADX INFO: renamed from: a.e7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0553e7 {

    /* JADX INFO: renamed from: A */
    public final d f2043A;

    /* JADX INFO: renamed from: B */
    public C0527d0 f2044B;

    /* JADX INFO: renamed from: C */
    public C0527d0 f2045C;

    /* JADX INFO: renamed from: D */
    public C0527d0 f2046D;

    /* JADX INFO: renamed from: E */
    public ArrayDeque<g> f2047E;

    /* JADX INFO: renamed from: F */
    public boolean f2048F;

    /* JADX INFO: renamed from: G */
    public boolean f2049G;

    /* JADX INFO: renamed from: H */
    public boolean f2050H;

    /* JADX INFO: renamed from: I */
    public boolean f2051I;

    /* JADX INFO: renamed from: J */
    public boolean f2052J;

    /* JADX INFO: renamed from: K */
    public ArrayList<C0327S1> f2053K;

    /* JADX INFO: renamed from: L */
    public ArrayList<Boolean> f2054L;

    /* JADX INFO: renamed from: M */
    public ArrayList<ComponentCallbacksC1100b> f2055M;

    /* JADX INFO: renamed from: N */
    public C0667k7 f2056N;

    /* JADX INFO: renamed from: O */
    public final e f2057O;

    /* JADX INFO: renamed from: b */
    public boolean f2059b;

    /* JADX INFO: renamed from: e */
    public ArrayList<ComponentCallbacksC1100b> f2062e;

    /* JADX INFO: renamed from: g */
    public OnBackPressedDispatcher f2064g;

    /* JADX INFO: renamed from: m */
    public final ArrayList<h> f2070m;

    /* JADX INFO: renamed from: n */
    public final C0496b7 f2071n;

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList<InterfaceC0686l7> f2072o;

    /* JADX INFO: renamed from: p */
    public final C0515c7 f2073p;

    /* JADX INFO: renamed from: q */
    public final C0515c7 f2074q;

    /* JADX INFO: renamed from: r */
    public final C0515c7 f2075r;

    /* JADX INFO: renamed from: s */
    public final C0515c7 f2076s;

    /* JADX INFO: renamed from: t */
    public final b f2077t;

    /* JADX INFO: renamed from: u */
    public int f2078u;

    /* JADX INFO: renamed from: v */
    public ActivityC0422X6.a f2079v;

    /* JADX INFO: renamed from: w */
    public AbstractC0472a2 f2080w;

    /* JADX INFO: renamed from: x */
    public ComponentCallbacksC1100b f2081x;

    /* JADX INFO: renamed from: y */
    public ComponentCallbacksC1100b f2082y;

    /* JADX INFO: renamed from: z */
    public final c f2083z;

    /* JADX INFO: renamed from: a */
    public final ArrayList<i> f2058a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final C0003A2 f2060c = new C0003A2(2);

    /* JADX INFO: renamed from: d */
    public ArrayList<C0327S1> f2061d = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0477a7 f2063f = new LayoutInflaterFactory2C0477a7(this);

    /* JADX INFO: renamed from: h */
    public C0327S1 f2065h = null;

    /* JADX INFO: renamed from: i */
    public final a f2066i = new a();

    /* JADX INFO: renamed from: j */
    public final AtomicInteger f2067j = new AtomicInteger();

    /* JADX INFO: renamed from: k */
    public final Map<String, C0363U1> f2068k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l */
    public final Map<String, Bundle> f2069l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a.e7$a */
    public class a extends AbstractC0373Ub {
        public a() {
        }

        @Override // p000a.AbstractC0373Ub
        /* JADX INFO: renamed from: a */
        public final void mo998a() {
            boolean zM1330J = AbstractC0553e7.m1330J(3);
            AbstractC0553e7 abstractC0553e7 = AbstractC0553e7.this;
            if (zM1330J) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + abstractC0553e7);
            }
            C0327S1 c0327s1 = abstractC0553e7.f2065h;
            if (c0327s1 != null) {
                c0327s1.f1162r = false;
                RunnableC0221M2 runnableC0221M2 = new RunnableC0221M2(10, abstractC0553e7);
                if (c0327s1.f3015p == null) {
                    c0327s1.f3015p = new ArrayList<>();
                }
                c0327s1.f3015p.add(runnableC0221M2);
                abstractC0553e7.f2065h.m904d(false);
                abstractC0553e7.m1386z(true);
                abstractC0553e7.m1338D();
            }
            abstractC0553e7.f2065h = null;
        }

        @Override // p000a.AbstractC0373Ub
        /* JADX INFO: renamed from: b */
        public final void mo999b() {
            boolean zM1330J = AbstractC0553e7.m1330J(3);
            AbstractC0553e7 abstractC0553e7 = AbstractC0553e7.this;
            if (zM1330J) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + abstractC0553e7);
            }
            abstractC0553e7.m1386z(true);
            C0327S1 c0327s1 = abstractC0553e7.f2065h;
            a aVar = abstractC0553e7.f2066i;
            if (c0327s1 == null) {
                if (aVar.f1395a) {
                    if (AbstractC0553e7.m1330J(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    abstractC0553e7.m1346Q();
                    return;
                } else {
                    if (AbstractC0553e7.m1330J(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    abstractC0553e7.f2064g.m2283b();
                    return;
                }
            }
            ArrayList<h> arrayList = abstractC0553e7.f2070m;
            if (!arrayList.isEmpty()) {
                LinkedHashSet<ComponentCallbacksC1100b> linkedHashSet = new LinkedHashSet(AbstractC0553e7.m1329E(abstractC0553e7.f2065h));
                for (h hVar : arrayList) {
                    for (ComponentCallbacksC1100b componentCallbacksC1100b : linkedHashSet) {
                        hVar.getClass();
                    }
                }
            }
            Iterator<AbstractC0762p7.a> it = abstractC0553e7.f2065h.f3000a.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC1100b componentCallbacksC1100b2 = it.next().f3017b;
                if (componentCallbacksC1100b2 != null) {
                    componentCallbacksC1100b2.f4569m = false;
                }
            }
            for (AbstractC1104f abstractC1104f : abstractC0553e7.m1365f(new ArrayList(Collections.singletonList(abstractC0553e7.f2065h)), 0, 1)) {
                abstractC1104f.getClass();
                if (AbstractC0553e7.m1330J(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                ArrayList arrayList2 = abstractC1104f.f4613c;
                abstractC1104f.m2570j(arrayList2);
                abstractC1104f.m2564c(arrayList2);
            }
            Iterator<AbstractC0762p7.a> it2 = abstractC0553e7.f2065h.f3000a.iterator();
            while (it2.hasNext()) {
                ComponentCallbacksC1100b componentCallbacksC1100b3 = it2.next().f3017b;
                if (componentCallbacksC1100b3 != null && componentCallbacksC1100b3.f4542F == null) {
                    abstractC0553e7.m1367g(componentCallbacksC1100b3).m2555k();
                }
            }
            abstractC0553e7.f2065h = null;
            abstractC0553e7.m1366f0();
            if (AbstractC0553e7.m1330J(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + aVar.f1395a + " for  FragmentManager " + abstractC0553e7);
            }
        }

        @Override // p000a.AbstractC0373Ub
        /* JADX INFO: renamed from: c */
        public final void mo1000c(C0309R1 c0309r1) {
            boolean zM1330J = AbstractC0553e7.m1330J(2);
            AbstractC0553e7 abstractC0553e7 = AbstractC0553e7.this;
            if (zM1330J) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + abstractC0553e7);
            }
            if (abstractC0553e7.f2065h != null) {
                for (AbstractC1104f abstractC1104f : abstractC0553e7.m1365f(new ArrayList(Collections.singletonList(abstractC0553e7.f2065h)), 0, 1)) {
                    abstractC1104f.getClass();
                    C0631i9.m1482e(c0309r1, "backEvent");
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0309r1.f1111c);
                    }
                    ArrayList arrayList = abstractC1104f.f4613c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0815s3.m1886h0(arrayList2, ((AbstractC1104f.c) it.next()).f4629k);
                    }
                    List listM1959w0 = C0834t3.m1959w0(C0834t3.m1946A0(arrayList2));
                    int size = listM1959w0.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC1104f.a) listM1959w0.get(i)).mo2518c(c0309r1, abstractC1104f.f4611a);
                    }
                }
                Iterator<h> it2 = abstractC0553e7.f2070m.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }

        @Override // p000a.AbstractC0373Ub
        /* JADX INFO: renamed from: d */
        public final void mo1001d(C0309R1 c0309r1) {
            boolean zM1330J = AbstractC0553e7.m1330J(3);
            AbstractC0553e7 abstractC0553e7 = AbstractC0553e7.this;
            if (zM1330J) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + abstractC0553e7);
            }
            abstractC0553e7.m1383w();
            abstractC0553e7.m1384x(abstractC0553e7.new k(), false);
        }
    }

    /* JADX INFO: renamed from: a.e7$b */
    public class b implements InterfaceC0595gb {
        public b() {
        }

        @Override // p000a.InterfaceC0595gb
        /* JADX INFO: renamed from: a */
        public final void mo1387a(Menu menu, MenuInflater menuInflater) {
            AbstractC0553e7.this.m1371k();
        }

        @Override // p000a.InterfaceC0595gb
        /* JADX INFO: renamed from: b */
        public final void mo1388b(Menu menu) {
            AbstractC0553e7.this.m1380t();
        }

        @Override // p000a.InterfaceC0595gb
        /* JADX INFO: renamed from: c */
        public final boolean mo1389c(MenuItem menuItem) {
            return AbstractC0553e7.this.m1376p();
        }

        @Override // p000a.InterfaceC0595gb
        /* JADX INFO: renamed from: d */
        public final void mo1390d(Menu menu) {
            AbstractC0553e7.this.m1377q();
        }
    }

    /* JADX INFO: renamed from: a.e7$c */
    public class c extends C1102d {
        public c() {
        }

        @Override // androidx.fragment.app.C1102d
        /* JADX INFO: renamed from: a */
        public final ComponentCallbacksC1100b mo1391a(String str) {
            try {
                return C1102d.m2544c(AbstractC0553e7.this.f2079v.f1723b.getClassLoader(), str).getConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                throw new ComponentCallbacksC1100b.e(C0944z.m2227g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (InstantiationException e2) {
                throw new ComponentCallbacksC1100b.e(C0944z.m2227g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new ComponentCallbacksC1100b.e(C0944z.m2227g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new ComponentCallbacksC1100b.e(C0944z.m2227g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    /* JADX INFO: renamed from: a.e7$d */
    public class d implements InterfaceC0788qe {
    }

    /* JADX INFO: renamed from: a.e7$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC0553e7.this.m1386z(true);
        }
    }

    /* JADX INFO: renamed from: a.e7$f */
    public static class f extends AbstractC0433Y<C0593g9, C0397W> {
        @Override // p000a.AbstractC0433Y
        /* JADX INFO: renamed from: a */
        public final Intent mo1077a(Context context, Parcelable parcelable) {
            Bundle bundleExtra;
            C0593g9 c0593g9 = (C0593g9) parcelable;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = c0593g9.f2203b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c0593g9 = new C0593g9(c0593g9.f2202a, null, c0593g9.f2204c, c0593g9.f2205d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0593g9);
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p000a.AbstractC0433Y
        /* JADX INFO: renamed from: c */
        public final Object mo1079c(Intent intent, int i) {
            return new C0397W(intent, i);
        }
    }

    /* JADX INFO: renamed from: a.e7$g */
    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public String f2088a;

        /* JADX INFO: renamed from: b */
        public int f2089b;

        /* JADX INFO: renamed from: a.e7$g$a */
        public class a implements Parcelable.Creator<g> {
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                g gVar = new g();
                gVar.f2088a = parcel.readString();
                gVar.f2089b = parcel.readInt();
                return gVar;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(String str, int i) {
            this.f2088a = str;
            this.f2089b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2088a);
            parcel.writeInt(this.f2089b);
        }
    }

    /* JADX INFO: renamed from: a.e7$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void m1392a();
    }

    /* JADX INFO: renamed from: a.e7$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        boolean mo902a(ArrayList<C0327S1> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: a.e7$j */
    public class j implements i {

        /* JADX INFO: renamed from: a */
        public final int f2090a;

        public j(int i) {
            this.f2090a = i;
        }

        @Override // p000a.AbstractC0553e7.i
        /* JADX INFO: renamed from: a */
        public final boolean mo902a(ArrayList<C0327S1> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC0553e7 abstractC0553e7 = AbstractC0553e7.this;
            ComponentCallbacksC1100b componentCallbacksC1100b = abstractC0553e7.f2082y;
            int i = this.f2090a;
            if (componentCallbacksC1100b == null || i >= 0 || !componentCallbacksC1100b.m2530c().m1347R(-1, 0)) {
                return abstractC0553e7.m1348S(arrayList, arrayList2, i, 1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a.e7$k */
    public class k implements i {
        public k() {
        }

        @Override // p000a.AbstractC0553e7.i
        /* JADX INFO: renamed from: a */
        public final boolean mo902a(ArrayList<C0327S1> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC0553e7 abstractC0553e7 = AbstractC0553e7.this;
            ArrayList<C0327S1> arrayList3 = abstractC0553e7.f2061d;
            C0327S1 c0327s1 = arrayList3.get(arrayList3.size() - 1);
            abstractC0553e7.f2065h = c0327s1;
            Iterator<AbstractC0762p7.a> it = c0327s1.f3000a.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC1100b componentCallbacksC1100b = it.next().f3017b;
                if (componentCallbacksC1100b != null) {
                    componentCallbacksC1100b.f4569m = true;
                }
            }
            boolean zM1348S = abstractC0553e7.m1348S(arrayList, arrayList2, -1, 0);
            if (!abstractC0553e7.f2070m.isEmpty() && arrayList.size() > 0) {
                arrayList2.get(arrayList.size() - 1).getClass();
                LinkedHashSet<ComponentCallbacksC1100b> linkedHashSet = new LinkedHashSet();
                Iterator<C0327S1> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(AbstractC0553e7.m1329E(it2.next()));
                }
                for (h hVar : abstractC0553e7.f2070m) {
                    for (ComponentCallbacksC1100b componentCallbacksC1100b2 : linkedHashSet) {
                        hVar.getClass();
                    }
                }
            }
            return zM1348S;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [a.c7] */
    /* JADX WARN: Type inference failed for: r0v16, types: [a.c7] */
    /* JADX WARN: Type inference failed for: r0v17, types: [a.c7] */
    /* JADX WARN: Type inference failed for: r0v18, types: [a.c7] */
    public AbstractC0553e7() {
        Collections.synchronizedMap(new HashMap());
        this.f2070m = new ArrayList<>();
        this.f2071n = new C0496b7(this);
        this.f2072o = new CopyOnWriteArrayList<>();
        final int i2 = 0;
        this.f2073p = new InterfaceC0294Q3(this) { // from class: a.c7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0553e7 f1880b;

            {
                this.f1880b = this;
            }

            @Override // p000a.InterfaceC0294Q3
            /* JADX INFO: renamed from: a */
            public final void mo747a(Object obj) {
                switch (i2) {
                    case 0:
                        AbstractC0553e7 abstractC0553e7 = this.f1880b;
                        if (abstractC0553e7.m1343L()) {
                            abstractC0553e7.m1369i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0553e7 abstractC0553e72 = this.f1880b;
                        if (abstractC0553e72.m1343L() && num.intValue() == 80) {
                            abstractC0553e72.m1373m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0956zb c0956zb = (C0956zb) obj;
                        AbstractC0553e7 abstractC0553e73 = this.f1880b;
                        if (abstractC0553e73.m1343L()) {
                            boolean z = c0956zb.f3565a;
                            abstractC0553e73.m1374n(false);
                        }
                        break;
                    default:
                        C0862uc c0862uc = (C0862uc) obj;
                        AbstractC0553e7 abstractC0553e74 = this.f1880b;
                        if (abstractC0553e74.m1343L()) {
                            boolean z2 = c0862uc.f3369a;
                            abstractC0553e74.m1379s(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f2074q = new InterfaceC0294Q3(this) { // from class: a.c7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0553e7 f1880b;

            {
                this.f1880b = this;
            }

            @Override // p000a.InterfaceC0294Q3
            /* JADX INFO: renamed from: a */
            public final void mo747a(Object obj) {
                switch (i3) {
                    case 0:
                        AbstractC0553e7 abstractC0553e7 = this.f1880b;
                        if (abstractC0553e7.m1343L()) {
                            abstractC0553e7.m1369i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0553e7 abstractC0553e72 = this.f1880b;
                        if (abstractC0553e72.m1343L() && num.intValue() == 80) {
                            abstractC0553e72.m1373m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0956zb c0956zb = (C0956zb) obj;
                        AbstractC0553e7 abstractC0553e73 = this.f1880b;
                        if (abstractC0553e73.m1343L()) {
                            boolean z = c0956zb.f3565a;
                            abstractC0553e73.m1374n(false);
                        }
                        break;
                    default:
                        C0862uc c0862uc = (C0862uc) obj;
                        AbstractC0553e7 abstractC0553e74 = this.f1880b;
                        if (abstractC0553e74.m1343L()) {
                            boolean z2 = c0862uc.f3369a;
                            abstractC0553e74.m1379s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 2;
        this.f2075r = new InterfaceC0294Q3(this) { // from class: a.c7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0553e7 f1880b;

            {
                this.f1880b = this;
            }

            @Override // p000a.InterfaceC0294Q3
            /* JADX INFO: renamed from: a */
            public final void mo747a(Object obj) {
                switch (i4) {
                    case 0:
                        AbstractC0553e7 abstractC0553e7 = this.f1880b;
                        if (abstractC0553e7.m1343L()) {
                            abstractC0553e7.m1369i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0553e7 abstractC0553e72 = this.f1880b;
                        if (abstractC0553e72.m1343L() && num.intValue() == 80) {
                            abstractC0553e72.m1373m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0956zb c0956zb = (C0956zb) obj;
                        AbstractC0553e7 abstractC0553e73 = this.f1880b;
                        if (abstractC0553e73.m1343L()) {
                            boolean z = c0956zb.f3565a;
                            abstractC0553e73.m1374n(false);
                        }
                        break;
                    default:
                        C0862uc c0862uc = (C0862uc) obj;
                        AbstractC0553e7 abstractC0553e74 = this.f1880b;
                        if (abstractC0553e74.m1343L()) {
                            boolean z2 = c0862uc.f3369a;
                            abstractC0553e74.m1379s(false);
                        }
                        break;
                }
            }
        };
        final int i5 = 3;
        this.f2076s = new InterfaceC0294Q3(this) { // from class: a.c7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0553e7 f1880b;

            {
                this.f1880b = this;
            }

            @Override // p000a.InterfaceC0294Q3
            /* JADX INFO: renamed from: a */
            public final void mo747a(Object obj) {
                switch (i5) {
                    case 0:
                        AbstractC0553e7 abstractC0553e7 = this.f1880b;
                        if (abstractC0553e7.m1343L()) {
                            abstractC0553e7.m1369i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0553e7 abstractC0553e72 = this.f1880b;
                        if (abstractC0553e72.m1343L() && num.intValue() == 80) {
                            abstractC0553e72.m1373m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0956zb c0956zb = (C0956zb) obj;
                        AbstractC0553e7 abstractC0553e73 = this.f1880b;
                        if (abstractC0553e73.m1343L()) {
                            boolean z = c0956zb.f3565a;
                            abstractC0553e73.m1374n(false);
                        }
                        break;
                    default:
                        C0862uc c0862uc = (C0862uc) obj;
                        AbstractC0553e7 abstractC0553e74 = this.f1880b;
                        if (abstractC0553e74.m1343L()) {
                            boolean z2 = c0862uc.f3369a;
                            abstractC0553e74.m1379s(false);
                        }
                        break;
                }
            }
        };
        this.f2077t = new b();
        this.f2078u = -1;
        this.f2083z = new c();
        this.f2043A = new d();
        this.f2047E = new ArrayDeque<>();
        this.f2057O = new e();
    }

    /* JADX INFO: renamed from: E */
    public static HashSet m1329E(C0327S1 c0327s1) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < c0327s1.f3000a.size(); i2++) {
            ComponentCallbacksC1100b componentCallbacksC1100b = c0327s1.f3000a.get(i2).f3017b;
            if (componentCallbacksC1100b != null && c0327s1.f3006g) {
                hashSet.add(componentCallbacksC1100b);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m1330J(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m1331K(ComponentCallbacksC1100b componentCallbacksC1100b) {
        componentCallbacksC1100b.getClass();
        boolean zM1331K = false;
        for (ComponentCallbacksC1100b componentCallbacksC1100b2 : componentCallbacksC1100b.f4578v.f2060c.m26f()) {
            if (componentCallbacksC1100b2 != null) {
                zM1331K = m1331K(componentCallbacksC1100b2);
            }
            if (zM1331K) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m1332M(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (componentCallbacksC1100b == null) {
            return true;
        }
        if (componentCallbacksC1100b.f4540D) {
            return componentCallbacksC1100b.f4576t == null || m1332M(componentCallbacksC1100b.f4579w);
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public static boolean m1333N(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (componentCallbacksC1100b == null) {
            return true;
        }
        AbstractC0553e7 abstractC0553e7 = componentCallbacksC1100b.f4576t;
        return componentCallbacksC1100b.equals(abstractC0553e7.f2082y) && m1333N(abstractC0553e7.f2081x);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m1334c0(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (m1330J(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC1100b);
        }
        if (componentCallbacksC1100b.f4537A) {
            componentCallbacksC1100b.f4537A = false;
            componentCallbacksC1100b.f4547K = !componentCallbacksC1100b.f4547K;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m1335A(C0327S1 c0327s1, boolean z) {
        if (z && (this.f2079v == null || this.f2051I)) {
            return;
        }
        m1385y(z);
        c0327s1.mo902a(this.f2053K, this.f2054L);
        this.f2059b = true;
        try {
            m1350U(this.f2053K, this.f2054L);
            m1361d();
            m1366f0();
            if (this.f2052J) {
                this.f2052J = false;
                m1362d0();
            }
            ((HashMap) this.f2060c.f24b).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m1361d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0238 A[PHI: r14
  0x0238: PHI (r14v23 int) = (r14v22 int), (r14v24 int) binds: [B:106:0x0228, B:111:0x0234] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0180  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1336B(ArrayList<C0327S1> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        Object obj;
        AbstractC1104f.c.b bVar;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = 1;
        boolean z4 = arrayList.get(i10).f3014o;
        ArrayList<ComponentCallbacksC1100b> arrayList3 = this.f2055M;
        if (arrayList3 == null) {
            this.f2055M = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        ArrayList<ComponentCallbacksC1100b> arrayList4 = this.f2055M;
        C0003A2 c0003a2 = this.f2060c;
        arrayList4.addAll(c0003a2.m27g());
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f2082y;
        int i12 = i10;
        boolean z5 = false;
        while (i12 < i3) {
            C0327S1 c0327s1 = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                z = z4;
                i5 = i12;
                z2 = z5;
                int i13 = i11;
                ArrayList<ComponentCallbacksC1100b> arrayList5 = this.f2055M;
                ArrayList<AbstractC0762p7.a> arrayList6 = c0327s1.f3000a;
                int size = arrayList6.size() - i13;
                while (size >= 0) {
                    AbstractC0762p7.a aVar = arrayList6.get(size);
                    int i14 = aVar.f3016a;
                    if (i14 != i13) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 6:
                                    arrayList5.add(aVar.f3017b);
                                    break;
                                case 8:
                                    componentCallbacksC1100b = null;
                                    break;
                                case 9:
                                    componentCallbacksC1100b = aVar.f3017b;
                                    break;
                                case 10:
                                    aVar.f3024i = aVar.f3023h;
                                    break;
                            }
                        }
                        size--;
                        i13 = 1;
                    }
                    arrayList5.remove(aVar.f3017b);
                    size--;
                    i13 = 1;
                }
            } else {
                ArrayList<ComponentCallbacksC1100b> arrayList7 = this.f2055M;
                int i15 = 0;
                while (true) {
                    ArrayList<AbstractC0762p7.a> arrayList8 = c0327s1.f3000a;
                    if (i15 < arrayList8.size()) {
                        AbstractC0762p7.a aVar2 = arrayList8.get(i15);
                        boolean z6 = z4;
                        int i16 = aVar2.f3016a;
                        if (i16 != i11) {
                            i7 = i12;
                            if (i16 == 2) {
                                ComponentCallbacksC1100b componentCallbacksC1100b2 = aVar2.f3017b;
                                int i17 = componentCallbacksC1100b2.f4581y;
                                int size2 = arrayList7.size() - 1;
                                boolean z7 = false;
                                while (size2 >= 0) {
                                    int i18 = size2;
                                    ComponentCallbacksC1100b componentCallbacksC1100b3 = arrayList7.get(size2);
                                    boolean z8 = z5;
                                    if (componentCallbacksC1100b3.f4581y != i17) {
                                        i8 = i17;
                                    } else if (componentCallbacksC1100b3 == componentCallbacksC1100b2) {
                                        i8 = i17;
                                        z7 = true;
                                    } else {
                                        if (componentCallbacksC1100b3 == componentCallbacksC1100b) {
                                            i8 = i17;
                                            i9 = 0;
                                            arrayList8.add(i15, new AbstractC0762p7.a(9, componentCallbacksC1100b3, 0));
                                            i15++;
                                            componentCallbacksC1100b = null;
                                        } else {
                                            i8 = i17;
                                            i9 = 0;
                                        }
                                        AbstractC0762p7.a aVar3 = new AbstractC0762p7.a(3, componentCallbacksC1100b3, i9);
                                        aVar3.f3019d = aVar2.f3019d;
                                        aVar3.f3021f = aVar2.f3021f;
                                        aVar3.f3020e = aVar2.f3020e;
                                        aVar3.f3022g = aVar2.f3022g;
                                        arrayList8.add(i15, aVar3);
                                        arrayList7.remove(componentCallbacksC1100b3);
                                        i15++;
                                        componentCallbacksC1100b = componentCallbacksC1100b;
                                    }
                                    size2 = i18 - 1;
                                    i17 = i8;
                                    z5 = z8;
                                }
                                z3 = z5;
                                i6 = 1;
                                if (z7) {
                                    arrayList8.remove(i15);
                                    i15--;
                                } else {
                                    aVar2.f3016a = 1;
                                    aVar2.f3018c = true;
                                    arrayList7.add(componentCallbacksC1100b2);
                                }
                            } else if (i16 == 3 || i16 == 6) {
                                arrayList7.remove(aVar2.f3017b);
                                ComponentCallbacksC1100b componentCallbacksC1100b4 = aVar2.f3017b;
                                if (componentCallbacksC1100b4 == componentCallbacksC1100b) {
                                    arrayList8.add(i15, new AbstractC0762p7.a(9, componentCallbacksC1100b4));
                                    i15++;
                                    z3 = z5;
                                    i6 = 1;
                                    componentCallbacksC1100b = null;
                                } else {
                                    z3 = z5;
                                    i6 = 1;
                                }
                            } else if (i16 != 7) {
                                if (i16 == 8) {
                                    arrayList8.add(i15, new AbstractC0762p7.a(9, componentCallbacksC1100b, 0));
                                    aVar2.f3018c = true;
                                    i15++;
                                    componentCallbacksC1100b = aVar2.f3017b;
                                }
                                z3 = z5;
                                i6 = 1;
                            } else {
                                i6 = 1;
                            }
                            i15 += i6;
                            i11 = i6;
                            z4 = z6;
                            i12 = i7;
                            z5 = z3;
                        } else {
                            i6 = i11;
                            i7 = i12;
                        }
                        z3 = z5;
                        arrayList7.add(aVar2.f3017b);
                        i15 += i6;
                        i11 = i6;
                        z4 = z6;
                        i12 = i7;
                        z5 = z3;
                    } else {
                        z = z4;
                        i5 = i12;
                        z2 = z5;
                    }
                }
            }
            z5 = z2 || c0327s1.f3006g;
            i12 = i5 + 1;
            i11 = 1;
            z4 = z;
        }
        int i19 = i11;
        boolean z9 = z4;
        boolean z10 = z5;
        int i20 = -1;
        this.f2055M.clear();
        if (!z9 && this.f2078u >= i19) {
            for (int i21 = i10; i21 < i3; i21++) {
                Iterator<AbstractC0762p7.a> it = arrayList.get(i21).f3000a.iterator();
                while (it.hasNext()) {
                    ComponentCallbacksC1100b componentCallbacksC1100b5 = it.next().f3017b;
                    if (componentCallbacksC1100b5 != null && componentCallbacksC1100b5.f4576t != null) {
                        c0003a2.m28h(m1367g(componentCallbacksC1100b5));
                    }
                }
            }
        }
        int i22 = i10;
        while (i22 < i3) {
            C0327S1 c0327s12 = arrayList.get(i22);
            if (arrayList2.get(i22).booleanValue()) {
                c0327s12.m903c(i20);
                ArrayList<AbstractC0762p7.a> arrayList9 = c0327s12.f3000a;
                boolean z11 = true;
                for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                    AbstractC0762p7.a aVar4 = arrayList9.get(size3);
                    ComponentCallbacksC1100b componentCallbacksC1100b6 = aVar4.f3017b;
                    if (componentCallbacksC1100b6 != null) {
                        if (componentCallbacksC1100b6.f4546J != null) {
                            componentCallbacksC1100b6.m2529b().f4586a = z11;
                        }
                        int i23 = c0327s12.f3005f;
                        int i24 = 8194;
                        int i25 = 4097;
                        if (i23 != 4097) {
                            if (i23 != 8194) {
                                i24 = 4100;
                                i25 = 8197;
                                if (i23 != 8197) {
                                    i24 = i23 != 4099 ? i23 != 4100 ? 0 : i25 : 4099;
                                }
                            }
                        }
                        if (componentCallbacksC1100b6.f4546J != null || i24 != 0) {
                            componentCallbacksC1100b6.m2529b();
                            componentCallbacksC1100b6.f4546J.f4591f = i24;
                        }
                        componentCallbacksC1100b6.m2529b();
                        componentCallbacksC1100b6.f4546J.getClass();
                    }
                    int i26 = aVar4.f3016a;
                    AbstractC0553e7 abstractC0553e7 = c0327s12.f1161q;
                    switch (i26) {
                        case 1:
                            componentCallbacksC1100b6.m2527D(aVar4.f3019d, aVar4.f3020e, aVar4.f3021f, aVar4.f3022g);
                            z11 = true;
                            abstractC0553e7.m1354Y(componentCallbacksC1100b6, true);
                            abstractC0553e7.m1349T(componentCallbacksC1100b6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + aVar4.f3016a);
                        case 3:
                            componentCallbacksC1100b6.m2527D(aVar4.f3019d, aVar4.f3020e, aVar4.f3021f, aVar4.f3022g);
                            abstractC0553e7.m1356a(componentCallbacksC1100b6);
                            z11 = true;
                            break;
                        case 4:
                            componentCallbacksC1100b6.m2527D(aVar4.f3019d, aVar4.f3020e, aVar4.f3021f, aVar4.f3022g);
                            abstractC0553e7.getClass();
                            m1334c0(componentCallbacksC1100b6);
                            z11 = true;
                            break;
                        case 5:
                            componentCallbacksC1100b6.m2527D(aVar4.f3019d, aVar4.f3020e, aVar4.f3021f, aVar4.f3022g);
                            abstractC0553e7.m1354Y(componentCallbacksC1100b6, true);
                            abstractC0553e7.m1342I(componentCallbacksC1100b6);
                            z11 = true;
                            break;
                        case 6:
                            componentCallbacksC1100b6.m2527D(aVar4.f3019d, aVar4.f3020e, aVar4.f3021f, aVar4.f3022g);
                            abstractC0553e7.m1360c(componentCallbacksC1100b6);
                            z11 = true;
                            break;
                        case 7:
                            componentCallbacksC1100b6.m2527D(aVar4.f3019d, aVar4.f3020e, aVar4.f3021f, aVar4.f3022g);
                            abstractC0553e7.m1354Y(componentCallbacksC1100b6, true);
                            abstractC0553e7.m1368h(componentCallbacksC1100b6);
                            z11 = true;
                            break;
                        case 8:
                            abstractC0553e7.m1357a0(null);
                            z11 = true;
                            break;
                        case 9:
                            abstractC0553e7.m1357a0(componentCallbacksC1100b6);
                            z11 = true;
                            break;
                        case 10:
                            abstractC0553e7.m1355Z(componentCallbacksC1100b6, aVar4.f3023h);
                            z11 = true;
                            break;
                    }
                }
            } else {
                c0327s12.m903c(1);
                ArrayList<AbstractC0762p7.a> arrayList10 = c0327s12.f3000a;
                int size4 = arrayList10.size();
                int i27 = 0;
                while (i27 < size4) {
                    AbstractC0762p7.a aVar5 = arrayList10.get(i27);
                    ComponentCallbacksC1100b componentCallbacksC1100b7 = aVar5.f3017b;
                    if (componentCallbacksC1100b7 != null) {
                        if (componentCallbacksC1100b7.f4546J != null) {
                            componentCallbacksC1100b7.m2529b().f4586a = false;
                        }
                        int i28 = c0327s12.f3005f;
                        if (componentCallbacksC1100b7.f4546J != null || i28 != 0) {
                            componentCallbacksC1100b7.m2529b();
                            componentCallbacksC1100b7.f4546J.f4591f = i28;
                        }
                        componentCallbacksC1100b7.m2529b();
                        componentCallbacksC1100b7.f4546J.getClass();
                    }
                    int i29 = aVar5.f3016a;
                    AbstractC0553e7 abstractC0553e72 = c0327s12.f1161q;
                    switch (i29) {
                        case 1:
                            i4 = i22;
                            componentCallbacksC1100b7.m2527D(aVar5.f3019d, aVar5.f3020e, aVar5.f3021f, aVar5.f3022g);
                            abstractC0553e72.m1354Y(componentCallbacksC1100b7, false);
                            abstractC0553e72.m1356a(componentCallbacksC1100b7);
                            i27++;
                            i22 = i4;
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + aVar5.f3016a);
                        case 3:
                            i4 = i22;
                            componentCallbacksC1100b7.m2527D(aVar5.f3019d, aVar5.f3020e, aVar5.f3021f, aVar5.f3022g);
                            abstractC0553e72.m1349T(componentCallbacksC1100b7);
                            i27++;
                            i22 = i4;
                            break;
                        case 4:
                            i4 = i22;
                            componentCallbacksC1100b7.m2527D(aVar5.f3019d, aVar5.f3020e, aVar5.f3021f, aVar5.f3022g);
                            abstractC0553e72.m1342I(componentCallbacksC1100b7);
                            i27++;
                            i22 = i4;
                            break;
                        case 5:
                            i4 = i22;
                            componentCallbacksC1100b7.m2527D(aVar5.f3019d, aVar5.f3020e, aVar5.f3021f, aVar5.f3022g);
                            abstractC0553e72.m1354Y(componentCallbacksC1100b7, false);
                            m1334c0(componentCallbacksC1100b7);
                            i27++;
                            i22 = i4;
                            break;
                        case 6:
                            i4 = i22;
                            componentCallbacksC1100b7.m2527D(aVar5.f3019d, aVar5.f3020e, aVar5.f3021f, aVar5.f3022g);
                            abstractC0553e72.m1368h(componentCallbacksC1100b7);
                            i27++;
                            i22 = i4;
                            break;
                        case 7:
                            i4 = i22;
                            componentCallbacksC1100b7.m2527D(aVar5.f3019d, aVar5.f3020e, aVar5.f3021f, aVar5.f3022g);
                            abstractC0553e72.m1354Y(componentCallbacksC1100b7, false);
                            abstractC0553e72.m1360c(componentCallbacksC1100b7);
                            i27++;
                            i22 = i4;
                            break;
                        case 8:
                            abstractC0553e72.m1357a0(componentCallbacksC1100b7);
                            i4 = i22;
                            i27++;
                            i22 = i4;
                            break;
                        case 9:
                            abstractC0553e72.m1357a0(null);
                            i4 = i22;
                            i27++;
                            i22 = i4;
                            break;
                        case 10:
                            abstractC0553e72.m1355Z(componentCallbacksC1100b7, aVar5.f3024i);
                            i4 = i22;
                            i27++;
                            i22 = i4;
                            break;
                    }
                }
            }
            i22++;
            i20 = -1;
        }
        boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
        ArrayList<h> arrayList11 = this.f2070m;
        if (z10 && !arrayList11.isEmpty()) {
            LinkedHashSet<ComponentCallbacksC1100b> linkedHashSet = new LinkedHashSet();
            Iterator<C0327S1> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m1329E(it2.next()));
            }
            if (this.f2065h == null) {
                for (h hVar : arrayList11) {
                    for (ComponentCallbacksC1100b componentCallbacksC1100b8 : linkedHashSet) {
                        hVar.getClass();
                    }
                }
                for (h hVar2 : arrayList11) {
                    for (ComponentCallbacksC1100b componentCallbacksC1100b9 : linkedHashSet) {
                        hVar2.getClass();
                    }
                }
            }
        }
        for (int i30 = i10; i30 < i3; i30++) {
            C0327S1 c0327s13 = arrayList.get(i30);
            if (zBooleanValue) {
                for (int size5 = c0327s13.f3000a.size() - 1; size5 >= 0; size5--) {
                    ComponentCallbacksC1100b componentCallbacksC1100b10 = c0327s13.f3000a.get(size5).f3017b;
                    if (componentCallbacksC1100b10 != null) {
                        m1367g(componentCallbacksC1100b10).m2555k();
                    }
                }
            } else {
                Iterator<AbstractC0762p7.a> it3 = c0327s13.f3000a.iterator();
                while (it3.hasNext()) {
                    ComponentCallbacksC1100b componentCallbacksC1100b11 = it3.next().f3017b;
                    if (componentCallbacksC1100b11 != null) {
                        m1367g(componentCallbacksC1100b11).m2555k();
                    }
                }
            }
        }
        m1344O(this.f2078u, true);
        for (AbstractC1104f abstractC1104f : m1365f(arrayList, i10, i3)) {
            abstractC1104f.f4614d = zBooleanValue;
            synchronized (abstractC1104f.f4612b) {
                try {
                    abstractC1104f.m2571k();
                    ArrayList arrayList12 = abstractC1104f.f4612b;
                    ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object objPrevious = listIterator.previous();
                            AbstractC1104f.c cVar = (AbstractC1104f.c) objPrevious;
                            View view = cVar.f4621c.f4543G;
                            C0631i9.m1481d(view, "operation.fragment.mView");
                            if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                                bVar = AbstractC1104f.c.b.f4637d;
                            } else {
                                int visibility = view.getVisibility();
                                if (visibility == 0) {
                                    bVar = AbstractC1104f.c.b.f4635b;
                                } else if (visibility == 4) {
                                    bVar = AbstractC1104f.c.b.f4637d;
                                } else {
                                    if (visibility != 8) {
                                        throw new IllegalArgumentException("Unknown visibility " + visibility);
                                    }
                                    bVar = AbstractC1104f.c.b.f4636c;
                                }
                            }
                            AbstractC1104f.c.b bVar2 = cVar.f4619a;
                            AbstractC1104f.c.b bVar3 = AbstractC1104f.c.b.f4635b;
                            if (bVar2 == bVar3 && bVar != bVar3) {
                                obj = objPrevious;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    abstractC1104f.f4615e = false;
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            abstractC1104f.m2566e();
        }
        while (i10 < i3) {
            C0327S1 c0327s14 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && c0327s14.f1163s >= 0) {
                c0327s14.f1163s = -1;
            }
            if (c0327s14.f3015p != null) {
                for (int i31 = 0; i31 < c0327s14.f3015p.size(); i31++) {
                    c0327s14.f3015p.get(i31).run();
                }
                c0327s14.f3015p = null;
            }
            i10++;
        }
        if (z10) {
            for (int i32 = 0; i32 < arrayList11.size(); i32++) {
                arrayList11.get(i32).m1392a();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final ComponentCallbacksC1100b m1337C(int i2) {
        C0003A2 c0003a2 = this.f2060c;
        ArrayList arrayList = (ArrayList) c0003a2.f23a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ComponentCallbacksC1100b componentCallbacksC1100b = (ComponentCallbacksC1100b) arrayList.get(size);
            if (componentCallbacksC1100b != null && componentCallbacksC1100b.f4580x == i2) {
                return componentCallbacksC1100b;
            }
        }
        for (C1103e c1103e : ((HashMap) c0003a2.f24b).values()) {
            if (c1103e != null) {
                ComponentCallbacksC1100b componentCallbacksC1100b2 = c1103e.f4607c;
                if (componentCallbacksC1100b2.f4580x == i2) {
                    return componentCallbacksC1100b2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final void m1338D() {
        for (AbstractC1104f abstractC1104f : m1363e()) {
            if (abstractC1104f.f4615e) {
                if (m1330J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                abstractC1104f.f4615e = false;
                abstractC1104f.m2566e();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final ViewGroup m1339F(ComponentCallbacksC1100b componentCallbacksC1100b) {
        ViewGroup viewGroup = componentCallbacksC1100b.f4542F;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC1100b.f4581y <= 0 || !this.f2080w.mo1068f()) {
            return null;
        }
        View viewMo1067c = this.f2080w.mo1067c(componentCallbacksC1100b.f4581y);
        if (viewMo1067c instanceof ViewGroup) {
            return (ViewGroup) viewMo1067c;
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final C1102d m1340G() {
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f2081x;
        return componentCallbacksC1100b != null ? componentCallbacksC1100b.f4576t.m1340G() : this.f2083z;
    }

    /* JADX INFO: renamed from: H */
    public final InterfaceC0788qe m1341H() {
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f2081x;
        return componentCallbacksC1100b != null ? componentCallbacksC1100b.f4576t.m1341H() : this.f2043A;
    }

    /* JADX INFO: renamed from: I */
    public final void m1342I(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (m1330J(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC1100b);
        }
        if (componentCallbacksC1100b.f4537A) {
            return;
        }
        componentCallbacksC1100b.f4537A = true;
        componentCallbacksC1100b.f4547K = true ^ componentCallbacksC1100b.f4547K;
        m1359b0(componentCallbacksC1100b);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m1343L() {
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f2081x;
        if (componentCallbacksC1100b == null) {
            return true;
        }
        return componentCallbacksC1100b.m2536i() && this.f2081x.m2533f().m1343L();
    }

    /* JADX INFO: renamed from: O */
    public final void m1344O(int i2, boolean z) {
        HashMap map;
        ActivityC0422X6.a aVar;
        if (this.f2079v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f2078u) {
            this.f2078u = i2;
            C0003A2 c0003a2 = this.f2060c;
            Iterator it = ((ArrayList) c0003a2.f23a).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) c0003a2.f24b;
                if (!zHasNext) {
                    break;
                }
                C1103e c1103e = (C1103e) map.get(((ComponentCallbacksC1100b) it.next()).f4561e);
                if (c1103e != null) {
                    c1103e.m2555k();
                }
            }
            for (C1103e c1103e2 : map.values()) {
                if (c1103e2 != null) {
                    c1103e2.m2555k();
                    ComponentCallbacksC1100b componentCallbacksC1100b = c1103e2.f4607c;
                    if (componentCallbacksC1100b.f4568l && !componentCallbacksC1100b.m2538k()) {
                        c0003a2.m29i(c1103e2);
                    }
                }
            }
            m1362d0();
            if (this.f2048F && (aVar = this.f2079v) != null && this.f2078u == 7) {
                ActivityC0422X6.this.invalidateMenu();
                this.f2048F = false;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m1345P() {
        if (this.f2079v == null) {
            return;
        }
        this.f2049G = false;
        this.f2050H = false;
        this.f2056N.f2494i = false;
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null) {
                componentCallbacksC1100b.f4578v.m1345P();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m1346Q() {
        return m1347R(-1, 0);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m1347R(int i2, int i3) {
        m1386z(false);
        m1385y(true);
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f2082y;
        if (componentCallbacksC1100b != null && i2 < 0 && componentCallbacksC1100b.m2530c().m1346Q()) {
            return true;
        }
        boolean zM1348S = m1348S(this.f2053K, this.f2054L, i2, i3);
        if (zM1348S) {
            this.f2059b = true;
            try {
                m1350U(this.f2053K, this.f2054L);
            } finally {
                m1361d();
            }
        }
        m1366f0();
        if (this.f2052J) {
            this.f2052J = false;
            m1362d0();
        }
        ((HashMap) this.f2060c.f24b).values().removeAll(Collections.singleton(null));
        return zM1348S;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m1348S(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z = (i3 & 1) != 0;
        int size = -1;
        if (!this.f2061d.isEmpty()) {
            if (i2 < 0) {
                size = z ? 0 : this.f2061d.size() - 1;
            } else {
                int size2 = this.f2061d.size() - 1;
                while (size2 >= 0) {
                    C0327S1 c0327s1 = this.f2061d.get(size2);
                    if (i2 >= 0 && i2 == c0327s1.f1163s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C0327S1 c0327s12 = this.f2061d.get(size - 1);
                        if (i2 < 0 || i2 != c0327s12.f1163s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f2061d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f2061d.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.f2061d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public final void m1349T(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (m1330J(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC1100b + " nesting=" + componentCallbacksC1100b.f4575s);
        }
        boolean zM2538k = componentCallbacksC1100b.m2538k();
        if (componentCallbacksC1100b.f4538B && zM2538k) {
            return;
        }
        C0003A2 c0003a2 = this.f2060c;
        synchronized (((ArrayList) c0003a2.f23a)) {
            ((ArrayList) c0003a2.f23a).remove(componentCallbacksC1100b);
        }
        componentCallbacksC1100b.f4567k = false;
        if (m1331K(componentCallbacksC1100b)) {
            this.f2048F = true;
        }
        componentCallbacksC1100b.f4568l = true;
        m1359b0(componentCallbacksC1100b);
    }

    /* JADX INFO: renamed from: U */
    public final void m1350U(ArrayList<C0327S1> arrayList, ArrayList<Boolean> arrayList2) {
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
            if (!arrayList.get(i2).f3014o) {
                if (i3 != i2) {
                    m1336B(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f3014o) {
                        i3++;
                    }
                }
                m1336B(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m1336B(arrayList, arrayList2, i3, size);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m1351V(Bundle bundle) {
        int i2;
        C0496b7 c0496b7;
        int i3;
        C1103e c1103e;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f2079v.f1723b.getClassLoader());
                this.f2069l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f2079v.f1723b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C0003A2 c0003a2 = this.f2060c;
        HashMap map2 = (HashMap) c0003a2.f25c;
        map2.clear();
        map2.putAll(map);
        C0648j7 c0648j7 = (C0648j7) bundle.getParcelable("state");
        if (c0648j7 == null) {
            return;
        }
        HashMap map3 = (HashMap) c0003a2.f24b;
        map3.clear();
        Iterator<String> it = c0648j7.f2393a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i2 = 2;
            c0496b7 = this.f2071n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM30j = c0003a2.m30j(it.next(), null);
            if (bundleM30j != null) {
                ComponentCallbacksC1100b componentCallbacksC1100b = this.f2056N.f2489d.get(((C0724n7) bundleM30j.getParcelable("state")).f2831b);
                if (componentCallbacksC1100b != null) {
                    if (m1330J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC1100b);
                    }
                    c1103e = new C1103e(c0496b7, c0003a2, componentCallbacksC1100b, bundleM30j);
                } else {
                    c1103e = new C1103e(this.f2071n, this.f2060c, this.f2079v.f1723b.getClassLoader(), m1340G(), bundleM30j);
                }
                ComponentCallbacksC1100b componentCallbacksC1100b2 = c1103e.f4607c;
                componentCallbacksC1100b2.f4558b = bundleM30j;
                componentCallbacksC1100b2.f4576t = this;
                if (m1330J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC1100b2.f4561e + "): " + componentCallbacksC1100b2);
                }
                c1103e.m2557m(this.f2079v.f1723b.getClassLoader());
                c0003a2.m28h(c1103e);
                c1103e.f4609e = this.f2078u;
            }
        }
        C0667k7 c0667k7 = this.f2056N;
        c0667k7.getClass();
        for (ComponentCallbacksC1100b componentCallbacksC1100b3 : new ArrayList(c0667k7.f2489d.values())) {
            if (map3.get(componentCallbacksC1100b3.f4561e) == null) {
                if (m1330J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC1100b3 + " that was not found in the set of active Fragments " + c0648j7.f2393a);
                }
                this.f2056N.m1541f(componentCallbacksC1100b3);
                componentCallbacksC1100b3.f4576t = this;
                C1103e c1103e2 = new C1103e(c0496b7, c0003a2, componentCallbacksC1100b3);
                c1103e2.f4609e = 1;
                c1103e2.m2555k();
                componentCallbacksC1100b3.f4568l = true;
                c1103e2.m2555k();
            }
        }
        ArrayList<String> arrayList = c0648j7.f2394b;
        ((ArrayList) c0003a2.f23a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                ComponentCallbacksC1100b componentCallbacksC1100bM23c = c0003a2.m23c(str3);
                if (componentCallbacksC1100bM23c == null) {
                    throw new IllegalStateException(C0944z.m2227g("No instantiated fragment for (", str3, ")"));
                }
                if (m1330J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + componentCallbacksC1100bM23c);
                }
                c0003a2.m21a(componentCallbacksC1100bM23c);
            }
        }
        if (c0648j7.f2395c != null) {
            this.f2061d = new ArrayList<>(c0648j7.f2395c.length);
            int i4 = 0;
            while (true) {
                C0345T1[] c0345t1Arr = c0648j7.f2395c;
                if (i4 >= c0345t1Arr.length) {
                    break;
                }
                C0345T1 c0345t1 = c0345t1Arr[i4];
                c0345t1.getClass();
                C0327S1 c0327s1 = new C0327S1(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = c0345t1.f1209a;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    AbstractC0762p7.a aVar = new AbstractC0762p7.a();
                    int i7 = i5 + 1;
                    int i8 = i2;
                    aVar.f3016a = iArr[i5];
                    if (m1330J(i8)) {
                        Log.v("FragmentManager", "Instantiate " + c0327s1 + " op #" + i6 + " base fragment #" + iArr[i7]);
                    }
                    aVar.f3023h = AbstractC1116e.b.values()[c0345t1.f1211c[i6]];
                    aVar.f3024i = AbstractC1116e.b.values()[c0345t1.f1212d[i6]];
                    int i9 = i5 + 2;
                    aVar.f3018c = iArr[i7] != 0;
                    int i10 = iArr[i9];
                    aVar.f3019d = i10;
                    int i11 = iArr[i5 + 3];
                    aVar.f3020e = i11;
                    int i12 = i5 + 5;
                    int i13 = iArr[i5 + 4];
                    aVar.f3021f = i13;
                    i5 += 6;
                    int i14 = iArr[i12];
                    aVar.f3022g = i14;
                    c0327s1.f3001b = i10;
                    c0327s1.f3002c = i11;
                    c0327s1.f3003d = i13;
                    c0327s1.f3004e = i14;
                    c0327s1.m1801b(aVar);
                    i6++;
                    i2 = i8;
                }
                int i15 = i2;
                c0327s1.f3005f = c0345t1.f1213e;
                c0327s1.f3007h = c0345t1.f1214f;
                c0327s1.f3006g = true;
                c0327s1.f3008i = c0345t1.f1216h;
                c0327s1.f3009j = c0345t1.f1217i;
                c0327s1.f3010k = c0345t1.f1218j;
                c0327s1.f3011l = c0345t1.f1219k;
                c0327s1.f3012m = c0345t1.f1220l;
                c0327s1.f3013n = c0345t1.f1221m;
                c0327s1.f3014o = c0345t1.f1222n;
                c0327s1.f1163s = c0345t1.f1215g;
                int i16 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = c0345t1.f1210b;
                    if (i16 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i16);
                    if (str4 != null) {
                        c0327s1.f3000a.get(i16).f3017b = c0003a2.m23c(str4);
                    }
                    i16++;
                }
                c0327s1.m903c(1);
                if (m1330J(i15)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + c0327s1.f1163s + "): " + c0327s1);
                    PrintWriter printWriter = new PrintWriter(new C0228M9());
                    c0327s1.m906f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2061d.add(c0327s1);
                i4++;
                i2 = i15;
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.f2061d = new ArrayList<>();
        }
        this.f2067j.set(c0648j7.f2396d);
        String str5 = c0648j7.f2397e;
        if (str5 != null) {
            ComponentCallbacksC1100b componentCallbacksC1100bM23c2 = c0003a2.m23c(str5);
            this.f2082y = componentCallbacksC1100bM23c2;
            m1378r(componentCallbacksC1100bM23c2);
        }
        ArrayList<String> arrayList3 = c0648j7.f2398f;
        if (arrayList3 != null) {
            for (int i17 = i3; i17 < arrayList3.size(); i17++) {
                this.f2068k.put(arrayList3.get(i17), c0648j7.f2399g.get(i17));
            }
        }
        this.f2047E = new ArrayDeque<>(c0648j7.f2400h);
    }

    /* JADX INFO: renamed from: W */
    public final Bundle m1352W() {
        int i2;
        C0345T1[] c0345t1Arr;
        ArrayList<String> arrayList;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        m1338D();
        m1383w();
        m1386z(true);
        this.f2049G = true;
        this.f2056N.f2494i = true;
        C0003A2 c0003a2 = this.f2060c;
        c0003a2.getClass();
        HashMap map = (HashMap) c0003a2.f24b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1103e c1103e = (C1103e) it.next();
            if (c1103e != null) {
                ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
                String str = componentCallbacksC1100b.f4561e;
                Bundle bundle3 = new Bundle();
                ComponentCallbacksC1100b componentCallbacksC1100b2 = c1103e.f4607c;
                if (componentCallbacksC1100b2.f4557a == -1 && (bundle = componentCallbacksC1100b2.f4558b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new C0724n7(componentCallbacksC1100b2));
                if (componentCallbacksC1100b2.f4557a > -1) {
                    Bundle bundle4 = new Bundle();
                    componentCallbacksC1100b2.mo996t(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c1103e.f4605a.m1222j(componentCallbacksC1100b2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    componentCallbacksC1100b2.f4554R.m547c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM1352W = componentCallbacksC1100b2.f4578v.m1352W();
                    if (!bundleM1352W.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM1352W);
                    }
                    if (componentCallbacksC1100b2.f4543G != null) {
                        c1103e.m2559o();
                    }
                    SparseArray<Parcelable> sparseArray = componentCallbacksC1100b2.f4559c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = componentCallbacksC1100b2.f4560d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = componentCallbacksC1100b2.f4562f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c0003a2.m30j(str, bundle3);
                arrayList2.add(componentCallbacksC1100b.f4561e);
                if (m1330J(2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC1100b + ": " + componentCallbacksC1100b.f4558b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f2060c.f25c;
        if (!map2.isEmpty()) {
            C0003A2 c0003a22 = this.f2060c;
            synchronized (((ArrayList) c0003a22.f23a)) {
                try {
                    c0345t1Arr = null;
                    if (((ArrayList) c0003a22.f23a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(((ArrayList) c0003a22.f23a).size());
                        for (ComponentCallbacksC1100b componentCallbacksC1100b3 : (ArrayList) c0003a22.f23a) {
                            arrayList.add(componentCallbacksC1100b3.f4561e);
                            if (m1330J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + componentCallbacksC1100b3.f4561e + "): " + componentCallbacksC1100b3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f2061d.size();
            if (size > 0) {
                c0345t1Arr = new C0345T1[size];
                for (i2 = 0; i2 < size; i2++) {
                    c0345t1Arr[i2] = new C0345T1(this.f2061d.get(i2));
                    if (m1330J(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f2061d.get(i2));
                    }
                }
            }
            C0648j7 c0648j7 = new C0648j7();
            c0648j7.f2393a = arrayList2;
            c0648j7.f2394b = arrayList;
            c0648j7.f2395c = c0345t1Arr;
            c0648j7.f2396d = this.f2067j.get();
            ComponentCallbacksC1100b componentCallbacksC1100b4 = this.f2082y;
            if (componentCallbacksC1100b4 != null) {
                c0648j7.f2397e = componentCallbacksC1100b4.f4561e;
            }
            c0648j7.f2398f.addAll(this.f2068k.keySet());
            c0648j7.f2399g.addAll(this.f2068k.values());
            c0648j7.f2400h = new ArrayList<>(this.f2047E);
            bundle2.putParcelable("state", c0648j7);
            for (String str2 : this.f2069l.keySet()) {
                bundle2.putBundle(C0944z.m2231k("result_", str2), this.f2069l.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(C0944z.m2231k("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (m1330J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: X */
    public final void m1353X() {
        synchronized (this.f2058a) {
            try {
                if (this.f2058a.size() == 1) {
                    this.f2079v.f1724c.removeCallbacks(this.f2057O);
                    this.f2079v.f1724c.post(this.f2057O);
                    m1366f0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m1354Y(ComponentCallbacksC1100b componentCallbacksC1100b, boolean z) {
        ViewGroup viewGroupM1339F = m1339F(componentCallbacksC1100b);
        if (viewGroupM1339F == null || !(viewGroupM1339F instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM1339F).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: Z */
    public final void m1355Z(ComponentCallbacksC1100b componentCallbacksC1100b, AbstractC1116e.b bVar) {
        if (componentCallbacksC1100b.equals(this.f2060c.m23c(componentCallbacksC1100b.f4561e)) && (componentCallbacksC1100b.f4577u == null || componentCallbacksC1100b.f4576t == this)) {
            componentCallbacksC1100b.f4550N = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC1100b + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: a */
    public final C1103e m1356a(ComponentCallbacksC1100b componentCallbacksC1100b) {
        String str = componentCallbacksC1100b.f4549M;
        if (str != null) {
            C0743o7.m1764c(componentCallbacksC1100b, str);
        }
        if (m1330J(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC1100b);
        }
        C1103e c1103eM1367g = m1367g(componentCallbacksC1100b);
        componentCallbacksC1100b.f4576t = this;
        C0003A2 c0003a2 = this.f2060c;
        c0003a2.m28h(c1103eM1367g);
        if (!componentCallbacksC1100b.f4538B) {
            c0003a2.m21a(componentCallbacksC1100b);
            componentCallbacksC1100b.f4568l = false;
            if (componentCallbacksC1100b.f4543G == null) {
                componentCallbacksC1100b.f4547K = false;
            }
            if (m1331K(componentCallbacksC1100b)) {
                this.f2048F = true;
            }
        }
        return c1103eM1367g;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1357a0(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (componentCallbacksC1100b != null) {
            if (!componentCallbacksC1100b.equals(this.f2060c.m23c(componentCallbacksC1100b.f4561e)) || (componentCallbacksC1100b.f4577u != null && componentCallbacksC1100b.f4576t != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC1100b + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC1100b componentCallbacksC1100b2 = this.f2082y;
        this.f2082y = componentCallbacksC1100b;
        m1378r(componentCallbacksC1100b2);
        m1378r(this.f2082y);
    }

    /* JADX INFO: renamed from: b */
    public final void m1358b(ActivityC0422X6.a aVar, AbstractC0472a2 abstractC0472a2, ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (this.f2079v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2079v = aVar;
        this.f2080w = abstractC0472a2;
        this.f2081x = componentCallbacksC1100b;
        CopyOnWriteArrayList<InterfaceC0686l7> copyOnWriteArrayList = this.f2072o;
        if (componentCallbacksC1100b != null) {
            copyOnWriteArrayList.add(new C0572f7(componentCallbacksC1100b));
        } else if (aVar != null) {
            copyOnWriteArrayList.add(aVar);
        }
        if (this.f2081x != null) {
            m1366f0();
        }
        if (aVar != null) {
            OnBackPressedDispatcher onBackPressedDispatcher = aVar.getOnBackPressedDispatcher();
            this.f2064g = onBackPressedDispatcher;
            onBackPressedDispatcher.m2282a(componentCallbacksC1100b != null ? componentCallbacksC1100b : aVar, this.f2066i);
        }
        if (componentCallbacksC1100b != null) {
            C0667k7 c0667k7 = componentCallbacksC1100b.f4576t.f2056N;
            HashMap<String, C0667k7> map = c0667k7.f2490e;
            C0667k7 c0667k72 = map.get(componentCallbacksC1100b.f4561e);
            if (c0667k72 == null) {
                c0667k72 = new C0667k7(c0667k7.f2492g);
                map.put(componentCallbacksC1100b.f4561e, c0667k72);
            }
            this.f2056N = c0667k72;
        } else if (aVar != null) {
            C1133q c1133q = new C1133q(aVar.getViewModelStore(), C0667k7.f2488j);
            String canonicalName = C0667k7.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f2056N = (C0667k7) c1133q.m2615a(C0667k7.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.f2056N = new C0667k7(false);
        }
        C0667k7 c0667k73 = this.f2056N;
        c0667k73.f2494i = this.f2049G || this.f2050H;
        this.f2060c.f26d = c0667k73;
        ActivityC0422X6.a aVar2 = this.f2079v;
        if (aVar2 != null && componentCallbacksC1100b == null) {
            C1224a savedStateRegistry = aVar2.getSavedStateRegistry();
            savedStateRegistry.m3009c("android:support:fragments", new C0023B3(2, this));
            Bundle bundleM3007a = savedStateRegistry.m3007a("android:support:fragments");
            if (bundleM3007a != null) {
                m1351V(bundleM3007a);
            }
        }
        ActivityC0422X6.a aVar3 = this.f2079v;
        if (aVar3 != null) {
            AbstractC0981a activityResultRegistry = aVar3.getActivityResultRegistry();
            String strM2231k = C0944z.m2231k("FragmentManager:", componentCallbacksC1100b != null ? C0944z.m2228h(new StringBuilder(), componentCallbacksC1100b.f4561e, ":") : "");
            this.f2044B = activityResultRegistry.m2293d(C0944z.m2226f(strM2231k, "StartActivityForResult"), new C0470a0(), new C0591g7(this));
            this.f2045C = activityResultRegistry.m2293d(C0944z.m2226f(strM2231k, "StartIntentSenderForResult"), new f(), new C0610h7(this));
            this.f2046D = activityResultRegistry.m2293d(C0944z.m2226f(strM2231k, "RequestPermissions"), new C0451Z(), new C0534d7(this));
        }
        ActivityC0422X6.a aVar4 = this.f2079v;
        if (aVar4 != null) {
            aVar4.addOnConfigurationChangedListener(this.f2073p);
        }
        ActivityC0422X6.a aVar5 = this.f2079v;
        if (aVar5 != null) {
            aVar5.addOnTrimMemoryListener(this.f2074q);
        }
        ActivityC0422X6.a aVar6 = this.f2079v;
        if (aVar6 != null) {
            aVar6.addOnMultiWindowModeChangedListener(this.f2075r);
        }
        ActivityC0422X6.a aVar7 = this.f2079v;
        if (aVar7 != null) {
            aVar7.addOnPictureInPictureModeChangedListener(this.f2076s);
        }
        ActivityC0422X6.a aVar8 = this.f2079v;
        if (aVar8 == null || componentCallbacksC1100b != null) {
            return;
        }
        aVar8.addMenuProvider(this.f2077t);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1359b0(ComponentCallbacksC1100b componentCallbacksC1100b) {
        ViewGroup viewGroupM1339F = m1339F(componentCallbacksC1100b);
        if (viewGroupM1339F != null) {
            ComponentCallbacksC1100b.d dVar = componentCallbacksC1100b.f4546J;
            if ((dVar == null ? 0 : dVar.f4590e) + (dVar == null ? 0 : dVar.f4589d) + (dVar == null ? 0 : dVar.f4588c) + (dVar == null ? 0 : dVar.f4587b) > 0) {
                if (viewGroupM1339F.getTag(C1098R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM1339F.setTag(C1098R.id.visible_removing_fragment_view_tag, componentCallbacksC1100b);
                }
                ComponentCallbacksC1100b componentCallbacksC1100b2 = (ComponentCallbacksC1100b) viewGroupM1339F.getTag(C1098R.id.visible_removing_fragment_view_tag);
                ComponentCallbacksC1100b.d dVar2 = componentCallbacksC1100b.f4546J;
                boolean z = dVar2 != null ? dVar2.f4586a : false;
                if (componentCallbacksC1100b2.f4546J == null) {
                    return;
                }
                componentCallbacksC1100b2.m2529b().f4586a = z;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1360c(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (m1330J(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC1100b);
        }
        if (componentCallbacksC1100b.f4538B) {
            componentCallbacksC1100b.f4538B = false;
            if (componentCallbacksC1100b.f4567k) {
                return;
            }
            this.f2060c.m21a(componentCallbacksC1100b);
            if (m1330J(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC1100b);
            }
            if (m1331K(componentCallbacksC1100b)) {
                this.f2048F = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1361d() {
        this.f2059b = false;
        this.f2054L.clear();
        this.f2053K.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1362d0() {
        for (C1103e c1103e : this.f2060c.m25e()) {
            ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
            if (componentCallbacksC1100b.f4544H) {
                if (this.f2059b) {
                    this.f2052J = true;
                } else {
                    componentCallbacksC1100b.f4544H = false;
                    c1103e.m2555k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m1363e() {
        Object c1099a;
        HashSet hashSet = new HashSet();
        Iterator it = this.f2060c.m25e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C1103e) it.next()).f4607c.f4542F;
            if (viewGroup != null) {
                C0631i9.m1482e(m1341H(), "factory");
                Object tag = viewGroup.getTag(C1098R.id.special_effects_controller_view_tag);
                if (tag instanceof AbstractC1104f) {
                    c1099a = (AbstractC1104f) tag;
                } else {
                    c1099a = new C1099a(viewGroup);
                    viewGroup.setTag(C1098R.id.special_effects_controller_view_tag, c1099a);
                }
                hashSet.add(c1099a);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m1364e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0228M9());
        ActivityC0422X6.a aVar = this.f2079v;
        if (aVar == null) {
            try {
                m1382v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            ActivityC0422X6.this.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: f */
    public final HashSet m1365f(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<AbstractC0762p7.a> it = ((C0327S1) arrayList.get(i2)).f3000a.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC1100b componentCallbacksC1100b = it.next().f3017b;
                if (componentCallbacksC1100b != null && (viewGroup = componentCallbacksC1100b.f4542F) != null) {
                    hashSet.add(AbstractC1104f.m2562i(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [a.S7, a.s7] */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.S7, a.s7] */
    /* JADX INFO: renamed from: f0 */
    public final void m1366f0() {
        synchronized (this.f2058a) {
            try {
                if (!this.f2058a.isEmpty()) {
                    a aVar = this.f2066i;
                    aVar.f1395a = true;
                    ?? r2 = aVar.f1397c;
                    if (r2 != 0) {
                        r2.mo31a();
                    }
                    if (m1330J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.f2061d.size() + (this.f2065h != null ? 1 : 0) > 0 && m1333N(this.f2081x);
                if (m1330J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                a aVar2 = this.f2066i;
                aVar2.f1395a = z;
                ?? r0 = aVar2.f1397c;
                if (r0 != 0) {
                    r0.mo31a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final C1103e m1367g(ComponentCallbacksC1100b componentCallbacksC1100b) {
        String str = componentCallbacksC1100b.f4561e;
        C0003A2 c0003a2 = this.f2060c;
        C1103e c1103e = (C1103e) ((HashMap) c0003a2.f24b).get(str);
        if (c1103e != null) {
            return c1103e;
        }
        C1103e c1103e2 = new C1103e(this.f2071n, c0003a2, componentCallbacksC1100b);
        c1103e2.m2557m(this.f2079v.f1723b.getClassLoader());
        c1103e2.f4609e = this.f2078u;
        return c1103e2;
    }

    /* JADX INFO: renamed from: h */
    public final void m1368h(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (m1330J(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC1100b);
        }
        if (componentCallbacksC1100b.f4538B) {
            return;
        }
        componentCallbacksC1100b.f4538B = true;
        if (componentCallbacksC1100b.f4567k) {
            if (m1330J(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC1100b);
            }
            C0003A2 c0003a2 = this.f2060c;
            synchronized (((ArrayList) c0003a2.f23a)) {
                ((ArrayList) c0003a2.f23a).remove(componentCallbacksC1100b);
            }
            componentCallbacksC1100b.f4567k = false;
            if (m1331K(componentCallbacksC1100b)) {
                this.f2048F = true;
            }
            m1359b0(componentCallbacksC1100b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1369i(boolean z) {
        if (z && this.f2079v != null) {
            m1364e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null) {
                componentCallbacksC1100b.f4541E = true;
                if (z) {
                    componentCallbacksC1100b.f4578v.m1369i(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1370j() {
        if (this.f2078u < 1) {
            return false;
        }
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null) {
                if (!componentCallbacksC1100b.f4537A ? componentCallbacksC1100b.f4578v.m1370j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1371k() {
        if (this.f2078u < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC1100b> arrayList = null;
        boolean z = false;
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null && m1332M(componentCallbacksC1100b)) {
                if (!componentCallbacksC1100b.f4537A ? componentCallbacksC1100b.f4578v.m1371k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(componentCallbacksC1100b);
                    z = true;
                }
            }
        }
        if (this.f2062e != null) {
            for (int i2 = 0; i2 < this.f2062e.size(); i2++) {
                ComponentCallbacksC1100b componentCallbacksC1100b2 = this.f2062e.get(i2);
                if (arrayList == null || !arrayList.contains(componentCallbacksC1100b2)) {
                    componentCallbacksC1100b2.getClass();
                }
            }
        }
        this.f2062e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: l */
    public final void m1372l() {
        boolean zIsChangingConfigurations = true;
        this.f2051I = true;
        m1386z(true);
        m1383w();
        ActivityC0422X6.a aVar = this.f2079v;
        C0003A2 c0003a2 = this.f2060c;
        if (aVar != null) {
            zIsChangingConfigurations = ((C0667k7) c0003a2.f26d).f2493h;
        } else {
            ActivityC0422X6 activityC0422X6 = aVar.f1723b;
            if (activityC0422X6 != null) {
                zIsChangingConfigurations = true ^ activityC0422X6.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<C0363U1> it = this.f2068k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = it.next().f1362a.iterator();
                while (it2.hasNext()) {
                    ((C0667k7) c0003a2.f26d).m1539d((String) it2.next(), false);
                }
            }
        }
        m1381u(-1);
        ActivityC0422X6.a aVar2 = this.f2079v;
        if (aVar2 != null) {
            aVar2.removeOnTrimMemoryListener(this.f2074q);
        }
        ActivityC0422X6.a aVar3 = this.f2079v;
        if (aVar3 != null) {
            aVar3.removeOnConfigurationChangedListener(this.f2073p);
        }
        ActivityC0422X6.a aVar4 = this.f2079v;
        if (aVar4 != null) {
            aVar4.removeOnMultiWindowModeChangedListener(this.f2075r);
        }
        ActivityC0422X6.a aVar5 = this.f2079v;
        if (aVar5 != null) {
            aVar5.removeOnPictureInPictureModeChangedListener(this.f2076s);
        }
        ActivityC0422X6.a aVar6 = this.f2079v;
        if (aVar6 != null && this.f2081x == null) {
            aVar6.removeMenuProvider(this.f2077t);
        }
        this.f2079v = null;
        this.f2080w = null;
        this.f2081x = null;
        if (this.f2064g != null) {
            Iterator<InterfaceC0185K2> it3 = this.f2066i.f1396b.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
            this.f2064g = null;
        }
        C0527d0 c0527d0 = this.f2044B;
        if (c0527d0 != null) {
            c0527d0.f1917c.m2295f(c0527d0.f1915a);
            C0527d0 c0527d02 = this.f2045C;
            c0527d02.f1917c.m2295f(c0527d02.f1915a);
            C0527d0 c0527d03 = this.f2046D;
            c0527d03.f1917c.m2295f(c0527d03.f1915a);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1373m(boolean z) {
        if (z && this.f2079v != null) {
            m1364e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null) {
                componentCallbacksC1100b.f4541E = true;
                if (z) {
                    componentCallbacksC1100b.f4578v.m1373m(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1374n(boolean z) {
        if (z && this.f2079v != null) {
            m1364e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null && z) {
                componentCallbacksC1100b.f4578v.m1374n(true);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1375o() {
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m26f()) {
            if (componentCallbacksC1100b != null) {
                componentCallbacksC1100b.m2537j();
                componentCallbacksC1100b.f4578v.m1375o();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1376p() {
        if (this.f2078u >= 1) {
            for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
                if (componentCallbacksC1100b != null) {
                    if (!componentCallbacksC1100b.f4537A ? componentCallbacksC1100b.f4578v.m1376p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m1377q() {
        if (this.f2078u < 1) {
            return;
        }
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null && !componentCallbacksC1100b.f4537A) {
                componentCallbacksC1100b.f4578v.m1377q();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1378r(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (componentCallbacksC1100b != null) {
            if (componentCallbacksC1100b.equals(this.f2060c.m23c(componentCallbacksC1100b.f4561e))) {
                componentCallbacksC1100b.f4576t.getClass();
                boolean zM1333N = m1333N(componentCallbacksC1100b);
                Boolean bool = componentCallbacksC1100b.f4566j;
                if (bool == null || bool.booleanValue() != zM1333N) {
                    componentCallbacksC1100b.f4566j = Boolean.valueOf(zM1333N);
                    C0629i7 c0629i7 = componentCallbacksC1100b.f4578v;
                    c0629i7.m1366f0();
                    c0629i7.m1378r(c0629i7.f2082y);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1379s(boolean z) {
        if (z && this.f2079v != null) {
            m1364e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null && z) {
                componentCallbacksC1100b.f4578v.m1379s(true);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1380t() {
        if (this.f2078u < 1) {
            return false;
        }
        boolean z = false;
        for (ComponentCallbacksC1100b componentCallbacksC1100b : this.f2060c.m27g()) {
            if (componentCallbacksC1100b != null && m1332M(componentCallbacksC1100b)) {
                if (!componentCallbacksC1100b.f4537A ? componentCallbacksC1100b.f4578v.m1380t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f2081x;
        if (componentCallbacksC1100b != null) {
            sb.append(componentCallbacksC1100b.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2081x)));
            sb.append("}");
        } else if (this.f2079v != null) {
            sb.append(ActivityC0422X6.a.class.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2079v)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m1381u(int i2) {
        try {
            this.f2059b = true;
            for (C1103e c1103e : ((HashMap) this.f2060c.f24b).values()) {
                if (c1103e != null) {
                    c1103e.f4609e = i2;
                }
            }
            m1344O(i2, false);
            Iterator it = m1363e().iterator();
            while (it.hasNext()) {
                ((AbstractC1104f) it.next()).m2569h();
            }
            this.f2059b = false;
            m1386z(true);
        } catch (Throwable th) {
            this.f2059b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1382v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strM2226f = C0944z.m2226f(str, "    ");
        C0003A2 c0003a2 = this.f2060c;
        c0003a2.getClass();
        String str3 = str + "    ";
        HashMap map = (HashMap) c0003a2.f24b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1103e c1103e : map.values()) {
                printWriter.print(str);
                if (c1103e != null) {
                    ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
                    printWriter.println(componentCallbacksC1100b);
                    componentCallbacksC1100b.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(componentCallbacksC1100b.f4580x));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(componentCallbacksC1100b.f4581y));
                    printWriter.print(" mTag=");
                    printWriter.println(componentCallbacksC1100b.f4582z);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(componentCallbacksC1100b.f4557a);
                    printWriter.print(" mWho=");
                    printWriter.print(componentCallbacksC1100b.f4561e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(componentCallbacksC1100b.f4575s);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(componentCallbacksC1100b.f4567k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(componentCallbacksC1100b.f4568l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(componentCallbacksC1100b.f4570n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(componentCallbacksC1100b.f4571o);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(componentCallbacksC1100b.f4537A);
                    printWriter.print(" mDetached=");
                    printWriter.print(componentCallbacksC1100b.f4538B);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(componentCallbacksC1100b.f4540D);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(componentCallbacksC1100b.f4539C);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(componentCallbacksC1100b.f4545I);
                    if (componentCallbacksC1100b.f4576t != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(componentCallbacksC1100b.f4576t);
                    }
                    if (componentCallbacksC1100b.f4577u != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(componentCallbacksC1100b.f4577u);
                    }
                    if (componentCallbacksC1100b.f4579w != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(componentCallbacksC1100b.f4579w);
                    }
                    if (componentCallbacksC1100b.f4562f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(componentCallbacksC1100b.f4562f);
                    }
                    if (componentCallbacksC1100b.f4558b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(componentCallbacksC1100b.f4558b);
                    }
                    if (componentCallbacksC1100b.f4559c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(componentCallbacksC1100b.f4559c);
                    }
                    if (componentCallbacksC1100b.f4560d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(componentCallbacksC1100b.f4560d);
                    }
                    Object objM23c = componentCallbacksC1100b.f4563g;
                    if (objM23c == null) {
                        AbstractC0553e7 abstractC0553e7 = componentCallbacksC1100b.f4576t;
                        objM23c = (abstractC0553e7 == null || (str2 = componentCallbacksC1100b.f4564h) == null) ? null : abstractC0553e7.f2060c.m23c(str2);
                    }
                    if (objM23c != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(objM23c);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(componentCallbacksC1100b.f4565i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    ComponentCallbacksC1100b.d dVar = componentCallbacksC1100b.f4546J;
                    printWriter.println(dVar == null ? false : dVar.f4586a);
                    ComponentCallbacksC1100b.d dVar2 = componentCallbacksC1100b.f4546J;
                    if ((dVar2 == null ? 0 : dVar2.f4587b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        ComponentCallbacksC1100b.d dVar3 = componentCallbacksC1100b.f4546J;
                        printWriter.println(dVar3 == null ? 0 : dVar3.f4587b);
                    }
                    ComponentCallbacksC1100b.d dVar4 = componentCallbacksC1100b.f4546J;
                    if ((dVar4 == null ? 0 : dVar4.f4588c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        ComponentCallbacksC1100b.d dVar5 = componentCallbacksC1100b.f4546J;
                        printWriter.println(dVar5 == null ? 0 : dVar5.f4588c);
                    }
                    ComponentCallbacksC1100b.d dVar6 = componentCallbacksC1100b.f4546J;
                    if ((dVar6 == null ? 0 : dVar6.f4589d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        ComponentCallbacksC1100b.d dVar7 = componentCallbacksC1100b.f4546J;
                        printWriter.println(dVar7 == null ? 0 : dVar7.f4589d);
                    }
                    ComponentCallbacksC1100b.d dVar8 = componentCallbacksC1100b.f4546J;
                    if ((dVar8 == null ? 0 : dVar8.f4590e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        ComponentCallbacksC1100b.d dVar9 = componentCallbacksC1100b.f4546J;
                        printWriter.println(dVar9 == null ? 0 : dVar9.f4590e);
                    }
                    if (componentCallbacksC1100b.f4542F != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(componentCallbacksC1100b.f4542F);
                    }
                    if (componentCallbacksC1100b.f4543G != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(componentCallbacksC1100b.f4543G);
                    }
                    if (componentCallbacksC1100b.m2531d() != null) {
                        new C0156I9(componentCallbacksC1100b, componentCallbacksC1100b.getViewModelStore()).m435a(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + componentCallbacksC1100b.f4578v + ":");
                    componentCallbacksC1100b.f4578v.m1382v(C0944z.m2226f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0003a2.f23a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                ComponentCallbacksC1100b componentCallbacksC1100b2 = (ComponentCallbacksC1100b) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1100b2.toString());
            }
        }
        ArrayList<ComponentCallbacksC1100b> arrayList2 = this.f2062e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size; i3++) {
                ComponentCallbacksC1100b componentCallbacksC1100b3 = this.f2062e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1100b3.toString());
            }
        }
        int size3 = this.f2061d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0327S1 c0327s1 = this.f2061d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0327s1.toString());
                c0327s1.m906f(strM2226f, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2067j.get());
        synchronized (this.f2058a) {
            try {
                int size4 = this.f2058a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (i) this.f2058a.get(i5);
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
        printWriter.println(this.f2079v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2080w);
        if (this.f2081x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2081x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2078u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2049G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2050H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2051I);
        if (this.f2048F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2048F);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1383w() {
        Iterator it = m1363e().iterator();
        while (it.hasNext()) {
            ((AbstractC1104f) it.next()).m2569h();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1384x(i iVar, boolean z) {
        if (!z) {
            if (this.f2079v == null) {
                if (!this.f2051I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f2049G || this.f2050H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2058a) {
            try {
                if (this.f2079v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2058a.add(iVar);
                    m1353X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1385y(boolean z) {
        if (this.f2059b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2079v == null) {
            if (!this.f2051I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2079v.f1724c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.f2049G || this.f2050H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2053K == null) {
            this.f2053K = new ArrayList<>();
            this.f2054L = new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1386z(boolean z) {
        boolean zMo902a;
        m1385y(z);
        boolean z2 = false;
        while (true) {
            ArrayList<C0327S1> arrayList = this.f2053K;
            ArrayList<Boolean> arrayList2 = this.f2054L;
            synchronized (this.f2058a) {
                if (this.f2058a.isEmpty()) {
                    zMo902a = false;
                } else {
                    try {
                        int size = this.f2058a.size();
                        zMo902a = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            zMo902a |= this.f2058a.get(i2).mo902a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zMo902a) {
                break;
            }
            z2 = true;
            this.f2059b = true;
            try {
                m1350U(this.f2053K, this.f2054L);
            } finally {
                m1361d();
            }
        }
        m1366f0();
        if (this.f2052J) {
            this.f2052J = false;
            m1362d0();
        }
        ((HashMap) this.f2060c.f24b).values().removeAll(Collections.singleton(null));
        return z2;
    }
}

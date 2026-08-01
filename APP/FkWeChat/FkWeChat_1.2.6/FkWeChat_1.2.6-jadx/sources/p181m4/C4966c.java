package p181m4;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.InterfaceC0672m;
import androidx.lifecycle.InterfaceC0676o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p024b9.AbstractC1043k;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p181m4.C4970g;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p278t3.AbstractC8099b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4966c implements InterfaceC0672m {

    /* JADX INFO: renamed from: r */
    public static final a f15103r = new a(null);

    /* JADX INFO: renamed from: q */
    public final InterfaceC4973j f15104q;

    /* JADX INFO: renamed from: m4.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements C4970g.b {

        /* JADX INFO: renamed from: a */
        public final Set f15105a;

        public b(C4970g c4970g) {
            c4970g.getClass();
            this.f15105a = new LinkedHashSet();
            c4970g.m20069c("androidx.savedstate.Restarter", this);
        }

        @Override // p181m4.C4970g.b
        /* JADX INFO: renamed from: a */
        public Bundle mo2609a() {
            C4711r[] c4711rArr;
            Map mapM20768i = AbstractC5109u0.m20768i();
            if (mapM20768i.isEmpty()) {
                c4711rArr = new C4711r[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM20768i.size());
                for (Map.Entry entry : mapM20768i.entrySet()) {
                    arrayList.add(AbstractC4717x.m18815a((String) entry.getKey(), entry.getValue()));
                }
                c4711rArr = (C4711r[]) arrayList.toArray(new C4711r[0]);
            }
            Bundle bundleM31314a = AbstractC8099b.m31314a((C4711r[]) Arrays.copyOf(c4711rArr, c4711rArr.length));
            AbstractC4974k.m20082d(AbstractC4974k.m20079a(bundleM31314a), "classes_to_restore", AbstractC5081g0.m20554X0(this.f15105a));
            return bundleM31314a;
        }

        /* JADX INFO: renamed from: b */
        public final void m20057b(String str) {
            str.getClass();
            this.f15105a.add(str);
        }
    }

    public C4966c(InterfaceC4973j interfaceC4973j) {
        interfaceC4973j.getClass();
        this.f15104q = interfaceC4973j;
    }

    /* JADX INFO: renamed from: a */
    public final void m20056a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, C4966c.class.getClassLoader()).asSubclass(C4970g.a.class);
            clsAsSubclass.getClass();
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    objNewInstance.getClass();
                    ((C4970g.a) objNewInstance).mo2623a(this.f15104q);
                } catch (Exception e10) {
                    C4965b.m20055a("Failed to instantiate ", str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0672m
    /* JADX INFO: renamed from: j */
    public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
        interfaceC0676o.getClass();
        aVar.getClass();
        if (aVar != AbstractC0668k.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0676o.getLifecycle().mo2630c(this);
        Bundle bundleM20067a = this.f15104q.getSavedStateRegistry().m20067a("androidx.savedstate.Restarter");
        if (bundleM20067a == null) {
            return;
        }
        List listM20062e = AbstractC4967d.m20062e(AbstractC4967d.m20058a(bundleM20067a), "classes_to_restore");
        if (listM20062e == null) {
            C10010p0.m38820a("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        Iterator it = listM20062e.iterator();
        while (it.hasNext()) {
            m20056a((String) it.next());
        }
    }

    /* JADX INFO: renamed from: m4.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}

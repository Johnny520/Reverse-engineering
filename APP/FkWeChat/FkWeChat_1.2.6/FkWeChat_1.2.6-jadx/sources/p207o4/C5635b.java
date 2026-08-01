package p207o4;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.InterfaceC0672m;
import androidx.lifecycle.InterfaceC0676o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.C5753h;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4717x;
import p172l8.C4700i0;
import p172l8.C4711r;
import p181m4.AbstractC4967d;
import p181m4.AbstractC4974k;
import p181m4.C4970g;
import p181m4.InterfaceC4973j;
import p185m8.AbstractC5109u0;
import p278t3.AbstractC8099b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: o4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5635b {

    /* JADX INFO: renamed from: i */
    public static final a f17709i = new a(null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC4973j f17710a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a f17711b;

    /* JADX INFO: renamed from: c */
    public final C5636c f17712c;

    /* JADX INFO: renamed from: d */
    public final Map f17713d;

    /* JADX INFO: renamed from: e */
    public boolean f17714e;

    /* JADX INFO: renamed from: f */
    public Bundle f17715f;

    /* JADX INFO: renamed from: g */
    public boolean f17716g;

    /* JADX INFO: renamed from: h */
    public boolean f17717h;

    public C5635b(InterfaceC4973j interfaceC4973j, InterfaceC0173a interfaceC0173a) {
        interfaceC4973j.getClass();
        interfaceC0173a.getClass();
        this.f17710a = interfaceC4973j;
        this.f17711b = interfaceC0173a;
        this.f17712c = new C5636c();
        this.f17713d = new LinkedHashMap();
        this.f17717h = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m22810a(C5635b c5635b, InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
        interfaceC0676o.getClass();
        aVar.getClass();
        if (aVar == AbstractC0668k.a.ON_START) {
            c5635b.f17717h = true;
        } else if (aVar == AbstractC0668k.a.ON_STOP) {
            c5635b.f17717h = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m22812c(String str) {
        str.getClass();
        if (!this.f17716g) {
            C10010p0.m38820a("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = this.f17715f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM20058a = AbstractC4967d.m20058a(bundle);
        Bundle bundleM20060c = AbstractC4967d.m20059b(bundleM20058a, str) ? AbstractC4967d.m20060c(bundleM20058a, str) : null;
        AbstractC4974k.m20083e(AbstractC4974k.m20079a(bundle), str);
        if (AbstractC4967d.m20063f(AbstractC4967d.m20058a(bundle))) {
            this.f17715f = null;
        }
        return bundleM20060c;
    }

    /* JADX INFO: renamed from: d */
    public final C4970g.b m22813d(String str) {
        C4970g.b bVar;
        str.getClass();
        synchronized (this.f17712c) {
            Iterator it = this.f17713d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                C4970g.b bVar2 = (C4970g.b) entry.getValue();
                if (AbstractC1061t.m3842c(str2, str)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m22814e() {
        return this.f17717h;
    }

    /* JADX INFO: renamed from: f */
    public final void m22815f() {
        if (this.f17710a.getLifecycle().mo2629b() != AbstractC0668k.b.f1969r) {
            C10010p0.m38820a("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f17714e) {
                C10010p0.m38820a("SavedStateRegistry was already attached.");
                return;
            }
            this.f17711b.invoke();
            this.f17710a.getLifecycle().mo2628a(new InterfaceC0672m() { // from class: o4.a
                @Override // androidx.lifecycle.InterfaceC0672m
                /* JADX INFO: renamed from: j */
                public final void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
                    C5635b.m22810a(this.f17708q, interfaceC0676o, aVar);
                }
            });
            this.f17714e = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m22816g(Bundle bundle) {
        if (!this.f17714e) {
            m22815f();
        }
        if (this.f17710a.getLifecycle().mo2629b().m2636c(AbstractC0668k.b.f1971t)) {
            C5753h.m23254a("performRestore cannot be called when owner is ", this.f17710a.getLifecycle().mo2629b());
            return;
        }
        if (this.f17716g) {
            C10010p0.m38820a("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM20060c = null;
        if (bundle != null) {
            Bundle bundleM20058a = AbstractC4967d.m20058a(bundle);
            if (AbstractC4967d.m20059b(bundleM20058a, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleM20060c = AbstractC4967d.m20060c(bundleM20058a, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f17715f = bundleM20060c;
        this.f17716g = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m22817h(Bundle bundle) {
        C4711r[] c4711rArr;
        bundle.getClass();
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
        Bundle bundleM20079a = AbstractC4974k.m20079a(bundleM31314a);
        Bundle bundle2 = this.f17715f;
        if (bundle2 != null) {
            AbstractC4974k.m20080b(bundleM20079a, bundle2);
        }
        synchronized (this.f17712c) {
            try {
                for (Map.Entry entry2 : this.f17713d.entrySet()) {
                    AbstractC4974k.m20081c(bundleM20079a, (String) entry2.getKey(), ((C4970g.b) entry2.getValue()).mo2609a());
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (AbstractC4967d.m20063f(AbstractC4967d.m20058a(bundleM31314a))) {
            return;
        }
        AbstractC4974k.m20081c(AbstractC4974k.m20079a(bundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM31314a);
    }

    /* JADX INFO: renamed from: i */
    public final void m22818i(String str, C4970g.b bVar) {
        str.getClass();
        bVar.getClass();
        synchronized (this.f17712c) {
            if (this.f17713d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f17713d.put(str, bVar);
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m22819j(String str) {
        str.getClass();
        synchronized (this.f17712c) {
        }
    }

    /* JADX INFO: renamed from: o4.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}

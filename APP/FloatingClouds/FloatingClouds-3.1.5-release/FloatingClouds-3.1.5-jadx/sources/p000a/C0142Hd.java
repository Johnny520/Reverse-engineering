package p000a;

import android.os.Bundle;
import androidx.lifecycle.C1128m;
import androidx.lifecycle.C1129n;
import androidx.savedstate.C1224a;
import java.util.Map;

/* JADX INFO: renamed from: a.Hd */
/* JADX INFO: loaded from: classes.dex */
public final class C0142Hd implements C1224a.b {

    /* JADX INFO: renamed from: a */
    public final C1224a f495a;

    /* JADX INFO: renamed from: b */
    public boolean f496b;

    /* JADX INFO: renamed from: c */
    public Bundle f497c;

    /* JADX INFO: renamed from: d */
    public final C0233Me f498d;

    /* JADX INFO: renamed from: a.Hd$a */
    public static final class a extends AbstractC0859u9 implements InterfaceC0819s7<C0160Id> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0127Gg f499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0127Gg interfaceC0127Gg) {
            super(0);
            this.f499b = interfaceC0127Gg;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final C0160Id mo31a() {
            return C1129n.m2612c(this.f499b);
        }
    }

    public C0142Hd(C1224a c1224a, InterfaceC0127Gg interfaceC0127Gg) {
        C0631i9.m1482e(c1224a, "savedStateRegistry");
        this.f495a = c1224a;
        this.f498d = new C0233Me(new a(interfaceC0127Gg));
    }

    @Override // androidx.savedstate.C1224a.b
    /* JADX INFO: renamed from: a */
    public final Bundle mo57a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f497c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C0160Id) this.f498d.m625a()).f541d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo57a = ((C1128m) entry.getValue()).f4706e.mo57a();
            if (!C0631i9.m1478a(bundleMo57a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo57a);
            }
        }
        this.f496b = false;
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final void m370b() {
        if (this.f496b) {
            return;
        }
        Bundle bundleM3007a = this.f495a.m3007a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f497c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM3007a != null) {
            bundle.putAll(bundleM3007a);
        }
        this.f497c = bundle;
        this.f496b = true;
    }
}

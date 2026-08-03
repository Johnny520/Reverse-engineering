package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C1115d;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import p000a.C0124Gd;
import p000a.C0631i9;
import p000a.InterfaceC0214Ld;

/* JADX INFO: renamed from: androidx.savedstate.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class C1224a {

    /* JADX INFO: renamed from: b */
    public boolean f5207b;

    /* JADX INFO: renamed from: c */
    public Bundle f5208c;

    /* JADX INFO: renamed from: d */
    public boolean f5209d;

    /* JADX INFO: renamed from: e */
    public Recreator.C1223a f5210e;

    /* JADX INFO: renamed from: a */
    public final C0124Gd<String, b> f5206a = new C0124Gd<>();

    /* JADX INFO: renamed from: f */
    public boolean f5211f = true;

    /* JADX INFO: renamed from: androidx.savedstate.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2591a(InterfaceC0214Ld interfaceC0214Ld);
    }

    /* JADX INFO: renamed from: androidx.savedstate.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Bundle mo57a();
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m3007a(String str) {
        if (!this.f5209d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f5208c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f5208c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f5208c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f5208c = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: b */
    public final b m3008b() {
        String str;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f5206a.iterator();
        do {
            C0124Gd.e eVar = (C0124Gd.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            C0631i9.m1481d(entry, "components");
            str = (String) entry.getKey();
            bVar = (b) entry.getValue();
        } while (!C0631i9.m1478a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m3009c(String str, b bVar) {
        b bVar2;
        C0631i9.m1482e(bVar, "provider");
        C0124Gd<String, b> c0124Gd = this.f5206a;
        C0124Gd.c<String, b> cVarMo324a = c0124Gd.mo324a(str);
        if (cVarMo324a != null) {
            bVar2 = cVarMo324a.f410b;
        } else {
            C0124Gd.c<K, V> cVar = new C0124Gd.c<>(str, bVar);
            c0124Gd.f408d++;
            C0124Gd.c cVar2 = c0124Gd.f406b;
            if (cVar2 == null) {
                c0124Gd.f405a = cVar;
                c0124Gd.f406b = cVar;
            } else {
                cVar2.f411c = cVar;
                cVar.f412d = cVar2;
                c0124Gd.f406b = cVar;
            }
            bVar2 = null;
        }
        if (bVar2 != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3010d() {
        if (!this.f5211f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.C1223a c1223a = this.f5210e;
        if (c1223a == null) {
            c1223a = new Recreator.C1223a(this);
        }
        this.f5210e = c1223a;
        try {
            C1115d.a.class.getDeclaredConstructor(null);
            Recreator.C1223a c1223a2 = this.f5210e;
            if (c1223a2 != null) {
                c1223a2.f5205a.add(C1115d.a.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C1115d.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}

package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: hx */
/* JADX INFO: loaded from: classes.dex */
public final class C1518hx {

    /* JADX INFO: renamed from: b */
    public boolean f5370b;

    /* JADX INFO: renamed from: c */
    public Bundle f5371c;

    /* JADX INFO: renamed from: d */
    public boolean f5372d;

    /* JADX INFO: renamed from: e */
    public C1121a3 f5373e;

    /* JADX INFO: renamed from: a */
    public final C1027Xw f5369a = new C1027Xw();

    /* JADX INFO: renamed from: f */
    public boolean f5374f = true;

    /* JADX INFO: renamed from: a */
    public final Bundle m2896a(String str) {
        if (!this.f5372d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f5371c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f5371c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f5371c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f5371c = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1474gx m2897b() {
        String str;
        InterfaceC1474gx interfaceC1474gx;
        Iterator it = this.f5369a.iterator();
        do {
            C0855Tw c0855Tw = (C0855Tw) it;
            if (!c0855Tw.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c0855Tw.next();
            str = (String) entry.getKey();
            interfaceC1474gx = (InterfaceC1474gx) entry.getValue();
        } while (!AbstractC0585Nj.m1134a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC1474gx;
    }

    /* JADX INFO: renamed from: c */
    public final void m2898c(String str, InterfaceC1474gx interfaceC1474gx) {
        Object obj;
        C1027Xw c1027Xw = this.f5369a;
        C0898Uw c0898UwMo1943a = c1027Xw.mo1943a(str);
        if (c0898UwMo1943a != null) {
            obj = c0898UwMo1943a.f2792b;
        } else {
            C0898Uw c0898Uw = new C0898Uw(str, interfaceC1474gx);
            c1027Xw.f3272d++;
            C0898Uw c0898Uw2 = c1027Xw.f3270b;
            if (c0898Uw2 == null) {
                c1027Xw.f3269a = c0898Uw;
                c1027Xw.f3270b = c0898Uw;
            } else {
                c0898Uw2.f2793c = c0898Uw;
                c0898Uw.f2794d = c0898Uw2;
                c1027Xw.f3270b = c0898Uw;
            }
            obj = null;
        }
        if (((InterfaceC1474gx) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2899d() {
        if (!this.f5374f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C1121a3 c1121a3 = this.f5373e;
        if (c1121a3 == null) {
            c1121a3 = new C1121a3(this);
        }
        this.f5373e = c1121a3;
        try {
            C0503Ln.class.getDeclaredConstructor(null);
            C1121a3 c1121a32 = this.f5373e;
            if (c1121a32 != null) {
                ((LinkedHashSet) c1121a32.f3533b).add(C0503Ln.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C0503Ln.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}

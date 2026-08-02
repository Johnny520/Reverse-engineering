package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qc2 {

    /* JADX INFO: renamed from: a */
    public final sc2 f8891a;

    /* JADX INFO: renamed from: b */
    public m62 f8892b;

    public qc2(sc2 sc2Var) {
        this.f8891a = sc2Var;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m4133a(String str) {
        sc2 sc2Var = this.f8891a;
        if (!sc2Var.f10044g) {
            C0676s.m4653l("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = sc2Var.f10043f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM786K = bundle.containsKey(str) ? ci0.m786K(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            sc2Var.f10043f = null;
        }
        return bundleM786K;
    }

    /* JADX INFO: renamed from: b */
    public final pc2 m4134b(String str) {
        pc2 pc2Var;
        sc2 sc2Var = this.f8891a;
        synchronized (sc2Var.f10040c) {
            Iterator it = sc2Var.f10041d.entrySet().iterator();
            do {
                pc2Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                pc2 pc2Var2 = (pc2) entry.getValue();
                if (t11.m5086l(str2, str)) {
                    pc2Var = pc2Var2;
                }
            } while (pc2Var == null);
        }
        return pc2Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m4135c(String str, pc2 pc2Var) {
        pc2Var.getClass();
        sc2 sc2Var = this.f8891a;
        synchronized (sc2Var.f10040c) {
            if (sc2Var.f10041d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            sc2Var.f10041d.put(str, pc2Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4136d() {
        if (!this.f8891a.f10045h) {
            C0676s.m4653l("Can not perform this action after onSaveInstanceState");
            return;
        }
        m62 m62Var = this.f8892b;
        if (m62Var == null) {
            m62Var = new m62(this);
        }
        this.f8892b = m62Var;
        try {
            s91.class.getDeclaredConstructor(null);
            m62 m62Var2 = this.f8892b;
            if (m62Var2 != null) {
                m62Var2.f6488a.add(s91.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + s91.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}

package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qc2 {
    public final sc2 a;
    public m62 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qc2(sc2 sc2Var) {
        this.a = sc2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle a(String str) {
        sc2 sc2Var = this.a;
        if (!sc2Var.g) {
            s.l("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = sc2Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleK = bundle.containsKey(str) ? ci0.K(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            sc2Var.f = null;
        }
        return bundleK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pc2 b(String str) {
        pc2 pc2Var;
        sc2 sc2Var = this.a;
        synchronized (sc2Var.c) {
            Iterator it = sc2Var.d.entrySet().iterator();
            do {
                pc2Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                pc2 pc2Var2 = (pc2) entry.getValue();
                if (t11.l(str2, str)) {
                    pc2Var = pc2Var2;
                }
            } while (pc2Var == null);
        }
        return pc2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(String str, pc2 pc2Var) {
        pc2Var.getClass();
        sc2 sc2Var = this.a;
        synchronized (sc2Var.c) {
            if (sc2Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            sc2Var.d.put(str, pc2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (!this.a.h) {
            s.l("Can not perform this action after onSaveInstanceState");
            return;
        }
        m62 m62Var = this.b;
        if (m62Var == null) {
            m62Var = new m62(this);
        }
        this.b = m62Var;
        try {
            s91.class.getDeclaredConstructor(null);
            m62 m62Var2 = this.b;
            if (m62Var2 != null) {
                m62Var2.a.add(s91.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + s91.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}

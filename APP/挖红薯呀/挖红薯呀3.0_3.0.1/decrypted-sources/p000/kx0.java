package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kx0 {

    /* JADX INFO: renamed from: a */
    public final mx0 f3284a;

    /* JADX INFO: renamed from: b */
    public qt0 f3285b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kx0(mx0 mx0Var) {
        this.f3284a = mx0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Bundle m1960a(String str) {
        mx0 mx0Var = this.f3284a;
        if (!mx0Var.f4066g) {
            C0921xc.m5134o("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = mx0Var.f4065f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM4916w = bundle.containsKey(str) ? w60.m4916w(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            mx0Var.f4065f = null;
        }
        return bundleM4916w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final jx0 m1961b() {
        jx0 jx0Var;
        mx0 mx0Var = this.f3284a;
        synchronized (mx0Var.f4062c) {
            Iterator it = mx0Var.f4063d.entrySet().iterator();
            do {
                jx0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                jx0 jx0Var2 = (jx0) entry.getValue();
                if (p30.m3002l(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    jx0Var = jx0Var2;
                }
            } while (jx0Var == null);
        }
        return jx0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1962c(String str, jx0 jx0Var) {
        jx0Var.getClass();
        mx0 mx0Var = this.f3284a;
        synchronized (mx0Var.f4062c) {
            if (mx0Var.f4063d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            mx0Var.f4063d.put(str, jx0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1963d() {
        if (!this.f3284a.f4067h) {
            C0921xc.m5134o("Can not perform this action after onSaveInstanceState");
            return;
        }
        qt0 qt0Var = this.f3285b;
        if (qt0Var == null) {
            qt0Var = new qt0(this);
        }
        this.f3285b = qt0Var;
        try {
            j90.class.getDeclaredConstructor(null);
            qt0 qt0Var2 = this.f3285b;
            if (qt0Var2 != null) {
                qt0Var2.f5221a.add(j90.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + j90.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}

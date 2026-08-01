package p048I1;

import android.os.Bundle;
import com.bumptech.glide.AbstractC1926h;
import java.util.Iterator;
import java.util.Map;
import p002A1.C0137j;
import p055K1.C0874a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: I1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0780e {

    /* JADX INFO: renamed from: a */
    public final C0874a f2522a;

    /* JADX INFO: renamed from: b */
    public C0776a f2523b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0780e(C0874a c0874a) {
        this.f2522a = c0874a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Bundle m1325a(String str) {
        AbstractC1665j.m2985e(str, "key");
        C0874a c0874a = this.f2522a;
        if (!c0874a.f2762g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = c0874a.f2761f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM3577t = bundle.containsKey(str) ? AbstractC1926h.m3577t(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            c0874a.f2761f = null;
        }
        return bundleM3577t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC0779d m1326b() {
        InterfaceC0779d interfaceC0779d;
        C0874a c0874a = this.f2522a;
        synchronized (c0874a.f2758c) {
            Iterator it = c0874a.f2759d.entrySet().iterator();
            do {
                interfaceC0779d = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                InterfaceC0779d interfaceC0779d2 = (InterfaceC0779d) entry.getValue();
                if (AbstractC1665j.m2981a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    interfaceC0779d = interfaceC0779d2;
                }
            } while (interfaceC0779d == null);
        }
        return interfaceC0779d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1327c(String str, InterfaceC0779d interfaceC0779d) {
        AbstractC1665j.m2985e(interfaceC0779d, "provider");
        C0874a c0874a = this.f2522a;
        synchronized (c0874a.f2758c) {
            if (c0874a.f2759d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c0874a.f2759d.put(str, interfaceC0779d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1328d() {
        if (!this.f2522a.f2763h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0776a c0776a = this.f2523b;
        if (c0776a == null) {
            c0776a = new C0776a(this);
        }
        this.f2523b = c0776a;
        try {
            C0137j.class.getDeclaredConstructor(null);
            C0776a c0776a2 = this.f2523b;
            if (c0776a2 != null) {
                c0776a2.f2519a.add(C0137j.class.getName());
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + C0137j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}

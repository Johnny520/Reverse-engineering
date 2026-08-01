package p000;

import android.os.Bundle;
import androidx.lifecycle.C0036a;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: im */
/* JADX INFO: loaded from: classes.dex */
public final class C0339im {

    /* JADX INFO: renamed from: a */
    public boolean f2553a;

    /* JADX INFO: renamed from: b */
    public final Object f2554b;

    /* JADX INFO: renamed from: c */
    public final Object f2555c;

    public C0339im(b20 b20Var) {
        this.f2554b = b20Var;
        this.f2555c = new C0004a3();
    }

    /* JADX INFO: renamed from: a */
    public void m1503a() {
        b20 b20Var = (b20) this.f2554b;
        C0036a c0036aMo105e = b20Var.mo105e();
        if (c0036aMo105e.f481c != EnumC0531nq.f3330b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0036aMo105e.m259a(new Recreator(b20Var));
        final C0004a3 c0004a3 = (C0004a3) this.f2555c;
        c0004a3.getClass();
        if (c0004a3.f15c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0036aMo105e.m259a(new InterfaceC0642qq() { // from class: y10
            @Override // p000.InterfaceC0642qq
            /* JADX INFO: renamed from: b */
            public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
                C0004a3 c0004a32 = c0004a3;
                AbstractC0493mp.m1857g("this$0", c0004a32);
                if (enumC0494mq == EnumC0494mq.ON_START) {
                    c0004a32.f17e = true;
                } else if (enumC0494mq == EnumC0494mq.ON_STOP) {
                    c0004a32.f17e = false;
                }
            }
        });
        c0004a3.f15c = true;
        this.f2553a = true;
    }

    /* JADX INFO: renamed from: b */
    public void m1504b(Bundle bundle) {
        if (!this.f2553a) {
            m1503a();
        }
        C0036a c0036aMo105e = ((b20) this.f2554b).mo105e();
        if (c0036aMo105e.f481c.compareTo(EnumC0531nq.f3332d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0036aMo105e.f481c).toString());
        }
        C0004a3 c0004a3 = (C0004a3) this.f2555c;
        if (!c0004a3.f15c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0004a3.f16d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0004a3.f13a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0004a3.f16d = true;
    }

    /* JADX INFO: renamed from: c */
    public void m1505c(Bundle bundle) {
        AbstractC0493mp.m1857g("outBundle", bundle);
        C0004a3 c0004a3 = (C0004a3) this.f2555c;
        c0004a3.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0004a3.f13a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        v10 v10Var = (v10) c0004a3.f18f;
        v10Var.getClass();
        t10 t10Var = new t10(v10Var);
        v10Var.f4874c.put(t10Var, Boolean.FALSE);
        while (t10Var.hasNext()) {
            Map.Entry entry = (Map.Entry) t10Var.next();
            bundle2.putBundle((String) entry.getKey(), ((a20) entry.getValue()).mo17a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public C0339im(ExecutorC0182ec executorC0182ec, C0773u9 c0773u9) {
        this.f2554b = new Object();
        this.f2555c = new ArrayList();
    }
}

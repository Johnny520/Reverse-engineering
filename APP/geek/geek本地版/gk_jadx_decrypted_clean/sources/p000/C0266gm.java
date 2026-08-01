package p000;

import android.os.Bundle;
import androidx.lifecycle.C0036a;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: gm */
/* JADX INFO: loaded from: classes.dex */
public final class C0266gm {

    /* JADX INFO: renamed from: a */
    public boolean f2141a;

    /* JADX INFO: renamed from: b */
    public final Object f2142b;

    /* JADX INFO: renamed from: c */
    public final Object f2143c;

    public C0266gm(u10 u10Var) {
        this.f2142b = u10Var;
        this.f2143c = new C0004a3();
    }

    /* JADX INFO: renamed from: a */
    public void m1278a() {
        u10 u10Var = (u10) this.f2142b;
        C0036a c0036aMo120e = u10Var.mo120e();
        if (c0036aMo120e.f518c != EnumC0383jq.f2657b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0036aMo120e.m274a(new Recreator(u10Var));
        final C0004a3 c0004a3 = (C0004a3) this.f2143c;
        c0004a3.getClass();
        if (c0004a3.f18c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0036aMo120e.m274a(new InterfaceC0494mq() { // from class: r10
            @Override // p000.InterfaceC0494mq
            /* JADX INFO: renamed from: b */
            public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
                C0004a3 c0004a32 = c0004a3;
                AbstractC0346ip.m1503o("this$0", c0004a32);
                if (enumC0347iq == EnumC0347iq.ON_START) {
                    c0004a32.f20e = true;
                } else if (enumC0347iq == EnumC0347iq.ON_STOP) {
                    c0004a32.f20e = false;
                }
            }
        });
        c0004a3.f18c = true;
        this.f2141a = true;
    }

    /* JADX INFO: renamed from: b */
    public void m1279b(Bundle bundle) {
        if (!this.f2141a) {
            m1278a();
        }
        C0036a c0036aMo120e = ((u10) this.f2142b).mo120e();
        if (c0036aMo120e.f518c.compareTo(EnumC0383jq.f2659d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0036aMo120e.f518c).toString());
        }
        C0004a3 c0004a3 = (C0004a3) this.f2143c;
        if (!c0004a3.f18c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0004a3.f19d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0004a3.f16a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0004a3.f19d = true;
    }

    /* JADX INFO: renamed from: c */
    public void m1280c(Bundle bundle) {
        AbstractC0346ip.m1503o("outBundle", bundle);
        C0004a3 c0004a3 = (C0004a3) this.f2143c;
        c0004a3.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0004a3.f16a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o10 o10Var = (o10) c0004a3.f21f;
        o10Var.getClass();
        m10 m10Var = new m10(o10Var);
        o10Var.f3473c.put(m10Var, Boolean.FALSE);
        while (m10Var.hasNext()) {
            Map.Entry entry = (Map.Entry) m10Var.next();
            bundle2.putBundle((String) entry.getKey(), ((t10) entry.getValue()).mo2031a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public C0266gm(ExecutorC0813vb executorC0813vb, k80 k80Var) {
        this.f2142b = new Object();
        this.f2143c = new ArrayList();
    }
}

package p000a;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1119h;
import androidx.lifecycle.C1129n;
import androidx.lifecycle.C1131p;
import androidx.lifecycle.InterfaceC1114c;
import androidx.savedstate.C1224a;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: a.q7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0781q7 implements InterfaceC1114c, InterfaceC0214Ld, InterfaceC0127Gg {

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacksC1100b f3078a;

    /* JADX INFO: renamed from: b */
    public final C0109Fg f3079b;

    /* JADX INFO: renamed from: c */
    public final RunnableC0221M2 f3080c;

    /* JADX INFO: renamed from: d */
    public C1119h f3081d = null;

    /* JADX INFO: renamed from: e */
    public C0196Kd f3082e = null;

    public C0781q7(ComponentCallbacksC1100b componentCallbacksC1100b, C0109Fg c0109Fg, RunnableC0221M2 runnableC0221M2) {
        this.f3078a = componentCallbacksC1100b;
        this.f3079b = c0109Fg;
        this.f3080c = runnableC0221M2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1821a(AbstractC1116e.a aVar) {
        this.f3081d.m2598f(aVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m1822b() {
        if (this.f3081d == null) {
            this.f3081d = new C1119h(this);
            C0196Kd c0196Kd = new C0196Kd(this);
            this.f3082e = c0196Kd;
            c0196Kd.m545a();
            this.f3080c.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC1114c
    public final AbstractC0005A4 getDefaultViewModelCreationExtras() {
        Application application;
        ComponentCallbacksC1100b componentCallbacksC1100b = this.f3078a;
        Context applicationContext = componentCallbacksC1100b.m2524A().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0012Ab c0012Ab = new C0012Ab();
        LinkedHashMap linkedHashMap = c0012Ab.f29a;
        if (application != null) {
            linkedHashMap.put(C1131p.f4715a, application);
        }
        linkedHashMap.put(C1129n.f4707a, componentCallbacksC1100b);
        linkedHashMap.put(C1129n.f4708b, this);
        Bundle bundle = componentCallbacksC1100b.f4562f;
        if (bundle != null) {
            linkedHashMap.put(C1129n.f4709c, bundle);
        }
        return c0012Ab;
    }

    @Override // p000a.InterfaceC0935y9
    public final AbstractC1116e getLifecycle() {
        m1822b();
        return this.f3081d;
    }

    @Override // p000a.InterfaceC0214Ld
    public final C1224a getSavedStateRegistry() {
        m1822b();
        return this.f3082e.f663b;
    }

    @Override // p000a.InterfaceC0127Gg
    public final C0109Fg getViewModelStore() {
        m1822b();
        return this.f3079b;
    }
}

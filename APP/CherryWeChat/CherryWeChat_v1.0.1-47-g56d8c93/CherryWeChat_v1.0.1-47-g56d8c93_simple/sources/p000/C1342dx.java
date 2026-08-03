package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: dx */
/* JADX INFO: loaded from: classes.dex */
public final class C1342dx implements InterfaceC1474gx {

    /* JADX INFO: renamed from: a */
    public final C1518hx f4832a;

    /* JADX INFO: renamed from: b */
    public boolean f4833b;

    /* JADX INFO: renamed from: c */
    public Bundle f4834c;

    /* JADX INFO: renamed from: d */
    public final C1251cA f4835d;

    public C1342dx(C1518hx r2, InterfaceC2752yE r3) {
        this.f4832a = r2;
        this.f4835d = new C1251cA(new C2790z9(5, r3));
    }

    /* JADX INFO: renamed from: a */
    public final void m2598a() {
        if (this.f4833b == true) goto L11;
        Bundle r0 = this.f4832a.m2896a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle r1 = new Bundle();
        Bundle r2 = this.f4834c;
        if (r2 == null) goto L7;
        r1.putAll(r2);
    L7:
        if (r0 == null) goto L9;
        r1.putAll(r0);
    L9:
        this.f4834c = r1;
        this.f4833b = true;
        C1386ex r02 = (C1386ex) this.f4835d.getValue();
        return;
    }

    @Override // p000.InterfaceC1474gx
    public final Bundle saveState() {
        Bundle r0 = new Bundle();
        Bundle r1 = this.f4834c;
        if (r1 == null) goto L5;
        r0.putAll(r1);
    L5:
        Iterator r12 = ((C1386ex) this.f4835d.getValue()).f4935d.entrySet().iterator();
    L7:
        if (r12.hasNext() == false) goto L11;
        Map.Entry r2 = (Map.Entry) r12.next();
        String r3 = (String) r2.getKey();
        Bundle r22 = ((C1194ax) r2.getValue()).f4096e.saveState();
        if (AbstractC0585Nj.m1134a(r22, Bundle.EMPTY) == true) goto L7;
        r0.putBundle(r3, r22);
        goto L7
    L11:
        this.f4833b = false;
        return r0;
    }
}

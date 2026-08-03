package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: hx */
/* JADX INFO: loaded from: classes.dex */
public final class C1518hx {

    /* JADX INFO: renamed from: a */
    public final C1027Xw f5369a;

    /* JADX INFO: renamed from: b */
    public boolean f5370b;

    /* JADX INFO: renamed from: c */
    public Bundle f5371c;

    /* JADX INFO: renamed from: d */
    public boolean f5372d;

    /* JADX INFO: renamed from: e */
    public C1121a3 f5373e;

    /* JADX INFO: renamed from: f */
    public boolean f5374f;

    public C1518hx() {
        this.f5369a = new C1027Xw();
        this.f5374f = true;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m2896a(String r4) {
        if (this.f5372d == false) goto L18;
        Bundle r0 = this.f5371c;
        if (r0 == null) goto L16;
        Bundle r02 = r0.getBundle(r4);
        Bundle r2 = this.f5371c;
        if (r2 == null) goto L9;
        r2.remove(r4);
    L9:
        Bundle r42 = this.f5371c;
        if (r42 != null) goto L12;
    L14:
        this.f5371c = null;
        return r02;
    L12:
        if (r42.isEmpty() == true) goto L14;
        return r02;
    L16:
        return null;
    L18:
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1474gx m2897b() {
        Iterator r0 = this.f5369a.iterator();
    L3:
        C0855Tw r1 = (C0855Tw) r0;
        if (r1.hasNext() == false) goto L8;
        Map.Entry r12 = (Map.Entry) r1.next();
        String r2 = (String) r12.getKey();
        InterfaceC1474gx r13 = (InterfaceC1474gx) r12.getValue();
        if (AbstractC0585Nj.m1134a(r2, "androidx.lifecycle.internal.SavedStateHandlesProvider") == false) goto L3;
        return r13;
    L8:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2898c(String r3, InterfaceC1474gx r4) {
        C1027Xw r0 = this.f5369a;
        C0898Uw r1 = r0.mo1943a(r3);
        if (r1 == null) goto L5;
        Object r32 = r1.f2792b;
    L11:
        if (((InterfaceC1474gx) r32) != null) goto L14;
        return;
    L14:
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    L5:
        C0898Uw r12 = new C0898Uw(r3, r4);
        r0.f3272d++;
        C0898Uw r33 = r0.f3270b;
        if (r33 != null) goto L8;
        r0.f3269a = r12;
        r0.f3270b = r12;
    L9:
        r32 = null;
        goto L11
    L8:
        r33.f2793c = r12;
        r12.f2794d = r33;
        r0.f3270b = r12;
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final void m2899d() {
        if (this.f5374f == false) goto L17;
        C1121a3 r1 = this.f5373e;
        if (r1 != null) goto L7;
        r1 = new C1121a3(this);
    L7:
        this.f5373e = r1;
        C0503Ln.class.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L13
        C1121a3 r12 = this.f5373e;
        if (r12 == null) goto L20;
        ((LinkedHashSet) r12.f3533b).add(C0503Ln.class.getName());
        return;
    L20:
        return;
    L13:
        e = move-exception;
        throw new IllegalArgumentException("Class " + C0503Ln.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L17:
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}

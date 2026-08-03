package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public final Object f1469a;

    /* JADX INFO: renamed from: b */
    public final C0524a f1470b;

    public ReflectiveGenericLifecycleObserver(Object r3) {
        this.f1469a = r3;
        C0526c r02 = C0526c.f1477c;
        Class<?> r32 = r3.getClass();
        C0524a r1 = (C0524a) r02.f1478a.get(r32);
        if (r1 != null) goto L6;
        r1 = r02.m1250a(r32, null);
    L6:
        this.f1470b = r1;
    }

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r r4, EnumC0535l r5) {
        HashMap r02 = this.f1470b.f1473a;
        List r1 = (List) r02.get(r5);
        Object r2 = this.f1469a;
        C0524a.m1248a(r1, r4, r5, r2);
        C0524a.m1248a((List) r02.get(EnumC0535l.ON_ANY), r4, r5, r2);
    }
}

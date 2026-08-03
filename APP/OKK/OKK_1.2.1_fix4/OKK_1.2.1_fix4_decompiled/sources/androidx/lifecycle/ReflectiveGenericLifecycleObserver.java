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

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1469a = obj;
        C0526c c0526c = C0526c.f1477c;
        Class<?> cls = obj.getClass();
        C0524a c0524a = (C0524a) c0526c.f1478a.get(cls);
        this.f1470b = c0524a == null ? c0526c.m1250a(cls, null) : c0524a;
    }

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        HashMap map = this.f1470b.f1473a;
        List list = (List) map.get(enumC0535l);
        Object obj = this.f1469a;
        C0524a.m1248a(list, interfaceC0541r, enumC0535l, obj);
        C0524a.m1248a((List) map.get(EnumC0535l.ON_ANY), interfaceC0541r, enumC0535l, obj);
    }
}

package androidx.lifecycle;

import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1112a;
import java.util.HashMap;
import java.util.List;
import p000a.InterfaceC0916x9;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC1118g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0916x9 f4658a;

    /* JADX INFO: renamed from: b */
    public final C1112a.a f4659b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0916x9 interfaceC0916x9) {
        this.f4658a = interfaceC0916x9;
        C1112a c1112a = C1112a.f4665c;
        Class<?> cls = interfaceC0916x9.getClass();
        C1112a.a aVar = (C1112a.a) c1112a.f4666a.get(cls);
        this.f4659b = aVar == null ? c1112a.m2587a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.InterfaceC1118g
    /* JADX INFO: renamed from: a */
    public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
        HashMap map = this.f4659b.f4668a;
        List list = (List) map.get(aVar);
        InterfaceC0916x9 interfaceC0916x9 = this.f4658a;
        C1112a.a.m2588a(list, interfaceC0935y9, aVar, interfaceC0916x9);
        C1112a.a.m2588a((List) map.get(AbstractC1116e.a.ON_ANY), interfaceC0935y9, aVar, interfaceC0916x9);
    }
}

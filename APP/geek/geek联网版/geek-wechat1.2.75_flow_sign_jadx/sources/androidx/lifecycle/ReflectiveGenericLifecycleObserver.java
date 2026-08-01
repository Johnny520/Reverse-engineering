package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import p000.C0811va;
import p000.C0886xa;
import p000.EnumC0494mq;
import p000.InterfaceC0642qq;
import p000.InterfaceC0679rq;
import p000.InterfaceC0716sq;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0642qq {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0679rq f475a;

    /* JADX INFO: renamed from: b */
    public final C0811va f476b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0679rq interfaceC0679rq) {
        this.f475a = interfaceC0679rq;
        C0886xa c0886xa = C0886xa.f5228c;
        Class<?> cls = interfaceC0679rq.getClass();
        C0811va c0811va = (C0811va) c0886xa.f5229a.get(cls);
        this.f476b = c0811va == null ? c0886xa.m2673a(cls, null) : c0811va;
    }

    @Override // p000.InterfaceC0642qq
    /* JADX INFO: renamed from: b */
    public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        HashMap map = this.f476b.f4922a;
        List list = (List) map.get(enumC0494mq);
        InterfaceC0679rq interfaceC0679rq = this.f475a;
        C0811va.m2554a(list, interfaceC0716sq, enumC0494mq, interfaceC0679rq);
        C0811va.m2554a((List) map.get(EnumC0494mq.ON_ANY), interfaceC0716sq, enumC0494mq, interfaceC0679rq);
    }
}

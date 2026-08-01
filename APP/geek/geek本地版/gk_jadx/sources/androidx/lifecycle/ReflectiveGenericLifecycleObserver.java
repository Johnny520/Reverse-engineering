package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import p000.C0515na;
import p000.C0590pa;
import p000.EnumC0347iq;
import p000.InterfaceC0494mq;
import p000.InterfaceC0531nq;
import p000.InterfaceC0568oq;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0494mq {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0531nq f512a;

    /* JADX INFO: renamed from: b */
    public final C0515na f513b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0531nq interfaceC0531nq) {
        this.f512a = interfaceC0531nq;
        C0590pa c0590pa = C0590pa.f3686c;
        Class<?> cls = interfaceC0531nq.getClass();
        C0515na c0515na = (C0515na) c0590pa.f3687a.get(cls);
        this.f513b = c0515na == null ? c0590pa.m2072a(cls, null) : c0515na;
    }

    @Override // p000.InterfaceC0494mq
    /* JADX INFO: renamed from: b */
    public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        HashMap map = this.f513b.f3363a;
        List list = (List) map.get(enumC0347iq);
        InterfaceC0531nq interfaceC0531nq = this.f512a;
        C0515na.m1924a(list, interfaceC0568oq, enumC0347iq, interfaceC0531nq);
        C0515na.m1924a((List) map.get(EnumC0347iq.ON_ANY), interfaceC0568oq, enumC0347iq, interfaceC0531nq);
    }
}

package p229p9;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p160kb.InterfaceC4230j;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5116y;
import p213oa.C5695f;
import p215oc.C5729x;

/* JADX INFO: renamed from: p9.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6033q1 {
    public /* synthetic */ AbstractC6033q1(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo23989a(C5695f c5695f);

    /* JADX INFO: renamed from: b */
    public final AbstractC6033q1 m24052b(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        if (this instanceof C5984a0) {
            C5984a0 c5984a0 = (C5984a0) this;
            return new C5984a0(c5984a0.m23990c(), (InterfaceC4230j) interfaceC0184l.mo27m(c5984a0.m23991d()));
        }
        if (!(this instanceof C6008i0)) {
            C5729x.m23182a();
            return null;
        }
        List<C4711r> listM24015c = ((C6008i0) this).m24015c();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM24015c, 10));
        for (C4711r c4711r : listM24015c) {
            arrayList.add(AbstractC4717x.m18815a((C5695f) c4711r.m18792a(), interfaceC0184l.mo27m((InterfaceC4230j) c4711r.m18793b())));
        }
        return new C6008i0(arrayList);
    }

    public AbstractC6033q1() {
    }
}

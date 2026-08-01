package p229p9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p213oa.C5692c;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: p9.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6035r0 implements InterfaceC6041t0 {

    /* JADX INFO: renamed from: a */
    public final Collection f18981a;

    public C6035r0(Collection collection) {
        collection.getClass();
        this.f18981a = collection;
    }

    /* JADX INFO: renamed from: f */
    public static final C5692c m24058f(InterfaceC6023n0 interfaceC6023n0) {
        interfaceC6023n0.getClass();
        return interfaceC6023n0.mo24031d();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m24059g(C5692c c5692c, C5692c c5692c2) {
        c5692c2.getClass();
        return !c5692c2.m22996c() && AbstractC1061t.m3842c(c5692c2.m22997d(), c5692c);
    }

    @Override // p229p9.InterfaceC6041t0
    /* JADX INFO: renamed from: a */
    public boolean mo3931a(C5692c c5692c) {
        c5692c.getClass();
        Collection collection = this.f18981a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (AbstractC1061t.m3842c(((InterfaceC6023n0) it.next()).mo24031d(), c5692c)) {
                return false;
            }
        }
        return true;
    }

    @Override // p229p9.InterfaceC6041t0
    /* JADX INFO: renamed from: b */
    public void mo3932b(C5692c c5692c, Collection collection) {
        c5692c.getClass();
        collection.getClass();
        for (Object obj : this.f18981a) {
            if (AbstractC1061t.m3842c(((InterfaceC6023n0) obj).mo24031d(), c5692c)) {
                collection.add(obj);
            }
        }
    }

    @Override // p229p9.InterfaceC6026o0
    /* JADX INFO: renamed from: c */
    public List mo3933c(C5692c c5692c) {
        c5692c.getClass();
        Collection collection = this.f18981a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC1061t.m3842c(((InterfaceC6023n0) obj).mo24031d(), c5692c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p229p9.InterfaceC6026o0
    /* JADX INFO: renamed from: q */
    public Collection mo3936q(C5692c c5692c, InterfaceC0184l interfaceC0184l) {
        c5692c.getClass();
        interfaceC0184l.getClass();
        return AbstractC7294t.m28908P(AbstractC7294t.m28915y(AbstractC7294t.m28901I(AbstractC5081g0.m20555Y(this.f18981a), C6029p0.f18978q), new C6032q0(c5692c)));
    }
}

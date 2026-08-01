package p273s9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5081g0;
import p213oa.C5692c;
import p229p9.AbstractC6038s0;
import p229p9.InterfaceC6026o0;
import p229p9.InterfaceC6041t0;

/* JADX INFO: renamed from: s9.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7223l implements InterfaceC6041t0 {

    /* JADX INFO: renamed from: a */
    public final List f23993a;

    /* JADX INFO: renamed from: b */
    public final String f23994b;

    public C7223l(List list, String str) {
        list.getClass();
        str.getClass();
        this.f23993a = list;
        this.f23994b = str;
        list.size();
        AbstractC5081g0.m20564c1(list).size();
    }

    @Override // p229p9.InterfaceC6041t0
    /* JADX INFO: renamed from: a */
    public boolean mo3931a(C5692c c5692c) {
        c5692c.getClass();
        List list = this.f23993a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC6038s0.m24065b((InterfaceC6026o0) it.next(), c5692c)) {
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
        Iterator it = this.f23993a.iterator();
        while (it.hasNext()) {
            AbstractC6038s0.m24064a((InterfaceC6026o0) it.next(), c5692c, collection);
        }
    }

    @Override // p229p9.InterfaceC6026o0
    /* JADX INFO: renamed from: c */
    public List mo3933c(C5692c c5692c) {
        c5692c.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23993a.iterator();
        while (it.hasNext()) {
            AbstractC6038s0.m24064a((InterfaceC6026o0) it.next(), c5692c, arrayList);
        }
        return AbstractC5081g0.m20554X0(arrayList);
    }

    @Override // p229p9.InterfaceC6026o0
    /* JADX INFO: renamed from: q */
    public Collection mo3936q(C5692c c5692c, InterfaceC0184l interfaceC0184l) {
        c5692c.getClass();
        interfaceC0184l.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.f23993a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC6026o0) it.next()).mo3936q(c5692c, interfaceC0184l));
        }
        return hashSet;
    }

    public String toString() {
        return this.f23994b;
    }
}

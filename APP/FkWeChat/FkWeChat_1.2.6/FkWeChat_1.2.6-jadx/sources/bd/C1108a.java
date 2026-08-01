package bd;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1064u0;
import p055e.AbstractC1960a;
import p098g9.InterfaceC2549c;
import p215oc.C5729x;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8662p;

/* JADX INFO: renamed from: bd.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1108a extends AbstractC1109b {

    /* JADX INFO: renamed from: a */
    public final Map f3337a;

    /* JADX INFO: renamed from: b */
    public final Map f3338b;

    /* JADX INFO: renamed from: c */
    public final Map f3339c;

    /* JADX INFO: renamed from: d */
    public final Map f3340d;

    /* JADX INFO: renamed from: e */
    public final Map f3341e;

    /* JADX INFO: renamed from: f */
    public final boolean f3342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108a(Map map, Map map2, Map map3, Map map4, Map map5, boolean z10) {
        super(null);
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.f3337a = map;
        this.f3338b = map2;
        this.f3339c = map3;
        this.f3340d = map4;
        this.f3341e = map5;
        this.f3342f = z10;
    }

    @Override // bd.AbstractC1109b
    /* JADX INFO: renamed from: a */
    public void mo4007a(InterfaceC1111d interfaceC1111d) {
        interfaceC1111d.getClass();
        Iterator it = this.f3337a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC1960a.m7104a(entry.getValue());
            C5729x.m23182a();
            return;
        }
        for (Map.Entry entry2 : this.f3338b.entrySet()) {
            InterfaceC2549c interfaceC2549c = (InterfaceC2549c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC2549c interfaceC2549c2 = (InterfaceC2549c) entry3.getKey();
                InterfaceC8647b interfaceC8647b = (InterfaceC8647b) entry3.getValue();
                interfaceC2549c.getClass();
                interfaceC2549c2.getClass();
                interfaceC8647b.getClass();
                interfaceC1111d.mo803c(interfaceC2549c, interfaceC2549c2, interfaceC8647b);
            }
        }
        for (Map.Entry entry4 : this.f3339c.entrySet()) {
            InterfaceC2549c interfaceC2549c3 = (InterfaceC2549c) entry4.getKey();
            InterfaceC0184l interfaceC0184l = (InterfaceC0184l) entry4.getValue();
            interfaceC2549c3.getClass();
            interfaceC0184l.getClass();
            interfaceC1111d.mo801a(interfaceC2549c3, (InterfaceC0184l) AbstractC1064u0.m3858f(interfaceC0184l, 1));
        }
        for (Map.Entry entry5 : this.f3341e.entrySet()) {
            InterfaceC2549c interfaceC2549c4 = (InterfaceC2549c) entry5.getKey();
            InterfaceC0184l interfaceC0184l2 = (InterfaceC0184l) entry5.getValue();
            interfaceC2549c4.getClass();
            interfaceC0184l2.getClass();
            interfaceC1111d.mo802b(interfaceC2549c4, (InterfaceC0184l) AbstractC1064u0.m3858f(interfaceC0184l2, 1));
        }
    }

    @Override // bd.AbstractC1109b
    /* JADX INFO: renamed from: b */
    public InterfaceC8647b mo4008b(InterfaceC2549c interfaceC2549c, List list) {
        interfaceC2549c.getClass();
        list.getClass();
        AbstractC1960a.m7104a(this.f3337a.get(interfaceC2549c));
        return null;
    }

    @Override // bd.AbstractC1109b
    /* JADX INFO: renamed from: d */
    public boolean mo4009d() {
        return this.f3342f;
    }

    @Override // bd.AbstractC1109b
    /* JADX INFO: renamed from: e */
    public InterfaceC8645a mo4010e(InterfaceC2549c interfaceC2549c, String str) {
        interfaceC2549c.getClass();
        Map map = (Map) this.f3340d.get(interfaceC2549c);
        InterfaceC8647b interfaceC8647b = map != null ? (InterfaceC8647b) map.get(str) : null;
        if (!(interfaceC8647b instanceof InterfaceC8647b)) {
            interfaceC8647b = null;
        }
        if (interfaceC8647b != null) {
            return interfaceC8647b;
        }
        Object obj = this.f3341e.get(interfaceC2549c);
        InterfaceC0184l interfaceC0184l = AbstractC1064u0.m3865m(obj, 1) ? (InterfaceC0184l) obj : null;
        if (interfaceC0184l != null) {
            return (InterfaceC8645a) interfaceC0184l.mo27m(str);
        }
        return null;
    }

    @Override // bd.AbstractC1109b
    /* JADX INFO: renamed from: f */
    public InterfaceC8662p mo4011f(InterfaceC2549c interfaceC2549c, Object obj) {
        interfaceC2549c.getClass();
        obj.getClass();
        if (!interfaceC2549c.mo3796y(obj)) {
            return null;
        }
        Map map = (Map) this.f3338b.get(interfaceC2549c);
        InterfaceC8647b interfaceC8647b = map != null ? (InterfaceC8647b) map.get(AbstractC1052o0.m3807b(obj.getClass())) : null;
        InterfaceC8647b interfaceC8647b2 = interfaceC8647b instanceof InterfaceC8662p ? interfaceC8647b : null;
        if (interfaceC8647b2 != null) {
            return interfaceC8647b2;
        }
        Object obj2 = this.f3339c.get(interfaceC2549c);
        InterfaceC0184l interfaceC0184l = AbstractC1064u0.m3865m(obj2, 1) ? (InterfaceC0184l) obj2 : null;
        if (interfaceC0184l != null) {
            return (InterfaceC8662p) interfaceC0184l.mo27m(obj);
        }
        return null;
    }
}

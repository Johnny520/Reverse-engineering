package p243q9;

import java.util.Iterator;
import java.util.List;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p213oa.C5692c;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: q9.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6340o implements InterfaceC6333h {

    /* JADX INFO: renamed from: q */
    public final List f19885q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6340o(InterfaceC6333h... interfaceC6333hArr) {
        this(AbstractC5106t.m20713V0(interfaceC6333hArr));
        interfaceC6333hArr.getClass();
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC6328c m25012e(C5692c c5692c, InterfaceC6333h interfaceC6333h) {
        interfaceC6333h.getClass();
        return interfaceC6333h.mo3926b(c5692c);
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC7282h m25013l(InterfaceC6333h interfaceC6333h) {
        interfaceC6333h.getClass();
        return AbstractC5081g0.m20555Y(interfaceC6333h);
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: b */
    public InterfaceC6328c mo3926b(C5692c c5692c) {
        c5692c.getClass();
        return (InterfaceC6328c) AbstractC7294t.m28895C(AbstractC7294t.m28902J(AbstractC5081g0.m20555Y(this.f19885q), new C6338m(c5692c)));
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: i */
    public boolean mo3927i(C5692c c5692c) {
        c5692c.getClass();
        Iterator it = AbstractC5081g0.m20555Y(this.f19885q).iterator();
        while (it.hasNext()) {
            if (((InterfaceC6333h) it.next()).mo3927i(c5692c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p243q9.InterfaceC6333h
    public boolean isEmpty() {
        List list = this.f19885q;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC6333h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC7294t.m28896D(AbstractC5081g0.m20555Y(this.f19885q), C6339n.f19884q).iterator();
    }

    public C6340o(List list) {
        list.getClass();
        this.f19885q = list;
    }
}

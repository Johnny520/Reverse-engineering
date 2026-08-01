package p243q9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p010a9.InterfaceC0184l;
import p213oa.C5692c;

/* JADX INFO: renamed from: q9.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6341p implements InterfaceC6333h {

    /* JADX INFO: renamed from: q */
    public final InterfaceC6333h f19886q;

    /* JADX INFO: renamed from: r */
    public final boolean f19887r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0184l f19888s;

    public C6341p(InterfaceC6333h interfaceC6333h, boolean z10, InterfaceC0184l interfaceC0184l) {
        interfaceC6333h.getClass();
        interfaceC0184l.getClass();
        this.f19886q = interfaceC6333h;
        this.f19887r = z10;
        this.f19888s = interfaceC0184l;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25014a(InterfaceC6328c interfaceC6328c) {
        C5692c c5692cMo5549d = interfaceC6328c.mo5549d();
        return c5692cMo5549d != null && ((Boolean) this.f19888s.mo27m(c5692cMo5549d)).booleanValue();
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: b */
    public InterfaceC6328c mo3926b(C5692c c5692c) {
        c5692c.getClass();
        if (((Boolean) this.f19888s.mo27m(c5692c)).booleanValue()) {
            return this.f19886q.mo3926b(c5692c);
        }
        return null;
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: i */
    public boolean mo3927i(C5692c c5692c) {
        c5692c.getClass();
        if (((Boolean) this.f19888s.mo27m(c5692c)).booleanValue()) {
            return this.f19886q.mo3927i(c5692c);
        }
        return false;
    }

    @Override // p243q9.InterfaceC6333h
    public boolean isEmpty() {
        boolean z10;
        InterfaceC6333h interfaceC6333h = this.f19886q;
        if ((interfaceC6333h instanceof Collection) && ((Collection) interfaceC6333h).isEmpty()) {
            z10 = false;
        } else {
            Iterator it = interfaceC6333h.iterator();
            while (it.hasNext()) {
                if (m25014a((InterfaceC6328c) it.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return this.f19887r ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        InterfaceC6333h interfaceC6333h = this.f19886q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : interfaceC6333h) {
            if (m25014a((InterfaceC6328c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6341p(InterfaceC6333h interfaceC6333h, InterfaceC0184l interfaceC0184l) {
        this(interfaceC6333h, false, interfaceC0184l);
        interfaceC6333h.getClass();
        interfaceC0184l.getClass();
    }
}

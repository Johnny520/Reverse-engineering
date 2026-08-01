package p182m5;

import ae.C0307f;
import bsh.C1259t2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import p154k5.C3991y;
import p254r5.C6496e0;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5001l extends AbstractC5028y0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f15205f;

    /* JADX INFO: renamed from: g */
    public ArrayList f15206g;

    public C5001l(C5009p c5009p) {
        super("class_defs", c5009p, 4);
        this.f15205f = new TreeMap();
        this.f15206g = null;
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        ArrayList arrayList = this.f15206g;
        return arrayList != null ? arrayList : this.f15205f.values();
    }

    @Override // p182m5.AbstractC5028y0
    /* JADX INFO: renamed from: q */
    public void mo20135q() {
        int size = this.f15205f.size();
        this.f15206g = new ArrayList(size);
        Iterator it = this.f15205f.keySet().iterator();
        int iM20184s = 0;
        while (it.hasNext()) {
            iM20184s = m20184s((C7188c) it.next(), iM20184s, size - iM20184s);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m20183r(C4999k c4999k) {
        try {
            C7188c c7188cM25760n = c4999k.m20177y().m25760n();
            m20279l();
            if (this.f15205f.get(c7188cM25760n) == null) {
                this.f15205f.put(c7188cM25760n, c4999k);
            } else {
                C0307f.m923a("already added: ", c7188cM25760n);
            }
        } catch (NullPointerException unused) {
            C1259t2.m5095a("clazz == null");
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m20184s(C7188c c7188c, int i10, int i11) {
        C4999k c4999k = (C4999k) this.f15205f.get(c7188c);
        if (c4999k == null || c4999k.m20099k()) {
            return i10;
        }
        if (i11 < 0) {
            C3991y.m15914a("class circularity with ", c7188c);
            return 0;
        }
        int i12 = i11 - 1;
        C6496e0 c6496e0M20176x = c4999k.m20176x();
        if (c6496e0M20176x != null) {
            i10 = m20184s(c6496e0M20176x.m25760n(), i10, i12);
        }
        InterfaceC7190e interfaceC7190eM20175w = c4999k.m20175w();
        int size = interfaceC7190eM20175w.size();
        for (int i13 = 0; i13 < size; i13++) {
            i10 = m20184s(interfaceC7190eM20175w.getType(i13), i10, i12);
        }
        c4999k.m20101m(i10);
        this.f15206g.add(c4999k);
        return i10 + 1;
    }

    /* JADX INFO: renamed from: t */
    public void m20185t(InterfaceC8819a interfaceC8819a) {
        m20278k();
        int size = this.f15205f.size();
        int iM20275f = size == 0 ? 0 : m20275f();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(4, "class_defs_size: " + AbstractC8826h.m33901j(size));
            interfaceC8819a.mo33825d(4, "class_defs_off:  " + AbstractC8826h.m33901j(iM20275f));
        }
        interfaceC8819a.writeInt(size);
        interfaceC8819a.writeInt(iM20275f);
    }
}

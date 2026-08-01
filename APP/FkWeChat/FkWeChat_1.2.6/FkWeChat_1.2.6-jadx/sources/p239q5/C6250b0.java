package p239q5;

import bsh.C1259t2;
import p239q5.AbstractC6257h;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;

/* JADX INFO: renamed from: q5.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6250b0 extends AbstractC6257h {

    /* JADX INFO: renamed from: u */
    public final InterfaceC7190e f19391u;

    public C6250b0(C6270u c6270u, C6274y c6274y, C6268s c6268s, InterfaceC7190e interfaceC7190e) {
        super(c6270u, c6274y, null, c6268s);
        if (c6270u.m24796b() != 6) {
            C6264o.m24729a("opcode with invalid branchingness: ", c6270u.m24796b());
            throw null;
        }
        if (interfaceC7190e != null) {
            this.f19391u = interfaceC7190e;
        } else {
            C1259t2.m5095a("catches == null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m24671v(InterfaceC7190e interfaceC7190e) {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("catch");
        int size = interfaceC7190e.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(" ");
            sb2.append(interfaceC7190e.getType(i10).mo6828g());
        }
        return sb2.toString();
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: a */
    public void mo24658a(AbstractC6257h.b bVar) {
        bVar.mo15700e(this);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: e */
    public InterfaceC7190e mo24659e() {
        return this.f19391u;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: f */
    public String mo24660f() {
        return m24671v(this.f19391u);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: s */
    public AbstractC6257h mo24661s(C7188c c7188c) {
        return new C6250b0(m24695j(), m24696k(), m24698o(), this.f19391u.mo8384h(c7188c));
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: t */
    public AbstractC6257h mo24662t(C6267r c6267r, C6268s c6268s) {
        return new C6250b0(m24695j(), m24696k(), c6268s, this.f19391u);
    }
}

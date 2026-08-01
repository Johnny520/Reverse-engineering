package p239q5;

import bsh.C1259t2;
import p239q5.AbstractC6257h;
import p254r5.AbstractC6487a;
import p254r5.C6492c0;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;

/* JADX INFO: renamed from: q5.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6248a0 extends AbstractC6253d {

    /* JADX INFO: renamed from: v */
    public final InterfaceC7190e f19386v;

    public C6248a0(C6270u c6270u, C6274y c6274y, C6268s c6268s, InterfaceC7190e interfaceC7190e, AbstractC6487a abstractC6487a) {
        super(c6270u, c6274y, null, c6268s, abstractC6487a);
        if (c6270u.m24796b() != 6) {
            C6264o.m24729a("opcode with invalid branchingness: ", c6270u.m24796b());
            throw null;
        }
        if (interfaceC7190e != null) {
            this.f19386v = interfaceC7190e;
        } else {
            C1259t2.m5095a("catches == null");
            throw null;
        }
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: a */
    public void mo24658a(AbstractC6257h.b bVar) {
        bVar.mo15701f(this);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: e */
    public InterfaceC7190e mo24659e() {
        return this.f19386v;
    }

    @Override // p239q5.AbstractC6253d, p239q5.AbstractC6257h
    /* JADX INFO: renamed from: f */
    public String mo24660f() {
        AbstractC6487a abstractC6487aM24688v = m24688v();
        String strMo6828g = abstractC6487aM24688v.mo6828g();
        if (abstractC6487aM24688v instanceof C6492c0) {
            strMo6828g = ((C6492c0) abstractC6487aM24688v).m25744v();
        }
        return strMo6828g + " " + C6250b0.m24671v(this.f19386v);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: s */
    public AbstractC6257h mo24661s(C7188c c7188c) {
        return new C6248a0(m24695j(), m24696k(), m24698o(), this.f19386v.mo8384h(c7188c), m24688v());
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: t */
    public AbstractC6257h mo24662t(C6267r c6267r, C6268s c6268s) {
        return new C6248a0(m24695j(), m24696k(), c6268s, this.f19386v, m24688v());
    }
}

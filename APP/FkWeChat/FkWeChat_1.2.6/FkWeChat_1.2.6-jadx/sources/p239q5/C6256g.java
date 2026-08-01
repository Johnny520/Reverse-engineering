package p239q5;

import java.util.ArrayList;
import p239q5.AbstractC6257h;
import p254r5.AbstractC6487a;
import p269s5.C7187b;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;

/* JADX INFO: renamed from: q5.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6256g extends AbstractC6257h {

    /* JADX INFO: renamed from: u */
    public final ArrayList f19414u;

    /* JADX INFO: renamed from: v */
    public final AbstractC6487a f19415v;

    public C6256g(C6270u c6270u, C6274y c6274y, C6268s c6268s, ArrayList arrayList, AbstractC6487a abstractC6487a) {
        super(c6270u, c6274y, null, c6268s);
        if (c6270u.m24796b() != 1) {
            C6264o.m24729a("opcode with invalid branchingness: ", c6270u.m24796b());
            throw null;
        }
        this.f19414u = arrayList;
        this.f19415v = abstractC6487a;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: a */
    public void mo24658a(AbstractC6257h.b bVar) {
        bVar.mo15705d(this);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: e */
    public InterfaceC7190e mo24659e() {
        return C7187b.f23814s;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: s */
    public AbstractC6257h mo24661s(C7188c c7188c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: t */
    public AbstractC6257h mo24662t(C6267r c6267r, C6268s c6268s) {
        return new C6256g(m24695j(), m24696k(), c6268s, this.f19414u, this.f19415v);
    }

    /* JADX INFO: renamed from: v */
    public AbstractC6487a m24690v() {
        return this.f19415v;
    }

    /* JADX INFO: renamed from: w */
    public ArrayList m24691w() {
        return this.f19414u;
    }
}

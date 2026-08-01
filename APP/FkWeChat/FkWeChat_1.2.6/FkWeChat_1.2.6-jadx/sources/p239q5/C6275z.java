package p239q5;

import bsh.C1259t2;
import p239q5.AbstractC6257h;
import p269s5.C7187b;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;
import p309v5.C8829k;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6275z extends AbstractC6257h {

    /* JADX INFO: renamed from: u */
    public final C8829k f19676u;

    public C6275z(C6270u c6270u, C6274y c6274y, C6267r c6267r, C6268s c6268s, C8829k c8829k) {
        super(c6270u, c6274y, c6267r, c6268s);
        if (c6270u.m24796b() != 5) {
            C9987e.m38645a("bogus branchingness");
            throw null;
        }
        if (c8829k != null) {
            this.f19676u = c8829k;
        } else {
            C1259t2.m5095a("cases == null");
            throw null;
        }
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: a */
    public void mo24658a(AbstractC6257h.b bVar) {
        bVar.mo15702g(this);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: c */
    public boolean mo24687c(AbstractC6257h abstractC6257h) {
        return false;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: e */
    public InterfaceC7190e mo24659e() {
        return C7187b.f23814s;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: f */
    public String mo24660f() {
        return this.f19676u.toString();
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: s */
    public AbstractC6257h mo24661s(C7188c c7188c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: t */
    public AbstractC6257h mo24662t(C6267r c6267r, C6268s c6268s) {
        return new C6275z(m24695j(), m24696k(), c6267r, c6268s, this.f19676u);
    }

    /* JADX INFO: renamed from: v */
    public C8829k m24861v() {
        return this.f19676u;
    }
}

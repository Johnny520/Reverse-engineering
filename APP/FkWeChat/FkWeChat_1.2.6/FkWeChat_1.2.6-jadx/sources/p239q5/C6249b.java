package p239q5;

import bsh.C1259t2;
import p215oc.C5725t;
import p309v5.AbstractC8826h;
import p309v5.C8829k;
import p309v5.InterfaceC8831m;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6249b implements InterfaceC8831m {

    /* JADX INFO: renamed from: a */
    public final int f19387a;

    /* JADX INFO: renamed from: b */
    public final C6258i f19388b;

    /* JADX INFO: renamed from: c */
    public final C8829k f19389c;

    /* JADX INFO: renamed from: d */
    public final int f19390d;

    /* JADX INFO: renamed from: q5.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6887a(C6249b c6249b);
    }

    public C6249b(int i10, C6258i c6258i, C8829k c8829k, int i11) {
        if (i10 < 0) {
            C9987e.m38645a("label < 0");
            throw null;
        }
        try {
            c6258i.m33930v();
            int size = c6258i.size();
            if (size == 0) {
                C9987e.m38645a("insns.size() == 0");
                throw null;
            }
            for (int i12 = size - 2; i12 >= 0; i12--) {
                if (c6258i.m24704G(i12).m24695j().m24796b() != 1) {
                    throw new IllegalArgumentException("insns[" + i12 + "] is a branch or can throw");
                }
            }
            if (c6258i.m24704G(size - 1).m24695j().m24796b() == 1) {
                C9987e.m38645a("insns does not end with a branch or throwing instruction");
                throw null;
            }
            try {
                c8829k.m33930v();
                if (i11 < -1) {
                    C9987e.m38645a("primarySuccessor < -1");
                    throw null;
                }
                if (i11 < 0 || c8829k.m33919y(i11)) {
                    this.f19387a = i10;
                    this.f19388b = c6258i;
                    this.f19389c = c8829k;
                    this.f19390d = i11;
                    return;
                }
                throw new IllegalArgumentException("primarySuccessor " + i11 + " not in successors " + c8829k);
            } catch (NullPointerException unused) {
                C1259t2.m5095a("successors == null");
                throw null;
            }
        } catch (NullPointerException unused2) {
            C1259t2.m5095a("insns == null");
            throw null;
        }
    }

    @Override // p309v5.InterfaceC8831m
    /* JADX INFO: renamed from: a */
    public int mo6715a() {
        return this.f19387a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m24663b() {
        return this.f19388b.m24705H().m24693b();
    }

    /* JADX INFO: renamed from: c */
    public AbstractC6257h m24664c() {
        return this.f19388b.m24704G(0);
    }

    /* JADX INFO: renamed from: d */
    public C6258i m24665d() {
        return this.f19388b;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC6257h m24666e() {
        return this.f19388b.m24705H();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public int m24667f() {
        return this.f19390d;
    }

    /* JADX INFO: renamed from: g */
    public int m24668g() {
        if (this.f19389c.size() == 2) {
            int iM33920z = this.f19389c.m33920z(0);
            return iM33920z == this.f19390d ? this.f19389c.m33920z(1) : iM33920z;
        }
        C5725t.m23179a("block doesn't have exactly two successors");
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public C8829k m24669h() {
        return this.f19389c;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX INFO: renamed from: i */
    public boolean m24670i() {
        return this.f19388b.m24705H().mo24659e().size() != 0;
    }

    public String toString() {
        return "{" + AbstractC8826h.m33898g(this.f19387a) + '}';
    }
}

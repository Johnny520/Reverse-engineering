package p045d5;

import bsh.C1259t2;
import p020b5.C0996b;
import p239q5.C6267r;
import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: d5.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1898t extends AbstractC1894p {

    /* JADX INFO: renamed from: r */
    public final InterfaceC7189d[] f5280r;

    public C1898t(int i10) {
        super(i10 != 0);
        this.f5280r = new InterfaceC7189d[i10];
    }

    /* JADX INFO: renamed from: K */
    public static InterfaceC7189d m6834K(int i10, String str) {
        throw new C1902x("local " + AbstractC8826h.m33898g(i10) + ": " + str);
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: A */
    public void mo6813A(C7188c c7188c) {
        int length = this.f5280r.length;
        if (length == 0) {
            return;
        }
        m33929u();
        C7188c c7188cM28421t = c7188c.m28421t();
        for (int i10 = 0; i10 < length; i10++) {
            InterfaceC7189d[] interfaceC7189dArr = this.f5280r;
            if (interfaceC7189dArr[i10] == c7188c) {
                interfaceC7189dArr[i10] = c7188cM28421t;
            }
        }
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: B */
    public AbstractC1894p mo6814B(AbstractC1894p abstractC1894p) {
        return abstractC1894p instanceof C1898t ? m6839J((C1898t) abstractC1894p) : abstractC1894p.mo6814B(this);
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: C */
    public C1895q mo6815C(AbstractC1894p abstractC1894p, int i10) {
        return new C1895q(m6836G()).mo6815C(abstractC1894p, i10);
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: D */
    public void mo6816D(int i10, InterfaceC7189d interfaceC7189d) {
        int i11;
        InterfaceC7189d interfaceC7189d2;
        m33929u();
        try {
            InterfaceC7189d interfaceC7189dMo6844r = interfaceC7189d.mo6844r();
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            if (interfaceC7189dMo6844r.getType().m28408B()) {
                this.f5280r[i10 + 1] = null;
            }
            InterfaceC7189d[] interfaceC7189dArr = this.f5280r;
            interfaceC7189dArr[i10] = interfaceC7189dMo6844r;
            if (i10 == 0 || (interfaceC7189d2 = interfaceC7189dArr[i10 - 1]) == null || !interfaceC7189d2.getType().m28408B()) {
                return;
            }
            this.f5280r[i11] = null;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("type == null");
        }
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: E */
    public void mo6817E(C6267r c6267r) {
        mo6816D(c6267r.m24754t(), c6267r);
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C1898t mo6819x() {
        C1898t c1898t = new C1898t(this.f5280r.length);
        InterfaceC7189d[] interfaceC7189dArr = this.f5280r;
        System.arraycopy(interfaceC7189dArr, 0, c1898t.f5280r, 0, interfaceC7189dArr.length);
        return c1898t;
    }

    /* JADX INFO: renamed from: G */
    public int m6836G() {
        return this.f5280r.length;
    }

    /* JADX INFO: renamed from: H */
    public InterfaceC7189d m6837H(int i10) {
        return this.f5280r[i10];
    }

    /* JADX INFO: renamed from: I */
    public void m6838I(int i10) {
        m33929u();
        this.f5280r[i10] = null;
    }

    /* JADX INFO: renamed from: J */
    public C1898t m6839J(C1898t c1898t) {
        try {
            return AbstractC1897s.m6831b(this, c1898t);
        } catch (C1902x e10) {
            e10.m3685a("underlay locals:");
            mo6818w(e10);
            e10.m3685a("overlay locals:");
            c1898t.mo6818w(e10);
            throw e10;
        }
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            InterfaceC7189d[] interfaceC7189dArr = this.f5280r;
            if (i10 >= interfaceC7189dArr.length) {
                return sb2.toString();
            }
            InterfaceC7189d interfaceC7189d = interfaceC7189dArr[i10];
            sb2.append("locals[" + AbstractC8826h.m33898g(i10) + "]: " + (interfaceC7189d == null ? "<invalid>" : interfaceC7189d.toString()) + "\n");
            i10++;
        }
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: w */
    public void mo6818w(C0996b c0996b) {
        int i10 = 0;
        while (true) {
            InterfaceC7189d[] interfaceC7189dArr = this.f5280r;
            if (i10 >= interfaceC7189dArr.length) {
                return;
            }
            InterfaceC7189d interfaceC7189d = interfaceC7189dArr[i10];
            c0996b.m3685a("locals[" + AbstractC8826h.m33898g(i10) + "]: " + (interfaceC7189d == null ? "<invalid>" : interfaceC7189d.toString()));
            i10++;
        }
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: y */
    public InterfaceC7189d mo6820y(int i10) {
        InterfaceC7189d interfaceC7189d = this.f5280r[i10];
        return interfaceC7189d == null ? m6834K(i10, "invalid") : interfaceC7189d;
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: z */
    public C1898t mo6821z() {
        return this;
    }
}

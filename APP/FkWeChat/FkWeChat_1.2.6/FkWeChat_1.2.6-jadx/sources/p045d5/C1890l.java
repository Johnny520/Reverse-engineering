package p045d5;

import bsh.C1259t2;
import p020b5.C0996b;
import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p309v5.AbstractC8826h;
import p309v5.AbstractC8834p;
import p376zd.C9987e;

/* JADX INFO: renamed from: d5.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1890l extends AbstractC8834p {

    /* JADX INFO: renamed from: r */
    public final InterfaceC7189d[] f5262r;

    /* JADX INFO: renamed from: s */
    public final boolean[] f5263s;

    /* JADX INFO: renamed from: t */
    public int f5264t;

    public C1890l(int i10) {
        super(i10 != 0);
        this.f5262r = new InterfaceC7189d[i10];
        this.f5263s = new boolean[i10];
        this.f5264t = 0;
    }

    /* JADX INFO: renamed from: I */
    public static String m6763I(InterfaceC7189d interfaceC7189d) {
        return interfaceC7189d == null ? "<invalid>" : interfaceC7189d.toString();
    }

    /* JADX INFO: renamed from: J */
    public static InterfaceC7189d m6764J(String str) {
        throw new C1902x("stack: " + str);
    }

    /* JADX INFO: renamed from: A */
    public void m6765A(C7188c c7188c) {
        if (this.f5264t == 0) {
            return;
        }
        m33929u();
        C7188c c7188cM28421t = c7188c.m28421t();
        for (int i10 = 0; i10 < this.f5264t; i10++) {
            InterfaceC7189d[] interfaceC7189dArr = this.f5262r;
            if (interfaceC7189dArr[i10] == c7188c) {
                interfaceC7189dArr[i10] = c7188cM28421t;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public C1890l m6766B(C1890l c1890l) {
        try {
            return AbstractC1897s.m6832c(this, c1890l);
        } catch (C1902x e10) {
            e10.m3685a("underlay stack:");
            m6773w(e10);
            e10.m3685a("overlay stack:");
            c1890l.m6773w(e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: C */
    public InterfaceC7189d m6767C(int i10) {
        if (i10 >= 0) {
            return i10 >= this.f5264t ? m6764J("underflow") : this.f5262r[(r0 - i10) - 1];
        }
        C9987e.m38645a("n < 0");
        return null;
    }

    /* JADX INFO: renamed from: D */
    public boolean m6768D(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("n < 0");
            return false;
        }
        if (i10 < this.f5264t) {
            return this.f5263s[(r0 - i10) - 1];
        }
        throw new C1902x("stack: underflow");
    }

    /* JADX INFO: renamed from: E */
    public C7188c m6769E(int i10) {
        return m6767C(i10).getType();
    }

    /* JADX INFO: renamed from: F */
    public InterfaceC7189d m6770F() {
        m33929u();
        InterfaceC7189d interfaceC7189dM6767C = m6767C(0);
        InterfaceC7189d[] interfaceC7189dArr = this.f5262r;
        int i10 = this.f5264t;
        interfaceC7189dArr[i10 - 1] = null;
        this.f5263s[i10 - 1] = false;
        this.f5264t = i10 - interfaceC7189dM6767C.getType().m28416j();
        return interfaceC7189dM6767C;
    }

    /* JADX INFO: renamed from: G */
    public void m6771G(InterfaceC7189d interfaceC7189d) {
        m33929u();
        try {
            InterfaceC7189d interfaceC7189dMo6844r = interfaceC7189d.mo6844r();
            int iM28416j = interfaceC7189dMo6844r.getType().m28416j();
            int i10 = this.f5264t;
            int i11 = i10 + iM28416j;
            InterfaceC7189d[] interfaceC7189dArr = this.f5262r;
            if (i11 > interfaceC7189dArr.length) {
                m6764J("overflow");
                return;
            }
            if (iM28416j == 2) {
                interfaceC7189dArr[i10] = null;
                this.f5264t = i10 + 1;
            }
            int i12 = this.f5264t;
            interfaceC7189dArr[i12] = interfaceC7189dMo6844r;
            this.f5264t = i12 + 1;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("type == null");
        }
    }

    /* JADX INFO: renamed from: H */
    public void m6772H() {
        m33929u();
        this.f5263s[this.f5264t] = true;
    }

    public int size() {
        return this.f5264t;
    }

    /* JADX INFO: renamed from: w */
    public void m6773w(C0996b c0996b) {
        int i10 = this.f5264t - 1;
        int i11 = 0;
        while (i11 <= i10) {
            c0996b.m3685a("stack[" + (i11 == i10 ? "top0" : AbstractC8826h.m33898g(i10 - i11)) + "]: " + m6763I(this.f5262r[i11]));
            i11++;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m6774x(int i10, InterfaceC7189d interfaceC7189d) {
        m33929u();
        try {
            InterfaceC7189d interfaceC7189dMo6844r = interfaceC7189d.mo6844r();
            int i11 = (this.f5264t - i10) - 1;
            InterfaceC7189d interfaceC7189d2 = this.f5262r[i11];
            if (interfaceC7189d2 == null || interfaceC7189d2.getType().m28416j() != interfaceC7189dMo6844r.getType().m28416j()) {
                m6764J("incompatible substitution: " + m6763I(interfaceC7189d2) + " -> " + m6763I(interfaceC7189dMo6844r));
            }
            this.f5262r[i11] = interfaceC7189dMo6844r;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("type == null");
        }
    }

    /* JADX INFO: renamed from: y */
    public void m6775y() {
        m33929u();
        for (int i10 = 0; i10 < this.f5264t; i10++) {
            this.f5262r[i10] = null;
            this.f5263s[i10] = false;
        }
        this.f5264t = 0;
    }

    /* JADX INFO: renamed from: z */
    public C1890l m6776z() {
        C1890l c1890l = new C1890l(this.f5262r.length);
        InterfaceC7189d[] interfaceC7189dArr = this.f5262r;
        System.arraycopy(interfaceC7189dArr, 0, c1890l.f5262r, 0, interfaceC7189dArr.length);
        boolean[] zArr = this.f5263s;
        System.arraycopy(zArr, 0, c1890l.f5263s, 0, zArr.length);
        c1890l.f5264t = this.f5264t;
        return c1890l;
    }
}

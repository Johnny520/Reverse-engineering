package p239q5;

import ae.C0306e;
import bsh.C1259t2;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p269s5.C7187b;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;
import p309v5.AbstractC8826h;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6270u {

    /* JADX INFO: renamed from: a */
    public final int f19454a;

    /* JADX INFO: renamed from: b */
    public final C7188c f19455b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7190e f19456c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7190e f19457d;

    /* JADX INFO: renamed from: e */
    public final int f19458e;

    /* JADX INFO: renamed from: f */
    public final boolean f19459f;

    /* JADX INFO: renamed from: g */
    public final String f19460g;

    public C6270u(int i10, C7188c c7188c, InterfaceC7190e interfaceC7190e, InterfaceC7190e interfaceC7190e2, int i11, boolean z10, String str) {
        if (c7188c == null) {
            C1259t2.m5095a("result == null");
            throw null;
        }
        if (interfaceC7190e == null) {
            C1259t2.m5095a("sources == null");
            throw null;
        }
        if (interfaceC7190e2 == null) {
            C1259t2.m5095a("exceptions == null");
            throw null;
        }
        if (i11 < 1 || i11 > 6) {
            C0306e.m922a("invalid branchingness: ", i11);
            throw null;
        }
        if (interfaceC7190e2.size() != 0 && i11 != 6) {
            C9987e.m38645a("exceptions / branchingness mismatch");
            throw null;
        }
        this.f19454a = i10;
        this.f19455b = c7188c;
        this.f19456c = interfaceC7190e;
        this.f19457d = interfaceC7190e2;
        this.f19458e = i11;
        this.f19459f = z10;
        this.f19460g = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24795a() {
        return this.f19457d.size() != 0;
    }

    /* JADX INFO: renamed from: b */
    public int m24796b() {
        return this.f19458e;
    }

    /* JADX INFO: renamed from: c */
    public String m24797c() {
        String str = this.f19460g;
        return str != null ? str : toString();
    }

    /* JADX INFO: renamed from: d */
    public int m24798d() {
        return this.f19454a;
    }

    /* JADX INFO: renamed from: e */
    public C7188c m24799e() {
        return this.f19455b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6270u)) {
            return false;
        }
        C6270u c6270u = (C6270u) obj;
        return this.f19454a == c6270u.f19454a && this.f19458e == c6270u.f19458e && this.f19455b == c6270u.f19455b && this.f19456c.equals(c6270u.f19456c) && this.f19457d.equals(c6270u.f19457d);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC7190e m24800f() {
        return this.f19456c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m24801g() {
        return this.f19459f;
    }

    /* JADX INFO: renamed from: h */
    public boolean m24802h() {
        int i10 = this.f19454a;
        if (i10 == 14 || i10 == 16) {
            return true;
        }
        switch (i10) {
            case 20:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.LLOAD /* 22 */:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return (((((((this.f19454a * 31) + this.f19458e) * 31) + this.f19455b.hashCode()) * 31) + this.f19456c.hashCode()) * 31) + this.f19457d.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Rop{");
        sb2.append(AbstractC6266q.m24731b(this.f19454a));
        if (this.f19455b != C7188c.f23828G) {
            sb2.append(" ");
            sb2.append(this.f19455b);
        } else {
            sb2.append(" .");
        }
        sb2.append(" <-");
        int size = this.f19456c.size();
        if (size == 0) {
            sb2.append(" .");
        } else {
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(' ');
                sb2.append(this.f19456c.getType(i10));
            }
        }
        if (this.f19459f) {
            sb2.append(" call");
        }
        int size2 = this.f19457d.size();
        if (size2 != 0) {
            sb2.append(" throws");
            for (int i11 = 0; i11 < size2; i11++) {
                sb2.append(' ');
                if (this.f19457d.getType(i11) == C7188c.f23840S) {
                    sb2.append("<any>");
                } else {
                    sb2.append(this.f19457d.getType(i11));
                }
            }
        } else {
            int i12 = this.f19458e;
            if (i12 == 1) {
                sb2.append(" flows");
            } else if (i12 == 2) {
                sb2.append(" returns");
            } else if (i12 == 3) {
                sb2.append(" gotos");
            } else if (i12 == 4) {
                sb2.append(" ifs");
            } else if (i12 != 5) {
                sb2.append(" " + AbstractC8826h.m33897f(this.f19458e));
            } else {
                sb2.append(" switches");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C6270u(int i10, C7188c c7188c, InterfaceC7190e interfaceC7190e, int i11, String str) {
        this(i10, c7188c, interfaceC7190e, C7187b.f23814s, i11, false, str);
    }

    public C6270u(int i10, C7188c c7188c, InterfaceC7190e interfaceC7190e, String str) {
        this(i10, c7188c, interfaceC7190e, C7187b.f23814s, 1, false, str);
    }

    public C6270u(int i10, C7188c c7188c, InterfaceC7190e interfaceC7190e, InterfaceC7190e interfaceC7190e2, String str) {
        this(i10, c7188c, interfaceC7190e, interfaceC7190e2, 6, false, str);
    }

    public C6270u(int i10, InterfaceC7190e interfaceC7190e, InterfaceC7190e interfaceC7190e2) {
        this(i10, C7188c.f23828G, interfaceC7190e, interfaceC7190e2, 6, true, null);
    }
}

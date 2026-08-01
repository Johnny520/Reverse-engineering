package p254r5;

import bsh.C1259t2;
import java.util.ArrayList;
import java.util.List;
import p269s5.C7186a;
import p269s5.C7188c;
import p376zd.C9987e;

/* JADX INFO: renamed from: r5.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6512q extends AbstractC6487a {

    /* JADX INFO: renamed from: q */
    public final int f20428q;

    /* JADX INFO: renamed from: r */
    public final C6521z f20429r;

    /* JADX INFO: renamed from: s */
    public final C7186a f20430s;

    /* JADX INFO: renamed from: t */
    public C6496e0 f20431t;

    /* JADX INFO: renamed from: u */
    public C6501h f20432u;

    /* JADX INFO: renamed from: v */
    public final List f20433v = new ArrayList();

    public C6512q(int i10, C6521z c6521z) {
        this.f20428q = i10;
        this.f20429r = c6521z;
        this.f20430s = C7186a.m28378c(c6521z.m25812k().mo6828g());
    }

    /* JADX INFO: renamed from: x */
    public static C6512q m25784x(int i10, C6521z c6521z) {
        return new C6512q(i10, c6521z);
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        C6512q c6512q = (C6512q) abstractC6487a;
        int iCompare = Integer.compare(this.f20428q, c6512q.m25786n());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f20429r.compareTo(c6512q.m25789t());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f20431t.compareTo(c6512q.m25788s());
        return iCompareTo2 != 0 ? iCompareTo2 : this.f20432u.compareTo(c6512q.m25787p());
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        C6496e0 c6496e0 = this.f20431t;
        return "InvokeDynamic(" + (c6496e0 != null ? c6496e0.mo6828g() : "Unknown") + ":" + this.f20428q + ", " + this.f20429r.mo6828g() + ")";
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "InvokeDynamic";
    }

    /* JADX INFO: renamed from: k */
    public C6503i m25785k() {
        C6503i c6503i = new C6503i(this, this.f20433v.size());
        this.f20433v.add(c6503i);
        return c6503i;
    }

    /* JADX INFO: renamed from: n */
    public int m25786n() {
        return this.f20428q;
    }

    /* JADX INFO: renamed from: p */
    public C6501h m25787p() {
        return this.f20432u;
    }

    /* JADX INFO: renamed from: s */
    public C6496e0 m25788s() {
        return this.f20431t;
    }

    /* JADX INFO: renamed from: t */
    public C6521z m25789t() {
        return this.f20429r;
    }

    public String toString() {
        return mo6828g();
    }

    /* JADX INFO: renamed from: u */
    public C7186a m25790u() {
        return this.f20430s;
    }

    /* JADX INFO: renamed from: v */
    public List m25791v() {
        return this.f20433v;
    }

    /* JADX INFO: renamed from: w */
    public C7188c m25792w() {
        return this.f20430s.m28388j();
    }

    /* JADX INFO: renamed from: y */
    public void m25793y(C6501h c6501h) {
        if (this.f20432u != null) {
            C9987e.m38645a("already added call site");
        } else if (c6501h != null) {
            this.f20432u = c6501h;
        } else {
            C1259t2.m5095a("callSite == null");
        }
    }

    /* JADX INFO: renamed from: z */
    public void m25794z(C6496e0 c6496e0) {
        if (this.f20431t != null) {
            C9987e.m38645a("already added declaring class");
        } else if (c6496e0 != null) {
            this.f20431t = c6496e0;
        } else {
            C1259t2.m5095a("declaringClass == null");
        }
    }
}

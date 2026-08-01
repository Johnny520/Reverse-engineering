package p182m5;

import bsh.C1193i2;
import bsh.C1259t2;
import java.util.Collection;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5012q0 {

    /* JADX INFO: renamed from: a */
    public final String f15278a;

    /* JADX INFO: renamed from: b */
    public final C5009p f15279b;

    /* JADX INFO: renamed from: c */
    public final int f15280c;

    /* JADX INFO: renamed from: d */
    public int f15281d;

    /* JADX INFO: renamed from: e */
    public boolean f15282e;

    public AbstractC5012q0(String str, C5009p c5009p, int i10) {
        if (c5009p == null) {
            C1259t2.m5095a("file == null");
            throw null;
        }
        m20270m(i10);
        this.f15278a = str;
        this.f15279b = c5009p;
        this.f15280c = i10;
        this.f15281d = -1;
        this.f15282e = false;
    }

    /* JADX INFO: renamed from: m */
    public static void m20270m(int i10) {
        if (i10 <= 0 || (i10 & (i10 - 1)) != 0) {
            C9987e.m38645a("invalid alignment");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20271a(InterfaceC8819a interfaceC8819a) {
        interfaceC8819a.mo33869l(this.f15280c);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo20186b(AbstractC4982b0 abstractC4982b0);

    /* JADX INFO: renamed from: c */
    public final int m20272c(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("relative < 0");
            return 0;
        }
        int i11 = this.f15281d;
        if (i11 >= 0) {
            return i11 + i10;
        }
        C1193i2.m4438a("fileOffset not yet set");
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m20273d() {
        return this.f15280c;
    }

    /* JADX INFO: renamed from: e */
    public final C5009p m20274e() {
        return this.f15279b;
    }

    /* JADX INFO: renamed from: f */
    public final int m20275f() {
        int i10 = this.f15281d;
        if (i10 >= 0) {
            return i10;
        }
        C1193i2.m4438a("fileOffset not set");
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public abstract Collection mo20137g();

    /* JADX INFO: renamed from: h */
    public final void m20276h() {
        m20279l();
        mo20187i();
        this.f15282e = true;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo20187i();

    /* JADX INFO: renamed from: j */
    public final int m20277j(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("fileOffset < 0");
            return 0;
        }
        if (this.f15281d >= 0) {
            C1193i2.m4438a("fileOffset already set");
            return 0;
        }
        int i11 = this.f15280c - 1;
        int i12 = (i10 + i11) & (~i11);
        this.f15281d = i12;
        return i12;
    }

    /* JADX INFO: renamed from: k */
    public final void m20278k() {
        if (this.f15282e) {
            return;
        }
        C1193i2.m4438a("not prepared");
    }

    /* JADX INFO: renamed from: l */
    public final void m20279l() {
        if (this.f15282e) {
            C1193i2.m4438a("already prepared");
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo20188n();

    /* JADX INFO: renamed from: o */
    public final void m20280o(InterfaceC8819a interfaceC8819a) {
        m20278k();
        m20271a(interfaceC8819a);
        int iMo33864c = interfaceC8819a.mo33864c();
        int i10 = this.f15281d;
        if (i10 < 0) {
            this.f15281d = iMo33864c;
        } else if (i10 != iMo33864c) {
            StringBuilder sb2 = new StringBuilder("alignment mismatch: for ");
            sb2.append(this);
            int i11 = this.f15281d;
            sb2.append(", at ");
            sb2.append(iMo33864c);
            sb2.append(", but expected ");
            sb2.append(i11);
            throw new RuntimeException(sb2.toString());
        }
        if (interfaceC8819a.mo33828k()) {
            if (this.f15278a != null) {
                interfaceC8819a.mo33825d(0, "\n" + this.f15278a + ":");
            } else if (iMo33864c != 0) {
                interfaceC8819a.mo33825d(0, "\n");
            }
        }
        mo20189p(interfaceC8819a);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo20189p(InterfaceC8819a interfaceC8819a);
}

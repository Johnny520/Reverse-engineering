package p307v0;

import bsh.org.objectweb.asm.Opcodes;
import java.util.Map;
import okio.C3193a;
import p015b0.C0152r;
import p015b0.C0153s;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.C1873q1;
import p117i0.C1876r1;
import p119i2.C1954y;
import p198nb.C2924a;
import p227p4.C3315t;
import p259r9.C3766p;
import p266s0.C3874d;
import p276sf.C3967n;
import p310v3.AbstractC4445a;

/* JADX INFO: renamed from: v0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4364d implements InterfaceC4363c {

    /* JADX INFO: renamed from: k */
    public static final C3315t f14567k = new C3315t(new C1954y(26), 12, new C3766p(10));

    /* JADX INFO: renamed from: g */
    public final Map f14568g;

    /* JADX INFO: renamed from: h */
    public final C0943k0 f14569h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4366f f14570i;

    /* JADX INFO: renamed from: j */
    public final C2924a f14571j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4364d(Map map) {
        this.f14568g = map;
        long[] jArr = AbstractC0957r0.f3015a;
        this.f14569h = new C0943k0();
        this.f14571j = new C2924a(this, 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4363c
    /* JADX INFO: renamed from: b */
    public final void mo8037b(Object obj, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(533563200);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4538h(obj) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(this) ? Opcodes.ACC_NATIVE : 128;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            c1836h0.m4529c0(obj);
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                C2924a c2924a = this.f14571j;
                if (!((Boolean) c2924a.invoke(obj)).booleanValue()) {
                    C3193a.m6819h(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.f14568g.get(obj);
                C1858m2 c1858m2 = AbstractC4368h.f14575a;
                C4369i c4369i = new C4369i(new C4367g(map, c2924a));
                c1836h0.m4545k0(c4369i);
                objM4514P = c4369i;
            }
            C4369i c4369i2 = (C4369i) objM4514P;
            AbstractC1874r.m4620b(new C1873q1[]{AbstractC4368h.f14575a.mo4582a(c4369i2), AbstractC4445a.f14756a.mo4582a(c4369i2)}, c3874d, c1836h0, (i10 & 112) | 8);
            boolean zM4538h = c1836h0.m4538h(this) | c1836h0.m4538h(obj) | c1836h0.m4538h(c4369i2);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4538h || objM4514P2 == c1823e) {
                objM4514P2 = new C0153s(this, obj, c4369i2, 19);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC1874r.m4621c(C3967n.f12976a, (InterfaceC1231l) objM4514P2, c1836h0);
            if (c1836h0.f6121y && c1836h0.f6082G.f7943i == c1836h0.f6122z) {
                c1836h0.f6122z = -1;
                c1836h0.f6121y = false;
            }
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(this, obj, c3874d, i9, 9);
        }
    }
}

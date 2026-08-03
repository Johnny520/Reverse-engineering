package p265s;

import bsh.org.objectweb.asm.Opcodes;
import java.util.Map;
import p015b0.C0152r;
import p069f.AbstractC0959s0;
import p069f.C0945l0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.C1876r1;
import p174m.C2576b;
import p198nb.C2924a;
import p266s0.C3874d;
import p307v0.AbstractC4368h;
import p307v0.C4364d;
import p307v0.C4367g;
import p307v0.InterfaceC4363c;
import p307v0.InterfaceC4365e;
import p307v0.InterfaceC4366f;

/* JADX INFO: renamed from: s.x0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3866x0 implements InterfaceC4366f, InterfaceC4363c {

    /* JADX INFO: renamed from: g */
    public final C4367g f12673g;

    /* JADX INFO: renamed from: h */
    public final C4364d f12674h;

    /* JADX INFO: renamed from: i */
    public final C0945l0 f12675i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3866x0(InterfaceC4366f interfaceC4366f, Map map, C4364d c4364d) {
        C2924a c2924a = new C2924a(interfaceC4366f, 8);
        C1858m2 c1858m2 = AbstractC4368h.f14575a;
        this.f12673g = new C4367g(map, c2924a);
        this.f12674h = c4364d;
        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
        this.f12675i = new C0945l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: a */
    public final boolean mo8036a(Object obj) {
        return this.f12673g.mo8036a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4363c
    /* JADX INFO: renamed from: b */
    public final void mo8037b(Object obj, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-858296452);
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
            this.f12674h.mo8037b(obj, c3874d, c1836h0, i10 & 126);
            boolean zM4538h = c1836h0.m4538h(this) | c1836h0.m4538h(obj);
            Object objM4514P = c1836h0.m4514P();
            if (zM4538h || objM4514P == C1851l.f6155a) {
                objM4514P = new C2576b(this, 13, obj);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC1874r.m4621c(obj, (InterfaceC1231l) objM4514P, c1836h0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(this, obj, c3874d, i9, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo8038c() {
        C0945l0 c0945l0 = this.f12675i;
        Object[] objArr = c0945l0.f2976b;
        long[] jArr = c0945l0.f2975a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i9 << 3) + i11];
                            C4364d c4364d = this.f12674h;
                            if (c4364d.f14569h.m2324k(obj) == null) {
                                c4364d.f14568g.remove(obj);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
        }
        return this.f12673g.mo8038c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: d */
    public final Object mo8039d(String str) {
        return this.f12673g.mo8039d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: e */
    public final InterfaceC4365e mo8040e(String str, InterfaceC1220a interfaceC1220a) {
        return this.f12673g.mo8040e(str, interfaceC1220a);
    }
}

package p251r;

import ac.C0058k;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import p085fg.InterfaceC1231l;
import p117i0.C1836h0;
import p117i0.C1876r1;
import p265s.AbstractC3847o;
import p265s.C3830g;
import p265s.C3835i;
import p266s0.AbstractC3879i;

/* JADX INFO: renamed from: r.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3626k {

    /* JADX INFO: renamed from: a */
    public final C3641z f11691a;

    /* JADX INFO: renamed from: b */
    public final C3623h f11692b;

    /* JADX INFO: renamed from: c */
    public final C3619d f11693c;

    /* JADX INFO: renamed from: d */
    public final C0058k f11694d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3626k(C3641z c3641z, C3623h c3623h, C3619d c3619d, C0058k c0058k) {
        this.f11691a = c3641z;
        this.f11692b = c3623h;
        this.f11693c = c3619d;
        this.f11694d = c0058k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7605a(int i9, Object obj, C1836h0 c1836h0, int i10) {
        int i11;
        Object obj2;
        C1836h0 c1836h02;
        c1836h0.m4527b0(-462424778);
        int i12 = (c1836h0.m4530d(i9) ? 4 : 2) | i10 | (c1836h0.m4538h(obj) ? 32 : 16) | (c1836h0.m4534f(this) ? Opcodes.ACC_NATIVE : 128);
        if (c1836h0.m4516S(i12 & 1, (i12 & 147) != 146)) {
            i11 = i9;
            obj2 = obj;
            c1836h02 = c1836h0;
            AbstractC3847o.m8015b(obj2, i11, this.f11691a.f11815s, AbstractC3879i.m8071e(-824725566, new C3624i(this, i9), c1836h0), c1836h02, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        } else {
            i11 = i9;
            obj2 = obj;
            c1836h02 = c1836h0;
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3625j(this, i11, obj2, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m7606b(int i9) {
        C3623h c3623h = this.f11692b;
        c3623h.getClass();
        C3835i c3835iM361l = c3623h.f11683a.m361l(i9);
        return ((InterfaceC1231l) c3835iM361l.f12564c.f470b).invoke(Integer.valueOf(i9 - c3835iM361l.f12562a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m7607c() {
        C3623h c3623h = this.f11692b;
        c3623h.getClass();
        return c3623h.f11683a.f176h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m7608d(int i9) {
        Object objInvoke;
        C0058k c0058k = this.f11694d;
        Object[] objArr = (Object[]) c0058k.f178j;
        int i10 = i9 - c0058k.f176h;
        Object obj = (i10 < 0 || i10 >= objArr.length) ? null : objArr[i10];
        if (obj != null) {
            return obj;
        }
        C3623h c3623h = this.f11692b;
        c3623h.getClass();
        C3835i c3835iM361l = c3623h.f11683a.m361l(i9);
        int i11 = i9 - c3835iM361l.f12562a;
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) c3835iM361l.f12564c.f469a;
        return (interfaceC1231l == null || (objInvoke = interfaceC1231l.invoke(Integer.valueOf(i11))) == null) ? new C3830g(i9) : objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3626k)) {
            return false;
        }
        return AbstractC1416l.m3825a(this.f11692b, ((C3626k) obj).f11692b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11692b.hashCode();
    }
}

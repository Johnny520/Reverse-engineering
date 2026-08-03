package p340x2;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.InterfaceC0112q;
import bsh.org.objectweb.asm.Opcodes;
import p041d1.C0651a0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1828f0;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p136j8.C2104o;
import p205o3.AbstractC3043a;
import p266s0.C3878h;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p294u3.InterfaceC4250c;
import p304uf.C4330d;
import p307v0.AbstractC4368h;
import p307v0.InterfaceC4366f;
import p308v1.C4392g1;
import p310v3.AbstractC4445a;
import p332wb.AbstractC4855en;
import p339x1.AbstractC5618k;
import p339x1.C5601f;
import p339x1.C5602f0;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.AbstractC5891i0;

/* JADX INFO: renamed from: x2.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5674i {

    /* JADX INFO: renamed from: a */
    public static final C4330d f23105a = new C4330d(6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m10234a(InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l2, C1836h0 c1836h0, int i9) {
        int i10;
        InterfaceC4250c interfaceC4250c;
        InterfaceC0112q interfaceC0112q;
        EnumC4243m enumC4243m;
        InterfaceC4233c interfaceC4233c;
        Object obj = C5667b.f23062k;
        c1836h0.m4527b0(-180024211);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4538h(interfaceC1231l) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5853o) ? 32 : 16;
        }
        int i11 = i10 | 384;
        if ((i9 & 3072) == 0) {
            i11 |= c1836h0.m4538h(obj) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= c1836h0.m4538h(interfaceC1231l2) ? 16384 : 8192;
        }
        if (c1836h0.m4516S(i11 & 1, (i11 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853o.mo10549d(C5680o.f23128a).mo10549d(C0651a0.f2018a).mo10549d(C5685t.f23137a).mo10549d(C5683r.f23134a));
            InterfaceC4233c interfaceC4233c2 = (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h);
            EnumC4243m enumC4243m2 = (EnumC4243m) c1836h0.m4542j(AbstractC5888h1.f23932n);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC0112q interfaceC0112q2 = (InterfaceC0112q) c1836h0.m4542j(AbstractC3043a.f9864a);
            InterfaceC4250c interfaceC4250c2 = (InterfaceC4250c) c1836h0.m4542j(AbstractC4445a.f14756a);
            c1836h0.m4525a0(1314774735);
            int i12 = i11 & 14;
            int iHashCode2 = Long.hashCode(c1836h0.f6095T);
            Context context = (Context) c1836h0.m4542j(AbstractC5891i0.f23946b);
            C1828f0 c1828f0M4642x = AbstractC1874r.m4642x(c1836h0);
            InterfaceC4366f interfaceC4366f = (InterfaceC4366f) c1836h0.m4542j(AbstractC4368h.f14575a);
            View view = (View) c1836h0.m4542j(AbstractC5891i0.f23950f);
            boolean zM4538h = c1836h0.m4538h(context) | ((((i12 & 14) ^ 6) > 4 && c1836h0.m4534f(interfaceC1231l)) || (i12 & 6) == 4) | c1836h0.m4538h(c1828f0M4642x) | c1836h0.m4538h(interfaceC4366f) | c1836h0.m4530d(iHashCode2) | c1836h0.m4538h(view);
            Object objM4514P = c1836h0.m4514P();
            if (zM4538h || objM4514P == C1851l.f6155a) {
                interfaceC4250c = interfaceC4250c2;
                interfaceC0112q = interfaceC0112q2;
                enumC4243m = enumC4243m2;
                interfaceC4233c = interfaceC4233c2;
                Object c5677l = new C5677l(context, interfaceC1231l, c1828f0M4642x, interfaceC4366f, iHashCode2, view);
                c1836h0.m4545k0(c5677l);
                objM4514P = c5677l;
            } else {
                interfaceC0112q = interfaceC0112q2;
                interfaceC4250c = interfaceC4250c2;
                enumC4243m = enumC4243m2;
                interfaceC4233c = interfaceC4233c2;
            }
            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P;
            c1836h0.m4520W(125, null, null, 1);
            c1836h0.f6114r = true;
            InterfaceC0112q interfaceC0112q3 = interfaceC0112q;
            if (c1836h0.f6094S) {
                c1836h0.m4544k(interfaceC1220a);
            } else {
                c1836h0.m4551n0();
            }
            InterfaceC5605g.f22815f.getClass();
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4615A(C5676k.f23113j, c1836h0, interfaceC5853oM10543c);
            AbstractC1874r.m4615A(C5676k.f23114k, c1836h0, interfaceC4233c);
            AbstractC1874r.m4615A(C5676k.f23115l, c1836h0, interfaceC0112q3);
            AbstractC1874r.m4615A(C5676k.f23116m, c1836h0, interfaceC4250c);
            AbstractC1874r.m4615A(C5676k.f23117n, c1836h0, enumC4243m);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            AbstractC1874r.m4615A(C5676k.f23111h, c1836h0, interfaceC1231l2);
            AbstractC1874r.m4615A(C5676k.f23112i, c1836h0, obj);
            c1836h0.m4553p(true);
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4392g1(interfaceC1231l, interfaceC5853o, interfaceC1231l2, i9, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m10235b(InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l2, C1836h0 c1836h0, int i9, int i10) {
        int i11;
        int i12;
        C5667b c5667b = C5667b.f23062k;
        c1836h0.m4527b0(-1783766393);
        if ((i9 & 6) == 0) {
            i11 = (c1836h0.m4538h(interfaceC1231l) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1836h0.m4534f(interfaceC5853o) ? 32 : 16;
        }
        int i13 = i10 & 4;
        if (i13 != 0) {
            i12 = i11 | 384;
        } else {
            i12 = i11 | (c1836h0.m4538h(interfaceC1231l2) ? Opcodes.ACC_NATIVE : 128);
        }
        if (c1836h0.m4516S(i12 & 1, (i12 & 147) != 146)) {
            if (i13 != 0) {
                interfaceC1231l2 = c5667b;
            }
            m10234a(interfaceC1231l, interfaceC5853o, interfaceC1231l2, c1836h0, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
        } else {
            c1836h0.m4519V();
        }
        InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C5675j(interfaceC1231l, interfaceC5853o, interfaceC1231l3, i9, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final View m10236c(AbstractC5852n abstractC5852n) {
        C5687v c5687v = AbstractC5618k.m10167w(abstractC5852n.f23788g).f22804u;
        View interopView = c5687v != null ? c5687v.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C2104o.m5276A("Could not fetch interop view");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m10237d(C5687v c5687v, C5602f0 c5602f0) {
        long jMo8868m0 = c5602f0.f22778L.f22716c.mo8868m0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo8868m0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo8868m0 & 4294967295L)));
        c5687v.layout(iRound, iRound2, c5687v.getMeasuredWidth() + iRound, c5687v.getMeasuredHeight() + iRound2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C5687v m10238e(C5602f0 c5602f0) {
        C5687v c5687v = c5602f0.f22804u;
        if (c5687v != null) {
            return c5687v;
        }
        throw AbstractC4855en.m9257a("Required value was null.");
    }
}

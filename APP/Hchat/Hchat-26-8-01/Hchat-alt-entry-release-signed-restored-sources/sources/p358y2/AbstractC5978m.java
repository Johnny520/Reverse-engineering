package p358y2;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bsh.org.objectweb.asm.Opcodes;
import ci.C0589j;
import java.util.UUID;
import p071f1.C1021p;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1828f0;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.C1883u;
import p117i0.InterfaceC1809a1;
import p266s0.C3874d;
import p266s0.C3878h;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p307v0.AbstractC4371k;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4412n0;
import p321w.C4624o1;
import p339x1.C5601f;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.AbstractC5891i0;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: y2.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5978m {

    /* JADX INFO: renamed from: a */
    public static final C1883u f24291a = new C1883u(C5968d.f24258j);

    /* JADX INFO: renamed from: b */
    public static final C1883u f24292b = new C1883u(C5968d.f24257i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10712a(InterfaceC5965b0 interfaceC5965b0, InterfaceC1220a interfaceC1220a, C5967c0 c5967c0, C3874d c3874d, C1836h0 c1836h0, int i9, int i10) {
        int i11;
        InterfaceC1220a interfaceC1220a2;
        C5967c0 c5967c02;
        int i12;
        InterfaceC1220a interfaceC1220a3;
        C1876r1 c1876r1M4557t;
        String str;
        InterfaceC5557c interfaceC5557c;
        boolean z9;
        int i13;
        C5989x c5989x;
        EnumC4243m enumC4243m;
        InterfaceC5965b0 interfaceC5965b02 = interfaceC5965b0;
        c1836h0.m4527b0(-1772091631);
        if ((i9 & 6) == 0) {
            i11 = (c1836h0.m4534f(interfaceC5965b02) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        int i14 = i10 & 2;
        if (i14 == 0) {
            if ((i9 & 48) == 0) {
                interfaceC1220a2 = interfaceC1220a;
                i11 |= c1836h0.m4538h(interfaceC1220a2) ? 32 : 16;
            }
            if ((i9 & 384) != 0) {
                c5967c02 = c5967c0;
                i11 |= c1836h0.m4534f(c5967c02) ? Opcodes.ACC_NATIVE : 128;
            } else {
                c5967c02 = c5967c0;
            }
            if ((i9 & 3072) == 0) {
                i11 |= c1836h0.m4538h(c3874d) ? Opcodes.ACC_STRICT : 1024;
            }
            i12 = i11;
            if (c1836h0.m4516S(i12 & 1, (i12 & 1171) == 1170)) {
                c1836h0.m4519V();
                interfaceC1220a3 = interfaceC1220a2;
            } else {
                InterfaceC1220a interfaceC1220a4 = i14 != 0 ? null : interfaceC1220a2;
                View view = (View) c1836h0.m4542j(AbstractC5891i0.f23950f);
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h);
                String str2 = (String) c1836h0.m4542j(f24291a);
                EnumC4243m enumC4243m2 = (EnumC4243m) c1836h0.m4542j(AbstractC5888h1.f23932n);
                C1828f0 c1828f0M4642x = AbstractC1874r.m4642x(c1836h0);
                InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(c3874d, c1836h0);
                Object[] objArr = new Object[0];
                Object objM4514P = c1836h0.m4514P();
                Object obj = C1851l.f6155a;
                if (objM4514P == obj) {
                    objM4514P = C5968d.f24259k;
                    c1836h0.m4545k0(objM4514P);
                }
                UUID uuid = (UUID) AbstractC4371k.m8805c(objArr, (InterfaceC1220a) objM4514P, c1836h0, 48);
                boolean zBooleanValue = ((Boolean) c1836h0.m4542j(f24292b)).booleanValue();
                Object objM4514P2 = c1836h0.m4514P();
                if (objM4514P2 == obj) {
                    str = str2;
                    interfaceC5557c = null;
                    z9 = false;
                    C5989x c5989x2 = new C5989x(interfaceC1220a4, c5967c02, str, view, interfaceC4233c, interfaceC5965b02, uuid, zBooleanValue);
                    interfaceC5965b02 = interfaceC5965b02;
                    c5989x2.m10725n(c1828f0M4642x, new C3874d(-297523940, new C5977l(c5989x2, interfaceC1809a1M4643y, 1), true));
                    c1836h0.m4545k0(c5989x2);
                    objM4514P2 = c5989x2;
                } else {
                    str = str2;
                    interfaceC5557c = null;
                    z9 = false;
                }
                C5989x c5989x3 = (C5989x) objM4514P2;
                int i15 = i12 & 112;
                int i16 = i12 & 896;
                boolean zM4538h = c1836h0.m4538h(c5989x3) | (i15 == 32 ? true : z9) | (i16 == 256 ? true : z9) | c1836h0.m4534f(str) | c1836h0.m4530d(enumC4243m2.ordinal());
                Object objM4514P3 = c1836h0.m4514P();
                if (zM4538h || objM4514P3 == obj) {
                    i13 = i12;
                    c5989x = c5989x3;
                    Object c5972g = new C5972g(c5989x, interfaceC1220a4, c5967c0, str, enumC4243m2);
                    c1836h0.m4545k0(c5972g);
                    objM4514P3 = c5972g;
                } else {
                    i13 = i12;
                    c5989x = c5989x3;
                }
                AbstractC1874r.m4621c(c5989x, (InterfaceC1231l) objM4514P3, c1836h0);
                boolean zM4538h2 = c1836h0.m4538h(c5989x) | (i15 == 32 ? true : z9) | (i16 == 256 ? true : z9) | c1836h0.m4534f(str) | c1836h0.m4530d(enumC4243m2.ordinal());
                Object objM4514P4 = c1836h0.m4514P();
                if (zM4538h2 || objM4514P4 == obj) {
                    Object c5973h = new C5973h(c5989x, interfaceC1220a4, c5967c0, str, enumC4243m2);
                    enumC4243m = enumC4243m2;
                    c1836h0.m4545k0(c5973h);
                    objM4514P4 = c5973h;
                } else {
                    enumC4243m = enumC4243m2;
                }
                AbstractC1874r.m4628j((InterfaceC1220a) objM4514P4, c1836h0);
                boolean zM4538h3 = c1836h0.m4538h(c5989x) | ((i13 & 14) == 4 ? true : z9);
                Object objM4514P5 = c1836h0.m4514P();
                if (zM4538h3 || objM4514P5 == obj) {
                    objM4514P5 = new C1021p(c5989x, 12, interfaceC5965b02);
                    c1836h0.m4545k0(objM4514P5);
                }
                AbstractC1874r.m4621c(interfaceC5965b02, (InterfaceC1231l) objM4514P5, c1836h0);
                boolean zM4538h4 = c1836h0.m4538h(c5989x);
                Object objM4514P6 = c1836h0.m4514P();
                if (zM4538h4 || objM4514P6 == obj) {
                    objM4514P6 = new C0589j(c5989x, interfaceC5557c, 29);
                    c1836h0.m4545k0(objM4514P6);
                }
                AbstractC1874r.m4624f((InterfaceC1235p) objM4514P6, c1836h0, c5989x);
                boolean zM4538h5 = c1836h0.m4538h(c5989x);
                Object objM4514P7 = c1836h0.m4514P();
                if (zM4538h5 || objM4514P7 == obj) {
                    objM4514P7 = new C5975j(c5989x, 0);
                    c1836h0.m4545k0(objM4514P7);
                }
                InterfaceC5853o interfaceC5853oM8889m = AbstractC4434w.m8889m(C5850l.f23787a, (InterfaceC1231l) objM4514P7);
                boolean zM4538h6 = c1836h0.m4538h(c5989x) | c1836h0.m4530d(enumC4243m.ordinal());
                Object objM4514P8 = c1836h0.m4514P();
                if (zM4538h6 || objM4514P8 == obj) {
                    objM4514P8 = new C4624o1(c5989x, 1, enumC4243m);
                    c1836h0.m4545k0(objM4514P8);
                }
                InterfaceC4412n0 interfaceC4412n0 = (InterfaceC4412n0) objM4514P8;
                int iHashCode = Long.hashCode(c1836h0.f6095T);
                C3878h c3878hM4546l = c1836h0.m4546l();
                InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM8889m);
                InterfaceC5605g.f22815f.getClass();
                InterfaceC1220a interfaceC1220a5 = C5601f.f22758b;
                c1836h0.m4531d0();
                if (c1836h0.f6094S) {
                    c1836h0.m4544k(interfaceC1220a5);
                } else {
                    c1836h0.m4551n0();
                }
                AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0);
                AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                c1836h0.m4553p(true);
                interfaceC1220a3 = interfaceC1220a4;
            }
            c1876r1M4557t = c1836h0.m4557t();
            if (c1876r1M4557t == null) {
                c1876r1M4557t.f6241d = new C5976k(interfaceC5965b02, interfaceC1220a3, c5967c0, c3874d, i9, i10);
                return;
            }
            return;
        }
        i11 |= 48;
        interfaceC1220a2 = interfaceC1220a;
        if ((i9 & 384) != 0) {
        }
        if ((i9 & 3072) == 0) {
        }
        i12 = i11;
        if (c1836h0.m4516S(i12 & 1, (i12 & 1171) == 1170)) {
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m10713b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}

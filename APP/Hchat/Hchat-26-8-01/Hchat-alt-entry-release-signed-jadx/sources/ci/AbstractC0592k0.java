package ci;

import android.view.View;
import android.view.ViewParent;
import p015b0.C0136d0;
import p036c9.C0468n1;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p144k.AbstractC2217v0;
import p187n.C2857k;
import p356y0.AbstractC5839a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5891i0;

/* JADX INFO: renamed from: ci.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0592k0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1603a(C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(890249590);
        if (c1836h0.m4516S(i9 & 1, i9 != 0)) {
            ViewParent parent = ((View) c1836h0.m4542j(AbstractC5891i0.f23950f)).getParent();
            boolean zM4538h = c1836h0.m4538h(parent);
            Object objM4514P = c1836h0.m4514P();
            if (zM4538h || objM4514P == C1851l.f6155a) {
                objM4514P = new C0136d0(parent, 8);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC1874r.m4621c(parent, (InterfaceC1231l) objM4514P, c1836h0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0468n1(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static float m1604b(float f3, float f10) {
        float fAbs = Math.abs(f3);
        double dMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
        double d10 = f10;
        float fAbs2 = Math.abs((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * d10));
        if (fAbs <= 0.0f) {
            return 0.0f;
        }
        if (fAbs >= fAbs2) {
            fAbs = fAbs2;
        }
        double d11 = d10 - (((double) fAbs) * 3.0d);
        return (float) (d10 - (Math.pow(Math.abs(d11), 0.3333333333333333d) * (Math.signum(d11) * Math.pow(d10, 0.6666666666666666d))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static InterfaceC5853o m1605c(InterfaceC5853o interfaceC5853o, C2857k c2857k, C0600o0 c0600o0, boolean z9) {
        InterfaceC5853o interfaceC5853oMo10549d;
        interfaceC5853o.getClass();
        if (c0600o0 != null) {
            interfaceC5853oMo10549d = new C0588i0(c2857k, c0600o0, z9);
        } else if (c0600o0 == null) {
            interfaceC5853oMo10549d = new C0588i0(c2857k, null, z9);
        } else {
            C5850l c5850l = C5850l.f23787a;
            interfaceC5853oMo10549d = c2857k != null ? AbstractC2217v0.m5456a(c5850l, c2857k, c0600o0).mo10549d(new C0588i0(c2857k, null, z9)) : AbstractC5839a.m10541a(c5850l, new C0590j0(c0600o0, z9));
        }
        return interfaceC5853o.mo10549d(interfaceC5853oMo10549d);
    }
}

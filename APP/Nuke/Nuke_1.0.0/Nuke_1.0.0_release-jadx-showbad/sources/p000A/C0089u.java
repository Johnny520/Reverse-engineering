package p000A;

import com.bumptech.glide.AbstractC1922d;
import me.dartcv.nuke.BuildConfig;
import p029F0.AbstractC0435z;
import p029F0.InterfaceC0430v;
import p056K2.C0891q;
import p058L.C0920W;
import p092S0.C1259L;
import p112W2.InterfaceC1601c;
import p204n0.C2684c;

/* JADX INFO: renamed from: A.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0089u implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f400d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0920W f401e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0089u(C0920W c0920w, int i5) {
        this.f400d = i5;
        this.f401e = c0920w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1h(Object obj) {
        C2684c c2684c;
        InterfaceC0430v interfaceC0430vM122c;
        char c5;
        long jMo638R;
        long j5;
        long jMo638R2;
        float fIntBitsToFloat;
        InterfaceC0430v interfaceC0430vM122c2;
        InterfaceC0430v interfaceC0430vM122c3;
        InterfaceC0430v interfaceC0430vM122c4;
        InterfaceC0430v interfaceC0430vM122c5;
        int i5 = this.f400d;
        C0920W c0920w = this.f401e;
        switch (i5) {
            case 0:
                return new C0028O(0, c0920w);
            case BuildConfig.VERSION_CODE /* 1 */:
                c0920w.m1943r();
                return C0891q.f2780a;
            default:
                InterfaceC0430v interfaceC0430v = (InterfaceC0430v) obj;
                C0078o0 c0078o0 = c0920w.f2868d;
                C2684c c2684c2 = C2684c.f8557e;
                if (c0078o0 == null) {
                    c2684c = c2684c2;
                } else {
                    if (c0078o0.f352p) {
                        c0078o0 = null;
                    }
                    if (c0078o0 != null) {
                        C0042V0 c0042v0 = c0920w.f2866b;
                        long j6 = c0920w.m1939n().f5651b;
                        int i6 = C1259L.f4537c;
                        int i7 = (int) (j6 >> 32);
                        c0042v0.m57a(i7);
                        C0042V0 c0042v02 = c0920w.f2866b;
                        int i8 = (int) (c0920w.m1939n().f5651b & 4294967295L);
                        c0042v02.m57a(i8);
                        C0078o0 c0078o02 = c0920w.f2868d;
                        if (c0078o02 == null || (interfaceC0430vM122c5 = c0078o02.m122c()) == null) {
                            c5 = ' ';
                            jMo638R = 0;
                        } else {
                            c5 = ' ';
                            jMo638R = interfaceC0430vM122c5.mo638R(c0920w.m1937l(true));
                        }
                        C0078o0 c0078o03 = c0920w.f2868d;
                        if (c0078o03 == null || (interfaceC0430vM122c4 = c0078o03.m122c()) == null) {
                            j5 = 4294967295L;
                            jMo638R2 = 0;
                        } else {
                            j5 = 4294967295L;
                            jMo638R2 = interfaceC0430vM122c4.mo638R(c0920w.m1937l(false));
                        }
                        C0078o0 c0078o04 = c0920w.f2868d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (c0078o04 == null || (interfaceC0430vM122c3 = c0078o04.m122c()) == null) {
                            fIntBitsToFloat = 0.0f;
                        } else {
                            C0036S0 c0036s0M123d = c0078o0.m123d();
                            fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0430vM122c3.mo638R((((long) Float.floatToRawIntBits(0.0f)) << c5) | (((long) Float.floatToRawIntBits(c0036s0M123d != null ? c0036s0M123d.f161a.m2326c(i7).f8559b : 0.0f)) & j5)) & j5));
                        }
                        C0078o0 c0078o05 = c0920w.f2868d;
                        if (c0078o05 != null && (interfaceC0430vM122c2 = c0078o05.m122c()) != null) {
                            C0036S0 c0036s0M123d2 = c0078o0.m123d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0430vM122c2.mo638R((((long) Float.floatToRawIntBits(0.0f)) << c5) | (((long) Float.floatToRawIntBits(c0036s0M123d2 != null ? c0036s0M123d2.f161a.m2326c(i8).f8559b : 0.0f)) & j5)) & j5));
                        }
                        int i9 = (int) (jMo638R >> c5);
                        int i10 = (int) (jMo638R2 >> c5);
                        c2684c = new C2684c(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), (c0078o0.f337a.f408g.mo272b() * 25) + Math.max(Float.intBitsToFloat((int) (jMo638R & j5)), Float.intBitsToFloat((int) (jMo638R2 & j5))));
                    }
                }
                C0078o0 c0078o06 = c0920w.f2868d;
                if (c0078o06 == null || (interfaceC0430vM122c = c0078o06.m122c()) == null) {
                    return null;
                }
                return (interfaceC0430vM122c.mo632D() && interfaceC0430v.mo632D()) ? AbstractC1922d.m3425d(interfaceC0430v.mo636P(AbstractC0435z.m693f(interfaceC0430vM122c), c2684c.m4653d()), c2684c.m4652c()) : c2684c2;
        }
    }
}

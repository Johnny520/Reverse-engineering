package p260x;

import java.util.Map;
import p000A.C0010F;
import p008B1.C0214b;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p136b0.C1843e;
import p152e0.AbstractC2001h;
import p152e0.C1997d;
import p152e0.C2000g;
import p152e0.InterfaceC1996c;
import p152e0.InterfaceC1998e;
import p152e0.InterfaceC1999f;
import p186k.AbstractC2416M;
import p186k.C2409F;

/* JADX INFO: renamed from: x.N */
/* JADX INFO: loaded from: classes.dex */
public final class C3408N implements InterfaceC1999f, InterfaceC1996c {

    /* JADX INFO: renamed from: d */
    public final C2000g f10655d;

    /* JADX INFO: renamed from: e */
    public final C1997d f10656e;

    /* JADX INFO: renamed from: f */
    public final C2409F f10657f;

    public C3408N(InterfaceC1999f interfaceC1999f, Map map, C1997d c1997d) {
        C3407M c3407m = new C3407M(0, interfaceC1999f);
        C1341U0 c1341u0 = AbstractC2001h.f6721a;
        this.f10655d = new C2000g(map, c3407m);
        this.f10656e = c1997d;
        C2409F c2409f = AbstractC2416M.f7817a;
        this.f10657f = new C2409F();
    }

    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: a */
    public final boolean mo1275a(Object obj) {
        return this.f10655d.mo1275a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo1276b() {
        /*
            r14 = this;
            k.F r0 = r14.f10657f
            java.lang.Object[] r1 = r0.f7794b
            long[] r0 = r0.f7793a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L51
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L4a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L46
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            e0.d r11 = r14.f10656e
            k.E r12 = r11.f6715e
            java.lang.Object r12 = r12.m4276k(r10)
            if (r12 != 0) goto L46
            java.util.Map r11 = r11.f6714d
            r11.remove(r10)
        L46:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L4a:
            if (r7 != r8) goto L51
        L4c:
            if (r4 == r2) goto L51
            int r4 = r4 + 1
            goto Ld
        L51:
            e0.g r0 = r14.f10655d
            java.util.Map r0 = r0.mo1276b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p260x.C3408N.mo1276b():java.util.Map");
    }

    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: c */
    public final Object mo1277c(String str) {
        return this.f10655d.mo1277c(str);
    }

    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: d */
    public final InterfaceC1998e mo1278d(String str, InterfaceC1599a interfaceC1599a) {
        return this.f10655d.mo1278d(str, interfaceC1599a);
    }

    @Override // p152e0.InterfaceC1996c
    /* JADX INFO: renamed from: e */
    public final void mo3667e(Object obj, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-858296452);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(obj) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(this) ? 256 : 128;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            this.f10656e.mo3667e(obj, c1843e, c1383r, i6 & 126);
            boolean zM2586h = c1383r.m2586h(this) | c1383r.m2586h(obj);
            Object objM2558L = c1383r.m2558L();
            if (zM2586h || objM2558L == C1371l.f4833a) {
                objM2558L = new C0010F(25, this, obj);
                c1383r.m2585g0(objM2558L);
            }
            AbstractC1385s.m2613c(obj, (InterfaceC1601c) objM2558L, c1383r);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(this, obj, c1843e, i5, 10);
        }
    }
}

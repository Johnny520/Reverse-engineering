package p227r;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;
import p000A.C0049a;
import p001A0.C0105e;
import p001A0.C0110j;
import p023E0.AbstractC0277a;
import p034G.C0466k;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p041H0.InterfaceC0558E0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p105V.C1483e;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p204n0.C2683b;
import p216p.C2847h;
import p216p.EnumC2824Q;

/* JADX INFO: renamed from: r.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2940A0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC3017u0 f9270a;

    /* JADX INFO: renamed from: b */
    public C2847h f9271b;

    /* JADX INFO: renamed from: c */
    public C2996k f9272c;

    /* JADX INFO: renamed from: d */
    public EnumC2983d0 f9273d;

    /* JADX INFO: renamed from: e */
    public boolean f9274e;

    /* JADX INFO: renamed from: f */
    public C0105e f9275f;

    /* JADX INFO: renamed from: g */
    public final C3015t0 f9276g;

    /* JADX INFO: renamed from: h */
    public final C3009q0 f9277h;

    /* JADX INFO: renamed from: i */
    public boolean f9278i;

    /* JADX INFO: renamed from: j */
    public int f9279j = 1;

    /* JADX INFO: renamed from: k */
    public InterfaceC2991h0 f9280k = AbstractC3005o0.f9510b;

    /* JADX INFO: renamed from: l */
    public final C3025y0 f9281l = new C3025y0(this);

    /* JADX INFO: renamed from: m */
    public final C0049a f9282m = new C0049a(26, this);

    public C2940A0(InterfaceC3017u0 interfaceC3017u0, C2847h c2847h, C2996k c2996k, EnumC2983d0 enumC2983d0, boolean z5, C0105e c0105e, C3015t0 c3015t0, C3009q0 c3009q0) {
        this.f9270a = interfaceC3017u0;
        this.f9271b = c2847h;
        this.f9272c = c2996k;
        this.f9273d = enumC2983d0;
        this.f9274e = z5;
        this.f9275f = c0105e;
        this.f9276g = c3015t0;
        this.f9277h = c3009q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5141a(long r11, p084Q2.AbstractC1178c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p227r.C3019v0
            if (r0 == 0) goto L13
            r0 = r13
            r.v0 r0 = (p227r.C3019v0) r0
            int r1 = r0.f9572j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9572j = r1
            goto L18
        L13:
            r.v0 r0 = new r.v0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f9570h
            int r1 = r0.f9572j
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            X2.s r11 = r0.f9569g
            p127Z2.AbstractC1784a.m3205S(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L59
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L69
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            p127Z2.AbstractC1784a.m3205S(r13)
            X2.s r6 = new X2.s
            r6.<init>()
            r6.f5708d = r11
            r10.f9278i = r3
            p.Q r13 = p216p.EnumC2824Q.f8890d     // Catch: java.lang.Throwable -> L66
            r.x0 r4 = new r.x0     // Catch: java.lang.Throwable -> L66
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L63
            r0.f9569g = r6     // Catch: java.lang.Throwable -> L63
            r0.f9572j = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r11 = r10.m5146f(r13, r4, r0)     // Catch: java.lang.Throwable -> L63
            P2.a r12 = p079P2.EnumC1152a.f3788d
            if (r11 != r12) goto L58
            return r12
        L58:
            r11 = r6
        L59:
            r5.f9278i = r2
            long r11 = r11.f5708d
            e1.q r13 = new e1.q
            r13.<init>(r11)
            return r13
        L63:
            r0 = move-exception
        L64:
            r11 = r0
            goto L69
        L66:
            r0 = move-exception
            r5 = r10
            goto L64
        L69:
            r5.f9278i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C2940A0.m5141a(long, Q2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5142b(long r5, boolean r7, p084Q2.AbstractC1184i r8) {
        /*
            r4 = this;
            K2.q r0 = p056K2.C0891q.f2780a
            if (r7 == 0) goto La
            r.k r7 = r4.f9272c
            n.f0 r1 = p227r.AbstractC3005o0.f9509a
            if (r7 != 0) goto L4a
        La:
            r.d0 r7 = r4.f9273d
            r.d0 r1 = p227r.EnumC2983d0.f9448e
            r2 = 0
            if (r7 != r1) goto L17
            r7 = 1
        L12:
            long r5 = p153e1.C2021q.m3713a(r5, r2, r2, r7)
            goto L19
        L17:
            r7 = 2
            goto L12
        L19:
            r.z0 r7 = new r.z0
            r1 = 0
            r7.<init>(r4, r1)
            p.h r1 = r4.f9271b
            P2.a r2 = p079P2.EnumC1152a.f3788d
            if (r1 == 0) goto L3c
            r.u0 r3 = r4.f9270a
            boolean r3 = r3.mo13d()
            if (r3 != 0) goto L35
            r.u0 r3 = r4.f9270a
            boolean r3 = r3.mo10a()
            if (r3 == 0) goto L3c
        L35:
            java.lang.Object r5 = r1.m5033b(r5, r7, r8)
            if (r5 != r2) goto L4a
            return r5
        L3c:
            r.z0 r7 = new r.z0
            r7.<init>(r4, r8)
            r7.f9602j = r5
            java.lang.Object r5 = r7.mo8p(r0)
            if (r5 != r2) goto L4a
            return r5
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C2940A0.m5142b(long, boolean, Q2.i):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [V.e] */
    /* JADX INFO: renamed from: c */
    public final long m5143c(InterfaceC2991h0 interfaceC2991h0, long j5, int i5) {
        int i6;
        C0110j c0110j;
        C0110j c0110j2;
        long j6;
        long jMo134Q;
        InterfaceC0558E0 interfaceC0558E0;
        C0590e0 c0590e0;
        ?? M1029e;
        InterfaceC0558E0 interfaceC0558E02;
        C0590e0 c0590e02;
        ?? M1029e2;
        C0110j c0110j3 = this.f9275f.f470a;
        int i7 = 262144;
        int i8 = 1;
        Object obj = null;
        if (c0110j3 == null || !c0110j3.f7199q) {
            i6 = 262144;
            c0110j = null;
        } else {
            if (!c0110j3.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o = c0110j3.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(c0110j3);
            loop0: while (true) {
                if (c0564iM1044t == null) {
                    i6 = i7;
                    interfaceC0558E02 = null;
                    break;
                }
                if ((c0564iM1044t.f1699J.f1896f.f7189g & i7) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & i7) != 0) {
                            ?? c1483e = 0;
                            ?? r13 = abstractC2206o;
                            while (r13 != 0) {
                                if (r13 instanceof InterfaceC0558E0) {
                                    interfaceC0558E02 = (InterfaceC0558E0) r13;
                                    i6 = i7;
                                    if (AbstractC1665j.m2981a(c0110j3.mo146s(), interfaceC0558E02.mo146s()) && C0110j.class == interfaceC0558E02.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i6 = i7;
                                    if ((r13.f7188f & i6) != 0 && (r13 instanceof AbstractC0599j)) {
                                        AbstractC2206o abstractC2206o2 = ((AbstractC0599j) r13).f1943s;
                                        int i9 = 0;
                                        M1029e2 = r13;
                                        c1483e = c1483e;
                                        while (abstractC2206o2 != null) {
                                            if ((abstractC2206o2.f7188f & i6) != 0) {
                                                i9++;
                                                c1483e = c1483e;
                                                if (i9 == 1) {
                                                    M1029e2 = abstractC2206o2;
                                                } else {
                                                    if (c1483e == 0) {
                                                        c1483e = new C1483e(new AbstractC2206o[16]);
                                                    }
                                                    if (M1029e2 != 0) {
                                                        c1483e.m2753b(M1029e2);
                                                        M1029e2 = 0;
                                                    }
                                                    c1483e.m2753b(abstractC2206o2);
                                                }
                                            }
                                            abstractC2206o2 = abstractC2206o2.f7191i;
                                            M1029e2 = M1029e2;
                                            c1483e = c1483e;
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    i7 = i6;
                                    r13 = M1029e2;
                                    c1483e = c1483e;
                                }
                                M1029e2 = AbstractC0601k.m1029e(c1483e);
                                i7 = i6;
                                r13 = M1029e2;
                                c1483e = c1483e;
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                        i7 = i7;
                    }
                }
                int i10 = i7;
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e02 = c0564iM1044t.f1699J) == null) ? null : c0590e02.f1895e;
                i7 = i10;
            }
            c0110j = (C0110j) interfaceC0558E02;
        }
        long jMo136n = c0110j != null ? c0110j.mo136n(j5, i5) : 0L;
        long jM4646d = C2683b.m4646d(j5, jMo136n);
        long jM5145e = m5145e(m5148h(interfaceC2991h0.mo5202a(m5147g(m5145e(this.f9273d == EnumC2983d0.f9448e ? C2683b.m4643a(jM4646d, 0.0f, 1) : C2683b.m4643a(jM4646d, 0.0f, 2))))));
        C3015t0 c3015t0 = this.f9276g;
        if (c3015t0.f7199q) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c3015t0)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC0772y.f2425S0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC0772y.f2425S0 = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC0772y.f2425S0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jM4646d2 = C2683b.m4646d(jM4646d, jM5145e);
        C0110j c0110j4 = this.f9275f.f470a;
        if (c0110j4 == null || !c0110j4.f7199q) {
            c0110j2 = null;
        } else {
            if (!c0110j4.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o3 = c0110j4.f7186d.f7190h;
            C0564I c0564iM1044t2 = AbstractC0601k.m1044t(c0110j4);
            loop3: while (true) {
                if (c0564iM1044t2 == null) {
                    interfaceC0558E0 = null;
                    break;
                }
                if ((c0564iM1044t2.f1699J.f1896f.f7189g & i6) != 0) {
                    while (abstractC2206o3 != null) {
                        if ((abstractC2206o3.f7188f & i6) != 0) {
                            ?? r7 = abstractC2206o3;
                            ?? c1483e2 = obj;
                            while (r7 != 0) {
                                if (r7 instanceof InterfaceC0558E0) {
                                    InterfaceC0558E0 interfaceC0558E03 = (InterfaceC0558E0) r7;
                                    if (AbstractC1665j.m2981a(c0110j4.mo146s(), interfaceC0558E03.mo146s()) && C0110j.class == interfaceC0558E03.getClass()) {
                                        interfaceC0558E0 = interfaceC0558E03;
                                        break loop3;
                                    }
                                } else {
                                    if ((r7.f7188f & i6) != 0 && (r7 instanceof AbstractC0599j)) {
                                        AbstractC2206o abstractC2206o4 = ((AbstractC0599j) r7).f1943s;
                                        int i11 = 0;
                                        M1029e = r7;
                                        c1483e2 = c1483e2;
                                        while (abstractC2206o4 != null) {
                                            M1029e = M1029e;
                                            if ((abstractC2206o4.f7188f & i6) != 0) {
                                                i11++;
                                                if (i11 == i8) {
                                                    M1029e = abstractC2206o4;
                                                } else {
                                                    c1483e2 = c1483e2 == 0 ? new C1483e(new AbstractC2206o[16]) : c1483e2;
                                                    if (M1029e != 0) {
                                                        c1483e2.m2753b(M1029e);
                                                        M1029e = 0;
                                                    }
                                                    c1483e2.m2753b(abstractC2206o4);
                                                }
                                            }
                                            abstractC2206o4 = abstractC2206o4.f7191i;
                                            i8 = 1;
                                            M1029e = M1029e;
                                            c1483e2 = c1483e2;
                                        }
                                        if (i11 == i8) {
                                        }
                                    }
                                    r7 = M1029e;
                                    c1483e2 = c1483e2;
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e2);
                                r7 = M1029e;
                                c1483e2 = c1483e2;
                            }
                        }
                        abstractC2206o3 = abstractC2206o3.f7190h;
                        obj = null;
                    }
                }
                c0564iM1044t2 = c0564iM1044t2.m839u();
                abstractC2206o3 = (c0564iM1044t2 == null || (c0590e0 = c0564iM1044t2.f1699J) == null) ? null : c0590e0.f1895e;
                obj = null;
            }
            c0110j2 = (C0110j) interfaceC0558E0;
        }
        if (c0110j2 != null) {
            jMo134Q = c0110j2.mo134Q(i5, jM5145e, jM4646d2);
            j6 = jM5145e;
        } else {
            j6 = jM5145e;
            jMo134Q = 0;
        }
        return C2683b.m4647e(C2683b.m4647e(jMo136n, j6), jMo134Q);
    }

    /* JADX INFO: renamed from: d */
    public final float m5144d(float f2) {
        return this.f9274e ? f2 * (-1) : f2;
    }

    /* JADX INFO: renamed from: e */
    public final long m5145e(long j5) {
        return this.f9274e ? C2683b.m4648f(-1.0f, j5) : j5;
    }

    /* JADX INFO: renamed from: f */
    public final Object m5146f(EnumC2824Q enumC2824Q, InterfaceC1603e interfaceC1603e, AbstractC1178c abstractC1178c) {
        Object objMo12c = this.f9270a.mo12c(enumC2824Q, new C0466k(this, interfaceC1603e, (InterfaceC1046d) null, 13), abstractC1178c);
        return objMo12c == EnumC1152a.f3788d ? objMo12c : C0891q.f2780a;
    }

    /* JADX INFO: renamed from: g */
    public final float m5147g(long j5) {
        return Float.intBitsToFloat((int) (this.f9273d == EnumC2983d0.f9448e ? j5 >> 32 : j5 & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public final long m5148h(float f2) {
        long jFloatToRawIntBits;
        long j5;
        if (f2 == 0.0f) {
            return 0L;
        }
        if (this.f9273d == EnumC2983d0.f9448e) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j5 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            j5 = jFloatToRawIntBits3 << 32;
        }
        return j5 | (jFloatToRawIntBits & 4294967295L);
    }

    /* JADX INFO: renamed from: i */
    public final float m5149i(long j5) {
        int i5 = (int) (4294967295L & j5);
        int i6 = (int) (j5 >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i5)), Math.abs(Float.intBitsToFloat(i6)))) >= 0.7853981633974483d) {
            if (this.f9273d == EnumC2983d0.f9447d) {
                return Float.intBitsToFloat(i5);
            }
            return 0.0f;
        }
        if (this.f9273d == EnumC2983d0.f9448e) {
            return Float.intBitsToFloat(i6);
        }
        return 0.0f;
    }
}

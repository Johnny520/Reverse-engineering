package p277t2;

import java.util.Iterator;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p117i.AbstractC3044c1;
import p117i.AbstractC3047d1;
import p117i.AbstractC3050e1;
import p117i.C3082r0;
import p117i.C3084s0;
import p172l8.InterfaceC4695g;

/* JADX INFO: renamed from: t2.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8087p implements InterfaceC8074h0, Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C3082r0 f27025q = AbstractC3044c1.m11262b();

    /* JADX INFO: renamed from: r */
    public Map f27026r;

    /* JADX INFO: renamed from: s */
    public C3084s0 f27027s;

    /* JADX INFO: renamed from: t */
    public boolean f27028t;

    /* JADX INFO: renamed from: u */
    public boolean f27029u;

    @Override // p277t2.InterfaceC8074h0
    /* JADX INFO: renamed from: a */
    public void mo19816a(C8072g0 c8072g0, Object obj) {
        if ((obj instanceof C8059a) && m31249e(c8072g0)) {
            Object objM11238e = this.f27025q.m11238e(c8072g0);
            objM11238e.getClass();
            C8059a c8059a = (C8059a) objM11238e;
            C3082r0 c3082r0 = this.f27025q;
            C8059a c8059a2 = (C8059a) obj;
            String strM30987b = c8059a2.m30987b();
            if (strM30987b == null) {
                strM30987b = c8059a.m30987b();
            }
            InterfaceC4695g interfaceC4695gM30986a = c8059a2.m30986a();
            if (interfaceC4695gM30986a == null) {
                interfaceC4695gM30986a = c8059a.m30986a();
            }
            c3082r0.m11529x(c8072g0, new C8059a(strM30987b, interfaceC4695gM30986a));
        } else {
            this.f27025q.m11529x(c8072g0, obj);
        }
        if (c8072g0.m31153a() != null) {
            if (this.f27027s == null) {
                this.f27027s = AbstractC3050e1.m11284b();
            }
            C3084s0 c3084s0 = this.f27027s;
            if (c3084s0 != null) {
                c3084s0.m11536h(c8072g0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m31248c(C8087p c8087p) {
        int i10;
        if (c8087p.f27028t) {
            this.f27028t = true;
        }
        if (c8087p.f27029u) {
            this.f27029u = true;
        }
        C3082r0 c3082r0 = c8087p.f27025q;
        Object[] objArr = c3082r0.f8071b;
        Object[] objArr2 = c3082r0.f8072c;
        long[] jArr = c3082r0.f8070a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        C8072g0 c8072g0 = (C8072g0) obj;
                        if (!this.f27025q.m11235b(c8072g0)) {
                            this.f27025q.m11529x(c8072g0, obj2);
                        } else if (obj2 instanceof C8059a) {
                            Object objM11238e = this.f27025q.m11238e(c8072g0);
                            objM11238e.getClass();
                            C8059a c8059a = (C8059a) objM11238e;
                            C3082r0 c3082r02 = this.f27025q;
                            String strM30987b = c8059a.m30987b();
                            if (strM30987b == null) {
                                strM30987b = ((C8059a) obj2).m30987b();
                            }
                            i10 = i12;
                            String str = strM30987b;
                            InterfaceC4695g interfaceC4695gM30986a = c8059a.m30986a();
                            if (interfaceC4695gM30986a == null) {
                                interfaceC4695gM30986a = ((C8059a) obj2).m30986a();
                            }
                            c3082r02.m11529x(c8072g0, new C8059a(str, interfaceC4695gM30986a));
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m31249e(C8072g0 c8072g0) {
        return this.f27025q.m11236c(c8072g0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8087p)) {
            return false;
        }
        C8087p c8087p = (C8087p) obj;
        return AbstractC1061t.m3842c(this.f27025q, c8087p.f27025q) && this.f27028t == c8087p.f27028t && this.f27029u == c8087p.f27029u;
    }

    public int hashCode() {
        return (((this.f27025q.hashCode() * 31) + Boolean.hashCode(this.f27028t)) * 31) + Boolean.hashCode(this.f27029u);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map mapM11234a = this.f27026r;
        if (mapM11234a == null) {
            mapM11234a = this.f27025q.m11234a();
            this.f27026r = mapM11234a;
        }
        return mapM11234a.entrySet().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m31250l() {
        /*
            r15 = this;
            i.r0 r0 = r15.f27025q
            java.lang.Object[] r1 = r0.f8071b
            java.lang.Object[] r2 = r0.f8072c
            long[] r0 = r0.f8070a
            int r3 = r0.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L50
            r5 = r4
        Lf:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4b
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L29:
            if (r10 >= r8) goto L49
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L45
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            t2.g0 r12 = (p277t2.C8072g0) r12
            boolean r11 = r12.m31155c()
            if (r11 == 0) goto L45
            r0 = 1
            return r0
        L45:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L29
        L49:
            if (r8 != r9) goto L50
        L4b:
            if (r5 == r3) goto L50
            int r5 = r5 + 1
            goto Lf
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p277t2.C8087p.m31250l():boolean");
    }

    /* JADX INFO: renamed from: o */
    public final C8087p m31251o() {
        C8087p c8087p = new C8087p();
        c8087p.f27028t = this.f27028t;
        c8087p.f27029u = this.f27029u;
        c8087p.f27025q.m11524s(this.f27025q);
        return c8087p;
    }

    /* JADX INFO: renamed from: p */
    public final Object m31252p(C8072g0 c8072g0) {
        Object objM11238e = this.f27025q.m11238e(c8072g0);
        if (objM11238e != null) {
            return objM11238e;
        }
        throw new IllegalStateException("Key not present: " + c8072g0 + " - consider getOrElse or getOrNull");
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC3047d1 m31253q() {
        return this.f27027s;
    }

    /* JADX INFO: renamed from: r */
    public final Object m31254r(C8072g0 c8072g0, InterfaceC0173a interfaceC0173a) {
        Object objM11238e = this.f27025q.m11238e(c8072g0);
        return objM11238e == null ? interfaceC0173a.invoke() : objM11238e;
    }

    /* JADX INFO: renamed from: s */
    public final Object m31255s(C8072g0 c8072g0, InterfaceC0173a interfaceC0173a) {
        Object objM11238e = this.f27025q.m11238e(c8072g0);
        return objM11238e == null ? interfaceC0173a.invoke() : objM11238e;
    }

    /* JADX INFO: renamed from: t */
    public final C3082r0 m31256t() {
        return this.f27025q;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[PHI: r2
  0x0079: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x0040, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f27028t
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f27029u
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            i.r0 r4 = r0.f27025q
            java.lang.Object[] r5 = r4.f8071b
            java.lang.Object[] r6 = r4.f8072c
            long[] r4 = r4.f8070a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7e
            r8 = 0
            r9 = r8
        L32:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L79
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L4c:
            if (r14 >= r12) goto L77
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L73
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            t2.g0 r16 = (p277t2.C8072g0) r16
            r1.append(r2)
            java.lang.String r2 = r16.m31154b()
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L73:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4c
        L77:
            if (r12 != r13) goto L7e
        L79:
            if (r9 == r7) goto L7e
            int r9 = r9 + 1
            goto L32
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.lang.String r3 = p179m2.AbstractC4861j2.m19406a(r0, r3)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p277t2.C8087p.toString():java.lang.String");
    }

    /* JADX INFO: renamed from: u */
    public final boolean m31257u() {
        return this.f27029u;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m31258v() {
        return this.f27028t;
    }

    /* JADX INFO: renamed from: w */
    public final void m31259w(C8087p c8087p) {
        C3082r0 c3082r0 = c8087p.f27025q;
        Object[] objArr = c3082r0.f8071b;
        Object[] objArr2 = c3082r0.f8072c;
        long[] jArr = c3082r0.f8070a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        C8072g0 c8072g0 = (C8072g0) obj;
                        Object objM11238e = this.f27025q.m11238e(c8072g0);
                        c8072g0.getClass();
                        Object objM31156d = c8072g0.m31156d(objM11238e, obj2);
                        if (objM31156d != null) {
                            this.f27025q.m11529x(c8072g0, objM31156d);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m31260x(boolean z10) {
        this.f27029u = z10;
    }

    /* JADX INFO: renamed from: y */
    public final void m31261y(boolean z10) {
        this.f27028t = z10;
    }
}

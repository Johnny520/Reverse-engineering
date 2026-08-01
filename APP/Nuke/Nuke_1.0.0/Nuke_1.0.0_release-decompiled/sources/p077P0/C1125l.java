package p077P0;

import java.util.Iterator;
import p011B4.AbstractC0231b;
import p056K2.InterfaceC0877c;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p186k.AbstractC2415L;
import p186k.C2408E;
import p186k.C2425g;
import p186k.C2436r;

/* JADX INFO: renamed from: P0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1125l implements InterfaceC1136w, Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C2408E f3702d;

    /* JADX INFO: renamed from: e */
    public C2436r f3703e;

    /* JADX INFO: renamed from: f */
    public boolean f3704f;

    /* JADX INFO: renamed from: g */
    public boolean f3705g;

    public C1125l() {
        long[] jArr = AbstractC2415L.f7816a;
        this.f3702d = new C2408E();
    }

    @Override // p077P0.InterfaceC1136w
    /* JADX INFO: renamed from: a */
    public final void mo1128a(C1135v c1135v, Object obj) {
        boolean z5 = obj instanceof C1114a;
        C2408E c2408e = this.f3702d;
        if (z5 && c2408e.m4268c(c1135v)) {
            Object objM4272g = c2408e.m4272g(c1135v);
            AbstractC1665j.m2983c(objM4272g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            C1114a c1114a = (C1114a) objM4272g;
            C1114a c1114a2 = (C1114a) obj;
            String str = c1114a2.f3633a;
            if (str == null) {
                str = c1114a.f3633a;
            }
            InterfaceC0877c interfaceC0877c = c1114a2.f3634b;
            if (interfaceC0877c == null) {
                interfaceC0877c = c1114a.f3634b;
            }
            c2408e.m4278m(c1135v, new C1114a(str, interfaceC0877c));
        } else {
            c2408e.m4278m(c1135v, obj);
        }
        c1135v.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p077P0.C1125l m2159b() {
        /*
            r18 = this;
            r0 = r18
            P0.l r1 = new P0.l
            r1.<init>()
            boolean r2 = r0.f3704f
            r1.f3704f = r2
            boolean r2 = r0.f3705g
            r1.f3705g = r2
            k.E r2 = r1.f3702d
            r2.getClass()
            java.lang.String r3 = "from"
            k.E r4 = r0.f3702d
            p117X2.AbstractC1665j.m2985e(r4, r3)
            java.lang.Object[] r3 = r4.f7788b
            java.lang.Object[] r5 = r4.f7789c
            long[] r4 = r4.f7787a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = r7
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.m4278m(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p077P0.C1125l.m2159b():P0.l");
    }

    /* JADX INFO: renamed from: c */
    public final Object m2160c(C1135v c1135v) {
        Object objM4272g = this.f3702d.m4272g(c1135v);
        if (objM4272g != null) {
            return objM4272g;
        }
        throw new IllegalStateException("Key not present: " + c1135v + " - consider getOrElse or getOrNull");
    }

    /* JADX INFO: renamed from: d */
    public final void m2161d(C1125l c1125l) {
        C2408E c2408e = c1125l.f3702d;
        Object[] objArr = c2408e.f7788b;
        Object[] objArr2 = c2408e.f7789c;
        long[] jArr = c2408e.f7787a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        int i8 = (i5 << 3) + i7;
                        Object obj = objArr[i8];
                        Object obj2 = objArr2[i8];
                        C1135v c1135v = (C1135v) obj;
                        C2408E c2408e2 = this.f3702d;
                        Object objM4272g = c2408e2.m4272g(c1135v);
                        AbstractC1665j.m2983c(c1135v, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objMo0g = c1135v.f3768b.mo0g(objM4272g, obj2);
                        if (objMo0g != null) {
                            c2408e2.m4278m(c1135v, objMo0g);
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1125l)) {
            return false;
        }
        C1125l c1125l = (C1125l) obj;
        return AbstractC1665j.m2981a(this.f3702d, c1125l.f3702d) && this.f3704f == c1125l.f3704f && this.f3705g == c1125l.f3705g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3705g) + AbstractC0231b.m395f(this.f3702d.hashCode() * 31, 31, this.f3704f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2436r c2436r = this.f3703e;
        if (c2436r == null) {
            C2408E c2408e = this.f3702d;
            c2408e.getClass();
            C2436r c2436r2 = new C2436r(c2408e);
            this.f3703e = c2436r2;
            c2436r = c2436r2;
        }
        return ((C2425g) c2436r.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f3704f
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f3705g
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            k.E r4 = r0.f3702d
            java.lang.Object[] r5 = r4.f7788b
            java.lang.Object[] r6 = r4.f7789c
            long[] r4 = r4.f7787a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            P0.v r8 = (p077P0.C1135v) r8
            r1.append(r2)
            java.lang.String r2 = r8.f3767a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = p047I0.AbstractC0681L.m1195q(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p077P0.C1125l.toString():java.lang.String");
    }
}

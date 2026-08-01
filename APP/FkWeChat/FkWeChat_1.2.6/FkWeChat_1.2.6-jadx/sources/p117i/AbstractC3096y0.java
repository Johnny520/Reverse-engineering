package p117i;

import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p132j.AbstractC3489a;
import p215oc.C5725t;

/* JADX INFO: renamed from: i.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3096y0 {

    /* JADX INFO: renamed from: a */
    public long[] f8245a;

    /* JADX INFO: renamed from: b */
    public Object[] f8246b;

    /* JADX INFO: renamed from: c */
    public long[] f8247c;

    /* JADX INFO: renamed from: d */
    public int f8248d;

    /* JADX INFO: renamed from: e */
    public int f8249e;

    /* JADX INFO: renamed from: f */
    public int f8250f;

    /* JADX INFO: renamed from: g */
    public int f8251g;

    /* JADX INFO: renamed from: i.y0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo27m(Object obj) {
            return obj == AbstractC3096y0.this ? "(this)" : String.valueOf(obj);
        }
    }

    public AbstractC3096y0() {
        this.f8245a = AbstractC3044c1.f8088a;
        this.f8246b = AbstractC3489a.f9695c;
        this.f8247c = AbstractC3056g1.m11311a();
        this.f8248d = Integer.MAX_VALUE;
        this.f8249e = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m11611f(AbstractC3096y0 abstractC3096y0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC0184l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        return abstractC3096y0.m11616e(charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC0184l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11612a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f8250f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f8245a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f8246b
            r15 = r15[r11]
            boolean r15 = p024b9.AbstractC1061t.m3842c(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.AbstractC3096y0.m11612a(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: b */
    public final int m11613b() {
        return this.f8250f;
    }

    /* JADX INFO: renamed from: c */
    public final int m11614c() {
        return this.f8251g;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11615d() {
        return this.f8251g == 0;
    }

    /* JADX INFO: renamed from: e */
    public final String m11616e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        Object[] objArr = this.f8246b;
        long[] jArr = this.f8247c;
        int i11 = this.f8249e;
        int i12 = 0;
        while (true) {
            if (i11 == Integer.MAX_VALUE) {
                sb2.append(charSequence3);
                break;
            }
            int i13 = (int) ((jArr[i11] >> 31) & 2147483647L);
            Object obj = objArr[i11];
            if (i12 == i10) {
                sb2.append(charSequence4);
                break;
            }
            if (i12 != 0) {
                sb2.append(charSequence);
            }
            if (interfaceC0184l == null) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) interfaceC0184l.mo27m(obj));
            }
            i12++;
            i11 = i13;
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p117i.AbstractC3096y0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            i.y0 r1 = (p117i.AbstractC3096y0) r1
            int r3 = r1.m11614c()
            int r5 = r0.m11614c()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.f8246b
            long[] r5 = r0.f8245a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L61
            r7 = r4
        L25:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3f:
            if (r12 >= r10) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L56
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.m11612a(r13)
            if (r13 != 0) goto L56
            return r4
        L56:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L5a:
            if (r10 != r11) goto L61
        L5c:
            if (r7 == r6) goto L61
            int r7 = r7 + 1
            goto L25
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.AbstractC3096y0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode = (this.f8250f * 31) + this.f8251g;
        Object[] objArr = this.f8246b;
        long[] jArr = this.f8245a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!AbstractC1061t.m3842c(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iHashCode;
    }

    public String toString() {
        return m11611f(this, null, "[", "]", 0, null, new a(), 25, null);
    }

    public /* synthetic */ AbstractC3096y0(AbstractC1043k abstractC1043k) {
        this();
    }
}

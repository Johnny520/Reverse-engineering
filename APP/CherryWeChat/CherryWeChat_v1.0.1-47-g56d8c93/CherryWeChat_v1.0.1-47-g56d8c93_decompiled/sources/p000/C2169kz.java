package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlinx.serialization.json.AbstractC2156b;

/* JADX INFO: renamed from: kz */
/* JADX INFO: loaded from: classes.dex */
public final class C2169kz extends AbstractC1406fG implements InterfaceC0406Jc, InterfaceC0919Va {

    /* JADX INFO: renamed from: g */
    public final AbstractC2242mm f7553g;

    /* JADX INFO: renamed from: h */
    public final int f7554h;

    /* JADX INFO: renamed from: i */
    public final C2341oz f7555i;

    /* JADX INFO: renamed from: j */
    public int f7556j;

    /* JADX INFO: renamed from: k */
    public final C2379pm f7557k;

    /* JADX INFO: renamed from: l */
    public final C2594um f7558l;

    public C2169kz(AbstractC2242mm abstractC2242mm, int i, C2341oz c2341oz, InterfaceC0126Cx interfaceC0126Cx) {
        super(4);
        this.f7553g = abstractC2242mm;
        this.f7554h = i;
        this.f7555i = c2341oz;
        this.f7556j = -1;
        C2379pm c2379pm = abstractC2242mm.f7922a;
        this.f7557k = c2379pm;
        this.f7558l = c2379pm.f8373c ? null : new C2594um(interfaceC0126Cx);
    }

    /* JADX INFO: renamed from: A0 */
    public final AbstractC2156b m4370A0() {
        return new C2256n(this.f7553g.f7922a, this.f7555i).m4583b();
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: B */
    public final InterfaceC0919Va mo839B(InterfaceC0126Cx interfaceC0126Cx) {
        int i;
        AbstractC1406fG abstractC1406fGMo204c = interfaceC0126Cx.mo204c();
        boolean z = abstractC1406fGMo204c instanceof C0895Ut;
        AbstractC2242mm abstractC2242mm = this.f7553g;
        if (z) {
            i = 4;
        } else if (AbstractC0585Nj.m1134a(abstractC1406fGMo204c, C0128Cz.f299h)) {
            i = 2;
        } else if (AbstractC0585Nj.m1134a(abstractC1406fGMo204c, C0128Cz.f300i)) {
            InterfaceC0126Cx interfaceC0126CxM609b = AbstractC0295Gu.m609b(interfaceC0126Cx.mo210j(0), abstractC2242mm.f7923b);
            AbstractC1406fG abstractC1406fGMo204c2 = interfaceC0126CxM609b.mo204c();
            if (!(abstractC1406fGMo204c2 instanceof AbstractC2293nu) && !AbstractC0585Nj.m1134a(abstractC1406fGMo204c2, C0255Fx.f828h)) {
                throw AbstractC1293cr.m2542a(interfaceC0126CxM609b);
            }
            i = 3;
        } else {
            i = 1;
        }
        C2341oz c2341oz = this.f7555i;
        C0477L3 c0477l3 = c2341oz.f8217b;
        int i2 = c0477l3.f1574b + 1;
        c0477l3.f1574b = i2;
        Object[] objArr = (Object[]) c0477l3.f1575c;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            c0477l3.f1575c = Arrays.copyOf(objArr, i3);
            c0477l3.f1576d = Arrays.copyOf((int[]) c0477l3.f1576d, i3);
        }
        ((Object[]) c0477l3.f1575c)[i2] = interfaceC0126Cx;
        char c = '{';
        if (i != 1) {
            if (i == 2) {
                c = '[';
            } else if (i != 3) {
                if (i != 4) {
                    throw null;
                }
                c = '[';
            }
        }
        c2341oz.m4757g(c);
        if (c2341oz.m4765p() != 4) {
            int iM424v = AbstractC0213Ey.m424v(i);
            return (iM424v == 1 || iM424v == 2 || iM424v == 3) ? new C2169kz(abstractC2242mm, i, c2341oz, interfaceC0126Cx) : (this.f7554h == i && abstractC2242mm.f7922a.f8373c) ? this : new C2169kz(abstractC2242mm, i, c2341oz, interfaceC0126Cx);
        }
        C2341oz.m4750m(c2341oz, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: D */
    public final double mo840D() {
        C2341oz c2341oz = this.f7555i;
        String strM4760j = c2341oz.m4760j();
        try {
            double d = Double.parseDouble(strM4760j);
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            C2341oz.m4750m(c2341oz, "Unexpected special floating-point value " + Double.valueOf(d) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C2341oz.m4750m(c2341oz, "Failed to parse type 'double' for input '" + strM4760j + '\'', 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: a */
    public final long mo841a() {
        return this.f7555i.m4758h();
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: e */
    public final boolean mo842e() {
        boolean z;
        boolean z2;
        C2341oz c2341oz = this.f7555i;
        int iM4767r = c2341oz.m4767r();
        String str = c2341oz.f8220e;
        if (iM4767r == str.length()) {
            C2341oz.m4750m(c2341oz, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM4767r) == '\"') {
            iM4767r++;
            z = true;
        } else {
            z = false;
        }
        int iM4766q = c2341oz.m4766q(iM4767r);
        if (iM4766q >= str.length() || iM4766q == -1) {
            C2341oz.m4750m(c2341oz, "EOF", 0, 6);
            throw null;
        }
        int i = iM4766q + 1;
        int iCharAt = str.charAt(iM4766q) | ' ';
        if (iCharAt == 102) {
            c2341oz.m4753c(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C2341oz.m4750m(c2341oz, "Expected valid boolean literal prefix, but had '" + c2341oz.m4760j() + '\'', 0, 6);
                throw null;
            }
            c2341oz.m4753c(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c2341oz.f8216a == str.length()) {
            C2341oz.m4750m(c2341oz, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(c2341oz.f8216a) == '\"') {
            c2341oz.f8216a++;
            return z2;
        }
        C2341oz.m4750m(c2341oz, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: f */
    public final boolean mo843f() {
        C2594um c2594um = this.f7558l;
        return ((c2594um != null ? c2594um.f8971b : false) || this.f7555i.m4769t(true)) ? false : true;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: g */
    public final char mo844g() {
        C2341oz c2341oz = this.f7555i;
        String strM4760j = c2341oz.m4760j();
        if (strM4760j.length() == 1) {
            return strM4760j.charAt(0);
        }
        C2341oz.m4750m(c2341oz, "Expected single char, but got '" + strM4760j + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: h */
    public final Object mo845h(InterfaceC0717Qm interfaceC0717Qm) {
        try {
            if (!(interfaceC0717Qm instanceof AbstractC0129D)) {
                return interfaceC0717Qm.deserialize(this);
            }
            AbstractC0213Ey.m417o(interfaceC0717Qm);
            throw null;
        } catch (C0893Ur e) {
            if (AbstractC2564tz.m5051L(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new C0893Ur(e.f2787a, e.getMessage() + " at path: " + this.f7555i.f8217b.m934c(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0134, code lost:
    
        r1 = r8.f8970a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0138, code lost:
    
        if (r15 >= 64) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013a, code lost:
    
        r1.f5286c |= 1 << r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0141, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0144, code lost:
    
        r2 = (r15 >>> 6) - 1;
        r1 = r1.f5287d;
        r1[r2] = r1[r2] | (1 << (r15 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0132, code lost:
    
        if (r8 == null) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo1770j(InterfaceC0126Cx interfaceC0126Cx) throws Throwable {
        boolean zM4768s;
        boolean z;
        String strM4759i;
        String str;
        C2341oz c2341oz = this.f7555i;
        C0477L3 c0477l3 = c2341oz.f8217b;
        String str2 = c2341oz.f8220e;
        int i = this.f7554h;
        int iM424v = AbstractC0213Ey.m424v(i);
        Throwable th = null;
        char c = ':';
        int i2 = 0;
        zM4768s = false;
        boolean zM4768s2 = false;
        boolean z2 = true;
        int i3 = -1;
        if (iM424v == 0) {
            boolean zM4768s3 = c2341oz.m4768s();
            while (true) {
                boolean zM4752b = c2341oz.m4752b();
                Throwable th2 = th;
                C2594um c2594um = this.f7558l;
                if (zM4752b) {
                    C2379pm c2379pm = this.f7557k;
                    boolean z3 = c2379pm.f8372b;
                    String strM4761k = z3 ? c2341oz.m4761k() : c2341oz.m4754d();
                    c2341oz.m4757g(c);
                    AbstractC2242mm abstractC2242mm = this.f7553g;
                    int iM1645n = AbstractC0828TB.m1645n(interfaceC0126Cx, abstractC2242mm, strM4761k);
                    if (iM1645n == -3) {
                        zM4768s = false;
                        z = true;
                    } else {
                        if (!c2379pm.f8375e) {
                            break;
                        }
                        boolean zMo211k = interfaceC0126Cx.mo211k(iM1645n);
                        InterfaceC0126Cx interfaceC0126CxMo210j = interfaceC0126Cx.mo210j(iM1645n);
                        if (!zMo211k || interfaceC0126CxMo210j.mo208h() || !c2341oz.m4769t(z2)) {
                            if (!AbstractC0585Nj.m1134a(interfaceC0126CxMo210j.mo204c(), C0255Fx.f828h) || (interfaceC0126CxMo210j.mo208h() && c2341oz.m4769t(false))) {
                                break;
                            }
                            byte bM4765p = c2341oz.m4765p();
                            if (z3) {
                                if (bM4765p == 1 || bM4765p == 0) {
                                    strM4759i = c2341oz.m4760j();
                                    c2341oz.f8218c = strM4759i;
                                    str = strM4759i;
                                }
                                str = th2;
                            } else {
                                if (bM4765p == 1) {
                                    strM4759i = c2341oz.m4759i();
                                    c2341oz.f8218c = strM4759i;
                                    str = strM4759i;
                                }
                                str = th2;
                            }
                            if (str == 0) {
                                break;
                            }
                            int iM1645n2 = AbstractC0828TB.m1645n(interfaceC0126CxMo210j, abstractC2242mm, str);
                            boolean z4 = !abstractC2242mm.f7922a.f8373c && interfaceC0126CxMo210j.mo208h();
                            if (iM1645n2 != -3 || (!zMo211k && !z4)) {
                                break;
                            }
                            c2341oz.m4759i();
                        }
                        zM4768s = c2341oz.m4768s();
                        z = false;
                    }
                    if (!z) {
                        zM4768s3 = zM4768s;
                        th = th2;
                        c = ':';
                        i2 = 0;
                        z2 = true;
                    } else {
                        if (!c2379pm.f8371a) {
                            c2341oz.m4762l(AbstractC2564tz.m5060U(6, str2.subSequence(0, c2341oz.f8216a).toString(), strM4761k), "Encountered an unknown key '" + strM4761k + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw th2;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bM4765p2 = c2341oz.m4765p();
                        if (bM4765p2 == 8 || bM4765p2 == 6) {
                            while (true) {
                                byte bM4765p3 = c2341oz.m4765p();
                                z2 = true;
                                if (bM4765p3 != 1) {
                                    if (bM4765p3 == 8 || bM4765p3 == 6) {
                                        arrayList.add(Byte.valueOf(bM4765p3));
                                    } else if (bM4765p3 == 9) {
                                        if (((Number) AbstractC2453ra.m4902l0(arrayList)).byteValue() != 8) {
                                            throw AbstractC1293cr.m2543b(c2341oz.f8216a, str2, "found ] instead of } at path: " + c0477l3);
                                        }
                                        AbstractC2711xa.m5284f0(arrayList);
                                    } else if (bM4765p3 == 7) {
                                        if (((Number) AbstractC2453ra.m4902l0(arrayList)).byteValue() != 6) {
                                            throw AbstractC1293cr.m2543b(c2341oz.f8216a, str2, "found } instead of ] at path: " + c0477l3);
                                        }
                                        AbstractC2711xa.m5284f0(arrayList);
                                    } else if (bM4765p3 == 10) {
                                        C2341oz.m4750m(c2341oz, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                        throw th2;
                                    }
                                    c2341oz.m4755e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z3) {
                                    c2341oz.m4760j();
                                } else {
                                    c2341oz.m4754d();
                                }
                            }
                        } else {
                            c2341oz.m4760j();
                            z2 = true;
                        }
                        zM4768s3 = c2341oz.m4768s();
                        th = th2;
                        c = ':';
                        i2 = 0;
                    }
                } else {
                    if (zM4768s3) {
                        AbstractC1293cr.m2533F(c2341oz);
                        throw th2;
                    }
                    if (c2594um != null) {
                        C1500hf c1500hf = c2594um.f8970a;
                        C2551tm c2551tm = c1500hf.f5285b;
                        InterfaceC0126Cx interfaceC0126Cx2 = c1500hf.f5284a;
                        int iMo205d = interfaceC0126Cx2.mo205d();
                        while (true) {
                            long j = c1500hf.f5286c;
                            long j2 = -1;
                            if (j != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                c1500hf.f5286c |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) c2551tm.mo446d(interfaceC0126Cx2, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i3 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iMo205d > 64) {
                                long[] jArr = c1500hf.f5287d;
                                int length = jArr.length;
                                loop3: while (i2 < length) {
                                    int i4 = i2 + 1;
                                    int i5 = i4 * 64;
                                    long j3 = jArr[i2];
                                    while (j3 != j2) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros2;
                                        int i6 = iNumberOfTrailingZeros2 + i5;
                                        if (((Boolean) c2551tm.mo446d(interfaceC0126Cx2, Integer.valueOf(i6))).booleanValue()) {
                                            jArr[i2] = j3;
                                            i3 = i6;
                                            break loop3;
                                        }
                                        j2 = -1;
                                    }
                                    jArr[i2] = j3;
                                    i2 = i4;
                                    j2 = -1;
                                }
                            }
                        }
                    } else {
                        i3 = -1;
                    }
                }
            }
        } else if (iM424v != 2) {
            boolean zM4768s4 = c2341oz.m4768s();
            if (c2341oz.m4752b()) {
                int i7 = this.f7556j;
                if (i7 != -1 && !zM4768s4) {
                    C2341oz.m4750m(c2341oz, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i3 = i7 + 1;
                this.f7556j = i3;
            } else if (zM4768s4) {
                AbstractC1293cr.m2532E(c2341oz, "array");
                throw null;
            }
        } else {
            int i8 = this.f7556j;
            boolean z5 = i8 % 2 != 0;
            if (!z5) {
                c2341oz.m4757g(':');
            } else if (i8 != -1) {
                zM4768s2 = c2341oz.m4768s();
            }
            if (c2341oz.m4752b()) {
                if (z5) {
                    if (this.f7556j == -1) {
                        int i9 = c2341oz.f8216a;
                        if (zM4768s2) {
                            C2341oz.m4750m(c2341oz, "Unexpected leading comma", i9, 4);
                            throw null;
                        }
                    } else {
                        int i10 = c2341oz.f8216a;
                        if (!zM4768s2) {
                            C2341oz.m4750m(c2341oz, "Expected comma after the key-value pair", i10, 4);
                            throw null;
                        }
                    }
                }
                i3 = this.f7556j + 1;
                this.f7556j = i3;
            } else if (zM4768s2) {
                AbstractC1293cr.m2533F(c2341oz);
                throw null;
            }
        }
        if (i != 3) {
            ((int[]) c0477l3.f1576d)[c0477l3.f1574b] = i3;
        }
        return i3;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: p */
    public final int mo846p() {
        C2341oz c2341oz = this.f7555i;
        long jM4758h = c2341oz.m4758h();
        int i = (int) jM4758h;
        if (jM4758h == i) {
            return i;
        }
        C2341oz.m4750m(c2341oz, "Failed to parse int for input '" + jM4758h + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0919Va
    /* JADX INFO: renamed from: r */
    public final void mo1777r(InterfaceC0126Cx interfaceC0126Cx) {
        if (this.f7553g.f7922a.f8371a && interfaceC0126Cx.mo205d() == 0) {
            while (mo1770j(interfaceC0126Cx) != -1) {
            }
        }
        C2341oz c2341oz = this.f7555i;
        if (c2341oz.m4768s()) {
            AbstractC1293cr.m2532E(c2341oz, "");
            throw null;
        }
        int i = this.f7554h;
        char c = '}';
        if (i != 1) {
            if (i == 2) {
                c = ']';
            } else if (i != 3) {
                if (i != 4) {
                    throw null;
                }
                c = ']';
            }
        }
        c2341oz.m4757g(c);
        C0477L3 c0477l3 = c2341oz.f8217b;
        int i2 = c0477l3.f1574b;
        int[] iArr = (int[]) c0477l3.f1576d;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            c0477l3.f1574b = i2 - 1;
        }
        int i3 = c0477l3.f1574b;
        if (i3 != -1) {
            c0477l3.f1574b = i3 - 1;
        }
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: t */
    public final byte mo847t() {
        C2341oz c2341oz = this.f7555i;
        long jM4758h = c2341oz.m4758h();
        byte b = (byte) jM4758h;
        if (jM4758h == b) {
            return b;
        }
        C2341oz.m4750m(c2341oz, "Failed to parse byte for input '" + jM4758h + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: u */
    public final InterfaceC0406Jc mo848u(InterfaceC0126Cx interfaceC0126Cx) {
        Set set = AbstractC2212lz.f7700a;
        return (interfaceC0126Cx.mo207f() && AbstractC2212lz.f7700a.contains(interfaceC0126Cx)) ? new C2422qm(this.f7555i) : this;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0919Va
    /* JADX INFO: renamed from: v */
    public final Object mo1779v(InterfaceC0126Cx interfaceC0126Cx, int i, InterfaceC0717Qm interfaceC0717Qm, Object obj) {
        C0477L3 c0477l3 = this.f7555i.f8217b;
        boolean z = this.f7554h == 3 && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c0477l3.f1576d;
            int i2 = c0477l3.f1574b;
            if (iArr[i2] == -2) {
                ((Object[]) c0477l3.f1575c)[i2] = C1456gf.f5163g;
            }
        }
        Object objMo845h = mo845h(interfaceC0717Qm);
        if (z) {
            int[] iArr2 = (int[]) c0477l3.f1576d;
            int i3 = c0477l3.f1574b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c0477l3.f1574b = i4;
                Object[] objArr = (Object[]) c0477l3.f1575c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    c0477l3.f1575c = Arrays.copyOf(objArr, i5);
                    c0477l3.f1576d = Arrays.copyOf((int[]) c0477l3.f1576d, i5);
                }
            }
            Object[] objArr2 = (Object[]) c0477l3.f1575c;
            int i6 = c0477l3.f1574b;
            objArr2[i6] = objMo845h;
            ((int[]) c0477l3.f1576d)[i6] = -2;
        }
        return objMo845h;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: x */
    public final short mo849x() {
        C2341oz c2341oz = this.f7555i;
        long jM4758h = c2341oz.m4758h();
        short s = (short) jM4758h;
        if (jM4758h == s) {
            return s;
        }
        C2341oz.m4750m(c2341oz, "Failed to parse short for input '" + jM4758h + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: y */
    public final String mo850y() {
        boolean z = this.f7557k.f8372b;
        C2341oz c2341oz = this.f7555i;
        return z ? c2341oz.m4761k() : c2341oz.m4759i();
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: z */
    public final float mo851z() {
        C2341oz c2341oz = this.f7555i;
        String strM4760j = c2341oz.m4760j();
        try {
            float f = Float.parseFloat(strM4760j);
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            C2341oz.m4750m(c2341oz, "Unexpected special floating-point value " + Float.valueOf(f) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C2341oz.m4750m(c2341oz, "Failed to parse type 'float' for input '" + strM4760j + '\'', 0, 6);
            throw null;
        }
    }
}

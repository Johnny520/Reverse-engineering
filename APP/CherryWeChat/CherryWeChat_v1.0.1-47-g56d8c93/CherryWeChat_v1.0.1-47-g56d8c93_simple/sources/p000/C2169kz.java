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

    public C2169kz(AbstractC2242mm r2, int r3, C2341oz r4, InterfaceC0126Cx r5) {
        super(4);
        this.f7553g = r2;
        this.f7554h = r3;
        this.f7555i = r4;
        this.f7556j = -1;
        C2379pm r22 = r2.f7922a;
        this.f7557k = r22;
        if (r22.f8373c == false) goto L5;
        C2594um r23 = null;
    L6:
        this.f7558l = r23;
        return;
    L5:
        r23 = new C2594um(r5);
        goto L6
    }

    /* JADX INFO: renamed from: A0 */
    public final AbstractC2156b m4370A0() {
        return new C2256n(this.f7553g.f7922a, this.f7555i).m4583b();
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: B */
    public final InterfaceC0919Va mo839B(InterfaceC0126Cx r13) {
        AbstractC1406fG r0 = r13.mo204c();
        boolean r1 = r0 instanceof C0895Ut;
        AbstractC2242mm r6 = this.f7553g;
        if (r1 == false) goto L6;
        int r02 = 4;
    L19:
        C2341oz r12 = this.f7555i;
        C0477L3 r8 = r12.f8217b;
        int r9 = r8.f1574b + 1;
        r8.f1574b = r9;
        Object[] r10 = (Object[]) r8.f1575c;
        if (r9 != r10.length) goto L22;
        int r11 = r9 * 2;
        r8.f1575c = Arrays.copyOf(r10, r11);
        r8.f1576d = Arrays.copyOf((int[]) r8.f1576d, r11);
    L22:
        ((Object[]) r8.f1575c)[r9] = r13;
        char r92 = '{';
        if (r02 != 1) goto L25;
    L33:
        r12.m4757g(r92);
        if (r12.m4765p() == 4) goto L48;
        int r3 = AbstractC0213Ey.m424v(r02);
        if (r3 == 1) goto L47;
        if (r3 == 2) goto L47;
        if (r3 == 3) goto L47;
        if (this.f7554h != r02) goto L45;
        if (r6.f7922a.f8373c == false) goto L45;
        return this;
    L45:
        return new C2169kz(r6, r02, r12, r13);
    L47:
        return new C2169kz(r6, r02, r12, r13);
    L48:
        C2341oz.m4750m(r12, "Unexpected leading comma", 0, 6);
        throw null;
    L25:
        if (r02 != 2) goto L27;
    L30:
        r92 = '[';
        goto L33
    L27:
        if (r02 == 3) goto L33;
        if (r02 == 4) goto L30;
        throw null;
    L6:
        if (AbstractC0585Nj.m1134a(r0, C0128Cz.f299h) == false) goto L9;
        r02 = 2;
        goto L19
    L9:
        if (AbstractC0585Nj.m1134a(r0, C0128Cz.f300i) == false) goto L18;
        InterfaceC0126Cx r03 = AbstractC0295Gu.m609b(r13.mo210j(0), r6.f7923b);
        AbstractC1406fG r14 = r03.mo204c();
        if ((r14 instanceof AbstractC2293nu) == false) goto L13;
    L17:
        r02 = 3;
        goto L19
    L13:
        if (AbstractC0585Nj.m1134a(r14, C0255Fx.f828h) == true) goto L17;
        throw AbstractC1293cr.m2542a(r03);
    L18:
        r02 = 1;
        goto L19
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: D */
    public final double mo840D() {
        C2341oz r0 = this.f7555i;
        String r1 = r0.m4760j();
        double r4 = Double.parseDouble(r1);     // Catch: IllegalArgumentException -> L11
        if (Double.isInfinite(r4) == false) goto L7;
    L9:
        C2341oz.m4750m(r0, "Unexpected special floating-point value " + Double.valueOf(r4) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    L7:
        if (Double.isNaN(r4) == true) goto L9;
        return r4;
    L11:
        C2341oz.m4750m(r0, "Failed to parse type 'double' for input '" + r1 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: a */
    public final long mo841a() {
        return this.f7555i.m4758h();
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: e */
    public final boolean mo842e() {
        C2341oz r0 = this.f7555i;
        int r1 = r0.m4767r();
        String r2 = r0.f8220e;
        if (r1 != r2.length()) goto L5;
        C2341oz.m4750m(r0, "EOF", 0, 6);
        throw null;
    L5:
        if (r2.charAt(r1) != '\"') goto L7;
        r1 = r1 + 1;
        boolean r3 = true;
    L8:
        int r12 = r0.m4766q(r1);
        if (r12 < r2.length()) goto L11;
    L32:
        C2341oz.m4750m(r0, "EOF", 0, 6);
        throw null;
    L11:
        if (r12 == (-1)) goto L32;
        int r10 = r12 + 1;
        int r13 = r2.charAt(r12) | ' ';
        if (r13 != 102) goto L15;
        r0.m4753c(r10, "alse");
        boolean r14 = false;
    L20:
        if (r3 == true) goto L22;
        return r14;
    L22:
        if (r0.f8216a != r2.length()) goto L24;
        C2341oz.m4750m(r0, "EOF", 0, 6);
        throw null;
    L24:
        if (r2.charAt(r0.f8216a) != '\"') goto L27;
        r0.f8216a++;
        return r14;
    L27:
        C2341oz.m4750m(r0, "Expected closing quotation mark", 0, 6);
        throw null;
    L15:
        if (r13 != 116) goto L17;
        r0.m4753c(r10, "rue");
        r14 = true;
        goto L20
    L17:
        C2341oz.m4750m(r0, "Expected valid boolean literal prefix, but had '" + r0.m4760j() + '\'', 0, 6);
        throw null;
    L7:
        r3 = false;
        goto L8
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: f */
    public final boolean mo843f() {
        C2594um r1 = this.f7558l;
        if (r1 == null) goto L5;
        boolean r12 = r1.f8971b;
    L6:
        if (r12 == false) goto L8;
    L10:
        return false;
    L8:
        if (this.f7555i.m4769t(true) == true) goto L10;
        return true;
    L5:
        r12 = false;
        goto L6
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: g */
    public final char mo844g() {
        C2341oz r0 = this.f7555i;
        String r1 = r0.m4760j();
        if (r1.length() == 1) goto L5;
        C2341oz.m4750m(r0, "Expected single char, but got '" + r1 + '\'', 0, 6);
        throw null;
    L5:
        return r1.charAt(0);
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: h */
    public final Object mo845h(InterfaceC0717Qm r4) {
    L6:
        e = move-exception;
        if (AbstractC2564tz.m5051L(e.getMessage(), "at path", false) == false) goto L15;
        throw e;
    L15:
        throw new C0893Ur(e.f2787a, e.getMessage() + " at path: " + this.f7555i.f8217b.m934c(), e);
    L3:
        if ((r4 instanceof AbstractC0129D) == false) goto L5;
        AbstractC0213Ey.m417o(r4);     // Catch: C0893Ur -> L6
        throw null;
    L5:
        return r4.deserialize(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: j */
    public final int mo1770j(InterfaceC0126Cx r22) {
        C2341oz r2 = this.f7555i;
        C0477L3 r3 = r2.f8217b;
        String r4 = r2.f8220e;
        int r5 = this.f7554h;
        int r6 = AbstractC0213Ey.m424v(r5);
        Throwable r8 = null;
        char r9 = ':';
        int r10 = 0;
        boolean r102 = false;
        r102 = false;
        boolean r11 = true;
        int r12 = -1;
        if (r6 != 0) goto L5;
        boolean r62 = r2.m4768s();
    L48:
        boolean r13 = r2.m4752b();
        Throwable r16 = r8;
        C2594um r82 = this.f7558l;
        if (r13 == false) goto L151;
        C2379pm r63 = this.f7557k;
        boolean r132 = r63.f8372b;
        if (r132 == false) goto L54;
        String r17 = r2.m4761k();
    L53:
        String r122 = r17;
        r2.m4757g(r9);
        AbstractC2242mm r92 = this.f7553g;
        int r15 = AbstractC0828TB.m1645n(r22, r92, r122);
        if (r15 != (-3)) goto L58;
        boolean r7 = false;
        boolean r83 = true;
    L106:
        if (r83 == true) goto L108;
        r62 = r7;
        r8 = r16;
        r9 = ':';
        r10 = 0;
        r11 = true;
        goto L48
    L108:
        if (r63.f8371a == false) goto L147;
        ArrayList r64 = new ArrayList();
        byte r72 = r2.m4765p();
        if (r72 == 8) goto L114;
        if (r72 == 6) goto L114;
        r2.m4760j();
        r11 = true;
    L145:
        r62 = r2.m4768s();
        r8 = r16;
        r9 = ':';
        r10 = 0;
    L114:
        byte r73 = r2.m4765p();
        r11 = true;
        if (r73 == 1) goto L116;
        if (r73 != 8) goto L121;
    L142:
        r64.add(Byte.valueOf(r73));
    L143:
        r2.m4755e();
        if (r64.size() != 0) goto L114;
    L121:
        if (r73 == 6) goto L142;
        if (r73 != 9) goto L131;
        if (((Number) AbstractC2453ra.m4902l0(r64)).byteValue() != 8) goto L129;
        AbstractC2711xa.m5284f0(r64);
        goto L143
    L129:
        throw AbstractC1293cr.m2543b(r2.f8216a, r4, "found ] instead of } at path: " + r3);
    L131:
        if (r73 != 7) goto L138;
        if (((Number) AbstractC2453ra.m4902l0(r64)).byteValue() != 6) goto L136;
        AbstractC2711xa.m5284f0(r64);
        goto L143
    L136:
        throw AbstractC1293cr.m2543b(r2.f8216a, r4, "found } instead of ] at path: " + r3);
    L138:
        if (r73 != 10) goto L143;
        C2341oz.m4750m(r2, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
        throw r16;
    L116:
        if (r132 == true) goto L117;
        r2.m4754d();
        goto L114
    L117:
        r2.m4760j();
        goto L114
    L147:
        r2.m4762l(AbstractC2564tz.m5060U(6, r4.subSequence(0, r2.f8216a).toString(), r122), "Encountered an unknown key '" + r122 + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw r16;
    L58:
        if (r63.f8375e == false) goto L99;
        boolean r14 = r22.mo211k(r15);
        InterfaceC0126Cx r74 = r22.mo210j(r15);
        if (r14 == false) goto L67;
        if (r74.mo208h() == true) goto L67;
        if (r2.m4769t(r11) == false) goto L67;
    L98:
        r7 = r2.m4768s();
        r83 = false;
    L67:
        if (AbstractC0585Nj.m1134a(r74.mo204c(), C0255Fx.f828h) == false) goto L99;
        if (r74.mo208h() == true) goto L71;
    L73:
        byte r103 = r2.m4765p();
        if (r132 == false) goto L81;
        if (r103 == 1) goto L79;
        if (r103 == 0) goto L79;
    L82:
        String r104 = r16;
    L85:
        if (r104 == 0) goto L99;
        int r105 = AbstractC0828TB.m1645n(r74, r92, r104);
        if (r92.f7922a.f8373c == false) goto L90;
    L93:
        boolean r75 = false;
    L94:
        if (r105 != (-3)) goto L99;
        if (r14 == true) goto L97;
        if (r75 == false) goto L99;
    L97:
        r2.m4759i();
        goto L98
    L90:
        if (r74.mo208h() == false) goto L93;
        r75 = true;
    L79:
        String r106 = r2.m4760j();
    L84:
        r2.f8218c = r106;
        r104 = r106;
        goto L85
    L81:
        if (r103 != 1) goto L82;
        r106 = r2.m4759i();
        goto L84
    L71:
        if (r2.m4769t(false) == false) goto L73;
    L99:
        if (r82 == null) goto L103;
        C1500hf r1 = r82.f8970a;
        if (r15 >= 64) goto L104;
        r1.f5286c |= 1 << r15;
        goto L103
    L104:
        int r23 = (r15 >>> 6) - 1;
        long[] r18 = r1.f5287d;
        r18[r23] = r18[r23] | (1 << (r15 & 63));
    L103:
        r12 = r15;
    L173:
        if (r5 == 3) goto L175;
        ((int[]) r3.f1576d)[r3.f1574b] = r12;
    L175:
        return r12;
    L54:
        r17 = r2.m4754d();
        goto L53
    L151:
        if (r62 == true) goto L176;
        if (r82 == null) goto L171;
        C1500hf r19 = r82.f8970a;
        C2551tm r24 = r19.f5285b;
        InterfaceC0126Cx r42 = r19.f5284a;
        int r65 = r42.mo205d();
    L154:
        long r76 = r19.f5286c;
        long r112 = -1;
        if (r76 == (-1)) goto L160;
        int r77 = Long.numberOfTrailingZeros(~r76);
        r19.f5286c |= 1 << r77;
        if (((Boolean) r24.mo446d(r42, Integer.valueOf(r77))).booleanValue() == false) goto L154;
        r12 = r77;
        goto L173
    L160:
        if (r65 <= 64) goto L171;
        long[] r110 = r19.f5287d;
        int r66 = r110.length;
    L162:
        if (r10 >= r66) goto L171;
        int r78 = r10 + 1;
        int r84 = r78 * 64;
        long r133 = r110[r10];
    L165:
        if (r133 == r112) goto L170;
        int r93 = Long.numberOfTrailingZeros(~r133);
        r133 = r133 | (1 << r93);
        int r94 = r93 + r84;
        if (((Boolean) r24.mo446d(r42, Integer.valueOf(r94))).booleanValue() == true) goto L168;
        r112 = -1;
        goto L165
    L168:
        r110[r10] = r133;
        r12 = r94;
        goto L173
    L170:
        r110[r10] = r133;
        r10 = r78;
        r112 = -1;
    L171:
        r12 = -1;
        goto L173
    L176:
        AbstractC1293cr.m2533F(r2);
        throw r16;
    L5:
        if (r6 == 2) goto L19;
        boolean r111 = r2.m4768s();
        if (r2.m4752b() == false) goto L15;
        int r43 = this.f7556j;
        if (r43 == (-1)) goto L14;
        if (r111 == true) goto L14;
        C2341oz.m4750m(r2, "Expected end of the array or comma", 0, 6);
        throw null;
    L14:
        r12 = r43 + 1;
        this.f7556j = r12;
        goto L173
    L15:
        if (r111 == false) goto L173;
        AbstractC1293cr.m2532E(r2, "array");
        throw null;
    L19:
        int r113 = this.f7556j;
        if ((r113 % 2) == 0) goto L22;
        boolean r44 = true;
    L23:
        if (r44 == false) goto L26;
        if (r113 == (-1)) goto L28;
        r102 = r2.m4768s();
    L28:
        if (r2.m4752b() == false) goto L43;
        if (r44 == true) goto L31;
    L42:
        r12 = this.f7556j + 1;
        this.f7556j = r12;
        goto L173
    L31:
        if (this.f7556j != (-1)) goto L37;
        int r114 = r2.f8216a;
        if (r102 == false) goto L42;
        C2341oz.m4750m(r2, "Unexpected leading comma", r114, 4);
        throw null;
    L37:
        int r115 = r2.f8216a;
        if (r102 == true) goto L42;
        C2341oz.m4750m(r2, "Expected comma after the key-value pair", r115, 4);
        throw null;
    L43:
        if (r102 == false) goto L173;
        AbstractC1293cr.m2533F(r2);
        throw null;
    L26:
        r2.m4757g(':');
        goto L28
    L22:
        r44 = false;
        goto L23
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: p */
    public final int mo846p() {
        C2341oz r0 = this.f7555i;
        long r1 = r0.m4758h();
        int r3 = (int) r1;
        if (r1 != r3) goto L5;
        return r3;
    L5:
        C2341oz.m4750m(r0, "Failed to parse int for input '" + r1 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0919Va
    /* JADX INFO: renamed from: r */
    public final void mo1777r(InterfaceC0126Cx r6) {
        if (this.f7553g.f7922a.f8371a == true) goto L5;
    L8:
        C2341oz r62 = this.f7555i;
        if (r62.m4768s() == true) goto L28;
        int r2 = this.f7554h;
        char r3 = '}';
        if (r2 != 1) goto L13;
    L21:
        r62.m4757g(r3);
        C0477L3 r63 = r62.f8217b;
        int r0 = r63.f1574b;
        int[] r22 = (int[]) r63.f1576d;
        if (r22[r0] != (-2)) goto L24;
        r22[r0] = -1;
        r63.f1574b = r0 - 1;
    L24:
        int r02 = r63.f1574b;
        if (r02 == (-1)) goto L32;
        r63.f1574b = r02 - 1;
        return;
    L32:
        return;
    L13:
        if (r2 != 2) goto L15;
    L18:
        r3 = ']';
        goto L21
    L15:
        if (r2 == 3) goto L21;
        if (r2 == 4) goto L18;
        throw null;
    L28:
        AbstractC1293cr.m2532E(r62, "");
        throw null;
    L5:
        if (r6.mo205d() != 0) goto L8;
    L7:
        if (mo1770j(r6) != (-1)) goto L7;
        goto L8
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: t */
    public final byte mo847t() {
        C2341oz r0 = this.f7555i;
        long r1 = r0.m4758h();
        byte r3 = (byte) r1;
        if (r1 != r3) goto L5;
        return r3;
    L5:
        C2341oz.m4750m(r0, "Failed to parse byte for input '" + r1 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: u */
    public final InterfaceC0406Jc mo848u(InterfaceC0126Cx r2) {
        Set r0 = AbstractC2212lz.f7700a;
        if (r2.mo207f() == true) goto L5;
    L8:
        return this;
    L5:
        if (AbstractC2212lz.f7700a.contains(r2) == false) goto L8;
        return new C2422qm(this.f7555i);
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0919Va
    /* JADX INFO: renamed from: v */
    public final Object mo1779v(InterfaceC0126Cx r5, int r6, InterfaceC0717Qm r7, Object r8) {
        C0477L3 r52 = this.f7555i.f8217b;
        if (this.f7554h == 3) goto L5;
    L7:
        boolean r62 = false;
    L9:
        if (r62 == false) goto L13;
        int[] r0 = (int[]) r52.f1576d;
        int r2 = r52.f1574b;
        if (r0[r2] != (-2)) goto L13;
        ((Object[]) r52.f1575c)[r2] = C1456gf.f5163g;
    L13:
        Object r72 = mo845h(r7);
        if (r62 == false) goto L21;
        int[] r63 = (int[]) r52.f1576d;
        int r02 = r52.f1574b;
        if (r63[r02] == (-2)) goto L20;
        int r03 = r02 + 1;
        r52.f1574b = r03;
        Object[] r64 = (Object[]) r52.f1575c;
        if (r03 != r64.length) goto L20;
        int r04 = r03 * 2;
        r52.f1575c = Arrays.copyOf(r64, r04);
        r52.f1576d = Arrays.copyOf((int[]) r52.f1576d, r04);
    L20:
        Object[] r65 = (Object[]) r52.f1575c;
        int r05 = r52.f1574b;
        r65[r05] = r72;
        ((int[]) r52.f1576d)[r05] = -2;
    L21:
        return r72;
    L5:
        if ((r6 & 1) != 0) goto L7;
        r62 = true;
        goto L9
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: x */
    public final short mo849x() {
        C2341oz r0 = this.f7555i;
        long r1 = r0.m4758h();
        short r3 = (short) r1;
        if (r1 != r3) goto L5;
        return r3;
    L5:
        C2341oz.m4750m(r0, "Failed to parse short for input '" + r1 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: y */
    public final String mo850y() {
        boolean r0 = this.f7557k.f8372b;
        C2341oz r1 = this.f7555i;
        if (r0 == false) goto L7;
        return r1.m4761k();
    L7:
        return r1.m4759i();
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: z */
    public final float mo851z() {
        C2341oz r0 = this.f7555i;
        String r1 = r0.m4760j();
        float r12 = Float.parseFloat(r1);     // Catch: IllegalArgumentException -> L11
        if (Float.isInfinite(r12) == false) goto L7;
    L9:
        C2341oz.m4750m(r0, "Unexpected special floating-point value " + Float.valueOf(r12) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    L7:
        if (Float.isNaN(r12) == true) goto L9;
        return r12;
    L11:
        C2341oz.m4750m(r0, "Failed to parse type 'float' for input '" + r1 + '\'', 0, 6);
        throw null;
    }
}

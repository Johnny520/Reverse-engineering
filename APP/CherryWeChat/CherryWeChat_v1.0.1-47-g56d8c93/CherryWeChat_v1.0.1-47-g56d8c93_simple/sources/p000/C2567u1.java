package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2567u1 extends AbstractC1551in {

    /* JADX INFO: renamed from: e */
    public static final C2207lu f8911e = null;

    /* JADX INFO: renamed from: f */
    public static final C2207lu f8912f = null;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8913d;

    static {
        f8911e = new C2207lu(C2301o1.class, new C2438r1(0));
        f8912f = new C2207lu(C0156Dk.class, new C2438r1(9));
    }

    public /* synthetic */ C2567u1(Class r1, C2481s1[] r2, int r3) {
        this.f8913d = r3;
        super(r1, r2);
    }

    /* JADX INFO: renamed from: h */
    public static C1508hn m5071h(int r2, int r3) {
        C0690Q1 r0 = C0732R1.m1525A();
        r0.m5038e();
        C0732R1.m1528x((C0732R1) r0.f8871b, r2);
        C0818T1 r22 = C0861U1.m1703z();
        r22.m5038e();
        C0861U1.m1701w((C0861U1) r22.f8871b);
        C0861U1 r23 = (C0861U1) r22.m5035b();
        r0.m5038e();
        C0732R1.m1527w((C0732R1) r0.f8871b, r23);
        return new C1508hn((C0732R1) r0.m5035b(), r3);
    }

    /* JADX INFO: renamed from: i */
    public static C1508hn m5072i(int r5, int r6, int r7) {
        C0346I1 r1 = C0389J1.m822B();
        C0432K1 r2 = C0475L1.m930z();
        r2.m5038e();
        C0475L1.m928w((C0475L1) r2.f8871b);
        C0475L1 r22 = (C0475L1) r2.m5035b();
        r1.m5038e();
        C0389J1.m823w((C0389J1) r1.f8871b, r22);
        r1.m5038e();
        C0389J1.m824x((C0389J1) r1.f8871b, r5);
        C0389J1 r52 = (C0389J1) r1.m5035b();
        C0199Ek r12 = C0242Fk.m508B();
        C0328Hk r23 = C0371Ik.m814B();
        r23.m5038e();
        C0371Ik.m815w((C0371Ik) r23.f8871b, EnumC2463rk.f8680e);
        r23.m5038e();
        C0371Ik.m816x((C0371Ik) r23.f8871b, r6);
        C0371Ik r62 = (C0371Ik) r23.m5035b();
        r12.m5038e();
        C0242Fk.m510w((C0242Fk) r12.f8871b, r62);
        r12.m5038e();
        C0242Fk.m511x((C0242Fk) r12.f8871b, 32);
        C0242Fk r63 = (C0242Fk) r12.m5035b();
        C0088C1 r13 = C0131D1.m224A();
        r13.m5038e();
        C0131D1.m226w((C0131D1) r13.f8871b, r52);
        r13.m5038e();
        C0131D1.m227x((C0131D1) r13.f8871b, r63);
        return new C1508hn((C0131D1) r13.m5035b(), r7);
    }

    /* JADX INFO: renamed from: j */
    public static C1508hn m5073j(int r2, int r3) {
        C1120a2 r0 = C1200b2.m2320y();
        r0.m5038e();
        C1200b2.m2319w((C1200b2) r0.f8871b, r2);
        return new C1508hn((C1200b2) r0.m5035b(), r3);
    }

    /* JADX INFO: renamed from: k */
    public static C1508hn m5074k(int r2, int r3) {
        C1524i2 r0 = C2081j2.m4243y();
        r0.m5038e();
        C2081j2.m4242w((C2081j2) r0.f8871b, r2);
        return new C1508hn((C2081j2) r0.m5035b(), r3);
    }

    /* JADX INFO: renamed from: l */
    public static C1508hn m5075l(int r4, int r5, EnumC2463rk r6, int r7) {
        C0199Ek r1 = C0242Fk.m508B();
        C0328Hk r2 = C0371Ik.m814B();
        r2.m5038e();
        C0371Ik.m815w((C0371Ik) r2.f8871b, r6);
        r2.m5038e();
        C0371Ik.m816x((C0371Ik) r2.f8871b, r5);
        C0371Ik r52 = (C0371Ik) r2.m5035b();
        r1.m5038e();
        C0242Fk.m510w((C0242Fk) r1.f8871b, r52);
        r1.m5038e();
        C0242Fk.m511x((C0242Fk) r1.f8871b, r4);
        return new C1508hn((C0242Fk) r1.m5035b(), r7);
    }

    /* JADX INFO: renamed from: m */
    public static void m5076m(C2739y1 r2) {
        if (r2.m5303y() < 10) goto L10;
        if (r2.m5303y() > 16) goto L8;
        return;
    L8:
        throw new GeneralSecurityException("tag size too long");
    L10:
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: renamed from: n */
    public static void m5077n(C0371Ik r3) {
        if (r3.m818A() < 10) goto L42;
        int r0 = r3.m819z().ordinal();
        if (r0 == 1) goto L37;
        if (r0 == 2) goto L32;
        if (r0 == 3) goto L27;
        if (r0 == 4) goto L22;
        if (r0 != 5) goto L20;
        if (r3.m818A() > 28) goto L18;
        return;
    L18:
        throw new GeneralSecurityException("tag size too big");
    L20:
        throw new GeneralSecurityException("unknown hash type");
    L22:
        if (r3.m818A() > 64) goto L25;
        return;
    L25:
        throw new GeneralSecurityException("tag size too big");
    L27:
        if (r3.m818A() > 32) goto L30;
        return;
    L30:
        throw new GeneralSecurityException("tag size too big");
    L32:
        if (r3.m818A() > 48) goto L35;
        return;
    L35:
        throw new GeneralSecurityException("tag size too big");
    L37:
        if (r3.m818A() > 20) goto L40;
        return;
    L40:
        throw new GeneralSecurityException("tag size too big");
    L42:
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: a */
    public int mo2969a() {
        switch(this.f8913d) {
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L5;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return 2;
    L8:
        return 2;
    L10:
        return 2;
    L5:
        return super.mo2969a();
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: b */
    public final String mo2970b() {
        switch(this.f8913d) {
            case 0: goto L24;
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L14;
            case 6: goto L12;
            case 7: goto L10;
            case 8: goto L8;
            case 9: goto L6;
            default: goto L4;
        };
    L4:
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    L6:
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    L8:
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    L10:
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    L12:
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    L14:
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    L16:
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    L18:
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    L20:
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    L22:
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    L24:
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: d */
    public final AbstractC2614v5 mo2972d() {
        switch(this.f8913d) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        return new C2524t1(this, (byte) 0, 0);
    L7:
        return new C2524t1(this, (byte) 0, 0);
    L9:
        return new C2524t1(this, (byte) 0, 0);
    L11:
        return new C2524t1(this, (byte) 0, false);
    L13:
        return new C2524t1(this, 0);
    L15:
        return new C2524t1(this, 0);
    L17:
        return new C2524t1(this, 0);
    L19:
        return new C2524t1(this, (byte) 0);
    L21:
        return new C2524t1(this);
    L23:
        return new C2524t1(this, (byte) 0, (byte) 0);
    L25:
        return new C2524t1(C2395q1.class);
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: e */
    public final EnumC0888Um mo2973e() {
        switch(this.f8913d) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        return EnumC0888Um.f2777c;
    L7:
        return EnumC0888Um.f2780f;
    L9:
        return EnumC0888Um.f2780f;
    L11:
        return EnumC0888Um.f2777c;
    L13:
        return EnumC0888Um.f2777c;
    L15:
        return EnumC0888Um.f2777c;
    L17:
        return EnumC0888Um.f2777c;
    L19:
        return EnumC0888Um.f2777c;
    L21:
        return EnumC0888Um.f2777c;
    L23:
        return EnumC0888Um.f2777c;
    L25:
        return EnumC0888Um.f2777c;
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: f */
    public final AbstractC0043B mo2974f(AbstractC2744y6 r2) {
        switch(this.f8913d) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        return C0875UF.m1712B(r2, C0839Tg.m1660a());
    L7:
        return C2810zn.m5434B(r2, C0839Tg.m1660a());
    L9:
        return C2595un.m5103B(r2, C0839Tg.m1660a());
    L11:
        return C1353e7.m2624B(r2, C0839Tg.m1660a());
    L13:
        return C2302o2.m4675B(r2, C0839Tg.m1660a());
    L15:
        return C1436g2.m2746B(r2, C0839Tg.m1660a());
    L17:
        return C1033Y1.m1966B(r2, C0839Tg.m1660a());
    L19:
        return C0604O1.m1179D(r2, C0839Tg.m1660a());
    L21:
        return C0045B1.m69D(r2, C0839Tg.m1660a());
    L23:
        return C0113Ck.m174E(r2, C0839Tg.m1660a());
    L25:
        return C2258n1.m4592D(r2, C0839Tg.m1660a());
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: g */
    public final void mo2975g(AbstractC0043B r9) {
        switch(this.f8913d) {
            case 0: goto L61;
            case 1: goto L55;
            case 2: goto L35;
            case 3: goto L27;
            case 4: goto L25;
            case 5: goto L23;
            case 6: goto L18;
            case 7: goto L13;
            case 8: goto L11;
            case 9: goto L9;
            default: goto L4;
        };
    L4:
        C0875UF r92 = (C0875UF) r9;
        AbstractC0100CD.m148c(r92.m1716z());
        if (r92.m1715y().size() != 32) goto L8;
        return;
    L8:
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    L9:
        AbstractC0100CD.m148c(((C2810zn) r9).m5438z());
        return;
    L11:
        AbstractC0100CD.m148c(((C2595un) r9).m5107z());
        return;
    L13:
        C1353e7 r93 = (C1353e7) r9;
        AbstractC0100CD.m148c(r93.m2628z());
        if (r93.m2627y().size() != 32) goto L17;
        return;
    L17:
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    L18:
        C2302o2 r94 = (C2302o2) r9;
        AbstractC0100CD.m148c(r94.m4679z());
        if (r94.m4678y().size() != 64) goto L22;
        return;
    L22:
        throw new InvalidKeyException("invalid key size: " + r94.m4678y().size() + ". Valid keys must have 64 bytes.");
    L23:
        C1436g2 r95 = (C1436g2) r9;
        AbstractC0100CD.m148c(r95.m2750z());
        AbstractC0100CD.m146a(r95.m2749y().size());
        return;
    L25:
        C1033Y1 r96 = (C1033Y1) r9;
        AbstractC0100CD.m148c(r96.m1970z());
        AbstractC0100CD.m146a(r96.m1969y().size());
        return;
    L27:
        C0604O1 r97 = (C0604O1) r9;
        AbstractC0100CD.m148c(r97.m1184B());
        AbstractC0100CD.m146a(r97.m1185z().size());
        if (r97.m1183A().m1704y() != 12) goto L30;
        return;
    L30:
        if (r97.m1183A().m1704y() != 16) goto L33;
        return;
    L33:
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    L35:
        C0045B1 r98 = (C0045B1) r9;
        AbstractC0100CD.m148c(r98.m74B());
        C2481s1[] r0 = {new C2481s1(2, InterfaceC1506hl.class)};
        HashMap r1 = new HashMap();
        C2481s1 r3 = r0[0];
        Class r4 = r3.f8716a;
        if (r1.containsKey(r4) == true) goto L54;
        r1.put(r4, r3);
        Class r02 = r0[0].f8716a;
        Collections.unmodifiableMap(r1);
        C0303H1 r03 = r98.m75z();
        AbstractC0100CD.m148c(r03.m653C());
        AbstractC0100CD.m146a(r03.m651A().size());
        C0475L1 r04 = r03.m652B();
        if (r04.m931y() < 12) goto L52;
        if (r04.m931y() > 16) goto L52;
        C2481s1[] r05 = {new C2481s1(8, InterfaceC0891Up.class)};
        HashMap r32 = new HashMap();
        C2481s1 r42 = r05[0];
        Class r5 = r42.f8716a;
        if (r32.containsKey(r5) == true) goto L50;
        r32.put(r5, r42);
        Class r06 = r05[0].f8716a;
        Collections.unmodifiableMap(r32);
        C0113Ck r99 = r98.m73A();
        AbstractC0100CD.m148c(r99.m181C());
        if (r99.m179A().size() < 16) goto L48;
        m5077n(r99.m180B());
        return;
    L48:
        throw new GeneralSecurityException("key too short");
    L50:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r5.getCanonicalName());
    L52:
        throw new GeneralSecurityException("invalid IV size");
    L54:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r4.getCanonicalName());
    L55:
        C0113Ck r910 = (C0113Ck) r9;
        AbstractC0100CD.m148c(r910.m181C());
        if (r910.m179A().size() < 16) goto L60;
        m5077n(r910.m180B());
        return;
    L60:
        throw new GeneralSecurityException("key too short");
    L61:
        C2258n1 r911 = (C2258n1) r9;
        AbstractC0100CD.m148c(r911.m4597B());
        if (r911.m4598z().size() != 32) goto L66;
        m5076m(r911.m4596A());
        return;
    L66:
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    public C2567u1() {
        this.f8913d = 1;
        super(C0113Ck.class, new C2481s1[]{new C2481s1(8, InterfaceC0891Up.class)});
    }
}

package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: zs */
/* JADX INFO: loaded from: classes.dex */
public final class C2815zs {

    /* JADX INFO: renamed from: b */
    public static final C2815zs f9535b = null;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9536a;

    static {
        f9535b = new C2815zs();
    }

    public C2815zs() {
        this.f9536a = new AtomicReference(new C0470Kx(new C2428qs(8)));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0828TB m5449a(C0252Fu r9) {
        AtomicReference r0 = this.f9536a;
        C0470Kx r1 = (C0470Kx) r0.get();
        r1.getClass();
        C2787z6 r3 = (C2787z6) r9.f820b;
        if (r1.f1526b.containsKey(new C0384Ix(C0252Fu.class, r3)) == false) goto L202;
        C0470Kx r02 = (C0470Kx) r0.get();
        r02.getClass();
        C0384Ix r12 = new C0384Ix(C0252Fu.class, r3);
        HashMap r03 = r02.f1526b;
        if (r03.containsKey(r12) == false) goto L196;
        switch(((C1148an) r03.get(r12)).f3644b.f8552a) {
            case 1: goto L178;
            case 2: goto L139;
            case 3: goto L106;
            case 4: goto L75;
            case 5: goto L50;
            case 6: goto L14;
            case 7: goto L14;
            case 8: goto L14;
            case 9: goto L14;
            case 10: goto L39;
            default: goto L14;
        };
    L14:
        if (((String) r9.f819a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key") == false) goto L37;
        C0875UF r04 = C0875UF.m1712B((AbstractC2744y6) r9.f821c, C0839Tg.m1660a());     // Catch: C0673Pl -> L34
        if (r04.m1716z() != 0) goto L33;
        EnumC2773yt r13 = (EnumC2773yt) r9.f823e;     // Catch: C0673Pl -> L34
        int r2 = r13.ordinal();     // Catch: C0673Pl -> L34
        if (r2 != 1) goto L20;
        C2610v1 r14 = C2610v1.f8999E;     // Catch: C0673Pl -> L34
    L206:
        return C0918VF.m1766N(r14, new C1017Xm(13, C2787z6.m5359a(r04.m1715y().m5329g())), (Integer) r9.f824f);
    L20:
        if (r2 != 2) goto L22;
    L29:
        r14 = C2610v1.f9000F;     // Catch: C0673Pl -> L34
        goto L206
    L22:
        if (r2 != 3) goto L24;
        r14 = C2610v1.f9001G;     // Catch: C0673Pl -> L34
        goto L206
    L24:
        if (r2 == 4) goto L29;
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r13.m5345b());     // Catch: C0673Pl -> L34
    L33:
        throw new GeneralSecurityException("Only version 0 keys are accepted");     // Catch: C0673Pl -> L34
    L35:
        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
    L37:
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
    L39:
        if (((String) r9.f819a).equals("type.googleapis.com/google.crypto.tink.HmacKey") == false) goto L48;
        C0113Ck r05 = C0113Ck.m174E((AbstractC2744y6) r9.f821c, C0839Tg.m1660a());     // Catch: Throwable -> L45
        if (r05.m181C() != 0) goto L44;
        C2428qs r15 = new C2428qs();     // Catch: Throwable -> L45
        r15.f8520a = null;     // Catch: Throwable -> L45
        r15.f8521b = null;     // Catch: Throwable -> L45
        r15.f8522c = null;     // Catch: Throwable -> L45
        r15.f8523d = C2610v1.f8995A;     // Catch: Throwable -> L45
        r15.f8520a = Integer.valueOf(r05.m179A().size());     // Catch: Throwable -> L45
        r15.f8521b = Integer.valueOf(r05.m180B().m818A());     // Catch: Throwable -> L45
        r15.f8522c = AbstractC0414Jk.m863a(r05.m180B().m819z());     // Catch: Throwable -> L45
        r15.f8523d = AbstractC0414Jk.m864b((EnumC2773yt) r9.f823e);     // Catch: Throwable -> L45
        C0285Gk r16 = r15.m4871i();     // Catch: Throwable -> L45
        C2656w4 r32 = new C2656w4(14);     // Catch: Throwable -> L45
        r32.f9197c = null;     // Catch: Throwable -> L45
        r32.f9198d = null;     // Catch: Throwable -> L45
        r32.f9196b = r16;     // Catch: Throwable -> L45
        r32.f9197c = new C1017Xm(13, C2787z6.m5359a(r05.m179A().m5329g()));     // Catch: Throwable -> L45
        r32.f9198d = (Integer) r9.f824f;     // Catch: Throwable -> L45
        return r32.m5205j();
    L44:
        throw new GeneralSecurityException("Only version 0 keys are accepted");     // Catch: Throwable -> L45
    L46:
        throw new GeneralSecurityException("Parsing HmacKey failed");
    L48:
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    L50:
        if (((String) r9.f819a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key") == false) goto L73;
        C1353e7 r06 = C1353e7.m2624B((AbstractC2744y6) r9.f821c, C0839Tg.m1660a());     // Catch: C0673Pl -> L70
        if (r06.m2628z() != 0) goto L69;
        EnumC2773yt r17 = (EnumC2773yt) r9.f823e;     // Catch: C0673Pl -> L70
        int r22 = r17.ordinal();     // Catch: C0673Pl -> L70
        if (r22 != 1) goto L56;
        C2610v1 r18 = C2610v1.f9015p;     // Catch: C0673Pl -> L70
    L208:
        return C1397f7.m2673N(r18, new C1017Xm(13, C2787z6.m5359a(r06.m2627y().m5329g())), (Integer) r9.f824f);
    L56:
        if (r22 != 2) goto L58;
    L65:
        r18 = C2610v1.f9016q;     // Catch: C0673Pl -> L70
        goto L208
    L58:
        if (r22 != 3) goto L60;
        r18 = C2610v1.f9017r;     // Catch: C0673Pl -> L70
        goto L208
    L60:
        if (r22 == 4) goto L65;
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r17.m5345b());     // Catch: C0673Pl -> L70
    L69:
        throw new GeneralSecurityException("Only version 0 keys are accepted");     // Catch: C0673Pl -> L70
    L71:
        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
    L73:
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
    L75:
        if (((String) r9.f819a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey") == false) goto L104;
        C1436g2 r07 = C1436g2.m2746B((AbstractC2744y6) r9.f821c, C0839Tg.m1660a());     // Catch: C0673Pl -> L101
        if (r07.m2750z() != 0) goto L100;
        C2610v1 r19 = C2610v1.f9014o;     // Catch: C0673Pl -> L101
        int r23 = r07.m2749y().size();     // Catch: C0673Pl -> L101
        if (r23 != 16) goto L81;
    L85:
        EnumC2773yt r33 = (EnumC2773yt) r9.f823e;     // Catch: C0673Pl -> L101
        int r4 = r33.ordinal();     // Catch: C0673Pl -> L101
        if (r4 != 1) goto L88;
        r19 = C2610v1.f9012m;     // Catch: C0673Pl -> L101
    L98:
        C2125k2 r34 = new C2125k2(r23, r19);     // Catch: C0673Pl -> L101
        C2656w4 r110 = new C2656w4(5);     // Catch: C0673Pl -> L101
        r110.f9197c = null;     // Catch: C0673Pl -> L101
        r110.f9198d = null;     // Catch: C0673Pl -> L101
        r110.f9196b = r34;     // Catch: C0673Pl -> L101
        r110.f9197c = new C1017Xm(13, C2787z6.m5359a(r07.m2749y().m5329g()));     // Catch: C0673Pl -> L101
        r110.f9198d = (Integer) r9.f824f;     // Catch: C0673Pl -> L101
        return r110.m5204h();
    L88:
        if (r4 != 2) goto L90;
    L96:
        r19 = C2610v1.f9013n;     // Catch: C0673Pl -> L101
        goto L98
    L90:
        if (r4 == 3) goto L98;
        if (r4 == 4) goto L96;
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r33.m5345b());     // Catch: C0673Pl -> L101
    L81:
        if (r23 == 32) goto L85;
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r23)}));     // Catch: C0673Pl -> L101
    L100:
        throw new GeneralSecurityException("Only version 0 keys are accepted");     // Catch: C0673Pl -> L101
    L102:
        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
    L104:
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
    L106:
        if (((String) r9.f819a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey") == false) goto L137;
        C1033Y1 r08 = C1033Y1.m1966B((AbstractC2744y6) r9.f821c, C0839Tg.m1660a());     // Catch: C0673Pl -> L134
        if (r08.m1970z() != 0) goto L133;
        C2610v1 r111 = C2610v1.f9011l;     // Catch: C0673Pl -> L134
        int r24 = r08.m1969y().size();     // Catch: C0673Pl -> L134
        if (r24 != 16) goto L112;
    L118:
        EnumC2773yt r42 = (EnumC2773yt) r9.f823e;     // Catch: C0673Pl -> L134
        int r5 = r42.ordinal();     // Catch: C0673Pl -> L134
        if (r5 != 1) goto L121;
        r111 = C2610v1.f9009j;     // Catch: C0673Pl -> L134
    L131:
        C1243c2 r43 = new C1243c2(r24, 12, 16, r111);     // Catch: C0673Pl -> L134
        C2656w4 r112 = new C2656w4(4);     // Catch: C0673Pl -> L134
        r112.f9197c = null;     // Catch: C0673Pl -> L134
        r112.f9198d = null;     // Catch: C0673Pl -> L134
        r112.f9196b = r43;     // Catch: C0673Pl -> L134
        r112.f9197c = new C1017Xm(13, C2787z6.m5359a(r08.m1969y().m5329g()));     // Catch: C0673Pl -> L134
        r112.f9198d = (Integer) r9.f824f;     // Catch: C0673Pl -> L134
        return r112.m5203g();
    L121:
        if (r5 != 2) goto L123;
    L129:
        r111 = C2610v1.f9010k;     // Catch: C0673Pl -> L134
        goto L131
    L123:
        if (r5 == 3) goto L131;
        if (r5 == 4) goto L129;
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r42.m5345b());     // Catch: C0673Pl -> L134
    L112:
        if (r24 == 24) goto L118;
        if (r24 == 32) goto L118;
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r24)}));     // Catch: C0673Pl -> L134
    L133:
        throw new GeneralSecurityException("Only version 0 keys are accepted");     // Catch: C0673Pl -> L134
    L135:
        throw new GeneralSecurityException("Parsing AesGcmKey failed");
    L137:
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
    L139:
        if (((String) r9.f819a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey") == false) goto L176;
        C0604O1 r09 = C0604O1.m1179D((AbstractC2744y6) r9.f821c, C0839Tg.m1660a());     // Catch: C0673Pl -> L173
        if (r09.m1184B() != 0) goto L172;
        C2610v1 r113 = C2610v1.f9008i;     // Catch: C0673Pl -> L173
        int r25 = r09.m1185z().size();     // Catch: C0673Pl -> L173
        if (r25 != 16) goto L145;
    L151:
        int r44 = r09.m1183A().m1704y();     // Catch: C0673Pl -> L173
        if (r44 == 12) goto L157;
        if (r44 == 16) goto L157;
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(r44)}));     // Catch: C0673Pl -> L173
    L157:
        EnumC2773yt r52 = (EnumC2773yt) r9.f823e;     // Catch: C0673Pl -> L173
        int r6 = r52.ordinal();     // Catch: C0673Pl -> L173
        if (r6 != 1) goto L160;
        r113 = C2610v1.f9006g;     // Catch: C0673Pl -> L173
    L170:
        C0775S1 r53 = new C0775S1(r25, r44, 16, r113);     // Catch: C0673Pl -> L173
        C2656w4 r114 = new C2656w4(3);     // Catch: C0673Pl -> L173
        r114.f9197c = null;     // Catch: C0673Pl -> L173
        r114.f9198d = null;     // Catch: C0673Pl -> L173
        r114.f9196b = r53;     // Catch: C0673Pl -> L173
        r114.f9197c = new C1017Xm(13, C2787z6.m5359a(r09.m1185z().m5329g()));     // Catch: C0673Pl -> L173
        r114.f9198d = (Integer) r9.f824f;     // Catch: C0673Pl -> L173
        return r114.m5202f();
    L160:
        if (r6 != 2) goto L162;
    L168:
        r113 = C2610v1.f9007h;     // Catch: C0673Pl -> L173
        goto L170
    L162:
        if (r6 == 3) goto L170;
        if (r6 == 4) goto L168;
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r52.m5345b());     // Catch: C0673Pl -> L173
    L145:
        if (r25 == 24) goto L151;
        if (r25 == 32) goto L151;
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r25)}));     // Catch: C0673Pl -> L173
    L172:
        throw new GeneralSecurityException("Only version 0 keys are accepted");     // Catch: C0673Pl -> L173
    L174:
        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
    L176:
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
    L178:
        if (((String) r9.f819a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey") == false) goto L194;
        C2258n1 r010 = C2258n1.m4592D((AbstractC2744y6) r9.f821c, C0839Tg.m1660a());     // Catch: Throwable -> L191
        if (r010.m4597B() != 0) goto L190;
        C2656w4 r115 = new C2656w4(2);     // Catch: Throwable -> L191
        r115.f9196b = null;     // Catch: Throwable -> L191
        r115.f9197c = null;     // Catch: Throwable -> L191
        r115.f9198d = C2610v1.f9005f;     // Catch: Throwable -> L191
        r115.m5197G(r010.m4598z().size());     // Catch: Throwable -> L191
        int r35 = r010.m4596A().m5303y();     // Catch: Throwable -> L191
        if (r35 < 10) goto L188;
        if (16 < r35) goto L188;
        r115.f9197c = Integer.valueOf(r35);     // Catch: Throwable -> L191
        r115.f9198d = AbstractC2782z1.m5354a((EnumC2773yt) r9.f823e);     // Catch: Throwable -> L191
        C2653w1 r116 = r115.m5201e();     // Catch: Throwable -> L191
        C2656w4 r36 = new C2656w4(1);     // Catch: Throwable -> L191
        r36.f9197c = null;     // Catch: Throwable -> L191
        r36.f9198d = null;     // Catch: Throwable -> L191
        r36.f9196b = r116;     // Catch: Throwable -> L191
        r36.f9197c = new C1017Xm(13, C2787z6.m5359a(r010.m4598z().m5329g()));     // Catch: Throwable -> L191
        r36.f9198d = (Integer) r9.f824f;     // Catch: Throwable -> L191
        return r36.m5200d();
    L188:
        throw new GeneralSecurityException(AbstractC2374ph.m4812i(r35, "Invalid tag size for AesCmacParameters: "));     // Catch: Throwable -> L191
    L190:
        throw new GeneralSecurityException("Only version 0 keys are accepted");     // Catch: Throwable -> L191
    L192:
        throw new GeneralSecurityException("Parsing AesCmacKey failed");
    L194:
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    L196:
        throw new GeneralSecurityException("No Key Parser for requested key type " + r12 + " available");
    L202:
        C0460Kn r011 = new C0460Kn();     // Catch: GeneralSecurityException -> L6
        ((EnumC0888Um) r9.f822d).ordinal();     // Catch: GeneralSecurityException -> L6
        return r011;
    L6:
        e = move-exception;
        throw new C0232Fa("Creating a LegacyProtoKey failed", e);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5450b(C1148an r3) {
        monitor-enter(this);
        C2428qs r0 = new C2428qs((C0470Kx) this.f9536a.get());     // Catch: Throwable -> L6
        r0.m4887y(r3);     // Catch: Throwable -> L6
        C0470Kx r32 = new C0470Kx(r0);     // Catch: Throwable -> L6
        this.f9536a.set(r32);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5451c(C1228bn r3) {
        monitor-enter(this);
        C2428qs r0 = new C2428qs((C0470Kx) this.f9536a.get());     // Catch: Throwable -> L6
        r0.m4888z(r3);     // Catch: Throwable -> L6
        C0470Kx r32 = new C0470Kx(r0);     // Catch: Throwable -> L6
        this.f9536a.set(r32);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5452d(C0337Ht r3) {
        monitor-enter(this);
        C2428qs r0 = new C2428qs((C0470Kx) this.f9536a.get());     // Catch: Throwable -> L6
        r0.m4862A(r3);     // Catch: Throwable -> L6
        C0470Kx r32 = new C0470Kx(r0);     // Catch: Throwable -> L6
        this.f9536a.set(r32);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m5453e(C0380It r3) {
        monitor-enter(this);
        C2428qs r0 = new C2428qs((C0470Kx) this.f9536a.get());     // Catch: Throwable -> L6
        r0.m4863B(r3);     // Catch: Throwable -> L6
        C0470Kx r32 = new C0470Kx(r0);     // Catch: Throwable -> L6
        this.f9536a.set(r32);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}

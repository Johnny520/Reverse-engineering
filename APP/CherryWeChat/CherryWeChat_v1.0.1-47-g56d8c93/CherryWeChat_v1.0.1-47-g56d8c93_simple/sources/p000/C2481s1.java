package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2481s1 {

    /* JADX INFO: renamed from: a */
    public final Class f8716a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8717b;

    public C2481s1(int r1, Class r2) {
        this.f8717b = r1;
        this.f8716a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4966a(AbstractC0043B r15) {
        switch(this.f8717b) {
            case 0: goto L71;
            case 1: goto L40;
            case 2: goto L38;
            case 3: goto L36;
            case 4: goto L35;
            case 5: goto L33;
            case 6: goto L31;
            case 7: goto L29;
            case 8: goto L10;
            case 9: goto L8;
            case 10: goto L6;
            default: goto L5;
        };
    L6:
        C2810zn r152 = (C2810zn) r15;
        String r0 = r152.m5437y().m46y();
        return new C2724xn(r152.m5437y().m45x(), AbstractC2681wn.m5250a(r0).m328c(r0));
    L8:
        String r153 = ((C2595un) r15).m5106y().m5165x();
        return AbstractC2681wn.m5250a(r153).m328c(r153);
    L10:
        C0113Ck r154 = (C0113Ck) r15;
        EnumC2463rk r02 = r154.m180B().m819z();
        SecretKeySpec r2 = new SecretKeySpec(r154.m179A().m5329g(), "HMAC");
        int r155 = r154.m180B().m818A();
        int r03 = r02.ordinal();
        if (r03 == 1) goto L27;
        if (r03 == 2) goto L80;
        if (r03 == 3) goto L79;
        if (r03 == 4) goto L78;
        if (r03 != 5) goto L22;
        return new C1515hu(new C0584Ni("HMACSHA224", r2), r155);
    L22:
        throw new GeneralSecurityException("unknown hash");
    L78:
        return new C1515hu(new C0584Ni("HMACSHA512", r2), r155);
    L79:
        return new C1515hu(new C0584Ni("HMACSHA256", r2), r155);
    L80:
        return new C1515hu(new C0584Ni("HMACSHA384", r2), r155);
    L27:
        return new C1515hu(new C0584Ni("HMACSHA1", r2), r155);
    L36:
        C0604O1 r156 = (C0604O1) r15;
        return new C0518M1(r156.m1183A().m1704y(), r156.m1185z().m5329g());
    L38:
        C0303H1 r157 = (C0303H1) r15;
        return new C0217F1(r157.m652B().m931y(), r157.m651A().m5329g());
    L40:
        C0045B1 r158 = (C0045B1) r15;
        C2481s1[] r1 = {new C2481s1(2, InterfaceC1506hl.class)};
        HashMap r22 = new HashMap();
        int r4 = r1.length;
        int r6 = 0;
    L42:
        if (r6 >= r4) goto L49;
        C2481s1 r8 = r1[r6];
        Class r9 = r8.f8716a;
        if (r22.containsKey(r9) == true) goto L47;
        r22.put(r9, r8);
        r6 = r6 + 1;
        goto L42
    L47:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r9.getCanonicalName());
    L49:
        if (r1.length <= 0) goto L51;
        Class r12 = r1[0].f8716a;
    L51:
        Map r13 = Collections.unmodifiableMap(r22);
        C0303H1 r23 = r158.m75z();
        C2481s1 r14 = (C2481s1) r13.get(InterfaceC1506hl.class);
        if (r14 == null) goto L70;
        InterfaceC1506hl r16 = (InterfaceC1506hl) r14.m4966a(r23);
        C2481s1[] r24 = {new C2481s1(8, InterfaceC0891Up.class)};
        HashMap r3 = new HashMap();
        int r92 = r24.length;
        int r10 = 0;
    L54:
        if (r10 >= r92) goto L61;
        C2481s1 r11 = r24[r10];
        Class r122 = r11.f8716a;
        if (r3.containsKey(r122) == true) goto L59;
        r3.put(r122, r11);
        r10 = r10 + 1;
        goto L54
    L59:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r122.getCanonicalName());
    L61:
        if (r24.length <= 0) goto L63;
        Class r25 = r24[0].f8716a;
    L63:
        Map r26 = Collections.unmodifiableMap(r3);
        C0113Ck r32 = r158.m73A();
        C2481s1 r27 = (C2481s1) r26.get(InterfaceC0891Up.class);
        if (r27 == null) goto L68;
        return new C0795Sf(r16, (InterfaceC0891Up) r27.m4966a(r32), r158.m73A().m180B().m818A());
    L68:
        throw new IllegalArgumentException("Requested primitive class " + InterfaceC0891Up.class.getCanonicalName() + " not supported.");
    L70:
        throw new IllegalArgumentException("Requested primitive class " + InterfaceC1506hl.class.getCanonicalName() + " not supported.");
    L71:
        C2258n1 r159 = (C2258n1) r15;
        return new C1515hu(new C2656w4(r159.m4598z().m5329g()), r159.m4596A().m5303y());
    L5:
        return new C0947W1(3, ((C0875UF) r15).m1715y().m5329g());
    L29:
        return new C0947W1(2, ((C1353e7) r15).m2627y().m5329g());
    L31:
        return new C2216m2(((C2302o2) r15).m4678y().m5329g());
    L33:
        return new C1348e2(((C1436g2) r15).m2749y().m5329g());
    L35:
        return new C0947W1(0, ((C1033Y1) r15).m1969y().m5329g());
    }
}

package p000;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: nx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2296nx {

    /* JADX INFO: renamed from: a */
    public static final Class f8047a = null;

    /* JADX INFO: renamed from: b */
    public static final C1044YC f8048b = null;

    /* JADX INFO: renamed from: c */
    public static final C1044YC f8049c = null;

    /* JADX INFO: renamed from: d */
    public static final C1044YC f8050d = null;

    static {
        Class<?> r0 = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");     // Catch: Throwable -> L4
    L5:
        f8047a = r0;
        f8048b = m4668v(false);
        f8049c = m4668v(true);
        f8050d = new C1044YC();
        return;
    L4:
        r0 = null;
        goto L5
    }

    /* JADX INFO: renamed from: A */
    public static void m4631A(int r3, List r4, C0132D2 r5, boolean r6) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.isEmpty() == true) goto L22;
        C2230ma r52 = (C2230ma) r5.f328b;
        int r0 = 0;
        if (r6 == false) goto L16;
        r52.m4534a0(r3, 2);
        int r32 = 0;
        int r62 = 0;
    L9:
        if (r32 >= r4.size()) goto L11;
        ((Double) r4.get(r32)).getClass();
        Logger r1 = C2230ma.f7797j;
        r62 = r62 + 8;
        r32 = r32 + 1;
        goto L9
    L11:
        r52.m4535b0(r62);
    L13:
        if (r0 >= r4.size()) goto L23;
        r52.m4532Y(Double.doubleToRawLongBits(((Double) r4.get(r0)).doubleValue()));
        r0 = r0 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r0 >= r4.size()) goto L24;
        double r12 = ((Double) r4.get(r0)).doubleValue();
        r52.getClass();
        r52.m4531X(r3, Double.doubleToRawLongBits(r12));
        r0 = r0 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: B */
    public static void m4632B(int r2, List r3, C0132D2 r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L23;
        C2230ma r42 = (C2230ma) r4.f328b;
        int r0 = 0;
        if (r5 == false) goto L15;
        r42.m4534a0(r2, 2);
        int r22 = 0;
        int r52 = 0;
    L9:
        if (r22 >= r3.size()) goto L11;
        r52 = r52 + C2230ma.m4522O(((Integer) r3.get(r22)).intValue());
        r22 = r22 + 1;
        goto L9
    L11:
        r42.m4535b0(r52);
    L13:
        if (r0 >= r3.size()) goto L24;
        r42.m4533Z(((Integer) r3.get(r0)).intValue());
        r0 = r0 + 1;
        goto L13
    L24:
        return;
    L15:
        int r53 = 0;
    L17:
        if (r53 >= r3.size()) goto L25;
        int r1 = ((Integer) r3.get(r53)).intValue();
        r42.m4534a0(r2, 0);
        r42.m4533Z(r1);
        r53 = r53 + 1;
        goto L17
    L25:
        return;
    }

    /* JADX INFO: renamed from: C */
    public static void m4633C(int r2, List r3, C0132D2 r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L22;
        C2230ma r42 = (C2230ma) r4.f328b;
        int r0 = 0;
        if (r5 == false) goto L16;
        r42.m4534a0(r2, 2);
        int r22 = 0;
        int r52 = 0;
    L9:
        if (r22 >= r3.size()) goto L11;
        ((Integer) r3.get(r22)).getClass();
        Logger r1 = C2230ma.f7797j;
        r52 = r52 + 4;
        r22 = r22 + 1;
        goto L9
    L11:
        r42.m4535b0(r52);
    L13:
        if (r0 >= r3.size()) goto L23;
        r42.m4530W(((Integer) r3.get(r0)).intValue());
        r0 = r0 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r0 >= r3.size()) goto L24;
        r42.m4529V(r2, ((Integer) r3.get(r0)).intValue());
        r0 = r0 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: D */
    public static void m4634D(int r3, List r4, C0132D2 r5, boolean r6) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.isEmpty() == true) goto L22;
        C2230ma r52 = (C2230ma) r5.f328b;
        int r0 = 0;
        if (r6 == false) goto L16;
        r52.m4534a0(r3, 2);
        int r32 = 0;
        int r62 = 0;
    L9:
        if (r32 >= r4.size()) goto L11;
        ((Long) r4.get(r32)).getClass();
        Logger r1 = C2230ma.f7797j;
        r62 = r62 + 8;
        r32 = r32 + 1;
        goto L9
    L11:
        r52.m4535b0(r62);
    L13:
        if (r0 >= r4.size()) goto L23;
        r52.m4532Y(((Long) r4.get(r0)).longValue());
        r0 = r0 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r0 >= r4.size()) goto L24;
        r52.m4531X(r3, ((Long) r4.get(r0)).longValue());
        r0 = r0 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: E */
    public static void m4635E(int r2, List r3, C0132D2 r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L22;
        C2230ma r42 = (C2230ma) r4.f328b;
        int r0 = 0;
        if (r5 == false) goto L16;
        r42.m4534a0(r2, 2);
        int r22 = 0;
        int r52 = 0;
    L9:
        if (r22 >= r3.size()) goto L11;
        ((Float) r3.get(r22)).getClass();
        Logger r1 = C2230ma.f7797j;
        r52 = r52 + 4;
        r22 = r22 + 1;
        goto L9
    L11:
        r42.m4535b0(r52);
    L13:
        if (r0 >= r3.size()) goto L23;
        r42.m4530W(Float.floatToRawIntBits(((Float) r3.get(r0)).floatValue()));
        r0 = r0 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r0 >= r3.size()) goto L24;
        float r53 = ((Float) r3.get(r0)).floatValue();
        r42.getClass();
        r42.m4529V(r2, Float.floatToRawIntBits(r53));
        r0 = r0 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: F */
    public static void m4636F(int r2, List r3, C0132D2 r4, InterfaceC2253mx r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L11;
        r4.getClass();
        int r0 = 0;
    L7:
        if (r0 >= r3.size()) goto L12;
        r4.m251z(r2, r3.get(r0), r5);
        r0 = r0 + 1;
        goto L7
    L12:
        return;
    }

    /* JADX INFO: renamed from: G */
    public static void m4637G(int r2, List r3, C0132D2 r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L23;
        C2230ma r42 = (C2230ma) r4.f328b;
        int r0 = 0;
        if (r5 == false) goto L15;
        r42.m4534a0(r2, 2);
        int r22 = 0;
        int r52 = 0;
    L9:
        if (r22 >= r3.size()) goto L11;
        r52 = r52 + C2230ma.m4522O(((Integer) r3.get(r22)).intValue());
        r22 = r22 + 1;
        goto L9
    L11:
        r42.m4535b0(r52);
    L13:
        if (r0 >= r3.size()) goto L24;
        r42.m4533Z(((Integer) r3.get(r0)).intValue());
        r0 = r0 + 1;
        goto L13
    L24:
        return;
    L15:
        int r53 = 0;
    L17:
        if (r53 >= r3.size()) goto L25;
        int r1 = ((Integer) r3.get(r53)).intValue();
        r42.m4534a0(r2, 0);
        r42.m4533Z(r1);
        r53 = r53 + 1;
        goto L17
    L25:
        return;
    }

    /* JADX INFO: renamed from: H */
    public static void m4638H(int r3, List r4, C0132D2 r5, boolean r6) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.isEmpty() == true) goto L22;
        C2230ma r52 = (C2230ma) r5.f328b;
        int r0 = 0;
        if (r6 == false) goto L16;
        r52.m4534a0(r3, 2);
        int r32 = 0;
        int r62 = 0;
    L9:
        if (r32 >= r4.size()) goto L11;
        r62 = r62 + C2230ma.m4526S(((Long) r4.get(r32)).longValue());
        r32 = r32 + 1;
        goto L9
    L11:
        r52.m4535b0(r62);
    L13:
        if (r0 >= r4.size()) goto L23;
        r52.m4537d0(((Long) r4.get(r0)).longValue());
        r0 = r0 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r0 >= r4.size()) goto L24;
        r52.m4536c0(r3, ((Long) r4.get(r0)).longValue());
        r0 = r0 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: I */
    public static void m4639I(int r2, List r3, C0132D2 r4, InterfaceC2253mx r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L11;
        r4.getClass();
        int r0 = 0;
    L7:
        if (r0 >= r3.size()) goto L12;
        r4.m230A(r2, r3.get(r0), r5);
        r0 = r0 + 1;
        goto L7
    L12:
        return;
    }

    /* JADX INFO: renamed from: J */
    public static void m4640J(int r2, List r3, C0132D2 r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L22;
        C2230ma r42 = (C2230ma) r4.f328b;
        int r0 = 0;
        if (r5 == false) goto L16;
        r42.m4534a0(r2, 2);
        int r22 = 0;
        int r52 = 0;
    L9:
        if (r22 >= r3.size()) goto L11;
        ((Integer) r3.get(r22)).getClass();
        Logger r1 = C2230ma.f7797j;
        r52 = r52 + 4;
        r22 = r22 + 1;
        goto L9
    L11:
        r42.m4535b0(r52);
    L13:
        if (r0 >= r3.size()) goto L23;
        r42.m4530W(((Integer) r3.get(r0)).intValue());
        r0 = r0 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r0 >= r3.size()) goto L24;
        r42.m4529V(r2, ((Integer) r3.get(r0)).intValue());
        r0 = r0 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: K */
    public static void m4641K(int r3, List r4, C0132D2 r5, boolean r6) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.isEmpty() == true) goto L22;
        C2230ma r52 = (C2230ma) r5.f328b;
        int r0 = 0;
        if (r6 == false) goto L16;
        r52.m4534a0(r3, 2);
        int r32 = 0;
        int r62 = 0;
    L9:
        if (r32 >= r4.size()) goto L11;
        ((Long) r4.get(r32)).getClass();
        Logger r1 = C2230ma.f7797j;
        r62 = r62 + 8;
        r32 = r32 + 1;
        goto L9
    L11:
        r52.m4535b0(r62);
    L13:
        if (r0 >= r4.size()) goto L23;
        r52.m4532Y(((Long) r4.get(r0)).longValue());
        r0 = r0 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r0 >= r4.size()) goto L24;
        r52.m4531X(r3, ((Long) r4.get(r0)).longValue());
        r0 = r0 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: L */
    public static void m4642L(int r3, List r4, C0132D2 r5, boolean r6) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.isEmpty() == true) goto L23;
        C2230ma r52 = (C2230ma) r5.f328b;
        int r0 = 0;
        if (r6 == false) goto L15;
        r52.m4534a0(r3, 2);
        int r32 = 0;
        int r62 = 0;
    L9:
        if (r32 >= r4.size()) goto L11;
        int r1 = ((Integer) r4.get(r32)).intValue();
        r62 = r62 + C2230ma.m4525R((r1 >> 31) ^ (r1 << 1));
        r32 = r32 + 1;
        goto L9
    L11:
        r52.m4535b0(r62);
    L13:
        if (r0 >= r4.size()) goto L24;
        int r33 = ((Integer) r4.get(r0)).intValue();
        r52.m4535b0((r33 >> 31) ^ (r33 << 1));
        r0 = r0 + 1;
        goto L13
    L24:
        return;
    L15:
        int r63 = 0;
    L17:
        if (r63 >= r4.size()) goto L25;
        int r12 = ((Integer) r4.get(r63)).intValue();
        r52.m4534a0(r3, 0);
        r52.m4535b0((r12 >> 31) ^ (r12 << 1));
        r63 = r63 + 1;
        goto L17
    L25:
        return;
    }

    /* JADX INFO: renamed from: M */
    public static void m4643M(int r7, List r8, C0132D2 r9, boolean r10) {
        if (r8 != null) goto L4;
        return;
    L4:
        if (r8.isEmpty() == true) goto L22;
        C2230ma r92 = (C2230ma) r9.f328b;
        int r2 = 0;
        if (r10 == false) goto L16;
        r92.m4534a0(r7, 2);
        int r72 = 0;
        int r102 = 0;
    L9:
        if (r72 >= r8.size()) goto L11;
        long r3 = ((Long) r8.get(r72)).longValue();
        r102 = r102 + C2230ma.m4526S((r3 >> 63) ^ (r3 << 1));
        r72 = r72 + 1;
        goto L9
    L11:
        r92.m4535b0(r102);
    L13:
        if (r2 >= r8.size()) goto L23;
        long r32 = ((Long) r8.get(r2)).longValue();
        r92.m4537d0((r32 >> 63) ^ (r32 << 1));
        r2 = r2 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r2 >= r8.size()) goto L24;
        long r33 = ((Long) r8.get(r2)).longValue();
        r92.m4536c0(r7, (r33 >> 63) ^ (r33 << 1));
        r2 = r2 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: N */
    public static void m4644N(int r12, List r13, C0132D2 r14) {
        if (r13 != null) goto L4;
        return;
    L4:
        if (r13.isEmpty() == true) goto L69;
        C2230ma r142 = (C2230ma) r14.f328b;
        if ((r13 instanceof InterfaceC0374In) == false) goto L31;
        InterfaceC0374In r0 = (InterfaceC0374In) r13;
        int r4 = 0;
    L9:
        if (r4 >= r13.size()) goto L70;
        Object r5 = r0.mo718m(r4);
        if ((r5 instanceof String) == false) goto L29;
        String r52 = (String) r5;
        r142.m4534a0(r12, 2);
        int r6 = r142.f7801h;
        byte[] r7 = r142.f7800g;
        int r8 = r142.f7802i;
        int r9 = C2230ma.m4525R(r52.length() * 3);     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        int r10 = C2230ma.m4525R(r52.length());     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        if (r10 != r9) goto L18;
        int r92 = r8 + r10;     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        r142.f7802i = r92;     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        int r62 = AbstractC2536tD.f8842a.mo1361j(r52, r7, r92, r6 - r92);     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        r142.f7802i = r8;     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        r142.m4535b0((r62 - r8) - r10);     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        r142.f7802i = r62;     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
    L30:
        r4 = r4 + 1;
        goto L9
    L18:
        r142.m4535b0(AbstractC2536tD.m5016b(r52));     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        int r93 = r142.f7802i;     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        r142.f7802i = AbstractC2536tD.f8842a.mo1361j(r52, r7, r93, r6 - r93);     // Catch: C2493sD -> L16 IndexOutOfBoundsException -> L20
        goto L30
    L20:
        e = move-exception;
        throw new C2273na(e);
    L16:
        e = move-exception;
        r142.f7802i = r8;
        C2230ma.f7797j.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
        byte[] r53 = r52.getBytes(AbstractC0501Ll.f1637a);
        r142.m4535b0(r53.length);     // Catch: IndexOutOfBoundsException -> L26
        r142.m4528U(r53, 0, r53.length);     // Catch: IndexOutOfBoundsException -> L26
    L26:
        e = move-exception;
        throw new C2273na(e);
    L29:
        AbstractC2744y6 r54 = (AbstractC2744y6) r5;
        r142.m4534a0(r12, 2);
        r142.m4535b0(r54.size());
        C2701x6 r55 = (C2701x6) r54;
        r142.m4528U(r55.f9275d, r55.mo5222h(), r55.size());
        goto L30
    L70:
        return;
    L31:
        int r02 = 0;
    L33:
        if (r02 >= r13.size()) goto L71;
        String r42 = (String) r13.get(r02);
        r142.m4534a0(r12, 2);
        int r56 = r142.f7801h;
        byte[] r63 = r142.f7800g;
        int r72 = r142.f7802i;
        int r82 = C2230ma.m4525R(r42.length() * 3);     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        int r94 = C2230ma.m4525R(r42.length());     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        if (r94 != r82) goto L40;
        int r83 = r72 + r94;     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        r142.f7802i = r83;     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        int r57 = AbstractC2536tD.f8842a.mo1361j(r42, r63, r83, r56 - r83);     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        r142.f7802i = r72;     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        r142.m4535b0((r57 - r72) - r94);     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        r142.f7802i = r57;     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
    L47:
        r02 = r02 + 1;
        goto L33
    L40:
        r142.m4535b0(AbstractC2536tD.m5016b(r42));     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        int r84 = r142.f7802i;     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        r142.f7802i = AbstractC2536tD.f8842a.mo1361j(r42, r63, r84, r56 - r84);     // Catch: C2493sD -> L38 IndexOutOfBoundsException -> L42
        goto L47
    L42:
        e = move-exception;
        throw new C2273na(e);
    L38:
        e = move-exception;
        r142.f7802i = r72;
        C2230ma.f7797j.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
        byte[] r43 = r42.getBytes(AbstractC0501Ll.f1637a);
        r142.m4535b0(r43.length);     // Catch: IndexOutOfBoundsException -> L48
        r142.m4528U(r43, 0, r43.length);     // Catch: IndexOutOfBoundsException -> L48
    L48:
        e = move-exception;
        throw new C2273na(e);
    L71:
        return;
    }

    /* JADX INFO: renamed from: O */
    public static void m4645O(int r2, List r3, C0132D2 r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L23;
        C2230ma r42 = (C2230ma) r4.f328b;
        int r0 = 0;
        if (r5 == false) goto L15;
        r42.m4534a0(r2, 2);
        int r22 = 0;
        int r52 = 0;
    L9:
        if (r22 >= r3.size()) goto L11;
        r52 = r52 + C2230ma.m4525R(((Integer) r3.get(r22)).intValue());
        r22 = r22 + 1;
        goto L9
    L11:
        r42.m4535b0(r52);
    L13:
        if (r0 >= r3.size()) goto L24;
        r42.m4535b0(((Integer) r3.get(r0)).intValue());
        r0 = r0 + 1;
        goto L13
    L24:
        return;
    L15:
        int r53 = 0;
    L17:
        if (r53 >= r3.size()) goto L25;
        int r1 = ((Integer) r3.get(r53)).intValue();
        r42.m4534a0(r2, 0);
        r42.m4535b0(r1);
        r53 = r53 + 1;
        goto L17
    L25:
        return;
    }

    /* JADX INFO: renamed from: P */
    public static void m4646P(int r3, List r4, C0132D2 r5, boolean r6) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.isEmpty() == true) goto L22;
        C2230ma r52 = (C2230ma) r5.f328b;
        int r0 = 0;
        if (r6 == false) goto L16;
        r52.m4534a0(r3, 2);
        int r32 = 0;
        int r62 = 0;
    L9:
        if (r32 >= r4.size()) goto L11;
        r62 = r62 + C2230ma.m4526S(((Long) r4.get(r32)).longValue());
        r32 = r32 + 1;
        goto L9
    L11:
        r52.m4535b0(r62);
    L13:
        if (r0 >= r4.size()) goto L23;
        r52.m4537d0(((Long) r4.get(r0)).longValue());
        r0 = r0 + 1;
        goto L13
    L23:
        return;
    L16:
        if (r0 >= r4.size()) goto L24;
        r52.m4536c0(r3, ((Long) r4.get(r0)).longValue());
        r0 = r0 + 1;
        goto L16
    L24:
        return;
    }

    /* JADX INFO: renamed from: a */
    public static int m4647a(int r2, List r3) {
        int r0 = r3.size();
        int r1 = 0;
        if (r0 != 0) goto L5;
        return 0;
    L5:
        int r22 = C2230ma.m4524Q(r2) * r0;
    L7:
        if (r1 >= r3.size()) goto L9;
        r22 = r22 + C2230ma.m4518K((AbstractC2744y6) r3.get(r1));
        r1 = r1 + 1;
        goto L7
    L9:
        return r22;
    }

    /* JADX INFO: renamed from: b */
    public static int m4648b(int r1, List r2) {
        int r0 = r2.size();
        if (r0 != 0) goto L6;
        return 0;
    L6:
        int r22 = m4649c(r2);
        return (C2230ma.m4524Q(r1) * r0) + r22;
    }

    /* JADX INFO: renamed from: c */
    public static int m4649c(List r4) {
        int r0 = r4.size();
        int r1 = 0;
        if (r0 != 0) goto L6;
        return 0;
    L6:
        if ((r4 instanceof AbstractC0071Bl) == false) goto L12;
        AbstractC0071Bl r42 = (AbstractC0071Bl) r4;
        if (r0 > 0) goto L10;
        return 0;
    L10:
        r42.m120c(0);
        throw null;
    L12:
        int r2 = 0;
    L13:
        if (r1 >= r0) goto L15;
        r2 = r2 + C2230ma.m4522O(((Integer) r4.get(r1)).intValue());
        r1 = r1 + 1;
        goto L13
    L15:
        return r2;
    }

    /* JADX INFO: renamed from: d */
    public static int m4650d(int r0, List r1) {
        int r12 = r1.size();
        if (r12 != 0) goto L7;
        return 0;
    L7:
        return C2230ma.m4519L(r0) * r12;
    }

    /* JADX INFO: renamed from: e */
    public static int m4651e(List r0) {
        return r0.size() * 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m4652f(int r0, List r1) {
        int r12 = r1.size();
        if (r12 != 0) goto L7;
        return 0;
    L7:
        return C2230ma.m4520M(r0) * r12;
    }

    /* JADX INFO: renamed from: g */
    public static int m4653g(List r0) {
        return r0.size() * 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m4654h(int r1, List r2) {
        int r0 = r2.size();
        if (r0 != 0) goto L6;
        return 0;
    L6:
        int r22 = m4655i(r2);
        return (C2230ma.m4524Q(r1) * r0) + r22;
    }

    /* JADX INFO: renamed from: i */
    public static int m4655i(List r4) {
        int r0 = r4.size();
        int r1 = 0;
        if (r0 != 0) goto L6;
        return 0;
    L6:
        if ((r4 instanceof AbstractC0071Bl) == false) goto L12;
        AbstractC0071Bl r42 = (AbstractC0071Bl) r4;
        if (r0 > 0) goto L10;
        return 0;
    L10:
        r42.m120c(0);
        throw null;
    L12:
        int r2 = 0;
    L13:
        if (r1 >= r0) goto L15;
        r2 = r2 + C2230ma.m4522O(((Integer) r4.get(r1)).intValue());
        r1 = r1 + 1;
        goto L13
    L15:
        return r2;
    }

    /* JADX INFO: renamed from: j */
    public static int m4656j(int r1, List r2) {
        if (r2.size() != 0) goto L6;
        return 0;
    L6:
        int r0 = m4657k(r2);
        int r22 = r2.size();
        return (C2230ma.m4524Q(r1) * r22) + r0;
    }

    /* JADX INFO: renamed from: k */
    public static int m4657k(List r5) {
        int r0 = r5.size();
        int r1 = 0;
        if (r0 != 0) goto L6;
        return 0;
    L6:
        if ((r5 instanceof AbstractC2382pp) == false) goto L12;
        AbstractC2382pp r52 = (AbstractC2382pp) r5;
        if (r0 > 0) goto L10;
        return 0;
    L10:
        r52.m4822c(0);
        throw null;
    L12:
        int r2 = 0;
    L13:
        if (r1 >= r0) goto L15;
        r2 = r2 + C2230ma.m4526S(((Long) r5.get(r1)).longValue());
        r1 = r1 + 1;
        goto L13
    L15:
        return r2;
    }

    /* JADX INFO: renamed from: l */
    public static int m4658l(int r4, List r5, InterfaceC2253mx r6) {
        int r0 = r5.size();
        int r1 = 0;
        if (r0 != 0) goto L5;
        return 0;
    L5:
        int r42 = C2230ma.m4524Q(r4) * r0;
    L6:
        if (r1 >= r0) goto L8;
        int r2 = ((AbstractC0043B) r5.get(r1)).mo63b(r6);
        r42 = r42 + (C2230ma.m4525R(r2) + r2);
        r1 = r1 + 1;
        goto L6
    L8:
        return r42;
    }

    /* JADX INFO: renamed from: m */
    public static int m4659m(int r1, List r2) {
        int r0 = r2.size();
        if (r0 != 0) goto L6;
        return 0;
    L6:
        int r22 = m4660n(r2);
        return (C2230ma.m4524Q(r1) * r0) + r22;
    }

    /* JADX INFO: renamed from: n */
    public static int m4660n(List r5) {
        int r0 = r5.size();
        int r1 = 0;
        if (r0 != 0) goto L6;
        return 0;
    L6:
        if ((r5 instanceof AbstractC0071Bl) == false) goto L12;
        AbstractC0071Bl r52 = (AbstractC0071Bl) r5;
        if (r0 > 0) goto L10;
        return 0;
    L10:
        r52.m120c(0);
        throw null;
    L12:
        int r2 = 0;
    L13:
        if (r1 >= r0) goto L15;
        int r3 = ((Integer) r5.get(r1)).intValue();
        r2 = r2 + C2230ma.m4525R((r3 >> 31) ^ (r3 << 1));
        r1 = r1 + 1;
        goto L13
    L15:
        return r2;
    }

    /* JADX INFO: renamed from: o */
    public static int m4661o(int r1, List r2) {
        int r0 = r2.size();
        if (r0 != 0) goto L6;
        return 0;
    L6:
        int r22 = m4662p(r2);
        return (C2230ma.m4524Q(r1) * r0) + r22;
    }

    /* JADX INFO: renamed from: p */
    public static int m4662p(List r8) {
        int r0 = r8.size();
        int r1 = 0;
        if (r0 != 0) goto L6;
        return 0;
    L6:
        if ((r8 instanceof AbstractC2382pp) == false) goto L12;
        AbstractC2382pp r82 = (AbstractC2382pp) r8;
        if (r0 > 0) goto L10;
        return 0;
    L10:
        r82.m4822c(0);
        throw null;
    L12:
        int r2 = 0;
    L13:
        if (r1 >= r0) goto L15;
        long r3 = ((Long) r8.get(r1)).longValue();
        r2 = r2 + C2230ma.m4526S((r3 >> 63) ^ (r3 << 1));
        r1 = r1 + 1;
        goto L13
    L15:
        return r2;
    }

    /* JADX INFO: renamed from: q */
    public static int m4663q(int r4, List r5) {
        int r0 = r5.size();
        int r1 = 0;
        if (r0 != 0) goto L5;
        return 0;
    L5:
        int r42 = C2230ma.m4524Q(r4) * r0;
        if ((r5 instanceof InterfaceC0374In) == false) goto L15;
        InterfaceC0374In r52 = (InterfaceC0374In) r5;
    L8:
        if (r1 >= r0) goto L14;
        Object r2 = r52.mo718m(r1);
        if ((r2 instanceof AbstractC2744y6) == false) goto L12;
        int r22 = ((AbstractC2744y6) r2).size();
        r42 = (C2230ma.m4525R(r22) + r22) + r42;
    L13:
        r1 = r1 + 1;
        goto L8
    L12:
        r42 = C2230ma.m4523P((String) r2) + r42;
        goto L13
    L14:
        return r42;
    L15:
        if (r1 >= r0) goto L21;
        Object r23 = r5.get(r1);
        if ((r23 instanceof AbstractC2744y6) == false) goto L19;
        int r24 = ((AbstractC2744y6) r23).size();
        r42 = (C2230ma.m4525R(r24) + r24) + r42;
    L20:
        r1 = r1 + 1;
        goto L15
    L19:
        r42 = C2230ma.m4523P((String) r23) + r42;
        goto L20
    L21:
        return r42;
    }

    /* JADX INFO: renamed from: r */
    public static int m4664r(int r1, List r2) {
        int r0 = r2.size();
        if (r0 != 0) goto L6;
        return 0;
    L6:
        int r22 = m4665s(r2);
        return (C2230ma.m4524Q(r1) * r0) + r22;
    }

    /* JADX INFO: renamed from: s */
    public static int m4665s(List r4) {
        int r0 = r4.size();
        int r1 = 0;
        if (r0 != 0) goto L6;
        return 0;
    L6:
        if ((r4 instanceof AbstractC0071Bl) == false) goto L12;
        AbstractC0071Bl r42 = (AbstractC0071Bl) r4;
        if (r0 > 0) goto L10;
        return 0;
    L10:
        r42.m120c(0);
        throw null;
    L12:
        int r2 = 0;
    L13:
        if (r1 >= r0) goto L15;
        r2 = r2 + C2230ma.m4525R(((Integer) r4.get(r1)).intValue());
        r1 = r1 + 1;
        goto L13
    L15:
        return r2;
    }

    /* JADX INFO: renamed from: t */
    public static int m4666t(int r1, List r2) {
        int r0 = r2.size();
        if (r0 != 0) goto L6;
        return 0;
    L6:
        int r22 = m4667u(r2);
        return (C2230ma.m4524Q(r1) * r0) + r22;
    }

    /* JADX INFO: renamed from: u */
    public static int m4667u(List r5) {
        int r0 = r5.size();
        int r1 = 0;
        if (r0 != 0) goto L6;
        return 0;
    L6:
        if ((r5 instanceof AbstractC2382pp) == false) goto L12;
        AbstractC2382pp r52 = (AbstractC2382pp) r5;
        if (r0 > 0) goto L10;
        return 0;
    L10:
        r52.m4822c(0);
        throw null;
    L12:
        int r2 = 0;
    L13:
        if (r1 >= r0) goto L15;
        r2 = r2 + C2230ma.m4526S(((Long) r5.get(r1)).longValue());
        r1 = r1 + 1;
        goto L13
    L15:
        return r2;
    }

    /* JADX INFO: renamed from: v */
    public static C1044YC m4668v(boolean r3) {
        Class<?> r1 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");     // Catch: Throwable -> L5
    L6:
        if (r1 != null) goto L12;
    L10:
        return null;
    L12:
        return (C1044YC) r1.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(r3)});
    L5:
        r1 = null;
        goto L6
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w */
    public static void m4669w(C1044YC r6, Object r7, Object r8) {
        r6.getClass();
        AbstractC2634vj r72 = (AbstractC2634vj) r7;
        C1001XC r62 = r72.unknownFields;
        C1001XC r82 = ((AbstractC2634vj) r8).unknownFields;
        C1001XC r0 = C1001XC.f3195f;
        if (r0.equals(r82) == false) goto L6;
    L14:
        r72.unknownFields = r62;
        return;
    L6:
        if (r0.equals(r62) == false) goto L8;
        int r02 = r62.f3196a + r82.f3196a;
        int[] r1 = Arrays.copyOf(r62.f3197b, r02);
        System.arraycopy(r82.f3197b, 0, r1, r62.f3196a, r82.f3196a);
        Object[] r3 = Arrays.copyOf(r62.f3198c, r02);
        System.arraycopy(r82.f3198c, 0, r3, r62.f3196a, r82.f3196a);
        r62 = new C1001XC(r02, r1, r3, true);
        goto L14
    L8:
        r62.getClass();
        if (r82.equals(r0) == true) goto L14;
        if (r62.f3200e == false) goto L17;
        int r03 = r62.f3196a + r82.f3196a;
        r62.m1892a(r03);
        System.arraycopy(r82.f3197b, 0, r62.f3197b, r62.f3196a, r82.f3196a);
        System.arraycopy(r82.f3198c, 0, r62.f3198c, r62.f3196a, r82.f3196a);
        r62.f3196a = r03;
        goto L14
    L17:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m4670x(Object r0, Object r1) {
        if (r0 == r1) goto L9;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static void m4671y(int r2, List r3, C0132D2 r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L23;
        C2230ma r42 = (C2230ma) r4.f328b;
        int r0 = 0;
        if (r5 == false) goto L15;
        r42.m4534a0(r2, 2);
        int r22 = 0;
        int r52 = 0;
    L9:
        if (r22 >= r3.size()) goto L11;
        ((Boolean) r3.get(r22)).getClass();
        Logger r1 = C2230ma.f7797j;
        r52 = r52 + 1;
        r22 = r22 + 1;
        goto L9
    L11:
        r42.m4535b0(r52);
    L13:
        if (r0 >= r3.size()) goto L24;
        r42.m4527T(((Boolean) r3.get(r0)).booleanValue() ? 1 : 0);
        r0 = r0 + 1;
        goto L13
    L24:
        return;
    L15:
        int r53 = 0;
    L17:
        if (r53 >= r3.size()) goto L25;
        boolean r12 = ((Boolean) r3.get(r53)).booleanValue();
        r42.m4534a0(r2, 0);
        r42.m4527T(r12 ? 1 : 0);
        r53 = r53 + 1;
        goto L17
    L25:
        return;
    }

    /* JADX INFO: renamed from: z */
    public static void m4672z(int r5, List r6, C0132D2 r7) {
        if (r6 != null) goto L4;
        return;
    L4:
        if (r6.isEmpty() == true) goto L11;
        r7.getClass();
        int r0 = 0;
    L7:
        if (r0 >= r6.size()) goto L12;
        C2230ma r1 = (C2230ma) r7.f328b;
        AbstractC2744y6 r2 = (AbstractC2744y6) r6.get(r0);
        r1.m4534a0(r5, 2);
        r1.m4535b0(r2.size());
        C2701x6 r22 = (C2701x6) r2;
        r1.m4528U(r22.f9275d, r22.mo5222h(), r22.size());
        r0 = r0 + 1;
        goto L7
    L12:
        return;
    }
}

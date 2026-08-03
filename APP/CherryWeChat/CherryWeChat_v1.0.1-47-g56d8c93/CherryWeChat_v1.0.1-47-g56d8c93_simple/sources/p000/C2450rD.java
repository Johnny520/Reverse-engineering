package p000;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: rD */
/* JADX INFO: loaded from: classes.dex */
public final class C2450rD extends AbstractC0671Pj {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8578g;

    public /* synthetic */ C2450rD(int r1) {
        this.f8578g = r1;
    }

    /* JADX INFO: renamed from: D */
    public static int m4892D(long r2, byte[] r4, int r5, int r6) {
        if (r6 != 0) goto L4;
        AbstractC0671Pj r22 = AbstractC2536tD.f8842a;
        if (r5 <= (-12)) goto L17;
        return -1;
    L17:
        return r5;
    L4:
        if (r6 == 1) goto L12;
        if (r6 != 2) goto L10;
        return AbstractC2536tD.m5018d(r5, AbstractC2092jD.m4267g(r2, r4), AbstractC2092jD.m4267g(r2 + 1, r4));
    L10:
        throw new AssertionError();
    L12:
        return AbstractC2536tD.m5017c(r5, AbstractC2092jD.m4267g(r2, r4));
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: i */
    public final String mo1360i(byte[] r11, int r12, int r13) {
        switch(this.f8578g) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        Charset r1 = AbstractC0501Ll.f1637a;
        String r0 = new String(r11, r12, r13, r1);
        if (r0.contains("�") == true) goto L8;
    L9:
        return r0;
    L8:
        if (Arrays.equals(r0.getBytes(r1), Arrays.copyOfRange(r11, r12, r13 + r12)) == true) goto L9;
        throw C0673Pl.m1365b();
    L13:
        if (((r12 | r13) | ((r11.length - r12) - r13)) < 0) goto L77;
        int r02 = r12 + r13;
        char[] r132 = new char[r13];
        int r2 = 0;
    L15:
        if (r12 >= r02) goto L19;
        byte r3 = r11[r12];
        if (r3 < 0) goto L19;
        r12 = r12 + 1;
        r132[r2] = (char) r3;
        r2 = r2 + 1;
    L19:
        if (r12 >= r02) goto L75;
        int r32 = r12 + 1;
        byte r4 = r11[r12];
        if (r4 >= 0) goto L22;
        if (r4 < (-32)) goto L30;
        if (r4 < (-16)) goto L43;
        if (r32 >= (r02 - 2)) goto L73;
        byte r33 = r11[r32];
        int r6 = r12 + 3;
        byte r5 = r11[r12 + 2];
        r12 = r12 + 4;
        byte r62 = r11[r6];
        int r7 = r2 + 1;
        if (AbstractC0628Oj.m1228I(r33) == true) goto L71;
        if ((((r33 + 112) + (r4 << 28)) >> 30) != 0) goto L71;
        if (AbstractC0628Oj.m1228I(r5) == true) goto L71;
        if (AbstractC0628Oj.m1228I(r62) == true) goto L71;
        int r34 = ((((r33 & 63) << 12) | ((r4 & 7) << 18)) | ((r5 & 63) << 6)) | (r62 & 63);
        r132[r2] = (char) ((r34 >>> 10) + 55232);
        r132[r7] = (char) ((r34 & 1023) + 56320);
        r2 = r2 + 2;
    L71:
        throw C0673Pl.m1365b();
    L73:
        throw C0673Pl.m1365b();
    L43:
        if (r32 >= (r02 - 1)) goto L58;
        int r63 = r12 + 2;
        byte r35 = r11[r32];
        r12 = r12 + 3;
        byte r64 = r11[r63];
        int r72 = r2 + 1;
        if (AbstractC0628Oj.m1228I(r35) == true) goto L56;
        if (r4 != (-32)) goto L50;
        if (r35 < (-96)) goto L56;
    L50:
        if (r4 != (-19)) goto L53;
        if (r35 >= (-96)) goto L56;
    L53:
        if (AbstractC0628Oj.m1228I(r64) == true) goto L56;
        r132[r2] = (char) ((((r35 & 63) << 6) | ((r4 & 15) << 12)) | (r64 & 63));
        r2 = r72;
    L56:
        throw C0673Pl.m1365b();
    L58:
        throw C0673Pl.m1365b();
    L30:
        if (r32 >= r02) goto L39;
        r12 = r12 + 2;
        byte r36 = r11[r32];
        int r52 = r2 + 1;
        if (r4 < (-62)) goto L37;
        if (AbstractC0628Oj.m1228I(r36) == true) goto L37;
        r132[r2] = (char) ((r36 & 63) | ((r4 & 31) << 6));
        r2 = r52;
    L37:
        throw C0673Pl.m1365b();
    L39:
        throw C0673Pl.m1365b();
    L22:
        int r122 = r2 + 1;
        r132[r2] = (char) r4;
    L23:
        if (r32 >= r02) goto L27;
        byte r22 = r11[r32];
        if (r22 < 0) goto L27;
        r32 = r32 + 1;
        r132[r122] = (char) r22;
        r122 = r122 + 1;
    L27:
        r2 = r122;
        r12 = r32;
        goto L19
    L75:
        return new String(r132, 0, r2);
    L77:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(r11.length), Integer.valueOf(r12), Integer.valueOf(r13)}));
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: j */
    public final int mo1361j(String r25, byte[] r26, int r27, int r28) {
        switch(this.f8578g) {
            case 0: goto L61;
            default: goto L4;
        };
    L4:
        long r5 = r27;
        long r7 = ((long) r28) + r5;
        int r9 = r25.length();
        if (r9 > r28) goto L60;
        if ((r26.length - r28) < r27) goto L60;
        int r2 = 0;
    L9:
        long r12 = 1;
        char r4 = 128;
        if (r2 >= r9) goto L14;
        char r14 = r25.charAt(r2);
        if (r14 >= 128) goto L14;
        AbstractC2092jD.m4271k(r26, r5, (byte) r14);
        r2 = r2 + 1;
        r5 = 1 + r5;
    L14:
        if (r2 == r9) goto L132;
    L16:
        if (r2 >= r9) goto L58;
        char r142 = r25.charAt(r2);
        if (r142 >= r4) goto L23;
        if (r5 >= r7) goto L23;
        AbstractC2092jD.m4271k(r26, r5, (byte) r142);
        char r6 = r4;
        long r272 = r12;
        long r122 = r5 + r12;
    L42:
        r2 = r2 + 1;
        r4 = r6;
        r5 = r122;
        r12 = r272;
    L23:
        if (r142 < 2048) goto L25;
    L27:
        r272 = r12;
        if (r142 < 55296) goto L33;
        if (57343 < r142) goto L33;
    L31:
        long r20 = r5;
        if (r20 > (r7 - 4)) goto L47;
        int r62 = r2 + 1;
        if (r62 == r9) goto L45;
        char r22 = r25.charAt(r62);
        if (Character.isSurrogatePair(r142, r22) == false) goto L43;
        int r23 = Character.toCodePoint(r142, r22);
        AbstractC2092jD.m4271k(r26, r20, (byte) ((r23 >>> 18) | 240));
        r6 = 128;
        AbstractC2092jD.m4271k(r26, r20 + r272, (byte) (((r23 >>> 12) & 63) | 128));
        AbstractC2092jD.m4271k(r26, r20 + 2, (byte) (((r23 >>> 6) & 63) | 128));
        AbstractC2092jD.m4271k(r26, r20 + 3, (byte) ((r23 & 63) | 128));
        r122 = r20 + 4;
        r2 = r62;
        goto L42
    L43:
        r2 = r62;
    L45:
        throw new C2493sD(r2 - 1, r9);
    L47:
        if (55296 > r142) goto L56;
        if (r142 > 57343) goto L56;
        int r1 = r2 + 1;
        if (r1 == r9) goto L54;
        if (Character.isSurrogatePair(r142, r25.charAt(r1)) == true) goto L56;
    L54:
        throw new C2493sD(r2, r9);
    L56:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + r142 + " at index " + r20);
    L33:
        if (r5 > (r7 - 3)) goto L31;
        AbstractC2092jD.m4271k(r26, r5, (byte) ((r142 >>> '\f') | 480));
        long r202 = r5;
        AbstractC2092jD.m4271k(r26, r5 + r272, (byte) (((r142 >>> 6) & 63) | 128));
        r122 = r202 + 3;
        AbstractC2092jD.m4271k(r26, r202 + 2, (byte) ((r142 & '?') | 128));
        r6 = 128;
        goto L42
    L25:
        if (r5 > (r7 - 2)) goto L27;
        r272 = r12;
        AbstractC2092jD.m4271k(r26, r5, (byte) ((r142 >>> 6) | 960));
        AbstractC2092jD.m4271k(r26, r5 + r272, (byte) ((r142 & '?') | r4));
        r122 = r5 + 2;
        r6 = r4;
        goto L42
    L58:
        return (int) r5;
    L132:
        return (int) r5;
    L60:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + r25.charAt(r9 - 1) + " at index " + (r27 + r28));
    L61:
        int r3 = r25.length();
        int r42 = r28 + r27;
        int r52 = 0;
    L63:
        if (r52 >= r3) goto L69;
        int r72 = r52 + r27;
        if (r72 >= r42) goto L69;
        char r8 = r25.charAt(r52);
        if (r8 >= 128) goto L69;
        r26[r72] = (byte) r8;
        r52 = r52 + 1;
    L69:
        if (r52 == r3) goto L133;
        int r24 = r27 + r52;
    L72:
        if (r52 >= r3) goto L110;
        char r73 = r25.charAt(r52);
        if (r73 >= 128) goto L78;
        if (r24 >= r42) goto L78;
        r26[r24] = (byte) r73;
        r24 = r24 + 1;
    L95:
        r52 = r52 + 1;
    L78:
        if (r73 >= 2048) goto L83;
        if (r24 > (r42 - 2)) goto L83;
        int r82 = r24 + 1;
        r26[r24] = (byte) ((r73 >>> 6) | 960);
        r24 = r24 + 2;
        r26[r82] = (byte) ((r73 & '?') | 128);
    L83:
        if (r73 < 55296) goto L86;
        if (57343 < r73) goto L86;
    L89:
        if (r24 > (r42 - 4)) goto L99;
        int r83 = r52 + 1;
        if (r83 == r25.length()) goto L98;
        char r53 = r25.charAt(r83);
        if (Character.isSurrogatePair(r73, r53) == false) goto L96;
        int r54 = Character.toCodePoint(r73, r53);
        r26[r24] = (byte) ((r54 >>> 18) | 240);
        r26[r24 + 1] = (byte) (((r54 >>> 12) & 63) | 128);
        int r74 = r24 + 3;
        r26[r24 + 2] = (byte) (((r54 >>> 6) & 63) | 128);
        r24 = r24 + 4;
        r26[r74] = (byte) ((r54 & 63) | 128);
        r52 = r83;
        goto L95
    L96:
        r52 = r83;
    L98:
        throw new C2493sD(r52 - 1, r3);
    L99:
        if (55296 > r73) goto L108;
        if (r73 > 57343) goto L108;
        int r13 = r52 + 1;
        if (r13 == r25.length()) goto L106;
        if (Character.isSurrogatePair(r73, r25.charAt(r13)) == true) goto L108;
    L106:
        throw new C2493sD(r52, r3);
    L108:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + r73 + " at index " + r24);
    L86:
        if (r24 > (r42 - 3)) goto L89;
        r26[r24] = (byte) ((r73 >>> '\f') | 480);
        int r92 = r24 + 2;
        r26[r24 + 1] = (byte) (((r73 >>> 6) & 63) | 128);
        r24 = r24 + 3;
        r26[r92] = (byte) ((r73 & '?') | 128);
        goto L95
    L110:
        return r24;
    L133:
        return r27 + r3;
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: v */
    public final int mo1363v(byte[] r18, int r19, int r20) {
        int r1 = r19;
        switch(this.f8578g) {
            case 0: goto L79;
            default: goto L5;
        };
    L79:
        if (r1 >= r20) goto L83;
        if (r18[r1] < 0) goto L83;
        r1 = r1 + 1;
    L83:
        if (r1 >= r20) goto L86;
    L85:
        if (r1 >= r20) goto L86;
        int r4 = r1 + 1;
        byte r5 = r18[r1];
        if (r5 < 0) goto L90;
        r1 = r4;
        goto L85
    L90:
        if (r5 < (-32)) goto L91;
        if (r5 < (-16)) goto L101;
        if (r4 >= (r20 - 2)) goto L188;
        int r6 = r1 + 2;
        byte r42 = r18[r4];
        if (r42 > (-65)) goto L125;
        if ((((r42 + 112) + (r5 << 28)) >> 30) != 0) goto L125;
        int r43 = r1 + 3;
        if (r18[r6] > (-65)) goto L125;
        r1 = r1 + 4;
        if (r18[r43] <= (-65)) goto L85;
    L125:
        return -1;
    L188:
        return AbstractC2536tD.m5015a(r18, r4, r20);
    L101:
        if (r4 >= (r20 - 1)) goto L187;
        int r8 = r1 + 2;
        byte r44 = r18[r4];
        if (r44 > (-65)) goto L125;
        if (r5 != (-32)) goto L109;
        if (r44 < (-96)) goto L125;
    L109:
        if (r5 != (-19)) goto L111;
        if (r44 >= (-96)) goto L125;
    L111:
        r1 = r1 + 3;
        if (r18[r8] <= (-65)) goto L85;
    L187:
        return AbstractC2536tD.m5015a(r18, r4, r20);
    L91:
        if (r4 >= r20) goto L186;
        if (r5 < (-62)) goto L125;
        r1 = r1 + 2;
        if (r18[r4] <= (-65)) goto L85;
    L186:
        return r5;
    L86:
        return 0;
    L5:
        if (((r1 | r20) | (r18.length - r20)) < 0) goto L78;
        long r45 = r1;
        int r12 = (int) (((long) r20) - r45);
        long r7 = 1;
        if (r12 >= 16) goto L9;
        int r9 = 0;
    L27:
        int r13 = r12 - r9;
        long r46 = r45 + ((long) r9);
    L28:
        byte r3 = 0;
    L29:
        if (r13 <= 0) goto L34;
        long r92 = r46 + r7;
        r3 = AbstractC2092jD.m4267g(r46, r18);
        if (r3 < 0) goto L33;
        r13 = r13 - 1;
        r46 = r92;
        goto L29
    L33:
        r46 = r92;
    L34:
        if (r13 == 0) goto L35;
        int r93 = r13 - 1;
        if (r3 >= (-32)) goto L47;
        if (r93 == 0) goto L182;
        r13 = r13 - 2;
        if (r3 < (-62)) goto L75;
        long r94 = r46 + r7;
        if (AbstractC2092jD.m4267g(r46, r18) > (-65)) goto L75;
        long r15 = r7;
        r46 = r94;
    L74:
        r7 = r15;
    L75:
        return -1;
    L182:
        return r3;
    L47:
        if (r3 < (-16)) goto L49;
        r15 = r7;
        if (r93 < 3) goto L184;
        r13 = r13 - 4;
        long r72 = r46 + r15;
        byte r62 = AbstractC2092jD.m4267g(r46, r18);
        if (r62 > (-65)) goto L75;
        if ((((r62 + 112) + (r3 << 28)) >> 30) != 0) goto L75;
        long r132 = 2 + r46;
        if (AbstractC2092jD.m4267g(r72, r18) > (-65)) goto L75;
        r46 = r46 + 3;
        if (AbstractC2092jD.m4267g(r132, r18) <= (-65)) goto L74;
    L184:
        return m4892D(r46, r18, r3, r93);
    L49:
        if (r93 < 2) goto L183;
        r13 = r13 - 3;
        r15 = r7;
        long r63 = r46 + r15;
        byte r82 = AbstractC2092jD.m4267g(r46, r18);
        if (r82 > (-65)) goto L75;
        if (r3 != (-32)) goto L57;
        if (r82 < (-96)) goto L75;
    L57:
        if (r3 != (-19)) goto L59;
        if (r82 >= (-96)) goto L75;
    L59:
        r46 = r46 + 2;
        if (AbstractC2092jD.m4267g(r63, r18) <= (-65)) goto L74;
    L183:
        return m4892D(r46, r18, r3, r93);
    L35:
        return 0;
    L9:
        int r32 = 8 - (((int) r45) & 7);
        long r10 = r45;
        r9 = 0;
    L10:
        if (r9 >= r32) goto L15;
        long r122 = r10 + 1;
        if (AbstractC2092jD.m4267g(r10, r18) < 0) goto L27;
        r9 = r9 + 1;
        r10 = r122;
    L15:
        int r33 = r9 + 8;
        if (r33 > r12) goto L21;
        if ((AbstractC2092jD.f7366c.m2907h(AbstractC2092jD.f7369f + r10, r18) & (-9187201950435737472L)) != 0) goto L21;
        r10 = r10 + 8;
        r9 = r33;
    L21:
        if (r9 >= r12) goto L26;
        long r123 = r10 + 1;
        if (AbstractC2092jD.m4267g(r10, r18) < 0) goto L27;
        r9 = r9 + 1;
        r10 = r123;
        goto L21
    L26:
        r9 = r12;
        goto L27
    L78:
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(r18.length), Integer.valueOf(r1), Integer.valueOf(r20)}));
    }
}

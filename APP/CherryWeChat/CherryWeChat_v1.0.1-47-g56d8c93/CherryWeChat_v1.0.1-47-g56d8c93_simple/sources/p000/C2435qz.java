package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: qz */
/* JADX INFO: loaded from: classes.dex */
public final class C2435qz extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final String f8542l;

    /* JADX INFO: renamed from: m */
    public int f8543m;

    public C2435qz(String r1, int r2) {
        this.f8542l = r1;
        this.f8543m = r2;
    }

    /* JADX INFO: renamed from: N */
    public final int m4889N(C0110Ch r23) {
        String r2 = this.f8542l;
        if (r2 == null) goto L172;
        if (r2.length() == 0) goto L7;
    L9:
        r23.f270m.getClass();
        int r3 = r2.length();
        int r4 = 0;
        int r5 = 0;
    L11:
        if (r5 >= r3) goto L15;
        if (r2.charAt(r5) >= 128) goto L15;
        r5 = r5 + 1;
    L15:
        int r7 = r3;
    L16:
        char r11 = 2048;
        if (r5 >= r3) goto L36;
        char r12 = r2.charAt(r5);
        if (r12 >= 2048) goto L21;
        r7 = r7 + ((127 - r12) >>> 31);
        r5 = r5 + 1;
        goto L16
    L21:
        int r122 = r2.length();
        int r13 = 0;
    L22:
        if (r5 >= r122) goto L35;
        char r14 = r2.charAt(r5);
        if (r14 >= 2048) goto L26;
        r13 = r13 + ((127 - r14) >>> 31);
    L34:
        r5 = r5 + 1;
        goto L22
    L26:
        r13 = r13 + 2;
        if (55296 > r14) goto L34;
        if (r14 > 57343) goto L34;
        if (Character.codePointAt(r2, r5) < 65536) goto L33;
        r5 = r5 + 1;
        goto L34
    L33:
        throw new C0341Hx(r5, r122);
    L35:
        r7 = r7 + r13;
    L36:
        if (r7 < r3) goto L170;
        r23.m168g(1, 0);
        ByteBuffer r32 = r23.f258a;
        int r52 = r23.f259b - 1;
        r23.f259b = r52;
        r32.put(r52, (byte) 0);
        if (r23.f263f == true) goto L168;
        r23.f268k = r7;
        r23.m168g(4, r7);
        r23.m168g(1, r7);
        r23.f263f = true;
        ByteBuffer r53 = r23.f258a;
        int r123 = r23.f259b - r7;
        r23.f259b = r123;
        r53.position(r123);
        ByteBuffer r54 = r23.f258a;
        if (r54.hasArray() == false) goto L94;
        int r72 = r54.arrayOffset();
        byte[] r142 = r54.array();
        int r15 = r54.position() + r72;
        int r16 = r54.remaining();
        int r33 = r2.length();
        int r18 = 1;
        int r8 = r15 + r16;
    L42:
        if (r4 >= r33) goto L48;
        int r9 = r4 + r15;
        if (r9 >= r8) goto L48;
        char r10 = r2.charAt(r4);
        if (r10 >= 128) goto L48;
        r142[r9] = (byte) r10;
        r4 = r4 + 1;
    L48:
        if (r4 != r33) goto L51;
        int r152 = r15 + r33;
    L93:
        r54.position(r152 - r72);
    L143:
        if (r23.f263f == false) goto L164;
        r23.f263f = false;
        int r22 = r23.f268k;
        ByteBuffer r34 = r23.f258a;
        int r42 = r23.f259b - 4;
        r23.f259b = r42;
        r34.putInt(r42, r22);
        int r24 = r23.m167f();
        int r35 = this.f8543m;
        byte r43 = 1;
        if (r35 == 1) goto L157;
        byte r55 = 2;
        if (r35 == 2) goto L158;
        r43 = 3;
        if (r35 == 3) goto L154;
        r55 = 4;
        if (r35 == 4) goto L158;
        if (r35 == 5) goto L154;
        throw null;
    L154:
        r43 = r55;
    L158:
        r23.m170i(3);
        r23.m162a(0, r24);
        if (r43 == 0) goto L161;
        int r25 = r18;
        r23.m168g(r25, 0);
        ByteBuffer r36 = r23.f258a;
        int r56 = r23.f259b - r25;
        r23.f259b = r56;
        r36.put(r56, r43);
        r23.f261d[r25] = r23.m167f();
    L161:
        int r26 = r23.m165d();
        r23.m166e(r26);
        return r26;
    L157:
        r43 = 0;
        goto L158
    L164:
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    L51:
        r152 = r15 + r4;
    L52:
        if (r4 >= r33) goto L93;
        char r92 = r2.charAt(r4);
        if (r92 >= 128) goto L57;
        if (r152 >= r8) goto L57;
        r142[r152] = (byte) r92;
        int r21 = r72;
        r152 = r152 + 1;
    L77:
        r4 = r4 + 1;
        r72 = r21;
        r11 = 2048;
    L57:
        if (r92 >= r11) goto L62;
        if (r152 > (r8 - 2)) goto L62;
        int r102 = r152 + 1;
        r142[r152] = (byte) ((r92 >>> 6) | 960);
        r152 = r152 + 2;
        r142[r102] = (byte) ((r92 & '?') | 128);
        r21 = r72;
    L62:
        if (r92 < 55296) goto L68;
        if (57343 < r92) goto L68;
    L66:
        r21 = r72;
        if (r152 > (r8 - 4)) goto L82;
        int r73 = r4 + 1;
        if (r73 == r2.length()) goto L80;
        char r44 = r2.charAt(r73);
        if (Character.isSurrogatePair(r92, r44) == false) goto L78;
        int r45 = Character.toCodePoint(r92, r44);
        r142[r152] = (byte) ((r45 >>> 18) | 240);
        r142[r152 + 1] = (byte) (((r45 >>> 12) & 63) | 128);
        int r93 = r152 + 3;
        r142[r152 + 2] = (byte) (((r45 >>> 6) & 63) | 128);
        r152 = r152 + 4;
        r142[r93] = (byte) ((r45 & 63) | 128);
        r4 = r73;
        goto L77
    L78:
        r4 = r73;
    L80:
        throw new C0341Hx(r4 - 1, r33);
    L82:
        if (55296 > r92) goto L92;
        if (r92 > 57343) goto L92;
        int r1 = r4 + 1;
        if (r1 == r2.length()) goto L90;
        if (Character.isSurrogatePair(r92, r2.charAt(r1)) == true) goto L92;
    L90:
        throw new C0341Hx(r4, r33);
    L92:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + r92 + " at index " + r152);
    L68:
        if (r152 > (r8 - 3)) goto L66;
        r142[r152] = (byte) ((r92 >>> '\f') | 480);
        int r112 = r152 + 2;
        r21 = r72;
        r142[r152 + 1] = (byte) (((r92 >>> 6) & 63) | 128);
        r152 = r152 + 3;
        r142[r112] = (byte) ((r92 & '?') | 128);
        goto L77
    L94:
        r18 = 1;
        int r37 = r2.length();
        int r46 = r54.position();
        int r74 = 0;
    L95:
        if (r74 >= r37) goto L99;
        char r82 = r2.charAt(r74);     // Catch: IndexOutOfBoundsException -> L174
        if (r82 >= 128) goto L99;
        r54.put(r46 + r74, (byte) r82);     // Catch: IndexOutOfBoundsException -> L174
        r74 = r74 + 1;     // Catch: IndexOutOfBoundsException -> L174
    L166:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + r2.charAt(r74) + " at index " + (Math.max(r74, (r46 - r54.position()) + 1) + r54.position()));
    L99:
        if (r74 != r37) goto L101;
        r54.position(r46 + r74);     // Catch: IndexOutOfBoundsException -> L174
        goto L143
    L101:
        r46 = r46 + r74;     // Catch: IndexOutOfBoundsException -> L174
    L102:
        if (r74 >= r37) goto L141;
        char r83 = r2.charAt(r74);     // Catch: IndexOutOfBoundsException -> L174
        if (r83 >= 128) goto L108;
        r54.put(r46, (byte) r83);     // Catch: IndexOutOfBoundsException -> L174
    L139:
        r74 = r74 + 1;     // Catch: IndexOutOfBoundsException -> L174
        r46 = r46 + 1;     // Catch: IndexOutOfBoundsException -> L174
        goto L102
    L108:
        if (r83 >= 2048) goto L114;
        int r103 = r46 + 1;
        r54.put(r46, (byte) ((r83 >>> 6) | 192));     // Catch: IndexOutOfBoundsException -> L112
        r54.put(r103, (byte) ((r83 & '?') | 128));     // Catch: IndexOutOfBoundsException -> L112
        r46 = r103;
    L112:
        r46 = r103;
        goto L166
    L114:
        if (r83 < 55296) goto L135;
        if (57343 < r83) goto L135;
        int r143 = r74 + 1;
        if (r143 == r37) goto L134;
        char r75 = r2.charAt(r143);     // Catch: IndexOutOfBoundsException -> L173
        if (Character.isSurrogatePair(r83, r75) == false) goto L132;
        int r76 = Character.toCodePoint(r83, r75);     // Catch: IndexOutOfBoundsException -> L173
        int r84 = r46 + 1;
        r54.put(r46, (byte) ((r76 >>> 18) | 240));     // Catch: IndexOutOfBoundsException -> L131
        int r153 = r46 + 2;
        r54.put(r84, (byte) (((r76 >>> 12) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L130
        r46 = r46 + 3;
        r54.put(r153, (byte) (((r76 >>> 6) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L173
        r54.put(r46, (byte) ((r76 & 63) | 128));     // Catch: IndexOutOfBoundsException -> L173
        r74 = r143;
    L130:
        r74 = r143;
        r46 = r153;
    L131:
        r46 = r84;
        goto L129
    L132:
        r74 = r143;
    L129:
        r74 = r143;
    L134:
        throw new C0341Hx(r74, r37);     // Catch: IndexOutOfBoundsException -> L174
    L135:
        int r94 = r46 + 1;
        r54.put(r46, (byte) ((r83 >>> '\f') | 224));     // Catch: IndexOutOfBoundsException -> L140
        r46 = r46 + 2;
        r54.put(r94, (byte) (((r83 >>> 6) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L174
        r54.put(r46, (byte) ((r83 & '?') | 128));     // Catch: IndexOutOfBoundsException -> L174
    L140:
        r46 = r94;
        goto L166
    L141:
        r54.position(r46);     // Catch: IndexOutOfBoundsException -> L174
        goto L143
    L168:
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    L170:
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) r7) + 4294967296L));
    L7:
        if (this.f8543m == 5) goto L9;
        this.f8543m = 5;
        goto L9
    L172:
        throw new IllegalArgumentException("value must not be null");
    }
}

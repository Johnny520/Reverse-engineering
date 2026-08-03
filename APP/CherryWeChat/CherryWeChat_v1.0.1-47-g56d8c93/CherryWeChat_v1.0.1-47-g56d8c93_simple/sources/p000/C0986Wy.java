package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: Wy */
/* JADX INFO: loaded from: classes.dex */
public final class C0986Wy {

    /* JADX INFO: renamed from: a */
    public int[] f3101a;

    /* JADX INFO: renamed from: b */
    public final int[] f3102b;

    /* JADX INFO: renamed from: c */
    public final C0649P3 f3103c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f3104d;

    /* JADX INFO: renamed from: e */
    public byte[] f3105e;

    /* JADX INFO: renamed from: f */
    public short[] f3106f;

    /* JADX INFO: renamed from: g */
    public byte[] f3107g;

    /* JADX INFO: renamed from: h */
    public byte[] f3108h;

    /* JADX INFO: renamed from: i */
    public byte[] f3109i;

    /* JADX INFO: renamed from: j */
    public final int[] f3110j;

    /* JADX INFO: renamed from: k */
    public int f3111k;

    /* JADX INFO: renamed from: l */
    public C0370Ij f3112l;

    /* JADX INFO: renamed from: m */
    public Bitmap f3113m;

    /* JADX INFO: renamed from: n */
    public final boolean f3114n;

    /* JADX INFO: renamed from: o */
    public int f3115o;

    /* JADX INFO: renamed from: p */
    public final int f3116p;

    /* JADX INFO: renamed from: q */
    public final int f3117q;

    /* JADX INFO: renamed from: r */
    public final int f3118r;

    /* JADX INFO: renamed from: s */
    public Boolean f3119s;

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f3120t;

    public C0986Wy(C0649P3 r2, C0370Ij r3, ByteBuffer r4, int r5) {
        this.f3102b = new int[256];
        this.f3120t = Bitmap.Config.ARGB_8888;
        this.f3103c = r2;
        this.f3112l = new C0370Ij();
        monitor-enter(this);
        if (r5 <= 0) goto L25;
        int r22 = Integer.highestOneBit(r5);     // Catch: Throwable -> L11
        this.f3115o = 0;     // Catch: Throwable -> L11
        this.f3112l = r3;     // Catch: Throwable -> L11
        this.f3111k = -1;     // Catch: Throwable -> L11
        ByteBuffer r42 = r4.asReadOnlyBuffer();     // Catch: Throwable -> L11
        this.f3104d = r42;     // Catch: Throwable -> L11
        r42.position(0);     // Catch: Throwable -> L11
        this.f3104d.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Throwable -> L11
        this.f3114n = false;     // Catch: Throwable -> L11
        Iterator r43 = r3.f1289e.iterator();     // Catch: Throwable -> L11
    L7:
        if (r43.hasNext() == false) goto L13;
        if (((C0155Dj) r43.next()).f425g != 3) goto L7;
        this.f3114n = true;     // Catch: Throwable -> L11
    L13:
        this.f3116p = r22;     // Catch: Throwable -> L11
        int r44 = r3.f1290f;     // Catch: Throwable -> L11
        this.f3118r = r44 / r22;     // Catch: Throwable -> L11
        int r32 = r3.f1291g;     // Catch: Throwable -> L11
        this.f3117q = r32 / r22;     // Catch: Throwable -> L11
        int r45 = r44 * r32;     // Catch: Throwable -> L11
        C2812zp r23 = (C2812zp) this.f3103c.f2090c;     // Catch: Throwable -> L11
        if (r23 != null) goto L16;
        byte[] r24 = new byte[r45];     // Catch: Throwable -> L11
    L17:
        this.f3109i = r24;     // Catch: Throwable -> L11
        C0649P3 r25 = this.f3103c;     // Catch: Throwable -> L11
        int r33 = this.f3118r * this.f3117q;     // Catch: Throwable -> L11
        C2812zp r26 = (C2812zp) r25.f2090c;     // Catch: Throwable -> L11
        if (r26 != null) goto L20;
        int[] r27 = new int[r33];     // Catch: Throwable -> L11
    L21:
        this.f3110j = r27;     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L20:
        r27 = (int[]) r26.m5441c(r33, int[].class);     // Catch: Throwable -> L11
        goto L21
    L16:
        r24 = (byte[]) r23.m5441c(r45, byte[].class);     // Catch: Throwable -> L11
        goto L17
    L25:
        throw new IllegalArgumentException("Sample size must be >=0, not: " + r5);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m1863a() {
        Boolean r0 = this.f3119s;
        if (r0 != null) goto L5;
    L8:
        Bitmap.Config r02 = Bitmap.Config.ARGB_8888;
    L9:
        Bitmap r03 = ((InterfaceC0565N5) this.f3103c.f2089b).mo51e(this.f3118r, this.f3117q, r02);
        r03.setHasAlpha(true);
        return r03;
    L5:
        if (r0.booleanValue() == true) goto L8;
        r02 = this.f3120t;
        goto L9
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m1864b() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f3112l.f1287c <= 0) goto L11;
        if (this.f3111k < 0) goto L11;
    L14:
        int r0 = this.f3115o;     // Catch: Throwable -> L8
        if (r0 != 1) goto L17;
    L49:
        monitor-exit(this);
        return null;
    L17:
        if (r0 == 2) goto L49;
        this.f3115o = 0;     // Catch: Throwable -> L8
        if (this.f3105e != null) goto L26;
        C2812zp r4 = (C2812zp) this.f3103c.f2090c;     // Catch: Throwable -> L8
        if (r4 != null) goto L24;
        byte[] r42 = new byte[255];     // Catch: Throwable -> L8
    L25:
        this.f3105e = r42;     // Catch: Throwable -> L8
        goto L26
    L24:
        r42 = (byte[]) r4.m5441c(255, byte[].class);     // Catch: Throwable -> L8
    L26:
        C0155Dj r43 = (C0155Dj) this.f3112l.f1289e.get(this.f3111k);     // Catch: Throwable -> L8
        int r5 = this.f3111k - 1;     // Catch: Throwable -> L8
        if (r5 < 0) goto L29;
        C0155Dj r52 = (C0155Dj) this.f3112l.f1289e.get(r5);     // Catch: Throwable -> L8
    L30:
        int[] r6 = r43.f429k;     // Catch: Throwable -> L8
        if (r6 != null) goto L34;
        r6 = this.f3112l.f1285a;     // Catch: Throwable -> L8
    L34:
        this.f3101a = r6;     // Catch: Throwable -> L8
        if (r6 != null) goto L40;
        this.f3115o = 1;     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    L40:
        if (r43.f424f == false) goto L46;
        System.arraycopy(r6, 0, this.f3102b, 0, r6.length);     // Catch: Throwable -> L8
        int[] r1 = this.f3102b;     // Catch: Throwable -> L8
        this.f3101a = r1;     // Catch: Throwable -> L8
        r1[r43.f426h] = 0;     // Catch: Throwable -> L8
        if (r43.f425g != 2) goto L46;
        if (this.f3111k != 0) goto L46;
        this.f3119s = Boolean.TRUE;     // Catch: Throwable -> L8
    L46:
        Bitmap r02 = m1866d(r43, r52);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r02;
    L29:
        r52 = null;
    L11:
        if (Log.isLoggable("Wy", 3) == false) goto L13;
        int r03 = this.f3112l.f1287c;     // Catch: Throwable -> L8
    L13:
        this.f3115o = 1;     // Catch: Throwable -> L8
        goto L14
    }

    /* JADX INFO: renamed from: c */
    public final void m1865c(Bitmap.Config r6) {
        Bitmap.Config r0 = Bitmap.Config.ARGB_8888;
        if (r6 == r0) goto L9;
        Bitmap.Config r1 = Bitmap.Config.RGB_565;
        if (r6 == r1) goto L9;
        throw new IllegalArgumentException("Unsupported format: " + r6 + ", must be one of " + r0 + " or " + r1);
    L9:
        this.f3120t = r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX INFO: renamed from: d */
    public final Bitmap m1866d(C0155Dj r36, C0155Dj r37) {
        C0649P3 r3 = this.f3103c;
        byte r4 = 0;
        int[] r6 = this.f3110j;
        if (r37 != null) goto L9;
        Bitmap r5 = this.f3113m;
        if (r5 == null) goto L7;
        ((InterfaceC0565N5) r3.f2089b).mo53h(r5);
    L7:
        this.f3113m = null;
        Arrays.fill(r6, 0);
    L9:
        if (r37 == null) goto L16;
        if (r37.f425g != 3) goto L16;
        if (this.f3113m != null) goto L16;
        Arrays.fill(r6, 0);
    L16:
        if (r37 == null) goto L37;
        int r52 = r37.f425g;
        if (r52 <= 0) goto L37;
        if (r52 == 2) goto L21;
        if (r52 != 3) goto L37;
        Bitmap r53 = this.f3113m;
        if (r53 == null) goto L37;
        int r12 = this.f3117q;
        int r8 = this.f3118r;
        r53.getPixels(r6, 0, r8, 0, 0, r8, r12);
        goto L37
    L21:
        if (r36.f424f == true) goto L26;
        C0370Ij r54 = this.f3112l;
        int r7 = r54.f1295k;
        if (r36.f429k != null) goto L25;
    L27:
        int r55 = r37.f422d;
        int r82 = this.f3116p;
        int r56 = r55 / r82;
        int r9 = r37.f420b / r82;
        int r10 = r37.f421c / r82;
        int r2 = r37.f419a / r82;
        int r83 = this.f3118r;
        int r92 = (r9 * r83) + r2;
        int r57 = (r56 * r83) + r92;
    L28:
        if (r92 >= r57) goto L37;
        int r22 = r92 + r10;
        int r84 = r92;
    L30:
        if (r84 >= r22) goto L32;
        r6[r84] = r7;
        r84 = r84 + 1;
        goto L30
    L32:
        r92 = r92 + this.f3118r;
        goto L28
    L25:
        if (r54.f1294j != r36.f426h) goto L27;
    L26:
        r7 = 0;
    L37:
        this.f3104d.position(r36.f428j);
        int r23 = r36.f421c * r36.f422d;
        byte[] r58 = this.f3109i;
        if (r58 != null) goto L40;
    L41:
        C2812zp r32 = (C2812zp) r3.f2090c;
        if (r32 != null) goto L44;
        byte[] r33 = new byte[r23];
    L45:
        this.f3109i = r33;
    L46:
        byte[] r34 = this.f3109i;
        if (this.f3106f != null) goto L49;
        this.f3106f = new short[4096];
    L49:
        short[] r59 = this.f3106f;
        if (this.f3107g != null) goto L52;
        this.f3107g = new byte[4096];
    L52:
        byte[] r85 = this.f3107g;
        if (this.f3108h != null) goto L55;
        this.f3108h = new byte[4097];
    L55:
        byte[] r93 = this.f3108h;
        int r102 = this.f3104d.get() & 255;
        int r11 = 1;
        int r122 = 1 << r102;
        int r15 = r122 + 1;
        int r16 = r122 + 2;
        int r103 = r102 + 1;
        int r17 = (1 << r103) - 1;
        int r14 = 0;
    L56:
        if (r14 >= r122) goto L58;
        r59[r14] = 0;
        r85[r14] = (byte) r14;
        r14 = r14 + 1;
        r11 = r11;
        goto L56
    L58:
        int r372 = r11;
        byte[] r112 = this.f3105e;
        int r72 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r222 = 0;
        int r232 = 0;
        int r28 = 0;
        int r29 = 0;
        int r26 = r103;
        int r24 = r16;
        int r25 = r17;
        int r27 = -1;
    L60:
        if (r72 >= r23) goto L101;
        if (r19 != 0) goto L70;
        int r31 = -1;
        int r142 = this.f3104d.get() & 255;
        if (r142 > 0) goto L65;
        short[] r322 = r59;
        int[] r332 = r6;
    L66:
        if (r142 <= 0) goto L67;
        r19 = r142;
        r20 = 0;
    L71:
        r222 = r222 + ((r112[r20] & 255) << r21);
        r20 = r20 + 1;
        r19 = r19 - 1;
        int r42 = r21 + 8;
        int r510 = r24;
        int r62 = r26;
        int r13 = r27;
        int r143 = r28;
    L72:
        r21 = r42;
        if (r42 < r62) goto L100;
        int r43 = r222 & r25;
        r222 = r222 >> r62;
        r21 = r21 - r62;
        if (r43 == r122) goto L76;
        if (r43 == r15) goto L78;
        int r242 = r62;
        if (r13 != r31) goto L83;
        r34[r232] = r85[r43];
        r232 = r232 + 1;
        r72 = r72 + 1;
        r13 = r43;
        r143 = r13;
        r42 = r21;
        r62 = r242;
    L82:
        r31 = -1;
        goto L72
    L83:
        if (r43 < r510) goto L85;
        r93[r29] = (byte) r143;
        r29 = r29 + 1;
        short r63 = r13;
    L86:
        if (r63 < r122) goto L88;
        r93[r29] = r85[r63];
        r29 = r29 + 1;
        r63 = r322[r63];
        goto L86
    L88:
        r143 = r85[r63] & 255;
        byte r64 = (byte) r143;
        r34[r232] = r64;
    L89:
        r232 = r232 + 1;
        r72 = r72 + 1;
        if (r29 <= 0) goto L93;
        r29 = r29 - 1;
        r34[r232] = r93[r29];
        goto L89
    L93:
        if (r510 >= 4096) goto L98;
        r322[r510] = (short) r13;
        r85[r510] = r64;
        r510 = r510 + 1;
        if ((r510 & r25) != 0) goto L98;
        if (r510 >= 4096) goto L98;
        r62 = r242 + 1;
        r25 = r25 + r510;
    L99:
        r42 = r21;
        r13 = r43;
    L98:
        r62 = r242;
        goto L99
    L85:
        r63 = r43;
        goto L86
    L78:
        r24 = r510;
        r26 = r62;
        r27 = r13;
        r28 = r143;
        r59 = r322;
        r6 = r332;
        r4 = 0;
        goto L60
    L76:
        r62 = r103;
        r510 = r16;
        r25 = r17;
        r42 = r21;
        r13 = r31;
        goto L72
    L100:
        r27 = r13;
        r28 = r143;
        r26 = r62;
        r6 = r332;
        r4 = 0;
        r24 = r510;
        r59 = r322;
        goto L60
    L67:
        this.f3115o = 3;
        byte r65 = 0;
    L102:
        Arrays.fill(r34, r232, r23, r65);
        if (r36.f423e == false) goto L105;
    L138:
        int r210 = r36.f422d;
        int r35 = this.f3116p;
        int r211 = r210 / r35;
        int r44 = r36.f420b / r35;
        int r511 = r36.f421c / r35;
        int r66 = r36.f419a / r35;
        if (this.f3111k != 0) goto L141;
        boolean r73 = true;
    L142:
        byte[] r86 = this.f3109i;
        int[] r94 = this.f3101a;
        Boolean r132 = this.f3119s;
        int r144 = 8;
        int r104 = 0;
        int r113 = 1;
        int r123 = 0;
    L143:
        if (r123 >= r211) goto L216;
        if (r36.f423e == false) goto L158;
        if (r104 < r211) goto L157;
        r113 = r113 + 1;
        if (r113 != 2) goto L150;
        r104 = 4;
        goto L157
    L150:
        if (r113 != 3) goto L152;
        r144 = 4;
        r104 = 2;
        goto L157
    L152:
        if (r113 != 4) goto L157;
        r104 = 1;
        r144 = 2;
    L157:
        int r152 = r104 + r144;
    L159:
        int r105 = r104 + r44;
        int r162 = r211;
        if (r35 != 1) goto L162;
        boolean r172 = true;
    L164:
        if (r105 >= this.f3117q) goto L213;
        int r212 = this.f3118r;
        int r106 = r105 * r212;
        int r18 = r106 + r66;
        int r213 = r18 + r511;
        int r107 = r106 + r212;
        if (r107 >= r213) goto L168;
        r213 = r107;
    L168:
        int r192 = r35;
        int r108 = (r123 * r35) * r36.f421c;
        int[] r38 = this.f3110j;
        if (r172 == false) goto L181;
        int r39 = r18;
    L171:
        if (r39 >= r213) goto L179;
        int r182 = r39;
        int r310 = r94[r86[r108] & 255];
        if (r310 == 0) goto L175;
        r38[r182] = r310;
    L178:
        r108 = r108 + r192;
        r39 = r182 + 1;
        goto L171
    L175:
        if (r73 == false) goto L178;
        if (r132 != null) goto L178;
        r132 = Boolean.TRUE;
    L179:
        int r183 = r44;
    L214:
        r123 = r123 + 1;
        r104 = r152;
        r211 = r162;
        r44 = r183;
        r35 = r192;
        r511 = r511;
        goto L143
    L181:
        int r311 = ((r213 - r18) * r192) + r108;
        r183 = r44;
        int r45 = r18;
    L182:
        if (r45 >= r213) goto L214;
        int r202 = r213;
        int r214 = r36.f421c;
        int r272 = r45;
        int r215 = r108;
        int r216 = 0;
        int r223 = 0;
        int r233 = 0;
        int r243 = 0;
        int r252 = 0;
    L185:
        if (r215 >= (this.f3116p + r108)) goto L193;
        byte[] r46 = this.f3109i;
        int r282 = r511;
        if (r215 >= r46.length) goto L194;
        if (r215 >= r311) goto L194;
        int r47 = this.f3101a[r46[r215] & 255];
        if (r47 == 0) goto L192;
        r216 = r216 + ((r47 >> 24) & 255);
        r223 = r223 + ((r47 >> 16) & 255);
        r233 = r233 + ((r47 >> 8) & 255);
        r243 = r243 + (r47 & 255);
        r252 = r252 + 1;
    L192:
        r215 = r215 + 1;
        r511 = r282;
    L194:
        int r217 = r108 + r214;
        int r48 = r217;
    L196:
        if (r48 >= (this.f3116p + r217)) goto L204;
        byte[] r512 = this.f3109i;
        int r262 = r217;
        if (r48 >= r512.length) goto L204;
        if (r48 >= r311) goto L204;
        int r218 = this.f3101a[r512[r48] & 255];
        if (r218 == 0) goto L203;
        r216 = r216 + ((r218 >> 24) & 255);
        r223 = r223 + ((r218 >> 16) & 255);
        r233 = r233 + ((r218 >> 8) & 255);
        r243 = r243 + (r218 & 255);
        r252 = r252 + 1;
    L203:
        r48 = r48 + 1;
        r217 = r262;
    L204:
        if (r252 != 0) goto L206;
        int r219 = 0;
    L207:
        if (r219 == 0) goto L209;
        r38[r272] = r219;
    L212:
        r108 = r108 + r192;
        r45 = r272 + 1;
        r213 = r202;
        r511 = r282;
        goto L182
    L209:
        if (r73 == false) goto L212;
        if (r132 != null) goto L212;
        r132 = Boolean.TRUE;
        goto L212
    L206:
        r219 = ((((r216 / r252) << 24) | ((r223 / r252) << 16)) | ((r233 / r252) << 8)) | (r243 / r252);
        goto L207
    L193:
        r282 = r511;
        goto L194
    L213:
        r192 = r35;
        goto L179
    L162:
        r172 = false;
        goto L164
    L158:
        r152 = r104;
        r104 = r123;
        goto L159
    L216:
        if (this.f3119s != null) goto L222;
        if (r132 != null) goto L219;
        boolean r49 = false;
    L220:
        this.f3119s = Boolean.valueOf(r49);
        goto L222
    L219:
        r49 = r132.booleanValue();
    L222:
        if (this.f3114n == false) goto L228;
        int r1 = r36.f425g;
        if (r1 == 0) goto L230;
        if (r1 != 1) goto L228;
    L230:
        if (this.f3113m != null) goto L232;
        this.f3113m = m1863a();
    L232:
        Bitmap r513 = this.f3113m;
        int r124 = this.f3117q;
        int r87 = this.f3118r;
        int[] r67 = r332;
        r513.setPixels(r67, 0, r87, 0, 0, r87, r124);
    L233:
        Bitmap r514 = m1863a();
        int r125 = this.f3117q;
        int r88 = this.f3118r;
        r514.setPixels(r67, 0, r88, 0, 0, r88, r125);
        return r514;
    L228:
        r67 = r332;
        goto L233
    L141:
        r73 = false;
        goto L142
    L105:
        if (this.f3116p != r372) goto L138;
        int r220 = r36.f422d;
        int r312 = r36.f420b;
        int r410 = r36.f421c;
        int r515 = r36.f419a;
        if (this.f3111k != 0) goto L110;
        byte r74 = 1;
    L111:
        byte[] r89 = this.f3109i;
        int[] r95 = this.f3101a;
        int r109 = r65;
        byte r114 = -1;
    L112:
        if (r109 >= r220) goto L126;
        int r133 = this.f3118r;
        int r126 = (r109 + r312) * r133;
        int r145 = r126 + r515;
        int r153 = r145 + r410;
        int r127 = r126 + r133;
        if (r127 >= r153) goto L116;
        r153 = r127;
    L116:
        int r128 = r36.f421c * r109;
    L117:
        if (r145 >= r153) goto L125;
        byte r134 = r89[r128];
        int r68 = r134 & 255;
        if (r68 == r114) goto L124;
        int r69 = r95[r68];
        if (r69 == 0) goto L123;
        this.f3110j[r145] = r69;
        goto L124
    L123:
        r114 = r134;
    L124:
        r128 = r128 + 1;
        r145 = r145 + 1;
        goto L117
    L125:
        r109 = r109 + 1;
        goto L112
    L126:
        Boolean r221 = this.f3119s;
        if (r221 == null) goto L131;
        if (r221.booleanValue() == false) goto L131;
    L135:
        boolean r411 = true;
    L137:
        this.f3119s = Boolean.valueOf(r411);
    L131:
        if (this.f3119s != null) goto L136;
        if (r74 == 0) goto L136;
        if (r114 != (-1)) goto L135;
    L136:
        r411 = false;
        goto L137
    L110:
        r74 = r65;
        goto L111
    L65:
        ByteBuffer r135 = this.f3104d;
        r322 = r59;
        r332 = r6;
        r135.get(this.f3105e, 0, Math.min(r142, r135.remaining()));
        goto L66
    L70:
        r322 = r59;
        r332 = r6;
        r31 = -1;
        goto L71
    L101:
        r332 = r6;
        r65 = r4;
        goto L102
    L44:
        r33 = (byte[]) r32.m5441c(r23, byte[].class);
        goto L45
    L40:
        if (r58.length >= r23) goto L46;
        goto L41
    }
}

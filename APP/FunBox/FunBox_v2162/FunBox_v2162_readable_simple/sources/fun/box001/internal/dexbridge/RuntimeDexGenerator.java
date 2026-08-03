package fun.box001.internal.dexbridge;

import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.output.InterfaceC0199a;
import fun.box001.internal.dexformat.writer.C0159j;
import fun.box001.internal.dexformat.writer.C0169t;
import fun.box001.internal.dexformat.writer.C0170u;
import fun.box001.internal.dexformat.writer.InterfaceC0155f;
import fun.box001.internal.dexmaker.C0004a;
import fun.box001.internal.dexmaker.C0009f;
import fun.box001.internal.dexmaker.C0011h;
import fun.box001.internal.dexmaker.C0012i;
import fun.box001.internal.dexmaker.C0013j;
import fun.box001.internal.hookbackend.HookRecord;
import fun.box001.loader.utils.FileUtils;
import fun.box001.shared.Env;
import java.io.File;

/* JADX INFO: renamed from: a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class RuntimeDexGenerator implements InterfaceC0155f {
    /* JADX INFO: renamed from: e */
    public static byte[] m0e(String r27, String r28, Class r29, Class[] r30, boolean r31, int r32) {
        C0009f r3 = new C0009f();
        r27.getClass();
        Integer r7 = 0;
        byte r8 = -1;
        switch(r27.hashCode()) {
            case -1325958191: goto L38;
            case 104431: goto L34;
            case 3039496: goto L30;
            case 3052374: goto L26;
            case 3327612: goto L22;
            case 3625364: goto L18;
            case 64711720: goto L14;
            case 97526364: goto L10;
            case 109413500: goto L6;
            default: goto L41;
        };
    L41:
        switch(r8) {
            case 0: goto L54;
            case 1: goto L53;
            case 2: goto L52;
            case 3: goto L51;
            case 4: goto L50;
            case 5: goto L49;
            case 6: goto L48;
            case 7: goto L47;
            case 8: goto L46;
            default: goto L43;
        };
    L46:
        C0013j r0 = C0013j.f48k;
    L55:
        r3.m58b(r0, C0013j.f50m, new C0013j[0]);
        C0013j r4 = C0013j.m64a(Object[].class);
        C0013j[] r82 = new C0013j[r30.length];
        int r9 = 0;
    L57:
        if (r9 >= r30.length) goto L64;
        if (m5j(r30[r9].getName()) == false) goto L61;
        r82[r9] = C0013j.m64a(r30[r9]);
    L62:
        r9 = r9 + 1;
        goto L57
    L61:
        r82[r9] = C0013j.f50m;
        goto L62
    L64:
        if (m5j(r29.getName()) == false) goto L66;
        C0013j r92 = C0013j.m64a(r29);
    L67:
        C0012i r10 = r0.m66c(r92, r28, r82);
        if (r31 == false) goto L70;
        C0004a r102 = r3.m57a(r10, 9);
    L71:
        C0011h r11 = r102.m37n(C0013j.f46i);
        C0013j r12 = C0013j.f50m;
        C0011h r13 = r102.m37n(r12);
        C0011h r14 = r102.m37n(r4);
        C0011h r15 = r102.m37n(r92);
        C0011h r122 = r102.m37n(r12);
        r102.m35k(r11, Integer.valueOf(r30.length));
        r102.m36m(r14, r11);
        int r5 = 0;
    L73:
        if (r5 >= r30.length) goto L103;
        r102.m35k(r11, Integer.valueOf(r5));
        if (m5j(r30[r5].getName()) == false) goto L101;
        C0009f r24 = r3;
        if (r30[r5].equals(Integer.TYPE) == false) goto L79;
        C0013j r33 = C0013j.m64a(Integer.class);
        C0013j[] r272 = r82;
        C0013j r83 = C0013j.m64a(Integer.class);
        C0013j r25 = r92;
        C0013j r93 = C0013j.f46i;
        Integer r26 = r7;
        r102.m33i(r33.m66c(r83, "valueOf", new C0013j[]{r93}), r13, new C0011h[]{r102.m30e(r5, r93)});
    L100:
        r102.m28b(r14, r11, r13);
    L102:
        r5 = r5 + 1;
        r82 = r272;
        r3 = r24;
        r92 = r25;
        r7 = r26;
        goto L73
    L79:
        r26 = r7;
        r272 = r82;
        r25 = r92;
        if (r30[r5].equals(Long.TYPE) == false) goto L83;
        C0013j r34 = C0013j.m64a(Long.class);
        C0013j r72 = C0013j.m64a(Long.class);
        C0013j r84 = C0013j.f47j;
        r102.m33i(r34.m66c(r72, "valueOf", new C0013j[]{r84}), r13, new C0011h[]{r102.m30e(r5, r84)});
        goto L100
    L83:
        if (r30[r5].equals(Float.TYPE) == false) goto L86;
        C0013j r35 = C0013j.m64a(Float.class);
        C0013j r73 = C0013j.m64a(Float.class);
        C0013j r85 = C0013j.f45h;
        r102.m33i(r35.m66c(r73, "valueOf", new C0013j[]{r85}), r13, new C0011h[]{r102.m30e(r5, r85)});
        goto L100
    L86:
        if (r30[r5].equals(Boolean.TYPE) == false) goto L89;
        C0013j r36 = C0013j.m64a(Boolean.class);
        C0013j r74 = C0013j.m64a(Boolean.class);
        C0013j r86 = C0013j.f41d;
        r102.m33i(r36.m66c(r74, "valueOf", new C0013j[]{r86}), r13, new C0011h[]{r102.m30e(r5, r86)});
        goto L100
    L89:
        if (r30[r5].equals(Double.TYPE) == false) goto L92;
        C0013j r37 = C0013j.m64a(Double.class);
        C0013j r75 = C0013j.m64a(Double.class);
        C0013j r87 = C0013j.f44g;
        r102.m33i(r37.m66c(r75, "valueOf", new C0013j[]{r87}), r13, new C0011h[]{r102.m30e(r5, r87)});
        goto L100
    L92:
        if (r30[r5].equals(Byte.TYPE) == false) goto L95;
        C0013j r38 = C0013j.m64a(Byte.class);
        C0013j r76 = C0013j.m64a(Byte.class);
        C0013j r88 = C0013j.f42e;
        r102.m33i(r38.m66c(r76, "valueOf", new C0013j[]{r88}), r13, new C0011h[]{r102.m30e(r5, r88)});
        goto L100
    L95:
        if (r30[r5].equals(Character.TYPE) == false) goto L98;
        C0013j r39 = C0013j.m64a(Character.class);
        C0013j r77 = C0013j.m64a(Character.class);
        C0013j r89 = C0013j.f43f;
        r102.m33i(r39.m66c(r77, "valueOf", new C0013j[]{r89}), r13, new C0011h[]{r102.m30e(r5, r89)});
        goto L100
    L98:
        if (r30[r5].equals(Short.TYPE) == false) goto L100;
        C0013j r310 = C0013j.m64a(Short.class);
        C0013j r78 = C0013j.m64a(Short.class);
        C0013j r810 = C0013j.f48k;
        r102.m33i(r310.m66c(r78, "valueOf", new C0013j[]{r810}), r13, new C0011h[]{r102.m30e(r5, r810)});
        goto L100
    L101:
        r24 = r3;
        r26 = r7;
        r272 = r82;
        r25 = r92;
        r102.m28b(r14, r11, r102.m30e(r5, C0013j.f50m));
        goto L102
    L103:
        C0009f r242 = r3;
        Integer r262 = r7;
        C0013j[] r273 = r82;
        C0013j r252 = r92;
        r102.m35k(r11, Integer.valueOf(r32));
        if (r31 == false) goto L106;
        r102.m35k(r15, null);
        C0013j r52 = C0013j.m65b("Lcom/shooker/ReplaceCallback;");
        C0013j r6 = C0013j.f50m;
        r102.m33i(r52.m66c(r6, "doCall", new C0013j[]{C0013j.f46i, r6, r4}), r122, new C0011h[]{r11, r15, r14});
    L108:
        if (r29.equals(Void.TYPE) == false) goto L110;
        r102.m40q();
        Integer r311 = r262;
    L140:
        C0004a r02 = r242.m57a(r0.m66c(r252, "backup", r273), 1);
        C0011h r53 = r02.m37n(r252);
        if (r29.equals(Void.TYPE) == false) goto L144;
        r02.m40q();
    L149:
        return r242.m59c();
    L144:
        if (r29.isPrimitive() == false) goto L146;
        r02.m35k(r53, r311);
    L147:
        r02.m39p(r53);
        goto L149
    L146:
        r02.m35k(r53, null);
        goto L147
    L110:
        String r312 = r29.getName();
        if (r312.equals("double") == false) goto L113;
        r311 = r262;
        r102.m34j(C0013j.m64a(Double.class).m66c(C0013j.f44g, "doubleValue", new C0013j[0]), r15, r122, new C0011h[0]);
    L139:
        r102.m39p(r15);
        goto L140
    L113:
        if (r312.equals("int") == false) goto L115;
        r311 = r262;
        r102.m34j(C0013j.m64a(Integer.class).m66c(C0013j.f46i, "intValue", new C0013j[0]), r15, r122, new C0011h[0]);
        goto L139
    L115:
        if (r312.equals("byte") == false) goto L117;
        r311 = r262;
        r102.m34j(C0013j.m64a(Byte.class).m66c(C0013j.f42e, "byteValue", new C0013j[0]), r15, r122, new C0011h[0]);
        goto L139
    L117:
        if (r312.equals("char") == false) goto L119;
        r311 = r262;
        r102.m34j(C0013j.m64a(Character.class).m66c(C0013j.f43f, "charValue", new C0013j[0]), r15, r122, new C0011h[0]);
        goto L139
    L119:
        if (r312.equals("long") == false) goto L121;
        r311 = r262;
        r102.m34j(C0013j.m64a(Long.class).m66c(C0013j.f47j, "longValue", new C0013j[0]), r15, r122, new C0011h[0]);
        goto L139
    L121:
        if (r312.equals("void") == false) goto L123;
        r311 = r262;
        r102.m35k(r15, r311);
        goto L139
    L123:
        if (r312.equals("boolean") == false) goto L125;
        r102.m34j(C0013j.m64a(Boolean.class).m66c(C0013j.f41d, "booleanValue", new C0013j[0]), r15, r122, new C0011h[0]);
    L132:
        r311 = r262;
        goto L139
    L125:
        if (r312.equals("float") == false) goto L127;
        r102.m34j(C0013j.m64a(Float.class).m66c(C0013j.f45h, "floatValue", new C0013j[0]), r15, r122, new C0011h[0]);
        goto L132
    L127:
        if (r312.equals("short") == true) goto L129;
        r102.m29c(r15, r122);
        goto L132
    L129:
        r102.m34j(C0013j.m64a(Short.class).m66c(C0013j.f48k, "shortValue", new C0013j[0]), r15, r122, new C0011h[0]);
        goto L132
    L106:
        C0013j r54 = C0013j.m65b("Lcom/shooker/ReplaceCallback;");
        C0013j r62 = C0013j.f50m;
        r102.m33i(r54.m66c(r62, "doCall", new C0013j[]{C0013j.f46i, r62, r4}), r122, new C0011h[]{r11, r102.m31f(r0), r14});
        goto L108
    L70:
        r102 = r3.m57a(r10, 1);
        goto L71
    L66:
        r92 = C0013j.f50m;
        goto L67
    L47:
        r0 = C0013j.f45h;
        goto L55
    L48:
        r0 = C0013j.f41d;
        goto L55
    L49:
        r0 = C0013j.f49l;
        goto L55
    L50:
        r0 = C0013j.f47j;
        goto L55
    L51:
        r0 = C0013j.f43f;
        goto L55
    L52:
        r0 = C0013j.f42e;
        goto L55
    L53:
        r0 = C0013j.f46i;
        goto L55
    L54:
        r0 = C0013j.f44g;
        goto L55
    L43:
        if (r27.startsWith("[") == false) goto L45;
        r0 = C0013j.m65b(r27);
        goto L55
    L45:
        r0 = C0013j.m65b("L" + r27.replace(".", "/") + ";");
        goto L55
    L6:
        if (r27.equals("short") == false) goto L41;
        r8 = 8;
        goto L41
    L10:
        if (r27.equals("float") == false) goto L41;
        r8 = 7;
        goto L41
    L14:
        if (r27.equals("boolean") == false) goto L41;
        r8 = 6;
        goto L41
    L18:
        if (r27.equals("void") == false) goto L41;
        r8 = 5;
        goto L41
    L22:
        if (r27.equals("long") == false) goto L41;
        r8 = 4;
        goto L41
    L26:
        if (r27.equals("char") == false) goto L41;
        r8 = 3;
        goto L41
    L30:
        if (r27.equals("byte") == false) goto L41;
        r8 = 2;
        goto L41
    L34:
        if (r27.equals("int") == false) goto L41;
        r8 = 1;
        goto L41
    L38:
        if (r27.equals("double") == false) goto L41;
        r8 = 0;
        goto L41
    }

    /* JADX INFO: renamed from: f */
    public static String m1f(int r2) {
        return m4i(r2, 30257, 1);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2g(int[] r2, int r3) {
        int r0 = r3 >> 5;
        int r22 = r2[r0];
        if ((r22 & (1 << (r3 & 31))) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static String m3h(String r2) {
        String r22 = String.valueOf(Math.abs((r2 + Env.process_name).hashCode()));
        StringBuilder r0 = new StringBuilder("4cd6974be1_10096_null_");
        r0.append(r22);
        return Env.data_dir + "/files/mmkv\u200b/" + r0.toString();
    }

    /* JADX INFO: renamed from: i */
    private static String m4i(int r4, int r5, int r6) {
        StringBuilder r0 = new StringBuilder(80);
        int r1 = (~r5) & r4;
        int r42 = r4 & r5;
        if ((r42 & 1) == 0) goto L6;
        r0.append("|public");
    L6:
        if ((r42 & 2) == 0) goto L9;
        r0.append("|private");
    L9:
        if ((r42 & 4) == 0) goto L12;
        r0.append("|protected");
    L12:
        if ((r42 & 8) == 0) goto L15;
        r0.append("|static");
    L15:
        if ((r42 & 16) == 0) goto L18;
        r0.append("|final");
    L18:
        if ((r42 & 32) == 0) goto L24;
        if (r6 != 1) goto L21;
        String r52 = "|super";
    L22:
        r0.append(r52);
        goto L24
    L21:
        r52 = "|synchronized";
    L24:
        if ((r42 & 64) == 0) goto L30;
        if (r6 != 3) goto L27;
        String r53 = "|bridge";
    L28:
        r0.append(r53);
        goto L30
    L27:
        r53 = "|volatile";
    L30:
        if ((r42 & 128) == 0) goto L36;
        if (r6 != 3) goto L33;
        String r54 = "|varargs";
    L34:
        r0.append(r54);
        goto L36
    L33:
        r54 = "|transient";
    L36:
        if ((r42 & 256) == 0) goto L39;
        r0.append("|native");
    L39:
        if ((r42 & 512) == 0) goto L42;
        r0.append("|interface");
    L42:
        if ((r42 & 1024) == 0) goto L45;
        r0.append("|abstract");
    L45:
        if ((r42 & 2048) == 0) goto L48;
        r0.append("|strictfp");
    L48:
        if ((r42 & 4096) == 0) goto L51;
        r0.append("|synthetic");
    L51:
        if ((r42 & 8192) == 0) goto L54;
        r0.append("|annotation");
    L54:
        if ((r42 & 16384) == 0) goto L57;
        r0.append("|enum");
    L57:
        if ((65536 & r42) == 0) goto L60;
        r0.append("|constructor");
    L60:
        if ((r42 & 131072) == 0) goto L62;
        r0.append("|declared_synchronized");
    L62:
        if (r1 == 0) goto L64;
    L65:
        r0.append('|');
        r0.append(m11q(r1));
    L67:
        return r0.substring(1);
    L64:
        if (r0.length() != 0) goto L67;
        goto L65
    }

    /* JADX INFO: renamed from: j */
    private static boolean m5j(String r4) {
        byte r3 = -1;
        switch(r4.hashCode()) {
            case -1325958191: goto L38;
            case 104431: goto L34;
            case 3039496: goto L30;
            case 3052374: goto L26;
            case 3327612: goto L22;
            case 3625364: goto L18;
            case 64711720: goto L14;
            case 97526364: goto L10;
            case 109413500: goto L6;
            default: goto L41;
        };
    L41:
        switch(r3) {
            case 0: goto L43;
            case 1: goto L43;
            case 2: goto L43;
            case 3: goto L43;
            case 4: goto L43;
            case 5: goto L43;
            case 6: goto L43;
            case 7: goto L43;
            case 8: goto L43;
            default: goto L42;
        };
    L42:
        return false;
    L43:
        return true;
    L6:
        if (r4.equals("short") == false) goto L41;
        r3 = 8;
        goto L41
    L10:
        if (r4.equals("float") == false) goto L41;
        r3 = 7;
        goto L41
    L14:
        if (r4.equals("boolean") == false) goto L41;
        r3 = 6;
        goto L41
    L18:
        if (r4.equals("void") == false) goto L41;
        r3 = 5;
        goto L41
    L22:
        if (r4.equals("long") == false) goto L41;
        r3 = 4;
        goto L41
    L26:
        if (r4.equals("char") == false) goto L41;
        r3 = 3;
        goto L41
    L30:
        if (r4.equals("byte") == false) goto L41;
        r3 = 2;
        goto L41
    L34:
        if (r4.equals("int") == false) goto L41;
        r3 = 1;
        goto L41
    L38:
        if (r4.equals("double") == false) goto L41;
        r3 = 0;
        goto L41
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6k(int r4) {
        if (r4 >= (-1)) goto L6;
        return false;
    L6:
        if (r4 != (-1)) goto L8;
        return true;
    L8:
        int r1 = r4 & 255;
        if (r1 != 0) goto L11;
    L17:
        return true;
    L11:
        if (r1 == 255) goto L17;
        if ((r4 & 65280) == 0) goto L16;
        return false;
    L16:
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m7l() {
        byte[] r0 = FileUtils.readZipEntry(Env.module_path, "lib/arm64-v8a/libloader.so");
        FileUtils.m223d(m3h("fun_loader"), r0);
        System.load(m3h("fun_loader"));
    }

    /* JADX INFO: renamed from: m */
    public static String m8m(int r2) {
        return m4i(r2, 204287, 3);
    }

    /* JADX INFO: renamed from: o */
    public static void m9o() {
        new File(Env.data_dir + "/files/mmkv\u200b").mkdirs();
        String r0 = m3h("app.bin");
        String r1 = FileUtils.m222c(r0);
        String r2 = FileUtils.m222c(Env.module_core_path);
        if (r1 == null) goto L7;
        if (r2 == null) goto L7;
        if (r1.equals(r2) == false) goto L7;
    L8:
        Env.isHotLoading = false;
        return;
    L7:
        FileUtils.m220a(Env.module_core_path, r0);
        goto L8
    }

    /* JADX INFO: renamed from: p */
    public static String m10p(int r6) {
        char[] r1 = new char[2];
        int r2 = 0;
    L3:
        if (r2 >= 2) goto L6;
        r1[1 - r2] = Character.forDigit(r6 & 15, 16);
        r6 = r6 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new String(r1);
    }

    /* JADX INFO: renamed from: q */
    public static String m11q(int r6) {
        char[] r1 = new char[4];
        int r2 = 0;
    L3:
        if (r2 >= 4) goto L6;
        r1[3 - r2] = Character.forDigit(r6 & 15, 16);
        r6 = r6 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new String(r1);
    }

    /* JADX INFO: renamed from: r */
    public static String m12r(int r1) {
        if (r1 != ((char) r1)) goto L7;
        return m11q(r1);
    L7:
        return m13s(r1);
    }

    /* JADX INFO: renamed from: s */
    public static String m13s(int r6) {
        char[] r1 = new char[8];
        int r2 = 0;
    L3:
        if (r2 >= 8) goto L6;
        r1[7 - r2] = Character.forDigit(r6 & 15, 16);
        r6 = r6 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new String(r1);
    }

    /* JADX INFO: renamed from: t */
    public static String m14t(long r5) {
        char[] r1 = new char[16];
        int r2 = 0;
    L3:
        if (r2 >= 16) goto L6;
        r1[15 - r2] = Character.forDigit(((int) r5) & 15, 16);
        r5 = r5 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new String(r1);
    }

    /* JADX INFO: renamed from: u */
    public static int m15u(int r1) {
        int r12 = r1 >> 7;
        int r0 = 0;
    L3:
        if (r12 == 0) goto L6;
        r12 = r12 >> 7;
        r0 = r0 + 1;
        goto L3
    L6:
        return r0 + 1;
    }

    /* JADX INFO: renamed from: v */
    public static void m16v(InterfaceC0199a r2, int r3, long r4) {
        int r0 = 64 - Long.numberOfTrailingZeros(r4);
        if (r0 != 0) goto L5;
        r0 = 1;
    L5:
        int r02 = (r0 + 7) >> 3;
        long r42 = r4 >> (64 - (r02 * 8));
        C0202d r22 = (C0202d) r2;
        r22.m496p(r3 | ((r02 - 1) << 5));
    L6:
        if (r02 <= 0) goto L8;
        r22.m496p((byte) r42);
        r42 = r42 >> 8;
        r02 = r02 - 1;
        goto L6
    }

    /* JADX INFO: renamed from: w */
    public static void m17w(InterfaceC0199a r2, int r3, long r4) {
        int r0 = 64 - Long.numberOfLeadingZeros(r4);
        if (r0 != 0) goto L5;
        r0 = 1;
    L5:
        int r02 = (r0 + 7) >> 3;
        C0202d r22 = (C0202d) r2;
        r22.m496p(r3 | ((r02 - 1) << 5));
    L6:
        if (r02 <= 0) goto L8;
        r22.m496p((byte) r4);
        r4 = r4 >> 8;
        r02 = r02 - 1;
        goto L6
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: a */
    public void mo18a(C0170u r1) {
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: c */
    public void mo19c(C0159j r1) {
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: d */
    public void mo20d(C0169t r1) {
    }

    /* JADX INFO: renamed from: n */
    public abstract Object mo21n(HookRecord r1, Object r2, Object[] r3);
}

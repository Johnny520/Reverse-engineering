package p034S;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p089x0.C1121e;

/* JADX INFO: renamed from: S.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0327g {

    /* JADX INFO: renamed from: a */
    public static final C1121e f630a = null;

    /* JADX INFO: renamed from: b */
    public static final byte[] f631b = null;

    /* JADX INFO: renamed from: c */
    public static final byte[] f632c = null;

    /* JADX INFO: renamed from: d */
    public static final byte[] f633d = null;

    /* JADX INFO: renamed from: e */
    public static final byte[] f634e = null;

    /* JADX INFO: renamed from: f */
    public static final byte[] f635f = null;

    /* JADX INFO: renamed from: g */
    public static final byte[] f636g = null;

    /* JADX INFO: renamed from: h */
    public static final byte[] f637h = null;

    /* JADX INFO: renamed from: i */
    public static final byte[] f638i = null;

    /* JADX INFO: renamed from: j */
    public static final byte[] f639j = null;

    static {
        f630a = new C1121e(8);
        f631b = new byte[]{112, 114, 111, 0};
        f632c = new byte[]{112, 114, 109, 0};
        f633d = new byte[]{48, 49, 53, 0};
        f634e = new byte[]{48, 49, 48, 0};
        f635f = new byte[]{48, 48, 57, 0};
        f636g = new byte[]{48, 48, 53, 0};
        f637h = new byte[]{48, 48, 49, 0};
        f638i = new byte[]{48, 48, 49, 0};
        f639j = new byte[]{48, 48, 50, 0};
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m728a(byte[] r3) {
        Deflater r02 = new Deflater(1);
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        DeflaterOutputStream r2 = new DeflaterOutputStream(r1, r02);     // Catch: Throwable -> L8
        r2.write(r3);     // Catch: Throwable -> L10
        r2.close();     // Catch: Throwable -> L8
        r02.end();
        return r1.toByteArray();
    L10:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L13
    L15:
        throw th;     // Catch: Throwable -> L8
    L13:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r02.end();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m729b(C0323c[] r11, byte[] r12) {
        int r02 = r11.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        C0323c r4 = r11[r2];
        r3 = r3 + (((((r4.f627g * 2) + 7) & (-8)) / 8) + (((r4.f625e * 2) + (m731d(r4.f621a, r4.f622b, r12).getBytes(StandardCharsets.UTF_8).length + 16)) + r4.f626f));
        r2 = r2 + 1;
        goto L3
    L5:
        ByteArrayOutputStream r03 = new ByteArrayOutputStream(r3);
        if (Arrays.equals(r12, f635f) == false) goto L13;
        int r22 = r11.length;
        int r42 = 0;
    L8:
        if (r42 >= r22) goto L23;
        C0323c r5 = r11[r42];
        m743p(r03, r5, m731d(r5.f621a, r5.f622b, r12));
        m745r(r03, r5);
        int[] r6 = r5.f628h;
        int r7 = r6.length;
        int r8 = 0;
        int r9 = 0;
    L10:
        if (r8 >= r7) goto L12;
        int r10 = r6[r8];
        m748u(r03, r10 - r9);
        r8 = r8 + 1;
        r9 = r10;
        goto L10
    L12:
        m744q(r03, r5);
        r42 = r42 + 1;
    L23:
        if (r03.size() != r3) goto L27;
        return r03.toByteArray();
    L27:
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + r03.size() + " expected=" + r3);
    L13:
        int r23 = r11.length;
        int r43 = 0;
    L14:
        if (r43 >= r23) goto L16;
        C0323c r52 = r11[r43];
        m743p(r03, r52, m731d(r52.f621a, r52.f622b, r12));
        r43 = r43 + 1;
        goto L14
    L16:
        int r122 = r11.length;
        int r24 = 0;
    L17:
        if (r24 >= r122) goto L23;
        C0323c r44 = r11[r24];
        m745r(r03, r44);
        int[] r53 = r44.f628h;
        int r62 = r53.length;
        int r72 = 0;
        int r82 = 0;
    L19:
        if (r72 >= r62) goto L21;
        int r92 = r53[r72];
        m748u(r03, r92 - r82);
        r72 = r72 + 1;
        r82 = r92;
        goto L19
    L21:
        m744q(r03, r44);
        r24 = r24 + 1;
        goto L17
    }

    /* JADX INFO: renamed from: c */
    public static boolean m730c(File r6) {
        if (r6.isDirectory() == false) goto L16;
        File[] r62 = r6.listFiles();
        if (r62 != null) goto L7;
        return false;
    L7:
        int r2 = r62.length;
        int r3 = 0;
        boolean r4 = true;
    L8:
        if (r3 >= r2) goto L15;
        if (m730c(r62[r3]) == false) goto L13;
        if (r4 == false) goto L13;
        r4 = true;
    L14:
        r3 = r3 + 1;
    L13:
        r4 = false;
        goto L14
    L15:
        return r4;
    L16:
        r6.delete();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static String m731d(String r6, String r7, byte[] r8) {
        byte[] r02 = f637h;
        boolean r1 = Arrays.equals(r8, r02);
        byte[] r2 = f636g;
        String r3 = "!";
        if (r1 == false) goto L6;
    L4:
        Object r12 = ":";
    L10:
        if (r6.length() > 0) goto L19;
        if ("!".equals(r12) == false) goto L15;
        return r7.replace(":", "!");
    L15:
        if (":".equals(r12) == true) goto L17;
        return r7;
    L17:
        return r7.replace("!", ":");
    L19:
        if (r7.equals("classes.dex") == false) goto L22;
        return r6;
    L22:
        if (r7.contains("!") == true) goto L38;
        if (r7.contains(":") == true) goto L38;
        if (r7.endsWith(".apk") == false) goto L29;
        return r7;
    L29:
        StringBuilder r13 = new StringBuilder();
        r13.append(r6);
        if (Arrays.equals(r8, r02) == false) goto L33;
    L31:
        r3 = ":";
    L35:
        r13.append(r3);
        r13.append(r7);
        return r13.toString();
    L33:
        if (Arrays.equals(r8, r2) == false) goto L35;
    L38:
        if ("!".equals(r12) == false) goto L41;
        return r7.replace(":", "!");
    L41:
        if (":".equals(r12) == true) goto L43;
        return r7;
    L43:
        return r7.replace("!", ":");
    L6:
        if (Arrays.equals(r8, r2) == true) goto L4;
        r12 = "!";
        goto L10
    }

    /* JADX INFO: renamed from: e */
    public static void m732e(PackageInfo r2, File r3) {
        DataOutputStream r32 = new DataOutputStream(new FileOutputStream(new File(r3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));     // Catch: IOException -> L14
        r32.writeLong(r2.lastUpdateTime);     // Catch: Throwable -> L7
        r32.close();     // Catch: IOException -> L14
        return;
    L7:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L10
    L12:
        throw th;     // Catch: IOException -> L14
    L10:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L14
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m733f(InputStream r3, int r4) {
        byte[] r02 = new byte[r4];
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L9;
        int r2 = r3.read(r02, r1, r4 - r1);
        if (r2 < 0) goto L8;
        r1 = r1 + r2;
        goto L3
    L8:
        throw new IllegalStateException(AbstractC0324d.m720c("Not enough bytes to read: ", r4));
    L9:
        return r02;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m734g(ByteArrayInputStream r5, int r6) {
        int[] r02 = new int[r6];
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r6) goto L5;
        r2 = r2 + ((int) m740m(r5, 2));
        r02[r1] = r2;
        r1 = r1 + 1;
        goto L3
    L5:
        return r02;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m735h(FileInputStream r8, int r9, int r10) {
        Inflater r02 = new Inflater();
        byte[] r1 = new byte[r10];     // Catch: Throwable -> L15
        byte[] r2 = new byte[2048];     // Catch: Throwable -> L15
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r02.finished() == true) goto L22;
        if (r02.needsDictionary() == true) goto L22;
        if (r4 >= r9) goto L22;
        int r6 = r8.read(r2);     // Catch: Throwable -> L15
        if (r6 < 0) goto L21;
        r02.setInput(r2, 0, r6);     // Catch: Throwable -> L15
        r5 = r5 + r02.inflate(r1, r5, r10 - r5);
        r4 = r4 + r6;
        goto L5
    L17:
        e = move-exception;
        throw new IllegalStateException(e.getMessage());     // Catch: Throwable -> L15
    L21:
        throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + r9 + " bytes");     // Catch: Throwable -> L15
    L22:
        if (r4 != r9) goto L30;
        if (r02.finished() == false) goto L28;
        r02.end();
        return r1;
    L28:
        throw new IllegalStateException("Inflater did not finish");     // Catch: Throwable -> L15
    L30:
        throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + r9 + " actual=" + r4);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r02.end();
        throw th;
    }

    /* JADX INFO: renamed from: i */
    public static C0323c[] m736i(FileInputStream r6, byte[] r7, byte[] r8, C0323c[] r9) {
        byte[] r02 = f638i;
        if (Arrays.equals(r7, r02) == false) goto L27;
        if (Arrays.equals(f633d, r8) == true) goto L25;
        if (Arrays.equals(r7, r02) == false) goto L23;
        int r72 = (int) m740m(r6, 1);
        long r03 = m740m(r6, 4);
        byte[] r82 = m735h(r6, (int) m740m(r6, 4), (int) r03);
        if (r6.read() > 0) goto L21;
        ByteArrayInputStream r62 = new ByteArrayInputStream(r82);
        C0323c[] r73 = m737j(r62, r72, r9);     // Catch: Throwable -> L14
        r62.close();
        return r73;
    L14:
        th = move-exception;
        r62.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    L21:
        throw new IllegalStateException("Content found after the end of file");
    L23:
        throw new IllegalStateException("Unsupported meta version");
    L25:
        throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
    L27:
        if (Arrays.equals(r7, f639j) == false) goto L43;
        int r74 = (int) m740m(r6, 2);
        long r04 = m740m(r6, 4);
        byte[] r05 = m735h(r6, (int) m740m(r6, 4), (int) r04);
        if (r6.read() > 0) goto L41;
        ByteArrayInputStream r63 = new ByteArrayInputStream(r05);
        C0323c[] r75 = m738k(r63, r8, r74, r9);     // Catch: Throwable -> L34
        r63.close();
        return r75;
    L34:
        th = move-exception;
        r63.close();     // Catch: Throwable -> L37
    L39:
        throw th;
    L37:
        th = move-exception;
        th.addSuppressed(th);
        goto L39
    L41:
        throw new IllegalStateException("Content found after the end of file");
    L43:
        throw new IllegalStateException("Unsupported meta version");
    }

    /* JADX INFO: renamed from: j */
    public static C0323c[] m737j(ByteArrayInputStream r8, int r9, C0323c[] r10) {
        int r1 = 0;
        if (r8.available() != 0) goto L7;
        return new C0323c[0];
    L7:
        if (r9 != r10.length) goto L19;
        String[] r02 = new String[r9];
        int[] r2 = new int[r9];
        int r3 = 0;
    L9:
        if (r3 >= r9) goto L11;
        int r5 = (int) m740m(r8, 2);
        r2[r3] = (int) m740m(r8, 2);
        r02[r3] = new String(m733f(r8, r5), StandardCharsets.UTF_8);
        r3 = r3 + 1;
    L11:
        if (r1 >= r9) goto L17;
        C0323c r32 = r10[r1];
        if (r32.f622b.equals(r02[r1]) == false) goto L16;
        int r4 = r2[r1];
        r32.f625e = r4;
        r32.f628h = m734g(r8, r4);
        r1 = r1 + 1;
        goto L11
    L16:
        throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
    L17:
        return r10;
    L19:
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* JADX INFO: renamed from: k */
    public static C0323c[] m738k(ByteArrayInputStream r10, byte[] r11, int r12, C0323c[] r13) {
        if (r10.available() != 0) goto L7;
        return new C0323c[0];
    L7:
        if (r12 != r13.length) goto L35;
        int r02 = 0;
    L9:
        if (r02 >= r12) goto L33;
        m740m(r10, 2);
        String r4 = new String(m733f(r10, (int) m740m(r10, 2)), StandardCharsets.UTF_8);
        long r5 = m740m(r10, 4);
        int r2 = (int) m740m(r10, 2);
        C0323c r7 = null;
        if (r13.length <= 0) goto L26;
        int r3 = r4.indexOf("!");
        if (r3 >= 0) goto L16;
        r3 = r4.indexOf(":");
    L16:
        if (r3 <= 0) goto L18;
        String r32 = r4.substring(r3 + 1);
    L19:
        int r8 = 0;
    L21:
        if (r8 >= r13.length) goto L26;
        if (r13[r8].f622b.equals(r32) == true) goto L24;
        r8 = r8 + 1;
        goto L21
    L24:
        r7 = r13[r8];
        goto L26
    L18:
        r32 = r4;
    L26:
        if (r7 == null) goto L32;
        r7.f624d = r5;
        int[] r33 = m734g(r10, r2);
        if (Arrays.equals(r11, f637h) == false) goto L30;
        r7.f625e = r2;
        r7.f628h = r33;
    L30:
        r02 = r02 + 1;
        goto L9
    L32:
        throw new IllegalStateException("Missing profile key: ".concat(r4));
    L33:
        return r13;
    L35:
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* JADX INFO: renamed from: l */
    public static C0323c[] m739l(FileInputStream r5, byte[] r6, String r7) {
        if (Arrays.equals(r6, f634e) == false) goto L19;
        int r62 = (int) m740m(r5, 1);
        long r1 = m740m(r5, 4);
        byte[] r02 = m735h(r5, (int) m740m(r5, 4), (int) r1);
        if (r5.read() > 0) goto L17;
        ByteArrayInputStream r52 = new ByteArrayInputStream(r02);
        C0323c[] r63 = m741n(r52, r7, r62);     // Catch: Throwable -> L10
        r52.close();
        return r63;
    L10:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L17:
        throw new IllegalStateException("Content found after the end of file");
    L19:
        throw new IllegalStateException("Unsupported version");
    }

    /* JADX INFO: renamed from: m */
    public static long m740m(InputStream r6, int r7) {
        byte[] r62 = m733f(r6, r7);
        long r02 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L5;
        r02 = r02 + (((long) (r62[r2] & 255)) << (r2 * 8));
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    /* JADX INFO: renamed from: n */
    public static C0323c[] m741n(ByteArrayInputStream r19, String r20, int r21) {
        if (r19.available() == 0) goto L5;
        C0323c[] r2 = new C0323c[r21];
        int r4 = 0;
    L8:
        if (r4 >= r21) goto L10;
        int r6 = (int) m740m(r19, 2);
        int r14 = (int) m740m(r19, 2);
        long r7 = m740m(r19, 4);
        r2[r4] = new C0323c(r20, new String(m733f(r19, r6), StandardCharsets.UTF_8), m740m(r19, 4), r14, (int) r7, (int) m740m(r19, 4), new int[r14], new TreeMap());
        r4 = r4 + 1;
        goto L8
    L10:
        int r42 = 0;
    L11:
        if (r42 >= r21) goto L48;
        C0323c r62 = r2[r42];
        int r72 = r19.available() - r62.f626f;
        int r8 = 0;
    L13:
        int r9 = r19.available();
        TreeMap r11 = r62.f629i;
        if (r9 <= r72) goto L29;
        r8 = r8 + ((int) m740m(r19, 2));
        r11.put(Integer.valueOf(r8), 1);
        int r92 = (int) m740m(r19, 2);
    L16:
        if (r92 <= 0) goto L13;
        m740m(r19, 2);
        int r112 = (int) m740m(r19, 1);
        if (r112 == 6) goto L27;
        if (r112 == 7) goto L27;
    L22:
        if (r112 <= 0) goto L27;
        m740m(r19, 1);
        int r13 = (int) m740m(r19, 1);
    L24:
        if (r13 <= 0) goto L26;
        m740m(r19, 2);
        r13 = r13 - 1;
        goto L24
    L26:
        r112 = r112 - 1;
    L27:
        r92 = r92 - 1;
        goto L16
    L29:
        if (r19.available() != r72) goto L47;
        r62.f628h = m734g(r19, r62.f625e);
        int r63 = r62.f627g;
        BitSet r73 = BitSet.valueOf(m733f(r19, (((r63 * 2) + 7) & (-8)) / 8));
        int r82 = 0;
    L31:
        if (r82 >= r63) goto L45;
        if (r73.get(r82) == false) goto L35;
        int r93 = 2;
    L37:
        if (r73.get(r82 + r63) == false) goto L39;
        r93 = r93 | 4;
    L39:
        if (r93 == 0) goto L44;
        Integer r10 = (Integer) r11.get(Integer.valueOf(r82));
        if (r10 != null) goto L43;
        r10 = 0;
    L43:
        r11.put(Integer.valueOf(r82), Integer.valueOf(r93 | r10.intValue()));
    L44:
        r82 = r82 + 1;
        goto L31
    L35:
        r93 = 0;
        goto L37
    L45:
        r42 = r42 + 1;
        goto L11
    L47:
        throw new IllegalStateException("Read too much data during profile line parse");
    L48:
        return r2;
    L5:
        return new C0323c[0];
    }

    /* JADX INFO: renamed from: o */
    public static boolean m742o(ByteArrayOutputStream r18, byte[] r19, C0323c[] r20) {
        byte[] r3 = f633d;
        int r6 = 0;
        if (Arrays.equals(r19, r3) == false) goto L117;
        ArrayList r1 = new ArrayList(3);
        ArrayList r8 = new ArrayList(3);
        ByteArrayOutputStream r9 = new ByteArrayOutputStream();
        m748u(r9, r20.length);     // Catch: Throwable -> L10
        int r10 = 2;
        int r11 = 0;
        int r12 = 2;
    L7:
        if (r11 >= r20.length) goto L12;
        C0323c r13 = r20[r11];     // Catch: Throwable -> L10
        m747t(r9, r13.f623c, 4);     // Catch: Throwable -> L10
        m747t(r9, r13.f624d, 4);     // Catch: Throwable -> L10
        m747t(r9, r13.f627g, 4);     // Catch: Throwable -> L10
        String r132 = m731d(r13.f621a, r13.f622b, r3);     // Catch: Throwable -> L10
        Charset r14 = StandardCharsets.UTF_8;     // Catch: Throwable -> L10
        int r15 = r132.getBytes(r14).length;     // Catch: Throwable -> L10
        m748u(r9, r15);     // Catch: Throwable -> L10
        r12 = (r12 + 14) + r15;     // Catch: Throwable -> L10
        r9.write(r132.getBytes(r14));     // Catch: Throwable -> L10
        r11 = r11 + 1;     // Catch: Throwable -> L10
        goto L7
    L12:
        byte[] r32 = r9.toByteArray();     // Catch: Throwable -> L10
        if (r12 != r32.length) goto L111;
        C0336p r112 = new C0336p(1, r32, false);     // Catch: Throwable -> L10
        r9.close();
        r1.add(r112);
        ByteArrayOutputStream r33 = new ByteArrayOutputStream();
        int r92 = 0;
        int r113 = 0;
    L165:
    L24:
        th = move-exception;
        r33.close();     // Catch: Throwable -> L107
        throw th;
    L107:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L18:
        if (r92 >= r20.length) goto L26;
        C0323c r122 = r20[r92];     // Catch: Throwable -> L24
        m748u(r33, r92);     // Catch: Throwable -> L24
        m748u(r33, r122.f625e);     // Catch: Throwable -> L24
        r113 = (r113 + 4) + (r122.f625e * 2);     // Catch: Throwable -> L24
        int[] r123 = r122.f628h;     // Catch: Throwable -> L24
        int r152 = r123.length;     // Catch: Throwable -> L24
        int r16 = r6;
    L20:
        if (r6 >= r152) goto L22;
        int r17 = r123[r6];     // Catch: Throwable -> L24
        m748u(r33, r17 - r16);     // Catch: Throwable -> L24
        r6 = r6 + 1;     // Catch: Throwable -> L24
        r16 = r17;
        goto L20
    L22:
        r92 = r92 + 1;     // Catch: Throwable -> L24
        r6 = 0;
        goto L165
    L26:
        byte[] r5 = r33.toByteArray();     // Catch: Throwable -> L24
        if (r113 != r5.length) goto L104;
        C0336p r62 = new C0336p(3, r5, true);     // Catch: Throwable -> L24
        r33.close();
        r1.add(r62);
        ByteArrayOutputStream r34 = new ByteArrayOutputStream();
        int r4 = 0;
        int r52 = 0;
    L170:
    L42:
        th = move-exception;
        r34.close();     // Catch: Throwable -> L100
        throw th;
    L100:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L31:
        if (r4 >= r20.length) goto L60;
        C0323c r63 = r20[r4];     // Catch: Throwable -> L42
        Iterator r93 = r63.f629i.entrySet().iterator();     // Catch: Throwable -> L42
        int r114 = 0;
    L34:
        if (r93.hasNext() == false) goto L36;
        r114 = r114 | ((Integer) ((Map.Entry) r93.next()).getValue()).intValue();     // Catch: Throwable -> L42
        goto L34
    L36:
        ByteArrayOutputStream r94 = new ByteArrayOutputStream();     // Catch: Throwable -> L42
        m744q(r94, r63);     // Catch: Throwable -> L52
        byte[] r124 = r94.toByteArray();     // Catch: Throwable -> L52
        r94.close();     // Catch: Throwable -> L42
        ByteArrayOutputStream r95 = new ByteArrayOutputStream();     // Catch: Throwable -> L42
        m745r(r95, r63);     // Catch: Throwable -> L44
        byte[] r64 = r95.toByteArray();     // Catch: Throwable -> L44
        r95.close();     // Catch: Throwable -> L42
        m748u(r34, r4);     // Catch: Throwable -> L42
        int r96 = (r124.length + r10) + r64.length;     // Catch: Throwable -> L42
        int r53 = r52 + 6;     // Catch: Throwable -> L42
        ArrayList r192 = r8;
        m747t(r34, r96, 4);     // Catch: Throwable -> L42
        m748u(r34, r114);     // Catch: Throwable -> L42
        r34.write(r124);     // Catch: Throwable -> L42
        r34.write(r64);     // Catch: Throwable -> L42
        r52 = r53 + r96;
        r4 = r4 + 1;
        r8 = r192;
        r10 = 2;
        goto L170
    L44:
        th = move-exception;
        r95.close();     // Catch: Throwable -> L48
    L186:
        throw th;     // Catch: Throwable -> L42
    L48:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L52:
        th = move-exception;
        r94.close();     // Catch: Throwable -> L56
    L187:
        throw th;     // Catch: Throwable -> L42
    L56:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L60:
        ArrayList r193 = r8;
        byte[] r2 = r34.toByteArray();     // Catch: Throwable -> L42
        if (r52 != r2.length) goto L97;
        C0336p r42 = new C0336p(4, r2, true);     // Catch: Throwable -> L42
        r34.close();
        r1.add(r42);
        long r22 = 4;
        long r23 = ((r22 + r22) + 4) + ((long) (r1.size() * 16));
        m747t(r18, r1.size(), 4);
        int r43 = 0;
    L65:
        if (r43 >= r1.size()) goto L90;
        C0336p r54 = (C0336p) r1.get(r43);
        int r65 = r54.f653a;
        if (r65 != 1) goto L69;
        long r66 = 0;
    L84:
        m747t(r18, r66, 4);
        m747t(r18, r23, 4);
        boolean r67 = r54.f655c;
        byte[] r55 = r54.f654b;
        if (r67 == false) goto L88;
        long r68 = r55.length;
        byte[] r56 = m728a(r55);
        ArrayList r82 = r193;
        r82.add(r56);
        m747t(r18, r56.length, 4);
        m747t(r18, r68, 4);
        int r57 = r56.length;
    L87:
        r23 = r23 + ((long) r57);
        r43 = r43 + 1;
        r193 = r82;
        goto L65
    L88:
        r82 = r193;
        r82.add(r55);
        m747t(r18, r55.length, 4);
        m747t(r18, 0, 4);
        r57 = r55.length;
        goto L87
    L69:
        if (r65 != 2) goto L71;
        r66 = 1;
        goto L84
    L71:
        if (r65 != 3) goto L73;
        r66 = 2;
        goto L84
    L73:
        if (r65 != 4) goto L75;
        r66 = 3;
        goto L84
    L75:
        if (r65 != 5) goto L79;
        r66 = 4;
        goto L84
    L79:
        throw null;
    L90:
        ArrayList r83 = r193;
        int r69 = 0;
    L92:
        if (r69 >= r83.size()) goto L94;
        r18.write((byte[]) r83.get(r69));
        r69 = r69 + 1;
        goto L92
    L94:
        return true;
    L97:
        throw new IllegalStateException("Expected size " + r52 + ", does not match actual size " + r2.length);     // Catch: Throwable -> L42
    L104:
        throw new IllegalStateException("Expected size " + r113 + ", does not match actual size " + r5.length);     // Catch: Throwable -> L24
    L111:
        throw new IllegalStateException("Expected size " + r12 + ", does not match actual size " + r32.length);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r9.close();     // Catch: Throwable -> L114
        throw th;
    L114:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L117:
        byte[] r35 = f634e;
        if (Arrays.equals(r19, r35) == false) goto L121;
        byte[] r110 = m729b(r20, r35);
        m747t(r18, r20.length, 1);
        m747t(r18, r110.length, 4);
        byte[] r111 = m728a(r110);
        m747t(r18, r111.length, 4);
        r18.write(r111);
        return true;
    L121:
        byte[] r44 = f636g;
        if (Arrays.equals(r19, r44) == false) goto L135;
        m747t(r18, r20.length, 1);
        int r115 = r20.length;
        int r36 = 0;
    L124:
        if (r36 >= r115) goto L133;
        C0323c r58 = r20[r36];
        int r610 = r58.f629i.size() * 4;
        String r7 = m731d(r58.f621a, r58.f622b, r44);
        Charset r84 = StandardCharsets.UTF_8;
        m748u(r18, r7.getBytes(r84).length);
        m748u(r18, r58.f628h.length);
        m747t(r18, r610, 4);
        m747t(r18, r58.f623c, 4);
        r18.write(r7.getBytes(r84));
        Iterator r611 = r58.f629i.keySet().iterator();
    L127:
        if (r611.hasNext() == false) goto L129;
        m748u(r18, ((Integer) r611.next()).intValue());
        m748u(r18, 0);
        goto L127
    L129:
        int[] r59 = r58.f628h;
        int r612 = r59.length;
        int r72 = 0;
    L130:
        if (r72 >= r612) goto L132;
        m748u(r18, r59[r72]);
        r72 = r72 + 1;
        goto L130
    L132:
        r36 = r36 + 1;
        goto L124
    L133:
        return true;
    L135:
        byte[] r45 = f635f;
        if (Arrays.equals(r19, r45) == false) goto L139;
        byte[] r116 = m729b(r20, r45);
        m747t(r18, r20.length, 1);
        m747t(r18, r116.length, 4);
        byte[] r117 = m728a(r116);
        m747t(r18, r117.length, 4);
        r18.write(r117);
        return true;
    L139:
        byte[] r37 = f637h;
        if (Arrays.equals(r19, r37) == false) goto L153;
        m748u(r18, r20.length);
        int r118 = r20.length;
        int r73 = 0;
    L142:
        if (r73 >= r118) goto L151;
        C0323c r46 = r20[r73];
        String r510 = m731d(r46.f621a, r46.f622b, r37);
        Charset r613 = StandardCharsets.UTF_8;
        m748u(r18, r510.getBytes(r613).length);
        TreeMap r85 = r46.f629i;
        m748u(r18, r85.size());
        m748u(r18, r46.f628h.length);
        m747t(r18, r46.f623c, 4);
        r18.write(r510.getBytes(r613));
        Iterator r511 = r85.keySet().iterator();
    L145:
        if (r511.hasNext() == false) goto L147;
        m748u(r18, ((Integer) r511.next()).intValue());
        goto L145
    L147:
        int[] r47 = r46.f628h;
        int r512 = r47.length;
        int r614 = 0;
    L148:
        if (r614 >= r512) goto L150;
        m748u(r18, r47[r614]);
        r614 = r614 + 1;
        goto L148
    L150:
        r73 = r73 + 1;
        goto L142
    L151:
        return true;
    L153:
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static void m743p(ByteArrayOutputStream r4, C0323c r5, String r6) {
        Charset r02 = StandardCharsets.UTF_8;
        m748u(r4, r6.getBytes(r02).length);
        m748u(r4, r5.f625e);
        m747t(r4, r5.f626f, 4);
        m747t(r4, r5.f623c, 4);
        m747t(r4, r5.f627g, 4);
        r4.write(r6.getBytes(r02));
    }

    /* JADX INFO: renamed from: q */
    public static void m744q(ByteArrayOutputStream r8, C0323c r9) {
        byte[] r02 = new byte[(((r9.f627g * 2) + 7) & (-8)) / 8];
        Iterator r1 = r9.f629i.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L11;
        Map.Entry r2 = (Map.Entry) r1.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        int r22 = ((Integer) r2.getValue()).intValue();
        if ((r22 & 2) == 0) goto L9;
        int r4 = r3 / 8;
        r02[r4] = (byte) (r02[r4] | (1 << (r3 % 8)));
    L9:
        if ((r22 & 4) == 0) goto L4;
        int r32 = r3 + r9.f627g;
        int r23 = r32 / 8;
        int r33 = 1 << (r32 % 8);
        r02[r23] = (byte) (r33 | r02[r23]);
        goto L4
    L11:
        r8.write(r02);
    }

    /* JADX INFO: renamed from: r */
    public static void m745r(ByteArrayOutputStream r4, C0323c r5) {
        Iterator r52 = r5.f629i.entrySet().iterator();
        int r1 = 0;
    L4:
        if (r52.hasNext() == false) goto L9;
        Map.Entry r2 = (Map.Entry) r52.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        if ((((Integer) r2.getValue()).intValue() & 1) == 0) goto L4;
        m748u(r4, r3 - r1);
        m748u(r4, 0);
        r1 = r3;
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: s */
    public static void m746s(Context r17, Executor r18, InterfaceC0326f r19, boolean r20) {
        Context r02 = r17.getApplicationContext();
        String r2 = r02.getPackageName();
        ApplicationInfo r3 = r02.getApplicationInfo();
        AssetManager r9 = r02.getAssets();
        String r6 = new File(r3.sourceDir).getName();
        PackageInfo r12 = r17.getPackageManager().getPackageInfo(r2, 0);     // Catch: PackageManager.NameNotFoundException -> L226
        File r13 = r17.getFilesDir();
        if (r20 == true) goto L30;
        File r03 = new File(r13, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (r03.exists() == true) goto L240;
        boolean r04 = false;
    L27:
        if (r04 == false) goto L30;
        r17.getPackageName();
        AbstractC0335o.m756c(r17, false);
        return;
    L240:
        DataInputStream r32 = new DataInputStream(new FileInputStream(r03));     // Catch: IOException -> L26
        long r4 = r32.readLong();     // Catch: Throwable -> L18
        r32.close();     // Catch: IOException -> L26
        if (r4 != r12.lastUpdateTime) goto L15;
        r04 = true;
    L16:
        if (r04 == false) goto L27;
        r19.mo348n(2, null);
        goto L27
    L15:
        r04 = false;
        goto L16
    L18:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L22
    L274:
        throw th;     // Catch: IOException -> L26
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L26
        throw th;     // Catch: IOException -> L26
    L26:
        r04 = false;
    L30:
        r17.getPackageName();
        int r05 = Build.VERSION.SDK_INT;
        File r10 = new File(new File("/data/misc/profiles/cur/0", r2), "primary.prof");
        C0322b r11 = new C0322b(r9, r18, r19, r6, r10);
        byte[] r22 = r11.f615c;
        if (r22 != null) goto L35;
        r11.m717b(3, Integer.valueOf(r05));
    L33:
        ?? r42 = 1;
    L219:
        boolean r23 = false;
    L220:
        if (r23 == false) goto L223;
        if (r20 == false) goto L223;
        ?? r112 = r42;
    L224:
        AbstractC0335o.m756c(r17, r112);
        return;
    L223:
        r112 = 0;
        goto L224
    L35:
        if (r10.exists() == true) goto L37;
        r10.createNewFile();     // Catch: IOException -> L218
    L40:
        r11.f618f = true;
        byte[] r43 = f631b;
        FileInputStream r62 = r11.m716a(r9, "dexopt/baseline.prof");     // Catch: IOException -> L43 FileNotFoundException -> L45
    L250:
        if (r62 != null) goto L268;
    L87:
        C0323c[] r06 = r11.f619g;
        if (r06 == null) goto L126;
        int r5 = Build.VERSION.SDK_INT;
        if (r5 > 34) goto L126;
        switch(r5) {
            case 31: goto L272;
            case 32: goto L272;
            case 33: goto L272;
            case 34: goto L272;
            default: goto L126;
        };
    L272:
        FileInputStream r52 = r11.m716a(r9, "dexopt/baseline.profm");     // Catch: IllegalStateException -> L101 IOException -> L103 FileNotFoundException -> L105
        if (r52 != null) goto L241;
        if (r52 == null) goto L123;
        r52.close();     // Catch: IllegalStateException -> L101 IOException -> L103 FileNotFoundException -> L105
    L123:
        C0322b r07 = null;
    L124:
        if (r07 == null) goto L126;
        r11 = r07;
        goto L126
    L241:
    L107:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L113
        throw th;     // Catch: IllegalStateException -> L101 IOException -> L103 FileNotFoundException -> L105
    L113:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L101 IOException -> L103 FileNotFoundException -> L105
        throw th;     // Catch: IllegalStateException -> L101 IOException -> L103 FileNotFoundException -> L105
    L97:
        if (Arrays.equals(f632c, m733f(r52, 4)) == false) goto L110;
        r11.f619g = m736i(r52, m733f(r52, 4), r22, r06);     // Catch: Throwable -> L107
        r52.close();     // Catch: IllegalStateException -> L101 IOException -> L103 FileNotFoundException -> L105
        r07 = r11;
        goto L124
    L110:
        throw new IllegalStateException("Invalid magic");     // Catch: Throwable -> L107
    L105:
        e = move-exception;
        r19.mo348n(9, e);
    L103:
        e = move-exception;
        r19.mo348n(7, e);
    L101:
        e = move-exception;
        r11.f619g = null;
        r19.mo348n(8, e);
    L126:
        InterfaceC0326f r24 = r11.f614b;
        C0323c[] r08 = r11.f619g;
        ?? r44 = r43;
        if (r08 == null) goto L159;
        byte[] r53 = r11.f615c;
        r44 = r43;
        if (r53 == null) goto L159;
        if (r11.f618f == false) goto L158;
        ByteArrayOutputStream r63 = new ByteArrayOutputStream();     // Catch: IllegalStateException -> L139 IOException -> L141
        r63.write(r43);     // Catch: Throwable -> L143
        r63.write(r53);     // Catch: Throwable -> L143
        if (m742o(r63, r53, r08) == true) goto L145;
        r24.mo348n(5, null);     // Catch: Throwable -> L143
        r11.f619g = null;     // Catch: Throwable -> L143
        r63.close();     // Catch: IllegalStateException -> L139 IOException -> L141
        r44 = r43;
        goto L159
    L145:
        r11.f620h = r63.toByteArray();     // Catch: Throwable -> L143
        r63.close();     // Catch: IllegalStateException -> L139 IOException -> L141
        ?? r45 = r43;
    L156:
        r11.f619g = null;
        r44 = r45;
    L143:
        th = move-exception;
        r63.close();     // Catch: Throwable -> L150
        throw th;     // Catch: IllegalStateException -> L139 IOException -> L141
    L150:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L139 IOException -> L141
        throw th;     // Catch: IllegalStateException -> L139 IOException -> L141
    L141:
        e = move-exception;
        r45 = 7;
        r24.mo348n(7, e);
    L139:
        e = move-exception;
        r24.mo348n(8, e);
        r45 = r43;
        goto L156
    L158:
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    L159:
        byte[] r09 = r11.f620h;
        if (r09 != null) goto L239;
        r23 = false;
        r42 = 1;
    L212:
        if (r23 == false) goto L220;
        m732e(r12, r13);
        goto L220
    L239:
        if (r11.f618f == false) goto L217;
        ByteArrayInputStream r25 = new ByteArrayInputStream(r09);     // Catch: Throwable -> L177 IOException -> L203 FileNotFoundException -> L205
        FileOutputStream r33 = new FileOutputStream(r11.f616d);     // Catch: Throwable -> L195
        byte[] r010 = new byte[512];     // Catch: Throwable -> L187
    L168:
        int r46 = r25.read(r010);     // Catch: Throwable -> L187
        if (r46 <= 0) goto L172;
        r33.write(r010, 0, r46);     // Catch: Throwable -> L187
        goto L168
    L172:
        r42 = 1;
        r11.m717b(1, null);     // Catch: Throwable -> L185
        r33.close();     // Catch: Throwable -> L183
        r25.close();     // Catch: Throwable -> L177 IOException -> L179 FileNotFoundException -> L181
        r11.f620h = null;
        r11.f619g = null;
        r23 = true;
    L185:
        th = th;
    L186:
        Throwable r54 = th;
        r33.close();     // Catch: Throwable -> L191
    L278:
        throw r54;     // Catch: Throwable -> L183
    L191:
        th = move-exception;
        r54.addSuppressed(th);     // Catch: Throwable -> L183
        throw r54;     // Catch: Throwable -> L183
    L183:
        th = th;
    L184:
        Throwable r34 = th;
        r25.close();     // Catch: Throwable -> L199
        throw r34;     // Catch: Throwable -> L177 IOException -> L179 FileNotFoundException -> L181
    L199:
        th = move-exception;
        r34.addSuppressed(th);     // Catch: Throwable -> L177 IOException -> L179 FileNotFoundException -> L181
        throw r34;     // Catch: Throwable -> L177 IOException -> L179 FileNotFoundException -> L181
    L187:
        th = th;
    L195:
        th = th;
        goto L184
    L205:
        e = e;
        r44 = 1;
    L209:
        r11.m717b(6, e);     // Catch: Throwable -> L177
        ?? r47 = r44;
    L208:
        r11.f620h = null;
        r11.f619g = null;
        r23 = false;
        r42 = r47;
    L203:
        e = e;
        r44 = 1;
    L207:
        r11.m717b(7, e);     // Catch: Throwable -> L177
        r47 = r44;
    L181:
        e = e;
    L179:
        e = e;
        goto L207
    L217:
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    L177:
        th = move-exception;
        r11.f620h = null;
        r11.f619g = null;
        throw th;
    L268:
    L63:
        e = move-exception;
        int r15 = 7;
        r19.mo348n(7, e);     // Catch: Throwable -> L59
        r62.close();     // Catch: IOException -> L78
    L80:
        C0323c[] r55 = null;
    L81:
        r11.f619g = r55;
    L78:
        e = move-exception;
        IOException r56 = e;
    L72:
        r19.mo348n(r15, r56);
    L61:
        e = move-exception;
        r19.mo348n(8, e);     // Catch: Throwable -> L73
        r62.close();     // Catch: IOException -> L70
    L70:
        e = move-exception;
        r56 = e;
        r15 = 7;
    L73:
        th = th;
    L57:
        Throwable r1 = th;
        r62.close();     // Catch: IOException -> L84
        throw r1;
    L84:
        e = move-exception;
        r19.mo348n(7, e);
        throw r1;
    L51:
        if (Arrays.equals(r43, m733f(r62, 4)) == false) goto L66;
        r55 = m739l(r62, m733f(r62, 4), r11.f617e);     // Catch: Throwable -> L59 IllegalStateException -> L61 IOException -> L63
        r62.close();     // Catch: IOException -> L55
    L55:
        e = move-exception;
        r19.mo348n(7, e);
        goto L81
    L66:
        throw new IllegalStateException("Invalid magic");     // Catch: Throwable -> L59 IllegalStateException -> L61 IOException -> L63
    L59:
        th = th;
        goto L57
    L45:
        e = move-exception;
        r19.mo348n(6, e);
    L47:
        r62 = null;
    L43:
        e = move-exception;
        r19.mo348n(7, e);
    L218:
        r42 = 1;
        r11.m717b(4, null);
        goto L219
    L37:
        if (r10.canWrite() == true) goto L40;
        r11.m717b(4, null);
    L226:
        e = move-exception;
        r19.mo348n(7, e);
        AbstractC0335o.m756c(r17, false);
    }

    /* JADX INFO: renamed from: t */
    public static void m747t(ByteArrayOutputStream r6, long r7, int r9) {
        byte[] r02 = new byte[r9];
        int r1 = 0;
    L3:
        if (r1 >= r9) goto L5;
        r02[r1] = (byte) ((r7 >> (r1 * 8)) & 255);
        r1 = r1 + 1;
        goto L3
    L5:
        r6.write(r02);
    }

    /* JADX INFO: renamed from: u */
    public static void m748u(ByteArrayOutputStream r2, int r3) {
        m747t(r2, r3, 2);
    }
}

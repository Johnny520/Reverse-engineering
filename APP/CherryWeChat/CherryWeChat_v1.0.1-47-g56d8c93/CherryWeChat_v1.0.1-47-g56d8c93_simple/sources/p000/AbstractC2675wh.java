package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: wh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2675wh extends AbstractC0628Oj {
    /* JADX INFO: renamed from: Z */
    public static void m5237Z(File r6, File r7) {
        if (r6.exists() == false) goto L37;
        C2589uh r0 = new C2589uh(new C2499sd(r6, 1, new C0309H7(10), 1));
    L6:
        if (r0.hasNext() == false) goto L35;
        File r1 = (File) r0.next();
        if (r1.exists() == false) goto L34;
        File r3 = new File(r7, m5245h0(r1, r6));
        if (r3.exists() == false) goto L26;
        if (r1.isDirectory() == false) goto L16;
        if (r3.isDirectory() == true) goto L26;
    L16:
        if (r3.isDirectory() == false) goto L21;
        if (m5239b0(r3) == true) goto L26;
    L24:
        throw new C0516M(r1, r3, "The destination file already exists.");
    L21:
        if (r3.delete() == false) goto L24;
    L26:
        if (r1.isDirectory() == true) goto L27;
        m5238a0(r1, r3);
        if (r3.length() == r1.length()) goto L6;
        throw new IOException("Source file wasn't copied completely, length of destination file differs.");
    L27:
        r3.mkdirs();
        goto L6
    L34:
        throw new C0516M(r1, 2);
    L35:
        return;
    L37:
        throw new C0516M(r6, 2);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m5238a0(File r2, File r3) {
        if (r2.exists() == false) goto L39;
        if (r3.exists() == false) goto L12;
        if (r3.delete() == true) goto L12;
        throw new C0516M(r2, r3, "Tried to overwrite the destination, but failed to delete it.");
    L12:
        if (r2.isDirectory() == true) goto L14;
        File r0 = r3.getParentFile();
        if (r0 == null) goto L21;
        r0.mkdirs();
    L21:
        FileInputStream r02 = new FileInputStream(r2);
        FileOutputStream r22 = new FileOutputStream(r3);     // Catch: Throwable -> L27
        AbstractC1293cr.m2555p(r02, r22);     // Catch: Throwable -> L29
        r22.close();     // Catch: Throwable -> L27
        r02.close();
        return;
    L29:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        AbstractC0585Nj.m1138f(r22, th);     // Catch: Throwable -> L27
        throw th;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        AbstractC0585Nj.m1138f(r02, th);
        throw th;
    L14:
        if (r3.mkdirs() == false) goto L17;
        return;
    L17:
        throw new C2273na(r2, r3, "Failed to create target directory.");
    L39:
        throw new C0516M(r2, 2);
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m5239b0(File r4) {
        C2589uh r42 = new C2589uh(new C2499sd(r4, 2, null, 1));
    L3:
        boolean r1 = true;
    L5:
        if (r42.hasNext() == false) goto L13;
        File r2 = (File) r42.next();
        if (r2.delete() == true) goto L10;
        if (r2.exists() == false) goto L10;
    L12:
        r1 = false;
    L10:
        if (r1 == false) goto L12;
    L13:
        return r1;
    }

    /* JADX INFO: renamed from: c0 */
    public static String m5240c0(File r2) {
        String r22 = r2.getName();
        int r0 = AbstractC2564tz.m5060U(6, r22, ".");
        if (r0 != (-1)) goto L6;
        return r22;
    L6:
        return r22.substring(0, r0);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d0 */
    public static final C2323oh m5241d0(C2323oh r6) {
        File r1 = r6.f8169a;
        ?? r62 = r6.f8170b;
        ArrayList r2 = new ArrayList(r62.size());
        Iterator r63 = r62.iterator();
    L4:
        if (r63.hasNext() == false) goto L18;
        File r3 = (File) r63.next();
        String r4 = r3.getName();
        if (AbstractC0585Nj.m1134a(r4, ".") == true) goto L4;
        if (AbstractC0585Nj.m1134a(r4, "..") == true) goto L11;
        r2.add(r3);
        goto L4
    L11:
        if (r2.isEmpty() == true) goto L15;
        if (AbstractC0585Nj.m1134a(((File) AbstractC2453ra.m4902l0(r2)).getName(), "..") == true) goto L15;
        Comparable r32 = (Comparable) r2.remove(r2.size() - 1);
    L15:
        r2.add(r3);
        goto L4
    L18:
        return new C2323oh(r1, r2);
    }

    /* JADX INFO: renamed from: e0 */
    public static byte[] m5242e0(File r8) {
        FileInputStream r0 = new FileInputStream(r8);
        long r1 = r8.length();     // Catch: Throwable -> L12
        if (r1 > 2147483647L) goto L27;
        int r12 = (int) r1;
        byte[] r2 = new byte[r12];     // Catch: Throwable -> L12
        int r5 = r12;
        int r6 = 0;
    L8:
        if (r5 <= 0) goto L14;
        int r7 = r0.read(r2, r6, r5);     // Catch: Throwable -> L12
        if (r7 < 0) goto L14;
        r5 = r5 - r7;     // Catch: Throwable -> L12
        r6 = r6 + r7;     // Catch: Throwable -> L12
    L14:
        if (r5 <= 0) goto L16;
        r2 = Arrays.copyOf(r2, r6);     // Catch: Throwable -> L12
    L22:
        r0.close();
        return r2;
    L16:
        int r52 = r0.read();     // Catch: Throwable -> L12
        if (r52 == (-1)) goto L22;
        C0753Rg r62 = new C0753Rg(8193);     // Catch: Throwable -> L12
        r62.write(r52);     // Catch: Throwable -> L12
        AbstractC1293cr.m2555p(r0, r62);     // Catch: Throwable -> L12
        int r53 = r62.size() + r12;     // Catch: Throwable -> L12
        if (r53 < 0) goto L25;
        byte[] r82 = r62.m1543f();     // Catch: Throwable -> L12
        r2 = Arrays.copyOf(r2, r53);     // Catch: Throwable -> L12
        System.arraycopy(r82, 0, r2, r12, r62.size());     // Catch: Throwable -> L12
        goto L22
    L25:
        throw new OutOfMemoryError("File " + r8 + " is too big to fit in memory.");     // Catch: Throwable -> L12
    L27:
        throw new OutOfMemoryError("File " + r8 + " is too big (" + r1 + " bytes) to fit in memory.");     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        AbstractC0585Nj.m1138f(r0, th);
        throw th;
    }

    /* JADX INFO: renamed from: f0 */
    public static ArrayList m5243f0(File r5) {
        Charset r0 = AbstractC2659w7.f9201a;
        ArrayList r1 = new ArrayList();
        BufferedReader r2 = new BufferedReader(new InputStreamReader(new FileInputStream(r5), r0));
        Iterator r52 = new C1216bb(new C2381po(0, r2)).iterator();     // Catch: Throwable -> L8
    L4:
        if (r52.hasNext() == false) goto L10;
        r1.add((String) r52.next());     // Catch: Throwable -> L8
        goto L4
    L10:
        r2.close();
        return r1;
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        AbstractC0585Nj.m1138f(r2, th);
        throw th;
    }

    /* JADX INFO: renamed from: g0 */
    public static String m5244g0(File r3) {
        Charset r0 = AbstractC2659w7.f9201a;
        InputStreamReader r1 = new InputStreamReader(new FileInputStream(r3), r0);
        String r32 = AbstractC1406fG.m2708h0(r1);     // Catch: Throwable -> L6
        r1.close();
        return r32;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        AbstractC0585Nj.m1138f(r1, th);
        throw th;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h0 */
    public static final String m5245h0(File r10, File r11) {
        C2323oh r0 = m5241d0(AbstractC0628Oj.m1234V(r10));
        ?? r1 = r0.f8170b;
        C2323oh r2 = m5241d0(AbstractC0628Oj.m1234V(r11));
        ?? r3 = r2.f8170b;
        boolean r02 = r0.f8169a.equals(r2.f8169a);
        String r22 = null;
        if (r02 == false) goto L40;
        int r03 = r3.size();
        int r4 = r1.size();
        int r5 = Math.min(r4, r03);
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L10;
        if (AbstractC0585Nj.m1134a(r1.get(r6), r3.get(r6)) == false) goto L10;
        r6 = r6 + 1;
    L10:
        StringBuilder r52 = new StringBuilder();
        int r7 = r03 - 1;
        if (r6 <= r7) goto L13;
    L20:
        if (r6 >= r4) goto L39;
        if (r6 >= r03) goto L23;
        r52.append(File.separatorChar);
    L23:
        if (r6 < 0) goto L38;
        if (r6 != 0) goto L26;
        List r04 = AbstractC2453ra.m4908r0(r1);
    L36:
        AbstractC2453ra.m4900j0(r04, r52, File.separator);
        goto L39
    L26:
        int r05 = r1.size() - r6;
        if (r05 > 0) goto L30;
        r04 = C0452Kf.f1484a;
        goto L36
    L30:
        if (r05 != 1) goto L32;
        r04 = Collections.singletonList(AbstractC2453ra.m4902l0(r1));
        goto L36
    L32:
        ArrayList r23 = new ArrayList(r05);
        int r06 = r1.size();
    L33:
        if (r6 >= r06) goto L35;
        r23.add(r1.get(r6));
        r6 = r6 + 1;
        goto L33
    L35:
        r04 = r23;
        goto L36
    L38:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r6, "Requested element count ", " is less than zero.").toString());
    L39:
        r22 = r52.toString();
    L13:
        if (AbstractC0585Nj.m1134a(((File) r3.get(r7)).getName(), "..") == true) goto L40;
        r52.append("..");
        if (r7 == r6) goto L18;
        r52.append(File.separatorChar);
    L18:
        if (r7 == r6) goto L20;
        r7 = r7 - 1;
    L40:
        if (r22 == null) goto L43;
        return r22;
    L43:
        throw new IllegalArgumentException("this and base files have different roots: " + r10 + " and " + r11 + '.');
    }

    /* JADX INFO: renamed from: i0 */
    public static void m5246i0(File r2, String r3) {
        Charset r0 = AbstractC2659w7.f9201a;
        FileOutputStream r1 = new FileOutputStream(r2);
        m5247j0(r1, r3, r0);     // Catch: Throwable -> L6
        r1.close();
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        AbstractC0585Nj.m1138f(r1, th);
        throw th;
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m5247j0(FileOutputStream r8, String r9, Charset r10) {
        if (r9.length() >= 16384) goto L6;
        r8.write(r9.getBytes(r10));
        return;
    L6:
        CharsetEncoder r102 = r10.newEncoder();
        CodingErrorAction r0 = CodingErrorAction.REPLACE;
        CharsetEncoder r103 = r102.onMalformedInput(r0).onUnmappableCharacter(r0);
        CharBuffer r1 = CharBuffer.allocate(8192);
        ByteBuffer r02 = ByteBuffer.allocate(8192 * ((int) Math.ceil(r103.maxBytesPerChar())));
        int r3 = 0;
        int r4 = 0;
    L8:
        if (r3 >= r9.length()) goto L22;
        int r5 = Math.min(8192 - r4, r9.length() - r3);
        int r6 = r3 + r5;
        r9.getChars(r3, r6, r1.array(), r4);
        r1.limit(r5 + r4);
        r4 = 1;
        if (r6 != r9.length()) goto L12;
        boolean r32 = true;
    L14:
        if (r103.encode(r1, r02, r32).isUnderflow() == false) goto L21;
        r8.write(r02.array(), 0, r02.position());
        if (r1.position() == r1.limit()) goto L18;
        r1.put(0, r1.get());
    L19:
        r1.clear();
        r02.clear();
        r3 = r6;
        goto L8
    L18:
        r4 = 0;
        goto L19
    L21:
        throw new IllegalStateException("Check failed.");
    L12:
        r32 = false;
        goto L14
    }
}

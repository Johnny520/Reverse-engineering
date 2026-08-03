package p026N0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import p001A0.AbstractC0040p;
import p009E0.C0170a;
import p009E0.C0180k;
import p031Q0.AbstractC0307g;
import p040V0.C0398a;
import p040V0.InterfaceC0405h;
import p042W0.AbstractC0416a;

/* JADX INFO: renamed from: N0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0270k extends AbstractC0040p {
    /* JADX INFO: renamed from: g0 */
    public static void m690g0(File r2, File r3) {
        if (r2.exists() == false) goto L37;
        if (r3.exists() == true) goto L35;
        if (r2.isDirectory() == true) goto L9;
        File r02 = r3.getParentFile();
        if (r02 == null) goto L16;
        r02.mkdirs();
    L16:
        FileInputStream r03 = new FileInputStream(r2);
        FileOutputStream r22 = new FileOutputStream(r3);     // Catch: Throwable -> L23
        AbstractC0040p.m115t(r03, r22, 8192);     // Catch: Throwable -> L25
        AbstractC0040p.m108m(r22, null);     // Catch: Throwable -> L23
        AbstractC0040p.m108m(r03, null);
        return;
    L25:
        th = move-exception;
        throw th;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        AbstractC0040p.m108m(r22, th);     // Catch: Throwable -> L23
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        AbstractC0040p.m108m(r03, th);
        throw th;
    L9:
        if (r3.mkdirs() == false) goto L12;
        return;
    L12:
        throw new C0261b(r2, r3, "Failed to create target directory.");
    L35:
        throw new C0260a(r2, r3, "The destination file already exists.");
    L37:
        throw new C0260a(r2, null, "The source file doesn't exist.");
    }

    /* JADX INFO: renamed from: h0 */
    public static ArrayList m691h0(File r5, Charset r6) {
        AbstractC0307g.m703e(r6, "charset");
        ArrayList r02 = new ArrayList();
        C0170a r1 = new C0170a(1, r02);
        BufferedReader r2 = new BufferedReader(new InputStreamReader(new FileInputStream(r5), r6));
        InterfaceC0405h r52 = new C0180k(3, r2);     // Catch: Throwable -> L12
        if ((r52 instanceof C0398a) == true) goto L7;
        r52 = new C0398a(r52);     // Catch: Throwable -> L12
    L7:
        Iterator r53 = ((C0398a) r52).iterator();     // Catch: Throwable -> L12
    L8:
        if (r53.hasNext() == false) goto L14;
        r1.invoke(r53.next());     // Catch: Throwable -> L12
        goto L8
    L14:
        AbstractC0040p.m108m(r2, null);
        return r02;
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        AbstractC0040p.m108m(r2, th);
        throw th;
    }

    /* JADX INFO: renamed from: i0 */
    public static String m692i0(File r3, Charset r4) {
        AbstractC0307g.m703e(r4, "charset");
        InputStreamReader r02 = new InputStreamReader(new FileInputStream(r3), r4);
        StringWriter r32 = new StringWriter();     // Catch: Throwable -> L9
        char[] r42 = new char[8192];     // Catch: Throwable -> L9
        int r1 = r02.read(r42);     // Catch: Throwable -> L9
    L4:
        if (r1 < 0) goto L6;
        r32.write(r42, 0, r1);     // Catch: Throwable -> L9
        r1 = r02.read(r42);     // Catch: Throwable -> L9
        goto L4
    L6:
        String r33 = r32.toString();     // Catch: Throwable -> L9
        AbstractC0307g.m702d(r33, "toString(...)");     // Catch: Throwable -> L9
        AbstractC0040p.m108m(r02, null);
        return r33;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        AbstractC0040p.m108m(r02, th);
        throw th;
    }

    /* JADX INFO: renamed from: j0 */
    public static void m693j0(File r1, String r2, Charset r3) {
        AbstractC0307g.m703e(r1, "<this>");
        AbstractC0307g.m703e(r2, "text");
        AbstractC0307g.m703e(r3, "charset");
        FileOutputStream r02 = new FileOutputStream(r1);
        m695l0(r02, r2, r3);     // Catch: Throwable -> L6
        AbstractC0040p.m108m(r02, null);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        AbstractC0040p.m108m(r02, th);
        throw th;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m694k0(File r1, String r2) {
        m693j0(r1, r2, AbstractC0416a.f921a);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m695l0(FileOutputStream r9, String r10, Charset r11) {
        AbstractC0307g.m703e(r10, "text");
        AbstractC0307g.m703e(r11, "charset");
        if (r10.length() >= 16384) goto L6;
        byte[] r102 = r10.getBytes(r11);
        AbstractC0307g.m702d(r102, "getBytes(...)");
        r9.write(r102);
        return;
    L6:
        CharsetEncoder r112 = r11.newEncoder();
        CodingErrorAction r02 = CodingErrorAction.REPLACE;
        CharsetEncoder r113 = r112.onMalformedInput(r02).onUnmappableCharacter(r02);
        CharBuffer r1 = CharBuffer.allocate(8192);
        AbstractC0307g.m700b(r113);
        ByteBuffer r03 = ByteBuffer.allocate(8192 * ((int) Math.ceil(r113.maxBytesPerChar())));
        AbstractC0307g.m702d(r03, "allocate(...)");
        int r3 = 0;
        int r4 = 0;
    L8:
        if (r3 >= r10.length()) goto L22;
        int r5 = Math.min(8192 - r4, r10.length() - r3);
        int r6 = r3 + r5;
        char[] r7 = r1.array();
        AbstractC0307g.m702d(r7, "array(...)");
        r10.getChars(r3, r6, r7, r4);
        r1.limit(r5 + r4);
        r4 = 1;
        if (r6 != r10.length()) goto L12;
        boolean r32 = true;
    L14:
        if (r113.encode(r1, r03, r32).isUnderflow() == false) goto L21;
        r9.write(r03.array(), 0, r03.position());
        if (r1.position() == r1.limit()) goto L18;
        r1.put(0, r1.get());
    L19:
        r1.clear();
        r03.clear();
        r3 = r6;
        goto L8
    L18:
        r4 = 0;
        goto L19
    L21:
        throw new IllegalStateException("Check failed.".toString());
    L12:
        r32 = false;
        goto L14
    }
}

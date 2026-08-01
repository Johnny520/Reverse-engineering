package com.bumptech.glide;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.DragEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p000A.C0099z;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0972l;
import p061L2.C0981u;
import p103U2.C1476a;
import p117X2.AbstractC1665j;
import p118X3.C1692b;
import p118X3.C1698h;
import p118X3.C1705o;
import p118X3.EnumC1689K;
import p121Y1.C1753n;
import p123Y3.AbstractC1776g;
import p128a.AbstractC1785a;
import p132a3.C1802b;
import p132a3.C1804d;
import p149d3.AbstractC1973a;
import p153e1.C2019o;
import p153e1.C2020p;
import p153e1.C2021q;
import p179i4.AbstractC2352g;
import p215o4.AbstractC2803b;
import p245u0.C3309f;

/* JADX INFO: renamed from: com.bumptech.glide.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1926h {

    /* JADX INFO: renamed from: a */
    public static C3309f f6535a;

    /* JADX INFO: renamed from: A */
    public static byte[] m3550A(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i5 = (int) length;
            byte[] bArrCopyOf = new byte[i5];
            int i6 = i5;
            int i7 = 0;
            while (i6 > 0) {
                int i8 = fileInputStream.read(bArrCopyOf, i7, i6);
                if (i8 < 0) {
                    break;
                }
                i6 -= i8;
                i7 += i8;
            }
            if (i6 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                AbstractC1665j.m2984d(bArrCopyOf, "copyOf(...)");
            } else {
                int i9 = fileInputStream.read();
                if (i9 != -1) {
                    C1476a c1476a = new C1476a(8193);
                    c1476a.write(i9);
                    AbstractC1924f.m3496h(fileInputStream, c1476a);
                    int size = c1476a.size() + i5;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM2748b = c1476a.m2748b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    AbstractC1665j.m2984d(bArrCopyOf, "copyOf(...)");
                    AbstractC0972l.m1989M(i5, 0, c1476a.size(), bArrM2748b, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1925g.m3534k(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m3551B(File file) throws IOException {
        Charset charset = AbstractC1973a.f6662a;
        AbstractC1665j.m2985e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i5 = inputStreamReader.read(cArr); i5 >= 0; i5 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i5);
            }
            String string = stringWriter.toString();
            AbstractC1665j.m2984d(string, "toString(...)");
            inputStreamReader.close();
            return string;
        } finally {
        }
    }

    /* JADX INFO: renamed from: E */
    public static C1802b m3552E(C1804d c1804d, int i5) {
        AbstractC1665j.m2985e(c1804d, "<this>");
        boolean z5 = i5 > 0;
        Integer numValueOf = Integer.valueOf(i5);
        if (!z5) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i6 = c1804d.f6140d;
        int i7 = c1804d.f6141e;
        if (c1804d.f6142f <= 0) {
            i5 = -i5;
        }
        return new C1802b(i6, i7, i5);
    }

    /* JADX INFO: renamed from: F */
    public static final String m3553F(int i5) {
        if (i5 == 0) {
            return "0";
        }
        char[] cArr = AbstractC2803b.f8827a;
        int i6 = 0;
        char[] cArr2 = {cArr[(i5 >> 28) & 15], cArr[(i5 >> 24) & 15], cArr[(i5 >> 20) & 15], cArr[(i5 >> 16) & 15], cArr[(i5 >> 12) & 15], cArr[(i5 >> 8) & 15], cArr[(i5 >> 4) & 15], cArr[i5 & 15]};
        while (i6 < 8 && cArr2[i6] == '0') {
            i6++;
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m397h(i6, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i6 <= 8) {
            return new String(cArr2, i6, 8 - i6);
        }
        throw new IllegalArgumentException(AbstractC0231b.m397h(i6, "startIndex: ", " > endIndex: 8"));
    }

    /* JADX INFO: renamed from: G */
    public static final long m3554G(long j5) {
        return AbstractC2352g.m4190c(Float.isNaN(C2021q.m3714b(j5)) ? 0.0f : C2021q.m3714b(j5), Float.isNaN(C2021q.m3715c(j5)) ? 0.0f : C2021q.m3715c(j5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3555H(p007B0.C0185S r11, p000A.InterfaceC0092v0 r12, p007B0.C0200n r13, p084Q2.AbstractC1176a r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1926h.m3555H(B0.S, A.v0, B0.n, Q2.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: I */
    public static final void m3556I(String str, long j5) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j5);
        }
    }

    /* JADX INFO: renamed from: J */
    public static C1804d m3557J(int i5, int i6) {
        if (i6 > Integer.MIN_VALUE) {
            return new C1804d(i5, i6 - 1, 1);
        }
        C1804d c1804d = C1804d.f6147g;
        return C1804d.f6147g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3558a(p007B0.C0185S r6, p084Q2.AbstractC1176a r7) {
        /*
            boolean r0 = r7 instanceof p058L.C0952x
            if (r0 == 0) goto L13
            r0 = r7
            L.x r0 = (p058L.C0952x) r0
            int r1 = r0.f3001i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3001i = r1
            goto L18
        L13:
            L.x r0 = new L.x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3000h
            int r1 = r0.f3001i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            B0.S r6 = r0.f2999g
            p127Z2.AbstractC1784a.m3205S(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            p127Z2.AbstractC1784a.m3205S(r7)
        L32:
            r0.f2999g = r6
            r0.f3001i = r2
            B0.o r7 = p007B0.EnumC0201o.f703e
            java.lang.Object r7 = r6.m271a(r7, r0)
            P2.a r1 = p079P2.EnumC1152a.f3788d
            if (r7 != r1) goto L41
            return r1
        L41:
            B0.n r7 = (p007B0.C0200n) r7
            java.lang.Object r1 = r7.f696a
            int r3 = r1.size()
            r4 = 0
        L4a:
            if (r4 >= r3) goto L5c
            java.lang.Object r5 = r1.get(r4)
            B0.w r5 = (p007B0.C0209w) r5
            boolean r5 = p007B0.AbstractC0208v.m311a(r5)
            if (r5 != 0) goto L59
            goto L32
        L59:
            int r4 = r4 + 1
            goto L4a
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1926h.m3558a(B0.S, Q2.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3559b(p007B0.C0185S r11, p000A.InterfaceC0092v0 r12, p007B0.C0200n r13, int r14, p084Q2.AbstractC1176a r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1926h.m3559b(B0.S, A.v0, B0.n, int, Q2.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static final void m3560c(Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AbstractC1665j.m2985e(context, "context");
        Resources resources = context.getResources();
        AbstractC1665j.m2984d(resources, "getResources(...)");
        String str = AbstractC1785a.f6098d;
        if (str != null) {
            m3561d(resources, str);
        } else {
            AbstractC1665j.m2991k("moduleApkPath");
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m3561d(Resources resources, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(resources.getAssets(), str);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m3562e(int i5, int i6, int i7, byte[] bArr, byte[] bArr2) {
        AbstractC1665j.m2985e(bArr, "a");
        AbstractC1665j.m2985e(bArr2, "b");
        for (int i8 = 0; i8 < i7; i8++) {
            if (bArr[i8 + i5] != bArr2[i8 + i6]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static String m3563f(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static final void m3564g(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("size=" + j5 + " offset=" + j6 + " byteCount=" + j7);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m3565h(int i5) {
        if (2 > i5 || i5 >= 37) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "radix ", " was not in valid range ");
            sbM404o.append(new C1804d(2, 36, 1));
            throw new IllegalArgumentException(sbM404o.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public static double m3566i(double d5, double d6, double d7) {
        if (d6 <= d7) {
            return d5 < d6 ? d6 : d5 > d7 ? d7 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d7 + " is less than minimum " + d6 + '.');
    }

    /* JADX INFO: renamed from: j */
    public static float m3567j(float f2, float f5, float f6) {
        if (f5 <= f6) {
            return f2 < f5 ? f5 : f2 > f6 ? f6 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f6 + " is less than minimum " + f5 + '.');
    }

    /* JADX INFO: renamed from: k */
    public static int m3568k(int i5, int i6, int i7) {
        if (i6 <= i7) {
            return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i7 + " is less than minimum " + i6 + '.');
    }

    /* JADX INFO: renamed from: l */
    public static long m3569l(long j5) {
        if (j5 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j5 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static long[] m3570m(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            jArr[i5] = iArr[i5];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: n */
    public static final void m3571n(int i5, int i6) {
        if (i5 <= i6) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i5 + ") is greater than size (" + i6 + ").");
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m3572o(char c5, char c6, boolean z5) {
        if (c5 == c6) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p254v4.C3356c m3573p(org.luckypray.dexkit.DexKitBridge r10, p265x4.C3456b r11) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1926h.m3573p(org.luckypray.dexkit.DexKitBridge, x4.b):v4.c");
    }

    /* JADX INFO: renamed from: q */
    public static C1705o m3574q(SSLSession sSLSession) throws IOException {
        Object objM3183j;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C1698h c1698hM3011b = C1698h.f5805b.m3011b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC1689K.f5766e.getClass();
        EnumC1689K enumC1689KM3009c = C1692b.m3009c(protocol);
        try {
            objM3183j = AbstractC1776g.m3183j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objM3183j = C0981u.f3047d;
        }
        return new C1705o(enumC1689KM3009c, c1698hM3011b, AbstractC1776g.m3183j(sSLSession.getLocalCertificates()), new C0099z(14, objM3183j));
    }

    /* JADX INFO: renamed from: r */
    public static final long m3575r(C1753n c1753n) {
        DragEvent dragEvent = (DragEvent) c1753n.f6028e;
        float x5 = dragEvent.getX();
        float y5 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x5)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: s */
    public static final int m3576s(int i5, int i6, int i7) {
        if (i7 > 0) {
            if (i5 < i6) {
                int i8 = i6 % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i5 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i6 - i10;
            }
        } else {
            if (i7 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i5 > i6) {
                int i11 = -i7;
                int i12 = i5 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i6 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i14 + i6;
            }
        }
        return i6;
    }

    /* JADX INFO: renamed from: t */
    public static final Bundle m3577t(String str, Bundle bundle) {
        AbstractC1665j.m2985e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(AbstractC0231b.m400k("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    /* JADX INFO: renamed from: u */
    public static final long m3578u(double d5) {
        return m3582y((float) d5, 4294967296L);
    }

    /* JADX INFO: renamed from: v */
    public static final long m3579v(int i5) {
        return m3582y(i5, 4294967296L);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3580w(char c5) {
        return Character.isWhitespace(c5) || Character.isSpaceChar(c5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0165, code lost:
    
        if (r3 == r13) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:98:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3581x(p007B0.C0185S r17, p154e2.C2029h r18, p049I2.C0793k r19, p007B0.C0200n r20, p084Q2.AbstractC1176a r21) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1926h.m3581x(B0.S, e2.h, I2.k, B0.n, Q2.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: y */
    public static final long m3582y(float f2, long j5) {
        long jFloatToRawIntBits = j5 | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        C2020p[] c2020pArr = C2019o.f6746b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:84:0x01e1
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p239t0.AbstractC3207b m3583z(int r46, p095T.InterfaceC1373m r47) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1926h.m3583z(int, T.m):t0.b");
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo3584C(boolean z5);

    /* JADX INFO: renamed from: D */
    public abstract void mo3585D(boolean z5);
}

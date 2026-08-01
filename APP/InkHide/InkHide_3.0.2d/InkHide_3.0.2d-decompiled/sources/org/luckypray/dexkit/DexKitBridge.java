package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import p006D.AbstractC0079h;
import p011F0.AbstractC0128p;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p035S.C0246b;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p041V.C0318k;
import p043W0.C0353a;
import p052b1.C0499d;
import p052b1.C0500e;
import p052b1.C0505j;
import p052b1.C0506k;
import p060d1.C0519a;
import p063e1.AbstractC0553a;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable, AutoCloseable {
    private long token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitBridge(String str) {
        this.token = nativeInitDexKit(str);
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long j2, byte[] bArr);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long j2, byte[] bArr);

    private static final native void nativeExportDexFile(long j2, String str);

    private static final native byte[] nativeFieldGetMethods(long j2, long j3);

    private static final native byte[] nativeFieldPutMethods(long j2, long j3);

    private static final native byte[] nativeFindClass(long j2, byte[] bArr);

    private static final native byte[] nativeFindField(long j2, byte[] bArr);

    private static final native byte[] nativeFindMethod(long j2, byte[] bArr);

    private static final native byte[] nativeGetCallMethods(long j2, long j3);

    private static final native byte[] nativeGetClassAnnotations(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassByIds(long j2, long[] jArr);

    private static final native byte[] nativeGetClassData(long j2, String str);

    private static final native int nativeGetDexNum(long j2);

    private static final native byte[] nativeGetFieldAnnotations(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldByIds(long j2, long[] jArr);

    private static final native byte[] nativeGetFieldData(long j2, String str);

    private static final native byte[] nativeGetInvokeMethods(long j2, long j3);

    private static final native byte[] nativeGetMethodAnnotations(long j2, long j3);

    private static final native byte[] nativeGetMethodByIds(long j2, long[] jArr);

    private static final native byte[] nativeGetMethodData(long j2, String str);

    private static final native int[] nativeGetMethodOpCodes(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodUsingFields(long j2, long j3);

    private static final native String[] nativeGetMethodUsingStrings(long j2, long j3);

    private static final native byte[] nativeGetParameterAnnotations(long j2, long j3);

    private static final native String[] nativeGetParameterNames(long j2, long j3);

    private static final native long nativeInitDexKit(String str);

    private static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z2);

    private static final native void nativeInitFullCache(long j2);

    private static final native void nativeRelease(long j2);

    private static final native void nativeSetThreadNum(long j2, int i2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        long j2 = this.token;
        if (j2 != 0) {
            nativeRelease(j2);
            this.token = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0500e m1441d(C0353a c0353a) {
        C0246b c0246b = new C0246b();
        c0353a.m607Y(c0246b);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindClass(m1444g(), c0246b.m469i()));
        AbstractC0223g.m417d(byteBufferWrap, "wrap(res)");
        C0519a c0519a = new C0519a();
        c0519a.m1040c(byteBufferWrap.position() + AbstractC0174d.m348d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C0500e c0500e = new C0500e();
        int iM1045h = c0519a.m1045h();
        for (int i2 = 0; i2 < iM1045h; i2++) {
            C0519a c0519aM1044g = c0519a.m1044g(i2);
            AbstractC0223g.m415b(c0519aM1044g);
            c0500e.add(AbstractC0079h.m189m(this, c0519aM1044g));
        }
        if (c0500e.size() > 1) {
            AbstractC0128p.m290d0(c0500e, new C0318k(1));
        }
        return c0500e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0506k m1442e(C0353a c0353a) {
        C0246b c0246b = new C0246b();
        c0353a.m607Y(c0246b);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindMethod(m1444g(), c0246b.m469i()));
        AbstractC0223g.m417d(byteBufferWrap, "wrap(res)");
        C0519a c0519a = new C0519a();
        c0519a.m1040c(byteBufferWrap.position() + AbstractC0174d.m348d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C0506k c0506k = new C0506k();
        int iM1039b = c0519a.m1039b(4);
        int iM1043f = iM1039b != 0 ? c0519a.m1043f(iM1039b) : 0;
        int i2 = 0;
        while (i2 < iM1043f) {
            C0519a c0519a2 = new C0519a();
            int iM1039b2 = c0519a.m1039b(4);
            if (iM1039b2 != 0) {
                int iM1038a = c0519a.m1038a((4 * i2) + c0519a.m1042e(iM1039b2));
                ByteBuffer byteBuffer = c0519a.f1664b;
                AbstractC0223g.m417d(byteBuffer, "bb");
                c0519a2.m1040c(iM1038a, byteBuffer);
            } else {
                c0519a2 = null;
            }
            AbstractC0223g.m415b(c0519a2);
            AbstractC0223g.m418e(this, "bridge");
            int iM1039b3 = c0519a2.m1039b(10);
            int i3 = iM1039b3 != 0 ? c0519a2.f1664b.getInt(iM1039b3 + c0519a2.f1663a) : 0;
            if ((i3 & 131072) > 0) {
                i3 = (i3 ^ 131072) | 32;
            }
            int i4 = i3;
            int iM1039b4 = c0519a2.m1039b(4);
            int i5 = iM1039b4 != 0 ? c0519a2.f1664b.getInt(iM1039b4 + c0519a2.f1663a) : 0;
            int iM1039b5 = c0519a2.m1039b(6);
            int i6 = iM1039b5 != 0 ? c0519a2.f1664b.getInt(iM1039b5 + c0519a2.f1663a) : 0;
            int iM1039b6 = c0519a2.m1039b(8);
            int i7 = iM1039b6 != 0 ? c0519a2.f1664b.getInt(iM1039b6 + c0519a2.f1663a) : 0;
            int iM1039b7 = c0519a2.m1039b(12);
            String strM1041d = iM1039b7 != 0 ? c0519a2.m1041d(iM1039b7 + c0519a2.f1663a) : null;
            if (strM1041d == null) {
                strM1041d = "";
            }
            String str = strM1041d;
            int iM1039b8 = c0519a2.m1039b(14);
            int i8 = iM1039b8 != 0 ? c0519a2.f1664b.getInt(iM1039b8 + c0519a2.f1663a) : 0;
            ArrayList arrayList = new ArrayList();
            int i9 = 16;
            int iM1039b9 = c0519a2.m1039b(16);
            int iM1043f2 = iM1039b9 != 0 ? c0519a2.m1043f(iM1039b9) : 0;
            int i10 = 0;
            while (i10 < iM1043f2) {
                C0519a c0519a3 = c0519a;
                int iM1039b10 = c0519a2.m1039b(i9);
                arrayList.add(Integer.valueOf(iM1039b10 != 0 ? c0519a2.f1664b.getInt((i10 * 4) + c0519a2.m1042e(iM1039b10)) : 0));
                i10++;
                c0519a = c0519a3;
                i9 = 16;
            }
            c0506k.add(new C0505j(this, i5, i6, i7, i4, str, i8, arrayList));
            i2++;
            c0519a = c0519a;
        }
        if (c0506k.size() > 1) {
            AbstractC0128p.m290d0(c0506k, new C0318k(2));
        }
        return c0506k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0499d m1443f(String str) {
        AbstractC0223g.m418e(str, "identifier");
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (str.charAt(0) != 'L') {
            str = AbstractC0174d.m353i("L", AbstractC0307q.m536f0(str, '.', '/'), ";");
        } else {
            if (str.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (str.charAt(AbstractC0299i.m515m0(str)) != ';') {
            }
        }
        AbstractC0223g.m418e(str, "descriptor");
        AbstractC0553a.m1127a(str);
        byte[] bArrNativeGetClassData = nativeGetClassData(m1444g(), str);
        if (bArrNativeGetClassData == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassData);
        AbstractC0223g.m417d(byteBufferWrap, "wrap(it)");
        C0519a c0519a = new C0519a();
        c0519a.m1040c(byteBufferWrap.position() + AbstractC0174d.m348d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        return AbstractC0079h.m189m(this, c0519a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finalize() {
        close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final long m1444g() {
        long j2 = this.token;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("DexKitBridge is not valid");
    }
}

package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC1406fG;
import p000.C0110Ch;
import p000.C0139D9;
import p000.C0764Rr;
import p000.C0807Sr;
import p000.C0963Wb;
import p000.C1117a;
import p000.C2147kh;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {
    private long token;

    public DexKitBridge(ClassLoader classLoader) {
        this.token = nativeInitDexKitByClassLoader(classLoader, true);
    }

    /* JADX INFO: renamed from: d */
    public static final long m4736d(DexKitBridge dexKitBridge) {
        long j = dexKitBridge.token;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("DexKitBridge is not valid");
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long j, byte[] bArr);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long j, byte[] bArr);

    private static final native void nativeExportDexFile(long j, String str);

    private static final native byte[] nativeFieldGetMethods(long j, long j2);

    private static final native byte[] nativeFieldPutMethods(long j, long j2);

    private static final native byte[] nativeFindClass(long j, byte[] bArr);

    private static final native byte[] nativeFindField(long j, byte[] bArr);

    private static final native byte[] nativeFindMethod(long j, byte[] bArr);

    private static final native byte[] nativeGetCallMethods(long j, long j2);

    private static final native byte[] nativeGetClassAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassByIds(long j, long[] jArr);

    private static final native byte[] nativeGetClassData(long j, String str);

    private static final native int nativeGetDexNum(long j);

    private static final native byte[] nativeGetFieldAnnotations(long j, long j2);

    private static final native byte[] nativeGetFieldByIds(long j, long[] jArr);

    private static final native byte[] nativeGetFieldData(long j, String str);

    private static final native byte[] nativeGetInvokeMethods(long j, long j2);

    private static final native byte[] nativeGetMethodAnnotations(long j, long j2);

    private static final native byte[] nativeGetMethodByIds(long j, long[] jArr);

    private static final native byte[] nativeGetMethodData(long j, String str);

    private static final native int[] nativeGetMethodOpCodes(long j, long j2);

    private static final native byte[] nativeGetMethodUsingFields(long j, long j2);

    private static final native String[] nativeGetMethodUsingStrings(long j, long j2);

    private static final native byte[] nativeGetParameterAnnotations(long j, long j2);

    private static final native String[] nativeGetParameterNames(long j, long j2);

    private static final native long nativeInitDexKit(String str);

    private static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    private static final native void nativeInitFullCache(long j);

    private static final native void nativeRelease(long j);

    private static final native void nativeSetThreadNum(long j, int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        long j = this.token;
        if (j != 0) {
            nativeRelease(j);
            this.token = 0L;
        }
    }

    public final void finalize() {
        close();
    }

    /* JADX INFO: renamed from: i */
    public final C0139D9 m4738i(C2147kh c2147kh) {
        C0110Ch c0110Ch = new C0110Ch();
        c2147kh.m4332N(c0110Ch);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindClass(m4736d(this), c0110Ch.m169h()));
        C1117a c1117a = new C1117a();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c1117a.m2034c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
        C0139D9 c0139d9 = new C0139D9();
        int iM2033b = c1117a.m2033b(4);
        int iM2037f = iM2033b != 0 ? c1117a.m2037f(iM2033b) : 0;
        for (int i = 0; i < iM2037f; i++) {
            c0139d9.add(AbstractC1406fG.m2692R(this, c1117a.m2038g(i)));
        }
        if (c0139d9.size() > 1) {
            C0963Wb c0963Wb = new C0963Wb(1);
            if (c0139d9.size() > 1) {
                Collections.sort(c0139d9, c0963Wb);
            }
        }
        return c0139d9;
    }

    /* JADX INFO: renamed from: l */
    public final C0807Sr m4739l(C2147kh c2147kh) {
        C0110Ch c0110Ch = new C0110Ch();
        c2147kh.m4332N(c0110Ch);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindMethod(m4736d(this), c0110Ch.m169h()));
        C1117a c1117a = new C1117a();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c1117a.m2034c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
        C0807Sr c0807Sr = new C0807Sr();
        int i = 4;
        int iM2033b = c1117a.m2033b(4);
        int iM2037f = iM2033b != 0 ? c1117a.m2037f(iM2033b) : 0;
        int i2 = 0;
        while (i2 < iM2037f) {
            C1117a c1117a2 = new C1117a();
            int iM2033b2 = c1117a.m2033b(i);
            if (iM2033b2 != 0) {
                c1117a2.m2034c(c1117a.m2032a((i2 * 4) + c1117a.m2036e(iM2033b2)), c1117a.f3526b);
            } else {
                c1117a2 = null;
            }
            int iM2033b3 = c1117a2.m2033b(10);
            int i3 = iM2033b3 != 0 ? c1117a2.f3526b.getInt(iM2033b3 + c1117a2.f3525a) : 0;
            if ((i3 & 131072) > 0) {
                i3 = (i3 ^ 131072) | 32;
            }
            int i4 = i3;
            int iM2033b4 = c1117a2.m2033b(i);
            int i5 = iM2033b4 != 0 ? c1117a2.f3526b.getInt(iM2033b4 + c1117a2.f3525a) : 0;
            int iM2033b5 = c1117a2.m2033b(6);
            int i6 = iM2033b5 != 0 ? c1117a2.f3526b.getInt(iM2033b5 + c1117a2.f3525a) : 0;
            int iM2033b6 = c1117a2.m2033b(8);
            int i7 = iM2033b6 != 0 ? c1117a2.f3526b.getInt(iM2033b6 + c1117a2.f3525a) : 0;
            int iM2033b7 = c1117a2.m2033b(12);
            String strM2035d = iM2033b7 != 0 ? c1117a2.m2035d(iM2033b7 + c1117a2.f3525a) : null;
            if (strM2035d == null) {
                strM2035d = "";
            }
            String str = strM2035d;
            int iM2033b8 = c1117a2.m2033b(14);
            int i8 = iM2033b8 != 0 ? c1117a2.f3526b.getInt(iM2033b8 + c1117a2.f3525a) : 0;
            ArrayList arrayList = new ArrayList();
            int iM2033b9 = c1117a2.m2033b(16);
            int iM2037f2 = iM2033b9 != 0 ? c1117a2.m2037f(iM2033b9) : 0;
            for (int i9 = 0; i9 < iM2037f2; i9++) {
                int iM2033b10 = c1117a2.m2033b(16);
                arrayList.add(Integer.valueOf(iM2033b10 != 0 ? c1117a2.f3526b.getInt((i9 * 4) + c1117a2.m2036e(iM2033b10)) : 0));
            }
            c0807Sr.add(new C0764Rr(this, i5, i6, i7, i4, str, i8, arrayList));
            i2++;
            i = 4;
        }
        if (c0807Sr.size() > 1) {
            C0963Wb c0963Wb = new C0963Wb(2);
            if (c0807Sr.size() > 1) {
                Collections.sort(c0807Sr, c0963Wb);
            }
        }
        return c0807Sr;
    }
}

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

    public DexKitBridge(ClassLoader r3) {
        this.token = nativeInitDexKitByClassLoader(r3, true);
    }

    /* JADX INFO: renamed from: d */
    public static final long m4736d(DexKitBridge r4) {
        long r0 = r4.token;
        if (r0 == 0) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("DexKitBridge is not valid");
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ byte[] m4737f(long r0, long[] r2) {
        return nativeGetClassByIds(r0, r2);
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long r0, byte[] r2);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long r0, byte[] r2);

    private static final native void nativeExportDexFile(long r0, String r2);

    private static final native byte[] nativeFieldGetMethods(long r0, long r2);

    private static final native byte[] nativeFieldPutMethods(long r0, long r2);

    private static final native byte[] nativeFindClass(long r0, byte[] r2);

    private static final native byte[] nativeFindField(long r0, byte[] r2);

    private static final native byte[] nativeFindMethod(long r0, byte[] r2);

    private static final native byte[] nativeGetCallMethods(long r0, long r2);

    private static final native byte[] nativeGetClassAnnotations(long r0, long r2);

    private static final native byte[] nativeGetClassByIds(long r0, long[] r2);

    private static final native byte[] nativeGetClassData(long r0, String r2);

    private static final native int nativeGetDexNum(long r0);

    private static final native byte[] nativeGetFieldAnnotations(long r0, long r2);

    private static final native byte[] nativeGetFieldByIds(long r0, long[] r2);

    private static final native byte[] nativeGetFieldData(long r0, String r2);

    private static final native byte[] nativeGetInvokeMethods(long r0, long r2);

    private static final native byte[] nativeGetMethodAnnotations(long r0, long r2);

    private static final native byte[] nativeGetMethodByIds(long r0, long[] r2);

    private static final native byte[] nativeGetMethodData(long r0, String r2);

    private static final native int[] nativeGetMethodOpCodes(long r0, long r2);

    private static final native byte[] nativeGetMethodUsingFields(long r0, long r2);

    private static final native String[] nativeGetMethodUsingStrings(long r0, long r2);

    private static final native byte[] nativeGetParameterAnnotations(long r0, long r2);

    private static final native String[] nativeGetParameterNames(long r0, long r2);

    private static final native long nativeInitDexKit(String r0);

    private static final native long nativeInitDexKitByBytesArray(byte[][] r0);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader r0, boolean r1);

    private static final native void nativeInitFullCache(long r0);

    private static final native void nativeRelease(long r0);

    private static final native void nativeSetThreadNum(long r0, int r2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        monitor-enter(this);
        long r0 = this.token;     // Catch: Throwable -> L7
        if (r0 == 0) goto L9;
        nativeRelease(r0);     // Catch: Throwable -> L7
        this.token = 0;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void finalize() {
        close();
    }

    /* JADX INFO: renamed from: i */
    public final C0139D9 m4738i(C2147kh r5) {
        C0110Ch r0 = new C0110Ch();
        r5.m4332N(r0);
        ByteBuffer r52 = ByteBuffer.wrap(nativeFindClass(m4736d(this), r0.m169h()));
        C1117a r02 = new C1117a();
        r52.order(ByteOrder.LITTLE_ENDIAN);
        r02.m2034c(r52.position() + r52.getInt(r52.position()), r52);
        C0139D9 r53 = new C0139D9();
        int r1 = r02.m2033b(4);
        int r2 = 0;
        if (r1 == 0) goto L5;
        int r12 = r02.m2037f(r1);
    L6:
        if (r2 >= r12) goto L9;
        r53.add(AbstractC1406fG.m2692R(this, r02.m2038g(r2)));
        r2 = r2 + 1;
        goto L6
    L9:
        if (r53.size() <= 1) goto L13;
        C0963Wb r03 = new C0963Wb(1);
        if (r53.size() <= 1) goto L13;
        Collections.sort(r53, r03);
    L13:
        return r53;
    L5:
        r12 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: l */
    public final C0807Sr m4739l(C2147kh r19) {
        C0110Ch r0 = new C0110Ch();
        r19.m4332N(r0);
        ByteBuffer r02 = ByteBuffer.wrap(nativeFindMethod(m4736d(this), r0.m169h()));
        C1117a r1 = new C1117a();
        r02.order(ByteOrder.LITTLE_ENDIAN);
        r1.m2034c(r02.position() + r02.getInt(r02.position()), r02);
        C0807Sr r03 = new C0807Sr();
        int r2 = 4;
        int r3 = r1.m2033b(4);
        if (r3 == 0) goto L5;
        int r32 = r1.m2037f(r3);
    L6:
        int r5 = 0;
    L7:
        if (r5 >= r32) goto L53;
        C1117a r6 = new C1117a();
        int r7 = r1.m2033b(r2);
        String r8 = null;
        if (r7 == 0) goto L11;
        r6.m2034c(r1.m2032a((r5 * 4) + r1.m2036e(r7)), r1.f3526b);
    L12:
        int r72 = r6.m2033b(10);
        if (r72 == 0) goto L15;
        int r73 = r6.f3526b.getInt(r72 + r6.f3525a);
    L17:
        if ((r73 & 131072) <= 0) goto L19;
        r73 = (r73 ^ 131072) | 32;
    L19:
        int r14 = r73;
        int r74 = r6.m2033b(r2);
        if (r74 == 0) goto L22;
        int r11 = r6.f3526b.getInt(r74 + r6.f3525a);
    L23:
        int r75 = r6.m2033b(6);
        if (r75 == 0) goto L26;
        int r12 = r6.f3526b.getInt(r75 + r6.f3525a);
    L27:
        int r76 = r6.m2033b(8);
        if (r76 == 0) goto L30;
        int r13 = r6.f3526b.getInt(r76 + r6.f3525a);
    L31:
        int r77 = r6.m2033b(12);
        if (r77 == 0) goto L34;
        r8 = r6.m2035d(r77 + r6.f3525a);
    L34:
        if (r8 != null) goto L36;
        r8 = "";
    L36:
        String r15 = r8;
        int r78 = r6.m2033b(14);
        if (r78 == 0) goto L39;
        int r16 = r6.f3526b.getInt(r78 + r6.f3525a);
    L40:
        ArrayList r79 = new ArrayList();
        int r9 = r6.m2033b(16);
        if (r9 == 0) goto L43;
        int r92 = r6.m2037f(r9);
    L44:
        int r10 = 0;
    L45:
        if (r10 >= r92) goto L51;
        int r22 = r6.m2033b(16);
        if (r22 == 0) goto L49;
        int r23 = r6.f3526b.getInt((r10 * 4) + r6.m2036e(r22));
    L50:
        r79.add(Integer.valueOf(r23));
        r10 = r10 + 1;
        goto L45
    L49:
        r23 = 0;
        goto L50
    L51:
        r03.add(new C0764Rr(this, r11, r12, r13, r14, r15, r16, r79));
        r5 = r5 + 1;
        r2 = 4;
        goto L7
    L43:
        r92 = 0;
        goto L44
    L39:
        r16 = 0;
        goto L40
    L30:
        r13 = 0;
        goto L31
    L26:
        r12 = 0;
        goto L27
    L22:
        r11 = 0;
        goto L23
    L15:
        r73 = 0;
        goto L17
    L11:
        r6 = null;
        goto L12
    L53:
        if (r03.size() <= 1) goto L57;
        C0963Wb r17 = new C0963Wb(2);
        if (r03.size() <= 1) goto L57;
        Collections.sort(r03, r17);
    L57:
        return r03;
    L5:
        r32 = 0;
        goto L6
    }
}

package org.luckypray.dexkit;

import ac.AbstractC0063p;
import bh.C0312a;
import ch.C0566a;
import ch.C0567b;
import ch.C0568c;
import ch.C0569d;
import ch.C0570e;
import gg.AbstractC1411g;
import java.io.Closeable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.AbstractC2407b;
import p009a9.C0031h;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p092g4.AbstractC1341a;
import p094g6.C1353a;
import p094g6.C1354b;
import p115hh.C1716a;
import p115hh.C1724i;
import p115hh.C1725j;
import p115hh.C1727l;
import p115hh.C1728m;
import p115hh.C1730o;
import p115hh.C1731p;
import p115hh.C1732q;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p143jh.C2137a;
import p143jh.C2139c;
import p143jh.C2140d;
import p143jh.C2151o;
import p143jh.C2152p;
import p173lh.C2568b;
import p173lh.C2570d;
import p218og.AbstractC3149m;
import tf.AbstractC4165l;
import tf.AbstractC4170q;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {
    public static final C0312a Companion = new C0312a();
    private long token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DexKitBridge(String str) {
        Companion.getClass();
        this.token = nativeInitDexKit(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Map<String, C1725j> batchFindClassUsingStrings$dexkit_android_release(C1354b c1354b) {
        int i9;
        c1354b.getClass();
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        byte[] bArrM3640l = c1354b.m3640l();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeBatchFindClassUsingStrings(safeToken, bArrM3640l));
        byteBufferWrap.getClass();
        C1353a.m3628a();
        int iPosition = byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN);
        int i10 = iPosition - byteBufferWrap.getInt(iPosition);
        short s10 = byteBufferWrap.getShort(i10);
        HashMap map = new HashMap();
        short s11 = 4;
        short s12 = 4 < s10 ? byteBufferWrap.getShort(i10 + 4) : (short) 0;
        if (s12 != 0) {
            int i11 = s12 + iPosition;
            i9 = byteBufferWrap.getInt(byteBufferWrap.getInt(i11) + i11);
        } else {
            i9 = 0;
        }
        int i12 = 0;
        while (i12 < i9) {
            C2137a c2137a = new C2137a();
            short s13 = s11 < s10 ? byteBufferWrap.getShort(i10 + 4) : (short) 0;
            if (s13 != 0) {
                int i13 = s13 + iPosition;
                int i14 = (i12 * 4) + byteBufferWrap.getInt(i13) + i13 + s11;
                c2137a.m3646c(byteBufferWrap.getInt(i14) + i14, byteBufferWrap);
            } else {
                c2137a = null;
            }
            c2137a.getClass();
            int iM3645b = c2137a.m3645b(s11);
            String strM3647d = iM3645b != 0 ? c2137a.m3647d(iM3645b + c2137a.f4499a) : null;
            strM3647d.getClass();
            C1725j c1725j = new C1725j();
            int iM3645b2 = c2137a.m3645b(6);
            int iM3649f = iM3645b2 != 0 ? c2137a.m3649f(iM3645b2) : 0;
            for (int i15 = 0; i15 < iM3649f; i15++) {
                C2140d c2140d = new C2140d();
                int iM3645b3 = c2137a.m3645b(6);
                if (iM3645b3 != 0) {
                    int iM3644a = c2137a.m3644a((i15 * 4) + c2137a.m3648e(iM3645b3));
                    ByteBuffer byteBuffer = c2137a.f4500b;
                    byteBuffer.getClass();
                    c2140d.m3646c(iM3644a, byteBuffer);
                } else {
                    c2140d = null;
                }
                c2140d.getClass();
                c1725j.add(AbstractC1089i.m2795v(this, c2140d));
            }
            if (c1725j.size() > 1) {
                AbstractC4170q.m8431g1(c1725j, new C0031h(1));
            }
            map.put(strM3647d, c1725j);
            i12++;
            s11 = 4;
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Map<String, C1731p> batchFindMethodUsingStrings$dexkit_android_release(C1354b c1354b) {
        int i9;
        c1354b.getClass();
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        byte[] bArrM3640l = c1354b.m3640l();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeBatchFindMethodUsingStrings(safeToken, bArrM3640l));
        byteBufferWrap.getClass();
        C1353a.m3628a();
        int iPosition = byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN);
        int i10 = iPosition - byteBufferWrap.getInt(iPosition);
        short s10 = byteBufferWrap.getShort(i10);
        HashMap map = new HashMap();
        short s11 = 4;
        short s12 = 4 < s10 ? byteBufferWrap.getShort(i10 + 4) : (short) 0;
        if (s12 != 0) {
            int i11 = s12 + iPosition;
            i9 = byteBufferWrap.getInt(byteBufferWrap.getInt(i11) + i11);
        } else {
            i9 = 0;
        }
        int i12 = 0;
        while (i12 < i9) {
            C2137a c2137a = new C2137a();
            short s13 = s11 < s10 ? byteBufferWrap.getShort(i10 + 4) : (short) 0;
            if (s13 != 0) {
                int i13 = s13 + iPosition;
                int i14 = (i12 * 4) + byteBufferWrap.getInt(i13) + i13 + s11;
                c2137a.m3646c(byteBufferWrap.getInt(i14) + i14, byteBufferWrap);
            } else {
                c2137a = null;
            }
            c2137a.getClass();
            int iM3645b = c2137a.m3645b(s11);
            String strM3647d = iM3645b != 0 ? c2137a.m3647d(iM3645b + c2137a.f4499a) : null;
            strM3647d.getClass();
            C1731p c1731p = new C1731p();
            int iM3645b2 = c2137a.m3645b(6);
            int iM3649f = iM3645b2 != 0 ? c2137a.m3649f(iM3645b2) : 0;
            for (int i15 = 0; i15 < iM3649f; i15++) {
                C2152p c2152p = new C2152p();
                int iM3645b3 = c2137a.m3645b(6);
                if (iM3645b3 != 0) {
                    int iM3644a = c2137a.m3644a((i15 * 4) + c2137a.m3648e(iM3645b3));
                    ByteBuffer byteBuffer = c2137a.f4500b;
                    byteBuffer.getClass();
                    c2152p.m3646c(iM3644a, byteBuffer);
                } else {
                    c2152p = null;
                }
                c2152p.getClass();
                c1731p.add(AbstractC1341a.m3600p(this, c2152p));
            }
            if (c1731p.size() > 1) {
                AbstractC4170q.m8431g1(c1731p, new C0031h(2));
            }
            map.put(strM3647d, c1731p);
            i12++;
            s11 = 4;
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final DexKitBridge create(ClassLoader classLoader, boolean z9) {
        Companion.getClass();
        classLoader.getClass();
        return new DexKitBridge(classLoader, z9, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1725j findClass$dexkit_android_release(C1354b c1354b) {
        c1354b.getClass();
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        byte[] bArrM3640l = c1354b.m3640l();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindClass(safeToken, bArrM3640l));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1725j c1725j = new C1725j();
        int iM5368l = c2137a.m5368l();
        for (int i9 = 0; i9 < iM5368l; i9++) {
            C2140d c2140dM5365i = c2137a.m5365i(i9);
            c2140dM5365i.getClass();
            c1725j.add(AbstractC1089i.m2795v(this, c2140dM5365i));
        }
        if (c1725j.size() > 1) {
            AbstractC4170q.m8431g1(c1725j, new C0031h(3));
        }
        return c1725j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1728m findField$dexkit_android_release(C1354b c1354b) {
        c1354b.getClass();
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        byte[] bArrM3640l = c1354b.m3640l();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindField(safeToken, bArrM3640l));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1728m c1728m = new C1728m();
        int iM3645b = c2137a.m3645b(4);
        int iM3649f = iM3645b != 0 ? c2137a.m3649f(iM3645b) : 0;
        for (int i9 = 0; i9 < iM3649f; i9++) {
            C2151o c2151oM5366j = c2137a.m5366j(i9);
            c2151oM5366j.getClass();
            c1728m.add(AbstractC1184v0.m3208r(this, c2151oM5366j));
        }
        if (c1728m.size() > 1) {
            AbstractC4170q.m8431g1(c1728m, new C0031h(4));
        }
        return c1728m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1731p findMethod$dexkit_android_release(C1354b c1354b) {
        c1354b.getClass();
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        byte[] bArrM3640l = c1354b.m3640l();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindMethod(safeToken, bArrM3640l));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1731p c1731p = new C1731p();
        int iM5369m = c2137a.m5369m();
        for (int i9 = 0; i9 < iM5369m; i9++) {
            C2152p c2152pM5371o = c2137a.m5371o(i9);
            c2152pM5371o.getClass();
            c1731p.add(AbstractC1341a.m3600p(this, c2152pM5371o));
        }
        if (c1731p.size() > 1) {
            AbstractC4170q.m8431g1(c1731p, new C0031h(5));
        }
        return c1731p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1731p getCallMethods$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetCallMethods(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1731p c1731p = new C1731p();
        int iM5369m = c2137a.m5369m();
        for (int i9 = 0; i9 < iM5369m; i9++) {
            C2152p c2152pM5371o = c2137a.m5371o(i9);
            c2152pM5371o.getClass();
            c1731p.add(AbstractC1341a.m3600p(this, c2152pM5371o));
        }
        return c1731p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<C1716a> getClassAnnotations$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetClassAnnotations(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM5367k = c2137a.m5367k();
        for (int i9 = 0; i9 < iM5367k; i9++) {
            C2139c c2139cM5363g = c2137a.m5363g(i9);
            c2139cM5363g.getClass();
            arrayList.add(AbstractC0063p.m426s(this, c2139cM5363g));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<C1716a> getFieldAnnotations$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetFieldAnnotations(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM5367k = c2137a.m5367k();
        for (int i9 = 0; i9 < iM5367k; i9++) {
            C2139c c2139cM5363g = c2137a.m5363g(i9);
            c2139cM5363g.getClass();
            arrayList.add(AbstractC0063p.m426s(this, c2139cM5363g));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1728m getFieldByIds$dexkit_android_release(long[] jArr) {
        jArr.getClass();
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetFieldByIds(safeToken, jArr));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1728m c1728m = new C1728m();
        int iM3645b = c2137a.m3645b(4);
        int iM3649f = iM3645b != 0 ? c2137a.m3649f(iM3645b) : 0;
        for (int i9 = 0; i9 < iM3649f; i9++) {
            C2151o c2151oM5366j = c2137a.m5366j(i9);
            c2151oM5366j.getClass();
            c1728m.add(AbstractC1184v0.m3208r(this, c2151oM5366j));
        }
        return c1728m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1731p getInvokeMethods$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetInvokeMethods(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1731p c1731p = new C1731p();
        int iM5369m = c2137a.m5369m();
        for (int i9 = 0; i9 < iM5369m; i9++) {
            C2152p c2152pM5371o = c2137a.m5371o(i9);
            c2152pM5371o.getClass();
            c1731p.add(AbstractC1341a.m3600p(this, c2152pM5371o));
        }
        return c1731p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<C1716a> getMethodAnnotations$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetMethodAnnotations(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM5367k = c2137a.m5367k();
        for (int i9 = 0; i9 < iM5367k; i9++) {
            C2139c c2139cM5363g = c2137a.m5363g(i9);
            c2139cM5363g.getClass();
            arrayList.add(AbstractC0063p.m426s(this, c2139cM5363g));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1731p getMethodByIds$dexkit_android_release(long[] jArr) {
        jArr.getClass();
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetMethodByIds(safeToken, jArr));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1731p c1731p = new C1731p();
        int iM5369m = c2137a.m5369m();
        for (int i9 = 0; i9 < iM5369m; i9++) {
            C2152p c2152pM5371o = c2137a.m5371o(i9);
            c2152pM5371o.getClass();
            c1731p.add(AbstractC1341a.m3600p(this, c2152pM5371o));
        }
        return c1731p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<Integer> getMethodOpCodes$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        return AbstractC4165l.m8374K0(nativeGetMethodOpCodes(safeToken, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<C1732q> getMethodUsingFields$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetMethodUsingFields(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM3645b = c2137a.m3645b(4);
        int iM3649f = iM3645b != 0 ? c2137a.m3649f(iM3645b) : 0;
        for (int i9 = 0; i9 < iM3649f; i9++) {
            C2137a c2137aM5370n = c2137a.m5370n(i9);
            c2137aM5370n.getClass();
            arrayList.add(AbstractC2043a.m5042p(this, c2137aM5370n));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> getMethodUsingStrings$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        return AbstractC4165l.m8375L0(nativeGetMethodUsingStrings(safeToken, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<List<C1716a>> getParameterAnnotations$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeGetParameterAnnotations(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM3645b = c2137a.m3645b(4);
        int iM3649f = iM3645b != 0 ? c2137a.m3649f(iM3645b) : 0;
        for (int i9 = 0; i9 < iM3649f; i9++) {
            C2137a c2137aM5364h = c2137a.m5364h(i9);
            c2137aM5364h.getClass();
            ArrayList arrayList2 = new ArrayList();
            int iM5367k = c2137aM5364h.m5367k();
            for (int i10 = 0; i10 < iM5367k; i10++) {
                C2139c c2139cM5363g = c2137aM5364h.m5363g(i10);
                c2139cM5363g.getClass();
                arrayList2.add(AbstractC0063p.m426s(this, c2139cM5363g));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> getParameterNames$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        String[] strArrNativeGetParameterNames = nativeGetParameterNames(safeToken, j3);
        if (strArrNativeGetParameterNames == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrNativeGetParameterNames.length);
        for (String str : strArrNativeGetParameterNames) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final long getSafeToken() {
        long j3 = this.token;
        if (j3 != 0) {
            return j3;
        }
        C2104o.m5276A("DexKitBridge is not valid");
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1725j getTypeByIds$dexkit_android_release(long[] jArr) {
        jArr.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(C0312a.m1230a(Companion, getSafeToken(), jArr));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1725j c1725j = new C1725j();
        int iM5368l = c2137a.m5368l();
        for (int i9 = 0; i9 < iM5368l; i9++) {
            C2140d c2140dM5365i = c2137a.m5365i(i9);
            c2140dM5365i.getClass();
            c1725j.add(AbstractC1089i.m2795v(this, c2140dM5365i));
        }
        return c1725j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeBatchFindClassUsingStrings(long j3, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeBatchFindMethodUsingStrings(long j3, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeExportDexFile(long j3, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldGetMethods(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldPutMethods(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindClass(long j3, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindField(long j3, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindMethod(long j3, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetCallMethods(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassAnnotations(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassByIds(long j3, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassData(long j3, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetDexNum(long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldAnnotations(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldByIds(long j3, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldData(long j3, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetInvokeMethods(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodAnnotations(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodByIds(long j3, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodData(long j3, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int[] nativeGetMethodOpCodes(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodUsingFields(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetMethodUsingStrings(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetParameterAnnotations(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetParameterNames(long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKit(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z9);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeInitFullCache(long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeRelease(long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetThreadNum(long j3, int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1731p readFieldMethods$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFieldGetMethods(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1731p c1731p = new C1731p();
        int iM5369m = c2137a.m5369m();
        for (int i9 = 0; i9 < iM5369m; i9++) {
            C2152p c2152pM5371o = c2137a.m5371o(i9);
            c2152pM5371o.getClass();
            c1731p.add(AbstractC1341a.m3600p(this, c2152pM5371o));
        }
        return c1731p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1731p writeFieldMethods$dexkit_android_release(long j3) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFieldPutMethods(safeToken, j3));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1731p c1731p = new C1731p();
        int iM5369m = c2137a.m5369m();
        for (int i9 = 0; i9 < iM5369m; i9++) {
            C2152p c2152pM5371o = c2137a.m5371o(i9);
            c2152pM5371o.getClass();
            c1731p.add(AbstractC1341a.m3600p(this, c2152pM5371o));
        }
        return c1731p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<String, C1725j> batchFindClassUsingStrings(C0566a c0566a) throws IllegalAccessException {
        c0566a.getClass();
        C1353a.m3628a();
        ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN).capacity();
        throw new IllegalAccessException("searchGroups not be empty");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<String, C1731p> batchFindMethodUsingStrings(C0567b c0567b) throws IllegalAccessException {
        c0567b.getClass();
        C1353a.m3628a();
        ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN).capacity();
        throw new IllegalAccessException("searchGroups not be empty");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (isValid()) {
            C0312a c0312a = Companion;
            long j3 = this.token;
            c0312a.getClass();
            nativeRelease(j3);
            this.token = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void exportDexFile(String str) {
        str.getClass();
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        nativeExportDexFile(safeToken, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finalize() {
        close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1725j findClass(C0568c c0568c) {
        c0568c.getClass();
        C1354b c1354b = new C1354b();
        c0568c.mo1577G(c1354b);
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        byte[] bArrM3640l = c1354b.m3640l();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindClass(safeToken, bArrM3640l));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1725j c1725j = new C1725j();
        int iM5368l = c2137a.m5368l();
        for (int i9 = 0; i9 < iM5368l; i9++) {
            C2140d c2140dM5365i = c2137a.m5365i(i9);
            c2140dM5365i.getClass();
            c1725j.add(AbstractC1089i.m2795v(this, c2140dM5365i));
        }
        if (c1725j.size() > 1) {
            AbstractC4170q.m8431g1(c1725j, new C0031h(3));
        }
        return c1725j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1728m findField(C0569d c0569d) {
        c0569d.getClass();
        C1354b c1354b = new C1354b();
        c0569d.mo1577G(c1354b);
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        byte[] bArrM3640l = c1354b.m3640l();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindField(safeToken, bArrM3640l));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1728m c1728m = new C1728m();
        int iM3645b = c2137a.m3645b(4);
        int iM3649f = iM3645b != 0 ? c2137a.m3649f(iM3645b) : 0;
        for (int i9 = 0; i9 < iM3649f; i9++) {
            C2151o c2151oM5366j = c2137a.m5366j(i9);
            c2151oM5366j.getClass();
            c1728m.add(AbstractC1184v0.m3208r(this, c2151oM5366j));
        }
        if (c1728m.size() > 1) {
            AbstractC4170q.m8431g1(c1728m, new C0031h(4));
        }
        return c1728m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1731p findMethod(C0570e c0570e) {
        c0570e.getClass();
        C1354b c1354b = new C1354b();
        c0570e.mo1577G(c1354b);
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        byte[] bArrM3640l = c1354b.m3640l();
        c0312a.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFindMethod(safeToken, bArrM3640l));
        byteBufferWrap.getClass();
        C2137a c2137a = new C2137a();
        c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        C1731p c1731p = new C1731p();
        int iM5369m = c2137a.m5369m();
        for (int i9 = 0; i9 < iM5369m; i9++) {
            C2152p c2152pM5371o = c2137a.m5371o(i9);
            c2152pM5371o.getClass();
            c1731p.add(AbstractC1341a.m3600p(this, c2152pM5371o));
        }
        if (c1731p.size() > 1) {
            AbstractC4170q.m8431g1(c1731p, new C0031h(5));
        }
        return c1731p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1724i getClassData(String str) {
        str.getClass();
        if (str.length() == 0) {
            C2104o.m5287l("Char sequence is empty.");
            return null;
        }
        if (str.charAt(0) != 'L' || AbstractC3149m.m6722u0(str) != ';') {
            String strReplace = str.replace('.', '/');
            strReplace.getClass();
            str = "L" + strReplace + ";";
        }
        AbstractC2407b.m5747e(str);
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        byte[] bArrNativeGetClassData = nativeGetClassData(safeToken, str);
        if (bArrNativeGetClassData == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassData);
        byteBufferWrap.getClass();
        C2140d c2140d = new C2140d();
        c2140d.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        return AbstractC1089i.m2795v(this, c2140d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getDexNum() {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        return nativeGetDexNum(safeToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1727l getFieldData(Field field) {
        field.getClass();
        LinkedHashMap linkedHashMap = AbstractC2407b.f7881a;
        StringBuilder sb2 = new StringBuilder();
        Class<?> declaringClass = field.getDeclaringClass();
        declaringClass.getClass();
        sb2.append(AbstractC2407b.m5748f(declaringClass));
        sb2.append("->");
        sb2.append(field.getName());
        sb2.append(":");
        Class<?> type = field.getType();
        type.getClass();
        sb2.append(AbstractC2407b.m5748f(type));
        return getFieldData(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1730o getMethodData(String str) {
        str.getClass();
        new C2570d(str);
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        byte[] bArrNativeGetMethodData = nativeGetMethodData(safeToken, str);
        if (bArrNativeGetMethodData == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetMethodData);
        byteBufferWrap.getClass();
        C2152p c2152p = new C2152p();
        c2152p.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        return AbstractC1341a.m3600p(this, c2152p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void initFullCache() {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        nativeInitFullCache(safeToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isValid() {
        return this.token != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setThreadNum(int i9) {
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        nativeSetThreadNum(safeToken, i9);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] (LINE:16) call: org.luckypray.dexkit.DexKitBridge.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ DexKitBridge(String str, AbstractC1411g abstractC1411g) {
        this(str);
    }

    public static final DexKitBridge create(byte[][] bArr) {
        Companion.getClass();
        bArr.getClass();
        return new DexKitBridge(bArr, (AbstractC1411g) null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 byte[][]) A[MD:(byte[][]):void (m)] (LINE:17) call: org.luckypray.dexkit.DexKitBridge.<init>(byte[][]):void type: THIS */
    public /* synthetic */ DexKitBridge(byte[][] bArr, AbstractC1411g abstractC1411g) {
        this(bArr);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.ClassLoader), (r2v0 boolean) A[MD:(java.lang.ClassLoader, boolean):void (m)] (LINE:18) call: org.luckypray.dexkit.DexKitBridge.<init>(java.lang.ClassLoader, boolean):void type: THIS */
    public /* synthetic */ DexKitBridge(ClassLoader classLoader, boolean z9, AbstractC1411g abstractC1411g) {
        this(classLoader, z9);
    }

    public static final DexKitBridge create(String str) {
        Companion.getClass();
        str.getClass();
        return new DexKitBridge(str, (AbstractC1411g) null);
    }

    private DexKitBridge(byte[][] bArr) {
        Companion.getClass();
        this.token = nativeInitDexKitByBytesArray(bArr);
    }

    private DexKitBridge(ClassLoader classLoader, boolean z9) {
        Companion.getClass();
        this.token = nativeInitDexKitByClassLoader(classLoader, z9);
    }

    private final Map<String, C1725j> batchFindClassUsingStrings(InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        C0566a c0566a = new C0566a();
        interfaceC1231l.invoke(c0566a);
        return batchFindClassUsingStrings(c0566a);
    }

    private final Map<String, C1731p> batchFindMethodUsingStrings(InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        C0567b c0567b = new C0567b();
        interfaceC1231l.invoke(c0567b);
        return batchFindMethodUsingStrings(c0567b);
    }

    public final C1730o getMethodData(Constructor<?> constructor) {
        constructor.getClass();
        LinkedHashMap linkedHashMap = AbstractC2407b.f7881a;
        StringBuilder sb2 = new StringBuilder();
        Class<?> declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        sb2.append(AbstractC2407b.m5748f(declaringClass));
        sb2.append("-><init>");
        sb2.append(AbstractC2407b.m5743a(constructor));
        return getMethodData(sb2.toString());
    }

    public final C1730o getMethodData(Method method) {
        method.getClass();
        return getMethodData(AbstractC2407b.m5744b(method));
    }

    public final C1727l getFieldData(String str) {
        str.getClass();
        new C2568b(str);
        C0312a c0312a = Companion;
        long safeToken = getSafeToken();
        c0312a.getClass();
        byte[] bArrNativeGetFieldData = nativeGetFieldData(safeToken, str);
        if (bArrNativeGetFieldData == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldData);
        byteBufferWrap.getClass();
        C2151o c2151o = new C2151o();
        c2151o.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
        return AbstractC1184v0.m3208r(this, c2151o);
    }

    private final C1725j findClass(InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        C0568c c0568c = new C0568c();
        interfaceC1231l.invoke(c0568c);
        return findClass(c0568c);
    }

    private final C1731p findMethod(InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        C0570e c0570e = new C0570e();
        interfaceC1231l.invoke(c0570e);
        return findMethod(c0570e);
    }

    private final C1728m findField(InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        C0569d c0569d = new C0569d();
        interfaceC1231l.invoke(c0569d);
        return findField(c0569d);
    }

    public final C1724i getClassData(Class<?> cls) {
        cls.getClass();
        return getClassData(AbstractC2407b.m5748f(cls));
    }
}

package org.luckypray.dexkit;

import androidx.compose.animation.C0426;
import com.google.flatbuffers.C3219;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.AbstractC4335;
import kotlin.collections.AbstractC4346;
import org.luckypray.dexkit.result.C5725;
import org.luckypray.dexkit.result.C5726;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.FieldDataList;
import org.luckypray.dexkit.result.FieldUsingType;
import org.luckypray.dexkit.result.MethodDataList;
import p007.AbstractC6136;
import p033.AbstractC6325;
import p052.InterfaceC6557;
import p175.AbstractC7738;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p368.C8956;
import p368.C8957;
import p368.C8958;
import p396.C9135;
import p396.C9136;
import p396.C9138;
import p396.C9141;
import p396.C9142;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/luckypray/dexkit/DexKitBridge;", "Ljava/io/Closeable;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ReentrantReadWriteLock f15641 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile long f15642;

    public DexKitBridge(ClassLoader classLoader) {
        this.f15642 = nativeInitDexKitByClassLoader(classLoader, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeBatchFindClassUsingStrings(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeBatchFindMethodUsingStrings(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeExportDexFile(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldGetMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldPutMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindClass(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindField(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindMethod(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetCallMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassByIds(long j, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassData(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetDexNum(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldByIds(long j, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldData(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetInvokeMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodByIds(long j, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodData(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int[] nativeGetMethodOpCodes(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodUsingFields(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetMethodUsingStrings(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetParameterAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetParameterNames(long j, long j2);

    private static final native long nativeInitDexKit(String str);

    private static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeInitFullCache(long j);

    private static final native void nativeRelease(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetMaxConcurrentQueries(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetThreadNum(long j, int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f15641;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.f15642;
            if (j == 0) {
                return;
            }
            this.f15642 = 0L;
            nativeRelease(j);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void finalize() {
        close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final MethodDataList m11034(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$readFieldMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeFieldGetMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14707 = c9138.m14707();
        for (int i = 0; i < iM14707; i++) {
            C9142 c9142M14704 = c9138.m14704(i);
            c9142M14704.getClass();
            methodDataList.add(AbstractC8189.m13687(this, c9142M14704));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final ClassDataList m11035(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getTypeByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetClassByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ClassDataList classDataList = new ClassDataList();
        int iM7302 = c9138.m7302(4);
        int iM7298 = iM7302 != 0 ? c9138.m7298(iM7302) : 0;
        for (int i = 0; i < iM7298; i++) {
            C9135 c9135M14702 = c9138.m14702(i);
            c9135M14702.getClass();
            classDataList.add(AbstractC7738.m13057(this, c9135M14702));
        }
        return classDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final /* synthetic */ Object m11036(InterfaceC6557 interfaceC6557) {
        ReentrantReadWriteLock.ReadLock lock = this.f15641.readLock();
        lock.lock();
        try {
            long j = this.f15642;
            if (j != 0) {
                return interfaceC6557.invoke(Long.valueOf(j));
            }
            throw new IllegalStateException("DexKitBridge is not valid");
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final MethodDataList m11037(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$writeFieldMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeFieldPutMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14707 = c9138.m14707();
        for (int i = 0; i < iM14707; i++) {
            C9142 c9142M14704 = c9138.m14704(i);
            c9142M14704.getClass();
            methodDataList.add(AbstractC8189.m13687(this, c9142M14704));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final MethodDataList m11038(C8956 c8956) {
        final byte[] bArrM14537 = c8956.m14537();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$findMethod$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindMethod(j, bArrM14537);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14707 = c9138.m14707();
        for (int i = 0; i < iM14707; i++) {
            C9142 c9142M14704 = c9138.m14704(i);
            c9142M14704.getClass();
            methodDataList.add(AbstractC8189.m13687(this, c9142M14704));
        }
        if (methodDataList.size() > 1) {
            AbstractC4335.m8776(methodDataList, new C0426(7));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final FieldDataList m11039(C8957 c8957) {
        final byte[] bArrM14537 = c8957.m14537();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$findField$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindField(j, bArrM14537);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        FieldDataList fieldDataList = new FieldDataList();
        int iM7302 = c9138.m7302(4);
        int iM7298 = iM7302 != 0 ? c9138.m7298(iM7302) : 0;
        for (int i = 0; i < iM7298; i++) {
            C9141 c9141M14706 = c9138.m14706(i);
            c9141M14706.getClass();
            fieldDataList.add(AbstractC8174.m13622(this, c9141M14706));
        }
        if (fieldDataList.size() > 1) {
            AbstractC4335.m8776(fieldDataList, new C0426(6));
        }
        return fieldDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final ClassDataList m11040(C8958 c8958) {
        final byte[] bArrM14537 = c8958.m14537();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$findClass$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindClass(j, bArrM14537);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ClassDataList classDataList = new ClassDataList();
        int iM7302 = c9138.m7302(4);
        int iM7298 = iM7302 != 0 ? c9138.m7298(iM7302) : 0;
        for (int i = 0; i < iM7298; i++) {
            C9135 c9135M14702 = c9138.m14702(i);
            c9135M14702.getClass();
            classDataList.add(AbstractC7738.m13057(this, c9135M14702));
        }
        if (classDataList.size() > 1) {
            AbstractC4335.m8776(classDataList, new C0426(5));
        }
        return classDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final /* synthetic */ List m11041(final long j) {
        return AbstractC4346.m8850((Object[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodUsingStrings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final String[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodUsingStrings(j2, j);
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final ArrayList m11042(final long j) {
        int i;
        FieldUsingType fieldUsingType;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodUsingFields$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodUsingFields(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C3219.m7320();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        int iPosition = byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position());
        int i2 = iPosition - byteBufferWrap.getInt(iPosition);
        short s = byteBufferWrap.getShort(i2);
        ArrayList arrayList = new ArrayList();
        short s2 = 4 < s ? byteBufferWrap.getShort(i2 + 4) : (short) 0;
        if (s2 != 0) {
            int i3 = s2 + iPosition;
            i = byteBufferWrap.getInt(byteBufferWrap.getInt(i3) + i3);
        } else {
            i = 0;
        }
        for (int i4 = 0; i4 < i; i4++) {
            C9138 c9138 = new C9138();
            short s3 = 4 < s ? byteBufferWrap.getShort(i2 + 4) : (short) 0;
            C9141 c9141 = null;
            if (s3 != 0) {
                int i5 = s3 + iPosition;
                int i6 = (i4 * 4) + byteBufferWrap.getInt(i5) + i5 + 4;
                c9138.m7301(byteBufferWrap, byteBufferWrap.getInt(i6) + i6);
            } else {
                c9138 = null;
            }
            c9138.getClass();
            C9141 c91412 = new C9141();
            int iM7302 = c9138.m7302(4);
            if (iM7302 != 0) {
                int iM7303 = c9138.m7303(iM7302 + c9138.f10850);
                ByteBuffer byteBuffer = c9138.f10849;
                byteBuffer.getClass();
                c91412.m7301(byteBuffer, iM7303);
                c9141 = c91412;
            }
            c9141.getClass();
            C5726 c5726M13622 = AbstractC8174.m13622(this, c9141);
            int iM73022 = c9138.m7302(6);
            byte b = iM73022 != 0 ? c9138.f10849.get(iM73022 + c9138.f10850) : (byte) 0;
            if (b == 1) {
                fieldUsingType = FieldUsingType.Read;
            } else {
                if (b != 2) {
                    int iM73023 = c9138.m7302(6);
                    throw new IllegalArgumentException(AbstractC6136.m11556(iM73023 != 0 ? c9138.f10849.get(iM73023 + c9138.f10850) : (byte) 0, "Unknown using type: "));
                }
                fieldUsingType = FieldUsingType.Write;
            }
            arrayList.add(new C5725(c5726M13622, fieldUsingType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final /* synthetic */ ArrayList m11043(final long j) {
        String[] strArr = (String[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getParameterNames$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final String[] invoke(long j2) {
                return DexKitBridge.nativeGetParameterNames(j2, j);
            }
        });
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final ArrayList m11044(final long j) {
        int i;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getParameterAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetParameterAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C3219.m7320();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        int iPosition = byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position());
        int i2 = iPosition - byteBufferWrap.getInt(iPosition);
        short s = byteBufferWrap.getShort(i2);
        ArrayList arrayList = new ArrayList();
        short s2 = 4 < s ? byteBufferWrap.getShort(i2 + 4) : (short) 0;
        if (s2 != 0) {
            int i3 = s2 + iPosition;
            i = byteBufferWrap.getInt(byteBufferWrap.getInt(i3) + i3);
        } else {
            i = 0;
        }
        for (int i4 = 0; i4 < i; i4++) {
            C9138 c9138 = new C9138();
            short s3 = 4 < s ? byteBufferWrap.getShort(i2 + 4) : (short) 0;
            if (s3 != 0) {
                int i5 = s3 + iPosition;
                int i6 = (i4 * 4) + byteBufferWrap.getInt(i5) + i5 + 4;
                c9138.m7301(byteBufferWrap, byteBufferWrap.getInt(i6) + i6);
            } else {
                c9138 = null;
            }
            c9138.getClass();
            ArrayList arrayList2 = new ArrayList();
            int iM7302 = c9138.m7302(4);
            int iM7298 = iM7302 != 0 ? c9138.m7298(iM7302) : 0;
            for (int i7 = 0; i7 < iM7298; i7++) {
                C9136 c9136M14703 = c9138.m14703(i7);
                c9136M14703.getClass();
                arrayList2.add(AbstractC6325.m11865(this, c9136M14703));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final MethodDataList m11045(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetMethodByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14707 = c9138.m14707();
        for (int i = 0; i < iM14707; i++) {
            C9142 c9142M14704 = c9138.m14704(i);
            c9142M14704.getClass();
            methodDataList.add(AbstractC8189.m13687(this, c9142M14704));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final /* synthetic */ List m11046(final long j) {
        return AbstractC4346.m8851((int[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodOpCodes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final int[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodOpCodes(j2, j);
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final FieldDataList m11047(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getFieldByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetFieldByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        FieldDataList fieldDataList = new FieldDataList();
        int iM7302 = c9138.m7302(4);
        int iM7298 = iM7302 != 0 ? c9138.m7298(iM7302) : 0;
        for (int i = 0; i < iM7298; i++) {
            C9141 c9141M14706 = c9138.m14706(i);
            c9141M14706.getClass();
            fieldDataList.add(AbstractC8174.m13622(this, c9141M14706));
        }
        return fieldDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final ArrayList m11048(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getFieldAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetFieldAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7302 = c9138.m7302(4);
        int iM7298 = iM7302 != 0 ? c9138.m7298(iM7302) : 0;
        for (int i = 0; i < iM7298; i++) {
            C9136 c9136M14703 = c9138.m14703(i);
            c9136M14703.getClass();
            arrayList.add(AbstractC6325.m11865(this, c9136M14703));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final ArrayList m11049(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7302 = c9138.m7302(4);
        int iM7298 = iM7302 != 0 ? c9138.m7298(iM7302) : 0;
        for (int i = 0; i < iM7298; i++) {
            C9136 c9136M14703 = c9138.m14703(i);
            c9136M14703.getClass();
            arrayList.add(AbstractC6325.m11865(this, c9136M14703));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final MethodDataList m11050(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getInvokeMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetInvokeMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14707 = c9138.m14707();
        for (int i = 0; i < iM14707; i++) {
            C9142 c9142M14704 = c9138.m14704(i);
            c9142M14704.getClass();
            methodDataList.add(AbstractC8189.m13687(this, c9142M14704));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final MethodDataList m11051(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getCallMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetCallMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14707 = c9138.m14707();
        for (int i = 0; i < iM14707; i++) {
            C9142 c9142M14704 = c9138.m14704(i);
            c9142M14704.getClass();
            methodDataList.add(AbstractC8189.m13687(this, c9142M14704));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final ArrayList m11052(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11036(new InterfaceC6557() { // from class: org.luckypray.dexkit.DexKitBridge$getClassAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetClassAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9138 c9138 = new C9138();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9138.m7301(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7302 = c9138.m7302(4);
        int iM7298 = iM7302 != 0 ? c9138.m7298(iM7302) : 0;
        for (int i = 0; i < iM7298; i++) {
            C9136 c9136M14703 = c9138.m14703(i);
            c9136M14703.getClass();
            arrayList.add(AbstractC6325.m11865(this, c9136M14703));
        }
        return arrayList;
    }

    public DexKitBridge(byte[][] bArr) {
        this.f15642 = nativeInitDexKitByBytesArray(bArr);
    }

    public DexKitBridge(String str) {
        this.f15642 = nativeInitDexKit(str);
    }
}

package org.luckypray.dexkit;

import androidx.compose.animation.C0426;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3065;
import com.google.flatbuffers.C3220;
import io.ktor.client.plugins.AbstractC3933;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.AbstractC4336;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.AbstractC5062;
import org.luckypray.dexkit.result.C5726;
import org.luckypray.dexkit.result.C5727;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.FieldDataList;
import org.luckypray.dexkit.result.FieldUsingType;
import org.luckypray.dexkit.result.MethodDataList;
import p009.AbstractC6183;
import p052.InterfaceC6558;
import p364.C8934;
import p364.C8935;
import p364.C8937;
import p364.C8940;
import p364.C8941;
import p366.C8949;
import p366.C8950;
import p366.C8951;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
    public final MethodDataList m11091(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$readFieldMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeFieldGetMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14556 = c8937.m14556();
        for (int i = 0; i < iM14556; i++) {
            C8941 c8941M14553 = c8937.m14553(i);
            c8941M14553.getClass();
            methodDataList.add(AbstractC5062.m10048(this, c8941M14553));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final ClassDataList m11092(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getTypeByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetClassByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ClassDataList classDataList = new ClassDataList();
        int iM7289 = c8937.m7289(4);
        int iM7285 = iM7289 != 0 ? c8937.m7285(iM7289) : 0;
        for (int i = 0; i < iM7285; i++) {
            C8934 c8934M14551 = c8937.m14551(i);
            c8934M14551.getClass();
            classDataList.add(AbstractC3065.m6832(this, c8934M14551));
        }
        return classDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final /* synthetic */ Object m11093(InterfaceC6558 interfaceC6558) {
        ReentrantReadWriteLock.ReadLock lock = this.f15641.readLock();
        lock.lock();
        try {
            long j = this.f15642;
            if (j != 0) {
                return interfaceC6558.invoke(Long.valueOf(j));
            }
            throw new IllegalStateException("DexKitBridge is not valid");
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final MethodDataList m11094(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$writeFieldMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeFieldPutMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14556 = c8937.m14556();
        for (int i = 0; i < iM14556; i++) {
            C8941 c8941M14553 = c8937.m14553(i);
            c8941M14553.getClass();
            methodDataList.add(AbstractC5062.m10048(this, c8941M14553));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final MethodDataList m11095(C8949 c8949) {
        final byte[] bArrM14559 = c8949.m14559();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$findMethod$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindMethod(j, bArrM14559);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14556 = c8937.m14556();
        for (int i = 0; i < iM14556; i++) {
            C8941 c8941M14553 = c8937.m14553(i);
            c8941M14553.getClass();
            methodDataList.add(AbstractC5062.m10048(this, c8941M14553));
        }
        if (methodDataList.size() > 1) {
            AbstractC4336.m8766(methodDataList, new C0426(7));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final FieldDataList m11096(C8950 c8950) {
        final byte[] bArrM14559 = c8950.m14559();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$findField$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindField(j, bArrM14559);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        FieldDataList fieldDataList = new FieldDataList();
        int iM7289 = c8937.m7289(4);
        int iM7285 = iM7289 != 0 ? c8937.m7285(iM7289) : 0;
        for (int i = 0; i < iM7285; i++) {
            C8940 c8940M14555 = c8937.m14555(i);
            c8940M14555.getClass();
            fieldDataList.add(AbstractC3933.m8321(this, c8940M14555));
        }
        if (fieldDataList.size() > 1) {
            AbstractC4336.m8766(fieldDataList, new C0426(6));
        }
        return fieldDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final ClassDataList m11097(C8951 c8951) {
        final byte[] bArrM14559 = c8951.m14559();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$findClass$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindClass(j, bArrM14559);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ClassDataList classDataList = new ClassDataList();
        int iM7289 = c8937.m7289(4);
        int iM7285 = iM7289 != 0 ? c8937.m7285(iM7289) : 0;
        for (int i = 0; i < iM7285; i++) {
            C8934 c8934M14551 = c8937.m14551(i);
            c8934M14551.getClass();
            classDataList.add(AbstractC3065.m6832(this, c8934M14551));
        }
        if (classDataList.size() > 1) {
            AbstractC4336.m8766(classDataList, new C0426(5));
        }
        return classDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final /* synthetic */ List m11098(final long j) {
        return AbstractC4347.m8846((Object[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodUsingStrings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final String[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodUsingStrings(j2, j);
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final ArrayList m11099(final long j) {
        int i;
        FieldUsingType fieldUsingType;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodUsingFields$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodUsingFields(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C3220.m7307();
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
            C8937 c8937 = new C8937();
            short s3 = 4 < s ? byteBufferWrap.getShort(i2 + 4) : (short) 0;
            C8940 c8940 = null;
            if (s3 != 0) {
                int i5 = s3 + iPosition;
                int i6 = (i4 * 4) + byteBufferWrap.getInt(i5) + i5 + 4;
                c8937.m7288(byteBufferWrap, byteBufferWrap.getInt(i6) + i6);
            } else {
                c8937 = null;
            }
            c8937.getClass();
            C8940 c89402 = new C8940();
            int iM7289 = c8937.m7289(4);
            if (iM7289 != 0) {
                int iM7290 = c8937.m7290(iM7289 + c8937.f10855);
                ByteBuffer byteBuffer = c8937.f10854;
                byteBuffer.getClass();
                c89402.m7288(byteBuffer, iM7290);
                c8940 = c89402;
            }
            c8940.getClass();
            C5727 c5727M8321 = AbstractC3933.m8321(this, c8940);
            int iM72892 = c8937.m7289(6);
            byte b = iM72892 != 0 ? c8937.f10854.get(iM72892 + c8937.f10855) : (byte) 0;
            if (b == 1) {
                fieldUsingType = FieldUsingType.Read;
            } else {
                if (b != 2) {
                    int iM72893 = c8937.m7289(6);
                    throw new IllegalArgumentException(AbstractC6183.m11588(iM72893 != 0 ? c8937.f10854.get(iM72893 + c8937.f10855) : (byte) 0, "Unknown using type: "));
                }
                fieldUsingType = FieldUsingType.Write;
            }
            arrayList.add(new C5726(c5727M8321, fieldUsingType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final /* synthetic */ ArrayList m11100(final long j) {
        String[] strArr = (String[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getParameterNames$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
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
    public final ArrayList m11101(final long j) {
        int i;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getParameterAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetParameterAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C3220.m7307();
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
            C8937 c8937 = new C8937();
            short s3 = 4 < s ? byteBufferWrap.getShort(i2 + 4) : (short) 0;
            if (s3 != 0) {
                int i5 = s3 + iPosition;
                int i6 = (i4 * 4) + byteBufferWrap.getInt(i5) + i5 + 4;
                c8937.m7288(byteBufferWrap, byteBufferWrap.getInt(i6) + i6);
            } else {
                c8937 = null;
            }
            c8937.getClass();
            ArrayList arrayList2 = new ArrayList();
            int iM7289 = c8937.m7289(4);
            int iM7285 = iM7289 != 0 ? c8937.m7285(iM7289) : 0;
            for (int i7 = 0; i7 < iM7285; i7++) {
                C8935 c8935M14552 = c8937.m14552(i7);
                c8935M14552.getClass();
                arrayList2.add(AbstractC3055.m6656(this, c8935M14552));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final MethodDataList m11102(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetMethodByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14556 = c8937.m14556();
        for (int i = 0; i < iM14556; i++) {
            C8941 c8941M14553 = c8937.m14553(i);
            c8941M14553.getClass();
            methodDataList.add(AbstractC5062.m10048(this, c8941M14553));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final /* synthetic */ List m11103(final long j) {
        return AbstractC4347.m8847((int[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodOpCodes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final int[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodOpCodes(j2, j);
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final FieldDataList m11104(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getFieldByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetFieldByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        FieldDataList fieldDataList = new FieldDataList();
        int iM7289 = c8937.m7289(4);
        int iM7285 = iM7289 != 0 ? c8937.m7285(iM7289) : 0;
        for (int i = 0; i < iM7285; i++) {
            C8940 c8940M14555 = c8937.m14555(i);
            c8940M14555.getClass();
            fieldDataList.add(AbstractC3933.m8321(this, c8940M14555));
        }
        return fieldDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final ArrayList m11105(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getFieldAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetFieldAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7289 = c8937.m7289(4);
        int iM7285 = iM7289 != 0 ? c8937.m7285(iM7289) : 0;
        for (int i = 0; i < iM7285; i++) {
            C8935 c8935M14552 = c8937.m14552(i);
            c8935M14552.getClass();
            arrayList.add(AbstractC3055.m6656(this, c8935M14552));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final ArrayList m11106(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7289 = c8937.m7289(4);
        int iM7285 = iM7289 != 0 ? c8937.m7285(iM7289) : 0;
        for (int i = 0; i < iM7285; i++) {
            C8935 c8935M14552 = c8937.m14552(i);
            c8935M14552.getClass();
            arrayList.add(AbstractC3055.m6656(this, c8935M14552));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final MethodDataList m11107(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getInvokeMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetInvokeMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14556 = c8937.m14556();
        for (int i = 0; i < iM14556; i++) {
            C8941 c8941M14553 = c8937.m14553(i);
            c8941M14553.getClass();
            methodDataList.add(AbstractC5062.m10048(this, c8941M14553));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final MethodDataList m11108(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getCallMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetCallMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM14556 = c8937.m14556();
        for (int i = 0; i < iM14556; i++) {
            C8941 c8941M14553 = c8937.m14553(i);
            c8941M14553.getClass();
            methodDataList.add(AbstractC5062.m10048(this, c8941M14553));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final ArrayList m11109(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11093(new InterfaceC6558() { // from class: org.luckypray.dexkit.DexKitBridge$getClassAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetClassAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C8937 c8937 = new C8937();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8937.m7288(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7289 = c8937.m7289(4);
        int iM7285 = iM7289 != 0 ? c8937.m7285(iM7289) : 0;
        for (int i = 0; i < iM7285; i++) {
            C8935 c8935M14552 = c8937.m14552(i);
            c8935M14552.getClass();
            arrayList.add(AbstractC3055.m6656(this, c8935M14552));
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

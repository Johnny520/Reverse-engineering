package org.luckypray.dexkit;

import androidx.compose.animation.C1272;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3897;
import com.google.flatbuffers.C4052;
import io.ktor.client.plugins.AbstractC4765;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.AbstractC5168;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.AbstractC5894;
import org.luckypray.dexkit.result.C6556;
import org.luckypray.dexkit.result.C6557;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.FieldDataList;
import org.luckypray.dexkit.result.FieldUsingType;
import org.luckypray.dexkit.result.MethodDataList;
import p025.AbstractC7012;
import p068.InterfaceC7387;
import p380.C9763;
import p380.C9764;
import p380.C9766;
import p380.C9769;
import p380.C9770;
import p382.C9778;
import p382.C9779;
import p382.C9780;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m151d2 = {"Lorg/luckypray/dexkit/DexKitBridge;", "Ljava/io/Closeable;", "dexkit-android_release"}, m152k = 1, m153mv = {1, 5, 1}, m155xi = 48)
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ReentrantReadWriteLock f15986 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile long f15987;

    public DexKitBridge(ClassLoader classLoader) {
        this.f15987 = nativeInitDexKitByClassLoader(classLoader, true);
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
        ReentrantReadWriteLock reentrantReadWriteLock = this.f15986;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.f15987;
            if (j == 0) {
                return;
            }
            this.f15987 = 0L;
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
    public final MethodDataList m11650(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$readFieldMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeFieldGetMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM15115 = c9766.m15115();
        for (int i = 0; i < iM15115; i++) {
            C9770 c9770M15112 = c9766.m15112(i);
            c9770M15112.getClass();
            methodDataList.add(AbstractC5894.m10607(this, c9770M15112));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final ClassDataList m11651(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getTypeByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetClassByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ClassDataList classDataList = new ClassDataList();
        int iM7848 = c9766.m7848(4);
        int iM7844 = iM7848 != 0 ? c9766.m7844(iM7848) : 0;
        for (int i = 0; i < iM7844; i++) {
            C9763 c9763M15110 = c9766.m15110(i);
            c9763M15110.getClass();
            classDataList.add(AbstractC3897.m7392(this, c9763M15110));
        }
        return classDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final /* synthetic */ Object m11652(InterfaceC7387 interfaceC7387) {
        ReentrantReadWriteLock.ReadLock lock = this.f15986.readLock();
        lock.lock();
        try {
            long j = this.f15987;
            if (j != 0) {
                return interfaceC7387.invoke(Long.valueOf(j));
            }
            throw new IllegalStateException("DexKitBridge is not valid");
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final MethodDataList m11653(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$writeFieldMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeFieldPutMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM15115 = c9766.m15115();
        for (int i = 0; i < iM15115; i++) {
            C9770 c9770M15112 = c9766.m15112(i);
            c9770M15112.getClass();
            methodDataList.add(AbstractC5894.m10607(this, c9770M15112));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final MethodDataList m11654(C9778 c9778) {
        final byte[] bArrM15118 = c9778.m15118();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$findMethod$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindMethod(j, bArrM15118);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM15115 = c9766.m15115();
        for (int i = 0; i < iM15115; i++) {
            C9770 c9770M15112 = c9766.m15112(i);
            c9770M15112.getClass();
            methodDataList.add(AbstractC5894.m10607(this, c9770M15112));
        }
        if (methodDataList.size() > 1) {
            AbstractC5168.m9325(methodDataList, new C1272(7));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final FieldDataList m11655(C9779 c9779) {
        final byte[] bArrM15118 = c9779.m15118();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$findField$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindField(j, bArrM15118);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        FieldDataList fieldDataList = new FieldDataList();
        int iM7848 = c9766.m7848(4);
        int iM7844 = iM7848 != 0 ? c9766.m7844(iM7848) : 0;
        for (int i = 0; i < iM7844; i++) {
            C9769 c9769M15114 = c9766.m15114(i);
            c9769M15114.getClass();
            fieldDataList.add(AbstractC4765.m8880(this, c9769M15114));
        }
        if (fieldDataList.size() > 1) {
            AbstractC5168.m9325(fieldDataList, new C1272(6));
        }
        return fieldDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final ClassDataList m11656(C9780 c9780) {
        final byte[] bArrM15118 = c9780.m15118();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$findClass$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeFindClass(j, bArrM15118);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ClassDataList classDataList = new ClassDataList();
        int iM7848 = c9766.m7848(4);
        int iM7844 = iM7848 != 0 ? c9766.m7844(iM7848) : 0;
        for (int i = 0; i < iM7844; i++) {
            C9763 c9763M15110 = c9766.m15110(i);
            c9763M15110.getClass();
            classDataList.add(AbstractC3897.m7392(this, c9763M15110));
        }
        if (classDataList.size() > 1) {
            AbstractC5168.m9325(classDataList, new C1272(5));
        }
        return classDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final /* synthetic */ List m11657(final long j) {
        return AbstractC5179.m9405((Object[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodUsingStrings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final String[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodUsingStrings(j2, j);
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final ArrayList m11658(final long j) {
        int i;
        FieldUsingType fieldUsingType;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodUsingFields$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodUsingFields(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C4052.m7866();
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
            C9766 c9766 = new C9766();
            short s3 = 4 < s ? byteBufferWrap.getShort(i2 + 4) : (short) 0;
            C9769 c9769 = null;
            if (s3 != 0) {
                int i5 = s3 + iPosition;
                int i6 = (i4 * 4) + byteBufferWrap.getInt(i5) + i5 + 4;
                c9766.m7847(byteBufferWrap, byteBufferWrap.getInt(i6) + i6);
            } else {
                c9766 = null;
            }
            c9766.getClass();
            C9769 c97692 = new C9769();
            int iM7848 = c9766.m7848(4);
            if (iM7848 != 0) {
                int iM7849 = c9766.m7849(iM7848 + c9766.f11200);
                ByteBuffer byteBuffer = c9766.f11199;
                byteBuffer.getClass();
                c97692.m7847(byteBuffer, iM7849);
                c9769 = c97692;
            }
            c9769.getClass();
            C6557 c6557M8880 = AbstractC4765.m8880(this, c9769);
            int iM78482 = c9766.m7848(6);
            byte b = iM78482 != 0 ? c9766.f11199.get(iM78482 + c9766.f11200) : (byte) 0;
            if (b == 1) {
                fieldUsingType = FieldUsingType.Read;
            } else {
                if (b != 2) {
                    int iM78483 = c9766.m7848(6);
                    throw new IllegalArgumentException(AbstractC7012.m12147(iM78483 != 0 ? c9766.f11199.get(iM78483 + c9766.f11200) : (byte) 0, "Unknown using type: "));
                }
                fieldUsingType = FieldUsingType.Write;
            }
            arrayList.add(new C6556(c6557M8880, fieldUsingType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final /* synthetic */ ArrayList m11659(final long j) {
        String[] strArr = (String[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getParameterNames$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
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
    public final ArrayList m11660(final long j) {
        int i;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getParameterAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetParameterAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C4052.m7866();
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
            C9766 c9766 = new C9766();
            short s3 = 4 < s ? byteBufferWrap.getShort(i2 + 4) : (short) 0;
            if (s3 != 0) {
                int i5 = s3 + iPosition;
                int i6 = (i4 * 4) + byteBufferWrap.getInt(i5) + i5 + 4;
                c9766.m7847(byteBufferWrap, byteBufferWrap.getInt(i6) + i6);
            } else {
                c9766 = null;
            }
            c9766.getClass();
            ArrayList arrayList2 = new ArrayList();
            int iM7848 = c9766.m7848(4);
            int iM7844 = iM7848 != 0 ? c9766.m7844(iM7848) : 0;
            for (int i7 = 0; i7 < iM7844; i7++) {
                C9764 c9764M15111 = c9766.m15111(i7);
                c9764M15111.getClass();
                arrayList2.add(AbstractC3887.m7216(this, c9764M15111));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final MethodDataList m11661(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetMethodByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM15115 = c9766.m15115();
        for (int i = 0; i < iM15115; i++) {
            C9770 c9770M15112 = c9766.m15112(i);
            c9770M15112.getClass();
            methodDataList.add(AbstractC5894.m10607(this, c9770M15112));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final /* synthetic */ List m11662(final long j) {
        return AbstractC5179.m9406((int[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodOpCodes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final int[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodOpCodes(j2, j);
            }
        }));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final FieldDataList m11663(final long[] jArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getFieldByIds$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j) {
                return DexKitBridge.nativeGetFieldByIds(j, jArr);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        FieldDataList fieldDataList = new FieldDataList();
        int iM7848 = c9766.m7848(4);
        int iM7844 = iM7848 != 0 ? c9766.m7844(iM7848) : 0;
        for (int i = 0; i < iM7844; i++) {
            C9769 c9769M15114 = c9766.m15114(i);
            c9769M15114.getClass();
            fieldDataList.add(AbstractC4765.m8880(this, c9769M15114));
        }
        return fieldDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final ArrayList m11664(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getFieldAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetFieldAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7848 = c9766.m7848(4);
        int iM7844 = iM7848 != 0 ? c9766.m7844(iM7848) : 0;
        for (int i = 0; i < iM7844; i++) {
            C9764 c9764M15111 = c9766.m15111(i);
            c9764M15111.getClass();
            arrayList.add(AbstractC3887.m7216(this, c9764M15111));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final ArrayList m11665(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getMethodAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetMethodAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7848 = c9766.m7848(4);
        int iM7844 = iM7848 != 0 ? c9766.m7844(iM7848) : 0;
        for (int i = 0; i < iM7844; i++) {
            C9764 c9764M15111 = c9766.m15111(i);
            c9764M15111.getClass();
            arrayList.add(AbstractC3887.m7216(this, c9764M15111));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final MethodDataList m11666(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getInvokeMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetInvokeMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM15115 = c9766.m15115();
        for (int i = 0; i < iM15115; i++) {
            C9770 c9770M15112 = c9766.m15112(i);
            c9770M15112.getClass();
            methodDataList.add(AbstractC5894.m10607(this, c9770M15112));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final MethodDataList m11667(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getCallMethods$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetCallMethods(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        MethodDataList methodDataList = new MethodDataList();
        int iM15115 = c9766.m15115();
        for (int i = 0; i < iM15115; i++) {
            C9770 c9770M15112 = c9766.m15112(i);
            c9770M15112.getClass();
            methodDataList.add(AbstractC5894.m10607(this, c9770M15112));
        }
        return methodDataList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final ArrayList m11668(final long j) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) m11652(new InterfaceC7387() { // from class: org.luckypray.dexkit.DexKitBridge$getClassAnnotations$res$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final byte[] invoke(long j2) {
                return DexKitBridge.nativeGetClassAnnotations(j2, j);
            }
        }));
        byteBufferWrap.getClass();
        C9766 c9766 = new C9766();
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9766.m7847(byteBufferWrap, byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()));
        ArrayList arrayList = new ArrayList();
        int iM7848 = c9766.m7848(4);
        int iM7844 = iM7848 != 0 ? c9766.m7844(iM7848) : 0;
        for (int i = 0; i < iM7844; i++) {
            C9764 c9764M15111 = c9766.m15111(i);
            c9764M15111.getClass();
            arrayList.add(AbstractC3887.m7216(this, c9764M15111));
        }
        return arrayList;
    }

    public DexKitBridge(byte[][] bArr) {
        this.f15987 = nativeInitDexKitByBytesArray(bArr);
    }

    public DexKitBridge(String str) {
        this.f15987 = nativeInitDexKit(str);
    }
}

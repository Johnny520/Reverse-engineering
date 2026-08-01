package org.luckypray.dexkit;

import java.io.Closeable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.query.BatchFindClassUsingStrings;
import org.luckypray.dexkit.query.BatchFindMethodUsingStrings;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.result.AnnotationData;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.result.FieldDataList;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.result.MethodDataList;
import org.luckypray.dexkit.result.UsingFieldData;
import org.luckypray.dexkit.schema.AnnotationMeta;
import org.luckypray.dexkit.schema.AnnotationMetaArrayHolder;
import org.luckypray.dexkit.schema.BatchClassMeta;
import org.luckypray.dexkit.schema.BatchClassMetaArrayHolder;
import org.luckypray.dexkit.schema.BatchMethodMeta;
import org.luckypray.dexkit.schema.BatchMethodMetaArrayHolder;
import org.luckypray.dexkit.schema.ClassMeta;
import org.luckypray.dexkit.schema.ClassMetaArrayHolder;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.schema.FieldMetaArrayHolder;
import org.luckypray.dexkit.schema.MethodMeta;
import org.luckypray.dexkit.schema.MethodMetaArrayHolder;
import org.luckypray.dexkit.schema.ParametersAnnotationMetaArrayHoler;
import org.luckypray.dexkit.schema.UsingFieldMeta;
import org.luckypray.dexkit.schema.UsingFieldMetaArrayHolder;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexClass;
import org.luckypray.dexkit.wrap.DexField;
import org.luckypray.dexkit.wrap.DexMethod;
import p000.AbstractC0127df;
import p000.AbstractC0201f9;
import p000.AbstractC0619pl;
import p000.C0921xc;
import p000.InterfaceC0742sw;
import p000.c50;
import p000.k41;
import p000.na1;
import p000.pf1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {
    public static final Companion Companion = new Companion(null);
    private final ReentrantReadWriteLock lifecycleLock;
    private volatile long token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DexKitBridge(String str) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = Companion.nativeInitDexKit(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Map<String, ClassDataList> batchFindClassUsingStrings(byte[] bArr) {
        byte[] bArr2 = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$batchFindClassUsingStrings$res$1(bArr));
        BatchClassMetaArrayHolder.Companion companion = BatchClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byteBufferWrap.getClass();
        BatchClassMetaArrayHolder rootAsBatchClassMetaArrayHolder = companion.getRootAsBatchClassMetaArrayHolder(byteBufferWrap);
        HashMap map = new HashMap();
        int itemsLength = rootAsBatchClassMetaArrayHolder.getItemsLength();
        for (int i = 0; i < itemsLength; i++) {
            BatchClassMeta batchClassMetaItems = rootAsBatchClassMetaArrayHolder.items(i);
            batchClassMetaItems.getClass();
            String unionKey = batchClassMetaItems.getUnionKey();
            unionKey.getClass();
            ClassDataList classDataList = new ClassDataList();
            int classesLength = batchClassMetaItems.getClassesLength();
            for (int i2 = 0; i2 < classesLength; i2++) {
                ClassData.Companion companion2 = ClassData.f8068Companion;
                ClassMeta classMetaClasses = batchClassMetaItems.classes(i2);
                classMetaClasses.getClass();
                classDataList.add(companion2.from(this, classMetaClasses));
            }
            if (classDataList.size() > 1) {
                AbstractC0127df.m688F(classDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return pf1.m3056p(((ClassData) t).getDescriptor(), ((ClassData) t2).getDescriptor());
                    }
                });
            }
            map.put(unionKey, classDataList);
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Map<String, MethodDataList> batchFindMethodUsingStrings(byte[] bArr) {
        byte[] bArr2 = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$batchFindMethodUsingStrings$res$1(bArr));
        BatchMethodMetaArrayHolder.Companion companion = BatchMethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byteBufferWrap.getClass();
        BatchMethodMetaArrayHolder rootAsBatchMethodMetaArrayHolder = companion.getRootAsBatchMethodMetaArrayHolder(byteBufferWrap);
        HashMap map = new HashMap();
        int itemsLength = rootAsBatchMethodMetaArrayHolder.getItemsLength();
        for (int i = 0; i < itemsLength; i++) {
            BatchMethodMeta batchMethodMetaItems = rootAsBatchMethodMetaArrayHolder.items(i);
            batchMethodMetaItems.getClass();
            String unionKey = batchMethodMetaItems.getUnionKey();
            unionKey.getClass();
            MethodDataList methodDataList = new MethodDataList();
            int methodsLength = batchMethodMetaItems.getMethodsLength();
            for (int i2 = 0; i2 < methodsLength; i2++) {
                MethodData.Companion companion2 = MethodData.f8070Companion;
                MethodMeta methodMetaMethods = batchMethodMetaItems.methods(i2);
                methodMetaMethods.getClass();
                methodDataList.add(companion2.from(this, methodMetaMethods));
            }
            if (methodDataList.size() > 1) {
                AbstractC0127df.m688F(methodDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return pf1.m3056p(((MethodData) t).getDescriptor(), ((MethodData) t2).getDescriptor());
                    }
                });
            }
            map.put(unionKey, methodDataList);
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final DexKitBridge create(ClassLoader classLoader, boolean z) {
        return Companion.create(classLoader, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ClassDataList findClass(byte[] bArr) {
        byte[] bArr2 = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$findClass$res$1(bArr));
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byteBufferWrap.getClass();
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i = 0; i < classesLength; i++) {
            ClassData.Companion companion2 = ClassData.f8068Companion;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i);
            classMetaClasses.getClass();
            classDataList.add(companion2.from(this, classMetaClasses));
        }
        if (classDataList.size() > 1) {
            AbstractC0127df.m688F(classDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return pf1.m3056p(((ClassData) t).getDescriptor(), ((ClassData) t2).getDescriptor());
                }
            });
        }
        return classDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final FieldDataList findField(byte[] bArr) {
        byte[] bArr2 = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$findField$res$1(bArr));
        FieldMetaArrayHolder.Companion companion = FieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byteBufferWrap.getClass();
        FieldMetaArrayHolder rootAsFieldMetaArrayHolder = companion.getRootAsFieldMetaArrayHolder(byteBufferWrap);
        FieldDataList fieldDataList = new FieldDataList();
        int fieldsLength = rootAsFieldMetaArrayHolder.getFieldsLength();
        for (int i = 0; i < fieldsLength; i++) {
            FieldData.Companion companion2 = FieldData.f8069Companion;
            FieldMeta fieldMetaFields = rootAsFieldMetaArrayHolder.fields(i);
            fieldMetaFields.getClass();
            fieldDataList.add(companion2.from(this, fieldMetaFields));
        }
        if (fieldDataList.size() > 1) {
            AbstractC0127df.m688F(fieldDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return pf1.m3056p(((FieldData) t).getDescriptor(), ((FieldData) t2).getDescriptor());
                }
            });
        }
        return fieldDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final MethodDataList findMethod(byte[] bArr) {
        byte[] bArr2 = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$findMethod$res$1(bArr));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byteBufferWrap.getClass();
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.f8070Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            methodMetaMethods.getClass();
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        if (methodDataList.size() > 1) {
            AbstractC0127df.m688F(methodDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return pf1.m3056p(((MethodData) t).getDescriptor(), ((MethodData) t2).getDescriptor());
                }
            });
        }
        return methodDataList;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKit(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeInitFullCache(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeRelease(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetMaxConcurrentQueries(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetThreadNum(long j, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <T> T withNativeWriteToken(InterfaceC0742sw interfaceC0742sw) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lifecycleLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.token;
            if (j != 0) {
                return (T) interfaceC0742sw.invoke(Long.valueOf(j));
            }
            throw new IllegalStateException("DexKitBridge is not valid");
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, ARITH, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lifecycleLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.token;
            if (j == 0) {
                return;
            }
            this.token = 0L;
            Companion.nativeRelease(j);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void exportDexFile(String str) {
        str.getClass();
        withNativeReadToken$dexkit_android_release(new C05621(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finalize() {
        close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodDataList getCallMethods$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getCallMethods$res$1(j));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.f8070Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            methodMetaMethods.getClass();
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ List getClassAnnotations$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getClassAnnotations$res$1(j));
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i = 0; i < annotationsLength; i++) {
            AnnotationData.Companion companion2 = AnnotationData.f8064Companion;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i);
            annotationMetaAnnotations.getClass();
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassData getClassData(String str) {
        str.getClass();
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (str.charAt(0) != 'L' || k41.m1770b0(str) != ';') {
            String strReplace = str.replace('.', '/');
            strReplace.getClass();
            str = "L" + strReplace + ";";
        }
        new DexClass(str);
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new C05631(str));
        if (bArr == null) {
            return null;
        }
        ClassData.Companion companion = ClassData.f8068Companion;
        ClassMeta.Companion companion2 = ClassMeta.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        return companion.from(this, companion2.getRootAsClassMeta(byteBufferWrap));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getDexNum() {
        return ((Number) withNativeReadToken$dexkit_android_release(C05641.INSTANCE)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ List getFieldAnnotations$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getFieldAnnotations$res$1(j));
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i = 0; i < annotationsLength; i++) {
            AnnotationData.Companion companion2 = AnnotationData.f8064Companion;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i);
            annotationMetaAnnotations.getClass();
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ FieldDataList getFieldByIds$dexkit_android_release(long[] jArr) {
        jArr.getClass();
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getFieldByIds$res$1(jArr));
        FieldMetaArrayHolder.Companion companion = FieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        FieldMetaArrayHolder rootAsFieldMetaArrayHolder = companion.getRootAsFieldMetaArrayHolder(byteBufferWrap);
        FieldDataList fieldDataList = new FieldDataList();
        int fieldsLength = rootAsFieldMetaArrayHolder.getFieldsLength();
        for (int i = 0; i < fieldsLength; i++) {
            FieldData.Companion companion2 = FieldData.f8069Companion;
            FieldMeta fieldMetaFields = rootAsFieldMetaArrayHolder.fields(i);
            fieldMetaFields.getClass();
            fieldDataList.add(companion2.from(this, fieldMetaFields));
        }
        return fieldDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldData getFieldData(String str) {
        str.getClass();
        new DexField(str);
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new C05651(str));
        if (bArr == null) {
            return null;
        }
        FieldData.Companion companion = FieldData.f8069Companion;
        FieldMeta.Companion companion2 = FieldMeta.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        return companion.from(this, companion2.getRootAsFieldMeta(byteBufferWrap));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodDataList getInvokeMethods$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getInvokeMethods$res$1(j));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.f8070Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            methodMetaMethods.getClass();
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ List getMethodAnnotations$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodAnnotations$res$1(j));
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i = 0; i < annotationsLength; i++) {
            AnnotationData.Companion companion2 = AnnotationData.f8064Companion;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i);
            annotationMetaAnnotations.getClass();
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodDataList getMethodByIds$dexkit_android_release(long[] jArr) {
        jArr.getClass();
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodByIds$res$1(jArr));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.f8070Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            methodMetaMethods.getClass();
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodData getMethodData(String str) {
        str.getClass();
        new DexMethod(str);
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new C05661(str));
        if (bArr == null) {
            return null;
        }
        MethodData.Companion companion = MethodData.f8070Companion;
        MethodMeta.Companion companion2 = MethodMeta.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        return companion.from(this, companion2.getRootAsMethodMeta(byteBufferWrap));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ List getMethodOpCodes$dexkit_android_release(long j) {
        return AbstractC0201f9.m1068n0((int[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodOpCodes$1(j)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ List getMethodUsingFields$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodUsingFields$res$1(j));
        UsingFieldMetaArrayHolder.Companion companion = UsingFieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        UsingFieldMetaArrayHolder rootAsUsingFieldMetaArrayHolder = companion.getRootAsUsingFieldMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int itemsLength = rootAsUsingFieldMetaArrayHolder.getItemsLength();
        for (int i = 0; i < itemsLength; i++) {
            UsingFieldData.Companion companion2 = UsingFieldData.f8071Companion;
            UsingFieldMeta usingFieldMetaItems = rootAsUsingFieldMetaArrayHolder.items(i);
            usingFieldMetaItems.getClass();
            arrayList.add(companion2.from(this, usingFieldMetaItems));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ List getMethodUsingStrings$dexkit_android_release(long j) {
        return AbstractC0201f9.m1069o0((Object[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodUsingStrings$1(j)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ List getParameterAnnotations$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getParameterAnnotations$res$1(j));
        ParametersAnnotationMetaArrayHoler.Companion companion = ParametersAnnotationMetaArrayHoler.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        ParametersAnnotationMetaArrayHoler rootAsParametersAnnotationMetaArrayHoler = companion.getRootAsParametersAnnotationMetaArrayHoler(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsArrayLength = rootAsParametersAnnotationMetaArrayHoler.getAnnotationsArrayLength();
        for (int i = 0; i < annotationsArrayLength; i++) {
            AnnotationMetaArrayHolder annotationMetaArrayHolderAnnotationsArray = rootAsParametersAnnotationMetaArrayHoler.annotationsArray(i);
            annotationMetaArrayHolderAnnotationsArray.getClass();
            ArrayList arrayList2 = new ArrayList();
            int annotationsLength = annotationMetaArrayHolderAnnotationsArray.getAnnotationsLength();
            for (int i2 = 0; i2 < annotationsLength; i2++) {
                AnnotationData.Companion companion2 = AnnotationData.f8064Companion;
                AnnotationMeta annotationMetaAnnotations = annotationMetaArrayHolderAnnotationsArray.annotations(i2);
                annotationMetaAnnotations.getClass();
                arrayList2.add(companion2.from(this, annotationMetaAnnotations));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ List getParameterNames$dexkit_android_release(long j) {
        String[] strArr = (String[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getParameterNames$1(j));
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ClassDataList getTypeByIds$dexkit_android_release(long[] jArr) {
        jArr.getClass();
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getTypeByIds$res$1(jArr));
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i = 0; i < classesLength; i++) {
            ClassData.Companion companion2 = ClassData.f8068Companion;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i);
            classMetaClasses.getClass();
            classDataList.add(companion2.from(this, classMetaClasses));
        }
        return classDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void initFullCache() {
        withNativeReadToken$dexkit_android_release(C05671.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isValid() {
        return this.token != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodDataList readFieldMethods$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$readFieldMethods$res$1(j));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.f8070Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            methodMetaMethods.getClass();
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMaxConcurrentQueries(int i) {
        if (i >= 0) {
            withNativeWriteToken(new C05682(i));
        } else {
            C0921xc.m5131l("maxConcurrentQueries must be >= 0");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setThreadNum(int i) {
        if (i > 0) {
            withNativeWriteToken(new C05692(i));
        } else {
            C0921xc.m5131l("threadNum must be > 0");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ Object withNativeReadToken$dexkit_android_release(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.lifecycleLock.readLock();
        lock.lock();
        try {
            long j = this.token;
            if (j != 0) {
                return interfaceC0742sw.invoke(Long.valueOf(j));
            }
            throw new IllegalStateException("DexKitBridge is not valid");
        } finally {
            lock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodDataList writeFieldMethods$dexkit_android_release(long j) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$writeFieldMethods$res$1(j));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.f8070Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            methodMetaMethods.getClass();
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.DexKitBridge.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeBatchFindClassUsingStrings(long j, byte[] bArr) {
            return DexKitBridge.nativeBatchFindClassUsingStrings(j, bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeBatchFindMethodUsingStrings(long j, byte[] bArr) {
            return DexKitBridge.nativeBatchFindMethodUsingStrings(j, bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeExportDexFile(long j, String str) {
            DexKitBridge.nativeExportDexFile(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFieldGetMethods(long j, long j2) {
            return DexKitBridge.nativeFieldGetMethods(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFieldPutMethods(long j, long j2) {
            return DexKitBridge.nativeFieldPutMethods(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFindClass(long j, byte[] bArr) {
            return DexKitBridge.nativeFindClass(j, bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFindField(long j, byte[] bArr) {
            return DexKitBridge.nativeFindField(j, bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFindMethod(long j, byte[] bArr) {
            return DexKitBridge.nativeFindMethod(j, bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetCallMethods(long j, long j2) {
            return DexKitBridge.nativeGetCallMethods(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetClassAnnotations(long j, long j2) {
            return DexKitBridge.nativeGetClassAnnotations(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetClassByIds(long j, long[] jArr) {
            return DexKitBridge.nativeGetClassByIds(j, jArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetClassData(long j, String str) {
            return DexKitBridge.nativeGetClassData(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeGetDexNum(long j) {
            return DexKitBridge.nativeGetDexNum(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetFieldAnnotations(long j, long j2) {
            return DexKitBridge.nativeGetFieldAnnotations(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetFieldByIds(long j, long[] jArr) {
            return DexKitBridge.nativeGetFieldByIds(j, jArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetFieldData(long j, String str) {
            return DexKitBridge.nativeGetFieldData(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetInvokeMethods(long j, long j2) {
            return DexKitBridge.nativeGetInvokeMethods(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetMethodAnnotations(long j, long j2) {
            return DexKitBridge.nativeGetMethodAnnotations(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetMethodByIds(long j, long[] jArr) {
            return DexKitBridge.nativeGetMethodByIds(j, jArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetMethodData(long j, String str) {
            return DexKitBridge.nativeGetMethodData(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final int[] nativeGetMethodOpCodes(long j, long j2) {
            return DexKitBridge.nativeGetMethodOpCodes(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetMethodUsingFields(long j, long j2) {
            return DexKitBridge.nativeGetMethodUsingFields(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final String[] nativeGetMethodUsingStrings(long j, long j2) {
            return DexKitBridge.nativeGetMethodUsingStrings(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetParameterAnnotations(long j, long j2) {
            return DexKitBridge.nativeGetParameterAnnotations(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final String[] nativeGetParameterNames(long j, long j2) {
            return DexKitBridge.nativeGetParameterNames(j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final long nativeInitDexKit(String str) {
            return DexKitBridge.nativeInitDexKit(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final long nativeInitDexKitByBytesArray(byte[][] bArr) {
            return DexKitBridge.nativeInitDexKitByBytesArray(bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z) {
            return DexKitBridge.nativeInitDexKitByClassLoader(classLoader, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeInitFullCache(long j) {
            DexKitBridge.nativeInitFullCache(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeRelease(long j) {
            DexKitBridge.nativeRelease(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSetMaxConcurrentQueries(long j, int i) {
            DexKitBridge.nativeSetMaxConcurrentQueries(j, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSetThreadNum(long j, int i) {
            DexKitBridge.nativeSetThreadNum(j, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexKitBridge create(ClassLoader classLoader, boolean z) {
            classLoader.getClass();
            AbstractC0619pl abstractC0619pl = null;
            try {
                if (Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoader)) {
                    return new DexKitBridge(classLoader, z, abstractC0619pl);
                }
                C0921xc.m5134o("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                return null;
            } catch (ClassNotFoundException unused) {
                C0921xc.m5134o("This method requires Android runtime");
                return null;
            }
        }

        private Companion() {
        }

        public final DexKitBridge create(byte[][] bArr) {
            bArr.getClass();
            return new DexKitBridge(bArr, (AbstractC0619pl) null);
        }

        public final DexKitBridge create(String str) {
            str.getClass();
            return new DexKitBridge(str, (AbstractC0619pl) null);
        }
    }

    public static final DexKitBridge create(String str) {
        return Companion.create(str);
    }

    public static final DexKitBridge create(byte[][] bArr) {
        return Companion.create(bArr);
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getClassData$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05631 extends c50 implements InterfaceC0742sw {
        final /* synthetic */ String $descriptor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05631(String str) {
            super(1);
            this.$descriptor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.InterfaceC0742sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }

        public final byte[] invoke(long j) {
            return DexKitBridge.Companion.nativeGetClassData(j, this.$descriptor);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getDexNum$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05641 extends c50 implements InterfaceC0742sw {
        public static final C05641 INSTANCE = new C05641();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C05641() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Integer invoke(long j) {
            return Integer.valueOf(DexKitBridge.Companion.nativeGetDexNum(j));
        }

        @Override // p000.InterfaceC0742sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getFieldData$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05651 extends c50 implements InterfaceC0742sw {
        final /* synthetic */ String $descriptor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05651(String str) {
            super(1);
            this.$descriptor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.InterfaceC0742sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }

        public final byte[] invoke(long j) {
            return DexKitBridge.Companion.nativeGetFieldData(j, this.$descriptor);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getMethodData$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05661 extends c50 implements InterfaceC0742sw {
        final /* synthetic */ String $descriptor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05661(String str) {
            super(1);
            this.$descriptor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.InterfaceC0742sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }

        public final byte[] invoke(long j) {
            return DexKitBridge.Companion.nativeGetMethodData(j, this.$descriptor);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$exportDexFile$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05621 extends c50 implements InterfaceC0742sw {
        final /* synthetic */ String $outPath;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05621(String str) {
            super(1);
            this.$outPath = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.InterfaceC0742sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return na1.f4229a;
        }

        public final void invoke(long j) {
            DexKitBridge.Companion.nativeExportDexFile(j, this.$outPath);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$initFullCache$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05671 extends c50 implements InterfaceC0742sw {
        public static final C05671 INSTANCE = new C05671();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C05671() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.InterfaceC0742sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return na1.f4229a;
        }

        public final void invoke(long j) {
            DexKitBridge.Companion.nativeInitFullCache(j);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$setMaxConcurrentQueries$2 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05682 extends c50 implements InterfaceC0742sw {
        final /* synthetic */ int $maxConcurrentQueries;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05682(int i) {
            super(1);
            this.$maxConcurrentQueries = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.InterfaceC0742sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return na1.f4229a;
        }

        public final void invoke(long j) {
            DexKitBridge.Companion.nativeSetMaxConcurrentQueries(j, this.$maxConcurrentQueries);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$setThreadNum$2 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05692 extends c50 implements InterfaceC0742sw {
        final /* synthetic */ int $num;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05692(int i) {
            super(1);
            this.$num = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.InterfaceC0742sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return na1.f4229a;
        }

        public final void invoke(long j) {
            DexKitBridge.Companion.nativeSetThreadNum(j, this.$num);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] (LINE:20) call: org.luckypray.dexkit.DexKitBridge.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ DexKitBridge(String str, AbstractC0619pl abstractC0619pl) {
        this(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 byte[][]) A[MD:(byte[][]):void (m)] (LINE:21) call: org.luckypray.dexkit.DexKitBridge.<init>(byte[][]):void type: THIS */
    public /* synthetic */ DexKitBridge(byte[][] bArr, AbstractC0619pl abstractC0619pl) {
        this(bArr);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.ClassLoader), (r2v0 boolean) A[MD:(java.lang.ClassLoader, boolean):void (m)] (LINE:22) call: org.luckypray.dexkit.DexKitBridge.<init>(java.lang.ClassLoader, boolean):void type: THIS */
    public /* synthetic */ DexKitBridge(ClassLoader classLoader, boolean z, AbstractC0619pl abstractC0619pl) {
        this(classLoader, z);
    }

    private DexKitBridge(byte[][] bArr) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = Companion.nativeInitDexKitByBytesArray(bArr);
    }

    private DexKitBridge(ClassLoader classLoader, boolean z) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = Companion.nativeInitDexKitByClassLoader(classLoader, z);
    }

    public final FieldData getFieldData(Field field) {
        field.getClass();
        return getFieldData(DexSignUtil.getDescriptor(field));
    }

    public final MethodData getMethodData(Constructor<?> constructor) {
        constructor.getClass();
        return getMethodData(DexSignUtil.getDescriptor(constructor));
    }

    public final MethodData getMethodData(Method method) {
        method.getClass();
        return getMethodData(DexSignUtil.getDescriptor(method));
    }

    public final /* synthetic */ ClassDataList findClass(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FindClass findClass = new FindClass();
        interfaceC0742sw.invoke(findClass);
        return findClass(findClass);
    }

    public final /* synthetic */ FieldDataList findField(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FindField findField = new FindField();
        interfaceC0742sw.invoke(findField);
        return findField(findField);
    }

    public final /* synthetic */ MethodDataList findMethod(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FindMethod findMethod = new FindMethod();
        interfaceC0742sw.invoke(findMethod);
        return findMethod(findMethod);
    }

    public final ClassDataList findClass(FindClass findClass) {
        findClass.getClass();
        return findClass(findClass.serializedBytes$dexkit_android_release());
    }

    public final FieldDataList findField(FindField findField) {
        findField.getClass();
        return findField(findField.serializedBytes$dexkit_android_release());
    }

    public final MethodDataList findMethod(FindMethod findMethod) {
        findMethod.getClass();
        return findMethod(findMethod.serializedBytes$dexkit_android_release());
    }

    public final /* synthetic */ Map batchFindClassUsingStrings(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
        interfaceC0742sw.invoke(batchFindClassUsingStrings);
        return batchFindClassUsingStrings(batchFindClassUsingStrings);
    }

    public final /* synthetic */ Map batchFindMethodUsingStrings(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
        interfaceC0742sw.invoke(batchFindMethodUsingStrings);
        return batchFindMethodUsingStrings(batchFindMethodUsingStrings);
    }

    public final Map<String, ClassDataList> batchFindClassUsingStrings(BatchFindClassUsingStrings batchFindClassUsingStrings) {
        batchFindClassUsingStrings.getClass();
        return batchFindClassUsingStrings(batchFindClassUsingStrings.serializedBytes$dexkit_android_release());
    }

    public final Map<String, MethodDataList> batchFindMethodUsingStrings(BatchFindMethodUsingStrings batchFindMethodUsingStrings) {
        batchFindMethodUsingStrings.getClass();
        return batchFindMethodUsingStrings(batchFindMethodUsingStrings.serializedBytes$dexkit_android_release());
    }

    public final ClassData getClassData(Class<?> cls) {
        cls.getClass();
        return getClassData(DexSignUtil.getDescriptor(cls));
    }
}

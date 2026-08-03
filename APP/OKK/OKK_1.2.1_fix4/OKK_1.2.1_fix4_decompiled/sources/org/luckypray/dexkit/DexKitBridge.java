package org.luckypray.dexkit;

import com.google.flatbuffers.C0733b;
import java.io.Closeable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
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
import p009E0.AbstractC0179j;
import p009E0.AbstractC0187r;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {
    public static final Companion Companion = new Companion(null);
    private long token;

    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeBatchFindClassUsingStrings(long j2, byte[] bArr) {
            return DexKitBridge.nativeBatchFindClassUsingStrings(j2, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeBatchFindMethodUsingStrings(long j2, byte[] bArr) {
            return DexKitBridge.nativeBatchFindMethodUsingStrings(j2, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeExportDexFile(long j2, String str) {
            DexKitBridge.nativeExportDexFile(j2, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFieldGetMethods(long j2, long j3) {
            return DexKitBridge.nativeFieldGetMethods(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFieldPutMethods(long j2, long j3) {
            return DexKitBridge.nativeFieldPutMethods(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFindClass(long j2, byte[] bArr) {
            return DexKitBridge.nativeFindClass(j2, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFindField(long j2, byte[] bArr) {
            return DexKitBridge.nativeFindField(j2, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeFindMethod(long j2, byte[] bArr) {
            return DexKitBridge.nativeFindMethod(j2, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetCallMethods(long j2, long j3) {
            return DexKitBridge.nativeGetCallMethods(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetClassAnnotations(long j2, long j3) {
            return DexKitBridge.nativeGetClassAnnotations(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetClassByIds(long j2, long[] jArr) {
            return DexKitBridge.nativeGetClassByIds(j2, jArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetClassData(long j2, String str) {
            return DexKitBridge.nativeGetClassData(j2, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeGetDexNum(long j2) {
            return DexKitBridge.nativeGetDexNum(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetFieldAnnotations(long j2, long j3) {
            return DexKitBridge.nativeGetFieldAnnotations(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetFieldByIds(long j2, long[] jArr) {
            return DexKitBridge.nativeGetFieldByIds(j2, jArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetFieldData(long j2, String str) {
            return DexKitBridge.nativeGetFieldData(j2, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetInvokeMethods(long j2, long j3) {
            return DexKitBridge.nativeGetInvokeMethods(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetMethodAnnotations(long j2, long j3) {
            return DexKitBridge.nativeGetMethodAnnotations(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetMethodByIds(long j2, long[] jArr) {
            return DexKitBridge.nativeGetMethodByIds(j2, jArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetMethodData(long j2, String str) {
            return DexKitBridge.nativeGetMethodData(j2, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] nativeGetMethodOpCodes(long j2, long j3) {
            return DexKitBridge.nativeGetMethodOpCodes(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetMethodUsingFields(long j2, long j3) {
            return DexKitBridge.nativeGetMethodUsingFields(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String[] nativeGetMethodUsingStrings(long j2, long j3) {
            return DexKitBridge.nativeGetMethodUsingStrings(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] nativeGetParameterAnnotations(long j2, long j3) {
            return DexKitBridge.nativeGetParameterAnnotations(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String[] nativeGetParameterNames(long j2, long j3) {
            return DexKitBridge.nativeGetParameterNames(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long nativeInitDexKit(String str) {
            return DexKitBridge.nativeInitDexKit(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long nativeInitDexKitByBytesArray(byte[][] bArr) {
            return DexKitBridge.nativeInitDexKitByBytesArray(bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z2) {
            return DexKitBridge.nativeInitDexKitByClassLoader(classLoader, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeInitFullCache(long j2) {
            DexKitBridge.nativeInitFullCache(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeRelease(long j2) {
            DexKitBridge.nativeRelease(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSetThreadNum(long j2, int i2) {
            DexKitBridge.nativeSetThreadNum(j2, i2);
        }

        public final DexKitBridge create(String str) {
            AbstractC0307g.m703e(str, "apkPath");
            return new DexKitBridge(str, (AbstractC0304d) null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final DexKitBridge create(byte[][] bArr) {
            AbstractC0307g.m703e(bArr, "dexBytesArray");
            return new DexKitBridge(bArr, (AbstractC0304d) null);
        }

        public final DexKitBridge create(ClassLoader classLoader, boolean z2) {
            AbstractC0307g.m703e(classLoader, "loader");
            return new DexKitBridge(classLoader, z2, null);
        }
    }

    public /* synthetic */ DexKitBridge(ClassLoader classLoader, boolean z2, AbstractC0304d abstractC0304d) {
        this(classLoader, z2);
    }

    private final Map<String, ClassDataList> batchFindClassUsingStrings$dexkit_android_release(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        byte[] bArrNativeBatchFindClassUsingStrings = Companion.nativeBatchFindClassUsingStrings(getSafeToken(), c0733b.m1934q());
        BatchClassMetaArrayHolder.Companion companion = BatchClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeBatchFindClassUsingStrings);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        BatchClassMetaArrayHolder rootAsBatchClassMetaArrayHolder = companion.getRootAsBatchClassMetaArrayHolder(byteBufferWrap);
        HashMap map = new HashMap();
        int itemsLength = rootAsBatchClassMetaArrayHolder.getItemsLength();
        for (int i2 = 0; i2 < itemsLength; i2++) {
            BatchClassMeta batchClassMetaItems = rootAsBatchClassMetaArrayHolder.items(i2);
            AbstractC0307g.m700b(batchClassMetaItems);
            String unionKey = batchClassMetaItems.getUnionKey();
            AbstractC0307g.m700b(unionKey);
            ClassDataList classDataList = new ClassDataList();
            int classesLength = batchClassMetaItems.getClassesLength();
            for (int i3 = 0; i3 < classesLength; i3++) {
                ClassData.Companion companion2 = ClassData.f4419Companion;
                ClassMeta classMetaClasses = batchClassMetaItems.classes(i3);
                AbstractC0307g.m700b(classMetaClasses);
                classDataList.add(companion2.from(this, classMetaClasses));
            }
            if (classDataList.size() > 1) {
                AbstractC0187r.m560l0(classDataList, new DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1());
            }
            map.put(unionKey, classDataList);
        }
        return map;
    }

    private final Map<String, MethodDataList> batchFindMethodUsingStrings$dexkit_android_release(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        byte[] bArrNativeBatchFindMethodUsingStrings = Companion.nativeBatchFindMethodUsingStrings(getSafeToken(), c0733b.m1934q());
        BatchMethodMetaArrayHolder.Companion companion = BatchMethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeBatchFindMethodUsingStrings);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        BatchMethodMetaArrayHolder rootAsBatchMethodMetaArrayHolder = companion.getRootAsBatchMethodMetaArrayHolder(byteBufferWrap);
        HashMap map = new HashMap();
        int itemsLength = rootAsBatchMethodMetaArrayHolder.getItemsLength();
        for (int i2 = 0; i2 < itemsLength; i2++) {
            BatchMethodMeta batchMethodMetaItems = rootAsBatchMethodMetaArrayHolder.items(i2);
            AbstractC0307g.m700b(batchMethodMetaItems);
            String unionKey = batchMethodMetaItems.getUnionKey();
            AbstractC0307g.m700b(unionKey);
            MethodDataList methodDataList = new MethodDataList();
            int methodsLength = batchMethodMetaItems.getMethodsLength();
            for (int i3 = 0; i3 < methodsLength; i3++) {
                MethodData.Companion companion2 = MethodData.f4421Companion;
                MethodMeta methodMetaMethods = batchMethodMetaItems.methods(i3);
                AbstractC0307g.m700b(methodMetaMethods);
                methodDataList.add(companion2.from(this, methodMetaMethods));
            }
            if (methodDataList.size() > 1) {
                AbstractC0187r.m560l0(methodDataList, new DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1());
            }
            map.put(unionKey, methodDataList);
        }
        return map;
    }

    public static final DexKitBridge create(ClassLoader classLoader, boolean z2) {
        return Companion.create(classLoader, z2);
    }

    private final ClassDataList findClass$dexkit_android_release(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        byte[] bArrNativeFindClass = Companion.nativeFindClass(getSafeToken(), c0733b.m1934q());
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i2 = 0; i2 < classesLength; i2++) {
            ClassData.Companion companion2 = ClassData.f4419Companion;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i2);
            AbstractC0307g.m700b(classMetaClasses);
            classDataList.add(companion2.from(this, classMetaClasses));
        }
        if (classDataList.size() > 1) {
            AbstractC0187r.m560l0(classDataList, new DexKitBridge$findClass$$inlined$sortBy$1());
        }
        return classDataList;
    }

    private final FieldDataList findField$dexkit_android_release(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        byte[] bArrNativeFindField = Companion.nativeFindField(getSafeToken(), c0733b.m1934q());
        FieldMetaArrayHolder.Companion companion = FieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindField);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        FieldMetaArrayHolder rootAsFieldMetaArrayHolder = companion.getRootAsFieldMetaArrayHolder(byteBufferWrap);
        FieldDataList fieldDataList = new FieldDataList();
        int fieldsLength = rootAsFieldMetaArrayHolder.getFieldsLength();
        for (int i2 = 0; i2 < fieldsLength; i2++) {
            FieldData.Companion companion2 = FieldData.f4420Companion;
            FieldMeta fieldMetaFields = rootAsFieldMetaArrayHolder.fields(i2);
            AbstractC0307g.m700b(fieldMetaFields);
            fieldDataList.add(companion2.from(this, fieldMetaFields));
        }
        if (fieldDataList.size() > 1) {
            AbstractC0187r.m560l0(fieldDataList, new DexKitBridge$findField$$inlined$sortBy$1());
        }
        return fieldDataList;
    }

    private final MethodDataList findMethod$dexkit_android_release(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        byte[] bArrNativeFindMethod = Companion.nativeFindMethod(getSafeToken(), c0733b.m1934q());
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i2 = 0; i2 < methodsLength; i2++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i2);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        if (methodDataList.size() > 1) {
            AbstractC0187r.m560l0(methodDataList, new DexKitBridge$findMethod$$inlined$sortBy$1());
        }
        return methodDataList;
    }

    private final MethodDataList getCallMethods$dexkit_android_release(long j2) {
        byte[] bArrNativeGetCallMethods = Companion.nativeGetCallMethods(getSafeToken(), j2);
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetCallMethods);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i2 = 0; i2 < methodsLength; i2++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i2);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    private final List<AnnotationData> getClassAnnotations$dexkit_android_release(long j2) {
        byte[] bArrNativeGetClassAnnotations = Companion.nativeGetClassAnnotations(getSafeToken(), j2);
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassAnnotations);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i2 = 0; i2 < annotationsLength; i2++) {
            AnnotationData.Companion companion2 = AnnotationData.f4415Companion;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i2);
            AbstractC0307g.m700b(annotationMetaAnnotations);
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    private final List<AnnotationData> getFieldAnnotations$dexkit_android_release(long j2) {
        byte[] bArrNativeGetFieldAnnotations = Companion.nativeGetFieldAnnotations(getSafeToken(), j2);
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldAnnotations);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i2 = 0; i2 < annotationsLength; i2++) {
            AnnotationData.Companion companion2 = AnnotationData.f4415Companion;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i2);
            AbstractC0307g.m700b(annotationMetaAnnotations);
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    private final FieldDataList getFieldByIds$dexkit_android_release(long[] jArr) {
        AbstractC0307g.m703e(jArr, "encodeIdArray");
        byte[] bArrNativeGetFieldByIds = Companion.nativeGetFieldByIds(getSafeToken(), jArr);
        FieldMetaArrayHolder.Companion companion = FieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldByIds);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        FieldMetaArrayHolder rootAsFieldMetaArrayHolder = companion.getRootAsFieldMetaArrayHolder(byteBufferWrap);
        FieldDataList fieldDataList = new FieldDataList();
        int fieldsLength = rootAsFieldMetaArrayHolder.getFieldsLength();
        for (int i2 = 0; i2 < fieldsLength; i2++) {
            FieldData.Companion companion2 = FieldData.f4420Companion;
            FieldMeta fieldMetaFields = rootAsFieldMetaArrayHolder.fields(i2);
            AbstractC0307g.m700b(fieldMetaFields);
            fieldDataList.add(companion2.from(this, fieldMetaFields));
        }
        return fieldDataList;
    }

    private final MethodDataList getInvokeMethods$dexkit_android_release(long j2) {
        byte[] bArrNativeGetInvokeMethods = Companion.nativeGetInvokeMethods(getSafeToken(), j2);
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetInvokeMethods);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i2 = 0; i2 < methodsLength; i2++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i2);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    private final List<AnnotationData> getMethodAnnotations$dexkit_android_release(long j2) {
        byte[] bArrNativeGetMethodAnnotations = Companion.nativeGetMethodAnnotations(getSafeToken(), j2);
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetMethodAnnotations);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i2 = 0; i2 < annotationsLength; i2++) {
            AnnotationData.Companion companion2 = AnnotationData.f4415Companion;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i2);
            AbstractC0307g.m700b(annotationMetaAnnotations);
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    private final MethodDataList getMethodByIds$dexkit_android_release(long[] jArr) {
        AbstractC0307g.m703e(jArr, "encodeIdArray");
        byte[] bArrNativeGetMethodByIds = Companion.nativeGetMethodByIds(getSafeToken(), jArr);
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetMethodByIds);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i2 = 0; i2 < methodsLength; i2++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i2);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    private final List<Integer> getMethodOpCodes$dexkit_android_release(long j2) {
        return AbstractC0179j.m539p0(Companion.nativeGetMethodOpCodes(getSafeToken(), j2));
    }

    private final List<UsingFieldData> getMethodUsingFields$dexkit_android_release(long j2) {
        byte[] bArrNativeGetMethodUsingFields = Companion.nativeGetMethodUsingFields(getSafeToken(), j2);
        UsingFieldMetaArrayHolder.Companion companion = UsingFieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetMethodUsingFields);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        UsingFieldMetaArrayHolder rootAsUsingFieldMetaArrayHolder = companion.getRootAsUsingFieldMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int itemsLength = rootAsUsingFieldMetaArrayHolder.getItemsLength();
        for (int i2 = 0; i2 < itemsLength; i2++) {
            UsingFieldData.Companion companion2 = UsingFieldData.f4422Companion;
            UsingFieldMeta usingFieldMetaItems = rootAsUsingFieldMetaArrayHolder.items(i2);
            AbstractC0307g.m700b(usingFieldMetaItems);
            arrayList.add(companion2.from(this, usingFieldMetaItems));
        }
        return arrayList;
    }

    private final List<String> getMethodUsingStrings$dexkit_android_release(long j2) {
        return AbstractC0179j.m540q0(Companion.nativeGetMethodUsingStrings(getSafeToken(), j2));
    }

    private final List<List<AnnotationData>> getParameterAnnotations$dexkit_android_release(long j2) {
        byte[] bArrNativeGetParameterAnnotations = Companion.nativeGetParameterAnnotations(getSafeToken(), j2);
        ParametersAnnotationMetaArrayHoler.Companion companion = ParametersAnnotationMetaArrayHoler.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetParameterAnnotations);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        ParametersAnnotationMetaArrayHoler rootAsParametersAnnotationMetaArrayHoler = companion.getRootAsParametersAnnotationMetaArrayHoler(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsArrayLength = rootAsParametersAnnotationMetaArrayHoler.getAnnotationsArrayLength();
        for (int i2 = 0; i2 < annotationsArrayLength; i2++) {
            AnnotationMetaArrayHolder annotationMetaArrayHolderAnnotationsArray = rootAsParametersAnnotationMetaArrayHoler.annotationsArray(i2);
            AbstractC0307g.m700b(annotationMetaArrayHolderAnnotationsArray);
            ArrayList arrayList2 = new ArrayList();
            int annotationsLength = annotationMetaArrayHolderAnnotationsArray.getAnnotationsLength();
            for (int i3 = 0; i3 < annotationsLength; i3++) {
                AnnotationData.Companion companion2 = AnnotationData.f4415Companion;
                AnnotationMeta annotationMetaAnnotations = annotationMetaArrayHolderAnnotationsArray.annotations(i3);
                AbstractC0307g.m700b(annotationMetaAnnotations);
                arrayList2.add(companion2.from(this, annotationMetaAnnotations));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private final List<String> getParameterNames$dexkit_android_release(long j2) {
        String[] strArrNativeGetParameterNames = Companion.nativeGetParameterNames(getSafeToken(), j2);
        if (strArrNativeGetParameterNames == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrNativeGetParameterNames.length);
        for (String str : strArrNativeGetParameterNames) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getSafeToken() {
        long j2 = this.token;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("DexKitBridge is not valid");
    }

    private final ClassDataList getTypeByIds$dexkit_android_release(long[] jArr) {
        AbstractC0307g.m703e(jArr, "encodeIdArray");
        byte[] bArrNativeGetClassByIds = Companion.nativeGetClassByIds(getSafeToken(), jArr);
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i2 = 0; i2 < classesLength; i2++) {
            ClassData.Companion companion2 = ClassData.f4419Companion;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i2);
            AbstractC0307g.m700b(classMetaClasses);
            classDataList.add(companion2.from(this, classMetaClasses));
        }
        return classDataList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeBatchFindClassUsingStrings(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeBatchFindMethodUsingStrings(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeExportDexFile(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldGetMethods(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldPutMethods(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindClass(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindField(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindMethod(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetCallMethods(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassAnnotations(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassByIds(long j2, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassData(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetDexNum(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldAnnotations(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldByIds(long j2, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldData(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetInvokeMethods(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodAnnotations(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodByIds(long j2, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodData(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int[] nativeGetMethodOpCodes(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodUsingFields(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetMethodUsingStrings(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetParameterAnnotations(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetParameterNames(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKit(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeInitFullCache(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeRelease(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetThreadNum(long j2, int i2);

    private final MethodDataList readFieldMethods$dexkit_android_release(long j2) {
        byte[] bArrNativeFieldGetMethods = Companion.nativeFieldGetMethods(getSafeToken(), j2);
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFieldGetMethods);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i2 = 0; i2 < methodsLength; i2++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i2);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    private final MethodDataList writeFieldMethods$dexkit_android_release(long j2) {
        byte[] bArrNativeFieldPutMethods = Companion.nativeFieldPutMethods(getSafeToken(), j2);
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFieldPutMethods);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i2 = 0; i2 < methodsLength; i2++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i2);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    public final Map<String, ClassDataList> batchFindClassUsingStrings(BatchFindClassUsingStrings batchFindClassUsingStrings) {
        AbstractC0307g.m703e(batchFindClassUsingStrings, "batchFind");
        C0733b c0733b = new C0733b();
        batchFindClassUsingStrings.innerBuild(c0733b);
        byte[] bArrNativeBatchFindClassUsingStrings = Companion.nativeBatchFindClassUsingStrings(getSafeToken(), c0733b.m1934q());
        BatchClassMetaArrayHolder.Companion companion = BatchClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeBatchFindClassUsingStrings);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        BatchClassMetaArrayHolder rootAsBatchClassMetaArrayHolder = companion.getRootAsBatchClassMetaArrayHolder(byteBufferWrap);
        HashMap map = new HashMap();
        int itemsLength = rootAsBatchClassMetaArrayHolder.getItemsLength();
        for (int i2 = 0; i2 < itemsLength; i2++) {
            BatchClassMeta batchClassMetaItems = rootAsBatchClassMetaArrayHolder.items(i2);
            AbstractC0307g.m700b(batchClassMetaItems);
            String unionKey = batchClassMetaItems.getUnionKey();
            AbstractC0307g.m700b(unionKey);
            ClassDataList classDataList = new ClassDataList();
            int classesLength = batchClassMetaItems.getClassesLength();
            for (int i3 = 0; i3 < classesLength; i3++) {
                ClassData.Companion companion2 = ClassData.f4419Companion;
                ClassMeta classMetaClasses = batchClassMetaItems.classes(i3);
                AbstractC0307g.m700b(classMetaClasses);
                classDataList.add(companion2.from(this, classMetaClasses));
            }
            if (classDataList.size() > 1) {
                AbstractC0187r.m560l0(classDataList, new DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1());
            }
            map.put(unionKey, classDataList);
        }
        return map;
    }

    public final Map<String, MethodDataList> batchFindMethodUsingStrings(BatchFindMethodUsingStrings batchFindMethodUsingStrings) {
        AbstractC0307g.m703e(batchFindMethodUsingStrings, "batchFind");
        C0733b c0733b = new C0733b();
        batchFindMethodUsingStrings.innerBuild(c0733b);
        byte[] bArrNativeBatchFindMethodUsingStrings = Companion.nativeBatchFindMethodUsingStrings(getSafeToken(), c0733b.m1934q());
        BatchMethodMetaArrayHolder.Companion companion = BatchMethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeBatchFindMethodUsingStrings);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        BatchMethodMetaArrayHolder rootAsBatchMethodMetaArrayHolder = companion.getRootAsBatchMethodMetaArrayHolder(byteBufferWrap);
        HashMap map = new HashMap();
        int itemsLength = rootAsBatchMethodMetaArrayHolder.getItemsLength();
        for (int i2 = 0; i2 < itemsLength; i2++) {
            BatchMethodMeta batchMethodMetaItems = rootAsBatchMethodMetaArrayHolder.items(i2);
            AbstractC0307g.m700b(batchMethodMetaItems);
            String unionKey = batchMethodMetaItems.getUnionKey();
            AbstractC0307g.m700b(unionKey);
            MethodDataList methodDataList = new MethodDataList();
            int methodsLength = batchMethodMetaItems.getMethodsLength();
            for (int i3 = 0; i3 < methodsLength; i3++) {
                MethodData.Companion companion2 = MethodData.f4421Companion;
                MethodMeta methodMetaMethods = batchMethodMetaItems.methods(i3);
                AbstractC0307g.m700b(methodMetaMethods);
                methodDataList.add(companion2.from(this, methodMetaMethods));
            }
            if (methodDataList.size() > 1) {
                AbstractC0187r.m560l0(methodDataList, new DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1());
            }
            map.put(unionKey, methodDataList);
        }
        return map;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (isValid()) {
            Companion.nativeRelease(this.token);
            this.token = 0L;
        }
    }

    public final void exportDexFile(String str) {
        AbstractC0307g.m703e(str, "outPath");
        Companion.nativeExportDexFile(getSafeToken(), str);
    }

    public final void finalize() {
        close();
    }

    public final ClassDataList findClass(FindClass findClass) {
        AbstractC0307g.m703e(findClass, "findClass");
        C0733b c0733b = new C0733b();
        findClass.innerBuild(c0733b);
        byte[] bArrNativeFindClass = Companion.nativeFindClass(getSafeToken(), c0733b.m1934q());
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i2 = 0; i2 < classesLength; i2++) {
            ClassData.Companion companion2 = ClassData.f4419Companion;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i2);
            AbstractC0307g.m700b(classMetaClasses);
            classDataList.add(companion2.from(this, classMetaClasses));
        }
        if (classDataList.size() > 1) {
            AbstractC0187r.m560l0(classDataList, new DexKitBridge$findClass$$inlined$sortBy$1());
        }
        return classDataList;
    }

    public final FieldDataList findField(FindField findField) {
        AbstractC0307g.m703e(findField, "findField");
        C0733b c0733b = new C0733b();
        findField.innerBuild(c0733b);
        byte[] bArrNativeFindField = Companion.nativeFindField(getSafeToken(), c0733b.m1934q());
        FieldMetaArrayHolder.Companion companion = FieldMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindField);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        FieldMetaArrayHolder rootAsFieldMetaArrayHolder = companion.getRootAsFieldMetaArrayHolder(byteBufferWrap);
        FieldDataList fieldDataList = new FieldDataList();
        int fieldsLength = rootAsFieldMetaArrayHolder.getFieldsLength();
        for (int i2 = 0; i2 < fieldsLength; i2++) {
            FieldData.Companion companion2 = FieldData.f4420Companion;
            FieldMeta fieldMetaFields = rootAsFieldMetaArrayHolder.fields(i2);
            AbstractC0307g.m700b(fieldMetaFields);
            fieldDataList.add(companion2.from(this, fieldMetaFields));
        }
        if (fieldDataList.size() > 1) {
            AbstractC0187r.m560l0(fieldDataList, new DexKitBridge$findField$$inlined$sortBy$1());
        }
        return fieldDataList;
    }

    public final MethodDataList findMethod(FindMethod findMethod) {
        AbstractC0307g.m703e(findMethod, "findMethod");
        C0733b c0733b = new C0733b();
        findMethod.innerBuild(c0733b);
        byte[] bArrNativeFindMethod = Companion.nativeFindMethod(getSafeToken(), c0733b.m1934q());
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i2 = 0; i2 < methodsLength; i2++) {
            MethodData.Companion companion2 = MethodData.f4421Companion;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i2);
            AbstractC0307g.m700b(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        if (methodDataList.size() > 1) {
            AbstractC0187r.m560l0(methodDataList, new DexKitBridge$findMethod$$inlined$sortBy$1());
        }
        return methodDataList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ClassData getClassData(String str) {
        AbstractC0307g.m703e(str, "identifier");
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (str.charAt(0) != 'L') {
            str = AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(str, '.', '/'), ";");
        } else {
            if (str.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (str.charAt(AbstractC0425j.m1007L0(str)) != ';') {
            }
        }
        new DexClass(str);
        byte[] bArrNativeGetClassData = Companion.nativeGetClassData(getSafeToken(), str);
        if (bArrNativeGetClassData == null) {
            return null;
        }
        ClassData.Companion companion = ClassData.f4419Companion;
        ClassMeta.Companion companion2 = ClassMeta.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassData);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(it)");
        return companion.from(this, companion2.getRootAsClassMeta(byteBufferWrap));
    }

    public final int getDexNum() {
        return Companion.nativeGetDexNum(getSafeToken());
    }

    public final FieldData getFieldData(Field field) {
        AbstractC0307g.m703e(field, "field");
        return getFieldData(DexSignUtil.getDescriptor(field));
    }

    public final MethodData getMethodData(Method method) {
        AbstractC0307g.m703e(method, "method");
        return getMethodData(DexSignUtil.getDescriptor(method));
    }

    public final void initFullCache() {
        Companion.nativeInitFullCache(getSafeToken());
    }

    public final boolean isValid() {
        return this.token != 0;
    }

    public final void setThreadNum(int i2) {
        Companion.nativeSetThreadNum(getSafeToken(), i2);
    }

    public /* synthetic */ DexKitBridge(String str, AbstractC0304d abstractC0304d) {
        this(str);
    }

    public static final DexKitBridge create(String str) {
        return Companion.create(str);
    }

    public final FieldData getFieldData(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        new DexField(str);
        byte[] bArrNativeGetFieldData = Companion.nativeGetFieldData(getSafeToken(), str);
        if (bArrNativeGetFieldData == null) {
            return null;
        }
        FieldData.Companion companion = FieldData.f4420Companion;
        FieldMeta.Companion companion2 = FieldMeta.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldData);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(it)");
        return companion.from(this, companion2.getRootAsFieldMeta(byteBufferWrap));
    }

    public final MethodData getMethodData(Constructor<?> constructor) {
        AbstractC0307g.m703e(constructor, "constructor");
        return getMethodData(DexSignUtil.getDescriptor(constructor));
    }

    public /* synthetic */ DexKitBridge(byte[][] bArr, AbstractC0304d abstractC0304d) {
        this(bArr);
    }

    public static final DexKitBridge create(byte[][] bArr) {
        return Companion.create(bArr);
    }

    public final MethodData getMethodData(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        new DexMethod(str);
        byte[] bArrNativeGetMethodData = Companion.nativeGetMethodData(getSafeToken(), str);
        if (bArrNativeGetMethodData == null) {
            return null;
        }
        MethodData.Companion companion = MethodData.f4421Companion;
        MethodMeta.Companion companion2 = MethodMeta.Companion;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetMethodData);
        AbstractC0307g.m702d(byteBufferWrap, "wrap(it)");
        return companion.from(this, companion2.getRootAsMethodMeta(byteBufferWrap));
    }

    private DexKitBridge(String str) {
        this.token = Companion.nativeInitDexKit(str);
    }

    private final Map<String, ClassDataList> batchFindClassUsingStrings(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
        interfaceC0286l.invoke(batchFindClassUsingStrings);
        return batchFindClassUsingStrings(batchFindClassUsingStrings);
    }

    private final Map<String, MethodDataList> batchFindMethodUsingStrings(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
        interfaceC0286l.invoke(batchFindMethodUsingStrings);
        return batchFindMethodUsingStrings(batchFindMethodUsingStrings);
    }

    private final ClassDataList findClass(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindClass findClass = new FindClass();
        interfaceC0286l.invoke(findClass);
        return findClass(findClass);
    }

    private final FieldDataList findField(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindField findField = new FindField();
        interfaceC0286l.invoke(findField);
        return findField(findField);
    }

    private final MethodDataList findMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindMethod findMethod = new FindMethod();
        interfaceC0286l.invoke(findMethod);
        return findMethod(findMethod);
    }

    private DexKitBridge(byte[][] bArr) {
        this.token = Companion.nativeInitDexKitByBytesArray(bArr);
    }

    private DexKitBridge(ClassLoader classLoader, boolean z2) {
        this.token = Companion.nativeInitDexKitByClassLoader(classLoader, z2);
    }

    public final ClassData getClassData(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        return getClassData(DexSignUtil.getDescriptor(cls));
    }
}

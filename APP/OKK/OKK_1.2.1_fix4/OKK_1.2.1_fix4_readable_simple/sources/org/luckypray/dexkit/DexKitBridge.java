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
import org.luckypray.dexkit.query.base.BaseQuery;
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
    public static final Companion Companion = null;
    private long token;

    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ byte[] access$nativeBatchFindClassUsingStrings(Companion r02, long r1, byte[] r3) {
            return r02.nativeBatchFindClassUsingStrings(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeBatchFindMethodUsingStrings(Companion r02, long r1, byte[] r3) {
            return r02.nativeBatchFindMethodUsingStrings(r1, r3);
        }

        public static final /* synthetic */ void access$nativeExportDexFile(Companion r02, long r1, String r3) {
            r02.nativeExportDexFile(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeFieldGetMethods(Companion r02, long r1, long r3) {
            return r02.nativeFieldGetMethods(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeFieldPutMethods(Companion r02, long r1, long r3) {
            return r02.nativeFieldPutMethods(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeFindClass(Companion r02, long r1, byte[] r3) {
            return r02.nativeFindClass(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeFindField(Companion r02, long r1, byte[] r3) {
            return r02.nativeFindField(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeFindMethod(Companion r02, long r1, byte[] r3) {
            return r02.nativeFindMethod(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetCallMethods(Companion r02, long r1, long r3) {
            return r02.nativeGetCallMethods(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetClassAnnotations(Companion r02, long r1, long r3) {
            return r02.nativeGetClassAnnotations(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetClassByIds(Companion r02, long r1, long[] r3) {
            return r02.nativeGetClassByIds(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetClassData(Companion r02, long r1, String r3) {
            return r02.nativeGetClassData(r1, r3);
        }

        public static final /* synthetic */ int access$nativeGetDexNum(Companion r02, long r1) {
            return r02.nativeGetDexNum(r1);
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldAnnotations(Companion r02, long r1, long r3) {
            return r02.nativeGetFieldAnnotations(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldByIds(Companion r02, long r1, long[] r3) {
            return r02.nativeGetFieldByIds(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldData(Companion r02, long r1, String r3) {
            return r02.nativeGetFieldData(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetInvokeMethods(Companion r02, long r1, long r3) {
            return r02.nativeGetInvokeMethods(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodAnnotations(Companion r02, long r1, long r3) {
            return r02.nativeGetMethodAnnotations(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodByIds(Companion r02, long r1, long[] r3) {
            return r02.nativeGetMethodByIds(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodData(Companion r02, long r1, String r3) {
            return r02.nativeGetMethodData(r1, r3);
        }

        public static final /* synthetic */ int[] access$nativeGetMethodOpCodes(Companion r02, long r1, long r3) {
            return r02.nativeGetMethodOpCodes(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodUsingFields(Companion r02, long r1, long r3) {
            return r02.nativeGetMethodUsingFields(r1, r3);
        }

        public static final /* synthetic */ String[] access$nativeGetMethodUsingStrings(Companion r02, long r1, long r3) {
            return r02.nativeGetMethodUsingStrings(r1, r3);
        }

        public static final /* synthetic */ byte[] access$nativeGetParameterAnnotations(Companion r02, long r1, long r3) {
            return r02.nativeGetParameterAnnotations(r1, r3);
        }

        public static final /* synthetic */ String[] access$nativeGetParameterNames(Companion r02, long r1, long r3) {
            return r02.nativeGetParameterNames(r1, r3);
        }

        public static final /* synthetic */ long access$nativeInitDexKit(Companion r02, String r1) {
            return r02.nativeInitDexKit(r1);
        }

        public static final /* synthetic */ long access$nativeInitDexKitByBytesArray(Companion r02, byte[][] r1) {
            return r02.nativeInitDexKitByBytesArray(r1);
        }

        public static final /* synthetic */ long access$nativeInitDexKitByClassLoader(Companion r02, ClassLoader r1, boolean r2) {
            return r02.nativeInitDexKitByClassLoader(r1, r2);
        }

        public static final /* synthetic */ void access$nativeInitFullCache(Companion r02, long r1) {
            r02.nativeInitFullCache(r1);
        }

        public static final /* synthetic */ void access$nativeRelease(Companion r02, long r1) {
            r02.nativeRelease(r1);
        }

        public static final /* synthetic */ void access$nativeSetThreadNum(Companion r02, long r1, int r3) {
            r02.nativeSetThreadNum(r1, r3);
        }

        private final byte[] nativeBatchFindClassUsingStrings(long r1, byte[] r3) {
            return DexKitBridge.access$nativeBatchFindClassUsingStrings(r1, r3);
        }

        private final byte[] nativeBatchFindMethodUsingStrings(long r1, byte[] r3) {
            return DexKitBridge.access$nativeBatchFindMethodUsingStrings(r1, r3);
        }

        private final void nativeExportDexFile(long r1, String r3) {
            DexKitBridge.access$nativeExportDexFile(r1, r3);
        }

        private final byte[] nativeFieldGetMethods(long r1, long r3) {
            return DexKitBridge.access$nativeFieldGetMethods(r1, r3);
        }

        private final byte[] nativeFieldPutMethods(long r1, long r3) {
            return DexKitBridge.access$nativeFieldPutMethods(r1, r3);
        }

        private final byte[] nativeFindClass(long r1, byte[] r3) {
            return DexKitBridge.access$nativeFindClass(r1, r3);
        }

        private final byte[] nativeFindField(long r1, byte[] r3) {
            return DexKitBridge.access$nativeFindField(r1, r3);
        }

        private final byte[] nativeFindMethod(long r1, byte[] r3) {
            return DexKitBridge.access$nativeFindMethod(r1, r3);
        }

        private final byte[] nativeGetCallMethods(long r1, long r3) {
            return DexKitBridge.access$nativeGetCallMethods(r1, r3);
        }

        private final byte[] nativeGetClassAnnotations(long r1, long r3) {
            return DexKitBridge.access$nativeGetClassAnnotations(r1, r3);
        }

        private final byte[] nativeGetClassByIds(long r1, long[] r3) {
            return DexKitBridge.access$nativeGetClassByIds(r1, r3);
        }

        private final byte[] nativeGetClassData(long r1, String r3) {
            return DexKitBridge.access$nativeGetClassData(r1, r3);
        }

        private final int nativeGetDexNum(long r1) {
            return DexKitBridge.access$nativeGetDexNum(r1);
        }

        private final byte[] nativeGetFieldAnnotations(long r1, long r3) {
            return DexKitBridge.access$nativeGetFieldAnnotations(r1, r3);
        }

        private final byte[] nativeGetFieldByIds(long r1, long[] r3) {
            return DexKitBridge.access$nativeGetFieldByIds(r1, r3);
        }

        private final byte[] nativeGetFieldData(long r1, String r3) {
            return DexKitBridge.access$nativeGetFieldData(r1, r3);
        }

        private final byte[] nativeGetInvokeMethods(long r1, long r3) {
            return DexKitBridge.access$nativeGetInvokeMethods(r1, r3);
        }

        private final byte[] nativeGetMethodAnnotations(long r1, long r3) {
            return DexKitBridge.access$nativeGetMethodAnnotations(r1, r3);
        }

        private final byte[] nativeGetMethodByIds(long r1, long[] r3) {
            return DexKitBridge.access$nativeGetMethodByIds(r1, r3);
        }

        private final byte[] nativeGetMethodData(long r1, String r3) {
            return DexKitBridge.access$nativeGetMethodData(r1, r3);
        }

        private final int[] nativeGetMethodOpCodes(long r1, long r3) {
            return DexKitBridge.access$nativeGetMethodOpCodes(r1, r3);
        }

        private final byte[] nativeGetMethodUsingFields(long r1, long r3) {
            return DexKitBridge.access$nativeGetMethodUsingFields(r1, r3);
        }

        private final String[] nativeGetMethodUsingStrings(long r1, long r3) {
            return DexKitBridge.access$nativeGetMethodUsingStrings(r1, r3);
        }

        private final byte[] nativeGetParameterAnnotations(long r1, long r3) {
            return DexKitBridge.access$nativeGetParameterAnnotations(r1, r3);
        }

        private final String[] nativeGetParameterNames(long r1, long r3) {
            return DexKitBridge.access$nativeGetParameterNames(r1, r3);
        }

        private final long nativeInitDexKit(String r3) {
            return DexKitBridge.access$nativeInitDexKit(r3);
        }

        private final long nativeInitDexKitByBytesArray(byte[][] r3) {
            return DexKitBridge.access$nativeInitDexKitByBytesArray(r3);
        }

        private final long nativeInitDexKitByClassLoader(ClassLoader r1, boolean r2) {
            return DexKitBridge.access$nativeInitDexKitByClassLoader(r1, r2);
        }

        private final void nativeInitFullCache(long r1) {
            DexKitBridge.access$nativeInitFullCache(r1);
        }

        private final void nativeRelease(long r1) {
            DexKitBridge.access$nativeRelease(r1);
        }

        private final void nativeSetThreadNum(long r1, int r3) {
            DexKitBridge.access$nativeSetThreadNum(r1, r3);
        }

        public final DexKitBridge create(String r3) {
            AbstractC0307g.m703e(r3, "apkPath");
            return new DexKitBridge(r3, null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final DexKitBridge create(byte[][] r3) {
            AbstractC0307g.m703e(r3, "dexBytesArray");
            return new DexKitBridge(r3, null);
        }

        public final DexKitBridge create(ClassLoader r3, boolean r4) {
            AbstractC0307g.m703e(r3, "loader");
            return new DexKitBridge(r3, r4, null);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ DexKitBridge(ClassLoader r1, boolean r2, AbstractC0304d r3) {
        this(r1, r2);
    }

    public static final /* synthetic */ long access$getSafeToken(DexKitBridge r2) {
        return r2.getSafeToken();
    }

    public static final /* synthetic */ byte[] access$nativeBatchFindClassUsingStrings(long r02, byte[] r2) {
        return nativeBatchFindClassUsingStrings(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeBatchFindMethodUsingStrings(long r02, byte[] r2) {
        return nativeBatchFindMethodUsingStrings(r02, r2);
    }

    public static final /* synthetic */ void access$nativeExportDexFile(long r02, String r2) {
        nativeExportDexFile(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeFieldGetMethods(long r02, long r2) {
        return nativeFieldGetMethods(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeFieldPutMethods(long r02, long r2) {
        return nativeFieldPutMethods(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeFindClass(long r02, byte[] r2) {
        return nativeFindClass(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeFindField(long r02, byte[] r2) {
        return nativeFindField(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeFindMethod(long r02, byte[] r2) {
        return nativeFindMethod(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetCallMethods(long r02, long r2) {
        return nativeGetCallMethods(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetClassAnnotations(long r02, long r2) {
        return nativeGetClassAnnotations(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetClassByIds(long r02, long[] r2) {
        return nativeGetClassByIds(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetClassData(long r02, String r2) {
        return nativeGetClassData(r02, r2);
    }

    public static final /* synthetic */ int access$nativeGetDexNum(long r02) {
        return nativeGetDexNum(r02);
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldAnnotations(long r02, long r2) {
        return nativeGetFieldAnnotations(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldByIds(long r02, long[] r2) {
        return nativeGetFieldByIds(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldData(long r02, String r2) {
        return nativeGetFieldData(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetInvokeMethods(long r02, long r2) {
        return nativeGetInvokeMethods(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodAnnotations(long r02, long r2) {
        return nativeGetMethodAnnotations(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodByIds(long r02, long[] r2) {
        return nativeGetMethodByIds(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodData(long r02, String r2) {
        return nativeGetMethodData(r02, r2);
    }

    public static final /* synthetic */ int[] access$nativeGetMethodOpCodes(long r02, long r2) {
        return nativeGetMethodOpCodes(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodUsingFields(long r02, long r2) {
        return nativeGetMethodUsingFields(r02, r2);
    }

    public static final /* synthetic */ String[] access$nativeGetMethodUsingStrings(long r02, long r2) {
        return nativeGetMethodUsingStrings(r02, r2);
    }

    public static final /* synthetic */ byte[] access$nativeGetParameterAnnotations(long r02, long r2) {
        return nativeGetParameterAnnotations(r02, r2);
    }

    public static final /* synthetic */ String[] access$nativeGetParameterNames(long r02, long r2) {
        return nativeGetParameterNames(r02, r2);
    }

    public static final /* synthetic */ long access$nativeInitDexKit(String r2) {
        return nativeInitDexKit(r2);
    }

    public static final /* synthetic */ long access$nativeInitDexKitByBytesArray(byte[][] r2) {
        return nativeInitDexKitByBytesArray(r2);
    }

    public static final /* synthetic */ long access$nativeInitDexKitByClassLoader(ClassLoader r02, boolean r1) {
        return nativeInitDexKitByClassLoader(r02, r1);
    }

    public static final /* synthetic */ void access$nativeInitFullCache(long r02) {
        nativeInitFullCache(r02);
    }

    public static final /* synthetic */ void access$nativeRelease(long r02) {
        nativeRelease(r02);
    }

    public static final /* synthetic */ void access$nativeSetThreadNum(long r02, int r2) {
        nativeSetThreadNum(r02, r2);
    }

    private final Map<String, ClassDataList> batchFindClassUsingStrings$dexkit_android_release(C0733b r12) {
        AbstractC0307g.m703e(r12, "fbb");
        byte[] r122 = Companion.access$nativeBatchFindClassUsingStrings(Companion, access$getSafeToken(this), r12.m1934q());
        BatchClassMetaArrayHolder.Companion r02 = BatchClassMetaArrayHolder.Companion;
        ByteBuffer r123 = ByteBuffer.wrap(r122);
        AbstractC0307g.m702d(r123, "wrap(res)");
        BatchClassMetaArrayHolder r124 = r02.getRootAsBatchClassMetaArrayHolder(r123);
        HashMap r03 = new HashMap();
        int r1 = r124.getItemsLength();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L11;
        BatchClassMeta r4 = r124.items(r3);
        AbstractC0307g.m700b(r4);
        String r5 = r4.getUnionKey();
        AbstractC0307g.m700b(r5);
        ClassDataList r6 = new ClassDataList();
        int r7 = r4.getClassesLength();
        int r8 = 0;
    L5:
        if (r8 >= r7) goto L8;
        ClassData.Companion r9 = ClassData.f4419Companion;
        ClassMeta r10 = r4.classes(r8);
        AbstractC0307g.m700b(r10);
        r6.add(r9.from(this, r10));
        r8 = r8 + 1;
        goto L5
    L8:
        if (r6.size() <= 1) goto L10;
        AbstractC0187r.m560l0(r6, new DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1());
    L10:
        r03.put(r5, r6);
        r3 = r3 + 1;
        goto L3
    L11:
        return r03;
    }

    private final Map<String, MethodDataList> batchFindMethodUsingStrings$dexkit_android_release(C0733b r12) {
        AbstractC0307g.m703e(r12, "fbb");
        byte[] r122 = Companion.access$nativeBatchFindMethodUsingStrings(Companion, access$getSafeToken(this), r12.m1934q());
        BatchMethodMetaArrayHolder.Companion r02 = BatchMethodMetaArrayHolder.Companion;
        ByteBuffer r123 = ByteBuffer.wrap(r122);
        AbstractC0307g.m702d(r123, "wrap(res)");
        BatchMethodMetaArrayHolder r124 = r02.getRootAsBatchMethodMetaArrayHolder(r123);
        HashMap r03 = new HashMap();
        int r1 = r124.getItemsLength();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L11;
        BatchMethodMeta r4 = r124.items(r3);
        AbstractC0307g.m700b(r4);
        String r5 = r4.getUnionKey();
        AbstractC0307g.m700b(r5);
        MethodDataList r6 = new MethodDataList();
        int r7 = r4.getMethodsLength();
        int r8 = 0;
    L5:
        if (r8 >= r7) goto L8;
        MethodData.Companion r9 = MethodData.f4421Companion;
        MethodMeta r10 = r4.methods(r8);
        AbstractC0307g.m700b(r10);
        r6.add(r9.from(this, r10));
        r8 = r8 + 1;
        goto L5
    L8:
        if (r6.size() <= 1) goto L10;
        AbstractC0187r.m560l0(r6, new DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1());
    L10:
        r03.put(r5, r6);
        r3 = r3 + 1;
        goto L3
    L11:
        return r03;
    }

    public static final DexKitBridge create(ClassLoader r1, boolean r2) {
        return Companion.create(r1, r2);
    }

    private final ClassDataList findClass$dexkit_android_release(C0733b r6) {
        AbstractC0307g.m703e(r6, "fbb");
        byte[] r62 = Companion.access$nativeFindClass(Companion, access$getSafeToken(this), r6.m1934q());
        ClassMetaArrayHolder.Companion r02 = ClassMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        ClassMetaArrayHolder r64 = r02.getRootAsClassMetaArrayHolder(r63);
        ClassDataList r03 = new ClassDataList();
        int r1 = r64.getClassesLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        ClassData.Companion r3 = ClassData.f4419Companion;
        ClassMeta r4 = r64.classes(r2);
        AbstractC0307g.m700b(r4);
        r03.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L6:
        if (r03.size() <= 1) goto L8;
        AbstractC0187r.m560l0(r03, new DexKitBridge$findClass$$inlined$sortBy$1());
    L8:
        return r03;
    }

    private final FieldDataList findField$dexkit_android_release(C0733b r6) {
        AbstractC0307g.m703e(r6, "fbb");
        byte[] r62 = Companion.access$nativeFindField(Companion, access$getSafeToken(this), r6.m1934q());
        FieldMetaArrayHolder.Companion r02 = FieldMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        FieldMetaArrayHolder r64 = r02.getRootAsFieldMetaArrayHolder(r63);
        FieldDataList r03 = new FieldDataList();
        int r1 = r64.getFieldsLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        FieldData.Companion r3 = FieldData.f4420Companion;
        FieldMeta r4 = r64.fields(r2);
        AbstractC0307g.m700b(r4);
        r03.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L6:
        if (r03.size() <= 1) goto L8;
        AbstractC0187r.m560l0(r03, new DexKitBridge$findField$$inlined$sortBy$1());
    L8:
        return r03;
    }

    private final MethodDataList findMethod$dexkit_android_release(C0733b r6) {
        AbstractC0307g.m703e(r6, "fbb");
        byte[] r62 = Companion.access$nativeFindMethod(Companion, access$getSafeToken(this), r6.m1934q());
        MethodMetaArrayHolder.Companion r02 = MethodMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        MethodMetaArrayHolder r64 = r02.getRootAsMethodMetaArrayHolder(r63);
        MethodDataList r03 = new MethodDataList();
        int r1 = r64.getMethodsLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        MethodData.Companion r3 = MethodData.f4421Companion;
        MethodMeta r4 = r64.methods(r2);
        AbstractC0307g.m700b(r4);
        r03.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L6:
        if (r03.size() <= 1) goto L8;
        AbstractC0187r.m560l0(r03, new DexKitBridge$findMethod$$inlined$sortBy$1());
    L8:
        return r03;
    }

    private final MethodDataList getCallMethods$dexkit_android_release(long r5) {
        byte[] r52 = Companion.access$nativeGetCallMethods(Companion, access$getSafeToken(this), r5);
        MethodMetaArrayHolder.Companion r6 = MethodMetaArrayHolder.Companion;
        ByteBuffer r53 = ByteBuffer.wrap(r52);
        AbstractC0307g.m702d(r53, "wrap(res)");
        MethodMetaArrayHolder r54 = r6.getRootAsMethodMetaArrayHolder(r53);
        MethodDataList r62 = new MethodDataList();
        int r02 = r54.getMethodsLength();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        MethodData.Companion r2 = MethodData.f4421Companion;
        MethodMeta r3 = r54.methods(r1);
        AbstractC0307g.m700b(r3);
        r62.add(r2.from(this, r3));
        r1 = r1 + 1;
        goto L3
    L5:
        return r62;
    }

    private final List<AnnotationData> getClassAnnotations$dexkit_android_release(long r5) {
        byte[] r52 = Companion.access$nativeGetClassAnnotations(Companion, access$getSafeToken(this), r5);
        AnnotationMetaArrayHolder.Companion r6 = AnnotationMetaArrayHolder.Companion;
        ByteBuffer r53 = ByteBuffer.wrap(r52);
        AbstractC0307g.m702d(r53, "wrap(res)");
        AnnotationMetaArrayHolder r54 = r6.getRootAsAnnotationMetaArrayHolder(r53);
        ArrayList r62 = new ArrayList();
        int r02 = r54.getAnnotationsLength();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        AnnotationData.Companion r2 = AnnotationData.f4415Companion;
        AnnotationMeta r3 = r54.annotations(r1);
        AbstractC0307g.m700b(r3);
        r62.add(r2.from(this, r3));
        r1 = r1 + 1;
        goto L3
    L5:
        return r62;
    }

    private final List<AnnotationData> getFieldAnnotations$dexkit_android_release(long r5) {
        byte[] r52 = Companion.access$nativeGetFieldAnnotations(Companion, access$getSafeToken(this), r5);
        AnnotationMetaArrayHolder.Companion r6 = AnnotationMetaArrayHolder.Companion;
        ByteBuffer r53 = ByteBuffer.wrap(r52);
        AbstractC0307g.m702d(r53, "wrap(res)");
        AnnotationMetaArrayHolder r54 = r6.getRootAsAnnotationMetaArrayHolder(r53);
        ArrayList r62 = new ArrayList();
        int r02 = r54.getAnnotationsLength();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        AnnotationData.Companion r2 = AnnotationData.f4415Companion;
        AnnotationMeta r3 = r54.annotations(r1);
        AbstractC0307g.m700b(r3);
        r62.add(r2.from(this, r3));
        r1 = r1 + 1;
        goto L3
    L5:
        return r62;
    }

    private final FieldDataList getFieldByIds$dexkit_android_release(long[] r6) {
        AbstractC0307g.m703e(r6, "encodeIdArray");
        byte[] r62 = Companion.access$nativeGetFieldByIds(Companion, access$getSafeToken(this), r6);
        FieldMetaArrayHolder.Companion r02 = FieldMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        FieldMetaArrayHolder r64 = r02.getRootAsFieldMetaArrayHolder(r63);
        FieldDataList r03 = new FieldDataList();
        int r1 = r64.getFieldsLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        FieldData.Companion r3 = FieldData.f4420Companion;
        FieldMeta r4 = r64.fields(r2);
        AbstractC0307g.m700b(r4);
        r03.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L5:
        return r03;
    }

    private final MethodDataList getInvokeMethods$dexkit_android_release(long r5) {
        byte[] r52 = Companion.access$nativeGetInvokeMethods(Companion, access$getSafeToken(this), r5);
        MethodMetaArrayHolder.Companion r6 = MethodMetaArrayHolder.Companion;
        ByteBuffer r53 = ByteBuffer.wrap(r52);
        AbstractC0307g.m702d(r53, "wrap(res)");
        MethodMetaArrayHolder r54 = r6.getRootAsMethodMetaArrayHolder(r53);
        MethodDataList r62 = new MethodDataList();
        int r02 = r54.getMethodsLength();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        MethodData.Companion r2 = MethodData.f4421Companion;
        MethodMeta r3 = r54.methods(r1);
        AbstractC0307g.m700b(r3);
        r62.add(r2.from(this, r3));
        r1 = r1 + 1;
        goto L3
    L5:
        return r62;
    }

    private final List<AnnotationData> getMethodAnnotations$dexkit_android_release(long r5) {
        byte[] r52 = Companion.access$nativeGetMethodAnnotations(Companion, access$getSafeToken(this), r5);
        AnnotationMetaArrayHolder.Companion r6 = AnnotationMetaArrayHolder.Companion;
        ByteBuffer r53 = ByteBuffer.wrap(r52);
        AbstractC0307g.m702d(r53, "wrap(res)");
        AnnotationMetaArrayHolder r54 = r6.getRootAsAnnotationMetaArrayHolder(r53);
        ArrayList r62 = new ArrayList();
        int r02 = r54.getAnnotationsLength();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        AnnotationData.Companion r2 = AnnotationData.f4415Companion;
        AnnotationMeta r3 = r54.annotations(r1);
        AbstractC0307g.m700b(r3);
        r62.add(r2.from(this, r3));
        r1 = r1 + 1;
        goto L3
    L5:
        return r62;
    }

    private final MethodDataList getMethodByIds$dexkit_android_release(long[] r6) {
        AbstractC0307g.m703e(r6, "encodeIdArray");
        byte[] r62 = Companion.access$nativeGetMethodByIds(Companion, access$getSafeToken(this), r6);
        MethodMetaArrayHolder.Companion r02 = MethodMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        MethodMetaArrayHolder r64 = r02.getRootAsMethodMetaArrayHolder(r63);
        MethodDataList r03 = new MethodDataList();
        int r1 = r64.getMethodsLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        MethodData.Companion r3 = MethodData.f4421Companion;
        MethodMeta r4 = r64.methods(r2);
        AbstractC0307g.m700b(r4);
        r03.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L5:
        return r03;
    }

    private final List<Integer> getMethodOpCodes$dexkit_android_release(long r4) {
        return AbstractC0179j.m539p0(Companion.access$nativeGetMethodOpCodes(Companion, access$getSafeToken(this), r4));
    }

    private final List<UsingFieldData> getMethodUsingFields$dexkit_android_release(long r5) {
        byte[] r52 = Companion.access$nativeGetMethodUsingFields(Companion, access$getSafeToken(this), r5);
        UsingFieldMetaArrayHolder.Companion r6 = UsingFieldMetaArrayHolder.Companion;
        ByteBuffer r53 = ByteBuffer.wrap(r52);
        AbstractC0307g.m702d(r53, "wrap(res)");
        UsingFieldMetaArrayHolder r54 = r6.getRootAsUsingFieldMetaArrayHolder(r53);
        ArrayList r62 = new ArrayList();
        int r02 = r54.getItemsLength();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        UsingFieldData.Companion r2 = UsingFieldData.f4422Companion;
        UsingFieldMeta r3 = r54.items(r1);
        AbstractC0307g.m700b(r3);
        r62.add(r2.from(this, r3));
        r1 = r1 + 1;
        goto L3
    L5:
        return r62;
    }

    private final List<String> getMethodUsingStrings$dexkit_android_release(long r4) {
        return AbstractC0179j.m540q0(Companion.access$nativeGetMethodUsingStrings(Companion, access$getSafeToken(this), r4));
    }

    private final List<List<AnnotationData>> getParameterAnnotations$dexkit_android_release(long r10) {
        byte[] r102 = Companion.access$nativeGetParameterAnnotations(Companion, access$getSafeToken(this), r10);
        ParametersAnnotationMetaArrayHoler.Companion r11 = ParametersAnnotationMetaArrayHoler.Companion;
        ByteBuffer r103 = ByteBuffer.wrap(r102);
        AbstractC0307g.m702d(r103, "wrap(res)");
        ParametersAnnotationMetaArrayHoler r104 = r11.getRootAsParametersAnnotationMetaArrayHoler(r103);
        ArrayList r112 = new ArrayList();
        int r02 = r104.getAnnotationsArrayLength();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L8;
        AnnotationMetaArrayHolder r3 = r104.annotationsArray(r2);
        AbstractC0307g.m700b(r3);
        ArrayList r4 = new ArrayList();
        int r5 = r3.getAnnotationsLength();
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L7;
        AnnotationData.Companion r7 = AnnotationData.f4415Companion;
        AnnotationMeta r8 = r3.annotations(r6);
        AbstractC0307g.m700b(r8);
        r4.add(r7.from(this, r8));
        r6 = r6 + 1;
        goto L5
    L7:
        r112.add(r4);
        r2 = r2 + 1;
        goto L3
    L8:
        return r112;
    }

    private final List<String> getParameterNames$dexkit_android_release(long r4) {
        String[] r42 = Companion.access$nativeGetParameterNames(Companion, access$getSafeToken(this), r4);
        if (r42 == null) goto L7;
        ArrayList r5 = new ArrayList(r42.length);
        int r02 = r42.length;
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L10;
        r5.add(r42[r1]);
        r1 = r1 + 1;
        goto L5
    L10:
        return r5;
    L7:
        return null;
    }

    private final long getSafeToken() {
        long r02 = this.token;
        if (r02 == 0) goto L6;
        return r02;
    L6:
        throw new IllegalStateException("DexKitBridge is not valid");
    }

    private final ClassDataList getTypeByIds$dexkit_android_release(long[] r6) {
        AbstractC0307g.m703e(r6, "encodeIdArray");
        byte[] r62 = Companion.access$nativeGetClassByIds(Companion, access$getSafeToken(this), r6);
        ClassMetaArrayHolder.Companion r02 = ClassMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        ClassMetaArrayHolder r64 = r02.getRootAsClassMetaArrayHolder(r63);
        ClassDataList r03 = new ClassDataList();
        int r1 = r64.getClassesLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ClassData.Companion r3 = ClassData.f4419Companion;
        ClassMeta r4 = r64.classes(r2);
        AbstractC0307g.m700b(r4);
        r03.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L5:
        return r03;
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long r02, byte[] r2);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long r02, byte[] r2);

    private static final native void nativeExportDexFile(long r02, String r2);

    private static final native byte[] nativeFieldGetMethods(long r02, long r2);

    private static final native byte[] nativeFieldPutMethods(long r02, long r2);

    private static final native byte[] nativeFindClass(long r02, byte[] r2);

    private static final native byte[] nativeFindField(long r02, byte[] r2);

    private static final native byte[] nativeFindMethod(long r02, byte[] r2);

    private static final native byte[] nativeGetCallMethods(long r02, long r2);

    private static final native byte[] nativeGetClassAnnotations(long r02, long r2);

    private static final native byte[] nativeGetClassByIds(long r02, long[] r2);

    private static final native byte[] nativeGetClassData(long r02, String r2);

    private static final native int nativeGetDexNum(long r02);

    private static final native byte[] nativeGetFieldAnnotations(long r02, long r2);

    private static final native byte[] nativeGetFieldByIds(long r02, long[] r2);

    private static final native byte[] nativeGetFieldData(long r02, String r2);

    private static final native byte[] nativeGetInvokeMethods(long r02, long r2);

    private static final native byte[] nativeGetMethodAnnotations(long r02, long r2);

    private static final native byte[] nativeGetMethodByIds(long r02, long[] r2);

    private static final native byte[] nativeGetMethodData(long r02, String r2);

    private static final native int[] nativeGetMethodOpCodes(long r02, long r2);

    private static final native byte[] nativeGetMethodUsingFields(long r02, long r2);

    private static final native String[] nativeGetMethodUsingStrings(long r02, long r2);

    private static final native byte[] nativeGetParameterAnnotations(long r02, long r2);

    private static final native String[] nativeGetParameterNames(long r02, long r2);

    private static final native long nativeInitDexKit(String r02);

    private static final native long nativeInitDexKitByBytesArray(byte[][] r02);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader r02, boolean r1);

    private static final native void nativeInitFullCache(long r02);

    private static final native void nativeRelease(long r02);

    private static final native void nativeSetThreadNum(long r02, int r2);

    private final MethodDataList readFieldMethods$dexkit_android_release(long r5) {
        byte[] r52 = Companion.access$nativeFieldGetMethods(Companion, access$getSafeToken(this), r5);
        MethodMetaArrayHolder.Companion r6 = MethodMetaArrayHolder.Companion;
        ByteBuffer r53 = ByteBuffer.wrap(r52);
        AbstractC0307g.m702d(r53, "wrap(res)");
        MethodMetaArrayHolder r54 = r6.getRootAsMethodMetaArrayHolder(r53);
        MethodDataList r62 = new MethodDataList();
        int r02 = r54.getMethodsLength();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        MethodData.Companion r2 = MethodData.f4421Companion;
        MethodMeta r3 = r54.methods(r1);
        AbstractC0307g.m700b(r3);
        r62.add(r2.from(this, r3));
        r1 = r1 + 1;
        goto L3
    L5:
        return r62;
    }

    private final MethodDataList writeFieldMethods$dexkit_android_release(long r5) {
        byte[] r52 = Companion.access$nativeFieldPutMethods(Companion, access$getSafeToken(this), r5);
        MethodMetaArrayHolder.Companion r6 = MethodMetaArrayHolder.Companion;
        ByteBuffer r53 = ByteBuffer.wrap(r52);
        AbstractC0307g.m702d(r53, "wrap(res)");
        MethodMetaArrayHolder r54 = r6.getRootAsMethodMetaArrayHolder(r53);
        MethodDataList r62 = new MethodDataList();
        int r02 = r54.getMethodsLength();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        MethodData.Companion r2 = MethodData.f4421Companion;
        MethodMeta r3 = r54.methods(r1);
        AbstractC0307g.m700b(r3);
        r62.add(r2.from(this, r3));
        r1 = r1 + 1;
        goto L3
    L5:
        return r62;
    }

    public final Map<String, ClassDataList> batchFindClassUsingStrings(BatchFindClassUsingStrings r12) {
        AbstractC0307g.m703e(r12, "batchFind");
        C0733b r02 = new C0733b();
        BaseQuery.access$innerBuild(r12, r02);
        byte[] r122 = Companion.access$nativeBatchFindClassUsingStrings(Companion, access$getSafeToken(this), r02.m1934q());
        BatchClassMetaArrayHolder.Companion r03 = BatchClassMetaArrayHolder.Companion;
        ByteBuffer r123 = ByteBuffer.wrap(r122);
        AbstractC0307g.m702d(r123, "wrap(res)");
        BatchClassMetaArrayHolder r124 = r03.getRootAsBatchClassMetaArrayHolder(r123);
        HashMap r04 = new HashMap();
        int r1 = r124.getItemsLength();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L11;
        BatchClassMeta r4 = r124.items(r3);
        AbstractC0307g.m700b(r4);
        String r5 = r4.getUnionKey();
        AbstractC0307g.m700b(r5);
        ClassDataList r6 = new ClassDataList();
        int r7 = r4.getClassesLength();
        int r8 = 0;
    L5:
        if (r8 >= r7) goto L8;
        ClassData.Companion r9 = ClassData.f4419Companion;
        ClassMeta r10 = r4.classes(r8);
        AbstractC0307g.m700b(r10);
        r6.add(r9.from(this, r10));
        r8 = r8 + 1;
        goto L5
    L8:
        if (r6.size() <= 1) goto L10;
        AbstractC0187r.m560l0(r6, new DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1());
    L10:
        r04.put(r5, r6);
        r3 = r3 + 1;
        goto L3
    L11:
        return r04;
    }

    public final Map<String, MethodDataList> batchFindMethodUsingStrings(BatchFindMethodUsingStrings r12) {
        AbstractC0307g.m703e(r12, "batchFind");
        C0733b r02 = new C0733b();
        BaseQuery.access$innerBuild(r12, r02);
        byte[] r122 = Companion.access$nativeBatchFindMethodUsingStrings(Companion, access$getSafeToken(this), r02.m1934q());
        BatchMethodMetaArrayHolder.Companion r03 = BatchMethodMetaArrayHolder.Companion;
        ByteBuffer r123 = ByteBuffer.wrap(r122);
        AbstractC0307g.m702d(r123, "wrap(res)");
        BatchMethodMetaArrayHolder r124 = r03.getRootAsBatchMethodMetaArrayHolder(r123);
        HashMap r04 = new HashMap();
        int r1 = r124.getItemsLength();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L11;
        BatchMethodMeta r4 = r124.items(r3);
        AbstractC0307g.m700b(r4);
        String r5 = r4.getUnionKey();
        AbstractC0307g.m700b(r5);
        MethodDataList r6 = new MethodDataList();
        int r7 = r4.getMethodsLength();
        int r8 = 0;
    L5:
        if (r8 >= r7) goto L8;
        MethodData.Companion r9 = MethodData.f4421Companion;
        MethodMeta r10 = r4.methods(r8);
        AbstractC0307g.m700b(r10);
        r6.add(r9.from(this, r10));
        r8 = r8 + 1;
        goto L5
    L8:
        if (r6.size() <= 1) goto L10;
        AbstractC0187r.m560l0(r6, new DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1());
    L10:
        r04.put(r5, r6);
        r3 = r3 + 1;
        goto L3
    L11:
        return r04;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (isValid() == false) goto L9;
        Companion.access$nativeRelease(Companion, this.token);     // Catch: Throwable -> L7
        this.token = 0;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    public final void exportDexFile(String r4) {
        AbstractC0307g.m703e(r4, "outPath");
        Companion.access$nativeExportDexFile(Companion, getSafeToken(), r4);
    }

    public final void finalize() {
        close();
    }

    public final ClassDataList findClass(FindClass r6) {
        AbstractC0307g.m703e(r6, "findClass");
        C0733b r02 = new C0733b();
        BaseQuery.access$innerBuild(r6, r02);
        byte[] r62 = Companion.access$nativeFindClass(Companion, access$getSafeToken(this), r02.m1934q());
        ClassMetaArrayHolder.Companion r03 = ClassMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        ClassMetaArrayHolder r64 = r03.getRootAsClassMetaArrayHolder(r63);
        ClassDataList r04 = new ClassDataList();
        int r1 = r64.getClassesLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        ClassData.Companion r3 = ClassData.f4419Companion;
        ClassMeta r4 = r64.classes(r2);
        AbstractC0307g.m700b(r4);
        r04.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L6:
        if (r04.size() <= 1) goto L8;
        AbstractC0187r.m560l0(r04, new DexKitBridge$findClass$$inlined$sortBy$1());
    L8:
        return r04;
    }

    public final FieldDataList findField(FindField r6) {
        AbstractC0307g.m703e(r6, "findField");
        C0733b r02 = new C0733b();
        BaseQuery.access$innerBuild(r6, r02);
        byte[] r62 = Companion.access$nativeFindField(Companion, access$getSafeToken(this), r02.m1934q());
        FieldMetaArrayHolder.Companion r03 = FieldMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        FieldMetaArrayHolder r64 = r03.getRootAsFieldMetaArrayHolder(r63);
        FieldDataList r04 = new FieldDataList();
        int r1 = r64.getFieldsLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        FieldData.Companion r3 = FieldData.f4420Companion;
        FieldMeta r4 = r64.fields(r2);
        AbstractC0307g.m700b(r4);
        r04.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L6:
        if (r04.size() <= 1) goto L8;
        AbstractC0187r.m560l0(r04, new DexKitBridge$findField$$inlined$sortBy$1());
    L8:
        return r04;
    }

    public final MethodDataList findMethod(FindMethod r6) {
        AbstractC0307g.m703e(r6, "findMethod");
        C0733b r02 = new C0733b();
        BaseQuery.access$innerBuild(r6, r02);
        byte[] r62 = Companion.access$nativeFindMethod(Companion, access$getSafeToken(this), r02.m1934q());
        MethodMetaArrayHolder.Companion r03 = MethodMetaArrayHolder.Companion;
        ByteBuffer r63 = ByteBuffer.wrap(r62);
        AbstractC0307g.m702d(r63, "wrap(res)");
        MethodMetaArrayHolder r64 = r03.getRootAsMethodMetaArrayHolder(r63);
        MethodDataList r04 = new MethodDataList();
        int r1 = r64.getMethodsLength();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        MethodData.Companion r3 = MethodData.f4421Companion;
        MethodMeta r4 = r64.methods(r2);
        AbstractC0307g.m700b(r4);
        r04.add(r3.from(this, r4));
        r2 = r2 + 1;
        goto L3
    L6:
        if (r04.size() <= 1) goto L8;
        AbstractC0187r.m560l0(r04, new DexKitBridge$findMethod$$inlined$sortBy$1());
    L8:
        return r04;
    }

    public final ClassData getClassData(String r4) {
        AbstractC0307g.m703e(r4, "identifier");
        if (r4.length() == 0) goto L20;
        if (r4.charAt(0) == 'L') goto L7;
    L13:
        r4 = AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r4, '.', '/'), ";");
    L14:
        new DexClass(r4);
        byte[] r42 = Companion.access$nativeGetClassData(Companion, getSafeToken(), r4);
        if (r42 == null) goto L17;
        ClassData.Companion r02 = ClassData.f4419Companion;
        ClassMeta.Companion r1 = ClassMeta.Companion;
        ByteBuffer r43 = ByteBuffer.wrap(r42);
        AbstractC0307g.m702d(r43, "wrap(it)");
        return r02.from(this, r1.getRootAsClassMeta(r43));
    L17:
        return null;
    L7:
        if (r4.length() == 0) goto L12;
        if (r4.charAt(AbstractC0425j.m1007L0(r4)) != ';') goto L13;
    L12:
        throw new NoSuchElementException("Char sequence is empty.");
    L20:
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public final int getDexNum() {
        return Companion.access$nativeGetDexNum(Companion, getSafeToken());
    }

    public final FieldData getFieldData(Field r2) {
        AbstractC0307g.m703e(r2, "field");
        return getFieldData(DexSignUtil.getDescriptor(r2));
    }

    public final MethodData getMethodData(Method r2) {
        AbstractC0307g.m703e(r2, "method");
        return getMethodData(DexSignUtil.getDescriptor(r2));
    }

    public final void initFullCache() {
        Companion.access$nativeInitFullCache(Companion, getSafeToken());
    }

    public final boolean isValid() {
        if (this.token == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setThreadNum(int r4) {
        Companion.access$nativeSetThreadNum(Companion, getSafeToken(), r4);
    }

    public /* synthetic */ DexKitBridge(String r1, AbstractC0304d r2) {
        this(r1);
    }

    public static final DexKitBridge create(String r1) {
        return Companion.create(r1);
    }

    public final FieldData getFieldData(String r4) {
        AbstractC0307g.m703e(r4, "descriptor");
        new DexField(r4);
        byte[] r42 = Companion.access$nativeGetFieldData(Companion, getSafeToken(), r4);
        if (r42 == null) goto L5;
        FieldData.Companion r02 = FieldData.f4420Companion;
        FieldMeta.Companion r1 = FieldMeta.Companion;
        ByteBuffer r43 = ByteBuffer.wrap(r42);
        AbstractC0307g.m702d(r43, "wrap(it)");
        return r02.from(this, r1.getRootAsFieldMeta(r43));
    L5:
        return null;
    }

    public final MethodData getMethodData(Constructor<?> r2) {
        AbstractC0307g.m703e(r2, "constructor");
        return getMethodData(DexSignUtil.getDescriptor(r2));
    }

    public /* synthetic */ DexKitBridge(byte[][] r1, AbstractC0304d r2) {
        this(r1);
    }

    public static final DexKitBridge create(byte[][] r1) {
        return Companion.create(r1);
    }

    public final MethodData getMethodData(String r4) {
        AbstractC0307g.m703e(r4, "descriptor");
        new DexMethod(r4);
        byte[] r42 = Companion.access$nativeGetMethodData(Companion, getSafeToken(), r4);
        if (r42 == null) goto L5;
        MethodData.Companion r02 = MethodData.f4421Companion;
        MethodMeta.Companion r1 = MethodMeta.Companion;
        ByteBuffer r43 = ByteBuffer.wrap(r42);
        AbstractC0307g.m702d(r43, "wrap(it)");
        return r02.from(this, r1.getRootAsMethodMeta(r43));
    L5:
        return null;
    }

    private DexKitBridge(String r3) {
        this.token = Companion.access$nativeInitDexKit(Companion, r3);
    }

    private final Map<String, ClassDataList> batchFindClassUsingStrings(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        BatchFindClassUsingStrings r02 = new BatchFindClassUsingStrings();
        r2.invoke(r02);
        return batchFindClassUsingStrings(r02);
    }

    private final Map<String, MethodDataList> batchFindMethodUsingStrings(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        BatchFindMethodUsingStrings r02 = new BatchFindMethodUsingStrings();
        r2.invoke(r02);
        return batchFindMethodUsingStrings(r02);
    }

    private final ClassDataList findClass(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindClass r02 = new FindClass();
        r2.invoke(r02);
        return findClass(r02);
    }

    private final FieldDataList findField(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindField r02 = new FindField();
        r2.invoke(r02);
        return findField(r02);
    }

    private final MethodDataList findMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindMethod r02 = new FindMethod();
        r2.invoke(r02);
        return findMethod(r02);
    }

    private DexKitBridge(byte[][] r3) {
        this.token = Companion.access$nativeInitDexKitByBytesArray(Companion, r3);
    }

    private DexKitBridge(ClassLoader r2, boolean r3) {
        this.token = Companion.access$nativeInitDexKitByClassLoader(Companion, r2, r3);
    }

    public final ClassData getClassData(Class<?> r2) {
        AbstractC0307g.m703e(r2, "clazz");
        return getClassData(DexSignUtil.getDescriptor(r2));
    }
}

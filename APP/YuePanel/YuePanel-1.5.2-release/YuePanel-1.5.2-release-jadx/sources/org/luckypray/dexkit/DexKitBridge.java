package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.C3411;
import Yue.C3884;
import Yue.C4033;
import Yue.C4335;
import Yue.C4750;
import Yue.C5499;
import Yue.C7627;
import Yue.C7633;
import Yue.C8107;
import Yue.InterfaceC5124;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
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
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
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

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDexKitBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitBridge.kt\norg/luckypray/dexkit/DexKitBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,765:1\n1#2:766\n1000#3,2:767\n1000#3,2:769\n1000#3,2:771\n1000#3,2:773\n1000#3,2:775\n11328#4:777\n11663#4,3:778\n*S KotlinDebug\n*F\n+ 1 DexKitBridge.kt\norg/luckypray/dexkit/DexKitBridge\n*L\n390#1:767,2\n410#1:769,2\n426#1:771,2\n440#1:773,2\n454#1:775,2\n526#1:777\n526#1:778,3\n*E\n"})
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0012\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tB\u0019\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eJ)\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010H\u0000¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0004¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020%¢\u0006\u0004\b)\u0010'J\u0015\u0010,\u001a\u00020%2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020%2\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b/\u0010-J\r\u00100\u001a\u00020*¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020%2\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u0010\u0005J!\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u00105\u001a\u000204¢\u0006\u0004\b\u0018\u00106J!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00162\u0006\u00105\u001a\u000207¢\u0006\u0004\b\u001b\u00108J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u000209¢\u0006\u0004\b\u001c\u0010:J\u0015\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020;¢\u0006\u0004\b\u001e\u0010<J\u0015\u0010!\u001a\u00020 2\u0006\u0010!\u001a\u00020=¢\u0006\u0004\b!\u0010>J\u001b\u0010B\u001a\u0004\u0018\u00010A2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030?¢\u0006\u0004\bB\u0010CJ\u0017\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020\u0002¢\u0006\u0004\bB\u0010EJ\u0017\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u001b\u0010I\u001a\u0004\u0018\u00010H2\n\u0010L\u001a\u0006\u0012\u0002\b\u00030K¢\u0006\u0004\bI\u0010MJ\u0017\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010N\u001a\u00020\u0002¢\u0006\u0004\bI\u0010OJ\u0017\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bS\u0010TJ\u0017\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010N\u001a\u00020\u0002¢\u0006\u0004\bS\u0010UJ2\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u00162\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b\u0018\u0010XJ2\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00162\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b\u001b\u0010XJ&\u0010\u001c\u001a\u00020\u00172\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b\u001c\u0010YJ&\u0010\u001e\u001a\u00020\u001a2\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b\u001e\u0010ZJ&\u0010!\u001a\u00020 2\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b!\u0010[J\u0017\u0010`\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\\H\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010c\u001a\u00020\u001a2\u0006\u0010]\u001a\u00020\\H\u0000¢\u0006\u0004\ba\u0010bJ\u0017\u0010f\u001a\u00020 2\u0006\u0010]\u001a\u00020\\H\u0000¢\u0006\u0004\bd\u0010eJ\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010g\u001a\u00020\u0011H\u0000¢\u0006\u0004\bj\u0010kJ\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010m\u001a\u00020\u0011H\u0000¢\u0006\u0004\bn\u0010kJ\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010p\u001a\u00020\u0011H\u0000¢\u0006\u0004\bq\u0010kJ!\u0010u\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010h2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0004\bt\u0010kJ#\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0h0h2\u0006\u0010p\u001a\u00020\u0011H\u0000¢\u0006\u0004\bv\u0010kJ\u0017\u0010z\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0004\b{\u0010yJ\u001d\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0004\b}\u0010kJ\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0h2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0080\u0001\u0010kJ\u0019\u0010\u0083\u0001\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0082\u0001\u0010yJ\u0019\u0010\u0085\u0001\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0084\u0001\u0010yJ\u001f\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020*0h2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0086\u0001\u0010kR\u0019\u0010\u0088\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0014\u0010\u008d\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0090\u0001"}, d2 = {"Lorg/luckypray/dexkit/DexKitBridge;", "Ljava/io/Closeable;", "", "apkPath", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "", "", "dexBytesArray", "([[B)V", "Ljava/lang/ClassLoader;", "classLoader", "", "useMemoryDexFile", "(Ljava/lang/ClassLoader;Z)V", C4750.f10502, "Lkotlin/Function1;", "", "block", "withNativeWriteToken", "(LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "encodeBytes", "", "Lorg/luckypray/dexkit/result/ClassDataList;", "batchFindClassUsingStrings", "([B)Ljava/util/Map;", "Lorg/luckypray/dexkit/result/MethodDataList;", "batchFindMethodUsingStrings", "findClass", "([B)Lorg/luckypray/dexkit/result/ClassDataList;", "findMethod", "([B)Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/result/FieldDataList;", "findField", "([B)Lorg/luckypray/dexkit/result/FieldDataList;", "withNativeReadToken$dexkit_android_release", "withNativeReadToken", "LYue/ۥۣۢ۠ۤ;", "close", "()V", "finalize", "initFullCache", "", "num", "setThreadNum", "(I)V", "maxConcurrentQueries", "setMaxConcurrentQueries", "getDexNum", "()I", "outPath", "exportDexFile", "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "batchFind", "(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;", "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;", "Lorg/luckypray/dexkit/query/FindClass;", "(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;", "Lorg/luckypray/dexkit/query/FindMethod;", "(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/query/FindField;", "(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;", "Ljava/lang/Class;", "clazz", "Lorg/luckypray/dexkit/result/ClassData;", "getClassData", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/result/ClassData;", "identifier", "(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;", "Ljava/lang/reflect/Method;", "method", "Lorg/luckypray/dexkit/result/MethodData;", "getMethodData", "(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/result/MethodData;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/result/MethodData;", "descriptor", "(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;", "Ljava/lang/reflect/Field;", "field", "Lorg/luckypray/dexkit/result/FieldData;", "getFieldData", "(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/result/FieldData;", "(Ljava/lang/String;)Lorg/luckypray/dexkit/result/FieldData;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Ljava/util/Map;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/ClassDataList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/MethodDataList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/FieldDataList;", "", "encodeIdArray", "getTypeByIds$dexkit_android_release", "([J)Lorg/luckypray/dexkit/result/ClassDataList;", "getTypeByIds", "getMethodByIds$dexkit_android_release", "([J)Lorg/luckypray/dexkit/result/MethodDataList;", "getMethodByIds", "getFieldByIds$dexkit_android_release", "([J)Lorg/luckypray/dexkit/result/FieldDataList;", "getFieldByIds", "classId", "", "Lorg/luckypray/dexkit/result/AnnotationData;", "getClassAnnotations$dexkit_android_release", "(J)Ljava/util/List;", "getClassAnnotations", "fieldId", "getFieldAnnotations$dexkit_android_release", "getFieldAnnotations", "methodId", "getMethodAnnotations$dexkit_android_release", "getMethodAnnotations", "encodeId", "getParameterNames$dexkit_android_release", "getParameterNames", "getParameterAnnotations$dexkit_android_release", "getParameterAnnotations", "getCallMethods$dexkit_android_release", "(J)Lorg/luckypray/dexkit/result/MethodDataList;", "getCallMethods", "getInvokeMethods$dexkit_android_release", "getInvokeMethods", "getMethodUsingStrings$dexkit_android_release", "getMethodUsingStrings", "Lorg/luckypray/dexkit/result/UsingFieldData;", "getMethodUsingFields$dexkit_android_release", "getMethodUsingFields", "readFieldMethods$dexkit_android_release", "readFieldMethods", "writeFieldMethods$dexkit_android_release", "writeFieldMethods", "getMethodOpCodes$dexkit_android_release", "getMethodOpCodes", "token", "J", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lifecycleLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "isValid", "()Z", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6399
    private final ReentrantReadWriteLock lifecycleLock;
    private volatile long token;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0010H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u001b\u0010\u0018J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b#\u0010\"J \u0010$\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b$\u0010\"J \u0010%\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b%\u0010\"J \u0010&\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b&\u0010\"J\"\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b(\u0010)J\"\u0010*\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b*\u0010)J\"\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b+\u0010)J \u0010.\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0083 ¢\u0006\u0004\b.\u0010/J \u00100\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0083 ¢\u0006\u0004\b0\u0010/J \u00101\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0083 ¢\u0006\u0004\b1\u0010/J \u00103\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b3\u00104J \u00106\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b6\u00104J \u00108\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b8\u00104J \u00109\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b9\u00104J \u0010;\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b;\u0010<J \u0010>\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b>\u00104J \u0010?\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b?\u00104J \u0010@\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b@\u00104J \u0010A\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\bA\u00104J \u0010B\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\bB\u00104J\u0017\u0010D\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bD\u0010EJ\u001d\u0010D\u001a\u00020C2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0FH\u0007¢\u0006\u0004\bD\u0010HJ\u001f\u0010D\u001a\u00020C2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\bD\u0010IJ&\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040F2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\bJ\u0010KJ*\u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010F2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\bL\u0010KJ\u001e\u0010M\u001a\u00020\u00062\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0FH\u0083 ¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lorg/luckypray/dexkit/DexKitBridge$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "apkPath", "", "nativeInitDexKit", "(Ljava/lang/String;)J", "Ljava/lang/ClassLoader;", "loader", "", "useMemoryDexFile", "nativeInitDexKitByClassLoader", "(Ljava/lang/ClassLoader;Z)J", "nativePtr", "", "threadNum", "LYue/ۥۣۢ۠ۤ;", "nativeSetThreadNum", "(JI)V", "maxConcurrentQueries", "nativeSetMaxConcurrentQueries", "nativeInitFullCache", "(J)V", "nativeGetDexNum", "(J)I", "nativeRelease", "outDir", "nativeExportDexFile", "(JLjava/lang/String;)V", "", "bytes", "nativeBatchFindClassUsingStrings", "(J[B)[B", "nativeBatchFindMethodUsingStrings", "nativeFindClass", "nativeFindMethod", "nativeFindField", "dexDescriptor", "nativeGetClassData", "(JLjava/lang/String;)[B", "nativeGetMethodData", "nativeGetFieldData", "", "ids", "nativeGetClassByIds", "(J[J)[B", "nativeGetMethodByIds", "nativeGetFieldByIds", "classId", "nativeGetClassAnnotations", "(JJ)[B", "fieldId", "nativeGetFieldAnnotations", "methodId", "nativeGetMethodAnnotations", "nativeGetParameterAnnotations", "", "nativeGetMethodOpCodes", "(JJ)[I", "encodeId", "nativeGetCallMethods", "nativeGetInvokeMethods", "nativeGetMethodUsingFields", "nativeFieldGetMethods", "nativeFieldPutMethods", "Lorg/luckypray/dexkit/DexKitBridge;", "create", "(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;", "", "dexBytesArray", "([[B)Lorg/luckypray/dexkit/DexKitBridge;", "(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;", "nativeGetMethodUsingStrings", "(JJ)Lkotlin/Array;", "nativeGetParameterNames", "nativeInitDexKitByBytesArray", "(Lkotlin/Array;)J", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.DexKitBridge.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeBatchFindClassUsingStrings(long nativePtr, byte[] bytes) {
            return DexKitBridge.nativeBatchFindClassUsingStrings(nativePtr, bytes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeBatchFindMethodUsingStrings(long nativePtr, byte[] bytes) {
            return DexKitBridge.nativeBatchFindMethodUsingStrings(nativePtr, bytes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final void nativeExportDexFile(long nativePtr, String outDir) {
            DexKitBridge.nativeExportDexFile(nativePtr, outDir);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeFieldGetMethods(long nativePtr, long encodeId) {
            return DexKitBridge.nativeFieldGetMethods(nativePtr, encodeId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeFieldPutMethods(long nativePtr, long encodeId) {
            return DexKitBridge.nativeFieldPutMethods(nativePtr, encodeId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeFindClass(long nativePtr, byte[] bytes) {
            return DexKitBridge.nativeFindClass(nativePtr, bytes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeFindField(long nativePtr, byte[] bytes) {
            return DexKitBridge.nativeFindField(nativePtr, bytes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeFindMethod(long nativePtr, byte[] bytes) {
            return DexKitBridge.nativeFindMethod(nativePtr, bytes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetCallMethods(long nativePtr, long encodeId) {
            return DexKitBridge.nativeGetCallMethods(nativePtr, encodeId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetClassAnnotations(long nativePtr, long classId) {
            return DexKitBridge.nativeGetClassAnnotations(nativePtr, classId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetClassByIds(long nativePtr, long[] ids) {
            return DexKitBridge.nativeGetClassByIds(nativePtr, ids);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetClassData(long nativePtr, String dexDescriptor) {
            return DexKitBridge.nativeGetClassData(nativePtr, dexDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final int nativeGetDexNum(long nativePtr) {
            return DexKitBridge.nativeGetDexNum(nativePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetFieldAnnotations(long nativePtr, long fieldId) {
            return DexKitBridge.nativeGetFieldAnnotations(nativePtr, fieldId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetFieldByIds(long nativePtr, long[] ids) {
            return DexKitBridge.nativeGetFieldByIds(nativePtr, ids);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetFieldData(long nativePtr, String dexDescriptor) {
            return DexKitBridge.nativeGetFieldData(nativePtr, dexDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetInvokeMethods(long nativePtr, long encodeId) {
            return DexKitBridge.nativeGetInvokeMethods(nativePtr, encodeId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetMethodAnnotations(long nativePtr, long methodId) {
            return DexKitBridge.nativeGetMethodAnnotations(nativePtr, methodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetMethodByIds(long nativePtr, long[] ids) {
            return DexKitBridge.nativeGetMethodByIds(nativePtr, ids);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetMethodData(long nativePtr, String dexDescriptor) {
            return DexKitBridge.nativeGetMethodData(nativePtr, dexDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final int[] nativeGetMethodOpCodes(long nativePtr, long methodId) {
            return DexKitBridge.nativeGetMethodOpCodes(nativePtr, methodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetMethodUsingFields(long nativePtr, long encodeId) {
            return DexKitBridge.nativeGetMethodUsingFields(nativePtr, encodeId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final String[] nativeGetMethodUsingStrings(long j, long j2) {
            return DexKitBridge.nativeGetMethodUsingStrings(j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final byte[] nativeGetParameterAnnotations(long nativePtr, long methodId) {
            return DexKitBridge.nativeGetParameterAnnotations(nativePtr, methodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final String[] nativeGetParameterNames(long j, long j2) {
            return DexKitBridge.nativeGetParameterNames(j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final long nativeInitDexKit(String apkPath) {
            return DexKitBridge.nativeInitDexKit(apkPath);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final long nativeInitDexKitByBytesArray(byte[][] bArr) {
            return DexKitBridge.nativeInitDexKitByBytesArray(bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final long nativeInitDexKitByClassLoader(ClassLoader loader, boolean useMemoryDexFile) {
            return DexKitBridge.nativeInitDexKitByClassLoader(loader, useMemoryDexFile);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final void nativeInitFullCache(long nativePtr) {
            DexKitBridge.nativeInitFullCache(nativePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final void nativeRelease(long nativePtr) {
            DexKitBridge.nativeRelease(nativePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final void nativeSetMaxConcurrentQueries(long nativePtr, int maxConcurrentQueries) {
            DexKitBridge.nativeSetMaxConcurrentQueries(nativePtr, maxConcurrentQueries);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5578
        public final void nativeSetThreadNum(long nativePtr, int threadNum) {
            DexKitBridge.nativeSetThreadNum(nativePtr, threadNum);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5578
        public final DexKitBridge create(@InterfaceC6399 String apkPath) {
            C5499.m17103(apkPath, "apkPath");
            return new DexKitBridge(apkPath, (C4335) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5578
        public final DexKitBridge create(@InterfaceC6399 byte[][] dexBytesArray) {
            C5499.m17103(dexBytesArray, "dexBytesArray");
            return new DexKitBridge(dexBytesArray, (C4335) null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final DexKitBridge create(@InterfaceC6399 ClassLoader loader, boolean useMemoryDexFile) {
            C5499.m17103(loader, "loader");
            try {
                if (Class.forName("dalvik.system.BaseDexClassLoader").isInstance(loader)) {
                    return new DexKitBridge(loader, useMemoryDexFile, null);
                }
                throw new IllegalStateException("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)".toString());
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("This method requires Android runtime".toString());
            }
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$exportDexFile$1 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LYue/ۥۣۢ۠ۤ;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C29121 extends AbstractC5673 implements InterfaceC5124<Long, C8107> {
        final /* synthetic */ String $outPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29121(String str) {
            super(1);
            this.$outPath = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Long l) {
            invoke(l.longValue());
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final void invoke(long j) {
            DexKitBridge.INSTANCE.nativeExportDexFile(j, this.$outPath);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getClassData$1 */
    @InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "", "it", "", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29131 extends AbstractC5673 implements InterfaceC5124<Long, byte[]> {
        final /* synthetic */ String $descriptor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29131(String str) {
            super(1);
            this.$descriptor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ byte[] invoke(Long l) {
            return invoke(l.longValue());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6489
        public final byte[] invoke(long j) {
            return DexKitBridge.INSTANCE.nativeGetClassData(j, this.$descriptor);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getDexNum$1 */
    @InterfaceC6211(m2698d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m2699d2 = {"<anonymous>", "", "it", "", "invoke", "(J)Ljava/lang/Integer;"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29141 extends AbstractC5673 implements InterfaceC5124<Long, Integer> {
        public static final C29141 INSTANCE = new C29141();

        public C29141() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final Integer invoke(long j) {
            return Integer.valueOf(DexKitBridge.INSTANCE.nativeGetDexNum(j));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ Integer invoke(Long l) {
            return invoke(l.longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getFieldData$1 */
    @InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "", "it", "", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29151 extends AbstractC5673 implements InterfaceC5124<Long, byte[]> {
        final /* synthetic */ String $descriptor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29151(String str) {
            super(1);
            this.$descriptor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ byte[] invoke(Long l) {
            return invoke(l.longValue());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6489
        public final byte[] invoke(long j) {
            return DexKitBridge.INSTANCE.nativeGetFieldData(j, this.$descriptor);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getMethodData$1 */
    @InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "", "it", "", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29161 extends AbstractC5673 implements InterfaceC5124<Long, byte[]> {
        final /* synthetic */ String $descriptor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29161(String str) {
            super(1);
            this.$descriptor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ byte[] invoke(Long l) {
            return invoke(l.longValue());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6489
        public final byte[] invoke(long j) {
            return DexKitBridge.INSTANCE.nativeGetMethodData(j, this.$descriptor);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$initFullCache$1 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LYue/ۥۣۢ۠ۤ;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C29171 extends AbstractC5673 implements InterfaceC5124<Long, C8107> {
        public static final C29171 INSTANCE = new C29171();

        public C29171() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Long l) {
            invoke(l.longValue());
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final void invoke(long j) {
            DexKitBridge.INSTANCE.nativeInitFullCache(j);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$setMaxConcurrentQueries$2 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LYue/ۥۣۢ۠ۤ;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C29182 extends AbstractC5673 implements InterfaceC5124<Long, C8107> {
        final /* synthetic */ int $maxConcurrentQueries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29182(int i) {
            super(1);
            this.$maxConcurrentQueries = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Long l) {
            invoke(l.longValue());
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final void invoke(long j) {
            DexKitBridge.INSTANCE.nativeSetMaxConcurrentQueries(j, this.$maxConcurrentQueries);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$setThreadNum$2 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LYue/ۥۣۢ۠ۤ;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C29192 extends AbstractC5673 implements InterfaceC5124<Long, C8107> {
        final /* synthetic */ int $num;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29192(int i) {
            super(1);
            this.$num = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Long l) {
            invoke(l.longValue());
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final void invoke(long j) {
            DexKitBridge.INSTANCE.nativeSetThreadNum(j, this.$num);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.ClassLoader), (r2v0 boolean) A[MD:(java.lang.ClassLoader, boolean):void (m)] (LINE:1) call: org.luckypray.dexkit.DexKitBridge.<init>(java.lang.ClassLoader, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DexKitBridge(ClassLoader classLoader, boolean z, C4335 c4335) {
        this(classLoader, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final DexKitBridge create(@InterfaceC6399 ClassLoader classLoader, boolean z) {
        return INSTANCE.create(classLoader, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeBatchFindClassUsingStrings(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeBatchFindMethodUsingStrings(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native void nativeExportDexFile(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeFieldGetMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeFieldPutMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeFindClass(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeFindField(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeFindMethod(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetCallMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetClassAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetClassByIds(long j, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetClassData(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native int nativeGetDexNum(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetFieldAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetFieldByIds(long j, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetFieldData(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetInvokeMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetMethodAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetMethodByIds(long j, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetMethodData(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native int[] nativeGetMethodOpCodes(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetMethodUsingFields(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native String[] nativeGetMethodUsingStrings(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native byte[] nativeGetParameterAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native String[] nativeGetParameterNames(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native long nativeInitDexKit(String str);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native void nativeInitFullCache(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native void nativeRelease(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native void nativeSetMaxConcurrentQueries(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5578
    public static final native void nativeSetThreadNum(long j, int i);

    private final <T> T withNativeWriteToken(InterfaceC5124<? super Long, ? extends T> block) {
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
                return block.invoke(Long.valueOf(j));
            }
            throw new IllegalStateException("DexKitBridge is not valid".toString());
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final Map<String, ClassDataList> batchFindClassUsingStrings(@InterfaceC6399 BatchFindClassUsingStrings batchFind) {
        C5499.m17103(batchFind, "batchFind");
        return batchFindClassUsingStrings(batchFind.serializedBytes$dexkit_android_release());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final Map<String, MethodDataList> batchFindMethodUsingStrings(@InterfaceC6399 BatchFindMethodUsingStrings batchFind) {
        C5499.m17103(batchFind, "batchFind");
        return batchFindMethodUsingStrings(batchFind.serializedBytes$dexkit_android_release());
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, ARITH, INVOKE] complete} */
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
            INSTANCE.nativeRelease(j);
            C8107 c8107 = C8107.f3222;
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

    public final void exportDexFile(@InterfaceC6399 String outPath) {
        C5499.m17103(outPath, "outPath");
        withNativeReadToken$dexkit_android_release(new C29121(outPath));
    }

    public final void finalize() {
        close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassDataList findClass(@InterfaceC6399 FindClass findClass) {
        C5499.m17103(findClass, "findClass");
        return findClass(findClass.serializedBytes$dexkit_android_release());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldDataList findField(@InterfaceC6399 FindField findField) {
        C5499.m17103(findField, "findField");
        return findField(findField.serializedBytes$dexkit_android_release());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodDataList findMethod(@InterfaceC6399 FindMethod findMethod) {
        C5499.m17103(findMethod, "findMethod");
        return findMethod(findMethod.serializedBytes$dexkit_android_release());
    }

    public final /* synthetic */ MethodDataList getCallMethods$dexkit_android_release(long encodeId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getCallMethods$res$1(encodeId));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.INSTANCE;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            C5499.m17100(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    public final /* synthetic */ List getClassAnnotations$dexkit_android_release(long classId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getClassAnnotations$res$1(classId));
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i = 0; i < annotationsLength; i++) {
            AnnotationData.Companion companion2 = AnnotationData.INSTANCE;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i);
            C5499.m17100(annotationMetaAnnotations);
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final ClassData getClassData(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        return getClassData(DexSignUtil.getDescriptor(clazz));
    }

    public final int getDexNum() {
        return ((Number) withNativeReadToken$dexkit_android_release(C29141.INSTANCE)).intValue();
    }

    public final /* synthetic */ List getFieldAnnotations$dexkit_android_release(long fieldId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getFieldAnnotations$res$1(fieldId));
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i = 0; i < annotationsLength; i++) {
            AnnotationData.Companion companion2 = AnnotationData.INSTANCE;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i);
            C5499.m17100(annotationMetaAnnotations);
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    public final /* synthetic */ FieldDataList getFieldByIds$dexkit_android_release(long[] encodeIdArray) {
        C5499.m17103(encodeIdArray, "encodeIdArray");
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getFieldByIds$res$1(encodeIdArray));
        FieldMetaArrayHolder.Companion companion = FieldMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        FieldMetaArrayHolder rootAsFieldMetaArrayHolder = companion.getRootAsFieldMetaArrayHolder(byteBufferWrap);
        FieldDataList fieldDataList = new FieldDataList();
        int fieldsLength = rootAsFieldMetaArrayHolder.getFieldsLength();
        for (int i = 0; i < fieldsLength; i++) {
            FieldData.Companion companion2 = FieldData.INSTANCE;
            FieldMeta fieldMetaFields = rootAsFieldMetaArrayHolder.fields(i);
            C5499.m17100(fieldMetaFields);
            fieldDataList.add(companion2.from(this, fieldMetaFields));
        }
        return fieldDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final FieldData getFieldData(@InterfaceC6399 Field field) {
        C5499.m17103(field, "field");
        return getFieldData(DexSignUtil.getDescriptor(field));
    }

    public final /* synthetic */ MethodDataList getInvokeMethods$dexkit_android_release(long encodeId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getInvokeMethods$res$1(encodeId));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.INSTANCE;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            C5499.m17100(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    public final /* synthetic */ List getMethodAnnotations$dexkit_android_release(long methodId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodAnnotations$res$1(methodId));
        AnnotationMetaArrayHolder.Companion companion = AnnotationMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        AnnotationMetaArrayHolder rootAsAnnotationMetaArrayHolder = companion.getRootAsAnnotationMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsLength = rootAsAnnotationMetaArrayHolder.getAnnotationsLength();
        for (int i = 0; i < annotationsLength; i++) {
            AnnotationData.Companion companion2 = AnnotationData.INSTANCE;
            AnnotationMeta annotationMetaAnnotations = rootAsAnnotationMetaArrayHolder.annotations(i);
            C5499.m17100(annotationMetaAnnotations);
            arrayList.add(companion2.from(this, annotationMetaAnnotations));
        }
        return arrayList;
    }

    public final /* synthetic */ MethodDataList getMethodByIds$dexkit_android_release(long[] encodeIdArray) {
        C5499.m17103(encodeIdArray, "encodeIdArray");
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodByIds$res$1(encodeIdArray));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.INSTANCE;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            C5499.m17100(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final MethodData getMethodData(@InterfaceC6399 Method method) {
        C5499.m17103(method, "method");
        return getMethodData(DexSignUtil.getDescriptor(method));
    }

    public final /* synthetic */ List getMethodOpCodes$dexkit_android_release(long encodeId) {
        return C3411.m8924((int[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodOpCodes$1(encodeId)));
    }

    public final /* synthetic */ List getMethodUsingFields$dexkit_android_release(long encodeId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodUsingFields$res$1(encodeId));
        UsingFieldMetaArrayHolder.Companion companion = UsingFieldMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        UsingFieldMetaArrayHolder rootAsUsingFieldMetaArrayHolder = companion.getRootAsUsingFieldMetaArrayHolder(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int itemsLength = rootAsUsingFieldMetaArrayHolder.getItemsLength();
        for (int i = 0; i < itemsLength; i++) {
            UsingFieldData.Companion companion2 = UsingFieldData.f30972Companion;
            UsingFieldMeta usingFieldMetaItems = rootAsUsingFieldMetaArrayHolder.items(i);
            C5499.m17100(usingFieldMetaItems);
            arrayList.add(companion2.from(this, usingFieldMetaItems));
        }
        return arrayList;
    }

    public final /* synthetic */ List getMethodUsingStrings$dexkit_android_release(long encodeId) {
        return C3411.m8926((Object[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getMethodUsingStrings$1(encodeId)));
    }

    public final /* synthetic */ List getParameterAnnotations$dexkit_android_release(long methodId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getParameterAnnotations$res$1(methodId));
        ParametersAnnotationMetaArrayHoler.Companion companion = ParametersAnnotationMetaArrayHoler.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        ParametersAnnotationMetaArrayHoler rootAsParametersAnnotationMetaArrayHoler = companion.getRootAsParametersAnnotationMetaArrayHoler(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int annotationsArrayLength = rootAsParametersAnnotationMetaArrayHoler.getAnnotationsArrayLength();
        for (int i = 0; i < annotationsArrayLength; i++) {
            AnnotationMetaArrayHolder annotationMetaArrayHolderAnnotationsArray = rootAsParametersAnnotationMetaArrayHoler.annotationsArray(i);
            C5499.m17100(annotationMetaArrayHolderAnnotationsArray);
            ArrayList arrayList2 = new ArrayList();
            int annotationsLength = annotationMetaArrayHolderAnnotationsArray.getAnnotationsLength();
            for (int i2 = 0; i2 < annotationsLength; i2++) {
                AnnotationData.Companion companion2 = AnnotationData.INSTANCE;
                AnnotationMeta annotationMetaAnnotations = annotationMetaArrayHolderAnnotationsArray.annotations(i2);
                C5499.m17100(annotationMetaAnnotations);
                arrayList2.add(companion2.from(this, annotationMetaAnnotations));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final /* synthetic */ List getParameterNames$dexkit_android_release(long encodeId) {
        String[] strArr = (String[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getParameterNames$1(encodeId));
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public final /* synthetic */ ClassDataList getTypeByIds$dexkit_android_release(long[] encodeIdArray) {
        C5499.m17103(encodeIdArray, "encodeIdArray");
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$getTypeByIds$res$1(encodeIdArray));
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i = 0; i < classesLength; i++) {
            ClassData.Companion companion2 = ClassData.INSTANCE;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i);
            C5499.m17100(classMetaClasses);
            classDataList.add(companion2.from(this, classMetaClasses));
        }
        return classDataList;
    }

    public final void initFullCache() {
        withNativeReadToken$dexkit_android_release(C29171.INSTANCE);
    }

    public final boolean isValid() {
        return this.token != 0;
    }

    public final /* synthetic */ MethodDataList readFieldMethods$dexkit_android_release(long encodeId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$readFieldMethods$res$1(encodeId));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.INSTANCE;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            C5499.m17100(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    public final void setMaxConcurrentQueries(int maxConcurrentQueries) {
        if (maxConcurrentQueries < 0) {
            throw new IllegalArgumentException("maxConcurrentQueries must be >= 0".toString());
        }
        withNativeWriteToken(new C29182(maxConcurrentQueries));
    }

    public final void setThreadNum(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("threadNum must be > 0".toString());
        }
        withNativeWriteToken(new C29192(num));
    }

    public final /* synthetic */ Object withNativeReadToken$dexkit_android_release(InterfaceC5124 block) {
        C5499.m17103(block, "block");
        ReentrantReadWriteLock.ReadLock lock = this.lifecycleLock.readLock();
        lock.lock();
        try {
            long j = this.token;
            if (j != 0) {
                return block.invoke(Long.valueOf(j));
            }
            throw new IllegalStateException("DexKitBridge is not valid".toString());
        } finally {
            lock.unlock();
        }
    }

    public final /* synthetic */ MethodDataList writeFieldMethods$dexkit_android_release(long encodeId) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$writeFieldMethods$res$1(encodeId));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.INSTANCE;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            C5499.m17100(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        return methodDataList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] (LINE:2) call: org.luckypray.dexkit.DexKitBridge.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ DexKitBridge(String str, C4335 c4335) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final DexKitBridge create(@InterfaceC6399 String str) {
        return INSTANCE.create(str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢ۠ۢۤ.ۥۣۣ۟۠(java.lang.String, char, char, boolean, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final ClassData getClassData(@InterfaceC6399 String identifier) {
        C5499.m17103(identifier, "identifier");
        if (C7633.m24246(identifier) != 'L' || C7633.m24271(identifier) != ';') {
            identifier = "L" + C7627.m23997(identifier, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/', false, 4, null) + ";";
        }
        new DexClass(identifier);
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new C29131(identifier));
        if (bArr == null) {
            return null;
        }
        ClassData.Companion companion = ClassData.INSTANCE;
        ClassMeta.Companion companion2 = ClassMeta.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(it)");
        return companion.from(this, companion2.getRootAsClassMeta(byteBufferWrap));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final FieldData getFieldData(@InterfaceC6399 String descriptor) {
        C5499.m17103(descriptor, "descriptor");
        new DexField(descriptor);
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new C29151(descriptor));
        if (bArr == null) {
            return null;
        }
        FieldData.Companion companion = FieldData.INSTANCE;
        FieldMeta.Companion companion2 = FieldMeta.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(it)");
        return companion.from(this, companion2.getRootAsFieldMeta(byteBufferWrap));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final MethodData getMethodData(@InterfaceC6399 Constructor<?> constructor) {
        C5499.m17103(constructor, "constructor");
        return getMethodData(DexSignUtil.getDescriptor(constructor));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 byte[][]) A[MD:(byte[][]):void (m)] (LINE:3) call: org.luckypray.dexkit.DexKitBridge.<init>(byte[][]):void type: THIS */
    public /* synthetic */ DexKitBridge(byte[][] bArr, C4335 c4335) {
        this(bArr);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final DexKitBridge create(@InterfaceC6399 byte[][] bArr) {
        return INSTANCE.create(bArr);
    }

    public final /* synthetic */ Map batchFindClassUsingStrings(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        BatchFindClassUsingStrings batchFindClassUsingStrings = new BatchFindClassUsingStrings();
        init.invoke(batchFindClassUsingStrings);
        return batchFindClassUsingStrings(batchFindClassUsingStrings);
    }

    public final /* synthetic */ Map batchFindMethodUsingStrings(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        BatchFindMethodUsingStrings batchFindMethodUsingStrings = new BatchFindMethodUsingStrings();
        init.invoke(batchFindMethodUsingStrings);
        return batchFindMethodUsingStrings(batchFindMethodUsingStrings);
    }

    public final /* synthetic */ ClassDataList findClass(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindClass findClass = new FindClass();
        init.invoke(findClass);
        return findClass(findClass);
    }

    public final /* synthetic */ FieldDataList findField(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindField findField = new FindField();
        init.invoke(findField);
        return findField(findField);
    }

    public final /* synthetic */ MethodDataList findMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindMethod findMethod = new FindMethod();
        init.invoke(findMethod);
        return findMethod(findMethod);
    }

    @InterfaceC6489
    public final MethodData getMethodData(@InterfaceC6399 String descriptor) {
        C5499.m17103(descriptor, "descriptor");
        new DexMethod(descriptor);
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new C29161(descriptor));
        if (bArr == null) {
            return null;
        }
        MethodData.Companion companion = MethodData.INSTANCE;
        MethodMeta.Companion companion2 = MethodMeta.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(it)");
        return companion.from(this, companion2.getRootAsMethodMeta(byteBufferWrap));
    }

    private DexKitBridge(String str) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = INSTANCE.nativeInitDexKit(str);
    }

    private final Map<String, ClassDataList> batchFindClassUsingStrings(byte[] encodeBytes) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$batchFindClassUsingStrings$res$1(encodeBytes));
        BatchClassMetaArrayHolder.Companion companion = BatchClassMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        BatchClassMetaArrayHolder rootAsBatchClassMetaArrayHolder = companion.getRootAsBatchClassMetaArrayHolder(byteBufferWrap);
        HashMap map = new HashMap();
        int itemsLength = rootAsBatchClassMetaArrayHolder.getItemsLength();
        for (int i = 0; i < itemsLength; i++) {
            BatchClassMeta batchClassMetaItems = rootAsBatchClassMetaArrayHolder.items(i);
            C5499.m17100(batchClassMetaItems);
            String unionKey = batchClassMetaItems.getUnionKey();
            C5499.m17100(unionKey);
            ClassDataList classDataList = new ClassDataList();
            int classesLength = batchClassMetaItems.getClassesLength();
            for (int i2 = 0; i2 < classesLength; i2++) {
                ClassData.Companion companion2 = ClassData.INSTANCE;
                ClassMeta classMetaClasses = batchClassMetaItems.classes(i2);
                C5499.m17100(classMetaClasses);
                classDataList.add(companion2.from(this, classMetaClasses));
            }
            if (classDataList.size() > 1) {
                C3884.m10770(classDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return C4033.m11389(((ClassData) t).getDescriptor(), ((ClassData) t2).getDescriptor());
                    }
                });
            }
            map.put(unionKey, classDataList);
        }
        return map;
    }

    private final Map<String, MethodDataList> batchFindMethodUsingStrings(byte[] encodeBytes) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$batchFindMethodUsingStrings$res$1(encodeBytes));
        BatchMethodMetaArrayHolder.Companion companion = BatchMethodMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        BatchMethodMetaArrayHolder rootAsBatchMethodMetaArrayHolder = companion.getRootAsBatchMethodMetaArrayHolder(byteBufferWrap);
        HashMap map = new HashMap();
        int itemsLength = rootAsBatchMethodMetaArrayHolder.getItemsLength();
        for (int i = 0; i < itemsLength; i++) {
            BatchMethodMeta batchMethodMetaItems = rootAsBatchMethodMetaArrayHolder.items(i);
            C5499.m17100(batchMethodMetaItems);
            String unionKey = batchMethodMetaItems.getUnionKey();
            C5499.m17100(unionKey);
            MethodDataList methodDataList = new MethodDataList();
            int methodsLength = batchMethodMetaItems.getMethodsLength();
            for (int i2 = 0; i2 < methodsLength; i2++) {
                MethodData.Companion companion2 = MethodData.INSTANCE;
                MethodMeta methodMetaMethods = batchMethodMetaItems.methods(i2);
                C5499.m17100(methodMetaMethods);
                methodDataList.add(companion2.from(this, methodMetaMethods));
            }
            if (methodDataList.size() > 1) {
                C3884.m10770(methodDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return C4033.m11389(((MethodData) t).getDescriptor(), ((MethodData) t2).getDescriptor());
                    }
                });
            }
            map.put(unionKey, methodDataList);
        }
        return map;
    }

    private final ClassDataList findClass(byte[] encodeBytes) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$findClass$res$1(encodeBytes));
        ClassMetaArrayHolder.Companion companion = ClassMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        ClassMetaArrayHolder rootAsClassMetaArrayHolder = companion.getRootAsClassMetaArrayHolder(byteBufferWrap);
        ClassDataList classDataList = new ClassDataList();
        int classesLength = rootAsClassMetaArrayHolder.getClassesLength();
        for (int i = 0; i < classesLength; i++) {
            ClassData.Companion companion2 = ClassData.INSTANCE;
            ClassMeta classMetaClasses = rootAsClassMetaArrayHolder.classes(i);
            C5499.m17100(classMetaClasses);
            classDataList.add(companion2.from(this, classMetaClasses));
        }
        if (classDataList.size() > 1) {
            C3884.m10770(classDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C4033.m11389(((ClassData) t).getDescriptor(), ((ClassData) t2).getDescriptor());
                }
            });
        }
        return classDataList;
    }

    private final FieldDataList findField(byte[] encodeBytes) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$findField$res$1(encodeBytes));
        FieldMetaArrayHolder.Companion companion = FieldMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        FieldMetaArrayHolder rootAsFieldMetaArrayHolder = companion.getRootAsFieldMetaArrayHolder(byteBufferWrap);
        FieldDataList fieldDataList = new FieldDataList();
        int fieldsLength = rootAsFieldMetaArrayHolder.getFieldsLength();
        for (int i = 0; i < fieldsLength; i++) {
            FieldData.Companion companion2 = FieldData.INSTANCE;
            FieldMeta fieldMetaFields = rootAsFieldMetaArrayHolder.fields(i);
            C5499.m17100(fieldMetaFields);
            fieldDataList.add(companion2.from(this, fieldMetaFields));
        }
        if (fieldDataList.size() > 1) {
            C3884.m10770(fieldDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C4033.m11389(((FieldData) t).getDescriptor(), ((FieldData) t2).getDescriptor());
                }
            });
        }
        return fieldDataList;
    }

    private final MethodDataList findMethod(byte[] encodeBytes) {
        byte[] bArr = (byte[]) withNativeReadToken$dexkit_android_release(new DexKitBridge$findMethod$res$1(encodeBytes));
        MethodMetaArrayHolder.Companion companion = MethodMetaArrayHolder.INSTANCE;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(res)");
        MethodMetaArrayHolder rootAsMethodMetaArrayHolder = companion.getRootAsMethodMetaArrayHolder(byteBufferWrap);
        MethodDataList methodDataList = new MethodDataList();
        int methodsLength = rootAsMethodMetaArrayHolder.getMethodsLength();
        for (int i = 0; i < methodsLength; i++) {
            MethodData.Companion companion2 = MethodData.INSTANCE;
            MethodMeta methodMetaMethods = rootAsMethodMetaArrayHolder.methods(i);
            C5499.m17100(methodMetaMethods);
            methodDataList.add(companion2.from(this, methodMetaMethods));
        }
        if (methodDataList.size() > 1) {
            C3884.m10770(methodDataList, new Comparator<T>() { // from class: org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C4033.m11389(((MethodData) t).getDescriptor(), ((MethodData) t2).getDescriptor());
                }
            });
        }
        return methodDataList;
    }

    private DexKitBridge(byte[][] bArr) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = INSTANCE.nativeInitDexKitByBytesArray(bArr);
    }

    private DexKitBridge(ClassLoader classLoader, boolean z) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = INSTANCE.nativeInitDexKitByClassLoader(classLoader, z);
    }
}

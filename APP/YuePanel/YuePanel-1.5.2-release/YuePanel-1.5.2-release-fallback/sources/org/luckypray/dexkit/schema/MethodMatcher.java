package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 g2\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000e\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u001f\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b&\u0010(J\u001b\u0010,\u001a\u00020)2\u0006\u0010!\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J \u00102\u001a\u00020/2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010,\u001a\u00020)ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u000e\u001a\u000205¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0004\u0018\u0001052\u0006\u0010\u000e\u001a\u000205¢\u0006\u0004\b8\u00107J\u0015\u00109\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b9\u0010.J\u0017\u0010:\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J\u001f\u0010:\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b:\u0010<J\u0017\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b=\u0010;J\u001f\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b>\u0010;J\u001f\u0010>\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b>\u0010<R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0011\u0010R\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bQ\u0010MR\u0011\u0010U\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bV\u0010MR\u0013\u00106\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bZ\u0010YR\u0013\u0010^\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010`\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b_\u0010TR\u0011\u0010b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\ba\u0010MR\u0011\u0010d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bc\u0010MR\u0011\u0010f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\be\u0010M\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Lorg/luckypray/dexkit/schema/-MethodMatcher;", "Lcom/google/flatbuffers/Table;", "<init>", "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "obj", "methodName", "(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "accessFlags", "(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "declaringClass", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "returnType", "Lorg/luckypray/dexkit/schema/-ParametersMatcher;", "parameters", "(Lorg/luckypray/dexkit/schema/-ParametersMatcher;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;", "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "opCodes", "(Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "j", "usingStrings", "(I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "usingFields", "(I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "(Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "LYue/ۥۢۢۥۥ;", "usingNumbersType-Wa3L5BU", "(I)B", "usingNumbersType", "usingNumbersTypeInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "mutateUsingNumbersType-EK-6454", "(IB)Z", "mutateUsingNumbersType", "usingNumbers", "(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;", "Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "invokingMethods", "(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "methodCallers", "protoShortyInByteBuffer", "allOf", "(I)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "anyOf", "noneOf", "getMethodName", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "getAccessFlags", "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "getDeclaringClass", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getReturnType", "getParameters", "()Lorg/luckypray/dexkit/schema/-ParametersMatcher;", "getAnnotations", "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "getOpCodes", "()Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "getUsingStringsLength", "()I", "usingStringsLength", "getUsingFieldsLength", "usingFieldsLength", "getUsingNumbersTypeLength", "usingNumbersTypeLength", "getUsingNumbersTypeAsByteBuffer", "()Ljava/nio/ByteBuffer;", "usingNumbersTypeAsByteBuffer", "getUsingNumbersLength", "usingNumbersLength", "getInvokingMethods", "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getMethodCallers", "", "getProtoShorty", "()Ljava/lang/String;", "protoShorty", "getProtoShortyAsByteBuffer", "protoShortyAsByteBuffer", "getAllOfLength", "allOfLength", "getAnyOfLength", "anyOfLength", "getNoneOfLength", "noneOfLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodMatcher extends com.google.flatbuffers.Table {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.schema.MethodMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher$Companion */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ\u009d\u0001\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u000f¢\u0006\u0004\b)\u0010'J\u001d\u0010+\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u000f¢\u0006\u0004\b+\u0010'J\u001d\u0010-\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0004\b-\u0010'J\u001d\u0010/\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u000f¢\u0006\u0004\b/\u0010'J\u001d\u00101\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000f¢\u0006\u0004\b1\u0010'J\u001d\u00103\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020\u000f¢\u0006\u0004\b3\u0010'J\u001d\u00105\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u00020\u000f¢\u0006\u0004\b5\u0010'J\u001d\u00108\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\b;\u0010'J\u001d\u0010=\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\b=\u0010'J\u001d\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\b>\u00109J\u001d\u0010?\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\b?\u0010'J\u001d\u0010A\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u000f¢\u0006\u0004\bA\u0010'J\"\u0010E\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020BH\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001d\u0010F\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bF\u0010'J\u001d\u0010H\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u000f¢\u0006\u0004\bH\u0010'J\u001d\u0010I\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\bI\u00109J\u001d\u0010J\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bJ\u0010'J\u001d\u0010L\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u000f¢\u0006\u0004\bL\u0010'J\u001d\u0010N\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u000f¢\u0006\u0004\bN\u0010'J\u001d\u0010P\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010O\u001a\u00020\u000f¢\u0006\u0004\bP\u0010'J\u001d\u0010R\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u000f¢\u0006\u0004\bR\u0010'J\u001d\u0010S\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\bS\u00109J\u001d\u0010T\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bT\u0010'J\u001d\u0010V\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u000f¢\u0006\u0004\bV\u0010'J\u001d\u0010W\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\bW\u00109J\u001d\u0010X\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bX\u0010'J\u001d\u0010Z\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\u000f¢\u0006\u0004\bZ\u0010'J\u001d\u0010[\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\b[\u00109J\u001d\u0010\\\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\b\\\u0010'J\u0015\u0010]\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;", "", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-MethodMatcher;", "getRootAsMethodMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "obj", "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMatcher;)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "methodNameOffset", "accessFlagsOffset", "declaringClassOffset", "returnTypeOffset", "parametersOffset", "annotationsOffset", "opCodesOffset", "usingStringsOffset", "usingFieldsOffset", "usingNumbersTypeOffset", "usingNumbersOffset", "invokingMethodsOffset", "methodCallersOffset", "protoShortyOffset", "allOfOffset", "anyOfOffset", "noneOfOffset", "createMethodMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIIIIIIIIIII)I", "startMethodMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "methodName", "addMethodName", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "accessFlags", "addAccessFlags", "declaringClass", "addDeclaringClass", "returnType", "addReturnType", "parameters", "addParameters", "annotations", "addAnnotations", "opCodes", "addOpCodes", "usingStrings", "addUsingStrings", "", "data", "createUsingStringsVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startUsingStringsVector", "usingFields", "addUsingFields", "createUsingFieldsVector", "startUsingFieldsVector", "usingNumbersType", "addUsingNumbersType", "LYue/ۥۢۢۥۦ;", "createUsingNumbersTypeVector-VU-fvBY", "(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I", "createUsingNumbersTypeVector", "startUsingNumbersTypeVector", "usingNumbers", "addUsingNumbers", "createUsingNumbersVector", "startUsingNumbersVector", "invokingMethods", "addInvokingMethods", "methodCallers", "addMethodCallers", "protoShorty", "addProtoShorty", "allOf", "addAllOf", "createAllOfVector", "startAllOfVector", "anyOf", "addAnyOf", "createAnyOfVector", "startAnyOfVector", "noneOf", "addNoneOf", "createNoneOfVector", "startNoneOfVector", "endMethodMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void addAccessFlags(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 1
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addAllOf(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 14
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addAnnotations(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 5
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addAnyOf(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 15
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addDeclaringClass(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 2
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addInvokingMethods(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 11
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addMethodCallers(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 12
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addMethodName(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addNoneOf(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 16
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addOpCodes(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 6
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addParameters(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 4
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addProtoShorty(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 13
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addReturnType(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 3
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingFields(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 8
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingNumbers(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 10
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingNumbersType(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 9
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingStrings(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 7
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final int createAllOfVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.length
                r1 = 4
                r3.startVector(r1, r0, r1)
                int r0 = r4.length
                int r0 = r0 + (-1)
            L12:
                r1 = -1
                if (r1 >= r0) goto L1d
                r1 = r4[r0]
                r3.addOffset(r1)
                int r0 = r0 + (-1)
                goto L12
            L1d:
                int r3 = r3.endVector()
                return r3
        }

        public final int createAnyOfVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.length
                r1 = 4
                r3.startVector(r1, r0, r1)
                int r0 = r4.length
                int r0 = r0 + (-1)
            L12:
                r1 = -1
                if (r1 >= r0) goto L1d
                r1 = r4[r0]
                r3.addOffset(r1)
                int r0 = r0 + (-1)
                goto L12
            L1d:
                int r3 = r3.endVector()
                return r3
        }

        public final int createMethodMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21) {
                r3 = this;
                r0 = r3
                r1 = r4
                java.lang.String r2 = "builder"
                Yue.C3329.m13906(r4, r2)
                r2 = 17
                r4.startTable(r2)
                r2 = r21
                r3.addNoneOf(r4, r2)
                r2 = r20
                r3.addAnyOf(r4, r2)
                r2 = r19
                r3.addAllOf(r4, r2)
                r2 = r18
                r3.addProtoShorty(r4, r2)
                r2 = r17
                r3.addMethodCallers(r4, r2)
                r2 = r16
                r3.addInvokingMethods(r4, r2)
                r2 = r15
                r3.addUsingNumbers(r4, r15)
                r2 = r14
                r3.addUsingNumbersType(r4, r14)
                r2 = r13
                r3.addUsingFields(r4, r13)
                r2 = r12
                r3.addUsingStrings(r4, r12)
                r2 = r11
                r3.addOpCodes(r4, r11)
                r2 = r10
                r3.addAnnotations(r4, r10)
                r2 = r9
                r3.addParameters(r4, r9)
                r2 = r8
                r3.addReturnType(r4, r8)
                r2 = r7
                r3.addDeclaringClass(r4, r7)
                r2 = r6
                r3.addAccessFlags(r4, r6)
                r3.addMethodName(r4, r5)
                int r1 = r3.endMethodMatcher(r4)
                return r1
        }

        public final int createNoneOfVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.length
                r1 = 4
                r3.startVector(r1, r0, r1)
                int r0 = r4.length
                int r0 = r0 + (-1)
            L12:
                r1 = -1
                if (r1 >= r0) goto L1d
                r1 = r4[r0]
                r3.addOffset(r1)
                int r0 = r0 + (-1)
                goto L12
            L1d:
                int r3 = r3.endVector()
                return r3
        }

        public final int createUsingFieldsVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.length
                r1 = 4
                r3.startVector(r1, r0, r1)
                int r0 = r4.length
                int r0 = r0 + (-1)
            L12:
                r1 = -1
                if (r1 >= r0) goto L1d
                r1 = r4[r0]
                r3.addOffset(r1)
                int r0 = r0 + (-1)
                goto L12
            L1d:
                int r3 = r3.endVector()
                return r3
        }

        @Yue.InterfaceC2314
        /* JADX INFO: renamed from: createUsingNumbersTypeVector-VU-fvBY, reason: not valid java name */
        public final int m30845createUsingNumbersTypeVectorVUfvBY(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 byte[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = Yue.C6519.m24859(r4)
                r1 = 1
                r3.startVector(r1, r0, r1)
                int r0 = Yue.C6519.m24859(r4)
                int r0 = r0 - r1
            L17:
                r1 = -1
                if (r1 >= r0) goto L24
                byte r1 = Yue.C6519.m24858(r4, r0)
                r3.addByte(r1)
                int r0 = r0 + (-1)
                goto L17
            L24:
                int r3 = r3.endVector()
                return r3
        }

        public final int createUsingNumbersVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.length
                r1 = 4
                r3.startVector(r1, r0, r1)
                int r0 = r4.length
                int r0 = r0 + (-1)
            L12:
                r1 = -1
                if (r1 >= r0) goto L1d
                r1 = r4[r0]
                r3.addOffset(r1)
                int r0 = r0 + (-1)
                goto L12
            L1d:
                int r3 = r3.endVector()
                return r3
        }

        public final int createUsingStringsVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.length
                r1 = 4
                r3.startVector(r1, r0, r1)
                int r0 = r4.length
                int r0 = r0 + (-1)
            L12:
                r1 = -1
                if (r1 >= r0) goto L1d
                r1 = r4[r0]
                r3.addOffset(r1)
                int r0 = r0 + (-1)
                goto L12
            L1d:
                int r3 = r3.endVector()
                return r3
        }

        public final int endMethodMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                int r2 = r2.endTable()
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.MethodMatcher getRootAsMethodMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-MethodMatcher r2 = r1.getRootAsMethodMatcher(r2, r0)
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.MethodMatcher getRootAsMethodMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.MethodMatcher r4) {
                r2 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "obj"
                Yue.C3329.m13906(r4, r0)
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                r3.order(r0)
                int r0 = r3.position()
                int r0 = r3.getInt(r0)
                int r1 = r3.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-MethodMatcher r3 = r4.__assign(r0, r3)
                return r3
        }

        public final void startAllOfVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 4
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startAnyOfVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 4
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startMethodMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 17
                r2.startTable(r0)
                return
        }

        public final void startNoneOfVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 4
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startUsingFieldsVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 4
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startUsingNumbersTypeVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 1
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startUsingNumbersVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 4
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startUsingStringsVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 4
                r2.startVector(r0, r3, r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r0 = new org.luckypray.dexkit.schema.-MethodMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.MethodMatcher.Companion = r0
            return
    }

    public MethodMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.schema.MethodMatcher __assign(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
            r1 = this;
            java.lang.String r0 = "_bb"
            Yue.C3329.m13906(r3, r0)
            r1.__init(r2, r3)
            return r1
    }

    public final void __init(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
            r1 = this;
            java.lang.String r0 = "_bb"
            Yue.C3329.m13906(r3, r0)
            r1.__reset(r2, r3)
            return
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.AccessFlagsMatcher accessFlags(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.AccessFlagsMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L1f
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r4 = r4.__assign(r0, r1)
            goto L20
        L1f:
            r4 = 0
        L20:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodMatcher allOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodMatcher r2 = r1.allOf(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodMatcher allOf(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.MethodMatcher r3, int r4) {
            r2 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r3, r0)
            r0 = 32
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L24
            int r0 = r2.__vector(r0)
            int r4 = r4 * 4
            int r0 = r0 + r4
            int r4 = r2.__indirect(r0)
            java.nio.ByteBuffer r0 = r2.bb
            java.lang.String r1 = "bb"
            Yue.C3329.m13905(r0, r1)
            org.luckypray.dexkit.schema.-MethodMatcher r3 = r3.__assign(r4, r0)
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.AnnotationsMatcher annotations(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationsMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 14
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-AnnotationsMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodMatcher anyOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodMatcher r2 = r1.anyOf(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodMatcher anyOf(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.MethodMatcher r3, int r4) {
            r2 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r3, r0)
            r0 = 34
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L24
            int r0 = r2.__vector(r0)
            int r4 = r4 * 4
            int r0 = r0 + r4
            int r4 = r2.__indirect(r0)
            java.nio.ByteBuffer r0 = r2.bb
            java.lang.String r1 = "bb"
            Yue.C3329.m13905(r0, r1)
            org.luckypray.dexkit.schema.-MethodMatcher r3 = r3.__assign(r4, r0)
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher declaringClass(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.ClassMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-ClassMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.AccessFlagsMatcher getAccessFlags() {
            r1 = this;
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = new org.luckypray.dexkit.schema.-AccessFlagsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = r1.accessFlags(r0)
            return r0
    }

    public final int getAllOfLength() {
            r1 = this;
            r0 = 32
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.AnnotationsMatcher getAnnotations() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = r1.annotations(r0)
            return r0
    }

    public final int getAnyOfLength() {
            r1 = this;
            r0 = 34
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher getDeclaringClass() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.declaringClass(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodsMatcher getInvokingMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = r1.invokingMethods(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodsMatcher getMethodCallers() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = r1.methodCallers(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.StringMatcher getMethodName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r0 = r1.methodName(r0)
            return r0
    }

    public final int getNoneOfLength() {
            r1 = this;
            r0 = 36
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.OpCodesMatcher getOpCodes() {
            r1 = this;
            org.luckypray.dexkit.schema.-OpCodesMatcher r0 = new org.luckypray.dexkit.schema.-OpCodesMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-OpCodesMatcher r0 = r1.opCodes(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ParametersMatcher getParameters() {
            r1 = this;
            org.luckypray.dexkit.schema.-ParametersMatcher r0 = new org.luckypray.dexkit.schema.-ParametersMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ParametersMatcher r0 = r1.parameters(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final java.lang.String getProtoShorty() {
            r2 = this;
            r0 = 30
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L10
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            java.lang.String r0 = r2.__string(r0)
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Yue.InterfaceC4418
    public final java.nio.ByteBuffer getProtoShortyAsByteBuffer() {
            r2 = this;
            r0 = 30
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            java.lang.String r1 = "__vector_as_bytebuffer(30, 1)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher getReturnType() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.returnType(r0)
            return r0
    }

    public final int getUsingFieldsLength() {
            r1 = this;
            r0 = 20
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final int getUsingNumbersLength() {
            r1 = this;
            r0 = 24
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Yue.InterfaceC4418
    public final java.nio.ByteBuffer getUsingNumbersTypeAsByteBuffer() {
            r2 = this;
            r0 = 22
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            java.lang.String r1 = "__vector_as_bytebuffer(22, 1)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    public final int getUsingNumbersTypeLength() {
            r1 = this;
            r0 = 22
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final int getUsingStringsLength() {
            r1 = this;
            r0 = 18
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodsMatcher invokingMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.MethodsMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 26
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-MethodsMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodsMatcher methodCallers(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.MethodsMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 28
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-MethodsMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.StringMatcher methodName(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.StringMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 4
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L1f
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-StringMatcher r4 = r4.__assign(r0, r1)
            goto L20
        L1f:
            r4 = 0
        L20:
            return r4
    }

    /* JADX INFO: renamed from: mutateUsingNumbersType-EK-6454, reason: not valid java name */
    public final boolean m30843mutateUsingNumbersTypeEK6454(int r3, byte r4) {
            r2 = this;
            r0 = 22
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L14
            java.nio.ByteBuffer r1 = r2.bb
            int r0 = r2.__vector(r0)
            int r0 = r0 + r3
            r1.put(r0, r4)
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodMatcher noneOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodMatcher r2 = r1.noneOf(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodMatcher noneOf(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.MethodMatcher r3, int r4) {
            r2 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r3, r0)
            r0 = 36
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L24
            int r0 = r2.__vector(r0)
            int r4 = r4 * 4
            int r0 = r0 + r4
            int r4 = r2.__indirect(r0)
            java.nio.ByteBuffer r0 = r2.bb
            java.lang.String r1 = "bb"
            Yue.C3329.m13905(r0, r1)
            org.luckypray.dexkit.schema.-MethodMatcher r3 = r3.__assign(r4, r0)
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.OpCodesMatcher opCodes(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.OpCodesMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 16
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-OpCodesMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ParametersMatcher parameters(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.ParametersMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 12
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-ParametersMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4418
    public final java.nio.ByteBuffer protoShortyInByteBuffer(@Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "_bb"
            Yue.C3329.m13906(r3, r0)
            r0 = 30
            r1 = 1
            java.nio.ByteBuffer r3 = r2.__vector_in_bytebuffer(r3, r0, r1)
            java.lang.String r0 = "__vector_in_bytebuffer(_bb, 30, 1)"
            Yue.C3329.m13905(r3, r0)
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher returnType(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.ClassMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 10
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-ClassMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.UsingFieldMatcher usingFields(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-UsingFieldMatcher r0 = new org.luckypray.dexkit.schema.-UsingFieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-UsingFieldMatcher r2 = r1.usingFields(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.UsingFieldMatcher usingFields(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.UsingFieldMatcher r3, int r4) {
            r2 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r3, r0)
            r0 = 20
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L24
            int r0 = r2.__vector(r0)
            int r4 = r4 * 4
            int r0 = r0 + r4
            int r4 = r2.__indirect(r0)
            java.nio.ByteBuffer r0 = r2.bb
            java.lang.String r1 = "bb"
            Yue.C3329.m13905(r0, r1)
            org.luckypray.dexkit.schema.-UsingFieldMatcher r3 = r3.__assign(r4, r0)
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @Yue.InterfaceC4543
    public final com.google.flatbuffers.Table usingNumbers(@Yue.InterfaceC4418 com.google.flatbuffers.Table r2, int r3) {
            r1 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r2, r0)
            r0 = 24
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L19
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r0 = r0 + r3
            com.google.flatbuffers.Table r2 = r1.__union(r2, r0)
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
    }

    /* JADX INFO: renamed from: usingNumbersType-Wa3L5BU, reason: not valid java name */
    public final byte m30844usingNumbersTypeWa3L5BU(int r3) {
            r2 = this;
            r0 = 22
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L18
            java.nio.ByteBuffer r1 = r2.bb
            int r0 = r2.__vector(r0)
            int r0 = r0 + r3
            byte r3 = r1.get(r0)
            byte r3 = Yue.C6517.m24798(r3)
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
    }

    @Yue.InterfaceC4418
    public final java.nio.ByteBuffer usingNumbersTypeInByteBuffer(@Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "_bb"
            Yue.C3329.m13906(r3, r0)
            r0 = 22
            r1 = 1
            java.nio.ByteBuffer r3 = r2.__vector_in_bytebuffer(r3, r0, r1)
            java.lang.String r0 = "__vector_in_bytebuffer(_bb, 22, 1)"
            Yue.C3329.m13905(r3, r0)
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.StringMatcher usingStrings(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r2 = r1.usingStrings(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.StringMatcher usingStrings(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.StringMatcher r3, int r4) {
            r2 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r3, r0)
            r0 = 18
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L24
            int r0 = r2.__vector(r0)
            int r4 = r4 * 4
            int r0 = r0 + r4
            int r4 = r2.__indirect(r0)
            java.nio.ByteBuffer r0 = r2.bb
            java.lang.String r1 = "bb"
            Yue.C3329.m13905(r0, r1)
            org.luckypray.dexkit.schema.-StringMatcher r3 = r3.__assign(r4, r0)
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }
}

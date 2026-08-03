package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.C5499;
import Yue.C8048;
import Yue.C8049;
import Yue.InterfaceC4776;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import androidx.core.graphics.drawable.IconCompat;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 g2\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000e\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u001f\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b&\u0010(J\u001b\u0010,\u001a\u00020)2\u0006\u0010!\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J \u00102\u001a\u00020/2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010,\u001a\u00020)ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u000e\u001a\u000205¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0004\u0018\u0001052\u0006\u0010\u000e\u001a\u000205¢\u0006\u0004\b8\u00107J\u0015\u00109\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b9\u0010.J\u0017\u0010:\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J\u001f\u0010:\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b:\u0010<J\u0017\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b=\u0010;J\u001f\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b>\u0010;J\u001f\u0010>\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b>\u0010<R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0011\u0010R\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bQ\u0010MR\u0011\u0010U\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bV\u0010MR\u0013\u00106\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bZ\u0010YR\u0013\u0010^\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010`\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b_\u0010TR\u0011\u0010b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\ba\u0010MR\u0011\u0010d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bc\u0010MR\u0011\u0010f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\be\u0010M\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Lorg/luckypray/dexkit/schema/-MethodMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "Lorg/luckypray/dexkit/schema/-StringMatcher;", IconCompat.f29473, "methodName", "(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "accessFlags", "(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "declaringClass", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "returnType", "Lorg/luckypray/dexkit/schema/-ParametersMatcher;", "parameters", "(Lorg/luckypray/dexkit/schema/-ParametersMatcher;)Lorg/luckypray/dexkit/schema/-ParametersMatcher;", "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "opCodes", "(Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "j", "usingStrings", "(I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "usingFields", "(I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "(Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;I)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "LYue/ۥۢۢۥۥ;", "usingNumbersType-Wa3L5BU", "(I)B", "usingNumbersType", "usingNumbersTypeInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "mutateUsingNumbersType-EK-6454", "(IB)Z", "mutateUsingNumbersType", "usingNumbers", "(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;", "Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "invokingMethods", "(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "methodCallers", "protoShortyInByteBuffer", "allOf", "(I)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "(Lorg/luckypray/dexkit/schema/-MethodMatcher;I)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "anyOf", "noneOf", "getMethodName", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "getAccessFlags", "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "getDeclaringClass", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getReturnType", "getParameters", "()Lorg/luckypray/dexkit/schema/-ParametersMatcher;", "getAnnotations", "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "getOpCodes", "()Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "getUsingStringsLength", "()I", "usingStringsLength", "getUsingFieldsLength", "usingFieldsLength", "getUsingNumbersTypeLength", "usingNumbersTypeLength", "getUsingNumbersTypeAsByteBuffer", "()Ljava/nio/ByteBuffer;", "usingNumbersTypeAsByteBuffer", "getUsingNumbersLength", "usingNumbersLength", "getInvokingMethods", "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getMethodCallers", "", "getProtoShorty", "()Ljava/lang/String;", "protoShorty", "getProtoShortyAsByteBuffer", "protoShortyAsByteBuffer", "getAllOfLength", "allOfLength", "getAnyOfLength", "anyOfLength", "getNoneOfLength", "noneOfLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ\u009d\u0001\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u000f¢\u0006\u0004\b)\u0010'J\u001d\u0010+\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u000f¢\u0006\u0004\b+\u0010'J\u001d\u0010-\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0004\b-\u0010'J\u001d\u0010/\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u000f¢\u0006\u0004\b/\u0010'J\u001d\u00101\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000f¢\u0006\u0004\b1\u0010'J\u001d\u00103\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020\u000f¢\u0006\u0004\b3\u0010'J\u001d\u00105\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u00020\u000f¢\u0006\u0004\b5\u0010'J\u001d\u00108\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\b;\u0010'J\u001d\u0010=\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\b=\u0010'J\u001d\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\b>\u00109J\u001d\u0010?\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\b?\u0010'J\u001d\u0010A\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u000f¢\u0006\u0004\bA\u0010'J\"\u0010E\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020BH\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001d\u0010F\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bF\u0010'J\u001d\u0010H\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u000f¢\u0006\u0004\bH\u0010'J\u001d\u0010I\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\bI\u00109J\u001d\u0010J\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bJ\u0010'J\u001d\u0010L\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u000f¢\u0006\u0004\bL\u0010'J\u001d\u0010N\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u000f¢\u0006\u0004\bN\u0010'J\u001d\u0010P\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010O\u001a\u00020\u000f¢\u0006\u0004\bP\u0010'J\u001d\u0010R\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u000f¢\u0006\u0004\bR\u0010'J\u001d\u0010S\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\bS\u00109J\u001d\u0010T\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bT\u0010'J\u001d\u0010V\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u000f¢\u0006\u0004\bV\u0010'J\u001d\u0010W\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\bW\u00109J\u001d\u0010X\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bX\u0010'J\u001d\u0010Z\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\u000f¢\u0006\u0004\bZ\u0010'J\u001d\u0010[\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\b[\u00109J\u001d\u0010\\\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\b\\\u0010'J\u0015\u0010]\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-MethodMatcher;", "getRootAsMethodMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMatcher;)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "methodNameOffset", "accessFlagsOffset", "declaringClassOffset", "returnTypeOffset", "parametersOffset", "annotationsOffset", "opCodesOffset", "usingStringsOffset", "usingFieldsOffset", "usingNumbersTypeOffset", "usingNumbersOffset", "invokingMethodsOffset", "methodCallersOffset", "protoShortyOffset", "allOfOffset", "anyOfOffset", "noneOfOffset", "createMethodMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIIIIIIIIIII)I", "startMethodMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "methodName", "addMethodName", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "accessFlags", "addAccessFlags", "declaringClass", "addDeclaringClass", "returnType", "addReturnType", "parameters", "addParameters", "annotations", "addAnnotations", "opCodes", "addOpCodes", "usingStrings", "addUsingStrings", "", "data", "createUsingStringsVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startUsingStringsVector", "usingFields", "addUsingFields", "createUsingFieldsVector", "startUsingFieldsVector", "usingNumbersType", "addUsingNumbersType", "LYue/ۥۢۢۥۦ;", "createUsingNumbersTypeVector-VU-fvBY", "(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I", "createUsingNumbersTypeVector", "startUsingNumbersTypeVector", "usingNumbers", "addUsingNumbers", "createUsingNumbersVector", "startUsingNumbersVector", "invokingMethods", "addInvokingMethods", "methodCallers", "addMethodCallers", "protoShorty", "addProtoShorty", "allOf", "addAllOf", "createAllOfVector", "startAllOfVector", "anyOf", "addAnyOf", "createAnyOfVector", "startAnyOfVector", "noneOf", "addNoneOf", "createNoneOfVector", "startNoneOfVector", "endMethodMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-MethodMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addAccessFlags(@InterfaceC6399 FlatBufferBuilder builder, int accessFlags) {
            C5499.m17103(builder, "builder");
            builder.addOffset(1, accessFlags, 0);
        }

        public final void addAllOf(@InterfaceC6399 FlatBufferBuilder builder, int allOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(14, allOf, 0);
        }

        public final void addAnnotations(@InterfaceC6399 FlatBufferBuilder builder, int annotations) {
            C5499.m17103(builder, "builder");
            builder.addOffset(5, annotations, 0);
        }

        public final void addAnyOf(@InterfaceC6399 FlatBufferBuilder builder, int anyOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(15, anyOf, 0);
        }

        public final void addDeclaringClass(@InterfaceC6399 FlatBufferBuilder builder, int declaringClass) {
            C5499.m17103(builder, "builder");
            builder.addOffset(2, declaringClass, 0);
        }

        public final void addInvokingMethods(@InterfaceC6399 FlatBufferBuilder builder, int invokingMethods) {
            C5499.m17103(builder, "builder");
            builder.addOffset(11, invokingMethods, 0);
        }

        public final void addMethodCallers(@InterfaceC6399 FlatBufferBuilder builder, int methodCallers) {
            C5499.m17103(builder, "builder");
            builder.addOffset(12, methodCallers, 0);
        }

        public final void addMethodName(@InterfaceC6399 FlatBufferBuilder builder, int methodName) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, methodName, 0);
        }

        public final void addNoneOf(@InterfaceC6399 FlatBufferBuilder builder, int noneOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(16, noneOf, 0);
        }

        public final void addOpCodes(@InterfaceC6399 FlatBufferBuilder builder, int opCodes) {
            C5499.m17103(builder, "builder");
            builder.addOffset(6, opCodes, 0);
        }

        public final void addParameters(@InterfaceC6399 FlatBufferBuilder builder, int parameters) {
            C5499.m17103(builder, "builder");
            builder.addOffset(4, parameters, 0);
        }

        public final void addProtoShorty(@InterfaceC6399 FlatBufferBuilder builder, int protoShorty) {
            C5499.m17103(builder, "builder");
            builder.addOffset(13, protoShorty, 0);
        }

        public final void addReturnType(@InterfaceC6399 FlatBufferBuilder builder, int returnType) {
            C5499.m17103(builder, "builder");
            builder.addOffset(3, returnType, 0);
        }

        public final void addUsingFields(@InterfaceC6399 FlatBufferBuilder builder, int usingFields) {
            C5499.m17103(builder, "builder");
            builder.addOffset(8, usingFields, 0);
        }

        public final void addUsingNumbers(@InterfaceC6399 FlatBufferBuilder builder, int usingNumbers) {
            C5499.m17103(builder, "builder");
            builder.addOffset(10, usingNumbers, 0);
        }

        public final void addUsingNumbersType(@InterfaceC6399 FlatBufferBuilder builder, int usingNumbersType) {
            C5499.m17103(builder, "builder");
            builder.addOffset(9, usingNumbersType, 0);
        }

        public final void addUsingStrings(@InterfaceC6399 FlatBufferBuilder builder, int usingStrings) {
            C5499.m17103(builder, "builder");
            builder.addOffset(7, usingStrings, 0);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createAllOfVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addOffset(data[length]);
            }
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createAnyOfVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addOffset(data[length]);
            }
        }

        public final int createMethodMatcher(@InterfaceC6399 FlatBufferBuilder builder, int methodNameOffset, int accessFlagsOffset, int declaringClassOffset, int returnTypeOffset, int parametersOffset, int annotationsOffset, int opCodesOffset, int usingStringsOffset, int usingFieldsOffset, int usingNumbersTypeOffset, int usingNumbersOffset, int invokingMethodsOffset, int methodCallersOffset, int protoShortyOffset, int allOfOffset, int anyOfOffset, int noneOfOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(17);
            addNoneOf(builder, noneOfOffset);
            addAnyOf(builder, anyOfOffset);
            addAllOf(builder, allOfOffset);
            addProtoShorty(builder, protoShortyOffset);
            addMethodCallers(builder, methodCallersOffset);
            addInvokingMethods(builder, invokingMethodsOffset);
            addUsingNumbers(builder, usingNumbersOffset);
            addUsingNumbersType(builder, usingNumbersTypeOffset);
            addUsingFields(builder, usingFieldsOffset);
            addUsingStrings(builder, usingStringsOffset);
            addOpCodes(builder, opCodesOffset);
            addAnnotations(builder, annotationsOffset);
            addParameters(builder, parametersOffset);
            addReturnType(builder, returnTypeOffset);
            addDeclaringClass(builder, declaringClassOffset);
            addAccessFlags(builder, accessFlagsOffset);
            addMethodName(builder, methodNameOffset);
            return endMethodMatcher(builder);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createNoneOfVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addOffset(data[length]);
            }
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createUsingFieldsVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addOffset(data[length]);
            }
        }

        @InterfaceC4776
        /* JADX INFO: renamed from: createUsingNumbersTypeVector-VU-fvBY, reason: not valid java name */
        public final int m31206createUsingNumbersTypeVectorVUfvBY(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 byte[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(1, C8049.m26253(data), 1);
            for (int iM26253 = C8049.m26253(data) - 1; -1 < iM26253; iM26253--) {
                builder.addByte(C8049.m26252(data, iM26253));
            }
            return builder.endVector();
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createUsingNumbersVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addOffset(data[length]);
            }
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createUsingStringsVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addOffset(data[length]);
            }
        }

        public final int endMethodMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final MethodMatcher getRootAsMethodMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsMethodMatcher(_bb, new MethodMatcher());
        }

        public final void startAllOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startAnyOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startMethodMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(17);
        }

        public final void startNoneOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startUsingFieldsVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startUsingNumbersTypeVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(1, numElems, 1);
        }

        public final void startUsingNumbersVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startUsingStringsVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void validateVersion() {
            Constants.FLATBUFFERS_23_5_26();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final MethodMatcher getRootAsMethodMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 MethodMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final MethodMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    @InterfaceC6489
    public final AccessFlagsMatcher accessFlags(@InterfaceC6399 AccessFlagsMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final MethodMatcher allOf(int j) {
        return allOf(new MethodMatcher(), j);
    }

    @InterfaceC6489
    public final AnnotationsMatcher annotations(@InterfaceC6399 AnnotationsMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final MethodMatcher anyOf(int j) {
        return anyOf(new MethodMatcher(), j);
    }

    @InterfaceC6489
    public final ClassMatcher declaringClass(@InterfaceC6399 ClassMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    @InterfaceC6489
    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    public final int getAllOfLength() {
        int i__offset = __offset(32);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final AnnotationsMatcher getAnnotations() {
        return annotations(new AnnotationsMatcher());
    }

    public final int getAnyOfLength() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final ClassMatcher getDeclaringClass() {
        return declaringClass(new ClassMatcher());
    }

    @InterfaceC6489
    public final MethodsMatcher getInvokingMethods() {
        return invokingMethods(new MethodsMatcher());
    }

    @InterfaceC6489
    public final MethodsMatcher getMethodCallers() {
        return methodCallers(new MethodsMatcher());
    }

    @InterfaceC6489
    public final StringMatcher getMethodName() {
        return methodName(new StringMatcher());
    }

    public final int getNoneOfLength() {
        int i__offset = __offset(36);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final OpCodesMatcher getOpCodes() {
        return opCodes(new OpCodesMatcher());
    }

    @InterfaceC6489
    public final ParametersMatcher getParameters() {
        return parameters(new ParametersMatcher());
    }

    @InterfaceC6489
    public final String getProtoShorty() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    @InterfaceC6399
    public final ByteBuffer getProtoShortyAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(30, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(30, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    @InterfaceC6489
    public final ClassMatcher getReturnType() {
        return returnType(new ClassMatcher());
    }

    public final int getUsingFieldsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getUsingNumbersLength() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer getUsingNumbersTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(22, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(22, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getUsingNumbersTypeLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getUsingStringsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final MethodsMatcher invokingMethods(@InterfaceC6399 MethodsMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(26);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    @InterfaceC6489
    public final MethodsMatcher methodCallers(@InterfaceC6399 MethodsMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(28);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    @InterfaceC6489
    public final StringMatcher methodName(@InterfaceC6399 StringMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX INFO: renamed from: mutateUsingNumbersType-EK-6454, reason: not valid java name */
    public final boolean m31204mutateUsingNumbersTypeEK6454(int j, byte usingNumbersType) {
        int i__offset = __offset(22);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(__vector(i__offset) + j, usingNumbersType);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final MethodMatcher noneOf(int j) {
        return noneOf(new MethodMatcher(), j);
    }

    @InterfaceC6489
    public final OpCodesMatcher opCodes(@InterfaceC6399 OpCodesMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    @InterfaceC6489
    public final ParametersMatcher parameters(@InterfaceC6399 ParametersMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    @InterfaceC6399
    public final ByteBuffer protoShortyInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 30, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 30, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    @InterfaceC6489
    public final ClassMatcher returnType(@InterfaceC6399 ClassMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final UsingFieldMatcher usingFields(int j) {
        return usingFields(new UsingFieldMatcher(), j);
    }

    @InterfaceC6489
    public final Table usingNumbers(@InterfaceC6399 Table obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __union(obj, __vector(i__offset) + (j * 4));
        }
        return null;
    }

    /* JADX INFO: renamed from: usingNumbersType-Wa3L5BU, reason: not valid java name */
    public final byte m31205usingNumbersTypeWa3L5BU(int j) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return C8048.m26193(this.f4157bb.get(__vector(i__offset) + j));
        }
        return (byte) 0;
    }

    @InterfaceC6399
    public final ByteBuffer usingNumbersTypeInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 22, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 22, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final StringMatcher usingStrings(int j) {
        return usingStrings(new StringMatcher(), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final MethodMatcher allOf(@InterfaceC6399 MethodMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(32);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final MethodMatcher anyOf(@InterfaceC6399 MethodMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(34);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final MethodMatcher noneOf(@InterfaceC6399 MethodMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(36);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final UsingFieldMatcher usingFields(@InterfaceC6399 UsingFieldMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final StringMatcher usingStrings(@InterfaceC6399 StringMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }
}

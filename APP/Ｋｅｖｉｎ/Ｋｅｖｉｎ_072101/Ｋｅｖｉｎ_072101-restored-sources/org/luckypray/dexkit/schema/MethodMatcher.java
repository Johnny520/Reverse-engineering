package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher, reason: invalid class name */
/* JADX INFO: compiled from: MethodMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 L2\u00020\u0001:\u0001LB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020&J\u0016\u0010:\u001a\u00020;2\u0006\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020&J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010<\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010<\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010<\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010<\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010<\u001a\u00020\u0016J \u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020Aø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010<\u001a\u00020\u001aJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010<\u001a\u00020\u001eJ\u000e\u0010D\u001a\u00020&2\u0006\u00109\u001a\u00020&J\u0010\u0010)\u001a\u0004\u0018\u00010\f2\u0006\u0010<\u001a\u00020\fJ\u0010\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010?\u001a\u00020,J\u0018\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010<\u001a\u00020F2\u0006\u0010?\u001a\u00020,J\u0018\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u0010?\u001a\u00020,J\u001b\u0010@\u001a\u00020A2\u0006\u0010?\u001a\u00020,ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u000e\u0010J\u001a\u00020&2\u0006\u00109\u001a\u00020&J\u0010\u0010K\u001a\u0004\u0018\u00010\u00162\u0006\u0010?\u001a\u00020,J\u0018\u0010K\u001a\u0004\u0018\u00010\u00162\u0006\u0010<\u001a\u00020\u00162\u0006\u0010?\u001a\u00020,R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00101\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b2\u0010(R\u0011\u00103\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0011\u00105\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b6\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-MethodMatcher;", "Lcom/google/flatbuffers/Table;", "()V", "accessFlags", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "getAccessFlags", "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "annotations", "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "getAnnotations", "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "declaringClass", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getDeclaringClass", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "invokingMethods", "Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getInvokingMethods", "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "methodCallers", "getMethodCallers", "methodName", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "getMethodName", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "opCodes", "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "getOpCodes", "()Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "parameters", "Lorg/luckypray/dexkit/schema/-ParametersMatcher;", "getParameters", "()Lorg/luckypray/dexkit/schema/-ParametersMatcher;", "protoShorty", "", "getProtoShorty", "()Ljava/lang/String;", "protoShortyAsByteBuffer", "Ljava/nio/ByteBuffer;", "getProtoShortyAsByteBuffer", "()Ljava/nio/ByteBuffer;", "returnType", "getReturnType", "usingFieldsLength", "", "getUsingFieldsLength", "()I", "usingNumbersLength", "getUsingNumbersLength", "usingNumbersTypeAsByteBuffer", "getUsingNumbersTypeAsByteBuffer", "usingNumbersTypeLength", "getUsingNumbersTypeLength", "usingStringsLength", "getUsingStringsLength", "__assign", "_i", "_bb", "__init", "", "obj", "mutateUsingNumbersType", "", "j", "usingNumbersType", "Lkotlin/UByte;", "mutateUsingNumbersType-EK-6454", "(IB)Z", "protoShortyInByteBuffer", "usingFields", "Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "usingNumbers", "usingNumbersType-Wa3L5BU", "(I)B", "usingNumbersTypeInByteBuffer", "usingStrings", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class MethodMatcher extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.MethodMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher$Companion */
    /* JADX INFO: compiled from: MethodMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bJ\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJ\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\bJ\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bJ\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\bJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\bJ\u0016\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bJ~\u0010#\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bJ\u0016\u00102\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00103\u001a\u000204J\"\u00105\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00103\u001a\u000206H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00103\u001a\u000204J\u0016\u0010:\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00103\u001a\u000204J\u000e\u0010;\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020=J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010B\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\bJ\u0016\u0010D\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\bJ\u0016\u0010E\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\bJ\u0016\u0010F\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\bJ\u0006\u0010G\u001a\u00020\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;", "", "()V", "addAccessFlags", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "accessFlags", "", "addAnnotations", "annotations", "addDeclaringClass", "declaringClass", "addInvokingMethods", "invokingMethods", "addMethodCallers", "methodCallers", "addMethodName", "methodName", "addOpCodes", "opCodes", "addParameters", "parameters", "addProtoShorty", "protoShorty", "addReturnType", "returnType", "addUsingFields", "usingFields", "addUsingNumbers", "usingNumbers", "addUsingNumbersType", "usingNumbersType", "addUsingStrings", "usingStrings", "createMethodMatcher", "methodNameOffset", "accessFlagsOffset", "declaringClassOffset", "returnTypeOffset", "parametersOffset", "annotationsOffset", "opCodesOffset", "usingStringsOffset", "usingFieldsOffset", "usingNumbersTypeOffset", "usingNumbersOffset", "invokingMethodsOffset", "methodCallersOffset", "protoShortyOffset", "createUsingFieldsVector", "data", "", "createUsingNumbersTypeVector", "Lkotlin/UByteArray;", "createUsingNumbersTypeVector-VU-fvBY", "(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I", "createUsingNumbersVector", "createUsingStringsVector", "endMethodMatcher", "getRootAsMethodMatcher", "Lorg/luckypray/dexkit/schema/-MethodMatcher;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startMethodMatcher", "startUsingFieldsVector", "numElems", "startUsingNumbersTypeVector", "startUsingNumbersVector", "startUsingStringsVector", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void addAccessFlags(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addAnnotations(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 5
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addDeclaringClass(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addInvokingMethods(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 11
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addMethodCallers(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 12
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addMethodName(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addOpCodes(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 6
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addParameters(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 4
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addProtoShorty(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 13
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addReturnType(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 3
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingFields(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 8
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingNumbers(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 10
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingNumbersType(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 9
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingStrings(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 7
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final int createMethodMatcher(com.google.flatbuffers.FlatBufferBuilder r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31) {
                r16 = this;
                r0 = r16
                r1 = r17
                java.lang.String r2 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                r2 = 14
                r1.startTable(r2)
                r2 = r31
                r0.addProtoShorty(r1, r2)
                r3 = r30
                r0.addMethodCallers(r1, r3)
                r4 = r29
                r0.addInvokingMethods(r1, r4)
                r5 = r28
                r0.addUsingNumbers(r1, r5)
                r6 = r27
                r0.addUsingNumbersType(r1, r6)
                r7 = r26
                r0.addUsingFields(r1, r7)
                r8 = r25
                r0.addUsingStrings(r1, r8)
                r9 = r24
                r0.addOpCodes(r1, r9)
                r10 = r23
                r0.addAnnotations(r1, r10)
                r11 = r22
                r0.addParameters(r1, r11)
                r12 = r21
                r0.addReturnType(r1, r12)
                r13 = r20
                r0.addDeclaringClass(r1, r13)
                r14 = r19
                r0.addAccessFlags(r1, r14)
                r16.addMethodName(r17, r18)
                int r15 = r16.endMethodMatcher(r17)
                return r15
        }

        public final int createUsingFieldsVector(com.google.flatbuffers.FlatBufferBuilder r3, int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 4
                int r1 = r4.length
                r3.startVector(r0, r1, r0)
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
                int r0 = r3.endVector()
                return r0
        }

        /* JADX INFO: renamed from: createUsingNumbersTypeVector-VU-fvBY, reason: not valid java name */
        public final int m10446createUsingNumbersTypeVectorVUfvBY(com.google.flatbuffers.FlatBufferBuilder r3, byte[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                int r0 = kotlin.UByteArray.m8746getSizeimpl(r4)
                r1 = 1
                r3.startVector(r1, r0, r1)
                int r0 = kotlin.UByteArray.m8746getSizeimpl(r4)
                int r0 = r0 - r1
            L17:
                r1 = -1
                if (r1 >= r0) goto L24
                byte r1 = kotlin.UByteArray.m8745getw2LRezQ(r4, r0)
                r3.addByte(r1)
                int r0 = r0 + (-1)
                goto L17
            L24:
                int r0 = r3.endVector()
                return r0
        }

        public final int createUsingNumbersVector(com.google.flatbuffers.FlatBufferBuilder r3, int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 4
                int r1 = r4.length
                r3.startVector(r0, r1, r0)
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
                int r0 = r3.endVector()
                return r0
        }

        public final int createUsingStringsVector(com.google.flatbuffers.FlatBufferBuilder r3, int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 4
                int r1 = r4.length
                r3.startVector(r0, r1, r0)
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
                int r0 = r3.endVector()
                return r0
        }

        public final int endMethodMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.MethodMatcher getRootAsMethodMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-MethodMatcher r0 = new org.luckypray.dexkit.schema.-MethodMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-MethodMatcher r0 = r1.getRootAsMethodMatcher(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.MethodMatcher getRootAsMethodMatcher(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.MethodMatcher r4) {
                r2 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "obj"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                r3.order(r0)
                int r0 = r3.position()
                int r0 = r3.getInt(r0)
                int r1 = r3.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-MethodMatcher r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startMethodMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 14
                r2.startTable(r0)
                return
        }

        public final void startUsingFieldsVector(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 4
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startUsingNumbersTypeVector(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 1
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startUsingNumbersVector(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 4
                r2.startVector(r0, r3, r0)
                return
        }

        public final void startUsingStringsVector(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
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

    public final org.luckypray.dexkit.schema.MethodMatcher __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            java.lang.String r0 = "_bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.__init(r2, r3)
            return r1
    }

    public final void __init(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            java.lang.String r0 = "_bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.__reset(r2, r3)
            return
    }

    public final org.luckypray.dexkit.schema.AccessFlagsMatcher accessFlags(org.luckypray.dexkit.schema.AccessFlagsMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 6
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L1f
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r1 = r5.__assign(r1, r2)
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher annotations(org.luckypray.dexkit.schema.AnnotationsMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 14
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-AnnotationsMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher declaringClass(org.luckypray.dexkit.schema.ClassMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 8
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.AccessFlagsMatcher getAccessFlags() {
            r1 = this;
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = new org.luckypray.dexkit.schema.-AccessFlagsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = r1.accessFlags(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher getAnnotations() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = r1.annotations(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getDeclaringClass() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.declaringClass(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher getInvokingMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = r1.invokingMethods(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher getMethodCallers() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = r1.methodCallers(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.StringMatcher getMethodName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r0 = r1.methodName(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.OpCodesMatcher getOpCodes() {
            r1 = this;
            org.luckypray.dexkit.schema.-OpCodesMatcher r0 = new org.luckypray.dexkit.schema.-OpCodesMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-OpCodesMatcher r0 = r1.opCodes(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.ParametersMatcher getParameters() {
            r1 = this;
            org.luckypray.dexkit.schema.-ParametersMatcher r0 = new org.luckypray.dexkit.schema.-ParametersMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ParametersMatcher r0 = r1.parameters(r0)
            return r0
    }

    public final java.lang.String getProtoShorty() {
            r2 = this;
            r0 = 30
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L10
            int r1 = r2.bb_pos
            int r1 = r1 + r0
            java.lang.String r1 = r2.__string(r1)
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final java.nio.ByteBuffer getProtoShortyAsByteBuffer() {
            r2 = this;
            r0 = 30
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            java.lang.String r1 = "__vector_as_bytebuffer(30, 1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getReturnType() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.returnType(r0)
            return r0
    }

    public final int getUsingFieldsLength() {
            r2 = this;
            r0 = 20
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r2.__vector_len(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public final int getUsingNumbersLength() {
            r2 = this;
            r0 = 24
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r2.__vector_len(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public final java.nio.ByteBuffer getUsingNumbersTypeAsByteBuffer() {
            r2 = this;
            r0 = 22
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            java.lang.String r1 = "__vector_as_bytebuffer(22, 1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final int getUsingNumbersTypeLength() {
            r2 = this;
            r0 = 22
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r2.__vector_len(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public final int getUsingStringsLength() {
            r2 = this;
            r0 = 18
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r2.__vector_len(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher invokingMethods(org.luckypray.dexkit.schema.MethodsMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 26
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodsMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher methodCallers(org.luckypray.dexkit.schema.MethodsMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 28
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodsMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher methodName(org.luckypray.dexkit.schema.StringMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 4
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L1f
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-StringMatcher r1 = r5.__assign(r1, r2)
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    /* JADX INFO: renamed from: mutateUsingNumbersType-EK-6454, reason: not valid java name */
    public final boolean m10444mutateUsingNumbersTypeEK6454(int r5, byte r6) {
            r4 = this;
            r0 = 22
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r4.f50bb
            int r2 = r4.__vector(r0)
            int r3 = r5 * 1
            int r2 = r2 + r3
            r1.put(r2, r6)
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public final org.luckypray.dexkit.schema.OpCodesMatcher opCodes(org.luckypray.dexkit.schema.OpCodesMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 16
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-OpCodesMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.ParametersMatcher parameters(org.luckypray.dexkit.schema.ParametersMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 12
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-ParametersMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final java.nio.ByteBuffer protoShortyInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "_bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 30
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            java.lang.String r1 = "__vector_in_bytebuffer(_bb, 30, 1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final org.luckypray.dexkit.schema.ClassMatcher returnType(org.luckypray.dexkit.schema.ClassMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 10
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.UsingFieldMatcher usingFields(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-UsingFieldMatcher r0 = new org.luckypray.dexkit.schema.-UsingFieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-UsingFieldMatcher r0 = r1.usingFields(r0, r2)
            return r0
    }

    public final org.luckypray.dexkit.schema.UsingFieldMatcher usingFields(org.luckypray.dexkit.schema.UsingFieldMatcher r5, int r6) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 20
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L24
            int r1 = r4.__vector(r0)
            int r2 = r6 * 4
            int r1 = r1 + r2
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-UsingFieldMatcher r1 = r5.__assign(r1, r2)
            goto L25
        L24:
            r1 = 0
        L25:
            return r1
    }

    public final com.google.flatbuffers.Table usingNumbers(com.google.flatbuffers.Table r4, int r5) {
            r3 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 24
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L19
            int r1 = r3.__vector(r0)
            int r2 = r5 * 4
            int r1 = r1 + r2
            com.google.flatbuffers.Table r1 = r3.__union(r4, r1)
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    /* JADX INFO: renamed from: usingNumbersType-Wa3L5BU, reason: not valid java name */
    public final byte m10445usingNumbersTypeWa3L5BU(int r5) {
            r4 = this;
            r0 = 22
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L1a
            java.nio.ByteBuffer r1 = r4.f50bb
            int r2 = r4.__vector(r0)
            int r3 = r5 * 1
            int r2 = r2 + r3
            byte r1 = r1.get(r2)
            byte r1 = kotlin.UByte.m8687constructorimpl(r1)
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    public final java.nio.ByteBuffer usingNumbersTypeInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "_bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 22
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            java.lang.String r1 = "__vector_in_bytebuffer(_bb, 22, 1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final org.luckypray.dexkit.schema.StringMatcher usingStrings(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r0 = r1.usingStrings(r0, r2)
            return r0
    }

    public final org.luckypray.dexkit.schema.StringMatcher usingStrings(org.luckypray.dexkit.schema.StringMatcher r5, int r6) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 18
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L24
            int r1 = r4.__vector(r0)
            int r2 = r6 * 4
            int r1 = r1 + r2
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-StringMatcher r1 = r5.__assign(r1, r2)
            goto L25
        L24:
            r1 = 0
        L25:
            return r1
    }
}

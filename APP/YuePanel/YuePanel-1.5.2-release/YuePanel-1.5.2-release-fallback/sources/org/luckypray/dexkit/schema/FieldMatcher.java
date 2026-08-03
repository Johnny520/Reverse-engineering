package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b#\u0010!J\u001f\u0010#\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b$\u0010!J\u001f\u0010$\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u00103\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u00107\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b6\u00102¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/schema/-FieldMatcher;", "Lcom/google/flatbuffers/Table;", "<init>", "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "obj", "fieldName", "(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "accessFlags", "(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "declaringClass", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "typeClass", "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getMethods", "(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "putMethods", "j", "allOf", "(I)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "(Lorg/luckypray/dexkit/schema/-FieldMatcher;I)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "anyOf", "noneOf", "getFieldName", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "getAccessFlags", "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "getDeclaringClass", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getTypeClass", "getAnnotations", "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "getGetMethods", "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getPutMethods", "getAllOfLength", "()I", "allOfLength", "getAnyOfLength", "anyOfLength", "getNoneOfLength", "noneOfLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldMatcher extends com.google.flatbuffers.Table {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.schema.FieldMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher$Companion */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0015\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJe\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010 J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010 J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010 J\u001d\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010 J\u001d\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010 J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010 J\u001d\u0010.\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u000f¢\u0006\u0004\b.\u0010 J\u001d\u00101\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00103\u001a\u00020\u000f¢\u0006\u0004\b4\u0010 J\u001d\u00106\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00105\u001a\u00020\u000f¢\u0006\u0004\b6\u0010 J\u001d\u00107\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b7\u00102J\u001d\u00108\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00103\u001a\u00020\u000f¢\u0006\u0004\b8\u0010 J\u001d\u0010:\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010 J\u001d\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b;\u00102J\u001d\u0010<\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00103\u001a\u00020\u000f¢\u0006\u0004\b<\u0010 J\u0015\u0010=\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;", "", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-FieldMatcher;", "getRootAsFieldMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "obj", "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "fieldNameOffset", "accessFlagsOffset", "declaringClassOffset", "typeClassOffset", "annotationsOffset", "getMethodsOffset", "putMethodsOffset", "allOfOffset", "anyOfOffset", "noneOfOffset", "createFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIIII)I", "startFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "fieldName", "addFieldName", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "accessFlags", "addAccessFlags", "declaringClass", "addDeclaringClass", "typeClass", "addTypeClass", "annotations", "addAnnotations", "getMethods", "addGetMethods", "putMethods", "addPutMethods", "allOf", "addAllOf", "", "data", "createAllOfVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startAllOfVector", "anyOf", "addAnyOf", "createAnyOfVector", "startAnyOfVector", "noneOf", "addNoneOf", "createNoneOfVector", "startNoneOfVector", "endFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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
                r0 = 7
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addAnnotations(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 4
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addAnyOf(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 8
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

        public final void addFieldName(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addGetMethods(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 5
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addNoneOf(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 9
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addPutMethods(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 6
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addTypeClass(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 3
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

        public final int createFieldMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 10
                r2.startTable(r0)
                r1.addNoneOf(r2, r12)
                r1.addAnyOf(r2, r11)
                r1.addAllOf(r2, r10)
                r1.addPutMethods(r2, r9)
                r1.addGetMethods(r2, r8)
                r1.addAnnotations(r2, r7)
                r1.addTypeClass(r2, r6)
                r1.addDeclaringClass(r2, r5)
                r1.addAccessFlags(r2, r4)
                r1.addFieldName(r2, r3)
                int r2 = r1.endFieldMatcher(r2)
                return r2
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

        public final int endFieldMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                int r2 = r2.endTable()
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.FieldMatcher getRootAsFieldMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-FieldMatcher r2 = r1.getRootAsFieldMatcher(r2, r0)
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.FieldMatcher getRootAsFieldMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.FieldMatcher r4) {
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
                org.luckypray.dexkit.schema.-FieldMatcher r3 = r4.__assign(r0, r3)
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

        public final void startFieldMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 10
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

        public final void validateVersion() {
                r0 = this;
                com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-FieldMatcher$Companion r0 = new org.luckypray.dexkit.schema.-FieldMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.FieldMatcher.Companion = r0
            return
    }

    public FieldMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.schema.FieldMatcher __assign(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
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
    public final org.luckypray.dexkit.schema.FieldMatcher allOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldMatcher r2 = r1.allOf(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.FieldMatcher allOf(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.FieldMatcher r3, int r4) {
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
            org.luckypray.dexkit.schema.-FieldMatcher r3 = r3.__assign(r4, r0)
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
            r0 = 12
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
    public final org.luckypray.dexkit.schema.FieldMatcher anyOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldMatcher r2 = r1.anyOf(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.FieldMatcher anyOf(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.FieldMatcher r3, int r4) {
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
            org.luckypray.dexkit.schema.-FieldMatcher r3 = r3.__assign(r4, r0)
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
    public final org.luckypray.dexkit.schema.StringMatcher fieldName(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.StringMatcher r4) {
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
    public final org.luckypray.dexkit.schema.AnnotationsMatcher getAnnotations() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = r1.annotations(r0)
            return r0
    }

    public final int getAnyOfLength() {
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

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher getDeclaringClass() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.declaringClass(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.StringMatcher getFieldName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r0 = r1.fieldName(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodsMatcher getGetMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = r1.getMethods(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodsMatcher getMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.MethodsMatcher r4) {
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
            org.luckypray.dexkit.schema.-MethodsMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    public final int getNoneOfLength() {
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

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodsMatcher getPutMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = r1.putMethods(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher getTypeClass() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.typeClass(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.FieldMatcher noneOf(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldMatcher r2 = r1.noneOf(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.FieldMatcher noneOf(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.FieldMatcher r3, int r4) {
            r2 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r3, r0)
            r0 = 22
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L24
            int r0 = r2.__vector(r0)
            int r4 = r4 * 4
            int r0 = r0 + r4
            int r4 = r2.__indirect(r0)
            java.nio.ByteBuffer r0 = r2.bb
            java.lang.String r1 = "bb"
            Yue.C3329.m13905(r0, r1)
            org.luckypray.dexkit.schema.-FieldMatcher r3 = r3.__assign(r4, r0)
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.MethodsMatcher putMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.MethodsMatcher r4) {
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
            org.luckypray.dexkit.schema.-MethodsMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher typeClass(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.ClassMatcher r4) {
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
}

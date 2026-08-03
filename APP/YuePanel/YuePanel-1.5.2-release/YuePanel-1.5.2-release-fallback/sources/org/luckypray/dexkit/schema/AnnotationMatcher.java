package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "Lcom/google/flatbuffers/Table;", "<init>", "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "obj", "type", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "targetElementTypes", "(Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "", "policy", "", "mutatePolicy", "(B)Z", "Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;", "elements", "(Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;", "j", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "usingStrings", "(I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "getType", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getTargetElementTypes", "()Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "getPolicy", "()B", "getElements", "()Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;", "getUsingStringsLength", "()I", "usingStringsLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationMatcher extends com.google.flatbuffers.Table {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.schema.AnnotationMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher$Companion */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ=\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u001cJ\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u001cJ\u001d\u0010'\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u001cJ\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;", "", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "getRootAsAnnotationMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "obj", "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "typeOffset", "targetElementTypesOffset", "", "policy", "elementsOffset", "usingStringsOffset", "createAnnotationMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIBII)I", "startAnnotationMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "type", "addType", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "targetElementTypes", "addTargetElementTypes", "addPolicy", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "elements", "addElements", "usingStrings", "addUsingStrings", "", "data", "createUsingStringsVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startUsingStringsVector", "endAnnotationMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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

        public final void addElements(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 3
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addPolicy(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, byte r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 2
                r1 = 0
                r3.addByte(r0, r4, r1)
                return
        }

        public final void addTargetElementTypes(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 1
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addType(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addUsingStrings(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 4
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final int createAnnotationMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3, int r4, byte r5, int r6, int r7) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 5
                r2.startTable(r0)
                r1.addUsingStrings(r2, r7)
                r1.addElements(r2, r6)
                r1.addTargetElementTypes(r2, r4)
                r1.addType(r2, r3)
                r1.addPolicy(r2, r5)
                int r2 = r1.endAnnotationMatcher(r2)
                return r2
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

        public final int endAnnotationMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                int r2 = r2.endTable()
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.AnnotationMatcher getRootAsAnnotationMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.schema.-AnnotationMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-AnnotationMatcher r2 = r1.getRootAsAnnotationMatcher(r2, r0)
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.AnnotationMatcher getRootAsAnnotationMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationMatcher r4) {
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
                org.luckypray.dexkit.schema.-AnnotationMatcher r3 = r4.__assign(r0, r3)
                return r3
        }

        public final void startAnnotationMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 5
                r2.startTable(r0)
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
            org.luckypray.dexkit.schema.-AnnotationMatcher$Companion r0 = new org.luckypray.dexkit.schema.-AnnotationMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.AnnotationMatcher.Companion = r0
            return
    }

    public AnnotationMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.schema.AnnotationMatcher __assign(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
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
    public final org.luckypray.dexkit.schema.AnnotationElementsMatcher elements(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationElementsMatcher r4) {
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
            org.luckypray.dexkit.schema.-AnnotationElementsMatcher r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.AnnotationElementsMatcher getElements() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationElementsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationElementsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationElementsMatcher r0 = r1.elements(r0)
            return r0
    }

    public final byte getPolicy() {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            byte r0 = r1.get(r0)
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.TargetElementTypesMatcher getTargetElementTypes() {
            r1 = this;
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r0 = new org.luckypray.dexkit.schema.-TargetElementTypesMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r0 = r1.targetElementTypes(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher getType() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.type(r0)
            return r0
    }

    public final int getUsingStringsLength() {
            r1 = this;
            r0 = 12
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final boolean mutatePolicy(byte r4) {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            r1.put(r0, r4)
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.TargetElementTypesMatcher targetElementTypes(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.TargetElementTypesMatcher r4) {
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
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r4 = r4.__assign(r0, r1)
            goto L20
        L1f:
            r4 = 0
        L20:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher type(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.ClassMatcher r4) {
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
            org.luckypray.dexkit.schema.-ClassMatcher r4 = r4.__assign(r0, r1)
            goto L20
        L1f:
            r4 = 0
        L20:
            return r4
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
            r0 = 12
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

package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMeta, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "Lcom/google/flatbuffers/Table;", "<init>", "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "nameInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "obj", "value", "(Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "", "getName", "()Ljava/lang/String;", "name", "getNameAsByteBuffer", "()Ljava/nio/ByteBuffer;", "nameAsByteBuffer", "getValue", "()Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationElementMeta extends com.google.flatbuffers.Table {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.schema.AnnotationElementMeta.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMeta$Companion */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ%\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationElementMeta$Companion;", "", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "getRootAsAnnotationElementMeta", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "obj", "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "nameOffset", "valueOffset", "createAnnotationElementMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;II)I", "startAnnotationElementMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "name", "addName", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "value", "addValue", "endAnnotationElementMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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

        public final void addName(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addValue(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 1
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final int createAnnotationElementMeta(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 2
                r2.startTable(r0)
                r1.addValue(r2, r4)
                r1.addName(r2, r3)
                int r2 = r1.endAnnotationElementMeta(r2)
                return r2
        }

        public final int endAnnotationElementMeta(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                int r2 = r2.endTable()
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.AnnotationElementMeta getRootAsAnnotationElementMeta(@Yue.InterfaceC4418 java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.schema.-AnnotationElementMeta r0 = new org.luckypray.dexkit.schema.-AnnotationElementMeta
                r0.<init>()
                org.luckypray.dexkit.schema.-AnnotationElementMeta r2 = r1.getRootAsAnnotationElementMeta(r2, r0)
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.AnnotationElementMeta getRootAsAnnotationElementMeta(@Yue.InterfaceC4418 java.nio.ByteBuffer r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationElementMeta r4) {
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
                org.luckypray.dexkit.schema.-AnnotationElementMeta r3 = r4.__assign(r0, r3)
                return r3
        }

        public final void startAnnotationElementMeta(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 2
                r2.startTable(r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-AnnotationElementMeta$Companion r0 = new org.luckypray.dexkit.schema.-AnnotationElementMeta$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.AnnotationElementMeta.Companion = r0
            return
    }

    public AnnotationElementMeta() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.schema.AnnotationElementMeta __assign(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
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
    public final java.lang.String getName() {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Lf
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            java.lang.String r0 = r2.__string(r0)
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Yue.InterfaceC4418
    public final java.nio.ByteBuffer getNameAsByteBuffer() {
            r2 = this;
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            java.lang.String r1 = "__vector_as_bytebuffer(4, 1)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.AnnotationEncodeValueMeta getValue() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r0 = new org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r0 = r1.value(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final java.nio.ByteBuffer nameInByteBuffer(@Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "_bb"
            Yue.C3329.m13906(r3, r0)
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r3 = r2.__vector_in_bytebuffer(r3, r0, r1)
            java.lang.String r0 = "__vector_in_bytebuffer(_bb, 4, 1)"
            Yue.C3329.m13905(r3, r0)
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.AnnotationEncodeValueMeta value(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationEncodeValueMeta r4) {
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
            org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r4 = r4.__assign(r0, r1)
            goto L20
        L1f:
            r4 = 0
        L20:
            return r4
    }
}

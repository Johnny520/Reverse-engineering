package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;", "Lcom/google/flatbuffers/Table;", "<init>", "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "obj", "name", "(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;", "LYue/ۥۢۢۥۥ;", "valueType", "", "mutateValueType-7apg3OU", "(B)Z", "mutateValueType", "value", "(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;", "getName", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "getValueType-w2LRezQ", "()B", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationElementMatcher extends com.google.flatbuffers.Table {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ0\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001bJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;", "", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;", "getRootAsAnnotationElementMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;", "obj", "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "nameOffset", "LYue/ۥۢۢۥۥ;", "valueType", "valueOffset", "createAnnotationElementMatcher-SpDDLgk", "(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I", "createAnnotationElementMatcher", "startAnnotationElementMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "name", "addName", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addValueType-EK-6454", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "addValueType", "value", "addValue", "endAnnotationElementMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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
                r0 = 2
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        /* JADX INFO: renamed from: addValueType-EK-6454, reason: not valid java name */
        public final void m30798addValueTypeEK6454(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, byte r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 1
                r1 = 0
                r3.addByte(r0, r4, r1)
                return
        }

        /* JADX INFO: renamed from: createAnnotationElementMatcher-SpDDLgk, reason: not valid java name */
        public final int m30799createAnnotationElementMatcherSpDDLgk(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3, byte r4, int r5) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 3
                r2.startTable(r0)
                r1.addValue(r2, r5)
                r1.addName(r2, r3)
                r1.m30798addValueTypeEK6454(r2, r4)
                int r2 = r1.endAnnotationElementMatcher(r2)
                return r2
        }

        public final int endAnnotationElementMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                int r2 = r2.endTable()
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.AnnotationElementMatcher getRootAsAnnotationElementMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.schema.-AnnotationElementMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationElementMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-AnnotationElementMatcher r2 = r1.getRootAsAnnotationElementMatcher(r2, r0)
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.AnnotationElementMatcher getRootAsAnnotationElementMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationElementMatcher r4) {
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
                org.luckypray.dexkit.schema.-AnnotationElementMatcher r3 = r4.__assign(r0, r3)
                return r3
        }

        public final void startAnnotationElementMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 3
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
            org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion r0 = new org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion = r0
            return
    }

    public AnnotationElementMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.schema.AnnotationElementMatcher __assign(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
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
    public final org.luckypray.dexkit.schema.StringMatcher getName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r0 = r1.name(r0)
            return r0
    }

    /* JADX INFO: renamed from: getValueType-w2LRezQ, reason: not valid java name */
    public final byte m30796getValueTypew2LRezQ() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            byte r0 = r1.get(r0)
            byte r0 = Yue.C6517.m24798(r0)
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    /* JADX INFO: renamed from: mutateValueType-7apg3OU, reason: not valid java name */
    public final boolean m30797mutateValueType7apg3OU(byte r4) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            r1.put(r0, r4)
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.StringMatcher name(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.StringMatcher r4) {
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
    public final com.google.flatbuffers.Table value(@Yue.InterfaceC4418 com.google.flatbuffers.Table r3) {
            r2 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r3, r0)
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L15
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            com.google.flatbuffers.Table r3 = r2.__union(r3, r0)
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }
}

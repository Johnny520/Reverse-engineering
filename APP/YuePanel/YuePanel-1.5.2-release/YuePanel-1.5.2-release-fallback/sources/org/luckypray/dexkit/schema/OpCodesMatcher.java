package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "Lcom/google/flatbuffers/Table;", "<init>", "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "j", "", "opCodes", "(I)S", "opCodesInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "mutateOpCodes", "(IS)Z", "", "matchType", "mutateMatchType", "(B)Z", "Lorg/luckypray/dexkit/schema/-IntRange;", "obj", "opCodeCount", "(Lorg/luckypray/dexkit/schema/-IntRange;)Lorg/luckypray/dexkit/schema/-IntRange;", "getOpCodesLength", "()I", "opCodesLength", "getOpCodesAsByteBuffer", "()Ljava/nio/ByteBuffer;", "opCodesAsByteBuffer", "getMatchType", "()B", "getOpCodeCount", "()Lorg/luckypray/dexkit/schema/-IntRange;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class OpCodesMatcher extends com.google.flatbuffers.Table {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.schema.OpCodesMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher$Companion */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u0017\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ-\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001aJ\u001d\u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u001aJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;", "", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "getRootAsOpCodesMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "obj", "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "opCodesOffset", "", "matchType", "opCodeCountOffset", "createOpCodesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I", "startOpCodesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "opCodes", "addOpCodes", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "", "data", "createOpCodesVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[S)I", "numElems", "startOpCodesVector", "addMatchType", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "opCodeCount", "addOpCodeCount", "endOpCodesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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

        public final void addMatchType(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, byte r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 1
                r1 = 0
                r3.addByte(r0, r4, r1)
                return
        }

        public final void addOpCodeCount(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 2
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addOpCodes(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final int createOpCodesMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3, byte r4, int r5) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 3
                r2.startTable(r0)
                r1.addOpCodeCount(r2, r5)
                r1.addOpCodes(r2, r3)
                r1.addMatchType(r2, r4)
                int r2 = r1.endOpCodesMatcher(r2)
                return r2
        }

        public final int createOpCodesVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 short[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.length
                r1 = 2
                r3.startVector(r1, r0, r1)
                int r0 = r4.length
                int r0 = r0 + (-1)
            L12:
                r1 = -1
                if (r1 >= r0) goto L1d
                short r1 = r4[r0]
                r3.addShort(r1)
                int r0 = r0 + (-1)
                goto L12
            L1d:
                int r3 = r3.endVector()
                return r3
        }

        public final int endOpCodesMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                int r2 = r2.endTable()
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.OpCodesMatcher getRootAsOpCodesMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.schema.-OpCodesMatcher r0 = new org.luckypray.dexkit.schema.-OpCodesMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-OpCodesMatcher r2 = r1.getRootAsOpCodesMatcher(r2, r0)
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.OpCodesMatcher getRootAsOpCodesMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.OpCodesMatcher r4) {
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
                org.luckypray.dexkit.schema.-OpCodesMatcher r3 = r4.__assign(r0, r3)
                return r3
        }

        public final void startOpCodesMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 3
                r2.startTable(r0)
                return
        }

        public final void startOpCodesVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 2
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
            org.luckypray.dexkit.schema.-OpCodesMatcher$Companion r0 = new org.luckypray.dexkit.schema.-OpCodesMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.OpCodesMatcher.Companion = r0
            return
    }

    public OpCodesMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.schema.OpCodesMatcher __assign(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
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

    public final byte getMatchType() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            byte r0 = r1.get(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.IntRange getOpCodeCount() {
            r1 = this;
            org.luckypray.dexkit.schema.-IntRange r0 = new org.luckypray.dexkit.schema.-IntRange
            r0.<init>()
            org.luckypray.dexkit.schema.-IntRange r0 = r1.opCodeCount(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final java.nio.ByteBuffer getOpCodesAsByteBuffer() {
            r2 = this;
            r0 = 4
            r1 = 2
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            java.lang.String r1 = "__vector_as_bytebuffer(4, 2)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    public final int getOpCodesLength() {
            r1 = this;
            r0 = 4
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Lc
            int r0 = r1.__vector_len(r0)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final boolean mutateMatchType(byte r4) {
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

    public final boolean mutateOpCodes(int r3, short r4) {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r2.bb
            int r0 = r2.__vector(r0)
            int r3 = r3 * 2
            int r0 = r0 + r3
            r1.putShort(r0, r4)
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.IntRange opCodeCount(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.IntRange r4) {
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
            org.luckypray.dexkit.schema.-IntRange r4 = r4.__assign(r0, r1)
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    public final short opCodes(int r3) {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r2.bb
            int r0 = r2.__vector(r0)
            int r3 = r3 * 2
            int r0 = r0 + r3
            short r3 = r1.getShort(r0)
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }

    @Yue.InterfaceC4418
    public final java.nio.ByteBuffer opCodesInByteBuffer(@Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "_bb"
            Yue.C3329.m13906(r3, r0)
            r0 = 4
            r1 = 2
            java.nio.ByteBuffer r3 = r2.__vector_in_bytebuffer(r3, r0, r1)
            java.lang.String r0 = "__vector_in_bytebuffer(_bb, 4, 2)"
            Yue.C3329.m13905(r3, r0)
            return r3
    }
}

package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher, reason: invalid class name */
/* JADX INFO: compiled from: OpCodesMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\fJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "Lcom/google/flatbuffers/Table;", "()V", "matchType", "", "getMatchType", "()B", "opCodeCount", "Lorg/luckypray/dexkit/schema/-IntRange;", "getOpCodeCount", "()Lorg/luckypray/dexkit/schema/-IntRange;", "opCodesAsByteBuffer", "Ljava/nio/ByteBuffer;", "getOpCodesAsByteBuffer", "()Ljava/nio/ByteBuffer;", "opCodesLength", "", "getOpCodesLength", "()I", "__assign", "_i", "_bb", "__init", "", "mutateMatchType", "", "mutateOpCodes", "j", "opCodes", "", "obj", "opCodesInByteBuffer", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class OpCodesMatcher extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.OpCodesMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher$Companion */
    /* JADX INFO: compiled from: OpCodesMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bJ&\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u0004¨\u0006\u001e"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;", "", "()V", "addMatchType", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "matchType", "", "addOpCodeCount", "opCodeCount", "", "addOpCodes", "opCodes", "createOpCodesMatcher", "opCodesOffset", "opCodeCountOffset", "createOpCodesVector", "data", "", "endOpCodesMatcher", "getRootAsOpCodesMatcher", "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startOpCodesMatcher", "startOpCodesVector", "numElems", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public final void addMatchType(com.google.flatbuffers.FlatBufferBuilder r3, byte r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                r1 = 0
                r3.addByte(r0, r4, r1)
                return
        }

        public final void addOpCodeCount(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addOpCodes(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final int createOpCodesMatcher(com.google.flatbuffers.FlatBufferBuilder r2, int r3, byte r4, int r5) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 3
                r2.startTable(r0)
                r1.addOpCodeCount(r2, r5)
                r1.addOpCodes(r2, r3)
                r1.addMatchType(r2, r4)
                int r0 = r1.endOpCodesMatcher(r2)
                return r0
        }

        public final int createOpCodesVector(com.google.flatbuffers.FlatBufferBuilder r3, short[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 2
                int r1 = r4.length
                r3.startVector(r0, r1, r0)
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
                int r0 = r3.endVector()
                return r0
        }

        public final int endOpCodesMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.OpCodesMatcher getRootAsOpCodesMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-OpCodesMatcher r0 = new org.luckypray.dexkit.schema.-OpCodesMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-OpCodesMatcher r0 = r1.getRootAsOpCodesMatcher(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.OpCodesMatcher getRootAsOpCodesMatcher(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.OpCodesMatcher r4) {
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
                org.luckypray.dexkit.schema.-OpCodesMatcher r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startOpCodesMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 3
                r2.startTable(r0)
                return
        }

        public final void startOpCodesVector(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
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

    public final org.luckypray.dexkit.schema.OpCodesMatcher __assign(int r2, java.nio.ByteBuffer r3) {
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

    public final byte getMatchType() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            byte r1 = r1.get(r2)
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public final org.luckypray.dexkit.schema.IntRange getOpCodeCount() {
            r1 = this;
            org.luckypray.dexkit.schema.-IntRange r0 = new org.luckypray.dexkit.schema.-IntRange
            r0.<init>()
            org.luckypray.dexkit.schema.-IntRange r0 = r1.opCodeCount(r0)
            return r0
    }

    public final java.nio.ByteBuffer getOpCodesAsByteBuffer() {
            r2 = this;
            r0 = 4
            r1 = 2
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            java.lang.String r1 = "__vector_as_bytebuffer(4, 2)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final int getOpCodesLength() {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Lc
            int r1 = r2.__vector_len(r0)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public final boolean mutateMatchType(byte r4) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            r1.put(r2, r4)
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public final boolean mutateOpCodes(int r5, short r6) {
            r4 = this;
            r0 = 4
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r4.f50bb
            int r2 = r4.__vector(r0)
            int r3 = r5 * 2
            int r2 = r2 + r3
            r1.putShort(r2, r6)
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public final org.luckypray.dexkit.schema.IntRange opCodeCount(org.luckypray.dexkit.schema.IntRange r5) {
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
            org.luckypray.dexkit.schema.-IntRange r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final short opCodes(int r5) {
            r4 = this;
            r0 = 4
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r4.f50bb
            int r2 = r4.__vector(r0)
            int r3 = r5 * 2
            int r2 = r2 + r3
            short r1 = r1.getShort(r2)
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public final java.nio.ByteBuffer opCodesInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "_bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 4
            r1 = 2
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            java.lang.String r1 = "__vector_in_bytebuffer(_bb, 4, 2)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}

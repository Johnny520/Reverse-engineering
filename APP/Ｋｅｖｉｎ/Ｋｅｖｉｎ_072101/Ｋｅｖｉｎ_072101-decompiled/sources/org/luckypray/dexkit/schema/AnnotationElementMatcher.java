package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher, reason: invalid class name */
/* JADX INFO: compiled from: AnnotationElementMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;", "Lcom/google/flatbuffers/Table;", "()V", "name", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "getName", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "valueType", "Lkotlin/UByte;", "getValueType-w2LRezQ", "()B", "__assign", "_i", "", "_bb", "Ljava/nio/ByteBuffer;", "__init", "", "mutateValueType", "", "mutateValueType-7apg3OU", "(B)Z", "obj", "value", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationElementMatcher extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion */
    /* JADX INFO: compiled from: AnnotationElementMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;", "", "()V", "addName", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "name", "", "addValue", "value", "addValueType", "valueType", "Lkotlin/UByte;", "addValueType-EK-6454", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "createAnnotationElementMatcher", "nameOffset", "valueOffset", "createAnnotationElementMatcher-SpDDLgk", "(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I", "endAnnotationElementMatcher", "getRootAsAnnotationElementMatcher", "Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startAnnotationElementMatcher", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public final void addName(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addValue(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        /* JADX INFO: renamed from: addValueType-EK-6454, reason: not valid java name */
        public final void m10399addValueTypeEK6454(com.google.flatbuffers.FlatBufferBuilder r3, byte r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                r1 = 0
                r3.addByte(r0, r4, r1)
                return
        }

        /* JADX INFO: renamed from: createAnnotationElementMatcher-SpDDLgk, reason: not valid java name */
        public final int m10400createAnnotationElementMatcherSpDDLgk(com.google.flatbuffers.FlatBufferBuilder r2, int r3, byte r4, int r5) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 3
                r2.startTable(r0)
                r1.addValue(r2, r5)
                r1.addName(r2, r3)
                r1.m10399addValueTypeEK6454(r2, r4)
                int r0 = r1.endAnnotationElementMatcher(r2)
                return r0
        }

        public final int endAnnotationElementMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.AnnotationElementMatcher getRootAsAnnotationElementMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-AnnotationElementMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationElementMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-AnnotationElementMatcher r0 = r1.getRootAsAnnotationElementMatcher(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.AnnotationElementMatcher getRootAsAnnotationElementMatcher(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.AnnotationElementMatcher r4) {
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
                org.luckypray.dexkit.schema.-AnnotationElementMatcher r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startAnnotationElementMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
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

    public final org.luckypray.dexkit.schema.AnnotationElementMatcher __assign(int r2, java.nio.ByteBuffer r3) {
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

    public final org.luckypray.dexkit.schema.StringMatcher getName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r0 = r1.name(r0)
            return r0
    }

    /* JADX INFO: renamed from: getValueType-w2LRezQ, reason: not valid java name */
    public final byte m10397getValueTypew2LRezQ() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            byte r1 = r1.get(r2)
            byte r1 = kotlin.UByte.m8687constructorimpl(r1)
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    /* JADX INFO: renamed from: mutateValueType-7apg3OU, reason: not valid java name */
    public final boolean m10398mutateValueType7apg3OU(byte r4) {
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

    public final org.luckypray.dexkit.schema.StringMatcher name(org.luckypray.dexkit.schema.StringMatcher r5) {
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

    public final com.google.flatbuffers.Table value(com.google.flatbuffers.Table r3) {
            r2 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L15
            int r1 = r2.bb_pos
            int r1 = r1 + r0
            com.google.flatbuffers.Table r1 = r2.__union(r3, r1)
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }
}

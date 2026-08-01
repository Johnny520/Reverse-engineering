package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher, reason: invalid class name */
/* JADX INFO: compiled from: AnnotationMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0014J\u0018\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001d\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "Lcom/google/flatbuffers/Table;", "()V", "elements", "Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;", "getElements", "()Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;", "policy", "", "getPolicy", "()B", "targetElementTypes", "Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "getTargetElementTypes", "()Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "type", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getType", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "usingStringsLength", "", "getUsingStringsLength", "()I", "__assign", "_i", "_bb", "Ljava/nio/ByteBuffer;", "__init", "", "obj", "mutatePolicy", "", "usingStrings", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "j", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationMatcher extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.AnnotationMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher$Companion */
    /* JADX INFO: compiled from: AnnotationMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bJ6\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\u0004¨\u0006$"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;", "", "()V", "addElements", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "elements", "", "addPolicy", "policy", "", "addTargetElementTypes", "targetElementTypes", "addType", "type", "addUsingStrings", "usingStrings", "createAnnotationMatcher", "typeOffset", "targetElementTypesOffset", "elementsOffset", "usingStringsOffset", "createUsingStringsVector", "data", "", "endAnnotationMatcher", "getRootAsAnnotationMatcher", "Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startAnnotationMatcher", "startUsingStringsVector", "numElems", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public final void addElements(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 3
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addPolicy(com.google.flatbuffers.FlatBufferBuilder r3, byte r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                r1 = 0
                r3.addByte(r0, r4, r1)
                return
        }

        public final void addTargetElementTypes(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addType(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addUsingStrings(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 4
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final int createAnnotationMatcher(com.google.flatbuffers.FlatBufferBuilder r2, int r3, int r4, byte r5, int r6, int r7) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 5
                r2.startTable(r0)
                r1.addUsingStrings(r2, r7)
                r1.addElements(r2, r6)
                r1.addTargetElementTypes(r2, r4)
                r1.addType(r2, r3)
                r1.addPolicy(r2, r5)
                int r0 = r1.endAnnotationMatcher(r2)
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

        public final int endAnnotationMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.AnnotationMatcher getRootAsAnnotationMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-AnnotationMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-AnnotationMatcher r0 = r1.getRootAsAnnotationMatcher(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.AnnotationMatcher getRootAsAnnotationMatcher(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.AnnotationMatcher r4) {
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
                org.luckypray.dexkit.schema.-AnnotationMatcher r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startAnnotationMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 5
                r2.startTable(r0)
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

    public final org.luckypray.dexkit.schema.AnnotationMatcher __assign(int r2, java.nio.ByteBuffer r3) {
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

    public final org.luckypray.dexkit.schema.AnnotationElementsMatcher elements(org.luckypray.dexkit.schema.AnnotationElementsMatcher r5) {
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
            org.luckypray.dexkit.schema.-AnnotationElementsMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

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
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            byte r1 = r1.get(r2)
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public final org.luckypray.dexkit.schema.TargetElementTypesMatcher getTargetElementTypes() {
            r1 = this;
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r0 = new org.luckypray.dexkit.schema.-TargetElementTypesMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r0 = r1.targetElementTypes(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getType() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.type(r0)
            return r0
    }

    public final int getUsingStringsLength() {
            r2 = this;
            r0 = 12
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r2.__vector_len(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public final boolean mutatePolicy(byte r4) {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            r1.put(r2, r4)
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public final org.luckypray.dexkit.schema.TargetElementTypesMatcher targetElementTypes(org.luckypray.dexkit.schema.TargetElementTypesMatcher r5) {
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
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher r1 = r5.__assign(r1, r2)
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher type(org.luckypray.dexkit.schema.ClassMatcher r5) {
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
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r5.__assign(r1, r2)
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
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
            r0 = 12
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

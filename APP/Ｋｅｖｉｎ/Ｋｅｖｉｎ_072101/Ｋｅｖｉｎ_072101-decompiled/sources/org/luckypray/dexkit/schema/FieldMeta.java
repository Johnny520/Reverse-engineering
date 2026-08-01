package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta, reason: invalid class name */
/* JADX INFO: compiled from: FieldMeta.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b#\u0010!J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b%\u0010!J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b'\u0010!J\u0018\u0010(\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b)\u0010!R\u0017\u0010\u0003\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-FieldMeta;", "Lcom/google/flatbuffers/Table;", "()V", "accessFlags", "Lkotlin/UInt;", "getAccessFlags-pVg5ArA", "()I", "classId", "getClassId-pVg5ArA", "dexDescriptor", "", "getDexDescriptor", "()Ljava/lang/String;", "dexDescriptorAsByteBuffer", "Ljava/nio/ByteBuffer;", "getDexDescriptorAsByteBuffer", "()Ljava/nio/ByteBuffer;", "dexId", "getDexId-pVg5ArA", "id", "getId-pVg5ArA", "typeId", "getTypeId-pVg5ArA", "__assign", "_i", "", "_bb", "__init", "", "dexDescriptorInByteBuffer", "mutateAccessFlags", "", "mutateAccessFlags-WZ4Q5Ns", "(I)Z", "mutateClassId", "mutateClassId-WZ4Q5Ns", "mutateDexId", "mutateDexId-WZ4Q5Ns", "mutateId", "mutateId-WZ4Q5Ns", "mutateTypeId", "mutateTypeId-WZ4Q5Ns", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class FieldMeta extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.FieldMeta.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta$Companion */
    /* JADX INFO: compiled from: FieldMeta.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\nJ \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\nJH\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-FieldMeta$Companion;", "", "()V", "addAccessFlags", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "accessFlags", "Lkotlin/UInt;", "addAccessFlags-Qn1smSk", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addClassId", "classId", "addClassId-Qn1smSk", "addDexDescriptor", "dexDescriptor", "", "addDexId", "dexId", "addDexId-Qn1smSk", "addId", "id", "addId-Qn1smSk", "addTypeId", "typeId", "addTypeId-Qn1smSk", "createFieldMeta", "dexDescriptorOffset", "createFieldMeta--riHEuE", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIII)I", "endFieldMeta", "getRootAsFieldMeta", "Lorg/luckypray/dexkit/schema/-FieldMeta;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startFieldMeta", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk, reason: not valid java name */
        public final void m10438addAccessFlagsQn1smSk(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 3
                r1 = 0
                r3.addInt(r0, r4, r1)
                return
        }

        /* JADX INFO: renamed from: addClassId-Qn1smSk, reason: not valid java name */
        public final void m10439addClassIdQn1smSk(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                r1 = 0
                r3.addInt(r0, r4, r1)
                return
        }

        public final void addDexDescriptor(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 4
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m10440addDexIdQn1smSk(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                r1 = 0
                r3.addInt(r0, r4, r1)
                return
        }

        /* JADX INFO: renamed from: addId-Qn1smSk, reason: not valid java name */
        public final void m10441addIdQn1smSk(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addInt(r0, r3, r0)
                return
        }

        /* JADX INFO: renamed from: addTypeId-Qn1smSk, reason: not valid java name */
        public final void m10442addTypeIdQn1smSk(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 5
                r1 = 0
                r3.addInt(r0, r4, r1)
                return
        }

        /* JADX INFO: renamed from: createFieldMeta--riHEuE, reason: not valid java name */
        public final int m10443createFieldMetariHEuE(com.google.flatbuffers.FlatBufferBuilder r2, int r3, int r4, int r5, int r6, int r7, int r8) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 6
                r2.startTable(r0)
                r1.m10442addTypeIdQn1smSk(r2, r8)
                r1.addDexDescriptor(r2, r7)
                r1.m10438addAccessFlagsQn1smSk(r2, r6)
                r1.m10439addClassIdQn1smSk(r2, r5)
                r1.m10440addDexIdQn1smSk(r2, r4)
                r1.m10441addIdQn1smSk(r2, r3)
                int r0 = r1.endFieldMeta(r2)
                return r0
        }

        public final int endFieldMeta(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.FieldMeta getRootAsFieldMeta(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-FieldMeta r0 = new org.luckypray.dexkit.schema.-FieldMeta
                r0.<init>()
                org.luckypray.dexkit.schema.-FieldMeta r0 = r1.getRootAsFieldMeta(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.FieldMeta getRootAsFieldMeta(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.FieldMeta r4) {
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
                org.luckypray.dexkit.schema.-FieldMeta r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startFieldMeta(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 6
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
            org.luckypray.dexkit.schema.-FieldMeta$Companion r0 = new org.luckypray.dexkit.schema.-FieldMeta$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.FieldMeta.Companion = r0
            return
    }

    public FieldMeta() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.FieldMeta __assign(int r2, java.nio.ByteBuffer r3) {
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

    public final java.nio.ByteBuffer dexDescriptorInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "_bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 12
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            java.lang.String r1 = "__vector_in_bytebuffer(_bb, 12, 1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA, reason: not valid java name */
    public final int m10428getAccessFlagspVg5ArA() {
            r3 = this;
            r0 = 10
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    /* JADX INFO: renamed from: getClassId-pVg5ArA, reason: not valid java name */
    public final int m10429getClassIdpVg5ArA() {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public final java.lang.String getDexDescriptor() {
            r2 = this;
            r0 = 12
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

    public final java.nio.ByteBuffer getDexDescriptorAsByteBuffer() {
            r2 = this;
            r0 = 12
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            java.lang.String r1 = "__vector_as_bytebuffer(12, 1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA, reason: not valid java name */
    public final int m10430getDexIdpVg5ArA() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    /* JADX INFO: renamed from: getId-pVg5ArA, reason: not valid java name */
    public final int m10431getIdpVg5ArA() {
            r3 = this;
            r0 = 4
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    /* JADX INFO: renamed from: getTypeId-pVg5ArA, reason: not valid java name */
    public final int m10432getTypeIdpVg5ArA() {
            r3 = this;
            r0 = 14
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m10433mutateAccessFlagsWZ4Q5Ns(int r4) {
            r3 = this;
            r0 = 10
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            r1.putInt(r2, r4)
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    /* JADX INFO: renamed from: mutateClassId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m10434mutateClassIdWZ4Q5Ns(int r4) {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            r1.putInt(r2, r4)
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m10435mutateDexIdWZ4Q5Ns(int r4) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            r1.putInt(r2, r4)
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m10436mutateIdWZ4Q5Ns(int r4) {
            r3 = this;
            r0 = 4
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            r1.putInt(r2, r4)
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: mutateTypeId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m10437mutateTypeIdWZ4Q5Ns(int r4) {
            r3 = this;
            r0 = 14
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            r1.putInt(r2, r4)
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }
}

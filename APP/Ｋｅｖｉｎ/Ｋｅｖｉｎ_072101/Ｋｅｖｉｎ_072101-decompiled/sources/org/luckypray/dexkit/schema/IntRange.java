package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-IntRange, reason: invalid class name */
/* JADX INFO: compiled from: IntRange.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u0013"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-IntRange;", "Lcom/google/flatbuffers/Table;", "()V", "max", "", "getMax", "()I", "min", "getMin", "__assign", "_i", "_bb", "Ljava/nio/ByteBuffer;", "__init", "", "mutateMax", "", "mutateMin", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class IntRange extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.IntRange.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-IntRange$Companion */
    /* JADX INFO: compiled from: IntRange.kt */
    @kotlin.Metadata(m114d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0004¨\u0006\u0014"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-IntRange$Companion;", "", "()V", "addMax", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "max", "", "addMin", "min", "createIntRange", "endIntRange", "getRootAsIntRange", "Lorg/luckypray/dexkit/schema/-IntRange;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startIntRange", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public final void addMax(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                r1 = 0
                r3.addInt(r0, r4, r1)
                return
        }

        public final void addMin(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addInt(r0, r3, r0)
                return
        }

        public final int createIntRange(com.google.flatbuffers.FlatBufferBuilder r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 2
                r2.startTable(r0)
                r1.addMax(r2, r4)
                r1.addMin(r2, r3)
                int r0 = r1.endIntRange(r2)
                return r0
        }

        public final int endIntRange(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.IntRange getRootAsIntRange(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-IntRange r0 = new org.luckypray.dexkit.schema.-IntRange
                r0.<init>()
                org.luckypray.dexkit.schema.-IntRange r0 = r1.getRootAsIntRange(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.IntRange getRootAsIntRange(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.IntRange r4) {
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
                org.luckypray.dexkit.schema.-IntRange r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startIntRange(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
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
            org.luckypray.dexkit.schema.-IntRange$Companion r0 = new org.luckypray.dexkit.schema.-IntRange$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.IntRange.Companion = r0
            return
    }

    public IntRange() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.IntRange __assign(int r2, java.nio.ByteBuffer r3) {
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

    public final int getMax() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public final int getMin() {
            r3 = this;
            r0 = 4
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public final boolean mutateMax(int r4) {
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

    public final boolean mutateMin(int r4) {
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
}

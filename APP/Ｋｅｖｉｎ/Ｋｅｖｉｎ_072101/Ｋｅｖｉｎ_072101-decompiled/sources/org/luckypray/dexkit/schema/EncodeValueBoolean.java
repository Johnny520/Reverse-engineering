package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueBoolean, reason: invalid class name */
/* JADX INFO: compiled from: EncodeValueBoolean.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;", "Lcom/google/flatbuffers/Table;", "()V", "value", "", "getValue", "()Z", "__assign", "_i", "", "_bb", "Ljava/nio/ByteBuffer;", "__init", "", "mutateValue", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class EncodeValueBoolean extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.EncodeValueBoolean.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion */
    /* JADX INFO: compiled from: EncodeValueBoolean.kt */
    @kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0004¨\u0006\u0013"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;", "", "()V", "addValue", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "value", "", "createEncodeValueBoolean", "", "endEncodeValueBoolean", "getRootAsEncodeValueBoolean", "Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startEncodeValueBoolean", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public final void addValue(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addBoolean(r0, r3, r0)
                return
        }

        public final int createEncodeValueBoolean(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 1
                r2.startTable(r0)
                r1.addValue(r2, r3)
                int r0 = r1.endEncodeValueBoolean(r2)
                return r0
        }

        public final int endEncodeValueBoolean(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.EncodeValueBoolean getRootAsEncodeValueBoolean(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-EncodeValueBoolean r0 = new org.luckypray.dexkit.schema.-EncodeValueBoolean
                r0.<init>()
                org.luckypray.dexkit.schema.-EncodeValueBoolean r0 = r1.getRootAsEncodeValueBoolean(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.EncodeValueBoolean getRootAsEncodeValueBoolean(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.EncodeValueBoolean r4) {
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
                org.luckypray.dexkit.schema.-EncodeValueBoolean r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startEncodeValueBoolean(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 1
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
            org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion r0 = new org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.EncodeValueBoolean.Companion = r0
            return
    }

    public EncodeValueBoolean() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.EncodeValueBoolean __assign(int r2, java.nio.ByteBuffer r3) {
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

    public final boolean getValue() {
            r5 = this;
            r0 = 4
            int r0 = r5.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            byte r2 = (byte) r1
            java.nio.ByteBuffer r3 = r5.f50bb
            int r4 = r5.bb_pos
            int r4 = r4 + r0
            byte r3 = r3.get(r4)
            if (r2 == r3) goto L15
            r1 = 1
        L15:
            return r1
    }

    public final boolean mutateValue(boolean r5) {
            r4 = this;
            r0 = 4
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r4.f50bb
            int r2 = r4.bb_pos
            int r2 = r2 + r0
            byte r3 = (byte) r5
            r1.put(r2, r3)
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }
}

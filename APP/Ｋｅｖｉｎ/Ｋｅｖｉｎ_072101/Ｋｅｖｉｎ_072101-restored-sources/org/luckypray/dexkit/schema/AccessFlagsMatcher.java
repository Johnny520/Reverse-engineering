package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher, reason: invalid class name */
/* JADX INFO: compiled from: AccessFlagsMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bR\u0017\u0010\u0003\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "Lcom/google/flatbuffers/Table;", "()V", "flags", "Lkotlin/UInt;", "getFlags-pVg5ArA", "()I", "matchType", "", "getMatchType", "()B", "__assign", "_i", "", "_bb", "Ljava/nio/ByteBuffer;", "__init", "", "mutateFlags", "", "mutateFlags-WZ4Q5Ns", "(I)Z", "mutateMatchType", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AccessFlagsMatcher extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.AccessFlagsMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion */
    /* JADX INFO: compiled from: AccessFlagsMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;", "", "()V", "addFlags", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "flags", "Lkotlin/UInt;", "addFlags-Qn1smSk", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addMatchType", "matchType", "", "createAccessFlagsMatcher", "", "createAccessFlagsMatcher-OsBMiQA", "(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I", "endAccessFlagsMatcher", "getRootAsAccessFlagsMatcher", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startAccessFlagsMatcher", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        /* JADX INFO: renamed from: addFlags-Qn1smSk, reason: not valid java name */
        public final void m10395addFlagsQn1smSk(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addInt(r0, r3, r0)
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

        /* JADX INFO: renamed from: createAccessFlagsMatcher-OsBMiQA, reason: not valid java name */
        public final int m10396createAccessFlagsMatcherOsBMiQA(com.google.flatbuffers.FlatBufferBuilder r2, int r3, byte r4) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 2
                r2.startTable(r0)
                r1.m10395addFlagsQn1smSk(r2, r3)
                r1.addMatchType(r2, r4)
                int r0 = r1.endAccessFlagsMatcher(r2)
                return r0
        }

        public final int endAccessFlagsMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.AccessFlagsMatcher getRootAsAccessFlagsMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = new org.luckypray.dexkit.schema.-AccessFlagsMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = r1.getRootAsAccessFlagsMatcher(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.AccessFlagsMatcher getRootAsAccessFlagsMatcher(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.AccessFlagsMatcher r4) {
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
                org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startAccessFlagsMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
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
            org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion r0 = new org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.AccessFlagsMatcher.Companion = r0
            return
    }

    public AccessFlagsMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.AccessFlagsMatcher __assign(int r2, java.nio.ByteBuffer r3) {
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

    /* JADX INFO: renamed from: getFlags-pVg5ArA, reason: not valid java name */
    public final int m10393getFlagspVg5ArA() {
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

    /* JADX INFO: renamed from: mutateFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m10394mutateFlagsWZ4Q5Ns(int r4) {
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
}

package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;", "Lcom/google/flatbuffers/Table;", "<init>", "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;", "j", "Lorg/luckypray/dexkit/schema/-BatchClassMeta;", "items", "(I)Lorg/luckypray/dexkit/schema/-BatchClassMeta;", "obj", "(Lorg/luckypray/dexkit/schema/-BatchClassMeta;I)Lorg/luckypray/dexkit/schema/-BatchClassMeta;", "getItemsLength", "()I", "itemsLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class BatchClassMetaArrayHolder extends com.google.flatbuffers.Table {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.schema.BatchClassMetaArrayHolder.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder$Companion */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;", "", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;", "getRootAsBatchClassMetaArrayHolder", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;", "obj", "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;)Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "itemsOffset", "createBatchClassMetaArrayHolder", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)I", "startBatchClassMetaArrayHolder", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "items", "addItems", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "", "data", "createItemsVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startItemsVector", "endBatchClassMetaArrayHolder", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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

        public final void addItems(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final int createBatchClassMetaArrayHolder(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 1
                r2.startTable(r0)
                r1.addItems(r2, r3)
                int r2 = r1.endBatchClassMetaArrayHolder(r2)
                return r2
        }

        public final int createItemsVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, @Yue.InterfaceC4418 int[] r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "data"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.length
                r1 = 4
                r3.startVector(r1, r0, r1)
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
                int r3 = r3.endVector()
                return r3
        }

        public final int endBatchClassMetaArrayHolder(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                int r2 = r2.endTable()
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.BatchClassMetaArrayHolder getRootAsBatchClassMetaArrayHolder(@Yue.InterfaceC4418 java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder r0 = new org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder
                r0.<init>()
                org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder r2 = r1.getRootAsBatchClassMetaArrayHolder(r2, r0)
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.BatchClassMetaArrayHolder getRootAsBatchClassMetaArrayHolder(@Yue.InterfaceC4418 java.nio.ByteBuffer r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.BatchClassMetaArrayHolder r4) {
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
                org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder r3 = r4.__assign(r0, r3)
                return r3
        }

        public final void startBatchClassMetaArrayHolder(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 1
                r2.startTable(r0)
                return
        }

        public final void startItemsVector(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
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
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder$Companion r0 = new org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.BatchClassMetaArrayHolder.Companion = r0
            return
    }

    public BatchClassMetaArrayHolder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.schema.BatchClassMetaArrayHolder __assign(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
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

    public final int getItemsLength() {
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

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.BatchClassMeta items(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-BatchClassMeta r0 = new org.luckypray.dexkit.schema.-BatchClassMeta
            r0.<init>()
            org.luckypray.dexkit.schema.-BatchClassMeta r2 = r1.items(r0, r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.BatchClassMeta items(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.BatchClassMeta r3, int r4) {
            r2 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r3, r0)
            r0 = 4
            int r1 = r2.__offset(r0)
            if (r1 == 0) goto L22
            int r1 = r2.__vector(r1)
            int r4 = r4 * r0
            int r1 = r1 + r4
            int r4 = r2.__indirect(r1)
            java.nio.ByteBuffer r0 = r2.bb
            java.lang.String r1 = "bb"
            Yue.C3329.m13905(r0, r1)
            org.luckypray.dexkit.schema.-BatchClassMeta r3 = r3.__assign(r4, r0)
            goto L23
        L22:
            r3 = 0
        L23:
            return r3
    }
}

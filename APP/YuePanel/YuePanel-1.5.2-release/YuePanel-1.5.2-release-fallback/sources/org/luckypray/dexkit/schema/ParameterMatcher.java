package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParameterMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lorg/luckypray/dexkit/schema/-ParameterMatcher;", "Lcom/google/flatbuffers/Table;", "<init>", "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParameterMatcher;", "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "obj", "annotations", "(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "parameterType", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getAnnotations", "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "getParameterType", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ParameterMatcher extends com.google.flatbuffers.Table {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.schema.ParameterMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParameterMatcher$Companion */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ%\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/schema/-ParameterMatcher$Companion;", "", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-ParameterMatcher;", "getRootAsParameterMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParameterMatcher;", "obj", "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-ParameterMatcher;)Lorg/luckypray/dexkit/schema/-ParameterMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "annotationsOffset", "parameterTypeOffset", "createParameterMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;II)I", "startParameterMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "annotations", "addAnnotations", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "parameterType", "addParameterType", "endParameterMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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

        public final void addAnnotations(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addParameterType(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r3, r0)
                r0 = 1
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final int createParameterMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                r0 = 2
                r2.startTable(r0)
                r1.addParameterType(r2, r4)
                r1.addAnnotations(r2, r3)
                int r2 = r1.endParameterMatcher(r2)
                return r2
        }

        public final int endParameterMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
                int r2 = r2.endTable()
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.ParameterMatcher getRootAsParameterMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.schema.-ParameterMatcher r0 = new org.luckypray.dexkit.schema.-ParameterMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-ParameterMatcher r2 = r1.getRootAsParameterMatcher(r2, r0)
                return r2
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.schema.ParameterMatcher getRootAsParameterMatcher(@Yue.InterfaceC4418 java.nio.ByteBuffer r3, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.ParameterMatcher r4) {
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
                org.luckypray.dexkit.schema.-ParameterMatcher r3 = r4.__assign(r0, r3)
                return r3
        }

        public final void startParameterMatcher(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                Yue.C3329.m13906(r2, r0)
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
            org.luckypray.dexkit.schema.-ParameterMatcher$Companion r0 = new org.luckypray.dexkit.schema.-ParameterMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.ParameterMatcher.Companion = r0
            return
    }

    public ParameterMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.schema.ParameterMatcher __assign(int r2, @Yue.InterfaceC4418 java.nio.ByteBuffer r3) {
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
    public final org.luckypray.dexkit.schema.AnnotationsMatcher annotations(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationsMatcher r4) {
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
            org.luckypray.dexkit.schema.-AnnotationsMatcher r4 = r4.__assign(r0, r1)
            goto L20
        L1f:
            r4 = 0
        L20:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.AnnotationsMatcher getAnnotations() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = r1.annotations(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher getParameterType() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.parameterType(r0)
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.schema.ClassMatcher parameterType(@Yue.InterfaceC4418 org.luckypray.dexkit.schema.ClassMatcher r4) {
            r3 = this;
            java.lang.String r0 = "obj"
            Yue.C3329.m13906(r4, r0)
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L1f
            int r1 = r3.bb_pos
            int r0 = r0 + r1
            int r0 = r3.__indirect(r0)
            java.nio.ByteBuffer r1 = r3.bb
            java.lang.String r2 = "bb"
            Yue.C3329.m13905(r1, r2)
            org.luckypray.dexkit.schema.-ClassMatcher r4 = r4.__assign(r0, r1)
            goto L20
        L1f:
            r4 = 0
        L20:
            return r4
    }
}

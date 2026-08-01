package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher, reason: invalid class name */
/* JADX INFO: compiled from: ClassMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020)2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010*\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010*\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010*\u001a\u00020\u0014J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010*\u001a\u00020\u0018J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010*\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u0000J\u0010\u0010+\u001a\u0004\u0018\u00010\f2\u0006\u0010,\u001a\u00020!J\u0018\u0010+\u001a\u0004\u0018\u00010\f2\u0006\u0010*\u001a\u00020\f2\u0006\u0010,\u001a\u00020!R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006."}, m115d2 = {"Lorg/luckypray/dexkit/schema/-ClassMatcher;", "Lcom/google/flatbuffers/Table;", "()V", "accessFlags", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "getAccessFlags", "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "annotations", "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "getAnnotations", "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "className", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "getClassName", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "fields", "Lorg/luckypray/dexkit/schema/-FieldsMatcher;", "getFields", "()Lorg/luckypray/dexkit/schema/-FieldsMatcher;", "interfaces", "Lorg/luckypray/dexkit/schema/-InterfacesMatcher;", "getInterfaces", "()Lorg/luckypray/dexkit/schema/-InterfacesMatcher;", "methods", "Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getMethods", "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "smaliSource", "getSmaliSource", "superClass", "getSuperClass", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "usingStringsLength", "", "getUsingStringsLength", "()I", "__assign", "_i", "_bb", "Ljava/nio/ByteBuffer;", "__init", "", "obj", "usingStrings", "j", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class ClassMatcher extends com.google.flatbuffers.Table {
    public static final org.luckypray.dexkit.schema.ClassMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher$Companion */
    /* JADX INFO: compiled from: ClassMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bJ\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJV\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\u0016\u0010#\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\bJ\u0006\u0010/\u001a\u00020\u0004¨\u00060"}, m115d2 = {"Lorg/luckypray/dexkit/schema/-ClassMatcher$Companion;", "", "()V", "addAccessFlags", "", "builder", "Lcom/google/flatbuffers/FlatBufferBuilder;", "accessFlags", "", "addAnnotations", "annotations", "addClassName", "className", "addFields", "fields", "addInterfaces", "interfaces", "addMethods", "methods", "addSmaliSource", "smaliSource", "addSuperClass", "superClass", "addUsingStrings", "usingStrings", "createClassMatcher", "smaliSourceOffset", "classNameOffset", "accessFlagsOffset", "superClassOffset", "interfacesOffset", "annotationsOffset", "fieldsOffset", "methodsOffset", "usingStringsOffset", "createUsingStringsVector", "data", "", "endClassMatcher", "getRootAsClassMatcher", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "_bb", "Ljava/nio/ByteBuffer;", "obj", "startClassMatcher", "startUsingStringsVector", "numElems", "validateVersion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public final void addAccessFlags(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addAnnotations(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 5
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addClassName(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addFields(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 6
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addInterfaces(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 4
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addMethods(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 7
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addSmaliSource(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r2.addOffset(r0, r3, r0)
                return
        }

        public final void addSuperClass(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 3
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final void addUsingStrings(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
                r2 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 8
                r1 = 0
                r3.addOffset(r0, r4, r1)
                return
        }

        public final int createClassMatcher(com.google.flatbuffers.FlatBufferBuilder r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 9
                r2.startTable(r0)
                r1.addUsingStrings(r2, r11)
                r1.addMethods(r2, r10)
                r1.addFields(r2, r9)
                r1.addAnnotations(r2, r8)
                r1.addInterfaces(r2, r7)
                r1.addSuperClass(r2, r6)
                r1.addAccessFlags(r2, r5)
                r1.addClassName(r2, r4)
                r1.addSmaliSource(r2, r3)
                int r0 = r1.endClassMatcher(r2)
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

        public final int endClassMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.endTable()
                return r0
        }

        public final org.luckypray.dexkit.schema.ClassMatcher getRootAsClassMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "_bb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.getRootAsClassMatcher(r2, r0)
                return r0
        }

        public final org.luckypray.dexkit.schema.ClassMatcher getRootAsClassMatcher(java.nio.ByteBuffer r3, org.luckypray.dexkit.schema.ClassMatcher r4) {
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
                org.luckypray.dexkit.schema.-ClassMatcher r0 = r4.__assign(r0, r3)
                return r0
        }

        public final void startClassMatcher(com.google.flatbuffers.FlatBufferBuilder r2) {
                r1 = this;
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 9
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
            org.luckypray.dexkit.schema.-ClassMatcher$Companion r0 = new org.luckypray.dexkit.schema.-ClassMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.ClassMatcher.Companion = r0
            return
    }

    public ClassMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.ClassMatcher __assign(int r2, java.nio.ByteBuffer r3) {
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

    public final org.luckypray.dexkit.schema.AccessFlagsMatcher accessFlags(org.luckypray.dexkit.schema.AccessFlagsMatcher r5) {
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
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher annotations(org.luckypray.dexkit.schema.AnnotationsMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 14
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-AnnotationsMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher className(org.luckypray.dexkit.schema.StringMatcher r5) {
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
            org.luckypray.dexkit.schema.-StringMatcher r1 = r5.__assign(r1, r2)
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    public final org.luckypray.dexkit.schema.FieldsMatcher fields(org.luckypray.dexkit.schema.FieldsMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 16
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-FieldsMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.AccessFlagsMatcher getAccessFlags() {
            r1 = this;
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = new org.luckypray.dexkit.schema.-AccessFlagsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AccessFlagsMatcher r0 = r1.accessFlags(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher getAnnotations() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = r1.annotations(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.StringMatcher getClassName() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r0 = r1.className(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.FieldsMatcher getFields() {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldsMatcher r0 = new org.luckypray.dexkit.schema.-FieldsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldsMatcher r0 = r1.fields(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.InterfacesMatcher getInterfaces() {
            r1 = this;
            org.luckypray.dexkit.schema.-InterfacesMatcher r0 = new org.luckypray.dexkit.schema.-InterfacesMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-InterfacesMatcher r0 = r1.interfaces(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher getMethods() {
            r1 = this;
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = new org.luckypray.dexkit.schema.-MethodsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-MethodsMatcher r0 = r1.methods(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.StringMatcher getSmaliSource() {
            r1 = this;
            org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-StringMatcher r0 = r1.smaliSource(r0)
            return r0
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getSuperClass() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r0 = r1.superClass(r0)
            return r0
    }

    public final int getUsingStringsLength() {
            r2 = this;
            r0 = 20
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r2.__vector_len(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public final org.luckypray.dexkit.schema.InterfacesMatcher interfaces(org.luckypray.dexkit.schema.InterfacesMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 12
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-InterfacesMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.MethodsMatcher methods(org.luckypray.dexkit.schema.MethodsMatcher r5) {
            r4 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 18
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L20
            int r1 = r4.bb_pos
            int r1 = r1 + r0
            int r1 = r4.__indirect(r1)
            java.nio.ByteBuffer r2 = r4.f50bb
            java.lang.String r3 = "bb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodsMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public final org.luckypray.dexkit.schema.StringMatcher smaliSource(org.luckypray.dexkit.schema.StringMatcher r5) {
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

    public final org.luckypray.dexkit.schema.ClassMatcher superClass(org.luckypray.dexkit.schema.ClassMatcher r5) {
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
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r5.__assign(r1, r2)
            goto L21
        L20:
            r1 = 0
        L21:
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
            r0 = 20
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

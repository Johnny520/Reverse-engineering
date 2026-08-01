package org.luckypray.dexkit.wrap;

/* JADX INFO: compiled from: DexClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\b\u0016\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u0012\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u001c"}, m115d2 = {"Lorg/luckypray/dexkit/wrap/DexClass;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "descriptor", "", "(Ljava/lang/String;)V", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "className", "getClassName", "()Ljava/lang/String;", "isArray", "", "()Z", "simpleName", "getSimpleName", "typeName", "getTypeName", "equals", "other", "", "getInstance", "classLoader", "Ljava/lang/ClassLoader;", "hashCode", "", "toString", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class DexClass implements org.luckypray.dexkit.wrap.ISerializable {
    public static final org.luckypray.dexkit.wrap.DexClass.Companion Companion = null;
    private final java.lang.String typeName;

    /* JADX INFO: compiled from: DexClass.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m115d2 = {"Lorg/luckypray/dexkit/wrap/DexClass$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/DexClass;", "descriptor", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.wrap.DexClass deserialize(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.wrap.DexClass r0 = new org.luckypray.dexkit.wrap.DexClass
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.wrap.DexClass$Companion r0 = new org.luckypray.dexkit.wrap.DexClass$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.wrap.DexClass.Companion = r0
            return
    }

    public DexClass(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r2)
            r1.typeName = r0
            return
    }

    public DexClass(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r2)
            r1.typeName = r0
            return
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.wrap.DexClass deserialize(java.lang.String r1) {
            org.luckypray.dexkit.wrap.DexClass$Companion r0 = org.luckypray.dexkit.wrap.DexClass.Companion
            org.luckypray.dexkit.wrap.DexClass r0 = r0.deserialize(r1)
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r3 instanceof org.luckypray.dexkit.wrap.DexClass
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r2.typeName
            r1 = r3
            org.luckypray.dexkit.wrap.DexClass r1 = (org.luckypray.dexkit.wrap.DexClass) r1
            java.lang.String r1 = r1.typeName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r0
    }

    public final java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            return r0
    }

    public final java.lang.Class<?> getInstance(java.lang.ClassLoader r2) throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.Class r0 = r0.getClassInstance(r2, r1)
            return r0
    }

    public final java.lang.String getSimpleName() {
            r4 = this;
            java.lang.String r0 = r4.typeName
            r1 = 0
            r2 = 2
            r3 = 46
            java.lang.String r0 = kotlin.text.StringsKt.substringAfterLast$default(r0, r3, r1, r2, r1)
            return r0
    }

    public final java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isArray() {
            r5 = this;
            java.lang.String r0 = r5.typeName
            r1 = 2
            r2 = 0
            java.lang.String r3 = "[]"
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r0, r3, r4, r1, r2)
            return r0
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    public java.lang.String serialize() {
            r1 = this;
            java.lang.String r0 = org.luckypray.dexkit.wrap.ISerializable.DefaultImpls.serialize(r1)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r0)
            return r0
    }
}

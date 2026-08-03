package net.bytebuddy.implementation.auxiliary;

/* JADX INFO: loaded from: classes2.dex */
public enum TrivialType extends java.lang.Enum<net.bytebuddy.implementation.auxiliary.TrivialType> implements net.bytebuddy.implementation.auxiliary.AuxiliaryType {
    private static final /* synthetic */ net.bytebuddy.implementation.auxiliary.TrivialType[] $VALUES = null;
    public static final net.bytebuddy.implementation.auxiliary.TrivialType PLAIN = null;
    public static final net.bytebuddy.implementation.auxiliary.TrivialType SIGNATURE_RELEVANT = null;
    private final boolean eager;

    static {
            net.bytebuddy.implementation.auxiliary.TrivialType r0 = new net.bytebuddy.implementation.auxiliary.TrivialType
            java.lang.String r1 = "SIGNATURE_RELEVANT"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            net.bytebuddy.implementation.auxiliary.TrivialType.SIGNATURE_RELEVANT = r0
            net.bytebuddy.implementation.auxiliary.TrivialType r1 = new net.bytebuddy.implementation.auxiliary.TrivialType
            java.lang.String r4 = "PLAIN"
            r1.<init>(r4, r3, r2)
            net.bytebuddy.implementation.auxiliary.TrivialType.PLAIN = r1
            net.bytebuddy.implementation.auxiliary.TrivialType[] r0 = new net.bytebuddy.implementation.auxiliary.TrivialType[]{r0, r1}
            net.bytebuddy.implementation.auxiliary.TrivialType.$VALUES = r0
            return
    }

    TrivialType(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.eager = r3
            return
    }

    public static net.bytebuddy.implementation.auxiliary.TrivialType valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.auxiliary.TrivialType> r0 = net.bytebuddy.implementation.auxiliary.TrivialType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.auxiliary.TrivialType r1 = (net.bytebuddy.implementation.auxiliary.TrivialType) r1
            return r1
    }

    public static net.bytebuddy.implementation.auxiliary.TrivialType[] values() {
            net.bytebuddy.implementation.auxiliary.TrivialType[] r0 = net.bytebuddy.implementation.auxiliary.TrivialType.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.auxiliary.TrivialType[] r0 = (net.bytebuddy.implementation.auxiliary.TrivialType[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public java.lang.String getSuffix() {
            r1 = this;
            java.lang.String r0 = r1.name()
            int r0 = r0.hashCode()
            java.lang.String r0 = net.bytebuddy.utility.RandomString.hashOf(r0)
            return r0
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public net.bytebuddy.dynamic.DynamicType make(java.lang.String r2, net.bytebuddy.ClassFileVersion r3, net.bytebuddy.implementation.MethodAccessorFactory r4) {
            r1 = this;
            net.bytebuddy.ByteBuddy r4 = new net.bytebuddy.ByteBuddy
            r4.<init>(r3)
            net.bytebuddy.dynamic.scaffold.TypeValidation r3 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
            net.bytebuddy.ByteBuddy r3 = r4.with(r3)
            net.bytebuddy.dynamic.scaffold.MethodGraph$Empty r4 = net.bytebuddy.dynamic.scaffold.MethodGraph.Empty.INSTANCE
            net.bytebuddy.ByteBuddy r3 = r3.with(r4)
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r0 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
            net.bytebuddy.dynamic.DynamicType$Builder r3 = r3.subclass(r4, r0)
            boolean r4 = r1.eager
            if (r4 == 0) goto L2d
            java.lang.Class<net.bytebuddy.implementation.auxiliary.AuxiliaryType$SignatureRelevant> r4 = net.bytebuddy.implementation.auxiliary.AuxiliaryType.SignatureRelevant.class
            net.bytebuddy.description.annotation.AnnotationDescription$Builder r4 = net.bytebuddy.description.annotation.AnnotationDescription.Builder.ofType(r4)
            r0 = 0
            net.bytebuddy.description.annotation.AnnotationDescription r4 = r4.build(r0)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            goto L31
        L2d:
            java.util.List r4 = java.util.Collections.emptyList()
        L31:
            net.bytebuddy.dynamic.DynamicType$Builder r3 = r3.annotateType(r4)
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r3.name(r2)
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r3 = net.bytebuddy.implementation.auxiliary.AuxiliaryType.DEFAULT_TYPE_MODIFIER
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r2.modifiers(r3)
            net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r2.make()
            return r2
    }
}

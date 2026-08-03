package net.bytebuddy.dynamic.loading;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageDefinitionStrategy {

    public interface Definition {

        public static class Simple implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition {

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String implementationTitle;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String implementationVendor;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String implementationVersion;

            @net.bytebuddy.utility.nullability.MaybeNull
            protected final java.net.URL sealBase;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String specificationTitle;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String specificationVendor;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String specificationVersion;

            public Simple(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.net.URL r7) {
                    r0 = this;
                    r0.<init>()
                    r0.specificationTitle = r1
                    r0.specificationVersion = r2
                    r0.specificationVendor = r3
                    r0.implementationTitle = r4
                    r0.implementationVersion = r5
                    r0.implementationVendor = r6
                    r0.sealBase = r7
                    return
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Package sealing relies on URL equality.", value = {"DMI_BLOCKING_METHODS_ON_URL"})
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 == 0) goto L90
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    goto L90
                L13:
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Simple r5 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Simple) r5
                    java.lang.String r2 = r4.specificationTitle
                    if (r2 == 0) goto L23
                    java.lang.String r3 = r5.specificationTitle
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    goto L8e
                L23:
                    java.lang.String r2 = r5.specificationTitle
                    if (r2 != 0) goto L8e
                L27:
                    java.lang.String r2 = r4.specificationVersion
                    if (r2 == 0) goto L34
                    java.lang.String r3 = r5.specificationVersion
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L38
                    goto L8e
                L34:
                    java.lang.String r2 = r5.specificationVersion
                    if (r2 != 0) goto L8e
                L38:
                    java.lang.String r2 = r4.specificationVendor
                    if (r2 == 0) goto L45
                    java.lang.String r3 = r5.specificationVendor
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L49
                    goto L8e
                L45:
                    java.lang.String r2 = r5.specificationVendor
                    if (r2 != 0) goto L8e
                L49:
                    java.lang.String r2 = r4.implementationTitle
                    if (r2 == 0) goto L56
                    java.lang.String r3 = r5.implementationTitle
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L5a
                    goto L8e
                L56:
                    java.lang.String r2 = r5.implementationTitle
                    if (r2 != 0) goto L8e
                L5a:
                    java.lang.String r2 = r4.implementationVersion
                    if (r2 == 0) goto L67
                    java.lang.String r3 = r5.implementationVersion
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L6b
                    goto L8e
                L67:
                    java.lang.String r2 = r5.implementationVersion
                    if (r2 != 0) goto L8e
                L6b:
                    java.lang.String r2 = r4.implementationVendor
                    if (r2 == 0) goto L78
                    java.lang.String r3 = r5.implementationVendor
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L7c
                    goto L8e
                L78:
                    java.lang.String r2 = r5.implementationVendor
                    if (r2 != 0) goto L8e
                L7c:
                    java.net.URL r2 = r4.sealBase
                    if (r2 == 0) goto L89
                    java.net.URL r5 = r5.sealBase
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L8f
                    goto L8e
                L89:
                    java.net.URL r5 = r5.sealBase
                    if (r5 != 0) goto L8e
                    goto L8f
                L8e:
                    r0 = r1
                L8f:
                    return r0
                L90:
                    return r1
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getImplementationTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.implementationTitle
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getImplementationVendor() {
                    r1 = this;
                    java.lang.String r0 = r1.implementationVendor
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getImplementationVersion() {
                    r1 = this;
                    java.lang.String r0 = r1.implementationVersion
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.net.URL getSealBase() {
                    r1 = this;
                    java.net.URL r0 = r1.sealBase
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getSpecificationTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.specificationTitle
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getSpecificationVendor() {
                    r1 = this;
                    java.lang.String r0 = r1.specificationVendor
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getSpecificationVersion() {
                    r1 = this;
                    java.lang.String r0 = r1.specificationVersion
                    return r0
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Package sealing relies on URL equality.", value = {"DMI_BLOCKING_METHODS_ON_URL"})
            public int hashCode() {
                    r3 = this;
                    java.lang.String r0 = r3.specificationTitle
                    r1 = 0
                    if (r0 == 0) goto La
                    int r0 = r0.hashCode()
                    goto Lb
                La:
                    r0 = r1
                Lb:
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.specificationVersion
                    if (r2 == 0) goto L16
                    int r2 = r2.hashCode()
                    goto L17
                L16:
                    r2 = r1
                L17:
                    int r0 = r0 + r2
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.specificationVendor
                    if (r2 == 0) goto L23
                    int r2 = r2.hashCode()
                    goto L24
                L23:
                    r2 = r1
                L24:
                    int r0 = r0 + r2
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.implementationTitle
                    if (r2 == 0) goto L30
                    int r2 = r2.hashCode()
                    goto L31
                L30:
                    r2 = r1
                L31:
                    int r0 = r0 + r2
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.implementationVersion
                    if (r2 == 0) goto L3d
                    int r2 = r2.hashCode()
                    goto L3e
                L3d:
                    r2 = r1
                L3e:
                    int r0 = r0 + r2
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.implementationVendor
                    if (r2 == 0) goto L4a
                    int r2 = r2.hashCode()
                    goto L4b
                L4a:
                    r2 = r1
                L4b:
                    int r0 = r0 + r2
                    int r0 = r0 * 31
                    java.net.URL r2 = r3.sealBase
                    if (r2 == 0) goto L56
                    int r1 = r2.hashCode()
                L56:
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(java.lang.Package r2) {
                    r1 = this;
                    java.net.URL r0 = r1.sealBase
                    if (r0 != 0) goto Lb
                    boolean r2 = r2.isSealed()
                    r2 = r2 ^ 1
                    return r2
                Lb:
                    boolean r2 = r2.isSealed(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                    r1 = this;
                    r0 = 1
                    return r0
            }
        }

        public enum Trivial extends java.lang.Enum<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial> implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial INSTANCE = null;

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final java.net.URL NOT_SEALED = null;

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final java.lang.String NO_VALUE = null;

            static {
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.INSTANCE = r0
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial[] r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial[]{r0}
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.$VALUES = r0
                    r0 = 0
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NO_VALUE = r0
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NOT_SEALED = r0
                    return
            }

            Trivial(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial> r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial r1 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial[] values() {
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial[] r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial[] r0 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getImplementationTitle() {
                    r1 = this;
                    java.lang.String r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NO_VALUE
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public java.lang.String getImplementationVendor() {
                    r1 = this;
                    java.lang.String r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NO_VALUE
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getImplementationVersion() {
                    r1 = this;
                    java.lang.String r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NO_VALUE
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.net.URL getSealBase() {
                    r1 = this;
                    java.net.URL r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NOT_SEALED
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getSpecificationTitle() {
                    r1 = this;
                    java.lang.String r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NO_VALUE
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getSpecificationVendor() {
                    r1 = this;
                    java.lang.String r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NO_VALUE
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getSpecificationVersion() {
                    r1 = this;
                    java.lang.String r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.NO_VALUE
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(java.lang.Package r1) {
                    r0 = this;
                    r1 = 1
                    return r1
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                    r1 = this;
                    r0 = 1
                    return r0
            }
        }

        public enum Undefined extends java.lang.Enum<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined> implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Undefined r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Undefined
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined.INSTANCE = r0
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Undefined[] r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined[]{r0}
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined.$VALUES = r0
                    return
            }

            Undefined(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Undefined> r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Undefined r1 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined[] values() {
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Undefined[] r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Undefined[] r0 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public java.lang.String getImplementationTitle() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot read property of undefined package"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public java.lang.String getImplementationVendor() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot read property of undefined package"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public java.lang.String getImplementationVersion() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot read property of undefined package"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public java.net.URL getSealBase() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot read property of undefined package"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public java.lang.String getSpecificationTitle() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot read property of undefined package"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public java.lang.String getSpecificationVendor() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot read property of undefined package"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public java.lang.String getSpecificationVersion() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot read property of undefined package"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(java.lang.Package r2) {
                    r1 = this;
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Cannot check compatibility to undefined package"
                    r2.<init>(r0)
                    throw r2
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.String getImplementationTitle();

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.String getImplementationVendor();

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.String getImplementationVersion();

        @net.bytebuddy.utility.nullability.MaybeNull
        java.net.URL getSealBase();

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.String getSpecificationTitle();

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.String getSpecificationVendor();

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.String getSpecificationVersion();

        boolean isCompatibleTo(java.lang.Package r1);

        boolean isDefined();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ManifestReading implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy {
        private static final java.util.jar.Attributes.Name[] ATTRIBUTE_NAMES = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final java.net.URL NOT_SEALED = null;
        private final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator sealBaseLocator;

        public interface SealBaseLocator {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForFixedValue implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator {

                @net.bytebuddy.utility.nullability.MaybeNull
                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final java.net.URL sealBase;

                public ForFixedValue(@net.bytebuddy.utility.nullability.MaybeNull java.net.URL r1) {
                        r0 = this;
                        r0.<init>()
                        r0.sealBase = r1
                        return
                }

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Package sealing relies on URL equality.", value = {"DMI_BLOCKING_METHODS_ON_URL"})
                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 == 0) goto L24
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L12
                        goto L24
                    L12:
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$ForFixedValue r5 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.ForFixedValue) r5
                        java.net.URL r2 = r4.sealBase
                        java.net.URL r5 = r5.sealBase
                        if (r2 != 0) goto L1f
                        if (r5 != 0) goto L1d
                        goto L23
                    L1d:
                        r0 = r1
                        goto L23
                    L1f:
                        boolean r0 = r2.equals(r5)
                    L23:
                        return r0
                    L24:
                        return r1
                }

                @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.net.URL findSealBase(java.lang.ClassLoader r1, java.lang.String r2) {
                        r0 = this;
                        java.net.URL r1 = r0.sealBase
                        return r1
                }

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Package sealing relies on URL equality.", value = {"DMI_BLOCKING_METHODS_ON_URL"})
                public int hashCode() {
                        r1 = this;
                        java.net.URL r0 = r1.sealBase
                        if (r0 != 0) goto L7
                        r0 = 17
                        goto Lb
                    L7:
                        int r0 = r0.hashCode()
                    Lb:
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForTypeResourceUrl implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator {
                private static final java.lang.String CLASS_FILE_EXTENSION = ".class";
                private static final int EXCLUDE_INITIAL_SLASH = 1;
                private static final java.lang.String FILE_SYSTEM = "file";
                private static final java.lang.String JAR_FILE = "jar";
                private static final java.lang.String RUNTIME_IMAGE = "jrt";
                private final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator fallback;

                public ForTypeResourceUrl() {
                        r1 = this;
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$NonSealing r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing.INSTANCE
                        r1.<init>(r0)
                        return
                }

                public ForTypeResourceUrl(net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator r1) {
                        r0 = this;
                        r0.<init>()
                        r0.fallback = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator r2 = r4.fallback
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$ForTypeResourceUrl r5 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.ForTypeResourceUrl) r5
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator r5 = r5.fallback
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.net.URL findSealBase(java.lang.ClassLoader r6, java.lang.String r7) {
                        r5 = this;
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r1 = 46
                        r2 = 47
                        java.lang.String r1 = r7.replace(r1, r2)
                        r0.append(r1)
                        java.lang.String r1 = ".class"
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        java.net.URL r0 = r6.getResource(r0)
                        if (r0 == 0) goto La4
                        java.lang.String r1 = r0.getProtocol()     // Catch: java.net.MalformedURLException -> L47
                        java.lang.String r3 = "jar"
                        boolean r1 = r1.equals(r3)     // Catch: java.net.MalformedURLException -> L47
                        r3 = 0
                        if (r1 == 0) goto L49
                        java.lang.String r6 = r0.getPath()     // Catch: java.net.MalformedURLException -> L47
                        java.lang.String r7 = r0.getPath()     // Catch: java.net.MalformedURLException -> L47
                        r1 = 33
                        int r7 = r7.indexOf(r1)     // Catch: java.net.MalformedURLException -> L47
                        java.lang.String r6 = r6.substring(r3, r7)     // Catch: java.net.MalformedURLException -> L47
                        java.net.URI r6 = java.net.URI.create(r6)     // Catch: java.net.MalformedURLException -> L47
                        java.net.URL r6 = r6.toURL()     // Catch: java.net.MalformedURLException -> L47
                        return r6
                    L47:
                        r6 = move-exception
                        goto L8d
                    L49:
                        java.lang.String r1 = r0.getProtocol()     // Catch: java.net.MalformedURLException -> L47
                        java.lang.String r4 = "file"
                        boolean r1 = r1.equals(r4)     // Catch: java.net.MalformedURLException -> L47
                        if (r1 == 0) goto L56
                        return r0
                    L56:
                        java.lang.String r1 = r0.getProtocol()     // Catch: java.net.MalformedURLException -> L47
                        java.lang.String r4 = "jrt"
                        boolean r1 = r1.equals(r4)     // Catch: java.net.MalformedURLException -> L47
                        if (r1 == 0) goto La4
                        java.lang.String r6 = r0.getPath()     // Catch: java.net.MalformedURLException -> L47
                        r7 = 1
                        int r7 = r6.indexOf(r2, r7)     // Catch: java.net.MalformedURLException -> L47
                        r1 = -1
                        if (r7 != r1) goto L6f
                        goto L8c
                    L6f:
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.net.MalformedURLException -> L47
                        r1.<init>()     // Catch: java.net.MalformedURLException -> L47
                        java.lang.String r2 = "jrt:"
                        r1.append(r2)     // Catch: java.net.MalformedURLException -> L47
                        java.lang.String r6 = r6.substring(r3, r7)     // Catch: java.net.MalformedURLException -> L47
                        r1.append(r6)     // Catch: java.net.MalformedURLException -> L47
                        java.lang.String r6 = r1.toString()     // Catch: java.net.MalformedURLException -> L47
                        java.net.URI r6 = java.net.URI.create(r6)     // Catch: java.net.MalformedURLException -> L47
                        java.net.URL r0 = r6.toURL()     // Catch: java.net.MalformedURLException -> L47
                    L8c:
                        return r0
                    L8d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Unexpected URL: "
                        r1.append(r2)
                        r1.append(r0)
                        java.lang.String r0 = r1.toString()
                        r7.<init>(r0, r6)
                        throw r7
                    La4:
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator r0 = r5.fallback
                        java.net.URL r6 = r0.findSealBase(r6, r7)
                        return r6
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator r1 = r2.fallback
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public enum NonSealing extends java.lang.Enum<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing> implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator {
                private static final /* synthetic */ net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing[] $VALUES = null;
                public static final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing INSTANCE = null;

                static {
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$NonSealing r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$NonSealing
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing.INSTANCE = r0
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$NonSealing[] r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing[]{r0}
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing.$VALUES = r0
                        return
                }

                NonSealing(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$NonSealing> r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$NonSealing r1 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing) r1
                        return r1
                }

                public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing[] values() {
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$NonSealing[] r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$NonSealing[] r0 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.NonSealing[]) r0
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.net.URL findSealBase(java.lang.ClassLoader r1, java.lang.String r2) {
                        r0 = this;
                        java.net.URL r1 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.access$000()
                        return r1
                }
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            java.net.URL findSealBase(java.lang.ClassLoader r1, java.lang.String r2);
        }

        static {
                java.util.jar.Attributes$Name r0 = java.util.jar.Attributes.Name.SPECIFICATION_TITLE
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.SPECIFICATION_VERSION
                java.util.jar.Attributes$Name r2 = java.util.jar.Attributes.Name.SPECIFICATION_VENDOR
                java.util.jar.Attributes$Name r3 = java.util.jar.Attributes.Name.IMPLEMENTATION_TITLE
                java.util.jar.Attributes$Name r4 = java.util.jar.Attributes.Name.IMPLEMENTATION_VERSION
                java.util.jar.Attributes$Name r5 = java.util.jar.Attributes.Name.IMPLEMENTATION_VENDOR
                java.util.jar.Attributes$Name r6 = java.util.jar.Attributes.Name.SEALED
                java.util.jar.Attributes$Name[] r0 = new java.util.jar.Attributes.Name[]{r0, r1, r2, r3, r4, r5, r6}
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.ATTRIBUTE_NAMES = r0
                return
        }

        public ManifestReading() {
                r1 = this;
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$ForTypeResourceUrl r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator$ForTypeResourceUrl
                r0.<init>()
                r1.<init>(r0)
                return
        }

        public ManifestReading(net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator r1) {
                r0 = this;
                r0.<init>()
                r0.sealBaseLocator = r1
                return
        }

        public static /* synthetic */ java.net.URL access$000() {
                java.net.URL r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.NOT_SEALED
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition define(java.lang.ClassLoader r11, java.lang.String r12, java.lang.String r13) {
                r10 = this;
                java.lang.String r0 = "META-INF/MANIFEST.MF"
                java.io.InputStream r0 = r11.getResourceAsStream(r0)
                if (r0 == 0) goto Lc1
                java.util.jar.Manifest r1 = new java.util.jar.Manifest     // Catch: java.lang.Throwable -> L2b
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b
                java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2b
                r2.<init>()     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes r3 = r1.getMainAttributes()     // Catch: java.lang.Throwable -> L2b
                r4 = 0
                if (r3 == 0) goto L2e
                java.util.jar.Attributes$Name[] r5 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.ATTRIBUTE_NAMES     // Catch: java.lang.Throwable -> L2b
                int r6 = r5.length     // Catch: java.lang.Throwable -> L2b
                r7 = r4
            L1d:
                if (r7 >= r6) goto L2e
                r8 = r5[r7]     // Catch: java.lang.Throwable -> L2b
                java.lang.String r9 = r3.getValue(r8)     // Catch: java.lang.Throwable -> L2b
                r2.put(r8, r9)     // Catch: java.lang.Throwable -> L2b
                int r7 = r7 + 1
                goto L1d
            L2b:
                r11 = move-exception
                goto Lb5
            L2e:
                r3 = 46
                r5 = 47
                java.lang.String r12 = r12.replace(r3, r5)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = "/"
                java.lang.String r12 = r12.concat(r3)     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes r12 = r1.getAttributes(r12)     // Catch: java.lang.Throwable -> L2b
                if (r12 == 0) goto L55
                java.util.jar.Attributes$Name[] r1 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.ATTRIBUTE_NAMES     // Catch: java.lang.Throwable -> L2b
                int r3 = r1.length     // Catch: java.lang.Throwable -> L2b
            L45:
                if (r4 >= r3) goto L55
                r5 = r1[r4]     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = r12.getValue(r5)     // Catch: java.lang.Throwable -> L2b
                if (r6 == 0) goto L52
                r2.put(r5, r6)     // Catch: java.lang.Throwable -> L2b
            L52:
                int r4 = r4 + 1
                goto L45
            L55:
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Simple r12 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Simple     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.SPECIFICATION_TITLE     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2b
                r3 = r1
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.SPECIFICATION_VERSION     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2b
                r4 = r1
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.SPECIFICATION_VENDOR     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2b
                r5 = r1
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.IMPLEMENTATION_TITLE     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2b
                r6 = r1
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.IMPLEMENTATION_VERSION     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2b
                r7 = r1
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.IMPLEMENTATION_VENDOR     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2b
                r8 = r1
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2b
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.SEALED     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2b
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.Throwable -> L2b
                if (r1 == 0) goto La2
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator r1 = r10.sealBaseLocator     // Catch: java.lang.Throwable -> L2b
                java.net.URL r11 = r1.findSealBase(r11, r13)     // Catch: java.lang.Throwable -> L2b
                goto La4
            La2:
                java.net.URL r11 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.NOT_SEALED     // Catch: java.lang.Throwable -> L2b
            La4:
                r1 = r12
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r11
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2b
                r0.close()     // Catch: java.io.IOException -> Lb3
                return r12
            Lb3:
                r11 = move-exception
                goto Lb9
            Lb5:
                r0.close()     // Catch: java.io.IOException -> Lb3
                throw r11     // Catch: java.io.IOException -> Lb3
            Lb9:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "Error while reading manifest file"
                r12.<init>(r13, r11)
                throw r12
            Lc1:
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial r11 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.INSTANCE
                return r11
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator r2 = r4.sealBaseLocator
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading r5 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading) r5
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator r5 = r5.sealBaseLocator
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$ManifestReading$SealBaseLocator r1 = r2.sealBaseLocator
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp> implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy {
        private static final /* synthetic */ net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp[] $VALUES = null;
        public static final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp INSTANCE = null;

        static {
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp.INSTANCE = r0
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp[] r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp[]{r0}
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp> r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp r1 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp) r1
                return r1
        }

        public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp[] values() {
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp[] r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp[] r0 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition define(java.lang.ClassLoader r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Undefined r1 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined.INSTANCE
                return r1
        }
    }

    public enum Trivial extends java.lang.Enum<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial> implements net.bytebuddy.dynamic.loading.PackageDefinitionStrategy {
        private static final /* synthetic */ net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial[] $VALUES = null;
        public static final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial INSTANCE = null;

        static {
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.INSTANCE = r0
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial[] r0 = new net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial[]{r0}
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.$VALUES = r0
                return
        }

        Trivial(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial> r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r1 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial) r1
                return r1
        }

        public static net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial[] values() {
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial[] r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial[] r0 = (net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition define(java.lang.ClassLoader r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition$Trivial r1 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Trivial.INSTANCE
                return r1
        }
    }

    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition define(java.lang.ClassLoader r1, java.lang.String r2, java.lang.String r3);
}

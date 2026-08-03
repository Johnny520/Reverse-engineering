package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public abstract class FieldAccessor implements net.bytebuddy.implementation.Implementation {
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
    protected final net.bytebuddy.implementation.FieldAccessor.FieldLocation fieldLocation;
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.FieldAccessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface AssignerConfigurable extends net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable {
        net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2);
    }

    public interface FieldLocation {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Absolute implements net.bytebuddy.implementation.FieldAccessor.FieldLocation, net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared {
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;

            public Absolute(net.bytebuddy.description.field.FieldDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
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
                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Absolute r5 = (net.bytebuddy.implementation.FieldAccessor.FieldLocation.Absolute) r5
                    net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
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
                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared prepare(net.bytebuddy.description.type.TypeDescription r4) {
                    r3 = this;
                    net.bytebuddy.description.field.FieldDescription r0 = r3.fieldDescription
                    boolean r0 = r0.isStatic()
                    if (r0 != 0) goto L35
                    net.bytebuddy.description.field.FieldDescription r0 = r3.fieldDescription
                    net.bytebuddy.description.type.TypeDefinition r0 = r0.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    boolean r0 = r4.isAssignableTo(r0)
                    if (r0 == 0) goto L19
                    goto L35
                L19:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    net.bytebuddy.description.field.FieldDescription r2 = r3.fieldDescription
                    r1.append(r2)
                    java.lang.String r2 = " is not declared by "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
                L35:
                    net.bytebuddy.description.field.FieldDescription r0 = r3.fieldDescription
                    boolean r0 = r0.isAccessibleTo(r4)
                    if (r0 == 0) goto L3e
                    return r3
                L3e:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Cannot access "
                    r1.append(r2)
                    net.bytebuddy.description.field.FieldDescription r2 = r3.fieldDescription
                    r1.append(r2)
                    java.lang.String r2 = " from "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared
            public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    net.bytebuddy.description.field.FieldDescription r1 = r0.fieldDescription
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation
            public net.bytebuddy.implementation.FieldAccessor.FieldLocation with(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2) {
                    r1 = this;
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Cannot specify a field locator factory for an absolute field location"
                    r2.<init>(r0)
                    throw r2
            }
        }

        public interface Prepared {
            net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.method.MethodDescription r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Relative implements net.bytebuddy.implementation.FieldAccessor.FieldLocation {
            private final net.bytebuddy.dynamic.scaffold.FieldLocator.Factory fieldLocatorFactory;
            private final java.util.List<? extends net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor> fieldNameExtractors;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Prepared implements net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared {
                private final net.bytebuddy.dynamic.scaffold.FieldLocator fieldLocator;
                private final java.util.List<? extends net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor> fieldNameExtractors;

                public Prepared(java.util.List<? extends net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor> r1, net.bytebuddy.dynamic.scaffold.FieldLocator r2) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldNameExtractors = r1
                        r0.fieldLocator = r2
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
                        java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r2 = r4.fieldNameExtractors
                        net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative$Prepared r5 = (net.bytebuddy.implementation.FieldAccessor.FieldLocation.Relative.Prepared) r5
                        java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r3 = r5.fieldNameExtractors
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.dynamic.scaffold.FieldLocator r2 = r4.fieldLocator
                        net.bytebuddy.dynamic.scaffold.FieldLocator r5 = r5.fieldLocator
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r1 = r2.fieldNameExtractors
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.FieldLocator r1 = r2.fieldLocator
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared
                public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.method.MethodDescription r4) {
                        r3 = this;
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.INSTANCE
                        java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r1 = r3.fieldNameExtractors
                        java.util.Iterator r1 = r1.iterator()
                    L8:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L25
                        boolean r2 = r0.isResolved()
                        if (r2 != 0) goto L25
                        net.bytebuddy.dynamic.scaffold.FieldLocator r0 = r3.fieldLocator
                        java.lang.Object r2 = r1.next()
                        net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor r2 = (net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor) r2
                        java.lang.String r2 = r2.resolve(r4)
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r0 = r0.locate(r2)
                        goto L8
                    L25:
                        boolean r1 = r0.isResolved()
                        if (r1 == 0) goto L30
                        net.bytebuddy.description.field.FieldDescription r4 = r0.getField()
                        return r4
                    L30:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot resolve field for "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = " using "
                        r1.append(r4)
                        net.bytebuddy.dynamic.scaffold.FieldLocator r4 = r3.fieldLocator
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            public Relative(java.util.List<? extends net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor> r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE
                    r1.<init>(r2, r0)
                    return
            }

            private Relative(java.util.List<? extends net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor> r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldNameExtractors = r1
                    r0.fieldLocatorFactory = r2
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
                    java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r2 = r4.fieldNameExtractors
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative r5 = (net.bytebuddy.implementation.FieldAccessor.FieldLocation.Relative) r5
                    java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r3 = r5.fieldNameExtractors
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r2 = r4.fieldLocatorFactory
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r5 = r5.fieldLocatorFactory
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r1 = r2.fieldNameExtractors
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r1 = r2.fieldLocatorFactory
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation
            public net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared prepare(net.bytebuddy.description.type.TypeDescription r4) {
                    r3 = this;
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative$Prepared r0 = new net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative$Prepared
                    java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r1 = r3.fieldNameExtractors
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r2 = r3.fieldLocatorFactory
                    net.bytebuddy.dynamic.scaffold.FieldLocator r4 = r2.make(r4)
                    r0.<init>(r1, r4)
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation
            public net.bytebuddy.implementation.FieldAccessor.FieldLocation with(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r3) {
                    r2 = this;
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative r0 = new net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative
                    java.util.List<? extends net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor> r1 = r2.fieldNameExtractors
                    r0.<init>(r1, r3)
                    return r0
            }
        }

        net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared prepare(net.bytebuddy.description.type.TypeDescription r1);

        net.bytebuddy.implementation.FieldAccessor.FieldLocation with(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r1);
    }

    public interface FieldNameExtractor {

        public enum ForBeanProperty extends java.lang.Enum<net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty> implements net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor {
            private static final /* synthetic */ net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty[] $VALUES = null;
            public static final net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty CAPITALIZED = null;
            public static final net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty INSTANCE = null;



            static {
                    net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty$1 r0 = new net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty$1
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.INSTANCE = r0
                    net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty$2 r1 = new net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty$2
                    java.lang.String r3 = "CAPITALIZED"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.CAPITALIZED = r1
                    r3 = 2
                    net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty[] r3 = new net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty[r3]
                    r3[r2] = r0
                    r3[r4] = r1
                    net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.$VALUES = r3
                    return
            }

            ForBeanProperty(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ ForBeanProperty(java.lang.String r1, int r2, net.bytebuddy.implementation.FieldAccessor.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty> r0 = net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty r1 = (net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty) r1
                    return r1
            }

            public static net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty[] values() {
                    net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty[] r0 = net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty[] r0 = (net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty[]) r0
                    return r0
            }

            public abstract char resolve(char r1);

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor
            public java.lang.String resolve(net.bytebuddy.description.method.MethodDescription r3) {
                    r2 = this;
                    java.lang.String r0 = r3.getInternalName()
                    java.lang.String r1 = "get"
                    boolean r1 = r0.startsWith(r1)
                    if (r1 != 0) goto L36
                    java.lang.String r1 = "set"
                    boolean r1 = r0.startsWith(r1)
                    if (r1 == 0) goto L15
                    goto L36
                L15:
                    java.lang.String r1 = "is"
                    boolean r1 = r0.startsWith(r1)
                    if (r1 == 0) goto L1f
                    r1 = 2
                    goto L37
                L1f:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r3)
                    java.lang.String r3 = " does not follow Java bean naming conventions"
                    r1.append(r3)
                    java.lang.String r3 = r1.toString()
                    r0.<init>(r3)
                    throw r0
                L36:
                    r1 = 3
                L37:
                    java.lang.String r0 = r0.substring(r1)
                    int r1 = r0.length()
                    if (r1 == 0) goto L5f
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    r1 = 0
                    char r1 = r0.charAt(r1)
                    char r1 = r2.resolve(r1)
                    r3.append(r1)
                    r1 = 1
                    java.lang.String r0 = r0.substring(r1)
                    r3.append(r0)
                    java.lang.String r3 = r3.toString()
                    return r3
                L5f:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r3)
                    java.lang.String r3 = " does not specify a bean name"
                    r1.append(r3)
                    java.lang.String r3 = r1.toString()
                    r0.<init>(r3)
                    throw r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForFixedValue implements net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor {
            private final java.lang.String name;

            public ForFixedValue(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.name = r1
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
                    java.lang.String r2 = r4.name
                    net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForFixedValue r5 = (net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForFixedValue) r5
                    java.lang.String r5 = r5.name
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
                    java.lang.String r1 = r2.name
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor
            public java.lang.String resolve(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    java.lang.String r1 = r0.name
                    return r1
            }
        }

        java.lang.String resolve(net.bytebuddy.description.method.MethodDescription r1);
    }

    public static class ForImplicitProperty extends net.bytebuddy.implementation.FieldAccessor implements net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared fieldLocation;
            final /* synthetic */ net.bytebuddy.implementation.FieldAccessor.ForImplicitProperty this$0;

            public Appender(net.bytebuddy.implementation.FieldAccessor.ForImplicitProperty r1, net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.fieldLocation = r2
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r16, net.bytebuddy.implementation.Implementation.Context r17, net.bytebuddy.description.method.MethodDescription r18) {
                    r15 = this;
                    r0 = r15
                    r1 = r18
                    r2 = 3
                    r3 = 2
                    r4 = 4
                    r5 = 1
                    r6 = 0
                    boolean r7 = r18.isMethod()
                    if (r7 == 0) goto L16b
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r7 = r0.fieldLocation
                    net.bytebuddy.description.field.FieldDescription r7 = r7.resolve(r1)
                    boolean r8 = r7.isStatic()
                    java.lang.String r9 = " from "
                    if (r8 != 0) goto L40
                    boolean r8 = r18.isStatic()
                    if (r8 != 0) goto L23
                    goto L40
                L23:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "Cannot set instance field "
                    r3.append(r4)
                    r3.append(r7)
                    r3.append(r9)
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    r2.<init>(r1)
                    throw r2
                L40:
                    boolean r8 = r7.isStatic()
                    if (r8 == 0) goto L49
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r8 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    goto L4d
                L49:
                    net.bytebuddy.implementation.bytecode.StackManipulation r8 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                L4d:
                    net.bytebuddy.description.type.TypeDescription$Generic r10 = r18.getReturnType()
                    java.lang.Class r11 = java.lang.Void.TYPE
                    boolean r10 = r10.represents(r11)
                    if (r10 != 0) goto L8e
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r9 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r10 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r7)
                    net.bytebuddy.implementation.bytecode.StackManipulation r10 = r10.read()
                    net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r11 = r0.this$0
                    net.bytebuddy.implementation.bytecode.assign.Assigner r11 = r11.assigner
                    net.bytebuddy.description.type.TypeDescription$Generic r12 = r7.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r13 = r18.getReturnType()
                    net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r14 = r0.this$0
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r14 = r14.typing
                    net.bytebuddy.implementation.bytecode.StackManipulation r11 = r11.assign(r12, r13, r14)
                    net.bytebuddy.description.type.TypeDescription$Generic r12 = r18.getReturnType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r12 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r12)
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                    r4[r6] = r8
                    r4[r5] = r10
                    r4[r3] = r11
                    r4[r2] = r12
                    r9.<init>(r4)
                    goto L114
                L8e:
                    net.bytebuddy.description.type.TypeDescription$Generic r10 = r18.getReturnType()
                    boolean r10 = r10.represents(r11)
                    if (r10 == 0) goto L14f
                    net.bytebuddy.description.method.ParameterList r10 = r18.getParameters()
                    int r10 = r10.size()
                    if (r10 != r5) goto L14f
                    boolean r10 = r7.isFinal()
                    if (r10 == 0) goto Lcc
                    boolean r10 = r18.isMethod()
                    if (r10 != 0) goto Laf
                    goto Lcc
                Laf:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "Cannot set final field "
                    r3.append(r4)
                    r3.append(r7)
                    r3.append(r9)
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    r2.<init>(r1)
                    throw r2
                Lcc:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r9 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.method.ParameterList r10 = r18.getParameters()
                    java.lang.Object r10 = r10.get(r6)
                    net.bytebuddy.description.method.ParameterDescription r10 = (net.bytebuddy.description.method.ParameterDescription) r10
                    net.bytebuddy.implementation.bytecode.StackManipulation r10 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r10)
                    net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r11 = r0.this$0
                    net.bytebuddy.implementation.bytecode.assign.Assigner r11 = r11.assigner
                    net.bytebuddy.description.method.ParameterList r12 = r18.getParameters()
                    java.lang.Object r12 = r12.get(r6)
                    net.bytebuddy.description.method.ParameterDescription r12 = (net.bytebuddy.description.method.ParameterDescription) r12
                    net.bytebuddy.description.type.TypeDescription$Generic r12 = r12.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r13 = r7.getType()
                    net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r14 = r0.this$0
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r14 = r14.typing
                    net.bytebuddy.implementation.bytecode.StackManipulation r11 = r11.assign(r12, r13, r14)
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r12 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r7)
                    net.bytebuddy.implementation.bytecode.StackManipulation r12 = r12.write()
                    r13 = 5
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r13 = new net.bytebuddy.implementation.bytecode.StackManipulation[r13]
                    r13[r6] = r8
                    r13[r5] = r10
                    r13[r3] = r11
                    r13[r2] = r12
                    net.bytebuddy.implementation.bytecode.member.MethodReturn r2 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                    r13[r4] = r2
                    r9.<init>(r13)
                L114:
                    boolean r2 = r9.isValid()
                    if (r2 == 0) goto L130
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    r3 = r16
                    r4 = r17
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r9.apply(r3, r4)
                    int r3 = r3.getMaximalSize()
                    int r1 = r18.getStackSize()
                    r2.<init>(r3, r1)
                    return r2
                L130:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "Cannot set or get value of "
                    r3.append(r4)
                    r3.append(r1)
                    java.lang.String r1 = " using "
                    r3.append(r1)
                    r3.append(r7)
                    java.lang.String r1 = r3.toString()
                    r2.<init>(r1)
                    throw r2
                L14f:
                    java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "Method "
                    r3.append(r4)
                    r3.append(r1)
                    java.lang.String r1 = " is no bean accessor"
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    r2.<init>(r1)
                    throw r2
                L16b:
                    java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    r3.append(r1)
                    java.lang.String r1 = " does not describe a field getter or setter"
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    r2.<init>(r1)
                    throw r2
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
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r2 = r4.fieldLocation
                    net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty$Appender r5 = (net.bytebuddy.implementation.FieldAccessor.ForImplicitProperty.Appender) r5
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r3 = r5.fieldLocation
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r2 = r4.this$0
                    net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r5 = r5.this$0
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r1 = r2.fieldLocation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r1 = r2.this$0
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public ForImplicitProperty(net.bytebuddy.implementation.FieldAccessor.FieldLocation r3) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                r2.<init>(r3, r0, r1)
                return
        }

        private ForImplicitProperty(net.bytebuddy.implementation.FieldAccessor.FieldLocation r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
                r2 = this;
                net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty$Appender r0 = new net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty$Appender
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r2.fieldLocation
                net.bytebuddy.description.type.TypeDescription r3 = r3.getInstrumentedType()
                net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r3 = r1.prepare(r3)
                r0.<init>(r2, r3)
                return r0
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        public net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable in(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.implementation.FieldAccessor$AssignerConfigurable r1 = r0.in(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        public net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable in(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType$Factory r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType$Factory
                r0.<init>(r2)
                net.bytebuddy.implementation.FieldAccessor$AssignerConfigurable r2 = r1.in(r0)
                return r2
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        public net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable in(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r4) {
                r3 = this;
                net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r0 = new net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r3.fieldLocation
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r4 = r1.with(r4)
                net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r3.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r3.typing
                r0.<init>(r4, r1, r2)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsArgumentAt(int r8) {
                r7 = this;
                if (r8 < 0) goto L12
                net.bytebuddy.implementation.FieldAccessor$ForSetter$OfParameterValue r6 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfParameterValue
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r7.fieldLocation
                net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r7.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r7.typing
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r4 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.RETURNING
                r0 = r6
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "A parameter index cannot be negative: "
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsDefaultValue() {
                r5 = this;
                net.bytebuddy.implementation.FieldAccessor$ForSetter$OfDefaultValue r0 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfDefaultValue
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r5.fieldLocation
                net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r5.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r4 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.RETURNING
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsFieldValueOf(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForFixedValue r0 = new net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForFixedValue
                r0.<init>(r2)
                net.bytebuddy.implementation.Implementation$Composable r2 = r1.setsFieldValueOf(r0)
                return r2
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsFieldValueOf(java.lang.reflect.Field r2) {
                r1 = this;
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r2)
                net.bytebuddy.implementation.Implementation$Composable r2 = r1.setsFieldValueOf(r0)
                return r2
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsFieldValueOf(net.bytebuddy.description.field.FieldDescription r8) {
                r7 = this;
                net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue r6 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r7.fieldLocation
                net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r7.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r7.typing
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r4 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.RETURNING
                net.bytebuddy.implementation.FieldAccessor$FieldLocation$Absolute r5 = new net.bytebuddy.implementation.FieldAccessor$FieldLocation$Absolute
                r5.<init>(r8)
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsFieldValueOf(net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor r8) {
                r7 = this;
                net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue r6 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r7.fieldLocation
                net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r7.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r7.typing
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r4 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.RETURNING
                net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative r5 = new net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative
                java.util.List r8 = java.util.Collections.singletonList(r8)
                r5.<init>(r8)
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsReference(java.lang.Object r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "fixedFieldValue$"
                r0.append(r1)
                java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r3)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                net.bytebuddy.implementation.Implementation$Composable r3 = r2.setsReference(r3, r0)
                return r3
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsReference(java.lang.Object r9, java.lang.String r10) {
                r8 = this;
                net.bytebuddy.implementation.FieldAccessor$ForSetter$OfReferenceValue r7 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfReferenceValue
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r8.fieldLocation
                net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r8.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r8.typing
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r4 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.RETURNING
                r0 = r7
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsValue(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                r1 = this;
                if (r2 != 0) goto L7
                net.bytebuddy.implementation.Implementation$Composable r2 = r1.setsDefaultValue()
                return r2
            L7:
                net.bytebuddy.utility.ConstantValue r0 = net.bytebuddy.utility.ConstantValue.Simple.wrapOrNull(r2)
                if (r0 != 0) goto L12
                net.bytebuddy.implementation.Implementation$Composable r2 = r1.setsReference(r2)
                goto L22
            L12:
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r0.toStackManipulation()
                net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeDescription()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                net.bytebuddy.implementation.Implementation$Composable r2 = r1.setsValue(r2, r0)
            L22:
                return r2
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r2)
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                net.bytebuddy.implementation.Implementation$Composable r2 = r1.setsValue(r2, r0)
                return r2
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.reflect.Type r2) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                net.bytebuddy.implementation.Implementation$Composable r1 = r0.setsValue(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.implementation.bytecode.StackManipulation r9, net.bytebuddy.description.type.TypeDescription.Generic r10) {
                r8 = this;
                net.bytebuddy.implementation.FieldAccessor$ForSetter$OfConstantValue r7 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfConstantValue
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r8.fieldLocation
                net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r8.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r8.typing
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r4 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.RETURNING
                r0 = r7
                r5 = r10
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.utility.ConstantValue r2) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.toStackManipulation()
                net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeDescription()
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                net.bytebuddy.implementation.Implementation$Composable r2 = r1.setsValue(r0, r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.utility.JavaConstant r1) {
                r0 = this;
                net.bytebuddy.implementation.Implementation$Composable r1 = r0.setsValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable
        public net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                r2 = this;
                net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r0 = new net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r2.fieldLocation
                r0.<init>(r1, r3, r4)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static abstract class ForSetter<T> extends net.bytebuddy.implementation.FieldAccessor implements net.bytebuddy.implementation.Implementation.Composable {
        private final net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler terminationHandler;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared fieldLocation;

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final T initialized;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            final /* synthetic */ net.bytebuddy.implementation.FieldAccessor.ForSetter this$0;

            public Appender(net.bytebuddy.implementation.FieldAccessor.ForSetter r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r2, T r3, net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared r4) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.instrumentedType = r2
                    r0.initialized = r3
                    r0.fieldLocation = r4
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10, net.bytebuddy.description.method.MethodDescription r11) {
                    r8 = this;
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r0 = r8.fieldLocation
                    net.bytebuddy.description.field.FieldDescription r0 = r0.resolve(r11)
                    boolean r1 = r0.isStatic()
                    java.lang.String r2 = " from "
                    if (r1 != 0) goto L32
                    boolean r1 = r11.isStatic()
                    if (r1 != 0) goto L15
                    goto L32
                L15:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r1 = "Cannot set instance field "
                    r10.append(r1)
                    r10.append(r0)
                    r10.append(r2)
                    r10.append(r11)
                    java.lang.String r10 = r10.toString()
                    r9.<init>(r10)
                    throw r9
                L32:
                    boolean r1 = r0.isFinal()
                    if (r1 == 0) goto L5c
                    boolean r1 = r11.isMethod()
                    if (r1 != 0) goto L3f
                    goto L5c
                L3f:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r1 = "Cannot set final field "
                    r10.append(r1)
                    r10.append(r0)
                    r10.append(r2)
                    r10.append(r11)
                    java.lang.String r10 = r10.toString()
                    r9.<init>(r10)
                    throw r9
                L5c:
                    net.bytebuddy.implementation.FieldAccessor$ForSetter r1 = r8.this$0
                    T r2 = r8.initialized
                    net.bytebuddy.description.type.TypeDescription r3 = r8.instrumentedType
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.resolve(r2, r0, r3, r11)
                    boolean r2 = r1.isValid()
                    if (r2 == 0) goto Lb1
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    boolean r4 = r11.isStatic()
                    if (r4 == 0) goto L79
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r4 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    goto L7d
                L79:
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                L7d:
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r0)
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.write()
                    net.bytebuddy.implementation.FieldAccessor$ForSetter r5 = r8.this$0
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.access$200(r5)
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.resolve(r11)
                    r6 = 4
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                    r7 = 0
                    r6[r7] = r4
                    r4 = 1
                    r6[r4] = r1
                    r1 = 2
                    r6[r1] = r0
                    r0 = 3
                    r6[r0] = r5
                    r3.<init>(r6)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r9 = r3.apply(r9, r10)
                    int r9 = r9.getMaximalSize()
                    int r10 = r11.getStackSize()
                    r2.<init>(r9, r10)
                    return r2
                Lb1:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r11 = "Set value cannot be assigned to "
                    r10.append(r11)
                    r10.append(r0)
                    java.lang.String r10 = r10.toString()
                    r9.<init>(r10)
                    throw r9
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$Appender r5 = (net.bytebuddy.implementation.FieldAccessor.ForSetter.Appender) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    T r2 = r4.initialized
                    T r3 = r5.initialized
                    if (r3 == 0) goto L2f
                    if (r2 == 0) goto L31
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L32
                    return r1
                L2f:
                    if (r2 == 0) goto L32
                L31:
                    return r1
                L32:
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r2 = r4.fieldLocation
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r3 = r5.fieldLocation
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3d
                    return r1
                L3d:
                    net.bytebuddy.implementation.FieldAccessor$ForSetter r2 = r4.this$0
                    net.bytebuddy.implementation.FieldAccessor$ForSetter r5 = r5.this$0
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L48
                    return r1
                L48:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    T r1 = r2.initialized
                    if (r1 == 0) goto L1c
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                L1c:
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r1 = r2.fieldLocation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.FieldAccessor$ForSetter r1 = r2.this$0
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OfConstantValue extends net.bytebuddy.implementation.FieldAccessor.ForSetter<java.lang.Void> {
            private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
            private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

            public OfConstantValue(net.bytebuddy.implementation.FieldAccessor.FieldLocation r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.implementation.bytecode.StackManipulation r6) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    r0.typeDescription = r5
                    r0.stackManipulation = r6
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r10) {
                    r9 = this;
                    net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfConstantValue r8 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfConstantValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r9.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r9.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r9.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    net.bytebuddy.description.type.TypeDescription$Generic r6 = r9.typeDescription
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = r9.stackManipulation
                    r1 = r8
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    r0.<init>(r8, r10)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r10) {
                    r9 = this;
                    net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfConstantValue r8 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfConstantValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r9.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r9.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r9.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    net.bytebuddy.description.type.TypeDescription$Generic r6 = r9.typeDescription
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = r9.stackManipulation
                    r1 = r8
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    r1 = 2
                    net.bytebuddy.implementation.Implementation[] r1 = new net.bytebuddy.implementation.Implementation[r1]
                    r2 = 0
                    r1[r2] = r8
                    r2 = 1
                    r1[r2] = r10
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    boolean r0 = super.equals(r5)
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    r0 = 1
                    if (r4 != r5) goto Lc
                    return r0
                Lc:
                    if (r5 != 0) goto Lf
                    return r1
                Lf:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L1a
                    return r1
                L1a:
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfConstantValue r5 = (net.bytebuddy.implementation.FieldAccessor.ForSetter.OfConstantValue) r5
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.typeDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    return r1
                L27:
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.stackManipulation
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L32
                    return r1
                L32:
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.AlwaysNull
            public /* bridge */ /* synthetic */ java.lang.Void initialize(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    java.lang.Void r1 = r0.initialize2(r1)
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.AlwaysNull
            /* JADX INFO: renamed from: initialize, reason: avoid collision after fix types in other method */
            public java.lang.Void initialize2(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r1 = 0
                    return r1
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public /* bridge */ /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation resolve(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Void r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                    r0 = this;
                    java.lang.Void r1 = (java.lang.Void) r1
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.resolve2(r1, r2, r3, r4)
                    return r1
            }

            /* JADX INFO: renamed from: resolve, reason: avoid collision after fix types in other method */
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve2(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Void r3, net.bytebuddy.description.field.FieldDescription r4, net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.method.MethodDescription r6) {
                    r2 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r2.stackManipulation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r2.assigner
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.typeDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r6.assign(r0, r4, r1)
                    r6 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                    r0 = 0
                    r6[r0] = r5
                    r5 = 1
                    r6[r5] = r4
                    r3.<init>(r6)
                    return r3
            }
        }

        public static class OfDefaultValue extends net.bytebuddy.implementation.FieldAccessor.ForSetter<java.lang.Void> {
            public OfDefaultValue(net.bytebuddy.implementation.FieldAccessor.FieldLocation r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler r4) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r7) {
                    r6 = this;
                    net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfDefaultValue r1 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfDefaultValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r6.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r6.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r6.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    r1.<init>(r2, r3, r4, r5)
                    r0.<init>(r1, r7)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r7) {
                    r6 = this;
                    net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfDefaultValue r1 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfDefaultValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r6.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r6.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r6.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    r1.<init>(r2, r3, r4, r5)
                    r2 = 2
                    net.bytebuddy.implementation.Implementation[] r2 = new net.bytebuddy.implementation.Implementation[r2]
                    r3 = 0
                    r2[r3] = r1
                    r1 = 1
                    r2[r1] = r7
                    r0.<init>(r2)
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.AlwaysNull
            public /* bridge */ /* synthetic */ java.lang.Void initialize(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    java.lang.Void r1 = r0.initialize2(r1)
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.AlwaysNull
            /* JADX INFO: renamed from: initialize, reason: avoid collision after fix types in other method */
            public java.lang.Void initialize2(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r1 = 0
                    return r1
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public /* bridge */ /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation resolve(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Void r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                    r0 = this;
                    java.lang.Void r1 = (java.lang.Void) r1
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.resolve2(r1, r2, r3, r4)
                    return r1
            }

            /* JADX INFO: renamed from: resolve, reason: avoid collision after fix types in other method */
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve2(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Void r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r1)
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OfFieldValue extends net.bytebuddy.implementation.FieldAccessor.ForSetter<net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared> {
            private final net.bytebuddy.implementation.FieldAccessor.FieldLocation target;

            public OfFieldValue(net.bytebuddy.implementation.FieldAccessor.FieldLocation r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler r4, net.bytebuddy.implementation.FieldAccessor.FieldLocation r5) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    r0.target = r5
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r9) {
                    r8 = this;
                    net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue r7 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r8.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r8.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r6 = r8.target
                    r1 = r7
                    r1.<init>(r2, r3, r4, r5, r6)
                    r0.<init>(r7, r9)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r9) {
                    r8 = this;
                    net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue r7 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r8.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r8.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r6 = r8.target
                    r1 = r7
                    r1.<init>(r2, r3, r4, r5, r6)
                    r1 = 2
                    net.bytebuddy.implementation.Implementation[] r1 = new net.bytebuddy.implementation.Implementation[r1]
                    r2 = 0
                    r1[r2] = r7
                    r2 = 1
                    r1[r2] = r9
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    boolean r0 = super.equals(r5)
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    r0 = 1
                    if (r4 != r5) goto Lc
                    return r0
                Lc:
                    if (r5 != 0) goto Lf
                    return r1
                Lf:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L1a
                    return r1
                L1a:
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r4.target
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfFieldValue r5 = (net.bytebuddy.implementation.FieldAccessor.ForSetter.OfFieldValue) r5
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r5 = r5.target
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r2.target
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public /* bridge */ /* synthetic */ net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared initialize(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r1 = r0.initialize2(r1)
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            /* JADX INFO: renamed from: initialize, reason: avoid collision after fix types in other method */
            public net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared initialize2(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r0 = r1.target
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r2 = r0.prepare(r2)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Expects its own initialized value as argument", value = {"NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE"})
            public /* bridge */ /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation resolve(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                    r0 = this;
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r1 = (net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared) r1
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.resolve2(r1, r2, r3, r4)
                    return r1
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Expects its own initialized value as argument", value = {"NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE"})
            /* JADX INFO: renamed from: resolve, reason: avoid collision after fix types in other method */
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared r4, net.bytebuddy.description.field.FieldDescription r5, net.bytebuddy.description.type.TypeDescription r6, net.bytebuddy.description.method.MethodDescription r7) {
                    r3 = this;
                    net.bytebuddy.description.field.FieldDescription r4 = r4.resolve(r7)
                    boolean r6 = r4.isStatic()
                    if (r6 != 0) goto L30
                    boolean r6 = r7.isStatic()
                    if (r6 != 0) goto L11
                    goto L30
                L11:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r0 = "Cannot set instance field "
                    r6.append(r0)
                    r6.append(r5)
                    java.lang.String r5 = " from "
                    r6.append(r5)
                    r6.append(r7)
                    java.lang.String r5 = r6.toString()
                    r4.<init>(r5)
                    throw r4
                L30:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r6 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    boolean r7 = r4.isStatic()
                    if (r7 == 0) goto L3b
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r7 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    goto L3f
                L3b:
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                L3f:
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.read()
                    net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r3.assigner
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getType()
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r3.typing
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r1.assign(r4, r5, r2)
                    r5 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                    r1 = 0
                    r5[r1] = r7
                    r7 = 1
                    r5[r7] = r0
                    r7 = 2
                    r5[r7] = r4
                    r6.<init>(r5)
                    return r6
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OfParameterValue extends net.bytebuddy.implementation.FieldAccessor.ForSetter<java.lang.Void> {
            private final int index;

            public OfParameterValue(net.bytebuddy.implementation.FieldAccessor.FieldLocation r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler r4, int r5) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    r0.index = r5
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r9) {
                    r8 = this;
                    net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfParameterValue r7 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfParameterValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r8.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r8.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    int r6 = r8.index
                    r1 = r7
                    r1.<init>(r2, r3, r4, r5, r6)
                    r0.<init>(r7, r9)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r9) {
                    r8 = this;
                    net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfParameterValue r7 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfParameterValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r8.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r8.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    int r6 = r8.index
                    r1 = r7
                    r1.<init>(r2, r3, r4, r5, r6)
                    r1 = 2
                    net.bytebuddy.implementation.Implementation[] r1 = new net.bytebuddy.implementation.Implementation[r1]
                    r2 = 0
                    r1[r2] = r7
                    r2 = 1
                    r1[r2] = r9
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    boolean r0 = super.equals(r5)
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    r0 = 1
                    if (r4 != r5) goto Lc
                    return r0
                Lc:
                    if (r5 != 0) goto Lf
                    return r1
                Lf:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L1a
                    return r1
                L1a:
                    int r2 = r4.index
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfParameterValue r5 = (net.bytebuddy.implementation.FieldAccessor.ForSetter.OfParameterValue) r5
                    int r5 = r5.index
                    if (r2 == r5) goto L23
                    return r1
                L23:
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    int r1 = r2.index
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.AlwaysNull
            public /* bridge */ /* synthetic */ java.lang.Void initialize(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    java.lang.Void r1 = r0.initialize2(r1)
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @net.bytebuddy.utility.nullability.AlwaysNull
            /* JADX INFO: renamed from: initialize, reason: avoid collision after fix types in other method */
            public java.lang.Void initialize2(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r1 = 0
                    return r1
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public /* bridge */ /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation resolve(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Void r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                    r0 = this;
                    java.lang.Void r1 = (java.lang.Void) r1
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.resolve2(r1, r2, r3, r4)
                    return r1
            }

            /* JADX INFO: renamed from: resolve, reason: avoid collision after fix types in other method */
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve2(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Void r3, net.bytebuddy.description.field.FieldDescription r4, net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.method.MethodDescription r6) {
                    r2 = this;
                    net.bytebuddy.description.method.ParameterList r3 = r6.getParameters()
                    int r3 = r3.size()
                    int r5 = r2.index
                    if (r3 <= r5) goto L47
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.method.ParameterList r5 = r6.getParameters()
                    int r0 = r2.index
                    java.lang.Object r5 = r5.get(r0)
                    net.bytebuddy.description.method.ParameterDescription r5 = (net.bytebuddy.description.method.ParameterDescription) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r5)
                    net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r2.assigner
                    net.bytebuddy.description.method.ParameterList r6 = r6.getParameters()
                    int r1 = r2.index
                    java.lang.Object r6 = r6.get(r1)
                    net.bytebuddy.description.method.ParameterDescription r6 = (net.bytebuddy.description.method.ParameterDescription) r6
                    net.bytebuddy.description.type.TypeDescription$Generic r6 = r6.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r0.assign(r6, r4, r1)
                    r6 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                    r0 = 0
                    r6[r0] = r5
                    r5 = 1
                    r6[r5] = r4
                    r3.<init>(r6)
                    return r3
                L47:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r6)
                    java.lang.String r5 = " does not define a parameter with index "
                    r4.append(r5)
                    int r5 = r2.index
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    r3.<init>(r4)
                    throw r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OfReferenceValue extends net.bytebuddy.implementation.FieldAccessor.ForSetter<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
            protected static final java.lang.String PREFIX = "fixedFieldValue";
            private final java.lang.String name;
            private final java.lang.Object value;

            public OfReferenceValue(net.bytebuddy.implementation.FieldAccessor.FieldLocation r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler r4, java.lang.Object r5, java.lang.String r6) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    r0.value = r5
                    r0.name = r6
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r10) {
                    r9 = this;
                    net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfReferenceValue r8 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfReferenceValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r9.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r9.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r9.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    java.lang.Object r6 = r9.value
                    java.lang.String r7 = r9.name
                    r1 = r8
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    r0.<init>(r8, r10)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r10) {
                    r9 = this;
                    net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfReferenceValue r8 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$OfReferenceValue
                    net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r9.fieldLocation
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r9.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r9.typing
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL
                    java.lang.Object r6 = r9.value
                    java.lang.String r7 = r9.name
                    r1 = r8
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    r1 = 2
                    net.bytebuddy.implementation.Implementation[] r1 = new net.bytebuddy.implementation.Implementation[r1]
                    r2 = 0
                    r1[r2] = r8
                    r2 = 1
                    r1[r2] = r10
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    boolean r0 = super.equals(r5)
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    r0 = 1
                    if (r4 != r5) goto Lc
                    return r0
                Lc:
                    if (r5 != 0) goto Lf
                    return r1
                Lf:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L1a
                    return r1
                L1a:
                    java.lang.String r2 = r4.name
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$OfReferenceValue r5 = (net.bytebuddy.implementation.FieldAccessor.ForSetter.OfReferenceValue) r5
                    java.lang.String r3 = r5.name
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    return r1
                L27:
                    java.lang.Object r2 = r4.value
                    java.lang.Object r5 = r5.value
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L32
                    return r1
                L32:
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    java.lang.Object r1 = r2.value
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.name
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public /* bridge */ /* synthetic */ net.bytebuddy.description.field.FieldDescription.InDefinedShape initialize(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = r0.initialize2(r1)
                    return r1
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            /* JADX INFO: renamed from: initialize, reason: avoid collision after fix types in other method */
            public net.bytebuddy.description.field.FieldDescription.InDefinedShape initialize2(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.description.field.FieldList r2 = r2.getDeclaredFields()
                    java.lang.String r0 = r1.name
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.named(r0)
                    net.bytebuddy.matcher.FilterableList r2 = r2.filter(r0)
                    net.bytebuddy.description.field.FieldList r2 = (net.bytebuddy.description.field.FieldList) r2
                    java.lang.Object r2 = r2.getOnly()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                    return r2
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                    r4 = this;
                    net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                    java.lang.String r1 = r4.name
                    java.lang.Object r2 = r4.value
                    java.lang.Class r2 = r2.getClass()
                    net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                    r3 = 4105(0x1009, float:5.752E-42)
                    r0.<init>(r1, r3, r2)
                    java.lang.Object r1 = r4.value
                    net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withAuxiliaryField(r0, r1)
                    return r5
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Expects its own initialized value as argument", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public /* bridge */ /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation resolve(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.field.FieldDescription.InDefinedShape r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                    r0 = this;
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.resolve2(r1, r2, r3, r4)
                    return r1
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Expects its own initialized value as argument", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            /* JADX INFO: renamed from: resolve, reason: avoid collision after fix types in other method */
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.field.FieldDescription.InDefinedShape r3, net.bytebuddy.description.field.FieldDescription r4, net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.method.MethodDescription r6) {
                    r2 = this;
                    boolean r5 = r4.isFinal()
                    if (r5 == 0) goto L2c
                    boolean r5 = r6.isMethod()
                    if (r5 != 0) goto Ld
                    goto L2c
                Ld:
                    java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r0 = "Cannot set final field "
                    r5.append(r0)
                    r5.append(r4)
                    java.lang.String r4 = " from "
                    r5.append(r4)
                    r5.append(r6)
                    java.lang.String r4 = r5.toString()
                    r3.<init>(r4)
                    throw r3
                L2c:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r3 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r3)
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.read()
                    net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r2.assigner
                    java.lang.Object r0 = r2.value
                    java.lang.Class r0 = r0.getClass()
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r6.assign(r0, r4, r1)
                    r6 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                    r0 = 0
                    r6[r0] = r3
                    r3 = 1
                    r6[r3] = r4
                    r5.<init>(r6)
                    return r5
            }
        }

        public enum TerminationHandler extends java.lang.Enum<net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler> {
            private static final /* synthetic */ net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler[] $VALUES = null;
            public static final net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler NON_OPERATIONAL = null;
            public static final net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler RETURNING = null;



            static {
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler$1 r0 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler$1
                    java.lang.String r1 = "RETURNING"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.RETURNING = r0
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler$2 r1 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler$2
                    java.lang.String r3 = "NON_OPERATIONAL"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.NON_OPERATIONAL = r1
                    r3 = 2
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler[] r3 = new net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler[r3]
                    r3[r2] = r0
                    r3[r4] = r1
                    net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.$VALUES = r3
                    return
            }

            TerminationHandler(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ TerminationHandler(java.lang.String r1, int r2, net.bytebuddy.implementation.FieldAccessor.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler> r0 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r1 = (net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler) r1
                    return r1
            }

            public static net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler[] values() {
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler[] r0 = net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler[] r0 = (net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler[]) r0
                    return r0
            }

            public abstract net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.method.MethodDescription r1);
        }

        public ForSetter(net.bytebuddy.implementation.FieldAccessor.FieldLocation r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.terminationHandler = r4
                return
        }

        public static /* synthetic */ net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler access$200(net.bytebuddy.implementation.FieldAccessor.ForSetter r0) {
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r0 = r0.terminationHandler
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r5) {
                r4 = this;
                net.bytebuddy.implementation.FieldAccessor$ForSetter$Appender r0 = new net.bytebuddy.implementation.FieldAccessor$ForSetter$Appender
                net.bytebuddy.description.type.TypeDescription r1 = r5.getInstrumentedType()
                net.bytebuddy.description.type.TypeDescription r2 = r5.getInstrumentedType()
                java.lang.Object r2 = r4.initialize(r2)
                net.bytebuddy.implementation.FieldAccessor$FieldLocation r3 = r4.fieldLocation
                net.bytebuddy.description.type.TypeDescription r5 = r5.getInstrumentedType()
                net.bytebuddy.implementation.FieldAccessor$FieldLocation$Prepared r5 = r3.prepare(r5)
                r0.<init>(r4, r1, r2, r5)
                return r0
        }

        @Override // net.bytebuddy.implementation.FieldAccessor
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = super.equals(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r4 != r5) goto Lc
                return r0
            Lc:
                if (r5 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L1a
                return r1
            L1a:
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r2 = r4.terminationHandler
                net.bytebuddy.implementation.FieldAccessor$ForSetter r5 = (net.bytebuddy.implementation.FieldAccessor.ForSetter) r5
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r5 = r5.terminationHandler
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        @Override // net.bytebuddy.implementation.FieldAccessor
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.FieldAccessor$ForSetter$TerminationHandler r1 = r2.terminationHandler
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        public abstract T initialize(net.bytebuddy.description.type.TypeDescription r1);

        public abstract net.bytebuddy.implementation.bytecode.StackManipulation resolve(@net.bytebuddy.utility.nullability.MaybeNull T r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4);
    }

    public interface OwnerTypeLocatable extends net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable {
        net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable in(java.lang.Class<?> r1);

        net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable in(net.bytebuddy.description.type.TypeDescription r1);

        net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable in(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r1);
    }

    public interface PropertyConfigurable extends net.bytebuddy.implementation.Implementation {
        net.bytebuddy.implementation.Implementation.Composable setsArgumentAt(int r1);

        net.bytebuddy.implementation.Implementation.Composable setsDefaultValue();

        net.bytebuddy.implementation.Implementation.Composable setsFieldValueOf(java.lang.String r1);

        net.bytebuddy.implementation.Implementation.Composable setsFieldValueOf(java.lang.reflect.Field r1);

        net.bytebuddy.implementation.Implementation.Composable setsFieldValueOf(net.bytebuddy.description.field.FieldDescription r1);

        net.bytebuddy.implementation.Implementation.Composable setsFieldValueOf(net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor r1);

        net.bytebuddy.implementation.Implementation.Composable setsReference(java.lang.Object r1);

        net.bytebuddy.implementation.Implementation.Composable setsReference(java.lang.Object r1, java.lang.String r2);

        net.bytebuddy.implementation.Implementation.Composable setsValue(java.lang.Object r1);

        net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.description.type.TypeDescription r1);

        net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.reflect.Type r2);

        net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription.Generic r2);

        net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.utility.ConstantValue r1);

        net.bytebuddy.implementation.Implementation.Composable setsValue(net.bytebuddy.utility.JavaConstant r1);
    }

    public FieldAccessor(net.bytebuddy.implementation.FieldAccessor.FieldLocation r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
            r0 = this;
            r0.<init>()
            r0.fieldLocation = r1
            r0.assigner = r2
            r0.typing = r3
            return
    }

    public static net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable of(java.lang.reflect.Field r1) {
            net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
            r0.<init>(r1)
            net.bytebuddy.implementation.FieldAccessor$AssignerConfigurable r1 = of(r0)
            return r1
    }

    public static net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable of(net.bytebuddy.description.field.FieldDescription r2) {
            net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r0 = new net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty
            net.bytebuddy.implementation.FieldAccessor$FieldLocation$Absolute r1 = new net.bytebuddy.implementation.FieldAccessor$FieldLocation$Absolute
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable of(java.util.List<? extends net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor> r2) {
            net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty r0 = new net.bytebuddy.implementation.FieldAccessor$ForImplicitProperty
            net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative r1 = new net.bytebuddy.implementation.FieldAccessor$FieldLocation$Relative
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable of(net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor r0) {
            java.util.List r0 = java.util.Collections.singletonList(r0)
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r0 = of(r0)
            return r0
    }

    public static net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable of(net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r0 = of(r0)
            return r0
    }

    public static net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable ofBeanProperty() {
            r0 = 2
            net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor[] r0 = new net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor[r0]
            net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty r1 = net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.INSTANCE
            r2 = 0
            r0[r2] = r1
            net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty r1 = net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.CAPITALIZED
            r2 = 1
            r0[r2] = r1
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r0 = of(r0)
            return r0
    }

    public static net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable ofField(java.lang.String r1) {
            net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForFixedValue r0 = new net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForFixedValue
            r0.<init>(r1)
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r1 = of(r0)
            return r1
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
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
            net.bytebuddy.implementation.FieldAccessor r5 = (net.bytebuddy.implementation.FieldAccessor) r5
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.implementation.FieldAccessor$FieldLocation r2 = r4.fieldLocation
            net.bytebuddy.implementation.FieldAccessor$FieldLocation r3 = r5.fieldLocation
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L36
            return r1
        L36:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.implementation.FieldAccessor$FieldLocation r1 = r2.fieldLocation
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}

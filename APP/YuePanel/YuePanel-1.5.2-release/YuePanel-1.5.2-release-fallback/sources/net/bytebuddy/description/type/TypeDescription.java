package net.bytebuddy.description.type;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeDescription extends net.bytebuddy.description.type.TypeDefinition, net.bytebuddy.description.ByteCodeElement, net.bytebuddy.description.TypeVariableSource {
    public static final net.bytebuddy.description.type.TypeList.Generic ARRAY_INTERFACES = null;

    @java.lang.Deprecated
    public static final net.bytebuddy.description.type.TypeDescription CLASS = null;

    @java.lang.Deprecated
    public static final net.bytebuddy.description.type.TypeDescription OBJECT = null;

    @java.lang.Deprecated
    public static final net.bytebuddy.description.type.TypeDescription STRING = null;

    @java.lang.Deprecated
    public static final net.bytebuddy.description.type.TypeDescription THROWABLE = null;

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final net.bytebuddy.description.type.TypeDescription UNDEFINED = null;

    @java.lang.Deprecated
    public static final net.bytebuddy.description.type.TypeDescription VOID = null;

    /* JADX INFO: renamed from: net.bytebuddy.description.type.TypeDescription$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class AbstractBase extends net.bytebuddy.description.TypeVariableSource.AbstractBase implements net.bytebuddy.description.type.TypeDescription {
        private static final boolean ACCESS_CONTROLLER = false;
        public static final boolean RAW_TYPES = false;
        private transient /* synthetic */ int hashCode;

        public static abstract class OfSimpleType extends net.bytebuddy.description.type.TypeDescription.AbstractBase {

            public static abstract class WithDelegation extends net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType {
                public WithDelegation() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract net.bytebuddy.description.type.TypeDescription delegate();

                @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
                public int getActualModifiers(boolean r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        int r2 = r0.getActualModifiers(r2)
                        return r2
                }

                @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.ClassFileVersion getClassFileVersion() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.ClassFileVersion r0 = r0.getClassFileVersion()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeList r0 = r0.getDeclaredTypes()
                        return r0
                }

                @Override // net.bytebuddy.description.DeclaredByType
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getEnclosingMethod()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getEnclosingType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.String getGenericSignature() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        java.lang.String r0 = r0.getGenericSignature()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getInterfaces()
                        return r0
                }

                @Override // net.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        int r0 = r0.getModifiers()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public net.bytebuddy.description.type.TypeDescription getNestHost() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getNestHost()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public net.bytebuddy.description.type.TypeList getNestMembers() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeList r0 = r0.getNestMembers()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.PackageDescription getPackage() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.PackageDescription r0 = r0.getPackage()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeList r0 = r0.getPermittedSubtypes()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.RecordComponentList r0 = r0.getRecordComponents()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                        return r0
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getTypeVariables()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public boolean isAnonymousType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        boolean r0 = r0.isAnonymousType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public boolean isLocalType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        boolean r0 = r0.isLocalType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public boolean isRecord() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        boolean r0 = r0.isRecord()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
                public boolean isSealed() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.delegate()
                        boolean r0 = r0.isSealed()
                        return r0
                }
            }

            public OfSimpleType() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getCanonicalName() {
                    r4 = this;
                    boolean r0 = r4.isAnonymousType()
                    if (r0 != 0) goto L5e
                    boolean r0 = r4.isLocalType()
                    if (r0 == 0) goto Ld
                    goto L5e
                Ld:
                    java.lang.String r0 = r4.getInternalName()
                    net.bytebuddy.description.type.TypeDescription r1 = r4.getEnclosingType()
                    if (r1 == 0) goto L59
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = r1.getInternalName()
                    r2.append(r3)
                    java.lang.String r3 = "$"
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    boolean r2 = r0.startsWith(r2)
                    if (r2 == 0) goto L59
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = r1.getCanonicalName()
                    r2.append(r3)
                    java.lang.String r3 = "."
                    r2.append(r3)
                    java.lang.String r1 = r1.getInternalName()
                    int r1 = r1.length()
                    int r1 = r1 + 1
                    java.lang.String r0 = r0.substring(r1)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    return r0
                L59:
                    java.lang.String r0 = r4.getName()
                    return r0
                L5e:
                    java.lang.String r0 = net.bytebuddy.description.NamedElement.NO_NAME
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription getComponentType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                    return r0
            }

            @Override // net.bytebuddy.description.NamedElement.WithDescriptor
            public java.lang.String getDescriptor() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "L"
                    r0.append(r1)
                    java.lang.String r1 = r2.getInternalName()
                    r0.append(r1)
                    java.lang.String r1 = ";"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public java.lang.String getSimpleName() {
                    r4 = this;
                    java.lang.String r0 = r4.getInternalName()
                    net.bytebuddy.description.type.TypeDescription r1 = r4.getEnclosingType()
                    if (r1 == 0) goto L30
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = r1.getInternalName()
                    r2.append(r3)
                    java.lang.String r3 = "$"
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    boolean r2 = r0.startsWith(r2)
                    if (r2 == 0) goto L30
                    java.lang.String r1 = r1.getInternalName()
                    int r1 = r1.length()
                L2d:
                    int r1 = r1 + 1
                    goto L3a
                L30:
                    r1 = 47
                    int r1 = r0.lastIndexOf(r1)
                    r2 = -1
                    if (r1 != r2) goto L3a
                    return r0
                L3a:
                    int r2 = r0.length()
                    if (r1 >= r2) goto L4b
                    char r2 = r0.charAt(r1)
                    boolean r2 = java.lang.Character.isLetter(r2)
                    if (r2 != 0) goto L4b
                    goto L2d
                L4b:
                    java.lang.String r0 = r0.substring(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
                net.bytebuddy.description.type.TypeDescription.AbstractBase.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
                goto L1c
            L16:
                r1 = 1
                net.bytebuddy.description.type.TypeDescription.AbstractBase.ACCESS_CONTROLLER = r1
                goto L1c
            L1a:
                net.bytebuddy.description.type.TypeDescription.AbstractBase.ACCESS_CONTROLLER = r0
            L1c:
                net.bytebuddy.utility.privilege.GetSystemPropertyAction r1 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction     // Catch: java.lang.Exception -> L2d
                java.lang.String r2 = "net.bytebuddy.raw"
                r1.<init>(r2)     // Catch: java.lang.Exception -> L2d
                java.lang.Object r1 = doPrivileged(r1)     // Catch: java.lang.Exception -> L2d
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2d
                boolean r0 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.Exception -> L2d
            L2d:
                net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES = r0
                return
        }

        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        private static boolean isAssignable(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.type.TypeDescription r5) {
                boolean r0 = r4.equals(r5)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r5.isArray()
                r2 = 0
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                if (r0 == 0) goto L39
                boolean r0 = r4.isArray()
                if (r0 == 0) goto L24
                net.bytebuddy.description.type.TypeDescription r4 = r4.getComponentType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.getComponentType()
                boolean r1 = isAssignable(r4, r5)
                goto L38
            L24:
                boolean r5 = r4.represents(r3)
                if (r5 != 0) goto L38
                net.bytebuddy.description.type.TypeList$Generic r5 = net.bytebuddy.description.type.TypeDescription.ARRAY_INTERFACES
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.asGenericType()
                boolean r4 = r5.contains(r4)
                if (r4 == 0) goto L37
                goto L38
            L37:
                r1 = r2
            L38:
                return r1
            L39:
                boolean r0 = r4.represents(r3)
                if (r0 == 0) goto L45
                boolean r4 = r5.isPrimitive()
                r4 = r4 ^ r1
                return r4
            L45:
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getSuperClass()
                if (r0 == 0) goto L56
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r4.isAssignableFrom(r0)
                if (r0 == 0) goto L56
                return r1
            L56:
                boolean r0 = r4.isInterface()
                if (r0 == 0) goto L7b
                net.bytebuddy.description.type.TypeList$Generic r5 = r5.getInterfaces()
                net.bytebuddy.description.type.TypeList r5 = r5.asErasures()
                java.util.Iterator r5 = r5.iterator()
            L68:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L7b
                java.lang.Object r0 = r5.next()
                net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                boolean r0 = r4.isAssignableFrom(r0)
                if (r0 == 0) goto L68
                return r1
            L7b:
                return r2
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public <T> T accept(net.bytebuddy.description.TypeVariableSource.Visitor<T> r1) {
                r0 = this;
                java.lang.Object r1 = r1.onType(r0)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription asBoxed() {
                r1 = this;
                java.lang.Class r0 = java.lang.Boolean.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto Lf
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            Lf:
                java.lang.Class r0 = java.lang.Byte.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L1e
                java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L1e:
                java.lang.Class r0 = java.lang.Short.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L2d
                java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L2d:
                java.lang.Class r0 = java.lang.Character.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L3c
                java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L3c:
                java.lang.Class r0 = java.lang.Integer.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L4b
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L4b:
                java.lang.Class r0 = java.lang.Long.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L5a
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L5a:
                java.lang.Class r0 = java.lang.Float.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L69
                java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L69:
                java.lang.Class r0 = java.lang.Double.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L78
                java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L78:
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeDescription asErasure() {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeDescription.Generic asGenericType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForErasure r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForErasure
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription asUnboxed() {
                r1 = this;
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto Lf
                java.lang.Class r0 = java.lang.Boolean.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            Lf:
                java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L1e
                java.lang.Class r0 = java.lang.Byte.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L1e:
                java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L2d
                java.lang.Class r0 = java.lang.Short.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L2d:
                java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L3c
                java.lang.Class r0 = java.lang.Character.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L3c:
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L4b
                java.lang.Class r0 = java.lang.Integer.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L4b:
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L5a
                java.lang.Class r0 = java.lang.Long.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L5a:
                java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L69
                java.lang.Class r0 = java.lang.Float.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L69:
                java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L78
                java.lang.Class r0 = java.lang.Double.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
            L78:
                return r1
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof net.bytebuddy.description.type.TypeDefinition
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.type.TypeDefinition r4 = (net.bytebuddy.description.type.TypeDefinition) r4
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = r4.getSort()
                boolean r1 = r1.isNonGeneric()
                if (r1 == 0) goto L29
                java.lang.String r1 = r3.getName()
                net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                java.lang.String r4 = r4.getName()
                boolean r4 = r1.equals(r4)
                if (r4 == 0) goto L29
                goto L2a
            L29:
                r0 = r2
            L2a:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public int getActualModifiers(boolean r4) {
                r3 = this;
                int r0 = r3.getModifiers()
                net.bytebuddy.description.annotation.AnnotationList r1 = r3.getDeclaredAnnotations()
                java.lang.Class<java.lang.Deprecated> r2 = java.lang.Deprecated.class
                boolean r1 = r1.isAnnotationPresent(r2)
                r2 = 0
                if (r1 == 0) goto L14
                r1 = 131072(0x20000, float:1.83671E-40)
                goto L15
            L14:
                r1 = r2
            L15:
                r0 = r0 | r1
                boolean r1 = r3.isRecord()
                if (r1 == 0) goto L1f
                r1 = 65536(0x10000, float:9.1835E-41)
                goto L20
            L1f:
                r1 = r2
            L20:
                r0 = r0 | r1
                if (r4 == 0) goto L25
                r2 = 32
            L25:
                r4 = r0 | r2
                boolean r0 = r3.isPrivate()
                if (r0 == 0) goto L30
                r4 = r4 & (-11)
                return r4
            L30:
                boolean r0 = r3.isProtected()
                if (r0 == 0) goto L3b
                r4 = r4 & (-13)
                r4 = r4 | 1
                return r4
            L3b:
                r4 = r4 & (-9)
                return r4
        }

        @Override // net.bytebuddy.description.NamedElement
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public java.lang.String getActualName() {
                r4 = this;
                boolean r0 = r4.isArray()
                if (r0 == 0) goto L30
                r0 = 0
                r2 = r4
                r1 = r0
            L9:
                int r1 = r1 + 1
                net.bytebuddy.description.type.TypeDescription r2 = r2.getComponentType()
                boolean r3 = r2.isArray()
                if (r3 != 0) goto L9
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r2 = r2.getActualName()
                r3.append(r2)
            L21:
                if (r0 >= r1) goto L2b
                java.lang.String r2 = "[]"
                r3.append(r2)
                int r0 = r0 + 1
                goto L21
            L2b:
                java.lang.String r0 = r3.toString()
                return r0
            L30:
                java.lang.String r0 = r4.getName()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.ClassFileVersion getClassFileVersion() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.Object getDefaultValue() {
                r2 = this;
                java.lang.Class r0 = java.lang.Boolean.TYPE
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto Lb
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            Lb:
                java.lang.Class r0 = java.lang.Byte.TYPE
                boolean r0 = r2.represents(r0)
                r1 = 0
                if (r0 == 0) goto L19
                java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
                return r0
            L19:
                java.lang.Class r0 = java.lang.Short.TYPE
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto L26
                java.lang.Short r0 = java.lang.Short.valueOf(r1)
                return r0
            L26:
                java.lang.Class r0 = java.lang.Character.TYPE
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto L33
                java.lang.Character r0 = java.lang.Character.valueOf(r1)
                return r0
            L33:
                java.lang.Class r0 = java.lang.Integer.TYPE
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto L40
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                return r0
            L40:
                java.lang.Class r0 = java.lang.Long.TYPE
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto L4f
                r0 = 0
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
            L4f:
                java.lang.Class r0 = java.lang.Float.TYPE
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto L5d
                r0 = 0
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                return r0
            L5d:
                java.lang.Class r0 = java.lang.Double.TYPE
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto L6c
                r0 = 0
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                return r0
            L6c:
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.TypeVariableSource getEnclosingSource() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getEnclosingMethod()
                if (r0 != 0) goto L13
                boolean r0 = r1.isStatic()
                if (r0 == 0) goto Lf
                net.bytebuddy.description.TypeVariableSource r0 = net.bytebuddy.description.TypeVariableSource.UNDEFINED
                goto L13
            Lf:
                net.bytebuddy.description.type.TypeDescription r0 = r1.getEnclosingType()
            L13:
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithDescriptor
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String getGenericSignature() {
                r8 = this;
                net.bytebuddy.jar.asm.signature.SignatureWriter r0 = new net.bytebuddy.jar.asm.signature.SignatureWriter     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r0.<init>()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.description.type.TypeList$Generic r1 = r8.getTypeVariables()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r2 = 0
                r3 = r2
            Lf:
                boolean r4 = r1.hasNext()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r5 = 1
                if (r4 == 0) goto L55
                java.lang.Object r3 = r1.next()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                java.lang.String r4 = r3.getSymbol()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r0.visitFormalTypeParameter(r4)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.getUpperBounds()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
            L2b:
                boolean r4 = r3.hasNext()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                if (r4 == 0) goto L53
                java.lang.Object r4 = r3.next()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r6 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.description.type.TypeDescription r7 = r4.asErasure()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                boolean r7 = r7.isInterface()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                if (r7 == 0) goto L48
                net.bytebuddy.jar.asm.signature.SignatureVisitor r7 = r0.visitInterfaceBound()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                goto L4c
            L48:
                net.bytebuddy.jar.asm.signature.SignatureVisitor r7 = r0.visitClassBound()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
            L4c:
                r6.<init>(r7)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r4.accept(r6)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                goto L2b
            L53:
                r3 = r5
                goto Lf
            L55:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r8.getSuperClass()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                if (r1 != 0) goto L61
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
            L61:
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r4 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.jar.asm.signature.SignatureVisitor r6 = r0.visitSuperclass()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r4.<init>(r6)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r1.accept(r4)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                if (r3 != 0) goto L7c
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = r1.getSort()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                boolean r1 = r1.isNonGeneric()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                if (r1 != 0) goto L7a
                goto L7c
            L7a:
                r1 = r2
                goto L7d
            L7c:
                r1 = r5
            L7d:
                net.bytebuddy.description.type.TypeList$Generic r3 = r8.getInterfaces()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
            L85:
                boolean r4 = r3.hasNext()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                if (r4 == 0) goto Lae
                java.lang.Object r4 = r3.next()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r6 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                net.bytebuddy.jar.asm.signature.SignatureVisitor r7 = r0.visitInterface()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r6.<init>(r7)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                r4.accept(r6)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                if (r1 != 0) goto Lac
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = r4.getSort()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                boolean r1 = r1.isNonGeneric()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                if (r1 != 0) goto Laa
                goto Lac
            Laa:
                r1 = r2
                goto L85
            Lac:
                r1 = r5
                goto L85
            Lae:
                if (r1 == 0) goto Lb5
                java.lang.String r0 = r0.toString()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
                goto Lb7
            Lb5:
                java.lang.String r0 = net.bytebuddy.description.NamedElement.WithDescriptor.NON_GENERIC_SIGNATURE     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lb8
            Lb7:
                return r0
            Lb8:
                java.lang.String r0 = net.bytebuddy.description.NamedElement.WithDescriptor.NON_GENERIC_SIGNATURE
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.annotation.AnnotationList getInheritedAnnotations() {
                r5 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getSuperClass()
                net.bytebuddy.description.annotation.AnnotationList r1 = r5.getDeclaredAnnotations()
                if (r0 != 0) goto Lb
                return r1
            Lb:
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                java.util.Iterator r3 = r1.iterator()
            L14:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L28
                java.lang.Object r4 = r3.next()
                net.bytebuddy.description.annotation.AnnotationDescription r4 = (net.bytebuddy.description.annotation.AnnotationDescription) r4
                net.bytebuddy.description.type.TypeDescription r4 = r4.getAnnotationType()
                r2.add(r4)
                goto L14
            L28:
                net.bytebuddy.description.annotation.AnnotationList$Explicit r3 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getInheritedAnnotations()
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.inherited(r2)
                java.util.List r0 = net.bytebuddy.utility.CompoundList.of(r1, r0)
                r3.<init>(r0)
                return r3
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public int getInnerClassCount() {
                r2 = this;
                boolean r0 = r2.isStatic()
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
                if (r0 != 0) goto Lf
                goto L15
            Lf:
                int r0 = r0.getInnerClassCount()
                int r1 = r0 + 1
            L15:
                return r1
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getInternalName() {
                r3 = this;
                java.lang.String r0 = r3.getName()
                r1 = 46
                r2 = 47
                java.lang.String r0 = r0.replace(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public java.lang.String getLongSimpleName() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
                if (r0 != 0) goto Lb
                java.lang.String r0 = r2.getSimpleName()
                goto L27
            Lb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = r0.getLongSimpleName()
                r1.append(r0)
                java.lang.String r0 = "."
                r1.append(r0)
                java.lang.String r0 = r2.getSimpleName()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L27:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeDefinition.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.NON_GENERIC
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public java.lang.String getTypeName() {
                r1 = this;
                java.lang.String r0 = r1.getName()
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r1 = this;
                int r0 = r1.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto Le
            L6:
                java.lang.String r0 = r1.getName()
                int r0 = r0.hashCode()
            Le:
                if (r0 != 0) goto L13
                int r0 = r1.hashCode
                goto L15
            L13:
                r1.hashCode = r0
            L15:
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isAccessibleTo(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                boolean r0 = r1.isPrimitive()
                if (r0 != 0) goto L26
                boolean r0 = r1.isArray()
                if (r0 == 0) goto L17
                net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                boolean r2 = r0.isVisibleTo(r2)
                if (r2 == 0) goto L24
                goto L26
            L17:
                boolean r0 = r1.isPublic()
                if (r0 != 0) goto L26
                boolean r2 = r1.isSamePackage(r2)
                if (r2 == 0) goto L24
                goto L26
            L24:
                r2 = 0
                goto L27
            L26:
                r2 = 1
            L27:
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isAnnotationReturnType() {
                r2 = this;
                boolean r0 = r2.isPrimitive()
                if (r0 != 0) goto L4f
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                boolean r0 = r2.represents(r0)
                if (r0 != 0) goto L4f
                java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
                boolean r1 = r2.isAssignableTo(r0)
                if (r1 == 0) goto L1c
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto L4f
            L1c:
                java.lang.Class<java.lang.annotation.Annotation> r0 = java.lang.annotation.Annotation.class
                boolean r1 = r2.isAssignableTo(r0)
                if (r1 == 0) goto L2a
                boolean r0 = r2.represents(r0)
                if (r0 == 0) goto L4f
            L2a:
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                boolean r0 = r2.represents(r0)
                if (r0 != 0) goto L4f
                boolean r0 = r2.isArray()
                if (r0 == 0) goto L4d
                net.bytebuddy.description.type.TypeDescription r0 = r2.getComponentType()
                boolean r0 = r0.isArray()
                if (r0 != 0) goto L4d
                net.bytebuddy.description.type.TypeDescription r0 = r2.getComponentType()
                boolean r0 = r0.isAnnotationReturnType()
                if (r0 == 0) goto L4d
                goto L4f
            L4d:
                r0 = 0
                goto L50
            L4f:
                r0 = 1
            L50:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isAnnotationValue() {
                r1 = this;
                boolean r0 = r1.isPrimitive()
                if (r0 != 0) goto L43
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L43
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.class
                boolean r0 = r1.isAssignableTo(r0)
                if (r0 != 0) goto L43
                java.lang.Class<net.bytebuddy.description.annotation.AnnotationDescription> r0 = net.bytebuddy.description.annotation.AnnotationDescription.class
                boolean r0 = r1.isAssignableTo(r0)
                if (r0 != 0) goto L43
                java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r0 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                boolean r0 = r1.isAssignableTo(r0)
                if (r0 != 0) goto L43
                boolean r0 = r1.isArray()
                if (r0 == 0) goto L41
                net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                boolean r0 = r0.isArray()
                if (r0 != 0) goto L41
                net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                boolean r0 = r0.isAnnotationValue()
                if (r0 == 0) goto L41
                goto L43
            L41:
                r0 = 0
                goto L44
            L43:
                r0 = 1
            L44:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnnotationValue(java.lang.Object r7) {
                r6 = this;
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                boolean r0 = r6.represents(r0)
                r1 = 1
                if (r0 == 0) goto Ld
                boolean r0 = r7 instanceof net.bytebuddy.description.type.TypeDescription
                if (r0 != 0) goto L113
            Ld:
                boolean r0 = r7 instanceof net.bytebuddy.description.annotation.AnnotationDescription
                if (r0 == 0) goto L1e
                r0 = r7
                net.bytebuddy.description.annotation.AnnotationDescription r0 = (net.bytebuddy.description.annotation.AnnotationDescription) r0
                net.bytebuddy.description.type.TypeDescription r0 = r0.getAnnotationType()
                boolean r0 = r0.equals(r6)
                if (r0 != 0) goto L113
            L1e:
                boolean r0 = r7 instanceof net.bytebuddy.description.enumeration.EnumerationDescription
                if (r0 == 0) goto L2f
                r0 = r7
                net.bytebuddy.description.enumeration.EnumerationDescription r0 = (net.bytebuddy.description.enumeration.EnumerationDescription) r0
                net.bytebuddy.description.type.TypeDescription r0 = r0.getEnumerationType()
                boolean r0 = r0.equals(r6)
                if (r0 != 0) goto L113
            L2f:
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L3b
                boolean r0 = r7 instanceof java.lang.String
                if (r0 != 0) goto L113
            L3b:
                java.lang.Class r0 = java.lang.Boolean.TYPE
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L47
                boolean r0 = r7 instanceof java.lang.Boolean
                if (r0 != 0) goto L113
            L47:
                java.lang.Class r0 = java.lang.Byte.TYPE
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L53
                boolean r0 = r7 instanceof java.lang.Byte
                if (r0 != 0) goto L113
            L53:
                java.lang.Class r0 = java.lang.Short.TYPE
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L5f
                boolean r0 = r7 instanceof java.lang.Short
                if (r0 != 0) goto L113
            L5f:
                java.lang.Class r0 = java.lang.Character.TYPE
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L6b
                boolean r0 = r7 instanceof java.lang.Character
                if (r0 != 0) goto L113
            L6b:
                java.lang.Class r0 = java.lang.Integer.TYPE
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L77
                boolean r0 = r7 instanceof java.lang.Integer
                if (r0 != 0) goto L113
            L77:
                java.lang.Class r0 = java.lang.Long.TYPE
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L83
                boolean r0 = r7 instanceof java.lang.Long
                if (r0 != 0) goto L113
            L83:
                java.lang.Class r0 = java.lang.Float.TYPE
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L8f
                boolean r0 = r7 instanceof java.lang.Float
                if (r0 != 0) goto L113
            L8f:
                java.lang.Class r0 = java.lang.Double.TYPE
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L9b
                boolean r0 = r7 instanceof java.lang.Double
                if (r0 != 0) goto L113
            L9b:
                java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto La7
                boolean r0 = r7 instanceof java.lang.String[]
                if (r0 != 0) goto L113
            La7:
                java.lang.Class<boolean[]> r0 = boolean[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto Lb3
                boolean r0 = r7 instanceof boolean[]
                if (r0 != 0) goto L113
            Lb3:
                java.lang.Class<byte[]> r0 = byte[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto Lbf
                boolean r0 = r7 instanceof byte[]
                if (r0 != 0) goto L113
            Lbf:
                java.lang.Class<short[]> r0 = short[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto Lcb
                boolean r0 = r7 instanceof short[]
                if (r0 != 0) goto L113
            Lcb:
                java.lang.Class<char[]> r0 = char[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto Ld7
                boolean r0 = r7 instanceof char[]
                if (r0 != 0) goto L113
            Ld7:
                java.lang.Class<int[]> r0 = int[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto Le3
                boolean r0 = r7 instanceof int[]
                if (r0 != 0) goto L113
            Le3:
                java.lang.Class<long[]> r0 = long[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto Lef
                boolean r0 = r7 instanceof long[]
                if (r0 != 0) goto L113
            Lef:
                java.lang.Class<float[]> r0 = float[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto Lfb
                boolean r0 = r7 instanceof float[]
                if (r0 != 0) goto L113
            Lfb:
                java.lang.Class<double[]> r0 = double[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L107
                boolean r0 = r7 instanceof double[]
                if (r0 != 0) goto L113
            L107:
                java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
                boolean r0 = r6.represents(r0)
                if (r0 == 0) goto L114
                boolean r0 = r7 instanceof net.bytebuddy.description.type.TypeDescription[]
                if (r0 == 0) goto L114
            L113:
                return r1
            L114:
                java.lang.Class<java.lang.annotation.Annotation[]> r0 = java.lang.annotation.Annotation[].class
                boolean r0 = r6.isAssignableTo(r0)
                r2 = 0
                if (r0 == 0) goto L13e
                boolean r0 = r7 instanceof net.bytebuddy.description.annotation.AnnotationDescription[]
                if (r0 == 0) goto L13e
                net.bytebuddy.description.annotation.AnnotationDescription[] r7 = (net.bytebuddy.description.annotation.AnnotationDescription[]) r7
                net.bytebuddy.description.annotation.AnnotationDescription[] r7 = (net.bytebuddy.description.annotation.AnnotationDescription[]) r7
                int r0 = r7.length
                r3 = r2
            L127:
                if (r3 >= r0) goto L13d
                r4 = r7[r3]
                net.bytebuddy.description.type.TypeDescription r4 = r4.getAnnotationType()
                net.bytebuddy.description.type.TypeDescription r5 = r6.getComponentType()
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L13a
                return r2
            L13a:
                int r3 = r3 + 1
                goto L127
            L13d:
                return r1
            L13e:
                java.lang.Class<java.lang.Enum[]> r0 = java.lang.Enum[].class
                boolean r0 = r6.isAssignableTo(r0)
                if (r0 == 0) goto L167
                boolean r0 = r7 instanceof net.bytebuddy.description.enumeration.EnumerationDescription[]
                if (r0 == 0) goto L167
                net.bytebuddy.description.enumeration.EnumerationDescription[] r7 = (net.bytebuddy.description.enumeration.EnumerationDescription[]) r7
                net.bytebuddy.description.enumeration.EnumerationDescription[] r7 = (net.bytebuddy.description.enumeration.EnumerationDescription[]) r7
                int r0 = r7.length
                r3 = r2
            L150:
                if (r3 >= r0) goto L166
                r4 = r7[r3]
                net.bytebuddy.description.type.TypeDescription r4 = r4.getEnumerationType()
                net.bytebuddy.description.type.TypeDescription r5 = r6.getComponentType()
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L163
                return r2
            L163:
                int r3 = r3 + 1
                goto L150
            L166:
                return r1
            L167:
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAssignableFrom(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                boolean r1 = r0.isAssignableFrom(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAssignableFrom(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                boolean r1 = isAssignable(r0, r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAssignableTo(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                boolean r1 = r0.isAssignableTo(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAssignableTo(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                boolean r1 = isAssignable(r1, r0)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isCompileTimeConstant() {
                r1 = this;
                java.lang.Class r0 = java.lang.Integer.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L4b
                java.lang.Class r0 = java.lang.Long.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L4b
                java.lang.Class r0 = java.lang.Float.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L4b
                java.lang.Class r0 = java.lang.Double.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L4b
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L4b
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L4b
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_TYPE
                net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L4b
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L49
                goto L4b
            L49:
                r0 = 0
                goto L4c
            L4b:
                r0 = 1
            L4c:
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public boolean isGenerified() {
                r3 = this;
                net.bytebuddy.description.type.TypeList$Generic r0 = r3.getTypeVariables()
                boolean r0 = r0.isEmpty()
                r1 = 1
                if (r0 != 0) goto Lc
                return r1
            Lc:
                boolean r0 = r3.isStatic()
                if (r0 != 0) goto L1f
                net.bytebuddy.description.type.TypeDescription r0 = r3.getDeclaringType()
                if (r0 == 0) goto L1f
                boolean r0 = r0.isGenerified()
                if (r0 == 0) goto L1f
                return r1
            L1f:
                r0 = 0
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r3.getEnclosingMethod()     // Catch: java.lang.Throwable -> L2f
                if (r2 == 0) goto L2d
                boolean r2 = r2.isGenerified()     // Catch: java.lang.Throwable -> L2f
                if (r2 == 0) goto L2d
                goto L2e
            L2d:
                r1 = r0
            L2e:
                return r1
            L2f:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isInHierarchyWith(java.lang.Class<?> r2) {
                r1 = this;
                boolean r0 = r1.isAssignableTo(r2)
                if (r0 != 0) goto Lf
                boolean r2 = r1.isAssignableFrom(r2)
                if (r2 == 0) goto Ld
                goto Lf
            Ld:
                r2 = 0
                goto L10
            Lf:
                r2 = 1
            L10:
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isInHierarchyWith(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                boolean r0 = r1.isAssignableTo(r2)
                if (r0 != 0) goto Lf
                boolean r2 = r1.isAssignableFrom(r2)
                if (r2 == 0) goto Ld
                goto Lf
            Ld:
                r2 = 0
                goto L10
            Lf:
                r2 = 1
            L10:
                return r2
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public boolean isInferrable() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isInnerClass() {
                r1 = this;
                boolean r0 = r1.isStatic()
                if (r0 != 0) goto Le
                boolean r0 = r1.isNestedClass()
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isInstance(java.lang.Object r1) {
                r0 = this;
                java.lang.Class r1 = r1.getClass()
                boolean r1 = r0.isAssignableFrom(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
                r1 = this;
                boolean r0 = r1.isLocalType()
                if (r0 != 0) goto L14
                boolean r0 = r1.isAnonymousType()
                if (r0 != 0) goto L14
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                if (r0 == 0) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isNestHost() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getNestHost()
                boolean r0 = r1.equals(r0)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isNestMateOf(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                boolean r1 = r0.isNestMateOf(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isNestMateOf(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getNestHost()
                net.bytebuddy.description.type.TypeDescription r2 = r2.getNestHost()
                boolean r2 = r0.equals(r2)
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isNestedClass() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isPackageType() {
                r2 = this;
                java.lang.String r0 = r2.getSimpleName()
                java.lang.String r1 = "package-info"
                boolean r0 = r0.equals(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isPrimitiveWrapper() {
                r1 = this;
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L43
                java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L43
                java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L43
                java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L43
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L43
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L43
                java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto L43
                java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L41
                goto L43
            L41:
                r0 = 0
                goto L44
            L43:
                r0 = 1
            L44:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isSamePackage(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                net.bytebuddy.description.type.PackageDescription r0 = r1.getPackage()
                net.bytebuddy.description.type.PackageDescription r2 = r2.getPackage()
                if (r0 == 0) goto L12
                if (r2 != 0) goto Ld
                goto L12
            Ld:
                boolean r2 = r0.equals(r2)
                goto L17
            L12:
                if (r0 != r2) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isSealed() {
                r1 = this;
                boolean r0 = r1.isPrimitive()
                if (r0 != 0) goto L18
                boolean r0 = r1.isArray()
                if (r0 != 0) goto L18
                net.bytebuddy.description.type.TypeList r0 = r1.getPermittedSubtypes()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isVisibleTo(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                boolean r0 = r1.isPrimitive()
                if (r0 != 0) goto L2c
                boolean r0 = r1.isArray()
                if (r0 == 0) goto L17
                net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                boolean r2 = r0.isVisibleTo(r2)
                if (r2 == 0) goto L2a
                goto L2c
            L17:
                boolean r0 = r1.isPublic()
                if (r0 != 0) goto L2c
                boolean r0 = r1.isProtected()
                if (r0 != 0) goto L2c
                boolean r2 = r1.isSamePackage(r2)
                if (r2 == 0) goto L2a
                goto L2c
            L2a:
                r2 = 0
                goto L2d
            L2c:
                r2 = 1
            L2d:
                return r2
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition$SuperClassIterator r0 = new net.bytebuddy.description.type.TypeDefinition$SuperClassIterator
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Fits equality contract for type definitions.", value = {"EC_UNRELATED_CLASS_AND_INTERFACE"})
        public boolean represents(java.lang.reflect.Type r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                boolean r1 = r0.equals(r1)
                return r1
        }

        @Override // net.bytebuddy.description.TypeVariableSource.AbstractBase
        public java.lang.String toSafeString() {
                r1 = this;
                java.lang.String r0 = r1.toString()
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                boolean r1 = r3.isPrimitive()
                if (r1 == 0) goto Le
                java.lang.String r1 = ""
                goto L2a
            Le:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r3.isInterface()
                if (r2 == 0) goto L1c
                java.lang.String r2 = "interface"
                goto L1e
            L1c:
                java.lang.String r2 = "class"
            L1e:
                r1.append(r2)
                java.lang.String r2 = " "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L2a:
                r0.append(r1)
                java.lang.String r1 = r3.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ArrayProjection extends net.bytebuddy.description.type.TypeDescription.AbstractBase {
        private static final int ARRAY_EXCLUDED = 8712;
        private static final int ARRAY_IMPLIED = 1040;
        private final int arity;
        private final net.bytebuddy.description.type.TypeDescription componentType;

        public ArrayProjection(net.bytebuddy.description.type.TypeDescription r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.componentType = r1
                r0.arity = r2
                return
        }

        public static net.bytebuddy.description.type.TypeDescription of(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = 1
                net.bytebuddy.description.type.TypeDescription r1 = of(r1, r0)
                return r1
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public static net.bytebuddy.description.type.TypeDescription of(net.bytebuddy.description.type.TypeDescription r1, int r2) {
                if (r2 < 0) goto L19
            L2:
                boolean r0 = r1.isArray()
                if (r0 == 0) goto Lf
                net.bytebuddy.description.type.TypeDescription r1 = r1.getComponentType()
                int r2 = r2 + 1
                goto L2
            Lf:
                if (r2 != 0) goto L12
                goto L18
            L12:
                net.bytebuddy.description.type.TypeDescription$ArrayProjection r0 = new net.bytebuddy.description.type.TypeDescription$ArrayProjection
                r0.<init>(r1, r2)
                r1 = r0
            L18:
                return r1
            L19:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Arrays cannot have a negative arity"
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String getCanonicalName() {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r3.componentType
                java.lang.String r0 = r0.getCanonicalName()
                if (r0 != 0) goto Lb
                java.lang.String r0 = net.bytebuddy.description.NamedElement.NO_NAME
                return r0
            Lb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                r0 = 0
            L11:
                int r2 = r3.arity
                if (r0 >= r2) goto L1d
                java.lang.String r2 = "[]"
                r1.append(r2)
                int r0 = r0 + 1
                goto L11
            L1d:
                java.lang.String r0 = r1.toString()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getComponentType() {
                r4 = this;
                int r0 = r4.arity
                r1 = 1
                if (r0 != r1) goto L8
                net.bytebuddy.description.type.TypeDescription r0 = r4.componentType
                goto L11
            L8:
                net.bytebuddy.description.type.TypeDescription$ArrayProjection r2 = new net.bytebuddy.description.type.TypeDescription$ArrayProjection
                net.bytebuddy.description.type.TypeDescription r3 = r4.componentType
                int r0 = r0 - r1
                r2.<init>(r3, r0)
                r0 = r2
            L11:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                r1 = this;
                net.bytebuddy.description.field.FieldList$Empty r0 = new net.bytebuddy.description.field.FieldList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                r1 = this;
                net.bytebuddy.description.method.MethodList$Empty r0 = new net.bytebuddy.description.method.MethodList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.AlwaysNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.AlwaysNull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithDescriptor
        public java.lang.String getDescriptor() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            L6:
                int r2 = r3.arity
                if (r1 >= r2) goto L12
                r2 = 91
                r0.append(r2)
                int r1 = r1 + 1
                goto L6
            L12:
                net.bytebuddy.description.type.TypeDescription r1 = r3.componentType
                java.lang.String r1 = r1.getDescriptor()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.description.method.MethodDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.annotation.AnnotationList getInheritedAnnotations() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeDescription.ARRAY_INTERFACES
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public int getModifiers() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                int r0 = r0.getModifiers()
                r0 = r0 & (-8713(0xffffffffffffddf7, float:NaN))
                r0 = r0 | 1040(0x410, float:1.457E-42)
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r5 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r5.componentType
                java.lang.String r0 = r0.getDescriptor()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r0.length()
                int r3 = r5.arity
                int r2 = r2 + r3
                r1.<init>(r2)
                r2 = 0
                r3 = r2
            L14:
                int r4 = r5.arity
                if (r3 >= r4) goto L20
                r4 = 91
                r1.append(r4)
                int r3 = r3 + 1
                goto L14
            L20:
                int r3 = r0.length()
                if (r2 >= r3) goto L36
                char r3 = r0.charAt(r2)
                r4 = 47
                if (r3 != r4) goto L30
                r3 = 46
            L30:
                r1.append(r3)
                int r2 = r2 + 1
                goto L20
            L36:
                java.lang.String r0 = r1.toString()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getNestHost() {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getNestMembers() {
                r3 = this;
                net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                r1 = 1
                net.bytebuddy.description.type.TypeDescription[] r1 = new net.bytebuddy.description.type.TypeDescription[r1]
                r2 = 0
                r1[r2] = r3
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.PackageDescription getPackage() {
                r1 = this;
                net.bytebuddy.description.type.PackageDescription r0 = net.bytebuddy.description.type.PackageDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                r1 = this;
                net.bytebuddy.description.type.RecordComponentList$Empty r0 = new net.bytebuddy.description.type.RecordComponentList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public java.lang.String getSimpleName() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                net.bytebuddy.description.type.TypeDescription r1 = r3.componentType
                java.lang.String r1 = r1.getSimpleName()
                r0.<init>(r1)
                r1 = 0
            Lc:
                int r2 = r3.arity
                if (r1 >= r2) goto L18
                java.lang.String r2 = "[]"
                r0.append(r2)
                int r1 = r1 + 1
                goto Lc
            L18:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                r1 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isArray() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isPrimitive() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isRecord() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Field is only used as a cache store and is implicitly recomputed", value = {"SE_TRANSIENT_FIELD_NOT_RESTORED"})
    public static class ForLoadedType extends net.bytebuddy.description.type.TypeDescription.AbstractBase implements java.io.Serializable {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final net.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher DISPATCHER = null;
        private static final java.util.Map<java.lang.Class<?>, net.bytebuddy.description.type.TypeDescription> TYPE_CACHE = null;
        private static final long serialVersionUID = 1;
        private transient /* synthetic */ net.bytebuddy.ClassFileVersion classFileVersion;
        private transient /* synthetic */ net.bytebuddy.description.annotation.AnnotationList declaredAnnotations;
        private transient /* synthetic */ net.bytebuddy.description.field.FieldList declaredFields;
        private transient /* synthetic */ net.bytebuddy.description.method.MethodList declaredMethods;
        private final java.lang.Class<?> type;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.Class")
        public interface Dispatcher {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedInterfaces")
            java.lang.reflect.AnnotatedElement[] getAnnotatedInterfaces(java.lang.Class<?> r1);

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedSuperclass")
            java.lang.reflect.AnnotatedElement getAnnotatedSuperclass(java.lang.Class<?> r1);

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getNestHost")
            java.lang.Class<?> getNestHost(java.lang.Class<?> r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getNestMembers")
            java.lang.Class<?>[] getNestMembers(java.lang.Class<?> r1);

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getPermittedSubclasses")
            java.lang.Class<?>[] getPermittedSubclasses(java.lang.Class<?> r1);

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getRecordComponents")
            java.lang.Object[] getRecordComponents(java.lang.Class<?> r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isNestmateOf")
            boolean isNestmateOf(java.lang.Class<?> r1, java.lang.Class<?> r2);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isRecord")
            boolean isRecord(java.lang.Class<?> r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isSealed")
            boolean isSealed(java.lang.Class<?> r1);
        }

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.description.type.TypeDescription.ForLoadedType.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.description.type.TypeDescription.ForLoadedType.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher> r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher) r0
                net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                net.bytebuddy.description.type.TypeDescription.ForLoadedType.TYPE_CACHE = r0
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<net.bytebuddy.dynamic.TargetType> r2 = net.bytebuddy.dynamic.TargetType.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.annotation.Annotation> r2 = java.lang.annotation.Annotation.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
                r1.<init>(r2)
                r0.put(r2, r1)
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
                r1.<init>(r2)
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Boolean.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Byte.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Short.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Character.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Integer.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Long.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Float.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Double.TYPE
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r2.<init>(r1)
                r0.put(r1, r2)
                return
        }

        public ForLoadedType(java.lang.Class<?> r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                return
        }

        public static /* synthetic */ net.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher access$300() {
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                return r0
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static java.lang.String getName(java.lang.Class<?> r2) {
                java.lang.String r2 = r2.getName()
                r0 = 47
                int r0 = r2.indexOf(r0)
                r1 = -1
                if (r0 != r1) goto Le
                goto L13
            Le:
                r1 = 0
                java.lang.String r2 = r2.substring(r1, r0)
            L13:
                return r2
        }

        public static net.bytebuddy.description.type.TypeDescription of(java.lang.Class<?> r1) {
                java.util.Map<java.lang.Class<?>, net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.TYPE_CACHE
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                if (r0 != 0) goto Lf
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r0 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                r0.<init>(r1)
            Lf:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeDescription.Generic asGenericType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String getCanonicalName() {
                r4 = this;
                java.lang.Class<?> r0 = r4.type
                java.lang.String r0 = r0.getCanonicalName()
                if (r0 != 0) goto Lb
                java.lang.String r0 = net.bytebuddy.description.NamedElement.NO_NAME
                return r0
            Lb:
                r1 = 47
                int r1 = r0.indexOf(r1)
                r2 = -1
                if (r1 != r2) goto L15
                return r0
            L15:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 0
                java.lang.String r0 = r0.substring(r3, r1)
                r2.<init>(r0)
                java.lang.Class<?> r0 = r4.type
            L21:
                boolean r1 = r0.isArray()
                if (r1 == 0) goto L31
                java.lang.String r1 = "[]"
                r2.append(r1)
                java.lang.Class r0 = r0.getComponentType()
                goto L21
            L31:
                java.lang.String r0 = r2.toString()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("classFileVersion")
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.ClassFileVersion getClassFileVersion() {
                r2 = this;
                net.bytebuddy.ClassFileVersion r0 = r2.classFileVersion
                r1 = 0
                if (r0 == 0) goto L6
                goto Lc
            L6:
                java.lang.Class<?> r0 = r2.type     // Catch: java.lang.Throwable -> Lc
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.of(r0)     // Catch: java.lang.Throwable -> Lc
            Lc:
                if (r1 != 0) goto L11
                net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
                goto L13
            L11:
                r2.classFileVersion = r1
            L13:
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getComponentType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                java.lang.Class r0 = r0.getComponentType()
                if (r0 != 0) goto Lb
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                goto Lf
            Lb:
                net.bytebuddy.description.type.TypeDescription r0 = of(r0)
            Lf:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("declaredAnnotations")
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList r0 = r2.declaredAnnotations
                if (r0 == 0) goto L6
                r0 = 0
                goto L11
            L6:
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                java.lang.Class<?> r1 = r2.type
                java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
                r0.<init>(r1)
            L11:
                if (r0 != 0) goto L16
                net.bytebuddy.description.annotation.AnnotationList r0 = r2.declaredAnnotations
                goto L18
            L16:
                r2.declaredAnnotations = r0
            L18:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("declaredFields")
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                r4 = this;
                net.bytebuddy.description.field.FieldList r0 = r4.declaredFields
                if (r0 == 0) goto L6
                r0 = 0
                goto L1d
            L6:
                net.bytebuddy.description.field.FieldList$ForLoadedFields r0 = new net.bytebuddy.description.field.FieldList$ForLoadedFields
                net.bytebuddy.utility.GraalImageCode r1 = net.bytebuddy.utility.GraalImageCode.getCurrent()
                java.lang.Class<?> r2 = r4.type
                java.lang.reflect.Field[] r2 = r2.getDeclaredFields()
                net.bytebuddy.utility.FieldComparator r3 = net.bytebuddy.utility.FieldComparator.INSTANCE
                java.lang.Object[] r1 = r1.sorted(r2, r3)
                java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1
                r0.<init>(r1)
            L1d:
                if (r0 != 0) goto L22
                net.bytebuddy.description.field.FieldList r0 = r4.declaredFields
                goto L24
            L22:
                r4.declaredFields = r0
            L24:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("declaredMethods")
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                r2 = this;
                net.bytebuddy.description.method.MethodList r0 = r2.declaredMethods
                if (r0 == 0) goto L6
                r0 = 0
                goto Ld
            L6:
                net.bytebuddy.description.method.MethodList$ForLoadedMethods r0 = new net.bytebuddy.description.method.MethodList$ForLoadedMethods
                java.lang.Class<?> r1 = r2.type
                r0.<init>(r1)
            Ld:
                if (r0 != 0) goto L12
                net.bytebuddy.description.method.MethodList r0 = r2.declaredMethods
                goto L14
            L12:
                r2.declaredMethods = r0
            L14:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                r2 = this;
                net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                java.lang.Class<?> r1 = r2.type
                java.lang.Class[] r1 = r1.getDeclaredClasses()
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                java.lang.Class r0 = r0.getDeclaringClass()
                if (r0 != 0) goto Lb
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                goto Lf
            Lb:
                net.bytebuddy.description.type.TypeDescription r0 = of(r0)
            Lf:
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithDescriptor
        public java.lang.String getDescriptor() {
                r5 = this;
                java.lang.Class<?> r0 = r5.type
                java.lang.String r0 = r0.getName()
                r1 = 47
                int r2 = r0.indexOf(r1)
                r3 = -1
                if (r2 != r3) goto L16
                java.lang.Class<?> r0 = r5.type
                java.lang.String r0 = net.bytebuddy.jar.asm.Type.getDescriptor(r0)
                goto L37
            L16:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "L"
                r3.append(r4)
                r4 = 0
                java.lang.String r0 = r0.substring(r4, r2)
                r2 = 46
                java.lang.String r0 = r0.replace(r2, r1)
                r3.append(r0)
                java.lang.String r0 = ";"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
            L37:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                r2 = this;
                java.lang.Class<?> r0 = r2.type
                java.lang.reflect.Method r0 = r0.getEnclosingMethod()
                java.lang.Class<?> r1 = r2.type
                java.lang.reflect.Constructor r1 = r1.getEnclosingConstructor()
                if (r0 == 0) goto L14
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r1 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r1.<init>(r0)
                return r1
            L14:
                if (r1 == 0) goto L1c
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                r0.<init>(r1)
                return r0
            L1c:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.description.method.MethodDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                java.lang.Class r0 = r0.getEnclosingClass()
                if (r0 != 0) goto Lb
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                goto Lf
            Lb:
                net.bytebuddy.description.type.TypeDescription r0 = of(r0)
            Lf:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                r2 = this;
                boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                if (r0 == 0) goto L19
                boolean r0 = r2.isArray()
                if (r0 == 0) goto Ld
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeDescription.ARRAY_INTERFACES
                goto L18
            Ld:
                net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
                java.lang.Class<?> r1 = r2.type
                java.lang.Class[] r1 = r1.getInterfaces()
                r0.<init>(r1)
            L18:
                return r0
            L19:
                boolean r0 = r2.isArray()
                if (r0 == 0) goto L22
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeDescription.ARRAY_INTERFACES
                goto L29
            L22:
                net.bytebuddy.description.type.TypeList$Generic$OfLoadedInterfaceTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$OfLoadedInterfaceTypes
                java.lang.Class<?> r1 = r2.type
                r0.<init>(r1)
            L29:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                java.lang.String r0 = getName(r0)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getNestHost() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r2.type
                java.lang.Class r0 = r0.getNestHost(r1)
                if (r0 != 0) goto Lc
                r0 = r2
                goto L10
            Lc:
                net.bytebuddy.description.type.TypeDescription r0 = of(r0)
            L10:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getNestMembers() {
                r4 = this;
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r4.type
                java.lang.Class[] r0 = r0.getNestMembers(r1)
                net.bytebuddy.description.type.TypeList$ForLoadedTypes r1 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                int r2 = r0.length
                if (r2 != 0) goto L15
                r0 = 1
                java.lang.Class[] r0 = new java.lang.Class[r0]
                r2 = 0
                java.lang.Class<?> r3 = r4.type
                r0[r2] = r3
            L15:
                r1.<init>(r0)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.PackageDescription getPackage() {
                r4 = this;
                java.lang.Class<?> r0 = r4.type
                boolean r0 = r0.isArray()
                if (r0 != 0) goto L3d
                java.lang.Class<?> r0 = r4.type
                boolean r0 = r0.isPrimitive()
                if (r0 == 0) goto L11
                goto L3d
            L11:
                java.lang.Class<?> r0 = r4.type
                java.lang.Package r0 = r0.getPackage()
                if (r0 != 0) goto L37
                java.lang.Class<?> r0 = r4.type
                java.lang.String r0 = r0.getName()
                r1 = 46
                int r1 = r0.lastIndexOf(r1)
                r2 = -1
                if (r1 != r2) goto L2b
                net.bytebuddy.description.type.PackageDescription r0 = net.bytebuddy.description.type.PackageDescription.DEFAULT
                goto L36
            L2b:
                net.bytebuddy.description.type.PackageDescription$Simple r2 = new net.bytebuddy.description.type.PackageDescription$Simple
                r3 = 0
                java.lang.String r0 = r0.substring(r3, r1)
                r2.<init>(r0)
                r0 = r2
            L36:
                return r0
            L37:
                net.bytebuddy.description.type.PackageDescription$ForLoadedPackage r1 = new net.bytebuddy.description.type.PackageDescription$ForLoadedPackage
                r1.<init>(r0)
                return r1
            L3d:
                net.bytebuddy.description.type.PackageDescription r0 = net.bytebuddy.description.type.PackageDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r2.type
                java.lang.Class[] r0 = r0.getPermittedSubclasses(r1)
                if (r0 != 0) goto L10
                net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                r0.<init>()
                goto L16
            L10:
                net.bytebuddy.description.type.TypeList$ForLoadedTypes r1 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                r1.<init>(r0)
                r0 = r1
            L16:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r2.type
                java.lang.Object[] r0 = r0.getRecordComponents(r1)
                if (r0 != 0) goto L10
                net.bytebuddy.description.type.RecordComponentList$Empty r0 = new net.bytebuddy.description.type.RecordComponentList$Empty
                r0.<init>()
                goto L16
            L10:
                net.bytebuddy.description.type.RecordComponentList$ForLoadedRecordComponents r1 = new net.bytebuddy.description.type.RecordComponentList$ForLoadedRecordComponents
                r1.<init>(r0)
                r0 = r1
            L16:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public java.lang.String getSimpleName() {
                r4 = this;
                java.lang.Class<?> r0 = r4.type
                java.lang.String r0 = r0.getSimpleName()
                r1 = 47
                int r1 = r0.indexOf(r1)
                r2 = -1
                if (r1 != r2) goto L10
                return r0
            L10:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 0
                java.lang.String r0 = r0.substring(r3, r1)
                r2.<init>(r0)
                java.lang.Class<?> r0 = r4.type
            L1c:
                boolean r1 = r0.isArray()
                if (r1 == 0) goto L2c
                java.lang.String r1 = "[]"
                r2.append(r1)
                java.lang.Class r0 = r0.getComponentType()
                goto L1c
            L2c:
                java.lang.String r0 = r2.toString()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                r1 = this;
                boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                if (r0 == 0) goto L1a
                java.lang.Class<?> r0 = r1.type
                java.lang.Class r0 = r0.getSuperclass()
                if (r0 != 0) goto Lf
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                goto L19
            Lf:
                java.lang.Class<?> r0 = r1.type
                java.lang.Class r0 = r0.getSuperclass()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
            L19:
                return r0
            L1a:
                java.lang.Class<?> r0 = r1.type
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.ForLoadedSuperClass.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                if (r0 == 0) goto La
                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                r0.<init>()
                return r0
            La:
                java.lang.Class<?> r0 = r1.type
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeList.Generic.ForLoadedTypes.OfTypeVariables.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.AbstractBase, net.bytebuddy.description.ModifierReviewable.ForTypeDefinition
        public boolean isAnnotation() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r0.isAnnotation()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r0.isAnonymousClass()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isArray() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r0.isArray()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isAssignableFrom(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r0.isAssignableFrom(r2)
                if (r0 != 0) goto L11
                boolean r2 = super.isAssignableFrom(r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isAssignableFrom(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                boolean r0 = r3 instanceof net.bytebuddy.description.type.TypeDescription.ForLoadedType
                if (r0 == 0) goto L11
                java.lang.Class<?> r0 = r2.type
                r1 = r3
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = (net.bytebuddy.description.type.TypeDescription.ForLoadedType) r1
                java.lang.Class<?> r1 = r1.type
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L17
            L11:
                boolean r3 = super.isAssignableFrom(r3)
                if (r3 == 0) goto L19
            L17:
                r3 = 1
                goto L1a
            L19:
                r3 = 0
            L1a:
                return r3
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isAssignableTo(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r2.isAssignableFrom(r0)
                if (r0 != 0) goto L11
                boolean r2 = super.isAssignableTo(r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isAssignableTo(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                boolean r0 = r3 instanceof net.bytebuddy.description.type.TypeDescription.ForLoadedType
                if (r0 == 0) goto L11
                r0 = r3
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r0 = (net.bytebuddy.description.type.TypeDescription.ForLoadedType) r0
                java.lang.Class<?> r0 = r0.type
                java.lang.Class<?> r1 = r2.type
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L17
            L11:
                boolean r3 = super.isAssignableTo(r3)
                if (r3 == 0) goto L19
            L17:
                r3 = 1
                goto L1a
            L19:
                r3 = 0
            L1a:
                return r3
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isInHierarchyWith(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r2.isAssignableFrom(r0)
                if (r0 != 0) goto L19
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r0.isAssignableFrom(r2)
                if (r0 != 0) goto L19
                boolean r2 = super.isInHierarchyWith(r2)
                if (r2 == 0) goto L17
                goto L19
            L17:
                r2 = 0
                goto L1a
            L19:
                r2 = 1
            L1a:
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isInHierarchyWith(net.bytebuddy.description.type.TypeDescription r4) {
                r3 = this;
                boolean r0 = r4 instanceof net.bytebuddy.description.type.TypeDescription.ForLoadedType
                if (r0 == 0) goto L1b
                r0 = r4
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r0 = (net.bytebuddy.description.type.TypeDescription.ForLoadedType) r0
                java.lang.Class<?> r1 = r0.type
                java.lang.Class<?> r2 = r3.type
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 != 0) goto L21
                java.lang.Class<?> r1 = r3.type
                java.lang.Class<?> r0 = r0.type
                boolean r0 = r1.isAssignableFrom(r0)
                if (r0 != 0) goto L21
            L1b:
                boolean r4 = super.isInHierarchyWith(r4)
                if (r4 == 0) goto L23
            L21:
                r4 = 1
                goto L24
            L23:
                r4 = 0
            L24:
                return r4
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r0.isLocalClass()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r0.isMemberClass()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isNestHost() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r2.type
                java.lang.Class r0 = r0.getNestHost(r1)
                if (r0 == 0) goto L11
                java.lang.Class<?> r1 = r2.type
                if (r0 != r1) goto Lf
                goto L11
            Lf:
                r0 = 0
                goto L12
            L11:
                r0 = 1
            L12:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isNestMateOf(java.lang.Class<?> r3) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r2.type
                boolean r0 = r0.isNestmateOf(r1, r3)
                if (r0 != 0) goto L17
                net.bytebuddy.description.type.TypeDescription r3 = of(r3)
                boolean r3 = super.isNestMateOf(r3)
                if (r3 == 0) goto L15
                goto L17
            L15:
                r3 = 0
                goto L18
            L17:
                r3 = 1
            L18:
                return r3
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isNestMateOf(net.bytebuddy.description.type.TypeDescription r4) {
                r3 = this;
                boolean r0 = r4 instanceof net.bytebuddy.description.type.TypeDescription.ForLoadedType
                if (r0 == 0) goto L13
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r3.type
                r2 = r4
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r2 = (net.bytebuddy.description.type.TypeDescription.ForLoadedType) r2
                java.lang.Class<?> r2 = r2.type
                boolean r0 = r0.isNestmateOf(r1, r2)
                if (r0 != 0) goto L19
            L13:
                boolean r4 = super.isNestMateOf(r4)
                if (r4 == 0) goto L1b
            L19:
                r4 = 1
                goto L1c
            L1b:
                r4 = 0
            L1c:
                return r4
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isPrimitive() {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r0 = r0.isPrimitive()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isRecord() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r2.type
                boolean r0 = r0.isRecord(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isSealed() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.DISPATCHER
                java.lang.Class<?> r1 = r2.type
                boolean r0 = r0.isSealed(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDefinition
        public boolean represents(java.lang.reflect.Type r2) {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                if (r2 == r0) goto Ld
                boolean r2 = super.represents(r2)
                if (r2 == 0) goto Lb
                goto Ld
            Lb:
                r2 = 0
                goto Le
            Ld:
                r2 = 1
            Le:
                return r2
        }
    }

    public static class ForPackageDescription extends net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType {
        private final net.bytebuddy.description.type.PackageDescription packageDescription;

        public ForPackageDescription(net.bytebuddy.description.type.PackageDescription r1) {
                r0 = this;
                r0.<init>()
                r0.packageDescription = r1
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.type.PackageDescription r0 = r1.packageDescription
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                r1 = this;
                net.bytebuddy.description.field.FieldList$Empty r0 = new net.bytebuddy.description.field.FieldList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                r1 = this;
                net.bytebuddy.description.method.MethodList$Empty r0 = new net.bytebuddy.description.method.MethodList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.description.method.MethodDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                r0 = 5632(0x1600, float:7.892E-42)
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.description.type.PackageDescription r1 = r2.packageDescription
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                java.lang.String r1 = "."
                r0.append(r1)
                java.lang.String r1 = "package-info"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getNestHost() {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getNestMembers() {
                r3 = this;
                net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                r1 = 1
                net.bytebuddy.description.type.TypeDescription[] r1 = new net.bytebuddy.description.type.TypeDescription[r1]
                r2 = 0
                r1[r2] = r3
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.PackageDescription getPackage() {
                r1 = this;
                net.bytebuddy.description.type.PackageDescription r0 = r1.packageDescription
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                r1 = this;
                net.bytebuddy.description.type.RecordComponentList$Empty r0 = new net.bytebuddy.description.type.RecordComponentList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                r1 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isRecord() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public interface Generic extends net.bytebuddy.description.type.TypeDefinition, net.bytebuddy.description.annotation.AnnotationSource {

        @java.lang.Deprecated
        public static final net.bytebuddy.description.type.TypeDescription.Generic ANNOTATION = null;

        @java.lang.Deprecated
        public static final net.bytebuddy.description.type.TypeDescription.Generic CLASS = null;

        @java.lang.Deprecated
        public static final net.bytebuddy.description.type.TypeDescription.Generic OBJECT = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        public static final net.bytebuddy.description.type.TypeDescription.Generic UNDEFINED = null;

        @java.lang.Deprecated
        public static final net.bytebuddy.description.type.TypeDescription.Generic VOID = null;

        public static abstract class AbstractBase extends net.bytebuddy.description.ModifierReviewable.AbstractBase implements net.bytebuddy.description.type.TypeDescription.Generic {
            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDescription.Generic asGenericType() {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeDescription.Generic asRawType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                    return r0
            }

            @Override // net.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    int r0 = r0.getModifiers()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean represents(java.lang.reflect.Type r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                    boolean r1 = r0.equals(r1)
                    return r1
            }
        }

        public interface AnnotationReader {

            public static abstract class Delegator implements net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader {
                private static final boolean ACCESS_CONTROLLER = false;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static abstract class Chained extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    protected final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;

                    public Chained(net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r1) {
                            r0 = this;
                            r0.<init>()
                            r0.annotationReader = r1
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
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r4.annotationReader
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$Chained r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained) r5
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r5 = r5.annotationReader
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
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.annotationReader
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r0 = r1.annotationReader
                            java.lang.reflect.AnnotatedElement r0 = r0.resolve()
                            java.lang.reflect.AnnotatedElement r0 = r1.resolve(r0)
                            return r0
                    }

                    public abstract java.lang.reflect.AnnotatedElement resolve(java.lang.reflect.AnnotatedElement r1);
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public static class ForLoadedExecutableExceptionType extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    protected static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableExceptionType.Dispatcher DISPATCHER = null;
                    private final java.lang.reflect.AccessibleObject executable;
                    private final int index;

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.Executable")
                    public interface Dispatcher {
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedExceptionTypes")
                        java.lang.reflect.AnnotatedElement[] getAnnotatedExceptionTypes(java.lang.Object r1);
                    }

                    static {
                            java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType$Dispatcher> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableExceptionType.Dispatcher.class
                            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                            java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableExceptionType.Dispatcher) r0
                            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableExceptionType.DISPATCHER = r0
                            return
                    }

                    public ForLoadedExecutableExceptionType(java.lang.reflect.AccessibleObject r1, int r2) {
                            r0 = this;
                            r0.<init>()
                            r0.executable = r1
                            r0.index = r2
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
                            int r2 = r4.index
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableExceptionType) r5
                            int r3 = r5.index
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            java.lang.reflect.AccessibleObject r2 = r4.executable
                            java.lang.reflect.AccessibleObject r5 = r5.executable
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L27
                            return r1
                        L27:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.reflect.AccessibleObject r1 = r2.executable
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            int r1 = r2.index
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableExceptionType.DISPATCHER
                            java.lang.reflect.AccessibleObject r1 = r2.executable
                            java.lang.reflect.AnnotatedElement[] r0 = r0.getAnnotatedExceptionTypes(r1)
                            int r1 = r0.length
                            if (r1 != 0) goto Le
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                            goto L12
                        Le:
                            int r1 = r2.index
                            r0 = r0[r1]
                        L12:
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public static class ForLoadedExecutableParameterType extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    protected static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableParameterType.Dispatcher DISPATCHER = null;
                    private final java.lang.reflect.AccessibleObject executable;
                    private final int index;

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.Executable")
                    public interface Dispatcher {
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedParameterTypes")
                        java.lang.reflect.AnnotatedElement[] getAnnotatedParameterTypes(java.lang.Object r1);
                    }

                    static {
                            java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType$Dispatcher> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableParameterType.Dispatcher.class
                            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                            java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableParameterType.Dispatcher) r0
                            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableParameterType.DISPATCHER = r0
                            return
                    }

                    public ForLoadedExecutableParameterType(java.lang.reflect.AccessibleObject r1, int r2) {
                            r0 = this;
                            r0.<init>()
                            r0.executable = r1
                            r0.index = r2
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
                            int r2 = r4.index
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableParameterType) r5
                            int r3 = r5.index
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            java.lang.reflect.AccessibleObject r2 = r4.executable
                            java.lang.reflect.AccessibleObject r5 = r5.executable
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L27
                            return r1
                        L27:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.reflect.AccessibleObject r1 = r2.executable
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            int r1 = r2.index
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedExecutableParameterType.DISPATCHER
                            java.lang.reflect.AccessibleObject r1 = r2.executable
                            java.lang.reflect.AnnotatedElement[] r0 = r0.getAnnotatedParameterTypes(r1)
                            int r1 = r0.length
                            if (r1 != 0) goto Le
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                            goto L12
                        Le:
                            int r1 = r2.index
                            r0 = r0[r1]
                        L12:
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public static class ForLoadedField extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    protected static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedField.Dispatcher DISPATCHER = null;
                    private final java.lang.reflect.Field field;

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.Field")
                    public interface Dispatcher {
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
                        @net.bytebuddy.utility.nullability.MaybeNull
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedType")
                        java.lang.reflect.AnnotatedElement getAnnotatedType(java.lang.reflect.Field r1);
                    }

                    static {
                            java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedField$Dispatcher> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedField.Dispatcher.class
                            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                            java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedField$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedField.Dispatcher) r0
                            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedField.DISPATCHER = r0
                            return
                    }

                    public ForLoadedField(java.lang.reflect.Field r1) {
                            r0 = this;
                            r0.<init>()
                            r0.field = r1
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
                            java.lang.reflect.Field r2 = r4.field
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedField r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedField) r5
                            java.lang.reflect.Field r5 = r5.field
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
                            java.lang.reflect.Field r1 = r2.field
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedField$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedField.DISPATCHER
                            java.lang.reflect.Field r1 = r2.field
                            java.lang.reflect.AnnotatedElement r0 = r0.getAnnotatedType(r1)
                            if (r0 != 0) goto Lc
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        Lc:
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public static class ForLoadedInterface extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    private final int index;
                    private final java.lang.Class<?> type;

                    public ForLoadedInterface(java.lang.Class<?> r1, int r2) {
                            r0 = this;
                            r0.<init>()
                            r0.type = r1
                            r0.index = r2
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
                            int r2 = r4.index
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedInterface r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedInterface) r5
                            int r3 = r5.index
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            java.lang.Class<?> r2 = r4.type
                            java.lang.Class<?> r5 = r5.type
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L27
                            return r1
                        L27:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.Class<?> r1 = r2.type
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            int r1 = r2.index
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.access$300()
                            java.lang.Class<?> r1 = r2.type
                            java.lang.reflect.AnnotatedElement[] r0 = r0.getAnnotatedInterfaces(r1)
                            int r1 = r0.length
                            if (r1 != 0) goto L10
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                            goto L14
                        L10:
                            int r1 = r2.index
                            r0 = r0[r1]
                        L14:
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public static class ForLoadedMethodReturnType extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    protected static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedMethodReturnType.Dispatcher DISPATCHER = null;
                    private final java.lang.reflect.Method method;

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.Method")
                    public interface Dispatcher {
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
                        @net.bytebuddy.utility.nullability.MaybeNull
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedReturnType")
                        java.lang.reflect.AnnotatedElement getAnnotatedReturnType(java.lang.reflect.Method r1);
                    }

                    static {
                            java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedMethodReturnType$Dispatcher> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedMethodReturnType.Dispatcher.class
                            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                            java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedMethodReturnType$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedMethodReturnType.Dispatcher) r0
                            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedMethodReturnType.DISPATCHER = r0
                            return
                    }

                    public ForLoadedMethodReturnType(java.lang.reflect.Method r1) {
                            r0 = this;
                            r0.<init>()
                            r0.method = r1
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
                            java.lang.reflect.Method r2 = r4.method
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedMethodReturnType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedMethodReturnType) r5
                            java.lang.reflect.Method r5 = r5.method
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
                            java.lang.reflect.Method r1 = r2.method
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedMethodReturnType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedMethodReturnType.DISPATCHER
                            java.lang.reflect.Method r1 = r2.method
                            java.lang.reflect.AnnotatedElement r0 = r0.getAnnotatedReturnType(r1)
                            if (r0 != 0) goto Lc
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        Lc:
                            return r0
                    }
                }

                public static class ForLoadedRecordComponent extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    private final java.lang.Object recordComponent;

                    public ForLoadedRecordComponent(java.lang.Object r1) {
                            r0 = this;
                            r0.<init>()
                            r0.recordComponent = r1
                            return
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT
                            java.lang.Object r1 = r2.recordComponent
                            java.lang.reflect.AnnotatedElement r0 = r0.getAnnotatedType(r1)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public static class ForLoadedSuperClass extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    private final java.lang.Class<?> type;

                    public ForLoadedSuperClass(java.lang.Class<?> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.type = r1
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
                            java.lang.Class<?> r2 = r4.type
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedSuperClass r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedSuperClass) r5
                            java.lang.Class<?> r5 = r5.type
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
                            java.lang.Class<?> r1 = r2.type
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.access$300()
                            java.lang.Class<?> r1 = r2.type
                            java.lang.reflect.AnnotatedElement r0 = r0.getAnnotatedSuperclass(r1)
                            if (r0 != 0) goto Le
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        Le:
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForLoadedTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    private final java.lang.reflect.TypeVariable<?> typeVariable;

                    public ForLoadedTypeVariable(java.lang.reflect.TypeVariable<?> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.typeVariable = r1
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
                            java.lang.reflect.TypeVariable<?> r2 = r4.typeVariable
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedTypeVariable r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ForLoadedTypeVariable) r5
                            java.lang.reflect.TypeVariable<?> r5 = r5.typeVariable
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
                            java.lang.reflect.TypeVariable<?> r1 = r2.typeVariable
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofTypeVariableBoundType(int r3) {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$OfFormalTypeVariable r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$OfFormalTypeVariable
                            java.lang.reflect.TypeVariable<?> r1 = r2.typeVariable
                            r0.<init>(r1, r3)
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Cast is required for JVMs before Java 8.", value = {"BC_VACUOUS_INSTANCEOF"})
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            java.lang.reflect.TypeVariable<?> r0 = r2.typeVariable
                            boolean r1 = r0 instanceof java.lang.reflect.AnnotatedElement
                            if (r1 == 0) goto L7
                            goto L9
                        L7:
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        L9:
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Simple extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    private final java.lang.reflect.AnnotatedElement annotatedElement;

                    public Simple(java.lang.reflect.AnnotatedElement r1) {
                            r0 = this;
                            r0.<init>()
                            r0.annotatedElement = r1
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
                            java.lang.reflect.AnnotatedElement r2 = r4.annotatedElement
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$Simple r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Simple) r5
                            java.lang.reflect.AnnotatedElement r5 = r5.annotatedElement
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
                            java.lang.reflect.AnnotatedElement r1 = r2.annotatedElement
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r1 = this;
                            java.lang.reflect.AnnotatedElement r0 = r1.annotatedElement
                            return r0
                    }
                }

                static {
                        r0 = 0
                        java.lang.String r1 = "java.security.AccessController"
                        r2 = 0
                        java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        java.lang.String r1 = "net.bytebuddy.securitymanager"
                        java.lang.String r2 = "true"
                        java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        goto L19
                    L16:
                        r0 = 1
                    L17:
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ACCESS_CONTROLLER = r0
                    L19:
                        return
                }

                public Delegator() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @net.bytebuddy.build.AccessControllerPlugin.Enhance
                public static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                        boolean r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.ACCESS_CONTROLLER
                        if (r0 == 0) goto L9
                        java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                        return r1
                    L9:
                        java.lang.Object r1 = r1.run()
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.annotation.AnnotationList asList() {
                        r2 = this;
                        net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                        java.lang.reflect.AnnotatedElement r1 = r2.resolve()
                        java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForComponentType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForComponentType
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofOuterClass() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForOwnerType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForOwnerType
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofOwnerType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForOwnerType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForOwnerType
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofTypeArgument(int r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeArgument r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeArgument
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofTypeVariableBoundType(int r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofWildcardLowerBoundType(int r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardLowerBoundType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardLowerBoundType
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofWildcardUpperBoundType(int r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardUpperBoundType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardUpperBoundType
                        r0.<init>(r1, r2)
                        return r0
                }
            }

            public static class ForComponentType extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained {
                private static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForComponentType.AnnotatedParameterizedType ANNOTATED_PARAMETERIZED_TYPE = null;

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.AnnotatedArrayType")
                public interface AnnotatedParameterizedType {
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedGenericComponentType")
                    java.lang.reflect.AnnotatedElement getAnnotatedGenericComponentType(java.lang.reflect.AnnotatedElement r1);

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
                    boolean isInstance(java.lang.reflect.AnnotatedElement r1);
                }

                static {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForComponentType.AnnotatedParameterizedType.class
                        java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                        java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForComponentType.AnnotatedParameterizedType) r0
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForComponentType.ANNOTATED_PARAMETERIZED_TYPE = r0
                        return
                }

                public ForComponentType(net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r1) {
                        r0 = this;
                        r0.<init>(r1)
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ java.lang.reflect.AnnotatedElement resolve() {
                        r1 = this;
                        java.lang.reflect.AnnotatedElement r0 = super.resolve()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public java.lang.reflect.AnnotatedElement resolve(java.lang.reflect.AnnotatedElement r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForComponentType.ANNOTATED_PARAMETERIZED_TYPE
                        boolean r1 = r0.isInstance(r3)
                        if (r1 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                    Lb:
                        java.lang.reflect.AnnotatedElement r3 = r0.getAnnotatedGenericComponentType(r3)     // Catch: java.lang.ClassCastException -> L10
                        return r3
                    L10:
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                }
            }

            public static class ForOwnerType extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained {
                private static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForOwnerType.AnnotatedType ANNOTATED_TYPE = null;

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.AnnotatedType")
                public interface AnnotatedType {
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
                    @net.bytebuddy.utility.nullability.MaybeNull
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedOwnerType")
                    java.lang.reflect.AnnotatedElement getAnnotatedOwnerType(java.lang.reflect.AnnotatedElement r1);
                }

                static {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForOwnerType$AnnotatedType> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForOwnerType.AnnotatedType.class
                        java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                        java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForOwnerType$AnnotatedType r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForOwnerType.AnnotatedType) r0
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForOwnerType.ANNOTATED_TYPE = r0
                        return
                }

                public ForOwnerType(net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r1) {
                        r0 = this;
                        r0.<init>(r1)
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ java.lang.reflect.AnnotatedElement resolve() {
                        r1 = this;
                        java.lang.reflect.AnnotatedElement r0 = super.resolve()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public java.lang.reflect.AnnotatedElement resolve(java.lang.reflect.AnnotatedElement r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForOwnerType$AnnotatedType r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForOwnerType.ANNOTATED_TYPE     // Catch: java.lang.ClassCastException -> Lb
                        java.lang.reflect.AnnotatedElement r2 = r0.getAnnotatedOwnerType(r2)     // Catch: java.lang.ClassCastException -> Lb
                        if (r2 != 0) goto La
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r2 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE     // Catch: java.lang.ClassCastException -> Lb
                    La:
                        return r2
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r2 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r2
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForTypeArgument extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained {
                private static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeArgument.AnnotatedParameterizedType ANNOTATED_PARAMETERIZED_TYPE = null;
                private final int index;

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.AnnotatedParameterizedType")
                public interface AnnotatedParameterizedType {
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedActualTypeArguments")
                    java.lang.reflect.AnnotatedElement[] getAnnotatedActualTypeArguments(java.lang.reflect.AnnotatedElement r1);

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
                    boolean isInstance(java.lang.reflect.AnnotatedElement r1);
                }

                static {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeArgument$AnnotatedParameterizedType> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeArgument.AnnotatedParameterizedType.class
                        java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                        java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeArgument$AnnotatedParameterizedType r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeArgument.AnnotatedParameterizedType) r0
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeArgument.ANNOTATED_PARAMETERIZED_TYPE = r0
                        return
                }

                public ForTypeArgument(net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r1, int r2) {
                        r0 = this;
                        r0.<init>(r1)
                        r0.index = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
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
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeArgument r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeArgument) r5
                        int r5 = r5.index
                        if (r2 == r5) goto L23
                        return r1
                    L23:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        int r1 = r2.index
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ java.lang.reflect.AnnotatedElement resolve() {
                        r1 = this;
                        java.lang.reflect.AnnotatedElement r0 = super.resolve()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public java.lang.reflect.AnnotatedElement resolve(java.lang.reflect.AnnotatedElement r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeArgument$AnnotatedParameterizedType r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeArgument.ANNOTATED_PARAMETERIZED_TYPE
                        boolean r1 = r0.isInstance(r3)
                        if (r1 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                    Lb:
                        java.lang.reflect.AnnotatedElement[] r3 = r0.getAnnotatedActualTypeArguments(r3)     // Catch: java.lang.ClassCastException -> L14
                        int r0 = r2.index     // Catch: java.lang.ClassCastException -> L14
                        r3 = r3[r0]     // Catch: java.lang.ClassCastException -> L14
                        return r3
                    L14:
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForTypeVariableBoundType extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained {
                private static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.AnnotatedTypeVariable ANNOTATED_TYPE_VARIABLE = null;
                private final int index;

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.AnnotatedTypeVariable")
                public interface AnnotatedTypeVariable {
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedBounds")
                    java.lang.reflect.AnnotatedElement[] getAnnotatedBounds(java.lang.reflect.AnnotatedElement r1);

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
                    boolean isInstance(java.lang.reflect.AnnotatedElement r1);
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class OfFormalTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator {
                    private static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.OfFormalTypeVariable.FormalTypeVariable TYPE_VARIABLE = null;
                    private final int index;
                    private final java.lang.reflect.TypeVariable<?> typeVariable;

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.TypeVariable")
                    public interface FormalTypeVariable {
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
                        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedBounds")
                        java.lang.reflect.AnnotatedElement[] getAnnotatedBounds(java.lang.Object r1);
                    }

                    static {
                            java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$OfFormalTypeVariable$FormalTypeVariable> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.OfFormalTypeVariable.FormalTypeVariable.class
                            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                            java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$OfFormalTypeVariable$FormalTypeVariable r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.OfFormalTypeVariable.FormalTypeVariable) r0
                            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.OfFormalTypeVariable.TYPE_VARIABLE = r0
                            return
                    }

                    public OfFormalTypeVariable(java.lang.reflect.TypeVariable<?> r1, int r2) {
                            r0 = this;
                            r0.<init>()
                            r0.typeVariable = r1
                            r0.index = r2
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
                            int r2 = r4.index
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$OfFormalTypeVariable r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.OfFormalTypeVariable) r5
                            int r3 = r5.index
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            java.lang.reflect.TypeVariable<?> r2 = r4.typeVariable
                            java.lang.reflect.TypeVariable<?> r5 = r5.typeVariable
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L27
                            return r1
                        L27:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.reflect.TypeVariable<?> r1 = r2.typeVariable
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            int r1 = r2.index
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public java.lang.reflect.AnnotatedElement resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$OfFormalTypeVariable$FormalTypeVariable r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.OfFormalTypeVariable.TYPE_VARIABLE     // Catch: java.lang.ClassCastException -> L13
                            java.lang.reflect.TypeVariable<?> r1 = r2.typeVariable     // Catch: java.lang.ClassCastException -> L13
                            java.lang.reflect.AnnotatedElement[] r0 = r0.getAnnotatedBounds(r1)     // Catch: java.lang.ClassCastException -> L13
                            int r1 = r0.length     // Catch: java.lang.ClassCastException -> L13
                            if (r1 != 0) goto Le
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE     // Catch: java.lang.ClassCastException -> L13
                            goto L12
                        Le:
                            int r1 = r2.index     // Catch: java.lang.ClassCastException -> L13
                            r0 = r0[r1]     // Catch: java.lang.ClassCastException -> L13
                        L12:
                            return r0
                        L13:
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                            return r0
                    }
                }

                static {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$AnnotatedTypeVariable> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.AnnotatedTypeVariable.class
                        java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                        java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$AnnotatedTypeVariable r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.AnnotatedTypeVariable) r0
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.ANNOTATED_TYPE_VARIABLE = r0
                        return
                }

                public ForTypeVariableBoundType(net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r1, int r2) {
                        r0 = this;
                        r0.<init>(r1)
                        r0.index = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
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
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType) r5
                        int r5 = r5.index
                        if (r2 == r5) goto L23
                        return r1
                    L23:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        int r1 = r2.index
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ java.lang.reflect.AnnotatedElement resolve() {
                        r1 = this;
                        java.lang.reflect.AnnotatedElement r0 = super.resolve()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public java.lang.reflect.AnnotatedElement resolve(java.lang.reflect.AnnotatedElement r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$AnnotatedTypeVariable r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForTypeVariableBoundType.ANNOTATED_TYPE_VARIABLE
                        boolean r1 = r0.isInstance(r3)
                        if (r1 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                    Lb:
                        java.lang.reflect.AnnotatedElement[] r3 = r0.getAnnotatedBounds(r3)     // Catch: java.lang.ClassCastException -> L14
                        int r0 = r2.index     // Catch: java.lang.ClassCastException -> L14
                        r3 = r3[r0]     // Catch: java.lang.ClassCastException -> L14
                        return r3
                    L14:
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForWildcardLowerBoundType extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained {
                private static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardLowerBoundType.AnnotatedWildcardType ANNOTATED_WILDCARD_TYPE = null;
                private final int index;

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.AnnotatedWildcardType")
                public interface AnnotatedWildcardType {
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedLowerBounds")
                    java.lang.reflect.AnnotatedElement[] getAnnotatedLowerBounds(java.lang.reflect.AnnotatedElement r1);

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
                    boolean isInstance(java.lang.reflect.AnnotatedElement r1);
                }

                static {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardLowerBoundType$AnnotatedWildcardType> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardLowerBoundType.AnnotatedWildcardType.class
                        java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                        java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardLowerBoundType$AnnotatedWildcardType r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardLowerBoundType.AnnotatedWildcardType) r0
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardLowerBoundType.ANNOTATED_WILDCARD_TYPE = r0
                        return
                }

                public ForWildcardLowerBoundType(net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r1, int r2) {
                        r0 = this;
                        r0.<init>(r1)
                        r0.index = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
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
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardLowerBoundType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardLowerBoundType) r5
                        int r5 = r5.index
                        if (r2 == r5) goto L23
                        return r1
                    L23:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        int r1 = r2.index
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ java.lang.reflect.AnnotatedElement resolve() {
                        r1 = this;
                        java.lang.reflect.AnnotatedElement r0 = super.resolve()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public java.lang.reflect.AnnotatedElement resolve(java.lang.reflect.AnnotatedElement r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardLowerBoundType$AnnotatedWildcardType r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardLowerBoundType.ANNOTATED_WILDCARD_TYPE
                        boolean r1 = r0.isInstance(r3)
                        if (r1 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                    Lb:
                        java.lang.reflect.AnnotatedElement[] r3 = r0.getAnnotatedLowerBounds(r3)     // Catch: java.lang.ClassCastException -> L14
                        int r0 = r2.index     // Catch: java.lang.ClassCastException -> L14
                        r3 = r3[r0]     // Catch: java.lang.ClassCastException -> L14
                        return r3
                    L14:
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForWildcardUpperBoundType extends net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained {
                private static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardUpperBoundType.AnnotatedWildcardType ANNOTATED_WILDCARD_TYPE = null;
                private final int index;

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.AnnotatedWildcardType")
                public interface AnnotatedWildcardType {
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedUpperBounds")
                    java.lang.reflect.AnnotatedElement[] getAnnotatedUpperBounds(java.lang.reflect.AnnotatedElement r1);

                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
                    boolean isInstance(java.lang.reflect.AnnotatedElement r1);
                }

                static {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardUpperBoundType$AnnotatedWildcardType> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardUpperBoundType.AnnotatedWildcardType.class
                        java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                        java.lang.Object r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.doPrivileged(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardUpperBoundType$AnnotatedWildcardType r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardUpperBoundType.AnnotatedWildcardType) r0
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardUpperBoundType.ANNOTATED_WILDCARD_TYPE = r0
                        return
                }

                public ForWildcardUpperBoundType(net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r1, int r2) {
                        r0 = this;
                        r0.<init>(r1)
                        r0.index = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
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
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardUpperBoundType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardUpperBoundType) r5
                        int r5 = r5.index
                        if (r2 == r5) goto L23
                        return r1
                    L23:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        int r1 = r2.index
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ java.lang.reflect.AnnotatedElement resolve() {
                        r1 = this;
                        java.lang.reflect.AnnotatedElement r0 = super.resolve()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public java.lang.reflect.AnnotatedElement resolve(java.lang.reflect.AnnotatedElement r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForWildcardUpperBoundType$AnnotatedWildcardType r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.ForWildcardUpperBoundType.ANNOTATED_WILDCARD_TYPE
                        boolean r1 = r0.isInstance(r3)
                        if (r1 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                    Lb:
                        java.lang.reflect.AnnotatedElement[] r3 = r0.getAnnotatedUpperBounds(r3)     // Catch: java.lang.ClassCastException -> L1a
                        int r0 = r3.length     // Catch: java.lang.ClassCastException -> L1a
                        if (r0 != 0) goto L15
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE     // Catch: java.lang.ClassCastException -> L1a
                        goto L19
                    L15:
                        int r0 = r2.index     // Catch: java.lang.ClassCastException -> L1a
                        r3 = r3[r0]     // Catch: java.lang.ClassCastException -> L1a
                    L19:
                        return r3
                    L1a:
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r3 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        return r3
                }
            }

            public enum NoOp extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp> implements net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader, java.lang.reflect.AnnotatedElement {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp INSTANCE = null;

                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp[] r0 = new net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp[]{r0}
                        net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.$VALUES = r0
                        return
                }

                NoOp(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp> r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r1 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.annotation.AnnotationList asList() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                        return r0
                }

                @Override // java.lang.reflect.AnnotatedElement
                public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r3) {
                        r2 = this;
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Cannot resolve annotations for no-op reader: "
                        r0.append(r1)
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        r3.<init>(r0)
                        throw r3
                }

                @Override // java.lang.reflect.AnnotatedElement
                public java.lang.annotation.Annotation[] getAnnotations() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot resolve annotations for no-op reader: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // java.lang.reflect.AnnotatedElement
                public java.lang.annotation.Annotation[] getDeclaredAnnotations() {
                        r1 = this;
                        r0 = 0
                        java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
                        return r0
                }

                @Override // java.lang.reflect.AnnotatedElement
                public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> r3) {
                        r2 = this;
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Cannot resolve annotations for no-op reader: "
                        r0.append(r1)
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        r3.<init>(r0)
                        throw r3
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofComponentType() {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofOuterClass() {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofOwnerType() {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofTypeArgument(int r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofTypeVariableBoundType(int r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofWildcardLowerBoundType(int r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofWildcardUpperBoundType(int r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public java.lang.reflect.AnnotatedElement resolve() {
                        r0 = this;
                        return r0
                }
            }

            net.bytebuddy.description.annotation.AnnotationList asList();

            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofComponentType();

            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofOuterClass();

            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofOwnerType();

            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofTypeArgument(int r1);

            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofTypeVariableBoundType(int r1);

            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofWildcardLowerBoundType(int r1);

            net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader ofWildcardUpperBoundType(int r1);

            java.lang.reflect.AnnotatedElement resolve();
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static abstract class Builder {

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final java.lang.reflect.Type UNDEFINED = null;
            protected final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfGenericArrayType extends net.bytebuddy.description.type.TypeDescription.Generic.Builder {
                private final net.bytebuddy.description.type.TypeDescription.Generic componentType;

                public OfGenericArrayType(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        java.util.List r0 = java.util.Collections.emptyList()
                        r1.<init>(r2, r0)
                        return
                }

                public OfGenericArrayType(net.bytebuddy.description.type.TypeDescription.Generic r1, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                        r0 = this;
                        r0.<init>(r2)
                        r0.componentType = r1
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder doAnnotate(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfGenericArrayType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfGenericArrayType
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.componentType
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r3.annotations
                        java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r2, r4)
                        r0.<init>(r1, r4)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public net.bytebuddy.description.type.TypeDescription.Generic doBuild() {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r4.componentType
                        net.bytebuddy.description.annotation.AnnotationSource$Explicit r2 = new net.bytebuddy.description.annotation.AnnotationSource$Explicit
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3 = r4.annotations
                        r2.<init>(r3)
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
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
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.componentType
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfGenericArrayType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder.OfGenericArrayType) r5
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.componentType
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L27
                        return r1
                    L27:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.componentType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfNonGenericType extends net.bytebuddy.description.type.TypeDescription.Generic.Builder {

                @net.bytebuddy.utility.nullability.MaybeNull
                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final net.bytebuddy.description.type.TypeDescription.Generic ownerType;
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public OfNonGenericType(net.bytebuddy.description.type.TypeDescription r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
                        r1.<init>(r2, r0)
                        return
                }

                public OfNonGenericType(net.bytebuddy.description.type.TypeDescription r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r1 = this;
                        java.util.List r0 = java.util.Collections.emptyList()
                        r1.<init>(r2, r3, r0)
                        return
                }

                public OfNonGenericType(net.bytebuddy.description.type.TypeDescription r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r2, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
                        r0 = this;
                        r0.<init>(r3)
                        r0.ownerType = r2
                        r0.typeDescription = r1
                        return
                }

                public OfNonGenericType(net.bytebuddy.description.type.TypeDescription r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r2) {
                        r0 = this;
                        if (r2 != 0) goto L5
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L9
                    L5:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                    L9:
                        r0.<init>(r1, r2)
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder doAnnotate(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5) {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType
                        net.bytebuddy.description.type.TypeDescription r1 = r4.typeDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.ownerType
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3 = r4.annotations
                        java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r3, r5)
                        r0.<init>(r1, r2, r5)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public net.bytebuddy.description.type.TypeDescription.Generic doBuild() {
                        r5 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r5.typeDescription
                        java.lang.Class r1 = java.lang.Void.TYPE
                        boolean r0 = r0.represents(r1)
                        if (r0 == 0) goto L1b
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r0 = r5.annotations
                        boolean r0 = r0.isEmpty()
                        if (r0 == 0) goto L13
                        goto L1b
                    L13:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.String r1 = "The void non-type cannot be annotated"
                        r0.<init>(r1)
                        throw r0
                    L1b:
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                        net.bytebuddy.description.type.TypeDescription r1 = r5.typeDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r5.ownerType
                        net.bytebuddy.description.annotation.AnnotationSource$Explicit r3 = new net.bytebuddy.description.annotation.AnnotationSource$Explicit
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4 = r5.annotations
                        r3.<init>(r4)
                        r0.<init>(r1, r2, r3)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder.OfNonGenericType) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.ownerType
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.ownerType
                        if (r5 == 0) goto L36
                        if (r2 == 0) goto L38
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L39
                        return r1
                    L36:
                        if (r2 == 0) goto L39
                    L38:
                        return r1
                    L39:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.ownerType
                        if (r1 == 0) goto L18
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                    L18:
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfParameterizedType extends net.bytebuddy.description.type.TypeDescription.Generic.Builder {

                @net.bytebuddy.utility.nullability.MaybeNull
                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final net.bytebuddy.description.type.TypeDescription.Generic ownerType;
                private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> parameterTypes;
                private final net.bytebuddy.description.type.TypeDescription rawType;

                public OfParameterizedType(net.bytebuddy.description.type.TypeDescription r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r3, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
                        r1 = this;
                        java.util.List r0 = java.util.Collections.emptyList()
                        r1.<init>(r2, r3, r4, r0)
                        return
                }

                public OfParameterizedType(net.bytebuddy.description.type.TypeDescription r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r2, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                        r0 = this;
                        r0.<init>(r4)
                        r0.rawType = r1
                        r0.ownerType = r2
                        r0.parameterTypes = r3
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder doAnnotate(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r6) {
                        r5 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfParameterizedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfParameterizedType
                        net.bytebuddy.description.type.TypeDescription r1 = r5.rawType
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r5.ownerType
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r3 = r5.parameterTypes
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4 = r5.annotations
                        java.util.List r6 = net.bytebuddy.utility.CompoundList.of(r4, r6)
                        r0.<init>(r1, r2, r3, r6)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public net.bytebuddy.description.type.TypeDescription.Generic doBuild() {
                        r6 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$Latent
                        net.bytebuddy.description.type.TypeDescription r1 = r6.rawType
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r6.ownerType
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r3 = r6.parameterTypes
                        net.bytebuddy.description.annotation.AnnotationSource$Explicit r4 = new net.bytebuddy.description.annotation.AnnotationSource$Explicit
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5 = r6.annotations
                        r4.<init>(r5)
                        r0.<init>(r1, r2, r3, r4)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.rawType
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfParameterizedType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder.OfParameterizedType) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.rawType
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.ownerType
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.ownerType
                        if (r3 == 0) goto L36
                        if (r2 == 0) goto L38
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L39
                        return r1
                    L36:
                        if (r2 == 0) goto L39
                    L38:
                        return r1
                    L39:
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r4.parameterTypes
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r5 = r5.parameterTypes
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L44
                        return r1
                    L44:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription r1 = r2.rawType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.ownerType
                        if (r1 == 0) goto L18
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                    L18:
                        int r0 = r0 * 31
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.parameterTypes
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.Builder {
                private final java.lang.String symbol;

                public OfTypeVariable(java.lang.String r2) {
                        r1 = this;
                        java.util.List r0 = java.util.Collections.emptyList()
                        r1.<init>(r2, r0)
                        return
                }

                public OfTypeVariable(java.lang.String r1, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                        r0 = this;
                        r0.<init>(r2)
                        r0.symbol = r1
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder doAnnotate(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfTypeVariable r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfTypeVariable
                        java.lang.String r1 = r3.symbol
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r3.annotations
                        java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r2, r4)
                        r0.<init>(r1, r4)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public net.bytebuddy.description.type.TypeDescription.Generic doBuild() {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$Symbolic r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$Symbolic
                        java.lang.String r1 = r4.symbol
                        net.bytebuddy.description.annotation.AnnotationSource$Explicit r2 = new net.bytebuddy.description.annotation.AnnotationSource$Explicit
                        java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3 = r4.annotations
                        r2.<init>(r3)
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
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
                        java.lang.String r2 = r4.symbol
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfTypeVariable r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder.OfTypeVariable) r5
                        java.lang.String r5 = r5.symbol
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L27
                        return r1
                    L27:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.symbol
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public enum Visitor extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic.Builder> {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor INSTANCE = null;

                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$Visitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$Visitor
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor.INSTANCE = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$Visitor[] r0 = new net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor[]{r0}
                        net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor.$VALUES = r0
                        return
                }

                Visitor(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Builder$Visitor> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$Visitor r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$Visitor[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$Visitor[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Builder onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfGenericArrayType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfGenericArrayType
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getComponentType()
                        net.bytebuddy.description.annotation.AnnotationList r3 = r3.getDeclaredAnnotations()
                        r0.<init>(r1, r3)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Builder onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        boolean r0 = r4.isArray()
                        if (r0 == 0) goto L1d
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.getComponentType()
                        java.lang.Object r0 = r0.accept(r3)
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder) r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder r0 = r0.asArray()
                        net.bytebuddy.description.annotation.AnnotationList r4 = r4.getDeclaredAnnotations()
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder r4 = r0.annotate(r4)
                        goto L2f
                    L1d:
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType
                        net.bytebuddy.description.type.TypeDescription r1 = r4.asErasure()
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.getOwnerType()
                        net.bytebuddy.description.annotation.AnnotationList r4 = r4.getDeclaredAnnotations()
                        r0.<init>(r1, r2, r4)
                        r4 = r0
                    L2f:
                        return r4
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Builder onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r5) {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfParameterizedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfParameterizedType
                        net.bytebuddy.description.type.TypeDescription r1 = r5.asErasure()
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r5.getOwnerType()
                        net.bytebuddy.description.type.TypeList$Generic r3 = r5.getTypeArguments()
                        net.bytebuddy.description.annotation.AnnotationList r5 = r5.getDeclaredAnnotations()
                        r0.<init>(r1, r2, r3, r5)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Builder onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfTypeVariable r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfTypeVariable
                        java.lang.String r1 = r3.getSymbol()
                        net.bytebuddy.description.annotation.AnnotationList r3 = r3.getDeclaredAnnotations()
                        r0.<init>(r1, r3)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Builder onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Builder onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot resolve wildcard type "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = " to builder"
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            static {
                    return
            }

            public Builder(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.annotations = r1
                    return
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder of(java.lang.reflect.Type r0) {
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r0 = of(r0)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder of(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder$Visitor r0 = net.bytebuddy.description.type.TypeDescription.Generic.Builder.Visitor.INSTANCE
                    java.lang.Object r1 = r1.accept(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder) r1
                    return r1
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder parameterizedType(java.lang.Class<?> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.reflect.Type r2, java.util.List<? extends java.lang.reflect.Type> r3) {
                    net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                    if (r2 != 0) goto L8
                    r2 = 0
                    goto Lc
                L8:
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                Lc:
                    net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
                    r0.<init>(r3)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = parameterizedType(r1, r2, r0)
                    return r1
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder parameterizedType(java.lang.Class<?> r1, java.util.List<? extends java.lang.reflect.Type> r2) {
                    java.lang.reflect.Type r0 = net.bytebuddy.description.type.TypeDescription.Generic.Builder.UNDEFINED
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = parameterizedType(r1, r0, r2)
                    return r1
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder parameterizedType(java.lang.Class<?> r0, java.lang.reflect.Type... r1) {
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r0 = parameterizedType(r0, r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder parameterizedType(net.bytebuddy.description.type.TypeDescription r1, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = parameterizedType(r1, r0, r2)
                    return r1
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder parameterizedType(net.bytebuddy.description.type.TypeDescription r3, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r4, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r5) {
                    net.bytebuddy.description.type.TypeDescription r0 = r3.getDeclaringType()
                    if (r4 != 0) goto L12
                    if (r0 == 0) goto L12
                    boolean r1 = r3.isStatic()
                    if (r1 == 0) goto L12
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.asGenericType()
                L12:
                    java.lang.Class<net.bytebuddy.dynamic.TargetType> r1 = net.bytebuddy.dynamic.TargetType.class
                    boolean r1 = r3.represents(r1)
                    if (r1 != 0) goto Ld5
                    boolean r1 = r3.isGenerified()
                    if (r1 == 0) goto Lbe
                    if (r4 != 0) goto L42
                    if (r0 == 0) goto L42
                    boolean r1 = r3.isStatic()
                    if (r1 == 0) goto L2b
                    goto L42
                L2b:
                    java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    r5.append(r3)
                    java.lang.String r3 = " requires an owner type"
                    r5.append(r3)
                    java.lang.String r3 = r5.toString()
                    r4.<init>(r3)
                    throw r4
                L42:
                    if (r4 == 0) goto L69
                    net.bytebuddy.description.type.TypeDescription r1 = r4.asErasure()
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L4f
                    goto L69
                L4f:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r4)
                    java.lang.String r4 = " does not represent required owner for "
                    r0.append(r4)
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r5.<init>(r3)
                    throw r5
                L69:
                    if (r4 == 0) goto L95
                    boolean r0 = r3.isStatic()
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r4.getSort()
                    boolean r1 = r1.isNonGeneric()
                    r0 = r0 ^ r1
                    if (r0 != 0) goto L7b
                    goto L95
                L7b:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r4)
                    java.lang.String r4 = " does not define the correct parameters for owning "
                    r0.append(r4)
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r5.<init>(r3)
                    throw r5
                L95:
                    net.bytebuddy.description.type.TypeList$Generic r0 = r3.getTypeVariables()
                    int r0 = r0.size()
                    int r1 = r5.size()
                    if (r0 != r1) goto La4
                    goto Ld5
                La4:
                    java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r5)
                    java.lang.String r5 = " does not contain number of required parameters for "
                    r0.append(r5)
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r4.<init>(r3)
                    throw r4
                Lbe:
                    java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    r5.append(r3)
                    java.lang.String r3 = " is not a parameterized type"
                    r5.append(r3)
                    java.lang.String r3 = r5.toString()
                    r4.<init>(r3)
                    throw r4
                Ld5:
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfParameterizedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfParameterizedType
                    net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>(r5)
                    r1.<init>(r2)
                    r0.<init>(r3, r4, r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder parameterizedType(net.bytebuddy.description.type.TypeDescription r0, net.bytebuddy.description.type.TypeDefinition... r1) {
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r0 = parameterizedType(r0, r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder rawType(java.lang.Class<?> r0) {
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r0 = rawType(r0)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder rawType(java.lang.Class<?> r0, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r0 = rawType(r0, r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder rawType(net.bytebuddy.description.type.TypeDescription r1) {
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType
                    r0.<init>(r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder rawType(net.bytebuddy.description.type.TypeDescription r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r3) {
                    net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
                    if (r0 != 0) goto L23
                    if (r3 != 0) goto L9
                    goto L23
                L9:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.String r2 = " does not have a declaring type: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r2 = r1.toString()
                    r0.<init>(r2)
                    throw r0
                L23:
                    if (r0 == 0) goto L4c
                    if (r3 == 0) goto L32
                    net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L32
                    goto L4c
                L32:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r3)
                    java.lang.String r3 = " is not the declaring type of "
                    r1.append(r3)
                    r1.append(r2)
                    java.lang.String r2 = r1.toString()
                    r0.<init>(r2)
                    throw r0
                L4c:
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfNonGenericType
                    r0.<init>(r2, r3)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic.Builder typeVariable(java.lang.String r1) {
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfTypeVariable r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfTypeVariable
                    r0.<init>(r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic unboundWildcard() {
                    java.util.Set r0 = java.util.Collections.emptySet()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = unboundWildcard(r0)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic unboundWildcard(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                    net.bytebuddy.description.annotation.AnnotationSource$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationSource$Explicit
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>(r2)
                    r0.<init>(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType.Latent.unbounded(r0)
                    return r2
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic unboundWildcard(java.util.List<? extends java.lang.annotation.Annotation> r1) {
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    r0.<init>(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = unboundWildcard(r0)
                    return r1
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic unboundWildcard(java.lang.annotation.Annotation... r0) {
                    java.util.List r0 = java.util.Arrays.asList(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = unboundWildcard(r0)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic unboundWildcard(net.bytebuddy.description.annotation.AnnotationDescription... r0) {
                    java.util.List r0 = java.util.Arrays.asList(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = unboundWildcard(r0)
                    return r0
            }

            public net.bytebuddy.description.type.TypeDescription.Generic.Builder annotate(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                    r1 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r2 = r1.doAnnotate(r0)
                    return r2
            }

            public net.bytebuddy.description.type.TypeDescription.Generic.Builder annotate(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    r0.<init>(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r2 = r1.annotate(r0)
                    return r2
            }

            public net.bytebuddy.description.type.TypeDescription.Generic.Builder annotate(java.lang.annotation.Annotation... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = r0.annotate(r1)
                    return r1
            }

            public net.bytebuddy.description.type.TypeDescription.Generic.Builder annotate(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r1 = r0.annotate(r1)
                    return r1
            }

            public net.bytebuddy.description.type.TypeDescription.Generic.Builder asArray() {
                    r1 = this;
                    r0 = 1
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r0 = r1.asArray(r0)
                    return r0
            }

            public net.bytebuddy.description.type.TypeDescription.Generic.Builder asArray(int r4) {
                    r3 = this;
                    r0 = 1
                    if (r4 < r0) goto L1a
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.build()
                L7:
                    int r4 = r4 + (-1)
                    if (r4 <= 0) goto L14
                    net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent
                    net.bytebuddy.description.annotation.AnnotationSource$Empty r2 = net.bytebuddy.description.annotation.AnnotationSource.Empty.INSTANCE
                    r1.<init>(r0, r2)
                    r0 = r1
                    goto L7
                L14:
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfGenericArrayType r4 = new net.bytebuddy.description.type.TypeDescription$Generic$Builder$OfGenericArrayType
                    r4.<init>(r0)
                    return r4
                L1a:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Cannot define an array of a non-positive arity: "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardLowerBound() {
                    r1 = this;
                    java.util.Set r0 = java.util.Collections.emptySet()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.asWildcardLowerBound(r0)
                    return r0
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardLowerBound(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                    r3 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.build()
                    net.bytebuddy.description.annotation.AnnotationSource$Explicit r1 = new net.bytebuddy.description.annotation.AnnotationSource$Explicit
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>(r4)
                    r1.<init>(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType.Latent.boundedBelow(r0, r1)
                    return r4
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardLowerBound(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    r0.<init>(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r1.asWildcardLowerBound(r0)
                    return r2
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardLowerBound(java.lang.annotation.Annotation... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.asWildcardLowerBound(r1)
                    return r1
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardLowerBound(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.asWildcardLowerBound(r1)
                    return r1
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardUpperBound() {
                    r1 = this;
                    java.util.Set r0 = java.util.Collections.emptySet()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.asWildcardUpperBound(r0)
                    return r0
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardUpperBound(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                    r3 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.build()
                    net.bytebuddy.description.annotation.AnnotationSource$Explicit r1 = new net.bytebuddy.description.annotation.AnnotationSource$Explicit
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>(r4)
                    r1.<init>(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType.Latent.boundedAbove(r0, r1)
                    return r4
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardUpperBound(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    r0.<init>(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r1.asWildcardUpperBound(r0)
                    return r2
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardUpperBound(java.lang.annotation.Annotation... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.asWildcardUpperBound(r1)
                    return r1
            }

            public net.bytebuddy.description.type.TypeDescription.Generic asWildcardUpperBound(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.asWildcardUpperBound(r1)
                    return r1
            }

            public net.bytebuddy.description.type.TypeDescription.Generic build() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.doBuild()
                    return r0
            }

            public net.bytebuddy.description.type.TypeDescription.Generic build(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                    r1 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r2 = r1.doAnnotate(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.doBuild()
                    return r2
            }

            public net.bytebuddy.description.type.TypeDescription.Generic build(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    r0.<init>(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r1.build(r0)
                    return r2
            }

            public net.bytebuddy.description.type.TypeDescription.Generic build(java.lang.annotation.Annotation... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.build(r1)
                    return r1
            }

            public net.bytebuddy.description.type.TypeDescription.Generic build(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.build(r1)
                    return r1
            }

            public abstract net.bytebuddy.description.type.TypeDescription.Generic.Builder doAnnotate(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

            public abstract net.bytebuddy.description.type.TypeDescription.Generic doBuild();

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
                    java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r4.annotations
                    net.bytebuddy.description.type.TypeDescription$Generic$Builder r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder) r5
                    java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5 = r5.annotations
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
                    java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public static abstract class LazyProjection extends net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase {
            private transient /* synthetic */ int hashCode;

            public static class ForLoadedFieldType extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final java.lang.reflect.Field field;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;

                public ForLoadedFieldType(java.lang.reflect.Field r1) {
                        r0 = this;
                        r0.<init>()
                        r0.field = r1
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        java.lang.reflect.Field r0 = r1.field
                        java.lang.Class r0 = r0.getType()
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedField r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedField
                        java.lang.reflect.Field r1 = r2.field
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, net.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList r0 = super.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L14
                    L6:
                        java.lang.reflect.Field r0 = r2.field
                        java.lang.reflect.Type r0 = r0.getGenericType()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                    L14:
                        if (r0 != 0) goto L19
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        goto L1b
                    L19:
                        r2.resolved = r0
                    L1b:
                        return r0
                }
            }

            public static class ForLoadedReturnType extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final java.lang.reflect.Method method;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;

                public ForLoadedReturnType(java.lang.reflect.Method r1) {
                        r0 = this;
                        r0.<init>()
                        r0.method = r1
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.method
                        java.lang.Class r0 = r0.getReturnType()
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedMethodReturnType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedMethodReturnType
                        java.lang.reflect.Method r1 = r2.method
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, net.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList r0 = super.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L14
                    L6:
                        java.lang.reflect.Method r0 = r2.method
                        java.lang.reflect.Type r0 = r0.getGenericReturnType()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                    L14:
                        if (r0 != 0) goto L19
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        goto L1b
                    L19:
                        r2.resolved = r0
                    L1b:
                        return r0
                }
            }

            public static class ForLoadedSuperClass extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement {
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;
                private final java.lang.Class<?> type;

                public ForLoadedSuperClass(java.lang.Class<?> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.type = r1
                        return
                }

                @net.bytebuddy.utility.nullability.MaybeNull
                public static net.bytebuddy.description.type.TypeDescription.Generic of(java.lang.Class<?> r1) {
                        java.lang.Class r0 = r1.getSuperclass()
                        if (r0 != 0) goto L9
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto Lf
                    L9:
                        net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$ForLoadedSuperClass r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$ForLoadedSuperClass
                        r0.<init>(r1)
                        r1 = r0
                    Lf:
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        java.lang.Class<?> r0 = r1.type
                        java.lang.Class r0 = r0.getSuperclass()
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedSuperClass r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedSuperClass
                        java.lang.Class<?> r1 = r2.type
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement, net.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList r0 = super.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L14
                    L6:
                        java.lang.Class<?> r0 = r2.type
                        java.lang.reflect.Type r0 = r0.getGenericSuperclass()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                    L14:
                        if (r0 != 0) goto L19
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        goto L1b
                    L19:
                        r2.resolved = r0
                    L1b:
                        return r0
                }
            }

            public static class OfConstructorParameter extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final java.lang.reflect.Constructor<?> constructor;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic delegate;
                private final java.lang.Class<?>[] erasure;
                private final int index;

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
                public OfConstructorParameter(java.lang.reflect.Constructor<?> r1, int r2, java.lang.Class<?>[] r3) {
                        r0 = this;
                        r0.<init>()
                        r0.constructor = r1
                        r0.index = r2
                        r0.erasure = r3
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r2 = this;
                        java.lang.Class<?>[] r0 = r2.erasure
                        int r1 = r2.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType
                        java.lang.reflect.Constructor<?> r1 = r3.constructor
                        int r2 = r3.index
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, net.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList r0 = super.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("delegate")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.delegate
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L27
                    L6:
                        java.lang.reflect.Constructor<?> r0 = r4.constructor
                        java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
                        java.lang.Class<?>[] r1 = r4.erasure
                        int r2 = r1.length
                        int r3 = r0.length
                        if (r2 != r3) goto L1f
                        int r1 = r4.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r4.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                        goto L27
                    L1f:
                        int r0 = r4.index
                        r0 = r1[r0]
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    L27:
                        if (r0 != 0) goto L2c
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.delegate
                        goto L2e
                    L2c:
                        r4.delegate = r0
                    L2e:
                        return r0
                }
            }

            public static class OfMethodParameter extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final java.lang.Class<?>[] erasure;
                private final int index;
                private final java.lang.reflect.Method method;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
                public OfMethodParameter(java.lang.reflect.Method r1, int r2, java.lang.Class<?>[] r3) {
                        r0 = this;
                        r0.<init>()
                        r0.method = r1
                        r0.index = r2
                        r0.erasure = r3
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r2 = this;
                        java.lang.Class<?>[] r0 = r2.erasure
                        int r1 = r2.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType
                        java.lang.reflect.Method r1 = r3.method
                        int r2 = r3.index
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, net.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList r0 = super.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L27
                    L6:
                        java.lang.reflect.Method r0 = r4.method
                        java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
                        java.lang.Class<?>[] r1 = r4.erasure
                        int r2 = r1.length
                        int r3 = r0.length
                        if (r2 != r3) goto L1f
                        int r1 = r4.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r4.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                        goto L27
                    L1f:
                        int r0 = r4.index
                        r0 = r1[r0]
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    L27:
                        if (r0 != 0) goto L2c
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.resolved
                        goto L2e
                    L2c:
                        r4.resolved = r0
                    L2e:
                        return r0
                }
            }

            public static class OfRecordComponent extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final java.lang.Object recordComponent;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;

                public OfRecordComponent(java.lang.Object r1) {
                        r0 = this;
                        r0.<init>()
                        r0.recordComponent = r1
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r2 = this;
                        net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT
                        java.lang.Object r1 = r2.recordComponent
                        java.lang.Class r0 = r0.getType(r1)
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedRecordComponent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedRecordComponent
                        java.lang.Object r1 = r2.recordComponent
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, net.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList r0 = super.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L16
                    L6:
                        net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT
                        java.lang.Object r1 = r2.recordComponent
                        java.lang.reflect.Type r0 = r0.getGenericType(r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                    L16:
                        if (r0 != 0) goto L1b
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        goto L1d
                    L1b:
                        r2.resolved = r0
                    L1d:
                        return r0
                }
            }

            public static abstract class WithEagerNavigation extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection {

                public static abstract class OfAnnotatedElement extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation {
                    public OfAnnotatedElement() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public abstract net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader();

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation, net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                            return r0
                    }

                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r0 = r1.getAnnotationReader()
                            net.bytebuddy.description.annotation.AnnotationList r0 = r0.asList()
                            return r0
                    }
                }

                public WithEagerNavigation() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getInterfaces()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                        return r0
                }

                @Override // java.lang.Iterable
                public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                        java.util.Iterator r0 = r0.iterator()
                        return r0
                }
            }

            public static abstract class WithLazyNavigation extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection {

                public static class LazyInterfaceList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                    private final net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection delegate;
                    private final net.bytebuddy.description.type.TypeList.Generic rawInterfaces;

                    public LazyInterfaceList(net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection r1, net.bytebuddy.description.type.TypeList.Generic r2) {
                            r0 = this;
                            r0.<init>()
                            r0.delegate = r1
                            r0.rawInterfaces = r2
                            return
                    }

                    public static net.bytebuddy.description.type.TypeList.Generic of(net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection r2) {
                            net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithLazyNavigation$LazyInterfaceList r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithLazyNavigation$LazyInterfaceList
                            net.bytebuddy.description.type.TypeDescription r1 = r2.asErasure()
                            net.bytebuddy.description.type.TypeList$Generic r1 = r1.getInterfaces()
                            r0.<init>(r2, r1)
                            return r0
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.type.TypeDescription.Generic get(int r4) {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithLazyNavigation$LazyInterfaceType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithLazyNavigation$LazyInterfaceType
                            net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection r1 = r3.delegate
                            net.bytebuddy.description.type.TypeList$Generic r2 = r3.rawInterfaces
                            java.lang.Object r2 = r2.get(r4)
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                            r0.<init>(r1, r4, r2)
                            return r0
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeList$Generic r0 = r1.rawInterfaces
                            int r0 = r0.size()
                            return r0
                    }
                }

                public static class LazyInterfaceType extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation {
                    private final net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection delegate;
                    private final int index;
                    private final net.bytebuddy.description.type.TypeDescription.Generic rawInterface;
                    private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;

                    public LazyInterfaceType(net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection r1, int r2, net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            r0 = this;
                            r0.<init>()
                            r0.delegate = r1
                            r0.index = r2
                            r0.rawInterface = r3
                            return
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    public net.bytebuddy.description.type.TypeDescription asErasure() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.rawInterface
                            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation, net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                            net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                    @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                    public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                            if (r0 == 0) goto L6
                            r0 = 0
                            goto L18
                        L6:
                            net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection r0 = r2.delegate
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.resolve()
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.getInterfaces()
                            int r1 = r2.index
                            java.lang.Object r0 = r0.get(r1)
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                        L18:
                            if (r0 != 0) goto L1d
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                            goto L1f
                        L1d:
                            r2.resolved = r0
                        L1f:
                            return r0
                    }
                }

                public static class LazySuperClass extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation {
                    private final net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection delegate;
                    private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;

                    public LazySuperClass(net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection r1) {
                            r0 = this;
                            r0.<init>()
                            r0.delegate = r1
                            return
                    }

                    @net.bytebuddy.utility.nullability.MaybeNull
                    public static net.bytebuddy.description.type.TypeDescription.Generic of(net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection r1) {
                            net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                            if (r0 != 0) goto Ld
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                            goto L13
                        Ld:
                            net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithLazyNavigation$LazySuperClass r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithLazyNavigation$LazySuperClass
                            r0.<init>(r1)
                            r1 = r0
                        L13:
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public net.bytebuddy.description.type.TypeDescription asErasure() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection r0 = r1.delegate
                            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation, net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                            net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                    @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolved
                            if (r0 == 0) goto L6
                            r0 = 0
                            goto L10
                        L6:
                            net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection r0 = r1.delegate
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.resolve()
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                        L10:
                            if (r0 != 0) goto L15
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolved
                            goto L17
                        L15:
                            r1.resolved = r0
                        L17:
                            return r0
                    }
                }

                public static abstract class OfAnnotatedElement extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation {
                    public OfAnnotatedElement() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public abstract net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader();

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation, net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                            return r0
                    }

                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r0 = r1.getAnnotationReader()
                            net.bytebuddy.description.annotation.AnnotationList r0 = r0.asList()
                            return r0
                    }
                }

                public WithLazyNavigation() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.LazyInterfaceList.of(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.LazySuperClass.of(r1)
                        return r0
                }

                @Override // java.lang.Iterable
                public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDefinition$SuperClassIterator r0 = new net.bytebuddy.description.type.TypeDefinition$SuperClassIterator
                        r0.<init>(r1)
                        return r0
                }
            }

            public static class WithResolvedErasure extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation {
                private final net.bytebuddy.description.annotation.AnnotationSource annotationSource;
                private final net.bytebuddy.description.type.TypeDescription.Generic delegate;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;
                private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

                public WithResolvedErasure(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2) {
                        r0 = this;
                        r0.<init>(r1, r2, r1)
                        return
                }

                public WithResolvedErasure(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2, net.bytebuddy.description.annotation.AnnotationSource r3) {
                        r0 = this;
                        r0.<init>()
                        r0.delegate = r1
                        r0.visitor = r2
                        r0.annotationSource = r3
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.delegate
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationSource r0 = r1.annotationSource
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L10
                    L6:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.delegate
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                        java.lang.Object r0 = r0.accept(r1)
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    L10:
                        if (r0 != 0) goto L15
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.resolved
                        goto L17
                    L15:
                        r2.resolved = r0
                    L17:
                        return r0
                }
            }

            public LazyProjection() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<T> r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    java.lang.Object r2 = r0.accept(r2)
                    return r2
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                    r1 = this;
                    if (r1 == r2) goto L13
                    boolean r0 = r2 instanceof net.bytebuddy.description.type.TypeDefinition
                    if (r0 == 0) goto L11
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L11
                    goto L13
                L11:
                    r2 = 0
                    goto L14
                L13:
                    r2 = 1
                L14:
                    return r2
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic findBindingOf(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.findBindingOf(r2)
                    return r2
            }

            @Override // net.bytebuddy.description.NamedElement
            public java.lang.String getActualName() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    java.lang.String r0 = r0.getActualName()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getComponentType()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.type.TypeList$Generic r0 = r0.getLowerBounds()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getOwnerType()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> getRecordComponents() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.type.RecordComponentList r0 = r0.getRecordComponents()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDefinition.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = r0.getSort()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    net.bytebuddy.implementation.bytecode.StackSize r0 = r0.getStackSize()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public java.lang.String getSymbol() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    java.lang.String r0 = r0.getSymbol()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.type.TypeList$Generic r0 = r0.getTypeArguments()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public java.lang.String getTypeName() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    java.lang.String r0 = r0.getTypeName()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.TypeVariableSource r0 = r0.getTypeVariableSource()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    net.bytebuddy.description.type.TypeList$Generic r0 = r0.getUpperBounds()
                    return r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            public int hashCode() {
                    r1 = this;
                    int r0 = r1.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto Le
                L6:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    int r0 = r0.hashCode()
                Le:
                    if (r0 != 0) goto L13
                    int r0 = r1.hashCode
                    goto L15
                L13:
                    r1.hashCode = r0
                L15:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r0 = r0.isArray()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r0 = r0.isPrimitive()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isRecord() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r0 = r0.isRecord()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
            public boolean represents(java.lang.reflect.Type r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    boolean r2 = r0.represents(r2)
                    return r2
            }

            public abstract net.bytebuddy.description.type.TypeDescription.Generic resolve();

            public java.lang.String toString() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class LazyProxy implements java.lang.reflect.InvocationHandler {
            private final java.lang.Class<?> type;

            public LazyProxy(java.lang.Class<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.type = r1
                    return
            }

            public static net.bytebuddy.description.type.TypeDescription.Generic of(java.lang.Class<?> r3) {
                    java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic> r0 = net.bytebuddy.description.type.TypeDescription.Generic.class
                    java.lang.ClassLoader r1 = r0.getClassLoader()
                    java.lang.Class[] r0 = new java.lang.Class[]{r0}
                    net.bytebuddy.description.type.TypeDescription$Generic$LazyProxy r2 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProxy
                    r2.<init>(r3)
                    java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r1, r0, r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    return r3
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
                    java.lang.Class<?> r2 = r4.type
                    net.bytebuddy.description.type.TypeDescription$Generic$LazyProxy r5 = (net.bytebuddy.description.type.TypeDescription.Generic.LazyProxy) r5
                    java.lang.Class<?> r5 = r5.type
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
                    java.lang.Class<?> r1 = r2.type
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // java.lang.reflect.InvocationHandler
            public java.lang.Object invoke(java.lang.Object r1, java.lang.reflect.Method r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r3) throws java.lang.Throwable {
                    r0 = this;
                    java.lang.Class<?> r1 = r0.type     // Catch: java.lang.reflect.InvocationTargetException -> Lb
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)     // Catch: java.lang.reflect.InvocationTargetException -> Lb
                    java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lb
                    return r1
                Lb:
                    r1 = move-exception
                    java.lang.Throwable r1 = r1.getTargetException()
                    throw r1
            }
        }

        public static abstract class OfGenericArray extends net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase {
            private transient /* synthetic */ int hashCode;

            public static class ForLoadedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfGenericArray {
                private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                private final java.lang.reflect.GenericArrayType genericArrayType;

                public ForLoadedType(java.lang.reflect.GenericArrayType r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        r1.<init>(r2, r0)
                        return
                }

                public ForLoadedType(java.lang.reflect.GenericArrayType r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                        r0 = this;
                        r0.<init>()
                        r0.genericArrayType = r1
                        r0.annotationReader = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                        r2 = this;
                        java.lang.reflect.GenericArrayType r0 = r2.genericArrayType
                        java.lang.reflect.Type r0 = r0.getGenericComponentType()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.annotationReader
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r1.ofComponentType()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r0 = r1.annotationReader
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.asList()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
                public boolean represents(java.lang.reflect.Type r2) {
                        r1 = this;
                        java.lang.reflect.GenericArrayType r0 = r1.genericArrayType
                        if (r0 == r2) goto Ld
                        boolean r2 = super.represents(r2)
                        if (r2 == 0) goto Lb
                        goto Ld
                    Lb:
                        r2 = 0
                        goto Le
                    Ld:
                        r2 = 1
                    Le:
                        return r2
                }
            }

            public static class Latent extends net.bytebuddy.description.type.TypeDescription.Generic.OfGenericArray {
                private final net.bytebuddy.description.annotation.AnnotationSource annotationSource;
                private final net.bytebuddy.description.type.TypeDescription.Generic componentType;

                public Latent(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.annotation.AnnotationSource r2) {
                        r0 = this;
                        r0.<init>()
                        r0.componentType = r1
                        r0.annotationSource = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.componentType
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationSource r0 = r1.annotationSource
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }
            }

            public OfGenericArray() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<T> r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = r1.getSort()
                    boolean r0 = r0.isNonGeneric()
                    if (r0 == 0) goto Lf
                    java.lang.Object r2 = r2.onNonGenericType(r1)
                    goto L13
                Lf:
                    java.lang.Object r2 = r2.onGenericArray(r1)
                L13:
                    return r2
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public net.bytebuddy.description.type.TypeDescription asErasure() {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.getComponentType()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    r1 = 1
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r0, r1)
                    return r0
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Type check is performed by erasure implementation. Assuming component type for array type.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS", "NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r3.getSort()
                    boolean r1 = r1.isNonGeneric()
                    if (r1 == 0) goto L17
                    net.bytebuddy.description.type.TypeDescription r0 = r3.asErasure()
                    boolean r4 = r0.equals(r4)
                    return r4
                L17:
                    boolean r1 = r4 instanceof net.bytebuddy.description.type.TypeDescription.Generic
                    r2 = 0
                    if (r1 != 0) goto L1d
                    return r2
                L1d:
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r4.getSort()
                    boolean r1 = r1.isGenericArray()
                    if (r1 == 0) goto L38
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getComponentType()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getComponentType()
                    boolean r4 = r1.equals(r4)
                    if (r4 == 0) goto L38
                    goto L39
                L38:
                    r0 = r2
                L39:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeDescription.Generic findBindingOf(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                    r2 = this;
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "A generic array type does not imply type arguments: "
                    r0.append(r1)
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
            }

            @Override // net.bytebuddy.description.NamedElement
            public java.lang.String getActualName() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = r1.getSort()
                    boolean r0 = r0.isNonGeneric()
                    if (r0 == 0) goto L13
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    java.lang.String r0 = r0.getActualName()
                    goto L17
                L13:
                    java.lang.String r0 = r1.toString()
                L17:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldList$Empty r0 = new net.bytebuddy.description.field.FieldList$Empty
                    r0.<init>()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodList$Empty r0 = new net.bytebuddy.description.method.MethodList$Empty
                    r0.<init>()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeDescription.ARRAY_INTERFACES
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A generic array type does not imply lower type bounds: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> getRecordComponents() {
                    r1 = this;
                    net.bytebuddy.description.type.RecordComponentList$Empty r0 = new net.bytebuddy.description.type.RecordComponentList$Empty
                    r0.<init>()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public net.bytebuddy.description.type.TypeDefinition.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = r0.getSort()
                    boolean r0 = r0.isNonGeneric()
                    if (r0 == 0) goto L11
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.NON_GENERIC
                    goto L13
                L11:
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.GENERIC_ARRAY
                L13:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                    r1 = this;
                    java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public java.lang.String getSymbol() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A generic array type does not imply a symbol: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A generic array type does not imply type arguments: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public java.lang.String getTypeName() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = r1.getSort()
                    boolean r0 = r0.isNonGeneric()
                    if (r0 == 0) goto L13
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    java.lang.String r0 = r0.getTypeName()
                    goto L17
                L13:
                    java.lang.String r0 = r1.toString()
                L17:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A generic array type does not imply a type variable source: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A generic array type does not imply upper type bounds: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public int hashCode() {
                    r1 = this;
                    int r0 = r1.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L21
                L6:
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = r1.getSort()
                    boolean r0 = r0.isNonGeneric()
                    if (r0 == 0) goto L19
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    int r0 = r0.hashCode()
                    goto L21
                L19:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                    int r0 = r0.hashCode()
                L21:
                    if (r0 != 0) goto L26
                    int r0 = r1.hashCode
                    goto L28
                L26:
                    r1.hashCode = r0
                L28:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isRecord() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$SuperClassIterator r0 = new net.bytebuddy.description.type.TypeDefinition$SuperClassIterator
                    r0.<init>(r1)
                    return r0
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public java.lang.String toString() {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = r2.getSort()
                    boolean r0 = r0.isNonGeneric()
                    if (r0 == 0) goto L13
                    net.bytebuddy.description.type.TypeDescription r0 = r2.asErasure()
                    java.lang.String r0 = r0.toString()
                    goto L2c
                L13:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.getComponentType()
                    java.lang.String r1 = r1.getTypeName()
                    r0.append(r1)
                    java.lang.String r1 = "[]"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                L2c:
                    return r0
            }
        }

        public static abstract class OfNonGenericType extends net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase {
            private transient /* synthetic */ int hashCode;

            public static class ForErasure extends net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForErasure(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getComponentType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto Lf
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                    Lf:
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto Lf
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                    Lf:
                        return r0
                }
            }

            public static class ForLoadedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType {
                private static final java.util.Map<java.lang.Class<?>, net.bytebuddy.description.type.TypeDescription.Generic> TYPE_CACHE = null;
                private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                private final java.lang.Class<?> type;

                static {
                        java.util.HashMap r0 = new java.util.HashMap
                        r0.<init>()
                        net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.TYPE_CACHE = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<net.bytebuddy.dynamic.TargetType> r2 = net.bytebuddy.dynamic.TargetType.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.annotation.Annotation> r2 = java.lang.annotation.Annotation.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.String> r2 = java.lang.String.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
                        r1.<init>(r2)
                        r0.put(r2, r1)
                        java.lang.Class r1 = java.lang.Void.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        java.lang.Class r1 = java.lang.Boolean.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        java.lang.Class r1 = java.lang.Byte.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        java.lang.Class r1 = java.lang.Short.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        java.lang.Class r1 = java.lang.Character.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        java.lang.Class r1 = java.lang.Integer.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        java.lang.Class r1 = java.lang.Long.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        java.lang.Class r1 = java.lang.Float.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        java.lang.Class r1 = java.lang.Double.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r2.<init>(r1)
                        r0.put(r1, r2)
                        return
                }

                public ForLoadedType(java.lang.Class<?> r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        r1.<init>(r2, r0)
                        return
                }

                public ForLoadedType(java.lang.Class<?> r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                        r0 = this;
                        r0.<init>()
                        r0.type = r1
                        r0.annotationReader = r2
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic of(java.lang.Class<?> r1) {
                        java.util.Map<java.lang.Class<?>, net.bytebuddy.description.type.TypeDescription$Generic> r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.TYPE_CACHE
                        java.lang.Object r0 = r0.get(r1)
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                        if (r0 != 0) goto Lf
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        r0.<init>(r1)
                    Lf:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        java.lang.Class<?> r0 = r1.type
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                        r3 = this;
                        java.lang.Class<?> r0 = r3.type
                        java.lang.Class r0 = r0.getComponentType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L17
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r3.annotationReader
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r2.ofComponentType()
                        r1.<init>(r0, r2)
                        r0 = r1
                    L17:
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r0 = r1.annotationReader
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.asList()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r3 = this;
                        java.lang.Class<?> r0 = r3.type
                        java.lang.Class r0 = r0.getDeclaringClass()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L17
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r3.annotationReader
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r2.ofOuterClass()
                        r1.<init>(r0, r2)
                        r0 = r1
                    L17:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
                public boolean represents(java.lang.reflect.Type r2) {
                        r1 = this;
                        java.lang.Class<?> r0 = r1.type
                        if (r0 == r2) goto Ld
                        boolean r2 = super.represents(r2)
                        if (r2 == 0) goto Lb
                        goto Ld
                    Lb:
                        r2 = 0
                        goto Le
                    Ld:
                        r2 = 1
                    Le:
                        return r2
                }
            }

            public static class ForReifiedErasure extends net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForReifiedErasure(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic of(net.bytebuddy.description.type.TypeDescription r1) {
                        boolean r0 = r1.isGenerified()
                        if (r0 == 0) goto Lc
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForReifiedErasure r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForReifiedErasure
                        r0.<init>(r1)
                        goto L11
                    Lc:
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForErasure r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForErasure
                        r0.<init>(r1)
                    L11:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getComponentType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto Lf
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = of(r0)
                    Lf:
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                        r3 = this;
                        net.bytebuddy.description.field.FieldList$TypeSubstituting r0 = new net.bytebuddy.description.field.FieldList$TypeSubstituting
                        net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                        net.bytebuddy.description.field.FieldList r1 = r1.getDeclaredFields()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.INSTANCE
                        r0.<init>(r3, r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                        r3 = this;
                        net.bytebuddy.description.method.MethodList$TypeSubstituting r0 = new net.bytebuddy.description.method.MethodList$TypeSubstituting
                        net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                        net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.INSTANCE
                        r0.<init>(r3, r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure
                        net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.getInterfaces()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INHERITING
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto Lf
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = of(r0)
                    Lf:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L13
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure r1 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INHERITING
                        r1.<init>(r0, r2)
                        r0 = r1
                    L13:
                        return r0
                }
            }

            public static class Latent extends net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType {
                private final net.bytebuddy.description.annotation.AnnotationSource annotationSource;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final net.bytebuddy.description.type.TypeDescription.Generic declaringType;
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public Latent(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.annotation.AnnotationSource r3) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
                        r1.<init>(r2, r0, r3)
                        return
                }

                public Latent(net.bytebuddy.description.type.TypeDescription r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.description.annotation.AnnotationSource r3) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
                        r0.declaringType = r2
                        r0.annotationSource = r3
                        return
                }

                private Latent(net.bytebuddy.description.type.TypeDescription r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.annotation.AnnotationSource r3) {
                        r0 = this;
                        if (r2 != 0) goto L5
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L9
                    L5:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                    L9:
                        r0.<init>(r1, r2, r3)
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getComponentType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto Lf
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                    Lf:
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationSource r0 = r1.annotationSource
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.declaringType
                        return r0
                }
            }

            public OfNonGenericType() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<T> r1) {
                    r0 = this;
                    java.lang.Object r1 = r1.onNonGenericType(r0)
                    return r1
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Type check is performed by erasure implementation.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                    r1 = this;
                    if (r1 == r2) goto Lf
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto Ld
                    goto Lf
                Ld:
                    r2 = 0
                    goto L10
                Lf:
                    r2 = 1
                L10:
                    return r2
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeDescription.Generic findBindingOf(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                    r2 = this;
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "A non-generic type does not imply type arguments: "
                    r0.append(r1)
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
            }

            @Override // net.bytebuddy.description.NamedElement
            public java.lang.String getActualName() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    java.lang.String r0 = r0.getActualName()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                    r4 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r4.asErasure()
                    net.bytebuddy.description.field.FieldList$TypeSubstituting r1 = new net.bytebuddy.description.field.FieldList$TypeSubstituting
                    net.bytebuddy.description.field.FieldList r2 = r0.getDeclaredFields()
                    boolean r3 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r3 == 0) goto L11
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp.INSTANCE
                    goto L17
                L11:
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType
                    r3.<init>(r0)
                    r0 = r3
                L17:
                    r1.<init>(r4, r2, r0)
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                    r4 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r4.asErasure()
                    net.bytebuddy.description.method.MethodList$TypeSubstituting r1 = new net.bytebuddy.description.method.MethodList$TypeSubstituting
                    net.bytebuddy.description.method.MethodList r2 = r0.getDeclaredMethods()
                    boolean r3 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r3 == 0) goto L11
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp.INSTANCE
                    goto L17
                L11:
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType
                    r3.<init>(r0)
                    r0 = r3
                L17:
                    r1.<init>(r4, r2, r0)
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                    r4 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r4.asErasure()
                    boolean r1 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r1 == 0) goto Ld
                    net.bytebuddy.description.type.TypeList$Generic r0 = r0.getInterfaces()
                    return r0
                Ld:
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure r1 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure
                    net.bytebuddy.description.type.TypeList$Generic r2 = r0.getInterfaces()
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType
                    r3.<init>(r0)
                    r1.<init>(r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A non-generic type does not imply lower type bounds: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> getRecordComponents() {
                    r4 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r4.asErasure()
                    net.bytebuddy.description.type.RecordComponentList$TypeSubstituting r1 = new net.bytebuddy.description.type.RecordComponentList$TypeSubstituting
                    net.bytebuddy.description.type.RecordComponentList r2 = r0.getRecordComponents()
                    boolean r3 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r3 == 0) goto L11
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp.INSTANCE
                    goto L17
                L11:
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType
                    r3.<init>(r0)
                    r0 = r3
                L17:
                    r1.<init>(r4, r2, r0)
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDefinition.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.NON_GENERIC
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    net.bytebuddy.implementation.bytecode.StackSize r0 = r0.getStackSize()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                    r4 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r4.asErasure()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.getSuperClass()
                    boolean r2 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r2 == 0) goto Ld
                    return r1
                Ld:
                    if (r1 != 0) goto L12
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                    goto L1f
                L12:
                    net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure r2 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForRawType
                    r3.<init>(r0)
                    net.bytebuddy.description.annotation.AnnotationSource$Empty r0 = net.bytebuddy.description.annotation.AnnotationSource.Empty.INSTANCE
                    r2.<init>(r1, r3, r0)
                    r0 = r2
                L1f:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public java.lang.String getSymbol() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A non-generic type does not imply a symbol: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A non-generic type does not imply type arguments: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public java.lang.String getTypeName() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    java.lang.String r0 = r0.getTypeName()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A non-generic type does not imply a type variable source: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A non-generic type does not imply upper type bounds: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            public int hashCode() {
                    r1 = this;
                    int r0 = r1.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto Le
                L6:
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    int r0 = r0.hashCode()
                Le:
                    if (r0 != 0) goto L13
                    int r0 = r1.hashCode
                    goto L15
                L13:
                    r1.hashCode = r0
                L15:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r0 = r0.isArray()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r0 = r0.isPrimitive()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isRecord() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r0 = r0.isRecord()
                    return r0
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$SuperClassIterator r0 = new net.bytebuddy.description.type.TypeDefinition$SuperClassIterator
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
            public boolean represents(java.lang.reflect.Type r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r2 = r0.represents(r2)
                    return r2
            }

            public java.lang.String toString() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public static abstract class OfParameterizedType extends net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase {
            private transient /* synthetic */ int hashCode;

            public static class ForGenerifiedErasure extends net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForGenerifiedErasure(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic of(net.bytebuddy.description.type.TypeDescription r1) {
                        boolean r0 = r1.isGenerified()
                        if (r0 == 0) goto Lc
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$ForGenerifiedErasure r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$ForGenerifiedErasure
                        r0.<init>(r1)
                        goto L11
                    Lc:
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForErasure r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForErasure
                        r0.<init>(r1)
                    L11:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto Lf
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = of(r0)
                    Lf:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes
                        net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.getTypeVariables()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper.INSTANCE
                        r0.<init>(r1, r2)
                        return r0
                }
            }

            public static class ForLoadedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType {
                private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                private final java.lang.reflect.ParameterizedType parameterizedType;

                public static class ParameterArgumentTypeList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                    private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                    private final java.lang.reflect.Type[] argumentType;

                    public ParameterArgumentTypeList(java.lang.reflect.Type[] r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                            r0 = this;
                            r0.<init>()
                            r0.argumentType = r1
                            r0.annotationReader = r2
                            return
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.type.TypeDescription.Generic get(int r3) {
                            r2 = this;
                            java.lang.reflect.Type[] r0 = r2.argumentType
                            r0 = r0[r3]
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.annotationReader
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r3 = r1.ofTypeArgument(r3)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r3)
                            return r3
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            java.lang.reflect.Type[] r0 = r1.argumentType
                            int r0 = r0.length
                            return r0
                    }
                }

                public ForLoadedType(java.lang.reflect.ParameterizedType r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        r1.<init>(r2, r0)
                        return
                }

                public ForLoadedType(java.lang.reflect.ParameterizedType r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                        r0 = this;
                        r0.<init>()
                        r0.parameterizedType = r1
                        r0.annotationReader = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        java.lang.reflect.ParameterizedType r0 = r1.parameterizedType
                        java.lang.reflect.Type r0 = r0.getRawType()
                        java.lang.Class r0 = (java.lang.Class) r0
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r0 = r1.annotationReader
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.asList()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r2 = this;
                        java.lang.reflect.ParameterizedType r0 = r2.parameterizedType
                        java.lang.reflect.Type r0 = r0.getOwnerType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L15
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.annotationReader
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r1.ofOwnerType()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                    L15:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$ForLoadedType$ParameterArgumentTypeList r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$ForLoadedType$ParameterArgumentTypeList
                        java.lang.reflect.ParameterizedType r1 = r3.parameterizedType
                        java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r3.annotationReader
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
                public boolean represents(java.lang.reflect.Type r2) {
                        r1 = this;
                        java.lang.reflect.ParameterizedType r0 = r1.parameterizedType
                        if (r0 == r2) goto Ld
                        boolean r2 = super.represents(r2)
                        if (r2 == 0) goto Lb
                        goto Ld
                    Lb:
                        r2 = 0
                        goto Le
                    Ld:
                        r2 = 1
                    Le:
                        return r2
                }
            }

            public static class ForReifiedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType {
                private final net.bytebuddy.description.type.TypeDescription.Generic parameterizedType;

                public ForReifiedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        r0.<init>()
                        r0.parameterizedType = r1
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.parameterizedType
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                        r3 = this;
                        net.bytebuddy.description.field.FieldList$TypeSubstituting r0 = new net.bytebuddy.description.field.FieldList$TypeSubstituting
                        net.bytebuddy.description.field.FieldList r1 = super.getDeclaredFields()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.INSTANCE
                        r0.<init>(r3, r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                        r3 = this;
                        net.bytebuddy.description.method.MethodList$TypeSubstituting r0 = new net.bytebuddy.description.method.MethodList$TypeSubstituting
                        net.bytebuddy.description.method.MethodList r1 = super.getDeclaredMethods()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.INSTANCE
                        r0.<init>(r3, r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure
                        net.bytebuddy.description.type.TypeList$Generic r1 = super.getInterfaces()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INHERITING
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.parameterizedType
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getOwnerType()
                        if (r0 != 0) goto Lb
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L13
                    Lb:
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INHERITING
                        java.lang.Object r0 = r0.accept(r1)
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    L13:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getSuperClass()
                        if (r0 != 0) goto L9
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L11
                    L9:
                        net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure r1 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INHERITING
                        r1.<init>(r0, r2)
                        r0 = r1
                    L11:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.parameterizedType
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.getTypeArguments()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.INSTANCE
                        r0.<init>(r1, r2)
                        return r0
                }
            }

            public static class Latent extends net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType {
                private final net.bytebuddy.description.annotation.AnnotationSource annotationSource;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final net.bytebuddy.description.type.TypeDescription.Generic ownerType;
                private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> parameters;
                private final net.bytebuddy.description.type.TypeDescription rawType;

                public Latent(net.bytebuddy.description.type.TypeDescription r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r2, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3, net.bytebuddy.description.annotation.AnnotationSource r4) {
                        r0 = this;
                        r0.<init>()
                        r0.rawType = r1
                        r0.ownerType = r2
                        r0.parameters = r3
                        r0.annotationSource = r4
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.rawType
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationSource r0 = r1.annotationSource
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.ownerType
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.parameters
                        r0.<init>(r1)
                        return r0
                }
            }

            public enum RenderingDelegate extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate> {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate[] $VALUES = null;
                protected static final net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate CURRENT = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate FOR_JAVA_8_CAPABLE_VM = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate FOR_LEGACY_VM = null;



                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate$1 r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate$1
                        java.lang.String r1 = "FOR_LEGACY_VM"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.FOR_LEGACY_VM = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate$2 r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate$2
                        java.lang.String r3 = "FOR_JAVA_8_CAPABLE_VM"
                        r4 = 1
                        r1.<init>(r3, r4)
                        net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.FOR_JAVA_8_CAPABLE_VM = r1
                        r3 = 2
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate[] r3 = new net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate[r3]
                        r3[r2] = r0
                        r3[r4] = r1
                        net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.$VALUES = r3
                        net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V5
                        net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.ofThisVm(r2)
                        net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V8
                        boolean r2 = r2.isAtLeast(r3)
                        if (r2 == 0) goto L2c
                        r0 = r1
                    L2c:
                        net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.CURRENT = r0
                        return
                }

                RenderingDelegate(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                /* synthetic */ RenderingDelegate(java.lang.String r1, int r2, net.bytebuddy.description.type.TypeDescription.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate> r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate r1 = (net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate[]) r0
                        return r0
                }

                public abstract void apply(java.lang.StringBuilder r1, net.bytebuddy.description.type.TypeDescription r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r3);
            }

            public OfParameterizedType() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<T> r1) {
                    r0 = this;
                    java.lang.Object r1 = r1.onParameterizedType(r0)
                    return r1
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                    r6 = this;
                    r0 = 1
                    if (r6 != r7) goto L4
                    return r0
                L4:
                    boolean r1 = r7 instanceof net.bytebuddy.description.type.TypeDescription.Generic
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = (net.bytebuddy.description.type.TypeDescription.Generic) r7
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r7.getSort()
                    boolean r1 = r1.isParameterized()
                    if (r1 != 0) goto L17
                    return r2
                L17:
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r6.getOwnerType()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r7.getOwnerType()
                    net.bytebuddy.description.type.TypeDescription r4 = r6.asErasure()
                    net.bytebuddy.description.type.TypeDescription r5 = r7.asErasure()
                    boolean r4 = r4.equals(r5)
                    if (r4 == 0) goto L48
                    if (r1 != 0) goto L31
                    if (r3 != 0) goto L48
                L31:
                    if (r1 == 0) goto L39
                    boolean r1 = r1.equals(r3)
                    if (r1 == 0) goto L48
                L39:
                    net.bytebuddy.description.type.TypeList$Generic r1 = r6.getTypeArguments()
                    net.bytebuddy.description.type.TypeList$Generic r7 = r7.getTypeArguments()
                    boolean r7 = r1.equals(r7)
                    if (r7 == 0) goto L48
                    goto L49
                L48:
                    r0 = r2
                L49:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic findBindingOf(net.bytebuddy.description.type.TypeDescription.Generic r7) {
                    r6 = this;
                    r0 = r6
                L1:
                    net.bytebuddy.description.type.TypeList$Generic r1 = r0.getTypeArguments()
                    net.bytebuddy.description.type.TypeDescription r2 = r0.asErasure()
                    net.bytebuddy.description.type.TypeList$Generic r2 = r2.getTypeVariables()
                    r3 = 0
                Le:
                    int r4 = r1.size()
                    int r5 = r2.size()
                    int r4 = java.lang.Math.min(r4, r5)
                    if (r3 >= r4) goto L30
                    java.lang.Object r4 = r2.get(r3)
                    boolean r4 = r7.equals(r4)
                    if (r4 == 0) goto L2d
                    java.lang.Object r7 = r1.get(r3)
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = (net.bytebuddy.description.type.TypeDescription.Generic) r7
                    return r7
                L2d:
                    int r3 = r3 + 1
                    goto Le
                L30:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getOwnerType()
                    if (r0 == 0) goto L40
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.getSort()
                    boolean r1 = r1.isParameterized()
                    if (r1 != 0) goto L1
                L40:
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                    return r7
            }

            @Override // net.bytebuddy.description.NamedElement
            public java.lang.String getActualName() {
                    r1 = this;
                    java.lang.String r0 = r1.toString()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A parameterized type does not imply a component type: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                    r3 = this;
                    net.bytebuddy.description.field.FieldList$TypeSubstituting r0 = new net.bytebuddy.description.field.FieldList$TypeSubstituting
                    net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                    net.bytebuddy.description.field.FieldList r1 = r1.getDeclaredFields()
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r2 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding
                    r2.<init>(r3)
                    r0.<init>(r3, r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                    r3 = this;
                    net.bytebuddy.description.method.MethodList$TypeSubstituting r0 = new net.bytebuddy.description.method.MethodList$TypeSubstituting
                    net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                    net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r2 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding
                    r2.<init>(r3)
                    r0.<init>(r3, r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                    r3 = this;
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure
                    net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                    net.bytebuddy.description.type.TypeList$Generic r1 = r1.getInterfaces()
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r2 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding
                    r2.<init>(r3)
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A parameterized type does not imply lower bounds: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> getRecordComponents() {
                    r3 = this;
                    net.bytebuddy.description.type.RecordComponentList$TypeSubstituting r0 = new net.bytebuddy.description.type.RecordComponentList$TypeSubstituting
                    net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                    net.bytebuddy.description.type.RecordComponentList r1 = r1.getRecordComponents()
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r2 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding
                    r2.<init>(r3)
                    r0.<init>(r3, r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDefinition.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.PARAMETERIZED
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                    r3 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r3.asErasure()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                    if (r0 != 0) goto Ld
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                    goto L18
                Ld:
                    net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure r1 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r2 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding
                    r2.<init>(r3)
                    r1.<init>(r0, r2)
                    r0 = r1
                L18:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public java.lang.String getSymbol() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A parameterized type does not imply a symbol: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public java.lang.String getTypeName() {
                    r1 = this;
                    java.lang.String r0 = r1.toString()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A parameterized type does not imply a type variable source: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A parameterized type does not imply upper bounds: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            public int hashCode() {
                    r3 = this;
                    int r0 = r3.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L37
                L6:
                    net.bytebuddy.description.type.TypeList$Generic r0 = r3.getTypeArguments()
                    java.util.Iterator r0 = r0.iterator()
                    r1 = 1
                Lf:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L23
                    java.lang.Object r2 = r0.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    int r1 = r1 * 31
                    int r2 = r2.hashCode()
                    int r1 = r1 + r2
                    goto Lf
                L23:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getOwnerType()
                    if (r0 != 0) goto L32
                    net.bytebuddy.description.type.TypeDescription r0 = r3.asErasure()
                    int r0 = r0.hashCode()
                    goto L36
                L32:
                    int r0 = r0.hashCode()
                L36:
                    r0 = r0 ^ r1
                L37:
                    if (r0 != 0) goto L3c
                    int r0 = r3.hashCode
                    goto L3e
                L3c:
                    r3.hashCode = r0
                L3e:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isRecord() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.asErasure()
                    boolean r0 = r0.isRecord()
                    return r0
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$SuperClassIterator r0 = new net.bytebuddy.description.type.TypeDefinition$SuperClassIterator
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
            public boolean represents(java.lang.reflect.Type r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                    boolean r1 = r0.equals(r1)
                    return r1
            }

            public java.lang.String toString() {
                    r4 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$RenderingDelegate r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.CURRENT
                    net.bytebuddy.description.type.TypeDescription r2 = r4.asErasure()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.getOwnerType()
                    r1.apply(r0, r2, r3)
                    net.bytebuddy.description.type.TypeList$Generic r1 = r4.getTypeArguments()
                    boolean r2 = r1.isEmpty()
                    if (r2 != 0) goto L47
                    r2 = 60
                    r0.append(r2)
                    java.util.Iterator r1 = r1.iterator()
                    r2 = 0
                L26:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L42
                    java.lang.Object r3 = r1.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    if (r2 == 0) goto L39
                    java.lang.String r2 = ", "
                    r0.append(r2)
                L39:
                    java.lang.String r2 = r3.getTypeName()
                    r0.append(r2)
                    r2 = 1
                    goto L26
                L42:
                    r1 = 62
                    r0.append(r1)
                L47:
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public static abstract class OfTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase {
            private transient /* synthetic */ int hashCode;

            public static class ForLoadedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                private final java.lang.reflect.TypeVariable<?> typeVariable;

                public static class TypeVariableBoundList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                    private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                    private final java.lang.reflect.Type[] bound;

                    public TypeVariableBoundList(java.lang.reflect.Type[] r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                            r0 = this;
                            r0.<init>()
                            r0.bound = r1
                            r0.annotationReader = r2
                            return
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.type.TypeDescription.Generic get(int r3) {
                            r2 = this;
                            java.lang.reflect.Type[] r0 = r2.bound
                            r0 = r0[r3]
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.annotationReader
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r3 = r1.ofTypeVariableBoundType(r3)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r3)
                            return r3
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            java.lang.reflect.Type[] r0 = r1.bound
                            int r0 = r0.length
                            return r0
                    }
                }

                public ForLoadedType(java.lang.reflect.TypeVariable<?> r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        r1.<init>(r2, r0)
                        return
                }

                public ForLoadedType(java.lang.reflect.TypeVariable<?> r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                        r0 = this;
                        r0.<init>()
                        r0.typeVariable = r1
                        r0.annotationReader = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable, net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r0 = r1.annotationReader
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.asList()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public java.lang.String getSymbol() {
                        r1 = this;
                        java.lang.reflect.TypeVariable<?> r0 = r1.typeVariable
                        java.lang.String r0 = r0.getName()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                        r4 = this;
                        java.lang.reflect.TypeVariable<?> r0 = r4.typeVariable
                        java.lang.reflect.GenericDeclaration r0 = r0.getGenericDeclaration()
                        boolean r1 = r0 instanceof java.lang.Class
                        if (r1 == 0) goto L11
                        java.lang.Class r0 = (java.lang.Class) r0
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                    L11:
                        boolean r1 = r0 instanceof java.lang.reflect.Method
                        if (r1 == 0) goto L1d
                        net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r1 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                        java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                        r1.<init>(r0)
                        return r1
                    L1d:
                        boolean r1 = r0 instanceof java.lang.reflect.Constructor
                        if (r1 == 0) goto L29
                        net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r1 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                        java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                        r1.<init>(r0)
                        return r1
                    L29:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Unknown declaration: "
                        r2.append(r3)
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        r1.<init>(r0)
                        throw r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$ForLoadedType$TypeVariableBoundList r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$ForLoadedType$TypeVariableBoundList
                        java.lang.reflect.TypeVariable<?> r1 = r3.typeVariable
                        java.lang.reflect.Type[] r1 = r1.getBounds()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r3.annotationReader
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable, net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
                public boolean represents(java.lang.reflect.Type r2) {
                        r1 = this;
                        java.lang.reflect.TypeVariable<?> r0 = r1.typeVariable
                        if (r0 == r2) goto Ld
                        boolean r2 = super.represents(r2)
                        if (r2 == 0) goto Lb
                        goto Ld
                    Lb:
                        r2 = 0
                        goto Le
                    Ld:
                        r2 = 1
                    Le:
                        return r2
                }
            }

            public static class Symbolic extends net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase {
                private final net.bytebuddy.description.annotation.AnnotationSource annotationSource;
                private final java.lang.String symbol;

                public Symbolic(java.lang.String r1, net.bytebuddy.description.annotation.AnnotationSource r2) {
                        r0 = this;
                        r0.<init>()
                        r0.symbol = r1
                        r0.annotationSource = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public <T> T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<T> r1) {
                        r0 = this;
                        java.lang.Object r1 = r1.onTypeVariable(r0)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply an erasure: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                        r3 = this;
                        r0 = 1
                        if (r3 != r4) goto L4
                        return r0
                    L4:
                        boolean r1 = r4 instanceof net.bytebuddy.description.type.TypeDescription.Generic
                        r2 = 0
                        if (r1 != 0) goto La
                        return r2
                    La:
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                        net.bytebuddy.description.type.TypeDefinition$Sort r1 = r4.getSort()
                        boolean r1 = r1.isTypeVariable()
                        if (r1 == 0) goto L25
                        java.lang.String r1 = r3.getSymbol()
                        java.lang.String r4 = r4.getSymbol()
                        boolean r4 = r1.equals(r4)
                        if (r4 == 0) goto L25
                        goto L26
                    L25:
                        r0 = r2
                    L26:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeDescription.Generic findBindingOf(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "A symbolic type variable does not imply type arguments: "
                        r0.append(r1)
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        r3.<init>(r0)
                        throw r3
                }

                @Override // net.bytebuddy.description.NamedElement
                public java.lang.String getActualName() {
                        r1 = this;
                        java.lang.String r0 = r1.getSymbol()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply a component type: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationSource r0 = r1.annotationSource
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply field definitions: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply method definitions: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply an interface type definition: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply lower bounds: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply an owner type: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> getRecordComponents() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply record component definitions: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDefinition.Sort getSort() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE_SYMBOLIC
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                        r1 = this;
                        net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply a super type definition: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public java.lang.String getSymbol() {
                        r1 = this;
                        java.lang.String r0 = r1.symbol
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply type arguments: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public java.lang.String getTypeName() {
                        r1 = this;
                        java.lang.String r0 = r1.toString()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply a variable source: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply an upper type bound: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                public int hashCode() {
                        r1 = this;
                        java.lang.String r0 = r1.symbol
                        int r0 = r0.hashCode()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public boolean isArray() {
                        r1 = this;
                        r0 = 0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public boolean isPrimitive() {
                        r1 = this;
                        r0 = 0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public boolean isRecord() {
                        r1 = this;
                        r0 = 0
                        return r0
                }

                @Override // java.lang.Iterable
                public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A symbolic type variable does not imply a super type definition: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
                public boolean represents(java.lang.reflect.Type r1) {
                        r0 = this;
                        r1.getClass()
                        r1 = 0
                        return r1
                }

                public java.lang.String toString() {
                        r1 = this;
                        java.lang.String r0 = r1.getSymbol()
                        return r0
                }
            }

            public static class WithAnnotationOverlay extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                private final net.bytebuddy.description.annotation.AnnotationSource annotationSource;
                private final net.bytebuddy.description.type.TypeDescription.Generic typeVariable;

                public WithAnnotationOverlay(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.annotation.AnnotationSource r2) {
                        r0 = this;
                        r0.<init>()
                        r0.typeVariable = r1
                        r0.annotationSource = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable, net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationSource r0 = r1.annotationSource
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public java.lang.String getSymbol() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                        java.lang.String r0 = r0.getSymbol()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                        net.bytebuddy.description.TypeVariableSource r0 = r0.getTypeVariableSource()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getUpperBounds()
                        return r0
                }
            }

            public OfTypeVariable() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<T> r1) {
                    r0 = this;
                    java.lang.Object r1 = r1.onTypeVariable(r0)
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDescription asErasure() {
                    r2 = this;
                    net.bytebuddy.description.type.TypeList$Generic r0 = r2.getUpperBounds()
                    boolean r1 = r0.isEmpty()
                    if (r1 == 0) goto L11
                    java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                    goto L1c
                L11:
                    r1 = 0
                    java.lang.Object r0 = r0.get(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                L1c:
                    return r0
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof net.bytebuddy.description.type.TypeDescription.Generic
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r5.getSort()
                    boolean r1 = r1.isTypeVariable()
                    if (r1 == 0) goto L33
                    java.lang.String r1 = r4.getSymbol()
                    java.lang.String r3 = r5.getSymbol()
                    boolean r1 = r1.equals(r3)
                    if (r1 == 0) goto L33
                    net.bytebuddy.description.TypeVariableSource r1 = r4.getTypeVariableSource()
                    net.bytebuddy.description.TypeVariableSource r5 = r5.getTypeVariableSource()
                    boolean r5 = r1.equals(r5)
                    if (r5 == 0) goto L33
                    goto L34
                L33:
                    r0 = r2
                L34:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeDescription.Generic findBindingOf(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                    r2 = this;
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "A type variable does not imply type arguments: "
                    r0.append(r1)
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
            }

            @Override // net.bytebuddy.description.NamedElement
            public java.lang.String getActualName() {
                    r1 = this;
                    java.lang.String r0 = r1.getSymbol()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply a component type: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply field definitions: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply method definitions: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply an interface type definition: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply lower bounds: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply an owner type: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> getRecordComponents() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply record component definitions: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDefinition.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply a super type definition: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply type arguments: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public java.lang.String getTypeName() {
                    r1 = this;
                    java.lang.String r0 = r1.toString()
                    return r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            public int hashCode() {
                    r2 = this;
                    int r0 = r2.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L17
                L6:
                    net.bytebuddy.description.TypeVariableSource r0 = r2.getTypeVariableSource()
                    int r0 = r0.hashCode()
                    java.lang.String r1 = r2.getSymbol()
                    int r1 = r1.hashCode()
                    r0 = r0 ^ r1
                L17:
                    if (r0 != 0) goto L1c
                    int r0 = r2.hashCode
                    goto L1e
                L1c:
                    r2.hashCode = r0
                L1e:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isRecord() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A type variable does not imply a super type definition: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
            public boolean represents(java.lang.reflect.Type r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                    boolean r1 = r0.equals(r1)
                    return r1
            }

            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = r1.getSymbol()
                    return r0
            }
        }

        public static abstract class OfWildcardType extends net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase {
            public static final java.lang.String SYMBOL = "?";
            private transient /* synthetic */ int hashCode;

            public static class ForLoadedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType {
                private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                private final java.lang.reflect.WildcardType wildcardType;

                public static class WildcardLowerBoundTypeList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                    private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                    private final java.lang.reflect.Type[] lowerBound;

                    public WildcardLowerBoundTypeList(java.lang.reflect.Type[] r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                            r0 = this;
                            r0.<init>()
                            r0.lowerBound = r1
                            r0.annotationReader = r2
                            return
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.type.TypeDescription.Generic get(int r3) {
                            r2 = this;
                            java.lang.reflect.Type[] r0 = r2.lowerBound
                            r0 = r0[r3]
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.annotationReader
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r3 = r1.ofWildcardLowerBoundType(r3)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r3)
                            return r3
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            java.lang.reflect.Type[] r0 = r1.lowerBound
                            int r0 = r0.length
                            return r0
                    }
                }

                public static class WildcardUpperBoundTypeList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                    private final net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader annotationReader;
                    private final java.lang.reflect.Type[] upperBound;

                    public WildcardUpperBoundTypeList(java.lang.reflect.Type[] r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                            r0 = this;
                            r0.<init>()
                            r0.upperBound = r1
                            r0.annotationReader = r2
                            return
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.type.TypeDescription.Generic get(int r3) {
                            r2 = this;
                            java.lang.reflect.Type[] r0 = r2.upperBound
                            r0 = r0[r3]
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r2.annotationReader
                            net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r3 = r1.ofWildcardUpperBoundType(r3)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r3)
                            return r3
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            java.lang.reflect.Type[] r0 = r1.upperBound
                            int r0 = r0.length
                            return r0
                    }
                }

                public ForLoadedType(java.lang.reflect.WildcardType r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                        r1.<init>(r2, r0)
                        return
                }

                public ForLoadedType(java.lang.reflect.WildcardType r1, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r2) {
                        r0 = this;
                        r0.<init>()
                        r0.wildcardType = r1
                        r0.annotationReader = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType, net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r0 = r1.annotationReader
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.asList()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList
                        java.lang.reflect.WildcardType r1 = r3.wildcardType
                        java.lang.reflect.Type[] r1 = r1.getLowerBounds()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r3.annotationReader
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardUpperBoundTypeList r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardUpperBoundTypeList
                        java.lang.reflect.WildcardType r1 = r3.wildcardType
                        java.lang.reflect.Type[] r1 = r1.getUpperBounds()
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r2 = r3.annotationReader
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType, net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
                public boolean represents(java.lang.reflect.Type r2) {
                        r1 = this;
                        java.lang.reflect.WildcardType r0 = r1.wildcardType
                        if (r0 == r2) goto Ld
                        boolean r2 = super.represents(r2)
                        if (r2 == 0) goto Lb
                        goto Ld
                    Lb:
                        r2 = 0
                        goto Le
                    Ld:
                        r2 = 1
                    Le:
                        return r2
                }
            }

            public static class Latent extends net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType {
                private final net.bytebuddy.description.annotation.AnnotationSource annotationSource;
                private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> lowerBounds;
                private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> upperBounds;

                public Latent(java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2, net.bytebuddy.description.annotation.AnnotationSource r3) {
                        r0 = this;
                        r0.<init>()
                        r0.upperBounds = r1
                        r0.lowerBounds = r2
                        r0.annotationSource = r3
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic boundedAbove(net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.description.annotation.AnnotationSource r3) {
                        net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent
                        java.util.List r2 = java.util.Collections.singletonList(r2)
                        java.util.List r1 = java.util.Collections.emptyList()
                        r0.<init>(r2, r1, r3)
                        return r0
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic boundedBelow(net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.description.annotation.AnnotationSource r3) {
                        net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent
                        java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
                        java.util.List r1 = java.util.Collections.singletonList(r1)
                        java.util.List r2 = java.util.Collections.singletonList(r2)
                        r0.<init>(r1, r2, r3)
                        return r0
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic unbounded(net.bytebuddy.description.annotation.AnnotationSource r3) {
                        net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent
                        java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
                        java.util.List r1 = java.util.Collections.singletonList(r1)
                        java.util.List r2 = java.util.Collections.emptyList()
                        r0.<init>(r1, r2, r3)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType, net.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getComponentType()
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationSource r0 = r1.annotationSource
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.lowerBounds
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.upperBounds
                        r0.<init>(r1)
                        return r0
                }
            }

            public OfWildcardType() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<T> r1) {
                    r0 = this;
                    java.lang.Object r1 = r1.onWildcard(r0)
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDescription asErasure() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not represent an erasable type: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof net.bytebuddy.description.type.TypeDescription.Generic
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r5.getSort()
                    boolean r1 = r1.isWildcard()
                    if (r1 == 0) goto L33
                    net.bytebuddy.description.type.TypeList$Generic r1 = r4.getUpperBounds()
                    net.bytebuddy.description.type.TypeList$Generic r3 = r5.getUpperBounds()
                    boolean r1 = r1.equals(r3)
                    if (r1 == 0) goto L33
                    net.bytebuddy.description.type.TypeList$Generic r1 = r4.getLowerBounds()
                    net.bytebuddy.description.type.TypeList$Generic r5 = r5.getLowerBounds()
                    boolean r5 = r1.equals(r5)
                    if (r5 == 0) goto L33
                    goto L34
                L33:
                    r0 = r2
                L34:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeDescription.Generic findBindingOf(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                    r2 = this;
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "A wildcard does not imply type arguments: "
                    r0.append(r1)
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
            }

            @Override // net.bytebuddy.description.NamedElement
            public java.lang.String getActualName() {
                    r1 = this;
                    java.lang.String r0 = r1.toString()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply a component type: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply field definitions: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply method definitions: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply an interface type definition: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply an owner type: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> getRecordComponents() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply record component definitions: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeDefinition.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.WILDCARD
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply an operand stack size: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply a super type definition: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public java.lang.String getSymbol() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply a symbol: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply type arguments: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public java.lang.String getTypeName() {
                    r1 = this;
                    java.lang.String r0 = r1.toString()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply a type variable source: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            public int hashCode() {
                    r4 = this;
                    int r0 = r4.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L42
                L6:
                    net.bytebuddy.description.type.TypeList$Generic r0 = r4.getLowerBounds()
                    java.util.Iterator r0 = r0.iterator()
                    r1 = 1
                    r2 = r1
                L10:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L24
                    java.lang.Object r3 = r0.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    int r2 = r2 * 31
                    int r3 = r3.hashCode()
                    int r2 = r2 + r3
                    goto L10
                L24:
                    net.bytebuddy.description.type.TypeList$Generic r0 = r4.getUpperBounds()
                    java.util.Iterator r0 = r0.iterator()
                L2c:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L40
                    java.lang.Object r3 = r0.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    int r1 = r1 * 31
                    int r3 = r3.hashCode()
                    int r1 = r1 + r3
                    goto L2c
                L40:
                    r0 = r2 ^ r1
                L42:
                    if (r0 != 0) goto L47
                    int r0 = r4.hashCode
                    goto L49
                L47:
                    r4.hashCode = r0
                L49:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isRecord() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "A wildcard does not imply a super type definition: "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, net.bytebuddy.description.type.TypeDefinition
            public boolean represents(java.lang.reflect.Type r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                    boolean r1 = r0.equals(r1)
                    return r1
            }

            public java.lang.String toString() {
                    r5 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "?"
                    r0.<init>(r1)
                    net.bytebuddy.description.type.TypeList$Generic r2 = r5.getLowerBounds()
                    boolean r3 = r2.isEmpty()
                    if (r3 != 0) goto L17
                    java.lang.String r1 = " super "
                    r0.append(r1)
                    goto L33
                L17:
                    net.bytebuddy.description.type.TypeList$Generic r2 = r5.getUpperBounds()
                    java.lang.Object r3 = r2.getOnly()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r4)
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L2e
                    return r1
                L2e:
                    java.lang.String r1 = " extends "
                    r0.append(r1)
                L33:
                    java.lang.Object r1 = r2.getOnly()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = (net.bytebuddy.description.type.TypeDescription.Generic) r1
                    java.lang.String r1 = r1.getTypeName()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public interface Visitor<T> {

            public enum AnnotationStripper extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic> {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper INSTANCE = null;

                public static class NonAnnotatedTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                    private final net.bytebuddy.description.type.TypeDescription.Generic typeVariable;

                    public NonAnnotatedTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            r0.<init>()
                            r0.typeVariable = r1
                            return
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                            r0.<init>()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public java.lang.String getSymbol() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                            java.lang.String r0 = r0.getSymbol()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                            net.bytebuddy.description.TypeVariableSource r0 = r0.getTypeVariableSource()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.getUpperBounds()
                            return r0
                    }
                }

                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper.INSTANCE = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper[] r0 = new net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper[]{r0}
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper.$VALUES = r0
                        return
                }

                AnnotationStripper(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.AnnotationStripper[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                        java.lang.Object r3 = r3.accept(r2)
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                        net.bytebuddy.description.annotation.AnnotationSource$Empty r1 = net.bytebuddy.description.annotation.AnnotationSource.Empty.INSTANCE
                        r0.<init>(r3, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        boolean r0 = r3.isArray()
                        if (r0 == 0) goto L16
                        net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r2.onNonGenericType2(r3)
                        net.bytebuddy.description.annotation.AnnotationSource$Empty r1 = net.bytebuddy.description.annotation.AnnotationSource.Empty.INSTANCE
                        r0.<init>(r3, r1)
                        goto L21
                    L16:
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                        net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                        net.bytebuddy.description.annotation.AnnotationSource$Empty r1 = net.bytebuddy.description.annotation.AnnotationSource.Empty.INSTANCE
                        r0.<init>(r3, r1)
                    L21:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r5) {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getOwnerType()
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$Latent r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$Latent
                        net.bytebuddy.description.type.TypeDescription r2 = r5.asErasure()
                        if (r0 != 0) goto Lf
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L15
                    Lf:
                        java.lang.Object r0 = r0.accept(r4)
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    L15:
                        net.bytebuddy.description.type.TypeList$Generic r5 = r5.getTypeArguments()
                        net.bytebuddy.description.type.TypeList$Generic r5 = r5.accept(r4)
                        net.bytebuddy.description.annotation.AnnotationSource$Empty r3 = net.bytebuddy.description.annotation.AnnotationSource.Empty.INSTANCE
                        r1.<init>(r2, r0, r5, r3)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper$NonAnnotatedTypeVariable r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$AnnotationStripper$NonAnnotatedTypeVariable
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent
                        net.bytebuddy.description.type.TypeList$Generic r1 = r4.getUpperBounds()
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.accept(r3)
                        net.bytebuddy.description.type.TypeList$Generic r4 = r4.getLowerBounds()
                        net.bytebuddy.description.type.TypeList$Generic r4 = r4.accept(r3)
                        net.bytebuddy.description.annotation.AnnotationSource$Empty r2 = net.bytebuddy.description.annotation.AnnotationSource.Empty.INSTANCE
                        r0.<init>(r1, r4, r2)
                        return r0
                }
            }

            public enum Assigner extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher> {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner INSTANCE = null;

                public interface Dispatcher {

                    public static abstract class AbstractBase implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<java.lang.Boolean> {
                        public AbstractBase() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                        public boolean isAssignableFrom(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Object r1 = r1.accept(r0)
                                java.lang.Boolean r1 = (java.lang.Boolean) r1
                                boolean r1 = r1.booleanValue()
                                return r1
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class ForGenericArray extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.AbstractBase {
                        private final net.bytebuddy.description.type.TypeDescription.Generic genericArray;

                        public ForGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                r0.<init>()
                                r0.genericArray = r1
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
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.genericArray
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForGenericArray r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForGenericArray) r5
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.genericArray
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
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.genericArray
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                r2 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.genericArray
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getComponentType()
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.INSTANCE
                                java.lang.Object r0 = r0.accept(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher) r0
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                                boolean r3 = r0.isAssignableFrom(r3)
                                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                                return r3
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onGenericArray(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                r2 = this;
                                boolean r0 = r3.isArray()
                                if (r0 == 0) goto L20
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.genericArray
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getComponentType()
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.INSTANCE
                                java.lang.Object r0 = r0.accept(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher) r0
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                                boolean r3 = r0.isAssignableFrom(r3)
                                if (r3 == 0) goto L20
                                r3 = 1
                                goto L21
                            L20:
                                r3 = 0
                            L21:
                                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                                return r3
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onNonGenericType(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                                return r1
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onParameterizedType(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                                return r1
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onTypeVariable(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                                r3 = this;
                                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "A wildcard is not a first-level type: "
                                r1.append(r2)
                                r1.append(r4)
                                java.lang.String r4 = r1.toString()
                                r0.<init>(r4)
                                throw r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onWildcard(r1)
                                return r1
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class ForNonGenericType extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.AbstractBase {
                        private final net.bytebuddy.description.type.TypeDescription typeDescription;

                        public ForNonGenericType(net.bytebuddy.description.type.TypeDescription r1) {
                                r0 = this;
                                r0.<init>()
                                r0.typeDescription = r1
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
                                net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForNonGenericType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForNonGenericType) r5
                                net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
                                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                r2 = this;
                                net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                                boolean r0 = r0.isArray()
                                if (r0 == 0) goto L22
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForNonGenericType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForNonGenericType
                                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                                net.bytebuddy.description.type.TypeDescription r1 = r1.getComponentType()
                                r0.<init>(r1)
                                java.lang.Object r3 = r3.accept(r0)
                                java.lang.Boolean r3 = (java.lang.Boolean) r3
                                boolean r3 = r3.booleanValue()
                                goto L3e
                            L22:
                                net.bytebuddy.description.type.TypeDescription r3 = r2.typeDescription
                                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                                boolean r3 = r3.represents(r0)
                                if (r3 != 0) goto L3d
                                net.bytebuddy.description.type.TypeList$Generic r3 = net.bytebuddy.description.type.TypeDescription.ARRAY_INTERFACES
                                net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                                boolean r3 = r3.contains(r0)
                                if (r3 == 0) goto L3b
                                goto L3d
                            L3b:
                                r3 = 0
                                goto L3e
                            L3d:
                                r3 = 1
                            L3e:
                                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                                return r3
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onGenericArray(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                                boolean r2 = r0.isAssignableFrom(r2)
                                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                                return r2
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onNonGenericType(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                r2 = this;
                                net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                                net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                                boolean r0 = r0.equals(r1)
                                if (r0 == 0) goto Lf
                                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                                return r3
                            Lf:
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getSuperClass()
                                if (r0 == 0) goto L1e
                                boolean r0 = r2.isAssignableFrom(r0)
                                if (r0 == 0) goto L1e
                                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                                return r3
                            L1e:
                                net.bytebuddy.description.type.TypeList$Generic r3 = r3.getInterfaces()
                                java.util.Iterator r3 = r3.iterator()
                            L26:
                                boolean r0 = r3.hasNext()
                                if (r0 == 0) goto L3b
                                java.lang.Object r0 = r3.next()
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                                boolean r0 = r2.isAssignableFrom(r0)
                                if (r0 == 0) goto L26
                                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                                return r3
                            L3b:
                                net.bytebuddy.description.type.TypeDescription r3 = r2.typeDescription
                                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                                boolean r3 = r3.represents(r0)
                                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                                return r3
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onParameterizedType(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                r1 = this;
                                net.bytebuddy.description.type.TypeList$Generic r2 = r2.getUpperBounds()
                                java.util.Iterator r2 = r2.iterator()
                            L8:
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L1d
                                java.lang.Object r0 = r2.next()
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                                boolean r0 = r1.isAssignableFrom(r0)
                                if (r0 == 0) goto L8
                                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                                return r2
                            L1d:
                                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                                return r2
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onTypeVariable(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                                r3 = this;
                                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "A wildcard is not a first-level type: "
                                r1.append(r2)
                                r1.append(r4)
                                java.lang.String r4 = r1.toString()
                                r0.<init>(r4)
                                throw r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onWildcard(r1)
                                return r1
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class ForParameterizedType extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.AbstractBase {
                        private final net.bytebuddy.description.type.TypeDescription.Generic parameterizedType;

                        public enum ParameterAssigner extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher> {
                            private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner[] $VALUES = null;
                            public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner INSTANCE = null;

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class ContravariantBinding implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher {
                                private final net.bytebuddy.description.type.TypeDescription.Generic lowerBound;

                                public ContravariantBinding(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.lowerBound = r1
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
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.lowerBound
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$ContravariantBinding r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner.ContravariantBinding) r5
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.lowerBound
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
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.lowerBound
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public boolean isAssignableFrom(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                                        r3 = this;
                                        net.bytebuddy.description.type.TypeDefinition$Sort r0 = r4.getSort()
                                        boolean r0 = r0.isWildcard()
                                        r1 = 0
                                        r2 = 1
                                        if (r0 == 0) goto L2e
                                        net.bytebuddy.description.type.TypeList$Generic r4 = r4.getLowerBounds()
                                        boolean r0 = r4.isEmpty()
                                        if (r0 != 0) goto L2d
                                        java.lang.Object r4 = r4.getOnly()
                                        net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.INSTANCE
                                        java.lang.Object r4 = r4.accept(r0)
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r4 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher) r4
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.lowerBound
                                        boolean r4 = r4.isAssignableFrom(r0)
                                        if (r4 == 0) goto L2d
                                        r1 = r2
                                    L2d:
                                        return r1
                                    L2e:
                                        net.bytebuddy.description.type.TypeDefinition$Sort r0 = r4.getSort()
                                        boolean r0 = r0.isWildcard()
                                        if (r0 != 0) goto L48
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.INSTANCE
                                        java.lang.Object r4 = r4.accept(r0)
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r4 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher) r4
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.lowerBound
                                        boolean r4 = r4.isAssignableFrom(r0)
                                        if (r4 == 0) goto L49
                                    L48:
                                        r1 = r2
                                    L49:
                                        return r1
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class CovariantBinding implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher {
                                private final net.bytebuddy.description.type.TypeDescription.Generic upperBound;

                                public CovariantBinding(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.upperBound = r1
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
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.upperBound
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$CovariantBinding r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner.CovariantBinding) r5
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.upperBound
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
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.upperBound
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public boolean isAssignableFrom(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                        r2 = this;
                                        net.bytebuddy.description.type.TypeDefinition$Sort r0 = r3.getSort()
                                        boolean r0 = r0.isWildcard()
                                        if (r0 == 0) goto L32
                                        net.bytebuddy.description.type.TypeList$Generic r0 = r3.getLowerBounds()
                                        boolean r0 = r0.isEmpty()
                                        if (r0 == 0) goto L30
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.upperBound
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.INSTANCE
                                        java.lang.Object r0 = r0.accept(r1)
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher) r0
                                        net.bytebuddy.description.type.TypeList$Generic r3 = r3.getUpperBounds()
                                        java.lang.Object r3 = r3.getOnly()
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                                        boolean r3 = r0.isAssignableFrom(r3)
                                        if (r3 == 0) goto L30
                                        r3 = 1
                                        goto L31
                                    L30:
                                        r3 = 0
                                    L31:
                                        return r3
                                    L32:
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.upperBound
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.INSTANCE
                                        java.lang.Object r0 = r0.accept(r1)
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher) r0
                                        boolean r3 = r0.isAssignableFrom(r3)
                                        return r3
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class InvariantBinding implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher {
                                private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

                                public InvariantBinding(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.typeDescription = r1
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
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner.InvariantBinding) r5
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.typeDescription
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
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public boolean isAssignableFrom(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                        r1 = this;
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeDescription
                                        boolean r2 = r2.equals(r0)
                                        return r2
                                }
                            }

                            static {
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner
                                    java.lang.String r1 = "INSTANCE"
                                    r2 = 0
                                    r0.<init>(r1, r2)
                                    net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner.INSTANCE = r0
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner[] r0 = new net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner[]{r0}
                                    net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner.$VALUES = r0
                                    return
                            }

                            ParameterAssigner(java.lang.String r1, int r2) {
                                    r0 = this;
                                    r0.<init>(r1, r2)
                                    return
                            }

                            public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner valueOf(java.lang.String r1) {
                                    java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner.class
                                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner) r1
                                    return r1
                            }

                            public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner[] values() {
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner.$VALUES
                                    java.lang.Object r0 = r0.clone()
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner[]) r0
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                    r0 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onGenericArray2(r1)
                                    return r1
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                            public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding
                                    r0.<init>(r2)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                    r0 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onNonGenericType2(r1)
                                    return r1
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                            public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding
                                    r0.<init>(r2)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                    r0 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onParameterizedType2(r1)
                                    return r1
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                            public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding
                                    r0.<init>(r2)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                    r0 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onTypeVariable2(r1)
                                    return r1
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                            public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$InvariantBinding
                                    r0.<init>(r2)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                    r0 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onWildcard2(r1)
                                    return r1
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                            public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                    r2 = this;
                                    net.bytebuddy.description.type.TypeList$Generic r0 = r3.getLowerBounds()
                                    boolean r1 = r0.isEmpty()
                                    if (r1 == 0) goto L1a
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$CovariantBinding r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$CovariantBinding
                                    net.bytebuddy.description.type.TypeList$Generic r3 = r3.getUpperBounds()
                                    java.lang.Object r3 = r3.getOnly()
                                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                                    r0.<init>(r3)
                                    goto L26
                                L1a:
                                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$ContravariantBinding r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner$ContravariantBinding
                                    java.lang.Object r0 = r0.getOnly()
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                                    r3.<init>(r0)
                                    r0 = r3
                                L26:
                                    return r0
                            }
                        }

                        public ForParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                r0.<init>()
                                r0.parameterizedType = r1
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
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.parameterizedType
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType) r5
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.parameterizedType
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
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.parameterizedType
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                                return r1
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onGenericArray(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                r2 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.parameterizedType
                                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                                boolean r0 = r0.equals(r1)
                                if (r0 == 0) goto L13
                                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                                return r3
                            L13:
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getSuperClass()
                                if (r0 == 0) goto L22
                                boolean r0 = r2.isAssignableFrom(r0)
                                if (r0 == 0) goto L22
                                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                                return r3
                            L22:
                                net.bytebuddy.description.type.TypeList$Generic r3 = r3.getInterfaces()
                                java.util.Iterator r3 = r3.iterator()
                            L2a:
                                boolean r0 = r3.hasNext()
                                if (r0 == 0) goto L3f
                                java.lang.Object r0 = r3.next()
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                                boolean r0 = r2.isAssignableFrom(r0)
                                if (r0 == 0) goto L2a
                                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                                return r3
                            L3f:
                                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                                return r3
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onNonGenericType(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r5) {
                                r4 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.parameterizedType
                                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                net.bytebuddy.description.type.TypeDescription r1 = r5.asErasure()
                                boolean r0 = r0.equals(r1)
                                if (r0 == 0) goto L8e
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.parameterizedType
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getOwnerType()
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r5.getOwnerType()
                                if (r0 == 0) goto L2f
                                if (r1 == 0) goto L2f
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.INSTANCE
                                java.lang.Object r0 = r0.accept(r2)
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher) r0
                                boolean r0 = r0.isAssignableFrom(r1)
                                if (r0 != 0) goto L2f
                                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                                return r5
                            L2f:
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.parameterizedType
                                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getTypeArguments()
                                net.bytebuddy.description.type.TypeList$Generic r1 = r5.getTypeArguments()
                                int r2 = r0.size()
                                int r3 = r1.size()
                                if (r2 != r3) goto L6d
                                r5 = 0
                            L44:
                                int r2 = r0.size()
                                if (r5 >= r2) goto L6a
                                java.lang.Object r2 = r0.get(r5)
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType$ParameterAssigner r3 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForParameterizedType.ParameterAssigner.INSTANCE
                                java.lang.Object r2 = r2.accept(r3)
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r2 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher) r2
                                java.lang.Object r3 = r1.get(r5)
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                                boolean r2 = r2.isAssignableFrom(r3)
                                if (r2 != 0) goto L67
                                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                                return r5
                            L67:
                                int r5 = r5 + 1
                                goto L44
                            L6a:
                                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                                return r5
                            L6d:
                                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "Incompatible generic types: "
                                r1.append(r2)
                                r1.append(r5)
                                java.lang.String r5 = " and "
                                r1.append(r5)
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r4.parameterizedType
                                r1.append(r5)
                                java.lang.String r5 = r1.toString()
                                r0.<init>(r5)
                                throw r0
                            L8e:
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getSuperClass()
                                if (r0 == 0) goto L9d
                                boolean r0 = r4.isAssignableFrom(r0)
                                if (r0 == 0) goto L9d
                                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                                return r5
                            L9d:
                                net.bytebuddy.description.type.TypeList$Generic r5 = r5.getInterfaces()
                                java.util.Iterator r5 = r5.iterator()
                            La5:
                                boolean r0 = r5.hasNext()
                                if (r0 == 0) goto Lba
                                java.lang.Object r0 = r5.next()
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                                boolean r0 = r4.isAssignableFrom(r0)
                                if (r0 == 0) goto La5
                                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                                return r5
                            Lba:
                                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                                return r5
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onParameterizedType(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                r1 = this;
                                net.bytebuddy.description.type.TypeList$Generic r2 = r2.getUpperBounds()
                                java.util.Iterator r2 = r2.iterator()
                            L8:
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L1d
                                java.lang.Object r0 = r2.next()
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                                boolean r0 = r1.isAssignableFrom(r0)
                                if (r0 == 0) goto L8
                                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                                return r2
                            L1d:
                                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                                return r2
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onTypeVariable(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                                r3 = this;
                                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "A wildcard is not a first-level type: "
                                r1.append(r2)
                                r1.append(r4)
                                java.lang.String r4 = r1.toString()
                                r0.<init>(r4)
                                throw r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onWildcard(r1)
                                return r1
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class ForTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.AbstractBase {
                        private final net.bytebuddy.description.type.TypeDescription.Generic typeVariable;

                        public ForTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                r0.<init>()
                                r0.typeVariable = r1
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
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeVariable
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForTypeVariable r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForTypeVariable) r5
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.typeVariable
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
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeVariable
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                                return r1
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onGenericArray(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                                return r1
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onNonGenericType(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                                return r1
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onParameterizedType(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto Lb
                                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                                return r2
                            Lb:
                                net.bytebuddy.description.type.TypeList$Generic r2 = r2.getUpperBounds()
                                java.util.Iterator r2 = r2.iterator()
                            L13:
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L28
                                java.lang.Object r0 = r2.next()
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                                boolean r0 = r1.isAssignableFrom(r0)
                                if (r0 == 0) goto L13
                                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                                return r2
                            L28:
                                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                                return r2
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onTypeVariable(r1)
                                return r1
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                                r3 = this;
                                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "A wildcard is not a first-level type: "
                                r1.append(r2)
                                r1.append(r4)
                                java.lang.String r4 = r1.toString()
                                r0.<init>(r4)
                                throw r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                java.lang.Boolean r1 = r0.onWildcard(r1)
                                return r1
                        }
                    }

                    boolean isAssignableFrom(net.bytebuddy.description.type.TypeDescription.Generic r1);
                }

                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.INSTANCE = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner[] r0 = new net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner[]{r0}
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.$VALUES = r0
                        return
                }

                Assigner(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForGenericArray r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForGenericArray
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForNonGenericType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForNonGenericType
                        net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForParameterizedType
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForTypeVariable r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher$ForTypeVariable
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Assigner$Dispatcher r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "A wildcard is not a first level type: "
                        r0.append(r1)
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        r3.<init>(r0)
                        throw r3
                }
            }

            public static class ForRawType implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic> {
                private final net.bytebuddy.description.type.TypeDescription declaringType;

                public ForRawType(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.declaringType = r1
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.declaringType
                        boolean r0 = r0.isGenerified()
                        if (r0 == 0) goto L12
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                        net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                        r0.<init>(r1, r3)
                        r3 = r0
                    L12:
                        return r3
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.declaringType
                        boolean r0 = r0.isGenerified()
                        if (r0 == 0) goto L12
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                        net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                        r0.<init>(r1, r3)
                        r3 = r0
                    L12:
                        return r3
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.declaringType
                        boolean r0 = r0.isGenerified()
                        if (r0 == 0) goto L12
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                        net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                        r0.<init>(r1, r3)
                        r3 = r0
                    L12:
                        return r3
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Did not expect wildcard on top-level: "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForSignatureVisitor implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.jar.asm.signature.SignatureVisitor> {
                private static final int ONLY_CHARACTER = 0;
                protected final net.bytebuddy.jar.asm.signature.SignatureVisitor signatureVisitor;

                public static class OfTypeArgument extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor {
                    public OfTypeArgument(net.bytebuddy.jar.asm.signature.SignatureVisitor r1) {
                            r0 = this;
                            r0.<init>(r1)
                            return
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onGenericArray2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r3.signatureVisitor
                            r2 = 61
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r1.visitTypeArgument(r2)
                            r0.<init>(r1)
                            r4.accept(r0)
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r3.signatureVisitor
                            return r4
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onNonGenericType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r3.signatureVisitor
                            r2 = 61
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r1.visitTypeArgument(r2)
                            r0.<init>(r1)
                            r4.accept(r0)
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r3.signatureVisitor
                            return r4
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onParameterizedType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r3.signatureVisitor
                            r2 = 61
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r1.visitTypeArgument(r2)
                            r0.<init>(r1)
                            r4.accept(r0)
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r3.signatureVisitor
                            return r4
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onTypeVariable2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r3.signatureVisitor
                            r2 = 61
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r1.visitTypeArgument(r2)
                            r0.<init>(r1)
                            r4.accept(r0)
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r3.signatureVisitor
                            return r4
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onWildcard2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r3 = this;
                            net.bytebuddy.description.type.TypeList$Generic r0 = r4.getUpperBounds()
                            net.bytebuddy.description.type.TypeList$Generic r4 = r4.getLowerBounds()
                            boolean r1 = r4.isEmpty()
                            if (r1 == 0) goto L22
                            java.lang.Object r1 = r0.getOnly()
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = (net.bytebuddy.description.type.TypeDescription.Generic) r1
                            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                            boolean r1 = r1.represents(r2)
                            if (r1 == 0) goto L22
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r3.signatureVisitor
                            r4.visitTypeArgument()
                            goto L55
                        L22:
                            boolean r1 = r4.isEmpty()
                            if (r1 != 0) goto L3f
                            java.lang.Object r4 = r4.getOnly()
                            net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r3.signatureVisitor
                            r2 = 45
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r1.visitTypeArgument(r2)
                            r0.<init>(r1)
                            r4.accept(r0)
                            goto L55
                        L3f:
                            java.lang.Object r4 = r0.getOnly()
                            net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r3.signatureVisitor
                            r2 = 43
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r1.visitTypeArgument(r2)
                            r0.<init>(r1)
                            r4.accept(r0)
                        L55:
                            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r3.signatureVisitor
                            return r4
                    }
                }

                public ForSignatureVisitor(net.bytebuddy.jar.asm.signature.SignatureVisitor r1) {
                        r0 = this;
                        r0.<init>()
                        r0.signatureVisitor = r1
                        return
                }

                private void onOwnableType(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.getOwnerType()
                        if (r0 == 0) goto L21
                        net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.getSort()
                        boolean r1 = r1.isParameterized()
                        if (r1 == 0) goto L21
                        r3.onOwnableType(r0)
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r3.signatureVisitor
                        net.bytebuddy.description.type.TypeDescription r1 = r4.asErasure()
                        java.lang.String r1 = r1.getSimpleName()
                        r0.visitInnerClassType(r1)
                        goto L2e
                    L21:
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r3.signatureVisitor
                        net.bytebuddy.description.type.TypeDescription r1 = r4.asErasure()
                        java.lang.String r1 = r1.getInternalName()
                        r0.visitClassType(r1)
                    L2e:
                        net.bytebuddy.description.type.TypeList$Generic r4 = r4.getTypeArguments()
                        java.util.Iterator r4 = r4.iterator()
                    L36:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L4d
                        java.lang.Object r0 = r4.next()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor$OfTypeArgument r1 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor$OfTypeArgument
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r2 = r3.signatureVisitor
                        r1.<init>(r2)
                        r0.accept(r1)
                        goto L36
                    L4d:
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
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r2 = r4.signatureVisitor
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor) r5
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r5 = r5.signatureVisitor
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
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r2.signatureVisitor
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.jar.asm.signature.SignatureVisitor onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r2.signatureVisitor
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r1.visitArrayType()
                        r0.<init>(r1)
                        r3.accept(r0)
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r3 = r2.signatureVisitor
                        return r3
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.jar.asm.signature.SignatureVisitor onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        boolean r0 = r3.isArray()
                        if (r0 == 0) goto L19
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r2.signatureVisitor
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r1.visitArrayType()
                        r0.<init>(r1)
                        r3.accept(r0)
                        goto L44
                    L19:
                        boolean r0 = r3.isPrimitive()
                        if (r0 == 0) goto L32
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r2.signatureVisitor
                        net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                        java.lang.String r3 = r3.getDescriptor()
                        r1 = 0
                        char r3 = r3.charAt(r1)
                        r0.visitBaseType(r3)
                        goto L44
                    L32:
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r2.signatureVisitor
                        net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                        java.lang.String r3 = r3.getInternalName()
                        r0.visitClassType(r3)
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r3 = r2.signatureVisitor
                        r3.visitEnd()
                    L44:
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r3 = r2.signatureVisitor
                        return r3
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.jar.asm.signature.SignatureVisitor onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        r0.onOwnableType(r1)
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.signatureVisitor
                        r1.visitEnd()
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.signatureVisitor
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.jar.asm.signature.SignatureVisitor onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
                        java.lang.String r2 = r2.getSymbol()
                        r0.visitTypeVariable(r2)
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r2 = r1.signatureVisitor
                        return r2
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.signature.SignatureVisitor onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.jar.asm.signature.SignatureVisitor onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Unexpected wildcard: "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            public enum NoOp extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic> {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp INSTANCE = null;

                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp.INSTANCE = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp[] r0 = new net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp[]{r0}
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp.$VALUES = r0
                        return
                }

                NoOp(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$NoOp[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.NoOp[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Reducing implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription> {
                private final net.bytebuddy.description.type.TypeDescription declaringType;
                private final java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> typeVariableTokens;

                public Reducing(net.bytebuddy.description.type.TypeDescription r1, java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r2) {
                        r0 = this;
                        r0.<init>()
                        r0.declaringType = r1
                        r0.typeVariableTokens = r2
                        return
                }

                public Reducing(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeVariableToken... r2) {
                        r0 = this;
                        java.util.List r2 = java.util.Arrays.asList(r2)
                        r0.<init>(r1, r2)
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.declaringType
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reducing r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reducing) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.declaringType
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r2 = r4.typeVariableTokens
                        java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r5.typeVariableTokens
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.declaringType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r1 = r2.typeVariableTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r7) {
                        r6 = this;
                        r0 = 0
                        r1 = r7
                        r2 = r0
                    L3:
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getComponentType()
                        int r2 = r2 + 1
                        boolean r3 = r1.isArray()
                        if (r3 != 0) goto L3
                        net.bytebuddy.description.type.TypeDefinition$Sort r3 = r1.getSort()
                        boolean r3 = r3.isTypeVariable()
                        if (r3 == 0) goto L67
                        java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r7 = r6.typeVariableTokens
                        java.util.Iterator r7 = r7.iterator()
                    L1f:
                        boolean r3 = r7.hasNext()
                        if (r3 == 0) goto L4e
                        java.lang.Object r3 = r7.next()
                        net.bytebuddy.description.type.TypeVariableToken r3 = (net.bytebuddy.description.type.TypeVariableToken) r3
                        java.lang.String r4 = r1.getSymbol()
                        java.lang.String r5 = r3.getSymbol()
                        boolean r4 = r4.equals(r5)
                        if (r4 == 0) goto L1f
                        net.bytebuddy.description.type.TypeList$Generic r7 = r3.getBounds()
                        java.lang.Object r7 = r7.get(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic r7 = (net.bytebuddy.description.type.TypeDescription.Generic) r7
                        java.lang.Object r7 = r7.accept(r6)
                        net.bytebuddy.description.type.TypeDescription r7 = (net.bytebuddy.description.type.TypeDescription) r7
                        net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r7, r2)
                        return r7
                    L4e:
                        net.bytebuddy.description.type.TypeDescription r7 = r6.declaringType
                        java.lang.String r0 = r1.getSymbol()
                        net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.findExpectedVariable(r0)
                        net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                        net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r7, r2)
                        net.bytebuddy.description.type.TypeDescription r0 = r6.declaringType
                        net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.dynamic.TargetType.resolve(r7, r0)
                        return r7
                    L67:
                        net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                        net.bytebuddy.description.type.TypeDescription r0 = r6.declaringType
                        net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.dynamic.TargetType.resolve(r7, r0)
                        return r7
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                        net.bytebuddy.description.type.TypeDescription r0 = r1.declaringType
                        net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.dynamic.TargetType.resolve(r2, r0)
                        return r2
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                        net.bytebuddy.description.type.TypeDescription r0 = r1.declaringType
                        net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.dynamic.TargetType.resolve(r2, r0)
                        return r2
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r5) {
                        r4 = this;
                        java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r0 = r4.typeVariableTokens
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L32
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.description.type.TypeVariableToken r1 = (net.bytebuddy.description.type.TypeVariableToken) r1
                        java.lang.String r2 = r5.getSymbol()
                        java.lang.String r3 = r1.getSymbol()
                        boolean r2 = r2.equals(r3)
                        if (r2 == 0) goto L6
                        net.bytebuddy.description.type.TypeList$Generic r5 = r1.getBounds()
                        r0 = 0
                        java.lang.Object r5 = r5.get(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                        java.lang.Object r5 = r5.accept(r4)
                        net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                        return r5
                    L32:
                        net.bytebuddy.description.type.TypeDescription r0 = r4.declaringType
                        java.lang.String r5 = r5.getSymbol()
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r0.findExpectedVariable(r5)
                        net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                        net.bytebuddy.description.type.TypeDescription r0 = r4.declaringType
                        net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.dynamic.TargetType.resolve(r5, r0)
                        return r5
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "A wildcard cannot be a top-level type: "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            public enum Reifying extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic> {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying INHERITING = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying INITIATING = null;



                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying$1 r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying$1
                        java.lang.String r1 = "INITIATING"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INITIATING = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying$2 r1 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying$2
                        java.lang.String r3 = "INHERITING"
                        r4 = 1
                        r1.<init>(r3, r4)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INHERITING = r1
                        r3 = 2
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying[] r3 = new net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying[r3]
                        r3[r2] = r0
                        r3[r4] = r1
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.$VALUES = r3
                        return
                }

                Reifying(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                /* synthetic */ Reifying(java.lang.String r1, int r2, net.bytebuddy.description.type.TypeDescription.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot reify a generic array: "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r3.asErasure()
                        boolean r1 = r0.isGenerified()
                        if (r1 == 0) goto Lf
                        net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForReifiedErasure r3 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForReifiedErasure
                        r3.<init>(r0)
                    Lf:
                        return r3
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot reify a type variable: "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot reify a wildcard: "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            public static abstract class Substitutor implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic> {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForAttachment extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor {
                    private final net.bytebuddy.description.type.TypeDescription declaringType;
                    private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                    public ForAttachment(net.bytebuddy.description.type.TypeDefinition r1, net.bytebuddy.description.TypeVariableSource r2) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                            r0.<init>(r1, r2)
                            return
                    }

                    public ForAttachment(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.TypeVariableSource r2) {
                            r0 = this;
                            r0.<init>()
                            r0.declaringType = r1
                            r0.typeVariableSource = r2
                            return
                    }

                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment of(net.bytebuddy.description.field.FieldDescription r2) {
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment
                            net.bytebuddy.description.type.TypeDefinition r1 = r2.getDeclaringType()
                            net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                            r0.<init>(r1, r2)
                            return r0
                    }

                    public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment of(net.bytebuddy.description.method.MethodDescription r2) {
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment
                            net.bytebuddy.description.type.TypeDefinition r1 = r2.getDeclaringType()
                            r0.<init>(r1, r2)
                            return r0
                    }

                    public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment of(net.bytebuddy.description.method.ParameterDescription r2) {
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment
                            net.bytebuddy.description.method.MethodDescription r1 = r2.getDeclaringMethod()
                            net.bytebuddy.description.type.TypeDefinition r1 = r1.getDeclaringType()
                            net.bytebuddy.description.method.MethodDescription r2 = r2.getDeclaringMethod()
                            r0.<init>(r1, r2)
                            return r0
                    }

                    public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment of(net.bytebuddy.description.type.RecordComponentDescription r2) {
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment
                            net.bytebuddy.description.type.TypeDefinition r1 = r2.getDeclaringType()
                            net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                            r0.<init>(r1, r2)
                            return r0
                    }

                    public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment of(net.bytebuddy.description.type.TypeDescription r1) {
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment
                            r0.<init>(r1, r1)
                            return r0
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.declaringType
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment) r5
                            net.bytebuddy.description.type.TypeDescription r3 = r5.declaringType
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.TypeVariableSource r2 = r4.typeVariableSource
                            net.bytebuddy.description.TypeVariableSource r5 = r5.typeVariableSource
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
                            net.bytebuddy.description.type.TypeDescription r1 = r2.declaringType
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.TypeVariableSource r1 = r2.typeVariableSource
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onGenericArray2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onNonGenericType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onParameterizedType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    public net.bytebuddy.description.type.TypeDescription.Generic onSimpleType(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            r2 = this;
                            java.lang.Class<net.bytebuddy.dynamic.TargetType> r0 = net.bytebuddy.dynamic.TargetType.class
                            boolean r0 = r3.represents(r0)
                            if (r0 == 0) goto L10
                            net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                            net.bytebuddy.description.type.TypeDescription r1 = r2.declaringType
                            r0.<init>(r1, r3)
                            r3 = r0
                        L10:
                            return r3
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$WithAnnotationOverlay r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$WithAnnotationOverlay
                            net.bytebuddy.description.TypeVariableSource r1 = r3.typeVariableSource
                            java.lang.String r2 = r4.getSymbol()
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.findExpectedVariable(r2)
                            r0.<init>(r1, r4)
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onWildcard2(r1)
                            return r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForDetachment extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor {
                    private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> typeMatcher;

                    public ForDetachment(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.typeMatcher = r1
                            return
                    }

                    public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic> of(net.bytebuddy.description.type.TypeDefinition r1) {
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment
                            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.is(r1)
                            r0.<init>(r1)
                            return r0
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
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2 = r4.typeMatcher
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForDetachment) r5
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r5 = r5.typeMatcher
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
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1 = r2.typeMatcher
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onGenericArray2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onNonGenericType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onParameterizedType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    public net.bytebuddy.description.type.TypeDescription.Generic onSimpleType(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r3 = this;
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0 = r3.typeMatcher
                            net.bytebuddy.description.type.TypeDescription r1 = r4.asErasure()
                            boolean r0 = r0.matches(r1)
                            if (r0 == 0) goto L18
                            net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.dynamic.TargetType.DESCRIPTION
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.getOwnerType()
                            r0.<init>(r1, r2, r4)
                            r4 = r0
                        L18:
                            return r4
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$Symbolic r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$Symbolic
                            java.lang.String r1 = r3.getSymbol()
                            r0.<init>(r1, r3)
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onWildcard2(r1)
                            return r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForReplacement extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor {
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public ForReplacement(net.bytebuddy.description.type.TypeDescription r1) {
                            r0 = this;
                            r0.<init>()
                            r0.typeDescription = r1
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForReplacement r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForReplacement) r5
                            net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onGenericArray2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onNonGenericType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onParameterizedType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    public net.bytebuddy.description.type.TypeDescription.Generic onSimpleType(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r3.asErasure()
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L14
                            net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            r0.<init>(r1, r3)
                            r3 = r0
                        L14:
                            return r3
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onWildcard2(r1)
                            return r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForTokenNormalization extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor {
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public ForTokenNormalization(net.bytebuddy.description.type.TypeDescription r1) {
                            r0 = this;
                            r0.<init>()
                            r0.typeDescription = r1
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTokenNormalization r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTokenNormalization) r5
                            net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onGenericArray2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onNonGenericType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onParameterizedType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    public net.bytebuddy.description.type.TypeDescription.Generic onSimpleType(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            r2 = this;
                            java.lang.Class<net.bytebuddy.dynamic.TargetType> r0 = net.bytebuddy.dynamic.TargetType.class
                            boolean r0 = r3.represents(r0)
                            if (r0 == 0) goto L10
                            net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$Latent
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            r0.<init>(r1, r3)
                            r3 = r0
                        L10:
                            return r3
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$Symbolic r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$Symbolic
                            java.lang.String r1 = r3.getSymbol()
                            r0.<init>(r1, r3)
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onWildcard2(r1)
                            return r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForTypeVariableBinding extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.WithoutTypeSubstitution {
                    private final net.bytebuddy.description.type.TypeDescription.Generic parameterizedType;

                    public class RetainedMethodTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                        final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTypeVariableBinding this$0;
                        private final net.bytebuddy.description.type.TypeDescription.Generic typeVariable;

                        public RetainedMethodTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTypeVariableBinding r1, net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                r0.typeVariable = r2
                                return
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public java.lang.String getSymbol() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                java.lang.String r0 = r0.getSymbol()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                net.bytebuddy.description.TypeVariableSource r0 = r0.getTypeVariableSource()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                                r2 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.typeVariable
                                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getUpperBounds()
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r1 = r2.this$0
                                net.bytebuddy.description.type.TypeList$Generic r0 = r0.accept(r1)
                                return r0
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class TypeVariableSubstitutor implements net.bytebuddy.description.TypeVariableSource.Visitor<net.bytebuddy.description.type.TypeDescription.Generic> {
                        final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTypeVariableBinding this$0;
                        private final net.bytebuddy.description.type.TypeDescription.Generic typeVariable;

                        public TypeVariableSubstitutor(net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTypeVariableBinding r1, net.bytebuddy.description.type.TypeDescription.Generic r2) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                r0.typeVariable = r2
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
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeVariable
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding$TypeVariableSubstitutor r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTypeVariableBinding.TypeVariableSubstitutor) r5
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.typeVariable
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L20
                                return r1
                            L20:
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r2 = r4.this$0
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r5 = r5.this$0
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
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeVariable
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r1 = r2.this$0
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.description.TypeVariableSource.Visitor
                        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onMethod2(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.description.TypeVariableSource.Visitor
                        /* JADX INFO: renamed from: onMethod, reason: avoid collision after fix types in other method */
                        public net.bytebuddy.description.type.TypeDescription.Generic onMethod2(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                                r2 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding$RetainedMethodTypeVariable r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding$RetainedMethodTypeVariable
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r0 = r2.this$0
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeVariable
                                r3.<init>(r0, r1)
                                return r3
                        }

                        @Override // net.bytebuddy.description.TypeVariableSource.Visitor
                        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onType(net.bytebuddy.description.type.TypeDescription r1) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onType2(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.description.TypeVariableSource.Visitor
                        /* JADX INFO: renamed from: onType, reason: avoid collision after fix types in other method */
                        public net.bytebuddy.description.type.TypeDescription.Generic onType2(net.bytebuddy.description.type.TypeDescription r2) {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r2 = r1.this$0
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTypeVariableBinding.access$200(r2)
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.findBindingOf(r0)
                                if (r2 != 0) goto L14
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r1.typeVariable
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asRawType()
                            L14:
                                return r2
                        }
                    }

                    public ForTypeVariableBinding(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            r0.<init>()
                            r0.parameterizedType = r1
                            return
                    }

                    public static /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic access$200(net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTypeVariableBinding r0) {
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.parameterizedType
                            return r0
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
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.parameterizedType
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForTypeVariableBinding) r5
                            net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.parameterizedType
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
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.parameterizedType
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            r2 = this;
                            net.bytebuddy.description.TypeVariableSource r0 = r3.getTypeVariableSource()
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding$TypeVariableSubstitutor r1 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForTypeVariableBinding$TypeVariableSubstitutor
                            r1.<init>(r2, r3)
                            java.lang.Object r3 = r0.accept(r1)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                            return r3
                    }
                }

                public static abstract class WithoutTypeSubstitution extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor {
                    public WithoutTypeSubstitution() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onGenericArray2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onNonGenericType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onParameterizedType2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    public net.bytebuddy.description.type.TypeDescription.Generic onSimpleType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = super.onWildcard2(r1)
                            return r1
                    }
                }

                public Substitutor() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getComponentType()
                        java.lang.Object r1 = r1.accept(r2)
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = (net.bytebuddy.description.type.TypeDescription.Generic) r1
                        r0.<init>(r1, r3)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r2 = this;
                        boolean r0 = r3.isArray()
                        if (r0 == 0) goto L16
                        net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$Latent
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getComponentType()
                        java.lang.Object r1 = r1.accept(r2)
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = (net.bytebuddy.description.type.TypeDescription.Generic) r1
                        r0.<init>(r1, r3)
                        goto L1a
                    L16:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.onSimpleType(r3)
                    L1a:
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r5) {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getOwnerType()
                        java.util.ArrayList r1 = new java.util.ArrayList
                        net.bytebuddy.description.type.TypeList$Generic r2 = r5.getTypeArguments()
                        int r2 = r2.size()
                        r1.<init>(r2)
                        net.bytebuddy.description.type.TypeList$Generic r2 = r5.getTypeArguments()
                        java.util.Iterator r2 = r2.iterator()
                    L19:
                        boolean r3 = r2.hasNext()
                        if (r3 == 0) goto L2d
                        java.lang.Object r3 = r2.next()
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                        java.lang.Object r3 = r3.accept(r4)
                        r1.add(r3)
                        goto L19
                    L2d:
                        net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$Latent r2 = new net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$Latent
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.asRawType()
                        java.lang.Object r3 = r3.accept(r4)
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                        net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                        if (r0 != 0) goto L42
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        goto L48
                    L42:
                        java.lang.Object r0 = r0.accept(r4)
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    L48:
                        r2.<init>(r3, r0, r1, r5)
                        return r2
                }

                public abstract net.bytebuddy.description.type.TypeDescription.Generic onSimpleType(net.bytebuddy.description.type.TypeDescription.Generic r1);

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$Latent
                        net.bytebuddy.description.type.TypeList$Generic r1 = r4.getUpperBounds()
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.accept(r3)
                        net.bytebuddy.description.type.TypeList$Generic r2 = r4.getLowerBounds()
                        net.bytebuddy.description.type.TypeList$Generic r2 = r2.accept(r3)
                        r0.<init>(r1, r2, r4)
                        return r0
                }
            }

            public enum TypeErasing extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.description.type.TypeDescription.Generic> {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing INSTANCE = null;

                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.INSTANCE = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing[] r0 = new net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing[]{r0}
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.$VALUES = r0
                        return
                }

                TypeErasing(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onGenericArray2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asRawType()
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onNonGenericType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asRawType()
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onParameterizedType2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asRawType()
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asRawType()
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onWildcard2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot erase a wildcard type: "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            public enum Validator extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<java.lang.Boolean> {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator EXCEPTION = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator FIELD = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator INTERFACE = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator METHOD_PARAMETER = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator METHOD_RETURN = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator RECEIVER = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator SUPER_CLASS = null;
                public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator TYPE_VARIABLE = null;
                private final boolean acceptsArray;
                private final boolean acceptsPrimitive;
                private final boolean acceptsVariable;
                private final boolean acceptsVoid;




                public enum ForTypeAnnotations extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations> implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<java.lang.Boolean> {
                    private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations[] $VALUES = null;
                    public static final net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations INSTANCE = null;
                    private static final java.lang.String TYPE_PARAMETER = "TYPE_PARAMETER";
                    private static final java.lang.String TYPE_USE = "TYPE_USE";

                    static {
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE = r0
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations[] r0 = new net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations[]{r0}
                            net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.$VALUES = r0
                            return
                    }

                    ForTypeAnnotations(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    private boolean isValid(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r3 = this;
                            java.util.HashSet r0 = new java.util.HashSet
                            r0.<init>()
                            net.bytebuddy.description.annotation.AnnotationList r4 = r4.getDeclaredAnnotations()
                            java.util.Iterator r4 = r4.iterator()
                        Ld:
                            boolean r1 = r4.hasNext()
                            if (r1 == 0) goto L2d
                            java.lang.Object r1 = r4.next()
                            net.bytebuddy.description.annotation.AnnotationDescription r1 = (net.bytebuddy.description.annotation.AnnotationDescription) r1
                            java.lang.String r2 = "TYPE_USE"
                            boolean r2 = r1.isSupportedOn(r2)
                            if (r2 == 0) goto L2b
                            net.bytebuddy.description.type.TypeDescription r1 = r1.getAnnotationType()
                            boolean r1 = r0.add(r1)
                            if (r1 != 0) goto Ld
                        L2b:
                            r4 = 0
                            return r4
                        L2d:
                            r4 = 1
                            return r4
                    }

                    public static boolean ofFormalTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            java.util.HashSet r0 = new java.util.HashSet
                            r0.<init>()
                            net.bytebuddy.description.annotation.AnnotationList r3 = r3.getDeclaredAnnotations()
                            java.util.Iterator r3 = r3.iterator()
                        Ld:
                            boolean r1 = r3.hasNext()
                            if (r1 == 0) goto L2d
                            java.lang.Object r1 = r3.next()
                            net.bytebuddy.description.annotation.AnnotationDescription r1 = (net.bytebuddy.description.annotation.AnnotationDescription) r1
                            java.lang.String r2 = "TYPE_PARAMETER"
                            boolean r2 = r1.isSupportedOn(r2)
                            if (r2 == 0) goto L2b
                            net.bytebuddy.description.type.TypeDescription r1 = r1.getAnnotationType()
                            boolean r1 = r0.add(r1)
                            if (r1 != 0) goto Ld
                        L2b:
                            r3 = 0
                            return r3
                        L2d:
                            r3 = 1
                            return r3
                    }

                    public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations) r1
                            return r1
                    }

                    public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations[] values() {
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations[]) r0
                            return r0
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                            r1 = this;
                            boolean r0 = r1.isValid(r2)
                            if (r0 == 0) goto L18
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getComponentType()
                            java.lang.Object r2 = r2.accept(r1)
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r2 = r2.booleanValue()
                            if (r2 == 0) goto L18
                            r2 = 1
                            goto L19
                        L18:
                            r2 = 0
                        L19:
                            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                            return r2
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            java.lang.Boolean r1 = r0.onGenericArray(r1)
                            return r1
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                            r1 = this;
                            boolean r0 = r1.isValid(r2)
                            if (r0 == 0) goto L1e
                            boolean r0 = r2.isArray()
                            if (r0 == 0) goto L1c
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getComponentType()
                            java.lang.Object r2 = r2.accept(r1)
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r2 = r2.booleanValue()
                            if (r2 == 0) goto L1e
                        L1c:
                            r2 = 1
                            goto L1f
                        L1e:
                            r2 = 0
                        L1f:
                            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                            return r2
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            java.lang.Boolean r1 = r0.onNonGenericType(r1)
                            return r1
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                            r1 = this;
                            boolean r0 = r1.isValid(r2)
                            if (r0 != 0) goto L9
                            java.lang.Boolean r2 = java.lang.Boolean.FALSE
                            return r2
                        L9:
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.getOwnerType()
                            if (r0 == 0) goto L1e
                            java.lang.Object r0 = r0.accept(r1)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 != 0) goto L1e
                            java.lang.Boolean r2 = java.lang.Boolean.FALSE
                            return r2
                        L1e:
                            net.bytebuddy.description.type.TypeList$Generic r2 = r2.getTypeArguments()
                            java.util.Iterator r2 = r2.iterator()
                        L26:
                            boolean r0 = r2.hasNext()
                            if (r0 == 0) goto L41
                            java.lang.Object r0 = r2.next()
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                            java.lang.Object r0 = r0.accept(r1)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 != 0) goto L26
                            java.lang.Boolean r2 = java.lang.Boolean.FALSE
                            return r2
                        L41:
                            java.lang.Boolean r2 = java.lang.Boolean.TRUE
                            return r2
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            java.lang.Boolean r1 = r0.onParameterizedType(r1)
                            return r1
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            boolean r1 = r0.isValid(r1)
                            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            java.lang.Boolean r1 = r0.onTypeVariable(r1)
                            return r1
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                            r2 = this;
                            boolean r0 = r2.isValid(r3)
                            if (r0 != 0) goto L9
                            java.lang.Boolean r3 = java.lang.Boolean.FALSE
                            return r3
                        L9:
                            net.bytebuddy.description.type.TypeList$Generic r0 = r3.getLowerBounds()
                            boolean r1 = r0.isEmpty()
                            if (r1 == 0) goto L17
                            net.bytebuddy.description.type.TypeList$Generic r0 = r3.getUpperBounds()
                        L17:
                            java.lang.Object r3 = r0.getOnly()
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                            java.lang.Object r3 = r3.accept(r2)
                            java.lang.Boolean r3 = (java.lang.Boolean) r3
                            return r3
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            r0 = this;
                            java.lang.Boolean r1 = r0.onWildcard(r1)
                            return r1
                    }
                }

                static {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$1 r7 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$1
                        r5 = 0
                        r6 = 0
                        java.lang.String r1 = "SUPER_CLASS"
                        r2 = 0
                        r3 = 0
                        r4 = 0
                        r0 = r7
                        r0.<init>(r1, r2, r3, r4, r5, r6)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.SUPER_CLASS = r7
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$2 r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$2
                        r13 = 0
                        r14 = 0
                        java.lang.String r9 = "INTERFACE"
                        r10 = 1
                        r11 = 0
                        r12 = 0
                        r8 = r0
                        r8.<init>(r9, r10, r11, r12, r13, r14)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.INTERFACE = r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r1 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator
                        r20 = 1
                        r21 = 0
                        java.lang.String r16 = "TYPE_VARIABLE"
                        r17 = 2
                        r18 = 0
                        r19 = 0
                        r15 = r1
                        r15.<init>(r16, r17, r18, r19, r20, r21)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE = r1
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r2 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator
                        r13 = 1
                        java.lang.String r9 = "FIELD"
                        r10 = 3
                        r11 = 1
                        r12 = 1
                        r8 = r2
                        r8.<init>(r9, r10, r11, r12, r13, r14)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.FIELD = r2
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator
                        r21 = 1
                        java.lang.String r16 = "METHOD_RETURN"
                        r17 = 4
                        r18 = 1
                        r19 = 1
                        r15 = r3
                        r15.<init>(r16, r17, r18, r19, r20, r21)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.METHOD_RETURN = r3
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r4 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator
                        java.lang.String r9 = "METHOD_PARAMETER"
                        r10 = 5
                        r8 = r4
                        r8.<init>(r9, r10, r11, r12, r13, r14)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.METHOD_PARAMETER = r4
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$3 r5 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$3
                        r21 = 0
                        java.lang.String r16 = "EXCEPTION"
                        r17 = 6
                        r18 = 0
                        r19 = 0
                        r15 = r5
                        r15.<init>(r16, r17, r18, r19, r20, r21)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.EXCEPTION = r5
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r6 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator
                        r13 = 0
                        java.lang.String r9 = "RECEIVER"
                        r10 = 7
                        r11 = 0
                        r12 = 0
                        r8 = r6
                        r8.<init>(r9, r10, r11, r12, r13, r14)
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.RECEIVER = r6
                        r8 = 8
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator[] r8 = new net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator[r8]
                        r9 = 0
                        r8[r9] = r7
                        r7 = 1
                        r8[r7] = r0
                        r0 = 2
                        r8[r0] = r1
                        r0 = 3
                        r8[r0] = r2
                        r0 = 4
                        r8[r0] = r3
                        r0 = 5
                        r8[r0] = r4
                        r0 = 6
                        r8[r0] = r5
                        r0 = 7
                        r8[r0] = r6
                        net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.$VALUES = r8
                        return
                }

                Validator(java.lang.String r1, int r2, boolean r3, boolean r4, boolean r5, boolean r6) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.acceptsArray = r3
                        r0.acceptsPrimitive = r4
                        r0.acceptsVariable = r5
                        r0.acceptsVoid = r6
                        return
                }

                /* synthetic */ Validator(java.lang.String r1, int r2, boolean r3, boolean r4, boolean r5, boolean r6, net.bytebuddy.description.type.TypeDescription.AnonymousClass1 r7) {
                        r0 = this;
                        r0.<init>(r1, r2, r3, r4, r5, r6)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator> r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r1 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator[] values() {
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator[] r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator[] r0 = (net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator[]) r0
                        return r0
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        boolean r1 = r0.acceptsArray
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        java.lang.Boolean r1 = r0.onGenericArray(r1)
                        return r1
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r1 = this;
                        boolean r0 = r1.acceptsArray
                        if (r0 != 0) goto La
                        boolean r0 = r2.isArray()
                        if (r0 != 0) goto L21
                    La:
                        boolean r0 = r1.acceptsPrimitive
                        if (r0 != 0) goto L14
                        boolean r0 = r2.isPrimitive()
                        if (r0 != 0) goto L21
                    L14:
                        boolean r0 = r1.acceptsVoid
                        if (r0 != 0) goto L23
                        java.lang.Class r0 = java.lang.Void.TYPE
                        boolean r2 = r2.represents(r0)
                        if (r2 != 0) goto L21
                        goto L23
                    L21:
                        r2 = 0
                        goto L24
                    L23:
                        r2 = 1
                    L24:
                        java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                        return r2
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        java.lang.Boolean r1 = r0.onNonGenericType(r1)
                        return r1
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        java.lang.Boolean r1 = java.lang.Boolean.TRUE
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        java.lang.Boolean r1 = r0.onParameterizedType(r1)
                        return r1
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        boolean r1 = r0.acceptsVariable
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        java.lang.Boolean r1 = r0.onTypeVariable(r1)
                        return r1
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        java.lang.Boolean r1 = java.lang.Boolean.FALSE
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        java.lang.Boolean r1 = r0.onWildcard(r1)
                        return r1
                }
            }

            T onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1);

            T onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1);

            T onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1);

            T onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1);

            T onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1);
        }

        static {
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.LazyProxy.of(r0)
                net.bytebuddy.description.type.TypeDescription.Generic.OBJECT = r0
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.LazyProxy.of(r0)
                net.bytebuddy.description.type.TypeDescription.Generic.CLASS = r0
                java.lang.Class r0 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.LazyProxy.of(r0)
                net.bytebuddy.description.type.TypeDescription.Generic.VOID = r0
                java.lang.Class<java.lang.annotation.Annotation> r0 = java.lang.annotation.Annotation.class
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.LazyProxy.of(r0)
                net.bytebuddy.description.type.TypeDescription.Generic.ANNOTATION = r0
                r0 = 0
                net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED = r0
                return
        }

        <T> T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<T> r1);

        net.bytebuddy.description.type.TypeDescription.Generic asRawType();

        @net.bytebuddy.utility.nullability.MaybeNull
        net.bytebuddy.description.type.TypeDescription.Generic findBindingOf(net.bytebuddy.description.type.TypeDescription.Generic r1);

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        net.bytebuddy.description.type.TypeDescription.Generic getComponentType();

        @Override // net.bytebuddy.description.type.TypeDefinition
        net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InGenericShape> getDeclaredFields();

        @Override // net.bytebuddy.description.type.TypeDefinition
        net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InGenericShape> getDeclaredMethods();

        net.bytebuddy.description.type.TypeList.Generic getLowerBounds();

        @net.bytebuddy.utility.nullability.MaybeNull
        net.bytebuddy.description.type.TypeDescription.Generic getOwnerType();

        @Override // net.bytebuddy.description.type.TypeDefinition
        net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> getRecordComponents();

        java.lang.String getSymbol();

        net.bytebuddy.description.type.TypeList.Generic getTypeArguments();

        net.bytebuddy.description.TypeVariableSource getTypeVariableSource();

        net.bytebuddy.description.type.TypeList.Generic getUpperBounds();
    }

    public static class Latent extends net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType {
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> interfaces;
        private final int modifiers;
        private final java.lang.String name;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.type.TypeDescription.Generic superClass;

        public Latent(java.lang.String r1, int r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r3, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.modifiers = r2
                r0.superClass = r3
                r0.interfaces = r4
                return
        }

        public Latent(java.lang.String r1, int r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic... r4) {
                r0 = this;
                java.util.List r4 = java.util.Arrays.asList(r4)
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve declared annotations of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve declared fields of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve declared methods of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve inner types of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.DeclaredByType
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve declared type of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve enclosing method of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve enclosing type of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                r2 = this;
                net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.interfaces
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                int r0 = r1.modifiers
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getNestHost() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve nest host of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getNestMembers() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve nest mates of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.PackageDescription getPackage() {
                r4 = this;
                java.lang.String r0 = r4.getName()
                r1 = 46
                int r1 = r0.lastIndexOf(r1)
                r2 = -1
                if (r1 != r2) goto L10
                net.bytebuddy.description.type.PackageDescription r0 = net.bytebuddy.description.type.PackageDescription.DEFAULT
                goto L1b
            L10:
                net.bytebuddy.description.type.PackageDescription$Simple r2 = new net.bytebuddy.description.type.PackageDescription$Simple
                r3 = 0
                java.lang.String r0 = r0.substring(r3, r1)
                r2.<init>(r0)
                r0 = r2
            L1b:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve permitted subclasses of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve record components of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.superClass
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve type variables of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve anonymous type property of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve local class property of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isRecord() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot resolve record attribute of a latent type description: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class LazyProxy implements java.lang.reflect.InvocationHandler {
        private final java.lang.Class<?> type;

        public LazyProxy(java.lang.Class<?> r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                return
        }

        public static net.bytebuddy.description.type.TypeDescription of(java.lang.Class<?> r3) {
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.class
                java.lang.ClassLoader r1 = r0.getClassLoader()
                java.lang.Class[] r0 = new java.lang.Class[]{r0}
                net.bytebuddy.description.type.TypeDescription$LazyProxy r2 = new net.bytebuddy.description.type.TypeDescription$LazyProxy
                r2.<init>(r3)
                java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r1, r0, r2)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                return r3
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
                java.lang.Class<?> r2 = r4.type
                net.bytebuddy.description.type.TypeDescription$LazyProxy r5 = (net.bytebuddy.description.type.TypeDescription.LazyProxy) r5
                java.lang.Class<?> r5 = r5.type
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
                java.lang.Class<?> r1 = r2.type
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r1, java.lang.reflect.Method r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r3) throws java.lang.Throwable {
                r0 = this;
                java.lang.Class<?> r1 = r0.type     // Catch: java.lang.reflect.InvocationTargetException -> Lb
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)     // Catch: java.lang.reflect.InvocationTargetException -> Lb
                java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lb
                return r1
            Lb:
                r1 = move-exception
                java.lang.Throwable r1 = r1.getTargetException()
                throw r1
        }
    }

    public static class SuperTypeLoading extends net.bytebuddy.description.type.TypeDescription.AbstractBase {

        @net.bytebuddy.utility.nullability.MaybeNull
        private final java.lang.ClassLoader classLoader;
        private final net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate classLoadingDelegate;
        private final net.bytebuddy.description.type.TypeDescription delegate;

        public interface ClassLoadingDelegate {

            public enum Simple extends java.lang.Enum<net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple> implements net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate {
                private static final /* synthetic */ net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple[] $VALUES = null;
                public static final net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple INSTANCE = null;

                static {
                        net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate$Simple r0 = new net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate$Simple
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple.INSTANCE = r0
                        net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate$Simple[] r0 = new net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple[]{r0}
                        net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple.$VALUES = r0
                        return
                }

                Simple(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate$Simple> r0 = net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate$Simple r1 = (net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple) r1
                        return r1
                }

                public static net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple[] values() {
                        net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate$Simple[] r0 = net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate$Simple[] r0 = (net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate
                public java.lang.Class<?> load(java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3) throws java.lang.ClassNotFoundException {
                        r1 = this;
                        r0 = 0
                        java.lang.Class r2 = java.lang.Class.forName(r2, r0, r3)
                        return r2
                }
            }

            java.lang.Class<?> load(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) throws java.lang.ClassNotFoundException;
        }

        public static class ClassLoadingTypeList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.ClassLoader classLoader;
            private final net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate classLoadingDelegate;
            private final net.bytebuddy.description.type.TypeList.Generic delegate;

            public ClassLoadingTypeList(net.bytebuddy.description.type.TypeList.Generic r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate r3) {
                    r0 = this;
                    r0.<init>()
                    r0.delegate = r1
                    r0.classLoader = r2
                    r0.classLoadingDelegate = r3
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.type.TypeDescription.Generic get(int r4) {
                    r3 = this;
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeProjection r0 = new net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeProjection
                    net.bytebuddy.description.type.TypeList$Generic r1 = r3.delegate
                    java.lang.Object r4 = r1.get(r4)
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                    java.lang.ClassLoader r1 = r3.classLoader
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate r2 = r3.classLoadingDelegate
                    r0.<init>(r4, r1, r2)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Generic r0 = r1.delegate
                    int r0 = r0.size()
                    return r0
            }
        }

        public static class ClassLoadingTypeProjection extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection {

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.ClassLoader classLoader;
            private final net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate classLoadingDelegate;
            private final net.bytebuddy.description.type.TypeDescription.Generic delegate;
            private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription erasure;
            private transient /* synthetic */ net.bytebuddy.description.type.TypeList.Generic interfaces;
            private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic superClass;

            public ClassLoadingTypeProjection(net.bytebuddy.description.type.TypeDescription.Generic r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate r3) {
                    r0 = this;
                    r0.<init>()
                    r0.delegate = r1
                    r0.classLoader = r2
                    r0.classLoadingDelegate = r3
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.build.CachedReturnPlugin.Enhance("erasure")
            public net.bytebuddy.description.type.TypeDescription asErasure() {
                    r3 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r3.erasure
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L23
                L6:
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate r0 = r3.classLoadingDelegate     // Catch: java.lang.ClassNotFoundException -> L1d
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.delegate     // Catch: java.lang.ClassNotFoundException -> L1d
                    net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()     // Catch: java.lang.ClassNotFoundException -> L1d
                    java.lang.String r1 = r1.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
                    java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.ClassNotFoundException -> L1d
                    java.lang.Class r0 = r0.load(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1d
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)     // Catch: java.lang.ClassNotFoundException -> L1d
                    goto L23
                L1d:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.delegate
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                L23:
                    if (r0 != 0) goto L28
                    net.bytebuddy.description.type.TypeDescription r0 = r3.erasure
                    goto L2a
                L28:
                    r3.erasure = r0
                L2a:
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.delegate
                    net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.build.CachedReturnPlugin.Enhance("interfaces")
            public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                    r5 = this;
                    net.bytebuddy.description.type.TypeList$Generic r0 = r5.interfaces
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L2a
                L6:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.delegate
                    net.bytebuddy.description.type.TypeList$Generic r0 = r0.getInterfaces()
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeList r1 = new net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeList     // Catch: java.lang.ClassNotFoundException -> L2a
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate r2 = r5.classLoadingDelegate     // Catch: java.lang.ClassNotFoundException -> L2a
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.delegate     // Catch: java.lang.ClassNotFoundException -> L2a
                    net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()     // Catch: java.lang.ClassNotFoundException -> L2a
                    java.lang.String r3 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L2a
                    java.lang.ClassLoader r4 = r5.classLoader     // Catch: java.lang.ClassNotFoundException -> L2a
                    java.lang.Class r2 = r2.load(r3, r4)     // Catch: java.lang.ClassNotFoundException -> L2a
                    java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L2a
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate r3 = r5.classLoadingDelegate     // Catch: java.lang.ClassNotFoundException -> L2a
                    r1.<init>(r0, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L2a
                    r0 = r1
                L2a:
                    if (r0 != 0) goto L2f
                    net.bytebuddy.description.type.TypeList$Generic r0 = r5.interfaces
                    goto L31
                L2f:
                    r5.interfaces = r0
                L31:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.build.CachedReturnPlugin.Enhance("superClass")
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                    r5 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.superClass
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L2f
                L6:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.delegate
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                    if (r0 != 0) goto L11
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                    goto L2f
                L11:
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeProjection r1 = new net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeProjection     // Catch: java.lang.ClassNotFoundException -> L2f
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate r2 = r5.classLoadingDelegate     // Catch: java.lang.ClassNotFoundException -> L2f
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.delegate     // Catch: java.lang.ClassNotFoundException -> L2f
                    net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()     // Catch: java.lang.ClassNotFoundException -> L2f
                    java.lang.String r3 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L2f
                    java.lang.ClassLoader r4 = r5.classLoader     // Catch: java.lang.ClassNotFoundException -> L2f
                    java.lang.Class r2 = r2.load(r3, r4)     // Catch: java.lang.ClassNotFoundException -> L2f
                    java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L2f
                    net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate r3 = r5.classLoadingDelegate     // Catch: java.lang.ClassNotFoundException -> L2f
                    r1.<init>(r0, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L2f
                    r0 = r1
                L2f:
                    if (r0 != 0) goto L34
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.superClass
                    goto L36
                L34:
                    r5.superClass = r0
                L36:
                    return r0
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> iterator() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition$SuperClassIterator r0 = new net.bytebuddy.description.type.TypeDefinition$SuperClassIterator
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
            public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.delegate
                    return r0
            }
        }

        public SuperTypeLoading(net.bytebuddy.description.type.TypeDescription r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate$Simple r0 = net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate.Simple.INSTANCE
                r1.<init>(r2, r3, r0)
                return
        }

        public SuperTypeLoading(net.bytebuddy.description.type.TypeDescription r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate r3) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r0.classLoader = r2
                r0.classLoadingDelegate = r3
                return
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String getCanonicalName() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                java.lang.String r0 = r0.getCanonicalName()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.ClassFileVersion getClassFileVersion() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.ClassFileVersion r0 = r0.getClassFileVersion()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getComponentType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getComponentType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.TypeDescription r0 = r0.getComponentType()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.TypeList r0 = r0.getDeclaredTypes()
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithDescriptor
        public java.lang.String getDescriptor() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                java.lang.String r0 = r0.getDescriptor()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getEnclosingMethod()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.TypeDescription r0 = r0.getEnclosingType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                r4 = this;
                net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeList r0 = new net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeList
                net.bytebuddy.description.type.TypeDescription r1 = r4.delegate
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.getInterfaces()
                java.lang.ClassLoader r2 = r4.classLoader
                net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate r3 = r4.classLoadingDelegate
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getNestHost() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.TypeDescription r0 = r0.getNestHost()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getNestMembers() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.TypeList r0 = r0.getNestMembers()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.PackageDescription getPackage() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.PackageDescription r0 = r0.getPackage()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.TypeList r0 = r0.getPermittedSubtypes()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.RecordComponentList r0 = r0.getRecordComponents()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public java.lang.String getSimpleName() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                java.lang.String r0 = r0.getSimpleName()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.implementation.bytecode.StackSize getStackSize() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.implementation.bytecode.StackSize r0 = r0.getStackSize()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                r4 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r4.delegate
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                if (r0 != 0) goto Lb
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                goto L15
            Lb:
                net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeProjection r1 = new net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingTypeProjection
                java.lang.ClassLoader r2 = r4.classLoader
                net.bytebuddy.description.type.TypeDescription$SuperTypeLoading$ClassLoadingDelegate r3 = r4.classLoadingDelegate
                r1.<init>(r0, r2, r3)
                r0 = r1
            L15:
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getTypeVariables()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                boolean r0 = r0.isAnonymousType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isArray() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                boolean r0 = r0.isArray()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                boolean r0 = r0.isLocalType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isPrimitive() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                boolean r0 = r0.isPrimitive()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isRecord() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                boolean r0 = r0.isRecord()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isSealed() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.delegate
                boolean r0 = r0.isSealed()
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.LazyProxy.of(r0)
            net.bytebuddy.description.type.TypeDescription.OBJECT = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.LazyProxy.of(r0)
            net.bytebuddy.description.type.TypeDescription.STRING = r0
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.LazyProxy.of(r0)
            net.bytebuddy.description.type.TypeDescription.CLASS = r0
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.LazyProxy.of(r0)
            net.bytebuddy.description.type.TypeDescription.THROWABLE = r0
            java.lang.Class r0 = java.lang.Void.TYPE
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.LazyProxy.of(r0)
            net.bytebuddy.description.type.TypeDescription.VOID = r0
            net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
            r1 = 2
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Cloneable> r2 = java.lang.Cloneable.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            net.bytebuddy.description.type.TypeDescription.ARRAY_INTERFACES = r0
            r0 = 0
            net.bytebuddy.description.type.TypeDescription.UNDEFINED = r0
            return
    }

    net.bytebuddy.description.type.TypeDescription asBoxed();

    net.bytebuddy.description.type.TypeDescription asUnboxed();

    int getActualModifiers(boolean r1);

    @net.bytebuddy.utility.nullability.MaybeNull
    java.lang.String getCanonicalName();

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.ClassFileVersion getClassFileVersion();

    @Override // net.bytebuddy.description.type.TypeDefinition
    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.TypeDescription getComponentType();

    @Override // net.bytebuddy.description.type.TypeDefinition
    net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields();

    @Override // net.bytebuddy.description.type.TypeDefinition
    net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods();

    net.bytebuddy.description.type.TypeList getDeclaredTypes();

    @Override // net.bytebuddy.description.DeclaredByType
    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.TypeDescription getDeclaringType();

    @net.bytebuddy.utility.nullability.MaybeNull
    java.lang.Object getDefaultValue();

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod();

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.TypeDescription getEnclosingType();

    net.bytebuddy.description.annotation.AnnotationList getInheritedAnnotations();

    int getInnerClassCount();

    java.lang.String getLongSimpleName();

    net.bytebuddy.description.type.TypeDescription getNestHost();

    net.bytebuddy.description.type.TypeList getNestMembers();

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.PackageDescription getPackage();

    net.bytebuddy.description.type.TypeList getPermittedSubtypes();

    @Override // net.bytebuddy.description.type.TypeDefinition
    net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents();

    java.lang.String getSimpleName();

    boolean isAnnotationReturnType();

    boolean isAnnotationValue();

    boolean isAnnotationValue(java.lang.Object r1);

    boolean isAnonymousType();

    boolean isAssignableFrom(java.lang.Class<?> r1);

    boolean isAssignableFrom(net.bytebuddy.description.type.TypeDescription r1);

    boolean isAssignableTo(java.lang.Class<?> r1);

    boolean isAssignableTo(net.bytebuddy.description.type.TypeDescription r1);

    boolean isCompileTimeConstant();

    boolean isInHierarchyWith(java.lang.Class<?> r1);

    boolean isInHierarchyWith(net.bytebuddy.description.type.TypeDescription r1);

    boolean isInnerClass();

    boolean isInstance(java.lang.Object r1);

    boolean isLocalType();

    boolean isMemberType();

    boolean isNestHost();

    boolean isNestMateOf(java.lang.Class<?> r1);

    boolean isNestMateOf(net.bytebuddy.description.type.TypeDescription r1);

    boolean isNestedClass();

    boolean isPackageType();

    boolean isPrimitiveWrapper();

    boolean isSamePackage(net.bytebuddy.description.type.TypeDescription r1);

    boolean isSealed();
}

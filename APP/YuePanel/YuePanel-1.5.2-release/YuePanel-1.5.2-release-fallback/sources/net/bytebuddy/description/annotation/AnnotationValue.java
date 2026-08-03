package net.bytebuddy.description.annotation;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationValue<T, S> {

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final net.bytebuddy.description.annotation.AnnotationValue<?, ?> UNDEFINED = null;

    /* JADX INFO: renamed from: net.bytebuddy.description.annotation.AnnotationValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class AbstractBase<U, V> implements net.bytebuddy.description.annotation.AnnotationValue<U, V> {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<U, V> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.getReturnType()
                net.bytebuddy.description.annotation.AnnotationValue r2 = r1.filter(r2, r0)
                return r2
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public <W> W resolve(java.lang.Class<? extends W> r2) {
                r1 = this;
                java.lang.Object r0 = r1.resolve()
                java.lang.Object r2 = r2.cast(r0)
                return r2
        }
    }

    public static class ForAnnotationDescription<U extends java.lang.annotation.Annotation> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<net.bytebuddy.description.annotation.AnnotationDescription, U> {
        private final net.bytebuddy.description.annotation.AnnotationDescription annotationDescription;

        public static class Loaded<V extends java.lang.annotation.Annotation> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase<V> {
            private final V annotation;

            public Loaded(V r1) {
                    r0 = this;
                    r0.<init>()
                    r0.annotation = r1
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof net.bytebuddy.description.annotation.AnnotationValue.Loaded
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r4 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r4
                    net.bytebuddy.description.annotation.AnnotationValue$State r1 = r4.getState()
                    boolean r1 = r1.isResolved()
                    if (r1 == 0) goto L23
                    V extends java.lang.annotation.Annotation r1 = r3.annotation
                    java.lang.Object r4 = r4.resolve()
                    boolean r4 = r1.equals(r4)
                    if (r4 == 0) goto L23
                    goto L24
                L23:
                    r0 = r2
                L24:
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    V extends java.lang.annotation.Annotation r0 = r1.annotation
                    int r0 = r0.hashCode()
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public boolean represents(java.lang.Object r2) {
                    r1 = this;
                    V extends java.lang.annotation.Annotation r0 = r1.annotation
                    boolean r2 = r0.equals(r2)
                    return r2
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                    r1 = this;
                    java.lang.annotation.Annotation r0 = r1.resolve()
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public V resolve() {
                    r1 = this;
                    V extends java.lang.annotation.Annotation r0 = r1.annotation
                    return r0
            }

            public java.lang.String toString() {
                    r1 = this;
                    V extends java.lang.annotation.Annotation r0 = r1.annotation
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public ForAnnotationDescription(net.bytebuddy.description.annotation.AnnotationDescription r1) {
                r0 = this;
                r0.<init>()
                r0.annotationDescription = r1
                return
        }

        public static <V extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.annotation.AnnotationDescription, V> of(net.bytebuddy.description.type.TypeDescription r2, java.util.Map<java.lang.String, ? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r3) {
                net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription
                net.bytebuddy.description.annotation.AnnotationDescription$Latent r1 = new net.bytebuddy.description.annotation.AnnotationDescription$Latent
                r1.<init>(r2, r3)
                r0.<init>(r1)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                r1 = this;
                if (r1 == r2) goto L17
                boolean r0 = r2 instanceof net.bytebuddy.description.annotation.AnnotationValue
                if (r0 == 0) goto L15
                net.bytebuddy.description.annotation.AnnotationDescription r0 = r1.annotationDescription
                net.bytebuddy.description.annotation.AnnotationValue r2 = (net.bytebuddy.description.annotation.AnnotationValue) r2
                java.lang.Object r2 = r2.resolve()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L15
                goto L17
            L15:
                r2 = 0
                goto L18
            L17:
                r2 = 1
            L18:
                return r2
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.annotation.AnnotationDescription, U> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.description.type.TypeDefinition r4) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                net.bytebuddy.description.annotation.AnnotationDescription r0 = r2.annotationDescription
                net.bytebuddy.description.type.TypeDescription r0 = r0.getAnnotationType()
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L12
                r4 = r2
                goto L30
            L12:
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r4 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getReturnType()
                boolean r0 = r0.isArray()
                if (r0 == 0) goto L27
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ANNOTATION
                java.lang.String r0 = r0.toArrayErrorString(r1)
                goto L2d
            L27:
                net.bytebuddy.description.annotation.AnnotationDescription r0 = r2.annotationDescription
                java.lang.String r0 = r0.toString()
            L2d:
                r4.<init>(r3, r0)
            L30:
                return r4
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ANNOTATION
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                return r0
        }

        public int hashCode() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationDescription r0 = r1.annotationDescription
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<U> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r5) {
                r4 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription$Loaded     // Catch: java.lang.ClassNotFoundException -> L1d
                net.bytebuddy.description.annotation.AnnotationDescription r1 = r4.annotationDescription     // Catch: java.lang.ClassNotFoundException -> L1d
                net.bytebuddy.description.type.TypeDescription r2 = r1.getAnnotationType()     // Catch: java.lang.ClassNotFoundException -> L1d
                java.lang.String r2 = r2.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
                r3 = 0
                java.lang.Class r5 = java.lang.Class.forName(r2, r3, r5)     // Catch: java.lang.ClassNotFoundException -> L1d
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r5 = r1.prepare(r5)     // Catch: java.lang.ClassNotFoundException -> L1d
                java.lang.annotation.Annotation r5 = r5.load()     // Catch: java.lang.ClassNotFoundException -> L1d
                r0.<init>(r5)     // Catch: java.lang.ClassNotFoundException -> L1d
                return r0
            L1d:
                r5 = move-exception
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                net.bytebuddy.description.annotation.AnnotationDescription r1 = r4.annotationDescription
                net.bytebuddy.description.type.TypeDescription r1 = r1.getAnnotationType()
                java.lang.String r1 = r1.getName()
                r0.<init>(r1, r5)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationDescription r0 = r1.resolve()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationDescription resolve() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationDescription r0 = r1.annotationDescription
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationDescription r0 = r1.annotationDescription
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForConstant<U> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<U, U> {
        private transient /* synthetic */ int hashCode;
        private final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate propertyDelegate;
        private final U value;

        public static class Loaded<V> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase<V> {
            private transient /* synthetic */ int hashCode;
            private final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate propertyDelegate;
            private final V value;

            public Loaded(V r1, net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate r2) {
                    r0 = this;
                    r0.<init>()
                    r0.value = r1
                    r0.propertyDelegate = r2
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof net.bytebuddy.description.annotation.AnnotationValue.Loaded
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r5 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r5
                    net.bytebuddy.description.annotation.AnnotationValue$State r1 = r5.getState()
                    boolean r1 = r1.isResolved()
                    if (r1 == 0) goto L25
                    net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r1 = r4.propertyDelegate
                    V r3 = r4.value
                    java.lang.Object r5 = r5.resolve()
                    boolean r5 = r1.equals(r3, r5)
                    if (r5 == 0) goto L25
                    goto L26
                L25:
                    r0 = r2
                L26:
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                    return r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            public int hashCode() {
                    r2 = this;
                    int r0 = r2.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto Le
                L6:
                    net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r0 = r2.propertyDelegate
                    V r1 = r2.value
                    int r0 = r0.hashCode(r1)
                Le:
                    if (r0 != 0) goto L13
                    int r0 = r2.hashCode
                    goto L15
                L13:
                    r2.hashCode = r0
                L15:
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public boolean represents(java.lang.Object r3) {
                    r2 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r0 = r2.propertyDelegate
                    V r1 = r2.value
                    boolean r3 = r0.equals(r1, r3)
                    return r3
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public V resolve() {
                    r2 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r0 = r2.propertyDelegate
                    V r1 = r2.value
                    java.lang.Object r0 = r0.copy(r1)
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r0 = r2.propertyDelegate
                    V r1 = r2.value
                    java.lang.String r0 = r0.toString(r1)
                    return r0
            }
        }

        public interface PropertyDelegate {

            public enum ForArrayType extends java.lang.Enum<net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType> implements net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate {
                private static final /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType[] $VALUES = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType BOOLEAN = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType BYTE = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType CHARACTER = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType DOUBLE = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType FLOAT = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType INTEGER = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType LONG = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType SHORT = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType STRING = null;










                static {
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$1 r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$1
                        java.lang.String r1 = "BOOLEAN"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.BOOLEAN = r0
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$2 r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$2
                        java.lang.String r3 = "BYTE"
                        r4 = 1
                        r1.<init>(r3, r4)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.BYTE = r1
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$3 r3 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$3
                        java.lang.String r5 = "SHORT"
                        r6 = 2
                        r3.<init>(r5, r6)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.SHORT = r3
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$4 r5 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$4
                        java.lang.String r7 = "CHARACTER"
                        r8 = 3
                        r5.<init>(r7, r8)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.CHARACTER = r5
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$5 r7 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$5
                        java.lang.String r9 = "INTEGER"
                        r10 = 4
                        r7.<init>(r9, r10)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.INTEGER = r7
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$6 r9 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$6
                        java.lang.String r11 = "LONG"
                        r12 = 5
                        r9.<init>(r11, r12)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.LONG = r9
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$7 r11 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$7
                        java.lang.String r13 = "FLOAT"
                        r14 = 6
                        r11.<init>(r13, r14)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.FLOAT = r11
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$8 r13 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$8
                        java.lang.String r15 = "DOUBLE"
                        r14 = 7
                        r13.<init>(r15, r14)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.DOUBLE = r13
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$9 r15 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType$9
                        java.lang.String r14 = "STRING"
                        r12 = 8
                        r15.<init>(r14, r12)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.STRING = r15
                        r14 = 9
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType[] r14 = new net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType[r14]
                        r14[r2] = r0
                        r14[r4] = r1
                        r14[r6] = r3
                        r14[r8] = r5
                        r14[r10] = r7
                        r0 = 5
                        r14[r0] = r9
                        r0 = 6
                        r14[r0] = r11
                        r0 = 7
                        r14[r0] = r13
                        r14[r12] = r15
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.$VALUES = r14
                        return
                }

                ForArrayType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                /* synthetic */ ForArrayType(java.lang.String r1, int r2, net.bytebuddy.description.annotation.AnnotationValue.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType> r0 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = (net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType) r1
                        return r1
                }

                public static net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType[] values() {
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType[] r0 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType[] r0 = (net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public <S> S copy(S r1) {
                        r0 = this;
                        java.lang.Object r1 = r0.doCopy(r1)
                        return r1
                }

                public abstract java.lang.Object doCopy(java.lang.Object r1);

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public java.lang.String toString(java.lang.Object r4) {
                        r3 = this;
                        java.util.ArrayList r0 = new java.util.ArrayList
                        int r1 = java.lang.reflect.Array.getLength(r4)
                        r0.<init>(r1)
                        r1 = 0
                    La:
                        int r2 = java.lang.reflect.Array.getLength(r4)
                        if (r1 >= r2) goto L1a
                        java.lang.String r2 = r3.toString(r4, r1)
                        r0.add(r2)
                        int r1 = r1 + 1
                        goto La
                    L1a:
                        net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r4 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                        java.lang.String r4 = r4.toSourceString(r0)
                        return r4
                }

                public abstract java.lang.String toString(java.lang.Object r1, int r2);
            }

            public enum ForNonArrayType extends java.lang.Enum<net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType> implements net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate {
                private static final /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType[] $VALUES = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType BOOLEAN = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType BYTE = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType CHARACTER = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType DOUBLE = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType FLOAT = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType INTEGER = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType LONG = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType SHORT = null;
                public static final net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType STRING = null;










                static {
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$1 r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$1
                        java.lang.String r1 = "BOOLEAN"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.BOOLEAN = r0
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$2 r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$2
                        java.lang.String r3 = "BYTE"
                        r4 = 1
                        r1.<init>(r3, r4)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.BYTE = r1
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$3 r3 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$3
                        java.lang.String r5 = "SHORT"
                        r6 = 2
                        r3.<init>(r5, r6)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.SHORT = r3
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$4 r5 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$4
                        java.lang.String r7 = "CHARACTER"
                        r8 = 3
                        r5.<init>(r7, r8)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.CHARACTER = r5
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$5 r7 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$5
                        java.lang.String r9 = "INTEGER"
                        r10 = 4
                        r7.<init>(r9, r10)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.INTEGER = r7
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$6 r9 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$6
                        java.lang.String r11 = "LONG"
                        r12 = 5
                        r9.<init>(r11, r12)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.LONG = r9
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$7 r11 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$7
                        java.lang.String r13 = "FLOAT"
                        r14 = 6
                        r11.<init>(r13, r14)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.FLOAT = r11
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$8 r13 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$8
                        java.lang.String r15 = "DOUBLE"
                        r14 = 7
                        r13.<init>(r15, r14)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.DOUBLE = r13
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$9 r15 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType$9
                        java.lang.String r14 = "STRING"
                        r12 = 8
                        r15.<init>(r14, r12)
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.STRING = r15
                        r14 = 9
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType[] r14 = new net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType[r14]
                        r14[r2] = r0
                        r14[r4] = r1
                        r14[r6] = r3
                        r14[r8] = r5
                        r14[r10] = r7
                        r0 = 5
                        r14[r0] = r9
                        r0 = 6
                        r14[r0] = r11
                        r0 = 7
                        r14[r0] = r13
                        r14[r12] = r15
                        net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.$VALUES = r14
                        return
                }

                ForNonArrayType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                /* synthetic */ ForNonArrayType(java.lang.String r1, int r2, net.bytebuddy.description.annotation.AnnotationValue.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType> r0 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r1 = (net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType) r1
                        return r1
                }

                public static net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType[] values() {
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType[] r0 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType[] r0 = (net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public <S> S copy(S r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public boolean equals(java.lang.Object r1, java.lang.Object r2) {
                        r0 = this;
                        boolean r1 = r1.equals(r2)
                        return r1
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public int hashCode(java.lang.Object r1) {
                        r0 = this;
                        int r1 = r1.hashCode()
                        return r1
                }
            }

            <S> S copy(S r1);

            boolean equals(java.lang.Object r1, java.lang.Object r2);

            int hashCode(java.lang.Object r1);

            java.lang.String toString(java.lang.Object r1);
        }

        public ForConstant(U r1, net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.propertyDelegate = r2
                return
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.Byte, java.lang.Byte> of(byte r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.BYTE
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.Character, java.lang.Character> of(char r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.CHARACTER
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.Double, java.lang.Double> of(double r1) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.DOUBLE
                r0.<init>(r1, r2)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.Float, java.lang.Float> of(float r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.FLOAT
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.Integer, java.lang.Integer> of(int r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.INTEGER
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.Long, java.lang.Long> of(long r1) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.LONG
                r0.<init>(r1, r2)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<?, ?> of(java.lang.Object r3) {
                boolean r0 = r3 instanceof java.lang.Boolean
                if (r0 == 0) goto Lf
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            Lf:
                boolean r0 = r3 instanceof java.lang.Byte
                if (r0 == 0) goto L1e
                java.lang.Byte r3 = (java.lang.Byte) r3
                byte r3 = r3.byteValue()
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            L1e:
                boolean r0 = r3 instanceof java.lang.Short
                if (r0 == 0) goto L2d
                java.lang.Short r3 = (java.lang.Short) r3
                short r3 = r3.shortValue()
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            L2d:
                boolean r0 = r3 instanceof java.lang.Character
                if (r0 == 0) goto L3c
                java.lang.Character r3 = (java.lang.Character) r3
                char r3 = r3.charValue()
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            L3c:
                boolean r0 = r3 instanceof java.lang.Integer
                if (r0 == 0) goto L4b
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            L4b:
                boolean r0 = r3 instanceof java.lang.Long
                if (r0 == 0) goto L5a
                java.lang.Long r3 = (java.lang.Long) r3
                long r0 = r3.longValue()
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r0)
                return r3
            L5a:
                boolean r0 = r3 instanceof java.lang.Float
                if (r0 == 0) goto L69
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            L69:
                boolean r0 = r3 instanceof java.lang.Double
                if (r0 == 0) goto L78
                java.lang.Double r3 = (java.lang.Double) r3
                double r0 = r3.doubleValue()
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r0)
                return r3
            L78:
                boolean r0 = r3 instanceof java.lang.String
                if (r0 == 0) goto L83
                java.lang.String r3 = (java.lang.String) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            L83:
                boolean r0 = r3 instanceof boolean[]
                if (r0 == 0) goto L8e
                boolean[] r3 = (boolean[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            L8e:
                boolean r0 = r3 instanceof byte[]
                if (r0 == 0) goto L99
                byte[] r3 = (byte[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            L99:
                boolean r0 = r3 instanceof short[]
                if (r0 == 0) goto La4
                short[] r3 = (short[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            La4:
                boolean r0 = r3 instanceof char[]
                if (r0 == 0) goto Laf
                char[] r3 = (char[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            Laf:
                boolean r0 = r3 instanceof int[]
                if (r0 == 0) goto Lba
                int[] r3 = (int[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            Lba:
                boolean r0 = r3 instanceof long[]
                if (r0 == 0) goto Lc5
                long[] r3 = (long[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            Lc5:
                boolean r0 = r3 instanceof float[]
                if (r0 == 0) goto Ld0
                float[] r3 = (float[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            Ld0:
                boolean r0 = r3 instanceof double[]
                if (r0 == 0) goto Ldb
                double[] r3 = (double[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            Ldb:
                boolean r0 = r3 instanceof java.lang.String[]
                if (r0 == 0) goto Le6
                java.lang.String[] r3 = (java.lang.String[]) r3
                net.bytebuddy.description.annotation.AnnotationValue r3 = of(r3)
                return r3
            Le6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not a constant annotation value: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.String, java.lang.String> of(java.lang.String r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.STRING
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.Short, java.lang.Short> of(short r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                java.lang.Short r2 = java.lang.Short.valueOf(r2)
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.SHORT
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.Boolean, java.lang.Boolean> of(boolean r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForNonArrayType.BOOLEAN
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<byte[], byte[]> of(byte... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.BYTE
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<char[], char[]> of(char... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.CHARACTER
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<double[], double[]> of(double... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.DOUBLE
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<float[], float[]> of(float... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.FLOAT
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<int[], int[]> of(int... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.INTEGER
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<long[], long[]> of(long... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.LONG
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<java.lang.String[], java.lang.String[]> of(java.lang.String... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.STRING
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<short[], short[]> of(short... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.SHORT
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<boolean[], boolean[]> of(boolean... r2) {
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate$ForArrayType r1 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType.BOOLEAN
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
                r2 = this;
                if (r2 == r3) goto L19
                boolean r0 = r3 instanceof net.bytebuddy.description.annotation.AnnotationValue
                if (r0 == 0) goto L17
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r0 = r2.propertyDelegate
                U r1 = r2.value
                net.bytebuddy.description.annotation.AnnotationValue r3 = (net.bytebuddy.description.annotation.AnnotationValue) r3
                java.lang.Object r3 = r3.resolve()
                boolean r3 = r0.equals(r1, r3)
                if (r3 == 0) goto L17
                goto L19
            L17:
                r3 = 0
                goto L1a
            L19:
                r3 = 1
            L1a:
                return r3
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<U, U> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r4, net.bytebuddy.description.type.TypeDefinition r5) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asBoxed()
                U r0 = r3.value
                java.lang.Class r0 = r0.getClass()
                boolean r5 = r5.represents(r0)
                if (r5 == 0) goto L15
                return r3
            L15:
                U r5 = r3.value
                java.lang.Class r5 = r5.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L3f
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r5 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                U r1 = r3.value
                java.lang.Class r1 = r1.getClass()
                java.lang.Class r1 = r1.getComponentType()
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.of(r1)
                java.lang.String r0 = r0.toArrayErrorString(r1)
                r5.<init>(r4, r0)
                return r5
            L3f:
                U r5 = r3.value
                boolean r5 = r5 instanceof java.lang.Enum
                if (r5 == 0) goto L71
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r5 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                U r1 = r3.value
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                r1 = 46
                r0.append(r1)
                U r1 = r3.value
                java.lang.Enum r1 = (java.lang.Enum) r1
                java.lang.String r1 = r1.name()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.<init>(r4, r0)
                return r5
            L71:
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r5 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r1 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                U r2 = r3.value
                java.lang.Class r2 = r2.getClass()
                java.lang.String r1 = r1.toTypeErrorString(r2)
                r0.append(r1)
                r1 = 91
                r0.append(r1)
                U r1 = r3.value
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.<init>(r4, r0)
                return r5
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                U r0 = r1.value
                java.lang.Class r0 = r0.getClass()
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r0.asUnboxed()
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r2 = this;
                int r0 = r2.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto Le
            L6:
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r0 = r2.propertyDelegate
                U r1 = r2.value
                int r0 = r0.hashCode(r1)
            Le:
                if (r0 != 0) goto L13
                int r0 = r2.hashCode
                goto L15
            L13:
                r2.hashCode = r0
            L15:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<U> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3) {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$Loaded r3 = new net.bytebuddy.description.annotation.AnnotationValue$ForConstant$Loaded
                U r0 = r2.value
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r1 = r2.propertyDelegate
                r3.<init>(r0, r1)
                return r3
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public U resolve() {
                r1 = this;
                U r0 = r1.value
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForConstant$PropertyDelegate r0 = r2.propertyDelegate
                U r1 = r2.value
                java.lang.String r0 = r0.toString(r1)
                return r0
        }
    }

    public static class ForDescriptionArray<U, V> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<U, V> {
        private final net.bytebuddy.description.type.TypeDescription componentType;
        private transient /* synthetic */ int hashCode;
        private final java.lang.Class<?> unloadedComponentType;
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> values;

        public static class Loaded<W> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase<W> {
            private final java.lang.Class<W> componentType;
            private transient /* synthetic */ int hashCode;
            private final java.util.List<net.bytebuddy.description.annotation.AnnotationValue.Loaded<?>> values;

            public Loaded(java.lang.Class<W> r1, java.util.List<net.bytebuddy.description.annotation.AnnotationValue.Loaded<?>> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.componentType = r1
                    r0.values = r2
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r9) {
                    r8 = this;
                    r0 = 1
                    if (r8 != r9) goto L4
                    return r0
                L4:
                    boolean r1 = r9 instanceof net.bytebuddy.description.annotation.AnnotationValue.Loaded
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r9 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r9
                    net.bytebuddy.description.annotation.AnnotationValue$State r1 = r9.getState()
                    boolean r1 = r1.isResolved()
                    if (r1 != 0) goto L17
                    return r2
                L17:
                    java.lang.Object r9 = r9.resolve()
                    boolean r1 = r9 instanceof java.lang.Object[]
                    if (r1 != 0) goto L20
                    return r2
                L20:
                    java.lang.Object[] r9 = (java.lang.Object[]) r9
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r8.values
                    int r1 = r1.size()
                    int r3 = r9.length
                    if (r1 == r3) goto L2c
                    return r2
                L2c:
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r8.values
                    java.util.Iterator r1 = r1.iterator()
                    int r3 = r9.length
                    r4 = r2
                L34:
                    if (r4 >= r3) goto L57
                    r5 = r9[r4]
                    java.lang.Object r6 = r1.next()
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r6 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r6
                    net.bytebuddy.description.annotation.AnnotationValue$State r7 = r6.getState()
                    boolean r7 = r7.isResolved()
                    if (r7 == 0) goto L56
                    java.lang.Object r6 = r6.resolve()
                    boolean r5 = r6.equals(r5)
                    if (r5 != 0) goto L53
                    goto L56
                L53:
                    int r4 = r4 + 1
                    goto L34
                L56:
                    return r2
                L57:
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                    r2 = this;
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r0 = r2.values
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1f
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r1 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r1
                    net.bytebuddy.description.annotation.AnnotationValue$State r1 = r1.getState()
                    boolean r1 = r1.isResolved()
                    if (r1 != 0) goto L6
                    net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED
                    return r0
                L1f:
                    net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                    return r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            public int hashCode() {
                    r3 = this;
                    int r0 = r3.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L22
                L6:
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r0 = r3.values
                    java.util.Iterator r0 = r0.iterator()
                    r1 = 1
                Ld:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L21
                    java.lang.Object r2 = r0.next()
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r2 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r2
                    int r1 = r1 * 31
                    int r2 = r2.hashCode()
                    int r1 = r1 + r2
                    goto Ld
                L21:
                    r0 = r1
                L22:
                    if (r0 != 0) goto L27
                    int r0 = r3.hashCode
                    goto L29
                L27:
                    r3.hashCode = r0
                L29:
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public boolean represents(java.lang.Object r7) {
                    r6 = this;
                    boolean r0 = r7 instanceof java.lang.Object[]
                    r1 = 0
                    if (r0 != 0) goto L6
                    return r1
                L6:
                    java.lang.Class r0 = r7.getClass()
                    java.lang.Class r0 = r0.getComponentType()
                    java.lang.Class<W> r2 = r6.componentType
                    if (r0 == r2) goto L13
                    return r1
                L13:
                    java.lang.Object[] r7 = (java.lang.Object[]) r7
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r0 = r6.values
                    int r0 = r0.size()
                    int r2 = r7.length
                    if (r0 == r2) goto L1f
                    return r1
                L1f:
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r0 = r6.values
                    java.util.Iterator r0 = r0.iterator()
                    int r2 = r7.length
                    r3 = r1
                L27:
                    if (r3 >= r2) goto L3b
                    r4 = r7[r3]
                    java.lang.Object r5 = r0.next()
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r5 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r5
                    boolean r4 = r5.represents(r4)
                    if (r4 != 0) goto L38
                    return r1
                L38:
                    int r3 = r3 + 1
                    goto L27
                L3b:
                    r7 = 1
                    return r7
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public W resolve() {
                    r5 = this;
                    java.lang.Class<W> r0 = r5.componentType
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r5.values
                    int r1 = r1.size()
                    java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r5.values
                    java.util.Iterator r1 = r1.iterator()
                    r2 = 0
                L13:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L2a
                    java.lang.Object r3 = r1.next()
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r3 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r3
                    int r4 = r2 + 1
                    java.lang.Object r3 = r3.resolve()
                    java.lang.reflect.Array.set(r0, r2, r3)
                    r2 = r4
                    goto L13
                L2a:
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                    java.util.List<net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r2.values
                    java.lang.String r0 = r0.toSourceString(r1)
                    return r0
            }
        }

        public ForDescriptionArray(java.lang.Class<?> r1, net.bytebuddy.description.type.TypeDescription r2, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r3) {
                r0 = this;
                r0.<init>()
                r0.unloadedComponentType = r1
                r0.componentType = r2
                r0.values = r3
                return
        }

        public static <W extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.annotation.AnnotationDescription[], W[]> of(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.annotation.AnnotationDescription[] r6) {
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
            L8:
                if (r2 >= r1) goto L3b
                r3 = r6[r2]
                net.bytebuddy.description.type.TypeDescription r4 = r3.getAnnotationType()
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L21
                net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription r4 = new net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription
                r4.<init>(r3)
                r0.add(r4)
                int r2 = r2 + 1
                goto L8
            L21:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = " is not of "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                throw r6
            L3b:
                net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                java.lang.Class<net.bytebuddy.description.annotation.AnnotationDescription> r1 = net.bytebuddy.description.annotation.AnnotationDescription.class
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static <W extends java.lang.Enum<W>> net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.enumeration.EnumerationDescription[], W[]> of(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.enumeration.EnumerationDescription[] r6) {
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
            L8:
                if (r2 >= r1) goto L3a
                r3 = r6[r2]
                net.bytebuddy.description.type.TypeDescription r4 = r3.getEnumerationType()
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L20
                net.bytebuddy.description.annotation.AnnotationValue r3 = net.bytebuddy.description.annotation.AnnotationValue.ForEnumerationDescription.of(r3)
                r0.add(r3)
                int r2 = r2 + 1
                goto L8
            L20:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = " is not of "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                throw r6
            L3a:
                net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.type.TypeDescription[], java.lang.Class<?>[]> of(net.bytebuddy.description.type.TypeDescription[] r4) {
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.length
                r0.<init>(r1)
                int r1 = r4.length
                r2 = 0
            L8:
                if (r2 >= r1) goto L16
                r3 = r4[r2]
                net.bytebuddy.description.annotation.AnnotationValue r3 = net.bytebuddy.description.annotation.AnnotationValue.ForTypeDescription.of(r3)
                r0.add(r3)
                int r2 = r2 + 1
                goto L8
            L16:
                net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r4 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r2 = net.bytebuddy.description.type.TypeDescription.class
                r4.<init>(r2, r1, r0)
                return r4
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof net.bytebuddy.description.annotation.AnnotationValue
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.annotation.AnnotationValue r7 = (net.bytebuddy.description.annotation.AnnotationValue) r7
                java.lang.Object r7 = r7.resolve()
                java.lang.Class r1 = r7.getClass()
                boolean r1 = r1.isArray()
                if (r1 != 0) goto L1b
                return r2
            L1b:
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r6.values
                int r1 = r1.size()
                int r3 = java.lang.reflect.Array.getLength(r7)
                if (r1 == r3) goto L28
                return r2
            L28:
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r6.values
                java.util.Iterator r1 = r1.iterator()
                r3 = r2
            L2f:
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r4 = r6.values
                int r4 = r4.size()
                if (r3 >= r4) goto L4f
                java.lang.Object r4 = r1.next()
                net.bytebuddy.description.annotation.AnnotationValue r4 = (net.bytebuddy.description.annotation.AnnotationValue) r4
                java.lang.Object r4 = r4.resolve()
                java.lang.Object r5 = java.lang.reflect.Array.get(r7, r3)
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L4c
                return r2
            L4c:
                int r3 = r3 + 1
                goto L2f
            L4f:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public net.bytebuddy.description.annotation.AnnotationValue<U, V> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r5, net.bytebuddy.description.type.TypeDefinition r6) {
                r4 = this;
                boolean r0 = r6.isArray()
                if (r0 == 0) goto L3a
                net.bytebuddy.description.type.TypeDefinition r0 = r6.getComponentType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                net.bytebuddy.description.type.TypeDescription r1 = r4.componentType
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L3a
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r0 = r4.values
                java.util.Iterator r0 = r0.iterator()
            L1c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.annotation.AnnotationValue r1 = (net.bytebuddy.description.annotation.AnnotationValue) r1
                net.bytebuddy.description.type.TypeDefinition r2 = r6.getComponentType()
                net.bytebuddy.description.annotation.AnnotationValue r1 = r1.filter(r5, r2)
                net.bytebuddy.description.annotation.AnnotationValue$State r2 = r1.getState()
                net.bytebuddy.description.annotation.AnnotationValue$State r3 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                if (r2 == r3) goto L1c
                return r1
            L39:
                return r4
            L3a:
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                net.bytebuddy.description.type.TypeDescription r1 = r4.componentType
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.of(r1)
                java.lang.String r0 = r0.toArrayErrorString(r1)
                r6.<init>(r5, r0)
                return r6
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ARRAY
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r3 = this;
                int r0 = r3.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L22
            L6:
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r0 = r3.values
                java.util.Iterator r0 = r0.iterator()
                r1 = 1
            Ld:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r0.next()
                net.bytebuddy.description.annotation.AnnotationValue r2 = (net.bytebuddy.description.annotation.AnnotationValue) r2
                int r1 = r1 * 31
                int r2 = r2.hashCode()
                int r1 = r1 + r2
                goto Ld
            L21:
                r0 = r1
            L22:
                if (r0 != 0) goto L27
                int r0 = r3.hashCode
                goto L29
            L27:
                r3.hashCode = r0
            L29:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<V> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r4.values
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r4.values
                java.util.Iterator r1 = r1.iterator()
            L11:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L25
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.annotation.AnnotationValue r2 = (net.bytebuddy.description.annotation.AnnotationValue) r2
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r2 = r2.load(r5)
                r0.add(r2)
                goto L11
            L25:
                net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray$Loaded r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray$Loaded     // Catch: java.lang.ClassNotFoundException -> L36
                net.bytebuddy.description.type.TypeDescription r2 = r4.componentType     // Catch: java.lang.ClassNotFoundException -> L36
                java.lang.String r2 = r2.getName()     // Catch: java.lang.ClassNotFoundException -> L36
                r3 = 0
                java.lang.Class r5 = java.lang.Class.forName(r2, r3, r5)     // Catch: java.lang.ClassNotFoundException -> L36
                r1.<init>(r5, r0)     // Catch: java.lang.ClassNotFoundException -> L36
                return r1
            L36:
                r5 = move-exception
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                net.bytebuddy.description.type.TypeDescription r1 = r4.componentType
                java.lang.String r1 = r1.getName()
                r0.<init>(r1, r5)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public U resolve() {
                r5 = this;
                java.lang.Class<?> r0 = r5.unloadedComponentType
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r5.values
                int r1 = r1.size()
                java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r5.values
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
            L13:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L2a
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.annotation.AnnotationValue r3 = (net.bytebuddy.description.annotation.AnnotationValue) r3
                int r4 = r2 + 1
                java.lang.Object r3 = r3.resolve()
                java.lang.reflect.Array.set(r0, r2, r3)
                r2 = r4
                goto L13
            L2a:
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r2.values
                java.lang.String r0 = r0.toSourceString(r1)
                return r0
        }
    }

    public static class ForEnumerationDescription<U extends java.lang.Enum<U>> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<net.bytebuddy.description.enumeration.EnumerationDescription, U> {
        private final net.bytebuddy.description.enumeration.EnumerationDescription enumerationDescription;

        public static class Loaded<V extends java.lang.Enum<V>> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase<V> {
            private final V enumeration;

            public static class WithIncompatibleRuntimeType extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase<java.lang.Enum<?>> {
                private final java.lang.Class<?> type;

                public WithIncompatibleRuntimeType(java.lang.Class<?> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.type = r1
                        return
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
                public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
                public boolean represents(java.lang.Object r1) {
                        r0 = this;
                        r1 = 0
                        return r1
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
                public java.lang.Enum<?> resolve() {
                        r3 = this;
                        java.lang.IncompatibleClassChangeError r0 = new java.lang.IncompatibleClassChangeError
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Not an enumeration type: "
                        r1.append(r2)
                        java.lang.Class<?> r2 = r3.type
                        java.lang.String r2 = r2.getName()
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
                public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                        r1 = this;
                        java.lang.Enum r0 = r1.resolve()
                        return r0
                }
            }

            public Loaded(V r1) {
                    r0 = this;
                    r0.<init>()
                    r0.enumeration = r1
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof net.bytebuddy.description.annotation.AnnotationValue.Loaded
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r4 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r4
                    net.bytebuddy.description.annotation.AnnotationValue$State r1 = r4.getState()
                    boolean r1 = r1.isResolved()
                    if (r1 == 0) goto L23
                    V extends java.lang.Enum<V> r1 = r3.enumeration
                    java.lang.Object r4 = r4.resolve()
                    boolean r4 = r1.equals(r4)
                    if (r4 == 0) goto L23
                    goto L24
                L23:
                    r0 = r2
                L24:
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    V extends java.lang.Enum<V> r0 = r1.enumeration
                    int r0 = r0.hashCode()
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public boolean represents(java.lang.Object r2) {
                    r1 = this;
                    V extends java.lang.Enum<V> r0 = r1.enumeration
                    boolean r2 = r0.equals(r2)
                    return r2
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public V resolve() {
                    r1 = this;
                    V extends java.lang.Enum<V> r0 = r1.enumeration
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                    r1 = this;
                    java.lang.Enum r0 = r1.resolve()
                    return r0
            }

            public java.lang.String toString() {
                    r1 = this;
                    V extends java.lang.Enum<V> r0 = r1.enumeration
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public static class WithUnknownConstant<U extends java.lang.Enum<U>> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<net.bytebuddy.description.enumeration.EnumerationDescription, U> {
            private final net.bytebuddy.description.type.TypeDescription typeDescription;
            private final java.lang.String value;

            public static class Loaded extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase.ForUnresolvedProperty<java.lang.Enum<?>> {
                private final java.lang.Class<? extends java.lang.Enum<?>> enumType;
                private final java.lang.String value;

                public Loaded(java.lang.Class<? extends java.lang.Enum<?>> r1, java.lang.String r2) {
                        r0 = this;
                        r0.<init>()
                        r0.enumType = r1
                        r0.value = r2
                        return
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
                public java.lang.Enum<?> resolve() {
                        r3 = this;
                        java.lang.EnumConstantNotPresentException r0 = new java.lang.EnumConstantNotPresentException
                        java.lang.Class<? extends java.lang.Enum<?>> r1 = r3.enumType
                        java.lang.String r2 = r3.value
                        r0.<init>(r1, r2)
                        throw r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
                public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                        r1 = this;
                        java.lang.Enum r0 = r1.resolve()
                        return r0
                }

                public java.lang.String toString() {
                        r2 = this;
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = r2.value
                        r0.append(r1)
                        java.lang.String r1 = " /* Warning: constant not present! */"
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        return r0
                }
            }

            public WithUnknownConstant(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescription = r1
                    r0.value = r2
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.enumeration.EnumerationDescription, U> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDefinition r2) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public net.bytebuddy.description.annotation.AnnotationValue.Loaded<U> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4) {
                    r3 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$WithUnknownConstant$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$WithUnknownConstant$Loaded     // Catch: java.lang.ClassNotFoundException -> L13
                    net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription     // Catch: java.lang.ClassNotFoundException -> L13
                    java.lang.String r1 = r1.getName()     // Catch: java.lang.ClassNotFoundException -> L13
                    r2 = 0
                    java.lang.Class r4 = java.lang.Class.forName(r1, r2, r4)     // Catch: java.lang.ClassNotFoundException -> L13
                    java.lang.String r1 = r3.value     // Catch: java.lang.ClassNotFoundException -> L13
                    r0.<init>(r4, r1)     // Catch: java.lang.ClassNotFoundException -> L13
                    return r0
                L13:
                    r4 = move-exception
                    net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                    net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                    java.lang.String r1 = r1.getName()
                    r0.<init>(r1, r4)
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                    r1 = this;
                    net.bytebuddy.description.enumeration.EnumerationDescription r0 = r1.resolve()
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public net.bytebuddy.description.enumeration.EnumerationDescription resolve() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                    r1.append(r2)
                    java.lang.String r2 = " does not declare enumeration constant "
                    r1.append(r2)
                    java.lang.String r2 = r3.value
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = r2.value
                    r0.append(r1)
                    java.lang.String r1 = " /* Warning: constant not present! */"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public ForEnumerationDescription(net.bytebuddy.description.enumeration.EnumerationDescription r1) {
                r0 = this;
                r0.<init>()
                r0.enumerationDescription = r1
                return
        }

        public static <V extends java.lang.Enum<V>> net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.enumeration.EnumerationDescription, V> of(net.bytebuddy.description.enumeration.EnumerationDescription r1) {
                net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription
                r0.<init>(r1)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                r1 = this;
                if (r1 == r2) goto L17
                boolean r0 = r2 instanceof net.bytebuddy.description.annotation.AnnotationValue
                if (r0 == 0) goto L15
                net.bytebuddy.description.enumeration.EnumerationDescription r0 = r1.enumerationDescription
                net.bytebuddy.description.annotation.AnnotationValue r2 = (net.bytebuddy.description.annotation.AnnotationValue) r2
                java.lang.Object r2 = r2.resolve()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L15
                goto L17
            L15:
                r2 = 0
                goto L18
            L17:
                r2 = 1
            L18:
                return r2
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.enumeration.EnumerationDescription, U> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.description.type.TypeDefinition r4) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                net.bytebuddy.description.enumeration.EnumerationDescription r0 = r2.enumerationDescription
                net.bytebuddy.description.type.TypeDescription r0 = r0.getEnumerationType()
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L12
                r4 = r2
                goto L4e
            L12:
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r4 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getReturnType()
                boolean r0 = r0.isArray()
                if (r0 == 0) goto L27
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ENUMERATION
                java.lang.String r0 = r0.toArrayErrorString(r1)
                goto L4b
            L27:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.description.enumeration.EnumerationDescription r1 = r2.enumerationDescription
                net.bytebuddy.description.type.TypeDescription r1 = r1.getEnumerationType()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                r1 = 46
                r0.append(r1)
                net.bytebuddy.description.enumeration.EnumerationDescription r1 = r2.enumerationDescription
                java.lang.String r1 = r1.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L4b:
                r4.<init>(r3, r0)
            L4e:
                return r4
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ENUMERATION
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                return r0
        }

        public int hashCode() {
                r1 = this;
                net.bytebuddy.description.enumeration.EnumerationDescription r0 = r1.enumerationDescription
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<U> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r5) {
                r4 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$Loaded     // Catch: java.lang.ClassNotFoundException -> L19
                net.bytebuddy.description.enumeration.EnumerationDescription r1 = r4.enumerationDescription     // Catch: java.lang.ClassNotFoundException -> L19
                net.bytebuddy.description.type.TypeDescription r2 = r1.getEnumerationType()     // Catch: java.lang.ClassNotFoundException -> L19
                java.lang.String r2 = r2.getName()     // Catch: java.lang.ClassNotFoundException -> L19
                r3 = 0
                java.lang.Class r5 = java.lang.Class.forName(r2, r3, r5)     // Catch: java.lang.ClassNotFoundException -> L19
                java.lang.Enum r5 = r1.load(r5)     // Catch: java.lang.ClassNotFoundException -> L19
                r0.<init>(r5)     // Catch: java.lang.ClassNotFoundException -> L19
                return r0
            L19:
                r5 = move-exception
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                net.bytebuddy.description.enumeration.EnumerationDescription r1 = r4.enumerationDescription
                net.bytebuddy.description.type.TypeDescription r1 = r1.getEnumerationType()
                java.lang.String r1 = r1.getName()
                r0.<init>(r1, r5)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                r1 = this;
                net.bytebuddy.description.enumeration.EnumerationDescription r0 = r1.resolve()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.enumeration.EnumerationDescription resolve() {
                r1 = this;
                net.bytebuddy.description.enumeration.EnumerationDescription r0 = r1.enumerationDescription
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                net.bytebuddy.description.enumeration.EnumerationDescription r0 = r1.enumerationDescription
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForIncompatibleType<U, V> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<U, V> {
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public static class Loaded<W> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase.ForUnresolvedProperty<W> {
            private final java.lang.Class<?> type;

            public Loaded(java.lang.Class<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.type = r1
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public W resolve() {
                    r2 = this;
                    java.lang.IncompatibleClassChangeError r0 = new java.lang.IncompatibleClassChangeError
                    java.lang.Class<?> r1 = r2.type
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "/* Warning type incompatibility! \""
                    r0.append(r1)
                    java.lang.Class<?> r1 = r2.type
                    java.lang.String r1 = r1.getName()
                    r0.append(r1)
                    java.lang.String r1 = "\" */"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public ForIncompatibleType(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r0.<init>()
                r0.typeDescription = r1
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<U, V> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDefinition r2) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<V> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4) {
                r3 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForIncompatibleType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForIncompatibleType$Loaded     // Catch: java.lang.ClassNotFoundException -> L11
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription     // Catch: java.lang.ClassNotFoundException -> L11
                java.lang.String r1 = r1.getName()     // Catch: java.lang.ClassNotFoundException -> L11
                r2 = 0
                java.lang.Class r4 = java.lang.Class.forName(r1, r2, r4)     // Catch: java.lang.ClassNotFoundException -> L11
                r0.<init>(r4)     // Catch: java.lang.ClassNotFoundException -> L11
                return r0
            L11:
                r4 = move-exception
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                java.lang.String r1 = r1.getName()
                r0.<init>(r1, r4)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public U resolve() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Property is defined with an incompatible runtime type: "
                r1.append(r2)
                net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "/* Warning type incompatibility! \""
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                java.lang.String r1 = "\" */"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForMismatchedType<U, V> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<U, V> {
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape property;
        private final java.lang.String value;

        public static class Loaded<W> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase.ForUnresolvedProperty<W> {
            private final java.lang.reflect.Method property;
            private final java.lang.String value;

            public Loaded(java.lang.reflect.Method r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.property = r1
                    r0.value = r2
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public W resolve() {
                    r3 = this;
                    java.lang.annotation.AnnotationTypeMismatchException r0 = new java.lang.annotation.AnnotationTypeMismatchException
                    java.lang.reflect.Method r1 = r3.property
                    java.lang.String r2 = r3.value
                    r0.<init>(r1, r2)
                    throw r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "/* Warning type mismatch! \""
                    r0.append(r1)
                    java.lang.String r1 = r2.value
                    r0.append(r1)
                    java.lang.String r1 = "\" */"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public ForMismatchedType(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.property = r1
                r0.value = r2
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<U, V> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.description.type.TypeDefinition r3) {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r3 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                java.lang.String r0 = r1.value
                r3.<init>(r2, r0)
                return r3
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<V> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4) {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.property     // Catch: java.lang.ClassNotFoundException -> L22
                net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()     // Catch: java.lang.ClassNotFoundException -> L22
                java.lang.String r0 = r0.getName()     // Catch: java.lang.ClassNotFoundException -> L22
                r1 = 0
                java.lang.Class r4 = java.lang.Class.forName(r0, r1, r4)     // Catch: java.lang.ClassNotFoundException -> L22
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType$Loaded     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.property     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24
                java.lang.String r1 = r1.getName()     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24
                r2 = 0
                java.lang.reflect.Method r1 = r4.getMethod(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24
                java.lang.String r2 = r3.value     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24
                r0.<init>(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24
                return r0
            L22:
                r4 = move-exception
                goto L2a
            L24:
                net.bytebuddy.description.annotation.AnnotationValue$ForIncompatibleType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForIncompatibleType$Loaded     // Catch: java.lang.ClassNotFoundException -> L22
                r0.<init>(r4)     // Catch: java.lang.ClassNotFoundException -> L22
                return r0
            L2a:
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.property
                net.bytebuddy.description.type.TypeDescription r1 = r1.getDeclaringType()
                java.lang.String r1 = r1.getName()
                r0.<init>(r1, r4)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public U resolve() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r3.value
                r1.append(r2)
                java.lang.String r2 = " cannot be used as value for "
                r1.append(r2)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r3.property
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "/* Warning type mismatch! \""
                r0.append(r1)
                java.lang.String r1 = r2.value
                r0.append(r1)
                java.lang.String r1 = "\" */"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForMissingType<U, V> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<U, V> {
        private final java.lang.String typeName;

        public static class Loaded<U> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase.ForUnresolvedProperty<U> {
            private final java.lang.ClassNotFoundException exception;
            private final java.lang.String typeName;

            public Loaded(java.lang.String r1, java.lang.ClassNotFoundException r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typeName = r1
                    r0.exception = r2
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public U resolve() {
                    r3 = this;
                    java.lang.TypeNotPresentException r0 = new java.lang.TypeNotPresentException
                    java.lang.String r1 = r3.typeName
                    java.lang.ClassNotFoundException r2 = r3.exception
                    r0.<init>(r1, r2)
                    throw r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = r2.typeName
                    r0.append(r1)
                    java.lang.String r1 = ".class /* Warning: type not present! */"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public ForMissingType(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.typeName = r1
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<U, V> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDefinition r2) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<V> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4) {
                r3 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r4 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                java.lang.String r0 = r3.typeName
                java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
                java.lang.String r2 = r3.typeName
                r1.<init>(r2)
                r4.<init>(r0, r1)
                return r4
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public U resolve() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Type not found: "
                r1.append(r2)
                java.lang.String r2 = r3.typeName
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.typeName
                r0.append(r1)
                java.lang.String r1 = ".class /* Warning: type not present! */"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForMissingValue<U, V> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<U, V> {
        private final java.lang.String property;
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public static class Loaded<W> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase<W> {
            private final java.lang.String property;
            private final java.lang.Class<? extends java.lang.annotation.Annotation> type;

            public Loaded(java.lang.Class<? extends java.lang.annotation.Annotation> r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.type = r1
                    r0.property = r2
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNDEFINED
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public boolean represents(java.lang.Object r1) {
                    r0 = this;
                    r1 = 0
                    return r1
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public W resolve() {
                    r3 = this;
                    java.lang.annotation.IncompleteAnnotationException r0 = new java.lang.annotation.IncompleteAnnotationException
                    java.lang.Class<? extends java.lang.annotation.Annotation> r1 = r3.type
                    java.lang.String r2 = r3.property
                    r0.<init>(r1, r2)
                    throw r0
            }
        }

        public ForMissingValue(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.typeDescription = r1
                r0.property = r2
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<U, V> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDefinition r2) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<V> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription     // Catch: java.lang.ClassNotFoundException -> L19
                java.lang.String r0 = r0.getName()     // Catch: java.lang.ClassNotFoundException -> L19
                r1 = 0
                java.lang.Class r3 = java.lang.Class.forName(r0, r1, r3)     // Catch: java.lang.ClassNotFoundException -> L19
                boolean r0 = r3.isAnnotation()     // Catch: java.lang.ClassNotFoundException -> L19
                if (r0 == 0) goto L1b
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue$Loaded     // Catch: java.lang.ClassNotFoundException -> L19
                java.lang.String r1 = r2.property     // Catch: java.lang.ClassNotFoundException -> L19
                r0.<init>(r3, r1)     // Catch: java.lang.ClassNotFoundException -> L19
                goto L20
            L19:
                r3 = move-exception
                goto L21
            L1b:
                net.bytebuddy.description.annotation.AnnotationValue$ForIncompatibleType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForIncompatibleType$Loaded     // Catch: java.lang.ClassNotFoundException -> L19
                r0.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L19
            L20:
                return r0
            L21:
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                java.lang.String r1 = r1.getName()
                r0.<init>(r1, r3)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public U resolve() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                r1.append(r2)
                java.lang.String r2 = " does not define "
                r1.append(r2)
                java.lang.String r2 = r3.property
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    public static class ForTypeDescription<U extends java.lang.Class<U>> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<net.bytebuddy.description.type.TypeDescription, U> {
        private static final boolean NO_INITIALIZATION = false;
        private static final java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> PRIMITIVE_TYPES = null;
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public static class Loaded<U extends java.lang.Class<U>> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase<U> {
            private final U type;

            public Loaded(U r1) {
                    r0 = this;
                    r0.<init>()
                    r0.type = r1
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof net.bytebuddy.description.annotation.AnnotationValue.Loaded
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.description.annotation.AnnotationValue$Loaded r4 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r4
                    net.bytebuddy.description.annotation.AnnotationValue$State r1 = r4.getState()
                    boolean r1 = r1.isResolved()
                    if (r1 == 0) goto L23
                    U extends java.lang.Class<U> r1 = r3.type
                    java.lang.Object r4 = r4.resolve()
                    boolean r4 = r1.equals(r4)
                    if (r4 == 0) goto L23
                    goto L24
                L23:
                    r0 = r2
                L24:
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    U extends java.lang.Class<U> r0 = r1.type
                    int r0 = r0.hashCode()
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public boolean represents(java.lang.Object r2) {
                    r1 = this;
                    U extends java.lang.Class<U> r0 = r1.type
                    boolean r2 = r0.equals(r2)
                    return r2
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public U resolve() {
                    r1 = this;
                    U extends java.lang.Class<U> r0 = r1.type
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                    r1 = this;
                    java.lang.Class r0 = r1.resolve()
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                    U extends java.lang.Class<U> r1 = r2.type
                    net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                    java.lang.String r0 = r0.toSourceString(r1)
                    return r0
            }
        }

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                net.bytebuddy.description.annotation.AnnotationValue.ForTypeDescription.PRIMITIVE_TYPES = r0
                java.lang.Class r1 = java.lang.Boolean.TYPE
                java.lang.Class r2 = java.lang.Byte.TYPE
                java.lang.Class r3 = java.lang.Short.TYPE
                java.lang.Class r4 = java.lang.Character.TYPE
                java.lang.Class r5 = java.lang.Integer.TYPE
                java.lang.Class r6 = java.lang.Long.TYPE
                java.lang.Class r7 = java.lang.Float.TYPE
                java.lang.Class r8 = java.lang.Double.TYPE
                java.lang.Class r9 = java.lang.Void.TYPE
                java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
                r1 = 0
            L1e:
                r2 = 9
                if (r1 >= r2) goto L30
                r2 = r0[r1]
                java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r3 = net.bytebuddy.description.annotation.AnnotationValue.ForTypeDescription.PRIMITIVE_TYPES
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                r3.put(r4, r2)
                int r1 = r1 + 1
                goto L1e
            L30:
                return
        }

        public ForTypeDescription(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r0.<init>()
                r0.typeDescription = r1
                return
        }

        public static <V extends java.lang.Class<V>> net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.type.TypeDescription, V> of(net.bytebuddy.description.type.TypeDescription r1) {
                net.bytebuddy.description.annotation.AnnotationValue$ForTypeDescription r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForTypeDescription
                r0.<init>(r1)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                r1 = this;
                if (r1 == r2) goto L17
                boolean r0 = r2 instanceof net.bytebuddy.description.annotation.AnnotationValue
                if (r0 == 0) goto L15
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.annotation.AnnotationValue r2 = (net.bytebuddy.description.annotation.AnnotationValue) r2
                java.lang.Object r2 = r2.resolve()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L15
                goto L17
            L15:
                r2 = 0
                goto L18
            L17:
                r2 = 1
            L18:
                return r2
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.type.TypeDescription, U> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.description.type.TypeDefinition r4) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                boolean r4 = r4.represents(r0)
                if (r4 == 0) goto Le
                r4 = r2
                goto L49
            Le:
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r4 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getReturnType()
                boolean r1 = r1.isArray()
                if (r1 == 0) goto L23
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.TYPE
                java.lang.String r0 = r0.toArrayErrorString(r1)
                goto L46
            L23:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = r0.getName()
                r1.append(r0)
                r0 = 91
                r1.append(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                java.lang.String r0 = r0.getName()
                r1.append(r0)
                r0 = 93
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L46:
                r4.<init>(r3, r0)
            L49:
                return r4
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.TYPE
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                return r0
        }

        public int hashCode() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.annotation.AnnotationValue.Loaded<U> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4) {
                r3 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForTypeDescription$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForTypeDescription$Loaded     // Catch: java.lang.ClassNotFoundException -> L15
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription     // Catch: java.lang.ClassNotFoundException -> L15
                boolean r1 = r1.isPrimitive()     // Catch: java.lang.ClassNotFoundException -> L15
                if (r1 == 0) goto L17
                java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r4 = net.bytebuddy.description.annotation.AnnotationValue.ForTypeDescription.PRIMITIVE_TYPES     // Catch: java.lang.ClassNotFoundException -> L15
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription     // Catch: java.lang.ClassNotFoundException -> L15
                java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.ClassNotFoundException -> L15
                java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.ClassNotFoundException -> L15
                goto L22
            L15:
                r4 = move-exception
                goto L26
            L17:
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription     // Catch: java.lang.ClassNotFoundException -> L15
                java.lang.String r1 = r1.getName()     // Catch: java.lang.ClassNotFoundException -> L15
                r2 = 0
                java.lang.Class r4 = java.lang.Class.forName(r1, r2, r4)     // Catch: java.lang.ClassNotFoundException -> L15
            L22:
                r0.<init>(r4)     // Catch: java.lang.ClassNotFoundException -> L15
                return r0
            L26:
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType$Loaded
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                java.lang.String r1 = r1.getName()
                r0.<init>(r1, r4)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public /* bridge */ /* synthetic */ java.lang.Object resolve() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.resolve()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public net.bytebuddy.description.type.TypeDescription resolve() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                java.lang.String r0 = r0.toSourceString(r1)
                return r0
        }
    }

    public interface Loaded<U> {

        public static abstract class AbstractBase<W> implements net.bytebuddy.description.annotation.AnnotationValue.Loaded<W> {

            public static abstract class ForUnresolvedProperty<Z> extends net.bytebuddy.description.annotation.AnnotationValue.Loaded.AbstractBase<Z> {
                public ForUnresolvedProperty() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
                public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
                public boolean represents(java.lang.Object r1) {
                        r0 = this;
                        r1 = 0
                        return r1
                }
            }

            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.Loaded
            public <X> X resolve(java.lang.Class<? extends X> r2) {
                    r1 = this;
                    java.lang.Object r0 = r1.resolve()
                    java.lang.Object r2 = r2.cast(r0)
                    return r2
            }
        }

        net.bytebuddy.description.annotation.AnnotationValue.State getState();

        boolean represents(java.lang.Object r1);

        U resolve();

        <V> V resolve(java.lang.Class<? extends V> r1);
    }

    public enum RenderingDispatcher extends java.lang.Enum<net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher> {
        private static final /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher[] $VALUES = null;
        private static final java.lang.String ARRAY_PREFIX = "Array with component tag: ";
        public static final net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher CURRENT = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher JAVA_14_CAPABLE_VM = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher JAVA_17_CAPABLE_VM = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher JAVA_19_CAPABLE_VM = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher JAVA_9_CAPABLE_VM = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher LEGACY_VM = null;
        private final char closingBrace;
        private final boolean componentAsInteger;
        private final char openingBrace;






        static {
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$1 r6 = new net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$1
                r4 = 93
                r5 = 1
                java.lang.String r1 = "LEGACY_VM"
                r2 = 0
                r3 = 91
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.LEGACY_VM = r6
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$2 r0 = new net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$2
                r11 = 125(0x7d, float:1.75E-43)
                r12 = 1
                java.lang.String r8 = "JAVA_9_CAPABLE_VM"
                r9 = 1
                r10 = 123(0x7b, float:1.72E-43)
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r12)
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.JAVA_9_CAPABLE_VM = r0
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$3 r1 = new net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$3
                r17 = 125(0x7d, float:1.75E-43)
                r18 = 1
                java.lang.String r14 = "JAVA_14_CAPABLE_VM"
                r15 = 2
                r16 = 123(0x7b, float:1.72E-43)
                r13 = r1
                r13.<init>(r14, r15, r16, r17, r18)
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.JAVA_14_CAPABLE_VM = r1
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$4 r2 = new net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$4
                r12 = 0
                java.lang.String r8 = "JAVA_17_CAPABLE_VM"
                r9 = 3
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.JAVA_17_CAPABLE_VM = r2
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$5 r3 = new net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher$5
                net.bytebuddy.ClassFileVersion r4 = net.bytebuddy.ClassFileVersion.JAVA_V5
                net.bytebuddy.ClassFileVersion r5 = net.bytebuddy.ClassFileVersion.ofThisVm(r4)
                net.bytebuddy.ClassFileVersion r7 = net.bytebuddy.ClassFileVersion.JAVA_V17
                boolean r18 = r5.isLessThan(r7)
                java.lang.String r14 = "JAVA_19_CAPABLE_VM"
                r15 = 4
                r13 = r3
                r13.<init>(r14, r15, r16, r17, r18)
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.JAVA_19_CAPABLE_VM = r3
                r5 = 5
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher[] r5 = new net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher[r5]
                r8 = 0
                r5[r8] = r6
                r8 = 1
                r5[r8] = r0
                r8 = 2
                r5[r8] = r1
                r8 = 3
                r5[r8] = r2
                r8 = 4
                r5[r8] = r3
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.$VALUES = r5
                net.bytebuddy.ClassFileVersion r4 = net.bytebuddy.ClassFileVersion.ofThisVm(r4)
                net.bytebuddy.ClassFileVersion r5 = net.bytebuddy.ClassFileVersion.JAVA_V19
                boolean r5 = r4.isAtLeast(r5)
                if (r5 == 0) goto L77
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT = r3
                goto L98
            L77:
                boolean r3 = r4.isAtLeast(r7)
                if (r3 == 0) goto L80
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT = r2
                goto L98
            L80:
                net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V14
                boolean r2 = r4.isAtLeast(r2)
                if (r2 == 0) goto L8b
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT = r1
                goto L98
            L8b:
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V9
                boolean r1 = r4.isAtLeast(r1)
                if (r1 == 0) goto L96
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT = r0
                goto L98
            L96:
                net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT = r6
            L98:
                return
        }

        RenderingDispatcher(java.lang.String r1, int r2, char r3, char r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.openingBrace = r3
                r0.closingBrace = r4
                r0.componentAsInteger = r5
                return
        }

        /* synthetic */ RenderingDispatcher(java.lang.String r1, int r2, char r3, char r4, boolean r5, net.bytebuddy.description.annotation.AnnotationValue.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public static net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher> r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r1 = (net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher) r1
                return r1
        }

        public static net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher[] values() {
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher[] r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher[] r0 = (net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher[]) r0
                return r0
        }

        public java.lang.String toArrayErrorString(net.bytebuddy.description.annotation.AnnotationValue.Sort r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Array with component tag: "
                r0.append(r1)
                boolean r1 = r2.componentAsInteger
                if (r1 != 0) goto L1f
                boolean r1 = r3.isDefined()
                if (r1 != 0) goto L15
                goto L1f
            L15:
                int r3 = r3.getTag()
                char r3 = (char) r3
                java.lang.String r3 = java.lang.Character.toString(r3)
                goto L27
            L1f:
                int r3 = r3.getTag()
                java.lang.String r3 = java.lang.Integer.toString(r3)
            L27:
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }

        public java.lang.String toSourceString(byte r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Byte.toString(r1)
                return r1
        }

        public abstract java.lang.String toSourceString(char r1);

        public abstract java.lang.String toSourceString(double r1);

        public abstract java.lang.String toSourceString(float r1);

        public java.lang.String toSourceString(int r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Integer.toString(r1)
                return r1
        }

        public abstract java.lang.String toSourceString(long r1);

        public abstract java.lang.String toSourceString(java.lang.String r1);

        public java.lang.String toSourceString(java.util.List<?> r5) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                char r1 = r4.openingBrace
                r0.append(r1)
                java.util.Iterator r5 = r5.iterator()
                r1 = 1
            Lf:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L26
                java.lang.Object r2 = r5.next()
                if (r1 == 0) goto L1d
                r1 = 0
                goto L22
            L1d:
                java.lang.String r3 = ", "
                r0.append(r3)
            L22:
                r0.append(r2)
                goto Lf
            L26:
                char r5 = r4.closingBrace
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                return r5
        }

        public abstract java.lang.String toSourceString(net.bytebuddy.description.type.TypeDescription r1);

        public java.lang.String toSourceString(short r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Short.toString(r1)
                return r1
        }

        public java.lang.String toSourceString(boolean r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Boolean.toString(r1)
                return r1
        }

        public java.lang.String toTypeErrorString(java.lang.Class<?> r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }
    }

    public enum Sort extends java.lang.Enum<net.bytebuddy.description.annotation.AnnotationValue.Sort> {
        private static final /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue.Sort[] $VALUES = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort ANNOTATION = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort ARRAY = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort BOOLEAN = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort BYTE = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort CHARACTER = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort DOUBLE = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort ENUMERATION = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort FLOAT = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort INTEGER = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort LONG = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort NONE = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort SHORT = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort STRING = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.Sort TYPE = null;
        private final int tag;

        static {
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r1 = 90
                java.lang.String r2 = "BOOLEAN"
                r3 = 0
                r0.<init>(r2, r3, r1)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.BOOLEAN = r0
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r2 = 1
                r4 = 66
                java.lang.String r5 = "BYTE"
                r1.<init>(r5, r2, r4)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.BYTE = r1
                net.bytebuddy.description.annotation.AnnotationValue$Sort r2 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r4 = 2
                r5 = 83
                java.lang.String r6 = "SHORT"
                r2.<init>(r6, r4, r5)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.SHORT = r2
                net.bytebuddy.description.annotation.AnnotationValue$Sort r4 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r5 = 3
                r6 = 67
                java.lang.String r7 = "CHARACTER"
                r4.<init>(r7, r5, r6)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.CHARACTER = r4
                net.bytebuddy.description.annotation.AnnotationValue$Sort r5 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r6 = 4
                r7 = 73
                java.lang.String r8 = "INTEGER"
                r5.<init>(r8, r6, r7)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.INTEGER = r5
                net.bytebuddy.description.annotation.AnnotationValue$Sort r6 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r7 = 5
                r8 = 74
                java.lang.String r9 = "LONG"
                r6.<init>(r9, r7, r8)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.LONG = r6
                net.bytebuddy.description.annotation.AnnotationValue$Sort r7 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r8 = 6
                r9 = 70
                java.lang.String r10 = "FLOAT"
                r7.<init>(r10, r8, r9)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.FLOAT = r7
                net.bytebuddy.description.annotation.AnnotationValue$Sort r8 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r9 = 7
                r10 = 68
                java.lang.String r11 = "DOUBLE"
                r8.<init>(r11, r9, r10)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.DOUBLE = r8
                net.bytebuddy.description.annotation.AnnotationValue$Sort r9 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r10 = 8
                r11 = 115(0x73, float:1.61E-43)
                java.lang.String r12 = "STRING"
                r9.<init>(r12, r10, r11)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.STRING = r9
                net.bytebuddy.description.annotation.AnnotationValue$Sort r10 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r11 = 9
                r12 = 99
                java.lang.String r13 = "TYPE"
                r10.<init>(r13, r11, r12)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.TYPE = r10
                net.bytebuddy.description.annotation.AnnotationValue$Sort r11 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r12 = 10
                r13 = 101(0x65, float:1.42E-43)
                java.lang.String r14 = "ENUMERATION"
                r11.<init>(r14, r12, r13)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.ENUMERATION = r11
                net.bytebuddy.description.annotation.AnnotationValue$Sort r12 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r13 = 11
                r14 = 64
                java.lang.String r15 = "ANNOTATION"
                r12.<init>(r15, r13, r14)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.ANNOTATION = r12
                net.bytebuddy.description.annotation.AnnotationValue$Sort r13 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                r14 = 12
                r15 = 91
                java.lang.String r3 = "ARRAY"
                r13.<init>(r3, r14, r15)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.ARRAY = r13
                net.bytebuddy.description.annotation.AnnotationValue$Sort r14 = new net.bytebuddy.description.annotation.AnnotationValue$Sort
                java.lang.String r3 = "NONE"
                r15 = 13
                r16 = r13
                r13 = 0
                r14.<init>(r3, r15, r13)
                net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE = r14
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r16
                r13 = r14
                net.bytebuddy.description.annotation.AnnotationValue$Sort[] r0 = new net.bytebuddy.description.annotation.AnnotationValue.Sort[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
                net.bytebuddy.description.annotation.AnnotationValue.Sort.$VALUES = r0
                return
        }

        Sort(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.tag = r3
                return
        }

        public static net.bytebuddy.description.annotation.AnnotationValue.Sort of(net.bytebuddy.description.type.TypeDefinition r1) {
                java.lang.Class r0 = java.lang.Boolean.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto Lb
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.BOOLEAN
                return r1
            Lb:
                java.lang.Class r0 = java.lang.Byte.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L16
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.BYTE
                return r1
            L16:
                java.lang.Class r0 = java.lang.Short.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L21
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.SHORT
                return r1
            L21:
                java.lang.Class r0 = java.lang.Character.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L2c
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.CHARACTER
                return r1
            L2c:
                java.lang.Class r0 = java.lang.Integer.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L37
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.INTEGER
                return r1
            L37:
                java.lang.Class r0 = java.lang.Long.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L42
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.LONG
                return r1
            L42:
                java.lang.Class r0 = java.lang.Float.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L4d
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.FLOAT
                return r1
            L4d:
                java.lang.Class r0 = java.lang.Double.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L58
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.DOUBLE
                return r1
            L58:
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L63
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.STRING
                return r1
            L63:
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L6e
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.TYPE
                return r1
            L6e:
                boolean r0 = r1.isEnum()
                if (r0 == 0) goto L77
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ENUMERATION
                return r1
            L77:
                boolean r0 = r1.isAnnotation()
                if (r0 == 0) goto L80
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ANNOTATION
                return r1
            L80:
                boolean r1 = r1.isArray()
                if (r1 == 0) goto L89
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ARRAY
                return r1
            L89:
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                return r1
        }

        public static net.bytebuddy.description.annotation.AnnotationValue.Sort valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.description.annotation.AnnotationValue$Sort> r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = (net.bytebuddy.description.annotation.AnnotationValue.Sort) r1
                return r1
        }

        public static net.bytebuddy.description.annotation.AnnotationValue.Sort[] values() {
                net.bytebuddy.description.annotation.AnnotationValue$Sort[] r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.description.annotation.AnnotationValue$Sort[] r0 = (net.bytebuddy.description.annotation.AnnotationValue.Sort[]) r0
                return r0
        }

        public int getTag() {
                r1 = this;
                int r0 = r1.tag
                return r0
        }

        public boolean isDefined() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                if (r1 == r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    public enum State extends java.lang.Enum<net.bytebuddy.description.annotation.AnnotationValue.State> {
        private static final /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue.State[] $VALUES = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.State RESOLVED = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.State UNDEFINED = null;
        public static final net.bytebuddy.description.annotation.AnnotationValue.State UNRESOLVED = null;

        static {
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = new net.bytebuddy.description.annotation.AnnotationValue$State
                java.lang.String r1 = "UNDEFINED"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.description.annotation.AnnotationValue.State.UNDEFINED = r0
                net.bytebuddy.description.annotation.AnnotationValue$State r1 = new net.bytebuddy.description.annotation.AnnotationValue$State
                java.lang.String r2 = "UNRESOLVED"
                r3 = 1
                r1.<init>(r2, r3)
                net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED = r1
                net.bytebuddy.description.annotation.AnnotationValue$State r2 = new net.bytebuddy.description.annotation.AnnotationValue$State
                java.lang.String r3 = "RESOLVED"
                r4 = 2
                r2.<init>(r3, r4)
                net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED = r2
                net.bytebuddy.description.annotation.AnnotationValue$State[] r0 = new net.bytebuddy.description.annotation.AnnotationValue.State[]{r0, r1, r2}
                net.bytebuddy.description.annotation.AnnotationValue.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.description.annotation.AnnotationValue.State valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.description.annotation.AnnotationValue$State> r0 = net.bytebuddy.description.annotation.AnnotationValue.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.description.annotation.AnnotationValue$State r1 = (net.bytebuddy.description.annotation.AnnotationValue.State) r1
                return r1
        }

        public static net.bytebuddy.description.annotation.AnnotationValue.State[] values() {
                net.bytebuddy.description.annotation.AnnotationValue$State[] r0 = net.bytebuddy.description.annotation.AnnotationValue.State.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.description.annotation.AnnotationValue$State[] r0 = (net.bytebuddy.description.annotation.AnnotationValue.State[]) r0
                return r0
        }

        public boolean isDefined() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNDEFINED
                if (r1 == r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isResolved() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    static {
            return
    }

    net.bytebuddy.description.annotation.AnnotationValue<T, S> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);

    net.bytebuddy.description.annotation.AnnotationValue<T, S> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDefinition r2);

    net.bytebuddy.description.annotation.AnnotationValue.Sort getSort();

    net.bytebuddy.description.annotation.AnnotationValue.State getState();

    net.bytebuddy.description.annotation.AnnotationValue.Loaded<S> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1);

    T resolve();

    <W> W resolve(java.lang.Class<? extends W> r1);
}

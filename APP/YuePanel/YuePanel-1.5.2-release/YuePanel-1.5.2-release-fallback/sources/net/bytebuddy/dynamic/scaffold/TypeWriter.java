package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeWriter<T> {
    public static final java.lang.String DUMP_PROPERTY = "net.bytebuddy.dump";

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static abstract class Default<S> implements net.bytebuddy.dynamic.scaffold.TypeWriter<S> {
        private static final boolean ACCESS_CONTROLLER = false;

        @net.bytebuddy.utility.nullability.MaybeNull
        protected static final java.lang.String DUMP_FOLDER = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final java.lang.String NO_REFERENCE = null;
        protected final net.bytebuddy.implementation.attribute.AnnotationRetention annotationRetention;
        protected final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory annotationValueFilterFactory;
        protected final net.bytebuddy.asm.AsmVisitorWrapper asmVisitorWrapper;
        protected final net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
        protected final java.util.List<? extends net.bytebuddy.dynamic.DynamicType> auxiliaryTypes;
        protected final net.bytebuddy.ClassFileVersion classFileVersion;
        protected final net.bytebuddy.dynamic.scaffold.ClassWriterStrategy classWriterStrategy;
        protected final net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool fieldPool;
        protected final net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> fields;
        protected final net.bytebuddy.implementation.Implementation.Context.Factory implementationContextFactory;
        protected final net.bytebuddy.description.method.MethodList<?> instrumentedMethods;
        protected final net.bytebuddy.description.type.TypeDescription instrumentedType;
        protected final net.bytebuddy.implementation.LoadedTypeInitializer loadedTypeInitializer;
        protected final net.bytebuddy.description.method.MethodList<?> methods;
        protected final net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool recordComponentPool;
        protected final net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> recordComponents;
        protected final net.bytebuddy.implementation.attribute.TypeAttributeAppender typeAttributeAppender;
        protected final net.bytebuddy.dynamic.scaffold.TypeInitializer typeInitializer;
        protected final net.bytebuddy.pool.TypePool typePool;
        protected final net.bytebuddy.dynamic.scaffold.TypeValidation typeValidation;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ClassDumpAction implements java.security.PrivilegedExceptionAction<java.lang.Void> {

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final java.lang.Void NOTHING = null;
            private final byte[] binaryRepresentation;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final boolean original;
            private final long suffix;
            private final java.lang.String target;

            public interface Dispatcher {

                public enum Disabled extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled> implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled INSTANCE = null;

                    static {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Disabled r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Disabled
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled.INSTANCE = r0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Disabled[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled[]{r0}
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled.$VALUES = r0
                            return
                    }

                    Disabled(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Disabled> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Disabled r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled[] values() {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Disabled[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Disabled[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher
                    public void dump(net.bytebuddy.description.type.TypeDescription r1, boolean r2, byte[] r3) {
                            r0 = this;
                            return
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Enabled implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher {
                    private final java.lang.String folder;
                    private final long timestamp;

                    public Enabled(java.lang.String r1, long r2) {
                            r0 = this;
                            r0.<init>()
                            r0.folder = r1
                            r0.timestamp = r2
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher
                    public void dump(net.bytebuddy.description.type.TypeDescription r9, boolean r10, byte[] r11) {
                            r8 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction r7 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction     // Catch: java.lang.Exception -> L11
                            java.lang.String r1 = r8.folder     // Catch: java.lang.Exception -> L11
                            long r4 = r8.timestamp     // Catch: java.lang.Exception -> L11
                            r0 = r7
                            r2 = r9
                            r3 = r10
                            r6 = r11
                            r0.<init>(r1, r2, r3, r4, r6)     // Catch: java.lang.Exception -> L11
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$1400(r7)     // Catch: java.lang.Exception -> L11
                            goto L15
                        L11:
                            r9 = move-exception
                            r9.printStackTrace()
                        L15:
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                            r6 = this;
                            r0 = 1
                            if (r6 != r7) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r7 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r6.getClass()
                            java.lang.Class r3 = r7.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            long r2 = r6.timestamp
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Enabled r7 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Enabled) r7
                            long r4 = r7.timestamp
                            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                            if (r2 == 0) goto L1e
                            return r1
                        L1e:
                            java.lang.String r2 = r6.folder
                            java.lang.String r7 = r7.folder
                            boolean r7 = r2.equals(r7)
                            if (r7 != 0) goto L29
                            return r1
                        L29:
                            return r0
                    }

                    public int hashCode() {
                            r5 = this;
                            java.lang.Class r0 = r5.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r5.folder
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            long r1 = r5.timestamp
                            r3 = 32
                            long r3 = r1 >>> r3
                            long r1 = r1 ^ r3
                            int r1 = (int) r1
                            int r0 = r0 + r1
                            return r0
                    }
                }

                void dump(net.bytebuddy.description.type.TypeDescription r1, boolean r2, byte[] r3);
            }

            static {
                    return
            }

            public ClassDumpAction(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, boolean r3, long r4, byte[] r6) {
                    r0 = this;
                    r0.<init>()
                    r0.target = r1
                    r0.instrumentedType = r2
                    r0.original = r3
                    r0.suffix = r4
                    r0.binaryRepresentation = r6
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                    r6 = this;
                    r0 = 1
                    if (r6 != r7) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r7 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r6.getClass()
                    java.lang.Class r3 = r7.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    boolean r2 = r6.original
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction r7 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction) r7
                    boolean r3 = r7.original
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    long r2 = r6.suffix
                    long r4 = r7.suffix
                    int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    java.lang.String r2 = r6.target
                    java.lang.String r3 = r7.target
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L30
                    return r1
                L30:
                    net.bytebuddy.description.type.TypeDescription r2 = r6.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r3 = r7.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3b
                    return r1
                L3b:
                    byte[] r2 = r6.binaryRepresentation
                    byte[] r7 = r7.binaryRepresentation
                    boolean r7 = java.util.Arrays.equals(r2, r7)
                    if (r7 != 0) goto L46
                    return r1
                L46:
                    return r0
            }

            public int hashCode() {
                    r5 = this;
                    java.lang.Class r0 = r5.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.lang.String r1 = r5.target
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r5.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r5.original
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    long r1 = r5.suffix
                    r3 = 32
                    long r3 = r1 >>> r3
                    long r1 = r1 ^ r3
                    int r1 = (int) r1
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    byte[] r1 = r5.binaryRepresentation
                    int r1 = java.util.Arrays.hashCode(r1)
                    int r0 = r0 + r1
                    return r0
            }

            @Override // java.security.PrivilegedExceptionAction
            public /* bridge */ /* synthetic */ java.lang.Void run() throws java.lang.Exception {
                    r1 = this;
                    java.lang.Void r0 = r1.run2()
                    return r0
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
            public java.lang.Void run2() throws java.lang.Exception {
                    r6 = this;
                    java.io.FileOutputStream r0 = new java.io.FileOutputStream
                    java.io.File r1 = new java.io.File
                    java.lang.String r2 = r6.target
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    net.bytebuddy.description.type.TypeDescription r4 = r6.instrumentedType
                    java.lang.String r4 = r4.getName()
                    r3.append(r4)
                    boolean r4 = r6.original
                    if (r4 == 0) goto L1b
                    java.lang.String r4 = "-original."
                    goto L1d
                L1b:
                    java.lang.String r4 = "."
                L1d:
                    r3.append(r4)
                    long r4 = r6.suffix
                    r3.append(r4)
                    java.lang.String r4 = ".class"
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    r1.<init>(r2, r3)
                    r0.<init>(r1)
                    byte[] r1 = r6.binaryRepresentation     // Catch: java.lang.Throwable -> L3f
                    r0.write(r1)     // Catch: java.lang.Throwable -> L3f
                    java.lang.Void r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.NOTHING     // Catch: java.lang.Throwable -> L3f
                    r0.close()
                    return r1
                L3f:
                    r1 = move-exception
                    r0.close()
                    throw r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForCreation<U> extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default<U> {
            private final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool methodPool;

            public class CreationClassVisitor extends net.bytebuddy.utility.visitor.MetadataAwareClassVisitor {
                private final java.util.Set<java.lang.String> declaredTypes;
                private final net.bytebuddy.implementation.Implementation.Context.ExtractableView implementationContext;
                final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForCreation this$0;
                private final java.util.Set<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.SignatureKey> visitedFields;
                private final java.util.Set<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.SignatureKey> visitedMethods;

                public CreationClassVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForCreation r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context.ExtractableView r3) {
                        r0 = this;
                        r0.this$0 = r1
                        int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                        r0.<init>(r1, r2)
                        java.util.HashSet r1 = new java.util.HashSet
                        r1.<init>()
                        r0.declaredTypes = r1
                        java.util.HashSet r1 = new java.util.HashSet
                        r1.<init>()
                        r0.visitedFields = r1
                        java.util.HashSet r1 = new java.util.HashSet
                        r1.<init>()
                        r0.visitedMethods = r1
                        r0.implementationContext = r3
                        return
                }

                @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                public void onAfterAttributes() {
                        r4 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r0 = r4.this$0
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r1 = r0.typeAttributeAppender
                        net.bytebuddy.jar.asm.ClassVisitor r2 = r4.cv
                        net.bytebuddy.description.type.TypeDescription r3 = r0.instrumentedType
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r0 = r0.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter r0 = r0.on(r3)
                        r1.apply(r2, r3, r0)
                        return
                }

                @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                public void onVisitEnd() {
                        r6 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r0 = r6.this$0
                        net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                        net.bytebuddy.description.type.TypeList r0 = r0.getDeclaredTypes()
                        java.util.Iterator r0 = r0.iterator()
                    Lc:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L54
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                        java.util.Set<java.lang.String> r2 = r6.declaredTypes
                        java.lang.String r3 = r1.getInternalName()
                        boolean r2 = r2.contains(r3)
                        if (r2 != 0) goto Lc
                        net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                        java.lang.String r3 = r1.getInternalName()
                        boolean r4 = r1.isMemberType()
                        if (r4 == 0) goto L39
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r4 = r6.this$0
                        net.bytebuddy.description.type.TypeDescription r4 = r4.instrumentedType
                        java.lang.String r4 = r4.getInternalName()
                        goto L3d
                    L39:
                        java.lang.String r4 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                    L3d:
                        boolean r5 = r1.isAnonymousType()
                        if (r5 == 0) goto L48
                        java.lang.String r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                        goto L4c
                    L48:
                        java.lang.String r5 = r1.getSimpleName()
                    L4c:
                        int r1 = r1.getModifiers()
                        r2.visitInnerClass(r3, r4, r5, r1)
                        goto Lc
                    L54:
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r0 = r6.this$0
                        net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r0 = r0.fields
                        java.util.Iterator r0 = r0.iterator()
                    L5c:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L8f
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.description.field.FieldDescription r1 = (net.bytebuddy.description.field.FieldDescription) r1
                        java.util.Set<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey> r2 = r6.visitedFields
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r3 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey
                        java.lang.String r4 = r1.getName()
                        java.lang.String r5 = r1.getDescriptor()
                        r3.<init>(r4, r5)
                        boolean r2 = r2.contains(r3)
                        if (r2 != 0) goto L5c
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r2 = r6.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool r2 = r2.fieldPool
                        net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record r1 = r2.target(r1)
                        net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r3 = r6.this$0
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r3.annotationValueFilterFactory
                        r1.apply(r2, r3)
                        goto L5c
                    L8f:
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r0 = r6.this$0
                        net.bytebuddy.description.method.MethodList<?> r0 = r0.instrumentedMethods
                        java.util.Iterator r0 = r0.iterator()
                    L97:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto Lce
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                        java.util.Set<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey> r2 = r6.visitedMethods
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r3 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey
                        java.lang.String r4 = r1.getInternalName()
                        java.lang.String r5 = r1.getDescriptor()
                        r3.<init>(r4, r5)
                        boolean r2 = r2.contains(r3)
                        if (r2 != 0) goto L97
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r2 = r6.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForCreation.access$1300(r2)
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r1 = r2.target(r1)
                        net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                        net.bytebuddy.implementation.Implementation$Context$ExtractableView r3 = r6.implementationContext
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r4 = r6.this$0
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r4.annotationValueFilterFactory
                        r1.apply(r2, r3, r4)
                        goto L97
                    Lce:
                        net.bytebuddy.implementation.Implementation$Context$ExtractableView r0 = r6.implementationContext
                        net.bytebuddy.dynamic.scaffold.TypeInitializer$Drain$Default r1 = new net.bytebuddy.dynamic.scaffold.TypeInitializer$Drain$Default
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r2 = r6.this$0
                        net.bytebuddy.description.type.TypeDescription r3 = r2.instrumentedType
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForCreation.access$1300(r2)
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r4 = r6.this$0
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r4.annotationValueFilterFactory
                        r1.<init>(r3, r2, r4)
                        net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r3 = r6.this$0
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r3.annotationValueFilterFactory
                        r0.drain(r1, r2, r3)
                        super.onVisitEnd()
                        return
                }

                @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                public net.bytebuddy.jar.asm.FieldVisitor onVisitField(int r3, java.lang.String r4, java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                        r2 = this;
                        java.util.Set<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey> r0 = r2.visitedFields
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey
                        r1.<init>(r4, r5)
                        r0.add(r1)
                        net.bytebuddy.jar.asm.FieldVisitor r3 = super.onVisitField(r3, r4, r5, r6, r7)
                        return r3
                }

                @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                public void onVisitInnerClass(java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, int r5) {
                        r1 = this;
                        java.util.Set<java.lang.String> r0 = r1.declaredTypes
                        r0.add(r2)
                        super.onVisitInnerClass(r2, r3, r4, r5)
                        return
                }

                @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                public net.bytebuddy.jar.asm.MethodVisitor onVisitMethod(int r3, java.lang.String r4, java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r7) {
                        r2 = this;
                        java.util.Set<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey> r0 = r2.visitedMethods
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey
                        r1.<init>(r4, r5)
                        r0.add(r1)
                        net.bytebuddy.jar.asm.MethodVisitor r3 = super.onVisitMethod(r3, r4, r5, r6, r7)
                        return r3
                }
            }

            public class ImplementationContextClassVisitor extends net.bytebuddy.utility.visitor.ContextClassVisitor {
                private final net.bytebuddy.implementation.Implementation.Context.ExtractableView implementationContext;
                final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForCreation this$0;

                public ImplementationContextClassVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForCreation r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context.ExtractableView r3) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>(r2)
                        r0.implementationContext = r3
                        return
                }

                @Override // net.bytebuddy.utility.visitor.ContextClassVisitor
                public java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes() {
                        r2 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r0 = r2.this$0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r0.auxiliaryTypes
                        net.bytebuddy.implementation.Implementation$Context$ExtractableView r1 = r2.implementationContext
                        java.util.List r1 = r1.getAuxiliaryTypes()
                        java.util.List r0 = net.bytebuddy.utility.CompoundList.of(r0, r1)
                        return r0
                }

                @Override // net.bytebuddy.utility.visitor.ContextClassVisitor
                public net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer() {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r0 = r1.this$0
                        net.bytebuddy.implementation.LoadedTypeInitializer r0 = r0.loadedTypeInitializer
                        return r0
                }
            }

            public ForCreation(net.bytebuddy.description.type.TypeDescription r22, net.bytebuddy.ClassFileVersion r23, net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool r24, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool r25, net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool r26, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r27, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r28, net.bytebuddy.description.method.MethodList<?> r29, net.bytebuddy.description.method.MethodList<?> r30, net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> r31, net.bytebuddy.implementation.LoadedTypeInitializer r32, net.bytebuddy.dynamic.scaffold.TypeInitializer r33, net.bytebuddy.implementation.attribute.TypeAttributeAppender r34, net.bytebuddy.asm.AsmVisitorWrapper r35, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r36, net.bytebuddy.implementation.attribute.AnnotationRetention r37, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r38, net.bytebuddy.implementation.Implementation.Context.Factory r39, net.bytebuddy.dynamic.scaffold.TypeValidation r40, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r41, net.bytebuddy.pool.TypePool r42) {
                    r21 = this;
                    r0 = r21
                    r1 = r22
                    r2 = r23
                    r3 = r24
                    r4 = r26
                    r5 = r27
                    r6 = r28
                    r7 = r29
                    r8 = r30
                    r9 = r31
                    r10 = r32
                    r11 = r33
                    r12 = r34
                    r13 = r35
                    r14 = r36
                    r15 = r37
                    r16 = r38
                    r17 = r39
                    r18 = r40
                    r19 = r41
                    r20 = r42
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    r1 = r25
                    r0.methodPool = r1
                    return
            }

            public static /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool access$1300(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForCreation r0) {
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r0 = r0.methodPool
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Relying on correlated type properties.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public net.bytebuddy.dynamic.scaffold.TypeWriter.Default<U>.UnresolvedType create(net.bytebuddy.dynamic.scaffold.TypeInitializer r20, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher r21) {
                    r19 = this;
                    r0 = r19
                    net.bytebuddy.asm.AsmVisitorWrapper r1 = r0.asmVisitorWrapper
                    r2 = 0
                    int r10 = r1.mergeWriter(r2)
                    net.bytebuddy.asm.AsmVisitorWrapper r1 = r0.asmVisitorWrapper
                    int r11 = r1.mergeReader(r2)
                    net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r0.classWriterStrategy
                    net.bytebuddy.pool.TypePool r2 = r0.typePool
                    net.bytebuddy.jar.asm.ClassWriter r1 = r1.resolve(r10, r2)
                    net.bytebuddy.implementation.Implementation$Context$Factory r2 = r0.implementationContextFactory
                    net.bytebuddy.description.type.TypeDescription r3 = r0.instrumentedType
                    net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r4 = r0.auxiliaryTypeNamingStrategy
                    net.bytebuddy.ClassFileVersion r7 = r0.classFileVersion
                    r5 = r10 & 2
                    if (r5 != 0) goto L36
                    net.bytebuddy.ClassFileVersion r5 = net.bytebuddy.ClassFileVersion.JAVA_V6
                    boolean r5 = r7.isAtLeast(r5)
                    if (r5 == 0) goto L36
                    r5 = r11 & 8
                    if (r5 != 0) goto L33
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration r5 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE
                L31:
                    r8 = r5
                    goto L39
                L33:
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration r5 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EXPAND
                    goto L31
                L36:
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration r5 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.DISABLED
                    goto L31
                L39:
                    r5 = r20
                    r6 = r7
                    net.bytebuddy.implementation.Implementation$Context$ExtractableView r2 = r2.make(r3, r4, r5, r6, r7, r8)
                    net.bytebuddy.asm.AsmVisitorWrapper r3 = r0.asmVisitorWrapper
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.dynamic.scaffold.TypeValidation r5 = r0.typeValidation
                    net.bytebuddy.jar.asm.ClassVisitor r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.of(r1, r5)
                    net.bytebuddy.pool.TypePool r7 = r0.typePool
                    net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r8 = r0.fields
                    net.bytebuddy.description.method.MethodList<?> r9 = r0.methods
                    r6 = r2
                    net.bytebuddy.jar.asm.ClassVisitor r3 = r3.wrap(r4, r5, r6, r7, r8, r9, r10, r11)
                    net.bytebuddy.ClassFileVersion r4 = r0.classFileVersion
                    int r13 = r4.getMinorMajorVersion()
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    boolean r5 = r4.isInterface()
                    r5 = r5 ^ 1
                    int r14 = r4.getActualModifiers(r5)
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    java.lang.String r15 = r4.getInternalName()
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    java.lang.String r16 = r4.getGenericSignature()
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getSuperClass()
                    if (r4 != 0) goto L82
                    java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                    net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                    goto L8c
                L82:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getSuperClass()
                    net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                L8c:
                    java.lang.String r17 = r4.getInternalName()
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeList$Generic r4 = r4.getInterfaces()
                    net.bytebuddy.description.type.TypeList r4 = r4.asErasures()
                    java.lang.String[] r18 = r4.toInternalNames()
                    r12 = r3
                    r12.visit(r13, r14, r15, r16, r17, r18)
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    boolean r4 = r4.isNestHost()
                    if (r4 != 0) goto Lb7
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r4 = r4.getNestHost()
                    java.lang.String r4 = r4.getInternalName()
                    r3.visitNestHost(r4)
                Lb7:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r4.getEnclosingMethod()
                    if (r4 == 0) goto Ld3
                    net.bytebuddy.description.type.TypeDescription r5 = r4.getDeclaringType()
                    java.lang.String r5 = r5.getInternalName()
                    java.lang.String r6 = r4.getInternalName()
                    java.lang.String r4 = r4.getDescriptor()
                    r3.visitOuterClass(r5, r6, r4)
                    goto Lf8
                Ld3:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    boolean r4 = r4.isLocalType()
                    if (r4 != 0) goto Le3
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    boolean r4 = r4.isAnonymousType()
                    if (r4 == 0) goto Lf8
                Le3:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r4 = r4.getEnclosingType()
                    java.lang.String r4 = r4.getInternalName()
                    java.lang.String r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                    java.lang.String r6 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                    r3.visitOuterClass(r4, r5, r6)
                Lf8:
                    net.bytebuddy.implementation.attribute.TypeAttributeAppender r4 = r0.typeAttributeAppender
                    net.bytebuddy.description.type.TypeDescription r5 = r0.instrumentedType
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r6 = r0.annotationValueFilterFactory
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter r6 = r6.on(r5)
                    r4.apply(r3, r5, r6)
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    boolean r4 = r4.isNestHost()
                    if (r4 == 0) goto L13b
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeList r4 = r4.getNestMembers()
                    net.bytebuddy.description.type.TypeDescription r5 = r0.instrumentedType
                    net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.is(r5)
                    net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.not(r5)
                    net.bytebuddy.matcher.FilterableList r4 = r4.filter(r5)
                    net.bytebuddy.description.type.TypeList r4 = (net.bytebuddy.description.type.TypeList) r4
                    java.util.Iterator r4 = r4.iterator()
                L127:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L13b
                    java.lang.Object r5 = r4.next()
                    net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                    java.lang.String r5 = r5.getInternalName()
                    r3.visitNestMember(r5)
                    goto L127
                L13b:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeList r4 = r4.getPermittedSubtypes()
                    java.util.Iterator r4 = r4.iterator()
                L145:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L159
                    java.lang.Object r5 = r4.next()
                    net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                    java.lang.String r5 = r5.getInternalName()
                    r3.visitPermittedSubclass(r5)
                    goto L145
                L159:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r4 = r4.getDeclaringType()
                    if (r4 == 0) goto L17b
                    net.bytebuddy.description.type.TypeDescription r5 = r0.instrumentedType
                    java.lang.String r5 = r5.getInternalName()
                    java.lang.String r4 = r4.getInternalName()
                    net.bytebuddy.description.type.TypeDescription r6 = r0.instrumentedType
                    java.lang.String r6 = r6.getSimpleName()
                    net.bytebuddy.description.type.TypeDescription r7 = r0.instrumentedType
                    int r7 = r7.getModifiers()
                    r3.visitInnerClass(r5, r4, r6, r7)
                    goto L1bc
                L17b:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    boolean r4 = r4.isLocalType()
                    if (r4 == 0) goto L19d
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    java.lang.String r4 = r4.getInternalName()
                    java.lang.String r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                    net.bytebuddy.description.type.TypeDescription r6 = r0.instrumentedType
                    java.lang.String r6 = r6.getSimpleName()
                    net.bytebuddy.description.type.TypeDescription r7 = r0.instrumentedType
                    int r7 = r7.getModifiers()
                    r3.visitInnerClass(r4, r5, r6, r7)
                    goto L1bc
                L19d:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    boolean r4 = r4.isAnonymousType()
                    if (r4 == 0) goto L1bc
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    java.lang.String r4 = r4.getInternalName()
                    java.lang.String r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                    java.lang.String r6 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                    net.bytebuddy.description.type.TypeDescription r7 = r0.instrumentedType
                    int r7 = r7.getModifiers()
                    r3.visitInnerClass(r4, r5, r6, r7)
                L1bc:
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.description.type.TypeList r4 = r4.getDeclaredTypes()
                    java.util.Iterator r4 = r4.iterator()
                L1c6:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L1fe
                    java.lang.Object r5 = r4.next()
                    net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                    java.lang.String r6 = r5.getInternalName()
                    boolean r7 = r5.isMemberType()
                    if (r7 == 0) goto L1e3
                    net.bytebuddy.description.type.TypeDescription r7 = r0.instrumentedType
                    java.lang.String r7 = r7.getInternalName()
                    goto L1e7
                L1e3:
                    java.lang.String r7 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                L1e7:
                    boolean r8 = r5.isAnonymousType()
                    if (r8 == 0) goto L1f2
                    java.lang.String r8 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                    goto L1f6
                L1f2:
                    java.lang.String r8 = r5.getSimpleName()
                L1f6:
                    int r5 = r5.getModifiers()
                    r3.visitInnerClass(r6, r7, r8, r5)
                    goto L1c6
                L1fe:
                    net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape> r4 = r0.recordComponents
                    java.util.Iterator r4 = r4.iterator()
                L204:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L21c
                    java.lang.Object r5 = r4.next()
                    net.bytebuddy.description.type.RecordComponentDescription r5 = (net.bytebuddy.description.type.RecordComponentDescription) r5
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool r6 = r0.recordComponentPool
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record r5 = r6.target(r5)
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r6 = r0.annotationValueFilterFactory
                    r5.apply(r3, r6)
                    goto L204
                L21c:
                    net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r0.fields
                    java.util.Iterator r4 = r4.iterator()
                L222:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L23a
                    java.lang.Object r5 = r4.next()
                    net.bytebuddy.description.field.FieldDescription r5 = (net.bytebuddy.description.field.FieldDescription) r5
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool r6 = r0.fieldPool
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record r5 = r6.target(r5)
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r6 = r0.annotationValueFilterFactory
                    r5.apply(r3, r6)
                    goto L222
                L23a:
                    net.bytebuddy.description.method.MethodList<?> r4 = r0.instrumentedMethods
                    java.util.Iterator r4 = r4.iterator()
                L240:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L258
                    java.lang.Object r5 = r4.next()
                    net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r6 = r0.methodPool
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r5 = r6.target(r5)
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r6 = r0.annotationValueFilterFactory
                    r5.apply(r3, r2, r6)
                    goto L240
                L258:
                    net.bytebuddy.dynamic.scaffold.TypeInitializer$Drain$Default r4 = new net.bytebuddy.dynamic.scaffold.TypeInitializer$Drain$Default
                    net.bytebuddy.description.type.TypeDescription r5 = r0.instrumentedType
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r6 = r0.methodPool
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r7 = r0.annotationValueFilterFactory
                    r4.<init>(r5, r6, r7)
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r5 = r0.annotationValueFilterFactory
                    r2.drain(r4, r3, r5)
                    r3.visitEnd()
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$UnresolvedType r3 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$UnresolvedType
                    byte[] r1 = r1.toByteArray()
                    java.util.List r2 = r2.getAuxiliaryTypes()
                    r3.<init>(r0, r1, r2)
                    return r3
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
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
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r2 = r4.methodPool
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForCreation) r5
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r5 = r5.methodPool
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r1 = r2.methodPool
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter
            public net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r20, int r21, int r22) {
                    r19 = this;
                    r0 = r19
                    r1 = r21
                    r2 = r22
                    net.bytebuddy.implementation.Implementation$Context$Factory r3 = r0.implementationContextFactory
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r5 = r0.auxiliaryTypeNamingStrategy
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r6 = r0.typeInitializer
                    net.bytebuddy.ClassFileVersion r8 = r0.classFileVersion
                    r7 = r1 & 2
                    if (r7 != 0) goto L27
                    net.bytebuddy.ClassFileVersion r7 = net.bytebuddy.ClassFileVersion.JAVA_V6
                    boolean r7 = r8.isAtLeast(r7)
                    if (r7 == 0) goto L27
                    r7 = r2 & 8
                    if (r7 != 0) goto L24
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration r7 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE
                L22:
                    r9 = r7
                    goto L2a
                L24:
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration r7 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EXPAND
                    goto L22
                L27:
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration r7 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.DISABLED
                    goto L22
                L2a:
                    r7 = r8
                    net.bytebuddy.implementation.Implementation$Context$ExtractableView r3 = r3.make(r4, r5, r6, r7, r8, r9)
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation$ImplementationContextClassVisitor r4 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation$ImplementationContextClassVisitor
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation$CreationClassVisitor r5 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation$CreationClassVisitor
                    net.bytebuddy.asm.AsmVisitorWrapper r10 = r0.asmVisitorWrapper
                    net.bytebuddy.description.type.TypeDescription r11 = r0.instrumentedType
                    net.bytebuddy.dynamic.scaffold.TypeValidation r6 = r0.typeValidation
                    r7 = r20
                    net.bytebuddy.jar.asm.ClassVisitor r12 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.of(r7, r6)
                    net.bytebuddy.pool.TypePool r14 = r0.typePool
                    net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r15 = r0.fields
                    net.bytebuddy.description.method.MethodList<?> r6 = r0.methods
                    net.bytebuddy.asm.AsmVisitorWrapper r7 = r0.asmVisitorWrapper
                    int r17 = r7.mergeWriter(r1)
                    net.bytebuddy.asm.AsmVisitorWrapper r1 = r0.asmVisitorWrapper
                    int r18 = r1.mergeReader(r2)
                    r13 = r3
                    r16 = r6
                    net.bytebuddy.jar.asm.ClassVisitor r1 = r10.wrap(r11, r12, r13, r14, r15, r16, r17, r18)
                    r5.<init>(r0, r1, r3)
                    r4.<init>(r0, r5, r3)
                    return r4
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForInlining<U> extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default<U> {

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final net.bytebuddy.jar.asm.AnnotationVisitor IGNORE_ANNOTATION = null;

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final net.bytebuddy.jar.asm.FieldVisitor IGNORE_FIELD = null;

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final net.bytebuddy.jar.asm.MethodVisitor IGNORE_METHOD = null;

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final net.bytebuddy.jar.asm.RecordComponentVisitor IGNORE_RECORD_COMPONENT = null;
            protected final net.bytebuddy.dynamic.ClassFileLocator classFileLocator;
            protected final net.bytebuddy.description.type.TypeDescription originalType;

            public static class ContextRegistry {

                @net.bytebuddy.utility.nullability.UnknownNull
                private net.bytebuddy.implementation.Implementation.Context.ExtractableView implementationContext;

                public ContextRegistry() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Lazy value definition is intended.", value = {"UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR"})
                public java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes() {
                        r1 = this;
                        net.bytebuddy.implementation.Implementation$Context$ExtractableView r0 = r1.implementationContext
                        java.util.List r0 = r0.getAuxiliaryTypes()
                        return r0
                }

                public void setImplementationContext(net.bytebuddy.implementation.Implementation.Context.ExtractableView r1) {
                        r0 = this;
                        r0.implementationContext = r1
                        return
                }
            }

            public class RegistryContextClassVisitor extends net.bytebuddy.utility.visitor.ContextClassVisitor {
                private final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry contextRegistry;
                final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining this$0;

                public RegistryContextClassVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry r3) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>(r2)
                        r0.contextRegistry = r3
                        return
                }

                @Override // net.bytebuddy.utility.visitor.ContextClassVisitor
                public java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes() {
                        r2 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining r0 = r2.this$0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r0.auxiliaryTypes
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$ContextRegistry r1 = r2.contextRegistry
                        java.util.List r1 = r1.getAuxiliaryTypes()
                        java.util.List r0 = net.bytebuddy.utility.CompoundList.of(r0, r1)
                        return r0
                }

                @Override // net.bytebuddy.utility.visitor.ContextClassVisitor
                public net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer() {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining r0 = r1.this$0
                        net.bytebuddy.implementation.LoadedTypeInitializer r0 = r0.loadedTypeInitializer
                        return r0
                }
            }

            public static class WithDecorationOnly<V> extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining<V> {

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Field access order is implied by ASM.", value = {"UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR"})
                public class DecorationClassVisitor extends net.bytebuddy.utility.visitor.MetadataAwareClassVisitor implements net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain {
                    private final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry contextRegistry;

                    @net.bytebuddy.utility.nullability.UnknownNull
                    private net.bytebuddy.implementation.Implementation.Context.ExtractableView implementationContext;
                    private final int readerFlags;
                    final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithDecorationOnly this$0;
                    private final int writerFlags;

                    public DecorationClassVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithDecorationOnly r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry r3, int r4, int r5) {
                            r0 = this;
                            r0.this$0 = r1
                            int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                            r0.<init>(r1, r2)
                            r0.contextRegistry = r3
                            r0.writerFlags = r4
                            r0.readerFlags = r5
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain
                    public void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.dynamic.scaffold.TypeInitializer r2, net.bytebuddy.implementation.Implementation.Context r3) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onAfterAttributes() {
                            r4 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly r0 = r4.this$0
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r1 = r0.typeAttributeAppender
                            net.bytebuddy.jar.asm.ClassVisitor r2 = r4.cv
                            net.bytebuddy.description.type.TypeDescription r3 = r0.instrumentedType
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r0 = r0.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter r0 = r0.on(r3)
                            r1.apply(r2, r3, r0)
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.AnnotationVisitor onVisitAnnotation(java.lang.String r2, boolean r3) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly r0 = r1.this$0
                            net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                            boolean r0 = r0.isEnabled()
                            if (r0 == 0) goto L11
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
                            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
                            goto L15
                        L11:
                            net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                        L15:
                            return r2
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onVisitEnd() {
                            r3 = this;
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r0 = r3.implementationContext
                            net.bytebuddy.jar.asm.ClassVisitor r1 = r3.cv
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly r2 = r3.this$0
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r2.annotationValueFilterFactory
                            r0.drain(r3, r1, r2)
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r3.cv
                            r0.visitEnd()
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.AnnotationVisitor onVisitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly r0 = r1.this$0
                            net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                            boolean r0 = r0.isEnabled()
                            if (r0 == 0) goto L11
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
                            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitTypeAnnotation(r2, r3, r4, r5)
                            goto L15
                        L11:
                            net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                        L15:
                            return r2
                    }

                    @Override // net.bytebuddy.jar.asm.ClassVisitor
                    public void visit(int r19, int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String[] r24) {
                            r18 = this;
                            r0 = r18
                            net.bytebuddy.ClassFileVersion r5 = net.bytebuddy.ClassFileVersion.ofMinorMajor(r19)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly r1 = r0.this$0
                            net.bytebuddy.implementation.Implementation$Context$Factory r2 = r1.implementationContextFactory
                            net.bytebuddy.description.type.TypeDescription r3 = r1.instrumentedType
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r4 = r1.auxiliaryTypeNamingStrategy
                            net.bytebuddy.dynamic.scaffold.TypeInitializer r6 = r1.typeInitializer
                            net.bytebuddy.ClassFileVersion r7 = r1.classFileVersion
                            int r1 = r0.writerFlags
                            r1 = r1 & 2
                            if (r1 != 0) goto L2d
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V6
                            boolean r1 = r5.isAtLeast(r1)
                            if (r1 == 0) goto L2d
                            int r1 = r0.readerFlags
                            r1 = r1 & 8
                            if (r1 != 0) goto L2a
                            net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE
                        L28:
                            r8 = r1
                            goto L30
                        L2a:
                            net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EXPAND
                            goto L28
                        L2d:
                            net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.DISABLED
                            goto L28
                        L30:
                            r1 = r2
                            r2 = r3
                            r3 = r4
                            r4 = r6
                            r6 = r7
                            r7 = r8
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r1 = r1.make(r2, r3, r4, r5, r6, r7)
                            r0.implementationContext = r1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$ContextRegistry r2 = r0.contextRegistry
                            r2.setImplementationContext(r1)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly r1 = r0.this$0
                            net.bytebuddy.asm.AsmVisitorWrapper r2 = r1.asmVisitorWrapper
                            net.bytebuddy.description.type.TypeDescription r3 = r1.instrumentedType
                            net.bytebuddy.jar.asm.ClassVisitor r4 = r0.cv
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r5 = r0.implementationContext
                            net.bytebuddy.pool.TypePool r6 = r1.typePool
                            net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r7 = r1.fields
                            net.bytebuddy.description.method.MethodList<?> r8 = r1.methods
                            int r9 = r0.writerFlags
                            int r10 = r0.readerFlags
                            net.bytebuddy.jar.asm.ClassVisitor r11 = r2.wrap(r3, r4, r5, r6, r7, r8, r9, r10)
                            r0.cv = r11
                            r12 = r19
                            r13 = r20
                            r14 = r21
                            r15 = r22
                            r16 = r23
                            r17 = r24
                            r11.visit(r12, r13, r14, r15, r16, r17)
                            return
                    }
                }

                public static class LazyFieldList extends net.bytebuddy.description.field.FieldList.AbstractBase<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
                    private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                    public LazyFieldList(net.bytebuddy.description.type.TypeDescription r1) {
                            r0 = this;
                            r0.<init>()
                            r0.instrumentedType = r1
                            return
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.field.FieldDescription.InDefinedShape get(int r2) {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                            net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                            java.lang.Object r2 = r0.get(r2)
                            net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                            return r2
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                            net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                            int r0 = r0.size()
                            return r0
                    }
                }

                public WithDecorationOnly(net.bytebuddy.description.type.TypeDescription r24, net.bytebuddy.ClassFileVersion r25, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r26, net.bytebuddy.description.method.MethodList<?> r27, net.bytebuddy.implementation.attribute.TypeAttributeAppender r28, net.bytebuddy.asm.AsmVisitorWrapper r29, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r30, net.bytebuddy.implementation.attribute.AnnotationRetention r31, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r32, net.bytebuddy.implementation.Implementation.Context.Factory r33, net.bytebuddy.dynamic.scaffold.TypeValidation r34, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r35, net.bytebuddy.pool.TypePool r36, net.bytebuddy.dynamic.ClassFileLocator r37) {
                        r23 = this;
                        r0 = r23
                        r1 = r24
                        r21 = r24
                        r2 = r25
                        r5 = r26
                        r7 = r27
                        r12 = r28
                        r13 = r29
                        r14 = r30
                        r15 = r31
                        r16 = r32
                        r17 = r33
                        r18 = r34
                        r19 = r35
                        r20 = r36
                        r22 = r37
                        net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Disabled r3 = net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled.INSTANCE
                        net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Disabled r4 = net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled.INSTANCE
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly$LazyFieldList r8 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly$LazyFieldList
                        r6 = r8
                        r9 = r24
                        r8.<init>(r9)
                        net.bytebuddy.description.method.MethodList$Empty r9 = new net.bytebuddy.description.method.MethodList$Empty
                        r8 = r9
                        r9.<init>()
                        net.bytebuddy.description.type.RecordComponentList$Empty r10 = new net.bytebuddy.description.type.RecordComponentList$Empty
                        r9 = r10
                        r10.<init>()
                        net.bytebuddy.implementation.LoadedTypeInitializer$NoOp r10 = net.bytebuddy.implementation.LoadedTypeInitializer.NoOp.INSTANCE
                        net.bytebuddy.dynamic.scaffold.TypeInitializer$None r11 = net.bytebuddy.dynamic.scaffold.TypeInitializer.None.INSTANCE
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining
                public net.bytebuddy.jar.asm.ClassVisitor writeTo(net.bytebuddy.jar.asm.ClassVisitor r7, net.bytebuddy.dynamic.scaffold.TypeInitializer r8, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry r9, int r10, int r11) {
                        r6 = this;
                        boolean r8 = r8.isDefined()
                        if (r8 != 0) goto L12
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly$DecorationClassVisitor r8 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly$DecorationClassVisitor
                        r0 = r8
                        r1 = r6
                        r2 = r7
                        r3 = r9
                        r4 = r10
                        r5 = r11
                        r0.<init>(r1, r2, r3, r4, r5)
                        return r8
                    L12:
                        java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
                        java.lang.String r8 = "Cannot apply a type initializer for a decoration"
                        r7.<init>(r8)
                        throw r7
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class WithFullProcessing<V> extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining<V> {
                private static final java.lang.Object[] EMPTY = null;
                private final net.bytebuddy.implementation.Implementation.Target.Factory implementationTargetFactory;
                private final net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver methodRebaseResolver;
                private final net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared methodRegistry;

                public interface InitializationHandler {

                    public static abstract class Appending extends net.bytebuddy.jar.asm.MethodVisitor implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler, net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain {
                        protected final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory annotationValueFilterFactory;
                        protected final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter frameWriter;
                        protected final net.bytebuddy.description.type.TypeDescription instrumentedType;
                        protected int localVariableLength;
                        protected final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record record;
                        protected int stackSize;

                        public interface FrameWriter {
                            public static final java.lang.Object[] EMPTY = null;

                            public static class Active implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter {
                                private int currentLocalVariableLength;

                                public Active() {
                                        r0 = this;
                                        r0.<init>()
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void emitFrame(net.bytebuddy.jar.asm.MethodVisitor r10) {
                                        r9 = this;
                                        int r2 = r9.currentLocalVariableLength
                                        if (r2 != 0) goto Lf
                                        java.lang.Object[] r8 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.EMPTY
                                        int r5 = r8.length
                                        int r7 = r8.length
                                        r4 = 3
                                        r3 = r10
                                        r6 = r8
                                        r3.visitFrame(r4, r5, r6, r7, r8)
                                        goto L26
                                    Lf:
                                        r0 = 3
                                        if (r2 <= r0) goto L1d
                                        java.lang.Object[] r8 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.EMPTY
                                        int r5 = r8.length
                                        int r7 = r8.length
                                        r4 = 0
                                        r3 = r10
                                        r6 = r8
                                        r3.visitFrame(r4, r5, r6, r7, r8)
                                        goto L26
                                    L1d:
                                        java.lang.Object[] r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.EMPTY
                                        int r4 = r5.length
                                        r1 = 2
                                        r0 = r10
                                        r3 = r5
                                        r0.visitFrame(r1, r2, r3, r4, r5)
                                    L26:
                                        r0 = 0
                                        r10.visitInsn(r0)
                                        r9.currentLocalVariableLength = r0
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void onFrame(int r3, int r4) {
                                        r2 = this;
                                        r0 = -1
                                        if (r3 == r0) goto L35
                                        if (r3 == 0) goto L35
                                        r0 = 1
                                        if (r3 == r0) goto L2f
                                        r0 = 2
                                        if (r3 == r0) goto L29
                                        r4 = 3
                                        if (r3 == r4) goto L37
                                        r4 = 4
                                        if (r3 != r4) goto L12
                                        goto L37
                                    L12:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Unexpected frame type: "
                                        r0.append(r1)
                                        r0.append(r3)
                                        java.lang.String r3 = r0.toString()
                                        r4.<init>(r3)
                                        throw r4
                                    L29:
                                        int r3 = r2.currentLocalVariableLength
                                        int r3 = r3 - r4
                                        r2.currentLocalVariableLength = r3
                                        goto L37
                                    L2f:
                                        int r3 = r2.currentLocalVariableLength
                                        int r3 = r3 + r4
                                        r2.currentLocalVariableLength = r3
                                        goto L37
                                    L35:
                                        r2.currentLocalVariableLength = r4
                                    L37:
                                        return
                                }
                            }

                            public enum Expanding extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding> implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter {
                                private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding[] $VALUES = null;
                                public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding INSTANCE = null;

                                static {
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Expanding r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Expanding
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding.INSTANCE = r0
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Expanding[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding[]{r0}
                                        net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding.$VALUES = r0
                                        return
                                }

                                Expanding(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Expanding> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Expanding r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding) r1
                                        return r1
                                }

                                public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding[] values() {
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Expanding[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Expanding[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void emitFrame(net.bytebuddy.jar.asm.MethodVisitor r7) {
                                        r6 = this;
                                        java.lang.Object[] r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.EMPTY
                                        int r2 = r5.length
                                        int r4 = r5.length
                                        r1 = -1
                                        r0 = r7
                                        r3 = r5
                                        r0.visitFrame(r1, r2, r3, r4, r5)
                                        r0 = 0
                                        r7.visitInsn(r0)
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void onFrame(int r1, int r2) {
                                        r0 = this;
                                        return
                                }
                            }

                            public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp> implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter {
                                private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp[] $VALUES = null;
                                public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp INSTANCE = null;

                                static {
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$NoOp r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$NoOp
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp.INSTANCE = r0
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$NoOp[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp[]{r0}
                                        net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp.$VALUES = r0
                                        return
                                }

                                NoOp(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$NoOp> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$NoOp r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp) r1
                                        return r1
                                }

                                public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp[] values() {
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$NoOp[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$NoOp[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void emitFrame(net.bytebuddy.jar.asm.MethodVisitor r1) {
                                        r0 = this;
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public void onFrame(int r1, int r2) {
                                        r0 = this;
                                        return
                                }
                            }

                            static {
                                    r0 = 0
                                    java.lang.Object[] r0 = new java.lang.Object[r0]
                                    net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.EMPTY = r0
                                    return
                            }

                            void emitFrame(net.bytebuddy.jar.asm.MethodVisitor r1);

                            void onFrame(int r1, int r2);
                        }

                        public static abstract class WithDrain extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending {
                            protected final net.bytebuddy.jar.asm.Label appended;
                            protected final net.bytebuddy.jar.asm.Label original;

                            public static class WithActiveRecord extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithDrain {
                                private final net.bytebuddy.jar.asm.Label label;

                                public WithActiveRecord(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4, boolean r5, boolean r6) {
                                        r0 = this;
                                        r0.<init>(r1, r2, r3, r4, r5, r6)
                                        net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                                        r1.<init>()
                                        r0.label = r1
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithDrain
                                public void onAfterComplete(net.bytebuddy.implementation.Implementation.Context r3) {
                                        r2 = this;
                                        net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
                                        net.bytebuddy.jar.asm.Label r1 = r2.label
                                        r0.visitLabel(r1)
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter r0 = r2.frameWriter
                                        net.bytebuddy.jar.asm.MethodVisitor r1 = r2.mv
                                        r0.emitFrame(r1)
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r2.record
                                        net.bytebuddy.jar.asm.MethodVisitor r1 = r2.mv
                                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r3 = r0.applyCode(r1, r3)
                                        int r0 = r2.stackSize
                                        int r1 = r3.getOperandStackSize()
                                        int r0 = java.lang.Math.max(r0, r1)
                                        r2.stackSize = r0
                                        int r0 = r2.localVariableLength
                                        int r3 = r3.getLocalVariableSize()
                                        int r3 = java.lang.Math.max(r0, r3)
                                        r2.localVariableLength = r3
                                        return
                                }

                                @Override // net.bytebuddy.jar.asm.MethodVisitor
                                public void visitInsn(int r3) {
                                        r2 = this;
                                        r0 = 177(0xb1, float:2.48E-43)
                                        if (r3 != r0) goto Le
                                        net.bytebuddy.jar.asm.MethodVisitor r3 = r2.mv
                                        r0 = 167(0xa7, float:2.34E-43)
                                        net.bytebuddy.jar.asm.Label r1 = r2.label
                                        r3.visitJumpInsn(r0, r1)
                                        goto L11
                                    Le:
                                        super.visitInsn(r3)
                                    L11:
                                        return
                                }
                            }

                            public static class WithoutActiveRecord extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithDrain {
                                public WithoutActiveRecord(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4, boolean r5, boolean r6) {
                                        r0 = this;
                                        r0.<init>(r1, r2, r3, r4, r5, r6)
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithDrain
                                public void onAfterComplete(net.bytebuddy.implementation.Implementation.Context r1) {
                                        r0 = this;
                                        return
                                }
                            }

                            public WithDrain(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4, boolean r5, boolean r6) {
                                    r0 = this;
                                    r0.<init>(r1, r2, r3, r4, r5, r6)
                                    net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                                    r1.<init>()
                                    r0.appended = r1
                                    net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                                    r1.<init>()
                                    r0.original = r1
                                    return
                            }

                            public abstract void onAfterComplete(net.bytebuddy.implementation.Implementation.Context r1);

                            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            public void onComplete(net.bytebuddy.implementation.Implementation.Context r4) {
                                    r3 = this;
                                    net.bytebuddy.jar.asm.MethodVisitor r0 = r3.mv
                                    r1 = 167(0xa7, float:2.34E-43)
                                    net.bytebuddy.jar.asm.Label r2 = r3.original
                                    r0.visitJumpInsn(r1, r2)
                                    r3.onAfterComplete(r4)
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            public void onStart() {
                                    r3 = this;
                                    net.bytebuddy.jar.asm.MethodVisitor r0 = r3.mv
                                    r1 = 167(0xa7, float:2.34E-43)
                                    net.bytebuddy.jar.asm.Label r2 = r3.appended
                                    r0.visitJumpInsn(r1, r2)
                                    net.bytebuddy.jar.asm.MethodVisitor r0 = r3.mv
                                    net.bytebuddy.jar.asm.Label r1 = r3.original
                                    r0.visitLabel(r1)
                                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter r0 = r3.frameWriter
                                    net.bytebuddy.jar.asm.MethodVisitor r1 = r3.mv
                                    r0.emitFrame(r1)
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending, net.bytebuddy.jar.asm.MethodVisitor
                            public void visitEnd() {
                                    r2 = this;
                                    net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
                                    net.bytebuddy.jar.asm.Label r1 = r2.appended
                                    r0.visitLabel(r1)
                                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter r0 = r2.frameWriter
                                    net.bytebuddy.jar.asm.MethodVisitor r1 = r2.mv
                                    r0.emitFrame(r1)
                                    return
                            }
                        }

                        public static abstract class WithoutDrain extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending {

                            public static class WithActiveRecord extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithoutDrain {
                                private final net.bytebuddy.jar.asm.Label label;

                                public WithActiveRecord(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4, boolean r5, boolean r6) {
                                        r0 = this;
                                        r0.<init>(r1, r2, r3, r4, r5, r6)
                                        net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                                        r1.<init>()
                                        r0.label = r1
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                                public void onComplete(net.bytebuddy.implementation.Implementation.Context r3) {
                                        r2 = this;
                                        net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
                                        net.bytebuddy.jar.asm.Label r1 = r2.label
                                        r0.visitLabel(r1)
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter r0 = r2.frameWriter
                                        net.bytebuddy.jar.asm.MethodVisitor r1 = r2.mv
                                        r0.emitFrame(r1)
                                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r2.record
                                        net.bytebuddy.jar.asm.MethodVisitor r1 = r2.mv
                                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r3 = r0.applyCode(r1, r3)
                                        int r0 = r2.stackSize
                                        int r1 = r3.getOperandStackSize()
                                        int r0 = java.lang.Math.max(r0, r1)
                                        r2.stackSize = r0
                                        int r0 = r2.localVariableLength
                                        int r3 = r3.getLocalVariableSize()
                                        int r3 = java.lang.Math.max(r0, r3)
                                        r2.localVariableLength = r3
                                        return
                                }

                                @Override // net.bytebuddy.jar.asm.MethodVisitor
                                public void visitInsn(int r3) {
                                        r2 = this;
                                        r0 = 177(0xb1, float:2.48E-43)
                                        if (r3 != r0) goto Le
                                        net.bytebuddy.jar.asm.MethodVisitor r3 = r2.mv
                                        r0 = 167(0xa7, float:2.34E-43)
                                        net.bytebuddy.jar.asm.Label r1 = r2.label
                                        r3.visitJumpInsn(r0, r1)
                                        goto L11
                                    Le:
                                        super.visitInsn(r3)
                                    L11:
                                        return
                                }
                            }

                            public static class WithoutActiveRecord extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithoutDrain {
                                public WithoutActiveRecord(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r10, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r11) {
                                        r7 = this;
                                        r5 = 0
                                        r6 = 0
                                        r0 = r7
                                        r1 = r8
                                        r2 = r9
                                        r3 = r10
                                        r4 = r11
                                        r0.<init>(r1, r2, r3, r4, r5, r6)
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                                public void onComplete(net.bytebuddy.implementation.Implementation.Context r1) {
                                        r0 = this;
                                        return
                                }
                            }

                            public WithoutDrain(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4, boolean r5, boolean r6) {
                                    r0 = this;
                                    r0.<init>(r1, r2, r3, r4, r5, r6)
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            public void onStart() {
                                    r0 = this;
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending, net.bytebuddy.jar.asm.MethodVisitor
                            public void visitEnd() {
                                    r0 = this;
                                    return
                            }
                        }

                        public Appending(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r5, boolean r6, boolean r7) {
                                r1 = this;
                                int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                                r1.<init>(r0, r2)
                                r1.instrumentedType = r3
                                r1.record = r4
                                r1.annotationValueFilterFactory = r5
                                if (r6 != 0) goto L12
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$NoOp r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.NoOp.INSTANCE
                                r1.frameWriter = r2
                                goto L20
                            L12:
                                if (r7 == 0) goto L19
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Expanding r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter.Expanding.INSTANCE
                                r1.frameWriter = r2
                                goto L20
                            L19:
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Active r2 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter$Active
                                r2.<init>()
                                r1.frameWriter = r2
                            L20:
                                return
                        }

                        public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler of(boolean r0, net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4, boolean r5, boolean r6) {
                                if (r0 == 0) goto L7
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithDrain r0 = withDrain(r1, r2, r3, r4, r5, r6)
                                goto Lb
                            L7:
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithoutDrain r0 = withoutDrain(r1, r2, r3, r4, r5, r6)
                            Lb:
                                return r0
                        }

                        private static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithDrain withDrain(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool r10, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r11, boolean r12, boolean r13) {
                                net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer r0 = new net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer
                                r0.<init>(r9)
                                net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r4 = r10.target(r0)
                                net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r10 = r4.getSort()
                                boolean r10 = r10.isImplemented()
                                if (r10 == 0) goto L1f
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithDrain$WithActiveRecord r10 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithDrain$WithActiveRecord
                                r1 = r10
                                r2 = r8
                                r3 = r9
                                r5 = r11
                                r6 = r12
                                r7 = r13
                                r1.<init>(r2, r3, r4, r5, r6, r7)
                                goto L2a
                            L1f:
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithDrain$WithoutActiveRecord r10 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithDrain$WithoutActiveRecord
                                r1 = r10
                                r2 = r8
                                r3 = r9
                                r5 = r11
                                r6 = r12
                                r7 = r13
                                r1.<init>(r2, r3, r4, r5, r6, r7)
                            L2a:
                                return r10
                        }

                        private static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.WithoutDrain withoutDrain(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool r10, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r11, boolean r12, boolean r13) {
                                net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer r0 = new net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer
                                r0.<init>(r9)
                                net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r4 = r10.target(r0)
                                net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r10 = r4.getSort()
                                boolean r10 = r10.isImplemented()
                                if (r10 == 0) goto L1f
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithoutDrain$WithActiveRecord r10 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithoutDrain$WithActiveRecord
                                r1 = r10
                                r2 = r8
                                r3 = r9
                                r5 = r11
                                r6 = r12
                                r7 = r13
                                r1.<init>(r2, r3, r4, r5, r6, r7)
                                goto L24
                            L1f:
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithoutDrain$WithoutActiveRecord r10 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$WithoutDrain$WithoutActiveRecord
                                r10.<init>(r8, r9, r4, r11)
                            L24:
                                return r10
                        }

                        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain
                        public void apply(net.bytebuddy.jar.asm.ClassVisitor r3, net.bytebuddy.dynamic.scaffold.TypeInitializer r4, net.bytebuddy.implementation.Implementation.Context r5) {
                                r2 = this;
                                net.bytebuddy.jar.asm.MethodVisitor r3 = r2.mv
                                net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer r0 = new net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer
                                net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                                r0.<init>(r1)
                                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r3 = r4.apply(r3, r5, r0)
                                int r4 = r2.stackSize
                                int r0 = r3.getOperandStackSize()
                                int r4 = java.lang.Math.max(r4, r0)
                                r2.stackSize = r4
                                int r4 = r2.localVariableLength
                                int r3 = r3.getLocalVariableSize()
                                int r3 = java.lang.Math.max(r4, r3)
                                r2.localVariableLength = r3
                                r2.onComplete(r5)
                                return
                        }

                        @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler
                        public void complete(net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context.ExtractableView r3) {
                                r1 = this;
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r0 = r1.annotationValueFilterFactory
                                r3.drain(r1, r2, r0)
                                net.bytebuddy.jar.asm.MethodVisitor r2 = r1.mv
                                int r3 = r1.stackSize
                                int r0 = r1.localVariableLength
                                r2.visitMaxs(r3, r0)
                                net.bytebuddy.jar.asm.MethodVisitor r2 = r1.mv
                                r2.visitEnd()
                                return
                        }

                        public abstract void onComplete(net.bytebuddy.implementation.Implementation.Context r1);

                        public abstract void onStart();

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitCode() {
                                r3 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r3.record
                                net.bytebuddy.jar.asm.MethodVisitor r1 = r3.mv
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r3.annotationValueFilterFactory
                                r0.applyAttributes(r1, r2)
                                super.visitCode()
                                r3.onStart()
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public abstract void visitEnd();

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitFrame(int r1, int r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r3, int r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r5) {
                                r0 = this;
                                super.visitFrame(r1, r2, r3, r4, r5)
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$FrameWriter r3 = r0.frameWriter
                                r3.onFrame(r1, r2)
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitMaxs(int r1, int r2) {
                                r0 = this;
                                r0.stackSize = r1
                                r0.localVariableLength = r2
                                return
                        }
                    }

                    public static class Creating extends net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain.Default implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler {
                        public Creating(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                                r0 = this;
                                r0.<init>(r1, r2, r3)
                                return
                        }

                        @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler
                        public void complete(net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context.ExtractableView r3) {
                                r1 = this;
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r0 = r1.annotationValueFilterFactory
                                r3.drain(r1, r2, r0)
                                return
                        }
                    }

                    void complete(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.implementation.Implementation.Context.ExtractableView r2);
                }

                public static class OpenedClassRemapper extends net.bytebuddy.jar.asm.commons.ClassRemapper {
                    public OpenedClassRemapper(net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
                            r1 = this;
                            int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                            r1.<init>(r0, r2, r3)
                            return
                    }
                }

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Field access order is implied by ASM.", value = {"UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR"})
                public class RedefinitionClassVisitor extends net.bytebuddy.utility.visitor.MetadataAwareClassVisitor {
                    private final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry contextRegistry;
                    private final java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.SignatureKey, net.bytebuddy.description.field.FieldDescription> declarableFields;
                    private final java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.SignatureKey, net.bytebuddy.description.method.MethodDescription> declarableMethods;
                    private final java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.RecordComponentDescription> declarableRecordComponents;
                    private final java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.TypeDescription> declaredTypes;

                    @net.bytebuddy.utility.nullability.UnknownNull
                    private net.bytebuddy.implementation.Implementation.Context.ExtractableView implementationContext;

                    @net.bytebuddy.utility.nullability.UnknownNull
                    private net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler initializationHandler;

                    @net.bytebuddy.utility.nullability.UnknownNull
                    private net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool methodPool;
                    private final java.util.Set<java.lang.String> nestMembers;

                    @net.bytebuddy.utility.nullability.MaybeNull
                    private final java.util.Set<java.lang.String> permittedSubclasses;
                    private final int readerFlags;
                    private boolean retainDeprecationModifiers;
                    final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing this$0;
                    private final net.bytebuddy.dynamic.scaffold.TypeInitializer typeInitializer;
                    private final int writerFlags;

                    public class AttributeObtainingFieldVisitor extends net.bytebuddy.jar.asm.FieldVisitor {
                        private final net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record record;
                        final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor this$1;

                        public AttributeObtainingFieldVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor r1, net.bytebuddy.jar.asm.FieldVisitor r2, net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record r3) {
                                r0 = this;
                                r0.this$1 = r1
                                int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                                r0.<init>(r1, r2)
                                r0.record = r3
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.FieldVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitAnnotation(r2, r3)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }

                        @Override // net.bytebuddy.jar.asm.FieldVisitor
                        public void visitEnd() {
                                r3 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record r0 = r3.record
                                net.bytebuddy.jar.asm.FieldVisitor r1 = r3.fv
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r2 = r3.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r2.this$0
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r2.annotationValueFilterFactory
                                r0.apply(r1, r2)
                                super.visitEnd()
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.FieldVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTypeAnnotation(r2, r3, r4, r5)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }
                    }

                    public class AttributeObtainingMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
                        private final net.bytebuddy.jar.asm.MethodVisitor actualMethodVisitor;
                        private final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record record;
                        final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor this$1;

                        public AttributeObtainingMethodVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor r1, net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r3) {
                                r0 = this;
                                r0.this$1 = r1
                                int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                                r0.<init>(r1, r2)
                                r0.actualMethodVisitor = r2
                                r0.record = r3
                                r3.applyHead(r2)
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitAnnotableParameterCount(int r2, boolean r3) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto Lf
                                super.visitAnnotableParameterCount(r2, r3)
                            Lf:
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitAnnotation(r2, r3)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotationDefault() {
                                r1 = this;
                                net.bytebuddy.jar.asm.AnnotationVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                                return r0
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitCode() {
                                r1 = this;
                                net.bytebuddy.jar.asm.MethodVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$700()
                                r1.mv = r0
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitEnd() {
                                r4 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r4.record
                                net.bytebuddy.jar.asm.MethodVisitor r1 = r4.actualMethodVisitor
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r2 = r4.this$1
                                net.bytebuddy.implementation.Implementation$Context$ExtractableView r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor.access$900(r2)
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r3 = r4.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r3 = r3.this$0
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r3.annotationValueFilterFactory
                                r0.applyBody(r1, r2, r3)
                                net.bytebuddy.jar.asm.MethodVisitor r0 = r4.actualMethodVisitor
                                r0.visitEnd()
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitParameterAnnotation(int r2, java.lang.String r3, boolean r4) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitParameterAnnotation(r2, r3, r4)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTypeAnnotation(r2, r3, r4, r5)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }
                    }

                    public class AttributeObtainingRecordComponentVisitor extends net.bytebuddy.jar.asm.RecordComponentVisitor {
                        private final net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record record;
                        final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor this$1;

                        public AttributeObtainingRecordComponentVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor r1, net.bytebuddy.jar.asm.RecordComponentVisitor r2, net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record r3) {
                                r0 = this;
                                r0.this$1 = r1
                                int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                                r0.<init>(r1, r2)
                                r0.record = r3
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitAnnotation(r2, r3)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }

                        @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
                        public void visitEnd() {
                                r3 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record r0 = r3.record
                                net.bytebuddy.jar.asm.RecordComponentVisitor r1 = r3.getDelegate()
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r2 = r3.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r2.this$0
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r2.annotationValueFilterFactory
                                r0.apply(r1, r2)
                                super.visitEnd()
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTypeAnnotation(r2, r3, r4, r5)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }
                    }

                    public class CodePreservingMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
                        private final net.bytebuddy.jar.asm.MethodVisitor actualMethodVisitor;
                        private final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record record;
                        private final net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution resolution;
                        final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor this$1;

                        public CodePreservingMethodVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor r1, net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r3, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution r4) {
                                r0 = this;
                                r0.this$1 = r1
                                int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                                r0.<init>(r1, r2)
                                r0.actualMethodVisitor = r2
                                r0.record = r3
                                r0.resolution = r4
                                r3.applyHead(r2)
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitAnnotableParameterCount(int r2, boolean r3) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto Lf
                                super.visitAnnotableParameterCount(r2, r3)
                            Lf:
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitAnnotation(r2, r3)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotationDefault() {
                                r1 = this;
                                net.bytebuddy.jar.asm.AnnotationVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                                return r0
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitCode() {
                                r9 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r9.record
                                net.bytebuddy.jar.asm.MethodVisitor r1 = r9.actualMethodVisitor
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r2 = r9.this$1
                                net.bytebuddy.implementation.Implementation$Context$ExtractableView r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor.access$900(r2)
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r3 = r9.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r3 = r3.this$0
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r3.annotationValueFilterFactory
                                r0.applyBody(r1, r2, r3)
                                net.bytebuddy.jar.asm.MethodVisitor r0 = r9.actualMethodVisitor
                                r0.visitEnd()
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                boolean r0 = r0.isRebased()
                                if (r0 == 0) goto L17a
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r9.this$1
                                net.bytebuddy.jar.asm.ClassVisitor r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor.access$1000(r0)
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getResolvedMethod()
                                int r2 = r0.getActualModifiers()
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getResolvedMethod()
                                java.lang.String r3 = r0.getInternalName()
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getResolvedMethod()
                                java.lang.String r4 = r0.getDescriptor()
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getResolvedMethod()
                                java.lang.String r5 = r0.getGenericSignature()
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getResolvedMethod()
                                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                                net.bytebuddy.description.type.TypeList r0 = r0.asErasures()
                                java.lang.String[] r6 = r0.toInternalNames()
                                net.bytebuddy.jar.asm.MethodVisitor r0 = r1.visitMethod(r2, r3, r4, r5, r6)
                                r9.mv = r0
                                super.visitCode()
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.type.TypeList r0 = r0.getAppendedParameters()
                                boolean r0 = r0.isEmpty()
                                if (r0 != 0) goto L183
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r9.this$1
                                net.bytebuddy.implementation.Implementation$Context$ExtractableView r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor.access$900(r0)
                                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r0.getFrameGeneration()
                                boolean r0 = r0.isActive()
                                if (r0 == 0) goto L183
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r9.this$1
                                net.bytebuddy.implementation.Implementation$Context$ExtractableView r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor.access$900(r0)
                                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r0.getFrameGeneration()
                                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE
                                r2 = 0
                                if (r0 != r1) goto Lbf
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.type.TypeList r0 = r0.getAppendedParameters()
                                int r0 = r0.size()
                                r1 = 4
                                if (r0 >= r1) goto Lbf
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.type.TypeList r0 = r0.getAppendedParameters()
                                int r5 = r0.size()
                                java.lang.Object[] r6 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$1100()
                                java.lang.Object[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$1100()
                                int r7 = r0.length
                                java.lang.Object[] r8 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$1100()
                                r4 = 2
                                r3 = r9
                                super.visitFrame(r4, r5, r6, r7, r8)
                                goto L176
                            Lbf:
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getResolvedMethod()
                                net.bytebuddy.description.method.ParameterList r0 = r0.getParameters()
                                int r0 = r0.size()
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r1 = r9.resolution
                                net.bytebuddy.description.type.TypeList r1 = r1.getAppendedParameters()
                                int r1 = r1.size()
                                int r0 = r0 - r1
                                r1 = 1
                                int r5 = r0 + 1
                                java.lang.Object[] r6 = new java.lang.Object[r5]
                                java.lang.Integer r0 = net.bytebuddy.jar.asm.Opcodes.UNINITIALIZED_THIS
                                r6[r2] = r0
                            Le1:
                                if (r1 >= r5) goto L15b
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r9.resolution
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getResolvedMethod()
                                net.bytebuddy.description.method.ParameterList r0 = r0.getParameters()
                                int r3 = r1 + (-1)
                                java.lang.Object r0 = r0.get(r3)
                                net.bytebuddy.description.method.ParameterDescription$InDefinedShape r0 = (net.bytebuddy.description.method.ParameterDescription.InDefinedShape) r0
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                                java.lang.Class r3 = java.lang.Boolean.TYPE
                                boolean r3 = r0.represents(r3)
                                if (r3 != 0) goto L154
                                java.lang.Class r3 = java.lang.Byte.TYPE
                                boolean r3 = r0.represents(r3)
                                if (r3 != 0) goto L154
                                java.lang.Class r3 = java.lang.Short.TYPE
                                boolean r3 = r0.represents(r3)
                                if (r3 != 0) goto L154
                                java.lang.Class r3 = java.lang.Character.TYPE
                                boolean r3 = r0.represents(r3)
                                if (r3 != 0) goto L154
                                java.lang.Class r3 = java.lang.Integer.TYPE
                                boolean r3 = r0.represents(r3)
                                if (r3 == 0) goto L122
                                goto L154
                            L122:
                                java.lang.Class r3 = java.lang.Long.TYPE
                                boolean r3 = r0.represents(r3)
                                if (r3 == 0) goto L12f
                                java.lang.Integer r0 = net.bytebuddy.jar.asm.Opcodes.LONG
                                r6[r1] = r0
                                goto L158
                            L12f:
                                java.lang.Class r3 = java.lang.Float.TYPE
                                boolean r3 = r0.represents(r3)
                                if (r3 == 0) goto L13c
                                java.lang.Integer r0 = net.bytebuddy.jar.asm.Opcodes.FLOAT
                                r6[r1] = r0
                                goto L158
                            L13c:
                                java.lang.Class r3 = java.lang.Double.TYPE
                                boolean r3 = r0.represents(r3)
                                if (r3 == 0) goto L149
                                java.lang.Integer r0 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
                                r6[r1] = r0
                                goto L158
                            L149:
                                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                java.lang.String r0 = r0.getInternalName()
                                r6[r1] = r0
                                goto L158
                            L154:
                                java.lang.Integer r0 = net.bytebuddy.jar.asm.Opcodes.INTEGER
                                r6[r1] = r0
                            L158:
                                int r1 = r1 + 1
                                goto Le1
                            L15b:
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r9.this$1
                                int r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor.access$1200(r0)
                                r0 = r0 & 8
                                if (r0 != 0) goto L167
                                r4 = r2
                                goto L169
                            L167:
                                r0 = -1
                                r4 = r0
                            L169:
                                java.lang.Object[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$1100()
                                int r7 = r0.length
                                java.lang.Object[] r8 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$1100()
                                r3 = r9
                                super.visitFrame(r4, r5, r6, r7, r8)
                            L176:
                                super.visitInsn(r2)
                                goto L183
                            L17a:
                                net.bytebuddy.jar.asm.MethodVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$700()
                                r9.mv = r0
                                super.visitCode()
                            L183:
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        public void visitMaxs(int r2, int r3) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = r1.resolution
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getResolvedMethod()
                                int r0 = r0.getStackSize()
                                int r3 = java.lang.Math.max(r3, r0)
                                super.visitMaxs(r2, r3)
                                return
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitParameterAnnotation(int r2, java.lang.String r3, boolean r4) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitParameterAnnotation(r2, r3, r4)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }

                        @Override // net.bytebuddy.jar.asm.MethodVisitor
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r0 = r1.this$1
                                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r0.this$0
                                net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                                boolean r0 = r0.isEnabled()
                                if (r0 == 0) goto L11
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTypeAnnotation(r2, r3, r4, r5)
                                goto L15
                            L11:
                                net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                            L15:
                                return r2
                        }
                    }

                    public RedefinitionClassVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing r4, net.bytebuddy.jar.asm.ClassVisitor r5, net.bytebuddy.dynamic.scaffold.TypeInitializer r6, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry r7, int r8, int r9) {
                            r3 = this;
                            r3.this$0 = r4
                            int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                            r3.<init>(r0, r5)
                            r3.typeInitializer = r6
                            r3.contextRegistry = r7
                            r3.writerFlags = r8
                            r3.readerFlags = r9
                            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                            net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r6 = r4.fields
                            int r6 = r6.size()
                            double r6 = (double) r6
                            r8 = 4604930618986332160(0x3fe8000000000000, double:0.75)
                            double r6 = r6 / r8
                            double r6 = java.lang.Math.ceil(r6)
                            int r6 = (int) r6
                            r5.<init>(r6)
                            r3.declarableFields = r5
                            net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r4.fields
                            java.util.Iterator r5 = r5.iterator()
                        L2b:
                            boolean r6 = r5.hasNext()
                            if (r6 == 0) goto L4a
                            java.lang.Object r6 = r5.next()
                            net.bytebuddy.description.field.FieldDescription r6 = (net.bytebuddy.description.field.FieldDescription) r6
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey, net.bytebuddy.description.field.FieldDescription> r7 = r3.declarableFields
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey
                            java.lang.String r1 = r6.getInternalName()
                            java.lang.String r2 = r6.getDescriptor()
                            r0.<init>(r1, r2)
                            r7.put(r0, r6)
                            goto L2b
                        L4a:
                            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                            net.bytebuddy.description.method.MethodList<?> r6 = r4.instrumentedMethods
                            int r6 = r6.size()
                            double r6 = (double) r6
                            double r6 = r6 / r8
                            double r6 = java.lang.Math.ceil(r6)
                            int r6 = (int) r6
                            r5.<init>(r6)
                            r3.declarableMethods = r5
                            net.bytebuddy.description.method.MethodList<?> r5 = r4.instrumentedMethods
                            java.util.Iterator r5 = r5.iterator()
                        L64:
                            boolean r6 = r5.hasNext()
                            if (r6 == 0) goto L83
                            java.lang.Object r6 = r5.next()
                            net.bytebuddy.description.method.MethodDescription r6 = (net.bytebuddy.description.method.MethodDescription) r6
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey, net.bytebuddy.description.method.MethodDescription> r7 = r3.declarableMethods
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey
                            java.lang.String r1 = r6.getInternalName()
                            java.lang.String r2 = r6.getDescriptor()
                            r0.<init>(r1, r2)
                            r7.put(r0, r6)
                            goto L64
                        L83:
                            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                            net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape> r6 = r4.recordComponents
                            int r6 = r6.size()
                            double r6 = (double) r6
                            double r6 = r6 / r8
                            double r6 = java.lang.Math.ceil(r6)
                            int r6 = (int) r6
                            r5.<init>(r6)
                            r3.declarableRecordComponents = r5
                            net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape> r5 = r4.recordComponents
                            java.util.Iterator r5 = r5.iterator()
                        L9d:
                            boolean r6 = r5.hasNext()
                            if (r6 == 0) goto Lb3
                            java.lang.Object r6 = r5.next()
                            net.bytebuddy.description.type.RecordComponentDescription r6 = (net.bytebuddy.description.type.RecordComponentDescription) r6
                            java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.RecordComponentDescription> r7 = r3.declarableRecordComponents
                            java.lang.String r0 = r6.getActualName()
                            r7.put(r0, r6)
                            goto L9d
                        Lb3:
                            net.bytebuddy.description.type.TypeDescription r5 = r4.instrumentedType
                            boolean r5 = r5.isNestHost()
                            if (r5 == 0) goto L103
                            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
                            net.bytebuddy.description.type.TypeDescription r6 = r4.instrumentedType
                            net.bytebuddy.description.type.TypeList r6 = r6.getNestMembers()
                            int r6 = r6.size()
                            double r6 = (double) r6
                            double r6 = r6 / r8
                            double r6 = java.lang.Math.ceil(r6)
                            int r6 = (int) r6
                            r5.<init>(r6)
                            r3.nestMembers = r5
                            net.bytebuddy.description.type.TypeDescription r5 = r4.instrumentedType
                            net.bytebuddy.description.type.TypeList r5 = r5.getNestMembers()
                            net.bytebuddy.description.type.TypeDescription r6 = r4.instrumentedType
                            net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.is(r6)
                            net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.not(r6)
                            net.bytebuddy.matcher.FilterableList r5 = r5.filter(r6)
                            net.bytebuddy.description.type.TypeList r5 = (net.bytebuddy.description.type.TypeList) r5
                            java.util.Iterator r5 = r5.iterator()
                        Led:
                            boolean r6 = r5.hasNext()
                            if (r6 == 0) goto L109
                            java.lang.Object r6 = r5.next()
                            net.bytebuddy.description.type.TypeDescription r6 = (net.bytebuddy.description.type.TypeDescription) r6
                            java.util.Set<java.lang.String> r7 = r3.nestMembers
                            java.lang.String r6 = r6.getInternalName()
                            r7.add(r6)
                            goto Led
                        L103:
                            java.util.Set r5 = java.util.Collections.emptySet()
                            r3.nestMembers = r5
                        L109:
                            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                            net.bytebuddy.description.type.TypeDescription r6 = r4.instrumentedType
                            net.bytebuddy.description.type.TypeList r6 = r6.getDeclaredTypes()
                            int r6 = r6.size()
                            double r6 = (double) r6
                            double r6 = r6 / r8
                            double r6 = java.lang.Math.ceil(r6)
                            int r6 = (int) r6
                            r5.<init>(r6)
                            r3.declaredTypes = r5
                            net.bytebuddy.description.type.TypeDescription r5 = r4.instrumentedType
                            net.bytebuddy.description.type.TypeList r5 = r5.getDeclaredTypes()
                            java.util.Iterator r5 = r5.iterator()
                        L12b:
                            boolean r6 = r5.hasNext()
                            if (r6 == 0) goto L141
                            java.lang.Object r6 = r5.next()
                            net.bytebuddy.description.type.TypeDescription r6 = (net.bytebuddy.description.type.TypeDescription) r6
                            java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.TypeDescription> r7 = r3.declaredTypes
                            java.lang.String r0 = r6.getInternalName()
                            r7.put(r0, r6)
                            goto L12b
                        L141:
                            net.bytebuddy.description.type.TypeDescription r5 = r4.instrumentedType
                            boolean r5 = r5.isSealed()
                            if (r5 == 0) goto L181
                            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
                            net.bytebuddy.description.type.TypeDescription r6 = r4.instrumentedType
                            net.bytebuddy.description.type.TypeList r6 = r6.getPermittedSubtypes()
                            int r6 = r6.size()
                            double r6 = (double) r6
                            double r6 = r6 / r8
                            double r6 = java.lang.Math.ceil(r6)
                            int r6 = (int) r6
                            r5.<init>(r6)
                            r3.permittedSubclasses = r5
                            net.bytebuddy.description.type.TypeDescription r4 = r4.instrumentedType
                            net.bytebuddy.description.type.TypeList r4 = r4.getPermittedSubtypes()
                            java.util.Iterator r4 = r4.iterator()
                        L16b:
                            boolean r5 = r4.hasNext()
                            if (r5 == 0) goto L184
                            java.lang.Object r5 = r4.next()
                            net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                            java.util.Set<java.lang.String> r6 = r3.permittedSubclasses
                            java.lang.String r5 = r5.getInternalName()
                            r6.add(r5)
                            goto L16b
                        L181:
                            r4 = 0
                            r3.permittedSubclasses = r4
                        L184:
                            return
                    }

                    public static /* synthetic */ net.bytebuddy.jar.asm.ClassVisitor access$1000(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor r0) {
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r0.cv
                            return r0
                    }

                    public static /* synthetic */ int access$1200(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor r0) {
                            int r0 = r0.readerFlags
                            return r0
                    }

                    public static /* synthetic */ net.bytebuddy.implementation.Implementation.Context.ExtractableView access$900(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.RedefinitionClassVisitor r0) {
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r0 = r0.implementationContext
                            return r0
                    }

                    private int resolveDeprecationModifiers(int r2) {
                            r1 = this;
                            boolean r0 = r1.retainDeprecationModifiers
                            if (r0 == 0) goto La
                            r0 = 131072(0x20000, float:1.83671E-40)
                            r2 = r2 & r0
                            if (r2 == 0) goto La
                            goto Lb
                        La:
                            r0 = 0
                        Lb:
                            return r0
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onAfterAttributes() {
                            r4 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r4.this$0
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r1 = r0.typeAttributeAppender
                            net.bytebuddy.jar.asm.ClassVisitor r2 = r4.cv
                            net.bytebuddy.description.type.TypeDescription r3 = r0.instrumentedType
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r0 = r0.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter r0 = r0.on(r3)
                            r1.apply(r2, r3, r0)
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onNestHost() {
                            r2 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r2.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            boolean r0 = r0.isNestHost()
                            if (r0 != 0) goto L1b
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r2.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            net.bytebuddy.description.type.TypeDescription r1 = r1.getNestHost()
                            java.lang.String r1 = r1.getInternalName()
                            r0.visitNestHost(r1)
                        L1b:
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Relying on correlated type properties.", value = {"NP_NULL_ON_SOME_PATH"})
                    public void onOuterType() {
                            r4 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r4.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getEnclosingMethod()
                            if (r0 == 0) goto L20
                            net.bytebuddy.jar.asm.ClassVisitor r1 = r4.cv
                            net.bytebuddy.description.type.TypeDescription r2 = r0.getDeclaringType()
                            java.lang.String r2 = r2.getInternalName()
                            java.lang.String r3 = r0.getInternalName()
                            java.lang.String r0 = r0.getDescriptor()
                            r1.visitOuterClass(r2, r3, r0)
                            goto L4d
                        L20:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r4.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            boolean r0 = r0.isLocalType()
                            if (r0 != 0) goto L34
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r4.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            boolean r0 = r0.isAnonymousType()
                            if (r0 == 0) goto L4d
                        L34:
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r4.cv
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r4.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            net.bytebuddy.description.type.TypeDescription r1 = r1.getEnclosingType()
                            java.lang.String r1 = r1.getInternalName()
                            java.lang.String r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            java.lang.String r3 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            r0.visitOuterClass(r1, r2, r3)
                        L4d:
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.AnnotationVisitor onVisitAnnotation(java.lang.String r2, boolean r3) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r1.this$0
                            net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                            boolean r0 = r0.isEnabled()
                            if (r0 == 0) goto L11
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
                            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
                            goto L15
                        L11:
                            net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                        L15:
                            return r2
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onVisitEnd() {
                            r6 = this;
                            java.util.Set<java.lang.String> r0 = r6.nestMembers
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L18
                            java.lang.Object r1 = r0.next()
                            java.lang.String r1 = (java.lang.String) r1
                            net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                            r2.visitNestMember(r1)
                            goto L6
                        L18:
                            java.util.Set<java.lang.String> r0 = r6.permittedSubclasses
                            if (r0 == 0) goto L32
                            java.util.Iterator r0 = r0.iterator()
                        L20:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L32
                            java.lang.Object r1 = r0.next()
                            java.lang.String r1 = (java.lang.String) r1
                            net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                            r2.visitPermittedSubclass(r1)
                            goto L20
                        L32:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                            if (r0 == 0) goto L5e
                            net.bytebuddy.jar.asm.ClassVisitor r1 = r6.cv
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r2 = r2.instrumentedType
                            java.lang.String r2 = r2.getInternalName()
                            java.lang.String r0 = r0.getInternalName()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r3 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r3 = r3.instrumentedType
                            java.lang.String r3 = r3.getSimpleName()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r4 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r4 = r4.instrumentedType
                            int r4 = r4.getModifiers()
                            r1.visitInnerClass(r2, r0, r3, r4)
                            goto Lb1
                        L5e:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            boolean r0 = r0.isLocalType()
                            if (r0 == 0) goto L8a
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r6.cv
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            java.lang.String r1 = r1.getInternalName()
                            java.lang.String r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r3 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r3 = r3.instrumentedType
                            java.lang.String r3 = r3.getSimpleName()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r4 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r4 = r4.instrumentedType
                            int r4 = r4.getModifiers()
                            r0.visitInnerClass(r1, r2, r3, r4)
                            goto Lb1
                        L8a:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            boolean r0 = r0.isAnonymousType()
                            if (r0 == 0) goto Lb1
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r6.cv
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            java.lang.String r1 = r1.getInternalName()
                            java.lang.String r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            java.lang.String r3 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r4 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r4 = r4.instrumentedType
                            int r4 = r4.getModifiers()
                            r0.visitInnerClass(r1, r2, r3, r4)
                        Lb1:
                            java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.TypeDescription> r0 = r6.declaredTypes
                            java.util.Collection r0 = r0.values()
                            java.util.Iterator r0 = r0.iterator()
                        Lbb:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto Lf7
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                            net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                            java.lang.String r3 = r1.getInternalName()
                            boolean r4 = r1.isMemberType()
                            if (r4 == 0) goto Ldc
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r4 = r6.this$0
                            net.bytebuddy.description.type.TypeDescription r4 = r4.instrumentedType
                            java.lang.String r4 = r4.getInternalName()
                            goto Le0
                        Ldc:
                            java.lang.String r4 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                        Le0:
                            boolean r5 = r1.isAnonymousType()
                            if (r5 == 0) goto Leb
                            java.lang.String r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            goto Lef
                        Leb:
                            java.lang.String r5 = r1.getSimpleName()
                        Lef:
                            int r1 = r1.getModifiers()
                            r2.visitInnerClass(r3, r4, r5, r1)
                            goto Lbb
                        Lf7:
                            java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.RecordComponentDescription> r0 = r6.declarableRecordComponents
                            java.util.Collection r0 = r0.values()
                            java.util.Iterator r0 = r0.iterator()
                        L101:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L11f
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.description.type.RecordComponentDescription r1 = (net.bytebuddy.description.type.RecordComponentDescription) r1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r6.this$0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool r2 = r2.recordComponentPool
                            net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record r1 = r2.target(r1)
                            net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r3 = r6.this$0
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r3.annotationValueFilterFactory
                            r1.apply(r2, r3)
                            goto L101
                        L11f:
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey, net.bytebuddy.description.field.FieldDescription> r0 = r6.declarableFields
                            java.util.Collection r0 = r0.values()
                            java.util.Iterator r0 = r0.iterator()
                        L129:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L147
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.description.field.FieldDescription r1 = (net.bytebuddy.description.field.FieldDescription) r1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r6.this$0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool r2 = r2.fieldPool
                            net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record r1 = r2.target(r1)
                            net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r3 = r6.this$0
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r3.annotationValueFilterFactory
                            r1.apply(r2, r3)
                            goto L129
                        L147:
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey, net.bytebuddy.description.method.MethodDescription> r0 = r6.declarableMethods
                            java.util.Collection r0 = r0.values()
                            java.util.Iterator r0 = r0.iterator()
                        L151:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16f
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r2 = r6.methodPool
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r1 = r2.target(r1)
                            net.bytebuddy.jar.asm.ClassVisitor r2 = r6.cv
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r3 = r6.implementationContext
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r4 = r6.this$0
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r4.annotationValueFilterFactory
                            r1.apply(r2, r3, r4)
                            goto L151
                        L16f:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler r0 = r6.initializationHandler
                            net.bytebuddy.jar.asm.ClassVisitor r1 = r6.cv
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r2 = r6.implementationContext
                            r0.complete(r1, r2)
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r6.cv
                            r0.visitEnd()
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.FieldVisitor onVisitField(int r7, java.lang.String r8, java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r10, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r11) {
                            r6 = this;
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey, net.bytebuddy.description.field.FieldDescription> r0 = r6.declarableFields
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey
                            r1.<init>(r8, r9)
                            java.lang.Object r0 = r0.remove(r1)
                            net.bytebuddy.description.field.FieldDescription r0 = (net.bytebuddy.description.field.FieldDescription) r0
                            if (r0 == 0) goto L22
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r6.this$0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool r1 = r1.fieldPool
                            net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record r0 = r1.target(r0)
                            boolean r1 = r0.isImplicit()
                            if (r1 != 0) goto L22
                            net.bytebuddy.jar.asm.FieldVisitor r7 = r6.redefine(r0, r11, r7, r10)
                            return r7
                        L22:
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r6.cv
                            r1 = r7
                            r2 = r8
                            r3 = r9
                            r4 = r10
                            r5 = r11
                            net.bytebuddy.jar.asm.FieldVisitor r7 = r0.visitField(r1, r2, r3, r4, r5)
                            return r7
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onVisitInnerClass(java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, int r6) {
                            r2 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r2.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            java.lang.String r0 = r0.getInternalName()
                            boolean r0 = r3.equals(r0)
                            if (r0 != 0) goto L54
                            java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.TypeDescription> r0 = r2.declaredTypes
                            java.lang.Object r0 = r0.remove(r3)
                            net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                            if (r0 != 0) goto L1e
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
                            r0.visitInnerClass(r3, r4, r5, r6)
                            goto L54
                        L1e:
                            net.bytebuddy.jar.asm.ClassVisitor r6 = r2.cv
                            boolean r1 = r0.isMemberType()
                            if (r1 != 0) goto L36
                            if (r4 == 0) goto L31
                            if (r5 != 0) goto L31
                            boolean r4 = r0.isAnonymousType()
                            if (r4 == 0) goto L31
                            goto L36
                        L31:
                            java.lang.String r4 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            goto L3e
                        L36:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r4 = r2.this$0
                            net.bytebuddy.description.type.TypeDescription r4 = r4.instrumentedType
                            java.lang.String r4 = r4.getInternalName()
                        L3e:
                            boolean r5 = r0.isAnonymousType()
                            if (r5 == 0) goto L49
                            java.lang.String r5 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            goto L4d
                        L49:
                            java.lang.String r5 = r0.getSimpleName()
                        L4d:
                            int r0 = r0.getModifiers()
                            r6.visitInnerClass(r3, r4, r5, r0)
                        L54:
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.MethodVisitor onVisitMethod(int r17, java.lang.String r18, java.lang.String r19, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r20, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r21) {
                            r16 = this;
                            r0 = r16
                            r2 = r17
                            r3 = r18
                            java.lang.String r1 = "<clinit>"
                            boolean r1 = r3.equals(r1)
                            r7 = 0
                            r8 = 1
                            if (r1 == 0) goto L5e
                            net.bytebuddy.jar.asm.ClassVisitor r1 = r0.cv
                            r2 = r17
                            r3 = r18
                            r4 = r19
                            r5 = r20
                            r6 = r21
                            net.bytebuddy.jar.asm.MethodVisitor r10 = r1.visitMethod(r2, r3, r4, r5, r6)
                            if (r10 != 0) goto L27
                            net.bytebuddy.jar.asm.MethodVisitor r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$700()
                            goto L5d
                        L27:
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r1 = r0.implementationContext
                            boolean r9 = r1.isEnabled()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r11 = r1.instrumentedType
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r12 = r0.methodPool
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r13 = r1.annotationValueFilterFactory
                            int r1 = r0.writerFlags
                            r1 = r1 & 2
                            if (r1 != 0) goto L4b
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r1 = r0.implementationContext
                            net.bytebuddy.ClassFileVersion r1 = r1.getClassFileVersion()
                            net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V6
                            boolean r1 = r1.isAtLeast(r2)
                            if (r1 == 0) goto L4b
                            r14 = r8
                            goto L4c
                        L4b:
                            r14 = r7
                        L4c:
                            int r1 = r0.readerFlags
                            r1 = r1 & 8
                            if (r1 == 0) goto L54
                            r15 = r8
                            goto L55
                        L54:
                            r15 = r7
                        L55:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.of(r9, r10, r11, r12, r13, r14, r15)
                            r0.initializationHandler = r1
                            net.bytebuddy.jar.asm.MethodVisitor r1 = (net.bytebuddy.jar.asm.MethodVisitor) r1
                        L5d:
                            return r1
                        L5e:
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey, net.bytebuddy.description.method.MethodDescription> r1 = r0.declarableMethods
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r4 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey
                            r5 = r19
                            r4.<init>(r3, r5)
                            java.lang.Object r1 = r1.remove(r4)
                            net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                            if (r1 != 0) goto L80
                            net.bytebuddy.jar.asm.ClassVisitor r1 = r0.cv
                            r2 = r17
                            r3 = r18
                            r4 = r19
                            r5 = r20
                            r6 = r21
                            net.bytebuddy.jar.asm.MethodVisitor r1 = r1.visitMethod(r2, r3, r4, r5, r6)
                            goto L8e
                        L80:
                            r3 = r2 & 1024(0x400, float:1.435E-42)
                            if (r3 == 0) goto L88
                            r3 = r20
                            r7 = r8
                            goto L8a
                        L88:
                            r3 = r20
                        L8a:
                            net.bytebuddy.jar.asm.MethodVisitor r1 = r0.redefine(r1, r7, r2, r3)
                        L8e:
                            return r1
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onVisitNestHost(java.lang.String r1) {
                            r0 = this;
                            r0.onNestHost()
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onVisitNestMember(java.lang.String r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r1.this$0
                            net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                            boolean r0 = r0.isNestHost()
                            if (r0 == 0) goto L17
                            java.util.Set<java.lang.String> r0 = r1.nestMembers
                            boolean r0 = r0.remove(r2)
                            if (r0 == 0) goto L17
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
                            r0.visitNestMember(r2)
                        L17:
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onVisitOuterClass(java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4) {
                            r1 = this;
                            r1.onOuterType()     // Catch: java.lang.Throwable -> L4
                            goto L9
                        L4:
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
                            r0.visitOuterClass(r2, r3, r4)
                        L9:
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    public void onVisitPermittedSubclass(java.lang.String r2) {
                            r1 = this;
                            java.util.Set<java.lang.String> r0 = r1.permittedSubclasses
                            if (r0 == 0) goto Lf
                            boolean r0 = r0.remove(r2)
                            if (r0 == 0) goto Lf
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
                            r0.visitPermittedSubclass(r2)
                        Lf:
                            return
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.RecordComponentVisitor onVisitRecordComponent(java.lang.String r3, java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5) {
                            r2 = this;
                            java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.RecordComponentDescription> r0 = r2.declarableRecordComponents
                            java.lang.Object r0 = r0.remove(r3)
                            net.bytebuddy.description.type.RecordComponentDescription r0 = (net.bytebuddy.description.type.RecordComponentDescription) r0
                            if (r0 == 0) goto L1d
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r2.this$0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool r1 = r1.recordComponentPool
                            net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record r0 = r1.target(r0)
                            boolean r1 = r0.isImplicit()
                            if (r1 != 0) goto L1d
                            net.bytebuddy.jar.asm.RecordComponentVisitor r3 = r2.redefine(r0, r5)
                            return r3
                        L1d:
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
                            net.bytebuddy.jar.asm.RecordComponentVisitor r3 = r0.visitRecordComponent(r3, r4, r5)
                            return r3
                    }

                    @Override // net.bytebuddy.utility.visitor.MetadataAwareClassVisitor
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.AnnotationVisitor onVisitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r0 = r1.this$0
                            net.bytebuddy.implementation.attribute.AnnotationRetention r0 = r0.annotationRetention
                            boolean r0 = r0.isEnabled()
                            if (r0 == 0) goto L11
                            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
                            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitTypeAnnotation(r2, r3, r4, r5)
                            goto L15
                        L11:
                            net.bytebuddy.jar.asm.AnnotationVisitor r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$400()
                        L15:
                            return r2
                    }

                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.FieldVisitor redefine(net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record r8, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r9, int r10, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r11) {
                            r7 = this;
                            net.bytebuddy.description.field.FieldDescription r0 = r8.getField()
                            net.bytebuddy.jar.asm.ClassVisitor r1 = r7.cv
                            int r2 = r0.getActualModifiers()
                            int r10 = r7.resolveDeprecationModifiers(r10)
                            r2 = r2 | r10
                            java.lang.String r3 = r0.getInternalName()
                            java.lang.String r4 = r0.getDescriptor()
                            boolean r10 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                            if (r10 == 0) goto L1d
                        L1b:
                            r5 = r11
                            goto L22
                        L1d:
                            java.lang.String r11 = r0.getGenericSignature()
                            goto L1b
                        L22:
                            java.lang.Object r6 = r8.resolveDefault(r9)
                            net.bytebuddy.jar.asm.FieldVisitor r9 = r1.visitField(r2, r3, r4, r5, r6)
                            if (r9 != 0) goto L31
                            net.bytebuddy.jar.asm.FieldVisitor r8 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$600()
                            goto L37
                        L31:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$AttributeObtainingFieldVisitor r10 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$AttributeObtainingFieldVisitor
                            r10.<init>(r7, r9, r8)
                            r8 = r10
                        L37:
                            return r8
                    }

                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.MethodVisitor redefine(net.bytebuddy.description.method.MethodDescription r15, boolean r16, int r17, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r18) {
                            r14 = this;
                            r6 = r14
                            r0 = r17
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r1 = r6.methodPool
                            r2 = r15
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r7 = r1.target(r15)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r1 = r7.getSort()
                            boolean r1 = r1.isDefined()
                            if (r1 != 0) goto L45
                            net.bytebuddy.jar.asm.ClassVisitor r8 = r6.cv
                            int r1 = r15.getActualModifiers()
                            int r0 = r14.resolveDeprecationModifiers(r0)
                            r9 = r1 | r0
                            java.lang.String r10 = r15.getInternalName()
                            java.lang.String r11 = r15.getDescriptor()
                            boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                            if (r0 == 0) goto L2f
                            r12 = r18
                            goto L34
                        L2f:
                            java.lang.String r0 = r15.getGenericSignature()
                            r12 = r0
                        L34:
                            net.bytebuddy.description.type.TypeList$Generic r0 = r15.getExceptionTypes()
                            net.bytebuddy.description.type.TypeList r0 = r0.asErasures()
                            java.lang.String[] r13 = r0.toInternalNames()
                            net.bytebuddy.jar.asm.MethodVisitor r0 = r8.visitMethod(r9, r10, r11, r12, r13)
                            return r0
                        L45:
                            net.bytebuddy.description.method.MethodDescription r1 = r7.getMethod()
                            net.bytebuddy.jar.asm.ClassVisitor r8 = r6.cv
                            net.bytebuddy.description.modifier.Visibility r3 = r7.getVisibility()
                            java.util.Set r3 = java.util.Collections.singleton(r3)
                            net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r4 = r7.getSort()
                            boolean r4 = r4.isImplemented()
                            int r4 = r1.getActualModifiers(r4)
                            int r3 = r3.resolve(r4)
                            int r4 = r14.resolveDeprecationModifiers(r0)
                            r9 = r3 | r4
                            java.lang.String r10 = r1.getInternalName()
                            java.lang.String r11 = r1.getDescriptor()
                            boolean r3 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                            if (r3 == 0) goto L7c
                            r12 = r18
                            goto L81
                        L7c:
                            java.lang.String r4 = r1.getGenericSignature()
                            r12 = r4
                        L81:
                            net.bytebuddy.description.type.TypeList$Generic r4 = r1.getExceptionTypes()
                            net.bytebuddy.description.type.TypeList r4 = r4.asErasures()
                            java.lang.String[] r13 = r4.toInternalNames()
                            net.bytebuddy.jar.asm.MethodVisitor r8 = r8.visitMethod(r9, r10, r11, r12, r13)
                            if (r8 != 0) goto L98
                            net.bytebuddy.jar.asm.MethodVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$700()
                            return r0
                        L98:
                            if (r16 == 0) goto La0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$AttributeObtainingMethodVisitor r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$AttributeObtainingMethodVisitor
                            r0.<init>(r14, r8, r7)
                            return r0
                        La0:
                            boolean r2 = r15.isNative()
                            if (r2 == 0) goto L108
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r6.this$0
                            net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$800(r2)
                            net.bytebuddy.description.ByteCodeElement$TypeDependant r4 = r1.asDefined()
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r4
                            net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r2 = r2.resolve(r4)
                            boolean r4 = r2.isRebased()
                            if (r4 == 0) goto L102
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r2.getResolvedMethod()
                            int r4 = r4.getActualModifiers()
                            int r0 = r14.resolveDeprecationModifiers(r0)
                            r4 = r4 | r0
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.getResolvedMethod()
                            java.lang.String r5 = r0.getInternalName()
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.getResolvedMethod()
                            java.lang.String r9 = r0.getDescriptor()
                            if (r3 == 0) goto Lde
                            r10 = r18
                            goto Le3
                        Lde:
                            java.lang.String r0 = r1.getGenericSignature()
                            r10 = r0
                        Le3:
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.getResolvedMethod()
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                            net.bytebuddy.description.type.TypeList r0 = r0.asErasures()
                            java.lang.String[] r11 = r0.toInternalNames()
                            r0 = r14
                            r1 = r4
                            r2 = r5
                            r3 = r9
                            r4 = r10
                            r5 = r11
                            net.bytebuddy.jar.asm.MethodVisitor r0 = super.visitMethod(r1, r2, r3, r4, r5)
                            if (r0 == 0) goto L102
                            r0.visitEnd()
                        L102:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$AttributeObtainingMethodVisitor r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$AttributeObtainingMethodVisitor
                            r0.<init>(r14, r8, r7)
                            return r0
                        L108:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$CodePreservingMethodVisitor r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$CodePreservingMethodVisitor
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r6.this$0
                            net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$800(r2)
                            net.bytebuddy.description.ByteCodeElement$TypeDependant r1 = r1.asDefined()
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                            net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r1 = r2.resolve(r1)
                            r0.<init>(r14, r8, r7, r1)
                            return r0
                    }

                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.jar.asm.RecordComponentVisitor redefine(net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7) {
                            r5 = this;
                            net.bytebuddy.description.type.RecordComponentDescription r0 = r6.getRecordComponent()
                            net.bytebuddy.jar.asm.ClassVisitor r1 = r5.cv
                            java.lang.String r2 = r0.getActualName()
                            java.lang.String r3 = r0.getDescriptor()
                            boolean r4 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                            if (r4 == 0) goto L13
                            goto L17
                        L13:
                            java.lang.String r7 = r0.getGenericSignature()
                        L17:
                            net.bytebuddy.jar.asm.RecordComponentVisitor r7 = r1.visitRecordComponent(r2, r3, r7)
                            if (r7 != 0) goto L22
                            net.bytebuddy.jar.asm.RecordComponentVisitor r6 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.access$500()
                            goto L28
                        L22:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$AttributeObtainingRecordComponentVisitor r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor$AttributeObtainingRecordComponentVisitor
                            r0.<init>(r5, r7, r6)
                            r6 = r0
                        L28:
                            return r6
                    }

                    @Override // net.bytebuddy.jar.asm.ClassVisitor
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Relying on correlated type properties.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public void visit(int r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String[] r25) {
                            r19 = this;
                            r0 = r19
                            r1 = r21
                            net.bytebuddy.ClassFileVersion r9 = net.bytebuddy.ClassFileVersion.ofMinorMajor(r20)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$200(r2)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r3 = r0.this$0
                            net.bytebuddy.implementation.Implementation$Target$Factory r3 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.access$100(r3)
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Compiled r2 = r2.compile(r3, r9)
                            r0.methodPool = r2
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Creating r3 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Creating
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r4 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r5 = r4.instrumentedType
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r4.annotationValueFilterFactory
                            r3.<init>(r5, r2, r4)
                            r0.initializationHandler = r3
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r0.this$0
                            net.bytebuddy.implementation.Implementation$Context$Factory r3 = r2.implementationContextFactory
                            net.bytebuddy.description.type.TypeDescription r4 = r2.instrumentedType
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r5 = r2.auxiliaryTypeNamingStrategy
                            net.bytebuddy.dynamic.scaffold.TypeInitializer r6 = r0.typeInitializer
                            net.bytebuddy.ClassFileVersion r7 = r2.classFileVersion
                            int r2 = r0.writerFlags
                            r2 = r2 & 2
                            if (r2 != 0) goto L4e
                            net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V6
                            boolean r2 = r9.isAtLeast(r2)
                            if (r2 == 0) goto L4e
                            int r2 = r0.readerFlags
                            r2 = r2 & 8
                            if (r2 != 0) goto L4b
                            net.bytebuddy.implementation.Implementation$Context$FrameGeneration r2 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE
                        L49:
                            r8 = r2
                            goto L51
                        L4b:
                            net.bytebuddy.implementation.Implementation$Context$FrameGeneration r2 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EXPAND
                            goto L49
                        L4e:
                            net.bytebuddy.implementation.Implementation$Context$FrameGeneration r2 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.DISABLED
                            goto L49
                        L51:
                            r2 = r3
                            r3 = r4
                            r4 = r5
                            r5 = r6
                            r6 = r9
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r2 = r2.make(r3, r4, r5, r6, r7, r8)
                            r0.implementationContext = r2
                            net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V5
                            boolean r2 = r9.isLessThan(r2)
                            r0.retainDeprecationModifiers = r2
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$ContextRegistry r2 = r0.contextRegistry
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r3 = r0.implementationContext
                            r2.setImplementationContext(r3)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r0.this$0
                            net.bytebuddy.asm.AsmVisitorWrapper r3 = r2.asmVisitorWrapper
                            net.bytebuddy.description.type.TypeDescription r4 = r2.instrumentedType
                            net.bytebuddy.jar.asm.ClassVisitor r5 = r0.cv
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r6 = r0.implementationContext
                            net.bytebuddy.pool.TypePool r7 = r2.typePool
                            net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r8 = r2.fields
                            net.bytebuddy.description.method.MethodList<?> r9 = r2.methods
                            int r10 = r0.writerFlags
                            int r11 = r0.readerFlags
                            net.bytebuddy.jar.asm.ClassVisitor r12 = r3.wrap(r4, r5, r6, r7, r8, r9, r10, r11)
                            r0.cv = r12
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r2 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r2 = r2.instrumentedType
                            r3 = r1 & 32
                            r4 = 0
                            if (r3 == 0) goto L96
                            boolean r3 = r2.isInterface()
                            if (r3 != 0) goto L96
                            r3 = 1
                            goto L97
                        L96:
                            r3 = r4
                        L97:
                            int r2 = r2.getActualModifiers(r3)
                            int r3 = r0.resolveDeprecationModifiers(r1)
                            r2 = r2 | r3
                            r3 = 16
                            r1 = r1 & r3
                            if (r1 == 0) goto Lb0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            boolean r1 = r1.isAnonymousType()
                            if (r1 == 0) goto Lb0
                            r4 = r3
                        Lb0:
                            r14 = r2 | r4
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            java.lang.String r15 = r1.getInternalName()
                            boolean r1 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                            if (r1 == 0) goto Lc1
                            r16 = r23
                            goto Lcb
                        Lc1:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            java.lang.String r1 = r1.getGenericSignature()
                            r16 = r1
                        Lcb:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getSuperClass()
                            if (r1 != 0) goto Lf1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            boolean r1 = r1.isInterface()
                            if (r1 == 0) goto Lec
                            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                            java.lang.String r1 = r1.getInternalName()
                        Le9:
                            r17 = r1
                            goto L102
                        Lec:
                            java.lang.String r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.access$300()
                            goto Le9
                        Lf1:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getSuperClass()
                            net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                            java.lang.String r1 = r1.getInternalName()
                            goto Le9
                        L102:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r1 = r0.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = r1.instrumentedType
                            net.bytebuddy.description.type.TypeList$Generic r1 = r1.getInterfaces()
                            net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                            java.lang.String[] r18 = r1.toInternalNames()
                            r13 = r20
                            r12.visit(r13, r14, r15, r16, r17, r18)
                            return
                    }
                }

                static {
                        r0 = 0
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.EMPTY = r0
                        return
                }

                public WithFullProcessing(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.ClassFileVersion r4, net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool r5, net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool r6, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r7, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r8, net.bytebuddy.description.method.MethodList<?> r9, net.bytebuddy.description.method.MethodList<?> r10, net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> r11, net.bytebuddy.implementation.LoadedTypeInitializer r12, net.bytebuddy.dynamic.scaffold.TypeInitializer r13, net.bytebuddy.implementation.attribute.TypeAttributeAppender r14, net.bytebuddy.asm.AsmVisitorWrapper r15, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r16, net.bytebuddy.implementation.attribute.AnnotationRetention r17, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r18, net.bytebuddy.implementation.Implementation.Context.Factory r19, net.bytebuddy.dynamic.scaffold.TypeValidation r20, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r21, net.bytebuddy.pool.TypePool r22, net.bytebuddy.description.type.TypeDescription r23, net.bytebuddy.dynamic.ClassFileLocator r24, net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared r25, net.bytebuddy.implementation.Implementation.Target.Factory r26, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r27) {
                        r2 = this;
                        r0 = r2
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                        r1 = r25
                        r0.methodRegistry = r1
                        r1 = r26
                        r0.implementationTargetFactory = r1
                        r1 = r27
                        r0.methodRebaseResolver = r1
                        return
                }

                public static /* synthetic */ net.bytebuddy.implementation.Implementation.Target.Factory access$100(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing r0) {
                        net.bytebuddy.implementation.Implementation$Target$Factory r0 = r0.implementationTargetFactory
                        return r0
                }

                public static /* synthetic */ java.lang.Object[] access$1100() {
                        java.lang.Object[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.EMPTY
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared access$200(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing r0) {
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared r0 = r0.methodRegistry
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver access$800(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing r0) {
                        net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r0 = r0.methodRebaseResolver
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining, net.bytebuddy.dynamic.scaffold.TypeWriter.Default
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
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared r2 = r4.methodRegistry
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing) r5
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared r3 = r5.methodRegistry
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.implementation.Implementation$Target$Factory r2 = r4.implementationTargetFactory
                        net.bytebuddy.implementation.Implementation$Target$Factory r3 = r5.implementationTargetFactory
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L32
                        return r1
                    L32:
                        net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r2 = r4.methodRebaseResolver
                        net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r5 = r5.methodRebaseResolver
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L3d
                        return r1
                    L3d:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining, net.bytebuddy.dynamic.scaffold.TypeWriter.Default
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared r1 = r2.methodRegistry
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.Implementation$Target$Factory r1 = r2.implementationTargetFactory
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r1 = r2.methodRebaseResolver
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining
                public net.bytebuddy.jar.asm.ClassVisitor writeTo(net.bytebuddy.jar.asm.ClassVisitor r9, net.bytebuddy.dynamic.scaffold.TypeInitializer r10, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry r11, int r12, int r13) {
                        r8 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor r7 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$RedefinitionClassVisitor
                        r0 = r7
                        r1 = r8
                        r2 = r9
                        r3 = r10
                        r4 = r11
                        r5 = r12
                        r6 = r13
                        r0.<init>(r1, r2, r3, r4, r5, r6)
                        net.bytebuddy.description.type.TypeDescription r9 = r8.originalType
                        java.lang.String r9 = r9.getName()
                        net.bytebuddy.description.type.TypeDescription r10 = r8.instrumentedType
                        java.lang.String r10 = r10.getName()
                        boolean r9 = r9.equals(r10)
                        if (r9 == 0) goto L1f
                        goto L36
                    L1f:
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$OpenedClassRemapper r9 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$OpenedClassRemapper
                        net.bytebuddy.jar.asm.commons.SimpleRemapper r10 = new net.bytebuddy.jar.asm.commons.SimpleRemapper
                        net.bytebuddy.description.type.TypeDescription r11 = r8.originalType
                        java.lang.String r11 = r11.getInternalName()
                        net.bytebuddy.description.type.TypeDescription r12 = r8.instrumentedType
                        java.lang.String r12 = r12.getInternalName()
                        r10.<init>(r11, r12)
                        r9.<init>(r7, r10)
                        r7 = r9
                    L36:
                        return r7
                }
            }

            static {
                    return
            }

            public ForInlining(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.ClassFileVersion r4, net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool r5, net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool r6, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r7, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r8, net.bytebuddy.description.method.MethodList<?> r9, net.bytebuddy.description.method.MethodList<?> r10, net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> r11, net.bytebuddy.implementation.LoadedTypeInitializer r12, net.bytebuddy.dynamic.scaffold.TypeInitializer r13, net.bytebuddy.implementation.attribute.TypeAttributeAppender r14, net.bytebuddy.asm.AsmVisitorWrapper r15, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r16, net.bytebuddy.implementation.attribute.AnnotationRetention r17, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r18, net.bytebuddy.implementation.Implementation.Context.Factory r19, net.bytebuddy.dynamic.scaffold.TypeValidation r20, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r21, net.bytebuddy.pool.TypePool r22, net.bytebuddy.description.type.TypeDescription r23, net.bytebuddy.dynamic.ClassFileLocator r24) {
                    r2 = this;
                    r0 = r2
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                    r1 = r23
                    r0.originalType = r1
                    r1 = r24
                    r0.classFileLocator = r1
                    return
            }

            public static /* synthetic */ net.bytebuddy.jar.asm.AnnotationVisitor access$400() {
                    net.bytebuddy.jar.asm.AnnotationVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.IGNORE_ANNOTATION
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.jar.asm.RecordComponentVisitor access$500() {
                    net.bytebuddy.jar.asm.RecordComponentVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.IGNORE_RECORD_COMPONENT
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.jar.asm.FieldVisitor access$600() {
                    net.bytebuddy.jar.asm.FieldVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.IGNORE_FIELD
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.jar.asm.MethodVisitor access$700() {
                    net.bytebuddy.jar.asm.MethodVisitor r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.IGNORE_METHOD
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public net.bytebuddy.dynamic.scaffold.TypeWriter.Default<U>.UnresolvedType create(net.bytebuddy.dynamic.scaffold.TypeInitializer r10, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher r11) {
                    r9 = this;
                    net.bytebuddy.asm.AsmVisitorWrapper r0 = r9.asmVisitorWrapper     // Catch: java.io.IOException -> L53
                    r1 = 0
                    int r6 = r0.mergeWriter(r1)     // Catch: java.io.IOException -> L53
                    net.bytebuddy.asm.AsmVisitorWrapper r0 = r9.asmVisitorWrapper     // Catch: java.io.IOException -> L53
                    int r0 = r0.mergeReader(r1)     // Catch: java.io.IOException -> L53
                    net.bytebuddy.dynamic.ClassFileLocator r1 = r9.classFileLocator     // Catch: java.io.IOException -> L53
                    net.bytebuddy.description.type.TypeDescription r2 = r9.originalType     // Catch: java.io.IOException -> L53
                    java.lang.String r2 = r2.getName()     // Catch: java.io.IOException -> L53
                    net.bytebuddy.dynamic.ClassFileLocator$Resolution r1 = r1.locate(r2)     // Catch: java.io.IOException -> L53
                    byte[] r1 = r1.resolve()     // Catch: java.io.IOException -> L53
                    net.bytebuddy.description.type.TypeDescription r2 = r9.instrumentedType     // Catch: java.io.IOException -> L53
                    r3 = 1
                    r11.dump(r2, r3, r1)     // Catch: java.io.IOException -> L53
                    net.bytebuddy.jar.asm.ClassReader r11 = net.bytebuddy.utility.OpenedClassReader.of(r1)     // Catch: java.io.IOException -> L53
                    net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r9.classWriterStrategy     // Catch: java.io.IOException -> L53
                    net.bytebuddy.pool.TypePool r2 = r9.typePool     // Catch: java.io.IOException -> L53
                    net.bytebuddy.jar.asm.ClassWriter r1 = r1.resolve(r6, r2, r11)     // Catch: java.io.IOException -> L53
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$ContextRegistry r8 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$ContextRegistry     // Catch: java.io.IOException -> L53
                    r8.<init>()     // Catch: java.io.IOException -> L53
                    net.bytebuddy.dynamic.scaffold.TypeValidation r2 = r9.typeValidation     // Catch: java.io.IOException -> L53
                    net.bytebuddy.jar.asm.ClassVisitor r3 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.of(r1, r2)     // Catch: java.io.IOException -> L53
                    r2 = r9
                    r4 = r10
                    r5 = r8
                    r7 = r0
                    net.bytebuddy.jar.asm.ClassVisitor r10 = r2.writeTo(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L53
                    r11.accept(r10, r0)     // Catch: java.io.IOException -> L53
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$UnresolvedType r10 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$UnresolvedType     // Catch: java.io.IOException -> L53
                    byte[] r11 = r1.toByteArray()     // Catch: java.io.IOException -> L53
                    java.util.List r0 = r8.getAuxiliaryTypes()     // Catch: java.io.IOException -> L53
                    r10.<init>(r9, r11, r0)     // Catch: java.io.IOException -> L53
                    return r10
                L53:
                    r10 = move-exception
                    java.lang.RuntimeException r11 = new java.lang.RuntimeException
                    java.lang.String r0 = "The class file could not be written"
                    r11.<init>(r0, r10)
                    throw r11
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.originalType
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.originalType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    return r1
                L27:
                    net.bytebuddy.dynamic.ClassFileLocator r2 = r4.classFileLocator
                    net.bytebuddy.dynamic.ClassFileLocator r5 = r5.classFileLocator
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L32
                    return r1
                L32:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.originalType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.ClassFileLocator r1 = r2.classFileLocator
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter
            public net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r9, int r10, int r11) {
                    r8 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$ContextRegistry r6 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$ContextRegistry
                    r6.<init>()
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$RegistryContextClassVisitor r7 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$RegistryContextClassVisitor
                    net.bytebuddy.dynamic.scaffold.TypeValidation r0 = r8.typeValidation
                    net.bytebuddy.jar.asm.ClassVisitor r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.of(r9, r0)
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r2 = r8.typeInitializer
                    net.bytebuddy.asm.AsmVisitorWrapper r9 = r8.asmVisitorWrapper
                    int r4 = r9.mergeWriter(r10)
                    net.bytebuddy.asm.AsmVisitorWrapper r9 = r8.asmVisitorWrapper
                    int r5 = r9.mergeReader(r11)
                    r0 = r8
                    r3 = r6
                    net.bytebuddy.jar.asm.ClassVisitor r9 = r0.writeTo(r1, r2, r3, r4, r5)
                    r7.<init>(r8, r9, r6)
                    return r7
            }

            public abstract net.bytebuddy.jar.asm.ClassVisitor writeTo(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.dynamic.scaffold.TypeInitializer r2, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.ContextRegistry r3, int r4, int r5);
        }

        public static class SignatureKey {
            private final java.lang.String descriptor;
            private final java.lang.String internalName;

            public SignatureKey(java.lang.String r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.internalName = r1
                    r0.descriptor = r2
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 == 0) goto L2b
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L12
                    goto L2b
                L12:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$SignatureKey r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.SignatureKey) r5
                    java.lang.String r2 = r4.internalName
                    java.lang.String r3 = r5.internalName
                    boolean r2 = r2.equals(r3)
                    if (r2 == 0) goto L29
                    java.lang.String r2 = r4.descriptor
                    java.lang.String r5 = r5.descriptor
                    boolean r5 = r2.equals(r5)
                    if (r5 == 0) goto L29
                    goto L2a
                L29:
                    r0 = r1
                L2a:
                    return r0
                L2b:
                    return r1
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.String r0 = r2.internalName
                    int r0 = r0.hashCode()
                    int r0 = r0 + 17
                    java.lang.String r1 = r2.descriptor
                    int r1 = r1.hashCode()
                    int r1 = r1 * 31
                    int r0 = r0 + r1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class UnresolvedType {
            private final java.util.List<? extends net.bytebuddy.dynamic.DynamicType> auxiliaryTypes;
            private final byte[] binaryRepresentation;
            final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default this$0;

            public UnresolvedType(net.bytebuddy.dynamic.scaffold.TypeWriter.Default r1, byte[] r2, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r3) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.binaryRepresentation = r2
                    r0.auxiliaryTypes = r3
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
                    byte[] r2 = r4.binaryRepresentation
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$UnresolvedType r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.UnresolvedType) r5
                    byte[] r3 = r5.binaryRepresentation
                    boolean r2 = java.util.Arrays.equals(r2, r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r2 = r4.auxiliaryTypes
                    java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r3 = r5.auxiliaryTypes
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default r2 = r4.this$0
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default r5 = r5.this$0
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L36
                    return r1
                L36:
                    return r0
            }

            public byte[] getBinaryRepresentation() {
                    r1 = this;
                    byte[] r0 = r1.binaryRepresentation
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    byte[] r1 = r2.binaryRepresentation
                    int r1 = java.util.Arrays.hashCode(r1)
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1 = r2.auxiliaryTypes
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default r1 = r2.this$0
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            public net.bytebuddy.dynamic.DynamicType.Unloaded<S> toDynamicType(net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved r8) {
                    r7 = this;
                    net.bytebuddy.dynamic.DynamicType$Default$Unloaded r6 = new net.bytebuddy.dynamic.DynamicType$Default$Unloaded
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default r0 = r7.this$0
                    net.bytebuddy.description.type.TypeDescription r1 = r0.instrumentedType
                    byte[] r2 = r7.binaryRepresentation
                    net.bytebuddy.implementation.LoadedTypeInitializer r3 = r0.loadedTypeInitializer
                    java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r0.auxiliaryTypes
                    java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r4 = r7.auxiliaryTypes
                    java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r0, r4)
                    r0 = r6
                    r5 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
            }
        }

        public static class ValidatingClassVisitor extends net.bytebuddy.jar.asm.ClassVisitor {

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final net.bytebuddy.jar.asm.FieldVisitor IGNORE_FIELD = null;

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final net.bytebuddy.jar.asm.MethodVisitor IGNORE_METHOD = null;
            private static final java.lang.String NO_PARAMETERS = "()";
            private static final java.lang.String RETURNS_VOID = "V";
            private static final java.lang.String STRING_DESCRIPTOR = "Ljava/lang/String;";

            @net.bytebuddy.utility.nullability.UnknownNull
            private net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint constraint;

            public interface Constraint {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Compound implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint {
                    private final java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint> constraints;

                    public Compound(java.util.List<? extends net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint> r3) {
                            r2 = this;
                            r2.<init>()
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            r2.constraints = r0
                            java.util.Iterator r3 = r3.iterator()
                        Le:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto L2e
                            java.lang.Object r0 = r3.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r0
                            boolean r1 = r0 instanceof net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.Compound
                            if (r1 == 0) goto L28
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r1 = r2.constraints
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$Compound r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.Compound) r0
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r0.constraints
                            r1.addAll(r0)
                            goto Le
                        L28:
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r1 = r2.constraints
                            r1.add(r0)
                            goto Le
                        L2e:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertAnnotation()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertDefaultMethodCall()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(java.lang.String r3) {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertDefaultValue(r3)
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertDynamicValueInConstantPool()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(java.lang.String r9, boolean r10, boolean r11, boolean r12, boolean r13) {
                            r8 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r8.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L1c
                            java.lang.Object r1 = r0.next()
                            r2 = r1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r2 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r2
                            r3 = r9
                            r4 = r10
                            r5 = r11
                            r6 = r12
                            r7 = r13
                            r2.assertField(r3, r4, r5, r6, r7)
                            goto L6
                        L1c:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertHandleInConstantPool()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertInvokeDynamic()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(java.lang.String r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22) {
                            r13 = this;
                            r0 = r13
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r1 = r0.constraints
                            java.util.Iterator r1 = r1.iterator()
                        L7:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L28
                            java.lang.Object r2 = r1.next()
                            r3 = r2
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r3 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r3
                            r4 = r14
                            r5 = r15
                            r6 = r16
                            r7 = r17
                            r8 = r18
                            r9 = r19
                            r10 = r20
                            r11 = r21
                            r12 = r22
                            r3.assertMethod(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                            goto L7
                        L28:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertMethodTypeInConstantPool()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertNestMate()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertPermittedSubclass() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertPermittedSubclass()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertRecord() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertRecord()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertSubRoutine()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int r3, boolean r4, boolean r5) {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertType(r3, r4, r5)
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertTypeAnnotation()
                            goto L6
                        L16:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                            r2 = this;
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r0 = r2.constraints
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint) r1
                            r1.assertTypeInConstantPool()
                            goto L6
                        L16:
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
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r2 = r4.constraints
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$Compound r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.Compound) r5
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r5 = r5.constraints
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
                            java.util.List<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint> r1 = r2.constraints
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                public enum ForAnnotation extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation> implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation CLASSIC = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation JAVA_8 = null;
                    private final boolean classic;

                    static {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation
                            java.lang.String r1 = "CLASSIC"
                            r2 = 0
                            r3 = 1
                            r0.<init>(r1, r2, r3)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation.CLASSIC = r0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation
                            java.lang.String r4 = "JAVA_8"
                            r1.<init>(r4, r3, r2)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation.JAVA_8 = r1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation[]{r0, r1}
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation.$VALUES = r0
                            return
                    }

                    ForAnnotation(java.lang.String r1, int r2, boolean r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            r0.classic = r3
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation[] values() {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(java.lang.String r1) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5) {
                            r0 = this;
                            if (r3 == 0) goto L7
                            if (r2 == 0) goto L7
                            if (r4 == 0) goto L7
                            return
                        L7:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot only define public, static, final field '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for interface type"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
                            r0 = this;
                            java.lang.String r2 = "<clinit>"
                            boolean r2 = r1.equals(r2)
                            if (r2 != 0) goto L56
                            if (r7 != 0) goto L4e
                            boolean r2 = r0.classic
                            if (r2 == 0) goto L2d
                            if (r6 == 0) goto L11
                            goto L2d
                        L11:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define non-virtual method '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for a pre-Java 8 annotation type"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L2d:
                            if (r5 != 0) goto L56
                            if (r8 != 0) goto L32
                            goto L56
                        L32:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define method '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' with the given signature as an annotation type method"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L4e:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "Cannot define constructor for interface type"
                            r1.<init>(r2)
                            throw r1
                        L56:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertPermittedSubclass() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertRecord() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int r1, boolean r2, boolean r3) {
                            r0 = this;
                            r1 = r1 & 512(0x200, float:7.17E-43)
                            if (r1 == 0) goto L5
                            return
                        L5:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "Cannot define annotation type without interface modifier"
                            r1.<init>(r2)
                            throw r1
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                            r0 = this;
                            return
                    }
                }

                public enum ForClass extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass> implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass ABSTRACT = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass MANIFEST = null;
                    private final boolean manifestType;

                    static {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass
                            java.lang.String r1 = "MANIFEST"
                            r2 = 0
                            r3 = 1
                            r0.<init>(r1, r2, r3)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass.MANIFEST = r0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass
                            java.lang.String r4 = "ABSTRACT"
                            r1.<init>(r4, r3, r2)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass.ABSTRACT = r1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass[]{r0, r1}
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass.$VALUES = r0
                            return
                    }

                    ForClass(java.lang.String r1, int r2, boolean r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            r0.manifestType = r3
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass[] values() {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(java.lang.String r4) {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot define default value for '"
                            r1.append(r2)
                            r1.append(r4)
                            java.lang.String r4 = "' for non-annotation type"
                            r1.append(r4)
                            java.lang.String r4 = r1.toString()
                            r0.<init>(r4)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
                            r0 = this;
                            if (r2 == 0) goto L23
                            boolean r2 = r0.manifestType
                            if (r2 != 0) goto L7
                            goto L23
                        L7:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define abstract method '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for non-abstract class"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L23:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertPermittedSubclass() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertRecord() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int r1, boolean r2, boolean r3) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                            r0 = this;
                            return
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForClassFileVersion implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint {
                    private final net.bytebuddy.ClassFileVersion classFileVersion;

                    public ForClassFileVersion(net.bytebuddy.ClassFileVersion r1) {
                            r0 = this;
                            r0.<init>()
                            r0.classFileVersion = r1
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V5
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot write annotations for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V8
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot invoke default method for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(java.lang.String r1) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V11
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot write dynamic constant for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5) {
                            r0 = this;
                            if (r5 == 0) goto L2e
                            net.bytebuddy.ClassFileVersion r2 = r0.classFileVersion
                            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V4
                            boolean r2 = r2.isAtLeast(r3)
                            if (r2 == 0) goto Ld
                            goto L2e
                        Ld:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define generic field '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for class file version "
                            r3.append(r1)
                            net.bytebuddy.ClassFileVersion r1 = r0.classFileVersion
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L2e:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V7
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot write method handle to constant pool for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V7
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot write invoke dynamic instruction for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
                            r0 = this;
                            if (r9 == 0) goto L2e
                            net.bytebuddy.ClassFileVersion r3 = r0.classFileVersion
                            net.bytebuddy.ClassFileVersion r4 = net.bytebuddy.ClassFileVersion.JAVA_V4
                            boolean r3 = r3.isAtLeast(r4)
                            if (r3 == 0) goto Ld
                            goto L2e
                        Ld:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define generic method '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for class file version "
                            r3.append(r1)
                            net.bytebuddy.ClassFileVersion r1 = r0.classFileVersion
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L2e:
                            if (r6 != 0) goto L4f
                            if (r2 != 0) goto L33
                            goto L4f
                        L33:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define static or non-virtual method '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' to be abstract"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L4f:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V7
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot write method type to constant pool for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V11
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot define nest mate for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertPermittedSubclass() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V17
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot define permitted subclasses for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertRecord() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V14
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot define record for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V5
                            boolean r0 = r0.isGreaterThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot write subroutine for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int r1, boolean r2, boolean r3) {
                            r0 = this;
                            r1 = r1 & 8192(0x2000, float:1.148E-41)
                            if (r1 == 0) goto L28
                            net.bytebuddy.ClassFileVersion r1 = r0.classFileVersion
                            net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V5
                            boolean r1 = r1.isAtLeast(r2)
                            if (r1 == 0) goto Lf
                            goto L28
                        Lf:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Cannot define annotation type for class file version "
                            r2.append(r3)
                            net.bytebuddy.ClassFileVersion r3 = r0.classFileVersion
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2)
                            throw r1
                        L28:
                            if (r3 == 0) goto L4e
                            net.bytebuddy.ClassFileVersion r1 = r0.classFileVersion
                            net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V4
                            boolean r1 = r1.isAtLeast(r2)
                            if (r1 == 0) goto L35
                            goto L4e
                        L35:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Cannot define a generic type for class file version "
                            r2.append(r3)
                            net.bytebuddy.ClassFileVersion r3 = r0.classFileVersion
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2)
                            throw r1
                        L4e:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V5
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot write type annotations for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                            r3 = this;
                            net.bytebuddy.ClassFileVersion r0 = r3.classFileVersion
                            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V5
                            boolean r0 = r0.isLessThan(r1)
                            if (r0 != 0) goto Lb
                            return
                        Lb:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot write type to constant pool for class file version "
                            r1.append(r2)
                            net.bytebuddy.ClassFileVersion r2 = r3.classFileVersion
                            r1.append(r2)
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
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            net.bytebuddy.ClassFileVersion r2 = r4.classFileVersion
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClassFileVersion r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClassFileVersion) r5
                            net.bytebuddy.ClassFileVersion r5 = r5.classFileVersion
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
                            net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                public enum ForInterface extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface> implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface CLASSIC = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface JAVA_8 = null;
                    private final boolean classic;

                    static {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface
                            java.lang.String r1 = "CLASSIC"
                            r2 = 0
                            r3 = 1
                            r0.<init>(r1, r2, r3)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface.CLASSIC = r0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface
                            java.lang.String r4 = "JAVA_8"
                            r1.<init>(r4, r3, r2)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface.JAVA_8 = r1
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface[]{r0, r1}
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface.$VALUES = r0
                            return
                    }

                    ForInterface(java.lang.String r1, int r2, boolean r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            r0.classic = r3
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface[] values() {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(java.lang.String r4) {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot define default value for '"
                            r1.append(r2)
                            r1.append(r4)
                            java.lang.String r4 = "' for non-annotation type"
                            r1.append(r4)
                            java.lang.String r4 = r1.toString()
                            r0.<init>(r4)
                            throw r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5) {
                            r0 = this;
                            if (r3 == 0) goto L7
                            if (r2 == 0) goto L7
                            if (r4 == 0) goto L7
                            return
                        L7:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot only define public, static, final field '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for interface type"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
                            r0 = this;
                            java.lang.String r4 = "<clinit>"
                            boolean r4 = r1.equals(r4)
                            if (r4 != 0) goto L77
                            if (r7 != 0) goto L6f
                            boolean r4 = r0.classic
                            if (r4 == 0) goto L2d
                            if (r3 == 0) goto L11
                            goto L2d
                        L11:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define non-public method '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for interface type"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L2d:
                            if (r4 == 0) goto L4e
                            if (r6 == 0) goto L32
                            goto L4e
                        L32:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define non-virtual method '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for a pre-Java 8 interface type"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L4e:
                            if (r4 == 0) goto L77
                            if (r2 == 0) goto L53
                            goto L77
                        L53:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Cannot define default method '"
                            r3.append(r4)
                            r3.append(r1)
                            java.lang.String r1 = "' for pre-Java 8 interface type"
                            r3.append(r1)
                            java.lang.String r1 = r3.toString()
                            r2.<init>(r1)
                            throw r2
                        L6f:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "Cannot define constructor for interface type"
                            r1.<init>(r2)
                            throw r1
                        L77:
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertPermittedSubclass() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertRecord() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int r1, boolean r2, boolean r3) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                            r0 = this;
                            return
                    }
                }

                public enum ForPackageType extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType> implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType INSTANCE = null;

                    static {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType.INSTANCE = r0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType[]{r0}
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType.$VALUES = r0
                            return
                    }

                    ForPackageType(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType[] values() {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(java.lang.String r1) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5) {
                            r0 = this;
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "Cannot define a field for a package description type"
                            r1.<init>(r2)
                            throw r1
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
                            r0 = this;
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "Cannot define a method for a package description type"
                            r1.<init>(r2)
                            throw r1
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertPermittedSubclass() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertRecord() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int r1, boolean r2, boolean r3) {
                            r0 = this;
                            r3 = 5632(0x1600, float:7.892E-42)
                            if (r1 != r3) goto Lf
                            if (r2 != 0) goto L7
                            return
                        L7:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "Cannot implement interface for package type"
                            r1.<init>(r2)
                            throw r1
                        Lf:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "A package description type must define 5632 as modifier"
                            r1.<init>(r2)
                            throw r1
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                            r0 = this;
                            return
                    }
                }

                public enum ForRecord extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord> implements net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord INSTANCE = null;

                    static {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord.INSTANCE = r0
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord[]{r0}
                            net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord.$VALUES = r0
                            return
                    }

                    ForRecord(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord[] values() {
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultMethodCall() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDefaultValue(java.lang.String r1) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertDynamicValueInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertField(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertHandleInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertInvokeDynamic() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethod(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertMethodTypeInConstantPool() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertNestMate() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertPermittedSubclass() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertRecord() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertSubRoutine() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertType(int r1, boolean r2, boolean r3) {
                            r0 = this;
                            r1 = r1 & 1024(0x400, float:1.435E-42)
                            if (r1 != 0) goto L5
                            return
                        L5:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "Cannot define a record class as abstract"
                            r1.<init>(r2)
                            throw r1
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeAnnotation() {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public void assertTypeInConstantPool() {
                            r0 = this;
                            return
                    }
                }

                void assertAnnotation();

                void assertDefaultMethodCall();

                void assertDefaultValue(java.lang.String r1);

                void assertDynamicValueInConstantPool();

                void assertField(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5);

                void assertHandleInConstantPool();

                void assertInvokeDynamic();

                void assertMethod(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9);

                void assertMethodTypeInConstantPool();

                void assertNestMate();

                void assertPermittedSubclass();

                void assertRecord();

                void assertSubRoutine();

                void assertType(int r1, boolean r2, boolean r3);

                void assertTypeAnnotation();

                void assertTypeInConstantPool();
            }

            public class ValidatingFieldVisitor extends net.bytebuddy.jar.asm.FieldVisitor {
                final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor this$0;

                public ValidatingFieldVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor r1, net.bytebuddy.jar.asm.FieldVisitor r2) {
                        r0 = this;
                        r0.this$0 = r1
                        int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                        r0.<init>(r1, r2)
                        return
                }

                @Override // net.bytebuddy.jar.asm.FieldVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r1.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertAnnotation()
                        net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitAnnotation(r2, r3)
                        return r2
                }
            }

            public class ValidatingMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
                private final java.lang.String name;
                final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor this$0;

                public ValidatingMethodVisitor(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor r1, net.bytebuddy.jar.asm.MethodVisitor r2, java.lang.String r3) {
                        r0 = this;
                        r0.this$0 = r1
                        int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                        r0.<init>(r1, r2)
                        r0.name = r3
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r1.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertAnnotation()
                        net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitAnnotation(r2, r3)
                        return r2
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotationDefault() {
                        r2 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r2.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        java.lang.String r1 = r2.name
                        r0.assertDefaultValue(r1)
                        net.bytebuddy.jar.asm.AnnotationVisitor r0 = super.visitAnnotationDefault()
                        return r0
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public void visitInvokeDynamicInsn(java.lang.String r4, java.lang.String r5, net.bytebuddy.jar.asm.Handle r6, java.lang.Object... r7) {
                        r3 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r3.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertInvokeDynamic()
                        int r0 = r7.length
                        r1 = 0
                    Lb:
                        if (r1 >= r0) goto L1f
                        r2 = r7[r1]
                        boolean r2 = r2 instanceof net.bytebuddy.jar.asm.ConstantDynamic
                        if (r2 == 0) goto L1c
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r2 = r3.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r2 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r2)
                        r2.assertDynamicValueInConstantPool()
                    L1c:
                        int r1 = r1 + 1
                        goto Lb
                    L1f:
                        super.visitInvokeDynamicInsn(r4, r5, r6, r7)
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public void visitJumpInsn(int r2, net.bytebuddy.jar.asm.Label r3) {
                        r1 = this;
                        r0 = 168(0xa8, float:2.35E-43)
                        if (r2 != r0) goto Ld
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r1.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertSubRoutine()
                    Ld:
                        super.visitJumpInsn(r2, r3)
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Fall through to default case is intentional.", value = {"SF_SWITCH_NO_DEFAULT"})
                public void visitLdcInsn(java.lang.Object r2) {
                        r1 = this;
                        boolean r0 = r2 instanceof net.bytebuddy.jar.asm.Type
                        if (r0 == 0) goto L23
                        r0 = r2
                        net.bytebuddy.jar.asm.Type r0 = (net.bytebuddy.jar.asm.Type) r0
                        int r0 = r0.getSort()
                        switch(r0) {
                            case 9: goto L19;
                            case 10: goto L19;
                            case 11: goto Lf;
                            default: goto Le;
                        }
                    Le:
                        goto L3e
                    Lf:
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r1.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertMethodTypeInConstantPool()
                        goto L3e
                    L19:
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r1.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertTypeInConstantPool()
                        goto L3e
                    L23:
                        boolean r0 = r2 instanceof net.bytebuddy.jar.asm.Handle
                        if (r0 == 0) goto L31
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r1.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertHandleInConstantPool()
                        goto L3e
                    L31:
                        boolean r0 = r2 instanceof net.bytebuddy.jar.asm.ConstantDynamic
                        if (r0 == 0) goto L3e
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r1.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertDynamicValueInConstantPool()
                    L3e:
                        super.visitLdcInsn(r2)
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public void visitMethodInsn(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
                        r1 = this;
                        if (r6 == 0) goto Lf
                        r0 = 183(0xb7, float:2.56E-43)
                        if (r2 != r0) goto Lf
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r0 = r1.this$0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.access$000(r0)
                        r0.assertDefaultMethodCall()
                    Lf:
                        super.visitMethodInsn(r2, r3, r4, r5, r6)
                        return
                }
            }

            static {
                    return
            }

            public ValidatingClassVisitor(net.bytebuddy.jar.asm.ClassVisitor r2) {
                    r1 = this;
                    int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r1.<init>(r0, r2)
                    return
            }

            public static /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint access$000(net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor r0) {
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = r0.constraint
                    return r0
            }

            public static net.bytebuddy.jar.asm.ClassVisitor of(net.bytebuddy.jar.asm.ClassVisitor r0, net.bytebuddy.dynamic.scaffold.TypeValidation r1) {
                    boolean r1 = r1.isEnabled()
                    if (r1 == 0) goto Lc
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor
                    r1.<init>(r0)
                    r0 = r1
                Lc:
                    return r0
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visit(int r6, int r7, java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r10, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r11) {
                    r5 = this;
                    net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofMinorMajor(r6)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClassFileVersion r2 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClassFileVersion
                    r2.<init>(r0)
                    r1.add(r2)
                    java.lang.String r2 = "/package-info"
                    boolean r2 = r8.endsWith(r2)
                    if (r2 == 0) goto L1f
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForPackageType.INSTANCE
                    r1.add(r0)
                    goto L77
                L1f:
                    r2 = r7 & 8192(0x2000, float:1.148E-41)
                    if (r2 == 0) goto L53
                    net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V5
                    boolean r2 = r0.isAtLeast(r2)
                    if (r2 == 0) goto L3c
                    net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V8
                    boolean r0 = r0.isAtLeast(r2)
                    if (r0 == 0) goto L36
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation.JAVA_8
                    goto L38
                L36:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForAnnotation.CLASSIC
                L38:
                    r1.add(r0)
                    goto L77
                L3c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "Cannot define an annotation type for class file version "
                    r7.append(r8)
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    r6.<init>(r7)
                    throw r6
                L53:
                    r2 = r7 & 512(0x200, float:7.17E-43)
                    if (r2 == 0) goto L68
                    net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V8
                    boolean r0 = r0.isAtLeast(r2)
                    if (r0 == 0) goto L62
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface.JAVA_8
                    goto L64
                L62:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForInterface.CLASSIC
                L64:
                    r1.add(r0)
                    goto L77
                L68:
                    r0 = r7 & 1024(0x400, float:1.435E-42)
                    if (r0 == 0) goto L72
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass.ABSTRACT
                    r1.add(r0)
                    goto L77
                L72:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass.MANIFEST
                    r1.add(r0)
                L77:
                    r0 = 65536(0x10000, float:9.1835E-41)
                    r0 = r0 & r7
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L85
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForRecord.INSTANCE
                    r1.add(r0)
                    r0 = r3
                    goto L86
                L85:
                    r0 = r2
                L86:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$Compound r4 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint$Compound
                    r4.<init>(r1)
                    r5.constraint = r4
                    if (r11 == 0) goto L91
                    r1 = r3
                    goto L92
                L91:
                    r1 = r2
                L92:
                    if (r9 == 0) goto L95
                    r2 = r3
                L95:
                    r4.assertType(r7, r1, r2)
                    if (r0 == 0) goto L9f
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = r5.constraint
                    r0.assertRecord()
                L9f:
                    super.visit(r6, r7, r8, r9, r10, r11)
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = r1.constraint
                    r0.assertAnnotation()
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitAnnotation(r2, r3)
                    return r2
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.FieldVisitor visitField(int r10, java.lang.String r11, java.lang.String r12, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r13, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r14) {
                    r9 = this;
                    r0 = 1
                    r1 = 0
                    if (r14 == 0) goto Lc5
                    char r2 = r12.charAt(r1)
                    r3 = 70
                    java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
                    r5 = 90
                    r6 = 83
                    if (r2 == r3) goto L4b
                    if (r2 == r6) goto L49
                    if (r2 == r5) goto L49
                    r3 = 73
                    if (r2 == r3) goto L49
                    r3 = 74
                    if (r2 == r3) goto L46
                    switch(r2) {
                        case 66: goto L49;
                        case 67: goto L49;
                        case 68: goto L43;
                        default: goto L21;
                    }
                L21:
                    java.lang.String r2 = "Ljava/lang/String;"
                    boolean r2 = r12.equals(r2)
                    if (r2 == 0) goto L2c
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    goto L4d
                L2c:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    java.lang.String r13 = "Cannot define a default value for type of field "
                    r12.append(r13)
                    r12.append(r11)
                    java.lang.String r11 = r12.toString()
                    r10.<init>(r11)
                    throw r10
                L43:
                    java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
                    goto L4d
                L46:
                    java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
                    goto L4d
                L49:
                    r2 = r4
                    goto L4d
                L4b:
                    java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
                L4d:
                    boolean r3 = r2.isInstance(r14)
                    java.lang.String r7 = " defines an incompatible default value "
                    java.lang.String r8 = "Field "
                    if (r3 == 0) goto Laa
                    if (r2 != r4) goto Lc5
                    char r2 = r12.charAt(r1)
                    r3 = 66
                    if (r2 == r3) goto L7b
                    r3 = 67
                    if (r2 == r3) goto L77
                    if (r2 == r6) goto L72
                    if (r2 == r5) goto L6f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = 2147483647(0x7fffffff, float:NaN)
                    goto L7f
                L6f:
                    r3 = r0
                L70:
                    r2 = r1
                    goto L7f
                L72:
                    r2 = -32768(0xffffffffffff8000, float:NaN)
                    r3 = 32767(0x7fff, float:4.5916E-41)
                    goto L7f
                L77:
                    r3 = 65535(0xffff, float:9.1834E-41)
                    goto L70
                L7b:
                    r2 = -128(0xffffffffffffff80, float:NaN)
                    r3 = 127(0x7f, float:1.78E-43)
                L7f:
                    r4 = r14
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r5 = r4.intValue()
                    if (r5 < r2) goto L8f
                    int r2 = r4.intValue()
                    if (r2 > r3) goto L8f
                    goto Lc5
                L8f:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    r12.append(r8)
                    r12.append(r11)
                    r12.append(r7)
                    r12.append(r14)
                    java.lang.String r11 = r12.toString()
                    r10.<init>(r11)
                    throw r10
                Laa:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    r12.append(r8)
                    r12.append(r11)
                    r12.append(r7)
                    r12.append(r14)
                    java.lang.String r11 = r12.toString()
                    r10.<init>(r11)
                    throw r10
                Lc5:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r2 = r9.constraint
                    r3 = r10 & 1
                    if (r3 == 0) goto Lcd
                    r3 = r0
                    goto Lce
                Lcd:
                    r3 = r1
                Lce:
                    r4 = r10 & 8
                    if (r4 == 0) goto Ld4
                    r4 = r0
                    goto Ld5
                Ld4:
                    r4 = r1
                Ld5:
                    r5 = r10 & 16
                    if (r5 == 0) goto Ldb
                    r5 = r0
                    goto Ldc
                Ldb:
                    r5 = r1
                Ldc:
                    if (r13 == 0) goto Le0
                    r6 = r0
                    goto Le1
                Le0:
                    r6 = r1
                Le1:
                    r0 = r2
                    r1 = r11
                    r2 = r3
                    r3 = r4
                    r4 = r5
                    r5 = r6
                    r0.assertField(r1, r2, r3, r4, r5)
                    net.bytebuddy.jar.asm.FieldVisitor r10 = super.visitField(r10, r11, r12, r13, r14)
                    if (r10 != 0) goto Lf3
                    net.bytebuddy.jar.asm.FieldVisitor r10 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.IGNORE_FIELD
                    goto Lf9
                Lf3:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$ValidatingFieldVisitor r11 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$ValidatingFieldVisitor
                    r11.<init>(r9, r10)
                    r10 = r11
                Lf9:
                    return r10
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r17, java.lang.String r18, java.lang.String r19, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r20, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r21) {
                    r16 = this;
                    r0 = r16
                    r1 = r17
                    r12 = r18
                    r13 = r19
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r2 = r0.constraint
                    r3 = r1 & 1024(0x400, float:1.435E-42)
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto L12
                    r6 = r5
                    goto L13
                L12:
                    r6 = r4
                L13:
                    r3 = r1 & 1
                    if (r3 == 0) goto L19
                    r7 = r5
                    goto L1a
                L19:
                    r7 = r4
                L1a:
                    r3 = r1 & 2
                    if (r3 == 0) goto L20
                    r8 = r5
                    goto L21
                L20:
                    r8 = r4
                L21:
                    r3 = r1 & 8
                    if (r3 == 0) goto L27
                    r9 = r5
                    goto L28
                L27:
                    r9 = r4
                L28:
                    java.lang.String r3 = "<init>"
                    boolean r10 = r12.equals(r3)
                    if (r10 != 0) goto L3e
                    java.lang.String r10 = "<clinit>"
                    boolean r10 = r12.equals(r10)
                    if (r10 != 0) goto L3e
                    r10 = r1 & 10
                    if (r10 != 0) goto L3e
                    r10 = r5
                    goto L3f
                L3e:
                    r10 = r4
                L3f:
                    boolean r11 = r12.equals(r3)
                    java.lang.String r3 = "()"
                    boolean r3 = r13.startsWith(r3)
                    if (r3 == 0) goto L56
                    java.lang.String r3 = "V"
                    boolean r3 = r13.endsWith(r3)
                    if (r3 == 0) goto L54
                    goto L56
                L54:
                    r14 = r4
                    goto L57
                L56:
                    r14 = r5
                L57:
                    if (r20 == 0) goto L5b
                    r15 = r5
                    goto L5c
                L5b:
                    r15 = r4
                L5c:
                    r3 = r18
                    r4 = r6
                    r5 = r7
                    r6 = r8
                    r7 = r9
                    r8 = r10
                    r9 = r11
                    r10 = r14
                    r11 = r15
                    r2.assertMethod(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    net.bytebuddy.jar.asm.MethodVisitor r1 = super.visitMethod(r17, r18, r19, r20, r21)
                    if (r1 != 0) goto L72
                    net.bytebuddy.jar.asm.MethodVisitor r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.IGNORE_METHOD
                    goto L78
                L72:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$ValidatingMethodVisitor r2 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$ValidatingMethodVisitor
                    r2.<init>(r0, r1, r12)
                    r1 = r2
                L78:
                    return r1
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visitNestHost(java.lang.String r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = r1.constraint
                    r0.assertNestMate()
                    super.visitNestHost(r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visitNestMember(java.lang.String r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = r1.constraint
                    r0.assertNestMate()
                    super.visitNestMember(r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visitPermittedSubclass(java.lang.String r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = r1.constraint
                    r0.assertPermittedSubclass()
                    super.visitPermittedSubclass(r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint r0 = r1.constraint
                    r0.assertTypeAnnotation()
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTypeAnnotation(r2, r3, r4, r5)
                    return r2
            }
        }

        static {
                r0 = 0
                r1 = 0
                java.lang.String r2 = "java.security.AccessController"
                java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r2 = "net.bytebuddy.securitymanager"
                java.lang.String r3 = "true"
                java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ACCESS_CONTROLLER = r2     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ACCESS_CONTROLLER = r0
            L19:
                net.bytebuddy.dynamic.scaffold.TypeWriter.Default.NO_REFERENCE = r1
                net.bytebuddy.utility.privilege.GetSystemPropertyAction r0 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction     // Catch: java.lang.RuntimeException -> L29
                java.lang.String r2 = "net.bytebuddy.dump"
                r0.<init>(r2)     // Catch: java.lang.RuntimeException -> L29
                java.lang.Object r0 = doPrivileged(r0)     // Catch: java.lang.RuntimeException -> L29
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.RuntimeException -> L29
                r1 = r0
            L29:
                net.bytebuddy.dynamic.scaffold.TypeWriter.Default.DUMP_FOLDER = r1
                return
        }

        public Default(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.ClassFileVersion r4, net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool r5, net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool r6, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r7, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r8, net.bytebuddy.description.method.MethodList<?> r9, net.bytebuddy.description.method.MethodList<?> r10, net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> r11, net.bytebuddy.implementation.LoadedTypeInitializer r12, net.bytebuddy.dynamic.scaffold.TypeInitializer r13, net.bytebuddy.implementation.attribute.TypeAttributeAppender r14, net.bytebuddy.asm.AsmVisitorWrapper r15, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r16, net.bytebuddy.implementation.attribute.AnnotationRetention r17, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r18, net.bytebuddy.implementation.Implementation.Context.Factory r19, net.bytebuddy.dynamic.scaffold.TypeValidation r20, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r21, net.bytebuddy.pool.TypePool r22) {
                r2 = this;
                r0 = r2
                r2.<init>()
                r1 = r3
                r0.instrumentedType = r1
                r1 = r4
                r0.classFileVersion = r1
                r1 = r5
                r0.fieldPool = r1
                r1 = r6
                r0.recordComponentPool = r1
                r1 = r7
                r0.auxiliaryTypes = r1
                r1 = r8
                r0.fields = r1
                r1 = r9
                r0.methods = r1
                r1 = r10
                r0.instrumentedMethods = r1
                r1 = r11
                r0.recordComponents = r1
                r1 = r12
                r0.loadedTypeInitializer = r1
                r1 = r13
                r0.typeInitializer = r1
                r1 = r14
                r0.typeAttributeAppender = r1
                r1 = r15
                r0.asmVisitorWrapper = r1
                r1 = r18
                r0.auxiliaryTypeNamingStrategy = r1
                r1 = r16
                r0.annotationValueFilterFactory = r1
                r1 = r17
                r0.annotationRetention = r1
                r1 = r19
                r0.implementationContextFactory = r1
                r1 = r20
                r0.typeValidation = r1
                r1 = r21
                r0.classWriterStrategy = r1
                r1 = r22
                r0.typePool = r1
                return
        }

        public static /* synthetic */ java.lang.Object access$1400(java.security.PrivilegedExceptionAction r0) throws java.lang.Exception {
                java.lang.Object r0 = doPrivileged(r0)
                return r0
        }

        public static /* synthetic */ java.lang.String access$300() {
                java.lang.String r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.NO_REFERENCE
                return r0
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedExceptionAction<T> r1) throws java.lang.Exception {
                boolean r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static <U> net.bytebuddy.dynamic.scaffold.TypeWriter<U> forCreation(net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled r23, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r24, net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool r25, net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool r26, net.bytebuddy.implementation.attribute.TypeAttributeAppender r27, net.bytebuddy.asm.AsmVisitorWrapper r28, net.bytebuddy.ClassFileVersion r29, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r30, net.bytebuddy.implementation.attribute.AnnotationRetention r31, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r32, net.bytebuddy.implementation.Implementation.Context.Factory r33, net.bytebuddy.dynamic.scaffold.TypeValidation r34, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r35, net.bytebuddy.pool.TypePool r36) {
                r4 = r23
                r6 = r24
                r3 = r25
                r5 = r26
                r13 = r27
                r14 = r28
                r2 = r29
                r15 = r30
                r16 = r31
                r17 = r32
                r18 = r33
                r19 = r34
                r20 = r35
                r21 = r36
                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation r22 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation
                r0 = r22
                net.bytebuddy.description.type.TypeDescription r1 = r23.getInstrumentedType()
                net.bytebuddy.description.type.TypeDescription r7 = r23.getInstrumentedType()
                net.bytebuddy.description.field.FieldList r7 = r7.getDeclaredFields()
                net.bytebuddy.description.method.MethodList r8 = r23.getMethods()
                net.bytebuddy.description.method.MethodList r9 = r23.getInstrumentedMethods()
                net.bytebuddy.description.type.TypeDescription r10 = r23.getInstrumentedType()
                net.bytebuddy.description.type.RecordComponentList r10 = r10.getRecordComponents()
                net.bytebuddy.implementation.LoadedTypeInitializer r11 = r23.getLoadedTypeInitializer()
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r23.getTypeInitializer()
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return r22
        }

        public static <U> net.bytebuddy.dynamic.scaffold.TypeWriter<U> forDecoration(net.bytebuddy.description.type.TypeDescription r16, net.bytebuddy.ClassFileVersion r17, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r18, java.util.List<? extends net.bytebuddy.description.method.MethodDescription> r19, net.bytebuddy.implementation.attribute.TypeAttributeAppender r20, net.bytebuddy.asm.AsmVisitorWrapper r21, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r22, net.bytebuddy.implementation.attribute.AnnotationRetention r23, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r24, net.bytebuddy.implementation.Implementation.Context.Factory r25, net.bytebuddy.dynamic.scaffold.TypeValidation r26, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r27, net.bytebuddy.pool.TypePool r28, net.bytebuddy.dynamic.ClassFileLocator r29) {
                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly r15 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithDecorationOnly
                net.bytebuddy.description.method.MethodList$Explicit r4 = new net.bytebuddy.description.method.MethodList$Explicit
                r0 = r19
                r4.<init>(r0)
                r0 = r15
                r1 = r16
                r2 = r17
                r3 = r18
                r5 = r20
                r6 = r21
                r7 = r22
                r8 = r23
                r9 = r24
                r10 = r25
                r11 = r26
                r12 = r27
                r13 = r28
                r14 = r29
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return r15
        }

        public static <U> net.bytebuddy.dynamic.scaffold.TypeWriter<U> forRebasing(net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared r27, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r28, net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool r29, net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool r30, net.bytebuddy.implementation.attribute.TypeAttributeAppender r31, net.bytebuddy.asm.AsmVisitorWrapper r32, net.bytebuddy.ClassFileVersion r33, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r34, net.bytebuddy.implementation.attribute.AnnotationRetention r35, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r36, net.bytebuddy.implementation.Implementation.Context.Factory r37, net.bytebuddy.dynamic.scaffold.TypeValidation r38, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r39, net.bytebuddy.pool.TypePool r40, net.bytebuddy.description.type.TypeDescription r41, net.bytebuddy.dynamic.ClassFileLocator r42, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r43) {
                r23 = r27
                r3 = r29
                r4 = r30
                r12 = r31
                r13 = r32
                r2 = r33
                r14 = r34
                r15 = r35
                r16 = r36
                r17 = r37
                r18 = r38
                r19 = r39
                r20 = r40
                r21 = r41
                r22 = r42
                r25 = r43
                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r26 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing
                r0 = r26
                net.bytebuddy.description.type.TypeDescription r1 = r27.getInstrumentedType()
                java.util.List r5 = r43.getAuxiliaryTypes()
                r6 = r28
                java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r6, r5)
                net.bytebuddy.description.type.TypeDescription r6 = r27.getInstrumentedType()
                net.bytebuddy.description.field.FieldList r6 = r6.getDeclaredFields()
                net.bytebuddy.description.method.MethodList r7 = r27.getMethods()
                net.bytebuddy.description.method.MethodList r8 = r27.getInstrumentedMethods()
                net.bytebuddy.description.type.TypeDescription r9 = r27.getInstrumentedType()
                net.bytebuddy.description.type.RecordComponentList r9 = r9.getRecordComponents()
                net.bytebuddy.implementation.LoadedTypeInitializer r10 = r27.getLoadedTypeInitializer()
                net.bytebuddy.dynamic.scaffold.TypeInitializer r11 = r27.getTypeInitializer()
                r29 = r0
                net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget$Factory r0 = new net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget$Factory
                r24 = r0
                r30 = r1
                r1 = r43
                r0.<init>(r1)
                r0 = r29
                r1 = r30
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                return r26
        }

        public static <U> net.bytebuddy.dynamic.scaffold.TypeWriter<U> forRedefinition(net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared r27, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r28, net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool r29, net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool r30, net.bytebuddy.implementation.attribute.TypeAttributeAppender r31, net.bytebuddy.asm.AsmVisitorWrapper r32, net.bytebuddy.ClassFileVersion r33, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r34, net.bytebuddy.implementation.attribute.AnnotationRetention r35, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r36, net.bytebuddy.implementation.Implementation.Context.Factory r37, net.bytebuddy.dynamic.scaffold.TypeValidation r38, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r39, net.bytebuddy.pool.TypePool r40, net.bytebuddy.description.type.TypeDescription r41, net.bytebuddy.dynamic.ClassFileLocator r42) {
                r23 = r27
                r5 = r28
                r3 = r29
                r4 = r30
                r12 = r31
                r13 = r32
                r2 = r33
                r14 = r34
                r15 = r35
                r16 = r36
                r17 = r37
                r18 = r38
                r19 = r39
                r20 = r40
                r21 = r41
                r22 = r42
                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing r26 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing
                r0 = r26
                net.bytebuddy.description.type.TypeDescription r1 = r27.getInstrumentedType()
                net.bytebuddy.description.type.TypeDescription r6 = r27.getInstrumentedType()
                net.bytebuddy.description.field.FieldList r6 = r6.getDeclaredFields()
                net.bytebuddy.description.method.MethodList r7 = r27.getMethods()
                net.bytebuddy.description.method.MethodList r8 = r27.getInstrumentedMethods()
                net.bytebuddy.description.type.TypeDescription r9 = r27.getInstrumentedType()
                net.bytebuddy.description.type.RecordComponentList r9 = r9.getRecordComponents()
                net.bytebuddy.implementation.LoadedTypeInitializer r10 = r27.getLoadedTypeInitializer()
                net.bytebuddy.dynamic.scaffold.TypeInitializer r11 = r27.getTypeInitializer()
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory r24 = net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory.LEVEL_TYPE
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Disabled r25 = net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled.INSTANCE
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                return r26
        }

        public abstract net.bytebuddy.dynamic.scaffold.TypeWriter.Default<S>.UnresolvedType create(net.bytebuddy.dynamic.scaffold.TypeInitializer r1, net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher r2);

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
                net.bytebuddy.implementation.attribute.AnnotationRetention r2 = r4.annotationRetention
                net.bytebuddy.dynamic.scaffold.TypeWriter$Default r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.Default) r5
                net.bytebuddy.implementation.attribute.AnnotationRetention r3 = r5.annotationRetention
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.dynamic.scaffold.TypeValidation r2 = r4.typeValidation
                net.bytebuddy.dynamic.scaffold.TypeValidation r3 = r5.typeValidation
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                net.bytebuddy.ClassFileVersion r2 = r4.classFileVersion
                net.bytebuddy.ClassFileVersion r3 = r5.classFileVersion
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L41
                return r1
            L41:
                net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool r2 = r4.fieldPool
                net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool r3 = r5.fieldPool
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4c
                return r1
            L4c:
                net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool r2 = r4.recordComponentPool
                net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool r3 = r5.recordComponentPool
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L57
                return r1
            L57:
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r2 = r4.auxiliaryTypes
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r3 = r5.auxiliaryTypes
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L62
                return r1
            L62:
                net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.fields
                net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.fields
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6d
                return r1
            L6d:
                net.bytebuddy.description.method.MethodList<?> r2 = r4.methods
                net.bytebuddy.description.method.MethodList<?> r3 = r5.methods
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L78
                return r1
            L78:
                net.bytebuddy.description.method.MethodList<?> r2 = r4.instrumentedMethods
                net.bytebuddy.description.method.MethodList<?> r3 = r5.instrumentedMethods
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L83
                return r1
            L83:
                net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape> r2 = r4.recordComponents
                net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape> r3 = r5.recordComponents
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L8e
                return r1
            L8e:
                net.bytebuddy.implementation.LoadedTypeInitializer r2 = r4.loadedTypeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r3 = r5.loadedTypeInitializer
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L99
                return r1
            L99:
                net.bytebuddy.dynamic.scaffold.TypeInitializer r2 = r4.typeInitializer
                net.bytebuddy.dynamic.scaffold.TypeInitializer r3 = r5.typeInitializer
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto La4
                return r1
            La4:
                net.bytebuddy.implementation.attribute.TypeAttributeAppender r2 = r4.typeAttributeAppender
                net.bytebuddy.implementation.attribute.TypeAttributeAppender r3 = r5.typeAttributeAppender
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Laf
                return r1
            Laf:
                net.bytebuddy.asm.AsmVisitorWrapper r2 = r4.asmVisitorWrapper
                net.bytebuddy.asm.AsmVisitorWrapper r3 = r5.asmVisitorWrapper
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Lba
                return r1
            Lba:
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r4.annotationValueFilterFactory
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r5.annotationValueFilterFactory
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Lc5
                return r1
            Lc5:
                net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r2 = r4.auxiliaryTypeNamingStrategy
                net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r5.auxiliaryTypeNamingStrategy
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Ld0
                return r1
            Ld0:
                net.bytebuddy.implementation.Implementation$Context$Factory r2 = r4.implementationContextFactory
                net.bytebuddy.implementation.Implementation$Context$Factory r3 = r5.implementationContextFactory
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Ldb
                return r1
            Ldb:
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r2 = r4.classWriterStrategy
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r3 = r5.classWriterStrategy
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Le6
                return r1
            Le6:
                net.bytebuddy.pool.TypePool r2 = r4.typePool
                net.bytebuddy.pool.TypePool r5 = r5.typePool
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto Lf1
                return r1
            Lf1:
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
                net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool r1 = r2.fieldPool
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool r1 = r2.recordComponentPool
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1 = r2.auxiliaryTypes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.fields
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.method.MethodList<?> r1 = r2.methods
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.method.MethodList<?> r1 = r2.instrumentedMethods
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape> r1 = r2.recordComponents
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.LoadedTypeInitializer r1 = r2.loadedTypeInitializer
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.dynamic.scaffold.TypeInitializer r1 = r2.typeInitializer
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.attribute.TypeAttributeAppender r1 = r2.typeAttributeAppender
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.asm.AsmVisitorWrapper r1 = r2.asmVisitorWrapper
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r1 = r2.annotationValueFilterFactory
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.attribute.AnnotationRetention r1 = r2.annotationRetention
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r1 = r2.auxiliaryTypeNamingStrategy
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.Implementation$Context$Factory r1 = r2.implementationContextFactory
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.dynamic.scaffold.TypeValidation r1 = r2.typeValidation
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r2.classWriterStrategy
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.pool.TypePool r1 = r2.typePool
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeWriter
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Setting a debugging property should never change the program outcome.", value = {"REC_CATCH_EXCEPTION"})
        public net.bytebuddy.dynamic.DynamicType.Unloaded<S> make(net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved r6) {
                r5 = this;
                java.lang.String r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.DUMP_FOLDER
                if (r0 != 0) goto L7
                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Disabled r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher.Disabled.INSTANCE
                goto L11
            L7:
                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Enabled r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ClassDumpAction$Dispatcher$Enabled
                long r2 = java.lang.System.currentTimeMillis()
                r1.<init>(r0, r2)
                r0 = r1
            L11:
                net.bytebuddy.dynamic.scaffold.TypeInitializer r1 = r5.typeInitializer
                net.bytebuddy.dynamic.scaffold.TypeInitializer r1 = r6.injectedInto(r1)
                net.bytebuddy.dynamic.scaffold.TypeWriter$Default$UnresolvedType r1 = r5.create(r1, r0)
                net.bytebuddy.description.type.TypeDescription r2 = r5.instrumentedType
                byte[] r3 = r1.getBinaryRepresentation()
                r4 = 0
                r0.dump(r2, r4, r3)
                net.bytebuddy.dynamic.DynamicType$Unloaded r6 = r1.toDynamicType(r6)
                return r6
        }
    }

    public interface FieldPool {

        public enum Disabled extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled> implements net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Disabled r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Disabled
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Disabled[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled[]{r0}
                    net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled.$VALUES = r0
                    return
            }

            Disabled(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Disabled> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Disabled r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled[] values() {
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Disabled[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Disabled[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Disabled[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record target(net.bytebuddy.description.field.FieldDescription r2) {
                    r1 = this;
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Cannot look up field from disabled pool"
                    r2.<init>(r0)
                    throw r2
            }
        }

        public interface Record {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitField implements net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record {
                private final net.bytebuddy.implementation.attribute.FieldAttributeAppender attributeAppender;

                @net.bytebuddy.utility.nullability.MaybeNull
                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final java.lang.Object defaultValue;
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                public ForExplicitField(net.bytebuddy.implementation.attribute.FieldAttributeAppender r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2, net.bytebuddy.description.field.FieldDescription r3) {
                        r0 = this;
                        r0.<init>()
                        r0.attributeAppender = r1
                        r0.defaultValue = r2
                        r0.fieldDescription = r3
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public void apply(net.bytebuddy.jar.asm.ClassVisitor r8, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r9) {
                        r7 = this;
                        net.bytebuddy.description.field.FieldDescription r0 = r7.fieldDescription
                        int r2 = r0.getActualModifiers()
                        net.bytebuddy.description.field.FieldDescription r0 = r7.fieldDescription
                        java.lang.String r3 = r0.getInternalName()
                        net.bytebuddy.description.field.FieldDescription r0 = r7.fieldDescription
                        java.lang.String r4 = r0.getDescriptor()
                        net.bytebuddy.description.field.FieldDescription r0 = r7.fieldDescription
                        java.lang.String r5 = r0.getGenericSignature()
                        java.lang.Object r0 = net.bytebuddy.description.field.FieldDescription.NO_DEFAULT_VALUE
                        java.lang.Object r6 = r7.resolveDefault(r0)
                        r1 = r8
                        net.bytebuddy.jar.asm.FieldVisitor r8 = r1.visitField(r2, r3, r4, r5, r6)
                        if (r8 == 0) goto L33
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r0 = r7.attributeAppender
                        net.bytebuddy.description.field.FieldDescription r1 = r7.fieldDescription
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter r9 = r9.on(r1)
                        r0.apply(r8, r1, r9)
                        r8.visitEnd()
                    L33:
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public void apply(net.bytebuddy.jar.asm.FieldVisitor r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4) {
                        r2 = this;
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r0 = r2.attributeAppender
                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter r4 = r4.on(r1)
                        r0.apply(r3, r1, r4)
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
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r2 = r4.attributeAppender
                        net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record$ForExplicitField r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record.ForExplicitField) r5
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r3 = r5.attributeAppender
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.Object r2 = r4.defaultValue
                        java.lang.Object r3 = r5.defaultValue
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
                        net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                        net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L3d
                        return r1
                    L3d:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public net.bytebuddy.description.field.FieldDescription getField() {
                        r1 = this;
                        net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public net.bytebuddy.implementation.attribute.FieldAttributeAppender getFieldAppender() {
                        r1 = this;
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r0 = r1.attributeAppender
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r1 = r2.attributeAppender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.Object r1 = r2.defaultValue
                        if (r1 == 0) goto L1c
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                    L1c:
                        int r0 = r0 * 31
                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public boolean isImplicit() {
                        r1 = this;
                        r0 = 0
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.Object resolveDefault(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                        r1 = this;
                        java.lang.Object r0 = r1.defaultValue
                        if (r0 != 0) goto L5
                        goto L6
                    L5:
                        r2 = r0
                    L6:
                        return r2
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForImplicitField implements net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                public ForImplicitField(net.bytebuddy.description.field.FieldDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldDescription = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public void apply(net.bytebuddy.jar.asm.ClassVisitor r8, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r9) {
                        r7 = this;
                        net.bytebuddy.description.field.FieldDescription r0 = r7.fieldDescription
                        int r2 = r0.getActualModifiers()
                        net.bytebuddy.description.field.FieldDescription r0 = r7.fieldDescription
                        java.lang.String r3 = r0.getInternalName()
                        net.bytebuddy.description.field.FieldDescription r0 = r7.fieldDescription
                        java.lang.String r4 = r0.getDescriptor()
                        net.bytebuddy.description.field.FieldDescription r0 = r7.fieldDescription
                        java.lang.String r5 = r0.getGenericSignature()
                        java.lang.Object r6 = net.bytebuddy.description.field.FieldDescription.NO_DEFAULT_VALUE
                        r1 = r8
                        net.bytebuddy.jar.asm.FieldVisitor r8 = r1.visitField(r2, r3, r4, r5, r6)
                        if (r8 == 0) goto L2f
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField r0 = net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField.INSTANCE
                        net.bytebuddy.description.field.FieldDescription r1 = r7.fieldDescription
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter r9 = r9.on(r1)
                        r0.apply(r8, r1, r9)
                        r8.visitEnd()
                    L2f:
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public void apply(net.bytebuddy.jar.asm.FieldVisitor r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r0 = "An implicit field record is not intended for partial application: "
                        r3.append(r0)
                        r3.append(r1)
                        java.lang.String r3 = r3.toString()
                        r2.<init>(r3)
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
                        net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                        net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record$ForImplicitField r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record.ForImplicitField) r5
                        net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public net.bytebuddy.description.field.FieldDescription getField() {
                        r1 = this;
                        net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public net.bytebuddy.implementation.attribute.FieldAttributeAppender getFieldAppender() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "An implicit field record does not expose a field appender: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
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

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public boolean isImplicit() {
                        r1 = this;
                        r0 = 1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record
                public java.lang.Object resolveDefault(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
                        r2 = this;
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "An implicit field record does not expose a default value: "
                        r0.append(r1)
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        r3.<init>(r0)
                        throw r3
                }
            }

            void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2);

            void apply(net.bytebuddy.jar.asm.FieldVisitor r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2);

            net.bytebuddy.description.field.FieldDescription getField();

            net.bytebuddy.implementation.attribute.FieldAttributeAppender getFieldAppender();

            boolean isImplicit();

            @net.bytebuddy.utility.nullability.MaybeNull
            java.lang.Object resolveDefault(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r1);
        }

        net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record target(net.bytebuddy.description.field.FieldDescription r1);
    }

    public interface MethodPool {

        public interface Record {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class AccessBridgeWrapper implements net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record {
                private final net.bytebuddy.implementation.attribute.MethodAttributeAppender attributeAppender;
                private final net.bytebuddy.description.method.MethodDescription bridgeTarget;
                private final java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> bridgeTypes;
                private final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record delegate;
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                public static class AccessorBridge extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
                    private final net.bytebuddy.description.method.MethodDescription bridgeTarget;
                    private final net.bytebuddy.description.method.MethodDescription.TypeToken bridgeType;
                    private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                    public AccessorBridge(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription.TypeToken r2, net.bytebuddy.description.type.TypeDescription r3) {
                            r0 = this;
                            r0.<init>()
                            r0.bridgeTarget = r1
                            r0.bridgeType = r2
                            r0.instrumentedType = r3
                            return
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                            r0.<init>()
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                    @javax.annotation.Nonnull
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                    @javax.annotation.Nonnull
                    public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription
                    public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                            r2 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r2.bridgeTarget
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$TypeErasing r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.TypeErasing.INSTANCE
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.accept(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                    public java.lang.String getInternalName() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            java.lang.String r0 = r0.getInternalName()
                            return r0
                    }

                    @Override // net.bytebuddy.description.ModifierReviewable
                    public int getModifiers() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            int r0 = r0.getModifiers()
                            r0 = r0 | 4160(0x1040, float:5.83E-42)
                            r0 = r0 & (-1281(0xfffffffffffffaff, float:NaN))
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                    public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                            r2 = this;
                            net.bytebuddy.description.method.ParameterList$Explicit$ForTypes r0 = new net.bytebuddy.description.method.ParameterList$Explicit$ForTypes
                            net.bytebuddy.description.method.MethodDescription$TypeToken r1 = r2.bridgeType
                            java.util.List r1 = r1.getParameterTypes()
                            r0.<init>(r2, r1)
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription
                    public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r1.bridgeType
                            net.bytebuddy.description.type.TypeDescription r0 = r0.getReturnType()
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                            return r0
                    }

                    @Override // net.bytebuddy.description.TypeVariableSource
                    public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                            r0.<init>()
                            return r0
                    }
                }

                public static class BridgeTarget extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
                    private final net.bytebuddy.description.method.MethodDescription bridgeTarget;
                    private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                    public BridgeTarget(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            r0.<init>()
                            r0.bridgeTarget = r1
                            r0.instrumentedType = r2
                            return
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                    @javax.annotation.Nonnull
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                    @javax.annotation.Nonnull
                    public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            net.bytebuddy.description.annotation.AnnotationValue r0 = r0.getDefaultValue()
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription
                    public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                            return r0
                    }

                    @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                    public java.lang.String getInternalName() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            java.lang.String r0 = r0.getInternalName()
                            return r0
                    }

                    @Override // net.bytebuddy.description.ModifierReviewable
                    public int getModifiers() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            int r0 = r0.getModifiers()
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                    public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                            r3 = this;
                            net.bytebuddy.description.method.ParameterList$ForTokens r0 = new net.bytebuddy.description.method.ParameterList$ForTokens
                            net.bytebuddy.description.method.MethodDescription r1 = r3.bridgeTarget
                            net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                            net.bytebuddy.description.type.TypeDescription r2 = r3.instrumentedType
                            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.is(r2)
                            net.bytebuddy.description.ByteCodeElement$Token$TokenList r1 = r1.asTokenList(r2)
                            r0.<init>(r3, r1)
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.MethodDescription
                    public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                            return r0
                    }

                    @Override // net.bytebuddy.description.TypeVariableSource
                    public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.getTypeVariables()
                            return r0
                    }
                }

                public AccessBridgeWrapper(net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3, java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> r4, net.bytebuddy.implementation.attribute.MethodAttributeAppender r5) {
                        r0 = this;
                        r0.<init>()
                        r0.delegate = r1
                        r0.instrumentedType = r2
                        r0.bridgeTarget = r3
                        r0.bridgeTypes = r4
                        r0.attributeAppender = r5
                        return
                }

                public static net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record of(net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r6, net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.description.method.MethodDescription r8, java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> r9, net.bytebuddy.implementation.attribute.MethodAttributeAppender r10) {
                        java.util.HashSet r4 = new java.util.HashSet
                        r4.<init>()
                        java.util.Iterator r9 = r9.iterator()
                    L9:
                        boolean r0 = r9.hasNext()
                        if (r0 == 0) goto L1f
                        java.lang.Object r0 = r9.next()
                        net.bytebuddy.description.method.MethodDescription$TypeToken r0 = (net.bytebuddy.description.method.MethodDescription.TypeToken) r0
                        boolean r1 = r8.isBridgeCompatible(r0)
                        if (r1 == 0) goto L9
                        r4.add(r0)
                        goto L9
                    L1f:
                        boolean r9 = r4.isEmpty()
                        if (r9 != 0) goto L41
                        boolean r9 = r7.isInterface()
                        if (r9 == 0) goto L36
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r9 = r6.getSort()
                        boolean r9 = r9.isImplemented()
                        if (r9 != 0) goto L36
                        goto L41
                    L36:
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper r9 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper
                        r0 = r9
                        r1 = r6
                        r2 = r7
                        r3 = r8
                        r5 = r10
                        r0.<init>(r1, r2, r3, r4, r5)
                        r6 = r9
                    L41:
                        return r6
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void apply(net.bytebuddy.jar.asm.ClassVisitor r12, net.bytebuddy.implementation.Implementation.Context r13, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r14) {
                        r11 = this;
                        r0 = 1
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r1 = r11.delegate
                        r1.apply(r12, r13, r14)
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r1 = r11.bridgeTypes
                        java.util.Iterator r1 = r1.iterator()
                    Lc:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto Lc7
                        java.lang.Object r2 = r1.next()
                        net.bytebuddy.description.method.MethodDescription$TypeToken r2 = (net.bytebuddy.description.method.MethodDescription.TypeToken) r2
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper$AccessorBridge r3 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper$AccessorBridge
                        net.bytebuddy.description.method.MethodDescription r4 = r11.bridgeTarget
                        net.bytebuddy.description.type.TypeDescription r5 = r11.instrumentedType
                        r3.<init>(r4, r2, r5)
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper$BridgeTarget r2 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper$BridgeTarget
                        net.bytebuddy.description.method.MethodDescription r4 = r11.bridgeTarget
                        net.bytebuddy.description.type.TypeDescription r5 = r11.instrumentedType
                        r2.<init>(r4, r5)
                        net.bytebuddy.description.modifier.Visibility r4 = r11.getVisibility()
                        int r6 = r3.getActualModifiers(r0, r4)
                        java.lang.String r7 = r3.getInternalName()
                        java.lang.String r8 = r3.getDescriptor()
                        java.lang.String r9 = net.bytebuddy.description.NamedElement.WithDescriptor.NON_GENERIC_SIGNATURE
                        net.bytebuddy.description.type.TypeList$Generic r4 = r3.getExceptionTypes()
                        net.bytebuddy.description.type.TypeList r4 = r4.asErasures()
                        java.lang.String[] r10 = r4.toInternalNames()
                        r5 = r12
                        net.bytebuddy.jar.asm.MethodVisitor r4 = r5.visitMethod(r6, r7, r8, r9, r10)
                        if (r4 == 0) goto Lc
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r5 = r11.attributeAppender
                        net.bytebuddy.description.type.TypeDescription r6 = r11.instrumentedType
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter r6 = r14.on(r6)
                        r5.apply(r4, r3, r6)
                        r4.visitCode()
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r5 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r6 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r3)
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r6 = r6.asBridgeOf(r2)
                        net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.prependThisReference()
                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r7 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                        net.bytebuddy.description.type.TypeDescription r8 = r11.instrumentedType
                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.virtual(r8)
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getReturnType()
                        net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                        net.bytebuddy.description.type.TypeDescription$Generic r8 = r3.getReturnType()
                        net.bytebuddy.description.type.TypeDescription r8 = r8.asErasure()
                        boolean r2 = r2.isAssignableTo(r8)
                        if (r2 == 0) goto L8e
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto L9a
                    L8e:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.getReturnType()
                        net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r2)
                    L9a:
                        net.bytebuddy.description.type.TypeDescription$Generic r8 = r3.getReturnType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r8 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r8)
                        r9 = 4
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r9 = new net.bytebuddy.implementation.bytecode.StackManipulation[r9]
                        r10 = 0
                        r9[r10] = r6
                        r9[r0] = r7
                        r6 = 2
                        r9[r6] = r2
                        r2 = 3
                        r9[r2] = r8
                        r5.<init>(r9)
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r5.apply(r4, r13, r3)
                        int r3 = r2.getOperandStackSize()
                        int r2 = r2.getLocalVariableSize()
                        r4.visitMaxs(r3, r2)
                        r4.visitEnd()
                        goto Lc
                    Lc7:
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyAttributes(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r1.delegate
                        r0.applyAttributes(r2, r3)
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyBody(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4) {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r1.delegate
                        r0.applyBody(r2, r3, r4)
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size applyCode(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r1.delegate
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r0.applyCode(r2, r3)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyHead(net.bytebuddy.jar.asm.MethodVisitor r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r1.delegate
                        r0.applyHead(r2)
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
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r2 = r4.delegate
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.AccessBridgeWrapper) r5
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r3 = r5.delegate
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                        net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.description.method.MethodDescription r2 = r4.bridgeTarget
                        net.bytebuddy.description.method.MethodDescription r3 = r5.bridgeTarget
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r2 = r4.bridgeTypes
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r3 = r5.bridgeTypes
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L41
                        return r1
                    L41:
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r4.attributeAppender
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r5 = r5.attributeAppender
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L4c
                        return r1
                    L4c:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.description.method.MethodDescription getMethod() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort getSort() {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r1.delegate
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r0 = r0.getSort()
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.description.modifier.Visibility getVisibility() {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r1.delegate
                        net.bytebuddy.description.modifier.Visibility r0 = r0.getVisibility()
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r1 = r2.delegate
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription r1 = r2.bridgeTarget
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r1 = r2.bridgeTypes
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r1 = r2.attributeAppender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record prepend(net.bytebuddy.implementation.bytecode.ByteCodeAppender r8) {
                        r7 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper r6 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$AccessBridgeWrapper
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r7.delegate
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r1 = r0.prepend(r8)
                        net.bytebuddy.description.type.TypeDescription r2 = r7.instrumentedType
                        net.bytebuddy.description.method.MethodDescription r3 = r7.bridgeTarget
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r4 = r7.bridgeTypes
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r5 = r7.attributeAppender
                        r0 = r6
                        r0.<init>(r1, r2, r3, r4, r5)
                        return r6
                }
            }

            public static abstract class ForDefinedMethod implements net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class OfVisibilityBridge extends net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                    private final net.bytebuddy.implementation.attribute.MethodAttributeAppender attributeAppender;
                    private final net.bytebuddy.description.method.MethodDescription bridgeTarget;
                    private final net.bytebuddy.description.type.TypeDescription bridgeType;
                    private final net.bytebuddy.description.method.MethodDescription visibilityBridge;

                    public static class VisibilityBridge extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
                        private final net.bytebuddy.description.method.MethodDescription bridgeTarget;
                        private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                        public VisibilityBridge(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                                r0 = this;
                                r0.<init>()
                                r0.instrumentedType = r1
                                r0.bridgeTarget = r2
                                return
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                                return r0
                        }

                        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                        @javax.annotation.Nonnull
                        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                                return r0
                        }

                        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                        @javax.annotation.Nonnull
                        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                                return r0
                        }

                        @Override // net.bytebuddy.description.method.MethodDescription
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                                r1 = this;
                                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                                return r0
                        }

                        @Override // net.bytebuddy.description.method.MethodDescription
                        public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                                net.bytebuddy.description.type.TypeList$Generic r0 = r0.asRawTypes()
                                return r0
                        }

                        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                        public java.lang.String getInternalName() {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                                java.lang.String r0 = r0.getName()
                                return r0
                        }

                        @Override // net.bytebuddy.description.ModifierReviewable
                        public int getModifiers() {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                                int r0 = r0.getModifiers()
                                r0 = r0 | 4160(0x1040, float:5.83E-42)
                                r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
                                return r0
                        }

                        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                        public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                                r2 = this;
                                net.bytebuddy.description.method.ParameterList$Explicit$ForTypes r0 = new net.bytebuddy.description.method.ParameterList$Explicit$ForTypes
                                net.bytebuddy.description.method.MethodDescription r1 = r2.bridgeTarget
                                net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asRawTypes()
                                r0.<init>(r2, r1)
                                return r0
                        }

                        @Override // net.bytebuddy.description.method.MethodDescription
                        public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asRawType()
                                return r0
                        }

                        @Override // net.bytebuddy.description.TypeVariableSource
                        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                                r0.<init>()
                                return r0
                        }
                    }

                    public OfVisibilityBridge(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.implementation.attribute.MethodAttributeAppender r4) {
                            r0 = this;
                            r0.<init>()
                            r0.visibilityBridge = r1
                            r0.bridgeTarget = r2
                            r0.bridgeType = r3
                            r0.attributeAppender = r4
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record of(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.method.MethodDescription r6, net.bytebuddy.implementation.attribute.MethodAttributeAppender r7) {
                            boolean r0 = r6.isDefaultMethod()
                            r1 = 0
                            if (r0 == 0) goto L3f
                            net.bytebuddy.description.type.TypeDefinition r0 = r6.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                            net.bytebuddy.description.type.TypeList$Generic r2 = r5.getInterfaces()
                            net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
                            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isSubTypeOf(r0)
                            net.bytebuddy.matcher.FilterableList r2 = r2.filter(r3)
                            net.bytebuddy.description.type.TypeList r2 = (net.bytebuddy.description.type.TypeList) r2
                            java.util.Iterator r2 = r2.iterator()
                        L25:
                            boolean r3 = r2.hasNext()
                            if (r3 == 0) goto L3f
                            java.lang.Object r3 = r2.next()
                            net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                            if (r1 == 0) goto L3d
                            net.bytebuddy.description.type.TypeDescription r4 = r1.asErasure()
                            boolean r4 = r0.isAssignableTo(r4)
                            if (r4 == 0) goto L25
                        L3d:
                            r1 = r3
                            goto L25
                        L3f:
                            if (r1 != 0) goto L4d
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r5.getSuperClass()
                            if (r1 != 0) goto L4d
                            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        L4d:
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$OfVisibilityBridge r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$OfVisibilityBridge
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$OfVisibilityBridge$VisibilityBridge r2 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$OfVisibilityBridge$VisibilityBridge
                            r2.<init>(r5, r6)
                            net.bytebuddy.description.type.TypeDescription r5 = r1.asErasure()
                            r0.<init>(r2, r6, r5, r7)
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                            r6 = this;
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r9)
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.prependThisReference()
                            net.bytebuddy.description.method.MethodDescription r2 = r6.bridgeTarget
                            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                            net.bytebuddy.description.type.TypeDescription r3 = r6.bridgeType
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.special(r3)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r9.getReturnType()
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r3)
                            r4 = 3
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                            r5 = 0
                            r4[r5] = r1
                            r1 = 1
                            r4[r1] = r2
                            r1 = 2
                            r4[r1] = r3
                            r0.<init>(r4)
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r7 = r0.apply(r7, r8, r9)
                            return r7
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyAttributes(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4) {
                            r2 = this;
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r0 = r2.attributeAppender
                            net.bytebuddy.description.method.MethodDescription r1 = r2.visibilityBridge
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter r4 = r4.on(r1)
                            r0.apply(r3, r1, r4)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyBody(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                            r0 = this;
                            r0.applyAttributes(r1, r3)
                            r1.visitCode()
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r0.applyCode(r1, r2)
                            int r3 = r2.getOperandStackSize()
                            int r2 = r2.getLocalVariableSize()
                            r1.visitMaxs(r3, r2)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size applyCode(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.visibilityBridge
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r1.apply(r2, r3, r0)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyHead(net.bytebuddy.jar.asm.MethodVisitor r1) {
                            r0 = this;
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
                            net.bytebuddy.description.method.MethodDescription r2 = r4.visibilityBridge
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$OfVisibilityBridge r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.OfVisibilityBridge) r5
                            net.bytebuddy.description.method.MethodDescription r3 = r5.visibilityBridge
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.method.MethodDescription r2 = r4.bridgeTarget
                            net.bytebuddy.description.method.MethodDescription r3 = r5.bridgeTarget
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.description.type.TypeDescription r2 = r4.bridgeType
                            net.bytebuddy.description.type.TypeDescription r3 = r5.bridgeType
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L36
                            return r1
                        L36:
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r4.attributeAppender
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r5 = r5.attributeAppender
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L41
                            return r1
                        L41:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.description.method.MethodDescription getMethod() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.visibilityBridge
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.IMPLEMENTED
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.description.modifier.Visibility getVisibility() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                            net.bytebuddy.description.modifier.Visibility r0 = r0.getVisibility()
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription r1 = r2.visibilityBridge
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription r1 = r2.bridgeTarget
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.TypeDescription r1 = r2.bridgeType
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r1 = r2.attributeAppender
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record prepend(net.bytebuddy.implementation.bytecode.ByteCodeAppender r6) {
                            r5 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody
                            net.bytebuddy.description.method.MethodDescription r1 = r5.visibilityBridge
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r2 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound
                            r3 = 2
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r3 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r3]
                            r4 = 0
                            r3[r4] = r5
                            r4 = 1
                            r3[r4] = r6
                            r2.<init>(r3)
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r6 = r5.attributeAppender
                            net.bytebuddy.description.method.MethodDescription r3 = r5.bridgeTarget
                            net.bytebuddy.description.modifier.Visibility r3 = r3.getVisibility()
                            r0.<init>(r1, r2, r6, r3)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithAnnotationDefaultValue extends net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod {
                    private final net.bytebuddy.description.annotation.AnnotationValue<?, ?> annotationValue;
                    private final net.bytebuddy.implementation.attribute.MethodAttributeAppender methodAttributeAppender;
                    private final net.bytebuddy.description.method.MethodDescription methodDescription;

                    public WithAnnotationDefaultValue(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender r3) {
                            r0 = this;
                            r0.<init>()
                            r0.methodDescription = r1
                            r0.annotationValue = r2
                            r0.methodAttributeAppender = r3
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyAttributes(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                            r1 = this;
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r0 = "Cannot apply attributes for default value on "
                            r3.append(r0)
                            net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                            r3.append(r0)
                            java.lang.String r3 = r3.toString()
                            r2.<init>(r3)
                            throw r2
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyBody(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4) {
                            r1 = this;
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r3 = r1.methodAttributeAppender
                            net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter r4 = r4.on(r0)
                            r3.apply(r2, r0, r4)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size applyCode(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                            r1 = this;
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r0 = "Cannot apply code for default value on "
                            r3.append(r0)
                            net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                            r3.append(r0)
                            java.lang.String r3 = r3.toString()
                            r2.<init>(r3)
                            throw r2
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyHead(net.bytebuddy.jar.asm.MethodVisitor r4) {
                            r3 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r3.methodDescription
                            net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1 = r3.annotationValue
                            boolean r0 = r0.isDefaultValue(r1)
                            if (r0 == 0) goto L27
                            net.bytebuddy.jar.asm.AnnotationVisitor r4 = r4.visitAnnotationDefault()
                            net.bytebuddy.description.method.MethodDescription r0 = r3.methodDescription
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                            java.lang.String r1 = net.bytebuddy.implementation.attribute.AnnotationAppender.NO_NAME
                            net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2 = r3.annotationValue
                            java.lang.Object r2 = r2.resolve()
                            net.bytebuddy.implementation.attribute.AnnotationAppender.Default.apply(r4, r0, r1, r2)
                            r4.visitEnd()
                            return
                        L27:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "Cannot set "
                            r0.append(r1)
                            net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1 = r3.annotationValue
                            r0.append(r1)
                            java.lang.String r1 = " as default for "
                            r0.append(r1)
                            net.bytebuddy.description.method.MethodDescription r1 = r3.methodDescription
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            r4.<init>(r0)
                            throw r4
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
                            net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithAnnotationDefaultValue r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithAnnotationDefaultValue) r5
                            net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2 = r4.annotationValue
                            net.bytebuddy.description.annotation.AnnotationValue<?, ?> r3 = r5.annotationValue
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r4.methodAttributeAppender
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r5 = r5.methodAttributeAppender
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L36
                            return r1
                        L36:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.description.method.MethodDescription getMethod() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.DEFINED
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.description.modifier.Visibility getVisibility() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                            net.bytebuddy.description.modifier.Visibility r0 = r0.getVisibility()
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1 = r2.annotationValue
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r1 = r2.methodAttributeAppender
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record prepend(net.bytebuddy.implementation.bytecode.ByteCodeAppender r3) {
                            r2 = this;
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "Cannot prepend code for default value on "
                            r0.append(r1)
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            r3.<init>(r0)
                            throw r3
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithBody extends net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod {
                    private final net.bytebuddy.implementation.bytecode.ByteCodeAppender byteCodeAppender;
                    private final net.bytebuddy.implementation.attribute.MethodAttributeAppender methodAttributeAppender;
                    private final net.bytebuddy.description.method.MethodDescription methodDescription;
                    private final net.bytebuddy.description.modifier.Visibility visibility;

                    public WithBody(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.bytecode.ByteCodeAppender r4) {
                            r2 = this;
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.INSTANCE
                            net.bytebuddy.description.modifier.Visibility r1 = r3.getVisibility()
                            r2.<init>(r3, r4, r0, r1)
                            return
                    }

                    public WithBody(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bytecode.ByteCodeAppender r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender r3, net.bytebuddy.description.modifier.Visibility r4) {
                            r0 = this;
                            r0.<init>()
                            r0.methodDescription = r1
                            r0.byteCodeAppender = r2
                            r0.methodAttributeAppender = r3
                            r0.visibility = r4
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyAttributes(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4) {
                            r2 = this;
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r0 = r2.methodAttributeAppender
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter r4 = r4.on(r1)
                            r0.apply(r3, r1, r4)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyBody(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                            r0 = this;
                            r0.applyAttributes(r1, r3)
                            r1.visitCode()
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r0.applyCode(r1, r2)
                            int r3 = r2.getOperandStackSize()
                            int r2 = r2.getLocalVariableSize()
                            r1.visitMaxs(r3, r2)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size applyCode(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                            r2 = this;
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender r0 = r2.byteCodeAppender
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r3 = r0.apply(r3, r4, r1)
                            return r3
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyHead(net.bytebuddy.jar.asm.MethodVisitor r1) {
                            r0 = this;
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
                            net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithBody) r5
                            net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                            net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender r2 = r4.byteCodeAppender
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender r3 = r5.byteCodeAppender
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L36
                            return r1
                        L36:
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r4.methodAttributeAppender
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r5 = r5.methodAttributeAppender
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L41
                            return r1
                        L41:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.description.method.MethodDescription getMethod() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.IMPLEMENTED
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.description.modifier.Visibility getVisibility() {
                            r1 = this;
                            net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender r1 = r2.byteCodeAppender
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r1 = r2.methodAttributeAppender
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record prepend(net.bytebuddy.implementation.bytecode.ByteCodeAppender r7) {
                            r6 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody
                            net.bytebuddy.description.method.MethodDescription r1 = r6.methodDescription
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r2 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender r3 = r6.byteCodeAppender
                            r4 = 2
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r4 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r4]
                            r5 = 0
                            r4[r5] = r7
                            r7 = 1
                            r4[r7] = r3
                            r2.<init>(r4)
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r7 = r6.methodAttributeAppender
                            net.bytebuddy.description.modifier.Visibility r3 = r6.visibility
                            r0.<init>(r1, r2, r7, r3)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithoutBody extends net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod {
                    private final net.bytebuddy.implementation.attribute.MethodAttributeAppender methodAttributeAppender;
                    private final net.bytebuddy.description.method.MethodDescription methodDescription;
                    private final net.bytebuddy.description.modifier.Visibility visibility;

                    public WithoutBody(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender r2, net.bytebuddy.description.modifier.Visibility r3) {
                            r0 = this;
                            r0.<init>()
                            r0.methodDescription = r1
                            r0.methodAttributeAppender = r2
                            r0.visibility = r3
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyAttributes(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4) {
                            r2 = this;
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r0 = r2.methodAttributeAppender
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter r4 = r4.on(r1)
                            r0.apply(r3, r1, r4)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyBody(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                            r0 = this;
                            r0.applyAttributes(r1, r3)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size applyCode(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                            r1 = this;
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r0 = "Cannot apply code for abstract method on "
                            r3.append(r0)
                            net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                            r3.append(r0)
                            java.lang.String r3 = r3.toString()
                            r2.<init>(r3)
                            throw r2
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public void applyHead(net.bytebuddy.jar.asm.MethodVisitor r1) {
                            r0 = this;
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
                            net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithoutBody r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithoutBody) r5
                            net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                            net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r4.methodAttributeAppender
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r5 = r5.methodAttributeAppender
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L36
                            return r1
                        L36:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.description.method.MethodDescription getMethod() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.DEFINED
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.description.modifier.Visibility getVisibility() {
                            r1 = this;
                            net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender r1 = r2.methodAttributeAppender
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record prepend(net.bytebuddy.implementation.bytecode.ByteCodeAppender r3) {
                            r2 = this;
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "Cannot prepend code for abstract method on "
                            r0.append(r1)
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            r3.<init>(r0)
                            throw r3
                    }
                }

                public ForDefinedMethod() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void apply(net.bytebuddy.jar.asm.ClassVisitor r10, net.bytebuddy.implementation.Implementation.Context r11, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r12) {
                        r9 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r9.getMethod()
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r1 = r9.getSort()
                        boolean r1 = r1.isImplemented()
                        net.bytebuddy.description.modifier.Visibility r2 = r9.getVisibility()
                        int r4 = r0.getActualModifiers(r1, r2)
                        net.bytebuddy.description.method.MethodDescription r0 = r9.getMethod()
                        java.lang.String r5 = r0.getInternalName()
                        net.bytebuddy.description.method.MethodDescription r0 = r9.getMethod()
                        java.lang.String r6 = r0.getDescriptor()
                        net.bytebuddy.description.method.MethodDescription r0 = r9.getMethod()
                        java.lang.String r7 = r0.getGenericSignature()
                        net.bytebuddy.description.method.MethodDescription r0 = r9.getMethod()
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                        net.bytebuddy.description.type.TypeList r0 = r0.asErasures()
                        java.lang.String[] r8 = r0.toInternalNames()
                        r3 = r10
                        net.bytebuddy.jar.asm.MethodVisitor r10 = r3.visitMethod(r4, r5, r6, r7, r8)
                        if (r10 == 0) goto L76
                        net.bytebuddy.description.method.MethodDescription r0 = r9.getMethod()
                        net.bytebuddy.description.method.ParameterList r0 = r0.getParameters()
                        boolean r1 = r0.hasExplicitMetaData()
                        if (r1 == 0) goto L6d
                        java.util.Iterator r0 = r0.iterator()
                    L55:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L6d
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.description.method.ParameterDescription r1 = (net.bytebuddy.description.method.ParameterDescription) r1
                        java.lang.String r2 = r1.getName()
                        int r1 = r1.getModifiers()
                        r10.visitParameter(r2, r1)
                        goto L55
                    L6d:
                        r9.applyHead(r10)
                        r9.applyBody(r10, r11, r12)
                        r10.visitEnd()
                    L76:
                        return
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForNonImplementedMethod implements net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record {
                private final net.bytebuddy.description.method.MethodDescription methodDescription;

                public ForNonImplementedMethod(net.bytebuddy.description.method.MethodDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.methodDescription = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyAttributes(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyBody(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                        r0 = this;
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Cannot apply body for non-implemented method on "
                        r2.append(r3)
                        net.bytebuddy.description.method.MethodDescription r3 = r0.methodDescription
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
                        r1.<init>(r2)
                        throw r1
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size applyCode(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r0 = "Cannot apply code for non-implemented method on "
                        r3.append(r0)
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        r3.append(r0)
                        java.lang.String r3 = r3.toString()
                        r2.<init>(r3)
                        throw r2
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyHead(net.bytebuddy.jar.asm.MethodVisitor r3) {
                        r2 = this;
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Cannot apply head for non-implemented method on "
                        r0.append(r1)
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        r3.<init>(r0)
                        throw r3
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
                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForNonImplementedMethod r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForNonImplementedMethod) r5
                        net.bytebuddy.description.method.MethodDescription r5 = r5.methodDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.description.method.MethodDescription getMethod() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort getSort() {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.SKIPPED
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.description.modifier.Visibility getVisibility() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        net.bytebuddy.description.modifier.Visibility r0 = r0.getVisibility()
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record prepend(net.bytebuddy.implementation.bytecode.ByteCodeAppender r10) {
                        r9 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody
                        net.bytebuddy.description.method.MethodDescription r1 = r9.methodDescription
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r2 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r3 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r1.getReturnType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r4)
                        net.bytebuddy.description.method.MethodDescription r5 = r9.methodDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getReturnType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r5)
                        r6 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r7 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                        r8 = 0
                        r7[r8] = r4
                        r4 = 1
                        r7[r4] = r5
                        r3.<init>(r7)
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r5 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r6]
                        r5[r8] = r10
                        r5[r4] = r3
                        r2.<init>(r5)
                        r0.<init>(r1, r2)
                        return r0
                }
            }

            public enum Sort extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort> {
                private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort[] $VALUES = null;
                public static final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort DEFINED = null;
                public static final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort IMPLEMENTED = null;
                public static final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort SKIPPED = null;
                private final boolean define;
                private final boolean implement;

                static {
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort
                        java.lang.String r1 = "SKIPPED"
                        r2 = 0
                        r0.<init>(r1, r2, r2, r2)
                        net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.SKIPPED = r0
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r1 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort
                        java.lang.String r3 = "DEFINED"
                        r4 = 1
                        r1.<init>(r3, r4, r4, r2)
                        net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.DEFINED = r1
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r2 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort
                        java.lang.String r3 = "IMPLEMENTED"
                        r5 = 2
                        r2.<init>(r3, r5, r4, r4)
                        net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.IMPLEMENTED = r2
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort[]{r0, r1, r2}
                        net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.$VALUES = r0
                        return
                }

                Sort(java.lang.String r1, int r2, boolean r3, boolean r4) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.define = r3
                        r0.implement = r4
                        return
                }

                public static net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort) r1
                        return r1
                }

                public static net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort[] values() {
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort[]) r0
                        return r0
                }

                public boolean isDefined() {
                        r1 = this;
                        boolean r0 = r1.define
                        return r0
                }

                public boolean isImplemented() {
                        r1 = this;
                        boolean r0 = r1.implement
                        return r0
                }
            }

            void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3);

            void applyAttributes(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2);

            void applyBody(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3);

            net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size applyCode(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2);

            void applyHead(net.bytebuddy.jar.asm.MethodVisitor r1);

            net.bytebuddy.description.method.MethodDescription getMethod();

            net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort getSort();

            net.bytebuddy.description.modifier.Visibility getVisibility();

            net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record prepend(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1);
        }

        net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record target(net.bytebuddy.description.method.MethodDescription r1);
    }

    public interface RecordComponentPool {

        public enum Disabled extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled> implements net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Disabled r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Disabled
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Disabled[] r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled[]{r0}
                    net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled.$VALUES = r0
                    return
            }

            Disabled(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Disabled> r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Disabled r1 = (net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled[] values() {
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Disabled[] r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Disabled[] r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Disabled[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool
            public net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record target(net.bytebuddy.description.type.RecordComponentDescription r2) {
                    r1 = this;
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Cannot look up record component from disabled pool"
                    r2.<init>(r0)
                    throw r2
            }
        }

        public interface Record {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitRecordComponent implements net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record {
                private final net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender attributeAppender;
                private final net.bytebuddy.description.type.RecordComponentDescription recordComponentDescription;

                public ForExplicitRecordComponent(net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r1, net.bytebuddy.description.type.RecordComponentDescription r2) {
                        r0 = this;
                        r0.<init>()
                        r0.attributeAppender = r1
                        r0.recordComponentDescription = r2
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public void apply(net.bytebuddy.jar.asm.ClassVisitor r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r5) {
                        r3 = this;
                        net.bytebuddy.description.type.RecordComponentDescription r0 = r3.recordComponentDescription
                        java.lang.String r0 = r0.getActualName()
                        net.bytebuddy.description.type.RecordComponentDescription r1 = r3.recordComponentDescription
                        java.lang.String r1 = r1.getDescriptor()
                        net.bytebuddy.description.type.RecordComponentDescription r2 = r3.recordComponentDescription
                        java.lang.String r2 = r2.getGenericSignature()
                        net.bytebuddy.jar.asm.RecordComponentVisitor r4 = r4.visitRecordComponent(r0, r1, r2)
                        if (r4 == 0) goto L26
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r0 = r3.attributeAppender
                        net.bytebuddy.description.type.RecordComponentDescription r1 = r3.recordComponentDescription
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter r5 = r5.on(r1)
                        r0.apply(r4, r1, r5)
                        r4.visitEnd()
                    L26:
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public void apply(net.bytebuddy.jar.asm.RecordComponentVisitor r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4) {
                        r2 = this;
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r0 = r2.attributeAppender
                        net.bytebuddy.description.type.RecordComponentDescription r1 = r2.recordComponentDescription
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter r4 = r4.on(r1)
                        r0.apply(r3, r1, r4)
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
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r2 = r4.attributeAppender
                        net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record$ForExplicitRecordComponent r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record.ForExplicitRecordComponent) r5
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r3 = r5.attributeAppender
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.type.RecordComponentDescription r2 = r4.recordComponentDescription
                        net.bytebuddy.description.type.RecordComponentDescription r5 = r5.recordComponentDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public net.bytebuddy.description.type.RecordComponentDescription getRecordComponent() {
                        r1 = this;
                        net.bytebuddy.description.type.RecordComponentDescription r0 = r1.recordComponentDescription
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender getRecordComponentAppender() {
                        r1 = this;
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r0 = r1.attributeAppender
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r1 = r2.attributeAppender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.RecordComponentDescription r1 = r2.recordComponentDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public boolean isImplicit() {
                        r1 = this;
                        r0 = 0
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForImplicitRecordComponent implements net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record {
                private final net.bytebuddy.description.type.RecordComponentDescription recordComponentDescription;

                public ForImplicitRecordComponent(net.bytebuddy.description.type.RecordComponentDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.recordComponentDescription = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public void apply(net.bytebuddy.jar.asm.ClassVisitor r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r5) {
                        r3 = this;
                        net.bytebuddy.description.type.RecordComponentDescription r0 = r3.recordComponentDescription
                        java.lang.String r0 = r0.getActualName()
                        net.bytebuddy.description.type.RecordComponentDescription r1 = r3.recordComponentDescription
                        java.lang.String r1 = r1.getDescriptor()
                        net.bytebuddy.description.type.RecordComponentDescription r2 = r3.recordComponentDescription
                        java.lang.String r2 = r2.getGenericSignature()
                        net.bytebuddy.jar.asm.RecordComponentVisitor r4 = r4.visitRecordComponent(r0, r1, r2)
                        if (r4 == 0) goto L26
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$ForInstrumentedRecordComponent r0 = net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.ForInstrumentedRecordComponent.INSTANCE
                        net.bytebuddy.description.type.RecordComponentDescription r1 = r3.recordComponentDescription
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter r5 = r5.on(r1)
                        r0.apply(r4, r1, r5)
                        r4.visitEnd()
                    L26:
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public void apply(net.bytebuddy.jar.asm.RecordComponentVisitor r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r0 = "An implicit field record is not intended for partial application: "
                        r3.append(r0)
                        r3.append(r1)
                        java.lang.String r3 = r3.toString()
                        r2.<init>(r3)
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
                        net.bytebuddy.description.type.RecordComponentDescription r2 = r4.recordComponentDescription
                        net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record$ForImplicitRecordComponent r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record.ForImplicitRecordComponent) r5
                        net.bytebuddy.description.type.RecordComponentDescription r5 = r5.recordComponentDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public net.bytebuddy.description.type.RecordComponentDescription getRecordComponent() {
                        r1 = this;
                        net.bytebuddy.description.type.RecordComponentDescription r0 = r1.recordComponentDescription
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender getRecordComponentAppender() {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "An implicit field record does not expose a field appender: "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.RecordComponentDescription r1 = r2.recordComponentDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record
                public boolean isImplicit() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2);

            void apply(net.bytebuddy.jar.asm.RecordComponentVisitor r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2);

            net.bytebuddy.description.type.RecordComponentDescription getRecordComponent();

            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender getRecordComponentAppender();

            boolean isImplicit();
        }

        net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record target(net.bytebuddy.description.type.RecordComponentDescription r1);
    }

    net.bytebuddy.dynamic.DynamicType.Unloaded<T> make(net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved r1);

    net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r1, int r2, int r3);
}

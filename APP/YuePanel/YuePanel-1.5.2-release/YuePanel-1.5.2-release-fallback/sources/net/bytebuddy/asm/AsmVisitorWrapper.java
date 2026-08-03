package net.bytebuddy.asm;

/* JADX INFO: loaded from: classes2.dex */
public interface AsmVisitorWrapper {
    public static final int NO_FLAGS = 0;

    public static abstract class AbstractBase implements net.bytebuddy.asm.AsmVisitorWrapper {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public int mergeReader(int r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public int mergeWriter(int r1) {
                r0 = this;
                return r1
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.asm.AsmVisitorWrapper {
        private final java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> asmVisitorWrappers;

        public Compound(java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.asmVisitorWrappers = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.asm.AsmVisitorWrapper r0 = (net.bytebuddy.asm.AsmVisitorWrapper) r0
                boolean r1 = r0 instanceof net.bytebuddy.asm.AsmVisitorWrapper.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r1 = r2.asmVisitorWrappers
                net.bytebuddy.asm.AsmVisitorWrapper$Compound r0 = (net.bytebuddy.asm.AsmVisitorWrapper.Compound) r0
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r0 = r0.asmVisitorWrappers
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.asm.AsmVisitorWrapper.NoOp
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r1 = r2.asmVisitorWrappers
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.asm.AsmVisitorWrapper... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
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
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r2 = r4.asmVisitorWrappers
                net.bytebuddy.asm.AsmVisitorWrapper$Compound r5 = (net.bytebuddy.asm.AsmVisitorWrapper.Compound) r5
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r5 = r5.asmVisitorWrappers
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
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r1 = r2.asmVisitorWrappers
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public int mergeReader(int r3) {
                r2 = this;
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r0 = r2.asmVisitorWrappers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()
                net.bytebuddy.asm.AsmVisitorWrapper r1 = (net.bytebuddy.asm.AsmVisitorWrapper) r1
                int r3 = r1.mergeReader(r3)
                goto L6
            L17:
                return r3
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public int mergeWriter(int r3) {
                r2 = this;
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r0 = r2.asmVisitorWrappers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()
                net.bytebuddy.asm.AsmVisitorWrapper r1 = (net.bytebuddy.asm.AsmVisitorWrapper) r1
                int r3 = r1.mergeWriter(r3)
                goto L6
            L17:
                return r3
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r12, net.bytebuddy.jar.asm.ClassVisitor r13, net.bytebuddy.implementation.Implementation.Context r14, net.bytebuddy.pool.TypePool r15, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r16, net.bytebuddy.description.method.MethodList<?> r17, int r18, int r19) {
                r11 = this;
                r0 = r11
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper> r1 = r0.asmVisitorWrappers
                java.util.Iterator r1 = r1.iterator()
                r4 = r13
            L8:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r1.next()
                net.bytebuddy.asm.AsmVisitorWrapper r2 = (net.bytebuddy.asm.AsmVisitorWrapper) r2
                r3 = r12
                r5 = r14
                r6 = r15
                r7 = r16
                r8 = r17
                r9 = r18
                r10 = r19
                net.bytebuddy.jar.asm.ClassVisitor r4 = r2.wrap(r3, r4, r5, r6, r7, r8, r9, r10)
                goto L8
            L24:
                return r4
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForDeclaredFields extends net.bytebuddy.asm.AsmVisitorWrapper.AbstractBase {
        private final java.util.List<net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.Entry> entries;

        public class DispatchingVisitor extends net.bytebuddy.jar.asm.ClassVisitor {
            private final java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription.InDefinedShape> fields;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            final /* synthetic */ net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields this$0;

            public DispatchingVisitor(net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.description.type.TypeDescription r3, java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription.InDefinedShape> r4) {
                    r0 = this;
                    r0.this$0 = r1
                    int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r0.<init>(r1, r2)
                    r0.instrumentedType = r3
                    r0.fields = r4
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.FieldVisitor visitField(int r1, java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r0 = this;
                    net.bytebuddy.jar.asm.FieldVisitor r1 = super.visitField(r1, r2, r3, r4, r5)
                    java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r0.fields
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    r5.append(r2)
                    r5.append(r3)
                    java.lang.String r2 = r5.toString()
                    java.lang.Object r2 = r4.get(r2)
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                    if (r1 == 0) goto L42
                    if (r2 == 0) goto L42
                    net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields r3 = r0.this$0
                    java.util.List r3 = net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.access$000(r3)
                    java.util.Iterator r3 = r3.iterator()
                L29:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L42
                    java.lang.Object r4 = r3.next()
                    net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry r4 = (net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.Entry) r4
                    boolean r5 = r4.matches2(r2)
                    if (r5 == 0) goto L29
                    net.bytebuddy.description.type.TypeDescription r5 = r0.instrumentedType
                    net.bytebuddy.jar.asm.FieldVisitor r1 = r4.wrap(r5, r2, r1)
                    goto L29
                L42:
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Entry implements net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.field.FieldDescription.InDefinedShape>, net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper {
            private final java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper> fieldVisitorWrappers;
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> matcher;

            public Entry(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r1, java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.matcher = r1
                    r0.fieldVisitorWrappers = r2
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
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.matcher
                    net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry r5 = (net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.Entry) r5
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.matcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper> r2 = r4.fieldVisitorWrappers
                    java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper> r5 = r5.fieldVisitorWrappers
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
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper> r1 = r2.fieldVisitorWrappers
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.matcher.ElementMatcher
            public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.field.FieldDescription.InDefinedShape r1) {
                    r0 = this;
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                    boolean r1 = r0.matches2(r1)
                    return r1
            }

            /* JADX INFO: renamed from: matches, reason: avoid collision after fix types in other method */
            public boolean matches2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.field.FieldDescription.InDefinedShape r2) {
                    r1 = this;
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r0 = r1.matcher
                    boolean r2 = r0.matches(r2)
                    return r2
            }

            @Override // net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper
            public net.bytebuddy.jar.asm.FieldVisitor wrap(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.field.FieldDescription.InDefinedShape r4, net.bytebuddy.jar.asm.FieldVisitor r5) {
                    r2 = this;
                    java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper> r0 = r2.fieldVisitorWrappers
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L17
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper r1 = (net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper) r1
                    net.bytebuddy.jar.asm.FieldVisitor r5 = r1.wrap(r3, r4, r5)
                    goto L6
                L17:
                    return r5
            }
        }

        public interface FieldVisitorWrapper {
            net.bytebuddy.jar.asm.FieldVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.field.FieldDescription.InDefinedShape r2, net.bytebuddy.jar.asm.FieldVisitor r3);
        }

        public ForDeclaredFields() {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r0)
                return
        }

        public ForDeclaredFields(java.util.List<net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.Entry> r1) {
                r0 = this;
                r0.<init>()
                r0.entries = r1
                return
        }

        public static /* synthetic */ java.util.List access$000(net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields r0) {
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry> r0 = r0.entries
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
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry> r2 = r4.entries
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields r5 = (net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields) r5
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry> r5 = r5.entries
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields field(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r4, java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper> r5) {
                r3 = this;
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields r0 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry> r1 = r3.entries
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry r2 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry
                r2.<init>(r4, r5)
                java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r1, r2)
                r0.<init>(r4)
                return r0
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields field(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r1, net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields r1 = r0.field(r1, r2)
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$Entry> r1 = r2.entries
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.pool.TypePool r4, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5, net.bytebuddy.description.method.MethodList<?> r6, int r7, int r8) {
                r0 = this;
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.util.Iterator r4 = r5.iterator()
            L9:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L30
                java.lang.Object r5 = r4.next()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r5 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r5
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r5.getInternalName()
                r6.append(r7)
                java.lang.String r7 = r5.getDescriptor()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r3.put(r6, r5)
                goto L9
            L30:
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor r4 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$DispatchingVisitor
                r4.<init>(r0, r2, r1, r3)
                return r4
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForDeclaredMethods implements net.bytebuddy.asm.AsmVisitorWrapper {
        private final java.util.List<net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.Entry> entries;
        private final int readerFlags;
        private final int writerFlags;

        public class DispatchingVisitor extends net.bytebuddy.jar.asm.ClassVisitor {
            private final net.bytebuddy.implementation.Implementation.Context implementationContext;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> methods;
            private final int readerFlags;
            final /* synthetic */ net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods this$0;
            private final net.bytebuddy.pool.TypePool typePool;
            private final int writerFlags;

            public DispatchingVisitor(net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.implementation.Implementation.Context r4, net.bytebuddy.pool.TypePool r5, java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> r6, int r7, int r8) {
                    r0 = this;
                    r0.this$0 = r1
                    int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r0.<init>(r1, r2)
                    r0.instrumentedType = r3
                    r0.implementationContext = r4
                    r0.typePool = r5
                    r0.methods = r6
                    r0.writerFlags = r7
                    r0.readerFlags = r8
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r9, java.lang.String r10, java.lang.String r11, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r12, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r13) {
                    r8 = this;
                    net.bytebuddy.jar.asm.MethodVisitor r9 = super.visitMethod(r9, r10, r11, r12, r13)
                    java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> r12 = r8.methods
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    r13.append(r10)
                    r13.append(r11)
                    java.lang.String r10 = r13.toString()
                    java.lang.Object r10 = r12.get(r10)
                    net.bytebuddy.description.method.MethodDescription r10 = (net.bytebuddy.description.method.MethodDescription) r10
                    if (r9 == 0) goto L4e
                    if (r10 == 0) goto L4e
                    net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r11 = r8.this$0
                    java.util.List r11 = net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.access$100(r11)
                    java.util.Iterator r11 = r11.iterator()
                L29:
                    r3 = r9
                L2a:
                    boolean r9 = r11.hasNext()
                    if (r9 == 0) goto L4d
                    java.lang.Object r9 = r11.next()
                    r0 = r9
                    net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry r0 = (net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.Entry) r0
                    boolean r9 = r0.matches2(r10)
                    if (r9 == 0) goto L2a
                    net.bytebuddy.description.type.TypeDescription r1 = r8.instrumentedType
                    net.bytebuddy.implementation.Implementation$Context r4 = r8.implementationContext
                    net.bytebuddy.pool.TypePool r5 = r8.typePool
                    int r6 = r8.writerFlags
                    int r7 = r8.readerFlags
                    r2 = r10
                    net.bytebuddy.jar.asm.MethodVisitor r9 = r0.wrap(r1, r2, r3, r4, r5, r6, r7)
                    goto L29
                L4d:
                    r9 = r3
                L4e:
                    return r9
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Entry implements net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.method.MethodDescription>, net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
            private final java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper> methodVisitorWrappers;

            public Entry(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.matcher = r1
                    r0.methodVisitorWrappers = r2
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
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                    net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry r5 = (net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.Entry) r5
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.matcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper> r2 = r4.methodVisitorWrappers
                    java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper> r5 = r5.methodVisitorWrappers
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
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper> r1 = r2.methodVisitorWrappers
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.matcher.ElementMatcher
            public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                    boolean r1 = r0.matches2(r1)
                    return r1
            }

            /* JADX INFO: renamed from: matches, reason: avoid collision after fix types in other method */
            public boolean matches2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.method.MethodDescription r2) {
                    r1 = this;
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.matcher
                    boolean r2 = r0.matches(r2)
                    return r2
            }

            @Override // net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
            public net.bytebuddy.jar.asm.MethodVisitor wrap(net.bytebuddy.description.type.TypeDescription r11, net.bytebuddy.description.method.MethodDescription r12, net.bytebuddy.jar.asm.MethodVisitor r13, net.bytebuddy.implementation.Implementation.Context r14, net.bytebuddy.pool.TypePool r15, int r16, int r17) {
                    r10 = this;
                    r0 = r10
                    java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper> r1 = r0.methodVisitorWrappers
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r13
                L8:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L21
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper r2 = (net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper) r2
                    r3 = r11
                    r4 = r12
                    r6 = r14
                    r7 = r15
                    r8 = r16
                    r9 = r17
                    net.bytebuddy.jar.asm.MethodVisitor r5 = r2.wrap(r3, r4, r5, r6, r7, r8, r9)
                    goto L8
                L21:
                    return r5
            }
        }

        public interface MethodVisitorWrapper {
            net.bytebuddy.jar.asm.MethodVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4, net.bytebuddy.pool.TypePool r5, int r6, int r7);
        }

        public ForDeclaredMethods() {
                r2 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1 = 0
                r2.<init>(r0, r1, r1)
                return
        }

        public ForDeclaredMethods(java.util.List<net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.Entry> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.entries = r1
                r0.writerFlags = r2
                r0.readerFlags = r3
                return
        }

        public static /* synthetic */ java.util.List access$100(net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods r0) {
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry> r0 = r0.entries
                return r0
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods constructor(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2, java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper> r3) {
                r1 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r2 = r1.invokable(r2, r3)
                return r2
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods constructor(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r1 = r0.constructor(r1, r2)
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
                int r2 = r4.writerFlags
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r5 = (net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods) r5
                int r3 = r5.writerFlags
                if (r2 == r3) goto L1c
                return r1
            L1c:
                int r2 = r4.readerFlags
                int r3 = r5.readerFlags
                if (r2 == r3) goto L23
                return r1
            L23:
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry> r2 = r4.entries
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry> r5 = r5.entries
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2e
                return r1
            L2e:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry> r1 = r2.entries
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.writerFlags
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.readerFlags
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods invokable(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4, java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper> r5) {
                r3 = this;
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r0 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry> r1 = r3.entries
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry r2 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry
                r2.<init>(r4, r5)
                java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r1, r2)
                int r5 = r3.writerFlags
                int r1 = r3.readerFlags
                r0.<init>(r4, r5, r1)
                return r0
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods invokable(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r1 = r0.invokable(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public int mergeReader(int r2) {
                r1 = this;
                int r0 = r1.readerFlags
                r2 = r2 | r0
                return r2
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public int mergeWriter(int r2) {
                r1 = this;
                int r0 = r1.writerFlags
                r2 = r2 | r0
                return r2
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods method(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2, java.util.List<? extends net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper> r3) {
                r1 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isMethod()
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r2 = r1.invokable(r2, r3)
                return r2
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods method(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r1 = r0.method(r1, r2)
                return r1
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods readerFlags(int r5) {
                r4 = this;
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r0 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry> r1 = r4.entries
                int r2 = r4.writerFlags
                int r3 = r4.readerFlags
                r5 = r5 | r3
                r0.<init>(r1, r2, r5)
                return r0
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r11, net.bytebuddy.jar.asm.ClassVisitor r12, net.bytebuddy.implementation.Implementation.Context r13, net.bytebuddy.pool.TypePool r14, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r15, net.bytebuddy.description.method.MethodList<?> r16, int r17, int r18) {
                r10 = this;
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer r0 = new net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer
                r3 = r11
                r0.<init>(r11)
                r1 = r16
                java.util.List r0 = net.bytebuddy.utility.CompoundList.of(r1, r0)
                java.util.Iterator r0 = r0.iterator()
            L15:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = r1.getInternalName()
                r2.append(r4)
                java.lang.String r4 = r1.getDescriptor()
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r6.put(r2, r1)
                goto L15
            L3c:
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$DispatchingVisitor r9 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$DispatchingVisitor
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r11
                r4 = r13
                r5 = r14
                r7 = r17
                r8 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods writerFlags(int r4) {
                r3 = this;
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r0 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods
                java.util.List<net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$Entry> r1 = r3.entries
                int r2 = r3.writerFlags
                r4 = r4 | r2
                int r2 = r3.readerFlags
                r0.<init>(r1, r4, r2)
                return r0
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.asm.AsmVisitorWrapper.NoOp> implements net.bytebuddy.asm.AsmVisitorWrapper {
        private static final /* synthetic */ net.bytebuddy.asm.AsmVisitorWrapper.NoOp[] $VALUES = null;
        public static final net.bytebuddy.asm.AsmVisitorWrapper.NoOp INSTANCE = null;

        static {
                net.bytebuddy.asm.AsmVisitorWrapper$NoOp r0 = new net.bytebuddy.asm.AsmVisitorWrapper$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.asm.AsmVisitorWrapper.NoOp.INSTANCE = r0
                net.bytebuddy.asm.AsmVisitorWrapper$NoOp[] r0 = new net.bytebuddy.asm.AsmVisitorWrapper.NoOp[]{r0}
                net.bytebuddy.asm.AsmVisitorWrapper.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.asm.AsmVisitorWrapper.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.asm.AsmVisitorWrapper$NoOp> r0 = net.bytebuddy.asm.AsmVisitorWrapper.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.asm.AsmVisitorWrapper$NoOp r1 = (net.bytebuddy.asm.AsmVisitorWrapper.NoOp) r1
                return r1
        }

        public static net.bytebuddy.asm.AsmVisitorWrapper.NoOp[] values() {
                net.bytebuddy.asm.AsmVisitorWrapper$NoOp[] r0 = net.bytebuddy.asm.AsmVisitorWrapper.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.asm.AsmVisitorWrapper$NoOp[] r0 = (net.bytebuddy.asm.AsmVisitorWrapper.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public int mergeReader(int r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public int mergeWriter(int r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.pool.TypePool r4, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5, net.bytebuddy.description.method.MethodList<?> r6, int r7, int r8) {
                r0 = this;
                return r2
        }
    }

    int mergeReader(int r1);

    int mergeWriter(int r1);

    net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.pool.TypePool r4, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5, net.bytebuddy.description.method.MethodList<?> r6, int r7, int r8);
}

package net.bytebuddy.asm;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public abstract class MemberAttributeExtension<T> {
    protected final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory annotationValueFilterFactory;
    protected final T attributeAppenderFactory;

    /* JADX INFO: renamed from: net.bytebuddy.asm.MemberAttributeExtension$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ForField extends net.bytebuddy.asm.MemberAttributeExtension<net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory> implements net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper {

        public static class FieldAttributeVisitor extends net.bytebuddy.jar.asm.FieldVisitor {
            private final net.bytebuddy.implementation.attribute.AnnotationValueFilter annotationValueFilter;
            private final net.bytebuddy.implementation.attribute.FieldAttributeAppender fieldAttributeAppender;
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;

            private FieldAttributeVisitor(net.bytebuddy.jar.asm.FieldVisitor r2, net.bytebuddy.description.field.FieldDescription r3, net.bytebuddy.implementation.attribute.FieldAttributeAppender r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                    r1 = this;
                    int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r1.<init>(r0, r2)
                    r1.fieldDescription = r3
                    r1.fieldAttributeAppender = r4
                    r1.annotationValueFilter = r5
                    return
            }

            public /* synthetic */ FieldAttributeVisitor(net.bytebuddy.jar.asm.FieldVisitor r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.implementation.attribute.FieldAttributeAppender r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter r4, net.bytebuddy.asm.MemberAttributeExtension.AnonymousClass1 r5) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    return
            }

            @Override // net.bytebuddy.jar.asm.FieldVisitor
            public void visitEnd() {
                    r4 = this;
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender r0 = r4.fieldAttributeAppender
                    net.bytebuddy.jar.asm.FieldVisitor r1 = r4.fv
                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter r3 = r4.annotationValueFilter
                    r0.apply(r1, r2, r3)
                    super.visitEnd()
                    return
            }
        }

        public ForField() {
                r1 = this;
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default r0 = net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.APPEND_DEFAULTS
                r1.<init>(r0)
                return
        }

        public ForField(net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2) {
                r1 = this;
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp r0 = net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp.INSTANCE
                r1.<init>(r2, r0)
                return
        }

        public ForField(net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r1, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForField annotate(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
                r2 = this;
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Explicit r0 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender$Explicit
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r3)
                r0.<init>(r1)
                net.bytebuddy.asm.MemberAttributeExtension$ForField r3 = r2.attribute(r0)
                return r3
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForField annotate(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                r0.<init>(r2)
                net.bytebuddy.asm.MemberAttributeExtension$ForField r2 = r1.annotate(r0)
                return r2
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForField annotate(java.lang.annotation.Annotation... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.asm.MemberAttributeExtension$ForField r1 = r0.annotate(r1)
                return r1
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForField annotate(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.asm.MemberAttributeExtension$ForField r1 = r0.annotate(r1)
                return r1
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForField attribute(net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r7) {
                r6 = this;
                net.bytebuddy.asm.MemberAttributeExtension$ForField r0 = new net.bytebuddy.asm.MemberAttributeExtension$ForField
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r1 = r6.annotationValueFilterFactory
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory$Compound r2 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory$Compound
                T r3 = r6.attributeAppenderFactory
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r3 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory) r3
                r4 = 2
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory[] r4 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory[r4]
                r5 = 0
                r4[r5] = r3
                r3 = 1
                r4[r3] = r7
                r2.<init>(r4)
                r0.<init>(r1, r2)
                return r0
        }

        public net.bytebuddy.asm.AsmVisitorWrapper on(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r4) {
                r3 = this;
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields r0 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields
                r0.<init>()
                r1 = 1
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper[] r1 = new net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper[r1]
                r2 = 0
                r1[r2] = r3
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredFields r4 = r0.field(r4, r1)
                return r4
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper
        public net.bytebuddy.jar.asm.FieldVisitor wrap(net.bytebuddy.description.type.TypeDescription r8, net.bytebuddy.description.field.FieldDescription.InDefinedShape r9, net.bytebuddy.jar.asm.FieldVisitor r10) {
                r7 = this;
                net.bytebuddy.asm.MemberAttributeExtension$ForField$FieldAttributeVisitor r6 = new net.bytebuddy.asm.MemberAttributeExtension$ForField$FieldAttributeVisitor
                T r0 = r7.attributeAppenderFactory
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r0 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory) r0
                net.bytebuddy.implementation.attribute.FieldAttributeAppender r3 = r0.make(r8)
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r8 = r7.annotationValueFilterFactory
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r4 = r8.on(r9)
                r5 = 0
                r0 = r6
                r1 = r10
                r2 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }
    }

    public static class ForMethod extends net.bytebuddy.asm.MemberAttributeExtension<net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory> implements net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {

        public static class AttributeAppendingMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
            private final net.bytebuddy.implementation.attribute.AnnotationValueFilter annotationValueFilter;
            private boolean applicable;
            private final net.bytebuddy.implementation.attribute.MethodAttributeAppender methodAttributeAppender;
            private final net.bytebuddy.description.method.MethodDescription methodDescription;

            private AttributeAppendingMethodVisitor(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.attribute.MethodAttributeAppender r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                    r1 = this;
                    int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r1.<init>(r0, r2)
                    r1.methodDescription = r3
                    r1.methodAttributeAppender = r4
                    r1.annotationValueFilter = r5
                    r2 = 1
                    r1.applicable = r2
                    return
            }

            public /* synthetic */ AttributeAppendingMethodVisitor(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter r4, net.bytebuddy.asm.MemberAttributeExtension.AnonymousClass1 r5) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitCode() {
                    r4 = this;
                    boolean r0 = r4.applicable
                    if (r0 == 0) goto L12
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender r0 = r4.methodAttributeAppender
                    net.bytebuddy.jar.asm.MethodVisitor r1 = r4.mv
                    net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter r3 = r4.annotationValueFilter
                    r0.apply(r1, r2, r3)
                    r0 = 0
                    r4.applicable = r0
                L12:
                    super.visitCode()
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitEnd() {
                    r4 = this;
                    boolean r0 = r4.applicable
                    if (r0 == 0) goto L12
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender r0 = r4.methodAttributeAppender
                    net.bytebuddy.jar.asm.MethodVisitor r1 = r4.mv
                    net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter r3 = r4.annotationValueFilter
                    r0.apply(r1, r2, r3)
                    r0 = 0
                    r4.applicable = r0
                L12:
                    super.visitEnd()
                    return
            }
        }

        public ForMethod() {
                r1 = this;
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default r0 = net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.APPEND_DEFAULTS
                r1.<init>(r0)
                return
        }

        public ForMethod(net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2) {
                r1 = this;
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.INSTANCE
                r1.<init>(r2, r0)
                return
        }

        public ForMethod(net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod annotateMethod(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
                r2 = this;
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r3)
                r0.<init>(r1)
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r3 = r2.attribute(r0)
                return r3
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod annotateMethod(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                r0.<init>(r2)
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r2 = r1.annotateMethod(r0)
                return r2
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod annotateMethod(java.lang.annotation.Annotation... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r1 = r0.annotateMethod(r1)
                return r1
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod annotateMethod(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r1 = r0.annotateMethod(r1)
                return r1
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod annotateParameter(int r3, java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                r2 = this;
                if (r3 < 0) goto L11
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r4)
                r0.<init>(r3, r1)
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r3 = r2.attribute(r0)
                return r3
            L11:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Parameter index cannot be negative: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod annotateParameter(int r2, java.util.List<? extends java.lang.annotation.Annotation> r3) {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                r0.<init>(r3)
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r2 = r1.annotateParameter(r2, r0)
                return r2
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod annotateParameter(int r1, java.lang.annotation.Annotation... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r1 = r0.annotateParameter(r1, r2)
                return r1
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod annotateParameter(int r1, net.bytebuddy.description.annotation.AnnotationDescription... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r1 = r0.annotateParameter(r1, r2)
                return r1
        }

        public net.bytebuddy.asm.MemberAttributeExtension.ForMethod attribute(net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r7) {
                r6 = this;
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod r0 = new net.bytebuddy.asm.MemberAttributeExtension$ForMethod
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r1 = r6.annotationValueFilterFactory
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r2 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound
                T r3 = r6.attributeAppenderFactory
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r3 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory) r3
                r4 = 2
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory[] r4 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory[r4]
                r5 = 0
                r4[r5] = r3
                r3 = 1
                r4[r3] = r7
                r2.<init>(r4)
                r0.<init>(r1, r2)
                return r0
        }

        public net.bytebuddy.asm.AsmVisitorWrapper on(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
                r3 = this;
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r0 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods
                r0.<init>()
                r1 = 1
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper[] r1 = new net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper[r1]
                r2 = 0
                r1[r2] = r3
                net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r4 = r0.invokable(r4, r1)
                return r4
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
        public net.bytebuddy.jar.asm.MethodVisitor wrap(net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.description.method.MethodDescription r8, net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10, net.bytebuddy.pool.TypePool r11, int r12, int r13) {
                r6 = this;
                net.bytebuddy.asm.MemberAttributeExtension$ForMethod$AttributeAppendingMethodVisitor r10 = new net.bytebuddy.asm.MemberAttributeExtension$ForMethod$AttributeAppendingMethodVisitor
                T r11 = r6.attributeAppenderFactory
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r11 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory) r11
                net.bytebuddy.implementation.attribute.MethodAttributeAppender r3 = r11.make(r7)
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r7 = r6.annotationValueFilterFactory
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r4 = r7.on(r8)
                r5 = 0
                r0 = r10
                r1 = r9
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r10
        }
    }

    public MemberAttributeExtension(net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.annotationValueFilterFactory = r1
            r0.attributeAppenderFactory = r2
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
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r4.annotationValueFilterFactory
            net.bytebuddy.asm.MemberAttributeExtension r5 = (net.bytebuddy.asm.MemberAttributeExtension) r5
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r5.annotationValueFilterFactory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            T r2 = r4.attributeAppenderFactory
            T r5 = r5.attributeAppenderFactory
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
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r1 = r2.annotationValueFilterFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            T r1 = r2.attributeAppenderFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}

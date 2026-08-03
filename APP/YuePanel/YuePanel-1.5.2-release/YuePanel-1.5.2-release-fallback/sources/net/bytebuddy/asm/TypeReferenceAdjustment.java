package net.bytebuddy.asm;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class TypeReferenceAdjustment extends net.bytebuddy.asm.AsmVisitorWrapper.AbstractBase {
    private final net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.type.TypeDescription> filter;
    private final boolean strict;

    public static class TypeReferenceClassVisitor extends net.bytebuddy.jar.asm.ClassVisitor {

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final net.bytebuddy.jar.asm.AnnotationVisitor IGNORE_ANNOTATION = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final net.bytebuddy.jar.asm.FieldVisitor IGNORE_FIELD = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final net.bytebuddy.jar.asm.MethodVisitor IGNORE_METHOD = null;
        private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> filter;
        private final java.util.Set<java.lang.String> observedTypes;
        private final boolean strict;
        private final net.bytebuddy.pool.TypePool typePool;
        private final java.util.Set<java.lang.String> visitedInnerTypes;

        public class TypeReferenceAnnotationVisitor extends net.bytebuddy.jar.asm.AnnotationVisitor {
            final /* synthetic */ net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor this$0;

            public TypeReferenceAnnotationVisitor(net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor r1, net.bytebuddy.jar.asm.AnnotationVisitor r2) {
                    r0 = this;
                    r0.this$0 = r1
                    int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r0.<init>(r1, r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.AnnotationVisitor
            public void visit(java.lang.String r2, java.lang.Object r3) {
                    r1 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r1.this$0
                    r0.resolve(r3)
                    super.visit(r2, r3)
                    return
            }

            @Override // net.bytebuddy.jar.asm.AnnotationVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r3, java.lang.String r4) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r4)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitAnnotation(r3, r4)
                    if (r3 == 0) goto L1f
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    r4.<init>(r0, r3)
                    return r4
                L1f:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }

            @Override // net.bytebuddy.jar.asm.AnnotationVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitArray(java.lang.String r3) {
                    r2 = this;
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitArray(r3)
                    if (r3 == 0) goto Le
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r0 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r1 = r2.this$0
                    r0.<init>(r1, r3)
                    return r0
                Le:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }

            @Override // net.bytebuddy.jar.asm.AnnotationVisitor
            public void visitEnum(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r4)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    super.visitEnum(r3, r4, r5)
                    return
            }
        }

        public class TypeReferenceFieldVisitor extends net.bytebuddy.jar.asm.FieldVisitor {
            final /* synthetic */ net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor this$0;

            public TypeReferenceFieldVisitor(net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor r1, net.bytebuddy.jar.asm.FieldVisitor r2) {
                    r0 = this;
                    r0.this$0 = r1
                    int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r0.<init>(r1, r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.FieldVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r3, boolean r4) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r3)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitAnnotation(r3, r4)
                    if (r3 == 0) goto L1f
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    r4.<init>(r0, r3)
                    return r4
                L1f:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }
        }

        public class TypeReferenceMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
            final /* synthetic */ net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor this$0;

            public TypeReferenceMethodVisitor(net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor r1, net.bytebuddy.jar.asm.MethodVisitor r2) {
                    r0 = this;
                    r0.this$0 = r1
                    int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r0.<init>(r1, r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r3, boolean r4) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r3)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitAnnotation(r3, r4)
                    if (r3 == 0) goto L1f
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    r4.<init>(r0, r3)
                    return r4
                L1f:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotationDefault() {
                    r3 = this;
                    net.bytebuddy.jar.asm.AnnotationVisitor r0 = super.visitAnnotationDefault()
                    if (r0 == 0) goto Le
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r1 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r2 = r3.this$0
                    r1.<init>(r2, r0)
                    return r1
                Le:
                    net.bytebuddy.jar.asm.AnnotationVisitor r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r0
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitFieldInsn(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$200(r0, r4)
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r6)
                    r0.resolve(r1)
                    super.visitFieldInsn(r3, r4, r5, r6)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitInsnAnnotation(int r3, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r5)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitInsnAnnotation(r3, r4, r5, r6)
                    if (r3 == 0) goto L1f
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r5 = r2.this$0
                    r4.<init>(r5, r3)
                    return r4
                L1f:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitInvokeDynamicInsn(java.lang.String r5, java.lang.String r6, net.bytebuddy.jar.asm.Handle r7, java.lang.Object... r8) {
                    r4 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r4.this$0
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r6)
                    r0.resolve(r1)
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r4.this$0
                    r0.resolve(r7)
                    int r0 = r8.length
                    r1 = 0
                L10:
                    if (r1 >= r0) goto L1c
                    r2 = r8[r1]
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r3 = r4.this$0
                    r3.resolve(r2)
                    int r1 = r1 + 1
                    goto L10
                L1c:
                    super.visitInvokeDynamicInsn(r5, r6, r7, r8)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitLdcInsn(java.lang.Object r2) {
                    r1 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r1.this$0
                    r0.resolve(r2)
                    super.visitLdcInsn(r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitLocalVariableAnnotation(int r3, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r4, net.bytebuddy.jar.asm.Label[] r5, net.bytebuddy.jar.asm.Label[] r6, int[] r7, java.lang.String r8, boolean r9) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r8)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitLocalVariableAnnotation(r3, r4, r5, r6, r7, r8, r9)
                    if (r3 == 0) goto L1f
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r5 = r2.this$0
                    r4.<init>(r5, r3)
                    return r4
                L1f:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitMethodInsn(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$200(r0, r4)
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r6)
                    r0.resolve(r1)
                    super.visitMethodInsn(r3, r4, r5, r6, r7)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitMultiANewArrayInsn(java.lang.String r3, int r4) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r3)
                    r0.resolve(r1)
                    super.visitMultiANewArrayInsn(r3, r4)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitParameterAnnotation(int r3, java.lang.String r4, boolean r5) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r4)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitParameterAnnotation(r3, r4, r5)
                    if (r3 == 0) goto L1f
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r5 = r2.this$0
                    r4.<init>(r5, r3)
                    return r4
                L1f:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitTryCatchAnnotation(int r3, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r5)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitTryCatchAnnotation(r3, r4, r5, r6)
                    if (r3 == 0) goto L1f
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r5 = r2.this$0
                    r4.<init>(r5, r3)
                    return r4
                L1f:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitTryCatchBlock(net.bytebuddy.jar.asm.Label r2, net.bytebuddy.jar.asm.Label r3, net.bytebuddy.jar.asm.Label r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5) {
                    r1 = this;
                    if (r5 == 0) goto Lb
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r1.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    r0.add(r5)
                Lb:
                    super.visitTryCatchBlock(r2, r3, r4, r5)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r3, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
                    r2 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r2.this$0
                    java.util.Set r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$000(r0)
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r5)
                    java.lang.String r1 = r1.getInternalName()
                    r0.add(r1)
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitTypeAnnotation(r3, r4, r5, r6)
                    if (r3 == 0) goto L1f
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r5 = r2.this$0
                    r4.<init>(r5, r3)
                    return r4
                L1f:
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$100()
                    return r3
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitTypeInsn(int r2, java.lang.String r3) {
                    r1 = this;
                    net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r0 = r1.this$0
                    net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.access$200(r0, r3)
                    super.visitTypeInsn(r2, r3)
                    return
            }
        }

        static {
                return
        }

        public TypeReferenceClassVisitor(net.bytebuddy.jar.asm.ClassVisitor r2, boolean r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r4, net.bytebuddy.pool.TypePool r5) {
                r1 = this;
                int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                r1.<init>(r0, r2)
                r1.typePool = r5
                r1.strict = r3
                r1.filter = r4
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                r1.observedTypes = r2
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                r1.visitedInnerTypes = r2
                return
        }

        public static /* synthetic */ java.util.Set access$000(net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor r0) {
                java.util.Set<java.lang.String> r0 = r0.observedTypes
                return r0
        }

        public static /* synthetic */ net.bytebuddy.jar.asm.AnnotationVisitor access$100() {
                net.bytebuddy.jar.asm.AnnotationVisitor r0 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.IGNORE_ANNOTATION
                return r0
        }

        public static /* synthetic */ void access$200(net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor r0, java.lang.String r1) {
                r0.observeInternalName(r1)
                return
        }

        private void observeInternalName(java.lang.String r3) {
                r2 = this;
                r0 = 91
                int r0 = r3.lastIndexOf(r0)
                r1 = -1
                if (r0 == r1) goto L15
                int r0 = r0 + 2
                int r1 = r3.length()
                int r1 = r1 + (-1)
                java.lang.String r3 = r3.substring(r0, r1)
            L15:
                java.util.Set<java.lang.String> r0 = r2.observedTypes
                r0.add(r3)
                return
        }

        public void resolve(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof net.bytebuddy.jar.asm.Type
                if (r0 == 0) goto La
                net.bytebuddy.jar.asm.Type r2 = (net.bytebuddy.jar.asm.Type) r2
                r1.resolve(r2)
                goto L1d
            La:
                boolean r0 = r2 instanceof net.bytebuddy.jar.asm.Handle
                if (r0 == 0) goto L14
                net.bytebuddy.jar.asm.Handle r2 = (net.bytebuddy.jar.asm.Handle) r2
                r1.resolve(r2)
                goto L1d
            L14:
                boolean r0 = r2 instanceof net.bytebuddy.jar.asm.ConstantDynamic
                if (r0 == 0) goto L1d
                net.bytebuddy.jar.asm.ConstantDynamic r2 = (net.bytebuddy.jar.asm.ConstantDynamic) r2
                r1.resolve(r2)
            L1d:
                return
        }

        public void resolve(net.bytebuddy.jar.asm.ConstantDynamic r6) {
                r5 = this;
                java.lang.String r0 = r6.getDescriptor()
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r0)
                net.bytebuddy.jar.asm.Type r1 = r0.getReturnType()
                r5.resolve(r1)
                net.bytebuddy.jar.asm.Type[] r0 = r0.getArgumentTypes()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L16:
                if (r3 >= r1) goto L20
                r4 = r0[r3]
                r5.resolve(r4)
                int r3 = r3 + 1
                goto L16
            L20:
                net.bytebuddy.jar.asm.Handle r0 = r6.getBootstrapMethod()
                r5.resolve(r0)
            L27:
                int r0 = r6.getBootstrapMethodArgumentCount()
                if (r2 >= r0) goto L37
                java.lang.Object r0 = r6.getBootstrapMethodArgument(r2)
                r5.resolve(r0)
                int r2 = r2 + 1
                goto L27
            L37:
                return
        }

        public void resolve(net.bytebuddy.jar.asm.Handle r4) {
                r3 = this;
                java.util.Set<java.lang.String> r0 = r3.observedTypes
                java.lang.String r1 = r4.getOwner()
                r0.add(r1)
                java.lang.String r4 = r4.getDesc()
                net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r4)
                net.bytebuddy.jar.asm.Type r0 = r4.getReturnType()
                r3.resolve(r0)
                net.bytebuddy.jar.asm.Type[] r4 = r4.getArgumentTypes()
                int r0 = r4.length
                r1 = 0
            L1e:
                if (r1 >= r0) goto L28
                r2 = r4[r1]
                r3.resolve(r2)
                int r1 = r1 + 1
                goto L1e
            L28:
                return
        }

        public void resolve(net.bytebuddy.jar.asm.Type r4) {
                r3 = this;
                int r0 = r4.getSort()
                r1 = 11
                if (r0 != r1) goto L1f
                net.bytebuddy.jar.asm.Type r0 = r4.getReturnType()
                r3.resolve(r0)
                net.bytebuddy.jar.asm.Type[] r4 = r4.getArgumentTypes()
                int r0 = r4.length
                r1 = 0
            L15:
                if (r1 >= r0) goto L3d
                r2 = r4[r1]
                r3.resolve(r2)
                int r1 = r1 + 1
                goto L15
            L1f:
                int r0 = r4.getSort()
                r1 = 9
                if (r0 != r1) goto L2c
                net.bytebuddy.jar.asm.Type r4 = r4.getElementType()
                goto L1f
            L2c:
                int r0 = r4.getSort()
                r1 = 10
                if (r0 != r1) goto L3d
                java.util.Set<java.lang.String> r0 = r3.observedTypes
                java.lang.String r4 = r4.getInternalName()
                r0.add(r4)
            L3d:
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        public void visit(int r3, int r4, java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r8) {
                r2 = this;
                if (r7 == 0) goto L7
                java.util.Set<java.lang.String> r0 = r2.observedTypes
                r0.add(r7)
            L7:
                if (r8 == 0) goto L12
                java.util.Set<java.lang.String> r0 = r2.observedTypes
                java.util.List r1 = java.util.Arrays.asList(r8)
                r0.addAll(r1)
            L12:
                super.visit(r3, r4, r5, r6, r7, r8)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r3, boolean r4) {
                r2 = this;
                java.util.Set<java.lang.String> r0 = r2.observedTypes
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r3)
                java.lang.String r1 = r1.getInternalName()
                r0.add(r1)
                net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitAnnotation(r3, r4)
                if (r3 == 0) goto L19
                net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                r4.<init>(r2, r3)
                return r4
            L19:
                net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.IGNORE_ANNOTATION
                return r3
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public void visitEnd() {
                r6 = this;
                java.util.Set<java.lang.String> r0 = r6.observedTypes
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.Set<java.lang.String> r2 = r6.visitedInnerTypes
                boolean r2 = r2.add(r1)
                if (r2 == 0) goto L6
                net.bytebuddy.pool.TypePool r2 = r6.typePool
                r3 = 47
                r4 = 46
                java.lang.String r5 = r1.replace(r3, r4)
                net.bytebuddy.pool.TypePool$Resolution r2 = r2.describe(r5)
                boolean r5 = r2.isResolved()
                if (r5 == 0) goto L83
                net.bytebuddy.description.type.TypeDescription r1 = r2.resolve()
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2 = r6.filter
                boolean r2 = r2.matches(r1)
                if (r2 != 0) goto L6
            L3a:
                if (r1 == 0) goto L6
                boolean r2 = r1.isNestedClass()
                if (r2 == 0) goto L6
                java.lang.String r2 = r1.getInternalName()
                boolean r3 = r1.isMemberType()
                r4 = 0
                if (r3 == 0) goto L56
                net.bytebuddy.description.type.TypeDescription r3 = r1.getDeclaringType()
                java.lang.String r3 = r3.getInternalName()
                goto L57
            L56:
                r3 = r4
            L57:
                boolean r5 = r1.isAnonymousType()
                if (r5 == 0) goto L5e
                goto L62
            L5e:
                java.lang.String r4 = r1.getSimpleName()
            L62:
                int r5 = r1.getModifiers()
                super.visitInnerClass(r2, r3, r4, r5)
            L69:
                net.bytebuddy.description.type.TypeDescription r1 = r1.getEnclosingType()     // Catch: java.lang.RuntimeException -> L7c
                if (r1 == 0) goto L3a
                java.util.Set<java.lang.String> r2 = r6.visitedInnerTypes     // Catch: java.lang.RuntimeException -> L7c
                java.lang.String r3 = r1.getInternalName()     // Catch: java.lang.RuntimeException -> L7c
                boolean r2 = r2.add(r3)     // Catch: java.lang.RuntimeException -> L7c
                if (r2 == 0) goto L69
                goto L3a
            L7c:
                r1 = move-exception
                boolean r2 = r6.strict
                if (r2 != 0) goto L82
                goto L6
            L82:
                throw r1
            L83:
                boolean r2 = r6.strict
                if (r2 != 0) goto L89
                goto L6
            L89:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "Could not locate type for: "
                r2.append(r5)
                java.lang.String r1 = r1.replace(r3, r4)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            La4:
                super.visitEnd()
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.FieldVisitor visitField(int r1, java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r0 = this;
                net.bytebuddy.jar.asm.FieldVisitor r1 = super.visitField(r1, r2, r3, r4, r5)
                if (r1 == 0) goto L13
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r3)
                r0.resolve(r2)
                net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceFieldVisitor r2 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceFieldVisitor
                r2.<init>(r0, r1)
                return r2
            L13:
                net.bytebuddy.jar.asm.FieldVisitor r1 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.IGNORE_FIELD
                return r1
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        public void visitInnerClass(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.visitedInnerTypes
                r0.add(r2)
                super.visitInnerClass(r2, r3, r4, r5)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r1, java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r5) {
                r0 = this;
                net.bytebuddy.jar.asm.MethodVisitor r1 = super.visitMethod(r1, r2, r3, r4, r5)
                if (r1 == 0) goto L1e
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r3)
                r0.resolve(r2)
                if (r5 == 0) goto L18
                java.util.Set<java.lang.String> r2 = r0.observedTypes
                java.util.List r3 = java.util.Arrays.asList(r5)
                r2.addAll(r3)
            L18:
                net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceMethodVisitor r2 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceMethodVisitor
                r2.<init>(r0, r1)
                return r2
            L1e:
                net.bytebuddy.jar.asm.MethodVisitor r1 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.IGNORE_METHOD
                return r1
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        public void visitNestHost(java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.observedTypes
                r0.add(r2)
                super.visitNestHost(r2)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        public void visitNestMember(java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.observedTypes
                r0.add(r2)
                super.visitNestMember(r2)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        public void visitOuterClass(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.observedTypes
                r0.add(r2)
                super.visitOuterClass(r2, r3, r4)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r3, java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5) {
                r2 = this;
                java.util.Set<java.lang.String> r0 = r2.observedTypes
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r4)
                java.lang.String r1 = r1.getInternalName()
                r0.add(r1)
                net.bytebuddy.jar.asm.RecordComponentVisitor r3 = super.visitRecordComponent(r3, r4, r5)
                return r3
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r3, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
                r2 = this;
                java.util.Set<java.lang.String> r0 = r2.observedTypes
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r5)
                java.lang.String r1 = r1.getInternalName()
                r0.add(r1)
                net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitTypeAnnotation(r3, r4, r5, r6)
                if (r3 == 0) goto L19
                net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor r4 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor$TypeReferenceAnnotationVisitor
                r4.<init>(r2, r3)
                return r4
            L19:
                net.bytebuddy.jar.asm.AnnotationVisitor r3 = net.bytebuddy.asm.TypeReferenceAdjustment.TypeReferenceClassVisitor.IGNORE_ANNOTATION
                return r3
        }
    }

    public TypeReferenceAdjustment(boolean r1, net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.type.TypeDescription> r2) {
            r0 = this;
            r0.<init>()
            r0.strict = r1
            r0.filter = r2
            return
    }

    public static net.bytebuddy.asm.TypeReferenceAdjustment relaxed() {
            net.bytebuddy.asm.TypeReferenceAdjustment r0 = new net.bytebuddy.asm.TypeReferenceAdjustment
            r1 = 0
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.none()
            r0.<init>(r1, r2)
            return r0
    }

    public static net.bytebuddy.asm.TypeReferenceAdjustment strict() {
            net.bytebuddy.asm.TypeReferenceAdjustment r0 = new net.bytebuddy.asm.TypeReferenceAdjustment
            r1 = 1
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.none()
            r0.<init>(r1, r2)
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
            boolean r2 = r4.strict
            net.bytebuddy.asm.TypeReferenceAdjustment r5 = (net.bytebuddy.asm.TypeReferenceAdjustment) r5
            boolean r3 = r5.strict
            if (r2 == r3) goto L1c
            return r1
        L1c:
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r2 = r4.filter
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r5 = r5.filter
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    public net.bytebuddy.asm.TypeReferenceAdjustment filter(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r4) {
            r3 = this;
            net.bytebuddy.asm.TypeReferenceAdjustment r0 = new net.bytebuddy.asm.TypeReferenceAdjustment
            boolean r1 = r3.strict
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r2 = r3.filter
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = r2.or(r4)
            r0.<init>(r1, r4)
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.strict
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r1 = r2.filter
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.pool.TypePool r4, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5, net.bytebuddy.description.method.MethodList<?> r6, int r7, int r8) {
            r0 = this;
            net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor r1 = new net.bytebuddy.asm.TypeReferenceAdjustment$TypeReferenceClassVisitor
            boolean r3 = r0.strict
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r5 = r0.filter
            r1.<init>(r2, r3, r5, r4)
            return r1
    }
}

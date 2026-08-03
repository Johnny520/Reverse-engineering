package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassGenerator {

    /* JADX INFO: renamed from: cg, reason: collision with root package name */
    private static bsh.ClassGenerator f923cg;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ClassNodeFilter implements bsh.BSHBlock.NodeFilter {
        public static bsh.ClassGenerator.ClassNodeFilter CLASSCLASSES;
        public static bsh.ClassGenerator.ClassNodeFilter CLASSINSTANCEFIELDS;
        public static bsh.ClassGenerator.ClassNodeFilter CLASSINSTANCEMETHODS;
        public static bsh.ClassGenerator.ClassNodeFilter CLASSSTATICFIELDS;
        public static bsh.ClassGenerator.ClassNodeFilter CLASSSTATICMETHODS;
        bsh.ClassGenerator.ClassNodeFilter.Context context;
        bsh.ClassGenerator.ClassNodeFilter.Types types;

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum Context extends java.lang.Enum<bsh.ClassGenerator.ClassNodeFilter.Context> {
            private static final /* synthetic */ bsh.ClassGenerator.ClassNodeFilter.Context[] $VALUES = null;
            public static final bsh.ClassGenerator.ClassNodeFilter.Context CLASSES = null;
            public static final bsh.ClassGenerator.ClassNodeFilter.Context INSTANCE = null;
            public static final bsh.ClassGenerator.ClassNodeFilter.Context STATIC = null;

            private static /* synthetic */ bsh.ClassGenerator.ClassNodeFilter.Context[] $values() {
                    bsh.ClassGenerator$ClassNodeFilter$Context r0 = bsh.ClassGenerator.ClassNodeFilter.Context.STATIC
                    bsh.ClassGenerator$ClassNodeFilter$Context r1 = bsh.ClassGenerator.ClassNodeFilter.Context.INSTANCE
                    bsh.ClassGenerator$ClassNodeFilter$Context r2 = bsh.ClassGenerator.ClassNodeFilter.Context.CLASSES
                    bsh.ClassGenerator$ClassNodeFilter$Context[] r0 = new bsh.ClassGenerator.ClassNodeFilter.Context[]{r0, r1, r2}
                    return r0
            }

            static {
                    bsh.ClassGenerator$ClassNodeFilter$Context r0 = new bsh.ClassGenerator$ClassNodeFilter$Context
                    java.lang.String r1 = "STATIC"
                    r2 = 0
                    r0.<init>(r1, r2)
                    bsh.ClassGenerator.ClassNodeFilter.Context.STATIC = r0
                    bsh.ClassGenerator$ClassNodeFilter$Context r0 = new bsh.ClassGenerator$ClassNodeFilter$Context
                    java.lang.String r1 = "INSTANCE"
                    r2 = 1
                    r0.<init>(r1, r2)
                    bsh.ClassGenerator.ClassNodeFilter.Context.INSTANCE = r0
                    bsh.ClassGenerator$ClassNodeFilter$Context r0 = new bsh.ClassGenerator$ClassNodeFilter$Context
                    java.lang.String r1 = "CLASSES"
                    r2 = 2
                    r0.<init>(r1, r2)
                    bsh.ClassGenerator.ClassNodeFilter.Context.CLASSES = r0
                    bsh.ClassGenerator$ClassNodeFilter$Context[] r0 = $values()
                    bsh.ClassGenerator.ClassNodeFilter.Context.$VALUES = r0
                    return
            }

            Context(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static bsh.ClassGenerator.ClassNodeFilter.Context valueOf(java.lang.String r1) {
                    java.lang.Class<bsh.ClassGenerator$ClassNodeFilter$Context> r0 = bsh.ClassGenerator.ClassNodeFilter.Context.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    bsh.ClassGenerator$ClassNodeFilter$Context r1 = (bsh.ClassGenerator.ClassNodeFilter.Context) r1
                    return r1
            }

            public static bsh.ClassGenerator.ClassNodeFilter.Context[] values() {
                    bsh.ClassGenerator$ClassNodeFilter$Context[] r0 = bsh.ClassGenerator.ClassNodeFilter.Context.$VALUES
                    java.lang.Object r0 = r0.clone()
                    bsh.ClassGenerator$ClassNodeFilter$Context[] r0 = (bsh.ClassGenerator.ClassNodeFilter.Context[]) r0
                    return r0
            }
        }

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum Types extends java.lang.Enum<bsh.ClassGenerator.ClassNodeFilter.Types> {
            private static final /* synthetic */ bsh.ClassGenerator.ClassNodeFilter.Types[] $VALUES = null;
            public static final bsh.ClassGenerator.ClassNodeFilter.Types ALL = null;
            public static final bsh.ClassGenerator.ClassNodeFilter.Types FIELDS = null;
            public static final bsh.ClassGenerator.ClassNodeFilter.Types METHODS = null;

            private static /* synthetic */ bsh.ClassGenerator.ClassNodeFilter.Types[] $values() {
                    bsh.ClassGenerator$ClassNodeFilter$Types r0 = bsh.ClassGenerator.ClassNodeFilter.Types.ALL
                    bsh.ClassGenerator$ClassNodeFilter$Types r1 = bsh.ClassGenerator.ClassNodeFilter.Types.METHODS
                    bsh.ClassGenerator$ClassNodeFilter$Types r2 = bsh.ClassGenerator.ClassNodeFilter.Types.FIELDS
                    bsh.ClassGenerator$ClassNodeFilter$Types[] r0 = new bsh.ClassGenerator.ClassNodeFilter.Types[]{r0, r1, r2}
                    return r0
            }

            static {
                    bsh.ClassGenerator$ClassNodeFilter$Types r0 = new bsh.ClassGenerator$ClassNodeFilter$Types
                    java.lang.String r1 = "ALL"
                    r2 = 0
                    r0.<init>(r1, r2)
                    bsh.ClassGenerator.ClassNodeFilter.Types.ALL = r0
                    bsh.ClassGenerator$ClassNodeFilter$Types r0 = new bsh.ClassGenerator$ClassNodeFilter$Types
                    java.lang.String r1 = "METHODS"
                    r2 = 1
                    r0.<init>(r1, r2)
                    bsh.ClassGenerator.ClassNodeFilter.Types.METHODS = r0
                    bsh.ClassGenerator$ClassNodeFilter$Types r0 = new bsh.ClassGenerator$ClassNodeFilter$Types
                    java.lang.String r1 = "FIELDS"
                    r2 = 2
                    r0.<init>(r1, r2)
                    bsh.ClassGenerator.ClassNodeFilter.Types.FIELDS = r0
                    bsh.ClassGenerator$ClassNodeFilter$Types[] r0 = $values()
                    bsh.ClassGenerator.ClassNodeFilter.Types.$VALUES = r0
                    return
            }

            Types(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static bsh.ClassGenerator.ClassNodeFilter.Types valueOf(java.lang.String r1) {
                    java.lang.Class<bsh.ClassGenerator$ClassNodeFilter$Types> r0 = bsh.ClassGenerator.ClassNodeFilter.Types.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    bsh.ClassGenerator$ClassNodeFilter$Types r1 = (bsh.ClassGenerator.ClassNodeFilter.Types) r1
                    return r1
            }

            public static bsh.ClassGenerator.ClassNodeFilter.Types[] values() {
                    bsh.ClassGenerator$ClassNodeFilter$Types[] r0 = bsh.ClassGenerator.ClassNodeFilter.Types.$VALUES
                    java.lang.Object r0 = r0.clone()
                    bsh.ClassGenerator$ClassNodeFilter$Types[] r0 = (bsh.ClassGenerator.ClassNodeFilter.Types[]) r0
                    return r0
            }
        }

        static {
                bsh.ClassGenerator$ClassNodeFilter r0 = new bsh.ClassGenerator$ClassNodeFilter
                bsh.ClassGenerator$ClassNodeFilter$Context r1 = bsh.ClassGenerator.ClassNodeFilter.Context.STATIC
                bsh.ClassGenerator$ClassNodeFilter$Types r2 = bsh.ClassGenerator.ClassNodeFilter.Types.FIELDS
                r0.<init>(r1, r2)
                bsh.ClassGenerator.ClassNodeFilter.CLASSSTATICFIELDS = r0
                bsh.ClassGenerator$ClassNodeFilter r0 = new bsh.ClassGenerator$ClassNodeFilter
                bsh.ClassGenerator$ClassNodeFilter$Types r3 = bsh.ClassGenerator.ClassNodeFilter.Types.METHODS
                r0.<init>(r1, r3)
                bsh.ClassGenerator.ClassNodeFilter.CLASSSTATICMETHODS = r0
                bsh.ClassGenerator$ClassNodeFilter r0 = new bsh.ClassGenerator$ClassNodeFilter
                bsh.ClassGenerator$ClassNodeFilter$Context r1 = bsh.ClassGenerator.ClassNodeFilter.Context.INSTANCE
                r0.<init>(r1, r2)
                bsh.ClassGenerator.ClassNodeFilter.CLASSINSTANCEFIELDS = r0
                bsh.ClassGenerator$ClassNodeFilter r0 = new bsh.ClassGenerator$ClassNodeFilter
                r0.<init>(r1, r3)
                bsh.ClassGenerator.ClassNodeFilter.CLASSINSTANCEMETHODS = r0
                bsh.ClassGenerator$ClassNodeFilter r0 = new bsh.ClassGenerator$ClassNodeFilter
                bsh.ClassGenerator$ClassNodeFilter$Context r1 = bsh.ClassGenerator.ClassNodeFilter.Context.CLASSES
                r0.<init>(r1)
                bsh.ClassGenerator.ClassNodeFilter.CLASSCLASSES = r0
                return
        }

        private ClassNodeFilter(bsh.ClassGenerator.ClassNodeFilter.Context r2) {
                r1 = this;
                r1.<init>()
                bsh.ClassGenerator$ClassNodeFilter$Types r0 = bsh.ClassGenerator.ClassNodeFilter.Types.ALL
                r1.types = r0
                r1.context = r2
                return
        }

        private ClassNodeFilter(bsh.ClassGenerator.ClassNodeFilter.Context r2, bsh.ClassGenerator.ClassNodeFilter.Types r3) {
                r1 = this;
                r1.<init>()
                bsh.ClassGenerator$ClassNodeFilter$Types r0 = bsh.ClassGenerator.ClassNodeFilter.Types.ALL
                r1.context = r2
                r1.types = r3
                return
        }

        private boolean isInstanceMethod(bsh.Node r2) {
                r1 = this;
                boolean r0 = r2 instanceof bsh.BSHMethodDeclaration
                if (r0 == 0) goto L11
                bsh.BSHMethodDeclaration r2 = (bsh.BSHMethodDeclaration) r2
                bsh.Modifiers r2 = r2.modifiers
                java.lang.String r0 = "static"
                boolean r2 = r2.hasModifier(r0)
                r2 = r2 ^ 1
                return r2
            L11:
                r2 = 0
                return r2
        }

        private boolean isNonStatic(bsh.Node r2) {
                r1 = this;
                boolean r0 = r2 instanceof bsh.BSHMethodDeclaration
                if (r0 == 0) goto L6
                r2 = 0
                return r2
            L6:
                boolean r2 = r1.isStatic(r2)
                r2 = r2 ^ 1
                return r2
        }

        private boolean isStatic(bsh.Node r3) {
                r2 = this;
                bsh.Node r0 = r3.jjtGetParent()
                bsh.Node r0 = r0.jjtGetParent()
                boolean r0 = r0 instanceof bsh.BSHClassDeclaration
                if (r0 == 0) goto L1e
                bsh.Node r0 = r3.jjtGetParent()
                bsh.Node r0 = r0.jjtGetParent()
                bsh.BSHClassDeclaration r0 = (bsh.BSHClassDeclaration) r0
                bsh.ClassGenerator$Type r0 = r0.type
                bsh.ClassGenerator$Type r1 = bsh.ClassGenerator.Type.INTERFACE
                if (r0 != r1) goto L1e
                r3 = 1
                return r3
            L1e:
                boolean r0 = r3 instanceof bsh.BSHTypedVariableDeclaration
                if (r0 == 0) goto L2d
                bsh.BSHTypedVariableDeclaration r3 = (bsh.BSHTypedVariableDeclaration) r3
                bsh.Modifiers r3 = r3.modifiers
                java.lang.String r0 = "static"
                boolean r3 = r3.hasModifier(r0)
                return r3
            L2d:
                boolean r0 = r3 instanceof bsh.BSHBlock
                if (r0 == 0) goto L36
                bsh.BSHBlock r3 = (bsh.BSHBlock) r3
                boolean r3 = r3.isStatic
                return r3
            L36:
                r3 = 0
                return r3
        }

        private boolean isStaticMethod(bsh.Node r2) {
                r1 = this;
                boolean r0 = r2 instanceof bsh.BSHMethodDeclaration
                if (r0 == 0) goto Lf
                bsh.BSHMethodDeclaration r2 = (bsh.BSHMethodDeclaration) r2
                bsh.Modifiers r2 = r2.modifiers
                java.lang.String r0 = "static"
                boolean r2 = r2.hasModifier(r0)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // bsh.BSHBlock.NodeFilter
        public boolean isVisible(bsh.Node r4) {
                r3 = this;
                bsh.ClassGenerator$ClassNodeFilter$Context r0 = r3.context
                bsh.ClassGenerator$ClassNodeFilter$Context r1 = bsh.ClassGenerator.ClassNodeFilter.Context.CLASSES
                if (r0 != r1) goto L9
                boolean r4 = r4 instanceof bsh.BSHClassDeclaration
                return r4
            L9:
                boolean r1 = r4 instanceof bsh.BSHClassDeclaration
                if (r1 == 0) goto Lf
                r4 = 0
                return r4
            Lf:
                bsh.ClassGenerator$ClassNodeFilter$Context r1 = bsh.ClassGenerator.ClassNodeFilter.Context.STATIC
                bsh.ClassGenerator$ClassNodeFilter$Types r2 = r3.types
                if (r0 != r1) goto L23
                bsh.ClassGenerator$ClassNodeFilter$Types r0 = bsh.ClassGenerator.ClassNodeFilter.Types.METHODS
                if (r2 != r0) goto L1e
                boolean r4 = r3.isStaticMethod(r4)
                return r4
            L1e:
                boolean r4 = r3.isStatic(r4)
                return r4
            L23:
                bsh.ClassGenerator$ClassNodeFilter$Types r0 = bsh.ClassGenerator.ClassNodeFilter.Types.METHODS
                if (r2 != r0) goto L2c
                boolean r4 = r3.isInstanceMethod(r4)
                return r4
            L2c:
                boolean r4 = r3.isNonStatic(r4)
                return r4
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Type extends java.lang.Enum<bsh.ClassGenerator.Type> {
        private static final /* synthetic */ bsh.ClassGenerator.Type[] $VALUES = null;
        public static final bsh.ClassGenerator.Type CLASS = null;
        public static final bsh.ClassGenerator.Type ENUM = null;
        public static final bsh.ClassGenerator.Type INTERFACE = null;

        private static /* synthetic */ bsh.ClassGenerator.Type[] $values() {
                bsh.ClassGenerator$Type r0 = bsh.ClassGenerator.Type.CLASS
                bsh.ClassGenerator$Type r1 = bsh.ClassGenerator.Type.INTERFACE
                bsh.ClassGenerator$Type r2 = bsh.ClassGenerator.Type.ENUM
                bsh.ClassGenerator$Type[] r0 = new bsh.ClassGenerator.Type[]{r0, r1, r2}
                return r0
        }

        static {
                bsh.ClassGenerator$Type r0 = new bsh.ClassGenerator$Type
                java.lang.String r1 = "CLASS"
                r2 = 0
                r0.<init>(r1, r2)
                bsh.ClassGenerator.Type.CLASS = r0
                bsh.ClassGenerator$Type r0 = new bsh.ClassGenerator$Type
                java.lang.String r1 = "INTERFACE"
                r2 = 1
                r0.<init>(r1, r2)
                bsh.ClassGenerator.Type.INTERFACE = r0
                bsh.ClassGenerator$Type r0 = new bsh.ClassGenerator$Type
                java.lang.String r1 = "ENUM"
                r2 = 2
                r0.<init>(r1, r2)
                bsh.ClassGenerator.Type.ENUM = r0
                bsh.ClassGenerator$Type[] r0 = $values()
                bsh.ClassGenerator.Type.$VALUES = r0
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static bsh.ClassGenerator.Type valueOf(java.lang.String r1) {
                java.lang.Class<bsh.ClassGenerator$Type> r0 = bsh.ClassGenerator.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                bsh.ClassGenerator$Type r1 = (bsh.ClassGenerator.Type) r1
                return r1
        }

        public static bsh.ClassGenerator.Type[] values() {
                bsh.ClassGenerator$Type[] r0 = bsh.ClassGenerator.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                bsh.ClassGenerator$Type[] r0 = (bsh.ClassGenerator.Type[]) r0
                return r0
        }
    }

    public ClassGenerator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Class<?> generateClassImpl(java.lang.String r16, bsh.Modifiers r17, java.lang.Class<?>[] r18, java.lang.Class<?> r19, bsh.BSHBlock r20, bsh.ClassGenerator.Type r21, bsh.CallStack r22, bsh.Interpreter r23) {
            r0 = r20
            r1 = r22
            r2 = r23
            bsh.NameSpace r3 = r1.top()
            java.lang.String r7 = r3.getPackage()
            boolean r4 = r3.isClass
            if (r4 == 0) goto L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.getName()
            r4.append(r5)
            java.lang.String r5 = "$"
            r4.append(r5)
            r5 = r16
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r6 = r4
            goto L31
        L2e:
            r5 = r16
            r6 = r5
        L31:
            if (r7 != 0) goto L35
            r14 = r6
            goto L3c
        L35:
            java.lang.String r4 = "."
            java.lang.String r4 = wb.en.h(r7, r4, r6)
            r14 = r4
        L3c:
            bsh.BshClassManager r15 = r2.getClassManager()
            bsh.NameSpace r12 = new bsh.NameSpace
            r12.<init>(r3, r6)
            r4 = 1
            r12.isClass = r4
            r1.push(r12)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            bsh.ClassGenerator$ClassNodeFilter r5 = bsh.ClassGenerator.ClassNodeFilter.CLASSCLASSES
            r0.evalBlock(r1, r2, r4, r5)
            bsh.Variable[] r10 = getDeclaredVariables(r0, r1, r2, r7)
            r8 = r19
            bsh.DelayedEvalBshMethod[] r11 = getDeclaredMethods(r0, r1, r2, r7, r8)
            r1.pop()
            r12.getThis(r2)
            bsh.ClassGeneratorUtil r4 = new bsh.ClassGeneratorUtil
            r5 = r17
            r9 = r18
            r13 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4.initStaticNameSpace(r12, r0)
            java.lang.Class r0 = r15.getAssociatedClass(r14)
            if (r0 != 0) goto L92
            byte[] r0 = r4.generateClass()
            boolean r1 = bsh.Interpreter.getSaveClasses()
            if (r1 == 0) goto L83
            saveClasses(r6, r0)
        L83:
            java.lang.Class r0 = r15.defineClass(r14, r0)
            java.lang.String r1 = "Define "
            java.lang.String r4 = " as "
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r14, r4, r0}
            bsh.Interpreter.debug(r1)
        L92:
            r1 = 36
            r4 = 46
            java.lang.String r1 = r14.replace(r1, r4)
            r3.importClass(r1)
            r12.setClassStatic(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            bsh.Interpreter.debug(r1)
            boolean r1 = r2.getStrictJava()
            if (r1 == 0) goto Lb0
            bsh.ClassGeneratorUtil.checkAbstractMethodImplementation(r0)
        Lb0:
            return r0
    }

    public static bsh.ClassGenerator getClassGenerator() {
            bsh.ClassGenerator r0 = bsh.ClassGenerator.f923cg
            if (r0 != 0) goto Lb
            bsh.ClassGenerator r0 = new bsh.ClassGenerator
            r0.<init>()
            bsh.ClassGenerator.f923cg = r0
        Lb:
            bsh.ClassGenerator r0 = bsh.ClassGenerator.f923cg
            return r0
    }

    public static bsh.DelayedEvalBshMethod[] getDeclaredMethods(bsh.BSHBlock r17, bsh.CallStack r18, bsh.Interpreter r19, java.lang.String r20, java.lang.Class<?> r21) {
            r11 = r18
            r12 = r19
            r13 = r20
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            bsh.NameSpace r0 = r11.top()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "$anon"
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 <= r1) goto L54
            bsh.NameSpace r0 = r11.top()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = bsh.Types.getBaseName(r0)
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r1 = bsh.BshClassManager.memberCache
            r2 = r21
            java.lang.Object r1 = r1.get(r2)
            bsh.BshClassManager$MemberCache r1 = (bsh.BshClassManager.MemberCache) r1
            java.lang.String r2 = r2.getName()
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> r3 = bsh.This.CONTEXT_ARGS
            java.lang.Object r3 = r3.get()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r3.get(r0)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            bsh.Invocable r1 = r1.findMethod(r2, r3)
            bsh.DelayedEvalBshMethod r2 = new bsh.DelayedEvalBshMethod
            bsh.NameSpace r3 = r11.top()
            r2.<init>(r0, r1, r3)
            r14.add(r2)
        L54:
            r0 = 0
            r15 = r0
        L56:
            int r0 = r17.jjtGetNumChildren()
            if (r15 >= r0) goto Lab
            r0 = r17
            bsh.Node r1 = r0.jjtGetChild(r15)
            boolean r2 = r1 instanceof bsh.BSHMethodDeclaration
            if (r2 == 0) goto La6
            bsh.BSHMethodDeclaration r1 = (bsh.BSHMethodDeclaration) r1
            r1.insureNodesParsed()
            bsh.Modifiers r9 = r1.modifiers
            java.lang.String r2 = r1.name
            r3 = r2
            java.lang.String r2 = r1.getReturnTypeDescriptor(r11, r12, r13)
            r4 = r3
            bsh.BSHReturnType r3 = r1.getReturnTypeNode()
            bsh.BSHFormalParameters r6 = r1.paramsNode
            java.lang.String[] r5 = r6.getTypeDescriptors(r11, r12, r13)
            bsh.DelayedEvalBshMethod r0 = new bsh.DelayedEvalBshMethod
            bsh.BSHFormalParameters r7 = r1.paramsNode
            java.lang.String[] r7 = r7.getParamNames()
            r8 = r4
            r4 = r7
            bsh.BSHBlock r7 = r1.blockNode
            r10 = r8
            r8 = 0
            r16 = r10
            boolean r10 = r1.isVarArgs
            r13 = r1
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r13.isExtension
            r0.isExtension = r1
            if (r1 == 0) goto La3
            java.lang.Class r1 = r13.evalReceiverType(r11, r12)
            r0.receiverType = r1
        La3:
            r14.add(r0)
        La6:
            int r15 = r15 + 1
            r13 = r20
            goto L56
        Lab:
            int r0 = r14.size()
            bsh.DelayedEvalBshMethod[] r0 = new bsh.DelayedEvalBshMethod[r0]
            java.lang.Object[] r0 = r14.toArray(r0)
            bsh.DelayedEvalBshMethod[] r0 = (bsh.DelayedEvalBshMethod[]) r0
            return r0
    }

    public static bsh.Variable[] getDeclaredVariables(bsh.BSHBlock r11, bsh.CallStack r12, bsh.Interpreter r13, java.lang.String r14) {
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r0 = 0
            r1 = r0
        L7:
            int r2 = r11.jjtGetNumChildren()
            if (r1 >= r2) goto L51
            bsh.Node r2 = r11.jjtGetChild(r1)
            boolean r3 = r2 instanceof bsh.BSHEnumConstant
            r4 = 0
            if (r3 == 0) goto L2b
            bsh.BSHEnumConstant r2 = (bsh.BSHEnumConstant) r2
            bsh.Variable r3 = new bsh.Variable     // Catch: bsh.UtilEvalError -> L4e
            java.lang.String r5 = r2.getName()     // Catch: bsh.UtilEvalError -> L4e
            java.lang.Class r6 = r2.getType()     // Catch: bsh.UtilEvalError -> L4e
            bsh.Modifiers r2 = r2.mods     // Catch: bsh.UtilEvalError -> L4e
            r3.<init>(r5, r6, r4, r2)     // Catch: bsh.UtilEvalError -> L4e
            r14.add(r3)     // Catch: bsh.UtilEvalError -> L4e
            goto L4e
        L2b:
            boolean r3 = r2 instanceof bsh.BSHTypedVariableDeclaration
            if (r3 == 0) goto L4e
            bsh.BSHTypedVariableDeclaration r2 = (bsh.BSHTypedVariableDeclaration) r2
            bsh.Modifiers r3 = r2.modifiers
            bsh.BSHVariableDeclarator[] r5 = r2.getDeclarators()
            int r6 = r5.length
            r7 = r0
        L39:
            if (r7 >= r6) goto L4e
            r8 = r5[r7]
            java.lang.String r8 = r8.name
            java.lang.Class r9 = r2.evalType(r12, r13)     // Catch: java.lang.Throwable -> L4b
            bsh.Variable r10 = new bsh.Variable     // Catch: java.lang.Throwable -> L4b
            r10.<init>(r8, r9, r4, r3)     // Catch: java.lang.Throwable -> L4b
            r14.add(r10)     // Catch: java.lang.Throwable -> L4b
        L4b:
            int r7 = r7 + 1
            goto L39
        L4e:
            int r1 = r1 + 1
            goto L7
        L51:
            int r11 = r14.size()
            bsh.Variable[] r11 = new bsh.Variable[r11]
            java.lang.Object[] r11 = r14.toArray(r11)
            bsh.Variable[] r11 = (bsh.Variable[]) r11
            return r11
    }

    public static java.lang.Object invokeSuperclassMethodImpl(bsh.BshClassManager r6, java.lang.Object r7, java.lang.Class<?> r8, java.lang.String r9, java.lang.Object[] r10) {
            java.lang.Class r1 = r8.getSuperclass()
            java.lang.Class r8 = r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            bsh.This$Keys r2 = bsh.This.Keys.BSHSUPER
            r0.append(r2)
            java.lang.String r2 = r1.getSimpleName()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.Class[] r2 = bsh.Types.getTypes(r10)
            r3 = 0
            bsh.Invocable r8 = bsh.Reflect.resolveJavaMethod(r8, r0, r2, r3)
            if (r8 == 0) goto L30
            java.lang.Object r6 = r8.invoke(r7, r10)
            return r6
        L30:
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r9
            r4 = r10
            bsh.Invocable r6 = bsh.Reflect.resolveExpectedJavaMethod(r0, r1, r2, r3, r4, r5)
            java.lang.Object r6 = r6.invoke(r2, r4)
            return r6
    }

    private static void saveClasses(java.lang.String r3, byte[] r4) {
            java.lang.String r0 = bsh.Interpreter.getSaveClassesDir()
            if (r0 == 0) goto L39
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r2.<init>()     // Catch: java.io.IOException -> L35
            r2.append(r0)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = "/"
            r2.append(r0)     // Catch: java.io.IOException -> L35
            r2.append(r3)     // Catch: java.io.IOException -> L35
            java.lang.String r3 = ".class"
            r2.append(r3)     // Catch: java.io.IOException -> L35
            java.lang.String r3 = r2.toString()     // Catch: java.io.IOException -> L35
            r1.<init>(r3)     // Catch: java.io.IOException -> L35
            r1.write(r4)     // Catch: java.lang.Throwable -> L2b
            r1.close()     // Catch: java.io.IOException -> L35
            return
        L2b:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.io.IOException -> L35
        L34:
            throw r3     // Catch: java.io.IOException -> L35
        L35:
            r3 = move-exception
            r3.printStackTrace()
        L39:
            return
    }

    public java.lang.Class<?> generateClass(java.lang.String r1, bsh.Modifiers r2, java.lang.Class<?>[] r3, java.lang.Class<?> r4, bsh.BSHBlock r5, bsh.ClassGenerator.Type r6, bsh.CallStack r7, bsh.Interpreter r8) {
            r0 = this;
            java.lang.Class r1 = generateClassImpl(r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public java.lang.Object invokeSuperclassMethod(bsh.BshClassManager r1, java.lang.Object r2, java.lang.Class<?> r3, java.lang.String r4, java.lang.Object[] r5) {
            r0 = this;
            java.lang.Object r1 = invokeSuperclassMethodImpl(r1, r2, r3, r4, r5)
            return r1
    }
}

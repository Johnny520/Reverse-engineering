package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class This implements java.io.Serializable, java.lang.Runnable {
    static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> CONTEXT_ARGS = null;
    private static final java.lang.ThreadLocal<bsh.Interpreter> CONTEXT_INTERPRETER = null;
    private static final java.lang.ThreadLocal<bsh.NameSpace> CONTEXT_NAMESPACE = null;
    public static final java.util.Map<java.lang.String, bsh.NameSpace> contextStore = null;
    transient bsh.Interpreter declaringInterpreter;
    private java.util.Map<java.lang.Integer, java.lang.Object> interfaces;
    private final java.lang.reflect.InvocationHandler invocationHandler;
    final bsh.NameSpace namespace;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ConstructorArgs {
        public static final bsh.This.ConstructorArgs DEFAULT = null;
        int arg;
        java.lang.Object[] args;
        public int selector;

        static {
                bsh.This$ConstructorArgs r0 = new bsh.This$ConstructorArgs
                r0.<init>()
                bsh.This.ConstructorArgs.DEFAULT = r0
                return
        }

        public ConstructorArgs() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.selector = r0
                return
        }

        public ConstructorArgs(int r1, java.lang.Object[] r2) {
                r0 = this;
                r0.<init>()
                r0.selector = r1
                r0.args = r2
                return
        }

        public boolean getBoolean() {
                r1 = this;
                java.lang.Object r0 = r1.next()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        public byte getByte() {
                r1 = this;
                java.lang.Object r0 = r1.next()
                java.lang.Number r0 = (java.lang.Number) r0
                byte r0 = r0.byteValue()
                return r0
        }

        public char getChar() {
                r1 = this;
                java.lang.Object r0 = r1.next()
                java.lang.Character r0 = (java.lang.Character) r0
                char r0 = r0.charValue()
                return r0
        }

        public double getDouble() {
                r2 = this;
                java.lang.Object r0 = r2.next()
                java.lang.Number r0 = (java.lang.Number) r0
                double r0 = r0.doubleValue()
                return r0
        }

        public float getFloat() {
                r1 = this;
                java.lang.Object r0 = r1.next()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                return r0
        }

        public int getInt() {
                r1 = this;
                java.lang.Object r0 = r1.next()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                return r0
        }

        public long getLong() {
                r2 = this;
                java.lang.Object r0 = r2.next()
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }

        public java.lang.Object getObject() {
                r1 = this;
                java.lang.Object r0 = r1.next()
                return r0
        }

        public short getShort() {
                r1 = this;
                java.lang.Object r0 = r1.next()
                java.lang.Number r0 = (java.lang.Number) r0
                short r0 = r0.shortValue()
                return r0
        }

        public java.lang.Object next() {
                r3 = this;
                java.lang.Object[] r0 = r3.args
                int r1 = r3.arg
                int r2 = r1 + 1
                r3.arg = r2
                r0 = r0[r1]
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public class Handler implements java.lang.reflect.InvocationHandler, java.io.Serializable {
        final /* synthetic */ bsh.This this$0;

        public Handler(bsh.This r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object[] r4) {
                r1 = this;
                java.lang.Object r2 = r1.invokeImpl(r2, r3, r4)     // Catch: bsh.EvalError -> L5 bsh.TargetError -> L1a
                return r2
            L5:
                r2 = move-exception
                java.io.PrintStream r3 = java.lang.System.err
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r0 = "[BeanShell] EvalError in scripted interface: "
                r4.<init>(r0)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3.println(r2)
                goto L2e
            L1a:
                r2 = move-exception
                java.io.PrintStream r3 = java.lang.System.err
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r0 = "[BeanShell] TargetError in scripted interface: "
                r4.<init>(r0)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3.println(r2)
            L2e:
                r2 = 0
                return r2
        }

        public java.lang.Object invokeImpl(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
                r6 = this;
                java.lang.String r0 = r8.getName()
                bsh.This r1 = r6.this$0
                bsh.NameSpace r1 = r1.namespace
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}
                java.lang.String r3 = "equals"
                bsh.BshMethod r1 = bsh.Reflect.getMethod(r1, r3, r2)
                boolean r2 = r0.equals(r3)
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L29
                if (r1 != 0) goto L29
                r8 = r9[r4]
                if (r7 != r8) goto L23
                goto L24
            L23:
                r3 = r4
            L24:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
                return r7
            L29:
                bsh.This r1 = r6.this$0
                bsh.NameSpace r1 = r1.namespace
                java.lang.Class[] r2 = new java.lang.Class[r4]
                java.lang.String r5 = "toString"
                bsh.BshMethod r1 = bsh.Reflect.getMethod(r1, r5, r2)
                boolean r2 = r0.equals(r5)
                if (r2 == 0) goto L8e
                if (r1 != 0) goto L8e
                java.lang.Class r7 = r7.getClass()
                java.lang.Class[] r7 = r7.getInterfaces()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                bsh.This r0 = r6.this$0
                java.lang.String r0 = r0.toString()
                r9.append(r0)
                java.lang.String r0 = "\nimplements:"
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
            L61:
                int r9 = r7.length
                if (r4 >= r9) goto L89
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r0 = " "
                r9.<init>(r0)
                r0 = r7[r4]
                java.lang.String r0 = r0.getName()
                r9.append(r0)
                int r0 = r7.length
                if (r0 <= r3) goto L7a
                java.lang.String r0 = ","
                goto L7c
            L7a:
                java.lang.String r0 = ""
            L7c:
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                r8.append(r9)
                int r4 = r4 + 1
                goto L61
            L89:
                java.lang.String r7 = r8.toString()
                return r7
            L8e:
                java.lang.Class[] r7 = r8.getParameterTypes()
                bsh.This r8 = r6.this$0
                java.lang.Object[] r7 = bsh.Primitive.wrap(r9, r7)
                java.lang.Object r7 = r8.invokeMethod(r0, r7)
                java.lang.Object r7 = bsh.Primitive.unwrap(r7)
                return r7
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Keys extends java.lang.Enum<bsh.This.Keys> {
        private static final /* synthetic */ bsh.This.Keys[] $VALUES = null;
        public static final bsh.This.Keys BSHCLASSMODIFIERS = null;
        public static final bsh.This.Keys BSHCONSTRUCTORS = null;
        public static final bsh.This.Keys BSHEXTENSIONMETHODRECEIVER = null;
        public static final bsh.This.Keys BSHINIT = null;
        public static final bsh.This.Keys BSHSTATIC = null;
        public static final bsh.This.Keys BSHSUPER = null;
        public static final bsh.This.Keys BSHTHIS = null;

        /* JADX INFO: renamed from: bsh.This$Keys$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum AnonymousClass1 extends bsh.This.Keys {
            public /* synthetic */ AnonymousClass1() {
                    r2 = this;
                    java.lang.String r0 = "BSHSTATIC"
                    r1 = 0
                    r2.<init>(r0, r1)
                    return
            }

            private AnonymousClass1(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "_bshStatic"
                    return r0
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum AnonymousClass2 extends bsh.This.Keys {
            public /* synthetic */ AnonymousClass2() {
                    r2 = this;
                    java.lang.String r0 = "BSHTHIS"
                    r1 = 1
                    r2.<init>(r0, r1)
                    return
            }

            private AnonymousClass2(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "_bshThis"
                    return r0
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum AnonymousClass3 extends bsh.This.Keys {
            public /* synthetic */ AnonymousClass3() {
                    r2 = this;
                    java.lang.String r0 = "BSHSUPER"
                    r1 = 2
                    r2.<init>(r0, r1)
                    return
            }

            private AnonymousClass3(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "_bshSuper"
                    return r0
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum AnonymousClass4 extends bsh.This.Keys {
            public /* synthetic */ AnonymousClass4() {
                    r2 = this;
                    java.lang.String r0 = "BSHINIT"
                    r1 = 3
                    r2.<init>(r0, r1)
                    return
            }

            private AnonymousClass4(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "_bshInstanceInitializer"
                    return r0
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum AnonymousClass5 extends bsh.This.Keys {
            public /* synthetic */ AnonymousClass5() {
                    r2 = this;
                    java.lang.String r0 = "BSHCONSTRUCTORS"
                    r1 = 4
                    r2.<init>(r0, r1)
                    return
            }

            private AnonymousClass5(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "_bshConstructors"
                    return r0
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum AnonymousClass6 extends bsh.This.Keys {
            public /* synthetic */ AnonymousClass6() {
                    r2 = this;
                    java.lang.String r0 = "BSHCLASSMODIFIERS"
                    r1 = 5
                    r2.<init>(r0, r1)
                    return
            }

            private AnonymousClass6(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "_bshClassModifiers"
                    return r0
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$7, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum AnonymousClass7 extends bsh.This.Keys {
            public /* synthetic */ AnonymousClass7() {
                    r2 = this;
                    java.lang.String r0 = "BSHEXTENSIONMETHODRECEIVER"
                    r1 = 6
                    r2.<init>(r0, r1)
                    return
            }

            private AnonymousClass7(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "_bshExtensionMethodReceiver"
                    return r0
            }
        }

        private static /* synthetic */ bsh.This.Keys[] $values() {
                bsh.This$Keys r0 = bsh.This.Keys.BSHSTATIC
                bsh.This$Keys r1 = bsh.This.Keys.BSHTHIS
                bsh.This$Keys r2 = bsh.This.Keys.BSHSUPER
                bsh.This$Keys r3 = bsh.This.Keys.BSHINIT
                bsh.This$Keys r4 = bsh.This.Keys.BSHCONSTRUCTORS
                bsh.This$Keys r5 = bsh.This.Keys.BSHCLASSMODIFIERS
                bsh.This$Keys r6 = bsh.This.Keys.BSHEXTENSIONMETHODRECEIVER
                bsh.This$Keys[] r0 = new bsh.This.Keys[]{r0, r1, r2, r3, r4, r5, r6}
                return r0
        }

        static {
                bsh.This$Keys$1 r0 = new bsh.This$Keys$1
                r0.<init>()
                bsh.This.Keys.BSHSTATIC = r0
                bsh.This$Keys$2 r0 = new bsh.This$Keys$2
                r0.<init>()
                bsh.This.Keys.BSHTHIS = r0
                bsh.This$Keys$3 r0 = new bsh.This$Keys$3
                r0.<init>()
                bsh.This.Keys.BSHSUPER = r0
                bsh.This$Keys$4 r0 = new bsh.This$Keys$4
                r0.<init>()
                bsh.This.Keys.BSHINIT = r0
                bsh.This$Keys$5 r0 = new bsh.This$Keys$5
                r0.<init>()
                bsh.This.Keys.BSHCONSTRUCTORS = r0
                bsh.This$Keys$6 r0 = new bsh.This$Keys$6
                r0.<init>()
                bsh.This.Keys.BSHCLASSMODIFIERS = r0
                bsh.This$Keys$7 r0 = new bsh.This$Keys$7
                r0.<init>()
                bsh.This.Keys.BSHEXTENSIONMETHODRECEIVER = r0
                bsh.This$Keys[] r0 = $values()
                bsh.This.Keys.$VALUES = r0
                return
        }

        Keys(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Keys(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static bsh.This.Keys valueOf(java.lang.String r1) {
                java.lang.Class<bsh.This$Keys> r0 = bsh.This.Keys.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                bsh.This$Keys r1 = (bsh.This.Keys) r1
                return r1
        }

        public static bsh.This.Keys[] values() {
                bsh.This$Keys[] r0 = bsh.This.Keys.$VALUES
                java.lang.Object r0 = r0.clone()
                bsh.This$Keys[] r0 = (bsh.This.Keys[]) r0
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            bsh.This.contextStore = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            bsh.This.CONTEXT_NAMESPACE = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            bsh.This.CONTEXT_INTERPRETER = r0
            bsh.h r0 = new bsh.h
            r1 = 1
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            bsh.This.CONTEXT_ARGS = r0
            return
    }

    public This(bsh.NameSpace r2, bsh.Interpreter r3) {
            r1 = this;
            r1.<init>()
            bsh.This$Handler r0 = new bsh.This$Handler
            r0.<init>(r1)
            r1.invocationHandler = r0
            r1.namespace = r2
            r1.declaringInterpreter = r3
            return
    }

    public static /* synthetic */ void a(bsh.GeneratedClass r0, java.lang.String r1) {
            lambda$initInstance$0(r0, r1)
            return
    }

    public static /* synthetic */ java.util.Map b() {
            java.util.Map r0 = lambda$static$1()
            return r0
    }

    public static void bind(bsh.This r1, bsh.NameSpace r2, bsh.Interpreter r3) {
            bsh.NameSpace r0 = r1.namespace
            r0.setParent(r2)
            r1.declaringInterpreter = r3
            return
    }

    public static bsh.This.ConstructorArgs getConstructorArgs(java.lang.Class<?> r16, bsh.This r17, java.lang.Object[] r18, int r19) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            if (r1 == 0) goto Lf0
            r4 = -1
            if (r3 != r4) goto L10
            bsh.This$ConstructorArgs r0 = bsh.This.ConstructorArgs.DEFAULT
            return r0
        L10:
            bsh.NameSpace r5 = r1.getNameSpace()     // Catch: java.lang.Exception -> Le8
            bsh.This$Keys r6 = bsh.This.Keys.BSHCONSTRUCTORS     // Catch: java.lang.Exception -> Le8
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Le8
            java.lang.Object r5 = r5.getVariable(r6)     // Catch: java.lang.Exception -> Le8
            bsh.Primitive r6 = bsh.Primitive.VOID     // Catch: java.lang.Exception -> Le8
            if (r5 == r6) goto Le0
            bsh.DelayedEvalBshMethod[] r5 = (bsh.DelayedEvalBshMethod[]) r5     // Catch: java.lang.Exception -> Le8
            r6 = r5[r3]
            java.lang.String r7 = r6.getAltConstructor()
            if (r7 != 0) goto L2f
            bsh.This$ConstructorArgs r0 = bsh.This.ConstructorArgs.DEFAULT
            return r0
        L2f:
            bsh.BSHArguments r8 = r6.getArgsNode()
            bsh.NameSpace r9 = new bsh.NameSpace
            bsh.NameSpace r10 = r1.getNameSpace()
            java.lang.String r11 = "consArgs"
            r9.<init>(r10, r11)
            java.lang.String[] r10 = r6.getParameterNames()
            java.lang.Class[] r11 = r6.getParameterTypes()
            r12 = 0
        L47:
            int r13 = r2.length
            if (r12 >= r13) goto L60
            r13 = r10[r12]     // Catch: bsh.UtilEvalError -> L58
            r14 = r11[r12]     // Catch: bsh.UtilEvalError -> L58
            r15 = r2[r12]     // Catch: bsh.UtilEvalError -> L58
            r4 = 0
            r9.setTypedVariable(r13, r14, r15, r4)     // Catch: bsh.UtilEvalError -> L58
            int r12 = r12 + 1
            r4 = -1
            goto L47
        L58:
            r0 = move-exception
            java.lang.String r1 = "err setting local cons arg:"
            bsh.j.d(r1, r0)
            r0 = 0
            return r0
        L60:
            bsh.CallStack r2 = new bsh.CallStack
            r2.<init>()
            r2.push(r9)
            java.lang.Object[] r4 = r6.getConstructorArgs()
            bsh.Interpreter r1 = r1.declaringInterpreter
            if (r8 == 0) goto L7d
            java.lang.Object[] r4 = r8.getArguments(r2, r1)     // Catch: bsh.EvalError -> L75
            goto L7d
        L75:
            r0 = move-exception
            java.lang.String r1 = "Error evaluating constructor args: "
            bsh.j.d(r1, r0)
            r0 = 0
            return r0
        L7d:
            java.lang.Class[] r1 = bsh.Types.getTypes(r4)
            java.lang.Object[] r2 = bsh.Primitive.unwrap(r4)
            java.lang.String r4 = "super"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto Lad
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r3 = bsh.BshClassManager.memberCache
            java.lang.Object r3 = r3.get(r0)
            bsh.BshClassManager$MemberCache r3 = (bsh.BshClassManager.MemberCache) r3
            java.lang.String r0 = r0.getName()
            int r0 = r3.findMemberIndex(r0, r1)
            r4 = -1
            if (r0 == r4) goto La6
            bsh.This$ConstructorArgs r1 = new bsh.This$ConstructorArgs
            r1.<init>(r0, r2)
            return r1
        La6:
            java.lang.String r0 = "can't find super constructor for args!"
            bsh.j.f(r0)
            r0 = 0
            return r0
        Lad:
            r4 = -1
            java.util.List r5 = java.util.Arrays.asList(r5)
            int r1 = bsh.Reflect.findMostSpecificBshMethodIndex(r1, r5)
            if (r1 == r4) goto Ld9
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r4 = bsh.BshClassManager.memberCache
            java.lang.Object r4 = r4.get(r0)
            bsh.BshClassManager$MemberCache r4 = (bsh.BshClassManager.MemberCache) r4
            java.lang.String r0 = r0.getName()
            int r0 = r4.memberCount(r0)
            int r1 = r1 + r0
            int r0 = r0 + r3
            if (r1 == r0) goto Ld2
            bsh.This$ConstructorArgs r0 = new bsh.This$ConstructorArgs
            r0.<init>(r1, r2)
            return r0
        Ld2:
            java.lang.String r0 = "Recursive constructor call."
            bsh.j.f(r0)
            r0 = 0
            return r0
        Ld9:
            java.lang.String r0 = "can't find this constructor for args!"
            bsh.j.f(r0)
            r0 = 0
            return r0
        Le0:
            bsh.InterpreterError r0 = new bsh.InterpreterError     // Catch: java.lang.Exception -> Le8
            java.lang.String r1 = "Unable to find constructors array in class"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Le8
            throw r0     // Catch: java.lang.Exception -> Le8
        Le8:
            r0 = move-exception
            java.lang.String r1 = "Unable to get instance initializers: "
            bsh.j.d(r1, r0)
            r0 = 0
            return r0
        Lf0:
            java.lang.String r0 = "Unititialized class: no static"
            bsh.j.f(r0)
            r0 = 0
            return r0
    }

    public static bsh.This getThis(bsh.NameSpace r1, bsh.Interpreter r2) {
            bsh.This r0 = new bsh.This
            r0.<init>(r1, r2)
            return r0
    }

    private static bsh.This initClassInstanceThis(java.lang.Object r5, java.lang.String r6) {
            bsh.This r0 = bsh.Reflect.getClassInstanceThis(r5, r6)
            if (r0 != 0) goto L9d
            java.lang.Class r0 = r5.getClass()
            bsh.This r0 = bsh.Reflect.getClassStaticThis(r0, r6)
            bsh.NameSpace r1 = r0.getNameSpace()
            bsh.NameSpace r1 = r1.copy()
            java.lang.ThreadLocal<bsh.NameSpace> r2 = bsh.This.CONTEXT_NAMESPACE
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L27
            java.lang.Object r2 = r2.get()
            bsh.NameSpace r2 = (bsh.NameSpace) r2
            r1.setParent(r2)
        L27:
            java.lang.ThreadLocal<bsh.Interpreter> r2 = bsh.This.CONTEXT_INTERPRETER
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L3a
            java.lang.Object r2 = r2.get()
            bsh.Interpreter r2 = (bsh.Interpreter) r2
            bsh.This r2 = r1.getThis(r2)
            goto L40
        L3a:
            bsh.Interpreter r2 = r0.declaringInterpreter
            bsh.This r2 = r1.getThis(r2)
        L40:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L96
            r3.<init>()     // Catch: java.lang.Exception -> L96
            bsh.This$Keys r4 = bsh.This.Keys.BSHTHIS     // Catch: java.lang.Exception -> L96
            r3.append(r4)     // Catch: java.lang.Exception -> L96
            r3.append(r6)     // Catch: java.lang.Exception -> L96
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Exception -> L96
            bsh.LHS r6 = bsh.Reflect.getLHSObjectField(r5, r6)     // Catch: java.lang.Exception -> L96
            r3 = 0
            r6.assign(r2, r3)     // Catch: java.lang.Exception -> L96
            r1.setClassInstance(r5)
            bsh.NameSpace r5 = r0.getNameSpace()     // Catch: java.lang.Exception -> L8f
            bsh.This$Keys r6 = bsh.This.Keys.BSHINIT     // Catch: java.lang.Exception -> L8f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L8f
            java.lang.Object r5 = r5.getVariable(r6)     // Catch: java.lang.Exception -> L8f
            bsh.BSHBlock r5 = (bsh.BSHBlock) r5     // Catch: java.lang.Exception -> L8f
            bsh.CallStack r6 = new bsh.CallStack     // Catch: java.lang.Exception -> L87
            r6.<init>(r1)     // Catch: java.lang.Exception -> L87
            bsh.Interpreter r0 = r2.declaringInterpreter     // Catch: java.lang.Exception -> L87
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L87
            bsh.ClassGenerator$ClassNodeFilter r4 = bsh.ClassGenerator.ClassNodeFilter.CLASSINSTANCEMETHODS     // Catch: java.lang.Exception -> L87
            r5.evalBlock(r6, r0, r3, r4)     // Catch: java.lang.Exception -> L87
            bsh.CallStack r6 = new bsh.CallStack     // Catch: java.lang.Exception -> L87
            r6.<init>(r1)     // Catch: java.lang.Exception -> L87
            bsh.Interpreter r0 = r2.declaringInterpreter     // Catch: java.lang.Exception -> L87
            bsh.ClassGenerator$ClassNodeFilter r1 = bsh.ClassGenerator.ClassNodeFilter.CLASSINSTANCEFIELDS     // Catch: java.lang.Exception -> L87
            r5.evalBlock(r6, r0, r3, r1)     // Catch: java.lang.Exception -> L87
            return r2
        L87:
            r5 = move-exception
            java.lang.String r6 = "Error in class instance This initialization: "
            bsh.j.d(r6, r5)
        L8d:
            r5 = 0
            return r5
        L8f:
            r5 = move-exception
            java.lang.String r6 = "unable to get instance initializer: "
            bsh.j.d(r6, r5)
            goto L8d
        L96:
            r5 = move-exception
            java.lang.String r6 = "Error in class gen setup: "
            bsh.j.d(r6, r5)
            goto L8d
        L9d:
            return r0
    }

    public static void initInstance(bsh.GeneratedClass r6, java.lang.String r7, java.lang.Object[] r8) {
            bsh.This r0 = initClassInstanceThis(r6, r7)     // Catch: java.lang.Exception -> L9f
            bsh.NameSpace r1 = r0.getNameSpace()     // Catch: java.lang.Exception -> L9f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L9f
            r2.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Exception -> L9f
        L11:
            r4 = 0
            if (r3 == 0) goto L2a
            java.lang.String r5 = r3.getSimpleName()     // Catch: java.lang.Exception -> L9f
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Exception -> L9f
            if (r5 != 0) goto L2a
            java.lang.String r5 = r3.getSimpleName()     // Catch: java.lang.Exception -> L9f
            r2.add(r4, r5)     // Catch: java.lang.Exception -> L9f
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L9f
            goto L11
        L2a:
            ae.g r3 = new ae.g     // Catch: java.lang.Exception -> L9f
            r5 = 5
            r3.<init>(r6, r5)     // Catch: java.lang.Exception -> L9f
            r2.forEach(r3)     // Catch: java.lang.Exception -> L9f
            boolean r2 = r1.isEnum     // Catch: java.lang.Exception -> L9f
            if (r2 == 0) goto L59
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> r2 = bsh.This.CONTEXT_ARGS     // Catch: java.lang.Exception -> L9f
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Exception -> L9f
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L9f
            boolean r3 = r3.containsKey(r5)     // Catch: java.lang.Exception -> L9f
            if (r3 == 0) goto L59
            java.lang.Object r8 = r2.get()     // Catch: java.lang.Exception -> L9f
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Exception -> L9f
            java.lang.Object r8 = r8.remove(r2)     // Catch: java.lang.Exception -> L9f
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch: java.lang.Exception -> L9f
        L59:
            java.lang.String r2 = bsh.Types.getBaseName(r7)     // Catch: java.lang.Exception -> L9f
            java.lang.Class[] r3 = bsh.Types.getTypes(r8)     // Catch: java.lang.Exception -> L9f
            r5 = 1
            bsh.BshMethod r1 = r1.getMethod(r2, r3, r5)     // Catch: java.lang.Exception -> L9f
            int r2 = r8.length     // Catch: java.lang.Exception -> L9f
            if (r2 <= 0) goto L87
            if (r1 == 0) goto L6c
            goto L87
        L6c:
            bsh.InterpreterError r6 = new bsh.InterpreterError     // Catch: java.lang.Exception -> L9f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            r0.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "Can't find constructor: "
            r0.append(r1)     // Catch: java.lang.Exception -> L9f
            java.lang.String r7 = bsh.StringUtil.methodString(r7, r8)     // Catch: java.lang.Exception -> L9f
            r0.append(r7)     // Catch: java.lang.Exception -> L9f
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L9f
            r6.<init>(r7)     // Catch: java.lang.Exception -> L9f
            throw r6     // Catch: java.lang.Exception -> L9f
        L87:
            if (r1 == 0) goto L8e
            bsh.Interpreter r7 = r0.declaringInterpreter     // Catch: java.lang.Exception -> L9f
            r1.invoke(r8, r7)     // Catch: java.lang.Exception -> L9f
        L8e:
            bsh.Variable[] r6 = bsh.Reflect.getVariables(r6)     // Catch: java.lang.Exception -> L9f
            int r7 = r6.length     // Catch: java.lang.Exception -> L9f
            r8 = r4
        L94:
            if (r8 >= r7) goto L9e
            r0 = r6[r8]     // Catch: java.lang.Exception -> L9f
            r0.validateFinalIsSet(r4)     // Catch: java.lang.Exception -> L9f
            int r8 = r8 + 1
            goto L94
        L9e:
            return
        L9f:
            r6 = move-exception
            boolean r7 = r6 instanceof bsh.TargetError
            if (r7 == 0) goto Lac
            bsh.TargetError r6 = (bsh.TargetError) r6
            java.lang.Throwable r6 = r6.getTarget()
            java.lang.Exception r6 = (java.lang.Exception) r6
        Lac:
            boolean r7 = r6 instanceof java.lang.reflect.InvocationTargetException
            if (r7 == 0) goto Lb6
            java.lang.Throwable r6 = r6.getCause()
            java.lang.Exception r6 = (java.lang.Exception) r6
        Lb6:
            java.lang.String r7 = "Error in class instance initialization: "
            bsh.j.d(r7, r6)
            return
    }

    public static void initStatic(java.lang.Class<?> r6) {
            java.lang.String r0 = r6.getSimpleName()
            bsh.This r6 = bsh.Reflect.getClassStaticThis(r6, r0)     // Catch: java.lang.Exception -> L3e
            bsh.NameSpace r1 = r6.getNameSpace()     // Catch: java.lang.Exception -> L3e
            bsh.Interpreter r6 = r6.declaringInterpreter     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L41
            bsh.This$Keys r2 = bsh.This.Keys.BSHINIT     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = r1.getVariable(r2)     // Catch: java.lang.Exception -> L3e
            bsh.BSHBlock r2 = (bsh.BSHBlock) r2     // Catch: java.lang.Exception -> L3e
            bsh.CallStack r3 = new bsh.CallStack     // Catch: java.lang.Exception -> L3e
            r3.<init>(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3e
            bsh.ClassGenerator$ClassNodeFilter r5 = bsh.ClassGenerator.ClassNodeFilter.CLASSSTATICMETHODS     // Catch: java.lang.Exception -> L3e
            r2.evalBlock(r3, r6, r4, r5)     // Catch: java.lang.Exception -> L3e
            bsh.ClassGenerator$ClassNodeFilter r5 = bsh.ClassGenerator.ClassNodeFilter.CLASSSTATICFIELDS     // Catch: java.lang.Exception -> L3e
            r2.evalBlock(r3, r6, r4, r5)     // Catch: java.lang.Exception -> L3e
            bsh.Variable[] r6 = bsh.Reflect.getVariables(r1)     // Catch: java.lang.Exception -> L3e
            int r1 = r6.length     // Catch: java.lang.Exception -> L3e
            r2 = 0
        L33:
            if (r2 >= r1) goto L40
            r3 = r6[r2]     // Catch: java.lang.Exception -> L3e
            r4 = 1
            r3.validateFinalIsSet(r4)     // Catch: java.lang.Exception -> L3e
            int r2 = r2 + 1
            goto L33
        L3e:
            r6 = move-exception
            goto L49
        L40:
            return
        L41:
            bsh.UtilEvalError r6 = new bsh.UtilEvalError     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = "No namespace or interpreter for statitc This. Start interpreter for class not implemented yet."
            r6.<init>(r1)     // Catch: java.lang.Exception -> L3e
            throw r6     // Catch: java.lang.Exception -> L3e
        L49:
            bsh.UtilEvalError r1 = new bsh.UtilEvalError
            java.lang.String r2 = "Exception in static init block <clinit> for class "
            java.lang.String r3 = ". With message: "
            java.lang.StringBuilder r0 = bc.e.o(r2, r0, r3)
            java.lang.String r2 = r6.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0, r6)
            throw r1
    }

    public static boolean isExposedThisMethod(java.lang.String r1) {
            java.lang.String r0 = "invokeMethod"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "getInterface"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "wait"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "notify"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "notifyAll"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = 0
            return r1
        L2b:
            r1 = 1
            return r1
    }

    private static /* synthetic */ void lambda$initInstance$0(bsh.GeneratedClass r0, java.lang.String r1) {
            initClassInstanceThis(r0, r1)
            return
    }

    private static /* synthetic */ java.util.Map lambda$static$1() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    public static bsh.This pullBshStatic(java.lang.String r3) {
            java.util.Map<java.lang.String, bsh.NameSpace> r0 = bsh.This.contextStore
            boolean r1 = r0.containsKey(r3)
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r3 = r0.remove(r3)
            bsh.NameSpace r3 = (bsh.NameSpace) r3
            bsh.This r3 = r3.getThis(r2)
            return r3
        L14:
            bsh.This r3 = getThis(r2, r2)
            return r3
    }

    public static void registerConstructorContext(bsh.CallStack r1, bsh.Interpreter r2) {
            if (r1 == 0) goto Lc
            java.lang.ThreadLocal<bsh.NameSpace> r0 = bsh.This.CONTEXT_NAMESPACE
            bsh.NameSpace r1 = r1.top()
            r0.set(r1)
            goto L11
        Lc:
            java.lang.ThreadLocal<bsh.NameSpace> r1 = bsh.This.CONTEXT_NAMESPACE
            r1.remove()
        L11:
            if (r2 == 0) goto L19
            java.lang.ThreadLocal<bsh.Interpreter> r1 = bsh.This.CONTEXT_INTERPRETER
            r1.set(r2)
            return
        L19:
            java.lang.ThreadLocal<bsh.Interpreter> r1 = bsh.This.CONTEXT_INTERPRETER
            r1.remove()
            return
    }

    public java.lang.Object cloneMethodImpl(bsh.Node r2, bsh.CallStack r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.cloneMethodImpl(r2, r3, r0)
            return r2
    }

    public java.lang.Object cloneMethodImpl(bsh.Node r9, bsh.CallStack r10, java.lang.Object r11) {
            r8 = this;
            bsh.NameSpace r0 = new bsh.NameSpace
            bsh.NameSpace r1 = r8.namespace
            bsh.NameSpace r1 = r1.getParent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            bsh.NameSpace r3 = r8.namespace
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = " clone"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            r1 = 0
            if (r11 != 0) goto L4f
            bsh.NameSpace r11 = r8.namespace     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            java.lang.Class<?> r11 = r11.classStatic     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            if (r11 != 0) goto L47
            bsh.Interpreter r11 = r8.declaringInterpreter     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.This r9 = r0.getThis(r11)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            return r9
        L32:
            r11 = move-exception
            goto Lbe
        L35:
            r11 = move-exception
            goto Ld5
        L38:
            r11 = move-exception
            goto Ld5
        L3b:
            r11 = move-exception
            goto Ld5
        L3e:
            r11 = move-exception
            goto Ld5
        L41:
            r11 = move-exception
            goto Ld5
        L44:
            r11 = move-exception
            goto Ld5
        L47:
            java.lang.reflect.Constructor r11 = r11.getConstructor(r1)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            java.lang.Object r11 = r11.newInstance(r1)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
        L4f:
            r0.setClassInstance(r11)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.NameSpace r2 = r8.namespace     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            java.lang.Class<?> r2 = r2.classStatic     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r0.setClassStatic(r2)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r2 = 1
            r0.isClass = r2     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r0.isMethod = r2     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.NameSpace r3 = r8.namespace     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.Variable[] r3 = r3.getVariables()     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            int r4 = r3.length     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r5 = 0
            r6 = r5
        L67:
            if (r6 >= r4) goto L71
            r7 = r3[r6]     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r0.setVariableImpl(r7)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            int r6 = r6 + 1
            goto L67
        L71:
            bsh.NameSpace r3 = new bsh.NameSpace     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r3.<init>(r0, r1)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r3.setClassInstance(r11)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            java.lang.Class<?> r1 = r0.classStatic     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r3.setClassStatic(r1)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r3.isClass = r2     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r3.isMethod = r2     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.NameSpace r1 = r8.namespace     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.BshMethod[] r1 = r1.getMethods()     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            int r2 = r1.length     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
        L89:
            if (r5 >= r2) goto L99
            r4 = r1[r5]     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.BshMethod r4 = r4.clone()     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r4.declaringNameSpace = r3     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r0.setMethod(r4)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            int r5 = r5 + 1
            goto L89
        L99:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r1.<init>()     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.This$Keys r2 = bsh.This.Keys.BSHTHIS     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r1.append(r2)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            java.lang.Class<?> r2 = r0.classStatic     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            java.lang.String r2 = r2.getSimpleName()     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r1.append(r2)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            java.lang.String r1 = r1.toString()     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.LHS r1 = bsh.Reflect.getLHSObjectField(r11, r1)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.Interpreter r2 = r8.declaringInterpreter     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            bsh.This r0 = r0.getThis(r2)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            r1.assign(r0)     // Catch: bsh.UtilEvalError -> L32 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L3e java.lang.SecurityException -> L41 java.lang.NoSuchMethodException -> L44
            return r11
        Lbe:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to assign clone instance This: "
            r0.<init>(r1)
            java.lang.String r1 = r11.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            bsh.EvalError r9 = r11.toEvalError(r0, r9, r10)
            throw r9
        Ld5:
            bsh.EvalError r0 = new bsh.EvalError
            java.lang.String r11 = r11.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to clone from This reference: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11, r9, r10)
            throw r0
    }

    public java.lang.Object[] enumValues() {
            r1 = this;
            bsh.NameSpace r0 = r1.getNameSpace()
            java.lang.Class<?> r0 = r0.classStatic
            java.lang.Object[] r0 = bsh.Reflect.getEnumConstants(r0)
            return r0
    }

    public java.lang.Object getInterface(java.lang.Class<?> r1) {
            r0 = this;
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.Object r1 = r0.getInterface(r1)
            return r1
    }

    public java.lang.Object getInterface(java.lang.Class<?>[] r5) {
            r4 = this;
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r4.interfaces
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.interfaces = r0
        Lb:
            r0 = 0
            r1 = 21
            r2 = r0
        Lf:
            int r3 = r5.length
            if (r2 >= r3) goto L1e
            r3 = r5[r2]
            int r3 = r3.hashCode()
            int r3 = r3 + 3
            int r1 = r1 * r3
            int r2 = r2 + 1
            goto Lf
        L1e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = r4.interfaces
            java.lang.Object r2 = r2.get(r1)
            if (r2 != 0) goto L3c
            r0 = r5[r0]
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.reflect.InvocationHandler r2 = r4.invocationHandler
            java.lang.Object r5 = java.lang.reflect.Proxy.newProxyInstance(r0, r5, r2)
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r4.interfaces
            r0.put(r1, r5)
            return r5
        L3c:
            return r2
    }

    public bsh.NameSpace getNameSpace() {
            r1 = this;
            bsh.NameSpace r0 = r1.namespace
            return r0
    }

    public java.lang.Object invokeMethod(java.lang.String r8, java.lang.Object[] r9) {
            r7 = this;
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.Object r8 = r0.invokeMethod(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public java.lang.Object invokeMethod(java.lang.String r8, java.lang.Object[] r9, bsh.Interpreter r10, bsh.CallStack r11, bsh.Node r12, boolean r13) {
            r7 = this;
            if (r9 != 0) goto L4
            java.lang.Object[] r9 = bsh.Reflect.ZERO_ARGS
        L4:
            r2 = r9
            if (r10 != 0) goto L9
            bsh.Interpreter r10 = r7.declaringInterpreter
        L9:
            r3 = r10
            bsh.NameSpace r9 = r3.getNameSpace()
            if (r9 != 0) goto L15
            bsh.NameSpace r9 = r7.namespace
            r3.setNameSpace(r9)
        L15:
            if (r11 != 0) goto L1e
            bsh.CallStack r11 = new bsh.CallStack
            bsh.NameSpace r9 = r7.namespace
            r11.<init>(r9)
        L1e:
            r4 = r11
            if (r12 != 0) goto L23
            bsh.Node r12 = bsh.Node.JAVACODE
        L23:
            r5 = r12
            java.lang.Class[] r9 = bsh.Types.getTypes(r2)
            bsh.NameSpace r10 = r7.namespace
            bsh.BshMethod r10 = bsh.Reflect.getMethod(r10, r8, r9, r13)
            if (r10 == 0) goto L35
            java.lang.Object r8 = r10.invoke(r2, r3, r4, r5)
            return r8
        L35:
            java.lang.String r10 = "getClass"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L43
            int r10 = r2.length
            if (r10 != 0) goto L43
            java.lang.Class<bsh.This> r8 = bsh.This.class
            return r8
        L43:
            java.lang.String r10 = "toString"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L53
            int r10 = r2.length
            if (r10 != 0) goto L53
            java.lang.String r8 = r7.toString()
            return r8
        L53:
            java.lang.String r10 = "hashCode"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L67
            int r10 = r2.length
            if (r10 != 0) goto L67
            int r8 = r7.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L67:
            java.lang.String r10 = "equals"
            boolean r10 = r8.equals(r10)
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L7e
            int r10 = r2.length
            if (r10 != r12) goto L7e
            r8 = r2[r11]
            if (r7 != r8) goto L7b
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L7b:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L7e:
            java.lang.String r10 = "clone"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L8e
            int r10 = r2.length
            if (r10 != 0) goto L8e
            java.lang.Object r8 = r7.cloneMethodImpl(r5, r4)
            return r8
        L8e:
            boolean[] r6 = new boolean[r12]
            bsh.NameSpace r0 = r7.namespace
            r1 = r8
            java.lang.Object r8 = r0.invokeDefaultInvokeMethod(r1, r2, r3, r4, r5, r6)
            boolean r10 = r6[r11]
            if (r10 == 0) goto L9c
            return r8
        L9c:
            bsh.NameSpace r0 = r7.namespace     // Catch: bsh.EvalError -> La4
            r6 = 1
            java.lang.Object r8 = r0.invokeCommand(r1, r2, r3, r4, r5, r6)     // Catch: bsh.EvalError -> La4
            return r8
        La4:
            r0 = move-exception
            r8 = r0
            bsh.EvalException r10 = new bsh.EvalException
            java.lang.String r9 = bsh.StringUtil.methodString(r1, r9)
            bsh.NameSpace r11 = r7.namespace
            java.lang.String r11 = r11.getName()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Method "
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = " not found in bsh scripted object: "
            r12.append(r9)
            r12.append(r11)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9, r5, r4, r8)
            throw r10
    }

    public java.lang.Object invokeMethod(java.lang.String r9, java.lang.Object[] r10, boolean r11) {
            r8 = this;
            bsh.CallStack r5 = new bsh.CallStack
            bsh.NameSpace r0 = r8.namespace
            r5.<init>(r0)
            bsh.NameSpace r0 = r8.namespace
            bsh.Node r6 = r0.getNode()
            bsh.NameSpace r0 = r8.namespace
            r1 = 0
            r0.setNode(r1)
            bsh.Interpreter r4 = r8.declaringInterpreter     // Catch: java.lang.Exception -> L2c
            r1 = r8
            r2 = r9
            r3 = r10
            r7 = r11
            java.lang.Object r9 = r1.invokeMethod(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2c
            boolean r10 = r9 instanceof bsh.Primitive     // Catch: java.lang.Exception -> L2c
            if (r10 == 0) goto L2f
            bsh.Primitive r10 = bsh.Primitive.VOID     // Catch: java.lang.Exception -> L2c
            if (r9 == r10) goto L2f
            bsh.Primitive r9 = (bsh.Primitive) r9     // Catch: java.lang.Exception -> L2c
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Exception -> L2c
            return r9
        L2c:
            r0 = move-exception
            r9 = r0
            goto L30
        L2f:
            return r9
        L30:
            bsh.EvalException r10 = new bsh.EvalException
            java.lang.String r11 = r9.getMessage()
            r10.<init>(r11, r6, r5, r9)
            throw r10
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            java.lang.String r0 = "run"
            java.lang.Object[] r1 = bsh.Reflect.ZERO_ARGS     // Catch: bsh.EvalError -> L8
            r4.invokeMethod(r0, r1)     // Catch: bsh.EvalError -> L8
            return
        L8:
            r0 = move-exception
            bsh.Interpreter r1 = r4.declaringInterpreter
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Exception in runnable:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.error(r0)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            bsh.NameSpace r0 = r4.namespace
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.String r3 = "toString"
            bsh.BshMethod r0 = bsh.Reflect.getMethod(r0, r3, r2)
            if (r0 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: bsh.EvalError -> L18
            bsh.Interpreter r2 = r4.declaringInterpreter     // Catch: bsh.EvalError -> L18
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: bsh.EvalError -> L18
            java.lang.String r0 = (java.lang.String) r0     // Catch: bsh.EvalError -> L18
            return r0
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "'this' reference to Bsh object: "
            r0.<init>(r1)
            bsh.NameSpace r1 = r4.namespace
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

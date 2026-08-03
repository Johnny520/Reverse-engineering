package net.bytebuddy.utility.visitor;

/* JADX INFO: loaded from: classes2.dex */
public class StackAwareMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
    private static final boolean ACCESS_CONTROLLER = false;
    private static final int[] SIZE_CHANGE = null;
    public static final boolean UNADJUSTED = false;
    public static final java.lang.String UNADJUSTED_PROPERTY = "net.bytebuddy.unadjusted";
    private java.util.List<net.bytebuddy.implementation.bytecode.StackSize> current;
    private int freeIndex;
    private final java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> sizes;

    /* JADX INFO: renamed from: net.bytebuddy.utility.visitor.StackAwareMethodVisitor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = null;

        static {
                net.bytebuddy.implementation.bytecode.StackSize[] r0 = net.bytebuddy.implementation.bytecode.StackSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.utility.visitor.StackAwareMethodVisitor.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = r0
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize     // Catch: java.lang.NoSuchFieldError -> L1d
                net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    static {
            r0 = 1
            r1 = 0
            java.lang.String r2 = "java.security.AccessController"
            r3 = 0
            java.lang.Class.forName(r2, r1, r3)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
            java.lang.String r2 = "net.bytebuddy.securitymanager"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
            net.bytebuddy.utility.visitor.StackAwareMethodVisitor.ACCESS_CONTROLLER = r2     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
            goto L1c
        L17:
            net.bytebuddy.utility.visitor.StackAwareMethodVisitor.ACCESS_CONTROLLER = r0
            goto L1c
        L1a:
            net.bytebuddy.utility.visitor.StackAwareMethodVisitor.ACCESS_CONTROLLER = r1
        L1c:
            net.bytebuddy.utility.privilege.GetSystemPropertyAction r2 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = "net.bytebuddy.unadjusted"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.Object r2 = doPrivileged(r2)     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L2e
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.Exception -> L2e
            goto L2f
        L2e:
            r2 = r1
        L2f:
            net.bytebuddy.utility.visitor.StackAwareMethodVisitor.UNADJUSTED = r2
            r2 = 202(0xca, float:2.83E-43)
            int[] r2 = new int[r2]
            net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE = r2
        L37:
            int[] r2 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE
            int r3 = r2.length
            if (r1 >= r3) goto L48
            java.lang.String r3 = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEEEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE"
            char r3 = r3.charAt(r1)
            int r3 = r3 + (-69)
            r2[r1] = r3
            int r1 = r1 + r0
            goto L37
        L48:
            return
    }

    public StackAwareMethodVisitor(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.description.method.MethodDescription r3) {
            r1 = this;
            int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
            r1.<init>(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.current = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.sizes = r2
            int r2 = r3.getStackSize()
            r1.freeIndex = r2
            return
    }

    private void adjustStack(int r2) {
            r1 = this;
            r0 = 0
            r1.adjustStack(r2, r0)
            return
    }

    private void adjustStack(int r4, int r5) {
            r3 = this;
            r0 = 2
            if (r4 > r0) goto La6
            if (r4 <= 0) goto L42
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            int r0 = r0.size()
        Lb:
            if (r5 <= 0) goto L1f
            if (r0 <= 0) goto L1f
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r1 = r3.current
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            net.bytebuddy.implementation.bytecode.StackSize r1 = (net.bytebuddy.implementation.bytecode.StackSize) r1
            int r1 = r1.getSize()
            int r5 = r5 - r1
            goto Lb
        L1f:
            if (r5 < 0) goto L2b
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r5 = r3.current
            net.bytebuddy.implementation.bytecode.StackSize r4 = net.bytebuddy.implementation.bytecode.StackSize.of(r4)
            r5.add(r0, r4)
            goto L6f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected offset underflow: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L42:
            if (r5 != 0) goto L87
        L44:
            r5 = 1
            if (r4 >= 0) goto L63
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L50
            return
        L50:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            int r1 = r0.size()
            int r1 = r1 - r5
            java.lang.Object r5 = r0.remove(r1)
            net.bytebuddy.implementation.bytecode.StackSize r5 = (net.bytebuddy.implementation.bytecode.StackSize) r5
            int r5 = r5.getSize()
            int r4 = r4 + r5
            goto L44
        L63:
            if (r4 != r5) goto L6d
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r4 = r3.current
            net.bytebuddy.implementation.bytecode.StackSize r5 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            r4.add(r5)
            goto L6f
        L6d:
            if (r4 != 0) goto L70
        L6f:
            return
        L70:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected remainder on the operand stack: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L87:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot specify non-zero offset "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " for non-incrementing value: "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        La6:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot push multiple values onto the operand stack: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    private void doDrain(java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r4) {
            r3 = this;
            int r0 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r0)
        L8:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r4.previous()
            net.bytebuddy.implementation.bytecode.StackSize r0 = (net.bytebuddy.implementation.bytecode.StackSize) r0
            int[] r1 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L3f
            r2 = 2
            if (r1 != r2) goto L28
            r0 = 88
            super.visitInsn(r0)
            goto L8
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected stack size: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L3f:
            r0 = 87
            super.visitInsn(r0)
            goto L8
        L45:
            return
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static net.bytebuddy.jar.asm.MethodVisitor of(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.method.MethodDescription r2) {
            boolean r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.UNADJUSTED
            if (r0 == 0) goto L5
            goto Lb
        L5:
            net.bytebuddy.utility.visitor.StackAwareMethodVisitor r0 = new net.bytebuddy.utility.visitor.StackAwareMethodVisitor
            r0.<init>(r1, r2)
            r1 = r0
        Lb:
            return r1
    }

    public int drainStack(int r5, int r6, net.bytebuddy.implementation.bytecode.StackSize r7) {
            r4 = this;
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r4.current
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r4.current
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r0 = r0.get(r2)
            net.bytebuddy.implementation.bytecode.StackSize r0 = (net.bytebuddy.implementation.bytecode.StackSize) r0
            int r0 = r0.getSize()
            int r2 = r7.getSize()
            int r0 = r0 - r2
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r2 = r4.current
            int r2 = r2.size()
            if (r2 != r3) goto L2c
            if (r0 != 0) goto L2c
            return r1
        L2c:
            int r2 = r4.freeIndex
            super.visitVarInsn(r5, r2)
            if (r0 != r3) goto L39
            r5 = 87
            super.visitInsn(r5)
            goto L3b
        L39:
            if (r0 != 0) goto L56
        L3b:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r5 = r4.current
            int r0 = r5.size()
            int r0 = r0 - r3
            java.util.List r5 = r5.subList(r1, r0)
            r4.doDrain(r5)
            int r5 = r4.freeIndex
            super.visitVarInsn(r6, r5)
            int r5 = r4.freeIndex
            int r6 = r7.getSize()
            int r5 = r5 + r6
            return r5
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Unexpected remainder on the operand stack: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public void drainStack() {
            r1 = this;
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r1.current
            r1.doDrain(r0)
            return
    }

    public void register(net.bytebuddy.jar.asm.Label r2, java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r3) {
            r1 = this;
            java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> r0 = r1.sizes
            r0.put(r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitFieldInsn(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r6)
            int r0 = r0.getSize()
            switch(r3) {
                case 178: goto L36;
                case 179: goto L31;
                case 180: goto L29;
                case 181: goto L22;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unexpected opcode: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L22:
            int r0 = -r0
            int r0 = r0 + (-1)
            r2.adjustStack(r0)
            goto L39
        L29:
            r1 = -1
            r2.adjustStack(r1)
            r2.adjustStack(r0)
            goto L39
        L31:
            int r0 = -r0
            r2.adjustStack(r0)
            goto L39
        L36:
            r2.adjustStack(r0)
        L39:
            super.visitFieldInsn(r3, r4, r5, r6)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "ASM models frames by reference identity.", value = {"RC_REF_COMPARISON_BAD_PRACTICE"})
    public void visitFrame(int r4, int r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r6, int r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r8) {
            r3 = this;
            r0 = -1
            r1 = 0
            if (r4 == r0) goto L4f
            if (r4 == 0) goto L4f
            r0 = 1
            if (r4 == r0) goto L49
            r0 = 2
            if (r4 == r0) goto L49
            r0 = 3
            if (r4 == r0) goto L49
            r0 = 4
            if (r4 != r0) goto L32
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            r0.clear()
            r0 = r8[r1]
            java.lang.Integer r1 = net.bytebuddy.jar.asm.Opcodes.LONG
            if (r0 == r1) goto L2a
            java.lang.Integer r1 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
            if (r0 != r1) goto L22
            goto L2a
        L22:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            r0.add(r1)
            goto L73
        L2a:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            r0.add(r1)
            goto L73
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Unknown frame type: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        L49:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            r0.clear()
            goto L73
        L4f:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            r0.clear()
        L54:
            if (r1 >= r7) goto L73
            r0 = r8[r1]
            java.lang.Integer r2 = net.bytebuddy.jar.asm.Opcodes.LONG
            if (r0 == r2) goto L69
            java.lang.Integer r2 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
            if (r0 != r2) goto L61
            goto L69
        L61:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            r0.add(r2)
            goto L70
        L69:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            r0.add(r2)
        L70:
            int r1 = r1 + 1
            goto L54
        L73:
            super.visitFrame(r4, r5, r6, r7, r8)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitInsn(int r4) {
            r3 = this;
            r0 = 47
            r1 = -2
            r2 = 2
            if (r4 == r0) goto L61
            r0 = 49
            if (r4 == r0) goto L61
            r0 = 133(0x85, float:1.86E-43)
            if (r4 == r0) goto L59
            r0 = 144(0x90, float:2.02E-43)
            if (r4 == r0) goto L51
            r0 = 191(0xbf, float:2.68E-43)
            if (r4 == r0) goto L4b
            r0 = 90
            if (r4 == r0) goto L41
            r0 = 91
            if (r4 == r0) goto L37
            r0 = 93
            if (r4 == r0) goto L41
            r0 = 94
            if (r4 == r0) goto L37
            switch(r4) {
                case 135: goto L59;
                case 136: goto L51;
                case 137: goto L51;
                default: goto L29;
            }
        L29:
            switch(r4) {
                case 140: goto L59;
                case 141: goto L59;
                case 142: goto L51;
                default: goto L2c;
            }
        L2c:
            switch(r4) {
                case 172: goto L4b;
                case 173: goto L4b;
                case 174: goto L4b;
                case 175: goto L4b;
                case 176: goto L4b;
                case 177: goto L4b;
                default: goto L2f;
            }
        L2f:
            int[] r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE
            r0 = r0[r4]
            r3.adjustStack(r0)
            goto L67
        L37:
            int[] r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE
            r0 = r0[r4]
            int r1 = r0 + 2
            r3.adjustStack(r0, r1)
            goto L67
        L41:
            int[] r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE
            r0 = r0[r4]
            int r1 = r0 + 1
            r3.adjustStack(r0, r1)
            goto L67
        L4b:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r3.current
            r0.clear()
            goto L67
        L51:
            r3.adjustStack(r1)
            r0 = 1
            r3.adjustStack(r0)
            goto L67
        L59:
            r0 = -1
            r3.adjustStack(r0)
            r3.adjustStack(r2)
            goto L67
        L61:
            r3.adjustStack(r1)
            r3.adjustStack(r2)
        L67:
            super.visitInsn(r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitIntInsn(int r2, int r3) {
            r1 = this;
            int[] r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE
            r0 = r0[r2]
            r1.adjustStack(r0)
            super.visitIntInsn(r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r3, java.lang.String r4, net.bytebuddy.jar.asm.Handle r5, java.lang.Object... r6) {
            r2 = this;
            int r0 = net.bytebuddy.jar.asm.Type.getArgumentsAndReturnSizes(r4)
            int r1 = r0 >> 2
            int r1 = -r1
            int r1 = r1 + 1
            r2.adjustStack(r1)
            r0 = r0 & 3
            r2.adjustStack(r0)
            super.visitInvokeDynamicInsn(r3, r4, r5, r6)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitJumpInsn(int r5, net.bytebuddy.jar.asm.Label r6) {
            r4 = this;
            int[] r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE
            r0 = r0[r5]
            r4.adjustStack(r0)
            java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> r0 = r4.sizes
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 168(0xa8, float:2.35E-43)
            if (r5 != r2) goto L18
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r2 = r4.current
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r3)
            goto L1a
        L18:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r2 = r4.current
        L1a:
            r1.<init>(r2)
            r0.put(r6, r1)
            r0 = 167(0xa7, float:2.34E-43)
            if (r5 != r0) goto L29
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r4.current
            r0.clear()
        L29:
            super.visitJumpInsn(r5, r6)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLabel(net.bytebuddy.jar.asm.Label r3) {
            r2 = this;
            java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> r0 = r2.sizes
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2.current = r1
        L11:
            super.visitLabel(r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto Lb
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 2
        Lc:
            r1.adjustStack(r0)
            super.visitLdcInsn(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLineNumber(int r1, net.bytebuddy.jar.asm.Label r2) {
            r0 = this;
            super.visitLineNumber(r1, r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLookupSwitchInsn(net.bytebuddy.jar.asm.Label r6, int[] r7, net.bytebuddy.jar.asm.Label[] r8) {
            r5 = this;
            r0 = -1
            r5.adjustStack(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r1 = r5.current
            r0.<init>(r1)
            java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> r1 = r5.sizes
            r1.put(r6, r0)
            int r1 = r8.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L1e
            r3 = r8[r2]
            java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> r4 = r5.sizes
            r4.put(r3, r0)
            int r2 = r2 + 1
            goto L12
        L1e:
            super.visitLookupSwitchInsn(r6, r7, r8)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMethodInsn(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            r3 = this;
            int r0 = net.bytebuddy.jar.asm.Type.getArgumentsAndReturnSizes(r7)
            int r1 = r0 >> 2
            int r1 = -r1
            r2 = 184(0xb8, float:2.58E-43)
            if (r4 != r2) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            int r1 = r1 + r2
            r3.adjustStack(r1)
            r0 = r0 & 3
            r3.adjustStack(r0)
            super.visitMethodInsn(r4, r5, r6, r7, r8)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r2, int r3) {
            r1 = this;
            int r0 = 1 - r3
            r1.adjustStack(r0)
            super.visitMultiANewArrayInsn(r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTableSwitchInsn(int r6, int r7, net.bytebuddy.jar.asm.Label r8, net.bytebuddy.jar.asm.Label... r9) {
            r5 = this;
            r0 = -1
            r5.adjustStack(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r1 = r5.current
            r0.<init>(r1)
            java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> r1 = r5.sizes
            r1.put(r8, r0)
            int r1 = r9.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L1e
            r3 = r9[r2]
            java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> r4 = r5.sizes
            r4.put(r3, r0)
            int r2 = r2 + 1
            goto L12
        L1e:
            super.visitTableSwitchInsn(r6, r7, r8, r9)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTryCatchBlock(net.bytebuddy.jar.asm.Label r3, net.bytebuddy.jar.asm.Label r4, net.bytebuddy.jar.asm.Label r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6) {
            r2 = this;
            java.util.Map<net.bytebuddy.jar.asm.Label, java.util.List<net.bytebuddy.implementation.bytecode.StackSize>> r0 = r2.sizes
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.put(r5, r1)
            super.visitTryCatchBlock(r3, r4, r5, r6)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTypeInsn(int r2, java.lang.String r3) {
            r1 = this;
            int[] r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE
            r0 = r0[r2]
            r1.adjustStack(r0)
            super.visitTypeInsn(r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "No action required on default option.", value = {"SF_SWITCH_NO_DEFAULT"})
    public void visitVarInsn(int r3, int r4) {
            r2 = this;
            r0 = 169(0xa9, float:2.37E-43)
            if (r3 == r0) goto L1e
            switch(r3) {
                case 54: goto L13;
                case 55: goto L8;
                case 56: goto L13;
                case 57: goto L8;
                case 58: goto L13;
                default: goto L7;
            }
        L7:
            goto L23
        L8:
            int r0 = r2.freeIndex
            int r1 = r4 + 2
            int r0 = java.lang.Math.max(r0, r1)
            r2.freeIndex = r0
            goto L23
        L13:
            int r0 = r2.freeIndex
            int r1 = r4 + 1
            int r0 = java.lang.Math.max(r0, r1)
            r2.freeIndex = r0
            goto L23
        L1e:
            java.util.List<net.bytebuddy.implementation.bytecode.StackSize> r0 = r2.current
            r0.clear()
        L23:
            int[] r0 = net.bytebuddy.utility.visitor.StackAwareMethodVisitor.SIZE_CHANGE
            r0 = r0[r3]
            r2.adjustStack(r0)
            super.visitVarInsn(r3, r4)
            return
    }
}

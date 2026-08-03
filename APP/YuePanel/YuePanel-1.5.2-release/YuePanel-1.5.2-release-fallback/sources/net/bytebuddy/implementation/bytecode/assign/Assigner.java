package net.bytebuddy.implementation.bytecode.assign;

/* JADX INFO: loaded from: classes2.dex */
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
public interface Assigner {
    public static final net.bytebuddy.implementation.bytecode.assign.Assigner DEFAULT = null;
    public static final net.bytebuddy.implementation.bytecode.assign.Assigner GENERICS_AWARE = null;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bytecode.assign.Assigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum EqualTypesOnly extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly> implements net.bytebuddy.implementation.bytecode.assign.Assigner {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly ERASURE = null;
        public static final net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly GENERIC = null;



        static {
                net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly$1 r0 = new net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly$1
                java.lang.String r1 = "GENERIC"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly.GENERIC = r0
                net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly$2 r1 = new net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly$2
                java.lang.String r3 = "ERASURE"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly.ERASURE = r1
                r3 = 2
                net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly[] r3 = new net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly.$VALUES = r3
                return
        }

        EqualTypesOnly(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ EqualTypesOnly(java.lang.String r1, int r2, net.bytebuddy.implementation.bytecode.assign.Assigner.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly> r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly r1 = (net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly[] values() {
                net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly[] r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.assign.Assigner$EqualTypesOnly[] r0 = (net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly[]) r0
                return r0
        }
    }

    public enum Refusing extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing> implements net.bytebuddy.implementation.bytecode.assign.Assigner {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing INSTANCE = null;

        static {
                net.bytebuddy.implementation.bytecode.assign.Assigner$Refusing r0 = new net.bytebuddy.implementation.bytecode.assign.Assigner$Refusing
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing.INSTANCE = r0
                net.bytebuddy.implementation.bytecode.assign.Assigner$Refusing[] r0 = new net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing[]{r0}
                net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing.$VALUES = r0
                return
        }

        Refusing(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Refusing> r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.assign.Assigner$Refusing r1 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing[] values() {
                net.bytebuddy.implementation.bytecode.assign.Assigner$Refusing[] r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.assign.Assigner$Refusing[] r0 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Refusing[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
        public net.bytebuddy.implementation.bytecode.StackManipulation assign(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                return r1
        }
    }

    public enum Typing extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.Assigner.Typing> {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.Assigner.Typing[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing DYNAMIC = null;
        public static final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing STATIC = null;
        private final boolean dynamic;

        static {
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = new net.bytebuddy.implementation.bytecode.assign.Assigner$Typing
                java.lang.String r1 = "STATIC"
                r2 = 0
                r0.<init>(r1, r2, r2)
                net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC = r0
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = new net.bytebuddy.implementation.bytecode.assign.Assigner$Typing
                java.lang.String r2 = "DYNAMIC"
                r3 = 1
                r1.<init>(r2, r3, r3)
                net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC = r1
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing[] r0 = new net.bytebuddy.implementation.bytecode.assign.Assigner.Typing[]{r0, r1}
                net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.$VALUES = r0
                return
        }

        Typing(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.dynamic = r3
                return
        }

        public static net.bytebuddy.implementation.bytecode.assign.Assigner.Typing of(boolean r0) {
                if (r0 == 0) goto L5
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
                goto L7
            L5:
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
            L7:
                return r0
        }

        public static net.bytebuddy.implementation.bytecode.assign.Assigner.Typing valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.assign.Assigner.Typing[] values() {
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing[] r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing[] r0 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing[]) r0
                return r0
        }

        public boolean isDynamic() {
                r1 = this;
                boolean r0 = r1.dynamic
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.assign.primitive.VoidAwareAssigner r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.VoidAwareAssigner
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveTypeAwareAssigner r1 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveTypeAwareAssigner
            net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner r2 = net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner.INSTANCE
            r1.<init>(r2)
            r0.<init>(r1)
            net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT = r0
            net.bytebuddy.implementation.bytecode.assign.primitive.VoidAwareAssigner r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.VoidAwareAssigner
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveTypeAwareAssigner r1 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveTypeAwareAssigner
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner r2 = net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.INSTANCE
            r1.<init>(r2)
            r0.<init>(r1)
            net.bytebuddy.implementation.bytecode.assign.Assigner.GENERICS_AWARE = r0
            return
    }

    net.bytebuddy.implementation.bytecode.StackManipulation assign(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3);
}

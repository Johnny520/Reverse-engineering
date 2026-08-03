package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassWriterStrategy {

    /* JADX INFO: renamed from: net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Default extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default> implements net.bytebuddy.dynamic.scaffold.ClassWriterStrategy {
        private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default[] $VALUES = null;
        public static final net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default CONSTANT_POOL_DISCARDING = null;
        public static final net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default CONSTANT_POOL_RETAINING = null;



        static {
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default$1 r0 = new net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default$1
                java.lang.String r1 = "CONSTANT_POOL_RETAINING"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.CONSTANT_POOL_RETAINING = r0
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default$2 r1 = new net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default$2
                java.lang.String r3 = "CONSTANT_POOL_DISCARDING"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.CONSTANT_POOL_DISCARDING = r1
                r3 = 2
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default[] r3 = new net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.$VALUES = r3
                return
        }

        Default(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default> r0 = net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default r1 = (net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default) r1
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default[] values() {
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default[] r0 = net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default[] r0 = (net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.ClassWriterStrategy
        public net.bytebuddy.jar.asm.ClassWriter resolve(int r2, net.bytebuddy.pool.TypePool r3) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$FrameComputingClassWriter r0 = new net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$FrameComputingClassWriter
                r0.<init>(r2, r3)
                return r0
        }
    }

    public static class FrameComputingClassWriter extends net.bytebuddy.jar.asm.ClassWriter {
        private final net.bytebuddy.pool.TypePool typePool;

        public FrameComputingClassWriter(int r1, net.bytebuddy.pool.TypePool r2) {
                r0 = this;
                r0.<init>(r1)
                r0.typePool = r2
                return
        }

        public FrameComputingClassWriter(net.bytebuddy.jar.asm.ClassReader r1, int r2, net.bytebuddy.pool.TypePool r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.typePool = r3
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassWriter
        public java.lang.String getCommonSuperClass(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                net.bytebuddy.pool.TypePool r0 = r3.typePool
                r1 = 47
                r2 = 46
                java.lang.String r4 = r4.replace(r1, r2)
                net.bytebuddy.pool.TypePool$Resolution r4 = r0.describe(r4)
                net.bytebuddy.description.type.TypeDescription r4 = r4.resolve()
                net.bytebuddy.pool.TypePool r0 = r3.typePool
                java.lang.String r5 = r5.replace(r1, r2)
                net.bytebuddy.pool.TypePool$Resolution r5 = r0.describe(r5)
                net.bytebuddy.description.type.TypeDescription r5 = r5.resolve()
                boolean r0 = r4.isAssignableFrom(r5)
                if (r0 == 0) goto L2b
                java.lang.String r4 = r4.getInternalName()
                return r4
            L2b:
                boolean r0 = r4.isAssignableTo(r5)
                if (r0 == 0) goto L36
                java.lang.String r4 = r5.getInternalName()
                return r4
            L36:
                boolean r0 = r4.isInterface()
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != 0) goto L63
                boolean r0 = r5.isInterface()
                if (r0 == 0) goto L45
                goto L63
            L45:
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getSuperClass()
                if (r4 != 0) goto L54
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                java.lang.String r4 = r4.getInternalName()
                return r4
            L54:
                net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                boolean r0 = r4.isAssignableFrom(r5)
                if (r0 == 0) goto L45
                java.lang.String r4 = r4.getInternalName()
                return r4
            L63:
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                java.lang.String r4 = r4.getInternalName()
                return r4
        }
    }

    net.bytebuddy.jar.asm.ClassWriter resolve(int r1, net.bytebuddy.pool.TypePool r2);

    net.bytebuddy.jar.asm.ClassWriter resolve(int r1, net.bytebuddy.pool.TypePool r2, net.bytebuddy.jar.asm.ClassReader r3);
}

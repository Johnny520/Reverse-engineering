package net.bytebuddy.dynamic.scaffold;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.jar.asm.ClassReader;
import net.bytebuddy.jar.asm.ClassWriter;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.AsmClassReader;
import net.bytebuddy.utility.AsmClassWriter;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface ClassWriterStrategy {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Deprecated
    public enum Default implements ClassWriterStrategy {
        CONSTANT_POOL_RETAINING { // from class: net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.1
            @Override // net.bytebuddy.dynamic.scaffold.ClassWriterStrategy
            public ClassWriter resolve(int i, TypePool typePool, ClassReader classReader) {
                return new FrameComputingClassWriter(classReader, i, typePool);
            }
        },
        CONSTANT_POOL_DISCARDING { // from class: net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.2
            @Override // net.bytebuddy.dynamic.scaffold.ClassWriterStrategy
            public ClassWriter resolve(int i, TypePool typePool, ClassReader classReader) {
                return resolve(i, typePool);
            }
        };

        @Override // net.bytebuddy.dynamic.scaffold.ClassWriterStrategy
        public ClassWriter resolve(int i, TypePool typePool) {
            return new FrameComputingClassWriter(i, typePool);
        }
    }

    ClassWriter resolve(int i, TypePool typePool);

    ClassWriter resolve(int i, TypePool typePool, ClassReader classReader);

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Deprecated
    public static class FrameComputingClassWriter extends AsmClassWriter.FrameComputingClassWriter {
        public FrameComputingClassWriter(int i, TypePool typePool) {
            super(i, typePool);
        }

        public FrameComputingClassWriter(ClassReader classReader, int i, TypePool typePool) {
            super(classReader, i, typePool);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Delegating implements AsmClassWriter.Factory {
        private final ClassWriterStrategy classWriterStrategy;

        public Delegating(ClassWriterStrategy classWriterStrategy) {
            this.classWriterStrategy = classWriterStrategy;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classWriterStrategy.equals(((Delegating) obj).classWriterStrategy);
        }

        public int hashCode() {
            return this.classWriterStrategy.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.utility.AsmClassWriter.Factory
        public AsmClassWriter make(int i, AsmClassReader asmClassReader, TypePool typePool) {
            ClassReader classReader = (ClassReader) asmClassReader.unwrap(ClassReader.class);
            ClassWriterStrategy classWriterStrategy = this.classWriterStrategy;
            return new AsmClassWriter.ForAsm(classReader == null ? classWriterStrategy.resolve(i, typePool) : classWriterStrategy.resolve(i, typePool, classReader));
        }

        @Override // net.bytebuddy.utility.AsmClassWriter.Factory
        public AsmClassWriter make(int i, AsmClassReader asmClassReader) {
            return make(i, asmClassReader, TypePool.Empty.INSTANCE);
        }

        @Override // net.bytebuddy.utility.AsmClassWriter.Factory
        public AsmClassWriter make(int i, TypePool typePool) {
            return new AsmClassWriter.ForAsm(this.classWriterStrategy.resolve(i, typePool));
        }

        @Override // net.bytebuddy.utility.AsmClassWriter.Factory
        public AsmClassWriter make(int i) {
            return make(i, TypePool.Empty.INSTANCE);
        }
    }
}

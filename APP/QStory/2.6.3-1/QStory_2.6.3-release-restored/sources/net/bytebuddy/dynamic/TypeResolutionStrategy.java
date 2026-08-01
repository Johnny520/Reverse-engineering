package net.bytebuddy.dynamic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.NexusAccessor;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface TypeResolutionStrategy {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Resolved {
        <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, @MaybeNull S s, ClassLoadingStrategy<? super S> classLoadingStrategy);

        TypeInitializer injectedInto(TypeInitializer typeInitializer);
    }

    Resolved resolve();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Active implements TypeResolutionStrategy {
        private final NexusAccessor nexusAccessor;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Resolved implements Resolved {
            private final int identification;
            private final NexusAccessor nexusAccessor;

            public Resolved(NexusAccessor nexusAccessor, int i) {
                this.nexusAccessor = nexusAccessor;
                this.identification = i;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Resolved resolved = (Resolved) obj;
                return this.identification == resolved.identification && this.nexusAccessor.equals(resolved.nexusAccessor);
            }

            public int hashCode() {
                return ((this.nexusAccessor.hashCode() + (getClass().hashCode() * 31)) * 31) + this.identification;
            }

            @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
            public <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, @MaybeNull S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
                HashMap map = new HashMap(dynamicType.getLoadedTypeInitializers());
                TypeDescription typeDescription = dynamicType.getTypeDescription();
                Map<TypeDescription, Class<?>> mapLoad = classLoadingStrategy.load(s, dynamicType.getAllTypes());
                this.nexusAccessor.register(typeDescription.getName(), mapLoad.get(typeDescription).getClassLoader(), this.identification, (LoadedTypeInitializer) map.remove(typeDescription));
                for (Map.Entry entry : map.entrySet()) {
                    ((LoadedTypeInitializer) entry.getValue()).onLoad(mapLoad.get(entry.getKey()));
                }
                return mapLoad;
            }

            @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
            public TypeInitializer injectedInto(TypeInitializer typeInitializer) {
                return typeInitializer.expandWith(new NexusAccessor.InitializationAppender(this.identification));
            }
        }

        public Active() {
            this(new NexusAccessor());
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.nexusAccessor.equals(((Active) obj).nexusAccessor);
        }

        public int hashCode() {
            return this.nexusAccessor.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public Resolved resolve() {
            return new Resolved(this.nexusAccessor, new Random().nextInt());
        }

        public Active(NexusAccessor nexusAccessor) {
            this.nexusAccessor = nexusAccessor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Disabled implements TypeResolutionStrategy, Resolved {
        INSTANCE;

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, @MaybeNull S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
            throw new IllegalStateException("Cannot initialize a dynamic type for a disabled type resolution strategy");
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public Resolved resolve() {
            return this;
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public TypeInitializer injectedInto(TypeInitializer typeInitializer) {
            return typeInitializer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Lazy implements TypeResolutionStrategy, Resolved {
        INSTANCE;

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, @MaybeNull S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
            return classLoadingStrategy.load(s, dynamicType.getAllTypes());
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public Resolved resolve() {
            return this;
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public TypeInitializer injectedInto(TypeInitializer typeInitializer) {
            return typeInitializer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Passive implements TypeResolutionStrategy, Resolved {
        INSTANCE;

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends ClassLoader> Map<TypeDescription, Class<?>> initialize(DynamicType dynamicType, @MaybeNull S s, ClassLoadingStrategy<? super S> classLoadingStrategy) {
            Map<TypeDescription, Class<?>> mapLoad = classLoadingStrategy.load(s, dynamicType.getAllTypes());
            for (Map.Entry<TypeDescription, LoadedTypeInitializer> entry : dynamicType.getLoadedTypeInitializers().entrySet()) {
                entry.getValue().onLoad(mapLoad.get(entry.getKey()));
            }
            return new HashMap(mapLoad);
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public Resolved resolve() {
            return this;
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public TypeInitializer injectedInto(TypeInitializer typeInitializer) {
            return typeInitializer;
        }
    }
}

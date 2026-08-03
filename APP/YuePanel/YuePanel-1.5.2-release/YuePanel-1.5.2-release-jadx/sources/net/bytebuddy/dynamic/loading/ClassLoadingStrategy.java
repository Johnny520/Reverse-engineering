package net.bytebuddy.dynamic.loading;

import java.io.File;
import java.lang.ClassLoader;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.util.Map;
import java.util.concurrent.Callable;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.loading.ByteArrayClassLoader;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy;
import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassLoadingStrategy<T extends ClassLoader> {

    @AlwaysNull
    public static final ClassLoader BOOTSTRAP_LOADER = null;

    @AlwaysNull
    public static final ProtectionDomain NO_PROTECTION_DOMAIN = null;

    public interface Configurable<S extends ClassLoader> extends ClassLoadingStrategy<S> {
        Configurable<S> allowExistingTypes();

        Configurable<S> opened();

        Configurable<S> with(ProtectionDomain protectionDomain);

        Configurable<S> with(PackageDefinitionStrategy packageDefinitionStrategy);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WRAPPER' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Default implements Configurable<ClassLoader> {
        private static final /* synthetic */ Default[] $VALUES;
        public static final Default CHILD_FIRST;
        public static final Default CHILD_FIRST_PERSISTENT;
        private static final boolean DEFAULT_FORBID_EXISTING = true;
        public static final Default INJECTION;
        public static final Default WRAPPER;
        public static final Default WRAPPER_PERSISTENT;
        private final Configurable<ClassLoader> dispatcher;

        @HashCodeAndEqualsPlugin.Enhance
        public static class InjectionDispatcher implements Configurable<ClassLoader> {
            private final boolean forbidExisting;
            private final PackageDefinitionStrategy packageDefinitionStrategy;

            @MaybeNull
            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final ProtectionDomain protectionDomain;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public InjectionDispatcher() {
                this(ClassLoadingStrategy.NO_PROTECTION_DOMAIN, PackageDefinitionStrategy.NoOp.INSTANCE, true);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> allowExistingTypes() {
                return new InjectionDispatcher(this.protectionDomain, this.packageDefinitionStrategy, false);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
            
                if (r2 != null) goto L21;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                InjectionDispatcher injectionDispatcher = (InjectionDispatcher) obj;
                if (this.forbidExisting != injectionDispatcher.forbidExisting) {
                    return false;
                }
                ProtectionDomain protectionDomain = this.protectionDomain;
                ProtectionDomain protectionDomain2 = injectionDispatcher.protectionDomain;
                if (protectionDomain2 != null) {
                    if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                        return false;
                    }
                    return this.packageDefinitionStrategy.equals(injectionDispatcher.packageDefinitionStrategy);
                }
            }

            public int hashCode() {
                int iHashCode = getClass().hashCode() * 31;
                ProtectionDomain protectionDomain = this.protectionDomain;
                if (protectionDomain != null) {
                    iHashCode += protectionDomain.hashCode();
                }
                return (((iHashCode * 31) + this.packageDefinitionStrategy.hashCode()) * 31) + (this.forbidExisting ? 1 : 0);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
            public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
                if (classLoader != null) {
                    return new ClassInjector.UsingReflection(classLoader, this.protectionDomain, this.packageDefinitionStrategy, this.forbidExisting).inject(map);
                }
                throw new IllegalArgumentException("Cannot inject classes into the bootstrap class loader");
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> opened() {
                return this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> with(ProtectionDomain protectionDomain) {
                return new InjectionDispatcher(protectionDomain, this.packageDefinitionStrategy, this.forbidExisting);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private InjectionDispatcher(@MaybeNull ProtectionDomain protectionDomain, PackageDefinitionStrategy packageDefinitionStrategy, boolean z) {
                this.protectionDomain = protectionDomain;
                this.packageDefinitionStrategy = packageDefinitionStrategy;
                this.forbidExisting = z;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> with(PackageDefinitionStrategy packageDefinitionStrategy) {
                return new InjectionDispatcher(this.protectionDomain, packageDefinitionStrategy, this.forbidExisting);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class WrappingDispatcher implements Configurable<ClassLoader> {
            private static final boolean CHILD_FIRST = true;
            private static final boolean PARENT_FIRST = false;
            private final boolean childFirst;
            private final boolean forbidExisting;
            private final PackageDefinitionStrategy packageDefinitionStrategy;
            private final ByteArrayClassLoader.PersistenceHandler persistenceHandler;

            @MaybeNull
            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final ProtectionDomain protectionDomain;
            private final boolean sealed;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public WrappingDispatcher(ByteArrayClassLoader.PersistenceHandler persistenceHandler, boolean z) {
                this(ClassLoadingStrategy.NO_PROTECTION_DOMAIN, PackageDefinitionStrategy.Trivial.INSTANCE, persistenceHandler, z, true, true);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> allowExistingTypes() {
                return new WrappingDispatcher(this.protectionDomain, this.packageDefinitionStrategy, this.persistenceHandler, this.childFirst, false, this.sealed);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
            
                if (r2 != null) goto L30;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                WrappingDispatcher wrappingDispatcher = (WrappingDispatcher) obj;
                if (this.childFirst != wrappingDispatcher.childFirst || this.forbidExisting != wrappingDispatcher.forbidExisting || this.sealed != wrappingDispatcher.sealed || !this.persistenceHandler.equals(wrappingDispatcher.persistenceHandler)) {
                    return false;
                }
                ProtectionDomain protectionDomain = this.protectionDomain;
                ProtectionDomain protectionDomain2 = wrappingDispatcher.protectionDomain;
                if (protectionDomain2 != null) {
                    if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                        return false;
                    }
                    return this.packageDefinitionStrategy.equals(wrappingDispatcher.packageDefinitionStrategy);
                }
            }

            public int hashCode() {
                int iHashCode = getClass().hashCode() * 31;
                ProtectionDomain protectionDomain = this.protectionDomain;
                if (protectionDomain != null) {
                    iHashCode += protectionDomain.hashCode();
                }
                return (((((((((iHashCode * 31) + this.persistenceHandler.hashCode()) * 31) + this.packageDefinitionStrategy.hashCode()) * 31) + (this.childFirst ? 1 : 0)) * 31) + (this.forbidExisting ? 1 : 0)) * 31) + (this.sealed ? 1 : 0);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
            public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
                return this.childFirst ? ByteArrayClassLoader.ChildFirst.load(classLoader, map, this.protectionDomain, this.persistenceHandler, this.packageDefinitionStrategy, this.forbidExisting, this.sealed) : ByteArrayClassLoader.load(classLoader, map, this.protectionDomain, this.persistenceHandler, this.packageDefinitionStrategy, this.forbidExisting, this.sealed);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> opened() {
                return new WrappingDispatcher(this.protectionDomain, this.packageDefinitionStrategy, this.persistenceHandler, this.childFirst, this.forbidExisting, false);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> with(ProtectionDomain protectionDomain) {
                return new WrappingDispatcher(protectionDomain, this.packageDefinitionStrategy, this.persistenceHandler, this.childFirst, this.forbidExisting, this.sealed);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private WrappingDispatcher(@MaybeNull ProtectionDomain protectionDomain, PackageDefinitionStrategy packageDefinitionStrategy, ByteArrayClassLoader.PersistenceHandler persistenceHandler, boolean z, boolean z2, boolean z3) {
                this.protectionDomain = protectionDomain;
                this.packageDefinitionStrategy = packageDefinitionStrategy;
                this.persistenceHandler = persistenceHandler;
                this.childFirst = z;
                this.forbidExisting = z2;
                this.sealed = z3;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public Configurable<ClassLoader> with(PackageDefinitionStrategy packageDefinitionStrategy) {
                return new WrappingDispatcher(this.protectionDomain, packageDefinitionStrategy, this.persistenceHandler, this.childFirst, this.forbidExisting, this.sealed);
            }
        }

        static {
            ByteArrayClassLoader.PersistenceHandler persistenceHandler = ByteArrayClassLoader.PersistenceHandler.LATENT;
            Default r0 = new Default("WRAPPER", 0, new WrappingDispatcher(persistenceHandler, false));
            WRAPPER = r0;
            ByteArrayClassLoader.PersistenceHandler persistenceHandler2 = ByteArrayClassLoader.PersistenceHandler.MANIFEST;
            Default r1 = new Default("WRAPPER_PERSISTENT", 1, new WrappingDispatcher(persistenceHandler2, false));
            WRAPPER_PERSISTENT = r1;
            Default r3 = new Default("CHILD_FIRST", 2, new WrappingDispatcher(persistenceHandler, true));
            CHILD_FIRST = r3;
            Default r2 = new Default("CHILD_FIRST_PERSISTENT", 3, new WrappingDispatcher(persistenceHandler2, true));
            CHILD_FIRST_PERSISTENT = r2;
            Default r4 = new Default("INJECTION", 4, new InjectionDispatcher());
            INJECTION = r4;
            $VALUES = new Default[]{r0, r1, r3, r2, r4};
        }

        private Default(String str, int i, Configurable configurable) {
            this.dispatcher = configurable;
        }

        public static Default valueOf(String str) {
            return (Default) Enum.valueOf(Default.class, str);
        }

        public static Default[] values() {
            return (Default[]) $VALUES.clone();
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public Configurable<ClassLoader> allowExistingTypes() {
            return this.dispatcher.allowExistingTypes();
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return this.dispatcher.load(classLoader, map);
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public Configurable<ClassLoader> opened() {
            return this.dispatcher.opened();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public Configurable<ClassLoader> with(ProtectionDomain protectionDomain) {
            return this.dispatcher.with(protectionDomain);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public Configurable<ClassLoader> with(PackageDefinitionStrategy packageDefinitionStrategy) {
            return this.dispatcher.with(packageDefinitionStrategy);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForBootstrapInjection implements ClassLoadingStrategy<ClassLoader> {
        private final File folder;
        private final Instrumentation instrumentation;

        public ForBootstrapInjection(Instrumentation instrumentation, File file) {
            this.instrumentation = instrumentation;
            this.folder = file;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ForBootstrapInjection forBootstrapInjection = (ForBootstrapInjection) obj;
            return this.instrumentation.equals(forBootstrapInjection.instrumentation) && this.folder.equals(forBootstrapInjection.folder);
        }

        public int hashCode() {
            return (((getClass().hashCode() * 31) + this.instrumentation.hashCode()) * 31) + this.folder.hashCode();
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return (classLoader == null ? ClassInjector.UsingInstrumentation.m5271of(this.folder, ClassInjector.UsingInstrumentation.Target.BOOTSTRAP, this.instrumentation) : new ClassInjector.UsingReflection(classLoader)).inject(map);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForJnaInjection implements ClassLoadingStrategy<ClassLoader> {

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final ProtectionDomain protectionDomain;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ForJnaInjection() {
            this(ClassLoadingStrategy.NO_PROTECTION_DOMAIN);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProtectionDomain protectionDomain = this.protectionDomain;
            ProtectionDomain protectionDomain2 = ((ForJnaInjection) obj).protectionDomain;
            if (protectionDomain2 != null) {
                return protectionDomain != null && protectionDomain.equals(protectionDomain2);
            }
            if (protectionDomain != null) {
                return false;
            }
        }

        public int hashCode() {
            int iHashCode = getClass().hashCode() * 31;
            ProtectionDomain protectionDomain = this.protectionDomain;
            return protectionDomain != null ? iHashCode + protectionDomain.hashCode() : iHashCode;
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return new ClassInjector.UsingUnsafe(classLoader, this.protectionDomain).inject(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ForJnaInjection(@MaybeNull ProtectionDomain protectionDomain) {
            this.protectionDomain = protectionDomain;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForUnsafeInjection implements ClassLoadingStrategy<ClassLoader> {

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final ProtectionDomain protectionDomain;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ForUnsafeInjection() {
            this(ClassLoadingStrategy.NO_PROTECTION_DOMAIN);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProtectionDomain protectionDomain = this.protectionDomain;
            ProtectionDomain protectionDomain2 = ((ForUnsafeInjection) obj).protectionDomain;
            if (protectionDomain2 != null) {
                return protectionDomain != null && protectionDomain.equals(protectionDomain2);
            }
            if (protectionDomain != null) {
                return false;
            }
        }

        public int hashCode() {
            int iHashCode = getClass().hashCode() * 31;
            ProtectionDomain protectionDomain = this.protectionDomain;
            return protectionDomain != null ? iHashCode + protectionDomain.hashCode() : iHashCode;
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return new ClassInjector.UsingUnsafe(classLoader, this.protectionDomain).inject(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ForUnsafeInjection(@MaybeNull ProtectionDomain protectionDomain) {
            this.protectionDomain = protectionDomain;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingLookup implements ClassLoadingStrategy<ClassLoader> {
        private final ClassInjector classInjector;

        public UsingLookup(ClassInjector classInjector) {
            this.classInjector = classInjector;
        }

        /* JADX INFO: renamed from: of */
        public static ClassLoadingStrategy<ClassLoader> m5274of(Object obj) {
            return new UsingLookup(ClassInjector.UsingLookup.m5272of(obj));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static ClassLoadingStrategy<ClassLoader> withFallback(Callable<?> callable) {
            return withFallback(callable, false);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classInjector.equals(((UsingLookup) obj).classInjector);
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + this.classInjector.hashCode();
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return this.classInjector.inject(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public static ClassLoadingStrategy<ClassLoader> withFallback(Callable<?> callable, boolean z) {
            if (ClassInjector.UsingLookup.isAvailable()) {
                try {
                    return m5274of(callable.call());
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            if (ClassInjector.UsingUnsafe.isAvailable()) {
                return new ForUnsafeInjection();
            }
            if (z) {
                return Default.WRAPPER;
            }
            throw new IllegalStateException("Neither lookup or unsafe class injection is available");
        }
    }

    Map<TypeDescription, Class<?>> load(@MaybeNull T t, Map<TypeDescription, byte[]> map);
}

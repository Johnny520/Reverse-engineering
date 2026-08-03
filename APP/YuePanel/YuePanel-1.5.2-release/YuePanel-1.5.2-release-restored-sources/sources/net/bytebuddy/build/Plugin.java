package net.bytebuddy.build;

import com.bumptech.glide.load.Key;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.TypeResolutionStrategy;
import net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.FileSystem;
import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface Plugin extends ElementMatcher<TypeDescription>, Closeable {

    public interface Factory {

        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements Factory {
            private final Plugin plugin;

            public Simple(Plugin plugin) {
                this.plugin = plugin;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.plugin.equals(((Simple) obj).plugin);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.plugin.hashCode();
            }

            @Override // net.bytebuddy.build.Plugin.Factory
            public Plugin make() {
                return this.plugin;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class UsingReflection implements Factory {
            private final List<ArgumentResolver> argumentResolvers;
            private final Class<? extends Plugin> type;

            public interface ArgumentResolver {

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForIndex implements ArgumentResolver {
                    private static final Map<Class<?>, Class<?>> WRAPPER_TYPES;
                    private final int index;

                    @MaybeNull
                    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                    private final Object value;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class WithDynamicType implements ArgumentResolver {
                        private final int index;

                        @MaybeNull
                        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                        private final String value;

                        public WithDynamicType(int i, @MaybeNull String str) {
                            this.index = i;
                            this.value = str;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x002e A[RETURN] */
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
                            WithDynamicType withDynamicType = (WithDynamicType) obj;
                            if (this.index != withDynamicType.index) {
                                return false;
                            }
                            String str = this.value;
                            String str2 = withDynamicType.value;
                            if (str2 != null) {
                                return str != null && str.equals(str2);
                            }
                            if (str != null) {
                                return false;
                            }
                        }

                        public int hashCode() {
                            int iHashCode = ((getClass().hashCode() * 31) + this.index) * 31;
                            String str = this.value;
                            return str != null ? iHashCode + str.hashCode() : iHashCode;
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver
                        public Resolution resolve(int i, Class<?> cls) {
                            if (this.index != i) {
                                return Resolution.Unresolved.INSTANCE;
                            }
                            if (cls == Character.TYPE || cls == Character.class) {
                                String str = this.value;
                                return (str == null || str.length() != 1) ? Resolution.Unresolved.INSTANCE : new Resolution.Resolved(Character.valueOf(this.value.charAt(0)));
                            }
                            if (cls == String.class) {
                                return new Resolution.Resolved(this.value);
                            }
                            if (cls.isPrimitive()) {
                                cls = (Class) ForIndex.WRAPPER_TYPES.get(cls);
                            }
                            try {
                                Method method = cls.getMethod("valueOf", String.class);
                                return (Modifier.isStatic(method.getModifiers()) && cls.isAssignableFrom(method.getReturnType())) ? new Resolution.Resolved(method.invoke(null, this.value)) : Resolution.Unresolved.INSTANCE;
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException(e);
                            } catch (NoSuchMethodException unused) {
                                return Resolution.Unresolved.INSTANCE;
                            } catch (InvocationTargetException e2) {
                                throw new IllegalStateException(e2.getTargetException());
                            }
                        }
                    }

                    static {
                        HashMap map = new HashMap();
                        WRAPPER_TYPES = map;
                        map.put(Boolean.TYPE, Boolean.class);
                        map.put(Byte.TYPE, Byte.class);
                        map.put(Short.TYPE, Short.class);
                        map.put(Character.TYPE, Character.class);
                        map.put(Integer.TYPE, Integer.class);
                        map.put(Long.TYPE, Long.class);
                        map.put(Float.TYPE, Float.class);
                        map.put(Double.TYPE, Double.class);
                    }

                    public ForIndex(int i, @MaybeNull Object obj) {
                        this.index = i;
                        this.value = obj;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x002e A[RETURN] */
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
                        ForIndex forIndex = (ForIndex) obj;
                        if (this.index != forIndex.index) {
                            return false;
                        }
                        Object obj2 = this.value;
                        Object obj3 = forIndex.value;
                        if (obj3 != null) {
                            return obj2 != null && obj2.equals(obj3);
                        }
                        if (obj2 != null) {
                            return false;
                        }
                    }

                    public int hashCode() {
                        int iHashCode = ((getClass().hashCode() * 31) + this.index) * 31;
                        Object obj = this.value;
                        return obj != null ? iHashCode + obj.hashCode() : iHashCode;
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver
                    public Resolution resolve(int i, Class<?> cls) {
                        if (this.index != i) {
                            return Resolution.Unresolved.INSTANCE;
                        }
                        if (cls.isPrimitive()) {
                            return WRAPPER_TYPES.get(cls).isInstance(this.value) ? new Resolution.Resolved(this.value) : Resolution.Unresolved.INSTANCE;
                        }
                        Object obj = this.value;
                        return (obj == null || cls.isInstance(obj)) ? new Resolution.Resolved(this.value) : Resolution.Unresolved.INSTANCE;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForType<T> implements ArgumentResolver {
                    private final Class<? extends T> type;
                    private final T value;

                    public ForType(Class<? extends T> cls, T t) {
                        this.type = cls;
                        this.value = t;
                    }

                    /* JADX INFO: renamed from: of */
                    public static <S> ArgumentResolver m5197of(Class<? extends S> cls, S s) {
                        return new ForType(cls, s);
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForType forType = (ForType) obj;
                        return this.type.equals(forType.type) && this.value.equals(forType.value);
                    }

                    public int hashCode() {
                        return (((getClass().hashCode() * 31) + this.type.hashCode()) * 31) + this.value.hashCode();
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver
                    public Resolution resolve(int i, Class<?> cls) {
                        return cls == this.type ? new Resolution.Resolved(this.value) : Resolution.Unresolved.INSTANCE;
                    }
                }

                public enum NoOp implements ArgumentResolver {
                    INSTANCE;

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver
                    public Resolution resolve(int i, Class<?> cls) {
                        return Resolution.Unresolved.INSTANCE;
                    }
                }

                public interface Resolution {

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Resolved implements Resolution {

                        @MaybeNull
                        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                        private final Object argument;

                        public Resolved(@MaybeNull Object obj) {
                            this.argument = obj;
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
                            Object obj2 = this.argument;
                            Object obj3 = ((Resolved) obj).argument;
                            if (obj3 != null) {
                                return obj2 != null && obj2.equals(obj3);
                            }
                            if (obj2 != null) {
                                return false;
                            }
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution
                        @MaybeNull
                        public Object getArgument() {
                            return this.argument;
                        }

                        public int hashCode() {
                            int iHashCode = getClass().hashCode() * 31;
                            Object obj = this.argument;
                            return obj != null ? iHashCode + obj.hashCode() : iHashCode;
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution
                        public boolean isResolved() {
                            return true;
                        }
                    }

                    public enum Unresolved implements Resolution {
                        INSTANCE;

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution
                        public Object getArgument() {
                            throw new IllegalStateException("Cannot get the argument for an unresolved parameter");
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution
                        public boolean isResolved() {
                            return false;
                        }
                    }

                    @MaybeNull
                    Object getArgument();

                    boolean isResolved();
                }

                Resolution resolve(int i, Class<?> cls);
            }

            public interface Instantiator {

                @HashCodeAndEqualsPlugin.Enhance
                public static class Ambiguous implements Instantiator {
                    private final Constructor<?> left;
                    private final int parameters;
                    private final int priority;
                    private final Constructor<?> right;

                    public Ambiguous(Constructor<?> constructor, Constructor<?> constructor2, int i, int i2) {
                        this.left = constructor;
                        this.right = constructor2;
                        this.priority = i;
                        this.parameters = i2;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Ambiguous ambiguous = (Ambiguous) obj;
                        return this.priority == ambiguous.priority && this.parameters == ambiguous.parameters && this.left.equals(ambiguous.left) && this.right.equals(ambiguous.right);
                    }

                    public int hashCode() {
                        return (((((((getClass().hashCode() * 31) + this.left.hashCode()) * 31) + this.right.hashCode()) * 31) + this.priority) * 31) + this.parameters;
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public Plugin instantiate() {
                        throw new IllegalStateException("Ambiguous constructors " + this.left + " and " + this.right);
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public Instantiator replaceBy(Resolved resolved) {
                        Priority priority = (Priority) resolved.getConstructor().getAnnotation(Priority.class);
                        if ((priority == null ? 0 : priority.value()) > this.priority) {
                            return resolved;
                        }
                        return ((priority != null ? priority.value() : 0) >= this.priority && resolved.getConstructor().getParameterTypes().length > this.parameters) ? resolved : this;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Resolved implements Instantiator {
                    private final List<?> arguments;
                    private final Constructor<? extends Plugin> constructor;

                    public Resolved(Constructor<? extends Plugin> constructor, List<?> list) {
                        this.constructor = constructor;
                        this.arguments = list;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Resolved resolved = (Resolved) obj;
                        return this.constructor.equals(resolved.constructor) && this.arguments.equals(resolved.arguments);
                    }

                    public Constructor<? extends Plugin> getConstructor() {
                        return this.constructor;
                    }

                    public int hashCode() {
                        return (((getClass().hashCode() * 31) + this.constructor.hashCode()) * 31) + this.arguments.hashCode();
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public Plugin instantiate() {
                        try {
                            return this.constructor.newInstance(this.arguments.toArray(new Object[0]));
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Failed to access " + this.constructor, e);
                        } catch (InstantiationException e2) {
                            throw new IllegalStateException("Failed to instantiate plugin via " + this.constructor, e2);
                        } catch (InvocationTargetException e3) {
                            throw new IllegalStateException("Error during construction of" + this.constructor, e3.getTargetException());
                        }
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public Instantiator replaceBy(Resolved resolved) {
                        Priority priority = (Priority) this.constructor.getAnnotation(Priority.class);
                        Priority priority2 = (Priority) resolved.getConstructor().getAnnotation(Priority.class);
                        int iValue = priority == null ? 0 : priority.value();
                        int iValue2 = priority2 != null ? priority2.value() : 0;
                        return iValue > iValue2 ? this : iValue < iValue2 ? resolved : this.constructor.getParameterTypes().length > resolved.getConstructor().getParameterTypes().length ? this : this.constructor.getParameterTypes().length < resolved.getConstructor().getParameterTypes().length ? resolved : new Ambiguous(this.constructor, resolved.getConstructor(), iValue, this.constructor.getParameterTypes().length);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Unresolved implements Instantiator {
                    private final Class<? extends Plugin> type;

                    public Unresolved(Class<? extends Plugin> cls) {
                        this.type = cls;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.type.equals(((Unresolved) obj).type);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.type.hashCode();
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public Plugin instantiate() {
                        throw new IllegalStateException("No constructor resolvable for " + this.type);
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public Instantiator replaceBy(Resolved resolved) {
                        return resolved;
                    }
                }

                Plugin instantiate();

                Instantiator replaceBy(Resolved resolved);
            }

            @Target({ElementType.CONSTRUCTOR})
            @Documented
            @Retention(RetentionPolicy.RUNTIME)
            public @interface Priority {
                public static final int DEFAULT = 0;

                int value();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public UsingReflection(Class<? extends Plugin> cls) {
                this(cls, Collections.emptyList());
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                UsingReflection usingReflection = (UsingReflection) obj;
                return this.type.equals(usingReflection.type) && this.argumentResolvers.equals(usingReflection.argumentResolvers);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.type.hashCode()) * 31) + this.argumentResolvers.hashCode();
            }

            @Override // net.bytebuddy.build.Plugin.Factory
            public Plugin make() {
                ArgumentResolver.Resolution resolutionResolve;
                Instantiator unresolved = new Instantiator.Unresolved(this.type);
                for (Constructor<?> constructor : this.type.getConstructors()) {
                    if (!constructor.isSynthetic()) {
                        ArrayList arrayList = new ArrayList(constructor.getParameterTypes().length);
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        int length = parameterTypes.length;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i >= length) {
                                unresolved = unresolved.replaceBy(new Instantiator.Resolved(constructor, arrayList));
                                break;
                            }
                            Class<?> cls = parameterTypes[i];
                            Iterator<ArgumentResolver> it = this.argumentResolvers.iterator();
                            while (it.hasNext()) {
                                resolutionResolve = it.next().resolve(i2, cls);
                                if (resolutionResolve.isResolved()) {
                                    break;
                                }
                            }
                            arrayList.add(resolutionResolve.getArgument());
                            i2++;
                            i++;
                        }
                    }
                }
                return unresolved.instantiate();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public UsingReflection with(ArgumentResolver... argumentResolverArr) {
                return with(Arrays.asList(argumentResolverArr));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public UsingReflection(Class<? extends Plugin> cls, List<ArgumentResolver> list) {
                this.type = cls;
                this.argumentResolvers = list;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public UsingReflection with(List<? extends ArgumentResolver> list) {
                return new UsingReflection(this.type, CompoundList.m5414of((List) list, (List) this.argumentResolvers));
            }
        }

        Plugin make();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class ForElementMatcher implements Plugin {
        private final ElementMatcher<? super TypeDescription> matcher;

        public ForElementMatcher(ElementMatcher<? super TypeDescription> elementMatcher) {
            this.matcher = elementMatcher;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.matcher.equals(((ForElementMatcher) obj).matcher);
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + this.matcher.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: matches(Ljava/lang/Object;)Z */
        @Override // net.bytebuddy.matcher.ElementMatcher
        public boolean matches(@MaybeNull TypeDescription typeDescription) {
            return this.matcher.matches(typeDescription);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class NoOp implements Plugin, Factory {
        @Override // net.bytebuddy.build.Plugin
        public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
            throw new IllegalStateException("Cannot apply non-operational plugin");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public int hashCode() {
            return getClass().hashCode();
        }

        @Override // net.bytebuddy.build.Plugin.Factory
        public Plugin make() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: matches(Ljava/lang/Object;)Z */
        @Override // net.bytebuddy.matcher.ElementMatcher
        public boolean matches(@MaybeNull TypeDescription typeDescription) {
            return false;
        }
    }

    public interface WithInitialization extends Plugin {
        Map<TypeDescription, byte[]> initialize(ClassFileLocator classFileLocator);
    }

    public interface WithPreprocessor extends Plugin {
        void onPreprocess(TypeDescription typeDescription, ClassFileLocator classFileLocator);
    }

    DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator);

    public interface Engine {
        public static final String CLASS_FILE_EXTENSION = ".class";
        public static final String MODULE_INFO = "module-info.class";
        public static final String PACKAGE_INFO = "package-info.class";
        public static final String PLUGIN_FILE = "META-INF/net.bytebuddy/build.plugins";

        public static abstract class AbstractBase implements Engine {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.build.Plugin.Engine
            public Summary apply(File file, File file2, Factory... factoryArr) throws IOException {
                return apply(file, file2, Arrays.asList(factoryArr));
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine withErrorHandlers(ErrorHandler... errorHandlerArr) {
                return withErrorHandlers(Arrays.asList(errorHandlerArr));
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine withParallelTransformation(int i) {
                if (i >= 1) {
                    return with(new Dispatcher.ForParallelTransformation.WithThrowawayExecutorService.Factory(i));
                }
                throw new IllegalArgumentException("Number of threads must be positive: " + i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.build.Plugin.Engine
            public Summary apply(File file, File file2, List<? extends Factory> list) throws IOException {
                return apply(file.isDirectory() ? new Source.ForFolder(file) : new Source.ForJarFile(file), file2.isDirectory() ? new Target.ForFolder(file2) : new Target.ForJarFile(file2), list);
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Summary apply(Source source, Target target, Factory... factoryArr) throws IOException {
                return apply(source, target, Arrays.asList(factoryArr));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Default extends AbstractBase {
            private final ByteBuddy byteBuddy;
            private final ClassFileLocator classFileLocator;
            private final Dispatcher.Factory dispatcherFactory;
            private final ErrorHandler errorHandler;
            private final ElementMatcher.Junction<? super TypeDescription> ignoredTypeMatcher;
            private final Listener listener;
            private final PoolStrategy poolStrategy;
            private final TypeStrategy typeStrategy;

            public class Preprocessor implements Callable<Callable<? extends Dispatcher.Materializable>> {
                private final ClassFileLocator classFileLocator;
                private final Source.Element element;
                private final Listener listener;
                private final List<Plugin> plugins;
                private final List<WithPreprocessor> preprocessors;
                private final String typeName;
                private final TypePool typePool;

                public class Ignored implements Callable<Dispatcher.Materializable> {
                    private final TypeDescription typeDescription;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    private Ignored(TypeDescription typeDescription) {
                        this.typeDescription = typeDescription;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
                    @Override // java.util.concurrent.Callable
                    public Dispatcher.Materializable call() {
                        try {
                            Preprocessor.this.listener.onIgnored(this.typeDescription, Preprocessor.this.plugins);
                            Preprocessor.this.listener.onComplete(this.typeDescription);
                            return new Dispatcher.Materializable.ForRetainedElement(Preprocessor.this.element);
                        } catch (Throwable th) {
                            Preprocessor.this.listener.onComplete(this.typeDescription);
                            throw th;
                        }
                    }
                }

                public class Resolved implements Callable<Dispatcher.Materializable> {
                    private final TypeDescription typeDescription;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    private Resolved(TypeDescription typeDescription) {
                        this.typeDescription = typeDescription;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
                    @Override // java.util.concurrent.Callable
                    public Dispatcher.Materializable call() {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        try {
                            DynamicType.Builder<?> builder = Default.this.typeStrategy.builder(Default.this.byteBuddy, this.typeDescription, Preprocessor.this.classFileLocator);
                            for (Plugin plugin : Preprocessor.this.plugins) {
                                try {
                                    if (plugin.matches(this.typeDescription)) {
                                        builder = plugin.apply(builder, this.typeDescription, Preprocessor.this.classFileLocator);
                                        Preprocessor.this.listener.onTransformation(this.typeDescription, plugin);
                                        arrayList.add(plugin);
                                    } else {
                                        Preprocessor.this.listener.onIgnored(this.typeDescription, plugin);
                                        arrayList2.add(plugin);
                                    }
                                } catch (Throwable th) {
                                    Preprocessor.this.listener.onError(this.typeDescription, plugin, th);
                                    arrayList3.add(th);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                Preprocessor.this.listener.onError(this.typeDescription, arrayList3);
                                Dispatcher.Materializable.ForFailedElement forFailedElement = new Dispatcher.Materializable.ForFailedElement(Preprocessor.this.element, this.typeDescription, arrayList3);
                                Preprocessor.this.listener.onComplete(this.typeDescription);
                                return forFailedElement;
                            }
                            if (arrayList.isEmpty()) {
                                Preprocessor.this.listener.onIgnored(this.typeDescription, arrayList2);
                                Dispatcher.Materializable.ForRetainedElement forRetainedElement = new Dispatcher.Materializable.ForRetainedElement(Preprocessor.this.element);
                                Preprocessor.this.listener.onComplete(this.typeDescription);
                                return forRetainedElement;
                            }
                            try {
                                DynamicType.Unloaded<?> unloadedMake = builder.make(TypeResolutionStrategy.Disabled.INSTANCE, Preprocessor.this.typePool);
                                Preprocessor.this.listener.onTransformation(this.typeDescription, arrayList);
                                for (Map.Entry<TypeDescription, LoadedTypeInitializer> entry : unloadedMake.getLoadedTypeInitializers().entrySet()) {
                                    if (entry.getValue().isAlive()) {
                                        Preprocessor.this.listener.onLiveInitializer(this.typeDescription, entry.getKey());
                                    }
                                }
                                Dispatcher.Materializable.ForTransformedElement forTransformedElement = new Dispatcher.Materializable.ForTransformedElement(unloadedMake);
                                Preprocessor.this.listener.onComplete(this.typeDescription);
                                return forTransformedElement;
                            } catch (Throwable th2) {
                                arrayList3.add(th2);
                                Preprocessor.this.listener.onError(this.typeDescription, arrayList3);
                                Dispatcher.Materializable.ForFailedElement forFailedElement2 = new Dispatcher.Materializable.ForFailedElement(Preprocessor.this.element, this.typeDescription, arrayList3);
                                Preprocessor.this.listener.onComplete(this.typeDescription);
                                return forFailedElement2;
                            }
                        } catch (Throwable th3) {
                            Preprocessor.this.listener.onComplete(this.typeDescription);
                            throw th3;
                        }
                    }
                }

                public class Unresolved implements Callable<Dispatcher.Materializable> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    private Unresolved() {
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
                    @Override // java.util.concurrent.Callable
                    public Dispatcher.Materializable call() {
                        Preprocessor.this.listener.onUnresolved(Preprocessor.this.typeName);
                        return new Dispatcher.Materializable.ForUnresolvedElement(Preprocessor.this.element, Preprocessor.this.typeName);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                private Preprocessor(Source.Element element, String str, ClassFileLocator classFileLocator, TypePool typePool, Listener listener, List<Plugin> list, List<WithPreprocessor> list2) {
                    this.element = element;
                    this.typeName = str;
                    this.classFileLocator = classFileLocator;
                    this.typePool = typePool;
                    this.listener = listener;
                    this.plugins = list;
                    this.preprocessors = list2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
                /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
                /* JADX DEBUG: Return type fixed from 'java.util.concurrent.Callable<net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>' to match base method */
                @Override // java.util.concurrent.Callable
                public Callable<? extends Dispatcher.Materializable> call() throws Exception {
                    this.listener.onDiscovery(this.typeName);
                    TypePool.Resolution resolutionDescribe = this.typePool.describe(this.typeName);
                    if (!resolutionDescribe.isResolved()) {
                        return new Unresolved();
                    }
                    TypeDescription typeDescriptionResolve = resolutionDescribe.resolve();
                    try {
                        if (Default.this.ignoredTypeMatcher.matches(typeDescriptionResolve)) {
                            return new Ignored(typeDescriptionResolve);
                        }
                        Iterator<WithPreprocessor> it = this.preprocessors.iterator();
                        while (it.hasNext()) {
                            it.next().onPreprocess(typeDescriptionResolve, this.classFileLocator);
                        }
                        return new Resolved(typeDescriptionResolve);
                    } catch (Throwable th) {
                        this.listener.onComplete(typeDescriptionResolve);
                        if (th instanceof Exception) {
                            throw ((Exception) th);
                        }
                        if (th instanceof Error) {
                            throw ((Error) th);
                        }
                        throw new IllegalStateException(th);
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Default() {
                this(new ByteBuddy());
            }

            public static void main(String... strArr) throws IOException, ClassNotFoundException {
                if (strArr.length < 2) {
                    throw new IllegalArgumentException("Expected arguments: <source> <target> [<plugin>, ...]");
                }
                ArrayList arrayList = new ArrayList(strArr.length - 2);
                Iterator it = Arrays.asList(strArr).subList(2, strArr.length).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Factory.UsingReflection(Class.forName((String) it.next())));
                }
                new Default().apply(new File(strArr[0]), new File(strArr[1]), arrayList);
            }

            /* JADX INFO: renamed from: of */
            public static Engine m5196of(EntryPoint entryPoint, ClassFileVersion classFileVersion, MethodNameTransformer methodNameTransformer) {
                return new Default(entryPoint.byteBuddy(classFileVersion), new TypeStrategy.ForEntryPoint(entryPoint, methodNameTransformer));
            }

            public static Set<String> scan(ClassLoader classLoader) throws IOException {
                HashSet hashSet = new HashSet();
                Enumeration<URL> resources = classLoader.getResources(Engine.PLUGIN_FILE);
                while (resources.hasMoreElements()) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.nextElement().openStream(), Key.STRING_CHARSET_NAME));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                hashSet.add(line);
                            }
                        } finally {
                            bufferedReader.close();
                        }
                    }
                }
                return hashSet;
            }

            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x01a2 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:115:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x014f A[Catch: all -> 0x013f, TryCatch #14 {all -> 0x013f, blocks: (B:45:0x0139, B:53:0x014f, B:55:0x0160), top: B:149:0x0139 }] */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Iterator] */
            @Override // net.bytebuddy.build.Plugin.Engine
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Summary apply(Source source, Target target, List<? extends Factory> list) throws Throwable {
                ArrayList<Plugin> arrayList;
                Throwable th;
                ?? it;
                Dispatcher dispatcher;
                Target.Sink sink;
                ClassFileLocator.Compound compound;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Target.Sink sink2;
                int i = 0;
                int i2 = 1;
                Listener.Compound compound2 = new Listener.Compound(this.listener, new Listener.ForErrorHandler(this.errorHandler));
                ArrayList arrayList5 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList(list.size());
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                Object obj = null;
                try {
                    Iterator<? extends Factory> it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            Plugin pluginMake = it2.next().make();
                            arrayList7.add(pluginMake);
                            if (pluginMake instanceof WithPreprocessor) {
                                arrayList9.add((WithPreprocessor) pluginMake);
                            }
                            if (pluginMake instanceof WithInitialization) {
                                arrayList8.add((WithInitialization) pluginMake);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList = arrayList7;
                            while (r2.hasNext()) {
                            }
                            throw th;
                        }
                    }
                    try {
                        Source.Origin origin = source.read();
                        try {
                            try {
                                ClassFileLocator.Compound compound3 = new ClassFileLocator.Compound(origin.getClassFileLocator(), this.classFileLocator);
                                TypePool typePool = this.poolStrategy.typePool(compound3);
                                Manifest manifest = origin.getManifest();
                                compound2.onManifest(manifest);
                                Target.Sink sinkWrite = target.write(manifest);
                                try {
                                    it = arrayList8.iterator();
                                    while (it.hasNext()) {
                                        sinkWrite.store(((WithInitialization) it.next()).initialize(compound3));
                                    }
                                    try {
                                        Dispatcher dispatcherMake = this.dispatcherFactory.make(sinkWrite, arrayList5, linkedHashMap, arrayList6);
                                        try {
                                            for (Source.Element element : origin) {
                                                if (Thread.interrupted()) {
                                                    Thread.currentThread().interrupt();
                                                    throw new IllegalStateException("Thread interrupted during plugin engine application");
                                                }
                                                String name = element.getName();
                                                while (name.startsWith("/")) {
                                                    name = name.substring(i2);
                                                }
                                                if (name.endsWith(".class")) {
                                                    try {
                                                        if (name.endsWith(Engine.PACKAGE_INFO) || name.equals(Engine.MODULE_INFO)) {
                                                            dispatcher = dispatcherMake;
                                                            sink = sinkWrite;
                                                            compound = compound3;
                                                            arrayList2 = arrayList9;
                                                            arrayList3 = arrayList7;
                                                            arrayList4 = arrayList6;
                                                            if (!name.equals("META-INF/MANIFEST.MF")) {
                                                                compound2.onResource(name);
                                                                sink2 = sink;
                                                                try {
                                                                    sink2.retain(element);
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    dispatcher.close();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            Dispatcher dispatcher2 = dispatcherMake;
                                                            sink = sinkWrite;
                                                            compound = compound3;
                                                            arrayList2 = arrayList9;
                                                            arrayList3 = arrayList7;
                                                            arrayList4 = arrayList6;
                                                            try {
                                                                dispatcher = dispatcher2;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                dispatcher = dispatcher2;
                                                            }
                                                            try {
                                                                dispatcher.accept(new Preprocessor(element, name.substring(i, name.length() - 6).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), compound3, typePool, compound2, arrayList7, arrayList2), arrayList2.isEmpty());
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                dispatcher.close();
                                                                throw th;
                                                            }
                                                        }
                                                        sink2 = sink;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        dispatcher = dispatcherMake;
                                                        sink = sinkWrite;
                                                    }
                                                }
                                                compound3 = compound;
                                                sinkWrite = sink2;
                                                dispatcherMake = dispatcher;
                                                arrayList6 = arrayList4;
                                                arrayList9 = arrayList2;
                                                arrayList7 = arrayList3;
                                                i2 = 1;
                                                i = 0;
                                            }
                                            Dispatcher dispatcher3 = dispatcherMake;
                                            Target.Sink sink3 = sinkWrite;
                                            ArrayList<Plugin> arrayList10 = arrayList7;
                                            ArrayList arrayList11 = arrayList6;
                                            dispatcher3.complete();
                                            dispatcher3.close();
                                            if (!linkedHashMap.isEmpty()) {
                                                compound2.onError(linkedHashMap);
                                            }
                                            sink3.close();
                                            origin.close();
                                            Throwable th7 = null;
                                            for (Plugin plugin : arrayList10) {
                                                try {
                                                    plugin.close();
                                                } catch (Throwable th8) {
                                                    try {
                                                        compound2.onError(plugin, th8);
                                                    } catch (Throwable th9) {
                                                        if (th7 == null) {
                                                            th7 = th9;
                                                        }
                                                    }
                                                }
                                            }
                                            if (th7 == null) {
                                                return new Summary(arrayList5, linkedHashMap, arrayList11);
                                            }
                                            if (th7 instanceof IOException) {
                                                throw ((IOException) th7);
                                            }
                                            if (th7 instanceof RuntimeException) {
                                                throw ((RuntimeException) th7);
                                            }
                                            throw new IllegalStateException(th7);
                                        } catch (Throwable th10) {
                                            th = th10;
                                            dispatcher = dispatcherMake;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        it.close();
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    it = sinkWrite;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                origin.close();
                                throw th;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            origin.close();
                            throw th;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        th = th;
                        for (Plugin plugin2 : arrayList) {
                            try {
                                plugin2.close();
                            } catch (Throwable th16) {
                                try {
                                    compound2.onError(plugin2, th16);
                                } catch (Throwable th17) {
                                    if (obj == null) {
                                        obj = th17;
                                    }
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th18) {
                    th = th18;
                    arrayList = arrayList7;
                }
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Default r5 = (Default) obj;
                return this.byteBuddy.equals(r5.byteBuddy) && this.typeStrategy.equals(r5.typeStrategy) && this.poolStrategy.equals(r5.poolStrategy) && this.classFileLocator.equals(r5.classFileLocator) && this.listener.equals(r5.listener) && this.errorHandler.equals(r5.errorHandler) && this.dispatcherFactory.equals(r5.dispatcherFactory) && this.ignoredTypeMatcher.equals(r5.ignoredTypeMatcher);
            }

            public int hashCode() {
                return (((((((((((((((getClass().hashCode() * 31) + this.byteBuddy.hashCode()) * 31) + this.typeStrategy.hashCode()) * 31) + this.poolStrategy.hashCode()) * 31) + this.classFileLocator.hashCode()) * 31) + this.listener.hashCode()) * 31) + this.errorHandler.hashCode()) * 31) + this.dispatcherFactory.hashCode()) * 31) + this.ignoredTypeMatcher.hashCode();
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine ignore(ElementMatcher<? super TypeDescription> elementMatcher) {
                return new Default(this.byteBuddy, this.typeStrategy, this.poolStrategy, this.classFileLocator, this.listener, this.errorHandler, this.dispatcherFactory, this.ignoredTypeMatcher.mo5389or(elementMatcher));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine with(ByteBuddy byteBuddy) {
                return new Default(byteBuddy, this.typeStrategy, this.poolStrategy, this.classFileLocator, this.listener, this.errorHandler, this.dispatcherFactory, this.ignoredTypeMatcher);
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine withErrorHandlers(List<? extends ErrorHandler> list) {
                return new Default(this.byteBuddy, this.typeStrategy, this.poolStrategy, this.classFileLocator, this.listener, new ErrorHandler.Compound(list), this.dispatcherFactory, this.ignoredTypeMatcher);
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine withoutErrorHandlers() {
                return new Default(this.byteBuddy, this.typeStrategy, this.poolStrategy, this.classFileLocator, this.listener, Listener.NoOp.INSTANCE, this.dispatcherFactory, this.ignoredTypeMatcher);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Default(ByteBuddy byteBuddy) {
                this(byteBuddy, TypeStrategy.Default.REBASE);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine with(TypeStrategy typeStrategy) {
                return new Default(this.byteBuddy, typeStrategy, this.poolStrategy, this.classFileLocator, this.listener, this.errorHandler, this.dispatcherFactory, this.ignoredTypeMatcher);
            }

            public Default(ByteBuddy byteBuddy, TypeStrategy typeStrategy) {
                this(byteBuddy, typeStrategy, PoolStrategy.Default.FAST, ClassFileLocator.NoOp.INSTANCE, Listener.NoOp.INSTANCE, new ErrorHandler.Compound(ErrorHandler.Failing.FAIL_FAST, ErrorHandler.Enforcing.ALL_TYPES_RESOLVED, ErrorHandler.Enforcing.NO_LIVE_INITIALIZERS), Dispatcher.ForSerialTransformation.Factory.INSTANCE, ElementMatchers.none());
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine with(PoolStrategy poolStrategy) {
                return new Default(this.byteBuddy, this.typeStrategy, poolStrategy, this.classFileLocator, this.listener, this.errorHandler, this.dispatcherFactory, this.ignoredTypeMatcher);
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine with(ClassFileLocator classFileLocator) {
                return new Default(this.byteBuddy, this.typeStrategy, this.poolStrategy, new ClassFileLocator.Compound(this.classFileLocator, classFileLocator), this.listener, this.errorHandler, this.dispatcherFactory, this.ignoredTypeMatcher);
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine with(Listener listener) {
                return new Default(this.byteBuddy, this.typeStrategy, this.poolStrategy, this.classFileLocator, new Listener.Compound(this.listener, listener), this.errorHandler, this.dispatcherFactory, this.ignoredTypeMatcher);
            }

            public Default(ByteBuddy byteBuddy, TypeStrategy typeStrategy, PoolStrategy poolStrategy, ClassFileLocator classFileLocator, Listener listener, ErrorHandler errorHandler, Dispatcher.Factory factory, ElementMatcher.Junction<? super TypeDescription> junction) {
                this.byteBuddy = byteBuddy;
                this.typeStrategy = typeStrategy;
                this.poolStrategy = poolStrategy;
                this.classFileLocator = classFileLocator;
                this.listener = listener;
                this.errorHandler = errorHandler;
                this.dispatcherFactory = factory;
                this.ignoredTypeMatcher = junction;
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public Engine with(Dispatcher.Factory factory) {
                return new Default(this.byteBuddy, this.typeStrategy, this.poolStrategy, this.classFileLocator, this.listener, this.errorHandler, factory, this.ignoredTypeMatcher);
            }
        }

        public interface Dispatcher extends Closeable {

            public interface Factory {
                Dispatcher make(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2);
            }

            public static class ForParallelTransformation implements Dispatcher {
                private int deferred;
                private final Map<TypeDescription, List<Throwable>> failed;
                private final Set<Future<?>> futures = new HashSet();
                private final CompletionService<Materializable> materializers;
                private final CompletionService<Callable<Materializable>> preprocessings;
                private final Target.Sink sink;
                private final List<TypeDescription> transformed;
                private final List<String> unresolved;

                @HashCodeAndEqualsPlugin.Enhance
                public static class EagerWork implements Callable<Materializable> {
                    private final Callable<? extends Callable<? extends Materializable>> work;

                    public EagerWork(Callable<? extends Callable<? extends Materializable>> callable) {
                        this.work = callable;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.work.equals(((EagerWork) obj).work);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.work.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
                    @Override // java.util.concurrent.Callable
                    public Materializable call() throws Exception {
                        return this.work.call().call();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Factory implements Factory {
                    private final Executor executor;

                    public Factory(Executor executor) {
                        this.executor = executor;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.executor.equals(((Factory) obj).executor);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.executor.hashCode();
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory
                    public Dispatcher make(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) {
                        return new ForParallelTransformation(this.executor, sink, list, map, list2);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class WithThrowawayExecutorService extends ForParallelTransformation {
                    private final ExecutorService executorService;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements Factory {
                        private final int threads;

                        public Factory(int i) {
                            this.threads = i;
                        }

                        public boolean equals(@MaybeNull Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.threads == ((Factory) obj).threads;
                        }

                        public int hashCode() {
                            return (getClass().hashCode() * 31) + this.threads;
                        }

                        @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory
                        public Dispatcher make(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) {
                            return new WithThrowawayExecutorService(Executors.newFixedThreadPool(this.threads), sink, list, map, list2);
                        }
                    }

                    public WithThrowawayExecutorService(ExecutorService executorService, Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) {
                        super(executorService, sink, list, map, list2);
                        this.executorService = executorService;
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        try {
                            super.close();
                        } finally {
                            this.executorService.shutdown();
                        }
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.executorService.equals(((WithThrowawayExecutorService) obj).executorService);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.executorService.hashCode();
                    }
                }

                public ForParallelTransformation(Executor executor, Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) {
                    this.sink = sink;
                    this.transformed = list;
                    this.failed = map;
                    this.unresolved = list2;
                    this.preprocessings = new ExecutorCompletionService(executor);
                    this.materializers = new ExecutorCompletionService(executor);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher
                public void accept(Callable<? extends Callable<? extends Materializable>> callable, boolean z) {
                    if (z) {
                        this.futures.add(this.materializers.submit(new EagerWork(callable)));
                    } else {
                        this.deferred++;
                        this.futures.add(this.preprocessings.submit(callable));
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Iterator<Future<?>> it = this.futures.iterator();
                    while (it.hasNext()) {
                        it.next().cancel(true);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher
                public void complete() throws IOException {
                    try {
                        ArrayList arrayList = new ArrayList(this.deferred);
                        while (true) {
                            int i = this.deferred;
                            this.deferred = i - 1;
                            if (i <= 0) {
                                break;
                            }
                            Future<Callable<Materializable>> futureTake = this.preprocessings.take();
                            this.futures.remove(futureTake);
                            arrayList.add(futureTake.get());
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.futures.add(this.materializers.submit((Callable) it.next()));
                        }
                        while (!this.futures.isEmpty()) {
                            Future<Materializable> futureTake2 = this.materializers.take();
                            this.futures.remove(futureTake2);
                            futureTake2.get().materialize(this.sink, this.transformed, this.failed, this.unresolved);
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException(e);
                    } catch (ExecutionException e2) {
                        Throwable cause = e2.getCause();
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        if (cause instanceof RuntimeException) {
                            throw ((RuntimeException) cause);
                        }
                        if (!(cause instanceof Error)) {
                            throw new IllegalStateException(cause);
                        }
                        throw ((Error) cause);
                    }
                }
            }

            public static class ForSerialTransformation implements Dispatcher {
                private final Map<TypeDescription, List<Throwable>> failed;
                private final List<Callable<? extends Materializable>> preprocessings = new ArrayList();
                private final Target.Sink sink;
                private final List<TypeDescription> transformed;
                private final List<String> unresolved;

                public enum Factory implements Factory {
                    INSTANCE;

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory
                    public Dispatcher make(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) {
                        return new ForSerialTransformation(sink, list, map, list2);
                    }
                }

                public ForSerialTransformation(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) {
                    this.sink = sink;
                    this.transformed = list;
                    this.failed = map;
                    this.unresolved = list2;
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher
                public void accept(Callable<? extends Callable<? extends Materializable>> callable, boolean z) throws IOException {
                    try {
                        Callable<? extends Materializable> callableCall = callable.call();
                        if (z) {
                            callableCall.call().materialize(this.sink, this.transformed, this.failed, this.unresolved);
                        } else {
                            this.preprocessings.add(callableCall);
                        }
                    } catch (Exception e) {
                        if (e instanceof IOException) {
                            throw ((IOException) e);
                        }
                        if (!(e instanceof RuntimeException)) {
                            throw new IllegalStateException(e);
                        }
                        throw ((RuntimeException) e);
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher
                public void complete() throws IOException {
                    for (Callable<? extends Materializable> callable : this.preprocessings) {
                        if (Thread.interrupted()) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException("Interrupted during plugin engine completion");
                        }
                        try {
                            callable.call().materialize(this.sink, this.transformed, this.failed, this.unresolved);
                        } catch (Exception e) {
                            if (e instanceof IOException) {
                                throw ((IOException) e);
                            }
                            if (!(e instanceof RuntimeException)) {
                                throw new IllegalStateException(e);
                            }
                            throw ((RuntimeException) e);
                        }
                    }
                }
            }

            public interface Materializable {

                public static class ForFailedElement implements Materializable {
                    private final Source.Element element;
                    private final List<Throwable> errored;
                    private final TypeDescription typeDescription;

                    public ForFailedElement(Source.Element element, TypeDescription typeDescription, List<Throwable> list) {
                        this.element = element;
                        this.typeDescription = typeDescription;
                        this.errored = list;
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable
                    public void materialize(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) throws IOException {
                        sink.retain(this.element);
                        map.put(this.typeDescription, this.errored);
                    }
                }

                public static class ForRetainedElement implements Materializable {
                    private final Source.Element element;

                    public ForRetainedElement(Source.Element element) {
                        this.element = element;
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable
                    public void materialize(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) throws IOException {
                        sink.retain(this.element);
                    }
                }

                public static class ForTransformedElement implements Materializable {
                    private final DynamicType dynamicType;

                    public ForTransformedElement(DynamicType dynamicType) {
                        this.dynamicType = dynamicType;
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable
                    public void materialize(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) throws IOException {
                        sink.store(this.dynamicType.getAllTypes());
                        list.add(this.dynamicType.getTypeDescription());
                    }
                }

                public static class ForUnresolvedElement implements Materializable {
                    private final Source.Element element;
                    private final String typeName;

                    public ForUnresolvedElement(Source.Element element, String str) {
                        this.element = element;
                        this.typeName = str;
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable
                    public void materialize(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) throws IOException {
                        sink.retain(this.element);
                        list2.add(this.typeName);
                    }
                }

                void materialize(Target.Sink sink, List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) throws IOException;
            }

            void accept(Callable<? extends Callable<? extends Materializable>> callable, boolean z) throws IOException;

            void complete() throws IOException;
        }

        public interface ErrorHandler {

            public static class Compound implements ErrorHandler {
                private final List<ErrorHandler> errorHandlers;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Compound(ErrorHandler... errorHandlerArr) {
                    this((List<? extends ErrorHandler>) Arrays.asList(errorHandlerArr));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                    Iterator<ErrorHandler> it = this.errorHandlers.iterator();
                    while (it.hasNext()) {
                        it.next().onError(typeDescription, plugin, th);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                    Iterator<ErrorHandler> it = this.errorHandlers.iterator();
                    while (it.hasNext()) {
                        it.next().onLiveInitializer(typeDescription, typeDescription2);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@MaybeNull Manifest manifest) {
                    Iterator<ErrorHandler> it = this.errorHandlers.iterator();
                    while (it.hasNext()) {
                        it.next().onManifest(manifest);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(String str) {
                    Iterator<ErrorHandler> it = this.errorHandlers.iterator();
                    while (it.hasNext()) {
                        it.next().onResource(str);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(String str) {
                    Iterator<ErrorHandler> it = this.errorHandlers.iterator();
                    while (it.hasNext()) {
                        it.next().onUnresolved(str);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Compound(List<? extends ErrorHandler> list) {
                    this.errorHandlers = new ArrayList();
                    for (ErrorHandler errorHandler : list) {
                        if (errorHandler instanceof Compound) {
                            this.errorHandlers.addAll(((Compound) errorHandler).errorHandlers);
                        } else if (!(errorHandler instanceof Listener.NoOp)) {
                            this.errorHandlers.add(errorHandler);
                        }
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, List<Throwable> list) {
                    Iterator<ErrorHandler> it = this.errorHandlers.iterator();
                    while (it.hasNext()) {
                        it.next().onError(typeDescription, list);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Map<TypeDescription, List<Throwable>> map) {
                    Iterator<ErrorHandler> it = this.errorHandlers.iterator();
                    while (it.hasNext()) {
                        it.next().onError(map);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                    Iterator<ErrorHandler> it = this.errorHandlers.iterator();
                    while (it.hasNext()) {
                        it.next().onError(plugin, th);
                    }
                }
            }

            public enum Enforcing implements ErrorHandler {
                ALL_TYPES_RESOLVED { // from class: net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.1
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onUnresolved(String str) {
                        throw new IllegalStateException("Failed to resolve type description for " + str);
                    }
                },
                NO_LIVE_INITIALIZERS { // from class: net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.2
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                        throw new IllegalStateException("Failed to instrument " + typeDescription + " due to live initializer for " + typeDescription2);
                    }
                },
                CLASS_FILES_ONLY { // from class: net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.3
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onResource(String str) {
                        throw new IllegalStateException("Discovered a resource when only class files were allowed: " + str);
                    }
                },
                MANIFEST_REQUIRED { // from class: net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.4
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onManifest(@MaybeNull Manifest manifest) {
                        if (manifest == null) {
                            throw new IllegalStateException("Required a manifest but no manifest was found");
                        }
                    }
                };

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Map<TypeDescription, List<Throwable>> map) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@MaybeNull Manifest manifest) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(String str) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(String str) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, List<Throwable> list) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                }
            }

            public enum Failing implements ErrorHandler {
                FAIL_FAST { // from class: net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                        throw new IllegalStateException("Failed to transform " + typeDescription + " using " + plugin, th);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(TypeDescription typeDescription, List<Throwable> list) {
                        throw new UnsupportedOperationException("onError");
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(Map<TypeDescription, List<Throwable>> map) {
                        throw new UnsupportedOperationException("onError");
                    }
                },
                FAIL_AFTER_TYPE { // from class: net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(TypeDescription typeDescription, List<Throwable> list) {
                        throw new IllegalStateException("Failed to transform " + typeDescription + ": " + list);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(Map<TypeDescription, List<Throwable>> map) {
                        throw new UnsupportedOperationException("onError");
                    }
                },
                FAIL_LAST { // from class: net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(TypeDescription typeDescription, List<Throwable> list) {
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                    public void onError(Map<TypeDescription, List<Throwable>> map) {
                        throw new IllegalStateException("Failed to transform at least one type: " + map);
                    }
                };

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                    throw new IllegalStateException("Failed to close plugin " + plugin, th);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(Manifest manifest) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(String str) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(String str) {
                }
            }

            void onError(Map<TypeDescription, List<Throwable>> map);

            void onError(Plugin plugin, Throwable th);

            void onError(TypeDescription typeDescription, List<Throwable> list);

            void onError(TypeDescription typeDescription, Plugin plugin, Throwable th);

            void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2);

            void onManifest(@MaybeNull Manifest manifest);

            void onResource(String str);

            void onUnresolved(String str);
        }

        public interface PoolStrategy {

            public enum Default implements PoolStrategy {
                FAST(TypePool.Default.ReaderMode.FAST),
                EXTENDED(TypePool.Default.ReaderMode.EXTENDED);

                private final TypePool.Default.ReaderMode readerMode;

                Default(TypePool.Default.ReaderMode readerMode) {
                    this.readerMode = readerMode;
                }

                @Override // net.bytebuddy.build.Plugin.Engine.PoolStrategy
                public TypePool typePool(ClassFileLocator classFileLocator) {
                    return new TypePool.Default.WithLazyResolution(new TypePool.CacheProvider.Simple(), classFileLocator, this.readerMode, TypePool.ClassLoading.ofPlatformLoader());
                }
            }

            public enum Eager implements PoolStrategy {
                FAST(TypePool.Default.ReaderMode.FAST),
                EXTENDED(TypePool.Default.ReaderMode.EXTENDED);

                private final TypePool.Default.ReaderMode readerMode;

                Eager(TypePool.Default.ReaderMode readerMode) {
                    this.readerMode = readerMode;
                }

                @Override // net.bytebuddy.build.Plugin.Engine.PoolStrategy
                public TypePool typePool(ClassFileLocator classFileLocator) {
                    return new TypePool.Default(new TypePool.CacheProvider.Simple(), classFileLocator, this.readerMode, TypePool.ClassLoading.ofPlatformLoader());
                }
            }

            TypePool typePool(ClassFileLocator classFileLocator);
        }

        public interface Source {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements Source {
                private final Collection<? extends Source> sources;

                @HashCodeAndEqualsPlugin.Enhance
                public static class Origin implements Origin {
                    private final List<Origin> origins;

                    public static class CompoundIterator implements Iterator<Element> {
                        private final List<? extends Iterable<? extends Element>> backlog;

                        @MaybeNull
                        private Iterator<? extends Element> current;

                        public CompoundIterator(List<? extends Iterable<? extends Element>> list) {
                            this.backlog = list;
                            forward();
                        }

                        private void forward() {
                            while (true) {
                                Iterator<? extends Element> it = this.current;
                                if ((it != null && it.hasNext()) || this.backlog.isEmpty()) {
                                    return;
                                } else {
                                    this.current = this.backlog.remove(0).iterator();
                                }
                            }
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            Iterator<? extends Element> it = this.current;
                            return it != null && it.hasNext();
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                        @Override // java.util.Iterator
                        public Element next() {
                            try {
                                Iterator<? extends Element> it = this.current;
                                if (it != null) {
                                    return it.next();
                                }
                                throw new NoSuchElementException();
                            } finally {
                                forward();
                            }
                        }
                    }

                    public Origin(List<Origin> list) {
                        this.origins = list;
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        Iterator<Origin> it = this.origins.iterator();
                        while (it.hasNext()) {
                            it.next().close();
                        }
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.origins.equals(((Origin) obj).origins);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    public ClassFileLocator getClassFileLocator() {
                        ArrayList arrayList = new ArrayList(this.origins.size());
                        Iterator<Origin> it = this.origins.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getClassFileLocator());
                        }
                        return new ClassFileLocator.Compound(arrayList);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    public Manifest getManifest() throws IOException {
                        Iterator<Origin> it = this.origins.iterator();
                        while (it.hasNext()) {
                            Manifest manifest = it.next().getManifest();
                            if (manifest != null) {
                                return manifest;
                            }
                        }
                        return Origin.NO_MANIFEST;
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.origins.hashCode();
                    }

                    @Override // java.lang.Iterable
                    public Iterator<Element> iterator() {
                        return new CompoundIterator(this.origins);
                    }
                }

                public Compound(Collection<? extends Source> collection) {
                    this.sources = collection;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.sources.equals(((Compound) obj).sources);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.sources.hashCode();
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public Origin read() throws IOException {
                    if (this.sources.isEmpty()) {
                        return Empty.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList(this.sources.size());
                    try {
                        Iterator<? extends Source> it = this.sources.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().read());
                        }
                        return new Origin(arrayList);
                    } catch (IOException e) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((Origin) it2.next()).close();
                        }
                        throw e;
                    }
                }
            }

            public interface Element {

                @SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
                @HashCodeAndEqualsPlugin.Enhance
                public static class ForByteArray implements Element {
                    private final byte[] binaryRepresentation;
                    private final String name;

                    public ForByteArray(String str, byte[] bArr) {
                        this.name = str;
                        this.binaryRepresentation = bArr;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForByteArray forByteArray = (ForByteArray) obj;
                        return this.name.equals(forByteArray.name) && Arrays.equals(this.binaryRepresentation, forByteArray.binaryRepresentation);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public InputStream getInputStream() {
                        return new ByteArrayInputStream(this.binaryRepresentation);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public String getName() {
                        return this.name;
                    }

                    public int hashCode() {
                        return (((getClass().hashCode() * 31) + this.name.hashCode()) * 31) + Arrays.hashCode(this.binaryRepresentation);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    @AlwaysNull
                    public <T> T resolveAs(Class<T> cls) {
                        return null;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForFile implements Element {
                    private final File file;
                    private final File root;

                    public ForFile(File file, File file2) {
                        this.root = file;
                        this.file = file2;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForFile forFile = (ForFile) obj;
                        return this.root.equals(forFile.root) && this.file.equals(forFile.file);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public InputStream getInputStream() throws IOException {
                        return new FileInputStream(this.file);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public String getName() {
                        return this.root.getAbsoluteFile().toURI().relativize(this.file.getAbsoluteFile().toURI()).getPath();
                    }

                    public int hashCode() {
                        return (((getClass().hashCode() * 31) + this.root.hashCode()) * 31) + this.file.hashCode();
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    @MaybeNull
                    public <T> T resolveAs(Class<T> cls) {
                        if (File.class.isAssignableFrom(cls)) {
                            return (T) this.file;
                        }
                        return null;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForJarEntry implements Element {
                    private final JarEntry entry;
                    private final JarFile file;

                    public ForJarEntry(JarFile jarFile, JarEntry jarEntry) {
                        this.file = jarFile;
                        this.entry = jarEntry;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForJarEntry forJarEntry = (ForJarEntry) obj;
                        return this.file.equals(forJarEntry.file) && this.entry.equals(forJarEntry.entry);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public InputStream getInputStream() throws IOException {
                        return this.file.getInputStream(this.entry);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public String getName() {
                        return this.entry.getName();
                    }

                    public int hashCode() {
                        return (((getClass().hashCode() * 31) + this.file.hashCode()) * 31) + this.entry.hashCode();
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    @MaybeNull
                    public <T> T resolveAs(Class<T> cls) {
                        if (JarEntry.class.isAssignableFrom(cls)) {
                            return (T) this.entry;
                        }
                        return null;
                    }
                }

                InputStream getInputStream() throws IOException;

                String getName();

                @MaybeNull
                <T> T resolveAs(Class<T> cls);
            }

            public enum Empty implements Source, Origin {
                INSTANCE;

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                public ClassFileLocator getClassFileLocator() {
                    return ClassFileLocator.NoOp.INSTANCE;
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                @MaybeNull
                public Manifest getManifest() {
                    return Origin.NO_MANIFEST;
                }

                @Override // java.lang.Iterable
                public Iterator<Element> iterator() {
                    return Collections.emptySet().iterator();
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public Origin read() {
                    return this;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Filtering implements Source {
                private final Source delegate;
                private final boolean manifest;
                private final ElementMatcher<Element> matcher;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Filtering(Source source, ElementMatcher<Element> elementMatcher) {
                    this(source, elementMatcher, true);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Filtering filtering = (Filtering) obj;
                    return this.manifest == filtering.manifest && this.delegate.equals(filtering.delegate) && this.matcher.equals(filtering.matcher);
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.delegate.hashCode()) * 31) + this.matcher.hashCode()) * 31) + (this.manifest ? 1 : 0);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public Origin read() throws IOException {
                    return new Origin.Filtering(this.delegate.read(), this.matcher, this.manifest);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Filtering(Source source, ElementMatcher<Element> elementMatcher, boolean z) {
                    this.delegate = source;
                    this.matcher = elementMatcher;
                    this.manifest = z;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForFolder implements Source, Origin {
                private final File folder;

                public class FolderIterator implements Iterator<Element> {
                    private final List<File> files;

                    public FolderIterator(File file) {
                        this.files = new ArrayList(Collections.singleton(file));
                        while (true) {
                            File[] fileArrListFiles = this.files.remove(r3.size() - 1).listFiles();
                            if (fileArrListFiles != null) {
                                this.files.addAll(Arrays.asList(fileArrListFiles));
                            }
                            if (this.files.isEmpty()) {
                                return;
                            }
                            if (!this.files.get(r3.size() - 1).isDirectory()) {
                                if (!this.files.get(r3.size() - 1).equals(new File(file, "META-INF/MANIFEST.MF"))) {
                                    return;
                                }
                            }
                        }
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return !this.files.isEmpty();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("remove");
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                    @Override // java.util.Iterator
                    @SuppressFBWarnings(justification = "Exception is thrown by invoking removeFirst on an empty list.", value = {"IT_NO_SUCH_ELEMENT"})
                    public Element next() {
                        boolean zIsEmpty;
                        boolean zIsDirectory;
                        boolean zEquals;
                        try {
                            File file = ForFolder.this.folder;
                            List<File> list = this.files;
                            while (true) {
                                if (!zIsEmpty) {
                                    if (!zIsDirectory) {
                                        if (!zEquals) {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            return new Element.ForFile(file, list.remove(list.size() - 1));
                        } finally {
                            while (!this.files.isEmpty()) {
                                if (!this.files.get(r2.size() - 1).isDirectory()) {
                                    if (!this.files.get(r2.size() - 1).equals(new File(ForFolder.this.folder, "META-INF/MANIFEST.MF"))) {
                                        break;
                                    }
                                }
                                File[] fileArrListFiles = this.files.remove(r2.size() - 1).listFiles();
                                if (fileArrListFiles != null) {
                                    this.files.addAll(Arrays.asList(fileArrListFiles));
                                }
                            }
                        }
                    }
                }

                public ForFolder(File file) {
                    this.folder = file;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.folder.equals(((ForFolder) obj).folder);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                public ClassFileLocator getClassFileLocator() {
                    return new ClassFileLocator.ForFolder(this.folder);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                @MaybeNull
                public Manifest getManifest() throws IOException {
                    File file = new File(this.folder, "META-INF/MANIFEST.MF");
                    if (!file.exists()) {
                        return Origin.NO_MANIFEST;
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        return new Manifest(fileInputStream);
                    } finally {
                        fileInputStream.close();
                    }
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.folder.hashCode();
                }

                @Override // java.lang.Iterable
                public Iterator<Element> iterator() {
                    return new FolderIterator(this.folder);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public Origin read() {
                    return this;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJarFile implements Source {
                private final File file;

                public ForJarFile(File file) {
                    this.file = file;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.file.equals(((ForJarFile) obj).file);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.file.hashCode();
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public Origin read() throws IOException {
                    return new Origin.ForJarFile(new JarFile(this.file));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class InMemory implements Source, Origin {
                private final Map<String, byte[]> storage;

                public static class MapEntryIterator implements Iterator<Element> {
                    private final Iterator<Map.Entry<String, byte[]>> iterator;

                    public MapEntryIterator(Iterator<Map.Entry<String, byte[]>> it) {
                        this.iterator = it;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.iterator.hasNext();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("remove");
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                    @Override // java.util.Iterator
                    public Element next() {
                        Map.Entry<String, byte[]> next = this.iterator.next();
                        return new Element.ForByteArray(next.getKey(), next.getValue());
                    }
                }

                public InMemory(Map<String, byte[]> map) {
                    this.storage = map;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public static Source ofTypes(Class<?>... clsArr) {
                    return ofTypes(Arrays.asList(clsArr));
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.storage.equals(((InMemory) obj).storage);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                public ClassFileLocator getClassFileLocator() {
                    return ClassFileLocator.Simple.ofResources(this.storage);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                @MaybeNull
                public Manifest getManifest() throws IOException {
                    byte[] bArr = this.storage.get("META-INF/MANIFEST.MF");
                    return bArr == null ? Origin.NO_MANIFEST : new Manifest(new ByteArrayInputStream(bArr));
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.storage.hashCode();
                }

                @Override // java.lang.Iterable
                public Iterator<Element> iterator() {
                    return new MapEntryIterator(this.storage.entrySet().iterator());
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public Origin read() {
                    return this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public static Source ofTypes(Collection<? extends Class<?>> collection) {
                    HashMap map = new HashMap();
                    for (Class<?> cls : collection) {
                        map.put(TypeDescription.ForLoadedType.m5238of(cls), ClassFileLocator.ForClassLoader.read(cls));
                    }
                    return ofTypes(map);
                }

                public static Source ofTypes(Map<TypeDescription, byte[]> map) {
                    HashMap map2 = new HashMap();
                    for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                        map2.put(entry.getKey().getInternalName() + ".class", entry.getValue());
                    }
                    return new InMemory(map2);
                }
            }

            public interface Origin extends Iterable<Element>, Closeable {

                @AlwaysNull
                public static final Manifest NO_MANIFEST = null;

                @HashCodeAndEqualsPlugin.Enhance
                public static class Filtering implements Origin {
                    private final Origin delegate;
                    private final boolean manifest;
                    private final ElementMatcher<Element> matcher;

                    public static class FilteringIterator implements Iterator<Element> {

                        @MaybeNull
                        private Element current;
                        private final Iterator<Element> iterator;
                        private final ElementMatcher<Element> matcher;

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return this.current != null;
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            this.iterator.remove();
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        private FilteringIterator(Iterator<Element> it, ElementMatcher<Element> elementMatcher) {
                            this.iterator = it;
                            this.matcher = elementMatcher;
                            while (it.hasNext()) {
                                Element next = it.next();
                                if (elementMatcher.matches(next)) {
                                    this.current = next;
                                    return;
                                }
                            }
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                        @Override // java.util.Iterator
                        public Element next() {
                            Element element = this.current;
                            if (element == null) {
                                throw new NoSuchElementException();
                            }
                            this.current = null;
                            while (true) {
                                if (!this.iterator.hasNext()) {
                                    break;
                                }
                                Element next = this.iterator.next();
                                if (this.matcher.matches(next)) {
                                    this.current = next;
                                    break;
                                }
                            }
                            return element;
                        }
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public Filtering(Origin origin, ElementMatcher<Element> elementMatcher) {
                        this(origin, elementMatcher, true);
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        this.delegate.close();
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Filtering filtering = (Filtering) obj;
                        return this.manifest == filtering.manifest && this.delegate.equals(filtering.delegate) && this.matcher.equals(filtering.matcher);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    public ClassFileLocator getClassFileLocator() {
                        return this.delegate.getClassFileLocator();
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    @MaybeNull
                    public Manifest getManifest() throws IOException {
                        return this.manifest ? this.delegate.getManifest() : Origin.NO_MANIFEST;
                    }

                    public int hashCode() {
                        return (((((getClass().hashCode() * 31) + this.delegate.hashCode()) * 31) + this.matcher.hashCode()) * 31) + (this.manifest ? 1 : 0);
                    }

                    @Override // java.lang.Iterable
                    public Iterator<Element> iterator() {
                        return new FilteringIterator(this.delegate.iterator(), this.matcher);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    public Filtering(Origin origin, ElementMatcher<Element> elementMatcher, boolean z) {
                        this.delegate = origin;
                        this.matcher = elementMatcher;
                        this.manifest = z;
                    }
                }

                public static class ForJarFile implements Origin {
                    private final JarFile file;

                    public class JarFileIterator implements Iterator<Element> {
                        private final Enumeration<JarEntry> enumeration;

                        public JarFileIterator(Enumeration<JarEntry> enumeration) {
                            this.enumeration = enumeration;
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return this.enumeration.hasMoreElements();
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                        @Override // java.util.Iterator
                        public Element next() {
                            return new Element.ForJarEntry(ForJarFile.this.file, this.enumeration.nextElement());
                        }
                    }

                    public ForJarFile(JarFile jarFile) {
                        this.file = jarFile;
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        this.file.close();
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    public ClassFileLocator getClassFileLocator() {
                        return new ClassFileLocator.ForJarFile(this.file);
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    @MaybeNull
                    public Manifest getManifest() throws IOException {
                        return this.file.getManifest();
                    }

                    @Override // java.lang.Iterable
                    public Iterator<Element> iterator() {
                        return new JarFileIterator(this.file.entries());
                    }
                }

                ClassFileLocator getClassFileLocator();

                @MaybeNull
                Manifest getManifest() throws IOException;
            }

            Origin read() throws IOException;
        }

        public static class Summary {
            private final Map<TypeDescription, List<Throwable>> failed;
            private final List<TypeDescription> transformed;
            private final List<String> unresolved;

            public Summary(List<TypeDescription> list, Map<TypeDescription, List<Throwable>> map, List<String> list2) {
                this.transformed = list;
                this.failed = map;
                this.unresolved = list2;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Summary summary = (Summary) obj;
                return this.transformed.equals(summary.transformed) && this.failed.equals(summary.failed) && this.unresolved.equals(summary.unresolved);
            }

            public Map<TypeDescription, List<Throwable>> getFailed() {
                return this.failed;
            }

            public List<TypeDescription> getTransformed() {
                return this.transformed;
            }

            public List<String> getUnresolved() {
                return this.unresolved;
            }

            public int hashCode() {
                return (((this.transformed.hashCode() * 31) + this.failed.hashCode()) * 31) + this.unresolved.hashCode();
            }
        }

        public interface Target {

            public enum Discarding implements Target, Sink {
                INSTANCE;

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void retain(Source.Element element) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void store(Map<TypeDescription, byte[]> map) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target
                public Sink write(@MaybeNull Manifest manifest) {
                    return this;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForFolder implements Target, Sink {
                private final File folder;

                public ForFolder(File file) {
                    this.folder = file;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.folder.equals(((ForFolder) obj).folder);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.folder.hashCode();
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void retain(Source.Element element) throws IOException {
                    String name = element.getName();
                    if (name.endsWith("/")) {
                        return;
                    }
                    File file = new File(this.folder, name);
                    File file2 = (File) element.resolveAs(File.class);
                    if (!file.getCanonicalPath().startsWith(this.folder.getCanonicalPath() + File.separatorChar)) {
                        throw new IllegalArgumentException(file + " is not a subdirectory of " + this.folder);
                    }
                    if (!file.getParentFile().isDirectory() && !file.getParentFile().mkdirs()) {
                        throw new IOException("Could not create directory: " + file.getParent());
                    }
                    if (file2 != null && !file2.equals(file)) {
                        FileSystem.getInstance().copy(file2, file);
                        return;
                    }
                    if (file.equals(file2)) {
                        return;
                    }
                    InputStream inputStream = element.getInputStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    return;
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                            }
                        } finally {
                            fileOutputStream.close();
                        }
                    } finally {
                        inputStream.close();
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void store(Map<TypeDescription, byte[]> map) throws IOException {
                    for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                        File file = new File(this.folder, entry.getKey().getInternalName() + ".class");
                        if (!file.getParentFile().isDirectory() && !file.getParentFile().mkdirs()) {
                            throw new IOException("Could not create directory: " + file.getParent());
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(entry.getValue());
                        } finally {
                            fileOutputStream.close();
                        }
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target
                public Sink write(@MaybeNull Manifest manifest) throws IOException {
                    if (manifest != null) {
                        File file = new File(this.folder, "META-INF/MANIFEST.MF");
                        if (!file.getParentFile().isDirectory() && !file.getParentFile().mkdirs()) {
                            throw new IOException("Could not create directory: " + file.getParent());
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            manifest.write(fileOutputStream);
                        } finally {
                            fileOutputStream.close();
                        }
                    }
                    return this;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJarFile implements Target {
                private final File file;

                public ForJarFile(File file) {
                    this.file = file;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.file.equals(((ForJarFile) obj).file);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.file.hashCode();
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target
                public Sink write(@MaybeNull Manifest manifest) throws IOException {
                    return manifest == null ? new Sink.ForJarOutputStream(new JarOutputStream(new FileOutputStream(this.file))) : new Sink.ForJarOutputStream(new JarOutputStream(new FileOutputStream(this.file), manifest));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class InMemory implements Target, Sink {
                private final Map<String, byte[]> storage;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public InMemory() {
                    this(new HashMap());
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.storage.equals(((InMemory) obj).storage);
                }

                public Map<String, byte[]> getStorage() {
                    return this.storage;
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.storage.hashCode();
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void retain(Source.Element element) throws IOException {
                    if (element.getName().endsWith("/")) {
                        return;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        InputStream inputStream = element.getInputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    byteArrayOutputStream.close();
                                    this.storage.put(element.getName(), byteArrayOutputStream.toByteArray());
                                    return;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                        } finally {
                            inputStream.close();
                        }
                    } catch (Throwable th) {
                        byteArrayOutputStream.close();
                        throw th;
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void store(Map<TypeDescription, byte[]> map) {
                    for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                        this.storage.put(entry.getKey().getInternalName() + ".class", entry.getValue());
                    }
                }

                public Map<String, byte[]> toTypeMap() {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, byte[]> entry : this.storage.entrySet()) {
                        if (entry.getKey().endsWith(".class")) {
                            map.put(entry.getKey().substring(0, entry.getKey().length() - 6).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), entry.getValue());
                        }
                    }
                    return map;
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target
                public Sink write(@MaybeNull Manifest manifest) throws IOException {
                    if (manifest != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            manifest.write(byteArrayOutputStream);
                            byteArrayOutputStream.close();
                            this.storage.put("META-INF/MANIFEST.MF", byteArrayOutputStream.toByteArray());
                        } catch (Throwable th) {
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    }
                    return this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public InMemory(Map<String, byte[]> map) {
                    this.storage = map;
                }
            }

            public interface Sink extends Closeable {

                public static class ForJarOutputStream implements Sink {
                    private final JarOutputStream outputStream;

                    public ForJarOutputStream(JarOutputStream jarOutputStream) {
                        this.outputStream = jarOutputStream;
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        this.outputStream.close();
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                    public void retain(Source.Element element) throws IOException {
                        JarEntry jarEntry = (JarEntry) element.resolveAs(JarEntry.class);
                        JarOutputStream jarOutputStream = this.outputStream;
                        if (jarEntry == null) {
                            jarEntry = new JarEntry(element.getName());
                        }
                        jarOutputStream.putNextEntry(jarEntry);
                        InputStream inputStream = element.getInputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    inputStream.close();
                                    this.outputStream.closeEntry();
                                    return;
                                }
                                this.outputStream.write(bArr, 0, i);
                            }
                        } catch (Throwable th) {
                            inputStream.close();
                            throw th;
                        }
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                    public void store(Map<TypeDescription, byte[]> map) throws IOException {
                        for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                            this.outputStream.putNextEntry(new JarEntry(entry.getKey().getInternalName() + ".class"));
                            this.outputStream.write(entry.getValue());
                            this.outputStream.closeEntry();
                        }
                    }
                }

                void retain(Source.Element element) throws IOException;

                void store(Map<TypeDescription, byte[]> map) throws IOException;
            }

            Sink write(@MaybeNull Manifest manifest) throws IOException;
        }

        public interface TypeStrategy {

            public enum Default implements TypeStrategy {
                REDEFINE { // from class: net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.1
                    @Override // net.bytebuddy.build.Plugin.Engine.TypeStrategy
                    public DynamicType.Builder<?> builder(ByteBuddy byteBuddy, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
                        return byteBuddy.redefine(typeDescription, classFileLocator);
                    }
                },
                REBASE { // from class: net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.2
                    @Override // net.bytebuddy.build.Plugin.Engine.TypeStrategy
                    public DynamicType.Builder<?> builder(ByteBuddy byteBuddy, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
                        return byteBuddy.rebase(typeDescription, classFileLocator);
                    }
                },
                DECORATE { // from class: net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.3
                    @Override // net.bytebuddy.build.Plugin.Engine.TypeStrategy
                    public DynamicType.Builder<?> builder(ByteBuddy byteBuddy, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
                        return byteBuddy.decorate(typeDescription, classFileLocator);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForEntryPoint implements TypeStrategy {
                private final EntryPoint entryPoint;
                private final MethodNameTransformer methodNameTransformer;

                public ForEntryPoint(EntryPoint entryPoint, MethodNameTransformer methodNameTransformer) {
                    this.entryPoint = entryPoint;
                    this.methodNameTransformer = methodNameTransformer;
                }

                @Override // net.bytebuddy.build.Plugin.Engine.TypeStrategy
                public DynamicType.Builder<?> builder(ByteBuddy byteBuddy, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
                    return this.entryPoint.transform(typeDescription, byteBuddy, classFileLocator, this.methodNameTransformer);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForEntryPoint forEntryPoint = (ForEntryPoint) obj;
                    return this.entryPoint.equals(forEntryPoint.entryPoint) && this.methodNameTransformer.equals(forEntryPoint.methodNameTransformer);
                }

                public int hashCode() {
                    return (((getClass().hashCode() * 31) + this.entryPoint.hashCode()) * 31) + this.methodNameTransformer.hashCode();
                }
            }

            DynamicType.Builder<?> builder(ByteBuddy byteBuddy, TypeDescription typeDescription, ClassFileLocator classFileLocator);
        }

        Summary apply(File file, File file2, List<? extends Factory> list) throws IOException;

        Summary apply(File file, File file2, Factory... factoryArr) throws IOException;

        Summary apply(Source source, Target target, List<? extends Factory> list) throws IOException;

        Summary apply(Source source, Target target, Factory... factoryArr) throws IOException;

        Engine ignore(ElementMatcher<? super TypeDescription> elementMatcher);

        Engine with(ByteBuddy byteBuddy);

        Engine with(Dispatcher.Factory factory);

        Engine with(Listener listener);

        Engine with(PoolStrategy poolStrategy);

        Engine with(TypeStrategy typeStrategy);

        Engine with(ClassFileLocator classFileLocator);

        Engine withErrorHandlers(List<? extends ErrorHandler> list);

        Engine withErrorHandlers(ErrorHandler... errorHandlerArr);

        Engine withParallelTransformation(int i);

        Engine withoutErrorHandlers();

        public interface Listener extends ErrorHandler {

            public static abstract class Adapter implements Listener {
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onComplete(TypeDescription typeDescription) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onDiscovery(String str) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Map<TypeDescription, List<Throwable>> map) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(TypeDescription typeDescription, List<Plugin> list) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@MaybeNull Manifest manifest) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(String str) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, List<Plugin> list) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(String str) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(TypeDescription typeDescription, Plugin plugin) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, Plugin plugin) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, List<Throwable> list) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements Listener {
                private final List<Listener> listeners;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Compound(Listener... listenerArr) {
                    this((List<? extends Listener>) Arrays.asList(listenerArr));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.listeners.equals(((Compound) obj).listeners);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.listeners.hashCode();
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onComplete(TypeDescription typeDescription) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onComplete(typeDescription);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onDiscovery(String str) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onDiscovery(str);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onError(typeDescription, plugin, th);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(TypeDescription typeDescription, Plugin plugin) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onIgnored(typeDescription, plugin);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onLiveInitializer(typeDescription, typeDescription2);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@MaybeNull Manifest manifest) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onManifest(manifest);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(String str) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onResource(str);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, Plugin plugin) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onTransformation(typeDescription, plugin);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(String str) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onUnresolved(str);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Compound(List<? extends Listener> list) {
                    this.listeners = new ArrayList();
                    for (Listener listener : list) {
                        if (listener instanceof Compound) {
                            this.listeners.addAll(((Compound) listener).listeners);
                        } else if (!(listener instanceof NoOp)) {
                            this.listeners.add(listener);
                        }
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, List<Throwable> list) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onError(typeDescription, list);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(TypeDescription typeDescription, List<Plugin> list) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onIgnored(typeDescription, list);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, List<Plugin> list) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onTransformation(typeDescription, list);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Map<TypeDescription, List<Throwable>> map) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onError(map);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onError(plugin, th);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForErrorHandler extends Adapter {
                private final ErrorHandler errorHandler;

                public ForErrorHandler(ErrorHandler errorHandler) {
                    this.errorHandler = errorHandler;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.errorHandler.equals(((ForErrorHandler) obj).errorHandler);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.errorHandler.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                    this.errorHandler.onError(typeDescription, plugin, th);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                    this.errorHandler.onLiveInitializer(typeDescription, typeDescription2);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@MaybeNull Manifest manifest) {
                    this.errorHandler.onManifest(manifest);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(String str) {
                    this.errorHandler.onResource(str);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(String str) {
                    this.errorHandler.onUnresolved(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, List<Throwable> list) {
                    this.errorHandler.onError(typeDescription, list);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Map<TypeDescription, List<Throwable>> map) {
                    this.errorHandler.onError(map);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                    this.errorHandler.onError(plugin, th);
                }
            }

            public enum NoOp implements Listener {
                INSTANCE;

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onComplete(TypeDescription typeDescription) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onDiscovery(String str) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Map<TypeDescription, List<Throwable>> map) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(TypeDescription typeDescription, List<Plugin> list) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@MaybeNull Manifest manifest) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(String str) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, List<Plugin> list) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(String str) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(TypeDescription typeDescription, Plugin plugin) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, Plugin plugin) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, List<Throwable> list) {
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class WithErrorsOnly extends Adapter {
                private final Listener delegate;

                public WithErrorsOnly(Listener listener) {
                    this.delegate = listener;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.delegate.equals(((WithErrorsOnly) obj).delegate);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.delegate.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                    this.delegate.onError(typeDescription, plugin, th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, List<Throwable> list) {
                    this.delegate.onError(typeDescription, list);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Map<TypeDescription, List<Throwable>> map) {
                    this.delegate.onError(map);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                    this.delegate.onError(plugin, th);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class WithTransformationsOnly extends Adapter {
                private final Listener delegate;

                public WithTransformationsOnly(Listener listener) {
                    this.delegate = listener;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.delegate.equals(((WithTransformationsOnly) obj).delegate);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.delegate.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                    this.delegate.onError(typeDescription, plugin, th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, Plugin plugin) {
                    this.delegate.onTransformation(typeDescription, plugin);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, List<Throwable> list) {
                    this.delegate.onError(typeDescription, list);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, List<Plugin> list) {
                    this.delegate.onTransformation(typeDescription, list);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Map<TypeDescription, List<Throwable>> map) {
                    this.delegate.onError(map);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                    this.delegate.onError(plugin, th);
                }
            }

            void onComplete(TypeDescription typeDescription);

            void onDiscovery(String str);

            void onIgnored(TypeDescription typeDescription, List<Plugin> list);

            void onIgnored(TypeDescription typeDescription, Plugin plugin);

            void onTransformation(TypeDescription typeDescription, List<Plugin> list);

            void onTransformation(TypeDescription typeDescription, Plugin plugin);

            @HashCodeAndEqualsPlugin.Enhance
            public static class StreamWriting extends Adapter {
                protected static final String PREFIX = "[Byte Buddy]";
                private final PrintStream printStream;

                public StreamWriting(PrintStream printStream) {
                    this.printStream = printStream;
                }

                public static StreamWriting toSystemError() {
                    return new StreamWriting(System.err);
                }

                public static StreamWriting toSystemOut() {
                    return new StreamWriting(System.out);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.printStream.equals(((StreamWriting) obj).printStream);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.printStream.hashCode();
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onComplete(TypeDescription typeDescription) {
                    this.printStream.printf("[Byte Buddy] COMPLETE %s", typeDescription);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onDiscovery(String str) {
                    this.printStream.printf("[Byte Buddy] DISCOVERY %s", str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(TypeDescription typeDescription, Plugin plugin, Throwable th) {
                    synchronized (this.printStream) {
                        this.printStream.printf("[Byte Buddy] ERROR %s for %s", typeDescription, plugin);
                        th.printStackTrace(this.printStream);
                    }
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(TypeDescription typeDescription, Plugin plugin) {
                    this.printStream.printf("[Byte Buddy] IGNORE %s for %s", typeDescription, plugin);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(TypeDescription typeDescription, TypeDescription typeDescription2) {
                    this.printStream.printf("[Byte Buddy] LIVE %s on %s", typeDescription, typeDescription2);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@MaybeNull Manifest manifest) {
                    this.printStream.printf("[Byte Buddy] MANIFEST %b", Boolean.valueOf(manifest != null));
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(String str) {
                    this.printStream.printf("[Byte Buddy] RESOURCE %s", str);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(TypeDescription typeDescription, Plugin plugin) {
                    this.printStream.printf("[Byte Buddy] TRANSFORM %s for %s", typeDescription, plugin);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(String str) {
                    this.printStream.printf("[Byte Buddy] UNRESOLVED %s", str);
                }

                public Listener withErrorsOnly() {
                    return new WithErrorsOnly(this);
                }

                public Listener withTransformationsOnly() {
                    return new WithTransformationsOnly(this);
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(Plugin plugin, Throwable th) {
                    synchronized (this.printStream) {
                        this.printStream.printf("[Byte Buddy] ERROR %s", plugin);
                        th.printStackTrace(this.printStream);
                    }
                }
            }
        }
    }
}

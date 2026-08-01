package net.bytebuddy.android;

import androidx.profileinstaller.AbstractC2442;
import com.android.dx.cf.direct.DirectClassFile;
import com.android.dx.cf.direct.StdAttributeFactory;
import com.android.dx.command.dexer.DxContext;
import com.android.dx.dex.DexOptions;
import com.android.dx.dex.cf.CfOptions;
import com.android.dx.dex.cf.CfTranslator;
import com.android.dx.dex.file.ClassDefItem;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import io.ktor.util.C4210;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.logging.Logger;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.RandomString;
import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AndroidClassLoadingStrategy implements ClassLoadingStrategy<ClassLoader> {
    private static final String DEX_CLASS_FILE = "classes.dex";

    @AlwaysNull
    private static final String EMPTY_LIBRARY_PATH = null;
    private static final FileProcessor FILE_PROCESSOR;
    private static final String JAR_FILE_EXTENSION = ".jar";
    private final DexProcessor dexProcessor;
    protected final File privateDirectory;
    protected final RandomString randomString;

    static {
        FileProcessor forReadOnlyClassFile;
        try {
            forReadOnlyClassFile = new FileProcessor.ForReadOnlyClassFile(Class.forName("java.nio.file.Files").getMethod("setPosixFilePermissions", Path.class, Set.class), File.class.getMethod("toPath", null), Collections.singleton(Class.forName("java.nio.file.attribute.PosixFilePermission").getMethod("valueOf", String.class).invoke(null, "OWNER_READ")));
        } catch (Throwable unused) {
            forReadOnlyClassFile = FileProcessor.Disabled.INSTANCE;
        }
        FILE_PROCESSOR = forReadOnlyClassFile;
    }

    public AndroidClassLoadingStrategy(File file, DexProcessor dexProcessor) {
        if (!file.isDirectory()) {
            C4210.m8614(file, "Not a directory ");
            throw null;
        }
        this.privateDirectory = file;
        this.dexProcessor = dexProcessor;
        this.randomString = new RandomString();
    }

    public abstract Map<TypeDescription, Class<?>> doLoad(@MaybeNull ClassLoader classLoader, Set<TypeDescription> set, File file);

    @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
    public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
        DexProcessor.Conversion conversionCreate = this.dexProcessor.create();
        for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
            conversionCreate.register(entry.getKey().getName(), entry.getValue());
        }
        File file = new File(this.privateDirectory, this.randomString.nextString() + JAR_FILE_EXTENSION);
        try {
            try {
                if (!file.createNewFile()) {
                    throw new IllegalStateException("Cannot create " + file);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    JarOutputStream jarOutputStream = new JarOutputStream(fileOutputStream);
                    jarOutputStream.putNextEntry(new JarEntry(DEX_CLASS_FILE));
                    conversionCreate.drainTo(jarOutputStream);
                    jarOutputStream.closeEntry();
                    jarOutputStream.close();
                    fileOutputStream.close();
                    FILE_PROCESSOR.accept(file);
                    return doLoad(classLoader, map.keySet(), file);
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e) {
                throw new IllegalStateException("Cannot write to zip file " + file, e);
            }
        } finally {
            if (!file.delete()) {
                Logger.getLogger("net.bytebuddy").warning("Could not delete " + file);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class Injecting extends AndroidClassLoadingStrategy {
        private static final Dispatcher DISPATCHER;

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public interface Dispatcher {

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public static class ForAndroidPVm implements Dispatcher {

                @AlwaysNull
                private static final DexFile NO_RETURN_VALUE = null;
                private final Method addDexPath;

                public ForAndroidPVm(Method method) {
                    this.addDexPath = method;
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher
                public Class<?> loadClass(@MaybeNull DexFile dexFile, @MaybeNull ClassLoader classLoader, TypeDescription typeDescription) {
                    try {
                        return Class.forName(typeDescription.getName(), false, classLoader);
                    } catch (ClassNotFoundException e) {
                        C8796.m14449(AbstractC2442.m4566("Could not locate ", typeDescription), e);
                        return null;
                    }
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher
                @MaybeNull
                public DexFile loadDex(File file, File file2, @MaybeNull ClassLoader classLoader, RandomString randomString) throws IOException {
                    if (!(classLoader instanceof BaseDexClassLoader)) {
                        C4210.m8614(classLoader, "On Android P, a class injection can only be applied to BaseDexClassLoader: ");
                        return null;
                    }
                    try {
                        this.addDexPath.invoke(classLoader, file2.getAbsolutePath(), Boolean.FALSE);
                        return NO_RETURN_VALUE;
                    } catch (IllegalAccessException e) {
                        C8796.m14449("Cannot access BaseDexClassLoader#addDexPath(String, boolean)", e);
                        return null;
                    } catch (InvocationTargetException e2) {
                        Throwable targetException = e2.getTargetException();
                        if (targetException instanceof IOException) {
                            throw ((IOException) targetException);
                        }
                        C8796.m14449("Cannot invoke BaseDexClassLoader#addDexPath(String, boolean)", targetException);
                        return null;
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public enum ForLegacyVm implements Dispatcher {
                INSTANCE;

                private static final String EXTENSION = ".data";
                private static final int NO_FLAGS = 0;

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher
                @MaybeNull
                public Class<?> loadClass(DexFile dexFile, @MaybeNull ClassLoader classLoader, TypeDescription typeDescription) {
                    return dexFile.loadClass(typeDescription.getName(), classLoader);
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher
                @MaybeNull
                public DexFile loadDex(File file, File file2, @MaybeNull ClassLoader classLoader, RandomString randomString) {
                    return DexFile.loadDex(file2.getAbsolutePath(), new File(file.getAbsolutePath(), randomString.nextString() + EXTENSION).getAbsolutePath(), 0);
                }
            }

            @MaybeNull
            Class<?> loadClass(DexFile dexFile, @MaybeNull ClassLoader classLoader, TypeDescription typeDescription);

            @MaybeNull
            DexFile loadDex(File file, File file2, @MaybeNull ClassLoader classLoader, RandomString randomString);
        }

        static {
            Dispatcher forAndroidPVm;
            try {
                forAndroidPVm = new Dispatcher.ForAndroidPVm(BaseDexClassLoader.class.getMethod("addDexPath", String.class, Boolean.TYPE));
            } catch (Throwable unused) {
                forAndroidPVm = Dispatcher.ForLegacyVm.INSTANCE;
            }
            DISPATCHER = forAndroidPVm;
        }

        public Injecting(File file) {
            this(file, DexProcessor.ForSdkCompiler.makeDefault());
        }

        @Override // net.bytebuddy.android.AndroidClassLoadingStrategy
        public Map<TypeDescription, Class<?>> doLoad(@MaybeNull ClassLoader classLoader, Set<TypeDescription> set, File file) throws IOException {
            DexFile dexFileLoadDex = DISPATCHER.loadDex(this.privateDirectory, file, classLoader, this.randomString);
            try {
                HashMap map = new HashMap();
                for (TypeDescription typeDescription : set) {
                    synchronized (classLoader) {
                        try {
                            Class<?> clsLoadClass = DISPATCHER.loadClass(dexFileLoadDex, classLoader, typeDescription);
                            if (clsLoadClass == null) {
                                throw new IllegalStateException("Could not load " + typeDescription);
                            }
                            map.put(typeDescription, clsLoadClass);
                        } finally {
                        }
                    }
                }
                return map;
            } finally {
                if (dexFileLoadDex != null) {
                    dexFileLoadDex.close();
                }
            }
        }

        @Override // net.bytebuddy.android.AndroidClassLoadingStrategy, net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public Map<TypeDescription, Class<?>> load(@MaybeNull ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            if (classLoader != null) {
                return super.load(classLoader, map);
            }
            C5919.m11249("Cannot inject classes into the bootstrap class loader on Android");
            return null;
        }

        public Injecting(File file, DexProcessor dexProcessor) {
            super(file, dexProcessor);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class Wrapping extends AndroidClassLoadingStrategy {
        public Wrapping(File file) {
            this(file, DexProcessor.ForSdkCompiler.makeDefault());
        }

        @Override // net.bytebuddy.android.AndroidClassLoadingStrategy
        public Map<TypeDescription, Class<?>> doLoad(@MaybeNull ClassLoader classLoader, Set<TypeDescription> set, File file) {
            DexClassLoader dexClassLoader = new DexClassLoader(file.getAbsolutePath(), this.privateDirectory.getAbsolutePath(), AndroidClassLoadingStrategy.EMPTY_LIBRARY_PATH, classLoader);
            HashMap map = new HashMap();
            for (TypeDescription typeDescription : set) {
                try {
                    map.put(typeDescription, Class.forName(typeDescription.getName(), false, dexClassLoader));
                } catch (ClassNotFoundException e) {
                    C8796.m14449(AbstractC2442.m4566("Cannot load ", typeDescription), e);
                    return null;
                }
            }
            return map;
        }

        public Wrapping(File file, DexProcessor dexProcessor) {
            super(file, dexProcessor);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface FileProcessor {

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static class ForReadOnlyClassFile implements FileProcessor {
            private final Set<?> permissions;
            private final Method setPosixFilePermissions;
            private final Method toPath;

            public ForReadOnlyClassFile(Method method, Method method2, Set<?> set) {
                this.setPosixFilePermissions = method;
                this.toPath = method2;
                this.permissions = set;
            }

            @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor
            public void accept(File file) {
                try {
                    this.setPosixFilePermissions.invoke(null, this.toPath.invoke(file, null), this.permissions);
                } catch (IllegalAccessException e) {
                    C8796.m14449("Cannot access file system permissions", e);
                } catch (InvocationTargetException e2) {
                    if (e2.getTargetException() instanceof UnsupportedOperationException) {
                        return;
                    }
                    C8796.m14449("Cannot invoke file system permissions method", e2.getTargetException());
                }
            }
        }

        void accept(File file);

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public enum Disabled implements FileProcessor {
            INSTANCE;

            @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor
            public void accept(File file) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface DexProcessor {

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public interface Conversion {
            void drainTo(OutputStream outputStream);

            void register(String str, byte[] bArr);
        }

        Conversion create();

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static class ForSdkCompiler implements DexProcessor {
            private static final String CLASS_FILE_EXTENSION = ".class";
            private static final int DEX_COMPATIBLE_API_VERSION = 13;
            private static final Dispatcher DISPATCHER;
            private static final boolean NOT_VERBOSE = false;

            @AlwaysNull
            private static final Writer NO_PRINT_OUTPUT;
            private final CfOptions dexCompilerOptions;
            private final DexOptions dexFileOptions;

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public class Conversion implements Conversion {
                private static final boolean NON_STRICT = false;
                private final com.android.dx.dex.file.DexFile dexFile;

                public Conversion(com.android.dx.dex.file.DexFile dexFile) {
                    this.dexFile = dexFile;
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.Conversion
                public void drainTo(OutputStream outputStream) throws IOException {
                    this.dexFile.writeTo(outputStream, ForSdkCompiler.NO_PRINT_OUTPUT, false);
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.Conversion
                public void register(String str, byte[] bArr) {
                    DirectClassFile directClassFile = new DirectClassFile(bArr, str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ".class", false);
                    directClassFile.setAttributeFactory(new StdAttributeFactory());
                    this.dexFile.add(ForSdkCompiler.DISPATCHER.translate(directClassFile, bArr, ForSdkCompiler.this.dexCompilerOptions, ForSdkCompiler.this.dexFileOptions, new com.android.dx.dex.file.DexFile(ForSdkCompiler.this.dexFileOptions)));
                }
            }

            static {
                Dispatcher unavailable;
                try {
                    try {
                        try {
                            unavailable = new Dispatcher.ForApi26LevelCompatibleVm(CfTranslator.class.getMethod("translate", DxContext.class, DirectClassFile.class, byte[].class, CfOptions.class, DexOptions.class, com.android.dx.dex.file.DexFile.class), DxContext.class.getConstructor(null));
                        } catch (Throwable unused) {
                            unavailable = new Dispatcher.ForLegacyVm(CfTranslator.class.getMethod("translate", DirectClassFile.class, byte[].class, CfOptions.class, DexOptions.class, com.android.dx.dex.file.DexFile.class), DexOptions.class.getField("targetApiLevel"));
                        }
                    } catch (Throwable th) {
                        unavailable = new Dispatcher.Unavailable(th.getMessage());
                    }
                } catch (Throwable unused2) {
                    unavailable = new Dispatcher.ForLegacyVm(CfTranslator.class.getMethod("translate", DirectClassFile.class, byte[].class, CfOptions.class, DexOptions.class, com.android.dx.dex.file.DexFile.class), DexOptions.class.getField("minSdkVersion"));
                }
                DISPATCHER = unavailable;
                NO_PRINT_OUTPUT = null;
            }

            public ForSdkCompiler(DexOptions dexOptions, CfOptions cfOptions) {
                this.dexFileOptions = dexOptions;
                this.dexCompilerOptions = cfOptions;
            }

            public static DexProcessor makeDefault() {
                DexOptions dexOptions = new DexOptions();
                DISPATCHER.setTargetApi(dexOptions, 13);
                return new ForSdkCompiler(dexOptions, new CfOptions());
            }

            @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor
            public Conversion create() {
                return new Conversion(new com.android.dx.dex.file.DexFile(this.dexFileOptions));
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public interface Dispatcher {

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                public static class ForLegacyVm implements Dispatcher {
                    private final Field targetApi;
                    private final Method translate;

                    public ForLegacyVm(Method method, Field field) {
                        this.translate = method;
                        this.targetApi = field;
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public void setTargetApi(DexOptions dexOptions, int i) {
                        try {
                            this.targetApi.set(dexOptions, Integer.valueOf(i));
                        } catch (IllegalAccessException e) {
                            C8796.m14449("Cannot access an Android dex file translation method", e);
                        }
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public ClassDefItem translate(DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, com.android.dx.dex.file.DexFile dexFile) {
                        try {
                            return (ClassDefItem) this.translate.invoke(null, directClassFile, bArr, cfOptions, dexOptions, dexFile);
                        } catch (IllegalAccessException e) {
                            C8796.m14449("Cannot access an Android dex file translation method", e);
                            return null;
                        } catch (InvocationTargetException e2) {
                            C8796.m14449("Cannot invoke Android dex file translation method", e2.getTargetException());
                            return null;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                public static class Unavailable implements Dispatcher {
                    private final String message;

                    public Unavailable(String str) {
                        this.message = str;
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public void setTargetApi(DexOptions dexOptions, int i) {
                        throw new IllegalStateException("Could not resolve dispatcher: " + this.message);
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public ClassDefItem translate(DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, com.android.dx.dex.file.DexFile dexFile) {
                        throw new IllegalStateException("Could not resolve dispatcher: " + this.message);
                    }
                }

                void setTargetApi(DexOptions dexOptions, int i);

                ClassDefItem translate(DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, com.android.dx.dex.file.DexFile dexFile);

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                public static class ForApi26LevelCompatibleVm implements Dispatcher {
                    private final Constructor<?> dxContext;
                    private final Method translate;

                    public ForApi26LevelCompatibleVm(Method method, Constructor<?> constructor) {
                        this.translate = method;
                        this.dxContext = constructor;
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public ClassDefItem translate(DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, com.android.dx.dex.file.DexFile dexFile) {
                        try {
                            return (ClassDefItem) this.translate.invoke(null, this.dxContext.newInstance(null), directClassFile, bArr, cfOptions, dexOptions, dexFile);
                        } catch (IllegalAccessException e) {
                            C8796.m14449("Cannot access an Android dex file translation method", e);
                            return null;
                        } catch (InstantiationException e2) {
                            C8796.m14449("Cannot instantiate dex context", e2);
                            return null;
                        } catch (InvocationTargetException e3) {
                            C8796.m14449("Cannot invoke Android dex file translation method", e3.getTargetException());
                            return null;
                        }
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public void setTargetApi(DexOptions dexOptions, int i) {
                    }
                }
            }
        }
    }
}

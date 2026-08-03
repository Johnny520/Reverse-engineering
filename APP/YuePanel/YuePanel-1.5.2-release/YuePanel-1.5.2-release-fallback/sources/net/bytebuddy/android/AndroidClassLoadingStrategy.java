package net.bytebuddy.android;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AndroidClassLoadingStrategy implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> {
    private static final java.lang.String DEX_CLASS_FILE = "classes.dex";

    @net.bytebuddy.utility.nullability.AlwaysNull
    private static final java.lang.String EMPTY_LIBRARY_PATH = null;
    private static final net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor FILE_PROCESSOR = null;
    private static final java.lang.String JAR_FILE_EXTENSION = ".jar";
    private final net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor dexProcessor;
    protected final java.io.File privateDirectory;
    protected final net.bytebuddy.utility.RandomString randomString;

    public interface DexProcessor {

        public interface Conversion {
            void drainTo(java.io.OutputStream r1) throws java.io.IOException;

            void register(java.lang.String r1, byte[] r2);
        }

        public static class ForSdkCompiler implements net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor {
            private static final java.lang.String CLASS_FILE_EXTENSION = ".class";
            private static final int DEX_COMPATIBLE_API_VERSION = 13;
            private static final net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher DISPATCHER = null;
            private static final boolean NOT_VERBOSE = false;

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final java.io.Writer NO_PRINT_OUTPUT = null;
            private final com.android.dx.dex.cf.CfOptions dexCompilerOptions;
            private final com.android.dx.dex.DexOptions dexFileOptions;

            public class Conversion implements net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.Conversion {
                private static final boolean NON_STRICT = false;
                private final com.android.dx.dex.file.DexFile dexFile;
                final /* synthetic */ net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler this$0;

                public Conversion(net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler r1, com.android.dx.dex.file.DexFile r2) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        r0.dexFile = r2
                        return
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.Conversion
                public void drainTo(java.io.OutputStream r4) throws java.io.IOException {
                        r3 = this;
                        com.android.dx.dex.file.DexFile r0 = r3.dexFile
                        java.io.Writer r1 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.access$300()
                        r2 = 0
                        r0.writeTo(r4, r1, r2)
                        return
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.Conversion
                public void register(java.lang.String r7, byte[] r8) {
                        r6 = this;
                        com.android.dx.cf.direct.DirectClassFile r1 = new com.android.dx.cf.direct.DirectClassFile
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r2 = 46
                        r3 = 47
                        java.lang.String r7 = r7.replace(r2, r3)
                        r0.append(r7)
                        java.lang.String r7 = ".class"
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        r0 = 0
                        r1.<init>(r8, r7, r0)
                        com.android.dx.cf.direct.StdAttributeFactory r7 = new com.android.dx.cf.direct.StdAttributeFactory
                        r7.<init>()
                        r1.setAttributeFactory(r7)
                        com.android.dx.dex.file.DexFile r7 = r6.dexFile
                        net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.access$200()
                        net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler r2 = r6.this$0
                        com.android.dx.dex.cf.CfOptions r3 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.access$000(r2)
                        net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler r2 = r6.this$0
                        com.android.dx.dex.DexOptions r4 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.access$100(r2)
                        com.android.dx.dex.file.DexFile r5 = new com.android.dx.dex.file.DexFile
                        net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler r2 = r6.this$0
                        com.android.dx.dex.DexOptions r2 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.access$100(r2)
                        r5.<init>(r2)
                        r2 = r8
                        com.android.dx.dex.file.ClassDefItem r8 = r0.translate(r1, r2, r3, r4, r5)
                        r7.add(r8)
                        return
                }
            }

            public interface Dispatcher {

                public static class ForApi26LevelCompatibleVm implements net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher {
                    private final java.lang.reflect.Constructor<?> dxContext;
                    private final java.lang.reflect.Method translate;

                    public ForApi26LevelCompatibleVm(java.lang.reflect.Method r1, java.lang.reflect.Constructor<?> r2) {
                            r0 = this;
                            r0.<init>()
                            r0.translate = r1
                            r0.dxContext = r2
                            return
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public void setTargetApi(com.android.dx.dex.DexOptions r1, int r2) {
                            r0 = this;
                            return
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public com.android.dx.dex.file.ClassDefItem translate(com.android.dx.cf.direct.DirectClassFile r10, byte[] r11, com.android.dx.dex.cf.CfOptions r12, com.android.dx.dex.DexOptions r13, com.android.dx.dex.file.DexFile r14) {
                            r9 = this;
                            java.lang.reflect.Method r0 = r9.translate     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L1d
                            java.lang.reflect.Constructor<?> r1 = r9.dxContext     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L1d
                            r2 = 0
                            java.lang.Object r3 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L1d
                            r4 = r10
                            r5 = r11
                            r6 = r12
                            r7 = r13
                            r8 = r14
                            java.lang.Object[] r10 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L1d
                            java.lang.Object r10 = r0.invoke(r2, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L1d
                            com.android.dx.dex.file.ClassDefItem r10 = (com.android.dx.dex.file.ClassDefItem) r10     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L1d
                            return r10
                        L19:
                            r10 = move-exception
                            goto L1f
                        L1b:
                            r10 = move-exception
                            goto L2b
                        L1d:
                            r10 = move-exception
                            goto L33
                        L1f:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r12 = "Cannot invoke Android dex file translation method"
                            java.lang.Throwable r10 = r10.getTargetException()
                            r11.<init>(r12, r10)
                            throw r11
                        L2b:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r12 = "Cannot instantiate dex context"
                            r11.<init>(r12, r10)
                            throw r11
                        L33:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r12 = "Cannot access an Android dex file translation method"
                            r11.<init>(r12, r10)
                            throw r11
                    }
                }

                public static class ForLegacyVm implements net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher {
                    private final java.lang.reflect.Field targetApi;
                    private final java.lang.reflect.Method translate;

                    public ForLegacyVm(java.lang.reflect.Method r1, java.lang.reflect.Field r2) {
                            r0 = this;
                            r0.<init>()
                            r0.translate = r1
                            r0.targetApi = r2
                            return
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public void setTargetApi(com.android.dx.dex.DexOptions r2, int r3) {
                            r1 = this;
                            java.lang.reflect.Field r0 = r1.targetApi     // Catch: java.lang.IllegalAccessException -> La
                            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.IllegalAccessException -> La
                            r0.set(r2, r3)     // Catch: java.lang.IllegalAccessException -> La
                            return
                        La:
                            r2 = move-exception
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.String r0 = "Cannot access an Android dex file translation method"
                            r3.<init>(r0, r2)
                            throw r3
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public com.android.dx.dex.file.ClassDefItem translate(com.android.dx.cf.direct.DirectClassFile r2, byte[] r3, com.android.dx.dex.cf.CfOptions r4, com.android.dx.dex.DexOptions r5, com.android.dx.dex.file.DexFile r6) {
                            r1 = this;
                            java.lang.reflect.Method r0 = r1.translate     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L10
                            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6}     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L10
                            r3 = 0
                            java.lang.Object r2 = r0.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L10
                            com.android.dx.dex.file.ClassDefItem r2 = (com.android.dx.dex.file.ClassDefItem) r2     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L10
                            return r2
                        Le:
                            r2 = move-exception
                            goto L12
                        L10:
                            r2 = move-exception
                            goto L1e
                        L12:
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.String r4 = "Cannot invoke Android dex file translation method"
                            java.lang.Throwable r2 = r2.getTargetException()
                            r3.<init>(r4, r2)
                            throw r3
                        L1e:
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.String r4 = "Cannot access an Android dex file translation method"
                            r3.<init>(r4, r2)
                            throw r3
                    }
                }

                public static class Unavailable implements net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher {
                    private final java.lang.String message;

                    public Unavailable(java.lang.String r1) {
                            r0 = this;
                            r0.<init>()
                            r0.message = r1
                            return
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public void setTargetApi(com.android.dx.dex.DexOptions r2, int r3) {
                            r1 = this;
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r0 = "Could not resolve dispatcher: "
                            r3.append(r0)
                            java.lang.String r0 = r1.message
                            r3.append(r0)
                            java.lang.String r3 = r3.toString()
                            r2.<init>(r3)
                            throw r2
                    }

                    @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher
                    public com.android.dx.dex.file.ClassDefItem translate(com.android.dx.cf.direct.DirectClassFile r1, byte[] r2, com.android.dx.dex.cf.CfOptions r3, com.android.dx.dex.DexOptions r4, com.android.dx.dex.file.DexFile r5) {
                            r0 = this;
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Could not resolve dispatcher: "
                            r2.append(r3)
                            java.lang.String r3 = r0.message
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2)
                            throw r1
                    }
                }

                void setTargetApi(com.android.dx.dex.DexOptions r1, int r2);

                com.android.dx.dex.file.ClassDefItem translate(com.android.dx.cf.direct.DirectClassFile r1, byte[] r2, com.android.dx.dex.cf.CfOptions r3, com.android.dx.dex.DexOptions r4, com.android.dx.dex.file.DexFile r5);
            }

            static {
                    java.lang.Class<com.android.dx.dex.file.DexFile> r0 = com.android.dx.dex.file.DexFile.class
                    java.lang.Class<com.android.dx.dex.cf.CfOptions> r1 = com.android.dx.dex.cf.CfOptions.class
                    java.lang.Class<byte[]> r2 = byte[].class
                    java.lang.Class<com.android.dx.cf.direct.DirectClassFile> r3 = com.android.dx.cf.direct.DirectClassFile.class
                    java.lang.String r4 = "translate"
                    java.lang.Class<com.android.dx.dex.cf.CfTranslator> r5 = com.android.dx.dex.cf.CfTranslator.class
                    java.lang.Class<com.android.dx.dex.DexOptions> r6 = com.android.dx.dex.DexOptions.class
                    r7 = 0
                    java.lang.Class<com.android.dx.command.dexer.DxContext> r14 = com.android.dx.command.dexer.DxContext.class
                    net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm r15 = new net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm     // Catch: java.lang.Throwable -> L2e
                    java.lang.Class<com.android.dx.cf.direct.DirectClassFile> r9 = com.android.dx.cf.direct.DirectClassFile.class
                    java.lang.Class<byte[]> r10 = byte[].class
                    java.lang.Class<com.android.dx.dex.cf.CfOptions> r11 = com.android.dx.dex.cf.CfOptions.class
                    java.lang.Class<com.android.dx.dex.DexOptions> r12 = com.android.dx.dex.DexOptions.class
                    java.lang.Class<com.android.dx.dex.file.DexFile> r13 = com.android.dx.dex.file.DexFile.class
                    r8 = r14
                    java.lang.Class[] r8 = new java.lang.Class[]{r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L2e
                    java.lang.reflect.Method r8 = r5.getMethod(r4, r8)     // Catch: java.lang.Throwable -> L2e
                    java.lang.reflect.Constructor r9 = r14.getConstructor(r7)     // Catch: java.lang.Throwable -> L2e
                    r15.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2e
                    goto L60
                L2e:
                    net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm r15 = new net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm     // Catch: java.lang.Throwable -> L42
                    java.lang.Class[] r8 = new java.lang.Class[]{r3, r2, r1, r6, r0}     // Catch: java.lang.Throwable -> L42
                    java.lang.reflect.Method r8 = r5.getMethod(r4, r8)     // Catch: java.lang.Throwable -> L42
                    java.lang.String r9 = "minSdkVersion"
                    java.lang.reflect.Field r9 = r6.getField(r9)     // Catch: java.lang.Throwable -> L42
                    r15.<init>(r8, r9)     // Catch: java.lang.Throwable -> L42
                    goto L60
                L42:
                    net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm r15 = new net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm     // Catch: java.lang.Throwable -> L56
                    java.lang.Class[] r0 = new java.lang.Class[]{r3, r2, r1, r6, r0}     // Catch: java.lang.Throwable -> L56
                    java.lang.reflect.Method r0 = r5.getMethod(r4, r0)     // Catch: java.lang.Throwable -> L56
                    java.lang.String r1 = "targetApiLevel"
                    java.lang.reflect.Field r1 = r6.getField(r1)     // Catch: java.lang.Throwable -> L56
                    r15.<init>(r0, r1)     // Catch: java.lang.Throwable -> L56
                    goto L60
                L56:
                    r0 = move-exception
                    net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$Unavailable r15 = new net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$Unavailable
                    java.lang.String r0 = r0.getMessage()
                    r15.<init>(r0)
                L60:
                    net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.DISPATCHER = r15
                    net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.NO_PRINT_OUTPUT = r7
                    return
            }

            public ForSdkCompiler(com.android.dx.dex.DexOptions r1, com.android.dx.dex.cf.CfOptions r2) {
                    r0 = this;
                    r0.<init>()
                    r0.dexFileOptions = r1
                    r0.dexCompilerOptions = r2
                    return
            }

            public static /* synthetic */ com.android.dx.dex.cf.CfOptions access$000(net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler r0) {
                    com.android.dx.dex.cf.CfOptions r0 = r0.dexCompilerOptions
                    return r0
            }

            public static /* synthetic */ com.android.dx.dex.DexOptions access$100(net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler r0) {
                    com.android.dx.dex.DexOptions r0 = r0.dexFileOptions
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.Dispatcher access$200() {
                    net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.DISPATCHER
                    return r0
            }

            public static /* synthetic */ java.io.Writer access$300() {
                    java.io.Writer r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.NO_PRINT_OUTPUT
                    return r0
            }

            public static net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor makeDefault() {
                    com.android.dx.dex.DexOptions r0 = new com.android.dx.dex.DexOptions
                    r0.<init>()
                    net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher r1 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.DISPATCHER
                    r2 = 13
                    r1.setTargetApi(r0, r2)
                    net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler r1 = new net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler
                    com.android.dx.dex.cf.CfOptions r2 = new com.android.dx.dex.cf.CfOptions
                    r2.<init>()
                    r1.<init>(r0, r2)
                    return r1
            }

            @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor
            public net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.Conversion create() {
                    r3 = this;
                    net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion r0 = new net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion
                    com.android.dx.dex.file.DexFile r1 = new com.android.dx.dex.file.DexFile
                    com.android.dx.dex.DexOptions r2 = r3.dexFileOptions
                    r1.<init>(r2)
                    r0.<init>(r3, r1)
                    return r0
            }
        }

        net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.Conversion create();
    }

    public interface FileProcessor {

        public enum Disabled extends java.lang.Enum<net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled> implements net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor {
            private static final /* synthetic */ net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled[] $VALUES = null;
            public static final net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled INSTANCE = null;

            static {
                    net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$Disabled r0 = new net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$Disabled
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled.INSTANCE = r0
                    net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$Disabled[] r0 = new net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled[]{r0}
                    net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled.$VALUES = r0
                    return
            }

            Disabled(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$Disabled> r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$Disabled r1 = (net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled) r1
                    return r1
            }

            public static net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled[] values() {
                    net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$Disabled[] r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$Disabled[] r0 = (net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled[]) r0
                    return r0
            }

            @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor
            public void accept(java.io.File r1) {
                    r0 = this;
                    return
            }
        }

        public static class ForReadOnlyClassFile implements net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor {
            private final java.util.Set<?> permissions;
            private final java.lang.reflect.Method setPosixFilePermissions;
            private final java.lang.reflect.Method toPath;

            public ForReadOnlyClassFile(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.util.Set<?> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.setPosixFilePermissions = r1
                    r0.toPath = r2
                    r0.permissions = r3
                    return
            }

            @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor
            public void accept(java.io.File r4) {
                    r3 = this;
                    java.lang.reflect.Method r0 = r3.setPosixFilePermissions     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
                    java.lang.reflect.Method r1 = r3.toPath     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
                    r2 = 0
                    java.lang.Object r4 = r1.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
                    java.util.Set<?> r1 = r3.permissions     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
                    java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
                    r0.invoke(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
                    goto L1f
                L13:
                    r4 = move-exception
                    goto L17
                L15:
                    r4 = move-exception
                    goto L2c
                L17:
                    java.lang.Throwable r0 = r4.getTargetException()
                    boolean r0 = r0 instanceof java.lang.UnsupportedOperationException
                    if (r0 == 0) goto L20
                L1f:
                    return
                L20:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot invoke file system permissions method"
                    java.lang.Throwable r4 = r4.getTargetException()
                    r0.<init>(r1, r4)
                    throw r0
                L2c:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot access file system permissions"
                    r0.<init>(r1, r4)
                    throw r0
            }
        }

        void accept(java.io.File r1);
    }

    @android.annotation.TargetApi(3)
    public static class Injecting extends net.bytebuddy.android.AndroidClassLoadingStrategy {
        private static final net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher DISPATCHER = null;

        public interface Dispatcher {

            public static class ForAndroidPVm implements net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher {

                @net.bytebuddy.utility.nullability.AlwaysNull
                private static final dalvik.system.DexFile NO_RETURN_VALUE = null;
                private final java.lang.reflect.Method addDexPath;

                static {
                        return
                }

                public ForAndroidPVm(java.lang.reflect.Method r1) {
                        r0 = this;
                        r0.<init>()
                        r0.addDexPath = r1
                        return
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher
                public java.lang.Class<?> loadClass(@net.bytebuddy.utility.nullability.MaybeNull dalvik.system.DexFile r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4, net.bytebuddy.description.type.TypeDescription r5) {
                        r2 = this;
                        java.lang.String r3 = r5.getName()     // Catch: java.lang.ClassNotFoundException -> La
                        r0 = 0
                        java.lang.Class r3 = java.lang.Class.forName(r3, r0, r4)     // Catch: java.lang.ClassNotFoundException -> La
                        return r3
                    La:
                        r3 = move-exception
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Could not locate "
                        r0.append(r1)
                        r0.append(r5)
                        java.lang.String r5 = r0.toString()
                        r4.<init>(r5, r3)
                        throw r4
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher
                @net.bytebuddy.utility.nullability.MaybeNull
                public dalvik.system.DexFile loadDex(java.io.File r1, java.io.File r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, net.bytebuddy.utility.RandomString r4) throws java.io.IOException {
                        r0 = this;
                        boolean r1 = r3 instanceof dalvik.system.BaseDexClassLoader
                        if (r1 == 0) goto L35
                        java.lang.reflect.Method r1 = r0.addDexPath     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        dalvik.system.DexFile r1 = net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForAndroidPVm.NO_RETURN_VALUE     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        return r1
                    L16:
                        r1 = move-exception
                        goto L1a
                    L18:
                        r1 = move-exception
                        goto L2d
                    L1a:
                        java.lang.Throwable r1 = r1.getTargetException()
                        boolean r2 = r1 instanceof java.io.IOException
                        if (r2 == 0) goto L25
                        java.io.IOException r1 = (java.io.IOException) r1
                        throw r1
                    L25:
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r3 = "Cannot invoke BaseDexClassLoader#addDexPath(String, boolean)"
                        r2.<init>(r3, r1)
                        throw r2
                    L2d:
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r3 = "Cannot access BaseDexClassLoader#addDexPath(String, boolean)"
                        r2.<init>(r3, r1)
                        throw r2
                    L35:
                        java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "On Android P, a class injection can only be applied to BaseDexClassLoader: "
                        r2.append(r4)
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
                        r1.<init>(r2)
                        throw r1
                }
            }

            public enum ForLegacyVm extends java.lang.Enum<net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm> implements net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher {
                private static final /* synthetic */ net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm[] $VALUES = null;
                private static final java.lang.String EXTENSION = ".data";
                public static final net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm INSTANCE = null;
                private static final int NO_FLAGS = 0;

                static {
                        net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm r0 = new net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm.INSTANCE = r0
                        net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm[] r0 = new net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm[]{r0}
                        net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm.$VALUES = r0
                        return
                }

                ForLegacyVm(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm> r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm r1 = (net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm) r1
                        return r1
                }

                public static net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm[] values() {
                        net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm[] r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm[] r0 = (net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm[]) r0
                        return r0
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.Class<?> loadClass(dalvik.system.DexFile r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, net.bytebuddy.description.type.TypeDescription r3) {
                        r0 = this;
                        java.lang.String r3 = r3.getName()
                        java.lang.Class r1 = r1.loadClass(r3, r2)
                        return r1
                }

                @Override // net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher
                @net.bytebuddy.utility.nullability.MaybeNull
                public dalvik.system.DexFile loadDex(java.io.File r2, java.io.File r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4, net.bytebuddy.utility.RandomString r5) throws java.io.IOException {
                        r1 = this;
                        java.lang.String r3 = r3.getAbsolutePath()
                        java.io.File r4 = new java.io.File
                        java.lang.String r2 = r2.getAbsolutePath()
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r5 = r5.nextString()
                        r0.append(r5)
                        java.lang.String r5 = ".data"
                        r0.append(r5)
                        java.lang.String r5 = r0.toString()
                        r4.<init>(r2, r5)
                        java.lang.String r2 = r4.getAbsolutePath()
                        r4 = 0
                        dalvik.system.DexFile r2 = dalvik.system.DexFile.loadDex(r3, r2, r4)
                        return r2
                }
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            java.lang.Class<?> loadClass(dalvik.system.DexFile r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, net.bytebuddy.description.type.TypeDescription r3);

            @net.bytebuddy.utility.nullability.MaybeNull
            dalvik.system.DexFile loadDex(java.io.File r1, java.io.File r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, net.bytebuddy.utility.RandomString r4) throws java.io.IOException;
        }

        static {
                net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForAndroidPVm r0 = new net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForAndroidPVm     // Catch: java.lang.Throwable -> L16
                java.lang.Class<dalvik.system.BaseDexClassLoader> r1 = dalvik.system.BaseDexClassLoader.class
                java.lang.String r2 = "addDexPath"
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L16
                java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Throwable -> L16
                java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L16
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
                goto L18
            L16:
                net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.Dispatcher.ForLegacyVm.INSTANCE
            L18:
                net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.DISPATCHER = r0
                return
        }

        public Injecting(java.io.File r2) {
                r1 = this;
                net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.makeDefault()
                r1.<init>(r2, r0)
                return
        }

        public Injecting(java.io.File r1, net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // net.bytebuddy.android.AndroidClassLoadingStrategy
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> doLoad(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4, java.util.Set<net.bytebuddy.description.type.TypeDescription> r5, java.io.File r6) throws java.io.IOException {
                r3 = this;
                net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.DISPATCHER
                java.io.File r1 = r3.privateDirectory
                net.bytebuddy.utility.RandomString r2 = r3.randomString
                dalvik.system.DexFile r6 = r0.loadDex(r1, r6, r4, r2)
                java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L48
                r0.<init>()     // Catch: java.lang.Throwable -> L48
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L48
            L13:
                boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L48
                if (r1 == 0) goto L4a
                java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L48
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1     // Catch: java.lang.Throwable -> L48
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L48
                net.bytebuddy.android.AndroidClassLoadingStrategy$Injecting$Dispatcher r2 = net.bytebuddy.android.AndroidClassLoadingStrategy.Injecting.DISPATCHER     // Catch: java.lang.Throwable -> L2d
                java.lang.Class r2 = r2.loadClass(r6, r4, r1)     // Catch: java.lang.Throwable -> L2d
                if (r2 == 0) goto L2f
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
                goto L13
            L2d:
                r5 = move-exception
                goto L46
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
                r0.<init>()     // Catch: java.lang.Throwable -> L2d
                java.lang.String r2 = "Could not load "
                r0.append(r2)     // Catch: java.lang.Throwable -> L2d
                r0.append(r1)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2d
                r5.<init>(r0)     // Catch: java.lang.Throwable -> L2d
                throw r5     // Catch: java.lang.Throwable -> L2d
            L46:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
                throw r5     // Catch: java.lang.Throwable -> L48
            L48:
                r4 = move-exception
                goto L50
            L4a:
                if (r6 == 0) goto L4f
                r6.close()
            L4f:
                return r0
            L50:
                if (r6 == 0) goto L55
                r6.close()
            L55:
                throw r4
        }

        @Override // net.bytebuddy.android.AndroidClassLoadingStrategy, net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r2) {
                r0 = this;
                if (r1 == 0) goto L7
                java.util.Map r1 = super.load(r1, r2)
                return r1
            L7:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot inject classes into the bootstrap class loader on Android"
                r1.<init>(r2)
                throw r1
        }
    }

    @android.annotation.TargetApi(3)
    public static class Wrapping extends net.bytebuddy.android.AndroidClassLoadingStrategy {
        public Wrapping(java.io.File r2) {
                r1 = this;
                net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor.ForSdkCompiler.makeDefault()
                r1.<init>(r2, r0)
                return
        }

        public Wrapping(java.io.File r1, net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // net.bytebuddy.android.AndroidClassLoadingStrategy
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Android discourages the use of access controllers", value = {"DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> doLoad(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4, java.util.Set<net.bytebuddy.description.type.TypeDescription> r5, java.io.File r6) {
                r3 = this;
                dalvik.system.DexClassLoader r0 = new dalvik.system.DexClassLoader
                java.lang.String r6 = r6.getAbsolutePath()
                java.io.File r1 = r3.privateDirectory
                java.lang.String r1 = r1.getAbsolutePath()
                java.lang.String r2 = net.bytebuddy.android.AndroidClassLoadingStrategy.access$400()
                r0.<init>(r6, r1, r2, r4)
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.util.Iterator r5 = r5.iterator()
            L1c:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L4d
                java.lang.Object r6 = r5.next()
                net.bytebuddy.description.type.TypeDescription r6 = (net.bytebuddy.description.type.TypeDescription) r6
                java.lang.String r1 = r6.getName()     // Catch: java.lang.ClassNotFoundException -> L35
                r2 = 0
                java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.ClassNotFoundException -> L35
                r4.put(r6, r1)     // Catch: java.lang.ClassNotFoundException -> L35
                goto L1c
            L35:
                r4 = move-exception
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6, r4)
                throw r5
            L4d:
                return r4
        }
    }

    static {
            net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile r0 = new net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "java.nio.file.Files"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "setPosixFilePermissions"
            java.lang.Class<java.nio.file.Path> r3 = java.nio.file.Path.class
            java.lang.Class<java.util.Set> r4 = java.util.Set.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Class<java.io.File> r2 = java.io.File.class
            java.lang.String r3 = "toPath"
            r4 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "java.nio.file.attribute.PosixFilePermission"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "valueOf"
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r3 = r3.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "OWNER_READ"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L43
            java.util.Set r3 = java.util.Collections.singleton(r3)     // Catch: java.lang.Throwable -> L43
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor$Disabled r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.FileProcessor.Disabled.INSTANCE
        L45:
            net.bytebuddy.android.AndroidClassLoadingStrategy.FILE_PROCESSOR = r0
            return
    }

    public AndroidClassLoadingStrategy(java.io.File r3, net.bytebuddy.android.AndroidClassLoadingStrategy.DexProcessor r4) {
            r2 = this;
            r2.<init>()
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L15
            r2.privateDirectory = r3
            r2.dexProcessor = r4
            net.bytebuddy.utility.RandomString r3 = new net.bytebuddy.utility.RandomString
            r3.<init>()
            r2.randomString = r3
            return
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not a directory "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public static /* synthetic */ java.lang.String access$400() {
            java.lang.String r0 = net.bytebuddy.android.AndroidClassLoadingStrategy.EMPTY_LIBRARY_PATH
            return r0
    }

    public abstract java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> doLoad(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Set<net.bytebuddy.description.type.TypeDescription> r2, java.io.File r3) throws java.io.IOException;

    @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
    public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r8, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r9) {
            r7 = this;
            java.lang.String r0 = "Could not delete "
            java.lang.String r1 = "net.bytebuddy"
            net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor r2 = r7.dexProcessor
            net.bytebuddy.android.AndroidClassLoadingStrategy$DexProcessor$Conversion r2 = r2.create()
            java.util.Set r3 = r9.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
            java.lang.String r5 = r5.getName()
            java.lang.Object r4 = r4.getValue()
            byte[] r4 = (byte[]) r4
            r2.register(r5, r4)
            goto L12
        L32:
            java.io.File r3 = new java.io.File
            java.io.File r4 = r7.privateDirectory
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            net.bytebuddy.utility.RandomString r6 = r7.randomString
            java.lang.String r6 = r6.nextString()
            r5.append(r6)
            java.lang.String r6 = ".jar"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>(r4, r5)
            boolean r4 = r3.createNewFile()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            if (r4 == 0) goto La6
            java.util.jar.JarOutputStream r4 = new java.util.jar.JarOutputStream     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.util.jar.JarEntry r5 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = "classes.dex"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La1
            r4.putNextEntry(r5)     // Catch: java.lang.Throwable -> La1
            r2.drainTo(r4)     // Catch: java.lang.Throwable -> La1
            r4.closeEntry()     // Catch: java.lang.Throwable -> La1
            r4.close()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            net.bytebuddy.android.AndroidClassLoadingStrategy$FileProcessor r2 = net.bytebuddy.android.AndroidClassLoadingStrategy.FILE_PROCESSOR     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r2.accept(r3)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.util.Set r9 = r9.keySet()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.util.Map r8 = r7.doLoad(r8, r9, r3)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            boolean r9 = r3.delete()
            if (r9 != 0) goto L9c
            java.util.logging.Logger r9 = java.util.logging.Logger.getLogger(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r9.warning(r0)
        L9c:
            return r8
        L9d:
            r8 = move-exception
            goto Ld4
        L9f:
            r8 = move-exception
            goto Lbd
        La1:
            r8 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            throw r8     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
        La6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r9.<init>()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r2 = "Cannot create "
            r9.append(r2)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r9.append(r3)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            throw r8     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
        Lbd:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r2.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "Cannot write to zip file "
            r2.append(r4)     // Catch: java.lang.Throwable -> L9d
            r2.append(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9d
            r9.<init>(r2, r8)     // Catch: java.lang.Throwable -> L9d
            throw r9     // Catch: java.lang.Throwable -> L9d
        Ld4:
            boolean r9 = r3.delete()
            if (r9 != 0) goto Lf0
            java.util.logging.Logger r9 = java.util.logging.Logger.getLogger(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r9.warning(r0)
        Lf0:
            throw r8
    }
}

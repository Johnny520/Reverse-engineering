package com.android.dx.command.dexer;

/* JADX INFO: loaded from: classes.dex */
public class Main {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.jar.Attributes.Name CREATED_BY = null;
    private static final java.lang.String DEX_EXTENSION = ".dex";
    private static final java.lang.String DEX_PREFIX = "classes";
    private static final java.lang.String IN_RE_CORE_CLASSES = "Ill-advised or mistaken usage of a core class (java.* or javax.*)\nwhen not building a core library.\n\nThis is often due to inadvertently including a core library file\nin your application's project, when using an IDE (such as\nEclipse). If you are sure you're not intentionally defining a\ncore class, then this is the most likely explanation of what's\ngoing on.\n\nHowever, you might actually be trying to define a class in a core\nnamespace, the source of which you may have taken, for example,\nfrom a non-Android virtual machine project. This will most\nassuredly not work. At a minimum, it jeopardizes the\ncompatibility of your app with future versions of the platform.\nIt is also often of questionable legality.\n\nIf you really intend to build a core library -- which is only\nappropriate as part of creating a full virtual machine\ndistribution, as opposed to compiling an application -- then use\nthe \"--core-library\" option to suppress this error message.\n\nIf you go ahead and use \"--core-library\" but are in fact\nbuilding an application, then be forewarned that your application\nwill still fail to build or run, at some point. Please be\nprepared for angry customers who find, for example, that your\napplication ceases to function once they upgrade their operating\nsystem. You will be to blame for this problem.\n\nIf you are legitimately using some code that happens to be in a\ncore package, then the easiest safe alternative you have is to\nrepackage that code. That is, move the classes in question into\nyour own package namespace. This means that they will never be in\nconflict with core system classes. JarJar is a tool that may help\nyou in this endeavor. If you find that you cannot do this, then\nthat is an indication that the path you are on will ultimately\nlead to pain, suffering, grief, and lamentation.\n";
    private static final java.lang.String[] JAVAX_CORE = null;
    private static final java.lang.String MANIFEST_NAME = "META-INF/MANIFEST.MF";
    private static final int MAX_FIELD_ADDED_DURING_DEX_CREATION = 9;
    private static final int MAX_METHOD_ADDED_DURING_DEX_CREATION = 2;
    private java.util.List<java.util.concurrent.Future<java.lang.Boolean>> addToDexFutures;
    private volatile boolean anyFilesProcessed;
    private com.android.dx.command.dexer.Main.Arguments args;
    private java.util.concurrent.ExecutorService classDefItemConsumer;
    private java.util.concurrent.ExecutorService classTranslatorPool;
    private java.util.Set<java.lang.String> classesInMainDex;
    private final com.android.dx.command.dexer.DxContext context;
    private java.util.concurrent.ExecutorService dexOutPool;
    private java.util.List<byte[]> dexOutputArrays;
    private java.util.List<java.util.concurrent.Future<byte[]>> dexOutputFutures;
    private java.lang.Object dexRotationLock;
    private java.util.concurrent.atomic.AtomicInteger errors;
    private java.io.OutputStreamWriter humanOutWriter;
    private final java.util.List<byte[]> libraryDexBuffers;
    private int maxFieldIdsInProcess;
    private int maxMethodIdsInProcess;
    private long minimumFileAge;
    private com.android.dx.dex.file.DexFile outputDex;
    private java.util.TreeMap<java.lang.String, byte[]> outputResources;

    /* JADX INFO: renamed from: com.android.dx.command.dexer.Main$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Arguments {
        private static final java.lang.String INCREMENTAL_OPTION = "--incremental";
        private static final java.lang.String INPUT_LIST_OPTION = "--input-list";
        private static final java.lang.String MAIN_DEX_LIST_OPTION = "--main-dex-list";
        private static final java.lang.String MINIMAL_MAIN_DEX_OPTION = "--minimal-main-dex";
        private static final java.lang.String MULTI_DEX_OPTION = "--multi-dex";
        private static final java.lang.String NUM_THREADS_OPTION = "--num-threads";
        public boolean allowAllInterfaceMethodInvokes;
        public com.android.dx.dex.cf.CfOptions cfOptions;
        public final com.android.dx.command.dexer.DxContext context;
        public boolean coreLibrary;
        public boolean debug;
        public com.android.dx.dex.DexOptions dexOptions;
        public java.lang.String dontOptimizeListFile;
        public int dumpWidth;
        public boolean emptyOk;
        public java.lang.String[] fileNames;
        public boolean forceJumbo;
        public java.lang.String humanOutName;
        public boolean incremental;
        private java.util.List<java.lang.String> inputList;
        public boolean jarOutput;
        public boolean keepClassesInJar;
        public boolean localInfo;
        public java.lang.String mainDexListFile;
        public int maxNumberOfIdxPerDex;
        public java.lang.String methodToDump;
        public int minSdkVersion;
        public boolean minimalMainDex;
        public boolean multiDex;
        public int numThreads;
        public boolean optimize;
        public java.lang.String optimizeListFile;
        public java.lang.String outName;
        private boolean outputIsDirectDex;
        private boolean outputIsDirectory;
        public int positionInfo;
        public boolean statistics;
        public boolean strictNameCheck;
        public boolean verbose;
        public boolean verboseDump;
        public boolean warnings;

        public static class ArgumentsParser {
            private final java.lang.String[] arguments;
            private java.lang.String current;
            private int index;
            private java.lang.String lastValue;

            public ArgumentsParser(java.lang.String[] r1) {
                    r0 = this;
                    r0.<init>()
                    r0.arguments = r1
                    r1 = 0
                    r0.index = r1
                    return
            }

            private boolean getNextValue() {
                    r3 = this;
                    int r0 = r3.index
                    java.lang.String[] r1 = r3.arguments
                    int r2 = r1.length
                    if (r0 < r2) goto L9
                    r0 = 0
                    return r0
                L9:
                    r1 = r1[r0]
                    r3.current = r1
                    r1 = 1
                    int r0 = r0 + r1
                    r3.index = r0
                    return r1
            }

            public java.lang.String getCurrent() {
                    r1 = this;
                    java.lang.String r0 = r1.current
                    return r0
            }

            public java.lang.String getLastValue() {
                    r1 = this;
                    java.lang.String r0 = r1.lastValue
                    return r0
            }

            public boolean getNext() {
                    r4 = this;
                    int r0 = r4.index
                    java.lang.String[] r1 = r4.arguments
                    int r2 = r1.length
                    r3 = 0
                    if (r0 < r2) goto L9
                    return r3
                L9:
                    r0 = r1[r0]
                    r4.current = r0
                    java.lang.String r1 = "--"
                    boolean r0 = r0.equals(r1)
                    if (r0 != 0) goto L25
                    java.lang.String r0 = r4.current
                    boolean r0 = r0.startsWith(r1)
                    if (r0 != 0) goto L1e
                    goto L25
                L1e:
                    int r0 = r4.index
                    r1 = 1
                    int r0 = r0 + r1
                    r4.index = r0
                    return r1
                L25:
                    return r3
            }

            public java.lang.String[] getRemaining() {
                    r5 = this;
                    java.lang.String[] r0 = r5.arguments
                    int r1 = r0.length
                    int r2 = r5.index
                    int r1 = r1 - r2
                    java.lang.String[] r3 = new java.lang.String[r1]
                    if (r1 <= 0) goto Le
                    r4 = 0
                    java.lang.System.arraycopy(r0, r2, r3, r4, r1)
                Le:
                    return r3
            }

            public boolean isArg(java.lang.String r5) {
                    r4 = this;
                    int r0 = r5.length()
                    if (r0 <= 0) goto L57
                    int r1 = r0 + (-1)
                    char r2 = r5.charAt(r1)
                    r3 = 61
                    if (r2 != r3) goto L57
                    java.lang.String r2 = r4.current
                    boolean r2 = r2.startsWith(r5)
                    r3 = 1
                    if (r2 == 0) goto L22
                    java.lang.String r5 = r4.current
                    java.lang.String r5 = r5.substring(r0)
                    r4.lastValue = r5
                    return r3
                L22:
                    r0 = 0
                    java.lang.String r5 = r5.substring(r0, r1)
                    java.lang.String r1 = r4.current
                    boolean r1 = r1.equals(r5)
                    if (r1 == 0) goto L56
                    boolean r0 = r4.getNextValue()
                    if (r0 == 0) goto L3a
                    java.lang.String r5 = r4.current
                    r4.lastValue = r5
                    return r3
                L3a:
                    java.io.PrintStream r0 = java.lang.System.err
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Missing value after parameter "
                    r1.append(r2)
                    r1.append(r5)
                    java.lang.String r5 = r1.toString()
                    r0.println(r5)
                    com.android.dx.command.UsageException r5 = new com.android.dx.command.UsageException
                    r5.<init>()
                    throw r5
                L56:
                    return r0
                L57:
                    java.lang.String r0 = r4.current
                    boolean r5 = r0.equals(r5)
                    return r5
            }
        }

        public Arguments() {
                r1 = this;
                com.android.dx.command.dexer.DxContext r0 = new com.android.dx.command.dexer.DxContext
                r0.<init>()
                r1.<init>(r0)
                return
        }

        public Arguments(com.android.dx.command.dexer.DxContext r5) {
                r4 = this;
                r4.<init>()
                r0 = 0
                r4.debug = r0
                r1 = 1
                r4.warnings = r1
                r4.verbose = r0
                r4.verboseDump = r0
                r4.coreLibrary = r0
                r2 = 0
                r4.methodToDump = r2
                r4.dumpWidth = r0
                r4.outName = r2
                r4.humanOutName = r2
                r4.strictNameCheck = r1
                r4.emptyOk = r0
                r4.jarOutput = r0
                r4.keepClassesInJar = r0
                r3 = 13
                r4.minSdkVersion = r3
                r3 = 2
                r4.positionInfo = r3
                r4.localInfo = r1
                r4.incremental = r0
                r4.forceJumbo = r0
                r4.allowAllInterfaceMethodInvokes = r0
                r4.optimize = r1
                r4.optimizeListFile = r2
                r4.dontOptimizeListFile = r2
                r4.numThreads = r1
                r4.multiDex = r0
                r4.mainDexListFile = r2
                r4.minimalMainDex = r0
                r1 = 65536(0x10000, float:9.1835E-41)
                r4.maxNumberOfIdxPerDex = r1
                r4.inputList = r2
                r4.outputIsDirectory = r0
                r4.outputIsDirectDex = r0
                r4.context = r5
                return
        }

        public static /* synthetic */ void access$000(com.android.dx.command.dexer.Main.Arguments r0, java.lang.String[] r1) {
                r0.parse(r1)
                return
        }

        private void parse(java.lang.String[] r3) {
                r2 = this;
                com.android.dx.command.dexer.Main$Arguments$ArgumentsParser r0 = new com.android.dx.command.dexer.Main$Arguments$ArgumentsParser
                r0.<init>(r3)
                r2.parseFlags(r0)
                java.lang.String[] r3 = r0.getRemaining()
                r2.fileNames = r3
                java.util.List<java.lang.String> r3 = r2.inputList
                if (r3 == 0) goto L33
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L33
                java.util.List<java.lang.String> r3 = r2.inputList
                java.lang.String[] r0 = r2.fileNames
                java.util.List r0 = java.util.Arrays.asList(r0)
                r3.addAll(r0)
                java.util.List<java.lang.String> r3 = r2.inputList
                int r0 = r3.size()
                java.lang.String[] r0 = new java.lang.String[r0]
                java.lang.Object[] r3 = r3.toArray(r0)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.fileNames = r3
            L33:
                java.lang.String[] r3 = r2.fileNames
                int r3 = r3.length
                if (r3 != 0) goto L4c
                boolean r3 = r2.emptyOk
                if (r3 == 0) goto L3d
                goto L59
            L3d:
                com.android.dx.command.dexer.DxContext r3 = r2.context
                java.io.PrintStream r3 = r3.err
                java.lang.String r0 = "no input files specified"
                r3.println(r0)
                com.android.dx.command.UsageException r3 = new com.android.dx.command.UsageException
                r3.<init>()
                throw r3
            L4c:
                boolean r3 = r2.emptyOk
                if (r3 == 0) goto L59
                com.android.dx.command.dexer.DxContext r3 = r2.context
                java.io.PrintStream r3 = r3.out
                java.lang.String r0 = "ignoring input files"
                r3.println(r0)
            L59:
                java.lang.String r3 = r2.humanOutName
                if (r3 != 0) goto L65
                java.lang.String r3 = r2.methodToDump
                if (r3 == 0) goto L65
                java.lang.String r3 = "-"
                r2.humanOutName = r3
            L65:
                java.lang.String r3 = r2.mainDexListFile
                if (r3 == 0) goto L7d
                boolean r0 = r2.multiDex
                if (r0 == 0) goto L6e
                goto L7d
            L6e:
                com.android.dx.command.dexer.DxContext r3 = r2.context
                java.io.PrintStream r3 = r3.err
                java.lang.String r0 = "--main-dex-list is only supported in combination with --multi-dex"
                r3.println(r0)
                com.android.dx.command.UsageException r3 = new com.android.dx.command.UsageException
                r3.<init>()
                throw r3
            L7d:
                boolean r0 = r2.minimalMainDex
                if (r0 == 0) goto L97
                if (r3 == 0) goto L88
                boolean r3 = r2.multiDex
                if (r3 == 0) goto L88
                goto L97
            L88:
                com.android.dx.command.dexer.DxContext r3 = r2.context
                java.io.PrintStream r3 = r3.err
                java.lang.String r0 = "--minimal-main-dex is only supported in combination with --multi-dex and --main-dex-list"
                r3.println(r0)
                com.android.dx.command.UsageException r3 = new com.android.dx.command.UsageException
                r3.<init>()
                throw r3
            L97:
                boolean r3 = r2.multiDex
                if (r3 == 0) goto Laf
                boolean r0 = r2.incremental
                if (r0 != 0) goto La0
                goto Laf
            La0:
                com.android.dx.command.dexer.DxContext r3 = r2.context
                java.io.PrintStream r3 = r3.err
                java.lang.String r0 = "--incremental is not supported with --multi-dex"
                r3.println(r0)
                com.android.dx.command.UsageException r3 = new com.android.dx.command.UsageException
                r3.<init>()
                throw r3
            Laf:
                if (r3 == 0) goto Le5
                boolean r0 = r2.outputIsDirectDex
                if (r0 != 0) goto Lb6
                goto Le5
            Lb6:
                com.android.dx.command.dexer.DxContext r3 = r2.context
                java.io.PrintStream r3 = r3.err
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unsupported output \""
                r0.append(r1)
                java.lang.String r1 = r2.outName
                r0.append(r1)
                java.lang.String r1 = "\". "
                r0.append(r1)
                java.lang.String r1 = "--multi-dex"
                r0.append(r1)
                java.lang.String r1 = " supports only archive or directory output"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.println(r0)
                com.android.dx.command.UsageException r3 = new com.android.dx.command.UsageException
                r3.<init>()
                throw r3
            Le5:
                boolean r0 = r2.outputIsDirectory
                if (r0 == 0) goto Lfa
                if (r3 != 0) goto Lfa
                java.io.File r3 = new java.io.File
                java.lang.String r0 = r2.outName
                java.lang.String r1 = "classes.dex"
                r3.<init>(r0, r1)
                java.lang.String r3 = r3.getPath()
                r2.outName = r3
            Lfa:
                r2.makeOptionsObjects()
                return
        }

        private void parseFlags(com.android.dx.command.dexer.Main.Arguments.ArgumentsParser r5) {
                r4 = this;
            L0:
                boolean r0 = r5.getNext()
                if (r0 == 0) goto L2c0
                java.lang.String r0 = "--debug"
                boolean r0 = r5.isArg(r0)
                r1 = 1
                if (r0 == 0) goto L12
                r4.debug = r1
                goto L0
            L12:
                java.lang.String r0 = "--no-warning"
                boolean r0 = r5.isArg(r0)
                r2 = 0
                if (r0 == 0) goto L1e
                r4.warnings = r2
                goto L0
            L1e:
                java.lang.String r0 = "--verbose"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L29
                r4.verbose = r1
                goto L0
            L29:
                java.lang.String r0 = "--verbose-dump"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L34
                r4.verboseDump = r1
                goto L0
            L34:
                java.lang.String r0 = "--no-files"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L3f
                r4.emptyOk = r1
                goto L0
            L3f:
                java.lang.String r0 = "--no-optimize"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L4a
                r4.optimize = r2
                goto L0
            L4a:
                java.lang.String r0 = "--no-strict"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L55
                r4.strictNameCheck = r2
                goto L0
            L55:
                java.lang.String r0 = "--core-library"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L60
                r4.coreLibrary = r1
                goto L0
            L60:
                java.lang.String r0 = "--statistics"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L6b
                r4.statistics = r1
                goto L0
            L6b:
                java.lang.String r0 = "--optimize-list="
                boolean r0 = r5.isArg(r0)
                java.lang.String r3 = "--optimize-list and --no-optimize-list are incompatible."
                if (r0 == 0) goto L90
                java.lang.String r0 = r4.dontOptimizeListFile
                if (r0 != 0) goto L83
                r4.optimize = r1
                java.lang.String r0 = r5.getLastValue()
                r4.optimizeListFile = r0
                goto L0
            L83:
                com.android.dx.command.dexer.DxContext r5 = r4.context
                java.io.PrintStream r5 = r5.err
                r5.println(r3)
                com.android.dx.command.UsageException r5 = new com.android.dx.command.UsageException
                r5.<init>()
                throw r5
            L90:
                java.lang.String r0 = "--no-optimize-list="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto Lb3
                java.lang.String r0 = r4.dontOptimizeListFile
                if (r0 != 0) goto La6
                r4.optimize = r1
                java.lang.String r0 = r5.getLastValue()
                r4.dontOptimizeListFile = r0
                goto L0
            La6:
                com.android.dx.command.dexer.DxContext r5 = r4.context
                java.io.PrintStream r5 = r5.err
                r5.println(r3)
                com.android.dx.command.UsageException r5 = new com.android.dx.command.UsageException
                r5.<init>()
                throw r5
            Lb3:
                java.lang.String r0 = "--keep-classes"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto Lbf
                r4.keepClassesInJar = r1
                goto L0
            Lbf:
                java.lang.String r0 = "--output="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L127
                java.lang.String r0 = r5.getLastValue()
                r4.outName = r0
                java.io.File r0 = new java.io.File
                java.lang.String r3 = r4.outName
                r0.<init>(r3)
                boolean r0 = r0.isDirectory()
                if (r0 == 0) goto Le0
                r4.jarOutput = r2
                r4.outputIsDirectory = r1
                goto L0
            Le0:
                java.lang.String r0 = r4.outName
                boolean r0 = com.android.dex.util.FileUtils.hasArchiveSuffix(r0)
                if (r0 == 0) goto Lec
                r4.jarOutput = r1
                goto L0
            Lec:
                java.lang.String r0 = r4.outName
                java.lang.String r3 = ".dex"
                boolean r0 = r0.endsWith(r3)
                if (r0 != 0) goto L121
                java.lang.String r0 = r4.outName
                java.lang.String r3 = "-"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L101
                goto L121
            L101:
                com.android.dx.command.dexer.DxContext r5 = r4.context
                java.io.PrintStream r5 = r5.err
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unknown output extension: "
                r0.append(r1)
                java.lang.String r1 = r4.outName
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.println(r0)
                com.android.dx.command.UsageException r5 = new com.android.dx.command.UsageException
                r5.<init>()
                throw r5
            L121:
                r4.jarOutput = r2
                r4.outputIsDirectDex = r1
                goto L0
            L127:
                java.lang.String r0 = "--dump-to="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L137
                java.lang.String r0 = r5.getLastValue()
                r4.humanOutName = r0
                goto L0
            L137:
                java.lang.String r0 = "--dump-width="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L14b
                java.lang.String r0 = r5.getLastValue()
                int r0 = java.lang.Integer.parseInt(r0)
                r4.dumpWidth = r0
                goto L0
            L14b:
                java.lang.String r0 = "--dump-method="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L15d
                java.lang.String r0 = r5.getLastValue()
                r4.methodToDump = r0
                r4.jarOutput = r2
                goto L0
            L15d:
                java.lang.String r0 = "--positions="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L1a5
                java.lang.String r0 = r5.getLastValue()
                java.lang.String r0 = r0.intern()
                java.lang.String r2 = "none"
                if (r0 != r2) goto L175
                r4.positionInfo = r1
                goto L0
            L175:
                java.lang.String r1 = "important"
                if (r0 != r1) goto L17e
                r0 = 3
                r4.positionInfo = r0
                goto L0
            L17e:
                java.lang.String r1 = "lines"
                if (r0 != r1) goto L187
                r0 = 2
                r4.positionInfo = r0
                goto L0
            L187:
                com.android.dx.command.dexer.DxContext r5 = r4.context
                java.io.PrintStream r5 = r5.err
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown positions option: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.println(r0)
                com.android.dx.command.UsageException r5 = new com.android.dx.command.UsageException
                r5.<init>()
                throw r5
            L1a5:
                java.lang.String r0 = "--no-locals"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L1b1
                r4.localInfo = r2
                goto L0
            L1b1:
                java.lang.String r0 = "--num-threads="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L1c5
                java.lang.String r0 = r5.getLastValue()
                int r0 = java.lang.Integer.parseInt(r0)
                r4.numThreads = r0
                goto L0
            L1c5:
                java.lang.String r0 = "--incremental"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L1d1
                r4.incremental = r1
                goto L0
            L1d1:
                java.lang.String r0 = "--force-jumbo"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L1dd
                r4.forceJumbo = r1
                goto L0
            L1dd:
                java.lang.String r0 = "--multi-dex"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L1e9
                r4.multiDex = r1
                goto L0
            L1e9:
                java.lang.String r0 = "--main-dex-list="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L1f9
                java.lang.String r0 = r5.getLastValue()
                r4.mainDexListFile = r0
                goto L0
            L1f9:
                java.lang.String r0 = "--minimal-main-dex"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L205
                r4.minimalMainDex = r1
                goto L0
            L205:
                java.lang.String r0 = "--set-max-idx-number="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L219
                java.lang.String r0 = r5.getLastValue()
                int r0 = java.lang.Integer.parseInt(r0)
                r4.maxNumberOfIdxPerDex = r0
                goto L0
            L219:
                java.lang.String r0 = "--input-list="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L25e
                java.io.File r0 = new java.io.File
                java.lang.String r1 = r5.getLastValue()
                r0.<init>(r1)
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.io.IOException -> L23c
                r1.<init>()     // Catch: java.io.IOException -> L23c
                r4.inputList = r1     // Catch: java.io.IOException -> L23c
                java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.io.IOException -> L23c
                java.util.List<java.lang.String> r2 = r4.inputList     // Catch: java.io.IOException -> L23c
                com.android.dx.command.dexer.Main.access$1100(r1, r2)     // Catch: java.io.IOException -> L23c
                goto L0
            L23c:
                com.android.dx.command.dexer.DxContext r5 = r4.context
                java.io.PrintStream r5 = r5.err
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to read input list file: "
                r1.append(r2)
                java.lang.String r0 = r0.getName()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.println(r0)
                com.android.dx.command.UsageException r5 = new com.android.dx.command.UsageException
                r5.<init>()
                throw r5
            L25e:
                java.lang.String r0 = "--min-sdk-version="
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L292
                java.lang.String r0 = r5.getLastValue()
                int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L26f
                goto L270
            L26f:
                r2 = -1
            L270:
                if (r2 < r1) goto L276
                r4.minSdkVersion = r2
                goto L0
            L276:
                java.io.PrintStream r5 = java.lang.System.err
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "improper min-sdk-version option: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.println(r0)
                com.android.dx.command.UsageException r5 = new com.android.dx.command.UsageException
                r5.<init>()
                throw r5
            L292:
                java.lang.String r0 = "--allow-all-interface-method-invokes"
                boolean r0 = r5.isArg(r0)
                if (r0 == 0) goto L29e
                r4.allowAllInterfaceMethodInvokes = r1
                goto L0
            L29e:
                com.android.dx.command.dexer.DxContext r0 = r4.context
                java.io.PrintStream r0 = r0.err
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown option: "
                r1.append(r2)
                java.lang.String r5 = r5.getCurrent()
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.println(r5)
                com.android.dx.command.UsageException r5 = new com.android.dx.command.UsageException
                r5.<init>()
                throw r5
            L2c0:
                return
        }

        public void makeOptionsObjects() {
                r2 = this;
                com.android.dx.dex.cf.CfOptions r0 = new com.android.dx.dex.cf.CfOptions
                r0.<init>()
                r2.cfOptions = r0
                int r1 = r2.positionInfo
                r0.positionInfo = r1
                boolean r1 = r2.localInfo
                r0.localInfo = r1
                boolean r1 = r2.strictNameCheck
                r0.strictNameCheck = r1
                boolean r1 = r2.optimize
                r0.optimize = r1
                java.lang.String r1 = r2.optimizeListFile
                r0.optimizeListFile = r1
                java.lang.String r1 = r2.dontOptimizeListFile
                r0.dontOptimizeListFile = r1
                boolean r1 = r2.statistics
                r0.statistics = r1
                boolean r1 = r2.warnings
                if (r1 == 0) goto L2e
                com.android.dx.command.dexer.DxContext r1 = r2.context
                java.io.PrintStream r1 = r1.err
                r0.warn = r1
                goto L34
            L2e:
                com.android.dx.command.dexer.DxContext r1 = r2.context
                java.io.PrintStream r1 = r1.noop
                r0.warn = r1
            L34:
                com.android.dx.dex.DexOptions r0 = new com.android.dx.dex.DexOptions
                com.android.dx.command.dexer.DxContext r1 = r2.context
                java.io.PrintStream r1 = r1.err
                r0.<init>(r1)
                r2.dexOptions = r0
                int r1 = r2.minSdkVersion
                r0.minSdkVersion = r1
                boolean r1 = r2.forceJumbo
                r0.forceJumbo = r1
                boolean r1 = r2.allowAllInterfaceMethodInvokes
                r0.allowAllInterfaceMethodInvokes = r1
                return
        }

        public void parseFlags(java.lang.String[] r2) {
                r1 = this;
                com.android.dx.command.dexer.Main$Arguments$ArgumentsParser r0 = new com.android.dx.command.dexer.Main$Arguments$ArgumentsParser
                r0.<init>(r2)
                r1.parseFlags(r0)
                return
        }
    }

    public class BestEffortMainDexListFilter implements com.android.dx.cf.direct.ClassPathOpener.FileNameFilter {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map;
        final /* synthetic */ com.android.dx.command.dexer.Main this$0;

        public BestEffortMainDexListFilter(com.android.dx.command.dexer.Main r5) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r4.map = r0
                java.util.Set r5 = com.android.dx.command.dexer.Main.access$1000(r5)
                java.util.Iterator r5 = r5.iterator()
            L14:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L41
                java.lang.Object r0 = r5.next()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = com.android.dx.command.dexer.Main.access$900(r0)
                java.lang.String r1 = r4.getSimpleName(r0)
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r4.map
                java.lang.Object r2 = r2.get(r1)
                java.util.List r2 = (java.util.List) r2
                if (r2 != 0) goto L3d
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 1
                r2.<init>(r3)
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r4.map
                r3.put(r1, r2)
            L3d:
                r2.add(r0)
                goto L14
            L41:
                return
        }

        private java.lang.String getSimpleName(java.lang.String r2) {
                r1 = this;
                r0 = 47
                int r0 = r2.lastIndexOf(r0)
                if (r0 < 0) goto Le
                int r0 = r0 + 1
                java.lang.String r2 = r2.substring(r0)
            Le:
                return r2
        }

        @Override // com.android.dx.cf.direct.ClassPathOpener.FileNameFilter
        public boolean accept(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = ".class"
                boolean r0 = r4.endsWith(r0)
                r1 = 1
                if (r0 == 0) goto L34
                java.lang.String r4 = com.android.dx.command.dexer.Main.access$900(r4)
                java.lang.String r0 = r3.getSimpleName(r4)
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r3.map
                java.lang.Object r0 = r2.get(r0)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L32
                java.util.Iterator r0 = r0.iterator()
            L1f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L32
                java.lang.Object r2 = r0.next()
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = r4.endsWith(r2)
                if (r2 == 0) goto L1f
                return r1
            L32:
                r4 = 0
                return r4
            L34:
                return r1
        }
    }

    public class ClassDefItemConsumer implements java.util.concurrent.Callable<java.lang.Boolean> {
        java.util.concurrent.Future<com.android.dx.dex.file.ClassDefItem> futureClazz;
        int maxFieldIdsInClass;
        int maxMethodIdsInClass;
        java.lang.String name;
        final /* synthetic */ com.android.dx.command.dexer.Main this$0;

        private ClassDefItemConsumer(com.android.dx.command.dexer.Main r1, java.lang.String r2, java.util.concurrent.Future<com.android.dx.dex.file.ClassDefItem> r3, int r4, int r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.name = r2
                r0.futureClazz = r3
                r0.maxMethodIdsInClass = r4
                r0.maxFieldIdsInClass = r5
                return
        }

        public /* synthetic */ ClassDefItemConsumer(com.android.dx.command.dexer.Main r1, java.lang.String r2, java.util.concurrent.Future r3, int r4, int r5, com.android.dx.command.dexer.Main.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() throws java.lang.Exception {
                r5 = this;
                java.util.concurrent.Future<com.android.dx.dex.file.ClassDefItem> r0 = r5.futureClazz     // Catch: java.lang.Throwable -> L16 java.util.concurrent.ExecutionException -> L18
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.ExecutionException -> L18
                com.android.dx.dex.file.ClassDefItem r0 = (com.android.dx.dex.file.ClassDefItem) r0     // Catch: java.lang.Throwable -> L16 java.util.concurrent.ExecutionException -> L18
                if (r0 == 0) goto L1a
                com.android.dx.command.dexer.Main r1 = r5.this$0     // Catch: java.lang.Throwable -> L16 java.util.concurrent.ExecutionException -> L18
                com.android.dx.command.dexer.Main.access$2800(r1, r0)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.ExecutionException -> L18
                com.android.dx.command.dexer.Main r0 = r5.this$0     // Catch: java.lang.Throwable -> L16 java.util.concurrent.ExecutionException -> L18
                r1 = 1
                com.android.dx.command.dexer.Main.access$2900(r0, r1)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.ExecutionException -> L18
                goto L1a
            L16:
                r0 = move-exception
                goto L60
            L18:
                r0 = move-exception
                goto L54
            L1a:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L16 java.util.concurrent.ExecutionException -> L18
                com.android.dx.command.dexer.Main r1 = r5.this$0
                com.android.dx.command.dexer.Main$Arguments r1 = com.android.dx.command.dexer.Main.access$1400(r1)
                boolean r1 = r1.multiDex
                if (r1 == 0) goto L53
                com.android.dx.command.dexer.Main r1 = r5.this$0
                java.lang.Object r1 = com.android.dx.command.dexer.Main.access$1700(r1)
                monitor-enter(r1)
                com.android.dx.command.dexer.Main r2 = r5.this$0     // Catch: java.lang.Throwable -> L50
                int r3 = com.android.dx.command.dexer.Main.access$1900(r2)     // Catch: java.lang.Throwable -> L50
                int r4 = r5.maxMethodIdsInClass     // Catch: java.lang.Throwable -> L50
                int r3 = r3 - r4
                com.android.dx.command.dexer.Main.access$1902(r2, r3)     // Catch: java.lang.Throwable -> L50
                com.android.dx.command.dexer.Main r2 = r5.this$0     // Catch: java.lang.Throwable -> L50
                int r3 = com.android.dx.command.dexer.Main.access$2000(r2)     // Catch: java.lang.Throwable -> L50
                int r4 = r5.maxFieldIdsInClass     // Catch: java.lang.Throwable -> L50
                int r3 = r3 - r4
                com.android.dx.command.dexer.Main.access$2002(r2, r3)     // Catch: java.lang.Throwable -> L50
                com.android.dx.command.dexer.Main r2 = r5.this$0     // Catch: java.lang.Throwable -> L50
                java.lang.Object r2 = com.android.dx.command.dexer.Main.access$1700(r2)     // Catch: java.lang.Throwable -> L50
                r2.notifyAll()     // Catch: java.lang.Throwable -> L50
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
                goto L53
            L50:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
                throw r0
            L53:
                return r0
            L54:
                java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L16
                boolean r2 = r1 instanceof java.lang.Exception     // Catch: java.lang.Throwable -> L16
                if (r2 == 0) goto L5f
                r0 = r1
                java.lang.Exception r0 = (java.lang.Exception) r0     // Catch: java.lang.Throwable -> L16
            L5f:
                throw r0     // Catch: java.lang.Throwable -> L16
            L60:
                com.android.dx.command.dexer.Main r1 = r5.this$0
                com.android.dx.command.dexer.Main$Arguments r1 = com.android.dx.command.dexer.Main.access$1400(r1)
                boolean r1 = r1.multiDex
                if (r1 == 0) goto L97
                com.android.dx.command.dexer.Main r1 = r5.this$0
                java.lang.Object r1 = com.android.dx.command.dexer.Main.access$1700(r1)
                monitor-enter(r1)
                com.android.dx.command.dexer.Main r2 = r5.this$0     // Catch: java.lang.Throwable -> L94
                int r3 = com.android.dx.command.dexer.Main.access$1900(r2)     // Catch: java.lang.Throwable -> L94
                int r4 = r5.maxMethodIdsInClass     // Catch: java.lang.Throwable -> L94
                int r3 = r3 - r4
                com.android.dx.command.dexer.Main.access$1902(r2, r3)     // Catch: java.lang.Throwable -> L94
                com.android.dx.command.dexer.Main r2 = r5.this$0     // Catch: java.lang.Throwable -> L94
                int r3 = com.android.dx.command.dexer.Main.access$2000(r2)     // Catch: java.lang.Throwable -> L94
                int r4 = r5.maxFieldIdsInClass     // Catch: java.lang.Throwable -> L94
                int r3 = r3 - r4
                com.android.dx.command.dexer.Main.access$2002(r2, r3)     // Catch: java.lang.Throwable -> L94
                com.android.dx.command.dexer.Main r2 = r5.this$0     // Catch: java.lang.Throwable -> L94
                java.lang.Object r2 = com.android.dx.command.dexer.Main.access$1700(r2)     // Catch: java.lang.Throwable -> L94
                r2.notifyAll()     // Catch: java.lang.Throwable -> L94
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L94
                goto L97
            L94:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L94
                throw r0
            L97:
                throw r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.lang.Boolean r0 = r1.call()
                return r0
        }
    }

    public class ClassParserTask implements java.util.concurrent.Callable<com.android.dx.cf.direct.DirectClassFile> {
        byte[] bytes;
        java.lang.String name;
        final /* synthetic */ com.android.dx.command.dexer.Main this$0;

        private ClassParserTask(com.android.dx.command.dexer.Main r1, java.lang.String r2, byte[] r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.name = r2
                r0.bytes = r3
                return
        }

        public /* synthetic */ ClassParserTask(com.android.dx.command.dexer.Main r1, java.lang.String r2, byte[] r3, com.android.dx.command.dexer.Main.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public com.android.dx.cf.direct.DirectClassFile call() throws java.lang.Exception {
                r3 = this;
                com.android.dx.command.dexer.Main r0 = r3.this$0
                java.lang.String r1 = r3.name
                byte[] r2 = r3.bytes
                com.android.dx.cf.direct.DirectClassFile r0 = com.android.dx.command.dexer.Main.access$1600(r0, r1, r2)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ com.android.dx.cf.direct.DirectClassFile call() throws java.lang.Exception {
                r1 = this;
                com.android.dx.cf.direct.DirectClassFile r0 = r1.call()
                return r0
        }
    }

    public class ClassTranslatorTask implements java.util.concurrent.Callable<com.android.dx.dex.file.ClassDefItem> {
        byte[] bytes;
        com.android.dx.cf.direct.DirectClassFile classFile;
        java.lang.String name;
        final /* synthetic */ com.android.dx.command.dexer.Main this$0;

        private ClassTranslatorTask(com.android.dx.command.dexer.Main r1, java.lang.String r2, byte[] r3, com.android.dx.cf.direct.DirectClassFile r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.name = r2
                r0.bytes = r3
                r0.classFile = r4
                return
        }

        public /* synthetic */ ClassTranslatorTask(com.android.dx.command.dexer.Main r1, java.lang.String r2, byte[] r3, com.android.dx.cf.direct.DirectClassFile r4, com.android.dx.command.dexer.Main.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public com.android.dx.dex.file.ClassDefItem call() {
                r3 = this;
                com.android.dx.command.dexer.Main r0 = r3.this$0
                byte[] r1 = r3.bytes
                com.android.dx.cf.direct.DirectClassFile r2 = r3.classFile
                com.android.dx.dex.file.ClassDefItem r0 = com.android.dx.command.dexer.Main.access$2700(r0, r1, r2)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ com.android.dx.dex.file.ClassDefItem call() throws java.lang.Exception {
                r1 = this;
                com.android.dx.dex.file.ClassDefItem r0 = r1.call()
                return r0
        }
    }

    public class DexWriter implements java.util.concurrent.Callable<byte[]> {
        private final com.android.dx.dex.file.DexFile dexFile;
        final /* synthetic */ com.android.dx.command.dexer.Main this$0;

        private DexWriter(com.android.dx.command.dexer.Main r1, com.android.dx.dex.file.DexFile r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.dexFile = r2
                return
        }

        public /* synthetic */ DexWriter(com.android.dx.command.dexer.Main r1, com.android.dx.dex.file.DexFile r2, com.android.dx.command.dexer.Main.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ byte[] call() throws java.lang.Exception {
                r1 = this;
                byte[] r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public byte[] call2() throws java.io.IOException {
                r2 = this;
                com.android.dx.command.dexer.Main r0 = r2.this$0
                com.android.dx.dex.file.DexFile r1 = r2.dexFile
                byte[] r0 = com.android.dx.command.dexer.Main.access$3000(r0, r1)
                return r0
        }
    }

    public class DirectClassFileConsumer implements java.util.concurrent.Callable<java.lang.Boolean> {
        byte[] bytes;
        java.util.concurrent.Future<com.android.dx.cf.direct.DirectClassFile> dcff;
        java.lang.String name;
        final /* synthetic */ com.android.dx.command.dexer.Main this$0;

        private DirectClassFileConsumer(com.android.dx.command.dexer.Main r1, java.lang.String r2, byte[] r3, java.util.concurrent.Future<com.android.dx.cf.direct.DirectClassFile> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.name = r2
                r0.bytes = r3
                r0.dcff = r4
                return
        }

        public /* synthetic */ DirectClassFileConsumer(com.android.dx.command.dexer.Main r1, java.lang.String r2, byte[] r3, java.util.concurrent.Future r4, com.android.dx.command.dexer.Main.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ java.lang.Boolean access$700(com.android.dx.command.dexer.Main.DirectClassFileConsumer r0, com.android.dx.cf.direct.DirectClassFile r1) {
                java.lang.Boolean r0 = r0.call(r1)
                return r0
        }

        private java.lang.Boolean call(com.android.dx.cf.direct.DirectClassFile r15) {
                r14 = this;
                com.android.dx.command.dexer.Main r0 = r14.this$0
                com.android.dx.command.dexer.Main$Arguments r0 = com.android.dx.command.dexer.Main.access$1400(r0)
                boolean r0 = r0.multiDex
                if (r0 == 0) goto L105
                com.android.dx.rop.cst.ConstantPool r0 = r15.getConstantPool()
                int r0 = r0.size()
                com.android.dx.cf.iface.MethodList r1 = r15.getMethods()
                int r1 = r1.size()
                int r1 = r1 + r0
                int r1 = r1 + 2
                com.android.dx.cf.iface.FieldList r2 = r15.getFields()
                int r2 = r2.size()
                int r0 = r0 + r2
                int r0 = r0 + 9
                com.android.dx.command.dexer.Main r2 = r14.this$0
                java.lang.Object r2 = com.android.dx.command.dexer.Main.access$1700(r2)
                monitor-enter(r2)
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                com.android.dx.dex.file.DexFile r3 = com.android.dx.command.dexer.Main.access$1800(r3)     // Catch: java.lang.Throwable -> L80
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L80
                com.android.dx.command.dexer.Main r4 = r14.this$0     // Catch: java.lang.Throwable -> L100
                com.android.dx.dex.file.DexFile r4 = com.android.dx.command.dexer.Main.access$1800(r4)     // Catch: java.lang.Throwable -> L100
                com.android.dx.dex.file.MethodIdsSection r4 = r4.getMethodIds()     // Catch: java.lang.Throwable -> L100
                java.util.Collection r4 = r4.items()     // Catch: java.lang.Throwable -> L100
                int r4 = r4.size()     // Catch: java.lang.Throwable -> L100
                com.android.dx.command.dexer.Main r5 = r14.this$0     // Catch: java.lang.Throwable -> L100
                com.android.dx.dex.file.DexFile r5 = com.android.dx.command.dexer.Main.access$1800(r5)     // Catch: java.lang.Throwable -> L100
                com.android.dx.dex.file.FieldIdsSection r5 = r5.getFieldIds()     // Catch: java.lang.Throwable -> L100
                java.util.Collection r5 = r5.items()     // Catch: java.lang.Throwable -> L100
                int r5 = r5.size()     // Catch: java.lang.Throwable -> L100
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L100
            L5b:
                int r4 = r4 + r1
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                int r3 = com.android.dx.command.dexer.Main.access$1900(r3)     // Catch: java.lang.Throwable -> L80
                int r4 = r4 + r3
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                com.android.dx.command.dexer.Main$Arguments r3 = com.android.dx.command.dexer.Main.access$1400(r3)     // Catch: java.lang.Throwable -> L80
                int r3 = r3.maxNumberOfIdxPerDex     // Catch: java.lang.Throwable -> L80
                if (r4 > r3) goto L83
                int r5 = r5 + r0
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                int r3 = com.android.dx.command.dexer.Main.access$2000(r3)     // Catch: java.lang.Throwable -> L80
                int r5 = r5 + r3
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                com.android.dx.command.dexer.Main$Arguments r3 = com.android.dx.command.dexer.Main.access$1400(r3)     // Catch: java.lang.Throwable -> L80
                int r3 = r3.maxNumberOfIdxPerDex     // Catch: java.lang.Throwable -> L80
                if (r5 <= r3) goto Lae
                goto L83
            L80:
                r15 = move-exception
                goto L103
            L83:
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                int r3 = com.android.dx.command.dexer.Main.access$1900(r3)     // Catch: java.lang.Throwable -> L80
                if (r3 > 0) goto Lc6
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                int r3 = com.android.dx.command.dexer.Main.access$2000(r3)     // Catch: java.lang.Throwable -> L80
                if (r3 <= 0) goto L94
                goto Lc6
            L94:
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                com.android.dx.dex.file.DexFile r3 = com.android.dx.command.dexer.Main.access$1800(r3)     // Catch: java.lang.Throwable -> L80
                com.android.dx.dex.file.ClassDefsSection r3 = r3.getClassDefs()     // Catch: java.lang.Throwable -> L80
                java.util.Collection r3 = r3.items()     // Catch: java.lang.Throwable -> L80
                int r3 = r3.size()     // Catch: java.lang.Throwable -> L80
                if (r3 <= 0) goto Lae
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                com.android.dx.command.dexer.Main.access$2100(r3)     // Catch: java.lang.Throwable -> L80
                goto Lcf
            Lae:
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                int r4 = com.android.dx.command.dexer.Main.access$1900(r3)     // Catch: java.lang.Throwable -> L80
                int r4 = r4 + r1
                com.android.dx.command.dexer.Main.access$1902(r3, r4)     // Catch: java.lang.Throwable -> L80
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                int r4 = com.android.dx.command.dexer.Main.access$2000(r3)     // Catch: java.lang.Throwable -> L80
                int r4 = r4 + r0
                com.android.dx.command.dexer.Main.access$2002(r3, r4)     // Catch: java.lang.Throwable -> L80
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
                r7 = r0
                r6 = r1
                goto L108
            Lc6:
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> Lcf
                java.lang.Object r3 = com.android.dx.command.dexer.Main.access$1700(r3)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> Lcf
                r3.wait()     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> Lcf
            Lcf:
                com.android.dx.command.dexer.Main r3 = r14.this$0     // Catch: java.lang.Throwable -> L80
                com.android.dx.dex.file.DexFile r3 = com.android.dx.command.dexer.Main.access$1800(r3)     // Catch: java.lang.Throwable -> L80
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L80
                com.android.dx.command.dexer.Main r4 = r14.this$0     // Catch: java.lang.Throwable -> Lfd
                com.android.dx.dex.file.DexFile r4 = com.android.dx.command.dexer.Main.access$1800(r4)     // Catch: java.lang.Throwable -> Lfd
                com.android.dx.dex.file.MethodIdsSection r4 = r4.getMethodIds()     // Catch: java.lang.Throwable -> Lfd
                java.util.Collection r4 = r4.items()     // Catch: java.lang.Throwable -> Lfd
                int r4 = r4.size()     // Catch: java.lang.Throwable -> Lfd
                com.android.dx.command.dexer.Main r5 = r14.this$0     // Catch: java.lang.Throwable -> Lfd
                com.android.dx.dex.file.DexFile r5 = com.android.dx.command.dexer.Main.access$1800(r5)     // Catch: java.lang.Throwable -> Lfd
                com.android.dx.dex.file.FieldIdsSection r5 = r5.getFieldIds()     // Catch: java.lang.Throwable -> Lfd
                java.util.Collection r5 = r5.items()     // Catch: java.lang.Throwable -> Lfd
                int r5 = r5.size()     // Catch: java.lang.Throwable -> Lfd
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lfd
                goto L5b
            Lfd:
                r15 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lfd
                throw r15     // Catch: java.lang.Throwable -> L80
            L100:
                r15 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L100
                throw r15     // Catch: java.lang.Throwable -> L80
            L103:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
                throw r15
            L105:
                r1 = 0
                r6 = r1
                r7 = r6
            L108:
                com.android.dx.command.dexer.Main r0 = r14.this$0
                java.util.concurrent.ExecutorService r0 = com.android.dx.command.dexer.Main.access$2300(r0)
                com.android.dx.command.dexer.Main$ClassTranslatorTask r1 = new com.android.dx.command.dexer.Main$ClassTranslatorTask
                com.android.dx.command.dexer.Main r9 = r14.this$0
                java.lang.String r10 = r14.name
                byte[] r11 = r14.bytes
                r13 = 0
                r8 = r1
                r12 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                java.util.concurrent.Future r5 = r0.submit(r1)
                com.android.dx.command.dexer.Main r15 = r14.this$0
                java.util.concurrent.ExecutorService r15 = com.android.dx.command.dexer.Main.access$2500(r15)
                com.android.dx.command.dexer.Main$ClassDefItemConsumer r0 = new com.android.dx.command.dexer.Main$ClassDefItemConsumer
                com.android.dx.command.dexer.Main r3 = r14.this$0
                java.lang.String r4 = r14.name
                r8 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                java.util.concurrent.Future r15 = r15.submit(r0)
                com.android.dx.command.dexer.Main r0 = r14.this$0
                java.util.List r0 = com.android.dx.command.dexer.Main.access$2600(r0)
                r0.add(r15)
                java.lang.Boolean r15 = java.lang.Boolean.TRUE
                return r15
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.util.concurrent.Future<com.android.dx.cf.direct.DirectClassFile> r0 = r1.dcff
                java.lang.Object r0 = r0.get()
                com.android.dx.cf.direct.DirectClassFile r0 = (com.android.dx.cf.direct.DirectClassFile) r0
                java.lang.Boolean r0 = r1.call(r0)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.lang.Boolean r0 = r1.call()
                return r0
        }
    }

    public class FileBytesConsumer implements com.android.dx.cf.direct.ClassPathOpener.Consumer {
        final /* synthetic */ com.android.dx.command.dexer.Main this$0;

        private FileBytesConsumer(com.android.dx.command.dexer.Main r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ FileBytesConsumer(com.android.dx.command.dexer.Main r1, com.android.dx.command.dexer.Main.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.cf.direct.ClassPathOpener.Consumer
        public void onException(java.lang.Exception r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.android.dx.command.dexer.Main.StopProcessing
                if (r0 != 0) goto L9e
                boolean r0 = r4 instanceof com.android.dx.cf.code.SimException
                if (r0 == 0) goto L47
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.err
                java.lang.String r1 = "\nEXCEPTION FROM SIMULATION:"
                r0.println(r1)
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.err
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r2 = "\n"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.err
                com.android.dx.cf.code.SimException r4 = (com.android.dx.cf.code.SimException) r4
                java.lang.String r4 = r4.getContext()
                r0.println(r4)
                goto L94
            L47:
                boolean r0 = r4 instanceof com.android.dx.cf.iface.ParseException
                if (r0 == 0) goto L7c
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.err
                java.lang.String r1 = "\nPARSE ERROR:"
                r0.println(r1)
                com.android.dx.cf.iface.ParseException r4 = (com.android.dx.cf.iface.ParseException) r4
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.Main$Arguments r0 = com.android.dx.command.dexer.Main.access$1400(r0)
                boolean r0 = r0.debug
                if (r0 == 0) goto L70
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.err
                r4.printStackTrace(r0)
                goto L94
            L70:
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.err
                r4.printContext(r0)
                goto L94
            L7c:
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.err
                java.lang.String r1 = "\nUNEXPECTED TOP-LEVEL EXCEPTION:"
                r0.println(r1)
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.err
                r4.printStackTrace(r0)
            L94:
                com.android.dx.command.dexer.Main r4 = r3.this$0
                java.util.concurrent.atomic.AtomicInteger r4 = com.android.dx.command.dexer.Main.access$1500(r4)
                r4.incrementAndGet()
                return
            L9e:
                com.android.dx.command.dexer.Main$StopProcessing r4 = (com.android.dx.command.dexer.Main.StopProcessing) r4
                throw r4
        }

        @Override // com.android.dx.cf.direct.ClassPathOpener.Consumer
        public void onProcessArchiveStart(java.io.File r4) {
                r3 = this;
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.Main$Arguments r0 = com.android.dx.command.dexer.Main.access$1400(r0)
                boolean r0 = r0.verbose
                if (r0 == 0) goto L2b
                com.android.dx.command.dexer.Main r0 = r3.this$0
                com.android.dx.command.dexer.DxContext r0 = com.android.dx.command.dexer.Main.access$1300(r0)
                java.io.PrintStream r0 = r0.out
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "processing archive "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = "..."
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.println(r4)
            L2b:
                return
        }

        @Override // com.android.dx.cf.direct.ClassPathOpener.Consumer
        public boolean processFileBytes(java.lang.String r2, long r3, byte[] r5) {
                r1 = this;
                com.android.dx.command.dexer.Main r0 = r1.this$0
                boolean r2 = com.android.dx.command.dexer.Main.access$1200(r0, r2, r3, r5)
                return r2
        }
    }

    public class MainDexListFilter implements com.android.dx.cf.direct.ClassPathOpener.FileNameFilter {
        final /* synthetic */ com.android.dx.command.dexer.Main this$0;

        private MainDexListFilter(com.android.dx.command.dexer.Main r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ MainDexListFilter(com.android.dx.command.dexer.Main r1, com.android.dx.command.dexer.Main.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.cf.direct.ClassPathOpener.FileNameFilter
        public boolean accept(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = ".class"
                boolean r0 = r2.endsWith(r0)
                if (r0 == 0) goto L17
                java.lang.String r2 = com.android.dx.command.dexer.Main.access$900(r2)
                com.android.dx.command.dexer.Main r0 = r1.this$0
                java.util.Set r0 = com.android.dx.command.dexer.Main.access$1000(r0)
                boolean r2 = r0.contains(r2)
                return r2
            L17:
                r2 = 1
                return r2
        }
    }

    public static class NotFilter implements com.android.dx.cf.direct.ClassPathOpener.FileNameFilter {
        private final com.android.dx.cf.direct.ClassPathOpener.FileNameFilter filter;

        private NotFilter(com.android.dx.cf.direct.ClassPathOpener.FileNameFilter r1) {
                r0 = this;
                r0.<init>()
                r0.filter = r1
                return
        }

        public /* synthetic */ NotFilter(com.android.dx.cf.direct.ClassPathOpener.FileNameFilter r1, com.android.dx.command.dexer.Main.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.cf.direct.ClassPathOpener.FileNameFilter
        public boolean accept(java.lang.String r2) {
                r1 = this;
                com.android.dx.cf.direct.ClassPathOpener$FileNameFilter r0 = r1.filter
                boolean r2 = r0.accept(r2)
                r2 = r2 ^ 1
                return r2
        }
    }

    public static class RemoveModuleInfoFilter implements com.android.dx.cf.direct.ClassPathOpener.FileNameFilter {
        protected final com.android.dx.cf.direct.ClassPathOpener.FileNameFilter delegate;

        public RemoveModuleInfoFilter(com.android.dx.cf.direct.ClassPathOpener.FileNameFilter r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // com.android.dx.cf.direct.ClassPathOpener.FileNameFilter
        public boolean accept(java.lang.String r2) {
                r1 = this;
                com.android.dx.cf.direct.ClassPathOpener$FileNameFilter r0 = r1.delegate
                boolean r0 = r0.accept(r2)
                if (r0 == 0) goto L12
                java.lang.String r0 = "module-info.class"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }
    }

    public static class StopProcessing extends java.lang.RuntimeException {
        private StopProcessing() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ StopProcessing(com.android.dx.command.dexer.Main.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.util.jar.Attributes$Name r0 = new java.util.jar.Attributes$Name
            java.lang.String r1 = "Created-By"
            r0.<init>(r1)
            com.android.dx.command.dexer.Main.CREATED_BY = r0
            java.lang.String r15 = "transaction"
            java.lang.String r16 = "xml"
            java.lang.String r2 = "accessibility"
            java.lang.String r3 = "crypto"
            java.lang.String r4 = "imageio"
            java.lang.String r5 = "management"
            java.lang.String r6 = "naming"
            java.lang.String r7 = "net"
            java.lang.String r8 = "print"
            java.lang.String r9 = "rmi"
            java.lang.String r10 = "security"
            java.lang.String r11 = "sip"
            java.lang.String r12 = "sound"
            java.lang.String r13 = "sql"
            java.lang.String r14 = "swing"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            com.android.dx.command.dexer.Main.JAVAX_CORE = r0
            return
    }

    public Main(com.android.dx.command.dexer.DxContext r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.errors = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.libraryDexBuffers = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.addToDexFutures = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dexOutputFutures = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.dexRotationLock = r0
            r2.maxMethodIdsInProcess = r1
            r2.maxFieldIdsInProcess = r1
            r0 = 0
            r2.minimumFileAge = r0
            r0 = 0
            r2.classesInMainDex = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.dexOutputArrays = r1
            r2.humanOutWriter = r0
            r2.context = r3
            return
    }

    public static /* synthetic */ java.util.Set access$1000(com.android.dx.command.dexer.Main r0) {
            java.util.Set<java.lang.String> r0 = r0.classesInMainDex
            return r0
    }

    public static /* synthetic */ void access$1100(java.lang.String r0, java.util.Collection r1) throws java.io.IOException {
            readPathsFromFile(r0, r1)
            return
    }

    public static /* synthetic */ boolean access$1200(com.android.dx.command.dexer.Main r0, java.lang.String r1, long r2, byte[] r4) {
            boolean r0 = r0.processFileBytes(r1, r2, r4)
            return r0
    }

    public static /* synthetic */ com.android.dx.command.dexer.DxContext access$1300(com.android.dx.command.dexer.Main r0) {
            com.android.dx.command.dexer.DxContext r0 = r0.context
            return r0
    }

    public static /* synthetic */ com.android.dx.command.dexer.Main.Arguments access$1400(com.android.dx.command.dexer.Main r0) {
            com.android.dx.command.dexer.Main$Arguments r0 = r0.args
            return r0
    }

    public static /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$1500(com.android.dx.command.dexer.Main r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.errors
            return r0
    }

    public static /* synthetic */ com.android.dx.cf.direct.DirectClassFile access$1600(com.android.dx.command.dexer.Main r0, java.lang.String r1, byte[] r2) {
            com.android.dx.cf.direct.DirectClassFile r0 = r0.parseClass(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object access$1700(com.android.dx.command.dexer.Main r0) {
            java.lang.Object r0 = r0.dexRotationLock
            return r0
    }

    public static /* synthetic */ com.android.dx.dex.file.DexFile access$1800(com.android.dx.command.dexer.Main r0) {
            com.android.dx.dex.file.DexFile r0 = r0.outputDex
            return r0
    }

    public static /* synthetic */ int access$1900(com.android.dx.command.dexer.Main r0) {
            int r0 = r0.maxMethodIdsInProcess
            return r0
    }

    public static /* synthetic */ int access$1902(com.android.dx.command.dexer.Main r0, int r1) {
            r0.maxMethodIdsInProcess = r1
            return r1
    }

    public static /* synthetic */ int access$2000(com.android.dx.command.dexer.Main r0) {
            int r0 = r0.maxFieldIdsInProcess
            return r0
    }

    public static /* synthetic */ int access$2002(com.android.dx.command.dexer.Main r0, int r1) {
            r0.maxFieldIdsInProcess = r1
            return r1
    }

    public static /* synthetic */ void access$2100(com.android.dx.command.dexer.Main r0) {
            r0.rotateDexFile()
            return
    }

    public static /* synthetic */ java.util.concurrent.ExecutorService access$2300(com.android.dx.command.dexer.Main r0) {
            java.util.concurrent.ExecutorService r0 = r0.classTranslatorPool
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ExecutorService access$2500(com.android.dx.command.dexer.Main r0) {
            java.util.concurrent.ExecutorService r0 = r0.classDefItemConsumer
            return r0
    }

    public static /* synthetic */ java.util.List access$2600(com.android.dx.command.dexer.Main r0) {
            java.util.List<java.util.concurrent.Future<java.lang.Boolean>> r0 = r0.addToDexFutures
            return r0
    }

    public static /* synthetic */ com.android.dx.dex.file.ClassDefItem access$2700(com.android.dx.command.dexer.Main r0, byte[] r1, com.android.dx.cf.direct.DirectClassFile r2) {
            com.android.dx.dex.file.ClassDefItem r0 = r0.translateClass(r1, r2)
            return r0
    }

    public static /* synthetic */ boolean access$2800(com.android.dx.command.dexer.Main r0, com.android.dx.dex.file.ClassDefItem r1) {
            boolean r0 = r0.addClassToDex(r1)
            return r0
    }

    public static /* synthetic */ void access$2900(com.android.dx.command.dexer.Main r0, boolean r1) {
            r0.updateStatus(r1)
            return
    }

    public static /* synthetic */ byte[] access$3000(com.android.dx.command.dexer.Main r0, com.android.dx.dex.file.DexFile r1) {
            byte[] r0 = r0.writeDex(r1)
            return r0
    }

    public static /* synthetic */ java.lang.String access$900(java.lang.String r0) {
            java.lang.String r0 = fixPath(r0)
            return r0
    }

    private boolean addClassToDex(com.android.dx.dex.file.ClassDefItem r3) {
            r2 = this;
            com.android.dx.dex.file.DexFile r0 = r2.outputDex
            monitor-enter(r0)
            com.android.dx.dex.file.DexFile r1 = r2.outputDex     // Catch: java.lang.Throwable -> Lb
            r1.add(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            r3 = 1
            return r3
        Lb:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    private void checkClassName(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "java/"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "javax/"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L26
            r0 = 47
            r1 = 6
            int r0 = r4.indexOf(r0, r1)
            r2 = -1
            if (r0 == r2) goto L27
            java.lang.String r0 = r4.substring(r1, r0)
            java.lang.String[] r1 = com.android.dx.command.dexer.Main.JAVAX_CORE
            int r0 = java.util.Arrays.binarySearch(r1, r0)
            if (r0 >= 0) goto L27
        L26:
            return
        L27:
            com.android.dx.command.dexer.DxContext r0 = r3.context
            java.io.PrintStream r0 = r0.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\ntrouble processing \""
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "\":\n\n"
            r1.append(r4)
            java.lang.String r4 = "Ill-advised or mistaken usage of a core class (java.* or javax.*)\nwhen not building a core library.\n\nThis is often due to inadvertently including a core library file\nin your application's project, when using an IDE (such as\nEclipse). If you are sure you're not intentionally defining a\ncore class, then this is the most likely explanation of what's\ngoing on.\n\nHowever, you might actually be trying to define a class in a core\nnamespace, the source of which you may have taken, for example,\nfrom a non-Android virtual machine project. This will most\nassuredly not work. At a minimum, it jeopardizes the\ncompatibility of your app with future versions of the platform.\nIt is also often of questionable legality.\n\nIf you really intend to build a core library -- which is only\nappropriate as part of creating a full virtual machine\ndistribution, as opposed to compiling an application -- then use\nthe \"--core-library\" option to suppress this error message.\n\nIf you go ahead and use \"--core-library\" but are in fact\nbuilding an application, then be forewarned that your application\nwill still fail to build or run, at some point. Please be\nprepared for angry customers who find, for example, that your\napplication ceases to function once they upgrade their operating\nsystem. You will be to blame for this problem.\n\nIf you are legitimately using some code that happens to be in a\ncore package, then the easiest safe alternative you have is to\nrepackage that code. That is, move the classes in question into\nyour own package namespace. This means that they will never be in\nconflict with core system classes. JarJar is a tool that may help\nyou in this endeavor. If you find that you cannot do this, then\nthat is an indication that the path you are on will ultimately\nlead to pain, suffering, grief, and lamentation.\n"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = r3.errors
            r4.incrementAndGet()
            com.android.dx.command.dexer.Main$StopProcessing r4 = new com.android.dx.command.dexer.Main$StopProcessing
            r0 = 0
            r4.<init>(r0)
            throw r4
    }

    public static void clearInternTables() {
            com.android.dx.rop.type.Prototype.clearInternTable()
            com.android.dx.rop.code.RegisterSpec.clearInternTable()
            com.android.dx.rop.cst.CstType.clearInternTable()
            com.android.dx.rop.type.Type.clearInternTable()
            return
    }

    private void closeOutput(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r2.flush()
            com.android.dx.command.dexer.DxContext r0 = r1.context
            java.io.PrintStream r0 = r0.out
            if (r2 == r0) goto Lf
            r2.close()
        Lf:
            return
    }

    private void createDexFile() {
            r2 = this;
            com.android.dx.dex.file.DexFile r0 = new com.android.dx.dex.file.DexFile
            com.android.dx.command.dexer.Main$Arguments r1 = r2.args
            com.android.dx.dex.DexOptions r1 = r1.dexOptions
            r0.<init>(r1)
            r2.outputDex = r0
            com.android.dx.command.dexer.Main$Arguments r1 = r2.args
            int r1 = r1.dumpWidth
            if (r1 == 0) goto L14
            r0.setDumpWidth(r1)
        L14:
            return
    }

    private boolean createJar(java.lang.String r10) {
            r9 = this;
            java.util.jar.Manifest r0 = r9.makeManifest()     // Catch: java.lang.Exception -> L7c
            java.io.OutputStream r10 = r9.openOutput(r10)     // Catch: java.lang.Exception -> L7c
            java.util.jar.JarOutputStream r1 = new java.util.jar.JarOutputStream     // Catch: java.lang.Exception -> L7c
            r1.<init>(r10, r0)     // Catch: java.lang.Exception -> L7c
            java.util.TreeMap<java.lang.String, byte[]> r0 = r9.outputResources     // Catch: java.lang.Throwable -> L61
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L61
        L17:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L71
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L61
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L61
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L61
            java.util.jar.JarEntry r4 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> L61
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L61
            int r5 = r2.length     // Catch: java.lang.Throwable -> L61
            com.android.dx.command.dexer.Main$Arguments r6 = r9.args     // Catch: java.lang.Throwable -> L61
            boolean r6 = r6.verbose     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L63
            com.android.dx.command.dexer.DxContext r6 = r9.context     // Catch: java.lang.Throwable -> L61
            java.io.PrintStream r6 = r6.out     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r7.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = "writing "
            r7.append(r8)     // Catch: java.lang.Throwable -> L61
            r7.append(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "; size "
            r7.append(r3)     // Catch: java.lang.Throwable -> L61
            r7.append(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "..."
            r7.append(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L61
            r6.println(r3)     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r0 = move-exception
            goto L7e
        L63:
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L61
            r4.setSize(r5)     // Catch: java.lang.Throwable -> L61
            r1.putNextEntry(r4)     // Catch: java.lang.Throwable -> L61
            r1.write(r2)     // Catch: java.lang.Throwable -> L61
            r1.closeEntry()     // Catch: java.lang.Throwable -> L61
            goto L17
        L71:
            r1.finish()     // Catch: java.lang.Exception -> L7c
            r1.flush()     // Catch: java.lang.Exception -> L7c
            r9.closeOutput(r10)     // Catch: java.lang.Exception -> L7c
            r10 = 1
            return r10
        L7c:
            r10 = move-exception
            goto L88
        L7e:
            r1.finish()     // Catch: java.lang.Exception -> L7c
            r1.flush()     // Catch: java.lang.Exception -> L7c
            r9.closeOutput(r10)     // Catch: java.lang.Exception -> L7c
            throw r0     // Catch: java.lang.Exception -> L7c
        L88:
            com.android.dx.command.dexer.Main$Arguments r0 = r9.args
            boolean r0 = r0.debug
            if (r0 == 0) goto L9f
            com.android.dx.command.dexer.DxContext r0 = r9.context
            java.io.PrintStream r0 = r0.err
            java.lang.String r1 = "\ntrouble writing output:"
            r0.println(r1)
            com.android.dx.command.dexer.DxContext r0 = r9.context
            java.io.PrintStream r0 = r0.err
            r10.printStackTrace(r0)
            goto Lbb
        L9f:
            com.android.dx.command.dexer.DxContext r0 = r9.context
            java.io.PrintStream r0 = r0.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\ntrouble writing output: "
            r1.append(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.println(r10)
        Lbb:
            r10 = 0
            return r10
    }

    private void dumpMethod(com.android.dx.dex.file.DexFile r9, java.lang.String r10, java.io.OutputStreamWriter r11) {
            r8 = this;
            java.lang.String r0 = "*"
            boolean r0 = r10.endsWith(r0)
            r1 = 46
            int r2 = r10.lastIndexOf(r1)
            if (r2 <= 0) goto L184
            int r3 = r10.length()
            int r3 = r3 + (-1)
            if (r2 != r3) goto L18
            goto L184
        L18:
            r3 = 0
            java.lang.String r4 = r10.substring(r3, r2)
            r5 = 47
            java.lang.String r1 = r4.replace(r1, r5)
            int r2 = r2 + 1
            java.lang.String r2 = r10.substring(r2)
            com.android.dx.dex.file.ClassDefItem r9 = r9.getClassOrNull(r1)
            if (r9 != 0) goto L48
            com.android.dx.command.dexer.DxContext r9 = r8.context
            java.io.PrintStream r9 = r9.err
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "no such class: "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r9.println(r10)
            return
        L48:
            if (r0 == 0) goto L54
            int r1 = r2.length()
            int r1 = r1 + (-1)
            java.lang.String r2 = r2.substring(r3, r1)
        L54:
            java.util.ArrayList r1 = r9.getMethods()
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L61:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L91
            java.lang.Object r5 = r1.next()
            com.android.dx.dex.file.EncodedMethod r5 = (com.android.dx.dex.file.EncodedMethod) r5
            com.android.dx.rop.cst.CstString r6 = r5.getName()
            java.lang.String r6 = r6.getString()
            if (r0 == 0) goto L7d
            boolean r7 = r6.startsWith(r2)
            if (r7 != 0) goto L85
        L7d:
            if (r0 != 0) goto L61
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L61
        L85:
            com.android.dx.rop.cst.CstMethodRef r6 = r5.getRef()
            com.android.dx.rop.cst.CstNat r6 = r6.getNat()
            r4.put(r6, r5)
            goto L61
        L91:
            int r0 = r4.size()
            if (r0 != 0) goto Lb0
            com.android.dx.command.dexer.DxContext r9 = r8.context
            java.io.PrintStream r9 = r9.err
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "no such method: "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.println(r10)
            return
        Lb0:
            java.io.PrintWriter r10 = new java.io.PrintWriter
            r10.<init>(r11)
            java.util.Collection r11 = r4.values()
            java.util.Iterator r11 = r11.iterator()
        Lbd:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L180
            java.lang.Object r0 = r11.next()
            com.android.dx.dex.file.EncodedMethod r0 = (com.android.dx.dex.file.EncodedMethod) r0
            com.android.dx.command.dexer.Main$Arguments r1 = r8.args
            boolean r1 = r1.verboseDump
            r0.debugPrint(r10, r1)
            com.android.dx.rop.cst.CstString r1 = r9.getSourceFile()
            if (r1 == 0) goto Lee
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "  source file: "
            r2.append(r4)
            java.lang.String r1 = r1.toQuoted()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r10.println(r1)
        Lee:
            com.android.dx.rop.cst.CstMethodRef r1 = r0.getRef()
            com.android.dx.rop.annotation.Annotations r1 = r9.getMethodAnnotations(r1)
            com.android.dx.rop.cst.CstMethodRef r0 = r0.getRef()
            com.android.dx.rop.annotation.AnnotationsList r0 = r9.getParameterAnnotations(r0)
            if (r1 == 0) goto L12e
            java.lang.String r2 = "  method annotations:"
            r10.println(r2)
            java.util.Collection r1 = r1.getAnnotations()
            java.util.Iterator r1 = r1.iterator()
        L10d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L12e
            java.lang.Object r2 = r1.next()
            com.android.dx.rop.annotation.Annotation r2 = (com.android.dx.rop.annotation.Annotation) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "    "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r10.println(r2)
            goto L10d
        L12e:
            if (r0 == 0) goto Lbd
            java.lang.String r1 = "  parameter annotations:"
            r10.println(r1)
            int r1 = r0.size()
            r2 = r3
        L13a:
            if (r2 >= r1) goto Lbd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "    parameter "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r10.println(r4)
            com.android.dx.rop.annotation.Annotations r4 = r0.get(r2)
            java.util.Collection r4 = r4.getAnnotations()
            java.util.Iterator r4 = r4.iterator()
        L15c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L17d
            java.lang.Object r5 = r4.next()
            com.android.dx.rop.annotation.Annotation r5 = (com.android.dx.rop.annotation.Annotation) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "      "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r10.println(r5)
            goto L15c
        L17d:
            int r2 = r2 + 1
            goto L13a
        L180:
            r10.flush()
            return
        L184:
            com.android.dx.command.dexer.DxContext r9 = r8.context
            java.io.PrintStream r9 = r9.err
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "bogus fully-qualified method name: "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.println(r10)
            return
    }

    private static java.lang.String fixPath(java.lang.String r2) {
            char r0 = java.io.File.separatorChar
            r1 = 92
            if (r0 != r1) goto Lc
            r0 = 47
            java.lang.String r2 = r2.replace(r1, r0)
        Lc:
            java.lang.String r0 = "/./"
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto L1c
            int r0 = r0 + 3
            java.lang.String r2 = r2.substring(r0)
            return r2
        L1c:
            java.lang.String r0 = "./"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L29
            r0 = 2
            java.lang.String r2 = r2.substring(r0)
        L29:
            return r2
    }

    private static java.lang.String getDexFileName(int r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "classes.dex"
            return r2
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "classes"
            r0.append(r1)
            int r2 = r2 + 1
            r0.append(r2)
            java.lang.String r2 = ".dex"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static void main(java.lang.String[] r2) throws java.io.IOException {
            com.android.dx.command.dexer.DxContext r0 = new com.android.dx.command.dexer.DxContext
            r0.<init>()
            com.android.dx.command.dexer.Main$Arguments r1 = new com.android.dx.command.dexer.Main$Arguments
            r1.<init>(r0)
            com.android.dx.command.dexer.Main.Arguments.access$000(r1, r2)
            com.android.dx.command.dexer.Main r2 = new com.android.dx.command.dexer.Main
            r2.<init>(r0)
            int r2 = r2.runDx(r1)
            if (r2 == 0) goto L1b
            java.lang.System.exit(r2)
        L1b:
            return
    }

    private java.util.jar.Manifest makeManifest() throws java.io.IOException {
            r5 = this;
            java.util.TreeMap<java.lang.String, byte[]> r0 = r5.outputResources
            java.lang.String r1 = "META-INF/MANIFEST.MF"
            java.lang.Object r0 = r0.get(r1)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L1d
            java.util.jar.Manifest r0 = new java.util.jar.Manifest
            r0.<init>()
            java.util.jar.Attributes r1 = r0.getMainAttributes()
            java.util.jar.Attributes$Name r2 = java.util.jar.Attributes.Name.MANIFEST_VERSION
            java.lang.String r3 = "1.0"
            r1.put(r2, r3)
            goto L32
        L1d:
            java.util.jar.Manifest r2 = new java.util.jar.Manifest
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r0)
            r2.<init>(r3)
            java.util.jar.Attributes r0 = r2.getMainAttributes()
            java.util.TreeMap<java.lang.String, byte[]> r3 = r5.outputResources
            r3.remove(r1)
            r1 = r0
            r0 = r2
        L32:
            java.util.jar.Attributes$Name r2 = com.android.dx.command.dexer.Main.CREATED_BY
            java.lang.String r3 = r1.getValue(r2)
            if (r3 != 0) goto L3d
            java.lang.String r3 = ""
            goto L4e
        L3d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " + "
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "dx 1.16"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r1.put(r2, r3)
            java.lang.String r2 = "Dex-Location"
            java.lang.String r3 = "classes.dex"
            r1.putValue(r2, r3)
            return r0
    }

    private byte[] mergeIncremental(byte[] r3, java.io.File r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            com.android.dex.Dex r1 = new com.android.dex.Dex
            r1.<init>(r3)
            goto La
        L9:
            r1 = r0
        La:
            boolean r3 = r4.exists()
            if (r3 == 0) goto L16
            com.android.dex.Dex r3 = new com.android.dex.Dex
            r3.<init>(r4)
            goto L17
        L16:
            r3 = r0
        L17:
            if (r1 != 0) goto L1c
            if (r3 != 0) goto L1c
            return r0
        L1c:
            if (r1 != 0) goto L20
            r1 = r3
            goto L34
        L20:
            if (r3 != 0) goto L23
            goto L34
        L23:
            com.android.dx.merge.DexMerger r4 = new com.android.dx.merge.DexMerger
            com.android.dex.Dex[] r3 = new com.android.dex.Dex[]{r1, r3}
            com.android.dx.merge.CollisionPolicy r0 = com.android.dx.merge.CollisionPolicy.KEEP_FIRST
            com.android.dx.command.dexer.DxContext r1 = r2.context
            r4.<init>(r3, r0, r1)
            com.android.dex.Dex r1 = r4.merge()
        L34:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r1.writeTo(r3)
            byte[] r3 = r3.toByteArray()
            return r3
    }

    private byte[] mergeLibraryDexBuffers(byte[] r4) throws java.io.IOException {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto Lf
            com.android.dex.Dex r1 = new com.android.dex.Dex
            r1.<init>(r4)
            r0.add(r1)
        Lf:
            java.util.List<byte[]> r4 = r3.libraryDexBuffers
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r4.next()
            byte[] r1 = (byte[]) r1
            com.android.dex.Dex r2 = new com.android.dex.Dex
            r2.<init>(r1)
            r0.add(r2)
            goto L15
        L2a:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L32
            r4 = 0
            return r4
        L32:
            com.android.dx.merge.DexMerger r4 = new com.android.dx.merge.DexMerger
            int r1 = r0.size()
            com.android.dex.Dex[] r1 = new com.android.dex.Dex[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.android.dex.Dex[] r0 = (com.android.dex.Dex[]) r0
            com.android.dx.merge.CollisionPolicy r1 = com.android.dx.merge.CollisionPolicy.FAIL
            com.android.dx.command.dexer.DxContext r2 = r3.context
            r4.<init>(r0, r1, r2)
            com.android.dex.Dex r4 = r4.merge()
            byte[] r4 = r4.getBytes()
            return r4
    }

    private java.io.OutputStream openOutput(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "-"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "-."
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L11
            goto L17
        L11:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            return r0
        L17:
            com.android.dx.command.dexer.DxContext r2 = r1.context
            java.io.PrintStream r2 = r2.out
            return r2
    }

    private com.android.dx.cf.direct.DirectClassFile parseClass(java.lang.String r3, byte[] r4) {
            r2 = this;
            com.android.dx.cf.direct.DirectClassFile r0 = new com.android.dx.cf.direct.DirectClassFile
            com.android.dx.command.dexer.Main$Arguments r1 = r2.args
            com.android.dx.dex.cf.CfOptions r1 = r1.cfOptions
            boolean r1 = r1.strictNameCheck
            r0.<init>(r4, r3, r1)
            com.android.dx.cf.direct.StdAttributeFactory r3 = com.android.dx.cf.direct.StdAttributeFactory.THE_ONE
            r0.setAttributeFactory(r3)
            r0.getMagic()
            return r0
    }

    private boolean processAllFiles() {
            r12 = this;
            r12.createDexFile()
            com.android.dx.command.dexer.Main$Arguments r0 = r12.args
            boolean r0 = r0.jarOutput
            if (r0 == 0) goto L10
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r12.outputResources = r0
        L10:
            r0 = 0
            r12.anyFilesProcessed = r0
            com.android.dx.command.dexer.Main$Arguments r1 = r12.args
            java.lang.String[] r1 = r1.fileNames
            java.util.Arrays.sort(r1)
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            com.android.dx.command.dexer.Main$Arguments r2 = r12.args
            int r4 = r2.numThreads
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ArrayBlockingQueue r8 = new java.util.concurrent.ArrayBlockingQueue
            com.android.dx.command.dexer.Main$Arguments r2 = r12.args
            int r2 = r2.numThreads
            int r2 = r2 * 2
            r11 = 1
            r8.<init>(r2, r11)
            java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy r9 = new java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy
            r9.<init>()
            r5 = 0
            r2 = r10
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r12.classTranslatorPool = r10
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r12.classDefItemConsumer = r2
            com.android.dx.command.dexer.Main$Arguments r2 = r12.args     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            java.lang.String r3 = r2.mainDexListFile     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            if (r3 == 0) goto Lab
            boolean r2 = r2.strictNameCheck     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r3 = 0
            if (r2 == 0) goto L53
            com.android.dx.command.dexer.Main$MainDexListFilter r2 = new com.android.dx.command.dexer.Main$MainDexListFilter     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r2.<init>(r12, r3)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            goto L58
        L53:
            com.android.dx.command.dexer.Main$BestEffortMainDexListFilter r2 = new com.android.dx.command.dexer.Main$BestEffortMainDexListFilter     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r2.<init>(r12)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
        L58:
            r4 = r0
        L59:
            int r5 = r1.length     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            if (r4 >= r5) goto L64
            r5 = r1[r4]     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r12.processOne(r5, r2)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            int r4 = r4 + 1
            goto L59
        L64:
            java.util.List<java.util.concurrent.Future<byte[]>> r4 = r12.dexOutputFutures     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            int r4 = r4.size()     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            if (r4 > 0) goto La3
            com.android.dx.command.dexer.Main$Arguments r4 = r12.args     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            boolean r4 = r4.minimalMainDex     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            if (r4 == 0) goto L8d
            java.lang.Object r4 = r12.dexRotationLock     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            monitor-enter(r4)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
        L75:
            int r5 = r12.maxMethodIdsInProcess     // Catch: java.lang.Throwable -> L83
            if (r5 > 0) goto L85
            int r5 = r12.maxFieldIdsInProcess     // Catch: java.lang.Throwable -> L83
            if (r5 <= 0) goto L7e
            goto L85
        L7e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            r12.rotateDexFile()     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            goto L8d
        L83:
            r1 = move-exception
            goto L8b
        L85:
            java.lang.Object r5 = r12.dexRotationLock     // Catch: java.lang.InterruptedException -> L75 java.lang.Throwable -> L83
            r5.wait()     // Catch: java.lang.InterruptedException -> L75 java.lang.Throwable -> L83
            goto L75
        L8b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            throw r1     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
        L8d:
            com.android.dx.command.dexer.Main$RemoveModuleInfoFilter r4 = new com.android.dx.command.dexer.Main$RemoveModuleInfoFilter     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            com.android.dx.command.dexer.Main$NotFilter r5 = new com.android.dx.command.dexer.Main$NotFilter     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r5.<init>(r2, r3)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r4.<init>(r5)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r2 = r0
        L98:
            int r3 = r1.length     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            if (r2 >= r3) goto Lbe
            r3 = r1[r2]     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r12.processOne(r3, r4)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            int r2 = r2 + 1
            goto L98
        La3:
            com.android.dex.DexException r1 = new com.android.dex.DexException     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            java.lang.String r2 = "Too many classes in --main-dex-list, main dex capacity exceeded"
            r1.<init>(r2)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            throw r1     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
        Lab:
            com.android.dx.command.dexer.Main$RemoveModuleInfoFilter r2 = new com.android.dx.command.dexer.Main$RemoveModuleInfoFilter     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            com.android.dx.cf.direct.ClassPathOpener$FileNameFilter r3 = com.android.dx.cf.direct.ClassPathOpener.acceptAll     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r2.<init>(r3)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r3 = r0
        Lb3:
            int r4 = r1.length     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            if (r3 >= r4) goto Lbe
            r4 = r1[r3]     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            r12.processOne(r4, r2)     // Catch: com.android.dx.command.dexer.Main.StopProcessing -> Lbe
            int r3 = r3 + 1
            goto Lb3
        Lbe:
            java.util.concurrent.ExecutorService r1 = r12.classTranslatorPool     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r1.shutdown()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.util.concurrent.ExecutorService r1 = r12.classTranslatorPool     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r3 = 600(0x258, double:2.964E-321)
            r1.awaitTermination(r3, r2)     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.util.concurrent.ExecutorService r1 = r12.classDefItemConsumer     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r1.shutdown()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.util.concurrent.ExecutorService r1 = r12.classDefItemConsumer     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r1.awaitTermination(r3, r2)     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.util.List<java.util.concurrent.Future<java.lang.Boolean>> r1 = r12.addToDexFutures     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
        Ldc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            if (r2 == 0) goto L13d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r2.get()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef java.util.concurrent.ExecutionException -> Lf2
            goto Ldc
        Lec:
            r0 = move-exception
            goto L1a0
        Lef:
            r0 = move-exception
            goto L1b9
        Lf2:
            r2 = move-exception
            java.util.concurrent.atomic.AtomicInteger r3 = r12.errors     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            int r3 = r3.incrementAndGet()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r4 = 10
            if (r3 >= r4) goto L135
            com.android.dx.command.dexer.Main$Arguments r3 = r12.args     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            boolean r3 = r3.debug     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            if (r3 == 0) goto L118
            com.android.dx.command.dexer.DxContext r3 = r12.context     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.io.PrintStream r3 = r3.err     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.lang.String r4 = "Uncaught translation error:"
            r3.println(r4)     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            com.android.dx.command.dexer.DxContext r3 = r12.context     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.io.PrintStream r3 = r3.err     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r2.printStackTrace(r3)     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            goto Ldc
        L118:
            com.android.dx.command.dexer.DxContext r3 = r12.context     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.io.PrintStream r3 = r3.err     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r4.<init>()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.lang.String r5 = "Uncaught translation error: "
            r4.append(r5)     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r4.append(r2)     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            r3.println(r2)     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            goto Ldc
        L135:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            java.lang.String r1 = "Too many errors"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
            throw r0     // Catch: java.lang.Exception -> Lec java.lang.InterruptedException -> Lef
        L13d:
            java.util.concurrent.atomic.AtomicInteger r1 = r12.errors
            int r1 = r1.get()
            if (r1 == 0) goto L16d
            com.android.dx.command.dexer.DxContext r2 = r12.context
            java.io.PrintStream r2 = r2.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " error"
            r3.append(r4)
            if (r1 != r11) goto L15b
            java.lang.String r1 = ""
            goto L15d
        L15b:
            java.lang.String r1 = "s"
        L15d:
            r3.append(r1)
            java.lang.String r1 = "; aborting"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            return r0
        L16d:
            com.android.dx.command.dexer.Main$Arguments r1 = r12.args
            boolean r1 = r1.incremental
            if (r1 == 0) goto L178
            boolean r1 = r12.anyFilesProcessed
            if (r1 != 0) goto L178
            return r11
        L178:
            boolean r1 = r12.anyFilesProcessed
            if (r1 != 0) goto L18c
            com.android.dx.command.dexer.Main$Arguments r1 = r12.args
            boolean r1 = r1.emptyOk
            if (r1 != 0) goto L18c
            com.android.dx.command.dexer.DxContext r1 = r12.context
            java.io.PrintStream r1 = r1.err
            java.lang.String r2 = "no classfiles specified"
            r1.println(r2)
            return r0
        L18c:
            com.android.dx.command.dexer.Main$Arguments r0 = r12.args
            boolean r1 = r0.optimize
            if (r1 == 0) goto L19f
            boolean r0 = r0.statistics
            if (r0 == 0) goto L19f
            com.android.dx.command.dexer.DxContext r0 = r12.context
            com.android.dx.dex.cf.CodeStatistics r1 = r0.codeStatistics
            java.io.PrintStream r0 = r0.out
            r1.dumpStatistics(r0)
        L19f:
            return r11
        L1a0:
            java.util.concurrent.ExecutorService r1 = r12.classTranslatorPool
            r1.shutdownNow()
            java.util.concurrent.ExecutorService r1 = r12.classDefItemConsumer
            r1.shutdownNow()
            com.android.dx.command.dexer.DxContext r1 = r12.context
            java.io.PrintStream r1 = r1.out
            r0.printStackTrace(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception in translator thread."
            r1.<init>(r2, r0)
            throw r1
        L1b9:
            java.util.concurrent.ExecutorService r1 = r12.classTranslatorPool
            r1.shutdownNow()
            java.util.concurrent.ExecutorService r1 = r12.classDefItemConsumer
            r1.shutdownNow()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Translation has been interrupted"
            r1.<init>(r2, r0)
            throw r1
    }

    private boolean processClass(java.lang.String r8, byte[] r9) {
            r7 = this;
            com.android.dx.command.dexer.Main$Arguments r0 = r7.args
            boolean r0 = r0.coreLibrary
            if (r0 != 0) goto L9
            r7.checkClassName(r8)
        L9:
            com.android.dx.command.dexer.Main$DirectClassFileConsumer r0 = new com.android.dx.command.dexer.Main$DirectClassFileConsumer     // Catch: java.lang.Exception -> L23 com.android.dx.cf.iface.ParseException -> L25
            r5 = 0
            r6 = 0
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L23 com.android.dx.cf.iface.ParseException -> L25
            com.android.dx.command.dexer.Main$ClassParserTask r1 = new com.android.dx.command.dexer.Main$ClassParserTask     // Catch: java.lang.Exception -> L23 com.android.dx.cf.iface.ParseException -> L25
            r2 = 0
            r1.<init>(r7, r8, r9, r2)     // Catch: java.lang.Exception -> L23 com.android.dx.cf.iface.ParseException -> L25
            com.android.dx.cf.direct.DirectClassFile r8 = r1.call()     // Catch: java.lang.Exception -> L23 com.android.dx.cf.iface.ParseException -> L25
            com.android.dx.command.dexer.Main.DirectClassFileConsumer.access$700(r0, r8)     // Catch: java.lang.Exception -> L23 com.android.dx.cf.iface.ParseException -> L25
            r8 = 1
            return r8
        L23:
            r8 = move-exception
            goto L27
        L25:
            r8 = move-exception
            goto L2f
        L27:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Exception parsing classes"
            r9.<init>(r0, r8)
            throw r9
        L2f:
            throw r8
    }

    private boolean processFileBytes(java.lang.String r9, long r10, byte[] r12) {
            r8 = this;
            java.lang.String r0 = ".class"
            boolean r0 = r9.endsWith(r0)
            java.lang.String r1 = "classes.dex"
            boolean r1 = r9.equals(r1)
            java.util.TreeMap<java.lang.String, byte[]> r2 = r8.outputResources
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L14
            r2 = r4
            goto L15
        L14:
            r2 = r3
        L15:
            if (r0 != 0) goto L3a
            if (r1 != 0) goto L3a
            if (r2 != 0) goto L3a
            com.android.dx.command.dexer.Main$Arguments r10 = r8.args
            boolean r10 = r10.verbose
            if (r10 == 0) goto L39
            com.android.dx.command.dexer.DxContext r10 = r8.context
            java.io.PrintStream r10 = r10.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "ignored resource "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.println(r9)
        L39:
            return r3
        L3a:
            com.android.dx.command.dexer.Main$Arguments r5 = r8.args
            boolean r5 = r5.verbose
            if (r5 == 0) goto L5d
            com.android.dx.command.dexer.DxContext r5 = r8.context
            java.io.PrintStream r5 = r5.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "processing "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = "..."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.println(r6)
        L5d:
            java.lang.String r9 = fixPath(r9)
            if (r0 == 0) goto L83
            if (r2 == 0) goto L78
            com.android.dx.command.dexer.Main$Arguments r0 = r8.args
            boolean r0 = r0.keepClassesInJar
            if (r0 == 0) goto L78
            java.util.TreeMap<java.lang.String, byte[]> r0 = r8.outputResources
            monitor-enter(r0)
            java.util.TreeMap<java.lang.String, byte[]> r1 = r8.outputResources     // Catch: java.lang.Throwable -> L75
            r1.put(r9, r12)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            goto L78
        L75:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            throw r9
        L78:
            long r0 = r8.minimumFileAge
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L7f
            return r4
        L7f:
            r8.processClass(r9, r12)
            return r3
        L83:
            if (r1 == 0) goto L92
            java.util.List<byte[]> r10 = r8.libraryDexBuffers
            monitor-enter(r10)
            java.util.List<byte[]> r9 = r8.libraryDexBuffers     // Catch: java.lang.Throwable -> L8f
            r9.add(r12)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8f
            return r4
        L8f:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8f
            throw r9
        L92:
            java.util.TreeMap<java.lang.String, byte[]> r10 = r8.outputResources
            monitor-enter(r10)
            java.util.TreeMap<java.lang.String, byte[]> r11 = r8.outputResources     // Catch: java.lang.Throwable -> L9c
            r11.put(r9, r12)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L9c
            return r4
        L9c:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L9c
            throw r9
    }

    private void processOne(java.lang.String r4, com.android.dx.cf.direct.ClassPathOpener.FileNameFilter r5) {
            r3 = this;
            com.android.dx.cf.direct.ClassPathOpener r0 = new com.android.dx.cf.direct.ClassPathOpener
            com.android.dx.command.dexer.Main$FileBytesConsumer r1 = new com.android.dx.command.dexer.Main$FileBytesConsumer
            r2 = 0
            r1.<init>(r3, r2)
            r2 = 1
            r0.<init>(r4, r2, r5, r1)
            boolean r4 = r0.process()
            if (r4 == 0) goto L15
            r3.updateStatus(r2)
        L15:
            return
    }

    private static void readPathsFromFile(java.lang.String r2, java.util.Collection<java.lang.String> r3) throws java.io.IOException {
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L20
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L20
        Lb:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1c
            java.lang.String r0 = fixPath(r0)     // Catch: java.lang.Throwable -> L19
            r3.add(r0)     // Catch: java.lang.Throwable -> L19
            goto Lb
        L19:
            r3 = move-exception
            r0 = r2
            goto L21
        L1c:
            r2.close()
            return
        L20:
            r3 = move-exception
        L21:
            if (r0 == 0) goto L26
            r0.close()
        L26:
            throw r3
    }

    private void rotateDexFile() {
            r5 = this;
            com.android.dx.dex.file.DexFile r0 = r5.outputDex
            if (r0 == 0) goto L21
            java.util.concurrent.ExecutorService r1 = r5.dexOutPool
            if (r1 == 0) goto L18
            java.util.List<java.util.concurrent.Future<byte[]>> r2 = r5.dexOutputFutures
            com.android.dx.command.dexer.Main$DexWriter r3 = new com.android.dx.command.dexer.Main$DexWriter
            r4 = 0
            r3.<init>(r5, r0, r4)
            java.util.concurrent.Future r0 = r1.submit(r3)
            r2.add(r0)
            goto L21
        L18:
            java.util.List<byte[]> r1 = r5.dexOutputArrays
            byte[] r0 = r5.writeDex(r0)
            r1.add(r0)
        L21:
            r5.createDexFile()
            return
    }

    public static int run(com.android.dx.command.dexer.Main.Arguments r2) throws java.io.IOException {
            com.android.dx.command.dexer.Main r0 = new com.android.dx.command.dexer.Main
            com.android.dx.command.dexer.DxContext r1 = new com.android.dx.command.dexer.DxContext
            r1.<init>()
            r0.<init>(r1)
            int r2 = r0.runDx(r2)
            return r2
    }

    private int runMonoDex() throws java.io.IOException {
            r5 = this;
            com.android.dx.command.dexer.Main$Arguments r0 = r5.args
            boolean r1 = r0.incremental
            r2 = 0
            if (r1 == 0) goto L2c
            java.lang.String r0 = r0.outName
            if (r0 != 0) goto L16
            com.android.dx.command.dexer.DxContext r0 = r5.context
            java.io.PrintStream r0 = r0.err
            java.lang.String r1 = "error: no incremental output name specified"
            r0.println(r1)
            r0 = -1
            return r0
        L16:
            java.io.File r0 = new java.io.File
            com.android.dx.command.dexer.Main$Arguments r1 = r5.args
            java.lang.String r1 = r1.outName
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2d
            long r3 = r0.lastModified()
            r5.minimumFileAge = r3
            goto L2d
        L2c:
            r0 = r2
        L2d:
            boolean r1 = r5.processAllFiles()
            if (r1 != 0) goto L35
            r0 = 1
            return r0
        L35:
            com.android.dx.command.dexer.Main$Arguments r1 = r5.args
            boolean r1 = r1.incremental
            r3 = 0
            if (r1 == 0) goto L41
            boolean r1 = r5.anyFilesProcessed
            if (r1 != 0) goto L41
            return r3
        L41:
            com.android.dx.dex.file.DexFile r1 = r5.outputDex
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L52
            com.android.dx.command.dexer.Main$Arguments r1 = r5.args
            java.lang.String r1 = r1.humanOutName
            if (r1 == 0) goto L50
            goto L52
        L50:
            r1 = r2
            goto L5c
        L52:
            com.android.dx.dex.file.DexFile r1 = r5.outputDex
            byte[] r1 = r5.writeDex(r1)
            if (r1 != 0) goto L5c
            r0 = 2
            return r0
        L5c:
            com.android.dx.command.dexer.Main$Arguments r4 = r5.args
            boolean r4 = r4.incremental
            if (r4 == 0) goto L66
            byte[] r1 = r5.mergeIncremental(r1, r0)
        L66:
            byte[] r0 = r5.mergeLibraryDexBuffers(r1)
            com.android.dx.command.dexer.Main$Arguments r1 = r5.args
            boolean r4 = r1.jarOutput
            if (r4 == 0) goto L87
            r5.outputDex = r2
            if (r0 == 0) goto L7b
            java.util.TreeMap<java.lang.String, byte[]> r1 = r5.outputResources
            java.lang.String r2 = "classes.dex"
            r1.put(r2, r0)
        L7b:
            com.android.dx.command.dexer.Main$Arguments r0 = r5.args
            java.lang.String r0 = r0.outName
            boolean r0 = r5.createJar(r0)
            if (r0 != 0) goto L97
            r0 = 3
            return r0
        L87:
            if (r0 == 0) goto L97
            java.lang.String r1 = r1.outName
            if (r1 == 0) goto L97
            java.io.OutputStream r1 = r5.openOutput(r1)
            r1.write(r0)
            r5.closeOutput(r1)
        L97:
            return r3
    }

    private int runMultiDex() throws java.io.IOException {
            r6 = this;
            com.android.dx.command.dexer.Main$Arguments r0 = r6.args
            java.lang.String r0 = r0.mainDexListFile
            if (r0 == 0) goto L14
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.classesInMainDex = r0
            com.android.dx.command.dexer.Main$Arguments r1 = r6.args
            java.lang.String r1 = r1.mainDexListFile
            readPathsFromFile(r1, r0)
        L14:
            com.android.dx.command.dexer.Main$Arguments r0 = r6.args
            int r0 = r0.numThreads
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r6.dexOutPool = r0
            boolean r0 = r6.processAllFiles()
            if (r0 != 0) goto L26
            r0 = 1
            return r0
        L26:
            java.util.List<byte[]> r0 = r6.libraryDexBuffers
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lfd
            com.android.dx.dex.file.DexFile r0 = r6.outputDex
            if (r0 == 0) goto L45
            java.util.List<java.util.concurrent.Future<byte[]>> r1 = r6.dexOutputFutures
            java.util.concurrent.ExecutorService r2 = r6.dexOutPool
            com.android.dx.command.dexer.Main$DexWriter r3 = new com.android.dx.command.dexer.Main$DexWriter
            r4 = 0
            r3.<init>(r6, r0, r4)
            java.util.concurrent.Future r0 = r2.submit(r3)
            r1.add(r0)
            r6.outputDex = r4
        L45:
            java.util.concurrent.ExecutorService r0 = r6.dexOutPool     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            r0.shutdown()     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            java.util.concurrent.ExecutorService r0 = r6.dexOutPool     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            r2 = 600(0x258, double:2.964E-321)
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            if (r0 == 0) goto Ldb
            java.util.List<java.util.concurrent.Future<byte[]>> r0 = r6.dexOutputFutures     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
        L5c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            java.util.List<byte[]> r2 = r6.dexOutputArrays     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            r2.add(r1)     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            goto L5c
        L72:
            com.android.dx.command.dexer.Main$Arguments r0 = r6.args
            boolean r1 = r0.jarOutput
            r2 = 0
            if (r1 == 0) goto La0
            r0 = r2
        L7a:
            java.util.List<byte[]> r1 = r6.dexOutputArrays
            int r1 = r1.size()
            if (r0 >= r1) goto L94
            java.util.TreeMap<java.lang.String, byte[]> r1 = r6.outputResources
            java.lang.String r3 = getDexFileName(r0)
            java.util.List<byte[]> r4 = r6.dexOutputArrays
            java.lang.Object r4 = r4.get(r0)
            r1.put(r3, r4)
            int r0 = r0 + 1
            goto L7a
        L94:
            com.android.dx.command.dexer.Main$Arguments r0 = r6.args
            java.lang.String r0 = r0.outName
            boolean r0 = r6.createJar(r0)
            if (r0 != 0) goto Lda
            r0 = 3
            return r0
        La0:
            java.lang.String r0 = r0.outName
            if (r0 == 0) goto Lda
            java.io.File r0 = new java.io.File
            com.android.dx.command.dexer.Main$Arguments r1 = r6.args
            java.lang.String r1 = r1.outName
            r0.<init>(r1)
            r1 = r2
        Lae:
            java.util.List<byte[]> r3 = r6.dexOutputArrays
            int r3 = r3.size()
            if (r1 >= r3) goto Lda
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            java.io.File r4 = new java.io.File
            java.lang.String r5 = getDexFileName(r1)
            r4.<init>(r0, r5)
            r3.<init>(r4)
            java.util.List<byte[]> r4 = r6.dexOutputArrays     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> Ld5
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> Ld5
            r3.write(r4)     // Catch: java.lang.Throwable -> Ld5
            r6.closeOutput(r3)
            int r1 = r1 + 1
            goto Lae
        Ld5:
            r0 = move-exception
            r6.closeOutput(r3)
            throw r0
        Lda:
            return r2
        Ldb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            java.lang.String r1 = "Timed out waiting for dex writer threads."
            r0.<init>(r1)     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
            throw r0     // Catch: java.lang.Exception -> Le3 java.lang.InterruptedException -> Lf0
        Le3:
            java.util.concurrent.ExecutorService r0 = r6.dexOutPool
            r0.shutdownNow()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected exception in dex writer thread"
            r0.<init>(r1)
            throw r0
        Lf0:
            java.util.concurrent.ExecutorService r0 = r6.dexOutPool
            r0.shutdownNow()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A dex writer thread has been interrupted."
            r0.<init>(r1)
            throw r0
        Lfd:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.String r1 = "Library dex files are not supported in multi-dex mode"
            r0.<init>(r1)
            throw r0
    }

    private com.android.dx.dex.file.ClassDefItem translateClass(byte[] r7, com.android.dx.cf.direct.DirectClassFile r8) {
            r6 = this;
            com.android.dx.command.dexer.DxContext r0 = r6.context     // Catch: com.android.dx.cf.iface.ParseException -> L11
            com.android.dx.command.dexer.Main$Arguments r1 = r6.args     // Catch: com.android.dx.cf.iface.ParseException -> L11
            com.android.dx.dex.cf.CfOptions r3 = r1.cfOptions     // Catch: com.android.dx.cf.iface.ParseException -> L11
            com.android.dx.dex.DexOptions r4 = r1.dexOptions     // Catch: com.android.dx.cf.iface.ParseException -> L11
            com.android.dx.dex.file.DexFile r5 = r6.outputDex     // Catch: com.android.dx.cf.iface.ParseException -> L11
            r1 = r8
            r2 = r7
            com.android.dx.dex.file.ClassDefItem r7 = com.android.dx.dex.cf.CfTranslator.translate(r0, r1, r2, r3, r4, r5)     // Catch: com.android.dx.cf.iface.ParseException -> L11
            return r7
        L11:
            r7 = move-exception
            com.android.dx.command.dexer.DxContext r8 = r6.context
            java.io.PrintStream r8 = r8.err
            java.lang.String r0 = "\ntrouble processing:"
            r8.println(r0)
            com.android.dx.command.dexer.Main$Arguments r8 = r6.args
            boolean r8 = r8.debug
            if (r8 == 0) goto L29
            com.android.dx.command.dexer.DxContext r8 = r6.context
            java.io.PrintStream r8 = r8.err
            r7.printStackTrace(r8)
            goto L30
        L29:
            com.android.dx.command.dexer.DxContext r8 = r6.context
            java.io.PrintStream r8 = r8.err
            r7.printContext(r8)
        L30:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.errors
            r7.incrementAndGet()
            r7 = 0
            return r7
    }

    private void updateStatus(boolean r2) {
            r1 = this;
            boolean r0 = r1.anyFilesProcessed
            r2 = r2 | r0
            r1.anyFilesProcessed = r2
            return
    }

    private byte[] writeDex(com.android.dx.dex.file.DexFile r5) {
            r4 = this;
            r0 = 0
            com.android.dx.command.dexer.Main$Arguments r1 = r4.args     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r1.methodToDump     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            r1 = 0
            r5.toDex(r0, r1)     // Catch: java.lang.Throwable -> L16
            com.android.dx.command.dexer.Main$Arguments r1 = r4.args     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r1.methodToDump     // Catch: java.lang.Throwable -> L16
            java.io.OutputStreamWriter r2 = r4.humanOutWriter     // Catch: java.lang.Throwable -> L16
            r4.dumpMethod(r5, r1, r2)     // Catch: java.lang.Throwable -> L16
            r1 = r0
            goto L20
        L16:
            r5 = move-exception
            goto L40
        L18:
            java.io.OutputStreamWriter r2 = r4.humanOutWriter     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.verboseDump     // Catch: java.lang.Throwable -> L16
            byte[] r1 = r5.toDex(r2, r1)     // Catch: java.lang.Throwable -> L16
        L20:
            com.android.dx.command.dexer.Main$Arguments r2 = r4.args     // Catch: java.lang.Throwable -> L16
            boolean r2 = r2.statistics     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L35
            com.android.dx.command.dexer.DxContext r2 = r4.context     // Catch: java.lang.Throwable -> L16
            java.io.PrintStream r2 = r2.out     // Catch: java.lang.Throwable -> L16
            com.android.dx.dex.file.Statistics r5 = r5.getStatistics()     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = r5.toHuman()     // Catch: java.lang.Throwable -> L16
            r2.println(r5)     // Catch: java.lang.Throwable -> L16
        L35:
            java.io.OutputStreamWriter r5 = r4.humanOutWriter     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L3f
            r5.flush()     // Catch: java.lang.Exception -> L3d
            goto L3f
        L3d:
            r5 = move-exception
            goto L48
        L3f:
            return r1
        L40:
            java.io.OutputStreamWriter r1 = r4.humanOutWriter     // Catch: java.lang.Exception -> L3d
            if (r1 == 0) goto L47
            r1.flush()     // Catch: java.lang.Exception -> L3d
        L47:
            throw r5     // Catch: java.lang.Exception -> L3d
        L48:
            com.android.dx.command.dexer.Main$Arguments r1 = r4.args
            boolean r1 = r1.debug
            if (r1 == 0) goto L5f
            com.android.dx.command.dexer.DxContext r1 = r4.context
            java.io.PrintStream r1 = r1.err
            java.lang.String r2 = "\ntrouble writing output:"
            r1.println(r2)
            com.android.dx.command.dexer.DxContext r1 = r4.context
            java.io.PrintStream r1 = r1.err
            r5.printStackTrace(r1)
            goto L7b
        L5f:
            com.android.dx.command.dexer.DxContext r1 = r4.context
            java.io.PrintStream r1 = r1.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\ntrouble writing output: "
            r2.append(r3)
            java.lang.String r5 = r5.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.println(r5)
        L7b:
            return r0
    }

    public int runDx(com.android.dx.command.dexer.Main.Arguments r3) throws java.io.IOException {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.errors
            r1 = 0
            r0.set(r1)
            java.util.List<byte[]> r0 = r2.libraryDexBuffers
            r0.clear()
            r2.args = r3
            r3.makeOptionsObjects()
            com.android.dx.command.dexer.Main$Arguments r3 = r2.args
            java.lang.String r3 = r3.humanOutName
            if (r3 == 0) goto L22
            java.io.OutputStream r3 = r2.openOutput(r3)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r3)
            r2.humanOutWriter = r0
            goto L23
        L22:
            r3 = 0
        L23:
            com.android.dx.command.dexer.Main$Arguments r0 = r2.args     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.multiDex     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L33
            int r0 = r2.runMultiDex()     // Catch: java.lang.Throwable -> L31
            r2.closeOutput(r3)
            return r0
        L31:
            r0 = move-exception
            goto L3b
        L33:
            int r0 = r2.runMonoDex()     // Catch: java.lang.Throwable -> L31
            r2.closeOutput(r3)
            return r0
        L3b:
            r2.closeOutput(r3)
            throw r0
    }
}

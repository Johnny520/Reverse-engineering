.class public Lcom/android/dx/command/dexer/Main;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/command/dexer/Main$Arguments;,
        Lcom/android/dx/command/dexer/Main$DexWriter;,
        Lcom/android/dx/command/dexer/Main$MainDexListFilter;,
        Lcom/android/dx/command/dexer/Main$BestEffortMainDexListFilter;,
        Lcom/android/dx/command/dexer/Main$RemoveModuleInfoFilter;,
        Lcom/android/dx/command/dexer/Main$NotFilter;,
        Lcom/android/dx/command/dexer/Main$StopProcessing;,
        Lcom/android/dx/command/dexer/Main$FileBytesConsumer;,
        Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;,
        Lcom/android/dx/command/dexer/Main$ClassParserTask;,
        Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;,
        Lcom/android/dx/command/dexer/Main$ClassTranslatorTask;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final CREATED_BY:Ljava/util/jar/Attributes$Name;

.field private static final DEX_EXTENSION:Ljava/lang/String; = ".dex"

.field private static final DEX_PREFIX:Ljava/lang/String; = "classes"

.field private static final IN_RE_CORE_CLASSES:Ljava/lang/String; = "Ill-advised or mistaken usage of a core class (java.* or javax.*)\nwhen not building a core library.\n\nThis is often due to inadvertently including a core library file\nin your application\'s project, when using an IDE (such as\nEclipse). If you are sure you\'re not intentionally defining a\ncore class, then this is the most likely explanation of what\'s\ngoing on.\n\nHowever, you might actually be trying to define a class in a core\nnamespace, the source of which you may have taken, for example,\nfrom a non-Android virtual machine project. This will most\nassuredly not work. At a minimum, it jeopardizes the\ncompatibility of your app with future versions of the platform.\nIt is also often of questionable legality.\n\nIf you really intend to build a core library -- which is only\nappropriate as part of creating a full virtual machine\ndistribution, as opposed to compiling an application -- then use\nthe \"--core-library\" option to suppress this error message.\n\nIf you go ahead and use \"--core-library\" but are in fact\nbuilding an application, then be forewarned that your application\nwill still fail to build or run, at some point. Please be\nprepared for angry customers who find, for example, that your\napplication ceases to function once they upgrade their operating\nsystem. You will be to blame for this problem.\n\nIf you are legitimately using some code that happens to be in a\ncore package, then the easiest safe alternative you have is to\nrepackage that code. That is, move the classes in question into\nyour own package namespace. This means that they will never be in\nconflict with core system classes. JarJar is a tool that may help\nyou in this endeavor. If you find that you cannot do this, then\nthat is an indication that the path you are on will ultimately\nlead to pain, suffering, grief, and lamentation.\n"

.field private static final JAVAX_CORE:[Ljava/lang/String;

.field private static final MANIFEST_NAME:Ljava/lang/String; = "META-INF/MANIFEST.MF"

.field private static final MAX_FIELD_ADDED_DURING_DEX_CREATION:I = 0x9

.field private static final MAX_METHOD_ADDED_DURING_DEX_CREATION:I = 0x2


# instance fields
.field private addToDexFutures:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field private volatile anyFilesProcessed:Z

.field private args:Lcom/android/dx/command/dexer/Main$Arguments;

.field private classDefItemConsumer:Ljava/util/concurrent/ExecutorService;

.field private classTranslatorPool:Ljava/util/concurrent/ExecutorService;

.field private classesInMainDex:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Lcom/android/dx/command/dexer/DxContext;

.field private dexOutPool:Ljava/util/concurrent/ExecutorService;

.field private dexOutputArrays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private dexOutputFutures:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "[B>;>;"
        }
    .end annotation
.end field

.field private dexRotationLock:Ljava/lang/Object;

.field private errors:Ljava/util/concurrent/atomic/AtomicInteger;

.field private humanOutWriter:Ljava/io/OutputStreamWriter;

.field private final libraryDexBuffers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private maxFieldIdsInProcess:I

.field private maxMethodIdsInProcess:I

.field private minimumFileAge:J

.field private outputDex:Lcom/android/dx/dex/file/DexFile;

.field private outputResources:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Ljava/util/jar/Attributes$Name;

    .line 2
    .line 3
    const-string v1, "Created-By"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/jar/Attributes$Name;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/android/dx/command/dexer/Main;->CREATED_BY:Ljava/util/jar/Attributes$Name;

    .line 9
    .line 10
    const-string v15, "transaction"

    .line 11
    .line 12
    const-string v16, "xml"

    .line 13
    .line 14
    const-string v2, "accessibility"

    .line 15
    .line 16
    const-string v3, "crypto"

    .line 17
    .line 18
    const-string v4, "imageio"

    .line 19
    .line 20
    const-string v5, "management"

    .line 21
    .line 22
    const-string v6, "naming"

    .line 23
    .line 24
    const-string v7, "net"

    .line 25
    .line 26
    const-string v8, "print"

    .line 27
    .line 28
    const-string v9, "rmi"

    .line 29
    .line 30
    const-string v10, "security"

    .line 31
    .line 32
    const-string v11, "sip"

    .line 33
    .line 34
    const-string v12, "sound"

    .line 35
    .line 36
    const-string v13, "sql"

    .line 37
    .line 38
    const-string v14, "swing"

    .line 39
    .line 40
    filled-new-array/range {v2 .. v16}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, Lcom/android/dx/command/dexer/Main;->JAVAX_CORE:[Ljava/lang/String;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/command/dexer/DxContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->errors:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->libraryDexBuffers:Ljava/util/List;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->addToDexFutures:Ljava/util/List;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->dexOutputFutures:Ljava/util/List;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/Object;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->dexRotationLock:Ljava/lang/Object;

    .line 39
    .line 40
    iput v1, p0, Lcom/android/dx/command/dexer/Main;->maxMethodIdsInProcess:I

    .line 41
    .line 42
    iput v1, p0, Lcom/android/dx/command/dexer/Main;->maxFieldIdsInProcess:I

    .line 43
    .line 44
    const-wide/16 v0, 0x0

    .line 45
    .line 46
    iput-wide v0, p0, Lcom/android/dx/command/dexer/Main;->minimumFileAge:J

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->classesInMainDex:Ljava/util/Set;

    .line 50
    .line 51
    new-instance v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lcom/android/dx/command/dexer/Main;->dexOutputArrays:Ljava/util/List;

    .line 57
    .line 58
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->humanOutWriter:Ljava/io/OutputStreamWriter;

    .line 59
    .line 60
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 61
    .line 62
    return-void
.end method

.method public static synthetic access$1000(Lcom/android/dx/command/dexer/Main;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->classesInMainDex:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1100(Ljava/lang/String;Ljava/util/Collection;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/android/dx/command/dexer/Main;->readPathsFromFile(Ljava/lang/String;Ljava/util/Collection;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1200(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;J[B)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/command/dexer/Main;->processFileBytes(Ljava/lang/String;J[B)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1400(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/Main$Arguments;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1500(Lcom/android/dx/command/dexer/Main;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->errors:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1600(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[B)Lcom/android/dx/cf/direct/DirectClassFile;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/command/dexer/Main;->parseClass(Ljava/lang/String;[B)Lcom/android/dx/cf/direct/DirectClassFile;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$1700(Lcom/android/dx/command/dexer/Main;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->dexRotationLock:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1800(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/dex/file/DexFile;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1900(Lcom/android/dx/command/dexer/Main;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/command/dexer/Main;->maxMethodIdsInProcess:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1912(Lcom/android/dx/command/dexer/Main;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/command/dexer/Main;->maxMethodIdsInProcess:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/android/dx/command/dexer/Main;->maxMethodIdsInProcess:I

    .line 5
    .line 6
    return v0
.end method

.method public static synthetic access$1920(Lcom/android/dx/command/dexer/Main;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/command/dexer/Main;->maxMethodIdsInProcess:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/android/dx/command/dexer/Main;->maxMethodIdsInProcess:I

    .line 5
    .line 6
    return v0
.end method

.method public static synthetic access$2000(Lcom/android/dx/command/dexer/Main;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/command/dexer/Main;->maxFieldIdsInProcess:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$2012(Lcom/android/dx/command/dexer/Main;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/command/dexer/Main;->maxFieldIdsInProcess:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/android/dx/command/dexer/Main;->maxFieldIdsInProcess:I

    .line 5
    .line 6
    return v0
.end method

.method public static synthetic access$2020(Lcom/android/dx/command/dexer/Main;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/command/dexer/Main;->maxFieldIdsInProcess:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/android/dx/command/dexer/Main;->maxFieldIdsInProcess:I

    .line 5
    .line 6
    return v0
.end method

.method public static synthetic access$2100(Lcom/android/dx/command/dexer/Main;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->rotateDexFile()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2300(Lcom/android/dx/command/dexer/Main;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->classTranslatorPool:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2500(Lcom/android/dx/command/dexer/Main;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->classDefItemConsumer:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2600(Lcom/android/dx/command/dexer/Main;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->addToDexFutures:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2700(Lcom/android/dx/command/dexer/Main;[BLcom/android/dx/cf/direct/DirectClassFile;)Lcom/android/dx/dex/file/ClassDefItem;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/command/dexer/Main;->translateClass([BLcom/android/dx/cf/direct/DirectClassFile;)Lcom/android/dx/dex/file/ClassDefItem;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$2800(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/ClassDefItem;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->addClassToDex(Lcom/android/dx/dex/file/ClassDefItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$2900(Lcom/android/dx/command/dexer/Main;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->updateStatus(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$3000(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/DexFile;)[B
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->writeDex(Lcom/android/dx/dex/file/DexFile;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$900(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/android/dx/command/dexer/Main;->fixPath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private addClassToDex(Lcom/android/dx/dex/file/ClassDefItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/DexFile;->add(Lcom/android/dx/dex/file/ClassDefItem;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
.end method

.method private checkClassName(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "java/"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "javax/"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x2f

    .line 18
    .line 19
    const/4 v1, 0x6

    .line 20
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, -0x1

    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Lcom/android/dx/command/dexer/Main;->JAVAX_CORE:[Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-gez v0, :cond_1

    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v2, "\ntrouble processing \""

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, "\":\n\nIll-advised or mistaken usage of a core class (java.* or javax.*)\nwhen not building a core library.\n\nThis is often due to inadvertently including a core library file\nin your application\'s project, when using an IDE (such as\nEclipse). If you are sure you\'re not intentionally defining a\ncore class, then this is the most likely explanation of what\'s\ngoing on.\n\nHowever, you might actually be trying to define a class in a core\nnamespace, the source of which you may have taken, for example,\nfrom a non-Android virtual machine project. This will most\nassuredly not work. At a minimum, it jeopardizes the\ncompatibility of your app with future versions of the platform.\nIt is also often of questionable legality.\n\nIf you really intend to build a core library -- which is only\nappropriate as part of creating a full virtual machine\ndistribution, as opposed to compiling an application -- then use\nthe \"--core-library\" option to suppress this error message.\n\nIf you go ahead and use \"--core-library\" but are in fact\nbuilding an application, then be forewarned that your application\nwill still fail to build or run, at some point. Please be\nprepared for angry customers who find, for example, that your\napplication ceases to function once they upgrade their operating\nsystem. You will be to blame for this problem.\n\nIf you are legitimately using some code that happens to be in a\ncore package, then the easiest safe alternative you have is to\nrepackage that code. That is, move the classes in question into\nyour own package namespace. This means that they will never be in\nconflict with core system classes. JarJar is a tool that may help\nyou in this endeavor. If you find that you cannot do this, then\nthat is an indication that the path you are on will ultimately\nlead to pain, suffering, grief, and lamentation.\n"

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->errors:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 69
    .line 70
    .line 71
    new-instance p0, Lcom/android/dx/command/dexer/Main$StopProcessing;

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main$StopProcessing;-><init>(Lcom/android/dx/command/dexer/Main$1;)V

    .line 75
    .line 76
    .line 77
    throw p0
.end method

.method public static clearInternTables()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/android/dx/rop/type/Prototype;->clearInternTable()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/rop/code/RegisterSpec;->clearInternTable()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/android/dx/rop/cst/CstType;->clearInternTable()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/android/dx/rop/type/Type;->clearInternTable()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private closeOutput(Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 10
    .line 11
    if-eq p1, p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method private createDexFile()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/android/dx/dex/file/DexFile;-><init>(Lcom/android/dx/dex/DexOptions;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 11
    .line 12
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 13
    .line 14
    iget p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dumpWidth:I

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lcom/android/dx/dex/file/DexFile;->setDumpWidth(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private createJar(Ljava/lang/String;)Z
    .locals 9

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->makeManifest()Ljava/util/jar/Manifest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->openOutput(Ljava/lang/String;)Ljava/io/OutputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Ljava/util/jar/JarOutputStream;

    .line 10
    .line 11
    invoke-direct {v1, p1, v0}, Ljava/util/jar/JarOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/jar/Manifest;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :try_start_1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, [B

    .line 47
    .line 48
    new-instance v4, Ljava/util/jar/JarEntry;

    .line 49
    .line 50
    invoke-direct {v4, v3}, Ljava/util/jar/JarEntry;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    array-length v5, v2

    .line 54
    iget-object v6, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 55
    .line 56
    iget-boolean v6, v6, Lcom/android/dx/command/dexer/Main$Arguments;->verbose:Z

    .line 57
    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    iget-object v6, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 61
    .line 62
    iget-object v6, v6, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 63
    .line 64
    new-instance v7, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v8, "writing "

    .line 70
    .line 71
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v3, "; size "

    .line 78
    .line 79
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v3, "..."

    .line 86
    .line 87
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v6, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto :goto_2

    .line 100
    :cond_0
    :goto_1
    int-to-long v5, v5

    .line 101
    invoke-virtual {v4, v5, v6}, Ljava/util/zip/ZipEntry;->setSize(J)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v4}, Ljava/util/jar/JarOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    :try_start_2
    invoke-virtual {v1}, Ljava/util/zip/DeflaterOutputStream;->finish()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->closeOutput(Ljava/io/OutputStream;)V

    .line 121
    .line 122
    .line 123
    const/4 p0, 0x1

    .line 124
    return p0

    .line 125
    :catch_0
    move-exception p1

    .line 126
    goto :goto_3

    .line 127
    :goto_2
    invoke-virtual {v1}, Ljava/util/zip/DeflaterOutputStream;->finish()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->closeOutput(Ljava/io/OutputStream;)V

    .line 134
    .line 135
    .line 136
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 137
    :goto_3
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 138
    .line 139
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->debug:Z

    .line 140
    .line 141
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 142
    .line 143
    if-eqz v0, :cond_2

    .line 144
    .line 145
    iget-object v0, v1, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 146
    .line 147
    const-string v1, "\ntrouble writing output:"

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 153
    .line 154
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 155
    .line 156
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_2
    iget-object p0, v1, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 161
    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v1, "\ntrouble writing output: "

    .line 165
    .line 166
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :goto_4
    const/4 p0, 0x0

    .line 184
    return p0
.end method

.method private dumpMethod(Lcom/android/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/OutputStreamWriter;)V
    .locals 8

    .line 1
    const-string v0, "*"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x2e

    .line 8
    .line 9
    invoke-virtual {p2, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-lez v2, :cond_d

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x1

    .line 20
    sub-int/2addr v3, v4

    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    const/4 v3, 0x0

    .line 26
    invoke-virtual {p2, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/16 v6, 0x2f

    .line 31
    .line 32
    invoke-virtual {v5, v1, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    add-int/2addr v2, v4

    .line 37
    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1, v1}, Lcom/android/dx/dex/file/DexFile;->getClassOrNull(Ljava/lang/String;)Lcom/android/dx/dex/file/ClassDefItem;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 48
    .line 49
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 50
    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p2, "no such class: "

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-static {v4, v3, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_2
    invoke-virtual {p1}, Lcom/android/dx/dex/file/ClassDefItem;->getMethods()Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v4, Ljava/util/TreeMap;

    .line 80
    .line 81
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Lcom/android/dx/dex/file/EncodedMethod;

    .line 99
    .line 100
    invoke-virtual {v5}, Lcom/android/dx/dex/file/EncodedMethod;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v6}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-virtual {v6, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-nez v7, :cond_5

    .line 115
    .line 116
    :cond_4
    if-nez v0, :cond_3

    .line 117
    .line 118
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_3

    .line 123
    .line 124
    :cond_5
    invoke-virtual {v5}, Lcom/android/dx/dex/file/EncodedMethod;->getRef()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-virtual {v6}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_6
    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_7

    .line 141
    .line 142
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 143
    .line 144
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 145
    .line 146
    const-string p1, "no such method: "

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_7
    new-instance p2, Ljava/io/PrintWriter;

    .line 157
    .line 158
    invoke-direct {p2, p3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    :cond_8
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_c

    .line 174
    .line 175
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Lcom/android/dx/dex/file/EncodedMethod;

    .line 180
    .line 181
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 182
    .line 183
    iget-boolean v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->verboseDump:Z

    .line 184
    .line 185
    invoke-virtual {v0, p2, v1}, Lcom/android/dx/dex/file/EncodedMethod;->debugPrint(Ljava/io/PrintWriter;Z)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/android/dx/dex/file/ClassDefItem;->getSourceFile()Lcom/android/dx/rop/cst/CstString;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    if-eqz v1, :cond_9

    .line 193
    .line 194
    new-instance v2, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v4, "  source file: "

    .line 197
    .line 198
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :cond_9
    invoke-virtual {v0}, Lcom/android/dx/dex/file/EncodedMethod;->getRef()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {p1, v1}, Lcom/android/dx/dex/file/ClassDefItem;->getMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/Annotations;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v0}, Lcom/android/dx/dex/file/EncodedMethod;->getRef()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/file/ClassDefItem;->getParameterAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    if-eqz v1, :cond_a

    .line 232
    .line 233
    const-string v2, "  method annotations:"

    .line 234
    .line 235
    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Lcom/android/dx/rop/annotation/Annotations;->getAnnotations()Ljava/util/Collection;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_a

    .line 251
    .line 252
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Lcom/android/dx/rop/annotation/Annotation;

    .line 257
    .line 258
    new-instance v4, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    const-string v5, "    "

    .line 261
    .line 262
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_1

    .line 276
    :cond_a
    if-eqz v0, :cond_8

    .line 277
    .line 278
    const-string v1, "  parameter annotations:"

    .line 279
    .line 280
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    move v2, v3

    .line 288
    :goto_2
    if-ge v2, v1, :cond_8

    .line 289
    .line 290
    new-instance v4, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    const-string v5, "    parameter "

    .line 293
    .line 294
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v2}, Lcom/android/dx/rop/annotation/AnnotationsList;->get(I)Lcom/android/dx/rop/annotation/Annotations;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v4}, Lcom/android/dx/rop/annotation/Annotations;->getAnnotations()Ljava/util/Collection;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    if-eqz v5, :cond_b

    .line 324
    .line 325
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    check-cast v5, Lcom/android/dx/rop/annotation/Annotation;

    .line 330
    .line 331
    new-instance v6, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    const-string v7, "      "

    .line 334
    .line 335
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_c
    invoke-virtual {p2}, Ljava/io/PrintWriter;->flush()V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :cond_d
    :goto_4
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 357
    .line 358
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 359
    .line 360
    const-string p1, "bogus fully-qualified method name: "

    .line 361
    .line 362
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    return-void
.end method

.method private static fixPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 2
    .line 3
    const/16 v1, 0x5c

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x2f

    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    const-string v0, "/./"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, -0x1

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x3

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    const-string v0, "./"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :cond_2
    return-object p0
.end method

.method private static getDexFileName(I)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "classes.dex"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "classes"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, ".dex"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static main([Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/command/dexer/DxContext;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/command/dexer/DxContext;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/android/dx/command/dexer/Main$Arguments;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lcom/android/dx/command/dexer/Main$Arguments;-><init>(Lcom/android/dx/command/dexer/DxContext;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p0}, Lcom/android/dx/command/dexer/Main$Arguments;->access$000(Lcom/android/dx/command/dexer/Main$Arguments;[Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p0, Lcom/android/dx/command/dexer/Main;

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/android/dx/command/dexer/Main;-><init>(Lcom/android/dx/command/dexer/DxContext;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/android/dx/command/dexer/Main;->runDx(Lcom/android/dx/command/dexer/Main$Arguments;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method private makeManifest()Ljava/util/jar/Manifest;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 2
    .line 3
    const-string v1, "META-INF/MANIFEST.MF"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [B

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance p0, Ljava/util/jar/Manifest;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/util/jar/Manifest;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Ljava/util/jar/Attributes$Name;->MANIFEST_VERSION:Ljava/util/jar/Attributes$Name;

    .line 23
    .line 24
    const-string v2, "1.0"

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Ljava/util/jar/Attributes;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v2, Ljava/util/jar/Manifest;

    .line 31
    .line 32
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 33
    .line 34
    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/util/jar/Manifest;-><init>(Ljava/io/InputStream;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-object p0, v2

    .line 50
    :goto_0
    sget-object v1, Lcom/android/dx/command/dexer/Main;->CREATED_BY:Ljava/util/jar/Attributes$Name;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/util/jar/Attributes;->getValue(Ljava/util/jar/Attributes$Name;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    const-string v2, ""

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const-string v3, " + "

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :goto_1
    const-string v3, "dx 1.16"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0, v1, v2}, Ljava/util/jar/Attributes;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    const-string v1, "Dex-Location"

    .line 77
    .line 78
    const-string v2, "classes.dex"

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Ljava/util/jar/Attributes;->putValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    return-object p0
.end method

.method private mergeIncremental([BLjava/io/File;)[B
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    new-instance v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    invoke-direct {v1, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>([B)V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v1, v0

    .line 11
    :goto_0
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    new-instance p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 18
    .line 19
    invoke-direct {p1, p2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object p1, v0

    .line 24
    :goto_1
    if-nez v1, :cond_2

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_2
    if-nez v1, :cond_3

    .line 30
    .line 31
    move-object v1, p1

    .line 32
    goto :goto_2

    .line 33
    :cond_3
    if-nez p1, :cond_4

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_4
    new-instance p2, Lcom/android/dx/merge/DexMerger;

    .line 37
    .line 38
    filled-new-array {v1, p1}, [L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object v0, Lcom/android/dx/merge/CollisionPolicy;->KEEP_FIRST:Lcom/android/dx/merge/CollisionPolicy;

    .line 43
    .line 44
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 45
    .line 46
    invoke-direct {p2, p1, v0, p0}, Lcom/android/dx/merge/DexMerger;-><init>([L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/CollisionPolicy;Lcom/android/dx/command/dexer/DxContext;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lcom/android/dx/merge/DexMerger;->merge()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_2
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 54
    .line 55
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰(Ljava/io/OutputStream;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method private mergeLibraryDexBuffers([B)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    invoke-direct {v1, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>([B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main;->libraryDexBuffers:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, [B

    .line 33
    .line 34
    new-instance v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 35
    .line 36
    invoke-direct {v2, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    new-instance p1, Lcom/android/dx/merge/DexMerger;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    new-array v1, v1, [L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, [L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 64
    .line 65
    sget-object v1, Lcom/android/dx/merge/CollisionPolicy;->FAIL:Lcom/android/dx/merge/CollisionPolicy;

    .line 66
    .line 67
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 68
    .line 69
    invoke-direct {p1, v0, v1, p0}, Lcom/android/dx/merge/DexMerger;-><init>([L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/CollisionPolicy;Lcom/android/dx/command/dexer/DxContext;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/android/dx/merge/DexMerger;->merge()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    new-array p1, p1, [B

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    .line 98
    return-object p1
.end method

.method private openOutput(Ljava/lang/String;)Ljava/io/OutputStream;
    .locals 1

    .line 1
    const-string v0, "-"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "-."

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Ljava/io/FileOutputStream;

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 25
    .line 26
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 27
    .line 28
    return-object p0
.end method

.method private parseClass(Ljava/lang/String;[B)Lcom/android/dx/cf/direct/DirectClassFile;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->cfOptions:Lcom/android/dx/dex/cf/CfOptions;

    .line 6
    .line 7
    iget-boolean p0, p0, Lcom/android/dx/dex/cf/CfOptions;->strictNameCheck:Z

    .line 8
    .line 9
    invoke-direct {v0, p2, p1, p0}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>([BLjava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lcom/android/dx/cf/direct/StdAttributeFactory;->THE_ONE:Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic()I

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private processAllFiles()Z
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->createDexFile()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 5
    .line 6
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->jarOutput:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/TreeMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main;->anyFilesProcessed:Z

    .line 19
    .line 20
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->fileNames:[Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 30
    .line 31
    iget v3, v3, Lcom/android/dx/command/dexer/Main$Arguments;->numThreads:I

    .line 32
    .line 33
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    new-instance v8, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 36
    .line 37
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 38
    .line 39
    iget v4, v4, Lcom/android/dx/command/dexer/Main$Arguments;->numThreads:I

    .line 40
    .line 41
    mul-int/lit8 v4, v4, 0x2

    .line 42
    .line 43
    const/4 v10, 0x1

    .line 44
    invoke-direct {v8, v4, v10}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(IZ)V

    .line 45
    .line 46
    .line 47
    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy;

    .line 48
    .line 49
    invoke-direct {v9}, Ljava/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy;-><init>()V

    .line 50
    .line 51
    .line 52
    const-wide/16 v5, 0x0

    .line 53
    .line 54
    move v4, v3

    .line 55
    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main;->classTranslatorPool:Ljava/util/concurrent/ExecutorService;

    .line 59
    .line 60
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main;->classDefItemConsumer:Ljava/util/concurrent/ExecutorService;

    .line 65
    .line 66
    :try_start_0
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 67
    .line 68
    iget-object v3, v2, Lcom/android/dx/command/dexer/Main$Arguments;->mainDexListFile:Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v3, :cond_7

    .line 71
    .line 72
    iget-boolean v2, v2, Lcom/android/dx/command/dexer/Main$Arguments;->strictNameCheck:Z

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    new-instance v2, Lcom/android/dx/command/dexer/Main$MainDexListFilter;

    .line 78
    .line 79
    invoke-direct {v2, p0, v3}, Lcom/android/dx/command/dexer/Main$MainDexListFilter;-><init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/command/dexer/Main$1;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    new-instance v2, Lcom/android/dx/command/dexer/Main$BestEffortMainDexListFilter;

    .line 84
    .line 85
    invoke-direct {v2, p0}, Lcom/android/dx/command/dexer/Main$BestEffortMainDexListFilter;-><init>(Lcom/android/dx/command/dexer/Main;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    move v4, v1

    .line 89
    :goto_1
    array-length v5, v0

    .line 90
    if-ge v4, v5, :cond_2

    .line 91
    .line 92
    aget-object v5, v0, v4

    .line 93
    .line 94
    invoke-direct {p0, v5, v2}, Lcom/android/dx/command/dexer/Main;->processOne(Ljava/lang/String;Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v4, v4, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main;->dexOutputFutures:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-gtz v4, :cond_6

    .line 107
    .line 108
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 109
    .line 110
    iget-boolean v4, v4, Lcom/android/dx/command/dexer/Main$Arguments;->minimalMainDex:Z

    .line 111
    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main;->dexRotationLock:Ljava/lang/Object;

    .line 115
    .line 116
    monitor-enter v4
    :try_end_0
    .catch Lcom/android/dx/command/dexer/Main$StopProcessing; {:try_start_0 .. :try_end_0} :catch_1

    .line 117
    :catch_0
    :goto_2
    :try_start_1
    iget v5, p0, Lcom/android/dx/command/dexer/Main;->maxMethodIdsInProcess:I

    .line 118
    .line 119
    if-gtz v5, :cond_4

    .line 120
    .line 121
    iget v5, p0, Lcom/android/dx/command/dexer/Main;->maxFieldIdsInProcess:I

    .line 122
    .line 123
    if-lez v5, :cond_3

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_3
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    :try_start_2
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->rotateDexFile()V
    :try_end_2
    .catch Lcom/android/dx/command/dexer/Main$StopProcessing; {:try_start_2 .. :try_end_2} :catch_1

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    goto :goto_4

    .line 133
    :cond_4
    :goto_3
    :try_start_3
    iget-object v5, p0, Lcom/android/dx/command/dexer/Main;->dexRotationLock:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :goto_4
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 140
    :try_start_5
    throw v0

    .line 141
    :cond_5
    :goto_5
    new-instance v4, Lcom/android/dx/command/dexer/Main$RemoveModuleInfoFilter;

    .line 142
    .line 143
    new-instance v5, Lcom/android/dx/command/dexer/Main$NotFilter;

    .line 144
    .line 145
    invoke-direct {v5, v2, v3}, Lcom/android/dx/command/dexer/Main$NotFilter;-><init>(Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;Lcom/android/dx/command/dexer/Main$1;)V

    .line 146
    .line 147
    .line 148
    invoke-direct {v4, v5}, Lcom/android/dx/command/dexer/Main$RemoveModuleInfoFilter;-><init>(Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;)V

    .line 149
    .line 150
    .line 151
    move v2, v1

    .line 152
    :goto_6
    array-length v3, v0

    .line 153
    if-ge v2, v3, :cond_8

    .line 154
    .line 155
    aget-object v3, v0, v2

    .line 156
    .line 157
    invoke-direct {p0, v3, v4}, Lcom/android/dx/command/dexer/Main;->processOne(Ljava/lang/String;Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v2, v2, 0x1

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_6
    new-instance v0, Lcom/android/dex/DexException;

    .line 164
    .line 165
    const-string v2, "Too many classes in --main-dex-list, main dex capacity exceeded"

    .line 166
    .line 167
    invoke-direct {v0, v2}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_7
    new-instance v2, Lcom/android/dx/command/dexer/Main$RemoveModuleInfoFilter;

    .line 172
    .line 173
    sget-object v3, Lcom/android/dx/cf/direct/ClassPathOpener;->acceptAll:Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;

    .line 174
    .line 175
    invoke-direct {v2, v3}, Lcom/android/dx/command/dexer/Main$RemoveModuleInfoFilter;-><init>(Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;)V

    .line 176
    .line 177
    .line 178
    move v3, v1

    .line 179
    :goto_7
    array-length v4, v0

    .line 180
    if-ge v3, v4, :cond_8

    .line 181
    .line 182
    aget-object v4, v0, v3

    .line 183
    .line 184
    invoke-direct {p0, v4, v2}, Lcom/android/dx/command/dexer/Main;->processOne(Ljava/lang/String;Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;)V
    :try_end_5
    .catch Lcom/android/dx/command/dexer/Main$StopProcessing; {:try_start_5 .. :try_end_5} :catch_1

    .line 185
    .line 186
    .line 187
    add-int/lit8 v3, v3, 0x1

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :catch_1
    :cond_8
    :try_start_6
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->classTranslatorPool:Ljava/util/concurrent/ExecutorService;

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->classTranslatorPool:Ljava/util/concurrent/ExecutorService;

    .line 196
    .line 197
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 198
    .line 199
    const-wide/16 v3, 0x258

    .line 200
    .line 201
    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->classDefItemConsumer:Ljava/util/concurrent/ExecutorService;

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 207
    .line 208
    .line 209
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->classDefItemConsumer:Ljava/util/concurrent/ExecutorService;

    .line 210
    .line 211
    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->addToDexFutures:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_b

    .line 225
    .line 226
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Ljava/util/concurrent/Future;
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 231
    .line 232
    :try_start_7
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_7
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 233
    .line 234
    .line 235
    goto :goto_8

    .line 236
    :catch_2
    move-exception v0

    .line 237
    goto/16 :goto_a

    .line 238
    .line 239
    :catch_3
    move-exception v0

    .line 240
    goto/16 :goto_b

    .line 241
    .line 242
    :catch_4
    move-exception v0

    .line 243
    :try_start_8
    iget-object v3, p0, Lcom/android/dx/command/dexer/Main;->errors:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    const/16 v4, 0xa

    .line 250
    .line 251
    if-ge v3, v4, :cond_a

    .line 252
    .line 253
    iget-object v3, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 254
    .line 255
    iget-boolean v3, v3, Lcom/android/dx/command/dexer/Main$Arguments;->debug:Z
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 256
    .line 257
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 258
    .line 259
    if-eqz v3, :cond_9

    .line 260
    .line 261
    :try_start_9
    iget-object v3, v4, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 262
    .line 263
    const-string v4, "Uncaught translation error:"

    .line 264
    .line 265
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iget-object v3, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 273
    .line 274
    iget-object v3, v3, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 275
    .line 276
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 277
    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_9
    iget-object v3, v4, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 281
    .line 282
    new-instance v4, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    const-string v5, "Uncaught translation error: "

    .line 288
    .line 289
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_a
    new-instance v0, Ljava/lang/InterruptedException;

    .line 308
    .line 309
    const-string v2, "Too many errors"

    .line 310
    .line 311
    invoke-direct {v0, v2}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v0
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 315
    :cond_b
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->errors:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eqz v0, :cond_d

    .line 322
    .line 323
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 324
    .line 325
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 326
    .line 327
    new-instance v2, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string v3, " error"

    .line 336
    .line 337
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    if-ne v0, v10, :cond_c

    .line 341
    .line 342
    const-string v0, ""

    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_c
    const-string v0, "s"

    .line 346
    .line 347
    :goto_9
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v0, "; aborting"

    .line 351
    .line 352
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    return v1

    .line 363
    :cond_d
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 364
    .line 365
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->incremental:Z

    .line 366
    .line 367
    if-eqz v0, :cond_e

    .line 368
    .line 369
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main;->anyFilesProcessed:Z

    .line 370
    .line 371
    if-nez v0, :cond_e

    .line 372
    .line 373
    return v10

    .line 374
    :cond_e
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main;->anyFilesProcessed:Z

    .line 375
    .line 376
    if-nez v0, :cond_f

    .line 377
    .line 378
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 379
    .line 380
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->emptyOk:Z

    .line 381
    .line 382
    if-nez v0, :cond_f

    .line 383
    .line 384
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 385
    .line 386
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 387
    .line 388
    const-string v0, "no classfiles specified"

    .line 389
    .line 390
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return v1

    .line 394
    :cond_f
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 395
    .line 396
    iget-boolean v1, v0, Lcom/android/dx/command/dexer/Main$Arguments;->optimize:Z

    .line 397
    .line 398
    if-eqz v1, :cond_10

    .line 399
    .line 400
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->statistics:Z

    .line 401
    .line 402
    if-eqz v0, :cond_10

    .line 403
    .line 404
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 405
    .line 406
    iget-object v0, p0, Lcom/android/dx/command/dexer/DxContext;->codeStatistics:Lcom/android/dx/dex/cf/CodeStatistics;

    .line 407
    .line 408
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 409
    .line 410
    invoke-virtual {v0, p0}, Lcom/android/dx/dex/cf/CodeStatistics;->dumpStatistics(Ljava/io/PrintStream;)V

    .line 411
    .line 412
    .line 413
    :cond_10
    return v10

    .line 414
    :goto_a
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->classTranslatorPool:Ljava/util/concurrent/ExecutorService;

    .line 415
    .line 416
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 417
    .line 418
    .line 419
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->classDefItemConsumer:Ljava/util/concurrent/ExecutorService;

    .line 420
    .line 421
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 425
    .line 426
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 427
    .line 428
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 429
    .line 430
    .line 431
    const-string p0, "Unexpected exception in translator thread."

    .line 432
    .line 433
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 434
    .line 435
    .line 436
    return v1

    .line 437
    :goto_b
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->classTranslatorPool:Ljava/util/concurrent/ExecutorService;

    .line 438
    .line 439
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 440
    .line 441
    .line 442
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->classDefItemConsumer:Ljava/util/concurrent/ExecutorService;

    .line 443
    .line 444
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    const-string p0, "Translation has been interrupted"

    .line 448
    .line 449
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 450
    .line 451
    .line 452
    return v1
.end method

.method private processClass(Ljava/lang/String;[B)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->coreLibrary:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->checkClassName(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    new-instance v1, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v2, p0

    .line 15
    move-object v3, p1

    .line 16
    move-object v4, p2

    .line 17
    invoke-direct/range {v1 .. v6}, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;-><init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[BLjava/util/concurrent/Future;Lcom/android/dx/command/dexer/Main$1;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lcom/android/dx/command/dexer/Main$ClassParserTask;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-direct {p0, v2, v3, v4, p1}, Lcom/android/dx/command/dexer/Main$ClassParserTask;-><init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[BLcom/android/dx/command/dexer/Main$1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/android/dx/command/dexer/Main$ClassParserTask;->call()Lcom/android/dx/cf/direct/DirectClassFile;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {v1, p0}, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->access$700(Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;Lcom/android/dx/cf/direct/DirectClassFile;)Ljava/lang/Boolean;
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    move-object p0, v0

    .line 37
    const-string p1, "Exception parsing classes"

    .line 38
    .line 39
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :catch_1
    move-exception v0

    .line 45
    move-object p0, v0

    .line 46
    throw p0
.end method

.method private processFileBytes(Ljava/lang/String;J[B)Z
    .locals 8

    .line 1
    const-string v0, ".class"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "classes.dex"

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    move v2, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v3

    .line 22
    :goto_0
    if-nez v0, :cond_2

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    iget-object p2, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 29
    .line 30
    iget-boolean p2, p2, Lcom/android/dx/command/dexer/Main$Arguments;->verbose:Z

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 35
    .line 36
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 37
    .line 38
    const-string p2, "ignored resource "

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return v3

    .line 48
    :cond_2
    iget-object v5, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 49
    .line 50
    iget-boolean v5, v5, Lcom/android/dx/command/dexer/Main$Arguments;->verbose:Z

    .line 51
    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    iget-object v5, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 55
    .line 56
    iget-object v5, v5, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 57
    .line 58
    new-instance v6, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v7, "processing "

    .line 61
    .line 62
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v7, "..."

    .line 69
    .line 70
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-static {p1}, Lcom/android/dx/command/dexer/Main;->fixPath(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 89
    .line 90
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->keepClassesInJar:Z

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 95
    .line 96
    monitor-enter v0

    .line 97
    :try_start_0
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 98
    .line 99
    invoke-virtual {v1, p1, p4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    monitor-exit v0

    .line 103
    goto :goto_1

    .line 104
    :catchall_0
    move-exception p0

    .line 105
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    throw p0

    .line 107
    :cond_4
    :goto_1
    iget-wide v0, p0, Lcom/android/dx/command/dexer/Main;->minimumFileAge:J

    .line 108
    .line 109
    cmp-long p2, p2, v0

    .line 110
    .line 111
    if-gez p2, :cond_5

    .line 112
    .line 113
    return v4

    .line 114
    :cond_5
    invoke-direct {p0, p1, p4}, Lcom/android/dx/command/dexer/Main;->processClass(Ljava/lang/String;[B)Z

    .line 115
    .line 116
    .line 117
    return v3

    .line 118
    :cond_6
    if-eqz v1, :cond_7

    .line 119
    .line 120
    iget-object p2, p0, Lcom/android/dx/command/dexer/Main;->libraryDexBuffers:Ljava/util/List;

    .line 121
    .line 122
    monitor-enter p2

    .line 123
    :try_start_1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->libraryDexBuffers:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {p0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    monitor-exit p2

    .line 129
    return v4

    .line 130
    :catchall_1
    move-exception p0

    .line 131
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    throw p0

    .line 133
    :cond_7
    iget-object p2, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 134
    .line 135
    monitor-enter p2

    .line 136
    :try_start_2
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 137
    .line 138
    invoke-virtual {p0, p1, p4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    monitor-exit p2

    .line 142
    return v4

    .line 143
    :catchall_2
    move-exception p0

    .line 144
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 145
    throw p0
.end method

.method private processOne(Ljava/lang/String;Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/cf/direct/ClassPathOpener;

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;-><init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/command/dexer/Main$1;)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, p1, v2, p2, v1}, Lcom/android/dx/cf/direct/ClassPathOpener;-><init>(Ljava/lang/String;ZLcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;Lcom/android/dx/cf/direct/ClassPathOpener$Consumer;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/android/dx/cf/direct/ClassPathOpener;->process()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, v2}, Lcom/android/dx/command/dexer/Main;->updateStatus(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private static readPathsFromFile(Ljava/lang/String;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/FileReader;

    .line 3
    .line 4
    invoke-direct {v1, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/io/BufferedReader;

    .line 8
    .line 9
    invoke-direct {p0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->fixPath(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    move-object v0, p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->close()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_1
    move-exception p1

    .line 34
    :goto_1
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 37
    .line 38
    .line 39
    :cond_1
    throw p1
.end method

.method private rotateDexFile()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->dexOutPool:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->dexOutputFutures:Ljava/util/List;

    .line 10
    .line 11
    new-instance v3, Lcom/android/dx/command/dexer/Main$DexWriter;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-direct {v3, p0, v0, v4}, Lcom/android/dx/command/dexer/Main$DexWriter;-><init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/command/dexer/Main$1;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->dexOutputArrays:Ljava/util/List;

    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/android/dx/command/dexer/Main;->writeDex(Lcom/android/dx/dex/file/DexFile;)[B

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->createDexFile()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static run(Lcom/android/dx/command/dexer/Main$Arguments;)I
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/command/dexer/DxContext;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/android/dx/command/dexer/DxContext;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/android/dx/command/dexer/Main;-><init>(Lcom/android/dx/command/dexer/DxContext;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lcom/android/dx/command/dexer/Main;->runDx(Lcom/android/dx/command/dexer/Main$Arguments;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method private runMonoDex()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/android/dx/command/dexer/Main$Arguments;->incremental:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 15
    .line 16
    const-string v0, "error: no incremental output name specified"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, -0x1

    .line 22
    return p0

    .line 23
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    iput-wide v3, p0, Lcom/android/dx/command/dexer/Main;->minimumFileAge:J

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v0, v2

    .line 46
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->processAllFiles()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 55
    .line 56
    iget-boolean v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->incremental:Z

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    iget-boolean v1, p0, Lcom/android/dx/command/dexer/Main;->anyFilesProcessed:Z

    .line 62
    .line 63
    if-nez v1, :cond_4

    .line 64
    .line 65
    return v3

    .line 66
    :cond_4
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 75
    .line 76
    iget-object v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->humanOutName:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v1, :cond_5

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    move-object v1, v2

    .line 82
    goto :goto_2

    .line 83
    :cond_6
    :goto_1
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 84
    .line 85
    invoke-direct {p0, v1}, Lcom/android/dx/command/dexer/Main;->writeDex(Lcom/android/dx/dex/file/DexFile;)[B

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-nez v1, :cond_7

    .line 90
    .line 91
    const/4 p0, 0x2

    .line 92
    return p0

    .line 93
    :cond_7
    :goto_2
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 94
    .line 95
    iget-boolean v4, v4, Lcom/android/dx/command/dexer/Main$Arguments;->incremental:Z

    .line 96
    .line 97
    if-eqz v4, :cond_8

    .line 98
    .line 99
    invoke-direct {p0, v1, v0}, Lcom/android/dx/command/dexer/Main;->mergeIncremental([BLjava/io/File;)[B

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_8
    invoke-direct {p0, v1}, Lcom/android/dx/command/dexer/Main;->mergeLibraryDexBuffers([B)[B

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 108
    .line 109
    iget-boolean v4, v1, Lcom/android/dx/command/dexer/Main$Arguments;->jarOutput:Z

    .line 110
    .line 111
    if-eqz v4, :cond_a

    .line 112
    .line 113
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 114
    .line 115
    if-eqz v0, :cond_9

    .line 116
    .line 117
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 118
    .line 119
    const-string v2, "classes.dex"

    .line 120
    .line 121
    invoke-virtual {v1, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_9
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 125
    .line 126
    iget-object v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 127
    .line 128
    invoke-direct {p0, v0}, Lcom/android/dx/command/dexer/Main;->createJar(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_b

    .line 133
    .line 134
    const/4 p0, 0x3

    .line 135
    return p0

    .line 136
    :cond_a
    if-eqz v0, :cond_b

    .line 137
    .line 138
    iget-object v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 139
    .line 140
    if-eqz v1, :cond_b

    .line 141
    .line 142
    invoke-direct {p0, v1}, Lcom/android/dx/command/dexer/Main;->openOutput(Ljava/lang/String;)Ljava/io/OutputStream;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 147
    .line 148
    .line 149
    invoke-direct {p0, v1}, Lcom/android/dx/command/dexer/Main;->closeOutput(Ljava/io/OutputStream;)V

    .line 150
    .line 151
    .line 152
    :cond_b
    return v3
.end method

.method private runMultiDex()I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->mainDexListFile:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->classesInMainDex:Ljava/util/Set;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->mainDexListFile:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/android/dx/command/dexer/Main;->readPathsFromFile(Ljava/lang/String;Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 22
    .line 23
    iget v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->numThreads:I

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->dexOutPool:Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->processAllFiles()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->libraryDexBuffers:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_8

    .line 46
    .line 47
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->dexOutputFutures:Ljava/util/List;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->dexOutPool:Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    new-instance v3, Lcom/android/dx/command/dexer/Main$DexWriter;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v3, p0, v0, v4}, Lcom/android/dx/command/dexer/Main$DexWriter;-><init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/command/dexer/Main$1;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iput-object v4, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 69
    .line 70
    :cond_2
    const/4 v0, 0x0

    .line 71
    :try_start_0
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->dexOutPool:Ljava/util/concurrent/ExecutorService;

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->dexOutPool:Ljava/util/concurrent/ExecutorService;

    .line 77
    .line 78
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 79
    .line 80
    const-wide/16 v3, 0x258

    .line 81
    .line 82
    invoke-interface {v1, v3, v4, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->dexOutputFutures:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/util/concurrent/Future;

    .line 105
    .line 106
    iget-object v3, p0, Lcom/android/dx/command/dexer/Main;->dexOutputArrays:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, [B

    .line 113
    .line 114
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 119
    .line 120
    iget-boolean v2, v1, Lcom/android/dx/command/dexer/Main$Arguments;->jarOutput:Z

    .line 121
    .line 122
    if-eqz v2, :cond_5

    .line 123
    .line 124
    move v1, v0

    .line 125
    :goto_1
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->dexOutputArrays:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-ge v1, v2, :cond_4

    .line 132
    .line 133
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->outputResources:Ljava/util/TreeMap;

    .line 134
    .line 135
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->getDexFileName(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main;->dexOutputArrays:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, [B

    .line 146
    .line 147
    invoke-virtual {v2, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    add-int/lit8 v1, v1, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 154
    .line 155
    iget-object v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 156
    .line 157
    invoke-direct {p0, v1}, Lcom/android/dx/command/dexer/Main;->createJar(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_6

    .line 162
    .line 163
    const/4 p0, 0x3

    .line 164
    return p0

    .line 165
    :cond_5
    iget-object v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 166
    .line 167
    if-eqz v1, :cond_6

    .line 168
    .line 169
    new-instance v1, Ljava/io/File;

    .line 170
    .line 171
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 172
    .line 173
    iget-object v2, v2, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 174
    .line 175
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    move v2, v0

    .line 179
    :goto_2
    iget-object v3, p0, Lcom/android/dx/command/dexer/Main;->dexOutputArrays:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-ge v2, v3, :cond_6

    .line 186
    .line 187
    new-instance v3, Ljava/io/FileOutputStream;

    .line 188
    .line 189
    new-instance v4, Ljava/io/File;

    .line 190
    .line 191
    invoke-static {v2}, Lcom/android/dx/command/dexer/Main;->getDexFileName(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-direct {v4, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 199
    .line 200
    .line 201
    :try_start_1
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main;->dexOutputArrays:Ljava/util/List;

    .line 202
    .line 203
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    check-cast v4, [B

    .line 208
    .line 209
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    .line 211
    .line 212
    invoke-direct {p0, v3}, Lcom/android/dx/command/dexer/Main;->closeOutput(Ljava/io/OutputStream;)V

    .line 213
    .line 214
    .line 215
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :catchall_0
    move-exception v0

    .line 219
    invoke-direct {p0, v3}, Lcom/android/dx/command/dexer/Main;->closeOutput(Ljava/io/OutputStream;)V

    .line 220
    .line 221
    .line 222
    throw v0

    .line 223
    :cond_6
    return v0

    .line 224
    :cond_7
    :try_start_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 225
    .line 226
    const-string v2, "Timed out waiting for dex writer threads."

    .line 227
    .line 228
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 232
    :catch_0
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->dexOutPool:Ljava/util/concurrent/ExecutorService;

    .line 233
    .line 234
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    const-string p0, "Unexpected exception in dex writer thread"

    .line 238
    .line 239
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return v0

    .line 243
    :catch_1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->dexOutPool:Ljava/util/concurrent/ExecutorService;

    .line 244
    .line 245
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 246
    .line 247
    .line 248
    const-string p0, "A dex writer thread has been interrupted."

    .line 249
    .line 250
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return v0

    .line 254
    :cond_8
    new-instance p0, Lcom/android/dex/DexException;

    .line 255
    .line 256
    const-string v0, "Library dex files are not supported in multi-dex mode"

    .line 257
    .line 258
    invoke-direct {p0, v0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw p0
.end method

.method private translateClass([BLcom/android/dx/cf/direct/DirectClassFile;)Lcom/android/dx/dex/file/ClassDefItem;
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 4
    .line 5
    iget-object v3, v1, Lcom/android/dx/command/dexer/Main$Arguments;->cfOptions:Lcom/android/dx/dex/cf/CfOptions;

    .line 6
    .line 7
    iget-object v4, v1, Lcom/android/dx/command/dexer/Main$Arguments;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 8
    .line 9
    iget-object v5, p0, Lcom/android/dx/command/dexer/Main;->outputDex:Lcom/android/dx/dex/file/DexFile;

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    move-object v1, p2

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/android/dx/dex/cf/CfTranslator;->translate(Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/cf/direct/DirectClassFile;[BLcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/file/DexFile;)Lcom/android/dx/dex/file/ClassDefItem;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-object p0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    iget-object p2, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 21
    .line 22
    iget-object p2, p2, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 23
    .line 24
    const-string v0, "\ntrouble processing:"

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 30
    .line 31
    iget-boolean p2, p2, Lcom/android/dx/command/dexer/Main$Arguments;->debug:Z

    .line 32
    .line 33
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    iget-object p2, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lcom/android/dex/util/ExceptionWithContext;->printStackTrace(Ljava/io/PrintStream;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p2, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lcom/android/dex/util/ExceptionWithContext;->printContext(Ljava/io/PrintStream;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->errors:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0
.end method

.method private updateStatus(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main;->anyFilesProcessed:Z

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput-boolean p1, p0, Lcom/android/dx/command/dexer/Main;->anyFilesProcessed:Z

    .line 5
    .line 6
    return-void
.end method

.method private writeDex(Lcom/android/dx/dex/file/DexFile;)[B
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 3
    .line 4
    iget-object v2, v1, Lcom/android/dx/command/dexer/Main$Arguments;->methodToDump:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v0, v1}, Lcom/android/dx/dex/file/DexFile;->toDex(Ljava/io/Writer;Z)[B

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->methodToDump:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->humanOutWriter:Ljava/io/OutputStreamWriter;

    .line 17
    .line 18
    invoke-direct {p0, p1, v1, v2}, Lcom/android/dx/command/dexer/Main;->dumpMethod(Lcom/android/dx/dex/file/DexFile;Ljava/lang/String;Ljava/io/OutputStreamWriter;)V

    .line 19
    .line 20
    .line 21
    move-object v1, v0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->humanOutWriter:Ljava/io/OutputStreamWriter;

    .line 26
    .line 27
    iget-boolean v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->verboseDump:Z

    .line 28
    .line 29
    invoke-virtual {p1, v2, v1}, Lcom/android/dx/dex/file/DexFile;->toDex(Ljava/io/Writer;Z)[B

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 34
    .line 35
    iget-boolean v2, v2, Lcom/android/dx/command/dexer/Main$Arguments;->statistics:Z

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 40
    .line 41
    iget-object v2, v2, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getStatistics()Lcom/android/dx/dex/file/Statistics;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Statistics;->toHuman()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :cond_1
    :try_start_1
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main;->humanOutWriter:Ljava/io/OutputStreamWriter;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/io/OutputStreamWriter;->flush()V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :catch_0
    move-exception p1

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    return-object v1

    .line 65
    :goto_1
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->humanOutWriter:Ljava/io/OutputStreamWriter;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->flush()V

    .line 70
    .line 71
    .line 72
    :cond_3
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 73
    :goto_2
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 74
    .line 75
    iget-boolean v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->debug:Z

    .line 76
    .line 77
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    iget-object v1, v2, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 82
    .line 83
    const-string v2, "\ntrouble writing output:"

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 89
    .line 90
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 91
    .line 92
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    iget-object p0, v2, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 97
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v2, "\ntrouble writing output: "

    .line 101
    .line 102
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_3
    return-object v0
.end method


# virtual methods
.method public runDx(Lcom/android/dx/command/dexer/Main$Arguments;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->errors:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->libraryDexBuffers:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments;->makeOptionsObjects()V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/android/dx/command/dexer/Main$Arguments;->humanOutName:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->openOutput(Ljava/lang/String;)Ljava/io/OutputStream;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v0, Ljava/io/OutputStreamWriter;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main;->humanOutWriter:Ljava/io/OutputStreamWriter;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main;->args:Lcom/android/dx/command/dexer/Main$Arguments;

    .line 37
    .line 38
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->runMultiDex()I

    .line 43
    .line 44
    .line 45
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->closeOutput(Ljava/io/OutputStream;)V

    .line 47
    .line 48
    .line 49
    return v0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main;->runMonoDex()I

    .line 53
    .line 54
    .line 55
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->closeOutput(Ljava/io/OutputStream;)V

    .line 57
    .line 58
    .line 59
    return v0

    .line 60
    :goto_1
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main;->closeOutput(Ljava/io/OutputStream;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

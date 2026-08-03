.class public Lbsh/classpath/BshClassPath;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/classpath/ClassPathListener;
.implements Lbsh/NameSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/classpath/BshClassPath$ClassSource;,
        Lbsh/classpath/BshClassPath$UnqualifiedNameTable;,
        Lbsh/classpath/BshClassPath$AmbiguousName;,
        Lbsh/classpath/BshClassPath$JrtClassSource;,
        Lbsh/classpath/BshClassPath$JarClassSource;,
        Lbsh/classpath/BshClassPath$DirClassSource;,
        Lbsh/classpath/BshClassPath$MappingFeedback;,
        Lbsh/classpath/BshClassPath$GeneratedClassSource;
    }
.end annotation


# static fields
.field private static bootClassPath:Lbsh/classpath/BshClassPath;

.field private static final dotClass:Ljava/util/regex/Pattern;

.field private static mappingFeedbackListener:Lbsh/classpath/BshClassPath$MappingFeedback;

.field private static final moduleName:Ljava/util/regex/Pattern;

.field private static final slashDot:Ljava/util/regex/Pattern;

.field private static final splitClass:Ljava/util/regex/Pattern;

.field private static userClassPath:Lbsh/classpath/BshClassPath;

.field private static userClassPathComp:[Ljava/net/URL;


# instance fields
.field private final classSource:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbsh/classpath/BshClassPath$ClassSource;",
            ">;"
        }
    .end annotation
.end field

.field private final compPaths:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lbsh/classpath/BshClassPath;",
            ">;"
        }
    .end annotation
.end field

.field listeners:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Ljava/lang/ref/WeakReference<",
            "Lbsh/classpath/ClassPathListener;",
            ">;>;"
        }
    .end annotation
.end field

.field private mapsInitialized:Z

.field name:Ljava/lang/String;

.field private nameCompletionIncludesUnqNames:Z

.field private nameSourceListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbsh/NameSource$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private final packageMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final path:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/net/URL;",
            ">;"
        }
    .end annotation
.end field

.field private unqNameTable:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "[/\\\\]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbsh/classpath/BshClassPath;->slashDot:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "^modules/[^/]+/"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lbsh/classpath/BshClassPath;->moduleName:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "\\.[^\\.]+$"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lbsh/classpath/BshClassPath;->dotClass:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "\\.(?=[^.]+$)"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lbsh/classpath/BshClassPath;->splitClass:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lbsh/classpath/BshClassPath;->path:Ljava/util/Set;

    .line 9
    .line 10
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lbsh/classpath/BshClassPath;->packageMap:Ljava/util/Map;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Lbsh/classpath/BshClassPath;->nameCompletionIncludesUnqNames:Z

    .line 32
    .line 33
    new-instance v0, Ljava/util/Vector;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lbsh/classpath/BshClassPath;->listeners:Ljava/util/Vector;

    .line 39
    .line 40
    iput-object p1, p0, Lbsh/classpath/BshClassPath;->name:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {p0}, Lbsh/classpath/BshClassPath;->reset()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/net/URL;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lbsh/classpath/BshClassPath;-><init>(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, p2}, Lbsh/classpath/BshClassPath;->add([Ljava/net/URL;)V

    return-void
.end method

.method public static synthetic a(Ljava/util/ArrayList;Lbsh/classpath/BshClassPath;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/classpath/BshClassPath;->lambda$getFullPath$2(Ljava/util/List;Lbsh/classpath/BshClassPath;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static addMappingFeedback(Lbsh/classpath/BshClassPath$MappingFeedback;)V
    .locals 1

    .line 1
    sget-object v0, Lbsh/classpath/BshClassPath;->mappingFeedbackListener:Lbsh/classpath/BshClassPath$MappingFeedback;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sput-object p0, Lbsh/classpath/BshClassPath;->mappingFeedbackListener:Lbsh/classpath/BshClassPath$MappingFeedback;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Unimplemented: already a listener"

    .line 9
    .line 10
    invoke-static {p0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic b(Lbsh/classpath/BshClassPath;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/classpath/BshClassPath;->lambda$insureInitialized$1(Lbsh/classpath/BshClassPath;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private buildUnqualifiedNameTable()Lbsh/classpath/BshClassPath$UnqualifiedNameTable;
    .locals 4

    .line 1
    new-instance v0, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 7
    .line 8
    new-instance v2, Lbsh/classpath/a;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v0, v3}, Lbsh/classpath/a;-><init>(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Lbsh/classpath/a;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-direct {v2, v0, v3}, Lbsh/classpath/a;-><init>(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static synthetic c(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Lbsh/classpath/BshClassPath;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/classpath/BshClassPath;->lambda$buildUnqualifiedNameTable$4(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Lbsh/classpath/BshClassPath;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static canonicalizeClassName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "modules/"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lbsh/classpath/BshClassPath;->moduleName:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    const/16 v0, 0x2f

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v2, "."

    .line 28
    .line 29
    if-gez v0, :cond_1

    .line 30
    .line 31
    const/16 v0, 0x5c

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ltz v0, :cond_2

    .line 38
    .line 39
    :cond_1
    sget-object v0, Lbsh/classpath/BshClassPath;->slashDot:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :cond_3
    const-string v0, "class "

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    const/4 v0, 0x6

    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :cond_4
    const-string v0, "classes."

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    const/16 v0, 0x8

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    :cond_5
    const-string v0, ".class"

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    sget-object v0, Lbsh/classpath/BshClassPath;->dotClass:Ljava/util/regex/Pattern;

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :cond_6
    return-object p0
.end method

.method private clearCachedStructures()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    .line 3
    .line 4
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->packageMap:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lbsh/classpath/BshClassPath;->unqNameTable:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 16
    .line 17
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->nameSpaceChanged()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic d(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/classpath/BshClassPath;->lambda$searchJarFSForClasses$8(I)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lbsh/classpath/BshClassPath;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lbsh/classpath/BshClassPath;->lambda$getAllNames$6(Ljava/util/List;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Ljava/util/HashSet;Lbsh/classpath/BshClassPath;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/classpath/BshClassPath;->lambda$getPackagesSet$9(Ljava/util/Set;Lbsh/classpath/BshClassPath;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/classpath/BshClassPath;->lambda$buildUnqualifiedNameTable$3(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getBootClassPath()Lbsh/classpath/BshClassPath;
    .locals 4

    .line 1
    sget-object v0, Lbsh/classpath/BshClassPath;->bootClassPath:Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    new-instance v0, Lbsh/classpath/BshClassPath;

    .line 6
    .line 7
    const-string v1, "Boot Class Path"

    .line 8
    .line 9
    invoke-static {}, Lbsh/classpath/BshClassPath;->getRTJarPath()Ljava/net/URL;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    filled-new-array {v2}, [Ljava/net/URL;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2}, Lbsh/classpath/BshClassPath;-><init>(Ljava/lang/String;[Ljava/net/URL;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lbsh/classpath/BshClassPath;->bootClassPath:Lbsh/classpath/BshClassPath;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    new-instance v1, Lbsh/ClassPathException;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v3, " can\'t find boot jar: "

    .line 29
    .line 30
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-direct {v1, v2, v0}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_0
    :goto_0
    sget-object v0, Lbsh/classpath/BshClassPath;->bootClassPath:Lbsh/classpath/BshClassPath;

    .line 45
    .line 46
    return-object v0
.end method

.method private static getRTJarPath()Ljava/net/URL;
    .locals 4

    .line 1
    const-class v0, Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "/java/lang/String.class"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "jrt:/"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Ljava/net/URL;

    .line 22
    .line 23
    const/16 v2, 0x2f

    .line 24
    .line 25
    const/4 v3, 0x5

    .line 26
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->indexOf(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_0
    new-instance v1, Ljava/net/URL;

    .line 40
    .line 41
    const-string v2, "[^!]*$"

    .line 42
    .line 43
    const-string v3, "/"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method private getUnqualifiedNameTable()Lbsh/classpath/BshClassPath$UnqualifiedNameTable;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->unqNameTable:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lbsh/classpath/BshClassPath;->buildUnqualifiedNameTable()Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lbsh/classpath/BshClassPath;->unqNameTable:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->unqNameTable:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 12
    .line 13
    return-object v0
.end method

.method public static getUserClassPath()Lbsh/classpath/BshClassPath;
    .locals 3

    .line 1
    sget-object v0, Lbsh/classpath/BshClassPath;->userClassPath:Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbsh/classpath/BshClassPath;

    .line 6
    .line 7
    const-string v1, "User Class Path"

    .line 8
    .line 9
    invoke-static {}, Lbsh/classpath/BshClassPath;->getUserClassPathComponents()[Ljava/net/URL;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v0, v1, v2}, Lbsh/classpath/BshClassPath;-><init>(Ljava/lang/String;[Ljava/net/URL;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lbsh/classpath/BshClassPath;->userClassPath:Lbsh/classpath/BshClassPath;

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lbsh/classpath/BshClassPath;->userClassPath:Lbsh/classpath/BshClassPath;

    .line 19
    .line 20
    return-object v0
.end method

.method public static getUserClassPathComponents()[Ljava/net/URL;
    .locals 6

    .line 1
    sget-object v0, Lbsh/classpath/BshClassPath;->userClassPathComp:[Ljava/net/URL;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "java.class.path"

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-array v0, v1, [Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    sget-object v2, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    array-length v2, v0

    .line 25
    new-array v2, v2, [Ljava/net/URL;

    .line 26
    .line 27
    :goto_1
    :try_start_0
    array-length v3, v0

    .line 28
    if-ge v1, v3, :cond_2

    .line 29
    .line 30
    new-instance v3, Ljava/io/File;

    .line 31
    .line 32
    new-instance v4, Ljava/io/File;

    .line 33
    .line 34
    aget-object v5, v0, v1

    .line 35
    .line 36
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/io/File;->toURI()Ljava/net/URI;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    aput-object v3, v2, v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    sput-object v2, Lbsh/classpath/BshClassPath;->userClassPathComp:[Ljava/net/URL;

    .line 60
    .line 61
    return-object v2

    .line 62
    :catch_0
    move-exception v0

    .line 63
    new-instance v1, Lbsh/ClassPathException;

    .line 64
    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v3, "can\'t parse class path: "

    .line 68
    .line 69
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-direct {v1, v2, v0}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw v1
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/util/HashSet;Lbsh/classpath/BshClassPath;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lbsh/classpath/BshClassPath;->lambda$getClassesForPackage$0(Ljava/lang/String;Ljava/util/Set;Lbsh/classpath/BshClassPath;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/classpath/BshClassPath;->lambda$searchJrtFSForClasses$7(I)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static isArchiveFileName(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, ".jar"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, ".zip"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, ".jmod"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public static isClassFileName(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, ".class"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static synthetic j(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/classpath/BshClassPath;->lambda$buildUnqualifiedNameTable$5(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$buildUnqualifiedNameTable$3(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;->add(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$buildUnqualifiedNameTable$4(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Lbsh/classpath/BshClassPath;)V
    .locals 2

    .line 1
    iget-object p1, p1, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lbsh/classpath/a;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p0, v1}, Lbsh/classpath/a;-><init>(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static synthetic lambda$buildUnqualifiedNameTable$5(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;->add(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$getAllNames$6(Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lbsh/classpath/BshClassPath;->getClassesForPackage(Ljava/lang/String;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Lbsh/classpath/BshClassPath;->removeInnerClassNames(Ljava/util/Collection;)Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static synthetic lambda$getClassesForPackage$0(Ljava/lang/String;Ljava/util/Set;Lbsh/classpath/BshClassPath;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0}, Lbsh/classpath/BshClassPath;->getClassesForPackage(Ljava/lang/String;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private static synthetic lambda$getFullPath$2(Ljava/util/List;Lbsh/classpath/BshClassPath;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lbsh/classpath/BshClassPath;->getFullPath()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/net/URL;

    .line 20
    .line 21
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method private static synthetic lambda$getPackagesSet$9(Ljava/util/Set;Lbsh/classpath/BshClassPath;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lbsh/classpath/BshClassPath;->packageMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static synthetic lambda$insureInitialized$1(Lbsh/classpath/BshClassPath;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/classpath/BshClassPath;->insureInitialized(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private static synthetic lambda$searchJarFSForClasses$8(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$searchJrtFSForClasses$7(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private map([Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V
    .locals 2

    const/4 v0, 0x0

    .line 193
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 194
    aget-object v1, p1, v0

    invoke-direct {p0, v1, p2}, Lbsh/classpath/BshClassPath;->mapClass(Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private mapClass(Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lbsh/classpath/BshClassPath;->splitClassname(Ljava/lang/String;)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->packageMap:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/util/Set;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lbsh/classpath/BshClassPath;->packageMap:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 40
    .line 41
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public static removeInnerClassNames(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    const-string v2, "$"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, -0x1

    .line 32
    if-eq v1, v2, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-object v0
.end method

.method private reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->path:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/classpath/BshClassPath;->clearCachedStructures()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static searchArchiveForClasses(Ljava/net/URL;)[Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/zip/ZipInputStream;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {v1, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/zip/ZipInputStream;->available()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne p0, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Lbsh/classpath/BshClassPath;->isClassFileName(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lbsh/classpath/BshClassPath;->canonicalizeClassName(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v1}, Ljava/util/zip/ZipInputStream;->close()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    new-array p0, p0, [Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, [Ljava/lang/String;

    .line 64
    .line 65
    return-object p0
.end method

.method public static searchJarFSForClasses(Ljava/net/URL;)[Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    new-instance v2, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/nio/file/FileSystems;->newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;
    :try_end_0
    .catch Ljava/nio/file/FileSystemAlreadyExistsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_2

    .line 12
    .line 13
    .line 14
    :catch_0
    :try_start_1
    invoke-virtual {p0}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ljava/nio/file/FileSystems;->getFileSystem(Ljava/net/URI;)Ljava/nio/file/FileSystem;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v1, "/"

    .line 23
    .line 24
    new-array v2, v0, [Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Ljava/nio/file/FileSystem;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_2

    .line 30
    :try_start_2
    new-array v1, v0, [Ljava/nio/file/FileVisitOption;

    .line 31
    .line 32
    invoke-static {p0, v1}, Ljava/nio/file/Files;->walk(Ljava/nio/file/Path;[Ljava/nio/file/FileVisitOption;)Ljava/util/stream/Stream;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 36
    :try_start_3
    new-instance v1, Lae/d;

    .line 37
    .line 38
    const/16 v2, 0x14

    .line 39
    .line 40
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, La7/b;

    .line 48
    .line 49
    const/16 v3, 0x16

    .line 50
    .line 51
    invoke-direct {v2, v3}, La7/b;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Lae/d;

    .line 59
    .line 60
    const/16 v3, 0x15

    .line 61
    .line 62
    invoke-direct {v2, v3}, Lae/d;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v2, Lbsh/classpath/b;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v2, v3}, Lbsh/classpath/b;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, [Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 80
    .line 81
    :try_start_4
    invoke-interface {p0}, Ljava/util/stream/BaseStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :catch_1
    move-exception p0

    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception v1

    .line 88
    if-eqz p0, :cond_0

    .line 89
    .line 90
    :try_start_5
    invoke-interface {p0}, Ljava/util/stream/BaseStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_1
    move-exception p0

    .line 95
    :try_start_6
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :cond_0
    :goto_0
    throw v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 99
    :goto_1
    :try_start_7
    throw p0
    :try_end_7
    .catch Ljava/net/URISyntaxException; {:try_start_7 .. :try_end_7} :catch_2

    .line 100
    :catch_2
    new-array p0, v0, [Ljava/lang/String;

    .line 101
    .line 102
    return-object p0
.end method

.method public static searchJrtFSForClasses(Ljava/net/URL;)[Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 3
    .line 4
    const-string v2, "jrt:/"

    .line 5
    .line 6
    invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Ljava/nio/file/FileSystems;->getFileSystem(Ljava/net/URI;)Ljava/nio/file/FileSystem;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "modules"

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    filled-new-array {p0}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v1, v2, p0}, Ljava/nio/file/FileSystem;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1

    .line 27
    :try_start_1
    new-array v1, v0, [Ljava/nio/file/FileVisitOption;

    .line 28
    .line 29
    invoke-static {p0, v1}, Ljava/nio/file/Files;->walk(Ljava/nio/file/Path;[Ljava/nio/file/FileVisitOption;)Ljava/util/stream/Stream;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 33
    :try_start_2
    new-instance v1, Lae/d;

    .line 34
    .line 35
    const/16 v2, 0x14

    .line 36
    .line 37
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, La7/b;

    .line 45
    .line 46
    const/16 v3, 0x16

    .line 47
    .line 48
    invoke-direct {v2, v3}, La7/b;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, Lae/d;

    .line 56
    .line 57
    const/16 v3, 0x15

    .line 58
    .line 59
    invoke-direct {v2, v3}, Lae/d;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, Lbsh/classpath/b;

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-direct {v2, v3}, Lbsh/classpath/b;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, [Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    :try_start_3
    invoke-interface {p0}, Ljava/util/stream/BaseStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :catch_0
    move-exception p0

    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception v1

    .line 85
    if-eqz p0, :cond_0

    .line 86
    .line 87
    :try_start_4
    invoke-interface {p0}, Ljava/util/stream/BaseStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_1
    move-exception p0

    .line 92
    :try_start_5
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    :cond_0
    :goto_0
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 96
    :goto_1
    :try_start_6
    throw p0
    :try_end_6
    .catch Ljava/net/URISyntaxException; {:try_start_6 .. :try_end_6} :catch_1

    .line 97
    :catch_1
    new-array p0, v0, [Ljava/lang/String;

    .line 98
    .line 99
    return-object p0
.end method

.method public static splitClassname(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lbsh/classpath/BshClassPath;->canonicalizeClassName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x2e

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    const-string v0, "<unpackaged>"

    .line 15
    .line 16
    filled-new-array {v0, p0}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object v0, Lbsh/classpath/BshClassPath;->splitClass:Ljava/util/regex/Pattern;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static traverseDirForClasses(Ljava/io/File;)[Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0, p0}, Lbsh/classpath/BshClassPath;->traverseDirForClassesAux(Ljava/io/File;Ljava/io/File;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [Ljava/lang/String;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, [Ljava/lang/String;

    .line 16
    .line 17
    return-object p0
.end method

.method public static traverseDirForClassesAux(Ljava/io/File;Ljava/io/File;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-array p1, v2, [Ljava/io/File;

    .line 18
    .line 19
    :cond_0
    :goto_0
    array-length v3, p1

    .line 20
    if-ge v2, v3, :cond_4

    .line 21
    .line 22
    aget-object v3, p1, v2

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-static {p0, v3}, Lbsh/classpath/BshClassPath;->traverseDirForClassesAux(Ljava/io/File;Ljava/io/File;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3}, Lbsh/classpath/BshClassPath;->isClassFileName(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lbsh/classpath/BshClassPath;->canonicalizeClassName(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const-string p0, "problem parsing paths"

    .line 73
    .line 74
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    return-object p0

    .line 79
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    return-object v0
.end method


# virtual methods
.method public add(Ljava/net/URL;)V
    .locals 1

    .line 18
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->path:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 19
    iget-boolean v0, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath;->map(Ljava/net/URL;)V

    :cond_0
    return-void
.end method

.method public add([Ljava/net/URL;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->path:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath;->map([Ljava/net/URL;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public addComponent(Lbsh/classpath/BshClassPath;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lbsh/classpath/BshClassPath;->addListener(Lbsh/classpath/ClassPathListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public addListener(Lbsh/classpath/ClassPathListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->listeners:Ljava/util/Vector;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public addNameSourceListener(Lbsh/NameSource$Listener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->nameSourceListeners:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lbsh/classpath/BshClassPath;->nameSourceListeners:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->nameSourceListeners:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public classMapping(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lbsh/classpath/BshClassPath;->mappingFeedbackListener:Lbsh/classpath/BshClassPath$MappingFeedback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lbsh/classpath/BshClassPath$MappingFeedback;->classMapping(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "Mapping: "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public classPathChanged()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbsh/classpath/BshClassPath;->clearCachedStructures()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->notifyListeners()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public endClassMapping()V
    .locals 2

    .line 1
    sget-object v0, Lbsh/classpath/BshClassPath;->mappingFeedbackListener:Lbsh/classpath/BshClassPath$MappingFeedback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lbsh/classpath/BshClassPath$MappingFeedback;->endClassMapping()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 10
    .line 11
    const-string v1, "End ClassPath Mapping"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public errorWhileMapping(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lbsh/classpath/BshClassPath;->mappingFeedbackListener:Lbsh/classpath/BshClassPath$MappingFeedback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lbsh/classpath/BshClassPath$MappingFeedback;->errorWhileMapping(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public getAllNames()[Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->insureInitialized()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->getPackagesSet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lbe/w;

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    invoke-direct {v2, p0, v3, v0}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Lbsh/classpath/BshClassPath;->nameCompletionIncludesUnqNames:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-direct {p0}, Lbsh/classpath/BshClassPath;->getUnqualifiedNameTable()Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    new-array v1, v1, [Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, [Ljava/lang/String;

    .line 48
    .line 49
    return-object v0
.end method

.method public getClassNameByUnqName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->insureInitialized()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lbsh/classpath/BshClassPath;->getUnqualifiedNameTable()Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lbsh/classpath/BshClassPath$AmbiguousName;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-virtual {p1}, Lbsh/classpath/BshClassPath$AmbiguousName;->get()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    new-instance v0, Lbsh/ClassPathException;

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "Ambiguous class names: "

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, p1}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public getClassSource(Ljava/lang/String;)Lbsh/classpath/BshClassPath$ClassSource;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lbsh/classpath/BshClassPath$ClassSource;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->insureInitialized()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lbsh/classpath/BshClassPath$ClassSource;

    .line 28
    .line 29
    :goto_0
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lbsh/classpath/BshClassPath;

    .line 42
    .line 43
    invoke-virtual {v1, p1}, Lbsh/classpath/BshClassPath;->getClassSource(Ljava/lang/String;)Lbsh/classpath/BshClassPath$ClassSource;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-object v1
.end method

.method public getClassesForPackage(Ljava/lang/String;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->insureInitialized()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->packageMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/Collection;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 23
    .line 24
    new-instance v2, Lbe/w;

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    invoke-direct {v2, p1, v3, v0}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public getFullPath()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/net/URL;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 7
    .line 8
    new-instance v2, Lbsh/classpath/c;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v0, v3}, Lbsh/classpath/c;-><init>(Ljava/util/AbstractCollection;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->path:Ljava/util/Set;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public getNameSourceListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lbsh/NameSource$Listener;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->nameSourceListeners:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPackagesSet()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->insureInitialized()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->packageMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 19
    .line 20
    new-instance v2, Lbsh/classpath/c;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-direct {v2, v0, v3}, Lbsh/classpath/c;-><init>(Ljava/util/AbstractCollection;I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public getPathComponents()[Ljava/net/URL;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->getFullPath()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/net/URL;

    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [Ljava/net/URL;

    .line 13
    .line 14
    return-object v0
.end method

.method public getUnqNameTable()Lbsh/classpath/BshClassPath$UnqualifiedNameTable;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->unqNameTable:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public insureInitialized()V
    .locals 1

    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v0}, Lbsh/classpath/BshClassPath;->insureInitialized(Z)V

    return-void
.end method

.method public insureInitialized(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->startClassMapping()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 11
    .line 12
    new-instance v1, Lae/e;

    .line 13
    .line 14
    const/16 v2, 0x9

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lae/e;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v0, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->path:Ljava/util/Set;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    new-array v1, v1, [Ljava/net/URL;

    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, [Ljava/net/URL;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lbsh/classpath/BshClassPath;->map([Ljava/net/URL;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-boolean p1, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lbsh/classpath/BshClassPath;->endClassMapping()V

    .line 47
    .line 48
    .line 49
    :cond_2
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    .line 51
    .line 52
    return-void
.end method

.method public isMapsInitialized()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    .line 2
    .line 3
    return v0
.end method

.method public isNameCompletionIncludesUnqNames()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/classpath/BshClassPath;->nameCompletionIncludesUnqNames:Z

    .line 2
    .line 3
    return v0
.end method

.method public map(Ljava/net/URL;)V
    .locals 3

    .line 1
    const-string v0, "jrt"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "FileSystem: "

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, Lbsh/classpath/BshClassPath;->classMapping(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lbsh/classpath/BshClassPath;->searchJrtFSForClasses(Ljava/net/URL;)[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lbsh/classpath/BshClassPath$JrtClassSource;

    .line 35
    .line 36
    invoke-direct {v1, p1}, Lbsh/classpath/BshClassPath$JrtClassSource;-><init>(Ljava/net/URL;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v0, v1}, Lbsh/classpath/BshClassPath;->map([Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    const-string v0, "jar"

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0, v0}, Lbsh/classpath/BshClassPath;->classMapping(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lbsh/classpath/BshClassPath;->searchJarFSForClasses(Ljava/net/URL;)[Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v1, Lbsh/classpath/BshClassPath$JarClassSource;

    .line 75
    .line 76
    invoke-direct {v1, p1}, Lbsh/classpath/BshClassPath$JarClassSource;-><init>(Ljava/net/URL;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, v0, v1}, Lbsh/classpath/BshClassPath;->map([Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    invoke-virtual {p1}, Ljava/net/URL;->getFile()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v1, Ljava/io/File;

    .line 88
    .line 89
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    new-instance p1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v0, "Directory "

    .line 101
    .line 102
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath;->classMapping(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Lbsh/classpath/BshClassPath;->traverseDirForClasses(Ljava/io/File;)[Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance v0, Lbsh/classpath/BshClassPath$DirClassSource;

    .line 124
    .line 125
    invoke-direct {v0, v1}, Lbsh/classpath/BshClassPath$DirClassSource;-><init>(Ljava/io/File;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p0, p1, v0}, Lbsh/classpath/BshClassPath;->map([Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_2
    invoke-static {v0}, Lbsh/classpath/BshClassPath;->isArchiveFileName(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_3

    .line 137
    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v1, "Archive: "

    .line 141
    .line 142
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {p0, v0}, Lbsh/classpath/BshClassPath;->classMapping(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-static {p1}, Lbsh/classpath/BshClassPath;->searchArchiveForClasses(Ljava/net/URL;)[Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    new-instance v1, Lbsh/classpath/BshClassPath$JarClassSource;

    .line 160
    .line 161
    invoke-direct {v1, p1}, Lbsh/classpath/BshClassPath$JarClassSource;-><init>(Ljava/net/URL;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p0, v0, v1}, Lbsh/classpath/BshClassPath;->map([Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v1, "Not a classpath component: "

    .line 171
    .line 172
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath;->errorWhileMapping(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public map([Ljava/net/URL;)V
    .locals 4

    const/4 v0, 0x0

    .line 186
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 187
    :try_start_0
    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Lbsh/classpath/BshClassPath;->map(Ljava/net/URL;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error constructing classpath: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object p1, p1, v0

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 189
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath;->errorWhileMapping(Ljava/lang/String;)V

    .line 190
    const-string p1, "Failed to map class path "

    .line 191
    invoke-static {v0, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 192
    invoke-static {p1, v1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public nameSpaceChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->nameSourceListeners:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->nameSourceListeners:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->nameSourceListeners:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lbsh/NameSource$Listener;

    .line 22
    .line 23
    invoke-interface {v1, p0}, Lbsh/NameSource$Listener;->nameSourceChanged(Lbsh/NameSource;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return-void
.end method

.method public notifyListeners()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->listeners:Ljava/util/Vector;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lbsh/classpath/ClassPathListener;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {v1}, Lbsh/classpath/ClassPathListener;->classPathChanged()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public removeListener(Lbsh/classpath/ClassPathListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->listeners:Ljava/util/Vector;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-ne v1, p1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public setClassSource(Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassPath;->classSource:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMapsInitialized(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/classpath/BshClassPath;->mapsInitialized:Z

    .line 2
    .line 3
    return-void
.end method

.method public setNameCompletionIncludesUnqNames(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/classpath/BshClassPath;->nameCompletionIncludesUnqNames:Z

    .line 2
    .line 3
    return-void
.end method

.method public setNameSourceListeners(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbsh/NameSource$Listener;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lbsh/classpath/BshClassPath;->nameSourceListeners:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public setPath([Ljava/net/URL;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbsh/classpath/BshClassPath;->reset()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath;->add([Ljava/net/URL;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setUnqNameTable(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/classpath/BshClassPath;->unqNameTable:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 2
    .line 3
    return-void
.end method

.method public startClassMapping()V
    .locals 2

    .line 1
    sget-object v0, Lbsh/classpath/BshClassPath;->mappingFeedbackListener:Lbsh/classpath/BshClassPath$MappingFeedback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lbsh/classpath/BshClassPath$MappingFeedback;->startClassMapping()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 10
    .line 11
    const-string v1, "Start ClassPath Mapping"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BshClassPath "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->name:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "("

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ") path= "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->path:Ljava/util/Set;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "\ncompPaths = {"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lbsh/classpath/BshClassPath;->compPaths:Ljava/util/Set;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, " }"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
.end method

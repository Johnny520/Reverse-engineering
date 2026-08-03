.class public Lbsh/BshClassManager;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/BshClassManager$MemberCache;,
        Lbsh/BshClassManager$Listener;
    }
.end annotation


# static fields
.field static final memberCache:Lbsh/util/ValueReferenceMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbsh/util/ValueReferenceMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/BshClassManager$MemberCache;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final transient absoluteClassCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field protected final transient absoluteNonClasses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected final transient associatedClasses:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private declaringInterpreter:Lbsh/Interpreter;

.field protected externalClassLoader:Ljava/lang/ClassLoader;

.field protected loaderManager:Lbsh/loader/BshLoaderManager;

.field protected pluginLoader:Lbsh/loader/BshPluginLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbsh/util/ValueReferenceMap;

    .line 2
    .line 3
    new-instance v1, Lbsh/b;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, Lbsh/b;-><init>(I)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Lbsh/util/ValueReferenceMap$Type;->Soft:Lbsh/util/ValueReferenceMap$Type;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lbsh/util/ValueReferenceMap;-><init>(Ljava/util/function/Function;Lbsh/util/ValueReferenceMap$Type;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbsh/loader/BshLoaderManager;

    .line 5
    .line 6
    invoke-direct {v0}, Lbsh/loader/BshLoaderManager;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/BshClassManager;->loaderManager:Lbsh/loader/BshLoaderManager;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbsh/BshClassManager;->absoluteClassCache:Ljava/util/Map;

    .line 17
    .line 18
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lbsh/BshClassManager;->absoluteNonClasses:Ljava/util/Set;

    .line 23
    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lbsh/BshClassManager;->associatedClasses:Ljava/util/Map;

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic a(Ljava/lang/Class;)Lbsh/BshClassManager$MemberCache;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/BshClassManager;->lambda$static$0(Ljava/lang/Class;)Lbsh/BshClassManager$MemberCache;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static cmUnavailable()Lbsh/UtilEvalError;
    .locals 2

    .line 1
    new-instance v0, Lbsh/Capabilities$Unavailable;

    .line 2
    .line 3
    const-string v1, "ClassLoading features unavailable."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/Capabilities$Unavailable;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static createClassManager(Lbsh/Interpreter;)Lbsh/BshClassManager;
    .locals 1

    .line 1
    new-instance v0, Lbsh/classpath/ClassManagerImpl;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/classpath/ClassManagerImpl;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lbsh/BshClassManager;->declaringInterpreter:Lbsh/Interpreter;

    .line 7
    .line 8
    return-object v0
.end method

.method private static synthetic lambda$static$0(Ljava/lang/Class;)Lbsh/BshClassManager$MemberCache;
    .locals 1

    .line 1
    new-instance v0, Lbsh/BshClassManager$MemberCache;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbsh/BshClassManager$MemberCache;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public addClassLoader(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->loaderManager:Lbsh/loader/BshLoaderManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/loader/BshLoaderManager;->addClassLoader(Ljava/lang/ClassLoader;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lbsh/BshClassManager;->classLoaderChanged()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public addClassPath(Ljava/net/URL;)V
    .locals 0

    .line 1
    return-void
.end method

.method public addListener(Lbsh/BshClassManager$Listener;)V
    .locals 0

    .line 1
    return-void
.end method

.method public associateClass(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/BshClassManager;->associatedClasses:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public cacheClassInfo(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/BshClassManager;->absoluteClassCache:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object p1, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lbsh/util/ValueReferenceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p2, p0, Lbsh/BshClassManager;->absoluteNonClasses:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public classExists(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public classForName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lbsh/BshClassManager;->plainClassForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    goto :goto_0

    .line 6
    :catch_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lbsh/BshClassManager;->declaringInterpreter:Lbsh/Interpreter;

    .line 10
    .line 11
    invoke-virtual {v1}, Lbsh/Interpreter;->getCompatibility()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lbsh/BshClassManager;->loadSourceClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    return-object v0
.end method

.method public classLoaderChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public clearCaches()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->absoluteNonClasses:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/BshClassManager;->absoluteClassCache:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 12
    .line 13
    invoke-virtual {v0}, Lbsh/util/ValueReferenceMap;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public defineClass(Ljava/lang/String;[B)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance p2, Lbsh/InterpreterError;

    .line 2
    .line 3
    const-string v0, "Can\'t create class ("

    .line 4
    .line 5
    const-string v1, ") without class manager package."

    .line 6
    .line 7
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p2, p1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p2
.end method

.method public doSuperImport()V
    .locals 1

    .line 1
    invoke-static {}, Lbsh/BshClassManager;->cmUnavailable()Lbsh/UtilEvalError;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    throw v0
.end method

.method public dump(Ljava/io/PrintWriter;)V
    .locals 1

    .line 1
    const-string v0, "BshClassManager: no class manager."

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getAssociatedClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->associatedClasses:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Class;

    .line 8
    .line 9
    return-object p1
.end method

.method public getClassNameByUnqName(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Lbsh/BshClassManager;->cmUnavailable()Lbsh/UtilEvalError;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    throw p1
.end method

.method public getResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->externalClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-class v0, Lbsh/Interpreter;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    return-object v0
.end method

.method public getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->externalClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-class v0, Lbsh/Interpreter;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    return-object v0
.end method

.method public getStrictJava()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->declaringInterpreter:Lbsh/Interpreter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/Interpreter;->getStrictJava()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public hasSuperImport()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public loadGeneratedClass(Ljava/lang/String;[B)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance p2, Lbsh/InterpreterError;

    .line 2
    .line 3
    const-string v0, "Can\'t load generated class ("

    .line 4
    .line 5
    const-string v1, ") without class manager package."

    .line 6
    .line 7
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p2, p1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p2
.end method

.method public loadSourceClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const-string v0, "Loading class from source file: "

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "/"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x2e

    .line 11
    .line 12
    const/16 v3, 0x2f

    .line 13
    .line 14
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, ".java"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p0, v1}, Lbsh/BshClassManager;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_0
    :try_start_0
    new-instance v4, Lbsh/FileReader;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/net/URL;->getContent()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/io/InputStream;

    .line 45
    .line 46
    invoke-direct {v4, v2}, Lbsh/FileReader;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lbsh/BshClassManager;->declaringInterpreter:Lbsh/Interpreter;

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Lbsh/Interpreter;->eval(Ljava/io/Reader;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    :try_start_2
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    move-exception v0

    .line 70
    goto :goto_1

    .line 71
    :catch_1
    move-exception v0

    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    :try_start_3
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_1
    move-exception v1

    .line 79
    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lbsh/EvalError; {:try_start_4 .. :try_end_4} :catch_0

    .line 83
    :goto_1
    sget-object v1, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    .line 99
    .line 100
    :cond_1
    :goto_2
    :try_start_5
    invoke-virtual {p0, p1}, Lbsh/BshClassManager;->plainClassForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p1
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_2

    .line 104
    return-object p1

    .line 105
    :catch_2
    const-string v0, "Class not found in source file: "

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-object v3
.end method

.method public plainClassForName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->externalClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-virtual {p0, p1, v0}, Lbsh/BshClassManager;->cacheClassInfo(Ljava/lang/String;Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public reloadAllClasses()V
    .locals 1

    .line 1
    invoke-static {}, Lbsh/BshClassManager;->cmUnavailable()Lbsh/UtilEvalError;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    throw v0
.end method

.method public reloadClasses([Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {}, Lbsh/BshClassManager;->cmUnavailable()Lbsh/UtilEvalError;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    throw p1
.end method

.method public reloadPackage(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {}, Lbsh/BshClassManager;->cmUnavailable()Lbsh/UtilEvalError;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    throw p1
.end method

.method public removeListener(Lbsh/BshClassManager$Listener;)V
    .locals 0

    .line 1
    return-void
.end method

.method public reset()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/BshClassManager;->clearCaches()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setClassLoader(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/BshClassManager;->externalClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/BshClassManager;->classLoaderChanged()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setClassPath([Ljava/net/URL;)V
    .locals 0

    .line 1
    invoke-static {}, Lbsh/BshClassManager;->cmUnavailable()Lbsh/UtilEvalError;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    throw p1
.end method

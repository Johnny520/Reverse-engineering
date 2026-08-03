.class public Lbsh/NameSpace;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Serializable;
.implements Lbsh/BshClassManager$Listener;
.implements Lbsh/NameSource;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final JAVACODE:Lbsh/NameSpace;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field callerInfoNode:Lbsh/Node;

.field private transient classCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field classInstance:Ljava/lang/Object;

.field private transient classManager:Lbsh/BshClassManager;

.field classStatic:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field protected importedClasses:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private importedCommands:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private importedObjects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private importedPackages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private importedStatic:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field isClass:Z

.field isEnum:Z

.field isInterface:Z

.field isMethod:Z

.field private methods:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lbsh/BshMethod;",
            ">;>;"
        }
    .end annotation
.end field

.field private nameSourceListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbsh/NameSource$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private names:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbsh/Name;",
            ">;"
        }
    .end annotation
.end field

.field private nsName:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private parent:Lbsh/NameSpace;

.field private thisReference:Lbsh/This;

.field private variables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbsh/Variable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbsh/NameSpace;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Called from compiled Java code."

    .line 5
    .line 6
    invoke-direct {v0, v1, v1, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lbsh/NameSpace;->JAVACODE:Lbsh/NameSpace;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lbsh/NameSpace;->isMethod:Z

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 45
    .line 46
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 52
    .line 53
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lbsh/NameSpace;->nameSourceListeners:Ljava/util/List;

    .line 59
    .line 60
    new-instance v0, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 66
    .line 67
    new-instance v0, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 73
    .line 74
    invoke-virtual {p0, p3}, Lbsh/NameSpace;->setName(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->setParent(Lbsh/NameSpace;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p2}, Lbsh/NameSpace;->setClassManager(Lbsh/BshClassManager;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1, p0}, Lbsh/BshClassManager;->addListener(Lbsh/BshClassManager$Listener;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 93
    invoke-direct {p0, p1, v0, p2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, v0, v0, p1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbsh/BshClassManager;)V
    .locals 1

    const/4 v0, 0x0

    .line 92
    invoke-direct {p0, v0, p2, p1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(I)[Lbsh/Variable;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/NameSpace;->lambda$getVariables$1(I)[Lbsh/Variable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(I)[Lbsh/BshMethod;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/NameSpace;->lambda$getMethods$4(I)[Lbsh/BshMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/NameSpace;->lambda$getMethodNames$2(I)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private classForName(Ljava/lang/String;)Ljava/lang/Class;
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
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lbsh/BshClassManager;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private clone(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private clone(Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;)",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private collectExtensionMatches(Ljava/util/List;Ljava/lang/Class;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbsh/BshMethod;",
            ">;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Lbsh/BshMethod;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lbsh/BshMethod;

    .line 19
    .line 20
    iget-boolean v1, v0, Lbsh/BshMethod;->isExtension:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, v0, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-static {v1, p2}, Lbsh/Types;->isJavaBoxTypesAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic d(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/NameSpace;->lambda$getVariableNames$0(I)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lbsh/Variable;)Lbsh/Variable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/NameSpace;->lambda$toLambdaNameSpace$6(Ljava/lang/String;Lbsh/Variable;)Lbsh/Variable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(I)[Lbsh/Variable;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/NameSpace;->lambda$getDeclaredVariables$5(I)[Lbsh/Variable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Ljava/util/List;)Ljava/util/stream/Stream;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/NameSpace;->lambda$getMethods$3(Ljava/util/List;)Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private getClassImpl(Ljava/lang/String;)Ljava/lang/Class;
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
    iget-object v0, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Class;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-static {p1}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lbsh/NameSpace;->getImportedClassImpl(Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-direct {p0, p1}, Lbsh/NameSpace;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lbsh/NameSpace;->cacheClass(Ljava/lang/String;Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    invoke-direct {p0, p1}, Lbsh/NameSpace;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    const-string v0, "getClass(): "

    .line 48
    .line 49
    const-string v1, " not found in "

    .line 50
    .line 51
    filled-new-array {v0, p1, v1, p0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    return-object p1
.end method

.method private getImportedClassImpl(Ljava/lang/String;)Ljava/lang/Class;
    .locals 4
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
    iget-object v0, p0, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lbsh/NameSpace;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-static {v0}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->getNameResolver(Ljava/lang/String;)Lbsh/Name;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lbsh/Name;->toClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    :catch_0
    :cond_1
    const-string v2, "imported unpackaged name not found:"

    .line 34
    .line 35
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1, v0, p1}, Lbsh/BshClassManager;->cacheClassInfo(Ljava/lang/String;Ljava/lang/Class;)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    return-object v1

    .line 53
    :cond_3
    iget-object v0, p0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    const-string v3, "."

    .line 72
    .line 73
    invoke-static {v2, v3, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-direct {p0, v2}, Lbsh/NameSpace;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_5
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Lbsh/BshClassManager;->hasSuperImport()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    invoke-virtual {v0, p1}, Lbsh/BshClassManager;->getClassNameByUnqName(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    invoke-direct {p0, p1}, Lbsh/NameSpace;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :cond_6
    return-object v1
.end method

.method public static identifierToClass(Lbsh/ClassIdentifier;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/ClassIdentifier;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/ClassIdentifier;->getTargetClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getDeclaredVariables$5(I)[Lbsh/Variable;
    .locals 0

    .line 1
    new-array p0, p0, [Lbsh/Variable;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$getMethodNames$2(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$getMethods$3(Ljava/util/List;)Ljava/util/stream/Stream;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getMethods$4(I)[Lbsh/BshMethod;
    .locals 0

    .line 1
    new-array p0, p0, [Lbsh/BshMethod;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$getVariableNames$0(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$getVariables$1(I)[Lbsh/Variable;
    .locals 0

    .line 1
    new-array p0, p0, [Lbsh/Variable;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$toLambdaNameSpace$6(Ljava/lang/String;Lbsh/Variable;)Lbsh/Variable;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lbsh/Variable;->clone()Lbsh/Variable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p1, p0, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 6
    .line 7
    const-string v0, "final"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method private loadScriptedCommand(Ljava/io/InputStream;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/String;Lbsh/Interpreter;)Lbsh/BshMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Lbsh/Interpreter;",
            ")",
            "Lbsh/BshMethod;"
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lbsh/FileReader;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lbsh/FileReader;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :try_start_1
    invoke-virtual {p5, v0, p0, p4}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    .line 8
    .line 9
    :try_start_2
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p3}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :catch_1
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_3
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_1
    move-exception p2

    .line 27
    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lbsh/EvalError; {:try_start_4 .. :try_end_4} :catch_0

    .line 31
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance p2, Lbsh/UtilEvalError;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    new-instance p4, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string p5, "Error loading script: "

    .line 51
    .line 52
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-direct {p2, p3, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw p2
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method

.method private selectMethod([Ljava/lang/Class;Ljava/util/List;Z)Lbsh/BshMethod;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Lbsh/BshMethod;",
            ">;Z)",
            "Lbsh/BshMethod;"
        }
    .end annotation

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lbsh/BshMethod;

    .line 28
    .line 29
    iget-boolean v1, v0, Lbsh/BshMethod;->isExtension:Z

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object p2, p3

    .line 38
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_3

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_3
    invoke-static {p1, p2}, Lbsh/Reflect;->findMostSpecificBshMethod([Ljava/lang/Class;Ljava/util/List;)Lbsh/BshMethod;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method private declared-synchronized writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p1
.end method


# virtual methods
.method public addNameSourceListener(Lbsh/NameSource$Listener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->nameSourceListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public attemptSetPropertyValue(Ljava/lang/String;Ljava/lang/Object;Lbsh/Interpreter;)Z
    .locals 2

    .line 1
    const-string v0, "set"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lbsh/Reflect;->accessorName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, p1, v0}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    :try_start_0
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p0, p1, p2, p3}, Lbsh/NameSpace;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :catch_0
    move-exception p1

    .line 39
    new-instance p2, Lbsh/UtilEvalError;

    .line 40
    .line 41
    invoke-virtual {p1}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, "\'This\' property accessor threw exception: "

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-direct {p2, p3, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw p2

    .line 63
    :cond_1
    const/4 p1, 0x0

    .line 64
    return p1
.end method

.method public cacheClass(Ljava/lang/String;Ljava/lang/Class;)V
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
    iget-object v0, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public classLoaderChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Lbsh/NameSpace;->loadDefaultImports()V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public copy()Lbsh/NameSpace;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lbsh/NameSpace;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, v0, Lbsh/NameSpace;->thisReference:Lbsh/This;

    .line 9
    .line 10
    iget-object v1, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 11
    .line 12
    invoke-direct {p0, v1}, Lbsh/NameSpace;->clone(Ljava/util/Map;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 17
    .line 18
    iget-object v1, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 19
    .line 20
    invoke-direct {p0, v1}, Lbsh/NameSpace;->clone(Ljava/util/Map;)Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 25
    .line 26
    iget-object v1, p0, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 27
    .line 28
    invoke-direct {p0, v1}, Lbsh/NameSpace;->clone(Ljava/util/Map;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 33
    .line 34
    iget-object v1, p0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 35
    .line 36
    invoke-direct {p0, v1}, Lbsh/NameSpace;->clone(Ljava/util/List;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, v0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 41
    .line 42
    iget-object v1, p0, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 43
    .line 44
    invoke-direct {p0, v1}, Lbsh/NameSpace;->clone(Ljava/util/List;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, v0, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 49
    .line 50
    iget-object v1, p0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 51
    .line 52
    invoke-direct {p0, v1}, Lbsh/NameSpace;->clone(Ljava/util/List;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput-object v1, v0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 57
    .line 58
    iget-object v1, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 59
    .line 60
    invoke-direct {p0, v1}, Lbsh/NameSpace;->clone(Ljava/util/List;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, v0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 65
    .line 66
    iget-object v1, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 67
    .line 68
    invoke-direct {p0, v1}, Lbsh/NameSpace;->clone(Ljava/util/Map;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, v0, Lbsh/NameSpace;->names:Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    return-object v0

    .line 75
    :catch_0
    move-exception v0

    .line 76
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v1
.end method

.method public createVariable(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)Lbsh/Variable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/LHS;",
            ")",
            "Lbsh/Variable;"
        }
    .end annotation

    .line 8
    new-instance v0, Lbsh/Variable;

    invoke-direct {v0, p1, p2, p3}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    return-object v0
.end method

.method public createVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Lbsh/Modifiers;",
            ")",
            "Lbsh/Variable;"
        }
    .end annotation

    .line 7
    new-instance v0, Lbsh/Variable;

    invoke-direct {v0, p1, p2, p3, p4}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    return-object v0
.end method

.method public createVariable(Ljava/lang/String;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, p2, p3}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public doSuperImport()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbsh/BshClassManager;->doSuperImport()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public get(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lbsh/CallStack;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getNameResolver(Ljava/lang/String;)Lbsh/Name;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, v0, p2}, Lbsh/Name;->toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public getAllNames()[Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->getAllNamesAux(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-array v1, v1, [Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [Ljava/lang/String;

    .line 20
    .line 21
    return-object v0
.end method

.method public getAllNamesAux(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getAllNamesAux(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public getClass(Ljava/lang/String;)Ljava/lang/Class;
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
    invoke-direct {p0, p1}, Lbsh/NameSpace;->getClassImpl(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_1
    iget-object v0, p0, Lbsh/NameSpace;->classManager:Lbsh/BshClassManager;

    .line 18
    .line 19
    iget-object v0, v0, Lbsh/BshClassManager;->loaderManager:Lbsh/loader/BshLoaderManager;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lbsh/loader/BshLoaderManager;->getLoaderClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method

.method public getClassInstance()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Lbsh/UtilEvalError;

    .line 11
    .line 12
    const-string v1, "Can\'t refer to class instance from static context."

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :cond_1
    new-instance v0, Lbsh/InterpreterError;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Can\'t resolve class instance \'this\' in: "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-direct {v0, v1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public getClassManager()Lbsh/BshClassManager;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->classManager:Lbsh/BshClassManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v1, Lbsh/NameSpace;->JAVACODE:Lbsh/NameSpace;

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    invoke-static {v0}, Lbsh/BshClassManager;->createClassManager(Lbsh/Interpreter;)Lbsh/BshClassManager;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setClassManager(Lbsh/BshClassManager;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lbsh/NameSpace;->classManager:Lbsh/BshClassManager;

    .line 28
    .line 29
    return-object v0
.end method

.method public getCommand(Ljava/lang/String;[Ljava/lang/Class;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const-string v0, "Get command: "

    .line 2
    .line 3
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_4

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    const-string v3, "/"

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, ".bsh"

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-static {v2, p1, v5}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :goto_1
    move-object v9, v4

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    invoke-static {v2, v3, p1, v5}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    goto :goto_1

    .line 53
    :goto_2
    const-string v4, "searching for script: "

    .line 54
    .line 55
    invoke-virtual {v4, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v9}, Lbsh/BshClassManager;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    :try_start_0
    invoke-virtual {v4}, Ljava/net/URL;->getContent()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    move-object v6, v4

    .line 77
    check-cast v6, Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    move-object v5, p0

    .line 80
    move-object v7, p1

    .line 81
    move-object v8, p2

    .line 82
    move-object v10, p3

    .line 83
    :try_start_1
    invoke-direct/range {v5 .. v10}, Lbsh/NameSpace;->loadScriptedCommand(Ljava/io/InputStream;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/String;Lbsh/Interpreter;)Lbsh/BshMethod;

    .line 84
    .line 85
    .line 86
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 87
    return-object p1

    .line 88
    :catch_0
    :cond_1
    move-object v5, p0

    .line 89
    move-object v7, p1

    .line 90
    move-object v8, p2

    .line 91
    move-object v10, p3

    .line 92
    :catch_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    move-object p1, v7

    .line 99
    goto :goto_3

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const/4 p2, 0x1

    .line 106
    invoke-virtual {v2, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    const/16 p3, 0x2f

    .line 111
    .line 112
    const/16 v2, 0x2e

    .line 113
    .line 114
    invoke-virtual {p2, p3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p2, "."

    .line 122
    .line 123
    invoke-static {p1, p2, v7}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :goto_3
    const-string p2, "searching for class: "

    .line 128
    .line 129
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-static {p2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p1}, Lbsh/BshClassManager;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-eqz p1, :cond_3

    .line 145
    .line 146
    return-object p1

    .line 147
    :cond_3
    move-object p1, v7

    .line 148
    move-object p2, v8

    .line 149
    move-object p3, v10

    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_4
    move-object v5, p0

    .line 153
    move-object v7, p1

    .line 154
    move-object v8, p2

    .line 155
    move-object v10, p3

    .line 156
    iget-object p1, v5, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 157
    .line 158
    if-eqz p1, :cond_5

    .line 159
    .line 160
    invoke-virtual {p1, v7, v8, v10}, Lbsh/NameSpace;->getCommand(Ljava/lang/String;[Ljava/lang/Class;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :cond_5
    const/4 p1, 0x0

    .line 166
    return-object p1
.end method

.method public getDeclaredVariables()[Lbsh/Variable;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lbsh/e;

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    invoke-direct {v1, v2}, Lbsh/e;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, [Lbsh/Variable;

    .line 22
    .line 23
    return-object v0
.end method

.method public getExtensionMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/BshMethod;"
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
    move-object v1, p0

    .line 7
    :goto_0
    if-eqz v1, :cond_4

    .line 8
    .line 9
    iget-object v2, v1, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/util/List;

    .line 16
    .line 17
    invoke-direct {p0, v2, p1, v0}, Lbsh/NameSpace;->collectExtensionMatches(Ljava/util/List;Ljava/lang/Class;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    :goto_2
    if-eqz v4, :cond_0

    .line 44
    .line 45
    invoke-static {v4}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v3, v5}, Lbsh/Reflect;->getClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    if-nez v5, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    invoke-virtual {v5}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    iget-object v5, v5, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 67
    .line 68
    invoke-interface {v5, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Ljava/util/List;

    .line 73
    .line 74
    invoke-direct {p0, v5, p1, v0}, Lbsh/NameSpace;->collectExtensionMatches(Ljava/util/List;Ljava/lang/Class;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    :goto_3
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-virtual {v1}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_5

    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    return-object p1

    .line 95
    :cond_5
    invoke-static {p1, p3, v0}, Lbsh/Reflect;->findMostSpecificExtensionMethod(Ljava/lang/Class;[Ljava/lang/Class;Ljava/util/List;)Lbsh/BshMethod;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
.end method

.method public getGlobal(Lbsh/Interpreter;)Lbsh/This;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getGlobal(Lbsh/Interpreter;)Lbsh/This;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public getImportedMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/BshMethod;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {v2, p1, p2, v3}, Lbsh/Reflect;->resolveJavaMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/Invocable;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    new-instance p1, Lbsh/BshMethod;

    .line 29
    .line 30
    invoke-direct {p1, v2, v1}, Lbsh/BshMethod;-><init>(Lbsh/Invocable;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    iget-object v0, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/lang/Class;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-static {v1, p1, p2, v3}, Lbsh/Reflect;->resolveJavaMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/Invocable;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    new-instance p1, Lbsh/BshMethod;

    .line 61
    .line 62
    invoke-direct {p1, v1, v2}, Lbsh/BshMethod;-><init>(Lbsh/Invocable;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_3
    return-object v2
.end method

.method public getImportedVar(Ljava/lang/String;)Lbsh/Variable;
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move-object v2, v1

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_4

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-static {v4, p1, v5}, Lbsh/Reflect;->resolveJavaField(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/Invocable;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-virtual {v4}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v5, Lbsh/LHS;

    .line 35
    .line 36
    invoke-direct {v5, v3, v4}, Lbsh/LHS;-><init>(Ljava/lang/Object;Lbsh/Invocable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v2, v5}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)Lbsh/Variable;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-boolean v4, p0, Lbsh/NameSpace;->isClass:Z

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v4}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v3, v5}, Lbsh/Reflect;->getClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    invoke-virtual {v5}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iget-object v2, v2, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 77
    .line 78
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lbsh/Variable;

    .line 83
    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    :cond_3
    :goto_0
    if-eqz v2, :cond_0

    .line 87
    .line 88
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 89
    .line 90
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    return-object v2

    .line 94
    :cond_4
    iget-object v0, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_6

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Ljava/lang/Class;

    .line 111
    .line 112
    const/4 v3, 0x1

    .line 113
    invoke-static {v2, p1, v3}, Lbsh/Reflect;->resolveJavaField(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/Invocable;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-eqz v2, :cond_5

    .line 118
    .line 119
    invoke-virtual {v2}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v1, Lbsh/LHS;

    .line 124
    .line 125
    invoke-direct {v1, v2}, Lbsh/LHS;-><init>(Lbsh/Invocable;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1, v0, v1}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)Lbsh/Variable;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v1, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 133
    .line 134
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_6
    return-object v1
.end method

.method public getInvocationLine()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getNode()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lbsh/Node;->getLineNumber()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, -0x1

    .line 13
    return v0
.end method

.method public getInvocationText()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getNode()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lbsh/Node;->getText()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "<invoked from Java code>"

    .line 13
    .line 14
    return-object v0
.end method

.method public getMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/BshMethod;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 78
    invoke-virtual {p0, p1, p2, v0}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    move-result-object p1

    return-object p1
.end method

.method public getMethod(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;Z)",
            "Lbsh/BshMethod;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 77
    invoke-virtual {p0, p1, p2, p3, v0}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;ZZ)Lbsh/BshMethod;

    move-result-object p1

    return-object p1
.end method

.method public getMethod(Ljava/lang/String;[Ljava/lang/Class;ZZ)Lbsh/BshMethod;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;ZZ)",
            "Lbsh/BshMethod;"
        }
    .end annotation

    .line 1
    const-string v0, "Get method: "

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    filled-new-array {v0, p1, v1, p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Lbsh/NameSpace;->isClass:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p0, Lbsh/NameSpace;->isEnum:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    if-nez p3, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Lbsh/NameSpace;->getImportedMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/util/List;

    .line 45
    .line 46
    invoke-direct {p0, p2, v0, p4}, Lbsh/NameSpace;->selectMethod([Ljava/lang/Class;Ljava/util/List;Z)Lbsh/BshMethod;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_1
    if-nez v0, :cond_2

    .line 51
    .line 52
    iget-boolean v1, p0, Lbsh/NameSpace;->isClass:Z

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    if-nez p3, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lbsh/NameSpace;->getImportedMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_2
    if-nez v0, :cond_3

    .line 63
    .line 64
    if-nez p3, :cond_3

    .line 65
    .line 66
    iget-object p3, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 67
    .line 68
    if-eqz p3, :cond_3

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p3, p1, p2, v0, p4}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;ZZ)Lbsh/BshMethod;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_3
    return-object v0
.end method

.method public getMethodNames()[Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lbsh/e;

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lbsh/e;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, [Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getMethods()[Lbsh/BshMethod;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lbsh/b;

    .line 12
    .line 13
    const/16 v2, 0xc

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lbsh/b;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lbsh/e;

    .line 23
    .line 24
    const/4 v2, 0x7

    .line 25
    invoke-direct {v1, v2}, Lbsh/e;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, [Lbsh/BshMethod;

    .line 33
    .line 34
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->nsName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNameResolver(Ljava/lang/String;)Lbsh/Name;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v1, Lbsh/Name;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1}, Lbsh/Name;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lbsh/Name;

    .line 26
    .line 27
    return-object p1
.end method

.method public getNode()Lbsh/Node;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->callerInfoNode:Lbsh/Node;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lbsh/NameSpace;->getNode()Lbsh/Node;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return-object v0
.end method

.method public getPackage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lbsh/NameSpace;->getPackage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return-object v0
.end method

.method public getParent()Lbsh/NameSpace;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPropertyValue(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "get"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lbsh/Reflect;->accessorName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lbsh/Reflect;->ZERO_TYPES:[Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0, v2, p2}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :catch_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v0, "is"

    .line 24
    .line 25
    invoke-static {v0, p1}, Lbsh/Reflect;->accessorName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1, v1}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Lbsh/BshMethod;->getReturnType()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    if-ne v0, v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1, v2, p2}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_1
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    return-object p1

    .line 51
    :goto_0
    new-instance p2, Lbsh/UtilEvalError;

    .line 52
    .line 53
    invoke-virtual {p1}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v2, "\'This\' property accessor threw exception: "

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p2, v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw p2
.end method

.method public getSuper(Lbsh/Interpreter;)Lbsh/This;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lbsh/NameSpace;->isClass:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p1, v0}, Lbsh/Reflect;->getClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-boolean v1, v0, Lbsh/NameSpace;->isClass:Z

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getSuper(Lbsh/Interpreter;)Lbsh/This;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_2
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public getThis(Lbsh/Interpreter;)Lbsh/This;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->thisReference:Lbsh/This;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1}, Lbsh/This;->getThis(Lbsh/NameSpace;Lbsh/Interpreter;)Lbsh/This;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lbsh/NameSpace;->thisReference:Lbsh/This;

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lbsh/NameSpace;->thisReference:Lbsh/This;

    .line 12
    .line 13
    return-object p1
.end method

.method public getVariable(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, p1, v0}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getVariable(Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "Get variable: "

    .line 6
    .line 7
    const-string v1, " = "

    .line 8
    .line 9
    filled-new-array {v0, p1, v1, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lbsh/NameSpace;->unwrapVariable(Lbsh/Variable;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lbsh/Variable;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getImportedVar(Ljava/lang/String;)Lbsh/Variable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, p1, p2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_1
    return-object v0
.end method

.method public getVariableNames()[Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lbsh/e;

    .line 12
    .line 13
    const/4 v2, 0x6

    .line 14
    invoke-direct {v1, v2}, Lbsh/e;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, [Ljava/lang/String;

    .line 22
    .line 23
    return-object v0
.end method

.method public getVariableOrProperty(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;Z)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lbsh/NameSpace;->getPropertyValue(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object v0
.end method

.method public getVariables()[Lbsh/Variable;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lbsh/e;

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    invoke-direct {v1, v2}, Lbsh/e;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, [Lbsh/Variable;

    .line 22
    .line 23
    return-object v0
.end method

.method public importClass(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v1}, Lbsh/Name;->suffix(Ljava/lang/String;I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public importCommands(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    const/16 v1, 0x2f

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "/"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x1

    .line 27
    if-le v1, v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-static {v3, v2, p1}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :cond_1
    iget-object v0, p0, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v0, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public importObject(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public importPackage(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public importStatic(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 101
    invoke-virtual/range {v0 .. v6}, Lbsh/NameSpace;->invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {p2}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, v0, p3}, Lbsh/NameSpace;->getCommand(Ljava/lang/String;[Ljava/lang/Class;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    if-nez p6, :cond_0

    .line 12
    .line 13
    const/4 p6, 0x1

    .line 14
    new-array v7, p6, [Z

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    move-object v3, p2

    .line 19
    move-object v4, p3

    .line 20
    move-object v5, p4

    .line 21
    move-object v6, p5

    .line 22
    invoke-virtual/range {v1 .. v7}, Lbsh/NameSpace;->invokeDefaultInvokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;[Z)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    aget-boolean p2, v7, p2

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    move-object v2, p1

    .line 33
    move-object v5, p4

    .line 34
    move-object v6, p5

    .line 35
    :cond_1
    new-instance p1, Lbsh/EvalException;

    .line 36
    .line 37
    invoke-static {v2, v0}, Lbsh/StringUtil;->methodString(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    new-instance p3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string p4, "Command not found: "

    .line 44
    .line 45
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-direct {p1, p2, v6, v5}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    move-object v3, p2

    .line 60
    move-object v4, p3

    .line 61
    move-object v5, p4

    .line 62
    move-object v6, p5

    .line 63
    instance-of p1, v1, Lbsh/BshMethod;

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    check-cast v1, Lbsh/BshMethod;

    .line 68
    .line 69
    invoke-virtual {v1, v3, v4, v5, v6}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_3
    :try_start_1
    check-cast v1, Ljava/lang/Class;

    .line 75
    .line 76
    invoke-static {v1, v3, v4, v5, v6}, Lbsh/Reflect;->invokeCompiledCommand(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    return-object p1

    .line 81
    :catch_0
    move-exception v0

    .line 82
    move-object p1, v0

    .line 83
    const-string p2, "Error invoking compiled command: "

    .line 84
    .line 85
    invoke-virtual {p1, p2, v6, v5}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    throw p1

    .line 90
    :catch_1
    move-exception v0

    .line 91
    move-object v5, p4

    .line 92
    move-object v6, p5

    .line 93
    move-object p1, v0

    .line 94
    const-string p2, "Error loading command: "

    .line 95
    .line 96
    invoke-virtual {p1, p2, v6, v5}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    throw p1
.end method

.method public invokeDefaultInvokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;[Z)Ljava/lang/Object;
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "invoke"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {p0, v0, v2}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v3, v2

    .line 18
    :goto_0
    aput-boolean v3, p6, v2

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, p1, p3, p4, p5}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1
    return-object v1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    const-string p2, "Local method invocation"

    .line 34
    .line 35
    invoke-virtual {p1, p2, p5, p4}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    throw p1
.end method

.method public invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 16
    invoke-virtual/range {v0 .. v5}, Lbsh/NameSpace;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0, p3}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    invoke-virtual/range {v0 .. v6}, Lbsh/This;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public isChildOf(Lbsh/NameSpace;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->isChildOf(Lbsh/NameSpace;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    :cond_0
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public loadDefaultImports()V
    .locals 1

    .line 1
    const-string v0, "org.json"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "android.widget"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "android.view"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "android.text"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "android.os"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "android.graphics"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "android.content"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "android.app"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "java.util.stream"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "java.util.regex"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "java.util.function"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "java.util"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "java.net"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "java.math"

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "java.io"

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v0, "java.lang"

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v0, "/bsh/commands"

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importCommands(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public nameSpaceChanged()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public prune()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setParent(Lbsh/NameSpace;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setClassInstance(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->importObject(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setClassManager(Lbsh/BshClassManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->classManager:Lbsh/BshClassManager;

    .line 2
    .line 3
    return-void
.end method

.method public setClassStatic(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->importStatic(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public setLocalVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lbsh/NameSpace;->setVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setMethod(Lbsh/BshMethod;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/util/List;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->nsName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setNode(Lbsh/Node;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->callerInfoNode:Lbsh/Node;

    .line 2
    .line 3
    return-void
.end method

.method public setPackage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setParent(Lbsh/NameSpace;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lbsh/NameSpace;->loadDefaultImports()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Lbsh/Modifiers;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    invoke-virtual {v1}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {v1}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-ne v2, p2, :cond_1

    .line 19
    .line 20
    iget-object p1, v1, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iput-object p4, v1, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1, p3, v0}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance p2, Lbsh/UtilEvalError;

    .line 31
    .line 32
    const-string p3, "Typed variable: "

    .line 33
    .line 34
    const-string p4, " was previously declared with type: "

    .line 35
    .line 36
    invoke-static {p3, p1, p4}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p2, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p2

    .line 55
    :cond_2
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2, p3, p4}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Z)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 65
    new-instance v0, Lbsh/Modifiers;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lbsh/Modifiers;-><init>(I)V

    if-eqz p4, :cond_0

    .line 66
    const-string p4, "final"

    invoke-virtual {v0, p4}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 67
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    return-void
.end method

.method public setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0, p1, p4}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p4, p2, p1}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    return-object p4

    .line 16
    :cond_1
    if-nez p3, :cond_2

    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    invoke-virtual {p0, p1, p2, p3}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget-object p3, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 29
    .line 30
    .line 31
    return-object p2

    .line 32
    :cond_2
    new-instance p2, Lbsh/UtilEvalError;

    .line 33
    .line 34
    const-string p3, "(Strict Java mode) Assignment to undeclared variable: "

    .line 35
    .line 36
    invoke-static {p3, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p2, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p2
.end method

.method public setVariable(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, p1, p2, v0}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method public setVariable(Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 45
    invoke-virtual {p0, p1, p2, p3, v0}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;

    return-void
.end method

.method public setVariableImpl(Lbsh/Variable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 14
    .line 15
    invoke-virtual {p1}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public setVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 89
    invoke-virtual {p0, p1, p2, p3, v0}, Lbsh/NameSpace;->setVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;ZZ)V

    return-void
.end method

.method public setVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;ZZ)V
    .locals 1

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0, p1, p4}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 4
    .line 5
    .line 6
    move-result-object p4

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    const/4 p3, 0x1

    .line 10
    :try_start_0
    invoke-virtual {p4, p2, p3}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p2

    .line 15
    new-instance p3, Lbsh/UtilEvalError;

    .line 16
    .line 17
    const-string p4, "Variable assignment: "

    .line 18
    .line 19
    const-string v0, ": "

    .line 20
    .line 21
    invoke-static {p4, p1, v0}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p4

    .line 29
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p3, p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw p3

    .line 40
    :cond_0
    if-nez p3, :cond_3

    .line 41
    .line 42
    iget-object p3, p0, Lbsh/NameSpace;->thisReference:Lbsh/This;

    .line 43
    .line 44
    const/4 p4, 0x0

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    iget-object p3, p3, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object p3, p4

    .line 51
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lbsh/NameSpace;->attemptSetPropertyValue(Ljava/lang/String;Ljava/lang/Object;Lbsh/Interpreter;)Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object p3, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2, p4}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    new-instance p2, Lbsh/UtilEvalError;

    .line 72
    .line 73
    const-string p3, "(Strict Java mode) Assignment to undeclared variable: "

    .line 74
    .line 75
    invoke-static {p3, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p2, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_4
    const-string p1, "null variable value"

    .line 84
    .line 85
    invoke-static {p1}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public toLambdaNameSpace()Lbsh/NameSpace;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->copy()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/Stack;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 11
    .line 12
    :goto_0
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v2, v2, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    :goto_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lbsh/NameSpace;

    .line 31
    .line 32
    iget-boolean v3, v2, Lbsh/NameSpace;->isClass:Z

    .line 33
    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    iget-boolean v3, v2, Lbsh/NameSpace;->isEnum:Z

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object v3, v0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 42
    .line 43
    iget-object v2, v2, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {v3, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iget-object v1, v0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 50
    .line 51
    new-instance v2, Lbsh/k;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v2}, Ljava/util/Map;->replaceAll(Ljava/util/function/BiFunction;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "NameSpace: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/NameSpace;->nsName:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lbsh/NameSpace;->nsName:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " ("

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, ")"

    .line 37
    .line 38
    invoke-static {v1, v2, v3}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Lbsh/NameSpace;->isClass:Z

    .line 46
    .line 47
    const-string v2, ""

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    const-string v1, " (class) "

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v1, v2

    .line 55
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, Lbsh/NameSpace;->isInterface:Z

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    const-string v1, " (interface) "

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v1, v2

    .line 66
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-boolean v1, p0, Lbsh/NameSpace;->isEnum:Z

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    const-string v1, " (enum) "

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    move-object v1, v2

    .line 77
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Lbsh/NameSpace;->isMethod:Z

    .line 81
    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    const-string v1, " (method) "

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    move-object v1, v2

    .line 88
    :goto_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    const-string v1, " (class static) "

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_5
    move-object v1, v2

    .line 99
    :goto_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    const-string v2, " (class instance) "

    .line 107
    .line 108
    :cond_6
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method

.method public unsetVariable(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lbsh/NameSpace;->nameSpaceChanged()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public unwrapVariable(Lbsh/Variable;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-virtual {p1}, Lbsh/Variable;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

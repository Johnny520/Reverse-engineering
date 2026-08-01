.class public Lbsh/NameSpace;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;
.implements Lbsh/飘花落叶言子楪苏世哲兰;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final JAVACODE:Lbsh/NameSpace;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field callerInfoNode:Lbsh/飘花落叶言子世兰苏楪哲;

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

.field private transient classManager:Lbsh/飘花落叶言子楪苏哲世兰;

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
            "Lbsh/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;",
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
    invoke-direct {v0, v1, v1, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V

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

.method public constructor <init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V
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
    invoke-virtual {p0, p2}, Lbsh/NameSpace;->setClassManager(Lbsh/飘花落叶言子楪苏哲世兰;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1, p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子楪苏世哲兰;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 93
    invoke-direct {p0, p1, v0, p2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, v0, v0, p1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbsh/飘花落叶言子楪苏哲世兰;)V
    .locals 1

    const/4 v0, 0x0

    .line 92
    invoke-direct {p0, v0, p2, p1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V

    return-void
.end method

.method private classForName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0
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
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private clone(Ljava/util/List;)Ljava/util/List;
    .locals 0
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

    const/4 p0, 0x0

    return-object p0

    .line 11
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method private clone(Ljava/util/Map;)Ljava/util/Map;
    .locals 0
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
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance p0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method private collectExtensionMatches(Ljava/util/List;Ljava/lang/Class;Ljava/util/List;)V
    .locals 1
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
    move-result-object p0

    .line 8
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lbsh/BshMethod;

    .line 19
    .line 20
    iget-boolean v0, p1, Lbsh/BshMethod;->isExtension:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p1, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {v0, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    :goto_1
    return-void
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
    iget-object p0, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Class;

    .line 16
    .line 17
    return-object p0

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
    move-result-object p0

    .line 55
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method

.method private getImportedClassImpl(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3
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
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lbsh/NameSpace;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-static {v0}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->getNameResolver(Ljava/lang/String;)Lbsh/Name;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lbsh/Name;->toClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    :catch_0
    :cond_1
    const-string v1, "imported unpackaged name not found:"

    .line 33
    .line 34
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, p1, v0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_2
    iget-object v0, p0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, "."

    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-direct {p0, v1}, Lbsh/NameSpace;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_4
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    invoke-direct {p0, p1}, Lbsh/NameSpace;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_5
    const/4 p0, 0x0

    .line 118
    return-object p0
.end method

.method public static identifierToClass(Lbsh/飘花落叶言子楪兰哲世苏;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
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
    new-instance v0, Lbsh/飘花落叶言子世苏哲兰楪;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lbsh/飘花落叶言子世苏哲兰楪;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
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
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p3}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    :try_start_3
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_1
    move-exception p1

    .line 23
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lbsh/EvalError; {:try_start_4 .. :try_end_4} :catch_0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lbsh/UtilEvalError;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    new-instance p3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string p4, "Error loading script: "

    .line 48
    .line 49
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw p1
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
    .locals 1
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
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    invoke-direct {p0, p3}, Ljava/util/ArrayList;-><init>(I)V

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
    move-result p3

    .line 21
    if-eqz p3, :cond_2

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    check-cast p3, Lbsh/BshMethod;

    .line 28
    .line 29
    iget-boolean v0, p3, Lbsh/BshMethod;->isExtension:Z

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object p2, p0

    .line 38
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/4 p3, 0x0

    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    return-object p3

    .line 46
    :cond_3
    sget-object p0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 47
    .line 48
    new-instance p0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v0, "find most specific BshMethod for: "

    .line 51
    .line 52
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰([Ljava/lang/Class;Ljava/util/List;)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    const/4 p1, -0x1

    .line 78
    if-ne p0, p1, :cond_4

    .line 79
    .line 80
    return-object p3

    .line 81
    :cond_4
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Lbsh/BshMethod;

    .line 86
    .line 87
    return-object p0
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

.method public static synthetic 飘花落叶言子楪世兰哲苏(I)[Lbsh/Variable;
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

.method public static synthetic 飘花落叶言子楪世兰苏哲(Ljava/lang/String;Lbsh/Variable;)Lbsh/Variable;
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

.method public static synthetic 飘花落叶言子楪世哲兰苏(I)[Ljava/lang/String;
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

.method public static synthetic 飘花落叶言子楪世哲苏兰(I)[Ljava/lang/String;
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

.method public static synthetic 飘花落叶言子楪世苏兰哲(I)[Lbsh/BshMethod;
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

.method public static synthetic 飘花落叶言子楪世苏哲兰(I)[Lbsh/Variable;
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

.method public static synthetic 飘花落叶言子楪苏世哲兰(Ljava/util/List;)Ljava/util/stream/Stream;
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


# virtual methods
.method public addNameSourceListener(Lbsh/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->nameSourceListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public attemptSetPropertyValue(Ljava/lang/String;Ljava/lang/Object;Lbsh/Interpreter;)Z
    .locals 1

    .line 1
    const-string v0, "set"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    new-instance p1, Lbsh/UtilEvalError;

    .line 40
    .line 41
    invoke-virtual {p0}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    new-instance p3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, "\'This\' property accessor threw exception: "

    .line 48
    .line 49
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    const/4 p0, 0x0

    .line 64
    return p0
.end method

.method public cacheClass(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->classCache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object p0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public copy()Lbsh/NameSpace;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    check-cast v1, Lbsh/NameSpace;

    .line 7
    .line 8
    iput-object v0, v1, Lbsh/NameSpace;->thisReference:Lbsh/This;

    .line 9
    .line 10
    iget-object v2, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 11
    .line 12
    invoke-direct {p0, v2}, Lbsh/NameSpace;->clone(Ljava/util/Map;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, v1, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 17
    .line 18
    iget-object v2, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 19
    .line 20
    invoke-direct {p0, v2}, Lbsh/NameSpace;->clone(Ljava/util/Map;)Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, v1, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 25
    .line 26
    iget-object v2, p0, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 27
    .line 28
    invoke-direct {p0, v2}, Lbsh/NameSpace;->clone(Ljava/util/Map;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iput-object v2, v1, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 33
    .line 34
    iget-object v2, p0, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 35
    .line 36
    invoke-direct {p0, v2}, Lbsh/NameSpace;->clone(Ljava/util/List;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, v1, Lbsh/NameSpace;->importedPackages:Ljava/util/List;

    .line 41
    .line 42
    iget-object v2, p0, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 43
    .line 44
    invoke-direct {p0, v2}, Lbsh/NameSpace;->clone(Ljava/util/List;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, v1, Lbsh/NameSpace;->importedCommands:Ljava/util/List;

    .line 49
    .line 50
    iget-object v2, p0, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 51
    .line 52
    invoke-direct {p0, v2}, Lbsh/NameSpace;->clone(Ljava/util/List;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iput-object v2, v1, Lbsh/NameSpace;->importedObjects:Ljava/util/List;

    .line 57
    .line 58
    iget-object v2, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 59
    .line 60
    invoke-direct {p0, v2}, Lbsh/NameSpace;->clone(Ljava/util/List;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, v1, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 65
    .line 66
    iget-object v2, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 67
    .line 68
    invoke-direct {p0, v2}, Lbsh/NameSpace;->clone(Ljava/util/Map;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    iput-object p0, v1, Lbsh/NameSpace;->names:Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    return-object v1

    .line 75
    :catch_0
    move-exception p0

    .line 76
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public createVariable(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)Lbsh/Variable;
    .locals 0
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
    new-instance p0, Lbsh/Variable;

    invoke-direct {p0, p1, p2, p3}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    return-object p0
.end method

.method public createVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;
    .locals 0
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
    new-instance p0, Lbsh/Variable;

    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    return-object p0
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
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public doSuperImport()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲()V

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
    move-result-object p0

    .line 10
    invoke-virtual {p0, v0, p2}, Lbsh/Name;->toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public getAllNames()[Ljava/lang/String;
    .locals 1

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
    move-result p0

    .line 13
    new-array p0, p0, [Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [Ljava/lang/String;

    .line 20
    .line 21
    return-object p0
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
    iget-object p0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getAllNamesAux(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public getClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3
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
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    iget-object p0, p0, Lbsh/NameSpace;->classManager:Lbsh/飘花落叶言子楪苏哲世兰;

    .line 18
    .line 19
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    iget-object p0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :catch_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/ClassLoader;

    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "[BeanShell] GetLoaderClass: "

    .line 50
    .line 51
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, " is null"

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    move-object p0, v1

    .line 70
    :goto_0
    if-eqz p0, :cond_3

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_3
    return-object v1
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
    new-instance p0, Lbsh/UtilEvalError;

    .line 11
    .line 12
    const-string v0, "Can\'t refer to class instance from static context."

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0

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
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->classManager:Lbsh/飘花落叶言子楪苏哲世兰;

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
    invoke-virtual {v0}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    invoke-static {v0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Lbsh/Interpreter;)Lbsh/飘花落叶言子楪苏哲世兰;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setClassManager(Lbsh/飘花落叶言子楪苏哲世兰;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lbsh/NameSpace;->classManager:Lbsh/飘花落叶言子楪苏哲世兰;

    .line 28
    .line 29
    return-object p0
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
    invoke-virtual {p3}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

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
    new-instance v4, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :goto_1
    move-object v9, v4

    .line 61
    goto :goto_2

    .line 62
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    goto :goto_1

    .line 84
    :goto_2
    const-string v4, "searching for script: "

    .line 85
    .line 86
    invoke-virtual {v4, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-static {v4}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v9}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)Ljava/net/URL;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-eqz v4, :cond_1

    .line 102
    .line 103
    :try_start_0
    invoke-virtual {v4}, Ljava/net/URL;->getContent()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    move-object v6, v4

    .line 108
    check-cast v6, Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    move-object v5, p0

    .line 111
    move-object v7, p1

    .line 112
    move-object v8, p2

    .line 113
    move-object v10, p3

    .line 114
    :try_start_1
    invoke-direct/range {v5 .. v10}, Lbsh/NameSpace;->loadScriptedCommand(Ljava/io/InputStream;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/String;Lbsh/Interpreter;)Lbsh/BshMethod;

    .line 115
    .line 116
    .line 117
    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 118
    return-object p0

    .line 119
    :catch_0
    :cond_1
    move-object v5, p0

    .line 120
    move-object v7, p1

    .line 121
    move-object v8, p2

    .line 122
    move-object v10, p3

    .line 123
    :catch_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-eqz p0, :cond_2

    .line 128
    .line 129
    move-object p0, v7

    .line 130
    goto :goto_3

    .line 131
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const/4 p1, 0x1

    .line 137
    invoke-virtual {v2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const/16 p2, 0x2f

    .line 142
    .line 143
    const/16 p3, 0x2e

    .line 144
    .line 145
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string p1, "."

    .line 153
    .line 154
    invoke-static {p0, p1, v7}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    :goto_3
    const-string p1, "searching for class: "

    .line 159
    .line 160
    invoke-static {p1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    if-eqz p0, :cond_3

    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_3
    move-object p0, v5

    .line 179
    move-object p1, v7

    .line 180
    move-object p2, v8

    .line 181
    move-object p3, v10

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_4
    move-object v5, p0

    .line 185
    move-object v7, p1

    .line 186
    move-object v8, p2

    .line 187
    move-object v10, p3

    .line 188
    iget-object p0, v5, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 189
    .line 190
    if-eqz p0, :cond_5

    .line 191
    .line 192
    invoke-virtual {p0, v7, v8, v10}, Lbsh/NameSpace;->getCommand(Ljava/lang/String;[Ljava/lang/Class;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :cond_5
    const/4 p0, 0x0

    .line 198
    return-object p0
.end method

.method public getDeclaredVariables()[Lbsh/Variable;
    .locals 2

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, [Lbsh/Variable;

    .line 22
    .line 23
    return-object p0
.end method

.method public getExtensionMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;
    .locals 8
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
    invoke-static {v4}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

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
    invoke-static {v3, v5}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

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
    move-result p0

    .line 91
    const/4 p2, 0x0

    .line 92
    if-eqz p0, :cond_5

    .line 93
    .line 94
    return-object p2

    .line 95
    :cond_5
    sget-object p0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 96
    .line 97
    new-instance p0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v1, "find most specific extension method for: receiver: "

    .line 100
    .line 101
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, " args: "

    .line 108
    .line 109
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-static {p3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    new-instance p0, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    const/4 v1, 0x0

    .line 136
    move v2, v1

    .line 137
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-ge v2, v3, :cond_7

    .line 142
    .line 143
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Lbsh/BshMethod;

    .line 148
    .line 149
    iget-boolean v4, v3, Lbsh/BshMethod;->isExtension:Z

    .line 150
    .line 151
    if-eqz v4, :cond_6

    .line 152
    .line 153
    iget-object v3, v3, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 154
    .line 155
    if-eqz v3, :cond_6

    .line 156
    .line 157
    invoke-static {v3, p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_7
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    const/4 v2, -0x1

    .line 178
    if-eqz p1, :cond_8

    .line 179
    .line 180
    move p0, v2

    .line 181
    goto/16 :goto_a

    .line 182
    .line 183
    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 186
    .line 187
    .line 188
    move v3, v1

    .line 189
    :goto_5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-ge v3, v4, :cond_c

    .line 194
    .line 195
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    check-cast v5, Lbsh/BshMethod;

    .line 210
    .line 211
    iget-object v5, v5, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 212
    .line 213
    move v6, v1

    .line 214
    :goto_6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-ge v6, v7, :cond_b

    .line 219
    .line 220
    if-ne v3, v6, :cond_9

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_9
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    check-cast v7, Ljava/lang/Integer;

    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    check-cast v7, Lbsh/BshMethod;

    .line 238
    .line 239
    iget-object v7, v7, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 240
    .line 241
    if-eq v5, v7, :cond_a

    .line 242
    .line 243
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    if-eqz v7, :cond_a

    .line 248
    .line 249
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_a
    :goto_7
    add-int/lit8 v6, v6, 0x1

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_b
    :goto_8
    add-int/lit8 v3, v3, 0x1

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_c
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 260
    .line 261
    .line 262
    move-result p0

    .line 263
    const/4 v3, 0x1

    .line 264
    if-ne p0, v3, :cond_d

    .line 265
    .line 266
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    check-cast p0, Ljava/lang/Integer;

    .line 271
    .line 272
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    goto :goto_a

    .line 277
    :cond_d
    new-instance p0, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_e

    .line 291
    .line 292
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, Ljava/lang/Integer;

    .line 297
    .line 298
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    check-cast v4, Lbsh/BshMethod;

    .line 307
    .line 308
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_e
    invoke-static {p3, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰([Ljava/lang/Class;Ljava/util/List;)I

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    if-ltz p0, :cond_f

    .line 317
    .line 318
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    check-cast p0, Ljava/lang/Integer;

    .line 323
    .line 324
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 325
    .line 326
    .line 327
    move-result p0

    .line 328
    goto :goto_a

    .line 329
    :cond_f
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    check-cast p0, Ljava/lang/Integer;

    .line 334
    .line 335
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result p0

    .line 339
    :goto_a
    if-ne p0, v2, :cond_10

    .line 340
    .line 341
    return-object p2

    .line 342
    :cond_10
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    check-cast p0, Lbsh/BshMethod;

    .line 347
    .line 348
    return-object p0
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
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
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
    invoke-static {v2, p1, p2, v3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    new-instance p0, Lbsh/BshMethod;

    .line 29
    .line 30
    invoke-direct {p0, v2, v1}, Lbsh/BshMethod;-><init>(Lbsh/飘花落叶言子世哲苏楪兰;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    iget-object p0, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Class;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-static {v0, p1, p2, v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    new-instance p0, Lbsh/BshMethod;

    .line 61
    .line 62
    invoke-direct {p0, v0, v1}, Lbsh/BshMethod;-><init>(Lbsh/飘花落叶言子世哲苏楪兰;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    return-object v1
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
    :try_start_0
    invoke-static {v4, p1, v5}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 25
    .line 26
    .line 27
    move-result-object v4
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-object v4, v1

    .line 30
    :goto_0
    if-eqz v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v4}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v5, Lbsh/LHS;

    .line 37
    .line 38
    invoke-direct {v5, v3, v4}, Lbsh/LHS;-><init>(Ljava/lang/Object;Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, v2, v5}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)Lbsh/Variable;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-boolean v4, p0, Lbsh/NameSpace;->isClass:Z

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v4}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-static {v3, v5}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    invoke-virtual {v5}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object v2, v2, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 79
    .line 80
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lbsh/Variable;

    .line 85
    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    :cond_3
    :goto_1
    if-eqz v2, :cond_0

    .line 89
    .line 90
    iget-object p0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 91
    .line 92
    invoke-interface {p0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_4
    iget-object v0, p0, Lbsh/NameSpace;->importedStatic:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_6

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Ljava/lang/Class;

    .line 113
    .line 114
    const/4 v3, 0x1

    .line 115
    :try_start_1
    invoke-static {v2, p1, v3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 116
    .line 117
    .line 118
    move-result-object v2
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 119
    goto :goto_2

    .line 120
    :catch_1
    move-object v2, v1

    .line 121
    :goto_2
    if-eqz v2, :cond_5

    .line 122
    .line 123
    invoke-virtual {v2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-instance v1, Lbsh/LHS;

    .line 128
    .line 129
    invoke-direct {v1, v2}, Lbsh/LHS;-><init>(Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p1, v0, v1}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)Lbsh/Variable;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-object p0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 137
    .line 138
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :cond_6
    return-object v1
.end method

.method public getInvocationLine()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lbsh/飘花落叶言子世兰苏楪哲;->getLineNumber()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method public getInvocationText()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lbsh/飘花落叶言子世兰苏楪哲;->getText()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "<invoked from Java code>"

    .line 13
    .line 14
    return-object p0
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

    move-result-object p0

    return-object p0
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

    move-result-object p0

    return-object p0
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
    iget-object p0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    const/4 p3, 0x0

    .line 71
    invoke-virtual {p0, p1, p2, p3, p4}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;ZZ)Lbsh/BshMethod;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_3
    return-object v0
.end method

.method public getMethodNames()[Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, [Ljava/lang/String;

    .line 23
    .line 24
    return-object p0
.end method

.method public getMethods()[Lbsh/BshMethod;
    .locals 2

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lbsh/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance v0, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 23
    .line 24
    const/4 v1, 0x7

    .line 25
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, [Lbsh/BshMethod;

    .line 33
    .line 34
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->nsName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    iget-object p0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lbsh/Name;

    .line 26
    .line 27
    return-object p0
.end method

.method public getNode()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/NameSpace;->callerInfoNode:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object p0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lbsh/NameSpace;->getNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return-object p0
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
    iget-object p0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lbsh/NameSpace;->getPackage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public getParent()Lbsh/NameSpace;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPropertyValue(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "get"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Class;

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
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string v0, "is"

    .line 22
    .line 23
    invoke-static {v0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1, v1}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lbsh/BshMethod;->getReturnType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p1, v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v2, p2}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    return-object p0

    .line 49
    :catch_0
    move-exception p0

    .line 50
    new-instance p1, Lbsh/UtilEvalError;

    .line 51
    .line 52
    invoke-virtual {p0}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "\'This\' property accessor threw exception: "

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw p1
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
    invoke-static {v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    iget-object v0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-boolean p0, v0, Lbsh/NameSpace;->isClass:Z

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getSuper(Lbsh/Interpreter;)Lbsh/This;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
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
    iget-object p0, p0, Lbsh/NameSpace;->thisReference:Lbsh/This;

    .line 12
    .line 13
    return-object p0
.end method

.method public getVariable(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, p1, v0}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
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
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;
    .locals 1

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
    iget-object p0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lbsh/Variable;

    .line 16
    .line 17
    return-object p0

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
    iget-object p0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    return-object v0
.end method

.method public getVariableNames()[Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, [Ljava/lang/String;

    .line 22
    .line 23
    return-object p0
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
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    return-object v0
.end method

.method public getVariables()[Lbsh/Variable;
    .locals 2

    .line 1
    iget-object p0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, [Lbsh/Variable;

    .line 22
    .line 23
    return-object p0
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
    invoke-static {v3, v2, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

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

.method public invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 93
    invoke-virtual/range {v0 .. v6}, Lbsh/NameSpace;->invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

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
    invoke-virtual/range {v1 .. v7}, Lbsh/NameSpace;->invokeDefaultInvokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;[Z)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 p1, 0x0

    .line 27
    aget-boolean p1, v7, p1

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    move-object v2, p1

    .line 33
    move-object v5, p4

    .line 34
    move-object v6, p5

    .line 35
    :cond_1
    new-instance p0, Lbsh/EvalException;

    .line 36
    .line 37
    invoke-static {v2, v0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p2, "Command not found: "

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p0, p1, v6, v5}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_2
    move-object v3, p2

    .line 52
    move-object v4, p3

    .line 53
    move-object v5, p4

    .line 54
    move-object v6, p5

    .line 55
    instance-of p0, v1, Lbsh/BshMethod;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    check-cast v1, Lbsh/BshMethod;

    .line 60
    .line 61
    invoke-virtual {v1, v3, v4, v5, v6}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_3
    :try_start_1
    check-cast v1, Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {v1, v3, v4, v5, v6}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    return-object p0

    .line 73
    :catch_0
    move-exception v0

    .line 74
    move-object p0, v0

    .line 75
    const-string p1, "Error invoking compiled command: "

    .line 76
    .line 77
    invoke-virtual {p0, p1, v6, v5}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    throw p0

    .line 82
    :catch_1
    move-exception v0

    .line 83
    move-object v5, p4

    .line 84
    move-object v6, p5

    .line 85
    move-object p0, v0

    .line 86
    const-string p1, "Error loading command: "

    .line 87
    .line 88
    invoke-virtual {p0, p1, v6, v5}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    throw p0
.end method

.method public invokeDefaultInvokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;[Z)Ljava/lang/Object;
    .locals 3

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
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v0

    .line 18
    :goto_0
    aput-boolean v2, p6, v0

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1, p3, p4, p5}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    return-object v1

    .line 32
    :catch_0
    move-exception p0

    .line 33
    const-string p1, "Local method invocation"

    .line 34
    .line 35
    invoke-virtual {p0, p1, p5, p4}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0
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
    invoke-virtual/range {v0 .. v5}, Lbsh/NameSpace;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
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
    invoke-virtual/range {v0 .. v6}, Lbsh/This;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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
    move-result-object p0

    .line 21
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->isChildOf(Lbsh/NameSpace;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    :cond_0
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return p0
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
    iget-object p0, p0, Lbsh/NameSpace;->names:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public prune()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

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

.method public setClassManager(Lbsh/飘花落叶言子楪苏哲世兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->classManager:Lbsh/飘花落叶言子楪苏哲世兰;

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
    move-result-object p0

    .line 6
    return-object p0
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
    iget-object p0, p0, Lbsh/NameSpace;->methods:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ljava/util/List;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-interface {p0, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

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

.method public setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/NameSpace;->callerInfoNode:Lbsh/飘花落叶言子世兰苏楪哲;

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
    move-result-object p0

    .line 18
    if-ne p0, p2, :cond_1

    .line 19
    .line 20
    iget-object p0, v1, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 21
    .line 22
    if-nez p0, :cond_0

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
    new-instance p0, Lbsh/UtilEvalError;

    .line 31
    .line 32
    const-string p2, "Typed variable: "

    .line 33
    .line 34
    const-string p3, " was previously declared with type: "

    .line 35
    .line 36
    invoke-static {p2, p1, p3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    iget-object v0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2, p3, p4}, Lbsh/NameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    const/4 p0, 0x1

    .line 12
    invoke-virtual {p4, p2, p0}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V

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
    new-instance p0, Lbsh/UtilEvalError;

    .line 33
    .line 34
    const-string p2, "(Strict Java mode) Assignment to undeclared variable: "

    .line 35
    .line 36
    invoke-static {p2, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0
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
    iget-object p0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 14
    .line 15
    invoke-virtual {p1}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 0

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
    const/4 p0, 0x1

    .line 10
    :try_start_0
    invoke-virtual {p4, p2, p0}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p0

    .line 15
    new-instance p2, Lbsh/UtilEvalError;

    .line 16
    .line 17
    const-string p3, "Variable assignment: "

    .line 18
    .line 19
    const-string p4, ": "

    .line 20
    .line 21
    invoke-static {p3, p1, p4}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p2, p1, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw p2

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
    new-instance p0, Lbsh/UtilEvalError;

    .line 72
    .line 73
    const-string p2, "(Strict Java mode) Assignment to undeclared variable: "

    .line 74
    .line 75
    invoke-static {p2, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_4
    const-string p0, "null variable value"

    .line 84
    .line 85
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public toLambdaNameSpace()Lbsh/NameSpace;
    .locals 3

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
    :goto_0
    iget-object p0, p0, Lbsh/NameSpace;->parent:Lbsh/NameSpace;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    :goto_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lbsh/NameSpace;

    .line 29
    .line 30
    iget-boolean v2, p0, Lbsh/NameSpace;->isClass:Z

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-boolean v2, p0, Lbsh/NameSpace;->isEnum:Z

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iget-object v2, v0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 40
    .line 41
    iget-object p0, p0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 42
    .line 43
    invoke-interface {v2, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object p0, v0, Lbsh/NameSpace;->variables:Ljava/util/Map;

    .line 48
    .line 49
    new-instance v1, Lbsh/飘花落叶言子世兰楪哲苏;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0, v1}, Ljava/util/Map;->replaceAll(Ljava/util/function/BiFunction;)V

    .line 55
    .line 56
    .line 57
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
    invoke-static {v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    iget-object p0, p0, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 103
    .line 104
    if-eqz p0, :cond_6

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
    move-result-object p0

    .line 115
    return-object p0
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
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lbsh/Variable;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

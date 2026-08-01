.class Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Preprocessor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Unresolved;,
        Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Ignored;,
        Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/concurrent/Callable<",
        "+",
        "Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field private final classFileVersion:Lnet/bytebuddy/ClassFileVersion;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

.field private final listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

.field private final plugins:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin;",
            ">;"
        }
    .end annotation
.end field

.field private final preprocessors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin$WithPreprocessor;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lnet/bytebuddy/build/Plugin$Engine$Default;

.field private final typeName:Ljava/lang/String;

.field private final typePool:Lnet/bytebuddy/pool/TypePool;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Default;Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Ljava/lang/String;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/build/Plugin$Engine$Listener;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .param p4    # Lnet/bytebuddy/dynamic/ClassFileLocator;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/pool/TypePool;",
            "Lnet/bytebuddy/build/Plugin$Engine$Listener;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin;",
            ">;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin$WithPreprocessor;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->typeName:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->plugins:Ljava/util/List;

    .line 19
    .line 20
    iput-object p9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->preprocessors:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Default;Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Ljava/lang/String;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/build/Plugin$Engine$Listener;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/build/Plugin$1;)V
    .locals 0

    .line 23
    invoke-direct/range {p0 .. p9}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Default;Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Ljava/lang/String;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/build/Plugin$Engine$Listener;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic access$1300(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1500(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->plugins:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1700(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Source$Element;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1800(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/pool/TypePool;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1900(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 0

    .line 108
    invoke-virtual {p0}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->call()Ljava/util/concurrent/Callable;

    move-result-object p0

    return-object p0
.end method

.method public call()Ljava/util/concurrent/Callable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Callable<",
            "Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->typeName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lnet/bytebuddy/build/Plugin$Engine$Listener;->onDiscovery(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 9
    .line 10
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->typeName:Ljava/lang/String;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :try_start_0
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 28
    .line 29
    invoke-static {v1}, Lnet/bytebuddy/build/Plugin$Engine$Default;->access$800(Lnet/bytebuddy/build/Plugin$Engine$Default;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1, v0}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->preprocessors:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lnet/bytebuddy/build/Plugin$WithPreprocessor;

    .line 56
    .line 57
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 58
    .line 59
    invoke-interface {v3, v0, v4}, Lnet/bytebuddy/build/Plugin$WithPreprocessor;->onPreprocess(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    new-instance v1, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;

    .line 66
    .line 67
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 68
    .line 69
    invoke-direct {v1, p0, v3, v0, v2}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin$1;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_1
    new-instance v1, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Ignored;

    .line 74
    .line 75
    invoke-direct {v1, p0, v0, v2}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Ignored;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin$1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :goto_1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 80
    .line 81
    invoke-interface {p0, v0}, Lnet/bytebuddy/build/Plugin$Engine$Listener;->onComplete(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 82
    .line 83
    .line 84
    instance-of p0, v1, Ljava/lang/Exception;

    .line 85
    .line 86
    if-nez p0, :cond_3

    .line 87
    .line 88
    instance-of p0, v1, Ljava/lang/Error;

    .line 89
    .line 90
    if-nez p0, :cond_2

    .line 91
    .line 92
    invoke-static {v1}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_2
    check-cast v1, Ljava/lang/Error;

    .line 97
    .line 98
    throw v1

    .line 99
    :cond_3
    check-cast v1, Ljava/lang/Exception;

    .line 100
    .line 101
    throw v1

    .line 102
    :cond_4
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Unresolved;

    .line 103
    .line 104
    invoke-direct {v0, p0, v2}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Unresolved;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;Lnet/bytebuddy/build/Plugin$1;)V

    .line 105
    .line 106
    .line 107
    return-object v0
.end method

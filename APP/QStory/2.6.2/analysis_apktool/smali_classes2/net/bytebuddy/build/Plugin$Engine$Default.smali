.class public Lnet/bytebuddy/build/Plugin$Engine$Default;
.super Lnet/bytebuddy/build/Plugin$Engine$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;,
        Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final byteBuddy:Lnet/bytebuddy/ByteBuddy;

.field private final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field private final classFileVersion:Lnet/bytebuddy/ClassFileVersion;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

.field private final errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

.field private final ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

.field private final poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

.field private final typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    invoke-direct {v0}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    invoke-direct {p0, v0}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ByteBuddy;)V
    .locals 1

    .line 44
    sget-object v0, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$Default;->REBASE:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$Default;

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;)V
    .locals 10

    .line 1
    sget-object v3, Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy$Default;->FAST:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy$Default;

    .line 2
    .line 3
    sget-object v4, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    .line 4
    .line 5
    sget-object v6, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;->INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 6
    .line 7
    new-instance v7, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Compound;

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    new-array v0, v0, [Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 11
    .line 12
    sget-object v1, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;->FAIL_FAST:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    sget-object v1, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Enforcing;->ALL_TYPES_RESOLVED:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Enforcing;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    aput-object v1, v0, v2

    .line 21
    .line 22
    sget-object v1, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Enforcing;->NO_LIVE_INITIALIZERS:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Enforcing;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    aput-object v1, v0, v2

    .line 26
    .line 27
    invoke-direct {v7, v0}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Compound;-><init>([Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;)V

    .line 28
    .line 29
    .line 30
    sget-object v8, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation$Factory;->INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation$Factory;

    .line 31
    .line 32
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    const/4 v5, 0x0

    .line 37
    move-object v0, p0

    .line 38
    move-object v1, p1

    .line 39
    move-object v2, p2

    .line 40
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V
    .locals 0
    .param p5    # Lnet/bytebuddy/ClassFileVersion;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ByteBuddy;",
            "Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;",
            "Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/build/Plugin$Engine$Listener;",
            "Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;",
            "Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Lnet/bytebuddy/build/Plugin$Engine$AbstractBase;-><init>()V

    .line 47
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 48
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 49
    iput-object p3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 50
    iput-object p4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 51
    iput-object p5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 52
    iput-object p6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 53
    iput-object p7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 54
    iput-object p8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 55
    iput-object p9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    return-void
.end method

.method public static synthetic access$1200(Lnet/bytebuddy/build/Plugin$Engine$Default;)Lnet/bytebuddy/ByteBuddy;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1400(Lnet/bytebuddy/build/Plugin$Engine$Default;)Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$800(Lnet/bytebuddy/build/Plugin$Engine$Default;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    return-object p0
.end method

.method public static varargs main([Ljava/lang/String;)V
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x2

    .line 3
    if-lt v0, v1, :cond_1

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    array-length v2, p0

    .line 8
    sub-int/2addr v2, v1

    .line 9
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    array-length v3, p0

    .line 17
    invoke-interface {v2, v1, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    new-instance v3, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;

    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v3, v2}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;-><init>(Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v1, Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 51
    .line 52
    invoke-direct {v1}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v2, Ljava/io/File;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    aget-object v3, p0, v3

    .line 59
    .line 60
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Ljava/io/File;

    .line 64
    .line 65
    const/4 v4, 0x1

    .line 66
    aget-object p0, p0, v4

    .line 67
    .line 68
    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2, v3, v0}, Lnet/bytebuddy/build/Plugin$Engine$AbstractBase;->apply(Ljava/io/File;Ljava/io/File;Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine$Summary;

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    const-string p0, "Expected arguments: <source> <target> [<plugin>, ...]"

    .line 76
    .line 77
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static of(Lnet/bytebuddy/build/EntryPoint;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/build/EntryPoint;->byteBuddy(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ByteBuddy;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;

    .line 8
    .line 9
    invoke-direct {v1, p0, p2}, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy$ForEntryPoint;-><init>(Lnet/bytebuddy/build/EntryPoint;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static scan(Ljava/lang/ClassLoader;)Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "META-INF/net.bytebuddy/build.plugins"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Ljava/io/BufferedReader;

    .line 19
    .line 20
    new-instance v2, Ljava/io/InputStreamReader;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/net/URL;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "UTF-8"

    .line 33
    .line 34
    invoke-direct {v2, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    :try_start_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_2

    .line 52
    :cond_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_1
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/build/Plugin$Engine$Source;Lnet/bytebuddy/build/Plugin$Engine$Target;Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine$Summary;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/Plugin$Engine$Source;",
            "Lnet/bytebuddy/build/Plugin$Engine$Target;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/build/Plugin$Factory;",
            ">;)",
            "Lnet/bytebuddy/build/Plugin$Engine$Summary;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v7, Lnet/bytebuddy/build/Plugin$Engine$Listener$Compound;

    .line 4
    .line 5
    iget-object v0, v1, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 6
    .line 7
    new-instance v2, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;

    .line 8
    .line 9
    iget-object v3, v1, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 10
    .line 11
    invoke-direct {v2, v3}, Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;-><init>(Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    new-array v4, v3, [Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    aput-object v0, v4, v11

    .line 19
    .line 20
    const/4 v12, 0x1

    .line 21
    aput-object v2, v4, v12

    .line 22
    .line 23
    invoke-direct {v7, v4}, Lnet/bytebuddy/build/Plugin$Engine$Listener$Compound;-><init>([Lnet/bytebuddy/build/Plugin$Engine$Listener;)V

    .line 24
    .line 25
    .line 26
    new-instance v13, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v14, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v15, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v8, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v9, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    :try_start_0
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Lnet/bytebuddy/build/Plugin$Factory;

    .line 77
    .line 78
    invoke-interface {v4}, Lnet/bytebuddy/build/Plugin$Factory;->make()Lnet/bytebuddy/build/Plugin;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    instance-of v5, v4, Lnet/bytebuddy/build/Plugin$WithPreprocessor;

    .line 86
    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    move-object v5, v4

    .line 90
    check-cast v5, Lnet/bytebuddy/build/Plugin$WithPreprocessor;

    .line 91
    .line 92
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object v1, v0

    .line 98
    goto/16 :goto_13

    .line 99
    .line 100
    :cond_1
    :goto_1
    instance-of v5, v4, Lnet/bytebuddy/build/Plugin$WithInitialization;

    .line 101
    .line 102
    if-eqz v5, :cond_0

    .line 103
    .line 104
    check-cast v4, Lnet/bytebuddy/build/Plugin$WithInitialization;

    .line 105
    .line 106
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/build/Plugin$Engine$Source;->read()Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;

    .line 111
    .line 112
    .line 113
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    :try_start_1
    new-instance v4, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    .line 115
    .line 116
    iget-object v5, v1, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 117
    .line 118
    invoke-interface {v2, v5}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->toClassFileLocator(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    iget-object v6, v1, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 123
    .line 124
    new-array v3, v3, [Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 125
    .line 126
    aput-object v5, v3, v11

    .line 127
    .line 128
    aput-object v6, v3, v12

    .line 129
    .line 130
    invoke-direct {v4, v3}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>([Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 131
    .line 132
    .line 133
    iget-object v3, v1, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 134
    .line 135
    invoke-interface {v3, v4}, Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;->typePool(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-interface {v2}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->getManifest()Ljava/util/jar/Manifest;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-interface {v7, v3}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onManifest(Ljava/util/jar/Manifest;)V

    .line 144
    .line 145
    .line 146
    move-object/from16 v5, p2

    .line 147
    .line 148
    invoke-interface {v5, v3}, Lnet/bytebuddy/build/Plugin$Engine$Target;->write(Ljava/util/jar/Manifest;)Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;

    .line 149
    .line 150
    .line 151
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    .line 152
    :try_start_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_3

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    check-cast v5, Lnet/bytebuddy/build/Plugin$WithInitialization;

    .line 167
    .line 168
    invoke-interface {v5, v4}, Lnet/bytebuddy/build/Plugin$WithInitialization;->initialize(Lnet/bytebuddy/dynamic/ClassFileLocator;)Ljava/util/Map;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-interface {v3, v5}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;->store(Ljava/util/Map;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :catchall_1
    move-exception v0

    .line 177
    move-object/from16 p1, v2

    .line 178
    .line 179
    move-object v11, v3

    .line 180
    goto/16 :goto_11

    .line 181
    .line 182
    :cond_3
    iget-object v0, v1, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 183
    .line 184
    invoke-interface {v0, v3, v13, v14, v15}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;->make(Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine$Dispatcher;

    .line 185
    .line 186
    .line 187
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 188
    :try_start_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v17

    .line 192
    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_e

    .line 197
    .line 198
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 203
    .line 204
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    if-nez v10, :cond_d

    .line 209
    .line 210
    invoke-interface {v0}, Lnet/bytebuddy/build/Plugin$Engine$Source$Element;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    :goto_4
    const-string v11, "/"

    .line 215
    .line 216
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    if-eqz v11, :cond_4

    .line 221
    .line 222
    invoke-virtual {v10, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    goto :goto_4

    .line 227
    :catchall_2
    move-exception v0

    .line 228
    move-object/from16 p1, v2

    .line 229
    .line 230
    move-object v11, v3

    .line 231
    move-object v12, v5

    .line 232
    goto/16 :goto_10

    .line 233
    .line 234
    :cond_4
    const-string v11, ".class"

    .line 235
    .line 236
    invoke-virtual {v10, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    if-eqz v11, :cond_b

    .line 241
    .line 242
    const-string v11, "META-INF"

    .line 243
    .line 244
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 248
    move/from16 v18, v12

    .line 249
    .line 250
    const-string v12, "META-INF/versions/"

    .line 251
    .line 252
    if-eqz v11, :cond_6

    .line 253
    .line 254
    :try_start_4
    invoke-virtual {v10, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 255
    .line 256
    .line 257
    move-result v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 258
    if-eqz v11, :cond_5

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_5
    move-object/from16 p1, v2

    .line 262
    .line 263
    move-object v11, v3

    .line 264
    move-object/from16 p2, v4

    .line 265
    .line 266
    move-object v12, v5

    .line 267
    move-object/from16 v19, v13

    .line 268
    .line 269
    move-object v2, v0

    .line 270
    :goto_5
    move-object v13, v10

    .line 271
    goto/16 :goto_c

    .line 272
    .line 273
    :cond_6
    :goto_6
    :try_start_5
    invoke-virtual {v10, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result v11
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 277
    move-object/from16 p1, v2

    .line 278
    .line 279
    const/16 v2, 0x2f

    .line 280
    .line 281
    move-object/from16 p2, v5

    .line 282
    .line 283
    const/16 v5, 0x12

    .line 284
    .line 285
    if-eqz v11, :cond_7

    .line 286
    .line 287
    :try_start_6
    invoke-virtual {v10, v2, v5}, Ljava/lang/String;->indexOf(II)I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    invoke-virtual {v10, v5, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    invoke-static {v11}, Lnet/bytebuddy/ClassFileVersion;->ofJavaVersion(I)Lnet/bytebuddy/ClassFileVersion;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    goto :goto_8

    .line 304
    :catchall_3
    move-exception v0

    .line 305
    move-object/from16 v12, p2

    .line 306
    .line 307
    move-object v11, v3

    .line 308
    goto/16 :goto_10

    .line 309
    .line 310
    :catch_0
    move-object/from16 v12, p2

    .line 311
    .line 312
    move-object v2, v0

    .line 313
    move-object v11, v3

    .line 314
    move-object/from16 p2, v4

    .line 315
    .line 316
    move-object/from16 v19, v13

    .line 317
    .line 318
    :goto_7
    move-object v13, v10

    .line 319
    goto/16 :goto_b

    .line 320
    .line 321
    :cond_7
    move-object/from16 v11, v16

    .line 322
    .line 323
    :goto_8
    if-eqz v11, :cond_9

    .line 324
    .line 325
    sget-object v2, Lnet/bytebuddy/ClassFileVersion;->JAVA_V8:Lnet/bytebuddy/ClassFileVersion;

    .line 326
    .line 327
    invoke-virtual {v11, v2}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-eqz v2, :cond_8

    .line 332
    .line 333
    iget-object v2, v1, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 334
    .line 335
    if-eqz v2, :cond_8

    .line 336
    .line 337
    sget-object v5, Lnet/bytebuddy/ClassFileVersion;->JAVA_V9:Lnet/bytebuddy/ClassFileVersion;

    .line 338
    .line 339
    invoke-virtual {v2, v5}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_8

    .line 344
    .line 345
    iget-object v2, v1, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 346
    .line 347
    invoke-virtual {v11, v2}, Lnet/bytebuddy/ClassFileVersion;->isAtMost(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-eqz v2, :cond_8

    .line 352
    .line 353
    goto :goto_9

    .line 354
    :cond_8
    invoke-interface {v7, v10}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onResource(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v3, v0}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;->retain(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v12, p2

    .line 361
    .line 362
    move-object v11, v3

    .line 363
    move-object/from16 p2, v4

    .line 364
    .line 365
    move-object/from16 v19, v13

    .line 366
    .line 367
    goto/16 :goto_d

    .line 368
    .line 369
    :cond_9
    :goto_9
    invoke-virtual {v10, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    if-eqz v2, :cond_a

    .line 374
    .line 375
    const/16 v2, 0x2f

    .line 376
    .line 377
    const/16 v5, 0x12

    .line 378
    .line 379
    invoke-virtual {v10, v2, v5}, Ljava/lang/String;->indexOf(II)I

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    add-int/lit8 v5, v5, 0x1

    .line 384
    .line 385
    goto :goto_a

    .line 386
    :cond_a
    const/4 v5, 0x0

    .line 387
    :goto_a
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    add-int/lit8 v2, v2, -0x6

    .line 392
    .line 393
    invoke-virtual {v10, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const/16 v5, 0x2e

    .line 398
    .line 399
    const/16 v12, 0x2f

    .line 400
    .line 401
    invoke-virtual {v2, v12, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    new-instance v5, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 406
    .line 407
    new-instance v12, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;

    .line 408
    .line 409
    invoke-direct {v12, v2, v0, v4}, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;-><init>(Ljava/lang/String;Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Lnet/bytebuddy/dynamic/ClassFileLocator;)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 410
    .line 411
    .line 412
    move-object/from16 v19, v10

    .line 413
    .line 414
    const/4 v10, 0x0

    .line 415
    move-object/from16 v20, v12

    .line 416
    .line 417
    move-object/from16 v12, p2

    .line 418
    .line 419
    move-object/from16 p2, v4

    .line 420
    .line 421
    move-object/from16 v4, v20

    .line 422
    .line 423
    move-object/from16 v20, v2

    .line 424
    .line 425
    move-object v2, v0

    .line 426
    move-object v0, v5

    .line 427
    move-object v5, v11

    .line 428
    move-object v11, v3

    .line 429
    move-object/from16 v3, v20

    .line 430
    .line 431
    move-object/from16 v20, v19

    .line 432
    .line 433
    move-object/from16 v19, v13

    .line 434
    .line 435
    move-object/from16 v13, v20

    .line 436
    .line 437
    :try_start_7
    invoke-direct/range {v0 .. v10}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Default;Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Ljava/lang/String;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/build/Plugin$Engine$Listener;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/build/Plugin$1;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    invoke-interface {v12, v0, v1}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher;->accept(Ljava/util/concurrent/Callable;Z)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 445
    .line 446
    .line 447
    goto :goto_d

    .line 448
    :catchall_4
    move-exception v0

    .line 449
    goto/16 :goto_10

    .line 450
    .line 451
    :catch_1
    move-object/from16 p1, v2

    .line 452
    .line 453
    move-object v11, v3

    .line 454
    move-object/from16 p2, v4

    .line 455
    .line 456
    move-object v12, v5

    .line 457
    move-object/from16 v19, v13

    .line 458
    .line 459
    move-object v2, v0

    .line 460
    goto/16 :goto_7

    .line 461
    .line 462
    :catch_2
    :goto_b
    :try_start_8
    invoke-interface {v7, v13}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onResource(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    invoke-interface {v11, v2}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;->retain(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;)V

    .line 466
    .line 467
    .line 468
    goto :goto_d

    .line 469
    :cond_b
    move/from16 v18, v12

    .line 470
    .line 471
    move-object/from16 p1, v2

    .line 472
    .line 473
    move-object v11, v3

    .line 474
    move-object/from16 p2, v4

    .line 475
    .line 476
    move-object/from16 v19, v13

    .line 477
    .line 478
    move-object v2, v0

    .line 479
    move-object v12, v5

    .line 480
    goto/16 :goto_5

    .line 481
    .line 482
    :goto_c
    const-string v0, "META-INF/MANIFEST.MF"

    .line 483
    .line 484
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-nez v0, :cond_c

    .line 489
    .line 490
    invoke-interface {v7, v13}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onResource(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-interface {v11, v2}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;->retain(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;)V

    .line 494
    .line 495
    .line 496
    :cond_c
    :goto_d
    move-object/from16 v1, p0

    .line 497
    .line 498
    move-object/from16 v2, p1

    .line 499
    .line 500
    move-object/from16 v4, p2

    .line 501
    .line 502
    move-object v3, v11

    .line 503
    move-object v5, v12

    .line 504
    move/from16 v12, v18

    .line 505
    .line 506
    move-object/from16 v13, v19

    .line 507
    .line 508
    const/4 v11, 0x0

    .line 509
    goto/16 :goto_3

    .line 510
    .line 511
    :cond_d
    move-object/from16 p1, v2

    .line 512
    .line 513
    move-object v11, v3

    .line 514
    move-object v12, v5

    .line 515
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 520
    .line 521
    .line 522
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 523
    .line 524
    const-string v1, "Thread interrupted during plugin engine application"

    .line 525
    .line 526
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    throw v0

    .line 530
    :cond_e
    move-object/from16 p1, v2

    .line 531
    .line 532
    move-object v11, v3

    .line 533
    move-object v12, v5

    .line 534
    move-object/from16 v19, v13

    .line 535
    .line 536
    invoke-interface {v12}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher;->complete()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 537
    .line 538
    .line 539
    :try_start_9
    invoke-interface {v12}, Ljava/io/Closeable;->close()V

    .line 540
    .line 541
    .line 542
    invoke-interface {v14}, Ljava/util/Map;->isEmpty()Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-nez v0, :cond_f

    .line 547
    .line 548
    invoke-interface {v7, v14}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Ljava/util/Map;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 549
    .line 550
    .line 551
    goto :goto_e

    .line 552
    :catchall_5
    move-exception v0

    .line 553
    goto :goto_11

    .line 554
    :cond_f
    :goto_e
    :try_start_a
    invoke-interface {v11}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 555
    .line 556
    .line 557
    :try_start_b
    invoke-interface/range {p1 .. p1}, Ljava/io/Closeable;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 558
    .line 559
    .line 560
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    move-object/from16 v2, v16

    .line 565
    .line 566
    :cond_10
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    if-eqz v0, :cond_11

    .line 571
    .line 572
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    move-object v3, v0

    .line 577
    check-cast v3, Lnet/bytebuddy/build/Plugin;

    .line 578
    .line 579
    :try_start_c
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 580
    .line 581
    .line 582
    goto :goto_f

    .line 583
    :catchall_6
    move-exception v0

    .line 584
    :try_start_d
    invoke-interface {v7, v3, v0}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 585
    .line 586
    .line 587
    goto :goto_f

    .line 588
    :catchall_7
    move-exception v0

    .line 589
    if-nez v2, :cond_10

    .line 590
    .line 591
    move-object v2, v0

    .line 592
    goto :goto_f

    .line 593
    :cond_11
    if-nez v2, :cond_12

    .line 594
    .line 595
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Summary;

    .line 596
    .line 597
    move-object/from16 v1, v19

    .line 598
    .line 599
    invoke-direct {v0, v1, v14, v15}, Lnet/bytebuddy/build/Plugin$Engine$Summary;-><init>(Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V

    .line 600
    .line 601
    .line 602
    return-object v0

    .line 603
    :cond_12
    instance-of v0, v2, Ljava/io/IOException;

    .line 604
    .line 605
    if-nez v0, :cond_14

    .line 606
    .line 607
    instance-of v0, v2, Ljava/lang/RuntimeException;

    .line 608
    .line 609
    if-nez v0, :cond_13

    .line 610
    .line 611
    invoke-static {v2}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 612
    .line 613
    .line 614
    return-object v16

    .line 615
    :cond_13
    check-cast v2, Ljava/lang/RuntimeException;

    .line 616
    .line 617
    throw v2

    .line 618
    :cond_14
    check-cast v2, Ljava/io/IOException;

    .line 619
    .line 620
    throw v2

    .line 621
    :catchall_8
    move-exception v0

    .line 622
    goto :goto_12

    .line 623
    :goto_10
    :try_start_e
    invoke-interface {v12}, Ljava/io/Closeable;->close()V

    .line 624
    .line 625
    .line 626
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 627
    :goto_11
    :try_start_f
    invoke-interface {v11}, Ljava/io/Closeable;->close()V

    .line 628
    .line 629
    .line 630
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 631
    :catchall_9
    move-exception v0

    .line 632
    move-object/from16 p1, v2

    .line 633
    .line 634
    :goto_12
    :try_start_10
    invoke-interface/range {p1 .. p1}, Ljava/io/Closeable;->close()V

    .line 635
    .line 636
    .line 637
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 638
    :goto_13
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    :cond_15
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    if-eqz v0, :cond_16

    .line 647
    .line 648
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    move-object v3, v0

    .line 653
    check-cast v3, Lnet/bytebuddy/build/Plugin;

    .line 654
    .line 655
    :try_start_11
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 656
    .line 657
    .line 658
    goto :goto_14

    .line 659
    :catchall_a
    move-exception v0

    .line 660
    :try_start_12
    invoke-interface {v7, v3, v0}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    .line 661
    .line 662
    .line 663
    goto :goto_14

    .line 664
    :catchall_b
    move-exception v0

    .line 665
    if-nez v16, :cond_15

    .line 666
    .line 667
    move-object/from16 v16, v0

    .line 668
    .line 669
    goto :goto_14

    .line 670
    :cond_16
    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lnet/bytebuddy/ByteBuddy;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 69
    .line 70
    if-eqz v3, :cond_7

    .line 71
    .line 72
    if-eqz v2, :cond_8

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Lnet/bytebuddy/ClassFileVersion;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_9

    .line 79
    .line 80
    return v1

    .line 81
    :cond_7
    if-eqz v2, :cond_9

    .line 82
    .line 83
    :cond_8
    return v1

    .line 84
    :cond_9
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 85
    .line 86
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_a

    .line 93
    .line 94
    return v1

    .line 95
    :cond_a
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 96
    .line 97
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_b

    .line 104
    .line 105
    return v1

    .line 106
    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 107
    .line 108
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_c

    .line 115
    .line 116
    return v1

    .line 117
    :cond_c
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 118
    .line 119
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 120
    .line 121
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-nez p0, :cond_d

    .line 126
    .line 127
    return v1

    .line 128
    :cond_d
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 12
    .line 13
    invoke-virtual {v1}, Lnet/bytebuddy/ByteBuddy;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v1, v0

    .line 65
    mul-int/lit8 v1, v1, 0x1f

    .line 66
    .line 67
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-int/2addr v0, v1

    .line 74
    mul-int/lit8 v0, v0, 0x1f

    .line 75
    .line 76
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/2addr v1, v0

    .line 83
    mul-int/lit8 v1, v1, 0x1f

    .line 84
    .line 85
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    add-int/2addr p0, v1

    .line 92
    return p0
.end method

.method public ignore(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/build/Plugin$Engine;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 18
    .line 19
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    invoke-interface {p0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public with(Lnet/bytebuddy/ByteBuddy;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10

    .line 41
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-object v1, p1

    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10
    .param p1    # Lnet/bytebuddy/ClassFileVersion;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 42
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-object v5, p1

    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10

    .line 44
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-object v8, p1

    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/build/Plugin$Engine$Listener;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10

    .line 43
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    new-instance v6, Lnet/bytebuddy/build/Plugin$Engine$Listener$Compound;

    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    const/4 v8, 0x2

    new-array v8, v8, [Lnet/bytebuddy/build/Plugin$Engine$Listener;

    const/4 v9, 0x0

    aput-object v7, v8, v9

    const/4 v7, 0x1

    aput-object p1, v8, v7

    invoke-direct {v6, v8}, Lnet/bytebuddy/build/Plugin$Engine$Listener$Compound;-><init>([Lnet/bytebuddy/build/Plugin$Engine$Listener;)V

    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10

    .line 40
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-object v3, p1

    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10

    .line 39
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-object v2, p1

    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    return-object v0
.end method

.method public with(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 8
    .line 9
    new-instance v4, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    new-array v6, v6, [Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    aput-object v5, v6, v7

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    aput-object p1, v6, v5

    .line 21
    .line 22
    invoke-direct {v4, v6}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>([Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 23
    .line 24
    .line 25
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 26
    .line 27
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 28
    .line 29
    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->errorHandler:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;

    .line 30
    .line 31
    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 32
    .line 33
    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 34
    .line 35
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public withErrorHandlers(Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;",
            ">;)",
            "Lnet/bytebuddy/build/Plugin$Engine;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 14
    .line 15
    new-instance v7, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Compound;

    .line 16
    .line 17
    invoke-direct {v7, p1}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Compound;-><init>(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 21
    .line 22
    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 23
    .line 24
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public withoutErrorHandlers()Lnet/bytebuddy/build/Plugin$Engine;
    .locals 10

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->typeStrategy:Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->poolStrategy:Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->listener:Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 14
    .line 15
    sget-object v7, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;->INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->dispatcherFactory:Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;

    .line 18
    .line 19
    iget-object v9, p0, Lnet/bytebuddy/build/Plugin$Engine$Default;->ignoredTypeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/build/Plugin$Engine$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;Lnet/bytebuddy/build/Plugin$Engine$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/build/Plugin$Engine$Listener;Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

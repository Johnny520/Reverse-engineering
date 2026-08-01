.class public Llin/xposed/hook/javaplugin/controller/PluginManager;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final pluginCallbackMethodTaskExecutor:Ljava/util/concurrent/ExecutorService;

.field private static final pluginLoaderMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llin/xposed/hook/javaplugin/controller/PluginLoader;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginLoaderMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginCallbackMethodTaskExecutor:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static varargs buildMethodSign(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    new-array p1, p1, [Ljava/lang/Class;

    .line 5
    .line 6
    :cond_0
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-wide v0, -0x36a51f0a051405a7L    # -2.39766491969069E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    array-length p1, p1

    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-wide v0, -0x36a51ef4051405a7L    # -2.397694864538979E45

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method private static checkPluginTime(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getDate()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    new-instance v0, Ljava/time/format/DateTimeFormatterBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/time/format/DateTimeFormatterBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide v1, -0x36a54569051405a7L    # -2.3842945449296324E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatterBuilder;->appendPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Ljava/time/temporal/ChronoField;->MONTH_OF_YEAR:Ljava/time/temporal/ChronoField;

    .line 28
    .line 29
    sget-object v2, Ljava/time/format/SignStyle;->NORMAL:Ljava/time/format/SignStyle;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x2

    .line 33
    invoke-virtual {v0, v1, v3, v4, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;IILjava/time/format/SignStyle;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/16 v1, 0x2d

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Ljava/time/format/DateTimeFormatterBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v1, Ljava/time/temporal/ChronoField;->DAY_OF_MONTH:Ljava/time/temporal/ChronoField;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v3, v4, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;IILjava/time/format/SignStyle;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->toFormatter()Ljava/time/format/DateTimeFormatter;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-wide v1, -0x36a54557051405a7L    # -2.3843190452600507E45

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v1, v0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getDate()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0, v0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, v1}, Ljava/time/LocalDate;->isAfter(Ljava/time/chrono/ChronoLocalDate;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0
.end method

.method public static getAllRunningPluginLoader()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Llin/xposed/hook/javaplugin/controller/PluginLoader;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginLoaderMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static varargs invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginLoaderMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 22
    .line 23
    invoke-static {v1, p0, p1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public static varargs invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginCallbackMethodTaskExecutor:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, p1, p2, v2}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static varargs invokeToPluginMethodAndGetInvokeResult(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->methodCache:Ljava/util/Map;

    .line 10
    .line 11
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/controller/PluginManager;->buildMethodSign(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lbsh/BshMethod;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {v0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lbsh/NameSpace;->getMethods()[Lbsh/BshMethod;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    array-length v2, v1

    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_2

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-virtual {v4}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-virtual {v4}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    array-length v5, v5

    .line 63
    array-length v6, p2

    .line 64
    if-ne v5, v6, :cond_1

    .line 65
    .line 66
    invoke-virtual {v4, p2, v0}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    return-object p0

    .line 71
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    new-instance p2, Llin/xposed/hook/javaplugin/PluginOutput;

    .line 75
    .line 76
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {p2, p0}, Llin/xposed/hook/javaplugin/PluginOutput;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    const/4 p0, 0x0

    .line 87
    return-object p0
.end method

.method public static isRunning(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginLoaderMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private static synthetic lambda$invokeToPluginMethod$0(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lbsh/NameSpace;->getMethods()[Lbsh/BshMethod;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    array-length v2, v1

    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v2, :cond_1

    .line 20
    .line 21
    aget-object v4, v1, v3

    .line 22
    .line 23
    invoke-virtual {v4}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v4}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    array-length v5, v5

    .line 38
    array-length v6, p2

    .line 39
    if-ne v5, v6, :cond_0

    .line 40
    .line 41
    invoke-virtual {v4, p2, v0}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void

    .line 51
    :goto_1
    new-instance p2, Llin/xposed/hook/javaplugin/PluginOutput;

    .line 52
    .line 53
    invoke-direct {p2, p0}, Llin/xposed/hook/javaplugin/PluginOutput;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public static declared-synchronized loadPlugin(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z
    .locals 5

    .line 1
    const-class v0, Llin/xposed/hook/javaplugin/controller/PluginManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->checkPluginTime(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationError()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-wide v3, -0x36a5459c051405a7L    # -2.3842251273267806E45

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-wide v3, -0x36a54599051405a7L    # -2.3842292107151836E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return v2

    .line 64
    :cond_1
    :try_start_1
    sget-object v1, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginLoaderMap:Ljava/util/Map;

    .line 65
    .line 66
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationError()V

    .line 79
    .line 80
    .line 81
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-wide v3, -0x36a5457f051405a7L    # -2.3842646000813434E45

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    .line 112
    monitor-exit v0

    .line 113
    return v2

    .line 114
    :cond_3
    :try_start_2
    new-instance v3, Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 115
    .line 116
    invoke-direct {v3, p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->loadPlugin()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 127
    .line 128
    .line 129
    monitor-exit v0

    .line 130
    const/4 p0, 0x1

    .line 131
    return p0

    .line 132
    :catchall_1
    if-eqz p0, :cond_4

    .line 133
    .line 134
    :try_start_3
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationError()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 135
    .line 136
    .line 137
    :cond_4
    monitor-exit v0

    .line 138
    return v2

    .line 139
    :goto_1
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 140
    throw p0
.end method

.method public static newPluginInfo(Ljava/io/File;)Llin/xposed/hook/javaplugin/bean/PluginInfo;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/Properties;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 7
    .line 8
    invoke-direct {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 13
    .line 14
    const-wide v4, -0x36a545da051405a7L    # -2.3841407372997842E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Ljava/io/FileReader;

    .line 27
    .line 28
    invoke-direct {v4, v3}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v4}, Ljava/util/Properties;->load(Ljava/io/Reader;)V

    .line 32
    .line 33
    .line 34
    const-wide v3, -0x36a52317051405a7L    # -2.396253428432702E45

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-wide v5, -0x36a545cc051405a7L    # -2.3841597931123317E45

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const-wide v6, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {v4, v5, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v0, v3, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v1, v3}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginID(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-wide v3, -0x36a52843051405a7L    # -2.3944512930174886E45

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v0, v3, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v1, v3}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginName(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-wide v3, -0x36a545ce051405a7L    # -2.3841570708533964E45

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0, v3, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v1, v3}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginAuthor(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-wide v3, -0x36a545b5051405a7L    # -2.3841910990900885E45

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v0, v3, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v1, v3}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginVersion(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const-wide v3, -0x36a545bd051405a7L    # -2.384180210054347E45

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v0, v3, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v1, v3}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setDate(Ljava/lang/String;)Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 142
    .line 143
    .line 144
    const-wide v3, -0x36a545ba051405a7L    # -2.38418429344275E45

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v0, v3, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v1, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setTags(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v1, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginLocalPath(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    new-instance v0, Ljava/io/File;

    .line 172
    .line 173
    const-wide v3, -0x36a545a7051405a7L    # -2.384210154902636E45

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-direct {v0, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-eqz v3, :cond_0

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v1, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginDesc(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 203
    .line 204
    const-wide v3, -0x36a545a8051405a7L    # -2.3842087937731684E45

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-direct {v0, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-eqz p0, :cond_6

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-eqz p0, :cond_6

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    if-eqz p0, :cond_6

    .line 233
    .line 234
    array-length v0, p0

    .line 235
    const/4 v3, 0x0

    .line 236
    move v4, v3

    .line 237
    :goto_0
    const-wide v5, -0x36a54597051405a7L    # -2.384231932974119E45

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    if-ge v4, v0, :cond_2

    .line 243
    .line 244
    aget-object v7, p0, v4

    .line 245
    .line 246
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    if-eqz v8, :cond_1

    .line 259
    .line 260
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v1, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setIconPath(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 269
    .line 270
    goto :goto_0

    .line 271
    :cond_2
    :goto_1
    array-length v0, p0

    .line 272
    :goto_2
    if-ge v3, v0, :cond_5

    .line 273
    .line 274
    aget-object v4, p0, v3

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-nez v7, :cond_4

    .line 289
    .line 290
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    if-nez v7, :cond_3

    .line 295
    .line 296
    new-instance v7, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, v7}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPreviewPaths(Ljava/util/List;)V

    .line 302
    .line 303
    .line 304
    :cond_3
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_5
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    if-eqz p0, :cond_6

    .line 319
    .line 320
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 325
    .line 326
    .line 327
    :cond_6
    return-object v1

    .line 328
    :catch_0
    return-object v2
.end method

.method public static stopAllPlugin()V
    .locals 2

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->getAllRunningPluginLoader()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 20
    .line 21
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v0, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginLoaderMap:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Llin/xposed/hook/javaplugin/controller/PluginManager;->pluginLoaderMap:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->stopPlugin()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Llin/xposed/hook/javaplugin/controller/PluginManager;->lambda$invokeToPluginMethod$0(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

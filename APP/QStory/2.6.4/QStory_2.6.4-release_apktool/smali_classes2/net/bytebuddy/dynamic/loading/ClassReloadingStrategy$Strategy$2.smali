.class final enum Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$2;
.super Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;-><init>(Ljava/lang/String;IZLnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/instrument/Instrumentation;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/instrument/ClassDefinition;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassRedefinitionTransformer;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassRedefinitionTransformer;-><init>(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    sget-object v1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-interface {v1, p1, v0, v2}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;->addTransformer(Ljava/lang/instrument/Instrumentation;Ljava/lang/instrument/ClassFileTransformer;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    :try_start_1
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 v2, 0x0

    .line 18
    new-array v2, v2, [Ljava/lang/Class;

    .line 19
    .line 20
    invoke-interface {p2, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, [Ljava/lang/Class;

    .line 25
    .line 26
    invoke-interface {v1, p1, p2}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;->retransformClasses(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-interface {p1, v0}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    .line 30
    .line 31
    .line 32
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassRedefinitionTransformer;->assertTransformation()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception p2

    .line 40
    :try_start_3
    invoke-interface {p1, v0}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    .line 41
    .line 42
    .line 43
    throw p2

    .line 44
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    throw p1
.end method

.method public reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/lang/Class;

    .line 16
    .line 17
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;->isModifiableClass(Ljava/lang/instrument/Instrumentation;Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "Cannot modify type: "

    .line 27
    .line 28
    invoke-static {p2, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    sget-object p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;

    .line 37
    .line 38
    sget-object p2, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassResettingTransformer;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassResettingTransformer;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-interface {p0, p1, p2, v0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;->addTransformer(Ljava/lang/instrument/Instrumentation;Ljava/lang/instrument/ClassFileTransformer;Z)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    .line 46
    .line 47
    invoke-interface {p3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    check-cast p3, [Ljava/lang/Class;

    .line 52
    .line 53
    invoke-interface {p0, p1, p3}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;->retransformClasses(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p2}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    sget-object p2, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassResettingTransformer;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassResettingTransformer;

    .line 62
    .line 63
    invoke-interface {p1, p2}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    .line 64
    .line 65
    .line 66
    throw p0
.end method

.method public validate(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;->isRetransformClassesSupported(Ljava/lang/instrument/Instrumentation;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "Does not support retransformation: "

    .line 11
    .line 12
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

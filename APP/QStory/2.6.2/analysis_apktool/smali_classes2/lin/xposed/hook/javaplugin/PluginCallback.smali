.class public Llin/xposed/hook/javaplugin/PluginCallback;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static invokeToPluginMethodMenuCallback(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getChatType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getCurrentFriendUin()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getCurrentGroupUin()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-wide v3, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    if-ne v0, v5, :cond_0

    .line 20
    .line 21
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    filled-new-array {v6, v1, v7}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {p0, p1, v6}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    const/4 v6, 0x2

    .line 37
    if-ne v0, v6, :cond_1

    .line 38
    .line 39
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    filled-new-array {v2, v6, v7}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-static {p0, p1, v6}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    const/16 v6, 0x64

    .line 55
    .line 56
    if-ne v0, v6, :cond_2

    .line 57
    .line 58
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v2}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    filled-new-array {v3, v4, v7}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {p0, p1, v3}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    if-eq v0, v5, :cond_4

    .line 78
    .line 79
    if-ne v0, v6, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move-object v1, v2

    .line 83
    :cond_4
    :goto_0
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {p0, p1, v0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static onCallbackOnRawMsg(Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a53ca3051405a7L    # -2.38735164171405E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static onClickFloatingWindow()V
    .locals 4

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getChatType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x64

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getCurrentGroupUin()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getCurrentFriendUin()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_1
    const-wide v2, -0x36a53cd2051405a7L    # -2.387287668629069E45

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v2, v0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static onCreateMenu(Llin/xposed/hook/javaplugin/controller/PluginLoader;Llin/xposed/hook/javaplugin/bean/MessageData;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a53c8b051405a7L    # -2.3873843088212746E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p0, v0, p1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethodAndGetInvokeResult(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static onJoinTroop(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {p1}, L飘花落叶言苏世子哲兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-wide v1, -0x36a53cb7051405a7L    # -2.3873244191246965E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {p0, p1, v1}, L飘花落叶言苏世子哲兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const-wide v1, -0x36a53cbe051405a7L    # -2.3873148912184227E45

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    filled-new-array {p0, p1, v0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v3, v4}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    filled-new-array {p0, p1, p2, v0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {v1, p0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static onMenuCallback(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/PluginCallback;->invokeToPluginMethodMenuCallback(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    new-instance v0, Llin/xposed/hook/javaplugin/PluginOutput;

    .line 15
    .line 16
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Llin/xposed/hook/javaplugin/PluginOutput;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static onMenuTemporaryCallback(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->temporaryItemMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/PluginCallback;->invokeToPluginMethodMenuCallback(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static onMessage(Llin/xposed/hook/javaplugin/bean/MessageData;)V
    .locals 5

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/bean/MessageData;->UserUin:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言苏世子哲兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide v1, -0x36a53c8d051405a7L    # -2.3873815865623392E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Llin/xposed/hook/javaplugin/bean/MessageData;->GroupUin:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, Llin/xposed/hook/javaplugin/bean/MessageData;->UserUin:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v0, v3, v4}, L飘花落叶言苏世子哲兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static onMsgMenuCallback(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;Llin/xposed/hook/javaplugin/bean/MessageData;)V
    .locals 1

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->msgMenuItemMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-static {p0, p1, p2}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static onMsgRetract(Llin/xposed/hook/javaplugin/bean/MessageData;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a53c78051405a7L    # -2.3874101702811606E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static onSendMsg(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

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
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

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
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    filled-new-array {p0, p1, v2}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-wide v3, -0x36a53cc8051405a7L    # -2.387301279923746E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v1, v3, v2}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethodAndGetInvokeResult(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    move-object p0, v1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-object p0
.end method

.method public static onTroopBanInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    .line 1
    const-wide v0, -0x36a53c9c051405a7L    # -2.387361169620324E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static onTroopQuit(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-wide v0, -0x36a53cbe051405a7L    # -2.3873148912184227E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    filled-new-array {p0, p1, v3}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v2, v4}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-wide v1, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    filled-new-array {p0, p1, v1, v3}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

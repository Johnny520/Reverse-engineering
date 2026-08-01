.class public Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

.field private final pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/controller/PluginLoader;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 5
    .line 6
    new-instance v0, Llin/xposed/hook/javaplugin/PluginOutput;

    .line 7
    .line 8
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 16
    .line 17
    return-void
.end method

.method private resolvePath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->isAbsolute()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 14
    .line 15
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginLocalPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, Ljava/io/File;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method


# virtual methods
.method public addItem(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->getCurrentInstance()Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->noticeViewUpdate()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-object p2
.end method

.method public addItem(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->addItem(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    return-object p2
.end method

.method public addMenuItem(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->msgMenuItemMap:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public addTemporaryItem(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->temporaryItemMap:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->getCurrentInstance()Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->noticeViewUpdate()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public deleteMsg(Ljava/lang/Object;)V
    .locals 4

    .line 1
    instance-of v0, p1, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    const-class v1, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    iget-boolean v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->IsGroup:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->GroupUin:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getGroupContact(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->UserUin:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getFriendContact(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_1
    :try_start_0
    instance-of v2, p1, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object p1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->msg:Ljava/lang/Object;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    :goto_2
    const-wide v2, -0x36a50ab5051405a7L    # -2.404749598569984E45

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-static {v2, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/Long;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v0}, Llin/xposed/hook/util/qq/QQMsgService;->deleteMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :goto_3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public error(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public eval(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->eval(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public forbidden(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    if-gt p3, p0, :cond_1

    .line 9
    .line 10
    if-ne p3, p0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    invoke-static {p1, p0}, Llin/xposed/hook/util/qq/QQNTTroopTool;->shutUpAll(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    int-to-long p2, p3

    .line 19
    invoke-static {p1, p2, p3}, Llin/xposed/hook/util/qq/QQNTTroopTool;->shutUpAll(Ljava/lang/String;J)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    int-to-long v0, p3

    .line 24
    invoke-static {p1, p2, v0, v1}, Llin/xposed/hook/util/qq/QQNTTroopTool;->shutUp(Ljava/lang/String;Ljava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public forwardMsg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p3, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p3, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object p1, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    const-class p2, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 21
    .line 22
    invoke-virtual {p1, p3}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    :goto_0
    iget-object p1, p3, Llin/xposed/hook/javaplugin/bean/MessageData;->GroupUin:Ljava/lang/String;

    .line 27
    .line 28
    iget-object p2, p3, Llin/xposed/hook/javaplugin/bean/MessageData;->UserUin:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p3, Llin/xposed/hook/javaplugin/bean/MessageData;->msg:Ljava/lang/Object;

    .line 35
    .line 36
    const-wide v0, -0x36a50ab5051405a7L    # -2.404749598569984E45

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-static {v0, p3, p2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance p3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    new-instance p2, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-static {p3, p1, p2}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->forwardMsg(Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 0

    .line 1
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getBKN(Ljava/lang/String;)J
    .locals 0

    .line 1
    invoke-static {p1}, Llin/xposed/hook/util/qq/Hook_cookie;->getBkn(Ljava/lang/String;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public getBoolean(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    :try_start_0
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return p0

    .line 42
    :catch_0
    :cond_1
    return p3
.end method

.method public getChatType()I
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getChatType()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public getCurrentFriendUin()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getCurrentFriendUin()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getCurrentGroupUin()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->getCurrentGroupUin()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDouble(Ljava/lang/String;Ljava/lang/String;D)D
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of p1, p0, Ljava/lang/Number;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    return-wide p0

    .line 31
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    :try_start_0
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 38
    .line 39
    .line 40
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-wide p0

    .line 42
    :catch_0
    :cond_1
    return-wide p3
.end method

.method public getFloat(Ljava/lang/String;Ljava/lang/String;F)F
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of p1, p0, Ljava/lang/Number;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    :try_start_0
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 38
    .line 39
    .line 40
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return p0

    .line 42
    :catch_0
    :cond_1
    return p3
.end method

.method public getForbiddenList(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Llin/xposed/hook/javaplugin/bean/GroupBanInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQNTTroopTool;->getProhibitList(Ljava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    return-object p0
.end method

.method public getFriendList()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Llin/xposed/hook/javaplugin/bean/FriendInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Llin/xposed/hook/util/qq/QQFriendTool;->getAllFriend()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getFriendRKey()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGTK(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Llin/xposed/hook/util/qq/Hook_cookie;->getG_TK(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getGroupInfo(Ljava/lang/String;)Llin/xposed/hook/javaplugin/bean/GroupInfo;
    .locals 6

    .line 1
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 6
    .line 7
    invoke-direct {v0}, Llin/xposed/hook/javaplugin/bean/GroupInfo;-><init>()V

    .line 8
    .line 9
    .line 10
    const-wide v1, -0x36a571c5051405a7L    # -2.3688375586946157E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p0, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    iput-object v1, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 26
    .line 27
    const-wide v1, -0x36a57156051405a7L    # -2.3689886440655286E45

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {p0, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    iput-object v1, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupName:Ljava/lang/String;

    .line 43
    .line 44
    const-wide v1, -0x36a5713c051405a7L    # -2.3690240334316884E45

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {p0, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/lang/String;

    .line 58
    .line 59
    iput-object v1, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupOwner:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iput-boolean v1, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->IsOwnerOrAdmin:Z

    .line 66
    .line 67
    const-wide v1, -0x36a5714e051405a7L    # -2.36899953310127E45

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-class v2, Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v2, v1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Ljava/lang/String;

    .line 83
    .line 84
    new-instance v2, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    const-wide v3, -0x36a56232051405a7L    # -2.374264381882271E45

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v1, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    array-length v1, p1

    .line 105
    const/4 v3, 0x0

    .line 106
    :goto_0
    if-ge v3, v1, :cond_2

    .line 107
    .line 108
    aget-object v4, p1, v3

    .line 109
    .line 110
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-nez v5, :cond_0

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    invoke-static {p1}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 127
    .line 128
    .line 129
    :cond_2
    iget-object p1, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupOwner:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    iput-object v2, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->AdminList:Ljava/util/ArrayList;

    .line 135
    .line 136
    iput-object p0, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->sourceInfo:Ljava/lang/Object;

    .line 137
    .line 138
    return-object v0
.end method

.method public getGroupList()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Llin/xposed/hook/javaplugin/bean/GroupInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getGroupMemberList(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getGroupRKey()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInt(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of p1, p0, Ljava/lang/Number;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    :try_start_0
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return p0

    .line 42
    :catch_0
    :cond_1
    return p3
.end method

.method public getLong(Ljava/lang/String;Ljava/lang/String;J)J
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of p1, p0, Ljava/lang/Number;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    return-wide p0

    .line 31
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    :try_start_0
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 38
    .line 39
    .line 40
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-wide p0

    .line 42
    :catch_0
    :cond_1
    return-wide p3
.end method

.method public getMemberInfo(Ljava/lang/String;Ljava/lang/String;)Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;
    .locals 7

    .line 1
    sget-object p0, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-wide v0, -0x36a5f6c0051405a7L    # -2.3225006282262577E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, -0x36a51e38051405a7L    # -2.3979507568789035E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲(JJLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;

    .line 31
    .line 32
    invoke-direct {p1}, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p0, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->sourceInfo:Ljava/lang/Object;

    .line 36
    .line 37
    const-wide v1, -0x36a404d5051405a7L    # -2.4959997180835028E45

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const-wide v1, -0x36a5bb5e051405a7L    # -2.343192518393986E45

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    check-cast p2, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    iput-wide v3, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->Join_Time:J

    .line 68
    .line 69
    const-wide v3, -0x36a404df051405a7L    # -2.495986106788826E45

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast p2, Ljava/lang/Long;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    iput-wide v1, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->Last_AvtivityTime:J

    .line 95
    .line 96
    const-wide v1, -0x36a404c8051405a7L    # -2.4960174127665826E45

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    const-wide v1, -0x36a591a1051405a7L    # -2.357736186756187E45

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    check-cast p2, Ljava/lang/String;

    .line 121
    .line 122
    iput-object p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    .line 124
    const-wide v3, -0x36a404b2051405a7L    # -2.4960473576148717E45

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    const-wide v5, -0x36a5b59d051405a7L    # -2.3451974620998843E45

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    :try_start_1
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    check-cast p2, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    iput p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserLevel:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :catchall_0
    const-wide v3, -0x36a404a7051405a7L    # -2.4960623300390162E45

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    :try_start_2
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    check-cast p2, Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    iput p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserLevel:I

    .line 183
    .line 184
    :goto_0
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    iput-object p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 189
    .line 190
    const-wide v3, -0x36a404a9051405a7L    # -2.4960596077800808E45

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    check-cast p2, Ljava/lang/String;

    .line 210
    .line 211
    iput-object p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserName:Ljava/lang/String;

    .line 212
    .line 213
    const-wide v1, -0x36a5dce3051405a7L    # -2.3315126664317918E45

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    if-nez p0, :cond_1

    .line 227
    .line 228
    const-wide v1, -0x36a5dcdc051405a7L    # -2.3315221943380656E45

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    goto :goto_1

    .line 238
    :catch_0
    move-exception p0

    .line 239
    goto :goto_2

    .line 240
    :cond_1
    :goto_1
    const-wide v1, -0x36a5dce8051405a7L    # -2.3315058607844534E45

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    iput-boolean p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsOwner:Z

    .line 258
    .line 259
    const-wide v1, -0x36a5dcd6051405a7L    # -2.3315303611148717E45

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    iput-boolean p0, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsAdmin:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 277
    .line 278
    move-object v0, p1

    .line 279
    goto :goto_3

    .line 280
    :goto_2
    const-wide p1, -0x36a404e4051405a7L    # -2.4959793011414875E45

    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    sget-object p2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    const/4 v1, 0x1

    .line 296
    invoke-static {p1, p2, p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 297
    .line 298
    .line 299
    :goto_3
    return-object v0
.end method

.method public getMemberName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1, p2}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getMessageList(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Llin/xposed/hook/javaplugin/bean/MessageData;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide p1, -0x36a5d12d051405a7L    # -2.3355933325759077E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    const/4 p2, -0x1

    .line 18
    :try_start_0
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 19
    .line 20
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    new-instance p0, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏哲兰;

    .line 35
    .line 36
    const-wide v0, -0x36a5f855051405a7L    # -2.3219493707918458E45

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, p2, p3, v0}, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :catch_0
    move-exception p0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {p3, p0}, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance p3, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;

    .line 62
    .line 63
    invoke-direct {p3, v0, v1, p1}, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/CountDownLatch;I)V

    .line 64
    .line 65
    .line 66
    invoke-static {p3}, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const-wide v4, -0x36a5f846051405a7L    # -2.321969787733861E45

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget-object v5, v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 88
    .line 89
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 90
    .line 91
    const-wide v4, -0x36a5f849051405a7L    # -2.321965704345458E45

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const-wide v5, -0x36a5f819051405a7L    # -2.3220310385599068E45

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-static {v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iget-object v5, v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 122
    .line 123
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 124
    .line 125
    filled-new-array {p0, p3}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {v3, v2, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 133
    .line 134
    .line 135
    iget-object p0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏哲兰;

    .line 138
    .line 139
    if-nez p0, :cond_1

    .line 140
    .line 141
    new-instance p0, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏哲兰;

    .line 142
    .line 143
    const-wide v0, -0x36a407d9051405a7L    # -2.494948926134451E45

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    new-instance v0, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0, p2, p3, v0}, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-wide v0, -0x36a407c8051405a7L    # -2.4949720653354015E45

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    sget-object v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {p3, v0, p0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 196
    .line 197
    .line 198
    new-instance p1, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏哲兰;

    .line 199
    .line 200
    new-instance p3, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    const-wide v0, -0x36a407a3051405a7L    # -2.4950224271257058E45

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    new-instance p3, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-direct {p1, p2, p0, p3}, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 234
    .line 235
    .line 236
    move-object p0, p1

    .line 237
    :cond_1
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 240
    .line 241
    .line 242
    sget-object p2, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 243
    .line 244
    const-class p3, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 245
    .line 246
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    check-cast p2, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 251
    .line 252
    iget-object p0, p0, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result p3

    .line 262
    if-eqz p3, :cond_3

    .line 263
    .line 264
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    invoke-virtual {p2, p3}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->isGrayMessage(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_2

    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_2
    invoke-virtual {p2, p3}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 276
    .line 277
    .line 278
    move-result-object p3

    .line 279
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_3
    return-object p1
.end method

.method public getNewFriendInfo(Ljava/lang/String;)Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;
    .locals 10

    .line 1
    sget-object p0, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQEnvTool;->getUidFromUin(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-class p0, Ljava/lang/String;

    .line 11
    .line 12
    const-wide v0, -0x36a54b32051405a7L    # -2.3822787121879928E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    :try_start_0
    invoke-static {}, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-wide v3, -0x36a59da6051405a7L    # -2.353547991384124E45

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v4, v2, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    iput-object v3, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 51
    .line 52
    filled-new-array {p0, p0}, [Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iput-object v3, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 57
    .line 58
    const-wide v3, -0x36a59e63051405a7L    # -2.353290737914732E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    filled-new-array {p1, v3}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v2, v1, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-nez p1, :cond_1

    .line 76
    .line 77
    :goto_0
    return-object v0

    .line 78
    :cond_1
    new-instance v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;

    .line 79
    .line 80
    invoke-direct {v1}, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;-><init>()V

    .line 81
    .line 82
    .line 83
    const-wide v2, -0x36a51e38051405a7L    # -2.3979507568789035E45

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {p0, v2, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-wide v3, -0x36a59e9e051405a7L    # -2.3532104312761386E45

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    check-cast v2, Ljava/lang/String;

    .line 108
    .line 109
    const-wide v5, -0x36a59e8c051405a7L    # -2.353234931606557E45

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-static {p0, v5, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast v5, Ljava/lang/String;

    .line 129
    .line 130
    const-wide v6, -0x36a59e89051405a7L    # -2.35323901499496E45

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-static {p0, v6, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    check-cast p0, Ljava/lang/String;

    .line 150
    .line 151
    const-wide v6, -0x36a59e70051405a7L    # -2.353273043231652E45

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 161
    .line 162
    invoke-static {v7, v6, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    check-cast v6, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    const-wide v8, -0x36a59e7c051405a7L    # -2.3532567096780398E45

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-static {v7, v8, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    check-cast p1, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    iput-object v2, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->uin:Ljava/lang/String;

    .line 204
    .line 205
    iput-object v5, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->nickname:Ljava/lang/String;

    .line 206
    .line 207
    iput-object p0, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->remark:Ljava/lang/String;

    .line 208
    .line 209
    iput v6, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->age:I

    .line 210
    .line 211
    iput p1, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->sex:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    .line 213
    return-object v1

    .line 214
    :catch_0
    move-exception p0

    .line 215
    const-wide v1, -0x36a53940051405a7L    # -2.388531740962532E45

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const/4 v2, 0x1

    .line 231
    invoke-static {p1, v1, p0, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 232
    .line 233
    .line 234
    return-object v0
.end method

.method public getNewFriendList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public getPT4Token(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Llin/xposed/hook/util/qq/Hook_cookie;->getPt4Token(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getPskey(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Llin/xposed/hook/util/qq/Hook_cookie;->getPskey(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getRealSkey()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getRealSkey()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getSkey()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/util/qq/Hook_cookie;->getSkey()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 31
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    move-result-object p0

    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p0, v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p3, p0

    .line 28
    :catch_0
    :goto_0
    check-cast p3, Ljava/lang/String;

    .line 29
    .line 30
    return-object p3
.end method

.method public getSuperkey()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public httpDownload(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 179
    invoke-direct {p0, p2}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public httpDownload(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget p2, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 6
    .line 7
    new-instance p2, Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {p2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;

    .line 26
    .line 27
    invoke-direct {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 31
    .line 32
    invoke-direct {v1, v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-direct {v0, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(Ljava/util/Map;)L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-virtual {p3}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    iput-object p3, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance p3, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 55
    .line 56
    invoke-direct {p3, v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 57
    .line 58
    .line 59
    :try_start_0
    new-instance v0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 60
    .line 61
    invoke-direct {v0, v1, p3}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 65
    .line 66
    .line 67
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :try_start_1
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 69
    .line 70
    new-instance v1, Ljava/io/FileOutputStream;

    .line 71
    .line 72
    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    .line 78
    :try_start_2
    new-instance p2, Ljava/io/BufferedInputStream;

    .line 79
    .line 80
    iget-object v1, p3, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;

    .line 81
    .line 82
    invoke-virtual {v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲()Ljava/io/InputStream;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {p2, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x400

    .line 90
    .line 91
    :try_start_3
    new-array v1, v1, [B

    .line 92
    .line 93
    :goto_0
    invoke-virtual {p2, v1}, Ljava/io/InputStream;->read([B)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    const/4 v3, -0x1

    .line 98
    if-eq v2, v3, :cond_1

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v1

    .line 109
    goto :goto_1

    .line 110
    :cond_1
    :try_start_4
    invoke-virtual {p2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 111
    .line 112
    .line 113
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 114
    .line 115
    .line 116
    :try_start_6
    invoke-virtual {p3}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catch_0
    move-exception p2

    .line 121
    goto :goto_7

    .line 122
    :catchall_1
    move-exception p2

    .line 123
    goto :goto_5

    .line 124
    :catchall_2
    move-exception p2

    .line 125
    goto :goto_3

    .line 126
    :goto_1
    :try_start_7
    invoke-virtual {p2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catchall_3
    move-exception p2

    .line 131
    :try_start_8
    invoke-virtual {v1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :goto_2
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 135
    :goto_3
    :try_start_9
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :catchall_4
    move-exception v0

    .line 140
    :try_start_a
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :goto_4
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 144
    :goto_5
    :try_start_b
    invoke-virtual {p3}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 145
    .line 146
    .line 147
    goto :goto_6

    .line 148
    :catchall_5
    move-exception p3

    .line 149
    :try_start_c
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :goto_6
    throw p2
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 153
    :goto_7
    new-instance p3, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const-wide v0, -0x36a504df051405a7L    # -2.4067831259947034E45

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    invoke-static {v0, v1, p3, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰哲世苏(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const-wide v0, -0x36a504c6051405a7L    # -2.4068171542313955E45

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1, p3, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰哲世(JLjava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0, p2}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public httpGet(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 92
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public httpGet(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    sget p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    :try_start_0
    new-instance p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;

    .line 4
    .line 5
    invoke-direct {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 9
    .line 10
    invoke-direct {v0, p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    const/4 v1, 0x6

    .line 16
    invoke-direct {p0, v1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(Ljava/util/Map;)L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 31
    .line 32
    const-string p1, "GET"

    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 39
    .line 40
    invoke-direct {p1, p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 41
    .line 42
    .line 43
    new-instance p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 44
    .line 45
    invoke-direct {p0, v0, p1}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p1, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;

    .line 53
    .line 54
    invoke-virtual {p1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    return-object p1

    .line 62
    :catch_0
    move-exception p0

    .line 63
    const-wide p1, -0x36a50722051405a7L    # -2.4059950320329145E45

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    sget-object p2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    const/4 v0, 0x1

    .line 79
    invoke-static {p1, p2, p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 80
    .line 81
    .line 82
    const-wide p0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public httpPost(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    sget v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    :try_start_0
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;

    .line 4
    .line 5
    invoke-direct {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 9
    .line 10
    invoke-direct {v1, v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    move-object v6, v5

    .line 48
    check-cast v6, Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-string v9, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 63
    .line 64
    const/4 v13, 0x0

    .line 65
    const/16 v14, 0x5b

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v12, 0x0

    .line 72
    invoke-static/range {v6 .. v14}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    const-string v10, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 80
    .line 81
    const/4 v14, 0x0

    .line 82
    const/16 v15, 0x5b

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    const/4 v11, 0x0

    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    move-object v7, v4

    .line 90
    invoke-static/range {v7 .. v15}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    new-instance v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 99
    .line 100
    const/4 v4, 0x6

    .line 101
    invoke-direct {v3, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 102
    .line 103
    .line 104
    move-object/from16 v4, p1

    .line 105
    .line 106
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-wide v4, -0x36a505eb051405a7L    # -2.4064183432973642E45

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    const-wide v5, -0x36a5054f051405a7L    # -2.4066306794943228E45

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v3, v4, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-wide v4, -0x36a5056e051405a7L    # -2.4065884844808246E45

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    const-wide v5, -0x36a50555051405a7L    # -2.4066225127175167E45

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v3, v4, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    const-wide v4, -0x36a50551051405a7L    # -2.4066279572353875E45

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    const-wide v5, -0x36a50544051405a7L    # -2.4066456519184674E45

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v3, v4, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    new-instance v4, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;

    .line 173
    .line 174
    invoke-direct {v4, v0, v2}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 175
    .line 176
    .line 177
    const-string v0, "POST"

    .line 178
    .line 179
    invoke-virtual {v3, v0, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;)V

    .line 180
    .line 181
    .line 182
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 183
    .line 184
    invoke-direct {v0, v3}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 185
    .line 186
    .line 187
    new-instance v2, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 188
    .line 189
    invoke-direct {v2, v1, v0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;

    .line 197
    .line 198
    invoke-virtual {v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    .line 204
    .line 205
    return-object v1

    .line 206
    :catch_0
    move-exception v0

    .line 207
    const-wide v1, -0x36a50722051405a7L    # -2.4059950320329145E45

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    sget-object v2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const/4 v3, 0x1

    .line 223
    invoke-static {v1, v2, v0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 224
    .line 225
    .line 226
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    return-object v0
.end method

.method public httpPost(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 236
    sget v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 237
    :try_start_0
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;

    invoke-direct {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 238
    new-instance v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    invoke-direct {v1, v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;)V

    .line 239
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 240
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 241
    invoke-interface/range {p3 .. p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 242
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 243
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    const-string v9, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    const/4 v13, 0x0

    const/16 v14, 0x5b

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 245
    invoke-static/range {v6 .. v14}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    const-string v10, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    const/4 v14, 0x0

    const/16 v15, 0x5b

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v4

    .line 247
    invoke-static/range {v7 .. v15}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 248
    :cond_0
    new-instance v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    move-object/from16 v4, p1

    .line 249
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 250
    invoke-static/range {p2 .. p2}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(Ljava/util/Map;)L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;

    move-result-object v4

    .line 251
    invoke-virtual {v4}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    move-result-object v4

    iput-object v4, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 252
    new-instance v4, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;

    invoke-direct {v4, v0, v2}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 253
    const-string v0, "POST"

    invoke-virtual {v3, v0, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;)V

    .line 254
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    invoke-direct {v0, v3}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 255
    new-instance v2, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    invoke-direct {v2, v1, v0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)V

    .line 256
    invoke-virtual {v2}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    move-result-object v0

    .line 257
    iget-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;

    .line 258
    invoke-virtual {v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

    move-result-object v1

    .line 259
    invoke-virtual {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    const-wide v1, -0x36a50722051405a7L    # -2.4059950320329145E45

    .line 260
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    move-result-object v1

    sget-object v2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 261
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 262
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public httpPostJson(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p1, p2, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public httpPostJson(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 7
    invoke-static {p1, p3, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public isFriend(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQFriendTool;->isFriend(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public kick(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Llin/xposed/hook/util/qq/QQNTTroopTool;->kickMember(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public load(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->loadPluginByPath(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public loadAar(Ljava/lang/String;)Ljava/lang/ClassLoader;
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    sget-object v1, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-static {p1}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v2, "aar"

    .line 18
    .line 19
    invoke-static {v0, v2, v1}, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v3, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    invoke-direct {v3, p1, v4, v0}, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/ClassLoader;

    .line 36
    .line 37
    :goto_0
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->addClassLoader(Ljava/lang/ClassLoader;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method public loadDex(Ljava/lang/String;)Ljava/lang/ClassLoader;
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    sget-object v1, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-static {p1}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v2, "dex"

    .line 18
    .line 19
    invoke-static {v0, v2, v1}, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v3, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-direct {v3, p1, v4, v0}, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/ClassLoader;

    .line 36
    .line 37
    :goto_0
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->addClassLoader(Ljava/lang/ClassLoader;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method public loadJar(Ljava/lang/String;)Ljava/lang/ClassLoader;
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    sget-object v1, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-static {p1}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v2, "jar"

    .line 18
    .line 19
    invoke-static {v0, v2, v1}, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v3, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-direct {v3, p1, v4, v0}, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/ClassLoader;

    .line 36
    .line 37
    :goto_0
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->addClassLoader(Ljava/lang/ClassLoader;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method public log(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->log(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public putBoolean(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世兰苏哲楪()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public putDouble(Ljava/lang/String;Ljava/lang/String;D)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public putFloat(Ljava/lang/String;Ljava/lang/String;F)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public putInt(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世兰苏哲楪()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public putLong(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世兰苏哲楪()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p3, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世兰苏哲楪()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public readFileBytes(Ljava/lang/String;)[B
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/io/File;)[B

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public readFileText(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public removeItem(Ljava/lang/String;)V
    .locals 0

    .line 9
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removeItem(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public removeItemByName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public replyEmoji(Ljava/lang/Object;ILjava/lang/String;)V
    .locals 4

    .line 1
    instance-of v0, p1, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    const-class v1, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    iget-boolean v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->IsGroup:Z

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->GroupUin:Ljava/lang/String;

    .line 28
    .line 29
    :try_start_0
    instance-of v2, p1, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    iget-object p1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->msg:Ljava/lang/Object;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catch_0
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    :goto_1
    const-wide v2, -0x36a53a7f051405a7L    # -2.388097540662341E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-static {v2, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-static {v1, v2, v3, p3, p2}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪哲兰(Ljava/lang/String;JLjava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_2
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    const-wide p0, -0x36a53a8d051405a7L    # -2.3880784848497933E45

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public replyEmoji(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 82
    invoke-virtual {p0, p1, v0, p2}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->replyEmoji(Ljava/lang/Object;ILjava/lang/String;)V

    return-void
.end method

.method public revokeMsg(Ljava/lang/Object;)V
    .locals 4

    .line 1
    instance-of v0, p1, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    const-class v1, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    iget-boolean v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->IsGroup:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->GroupUin:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getGroupContact(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->UserUin:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getFriendContact(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_1
    :try_start_0
    instance-of v2, p1, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object p1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->msg:Ljava/lang/Object;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    :goto_2
    const-wide v2, -0x36a50ab5051405a7L    # -2.404749598569984E45

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-static {v2, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/Long;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    invoke-static {v1, v2, v3}, Llin/xposed/hook/util/qq/QQMsgService;->recallMsg(Ljava/lang/Object;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :goto_3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public scanImageText(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p1

    .line 11
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    const-wide p0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public scanImageTextDetail(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Llin/xposed/hook/javaplugin/bean/OcrText;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p1

    .line 11
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public sendAntEmo(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        since = "\u53d1\u9001\u8868\u60c5 \u53c2\u6570\u4e09\u4e3a\u8868\u60c5id"
    .end annotation

    .line 1
    return-void
.end method

.method public sendCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p3}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendCard(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p3}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p1, p0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendFile(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public sendLike(Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p0, 0x14

    .line 2
    .line 3
    invoke-static {p1, p0}, Llin/xposed/hook/util/qq/QQFriendTool;->sendLike(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public sendLike(Ljava/lang/String;I)V
    .locals 0

    .line 7
    invoke-static {p1, p2}, Llin/xposed/hook/util/qq/QQFriendTool;->sendLike(Ljava/lang/String;I)V

    return-void
.end method

.method public sendMsg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1, p3}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->parseCompoundMessages(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public sendPai(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    move v1, p1

    .line 11
    move-object p1, p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x2

    .line 14
    :goto_0
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getAppRuntime()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-wide v3, -0x36a53ad7051405a7L    # -2.3879777612691847E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-wide v4, -0x36a53aa7051405a7L    # -2.3880430954836335E45

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v3, v0, v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    const-wide v4, -0x36a53a92051405a7L    # -2.388071679202455E45

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v2, v4, v5, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sget v3, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    const/16 v4, 0x3426

    .line 70
    .line 71
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    if-lt v3, v4, :cond_1

    .line 76
    .line 77
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    filled-new-array {v0, v0, v6}, [Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v3, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 90
    .line 91
    .line 92
    iput-object v5, v3, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    filled-new-array {p2, p1, v0}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v3, v2, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catch_0
    move-exception p1

    .line 107
    goto :goto_1

    .line 108
    :cond_1
    const/16 v4, 0x3002

    .line 109
    .line 110
    if-lt v3, v4, :cond_2

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    filled-new-array {v6, v0, v0}, [Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v3, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 125
    .line 126
    .line 127
    iput-object v5, v3, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 128
    .line 129
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    filled-new-array {v0, p2, p1}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v3, v2, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-static {v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    filled-new-array {v0, v0, v6}, [Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v3, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 154
    .line 155
    .line 156
    iput-object v5, v3, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 157
    .line 158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    filled-new-array {p2, p1, v0}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {v3, v2, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :goto_1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 171
    .line 172
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public sendPic(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p3}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p1, p0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendPic(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public sendProto(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-direct {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()[B

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public sendReply(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getGroupContact(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, p2, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast p2, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 10
    .line 11
    iget-object p2, p2, Llin/xposed/hook/javaplugin/bean/MessageData;->msg:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    const-wide v1, -0x36a50ab5051405a7L    # -2.404749598569984E45

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-static {v2, v1, p2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v1, v2}, Llin/xposed/hook/util/qq/CreateElement;->createReplyElement(J)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p1, p3}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->parseCompoundMessages(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-virtual {p1, p3, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception p1

    .line 51
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public sendShake(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        since = "\u5f03\u7528\u4e86"
    .end annotation

    .line 1
    return-void
.end method

.method public sendShow(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        since = "\u5f03\u7528\u4e86"
    .end annotation

    .line 1
    return-void
.end method

.method public sendSticker(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x36a5212f051405a7L    # -2.3969176596129316E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    :cond_0
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p3}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Llin/xposed/hook/util/qq/CreateElement;->createEmojiElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-wide p2, -0x36a51930051405a7L    # -2.3997038916332802E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const-wide v0, -0x36a5144f051405a7L    # -2.4014039423384172E45

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-static {p3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-static {p3, p2, p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-wide v0, -0x36a517ec051405a7L    # -2.4001448975808098E45

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-static {p2, p3, p4}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-wide p3, -0x36a517c7051405a7L    # -2.400195259371114E45

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {p3, p4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    const/4 p4, 0x0

    .line 76
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    invoke-static {p2, p3, p4}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance p2, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public sendTip(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        since = "\u5f03\u7528\u4e86"
    .end annotation

    .line 1
    return-void
.end method

.method public sendVideo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p3}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p1, p0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendVideo(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public sendVoice(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p3}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p1, p0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendVoice(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object p0, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    const-wide v0, -0x36a58ba3051405a7L    # -2.359824159359614E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, -0x36a4037c051405a7L    # -2.4964693077498536E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲(JJLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-wide v0, -0x36a59e8c051405a7L    # -2.353234931606557E45

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getAppRuntime()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const-wide v0, -0x36a53a92051405a7L    # -2.388071679202455E45

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 47
    .line 48
    invoke-interface {v1}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {p0, v0, v1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-wide v0, -0x36a4037b051405a7L    # -2.4964706688793213E45

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    new-array v1, v1, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {v0, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const-wide v1, -0x36a52843051405a7L    # -2.3944512930174886E45

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v0, v1, p3}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世哲兰苏楪(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    const-wide v1, -0x36a404c8051405a7L    # -2.4960174127665826E45

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    invoke-static {v0, p3, p2}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世哲兰苏楪(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const-wide p2, -0x36a571c5051405a7L    # -2.3688375586946157E45

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-static {v0, p2, p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世哲兰苏楪(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-static {p2}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    const/4 p3, 0x1

    .line 133
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    filled-new-array {p3}, [Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-static {p3}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    invoke-static {p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-class v1, Ljava/lang/String;

    .line 150
    .line 151
    const-class v2, Ljava/util/ArrayList;

    .line 152
    .line 153
    filled-new-array {v1, v2, v2}, [Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v0, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 158
    .line 159
    .line 160
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {v0, p0, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public setTitle(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    sget-object p0, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-class p0, Ljava/lang/String;

    .line 4
    .line 5
    const-wide v0, -0x36a58ba3051405a7L    # -2.359824159359614E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v2, -0x36a51e38051405a7L    # -2.3979507568789035E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲(JJLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-wide v0, -0x36a58b2c051405a7L    # -2.3599861337662683E45

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    :try_start_0
    sget v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 33
    .line 34
    const/16 v1, 0x3002

    .line 35
    .line 36
    if-ge v0, v1, :cond_0

    .line 37
    .line 38
    invoke-static {p1, p2, p3}, Llin/xposed/hook/util/qq/QQNTTroopTool;->setGroupMemberTitle(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    const-wide v0, -0x36a40423051405a7L    # -2.4962419991287505E45

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-wide v1, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v0, v1}, Llin/xposed/hook/util/qq/QQEnvTool;->getRuntimeService(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-wide v2, -0x36a403e5051405a7L    # -2.496326389155747E45

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iput-object v2, v1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 82
    .line 83
    iput-object p0, v1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 84
    .line 85
    filled-new-array {p0, p0}, [Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {v1, p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 90
    .line 91
    .line 92
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v1, v0, p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-wide v0, -0x36a591a1051405a7L    # -2.357736186756187E45

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    check-cast p0, Ljava/lang/String;

    .line 112
    .line 113
    new-instance v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 114
    .line 115
    invoke-direct {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 116
    .line 117
    .line 118
    new-instance v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 119
    .line 120
    invoke-direct {v1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 121
    .line 122
    .line 123
    const-wide v2, -0x36a5265f051405a7L    # -2.3951100796798475E45

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    const/16 v5, 0x8fc

    .line 133
    .line 134
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    const-wide v4, -0x36a52659051405a7L    # -2.3951182464566537E45

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    const/4 v5, 0x2

    .line 151
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    new-instance v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 159
    .line 160
    invoke-direct {v4}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {v4, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 179
    .line 180
    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v5

    .line 191
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-virtual {p1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    const-wide v2, -0x36a52647051405a7L    # -2.395142746787072E45

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    const-wide p2, -0x36a403df051405a7L    # -2.496334555932553E45

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    const-wide v2, 0xffffffffL

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object p3

    .line 228
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    const-wide p2, -0x36a5f9ac051405a7L    # -2.3214825033844303E45

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-virtual {p1, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    const-wide p2, -0x36a5265b051405a7L    # -2.3951155241977183E45

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {v4, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    const-wide p0, -0x36a52645051405a7L    # -2.3951454690460073E45

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-virtual {v1, p0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 268
    .line 269
    .line 270
    const-wide p0, -0x36a403d9051405a7L    # -2.496342722709359E45

    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()[B

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    const-wide p2, -0x36a403c9051405a7L    # -2.496364500780842E45

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-static {p0, p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :catch_0
    move-exception p0

    .line 299
    const-wide p1, -0x36a404e4051405a7L    # -2.4959793011414875E45

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    sget-object p2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p2

    .line 314
    const/4 p3, 0x1

    .line 315
    invoke-static {p1, p2, p0, p3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 316
    .line 317
    .line 318
    return-void
.end method

.method public toast(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public writeBytesToFile(Ljava/lang/String;[B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;[B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public writeTextAppendToFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-static {p0, p2, p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲楪兰(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public writeTextToFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-static {p0, p2, p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲楪兰(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

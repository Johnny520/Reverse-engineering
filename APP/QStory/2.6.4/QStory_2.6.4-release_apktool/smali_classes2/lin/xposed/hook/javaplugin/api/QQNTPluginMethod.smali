.class public Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    .locals 3

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
    sget-object v0, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

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
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 50
    .line 51
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {v2, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v0}, Llin/xposed/hook/util/qq/QQMsgService;->deleteMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
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
    .locals 1

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
    sget-object p1, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

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
    const-string p3, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 37
    .line 38
    invoke-static {p3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v0, p3, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance p3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    new-instance p2, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    invoke-static {p3, p1, p2}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->forwardMsg(Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 0

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

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
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Ljava/lang/Object;

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
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Ljava/lang/Object;

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
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Ljava/lang/Object;

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
    sget-object p0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

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
    const/16 p0, 0x3bf

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x4b4

    .line 16
    .line 17
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 22
    .line 23
    const-class v1, Ljava/lang/String;

    .line 24
    .line 25
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, p0, v2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 41
    .line 42
    invoke-direct {v0}, Llin/xposed/hook/javaplugin/bean/GroupInfo;-><init>()V

    .line 43
    .line 44
    .line 45
    const/16 v2, 0x4ab

    .line 46
    .line 47
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {p0, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    iput-object v2, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 58
    .line 59
    const/16 v2, 0x4b0

    .line 60
    .line 61
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {p0, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    iput-object v2, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupName:Ljava/lang/String;

    .line 72
    .line 73
    const/16 v2, 0x4b3

    .line 74
    .line 75
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {p0, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/lang/String;

    .line 84
    .line 85
    iput-object v2, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupOwner:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    iput-boolean v2, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->IsOwnerOrAdmin:Z

    .line 92
    .line 93
    const/16 v2, 0x4b2

    .line 94
    .line 95
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v1, v2, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    new-instance v2, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    if-eqz v1, :cond_1

    .line 111
    .line 112
    const-string p1, "\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 113
    .line 114
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v1, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    array-length v1, p1

    .line 123
    const/4 v3, 0x0

    .line 124
    :goto_0
    if-ge v3, v1, :cond_2

    .line 125
    .line 126
    aget-object v4, p1, v3

    .line 127
    .line 128
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-nez v5, :cond_0

    .line 133
    .line 134
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_1
    invoke-static {p1}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 145
    .line 146
    .line 147
    :cond_2
    iget-object p1, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupOwner:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    iput-object v2, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->AdminList:Ljava/util/ArrayList;

    .line 153
    .line 154
    iput-object p0, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->sourceInfo:Ljava/lang/Object;

    .line 155
    .line 156
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
    invoke-static {}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏楪世兰哲()Ljava/util/ArrayList;

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
    invoke-static {p1}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

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
    sget-object p0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

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
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Ljava/lang/Object;

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
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Ljava/lang/Object;

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
    .locals 4

    .line 1
    sget-object p0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 12
    .line 13
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {p1, p2}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

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
    const/16 p2, 0xb84

    .line 38
    .line 39
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const/16 v1, 0x810

    .line 48
    .line 49
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast p2, Ljava/lang/Long;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    iput-wide v2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->Join_Time:J

    .line 62
    .line 63
    const/16 p2, 0xb85

    .line 64
    .line 65
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    check-cast p2, Ljava/lang/Long;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    iput-wide v1, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->Last_AvtivityTime:J

    .line 86
    .line 87
    const/16 p2, 0xb86

    .line 88
    .line 89
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    const/16 v1, 0x680

    .line 98
    .line 99
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    check-cast p2, Ljava/lang/String;

    .line 106
    .line 107
    iput-object p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    const/16 p2, 0xb87

    .line 110
    .line 111
    const/16 v2, 0x7b8

    .line 112
    .line 113
    :try_start_1
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    check-cast p2, Ljava/lang/Integer;

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    iput p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserLevel:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catchall_0
    const/16 p2, 0xb88

    .line 137
    .line 138
    :try_start_2
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    check-cast p2, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    iput p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserLevel:I

    .line 159
    .line 160
    :goto_0
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    iput-object p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 165
    .line 166
    const/16 p2, 0xb89

    .line 167
    .line 168
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    check-cast p2, Ljava/lang/String;

    .line 183
    .line 184
    iput-object p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserName:Ljava/lang/String;

    .line 185
    .line 186
    const-string p2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 187
    .line 188
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-static {p0, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    if-nez p0, :cond_1

    .line 197
    .line 198
    const-string p0, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u55b5"

    .line 199
    .line 200
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    goto :goto_1

    .line 205
    :catch_0
    move-exception p0

    .line 206
    goto :goto_2

    .line 207
    :cond_1
    :goto_1
    const-string p2, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u545c"

    .line 208
    .line 209
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-static {p2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    iput-boolean p2, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsOwner:Z

    .line 222
    .line 223
    const-string p2, "\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c\u545c"

    .line 224
    .line 225
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p2, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p0

    .line 237
    iput-boolean p0, p1, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsAdmin:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 238
    .line 239
    move-object v0, p1

    .line 240
    goto :goto_3

    .line 241
    :goto_2
    const/16 p1, 0xb83

    .line 242
    .line 243
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    sget-object p2, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    const/4 v1, 0x1

    .line 254
    invoke-static {p1, p2, p0, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 255
    .line 256
    .line 257
    :goto_3
    return-object v0
.end method

.method public getMemberName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1, p2}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getMessageList(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 6
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
    const-string p1, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 6
    .line 7
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 p2, -0x1

    .line 15
    :try_start_0
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 16
    .line 17
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    .line 21
    .line 22
    invoke-direct {v1, p1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    new-instance p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    const/16 p3, 0xb60

    .line 34
    .line 35
    invoke-static {p3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, p2, p3, v0}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :catch_0
    move-exception p0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {p3, p0}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance p3, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏兰哲;

    .line 56
    .line 57
    invoke-direct {p3, v0, v1, p1}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏兰哲;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/CountDownLatch;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {p3}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏兰哲;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const/16 v4, 0xb61

    .line 73
    .line 74
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    iget-object v5, v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 79
    .line 80
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 81
    .line 82
    const/16 v4, 0xb62

    .line 83
    .line 84
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-static {v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const/16 v5, 0xb63

    .line 93
    .line 94
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    iget-object v5, v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 107
    .line 108
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 109
    .line 110
    filled-new-array {p0, p3}, [Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v3, v2, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 118
    .line 119
    .line 120
    iget-object p0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏哲兰;

    .line 123
    .line 124
    if-nez p0, :cond_1

    .line 125
    .line 126
    new-instance p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏哲兰;

    .line 127
    .line 128
    const/16 p3, 0xb64

    .line 129
    .line 130
    invoke-static {p3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    new-instance v0, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-direct {p0, p2, p3, v0}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const/16 v0, 0xb65

    .line 149
    .line 150
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    sget-object v0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {p3, v0, p0, p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 175
    .line 176
    .line 177
    new-instance p1, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏哲兰;

    .line 178
    .line 179
    new-instance p3, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const/16 v0, 0xb66

    .line 185
    .line 186
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    new-instance p3, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-direct {p1, p2, p0, p3}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 210
    .line 211
    .line 212
    move-object p0, p1

    .line 213
    :cond_1
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 216
    .line 217
    .line 218
    sget-object p2, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 219
    .line 220
    const-class p3, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 221
    .line 222
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    check-cast p2, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 227
    .line 228
    iget-object p0, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result p3

    .line 238
    if-eqz p3, :cond_3

    .line 239
    .line 240
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    invoke-virtual {p2, p3}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->isGrayMessage(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_2

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_2
    invoke-virtual {p2, p3}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 252
    .line 253
    .line 254
    move-result-object p3

    .line 255
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_3
    return-object p1
.end method

.method public getNewFriendInfo(Ljava/lang/String;)Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;
    .locals 8

    .line 1
    sget-object p0, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;

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
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 13
    .line 14
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :try_start_0
    invoke-static {}, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/16 v3, 0x6ae

    .line 37
    .line 38
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, v2, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    iput-object v3, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 45
    .line 46
    filled-new-array {p0, p0}, [Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput-object v3, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 51
    .line 52
    const/16 v3, 0x6a3

    .line 53
    .line 54
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    filled-new-array {p1, v3}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v2, v1, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    :goto_0
    return-object v0

    .line 69
    :cond_1
    new-instance v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;

    .line 70
    .line 71
    invoke-direct {v1}, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 75
    .line 76
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {p0, v2, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const/16 v3, 0x6a1

    .line 85
    .line 86
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast v2, Ljava/lang/String;

    .line 93
    .line 94
    const-string v4, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 95
    .line 96
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {p0, v4, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast v4, Ljava/lang/String;

    .line 111
    .line 112
    const-string v5, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c"

    .line 113
    .line 114
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-static {p0, v5, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast p0, Ljava/lang/String;

    .line 129
    .line 130
    const-string v5, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c"

    .line 131
    .line 132
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    invoke-static {v6, v5, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    check-cast v5, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    const-string v7, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 155
    .line 156
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-static {v6, v7, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    check-cast p1, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    iput-object v2, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->uin:Ljava/lang/String;

    .line 177
    .line 178
    iput-object v4, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->nickname:Ljava/lang/String;

    .line 179
    .line 180
    iput-object p0, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->remark:Ljava/lang/String;

    .line 181
    .line 182
    iput v5, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->age:I

    .line 183
    .line 184
    iput p1, v1, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->sex:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    .line 186
    return-object v1

    .line 187
    :catch_0
    move-exception p0

    .line 188
    const/16 p1, 0x25e

    .line 189
    .line 190
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    const/4 v2, 0x1

    .line 201
    invoke-static {p1, v1, p0, v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 202
    .line 203
    .line 204
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
    sget-object p0, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/ArrayList;

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
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Ljava/lang/Object;

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
    .locals 0

    .line 1
    const-string p0, ""

    .line 2
    .line 3
    return-object p0
.end method

.method public httpDownload(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 192
    invoke-direct {p0, p2}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)V

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
    sget p2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

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
    new-instance v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;

    .line 26
    .line 27
    invoke-direct {v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;

    .line 31
    .line 32
    invoke-direct {v1, v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 36
    .line 37
    const/4 v2, 0x7

    .line 38
    invoke-direct {v0, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲(Ljava/util/Map;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-virtual {p3}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏()Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    iput-object p3, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance p3, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;

    .line 55
    .line 56
    invoke-direct {p3, v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 57
    .line 58
    .line 59
    :try_start_0
    new-instance v0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    .line 60
    .line 61
    invoke-direct {v0, v1, p3}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;

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
    iget-object v1, p3, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;

    .line 81
    .line 82
    invoke-virtual {v1}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲()Ljava/io/InputStream;

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
    invoke-virtual {p3}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->close()V
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
    invoke-virtual {p3}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->close()V
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
    new-instance p3, Ljava/lang/RuntimeException;

    .line 154
    .line 155
    const/16 v0, 0x1e

    .line 156
    .line 157
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const/16 v1, 0x1f

    .line 162
    .line 163
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    new-instance v2, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-direct {p3, p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    throw p3
.end method

.method public httpGet(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 82
    invoke-static {p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/String;

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
    sget p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    :try_start_0
    new-instance p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;

    .line 9
    .line 10
    invoke-direct {v0, p0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    const/4 v1, 0x7

    .line 16
    invoke-direct {p0, v1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲(Ljava/util/Map;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏()Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;

    .line 39
    .line 40
    invoke-direct {p1, p0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 41
    .line 42
    .line 43
    new-instance p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    .line 44
    .line 45
    invoke-direct {p0, v0, p1}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;

    .line 53
    .line 54
    invoke-virtual {p1}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->close()V
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
    const-string p1, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 64
    .line 65
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object p2, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const/4 v0, 0x1

    .line 76
    invoke-static {p1, p2, p0, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 77
    .line 78
    .line 79
    const-string p0, ""

    .line 80
    .line 81
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
    sget v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    :try_start_0
    new-instance v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    invoke-direct {v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;

    .line 9
    .line 10
    invoke-direct {v1, v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;)V

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
    invoke-static/range {v6 .. v14}, L飘花落叶言苏子楪哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

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
    invoke-static/range {v7 .. v15}, L飘花落叶言苏子楪哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

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
    const/4 v4, 0x7

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
    const/16 v4, 0x19

    .line 110
    .line 111
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const/16 v5, 0x1d

    .line 116
    .line 117
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v3, v4, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const-string v4, "\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 125
    .line 126
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    const-string v5, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u55b5\u55b5"

    .line 131
    .line 132
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v3, v4, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/16 v4, 0x1b

    .line 140
    .line 141
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    const/16 v5, 0x1c

    .line 146
    .line 147
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v3, v4, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v4, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;

    .line 155
    .line 156
    invoke-direct {v4, v0, v2}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 157
    .line 158
    .line 159
    const-string v0, "POST"

    .line 160
    .line 161
    invoke-virtual {v3, v0, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;)V

    .line 162
    .line 163
    .line 164
    new-instance v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;

    .line 165
    .line 166
    invoke-direct {v0, v3}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 167
    .line 168
    .line 169
    new-instance v2, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    .line 170
    .line 171
    invoke-direct {v2, v1, v0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v1, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;

    .line 179
    .line 180
    invoke-virtual {v1}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    .line 186
    .line 187
    return-object v1

    .line 188
    :catch_0
    move-exception v0

    .line 189
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 190
    .line 191
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    sget-object v2, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    const/4 v3, 0x1

    .line 202
    invoke-static {v1, v2, v0, v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 203
    .line 204
    .line 205
    const-string v0, ""

    .line 206
    .line 207
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

    .line 208
    sget v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 209
    :try_start_0
    new-instance v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;

    invoke-direct {v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;-><init>()V

    .line 210
    new-instance v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;

    invoke-direct {v1, v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;)V

    .line 211
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 212
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 213
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

    .line 214
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 215
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    const-string v9, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    const/4 v13, 0x0

    const/16 v14, 0x5b

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 217
    invoke-static/range {v6 .. v14}, L飘花落叶言苏子楪哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    const-string v10, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    const/4 v14, 0x0

    const/16 v15, 0x5b

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v4

    .line 219
    invoke-static/range {v7 .. v15}, L飘花落叶言苏子楪哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 220
    :cond_0
    new-instance v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    move-object/from16 v4, p1

    .line 221
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 222
    invoke-static/range {p2 .. p2}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲(Ljava/util/Map;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;

    move-result-object v4

    .line 223
    invoke-virtual {v4}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏()Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    move-result-object v4

    iput-object v4, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 224
    new-instance v4, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;

    invoke-direct {v4, v0, v2}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 225
    const-string v0, "POST"

    invoke-virtual {v3, v0, v4}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;)V

    .line 226
    new-instance v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;

    invoke-direct {v0, v3}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 227
    new-instance v2, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    invoke-direct {v2, v1, v0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;)V

    .line 228
    invoke-virtual {v2}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;

    move-result-object v0

    .line 229
    iget-object v1, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;

    .line 230
    invoke-virtual {v1}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    move-result-object v1

    .line 231
    invoke-virtual {v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    .line 232
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 233
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v0, v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 234
    const-string v0, ""

    return-object v0
.end method

.method public httpPostJson(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p1, p2, p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

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
    invoke-static {p1, p3, p2}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

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
    sget-object v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    sget-object v1, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {v0, v2, v1}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v3, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    invoke-direct {v3, p1, v4, v0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

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
    sget-object v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    sget-object v1, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {v0, v2, v1}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v3, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-direct {v3, p1, v4, v0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

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
    sget-object v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    sget-object v1, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {v0, v2, v1}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v3, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-direct {v3, p1, v4, v0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

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
    invoke-static {v0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲兰苏楪(Ljava/io/File;)[B

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
    invoke-static {p0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子世兰楪苏哲(Ljava/lang/String;)Ljava/lang/String;

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
    sget-object v0, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

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
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c"

    .line 39
    .line 40
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-static {v2, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    invoke-static {v1, v2, v3, p3, p2}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;JLjava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_2
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    const/16 p0, 0x24a

    .line 67
    .line 68
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public replyEmoji(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 76
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
    sget-object v0, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

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
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 50
    .line 51
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {v2, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    invoke-static {v1, v2, v3}, Llin/xposed/hook/util/qq/QQMsgService;->recallMsg(Ljava/lang/Object;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
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
    invoke-static {p1}, L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/String;

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
    const-string p0, ""

    .line 17
    .line 18
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
    invoke-static {p1}, L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

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
    const/16 v3, 0x247

    .line 19
    .line 20
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/16 v4, 0x248

    .line 29
    .line 30
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v3, v0, v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    const/16 v4, 0x249

    .line 41
    .line 42
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v2, v4, v5, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget v3, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    const/16 v4, 0x3426

    .line 61
    .line 62
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    if-lt v3, v4, :cond_1

    .line 67
    .line 68
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v3}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    filled-new-array {v0, v0, v6}, [Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v3, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 81
    .line 82
    .line 83
    iput-object v5, v3, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    filled-new-array {p2, p1, v0}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v3, v2, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :catch_0
    move-exception p1

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    const/16 v4, 0x3002

    .line 100
    .line 101
    if-lt v3, v4, :cond_2

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {v3}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    filled-new-array {v6, v0, v0}, [Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v3, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 116
    .line 117
    .line 118
    iput-object v5, v3, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    filled-new-array {v0, p2, p1}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v3, v2, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {v3}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    filled-new-array {v0, v0, v6}, [Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v3, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 145
    .line 146
    .line 147
    iput-object v5, v3, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 148
    .line 149
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    filled-new-array {p2, p1, v0}, [Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {v3, v2, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :goto_1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
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
    new-instance v0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-direct {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()[B

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/String;[B)V
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
    :try_start_0
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 14
    .line 15
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {v2, v1, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-static {v1, v2}, Llin/xposed/hook/util/qq/CreateElement;->createReplyElement(J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p1, p3}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->parseCompoundMessages(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 p3, 0x0

    .line 40
    invoke-virtual {p1, p3, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception p1

    .line 48
    iget-object p0, p0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->errorOutput:Llin/xposed/hook/javaplugin/PluginOutput;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
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
    .locals 1

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
    const/16 p4, 0x15b

    .line 8
    .line 9
    invoke-static {p4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    :cond_0
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p3}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->resolvePath(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Llin/xposed/hook/util/qq/CreateElement;->createEmojiElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/16 p2, 0x112

    .line 26
    .line 27
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const/16 p3, 0xa9

    .line 32
    .line 33
    invoke-static {p3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-static {p3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-static {p3, p2, p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 46
    .line 47
    invoke-static {p3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-static {p2, p3, p4}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/16 p3, 0x84

    .line 55
    .line 56
    invoke-static {p3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    const/4 p4, 0x0

    .line 61
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    invoke-static {p2, p3, p4}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance p2, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 77
    .line 78
    .line 79
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
    .locals 3

    .line 1
    sget-object p0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    const-string p0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 4
    .line 5
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string p0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 12
    .line 13
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string p0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 20
    .line 21
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getAppRuntime()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x249

    .line 35
    .line 36
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 41
    .line 42
    invoke-interface {v1}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {p0, v0, v1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const/16 v0, 0xb96

    .line 57
    .line 58
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲苏兰楪(Ljava/lang/String;)Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v1, 0x0

    .line 67
    new-array v1, v1, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v0, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 77
    .line 78
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v0, v1, p3}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲苏楪兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/16 p3, 0xb86

    .line 86
    .line 87
    invoke-static {p3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-static {v0, p3, p2}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲苏楪兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const/16 p2, 0x4ab

    .line 95
    .line 96
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {v0, p2, p1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲苏楪兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {p2}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    const/4 p3, 0x1

    .line 112
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    filled-new-array {p3}, [Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-static {p3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    invoke-static {p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-class v1, Ljava/lang/String;

    .line 129
    .line 130
    const-class v2, Ljava/util/ArrayList;

    .line 131
    .line 132
    filled-new-array {v1, v2, v2}, [Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v0, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 137
    .line 138
    .line 139
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {v0, p0, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public setTitle(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    sget-object p0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-string p0, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 4
    .line 5
    const-class v0, Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 8
    .line 9
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 16
    .line 17
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 24
    .line 25
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :try_start_0
    sget v1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 32
    .line 33
    const/16 v2, 0x3002

    .line 34
    .line 35
    if-ge v1, v2, :cond_0

    .line 36
    .line 37
    invoke-static {p1, p2, p3}, Llin/xposed/hook/util/qq/QQNTTroopTool;->setGroupMemberTitle(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const/16 v1, 0xb8f

    .line 42
    .line 43
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, ""

    .line 52
    .line 53
    invoke-static {v1, v2}, Llin/xposed/hook/util/qq/QQEnvTool;->getRuntimeService(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const/16 v3, 0xb90

    .line 62
    .line 63
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iput-object v3, v2, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v0, v2, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 70
    .line 71
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v2, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 76
    .line 77
    .line 78
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v2, v1, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/16 v1, 0x680

    .line 87
    .line 88
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    new-instance v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 97
    .line 98
    invoke-direct {v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 102
    .line 103
    invoke-direct {v2}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    const/16 v4, 0x8fc

    .line 111
    .line 112
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    const-string v3, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 120
    .line 121
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    const/4 v4, 0x2

    .line 126
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 134
    .line 135
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v5

    .line 146
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {v3, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 154
    .line 155
    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 163
    .line 164
    .line 165
    move-result-wide v4

    .line 166
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    const-string p0, "\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 174
    .line 175
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p1, p0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    const-string p0, "\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 183
    .line 184
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    const-wide p2, 0xffffffffL

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-virtual {p1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    const-string p0, "\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 201
    .line 202
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    const-string p0, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 210
    .line 211
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {v3, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    const-string p0, "\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c"

    .line 219
    .line 220
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {v2, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 228
    .line 229
    .line 230
    const/16 p0, 0xb91

    .line 231
    .line 232
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-virtual {v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()[B

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    const/16 p2, 0xb92

    .line 241
    .line 242
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-static {p0, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :catch_0
    move-exception p0

    .line 253
    const/16 p1, 0xb83

    .line 254
    .line 255
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    sget-object p2, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    const/4 p3, 0x1

    .line 266
    invoke-static {p1, p2, p0, p3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 267
    .line 268
    .line 269
    return-void
.end method

.method public toast(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

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
    invoke-static {p0, p2}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世楪兰哲(Ljava/lang/String;[B)V

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
    invoke-static {p0, p2, p1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世哲楪兰(Ljava/lang/String;Ljava/lang/String;Z)V

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
    invoke-static {p0, p2, p1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世哲楪兰(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

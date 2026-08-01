.class public Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final CONFIG_FILE_NAME:Ljava/lang/String;

.field private static final configUtils:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-wide v0, -0x36a539ff051405a7L    # -2.3882717652342044E45

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
    sput-object v2, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->CONFIG_FILE_NAME:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v2, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v2, v0, v1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->configUtils:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static addAutoLoadPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V
    .locals 5

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->configUtils:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-wide v1, -0x36a539ff051405a7L    # -2.3882717652342044E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-class v4, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v4, v3}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v0, v3, p0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static isAutoLoading(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z
    .locals 3

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->configUtils:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-wide v1, -0x36a539ff051405a7L    # -2.3882717652342044E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method private synthetic lambda$loadHook$0()V
    .locals 2

    .line 1
    :catch_0
    :goto_0
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopAllPlugin()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->startAutoLoadPlugin()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :catch_1
    move-exception v0

    .line 15
    invoke-virtual {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    :goto_1
    return-void

    .line 23
    :cond_0
    const-wide/16 v0, 0x32

    .line 24
    .line 25
    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0
.end method

.method public static removeAutoloadPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V
    .locals 5

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->configUtils:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-wide v1, -0x36a539ff051405a7L    # -2.3882717652342044E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-class v4, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v4, v3}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0, v3, p0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private scanAllJavaPluginInfo()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Llin/xposed/hook/javaplugin/bean/PluginInfo;",
            ">;"
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
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->scanScriptDirectory()[Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    array-length v1, p0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_2

    .line 16
    .line 17
    aget-object v3, p0, v2

    .line 18
    .line 19
    invoke-static {v3}, Llin/xposed/hook/javaplugin/controller/PluginManager;->newPluginInfo(Ljava/io/File;)Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    :goto_2
    return-object v0
.end method

.method private scanScriptDirectory()[Ljava/io/File;
    .locals 2

    .line 1
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide v0, -0x36a53cea051405a7L    # -2.3872550015218446E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Llin/xposed/hook/javaplugin/controller/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p0, v1}, Llin/xposed/hook/javaplugin/controller/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->lambda$loadHook$0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public isLoadedByDefault()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public loadHook(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    invoke-static {}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 8
    .line 9
    const-wide v0, -0x36a501a5051405a7L    # -2.4079074189350102E45

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public startAutoLoadPlugin()V
    .locals 7

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->configUtils:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-wide v1, -0x36a539ff051405a7L    # -2.3882717652342044E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-class v4, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v4, v3}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->scanAllJavaPluginInfo()Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 42
    .line 43
    invoke-virtual {v4}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static {v5, v4}, Llin/xposed/hook/javaplugin/controller/PluginManager;->loadPlugin(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    sget-object p0, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->configUtils:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 62
    .line 63
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0, v3, v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

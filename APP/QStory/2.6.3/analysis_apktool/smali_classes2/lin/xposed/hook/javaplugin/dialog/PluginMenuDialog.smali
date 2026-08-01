.class public Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;
.super Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static Instance:Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;


# instance fields
.field public handler:Landroid/os/Handler;

.field private pluginMenuGroup:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->handler:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
.end method

.method public static getCurrentInstance()Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;
    .locals 1

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->Instance:Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;

    .line 2
    .line 3
    return-object v0
.end method

.method private initView()V
    .locals 4

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
    new-instance v2, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-direct {v2, v3, v1}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;-><init>(Landroid/content/Context;Llin/xposed/hook/javaplugin/controller/PluginLoader;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->pluginMenuGroup:Landroid/widget/LinearLayout;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method private synthetic lambda$noticeViewUpdate$0()V
    .locals 1

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->pluginMenuGroup:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->initView()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static showDialog(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Z

    .line 16
    .line 17
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object p0, v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->show()Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->lambda$noticeViewUpdate$0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getImplLayoutId()I
    .locals 0

    .line 1
    const p0, 0x240c00e7

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public getMaxHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-float p0, p0

    .line 10
    const/high16 v0, 0x3f000000    # 0.5f

    .line 11
    .line 12
    mul-float/2addr p0, v0

    .line 13
    float-to-int p0, p0

    .line 14
    return p0
.end method

.method public getPopupHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-float p0, p0

    .line 10
    const/high16 v0, 0x3f000000    # 0.5f

    .line 11
    .line 12
    mul-float/2addr p0, v0

    .line 13
    float-to-int p0, p0

    .line 14
    return p0
.end method

.method public declared-synchronized noticeViewUpdate()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->handler:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    const/16 v2, 0x9

    .line 7
    .line 8
    invoke-direct {v1, p0, v2}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public onCreate()V
    .locals 1

    .line 1
    sput-object p0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->Instance:Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;

    .line 2
    .line 3
    const v0, 0x24090293

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/LinearLayout;

    .line 11
    .line 12
    iput-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->pluginMenuGroup:Landroid/widget/LinearLayout;

    .line 13
    .line 14
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->initView()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onDismiss()V
    .locals 1

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->getAllRunningPluginLoader()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 20
    .line 21
    iget-object v0, v0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->temporaryItemMap:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

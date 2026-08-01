.class public Llin/xposed/hook/javaplugin/view/PluginItemView;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Ljava/lang/Runnable;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field private animating:Z

.field protected final autoLoadCheckbox:Landroid/widget/CheckBox;

.field private final iconView:Landroid/widget/ImageView;

.field protected final infoView:Landroid/widget/RelativeLayout;

.field private isCooldown:Z

.field private isShowing:Z

.field private loadCallback:Llin/xposed/hook/javaplugin/dialog/PluginDialog$PluginLoadCallback;

.field private pluginDialog:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

.field protected pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

.field protected final pluginSwitch:Landroid/widget/Switch;

.field private final previewLayout:Landroid/widget/LinearLayout;

.field protected final progressBar:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isShowing:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->animating:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isCooldown:Z

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const v0, 0x240c00e5

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    const p1, 0x2409028f

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 29
    .line 30
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 31
    .line 32
    const p1, 0x24090298

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/widget/Switch;

    .line 40
    .line 41
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 42
    .line 43
    const p1, 0x24090288

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Landroid/widget/CheckBox;

    .line 51
    .line 52
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->autoLoadCheckbox:Landroid/widget/CheckBox;

    .line 53
    .line 54
    const p1, 0x24090297

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Landroid/widget/ProgressBar;

    .line 62
    .line 63
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->progressBar:Landroid/widget/ProgressBar;

    .line 64
    .line 65
    const p1, 0x240902a2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Landroid/widget/LinearLayout;

    .line 73
    .line 74
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->previewLayout:Landroid/widget/LinearLayout;

    .line 75
    .line 76
    const p1, 0x24090284

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Landroid/widget/ImageView;

    .line 84
    .line 85
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->iconView:Landroid/widget/ImageView;

    .line 86
    .line 87
    return-void
.end method

.method private copyTextToClipboard(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide v0, -0x36a502c5051405a7L    # -2.4075154136483173E45

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
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/content/ClipboardManager;

    .line 19
    .line 20
    const-wide v0, -0x36a54dbe051405a7L    # -2.381391255775063E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception p0

    .line 38
    const-wide v0, -0x36a54da9051405a7L    # -2.3814198394938844E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-static {p1, v0, p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 55
    .line 56
    .line 57
    const-wide p0, -0x36a50e32051405a7L    # -2.4035341099553423E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method private getUploadInfo()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a54ea2051405a7L    # -2.381080918256431E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 19
    .line 20
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-wide v1, -0x36a54e98051405a7L    # -2.381094529551108E45

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
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 40
    .line 41
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginVersion()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-wide v1, -0x36a54e86051405a7L    # -2.3811190298815262E45

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 61
    .line 62
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginAuthor()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-wide v1, -0x36a54e8c051405a7L    # -2.38111086310472E45

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method private static synthetic lambda$bindPluginInfoData$1(Landroid/view/View;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a54d61051405a7L    # -2.3815178408155576E45

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
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static synthetic lambda$bindPluginInfoData$2(Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->addAutoLoadPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-static {p0}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->removeAutoloadPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private synthetic lambda$bindPluginInfoData$3()V
    .locals 1

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private synthetic lambda$bindPluginInfoData$4()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isCooldown:Z

    .line 3
    .line 4
    return-void
.end method

.method private lambda$bindPluginInfoData$5(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    :try_start_0
    iget-boolean p2, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isCooldown:Z

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const-wide v1, -0x36a54d74051405a7L    # -2.3814919793556716E45

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance p2, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {p2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    move-exception p0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iput-boolean v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isCooldown:Z

    .line 42
    .line 43
    new-instance p1, Ljava/lang/Thread;

    .line 44
    .line 45
    invoke-direct {p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 49
    .line 50
    .line 51
    new-instance p1, Landroid/os/Handler;

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;

    .line 61
    .line 62
    invoke-direct {p2, p0, v0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 63
    .line 64
    .line 65
    const-wide/16 v1, 0xbb8

    .line 66
    .line 67
    invoke-virtual {p1, p2, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationLoad(Z)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->stopRunPlugin()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationLoad(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :goto_0
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const-wide p1, -0x36a54d7d051405a7L    # -2.3814797291904624E45

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object p2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p1, p2, p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method private synthetic lambda$bindPluginInfoData$6(Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginDesc()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->showCopyDialog(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0
.end method

.method private lambda$bindPluginInfoData$7(Llin/xposed/hook/javaplugin/bean/PluginInfo;Ljava/io/File;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-wide v0, -0x36a54d8c051405a7L    # -2.3814593122484472E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-wide v1, -0x36a54d88051405a7L    # -2.381464756766318E45

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v0, Landroid/widget/ImageView;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 62
    .line 63
    const/high16 v1, 0x41200000    # 10.0f

    .line 64
    .line 65
    mul-float/2addr v1, p0

    .line 66
    const/high16 p0, 0x3f000000    # 0.5f

    .line 67
    .line 68
    add-float/2addr v1, p0

    .line 69
    float-to-int p0, v1

    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-virtual {v0, p0, v1, p0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0, p2}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    new-instance p1, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲世兰苏;

    .line 96
    .line 97
    const/4 p2, 0x3

    .line 98
    invoke-direct {p1, v0, p2}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲世兰苏;-><init>(Landroid/view/View;I)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 102
    .line 103
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 104
    .line 105
    .line 106
    new-instance p1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 107
    .line 108
    const/4 p2, 0x5

    .line 109
    invoke-direct {p1, p2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 110
    .line 111
    .line 112
    const-string p2, "\u786e\u5b9a"

    .line 113
    .line 114
    invoke-virtual {p0, p2, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method private synthetic lambda$notificationError$0()V
    .locals 1

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private synthetic lambda$notificationLoad$10(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->progressBar:Landroid/widget/ProgressBar;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->progressBar:Landroid/widget/ProgressBar;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private synthetic lambda$onClick$8(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 18
    .line 19
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private synthetic lambda$onClick$9(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 18
    .line 19
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private synthetic lambda$onLongClick$11(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->showUploadDialog()V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x1

    .line 8
    if-ne p3, p1, :cond_1

    .line 9
    .line 10
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->showDeleteDialog()V

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method private synthetic lambda$showCopyDialog$16(Ljava/lang/String;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->copyTextToClipboard(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-wide p0, -0x36a54d90051405a7L    # -2.3814538677305764E45

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method private synthetic lambda$showDeleteDialog$13()V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginDialog:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->switchToLocalScript()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private synthetic lambda$showDeleteDialog$14(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    invoke-static {p1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/io/File;

    .line 7
    .line 8
    iget-object p2, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 9
    .line 10
    invoke-virtual {p2}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginLocalPath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/io/File;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Landroid/os/Handler;

    .line 21
    .line 22
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 27
    .line 28
    .line 29
    new-instance p2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-direct {p2, p0, v0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v0, 0x12c

    .line 36
    .line 37
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method private static synthetic lambda$showDeleteDialog$15(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    const-wide p0, -0x36a54d98051405a7L    # -2.381442978694835E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method private synthetic lambda$showUploadDialog$12(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    new-instance p1, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 2
    .line 3
    invoke-direct {p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->upload(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private showCopyDialog(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a54db6051405a7L    # -2.3814021448108045E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 21
    .line 22
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 23
    .line 24
    .line 25
    const-wide v1, -0x36a54db3051405a7L    # -2.3814062281992075E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v2, p0, v3, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 41
    .line 42
    .line 43
    const-wide p0, -0x36a519a9051405a7L    # -2.3995391949676905E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private showDeleteDialog()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a54eb4051405a7L    # -2.3810564179260128E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-wide v2, -0x36a54eb1051405a7L    # -2.3810605013144158E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 38
    .line 39
    invoke-virtual {v2}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-wide v2, -0x36a54eb9051405a7L    # -2.3810496122786744E45

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 63
    .line 64
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 65
    .line 66
    .line 67
    const-wide v1, -0x36a54ec9051405a7L    # -2.3810278342071914E45

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
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲世兰;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v2, p0, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲世兰;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 83
    .line 84
    .line 85
    const-wide v1, -0x36a54ec1051405a7L    # -2.381038723242933E45

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 95
    .line 96
    invoke-direct {v1, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 97
    .line 98
    .line 99
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世哲楪兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;

    .line 102
    .line 103
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method private showUploadDialog()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a54ecc051405a7L    # -2.3810237508187884E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->getUploadInfo()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 25
    .line 26
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 27
    .line 28
    .line 29
    const-wide v1, -0x36a54ec9051405a7L    # -2.3810278342071914E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲世兰;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {v2, p0, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲世兰;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 45
    .line 46
    .line 47
    const-wide v1, -0x36a54ec1051405a7L    # -2.381038723242933E45

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private startRunPlugin()V
    .locals 1

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    invoke-static {p0, v0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->loadPlugin(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private stopRunPlugin()V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    invoke-static {p0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$bindPluginInfoData$2(Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/widget/CompoundButton;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世兰苏哲(Llin/xposed/hook/javaplugin/view/PluginItemView;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$bindPluginInfoData$5(Landroid/widget/CompoundButton;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/view/PluginItemView;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$onLongClick$11(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Llin/xposed/hook/javaplugin/view/PluginItemView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$bindPluginInfoData$3()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Llin/xposed/hook/javaplugin/view/PluginItemView;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$showUploadDialog$12(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$bindPluginInfoData$6(Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪哲世兰苏(Llin/xposed/hook/javaplugin/view/PluginItemView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$bindPluginInfoData$4()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲世苏兰(Llin/xposed/hook/javaplugin/view/PluginItemView;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$onClick$9(Landroid/animation/ValueAnimator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲兰世苏(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$showDeleteDialog$15(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static bridge synthetic 飘花落叶言子楪哲兰苏世(Llin/xposed/hook/javaplugin/view/PluginItemView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->animating:Z

    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲苏世兰(Llin/xposed/hook/javaplugin/view/PluginItemView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$showDeleteDialog$13()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲苏兰世(Llin/xposed/hook/javaplugin/view/PluginItemView;Ljava/lang/String;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$showCopyDialog$16(Ljava/lang/String;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪苏世兰哲(Llin/xposed/hook/javaplugin/view/PluginItemView;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$notificationLoad$10(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪苏世哲兰(Llin/xposed/hook/javaplugin/view/PluginItemView;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$onClick$8(Landroid/animation/ValueAnimator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪苏兰世哲(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$bindPluginInfoData$1(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪苏兰哲世(Llin/xposed/hook/javaplugin/view/PluginItemView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$notificationError$0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪苏哲世兰(Llin/xposed/hook/javaplugin/view/PluginItemView;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$showDeleteDialog$14(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪苏哲兰世(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;Ljava/io/File;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Llin/xposed/hook/javaplugin/view/PluginItemView;->lambda$bindPluginInfoData$7(Llin/xposed/hook/javaplugin/bean/PluginInfo;Ljava/io/File;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bindPluginInfoData(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V
    .locals 10

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginNameText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-wide v1, -0x36a54f46051405a7L    # -2.380857693023731E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginVersion()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginVersionText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-wide v1, -0x36a54f5e051405a7L    # -2.3808250259165066E45

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginAuthor()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-wide v1, -0x36a54ed7051405a7L    # -2.381008778394644E45

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getDate()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setAuthorText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-wide v1, -0x36a54edc051405a7L    # -2.3810019727473054E45

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getTags()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setTagsText(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginDesc()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setDescText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-wide v1, -0x36a54f42051405a7L    # -2.3808631375416017E45

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginIdText(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->progressBar:Landroid/widget/ProgressBar;

    .line 161
    .line 162
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 163
    .line 164
    const/4 v2, 0x2

    .line 165
    invoke-direct {v1, v2}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->autoLoadCheckbox:Landroid/widget/CheckBox;

    .line 172
    .line 173
    invoke-static {p1}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->isAutoLoading(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->autoLoadCheckbox:Landroid/widget/CheckBox;

    .line 181
    .line 182
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;

    .line 183
    .line 184
    const/4 v2, 0x0

    .line 185
    invoke-direct {v1, p1, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 192
    .line 193
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->isRunning(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 205
    .line 206
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;

    .line 207
    .line 208
    const/4 v3, 0x1

    .line 209
    invoke-direct {v1, p0, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 213
    .line 214
    .line 215
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 216
    .line 217
    const/16 v1, 0x8

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 229
    .line 230
    const v3, 0x2409028a

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, Landroid/widget/TextView;

    .line 238
    .line 239
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    new-instance v3, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;

    .line 243
    .line 244
    invoke-direct {v3, p0, v2, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getIconPath()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sget-object v3, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;

    .line 255
    .line 256
    if-eqz v0, :cond_0

    .line 257
    .line 258
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    new-instance v4, Ljava/io/File;

    .line 263
    .line 264
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getIconPath()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    new-instance v4, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 276
    .line 277
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 278
    .line 279
    .line 280
    move-result-wide v5

    .line 281
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-direct {v4, v5}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 293
    .line 294
    invoke-virtual {v0, v3}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 299
    .line 300
    new-instance v4, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 301
    .line 302
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getIconPath()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-direct {v4, v5}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    check-cast v0, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 314
    .line 315
    iget-object v4, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->iconView:Landroid/widget/ImageView;

    .line 316
    .line 317
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 318
    .line 319
    .line 320
    :cond_0
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-eqz v0, :cond_2

    .line 325
    .line 326
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-nez v0, :cond_2

    .line 335
    .line 336
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-eqz v1, :cond_1

    .line 349
    .line 350
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    check-cast v1, Ljava/lang/String;

    .line 355
    .line 356
    new-instance v4, Ljava/io/File;

    .line 357
    .line 358
    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 362
    .line 363
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    const v6, 0x24070461

    .line 372
    .line 373
    .line 374
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    float-to-int v5, v5

    .line 379
    const/4 v6, -0x1

    .line 380
    invoke-direct {v1, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    const v6, 0x24070460

    .line 392
    .line 393
    .line 394
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    float-to-int v5, v5

    .line 399
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 400
    .line 401
    .line 402
    new-instance v5, Landroid/widget/ImageView;

    .line 403
    .line 404
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    invoke-direct {v5, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 409
    .line 410
    .line 411
    const v6, 0x240800cb

    .line 412
    .line 413
    .line 414
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 415
    .line 416
    .line 417
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 418
    .line 419
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 420
    .line 421
    .line 422
    invoke-static {v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    invoke-virtual {v6, v4}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    const v7, 0x240800b6

    .line 431
    .line 432
    .line 433
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 438
    .line 439
    const v7, 0x240800b8

    .line 440
    .line 441
    .line 442
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 447
    .line 448
    new-instance v7, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 449
    .line 450
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 451
    .line 452
    .line 453
    move-result-wide v8

    .line 454
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 455
    .line 456
    .line 457
    move-result-object v8

    .line 458
    invoke-direct {v7, v8}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 466
    .line 467
    invoke-virtual {v6, v3}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 472
    .line 473
    invoke-virtual {v6}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 478
    .line 479
    invoke-virtual {v6, v5}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 480
    .line 481
    .line 482
    new-instance v6, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 483
    .line 484
    invoke-direct {v6, p0, p1, v4, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 488
    .line 489
    .line 490
    iget-object v4, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->previewLayout:Landroid/widget/LinearLayout;

    .line 491
    .line 492
    invoke-virtual {v4, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_0

    .line 496
    .line 497
    :cond_1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->previewLayout:Landroid/widget/LinearLayout;

    .line 498
    .line 499
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :cond_2
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->previewLayout:Landroid/widget/LinearLayout;

    .line 504
    .line 505
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 506
    .line 507
    .line 508
    return-void
.end method

.method public notificationError()V
    .locals 3

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->loadCallback:Llin/xposed/hook/javaplugin/dialog/PluginDialog$PluginLoadCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog$PluginLoadCallback;->notificationError()V

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-direct {v1, p0, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public notificationLoad(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->loadCallback:Llin/xposed/hook/javaplugin/dialog/PluginDialog$PluginLoadCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog$PluginLoadCallback;->notificationLoad(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲兰苏;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-boolean p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->animating:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->animating:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isShowing:Z

    .line 10
    .line 11
    iget-object v1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const-wide/16 v3, 0x12c

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    filled-new-array {p1, v2}, [I

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    .line 33
    new-instance v0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰世哲;

    .line 34
    .line 35
    invoke-direct {v0, p0, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰世哲;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Llin/xposed/hook/javaplugin/view/PluginItemView$1;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Llin/xposed/hook/javaplugin/view/PluginItemView$1;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 50
    .line 51
    .line 52
    iput-boolean v2, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isShowing:Z

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 59
    .line 60
    const/4 v1, -0x1

    .line 61
    const/4 v5, -0x2

    .line 62
    invoke-virtual {v0, v1, v5}, Landroid/view/View;->measure(II)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    filled-new-array {v2, v0}, [I

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 80
    .line 81
    .line 82
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰世哲;

    .line 83
    .line 84
    invoke-direct {v1, p0, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰世哲;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Llin/xposed/hook/javaplugin/view/PluginItemView$2;

    .line 91
    .line 92
    invoke-direct {v1, p0}, Llin/xposed/hook/javaplugin/view/PluginItemView$2;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 99
    .line 100
    .line 101
    iput-boolean p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isShowing:Z

    .line 102
    .line 103
    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 1
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪世兰哲()L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-wide v1, -0x36a54ed8051405a7L    # -2.3810074172651762E45

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
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 23
    .line 24
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 36
    .line 37
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲世兰()V

    .line 38
    .line 39
    .line 40
    const-wide v0, -0x36a54ec6051405a7L    # -2.3810319175955945E45

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-wide v1, -0x36a50c6f051405a7L    # -2.4041479793452677E45

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-wide v2, -0x36a54ec1051405a7L    # -2.381038723242933E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲兰世([Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 75
    .line 76
    const/4 v1, 0x6

    .line 77
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲兰楪世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;

    .line 81
    .line 82
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x1

    .line 86
    return p0
.end method

.method public run()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationLoad(Z)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->startRunPlugin()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationLoad(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setAuthorText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 2
    .line 3
    const v0, 0x24090287

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setDescText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 2
    .line 3
    const v0, 0x2409028a

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setPluginDialog(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginDialog:Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 2
    .line 3
    return-void
.end method

.method public setPluginIdText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 2
    .line 3
    const v0, 0x2409028e

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setPluginLoadCallback(Llin/xposed/hook/javaplugin/dialog/PluginDialog$PluginLoadCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->loadCallback:Llin/xposed/hook/javaplugin/dialog/PluginDialog$PluginLoadCallback;

    .line 2
    .line 3
    return-void
.end method

.method public setPluginNameText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    const v0, 0x24090295

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setPluginVersionText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    const v0, 0x2409029b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setTagsText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 2
    .line 3
    const v0, 0x24090299

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

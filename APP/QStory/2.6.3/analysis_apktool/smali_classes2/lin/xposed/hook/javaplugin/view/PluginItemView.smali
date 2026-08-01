.class public Llin/xposed/hook/javaplugin/view/PluginItemView;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    const/16 v0, 0x2e

    .line 6
    .line 7
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/content/ClipboardManager;

    .line 16
    .line 17
    const/16 v0, 0x2f3

    .line 18
    .line 19
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p0

    .line 32
    const/16 p1, 0x2f4

    .line 33
    .line 34
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-static {p1, v0, p0, v1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 46
    .line 47
    .line 48
    const/16 p0, 0x67

    .line 49
    .line 50
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private getUploadInfo()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2ee

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 16
    .line 17
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x2ef

    .line 25
    .line 26
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 34
    .line 35
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginVersion()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x2f0

    .line 43
    .line 44
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 52
    .line 53
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginAuthor()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const/16 p0, 0x2f1

    .line 61
    .line 62
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method private static synthetic lambda$bindPluginInfoData$1(Landroid/view/View;)V
    .locals 0

    .line 1
    const/16 p0, 0x2fb

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
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
    const/16 p2, 0x2f9

    .line 10
    .line 11
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {p2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iput-boolean v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->isCooldown:Z

    .line 39
    .line 40
    new-instance p1, Ljava/lang/Thread;

    .line 41
    .line 42
    invoke-direct {p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 46
    .line 47
    .line 48
    new-instance p1, Landroid/os/Handler;

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 55
    .line 56
    .line 57
    new-instance p2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;

    .line 58
    .line 59
    invoke-direct {p2, p0, v0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰苏哲;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 60
    .line 61
    .line 62
    const-wide/16 v1, 0xbb8

    .line 63
    .line 64
    invoke-virtual {p1, p2, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationLoad(Z)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->stopRunPlugin()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->notificationLoad(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_0
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/16 p1, 0x2fa

    .line 86
    .line 87
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    sget-object p2, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-static {p1, p2, p0, v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 98
    .line 99
    .line 100
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
    .locals 2

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
    const/16 p3, 0x2f7

    .line 9
    .line 10
    invoke-static {p3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x2f8

    .line 20
    .line 21
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroid/widget/ImageView;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 56
    .line 57
    const/high16 v1, 0x41200000    # 10.0f

    .line 58
    .line 59
    mul-float/2addr v1, p0

    .line 60
    const/high16 p0, 0x3f000000    # 0.5f

    .line 61
    .line 62
    add-float/2addr v1, p0

    .line 63
    float-to-int p0, v1

    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, p0, v1, p0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0, p2}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    new-instance p1, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲世兰苏;

    .line 90
    .line 91
    const/4 p2, 0x3

    .line 92
    invoke-direct {p1, v0, p2}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲世兰苏;-><init>(Landroid/view/View;I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 96
    .line 97
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 98
    .line 99
    .line 100
    new-instance p1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 101
    .line 102
    const/4 p2, 0x5

    .line 103
    invoke-direct {p1, p2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 104
    .line 105
    .line 106
    const-string p2, "\u786e\u5b9a"

    .line 107
    .line 108
    invoke-virtual {p0, p2, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 109
    .line 110
    .line 111
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
    const/16 p0, 0x2f5

    .line 5
    .line 6
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
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
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪苏兰世哲(Ljava/io/File;)V

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
    const/16 p0, 0x2f6

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
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
    const/16 v1, 0x2f2

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 18
    .line 19
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 20
    .line 21
    .line 22
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 23
    .line 24
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v2, p0, v3, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 35
    .line 36
    .line 37
    const-string p0, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 38
    .line 39
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 49
    .line 50
    .line 51
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
    const/16 v1, 0x2eb

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x2ec

    .line 23
    .line 24
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 32
    .line 33
    invoke-virtual {v2}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v2, 0x2ed

    .line 41
    .line 42
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 54
    .line 55
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 56
    .line 57
    .line 58
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u55b5\u545c\u545c\u55b5"

    .line 59
    .line 60
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲世兰;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct {v2, p0, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲世兰;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 71
    .line 72
    .line 73
    const-string p0, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 74
    .line 75
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 80
    .line 81
    invoke-direct {v1, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世哲楪兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;

    .line 87
    .line 88
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 92
    .line 93
    .line 94
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
    const/16 v1, 0x2ea

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->getUploadInfo()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 24
    .line 25
    .line 26
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u55b5\u545c\u545c\u55b5"

    .line 27
    .line 28
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲世兰;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v2, p0, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲世兰;-><init>(Llin/xposed/hook/javaplugin/view/PluginItemView;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 39
    .line 40
    .line 41
    const-string p0, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 42
    .line 43
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 53
    .line 54
    .line 55
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
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 16
    .line 17
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginVersion()Ljava/lang/String;

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
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginVersionText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 44
    .line 45
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginAuthor()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const/16 v1, 0x2e8

    .line 60
    .line 61
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getDate()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setAuthorText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 88
    .line 89
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getTags()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setTagsText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginDesc()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setDescText(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v1, "\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 123
    .line 124
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginIdText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->progressBar:Landroid/widget/ProgressBar;

    .line 146
    .line 147
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 148
    .line 149
    const/4 v2, 0x2

    .line 150
    invoke-direct {v1, v2}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->autoLoadCheckbox:Landroid/widget/CheckBox;

    .line 157
    .line 158
    invoke-static {p1}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->isAutoLoading(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->autoLoadCheckbox:Landroid/widget/CheckBox;

    .line 166
    .line 167
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;

    .line 168
    .line 169
    const/4 v2, 0x0

    .line 170
    invoke-direct {v1, p1, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 177
    .line 178
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->isRunning(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 187
    .line 188
    .line 189
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 190
    .line 191
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;

    .line 192
    .line 193
    const/4 v3, 0x1

    .line 194
    invoke-direct {v1, p0, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 201
    .line 202
    const/16 v1, 0x8

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    .line 212
    .line 213
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 214
    .line 215
    const v3, 0x2409028a

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Landroid/widget/TextView;

    .line 223
    .line 224
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    .line 226
    .line 227
    new-instance v3, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;

    .line 228
    .line 229
    invoke-direct {v3, p0, v2, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getIconPath()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sget-object v3, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;

    .line 240
    .line 241
    if-eqz v0, :cond_0

    .line 242
    .line 243
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    new-instance v4, Ljava/io/File;

    .line 248
    .line 249
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getIconPath()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    new-instance v4, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 261
    .line 262
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 263
    .line 264
    .line 265
    move-result-wide v5

    .line 266
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-direct {v4, v5}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 278
    .line 279
    invoke-virtual {v0, v3}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    check-cast v0, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 284
    .line 285
    new-instance v4, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 286
    .line 287
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getIconPath()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-direct {v4, v5}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 299
    .line 300
    iget-object v4, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->iconView:Landroid/widget/ImageView;

    .line 301
    .line 302
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 303
    .line 304
    .line 305
    :cond_0
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_2

    .line 310
    .line 311
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-nez v0, :cond_2

    .line 320
    .line 321
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPreviewPaths()Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-eqz v1, :cond_1

    .line 334
    .line 335
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, Ljava/lang/String;

    .line 340
    .line 341
    new-instance v4, Ljava/io/File;

    .line 342
    .line 343
    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 347
    .line 348
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    const v6, 0x24070461

    .line 357
    .line 358
    .line 359
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    float-to-int v5, v5

    .line 364
    const/4 v6, -0x1

    .line 365
    invoke-direct {v1, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    const v6, 0x24070460

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    float-to-int v5, v5

    .line 384
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 385
    .line 386
    .line 387
    new-instance v5, Landroid/widget/ImageView;

    .line 388
    .line 389
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    invoke-direct {v5, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 394
    .line 395
    .line 396
    const v6, 0x240800cb

    .line 397
    .line 398
    .line 399
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 400
    .line 401
    .line 402
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 403
    .line 404
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    invoke-virtual {v6, v4}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    const v7, 0x240800b6

    .line 416
    .line 417
    .line 418
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 423
    .line 424
    const v7, 0x240800b8

    .line 425
    .line 426
    .line 427
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 432
    .line 433
    new-instance v7, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 434
    .line 435
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 436
    .line 437
    .line 438
    move-result-wide v8

    .line 439
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    invoke-direct {v7, v8}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 451
    .line 452
    invoke-virtual {v6, v3}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 457
    .line 458
    invoke-virtual {v6}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 459
    .line 460
    .line 461
    move-result-object v6

    .line 462
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 463
    .line 464
    invoke-virtual {v6, v5}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 465
    .line 466
    .line 467
    new-instance v6, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 468
    .line 469
    invoke-direct {v6, p0, p1, v4, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 473
    .line 474
    .line 475
    iget-object v4, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->previewLayout:Landroid/widget/LinearLayout;

    .line 476
    .line 477
    invoke-virtual {v4, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 478
    .line 479
    .line 480
    goto/16 :goto_0

    .line 481
    .line 482
    :cond_1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->previewLayout:Landroid/widget/LinearLayout;

    .line 483
    .line 484
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :cond_2
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->previewLayout:Landroid/widget/LinearLayout;

    .line 489
    .line 490
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 491
    .line 492
    .line 493
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
    .locals 3

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
    const/16 v1, 0x2e9

    .line 11
    .line 12
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 20
    .line 21
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲世兰()V

    .line 35
    .line 36
    .line 37
    const-string v0, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 38
    .line 39
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 44
    .line 45
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 50
    .line 51
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲兰世([Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 63
    .line 64
    const/4 v1, 0x6

    .line 65
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲兰楪世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;

    .line 69
    .line 70
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x1

    .line 74
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

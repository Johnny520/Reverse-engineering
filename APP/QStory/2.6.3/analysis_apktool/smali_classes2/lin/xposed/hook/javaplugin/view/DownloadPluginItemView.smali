.class public Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;
.super Llin/xposed/hook/javaplugin/view/PluginItemView;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final downloadCountTextView:Landroid/widget/TextView;

.field private final downloadImage:Landroid/widget/ImageView;

.field private final uploadTimeTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/PluginItemView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x2409028d

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/widget/ImageView;

    .line 12
    .line 13
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->downloadImage:Landroid/widget/ImageView;

    .line 14
    .line 15
    const p1, 0x2409028c

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->downloadCountTextView:Landroid/widget/TextView;

    .line 25
    .line 26
    const p1, 0x2409029a

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/widget/TextView;

    .line 34
    .line 35
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->uploadTimeTextView:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->hideLocalPluginView()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->showOnlinePluginView()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private hideLocalPluginView()V
    .locals 2

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->progressBar:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->autoLoadCheckbox:Landroid/widget/CheckBox;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginSwitch:Landroid/widget/Switch;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static synthetic lambda$setDownloadClick$0(J)V
    .locals 5

    .line 1
    new-instance v0, Llin/xposed/hook/javaplugin/online/OnlinePluginTool;

    .line 2
    .line 3
    invoke-direct {v0}, Llin/xposed/hook/javaplugin/online/OnlinePluginTool;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/File;

    .line 7
    .line 8
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 9
    .line 10
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v2}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v4, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 24
    .line 25
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v4, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 36
    .line 37
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0, p1, v1}, Llin/xposed/hook/javaplugin/online/OnlinePluginTool;->downloadScript(JLjava/io/File;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 63
    .line 64
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p0, p1}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲兰世楪(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private static lambda$setDownloadClick$1(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;)V
    .locals 4

    .line 1
    const/16 v0, 0x2e5

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x2e6

    .line 13
    .line 14
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0x8

    .line 25
    .line 26
    if-ne v2, v3, :cond_0

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 37
    .line 38
    iget-object p0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/ProgressBar;

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    const/16 p0, 0x2e7

    .line 44
    .line 45
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method private lambda$setDownloadClick$2(JLandroid/view/View;)V
    .locals 7

    .line 1
    new-instance p3, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {p3, p0}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/16 p0, 0x2e3

    .line 11
    .line 12
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, p3, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const/16 v0, 0x2e4

    .line 27
    .line 28
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget-object v0, p3, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/16 v2, 0x8

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    if-ne v1, v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->show()V

    .line 60
    .line 61
    .line 62
    new-instance p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 63
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世苏兰哲;

    .line 68
    .line 69
    invoke-direct {v0, p1, p2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    const/16 p2, 0x9

    .line 75
    .line 76
    invoke-direct {p1, p0, p2, v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 80
    .line 81
    new-instance p1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;

    .line 82
    .line 83
    invoke-direct {p1, p3, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;I)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;

    .line 87
    .line 88
    sget-object p1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 89
    .line 90
    const-class p2, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    check-cast p3, Ljava/util/concurrent/ExecutorService;

    .line 97
    .line 98
    if-nez p3, :cond_1

    .line 99
    .line 100
    new-instance v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;

    .line 101
    .line 102
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 103
    .line 104
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 105
    .line 106
    .line 107
    const-wide/16 v3, 0x3c

    .line 108
    .line 109
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    const v2, 0x7fffffff

    .line 113
    .line 114
    .line 115
    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-object p3, v0

    .line 122
    :cond_1
    iget-object p0, p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 123
    .line 124
    invoke-interface {p3, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method private setDownloadCountText(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->downloadCountTextView:Landroid/widget/TextView;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x2e2

    .line 9
    .line 10
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private setUploadTimeText(Ljava/util/Date;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const/16 v1, 0x2e0

    .line 4
    .line 5
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->uploadTimeTextView:Landroid/widget/TextView;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x2e1

    .line 20
    .line 21
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private showOnlinePluginView()V
    .locals 2

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->downloadImage:Landroid/widget/ImageView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->downloadCountTextView:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->uploadTimeTextView:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic 飘花落叶言子楪兰世哲苏(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-static {p0}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->lambda$setDownloadClick$1(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪兰世苏哲(J)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->lambda$setDownloadClick$0(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪兰苏世哲(Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;JLandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->lambda$setDownloadClick$2(JLandroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bindPluginData(Llin/xposed/hook/javaplugin/online/bean/PluginVO;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->getPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->getCloudId()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual {p0, v1, v2}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->setDownloadClick(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginNameText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 27
    .line 28
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginAuthor()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p0, v1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setAuthorText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v2, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 55
    .line 56
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginDesc()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p0, v1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setDescText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v2, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 83
    .line 84
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginVersion()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {p0, v1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginVersionText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v2, "\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 111
    .line 112
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginIdText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->getDownloadCount()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->setDownloadCountText(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->getCreateTime()Ljava/util/Date;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->setUploadTimeText(Ljava/util/Date;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public setDownloadClick(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->downloadImage:Landroid/widget/ImageView;

    .line 2
    .line 3
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;J)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

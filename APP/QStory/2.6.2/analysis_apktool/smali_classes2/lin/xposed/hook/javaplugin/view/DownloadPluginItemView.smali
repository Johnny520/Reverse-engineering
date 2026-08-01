.class public Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;
.super Llin/xposed/hook/javaplugin/view/PluginItemView;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    .locals 6

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
    const-wide v2, -0x36a54efb051405a7L    # -2.3809597777338072E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-wide v4, -0x36a54ee2051405a7L    # -2.3809938059704993E45

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-wide v4, -0x36a54eea051405a7L    # -2.380982916934758E45

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0, p1, v1}, Llin/xposed/hook/javaplugin/online/OnlinePluginTool;->downloadScript(JLjava/io/File;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-wide v0, -0x36a53cea051405a7L    # -2.3872550015218446E45

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method private static lambda$setDownloadClick$1(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;)V
    .locals 4

    .line 1
    const-wide v0, -0x36a54f03051405a7L    # -2.3809488886980658E45

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
    iget-object v1, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    const-wide v0, -0x36a54f08051405a7L    # -2.3809420830507274E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v3, 0x8

    .line 31
    .line 32
    if-ne v2, v3, :cond_0

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 43
    .line 44
    iget-object p0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/ProgressBar;

    .line 45
    .line 46
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    const-wide v0, -0x36a54efd051405a7L    # -2.380957055474872E45

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
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
    const-wide v0, -0x36a54f2e051405a7L    # -2.3808903601309554E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object v0, p3, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-wide v0, -0x36a54f11051405a7L    # -2.3809298328855182E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    iget-object v0, p3, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    if-ne v1, v2, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->show()V

    .line 66
    .line 67
    .line 68
    new-instance p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 69
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世苏兰哲;

    .line 74
    .line 75
    invoke-direct {v0, p1, p2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 79
    .line 80
    const/16 p2, 0x9

    .line 81
    .line 82
    invoke-direct {p1, p0, p2, v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 86
    .line 87
    new-instance p1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;

    .line 88
    .line 89
    invoke-direct {p1, p3, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;I)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;

    .line 93
    .line 94
    sget-object p1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 95
    .line 96
    const-class p2, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    check-cast p3, Ljava/util/concurrent/ExecutorService;

    .line 103
    .line 104
    if-nez p3, :cond_1

    .line 105
    .line 106
    new-instance v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;

    .line 107
    .line 108
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 109
    .line 110
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 111
    .line 112
    .line 113
    const-wide/16 v3, 0x3c

    .line 114
    .line 115
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    const v2, 0x7fffffff

    .line 119
    .line 120
    .line 121
    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-object p3, v0

    .line 128
    :cond_1
    iget-object p0, p0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 129
    .line 130
    invoke-interface {p3, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method private setDownloadCountText(I)V
    .locals 3

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
    const-wide v1, -0x36a54f20051405a7L    # -2.380909415943503E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private setUploadTimeText(Ljava/util/Date;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-wide v1, -0x36a54f4e051405a7L    # -2.3808468039879895E45

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
    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->uploadTimeTextView:Landroid/widget/TextView;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-wide v2, -0x36a54f3a051405a7L    # -2.3808740265773432E45

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
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
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
    .locals 4

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
    const-wide v2, -0x36a54f5e051405a7L    # -2.3808250259165066E45

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginAuthor()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p0, v1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setAuthorText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-wide v2, -0x36a54f5a051405a7L    # -2.3808304704343773E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginDesc()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p0, v1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setDescText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-wide v2, -0x36a54f46051405a7L    # -2.380857693023731E45

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginVersion()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {p0, v1}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginVersionText(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-wide v2, -0x36a54f42051405a7L    # -2.3808631375416017E45

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginIdText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->getDownloadCount()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->setDownloadCountText(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->getCreateTime()Ljava/util/Date;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->setUploadTimeText(Ljava/util/Date;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
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

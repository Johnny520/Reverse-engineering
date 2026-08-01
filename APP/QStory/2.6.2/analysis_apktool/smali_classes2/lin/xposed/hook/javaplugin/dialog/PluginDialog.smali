.class public Llin/xposed/hook/javaplugin/dialog/PluginDialog;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llin/xposed/hook/javaplugin/dialog/PluginDialog$PluginLoadCallback;
    }
.end annotation


# instance fields
.field private currentPluginList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llin/xposed/hook/javaplugin/bean/PluginInfo;",
            ">;"
        }
    .end annotation
.end field

.field private currentSortType:Ljava/lang/String;

.field private final dialog:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

.field private loadingView:Landroid/widget/ProgressBar;

.field private final pluginDir:Ljava/lang/String;

.field private pluginListContainer:Landroid/widget/LinearLayout;

.field private rootView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰()L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->dialog:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 9
    .line 10
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-wide v1, -0x36a5455a051405a7L    # -2.3843149618716477E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->pluginDir:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->currentPluginList:Ljava/util/List;

    .line 35
    .line 36
    const-wide v0, -0x36a545bd051405a7L    # -2.384180210054347E45

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->currentSortType:Ljava/lang/String;

    .line 46
    .line 47
    new-instance v0, Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;

    .line 48
    .line 49
    const v1, 0x240c004a

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p0, v1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog$1;-><init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;I)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 56
    .line 57
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰楪苏()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private displayPlugins(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llin/xposed/hook/javaplugin/bean/PluginInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->pluginListContainer:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 21
    .line 22
    new-instance v1, Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 23
    .line 24
    iget-object v2, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-direct {v1, v2}, Llin/xposed/hook/javaplugin/view/PluginItemView;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->setPluginDialog(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->bindPluginInfoData(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->pluginListContainer:Landroid/widget/LinearLayout;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method private filterPlugins(Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->currentPluginList:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 36
    .line 37
    invoke-virtual {v2}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginVersion()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginAuthor()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_1

    .line 78
    .line 79
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->displayPlugins(Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    :goto_1
    iget-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->currentPluginList:Ljava/util/List;

    .line 88
    .line 89
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->displayPlugins(Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method private initViews()V
    .locals 5

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 2
    .line 3
    const v1, 0x2409009f

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏兰哲;-><init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 22
    .line 23
    const v1, 0x24090296

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/widget/TextView;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-wide v3, -0x36a54543051405a7L    # -2.3843462678494044E45

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v3, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->pluginDir:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏兰哲;

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    invoke-direct {v1, p0, v3}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏兰哲;-><init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 71
    .line 72
    const v1, 0x24090106

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Landroid/widget/Button;

    .line 80
    .line 81
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏兰哲;

    .line 82
    .line 83
    const/4 v3, 0x2

    .line 84
    invoke-direct {v1, p0, v3}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏兰哲;-><init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 91
    .line 92
    const v1, 0x240902d7

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroid/widget/Button;

    .line 100
    .line 101
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 102
    .line 103
    invoke-direct {v1, v2}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 110
    .line 111
    const v1, 0x24090279

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Landroid/widget/ProgressBar;

    .line 119
    .line 120
    iput-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->loadingView:Landroid/widget/ProgressBar;

    .line 121
    .line 122
    return-void
.end method

.method private synthetic lambda$initViews$0(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->dialog:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic lambda$initViews$1(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->pluginDir:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1, p0}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroid/content/Context;Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    const-wide p0, -0x36a544b7051405a7L    # -2.38453682597488E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private synthetic lambda$initViews$2(Landroid/view/View;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a544ca051405a7L    # -2.384510964514994E45

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
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->dialog:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 14
    .line 15
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪()V

    .line 16
    .line 17
    .line 18
    new-instance p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->show()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private lambda$initViews$3(Landroid/view/View;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;

    .line 2
    .line 3
    invoke-direct {v0}, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;->createDemoPlugin(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, p1, v2}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p0

    .line 33
    const-wide v0, -0x36a544d2051405a7L    # -2.3845000754792527E45

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-wide v0, -0x36a544df051405a7L    # -2.3844823807961728E45

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-static {p1, v0, p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private synthetic lambda$initViews$4(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, p1, v2}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static lambda$initViews$5(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x36a5115f051405a7L    # -2.4024275116981154E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    const-wide v0, -0x36a54526051405a7L    # -2.3843857406039673E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private static synthetic lambda$setupPluginList$6(Landroid/view/View;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a54532051405a7L    # -2.384369407050355E45

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

.method private static synthetic lambda$sortPlugins$7(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_1
    if-nez p1, :cond_2

    .line 12
    .line 13
    const/4 p0, -0x1

    .line 14
    return p0

    .line 15
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method private loadPlugins()V
    .locals 5

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->loadingView:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->scanAllJavaPluginInfo()[Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->currentPluginList:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 14
    .line 15
    .line 16
    array-length v2, v0

    .line 17
    :goto_0
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    aget-object v3, v0, v1

    .line 20
    .line 21
    iget-object v4, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->currentPluginList:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->currentPluginList:Ljava/util/List;

    .line 30
    .line 31
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->displayPlugins(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->loadingView:Landroid/widget/ProgressBar;

    .line 35
    .line 36
    const/16 v0, 0x8

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private scanAllJavaPluginInfo()[Llin/xposed/hook/javaplugin/bean/PluginInfo;
    .locals 5

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->scanScriptDirectory()[Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-array p0, v1, [Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    array-length v2, p0

    .line 23
    move v3, v1

    .line 24
    :goto_0
    if-ge v3, v2, :cond_2

    .line 25
    .line 26
    aget-object v4, p0, v3

    .line 27
    .line 28
    invoke-static {v4}, Llin/xposed/hook/javaplugin/controller/PluginManager;->newPluginInfo(Ljava/io/File;)Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    new-array p0, v1, [Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, [Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 48
    .line 49
    return-object p0
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

.method private setupPluginList()V
    .locals 5

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 2
    .line 3
    const v1, 0x24090093

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/FrameLayout;

    .line 11
    .line 12
    iget-object v1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v2, 0x240c006b

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const v2, 0x240902c5

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    iput-object v2, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->pluginListContainer:Landroid/widget/LinearLayout;

    .line 40
    .line 41
    const v2, 0x24090151

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Landroid/widget/EditText;

    .line 49
    .line 50
    const v3, 0x240903a2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Landroid/widget/TextView;

    .line 58
    .line 59
    new-instance v4, Llin/xposed/hook/javaplugin/dialog/PluginDialog$2;

    .line 60
    .line 61
    invoke-direct {v4, p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog$2;-><init>(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    invoke-direct {p0, v2}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method private sortPlugins(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->currentPluginList:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 9
    .line 10
    const/16 v1, 0xb

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    invoke-direct {v1, v2}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->displayPlugins(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->lambda$initViews$1(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世兰苏哲(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->lambda$initViews$5(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->lambda$initViews$2(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->lambda$initViews$0(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->lambda$setupPluginList$6(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->lambda$initViews$3(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪哲世苏兰(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->setupPluginList()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->lambda$sortPlugins$7(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪苏世哲兰(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->lambda$initViews$4(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪苏兰世哲(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->initViews()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪苏兰哲世(Llin/xposed/hook/javaplugin/dialog/PluginDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->loadPlugins()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪苏哲世兰(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->rootView:Landroid/view/View;

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪苏哲兰世(Llin/xposed/hook/javaplugin/dialog/PluginDialog;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->filterPlugins(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public removePluginView(Llin/xposed/hook/javaplugin/view/PluginItemView;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->pluginListContainer:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public show()V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->dialog:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public switchToAnOnlineScript()V
    .locals 0

    .line 1
    return-void
.end method

.method public switchToLocalScript()V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->loadPlugins()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

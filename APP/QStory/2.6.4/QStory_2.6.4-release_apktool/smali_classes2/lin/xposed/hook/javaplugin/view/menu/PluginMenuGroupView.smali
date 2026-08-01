.class public Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

.field private final pluginNameTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Llin/xposed/hook/javaplugin/controller/PluginLoader;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const v1, 0x240c00e8

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 19
    .line 20
    const p1, 0x24090294

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginNameTextView:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {p2}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 43
    .line 44
    invoke-direct {v2, p0, v1, p2, v0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->initView()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private initView()V
    .locals 10

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    iget-object v1, v0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v0, v0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->temporaryItemMap:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const v3, 0x24090292

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    const v6, 0x240c00e6

    .line 43
    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-virtual {v7, v6, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Landroid/widget/LinearLayout;

    .line 72
    .line 73
    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Landroid/widget/Button;

    .line 78
    .line 79
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    new-instance v6, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 83
    .line 84
    invoke-direct {v6, p0, v2, v4}, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ljava/util/Map$Entry;

    .line 113
    .line 114
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2, v6, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Landroid/widget/LinearLayout;

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, Landroid/widget/Button;

    .line 139
    .line 140
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    new-instance v8, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 144
    .line 145
    const/4 v9, 0x1

    .line 146
    invoke-direct {v8, p0, v1, v9}, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    return-void
.end method

.method private invokeInPluginMenuCallback(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/PluginCallback;->onMenuCallback(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic lambda$initView$2(Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginLoader:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 2
    .line 3
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/PluginCallback;->onMenuTemporaryCallback(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic lambda$initView$3(Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->invokeInPluginMenuCallback(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$new$0(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->loadPlugin()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    :goto_0
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginNameTextView:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_1

    .line 12
    :catch_0
    move-exception v0

    .line 13
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x2ed

    .line 19
    .line 20
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :goto_1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginNameTextView:Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method private synthetic lambda$new$1(Ljava/lang/String;Llin/xposed/hook/javaplugin/controller/PluginLoader;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p3, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginNameTextView:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x2eb

    .line 8
    .line 9
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->stopPlugin()V

    .line 24
    .line 25
    .line 26
    iget-object p3, p0, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->pluginNameTextView:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/16 v1, 0x2ec

    .line 33
    .line 34
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    new-instance p3, Ljava/lang/Thread;

    .line 49
    .line 50
    new-instance v0, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    invoke-direct {v0, p0, p2, p1, v1}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Ljava/lang/String;Llin/xposed/hook/javaplugin/controller/PluginLoader;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->lambda$new$1(Ljava/lang/String;Llin/xposed/hook/javaplugin/controller/PluginLoader;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->lambda$initView$2(Ljava/lang/String;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->lambda$new$0(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/menu/PluginMenuGroupView;->lambda$initView$3(Ljava/lang/String;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

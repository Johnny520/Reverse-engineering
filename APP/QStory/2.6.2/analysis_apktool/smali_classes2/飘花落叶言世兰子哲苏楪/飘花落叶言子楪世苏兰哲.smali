.class public L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;
.super Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子苏哲世兰楪:Ljava/util/ArrayList;

.field public static 飘花落叶言子苏哲世楪兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;


# instance fields
.field public 飘花落叶言子苏哲楪兰世:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪哲兰世苏(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sput-object p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世楪兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪哲兰苏世(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    const p3, 0x240c006c

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x240901a8

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    iput-object p2, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲楪兰世:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    new-instance p2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;

    .line 21
    .line 22
    invoke-direct {p2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object p3, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世兰楪:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-nez p3, :cond_2

    .line 28
    .line 29
    new-instance p3, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object p3, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世兰楪:Ljava/util/ArrayList;

    .line 35
    .line 36
    sget-object p3, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->rootContainer:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v1, v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    check-cast v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 57
    .line 58
    sget-object v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世兰楪:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    sget-object v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世兰楪:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v0}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    sget-object v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世兰楪:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    sget-object p3, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;->OTHER_VIEW_ITEM_INFO_LIST:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Class;

    .line 96
    .line 97
    :try_start_0
    sget-object v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世兰楪:Ljava/util/ArrayList;

    .line 98
    .line 99
    const-class v2, Landroid/content/Context;

    .line 100
    .line 101
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Landroidx/fragment/app/FragmentActivity;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :catch_0
    move-exception v0

    .line 126
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Exception;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    sget-object p3, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世兰楪:Ljava/util/ArrayList;

    .line 131
    .line 132
    const-wide v0, -0x36a57c15051405a7L    # -2.3652441768999306E45

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {p2, p3}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;Ljava/util/List;)V

    .line 144
    .line 145
    .line 146
    sget-object v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 152
    .line 153
    .line 154
    iget-object p3, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲楪兰世:Landroidx/recyclerview/widget/RecyclerView;

    .line 155
    .line 156
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 157
    .line 158
    .line 159
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 160
    .line 161
    const/4 p3, 0x1

    .line 162
    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲兰苏(I)V

    .line 166
    .line 167
    .line 168
    iget-object p3, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲楪兰世:Landroidx/recyclerview/widget/RecyclerView;

    .line 169
    .line 170
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 171
    .line 172
    .line 173
    new-instance p2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 174
    .line 175
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    iget-object p3, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲楪兰世:Landroidx/recyclerview/widget/RecyclerView;

    .line 179
    .line 180
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Landroidx/fragment/app/FragmentActivity;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    check-cast p2, Llin/xposed/hook/view/main/MainSettingActivity;

    .line 188
    .line 189
    iget-object p2, p2, Llin/xposed/hook/view/main/MainSettingActivity;->leftIcon:Landroid/widget/ImageView;

    .line 190
    .line 191
    new-instance p3, Landroidx/appcompat/app/飘花落叶言子楪世哲兰苏;

    .line 192
    .line 193
    const/4 v0, 0x3

    .line 194
    invoke-direct {p3, p0, v0}, Landroidx/appcompat/app/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 198
    .line 199
    .line 200
    return-object p1
.end method

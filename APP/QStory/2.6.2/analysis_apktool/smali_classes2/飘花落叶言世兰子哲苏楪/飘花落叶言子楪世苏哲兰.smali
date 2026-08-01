.class public L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;
.super Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子苏哲世楪兰:Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;


# instance fields
.field public 飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;-><init>()V

    return-void
.end method

.method public constructor <init>(Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;-><init>()V

    .line 2
    .line 3
    .line 4
    sput-object p1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰:Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰世苏哲()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲苏兰()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Llin/xposed/hook/view/main/MainSettingActivity;

    .line 6
    .line 7
    const v1, 0x2412001f

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleCenterText(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰楪哲苏:Z

    .line 19
    .line 20
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
    new-instance p3, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;

    .line 19
    .line 20
    invoke-direct {p3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Landroid/os/Bundle;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const-wide v1, -0x36a5491e051405a7L    # -2.3830028330648006E45

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
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 53
    .line 54
    sget-object v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰:Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 55
    .line 56
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->groupWrapperList:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 73
    .line 74
    iget-object v2, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    iget-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 90
    .line 91
    sget-object v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰:Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 92
    .line 93
    iget-object v1, v1, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->uiInfoList:Ljava/util/List;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 96
    .line 97
    .line 98
    :goto_1
    iget-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 99
    .line 100
    const-wide v1, -0x36a57c15051405a7L    # -2.3652441768999306E45

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {p3, v0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    sget-object v1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 120
    .line 121
    .line 122
    :cond_2
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 123
    .line 124
    .line 125
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 126
    .line 127
    const/4 v0, 0x1

    .line 128
    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲兰苏(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 135
    .line 136
    .line 137
    new-instance p3, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 138
    .line 139
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Landroidx/fragment/app/FragmentActivity;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, Llin/xposed/hook/view/main/MainSettingActivity;

    .line 150
    .line 151
    iget-object p2, p2, Llin/xposed/hook/view/main/MainSettingActivity;->leftIcon:Landroid/widget/ImageView;

    .line 152
    .line 153
    new-instance p3, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 154
    .line 155
    const/16 v0, 0xb

    .line 156
    .line 157
    invoke-direct {p3, p0, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    .line 162
    .line 163
    return-object p1
.end method

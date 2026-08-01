.class public L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;
.super Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    sput-object p1, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰:Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

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
    new-instance p3, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲世兰;

    .line 19
    .line 20
    invoke-direct {p3}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Landroid/os/Bundle;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const-string v1, "\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5\u545c"

    .line 28
    .line 29
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 50
    .line 51
    sget-object v0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰:Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 52
    .line 53
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->groupWrapperList:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 70
    .line 71
    iget-object v2, p0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    iget-object v0, p0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 87
    .line 88
    sget-object v1, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰:Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 89
    .line 90
    iget-object v1, v1, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->uiInfoList:Ljava/util/List;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v0, p0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪兰世:Ljava/util/ArrayList;

    .line 96
    .line 97
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 98
    .line 99
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {p3, v0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    sget-object v1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 114
    .line 115
    .line 116
    :cond_2
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 117
    .line 118
    .line 119
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲兰苏(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 129
    .line 130
    .line 131
    new-instance p3, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪世苏哲兰;

    .line 132
    .line 133
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Landroidx/fragment/app/FragmentActivity;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, Llin/xposed/hook/view/main/MainSettingActivity;

    .line 144
    .line 145
    iget-object p2, p2, Llin/xposed/hook/view/main/MainSettingActivity;->leftIcon:Landroid/widget/ImageView;

    .line 146
    .line 147
    new-instance p3, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 148
    .line 149
    const/16 v0, 0xa

    .line 150
    .line 151
    invoke-direct {p3, p0, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    .line 156
    .line 157
    return-object p1
.end method

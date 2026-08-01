.class final synthetic Ltop/suzhelan/qstory/ui/activity/SettingActivityKt$SettingRoute$1$2$1$5$3$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 9

    .line 1
    const-wide v0, -0x36a40fcc051405a7L    # -2.4921790276677145E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v6

    .line 10
    const-wide v0, -0x36a40fbd051405a7L    # -2.4921994446097297E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v3, 0x2

    .line 21
    const-class v5, L飘花落叶言苏哲楪兰子世/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    move-object v2, p0

    .line 24
    move-object v4, p1

    .line 25
    invoke-direct/range {v2 .. v8}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 181
    check-cast p1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/ui/activity/SettingActivityKt$SettingRoute$1$2$1$5$3$1;->invoke(Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;Z)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;Z)V
    .locals 10

    .line 1
    const-wide v0, -0x36a5708a051405a7L    # -2.369266314476936E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, L飘花落叶言苏哲楪兰子世/飘花落叶言子楪苏世兰哲;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-wide v0, -0x36a44ff6051405a7L    # -2.469821115031541E45

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;->item:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 28
    .line 29
    instance-of v0, p1, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    check-cast p1, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p1, v1

    .line 38
    :goto_0
    if-nez p1, :cond_1

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    new-instance v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    invoke-direct {v0}, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 45
    .line 46
    .line 47
    const-wide v2, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iput-object v2, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 57
    .line 58
    const-wide v2, -0x36a58b7b051405a7L    # -2.3598786045383213E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iput-object v4, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iput-object v4, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iput-object v2, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 81
    .line 82
    new-instance v2, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 83
    .line 84
    invoke-direct {v2}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 85
    .line 86
    .line 87
    const-wide v3, -0x36a58b71051405a7L    # -2.359892215832998E45

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-class v4, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 97
    .line 98
    invoke-virtual {v2, v4, v3}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 103
    .line 104
    if-nez v2, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    move-object v0, v2

    .line 108
    :goto_1
    instance-of v2, p1, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    move-object v1, p1

    .line 113
    check-cast v1, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 114
    .line 115
    :cond_3
    if-eqz v1, :cond_4

    .line 116
    .line 117
    invoke-virtual {v1, v0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_4

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p1, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-static {p1}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;)V

    .line 131
    .line 132
    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    :try_start_0
    invoke-virtual {p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->startLoadHook()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catch_0
    move-exception v0

    .line 140
    move-object p2, v0

    .line 141
    invoke-virtual {p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1, p2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    :cond_5
    :goto_2
    iget-object p0, p0, L飘花落叶言苏哲楪兰子世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 149
    .line 150
    :cond_6
    invoke-virtual {p0}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    move-object v0, p1

    .line 155
    check-cast v0, L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世兰哲苏;

    .line 156
    .line 157
    iget p2, v0, L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:I

    .line 158
    .line 159
    add-int/lit8 v3, p2, 0x1

    .line 160
    .line 161
    const/4 v8, 0x0

    .line 162
    const/16 v9, 0x1f7

    .line 163
    .line 164
    const/4 v1, 0x0

    .line 165
    const/4 v2, 0x0

    .line 166
    const/4 v4, 0x0

    .line 167
    const/4 v5, 0x0

    .line 168
    const/4 v6, 0x0

    .line 169
    const/4 v7, 0x0

    .line 170
    invoke-static/range {v0 .. v9}, L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世兰哲苏;Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;IIZLtop/suzhelan/qstory/ui/viewmodel/SettingPageTransitionDirection;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世兰哲苏;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_6

    .line 179
    .line 180
    :goto_3
    return-void
.end method

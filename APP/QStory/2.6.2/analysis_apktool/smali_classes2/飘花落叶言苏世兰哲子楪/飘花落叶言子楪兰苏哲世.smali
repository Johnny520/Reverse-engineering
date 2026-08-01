.class public final synthetic L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

.field public final synthetic 飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

.field public final synthetic 飘花落叶言子楪兰苏哲世:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/util/List;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;Ljava/util/List;Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 11
    .line 12
    iput-object p5, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

    .line 13
    .line 14
    iput-object p6, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 15
    .line 16
    iput-object p7, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-object p1, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;

    .line 20
    .line 21
    iget-object v2, v2, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 22
    .line 23
    iget-boolean v2, v2, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->飘花落叶言子楪兰世哲苏:Z

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v1

    .line 29
    :goto_0
    check-cast v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;

    .line 30
    .line 31
    iget-object p1, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    :cond_2
    move-object v0, p1

    .line 40
    :cond_3
    iget-object v2, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_5

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v4, v3

    .line 57
    check-cast v4, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;

    .line 58
    .line 59
    iget-object v4, v4, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 60
    .line 61
    iget-boolean v4, v4, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->飘花落叶言子楪兰世哲苏:Z

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    move-object v1, v3

    .line 66
    :cond_5
    check-cast v1, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;

    .line 67
    .line 68
    iget-object v2, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 69
    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    iget-object v1, v1, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 73
    .line 74
    if-nez v1, :cond_7

    .line 75
    .line 76
    :cond_6
    move-object v1, v2

    .line 77
    :cond_7
    iget-object v3, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

    .line 78
    .line 79
    iget-boolean v3, v3, Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;->飘花落叶言子世楪苏兰哲:Z

    .line 80
    .line 81
    const-wide v4, -0x36a5fdf7051405a7L    # -2.3199866220994458E45

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    const/4 v6, 0x1

    .line 87
    if-eq v0, p1, :cond_8

    .line 88
    .line 89
    sget-object p1, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏兰哲世;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object p1, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 101
    .line 102
    const-wide v7, -0x36a5fe03051405a7L    # -2.3199702885458336E45

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v0}, Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;->getKey()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v7, v0}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    move p1, v6

    .line 122
    goto :goto_1

    .line 123
    :cond_8
    const/4 p1, 0x0

    .line 124
    :goto_1
    if-eq v1, v2, :cond_9

    .line 125
    .line 126
    sget-object p1, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏兰哲世;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    sget-object p1, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 138
    .line 139
    const-wide v4, -0x36a5fdfc051405a7L    # -2.3199798164521074E45

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v1}, Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;->getKey()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v1}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    move p1, v6

    .line 159
    :cond_9
    sget-object v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏兰哲世;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eq v3, v0, :cond_a

    .line 169
    .line 170
    sget-object p1, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 171
    .line 172
    const-wide v0, -0x36a5fde1051405a7L    # -2.320016566947735E45

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {v0, v1}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_a
    move v6, p1

    .line 193
    :goto_2
    iget-object p1, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 194
    .line 195
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪()V

    .line 196
    .line 197
    .line 198
    if-eqz v6, :cond_b

    .line 199
    .line 200
    iget-object p0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;

    .line 201
    .line 202
    invoke-virtual {p0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;->invoke()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    :cond_b
    return-void
.end method

.class public final synthetic L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

.field public final synthetic 飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

.field public final synthetic 飘花落叶言子楪兰苏哲世:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/util/List;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;Ljava/util/List;Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世苏哲:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 11
    .line 12
    iput-object p5, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

    .line 13
    .line 14
    iput-object p6, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 15
    .line 16
    iput-object p7, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object p1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

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
    check-cast v2, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;

    .line 20
    .line 21
    iget-object v2, v2, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

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
    check-cast v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;

    .line 30
    .line 31
    iget-object p1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    :cond_2
    move-object v0, p1

    .line 40
    :cond_3
    iget-object v2, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:Ljava/util/List;

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
    check-cast v4, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;

    .line 58
    .line 59
    iget-object v4, v4, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

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
    check-cast v1, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;

    .line 67
    .line 68
    iget-object v2, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世苏哲:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 69
    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    iget-object v1, v1, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 73
    .line 74
    if-nez v1, :cond_7

    .line 75
    .line 76
    :cond_6
    move-object v1, v2

    .line 77
    :cond_7
    iget-object v3, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏:Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;

    .line 78
    .line 79
    iget-boolean v3, v3, Ltop/suzhelan/qstory/ui/views/CustomMaterialSwitch;->飘花落叶言子世楪苏兰哲:Z

    .line 80
    .line 81
    const-string v4, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    if-eq v0, p1, :cond_8

    .line 85
    .line 86
    sget-object p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 98
    .line 99
    const/16 v6, 0xa8f

    .line 100
    .line 101
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v0}, Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;->getKey()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v6, v0}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    move p1, v5

    .line 116
    goto :goto_1

    .line 117
    :cond_8
    const/4 p1, 0x0

    .line 118
    :goto_1
    if-eq v1, v2, :cond_9

    .line 119
    .line 120
    sget-object p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    sget-object p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 132
    .line 133
    const/16 v0, 0xa90

    .line 134
    .line 135
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v1}, Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;->getKey()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v1}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    move p1, v5

    .line 150
    :cond_9
    sget-object v0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eq v3, v0, :cond_a

    .line 160
    .line 161
    sget-object p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 162
    .line 163
    const/16 v0, 0xa91

    .line 164
    .line 165
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v1}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_a
    move v5, p1

    .line 181
    :goto_2
    iget-object p1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 182
    .line 183
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪()V

    .line 184
    .line 185
    .line 186
    if-eqz v5, :cond_b

    .line 187
    .line 188
    iget-object p0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世哲苏兰;

    .line 189
    .line 190
    invoke-virtual {p0}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世哲苏兰;->invoke()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    :cond_b
    return-void
.end method

.class public final synthetic Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/content/Context;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;Landroid/content/Context;L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iget-object v0, v0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_a

    .line 14
    .line 15
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    instance-of v5, v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    const/4 v7, 0x6

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x1

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    new-instance v5, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世哲苏;

    .line 30
    .line 31
    check-cast v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    invoke-direct {v5, v4, v2}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    iget v10, v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 37
    .line 38
    if-nez v10, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance v8, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰苏世哲;

    .line 42
    .line 43
    invoke-direct {v8, v4, v2}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    new-instance v10, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 47
    .line 48
    const v11, -0x731428a5

    .line 49
    .line 50
    .line 51
    invoke-direct {v10, v11, v9, v8}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;-><init>(IZLkotlin/飘花落叶言子楪世兰苏哲;)V

    .line 52
    .line 53
    .line 54
    move-object v8, v10

    .line 55
    :goto_1
    new-instance v9, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;

    .line 56
    .line 57
    iget-object v10, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世哲兰;

    .line 58
    .line 59
    invoke-direct {v9, v4, v6, v10}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v5, v8, v9, v7}, L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世兰苏哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;I)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_1
    instance-of v5, v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    if-eqz v5, :cond_8

    .line 70
    .line 71
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v10, 0x1c

    .line 74
    .line 75
    if-lt v5, v10, :cond_9

    .line 76
    .line 77
    check-cast v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世兰哲;

    .line 78
    .line 79
    iget-object v5, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 80
    .line 81
    if-nez v5, :cond_2

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    iget v10, v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 85
    .line 86
    iget-object v4, v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/view/textclassifier/TextClassification;

    .line 87
    .line 88
    if-gez v10, :cond_4

    .line 89
    .line 90
    new-instance v6, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世哲苏;

    .line 91
    .line 92
    invoke-direct {v6, v4, v9}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Landroid/view/textclassifier/TextClassification;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    if-eqz v10, :cond_3

    .line 100
    .line 101
    new-instance v8, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰苏世哲;

    .line 102
    .line 103
    invoke-direct {v8, v10, v9}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    new-instance v10, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 107
    .line 108
    const v11, -0x42f30a7b

    .line 109
    .line 110
    .line 111
    invoke-direct {v10, v11, v9, v8}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;-><init>(IZLkotlin/飘花落叶言子楪世兰苏哲;)V

    .line 112
    .line 113
    .line 114
    move-object v8, v10

    .line 115
    :cond_3
    new-instance v9, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;

    .line 116
    .line 117
    const/4 v10, 0x3

    .line 118
    invoke-direct {v9, v5, v10, v4}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v6, v8, v9, v7}, L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世兰苏哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;I)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    invoke-static {v4}, Landroidx/activity/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Landroid/app/RemoteAction;

    .line 134
    .line 135
    if-nez v10, :cond_5

    .line 136
    .line 137
    move v5, v9

    .line 138
    goto :goto_2

    .line 139
    :cond_5
    move v5, v2

    .line 140
    :goto_2
    new-instance v10, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世哲苏;

    .line 141
    .line 142
    invoke-direct {v10, v4, v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;I)V

    .line 143
    .line 144
    .line 145
    if-nez v5, :cond_6

    .line 146
    .line 147
    invoke-static {v4}, Landroidx/activity/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰哲苏世(Landroid/app/RemoteAction;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_7

    .line 152
    .line 153
    :cond_6
    new-instance v5, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰苏世哲;

    .line 154
    .line 155
    invoke-direct {v5, v4, v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;I)V

    .line 156
    .line 157
    .line 158
    new-instance v8, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 159
    .line 160
    const v11, -0x4b2bf918

    .line 161
    .line 162
    .line 163
    invoke-direct {v8, v11, v9, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;-><init>(IZLkotlin/飘花落叶言子楪世兰苏哲;)V

    .line 164
    .line 165
    .line 166
    :cond_7
    new-instance v5, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲苏兰;

    .line 167
    .line 168
    invoke-direct {v5, v4, v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 169
    .line 170
    .line 171
    invoke-static {p1, v10, v8, v5, v7}, L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世兰苏哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;I)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_8
    instance-of v4, v4, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 176
    .line 177
    if-eqz v4, :cond_9

    .line 178
    .line 179
    iget-object v4, p1, L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 180
    .line 181
    sget-object v5, L飘花落叶言子楪兰世苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 182
    .line 183
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_9
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_a
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 191
    .line 192
    return-object p0
.end method

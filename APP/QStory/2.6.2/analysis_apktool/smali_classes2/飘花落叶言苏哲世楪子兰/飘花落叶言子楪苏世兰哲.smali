.class public final L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;
.super L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final synthetic 飘花落叶言子楪苏兰世哲:I


# instance fields
.field public final synthetic 飘花落叶言子楪苏哲世兰:I

.field public final 飘花落叶言子楪苏哲兰世:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:I

    .line 3
    .line 4
    invoke-direct {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)V
    .locals 0

    .line 15
    iput p2, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:I

    invoke-direct {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;-><init>()V

    iput-object p1, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public 飘花落叶言子世楪苏兰哲(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 18
    .line 19
    iget-object v2, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    iget-object v1, v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰哲苏()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final 飘花落叶言子楪兰哲苏世(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 2

    .line 1
    iget p3, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p3, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const p1, 0x240c0063

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p0}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    const-wide v0, -0x36a538e5051405a7L    # -2.3886556037440912E45

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    const-wide v0, -0x36a57cd4051405a7L    # -2.364984201171603E45

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    new-instance p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 44
    .line 45
    const p3, 0x240c0074

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, p3, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;-><init>(ILandroid/view/ViewGroup;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 52
    .line 53
    new-instance p3, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 54
    .line 55
    const/16 v0, 0x12

    .line 56
    .line 57
    invoke-direct {p3, p1, v0, p0}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_1
    invoke-static {p1}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const p1, 0x240c0067

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, p0}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;)V
    .locals 7

    .line 1
    iget p2, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:I

    .line 2
    .line 3
    const-string v0, "Check failed."

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    check-cast p3, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    const p2, 0x24090244

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Landroid/widget/TextView;

    .line 22
    .line 23
    const v0, 0x2409010d

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/widget/TextView;

    .line 31
    .line 32
    const v1, 0x240900fe

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Landroid/widget/TextView;

    .line 40
    .line 41
    const v2, 0x24090080

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Landroid/widget/ImageView;

    .line 49
    .line 50
    invoke-static {v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {p3}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-instance v5, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v6, "https://q.qlogo.cn/g?b=qq&nk="

    .line 61
    .line 62
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v4, "&s=100"

    .line 69
    .line 70
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p3}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    sget p2, L飘花落叶言苏楪兰哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 92
    .line 93
    invoke-virtual {p3}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 105
    .line 106
    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {p2, v3}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p2, v2}, Ljava/time/ZonedDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p3}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    const/16 v0, 0x20

    .line 144
    .line 145
    if-le p2, v0, :cond_0

    .line 146
    .line 147
    new-instance p2, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;

    .line 148
    .line 149
    invoke-direct {p2, p0, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;Landroid/widget/TextView;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    .line 154
    .line 155
    :cond_0
    iget-object p2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 156
    .line 157
    new-instance v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 158
    .line 159
    const/16 v1, 0x15

    .line 160
    .line 161
    invoke-direct {v0, p0, v1, p3}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    .line 166
    .line 167
    iget-object p2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 168
    .line 169
    new-instance v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲苏兰;

    .line 170
    .line 171
    const/4 v1, 0x3

    .line 172
    invoke-direct {v0, p0, p1, p3, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 176
    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_1
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :goto_0
    return-void

    .line 183
    :pswitch_0
    check-cast p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 184
    .line 185
    check-cast p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 186
    .line 187
    const-wide v0, -0x36a57cd3051405a7L    # -2.3649855623010707E45

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    if-nez p3, :cond_2

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_2
    iget-object p2, p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 199
    .line 200
    const v0, 0x240903a7

    .line 201
    .line 202
    .line 203
    iget-object v1, p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupName:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {p1, v0, v1}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 206
    .line 207
    .line 208
    const v0, 0x240903a8

    .line 209
    .line 210
    .line 211
    iget-object v1, p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {p1, v0, v1}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    new-instance v0, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const-wide v1, -0x36a4168e051405a7L    # -2.4898242736886216E45

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const/16 v1, 0x2f

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-wide v1, -0x36a41665051405a7L    # -2.4898800799967966E45

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    const v0, 0x240901bb

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, v0}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Landroid/widget/ImageView;

    .line 268
    .line 269
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v1, p2}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 282
    .line 283
    .line 284
    const p2, 0x240900d4

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    check-cast p1, Landroid/widget/CheckBox;

    .line 292
    .line 293
    iget-object p0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 296
    .line 297
    iget-object p2, p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 304
    .line 305
    invoke-static {p0, p2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    invoke-virtual {p1, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 310
    .line 311
    .line 312
    :goto_1
    return-void

    .line 313
    :pswitch_1
    check-cast p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 314
    .line 315
    check-cast p3, Ljava/io/File;

    .line 316
    .line 317
    if-eqz p3, :cond_a

    .line 318
    .line 319
    const p2, 0x24090381

    .line 320
    .line 321
    .line 322
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {p1, p2, v0}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 330
    .line 331
    .line 332
    move-result-object p2

    .line 333
    const/4 v0, 0x0

    .line 334
    if-eqz p2, :cond_4

    .line 335
    .line 336
    array-length v1, p2

    .line 337
    move v2, v0

    .line 338
    move v3, v2

    .line 339
    :goto_2
    if-ge v2, v1, :cond_5

    .line 340
    .line 341
    aget-object v4, p2, v2

    .line 342
    .line 343
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-eqz v5, :cond_3

    .line 348
    .line 349
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    const-string v6, "config.json"

    .line 354
    .line 355
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    if-nez v5, :cond_3

    .line 360
    .line 361
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    const-string v5, ".bak"

    .line 369
    .line 370
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-nez v4, :cond_3

    .line 375
    .line 376
    add-int/lit8 v3, v3, 0x1

    .line 377
    .line 378
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 379
    .line 380
    goto :goto_2

    .line 381
    :cond_4
    move v3, v0

    .line 382
    :cond_5
    invoke-virtual {p3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    if-eqz p2, :cond_9

    .line 387
    .line 388
    new-instance v1, Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 391
    .line 392
    .line 393
    array-length v2, p2

    .line 394
    :goto_3
    if-ge v0, v2, :cond_7

    .line 395
    .line 396
    aget-object v4, p2, v0

    .line 397
    .line 398
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    if-eqz v5, :cond_6

    .line 403
    .line 404
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 408
    .line 409
    goto :goto_3

    .line 410
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object p2

    .line 414
    const-wide/16 v0, 0x0

    .line 415
    .line 416
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    if-eqz v2, :cond_8

    .line 421
    .line 422
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    check-cast v2, Ljava/io/File;

    .line 427
    .line 428
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 429
    .line 430
    .line 431
    move-result-wide v4

    .line 432
    add-long/2addr v0, v4

    .line 433
    goto :goto_4

    .line 434
    :cond_8
    long-to-int v0, v0

    .line 435
    :cond_9
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲(I)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p2

    .line 439
    new-instance v0, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    const-string v1, " \u4e2a\u6587\u4ef6 \u00b7 "

    .line 448
    .line 449
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object p2

    .line 459
    const v0, 0x24090380

    .line 460
    .line 461
    .line 462
    invoke-virtual {p1, v0, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 463
    .line 464
    .line 465
    const p2, 0x240903a0

    .line 466
    .line 467
    .line 468
    invoke-virtual {p1, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    check-cast p1, Landroid/widget/TextView;

    .line 473
    .line 474
    new-instance p2, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 475
    .line 476
    const/16 v0, 0x10

    .line 477
    .line 478
    invoke-direct {p2, p0, v0, p3}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 482
    .line 483
    .line 484
    goto :goto_5

    .line 485
    :cond_a
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    :goto_5
    return-void

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

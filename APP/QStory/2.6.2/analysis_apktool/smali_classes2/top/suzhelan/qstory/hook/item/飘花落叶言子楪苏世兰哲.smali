.class public Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;
.super L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    sget p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    const/16 v0, 0x2204

    .line 4
    .line 5
    if-gt p1, v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x7

    .line 12
    const/4 v1, 0x1

    .line 13
    const/16 v2, 0x7ea

    .line 14
    .line 15
    invoke-static {v2, v0, v1}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/time/LocalDate;->isAfter(Ljava/time/chrono/ChronoLocalDate;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    new-instance p1, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    const-wide v0, -0x36a562ac051405a7L    # -2.3740983240872134E45

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-wide v1, -0x36a562ab051405a7L    # -2.374099685216681E45

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {p1, v0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 53
    .line 54
    :cond_0
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲苏兰;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;I)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世;

    .line 61
    .line 62
    const-wide v0, -0x36a59105051405a7L    # -2.3579485229531457E45

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    const-wide v0, -0x36a590c6051405a7L    # -2.3580342741096098E45

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;

    .line 79
    .line 80
    invoke-direct {v0, p0, p1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    const-wide v0, -0x36a50a19051405a7L    # -2.4049619347669426E45

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-wide v0, -0x36a56299051405a7L    # -2.3741241855470994E45

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-wide v1, -0x36a50990051405a7L    # -2.4051484095040152E45

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v3, v2, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 128
    .line 129
    iput-object p1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-virtual {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v3, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 140
    .line 141
    const-class v4, Ljava/util/List;

    .line 142
    .line 143
    iput-object v4, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-virtual {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-object v3, v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 158
    .line 159
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v4, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 162
    .line 163
    invoke-virtual {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-instance v1, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;

    .line 168
    .line 169
    const/4 v3, 0x2

    .line 170
    invoke-direct {v1, p0, v2, p1, v3}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v0, v1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_1
    const-wide p0, -0x36a562a6051405a7L    # -2.3741064908640195E45

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_2
    const-wide p0, -0x36a562bd051405a7L    # -2.3740751848862628E45

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a562de051405a7L    # -2.3740302676138293E45

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
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    const-wide v0, -0x36a52339051405a7L    # -2.3962071500308007E45

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
    const-class v1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    const-wide v2, -0x36a534b0051405a7L    # -2.3901215401807866E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-static {v3, v2, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Long;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    const-wide v4, -0x36a532b1051405a7L    # -2.390817077338773E45

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v5, 0x0

    .line 49
    new-array v5, v5, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {p1, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/16 v4, 0x64

    .line 62
    .line 63
    if-eq p1, v4, :cond_0

    .line 64
    .line 65
    const/4 v4, 0x1

    .line 66
    if-ne p1, v4, :cond_1

    .line 67
    .line 68
    :cond_0
    invoke-static {v0}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :cond_1
    const-wide v4, -0x36a528c8051405a7L    # -2.3942702627982867E45

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {v1, p1, p2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/lang/String;

    .line 86
    .line 87
    const-wide v4, -0x36a56256051405a7L    # -2.3742153812214342E45

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-static {v1, v4, p2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Ljava/lang/String;

    .line 101
    .line 102
    const-wide v5, -0x36a5625d051405a7L    # -2.3742058533151605E45

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 112
    .line 113
    invoke-static {v6, v5, p2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    check-cast v5, Ljava/lang/Integer;

    .line 118
    .line 119
    const-wide v6, -0x36a56240051405a7L    # -2.3742453260697233E45

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    const/4 v7, 0x0

    .line 129
    invoke-static {v7, v6, p2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    const-wide v6, -0x36a56249051405a7L    # -2.374233075904514E45

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-static {v1, v6, p2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    check-cast p2, Ljava/lang/String;

    .line 147
    .line 148
    new-instance v1, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏兰哲;

    .line 149
    .line 150
    invoke-direct {v1}, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    new-instance v6, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;

    .line 157
    .line 158
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    iput-object v7, v6, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 166
    .line 167
    iput-object v4, v6, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 168
    .line 169
    iput-object p1, v6, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    iput v7, v6, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 176
    .line 177
    iput-object v0, v6, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 178
    .line 179
    new-instance v7, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;

    .line 180
    .line 181
    invoke-direct {v7}, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    iput v5, v7, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 189
    .line 190
    iput-object p1, v7, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 191
    .line 192
    iput-object v4, v7, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 193
    .line 194
    iput-object p2, v7, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 195
    .line 196
    iput-object v0, v7, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iput-object p1, v7, L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 203
    .line 204
    new-instance p1, Ljava/lang/Thread;

    .line 205
    .line 206
    new-instance p2, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世兰哲苏;

    .line 207
    .line 208
    invoke-direct {p2, p0, v1, v6, v7}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世兰哲苏;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏兰哲;L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世哲苏兰;L飘花落叶言苏世楪哲兰子/飘花落叶言子楪世苏哲兰;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 p1, 0x1

    .line 8
    if-lt p0, p1, :cond_0

    .line 9
    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

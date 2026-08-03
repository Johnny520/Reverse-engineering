.class public final synthetic Lca/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lca/e0;

.field public final synthetic i:Landroid/app/Activity;

.field public final synthetic j:Lp8/v;


# direct methods
.method public synthetic constructor <init>(Lca/e0;Landroid/app/Activity;Lp8/v;I)V
    .locals 0

    .line 1
    iput p4, p0, Lca/g;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/g;->h:Lca/e0;

    .line 4
    .line 5
    iput-object p2, p0, Lca/g;->i:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p3, p0, Lca/g;->j:Lp8/v;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lca/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lca/m;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v2, p0, Lca/g;->h:Lca/e0;

    .line 15
    .line 16
    iget-object v3, p0, Lca/g;->i:Landroid/app/Activity;

    .line 17
    .line 18
    invoke-direct {v0, v2, v3, p1, v1}, Lca/m;-><init>(Lca/e0;Landroid/app/Activity;Ljava/util/List;I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lca/g;->j:Lp8/v;

    .line 22
    .line 23
    const-string v1, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 24
    .line 25
    invoke-virtual {v2, v3, p1, v1, v0}, Lca/e0;->k(Landroid/app/Activity;Lp8/v;Ljava/lang/String;Lfg/l;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, Lca/m;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iget-object v2, p0, Lca/g;->h:Lca/e0;

    .line 40
    .line 41
    iget-object v3, p0, Lca/g;->i:Landroid/app/Activity;

    .line 42
    .line 43
    invoke-direct {v0, v2, v3, p1, v1}, Lca/m;-><init>(Lca/e0;Landroid/app/Activity;Ljava/util/List;I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lca/g;->j:Lp8/v;

    .line 47
    .line 48
    const-string v1, "\u8f6c\u53d1\u7ed9\u597d\u53cb"

    .line 49
    .line 50
    invoke-virtual {v2, v3, p1, v1, v0}, Lca/e0;->k(Landroid/app/Activity;Lp8/v;Ljava/lang/String;Lfg/l;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const/4 v0, 0x0

    .line 61
    const/4 v1, 0x1

    .line 62
    if-ne p1, v1, :cond_0

    .line 63
    .line 64
    move v6, v1

    .line 65
    goto :goto_1

    .line 66
    :cond_0
    move v6, v0

    .line 67
    :goto_1
    if-ne v6, v1, :cond_1

    .line 68
    .line 69
    move v12, v1

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    move v12, v0

    .line 72
    :goto_2
    if-eqz v12, :cond_2

    .line 73
    .line 74
    const-string p1, "\u9009\u62e9\u5b98\u65b9\u7fa4\u53d1\u597d\u53cb"

    .line 75
    .line 76
    :goto_3
    move-object v10, p1

    .line 77
    goto :goto_4

    .line 78
    :cond_2
    const-string p1, "\u9009\u62e9\u7fa4\u53d1\u5bf9\u8c61"

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :goto_4
    new-instance v2, Lca/k;

    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    iget-object v3, p0, Lca/g;->h:Lca/e0;

    .line 85
    .line 86
    iget-object v4, p0, Lca/g;->i:Landroid/app/Activity;

    .line 87
    .line 88
    iget-object v5, p0, Lca/g;->j:Lp8/v;

    .line 89
    .line 90
    invoke-direct/range {v2 .. v7}, Lca/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 91
    .line 92
    .line 93
    const-string v11, "\u53d1\u9001"

    .line 94
    .line 95
    move-object v9, v2

    .line 96
    move-object v7, v3

    .line 97
    move-object v8, v4

    .line 98
    invoke-virtual/range {v7 .. v12}, Lca/e0;->p(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iget-object v0, p0, Lca/g;->h:Lca/e0;

    .line 109
    .line 110
    iget-object v1, p0, Lca/g;->i:Landroid/app/Activity;

    .line 111
    .line 112
    iget-object v2, p0, Lca/g;->j:Lp8/v;

    .line 113
    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    const/4 v3, 0x1

    .line 117
    if-eq p1, v3, :cond_6

    .line 118
    .line 119
    const/4 v3, 0x2

    .line 120
    if-eq p1, v3, :cond_5

    .line 121
    .line 122
    const/4 v3, 0x3

    .line 123
    if-eq p1, v3, :cond_4

    .line 124
    .line 125
    const/4 v3, 0x4

    .line 126
    if-eq p1, v3, :cond_3

    .line 127
    .line 128
    goto/16 :goto_5

    .line 129
    .line 130
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance p1, Lca/g;

    .line 134
    .line 135
    const/4 v3, 0x3

    .line 136
    invoke-direct {p1, v0, v1, v2, v3}, Lca/g;-><init>(Lca/e0;Landroid/app/Activity;Lp8/v;I)V

    .line 137
    .line 138
    .line 139
    new-instance v2, Lca/l;

    .line 140
    .line 141
    invoke-direct {v2, v0, v1, p1}, Lca/l;-><init>(Lca/e0;Landroid/app/Activity;Lfg/l;)V

    .line 142
    .line 143
    .line 144
    const-string p1, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-virtual {v0, v1, v2, p1, v3}, Lca/e0;->e(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance p1, Lsf/e;

    .line 155
    .line 156
    const-string v3, "\u6a21\u5757\u901a\u9053"

    .line 157
    .line 158
    const-string v4, "\u652f\u6301\u597d\u53cb\u3001\u7fa4\u804a\u3001\u516c\u4f17\u53f7\u548c\u6807\u7b7e"

    .line 159
    .line 160
    invoke-direct {p1, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    new-instance v3, Lsf/e;

    .line 164
    .line 165
    const-string v4, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b"

    .line 166
    .line 167
    const-string v5, "\u4ec5\u9009\u62e9\u597d\u53cb\u5e76\u6309\u539f\u751f\u961f\u5217\u53d1\u9001"

    .line 168
    .line 169
    invoke-direct {v3, v4, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    filled-new-array {p1, v3}, [Lsf/e;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    new-instance v5, Lca/g;

    .line 181
    .line 182
    const/4 p1, 0x1

    .line 183
    invoke-direct {v5, v0, v1, v2, p1}, Lca/g;-><init>(Lca/e0;Landroid/app/Activity;Lp8/v;I)V

    .line 184
    .line 185
    .line 186
    new-instance v6, Lbi/c;

    .line 187
    .line 188
    const/4 p1, 0x7

    .line 189
    invoke-direct {v6, p1}, Lbi/c;-><init>(I)V

    .line 190
    .line 191
    .line 192
    const-string v2, "\u9009\u62e9\u7fa4\u53d1\u901a\u9053"

    .line 193
    .line 194
    const-string v3, ""

    .line 195
    .line 196
    invoke-static/range {v1 .. v6}, Lwb/y2;->R1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;)Lwb/kv;

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_5
    new-instance p1, Lca/o;

    .line 201
    .line 202
    const/4 v3, 0x3

    .line 203
    invoke-direct {p1, v0, v1, v3}, Lca/o;-><init>(Lca/e0;Landroid/app/Activity;I)V

    .line 204
    .line 205
    .line 206
    const-string v3, "\u5206\u4eab\u670b\u53cb\u5708"

    .line 207
    .line 208
    invoke-virtual {v0, v1, v2, v3, p1}, Lca/e0;->k(Landroid/app/Activity;Lp8/v;Ljava/lang/String;Lfg/l;)V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-object p1, v2

    .line 216
    new-instance v2, Lca/g;

    .line 217
    .line 218
    const/4 v3, 0x2

    .line 219
    invoke-direct {v2, v0, v1, p1, v3}, Lca/g;-><init>(Lca/e0;Landroid/app/Activity;Lp8/v;I)V

    .line 220
    .line 221
    .line 222
    const-string v3, "\u9009\u62e9\u8f6c\u53d1\u5bf9\u8c61"

    .line 223
    .line 224
    const-string v4, "\u8f6c\u53d1"

    .line 225
    .line 226
    const/4 v5, 0x0

    .line 227
    invoke-virtual/range {v0 .. v5}, Lca/e0;->p(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_7
    move-object p1, v2

    .line 232
    new-instance v2, Lca/o;

    .line 233
    .line 234
    const/4 v3, 0x2

    .line 235
    invoke-direct {v2, v0, v1, v3}, Lca/o;-><init>(Lca/e0;Landroid/app/Activity;I)V

    .line 236
    .line 237
    .line 238
    const-string v3, "\u8f6c\u53d1\u5230\u670b\u53cb\u5708"

    .line 239
    .line 240
    invoke-virtual {v0, v1, p1, v3, v2}, Lca/e0;->k(Landroid/app/Activity;Lp8/v;Ljava/lang/String;Lfg/l;)V

    .line 241
    .line 242
    .line 243
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 244
    .line 245
    return-object p1

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

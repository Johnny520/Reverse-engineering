.class public final synthetic Lhb/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;Lb/e;Lhb/i0;Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lhb/w;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p4, p0, Lhb/w;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lhb/w;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lhb/w;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput p1, p0, Lhb/w;->h:I

    .line 14
    .line 15
    iput-object p3, p0, Lhb/w;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(ILfg/l;Lqg/t;Li0/g1;Li/c;)V
    .locals 1

    .line 18
    const/4 v0, 0x2

    iput v0, p0, Lhb/w;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lhb/w;->h:I

    iput-object p2, p0, Lhb/w;->i:Ljava/lang/Object;

    iput-object p3, p0, Lhb/w;->j:Ljava/lang/Object;

    iput-object p4, p0, Lhb/w;->k:Ljava/lang/Object;

    iput-object p5, p0, Lhb/w;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>([Lv1/b1;Lp/t;ILv1/p0;[I)V
    .locals 1

    .line 19
    const/4 v0, 0x1

    iput v0, p0, Lhb/w;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/w;->i:Ljava/lang/Object;

    iput-object p2, p0, Lhb/w;->j:Ljava/lang/Object;

    iput p3, p0, Lhb/w;->h:I

    iput-object p4, p0, Lhb/w;->k:Ljava/lang/Object;

    iput-object p5, p0, Lhb/w;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lhb/w;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/w;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/l;

    .line 9
    .line 10
    iget-object v1, p0, Lhb/w;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lqg/t;

    .line 13
    .line 14
    iget-object v2, p0, Lhb/w;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Li0/g1;

    .line 17
    .line 18
    iget-object v3, p0, Lhb/w;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Li/c;

    .line 21
    .line 22
    check-cast p1, Lxb/i;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lxb/i;->b()F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget v5, p0, Lhb/w;->h:I

    .line 36
    .line 37
    add-int/lit8 v5, v5, -0x1

    .line 38
    .line 39
    if-gez v4, :cond_0

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    :cond_0
    if-le v4, v5, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v5, v4

    .line 46
    :goto_0
    invoke-virtual {v2, v5}, Li0/g1;->h(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    int-to-float v0, v5

    .line 57
    iget-object v2, p1, Lxb/i;->a:Lqg/t;

    .line 58
    .line 59
    new-instance v4, Li/i1;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-direct {v4, p1, v0, v5}, Li/i1;-><init>(Lxb/i;FLwf/c;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x3

    .line 66
    invoke-static {v2, v5, v4, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 67
    .line 68
    .line 69
    new-instance v0, Lwb/n3;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-direct {v0, v3, v5, v2}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v5, v0, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 76
    .line 77
    .line 78
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_0
    iget-object v0, p0, Lhb/w;->i:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, [Lv1/b1;

    .line 84
    .line 85
    iget-object v1, p0, Lhb/w;->j:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Lp/t;

    .line 88
    .line 89
    iget-object v2, p0, Lhb/w;->k:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Lv1/p0;

    .line 92
    .line 93
    iget-object v3, p0, Lhb/w;->l:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, [I

    .line 96
    .line 97
    check-cast p1, Lv1/a1;

    .line 98
    .line 99
    array-length v4, v0

    .line 100
    const/4 v5, 0x0

    .line 101
    move v6, v5

    .line 102
    :goto_2
    if-ge v5, v4, :cond_5

    .line 103
    .line 104
    aget-object v7, v0, v5

    .line 105
    .line 106
    add-int/lit8 v8, v6, 0x1

    .line 107
    .line 108
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7}, Lv1/b1;->X()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    instance-of v10, v9, Lp/c1;

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    if-eqz v10, :cond_2

    .line 119
    .line 120
    check-cast v9, Lp/c1;

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_2
    move-object v9, v11

    .line 124
    :goto_3
    invoke-interface {v2}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    if-eqz v9, :cond_3

    .line 129
    .line 130
    iget-object v11, v9, Lp/c1;->c:Lp/x;

    .line 131
    .line 132
    :cond_3
    iget v9, p0, Lhb/w;->h:I

    .line 133
    .line 134
    if-eqz v11, :cond_4

    .line 135
    .line 136
    iget v10, v7, Lv1/b1;->g:I

    .line 137
    .line 138
    iget-object v11, v11, Lp/x;->a:Ly0/f;

    .line 139
    .line 140
    invoke-virtual {v11, v10, v9}, Ly0/f;->a(II)I

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    goto :goto_4

    .line 145
    :cond_4
    iget-object v11, v1, Lp/t;->b:Ly0/e;

    .line 146
    .line 147
    iget v12, v7, Lv1/b1;->g:I

    .line 148
    .line 149
    invoke-virtual {v11, v12, v9, v10}, Ly0/e;->a(IILu2/m;)I

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    :goto_4
    aget v6, v3, v6

    .line 154
    .line 155
    invoke-static {p1, v7, v9, v6}, Lv1/a1;->B(Lv1/a1;Lv1/b1;II)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v5, v5, 0x1

    .line 159
    .line 160
    move v6, v8

    .line 161
    goto :goto_2

    .line 162
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 163
    .line 164
    return-object p1

    .line 165
    :pswitch_1
    iget-object v0, p0, Lhb/w;->i:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v2, v0

    .line 168
    check-cast v2, Lhb/i0;

    .line 169
    .line 170
    iget-object v0, p0, Lhb/w;->j:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v3, v0

    .line 173
    check-cast v3, Landroid/app/Activity;

    .line 174
    .line 175
    iget-object v0, p0, Lhb/w;->k:Ljava/lang/Object;

    .line 176
    .line 177
    move-object v4, v0

    .line 178
    check-cast v4, Ljava/util/List;

    .line 179
    .line 180
    iget-object v0, p0, Lhb/w;->l:Ljava/lang/Object;

    .line 181
    .line 182
    move-object v7, v0

    .line 183
    check-cast v7, Lb/e;

    .line 184
    .line 185
    move-object v5, p1

    .line 186
    check-cast v5, Ljava/util/List;

    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    const/16 v0, 0xc

    .line 196
    .line 197
    const/4 v1, 0x5

    .line 198
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 202
    .line 203
    .line 204
    move-result-wide v9

    .line 205
    new-instance v1, Lc9/c0;

    .line 206
    .line 207
    const/4 v8, 0x1

    .line 208
    iget v6, p0, Lhb/w;->h:I

    .line 209
    .line 210
    invoke-direct/range {v1 .. v8}, Lc9/c0;-><init>(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    new-instance p1, Lsf/e;

    .line 217
    .line 218
    const-string v0, "\u5355\u6b21"

    .line 219
    .line 220
    const-string v4, ""

    .line 221
    .line 222
    invoke-direct {p1, v0, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    new-instance v0, Lsf/e;

    .line 226
    .line 227
    const-string v5, "\u6bcf\u5929"

    .line 228
    .line 229
    invoke-direct {v0, v5, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    new-instance v5, Lsf/e;

    .line 233
    .line 234
    const-string v6, "\u6bcf\u5468"

    .line 235
    .line 236
    invoke-direct {v5, v6, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    filled-new-array {p1, v0, v5}, [Lsf/e;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    new-instance v7, Lhb/c0;

    .line 248
    .line 249
    move-object v4, v3

    .line 250
    move-wide v5, v9

    .line 251
    move-object v3, v2

    .line 252
    move-object v2, v1

    .line 253
    move-object v1, v7

    .line 254
    invoke-direct/range {v1 .. v6}, Lhb/c0;-><init>(Lc9/c0;Lhb/i0;Landroid/app/Activity;J)V

    .line 255
    .line 256
    .line 257
    move-object v3, v4

    .line 258
    new-instance v8, Lk/s1;

    .line 259
    .line 260
    const/4 v0, 0x7

    .line 261
    invoke-direct {v8, v0}, Lk/s1;-><init>(I)V

    .line 262
    .line 263
    .line 264
    sget-object v9, Lwb/lv;->j:Lwb/lv;

    .line 265
    .line 266
    const-string v4, "\u9009\u62e9\u91cd\u590d\u65b9\u5f0f"

    .line 267
    .line 268
    const-string v5, ""

    .line 269
    .line 270
    move-object v6, p1

    .line 271
    invoke-static/range {v3 .. v9}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

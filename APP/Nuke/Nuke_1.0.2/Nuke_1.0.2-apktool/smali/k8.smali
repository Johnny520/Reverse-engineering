.class public final Lk8;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnf1;


# static fields
.field public static final b:Lk8;

.field public static final c:Lk8;

.field public static final d:Lk8;

.field public static final e:Lk8;

.field public static final f:Lw;

.field public static final g:Lk8;

.field public static final h:Lk8;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk8;->b:Lk8;

    .line 8
    .line 9
    new-instance v0, Lk8;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lk8;->c:Lk8;

    .line 16
    .line 17
    new-instance v0, Lk8;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lk8;->d:Lk8;

    .line 24
    .line 25
    new-instance v0, Lk8;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lk8;->e:Lk8;

    .line 32
    .line 33
    new-instance v0, Lw;

    .line 34
    .line 35
    const/16 v1, 0x18

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lw;-><init>(I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lk8;->f:Lw;

    .line 41
    .line 42
    new-instance v0, Lk8;

    .line 43
    .line 44
    const/4 v1, 0x4

    .line 45
    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lk8;->g:Lk8;

    .line 49
    .line 50
    new-instance v0, Lk8;

    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lk8;->h:Lk8;

    .line 57
    .line 58
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk8;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Lpf1;Ljava/util/List;J)Lof1;
    .locals 8

    .line 1
    iget p0, p0, Lk8;->a:I

    .line 2
    .line 3
    const/16 v0, 0x18

    .line 4
    .line 5
    sget-object v1, Lce0;->h:Lce0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p4}, Lfz;->f(J)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-static {p3, p4}, Lfz;->h(J)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p0, v2

    .line 23
    :goto_0
    invoke-static {p3, p4}, Lfz;->e(J)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-static {p3, p4}, Lfz;->g(J)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :cond_1
    new-instance p2, Lw;

    .line 34
    .line 35
    invoke-direct {p2, v0}, Lw;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, p0, v2, v1, p2}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_0
    new-instance p0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    move v3, v2

    .line 57
    move v4, v3

    .line 58
    move v5, v4

    .line 59
    :goto_1
    if-ge v3, v0, :cond_2

    .line 60
    .line 61
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Lif1;

    .line 66
    .line 67
    invoke-interface {v6, p3, p4}, Lif1;->e(J)Lsz1;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget v7, v6, Lsz1;->h:I

    .line 72
    .line 73
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    iget v7, v6, Lsz1;->i:I

    .line 78
    .line 79
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    new-instance p2, Lxq2;

    .line 90
    .line 91
    invoke-direct {p2, v2, p0}, Lxq2;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1, v4, v5, v1, p2}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_1
    invoke-static {p3, p4}, Lfz;->h(J)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-static {p3, p4}, Lfz;->g(J)I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    sget-object p3, Lk8;->f:Lw;

    .line 108
    .line 109
    invoke-interface {p1, p0, p2, v1, p3}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_2
    invoke-static {p3, p4}, Lfz;->j(J)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-static {p3, p4}, Lfz;->i(J)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    new-instance p3, Lw;

    .line 123
    .line 124
    invoke-direct {p3, v0}, Lw;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p1, p0, p2, v1, p3}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_5

    .line 137
    .line 138
    const/4 v0, 0x1

    .line 139
    if-eq p0, v0, :cond_4

    .line 140
    .line 141
    new-instance p0, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    move v4, v2

    .line 155
    move v5, v4

    .line 156
    :goto_2
    if-ge v2, v3, :cond_3

    .line 157
    .line 158
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    check-cast v6, Lif1;

    .line 163
    .line 164
    invoke-interface {v6, p3, p4}, Lif1;->e(J)Lsz1;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    iget v7, v6, Lsz1;->h:I

    .line 169
    .line 170
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    iget v7, v6, Lsz1;->i:I

    .line 175
    .line 176
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    add-int/lit8 v2, v2, 0x1

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_3
    new-instance p2, Lj8;

    .line 187
    .line 188
    invoke-direct {p2, v0, p0}, Lj8;-><init>(ILjava/util/ArrayList;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {p1, v4, v5, v1, p2}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    goto :goto_3

    .line 196
    :cond_4
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    check-cast p0, Lif1;

    .line 201
    .line 202
    invoke-interface {p0, p3, p4}, Lif1;->e(J)Lsz1;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    iget p2, p0, Lsz1;->h:I

    .line 207
    .line 208
    iget p3, p0, Lsz1;->i:I

    .line 209
    .line 210
    new-instance p4, Ln6;

    .line 211
    .line 212
    invoke-direct {p4, p0, v0}, Ln6;-><init>(Lsz1;I)V

    .line 213
    .line 214
    .line 215
    invoke-interface {p1, p2, p3, v1, p4}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    goto :goto_3

    .line 220
    :cond_5
    sget-object p0, Lv6;->r:Lv6;

    .line 221
    .line 222
    invoke-interface {p1, v2, v2, v1, p0}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    :goto_3
    return-object p0

    .line 227
    :pswitch_4
    new-instance p0, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    move v3, v2

    .line 241
    move v4, v3

    .line 242
    move v5, v4

    .line 243
    :goto_4
    if-ge v3, v0, :cond_6

    .line 244
    .line 245
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    check-cast v6, Lif1;

    .line 250
    .line 251
    invoke-interface {v6, p3, p4}, Lif1;->e(J)Lsz1;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    iget v7, v6, Lsz1;->h:I

    .line 256
    .line 257
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    iget v7, v6, Lsz1;->i:I

    .line 262
    .line 263
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    add-int/lit8 v3, v3, 0x1

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_6
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_7

    .line 278
    .line 279
    invoke-static {p3, p4}, Lfz;->j(J)I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    invoke-static {p3, p4}, Lfz;->i(J)I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    :cond_7
    new-instance p2, Lj8;

    .line 288
    .line 289
    invoke-direct {p2, v2, p0}, Lj8;-><init>(ILjava/util/ArrayList;)V

    .line 290
    .line 291
    .line 292
    invoke-interface {p1, v4, v5, v1, p2}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    return-object p0

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

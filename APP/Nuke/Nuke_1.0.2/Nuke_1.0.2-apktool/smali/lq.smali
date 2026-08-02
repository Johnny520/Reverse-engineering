.class public final Llq;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lak0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Llq;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Llq;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Llq;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Llq;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Llq;->l:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Llq;->h:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, La83;->a:La83;

    .line 6
    .line 7
    iget-object v4, p0, Llq;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, Llq;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, p0, Llq;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, p0, Llq;->k:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, Lj11;

    .line 19
    .line 20
    check-cast v7, La72;

    .line 21
    .line 22
    check-cast v6, La72;

    .line 23
    .line 24
    check-cast v5, La72;

    .line 25
    .line 26
    instance-of p0, p1, Lz22;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    iget p0, v5, La72;->h:I

    .line 31
    .line 32
    add-int/2addr p0, v1

    .line 33
    iput p0, v5, La72;->h:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    instance-of p0, p1, La32;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    iget p0, v5, La72;->h:I

    .line 41
    .line 42
    add-int/lit8 p0, p0, -0x1

    .line 43
    .line 44
    iput p0, v5, La72;->h:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    instance-of p0, p1, Ly22;

    .line 48
    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    iget p0, v5, La72;->h:I

    .line 52
    .line 53
    add-int/lit8 p0, p0, -0x1

    .line 54
    .line 55
    iput p0, v5, La72;->h:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    instance-of p0, p1, Lxu0;

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    iget p0, v6, La72;->h:I

    .line 63
    .line 64
    add-int/2addr p0, v1

    .line 65
    iput p0, v6, La72;->h:I

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    instance-of p0, p1, Lyu0;

    .line 69
    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    iget p0, v6, La72;->h:I

    .line 73
    .line 74
    add-int/lit8 p0, p0, -0x1

    .line 75
    .line 76
    iput p0, v6, La72;->h:I

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    instance-of p0, p1, Ltk0;

    .line 80
    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    iget p0, v7, La72;->h:I

    .line 84
    .line 85
    add-int/2addr p0, v1

    .line 86
    iput p0, v7, La72;->h:I

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    instance-of p0, p1, Luk0;

    .line 90
    .line 91
    if-eqz p0, :cond_6

    .line 92
    .line 93
    iget p0, v7, La72;->h:I

    .line 94
    .line 95
    add-int/lit8 p0, p0, -0x1

    .line 96
    .line 97
    iput p0, v7, La72;->h:I

    .line 98
    .line 99
    :cond_6
    :goto_0
    iget p0, v5, La72;->h:I

    .line 100
    .line 101
    if-lez p0, :cond_7

    .line 102
    .line 103
    move p0, v1

    .line 104
    goto :goto_1

    .line 105
    :cond_7
    move p0, v2

    .line 106
    :goto_1
    iget p1, v6, La72;->h:I

    .line 107
    .line 108
    if-lez p1, :cond_8

    .line 109
    .line 110
    move p1, v1

    .line 111
    goto :goto_2

    .line 112
    :cond_8
    move p1, v2

    .line 113
    :goto_2
    iget p2, v7, La72;->h:I

    .line 114
    .line 115
    if-lez p2, :cond_9

    .line 116
    .line 117
    move p2, v1

    .line 118
    goto :goto_3

    .line 119
    :cond_9
    move p2, v2

    .line 120
    :goto_3
    check-cast v4, Li50;

    .line 121
    .line 122
    iget-boolean v0, v4, Li50;->w:Z

    .line 123
    .line 124
    if-eq v0, p0, :cond_a

    .line 125
    .line 126
    iput-boolean p0, v4, Li50;->w:Z

    .line 127
    .line 128
    move v2, v1

    .line 129
    :cond_a
    iget-boolean p0, v4, Li50;->x:Z

    .line 130
    .line 131
    if-eq p0, p1, :cond_b

    .line 132
    .line 133
    iput-boolean p1, v4, Li50;->x:Z

    .line 134
    .line 135
    move v2, v1

    .line 136
    :cond_b
    iget-boolean p0, v4, Li50;->y:Z

    .line 137
    .line 138
    if-eq p0, p2, :cond_c

    .line 139
    .line 140
    iput-boolean p2, v4, Li50;->y:Z

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_c
    move v1, v2

    .line 144
    :goto_4
    if-eqz v1, :cond_d

    .line 145
    .line 146
    invoke-static {v4}, Lci0;->M(Lmc0;)V

    .line 147
    .line 148
    .line 149
    :cond_d
    return-object v3

    .line 150
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    check-cast v7, Lb03;

    .line 157
    .line 158
    check-cast v5, Lt91;

    .line 159
    .line 160
    if-eqz p0, :cond_e

    .line 161
    .line 162
    invoke-virtual {v5}, Lt91;->b()Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_e

    .line 167
    .line 168
    check-cast v6, Lo03;

    .line 169
    .line 170
    invoke-virtual {v7}, Lb03;->n()Lk03;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast v4, Lxx0;

    .line 175
    .line 176
    iget-object p1, v7, Lb03;->b:Lus1;

    .line 177
    .line 178
    invoke-static {v6, v5, p0, v4, p1}, Lgf1;->T(Lo03;Lt91;Lk03;Lxx0;Lus1;)V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_e
    invoke-static {v5}, Lgf1;->s(Lt91;)V

    .line 183
    .line 184
    .line 185
    :goto_5
    return-object v3

    .line 186
    :pswitch_1
    check-cast v5, Lo72;

    .line 187
    .line 188
    instance-of v0, p2, Lkq;

    .line 189
    .line 190
    if-eqz v0, :cond_f

    .line 191
    .line 192
    move-object v0, p2

    .line 193
    check-cast v0, Lkq;

    .line 194
    .line 195
    iget v8, v0, Lkq;->n:I

    .line 196
    .line 197
    const/high16 v9, -0x80000000

    .line 198
    .line 199
    and-int v10, v8, v9

    .line 200
    .line 201
    if-eqz v10, :cond_f

    .line 202
    .line 203
    sub-int/2addr v8, v9

    .line 204
    iput v8, v0, Lkq;->n:I

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_f
    new-instance v0, Lkq;

    .line 208
    .line 209
    invoke-direct {v0, p0, p2}, Lkq;-><init>(Llq;Lt00;)V

    .line 210
    .line 211
    .line 212
    :goto_6
    iget-object p0, v0, Lkq;->l:Ljava/lang/Object;

    .line 213
    .line 214
    iget p2, v0, Lkq;->n:I

    .line 215
    .line 216
    const/4 v8, 0x0

    .line 217
    if-eqz p2, :cond_11

    .line 218
    .line 219
    if-ne p2, v1, :cond_10

    .line 220
    .line 221
    iget-object p1, v0, Lkq;->k:Ljava/lang/Object;

    .line 222
    .line 223
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_10
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 228
    .line 229
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    move-object v3, v8

    .line 233
    goto :goto_8

    .line 234
    :cond_11
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    iget-object p0, v5, Lo72;->i:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p0, Lk21;

    .line 240
    .line 241
    if-eqz p0, :cond_12

    .line 242
    .line 243
    new-instance p2, Lks;

    .line 244
    .line 245
    const-string v9, "Child of the scoped flow was cancelled"

    .line 246
    .line 247
    invoke-direct {p2, v9, v2}, Lks;-><init>(Ljava/lang/String;I)V

    .line 248
    .line 249
    .line 250
    invoke-interface {p0, p2}, Lk21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 251
    .line 252
    .line 253
    iput-object p1, v0, Lkq;->k:Ljava/lang/Object;

    .line 254
    .line 255
    iput v1, v0, Lkq;->n:I

    .line 256
    .line 257
    invoke-interface {p0, v0}, Lk21;->A(Lu00;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    sget-object p2, Lk20;->h:Lk20;

    .line 262
    .line 263
    if-ne p0, p2, :cond_12

    .line 264
    .line 265
    move-object v3, p2

    .line 266
    goto :goto_8

    .line 267
    :cond_12
    :goto_7
    check-cast v6, Lj20;

    .line 268
    .line 269
    new-instance p0, Ljq;

    .line 270
    .line 271
    check-cast v7, Lmq;

    .line 272
    .line 273
    check-cast v4, Lak0;

    .line 274
    .line 275
    invoke-direct {p0, v7, v4, p1, v8}, Ljq;-><init>(Lmq;Lak0;Ljava/lang/Object;Lt00;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v6, v8, p0, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    iput-object p0, v5, Lo72;->i:Ljava/lang/Object;

    .line 283
    .line 284
    :goto_8
    return-object v3

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lwb/ss;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Li0/j1;Landroid/content/Context;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/ss;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ss;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ss;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ss;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ss;->j:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lfg/a;Landroid/app/Activity;Lfg/l;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lwb/ss;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ss;->h:Ljava/lang/Object;

    iput-object p2, p0, Lwb/ss;->i:Ljava/lang/Object;

    iput-object p3, p0, Lwb/ss;->j:Ljava/lang/Object;

    iput-object p4, p0, Lwb/ss;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ss;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/ss;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/List;

    .line 11
    .line 12
    iget-object v2, v0, Lwb/ss;->i:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v5, v2

    .line 15
    check-cast v5, Lfg/a;

    .line 16
    .line 17
    iget-object v2, v0, Lwb/ss;->j:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v6, v2

    .line 20
    check-cast v6, Landroid/app/Activity;

    .line 21
    .line 22
    iget-object v2, v0, Lwb/ss;->k:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v7, v2

    .line 25
    check-cast v7, Lfg/l;

    .line 26
    .line 27
    move-object/from16 v2, p1

    .line 28
    .line 29
    check-cast v2, Lr/h;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v3, 0x0

    .line 39
    move v8, v3

    .line 40
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    add-int/lit8 v9, v8, 0x1

    .line 51
    .line 52
    if-ltz v8, :cond_0

    .line 53
    .line 54
    move-object v4, v3

    .line 55
    check-cast v4, Lsf/e;

    .line 56
    .line 57
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    new-instance v3, Lwb/fs;

    .line 62
    .line 63
    invoke-direct/range {v3 .. v8}, Lwb/fs;-><init>(Lsf/e;Lfg/a;Landroid/app/Activity;Lfg/l;I)V

    .line 64
    .line 65
    .line 66
    new-instance v4, Ls0/d;

    .line 67
    .line 68
    const v8, 0x406a5373

    .line 69
    .line 70
    .line 71
    const/4 v11, 0x1

    .line 72
    invoke-direct {v4, v8, v3, v11}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x2

    .line 76
    invoke-static {v2, v10, v4, v3}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 77
    .line 78
    .line 79
    move v8, v9

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-static {}, La/a;->Q0()V

    .line 82
    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    throw v1

    .line 86
    :cond_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 87
    .line 88
    return-object v1

    .line 89
    :pswitch_0
    iget-object v1, v0, Lwb/ss;->h:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Ljava/lang/String;

    .line 92
    .line 93
    iget-object v2, v0, Lwb/ss;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Li0/a1;

    .line 96
    .line 97
    iget-object v3, v0, Lwb/ss;->k:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Landroid/content/Context;

    .line 100
    .line 101
    iget-object v4, v0, Lwb/ss;->j:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v4, Li0/a1;

    .line 104
    .line 105
    move-object/from16 v5, p1

    .line 106
    .line 107
    check-cast v5, Ljava/util/List;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    const/4 v8, 0x0

    .line 121
    if-nez v7, :cond_2

    .line 122
    .line 123
    move-object v7, v8

    .line 124
    goto :goto_2

    .line 125
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    check-cast v7, Lfb/d1;

    .line 130
    .line 131
    iget-wide v9, v7, Lfb/d1;->n:J

    .line 132
    .line 133
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eqz v9, :cond_4

    .line 142
    .line 143
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    check-cast v9, Lfb/d1;

    .line 148
    .line 149
    iget-wide v9, v9, Lfb/d1;->n:J

    .line 150
    .line 151
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-virtual {v7, v9}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    if-gez v10, :cond_3

    .line 160
    .line 161
    move-object v7, v9

    .line 162
    goto :goto_1

    .line 163
    :cond_4
    :goto_2
    if-eqz v7, :cond_5

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 166
    .line 167
    .line 168
    move-result-wide v6

    .line 169
    goto :goto_3

    .line 170
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 171
    .line 172
    .line 173
    move-result-wide v6

    .line 174
    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    int-to-long v9, v9

    .line 179
    add-long/2addr v6, v9

    .line 180
    const-wide/16 v9, 0x1

    .line 181
    .line 182
    add-long/2addr v6, v9

    .line 183
    new-instance v9, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    const/4 v10, 0x0

    .line 197
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    if-eqz v11, :cond_7

    .line 202
    .line 203
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    add-int/lit8 v12, v10, 0x1

    .line 208
    .line 209
    if-ltz v10, :cond_6

    .line 210
    .line 211
    move-object v13, v11

    .line 212
    check-cast v13, Lfb/d1;

    .line 213
    .line 214
    int-to-long v10, v10

    .line 215
    sub-long v17, v6, v10

    .line 216
    .line 217
    const v19, 0xdfff

    .line 218
    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const/4 v15, 0x0

    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    invoke-static/range {v13 .. v19}, Lfb/d1;->a(Lfb/d1;Ljava/lang/String;ZZJI)Lfb/d1;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move v10, v12

    .line 232
    goto :goto_4

    .line 233
    :cond_6
    invoke-static {}, La/a;->Q0()V

    .line 234
    .line 235
    .line 236
    throw v8

    .line 237
    :cond_7
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-eqz v6, :cond_9

    .line 246
    .line 247
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    move-object v7, v6

    .line 252
    check-cast v7, Lfb/d1;

    .line 253
    .line 254
    iget-object v7, v7, Lfb/d1;->a:Ljava/lang/String;

    .line 255
    .line 256
    invoke-static {v7, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_8

    .line 261
    .line 262
    move-object v8, v6

    .line 263
    :cond_9
    check-cast v8, Lfb/d1;

    .line 264
    .line 265
    if-eqz v8, :cond_a

    .line 266
    .line 267
    iget-wide v5, v8, Lfb/d1;->n:J

    .line 268
    .line 269
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_a
    new-instance v1, Ljava/lang/Thread;

    .line 277
    .line 278
    new-instance v2, Lr8/b;

    .line 279
    .line 280
    const/16 v5, 0x8

    .line 281
    .line 282
    invoke-direct {v2, v9, v3, v4, v5}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 283
    .line 284
    .line 285
    const-string v3, "Hchat-Agent-Session-Order"

    .line 286
    .line 287
    invoke-direct {v1, v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 291
    .line 292
    .line 293
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 294
    .line 295
    return-object v1

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

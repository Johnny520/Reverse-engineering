.class public final synthetic Lwb/rs;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lwb/yt;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/rs;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/rs;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/rs;->i:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/rs;->j:Lwb/yt;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/rs;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/rs;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/rs;->m:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/rs;->n:Li0/a1;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/rs;->o:Li0/a1;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lwb/yt;Landroid/content/Context;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/a1;I)V
    .locals 0

    .line 24
    iput p9, p0, Lwb/rs;->g:I

    iput-object p1, p0, Lwb/rs;->h:Ljava/lang/String;

    iput-object p2, p0, Lwb/rs;->j:Lwb/yt;

    iput-object p3, p0, Lwb/rs;->i:Landroid/content/Context;

    iput-object p4, p0, Lwb/rs;->k:Li0/a1;

    iput-object p5, p0, Lwb/rs;->l:Li0/a1;

    iput-object p6, p0, Lwb/rs;->m:Li0/a1;

    iput-object p7, p0, Lwb/rs;->n:Li0/a1;

    iput-object p8, p0, Lwb/rs;->o:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/rs;->g:I

    .line 4
    .line 5
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    iget-object v3, v0, Lwb/rs;->j:Lwb/yt;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Lfb/d1;

    .line 15
    .line 16
    move-object/from16 v4, p2

    .line 17
    .line 18
    check-cast v4, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v4, v1, Lfb/d1;->a:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v12, v0, Lwb/rs;->h:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v4, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    iget-wide v4, v1, Lfb/d1;->d:J

    .line 38
    .line 39
    invoke-virtual {v3, v4, v5}, Lwb/yt;->M(J)Lfb/d1;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :cond_0
    move-object v5, v1

    .line 44
    const-wide/16 v9, 0x0

    .line 45
    .line 46
    const v11, 0xefff

    .line 47
    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    invoke-static/range {v5 .. v11}, Lfb/d1;->a(Lfb/d1;Ljava/lang/String;ZZJI)Lfb/d1;

    .line 52
    .line 53
    .line 54
    move-result-object v16

    .line 55
    iget-object v9, v0, Lwb/rs;->i:Landroid/content/Context;

    .line 56
    .line 57
    iget-object v11, v0, Lwb/rs;->k:Li0/a1;

    .line 58
    .line 59
    move-object v10, v12

    .line 60
    iget-object v12, v0, Lwb/rs;->l:Li0/a1;

    .line 61
    .line 62
    iget-object v13, v0, Lwb/rs;->m:Li0/a1;

    .line 63
    .line 64
    iget-object v14, v0, Lwb/rs;->n:Li0/a1;

    .line 65
    .line 66
    iget-object v15, v0, Lwb/rs;->o:Li0/a1;

    .line 67
    .line 68
    invoke-static/range {v9 .. v16}, Lwb/y2;->m1(Landroid/content/Context;Ljava/lang/String;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lfb/d1;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :pswitch_0
    move-object/from16 v1, p1

    .line 73
    .line 74
    check-cast v1, Lfb/d1;

    .line 75
    .line 76
    move-object/from16 v4, p2

    .line 77
    .line 78
    check-cast v4, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v4, v1, Lfb/d1;->a:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v12, v0, Lwb/rs;->h:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v4, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_1

    .line 96
    .line 97
    iget-wide v4, v1, Lfb/d1;->d:J

    .line 98
    .line 99
    invoke-virtual {v3, v4, v5}, Lwb/yt;->M(J)Lfb/d1;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_1
    move-object v5, v1

    .line 104
    iget-wide v3, v5, Lfb/d1;->n:J

    .line 105
    .line 106
    iget-object v1, v0, Lwb/rs;->i:Landroid/content/Context;

    .line 107
    .line 108
    if-eqz v7, :cond_6

    .line 109
    .line 110
    sget-object v6, Lfb/g1;->a:Lfb/g1;

    .line 111
    .line 112
    invoke-static {v1}, Lfb/g1;->i(Landroid/content/Context;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-nez v8, :cond_2

    .line 125
    .line 126
    const/4 v6, 0x0

    .line 127
    goto :goto_1

    .line 128
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    check-cast v8, Lfb/d1;

    .line 133
    .line 134
    iget-wide v8, v8, Lfb/d1;->n:J

    .line 135
    .line 136
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    :cond_3
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-eqz v9, :cond_4

    .line 145
    .line 146
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    check-cast v9, Lfb/d1;

    .line 151
    .line 152
    iget-wide v9, v9, Lfb/d1;->n:J

    .line 153
    .line 154
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-virtual {v8, v9}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-gez v10, :cond_3

    .line 163
    .line 164
    move-object v8, v9

    .line 165
    goto :goto_0

    .line 166
    :cond_4
    move-object v6, v8

    .line 167
    :goto_1
    if-eqz v6, :cond_5

    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    :cond_5
    const-wide/16 v8, 0x1

    .line 174
    .line 175
    add-long/2addr v3, v8

    .line 176
    :cond_6
    move-wide v9, v3

    .line 177
    const/4 v8, 0x0

    .line 178
    const v11, 0xd7ff

    .line 179
    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    invoke-static/range {v5 .. v11}, Lfb/d1;->a(Lfb/d1;Ljava/lang/String;ZZJI)Lfb/d1;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    iget-object v10, v0, Lwb/rs;->k:Li0/a1;

    .line 187
    .line 188
    iget-object v11, v0, Lwb/rs;->l:Li0/a1;

    .line 189
    .line 190
    move-object v9, v12

    .line 191
    iget-object v12, v0, Lwb/rs;->m:Li0/a1;

    .line 192
    .line 193
    iget-object v13, v0, Lwb/rs;->n:Li0/a1;

    .line 194
    .line 195
    iget-object v14, v0, Lwb/rs;->o:Li0/a1;

    .line 196
    .line 197
    move-object v8, v1

    .line 198
    invoke-static/range {v8 .. v15}, Lwb/y2;->m1(Landroid/content/Context;Ljava/lang/String;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lfb/d1;)V

    .line 199
    .line 200
    .line 201
    return-object v2

    .line 202
    :pswitch_1
    move-object/from16 v1, p1

    .line 203
    .line 204
    check-cast v1, Lfb/d1;

    .line 205
    .line 206
    move-object/from16 v4, p2

    .line 207
    .line 208
    check-cast v4, Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    const-string v5, "\\s+"

    .line 217
    .line 218
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    const-string v6, " "

    .line 226
    .line 227
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v4, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    const/16 v5, 0x20

    .line 247
    .line 248
    invoke-static {v5, v4}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_7

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_7
    iget-object v4, v1, Lfb/d1;->a:Ljava/lang/String;

    .line 260
    .line 261
    iget-object v5, v0, Lwb/rs;->h:Ljava/lang/String;

    .line 262
    .line 263
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_8

    .line 268
    .line 269
    iget-wide v8, v1, Lfb/d1;->d:J

    .line 270
    .line 271
    invoke-virtual {v3, v8, v9}, Lwb/yt;->M(J)Lfb/d1;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    :cond_8
    move-object v6, v1

    .line 276
    const-wide/16 v10, 0x0

    .line 277
    .line 278
    const v12, 0xfffd

    .line 279
    .line 280
    .line 281
    const/4 v8, 0x0

    .line 282
    const/4 v9, 0x0

    .line 283
    invoke-static/range {v6 .. v12}, Lfb/d1;->a(Lfb/d1;Ljava/lang/String;ZZJI)Lfb/d1;

    .line 284
    .line 285
    .line 286
    move-result-object v15

    .line 287
    iget-object v8, v0, Lwb/rs;->i:Landroid/content/Context;

    .line 288
    .line 289
    iget-object v10, v0, Lwb/rs;->k:Li0/a1;

    .line 290
    .line 291
    iget-object v11, v0, Lwb/rs;->l:Li0/a1;

    .line 292
    .line 293
    iget-object v12, v0, Lwb/rs;->m:Li0/a1;

    .line 294
    .line 295
    iget-object v13, v0, Lwb/rs;->n:Li0/a1;

    .line 296
    .line 297
    iget-object v14, v0, Lwb/rs;->o:Li0/a1;

    .line 298
    .line 299
    move-object v9, v5

    .line 300
    invoke-static/range {v8 .. v15}, Lwb/y2;->m1(Landroid/content/Context;Ljava/lang/String;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lfb/d1;)V

    .line 301
    .line 302
    .line 303
    :goto_2
    return-object v2

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

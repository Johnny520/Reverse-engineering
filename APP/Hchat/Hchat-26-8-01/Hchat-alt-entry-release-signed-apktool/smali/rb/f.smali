.class public final synthetic Lrb/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lrb/k;

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Z

.field public final synthetic j:I

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lrb/k;Ljava/util/ArrayList;ZIJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrb/f;->g:Lrb/k;

    .line 5
    .line 6
    iput-object p2, p0, Lrb/f;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-boolean p3, p0, Lrb/f;->i:Z

    .line 9
    .line 10
    iput p4, p0, Lrb/f;->j:I

    .line 11
    .line 12
    iput-wide p5, p0, Lrb/f;->k:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lrb/f;->g:Lrb/k;

    .line 4
    .line 5
    iget-object v2, v1, Lrb/f;->h:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-boolean v3, v1, Lrb/f;->i:Z

    .line 8
    .line 9
    iget v4, v1, Lrb/f;->j:I

    .line 10
    .line 11
    iget-wide v5, v1, Lrb/f;->k:J

    .line 12
    .line 13
    const/16 v7, 0x12c

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    invoke-static {v4, v8, v7}, Lr9/e0;->r(III)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    move v9, v8

    .line 28
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    if-eqz v10, :cond_9

    .line 33
    .line 34
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    add-int/lit8 v11, v9, 0x1

    .line 39
    .line 40
    if-ltz v9, :cond_8

    .line 41
    .line 42
    check-cast v10, Lrb/i;

    .line 43
    .line 44
    invoke-virtual {v0, v5, v6}, Lrb/k;->c(J)Z

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    if-nez v12, :cond_0

    .line 49
    .line 50
    goto/16 :goto_8

    .line 51
    .line 52
    :cond_0
    iget-object v12, v0, Lrb/k;->d:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v12

    .line 55
    :try_start_0
    iget-object v13, v10, Lrb/i;->b:Ljava/lang/String;

    .line 56
    .line 57
    iput-object v13, v0, Lrb/k;->o:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    new-instance v15, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v8, "\u6b63\u5728\u5220\u9664 "

    .line 69
    .line 70
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v8, " ("

    .line 77
    .line 78
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v8, "/"

    .line 85
    .line 86
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v8, ")"

    .line 93
    .line 94
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    iput-object v8, v0, Lrb/k;->n:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 102
    .line 103
    monitor-exit v12

    .line 104
    iget-object v8, v0, Lrb/k;->k:Lrb/c;

    .line 105
    .line 106
    const/4 v12, 0x1

    .line 107
    if-eqz v8, :cond_1

    .line 108
    .line 109
    iget-object v13, v10, Lrb/i;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v8, v13, v3}, Lrb/c;->b(Ljava/lang/String;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-ne v8, v12, :cond_1

    .line 116
    .line 117
    move v8, v12

    .line 118
    goto :goto_1

    .line 119
    :cond_1
    const/4 v8, 0x0

    .line 120
    :goto_1
    iget-object v13, v0, Lrb/k;->d:Ljava/lang/Object;

    .line 121
    .line 122
    monitor-enter v13

    .line 123
    :try_start_1
    invoke-virtual {v0, v5, v6}, Lrb/k;->d(J)Z

    .line 124
    .line 125
    .line 126
    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    if-nez v14, :cond_2

    .line 128
    .line 129
    monitor-exit v13

    .line 130
    goto/16 :goto_8

    .line 131
    .line 132
    :cond_2
    :try_start_2
    iget v14, v0, Lrb/k;->u:I

    .line 133
    .line 134
    add-int/2addr v14, v12

    .line 135
    iput v14, v0, Lrb/k;->u:I

    .line 136
    .line 137
    if-eqz v8, :cond_3

    .line 138
    .line 139
    iget v14, v0, Lrb/k;->v:I

    .line 140
    .line 141
    add-int/2addr v14, v12

    .line 142
    iput v14, v0, Lrb/k;->v:I

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :catchall_0
    move-exception v0

    .line 146
    goto :goto_6

    .line 147
    :cond_3
    iget v14, v0, Lrb/k;->w:I

    .line 148
    .line 149
    add-int/2addr v14, v12

    .line 150
    iput v14, v0, Lrb/k;->w:I

    .line 151
    .line 152
    :goto_2
    iget-object v10, v10, Lrb/i;->b:Ljava/lang/String;

    .line 153
    .line 154
    if-eqz v8, :cond_4

    .line 155
    .line 156
    const-string v8, "\u5df2\u63d0\u4ea4\u5220\u9664\u597d\u53cb"

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    const-string v8, "\u5220\u9664\u597d\u53cb\u5931\u8d25"

    .line 160
    .line 161
    :goto_3
    new-instance v14, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v10, ": "

    .line 170
    .line 171
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-virtual {v0, v8}, Lrb/k;->b(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 182
    .line 183
    .line 184
    monitor-exit v13

    .line 185
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    sub-int/2addr v8, v12

    .line 190
    if-ge v9, v8, :cond_7

    .line 191
    .line 192
    mul-int/lit8 v8, v4, 0xa

    .line 193
    .line 194
    :goto_4
    if-lez v8, :cond_6

    .line 195
    .line 196
    invoke-virtual {v0, v5, v6}, Lrb/k;->c(J)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-nez v9, :cond_5

    .line 201
    .line 202
    const/4 v8, 0x0

    .line 203
    goto :goto_5

    .line 204
    :cond_5
    const-wide/16 v9, 0x64

    .line 205
    .line 206
    :try_start_3
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 207
    .line 208
    .line 209
    :catchall_1
    add-int/lit8 v8, v8, -0x1

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_6
    invoke-virtual {v0, v5, v6}, Lrb/k;->c(J)Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    :goto_5
    if-nez v8, :cond_7

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_7
    move v9, v11

    .line 220
    const/4 v8, 0x0

    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :goto_6
    monitor-exit v13

    .line 224
    throw v0

    .line 225
    :catchall_2
    move-exception v0

    .line 226
    monitor-exit v12

    .line 227
    throw v0

    .line 228
    :cond_8
    invoke-static {}, La/a;->Q0()V

    .line 229
    .line 230
    .line 231
    const/4 v0, 0x0

    .line 232
    throw v0

    .line 233
    :cond_9
    iget-object v2, v0, Lrb/k;->d:Ljava/lang/Object;

    .line 234
    .line 235
    monitor-enter v2

    .line 236
    :try_start_4
    invoke-virtual {v0, v5, v6}, Lrb/k;->d(J)Z

    .line 237
    .line 238
    .line 239
    move-result v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 240
    if-nez v3, :cond_a

    .line 241
    .line 242
    :goto_7
    monitor-exit v2

    .line 243
    goto :goto_8

    .line 244
    :cond_a
    const/4 v3, 0x0

    .line 245
    :try_start_5
    iput-boolean v3, v0, Lrb/k;->s:Z

    .line 246
    .line 247
    const-string v3, ""

    .line 248
    .line 249
    iput-object v3, v0, Lrb/k;->o:Ljava/lang/String;

    .line 250
    .line 251
    const-string v3, "\u6279\u91cf\u5220\u9664\u5b8c\u6210"

    .line 252
    .line 253
    iput-object v3, v0, Lrb/k;->n:Ljava/lang/String;

    .line 254
    .line 255
    iget v3, v0, Lrb/k;->v:I

    .line 256
    .line 257
    iget v4, v0, Lrb/k;->w:I

    .line 258
    .line 259
    new-instance v5, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const-string v6, "\u6279\u91cf\u5220\u9664\u5b8c\u6210\uff0c\u5df2\u63d0\u4ea4 "

    .line 265
    .line 266
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v3, " \u4f4d\uff0c\u5931\u8d25 "

    .line 273
    .line 274
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v3, " \u4f4d"

    .line 281
    .line 282
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-virtual {v0, v3}, Lrb/k;->b(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 290
    .line 291
    .line 292
    goto :goto_7

    .line 293
    :goto_8
    return-void

    .line 294
    :catchall_3
    move-exception v0

    .line 295
    monitor-exit v2

    .line 296
    throw v0
.end method

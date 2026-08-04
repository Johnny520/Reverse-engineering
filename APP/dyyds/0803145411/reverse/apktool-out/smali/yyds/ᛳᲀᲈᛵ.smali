.class public final Lyyds/ᛳᲀᲈᛵ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛲᲈᲈ:Ljava/lang/Object;

.field public final synthetic ᛲᛳᛶᲁ:Z

.field public final synthetic ᛶᛷᛲᲁ:I

.field public synthetic ᛷᛲᲈᛱ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᲇᲀ:Ljava/lang/Object;

.field public ᛷᲈᲈᲁ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Landroid/content/Context;ZLyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛶᛷᛲᲁ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛲᲈᲈ:Ljava/lang/Object;

    .line 11
    .line 12
    iput-boolean p5, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(ZLcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛶᛷᛲᲁ:I

    .line 19
    iput-boolean p1, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛳᛶᲁ:Z

    iput-object p2, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    iput-object p4, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛲᲈᲈ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v9, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v10, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    iget-object v4, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛲᲈᲈ:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v11, v4

    .line 17
    check-cast v11, Landroid/content/Context;

    .line 18
    .line 19
    iget v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛱᲈᲁ:I

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    if-ne v0, v2, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    move-object v0, p1

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_0
    const-wide v0, -0x213d8e68a836eL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    move-object v9, v3

    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :try_start_1
    sget-object v0, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 52
    .line 53
    iget-object v3, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v5, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 60
    .line 61
    check-cast v1, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 62
    .line 63
    check-cast v4, Landroid/content/Context;

    .line 64
    .line 65
    iget-boolean v7, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 66
    .line 67
    iput v2, p0, Lyyds/ᛳᲀᲈᛵ;->ᛱᲈᲁ:I

    .line 68
    .line 69
    move-object v2, v5

    .line 70
    move-object v5, v4

    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v6, 0x1

    .line 73
    move-object v8, v3

    .line 74
    move-object v3, v1

    .line 75
    move-object v1, v8

    .line 76
    move-object v8, p0

    .line 77
    invoke-virtual/range {v0 .. v8}, Lyyds/ᛶᛵᛲᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Ljava/lang/Integer;Landroid/content/Context;ZZLyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-ne v0, v10, :cond_2

    .line 82
    .line 83
    move-object v9, v10

    .line 84
    goto/16 :goto_3

    .line 85
    .line 86
    :cond_2
    :goto_0
    check-cast v0, Lyyds/ᲁᛶᲈᲈ;

    .line 87
    .line 88
    iget-object v1, v0, Lyyds/ᲁᛶᲈᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v2, v0, Lyyds/ᲁᛶᲈᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_3

    .line 99
    .line 100
    sget-object v1, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 101
    .line 102
    iget-object v0, v0, Lyyds/ᲁᛶᲈᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v11, v0}, Lyyds/ᛶᛵᛲᛲ;->ᛱᲈᲁ(Landroid/content/Context;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-wide v0, -0x213bce68a836eL

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    const-wide v0, -0x213c1e68a836eL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v2, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_4

    .line 136
    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    const-wide v3, -0x213c5e68a836eL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    check-cast v2, Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :goto_1
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 168
    .line 169
    const-wide v2, -0x213cce68a836eL

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-wide v2, -0x213d1e68a836eL

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 207
    .line 208
    .line 209
    :cond_4
    :goto_2
    sget-object v0, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 210
    .line 211
    invoke-static {v11}, Lyyds/ᛶᛵᛲᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)V

    .line 212
    .line 213
    .line 214
    :goto_3
    return-object v9

    .line 215
    :pswitch_0
    check-cast v4, Lyyds/ᛷᛴᲈᲀ;

    .line 216
    .line 217
    check-cast v1, Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 218
    .line 219
    iget v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛱᲈᲁ:I

    .line 220
    .line 221
    const/4 v5, 0x4

    .line 222
    const/4 v6, 0x3

    .line 223
    const/4 v7, 0x2

    .line 224
    if-eqz v0, :cond_9

    .line 225
    .line 226
    if-eq v0, v2, :cond_8

    .line 227
    .line 228
    if-eq v0, v7, :cond_7

    .line 229
    .line 230
    if-eq v0, v6, :cond_6

    .line 231
    .line 232
    if-ne v0, v5, :cond_5

    .line 233
    .line 234
    iget-object v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 235
    .line 236
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    move-object v10, v0

    .line 240
    move-object v0, p1

    .line 241
    goto/16 :goto_8

    .line 242
    .line 243
    :cond_5
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 244
    .line 245
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    move-object v10, v3

    .line 249
    goto/16 :goto_a

    .line 250
    .line 251
    :cond_6
    iget-object v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lyyds/ᲈᛶᛷᲀ;

    .line 254
    .line 255
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    move-object v2, p1

    .line 259
    goto/16 :goto_7

    .line 260
    .line 261
    :cond_7
    iget-object v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Lyyds/ᲀᲀᛲᛷ;

    .line 264
    .line 265
    iget-object v2, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v2, Lyyds/ᲈᛶᛷᲀ;

    .line 268
    .line 269
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_8
    iget-object v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Lyyds/ᲀᲀᛲᛷ;

    .line 276
    .line 277
    iget-object v2, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v2, Lyyds/ᲈᛶᛷᲀ;

    .line 280
    .line 281
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    move-object v11, v2

    .line 285
    move-object v2, p1

    .line 286
    goto :goto_4

    .line 287
    :cond_9
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    iget-object v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Lyyds/ᲈᛶᛷᲀ;

    .line 293
    .line 294
    iget-boolean v11, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 295
    .line 296
    if-eqz v11, :cond_12

    .line 297
    .line 298
    iput-object v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 299
    .line 300
    sget-object v11, Lyyds/ᲀᲀᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲀᛲᛷ;

    .line 301
    .line 302
    iput-object v11, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 303
    .line 304
    iput v2, p0, Lyyds/ᛳᲀᲈᛵ;->ᛱᲈᲁ:I

    .line 305
    .line 306
    invoke-interface {v0, p0}, Lyyds/ᲈᛶᛷᲀ;->ᛲᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    if-ne v2, v10, :cond_a

    .line 311
    .line 312
    goto/16 :goto_a

    .line 313
    .line 314
    :cond_a
    move-object v12, v11

    .line 315
    move-object v11, v0

    .line 316
    move-object v0, v12

    .line 317
    :goto_4
    check-cast v2, Ljava/lang/Boolean;

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-nez v2, :cond_e

    .line 324
    .line 325
    iget-object v2, v1, Lcom/ss/android/ugc/awemes/WardDatabase;->ᲇᲇᲇᛱ:Lyyds/ᛳᛱᲀᛶ;

    .line 326
    .line 327
    if-nez v2, :cond_b

    .line 328
    .line 329
    move-object v2, v3

    .line 330
    :cond_b
    iput-object v11, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 333
    .line 334
    iput v7, p0, Lyyds/ᛳᲀᲈᛵ;->ᛱᲈᲁ:I

    .line 335
    .line 336
    iget-object v2, v2, Lyyds/ᛳᛱᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 337
    .line 338
    invoke-virtual {v2, p0}, Lyyds/ᛳᲀᛸᛸ;->ᲇᲇᲇᛱ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    if-ne v2, v10, :cond_c

    .line 343
    .line 344
    move-object v9, v2

    .line 345
    :cond_c
    if-ne v9, v10, :cond_d

    .line 346
    .line 347
    goto :goto_a

    .line 348
    :cond_d
    move-object v2, v11

    .line 349
    :goto_5
    move-object v12, v2

    .line 350
    move-object v2, v0

    .line 351
    move-object v0, v12

    .line 352
    goto :goto_6

    .line 353
    :cond_e
    move-object v2, v0

    .line 354
    move-object v0, v11

    .line 355
    :goto_6
    new-instance v7, Lyyds/ᲁᛲᲇᲇ;

    .line 356
    .line 357
    const/4 v9, 0x0

    .line 358
    invoke-direct {v7, v3, v4, v9}, Lyyds/ᲁᛲᲇᲇ;-><init>(Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;I)V

    .line 359
    .line 360
    .line 361
    iput-object v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v3, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 364
    .line 365
    iput v6, p0, Lyyds/ᛳᲀᲈᛵ;->ᛱᲈᲁ:I

    .line 366
    .line 367
    invoke-interface {v0, v2, v7, p0}, Lyyds/ᲈᛶᛷᲀ;->ᲇᲈᛵᛷ(Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛸᲀᛷᛱ;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    if-ne v2, v10, :cond_f

    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_f
    :goto_7
    iput-object v2, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 375
    .line 376
    iput v5, p0, Lyyds/ᛳᲀᲈᛵ;->ᛱᲈᲁ:I

    .line 377
    .line 378
    invoke-interface {v0, p0}, Lyyds/ᲈᛶᛷᲀ;->ᛲᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Boolean;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    if-ne v0, v10, :cond_10

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_10
    move-object v10, v2

    .line 386
    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-nez v0, :cond_13

    .line 393
    .line 394
    iget-object v0, v1, Lcom/ss/android/ugc/awemes/WardDatabase;->ᲇᲇᲇᛱ:Lyyds/ᛳᛱᲀᛶ;

    .line 395
    .line 396
    if-nez v0, :cond_11

    .line 397
    .line 398
    goto :goto_9

    .line 399
    :cond_11
    move-object v3, v0

    .line 400
    :goto_9
    iget-object v0, v3, Lyyds/ᛳᛱᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 401
    .line 402
    iget-object v1, v3, Lyyds/ᛳᛱᲀᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲀᛳ;

    .line 403
    .line 404
    iget-object v2, v3, Lyyds/ᛳᛱᲀᛶ;->ᛶᛷᛲᲁ:Lyyds/ᲁᲀᛳ;

    .line 405
    .line 406
    invoke-virtual {v0, v1, v2}, Lyyds/ᛳᲀᛸᛸ;->ᲀᛲᛳᲀ(Lyyds/ᲁᛶᲁᲀ;Lyyds/ᲁᛶᲁᲀ;)V

    .line 407
    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_12
    check-cast v0, Lyyds/ᛸᛸᲈᛳ;

    .line 411
    .line 412
    invoke-interface {v0}, Lyyds/ᛸᛸᲈᛳ;->ᛵᛸᛸᛷ()Lyyds/ᛱᛵᛷ;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-interface {v4, v0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    :cond_13
    :goto_a
    return-object v10

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛲᲈᲈ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Lyyds/ᛳᲀᲈᛵ;

    .line 11
    .line 12
    iget-object p1, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    iget-object p1, p0, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, p1

    .line 20
    check-cast v5, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 21
    .line 22
    move-object v6, v2

    .line 23
    check-cast v6, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 24
    .line 25
    move-object v7, v1

    .line 26
    check-cast v7, Landroid/content/Context;

    .line 27
    .line 28
    iget-boolean v8, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 29
    .line 30
    move-object v9, p2

    .line 31
    invoke-direct/range {v3 .. v9}, Lyyds/ᛳᲀᲈᛵ;-><init>(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Landroid/content/Context;ZLyyds/ᛲᛱᛶᛸ;)V

    .line 32
    .line 33
    .line 34
    return-object v3

    .line 35
    :pswitch_0
    move-object v9, p2

    .line 36
    new-instance p2, Lyyds/ᛳᲀᲈᛵ;

    .line 37
    .line 38
    check-cast v2, Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 39
    .line 40
    check-cast v1, Lyyds/ᛷᛴᲈᲀ;

    .line 41
    .line 42
    iget-boolean p0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 43
    .line 44
    invoke-direct {p2, p0, v2, v9, v1}, Lyyds/ᛳᲀᲈᛵ;-><init>(ZLcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p2, Lyyds/ᛳᲀᲈᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 48
    .line 49
    return-object p2

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛳᲀᲈᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 9
    .line 10
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᛳᲀᲈᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛳᲀᲈᛵ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛳᲀᲈᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lyyds/ᲈᛶᛷᲀ;

    .line 24
    .line 25
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lyyds/ᛳᲀᲈᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lyyds/ᛳᲀᲈᛵ;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lyyds/ᛳᲀᲈᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

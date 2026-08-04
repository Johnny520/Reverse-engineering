.class public final Lyyds/ᛴᲀᛳᲀ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public ᛲᛳᛶᲁ:I

.field public ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᛲᲈᛱ:Lyyds/ᲀᲈᛶᲈ;

.field public final synthetic ᛷᛵᲇᲀ:Ljava/lang/String;

.field public ᛷᲈᲈᲁ:I


# direct methods
.method public constructor <init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᛲᲈᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᛵᲇᲀ:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᛲᲈᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lyyds/ᛲᛶᲀᛱ;

    .line 6
    .line 7
    iget v1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᲈᲈᲁ:I

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    const/4 v3, 0x3

    .line 11
    const/4 v4, 0x2

    .line 12
    iget-object v5, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᛵᲇᲀ:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    sget-object v8, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 17
    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    if-eq v1, v6, :cond_3

    .line 21
    .line 22
    if-eq v1, v4, :cond_2

    .line 23
    .line 24
    if-eq v1, v3, :cond_1

    .line 25
    .line 26
    if-ne v1, v2, :cond_0

    .line 27
    .line 28
    iget v0, p0, Lyyds/ᛴᲀᛳᲀ;->ᛲᛳᛶᲁ:I

    .line 29
    .line 30
    iget v1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛱᲈᲁ:I

    .line 31
    .line 32
    iget p0, p0, Lyyds/ᛴᲀᛳᲀ;->ᛶᛷᛲᲁ:I

    .line 33
    .line 34
    :try_start_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :catch_0
    move-exception p0

    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_0
    const-wide p0, -0x51790e68a836eL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_1
    iget v1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛱᲈᲁ:I

    .line 57
    .line 58
    iget v3, p0, Lyyds/ᛴᲀᛳᲀ;->ᛶᛷᛲᲁ:I

    .line 59
    .line 60
    :try_start_1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    .line 63
    move v11, v3

    .line 64
    move v3, v1

    .line 65
    move v1, v11

    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_2
    iget v1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛶᛷᛲᲁ:I

    .line 69
    .line 70
    :try_start_2
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :try_start_3
    iput v6, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᲈᲈᲁ:I

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const-wide v9, -0x4f9b3e68a836eL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object v1, v0, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 96
    .line 97
    new-instance v9, Lyyds/ᲀᲁᛳᛳ;

    .line 98
    .line 99
    const/16 v10, 0x9

    .line 100
    .line 101
    invoke-direct {v9, p1, v10, v5}, Lyyds/ᲀᲁᛳᛳ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1, p0, v9, v6, v7}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-ne p1, v8, :cond_5

    .line 109
    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :cond_5
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iput v1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛶᛷᛲᲁ:I

    .line 119
    .line 120
    iput v4, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᲈᲈᲁ:I

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    const-wide v9, -0x4fa15e68a836eL

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget-object v4, v0, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 135
    .line 136
    new-instance v9, Lyyds/ᲀᲁᛳᛳ;

    .line 137
    .line 138
    const/16 v10, 0xd

    .line 139
    .line 140
    invoke-direct {v9, p1, v10, v5}, Lyyds/ᲀᲁᛳᛳ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v4, p0, v9, v6, v7}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-ne p1, v8, :cond_6

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    iput v1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛶᛷᛲᲁ:I

    .line 157
    .line 158
    iput p1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛱᲈᲁ:I

    .line 159
    .line 160
    iput v3, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᲈᲈᲁ:I

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const-wide v3, -0x4fa8ce68a836eL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    iget-object v4, v0, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 175
    .line 176
    new-instance v9, Lyyds/ᲀᲁᛳᛳ;

    .line 177
    .line 178
    const/16 v10, 0xb

    .line 179
    .line 180
    invoke-direct {v9, v3, v10, v5}, Lyyds/ᲀᲁᛳᛳ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v4, p0, v9, v6, v7}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-ne v3, v8, :cond_7

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    move-object v11, v3

    .line 191
    move v3, p1

    .line 192
    move-object p1, v11

    .line 193
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    iput v1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛶᛷᛲᲁ:I

    .line 200
    .line 201
    iput v3, p0, Lyyds/ᛴᲀᛳᲀ;->ᛱᲈᲁ:I

    .line 202
    .line 203
    iput p1, p0, Lyyds/ᛴᲀᛳᲀ;->ᛲᛳᛶᲁ:I

    .line 204
    .line 205
    iput v2, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᲈᲈᲁ:I

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    const-wide v9, -0x4fb05e68a836eL

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    iget-object v0, v0, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 220
    .line 221
    new-instance v4, Lyyds/ᲀᲁᛳᛳ;

    .line 222
    .line 223
    const/16 v9, 0xa

    .line 224
    .line 225
    invoke-direct {v4, v2, v9, v5}, Lyyds/ᲀᲁᛳᛳ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v0, p0, v4, v6, v7}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    if-ne p0, v8, :cond_8

    .line 233
    .line 234
    :goto_3
    return-object v8

    .line 235
    :cond_8
    move v0, p1

    .line 236
    move-object p1, p0

    .line 237
    move p0, v1

    .line 238
    move v1, v3

    .line 239
    :goto_4
    check-cast p1, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    new-instance v2, Ljava/lang/Integer;

    .line 246
    .line 247
    invoke-direct {v2, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 248
    .line 249
    .line 250
    new-instance p0, Ljava/lang/Integer;

    .line 251
    .line 252
    invoke-direct {p0, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 253
    .line 254
    .line 255
    new-instance v1, Ljava/lang/Integer;

    .line 256
    .line 257
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 258
    .line 259
    .line 260
    new-instance v0, Ljava/lang/Integer;

    .line 261
    .line 262
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 263
    .line 264
    .line 265
    filled-new-array {v2, p0, v1, v0}, [Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-static {p0}, Lyyds/ᲈᛸᲁᛶ;->ᲇᛱᛲ([Ljava/lang/Object;)Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 273
    return-object p0

    .line 274
    :goto_5
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 275
    .line 276
    const-wide v0, -0x5178be68a836eL

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    new-instance p0, Ljava/lang/Integer;

    .line 289
    .line 290
    invoke-direct {p0, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 291
    .line 292
    .line 293
    new-instance p1, Ljava/lang/Integer;

    .line 294
    .line 295
    invoke-direct {p1, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 296
    .line 297
    .line 298
    new-instance v0, Ljava/lang/Integer;

    .line 299
    .line 300
    invoke-direct {v0, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 301
    .line 302
    .line 303
    new-instance v1, Ljava/lang/Integer;

    .line 304
    .line 305
    invoke-direct {v1, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 306
    .line 307
    .line 308
    filled-new-array {p0, p1, v0, v1}, [Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    invoke-static {p0}, Lyyds/ᲈᛸᲁᛶ;->ᲇᛱᛲ([Ljava/lang/Object;)Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 1

    .line 1
    new-instance p1, Lyyds/ᛴᲀᛳᲀ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᛲᲈᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛴᲀᛳᲀ;->ᛷᛵᲇᲀ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lyyds/ᛴᲀᛳᲀ;-><init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᲀᛳᲀ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᛴᲀᛳᲀ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛴᲀᛳᲀ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

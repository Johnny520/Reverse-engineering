.class public final Lyyds/ᛸᛲᛲᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᲇᛴᲇᛶ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛸᛲᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛸᛲᛲᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛴᲇᛶ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛸᛲᛲᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᛸᛲᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const-string v2, "Unsupported member type: "

    .line 6
    .line 7
    const-class v4, Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    const-class v6, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    const-class v7, Ljava/lang/reflect/Field;

    .line 12
    .line 13
    const/4 v9, 0x6

    .line 14
    const/4 v10, 0x1

    .line 15
    sget-object v11, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 16
    .line 17
    const-string v12, " because got an exception."

    .line 18
    .line 19
    sget-object v13, Lyyds/ᛲᛶᲇ;->ᛲᲈᲁ:Lyyds/ᛴᛲᛷᛸ;

    .line 20
    .line 21
    iget-object v14, v0, Lyyds/ᛸᛲᛲᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;

    .line 22
    .line 23
    iget-object v0, v0, Lyyds/ᛸᛲᛲᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛴᲇᛶ;

    .line 24
    .line 25
    const/4 v15, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Class;

    .line 32
    .line 33
    move-object v3, v0

    .line 34
    check-cast v3, Lyyds/ᛴᛲᛶᛶ;

    .line 35
    .line 36
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lyyds/ᲀᲀᛷᛸ;->ᛷᛶᛷᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object v0, v1

    .line 55
    :goto_0
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    sget-object v16, Lyyds/ᲀᛵᛲᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 62
    .line 63
    new-instance v5, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v8, "Failed to get declared fields in "

    .line 66
    .line 67
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v5, v1}, Lyyds/ᲀᛵᛲᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    instance-of v1, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 84
    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    move-object v0, v15

    .line 88
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 89
    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    move-object v11, v0

    .line 94
    :goto_1
    new-instance v0, Lyyds/ᛳᛳᲀᲀ;

    .line 95
    .line 96
    invoke-direct {v0, v10, v11}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v3, v14}, Lyyds/ᛲᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛳᛳᲀᲀ;Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;)Lyyds/ᛲᲈᲁᛱ;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Lyyds/ᲈᲈᲁᛴ;

    .line 104
    .line 105
    const/4 v5, 0x5

    .line 106
    invoke-direct {v1, v5}, Lyyds/ᲈᲈᲁᛴ;-><init>(I)V

    .line 107
    .line 108
    .line 109
    const-string v8, "isEnumConstant"

    .line 110
    .line 111
    invoke-static {v0, v14, v8, v15, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v1, Lyyds/ᲈᲈᲁᛴ;

    .line 116
    .line 117
    invoke-direct {v1, v9}, Lyyds/ᲈᲈᲁᛴ;-><init>(I)V

    .line 118
    .line 119
    .line 120
    const-string v8, "isEnumConstantNot"

    .line 121
    .line 122
    invoke-static {v0, v14, v8, v15, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, v3, Lyyds/ᛴᛲᛶᛶ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 127
    .line 128
    new-instance v8, Lyyds/ᲇᛲᲇ;

    .line 129
    .line 130
    const/16 v9, 0x11

    .line 131
    .line 132
    invoke-direct {v8, v14, v9}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 133
    .line 134
    .line 135
    const-string v9, "type"

    .line 136
    .line 137
    invoke-static {v0, v14, v9, v1, v8}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v1, v3, Lyyds/ᛴᛲᛶᛶ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 142
    .line 143
    new-instance v3, Lyyds/ᲀᛲᛱᲈ;

    .line 144
    .line 145
    const/16 v8, 0x8

    .line 146
    .line 147
    invoke-direct {v3, v8}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 148
    .line 149
    .line 150
    const-string v8, "typeCondition"

    .line 151
    .line 152
    invoke-static {v0, v14, v8, v1, v3}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 157
    .line 158
    const/16 v3, 0x9

    .line 159
    .line 160
    invoke-direct {v1, v3}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 161
    .line 162
    .line 163
    const-string v3, "genericType"

    .line 164
    .line 165
    invoke-static {v0, v14, v3, v15, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 170
    .line 171
    const/16 v3, 0xa

    .line 172
    .line 173
    invoke-direct {v1, v3}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 174
    .line 175
    .line 176
    const-string v3, "genericTypeCondition"

    .line 177
    .line 178
    invoke-static {v0, v14, v3, v15, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v7}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-static {v6}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v1, v3}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_3

    .line 195
    .line 196
    new-instance v1, Lyyds/ᲇᲀᲀᛶ;

    .line 197
    .line 198
    const/4 v2, 0x3

    .line 199
    invoke-direct {v1, v14, v2}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 200
    .line 201
    .line 202
    new-instance v2, Lyyds/ᛵᛶᲀᛶ;

    .line 203
    .line 204
    invoke-direct {v2, v0, v1}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_3
    invoke-static {v4}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v1, v3}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_4

    .line 217
    .line 218
    new-instance v1, Lyyds/ᲇᲀᲀᛶ;

    .line 219
    .line 220
    const/4 v2, 0x4

    .line 221
    invoke-direct {v1, v14, v2}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 222
    .line 223
    .line 224
    new-instance v2, Lyyds/ᛵᛶᲀᛶ;

    .line 225
    .line 226
    invoke-direct {v2, v0, v1}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_4
    invoke-static {v7}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v1, v3}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_5

    .line 239
    .line 240
    new-instance v1, Lyyds/ᲇᲀᲀᛶ;

    .line 241
    .line 242
    invoke-direct {v1, v14, v5}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 243
    .line 244
    .line 245
    new-instance v2, Lyyds/ᛵᛶᲀᛶ;

    .line 246
    .line 247
    invoke-direct {v2, v0, v1}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 248
    .line 249
    .line 250
    :goto_2
    invoke-static {v2}, Lyyds/ᛷᛴᛳᛶ;->ᛲᛳᛴᛸ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    goto :goto_3

    .line 255
    :cond_5
    invoke-static {v0, v2}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    :goto_3
    return-object v15

    .line 259
    :pswitch_0
    move-object/from16 v1, p1

    .line 260
    .line 261
    check-cast v1, Ljava/lang/Class;

    .line 262
    .line 263
    move-object v3, v0

    .line 264
    check-cast v3, Lyyds/ᛵᲀᲀᛶ;

    .line 265
    .line 266
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v0}, Lyyds/ᲀᲀᛷᛸ;->ᛷᛶᛷᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 277
    goto :goto_4

    .line 278
    :catchall_1
    move-exception v0

    .line 279
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 280
    .line 281
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    move-object v0, v1

    .line 285
    :goto_4
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    if-eqz v1, :cond_6

    .line 290
    .line 291
    sget-object v5, Lyyds/ᲀᛵᛲᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 292
    .line 293
    new-instance v5, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v8, "Failed to get declared methods in "

    .line 296
    .line 297
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-static {v5, v1}, Lyyds/ᲀᛵᛲᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    :cond_6
    instance-of v1, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 314
    .line 315
    if-eqz v1, :cond_7

    .line 316
    .line 317
    move-object v0, v15

    .line 318
    :cond_7
    check-cast v0, Ljava/util/List;

    .line 319
    .line 320
    if-nez v0, :cond_8

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_8
    move-object v11, v0

    .line 324
    :goto_5
    new-instance v0, Lyyds/ᛳᛳᲀᲀ;

    .line 325
    .line 326
    invoke-direct {v0, v10, v11}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v0, v3, v14}, Lyyds/ᛲᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛳᛳᲀᲀ;Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;)Lyyds/ᛲᲈᲁᛱ;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {v0, v3, v14}, Lyyds/ᛲᛶᲇ;->ᛶᛷᛲᲁ(Lyyds/ᛲᲈᲁᛱ;Lyyds/ᲁᛳᛶᛶ;Lyyds/ᛴᛸᛲᛳ;)Lyyds/ᛲᲈᲁᛱ;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iget-object v1, v3, Lyyds/ᛵᲀᲀᛶ;->ᛱᛳᛶᛳ:Ljava/lang/Object;

    .line 338
    .line 339
    new-instance v5, Lyyds/ᲇᛲᲇ;

    .line 340
    .line 341
    const/4 v8, 0x2

    .line 342
    invoke-direct {v5, v14, v8}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 343
    .line 344
    .line 345
    const-string v10, "returnType"

    .line 346
    .line 347
    invoke-static {v0, v14, v10, v1, v5}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iget-object v1, v3, Lyyds/ᛵᲀᲀᛶ;->ᛸᛸᛷᛱ:Lyyds/ᛳᛱᛶᛲ;

    .line 352
    .line 353
    new-instance v3, Lyyds/ᲀᛲᛱᲈ;

    .line 354
    .line 355
    const/16 v5, 0x10

    .line 356
    .line 357
    invoke-direct {v3, v5}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 358
    .line 359
    .line 360
    const-string v5, "returnTypeCondition"

    .line 361
    .line 362
    invoke-static {v0, v14, v5, v1, v3}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 367
    .line 368
    const/16 v3, 0x17

    .line 369
    .line 370
    invoke-direct {v1, v3}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 371
    .line 372
    .line 373
    const-string v3, "isBridge"

    .line 374
    .line 375
    invoke-static {v0, v14, v3, v15, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    new-instance v1, Lyyds/ᲈᲈᲁᛴ;

    .line 380
    .line 381
    invoke-direct {v1, v8}, Lyyds/ᲈᲈᲁᛴ;-><init>(I)V

    .line 382
    .line 383
    .line 384
    const-string v3, "isBridgeNot"

    .line 385
    .line 386
    invoke-static {v0, v14, v3, v15, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    new-instance v1, Lyyds/ᲈᲈᲁᛴ;

    .line 391
    .line 392
    const/4 v3, 0x3

    .line 393
    invoke-direct {v1, v3}, Lyyds/ᲈᲈᲁᛴ;-><init>(I)V

    .line 394
    .line 395
    .line 396
    const-string v3, "isDefault"

    .line 397
    .line 398
    invoke-static {v0, v14, v3, v15, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    new-instance v1, Lyyds/ᲈᲈᲁᛴ;

    .line 403
    .line 404
    const/4 v3, 0x4

    .line 405
    invoke-direct {v1, v3}, Lyyds/ᲈᲈᲁᛴ;-><init>(I)V

    .line 406
    .line 407
    .line 408
    const-string v3, "isDefaultNot"

    .line 409
    .line 410
    invoke-static {v0, v14, v3, v15, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-static {v6}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-static {v6}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-virtual {v1, v3}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_9

    .line 427
    .line 428
    new-instance v1, Lyyds/ᲇᲀᲀᛶ;

    .line 429
    .line 430
    invoke-direct {v1, v14, v9}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 431
    .line 432
    .line 433
    new-instance v2, Lyyds/ᛵᛶᲀᛶ;

    .line 434
    .line 435
    invoke-direct {v2, v0, v1}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 436
    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_9
    invoke-static {v4}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-virtual {v1, v3}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    if-eqz v3, :cond_a

    .line 448
    .line 449
    new-instance v1, Lyyds/ᲇᲀᲀᛶ;

    .line 450
    .line 451
    const/4 v2, 0x7

    .line 452
    invoke-direct {v1, v14, v2}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 453
    .line 454
    .line 455
    new-instance v2, Lyyds/ᛵᛶᲀᛶ;

    .line 456
    .line 457
    invoke-direct {v2, v0, v1}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 458
    .line 459
    .line 460
    goto :goto_6

    .line 461
    :cond_a
    invoke-static {v7}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-virtual {v1, v3}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    if-eqz v1, :cond_b

    .line 470
    .line 471
    new-instance v1, Lyyds/ᲇᲀᲀᛶ;

    .line 472
    .line 473
    const/16 v8, 0x8

    .line 474
    .line 475
    invoke-direct {v1, v14, v8}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 476
    .line 477
    .line 478
    new-instance v2, Lyyds/ᛵᛶᲀᛶ;

    .line 479
    .line 480
    invoke-direct {v2, v0, v1}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 481
    .line 482
    .line 483
    :goto_6
    invoke-static {v2}, Lyyds/ᛷᛴᛳᛶ;->ᛲᛳᛴᛸ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v15

    .line 487
    goto :goto_7

    .line 488
    :cond_b
    invoke-static {v0, v2}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    :goto_7
    return-object v15

    .line 492
    nop

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

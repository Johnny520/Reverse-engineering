.class public Lbsh/commands/dir;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v10, "Nov"

    .line 2
    .line 3
    const-string v11, "Dec"

    .line 4
    .line 5
    const-string v0, "Jan"

    .line 6
    .line 7
    const-string v1, "Feb"

    .line 8
    .line 9
    const-string v2, "Mar"

    .line 10
    .line 11
    const-string v3, "Apr"

    .line 12
    .line 13
    const-string v4, "May"

    .line 14
    .line 15
    const-string v5, "Jun"

    .line 16
    .line 17
    const-string v6, "Jul"

    .line 18
    .line 19
    const-string v7, "Aug"

    .line 20
    .line 21
    const-string v8, "Sep"

    .line 22
    .line 23
    const-string v9, "Oct"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lbsh/commands/dir;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public static invoke(Lbsh/Interpreter;Lbsh/CallStack;)V
    .locals 1

    .line 331
    const-string v0, "."

    .line 332
    invoke-static {p0, p1, v0}, Lbsh/commands/dir;->invoke(Lbsh/Interpreter;Lbsh/CallStack;Ljava/lang/String;)V

    return-void
.end method

.method public static invoke(Lbsh/Interpreter;Lbsh/CallStack;Ljava/lang/String;)V
    .locals 10

    .line 1
    :try_start_0
    invoke-virtual {p0, p2}, Lbsh/Interpreter;->pathToFile(Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p2}, Lbsh/Interpreter;->pathToFile(Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_a

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "\'"

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p2, "\' is not a directory"

    .line 44
    .line 45
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p0, p2}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const/4 v0, 0x0

    .line 60
    if-nez p2, :cond_2

    .line 61
    .line 62
    new-array p2, v0, [Ljava/lang/String;

    .line 63
    .line 64
    :cond_2
    invoke-static {p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move v1, v0

    .line 68
    :goto_0
    array-length v2, p2

    .line 69
    if-ge v1, v2, :cond_9

    .line 70
    .line 71
    new-instance v2, Ljava/io/File;

    .line 72
    .line 73
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    aget-object v4, p2, v1

    .line 83
    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    const-string v5, "-"

    .line 104
    .line 105
    if-eqz v4, :cond_3

    .line 106
    .line 107
    const-string v4, "r"

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move-object v4, v5

    .line 111
    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/io/File;->canWrite()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_4

    .line 119
    .line 120
    const-string v5, "w"

    .line 121
    .line 122
    :cond_4
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v4, "_ "

    .line 126
    .line 127
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    new-instance v4, Ljava/util/Date;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 133
    .line 134
    .line 135
    move-result-wide v5

    .line 136
    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 137
    .line 138
    .line 139
    new-instance v5, Ljava/util/GregorianCalendar;

    .line 140
    .line 141
    invoke-direct {v5}, Ljava/util/GregorianCalendar;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v4}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 145
    .line 146
    .line 147
    const/4 v4, 0x5

    .line 148
    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    new-instance v6, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const/4 v7, 0x2

    .line 158
    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    sget-object v7, Lbsh/commands/dir;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 163
    .line 164
    aget-object v5, v7, v5

    .line 165
    .line 166
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v5, " "

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const/16 v6, 0xa

    .line 185
    .line 186
    if-ge v4, v6, :cond_5

    .line 187
    .line 188
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    :cond_5
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    new-instance v4, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    move v6, v0

    .line 200
    :goto_2
    const/16 v7, 0x8

    .line 201
    .line 202
    if-ge v6, v7, :cond_6

    .line 203
    .line 204
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    add-int/lit8 v6, v6, 0x1

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_6
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 211
    .line 212
    .line 213
    move-result-wide v8

    .line 214
    invoke-virtual {v4, v0, v8, v9}, Ljava/lang/StringBuilder;->insert(IJ)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-virtual {v6, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    const/4 v7, -0x1

    .line 229
    if-eq v6, v7, :cond_7

    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4, v0, v7}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    :cond_7
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    new-instance v4, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-eqz v2, :cond_8

    .line 276
    .line 277
    const-string v2, "/"

    .line 278
    .line 279
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    :cond_8
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {p0, v2}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    add-int/lit8 v1, v1, 0x1

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :cond_9
    return-void

    .line 294
    :cond_a
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    const-string p2, "Can\'t read "

    .line 297
    .line 298
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :catch_0
    move-exception p1

    .line 313
    new-instance p2, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string v0, "error reading path: "

    .line 316
    .line 317
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    return-void
.end method

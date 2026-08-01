.class public Lcom/android/dx/command/dump/Main;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final parsedArgs:Lcom/android/dx/command/dump/Args;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/command/dump/Args;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/command/dump/Args;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 10
    .line 11
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/command/dump/Main;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/command/dump/Main;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/android/dx/command/dump/Main;->run([Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private processOne(Ljava/lang/String;[B)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/android/dx/command/dump/Args;->dotDump:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2, p1, p0}, Lcom/android/dx/command/dump/DotDumper;->dump([BLjava/lang/String;Lcom/android/dx/command/dump/Args;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/android/dx/command/dump/Args;->basicBlocks:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 17
    .line 18
    invoke-static {p2, v0, p1, v1, p0}, Lcom/android/dx/command/dump/BlockDumper;->dump([BLjava/io/PrintStream;Ljava/lang/String;ZLcom/android/dx/command/dump/Args;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-boolean v0, p0, Lcom/android/dx/command/dump/Args;->ropBlocks:Z

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p2, v0, p1, v1, p0}, Lcom/android/dx/command/dump/BlockDumper;->dump([BLjava/io/PrintStream;Ljava/lang/String;ZLcom/android/dx/command/dump/Args;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    iget-boolean v0, p0, Lcom/android/dx/command/dump/Args;->ssaBlocks:Z

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iput-boolean v1, p0, Lcom/android/dx/command/dump/Args;->optimize:Z

    .line 38
    .line 39
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 40
    .line 41
    invoke-static {p2, v0, p1, p0}, Lcom/android/dx/command/dump/SsaDumper;->dump([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 46
    .line 47
    invoke-static {p2, v0, p1, p0}, Lcom/android/dx/command/dump/ClassDumper;->dump([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private run([Ljava/lang/String;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    const-string v2, "usage"

    .line 4
    .line 5
    if-ge v0, v1, :cond_c

    .line 6
    .line 7
    aget-object v1, p1, v0

    .line 8
    .line 9
    const-string v3, "--"

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_c

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    const-string v3, "--bytes"

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 35
    .line 36
    iput-boolean v4, v1, Lcom/android/dx/command/dump/Args;->rawBytes:Z

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_1
    const-string v3, "--basic-blocks"

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 49
    .line 50
    iput-boolean v4, v1, Lcom/android/dx/command/dump/Args;->basicBlocks:Z

    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :cond_2
    const-string v3, "--rop-blocks"

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    iget-object v1, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 63
    .line 64
    iput-boolean v4, v1, Lcom/android/dx/command/dump/Args;->ropBlocks:Z

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_3
    const-string v3, "--optimize"

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    iget-object v1, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 77
    .line 78
    iput-boolean v4, v1, Lcom/android/dx/command/dump/Args;->optimize:Z

    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :cond_4
    const-string v3, "--ssa-blocks"

    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    iget-object v1, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 91
    .line 92
    iput-boolean v4, v1, Lcom/android/dx/command/dump/Args;->ssaBlocks:Z

    .line 93
    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :cond_5
    const-string v3, "--ssa-step="

    .line 97
    .line 98
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const/16 v5, 0x3d

    .line 103
    .line 104
    if-eqz v3, :cond_6

    .line 105
    .line 106
    iget-object v2, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 107
    .line 108
    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    add-int/2addr v3, v4

    .line 113
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v1, v2, Lcom/android/dx/command/dump/Args;->ssaStep:Ljava/lang/String;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    const-string v3, "--debug"

    .line 121
    .line 122
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_7

    .line 127
    .line 128
    iget-object v1, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 129
    .line 130
    iput-boolean v4, v1, Lcom/android/dx/command/dump/Args;->debug:Z

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_7
    const-string v3, "--dot"

    .line 134
    .line 135
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_8

    .line 140
    .line 141
    iget-object v1, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 142
    .line 143
    iput-boolean v4, v1, Lcom/android/dx/command/dump/Args;->dotDump:Z

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_8
    const-string v3, "--strict"

    .line 147
    .line 148
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_9

    .line 153
    .line 154
    iget-object v1, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 155
    .line 156
    iput-boolean v4, v1, Lcom/android/dx/command/dump/Args;->strictParse:Z

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_9
    const-string v3, "--width="

    .line 160
    .line 161
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_a

    .line 166
    .line 167
    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    add-int/2addr v2, v4

    .line 172
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget-object v2, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 177
    .line 178
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    iput v1, v2, Lcom/android/dx/command/dump/Args;->width:I

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_a
    const-string v3, "--method="

    .line 186
    .line 187
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_b

    .line 192
    .line 193
    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    add-int/2addr v2, v4

    .line 198
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-object v2, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 203
    .line 204
    iput-object v1, v2, Lcom/android/dx/command/dump/Args;->method:Ljava/lang/String;

    .line 205
    .line 206
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_b
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 211
    .line 212
    const-string p1, "unknown option: "

    .line 213
    .line 214
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v2}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_c
    :goto_2
    array-length v1, p1

    .line 226
    if-eq v0, v1, :cond_10

    .line 227
    .line 228
    :goto_3
    array-length v1, p1

    .line 229
    if-ge v0, v1, :cond_f

    .line 230
    .line 231
    :try_start_0
    aget-object v1, p1, v0

    .line 232
    .line 233
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 234
    .line 235
    new-instance v3, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const-string v4, "reading "

    .line 241
    .line 242
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v4, "..."

    .line 249
    .line 250
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    new-instance v2, Ljava/io/File;

    .line 261
    .line 262
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世哲楪兰苏(Ljava/io/File;)[B

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const-string v3, ".class"

    .line 270
    .line 271
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v3
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 275
    if-nez v3, :cond_d

    .line 276
    .line 277
    :try_start_1
    new-instance v3, Ljava/lang/String;

    .line 278
    .line 279
    const-string v4, "utf-8"

    .line 280
    .line 281
    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 282
    .line 283
    .line 284
    :try_start_2
    invoke-static {v3}, Lcom/android/dx/util/HexParser;->parse(Ljava/lang/String;)[B

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    goto :goto_4

    .line 289
    :catch_0
    move-exception v1

    .line 290
    goto :goto_5

    .line 291
    :catch_1
    move-exception v1

    .line 292
    new-instance v2, Ljava/lang/RuntimeException;

    .line 293
    .line 294
    const-string v3, "shouldn\'t happen"

    .line 295
    .line 296
    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    throw v2

    .line 300
    :cond_d
    :goto_4
    invoke-direct {p0, v1, v2}, Lcom/android/dx/command/dump/Main;->processOne(Ljava/lang/String;[B)V
    :try_end_2
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_2 .. :try_end_2} :catch_0

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :goto_5
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 305
    .line 306
    const-string v3, "\ntrouble parsing:"

    .line 307
    .line 308
    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    iget-object v2, p0, Lcom/android/dx/command/dump/Main;->parsedArgs:Lcom/android/dx/command/dump/Args;

    .line 312
    .line 313
    iget-boolean v2, v2, Lcom/android/dx/command/dump/Args;->debug:Z

    .line 314
    .line 315
    if-eqz v2, :cond_e

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 318
    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_e
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 322
    .line 323
    invoke-virtual {v1, v2}, Lcom/android/dex/util/ExceptionWithContext;->printContext(Ljava/io/PrintStream;)V

    .line 324
    .line 325
    .line 326
    :goto_6
    add-int/lit8 v0, v0, 0x1

    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_f
    return-void

    .line 330
    :cond_10
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 331
    .line 332
    const-string p1, "no input files specified"

    .line 333
    .line 334
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-static {v2}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    return-void
.end method

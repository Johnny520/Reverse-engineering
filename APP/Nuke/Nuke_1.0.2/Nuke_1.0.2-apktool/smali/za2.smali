.class public final Lza2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:I

.field public final b:Lo43;

.field public final c:Ld63;

.field public final d:Ld63;

.field public final e:I

.field public final f:Z

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILo43;Ld63;ILjava/lang/String;)V
    .locals 8

    .line 77
    sget-object v4, Lwu2;->j:Lwu2;

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lza2;-><init>(ILo43;Ld63;Ld63;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILo43;Ld63;Ld63;IZLjava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p2, :cond_5

    .line 6
    .line 7
    if-eqz p3, :cond_4

    .line 8
    .line 9
    if-eqz p4, :cond_3

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-lt p5, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x6

    .line 15
    if-gt p5, v1, :cond_2

    .line 16
    .line 17
    move-object v2, p4

    .line 18
    check-cast v2, Lkj0;

    .line 19
    .line 20
    iget-object v2, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 21
    .line 22
    array-length v2, v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    if-ne p5, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "exceptions / branchingness mismatch"

    .line 29
    .line 30
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_1
    :goto_0
    iput p1, p0, Lza2;->a:I

    .line 35
    .line 36
    iput-object p2, p0, Lza2;->b:Lo43;

    .line 37
    .line 38
    iput-object p3, p0, Lza2;->c:Ld63;

    .line 39
    .line 40
    iput-object p4, p0, Lza2;->d:Ld63;

    .line 41
    .line 42
    iput p5, p0, Lza2;->e:I

    .line 43
    .line 44
    iput-boolean p6, p0, Lza2;->f:Z

    .line 45
    .line 46
    iput-object p7, p0, Lza2;->g:Ljava/lang/String;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    const-string p0, "invalid branchingness: "

    .line 50
    .line 51
    invoke-static {p0, p5}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_3
    const-string p0, "exceptions == null"

    .line 60
    .line 61
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_4
    const-string p0, "sources == null"

    .line 66
    .line 67
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_5
    const-string p0, "result == null"

    .line 72
    .line 73
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0
.end method

.method public constructor <init>(ILo43;Ld63;Ljava/lang/String;)V
    .locals 8

    .line 78
    sget-object v4, Lwu2;->j:Lwu2;

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lza2;-><init>(ILo43;Ld63;Ld63;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILwu2;Ld63;)V
    .locals 8

    .line 79
    sget-object v2, Lo43;->v:Lo43;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v5, 0x6

    move-object v0, p0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v7}, Lza2;-><init>(ILo43;Ld63;Ld63;IZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lza2;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lza2;

    .line 10
    .line 11
    iget v0, p0, Lza2;->a:I

    .line 12
    .line 13
    iget v1, p1, Lza2;->a:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    iget v0, p0, Lza2;->e:I

    .line 18
    .line 19
    iget v1, p1, Lza2;->e:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lza2;->b:Lo43;

    .line 24
    .line 25
    iget-object v1, p1, Lza2;->b:Lo43;

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lza2;->c:Ld63;

    .line 30
    .line 31
    iget-object v1, p1, Lza2;->c:Ld63;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object p0, p0, Lza2;->d:Ld63;

    .line 40
    .line 41
    iget-object p1, p1, Lza2;->d:Ld63;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    :goto_0
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lza2;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    iget v2, p0, Lza2;->e:I

    .line 7
    .line 8
    add-int/2addr v0, v2

    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lza2;->b:Lo43;

    .line 11
    .line 12
    iget-object v2, v2, Lo43;->h:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lza2;->c:Ld63;

    .line 19
    .line 20
    check-cast v2, Lkj0;

    .line 21
    .line 22
    iget-object v2, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object p0, p0, Lza2;->d:Ld63;

    .line 31
    .line 32
    check-cast p0, Lkj0;

    .line 33
    .line 34
    iget-object p0, p0, Lkj0;->i:[Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v2

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "Rop{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lza2;->a:I

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    :pswitch_0
    invoke-static {v1}, Lpp0;->I(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "unknown-"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :pswitch_1
    const-string v1, "invoke-custom"

    .line 31
    .line 32
    goto/16 :goto_0

    .line 33
    .line 34
    :pswitch_2
    const-string v1, "invoke-polymorphic"

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :pswitch_3
    const-string v1, "fill-array-data"

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :pswitch_4
    const-string v1, "move-result-pseudo"

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :pswitch_5
    const-string v1, "move-result"

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :pswitch_6
    const-string v1, "invoke-interface"

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :pswitch_7
    const-string v1, "invoke-direct"

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :pswitch_8
    const-string v1, "invoke-super"

    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :pswitch_9
    const-string v1, "invoke-virtual"

    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :pswitch_a
    const-string v1, "invoke-static"

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :pswitch_b
    const-string v1, "put-static"

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :pswitch_c
    const-string v1, "put-field"

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :pswitch_d
    const-string v1, "get-static"

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :pswitch_e
    const-string v1, "get-field"

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :pswitch_f
    const-string v1, "instance-of"

    .line 87
    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :pswitch_10
    const-string v1, "check-cast"

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :pswitch_11
    const-string v1, "filled-new-array"

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :pswitch_12
    const-string v1, "new-array"

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :pswitch_13
    const-string v1, "new-instance"

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :pswitch_14
    const-string v1, "aput"

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :pswitch_15
    const-string v1, "aget"

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :pswitch_16
    const-string v1, "monitor-exit"

    .line 115
    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    :pswitch_17
    const-string v1, "monitor-enter"

    .line 119
    .line 120
    goto/16 :goto_0

    .line 121
    .line 122
    :pswitch_18
    const-string v1, "throw"

    .line 123
    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    :pswitch_19
    const-string v1, "array-length"

    .line 127
    .line 128
    goto/16 :goto_0

    .line 129
    .line 130
    :pswitch_1a
    const-string v1, "return"

    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :pswitch_1b
    const-string v1, "to-short"

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :pswitch_1c
    const-string v1, "to-char"

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :pswitch_1d
    const-string v1, "to-byte"

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :pswitch_1e
    const-string v1, "conv"

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :pswitch_1f
    const-string v1, "cmpg"

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :pswitch_20
    const-string v1, "cmpl"

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :pswitch_21
    const-string v1, "not"

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :pswitch_22
    const-string v1, "ushr"

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :pswitch_23
    const-string v1, "shr"

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :pswitch_24
    const-string v1, "shl"

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :pswitch_25
    const-string v1, "xor"

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :pswitch_26
    const-string v1, "or"

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :pswitch_27
    const-string v1, "and"

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :pswitch_28
    const-string v1, "neg"

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :pswitch_29
    const-string v1, "rem"

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :pswitch_2a
    const-string v1, "div"

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :pswitch_2b
    const-string v1, "mul"

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :pswitch_2c
    const-string v1, "sub"

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :pswitch_2d
    const-string v1, "add"

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :pswitch_2e
    const-string v1, "switch"

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :pswitch_2f
    const-string v1, "if-gt"

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :pswitch_30
    const-string v1, "if-le"

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :pswitch_31
    const-string v1, "if-ge"

    .line 207
    .line 208
    goto :goto_0

    .line 209
    :pswitch_32
    const-string v1, "if-lt"

    .line 210
    .line 211
    goto :goto_0

    .line 212
    :pswitch_33
    const-string v1, "if-ne"

    .line 213
    .line 214
    goto :goto_0

    .line 215
    :pswitch_34
    const-string v1, "if-eq"

    .line 216
    .line 217
    goto :goto_0

    .line 218
    :pswitch_35
    const-string v1, "goto"

    .line 219
    .line 220
    goto :goto_0

    .line 221
    :pswitch_36
    const-string v1, "const"

    .line 222
    .line 223
    goto :goto_0

    .line 224
    :pswitch_37
    const-string v1, "move-exception"

    .line 225
    .line 226
    goto :goto_0

    .line 227
    :pswitch_38
    const-string v1, "move-param"

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :pswitch_39
    const-string v1, "move"

    .line 231
    .line 232
    goto :goto_0

    .line 233
    :pswitch_3a
    const-string v1, "nop"

    .line 234
    .line 235
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    sget-object v1, Lo43;->v:Lo43;

    .line 239
    .line 240
    const-string v2, " ."

    .line 241
    .line 242
    const-string v3, " "

    .line 243
    .line 244
    iget-object v4, p0, Lza2;->b:Lo43;

    .line 245
    .line 246
    if-eq v4, v1, :cond_0

    .line 247
    .line 248
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    :goto_1
    const-string v1, " <-"

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    iget-object v1, p0, Lza2;->c:Ld63;

    .line 264
    .line 265
    move-object v4, v1

    .line 266
    check-cast v4, Lkj0;

    .line 267
    .line 268
    iget-object v4, v4, Lkj0;->i:[Ljava/lang/Object;

    .line 269
    .line 270
    array-length v4, v4

    .line 271
    const/16 v5, 0x20

    .line 272
    .line 273
    const/4 v6, 0x0

    .line 274
    if-nez v4, :cond_1

    .line 275
    .line 276
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_1
    move v2, v6

    .line 281
    :goto_2
    if-ge v2, v4, :cond_2

    .line 282
    .line 283
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-interface {v1, v2}, Ld63;->getType(I)Lo43;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    add-int/lit8 v2, v2, 0x1

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_2
    :goto_3
    iget-boolean v1, p0, Lza2;->f:Z

    .line 297
    .line 298
    if-eqz v1, :cond_3

    .line 299
    .line 300
    const-string v1, " call"

    .line 301
    .line 302
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    :cond_3
    iget-object v1, p0, Lza2;->d:Ld63;

    .line 306
    .line 307
    move-object v2, v1

    .line 308
    check-cast v2, Lkj0;

    .line 309
    .line 310
    iget-object v2, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 311
    .line 312
    array-length v2, v2

    .line 313
    if-eqz v2, :cond_5

    .line 314
    .line 315
    const-string p0, " throws"

    .line 316
    .line 317
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    :goto_4
    if-ge v6, v2, :cond_b

    .line 321
    .line 322
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-interface {v1, v6}, Ld63;->getType(I)Lo43;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    sget-object v3, Lo43;->D:Lo43;

    .line 330
    .line 331
    if-ne p0, v3, :cond_4

    .line 332
    .line 333
    const-string p0, "<any>"

    .line 334
    .line 335
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_4
    invoke-interface {v1, v6}, Ld63;->getType(I)Lo43;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_5
    const/4 v1, 0x1

    .line 350
    iget p0, p0, Lza2;->e:I

    .line 351
    .line 352
    if-eq p0, v1, :cond_a

    .line 353
    .line 354
    const/4 v1, 0x2

    .line 355
    if-eq p0, v1, :cond_9

    .line 356
    .line 357
    const/4 v1, 0x3

    .line 358
    if-eq p0, v1, :cond_8

    .line 359
    .line 360
    const/4 v1, 0x4

    .line 361
    if-eq p0, v1, :cond_7

    .line 362
    .line 363
    const/4 v1, 0x5

    .line 364
    if-eq p0, v1, :cond_6

    .line 365
    .line 366
    invoke-static {p0}, Lpp0;->I(I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_6
    const-string p0, " switches"

    .line 379
    .line 380
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    goto :goto_6

    .line 384
    :cond_7
    const-string p0, " ifs"

    .line 385
    .line 386
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_8
    const-string p0, " gotos"

    .line 391
    .line 392
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_9
    const-string p0, " returns"

    .line 397
    .line 398
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_a
    const-string p0, " flows"

    .line 403
    .line 404
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    :cond_b
    :goto_6
    const/16 p0, 0x7d

    .line 408
    .line 409
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    return-object p0

    .line 417
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.class public final synthetic Lwd2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxn0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ln4;


# direct methods
.method public synthetic constructor <init>(Ln4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwd2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwd2;->b:Ln4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwd2;->a:I

    .line 2
    .line 3
    const-string v1, "urlSafe"

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const-string v4, "value"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object p0, p0, Lwd2;->b:Ln4;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-static {v6, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    aget-object p1, p1, v5

    .line 23
    .line 24
    invoke-static {v4, p1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Ln4;->o(Ljava/lang/String;)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    array-length p1, p0

    .line 33
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance p1, Lkotlin/UByteArray;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lkotlin/UByteArray;-><init>([B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_0
    return-object p0

    .line 53
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    :try_start_1
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    aget-object v0, p1, v5

    .line 60
    .line 61
    invoke-static {v4, v0}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    aget-object p1, p1, v6

    .line 66
    .line 67
    const-string v1, "uppercase"

    .line 68
    .line 69
    invoke-static {v1, p1}, Lsp0;->X(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    array-length v1, v0

    .line 74
    int-to-long v1, v1

    .line 75
    invoke-virtual {p0, v1, v2}, Ln4;->y(J)V

    .line 76
    .line 77
    .line 78
    if-eqz p1, :cond_0

    .line 79
    .line 80
    const-string p0, "0123456789ABCDEF"

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    const-string p0, "0123456789abcdef"

    .line 84
    .line 85
    :goto_1
    array-length p1, v0

    .line 86
    mul-int/2addr p1, v3

    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 90
    .line 91
    .line 92
    array-length p1, v0

    .line 93
    :goto_2
    if-ge v5, p1, :cond_1

    .line 94
    .line 95
    aget-byte v2, v0, v5

    .line 96
    .line 97
    and-int/lit16 v3, v2, 0xff

    .line 98
    .line 99
    ushr-int/lit8 v3, v3, 0x4

    .line 100
    .line 101
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    and-int/lit8 v2, v2, 0xf

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 125
    .line 126
    .line 127
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 128
    goto :goto_3

    .line 129
    :catchall_1
    move-exception p0

    .line 130
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_3
    return-object p0

    .line 135
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    :try_start_2
    invoke-static {v2, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    aget-object v0, p1, v5

    .line 142
    .line 143
    invoke-static {v4, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    aget-object v2, p1, v6

    .line 148
    .line 149
    invoke-static {v1, v2}, Lsp0;->X(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    aget-object p1, p1, v3

    .line 154
    .line 155
    const-string v2, "allowWhitespace"

    .line 156
    .line 157
    invoke-static {v2, p1}, Lsp0;->X(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    invoke-virtual {p0, v0, v1, p1}, Ln4;->n(Ljava/lang/String;ZZ)[B

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    array-length p1, p0

    .line 166
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    new-instance p1, Lkotlin/UByteArray;

    .line 171
    .line 172
    invoke-direct {p1, p0}, Lkotlin/UByteArray;-><init>([B)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 176
    .line 177
    .line 178
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 179
    goto :goto_4

    .line 180
    :catchall_2
    move-exception p0

    .line 181
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    :goto_4
    return-object p0

    .line 186
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    :try_start_3
    invoke-static {v2, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    aget-object v0, p1, v5

    .line 193
    .line 194
    invoke-static {v4, v0}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    aget-object v2, p1, v6

    .line 199
    .line 200
    invoke-static {v1, v2}, Lsp0;->X(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    aget-object p1, p1, v3

    .line 205
    .line 206
    const-string v2, "padding"

    .line 207
    .line 208
    invoke-static {v2, p1}, Lsp0;->X(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    array-length v2, v0

    .line 213
    int-to-long v2, v2

    .line 214
    invoke-virtual {p0, v2, v3}, Ln4;->y(J)V

    .line 215
    .line 216
    .line 217
    if-eqz v1, :cond_2

    .line 218
    .line 219
    invoke-static {}, Ljava/util/Base64;->getUrlEncoder()Ljava/util/Base64$Encoder;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    goto :goto_5

    .line 224
    :cond_2
    invoke-static {}, Ljava/util/Base64;->getEncoder()Ljava/util/Base64$Encoder;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    :goto_5
    if-nez p1, :cond_3

    .line 229
    .line 230
    invoke-virtual {p0}, Ljava/util/Base64$Encoder;->withoutPadding()Ljava/util/Base64$Encoder;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    :cond_3
    invoke-virtual {p0, v0}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 242
    .line 243
    .line 244
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 245
    goto :goto_6

    .line 246
    :catchall_3
    move-exception p0

    .line 247
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    :goto_6
    return-object p0

    .line 252
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    :try_start_4
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    aget-object v0, p1, v5

    .line 259
    .line 260
    invoke-static {v4, v0}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    aget-object p1, p1, v6

    .line 265
    .line 266
    const-string v1, "fatal"

    .line 267
    .line 268
    invoke-static {v1, p1}, Lsp0;->X(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    invoke-virtual {p0, v0, p1}, Ln4;->p([BZ)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 277
    .line 278
    .line 279
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 280
    goto :goto_7

    .line 281
    :catchall_4
    move-exception p0

    .line 282
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    :goto_7
    return-object p0

    .line 287
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    :try_start_5
    invoke-static {v6, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    aget-object p1, p1, v5

    .line 294
    .line 295
    invoke-static {v4, p1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    array-length v0, p1

    .line 312
    int-to-long v0, v0

    .line 313
    invoke-virtual {p0, v0, v1}, Ln4;->y(J)V

    .line 314
    .line 315
    .line 316
    array-length p0, p1

    .line 317
    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    new-instance p1, Lkotlin/UByteArray;

    .line 322
    .line 323
    invoke-direct {p1, p0}, Lkotlin/UByteArray;-><init>([B)V

    .line 324
    .line 325
    .line 326
    invoke-static {p1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 327
    .line 328
    .line 329
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 330
    goto :goto_8

    .line 331
    :catchall_5
    move-exception p0

    .line 332
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    :goto_8
    return-object p0

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

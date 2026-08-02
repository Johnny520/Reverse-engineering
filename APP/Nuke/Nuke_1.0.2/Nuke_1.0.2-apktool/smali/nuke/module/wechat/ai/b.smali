.class public final Lnuke/module/wechat/ai/b;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final e:Lvf1;

.field public static final f:Lir0;

.field public static final g:Let1;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Let1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lvf1;->d:Lo72;

    .line 2
    .line 3
    const-string v0, "application/json; charset=utf-8"

    .line 4
    .line 5
    invoke-static {v0}, Lte;->C(Ljava/lang/String;)Lvf1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lnuke/module/wechat/ai/b;->e:Lvf1;

    .line 10
    .line 11
    new-instance v0, Lir0;

    .line 12
    .line 13
    invoke-direct {v0}, Lir0;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lnuke/module/wechat/ai/b;->f:Lir0;

    .line 17
    .line 18
    new-instance v0, Ldt1;

    .line 19
    .line 20
    invoke-direct {v0}, Ldt1;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-wide/16 v2, 0xf

    .line 29
    .line 30
    invoke-static {v2, v3, v1}, Lwg3;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iput v2, v0, Ldt1;->y:I

    .line 35
    .line 36
    const-wide/16 v2, 0x78

    .line 37
    .line 38
    invoke-static {v2, v3, v1}, Lwg3;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iput v2, v0, Ldt1;->z:I

    .line 43
    .line 44
    const-wide/16 v2, 0x1e

    .line 45
    .line 46
    invoke-static {v2, v3, v1}, Lwg3;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iput v1, v0, Ldt1;->A:I

    .line 51
    .line 52
    new-instance v1, Let1;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Let1;-><init>(Ldt1;)V

    .line 55
    .line 56
    .line 57
    sput-object v1, Lnuke/module/wechat/ai/b;->g:Let1;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lnuke/module/wechat/ai/b;->g:Let1;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lnuke/module/wechat/ai/b;->a:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p2, p0, Lnuke/module/wechat/ai/b;->b:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p3, p0, Lnuke/module/wechat/ai/b;->c:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lnuke/module/wechat/ai/b;->d:Let1;

    .line 25
    .line 26
    return-void
.end method

.method public static b(Ljava/lang/String;)Ld1;
    .locals 7

    .line 1
    new-instance v0, Ld1;

    .line 2
    .line 3
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 4
    .line 5
    const/4 v5, 0x4

    .line 6
    const/4 v6, 0x0

    .line 7
    sget-object v2, La1;->h:La1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v3, p0

    .line 11
    invoke-direct/range {v1 .. v6}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ld1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method


# virtual methods
.method public final a(Lnuke/module/wechat/ai/AIChatRequest;)Lf1;
    .locals 10

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "chat/completions"

    .line 7
    .line 8
    invoke-static {v0, v1}, Lnuke/module/wechat/ai/a;->e(Ljava/lang/String;Ljava/lang/String;)Lyw0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string p0, "API Base URL must be a valid HTTPS URL"

    .line 15
    .line 16
    invoke-static {p0}, Lnuke/module/wechat/ai/b;->b(Ljava/lang/String;)Ld1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    iget-object v1, p0, Lnuke/module/wechat/ai/b;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const-string p0, "API key is empty"

    .line 30
    .line 31
    invoke-static {p0}, Lnuke/module/wechat/ai/b;->b(Ljava/lang/String;)Ld1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    iget-object v2, p0, Lnuke/module/wechat/ai/b;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    const-string p0, "Model is empty"

    .line 45
    .line 46
    invoke-static {p0}, Lnuke/module/wechat/ai/b;->b(Ljava/lang/String;)Ld1;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-virtual {p1}, Lnuke/module/wechat/ai/AIChatRequest;->getMessages()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    const-string p0, "Messages are empty"

    .line 62
    .line 63
    invoke-static {p0}, Lnuke/module/wechat/ai/b;->b(Ljava/lang/String;)Ld1;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_3
    invoke-static {v2}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p1}, Lnuke/module/wechat/ai/AIChatRequest;->getMessages()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    new-instance v4, Ljava/util/ArrayList;

    .line 81
    .line 82
    const/16 v5, 0xa

    .line 83
    .line 84
    invoke-static {v3, v5}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_4

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Lnuke/module/wechat/ai/AIChatMessage;

    .line 106
    .line 107
    new-instance v6, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIMessage;

    .line 108
    .line 109
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatMessage;->getRole()Lg1;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    iget-object v7, v7, Lg1;->h:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatMessage;->getContent()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-direct {v6, v7, v5}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    invoke-virtual {p1}, Lnuke/module/wechat/ai/AIChatRequest;->getTemperature()F

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    const/4 v5, 0x0

    .line 131
    const/high16 v6, 0x40000000    # 2.0f

    .line 132
    .line 133
    invoke-static {v3, v5, v6}, Lci0;->C(FFF)F

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    invoke-virtual {p1}, Lnuke/module/wechat/ai/AIChatRequest;->getMaxTokens()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    const v5, 0x8000

    .line 142
    .line 143
    .line 144
    const/4 v6, 0x1

    .line 145
    invoke-static {p1, v6, v5}, Lci0;->D(III)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    new-instance v5, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;

    .line 150
    .line 151
    invoke-direct {v5, v2, v4, v3, p1}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;-><init>(Ljava/lang/String;Ljava/util/List;FI)V

    .line 152
    .line 153
    .line 154
    new-instance p1, Lcj;

    .line 155
    .line 156
    const/4 v2, 0x4

    .line 157
    invoke-direct {p1, v2}, Lcj;-><init>(I)V

    .line 158
    .line 159
    .line 160
    iput-object v0, p1, Lcj;->a:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    new-instance v1, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v2, "Bearer "

    .line 173
    .line 174
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v1, "Authorization"

    .line 185
    .line 186
    invoke-virtual {p1, v1, v0}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    sget-object v0, Lnuke/module/wechat/ai/b;->e:Lvf1;

    .line 190
    .line 191
    iget-object v1, v0, Lvf1;->a:Ljava/lang/String;

    .line 192
    .line 193
    const-string v2, "Accept"

    .line 194
    .line 195
    invoke-virtual {p1, v2, v1}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    sget v1, Lo82;->a:I

    .line 199
    .line 200
    sget-object v1, Lnuke/module/wechat/ai/b;->f:Lir0;

    .line 201
    .line 202
    invoke-virtual {v1, v5}, Lir0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    sget-object v2, Lwq;->a:Ljava/nio/charset/Charset;

    .line 210
    .line 211
    invoke-static {v0}, Lvf1;->a(Lvf1;)Ljava/nio/charset/Charset;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    if-nez v3, :cond_5

    .line 216
    .line 217
    new-instance v3, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v0, "; charset=utf-8"

    .line 226
    .line 227
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    :try_start_0
    invoke-static {v0}, Lte;->C(Ljava/lang/String;)Lvf1;

    .line 235
    .line 236
    .line 237
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    goto :goto_1

    .line 239
    :catch_0
    const/4 v0, 0x0

    .line 240
    goto :goto_1

    .line 241
    :cond_5
    move-object v2, v3

    .line 242
    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    array-length v2, v1

    .line 250
    array-length v3, v1

    .line 251
    int-to-long v4, v3

    .line 252
    const-wide/16 v6, 0x0

    .line 253
    .line 254
    int-to-long v8, v2

    .line 255
    invoke-static/range {v4 .. v9}, Lug3;->a(JJJ)V

    .line 256
    .line 257
    .line 258
    new-instance v3, Ln82;

    .line 259
    .line 260
    invoke-direct {v3, v0, v2, v1}, Ln82;-><init>(Lvf1;I[B)V

    .line 261
    .line 262
    .line 263
    const-string v0, "POST"

    .line 264
    .line 265
    invoke-virtual {p1, v0, v3}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Lk82;

    .line 269
    .line 270
    invoke-direct {v0, p1}, Lk82;-><init>(Lcj;)V

    .line 271
    .line 272
    .line 273
    :try_start_1
    iget-object p0, p0, Lnuke/module/wechat/ai/b;->d:Let1;

    .line 274
    .line 275
    new-instance p1, Ls52;

    .line 276
    .line 277
    invoke-direct {p1, p0, v0}, Ls52;-><init>(Let1;Lk82;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1}, Ls52;->h()Lr92;

    .line 281
    .line 282
    .line 283
    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 284
    :try_start_2
    iget-object p1, p0, Lr92;->n:Lu92;

    .line 285
    .line 286
    invoke-virtual {p1}, Lu92;->b()Ljava/io/InputStream;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-static {p1}, Lnuke/module/wechat/ai/a;->a(Ljava/io/InputStream;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    iget-boolean v0, p0, Lr92;->w:Z

    .line 295
    .line 296
    if-nez v0, :cond_7

    .line 297
    .line 298
    new-instance v0, Ld1;

    .line 299
    .line 300
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 301
    .line 302
    sget-object v2, La1;->j:La1;

    .line 303
    .line 304
    invoke-static {p1}, Lnuke/module/wechat/ai/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    if-nez p1, :cond_6

    .line 309
    .line 310
    iget p1, p0, Lr92;->k:I

    .line 311
    .line 312
    new-instance v3, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    const-string v4, "OpenAI-compatible service returned HTTP "

    .line 318
    .line 319
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    goto :goto_2

    .line 330
    :catchall_0
    move-exception v0

    .line 331
    move-object p1, v0

    .line 332
    goto :goto_4

    .line 333
    :cond_6
    :goto_2
    iget v3, p0, Lr92;->k:I

    .line 334
    .line 335
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-direct {v1, v2, p1, v3}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 340
    .line 341
    .line 342
    invoke-direct {v0, v1}, Ld1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 343
    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_7
    invoke-static {p1}, Lnuke/module/wechat/ai/a;->d(Ljava/lang/String;)Lf1;

    .line 347
    .line 348
    .line 349
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 350
    :goto_3
    :try_start_3
    invoke-virtual {p0}, Lr92;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :goto_4
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 355
    :catchall_1
    move-exception v0

    .line 356
    :try_start_5
    invoke-static {p0, p1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 360
    :catchall_2
    move-exception v0

    .line 361
    move-object p0, v0

    .line 362
    new-instance v0, Ld1;

    .line 363
    .line 364
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 365
    .line 366
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    if-nez p0, :cond_8

    .line 371
    .line 372
    const-string p0, "OpenAI-compatible request failed"

    .line 373
    .line 374
    :cond_8
    move-object v3, p0

    .line 375
    const/4 v5, 0x4

    .line 376
    const/4 v6, 0x0

    .line 377
    sget-object v2, La1;->k:La1;

    .line 378
    .line 379
    const/4 v4, 0x0

    .line 380
    invoke-direct/range {v1 .. v6}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 381
    .line 382
    .line 383
    invoke-direct {v0, v1}, Ld1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 384
    .line 385
    .line 386
    goto :goto_5

    .line 387
    :catch_1
    move-exception v0

    .line 388
    move-object p0, v0

    .line 389
    new-instance v0, Ld1;

    .line 390
    .line 391
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 392
    .line 393
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    if-nez p0, :cond_9

    .line 398
    .line 399
    const-string p0, "OpenAI-compatible service is unavailable"

    .line 400
    .line 401
    :cond_9
    move-object v3, p0

    .line 402
    const/4 v5, 0x4

    .line 403
    const/4 v6, 0x0

    .line 404
    sget-object v2, La1;->i:La1;

    .line 405
    .line 406
    const/4 v4, 0x0

    .line 407
    invoke-direct/range {v1 .. v6}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 408
    .line 409
    .line 410
    invoke-direct {v0, v1}, Ld1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 411
    .line 412
    .line 413
    :goto_5
    return-object v0
.end method

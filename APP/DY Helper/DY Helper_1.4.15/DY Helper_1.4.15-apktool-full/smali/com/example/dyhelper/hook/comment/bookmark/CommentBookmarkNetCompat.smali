.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$ArgPlan;,
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field private static final COMMENT_API_HOST:Ljava/lang/String; = "https://aweme.snssdk.com"

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

.field private static final TAG:Ljava/lang/String; = "r441d0028c4f889b"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final allFields(Ljava/lang/Class;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-class v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1, p0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object p0
.end method

.method private final awaitBoltsTask(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    const-string v1, "isCompleted"

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v2, v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v0

    .line 26
    goto :goto_1

    .line 27
    :goto_0
    new-instance v2, Leo1;

    .line 28
    .line 29
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v1, v2

    .line 33
    :goto_1
    instance-of v2, v1, Leo1;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    move-object v1, v0

    .line 38
    :cond_1
    check-cast v1, Ljava/lang/Boolean;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v1, v2

    .line 49
    :goto_2
    if-nez v1, :cond_b

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    array-length v3, v1

    .line 59
    move v4, v2

    .line 60
    :goto_3
    const-string v5, "waitForCompletion"

    .line 61
    .line 62
    const/4 v6, 0x1

    .line 63
    if-ge v4, v3, :cond_5

    .line 64
    .line 65
    aget-object v7, v1, v4

    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-static {v8, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_3

    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    array-length v8, v8

    .line 82
    const/4 v9, 0x2

    .line 83
    if-ne v8, v9, :cond_3

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    aget-object v8, v8, v2

    .line 90
    .line 91
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_3

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    aget-object v8, v8, v6

    .line 104
    .line 105
    const-class v9, Ljava/util/concurrent/TimeUnit;

    .line 106
    .line 107
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_3

    .line 112
    .line 113
    move v8, v6

    .line 114
    goto :goto_4

    .line 115
    :cond_3
    move v8, v2

    .line 116
    :goto_4
    if-eqz v8, :cond_4

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    move-object v7, v0

    .line 123
    :goto_5
    if-eqz v7, :cond_6

    .line 124
    .line 125
    const-wide/16 v3, 0xc

    .line 126
    .line 127
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 132
    .line 133
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v7, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_a

    .line 141
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    array-length v3, v1

    .line 149
    move v4, v2

    .line 150
    :goto_6
    if-ge v4, v3, :cond_a

    .line 151
    .line 152
    aget-object v7, v1, v4

    .line 153
    .line 154
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    invoke-static {v8, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-eqz v8, :cond_8

    .line 163
    .line 164
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    array-length v8, v8

    .line 172
    if-nez v8, :cond_7

    .line 173
    .line 174
    move v8, v6

    .line 175
    goto :goto_7

    .line 176
    :cond_7
    move v8, v2

    .line 177
    :goto_7
    if-eqz v8, :cond_8

    .line 178
    .line 179
    move v8, v6

    .line 180
    goto :goto_8

    .line 181
    :cond_8
    move v8, v2

    .line 182
    :goto_8
    if-eqz v8, :cond_9

    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_a
    move-object v7, v0

    .line 189
    :goto_9
    if-eqz v7, :cond_b

    .line 190
    .line 191
    invoke-virtual {v7, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    :cond_b
    :goto_a
    :try_start_1
    const-string v1, "isFaulted"

    .line 195
    .line 196
    invoke-virtual {p0, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    instance-of v3, v1, Ljava/lang/Boolean;

    .line 205
    .line 206
    if-eqz v3, :cond_c

    .line 207
    .line 208
    check-cast v1, Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 209
    .line 210
    goto :goto_c

    .line 211
    :catchall_1
    move-exception v1

    .line 212
    goto :goto_b

    .line 213
    :cond_c
    move-object v1, v0

    .line 214
    goto :goto_c

    .line 215
    :goto_b
    new-instance v3, Leo1;

    .line 216
    .line 217
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    move-object v1, v3

    .line 221
    :goto_c
    instance-of v3, v1, Leo1;

    .line 222
    .line 223
    if-eqz v3, :cond_d

    .line 224
    .line 225
    move-object v1, v0

    .line 226
    :cond_d
    check-cast v1, Ljava/lang/Boolean;

    .line 227
    .line 228
    if-eqz v1, :cond_e

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    goto :goto_d

    .line 235
    :cond_e
    move v1, v2

    .line 236
    :goto_d
    if-eqz v1, :cond_12

    .line 237
    .line 238
    :try_start_2
    const-string v1, "getError"

    .line 239
    .line 240
    invoke-virtual {p0, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    instance-of p1, p0, Ljava/lang/Throwable;

    .line 249
    .line 250
    if-eqz p1, :cond_f

    .line 251
    .line 252
    check-cast p0, Ljava/lang/Throwable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 253
    .line 254
    goto :goto_f

    .line 255
    :catchall_2
    move-exception p0

    .line 256
    goto :goto_e

    .line 257
    :cond_f
    move-object p0, v0

    .line 258
    goto :goto_f

    .line 259
    :goto_e
    new-instance p1, Leo1;

    .line 260
    .line 261
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    move-object p0, p1

    .line 265
    :goto_f
    instance-of p1, p0, Leo1;

    .line 266
    .line 267
    if-eqz p1, :cond_10

    .line 268
    .line 269
    goto :goto_10

    .line 270
    :cond_10
    move-object v0, p0

    .line 271
    :goto_10
    check-cast v0, Ljava/lang/Throwable;

    .line 272
    .line 273
    if-nez v0, :cond_11

    .line 274
    .line 275
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 276
    .line 277
    const-string p0, "Task faulted"

    .line 278
    .line 279
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :cond_11
    throw v0

    .line 283
    :cond_12
    :try_start_3
    const-string v1, "isCancelled"

    .line 284
    .line 285
    invoke-virtual {p0, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    instance-of v3, v1, Ljava/lang/Boolean;

    .line 294
    .line 295
    if-eqz v3, :cond_13

    .line 296
    .line 297
    check-cast v1, Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 298
    .line 299
    goto :goto_12

    .line 300
    :catchall_3
    move-exception v1

    .line 301
    goto :goto_11

    .line 302
    :cond_13
    move-object v1, v0

    .line 303
    goto :goto_12

    .line 304
    :goto_11
    new-instance v3, Leo1;

    .line 305
    .line 306
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    move-object v1, v3

    .line 310
    :goto_12
    instance-of v3, v1, Leo1;

    .line 311
    .line 312
    if-eqz v3, :cond_14

    .line 313
    .line 314
    move-object v1, v0

    .line 315
    :cond_14
    check-cast v1, Ljava/lang/Boolean;

    .line 316
    .line 317
    if-eqz v1, :cond_15

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    :cond_15
    if-nez v2, :cond_16

    .line 324
    .line 325
    const-string v1, "getResult"

    .line 326
    .line 327
    invoke-virtual {p0, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    return-object p0

    .line 336
    :cond_16
    const-string p0, "Task cancelled"

    .line 337
    .line 338
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const/4 p0, 0x0

    .line 342
    return-object p0
.end method

.method private final blockingFirst(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v3, v2

    .line 15
    move v4, v1

    .line 16
    :goto_0
    if-ge v4, v3, :cond_1

    .line 17
    .line 18
    aget-object v5, v2, v4

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const-string v7, "timeout"

    .line 25
    .line 26
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    array-length v6, v6

    .line 37
    const/4 v7, 0x2

    .line 38
    if-ne v6, v7, :cond_0

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    aget-object v6, v6, v1

    .line 45
    .line 46
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const/4 v7, 0x1

    .line 59
    aget-object v6, v6, v7

    .line 60
    .line 61
    const-class v7, Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_0

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v2

    .line 71
    goto :goto_2

    .line 72
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v5, v0

    .line 76
    :goto_1
    if-nez v5, :cond_2

    .line 77
    .line 78
    move-object v2, p1

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    const-wide/16 v2, 0xc

    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 87
    .line 88
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {p0, v5, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->invokeUnwrap(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    goto :goto_3

    .line 97
    :goto_2
    new-instance v3, Leo1;

    .line 98
    .line 99
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    move-object v2, v3

    .line 103
    :goto_3
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_3
    move-object v2, p1

    .line 111
    :goto_4
    if-eqz v2, :cond_6

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    if-eqz v3, :cond_6

    .line 122
    .line 123
    array-length v4, v3

    .line 124
    move v5, v1

    .line 125
    :goto_5
    if-ge v5, v4, :cond_5

    .line 126
    .line 127
    aget-object v6, v3, v5

    .line 128
    .line 129
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    const-string v8, "blockingFirst"

    .line 134
    .line 135
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-eqz v7, :cond_4

    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    array-length v7, v7

    .line 149
    if-nez v7, :cond_4

    .line 150
    .line 151
    move-object v0, v6

    .line 152
    goto :goto_6

    .line 153
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_5
    :goto_6
    if-eqz v0, :cond_6

    .line 157
    .line 158
    new-array p1, v1, [Ljava/lang/Object;

    .line 159
    .line 160
    invoke-virtual {p0, v0, v2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->invokeUnwrap(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    const-string p1, ".blockingFirst"

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/4 p0, 0x0

    .line 183
    return-object p0
.end method

.method private final blockingGet(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v3, v2

    .line 15
    move v4, v1

    .line 16
    :goto_0
    if-ge v4, v3, :cond_1

    .line 17
    .line 18
    aget-object v5, v2, v4

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const-string v7, "timeout"

    .line 25
    .line 26
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    array-length v6, v6

    .line 37
    const/4 v7, 0x2

    .line 38
    if-ne v6, v7, :cond_0

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    aget-object v6, v6, v1

    .line 45
    .line 46
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const/4 v7, 0x1

    .line 59
    aget-object v6, v6, v7

    .line 60
    .line 61
    const-class v7, Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_0

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v2

    .line 71
    goto :goto_2

    .line 72
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v5, v0

    .line 76
    :goto_1
    if-nez v5, :cond_2

    .line 77
    .line 78
    move-object v2, p1

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    const-wide/16 v2, 0xc

    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 87
    .line 88
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {p0, v5, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->invokeUnwrap(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    goto :goto_3

    .line 97
    :goto_2
    new-instance v3, Leo1;

    .line 98
    .line 99
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    move-object v2, v3

    .line 103
    :goto_3
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_3
    move-object v2, p1

    .line 111
    :goto_4
    if-eqz v2, :cond_6

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    if-eqz v3, :cond_6

    .line 122
    .line 123
    array-length v4, v3

    .line 124
    move v5, v1

    .line 125
    :goto_5
    if-ge v5, v4, :cond_5

    .line 126
    .line 127
    aget-object v6, v3, v5

    .line 128
    .line 129
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    const-string v8, "blockingGet"

    .line 134
    .line 135
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-eqz v7, :cond_4

    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    array-length v7, v7

    .line 149
    if-nez v7, :cond_4

    .line 150
    .line 151
    move-object v0, v6

    .line 152
    goto :goto_6

    .line 153
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_5
    :goto_6
    if-eqz v0, :cond_6

    .line 157
    .line 158
    new-array p1, v1, [Ljava/lang/Object;

    .line 159
    .line 160
    invoke-virtual {p0, v0, v2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->invokeUnwrap(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    const-string p1, ".blockingGet"

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/4 p0, 0x0

    .line 183
    return-object p0
.end method

.method private final callNoArgOrBooleanStatic(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    array-length v0, p0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    aget-object v2, p0, v1

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v1, v0

    .line 55
    check-cast v1, Ljava/lang/reflect/Method;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v1, v0

    .line 93
    check-cast v1, Ljava/lang/reflect/Method;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    array-length v2, v2

    .line 103
    if-nez v2, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 111
    .line 112
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    :goto_3
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$callNoArgOrBooleanStatic$$inlined$sortedByDescending$1;

    .line 127
    .line 128
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$callNoArgOrBooleanStatic$$inlined$sortedByDescending$1;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    const/4 v0, 0x0

    .line 144
    if-eqz p1, :cond_a

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Ljava/lang/reflect/Method;

    .line 151
    .line 152
    const/4 v1, 0x1

    .line 153
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    array-length v1, v1

    .line 164
    if-nez v1, :cond_8

    .line 165
    .line 166
    invoke-virtual {p1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    goto :goto_5

    .line 171
    :catchall_0
    move-exception p1

    .line 172
    goto :goto_4

    .line 173
    :cond_8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 174
    .line 175
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {p1, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    goto :goto_5

    .line 184
    :goto_4
    new-instance v1, Leo1;

    .line 185
    .line 186
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    move-object p1, v1

    .line 190
    :goto_5
    instance-of v1, p1, Leo1;

    .line 191
    .line 192
    if-eqz v1, :cond_9

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_9
    move-object v0, p1

    .line 196
    :goto_6
    if-eqz v0, :cond_7

    .line 197
    .line 198
    :cond_a
    return-object v0
.end method

.method private final createApiByRetrofitFactory(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, Lqe0;->α:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "~7958639031A1A3555FFBD7E3E2CA3675A90331AF12679BCEE74C7B4CF8875EBD979E21CD04FF0562ED8FD423439F4080CE784C"

    .line 9
    .line 10
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v1, v2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    :goto_0
    move-object p0, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-direct {p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->callNoArgOrBooleanStatic(Ljava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string v1, "createBuilder"

    .line 30
    .line 31
    const-string v2, "https://aweme.snssdk.com"

    .line 32
    .line 33
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {p0, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-nez p0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const-string v1, "build"

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    new-array v2, v2, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {p0, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const-string v1, "create"

    .line 57
    .line 58
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p0, v1, p1}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    new-instance p1, Leo1;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object p0, p1

    .line 74
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v1, "createApiByRetrofitFactory optional unavailable: "

    .line 85
    .line 86
    invoke-static {v1, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const/4 v1, 0x4

    .line 91
    const-string v2, "r441d0028c4f889b"

    .line 92
    .line 93
    invoke-static {v2, p1, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    instance-of p1, p0, Leo1;

    .line 97
    .line 98
    if-eqz p1, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    move-object v0, p0

    .line 102
    :goto_2
    return-object v0
.end method

.method private final createApiByRetrofitService(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, Lqe0;->α:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8107C8BB77EA1388D4B0E93EAAB5799C72D08C663B6E6BA8F"

    .line 9
    .line 10
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v1, v2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    :goto_0
    move-object p0, v0

    .line 21
    goto :goto_3

    .line 22
    :cond_0
    const-string v3, "~7934B87CE184340F84F7127372E5F7BF0B2DC4F258E8184B046CCF32E81952B14DB7A14B89C8BB89"

    .line 23
    .line 24
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v1, v3}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v3, "LIZIZ"

    .line 36
    .line 37
    invoke-static {v1, v3}, Lqe0;->κ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    instance-of v3, v1, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move-object v1, v0

    .line 55
    :goto_1
    if-nez v1, :cond_3

    .line 56
    .line 57
    const-string v1, "https://aweme.snssdk.com"

    .line 58
    .line 59
    :cond_3
    invoke-direct {p0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->callNoArgOrBooleanStatic(Ljava/lang/Class;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-nez p0, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    const-string v2, "createNewRetrofit"

    .line 67
    .line 68
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {p0, v2, v1}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-nez p0, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const-string v1, "create"

    .line 80
    .line 81
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p0, v1, p1}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_3

    .line 90
    :goto_2
    new-instance p1, Leo1;

    .line 91
    .line 92
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    move-object p0, p1

    .line 96
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string v1, "createApiByRetrofitService optional unavailable: "

    .line 107
    .line 108
    invoke-static {v1, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const/4 v1, 0x4

    .line 113
    const-string v2, "r441d0028c4f889b"

    .line 114
    .line 115
    invoke-static {v2, p1, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    instance-of p1, p0, Leo1;

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    move-object v0, p0

    .line 124
    :goto_4
    return-object v0
.end method

.method private final executeRetrofitCall(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    const/4 v4, 0x0

    .line 16
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    aget-object v5, v0, v3

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const-string v7, "execute"

    .line 25
    .line 26
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    array-length v6, v6

    .line 40
    if-nez v6, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v5, v4

    .line 47
    :goto_1
    if-nez v5, :cond_2

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    new-array v0, v2, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p0, v5, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->invokeUnwrap(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    return-object v4

    .line 59
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    array-length v1, v0

    .line 71
    move v3, v2

    .line 72
    :goto_2
    if-ge v3, v1, :cond_5

    .line 73
    .line 74
    aget-object v5, v0, v3

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    const-string v7, "body"

    .line 81
    .line 82
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    array-length v6, v6

    .line 96
    if-nez v6, :cond_4

    .line 97
    .line 98
    move-object v4, v5

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    :goto_3
    if-nez v4, :cond_6

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_6
    new-array v0, v2, [Ljava/lang/Object;

    .line 107
    .line 108
    invoke-virtual {p0, v4, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->invokeUnwrap(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method

.method private final hasMethod(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length p1, p0

    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    if-ge v1, p1, :cond_1

    .line 12
    .line 13
    aget-object v2, p0, v1

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    array-length v2, v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return v0
.end method

.method private final isBoltsTask(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const-class p1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "bolts.Task"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method private final primitiveDefaultForParam(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_5

    .line 17
    .line 18
    if-eqz p1, :cond_4

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    sparse-switch p0, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :sswitch_0
    const-string p0, "count"

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/16 v1, 0x14

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :sswitch_1
    const-string p0, "forward_page_type"

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :sswitch_2
    const-string p0, "comment_level"

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 v1, 0x2

    .line 59
    goto :goto_0

    .line 60
    :sswitch_3
    const-string p0, "channel_id"

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 v1, -0x1

    .line 70
    :cond_4
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_5
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_6

    .line 82
    .line 83
    const-wide/16 p0, 0x0

    .line 84
    .line 85
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_6
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_7

    .line 97
    .line 98
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_7
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_8

    .line 108
    .line 109
    const/4 p0, 0x0

    .line 110
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_8
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 116
    .line 117
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_9

    .line 122
    .line 123
    const-wide/16 p0, 0x0

    .line 124
    .line 125
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :cond_9
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 131
    .line 132
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_a

    .line 137
    .line 138
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :cond_a
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 144
    .line 145
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eqz p0, :cond_b

    .line 150
    .line 151
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :cond_b
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 157
    .line 158
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_c

    .line 163
    .line 164
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :cond_c
    return-object v0

    .line 170
    nop

    .line 171
    :sswitch_data_0
    .sparse-switch
        -0x7315ce29 -> :sswitch_3
        -0x4256965c -> :sswitch_2
        -0x3a3d3e10 -> :sswitch_1
        0x5a7510f -> :sswitch_0
    .end sparse-switch
.end method

.method private final queryNameOf([Ljava/lang/annotation/Annotation;Ljava/util/List;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/annotation/Annotation;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    array-length p0, p1

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    const/4 v2, 0x0

    .line 5
    if-ge v1, p0, :cond_8

    .line 6
    .line 7
    aget-object v3, p1, v1

    .line 8
    .line 9
    invoke-static {v3}, Lln0;->Ζ(Ljava/lang/annotation/Annotation;)Lwf;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {v4}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, ".ExtraInfo"

    .line 22
    .line 23
    invoke-static {v4, v5, v0}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    const-string p0, "__extra_info__"

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    :try_start_0
    invoke-static {v3}, Lln0;->Ζ(Ljava/lang/annotation/Annotation;)Lwf;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const-string v5, "value"

    .line 41
    .line 42
    invoke-virtual {v4, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    instance-of v5, v4, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catchall_0
    move-exception v4

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object v4, v2

    .line 60
    goto :goto_2

    .line 61
    :goto_1
    new-instance v5, Leo1;

    .line 62
    .line 63
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object v4, v5

    .line 67
    :goto_2
    instance-of v5, v4, Leo1;

    .line 68
    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    move-object v4, v2

    .line 72
    :cond_2
    check-cast v4, Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    return-object v4

    .line 84
    :cond_4
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_6

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    move-object v6, v5

    .line 103
    check-cast v6, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v3, v6, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_5

    .line 110
    .line 111
    move-object v2, v5

    .line 112
    :cond_6
    check-cast v2, Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v2, :cond_7

    .line 115
    .line 116
    return-object v2

    .line 117
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_8
    return-object v2
.end method

.method private final scanHolderForApi(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :catchall_0
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p2, :cond_4

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Ljava/lang/reflect/Field;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    :try_start_0
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    if-nez p3, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v0, p3

    .line 41
    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-nez p2, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    return-object p2

    .line 55
    :cond_4
    return-object v0
.end method

.method private final scanStaticApi(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_3

    .line 17
    .line 18
    aget-object v4, v1, v3

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {p1, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    return-object v4

    .line 48
    :cond_1
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-direct {v2, p1, v3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->scanHolderForApi(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_5
    return-object v0
.end method

.method private static final stableKey$lambda$1$lambda$0(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic α(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey$lambda$1$lambda$0(Ljava/lang/Class;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final awaitNetworkResult(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "Observable"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->blockingFirst(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    const-string v1, "Flowable"

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->blockingFirst(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    const-string v1, "Single"

    .line 40
    .line 41
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->blockingGet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    const-string v1, "Maybe"

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->blockingGet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_3
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isBoltsTask(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->awaitBoltsTask(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    const-string v1, "retrofit2.Call"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "execute"

    .line 89
    .line 90
    invoke-direct {p0, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->hasMethod(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    return-object p1

    .line 98
    :cond_6
    :goto_0
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->executeRetrofitCall(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method

.method public final coerceValue(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_b

    .line 12
    .line 13
    invoke-direct {p0, p3, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->primitiveDefaultForParam(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_1
    const-class v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_2
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x1

    .line 52
    const/16 v3, 0xa

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    if-nez v1, :cond_27

    .line 56
    .line 57
    const-class v1, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    goto/16 :goto_f

    .line 66
    .line 67
    :cond_3
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_23

    .line 74
    .line 75
    const-class v1, Ljava/lang/Long;

    .line 76
    .line 77
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    goto/16 :goto_d

    .line 84
    .line 85
    :cond_4
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_1e

    .line 92
    .line 93
    const-class v1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    goto/16 :goto_b

    .line 102
    .line 103
    :cond_5
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_1a

    .line 110
    .line 111
    const-class v1, Ljava/lang/Float;

    .line 112
    .line 113
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_6

    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_6
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 122
    .line 123
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_17

    .line 128
    .line 129
    const-class v1, Ljava/lang/Double;

    .line 130
    .line 131
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    goto/16 :goto_7

    .line 138
    .line 139
    :cond_7
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 140
    .line 141
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_12

    .line 146
    .line 147
    const-class v1, Ljava/lang/Short;

    .line 148
    .line 149
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_8

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_8
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 157
    .line 158
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_d

    .line 163
    .line 164
    const-class v1, Ljava/lang/Byte;

    .line 165
    .line 166
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-nez v1, :cond_a

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {p2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_a

    .line 188
    .line 189
    :goto_0
    return-object p1

    .line 190
    :cond_a
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-nez p1, :cond_c

    .line 195
    .line 196
    :cond_b
    return-object v0

    .line 197
    :cond_c
    invoke-direct {p0, p3, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->primitiveDefaultForParam(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    return-object p0

    .line 202
    :cond_d
    :goto_1
    instance-of p0, p1, Ljava/lang/Number;

    .line 203
    .line 204
    if-eqz p0, :cond_e

    .line 205
    .line 206
    check-cast p1, Ljava/lang/Number;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    goto :goto_3

    .line 213
    :cond_e
    instance-of p0, p1, Ljava/lang/String;

    .line 214
    .line 215
    if-eqz p0, :cond_11

    .line 216
    .line 217
    check-cast p1, Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {p1, v3}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    if-eqz p0, :cond_10

    .line 224
    .line 225
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    const/16 p1, -0x80

    .line 230
    .line 231
    if-lt p0, p1, :cond_10

    .line 232
    .line 233
    const/16 p1, 0x7f

    .line 234
    .line 235
    if-le p0, p1, :cond_f

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_f
    int-to-byte p0, p0

    .line 239
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    :cond_10
    :goto_2
    if-eqz v0, :cond_11

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    :cond_11
    :goto_3
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0

    .line 254
    :cond_12
    :goto_4
    instance-of p0, p1, Ljava/lang/Number;

    .line 255
    .line 256
    if-eqz p0, :cond_13

    .line 257
    .line 258
    check-cast p1, Ljava/lang/Number;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    goto :goto_6

    .line 265
    :cond_13
    instance-of p0, p1, Ljava/lang/String;

    .line 266
    .line 267
    if-eqz p0, :cond_16

    .line 268
    .line 269
    check-cast p1, Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {p1, v3}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    if-eqz p0, :cond_15

    .line 276
    .line 277
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    const/16 p1, -0x8000

    .line 282
    .line 283
    if-lt p0, p1, :cond_15

    .line 284
    .line 285
    const/16 p1, 0x7fff

    .line 286
    .line 287
    if-le p0, p1, :cond_14

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_14
    int-to-short p0, p0

    .line 291
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    :cond_15
    :goto_5
    if-eqz v0, :cond_16

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    :cond_16
    :goto_6
    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    return-object p0

    .line 306
    :cond_17
    :goto_7
    instance-of p0, p1, Ljava/lang/Number;

    .line 307
    .line 308
    if-eqz p0, :cond_18

    .line 309
    .line 310
    check-cast p1, Ljava/lang/Number;

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 313
    .line 314
    .line 315
    move-result-wide p0

    .line 316
    goto :goto_8

    .line 317
    :cond_18
    instance-of p0, p1, Ljava/lang/String;

    .line 318
    .line 319
    const-wide/16 p2, 0x0

    .line 320
    .line 321
    if-eqz p0, :cond_19

    .line 322
    .line 323
    check-cast p1, Ljava/lang/String;

    .line 324
    .line 325
    invoke-static {p1}, Lw02;->Θ(Ljava/lang/String;)Ljava/lang/Double;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    if-eqz p0, :cond_19

    .line 330
    .line 331
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 332
    .line 333
    .line 334
    move-result-wide p0

    .line 335
    goto :goto_8

    .line 336
    :cond_19
    move-wide p0, p2

    .line 337
    :goto_8
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0

    .line 342
    :cond_1a
    :goto_9
    instance-of p0, p1, Ljava/lang/Number;

    .line 343
    .line 344
    if-eqz p0, :cond_1b

    .line 345
    .line 346
    check-cast p1, Ljava/lang/Number;

    .line 347
    .line 348
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 349
    .line 350
    .line 351
    move-result p0

    .line 352
    goto :goto_a

    .line 353
    :cond_1b
    instance-of p0, p1, Ljava/lang/String;

    .line 354
    .line 355
    const/4 p2, 0x0

    .line 356
    if-eqz p0, :cond_1d

    .line 357
    .line 358
    check-cast p1, Ljava/lang/String;

    .line 359
    .line 360
    :try_start_0
    invoke-static {p1}, Lw02;->Η(Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result p0

    .line 364
    if-eqz p0, :cond_1c

    .line 365
    .line 366
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 367
    .line 368
    .line 369
    move-result p0

    .line 370
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 371
    .line 372
    .line 373
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 374
    :catch_0
    :cond_1c
    if-eqz v0, :cond_1d

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 377
    .line 378
    .line 379
    move-result p0

    .line 380
    goto :goto_a

    .line 381
    :cond_1d
    move p0, p2

    .line 382
    :goto_a
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    return-object p0

    .line 387
    :cond_1e
    :goto_b
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 388
    .line 389
    if-eqz p0, :cond_1f

    .line 390
    .line 391
    check-cast p1, Ljava/lang/Boolean;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    goto :goto_c

    .line 398
    :cond_1f
    instance-of p0, p1, Ljava/lang/Number;

    .line 399
    .line 400
    if-eqz p0, :cond_21

    .line 401
    .line 402
    check-cast p1, Ljava/lang/Number;

    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result p0

    .line 408
    if-eqz p0, :cond_20

    .line 409
    .line 410
    goto :goto_c

    .line 411
    :cond_20
    move v2, v4

    .line 412
    goto :goto_c

    .line 413
    :cond_21
    instance-of p0, p1, Ljava/lang/String;

    .line 414
    .line 415
    if-eqz p0, :cond_20

    .line 416
    .line 417
    const-string p0, "1"

    .line 418
    .line 419
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result p0

    .line 423
    if-nez p0, :cond_22

    .line 424
    .line 425
    check-cast p1, Ljava/lang/String;

    .line 426
    .line 427
    const-string p0, "true"

    .line 428
    .line 429
    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 430
    .line 431
    .line 432
    move-result p0

    .line 433
    if-eqz p0, :cond_20

    .line 434
    .line 435
    :cond_22
    :goto_c
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    return-object p0

    .line 440
    :cond_23
    :goto_d
    instance-of p0, p1, Ljava/lang/Number;

    .line 441
    .line 442
    if-eqz p0, :cond_24

    .line 443
    .line 444
    check-cast p1, Ljava/lang/Number;

    .line 445
    .line 446
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 447
    .line 448
    .line 449
    move-result-wide p0

    .line 450
    goto :goto_e

    .line 451
    :cond_24
    instance-of p0, p1, Ljava/lang/String;

    .line 452
    .line 453
    const-wide/16 p2, 0x0

    .line 454
    .line 455
    if-eqz p0, :cond_26

    .line 456
    .line 457
    check-cast p1, Ljava/lang/String;

    .line 458
    .line 459
    invoke-static {p1, v3}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    if-eqz p0, :cond_25

    .line 464
    .line 465
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 466
    .line 467
    .line 468
    move-result-wide p0

    .line 469
    goto :goto_e

    .line 470
    :cond_25
    move-wide p0, p2

    .line 471
    goto :goto_e

    .line 472
    :cond_26
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 473
    .line 474
    if-eqz p0, :cond_25

    .line 475
    .line 476
    check-cast p1, Ljava/lang/Boolean;

    .line 477
    .line 478
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 479
    .line 480
    .line 481
    move-result p0

    .line 482
    if-eqz p0, :cond_25

    .line 483
    .line 484
    const-wide/16 p0, 0x1

    .line 485
    .line 486
    :goto_e
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    return-object p0

    .line 491
    :cond_27
    :goto_f
    instance-of p0, p1, Ljava/lang/Number;

    .line 492
    .line 493
    if-eqz p0, :cond_28

    .line 494
    .line 495
    check-cast p1, Ljava/lang/Number;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    goto :goto_10

    .line 502
    :cond_28
    instance-of p0, p1, Ljava/lang/String;

    .line 503
    .line 504
    if-eqz p0, :cond_2a

    .line 505
    .line 506
    check-cast p1, Ljava/lang/String;

    .line 507
    .line 508
    invoke-static {p1, v3}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    if-eqz p0, :cond_29

    .line 513
    .line 514
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    goto :goto_10

    .line 519
    :cond_29
    move v2, v4

    .line 520
    goto :goto_10

    .line 521
    :cond_2a
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 522
    .line 523
    if-eqz p0, :cond_29

    .line 524
    .line 525
    check-cast p1, Ljava/lang/Boolean;

    .line 526
    .line 527
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 528
    .line 529
    .line 530
    move-result p0

    .line 531
    if-eqz p0, :cond_29

    .line 532
    .line 533
    :goto_10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 534
    .line 535
    .line 536
    move-result-object p0

    .line 537
    return-object p0
.end method

.method public final varargs invokeUnwrap(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :try_start_0
    array-length p0, p3

    .line 8
    invoke-static {p3, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1, p2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p0, p1

    .line 26
    :goto_0
    throw p0
.end method

.method public final isIntCompat(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    const-class p0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public final isInvalidParamServerError(Ljava/lang/Throwable;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    move v0, p0

    .line 6
    :goto_0
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    if-ge v0, v1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const-string v2, ""

    .line 27
    .line 28
    :cond_0
    const-string v3, ":"

    .line 29
    .line 30
    invoke-static {v1, v3, v2}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "ApiServerException"

    .line 35
    .line 36
    invoke-static {v1, v2, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const-string v2, "error_code = 5"

    .line 43
    .line 44
    invoke-static {v1, v2, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    const-string v2, "error_code=5"

    .line 51
    .line 52
    invoke-static {v1, v2, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    const-string v2, "status_code = 5"

    .line 59
    .line 60
    invoke-static {v1, v2, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    const-string v2, "status_code=5"

    .line 67
    .line 68
    invoke-static {v1, v2, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    :cond_1
    const/4 p0, 0x1

    .line 75
    return p0

    .line 76
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    return p0
.end method

.method public final isLongCompat(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    const-class p0, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public final isNetworkReturn(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p1, "Observable"

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p0, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    const-string p1, "Single"

    .line 18
    .line 19
    invoke-static {p0, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const-string p1, "Maybe"

    .line 26
    .line 27
    invoke-static {p0, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    const-string p1, "Flowable"

    .line 34
    .line 35
    invoke-static {p0, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    const-string p1, "bolts.Task"

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    const-string p1, "retrofit2.Call"

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return v0

    .line 59
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 60
    return p0
.end method

.method public final resolveApiInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->createApiByRetrofitService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->scanStaticApi(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->createApiByRetrofitFactory(Ljava/lang/Class;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public final resolveParamNames(Ljava/lang/reflect/Method;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lg7;->в([Ljava/lang/Object;)Lxm0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    const/16 v1, 0xa

    .line 25
    .line 26
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    move-object v1, p1

    .line 44
    check-cast v1, Lwm0;

    .line 45
    .line 46
    invoke-virtual {v1}, Lwm0;->nextInt()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v1, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, [Ljava/lang/annotation/Annotation;

    .line 60
    .line 61
    if-nez v3, :cond_0

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    new-array v3, v3, [Ljava/lang/annotation/Annotation;

    .line 65
    .line 66
    :cond_0
    invoke-direct {v2, v3, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->queryNameOf([Ljava/lang/annotation/Annotation;Ljava/util/List;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    invoke-static {v1, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    move-object v2, v1

    .line 77
    check-cast v2, Ljava/lang/String;

    .line 78
    .line 79
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    return-object v0
.end method

.method public final resolveParamNames(Ljava/lang/reflect/Method;[Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    invoke-static {p2}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveParamNames(Ljava/lang/reflect/Method;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v0, 0x23

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/16 v0, 0x28

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v1, Luj;

    .line 45
    .line 46
    const/16 v2, 0x9

    .line 47
    .line 48
    invoke-direct {v1, v2}, Luj;-><init>(I)V

    .line 49
    .line 50
    .line 51
    const/16 v2, 0x1e

    .line 52
    .line 53
    const-string v3, ","

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static {v0, v3, v4, v1, v2}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "):"

    .line 61
    .line 62
    invoke-static {p0, v0, v1, p1}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

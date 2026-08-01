.class public final Lhb2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lhb2;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lhb2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhb2;->α:Lhb2;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lhb2;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 13
    .line 14
    return-void
.end method

.method public static α(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0, v0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v0
.end method

.method public static γ(Ljava/lang/ClassLoader;)V
    .locals 14

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~78CB965E478A78D38827E0D26879E5129ED28BC0948C0FBC37EEE6CBB3E95B8A4AC1363A6DDE54331B5A47A070A6589A6520FAB8DF66D7EBF463C6CCECF5668CF5BFAF654DDBA3604FF390D96AB8F3A901AF006B220BE9"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x4

    .line 14
    const-string v1, "re4b6c41332ef57c6"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const-string p0, "39.6+ \u8bc4\u8bba\u5f55\u97f3\u6a21\u5757\u672a\u627e\u5230\uff0c\u8df3\u8fc7\u8bc4\u8bba\u8bed\u97f3\u66ff\u6362"

    .line 20
    .line 21
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object v5, Lkm;->α:Lkm;

    .line 26
    .line 27
    new-instance v6, Luu1;

    .line 28
    .line 29
    sget-object v8, Lib2;->α:Lib2;

    .line 30
    .line 31
    const/4 v12, 0x0

    .line 32
    const/16 v13, 0xb

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    const-class v9, Lib2;

    .line 36
    .line 37
    const-string v10, "canReadHostVoiceInfo"

    .line 38
    .line 39
    const-string v11, "canReadHostVoiceInfo$app(Ljava/lang/Class;)Z"

    .line 40
    .line 41
    invoke-direct/range {v6 .. v13}, Luu1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 42
    .line 43
    .line 44
    move-object v11, v6

    .line 45
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    new-instance v4, Lhm;

    .line 57
    .line 58
    invoke-direct {v4, v0}, Lhm;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Ly30;

    .line 62
    .line 63
    invoke-direct {v6, v3, v12, v4}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 64
    .line 65
    .line 66
    new-instance v3, Lhm;

    .line 67
    .line 68
    const/4 v4, 0x5

    .line 69
    invoke-direct {v3, v4}, Lhm;-><init>(I)V

    .line 70
    .line 71
    .line 72
    new-instance v13, Lt52;

    .line 73
    .line 74
    invoke-direct {v13, v6, v3}, Lt52;-><init>(Lss1;La80;)V

    .line 75
    .line 76
    .line 77
    new-instance v3, Lng;

    .line 78
    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v10, 0x4

    .line 81
    const/4 v4, 0x1

    .line 82
    const-class v6, Lkm;

    .line 83
    .line 84
    const-string v7, "isScannableHostType"

    .line 85
    .line 86
    const-string v8, "isScannableHostType(Ljava/lang/Class;)Z"

    .line 87
    .line 88
    invoke-direct/range {v3 .. v10}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 89
    .line 90
    .line 91
    new-instance v4, Ly30;

    .line 92
    .line 93
    const/4 v5, 0x1

    .line 94
    invoke-direct {v4, v13, v5, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v4}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    new-instance v5, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    new-instance v6, Lw6;

    .line 111
    .line 112
    invoke-direct {v6}, Lw6;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, p0}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    invoke-virtual {v6}, Lw6;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_2

    .line 123
    .line 124
    invoke-virtual {v6}, Lw6;->removeFirst()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Ljava/lang/Class;

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    array-length v7, p0

    .line 138
    move v8, v12

    .line 139
    :goto_0
    if-ge v8, v7, :cond_1

    .line 140
    .line 141
    aget-object v9, p0, v8

    .line 142
    .line 143
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v9}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v8, v8, 0x1

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_2
    invoke-static {v4, v5}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p0, v3}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    new-instance v3, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_3

    .line 185
    .line 186
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Ljava/lang/Class;

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {v3, v4}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_5

    .line 224
    .line 225
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    move-object v5, v4

    .line 230
    check-cast v5, Ljava/lang/reflect/Method;

    .line 231
    .line 232
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-static {v5, v11}, Lj81;->Ζ(Ljava/lang/reflect/Method;La80;)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-eqz v5, :cond_4

    .line 240
    .line 241
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_5
    invoke-static {p0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    new-instance v3, Ljava/util/HashSet;

    .line 254
    .line 255
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 256
    .line 257
    .line 258
    new-instance v4, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    :cond_6
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-eqz v5, :cond_7

    .line 272
    .line 273
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    move-object v6, v5

    .line 278
    check-cast v6, Ljava/lang/reflect/Method;

    .line 279
    .line 280
    invoke-static {v6}, Lhb2;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-eqz v6, :cond_6

    .line 289
    .line 290
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    if-eqz p0, :cond_8

    .line 299
    .line 300
    const-string p0, "39.6+ \u8bc4\u8bba\u5b8c\u6210\u56de\u8c03\u7ed3\u6784\u672a\u547d\u4e2d\uff0c\u4fdd\u7559\u5bbf\u4e3b\u539f\u53d1\u9001"

    .line 301
    .line 302
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-eqz v3, :cond_9

    .line 315
    .line 316
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    check-cast v3, Ljava/lang/reflect/Method;

    .line 321
    .line 322
    sget-object v5, Lya2;->ζ:Lya2;

    .line 323
    .line 324
    const-string v6, "comment-390601"

    .line 325
    .line 326
    sget-object v7, Lhb2;->α:Lhb2;

    .line 327
    .line 328
    invoke-virtual {v7, v3, v5, v6}, Lhb2;->β(Ljava/lang/reflect/Method;Lya2;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 333
    .line 334
    .line 335
    move-result p0

    .line 336
    const-string v3, "39.6+ \u8bc4\u8bba\u8bed\u97f3\u66ff\u6362\u5df2\u5b89\u88c5\uff0c\u76ee\u6807\u6570="

    .line 337
    .line 338
    invoke-static {v3, p0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    return-void
.end method

.method public static δ(Ljava/lang/Class;)I
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_6

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "java."

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    array-length v2, p0

    .line 41
    :goto_0
    if-ge v1, v2, :cond_2

    .line 42
    .line 43
    aget-object v3, p0, v1

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v4, Luu1;

    .line 49
    .line 50
    sget-object v6, Lib2;->α:Lib2;

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    const/16 v11, 0xc

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    const-class v7, Lib2;

    .line 57
    .line 58
    const-string v8, "canReadHostVoiceInfo"

    .line 59
    .line 60
    const-string v9, "canReadHostVoiceInfo$app(Ljava/lang/Class;)Z"

    .line 61
    .line 62
    invoke-direct/range {v4 .. v11}, Luu1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3, v4}, Lj81;->Ζ(Ljava/lang/reflect/Method;La80;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v1, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v3, v2

    .line 102
    check-cast v3, Ljava/lang/reflect/Method;

    .line 103
    .line 104
    invoke-static {v3}, Lhb2;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_3

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Ljava/lang/reflect/Method;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    sget-object v2, Lya2;->η:Lya2;

    .line 138
    .line 139
    const-string v3, "im-390601"

    .line 140
    .line 141
    sget-object v4, Lhb2;->α:Lhb2;

    .line 142
    .line 143
    invoke-virtual {v4, v0, v2, v3}, Lhb2;->β(Ljava/lang/reflect/Method;Lya2;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    return p0

    .line 152
    :cond_6
    :goto_3
    return v1
.end method

.method public static ε(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF50F69EC092027CD8E9B672D52762657C36503D2A32ECDF4324524659B85D"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x4

    .line 14
    const-string v1, "re4b6c41332ef57c6"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const-string p0, "39.6+ \u79c1\u4fe1 AudioLogic \u672a\u627e\u5230\uff0c\u8df3\u8fc7\u79c1\u4fe1\u8bed\u97f3\u66ff\u6362"

    .line 20
    .line 21
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {p0}, Lhb2;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v4, Lf7;

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    invoke-direct {v4, v5, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Lj72;

    .line 36
    .line 37
    const/16 v5, 0x17

    .line 38
    .line 39
    invoke-direct {v3, v5}, Lj72;-><init>(I)V

    .line 40
    .line 41
    .line 42
    new-instance v5, Ly30;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-direct {v5, v4, v6, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 46
    .line 47
    .line 48
    sget-object v3, Lgb2;->ε:Lgb2;

    .line 49
    .line 50
    new-instance v4, Lt52;

    .line 51
    .line 52
    invoke-direct {v4, v5, v3}, Lt52;-><init>(Lss1;La80;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v4}, Lus1;->υ(Lss1;)Lcu;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Lcu;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    move v4, v6

    .line 64
    :goto_0
    move-object v5, v3

    .line 65
    check-cast v5, Lσ;

    .line 66
    .line 67
    invoke-virtual {v5}, Lσ;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_1

    .line 72
    .line 73
    invoke-virtual {v5}, Lσ;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Ljava/lang/Class;

    .line 78
    .line 79
    invoke-static {v5}, Lhb2;->δ(Ljava/lang/Class;)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    add-int/2addr v4, v5

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    sget-object v3, Lxq0;->α:Lxq0;

    .line 86
    .line 87
    new-instance v5, Lfb2;

    .line 88
    .line 89
    invoke-direct {v5, v6}, Lfb2;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, p0, v5}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 93
    .line 94
    .line 95
    new-instance p0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v3, "39.6+ \u79c1\u4fe1\u8bed\u97f3\u66ff\u6362\u6865\u5df2\u5b89\u88c5\uff0c\u9759\u6001\u76ee\u6807\u6570="

    .line 98
    .line 99
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public static ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x28

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Lj72;

    .line 42
    .line 43
    const/16 v2, 0x18

    .line 44
    .line 45
    invoke-direct {v1, v2}, Lj72;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/16 v2, 0x1e

    .line 49
    .line 50
    const-string v3, ","

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static {p0, v3, v4, v1, v2}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/16 v1, 0x29

    .line 58
    .line 59
    invoke-static {v0, p0, v1}, Lnx;->λ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method


# virtual methods
.method public final β(Ljava/lang/reflect/Method;Lya2;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lhb2;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lhb2;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lxq0;->α:Lxq0;

    .line 19
    .line 20
    new-instance v3, Lqg;

    .line 21
    .line 22
    const/16 v4, 0x9

    .line 23
    .line 24
    invoke-direct {v3, p0, p2, p3, v4}, Lqg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p1, v3}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    new-instance p1, Leo1;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p0, p1

    .line 39
    :goto_0
    instance-of p1, p0, Leo1;

    .line 40
    .line 41
    const-string p2, "re4b6c41332ef57c6"

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    move-object p1, p0

    .line 46
    check-cast p1, Ll01;

    .line 47
    .line 48
    const-string p1, "\u5df2\u5b89\u88c5\u7ed3\u6784\u5316\u8bed\u97f3\u5b8c\u6210 Hook: "

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p2, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const-string p1, "\u7ed3\u6784\u5316\u8bed\u97f3\u5b8c\u6210 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p2, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_1
    return-void
.end method

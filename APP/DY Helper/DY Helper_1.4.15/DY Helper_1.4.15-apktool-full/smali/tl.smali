.class public final Ltl;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Landroid/util/LruCache;

.field public static final β:Lym1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/util/LruCache;

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ltl;->α:Landroid/util/LruCache;

    .line 9
    .line 10
    new-instance v0, Lym1;

    .line 11
    .line 12
    const-string v1, "tos-cn-i-[^/]+/([^~/?#]+)~tplv"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ltl;->β:Lym1;

    .line 18
    .line 19
    return-void
.end method

.method public static final α(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance p1, Leo1;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, p1

    .line 17
    :goto_0
    instance-of p1, p0, Leo1;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object v0, p0

    .line 23
    :goto_1
    return-object v0
.end method

.method public static β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v0, p0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    const/4 v3, 0x0

    .line 12
    if-ge v2, v0, :cond_4

    .line 13
    .line 14
    aget-object v4, p0, v2

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v6, v5

    .line 24
    move v7, v1

    .line 25
    :goto_1
    if-ge v7, v6, :cond_3

    .line 26
    .line 27
    aget-object v8, v5, v7

    .line 28
    .line 29
    :try_start_0
    invoke-static {v8}, Lln0;->Ζ(Ljava/lang/annotation/Annotation;)Lwf;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-static {v9}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    const-string v10, "value"

    .line 38
    .line 39
    invoke-virtual {v9, v10, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-virtual {v9, v8, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    instance-of v9, v8, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v9, :cond_0

    .line 50
    .line 51
    check-cast v8, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catchall_0
    move-exception v8

    .line 55
    goto :goto_2

    .line 56
    :cond_0
    move-object v8, v3

    .line 57
    goto :goto_3

    .line 58
    :goto_2
    new-instance v9, Leo1;

    .line 59
    .line 60
    invoke-direct {v9, v8}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object v8, v9

    .line 64
    :goto_3
    instance-of v9, v8, Leo1;

    .line 65
    .line 66
    if-eqz v9, :cond_1

    .line 67
    .line 68
    move-object v8, v3

    .line 69
    :cond_1
    check-cast v8, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v8, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_2

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    move-object v4, v3

    .line 85
    :goto_4
    if-eqz v4, :cond_5

    .line 86
    .line 87
    const/4 p0, 0x1

    .line 88
    invoke-virtual {v4, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 89
    .line 90
    .line 91
    move-object v3, v4

    .line 92
    :cond_5
    return-object v3
.end method

.method public static γ()Z
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "comment_image_watermark_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Leo1;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v0, v1

    .line 20
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    instance-of v2, v0, Leo1;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method

.method public static δ(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-static {}, Ltl;->γ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    const-string v0, "watermark"

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-string v3, "DYHelper_ImageWatermark"

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Ltl;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    const-string p0, "\u62e6\u622a\u901a\u7528\u6c34\u5370\u53c2\u6570"

    .line 33
    .line 34
    invoke-static {v3, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_1
    const-string v2, "douyinpic.com"

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-static {p0, v2, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_10

    .line 46
    .line 47
    const-string v2, "tos-cn-i-"

    .line 48
    .line 49
    invoke-static {p0, v2, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_10

    .line 54
    .line 55
    const-string v2, "~tplv"

    .line 56
    .line 57
    invoke-static {p0, v2, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_2
    sget-object v2, Ltl;->β:Lym1;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v2, v2, Lym1;->ε:Ljava/util/regex/Pattern;

    .line 71
    .line 72
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v4, p0}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_10

    .line 84
    .line 85
    iget-object v2, v2, Lix0;->γ:Lhx0;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Lhx0;->β(I)Lfx0;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-eqz v2, :cond_10

    .line 92
    .line 93
    iget-object v2, v2, Lfx0;->α:Ljava/lang/String;

    .line 94
    .line 95
    const/16 v5, 0x3f

    .line 96
    .line 97
    const/4 v6, 0x6

    .line 98
    invoke-static {p0, v5, v4, v6}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-gez v5, :cond_3

    .line 103
    .line 104
    sget-object v4, Ljz;->ε:Ljz;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    add-int/2addr v5, v1

    .line 108
    const/4 v7, 0x4

    .line 109
    const/16 v8, 0x23

    .line 110
    .line 111
    invoke-static {p0, v8, v5, v7}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-ltz v7, :cond_4

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    :goto_0
    invoke-virtual {p0, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    new-array v7, v1, [C

    .line 127
    .line 128
    const/16 v8, 0x26

    .line 129
    .line 130
    aput-char v8, v7, v4

    .line 131
    .line 132
    invoke-static {v5, v7, v4, v6}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    new-instance v5, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    :cond_5
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-eqz v6, :cond_6

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    move-object v7, v6

    .line 156
    check-cast v7, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    if-nez v7, :cond_5

    .line 163
    .line 164
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_6
    move-object v4, v5

    .line 169
    :goto_2
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    const-string v6, "download-webp"

    .line 174
    .line 175
    sget-object v7, Ltl;->α:Landroid/util/LruCache;

    .line 176
    .line 177
    if-eqz v5, :cond_7

    .line 178
    .line 179
    goto/16 :goto_3

    .line 180
    .line 181
    :cond_7
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_d

    .line 190
    .line 191
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    check-cast v5, Ljava/lang/String;

    .line 196
    .line 197
    const-string v8, "="

    .line 198
    .line 199
    const-string v9, ""

    .line 200
    .line 201
    invoke-static {v5, v8, v9}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 206
    .line 207
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-static {v5, v8, v9}, Lq02;->х(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v5, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    const-string v8, "sc"

    .line 226
    .line 227
    invoke-virtual {v10, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-eqz v8, :cond_9

    .line 232
    .line 233
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    if-nez v8, :cond_a

    .line 238
    .line 239
    :cond_9
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-eqz v8, :cond_8

    .line 244
    .line 245
    const-string v8, "1"

    .line 246
    .line 247
    const-string v9, "true"

    .line 248
    .line 249
    filled-new-array {v8, v9, v0}, [Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    invoke-static {v8}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    invoke-interface {v8, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_8

    .line 262
    .line 263
    :cond_a
    invoke-virtual {v7, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {p0, v6, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-nez v1, :cond_b

    .line 274
    .line 275
    if-eqz v0, :cond_b

    .line 276
    .line 277
    const-string p0, "\u62e6\u622a\u6c34\u5370\u9884\u89c8\uff0c\u66ff\u6362\u4e3a\u7f13\u5b58\u539f\u56fe: ID="

    .line 278
    .line 279
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-static {v3, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    return-object v0

    .line 287
    :cond_b
    invoke-static {p0}, Ltl;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-eqz v0, :cond_c

    .line 292
    .line 293
    const-string p0, "\u62e6\u622a\u6c34\u5370\u53c2\u6570\uff0c\u4fdd\u7559\u539f\u94fe\u8def: ID="

    .line 294
    .line 295
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-static {v3, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-object v0

    .line 303
    :cond_c
    const-string v0, "\u7f13\u5b58\u4e2d\u672a\u627e\u5230\u539f\u56fe\uff0c\u4fdd\u6301\u539f URL: ID="

    .line 304
    .line 305
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v3, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-object p0

    .line 313
    :cond_d
    :goto_3
    invoke-virtual {v7, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    check-cast v0, Ljava/lang/String;

    .line 318
    .line 319
    if-eqz v0, :cond_f

    .line 320
    .line 321
    invoke-static {v0, v6, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_e

    .line 326
    .line 327
    invoke-static {p0, v6, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-nez v0, :cond_e

    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_e
    return-object p0

    .line 335
    :cond_f
    :goto_4
    invoke-virtual {v7, v2, p0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    :cond_10
    :goto_5
    return-object p0
.end method

.method public static ε(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    const/16 v0, 0x3f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-static {p0, v0, v1, v2}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    add-int/lit8 v3, v0, 0x1

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    const/16 v5, 0x23

    .line 17
    .line 18
    invoke-static {p0, v5, v3, v4}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-ltz v4, :cond_1

    .line 27
    .line 28
    move v5, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    :goto_0
    invoke-virtual {p0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v5, ""

    .line 39
    .line 40
    if-ltz v4, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object p0, v5

    .line 48
    :goto_1
    const/4 v4, 0x1

    .line 49
    new-array v6, v4, [C

    .line 50
    .line 51
    const/16 v7, 0x26

    .line 52
    .line 53
    aput-char v7, v6, v1

    .line 54
    .line 55
    invoke-static {v3, v6, v1, v2}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v6, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move v3, v1

    .line 69
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_8

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    move-object v8, v7

    .line 80
    check-cast v8, Ljava/lang/String;

    .line 81
    .line 82
    const-string v9, "="

    .line 83
    .line 84
    invoke-static {v8, v9, v5}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 89
    .line 90
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {v8, v9, v5}, Lq02;->х(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v8, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const-string v9, "sc"

    .line 109
    .line 110
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    const-string v11, "watermark"

    .line 115
    .line 116
    if-eqz v9, :cond_4

    .line 117
    .line 118
    invoke-virtual {v8, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-nez v9, :cond_5

    .line 123
    .line 124
    :cond_4
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_6

    .line 129
    .line 130
    const-string v9, "1"

    .line 131
    .line 132
    const-string v10, "true"

    .line 133
    .line 134
    filled-new-array {v9, v10, v11}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-static {v9}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-interface {v9, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_6

    .line 147
    .line 148
    :cond_5
    move v8, v4

    .line 149
    goto :goto_3

    .line 150
    :cond_6
    move v8, v1

    .line 151
    :goto_3
    if-eqz v8, :cond_7

    .line 152
    .line 153
    move v3, v4

    .line 154
    :cond_7
    if-nez v8, :cond_3

    .line 155
    .line 156
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    if-nez v3, :cond_9

    .line 161
    .line 162
    :goto_4
    const/4 p0, 0x0

    .line 163
    return-object p0

    .line 164
    :cond_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :cond_a
    const/4 v11, 0x0

    .line 176
    const/16 v12, 0x3e

    .line 177
    .line 178
    const-string v7, "&"

    .line 179
    .line 180
    const/4 v8, 0x0

    .line 181
    const/4 v9, 0x0

    .line 182
    const/4 v10, 0x0

    .line 183
    invoke-static/range {v6 .. v12}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    new-instance v2, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v0, "?"

    .line 196
    .line 197
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    return-object p0
.end method

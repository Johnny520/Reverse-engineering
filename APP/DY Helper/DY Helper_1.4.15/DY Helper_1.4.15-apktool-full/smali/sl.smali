.class public final Lsl;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Ljava/lang/reflect/Field;

.field public final synthetic β:Ljava/lang/reflect/Field;

.field public final synthetic γ:Ljava/lang/reflect/Field;

.field public final synthetic δ:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsl;->α:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    iput-object p2, p0, Lsl;->β:Ljava/lang/reflect/Field;

    .line 4
    .line 5
    iput-object p3, p0, Lsl;->γ:Ljava/lang/reflect/Field;

    .line 6
    .line 7
    iput-object p4, p0, Lsl;->δ:Ljava/lang/reflect/Field;

    .line 8
    .line 9
    invoke-direct {p0}, Lm01;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ltl;->α:Landroid/util/LruCache;

    .line 5
    .line 6
    invoke-static {}, Ltl;->γ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_9

    .line 13
    .line 14
    :cond_0
    iget-object v0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto/16 :goto_9

    .line 19
    .line 20
    :cond_1
    iget-object v1, p1, Lk01;->β:Ljava/lang/Object;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    goto/16 :goto_9

    .line 25
    .line 26
    :cond_2
    iget-object v2, p0, Lsl;->α:Ljava/lang/reflect/Field;

    .line 27
    .line 28
    invoke-static {v1, v2}, Ltl;->α(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    goto/16 :goto_9

    .line 35
    .line 36
    :cond_3
    if-eq v0, v2, :cond_4

    .line 37
    .line 38
    goto/16 :goto_9

    .line 39
    .line 40
    :cond_4
    iget-object v0, p0, Lsl;->β:Ljava/lang/reflect/Field;

    .line 41
    .line 42
    invoke-static {v1, v0}, Ltl;->α(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v2, p0, Lsl;->γ:Ljava/lang/reflect/Field;

    .line 47
    .line 48
    invoke-static {v1, v2}, Ltl;->α(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object p0, p0, Lsl;->δ:Ljava/lang/reflect/Field;

    .line 53
    .line 54
    invoke-static {v1, p0}, Ltl;->α(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    filled-new-array {v0, v2, p0}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :cond_5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x0

    .line 75
    if-eqz v0, :cond_13

    .line 76
    .line 77
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v2, Ltl;->α:Landroid/util/LruCache;

    .line 82
    .line 83
    const-string v2, "urlList"

    .line 84
    .line 85
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 90
    .line 91
    .line 92
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception v3

    .line 95
    new-instance v4, Leo1;

    .line 96
    .line 97
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    move-object v3, v4

    .line 101
    :goto_1
    instance-of v4, v3, Leo1;

    .line 102
    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    move-object v3, v1

    .line 106
    :cond_6
    check-cast v3, Ljava/lang/reflect/Field;

    .line 107
    .line 108
    sget-object v4, Ljz;->ε:Ljz;

    .line 109
    .line 110
    if-nez v3, :cond_8

    .line 111
    .line 112
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v3, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    const/4 v3, 0x1

    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :catchall_1
    move-exception v2

    .line 126
    new-instance v3, Leo1;

    .line 127
    .line 128
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    move-object v2, v3

    .line 132
    :goto_2
    instance-of v3, v2, Leo1;

    .line 133
    .line 134
    if-eqz v3, :cond_7

    .line 135
    .line 136
    move-object v2, v1

    .line 137
    :cond_7
    move-object v3, v2

    .line 138
    check-cast v3, Ljava/lang/reflect/Field;

    .line 139
    .line 140
    if-nez v3, :cond_8

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_8
    :try_start_2
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 147
    goto :goto_3

    .line 148
    :catchall_2
    move-exception v2

    .line 149
    new-instance v3, Leo1;

    .line 150
    .line 151
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    move-object v2, v3

    .line 155
    :goto_3
    instance-of v3, v2, Leo1;

    .line 156
    .line 157
    if-eqz v3, :cond_9

    .line 158
    .line 159
    move-object v2, v1

    .line 160
    :cond_9
    instance-of v3, v2, Ljava/util/List;

    .line 161
    .line 162
    if-eqz v3, :cond_a

    .line 163
    .line 164
    check-cast v2, Ljava/util/List;

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_a
    move-object v2, v1

    .line 168
    :goto_4
    if-eqz v2, :cond_e

    .line 169
    .line 170
    new-instance v3, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    :cond_b
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_d

    .line 184
    .line 185
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    instance-of v6, v5, Ljava/lang/String;

    .line 190
    .line 191
    if-eqz v6, :cond_c

    .line 192
    .line 193
    check-cast v5, Ljava/lang/String;

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_c
    move-object v5, v1

    .line 197
    :goto_6
    if-eqz v5, :cond_b

    .line 198
    .line 199
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_d
    move-object v1, v3

    .line 204
    :cond_e
    if-nez v1, :cond_f

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_f
    move-object v4, v1

    .line 208
    :goto_7
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_10

    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_10
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    :cond_11
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_5

    .line 225
    .line 226
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-nez v3, :cond_11

    .line 237
    .line 238
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 239
    .line 240
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    const-string v3, "watermark"

    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-nez v3, :cond_11

    .line 255
    .line 256
    const-string v3, "download-webp"

    .line 257
    .line 258
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-nez v3, :cond_11

    .line 263
    .line 264
    const-string v3, "has_watermark=1"

    .line 265
    .line 266
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-nez v3, :cond_11

    .line 271
    .line 272
    const-string v3, "is_watermarked=1"

    .line 273
    .line 274
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-eqz v2, :cond_12

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_12
    move-object v1, v0

    .line 282
    :cond_13
    if-nez v1, :cond_14

    .line 283
    .line 284
    :goto_9
    return-void

    .line 285
    :cond_14
    invoke-virtual {p1, v1}, Lk01;->α(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    const-string p0, "DYHelper_ImageWatermark"

    .line 289
    .line 290
    const-string p1, "\u66ff\u6362\u8bc4\u8bba\u56fe\u7247\u4fdd\u5b58\u6e90: download_url -> \u539f\u56fe\u5019\u9009"

    .line 291
    .line 292
    invoke-static {p0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void
.end method

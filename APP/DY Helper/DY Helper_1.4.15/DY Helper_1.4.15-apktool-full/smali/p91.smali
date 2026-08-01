.class public abstract Lp91;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public static Α(Landroid/app/Activity;)Ljava/util/List;
    .locals 8

    .line 1
    const-string v0, "DYHelper: \u626b\u63cf\u5230 "

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :cond_0
    move-object p0, v2

    .line 27
    :goto_0
    instance-of v3, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    check-cast p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object p0, v2

    .line 35
    :goto_1
    if-nez p0, :cond_2

    .line 36
    .line 37
    sget-object p0, Ljz;->ε:Ljz;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {p0, v3, v4}, Lp91;->μ(Landroid/view/View;Ljava/util/ArrayList;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    new-instance v4, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, " \u4e2a RecyclerView"

    .line 62
    .line 63
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_8

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    :try_start_1
    invoke-static {v0}, Lp91;->ξ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-nez v0, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-static {v0}, Lp91;->ζ(Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-nez v3, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    new-instance v5, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v6, "DYHelper: Adapter ["

    .line 122
    .line 123
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v0, "] \u6570\u636e\u91cf: "

    .line 130
    .line 131
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_3

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-eqz v3, :cond_6

    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    const-string v5, "Aweme"

    .line 169
    .line 170
    const/4 v6, 0x1

    .line 171
    invoke-static {v4, v5, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 172
    .line 173
    .line 174
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 175
    if-eqz v4, :cond_6

    .line 176
    .line 177
    :try_start_2
    sget-object v4, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 178
    .line 179
    invoke-static {v3}, Lb10;->υ(Ljava/lang/Object;)Lf8;

    .line 180
    .line 181
    .line 182
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 183
    goto :goto_4

    .line 184
    :catchall_1
    move-exception v3

    .line 185
    :try_start_3
    new-instance v4, Leo1;

    .line 186
    .line 187
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    move-object v3, v4

    .line 191
    :goto_4
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    if-nez v4, :cond_7

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_7
    const-string v3, "DYHelper"

    .line 199
    .line 200
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    new-instance v6, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v7, "[downoload dev][RV-SCAN-PARSE-FAIL] "

    .line 207
    .line 208
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-static {v3, v5, v4}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    move-object v3, v2

    .line 222
    :goto_5
    check-cast v3, Lf8;

    .line 223
    .line 224
    if-eqz v3, :cond_6

    .line 225
    .line 226
    iget-object v4, v3, Lf8;->ζ:Lh8;

    .line 227
    .line 228
    sget-object v5, Lh8;->ι:Lh8;

    .line 229
    .line 230
    if-eq v4, v5, :cond_6

    .line 231
    .line 232
    iget-object v4, v3, Lf8;->θ:Ljava/lang/String;

    .line 233
    .line 234
    if-eqz v4, :cond_6

    .line 235
    .line 236
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :catchall_2
    move-exception v3

    .line 241
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    new-instance v4, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    const-string v5, "DYHelper: \u5355\u6761 Aweme \u63d0\u53d6\u5931\u8d25: "

    .line 251
    .line 252
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-static {v3}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :catchall_3
    move-exception v0

    .line 267
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    new-instance v3, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const-string v4, "DYHelper: \u5904\u7406 RecyclerView \u5931\u8d25: "

    .line 277
    .line 278
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 289
    .line 290
    .line 291
    goto/16 :goto_2

    .line 292
    .line 293
    :goto_6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    const-string v0, "DYHelper: \u626b\u63cf\u5f02\u5e38: "

    .line 298
    .line 299
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    :cond_8
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string v2, "DYHelper: \u5171\u63d0\u53d6\u5230 "

    .line 309
    .line 310
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string p0, " \u4e2a\u6709\u6548 Aweme"

    .line 317
    .line 318
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    check-cast p0, Ljava/lang/Iterable;

    .line 336
    .line 337
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0
.end method

.method public static final Β(Landroid/text/Spannable;JII)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x10

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 8
    .line 9
    invoke-static {p1, p2}, Lkn0;->Τ(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/16 p1, 0x21

    .line 17
    .line 18
    invoke-interface {p0, v0, p3, p4, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static final Γ(Landroid/text/Spannable;JLyr;II)V
    .locals 6

    .line 1
    invoke-static {p1, p2}, Ly32;->β(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x100000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lz32;->α(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/16 v3, 0x21

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    .line 19
    .line 20
    invoke-interface {p3, p1, p2}, Lyr;->д(J)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Ljx0;->в(F)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {v0, p1, p2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v0, p4, p5, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-wide v4, 0x200000000L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1, v4, v5}, Lz32;->α(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    .line 48
    .line 49
    invoke-static {p1, p2}, Ly32;->γ(J)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-direct {p3, p1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, p3, p4, p5, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public static final Δ(Landroid/text/Spannable;Lav0;II)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p1, Lav0;->ε:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lzu0;

    .line 31
    .line 32
    iget-object v1, v1, Lzu0;->α:Ljava/util/Locale;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    new-array p1, p1, [Ljava/util/Locale;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, [Ljava/util/Locale;

    .line 46
    .line 47
    array-length v0, p1

    .line 48
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, [Ljava/util/Locale;

    .line 53
    .line 54
    new-instance v0, Landroid/os/LocaleList;

    .line 55
    .line 56
    invoke-direct {v0, p1}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Landroid/text/style/LocaleSpan;

    .line 60
    .line 61
    invoke-direct {p1, v0}, Landroid/text/style/LocaleSpan;-><init>(Landroid/os/LocaleList;)V

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x21

    .line 65
    .line 66
    invoke-interface {p0, p1, p2, p3, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void
.end method

.method public static final Ε(Lzn1;)Lzn1;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lzn1;->δ()Lyn1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lv62;

    .line 9
    .line 10
    iget-object p0, p0, Lzn1;->λ:Lbo1;

    .line 11
    .line 12
    invoke-virtual {p0}, Lbo1;->θ()Lez0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Lbo1;->η()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-direct {v1, v2, v3, v4}, Lv62;-><init>(Lez0;J)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lyn1;->η:Lbo1;

    .line 24
    .line 25
    invoke-virtual {v0}, Lyn1;->α()Lzn1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static Ζ(ILp70;Ljava/lang/String;)V
    .locals 2

    .line 1
    and-int/lit8 p0, p0, 0x2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p0, v0

    .line 9
    :goto_0
    new-instance v1, Li42;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Li42;-><init>(Lp70;)V

    .line 12
    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {v1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static Η(Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lorg/json/JSONObject;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/util/Map;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :try_start_0
    check-cast p0, Ljava/util/Map;

    .line 14
    .line 15
    new-instance v0, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-static {p0}, Lp91;->Ι(Ljava/util/Map;)Lzw0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    new-instance v0, Leo1;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    instance-of p0, v0, Leo1;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v1, v0

    .line 37
    :goto_1
    check-cast v1, Lorg/json/JSONObject;

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    :try_start_1
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    new-instance v0, Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception p0

    .line 53
    new-instance v0, Leo1;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_2
    instance-of p0, v0, Leo1;

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move-object v1, v0

    .line 64
    :goto_3
    check-cast v1, Lorg/json/JSONObject;

    .line 65
    .line 66
    :cond_4
    :goto_4
    return-object v1
.end method

.method public static Θ(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/util/List;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/util/Collection;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    instance-of v0, p0, [Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    check-cast p0, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static Ι(Ljava/util/Map;)Lzw0;
    .locals 3

    .line 1
    new-instance v0, Lzw0;

    .line 2
    .line 3
    invoke-direct {v0}, Lzw0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v2, v1}, Lzw0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Lzw0;->β()Lzw0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static α(Ljava/lang/String;Lw32;JLzr;Lf50;I)Ls2;
    .locals 7

    .line 1
    move-object v1, p0

    .line 2
    new-instance p0, Ls2;

    .line 3
    .line 4
    new-instance v0, Lw2;

    .line 5
    .line 6
    sget-object v3, Ljz;->ε:Ljz;

    .line 7
    .line 8
    move-object v4, v3

    .line 9
    move-object v2, p1

    .line 10
    move-object v6, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-direct/range {v0 .. v6}, Lw2;-><init>(Ljava/lang/String;Lw32;Ljava/util/List;Ljava/util/List;Lf50;Lyr;)V

    .line 13
    .line 14
    .line 15
    move-wide p4, p2

    .line 16
    move-object p1, v0

    .line 17
    const/4 p3, 0x1

    .line 18
    move p2, p6

    .line 19
    invoke-direct/range {p0 .. p5}, Ls2;-><init>(Lw2;IIJ)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public static final β(Lyp0;Z)Lbs1;
    .locals 8

    .line 1
    iget-object v0, p0, Lyp0;->Κ:Lk31;

    .line 2
    .line 3
    iget-object v0, v0, Lk31;->ζ:Lq01;

    .line 4
    .line 5
    iget v1, v0, Lq01;->θ:I

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_8

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_8

    .line 13
    .line 14
    iget v1, v0, Lq01;->η:I

    .line 15
    .line 16
    and-int/lit8 v1, v1, 0x8

    .line 17
    .line 18
    if-eqz v1, :cond_7

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    move-object v3, v2

    .line 22
    :goto_1
    if-eqz v1, :cond_7

    .line 23
    .line 24
    instance-of v4, v1, Lzr1;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    goto :goto_4

    .line 30
    :cond_0
    iget v4, v1, Lq01;->η:I

    .line 31
    .line 32
    and-int/lit8 v4, v4, 0x8

    .line 33
    .line 34
    if-eqz v4, :cond_6

    .line 35
    .line 36
    instance-of v4, v1, Lya;

    .line 37
    .line 38
    if-eqz v4, :cond_6

    .line 39
    .line 40
    move-object v4, v1

    .line 41
    check-cast v4, Lya;

    .line 42
    .line 43
    iget-object v4, v4, Lya;->υ:Lq01;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    :goto_2
    const/4 v6, 0x1

    .line 47
    if-eqz v4, :cond_5

    .line 48
    .line 49
    iget v7, v4, Lq01;->η:I

    .line 50
    .line 51
    and-int/lit8 v7, v7, 0x8

    .line 52
    .line 53
    if-eqz v7, :cond_4

    .line 54
    .line 55
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    if-ne v5, v6, :cond_1

    .line 58
    .line 59
    move-object v1, v4

    .line 60
    goto :goto_3

    .line 61
    :cond_1
    if-nez v3, :cond_2

    .line 62
    .line 63
    new-instance v3, Lk21;

    .line 64
    .line 65
    const/16 v6, 0x10

    .line 66
    .line 67
    new-array v6, v6, [Lq01;

    .line 68
    .line 69
    invoke-direct {v3, v6}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v1, v2

    .line 78
    :cond_3
    invoke-virtual {v3, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    :goto_3
    iget-object v4, v4, Lq01;->κ:Lq01;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    if-ne v5, v6, :cond_6

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    invoke-static {v3}, Lh62;->γ(Lk21;)Lq01;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_1

    .line 92
    :cond_7
    iget v1, v0, Lq01;->θ:I

    .line 93
    .line 94
    and-int/lit8 v1, v1, 0x8

    .line 95
    .line 96
    if-eqz v1, :cond_8

    .line 97
    .line 98
    iget-object v0, v0, Lq01;->κ:Lq01;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_8
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    check-cast v2, Lzr1;

    .line 105
    .line 106
    check-cast v2, Lq01;

    .line 107
    .line 108
    iget-object v0, v2, Lq01;->ε:Lq01;

    .line 109
    .line 110
    invoke-virtual {p0}, Lyp0;->υ()Lxr1;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-nez v1, :cond_9

    .line 115
    .line 116
    new-instance v1, Lxr1;

    .line 117
    .line 118
    invoke-direct {v1}, Lxr1;-><init>()V

    .line 119
    .line 120
    .line 121
    :cond_9
    new-instance v2, Lbs1;

    .line 122
    .line 123
    invoke-direct {v2, v0, p1, p0, v1}, Lbs1;-><init>(Lq01;ZLyp0;Lxr1;)V

    .line 124
    .line 125
    .line 126
    return-object v2
.end method

.method public static final γ(Ljava/util/logging/Logger;Lt22;Lw22;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p2, p2, Lw22;->β:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 p2, 0x20

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string p3, "%-22s"

    .line 26
    .line 27
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, ": "

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Lt22;->α:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static δ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public static final ε(II)V
    .locals 3

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    if-lez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, " must be greater than zero."

    .line 7
    .line 8
    if-eq p0, p1, :cond_1

    .line 9
    .line 10
    const-string v1, "Both size "

    .line 11
    .line 12
    const-string v2, " and step "

    .line 13
    .line 14
    invoke-static {v1, p0, v2, p1, v0}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string p1, "size "

    .line 20
    .line 21
    invoke-static {p1, p0, v0}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static ζ(Ljava/lang/Object;)Ljava/util/List;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v12, "models"

    .line 10
    .line 11
    const-string v13, "mModels"

    .line 12
    .line 13
    const-string v1, "mData"

    .line 14
    .line 15
    const-string v2, "mItems"

    .line 16
    .line 17
    const-string v3, "data"

    .line 18
    .line 19
    const-string v4, "items"

    .line 20
    .line 21
    const-string v5, "list"

    .line 22
    .line 23
    const-string v6, "mList"

    .line 24
    .line 25
    const-string v7, "dataList"

    .line 26
    .line 27
    const-string v8, "mDataList"

    .line 28
    .line 29
    const-string v9, "awemeList"

    .line 30
    .line 31
    const-string v10, "feedList"

    .line 32
    .line 33
    const-string v11, "mFeedList"

    .line 34
    .line 35
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :catchall_0
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const-string v3, "\' ("

    .line 52
    .line 53
    const-class v4, Ljava/lang/Object;

    .line 54
    .line 55
    const-string v5, "Aweme"

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    const/4 v7, 0x0

    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/lang/String;

    .line 66
    .line 67
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    :goto_1
    if-eqz v8, :cond_1

    .line 72
    .line 73
    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    if-nez v9, :cond_1

    .line 78
    .line 79
    :try_start_1
    invoke-virtual {v8, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v9, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    goto :goto_2

    .line 91
    :catch_0
    :try_start_2
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    :goto_2
    if-nez v7, :cond_2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-static {v7}, Lp91;->Θ(Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-eqz v4, :cond_0

    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-nez v7, :cond_0

    .line 110
    .line 111
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_3

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_0

    .line 127
    .line 128
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    if-eqz v8, :cond_4

    .line 133
    .line 134
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-static {v8, v5, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_4

    .line 147
    .line 148
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    const/16 v6, 0x2e

    .line 153
    .line 154
    invoke-static {v0, v6, v0}, Lq02;->ц(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    new-instance v7, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v8, "DYHelper: \u627e\u5230\u6570\u636e\u5b57\u6bb5 \'"

    .line 164
    .line 165
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v2, " \u6761, Adapter: "

    .line 178
    .line 179
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, ")"

    .line 186
    .line 187
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-static {v2}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 195
    .line 196
    .line 197
    return-object v4

    .line 198
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    :goto_3
    if-eqz v0, :cond_d

    .line 203
    .line 204
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_d

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-static {v1}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :catchall_1
    :cond_6
    :goto_4
    invoke-virtual {v1}, Lτ;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_c

    .line 223
    .line 224
    invoke-virtual {v1}, Lτ;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, Ljava/lang/reflect/Field;

    .line 229
    .line 230
    :try_start_3
    const-class v8, Ljava/util/List;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-nez v8, :cond_7

    .line 241
    .line 242
    const-class v8, Ljava/util/Collection;

    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-nez v8, :cond_7

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_7
    invoke-virtual {v2, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    if-nez v8, :cond_8

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    invoke-static {v8}, Lp91;->Θ(Ljava/lang/Object;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    if-nez v8, :cond_9

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_9
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    const/4 v10, 0x2

    .line 277
    if-lt v9, v10, :cond_6

    .line 278
    .line 279
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    if-eqz v9, :cond_a

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_a
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    :cond_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    if-eqz v10, :cond_6

    .line 295
    .line 296
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    if-eqz v10, :cond_b

    .line 301
    .line 302
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    invoke-static {v10, v5, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 311
    .line 312
    .line 313
    move-result v10

    .line 314
    if-eqz v10, :cond_b

    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    new-instance v10, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const-string v11, "DYHelper: \u66b4\u529b\u626b\u63cf\u53d1\u73b0\u6570\u636e\u5b57\u6bb5 \'"

    .line 330
    .line 331
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    const-string v2, " \u6761)"

    .line 344
    .line 345
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {v2}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 353
    .line 354
    .line 355
    return-object v8

    .line 356
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    goto/16 :goto_3

    .line 361
    .line 362
    :cond_d
    :try_start_4
    const-string v0, "getItemCount"

    .line 363
    .line 364
    const/4 v1, 0x0

    .line 365
    new-array v2, v1, [Ljava/lang/Class;

    .line 366
    .line 367
    invoke-static {p0, v0, v2}, Lp91;->λ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    if-eqz v0, :cond_14

    .line 372
    .line 373
    invoke-virtual {v0, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    instance-of v2, v0, Ljava/lang/Integer;

    .line 378
    .line 379
    if-eqz v2, :cond_e

    .line 380
    .line 381
    check-cast v0, Ljava/lang/Integer;

    .line 382
    .line 383
    goto :goto_5

    .line 384
    :cond_e
    move-object v0, v7

    .line 385
    :goto_5
    if-eqz v0, :cond_f

    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    goto :goto_6

    .line 392
    :cond_f
    move v0, v1

    .line 393
    :goto_6
    if-lez v0, :cond_14

    .line 394
    .line 395
    const/16 v2, 0x1f4

    .line 396
    .line 397
    if-ge v0, v2, :cond_14

    .line 398
    .line 399
    const-string v2, "getItem"

    .line 400
    .line 401
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 402
    .line 403
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-static {p0, v2, v4}, Lp91;->λ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    if-nez v2, :cond_10

    .line 415
    .line 416
    const-string v2, "getData"

    .line 417
    .line 418
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-static {p0, v2, v3}, Lp91;->λ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    :cond_10
    if-eqz v2, :cond_14

    .line 427
    .line 428
    new-instance v3, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 431
    .line 432
    .line 433
    :goto_7
    if-ge v1, v0, :cond_11

    .line 434
    .line 435
    :try_start_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 448
    .line 449
    .line 450
    goto :goto_8

    .line 451
    :catchall_2
    :try_start_6
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 455
    .line 456
    goto :goto_7

    .line 457
    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 458
    .line 459
    .line 460
    move-result p0

    .line 461
    if-eqz p0, :cond_12

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :cond_12
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    :cond_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-eqz v1, :cond_14

    .line 473
    .line 474
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    if-eqz v1, :cond_13

    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-static {v1, v5, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    if-eqz v1, :cond_13

    .line 493
    .line 494
    new-instance p0, Ljava/lang/StringBuilder;

    .line 495
    .line 496
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 497
    .line 498
    .line 499
    const-string v1, "DYHelper: \u901a\u8fc7 getItem() \u83b7\u53d6 "

    .line 500
    .line 501
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    const-string v0, " \u6761\u6570\u636e"

    .line 508
    .line 509
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 517
    .line 518
    .line 519
    return-object v3

    .line 520
    :catchall_3
    :cond_14
    :goto_9
    return-object v7
.end method

.method public static varargs η([Lorg/json/JSONObject;)Lye1;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v3, v1, :cond_0

    .line 11
    .line 12
    aget-object v5, p0, v3

    .line 13
    .line 14
    add-int/lit8 v6, v4, 0x1

    .line 15
    .line 16
    new-instance v7, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v8, "root"

    .line 19
    .line 20
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v0, v5, v4, v2}, Lp91;->θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    move v4, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p0, Lye1;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast v0, Ljava/lang/Iterable;

    .line 47
    .line 48
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p0, v0}, Lye1;-><init>(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public static final θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 11

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p1, v0, :cond_9

    .line 6
    .line 7
    const/16 v0, 0xc

    .line 8
    .line 9
    if-le p3, v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_8

    .line 12
    .line 13
    :cond_0
    instance-of v0, p1, Lorg/json/JSONObject;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    check-cast p1, Lorg/json/JSONObject;

    .line 19
    .line 20
    const-string v0, "food_id"

    .line 21
    .line 22
    const-string v2, "foodId"

    .line 23
    .line 24
    const-string v3, "foodID"

    .line 25
    .line 26
    filled-new-array {v3, v0, v2}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1, v0}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    :goto_0
    move-object v10, p2

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string v0, "food_name"

    .line 39
    .line 40
    const-string v2, "name"

    .line 41
    .line 42
    const-string v4, "foodName"

    .line 43
    .line 44
    filled-new-array {v4, v0, v2}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p1, v0}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance v2, Lze1;

    .line 56
    .line 57
    const-string v0, "food_price"

    .line 58
    .line 59
    const-string v1, "price"

    .line 60
    .line 61
    const-string v5, "foodPrice"

    .line 62
    .line 63
    filled-new-array {v5, v0, v1}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {p1, v0}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const-string v0, "time"

    .line 72
    .line 73
    const-string v1, "duration"

    .line 74
    .line 75
    const-string v6, "foodTime"

    .line 76
    .line 77
    const-string v7, "food_time"

    .line 78
    .line 79
    filled-new-array {v6, v7, v0, v1}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {p1, v0}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    const-string v0, "gain_closeness"

    .line 88
    .line 89
    const-string v1, "closeness"

    .line 90
    .line 91
    const-string v7, "gainCloseness"

    .line 92
    .line 93
    filled-new-array {v7, v0, v1}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {p1, v0}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    const-string v0, "icon"

    .line 102
    .line 103
    const-string v1, "pic"

    .line 104
    .line 105
    const-string v8, "foodIcon"

    .line 106
    .line 107
    const-string v9, "food_icon"

    .line 108
    .line 109
    filled-new-array {v8, v9, v0, v1}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {p1, v0}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const-string v0, "label"

    .line 118
    .line 119
    filled-new-array {v0}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {p1, v0}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    move-object v10, p2

    .line 128
    invoke-direct/range {v2 .. v10}, Lze1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    move-object v1, v2

    .line 132
    :goto_1
    if-eqz v1, :cond_3

    .line 133
    .line 134
    iget-object p2, v1, Lze1;->α:Ljava/lang/String;

    .line 135
    .line 136
    invoke-interface {p0, p2, v1}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    check-cast p2, Lze1;

    .line 141
    .line 142
    :cond_3
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Ljava/lang/String;

    .line 157
    .line 158
    const-string v1, "."

    .line 159
    .line 160
    invoke-static {v10, v1, v0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    add-int/lit8 v2, p3, 0x1

    .line 169
    .line 170
    invoke-static {p0, v0, v1, v2}, Lp91;->θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_4
    move-object v10, p2

    .line 175
    instance-of p2, p1, Lorg/json/JSONArray;

    .line 176
    .line 177
    if-eqz p2, :cond_5

    .line 178
    .line 179
    check-cast p1, Lorg/json/JSONArray;

    .line 180
    .line 181
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    const/4 v0, 0x0

    .line 186
    :goto_3
    if-ge v0, p2, :cond_9

    .line 187
    .line 188
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v3, "["

    .line 201
    .line 202
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v3, "]"

    .line 209
    .line 210
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    add-int/lit8 v3, p3, 0x1

    .line 218
    .line 219
    invoke-static {p0, v1, v2, v3}, Lp91;->θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    add-int/lit8 v0, v0, 0x1

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_5
    instance-of p2, p1, Ljava/lang/String;

    .line 226
    .line 227
    if-eqz p2, :cond_9

    .line 228
    .line 229
    check-cast p1, Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    const/4 v0, 0x2

    .line 244
    if-gt v0, p2, :cond_9

    .line 245
    .line 246
    const v0, 0x7a121

    .line 247
    .line 248
    .line 249
    if-ge p2, v0, :cond_9

    .line 250
    .line 251
    const/16 p2, 0x7b

    .line 252
    .line 253
    invoke-static {p1, p2}, Lq02;->у(Ljava/lang/String;C)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-eqz p2, :cond_7

    .line 258
    .line 259
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    .line 260
    .line 261
    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :catchall_0
    move-exception v0

    .line 266
    move-object p1, v0

    .line 267
    new-instance p2, Leo1;

    .line 268
    .line 269
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    :goto_4
    instance-of p1, p2, Leo1;

    .line 273
    .line 274
    if-eqz p1, :cond_6

    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_6
    move-object v1, p2

    .line 278
    :goto_5
    check-cast v1, Lorg/json/JSONObject;

    .line 279
    .line 280
    if-eqz v1, :cond_9

    .line 281
    .line 282
    const-string p1, "{json}"

    .line 283
    .line 284
    invoke-virtual {v10, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    add-int/lit8 p3, p3, 0x1

    .line 289
    .line 290
    invoke-static {p0, v1, p1, p3}, Lp91;->θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_7
    const/16 p2, 0x5b

    .line 295
    .line 296
    invoke-static {p1, p2}, Lq02;->у(Ljava/lang/String;C)Z

    .line 297
    .line 298
    .line 299
    move-result p2

    .line 300
    if-eqz p2, :cond_9

    .line 301
    .line 302
    :try_start_1
    new-instance p2, Lorg/json/JSONArray;

    .line 303
    .line 304
    invoke-direct {p2, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :catchall_1
    move-exception v0

    .line 309
    move-object p1, v0

    .line 310
    new-instance p2, Leo1;

    .line 311
    .line 312
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    :goto_6
    instance-of p1, p2, Leo1;

    .line 316
    .line 317
    if-eqz p1, :cond_8

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_8
    move-object v1, p2

    .line 321
    :goto_7
    check-cast v1, Lorg/json/JSONArray;

    .line 322
    .line 323
    if-eqz v1, :cond_9

    .line 324
    .line 325
    const-string p1, "[json]"

    .line 326
    .line 327
    invoke-virtual {v10, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    add-int/lit8 p3, p3, 0x1

    .line 332
    .line 333
    invoke-static {p0, v1, p1, p3}, Lp91;->θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 334
    .line 335
    .line 336
    :cond_9
    :goto_8
    return-void
.end method

.method public static ι(Ljava/lang/ClassLoader;JII)Ljava/lang/Object;
    .locals 16

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    const-string v1, "status_code"

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, p1, v2

    .line 11
    .line 12
    if-lez v2, :cond_8

    .line 13
    .line 14
    if-lez p3, :cond_7

    .line 15
    .line 16
    if-ltz p4, :cond_6

    .line 17
    .line 18
    :try_start_0
    invoke-static/range {p0 .. p2}, Lxn0;->σ(Ljava/lang/ClassLoader;J)Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    const-string v4, "food_id"

    .line 28
    .line 29
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v3, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    const-string v4, "food_price"

    .line 37
    .line 38
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v3, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const-string v4, "is_post_free"

    .line 46
    .line 47
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    const-string v4, "is_exquisite_image"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-string v4, "https://stark-gate.zijieapi.com/ttgame/social_pet/feed"

    .line 58
    .line 59
    move-object/from16 v5, p0

    .line 60
    .line 61
    invoke-static {v5, v4, v3, v2}, Lp91;->ψ(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Lve1;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v3, v2, Lve1;->γ:Lorg/json/JSONObject;

    .line 66
    .line 67
    const-string v4, "data"

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-nez v4, :cond_0

    .line 74
    .line 75
    move-object v4, v3

    .line 76
    :cond_0
    const-string v5, "info"

    .line 77
    .line 78
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    move-result-object v15

    .line 82
    const-string v5, "base_resp"

    .line 83
    .line 84
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    const/4 v7, -0x1

    .line 93
    if-eqz v6, :cond_2

    .line 94
    .line 95
    invoke-virtual {v3, v0, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    :cond_1
    :goto_0
    move v9, v7

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    invoke-virtual {v3, v1, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    if-eqz v5, :cond_4

    .line 113
    .line 114
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/4 v6, 0x1

    .line 119
    if-ne v0, v6, :cond_4

    .line 120
    .line 121
    invoke-virtual {v5, v1, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    goto :goto_0

    .line 126
    :cond_4
    if-eqz v15, :cond_1

    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    goto :goto_0

    .line 130
    :goto_1
    new-instance v6, Lwe1;

    .line 131
    .line 132
    iget v7, v2, Lve1;->α:I

    .line 133
    .line 134
    iget-object v8, v2, Lve1;->β:Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-static {v3, v4}, Lp91;->χ(Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    const-string v0, "balance_spark"

    .line 141
    .line 142
    invoke-static {v0, v4}, Lp91;->τ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    const-string v0, "together"

    .line 147
    .line 148
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-eqz v0, :cond_5

    .line 153
    .line 154
    const-string v1, "closeness"

    .line 155
    .line 156
    invoke-static {v1, v0}, Lp91;->τ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :goto_2
    move/from16 v11, p3

    .line 161
    .line 162
    move/from16 v12, p4

    .line 163
    .line 164
    move-object v14, v0

    .line 165
    goto :goto_3

    .line 166
    :cond_5
    const/4 v0, 0x0

    .line 167
    goto :goto_2

    .line 168
    :goto_3
    invoke-direct/range {v6 .. v15}, Lwe1;-><init>(ILjava/lang/Integer;ILjava/lang/String;IILjava/lang/Long;Ljava/lang/Long;Lorg/json/JSONObject;)V

    .line 169
    .line 170
    .line 171
    return-object v6

    .line 172
    :cond_6
    const-string v0, "foodPrice \u4e0d\u80fd\u5c0f\u4e8e 0"

    .line 173
    .line 174
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 175
    .line 176
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v1

    .line 180
    :cond_7
    const-string v0, "foodId \u5fc5\u987b\u5927\u4e8e 0"

    .line 181
    .line 182
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 183
    .line 184
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v1

    .line 188
    :cond_8
    const-string v0, "conversationShortId \u5fc5\u987b\u5927\u4e8e 0"

    .line 189
    .line 190
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 191
    .line 192
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    new-instance v1, Leo1;

    .line 198
    .line 199
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    return-object v1
.end method

.method public static κ(Ljava/lang/ClassLoader;J)Ljava/lang/Object;
    .locals 21

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    const-string v1, "food_info"

    .line 4
    .line 5
    const-string v2, "status_code"

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v3, p1, v3

    .line 13
    .line 14
    if-lez v3, :cond_d

    .line 15
    .line 16
    :try_start_0
    invoke-static/range {p0 .. p2}, Lxn0;->σ(Ljava/lang/ClassLoader;J)Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 23
    .line 24
    .line 25
    const-string v5, "is_exquisite_image"

    .line 26
    .line 27
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v4, v5, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    const-string v5, "https://stark-gate.zijieapi.com/ttgame/social_pet/feed/get"

    .line 33
    .line 34
    move-object/from16 v6, p0

    .line 35
    .line 36
    invoke-static {v6, v5, v4, v3}, Lp91;->ψ(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Lve1;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v4, v3, Lve1;->γ:Lorg/json/JSONObject;

    .line 41
    .line 42
    const-string v5, "data"

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-nez v5, :cond_0

    .line 49
    .line 50
    move-object v5, v4

    .line 51
    :cond_0
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const/4 v7, 0x0

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    const-string v8, "list"

    .line 59
    .line 60
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object v6, v7

    .line 66
    :goto_0
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    if-eqz v6, :cond_3

    .line 73
    .line 74
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    move v11, v9

    .line 79
    :goto_1
    if-ge v11, v10, :cond_3

    .line 80
    .line 81
    invoke-virtual {v6, v11}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    if-eqz v12, :cond_2

    .line 86
    .line 87
    invoke-static {v12, v11}, Lp91;->φ(Lorg/json/JSONObject;I)Lze1;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    iget-object v13, v12, Lze1;->α:Ljava/lang/String;

    .line 92
    .line 93
    invoke-interface {v8, v13, v12}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    check-cast v12, Lze1;

    .line 98
    .line 99
    :cond_2
    add-int/lit8 v11, v11, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    filled-new-array {v5}, [Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-static {v10}, Lp91;->η([Lorg/json/JSONObject;)Lye1;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    iget-object v10, v10, Lye1;->α:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-eqz v11, :cond_4

    .line 121
    .line 122
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    check-cast v11, Lze1;

    .line 127
    .line 128
    iget-object v12, v11, Lze1;->α:Ljava/lang/String;

    .line 129
    .line 130
    invoke-interface {v8, v12, v11}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    const-string v10, "base_resp"

    .line 135
    .line 136
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    const/4 v12, -0x1

    .line 145
    if-eqz v11, :cond_6

    .line 146
    .line 147
    invoke-virtual {v4, v2, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    :cond_5
    :goto_3
    move/from16 v16, v12

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_6
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    if-eqz v11, :cond_7

    .line 159
    .line 160
    invoke-virtual {v4, v0, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    goto :goto_3

    .line 165
    :cond_7
    if-eqz v10, :cond_8

    .line 166
    .line 167
    invoke-virtual {v10, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    const/4 v11, 0x1

    .line 172
    if-ne v0, v11, :cond_8

    .line 173
    .line 174
    invoke-virtual {v10, v2, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    goto :goto_3

    .line 179
    :cond_8
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_5

    .line 184
    .line 185
    move/from16 v16, v9

    .line 186
    .line 187
    :goto_4
    iget v14, v3, Lve1;->α:I

    .line 188
    .line 189
    iget-object v15, v3, Lve1;->β:Ljava/lang/Integer;

    .line 190
    .line 191
    const-string v0, "status_msg"

    .line 192
    .line 193
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_9

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_9
    move-object v0, v7

    .line 205
    :goto_5
    if-nez v0, :cond_a

    .line 206
    .line 207
    if-eqz v10, :cond_b

    .line 208
    .line 209
    const-string v0, "status_message"

    .line 210
    .line 211
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_b

    .line 216
    .line 217
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-nez v1, :cond_b

    .line 222
    .line 223
    :cond_a
    move-object/from16 v17, v0

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_b
    move-object/from16 v17, v7

    .line 227
    .line 228
    :goto_6
    if-eqz v6, :cond_c

    .line 229
    .line 230
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    :cond_c
    move/from16 v18, v9

    .line 235
    .line 236
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    check-cast v0, Ljava/lang/Iterable;

    .line 244
    .line 245
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v19

    .line 249
    const-string v0, "info"

    .line 250
    .line 251
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 252
    .line 253
    .line 254
    move-result-object v20

    .line 255
    new-instance v13, Lxe1;

    .line 256
    .line 257
    invoke-direct/range {v13 .. v20}, Lxe1;-><init>(ILjava/lang/Integer;ILjava/lang/String;ILjava/util/List;Lorg/json/JSONObject;)V

    .line 258
    .line 259
    .line 260
    return-object v13

    .line 261
    :cond_d
    const-string v0, "conversationShortId \u5fc5\u987b\u5927\u4e8e 0"

    .line 262
    .line 263
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 264
    .line 265
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    :catchall_0
    move-exception v0

    .line 270
    new-instance v1, Leo1;

    .line 271
    .line 272
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    return-object v1
.end method

.method public static varargs λ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_1

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
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    array-length v1, p2

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    array-length v0, p2

    .line 25
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, [Ljava/lang/Class;

    .line 30
    .line 31
    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_1
    const/4 v1, 0x1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0
.end method

.method public static μ(Landroid/view/View;Ljava/util/ArrayList;I)V
    .locals 5

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-le p2, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "RecyclerView"

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const-string v1, "recycler"

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    check-cast p0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    :goto_0
    if-ge v1, v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    add-int/lit8 v4, p2, 0x1

    .line 55
    .line 56
    invoke-static {v3, p1, v4}, Lp91;->μ(Landroid/view/View;Ljava/util/ArrayList;I)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    :goto_1
    return-void
.end method

.method public static final ν(J)Ljava/lang/String;
    .locals 12

    .line 1
    const-wide/32 v0, -0x3b9328e0

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    const-string v1, " s "

    .line 7
    .line 8
    const v2, 0x3b9aca00

    .line 9
    .line 10
    .line 11
    const v3, 0x1dcd6500

    .line 12
    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    sub-long/2addr p0, v3

    .line 23
    int-to-long v2, v2

    .line 24
    div-long/2addr p0, v2

    .line 25
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_0
    const-wide/32 v4, -0xf404c

    .line 38
    .line 39
    .line 40
    cmp-long v0, p0, v4

    .line 41
    .line 42
    const-string v4, " ms"

    .line 43
    .line 44
    const v5, 0xf4240

    .line 45
    .line 46
    .line 47
    const v6, 0x7a120

    .line 48
    .line 49
    .line 50
    if-gtz v0, :cond_1

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    int-to-long v1, v6

    .line 58
    sub-long/2addr p0, v1

    .line 59
    int-to-long v1, v5

    .line 60
    div-long/2addr p0, v1

    .line 61
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const-wide/16 v7, 0x0

    .line 73
    .line 74
    cmp-long v0, p0, v7

    .line 75
    .line 76
    const-string v7, " \u00b5s"

    .line 77
    .line 78
    const/16 v8, 0x3e8

    .line 79
    .line 80
    const/16 v9, 0x1f4

    .line 81
    .line 82
    if-gtz v0, :cond_2

    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    int-to-long v1, v9

    .line 90
    sub-long/2addr p0, v1

    .line 91
    int-to-long v1, v8

    .line 92
    div-long/2addr p0, v1

    .line 93
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    goto :goto_0

    .line 104
    :cond_2
    const-wide/32 v10, 0xf404c

    .line 105
    .line 106
    .line 107
    cmp-long v0, p0, v10

    .line 108
    .line 109
    if-gez v0, :cond_3

    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    int-to-long v1, v9

    .line 117
    add-long/2addr p0, v1

    .line 118
    int-to-long v1, v8

    .line 119
    div-long/2addr p0, v1

    .line 120
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    goto :goto_0

    .line 131
    :cond_3
    const-wide/32 v7, 0x3b9328e0

    .line 132
    .line 133
    .line 134
    cmp-long v0, p0, v7

    .line 135
    .line 136
    if-gez v0, :cond_4

    .line 137
    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    int-to-long v1, v6

    .line 144
    add-long/2addr p0, v1

    .line 145
    int-to-long v1, v5

    .line 146
    div-long/2addr p0, v1

    .line 147
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    goto :goto_0

    .line 158
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    int-to-long v3, v3

    .line 164
    add-long/2addr p0, v3

    .line 165
    int-to-long v2, v2

    .line 166
    div-long/2addr p0, v2

    .line 167
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    :goto_0
    const/4 p1, 0x1

    .line 178
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    const-string p1, "%6s"

    .line 187
    .line 188
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0
.end method

.method public static ξ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "getAdapter"

    .line 2
    .line 3
    const-string v1, "getAdapter2"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :catchall_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    return-object p0

    .line 43
    :cond_0
    const-string v0, "mAdapter"

    .line 44
    .line 45
    const-string v1, "adapter"

    .line 46
    .line 47
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :catchall_1
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    :try_start_1
    filled-new-array {v1}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/4 v3, 0x0

    .line 76
    aget-object v1, v1, v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    :try_start_2
    invoke-static {p0, v1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 82
    goto :goto_3

    .line 83
    :catchall_2
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    :goto_0
    if-eqz v3, :cond_2

    .line 88
    .line 89
    const-class v4, Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 95
    if-nez v4, :cond_2

    .line 96
    .line 97
    :try_start_4
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 98
    .line 99
    .line 100
    move-result-object v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 101
    goto :goto_1

    .line 102
    :catch_0
    :try_start_5
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    goto :goto_0

    .line 107
    :cond_2
    move-object v1, v2

    .line 108
    :goto_1
    if-nez v1, :cond_3

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    const/4 v3, 0x1

    .line 112
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 119
    goto :goto_3

    .line 120
    :catchall_3
    :goto_2
    move-object v1, v2

    .line 121
    :goto_3
    if-eqz v1, :cond_1

    .line 122
    .line 123
    return-object v1

    .line 124
    :cond_4
    return-object v2
.end method

.method public static final ο(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

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
    const v0, 0x7f090385

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v0, p0, Landroid/view/ViewParent;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p0, Landroid/view/ViewParent;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static final π()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static final ρ(Lux1;Lux1;)Lux1;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    if-nez v0, :cond_1

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_1
    iget-object v1, v0, Lux1;->α:Lf32;

    .line 10
    .line 11
    invoke-interface {v1}, Lf32;->β()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-interface {v1}, Lf32;->δ()Lkn0;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-interface {v1}, Lf32;->ε()F

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    iget-wide v7, v0, Lux1;->β:J

    .line 24
    .line 25
    iget-object v9, v0, Lux1;->γ:Ld60;

    .line 26
    .line 27
    iget-object v10, v0, Lux1;->δ:Lb60;

    .line 28
    .line 29
    iget-object v11, v0, Lux1;->ε:Lc60;

    .line 30
    .line 31
    iget-object v12, v0, Lux1;->ζ:Lbr;

    .line 32
    .line 33
    iget-object v13, v0, Lux1;->η:Ljava/lang/String;

    .line 34
    .line 35
    iget-wide v14, v0, Lux1;->θ:J

    .line 36
    .line 37
    iget-object v1, v0, Lux1;->ι:Lr8;

    .line 38
    .line 39
    iget-object v2, v0, Lux1;->κ:Lg32;

    .line 40
    .line 41
    move-object/from16 v16, v1

    .line 42
    .line 43
    iget-object v1, v0, Lux1;->λ:Lav0;

    .line 44
    .line 45
    move-object/from16 v18, v1

    .line 46
    .line 47
    move-object/from16 v17, v2

    .line 48
    .line 49
    iget-wide v1, v0, Lux1;->μ:J

    .line 50
    .line 51
    move-wide/from16 v19, v1

    .line 52
    .line 53
    iget-object v1, v0, Lux1;->ν:Lc32;

    .line 54
    .line 55
    iget-object v2, v0, Lux1;->ξ:Lfv1;

    .line 56
    .line 57
    iget-object v0, v0, Lux1;->ο:Lkn0;

    .line 58
    .line 59
    move-object/from16 v23, v0

    .line 60
    .line 61
    move-object/from16 v21, v1

    .line 62
    .line 63
    move-object/from16 v22, v2

    .line 64
    .line 65
    move-object/from16 v2, p0

    .line 66
    .line 67
    invoke-static/range {v2 .. v23}, Lvx1;->α(Lux1;JLkn0;FJLd60;Lb60;Lc60;Lbr;Ljava/lang/String;JLr8;Lg32;Lav0;JLc32;Lfv1;Lkn0;)Lux1;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
.end method

.method public static varargs σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {p1}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lgd1;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-direct {v0, p0, v1}, Lgd1;-><init>(Lorg/json/JSONObject;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Integer;

    .line 20
    .line 21
    return-object p0
.end method

.method public static τ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    check-cast p0, Ljava/lang/String;

    .line 25
    .line 26
    const/16 p1, 0xa

    .line 27
    .line 28
    invoke-static {p0, p1}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static varargs υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lgd1;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v0, p0, v1}, Lgd1;-><init>(Lorg/json/JSONObject;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Laf1;->ε:Laf1;

    .line 16
    .line 17
    invoke-interface {p0}, Lss1;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-lez v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    check-cast v0, Ljava/lang/String;

    .line 47
    .line 48
    return-object v0
.end method

.method public static φ(Lorg/json/JSONObject;I)Lze1;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "cfg"

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Lp91;->Η(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "food_id"

    .line 16
    .line 17
    const-string v4, "foodId"

    .line 18
    .line 19
    const-string v5, "foodID"

    .line 20
    .line 21
    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v0, v6}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const/4 v7, 0x0

    .line 30
    if-nez v6, :cond_1

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v2, v3}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move-object v6, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v6, v7

    .line 45
    :goto_0
    if-nez v6, :cond_1

    .line 46
    .line 47
    const-string v3, "unknown-"

    .line 48
    .line 49
    invoke-static {v3, v1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    :cond_1
    move-object v9, v6

    .line 54
    const-string v3, "name"

    .line 55
    .line 56
    const-string v4, "food_name"

    .line 57
    .line 58
    const-string v5, "foodName"

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    filled-new-array {v5, v4, v3}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-static {v2, v6}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-nez v6, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :goto_1
    move-object v10, v6

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    :goto_2
    filled-new-array {v4, v5, v3}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-static {v0, v3}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    if-nez v6, :cond_2

    .line 84
    .line 85
    const-string v6, "\u672a\u4e0b\u53d1\u540d\u79f0"

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_3
    new-instance v8, Lze1;

    .line 89
    .line 90
    const-string v3, "price"

    .line 91
    .line 92
    const-string v4, "food_price"

    .line 93
    .line 94
    const-string v5, "foodPrice"

    .line 95
    .line 96
    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-static {v0, v6}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    if-nez v6, :cond_4

    .line 105
    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    filled-new-array {v5, v4, v3}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v2, v3}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    :cond_4
    move-object v11, v6

    .line 117
    goto :goto_4

    .line 118
    :cond_5
    move-object v11, v7

    .line 119
    :goto_4
    const-string v3, "time"

    .line 120
    .line 121
    const-string v4, "food_time"

    .line 122
    .line 123
    const-string v5, "foodTime"

    .line 124
    .line 125
    const-string v6, "duration"

    .line 126
    .line 127
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    invoke-static {v0, v12}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    if-nez v12, :cond_7

    .line 136
    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    filled-new-array {v5, v4, v3, v6}, [Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-static {v2, v3}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    goto :goto_5

    .line 148
    :cond_6
    move-object v12, v7

    .line 149
    :cond_7
    :goto_5
    const-string v3, "closeness"

    .line 150
    .line 151
    const-string v4, "gain_closeness"

    .line 152
    .line 153
    const-string v5, "gainCloseness"

    .line 154
    .line 155
    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-static {v0, v6}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    if-nez v6, :cond_9

    .line 164
    .line 165
    if-eqz v2, :cond_8

    .line 166
    .line 167
    filled-new-array {v5, v4, v3}, [Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-static {v2, v3}, Lp91;->σ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    :cond_8
    move-object v13, v7

    .line 176
    goto :goto_6

    .line 177
    :cond_9
    move-object v13, v6

    .line 178
    :goto_6
    const-string v3, "icon"

    .line 179
    .line 180
    const-string v4, "food_icon"

    .line 181
    .line 182
    const-string v5, "foodIcon"

    .line 183
    .line 184
    if-eqz v2, :cond_b

    .line 185
    .line 186
    filled-new-array {v5, v4, v3}, [Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-static {v2, v6}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    if-nez v2, :cond_a

    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_a
    :goto_7
    move-object v14, v2

    .line 198
    goto :goto_9

    .line 199
    :cond_b
    :goto_8
    const-string v2, "pic"

    .line 200
    .line 201
    filled-new-array {v4, v5, v3, v2}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {v0, v2}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    goto :goto_7

    .line 210
    :goto_9
    const-string v2, "label"

    .line 211
    .line 212
    filled-new-array {v2}, [Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-static {v0, v2}, Lp91;->υ(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    const-string v0, "response.food_info.list["

    .line 221
    .line 222
    const-string v2, "]"

    .line 223
    .line 224
    invoke-static {v0, v1, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v16

    .line 228
    invoke-direct/range {v8 .. v16}, Lze1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-object v8
.end method

.method public static χ(Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "base_resp"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "message"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "msg"

    .line 14
    .line 15
    move-object v4, v3

    .line 16
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v5, "status_msg"

    .line 21
    .line 22
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const-string p1, "status_message"

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    move-object v4, p0

    .line 43
    move-object v7, p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance p1, Lf71;

    .line 56
    .line 57
    const/16 v0, 0x1d

    .line 58
    .line 59
    invoke-direct {p1, v0}, Lf71;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, p1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/lang/String;

    .line 71
    .line 72
    return-object p0
.end method

.method public static ψ(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Lve1;
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, v0}, Lxn0;->ц(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)Lrf1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lrf1;->α()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lrf1;->β:Ljava/lang/Throwable;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string p1, "\u98df\u7269\u5bbf\u4e3b\u8bf7\u6c42\u5931\u8d25"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    throw p0

    .line 25
    :cond_1
    iget-object p0, p0, Lrf1;->α:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/Map;

    .line 28
    .line 29
    if-eqz p0, :cond_a

    .line 30
    .line 31
    const-string p1, "data"

    .line 32
    .line 33
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    instance-of p2, p1, Ljava/util/Map;

    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    check-cast p1, Ljava/util/Map;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object p1, p3

    .line 46
    :goto_0
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-static {p1}, Lp91;->Ι(Ljava/util/Map;)Lzw0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object p1, p3

    .line 54
    :goto_1
    if-nez p1, :cond_4

    .line 55
    .line 56
    sget-object p1, Lkz;->ε:Lkz;

    .line 57
    .line 58
    :cond_4
    const-string p2, "response"

    .line 59
    .line 60
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p2}, Lp91;->Η(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-nez p2, :cond_5

    .line 69
    .line 70
    const-string p2, "rawResponse"

    .line 71
    .line 72
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p2}, Lp91;->Η(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-nez p2, :cond_5

    .line 81
    .line 82
    new-instance p2, Lorg/json/JSONObject;

    .line 83
    .line 84
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 85
    .line 86
    .line 87
    :cond_5
    new-instance v0, Lve1;

    .line 88
    .line 89
    const-string v1, "code"

    .line 90
    .line 91
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    instance-of v1, p0, Ljava/lang/Number;

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    check-cast p0, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    goto :goto_2

    .line 106
    :cond_6
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/16 v1, 0xa

    .line 111
    .line 112
    invoke-static {p0, v1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-eqz p0, :cond_7

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    goto :goto_2

    .line 123
    :cond_7
    const/4 p0, -0x1

    .line 124
    :goto_2
    const-string v1, "httpCode"

    .line 125
    .line 126
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    instance-of v1, p1, Ljava/lang/Number;

    .line 131
    .line 132
    if-eqz v1, :cond_8

    .line 133
    .line 134
    check-cast p1, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    goto :goto_3

    .line 145
    :cond_8
    if-nez p1, :cond_9

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1}, Lx02;->Π(Ljava/lang/String;)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    :goto_3
    invoke-direct {v0, p0, p3, p2}, Lve1;-><init>(ILjava/lang/Integer;Lorg/json/JSONObject;)V

    .line 157
    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_a
    const-string p0, "\u98df\u7269 Bridge \u7ed3\u679c\u4e3a\u7a7a"

    .line 161
    .line 162
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const/4 p0, 0x0

    .line 166
    return-object p0
.end method

.method public static final ω(JFLyr;)F
    .locals 4

    .line 1
    invoke-static {p0, p1}, Ly32;->β(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x100000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lz32;->α(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {p3}, Lyr;->θ()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    float-to-double v0, v0

    .line 21
    const-wide v2, 0x3ff0cccccccccccdL    # 1.05

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmpl-double v0, v0, v2

    .line 27
    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p3, p2}, Lyr;->к(F)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {p0, p1}, Ly32;->γ(J)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {v0, v1}, Ly32;->γ(J)F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    div-float/2addr p0, p1

    .line 43
    :goto_0
    mul-float/2addr p0, p2

    .line 44
    return p0

    .line 45
    :cond_0
    invoke-interface {p3, p0, p1}, Lyr;->д(J)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_1
    const-wide v2, 0x200000000L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, Lz32;->α(JJ)Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    invoke-static {p0, p1}, Ly32;->γ(J)F

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 67
    .line 68
    return p0
.end method

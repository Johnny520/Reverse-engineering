.class public abstract Lyyds/ᛵᛲᲁᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛶᛲᛶᛲ;

.field public static ᲀᛲᛳᲀ:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛴᛶᲀᛲ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lyyds/ᛵᛲᛴᛷ;

    .line 13
    .line 14
    invoke-direct {v0}, Lyyds/ᲀᛴᛱᛷ;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lyyds/ᛵᛲᲁᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᲀᛴᛱᛷ;

    .line 21
    .line 22
    invoke-direct {v0}, Lyyds/ᲀᛴᛱᛷ;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lyyds/ᛵᛲᲁᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 26
    .line 27
    :goto_0
    new-instance v0, Lyyds/ᛶᛲᛶᛲ;

    .line 28
    .line 29
    const/16 v1, 0x10

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lyyds/ᛶᛲᛶᛲ;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lyyds/ᛵᛲᲁᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛲᛶᛲ;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    sput-object v0, Lyyds/ᛵᛲᲁᛲ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static ᛲᛴᛳᛲ(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static ᛲᲈᲁ(Landroid/content/Context;[Lyyds/ᲈᛶᛷᲈ;I)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat.createFromFontInfo"

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛴᛶᲀᛲ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v0, Lyyds/ᛵᛲᲁᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_1
    invoke-virtual {v0, p1, p0}, Lyyds/ᲀᛴᛱᛷ;->ᲀᛲᛲᲇ([Lyyds/ᲈᛶᛷᲈ;Landroid/content/ContentResolver;)Landroid/graphics/fonts/FontFamily;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p2}, Lyyds/ᲀᛴᛱᛷ;->ᛶᛳᛶᛵ(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 41
    .line 42
    .line 43
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p0

    .line 46
    :try_start_2
    const-string p1, "TypefaceCompatApi29Impl"

    .line 47
    .line 48
    const-string p2, "Font load failed"

    .line 49
    .line 50
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    throw p0
.end method

.method public static ᛵᛸᛸᛷ(Landroid/content/Context;Lyyds/ᛲᛲᛳᲁ;Landroid/content/res/Resources;ILjava/lang/String;IILyyds/ᛸᛸᲇᲁ;)Landroid/graphics/Typeface;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v4, p6

    .line 4
    .line 5
    move-object/from16 v1, p7

    .line 6
    .line 7
    instance-of v2, v0, Lyyds/ᛶᛵᛵᛵ;

    .line 8
    .line 9
    const/16 v3, 0x9

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    if-eqz v2, :cond_13

    .line 14
    .line 15
    check-cast v0, Lyyds/ᛶᛵᛵᛵ;

    .line 16
    .line 17
    const-string v2, "TypefaceCompat"

    .line 18
    .line 19
    iget-object v7, v0, Lyyds/ᛶᛵᛵᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    const/4 v9, 0x1

    .line 26
    if-nez v8, :cond_0

    .line 27
    .line 28
    invoke-static {v7}, Lyyds/ᛵᛲᲁᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_0
    iget-object v7, v0, Lyyds/ᛶᛵᛵᛵ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-ne v8, v9, :cond_1

    .line 43
    .line 44
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lyyds/ᛶᛸᲈᛳ;

    .line 49
    .line 50
    iget-object v2, v2, Lyyds/ᛶᛸᲈᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v2}, Lyyds/ᛵᛲᲁᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_1
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    const/16 v10, 0x1f

    .line 61
    .line 62
    if-ge v8, v10, :cond_2

    .line 63
    .line 64
    :goto_0
    move-object v7, v6

    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :cond_2
    move v8, v5

    .line 68
    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-ge v8, v10, :cond_4

    .line 73
    .line 74
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Lyyds/ᛶᛸᲈᛳ;

    .line 79
    .line 80
    iget-object v10, v10, Lyyds/ᛶᛸᲈᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v10}, Lyyds/ᛵᛲᲁᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    if-nez v10, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move v8, v5

    .line 93
    move-object v10, v6

    .line 94
    :goto_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-ge v8, v11, :cond_9

    .line 99
    .line 100
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    check-cast v11, Lyyds/ᛶᛸᲈᛳ;

    .line 105
    .line 106
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    sub-int/2addr v12, v9

    .line 111
    if-ne v8, v12, :cond_5

    .line 112
    .line 113
    iget-object v12, v11, Lyyds/ᛶᛸᲈᛳ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    if-eqz v12, :cond_5

    .line 120
    .line 121
    iget-object v2, v11, Lyyds/ᛶᛸᲈᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v10, v2}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setSystemFallback(Ljava/lang/String;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 124
    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_5
    iget-object v12, v11, Lyyds/ᛶᛸᲈᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v13, v11, Lyyds/ᛶᛸᲈᛳ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v12}, Lyyds/ᛵᛲᲁᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    invoke-static {v12}, Lyyds/ᛵᛲᲁᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    if-nez v12, :cond_6

    .line 140
    .line 141
    new-instance v7, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v8, "Unable identify the primary font for "

    .line 144
    .line 145
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object v8, v11, Lyyds/ᛶᛸᲈᛳ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v8, ". Falling back to provider font."

    .line 154
    .line 155
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-static {v2, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_6
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    if-nez v11, :cond_7

    .line 171
    .line 172
    :try_start_0
    new-instance v11, Landroid/graphics/fonts/FontFamily$Builder;

    .line 173
    .line 174
    new-instance v14, Landroid/graphics/fonts/Font$Builder;

    .line 175
    .line 176
    invoke-static {v12}, Lyyds/ᛳᲇᛲᲈ;->ᛶᛷᛲᲁ(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    invoke-virtual {v12, v13}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    invoke-virtual {v12}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    invoke-direct {v11, v12}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v11}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 192
    .line 193
    .line 194
    move-result-object v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    goto :goto_3

    .line 196
    :catch_0
    const-string v7, "Failed to clone Font instance. Fall back to provider font."

    .line 197
    .line 198
    invoke-static {v2, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_7
    new-instance v11, Landroid/graphics/fonts/FontFamily$Builder;

    .line 204
    .line 205
    invoke-direct {v11, v12}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v11}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    :goto_3
    if-nez v10, :cond_8

    .line 213
    .line 214
    new-instance v10, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 215
    .line 216
    invoke-direct {v10, v11}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_8
    invoke-virtual {v10, v11}, Landroid/graphics/Typeface$CustomFallbackBuilder;->addCustomFallback(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 221
    .line 222
    .line 223
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :cond_9
    :goto_5
    invoke-virtual {v10}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    :goto_6
    if-eqz v7, :cond_a

    .line 232
    .line 233
    new-instance v0, Landroid/os/Handler;

    .line 234
    .line 235
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 240
    .line 241
    .line 242
    new-instance v2, Lyyds/ᲈᛷᛲᛸ;

    .line 243
    .line 244
    invoke-direct {v2, v1, v3, v7}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 248
    .line 249
    .line 250
    sget-object v0, Lyyds/ᛵᛲᲁᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛲᛶᛲ;

    .line 251
    .line 252
    invoke-static/range {p2 .. p6}, Lyyds/ᛵᛲᲁᛲ;->ᲇᲈᛵᛷ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v0, v1, v7}, Lyyds/ᛶᛲᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    return-object v7

    .line 260
    :cond_a
    iget v2, v0, Lyyds/ᛶᛵᛵᛵ;->ᲀᛲᛳᲀ:I

    .line 261
    .line 262
    if-nez v2, :cond_b

    .line 263
    .line 264
    move v2, v9

    .line 265
    goto :goto_7

    .line 266
    :cond_b
    move v2, v5

    .line 267
    :goto_7
    iget v7, v0, Lyyds/ᛶᛵᛵᛵ;->ᛵᛸᛸᛷ:I

    .line 268
    .line 269
    new-instance v3, Landroid/os/Handler;

    .line 270
    .line 271
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-direct {v3, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 276
    .line 277
    .line 278
    new-instance v8, Lyyds/ᲀᛵᲁᛴ;

    .line 279
    .line 280
    const/16 v10, 0x15

    .line 281
    .line 282
    invoke-direct {v8, v10, v5}, Lyyds/ᲀᛵᲁᛴ;-><init>(IB)V

    .line 283
    .line 284
    .line 285
    iput-object v1, v8, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 286
    .line 287
    iget-object v0, v0, Lyyds/ᛶᛵᛵᛵ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 288
    .line 289
    new-instance v10, Lyyds/ᲀᲈᛶᲈ;

    .line 290
    .line 291
    new-instance v1, Lyyds/ᛱᛸᛱᛳ;

    .line 292
    .line 293
    invoke-direct {v1, v3}, Lyyds/ᛱᛸᛱᛳ;-><init>(Landroid/os/Handler;)V

    .line 294
    .line 295
    .line 296
    const/16 v3, 0xd

    .line 297
    .line 298
    invoke-direct {v10, v8, v3, v1}, Lyyds/ᲀᲈᛶᲈ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    const/4 v3, 0x2

    .line 302
    if-eqz v2, :cond_f

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-gt v2, v9, :cond_e

    .line 309
    .line 310
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, Lyyds/ᛶᛸᲈᛳ;

    .line 315
    .line 316
    sget-object v2, Lyyds/ᲈᛵᲇᲀ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 317
    .line 318
    invoke-static {v0}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-static {v4, v2}, Lyyds/ᲈᛵᲇᲀ;->ᛲᲈᲁ(ILjava/util/List;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    sget-object v9, Lyyds/ᲈᛵᲇᲀ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 327
    .line 328
    invoke-virtual {v9, v2}, Lyyds/ᛶᛲᛶᛲ;->ᛱᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    check-cast v9, Landroid/graphics/Typeface;

    .line 333
    .line 334
    if-eqz v9, :cond_c

    .line 335
    .line 336
    new-instance v0, Lyyds/ᲈᛵᛶᛲ;

    .line 337
    .line 338
    invoke-direct {v0, v3, v8, v9, v5}, Lyyds/ᲈᛵᛶᛲ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v0}, Lyyds/ᛱᛸᛱᛳ;->execute(Ljava/lang/Runnable;)V

    .line 342
    .line 343
    .line 344
    move-object v6, v9

    .line 345
    goto/16 :goto_b

    .line 346
    .line 347
    :cond_c
    const/4 v1, -0x1

    .line 348
    if-ne v7, v1, :cond_d

    .line 349
    .line 350
    invoke-static {v0}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    move-object/from16 v1, p0

    .line 355
    .line 356
    invoke-static {v2, v1, v0, v4}, Lyyds/ᲈᛵᲇᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lyyds/ᲁᛶᛱ;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v10, v0}, Lyyds/ᲀᲈᛶᲈ;->ᛵᲀᛵᛸ(Lyyds/ᲁᛶᛱ;)V

    .line 361
    .line 362
    .line 363
    iget-object v6, v0, Lyyds/ᲁᛶᛱ;->ᛲᲈᲁ:Landroid/graphics/Typeface;

    .line 364
    .line 365
    goto/16 :goto_b

    .line 366
    .line 367
    :cond_d
    move-object/from16 v1, p0

    .line 368
    .line 369
    move-object v3, v0

    .line 370
    new-instance v0, Lyyds/ᲀᲁᛴᛴ;

    .line 371
    .line 372
    const/4 v5, 0x0

    .line 373
    move-object v15, v2

    .line 374
    move-object v2, v1

    .line 375
    move-object v1, v15

    .line 376
    invoke-direct/range {v0 .. v5}, Lyyds/ᲀᲁᛴᛴ;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 377
    .line 378
    .line 379
    :try_start_1
    sget-object v1, Lyyds/ᲈᛵᲇᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 380
    .line 381
    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 382
    .line 383
    .line 384
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4

    .line 385
    int-to-long v1, v7

    .line 386
    :try_start_2
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 387
    .line 388
    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3

    .line 392
    :try_start_3
    check-cast v0, Lyyds/ᲁᛶᛱ;

    .line 393
    .line 394
    invoke-virtual {v10, v0}, Lyyds/ᲀᲈᛶᲈ;->ᛵᲀᛵᛸ(Lyyds/ᲁᛶᛱ;)V

    .line 395
    .line 396
    .line 397
    iget-object v6, v0, Lyyds/ᲁᛶᛱ;->ᛲᲈᲁ:Landroid/graphics/Typeface;

    .line 398
    .line 399
    goto/16 :goto_b

    .line 400
    .line 401
    :catch_1
    move-exception v0

    .line 402
    goto :goto_8

    .line 403
    :catch_2
    move-exception v0

    .line 404
    goto :goto_9

    .line 405
    :catch_3
    new-instance v0, Ljava/lang/InterruptedException;

    .line 406
    .line 407
    const-string v1, "timeout"

    .line 408
    .line 409
    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :goto_8
    throw v0

    .line 414
    :goto_9
    new-instance v1, Ljava/lang/RuntimeException;

    .line 415
    .line 416
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 417
    .line 418
    .line 419
    throw v1
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    .line 420
    :catch_4
    iget-object v0, v10, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v0, Lyyds/ᛱᛸᛱᛳ;

    .line 423
    .line 424
    iget-object v1, v10, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v1, Lyyds/ᲀᛵᲁᛴ;

    .line 427
    .line 428
    new-instance v2, Lyyds/ᛵᛶᲇᛳ;

    .line 429
    .line 430
    const/4 v3, -0x3

    .line 431
    invoke-direct {v2, v1, v3}, Lyyds/ᛵᛶᲇᛳ;-><init>(Lyyds/ᲀᛵᲁᛴ;I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v2}, Lyyds/ᛱᛸᛱᛳ;->execute(Ljava/lang/Runnable;)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_b

    .line 438
    .line 439
    :cond_e
    const-string v0, "Fallbacks with blocking fetches are not supported for performance reasons"

    .line 440
    .line 441
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    return-object v6

    .line 445
    :cond_f
    invoke-static {v4, v0}, Lyyds/ᲈᛵᲇᲀ;->ᛲᲈᲁ(ILjava/util/List;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    sget-object v7, Lyyds/ᲈᛵᲇᲀ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 450
    .line 451
    invoke-virtual {v7, v2}, Lyyds/ᛶᛲᛶᛲ;->ᛱᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    check-cast v7, Landroid/graphics/Typeface;

    .line 456
    .line 457
    if-eqz v7, :cond_10

    .line 458
    .line 459
    new-instance v0, Lyyds/ᲈᛵᛶᛲ;

    .line 460
    .line 461
    invoke-direct {v0, v3, v8, v7, v5}, Lyyds/ᲈᛵᛶᛲ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v0}, Lyyds/ᛱᛸᛱᛳ;->execute(Ljava/lang/Runnable;)V

    .line 465
    .line 466
    .line 467
    move-object v6, v7

    .line 468
    goto :goto_b

    .line 469
    :cond_10
    new-instance v1, Lyyds/ᲁᛳᲈᲇ;

    .line 470
    .line 471
    invoke-direct {v1, v5, v10}, Lyyds/ᲁᛳᲈᲇ;-><init>(ILjava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    sget-object v7, Lyyds/ᲈᛵᲇᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 475
    .line 476
    monitor-enter v7

    .line 477
    :try_start_4
    sget-object v3, Lyyds/ᲈᛵᲇᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᛲᛷ;

    .line 478
    .line 479
    invoke-virtual {v3, v2}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    check-cast v5, Ljava/util/ArrayList;

    .line 484
    .line 485
    if-eqz v5, :cond_11

    .line 486
    .line 487
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    monitor-exit v7

    .line 491
    goto :goto_b

    .line 492
    :catchall_0
    move-exception v0

    .line 493
    goto :goto_c

    .line 494
    :cond_11
    new-instance v5, Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    invoke-virtual {v3, v2, v5}, Lyyds/ᛴᲈᛲᛷ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 506
    move-object v3, v0

    .line 507
    new-instance v0, Lyyds/ᲀᲁᛴᛴ;

    .line 508
    .line 509
    const/4 v5, 0x1

    .line 510
    move-object v1, v2

    .line 511
    move-object/from16 v2, p0

    .line 512
    .line 513
    invoke-direct/range {v0 .. v5}, Lyyds/ᲀᲁᛴᛴ;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 514
    .line 515
    .line 516
    sget-object v2, Lyyds/ᲈᛵᲇᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 517
    .line 518
    new-instance v3, Lyyds/ᲁᛳᲈᲇ;

    .line 519
    .line 520
    invoke-direct {v3, v9, v1}, Lyyds/ᲁᛳᲈᲇ;-><init>(ILjava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    if-nez v1, :cond_12

    .line 528
    .line 529
    new-instance v1, Landroid/os/Handler;

    .line 530
    .line 531
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    invoke-direct {v1, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 536
    .line 537
    .line 538
    goto :goto_a

    .line 539
    :cond_12
    new-instance v1, Landroid/os/Handler;

    .line 540
    .line 541
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 542
    .line 543
    .line 544
    :goto_a
    new-instance v5, Lyyds/ᛱᛱᛶᛸ;

    .line 545
    .line 546
    invoke-direct {v5}, Lyyds/ᛱᛱᛶᛸ;-><init>()V

    .line 547
    .line 548
    .line 549
    iput-object v0, v5, Lyyds/ᛱᛱᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 550
    .line 551
    iput-object v3, v5, Lyyds/ᛱᛱᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 552
    .line 553
    iput-object v1, v5, Lyyds/ᛱᛱᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 554
    .line 555
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 556
    .line 557
    .line 558
    :goto_b
    move-object/from16 v11, p2

    .line 559
    .line 560
    goto/16 :goto_11

    .line 561
    .line 562
    :goto_c
    :try_start_5
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 563
    throw v0

    .line 564
    :cond_13
    sget-object v2, Lyyds/ᛵᛲᲁᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 565
    .line 566
    check-cast v0, Lyyds/ᛴᲇᲀᲀ;

    .line 567
    .line 568
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    :try_start_6
    iget-object v0, v0, Lyyds/ᛴᲇᲀᲀ;->ᛲᲈᲁ:[Lyyds/ᛵᲈᛲᛷ;

    .line 572
    .line 573
    array-length v2, v0

    .line 574
    move-object v7, v6

    .line 575
    :goto_d
    if-ge v5, v2, :cond_15

    .line 576
    .line 577
    aget-object v8, v0, v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 578
    .line 579
    :try_start_7
    new-instance v9, Landroid/graphics/fonts/Font$Builder;

    .line 580
    .line 581
    iget v10, v8, Lyyds/ᛵᲈᛲᛷ;->ᛲᛴᛳᛲ:I
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 582
    .line 583
    move-object/from16 v11, p2

    .line 584
    .line 585
    :try_start_8
    invoke-direct {v9, v11, v10}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/content/res/Resources;I)V

    .line 586
    .line 587
    .line 588
    iget v10, v8, Lyyds/ᛵᲈᛲᛷ;->ᛲᲈᲁ:I

    .line 589
    .line 590
    invoke-virtual {v9, v10}, Landroid/graphics/fonts/Font$Builder;->setWeight(I)Landroid/graphics/fonts/Font$Builder;

    .line 591
    .line 592
    .line 593
    move-result-object v9

    .line 594
    iget-boolean v10, v8, Lyyds/ᛵᲈᛲᛷ;->ᛵᛸᛸᛷ:Z

    .line 595
    .line 596
    invoke-virtual {v9, v10}, Landroid/graphics/fonts/Font$Builder;->setSlant(I)Landroid/graphics/fonts/Font$Builder;

    .line 597
    .line 598
    .line 599
    move-result-object v9

    .line 600
    iget v10, v8, Lyyds/ᛵᲈᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 601
    .line 602
    invoke-virtual {v9, v10}, Landroid/graphics/fonts/Font$Builder;->setTtcIndex(I)Landroid/graphics/fonts/Font$Builder;

    .line 603
    .line 604
    .line 605
    move-result-object v9

    .line 606
    iget-object v8, v8, Lyyds/ᛵᲈᛲᛷ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 607
    .line 608
    invoke-virtual {v9, v8}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    .line 609
    .line 610
    .line 611
    move-result-object v8

    .line 612
    invoke-virtual {v8}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    .line 613
    .line 614
    .line 615
    move-result-object v8

    .line 616
    if-nez v7, :cond_14

    .line 617
    .line 618
    new-instance v9, Landroid/graphics/fonts/FontFamily$Builder;

    .line 619
    .line 620
    invoke-direct {v9, v8}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 621
    .line 622
    .line 623
    move-object v7, v9

    .line 624
    goto :goto_e

    .line 625
    :catch_5
    move-exception v0

    .line 626
    goto :goto_f

    .line 627
    :cond_14
    invoke-virtual {v7, v8}, Landroid/graphics/fonts/FontFamily$Builder;->addFont(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    .line 628
    .line 629
    .line 630
    goto :goto_e

    .line 631
    :catch_6
    move-exception v0

    .line 632
    move-object/from16 v11, p2

    .line 633
    .line 634
    goto :goto_f

    .line 635
    :catch_7
    move-object/from16 v11, p2

    .line 636
    .line 637
    :catch_8
    :goto_e
    add-int/lit8 v5, v5, 0x1

    .line 638
    .line 639
    goto :goto_d

    .line 640
    :cond_15
    move-object/from16 v11, p2

    .line 641
    .line 642
    if-nez v7, :cond_16

    .line 643
    .line 644
    goto :goto_10

    .line 645
    :cond_16
    :try_start_9
    invoke-virtual {v7}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    new-instance v2, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 650
    .line 651
    invoke-direct {v2, v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 652
    .line 653
    .line 654
    invoke-static {v0, v4}, Lyyds/ᲀᛴᛱᛷ;->ᛶᛳᛶᛵ(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-virtual {v2, v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 667
    .line 668
    .line 669
    move-result-object v6
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 670
    goto :goto_10

    .line 671
    :goto_f
    const-string v2, "TypefaceCompatApi29Impl"

    .line 672
    .line 673
    const-string v5, "Font load failed"

    .line 674
    .line 675
    invoke-static {v2, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 676
    .line 677
    .line 678
    :goto_10
    if-eqz v6, :cond_17

    .line 679
    .line 680
    new-instance v0, Landroid/os/Handler;

    .line 681
    .line 682
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 687
    .line 688
    .line 689
    new-instance v2, Lyyds/ᲈᛷᛲᛸ;

    .line 690
    .line 691
    invoke-direct {v2, v1, v3, v6}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 695
    .line 696
    .line 697
    goto :goto_11

    .line 698
    :cond_17
    invoke-virtual {v1}, Lyyds/ᛸᛸᲇᲁ;->ᛲᲈᲁ()V

    .line 699
    .line 700
    .line 701
    :goto_11
    if-eqz v6, :cond_18

    .line 702
    .line 703
    sget-object v0, Lyyds/ᛵᛲᲁᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛲᛶᛲ;

    .line 704
    .line 705
    invoke-static/range {p2 .. p6}, Lyyds/ᛵᛲᲁᛲ;->ᲇᲈᛵᛷ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    invoke-virtual {v0, v1, v6}, Lyyds/ᛶᛲᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    :cond_18
    return-object v6
.end method

.method public static ᲀᛲᛳᲀ(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛵᛲᲁᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, Landroid/graphics/fonts/Font$Builder;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/content/res/Resources;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroid/graphics/fonts/FontFamily$Builder;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v2, v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const-string v1, "TypefaceCompatApi29Impl"

    .line 44
    .line 45
    const-string v2, "Font load failed"

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-static {p0, p1, p2, p3, p4}, Lyyds/ᛵᛲᲁᛲ;->ᲇᲈᛵᛷ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Lyyds/ᛵᛲᲁᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛲᛶᛲ;

    .line 58
    .line 59
    invoke-virtual {p1, p0, v0}, Lyyds/ᛶᛲᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_0
    return-object v0
.end method

.method public static ᲇᲇᲇᛱ(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛵᛲᲁᛲ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lyyds/ᛵᛲᲁᛲ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 11
    .line 12
    :cond_0
    const/high16 v1, 0x41200000    # 10.0f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lyyds/ᛵᛲᲁᛲ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lyyds/ᛵᛲᲁᛲ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 23
    .line 24
    invoke-static {p0}, Lyyds/ᛳᲇᛲᲈ;->ᛲᛳᛶᲁ(Landroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lyyds/ᛳᲇᛲᲈ;->ᛲᲈᲁ(Landroid/graphics/text/PositionedGlyphs;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_1
    invoke-static {p0}, Lyyds/ᛳᲇᛲᲈ;->ᛱᲈᲁ(Landroid/graphics/text/PositionedGlyphs;)Landroid/graphics/fonts/Font;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static ᲇᲈᛵᛷ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

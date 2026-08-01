.class public final Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

.field private static final TAG:Ljava/lang/String; = "ref399e2e1c5c8051"

.field private static registered:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->$stable:I

    .line 11
    .line 12
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

.method private final handleCommentBookmarkClick(Lov0;)V
    .locals 35

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "ref399e2e1c5c8051"

    .line 4
    .line 5
    iget-object v2, v0, Lov0;->α:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, v0, Lov0;->γ:Ljava/lang/Object;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_b

    .line 12
    .line 13
    :cond_0
    const/4 v4, 0x0

    .line 14
    :try_start_0
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->init(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->init(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, Lov0;->ε:Ljava/lang/Object;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 43
    .line 44
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObject([Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    if-nez v6, :cond_1

    .line 53
    .line 54
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findBookmarkSourceObject([Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto/16 :goto_9

    .line 65
    .line 66
    :cond_1
    move-object v0, v6

    .line 67
    :cond_2
    :goto_0
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->toRecordFromAny(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    const/4 v7, 0x0

    .line 74
    if-nez v6, :cond_4

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v3, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->toRecord(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move-object v6, v7

    .line 84
    :cond_4
    :goto_1
    if-eqz v6, :cond_6

    .line 85
    .line 86
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    if-nez v8, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    :goto_2
    move-object v9, v8

    .line 94
    goto :goto_4

    .line 95
    :cond_6
    :goto_3
    invoke-virtual {v3, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    if-nez v8, :cond_5

    .line 100
    .line 101
    const-string v8, ""

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :goto_4
    invoke-static {v9}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    const-string v0, "\u672a\u8bc6\u522b\u5230\u8bc4\u8bba ID\uff0c\u65e0\u6cd5\u6dfb\u52a0\u4e66\u7b7e"

    .line 111
    .line 112
    invoke-static {v2, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 117
    .line 118
    .line 119
    const-string v0, "comment bookmark failed: empty comment id"

    .line 120
    .line 121
    const/4 v3, 0x4

    .line 122
    invoke-static {v1, v0, v7, v3, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_7
    invoke-virtual {v5, v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->isBookmarked(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    invoke-virtual {v5, v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    const-string v0, "\u5df2\u53d6\u6d88\u4e66\u7b7e"

    .line 136
    .line 137
    invoke-static {v2, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_8
    if-nez v6, :cond_9

    .line 146
    .line 147
    new-instance v8, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 148
    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 150
    .line 151
    .line 152
    move-result-wide v20

    .line 153
    const v33, 0x1ffdfe

    .line 154
    .line 155
    .line 156
    const/16 v34, 0x0

    .line 157
    .line 158
    const/4 v10, 0x0

    .line 159
    const/4 v11, 0x0

    .line 160
    const/4 v12, 0x0

    .line 161
    const-wide/16 v13, 0x0

    .line 162
    .line 163
    const-wide/16 v15, 0x0

    .line 164
    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    const/16 v18, 0x0

    .line 168
    .line 169
    const/16 v19, 0x0

    .line 170
    .line 171
    const/16 v22, 0x0

    .line 172
    .line 173
    const/16 v23, 0x0

    .line 174
    .line 175
    const/16 v24, 0x0

    .line 176
    .line 177
    const/16 v25, 0x0

    .line 178
    .line 179
    const/16 v26, 0x0

    .line 180
    .line 181
    const/16 v27, 0x0

    .line 182
    .line 183
    const/16 v28, 0x0

    .line 184
    .line 185
    const/16 v29, 0x0

    .line 186
    .line 187
    const/16 v30, 0x0

    .line 188
    .line 189
    const/16 v31, 0x0

    .line 190
    .line 191
    const/16 v32, 0x0

    .line 192
    .line 193
    invoke-direct/range {v8 .. v34}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILzq;)V

    .line 194
    .line 195
    .line 196
    move-object v6, v8

    .line 197
    :cond_9
    move-object v0, v2

    .line 198
    :goto_5
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 199
    .line 200
    if-eqz v3, :cond_b

    .line 201
    .line 202
    instance-of v3, v0, Landroid/app/Activity;

    .line 203
    .line 204
    if-eqz v3, :cond_a

    .line 205
    .line 206
    move-object v7, v0

    .line 207
    check-cast v7, Landroid/app/Activity;

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_a
    check-cast v0, Landroid/content/ContextWrapper;

    .line 211
    .line 212
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    goto :goto_5

    .line 217
    :cond_b
    :goto_6
    if-eqz v7, :cond_c

    .line 218
    .line 219
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 220
    .line 221
    new-instance v3, Lkv0;

    .line 222
    .line 223
    const/4 v5, 0x0

    .line 224
    invoke-direct {v3, v2, v5}, Lkv0;-><init>(Landroid/content/Context;I)V

    .line 225
    .line 226
    .line 227
    invoke-direct {v0, v7, v6, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;-><init>(Landroid/content/Context;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;La80;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->show()V

    .line 231
    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_c
    invoke-virtual {v5, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->add(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_d

    .line 239
    .line 240
    const-string v0, "\u5df2\u6dfb\u52a0\u4e66\u7b7e\uff0c\u540e\u7eed\u6709\u65b0\u56de\u590d\u4f1a\u63d0\u9192"

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_d
    const-string v0, "\u8be5\u8bc4\u8bba\u5df2\u6dfb\u52a0\u4e66\u7b7e"

    .line 244
    .line 245
    :goto_7
    invoke-static {v2, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 250
    .line 251
    .line 252
    :goto_8
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    .line 254
    goto :goto_a

    .line 255
    :goto_9
    new-instance v3, Leo1;

    .line 256
    .line 257
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    move-object v0, v3

    .line 261
    :goto_a
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-eqz v0, :cond_e

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    new-instance v5, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    const-string v6, "\u6dfb\u52a0\u4e66\u7b7e\u5931\u8d25: "

    .line 274
    .line 275
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 290
    .line 291
    .line 292
    const-string v2, "comment bookmark failed"

    .line 293
    .line 294
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    :cond_e
    :goto_b
    return-void
.end method

.method private static final handleCommentBookmarkClick$lambda$10$lambda$9(Landroid/content/Context;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->add(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getUserTag()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "\u5df2\u6dfb\u52a0\u4e66\u7b7e ["

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, "]"

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 38
    .line 39
    .line 40
    sget-object p0, Ls62;->α:Ls62;

    .line 41
    .line 42
    return-object p0
.end method

.method private final handleCopyCommentWithoutAuthor(Lov0;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lov0;->α:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p1, Lov0;->γ:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_7

    .line 8
    .line 9
    :cond_0
    const/4 v2, 0x0

    .line 10
    :try_start_0
    iget-object p1, p1, Lov0;->ε:Ljava/lang/Object;

    .line 11
    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 15
    .line 16
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {p1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findBookmarkSourceObject([Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObject([Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_1
    move-object p1, v3

    .line 39
    :cond_2
    :goto_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->toRecordFromAny(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v4, 0x0

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->toRecord(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move-object v3, v4

    .line 56
    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getContent()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_2

    .line 63
    :cond_5
    move-object p1, v4

    .line 64
    :goto_2
    const-string v1, ""

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    move-object p1, v1

    .line 69
    :cond_6
    if-eqz v3, :cond_7

    .line 70
    .line 71
    :try_start_1
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAuthorName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    goto :goto_3

    .line 76
    :cond_7
    move-object v3, v4

    .line 77
    :goto_3
    if-nez v3, :cond_8

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_8
    move-object v1, v3

    .line 81
    :goto_4
    invoke-direct {p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->removeAuthorNamePrefix(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_9

    .line 90
    .line 91
    const-string p0, "\u672a\u8bc6\u522b\u5230\u8bc4\u8bba\u5185\u5bb9"

    .line 92
    .line 93
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_9
    const-string p1, "clipboard"

    .line 102
    .line 103
    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    instance-of v1, p1, Landroid/content/ClipboardManager;

    .line 108
    .line 109
    if-eqz v1, :cond_a

    .line 110
    .line 111
    move-object v4, p1

    .line 112
    check-cast v4, Landroid/content/ClipboardManager;

    .line 113
    .line 114
    :cond_a
    if-nez v4, :cond_b

    .line 115
    .line 116
    const-string p0, "\u65e0\u6cd5\u8bbf\u95ee\u526a\u8d34\u677f"

    .line 117
    .line 118
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_b
    const-string p1, "comment_content"

    .line 127
    .line 128
    invoke-static {p1, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {v4, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 133
    .line 134
    .line 135
    const-string p0, "\u5df2\u590d\u5236\u8bc4\u8bba\u5185\u5bb9"

    .line 136
    .line 137
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 142
    .line 143
    .line 144
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :goto_5
    new-instance p1, Leo1;

    .line 148
    .line 149
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    move-object p0, p1

    .line 153
    :goto_6
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    if-eqz p0, :cond_c

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    new-instance v1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v3, "\u590d\u5236\u8bc4\u8bba\u5931\u8d25: "

    .line 166
    .line 167
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-static {v0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 182
    .line 183
    .line 184
    const-string p1, "ref399e2e1c5c8051"

    .line 185
    .line 186
    const-string v0, "copy comment failed"

    .line 187
    .line 188
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    :cond_c
    :goto_7
    return-void
.end method

.method private final handleVideoBookmarkClick(Lpv0;)V
    .locals 4

    .line 1
    iget-object p0, p1, Lpv0;->α:Landroid/content/Context;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    iget-object p1, p1, Lpv0;->δ:Ljava/lang/Object;

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->init(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;

    .line 27
    .line 28
    sget-object v3, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    invoke-static {p1}, Lb10;->υ(Ljava/lang/Object;)Lf8;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;->fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    const-string p1, "\u672a\u8bc6\u522b\u5230\u4f5c\u54c1\u4fe1\u606f"

    .line 41
    .line 42
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->isBookmarked(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    const-string p1, "\u5df2\u5220\u9664\u4f5c\u54c1\u4e66\u7b7e"

    .line 70
    .line 71
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->add(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)Z

    .line 80
    .line 81
    .line 82
    const-string p1, "\u5df2\u4fdd\u5b58\u4f5c\u54c1\u4e66\u7b7e"

    .line 83
    .line 84
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 89
    .line 90
    .line 91
    :goto_0
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :goto_1
    new-instance v1, Leo1;

    .line 95
    .line 96
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    move-object p1, v1

    .line 100
    :goto_2
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v3, "\u4fdd\u5b58\u4f5c\u54c1\u4e66\u7b7e\u5931\u8d25: "

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 129
    .line 130
    .line 131
    const-string p0, "ref399e2e1c5c8051"

    .line 132
    .line 133
    const-string v0, "video bookmark failed"

    .line 134
    .line 135
    invoke-static {p0, v0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    :goto_3
    return-void
.end method

.method private final openBookmarkManager(Landroid/content/Context;I)V
    .locals 1

    .line 1
    move-object p0, p1

    .line 2
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    instance-of v0, p0, Landroid/app/Activity;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Landroid/app/Activity;

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    :goto_1
    if-eqz p0, :cond_2

    .line 22
    .line 23
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 24
    .line 25
    invoke-virtual {p1, p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show(Landroid/app/Activity;I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    if-eqz p1, :cond_3

    .line 30
    .line 31
    const-string p0, "\u65e0\u6cd5\u6253\u5f00\u4e66\u7b7e\u7ba1\u7406\u5668"

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void
.end method

.method private final registerBookmarkManager()V
    .locals 9

    .line 1
    sget-object p0, Lxv0;->α:Lxv0;

    .line 2
    .line 3
    new-instance v0, Lnv0;

    .line 4
    .line 5
    sget-object v1, Lmv0;->ε:Lmv0;

    .line 6
    .line 7
    invoke-static {v1}, Lg81;->φ(Ljava/lang/Object;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v6, Lgp0;

    .line 12
    .line 13
    const/16 v1, 0x13

    .line 14
    .line 15
    invoke-direct {v6, v1}, Lgp0;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/16 v8, 0x2c8

    .line 20
    .line 21
    const-string v1, "bookmark_manager"

    .line 22
    .line 23
    const-string v2, "\u4e66\u7b7e\u7ba1\u7406"

    .line 24
    .line 25
    sget-object v3, Llv0;->ζ:Llv0;

    .line 26
    .line 27
    const/16 v5, 0xf

    .line 28
    .line 29
    invoke-direct/range {v0 .. v8}, Lnv0;-><init>(Ljava/lang/String;Ljava/lang/String;Llv0;Ljava/util/Set;ILa80;Lgp0;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lxv0;->β(Lnv0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private static final registerBookmarkManager$lambda$2(Lqv0;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

    .line 5
    .line 6
    invoke-virtual {p0}, Lqv0;->α()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->openBookmarkManager(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ls62;->α:Ls62;

    .line 15
    .line 16
    return-object p0
.end method

.method private final registerCommentBookmark()V
    .locals 9

    .line 1
    sget-object p0, Lxv0;->α:Lxv0;

    .line 2
    .line 3
    new-instance v0, Lnv0;

    .line 4
    .line 5
    sget-object v1, Lmv0;->ε:Lmv0;

    .line 6
    .line 7
    invoke-static {v1}, Lg81;->φ(Ljava/lang/Object;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v6, Lgp0;

    .line 12
    .line 13
    const/16 v1, 0x12

    .line 14
    .line 15
    invoke-direct {v6, v1}, Lgp0;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/16 v8, 0x2c8

    .line 20
    .line 21
    const-string v1, "comment_bookmark"

    .line 22
    .line 23
    const-string v2, "\u4e66\u7b7e"

    .line 24
    .line 25
    sget-object v3, Llv0;->ε:Llv0;

    .line 26
    .line 27
    const/16 v5, 0xa

    .line 28
    .line 29
    invoke-direct/range {v0 .. v8}, Lnv0;-><init>(Ljava/lang/String;Ljava/lang/String;Llv0;Ljava/util/Set;ILa80;Lgp0;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lxv0;->β(Lnv0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private static final registerCommentBookmark$lambda$1(Lqv0;)Ls62;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lov0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lov0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->handleCommentBookmarkClick(Lov0;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 20
    .line 21
    return-object p0
.end method

.method private final registerCopyCommentContent()V
    .locals 9

    .line 1
    sget-object p0, Lxv0;->α:Lxv0;

    .line 2
    .line 3
    new-instance v0, Lnv0;

    .line 4
    .line 5
    sget-object v1, Lmv0;->ε:Lmv0;

    .line 6
    .line 7
    invoke-static {v1}, Lg81;->φ(Ljava/lang/Object;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v6, Lgp0;

    .line 12
    .line 13
    const/16 v1, 0x16

    .line 14
    .line 15
    invoke-direct {v6, v1}, Lgp0;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/16 v8, 0x2c8

    .line 20
    .line 21
    const-string v1, "copy_comment_without_author"

    .line 22
    .line 23
    const-string v2, "\u590d\u5236\u7eaf\u8bc4\u8bba"

    .line 24
    .line 25
    sget-object v3, Llv0;->η:Llv0;

    .line 26
    .line 27
    const/16 v5, 0x14

    .line 28
    .line 29
    invoke-direct/range {v0 .. v8}, Lnv0;-><init>(Ljava/lang/String;Ljava/lang/String;Llv0;Ljava/util/Set;ILa80;Lgp0;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lxv0;->β(Lnv0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private static final registerCopyCommentContent$lambda$4(Lqv0;)Ls62;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lov0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lov0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->handleCopyCommentWithoutAuthor(Lov0;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 20
    .line 21
    return-object p0
.end method

.method private final registerVideoBookmark()V
    .locals 9

    .line 1
    sget-object p0, Lxv0;->α:Lxv0;

    .line 2
    .line 3
    new-instance v0, Lnv0;

    .line 4
    .line 5
    sget-object v1, Lmv0;->η:Lmv0;

    .line 6
    .line 7
    sget-object v2, Lmv0;->θ:Lmv0;

    .line 8
    .line 9
    sget-object v3, Lmv0;->ζ:Lmv0;

    .line 10
    .line 11
    filled-new-array {v3, v1, v2}, [Lmv0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    new-instance v6, Lgp0;

    .line 20
    .line 21
    const/16 v1, 0x14

    .line 22
    .line 23
    invoke-direct {v6, v1}, Lgp0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v7, Lgp0;

    .line 27
    .line 28
    const/16 v1, 0x15

    .line 29
    .line 30
    invoke-direct {v7, v1}, Lgp0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const/16 v8, 0xc8

    .line 34
    .line 35
    const-string v1, "video_bookmark"

    .line 36
    .line 37
    const-string v2, "\u4f5c\u54c1\u4e66\u7b7e"

    .line 38
    .line 39
    sget-object v3, Llv0;->ζ:Llv0;

    .line 40
    .line 41
    const/16 v5, 0x1e

    .line 42
    .line 43
    invoke-direct/range {v0 .. v8}, Lnv0;-><init>(Ljava/lang/String;Ljava/lang/String;Llv0;Ljava/util/Set;ILa80;Lgp0;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lxv0;->β(Lnv0;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private static final registerVideoBookmark$lambda$6(Lqv0;)Ls62;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lpv0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lpv0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->handleVideoBookmarkClick(Lpv0;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 20
    .line 21
    return-object p0
.end method

.method private static final registerVideoBookmark$lambda$7(Lqv0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

    .line 5
    .line 6
    invoke-virtual {p0}, Lqv0;->α()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->openBookmarkManager(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method private final removeAuthorNamePrefix(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string p2, "@"

    .line 18
    .line 19
    invoke-static {p1, p2}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p2, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v1, v0

    .line 78
    check-cast v1, Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_1

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_8

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {p0, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const-string v1, ""

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_4
    const-string v0, ":"

    .line 116
    .line 117
    invoke-static {p2, v0}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v2, "\uff1a"

    .line 122
    .line 123
    invoke-static {p2, v2}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const-string v3, " "

    .line 128
    .line 129
    invoke-static {p2, v3}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v4, "\n"

    .line 134
    .line 135
    invoke-static {p2, v4}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    const-string v5, "\r\n"

    .line 140
    .line 141
    invoke-static {p2, v5}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    filled-new-array {v0, v2, v3, v4, p2}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-static {p2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    :cond_5
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_3

    .line 162
    .line 163
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Ljava/lang/String;

    .line 168
    .line 169
    const/4 v2, 0x0

    .line 170
    invoke-static {p0, v0, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_5

    .line 175
    .line 176
    invoke-static {p0, v0}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    :goto_2
    if-ge v2, v0, :cond_7

    .line 185
    .line 186
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    invoke-static {v3}, Ljx0;->Κ(C)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-nez v3, :cond_6

    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    goto :goto_3

    .line 205
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    move-object p0, v1

    .line 209
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    goto :goto_1

    .line 214
    :cond_8
    return-object p0
.end method

.method public static synthetic α(Landroid/content/Context;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->handleCommentBookmarkClick$lambda$10$lambda$9(Landroid/content/Context;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic β(Lqv0;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerBookmarkManager$lambda$2(Lqv0;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic γ(Lqv0;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerVideoBookmark$lambda$6(Lqv0;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic δ(Lqv0;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerCommentBookmark$lambda$1(Lqv0;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ε(Lqv0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerVideoBookmark$lambda$7(Lqv0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic ζ(Lqv0;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerCopyCommentContent$lambda$4(Lqv0;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final declared-synchronized registerAll()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "comment_panel_hook_enabled"

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x4

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "ref399e2e1c5c8051"

    .line 14
    .line 15
    const-string v3, "disabled, skip register"

    .line 16
    .line 17
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_1
    sget-boolean v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registered:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :cond_1
    const/4 v0, 0x1

    .line 31
    :try_start_2
    sput-boolean v0, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registered:Z

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerCommentBookmark()V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerBookmarkManager()V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerCopyCommentContent()V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerVideoBookmark()V

    .line 43
    .line 44
    .line 45
    const-string v0, "ref399e2e1c5c8051"

    .line 46
    .line 47
    const-string v3, "register all done"

    .line 48
    .line 49
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    throw v0
.end method

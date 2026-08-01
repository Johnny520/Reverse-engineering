.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lf8;->ι:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v2

    .line 21
    :goto_0
    const-string v3, ""

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    move-object v1, v3

    .line 26
    :cond_1
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v4, :cond_4

    .line 32
    .line 33
    move v4, v5

    .line 34
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-ge v4, v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-static {v6}, Ljava/lang/Character;->isDigit(C)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move-object v4, v1

    .line 55
    goto :goto_3

    .line 56
    :cond_4
    :goto_2
    move-object v4, v2

    .line 57
    :goto_3
    if-nez v4, :cond_5

    .line 58
    .line 59
    move-object v7, v3

    .line 60
    goto :goto_4

    .line 61
    :cond_5
    move-object v7, v4

    .line 62
    :goto_4
    iget-object v4, v0, Lf8;->κ:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz v4, :cond_6

    .line 65
    .line 66
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    goto :goto_5

    .line 75
    :cond_6
    move-object v4, v2

    .line 76
    :goto_5
    if-nez v4, :cond_7

    .line 77
    .line 78
    move-object v4, v3

    .line 79
    :cond_7
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_b

    .line 84
    .line 85
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_9

    .line 90
    .line 91
    :goto_6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-ge v5, v4, :cond_9

    .line 96
    .line 97
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-nez v4, :cond_8

    .line 106
    .line 107
    goto :goto_7

    .line 108
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_9
    move-object v1, v2

    .line 112
    :goto_7
    if-nez v1, :cond_a

    .line 113
    .line 114
    move-object v4, v3

    .line 115
    goto :goto_8

    .line 116
    :cond_a
    move-object v4, v1

    .line 117
    :cond_b
    :goto_8
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    const/16 v5, 0x8

    .line 122
    .line 123
    if-lt v1, v5, :cond_c

    .line 124
    .line 125
    const-string v1, "-1"

    .line 126
    .line 127
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    const-string v1, "true"

    .line 134
    .line 135
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_c

    .line 140
    .line 141
    const-string v1, "false"

    .line 142
    .line 143
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_c

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_c
    move-object v4, v2

    .line 151
    :goto_9
    if-nez v4, :cond_d

    .line 152
    .line 153
    move-object v8, v3

    .line 154
    goto :goto_a

    .line 155
    :cond_d
    move-object v8, v4

    .line 156
    :goto_a
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_e

    .line 161
    .line 162
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_e

    .line 167
    .line 168
    return-object v2

    .line 169
    :cond_e
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 170
    .line 171
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 172
    .line 173
    .line 174
    iget-object v4, v0, Lf8;->θ:Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v4, :cond_10

    .line 177
    .line 178
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    if-eqz v4, :cond_10

    .line 187
    .line 188
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-nez v5, :cond_f

    .line 193
    .line 194
    goto :goto_b

    .line 195
    :cond_f
    move-object v4, v2

    .line 196
    :goto_b
    if-eqz v4, :cond_10

    .line 197
    .line 198
    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    :cond_10
    iget-object v4, v0, Lf8;->α:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    const-string v5, "@"

    .line 212
    .line 213
    invoke-static {v4, v5}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-nez v5, :cond_11

    .line 222
    .line 223
    const-string v5, "\u672a\u77e5"

    .line 224
    .line 225
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-nez v5, :cond_11

    .line 230
    .line 231
    goto :goto_c

    .line 232
    :cond_11
    move-object v4, v2

    .line 233
    :goto_c
    if-nez v4, :cond_12

    .line 234
    .line 235
    move-object v9, v3

    .line 236
    goto :goto_d

    .line 237
    :cond_12
    move-object v9, v4

    .line 238
    :goto_d
    new-instance v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 239
    .line 240
    iget-object v0, v0, Lf8;->λ:Ljava/lang/String;

    .line 241
    .line 242
    if-eqz v0, :cond_13

    .line 243
    .line 244
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    :cond_13
    if-nez v2, :cond_14

    .line 253
    .line 254
    move-object v10, v3

    .line 255
    goto :goto_e

    .line 256
    :cond_14
    move-object v10, v2

    .line 257
    :goto_e
    const v25, 0xdff0

    .line 258
    .line 259
    .line 260
    const/16 v26, 0x0

    .line 261
    .line 262
    const/4 v11, 0x0

    .line 263
    const/4 v12, 0x0

    .line 264
    const/4 v13, 0x0

    .line 265
    const-wide/16 v14, 0x0

    .line 266
    .line 267
    const-wide/16 v16, 0x0

    .line 268
    .line 269
    const/16 v18, 0x0

    .line 270
    .line 271
    const/16 v19, 0x0

    .line 272
    .line 273
    const/16 v20, 0x0

    .line 274
    .line 275
    const/16 v21, 0x0

    .line 276
    .line 277
    const/16 v23, 0x0

    .line 278
    .line 279
    const/16 v24, 0x0

    .line 280
    .line 281
    move-object/from16 v22, v1

    .line 282
    .line 283
    invoke-direct/range {v6 .. v26}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V

    .line 284
    .line 285
    .line 286
    return-object v6
.end method

.method public final fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "knownAwemeIds"

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v5, 0x0

    .line 24
    :goto_0
    if-ge v5, v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-nez v7, :cond_0

    .line 38
    .line 39
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v4, "newAwemeItems"

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const/4 v6, 0x0

    .line 63
    :goto_1
    if-ge v6, v5, :cond_4

    .line 64
    .line 65
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    if-nez v7, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    sget-object v8, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem$Companion;

    .line 73
    .line 74
    invoke-virtual {v8, v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-nez v8, :cond_3

    .line 87
    .line 88
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    new-instance v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 95
    .line 96
    const-string v5, "uid"

    .line 97
    .line 98
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const-string v6, "secUid"

    .line 106
    .line 107
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    const-string v7, "nickname"

    .line 115
    .line 116
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    const-string v8, "signature"

    .line 124
    .line 125
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    const-string v9, "avatarUrl"

    .line 133
    .line 134
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const-string v10, "group"

    .line 142
    .line 143
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    const-string v11, "remark"

    .line 151
    .line 152
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const-string v12, "createTimestamp"

    .line 160
    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 162
    .line 163
    .line 164
    move-result-wide v13

    .line 165
    invoke-virtual {v0, v12, v13, v14}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 166
    .line 167
    .line 168
    move-result-wide v12

    .line 169
    const-string v14, "lastCheckTimestamp"

    .line 170
    .line 171
    move-object v15, v4

    .line 172
    const-wide/16 v3, 0x0

    .line 173
    .line 174
    invoke-virtual {v0, v14, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 175
    .line 176
    .line 177
    move-result-wide v3

    .line 178
    const-string v14, "lastAwemeCount"

    .line 179
    .line 180
    move-object/from16 v16, v1

    .line 181
    .line 182
    const/4 v1, 0x0

    .line 183
    invoke-virtual {v0, v14, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    const-string v1, "lastNewestAwemeId"

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-object/from16 v17, v1

    .line 197
    .line 198
    const-string v1, "hasNewAweme"

    .line 199
    .line 200
    move-object/from16 v18, v2

    .line 201
    .line 202
    const/4 v2, 0x0

    .line 203
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    move/from16 p0, v1

    .line 208
    .line 209
    const-string v1, "newAwemeCount"

    .line 210
    .line 211
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    const-string v2, "notificationEnabled"

    .line 216
    .line 217
    move/from16 v19, v1

    .line 218
    .line 219
    const/4 v1, 0x1

    .line 220
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    move-object v1, v5

    .line 225
    move-object v2, v6

    .line 226
    move-object v5, v9

    .line 227
    move-object v6, v10

    .line 228
    move/from16 v20, v14

    .line 229
    .line 230
    move/from16 v14, p0

    .line 231
    .line 232
    move-object/from16 v21, v18

    .line 233
    .line 234
    move/from16 v18, v0

    .line 235
    .line 236
    move-object v0, v15

    .line 237
    move/from16 v15, v19

    .line 238
    .line 239
    move-wide/from16 v22, v3

    .line 240
    .line 241
    move-object v3, v7

    .line 242
    move-object v4, v8

    .line 243
    move-object v7, v11

    .line 244
    move-wide v8, v12

    .line 245
    move/from16 v12, v20

    .line 246
    .line 247
    move-object/from16 v13, v17

    .line 248
    .line 249
    move-object/from16 v17, v21

    .line 250
    .line 251
    move-wide/from16 v10, v22

    .line 252
    .line 253
    invoke-direct/range {v0 .. v18}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;Z)V

    .line 254
    .line 255
    .line 256
    move-object v15, v0

    .line 257
    return-object v15
.end method

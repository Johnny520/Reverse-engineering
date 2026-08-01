.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field private static final CLASS_POST_AWEME_REPO:Ljava/lang/String;

.field private static final CLASS_POST_AWEME_REPO_TAB_API:Ljava/lang/String;

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;

.field private static final TAG:Ljava/lang/String; = "r1b07f0e328a2e9ac"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;

    .line 7
    .line 8
    const-string v0, "~794CAD4569E61E2D43B867359EB6123EE8F803FCDE2CE5CBCC91330CE3009DA61DC422605218FCF90CA7958EF8F016AF848FAD34CDD3"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->CLASS_POST_AWEME_REPO:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836217D34BD7D72D162304DC6918FF1B767CF7B3169CF26E16DB3DB1DCAB2561717E6A7F5DE"

    .line 17
    .line 18
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->CLASS_POST_AWEME_REPO_TAB_API:Ljava/lang/String;

    .line 23
    .line 24
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

.method private final buildQueryMap(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;IJILjava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;",
            "IJI",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "legacy"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {p6, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const-string v2, "locate_host"

    .line 17
    .line 18
    invoke-static {p6, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-string v4, "user_id"

    .line 23
    .line 24
    const-string v5, "sec_user_id"

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p0, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p0, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_2

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    const-string v3, "uid"

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-interface {p0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_3

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    const-string v1, "sec_uid"

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_0
    const/4 p1, 0x1

    .line 121
    const/16 v1, 0x32

    .line 122
    .line 123
    invoke-static {p2, p1, v1}, Lj81;->μ(III)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    const-string p2, "count"

    .line 132
    .line 133
    invoke-interface {p0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    const-wide/16 p1, 0x0

    .line 137
    .line 138
    cmp-long v1, p3, p1

    .line 139
    .line 140
    if-gez v1, :cond_4

    .line 141
    .line 142
    move-wide v3, p1

    .line 143
    goto :goto_1

    .line 144
    :cond_4
    move-wide v3, p3

    .line 145
    :goto_1
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    const-string v4, "max_cursor"

    .line 150
    .line 151
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    const-string v3, "0"

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    const-string v0, "min_cursor"

    .line 159
    .line 160
    invoke-interface {p0, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    if-gez v1, :cond_5

    .line 164
    .line 165
    move-wide p3, p1

    .line 166
    :cond_5
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    const-string p2, "cursor"

    .line 171
    .line 172
    invoke-interface {p0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    :cond_6
    const-string p1, "query_type"

    .line 176
    .line 177
    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p6}, Ljava/lang/String;->hashCode()I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    const-string p2, "need_filter"

    .line 189
    .line 190
    const-string p3, "personal_homepage"

    .line 191
    .line 192
    const-string p4, "1"

    .line 193
    .line 194
    const-string p5, "is_familiar"

    .line 195
    .line 196
    const-string v0, "enter_from"

    .line 197
    .line 198
    const-string v1, "2"

    .line 199
    .line 200
    const-string v4, "publish_video_strategy_type"

    .line 201
    .line 202
    const-string v5, "source"

    .line 203
    .line 204
    sparse-switch p1, :sswitch_data_0

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :sswitch_0
    const-string p1, "minimal"

    .line 209
    .line 210
    invoke-virtual {p6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-nez p1, :cond_7

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_7
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    return-object p0

    .line 221
    :sswitch_1
    invoke-virtual {p6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-nez p1, :cond_8

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_8
    const-string p1, "time_list_query"

    .line 229
    .line 230
    invoke-interface {p0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    invoke-interface {p0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    const-string p1, "user_avatar_shrink"

    .line 240
    .line 241
    const-string p2, "300_300"

    .line 242
    .line 243
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    const-string p1, "video_cover_shrink"

    .line 247
    .line 248
    const-string p2, "200_200"

    .line 249
    .line 250
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    const-string p1, "show_live_replay_strategy"

    .line 254
    .line 255
    invoke-interface {p0, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    const-string p1, "is_order_flow"

    .line 259
    .line 260
    invoke-interface {p0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    const-string p1, "page_from"

    .line 264
    .line 265
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    const-string p1, "location_permission"

    .line 269
    .line 270
    invoke-interface {p0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    const-string p1, "post_serial_strategy"

    .line 274
    .line 275
    invoke-interface {p0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    return-object p0

    .line 279
    :sswitch_2
    const-string p1, "profile_tab_filter"

    .line 280
    .line 281
    invoke-virtual {p6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-nez p1, :cond_9

    .line 286
    .line 287
    goto :goto_2

    .line 288
    :cond_9
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    invoke-interface {p0, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    invoke-interface {p0, p5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    invoke-interface {p0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    invoke-interface {p0, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    return-object p0

    .line 304
    :sswitch_3
    const-string p1, "profile_tab"

    .line 305
    .line 306
    invoke-virtual {p6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-nez p1, :cond_a

    .line 311
    .line 312
    :goto_2
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    const-string p1, "dyhelper_profile_bookmark"

    .line 316
    .line 317
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    invoke-interface {p0, p5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    invoke-interface {p0, p2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    return-object p0

    .line 330
    :cond_a
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    invoke-interface {p0, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    invoke-interface {p0, p5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    invoke-interface {p0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    return-object p0

    .line 343
    :sswitch_data_0
    .sparse-switch
        0xa9c7bff -> :sswitch_3
        0xd379fb8 -> :sswitch_2
        0x19346275 -> :sswitch_1
        0x3f738da1 -> :sswitch_0
    .end sparse-switch
.end method

.method private final extractThrowableFromFailure(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 7

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :goto_0
    if-eqz v0, :cond_4

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_4

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_1
    if-ge v3, v2, :cond_1

    .line 26
    .line 27
    aget-object v4, v1, v3

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const-string v6, "exception"

    .line 34
    .line 35
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    move-object v4, p0

    .line 48
    :goto_2
    if-eqz v4, :cond_3

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    invoke-virtual {v4, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    instance-of v0, p1, Ljava/lang/Throwable;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    check-cast p1, Ljava/lang/Throwable;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_2
    return-object p0

    .line 66
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    goto :goto_0

    .line 71
    :cond_4
    move-object v0, p0

    .line 72
    goto :goto_4

    .line 73
    :goto_3
    new-instance v0, Leo1;

    .line 74
    .line 75
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :goto_4
    if-eqz v0, :cond_5

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_5
    move-object p0, v0

    .line 82
    :goto_5
    check-cast p0, Ljava/lang/Throwable;

    .line 83
    .line 84
    return-object p0
.end method

.method private final findDeferredFeedItemListMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Method;"
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
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p0, p1}, Lus1;->Δ(Lss1;Lss1;)Lc40;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance p1, Lx30;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Lx30;-><init>(Lc40;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lx30;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Lx30;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    move-object v0, p0

    .line 43
    check-cast v0, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    array-length v1, v1

    .line 50
    const/4 v2, 0x2

    .line 51
    if-ne v1, v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const/4 v2, 0x0

    .line 58
    aget-object v1, v1, v2

    .line 59
    .line 60
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/4 v3, 0x1

    .line 73
    aget-object v1, v1, v3

    .line 74
    .line 75
    const-class v3, Ljava/util/Map;

    .line 76
    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_0

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v3, "Deferred"

    .line 92
    .line 93
    invoke-static {v1, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_0

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    array-length v1, v0

    .line 107
    move v3, v2

    .line 108
    :goto_0
    if-ge v3, v1, :cond_0

    .line 109
    .line 110
    aget-object v4, v0, v3

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-static {v4, p2, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    const/4 p0, 0x0

    .line 127
    :goto_1
    check-cast p0, Ljava/lang/reflect/Method;

    .line 128
    .line 129
    return-object p0
.end method

.method private final findFetchPublicListInCoroutine(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
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
    array-length v0, p0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x2

    .line 13
    const-string v5, "fetchPublicListInCoroutine"

    .line 14
    .line 15
    if-ge v2, v0, :cond_1

    .line 16
    .line 17
    aget-object v6, p0, v2

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-static {v7, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    if-eqz v7, :cond_0

    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    array-length v7, v7

    .line 34
    if-ne v7, v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    aget-object v7, v7, v1

    .line 41
    .line 42
    const-class v8, Ljava/util/Map;

    .line 43
    .line 44
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_0

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const/4 v8, 0x1

    .line 55
    aget-object v7, v7, v8

    .line 56
    .line 57
    const-class v8, Lop;

    .line 58
    .line 59
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v6, v3

    .line 70
    :goto_1
    if-nez v6, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    array-length p1, p0

    .line 80
    :goto_2
    if-ge v1, p1, :cond_3

    .line 81
    .line 82
    aget-object v0, p0, v1

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    array-length v2, v2

    .line 99
    if-ne v2, v4, :cond_2

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    return-object v3

    .line 106
    :cond_4
    return-object v6
.end method

.method private final invokeDeferredApi(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    :try_start_0
    array-length v0, p3

    .line 2
    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p3

    .line 6
    invoke-virtual {p1, p2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    array-length p3, p2

    .line 26
    const/4 v0, 0x0

    .line 27
    move v1, v0

    .line 28
    :goto_0
    const-string v3, "await"

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    if-ge v1, p3, :cond_2

    .line 32
    .line 33
    aget-object v5, p2, v1

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {v6, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    array-length v6, v6

    .line 50
    if-ne v6, v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    aget-object v6, v6, v0

    .line 57
    .line 58
    const-class v7, Lop;

    .line 59
    .line 60
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v5, p1

    .line 71
    :goto_1
    if-nez v5, :cond_6

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    array-length p3, p2

    .line 85
    move v1, v0

    .line 86
    :goto_2
    if-ge v1, p3, :cond_4

    .line 87
    .line 88
    aget-object v5, p2, v1

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-static {v6, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_3

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    array-length v6, v6

    .line 105
    if-ne v6, v4, :cond_3

    .line 106
    .line 107
    move-object p1, v5

    .line 108
    goto :goto_3

    .line 109
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    :goto_3
    if-eqz p1, :cond_5

    .line 113
    .line 114
    move-object v1, p1

    .line 115
    goto :goto_4

    .line 116
    :cond_5
    const-string p0, "Deferred.await"

    .line 117
    .line 118
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    return-object p0

    .line 123
    :cond_6
    move-object v1, v5

    .line 124
    :goto_4
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 125
    .line 126
    .line 127
    new-array v3, v0, [Ljava/lang/Object;

    .line 128
    .line 129
    move-object v0, p0

    .line 130
    move-wide v4, p4

    .line 131
    invoke-direct/range {v0 .. v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->invokeSuspendApi(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;J)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :catch_0
    move-exception v0

    .line 137
    move-object p0, v0

    .line 138
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-nez p1, :cond_7

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move-object p0, p1

    .line 146
    :goto_5
    throw p0
.end method

.method private final invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :goto_0
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_1
    if-ge v3, v2, :cond_1

    .line 26
    .line 27
    aget-object v4, v1, v3

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v5, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    array-length v5, v5

    .line 47
    if-nez v5, :cond_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v4, p0

    .line 56
    :goto_2
    if-eqz v4, :cond_2

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    invoke-virtual {v4, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move-object p2, p0

    .line 73
    goto :goto_4

    .line 74
    :goto_3
    new-instance p2, Leo1;

    .line 75
    .line 76
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :goto_4
    if-eqz p2, :cond_4

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_4
    move-object p0, p2

    .line 83
    :goto_5
    return-object p0
.end method

.method private final invokeSuspendApi(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    move-wide/from16 v2, p4

    .line 4
    .line 5
    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {v4, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v5, Lum1;

    .line 12
    .line 13
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v6, Lum1;

    .line 17
    .line 18
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    array-length v7, v1

    .line 29
    invoke-static {v7, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v7, v0

    .line 34
    check-cast v7, Ljava/lang/Class;

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    if-eqz v7, :cond_d

    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    const-class v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_0
    move-object v9, v0

    .line 62
    invoke-static {}, Lux;->π()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const-string v10, "r1b07f0e328a2e9ac"

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    const-string v13, ", continuationClass="

    .line 87
    .line 88
    const-string v14, ", continuationLoader="

    .line 89
    .line 90
    const-string v15, "invokeSuspendApi method="

    .line 91
    .line 92
    invoke-static {v15, v0, v13, v11, v14}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v11, ", receiverLoader="

    .line 100
    .line 101
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v10, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_1
    :try_start_0
    const-string v0, "up"

    .line 115
    .line 116
    const/4 v11, 0x0

    .line 117
    invoke-static {v0, v11, v9}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    goto :goto_0

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    new-instance v11, Leo1;

    .line 124
    .line 125
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object v0, v11

    .line 129
    :goto_0
    instance-of v11, v0, Leo1;

    .line 130
    .line 131
    if-eqz v11, :cond_2

    .line 132
    .line 133
    move-object v0, v8

    .line 134
    :cond_2
    check-cast v0, Ljava/lang/Class;

    .line 135
    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v11, Lrh0;

    .line 143
    .line 144
    const/4 v12, 0x2

    .line 145
    invoke-direct {v11, v12}, Lrh0;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-static {v9, v0, v11}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    goto :goto_1

    .line 153
    :cond_3
    move-object v0, v8

    .line 154
    :goto_1
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    new-instance v11, Llb0;

    .line 159
    .line 160
    invoke-direct {v11, v0, v6, v5, v4}, Llb0;-><init>(Ljava/lang/Object;Lum1;Lum1;Ljava/util/concurrent/CountDownLatch;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v9, v7, v11}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :try_start_1
    array-length v7, v1

    .line 168
    add-int/lit8 v9, v7, 0x1

    .line 169
    .line 170
    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    aput-object v0, v1, v7

    .line 175
    .line 176
    array-length v0, v1

    .line 177
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    move-object/from16 v1, p1

    .line 182
    .line 183
    move-object/from16 v7, p2

    .line 184
    .line 185
    invoke-virtual {v1, v7, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 189
    invoke-static {}, Lux;->π()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_5

    .line 194
    .line 195
    if-eqz v0, :cond_4

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    goto :goto_2

    .line 206
    :cond_4
    move-object v1, v8

    .line 207
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string v9, "invokeSuspendApi immediateClass="

    .line 210
    .line 211
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v1, ", immediate="

    .line 218
    .line 219
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {v10, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :cond_5
    move-object/from16 v1, p0

    .line 233
    .line 234
    invoke-direct {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->isCoroutineSuspendedMarker(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-nez v1, :cond_6

    .line 239
    .line 240
    return-object v0

    .line 241
    :cond_6
    invoke-static {}, Lux;->π()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    const-string v1, "ms"

    .line 246
    .line 247
    if-eqz v0, :cond_7

    .line 248
    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v7, "invokeSuspendApi suspended, waiting continuation timeout="

    .line 252
    .line 253
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-static {v10, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :cond_7
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 270
    .line 271
    invoke-virtual {v4, v2, v3, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_b

    .line 276
    .line 277
    iget-object v0, v6, Lum1;->ε:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, Ljava/lang/Throwable;

    .line 280
    .line 281
    if-nez v0, :cond_a

    .line 282
    .line 283
    invoke-static {}, Lux;->π()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_9

    .line 288
    .line 289
    iget-object v0, v5, Lum1;->ε:Ljava/lang/Object;

    .line 290
    .line 291
    if-eqz v0, :cond_8

    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    :cond_8
    iget-object v0, v5, Lum1;->ε:Ljava/lang/Object;

    .line 302
    .line 303
    new-instance v1, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    const-string v2, "invokeSuspendApi resumed valueClass="

    .line 306
    .line 307
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v2, ", value="

    .line 314
    .line 315
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-static {v10, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :cond_9
    iget-object v0, v5, Lum1;->ε:Ljava/lang/Object;

    .line 329
    .line 330
    return-object v0

    .line 331
    :cond_a
    throw v0

    .line 332
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 333
    .line 334
    new-instance v4, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    const-string v5, "suspend api timeout "

    .line 337
    .line 338
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :catch_0
    move-exception v0

    .line 356
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-nez v1, :cond_c

    .line 361
    .line 362
    goto :goto_3

    .line 363
    :cond_c
    move-object v0, v1

    .line 364
    :goto_3
    throw v0

    .line 365
    :cond_d
    const-string v0, "missing continuation parameter"

    .line 366
    .line 367
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    return-object v8
.end method

.method private static final invokeSuspendApi$lambda$20$lambda$19(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_a

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    sparse-switch v1, :sswitch_data_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :sswitch_0
    const-string p2, "hashCode"

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :sswitch_1
    const-string v1, "plus"

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    if-eqz p2, :cond_8

    .line 46
    .line 47
    invoke-static {v2, p2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-object p1

    .line 55
    :sswitch_2
    const-string p0, "fold"

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    if-eqz p2, :cond_4

    .line 65
    .line 66
    invoke-static {v2, p2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_4
    return-object v0

    .line 72
    :sswitch_3
    const-string p0, "get"

    .line 73
    .line 74
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :sswitch_4
    const-string v1, "equals"

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    if-eqz p2, :cond_6

    .line 88
    .line 89
    invoke-static {v2, p2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_6
    if-ne p0, v0, :cond_7

    .line 94
    .line 95
    const/4 v2, 0x1

    .line 96
    :cond_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :sswitch_5
    const-string p2, "minusKey"

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_8

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_8
    :goto_0
    return-object p0

    .line 111
    :sswitch_6
    const-string p0, "toString"

    .line 112
    .line 113
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-nez p0, :cond_9

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_9
    const-string p0, "HostEmptyCoroutineContextProxy"

    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_a
    :goto_1
    return-object v0

    .line 124
    nop

    .line 125
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_6
        -0x50565831 -> :sswitch_5
        -0x4d378041 -> :sswitch_4
        0x18f56 -> :sswitch_3
        0x300c01 -> :sswitch_2
        0x348d9a -> :sswitch_1
        0x8cdac1b -> :sswitch_0
    .end sparse-switch
.end method

.method private static final invokeSuspendApi$lambda$22(Ljava/lang/Object;Lum1;Lum1;Ljava/util/concurrent/CountDownLatch;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "suspend api failure: "

    .line 2
    .line 3
    const-string v1, "continuation.resumeWith resultClass="

    .line 4
    .line 5
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p5

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz p5, :cond_d

    .line 11
    .line 12
    invoke-virtual {p5}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sparse-switch v3, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :sswitch_0
    const-string p1, "getContext"

    .line 22
    .line 23
    invoke-virtual {p5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_0
    return-object p0

    .line 32
    :sswitch_1
    const-string p0, "hashCode"

    .line 33
    .line 34
    invoke-virtual {p5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_1
    invoke-static {p4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :sswitch_2
    const-string p0, "resumeWith"

    .line 52
    .line 53
    invoke-virtual {p5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_2
    if-eqz p6, :cond_3

    .line 62
    .line 63
    :try_start_0
    invoke-static {p6}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move-object p0, v2

    .line 71
    :goto_0
    invoke-static {}, Lux;->π()Z

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    if-eqz p4, :cond_5

    .line 76
    .line 77
    const-string p4, "r1b07f0e328a2e9ac"

    .line 78
    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object p5

    .line 85
    invoke-virtual {p5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p5

    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object p5, v2

    .line 91
    :goto_1
    new-instance p6, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {p6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p5, ", result="

    .line 100
    .line 101
    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p5

    .line 111
    invoke-static {p4, p5}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    if-nez p0, :cond_6

    .line 115
    .line 116
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string p2, "resumeWith result is null"

    .line 119
    .line 120
    invoke-direct {p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iput-object p0, p1, Lum1;->ε:Ljava/lang/Object;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    sget-object p4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;

    .line 127
    .line 128
    invoke-direct {p4, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->isKotlinResultFailure(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p5

    .line 132
    if-eqz p5, :cond_8

    .line 133
    .line 134
    invoke-direct {p4, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->extractThrowableFromFailure(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    if-nez p2, :cond_7

    .line 139
    .line 140
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    new-instance p4, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-direct {p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    iput-object p2, p1, Lum1;->ε:Ljava/lang/Object;

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    iput-object p0, p2, Lum1;->ε:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    .line 162
    :goto_2
    invoke-virtual {p3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :goto_3
    :try_start_1
    iput-object p0, p1, Lum1;->ε:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :goto_4
    return-object v2

    .line 170
    :catchall_1
    move-exception p0

    .line 171
    invoke-virtual {p3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 172
    .line 173
    .line 174
    throw p0

    .line 175
    :sswitch_3
    const-string p0, "equals"

    .line 176
    .line 177
    invoke-virtual {p5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_9

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_9
    if-eqz p6, :cond_a

    .line 185
    .line 186
    invoke-static {p6}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    :cond_a
    if-ne p4, v2, :cond_b

    .line 191
    .line 192
    const/4 p0, 0x1

    .line 193
    goto :goto_5

    .line 194
    :cond_b
    const/4 p0, 0x0

    .line 195
    :goto_5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    return-object p0

    .line 200
    :sswitch_4
    const-string p0, "toString"

    .line 201
    .line 202
    invoke-virtual {p5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    if-nez p0, :cond_c

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_c
    const-string p0, "HostContinuationProxy"

    .line 210
    .line 211
    return-object p0

    .line 212
    :cond_d
    :goto_6
    return-object v2

    .line 213
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_4
        -0x4d378041 -> :sswitch_3
        -0x2132f16d -> :sswitch_2
        0x8cdac1b -> :sswitch_1
        0x76847179 -> :sswitch_0
    .end sparse-switch
.end method

.method private final isCoroutineSuspendedMarker(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    sget-object p0, Lcq;->ε:Lcq;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne p1, p0, :cond_1

    .line 9
    .line 10
    return v0

    .line 11
    :cond_1
    instance-of p0, p1, Ljava/lang/Enum;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz p0, :cond_2

    .line 15
    .line 16
    move-object p0, p1

    .line 17
    check-cast p0, Ljava/lang/Enum;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move-object p0, v1

    .line 21
    :goto_0
    if-eqz p0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_3
    const-string p0, "COROUTINE_SUSPENDED"

    .line 28
    .line 29
    invoke-static {v1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    return v0

    .line 36
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "kotlin.coroutines.intrinsics.CoroutineSingletons"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    return p0

    .line 61
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0
.end method

.method private final isKotlinResultFailure(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "kotlin.Result$Failure"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    const-string v0, "Result"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string v0, "Failure"

    .line 28
    .line 29
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_0
    if-eqz p0, :cond_4

    .line 41
    .line 42
    const-class p1, Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    array-length v0, p1

    .line 58
    move v2, v1

    .line 59
    :goto_1
    if-ge v2, v0, :cond_3

    .line 60
    .line 61
    aget-object v3, p1, v2

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v4, "exception"

    .line 68
    .line 69
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    :goto_2
    const/4 p0, 0x1

    .line 76
    return p0

    .line 77
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    goto :goto_0

    .line 85
    :cond_4
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    new-instance p1, Leo1;

    .line 90
    .line 91
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object p0, p1

    .line 95
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 96
    .line 97
    instance-of v0, p0, Leo1;

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    move-object p0, p1

    .line 102
    :cond_5
    check-cast p0, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    return p0
.end method

.method public static synthetic loadProfileAwemeList$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;IJILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;
    .locals 9

    .line 1
    and-int/lit8 v0, p9, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 p3, 0x14

    .line 6
    .line 7
    :cond_0
    move v3, p3

    .line 8
    and-int/lit8 p3, p9, 0x8

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    const-wide/16 p4, 0x0

    .line 13
    .line 14
    :cond_1
    move-wide v4, p4

    .line 15
    and-int/lit8 p3, p9, 0x10

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    const/4 p3, 0x1

    .line 20
    move v6, p3

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move v6, p6

    .line 23
    :goto_0
    and-int/lit8 p3, p9, 0x20

    .line 24
    .line 25
    if-eqz p3, :cond_3

    .line 26
    .line 27
    const-string p3, "legacy"

    .line 28
    .line 29
    move-object v7, p3

    .line 30
    goto :goto_1

    .line 31
    :cond_3
    move-object/from16 v7, p7

    .line 32
    .line 33
    :goto_1
    and-int/lit8 p3, p9, 0x40

    .line 34
    .line 35
    if-eqz p3, :cond_4

    .line 36
    .line 37
    const-string p3, "public"

    .line 38
    .line 39
    move-object v8, p3

    .line 40
    :goto_2
    move-object v0, p0

    .line 41
    move-object v1, p1

    .line 42
    move-object v2, p2

    .line 43
    goto :goto_3

    .line 44
    :cond_4
    move-object/from16 v8, p8

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :goto_3
    invoke-virtual/range {v0 .. v8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->loadProfileAwemeList(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;IJILjava/lang/String;Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method private final logDev(Lp70;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp70;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lux;->π()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    const-string p1, "r1b07f0e328a2e9ac"

    .line 14
    .line 15
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method private final readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :goto_0
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_1
    if-ge v3, v2, :cond_1

    .line 26
    .line 27
    aget-object v4, v1, v3

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v5, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    move-object v4, p0

    .line 46
    :goto_2
    if-eqz v4, :cond_2

    .line 47
    .line 48
    const/4 p2, 0x1

    .line 49
    invoke-virtual {v4, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move-object p2, p0

    .line 63
    goto :goto_4

    .line 64
    :goto_3
    new-instance p2, Leo1;

    .line 65
    .line 66
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    :goto_4
    if-eqz p2, :cond_4

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_4
    move-object p0, p2

    .line 73
    :goto_5
    return-object p0
.end method

.method private final readHasMore(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const-string v0, "isHasMore"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    instance-of p0, v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    return v1

    .line 26
    :cond_2
    const-string v0, "getHasMore"

    .line 27
    .line 28
    const-string v2, "hasMore"

    .line 29
    .line 30
    invoke-direct {p0, p1, v0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->readLong(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide p0

    .line 40
    const-wide/16 v2, 0x1

    .line 41
    .line 42
    cmp-long p0, p0, v2

    .line 43
    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_3
    return v1
.end method

.method private final readLong(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1, p3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :cond_0
    instance-of p0, p2, Ljava/lang/Number;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    instance-of p0, p2, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    check-cast p2, Ljava/lang/String;

    .line 31
    .line 32
    const/16 p0, 0xa

    .line 33
    .line 34
    invoke-static {p2, p0}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method private final resolveApiFromPostAwemeRepo(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->CLASS_POST_AWEME_REPO:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    move-object p1, p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "LIZ"

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    new-instance v0, Leo1;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object p1, v0

    .line 44
    :goto_0
    instance-of v0, p1, Leo1;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object p0, p1

    .line 50
    :goto_1
    return-object p0
.end method

.method public static synthetic α(Ljava/lang/Object;Lum1;Lum1;Ljava/util/concurrent/CountDownLatch;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->invokeSuspendApi$lambda$22(Ljava/lang/Object;Lum1;Lum1;Ljava/util/concurrent/CountDownLatch;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic β(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->invokeSuspendApi$lambda$20$lambda$19(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final loadProfileAwemeList(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;IJILjava/lang/String;Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;
    .locals 17

    .line 1
    move-object/from16 v7, p8

    .line 2
    .line 3
    const-string v8, "/aweme/v1/locate/post/"

    .line 4
    .line 5
    const-string v9, ", secUid="

    .line 6
    .line 7
    const-string v10, "profile aweme response="

    .line 8
    .line 9
    const-string v11, "parsed aweme items="

    .line 10
    .line 11
    const-string v12, "invoke profile aweme list uid="

    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v13, 0x0

    .line 34
    const-string v14, "r1b07f0e328a2e9ac"

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v1, "skip, uid/secUid empty record="

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v1, p2

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-static {v14, v0, v13, v1, v13}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v13

    .line 69
    :cond_0
    move-object/from16 v1, p2

    .line 70
    .line 71
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 72
    .line 73
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->CLASS_POST_AWEME_REPO_TAB_API:Ljava/lang/String;

    .line 74
    .line 75
    move-object/from16 v2, p1

    .line 76
    .line 77
    invoke-static {v2, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v15

    .line 81
    if-eqz v15, :cond_e

    .line 82
    .line 83
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 84
    .line 85
    invoke-virtual {v0, v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveApiInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->resolveApiFromPostAwemeRepo(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    :cond_1
    move/from16 v2, p3

    .line 98
    .line 99
    move-wide/from16 v3, p4

    .line 100
    .line 101
    move/from16 v5, p6

    .line 102
    .line 103
    move-object/from16 v6, p7

    .line 104
    .line 105
    move-object/from16 v16, v0

    .line 106
    .line 107
    move-object/from16 v0, p0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string v2, "PostAwemeRepo.TabApi instance is null"

    .line 113
    .line 114
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v0

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto/16 :goto_8

    .line 120
    .line 121
    :goto_0
    invoke-direct/range {v0 .. v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->buildQueryMap(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;IJILjava/lang/String;)Ljava/util/LinkedHashMap;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {}, Lux;->π()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_3

    .line 130
    .line 131
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    new-instance v4, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v1, ", endpoint="

    .line 154
    .line 155
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v1, ", variant="

    .line 162
    .line 163
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    move-object/from16 v6, p7

    .line 167
    .line 168
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v1, ", query="

    .line 172
    .line 173
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v14, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :cond_3
    const-string v1, "locate"

    .line 187
    .line 188
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    const/4 v3, 0x1

    .line 193
    if-eqz v1, :cond_6

    .line 194
    .line 195
    invoke-direct {v0, v15, v8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->findDeferredFeedItemListMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    if-nez v1, :cond_5

    .line 200
    .line 201
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-direct {v0, v1, v8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->findDeferredFeedItemListMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-eqz v1, :cond_4

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_4
    new-instance v0, Ljava/lang/NoSuchMethodException;

    .line 213
    .line 214
    const-string v1, "locatePost"

    .line 215
    .line 216
    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v0

    .line 220
    :cond_5
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 221
    .line 222
    .line 223
    const/high16 v3, 0x100000

    .line 224
    .line 225
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const-wide/16 v3, 0x3a98

    .line 234
    .line 235
    move-object/from16 p3, v0

    .line 236
    .line 237
    move-object/from16 p4, v1

    .line 238
    .line 239
    move-object/from16 p6, v2

    .line 240
    .line 241
    move-wide/from16 p7, v3

    .line 242
    .line 243
    move-object/from16 p5, v16

    .line 244
    .line 245
    invoke-direct/range {p3 .. p8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->invokeDeferredApi(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;J)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    move-object/from16 v1, p3

    .line 250
    .line 251
    :goto_2
    move-object v4, v0

    .line 252
    goto :goto_4

    .line 253
    :cond_6
    move-object v1, v0

    .line 254
    move-object/from16 v0, v16

    .line 255
    .line 256
    invoke-direct {v1, v15}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->findFetchPublicListInCoroutine(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    if-nez v4, :cond_8

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-direct {v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->findFetchPublicListInCoroutine(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    if-eqz v4, :cond_7

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_7
    new-instance v0, Ljava/lang/NoSuchMethodException;

    .line 274
    .line 275
    const-string v1, "fetchPublicListInCoroutine"

    .line 276
    .line 277
    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :cond_8
    :goto_3
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 282
    .line 283
    .line 284
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const-wide/16 v5, 0x3a98

    .line 289
    .line 290
    move-object/from16 p5, v0

    .line 291
    .line 292
    move-object/from16 p3, v1

    .line 293
    .line 294
    move-object/from16 p6, v2

    .line 295
    .line 296
    move-object/from16 p4, v4

    .line 297
    .line 298
    move-wide/from16 p7, v5

    .line 299
    .line 300
    invoke-direct/range {p3 .. p8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->invokeSuspendApi(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;J)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    goto :goto_2

    .line 305
    :goto_4
    if-eqz v4, :cond_d

    .line 306
    .line 307
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 308
    .line 309
    invoke-virtual {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findAwemeItems(Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-direct {v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->readHasMore(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    const-string v2, "getMaxCursor"

    .line 318
    .line 319
    const-string v6, "maxCursor"

    .line 320
    .line 321
    invoke-direct {v1, v4, v2, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->readLong(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    if-eqz v1, :cond_9

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 328
    .line 329
    .line 330
    move-result-wide v1

    .line 331
    :goto_5
    move-wide v6, v1

    .line 332
    goto :goto_6

    .line 333
    :cond_9
    const-wide/16 v1, 0x0

    .line 334
    .line 335
    goto :goto_5

    .line 336
    :goto_6
    invoke-static {}, Lux;->π()Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-eqz v1, :cond_a

    .line 341
    .line 342
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    invoke-virtual {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->dumpShort(Ljava/lang/Object;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    new-instance v2, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-string v1, ", hasMore="

    .line 359
    .line 360
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    const-string v1, ", maxCursor="

    .line 367
    .line 368
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    const-string v1, ", responseDump="

    .line 375
    .line 376
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    :cond_a
    invoke-static {}, Lux;->π()Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_c

    .line 394
    .line 395
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    invoke-static {v3}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 412
    .line 413
    if-eqz v2, :cond_b

    .line 414
    .line 415
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    goto :goto_7

    .line 420
    :cond_b
    move-object v2, v13

    .line 421
    :goto_7
    new-instance v8, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    const-string v0, ", items="

    .line 430
    .line 431
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    const-string v0, ", first="

    .line 438
    .line 439
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    :cond_c
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 453
    .line 454
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    invoke-direct/range {v1 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;-><init>(ILjava/util/List;Ljava/lang/Object;ZJ)V

    .line 459
    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 463
    .line 464
    const-string v1, "profile aweme list returns null"

    .line 465
    .line 466
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw v0

    .line 470
    :cond_e
    new-instance v1, Ljava/lang/ClassNotFoundException;

    .line 471
    .line 472
    invoke-direct {v1, v0}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 476
    :goto_8
    new-instance v1, Leo1;

    .line 477
    .line 478
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 479
    .line 480
    .line 481
    :goto_9
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    if-eqz v0, :cond_f

    .line 486
    .line 487
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    const-string v4, "loadProfileAwemeList failed uid="

    .line 496
    .line 497
    invoke-static {v4, v2, v9, v3}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-static {v14, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 502
    .line 503
    .line 504
    :cond_f
    instance-of v0, v1, Leo1;

    .line 505
    .line 506
    if-eqz v0, :cond_10

    .line 507
    .line 508
    goto :goto_a

    .line 509
    :cond_10
    move-object v13, v1

    .line 510
    :goto_a
    check-cast v13, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 511
    .line 512
    return-object v13
.end method

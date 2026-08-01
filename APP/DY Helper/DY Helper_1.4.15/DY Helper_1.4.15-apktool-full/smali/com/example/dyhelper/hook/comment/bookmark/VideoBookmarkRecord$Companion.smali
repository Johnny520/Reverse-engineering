.class public final Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;
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
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final resolveTypeLabel(Lf8;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p1, Lf8;->ζ:Lh8;

    .line 2
    .line 3
    iget-object v0, p1, Lf8;->ζ:Lh8;

    .line 4
    .line 5
    sget-object v1, Lh8;->η:Lh8;

    .line 6
    .line 7
    if-eq p0, v1, :cond_7

    .line 8
    .line 9
    invoke-virtual {p1}, Lf8;->λ()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    sget-object p0, Lh8;->ζ:Lh8;

    .line 17
    .line 18
    if-eq v0, p0, :cond_6

    .line 19
    .line 20
    invoke-virtual {p1}, Lf8;->κ()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    sget-object p0, Lh8;->ε:Lh8;

    .line 28
    .line 29
    if-eq v0, p0, :cond_5

    .line 30
    .line 31
    invoke-virtual {p1}, Lf8;->ν()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    sget-object p0, Lh8;->θ:Lh8;

    .line 39
    .line 40
    if-eq v0, p0, :cond_4

    .line 41
    .line 42
    invoke-virtual {p1}, Lf8;->ι()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const-string p0, "\u4f5c\u54c1"

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_4
    :goto_0
    const-string p0, "\u6587\u5b57\u4f5c\u54c1"

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_5
    :goto_1
    const-string p0, "\u89c6\u9891\u4f5c\u54c1"

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_6
    :goto_2
    const-string p0, "\u56fe\u6587\u4f5c\u54c1"

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_7
    :goto_3
    const-string p0, "LivePhoto\u4f5c\u54c1"

    .line 62
    .line 63
    return-object p0
.end method


# virtual methods
.method public final fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;
    .locals 26

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lf8;->Ο:Ljava/util/List;

    .line 7
    .line 8
    iget-object v2, v0, Lf8;->θ:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v2, v3

    .line 23
    :goto_0
    const-string v4, ""

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    move-object v6, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v6, v2

    .line 30
    :goto_1
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    return-object v3

    .line 37
    :cond_2
    iget-object v7, v0, Lf8;->ε:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v8, v0, Lf8;->Μ:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, v0, Lf8;->δ:Ljava/util/List;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-static {v2}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    move-object v9, v2

    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move-object v9, v3

    .line 54
    :goto_2
    iget-object v10, v0, Lf8;->Ε:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    invoke-static {v1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lqu0;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    iget-object v2, v2, Lqu0;->δ:Ljava/lang/String;

    .line 67
    .line 68
    move-object v11, v2

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move-object v11, v3

    .line 71
    :goto_3
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-static {v1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lqu0;

    .line 78
    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    iget-object v1, v1, Lqu0;->γ:Ljava/lang/String;

    .line 82
    .line 83
    move-object v12, v1

    .line 84
    goto :goto_4

    .line 85
    :cond_5
    move-object v12, v3

    .line 86
    :goto_4
    filled-new-array/range {v7 .. v12}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v5, v2

    .line 109
    check-cast v5, Ljava/lang/String;

    .line 110
    .line 111
    const-string v7, "http"

    .line 112
    .line 113
    const/4 v8, 0x1

    .line 114
    invoke-static {v5, v7, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_6

    .line 119
    .line 120
    move-object v3, v2

    .line 121
    :cond_7
    check-cast v3, Ljava/lang/String;

    .line 122
    .line 123
    if-nez v3, :cond_8

    .line 124
    .line 125
    move-object v12, v4

    .line 126
    goto :goto_5

    .line 127
    :cond_8
    move-object v12, v3

    .line 128
    :goto_5
    new-instance v5, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 129
    .line 130
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;->resolveTypeLabel(Lf8;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    iget-object v8, v0, Lf8;->β:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v9, v0, Lf8;->α:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v1, v0, Lf8;->ι:Ljava/lang/String;

    .line 139
    .line 140
    if-nez v1, :cond_9

    .line 141
    .line 142
    move-object v10, v4

    .line 143
    goto :goto_6

    .line 144
    :cond_9
    move-object v10, v1

    .line 145
    :goto_6
    iget-object v1, v0, Lf8;->κ:Ljava/lang/String;

    .line 146
    .line 147
    if-nez v1, :cond_a

    .line 148
    .line 149
    move-object v11, v4

    .line 150
    goto :goto_7

    .line 151
    :cond_a
    move-object v11, v1

    .line 152
    :goto_7
    iget-object v1, v0, Lf8;->η:Ljava/lang/String;

    .line 153
    .line 154
    if-nez v1, :cond_b

    .line 155
    .line 156
    move-object v13, v4

    .line 157
    goto :goto_8

    .line 158
    :cond_b
    move-object v13, v1

    .line 159
    :goto_8
    iget-wide v14, v0, Lf8;->Σ:J

    .line 160
    .line 161
    iget-wide v1, v0, Lf8;->Τ:J

    .line 162
    .line 163
    iget-wide v3, v0, Lf8;->Υ:J

    .line 164
    .line 165
    move-wide/from16 v16, v1

    .line 166
    .line 167
    iget-wide v0, v0, Lf8;->σ:J

    .line 168
    .line 169
    const/16 v24, 0x1000

    .line 170
    .line 171
    const/16 v25, 0x0

    .line 172
    .line 173
    const-wide/16 v22, 0x0

    .line 174
    .line 175
    move-wide/from16 v20, v0

    .line 176
    .line 177
    move-wide/from16 v18, v3

    .line 178
    .line 179
    invoke-direct/range {v5 .. v25}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJILzq;)V

    .line 180
    .line 181
    .line 182
    return-object v5
.end method

.method public final fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "awemeId"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "typeLabel"

    .line 16
    .line 17
    const-string v2, "\u4f5c\u54c1"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    move-object v4, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v4, v1

    .line 32
    :goto_0
    const-string v1, "title"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const-string v1, "authorName"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-string v1, "authorUid"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const-string v1, "authorSecUid"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-string v1, "coverUrl"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const-string v1, "shareUrl"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const-string v1, "diggCount"

    .line 87
    .line 88
    const-wide/16 v11, 0x0

    .line 89
    .line 90
    invoke-virtual {v0, v1, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    const-string v13, "commentCount"

    .line 95
    .line 96
    invoke-virtual {v0, v13, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 97
    .line 98
    .line 99
    move-result-wide v13

    .line 100
    const-string v15, "collectCount"

    .line 101
    .line 102
    invoke-virtual {v0, v15, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v15

    .line 106
    move-wide/from16 v17, v1

    .line 107
    .line 108
    const-string v1, "createTime"

    .line 109
    .line 110
    invoke-virtual {v0, v1, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v1

    .line 114
    const-string v11, "createTimestamp"

    .line 115
    .line 116
    move-wide/from16 v19, v1

    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    invoke-virtual {v0, v11, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 127
    .line 128
    move-wide/from16 v11, v17

    .line 129
    .line 130
    move-wide/from16 v17, v19

    .line 131
    .line 132
    move-wide/from16 v19, v0

    .line 133
    .line 134
    invoke-direct/range {v2 .. v20}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJ)V

    .line 135
    .line 136
    .line 137
    return-object v2
.end method

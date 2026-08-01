.class public abstract Lf31;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ε:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lf31;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf31;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lf31;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    sget-object v1, Lkz;->ε:Lkz;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lf31;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    const-string v18, "webp_image"

    .line 33
    .line 34
    const-string v19, "webpImage"

    .line 35
    .line 36
    const-string v2, "animated_image"

    .line 37
    .line 38
    const-string v3, "animatedImage"

    .line 39
    .line 40
    const-string v4, "dynamic_image"

    .line 41
    .line 42
    const-string v5, "dynamicImage"

    .line 43
    .line 44
    const-string v6, "motion_image"

    .line 45
    .line 46
    const-string v7, "motionImage"

    .line 47
    .line 48
    const-string v8, "live_photo"

    .line 49
    .line 50
    const-string v9, "livePhoto"

    .line 51
    .line 52
    const-string v10, "live_photo_image"

    .line 53
    .line 54
    const-string v11, "livePhotoImage"

    .line 55
    .line 56
    const-string v12, "video"

    .line 57
    .line 58
    const-string v13, "video_info"

    .line 59
    .line 60
    const-string v14, "videoInfo"

    .line 61
    .line 62
    const-string v15, "gif"

    .line 63
    .line 64
    const-string v16, "gif_image"

    .line 65
    .line 66
    const-string v17, "gifImage"

    .line 67
    .line 68
    filled-new-array/range {v2 .. v19}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Lf31;->ε:Ljava/util/List;

    .line 77
    .line 78
    return-void
.end method

.method public static α(Lorg/json/JSONObject;)V
    .locals 58

    .line 1
    const-string v0, "sec_uid"

    .line 2
    .line 3
    const-string v1, "signature"

    .line 4
    .line 5
    :try_start_0
    const-string v2, "user"

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    const-string v3, "uid"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v14

    .line 24
    if-nez v14, :cond_1

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_1
    invoke-static {v2}, Lf31;->ι(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v21

    .line 32
    new-instance v5, Lf8;

    .line 33
    .line 34
    const-string v3, "nickname"

    .line 35
    .line 36
    const-string v6, "\u672a\u77e5"

    .line 37
    .line 38
    invoke-virtual {v2, v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string v3, ""

    .line 46
    .line 47
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    invoke-virtual {v2, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v16

    .line 62
    const-string v1, "follower_count"

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v17

    .line 69
    const-string v1, "following_count"

    .line 70
    .line 71
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 72
    .line 73
    .line 74
    move-result v18

    .line 75
    const-string v1, "aweme_count"

    .line 76
    .line 77
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 78
    .line 79
    .line 80
    move-result v19

    .line 81
    const-string v1, "verification_type"

    .line 82
    .line 83
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 84
    .line 85
    .line 86
    move-result v20

    .line 87
    const-string v1, "live_status"

    .line 88
    .line 89
    const-wide/16 v8, 0x0

    .line 90
    .line 91
    invoke-virtual {v2, v1, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v10

    .line 95
    cmp-long v1, v10, v8

    .line 96
    .line 97
    if-lez v1, :cond_2

    .line 98
    .line 99
    const/4 v3, 0x1

    .line 100
    :cond_2
    move/from16 v22, v3

    .line 101
    .line 102
    const v56, -0x1ff04

    .line 103
    .line 104
    .line 105
    const/16 v57, 0x1fff

    .line 106
    .line 107
    const/4 v8, 0x0

    .line 108
    const/4 v9, 0x0

    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v11, 0x0

    .line 111
    const/4 v12, 0x0

    .line 112
    const/4 v13, 0x0

    .line 113
    const-wide/16 v23, 0x0

    .line 114
    .line 115
    const/16 v25, 0x0

    .line 116
    .line 117
    const/16 v26, 0x0

    .line 118
    .line 119
    const/16 v27, 0x0

    .line 120
    .line 121
    const/16 v28, 0x0

    .line 122
    .line 123
    const/16 v29, 0x0

    .line 124
    .line 125
    const/16 v30, 0x0

    .line 126
    .line 127
    const/16 v31, 0x0

    .line 128
    .line 129
    const/16 v32, 0x0

    .line 130
    .line 131
    const/16 v33, 0x0

    .line 132
    .line 133
    const/16 v34, 0x0

    .line 134
    .line 135
    const/16 v35, 0x0

    .line 136
    .line 137
    const-wide/16 v36, 0x0

    .line 138
    .line 139
    const/16 v38, 0x0

    .line 140
    .line 141
    const/16 v39, 0x0

    .line 142
    .line 143
    const/16 v40, 0x0

    .line 144
    .line 145
    const/16 v41, 0x0

    .line 146
    .line 147
    const/16 v42, 0x0

    .line 148
    .line 149
    const/16 v43, 0x0

    .line 150
    .line 151
    const/16 v44, 0x0

    .line 152
    .line 153
    const/16 v45, 0x0

    .line 154
    .line 155
    const/16 v46, 0x0

    .line 156
    .line 157
    const/16 v47, 0x0

    .line 158
    .line 159
    const/16 v48, 0x0

    .line 160
    .line 161
    const-wide/16 v49, 0x0

    .line 162
    .line 163
    const-wide/16 v51, 0x0

    .line 164
    .line 165
    const-wide/16 v53, 0x0

    .line 166
    .line 167
    const/16 v55, 0x0

    .line 168
    .line 169
    invoke-direct/range {v5 .. v57}, Lf8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lh8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Li8;Ljava/util/List;JJJLjava/lang/String;II)V

    .line 170
    .line 171
    .line 172
    sget-object v1, Lf31;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 173
    .line 174
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v14}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-nez v1, :cond_3

    .line 182
    .line 183
    sget-object v1, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 184
    .line 185
    sput-object v14, Lb10;->ε:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Lb10;->ζ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    .line 193
    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method

.method public static β(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 7

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v0, "headers"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    new-array v2, v1, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p0, v0, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    const-string v0, "size"

    .line 39
    .line 40
    new-array v2, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {p0, v0, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v2, v0, Ljava/lang/Integer;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    check-cast v0, Ljava/lang/Integer;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v0, v3

    .line 55
    :goto_0
    if-eqz v0, :cond_8

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    :goto_1
    if-ge v1, v0, :cond_7

    .line 67
    .line 68
    sget-object v4, Lqe0;->α:Ljava/lang/Object;

    .line 69
    .line 70
    const-string v4, "name"

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {p0, v4, v5}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    instance-of v5, v4, Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v5, :cond_2

    .line 87
    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move-object v4, v3

    .line 92
    :goto_2
    if-nez v4, :cond_3

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_3
    const-string v5, "value"

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {p0, v5, v6}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    instance-of v6, v5, Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v6, :cond_4

    .line 112
    .line 113
    check-cast v5, Ljava/lang/String;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move-object v5, v3

    .line 117
    :goto_3
    if-nez v5, :cond_5

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    invoke-static {v4, v5}, Lf31;->σ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_6

    .line 125
    .line 126
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-nez p0, :cond_8

    .line 137
    .line 138
    sget-object p0, Lf31;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 139
    .line 140
    invoke-virtual {p0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    sget-object p0, Lf31;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 144
    .line 145
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-object v0, p0

    .line 156
    check-cast v0, Ljava/lang/Iterable;

    .line 157
    .line 158
    const/4 v5, 0x0

    .line 159
    const/16 v6, 0x3f

    .line 160
    .line 161
    const/4 v1, 0x0

    .line 162
    const/4 v2, 0x0

    .line 163
    const/4 v3, 0x0

    .line 164
    const/4 v4, 0x0

    .line 165
    invoke-static/range {v0 .. v6}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v1, "DYHelper: [HTTP-CTX] cache headers host="

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p1, " keys="

    .line 183
    .line 184
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    .line 196
    .line 197
    :catchall_0
    :cond_8
    :goto_5
    return-void
.end method

.method public static γ(Lorg/json/JSONObject;Ljava/util/ArrayList;I)V
    .locals 6

    .line 1
    const/4 v0, 0x5

    .line 2
    if-le p2, v0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v3, "animated"

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_5

    .line 46
    .line 47
    const-string v3, "animate"

    .line 48
    .line 49
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_5

    .line 54
    .line 55
    const-string v3, "animation"

    .line 56
    .line 57
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_5

    .line 62
    .line 63
    const-string v3, "dynamic"

    .line 64
    .line 65
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_5

    .line 70
    .line 71
    const-string v3, "motion"

    .line 72
    .line 73
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_5

    .line 78
    .line 79
    const-string v3, "live_photo"

    .line 80
    .line 81
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_5

    .line 86
    .line 87
    const-string v3, "livephoto"

    .line 88
    .line 89
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_5

    .line 94
    .line 95
    const-string v3, "gif"

    .line 96
    .line 97
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_5

    .line 102
    .line 103
    const-string v3, "webp"

    .line 104
    .line 105
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_5

    .line 110
    .line 111
    const-string v3, "video"

    .line 112
    .line 113
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_2

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    instance-of v1, v2, Lorg/json/JSONObject;

    .line 121
    .line 122
    if-eqz v1, :cond_3

    .line 123
    .line 124
    check-cast v2, Lorg/json/JSONObject;

    .line 125
    .line 126
    add-int/lit8 v1, p2, 0x1

    .line 127
    .line 128
    invoke-static {v2, p1, v1}, Lf31;->γ(Lorg/json/JSONObject;Ljava/util/ArrayList;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_3
    instance-of v1, v2, Lorg/json/JSONArray;

    .line 133
    .line 134
    if-eqz v1, :cond_1

    .line 135
    .line 136
    check-cast v2, Lorg/json/JSONArray;

    .line 137
    .line 138
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    :goto_1
    if-ge v4, v1, :cond_1

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    instance-of v5, v3, Lorg/json/JSONObject;

    .line 149
    .line 150
    if-eqz v5, :cond_4

    .line 151
    .line 152
    check-cast v3, Lorg/json/JSONObject;

    .line 153
    .line 154
    add-int/lit8 v5, p2, 0x1

    .line 155
    .line 156
    invoke-static {v3, p1, v5}, Lf31;->γ(Lorg/json/JSONObject;Ljava/util/ArrayList;I)V

    .line 157
    .line 158
    .line 159
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    :goto_2
    invoke-static {v2, p1, v4}, Lf31;->δ(Ljava/lang/Object;Ljava/util/ArrayList;I)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_6
    :goto_3
    return-void
.end method

.method public static δ(Ljava/lang/Object;Ljava/util/ArrayList;I)V
    .locals 4

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    const/4 v0, 0x6

    .line 12
    if-le p2, v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move-object p2, p0

    .line 21
    check-cast p2, Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "http"

    .line 24
    .line 25
    invoke-static {p2, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    instance-of v0, p0, Lorg/json/JSONArray;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    check-cast p0, Lorg/json/JSONArray;

    .line 40
    .line 41
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :goto_0
    if-ge v1, v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    add-int/lit8 v3, p2, 0x1

    .line 52
    .line 53
    invoke-static {v2, p1, v3}, Lf31;->δ(Ljava/lang/Object;Ljava/util/ArrayList;I)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    check-cast p0, Lorg/json/JSONObject;

    .line 64
    .line 65
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    add-int/lit8 v2, p2, 0x1

    .line 86
    .line 87
    invoke-static {v1, p1, v2}, Lf31;->δ(Ljava/lang/Object;Ljava/util/ArrayList;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    :goto_2
    return-void
.end method

.method public static ε(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "author"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-string v1, "uid"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-static {v0}, Lf31;->ι(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_4

    .line 31
    .line 32
    :cond_2
    const-string v3, "ip_attribution"

    .line 33
    .line 34
    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const-string v2, "null"

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_4

    .line 54
    .line 55
    move-object v0, p0

    .line 56
    :cond_4
    :goto_0
    if-eqz v0, :cond_6

    .line 57
    .line 58
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_5

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_5
    sget-object p0, Lf31;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-virtual {p0, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :catchall_0
    :cond_6
    :goto_1
    return-void
.end method

.method public static ζ(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lf31;->ε:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2, v0, v3}, Lf31;->δ(Ljava/lang/Object;Ljava/util/ArrayList;I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v1, Lel0;->α:Ljava/util/List;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-static {v0, v1}, Lel0;->ζ(Ljava/util/ArrayList;Z)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v0, v3}, Lf31;->γ(Lorg/json/JSONObject;Ljava/util/ArrayList;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lel0;->ζ(Ljava/util/ArrayList;Z)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v0, v3}, Lf31;->δ(Ljava/lang/Object;Ljava/util/ArrayList;I)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v3}, Lel0;->ζ(Ljava/util/ArrayList;Z)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public static η(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v10, "cover_large"

    .line 7
    .line 8
    const-string v11, "coverLarge"

    .line 9
    .line 10
    const-string v1, "cover"

    .line 11
    .line 12
    const-string v2, "origin_cover"

    .line 13
    .line 14
    const-string v3, "originCover"

    .line 15
    .line 16
    const-string v4, "dynamic_cover"

    .line 17
    .line 18
    const-string v5, "dynamicCover"

    .line 19
    .line 20
    const-string v6, "animated_cover"

    .line 21
    .line 22
    const-string v7, "animatedCover"

    .line 23
    .line 24
    const-string v8, "cover_medium"

    .line 25
    .line 26
    const-string v9, "coverMedium"

    .line 27
    .line 28
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-static {v3, v0, v4}, Lf31;->δ(Ljava/lang/Object;Ljava/util/ArrayList;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Lf31;->κ(Lorg/json/JSONObject;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sget-object p0, Lel0;->α:Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v0}, Lel0;->η(Ljava/util/AbstractCollection;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-nez p0, :cond_3

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v1, v0

    .line 95
    check-cast v1, Ljava/lang/String;

    .line 96
    .line 97
    const-string v2, "http"

    .line 98
    .line 99
    const/4 v3, 0x1

    .line 100
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    const/4 v0, 0x0

    .line 108
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_3
    return-object p0
.end method

.method public static θ(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "origin_image"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v0, "download_image"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v0, "download"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const-string v0, "display_image"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v0, "thumb"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    move-object v6, p0

    .line 32
    filled-new-array/range {v1 .. v6}, [Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lorg/json/JSONObject;

    .line 60
    .line 61
    invoke-static {v1}, Lf31;->κ(Lorg/json/JSONObject;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_1

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :cond_1
    sget-object p0, Lel0;->α:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v0}, Lel0;->η(Ljava/util/AbstractCollection;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public static ι(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "ip_location_string"

    .line 4
    .line 5
    const-string v2, "location"

    .line 6
    .line 7
    const-string v3, "ip_location"

    .line 8
    .line 9
    const-string v4, "ipLocation"

    .line 10
    .line 11
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string v3, "null"

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_0

    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_2
    const-string v36, "\u9999\u6e2f"

    .line 59
    .line 60
    const-string v37, "\u6fb3\u95e8"

    .line 61
    .line 62
    const-string v4, "\u5317\u4eac"

    .line 63
    .line 64
    const-string v5, "\u5929\u6d25"

    .line 65
    .line 66
    const-string v6, "\u4e0a\u6d77"

    .line 67
    .line 68
    const-string v7, "\u91cd\u5e86"

    .line 69
    .line 70
    const-string v8, "\u6cb3\u5317"

    .line 71
    .line 72
    const-string v9, "\u5c71\u897f"

    .line 73
    .line 74
    const-string v10, "\u8fbd\u5b81"

    .line 75
    .line 76
    const-string v11, "\u5409\u6797"

    .line 77
    .line 78
    const-string v12, "\u9ed1\u9f99\u6c5f"

    .line 79
    .line 80
    const-string v13, "\u6c5f\u82cf"

    .line 81
    .line 82
    const-string v14, "\u6d59\u6c5f"

    .line 83
    .line 84
    const-string v15, "\u5b89\u5fbd"

    .line 85
    .line 86
    const-string v16, "\u798f\u5efa"

    .line 87
    .line 88
    const-string v17, "\u6c5f\u897f"

    .line 89
    .line 90
    const-string v18, "\u5c71\u4e1c"

    .line 91
    .line 92
    const-string v19, "\u6cb3\u5357"

    .line 93
    .line 94
    const-string v20, "\u6e56\u5317"

    .line 95
    .line 96
    const-string v21, "\u6e56\u5357"

    .line 97
    .line 98
    const-string v22, "\u5e7f\u4e1c"

    .line 99
    .line 100
    const-string v23, "\u6d77\u5357"

    .line 101
    .line 102
    const-string v24, "\u56db\u5ddd"

    .line 103
    .line 104
    const-string v25, "\u8d35\u5dde"

    .line 105
    .line 106
    const-string v26, "\u4e91\u5357"

    .line 107
    .line 108
    const-string v27, "\u9655\u897f"

    .line 109
    .line 110
    const-string v28, "\u7518\u8083"

    .line 111
    .line 112
    const-string v29, "\u9752\u6d77"

    .line 113
    .line 114
    const-string v30, "\u53f0\u6e7e"

    .line 115
    .line 116
    const-string v31, "\u5185\u8499\u53e4"

    .line 117
    .line 118
    const-string v32, "\u5e7f\u897f"

    .line 119
    .line 120
    const-string v33, "\u897f\u85cf"

    .line 121
    .line 122
    const-string v34, "\u5b81\u590f"

    .line 123
    .line 124
    const-string v35, "\u65b0\u7586"

    .line 125
    .line 126
    filled-new-array/range {v4 .. v37}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v12, "language"

    .line 135
    .line 136
    const-string v13, "region"

    .line 137
    .line 138
    const-string v4, "nickname"

    .line 139
    .line 140
    const-string v5, "signature"

    .line 141
    .line 142
    const-string v6, "uid"

    .line 143
    .line 144
    const-string v7, "sec_uid"

    .line 145
    .line 146
    const-string v8, "unique_id"

    .line 147
    .line 148
    const-string v9, "short_id"

    .line 149
    .line 150
    const-string v10, "avatar_uri"

    .line 151
    .line 152
    const-string v11, "share_url"

    .line 153
    .line 154
    filled-new-array/range {v4 .. v13}, [Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {v2}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_7

    .line 171
    .line 172
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, Ljava/lang/String;

    .line 177
    .line 178
    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-nez v6, :cond_3

    .line 183
    .line 184
    invoke-virtual {v0, v5, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    if-nez v6, :cond_4

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    const/4 v8, 0x2

    .line 196
    if-gt v8, v7, :cond_3

    .line 197
    .line 198
    const/16 v8, 0x10

    .line 199
    .line 200
    if-ge v7, v8, :cond_3

    .line 201
    .line 202
    move-object v7, v1

    .line 203
    check-cast v7, Ljava/lang/Iterable;

    .line 204
    .line 205
    instance-of v8, v7, Ljava/util/Collection;

    .line 206
    .line 207
    if-eqz v8, :cond_5

    .line 208
    .line 209
    move-object v8, v7

    .line 210
    check-cast v8, Ljava/util/Collection;

    .line 211
    .line 212
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eqz v8, :cond_5

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_5
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    :cond_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-eqz v8, :cond_3

    .line 228
    .line 229
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    check-cast v8, Ljava/lang/String;

    .line 234
    .line 235
    const/4 v9, 0x0

    .line 236
    invoke-static {v6, v8, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-eqz v8, :cond_6

    .line 241
    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    const-string v1, "DYHelper: \ud83d\udccd \u53d1\u73b0IP key: "

    .line 245
    .line 246
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v1, " = "

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-object v6

    .line 268
    :cond_7
    return-object v3
.end method

.method public static κ(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljz;->ε:Ljz;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "origin_url_list"

    .line 12
    .line 13
    const-string v2, "url_list"

    .line 14
    .line 15
    const-string v3, "download_url_list"

    .line 16
    .line 17
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_4

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x0

    .line 53
    move v5, v4

    .line 54
    :goto_1
    if-ge v5, v3, :cond_1

    .line 55
    .line 56
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-string v7, "http"

    .line 64
    .line 65
    invoke-static {v6, v7, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    return-object v0
.end method

.method public static λ(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    const-string v0, "DYHelper: \ud83d\udccd \u7528\u6237\u8be6\u60c5IP: uid="

    .line 2
    .line 3
    :try_start_0
    const-string v1, "user"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v1, "uid"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {p0}, Lf31;->ι(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    sget-object v2, Lf31;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    invoke-virtual {v2, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", ip="

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method

.method public static varargs μ(Lorg/json/JSONObject;[Ljava/lang/String;)J
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    array-length v2, p1

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v2, :cond_2

    .line 9
    .line 10
    aget-object v4, p1, v3

    .line 11
    .line 12
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v4, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    cmp-long v6, v4, v0

    .line 23
    .line 24
    if-lez v6, :cond_1

    .line 25
    .line 26
    return-wide v4

    .line 27
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    return-wide v0
.end method

.method public static ν(Ljava/lang/String;)Ljava/util/Map;
    .locals 8

    .line 1
    sget-object v0, Lkz;->ε:Lkz;

    .line 2
    .line 3
    sget-object v1, Lf31;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 6
    .line 7
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v2, Lf31;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/util/Map;

    .line 36
    .line 37
    if-nez v3, :cond_6

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast v2, Ljava/lang/Iterable;

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x0

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    move-object v5, v3

    .line 64
    check-cast v5, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    check-cast v5, Ljava/lang/String;

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    invoke-static {p0, v5, v6}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-nez v7, :cond_2

    .line 84
    .line 85
    invoke-static {v5, p0, v6}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move-object v3, v4

    .line 93
    :cond_2
    :goto_0
    check-cast v3, Ljava/util/Map$Entry;

    .line 94
    .line 95
    if-eqz v3, :cond_3

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    move-object v4, p0

    .line 102
    check-cast v4, Ljava/util/Map;

    .line 103
    .line 104
    :cond_3
    if-nez v4, :cond_5

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    if-nez p0, :cond_4

    .line 113
    .line 114
    return-object v0

    .line 115
    :cond_4
    return-object p0

    .line 116
    :cond_5
    return-object v4

    .line 117
    :cond_6
    return-object v3

    .line 118
    :catchall_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Ljava/util/Map;

    .line 123
    .line 124
    if-nez p0, :cond_7

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    move-object v0, p0

    .line 128
    :goto_1
    return-object v0
.end method

.method public static ξ(Lorg/json/JSONObject;)Z
    .locals 5

    .line 1
    const-string v0, "aweme_type"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x3b

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    :cond_0
    const-string v0, "images"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    const-string v1, "image_post_info"

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v1, 0x0

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 37
    if-eqz v1, :cond_9

    .line 38
    .line 39
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    move v2, p0

    .line 44
    :goto_1
    if-ge v2, v0, :cond_9

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_3
    const-string v4, "live_photo"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_8

    .line 61
    .line 62
    const-string v4, "livePhoto"

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_8

    .line 69
    .line 70
    const-string v4, "live_photo_image"

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_8

    .line 77
    .line 78
    const-string v4, "livePhotoImage"

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_8

    .line 85
    .line 86
    const-string v4, "animated_image"

    .line 87
    .line 88
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-nez v4, :cond_8

    .line 93
    .line 94
    const-string v4, "animatedImage"

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_8

    .line 101
    .line 102
    const-string v4, "dynamic_image"

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_8

    .line 109
    .line 110
    const-string v4, "dynamicImage"

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_8

    .line 117
    .line 118
    const-string v4, "motion_image"

    .line 119
    .line 120
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-nez v4, :cond_8

    .line 125
    .line 126
    const-string v4, "motionImage"

    .line 127
    .line 128
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_8

    .line 133
    .line 134
    const-string v4, "video_info"

    .line 135
    .line 136
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-nez v4, :cond_8

    .line 141
    .line 142
    const-string v4, "videoInfo"

    .line 143
    .line 144
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_4

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_4
    const-string v4, "video"

    .line 152
    .line 153
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    if-eqz v3, :cond_7

    .line 158
    .line 159
    new-instance v4, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-static {v3, v4, p0}, Lf31;->δ(Ljava/lang/Object;Ljava/util/ArrayList;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_5

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_7

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    check-cast v4, Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v4}, Lf31;->ο(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_6

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :cond_8
    :goto_3
    const/4 p0, 0x1

    .line 202
    :cond_9
    return p0
.end method

.method public static ο(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const-string v0, "http"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :try_start_0
    new-instance v4, Ljava/net/URL;

    .line 20
    .line 21
    invoke-direct {v4, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    new-instance v4, Leo1;

    .line 41
    .line 42
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v4

    .line 46
    :goto_0
    instance-of v4, v0, Leo1;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    const-string v0, ""

    .line 51
    .line 52
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    const-string v4, "music"

    .line 55
    .line 56
    invoke-static {v0, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_7

    .line 61
    .line 62
    const-string v4, "audio"

    .line 63
    .line 64
    invoke-static {v0, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    const-string v0, "/music/"

    .line 71
    .line 72
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    const-string v0, "/audio/"

    .line 79
    .line 80
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_7

    .line 85
    .line 86
    const-string v0, "mime=audio"

    .line 87
    .line 88
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_7

    .line 93
    .line 94
    const-string v0, "mime_type=audio"

    .line 95
    .line 96
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_7

    .line 101
    .line 102
    const-string v0, "audio/mpeg"

    .line 103
    .line 104
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_7

    .line 109
    .line 110
    const-string v0, ".mp3"

    .line 111
    .line 112
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_7

    .line 117
    .line 118
    const-string v0, ".m4a"

    .line 119
    .line 120
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_7

    .line 125
    .line 126
    const-string v0, ".aac"

    .line 127
    .line 128
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_7

    .line 133
    .line 134
    const-string v0, ".ogg"

    .line 135
    .line 136
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_7

    .line 141
    .line 142
    const-string v0, ".wav"

    .line 143
    .line 144
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_7

    .line 149
    .line 150
    const-string v0, ".flac"

    .line 151
    .line 152
    invoke-static {v3, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_2

    .line 157
    .line 158
    goto/16 :goto_2

    .line 159
    .line 160
    :cond_2
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 161
    .line 162
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const-string v4, ".jpg"

    .line 167
    .line 168
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-nez v4, :cond_7

    .line 173
    .line 174
    const-string v4, ".jpeg"

    .line 175
    .line 176
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-nez v4, :cond_7

    .line 181
    .line 182
    const-string v4, ".png"

    .line 183
    .line 184
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_7

    .line 189
    .line 190
    const-string v4, ".webp"

    .line 191
    .line 192
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-nez v4, :cond_7

    .line 197
    .line 198
    const-string v4, ".heic"

    .line 199
    .line 200
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-nez v4, :cond_7

    .line 205
    .line 206
    const-string v4, ".heif"

    .line 207
    .line 208
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-nez v4, :cond_7

    .line 213
    .line 214
    const-string v4, ".avif"

    .line 215
    .line 216
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-nez v4, :cond_7

    .line 221
    .line 222
    const-string v4, "mime_type=image"

    .line 223
    .line 224
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-nez v4, :cond_7

    .line 229
    .line 230
    const-string v4, "image_type=image"

    .line 231
    .line 232
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-nez v4, :cond_7

    .line 237
    .line 238
    const-string v4, "image/"

    .line 239
    .line 240
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_3

    .line 245
    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    const-string v0, ".m3u8"

    .line 256
    .line 257
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-nez v0, :cond_7

    .line 262
    .line 263
    const-string v0, "m3u8"

    .line 264
    .line 265
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-nez v0, :cond_7

    .line 270
    .line 271
    const-string v0, ".mpd"

    .line 272
    .line 273
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-nez v0, :cond_7

    .line 278
    .line 279
    const-string v0, "dash"

    .line 280
    .line 281
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_7

    .line 286
    .line 287
    const-string v0, ".m4s"

    .line 288
    .line 289
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_4

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_4
    const-string v0, ".mp4"

    .line 297
    .line 298
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_6

    .line 303
    .line 304
    const-string v0, "format=mp4"

    .line 305
    .line 306
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-nez v0, :cond_6

    .line 311
    .line 312
    const-string v0, "mime=video/mp4"

    .line 313
    .line 314
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-nez v0, :cond_6

    .line 319
    .line 320
    const-string v0, "mime_type=video"

    .line 321
    .line 322
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-nez v0, :cond_6

    .line 327
    .line 328
    const-string v0, "video_mp4"

    .line 329
    .line 330
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-nez v0, :cond_6

    .line 335
    .line 336
    const-string v0, "/play/"

    .line 337
    .line 338
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-nez v0, :cond_6

    .line 343
    .line 344
    const-string v0, "playaddr"

    .line 345
    .line 346
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-nez v0, :cond_6

    .line 351
    .line 352
    const-string v0, "play_addr"

    .line 353
    .line 354
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-nez v0, :cond_6

    .line 359
    .line 360
    const-string v0, "/video/tos/"

    .line 361
    .line 362
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    if-eqz p0, :cond_5

    .line 367
    .line 368
    goto :goto_1

    .line 369
    :cond_5
    move v1, v2

    .line 370
    :cond_6
    :goto_1
    return v1

    .line 371
    :cond_7
    :goto_2
    return v2
.end method

.method public static π(Lorg/json/JSONObject;)Lf8;
    .locals 62

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "images"

    .line 4
    .line 5
    const-string v2, "video"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    const-string v4, "desc"

    .line 9
    .line 10
    const-string v5, ""

    .line 11
    .line 12
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    const-string v4, "aweme_id"

    .line 17
    .line 18
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v14

    .line 22
    const-string v4, "create_time"

    .line 23
    .line 24
    const-wide/16 v5, 0x0

    .line 25
    .line 26
    invoke-virtual {v0, v4, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v24

    .line 30
    const-string v4, "author"

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    const-string v7, "\u672a\u77e5"

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    :try_start_1
    const-string v9, "nickname"

    .line 41
    .line 42
    invoke-virtual {v4, v9, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    if-nez v9, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v7, v9

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto/16 :goto_2f

    .line 53
    .line 54
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    .line 55
    .line 56
    const-string v9, "uid"

    .line 57
    .line 58
    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    move-object v15, v9

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move-object v15, v3

    .line 65
    :goto_1
    const-string v9, "null"

    .line 66
    .line 67
    if-eqz v4, :cond_5

    .line 68
    .line 69
    :try_start_2
    const-string v10, "unique_id"

    .line 70
    .line 71
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    if-eqz v10, :cond_5

    .line 76
    .line 77
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-nez v11, :cond_3

    .line 82
    .line 83
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    if-nez v11, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    move-object v10, v3

    .line 91
    :goto_2
    if-eqz v10, :cond_5

    .line 92
    .line 93
    :cond_4
    :goto_3
    move-object/from16 v56, v10

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_5
    if-eqz v4, :cond_6

    .line 97
    .line 98
    const-string v10, "uniqueId"

    .line 99
    .line 100
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    if-eqz v10, :cond_6

    .line 105
    .line 106
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-nez v11, :cond_6

    .line 111
    .line 112
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    if-nez v11, :cond_6

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_6
    move-object v10, v3

    .line 120
    :goto_4
    if-nez v10, :cond_4

    .line 121
    .line 122
    if-eqz v4, :cond_7

    .line 123
    .line 124
    const-string v10, "short_id"

    .line 125
    .line 126
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    if-eqz v10, :cond_7

    .line 131
    .line 132
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-nez v11, :cond_7

    .line 137
    .line 138
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-nez v11, :cond_7

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_7
    move-object/from16 v56, v3

    .line 146
    .line 147
    :goto_5
    if-eqz v4, :cond_8

    .line 148
    .line 149
    const-string v10, "sec_uid"

    .line 150
    .line 151
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    move-object/from16 v16, v10

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_8
    move-object/from16 v16, v3

    .line 159
    .line 160
    :goto_6
    if-eqz v4, :cond_9

    .line 161
    .line 162
    const-string v10, "signature"

    .line 163
    .line 164
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    move-object/from16 v17, v10

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_9
    move-object/from16 v17, v3

    .line 172
    .line 173
    :goto_7
    const/4 v10, 0x0

    .line 174
    if-eqz v4, :cond_a

    .line 175
    .line 176
    const-string v11, "follower_count"

    .line 177
    .line 178
    invoke-virtual {v4, v11, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    move/from16 v18, v11

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_a
    move/from16 v18, v10

    .line 186
    .line 187
    :goto_8
    if-eqz v4, :cond_b

    .line 188
    .line 189
    const-string v11, "following_count"

    .line 190
    .line 191
    invoke-virtual {v4, v11, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    move/from16 v19, v11

    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_b
    move/from16 v19, v10

    .line 199
    .line 200
    :goto_9
    if-eqz v4, :cond_c

    .line 201
    .line 202
    const-string v11, "aweme_count"

    .line 203
    .line 204
    invoke-virtual {v4, v11, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    move/from16 v20, v11

    .line 209
    .line 210
    goto :goto_a

    .line 211
    :cond_c
    move/from16 v20, v10

    .line 212
    .line 213
    :goto_a
    if-eqz v4, :cond_d

    .line 214
    .line 215
    const-string v11, "verification_type"

    .line 216
    .line 217
    invoke-virtual {v4, v11, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    move/from16 v21, v11

    .line 222
    .line 223
    goto :goto_b

    .line 224
    :cond_d
    move/from16 v21, v10

    .line 225
    .line 226
    :goto_b
    if-eqz v4, :cond_e

    .line 227
    .line 228
    const-string v11, "live_status"

    .line 229
    .line 230
    invoke-virtual {v4, v11, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v11

    .line 234
    goto :goto_c

    .line 235
    :cond_e
    move-wide v11, v5

    .line 236
    :goto_c
    const-string v13, "ip_attribution"

    .line 237
    .line 238
    invoke-virtual {v0, v13, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v13

    .line 242
    if-eqz v13, :cond_f

    .line 243
    .line 244
    invoke-static {v13}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v22

    .line 248
    if-nez v22, :cond_f

    .line 249
    .line 250
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v22

    .line 254
    if-nez v22, :cond_f

    .line 255
    .line 256
    goto :goto_d

    .line 257
    :cond_f
    move-object v13, v3

    .line 258
    :goto_d
    if-eqz v4, :cond_11

    .line 259
    .line 260
    invoke-static {v4}, Lf31;->ι(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    :cond_10
    :goto_e
    move-object/from16 v22, v13

    .line 265
    .line 266
    goto :goto_10

    .line 267
    :cond_11
    if-nez v13, :cond_10

    .line 268
    .line 269
    if-eqz v15, :cond_13

    .line 270
    .line 271
    invoke-static {v15}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_12

    .line 276
    .line 277
    goto :goto_f

    .line 278
    :cond_12
    sget-object v4, Lf31;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 279
    .line 280
    invoke-virtual {v4, v15}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    check-cast v4, Ljava/lang/String;

    .line 285
    .line 286
    move-object v13, v4

    .line 287
    goto :goto_e

    .line 288
    :cond_13
    :goto_f
    move-object v13, v3

    .line 289
    goto :goto_e

    .line 290
    :goto_10
    const-string v4, "share_info"

    .line 291
    .line 292
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    if-eqz v4, :cond_14

    .line 297
    .line 298
    const-string v13, "share_url"

    .line 299
    .line 300
    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    move-object v13, v4

    .line 305
    goto :goto_11

    .line 306
    :cond_14
    move-object v13, v3

    .line 307
    :goto_11
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    if-eqz v4, :cond_15

    .line 312
    .line 313
    move-wide/from16 v26, v5

    .line 314
    .line 315
    const-string v5, "has_watermark"

    .line 316
    .line 317
    invoke-virtual {v4, v5, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    move/from16 v29, v4

    .line 322
    .line 323
    goto :goto_12

    .line 324
    :cond_15
    move-wide/from16 v26, v5

    .line 325
    .line 326
    move/from16 v29, v10

    .line 327
    .line 328
    :goto_12
    const-string v4, "statistics"

    .line 329
    .line 330
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    const-string v5, "digg_count"

    .line 335
    .line 336
    const-string v6, "diggCount"

    .line 337
    .line 338
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-static {v4, v5}, Lf31;->μ(Lorg/json/JSONObject;[Ljava/lang/String;)J

    .line 343
    .line 344
    .line 345
    move-result-wide v50

    .line 346
    const-string v5, "comment_count"

    .line 347
    .line 348
    const-string v6, "commentCount"

    .line 349
    .line 350
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    invoke-static {v4, v5}, Lf31;->μ(Lorg/json/JSONObject;[Ljava/lang/String;)J

    .line 355
    .line 356
    .line 357
    move-result-wide v52

    .line 358
    const-string v5, "collect_count"

    .line 359
    .line 360
    const-string v6, "collectCount"

    .line 361
    .line 362
    const-string v10, "favorite_count"

    .line 363
    .line 364
    const-string v3, "favoriteCount"

    .line 365
    .line 366
    filled-new-array {v5, v6, v10, v3}, [Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    invoke-static {v4, v3}, Lf31;->μ(Lorg/json/JSONObject;[Ljava/lang/String;)J

    .line 371
    .line 372
    .line 373
    move-result-wide v54

    .line 374
    const-string v3, "poi_info"

    .line 375
    .line 376
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    if-nez v3, :cond_16

    .line 381
    .line 382
    const-string v3, "poi_struct"

    .line 383
    .line 384
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    :cond_16
    if-eqz v3, :cond_17

    .line 389
    .line 390
    const-string v4, "poi_name"

    .line 391
    .line 392
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 396
    move-wide/from16 v60, v26

    .line 397
    .line 398
    move-object/from16 v26, v4

    .line 399
    .line 400
    move-wide/from16 v4, v60

    .line 401
    .line 402
    goto :goto_13

    .line 403
    :cond_17
    move-wide/from16 v4, v26

    .line 404
    .line 405
    const/16 v26, 0x0

    .line 406
    .line 407
    :goto_13
    const-string v6, "address_info"

    .line 408
    .line 409
    const-string v10, "city"

    .line 410
    .line 411
    if-eqz v3, :cond_19

    .line 412
    .line 413
    move-wide/from16 v27, v4

    .line 414
    .line 415
    :try_start_3
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    if-eqz v4, :cond_1a

    .line 420
    .line 421
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    if-nez v4, :cond_18

    .line 426
    .line 427
    goto :goto_15

    .line 428
    :cond_18
    :goto_14
    move-wide/from16 v30, v27

    .line 429
    .line 430
    move-object/from16 v27, v4

    .line 431
    .line 432
    goto :goto_16

    .line 433
    :cond_19
    move-wide/from16 v27, v4

    .line 434
    .line 435
    :cond_1a
    :goto_15
    if-eqz v3, :cond_1b

    .line 436
    .line 437
    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 441
    goto :goto_14

    .line 442
    :cond_1b
    move-wide/from16 v30, v27

    .line 443
    .line 444
    const/16 v27, 0x0

    .line 445
    .line 446
    :goto_16
    const-string v4, "address"

    .line 447
    .line 448
    if-eqz v3, :cond_1d

    .line 449
    .line 450
    :try_start_4
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    if-eqz v5, :cond_1d

    .line 455
    .line 456
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    if-nez v5, :cond_1c

    .line 461
    .line 462
    goto :goto_18

    .line 463
    :cond_1c
    move-object/from16 v28, v5

    .line 464
    .line 465
    :goto_17
    const/4 v3, 0x0

    .line 466
    goto :goto_19

    .line 467
    :cond_1d
    :goto_18
    if-eqz v3, :cond_1e

    .line 468
    .line 469
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    move-object/from16 v28, v3

    .line 474
    .line 475
    goto :goto_17

    .line 476
    :cond_1e
    const/4 v3, 0x0

    .line 477
    const/16 v28, 0x0

    .line 478
    .line 479
    :goto_19
    invoke-virtual {v0, v10, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    if-eqz v4, :cond_1f

    .line 484
    .line 485
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    if-nez v3, :cond_1f

    .line 490
    .line 491
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    if-nez v3, :cond_1f

    .line 496
    .line 497
    move-wide/from16 v60, v30

    .line 498
    .line 499
    move-object/from16 v30, v4

    .line 500
    .line 501
    move-wide/from16 v4, v60

    .line 502
    .line 503
    goto :goto_1a

    .line 504
    :cond_1f
    move-wide/from16 v4, v30

    .line 505
    .line 506
    const/16 v30, 0x0

    .line 507
    .line 508
    :goto_1a
    const-string v3, "region"

    .line 509
    .line 510
    const/4 v6, 0x0

    .line 511
    invoke-virtual {v0, v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    if-eqz v3, :cond_20

    .line 516
    .line 517
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 518
    .line 519
    .line 520
    move-result v6

    .line 521
    if-nez v6, :cond_20

    .line 522
    .line 523
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v6

    .line 527
    if-nez v6, :cond_20

    .line 528
    .line 529
    move-object/from16 v31, v3

    .line 530
    .line 531
    goto :goto_1b

    .line 532
    :cond_20
    const/16 v31, 0x0

    .line 533
    .line 534
    :goto_1b
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 535
    .line 536
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    if-eqz v2, :cond_2c

    .line 544
    .line 545
    invoke-static {v2}, Lf31;->η(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v6

    .line 549
    const-string v32, "play_addr_h264"

    .line 550
    .line 551
    const-string v33, "play_addr"

    .line 552
    .line 553
    const-string v34, "play_addr_265"

    .line 554
    .line 555
    const-string v35, "play_addr_lowbr"

    .line 556
    .line 557
    const-string v36, "download_addr"

    .line 558
    .line 559
    const-string v37, "new_download_addr"

    .line 560
    .line 561
    filled-new-array/range {v32 .. v37}, [Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v9

    .line 565
    invoke-static {v9}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v9

    .line 569
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 570
    .line 571
    .line 572
    move-result-object v9

    .line 573
    :goto_1c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 577
    move-wide/from16 v32, v4

    .line 578
    .line 579
    const-string v4, "http"

    .line 580
    .line 581
    const-string v5, "url_list"

    .line 582
    .line 583
    if-eqz v10, :cond_25

    .line 584
    .line 585
    :try_start_5
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v10

    .line 589
    check-cast v10, Ljava/lang/String;

    .line 590
    .line 591
    invoke-virtual {v2, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 592
    .line 593
    .line 594
    move-result-object v10

    .line 595
    if-nez v10, :cond_21

    .line 596
    .line 597
    :goto_1d
    move-wide/from16 v4, v32

    .line 598
    .line 599
    goto :goto_1c

    .line 600
    :cond_21
    invoke-virtual {v10, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 601
    .line 602
    .line 603
    move-result-object v5

    .line 604
    if-nez v5, :cond_22

    .line 605
    .line 606
    goto :goto_1d

    .line 607
    :cond_22
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 608
    .line 609
    .line 610
    move-result v10

    .line 611
    move-object/from16 v34, v6

    .line 612
    .line 613
    const/4 v6, 0x0

    .line 614
    :goto_1e
    if-ge v6, v10, :cond_24

    .line 615
    .line 616
    move-object/from16 v35, v7

    .line 617
    .line 618
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v7

    .line 622
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    move-object/from16 v36, v5

    .line 626
    .line 627
    const/4 v5, 0x0

    .line 628
    invoke-static {v7, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 629
    .line 630
    .line 631
    move-result v37

    .line 632
    if-eqz v37, :cond_23

    .line 633
    .line 634
    invoke-virtual {v3, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    :cond_23
    add-int/lit8 v6, v6, 0x1

    .line 638
    .line 639
    move-object/from16 v7, v35

    .line 640
    .line 641
    move-object/from16 v5, v36

    .line 642
    .line 643
    goto :goto_1e

    .line 644
    :cond_24
    move-wide/from16 v4, v32

    .line 645
    .line 646
    move-object/from16 v6, v34

    .line 647
    .line 648
    goto :goto_1c

    .line 649
    :cond_25
    move-object/from16 v34, v6

    .line 650
    .line 651
    move-object/from16 v35, v7

    .line 652
    .line 653
    const-string v6, "bit_rate"

    .line 654
    .line 655
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    if-eqz v2, :cond_2b

    .line 660
    .line 661
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 662
    .line 663
    .line 664
    move-result v6

    .line 665
    const/4 v7, 0x0

    .line 666
    :goto_1f
    if-ge v7, v6, :cond_2b

    .line 667
    .line 668
    invoke-virtual {v2, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 669
    .line 670
    .line 671
    move-result-object v9

    .line 672
    if-nez v9, :cond_27

    .line 673
    .line 674
    :goto_20
    move-object/from16 v36, v2

    .line 675
    .line 676
    :cond_26
    move-object/from16 v37, v5

    .line 677
    .line 678
    const/4 v2, 0x0

    .line 679
    goto :goto_22

    .line 680
    :cond_27
    const-string v10, "play_addr"

    .line 681
    .line 682
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 683
    .line 684
    .line 685
    move-result-object v9

    .line 686
    if-nez v9, :cond_28

    .line 687
    .line 688
    goto :goto_20

    .line 689
    :cond_28
    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 690
    .line 691
    .line 692
    move-result-object v9

    .line 693
    if-nez v9, :cond_29

    .line 694
    .line 695
    goto :goto_20

    .line 696
    :cond_29
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    .line 697
    .line 698
    .line 699
    move-result v10

    .line 700
    move-object/from16 v36, v2

    .line 701
    .line 702
    const/4 v2, 0x0

    .line 703
    :goto_21
    if-ge v2, v10, :cond_26

    .line 704
    .line 705
    move-object/from16 v37, v5

    .line 706
    .line 707
    invoke-virtual {v9, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v5

    .line 711
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    move/from16 v38, v2

    .line 715
    .line 716
    const/4 v2, 0x0

    .line 717
    invoke-static {v5, v4, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 718
    .line 719
    .line 720
    move-result v23

    .line 721
    if-eqz v23, :cond_2a

    .line 722
    .line 723
    invoke-virtual {v3, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    :cond_2a
    add-int/lit8 v5, v38, 0x1

    .line 727
    .line 728
    move v2, v5

    .line 729
    move-object/from16 v5, v37

    .line 730
    .line 731
    goto :goto_21

    .line 732
    :goto_22
    add-int/lit8 v7, v7, 0x1

    .line 733
    .line 734
    move-object/from16 v2, v36

    .line 735
    .line 736
    move-object/from16 v5, v37

    .line 737
    .line 738
    goto :goto_1f

    .line 739
    :cond_2b
    const/4 v2, 0x0

    .line 740
    goto :goto_23

    .line 741
    :cond_2c
    move-wide/from16 v32, v4

    .line 742
    .line 743
    move-object/from16 v35, v7

    .line 744
    .line 745
    const/4 v2, 0x0

    .line 746
    const/16 v34, 0x0

    .line 747
    .line 748
    :goto_23
    if-eqz v34, :cond_2d

    .line 749
    .line 750
    invoke-static/range {v34 .. v34}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    if-eqz v4, :cond_2e

    .line 755
    .line 756
    :cond_2d
    invoke-static {v0}, Lf31;->η(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v34

    .line 760
    :cond_2e
    new-instance v4, Ljava/util/ArrayList;

    .line 761
    .line 762
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 763
    .line 764
    .line 765
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    :cond_2f
    :goto_24
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 770
    .line 771
    .line 772
    move-result v6

    .line 773
    if-eqz v6, :cond_30

    .line 774
    .line 775
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v6

    .line 779
    move-object v7, v6

    .line 780
    check-cast v7, Ljava/lang/String;

    .line 781
    .line 782
    invoke-static {v7}, Lf31;->ο(Ljava/lang/String;)Z

    .line 783
    .line 784
    .line 785
    move-result v7

    .line 786
    if-eqz v7, :cond_2f

    .line 787
    .line 788
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    goto :goto_24

    .line 792
    :cond_30
    invoke-static {v4}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 797
    .line 798
    .line 799
    move-result-object v4

    .line 800
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 801
    .line 802
    .line 803
    move-result v5

    .line 804
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 805
    .line 806
    .line 807
    move-result v6

    .line 808
    if-eq v5, v6, :cond_31

    .line 809
    .line 810
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 811
    .line 812
    .line 813
    move-result v3

    .line 814
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 815
    .line 816
    .line 817
    move-result v5

    .line 818
    new-instance v6, Ljava/lang/StringBuilder;

    .line 819
    .line 820
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 821
    .line 822
    .line 823
    const-string v7, "DYHelper: [VIDEO-JSON-FILTER] awemeId="

    .line 824
    .line 825
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    const-string v7, ", raw="

    .line 832
    .line 833
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    const-string v3, ", valid="

    .line 840
    .line 841
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v3

    .line 851
    invoke-static {v3}, Lux;->ρ(Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    :cond_31
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 855
    .line 856
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 857
    .line 858
    .line 859
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 860
    .line 861
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 865
    .line 866
    .line 867
    move-result-object v6

    .line 868
    if-nez v6, :cond_33

    .line 869
    .line 870
    const-string v6, "image_post_info"

    .line 871
    .line 872
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 873
    .line 874
    .line 875
    move-result-object v6

    .line 876
    if-eqz v6, :cond_32

    .line 877
    .line 878
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    goto :goto_25

    .line 883
    :cond_32
    const/4 v1, 0x0

    .line 884
    goto :goto_25

    .line 885
    :cond_33
    move-object v1, v6

    .line 886
    :goto_25
    if-eqz v1, :cond_39

    .line 887
    .line 888
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 889
    .line 890
    .line 891
    move-result v6

    .line 892
    move v7, v2

    .line 893
    :goto_26
    if-ge v7, v6, :cond_39

    .line 894
    .line 895
    invoke-virtual {v1, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 896
    .line 897
    .line 898
    move-result-object v9

    .line 899
    if-nez v9, :cond_34

    .line 900
    .line 901
    goto :goto_29

    .line 902
    :cond_34
    invoke-static {v9}, Lf31;->ζ(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v10

    .line 906
    if-eqz v10, :cond_36

    .line 907
    .line 908
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 909
    .line 910
    .line 911
    move-result v23

    .line 912
    if-eqz v23, :cond_35

    .line 913
    .line 914
    goto :goto_27

    .line 915
    :cond_35
    invoke-virtual {v5, v10}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    :cond_36
    :goto_27
    invoke-static {v9}, Lf31;->θ(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v9

    .line 922
    if-eqz v9, :cond_38

    .line 923
    .line 924
    invoke-static {v9}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 925
    .line 926
    .line 927
    move-result v10

    .line 928
    if-eqz v10, :cond_37

    .line 929
    .line 930
    goto :goto_28

    .line 931
    :cond_37
    invoke-virtual {v3, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    goto :goto_29

    .line 935
    :cond_38
    :goto_28
    add-int/lit8 v9, v7, 0x1

    .line 936
    .line 937
    new-instance v10, Ljava/lang/StringBuilder;

    .line 938
    .line 939
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 940
    .line 941
    .line 942
    const-string v2, "DYHelper: [IMG-JSON] \u7b2c"

    .line 943
    .line 944
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 948
    .line 949
    .line 950
    const-string v2, "\u5f20\u56fe\u7247\u672a\u63d0\u53d6\u5230\u6709\u6548URL, awemeId="

    .line 951
    .line 952
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    invoke-static {v2}, Lux;->ρ(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    :goto_29
    add-int/lit8 v7, v7, 0x1

    .line 966
    .line 967
    const/4 v2, 0x0

    .line 968
    goto :goto_26

    .line 969
    :cond_39
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 970
    .line 971
    .line 972
    move-result v1

    .line 973
    if-eqz v1, :cond_3a

    .line 974
    .line 975
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 976
    .line 977
    .line 978
    move-result v1

    .line 979
    if-nez v1, :cond_3a

    .line 980
    .line 981
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 982
    .line 983
    .line 984
    move-result v1

    .line 985
    if-nez v1, :cond_3a

    .line 986
    .line 987
    invoke-static {v0}, Lf31;->ξ(Lorg/json/JSONObject;)Z

    .line 988
    .line 989
    .line 990
    move-result v0

    .line 991
    if-eqz v0, :cond_3a

    .line 992
    .line 993
    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 994
    .line 995
    .line 996
    new-instance v0, Ljava/lang/StringBuilder;

    .line 997
    .line 998
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 999
    .line 1000
    .line 1001
    const-string v1, "DYHelper: [ANIM-JSON] explicit live-photo marker, use root video, awemeId="

    .line 1002
    .line 1003
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    :cond_3a
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 1017
    .line 1018
    .line 1019
    move-result v0

    .line 1020
    if-nez v0, :cond_3b

    .line 1021
    .line 1022
    sget-object v0, Lh8;->η:Lh8;

    .line 1023
    .line 1024
    goto :goto_2a

    .line 1025
    :cond_3b
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1026
    .line 1027
    .line 1028
    move-result v0

    .line 1029
    if-nez v0, :cond_3c

    .line 1030
    .line 1031
    sget-object v0, Lh8;->ζ:Lh8;

    .line 1032
    .line 1033
    goto :goto_2a

    .line 1034
    :cond_3c
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v0

    .line 1038
    if-nez v0, :cond_42

    .line 1039
    .line 1040
    sget-object v0, Lh8;->ε:Lh8;

    .line 1041
    .line 1042
    :goto_2a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v1

    .line 1049
    if-eqz v1, :cond_3d

    .line 1050
    .line 1051
    const/4 v9, 0x0

    .line 1052
    goto :goto_2b

    .line 1053
    :cond_3d
    move-object v9, v4

    .line 1054
    :goto_2b
    invoke-static {v3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1059
    .line 1060
    .line 1061
    move-result v2

    .line 1062
    if-eqz v2, :cond_3e

    .line 1063
    .line 1064
    const/4 v10, 0x0

    .line 1065
    goto :goto_2c

    .line 1066
    :cond_3e
    move-object v10, v1

    .line 1067
    :goto_2c
    if-nez v34, :cond_3f

    .line 1068
    .line 1069
    invoke-static {v3}, Lxh;->И(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v1

    .line 1073
    move-object/from16 v34, v1

    .line 1074
    .line 1075
    check-cast v34, Ljava/lang/String;

    .line 1076
    .line 1077
    :cond_3f
    cmp-long v1, v11, v32

    .line 1078
    .line 1079
    if-lez v1, :cond_40

    .line 1080
    .line 1081
    const/4 v1, 0x1

    .line 1082
    move/from16 v23, v1

    .line 1083
    .line 1084
    goto :goto_2d

    .line 1085
    :cond_40
    const/16 v23, 0x0

    .line 1086
    .line 1087
    :goto_2d
    invoke-static {v5}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1092
    .line 1093
    .line 1094
    move-result v2

    .line 1095
    if-eqz v2, :cond_41

    .line 1096
    .line 1097
    const/16 v39, 0x0

    .line 1098
    .line 1099
    goto :goto_2e

    .line 1100
    :cond_41
    move-object/from16 v39, v1

    .line 1101
    .line 1102
    :goto_2e
    new-instance v6, Lf8;

    .line 1103
    .line 1104
    const/high16 v57, -0x41000000    # -0.5f

    .line 1105
    .line 1106
    const/16 v58, 0x1ff

    .line 1107
    .line 1108
    const/16 v32, 0x0

    .line 1109
    .line 1110
    const/16 v33, 0x0

    .line 1111
    .line 1112
    move-object/from16 v11, v34

    .line 1113
    .line 1114
    const/16 v34, 0x0

    .line 1115
    .line 1116
    move-object/from16 v7, v35

    .line 1117
    .line 1118
    const/16 v35, 0x0

    .line 1119
    .line 1120
    const/16 v36, 0x0

    .line 1121
    .line 1122
    const-wide/16 v37, 0x0

    .line 1123
    .line 1124
    const/16 v40, 0x0

    .line 1125
    .line 1126
    const/16 v41, 0x0

    .line 1127
    .line 1128
    const/16 v42, 0x0

    .line 1129
    .line 1130
    const/16 v43, 0x0

    .line 1131
    .line 1132
    const/16 v44, 0x0

    .line 1133
    .line 1134
    const/16 v45, 0x0

    .line 1135
    .line 1136
    const/16 v46, 0x0

    .line 1137
    .line 1138
    const/16 v47, 0x0

    .line 1139
    .line 1140
    const/16 v48, 0x0

    .line 1141
    .line 1142
    const/16 v49, 0x0

    .line 1143
    .line 1144
    move-object v12, v0

    .line 1145
    invoke-direct/range {v6 .. v58}, Lf8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lh8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Li8;Ljava/util/List;JJJLjava/lang/String;II)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1146
    .line 1147
    .line 1148
    return-object v6

    .line 1149
    :cond_42
    const/16 v59, 0x0

    .line 1150
    .line 1151
    return-object v59

    .line 1152
    :goto_2f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    const-string v1, "DYHelper: parseAwemeJson \u5931\u8d25: "

    .line 1157
    .line 1158
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1159
    .line 1160
    .line 1161
    const/16 v59, 0x0

    .line 1162
    .line 1163
    return-object v59
.end method

.method public static ρ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    const-wide/32 v0, 0x200000

    .line 2
    .line 3
    .line 4
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    const-string v3, "peekBody"

    .line 11
    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {p0, v3, v4}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v4, "string"

    .line 21
    .line 22
    new-array v5, v2, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v3, v4, v5}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    instance-of v4, v3, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    check-cast v3, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    return-object v3

    .line 35
    :catchall_0
    :try_start_1
    const-string v3, "body"

    .line 36
    .line 37
    new-array v4, v2, [Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p0, v3, v4}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    :cond_0
    return-object v1

    .line 46
    :cond_1
    const-string v3, "source"

    .line 47
    .line 48
    new-array v4, v2, [Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {p0, v3, v4}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v3, "request"

    .line 55
    .line 56
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {p0, v3, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    const-string v0, "buffer"

    .line 64
    .line 65
    new-array v3, v2, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {p0, v0, v3}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string v0, "clone"

    .line 72
    .line 73
    new-array v3, v2, [Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {p0, v0, v3}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string v0, "readUtf8"

    .line 80
    .line 81
    new-array v2, v2, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {p0, v0, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    instance-of v0, p0, Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    check-cast p0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    move-object v1, p0

    .line 94
    :catchall_1
    :cond_2
    return-object v1
.end method

.method public static σ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_0

    .line 8
    .line 9
    :cond_0
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-static {p1, p0, p1}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "host"

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_1
    const-string p1, "content-length"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_2
    const-string p1, "content-type"

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_3
    const-string p1, "accept-encoding"

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :cond_4
    const-string p1, "connection"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_5
    const-string p1, "range"

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :cond_6
    const-string p1, "x-gorgon"

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_7

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_7
    const-string p1, "x-khronos"

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_8

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_8
    const-string p1, "x-argus"

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_9

    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_9
    const-string p1, "x-ladon"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_a

    .line 112
    .line 113
    goto/16 :goto_0

    .line 114
    .line 115
    :cond_a
    const-string p1, "x-medusa"

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_b

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :cond_b
    const-string p1, "x-helios"

    .line 126
    .line 127
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_c

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_c
    const-string p1, "user-agent"

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_e

    .line 141
    .line 142
    const-string p1, "cookie"

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-nez p1, :cond_e

    .line 149
    .line 150
    const-string p1, "referer"

    .line 151
    .line 152
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-nez p1, :cond_e

    .line 157
    .line 158
    const-string p1, "origin"

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_e

    .line 165
    .line 166
    const-string p1, "x-tt-token"

    .line 167
    .line 168
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_e

    .line 173
    .line 174
    const-string p1, "passport-sdk-version"

    .line 175
    .line 176
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-nez p1, :cond_e

    .line 181
    .line 182
    const-string p1, "sdk-version"

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-nez p1, :cond_e

    .line 189
    .line 190
    const-string p1, "x-ss-cookie"

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-nez p1, :cond_e

    .line 197
    .line 198
    const-string p1, "x-ss-stub"

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-nez p1, :cond_e

    .line 205
    .line 206
    const-string p1, "x-ss-req-ticket"

    .line 207
    .line 208
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-nez p1, :cond_e

    .line 213
    .line 214
    const-string p1, "x-tt-dt"

    .line 215
    .line 216
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-nez p1, :cond_e

    .line 221
    .line 222
    const-string p1, "x-tt-trace-id"

    .line 223
    .line 224
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-nez p1, :cond_e

    .line 229
    .line 230
    const-string p1, "x-common-params-v2"

    .line 231
    .line 232
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    if-eqz p0, :cond_d

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_d
    :goto_0
    const/4 p0, 0x0

    .line 240
    return p0

    .line 241
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 242
    return p0
.end method

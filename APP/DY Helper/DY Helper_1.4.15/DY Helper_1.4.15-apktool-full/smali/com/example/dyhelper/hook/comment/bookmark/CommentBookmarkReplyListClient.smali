.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;,
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;,
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final CAPTURE_PROFILE_VALID_MS:J = 0x1b7740L

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

.field private static final TAG:Ljava/lang/String; = "r70ac498a2ca77555"

.field private static volatile capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

.field private static final hookedProxyMethods:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile lastCaptureLogAt:J

.field private static final officialFallbackModes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;",
            ">;"
        }
    .end annotation
.end field

.field private static final replyListParamNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;


# direct methods
.method static constructor <clinit>()V
    .locals 46

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 7
    .line 8
    const-string v44, "common_data"

    .line 9
    .line 10
    const-string v45, "merge_cursor"

    .line 11
    .line 12
    const-string v1, "comment_id"

    .line 13
    .line 14
    const-string v2, "cursor"

    .line 15
    .line 16
    const-string v3, "count"

    .line 17
    .line 18
    const-string v4, "top_ids"

    .line 19
    .line 20
    const-string v5, "item_id"

    .line 21
    .line 22
    const-string v6, "insert_ids"

    .line 23
    .line 24
    const-string v7, "two_level_insert_ids"

    .line 25
    .line 26
    const-string v8, "channel_id"

    .line 27
    .line 28
    const-string v9, "city"

    .line 29
    .line 30
    const-string v10, "follower_count"

    .line 31
    .line 32
    const-string v11, "is_familiar"

    .line 33
    .line 34
    const-string v12, "user_avatar_shrink"

    .line 35
    .line 36
    const-string v13, "aweme_author"

    .line 37
    .line 38
    const-string v14, "item_type"

    .line 39
    .line 40
    const-string v15, "top_query_word"

    .line 41
    .line 42
    const-string v16, "comment_level"

    .line 43
    .line 44
    const-string v17, "channel_ext"

    .line 45
    .line 46
    const-string v18, "authentication_token"

    .line 47
    .line 48
    const-string v19, "use_url_optimize"

    .line 49
    .line 50
    const-string v20, "comment_uid"

    .line 51
    .line 52
    const-string v21, "service_id"

    .line 53
    .line 54
    const-string v22, "group_id"

    .line 55
    .line 56
    const-string v23, "comment_scene"

    .line 57
    .line 58
    const-string v24, "hotspot_id"

    .line 59
    .line 60
    const-string v25, "ad_info"

    .line 61
    .line 62
    const-string v26, "medium_shrink"

    .line 63
    .line 64
    const-string v27, "viewed_comments"

    .line 65
    .line 66
    const-string v28, "highlight_item_id"

    .line 67
    .line 68
    const-string v29, "highlight_auth_token"

    .line 69
    .line 70
    const-string v30, "comment_token"

    .line 71
    .line 72
    const-string v31, "preload_type"

    .line 73
    .line 74
    const-string v32, "use_light_optimize"

    .line 75
    .line 76
    const-string v33, "comment_common_aweme_data"

    .line 77
    .line 78
    const-string v34, "comment_common_user_data"

    .line 79
    .line 80
    const-string v35, "comment_common_comment_data"

    .line 81
    .line 82
    const-string v36, "ai_cmt_exposure"

    .line 83
    .line 84
    const-string v37, "language"

    .line 85
    .line 86
    const-string v38, "need_whale_async"

    .line 87
    .line 88
    const-string v39, "is_24_story"

    .line 89
    .line 90
    const-string v40, "is_25_story"

    .line 91
    .line 92
    const-string v41, "aweme_type"

    .line 93
    .line 94
    const-string v42, "rhap_retriever_names"

    .line 95
    .line 96
    const-string v43, "common_flags"

    .line 97
    .line 98
    filled-new-array/range {v1 .. v45}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->replyListParamNames:Ljava/util/List;

    .line 107
    .line 108
    new-instance v0, Ljava/util/HashSet;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->hookedProxyMethods:Ljava/util/Set;

    .line 118
    .line 119
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;

    .line 120
    .line 121
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;-><init>()V

    .line 122
    .line 123
    .line 124
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;

    .line 125
    .line 126
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    const/4 v6, 0x0

    .line 130
    const-string v2, "official_unknown_scene_no_group"

    .line 131
    .line 132
    const/4 v3, 0x1

    .line 133
    const/4 v4, 0x1

    .line 134
    invoke-direct/range {v1 .. v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    const/4 v7, 0x1

    .line 141
    const-string v3, "official_unknown_scene_with_group"

    .line 142
    .line 143
    const/4 v5, 0x1

    .line 144
    invoke-direct/range {v2 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;

    .line 148
    .line 149
    const-string v7, "96_96"

    .line 150
    .line 151
    const/4 v8, 0x0

    .line 152
    const-string v4, "official_zero_scene_no_group"

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    const/4 v6, 0x0

    .line 156
    invoke-direct/range {v3 .. v8}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 157
    .line 158
    .line 159
    new-instance v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;

    .line 160
    .line 161
    const-string v8, "96_96"

    .line 162
    .line 163
    const/4 v9, 0x1

    .line 164
    const-string v5, "official_zero_scene_with_group"

    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    invoke-direct/range {v4 .. v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 168
    .line 169
    .line 170
    filled-new-array {v1, v2, v3, v4}, [Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->officialFallbackModes:Ljava/util/List;

    .line 179
    .line 180
    const/16 v0, 0x8

    .line 181
    .line 182
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->$stable:I

    .line 183
    .line 184
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

.method public static final synthetic access$getLastCaptureLogAt$p()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->lastCaptureLogAt:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getReplyListParamNames$p()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->replyListParamNames:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSelfInvoking$p()Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setCapturedProfile$p(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLastCaptureLogAt$p(J)V
    .locals 0

    .line 1
    sput-wide p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->lastCaptureLogAt:J

    .line 2
    .line 3
    return-void
.end method

.method private final awaitNetworkResult(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->awaitNetworkResult(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private final buildArgPlans(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            ")",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;->getArgs()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    array-length v3, v3

    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;->getTimestamp()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    sub-long/2addr v2, v4

    .line 34
    const-wide/32 v4, 0x1b7740

    .line 35
    .line 36
    .line 37
    cmp-long v2, v2, v4

    .line 38
    .line 39
    if-gtz v2, :cond_0

    .line 40
    .line 41
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;

    .line 42
    .line 43
    const-string v3, "captured_host_profile"

    .line 44
    .line 45
    invoke-direct {p0, p1, p2, v1, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->buildArgsFromCapturedProfile(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v2, v3, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->officialFallbackModes:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;

    .line 72
    .line 73
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 80
    .line 81
    invoke-direct {v4, p1, p2, p3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->buildArgsByOfficialSignature(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {v2, v3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    new-instance p0, Ljava/util/HashSet;

    .line 93
    .line 94
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance p1, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    if-eqz p3, :cond_3

    .line 111
    .line 112
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    move-object v0, p3

    .line 117
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v1, Luj;

    .line 124
    .line 125
    const/16 v2, 0xf

    .line 126
    .line 127
    invoke-direct {v1, v2}, Luj;-><init>(I)V

    .line 128
    .line 129
    .line 130
    const/16 v2, 0x1e

    .line 131
    .line 132
    const-string v3, "|"

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    invoke-static {v0, v3, v4, v1, v2}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_2

    .line 144
    .line 145
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    return-object p1
.end method

.method private static final buildArgPlans$lambda$17$lambda$16(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "null"

    .line 11
    .line 12
    return-object p0
.end method

.method private final buildArgPlansForReplyList(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            "I)",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;->getArgs()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    array-length v2, v2

    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;->getTimestamp()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    sub-long/2addr v1, v5

    .line 34
    const-wide/32 v5, 0x1b7740

    .line 35
    .line 36
    .line 37
    cmp-long v1, v1, v5

    .line 38
    .line 39
    if-gtz v1, :cond_0

    .line 40
    .line 41
    new-instance v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;

    .line 42
    .line 43
    const-string v8, "captured_host_profile_reply"

    .line 44
    .line 45
    move-object v1, p0

    .line 46
    move-object v2, p1

    .line 47
    move-object v3, p2

    .line 48
    move-object v5, p3

    .line 49
    move v6, p4

    .line 50
    invoke-direct/range {v1 .. v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->buildArgsFromCapturedProfileForReply(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    move-object v4, v5

    .line 55
    move v5, v6

    .line 56
    invoke-direct {v7, v8, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move-object v2, p1

    .line 64
    move-object v3, p2

    .line 65
    move-object v4, p3

    .line 66
    move v5, p4

    .line 67
    :goto_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->officialFallbackModes:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    move-object v6, p1

    .line 84
    check-cast v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;

    .line 85
    .line 86
    new-instance p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;

    .line 87
    .line 88
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    const-string p3, "_reply"

    .line 93
    .line 94
    invoke-static {p2, p3}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 99
    .line 100
    invoke-direct/range {v1 .. v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->buildArgsByOfficialSignatureForReply(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;ILcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-direct {p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    new-instance p0, Ljava/util/HashSet;

    .line 112
    .line 113
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 114
    .line 115
    .line 116
    new-instance p1, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    :cond_2
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    if-eqz p3, :cond_3

    .line 130
    .line 131
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    move-object p4, p3

    .line 136
    check-cast p4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;

    .line 137
    .line 138
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p4

    .line 142
    new-instance v0, Luj;

    .line 143
    .line 144
    const/16 v1, 0x10

    .line 145
    .line 146
    invoke-direct {v0, v1}, Luj;-><init>(I)V

    .line 147
    .line 148
    .line 149
    const/16 v1, 0x1e

    .line 150
    .line 151
    const-string v2, "|"

    .line 152
    .line 153
    const/4 v3, 0x0

    .line 154
    invoke-static {p4, v2, v3, v0, v1}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p4

    .line 158
    invoke-virtual {p0, p4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p4

    .line 162
    if-eqz p4, :cond_2

    .line 163
    .line 164
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_3
    return-object p1
.end method

.method private static final buildArgPlansForReplyList$lambda$34$lambda$33(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "null"

    .line 11
    .line 12
    return-object p0
.end method

.method private final buildArgsByOfficialSignature(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;)[Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;",
            ")[",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, p0

    .line 11
    new-array v2, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    move v3, p1

    .line 14
    :goto_0
    if-ge v3, v1, :cond_c

    .line 15
    .line 16
    aget-object v4, p0, v3

    .line 17
    .line 18
    invoke-static {v3, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Ljava/lang/String;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    if-eqz v5, :cond_b

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    sparse-switch v7, :sswitch_data_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :sswitch_0
    const-string v7, "need_whale_async"

    .line 37
    .line 38
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-nez v7, :cond_0

    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_0
    move-object v6, v0

    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :sswitch_1
    const-string v7, "session_show_cids"

    .line 50
    .line 51
    :goto_1
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :sswitch_2
    const-string v7, "product_id"

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :sswitch_3
    const-string v7, "highlight_auth_token"

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :sswitch_4
    const-string v7, "session_id"

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :sswitch_5
    const-string v7, "preload_type"

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :sswitch_6
    const-string v7, "medium_shrink"

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :sswitch_7
    const-string v7, "highlight_item_id"

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :sswitch_8
    const-string v7, "top_query_word"

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :sswitch_9
    const-string v7, "is_preload"

    .line 79
    .line 80
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-nez v7, :cond_0

    .line 85
    .line 86
    goto/16 :goto_4

    .line 87
    .line 88
    :sswitch_a
    const-string v7, "is_familiar_waterfall"

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :sswitch_b
    const-string v7, "favorite_comment_timestamp"

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :sswitch_c
    const-string v7, "insert_ids"

    .line 95
    .line 96
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-nez v7, :cond_1

    .line 101
    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :cond_1
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :sswitch_d
    const-string v7, "common_group_id"

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :sswitch_e
    const-string v7, "hotsoon_filtered_count"

    .line 114
    .line 115
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-nez v7, :cond_0

    .line 120
    .line 121
    goto/16 :goto_4

    .line 122
    .line 123
    :sswitch_f
    const-string v7, "comment_common_comment_data"

    .line 124
    .line 125
    :goto_2
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto/16 :goto_4

    .line 129
    .line 130
    :sswitch_10
    const-string v7, "hotspot_id"

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :sswitch_11
    const-string v7, "gps_access"

    .line 134
    .line 135
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-nez v7, :cond_a

    .line 140
    .line 141
    goto/16 :goto_4

    .line 142
    .line 143
    :sswitch_12
    const-string v7, "group_id"

    .line 144
    .line 145
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-nez v7, :cond_2

    .line 150
    .line 151
    goto/16 :goto_4

    .line 152
    .line 153
    :cond_2
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;->getIncludeGroupId()Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-eqz v7, :cond_b

    .line 158
    .line 159
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    goto/16 :goto_4

    .line 164
    .line 165
    :sswitch_13
    const-string v7, "common_flags"

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :sswitch_14
    const-string v7, "channel_ext"

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :sswitch_15
    const-string v7, "count"

    .line 172
    .line 173
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-nez v7, :cond_3

    .line 178
    .line 179
    goto/16 :goto_4

    .line 180
    .line 181
    :cond_3
    const/16 v6, 0x14

    .line 182
    .line 183
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    goto/16 :goto_4

    .line 188
    .line 189
    :sswitch_16
    const-string v7, "is_familiar"

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :sswitch_17
    const-string v7, "hotsoon_has_more"

    .line 193
    .line 194
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-nez v7, :cond_0

    .line 199
    .line 200
    goto/16 :goto_4

    .line 201
    .line 202
    :sswitch_18
    const-string v7, "city"

    .line 203
    .line 204
    goto/16 :goto_1

    .line 205
    .line 206
    :sswitch_19
    const-string v7, "comment_common_user_data"

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :sswitch_1a
    const-string v7, "comment_common_aweme_data"

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :sswitch_1b
    const-string v7, "use_url_optimize"

    .line 213
    .line 214
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-nez v7, :cond_0

    .line 219
    .line 220
    goto/16 :goto_4

    .line 221
    .line 222
    :sswitch_1c
    const-string v7, "merge_service_id"

    .line 223
    .line 224
    goto/16 :goto_1

    .line 225
    .line 226
    :sswitch_1d
    const-string v7, "aweme_author"

    .line 227
    .line 228
    goto/16 :goto_1

    .line 229
    .line 230
    :sswitch_1e
    const-string v7, "ai_cmt_exposure"

    .line 231
    .line 232
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-nez v7, :cond_0

    .line 237
    .line 238
    goto/16 :goto_4

    .line 239
    .line 240
    :sswitch_1f
    const-string v7, "is_fold_list"

    .line 241
    .line 242
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-nez v7, :cond_4

    .line 247
    .line 248
    goto/16 :goto_4

    .line 249
    .line 250
    :cond_4
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 251
    .line 252
    goto/16 :goto_4

    .line 253
    .line 254
    :sswitch_20
    const-string v7, "use_light_optimize"

    .line 255
    .line 256
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-nez v7, :cond_0

    .line 261
    .line 262
    goto/16 :goto_4

    .line 263
    .line 264
    :sswitch_21
    const-string v7, "rhap_retriever_names"

    .line 265
    .line 266
    goto/16 :goto_1

    .line 267
    .line 268
    :sswitch_22
    const-string v7, "user_avatar_shrink"

    .line 269
    .line 270
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    if-nez v7, :cond_5

    .line 275
    .line 276
    goto/16 :goto_4

    .line 277
    .line 278
    :cond_5
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;->getUserAvatarShrink()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    goto/16 :goto_4

    .line 283
    .line 284
    :sswitch_23
    const-string v7, "comment_aggregation"

    .line 285
    .line 286
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-nez v7, :cond_0

    .line 291
    .line 292
    goto/16 :goto_4

    .line 293
    .line 294
    :sswitch_24
    const-string v7, "forward_page_type"

    .line 295
    .line 296
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v7

    .line 300
    if-nez v7, :cond_8

    .line 301
    .line 302
    goto/16 :goto_4

    .line 303
    .line 304
    :sswitch_25
    const-string v7, "page_source"

    .line 305
    .line 306
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-nez v7, :cond_0

    .line 311
    .line 312
    goto/16 :goto_4

    .line 313
    .line 314
    :sswitch_26
    const-string v7, "comment_scene"

    .line 315
    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :sswitch_27
    const-string v7, "comment_count"

    .line 319
    .line 320
    goto/16 :goto_1

    .line 321
    .line 322
    :sswitch_28
    const-string v7, "ad_info"

    .line 323
    .line 324
    goto/16 :goto_1

    .line 325
    .line 326
    :sswitch_29
    const-string v7, "is_25_story"

    .line 327
    .line 328
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v7

    .line 332
    if-nez v7, :cond_0

    .line 333
    .line 334
    goto/16 :goto_4

    .line 335
    .line 336
    :sswitch_2a
    const-string v7, "friend_interaction"

    .line 337
    .line 338
    goto/16 :goto_1

    .line 339
    .line 340
    :sswitch_2b
    const-string v7, "is_need_reply_list_exposure"

    .line 341
    .line 342
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    if-nez v7, :cond_0

    .line 347
    .line 348
    goto/16 :goto_4

    .line 349
    .line 350
    :sswitch_2c
    const-string v7, "authentication_token"

    .line 351
    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    :sswitch_2d
    const-string v7, "cursor"

    .line 355
    .line 356
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-nez v7, :cond_6

    .line 361
    .line 362
    goto/16 :goto_4

    .line 363
    .line 364
    :cond_6
    const-wide/16 v6, 0x0

    .line 365
    .line 366
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    goto/16 :goto_4

    .line 371
    .line 372
    :sswitch_2e
    const-string v7, "aweme_type"

    .line 373
    .line 374
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    if-nez v7, :cond_0

    .line 379
    .line 380
    goto/16 :goto_4

    .line 381
    .line 382
    :sswitch_2f
    const-string v7, "aweme_id"

    .line 383
    .line 384
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v7

    .line 388
    if-nez v7, :cond_7

    .line 389
    .line 390
    goto/16 :goto_4

    .line 391
    .line 392
    :cond_7
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    goto/16 :goto_4

    .line 397
    .line 398
    :sswitch_30
    const-string v7, "language"

    .line 399
    .line 400
    goto/16 :goto_1

    .line 401
    .line 402
    :sswitch_31
    const-string v7, "insert_merge_ids"

    .line 403
    .line 404
    goto/16 :goto_1

    .line 405
    .line 406
    :sswitch_32
    const-string v7, "need_management_hint"

    .line 407
    .line 408
    goto/16 :goto_1

    .line 409
    .line 410
    :sswitch_33
    const-string v7, "service_id"

    .line 411
    .line 412
    goto/16 :goto_1

    .line 413
    .line 414
    :sswitch_34
    const-string v7, "__extra_info__"

    .line 415
    .line 416
    goto/16 :goto_1

    .line 417
    .line 418
    :sswitch_35
    const-string v7, "current_l1_comment_count"

    .line 419
    .line 420
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    if-nez v7, :cond_0

    .line 425
    .line 426
    goto :goto_4

    .line 427
    :sswitch_36
    const-string v7, "common_data"

    .line 428
    .line 429
    goto/16 :goto_1

    .line 430
    .line 431
    :sswitch_37
    const-string v7, "channel_id"

    .line 432
    .line 433
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    if-nez v7, :cond_8

    .line 438
    .line 439
    goto :goto_4

    .line 440
    :cond_8
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;->getUnknownChannelAsMinusOne()Z

    .line 441
    .line 442
    .line 443
    move-result v6

    .line 444
    if-eqz v6, :cond_9

    .line 445
    .line 446
    const/4 v6, -0x1

    .line 447
    goto :goto_3

    .line 448
    :cond_9
    move v6, p1

    .line 449
    :goto_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    goto :goto_4

    .line 454
    :sswitch_38
    const-string v7, "ad_creative_id"

    .line 455
    .line 456
    goto/16 :goto_1

    .line 457
    .line 458
    :sswitch_39
    const-string v7, "is_24_story"

    .line 459
    .line 460
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v7

    .line 464
    if-nez v7, :cond_0

    .line 465
    .line 466
    goto :goto_4

    .line 467
    :sswitch_3a
    const-string v7, "address_book_access"

    .line 468
    .line 469
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    if-nez v7, :cond_a

    .line 474
    .line 475
    goto :goto_4

    .line 476
    :cond_a
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;->getAccessAsNull()Z

    .line 477
    .line 478
    .line 479
    move-result v7

    .line 480
    if-eqz v7, :cond_0

    .line 481
    .line 482
    goto :goto_4

    .line 483
    :sswitch_3b
    const-string v7, "follower_count"

    .line 484
    .line 485
    goto/16 :goto_2

    .line 486
    .line 487
    :sswitch_3c
    const-string v7, "item_type"

    .line 488
    .line 489
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v7

    .line 493
    if-nez v7, :cond_0

    .line 494
    .line 495
    :cond_b
    :goto_4
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 496
    .line 497
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v7, v6, v4, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->coerceValue(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    aput-object v4, v2, v3

    .line 505
    .line 506
    add-int/lit8 v3, v3, 0x1

    .line 507
    .line 508
    goto/16 :goto_0

    .line 509
    .line 510
    :cond_c
    return-object v2

    .line 511
    :sswitch_data_0
    .sparse-switch
        -0x7f9f3f1a -> :sswitch_3c
        -0x7d9c3a52 -> :sswitch_3b
        -0x7d644451 -> :sswitch_3a
        -0x7a6983d3 -> :sswitch_39
        -0x7a368271 -> :sswitch_38
        -0x7315ce29 -> :sswitch_37
        -0x72c10682 -> :sswitch_36
        -0x70d6f845 -> :sswitch_35
        -0x68db1003 -> :sswitch_34
        -0x66cdcd1b -> :sswitch_33
        -0x64de3ca6 -> :sswitch_32
        -0x619407d5 -> :sswitch_31
        -0x602d6ca8 -> :sswitch_30
        -0x5a1fa06d -> :sswitch_2f
        -0x50b3dc4e -> :sswitch_2e
        -0x5069ecaa -> :sswitch_2d
        -0x4aaaba8e -> :sswitch_2c
        -0x4a59f4c1 -> :sswitch_2b
        -0x4883c60f -> :sswitch_2a
        -0x45834892 -> :sswitch_29
        -0x44b2d0b6 -> :sswitch_28
        -0x42d0e0d1 -> :sswitch_27
        -0x41f51954 -> :sswitch_26
        -0x3cbe2c35 -> :sswitch_25
        -0x3a3d3e10 -> :sswitch_24
        -0x371aa2fe -> :sswitch_23
        -0x362e45c5 -> :sswitch_22
        -0x3445cddb -> :sswitch_21
        -0x31654e62 -> :sswitch_20
        -0x2f0c2eb9 -> :sswitch_1f
        -0x2a52a0ed -> :sswitch_1e
        -0x13d087fd -> :sswitch_1d
        -0x12b16eb4 -> :sswitch_1c
        -0x9f27c9b -> :sswitch_1b
        -0x44982ea -> :sswitch_1a
        -0x21983d6 -> :sswitch_19
        0x2e996b -> :sswitch_18
        0x1467131 -> :sswitch_17
        0x31f35fa -> :sswitch_16
        0x5a7510f -> :sswitch_15
        0x105bfce5 -> :sswitch_14
        0x1ac11f33 -> :sswitch_13
        0x1e2e76db -> :sswitch_12
        0x1e3bee99 -> :sswitch_11
        0x22682c8b -> :sswitch_10
        0x273c697e -> :sswitch_f
        0x2d32c2fe -> :sswitch_e
        0x2dbd76af -> :sswitch_d
        0x399b8432 -> :sswitch_c
        0x3d14eb53 -> :sswitch_b
        0x433cb90d -> :sswitch_a
        0x467157f4 -> :sswitch_9
        0x57e1814b -> :sswitch_8
        0x59e9f93c -> :sswitch_7
        0x5c185613 -> :sswitch_6
        0x5f5d37b0 -> :sswitch_5
        0x630ddf64 -> :sswitch_4
        0x630fad0d -> :sswitch_3
        0x687cca6b -> :sswitch_2
        0x68dd850e -> :sswitch_1
        0x7e6a85bd -> :sswitch_0
    .end sparse-switch
.end method

.method private final buildArgsByOfficialSignatureForReply(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;ILcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;)[Ljava/lang/Object;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            "I",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$OfficialFallbackMode;",
            ")[",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "fetchReplyTreeListPOST"

    .line 16
    .line 17
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    array-length v5, v1

    .line 27
    new-array v6, v5, [Ljava/lang/Object;

    .line 28
    .line 29
    :goto_0
    if-ge v3, v5, :cond_13

    .line 30
    .line 31
    aget-object v7, v1, v3

    .line 32
    .line 33
    move-object/from16 v8, p2

    .line 34
    .line 35
    invoke-static {v3, v8}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    check-cast v9, Ljava/lang/String;

    .line 40
    .line 41
    const-string v10, "aweme_author"

    .line 42
    .line 43
    const-string v11, "use_url_optimize"

    .line 44
    .line 45
    const-string v12, "comment_common_aweme_data"

    .line 46
    .line 47
    const-string v13, "comment_common_user_data"

    .line 48
    .line 49
    const-string v14, "city"

    .line 50
    .line 51
    const-string v15, "is_familiar"

    .line 52
    .line 53
    move-object/from16 p0, v0

    .line 54
    .line 55
    const-string v0, "count"

    .line 56
    .line 57
    move-object/from16 p4, v1

    .line 58
    .line 59
    const-string v1, "channel_ext"

    .line 60
    .line 61
    move/from16 p5, v2

    .line 62
    .line 63
    const-string v2, "group_id"

    .line 64
    .line 65
    move/from16 v16, v3

    .line 66
    .line 67
    const-string v3, "hotspot_id"

    .line 68
    .line 69
    move-object/from16 v17, v4

    .line 70
    .line 71
    const-string v4, "comment_common_comment_data"

    .line 72
    .line 73
    move/from16 v18, v5

    .line 74
    .line 75
    const-string v5, "comment_id"

    .line 76
    .line 77
    move-object/from16 v19, v6

    .line 78
    .line 79
    const-string v6, "insert_ids"

    .line 80
    .line 81
    const-string v8, "top_query_word"

    .line 82
    .line 83
    move-object/from16 v20, v7

    .line 84
    .line 85
    const-string v7, "medium_shrink"

    .line 86
    .line 87
    move-object/from16 v21, v10

    .line 88
    .line 89
    const-string v10, "item_id"

    .line 90
    .line 91
    move-object/from16 v22, v11

    .line 92
    .line 93
    const-string v11, "need_whale_async"

    .line 94
    .line 95
    const-string v23, "1"

    .line 96
    .line 97
    const-string v24, ""

    .line 98
    .line 99
    const/16 v25, 0x0

    .line 100
    .line 101
    if-eqz p5, :cond_c

    .line 102
    .line 103
    if-eqz v9, :cond_5

    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v26

    .line 109
    sparse-switch v26, :sswitch_data_0

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :sswitch_0
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_0

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_0
    move-object/from16 v0, v17

    .line 121
    .line 122
    goto/16 :goto_6

    .line 123
    .line 124
    :sswitch_1
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_1
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v23

    .line 135
    :cond_2
    :goto_1
    move-object/from16 v0, v23

    .line 136
    .line 137
    goto/16 :goto_6

    .line 138
    .line 139
    :sswitch_2
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_3

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_3
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 147
    .line 148
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->getHostCommonInfoOrEmpty(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v23

    .line 163
    goto :goto_1

    .line 164
    :sswitch_3
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_4

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_4
    :goto_2
    move-object/from16 v0, v24

    .line 172
    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :sswitch_4
    const-string v0, "two_level_insert_ids"

    .line 176
    .line 177
    :goto_3
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    :cond_5
    :goto_4
    move-object/from16 v0, v25

    .line 182
    .line 183
    goto/16 :goto_6

    .line 184
    .line 185
    :sswitch_5
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_4

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :sswitch_6
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_6

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_6
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v23

    .line 203
    goto :goto_1

    .line 204
    :sswitch_7
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    goto :goto_4

    .line 209
    :sswitch_8
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    goto :goto_4

    .line 214
    :sswitch_9
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_2

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :sswitch_a
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    goto :goto_4

    .line 226
    :sswitch_b
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_7

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_7
    move-object/from16 v0, p0

    .line 234
    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :sswitch_c
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-nez v0, :cond_0

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :sswitch_d
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_8

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_8
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 252
    .line 253
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->getHostCityOrNull(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v23

    .line 268
    goto/16 :goto_1

    .line 269
    .line 270
    :sswitch_e
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    goto :goto_4

    .line 275
    :sswitch_f
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    goto :goto_4

    .line 280
    :sswitch_10
    move-object/from16 v0, v22

    .line 281
    .line 282
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_0

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :sswitch_11
    move-object/from16 v0, v21

    .line 290
    .line 291
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v0, :cond_9

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_9
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 299
    .line 300
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-direct {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->findAwemeById(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->findAwemeAuthorId(Ljava/lang/Object;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v23

    .line 323
    if-nez v23, :cond_2

    .line 324
    .line 325
    goto/16 :goto_2

    .line 326
    .line 327
    :sswitch_12
    const-string v0, "use_light_optimize"

    .line 328
    .line 329
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_0

    .line 334
    .line 335
    goto/16 :goto_4

    .line 336
    .line 337
    :sswitch_13
    const-string v0, "user_avatar_shrink"

    .line 338
    .line 339
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-nez v0, :cond_a

    .line 344
    .line 345
    goto/16 :goto_4

    .line 346
    .line 347
    :cond_a
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 348
    .line 349
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->getHostAvatarShrink(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v23

    .line 364
    goto/16 :goto_1

    .line 365
    .line 366
    :sswitch_14
    const-string v0, "comment_token"

    .line 367
    .line 368
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-nez v0, :cond_4

    .line 373
    .line 374
    goto/16 :goto_4

    .line 375
    .line 376
    :sswitch_15
    const-string v0, "comment_scene"

    .line 377
    .line 378
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-nez v0, :cond_2

    .line 383
    .line 384
    goto/16 :goto_4

    .line 385
    .line 386
    :sswitch_16
    const-string v0, "comment_level"

    .line 387
    .line 388
    goto/16 :goto_3

    .line 389
    .line 390
    :sswitch_17
    const-string v0, "top_ids"

    .line 391
    .line 392
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-nez v0, :cond_4

    .line 397
    .line 398
    goto/16 :goto_4

    .line 399
    .line 400
    :sswitch_18
    const-string v0, "ad_info"

    .line 401
    .line 402
    goto/16 :goto_3

    .line 403
    .line 404
    :sswitch_19
    const-string v0, "is_25_story"

    .line 405
    .line 406
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-nez v0, :cond_0

    .line 411
    .line 412
    goto/16 :goto_4

    .line 413
    .line 414
    :sswitch_1a
    const-string v0, "authentication_token"

    .line 415
    .line 416
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-nez v0, :cond_4

    .line 421
    .line 422
    goto/16 :goto_4

    .line 423
    .line 424
    :sswitch_1b
    const-string v0, "cursor"

    .line 425
    .line 426
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-nez v0, :cond_b

    .line 431
    .line 432
    goto/16 :goto_4

    .line 433
    .line 434
    :cond_b
    const-wide/16 v0, 0x0

    .line 435
    .line 436
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 437
    .line 438
    .line 439
    move-result-object v23

    .line 440
    goto/16 :goto_1

    .line 441
    .line 442
    :sswitch_1c
    const-string v0, "aweme_type"

    .line 443
    .line 444
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-nez v0, :cond_0

    .line 449
    .line 450
    goto/16 :goto_4

    .line 451
    .line 452
    :sswitch_1d
    const-string v0, "language"

    .line 453
    .line 454
    goto/16 :goto_3

    .line 455
    .line 456
    :sswitch_1e
    const-string v0, "service_id"

    .line 457
    .line 458
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-nez v0, :cond_2

    .line 463
    .line 464
    goto/16 :goto_4

    .line 465
    .line 466
    :sswitch_1f
    const-string v0, "channel_id"

    .line 467
    .line 468
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-nez v0, :cond_0

    .line 473
    .line 474
    goto/16 :goto_4

    .line 475
    .line 476
    :sswitch_20
    const-string v0, "is_24_story"

    .line 477
    .line 478
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-nez v0, :cond_0

    .line 483
    .line 484
    goto/16 :goto_4

    .line 485
    .line 486
    :sswitch_21
    const-string v0, "follower_count"

    .line 487
    .line 488
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-nez v0, :cond_0

    .line 493
    .line 494
    goto/16 :goto_4

    .line 495
    .line 496
    :sswitch_22
    const-string v0, "item_type"

    .line 497
    .line 498
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    if-nez v0, :cond_0

    .line 503
    .line 504
    goto/16 :goto_4

    .line 505
    .line 506
    :cond_c
    move-object/from16 v27, v21

    .line 507
    .line 508
    move-object/from16 v28, v22

    .line 509
    .line 510
    if-eqz v9, :cond_5

    .line 511
    .line 512
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 513
    .line 514
    .line 515
    move-result v21

    .line 516
    sparse-switch v21, :sswitch_data_1

    .line 517
    .line 518
    .line 519
    goto/16 :goto_4

    .line 520
    .line 521
    :sswitch_23
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    if-nez v0, :cond_0

    .line 526
    .line 527
    goto/16 :goto_4

    .line 528
    .line 529
    :sswitch_24
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    if-nez v0, :cond_d

    .line 534
    .line 535
    goto/16 :goto_4

    .line 536
    .line 537
    :cond_d
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v23

    .line 541
    goto/16 :goto_1

    .line 542
    .line 543
    :sswitch_25
    const-string v0, "comment_uid"

    .line 544
    .line 545
    :goto_5
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    goto/16 :goto_4

    .line 550
    .line 551
    :sswitch_26
    const-string v0, "preload_type"

    .line 552
    .line 553
    goto :goto_5

    .line 554
    :sswitch_27
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    if-nez v0, :cond_e

    .line 559
    .line 560
    goto/16 :goto_4

    .line 561
    .line 562
    :cond_e
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 563
    .line 564
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->getHostCommonInfoOrEmpty(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v23

    .line 579
    goto/16 :goto_1

    .line 580
    .line 581
    :sswitch_28
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-nez v0, :cond_4

    .line 586
    .line 587
    goto/16 :goto_4

    .line 588
    .line 589
    :sswitch_29
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-nez v0, :cond_4

    .line 594
    .line 595
    goto/16 :goto_4

    .line 596
    .line 597
    :sswitch_2a
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-nez v0, :cond_f

    .line 602
    .line 603
    goto/16 :goto_4

    .line 604
    .line 605
    :cond_f
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v23

    .line 609
    goto/16 :goto_1

    .line 610
    .line 611
    :sswitch_2b
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    goto/16 :goto_4

    .line 616
    .line 617
    :sswitch_2c
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v0

    .line 621
    goto/16 :goto_4

    .line 622
    .line 623
    :sswitch_2d
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-nez v0, :cond_2

    .line 628
    .line 629
    goto/16 :goto_4

    .line 630
    .line 631
    :sswitch_2e
    const-string v0, "common_flags"

    .line 632
    .line 633
    goto :goto_5

    .line 634
    :sswitch_2f
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    goto/16 :goto_4

    .line 639
    .line 640
    :sswitch_30
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-nez v0, :cond_7

    .line 645
    .line 646
    goto/16 :goto_4

    .line 647
    .line 648
    :sswitch_31
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    if-nez v0, :cond_0

    .line 653
    .line 654
    goto/16 :goto_4

    .line 655
    .line 656
    :sswitch_32
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-nez v0, :cond_10

    .line 661
    .line 662
    goto/16 :goto_4

    .line 663
    .line 664
    :cond_10
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 665
    .line 666
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->getHostCityOrNull(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v23

    .line 681
    goto/16 :goto_1

    .line 682
    .line 683
    :sswitch_33
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    goto/16 :goto_4

    .line 688
    .line 689
    :sswitch_34
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    goto/16 :goto_4

    .line 694
    .line 695
    :sswitch_35
    move-object/from16 v0, v28

    .line 696
    .line 697
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-nez v0, :cond_0

    .line 702
    .line 703
    goto/16 :goto_4

    .line 704
    .line 705
    :sswitch_36
    move-object/from16 v0, v27

    .line 706
    .line 707
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-nez v0, :cond_4

    .line 712
    .line 713
    goto/16 :goto_4

    .line 714
    .line 715
    :sswitch_37
    const-string v0, "ai_cmt_exposure"

    .line 716
    .line 717
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-nez v0, :cond_0

    .line 722
    .line 723
    goto/16 :goto_4

    .line 724
    .line 725
    :sswitch_38
    const-string v0, "use_light_optimize"

    .line 726
    .line 727
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    if-nez v0, :cond_0

    .line 732
    .line 733
    goto/16 :goto_4

    .line 734
    .line 735
    :sswitch_39
    const-string v0, "rhap_retriever_names"

    .line 736
    .line 737
    goto/16 :goto_5

    .line 738
    .line 739
    :sswitch_3a
    const-string v0, "user_avatar_shrink"

    .line 740
    .line 741
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-nez v0, :cond_11

    .line 746
    .line 747
    goto/16 :goto_4

    .line 748
    .line 749
    :cond_11
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 750
    .line 751
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->getHostAvatarShrink(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v23

    .line 766
    goto/16 :goto_1

    .line 767
    .line 768
    :sswitch_3b
    const-string v0, "merge_cursor"

    .line 769
    .line 770
    goto/16 :goto_5

    .line 771
    .line 772
    :sswitch_3c
    const-string v0, "comment_token"

    .line 773
    .line 774
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-result v0

    .line 778
    if-nez v0, :cond_4

    .line 779
    .line 780
    goto/16 :goto_4

    .line 781
    .line 782
    :sswitch_3d
    const-string v0, "comment_scene"

    .line 783
    .line 784
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    if-nez v0, :cond_2

    .line 789
    .line 790
    goto/16 :goto_4

    .line 791
    .line 792
    :sswitch_3e
    const-string v0, "comment_level"

    .line 793
    .line 794
    goto/16 :goto_5

    .line 795
    .line 796
    :sswitch_3f
    const-string v0, "top_ids"

    .line 797
    .line 798
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    if-nez v0, :cond_4

    .line 803
    .line 804
    goto/16 :goto_4

    .line 805
    .line 806
    :sswitch_40
    const-string v0, "ad_info"

    .line 807
    .line 808
    goto/16 :goto_5

    .line 809
    .line 810
    :sswitch_41
    const-string v0, "is_25_story"

    .line 811
    .line 812
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v0

    .line 816
    if-nez v0, :cond_0

    .line 817
    .line 818
    goto/16 :goto_4

    .line 819
    .line 820
    :sswitch_42
    const-string v0, "authentication_token"

    .line 821
    .line 822
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result v0

    .line 826
    if-nez v0, :cond_4

    .line 827
    .line 828
    goto/16 :goto_4

    .line 829
    .line 830
    :sswitch_43
    const-string v0, "cursor"

    .line 831
    .line 832
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    if-nez v0, :cond_12

    .line 837
    .line 838
    goto/16 :goto_4

    .line 839
    .line 840
    :cond_12
    const-wide/16 v0, 0x0

    .line 841
    .line 842
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 843
    .line 844
    .line 845
    move-result-object v23

    .line 846
    goto/16 :goto_1

    .line 847
    .line 848
    :sswitch_44
    const-string v0, "aweme_type"

    .line 849
    .line 850
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    if-nez v0, :cond_0

    .line 855
    .line 856
    goto/16 :goto_4

    .line 857
    .line 858
    :sswitch_45
    const-string v0, "language"

    .line 859
    .line 860
    goto/16 :goto_5

    .line 861
    .line 862
    :sswitch_46
    const-string v0, "service_id"

    .line 863
    .line 864
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    if-nez v0, :cond_2

    .line 869
    .line 870
    goto/16 :goto_4

    .line 871
    .line 872
    :sswitch_47
    const-string v0, "common_data"

    .line 873
    .line 874
    goto/16 :goto_5

    .line 875
    .line 876
    :sswitch_48
    const-string v0, "channel_id"

    .line 877
    .line 878
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-nez v0, :cond_0

    .line 883
    .line 884
    goto/16 :goto_4

    .line 885
    .line 886
    :sswitch_49
    const-string v0, "is_24_story"

    .line 887
    .line 888
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    move-result v0

    .line 892
    if-nez v0, :cond_0

    .line 893
    .line 894
    goto/16 :goto_4

    .line 895
    .line 896
    :sswitch_4a
    const-string v0, "follower_count"

    .line 897
    .line 898
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    move-result v0

    .line 902
    if-nez v0, :cond_0

    .line 903
    .line 904
    goto/16 :goto_4

    .line 905
    .line 906
    :sswitch_4b
    const-string v0, "item_type"

    .line 907
    .line 908
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v0

    .line 912
    if-nez v0, :cond_0

    .line 913
    .line 914
    goto/16 :goto_4

    .line 915
    .line 916
    :goto_6
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 917
    .line 918
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    move-object/from16 v2, v20

    .line 922
    .line 923
    invoke-virtual {v1, v0, v2, v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->coerceValue(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    aput-object v0, v19, v16

    .line 928
    .line 929
    add-int/lit8 v3, v16, 0x1

    .line 930
    .line 931
    move-object/from16 v0, p0

    .line 932
    .line 933
    move-object/from16 v1, p4

    .line 934
    .line 935
    move/from16 v2, p5

    .line 936
    .line 937
    move-object/from16 v4, v17

    .line 938
    .line 939
    move/from16 v5, v18

    .line 940
    .line 941
    move-object/from16 v6, v19

    .line 942
    .line 943
    goto/16 :goto_0

    .line 944
    .line 945
    :cond_13
    move-object/from16 v19, v6

    .line 946
    .line 947
    return-object v19

    .line 948
    nop

    .line 949
    :sswitch_data_0
    .sparse-switch
        -0x7f9f3f1a -> :sswitch_22
        -0x7d9c3a52 -> :sswitch_21
        -0x7a6983d3 -> :sswitch_20
        -0x7315ce29 -> :sswitch_1f
        -0x66cdcd1b -> :sswitch_1e
        -0x602d6ca8 -> :sswitch_1d
        -0x50b3dc4e -> :sswitch_1c
        -0x5069ecaa -> :sswitch_1b
        -0x4aaaba8e -> :sswitch_1a
        -0x45834892 -> :sswitch_19
        -0x44b2d0b6 -> :sswitch_18
        -0x43ec2b32 -> :sswitch_17
        -0x4256965c -> :sswitch_16
        -0x41f51954 -> :sswitch_15
        -0x41e177e7 -> :sswitch_14
        -0x362e45c5 -> :sswitch_13
        -0x31654e62 -> :sswitch_12
        -0x13d087fd -> :sswitch_11
        -0x9f27c9b -> :sswitch_10
        -0x44982ea -> :sswitch_f
        -0x21983d6 -> :sswitch_e
        0x2e996b -> :sswitch_d
        0x31f35fa -> :sswitch_c
        0x5a7510f -> :sswitch_b
        0x105bfce5 -> :sswitch_a
        0x1e2e76db -> :sswitch_9
        0x22682c8b -> :sswitch_8
        0x273c697e -> :sswitch_7
        0x3597f2fb -> :sswitch_6
        0x399b8432 -> :sswitch_5
        0x4645a560 -> :sswitch_4
        0x57e1814b -> :sswitch_3
        0x5c185613 -> :sswitch_2
        0x7e22b9c7 -> :sswitch_1
        0x7e6a85bd -> :sswitch_0
    .end sparse-switch

    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    :sswitch_data_1
    .sparse-switch
        -0x7f9f3f1a -> :sswitch_4b
        -0x7d9c3a52 -> :sswitch_4a
        -0x7a6983d3 -> :sswitch_49
        -0x7315ce29 -> :sswitch_48
        -0x72c10682 -> :sswitch_47
        -0x66cdcd1b -> :sswitch_46
        -0x602d6ca8 -> :sswitch_45
        -0x50b3dc4e -> :sswitch_44
        -0x5069ecaa -> :sswitch_43
        -0x4aaaba8e -> :sswitch_42
        -0x45834892 -> :sswitch_41
        -0x44b2d0b6 -> :sswitch_40
        -0x43ec2b32 -> :sswitch_3f
        -0x4256965c -> :sswitch_3e
        -0x41f51954 -> :sswitch_3d
        -0x41e177e7 -> :sswitch_3c
        -0x3e0842c3 -> :sswitch_3b
        -0x362e45c5 -> :sswitch_3a
        -0x3445cddb -> :sswitch_39
        -0x31654e62 -> :sswitch_38
        -0x2a52a0ed -> :sswitch_37
        -0x13d087fd -> :sswitch_36
        -0x9f27c9b -> :sswitch_35
        -0x44982ea -> :sswitch_34
        -0x21983d6 -> :sswitch_33
        0x2e996b -> :sswitch_32
        0x31f35fa -> :sswitch_31
        0x5a7510f -> :sswitch_30
        0x105bfce5 -> :sswitch_2f
        0x1ac11f33 -> :sswitch_2e
        0x1e2e76db -> :sswitch_2d
        0x22682c8b -> :sswitch_2c
        0x273c697e -> :sswitch_2b
        0x3597f2fb -> :sswitch_2a
        0x399b8432 -> :sswitch_29
        0x57e1814b -> :sswitch_28
        0x5c185613 -> :sswitch_27
        0x5f5d37b0 -> :sswitch_26
        0x7d669a70 -> :sswitch_25
        0x7e22b9c7 -> :sswitch_24
        0x7e6a85bd -> :sswitch_23
    .end sparse-switch
.end method

.method private final buildArgsFromCapturedProfile(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)[Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            ")[",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length p1, p0

    .line 6
    new-array v0, p1, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, p1, :cond_8

    .line 11
    .line 12
    aget-object v3, p0, v2

    .line 13
    .line 14
    invoke-static {v2, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v4, :cond_7

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    sparse-switch v5, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :sswitch_0
    const-string v5, "top_query_word"

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-nez v5, :cond_6

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :sswitch_1
    const-string v5, "is_preload"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_0

    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :sswitch_2
    const-string v5, "favorite_comment_timestamp"

    .line 58
    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_6

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :sswitch_3
    const-string v5, "insert_ids"

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    goto :goto_2

    .line 81
    :sswitch_4
    const-string v5, "group_id"

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    goto :goto_2

    .line 95
    :sswitch_5
    const-string v5, "count"

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    const/16 v5, 0x14

    .line 105
    .line 106
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    goto :goto_2

    .line 111
    :sswitch_6
    const-string v5, "aweme_author"

    .line 112
    .line 113
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_6

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :sswitch_7
    const-string v5, "cursor"

    .line 121
    .line 122
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-nez v5, :cond_4

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    const-wide/16 v5, 0x0

    .line 130
    .line 131
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    goto :goto_2

    .line 136
    :sswitch_8
    const-string v5, "aweme_id"

    .line 137
    .line 138
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-nez v5, :cond_5

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    goto :goto_2

    .line 150
    :sswitch_9
    const-string v5, "__extra_info__"

    .line 151
    .line 152
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-nez v5, :cond_6

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    const/4 v5, 0x0

    .line 160
    goto :goto_2

    .line 161
    :cond_7
    :goto_1
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;->getArgs()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-static {v2, v5}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    :goto_2
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v5, v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->coerceValue(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    aput-object v3, v0, v2

    .line 179
    .line 180
    add-int/lit8 v2, v2, 0x1

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_8
    return-object v0

    .line 185
    :sswitch_data_0
    .sparse-switch
        -0x68db1003 -> :sswitch_9
        -0x5a1fa06d -> :sswitch_8
        -0x5069ecaa -> :sswitch_7
        -0x13d087fd -> :sswitch_6
        0x5a7510f -> :sswitch_5
        0x1e2e76db -> :sswitch_4
        0x399b8432 -> :sswitch_3
        0x3d14eb53 -> :sswitch_2
        0x467157f4 -> :sswitch_1
        0x57e1814b -> :sswitch_0
    .end sparse-switch
.end method

.method private final buildArgsFromCapturedProfileForReply(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)[Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            "I)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length p1, p0

    .line 6
    new-array v0, p1, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, p1, :cond_7

    .line 10
    .line 11
    aget-object v2, p0, v1

    .line 12
    .line 13
    invoke-static {v1, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v3, :cond_5

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    sparse-switch v4, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :sswitch_0
    const-string v4, "item_id"

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    goto :goto_2

    .line 45
    :sswitch_1
    const-string v4, "two_level_insert_ids"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_6

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :sswitch_2
    const-string v4, "insert_ids"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_6

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :sswitch_3
    const-string v4, "comment_id"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    goto :goto_2

    .line 77
    :sswitch_4
    const-string v4, "group_id"

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    goto :goto_2

    .line 91
    :sswitch_5
    const-string v4, "count"

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    goto :goto_2

    .line 105
    :sswitch_6
    const-string v4, "top_ids"

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-nez v4, :cond_6

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :sswitch_7
    const-string v4, "cursor"

    .line 115
    .line 116
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-nez v4, :cond_4

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    const-wide/16 v4, 0x0

    .line 124
    .line 125
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    goto :goto_2

    .line 130
    :cond_5
    :goto_1
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;->getArgs()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v1, v4}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    :cond_6
    :goto_2
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v5, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->coerceValue(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    aput-object v2, v0, v1

    .line 148
    .line 149
    add-int/lit8 v1, v1, 0x1

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_7
    return-object v0

    .line 154
    nop

    .line 155
    :sswitch_data_0
    .sparse-switch
        -0x5069ecaa -> :sswitch_7
        -0x43ec2b32 -> :sswitch_6
        0x5a7510f -> :sswitch_5
        0x1e2e76db -> :sswitch_4
        0x3597f2fb -> :sswitch_3
        0x399b8432 -> :sswitch_2
        0x4645a560 -> :sswitch_1
        0x7e22b9c7 -> :sswitch_0
    .end sparse-switch
.end method

.method private final findAwemeAuthorId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object p0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :try_start_0
    const-string v1, "getAuthor"

    .line 7
    .line 8
    new-array v2, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    :try_start_1
    new-instance v2, Leo1;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    move-object v1, v2

    .line 22
    :goto_0
    instance-of v2, v1, Leo1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    :cond_1
    if-nez v1, :cond_2

    .line 28
    .line 29
    :try_start_2
    const-string v1, "author"

    .line 30
    .line 31
    invoke-static {p1, v1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    move-object v1, p1

    .line 36
    goto :goto_1

    .line 37
    :catchall_1
    move-exception p1

    .line 38
    :try_start_3
    new-instance v1, Leo1;

    .line 39
    .line 40
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_1
    instance-of p1, v1, Leo1;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    move-object v1, p0

    .line 48
    goto :goto_2

    .line 49
    :catchall_2
    move-exception p1

    .line 50
    goto/16 :goto_d

    .line 51
    .line 52
    :cond_2
    :goto_2
    if-eqz v1, :cond_10

    .line 53
    .line 54
    :try_start_4
    const-string p1, "getUid"

    .line 55
    .line 56
    new-array v2, v0, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-static {v1, p1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    instance-of v2, p1, Ljava/lang/String;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    check-cast p1, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :catchall_3
    move-exception p1

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    move-object p1, p0

    .line 72
    goto :goto_4

    .line 73
    :goto_3
    :try_start_5
    new-instance v2, Leo1;

    .line 74
    .line 75
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    move-object p1, v2

    .line 79
    :goto_4
    instance-of v2, p1, Leo1;

    .line 80
    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    move-object p1, p0

    .line 84
    :cond_4
    check-cast p1, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 85
    .line 86
    if-nez p1, :cond_7

    .line 87
    .line 88
    :try_start_6
    const-string p1, "uid"

    .line 89
    .line 90
    invoke-static {v1, p1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    instance-of v2, p1, Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    check-cast p1, Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :catchall_4
    move-exception p1

    .line 102
    goto :goto_5

    .line 103
    :cond_5
    move-object p1, p0

    .line 104
    goto :goto_6

    .line 105
    :goto_5
    :try_start_7
    new-instance v2, Leo1;

    .line 106
    .line 107
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    move-object p1, v2

    .line 111
    :goto_6
    instance-of v2, p1, Leo1;

    .line 112
    .line 113
    if-eqz v2, :cond_6

    .line 114
    .line 115
    move-object p1, p0

    .line 116
    :cond_6
    check-cast p1, Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 117
    .line 118
    :cond_7
    :try_start_8
    const-string v2, "getSecUid"

    .line 119
    .line 120
    new-array v0, v0, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v1, v2, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    instance-of v2, v0, Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v2, :cond_8

    .line 129
    .line 130
    check-cast v0, Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :catchall_5
    move-exception v0

    .line 134
    goto :goto_7

    .line 135
    :cond_8
    move-object v0, p0

    .line 136
    goto :goto_8

    .line 137
    :goto_7
    :try_start_9
    new-instance v2, Leo1;

    .line 138
    .line 139
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object v0, v2

    .line 143
    :goto_8
    instance-of v2, v0, Leo1;

    .line 144
    .line 145
    if-eqz v2, :cond_9

    .line 146
    .line 147
    move-object v0, p0

    .line 148
    :cond_9
    check-cast v0, Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 149
    .line 150
    if-nez v0, :cond_c

    .line 151
    .line 152
    :try_start_a
    const-string v0, "secUid"

    .line 153
    .line 154
    invoke-static {v1, v0}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    instance-of v1, v0, Ljava/lang/String;

    .line 159
    .line 160
    if-eqz v1, :cond_a

    .line 161
    .line 162
    check-cast v0, Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 163
    .line 164
    goto :goto_a

    .line 165
    :catchall_6
    move-exception v0

    .line 166
    goto :goto_9

    .line 167
    :cond_a
    move-object v0, p0

    .line 168
    goto :goto_a

    .line 169
    :goto_9
    :try_start_b
    new-instance v1, Leo1;

    .line 170
    .line 171
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    move-object v0, v1

    .line 175
    :goto_a
    instance-of v1, v0, Leo1;

    .line 176
    .line 177
    if-eqz v1, :cond_b

    .line 178
    .line 179
    move-object v0, p0

    .line 180
    :cond_b
    check-cast v0, Ljava/lang/String;

    .line 181
    .line 182
    :cond_c
    if-eqz p1, :cond_f

    .line 183
    .line 184
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-nez v1, :cond_d

    .line 189
    .line 190
    goto :goto_b

    .line 191
    :cond_d
    move-object p1, p0

    .line 192
    :goto_b
    if-nez p1, :cond_e

    .line 193
    .line 194
    goto :goto_c

    .line 195
    :cond_e
    move-object v0, p1

    .line 196
    goto :goto_e

    .line 197
    :cond_f
    :goto_c
    if-eqz v0, :cond_10

    .line 198
    .line 199
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 203
    if-nez p1, :cond_10

    .line 204
    .line 205
    goto :goto_e

    .line 206
    :cond_10
    move-object v0, p0

    .line 207
    goto :goto_e

    .line 208
    :goto_d
    new-instance v0, Leo1;

    .line 209
    .line 210
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    :goto_e
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-eqz p1, :cond_11

    .line 218
    .line 219
    const-string v1, "r70ac498a2ca77555"

    .line 220
    .line 221
    const-string v2, "findAwemeAuthorId failed"

    .line 222
    .line 223
    invoke-static {v1, v2, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    :cond_11
    instance-of p1, v0, Leo1;

    .line 227
    .line 228
    if-eqz p1, :cond_12

    .line 229
    .line 230
    goto :goto_f

    .line 231
    :cond_12
    move-object p0, v0

    .line 232
    :goto_f
    check-cast p0, Ljava/lang/String;

    .line 233
    .line 234
    return-object p0
.end method

.method private final findAwemeById(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    :try_start_0
    sget-object p0, Lqe0;->α:Ljava/lang/Object;

    .line 10
    .line 11
    const-string p0, "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE1DF814C6225A6489367ABAFCF0011E9F31908A6435981074F0"

    .line 12
    .line 13
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1, p0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    :goto_0
    move-object p0, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const-string p1, "LIZIZ"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    new-array v1, v1, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p0, p1, v1}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const-string p1, "getAwemeById"

    .line 38
    .line 39
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {p0, p1, v1}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    new-instance p1, Leo1;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p0, p1

    .line 55
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    const-string v1, "findAwemeById failed awemeId="

    .line 62
    .line 63
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const-string v1, "r70ac498a2ca77555"

    .line 68
    .line 69
    invoke-static {v1, p2, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    instance-of p1, p0, Leo1;

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move-object v0, p0

    .line 78
    :goto_2
    return-object v0
.end method

.method private final varargs findClassAny(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_0
    const/4 v1, 0x4

    .line 4
    const-string v2, "r70ac498a2ca77555"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-ge v0, p0, :cond_2

    .line 8
    .line 9
    aget-object v4, p2, v0

    .line 10
    .line 11
    :try_start_0
    invoke-static {p1, v4}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception v5

    .line 17
    new-instance v6, Leo1;

    .line 18
    .line 19
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v5, v6

    .line 23
    :goto_1
    instance-of v6, v5, Leo1;

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    move-object v5, v3

    .line 28
    :cond_0
    check-cast v5, Ljava/lang/Class;

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p1, "findClassAny hit "

    .line 37
    .line 38
    const-string p2, " -> "

    .line 39
    .line 40
    invoke-static {p1, v4, p2, p0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v5

    .line 48
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/16 p0, 0x3f

    .line 52
    .line 53
    invoke-static {p2, v3, v3, v3, p0}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string p1, "findClassAny miss: "

    .line 58
    .line 59
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object v3
.end method

.method private final getHostAvatarShrink(Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "96_96"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "X.11Yo"

    .line 5
    .line 6
    const-string v3, "X.C19566711Yo"

    .line 7
    .line 8
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {p0, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->findClassAny(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    move-object p0, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const-string p1, "LJIIL"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    new-array v2, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p0, p1, v2}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of p1, p0, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object p0, v1

    .line 39
    goto :goto_1

    .line 40
    :goto_0
    new-instance p1, Leo1;

    .line 41
    .line 42
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object p0, p1

    .line 46
    :goto_1
    instance-of p1, p0, Leo1;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object v1, p0

    .line 52
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    const-string v1, ""

    .line 57
    .line 58
    :cond_3
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_4

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move-object v0, v1

    .line 66
    :goto_3
    return-object v0
.end method

.method private final getHostCityOrNull(Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "X.16mC"

    .line 3
    .line 4
    const-string v2, "X.C20920116mC"

    .line 5
    .line 6
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->findClassAny(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    :cond_0
    move-object p0, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const-string p1, "LJI"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    new-array v1, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p0, p1, v1}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of p1, p0, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    new-instance p1, Leo1;

    .line 36
    .line 37
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object p0, p1

    .line 41
    :goto_0
    instance-of p1, p0, Leo1;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v0, p0

    .line 47
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    return-object v0
.end method

.method private final getHostCommonInfoOrEmpty(Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "X.116E"

    .line 5
    .line 6
    const-string v3, "X.C116E"

    .line 7
    .line 8
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {p0, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->findClassAny(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    move-object p0, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const-string p1, "LIZIZ"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    new-array v2, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p0, p1, v2}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of p1, p0, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object p0, v1

    .line 39
    goto :goto_1

    .line 40
    :goto_0
    new-instance p1, Leo1;

    .line 41
    .line 42
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object p0, p1

    .line 46
    :goto_1
    instance-of p1, p0, Leo1;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object v1, p0

    .line 52
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move-object v0, v1

    .line 58
    :goto_3
    return-object v0
.end method

.method private final installProxyCaptureHook(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 7

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    array-length v0, p2

    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    const/4 v2, 0x0

    .line 23
    if-ge v1, v0, :cond_1

    .line 24
    .line 25
    aget-object v3, p2, v1

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-static {v4, v5}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v3, v2

    .line 60
    :goto_1
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_2
    new-instance p2, Ljava/util/HashSet;

    .line 66
    .line 67
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v3, v1

    .line 90
    check-cast v3, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 93
    .line 94
    invoke-virtual {v4, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {p2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_7

    .line 117
    .line 118
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, Ljava/lang/reflect/Method;

    .line 123
    .line 124
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 125
    .line 126
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->hookedProxyMethods:Ljava/util/Set;

    .line 131
    .line 132
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    const/4 v4, 0x4

    .line 147
    const-string v5, "r70ac498a2ca77555"

    .line 148
    .line 149
    if-eqz v3, :cond_6

    .line 150
    .line 151
    const-string p2, "skip abstract capture method: "

    .line 152
    .line 153
    invoke-static {p2, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-static {v5, p2, v2, v4, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 165
    .line 166
    const/4 v3, 0x1

    .line 167
    :try_start_0
    invoke-virtual {p2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 168
    .line 169
    .line 170
    sget-object v3, Lxq0;->α:Lxq0;

    .line 171
    .line 172
    new-instance v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;

    .line 173
    .line 174
    invoke-direct {v6, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;-><init>(Ljava/lang/reflect/Method;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, p2, v6}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 178
    .line 179
    .line 180
    new-instance p2, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v1, "hooked loadMore capture method: "

    .line 186
    .line 187
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-static {v5, p2, v2, v4, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    sget-object p2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :catchall_0
    move-exception p2

    .line 204
    new-instance v1, Leo1;

    .line 205
    .line 206
    invoke-direct {v1, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    move-object p2, v1

    .line 210
    :goto_4
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    if-eqz p2, :cond_5

    .line 215
    .line 216
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->hookedProxyMethods:Ljava/util/Set;

    .line 217
    .line 218
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    new-instance v1, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v3, "hook loadMore capture failed: "

    .line 224
    .line 225
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v5, v0, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    return-void
.end method

.method private final invokeLoadMore(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;

    .line 2
    .line 3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 9
    .line 10
    array-length v1, p3

    .line 11
    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {v0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->invokeUnwrap(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;

    .line 27
    .line 28
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public static synthetic loadFirstPage$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;IILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/16 p3, 0x32

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->loadFirstPage(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final loadFirstPage$lambda$25$lambda$24$lambda$23(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getContent(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    const/16 v1, 0x14

    .line 25
    .line 26
    invoke-static {p0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, " | id="

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, " | text="

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method private static final loadInsertedCommentList$lambda$4(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;
    .locals 5

    .line 1
    invoke-static {p0}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    array-length p0, p0

    .line 22
    const-string v3, "#"

    .line 23
    .line 24
    const-string v4, ":"

    .line 25
    .line 26
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "/"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method private final logInvokePlan(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v4, Luj;

    .line 33
    .line 34
    const/16 v5, 0xe

    .line 35
    .line 36
    invoke-direct {v4, v5}, Luj;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const/16 v5, 0x1f

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-static {v3, v6, v6, v4, v5}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const-string v4, ", method="

    .line 47
    .line 48
    const-string v5, "#"

    .line 49
    .line 50
    const-string v7, "invoke loadMore plan="

    .line 51
    .line 52
    invoke-static {v7, p0, v4, v0, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v0, ", return="

    .line 57
    .line 58
    const-string v4, ", paramTypes="

    .line 59
    .line 60
    invoke-static {p0, v1, v0, v2, v4}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string v0, "r70ac498a2ca77555"

    .line 71
    .line 72
    const/4 v1, 0x4

    .line 73
    invoke-static {v0, p0, v6, v1, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    array-length p3, p0

    .line 81
    const/4 v2, 0x0

    .line 82
    move v3, v2

    .line 83
    :goto_0
    if-ge v2, p3, :cond_1

    .line 84
    .line 85
    aget-object v4, p0, v2

    .line 86
    .line 87
    add-int/lit8 v5, v3, 0x1

    .line 88
    .line 89
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 90
    .line 91
    invoke-static {v3, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v7, v8, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->maskArg(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-static {v3, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    aget-object v9, v9, v3

    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    if-eqz v4, :cond_0

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_1

    .line 126
    :cond_0
    move-object v4, v6

    .line 127
    :goto_1
    new-instance v10, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v11, "arg["

    .line 130
    .line 131
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v3, "], name="

    .line 138
    .line 139
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v3, ", type="

    .line 146
    .line 147
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v3, ", value="

    .line 154
    .line 155
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v3, ", valueType="

    .line 162
    .line 163
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v0, v3, v6, v1, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    add-int/lit8 v2, v2, 0x1

    .line 177
    .line 178
    move v3, v5

    .line 179
    goto :goto_0

    .line 180
    :cond_1
    return-void
.end method

.method private static final logInvokePlan$lambda$18(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final logReplyCoreArgs(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const-string v4, "comment_id"

    .line 14
    .line 15
    invoke-static {v0, v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-string v5, "item_id"

    .line 20
    .line 21
    invoke-static {v0, v1, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const-string v6, "insert_ids"

    .line 26
    .line 27
    invoke-static {v0, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const-string v7, "top_ids"

    .line 32
    .line 33
    invoke-static {v0, v1, v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    const-string v8, "two_level_insert_ids"

    .line 38
    .line 39
    invoke-static {v0, v1, v8}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    const-string v9, "channel_id"

    .line 44
    .line 45
    invoke-static {v0, v1, v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    const-string v10, "service_id"

    .line 50
    .line 51
    invoke-static {v0, v1, v10}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    const-string v11, "group_id"

    .line 56
    .line 57
    invoke-static {v0, v1, v11}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    const-string v12, "comment_scene"

    .line 62
    .line 63
    invoke-static {v0, v1, v12}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    const-string v13, "hotspot_id"

    .line 68
    .line 69
    invoke-static {v0, v1, v13}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    const-string v14, "comment_token"

    .line 74
    .line 75
    invoke-static {v0, v1, v14}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    const-string v15, "language"

    .line 80
    .line 81
    invoke-static {v0, v1, v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v15

    .line 85
    move-object/from16 p0, v15

    .line 86
    .line 87
    const-string v15, "aweme_type"

    .line 88
    .line 89
    invoke-static {v0, v1, v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, ", method="

    .line 94
    .line 95
    const-string v15, ", comment_id="

    .line 96
    .line 97
    move-object/from16 p1, v0

    .line 98
    .line 99
    const-string v0, "reply core args, plan="

    .line 100
    .line 101
    invoke-static {v0, v2, v1, v3, v15}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, ", item_id="

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", insert_ids="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ", top_ids="

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, ", two_level_insert_ids="

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", channel_id="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v1, ", service_id="

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v1, ", group_id="

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, ", comment_scene="

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v1, ", hotspot_id="

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v1, ", comment_token="

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string v1, ", language="

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    move-object/from16 v1, p0

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v1, ", aweme_type="

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    move-object/from16 v1, p1

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const/4 v1, 0x0

    .line 213
    const/4 v2, 0x4

    .line 214
    const-string v3, "r70ac498a2ca77555"

    .line 215
    .line 216
    invoke-static {v3, v0, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-void
.end method

.method private static final logReplyCoreArgs$valueOf(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method private final maskArg(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    if-eqz p1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sparse-switch p0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :sswitch_0
    const-string p0, "highlight_auth_token"

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :sswitch_1
    const-string p0, "comment_token"

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :sswitch_2
    const-string p0, "authentication_token"

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :sswitch_3
    const-string p0, "item_token"

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const/16 p2, 0xc

    .line 59
    .line 60
    const-string v0, "***"

    .line 61
    .line 62
    if-gt p1, p2, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    const/4 p1, 0x6

    .line 66
    invoke-static {p0, p1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p0}, Lq02;->А(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p1, v0, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_3
    :goto_0
    return-object p2

    .line 80
    nop

    :sswitch_data_0
    .sparse-switch
        -0x744d4233 -> :sswitch_3
        -0x4aaaba8e -> :sswitch_2
        -0x41e177e7 -> :sswitch_1
        0x630fad0d -> :sswitch_0
    .end sparse-switch
.end method

.method private final sortMethodsByCapturedProfile(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private final tryLoadByHostWrapperLJII(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, ", awemeId="

    .line 6
    .line 7
    const-class v3, Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, "r70ac498a2ca77555"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    :try_start_0
    const-string v6, "X.11Yo"

    .line 13
    .line 14
    const-string v7, "X.C19566711Yo"

    .line 15
    .line 16
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-direct {v0, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->findClassAny(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const/4 v7, 0x4

    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    const-string v0, "host wrapper class not found: X.11Yo / X.C19566711Yo"

    .line 28
    .line 29
    invoke-static {v4, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    move-object v0, v5

    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    array-length v9, v8

    .line 46
    const/4 v11, 0x0

    .line 47
    :goto_1
    const/16 v12, 0x8

    .line 48
    .line 49
    const/4 v13, 0x1

    .line 50
    if-ge v11, v9, :cond_2

    .line 51
    .line 52
    aget-object v14, v8, v11

    .line 53
    .line 54
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    const/16 v16, 0x0

    .line 59
    .line 60
    const-string v10, "LJII"

    .line 61
    .line 62
    invoke-static {v15, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-eqz v10, :cond_1

    .line 67
    .line 68
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    array-length v10, v10

    .line 73
    if-ne v10, v12, :cond_1

    .line 74
    .line 75
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    aget-object v10, v10, v16

    .line 80
    .line 81
    invoke-static {v10, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_1

    .line 86
    .line 87
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    aget-object v10, v10, v13

    .line 92
    .line 93
    sget-object v15, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-static {v10, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_1

    .line 100
    .line 101
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    const/4 v15, 0x2

    .line 106
    aget-object v10, v10, v15

    .line 107
    .line 108
    invoke-static {v10, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    if-eqz v10, :cond_1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    move-object v14, v5

    .line 119
    :goto_2
    if-nez v14, :cond_3

    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v1, Luj;

    .line 129
    .line 130
    const/16 v3, 0xc

    .line 131
    .line 132
    invoke-direct {v1, v3}, Luj;-><init>(I)V

    .line 133
    .line 134
    .line 135
    const/16 v3, 0x1f

    .line 136
    .line 137
    invoke-static {v0, v5, v5, v1, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v3, "host wrapper LJII method not found, methods="

    .line 147
    .line 148
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v4, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_3
    invoke-virtual {v14, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-direct {v0, v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->findAwemeById(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->findAwemeAuthorId(Ljava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-nez v0, :cond_4

    .line 179
    .line 180
    const-string v0, ""

    .line 181
    .line 182
    :cond_4
    move-object/from16 v18, v0

    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-eqz v1, :cond_5

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    goto :goto_3

    .line 211
    :cond_5
    move-object v9, v5

    .line 212
    :goto_3
    new-instance v10, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const-string v11, "try host wrapper LJII, cls="

    .line 218
    .line 219
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v0, ", commentId="

    .line 226
    .line 227
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v0, ", awemeAuthorLen="

    .line 240
    .line 241
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v0, ", aweme="

    .line 248
    .line 249
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v4, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v15

    .line 266
    const-wide/16 v8, 0x0

    .line 267
    .line 268
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 269
    .line 270
    .line 271
    move-result-object v16

    .line 272
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v17

    .line 276
    const-string v19, ""

    .line 277
    .line 278
    const-string v20, ""

    .line 279
    .line 280
    const/16 v21, 0x0

    .line 281
    .line 282
    move-object/from16 v22, v1

    .line 283
    .line 284
    filled-new-array/range {v15 .. v22}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v14, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-nez v0, :cond_6

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :cond_6
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 297
    .line 298
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->awaitNetworkResult(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    if-eqz v0, :cond_7

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    goto :goto_4

    .line 313
    :cond_7
    move-object v1, v5

    .line 314
    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 317
    .line 318
    .line 319
    const-string v6, "host wrapper LJII response="

    .line 320
    .line 321
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-static {v4, v1, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 335
    .line 336
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjects(Ljava/lang/Object;)Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    invoke-static {v1, v12}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    new-instance v1, Luj;

    .line 349
    .line 350
    const/16 v6, 0xd

    .line 351
    .line 352
    invoke-direct {v1, v6}, Luj;-><init>(I)V

    .line 353
    .line 354
    .line 355
    const/16 v19, 0x1f

    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    const/4 v15, 0x0

    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    move-object/from16 v18, v1

    .line 364
    .line 365
    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    new-instance v6, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    const-string v8, "host wrapper LJII comments="

    .line 375
    .line 376
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string v3, ", preview="

    .line 383
    .line 384
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-static {v4, v1, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    .line 396
    .line 397
    goto :goto_6

    .line 398
    :goto_5
    new-instance v1, Leo1;

    .line 399
    .line 400
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 401
    .line 402
    .line 403
    move-object v0, v1

    .line 404
    :goto_6
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    if-eqz v1, :cond_8

    .line 409
    .line 410
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v6

    .line 418
    const-string v7, "host wrapper LJII failed, cid="

    .line 419
    .line 420
    invoke-static {v7, v3, v2, v6}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-static {v4, v2, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 425
    .line 426
    .line 427
    :cond_8
    instance-of v1, v0, Leo1;

    .line 428
    .line 429
    if-eqz v1, :cond_9

    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_9
    move-object v5, v0

    .line 433
    :goto_7
    return-object v5
.end method

.method private static final tryLoadByHostWrapperLJII$lambda$30$lambda$28(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    array-length p0, p0

    .line 10
    const-string v1, "/"

    .line 11
    .line 12
    invoke-static {v0, v1, p0}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final tryLoadByHostWrapperLJII$lambda$30$lambda$29(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getContent(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x14

    .line 17
    .line 18
    invoke-static {p0, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    const-string v0, ":"

    .line 25
    .line 26
    invoke-static {v1, v0, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static synthetic α(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->tryLoadByHostWrapperLJII$lambda$30$lambda$28(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic β(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->loadFirstPage$lambda$25$lambda$24$lambda$23(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic γ(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logInvokePlan$lambda$18(Ljava/lang/Class;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic δ(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->buildArgPlansForReplyList$lambda$34$lambda$33(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ε(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->buildArgPlans$lambda$17$lambda$16(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ζ(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->tryLoadByHostWrapperLJII$lambda$30$lambda$29(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic η(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->loadInsertedCommentList$lambda$4(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final installCaptureHooks(Ljava/lang/ClassLoader;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveReplyListMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installCaptureHooks$$inlined$sortedByDescending$1;

    .line 11
    .line 12
    invoke-direct {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installCaptureHooks$$inlined$sortedByDescending$1;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, "installCaptureHooks, replyListMethods="

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, ", allowDexKitScan="

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 p2, 0x0

    .line 46
    const/4 v0, 0x4

    .line 47
    const-string v1, "r70ac498a2ca77555"

    .line 48
    .line 49
    invoke-static {v1, p1, p2, v0, p2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/lang/reflect/Method;

    .line 67
    .line 68
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveApiInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-direct {p2, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->installProxyCaptureHook(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object p2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception p2

    .line 97
    new-instance v0, Leo1;

    .line 98
    .line 99
    invoke-direct {v0, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    move-object p2, v0

    .line 103
    :goto_1
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    if-eqz p2, :cond_0

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const-string v2, "install capture hook failed for "

    .line 122
    .line 123
    const-string v3, "#"

    .line 124
    .line 125
    invoke-static {v2, v0, v3, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {v1, p1, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    return-void
.end method

.method public final isInvalidRequestError(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isInvalidParamServerError(Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final loadFirstPage(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const-string v3, ", plan="

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct/range {p0 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->tryLoadByHostWrapperLJII(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x4

    .line 20
    const-string v6, "r70ac498a2ca77555"

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    const-string v0, "loadFirstPage success via host wrapper LJII"

    .line 26
    .line 27
    invoke-static {v6, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v4

    .line 31
    :cond_0
    sget-object v4, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 32
    .line 33
    const/4 v8, 0x1

    .line 34
    invoke-virtual {v4, v1, v8}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveReplyListMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    new-instance v9, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eqz v10, :cond_2

    .line 52
    .line 53
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    move-object v11, v10

    .line 58
    check-cast v11, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    const-string v12, "fetchReplyTreeListPOST"

    .line 65
    .line 66
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-eqz v11, :cond_1

    .line 71
    .line 72
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    const-string v12, " (fetchReplyTreeListPOST only), awemeId="

    .line 89
    .line 90
    const-string v13, ", commentId="

    .line 91
    .line 92
    const-string v14, "loadFirstPage filtered methods="

    .line 93
    .line 94
    invoke-static {v4, v14, v12, v10, v13}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v10, ", count="

    .line 102
    .line 103
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v6, v4, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-nez v4, :cond_b

    .line 121
    .line 122
    const/4 v4, 0x0

    .line 123
    invoke-virtual {v0, v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->installCaptureHooks(Ljava/lang/ClassLoader;Z)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->sortMethodsByCapturedProfile(Ljava/util/List;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    move-object v0, v7

    .line 135
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-eqz v4, :cond_9

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    invoke-virtual {v4, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 148
    .line 149
    .line 150
    sget-object v9, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9, v10}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveApiInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    if-nez v10, :cond_4

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    const-string v9, "resolveApiInstance failed for "

    .line 174
    .line 175
    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-static {v6, v4, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    move-object/from16 v12, p2

    .line 183
    .line 184
    :cond_3
    move v8, v5

    .line 185
    goto/16 :goto_6

    .line 186
    .line 187
    :cond_4
    sget-object v11, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->replyListParamNames:Ljava/util/List;

    .line 188
    .line 189
    invoke-virtual {v9, v4, v11}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveParamNames(Ljava/lang/reflect/Method;Ljava/util/List;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    sget-object v11, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 194
    .line 195
    move-object/from16 v12, p2

    .line 196
    .line 197
    invoke-direct {v11, v4, v9, v12, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->buildArgPlansForReplyList(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-eqz v13, :cond_3

    .line 210
    .line 211
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    move-object v13, v0

    .line 216
    check-cast v13, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;

    .line 217
    .line 218
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 219
    .line 220
    invoke-direct {v0, v4, v9, v13}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logInvokePlan(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;)V

    .line 221
    .line 222
    .line 223
    :try_start_0
    invoke-virtual {v13}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v14

    .line 227
    invoke-direct {v0, v4, v10, v14}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->invokeLoadMore(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    if-nez v0, :cond_5

    .line 232
    .line 233
    return-object v7

    .line 234
    :cond_5
    sget-object v14, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 235
    .line 236
    invoke-virtual {v14, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->awaitNetworkResult(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v17

    .line 240
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v13}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getName()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    if-eqz v17, :cond_6

    .line 249
    .line 250
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v15

    .line 258
    goto :goto_3

    .line 259
    :catchall_0
    move-exception v0

    .line 260
    move v8, v5

    .line 261
    goto/16 :goto_5

    .line 262
    .line 263
    :cond_6
    move-object v15, v7

    .line 264
    :goto_3
    new-instance v8, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 267
    .line 268
    .line 269
    :try_start_1
    const-string v5, "reply response ok, method="

    .line 270
    .line 271
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v0, ", responseClass="

    .line 284
    .line 285
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 295
    const/4 v5, 0x4

    .line 296
    :try_start_2
    invoke-static {v6, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 297
    .line 298
    .line 299
    :try_start_3
    sget-object v15, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 300
    .line 301
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 306
    .line 307
    .line 308
    move-result-object v16

    .line 309
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    const/16 v19, 0x4

    .line 313
    .line 314
    const/16 v20, 0x0

    .line 315
    .line 316
    const/16 v18, 0x0

    .line 317
    .line 318
    invoke-static/range {v15 .. v20}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findRealCommentObjectsDeep$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;Ljava/lang/ClassLoader;Ljava/lang/Object;IILjava/lang/Object;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    move-object/from16 v5, v17

    .line 323
    .line 324
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-nez v8, :cond_7

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_7
    invoke-virtual {v15, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjects(Ljava/lang/Object;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    :goto_4
    const/16 v8, 0x8

    .line 336
    .line 337
    invoke-static {v0, v8}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v14

    .line 341
    new-instance v8, Luj;

    .line 342
    .line 343
    const/16 v15, 0xb

    .line 344
    .line 345
    invoke-direct {v8, v15}, Luj;-><init>(I)V

    .line 346
    .line 347
    .line 348
    const/16 v20, 0x1f

    .line 349
    .line 350
    const/4 v15, 0x0

    .line 351
    const/16 v16, 0x0

    .line 352
    .line 353
    const/16 v17, 0x0

    .line 354
    .line 355
    const/16 v18, 0x0

    .line 356
    .line 357
    move-object/from16 v19, v8

    .line 358
    .line 359
    invoke-static/range {v14 .. v20}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    new-instance v14, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    const-string v15, "reply response comments count="

    .line 373
    .line 374
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v0, ", preview="

    .line 381
    .line 382
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 392
    const/4 v8, 0x4

    .line 393
    :try_start_4
    invoke-static {v6, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 394
    .line 395
    .line 396
    return-object v5

    .line 397
    :catchall_1
    move-exception v0

    .line 398
    goto :goto_5

    .line 399
    :catchall_2
    move-exception v0

    .line 400
    const/4 v8, 0x4

    .line 401
    :goto_5
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v14

    .line 413
    invoke-virtual {v13}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getName()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v13

    .line 417
    const-string v15, "loadFirstPage failed, method="

    .line 418
    .line 419
    const-string v7, "#"

    .line 420
    .line 421
    invoke-static {v15, v5, v7, v14, v3}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    invoke-static {v6, v5, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 433
    .line 434
    .line 435
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 436
    .line 437
    invoke-virtual {v5, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isInvalidParamServerError(Ljava/lang/Throwable;)Z

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    if-eqz v5, :cond_8

    .line 442
    .line 443
    move v5, v8

    .line 444
    const/4 v7, 0x0

    .line 445
    const/4 v8, 0x1

    .line 446
    goto/16 :goto_2

    .line 447
    .line 448
    :cond_8
    throw v0

    .line 449
    :goto_6
    move v5, v8

    .line 450
    const/4 v7, 0x0

    .line 451
    const/4 v8, 0x1

    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :cond_9
    if-nez v0, :cond_a

    .line 455
    .line 456
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 457
    .line 458
    const-string v1, "loadFirstPage failed"

    .line 459
    .line 460
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    :cond_a
    throw v0

    .line 464
    :cond_b
    const-string v0, "reply list api method not found"

    .line 465
    .line 466
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    const/4 v0, 0x0

    .line 470
    return-object v0
.end method

.method public final loadInsertedCommentList(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v2, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v2, v1, v3}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveReplyListMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    new-instance v9, Luj;

    .line 23
    .line 24
    const/16 v5, 0xa

    .line 25
    .line 26
    invoke-direct {v9, v5}, Luj;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 v10, 0x17

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/16 v8, 0x8

    .line 35
    .line 36
    invoke-static/range {v4 .. v10}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v7, "loadInsertedCommentList methods="

    .line 43
    .line 44
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v2, ", "

    .line 51
    .line 52
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v5, "r70ac498a2ca77555"

    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v7, 0x4

    .line 66
    invoke-static {v5, v2, v6, v7, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_6

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-virtual {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->installCaptureHooks(Ljava/lang/ClassLoader;Z)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->sortMethodsByCapturedProfile(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    move-object v0, v6

    .line 88
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/reflect/Method;

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 101
    .line 102
    .line 103
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v8}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveApiInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    if-nez v8, :cond_0

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-string v4, "resolveApiInstance failed for "

    .line 127
    .line 128
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v5, v2, v6, v7, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-object/from16 v10, p2

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_0
    sget-object v9, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->replyListParamNames:Ljava/util/List;

    .line 139
    .line 140
    invoke-virtual {v4, v2, v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveParamNames(Ljava/lang/reflect/Method;Ljava/util/List;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    sget-object v9, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 145
    .line 146
    move-object/from16 v10, p2

    .line 147
    .line 148
    invoke-direct {v9, v2, v4, v10}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->buildArgPlans(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_3

    .line 161
    .line 162
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    move-object v11, v0

    .line 167
    check-cast v11, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;

    .line 168
    .line 169
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 170
    .line 171
    invoke-direct {v0, v2, v4, v11}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logInvokePlan(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {v0, v2, v4, v11}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->logReplyCoreArgs(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;)V

    .line 175
    .line 176
    .line 177
    :try_start_0
    invoke-virtual {v11}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-direct {v0, v2, v8, v12}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->invokeLoadMore(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-nez v0, :cond_1

    .line 186
    .line 187
    return-object v6

    .line 188
    :cond_1
    sget-object v12, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->awaitNetworkResult(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    return-object v0

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    invoke-virtual {v11}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$ArgPlan;->getName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    const-string v14, "#"

    .line 213
    .line 214
    const-string v15, ", plan="

    .line 215
    .line 216
    const-string v3, "loadMore failed, method="

    .line 217
    .line 218
    invoke-static {v3, v12, v14, v13, v15}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-static {v5, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 233
    .line 234
    invoke-virtual {v3, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isInvalidParamServerError(Ljava/lang/Throwable;)Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_2

    .line 239
    .line 240
    const/4 v3, 0x1

    .line 241
    goto :goto_1

    .line 242
    :cond_2
    throw v0

    .line 243
    :cond_3
    :goto_2
    const/4 v3, 0x1

    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_4
    if-nez v0, :cond_5

    .line 247
    .line 248
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 249
    .line 250
    const-string v1, "loadMoreComments failed"

    .line 251
    .line 252
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    :cond_5
    throw v0

    .line 256
    :cond_6
    const-string v0, "comment list api method not found"

    .line 257
    .line 258
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    const/4 v0, 0x0

    .line 262
    return-object v0
.end method

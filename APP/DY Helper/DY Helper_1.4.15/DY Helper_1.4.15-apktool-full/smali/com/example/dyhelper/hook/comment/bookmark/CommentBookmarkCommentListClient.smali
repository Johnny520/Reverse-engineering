.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;,
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;,
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final CAPTURE_PROFILE_VALID_MS:J = 0x1b7740L

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

.field private static final TAG:Ljava/lang/String; = "r20776a48cef66734"

.field private static final captureHookedLoaders:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

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

.field private static final loadMoreParamNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final officialFallbackModes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;",
            ">;"
        }
    .end annotation
.end field

.field private static final selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;


# direct methods
.method static constructor <clinit>()V
    .locals 62

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 7
    .line 8
    const-string v60, "is_need_reply_list_exposure"

    .line 9
    .line 10
    const-string v61, "common_group_id"

    .line 11
    .line 12
    const-string v1, "aweme_id"

    .line 13
    .line 14
    const-string v2, "cursor"

    .line 15
    .line 16
    const-string v3, "count"

    .line 17
    .line 18
    const-string v4, "insert_ids"

    .line 19
    .line 20
    const-string v5, "address_book_access"

    .line 21
    .line 22
    const-string v6, "gps_access"

    .line 23
    .line 24
    const-string v7, "forward_page_type"

    .line 25
    .line 26
    const-string v8, "ad_creative_id"

    .line 27
    .line 28
    const-string v9, "channel_id"

    .line 29
    .line 30
    const-string v10, "city"

    .line 31
    .line 32
    const-string v11, "hotsoon_filtered_count"

    .line 33
    .line 34
    const-string v12, "hotsoon_has_more"

    .line 35
    .line 36
    const-string v13, "follower_count"

    .line 37
    .line 38
    const-string v14, "is_familiar"

    .line 39
    .line 40
    const-string v15, "page_source"

    .line 41
    .line 42
    const-string v16, "is_fold_list"

    .line 43
    .line 44
    const-string v17, "user_avatar_shrink"

    .line 45
    .line 46
    const-string v18, "aweme_author"

    .line 47
    .line 48
    const-string v19, "item_type"

    .line 49
    .line 50
    const-string v20, "__extra_info__"

    .line 51
    .line 52
    const-string v21, "comment_aggregation"

    .line 53
    .line 54
    const-string v22, "top_query_word"

    .line 55
    .line 56
    const-string v23, "is_preload"

    .line 57
    .line 58
    const-string v24, "favorite_comment_timestamp"

    .line 59
    .line 60
    const-string v25, "channel_ext"

    .line 61
    .line 62
    const-string v26, "authentication_token"

    .line 63
    .line 64
    const-string v27, "use_url_optimize"

    .line 65
    .line 66
    const-string v28, "current_l1_comment_count"

    .line 67
    .line 68
    const-string v29, "service_id"

    .line 69
    .line 70
    const-string v30, "group_id"

    .line 71
    .line 72
    const-string v31, "comment_scene"

    .line 73
    .line 74
    const-string v32, "hotspot_id"

    .line 75
    .line 76
    const-string v33, "ad_info"

    .line 77
    .line 78
    const-string v34, "preload_type"

    .line 79
    .line 80
    const-string v35, "comment_count"

    .line 81
    .line 82
    const-string v36, "medium_shrink"

    .line 83
    .line 84
    const-string v37, "need_management_hint"

    .line 85
    .line 86
    const-string v38, "highlight_item_id"

    .line 87
    .line 88
    const-string v39, "highlight_auth_token"

    .line 89
    .line 90
    const-string v40, "use_light_optimize"

    .line 91
    .line 92
    const-string v41, "comment_common_aweme_data"

    .line 93
    .line 94
    const-string v42, "comment_common_user_data"

    .line 95
    .line 96
    const-string v43, "comment_common_comment_data"

    .line 97
    .line 98
    const-string v44, "friend_interaction"

    .line 99
    .line 100
    const-string v45, "session_id"

    .line 101
    .line 102
    const-string v46, "session_show_cids"

    .line 103
    .line 104
    const-string v47, "ai_cmt_exposure"

    .line 105
    .line 106
    const-string v48, "language"

    .line 107
    .line 108
    const-string v49, "is_familiar_waterfall"

    .line 109
    .line 110
    const-string v50, "need_whale_async"

    .line 111
    .line 112
    const-string v51, "is_24_story"

    .line 113
    .line 114
    const-string v52, "is_25_story"

    .line 115
    .line 116
    const-string v53, "aweme_type"

    .line 117
    .line 118
    const-string v54, "rhap_retriever_names"

    .line 119
    .line 120
    const-string v55, "merge_service_id"

    .line 121
    .line 122
    const-string v56, "insert_merge_ids"

    .line 123
    .line 124
    const-string v57, "product_id"

    .line 125
    .line 126
    const-string v58, "common_flags"

    .line 127
    .line 128
    const-string v59, "common_data"

    .line 129
    .line 130
    filled-new-array/range {v1 .. v61}, [Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->loadMoreParamNames:Ljava/util/List;

    .line 139
    .line 140
    new-instance v0, Ljava/util/HashSet;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->hookedProxyMethods:Ljava/util/Set;

    .line 150
    .line 151
    new-instance v0, Ljava/util/HashSet;

    .line 152
    .line 153
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->captureHookedLoaders:Ljava/util/Set;

    .line 161
    .line 162
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;

    .line 163
    .line 164
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;-><init>()V

    .line 165
    .line 166
    .line 167
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;

    .line 168
    .line 169
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 170
    .line 171
    const/4 v5, 0x0

    .line 172
    const/4 v6, 0x0

    .line 173
    const-string v2, "official_unknown_scene_no_group"

    .line 174
    .line 175
    const/4 v3, 0x1

    .line 176
    const/4 v4, 0x1

    .line 177
    invoke-direct/range {v1 .. v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 178
    .line 179
    .line 180
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 181
    .line 182
    const/4 v6, 0x0

    .line 183
    const/4 v7, 0x1

    .line 184
    const-string v3, "official_unknown_scene_with_group"

    .line 185
    .line 186
    const/4 v5, 0x1

    .line 187
    invoke-direct/range {v2 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 188
    .line 189
    .line 190
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 191
    .line 192
    const-string v7, "96_96"

    .line 193
    .line 194
    const/4 v8, 0x0

    .line 195
    const-string v4, "official_zero_scene_no_group"

    .line 196
    .line 197
    const/4 v5, 0x0

    .line 198
    const/4 v6, 0x0

    .line 199
    invoke-direct/range {v3 .. v8}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 200
    .line 201
    .line 202
    new-instance v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 203
    .line 204
    const-string v8, "96_96"

    .line 205
    .line 206
    const/4 v9, 0x1

    .line 207
    const-string v5, "official_zero_scene_with_group"

    .line 208
    .line 209
    const/4 v7, 0x0

    .line 210
    invoke-direct/range {v4 .. v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 211
    .line 212
    .line 213
    filled-new-array {v1, v2, v3, v4}, [Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->officialFallbackModes:Ljava/util/List;

    .line 222
    .line 223
    const/16 v0, 0x8

    .line 224
    .line 225
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->$stable:I

    .line 226
    .line 227
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
    sget-wide v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->lastCaptureLogAt:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getLoadMoreParamNames$p()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->loadMoreParamNames:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSelfInvoking$p()Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setCapturedProfile$p(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLastCaptureLogAt$p(J)V
    .locals 0

    .line 1
    sput-wide p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->lastCaptureLogAt:J

    .line 2
    .line 3
    return-void
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
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;",
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
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;->getArgs()Ljava/util/List;

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
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;->getTimestamp()J

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
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;

    .line 42
    .line 43
    const-string v3, "captured_host_profile"

    .line 44
    .line 45
    invoke-direct {p0, p1, p2, v1, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->buildArgsFromCapturedProfile(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v2, v3, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->officialFallbackModes:Ljava/util/List;

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
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 72
    .line 73
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 80
    .line 81
    invoke-direct {v4, p1, p2, p3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->buildArgsByOfficialSignature(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {v2, v3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

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
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v1, Lgh;

    .line 124
    .line 125
    const/16 v2, 0x1a

    .line 126
    .line 127
    invoke-direct {v1, v2}, Lgh;-><init>(I)V

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

.method private static final buildArgPlans$lambda$18$lambda$17(Ljava/lang/Object;)Ljava/lang/CharSequence;
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

.method private final buildArgsByOfficialSignature(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;)[Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;",
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
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->getIncludeGroupId()Z

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
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->getUserAvatarShrink()Ljava/lang/String;

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
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->getUnknownChannelAsMinusOne()Z

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
    invoke-virtual {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->getAccessAsNull()Z

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

.method private final buildArgsFromCapturedProfile(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)[Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;",
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
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;->getArgs()Ljava/util/List;

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

.method private final installProxyCaptureHook(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 10

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
    move v2, v1

    .line 23
    :goto_0
    if-ge v2, v0, :cond_1

    .line 24
    .line 25
    aget-object v3, p2, v2

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
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v3, 0x0

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
    move-result v2

    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object v3, v2

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
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
    move p2, v1

    .line 113
    move v0, p2

    .line 114
    move v2, v0

    .line 115
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    const-string v4, "r20776a48cef66734"

    .line 120
    .line 121
    if-eqz v3, :cond_8

    .line 122
    .line 123
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, Ljava/lang/reflect/Method;

    .line 128
    .line 129
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 130
    .line 131
    invoke-virtual {v5, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->hookedProxyMethods:Ljava/util/Set;

    .line 136
    .line 137
    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-nez v7, :cond_5

    .line 142
    .line 143
    add-int/lit8 v0, v0, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_5
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_6

    .line 155
    .line 156
    add-int/lit8 p2, p2, 0x1

    .line 157
    .line 158
    invoke-interface {v6, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 163
    .line 164
    const/4 v7, 0x1

    .line 165
    :try_start_0
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 166
    .line 167
    .line 168
    sget-object v7, Lxq0;->α:Lxq0;

    .line 169
    .line 170
    new-instance v8, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;

    .line 171
    .line 172
    invoke-direct {v8, p1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;-><init>(Ljava/lang/reflect/Method;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v3, v8}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 176
    .line 177
    .line 178
    add-int/lit8 v3, v1, 0x1

    .line 179
    .line 180
    :try_start_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    goto :goto_5

    .line 185
    :catchall_0
    move-exception v1

    .line 186
    goto :goto_4

    .line 187
    :catchall_1
    move-exception v3

    .line 188
    move-object v9, v3

    .line 189
    move v3, v1

    .line 190
    move-object v1, v9

    .line 191
    :goto_4
    new-instance v6, Leo1;

    .line 192
    .line 193
    invoke-direct {v6, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    move-object v1, v6

    .line 197
    :goto_5
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    if-eqz v1, :cond_7

    .line 202
    .line 203
    add-int/lit8 v2, v2, 0x1

    .line 204
    .line 205
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->hookedProxyMethods:Ljava/util/Set;

    .line 206
    .line 207
    invoke-interface {v6, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    new-instance v6, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v7, "hook loadMore capture failed: "

    .line 213
    .line 214
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-static {v4, v5, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    :cond_7
    move v1, v3

    .line 228
    goto :goto_3

    .line 229
    :cond_8
    if-gtz v1, :cond_9

    .line 230
    .line 231
    if-gtz p2, :cond_9

    .line 232
    .line 233
    if-lez v2, :cond_a

    .line 234
    .line 235
    :cond_9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    const-string v3, "#"

    .line 248
    .line 249
    const-string v5, ", hooked="

    .line 250
    .line 251
    const-string v6, "proxy capture hook summary: target="

    .line 252
    .line 253
    invoke-static {v6, p0, v3, p1, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    const-string p1, ", duplicate="

    .line 258
    .line 259
    const-string v3, ", abstract="

    .line 260
    .line 261
    invoke-static {p0, v1, p1, v0, v3}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string p1, ", failed="

    .line 268
    .line 269
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {v4, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :cond_a
    return-void
.end method

.method private final invokeLoadMore(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;

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
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->selfInvoking:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;

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

.method private static final loadInsertedCommentList$lambda$5(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;
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

.method private final logInvokePlan(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;->getName()Ljava/lang/String;

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
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v3, Lgh;

    .line 33
    .line 34
    const/16 v4, 0x19

    .line 35
    .line 36
    invoke-direct {v3, v4}, Lgh;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const/16 v4, 0x1f

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-static {p1, v5, v5, v3, v4}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v3, ", method="

    .line 47
    .line 48
    const-string v4, "#"

    .line 49
    .line 50
    const-string v6, "invoke loadMore plan="

    .line 51
    .line 52
    invoke-static {v6, p0, v3, v0, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v0, ", return="

    .line 57
    .line 58
    const-string v3, ", paramTypes="

    .line 59
    .line 60
    invoke-static {p0, v1, v0, v2, v3}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const/4 p1, 0x4

    .line 71
    const-string v0, "r20776a48cef66734"

    .line 72
    .line 73
    invoke-static {v0, p0, v5, p1, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    array-length p1, p0

    .line 81
    const/4 p3, 0x0

    .line 82
    move v0, p3

    .line 83
    :goto_0
    if-ge p3, p1, :cond_0

    .line 84
    .line 85
    aget-object v1, p0, p3

    .line 86
    .line 87
    add-int/lit8 v2, v0, 0x1

    .line 88
    .line 89
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 90
    .line 91
    invoke-static {v0, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v3, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->maskArg(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    add-int/lit8 p3, p3, 0x1

    .line 101
    .line 102
    move v0, v2

    .line 103
    goto :goto_0

    .line 104
    :cond_0
    return-void
.end method

.method private static final logInvokePlan$lambda$19(Ljava/lang/Class;)Ljava/lang/CharSequence;
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
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->capturedProfile:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 2
    .line 3
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static synthetic α(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->buildArgPlans$lambda$18$lambda$17(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic β(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->logInvokePlan$lambda$19(Ljava/lang/Class;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic γ(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->loadInsertedCommentList$lambda$5(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final installCaptureHooks(Ljava/lang/ClassLoader;Z)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->captureHookedLoaders:Ljava/util/Set;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveLoadMoreCommentMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const-string v2, "r20776a48cef66734"

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    new-instance p0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string p1, "loadMore capture methods empty, allowDexKitScan="

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const/4 v0, 0x0

    .line 65
    move v1, v0

    .line 66
    move v3, v1

    .line 67
    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/reflect/Method;

    .line 78
    .line 79
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 80
    .line 81
    const/4 v6, 0x1

    .line 82
    :try_start_0
    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 83
    .line 84
    .line 85
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveApiInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    if-nez v6, :cond_3

    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    invoke-direct {v5, v4, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->installProxyCaptureHook(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v5, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catchall_0
    move-exception v5

    .line 112
    new-instance v6, Leo1;

    .line 113
    .line 114
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    move-object v5, v6

    .line 118
    :goto_1
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    if-eqz v5, :cond_2

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    const-string v7, "install capture hook failed for "

    .line 137
    .line 138
    const-string v8, "#"

    .line 139
    .line 140
    invoke-static {v7, v6, v8, v4}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v2, v4, v5}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v3, v3, 0x1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_4
    if-nez v0, :cond_5

    .line 151
    .line 152
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->captureHookedLoaders:Ljava/util/Set;

    .line 153
    .line 154
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-interface {p2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    const-string p1, ", apiResolved="

    .line 166
    .line 167
    const-string p2, ", apiMissing="

    .line 168
    .line 169
    const-string v4, "loadMore capture hooks installed: resolved="

    .line 170
    .line 171
    invoke-static {v4, p0, p1, v0, p2}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string p1, ", failed="

    .line 179
    .line 180
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
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

.method public final loadInsertedCommentList(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, ", response="

    .line 6
    .line 7
    const-string v3, "#"

    .line 8
    .line 9
    const-string v4, ", method="

    .line 10
    .line 11
    const-string v5, ", plan="

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v6, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    invoke-virtual {v6, v1, v7}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveLoadMoreCommentMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    new-instance v8, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-eqz v9, :cond_1

    .line 40
    .line 41
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    move-object v10, v9

    .line 46
    check-cast v10, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    const-string v11, "fetchCommentListV2Stream"

    .line 53
    .line 54
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-nez v10, :cond_0

    .line 59
    .line 60
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    new-instance v13, Lgh;

    .line 69
    .line 70
    const/16 v9, 0x1b

    .line 71
    .line 72
    invoke-direct {v13, v9}, Lgh;-><init>(I)V

    .line 73
    .line 74
    .line 75
    const/16 v14, 0x17

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    const/16 v12, 0x8

    .line 81
    .line 82
    invoke-static/range {v8 .. v14}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    new-instance v10, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v11, "loadInsertedCommentList methods="

    .line 89
    .line 90
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v6, ", "

    .line 97
    .line 98
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    const-string v9, "r20776a48cef66734"

    .line 109
    .line 110
    const/4 v10, 0x0

    .line 111
    const/4 v11, 0x4

    .line 112
    invoke-static {v9, v6, v10, v11, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-nez v6, :cond_a

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    invoke-virtual {v0, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->installCaptureHooks(Ljava/lang/ClassLoader;Z)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, v8}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->sortMethodsByCapturedProfile(Ljava/util/List;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    move-object v0, v10

    .line 134
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-eqz v6, :cond_8

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    check-cast v6, Ljava/lang/reflect/Method;

    .line 145
    .line 146
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 147
    .line 148
    .line 149
    sget-object v8, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8, v12}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveApiInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    if-nez v12, :cond_3

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    const-string v8, "resolveApiInstance failed for "

    .line 173
    .line 174
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-static {v9, v6, v10, v11, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    move-object/from16 v14, p2

    .line 182
    .line 183
    :cond_2
    move-object/from16 p1, v1

    .line 184
    .line 185
    goto/16 :goto_9

    .line 186
    .line 187
    :cond_3
    sget-object v13, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->loadMoreParamNames:Ljava/util/List;

    .line 188
    .line 189
    invoke-virtual {v8, v6, v13}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveParamNames(Ljava/lang/reflect/Method;Ljava/util/List;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    sget-object v13, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 194
    .line 195
    move-object/from16 v14, p2

    .line 196
    .line 197
    invoke-direct {v13, v6, v8, v14}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->buildArgPlans(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    if-eqz v15, :cond_2

    .line 210
    .line 211
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    check-cast v15, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;

    .line 216
    .line 217
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 218
    .line 219
    invoke-direct {v7, v6, v8, v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->logInvokePlan(Ljava/lang/reflect/Method;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;)V

    .line 220
    .line 221
    .line 222
    :try_start_0
    invoke-virtual {v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;->getArgs()[Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    invoke-direct {v7, v6, v12, v10}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->invokeLoadMore(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    if-nez v7, :cond_4

    .line 231
    .line 232
    move-object/from16 p1, v1

    .line 233
    .line 234
    move-object/from16 v16, v6

    .line 235
    .line 236
    move-object/from16 v17, v8

    .line 237
    .line 238
    goto/16 :goto_8

    .line 239
    .line 240
    :cond_4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 241
    .line 242
    invoke-virtual {v0, v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->awaitNetworkResult(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 247
    .line 248
    invoke-virtual {v14}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    invoke-virtual {v7, v0, v10}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjectById(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    if-eqz v7, :cond_5

    .line 257
    .line 258
    return-object v0

    .line 259
    :cond_5
    invoke-virtual {v14}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    move-object/from16 p0, v0

    .line 276
    .line 277
    invoke-virtual {v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;->getName()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    if-eqz p0, :cond_6

    .line 282
    .line 283
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v16

    .line 287
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    move-object/from16 p1, v1

    .line 292
    .line 293
    move-object/from16 v1, v16

    .line 294
    .line 295
    :goto_3
    move-object/from16 v16, v6

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :catchall_0
    move-exception v0

    .line 299
    move-object/from16 p1, v1

    .line 300
    .line 301
    move-object/from16 v16, v6

    .line 302
    .line 303
    :goto_4
    move-object/from16 v17, v8

    .line 304
    .line 305
    goto/16 :goto_7

    .line 306
    .line 307
    :cond_6
    move-object/from16 p1, v1

    .line 308
    .line 309
    const/4 v1, 0x0

    .line 310
    goto :goto_3

    .line 311
    :goto_5
    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 314
    .line 315
    .line 316
    move-object/from16 v17, v8

    .line 317
    .line 318
    :try_start_2
    const-string v8, "comment not found in this response, continue fallback, cid="

    .line 319
    .line 320
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const/4 v1, 0x4

    .line 355
    const/4 v6, 0x0

    .line 356
    invoke-static {v9, v0, v6, v1, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 360
    .line 361
    invoke-virtual {v14}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    invoke-virtual {v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;->getName()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    if-eqz p0, :cond_7

    .line 374
    .line 375
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v11

    .line 383
    goto :goto_6

    .line 384
    :catchall_1
    move-exception v0

    .line 385
    goto :goto_7

    .line 386
    :cond_7
    move-object v11, v6

    .line 387
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const-string v6, "comment not found in response, cid="

    .line 393
    .line 394
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 423
    .line 424
    .line 425
    goto :goto_8

    .line 426
    :catchall_2
    move-exception v0

    .line 427
    goto :goto_4

    .line 428
    :goto_7
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    invoke-virtual {v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$ArgPlan;->getName()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    const-string v8, "loadMore failed, method="

    .line 445
    .line 446
    invoke-static {v8, v1, v3, v6, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-static {v9, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 458
    .line 459
    .line 460
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 461
    .line 462
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isInvalidParamServerError(Ljava/lang/Throwable;)Z

    .line 463
    .line 464
    .line 465
    :goto_8
    move-object/from16 v1, p1

    .line 466
    .line 467
    move-object/from16 v6, v16

    .line 468
    .line 469
    move-object/from16 v8, v17

    .line 470
    .line 471
    const/4 v7, 0x1

    .line 472
    const/4 v10, 0x0

    .line 473
    const/4 v11, 0x4

    .line 474
    goto/16 :goto_2

    .line 475
    .line 476
    :goto_9
    move-object/from16 v1, p1

    .line 477
    .line 478
    const/4 v7, 0x1

    .line 479
    const/4 v10, 0x0

    .line 480
    const/4 v11, 0x4

    .line 481
    goto/16 :goto_1

    .line 482
    .line 483
    :cond_8
    if-nez v0, :cond_9

    .line 484
    .line 485
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 486
    .line 487
    const-string v1, "loadMoreComments failed"

    .line 488
    .line 489
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    :cond_9
    throw v0

    .line 493
    :cond_a
    const-string v0, "comment list api method not found"

    .line 494
    .line 495
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    const/4 v0, 0x0

    .line 499
    return-object v0
.end method
